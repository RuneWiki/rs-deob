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
public class client extends class38 {

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field153 = 50;

    @OriginalMember(owner = "client", name = "P", descriptor = "[I")
    private int[] field154 = new int[this.field153];

    @OriginalMember(owner = "client", name = "Q", descriptor = "[I")
    private int[] field155 = new int[this.field153];

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    private int[] field156 = new int[this.field153];

    @OriginalMember(owner = "client", name = "S", descriptor = "[I")
    private int[] field157 = new int[this.field153];

    @OriginalMember(owner = "client", name = "T", descriptor = "[I")
    private int[] field158 = new int[this.field153];

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field159 = new int[this.field153];

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field160 = new int[this.field153];

    @OriginalMember(owner = "client", name = "W", descriptor = "[Ljava/lang/String;")
    private String[] field161 = new String[this.field153];

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field163 = 2;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field164 = -1;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field166 = 162;

    @OriginalMember(owner = "client", name = "eb", descriptor = "[LGINAMIRO;")
    public class18[] field169 = new class18[5];

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    public int[] field171 = new int[1000];

    @OriginalMember(owner = "client", name = "hb", descriptor = "B")
    private byte field172 = 104;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field178 = -1;

    @OriginalMember(owner = "client", name = "sb", descriptor = "Z")
    private boolean field183 = true;

    @OriginalMember(owner = "client", name = "ub", descriptor = "Z")
    public boolean field185 = true;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Z")
    private volatile boolean field186 = false;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field192 = -1;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "[I")
    private int[] field193 = new int[5];

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field196 = 4;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field198 = 1;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field200 = 23626;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[J")
    private long[] field201 = new long[100];

    @OriginalMember(owner = "client", name = "Lb", descriptor = "B")
    private byte field202 = 3;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field207 = 78;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "LJQOEJEDB;")
    private class25 field216 = new class25(3);

    @OriginalMember(owner = "client", name = "ac", descriptor = "Z")
    private boolean field217 = false;

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private int[] field219 = new int[256];

    @OriginalMember(owner = "client", name = "ec", descriptor = "Ljava/lang/String;")
    private String field221 = "";

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    public boolean field222 = false;

    @OriginalMember(owner = "client", name = "hc", descriptor = "[[I")
    private int[][] field224 = new int[104][104];

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field228 = new int[151];

    @OriginalMember(owner = "client", name = "mc", descriptor = "Z")
    private boolean field229 = true;

    @OriginalMember(owner = "client", name = "pc", descriptor = "[LGLPEJJEY;")
    private class19[] field232 = new class19[13];

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field237 = -744;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Z")
    private boolean field238 = false;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Z")
    private boolean field241 = false;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Z")
    private boolean field246 = false;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "B")
    private byte field260 = 1;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "Z")
    private boolean field261 = false;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[LTNNDDWAZ;")
    private class57[] field267 = new class57[20];

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field268 = -1;

    @OriginalMember(owner = "client", name = "ed", descriptor = "[I")
    private int[] field273 = new int[500];

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field274 = new int[500];

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field275 = new int[500];

    @OriginalMember(owner = "client", name = "hd", descriptor = "[I")
    private int[] field276 = new int[500];

    @OriginalMember(owner = "client", name = "jd", descriptor = "[[I")
    private int[][] field278 = new int[104][104];

    @OriginalMember(owner = "client", name = "pd", descriptor = "Z")
    private boolean field284 = true;

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    public int[] field286 = new int[2000];

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field288 = -1;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Ljava/lang/String;")
    private String field289 = "";

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field290 = new int[5];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field298 = -1;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field299 = -1;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "B")
    private byte field300 = 105;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[I")
    private int[] field305 = new int[class62.field1599];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field308 = new int[7];

    @OriginalMember(owner = "client", name = "Od", descriptor = "[[[LJQOEJEDB;")
    private class25[][][] field309 = new class25[4][104][104];

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field311 = new int[50];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Ljava/lang/String;")
    private String field312 = "";

    @OriginalMember(owner = "client", name = "Sd", descriptor = "Ljava/lang/String;")
    private String field313 = "";

    @OriginalMember(owner = "client", name = "Td", descriptor = "[Ljava/lang/String;")
    private String[] field314 = new String[500];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field318 = 6;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field320 = 738;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Z")
    private boolean field321 = false;

    @OriginalMember(owner = "client", name = "ce", descriptor = "[LTNNDDWAZ;")
    private class57[] field323 = new class57[8];

    @OriginalMember(owner = "client", name = "fe", descriptor = "Ljava/lang/String;")
    private String field326 = "";

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field327 = 9;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field328 = 3353893;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field329 = 2301979;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private final int field330 = 100;

    @OriginalMember(owner = "client", name = "ke", descriptor = "[I")
    private int[] field331 = new int[100];

    @OriginalMember(owner = "client", name = "le", descriptor = "Z")
    private boolean field332 = true;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field333 = 3;

    @OriginalMember(owner = "client", name = "ne", descriptor = "LKHOMSBHW;")
    private class30 field334 = class30.method337(-999, 1);

    @OriginalMember(owner = "client", name = "oe", descriptor = "[Z")
    private boolean[] field335 = new boolean[5];

    @OriginalMember(owner = "client", name = "pe", descriptor = "Z")
    private boolean field336 = true;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field344 = -1;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field345 = -1;

    @OriginalMember(owner = "client", name = "ze", descriptor = "[I")
    private int[] field346 = new int[100];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[Ljava/lang/String;")
    private String[] field347 = new String[100];

    @OriginalMember(owner = "client", name = "Be", descriptor = "[Ljava/lang/String;")
    private String[] field348 = new String[100];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[I")
    private int[] field349 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field350 = 7;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Z")
    private boolean field351 = false;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field352 = 349;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[I")
    private int[] field353 = new int[33];

    @OriginalMember(owner = "client", name = "Me", descriptor = "LJQOEJEDB;")
    private class25 field359 = new class25(3);

    @OriginalMember(owner = "client", name = "Ne", descriptor = "[I")
    private int[] field360 = new int[5];

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field361 = -1;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Z")
    private boolean field362 = false;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "LJQOEJEDB;")
    private class25 field367 = new class25(3);

    @OriginalMember(owner = "client", name = "Ye", descriptor = "Z")
    private boolean field371 = false;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Ljava/lang/String;")
    private String field372 = "";

    @OriginalMember(owner = "client", name = "df", descriptor = "Z")
    private boolean field376 = false;

    @OriginalMember(owner = "client", name = "jf", descriptor = "[I")
    private int[] field381 = new int[5];

    @OriginalMember(owner = "client", name = "tf", descriptor = "Z")
    private boolean field391 = false;

    @OriginalMember(owner = "client", name = "vf", descriptor = "[[I")
    private int[][] field393 = new int[104][104];

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field408 = 2;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Ljava/lang/String;")
    private String field409 = "";

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Ljava/lang/String;")
    private String field410 = "";

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field411 = 2048;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field412 = 2047;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[LYNSPIQRH;")
    private class69[] field413 = new class69[this.field411];

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[I")
    public int[] field415 = new int[this.field411];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    private int[] field417 = new int[this.field411];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[LKHOMSBHW;")
    private class30[] field418 = new class30[this.field411];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[I")
    private int[] field419 = new int[class62.field1599];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Z")
    private boolean field421 = false;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    private volatile boolean field427 = false;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field430 = 2;

    @OriginalMember(owner = "client", name = "hg", descriptor = "LKHOMSBHW;")
    private class30 field431 = class30.method337(-999, 1);

    @OriginalMember(owner = "client", name = "kg", descriptor = "B")
    private byte field434 = 1;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Z")
    private boolean field435 = true;

    @OriginalMember(owner = "client", name = "mg", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field436 = new CRC32();

    @OriginalMember(owner = "client", name = "pg", descriptor = "Z")
    private boolean field439 = false;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Z")
    private boolean field444 = true;

    @OriginalMember(owner = "client", name = "wg", descriptor = "[I")
    private int[] field446 = new int[50];

    @OriginalMember(owner = "client", name = "xg", descriptor = "[I")
    private int[] field447 = new int[5];

    @OriginalMember(owner = "client", name = "yg", descriptor = "Z")
    private volatile boolean field448 = false;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field449 = -1;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[I")
    private int[] field451 = new int[50];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Ljava/lang/String;")
    private String field452 = "";

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field453 = new int[4000];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[I")
    private int[] field454 = new int[4000];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field455 = -1;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[LDFJABDHX;")
    private class5[] field456 = new class5[4];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "[I")
    private int[] field461 = new int[33];

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field465 = 128;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[LGLPEJJEY;")
    private class19[] field469 = new class19[100];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field470 = -846;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[Ljava/lang/String;")
    private String[] field475 = new String[5];

    @OriginalMember(owner = "client", name = "ah", descriptor = "[Z")
    private boolean[] field476 = new boolean[5];

    @OriginalMember(owner = "client", name = "dh", descriptor = "LKHOMSBHW;")
    private class30 field479 = new class30(new byte[5000], -982);

    @OriginalMember(owner = "client", name = "eh", descriptor = "[LFJJCITCO;")
    private class13[] field480 = new class13[16384];

    @OriginalMember(owner = "client", name = "gh", descriptor = "[I")
    public int[] field482 = new int[16384];

    @OriginalMember(owner = "client", name = "hh", descriptor = "[J")
    private long[] field483 = new long[200];

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field492 = -662;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[Ljava/lang/String;")
    private String[] field494 = new String[200];

    @OriginalMember(owner = "client", name = "vh", descriptor = "[I")
    private final int[] field497 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field499 = 5063219;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[B")
    private byte[] field505 = new byte[16384];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "Z")
    private boolean field510 = false;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[I")
    private int[] field512 = new int[1000];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[I")
    private int[] field513 = new int[1000];

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field514 = -43;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private boolean field521 = false;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "LAMSZZFWC;")
    private class2 field526 = new class2();

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Z")
    private boolean field527 = false;

    @OriginalMember(owner = "client", name = "bi", descriptor = "[I")
    private int[] field529 = new int[151];

    @OriginalMember(owner = "client", name = "ci", descriptor = "Z")
    private boolean field530 = false;

    @OriginalMember(owner = "client", name = "di", descriptor = "[I")
    private int[] field531 = new int[9];

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field532 = -1;

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field535 = false;

    @OriginalMember(owner = "client", name = "ri", descriptor = "Z")
    private boolean field545 = false;

    @OriginalMember(owner = "client", name = "si", descriptor = "[LTNNDDWAZ;")
    private class57[] field546 = new class57[20];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[I")
    private int[] field555 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field556 = 7759444;

    @OriginalMember(owner = "client", name = "Di", descriptor = "Z")
    private boolean field557 = false;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field561 = -35;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field569 = -573;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "LKHOMSBHW;")
    private class30 field571 = class30.method337(-999, 1);

    @OriginalMember(owner = "client", name = "Si", descriptor = "Z")
    private boolean field572 = false;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field579 = 6;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Z")
    private boolean field580 = false;

    @OriginalMember(owner = "client", name = "bj", descriptor = "[I")
    private int[] field581 = new int[2000];

    @OriginalMember(owner = "client", name = "cj", descriptor = "[[[I")
    private int[][][] field582 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "dj", descriptor = "[I")
    private int[] field583 = new int[200];

    @OriginalMember(owner = "client", name = "ej", descriptor = "Z")
    private boolean field584 = false;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Z")
    private boolean field587 = false;

    @OriginalMember(owner = "client", name = "lj", descriptor = "[I")
    private int[] field591 = new int[class62.field1599];

    @OriginalMember(owner = "client", name = "nj", descriptor = "Z")
    private boolean field593 = true;

    @OriginalMember(owner = "client", name = "oj", descriptor = "[LTNNDDWAZ;")
    private class57[] field594 = new class57[1000];

    @OriginalMember(owner = "client", name = "pj", descriptor = "Z")
    private boolean field595 = false;

    @OriginalMember(owner = "client", name = "qj", descriptor = "[LTNNDDWAZ;")
    private class57[] field596 = new class57[100];

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field597 = -988;

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    private boolean field601 = false;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field610 = 1;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "Z")
    private boolean field613 = false;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "[LGLPEJJEY;")
    private class19[] field616 = new class19[2];

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field617 = 162;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field618 = -1;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field203 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "kc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field227 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private static int field231 = 7;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private static int field291 = -617;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private static int field363 = 10;

    @OriginalMember(owner = "client", name = "Se", descriptor = "Z")
    private static boolean field365 = true;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Ljava/lang/String;")
    private static String field420 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "ai", descriptor = "[I")
    public static int[] field528 = new int[32];

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private static int[] field536;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[[I")
    public static final int[][] field570;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[I")
    public static final int[] field575;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private static int field168;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private static int field208;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private static int field215;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private static int field368;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private static int field392;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private static int field406;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private static int field428;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private static int field433;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private static int field477;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private static int field501;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private static int field520;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private static int field548;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private static int field549;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private static int field585;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private static int field586;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private static int field603;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private static int field611;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private static int field612;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client", name = "pb", descriptor = "J")
    public long field180;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "J")
    private long field206;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "J")
    private long field306;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "J")
    private long field357;

    @OriginalMember(owner = "client", name = "wf", descriptor = "J")
    private long field394;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "LEXARMWSO;")
    private class11 field457;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "LEXARMWSO;")
    private class11 field458;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "LEXARMWSO;")
    private class11 field459;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "LEXARMWSO;")
    private class11 field460;

    @OriginalMember(owner = "client", name = "ic", descriptor = "LGLPEJJEY;")
    private class19 field225;

    @OriginalMember(owner = "client", name = "jc", descriptor = "LGLPEJJEY;")
    private class19 field226;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "LGLPEJJEY;")
    private class19 field250;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "LGLPEJJEY;")
    private class19 field251;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "LGLPEJJEY;")
    private class19 field252;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "LGLPEJJEY;")
    private class19 field253;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "LGLPEJJEY;")
    private class19 field254;

    @OriginalMember(owner = "client", name = "bd", descriptor = "LGLPEJJEY;")
    private class19 field270;

    @OriginalMember(owner = "client", name = "cd", descriptor = "LGLPEJJEY;")
    private class19 field271;

    @OriginalMember(owner = "client", name = "dd", descriptor = "LGLPEJJEY;")
    private class19 field272;

    @OriginalMember(owner = "client", name = "af", descriptor = "LGLPEJJEY;")
    private class19 field373;

    @OriginalMember(owner = "client", name = "bf", descriptor = "LGLPEJJEY;")
    private class19 field374;

    @OriginalMember(owner = "client", name = "cf", descriptor = "LGLPEJJEY;")
    private class19 field375;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "LGLPEJJEY;")
    private class19 field422;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "LGLPEJJEY;")
    private class19 field423;

    @OriginalMember(owner = "client", name = "ag", descriptor = "LGLPEJJEY;")
    private class19 field424;

    @OriginalMember(owner = "client", name = "bg", descriptor = "LGLPEJJEY;")
    private class19 field425;

    @OriginalMember(owner = "client", name = "cg", descriptor = "LGLPEJJEY;")
    private class19 field426;

    @OriginalMember(owner = "client", name = "jj", descriptor = "LGLPEJJEY;")
    private class19 field589;

    @OriginalMember(owner = "client", name = "kj", descriptor = "LGLPEJJEY;")
    private class19 field590;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "LHAMMMZGY;")
    public class20 field249;

    @OriginalMember(owner = "client", name = "gc", descriptor = "LKVLMMBSC;")
    private class33 field223;

    @OriginalMember(owner = "client", name = "qc", descriptor = "LPFNLOREN;")
    private class42 field233;

    @OriginalMember(owner = "client", name = "rc", descriptor = "LPFNLOREN;")
    private class42 field234;

    @OriginalMember(owner = "client", name = "sc", descriptor = "LPFNLOREN;")
    private class42 field235;

    @OriginalMember(owner = "client", name = "kf", descriptor = "LPFNLOREN;")
    private class42 field382;

    @OriginalMember(owner = "client", name = "lf", descriptor = "LPFNLOREN;")
    private class42 field383;

    @OriginalMember(owner = "client", name = "mf", descriptor = "LPFNLOREN;")
    private class42 field384;

    @OriginalMember(owner = "client", name = "nf", descriptor = "LPFNLOREN;")
    private class42 field385;

    @OriginalMember(owner = "client", name = "of", descriptor = "LPFNLOREN;")
    private class42 field386;

    @OriginalMember(owner = "client", name = "pf", descriptor = "LPFNLOREN;")
    private class42 field387;

    @OriginalMember(owner = "client", name = "qf", descriptor = "LPFNLOREN;")
    private class42 field388;

    @OriginalMember(owner = "client", name = "rf", descriptor = "LPFNLOREN;")
    private class42 field389;

    @OriginalMember(owner = "client", name = "sf", descriptor = "LPFNLOREN;")
    private class42 field390;

    @OriginalMember(owner = "client", name = "xf", descriptor = "LPFNLOREN;")
    private class42 field395;

    @OriginalMember(owner = "client", name = "yf", descriptor = "LPFNLOREN;")
    private class42 field396;

    @OriginalMember(owner = "client", name = "zf", descriptor = "LPFNLOREN;")
    private class42 field397;

    @OriginalMember(owner = "client", name = "Af", descriptor = "LPFNLOREN;")
    private class42 field398;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "LPFNLOREN;")
    private class42 field399;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "LPFNLOREN;")
    private class42 field400;

    @OriginalMember(owner = "client", name = "Df", descriptor = "LPFNLOREN;")
    private class42 field401;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LPFNLOREN;")
    private class42 field402;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "LPFNLOREN;")
    private class42 field403;

    @OriginalMember(owner = "client", name = "qg", descriptor = "LPFNLOREN;")
    private class42 field440;

    @OriginalMember(owner = "client", name = "rg", descriptor = "LPFNLOREN;")
    private class42 field441;

    @OriginalMember(owner = "client", name = "sg", descriptor = "LPFNLOREN;")
    private class42 field442;

    @OriginalMember(owner = "client", name = "tg", descriptor = "LPFNLOREN;")
    private class42 field443;

    @OriginalMember(owner = "client", name = "We", descriptor = "LBGNYQYNO;")
    private class4 field369;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "LSCSPFXGB;")
    private class53 field619;

    @OriginalMember(owner = "client", name = "tc", descriptor = "LSSXXGGTR;")
    private class54 field236;

    @OriginalMember(owner = "client", name = "ab", descriptor = "LSYUGXMZF;")
    private class55 field165;

    @OriginalMember(owner = "client", name = "zb", descriptor = "LTNNDDWAZ;")
    private class57 field190;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "LTNNDDWAZ;")
    private class57 field191;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LTNNDDWAZ;")
    private class57 field244;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "LTNNDDWAZ;")
    private class57 field522;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "LTNNDDWAZ;")
    private class57 field523;

    @OriginalMember(owner = "client", name = "qi", descriptor = "LTNNDDWAZ;")
    private class57 field544;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "LTNNDDWAZ;")
    private class57 field564;

    @OriginalMember(owner = "client", name = "Li", descriptor = "LTNNDDWAZ;")
    private class57 field565;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "LTNNDDWAZ;")
    private class57 field566;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "LTNNDDWAZ;")
    private class57 field567;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "LTNNDDWAZ;")
    private class57 field568;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "LTNNDDWAZ;")
    private class57 field577;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "LTNNDDWAZ;")
    private class57 field607;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "LTNNDDWAZ;")
    private class57 field608;

    @OriginalMember(owner = "client", name = "qd", descriptor = "LYNSPIQRH;")
    public static class69 field285;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Ljava/lang/String;")
    public String field177;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Ljava/lang/String;")
    public String field304;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Ljava/lang/String;")
    private String field307;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Ljava/lang/String;")
    private String field578;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Ljava/net/Socket;")
    private Socket field562;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Z")
    public static boolean field199;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Z")
    private static boolean field366;

    @OriginalMember(owner = "client", name = "ig", descriptor = "Z")
    private static boolean field432;

    @OriginalMember(owner = "client", name = "vg", descriptor = "Z")
    public static boolean field445;

    @OriginalMember(owner = "client", name = "ti", descriptor = "Z")
    private static boolean field547;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field315;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    private int[] field316;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[I")
    private int[] field317;

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field354;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field355;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private int[] field356;

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field377;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[I")
    private int[] field515;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "[I")
    private int[] field516;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "[I")
    private int[] field517;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[I")
    private int[] field518;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[I")
    private int[] field558;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field559;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[LGLPEJJEY;")
    private class19[] field503;

    @OriginalMember(owner = "client", name = "be", descriptor = "[[B")
    private byte[][] field322;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[[B")
    private byte[][] field463;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[[[B")
    private byte[][][] field450;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[[[I")
    private int[][][] field405;

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (this.field259 > 0) {
            this.method185(this.field172);
        } else {
            this.field442.method465(false);
            this.field458.method248(1, 144, "Connection lost", 257, 0);
            this.field458.method248(1, 143, "Connection lost", 256, 16777215);
            this.field458.method248(1, 159, "Please wait - attempting to reestablish", 257, 0);
            this.field458.method248(1, 158, "Please wait - attempting to reestablish", 256, 16777215);
            this.field442.method466(2, super.field1175, 4, 4);
            this.field310 = 0;
            this.field242 = 0;
            this.field222 &= arg0;
            class33 var2 = this.field223;
            this.field222 = false;
            this.field292 = 0;
            this.method179(this.field312, this.field313, true);
            if (!this.field222) {
                this.method185(this.field172);
            }
            try {
                var2.method398();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method67(boolean arg0) {
        if (this.field173 == 0 && this.field301 == 0) {
            this.field314[this.field524] = "Walk here";
            this.field275[this.field524] = 451;
            this.field273[this.field524] = super.field1183;
            this.field274[this.field524] = super.field1184;
            ++this.field524;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class17.field873; ++var3) {
            int var4 = class17.field874[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field369.method45(this.field358, var5, var6, var4) >= 0) {
                    class50 var9 = class50.method512(var8);
                    if (var9.field1352 != null) {
                        var9 = var9.method510(-45828);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field173 == 1) {
                        this.field314[this.field524] = "Use " + this.field177 + " with @cya@" + var9.field1339;
                        this.field275[this.field524] = 910;
                        this.field276[this.field524] = var4;
                        this.field273[this.field524] = var5;
                        this.field274[this.field524] = var6;
                        ++this.field524;
                    } else if (this.field301 == 1) {
                        if ((this.field303 & 4) == 4) {
                            this.field314[this.field524] = this.field304 + " @cya@" + var9.field1339;
                            this.field275[this.field524] = 475;
                            this.field276[this.field524] = var4;
                            this.field273[this.field524] = var5;
                            this.field274[this.field524] = var6;
                            ++this.field524;
                        }
                    } else {
                        if (var9.field1334 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1334[var10] != null) {
                                    this.field314[this.field524] = var9.field1334[var10] + " @cya@" + var9.field1339;
                                    if (var10 == 0) {
                                        this.field275[this.field524] = 988;
                                    }
                                    if (var10 == 1) {
                                        this.field275[this.field524] = 341;
                                    }
                                    if (var10 == 2) {
                                        this.field275[this.field524] = 350;
                                    }
                                    if (var10 == 3) {
                                        this.field275[this.field524] = 648;
                                    }
                                    if (var10 == 4) {
                                        this.field275[this.field524] = 1736;
                                    }
                                    this.field276[this.field524] = var4;
                                    this.field273[this.field524] = var5;
                                    this.field274[this.field524] = var6;
                                    ++this.field524;
                                }
                            }
                        }
                        this.field314[this.field524] = "Examine @cya@" + var9.field1339;
                        this.field275[this.field524] = 1720;
                        this.field276[this.field524] = var9.field1325 << 14;
                        this.field273[this.field524] = var5;
                        this.field274[this.field524] = var6;
                        ++this.field524;
                    }
                }
                if (var7 == 1) {
                    class13 var11 = this.field480[var8];
                    if (var11.field736.field1508 == 1 && (var11.field1539 & 127) == 64 && (var11.field1540 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field481; ++var12) {
                            class13 var15 = this.field480[this.field482[var12]];
                            if (var15 != null && var11 != var15 && var15.field736.field1508 == 1 && var11.field1539 == var15.field1539 && var11.field1540 == var15.field1540) {
                                this.method172(var6, this.field482[var12], var5, var15.field736, true);
                            }
                        }
                        for (int var13 = 0; var13 < this.field414; ++var13) {
                            class69 var14 = this.field413[this.field415[var13]];
                            if (var14 != null && var11.field1539 == var14.field1539 && var11.field1540 == var14.field1540) {
                                this.method127((byte) 0, var6, this.field415[var13], var14, var5);
                            }
                        }
                    }
                    this.method172(var6, var8, var5, var11.field736, true);
                }
                if (var7 == 0) {
                    class69 var16 = this.field413[var8];
                    if ((var16.field1539 & 127) == 64 && (var16.field1540 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field481; ++var17) {
                            class13 var20 = this.field480[this.field482[var17]];
                            if (var20 != null && var20.field736.field1508 == 1 && var16.field1539 == var20.field1539 && var16.field1540 == var20.field1540) {
                                this.method172(var6, this.field482[var17], var5, var20.field736, true);
                            }
                        }
                        for (int var18 = 0; var18 < this.field414; ++var18) {
                            class69 var19 = this.field413[this.field415[var18]];
                            if (var19 != null && var16 != var19 && var16.field1539 == var19.field1539 && var16.field1540 == var19.field1540) {
                                this.method127((byte) 0, var6, this.field415[var18], var19, var5);
                            }
                        }
                    }
                    this.method127((byte) 0, var6, var8, var16, var5);
                }
                if (var7 == 3) {
                    class25 var21 = this.field309[this.field358][var5][var6];
                    if (var21 != null) {
                        for (class44 var22 = (class44) var21.method330(8); var22 != null; var22 = (class44) var21.method332(false)) {
                            class15 var23 = class15.method278(var22.field1250);
                            if (this.field173 == 1) {
                                this.field314[this.field524] = "Use " + this.field177 + " with @lre@" + var23.field766;
                                this.field275[this.field524] = 858;
                                this.field276[this.field524] = var22.field1250;
                                this.field273[this.field524] = var5;
                                this.field274[this.field524] = var6;
                                ++this.field524;
                            } else if (this.field301 == 1) {
                                if ((this.field303 & 1) == 1) {
                                    this.field314[this.field524] = this.field304 + " @lre@" + var23.field766;
                                    this.field275[this.field524] = 139;
                                    this.field276[this.field524] = var22.field1250;
                                    this.field273[this.field524] = var5;
                                    this.field274[this.field524] = var6;
                                    ++this.field524;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field767 != null && var23.field767[var24] != null) {
                                        this.field314[this.field524] = var23.field767[var24] + " @lre@" + var23.field766;
                                        if (var24 == 0) {
                                            this.field275[this.field524] = 583;
                                        }
                                        if (var24 == 1) {
                                            this.field275[this.field524] = 261;
                                        }
                                        if (var24 == 2) {
                                            this.field275[this.field524] = 766;
                                        }
                                        if (var24 == 3) {
                                            this.field275[this.field524] = 972;
                                        }
                                        if (var24 == 4) {
                                            this.field275[this.field524] = 971;
                                        }
                                        this.field276[this.field524] = var22.field1250;
                                        this.field273[this.field524] = var5;
                                        this.field274[this.field524] = var6;
                                        ++this.field524;
                                    } else if (var24 == 2) {
                                        this.field314[this.field524] = "Take @lre@" + var23.field766;
                                        this.field275[this.field524] = 766;
                                        this.field276[this.field524] = var22.field1250;
                                        this.field273[this.field524] = var5;
                                        this.field274[this.field524] = var6;
                                        ++this.field524;
                                    }
                                }
                                this.field314[this.field524] = "Examine @lre@" + var23.field766;
                                this.field275[this.field524] = 1015;
                                this.field276[this.field524] = var22.field1250;
                                this.field273[this.field524] = var5;
                                this.field274[this.field524] = var6;
                                ++this.field524;
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            this.field256 = this.field431.method349();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKHOMSBHW;IZ)V")
    private final void method68(class30 arg0, int arg1, boolean arg2) {
        this.field170 = 0;
        this.field416 = 0;
        this.method183(arg0, 41821, arg1);
        this.method148(arg1, 36162, arg0);
        this.method77(arg1, arg0, (byte) 106);
        this.field222 &= arg2;
        for (int var4 = 0; var4 < this.field170; ++var4) {
            int var6 = this.field171[var4];
            if (field464 != this.field480[var6].field1542) {
                this.field480[var6].field736 = null;
                this.field480[var6] = null;
            }
        }
        if (arg0.field1065 != arg1) {
            signlink.reporterror(this.field312 + " size mismatch in getnpcpos - pos:" + arg0.field1065 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field481; ++var5) {
                if (this.field480[this.field482[var5]] == null) {
                    signlink.reporterror(this.field312 + " null entry in npc list - pos:" + var5 + " size:" + this.field481);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method69(boolean arg0) {
        if (!arg0) {
            this.field334.method339(193);
        }
        if (this.field264 == 0) {
            int var2 = super.field1189;
            if (this.field301 == 1 && super.field1190 >= 516 && super.field1191 >= 160 && super.field1190 <= 765 && super.field1191 <= 205) {
                var2 = 0;
            }
            if (this.field246) {
                if (var2 != 1) {
                    int var3 = super.field1183;
                    int var4 = super.field1184;
                    if (this.field484 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field484 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field484 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field485 - 10 || var3 > this.field487 + this.field485 + 10 || var4 < this.field486 - 10 || var4 > this.field488 + this.field486 + 10) {
                        this.field246 = false;
                        if (this.field484 == 1) {
                            this.field521 = true;
                        }
                        if (this.field484 == 2) {
                            this.field530 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field485;
                    int var6 = this.field486;
                    int var7 = this.field487;
                    int var8 = super.field1190;
                    int var9 = super.field1191;
                    if (this.field484 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field484 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field484 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field524; ++var11) {
                        int var12 = (this.field524 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method176(var10, false);
                    }
                    this.field246 = false;
                    if (this.field484 == 1) {
                        this.field521 = true;
                    }
                    if (this.field484 == 2) {
                        this.field530 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field524 > 0) {
                    int var13 = this.field275[this.field524 - 1];
                    if (var13 == 189 || var13 == 454 || var13 == 571 || var13 == 853 || var13 == 246 || var13 == 212 || var13 == 543 || var13 == 506 || var13 == 265 || var13 == 738 || var13 == 567 || var13 == 1717) {
                        int var14 = this.field273[this.field524 - 1];
                        int var15 = this.field274[this.field524 - 1];
                        class2 var16 = class2.field66[var15];
                        if (var16.field64 || var16.field8) {
                            this.field351 = false;
                            this.field205 = 0;
                            this.field262 = var15;
                            this.field263 = var14;
                            this.field264 = 2;
                            this.field265 = super.field1190;
                            this.field266 = super.field1191;
                            if (class2.field66[var15].field7 == this.field345) {
                                this.field264 = 1;
                            }
                            if (class2.field66[var15].field7 == this.field455) {
                                this.field264 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field614 == 1 || this.method85(true, this.field524 - 1)) && this.field524 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field524 > 0) {
                    this.method176(this.field524 - 1, false);
                }
                if (var2 != 2 || this.field524 <= 0) {
                    return;
                }
                this.method95(904);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public final void method70(String arg0, int arg1, byte arg2) {
        this.field287 = arg1;
        this.field578 = arg0;
        this.method86((byte) 94);
        if (this.field165 == null) {
            super.method70(arg0, arg1, (byte) 7);
        } else {
            this.field384.method465(false);
            short var4 = 360;
            short var5 = 200;
            if (arg2 != 7) {
                field547 = !field547;
            }
            byte var6 = 20;
            this.field459.method248(1, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", var4 / 2, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            class39.method421(304, (byte) -22, 34, 9179409, var7, var4 / 2 - 152);
            class39.method421(302, (byte) -22, 32, 0, var7 + 1, var4 / 2 - 151);
            class39.method420(var4 / 2 - 150, (byte) 2, 9179409, 30, arg1 * 3, var7 + 2);
            class39.method420(arg1 * 3 + (var4 / 2 - 150), (byte) 2, 0, 30, 300 - arg1 * 3, var7 + 2);
            this.field459.method248(1, var5 / 2 + 5 - var6, arg0, var4 / 2, 16777215);
            this.field384.method466(2, super.field1175, 171, 202);
            if (this.field535) {
                this.field535 = false;
                if (!this.field186) {
                    this.field385.method466(2, super.field1175, 0, 0);
                    this.field386.method466(2, super.field1175, 0, 637);
                }
                this.field382.method466(2, super.field1175, 0, 128);
                this.field383.method466(2, super.field1175, 371, 202);
                this.field387.method466(2, super.field1175, 265, 0);
                this.field388.method466(2, super.field1175, 265, 562);
                this.field389.method466(2, super.field1175, 171, 128);
                this.field390.method466(2, super.field1175, 171, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BI)Z")
    public final boolean method71(byte arg0, byte[] arg1, int arg2) {
        if (arg0 != -126) {
            this.method116();
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Ljava/lang/String;")
    private static final String method72(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 != -30023) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = var2.length() - 3; var4 > 0; var4 -= 3) {
            var2 = var2.substring(0, var4) + "," + var2.substring(var4);
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method73(int arg0) {
        if (arg0 <= 0) {
            this.field309 = null;
        }
        for (class7 var2 = (class7) this.field367.method329(); var2 != null; var2 = (class7) this.field367.method331(9)) {
            if (this.field358 == var2.field644 && !var2.field643) {
                if (field464 >= var2.field641) {
                    var2.method222(-938, this.field504);
                    if (var2.field643) {
                        var2.method1();
                    } else {
                        this.field369.method26(var2.field646, var2.field647, -1, 0, -671, var2.field644, 60, false, var2, var2.field645);
                    }
                }
            } else {
                var2.method1();
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)Ljava/lang/String;")
    public final String method74(boolean arg0) {
        if (!arg0) {
            this.field334.method339(63);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1178 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method75(int arg0) {
        byte[] var2 = this.field165.method551("title.dat", (byte[]) null);
        this.field255 += arg0;
        class57 var3 = new class57(var2, this);
        this.field385.method465(false);
        var3.method556((byte) -25, 0, 0);
        this.field386.method465(false);
        var3.method556((byte) -25, -637, 0);
        this.field382.method465(false);
        var3.method556((byte) -25, -128, 0);
        this.field383.method465(false);
        var3.method556((byte) -25, -202, -371);
        this.field384.method465(false);
        var3.method556((byte) -25, -202, -171);
        this.field387.method465(false);
        var3.method556((byte) -25, 0, -265);
        this.field388.method465(false);
        var3.method556((byte) -25, -562, -265);
        this.field389.method465(false);
        var3.method556((byte) -25, -128, -171);
        this.field390.method465(false);
        var3.method556((byte) -25, -562, -171);
        int[] var4 = new int[var3.field1482];
        for (int var5 = 0; var5 < var3.field1483; ++var5) {
            for (int var10 = 0; var10 < var3.field1482; ++var10) {
                var4[var10] = var3.field1481[var3.field1482 * var5 + (var3.field1482 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1482; ++var11) {
                var3.field1481[var3.field1482 * var5 + var11] = var4[var11];
            }
        }
        this.field385.method465(false);
        var3.method556((byte) -25, 382, 0);
        this.field386.method465(false);
        var3.method556((byte) -25, -255, 0);
        this.field382.method465(false);
        var3.method556((byte) -25, 254, 0);
        this.field383.method465(false);
        var3.method556((byte) -25, 180, -371);
        this.field384.method465(false);
        var3.method556((byte) -25, 180, -171);
        this.field387.method465(false);
        var3.method556((byte) -25, 382, -265);
        this.field388.method465(false);
        var3.method556((byte) -25, -180, -265);
        this.field389.method465(false);
        var3.method556((byte) -25, 254, -171);
        this.field390.method465(false);
        var3.method556((byte) -25, -180, -171);
        class57 var6 = new class57(this.field165, "logo", 0);
        this.field382.method465(false);
        var6.method558(18, 382 - var6.field1482 / 2 - 128, (byte) 71);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method76(int arg0) {
        this.field589 = new class19(this.field165, "titlebox", 0);
        while (arg0 >= 0) {
            this.field371 = !this.field371;
        }
        this.field590 = new class19(this.field165, "titlebutton", 0);
        this.field503 = new class19[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field503[var3] = new class19(this.field165, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field503[var4] = new class19(this.field165, "runes", (var4 & 3) + 12);
            }
        }
        this.field607 = new class57(128, 265);
        this.field608 = new class57(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field607.field1481[var5] = this.field385.field1234[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field608.field1481[var6] = this.field386.field1234[var6];
        }
        this.field516 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field516[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field516[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field516[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field516[var10 + 192] = 16777215;
        }
        this.field517 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field517[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field517[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field517[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field517[var14 + 192] = 16777215;
        }
        this.field518 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field518[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field518[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field518[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field518[var18 + 192] = 16777215;
        }
        this.field515 = new int[256];
        this.field558 = new int[32768];
        this.field559 = new int[32768];
        this.method152((byte) 1, (class19) null);
        this.field377 = new int[32768];
        this.field378 = new int[32768];
        this.method70("Connecting to fileserver", 10, (byte) 7);
        if (!this.field186) {
            this.field427 = true;
            this.field186 = true;
            this.method102(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILKHOMSBHW;B)V")
    private final void method77(int arg0, class30 arg1, byte arg2) {
        if (arg2 != 106) {
            this.field332 = !this.field332;
        }
        for (int var4 = 0; var4 < this.field416; ++var4) {
            int var5 = this.field417[var4];
            class13 var6 = this.field480[var5];
            int var7 = arg1.method349();
            if ((var7 & 8) != 0) {
                var6.field1538 = arg1.method379((byte) -102);
                if (var6.field1538 == 65535) {
                    var6.field1538 = -1;
                }
            }
            if ((var7 & 32) != 0) {
                var6.field1579 = arg1.method351();
                var6.field1580 = arg1.method351();
            }
            if ((var7 & 2) != 0) {
                int var8 = arg1.method377((byte) 46);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = arg1.method370(-719);
                if (var6.field1552 == var8 && var8 != -1) {
                    int var10 = class9.field682[var8].field696;
                    if (var10 == 1) {
                        var6.field1553 = 0;
                        var6.field1554 = 0;
                        var6.field1555 = var9;
                        var6.field1556 = 0;
                    }
                    if (var10 == 2) {
                        var6.field1556 = 0;
                    }
                } else if (var8 == -1 || var6.field1552 == -1 || class9.field682[var8].field690 >= class9.field682[var6.field1552].field690) {
                    var6.field1552 = var8;
                    var6.field1553 = 0;
                    var6.field1554 = 0;
                    var6.field1555 = var9;
                    var6.field1556 = 0;
                    var6.field1593 = var6.field1559;
                }
            }
            if ((var7 & 1) != 0) {
                int var11 = arg1.method369(0);
                int var12 = arg1.method370(-719);
                var6.method579(field464, var12, (byte) 44, var11);
                var6.field1549 = field464 + 300;
                var6.field1550 = arg1.method349();
                var6.field1551 = arg1.method370(-719);
            }
            if ((var7 & 128) != 0) {
                var6.field1544 = arg1.method356();
                var6.field1548 = 100;
            }
            if ((var7 & 16) != 0) {
                var6.field736 = class59.method570(arg1.method378((byte) 7));
                var6.field1565 = var6.field736.field1508;
                var6.field1558 = var6.field736.field1529;
                var6.field1560 = var6.field736.field1515;
                var6.field1561 = var6.field736.field1517;
                var6.field1562 = var6.field736.field1526;
                var6.field1563 = var6.field736.field1506;
                var6.field1545 = var6.field736.field1504;
            }
            if ((var7 & 64) != 0) {
                var6.field1584 = arg1.method379((byte) -102);
                int var13 = arg1.method386(-35940);
                var6.field1588 = var13 >> 16;
                var6.field1587 = (var13 & 65535) + field464;
                var6.field1585 = 0;
                var6.field1586 = 0;
                if (var6.field1587 > field464) {
                    var6.field1585 = -1;
                }
                if (var6.field1584 == 65535) {
                    var6.field1584 = -1;
                }
            }
            if ((var7 & 4) != 0) {
                int var14 = arg1.method368(false);
                int var15 = arg1.method349();
                var6.method579(field464, var15, (byte) 44, var14);
                var6.field1549 = field464 + 300;
                var6.field1550 = arg1.method368(false);
                var6.field1551 = arg1.method368(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method78(int arg0) {
        if (arg0 <= 0) {
            this.field237 = -309;
        }
        for (int var2 = -1; var2 < this.field414; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field412;
            } else {
                var6 = this.field415[var2];
            }
            class69 var7 = this.field413[var6];
            if (var7 != null && var7.field1548 > 0) {
                --var7.field1548;
                if (var7.field1548 == 0) {
                    var7.field1544 = null;
                }
            }
        }
        ++field406;
        if (field406 > 88) {
            field406 = 0;
            this.field334.method338(0, 211);
        }
        for (int var3 = 0; var3 < this.field481; ++var3) {
            int var4 = this.field482[var3];
            class13 var5 = this.field480[var4];
            if (var5 != null && var5.field1548 > 0) {
                --var5.field1548;
                if (var5.field1548 == 0) {
                    var5.field1544 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Z")
    public final boolean method79(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            class2 var5 = class2.field66[arg2];
            for (int var6 = 0; var6 < var5.field20.length && var5.field20[var6] != -1; ++var6) {
                class2 var7 = class2.field66[var5.field20[var6]];
                if (var7.field35 == 1) {
                    var4 |= this.method79(923, arg1, var7.field15);
                }
                if (var7.field35 == 6 && (var7.field40 != -1 || var7.field41 != -1)) {
                    boolean var8 = this.method119(361, var7);
                    int var9;
                    if (var8) {
                        var9 = var7.field41;
                    } else {
                        var9 = var7.field40;
                    }
                    if (var9 != -1) {
                        class9 var10 = class9.field682[var9];
                        var7.field59 += arg1;
                        while (var7.field59 > var10.method241(true, var7.field42)) {
                            var7.field59 -= var10.method241(true, var7.field42) + 1;
                            ++var7.field42;
                            if (var7.field42 >= var10.field683) {
                                var7.field42 -= var10.field687;
                                if (var7.field42 < 0 || var7.field42 >= var10.field683) {
                                    var7.field42 = 0;
                                }
                            }
                            var4 = true;
                        }
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILKHOMSBHW;B)V")
    private final void method80(int arg0, class30 arg1, byte arg2) {
        this.field170 = 0;
        this.field416 = 0;
        if (arg2 != -110) {
            this.field256 = -1;
        }
        this.method111(arg1, arg0, 0);
        this.method92(0, arg0, arg1);
        this.method153(arg1, (byte) 2, arg0);
        this.method149(arg1, arg0, 0);
        for (int var4 = 0; var4 < this.field170; ++var4) {
            int var6 = this.field171[var4];
            if (field464 != this.field413[var6].field1542) {
                this.field413[var6] = null;
            }
        }
        if (arg1.field1065 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1065 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field414; ++var5) {
                if (this.field413[this.field415[var5]] == null) {
                    signlink.reporterror(this.field312 + " null entry in pl list - pos:" + var5 + " size:" + this.field414);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field369.method41(arg5, arg1, arg2);
        if (arg3 != 23626) {
            this.field309 = null;
        }
        if (var7 != 0) {
            int var8 = this.field369.method45(arg5, arg1, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field244.field1481;
            int var13 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class50 var15 = class50.method512(var14);
            if (var15.field1330 != -1) {
                class19 var16 = this.field469[var15.field1330];
                if (var16 != null) {
                    int var17 = (var15.field1358 * 4 - var16.field895) / 2;
                    int var18 = (var15.field1365 * 4 - var16.field896) / 2;
                    var16.method319((104 - arg2 - var15.field1365) * 4 + 48 + var18, arg1 * 4 + 48 + var17, (byte) 71);
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
        int var19 = this.field369.method43(arg5, arg1, arg2);
        if (var19 != 0) {
            int var20 = this.field369.method45(arg5, arg1, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class50 var24 = class50.method512(var23);
            if (var24.field1330 != -1) {
                class19 var25 = this.field469[var24.field1330];
                if (var25 != null) {
                    int var26 = (var24.field1358 * 4 - var25.field895) / 2;
                    int var27 = (var24.field1365 * 4 - var25.field896) / 2;
                    var25.method319((104 - arg2 - var24.field1365) * 4 + 48 + var27, arg1 * 4 + 48 + var26, (byte) 71);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field244.field1481;
                int var30 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
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
        int var31 = this.field369.method44(arg5, arg1, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class50 var33 = class50.method512(var32);
            if (var33.field1330 != -1) {
                class19 var34 = this.field469[var33.field1330];
                if (var34 != null) {
                    int var35 = (var33.field1358 * 4 - var34.field895) / 2;
                    int var36 = (var33.field1365 * 4 - var34.field896) / 2;
                    var34.method319((104 - arg2 - var33.field1365) * 4 + 48 + var36, arg1 * 4 + 48 + var35, (byte) 71);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method82(byte arg0) {
        if (arg0 != -54) {
            this.field237 = 430;
        }
        try {
            this.field449 = -1;
            this.field367.method333();
            this.field359.method333();
            ++field549;
            if (field549 > 1672) {
                field549 = 0;
                this.field334.method338(0, 187);
                this.field334.method339(0);
                int var2 = this.field334.field1065;
                this.field334.method339(172);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field334.method339(99);
                }
                this.field334.method339(26);
                this.field334.method340((int) (Math.random() * 65536.0D));
                this.field334.method340(39552);
                this.field334.method340(16690);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field334.method340(16512);
                }
                this.field334.method339(109);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field334.method339(241);
                }
                this.field334.method339(60);
                this.field334.method348(this.field334.field1065 - var2, (byte) 1);
            }
            class8.method226(false);
            this.method97(449);
            this.field369.method15(-24693);
            System.gc();
            for (int var3 = 0; var3 < 4; ++var3) {
                this.field456[var3].method208();
            }
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; var6 < 104; ++var6) {
                        this.field450[var4][var5][var6] = 0;
                    }
                }
            }
            class46 var7 = new class46((byte) 98, this.field450, 104, 104, this.field405);
            int var8 = this.field463.length;
            this.field334.method338(0, 140);
            if (!this.field238) {
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = (this.field315[var9] >> 8) * 64 - this.field537;
                    int var11 = (this.field315[var9] & 255) * 64 - this.field538;
                    byte[] var12 = this.field463[var9];
                    if (var12 != null) {
                        var7.method487((this.field248 - 6) * 8, true, var10, (this.field247 - 6) * 8, this.field456, var11, var12);
                    }
                }
                for (int var13 = 0; var13 < var8; ++var13) {
                    int var14 = (this.field315[var13] >> 8) * 64 - this.field537;
                    int var15 = (this.field315[var13] & 255) * 64 - this.field538;
                    byte[] var16 = this.field463[var13];
                    if (var16 == null && this.field248 < 800) {
                        var7.method489(64, var14, var15, 215, 64);
                    }
                }
                this.field334.method338(0, 140);
                for (int var17 = 0; var17 < var8; ++var17) {
                    byte[] var18 = this.field322[var17];
                    if (var18 != null) {
                        int var19 = (this.field315[var17] >> 8) * 64 - this.field537;
                        int var20 = (this.field315[var17] & 255) * 64 - this.field538;
                        var7.method474(var19, -761, var18, var20, this.field369, this.field456);
                    }
                }
            }
            if (this.field238) {
                int var21 = 0;
                label278: while (true) {
                    if (var21 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field582[0][var31][var32];
                                if (var33 == -1) {
                                    var7.method489(8, var31 * 8, var32 * 8, 215, 8);
                                }
                            }
                        }
                        this.field334.method338(0, 140);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label278;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field582[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field315.length; ++var43) {
                                            if (this.field315[var43] == var42 && this.field322[var43] != null) {
                                                var7.method476(this.field369, (var41 & 7) * 8, 9, this.field322[var43], var39, var34, var36 * 8, var35 * 8, this.field456, (var40 & 7) * 8, var38);
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
                            int var24 = this.field582[var21][var22][var23];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field315.length; ++var30) {
                                    if (this.field315[var30] == var29 && this.field463[var30] != null) {
                                        var7.method491(var21, var23 * 8, var26, (var28 & 7) * 8, var22 * 8, var25, (var27 & 7) * 8, 0, this.field456, this.field463[var30]);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var21;
                }
            }
            this.field334.method338(0, 140);
            var7.method477(this.field369, this.field456, -866);
            this.field442.method465(false);
            this.field334.method338(0, 140);
            int var44 = class46.field1262;
            if (var44 > this.field358) {
                var44 = this.field358;
            }
            if (var44 < this.field358 - 1) {
                int var45 = this.field358 - 1;
            }
            if (field366) {
                this.field369.method16(6, class46.field1262);
            } else {
                this.field369.method16(6, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method144(var46, var47);
                }
            }
            ++field368;
            if (field368 > 1500) {
                field368 = 0;
                this.field334.method338(0, 236);
                this.field334.method339(0);
                int var48 = this.field334.field1065;
                this.field334.method339((int) (Math.random() * 256.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field334.method339(41);
                }
                this.field334.method339((int) (Math.random() * 256.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field334.method339(20);
                }
                this.field334.method340((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field334.method340(51853);
                }
                this.field334.method339((int) (Math.random() * 256.0D));
                this.field334.method339(152);
                this.field334.method339(112);
                this.field334.method339((int) (Math.random() * 256.0D));
                this.field334.method348(this.field334.field1065 - var48, (byte) 1);
            }
            this.method205((byte) 3);
        } catch (Exception var61) {
        }
        class50.field1331.method568();
        if (super.field1178 != null) {
            this.field334.method338(0, 5);
            this.field334.method343(1057001181);
        }
        if (field366 && signlink.cache_dat != null) {
            int var50 = this.field236.method548(0, 0);
            for (int var51 = 0; var51 < var50; ++var51) {
                int var52 = this.field236.method540(var51, 2);
                if ((var52 & 121) == 0) {
                    class17.method284(this.field204, var51);
                }
            }
        }
        System.gc();
        class8.method227(20, 1);
        this.field236.method535((byte) -87);
        int var53 = (this.field247 - 6) / 8 - 1;
        int var54 = (this.field247 + 6) / 8 + 1;
        int var55 = (this.field248 - 6) / 8 - 1;
        int var56 = (this.field248 + 6) / 8 + 1;
        if (this.field527) {
            var53 = 49;
            var54 = 50;
            var55 = 49;
            var56 = 50;
        }
        for (int var57 = var53; var57 <= var54; ++var57) {
            for (int var58 = var55; var58 <= var56; ++var58) {
                if (var53 == var57 || var54 == var57 || var55 == var58 || var56 == var58) {
                    int var59 = this.field236.method541(0, var57, var58, false);
                    if (var59 != -1) {
                        this.field236.method543(var59, (byte) -65, 3);
                    }
                    int var60 = this.field236.method541(1, var57, var58, false);
                    if (var60 != -1) {
                        this.field236.method543(var60, (byte) -65, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public static final void method83(int arg0) {
        class4.field89 = true;
        class8.field657 = true;
        field366 = true;
        int var1 = 87 / arg0;
        class46.field1268 = true;
        class50.field1357 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        class51 var2 = (class51) this.field359.method329();
        this.field222 &= arg0;
        while (var2 != null) {
            if (this.field358 == var2.field1383 && field464 <= var2.field1387) {
                if (field464 >= var2.field1386) {
                    if (var2.field1370 > 0) {
                        class13 var3 = this.field480[var2.field1370 - 1];
                        if (var3 != null && var3.field1539 >= 0 && var3.field1539 < 13312 && var3.field1540 >= 0 && var3.field1540 < 13312) {
                            var2.method516(var3.field1540, true, field464, var3.field1539, this.method156(var2.field1383, 478, var3.field1539, var3.field1540) - var2.field1378);
                        }
                    }
                    if (var2.field1370 < 0) {
                        int var4 = -var2.field1370 - 1;
                        class69 var5;
                        if (this.field361 == var4) {
                            var5 = field285;
                        } else {
                            var5 = this.field413[var4];
                        }
                        if (var5 != null && var5.field1539 >= 0 && var5.field1539 < 13312 && var5.field1540 >= 0 && var5.field1540 < 13312) {
                            var2.method516(var5.field1540, true, field464, var5.field1539, this.method156(var2.field1383, 478, var5.field1539, var5.field1540) - var2.field1378);
                        }
                    }
                    var2.method517(true, this.field504);
                    this.field369.method26((int) var2.field1372, (int) var2.field1373, -1, var2.field1384, -671, this.field358, 60, false, var2, (int) var2.field1371);
                }
            } else {
                var2.method1();
            }
            var2 = (class51) this.field359.method331(9);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Z")
    public final boolean method85(boolean arg0, int arg1) {
        if (!arg0) {
            this.field256 = -1;
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field275[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 983;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method86(byte arg0) {
        if (this.field382 == null) {
            super.field1176 = null;
            this.field443 = null;
            if (arg0 != 94) {
                this.field470 = this.field619.method526();
            }
            this.field441 = null;
            this.field440 = null;
            this.field442 = null;
            this.field233 = null;
            this.field234 = null;
            this.field235 = null;
            this.field385 = new class42(128, 0, this.method192(-240), 265);
            class39.method418(320);
            this.field386 = new class42(128, 0, this.method192(-240), 265);
            class39.method418(320);
            this.field382 = new class42(509, 0, this.method192(-240), 171);
            class39.method418(320);
            this.field383 = new class42(360, 0, this.method192(-240), 132);
            class39.method418(320);
            this.field384 = new class42(360, 0, this.method192(-240), 200);
            class39.method418(320);
            this.field387 = new class42(202, 0, this.method192(-240), 238);
            class39.method418(320);
            this.field388 = new class42(203, 0, this.method192(-240), 238);
            class39.method418(320);
            this.field389 = new class42(74, 0, this.method192(-240), 94);
            class39.method418(320);
            this.field390 = new class42(75, 0, this.method192(-240), 94);
            class39.method418(320);
            if (this.field165 != null) {
                this.method75(0);
                this.method76(-744);
            }
            this.field535 = true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method87(int arg0) {
        this.field443.method465(false);
        class8.field668 = this.field354;
        this.field272.method319(0, 0, (byte) 71);
        if (this.field362) {
            this.field459.method248(1, 40, this.field221, 239, 0);
            this.field459.method248(1, 60, this.field289 + "*", 239, 128);
        } else if (this.field240 == 1) {
            this.field459.method248(1, 40, "Enter amount:", 239, 0);
            this.field459.method248(1, 60, this.field452 + "*", 239, 128);
        } else if (this.field240 == 2) {
            this.field459.method248(1, 40, "Enter name:", 239, 0);
            this.field459.method248(1, 60, this.field452 + "*", 239, 128);
        } else if (this.field307 != null) {
            this.field459.method248(1, 40, this.field307, 239, 0);
            this.field459.method248(1, 60, "Click to continue", 239, 128);
        } else if (this.field455 != -1) {
            this.method136(0, (byte) -111, 0, class2.field66[this.field455], 0);
        } else if (this.field268 != -1) {
            this.method136(0, (byte) -111, 0, class2.field66[this.field268], 0);
        } else {
            class11 var2 = this.field458;
            int var3 = 0;
            class39.method417(463, 0, 77, 0, 42773);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field348[var4] != null) {
                    int var6 = this.field346[var4];
                    int var7 = 70 - var3 * 14 + this.field462;
                    String var8 = this.field347[var4];
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
                            var2.method252(671, 0, 4, this.field348[var4], var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field576 == 0 || this.field576 == 1 && this.method135(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field616[0].method319(var7 - 12, var10, (byte) 71);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field616[1].method319(var7 - 12, var10, (byte) 71);
                                var10 += 14;
                            }
                            var2.method252(671, 0, var10, var8 + ":", var7);
                            int var11 = var10 + var2.method250(var8, 0) + 8;
                            var2.method252(671, 255, var11, this.field348[var4], var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field220 == 0 && (var6 == 7 || this.field167 == 0 || this.field167 == 1 && this.method135(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method252(671, 0, var12, "From", var7);
                            int var13 = var12 + var2.method250("From ", 0);
                            if (var9 == 1) {
                                this.field616[0].method319(var7 - 12, var13, (byte) 71);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field616[1].method319(var7 - 12, var13, (byte) 71);
                                var13 += 14;
                            }
                            var2.method252(671, 0, var13, var8 + ":", var7);
                            int var14 = var13 + var2.method250(var8, 0) + 8;
                            var2.method252(671, 8388608, var14, this.field348[var4], var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field319 == 0 || this.field319 == 1 && this.method135(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method252(671, 8388736, 4, var8 + " " + this.field348[var4], var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field220 == 0 && this.field167 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method252(671, 8388608, 4, this.field348[var4], var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field220 == 0 && this.field167 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method252(671, 0, 4, "To " + var8 + ":", var7);
                            var2.method252(671, 8388608, 12 + var2.method250("To " + var8, 0), this.field348[var4], var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field319 == 0 || this.field319 == 1 && this.method135(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method252(671, 8270336, 4, var8 + " " + this.field348[var4], var7);
                        }
                        ++var3;
                    }
                }
            }
            class39.method416(5758);
            this.field207 = var3 * 14 + 7;
            if (this.field207 < 78) {
                this.field207 = 78;
            }
            this.method134(this.field207 - this.field462 - 77, 77, 0, 0, 463, this.field207);
            String var5;
            if (field285 != null && field285.field1665 != null) {
                var5 = field285.field1665;
            } else {
                var5 = class61.method584(true, this.field312);
            }
            var2.method252(671, 0, 4, var5 + ":", 90);
            var2.method252(671, 255, 6 + var2.method250(var5 + ": ", 0), this.field372 + "*", 90);
            class39.method423(77, 265, 479, 0, 0);
        }
        if (this.field246 && this.field484 == 2) {
            this.method106((byte) 1);
        }
        this.field443.method466(2, super.field1175, 357, 17);
        if (arg0 < 3 || arg0 > 3) {
            this.field334.method339(141);
        }
        this.field442.method465(false);
        class8.field668 = this.field356;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method88(long arg0, int arg1) {
        if (arg1 != 3) {
            this.field309 = null;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field498; ++var4) {
                if (this.field201[var4] == arg0) {
                    --this.field498;
                    this.field521 = true;
                    for (int var5 = var4; var5 < this.field498; ++var5) {
                        this.field201[var5] = this.field201[var5 + 1];
                    }
                    this.field334.method338(0, 104);
                    this.field334.method345(arg0, (byte) 12);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method89(int arg0) {
        if (this.field524 >= 2 || this.field173 != 0 || this.field301 != 0) {
            if (arg0 != 0) {
                this.field336 = !this.field336;
            }
            String var2;
            if (this.field173 == 1 && this.field524 < 2) {
                var2 = "Use " + this.field177 + " with...";
            } else if (this.field301 == 1 && this.field524 < 2) {
                var2 = this.field304 + "...";
            } else {
                var2 = this.field314[this.field524 - 1];
            }
            if (this.field524 > 2) {
                var2 = var2 + "@whi@ / " + (this.field524 - 2) + " more options";
            }
            this.field459.method257(this.field318, 16777215, true, field464 / 1000, 15, var2, 4);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method90(int arg0, int arg1) {
        this.field255 += arg0;
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method91(boolean arg0) {
        if (this.field220 != 0) {
            int var2 = 0;
            if (this.field533 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field348[var3] != null) {
                    int var4 = this.field346[var3];
                    String var5 = this.field347[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field167 == 0 || this.field167 == 1 && this.method135(false, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1183 > 4 && super.field1184 - 4 > var9 - 10 && super.field1184 - 4 <= var9 + 3) {
                            int var10 = this.field458.method250("From:  " + var5 + this.field348[var3], 0) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1183 < var10 + 4) {
                                if (this.field184 >= 1) {
                                    this.field314[this.field524] = "Report abuse @whi@" + var5;
                                    this.field275[this.field524] = 2872;
                                    ++this.field524;
                                }
                                this.field314[this.field524] = "Add ignore @whi@" + var5;
                                this.field275[this.field524] = 2616;
                                ++this.field524;
                                this.field314[this.field524] = "Add friend @whi@" + var5;
                                this.field275[this.field524] = 2983;
                                ++this.field524;
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
                this.field256 = this.field431.method349();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILKHOMSBHW;)V")
    private final void method92(int arg0, int arg1, class30 arg2) {
        int var4 = arg2.method360(true, 8);
        if (var4 < this.field414) {
            for (int var5 = var4; var5 < this.field414; ++var5) {
                this.field171[this.field170++] = this.field415[var5];
            }
        }
        if (var4 > this.field414) {
            signlink.reporterror(this.field312 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field414 = 0;
            int var10000 = arg0 + arg1;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field415[var7];
                class69 var9 = this.field413[var8];
                int var10 = arg2.method360(true, 1);
                if (var10 == 0) {
                    this.field415[this.field414++] = var8;
                    var9.field1542 = field464;
                } else {
                    int var11 = arg2.method360(true, 2);
                    if (var11 == 0) {
                        this.field415[this.field414++] = var8;
                        var9.field1542 = field464;
                        this.field417[this.field416++] = var8;
                    } else if (var11 == 1) {
                        this.field415[this.field414++] = var8;
                        var9.field1542 = field464;
                        int var12 = arg2.method360(true, 3);
                        var9.method576(var12, false, 1);
                        int var13 = arg2.method360(true, 1);
                        if (var13 == 1) {
                            this.field417[this.field416++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field415[this.field414++] = var8;
                        var9.field1542 = field464;
                        int var14 = arg2.method360(true, 3);
                        var9.method576(var14, true, 1);
                        int var15 = arg2.method360(true, 3);
                        var9.method576(var15, true, 1);
                        int var16 = arg2.method360(true, 1);
                        if (var16 == 1) {
                            this.field417[this.field416++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field171[this.field170++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.method99(-587);
        if (this.field282 == 1) {
            this.field323[this.field281 / 100].method558(this.field280 - 8 - 4, this.field279 - 8 - 4, (byte) 71);
        }
        if (this.field282 == 2) {
            this.field323[this.field281 / 100 + 4].method558(this.field280 - 8 - 4, this.field279 - 8 - 4, (byte) 71);
        }
        if (this.field618 != -1) {
            this.method79(923, this.field504, this.field618);
            this.method136(0, (byte) -111, 0, class2.field66[this.field618], 0);
        }
        if (this.field345 != -1) {
            this.method79(923, this.field504, this.field345);
            this.method136(0, (byte) -111, 0, class2.field66[this.field345], 0);
        }
        this.method158(0);
        if (!arg0) {
            this.field256 = this.field431.method349();
        }
        if (!this.field246) {
            this.method193((byte) 7);
            this.method89(this.field187);
        } else if (this.field484 == 0) {
            this.method106((byte) 1);
        }
        if (this.field230 == 1) {
            this.field546[1].method558(296, 472, (byte) 71);
        }
        if (field445) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1171 < 15) {
                var4 = 16711680;
            }
            this.field458.method247(var3, var4, (byte) 7, "Fps:" + super.field1171, var2);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field366) {
                int var8 = 16711680;
            }
            this.field458.method247(var12, 16776960, (byte) 7, "Mem:" + var6 + "k", var2);
            var12 += 15;
        }
        if (this.field533 != 0) {
            int var9 = this.field533 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field458.method252(671, 16776960, 4, "System update in: " + var10 + ":0" + var11, 329);
            } else {
                this.field458.method252(671, 16776960, 4, "System update in: " + var10 + ":" + var11, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        int var2 = 5;
        this.field531[8] = 0;
        if (!arg0) {
            int var3 = 0;
            while (this.field531[8] == 0) {
                String var4 = "Unknown problem";
                this.method70("Connecting to web server", 20, (byte) 7);
                try {
                    DataInputStream var5 = this.method107("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 312);
                    class30 var6 = new class30(new byte[40], -982);
                    var5.readFully(var6.field1064, 0, 40);
                    var5.close();
                    for (int var7 = 0; var7 < 9; ++var7) {
                        this.field531[var7] = var6.method354();
                    }
                    int var8 = var6.method354();
                    int var9 = 1234;
                    for (int var10 = 0; var10 < 9; ++var10) {
                        var9 = (var9 << 1) + this.field531[var10];
                    }
                    if (var8 != var9) {
                        var4 = "checksum problem";
                        this.field531[8] = 0;
                    }
                } catch (EOFException var13) {
                    var4 = "EOF problem";
                    this.field531[8] = 0;
                } catch (IOException var14) {
                    var4 = "connection problem";
                    this.field531[8] = 0;
                } catch (Exception var15) {
                    var4 = "logic problem";
                    this.field531[8] = 0;
                    if (!signlink.reporterror) {
                        return;
                    }
                }
                if (this.field531[8] == 0) {
                    ++var3;
                    for (int var11 = var2; var11 > 0; --var11) {
                        if (var3 >= 10) {
                            this.method70("Game updated - please reload page", 10, (byte) 7);
                            var11 = 10;
                        } else {
                            this.method70(var4 + " - Will retry in " + var11 + " secs.", 10, (byte) 7);
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
                    this.field613 = !this.field613;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method95(int arg0) {
        if (arg0 > 0) {
            int var2 = this.field459.method250("Choose Option", 0);
            for (int var3 = 0; var3 < this.field524; ++var3) {
                int var11 = this.field459.method250(this.field314[var3], 0);
                if (var11 > var2) {
                    var2 = var11;
                }
            }
            var2 += 8;
            int var4 = this.field524 * 15 + 21;
            if (super.field1190 > 4 && super.field1191 > 4 && super.field1190 < 516 && super.field1191 < 338) {
                int var5 = super.field1190 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field1191 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field246 = true;
                this.field484 = 0;
                this.field485 = var5;
                this.field486 = var6;
                this.field487 = var2;
                this.field488 = this.field524 * 15 + 22;
            }
            if (super.field1190 > 553 && super.field1191 > 205 && super.field1190 < 743 && super.field1191 < 466) {
                int var7 = super.field1190 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field1191 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field246 = true;
                this.field484 = 1;
                this.field485 = var7;
                this.field486 = var8;
                this.field487 = var2;
                this.field488 = this.field524 * 15 + 22;
            }
            if (super.field1190 > 17 && super.field1191 > 357 && super.field1190 < 496 && super.field1191 < 453) {
                int var9 = super.field1190 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field1191 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field246 = true;
                this.field484 = 2;
                this.field485 = var9;
                this.field486 = var10;
                this.field487 = var2;
                this.field488 = this.field524 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method96(int arg0) {
        this.field448 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field186) {
                ++this.field491;
                this.method104(-851);
                this.method104(-851);
                this.method170(0);
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
        this.field448 = false;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method97(int arg0) {
        class50.field1331.method568();
        class50.field1354.method568();
        class59.field1531.method568();
        class15.field757.method568();
        class15.field782.method568();
        int var2 = 48 / arg0;
        class69.field1655.method568();
        class22.field925.method568();
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method98(byte arg0) {
        if (arg0 != -62) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field310 == 0) {
            if (super.field1189 == 1) {
                int var3 = super.field1190 - 25 - 550;
                int var4 = super.field1191 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field466 + this.field407 & 2047;
                    int var6 = class8.field666[var5];
                    int var7 = class8.field667[var5];
                    int var8 = (this.field197 + 256) * var6 >> 8;
                    int var9 = (this.field197 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field285.field1539 + var10 >> 7;
                    int var13 = field285.field1540 - var11 >> 7;
                    boolean var14 = this.method175(0, 531, var13, 0, 0, var12, 0, field285.field1582[0], 1, 0, true, field285.field1581[0]);
                    if (var14) {
                        this.field334.method339(var3);
                        this.field334.method339(var4);
                        this.field334.method340(this.field466);
                        this.field334.method339(57);
                        this.field334.method339(this.field407);
                        this.field334.method339(this.field197);
                        this.field334.method339(89);
                        this.field334.method340(field285.field1539);
                        this.field334.method340(field285.field1540);
                        this.field334.method339(this.field502);
                        this.field334.method339(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (this.field220 != 0) {
            class11 var2 = this.field458;
            int var3 = 0;
            if (arg0 < 0) {
                if (this.field533 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field348[var4] != null) {
                        int var5 = this.field346[var4];
                        String var6 = this.field347[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field167 == 0 || this.field167 == 1 && this.method135(false, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method252(671, 0, var9, "From", var8);
                            var2.method252(671, 65535, var9, "From", var8 - 1);
                            int var10 = var9 + var2.method250("From ", 0);
                            if (var7 == 1) {
                                this.field616[0].method319(var8 - 12, var10, (byte) 71);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field616[1].method319(var8 - 12, var10, (byte) 71);
                                var10 += 14;
                            }
                            var2.method252(671, 0, var10, var6 + ": " + this.field348[var4], var8);
                            var2.method252(671, 65535, var10, var6 + ": " + this.field348[var4], var8 - 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field167 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method252(671, 0, 4, this.field348[var4], var11);
                            var2.method252(671, 65535, 4, this.field348[var4], var11 - 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field167 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method252(671, 0, 4, "To " + var6 + ": " + this.field348[var4], var12);
                            var2.method252(671, 65535, 4, "To " + var6 + ": " + this.field348[var4], var12 - 1);
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

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field363 = Integer.parseInt(this.getParameter("nodeid"));
        field364 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method83(441);
        } else {
            method173((byte) 1);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field365 = false;
        } else {
            field365 = true;
        }
        this.method411(765, 503, (byte) 72);
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method100(int arg0) {
        this.field441.method465(false);
        if (this.field310 == 2) {
            byte[] var2 = this.field271.field893;
            int[] var3 = class39.field1202;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field577.method562(-978, 0, 33, 33, this.field461, 0, 25, 256, this.field466, 25, this.field353);
            this.field442.method465(false);
        } else {
            int var6 = this.field466 + this.field407 & 2047;
            int var7 = field285.field1539 / 32 + 48;
            int var8 = 464 - field285.field1540 / 32;
            this.field244.method562(-978, 5, 146, 151, this.field228, 25, var7, this.field197 + 256, var6, var8, this.field529);
            this.field577.method562(-978, 0, 33, 33, this.field461, 0, 25, 256, this.field466, 25, this.field353);
            for (int var9 = 0; var9 < this.field511; ++var9) {
                int var40 = this.field512[var9] * 4 + 2 - field285.field1539 / 32;
                int var41 = this.field513[var9] * 4 + 2 - field285.field1540 / 32;
                this.method162(var40, this.field594[var9], 152, var41);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var36 = 0; var36 < 104; ++var36) {
                    class25 var37 = this.field309[this.field358][var10][var36];
                    if (var37 != null) {
                        int var38 = var10 * 4 + 2 - field285.field1539 / 32;
                        int var39 = var36 * 4 + 2 - field285.field1540 / 32;
                        this.method162(var38, this.field564, 152, var39);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field481; ++var11) {
                class13 var32 = this.field480[this.field482[var11]];
                if (var32 != null && var32.method263(6)) {
                    class59 var33 = var32.field736;
                    if (var33.field1510 != null) {
                        var33 = var33.method574((byte) 8);
                    }
                    if (var33 != null && var33.field1498 && var33.field1512) {
                        int var34 = var32.field1539 / 32 - field285.field1539 / 32;
                        int var35 = var32.field1540 / 32 - field285.field1540 / 32;
                        this.method162(var34, this.field565, 152, var35);
                    }
                }
            }
            if (arg0 < 7 || arg0 > 7) {
                for (int var12 = 1; var12 > 0; ++var12) {
                }
            }
            for (int var13 = 0; var13 < this.field414; ++var13) {
                class69 var24 = this.field413[this.field415[var13]];
                if (var24 != null && var24.method263(6)) {
                    int var25 = var24.field1539 / 32 - field285.field1539 / 32;
                    int var26 = var24.field1540 / 32 - field285.field1540 / 32;
                    boolean var27 = false;
                    long var28 = class61.method580(var24.field1665);
                    for (int var30 = 0; var30 < this.field542; ++var30) {
                        if (this.field483[var30] == var28 && this.field583[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var31 = false;
                    if (field285.field1666 != 0 && var24.field1666 != 0 && field285.field1666 == var24.field1666) {
                        var31 = true;
                    }
                    if (var27) {
                        this.method162(var25, this.field567, 152, var26);
                    } else if (var31) {
                        this.method162(var25, this.field568, 152, var26);
                    } else {
                        this.method162(var25, this.field566, 152, var26);
                    }
                }
            }
            if (this.field179 != 0 && field464 % 20 < 10) {
                if (this.field179 == 1 && this.field194 >= 0 && this.field194 < this.field480.length) {
                    class13 var14 = this.field480[this.field194];
                    if (var14 != null) {
                        int var15 = var14.field1539 / 32 - field285.field1539 / 32;
                        int var16 = var14.field1540 / 32 - field285.field1540 / 32;
                        this.method137(this.field523, this.field579, var15, var16);
                    }
                }
                if (this.field179 == 2) {
                    int var17 = (this.field209 - this.field537) * 4 + 2 - field285.field1539 / 32;
                    int var18 = (this.field210 - this.field538) * 4 + 2 - field285.field1540 / 32;
                    this.method137(this.field523, this.field579, var17, var18);
                }
                if (this.field179 == 10 && this.field189 >= 0 && this.field189 < this.field413.length) {
                    class69 var19 = this.field413[this.field189];
                    if (var19 != null) {
                        int var20 = var19.field1539 / 32 - field285.field1539 / 32;
                        int var21 = var19.field1540 / 32 - field285.field1540 / 32;
                        this.method137(this.field523, this.field579, var20, var21);
                    }
                }
            }
            if (this.field242 != 0) {
                int var22 = this.field242 * 4 + 2 - field285.field1539 / 32;
                int var23 = this.field243 * 4 + 2 - field285.field1540 / 32;
                this.method162(var22, this.field522, 152, var23);
            }
            class39.method420(97, (byte) 2, 16777215, 3, 3, 78);
            this.field442.method465(false);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method101(byte arg0) {
        int var2 = this.field550 * 128 + 64;
        int var3 = this.field551 * 128 + 64;
        int var4 = this.method156(this.field358, 478, var2, var3) - this.field552;
        if (this.field293 < var2) {
            this.field293 += (var2 - this.field293) * this.field554 / 1000 + this.field553;
            if (this.field293 > var2) {
                this.field293 = var2;
            }
        }
        if (this.field293 > var2) {
            this.field293 -= (this.field293 - var2) * this.field554 / 1000 + this.field553;
            if (this.field293 < var2) {
                this.field293 = var2;
            }
        }
        if (this.field294 < var4) {
            this.field294 += (var4 - this.field294) * this.field554 / 1000 + this.field553;
            if (this.field294 > var4) {
                this.field294 = var4;
            }
        }
        if (this.field294 > var4) {
            this.field294 -= (this.field294 - var4) * this.field554 / 1000 + this.field553;
            if (this.field294 < var4) {
                this.field294 = var4;
            }
        }
        if (this.field295 < var3) {
            this.field295 += (var3 - this.field295) * this.field554 / 1000 + this.field553;
            if (this.field295 > var3) {
                this.field295 = var3;
            }
        }
        if (this.field295 > var3) {
            this.field295 -= (this.field295 - var3) * this.field554 / 1000 + this.field553;
            if (this.field295 < var3) {
                this.field295 = var3;
            }
        }
        int var5 = this.field337 * 128 + 64;
        if (arg0 == 1) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        int var8 = this.field338 * 128 + 64;
        int var9 = this.method156(this.field358, 478, var5, var8) - this.field339;
        int var10 = var5 - this.field293;
        int var11 = var9 - this.field294;
        int var12 = var8 - this.field295;
        int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
        int var14 = (int) (Math.atan2((double) var11, (double) var13) * 325.949D) & 2047;
        int var15 = (int) (Math.atan2((double) var10, (double) var12) * -325.949D) & 2047;
        if (var14 < 128) {
            var14 = 128;
        }
        if (var14 > 383) {
            var14 = 383;
        }
        if (this.field296 < var14) {
            this.field296 += (var14 - this.field296) * this.field341 / 1000 + this.field340;
            if (this.field296 > var14) {
                this.field296 = var14;
            }
        }
        if (this.field296 > var14) {
            this.field296 -= (this.field296 - var14) * this.field341 / 1000 + this.field340;
            if (this.field296 < var14) {
                this.field296 = var14;
            }
        }
        int var16 = var15 - this.field297;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 > 0) {
            this.field297 += this.field341 * var16 / 1000 + this.field340;
            this.field297 &= 2047;
        }
        if (var16 < 0) {
            this.field297 -= -var16 * this.field341 / 1000 + this.field340;
            this.field297 &= 2047;
        }
        int var17 = var15 - this.field297;
        if (var17 > 1024) {
            var17 -= 2048;
        }
        if (var17 < -1024) {
            var17 += 2048;
        }
        if (var17 < 0 && var16 > 0 || var17 > 0 && var16 < 0) {
            this.field297 = var15;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method102(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method102(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 != 41872) {
            this.field256 = -1;
        }
        try {
            int var2 = field285.field1539 + this.field162;
            int var3 = field285.field1540 + this.field429;
            if (this.field598 - var2 < -500 || this.field598 - var2 > 500 || this.field599 - var3 < -500 || this.field599 - var3 > 500) {
                this.field598 = var2;
                this.field599 = var3;
            }
            if (this.field598 != var2) {
                this.field598 += (var2 - this.field598) / 16;
            }
            if (this.field599 != var3) {
                this.field599 += (var3 - this.field599) / 16;
            }
            if (super.field1193[1] == 1) {
                this.field467 += (-24 - this.field467) / 2;
            } else if (super.field1193[2] == 1) {
                this.field467 += (24 - this.field467) / 2;
            } else {
                this.field467 /= 2;
            }
            if (super.field1193[3] == 1) {
                this.field468 += (12 - this.field468) / 2;
            } else if (super.field1193[4] == 1) {
                this.field468 += (-12 - this.field468) / 2;
            } else {
                this.field468 /= 2;
            }
            this.field466 = this.field467 / 2 + this.field466 & 2047;
            this.field465 += this.field468 / 2;
            if (this.field465 < 128) {
                this.field465 = 128;
            }
            if (this.field465 > 383) {
                this.field465 = 383;
            }
            int var4 = this.field598 >> 7;
            int var5 = this.field599 >> 7;
            int var6 = this.method156(this.field358, 478, this.field598, this.field599);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field358;
                        if (var10 < 3 && (this.field450[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field405[var10][var8][var9];
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
            if (var12 > this.field525) {
                this.field525 += (var12 - this.field525) / 24;
            } else if (var12 < this.field525) {
                this.field525 += (var12 - this.field525) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field285.field1539 + "," + field285.field1540 + "," + this.field598 + "," + this.field599 + "," + this.field247 + "," + this.field248 + "," + this.field537 + "," + this.field538);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method104(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field377[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field377[var17] = 192;
        }
        if (arg0 >= 0) {
            this.field256 = this.field431.method349();
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field378[var14] = (this.field377[var14 - 1] + this.field377[var14 + 1] + this.field377[var14 - 128] + this.field377[var14 + 128]) / 4;
            }
        }
        this.field325 += 128;
        if (this.field325 > this.field558.length) {
            this.field325 -= this.field558.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method152((byte) 1, this.field503[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field378[var11 + 128] - this.field558[this.field325 + var11 & this.field558.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field377[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field219[var8] = this.field219[var8 + 1];
        }
        this.field219[var2 - 1] = (int) (Math.sin((double) field464 / 14.0D) * 16.0D + Math.sin((double) field464 / 15.0D) * 14.0D + Math.sin((double) field464 / 16.0D) * 12.0D);
        if (this.field472 > 0) {
            this.field472 -= 4;
        }
        if (this.field473 > 0) {
            this.field473 -= 4;
        }
        if (this.field472 == 0 && this.field473 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field472 = 1024;
            }
            if (var9 == 1) {
                this.field473 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1178 != null) {
                    return new URL("http://127.0.0.1:" + (field364 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg2 & 2047;
        int var9 = 2048 - arg4 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = class17.field875[var8];
            int var14 = class17.field876[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class17.field875[var9];
            int var17 = class17.field876[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field293 = arg1 - var10;
        this.field294 = arg5 - var11;
        this.field295 = arg3 - var12;
        this.field296 = arg2;
        this.field297 = arg4;
        if (arg0 != 0) {
            this.field256 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method106(byte arg0) {
        int var2 = this.field485;
        int var3 = this.field486;
        int var4 = this.field487;
        int var5 = this.field488;
        int var6 = 6116423;
        class39.method420(var2, (byte) 2, var6, var5, var4, var3);
        class39.method420(var2 + 1, (byte) 2, 0, 16, var4 - 2, var3 + 1);
        class39.method421(var4 - 2, (byte) -22, var5 - 19, 0, var3 + 18, var2 + 1);
        this.field459.method252(671, var6, var2 + 3, "Choose Option", var3 + 14);
        int var7 = super.field1183;
        int var8 = super.field1184;
        if (this.field484 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field484 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field484 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field524; ++var9) {
            int var11 = (this.field524 - 1 - var9) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var11 - 13 && var8 < var11 + 3) {
                var12 = 16776960;
            }
            this.field459.method256(var12, var11, true, var2 + 3, this.field314[var9], (byte) 2);
        }
        if (arg0 == 1) {
            boolean var10 = false;
        } else {
            this.field309 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method107(String arg0) throws IOException {
        if (!this.field613) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field562 != null) {
                try {
                    this.field562.close();
                } catch (Exception var4) {
                }
                this.field562 = null;
            }
            this.field562 = this.method184(43595);
            this.field562.setSoTimeout(10000);
            InputStream var2 = this.field562.getInputStream();
            OutputStream var3 = this.field562.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    private final void method108(int arg0) {
        this.field255 += arg0;
        if (this.field495 == 2) {
            for (class70 var2 = (class70) this.field216.method329(); var2 != null; var2 = (class70) this.field216.method331(9)) {
                if (var2.field1685 > 0) {
                    --var2.field1685;
                }
                if (var2.field1685 == 0) {
                    if (var2.field1677 < 0 || class46.method488(this.field260, var2.field1679, var2.field1677)) {
                        this.method190(var2.field1682, var2.field1680, var2.field1677, var2.field1681, var2.field1683, var2.field1678, -597, var2.field1679);
                        var2.method1();
                    }
                } else {
                    if (var2.field1684 > 0) {
                        --var2.field1684;
                    }
                    if (var2.field1684 == 0 && var2.field1682 >= 1 && var2.field1683 >= 1 && var2.field1682 <= 102 && var2.field1683 <= 102 && (var2.field1674 < 0 || class46.method488(this.field260, var2.field1676, var2.field1674))) {
                        this.method190(var2.field1682, var2.field1680, var2.field1674, var2.field1681, var2.field1683, var2.field1675, -597, var2.field1676);
                        var2.field1684 = -1;
                        if (var2.field1677 == var2.field1674 && var2.field1677 == -1) {
                            var2.method1();
                        } else if (var2.field1677 == var2.field1674 && var2.field1678 == var2.field1675 && var2.field1679 == var2.field1676) {
                            var2.method1();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZBI)V")
    public final void method109(boolean arg0, byte arg1, int arg2) {
        signlink.midivol = arg2;
        if (arg1 != 15) {
            this.field284 = !this.field284;
        }
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method110(int arg0, int arg1) {
        if (arg1 != -36584) {
            this.field218 = 46;
        }
        if (!field366) {
            if (class8.field676[17] >= arg0) {
                class19 var3 = class8.field670[17];
                int var4 = var3.field896 * var3.field895 - 1;
                int var5 = this.field504 * var3.field895 * 2;
                byte[] var6 = var3.field893;
                byte[] var7 = this.field505;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field893 = var7;
                this.field505 = var6;
                class8.method230(this.field597, 17);
                ++field548;
                if (field548 > 175) {
                    field548 = 0;
                    this.field334.method338(0, 243);
                    this.field334.method339(107);
                }
            }
            if (class8.field676[24] >= arg0) {
                class19 var9 = class8.field670[24];
                int var10 = var9.field896 * var9.field895 - 1;
                int var11 = this.field504 * var9.field895 * 2;
                byte[] var12 = var9.field893;
                byte[] var13 = this.field505;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field893 = var13;
                this.field505 = var12;
                class8.method230(this.field597, 24);
                ++field520;
                if (field520 > 1909) {
                    field520 = 0;
                    this.field334.method338(0, 228);
                    this.field334.method339(0);
                    int var15 = this.field334.field1065;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field334.method339(94);
                    }
                    this.field334.method339((int) (Math.random() * 256.0D));
                    this.field334.method339(30);
                    this.field334.method340(58788);
                    this.field334.method339((int) (Math.random() * 256.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field334.method339(71);
                    }
                    this.field334.method339(175);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field334.method339(89);
                    }
                    this.field334.method339(13);
                    this.field334.method340(41631);
                    this.field334.method348(this.field334.field1065 - var15, (byte) 1);
                }
            }
            if (class8.field676[34] >= arg0) {
                class19 var16 = class8.field670[34];
                int var17 = var16.field896 * var16.field895 - 1;
                int var18 = this.field504 * var16.field895 * 2;
                byte[] var19 = var16.field893;
                byte[] var20 = this.field505;
                for (int var21 = 0; var21 <= var17; ++var21) {
                    var20[var21] = var19[var21 - var18 & var17];
                }
                var16.field893 = var20;
                this.field505 = var19;
                class8.method230(this.field597, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKHOMSBHW;II)V")
    private final void method111(class30 arg0, int arg1, int arg2) {
        arg0.method359((byte) 9);
        int var4 = arg0.method360(true, 1);
        if (arg2 != 0) {
            this.field334.method339(248);
        }
        if (var4 != 0) {
            int var5 = arg0.method360(true, 2);
            if (var5 == 0) {
                this.field417[this.field416++] = this.field412;
            } else if (var5 == 1) {
                int var6 = arg0.method360(true, 3);
                field285.method576(var6, false, 1);
                int var7 = arg0.method360(true, 1);
                if (var7 == 1) {
                    this.field417[this.field416++] = this.field412;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method360(true, 3);
                field285.method576(var8, true, 1);
                int var9 = arg0.method360(true, 3);
                field285.method576(var9, true, 1);
                int var10 = arg0.method360(true, 1);
                if (var10 == 1) {
                    this.field417[this.field416++] = this.field412;
                }
            } else if (var5 == 3) {
                int var11 = arg0.method360(true, 1);
                this.field358 = arg0.method360(true, 2);
                int var12 = arg0.method360(true, 1);
                if (var12 == 1) {
                    this.field417[this.field416++] = this.field412;
                }
                int var13 = arg0.method360(true, 7);
                int var14 = arg0.method360(true, 7);
                field285.method577(var14, var11 == 1, true, var13);
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method112(int arg0) {
        if (arg0 != 0) {
            this.field309 = null;
        }
        if (field366 && this.field495 == 2 && class46.field1275 != this.field358) {
            this.field442.method465(false);
            this.field458.method248(1, 151, "Loading - please wait.", 257, 0);
            this.field458.method248(1, 150, "Loading - please wait.", 256, 16777215);
            this.field442.method466(2, super.field1175, 4, 4);
            this.field495 = 1;
            this.field394 = System.currentTimeMillis();
        }
        if (this.field495 == 1) {
            int var2 = this.method113((byte) -23);
            if (var2 != 0 && System.currentTimeMillis() - this.field394 > 360000L) {
                signlink.reporterror(this.field312 + " glcfb " + this.field206 + "," + var2 + "," + field366 + "," + this.field169[0] + "," + this.field236.method537() + "," + this.field358 + "," + this.field247 + "," + this.field248);
                this.field394 = System.currentTimeMillis();
            }
        }
        if (this.field495 == 2 && this.field449 != this.field358) {
            this.field449 = this.field358;
            this.method188(this.field358, this.field434);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)I")
    public final int method113(byte arg0) {
        for (int var2 = 0; var2 < this.field463.length; ++var2) {
            if (this.field463[var2] == null && this.field316[var2] != -1) {
                return -1;
            }
            if (this.field322[var2] == null && this.field317[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field463.length; ++var4) {
            byte[] var5 = this.field322[var4];
            if (var5 != null) {
                int var6 = (this.field315[var4] >> 8) * 64 - this.field537;
                int var7 = (this.field315[var4] & 255) * 64 - this.field538;
                if (this.field238) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class46.method475(var6, -37, var7, var5);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field545) {
            return -4;
        } else {
            this.field495 = 2;
            class46.field1275 = this.field358;
            this.method82((byte) -54);
            this.field334.method338(0, 253);
            if (arg0 != -23) {
                this.method116();
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILAMSZZFWC;)V")
    public final void method114(int arg0, class2 arg1) {
        while (arg0 >= 0) {
            this.field597 = this.field619.method526();
        }
        int var3 = arg1.field54;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field542;
                if (this.field543 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field50 = "";
                    arg1.field46 = 0;
                } else {
                    if (this.field583[var3] == 0) {
                        arg1.field50 = "@red@Offline";
                    } else if (this.field583[var3] == field363) {
                        arg1.field50 = "@gre@World-" + (this.field583[var3] - 9);
                    } else {
                        arg1.field50 = "@yel@World-" + (this.field583[var3] - 9);
                    }
                    arg1.field46 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field542;
                if (this.field543 != 2) {
                    var6 = 0;
                }
                arg1.field65 = var6 * 15 + 20;
                if (arg1.field65 <= arg1.field13) {
                    arg1.field65 = arg1.field13 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field543 == 0) {
                    arg1.field50 = "Loading ignore list";
                    arg1.field46 = 0;
                } else if (var3 == 1 && this.field543 == 0) {
                    arg1.field50 = "Please wait...";
                    arg1.field46 = 0;
                } else {
                    int var7 = this.field498;
                    if (this.field543 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field50 = "";
                        arg1.field46 = 0;
                    } else {
                        arg1.field50 = class61.method584(true, class61.method581(this.field201[var3], 581));
                        arg1.field46 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field65 = this.field498 * 15 + 20;
                if (arg1.field65 <= arg1.field13) {
                    arg1.field65 = arg1.field13 + 1;
                }
            } else if (var3 == 327) {
                arg1.field62 = 150;
                arg1.field63 = (int) (Math.sin((double) field464 / 40.0D) * 256.0D) & 2047;
                if (this.field217) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field308[var8];
                        if (var15 >= 0 && !class43.field1243[var15].method470(0)) {
                            return;
                        }
                    }
                    this.field217 = false;
                    class17[] var9 = new class17[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field308[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class43.field1243[var14].method471((byte) -23);
                        }
                    }
                    class17 var12 = new class17(var9, false, var10);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field193[var13] != 0) {
                            var12.method299(field570[var13][0], field570[var13][this.field193[var13]]);
                            if (var13 == 1) {
                                var12.method299(field575[0], field575[this.field193[var13]]);
                            }
                        }
                    }
                    var12.method292(-20376);
                    var12.method293((byte) 1, class9.field682[field285.field1545].field684[0]);
                    var12.method302(64, 850, -30, -50, -30, true);
                    arg1.field37 = 5;
                    arg1.field38 = 0;
                    class2.method6(5, var12, 0, -855);
                }
            } else if (var3 == 324) {
                if (this.field190 == null) {
                    this.field190 = arg1.field29;
                    this.field191 = arg1.field57;
                }
                if (this.field229) {
                    arg1.field29 = this.field191;
                } else {
                    arg1.field29 = this.field190;
                }
            } else if (var3 == 325) {
                if (this.field190 == null) {
                    this.field190 = arg1.field29;
                    this.field191 = arg1.field57;
                }
                if (this.field229) {
                    arg1.field29 = this.field190;
                } else {
                    arg1.field29 = this.field191;
                }
            } else if (var3 == 600) {
                arg1.field50 = this.field326;
                if (field464 % 20 < 10) {
                    arg1.field50 = arg1.field50 + "|";
                } else {
                    arg1.field50 = arg1.field50 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field184 >= 1) {
                        if (this.field557) {
                            arg1.field55 = 16711680;
                            arg1.field50 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field55 = 16777215;
                            arg1.field50 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field50 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field615 != 0) {
                        String var16;
                        if (this.field214 == 0) {
                            var16 = "earlier today";
                        } else if (this.field214 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field214 + " days ago";
                        }
                        arg1.field50 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg1.field50 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field588 == 0) {
                        arg1.field50 = "0 unread messages";
                        arg1.field55 = 16776960;
                    }
                    if (this.field588 == 1) {
                        arg1.field50 = "1 unread message";
                        arg1.field55 = 65280;
                    }
                    if (this.field588 > 1) {
                        arg1.field50 = this.field588 + " unread messages";
                        arg1.field55 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field342 == 201) {
                        if (this.field283 == 1) {
                            arg1.field50 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field50 = "";
                        }
                    } else if (this.field342 == 200) {
                        arg1.field50 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field342 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field342 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field342 + " days ago";
                        }
                        arg1.field50 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field342 == 201) {
                        if (this.field283 == 1) {
                            arg1.field50 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field50 = "";
                        }
                    } else if (this.field342 == 200) {
                        arg1.field50 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field50 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field342 == 201) {
                        if (this.field283 == 1) {
                            arg1.field50 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field50 = "";
                        }
                    } else if (this.field342 == 200) {
                        arg1.field50 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field50 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field543 == 0) {
            arg1.field50 = "Loading friend list";
            arg1.field46 = 0;
        } else if (var3 == 1 && this.field543 == 1) {
            arg1.field50 = "Connecting to friendserver";
            arg1.field46 = 0;
        } else if (var3 == 2 && this.field543 != 2) {
            arg1.field50 = "Please wait...";
            arg1.field46 = 0;
        } else {
            int var4 = this.field542;
            if (this.field543 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field50 = "";
                arg1.field46 = 0;
            } else {
                arg1.field50 = this.field494[var3];
                arg1.field46 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method115(int arg0, int arg1) {
        if (arg1 >= field231 && arg1 <= field231) {
            if (arg0 < 100000) {
                return String.valueOf(arg0);
            } else {
                return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method116() {
        this.method70("Starting up", 20, (byte) 7);
        if (signlink.sunjava) {
            super.field1169 = 5;
        }
        if (field432) {
            this.field261 = true;
        } else {
            field432 = true;
            boolean var1 = false;
            String var2 = this.method74(true);
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
                this.field241 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field169[var3] = new class18(signlink.cache_dat, 516, 500000, var3 + 1, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method94(false);
                    this.field165 = this.method150("title screen", 1, "title", 25, -482, this.field531[1]);
                    this.field457 = new class11(28290, false, this.field165, "p11_full");
                    this.field458 = new class11(28290, false, this.field165, "p12_full");
                    this.field459 = new class11(28290, false, this.field165, "b12_full");
                    this.field460 = new class11(28290, true, this.field165, "q8_full");
                    this.method75(0);
                    this.method76(-744);
                    class55 var4 = this.method150("config", 2, "config", 30, -482, this.field531[2]);
                    class55 var5 = this.method150("interface", 3, "interface", 35, -482, this.field531[3]);
                    class55 var6 = this.method150("2d graphics", 4, "media", 40, -482, this.field531[4]);
                    class55 var7 = this.method150("textures", 6, "textures", 45, -482, this.field531[6]);
                    class55 var8 = this.method150("chat system", 7, "wordenc", 50, -482, this.field531[7]);
                    class55 var9 = this.method150("sound effects", 8, "sounds", 55, -482, this.field531[8]);
                    this.field450 = new byte[4][104][104];
                    this.field405 = new int[4][105][105];
                    this.field369 = new class4(4, this.field405, (byte) 7, 104, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field456[var10] = new class5(104, 0, 104);
                    }
                    this.field244 = new class57(512, 512);
                    class55 var11 = this.method150("update list", 5, "versionlist", 60, -482, this.field531[5]);
                    this.method70("Connecting to update server", 60, (byte) 7);
                    this.field236 = new class54();
                    this.field236.method530(var11, this);
                    class48.method500(this.field236.method542(-7482));
                    class17.method282(this.field236.method548(0, 0), this.field236);
                    if (!field366) {
                        this.field592 = 0;
                        try {
                            this.field592 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field593 = true;
                        this.field236.method531(2, this.field592);
                        while (this.field236.method537() > 0) {
                            this.method133(669);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field236.field1411 > 3) {
                                this.method206("ondemand");
                                return;
                            }
                        }
                    }
                    this.method70("Requesting animations", 65, (byte) 7);
                    int var12 = this.field236.method548(1, 0);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field236.method531(1, var13);
                    }
                    while (this.field236.method537() > 0) {
                        int var14 = var12 - this.field236.method537();
                        if (var14 > 0) {
                            this.method70("Loading animations - " + var14 * 100 / var12 + "%", 65, (byte) 7);
                        }
                        this.method133(669);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field236.field1411 > 3) {
                            this.method206("ondemand");
                            return;
                        }
                    }
                    this.method70("Requesting models", 70, (byte) 7);
                    int var15 = this.field236.method548(0, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field236.method540(var16, 2);
                        if ((var17 & 1) != 0) {
                            this.field236.method531(0, var16);
                        }
                    }
                    int var18 = this.field236.method537();
                    while (this.field236.method537() > 0) {
                        int var19 = var18 - this.field236.method537();
                        if (var19 > 0) {
                            this.method70("Loading models - " + var19 * 100 / var18 + "%", 70, (byte) 7);
                        }
                        this.method133(669);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field169[0] != null) {
                        this.method70("Requesting maps", 75, (byte) 7);
                        this.field236.method531(3, this.field236.method541(0, 47, 48, false));
                        this.field236.method531(3, this.field236.method541(1, 47, 48, false));
                        this.field236.method531(3, this.field236.method541(0, 48, 48, false));
                        this.field236.method531(3, this.field236.method541(1, 48, 48, false));
                        this.field236.method531(3, this.field236.method541(0, 49, 48, false));
                        this.field236.method531(3, this.field236.method541(1, 49, 48, false));
                        this.field236.method531(3, this.field236.method541(0, 47, 47, false));
                        this.field236.method531(3, this.field236.method541(1, 47, 47, false));
                        this.field236.method531(3, this.field236.method541(0, 48, 47, false));
                        this.field236.method531(3, this.field236.method541(1, 48, 47, false));
                        this.field236.method531(3, this.field236.method541(0, 48, 148, false));
                        this.field236.method531(3, this.field236.method541(1, 48, 148, false));
                        int var20 = this.field236.method537();
                        while (this.field236.method537() > 0) {
                            int var21 = var20 - this.field236.method537();
                            if (var21 > 0) {
                                this.method70("Loading maps - " + var21 * 100 / var20 + "%", 75, (byte) 7);
                            }
                            this.method133(669);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field236.method548(0, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field236.method540(var23, 2);
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
                            this.field236.method536(var23, true, var25, 0);
                        }
                    }
                    this.field236.method539(0, field365);
                    if (!field366) {
                        int var26 = this.field236.method548(2, 0);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field236.method534(42477, var27)) {
                                this.field236.method536(var27, true, (byte) 1, 2);
                            }
                        }
                    }
                    this.method70("Unpacking media", 80, (byte) 7);
                    this.field270 = new class19(var6, "invback", 0);
                    this.field272 = new class19(var6, "chatback", 0);
                    this.field271 = new class19(var6, "mapback", 0);
                    this.field373 = new class19(var6, "backbase1", 0);
                    this.field374 = new class19(var6, "backbase2", 0);
                    this.field375 = new class19(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field232[var28] = new class19(var6, "sideicons", var28);
                    }
                    this.field577 = new class57(var6, "compass", 0);
                    this.field544 = new class57(var6, "mapedge", 0);
                    this.field544.method555(-177);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field469[var29] = new class19(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field596[var30] = new class57(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field267[var31] = new class57(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field546[var32] = new class57(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field522 = new class57(var6, "mapmarker", 0);
                    this.field523 = new class57(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field323[var33] = new class57(var6, "cross", var33);
                    }
                    this.field564 = new class57(var6, "mapdots", 0);
                    this.field565 = new class57(var6, "mapdots", 1);
                    this.field566 = new class57(var6, "mapdots", 2);
                    this.field567 = new class57(var6, "mapdots", 3);
                    this.field568 = new class57(var6, "mapdots", 4);
                    this.field225 = new class19(var6, "scrollbar", 0);
                    this.field226 = new class19(var6, "scrollbar", 1);
                    this.field250 = new class19(var6, "redstone1", 0);
                    this.field251 = new class19(var6, "redstone2", 0);
                    this.field252 = new class19(var6, "redstone3", 0);
                    this.field253 = new class19(var6, "redstone1", 0);
                    this.field253.method316(false);
                    this.field254 = new class19(var6, "redstone2", 0);
                    this.field254.method316(false);
                    this.field422 = new class19(var6, "redstone1", 0);
                    this.field422.method317(0);
                    this.field423 = new class19(var6, "redstone2", 0);
                    this.field423.method317(0);
                    this.field424 = new class19(var6, "redstone3", 0);
                    this.field424.method317(0);
                    this.field425 = new class19(var6, "redstone1", 0);
                    this.field425.method316(false);
                    this.field425.method317(0);
                    this.field426 = new class19(var6, "redstone2", 0);
                    this.field426.method316(false);
                    this.field426.method317(0);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field616[var34] = new class19(var6, "mod_icons", var34);
                    }
                    class57 var35 = new class57(var6, "backleft1", 0);
                    this.field395 = new class42(var35.field1482, 0, this.method192(-240), var35.field1483);
                    var35.method556((byte) -25, 0, 0);
                    class57 var36 = new class57(var6, "backleft2", 0);
                    this.field396 = new class42(var36.field1482, 0, this.method192(-240), var36.field1483);
                    var36.method556((byte) -25, 0, 0);
                    class57 var37 = new class57(var6, "backright1", 0);
                    this.field397 = new class42(var37.field1482, 0, this.method192(-240), var37.field1483);
                    var37.method556((byte) -25, 0, 0);
                    class57 var38 = new class57(var6, "backright2", 0);
                    this.field398 = new class42(var38.field1482, 0, this.method192(-240), var38.field1483);
                    var38.method556((byte) -25, 0, 0);
                    class57 var39 = new class57(var6, "backtop1", 0);
                    this.field399 = new class42(var39.field1482, 0, this.method192(-240), var39.field1483);
                    var39.method556((byte) -25, 0, 0);
                    class57 var40 = new class57(var6, "backvmid1", 0);
                    this.field400 = new class42(var40.field1482, 0, this.method192(-240), var40.field1483);
                    var40.method556((byte) -25, 0, 0);
                    class57 var41 = new class57(var6, "backvmid2", 0);
                    this.field401 = new class42(var41.field1482, 0, this.method192(-240), var41.field1483);
                    var41.method556((byte) -25, 0, 0);
                    class57 var42 = new class57(var6, "backvmid3", 0);
                    this.field402 = new class42(var42.field1482, 0, this.method192(-240), var42.field1483);
                    var42.method556((byte) -25, 0, 0);
                    class57 var43 = new class57(var6, "backhmid2", 0);
                    this.field403 = new class42(var43.field1482, 0, this.method192(-240), var43.field1483);
                    var43.method556((byte) -25, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field596[var48] != null) {
                            this.field596[var48].method554(var45 + var47, var44 + var47, (byte) -39, var46 + var47);
                        }
                        if (this.field469[var48] != null) {
                            this.field469[var48].method318(var45 + var47, var44 + var47, (byte) -39, var46 + var47);
                        }
                    }
                    this.method70("Unpacking textures", 83, (byte) 7);
                    class8.method228((byte) 5, var7);
                    class8.method232(-507, 0.8D);
                    class8.method227(20, 1);
                    this.method70("Unpacking config", 86, (byte) 7);
                    class9.method240(-457, var4);
                    class50.method506(var4);
                    class10.method243(-457, var4);
                    class15.method269(var4);
                    class59.method569(var4);
                    class43.method468(-457, var4);
                    class22.method321(-457, var4);
                    class24.method324(-457, var4);
                    class16.method279(-457, var4);
                    class15.field778 = field365;
                    if (!field366) {
                        this.method70("Unpacking sounds", 90, (byte) 7);
                        byte[] var49 = var9.method551("sounds.dat", (byte[]) null);
                        class30 var50 = new class30(var49, -982);
                        class3.method8(-457, var50);
                    }
                    this.method70("Unpacking interfaces", 95, (byte) 7);
                    class11[] var51 = new class11[] { this.field457, this.field458, this.field459, this.field460 };
                    class2.method7(var51, var6, var5, -38919);
                    this.method70("Preparing game engine", 100, (byte) 7);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field271.field893[this.field271.field895 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field353[var52] = var53;
                        this.field461[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field271.field893[this.field271.field895 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field529[var56 - 5] = var57 - 25;
                        this.field228[var56 - 5] = var58 - var57;
                    }
                    class8.method225(0, 96, 479);
                    this.field354 = class8.field668;
                    class8.method225(0, 261, 190);
                    this.field355 = class8.field668;
                    class8.method225(0, 334, 512);
                    this.field356 = class8.field668;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class8.field666[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class4.method51(500, 334, var60, 4, 512, 800);
                    class41.method427(var8);
                    this.field249 = new class20(this, 0);
                    this.method102(this.field249, 10);
                    class56.field1465 = this;
                    class50.field1361 = this;
                    class59.field1522 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field578 + " " + this.field287);
                    this.field587 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LAMSZZFWC;I)Z")
    public final boolean method117(class2 arg0, int arg1) {
        while (arg1 >= 0) {
            this.field256 = -1;
        }
        int var3 = arg0.field54;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field314[this.field524] = "Remove @whi@" + arg0.field50;
                this.field275[this.field524] = 172;
                ++this.field524;
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
            this.field314[this.field524] = "Remove @whi@" + this.field494[var3];
            this.field275[this.field524] = 940;
            ++this.field524;
            this.field314[this.field524] = "Message @whi@" + this.field494[var3];
            this.field275[this.field524] = 207;
            ++this.field524;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method118(byte arg0) {
        if (arg0 == 0) {
            if (this.field563 == 0) {
                int var2 = super.field1173 / 2 - 80;
                int var3 = super.field1174 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field1189 == 1 && super.field1190 >= var2 - 75 && super.field1190 <= var2 + 75 && super.field1191 >= var14 - 20 && super.field1191 <= var14 + 20) {
                    this.field563 = 3;
                    this.field478 = 0;
                }
                int var4 = super.field1173 / 2 + 80;
                if (super.field1189 == 1 && super.field1190 >= var4 - 75 && super.field1190 <= var4 + 75 && super.field1191 >= var14 - 20 && super.field1191 <= var14 + 20) {
                    this.field409 = "";
                    this.field410 = "Enter your username & password.";
                    this.field563 = 2;
                    this.field478 = 0;
                }
            } else if (this.field563 == 2) {
                int var5 = super.field1174 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field1189 == 1 && super.field1191 >= var16 - 15 && super.field1191 < var16) {
                    this.field478 = 0;
                }
                var5 = var16 + 15;
                if (super.field1189 == 1 && super.field1191 >= var5 - 15 && super.field1191 < var5) {
                    this.field478 = 1;
                }
                var5 += 15;
                int var6 = super.field1173 / 2 - 80;
                int var7 = super.field1174 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field1189 == 1 && super.field1190 >= var6 - 75 && super.field1190 <= var6 + 75 && super.field1191 >= var17 - 20 && super.field1191 <= var17 + 20) {
                    this.field292 = 0;
                    this.method179(this.field312, this.field313, false);
                    if (this.field222) {
                        return;
                    }
                }
                int var8 = super.field1173 / 2 + 80;
                if (super.field1189 == 1 && super.field1190 >= var8 - 75 && super.field1190 <= var8 + 75 && super.field1191 >= var17 - 20 && super.field1191 <= var17 + 20) {
                    this.field563 = 0;
                    this.field312 = "";
                    this.field313 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method414(this.field202);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field420.length(); ++var11) {
                            if (var9 == field420.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field478 == 0) {
                            if (var9 == 8 && this.field312.length() > 0) {
                                this.field312 = this.field312.substring(0, this.field312.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field478 = 1;
                            }
                            if (var10) {
                                this.field312 = this.field312 + (char) var9;
                            }
                            if (this.field312.length() > 12) {
                                this.field312 = this.field312.substring(0, 12);
                            }
                        } else if (this.field478 == 1) {
                            if (var9 == 8 && this.field313.length() > 0) {
                                this.field313 = this.field313.substring(0, this.field313.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field478 = 0;
                            }
                            if (var10) {
                                this.field313 = this.field313 + (char) var9;
                            }
                            if (this.field313.length() > 20) {
                                this.field313 = this.field313.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field563 == 3) {
                    int var12 = super.field1173 / 2;
                    int var13 = super.field1174 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field1189 == 1 && super.field1190 >= var12 - 75 && super.field1190 <= var12 + 75 && super.field1191 >= var18 - 20 && super.field1191 <= var18 + 20) {
                        this.field563 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILAMSZZFWC;)Z")
    public final boolean method119(int arg0, class2 arg1) {
        if (arg0 <= 0) {
            this.field595 = !this.field595;
        }
        if (arg1.field23 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field23.length; ++var3) {
                int var4 = this.method157(0, var3, arg1);
                int var5 = arg1.field5[var3];
                if (arg1.field23[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field23[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field23[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)Z")
    public final boolean method120(int arg0) {
        if (arg0 != 49583) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method121(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field542 >= 100 && this.field496 != 1) {
                this.method182(0, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field542 >= 200) {
                this.method182(0, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class61.method584(true, class61.method581(arg0, 581));
                for (int var5 = 0; var5 < this.field542; ++var5) {
                    if (this.field483[var5] == arg0) {
                        this.method182(0, "", 0, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field498; ++var6) {
                    if (this.field201[var6] == arg0) {
                        this.method182(0, "", 0, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field285.field1665)) {
                    this.field494[this.field542] = var4;
                    this.field483[this.field542] = arg0;
                    this.field583[this.field542] = 0;
                    ++this.field542;
                    this.field521 = true;
                    this.field334.method338(0, 160);
                    this.field334.method345(arg0, (byte) 12);
                    this.field255 += arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method122(int arg0) {
        ++field168;
        if (arg0 == 2) {
            if (field168 > 1606) {
                field168 = 0;
                this.field334.method338(0, 118);
                this.field334.method339(0);
                int var2 = this.field334.field1065;
                this.field334.method340(27087);
                this.field334.method339(162);
                this.field334.method340(22009);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field334.method340(63882);
                }
                this.field334.method340(54058);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field334.method340(58701);
                }
                this.field334.method339((int) (Math.random() * 256.0D));
                this.field334.method340((int) (Math.random() * 65536.0D));
                this.field334.method340(32700);
                this.field334.method339((int) (Math.random() * 256.0D));
                this.field334.method348(this.field334.field1065 - var2, (byte) 1);
            }
            while (true) {
                int var3;
                do {
                    while (true) {
                        var3 = this.method414(this.field202);
                        if (var3 == -1) {
                            return;
                        }
                        if (this.field345 != -1 && this.field345 == this.field344) {
                            if (var3 == 8 && this.field326.length() > 0) {
                                this.field326 = this.field326.substring(0, this.field326.length() - 1);
                            }
                            break;
                        }
                        if (this.field362) {
                            if (var3 >= 32 && var3 <= 122 && this.field289.length() < 80) {
                                this.field289 = this.field289 + (char) var3;
                                this.field530 = true;
                            }
                            if (var3 == 8 && this.field289.length() > 0) {
                                this.field289 = this.field289.substring(0, this.field289.length() - 1);
                                this.field530 = true;
                            }
                            if (var3 == 13 || var3 == 10) {
                                this.field362 = false;
                                this.field530 = true;
                                if (this.field404 == 1) {
                                    long var4 = class61.method580(this.field289);
                                    this.method121(var4, 0);
                                }
                                if (this.field404 == 2 && this.field542 > 0) {
                                    long var6 = class61.method580(this.field289);
                                    this.method171(var6, 349);
                                }
                                if (this.field404 == 3 && this.field289.length() > 0) {
                                    this.field334.method338(0, 218);
                                    this.field334.method339(0);
                                    int var8 = this.field334.field1065;
                                    this.field334.method345(this.field306, (byte) 12);
                                    class28.method335(this.field289, this.field334, this.field371);
                                    this.field334.method348(this.field334.field1065 - var8, (byte) 1);
                                    this.field289 = class28.method336(this.field336, this.field289);
                                    this.field289 = class41.method437(this.field336, this.field289);
                                    this.method182(0, class61.method584(true, class61.method581(this.field306, 581)), 6, this.field289);
                                    if (this.field167 == 2) {
                                        this.field167 = 1;
                                        this.field584 = true;
                                        this.field334.method338(0, 83);
                                        this.field334.method339(this.field576);
                                        this.field334.method339(this.field167);
                                        this.field334.method339(this.field319);
                                    }
                                }
                                if (this.field404 == 4 && this.field498 < 100) {
                                    long var9 = class61.method580(this.field289);
                                    this.method141(true, var9);
                                }
                                if (this.field404 == 5 && this.field498 > 0) {
                                    long var11 = class61.method580(this.field289);
                                    this.method88(var11, 3);
                                }
                            }
                        } else if (this.field240 == 1) {
                            if (var3 >= 48 && var3 <= 57 && this.field452.length() < 10) {
                                this.field452 = this.field452 + (char) var3;
                                this.field530 = true;
                            }
                            if (var3 == 8 && this.field452.length() > 0) {
                                this.field452 = this.field452.substring(0, this.field452.length() - 1);
                                this.field530 = true;
                            }
                            if (var3 == 13 || var3 == 10) {
                                if (this.field452.length() > 0) {
                                    int var13 = 0;
                                    try {
                                        var13 = Integer.parseInt(this.field452);
                                    } catch (Exception var23) {
                                    }
                                    this.field334.method338(0, 86);
                                    this.field334.method343(var13);
                                }
                                this.field240 = 0;
                                this.field530 = true;
                            }
                        } else if (this.field240 == 2) {
                            if (var3 >= 32 && var3 <= 122 && this.field452.length() < 12) {
                                this.field452 = this.field452 + (char) var3;
                                this.field530 = true;
                            }
                            if (var3 == 8 && this.field452.length() > 0) {
                                this.field452 = this.field452.substring(0, this.field452.length() - 1);
                                this.field530 = true;
                            }
                            if (var3 == 13 || var3 == 10) {
                                if (this.field452.length() > 0) {
                                    this.field334.method338(0, 210);
                                    this.field334.method345(class61.method580(this.field452), (byte) 12);
                                }
                                this.field240 = 0;
                                this.field530 = true;
                            }
                        } else if (this.field455 == -1) {
                            if (var3 >= 32 && var3 <= 122 && this.field372.length() < 80) {
                                this.field372 = this.field372 + (char) var3;
                                this.field530 = true;
                            }
                            if (var3 == 8 && this.field372.length() > 0) {
                                this.field372 = this.field372.substring(0, this.field372.length() - 1);
                                this.field530 = true;
                            }
                            if ((var3 == 13 || var3 == 10) && this.field372.length() > 0) {
                                if (this.field184 == 2) {
                                    if (this.field372.equals("::clientdrop")) {
                                        this.method66(true);
                                    }
                                    if (this.field372.equals("::lag")) {
                                        this.method191(0);
                                    }
                                    if (this.field372.equals("::prefetchmusic")) {
                                        for (int var14 = 0; var14 < this.field236.method548(2, 0); ++var14) {
                                            this.field236.method536(var14, true, (byte) 1, 2);
                                        }
                                    }
                                    if (this.field372.equals("::fpson")) {
                                        field445 = true;
                                    }
                                    if (this.field372.equals("::fpsoff")) {
                                        field445 = false;
                                    }
                                    if (this.field372.equals("::noclip")) {
                                        for (int var15 = 0; var15 < 4; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                for (int var17 = 1; var17 < 103; ++var17) {
                                                    this.field456[var15].field636[var16][var17] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (this.field372.startsWith("::")) {
                                    this.field334.method338(0, 217);
                                    this.field334.method339(this.field372.length() - 1);
                                    this.field334.method346(this.field372.substring(2));
                                } else {
                                    String var18 = this.field372.toLowerCase();
                                    byte var19 = 0;
                                    if (var18.startsWith("yellow:")) {
                                        var19 = 0;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var18.startsWith("red:")) {
                                        var19 = 1;
                                        this.field372 = this.field372.substring(4);
                                    } else if (var18.startsWith("green:")) {
                                        var19 = 2;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var18.startsWith("cyan:")) {
                                        var19 = 3;
                                        this.field372 = this.field372.substring(5);
                                    } else if (var18.startsWith("purple:")) {
                                        var19 = 4;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var18.startsWith("white:")) {
                                        var19 = 5;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var18.startsWith("flash1:")) {
                                        var19 = 6;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var18.startsWith("flash2:")) {
                                        var19 = 7;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var18.startsWith("flash3:")) {
                                        var19 = 8;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var18.startsWith("glow1:")) {
                                        var19 = 9;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var18.startsWith("glow2:")) {
                                        var19 = 10;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var18.startsWith("glow3:")) {
                                        var19 = 11;
                                        this.field372 = this.field372.substring(6);
                                    }
                                    String var20 = this.field372.toLowerCase();
                                    byte var21 = 0;
                                    if (var20.startsWith("wave:")) {
                                        var21 = 1;
                                        this.field372 = this.field372.substring(5);
                                    } else if (var20.startsWith("wave2:")) {
                                        var21 = 2;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var20.startsWith("shake:")) {
                                        var21 = 3;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var20.startsWith("scroll:")) {
                                        var21 = 4;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var20.startsWith("slide:")) {
                                        var21 = 5;
                                        this.field372 = this.field372.substring(6);
                                    }
                                    this.field334.method338(0, 184);
                                    this.field334.method339(0);
                                    int var22 = this.field334.field1065;
                                    this.field334.method365(var21, (byte) 64);
                                    this.field334.method367(var19, -34719);
                                    this.field479.field1065 = 0;
                                    class28.method335(this.field372, this.field479, this.field371);
                                    this.field334.method387(0, this.field479.field1064, this.field479.field1065, false);
                                    this.field334.method348(this.field334.field1065 - var22, (byte) 1);
                                    this.field372 = class28.method336(this.field336, this.field372);
                                    this.field372 = class41.method437(this.field336, this.field372);
                                    field285.field1544 = this.field372;
                                    field285.field1589 = var19;
                                    field285.field1564 = var21;
                                    field285.field1548 = 150;
                                    if (this.field184 == 2) {
                                        this.method182(0, "@cr2@" + field285.field1665, 2, field285.field1544);
                                    } else if (this.field184 == 1) {
                                        this.method182(0, "@cr1@" + field285.field1665, 2, field285.field1544);
                                    } else {
                                        this.method182(0, field285.field1665, 2, field285.field1544);
                                    }
                                    if (this.field576 == 2) {
                                        this.field576 = 3;
                                        this.field584 = true;
                                        this.field334.method338(0, 83);
                                        this.field334.method339(this.field576);
                                        this.field334.method339(this.field167);
                                        this.field334.method339(this.field319);
                                    }
                                }
                                this.field372 = "";
                                this.field530 = true;
                            }
                        }
                    }
                } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
                if (this.field326.length() < 12) {
                    this.field326 = this.field326 + (char) var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (arg0 != 93) {
            this.field256 = this.field431.method349();
        }
        if (super.field1189 == 1) {
            if (super.field1190 >= 6 && super.field1190 <= 106 && super.field1191 >= 467 && super.field1191 <= 499) {
                this.field576 = (this.field576 + 1) % 4;
                this.field584 = true;
                this.field530 = true;
                this.field334.method338(0, 83);
                this.field334.method339(this.field576);
                this.field334.method339(this.field167);
                this.field334.method339(this.field319);
            }
            if (super.field1190 >= 135 && super.field1190 <= 235 && super.field1191 >= 467 && super.field1191 <= 499) {
                this.field167 = (this.field167 + 1) % 3;
                this.field584 = true;
                this.field530 = true;
                this.field334.method338(0, 83);
                this.field334.method339(this.field576);
                this.field334.method339(this.field167);
                this.field334.method339(this.field319);
            }
            if (super.field1190 >= 273 && super.field1190 <= 373 && super.field1191 >= 467 && super.field1191 <= 499) {
                this.field319 = (this.field319 + 1) % 3;
                this.field584 = true;
                this.field530 = true;
                this.field334.method338(0, 83);
                this.field334.method339(this.field576);
                this.field334.method339(this.field167);
                this.field334.method339(this.field319);
            }
            if (super.field1190 >= 412 && super.field1190 <= 512 && super.field1191 >= 467 && super.field1191 <= 499) {
                if (this.field345 == -1) {
                    this.method146(27555);
                    this.field326 = "";
                    this.field557 = false;
                    for (int var2 = 0; var2 < class2.field66.length; ++var2) {
                        if (class2.field66[var2] != null && class2.field66[var2].field54 == 600) {
                            this.field344 = this.field345 = class2.field66[var2].field7;
                            return;
                        }
                    }
                    return;
                }
                this.method182(0, "", 0, "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBI)V")
    public final void method124(int arg0, byte arg1, int arg2) {
        if (arg1 != 0) {
            this.field334.method339(80);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field348[var5] != null) {
                int var6 = this.field346[var5];
                int var7 = 70 - var4 * 14 + this.field462 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field347[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field576 == 0 || this.field576 == 1 && this.method135(false, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field285.field1665)) {
                        if (this.field184 >= 1) {
                            this.field314[this.field524] = "Report abuse @whi@" + var8;
                            this.field275[this.field524] = 872;
                            ++this.field524;
                        }
                        this.field314[this.field524] = "Add ignore @whi@" + var8;
                        this.field275[this.field524] = 616;
                        ++this.field524;
                        this.field314[this.field524] = "Add friend @whi@" + var8;
                        this.field275[this.field524] = 983;
                        ++this.field524;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field220 == 0 && (var6 == 7 || this.field167 == 0 || this.field167 == 1 && this.method135(false, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field184 >= 1) {
                            this.field314[this.field524] = "Report abuse @whi@" + var8;
                            this.field275[this.field524] = 872;
                            ++this.field524;
                        }
                        this.field314[this.field524] = "Add ignore @whi@" + var8;
                        this.field275[this.field524] = 616;
                        ++this.field524;
                        this.field314[this.field524] = "Add friend @whi@" + var8;
                        this.field275[this.field524] = 983;
                        ++this.field524;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field319 == 0 || this.field319 == 1 && this.method135(false, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field314[this.field524] = "Accept trade @whi@" + var8;
                        this.field275[this.field524] = 765;
                        ++this.field524;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field220 == 0 && this.field167 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field319 == 0 || this.field319 == 1 && this.method135(false, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field314[this.field524] = "Accept challenge @whi@" + var8;
                        this.field275[this.field524] = 924;
                        ++this.field524;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method125(int arg0) {
        if (arg0 == -32557) {
            signlink.midifade = 0;
            signlink.midi = "stop";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method126(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field256 = this.field431.method349();
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILYNSPIQRH;I)V")
    public final void method127(byte arg0, int arg1, int arg2, class69 arg3, int arg4) {
        if (arg0 != 0) {
            this.field182 = -313;
        }
        if (field285 != arg3) {
            if (this.field524 < 400) {
                String var6;
                if (arg3.field1670 == 0) {
                    var6 = arg3.field1665 + method145(field285.field1645, this.field391, arg3.field1645) + " (level-" + arg3.field1645 + ")";
                } else {
                    var6 = arg3.field1665 + " (skill-" + arg3.field1670 + ")";
                }
                if (this.field173 == 1) {
                    this.field314[this.field524] = "Use " + this.field177 + " with @whi@" + var6;
                    this.field275[this.field524] = 39;
                    this.field276[this.field524] = arg2;
                    this.field273[this.field524] = arg4;
                    this.field274[this.field524] = arg1;
                    ++this.field524;
                } else if (this.field301 == 1) {
                    if ((this.field303 & 8) == 8) {
                        this.field314[this.field524] = this.field304 + " @whi@" + var6;
                        this.field275[this.field524] = 368;
                        this.field276[this.field524] = arg2;
                        this.field273[this.field524] = arg4;
                        this.field274[this.field524] = arg1;
                        ++this.field524;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field475[var7] != null) {
                            this.field314[this.field524] = this.field475[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field475[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field1645 > field285.field1645) {
                                    var9 = 2000;
                                }
                                if (field285.field1666 != 0 && arg3.field1666 != 0) {
                                    if (field285.field1666 == arg3.field1666) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field476[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field275[this.field524] = var9 + 509;
                            }
                            if (var7 == 1) {
                                this.field275[this.field524] = var9 + 939;
                            }
                            if (var7 == 2) {
                                this.field275[this.field524] = var9 + 516;
                            }
                            if (var7 == 3) {
                                this.field275[this.field524] = var9 + 860;
                            }
                            if (var7 == 4) {
                                this.field275[this.field524] = var9 + 92;
                            }
                            this.field276[this.field524] = arg2;
                            this.field273[this.field524] = arg4;
                            this.field274[this.field524] = arg1;
                            ++this.field524;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field524; ++var8) {
                    if (this.field275[var8] == 451) {
                        this.field314[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)I")
    public final int method128(boolean arg0) {
        int var2 = 3;
        if (!arg0) {
            this.method116();
        }
        if (this.field296 < 310) {
            int var3 = this.field293 >> 7;
            int var4 = this.field295 >> 7;
            int var5 = field285.field1539 >> 7;
            int var6 = field285.field1540 >> 7;
            if ((this.field450[this.field358][var3][var4] & 4) != 0) {
                var2 = this.field358;
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
                    if ((this.field450[this.field358][var3][var4] & 4) != 0) {
                        var2 = this.field358;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field450[this.field358][var3][var4] & 4) != 0) {
                            var2 = this.field358;
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
                    if ((this.field450[this.field358][var3][var4] & 4) != 0) {
                        var2 = this.field358;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field450[this.field358][var3][var4] & 4) != 0) {
                            var2 = this.field358;
                        }
                    }
                }
            }
        }
        if ((this.field450[this.field358][field285.field1539 >> 7][field285.field1540 >> 7] & 4) != 0) {
            var2 = this.field358;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)I")
    public final int method129(int arg0) {
        if (arg0 != 33033) {
            this.field309 = null;
        }
        int var2 = this.method156(this.field358, 478, this.field293, this.field295);
        return var2 - this.field294 < 800 && (this.field450[this.field358][this.field293 >> 7][this.field295 >> 7] & 4) != 0 ? this.field358 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILAMSZZFWC;ZI)V")
    public final void method130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6, boolean arg7, int arg8) {
        if (this.field439) {
            this.field324 = 32;
        } else {
            this.field324 = 0;
        }
        this.field439 = false;
        if (arg4 != -12137) {
            field231 = 423;
        }
        if (arg8 >= arg5 && arg8 < arg5 + 16 && arg1 >= arg2 && arg1 < arg2 + 16) {
            arg6.field49 -= this.field181 * 4;
            if (arg7) {
                this.field521 = true;
                return;
            }
        } else if (arg8 >= arg5 && arg8 < arg5 + 16 && arg1 >= arg2 + arg3 - 16 && arg1 < arg2 + arg3) {
            arg6.field49 += this.field181 * 4;
            if (arg7) {
                this.field521 = true;
                return;
            }
        } else {
            if (arg8 < arg5 - this.field324 || arg8 >= arg5 + 16 + this.field324 || arg1 < arg2 + 16 || arg1 >= arg2 + arg3 - 16 || this.field181 <= 0) {
                return;
            }
            int var10 = (arg3 - 32) * arg3 / arg0;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg1 - arg2 - 16 - var10 / 2;
            int var12 = arg3 - 32 - var10;
            arg6.field49 = (arg0 - arg3) * var11 / var12;
            if (arg7) {
                this.field521 = true;
            }
            this.field439 = true;
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method131(int arg0) {
        for (int var2 = -1; var2 < this.field414; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field412;
            } else {
                var3 = this.field415[var2];
            }
            class69 var4 = this.field413[var3];
            if (var4 != null) {
                this.method196(1, var4, 9);
            }
        }
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method132(int arg0) {
        ++this.field560;
        this.method154(true, -21136);
        this.method165(this.field492, true);
        this.method154(false, -21136);
        this.method165(this.field492, false);
        this.method84(true);
        this.method73(204);
        if (!this.field572) {
            int var2 = this.field465;
            if (this.field525 / 256 > var2) {
                var2 = this.field525 / 256;
            }
            if (this.field335[4] && this.field381[4] + 128 > var2) {
                var2 = this.field381[4] + 128;
            }
            int var3 = this.field609 + this.field466 & 2047;
            this.method105(this.field218, this.field598, var2, this.field599, var3, this.method156(this.field358, 478, field285.field1539, field285.field1540) - 50, var2 * 3 + 600);
        }
        int var4;
        if (!this.field572) {
            var4 = this.method128(true);
        } else {
            var4 = this.method129(33033);
        }
        int var5 = this.field293;
        int var6 = this.field294;
        int var7 = this.field295;
        int var8 = this.field296;
        int var9 = this.field297;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field335[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field447[var10] * 2 + 1) - (double) this.field447[var10] + Math.sin((double) this.field360[var10] / 100.0D * (double) this.field290[var10]) * (double) this.field381[var10]);
                if (var10 == 0) {
                    this.field293 += var13;
                }
                if (var10 == 1) {
                    this.field294 += var13;
                }
                if (var10 == 2) {
                    this.field295 += var13;
                }
                if (var10 == 3) {
                    this.field297 = this.field297 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field296 += var13;
                    if (this.field296 < 128) {
                        this.field296 = 128;
                    }
                    if (this.field296 > 383) {
                        this.field296 = 383;
                    }
                }
            }
        }
        int var11 = class8.field677;
        int var12 = 65 / arg0;
        class17.field870 = true;
        class17.field873 = 0;
        class17.field871 = super.field1183 - 4;
        class17.field872 = super.field1184 - 4;
        class39.method418(320);
        this.field369.method54(var4, this.field295, this.field296, this.field297, this.field294, 31510, this.field293);
        this.field369.method29(-46517);
        this.method178(47826);
        this.method163(false);
        this.method110(var11, -36584);
        this.method93(true);
        this.field442.method466(2, super.field1175, 4, 4);
        this.field293 = var5;
        this.field294 = var6;
        this.field295 = var7;
        this.field296 = var8;
        this.field297 = var9;
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method133(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            class34 var3 = this.field236.method532();
            if (var3 == null) {
                return;
            }
            if (var3.field1130 == 0) {
                class17.method283(var3.field1134, -439, var3.field1132);
                if ((this.field236.method540(var3.field1132, 2) & 98) != 0) {
                    this.field521 = true;
                    if (this.field455 != -1) {
                        this.field530 = true;
                    }
                }
            }
            if (var3.field1130 == 1 && var3.field1134 != null) {
                class48.method501(true, var3.field1134);
            }
            if (var3.field1130 == 2 && this.field592 == var3.field1132 && var3.field1134 != null) {
                this.method204(var3.field1134, 24560, this.field593);
            }
            if (var3.field1130 == 3 && this.field495 == 1) {
                for (int var4 = 0; var4 < this.field463.length; ++var4) {
                    if (this.field316[var4] == var3.field1132) {
                        this.field463[var4] = var3.field1134;
                        if (var3.field1134 == null) {
                            this.field316[var4] = -1;
                        }
                        break;
                    }
                    if (this.field317[var4] == var3.field1132) {
                        this.field322[var4] = var3.field1134;
                        if (var3.field1134 == null) {
                            this.field317[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field1130 == 93 && this.field236.method533(590, var3.field1132)) {
                class46.method494(new class30(var3.field1134, -982), (byte) 4, this.field236);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field225.method319(arg2, arg4, (byte) 71);
        this.field226.method319(arg1 + arg2 - 16, arg4, (byte) 71);
        class39.method420(arg4, (byte) 2, this.field329, arg1 - 32, 16, arg2 + 16);
        int var7 = (arg1 - 32) * arg1 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg0 / (arg5 - arg1);
        class39.method420(arg4, (byte) 2, this.field499, var7, 16, arg2 + 16 + var8);
        class39.method425(var7, arg4, arg2 + 16 + var8, this.field556, this.field284);
        class39.method425(var7, arg4 + 1, arg2 + 16 + var8, this.field556, this.field284);
        class39.method423(arg2 + 16 + var8, 265, 16, arg4, this.field556);
        class39.method423(arg2 + 17 + var8, 265, 16, arg4, this.field556);
        class39.method425(var7, arg4 + 15, arg2 + 16 + var8, this.field328, this.field284);
        this.field255 += arg3;
        class39.method425(var7 - 1, arg4 + 14, arg2 + 17 + var8, this.field328, this.field284);
        class39.method423(arg2 + 15 + var8 + var7, 265, 16, arg4, this.field328);
        class39.method423(arg2 + 14 + var8 + var7, 265, 15, arg4 + 1, this.field328);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method135(boolean arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field542; ++var3) {
                if (arg1.equalsIgnoreCase(this.field494[var3])) {
                    return true;
                }
            }
            if (arg0) {
                throw new NullPointerException();
            } else {
                return arg1.equalsIgnoreCase(field285.field1665);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBILAMSZZFWC;I)V")
    public final void method136(int arg0, byte arg1, int arg2, class2 arg3, int arg4) {
        if (arg1 != -111) {
            this.method116();
        }
        if (arg3.field35 == 0 && arg3.field20 != null) {
            if (!arg3.field30 || this.field277 == arg3.field15 || this.field471 == arg3.field15 || this.field574 == arg3.field15) {
                int var6 = class39.field1207;
                int var7 = class39.field1205;
                int var8 = class39.field1208;
                int var9 = class39.field1206;
                class39.method417(arg3.field43 + arg0, arg4, arg3.field13 + arg4, arg0, 42773);
                int var10 = arg3.field20.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field24[var11] + arg0;
                    int var13 = arg3.field36[var11] + arg4 - arg2;
                    class2 var14 = class2.field66[arg3.field20[var11]];
                    int var15 = var14.field48 + var12;
                    int var16 = var14.field6 + var13;
                    if (var14.field54 > 0) {
                        this.method114(-385, var14);
                    }
                    if (var14.field35 == 0) {
                        if (var14.field49 > var14.field65 - var14.field13) {
                            var14.field49 = var14.field65 - var14.field13;
                        }
                        if (var14.field49 < 0) {
                            var14.field49 = 0;
                        }
                        this.method136(var15, (byte) -111, var14.field49, var14, var16);
                        if (var14.field65 > var14.field13) {
                            this.method134(var14.field49, var14.field13, var16, 0, var14.field43 + var15, var14.field65);
                        }
                    } else if (var14.field35 != 1) {
                        if (var14.field35 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field13; ++var18) {
                                for (int var19 = 0; var19 < var14.field43; ++var19) {
                                    int var20 = (var14.field60 + 32) * var19 + var15;
                                    int var21 = (var14.field69 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field31[var17];
                                        var21 += var14.field21[var17];
                                    }
                                    if (var14.field51[var17] <= 0) {
                                        if (var14.field52 != null && var17 < 20) {
                                            class57 var30 = var14.field52[var17];
                                            if (var30 != null) {
                                                var30.method558(var21, var20, (byte) 71);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field51[var17] - 1;
                                        if (var20 > class39.field1207 - 32 && var20 < class39.field1208 && var21 > class39.field1205 - 32 && var21 < class39.field1206 || this.field264 != 0 && this.field263 == var17) {
                                            int var25 = 0;
                                            if (this.field173 == 1 && this.field174 == var17 && this.field175 == var14.field15) {
                                                var25 = 16777215;
                                            }
                                            class57 var26 = class15.method275(var24, var14.field58[var17], (byte) 0, var25);
                                            if (var26 != null) {
                                                if (this.field264 != 0 && this.field263 == var17 && this.field262 == var14.field15) {
                                                    var22 = super.field1183 - this.field265;
                                                    var23 = super.field1184 - this.field266;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field205 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method560(432, 128, var20 + var22, var21 + var23);
                                                    if (var21 + var23 < class39.field1205 && arg3.field49 > 0) {
                                                        int var27 = (class39.field1205 - var21 - var23) * this.field504 / 3;
                                                        if (var27 > this.field504 * 10) {
                                                            var27 = this.field504 * 10;
                                                        }
                                                        if (var27 > arg3.field49) {
                                                            var27 = arg3.field49;
                                                        }
                                                        arg3.field49 -= var27;
                                                        this.field266 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class39.field1206 && arg3.field49 < arg3.field65 - arg3.field13) {
                                                        int var28 = (var21 + var23 + 32 - class39.field1206) * this.field504 / 3;
                                                        if (var28 > this.field504 * 10) {
                                                            var28 = this.field504 * 10;
                                                        }
                                                        if (var28 > arg3.field65 - arg3.field13 - arg3.field49) {
                                                            var28 = arg3.field65 - arg3.field13 - arg3.field49;
                                                        }
                                                        arg3.field49 += var28;
                                                        this.field266 -= var28;
                                                    }
                                                } else if (this.field509 != 0 && this.field508 == var17 && this.field507 == var14.field15) {
                                                    var26.method560(432, 128, var20, var21);
                                                } else {
                                                    var26.method558(var21, var20, (byte) 71);
                                                }
                                                if (var26.field1486 == 33 || var14.field58[var17] != 1) {
                                                    int var29 = var14.field58[var17];
                                                    this.field457.method252(671, 0, var20 + 1 + var22, method115(var29, 7), var21 + 10 + var23);
                                                    this.field457.method252(671, 16776960, var20 + var22, method115(var29, 7), var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field35 == 3) {
                            boolean var31 = false;
                            if (this.field574 == var14.field15 || this.field471 == var14.field15 || this.field277 == var14.field15) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method119(361, var14)) {
                                var32 = var14.field12;
                                if (var31 && var14.field68 != 0) {
                                    var32 = var14.field68;
                                }
                            } else {
                                var32 = var14.field55;
                                if (var31 && var14.field67 != 0) {
                                    var32 = var14.field67;
                                }
                            }
                            if (var14.field14 == 0) {
                                if (var14.field34) {
                                    class39.method420(var15, (byte) 2, var32, var14.field13, var14.field43, var16);
                                } else {
                                    class39.method421(var14.field43, (byte) -22, var14.field13, var32, var16, var15);
                                }
                            } else if (var14.field34) {
                                class39.method419(var14.field13, 256 - (var14.field14 & 255), var32, 7, var15, var14.field43, var16);
                            } else {
                                class39.method422(var14.field13, var15, false, 256 - (var14.field14 & 255), var32, var14.field43, var16);
                            }
                        } else if (var14.field35 == 4) {
                            class11 var33 = var14.field27;
                            String var34 = var14.field50;
                            boolean var35 = false;
                            if (this.field574 == var14.field15 || this.field471 == var14.field15 || this.field277 == var14.field15) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method119(361, var14)) {
                                var36 = var14.field12;
                                if (var35 && var14.field68 != 0) {
                                    var36 = var14.field68;
                                }
                                if (var14.field39.length() > 0) {
                                    var34 = var14.field39;
                                }
                            } else {
                                var36 = var14.field55;
                                if (var35 && var14.field67 != 0) {
                                    var36 = var14.field67;
                                }
                            }
                            if (var14.field46 == 6 && this.field321) {
                                var34 = "Please wait...";
                                var36 = var14.field55;
                            }
                            if (class39.field1203 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field725 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label349: while (true) {
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
                                                                            break label349;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method90(0, this.method157(0, 4, var14)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method90(0, this.method157(0, 3, var14)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method90(0, this.method157(0, 2, var14)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method90(0, this.method157(0, 1, var14)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method90(0, this.method157(0, 0, var14)) + var34.substring(var38 + 2);
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
                                if (var14.field25) {
                                    var33.method249(var44, false, var14.field9, var14.field43 / 2 + var15, var37, var36);
                                } else {
                                    var33.method256(var36, var37, var14.field9, var15, var44, (byte) 2);
                                }
                                var37 += var33.field725;
                            }
                        } else if (var14.field35 == 5) {
                            class57 var45;
                            if (this.method119(361, var14)) {
                                var45 = var14.field57;
                            } else {
                                var45 = var14.field29;
                            }
                            if (var45 != null) {
                                var45.method558(var16, var15, (byte) 71);
                            }
                        } else if (var14.field35 == 6) {
                            int var46 = class8.field662;
                            int var47 = class8.field663;
                            class8.field662 = var14.field43 / 2 + var15;
                            class8.field663 = var14.field13 / 2 + var16;
                            int var48 = class8.field666[var14.field62] * var14.field61 >> 16;
                            int var49 = class8.field667[var14.field62] * var14.field61 >> 16;
                            boolean var50 = this.method119(361, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field41;
                            } else {
                                var51 = var14.field40;
                            }
                            class17 var52;
                            if (var51 == -1) {
                                var52 = var14.method5(-1, -1, (byte) -101, var50);
                            } else {
                                class9 var53 = class9.field682[var51];
                                var52 = var14.method5(var53.field685[var14.field42], var53.field684[var14.field42], (byte) -101, var50);
                            }
                            if (var52 != null) {
                                var52.method305(0, var14.field63, 0, var14.field62, 0, var48, var49);
                            }
                            class8.field662 = var46;
                            class8.field663 = var47;
                        } else if (var14.field35 == 7) {
                            class11 var54 = var14.field27;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field13; ++var56) {
                                for (int var57 = 0; var57 < var14.field43; ++var57) {
                                    if (var14.field51[var55] > 0) {
                                        class15 var58 = class15.method278(var14.field51[var55] - 1);
                                        String var59 = var58.field766;
                                        if (var58.field779 || var14.field58[var55] != 1) {
                                            var59 = var59 + " x" + method72(-30023, var14.field58[var55]);
                                        }
                                        int var60 = (var14.field60 + 115) * var57 + var15;
                                        int var61 = (var14.field69 + 12) * var56 + var16;
                                        if (var14.field25) {
                                            var54.method249(var59, false, var14.field9, var14.field43 / 2 + var60, var61, var14.field55);
                                        } else {
                                            var54.method256(var14.field55, var61, var14.field9, var60, var59, (byte) 2);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                class39.method417(var8, var7, var9, var6, 42773);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTNNDDWAZ;III)V")
    public final void method137(class57 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (arg1 != 6) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (var5 > 4225 && var5 < 90000) {
            int var7 = this.field466 + this.field407 & 2047;
            int var8 = class17.field875[var7];
            int var9 = class17.field876[var7];
            int var10 = var8 * 256 / (this.field197 + 256);
            int var11 = var9 * 256 / (this.field197 + 256);
            int var12 = arg2 * var11 + arg3 * var10 >> 16;
            int var13 = arg3 * var11 - arg2 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field544.method563(var14, (byte) 118, 83 - var17 - 20, 20, 256, 20, var16 + 94 + 4 - 10, 15, 15);
        } else {
            this.method162(arg2, arg0, 152, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)Z")
    public final boolean method138(byte arg0) {
        if (arg0 != 7) {
            this.method116();
        }
        if (this.field223 == null) {
            return false;
        } else {
            try {
                int var2 = this.field223.method400();
                if (var2 == 0) {
                    return false;
                }
                if (this.field256 == -1) {
                    this.field223.method401(this.field431.field1064, 0, 1);
                    this.field256 = this.field431.field1064[0] & 255;
                    if (this.field619 != null) {
                        this.field256 = this.field256 - this.field619.method526() & 255;
                    }
                    this.field255 = class49.field1313[this.field256];
                    --var2;
                }
                if (this.field255 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field223.method401(this.field431.field1064, 0, 1);
                    this.field255 = this.field431.field1064[0] & 255;
                    --var2;
                }
                if (this.field255 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field223.method401(this.field431.field1064, 0, 2);
                    this.field431.field1065 = 0;
                    this.field255 = this.field431.method351();
                    var2 -= 2;
                }
                if (var2 < this.field255) {
                    return false;
                }
                this.field431.field1065 = 0;
                this.field223.method401(this.field431.field1064, 0, this.field255);
                this.field257 = 0;
                this.field606 = this.field605;
                this.field605 = this.field604;
                this.field604 = this.field256;
                if (this.field256 == 119) {
                    this.field521 = true;
                    int var3 = this.field431.method351();
                    class2 var4 = class2.field66[var3];
                    while (this.field431.field1065 < this.field255) {
                        int var5 = this.field431.method363();
                        int var6 = this.field431.method351();
                        int var7 = this.field431.method349();
                        if (var7 == 255) {
                            var7 = this.field431.method354();
                        }
                        if (var5 >= 0 && var5 < var4.field51.length) {
                            var4.field51[var5] = var6;
                            var4.field58[var5] = var7;
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 56) {
                    this.field498 = this.field255 / 8;
                    for (int var8 = 0; var8 < this.field498; ++var8) {
                        this.field201[var8] = this.field431.method355(true);
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 113) {
                    int var9 = this.field431.method379((byte) -102);
                    int var10 = this.field431.method351();
                    if (this.field455 != -1) {
                        this.field455 = -1;
                        this.field530 = true;
                    }
                    if (this.field240 != 0) {
                        this.field240 = 0;
                        this.field530 = true;
                    }
                    this.field345 = var10;
                    this.field178 = var9;
                    this.field521 = true;
                    this.field421 = true;
                    this.field321 = false;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 3 || this.field256 == 98) {
                    int var11 = this.field247;
                    int var12 = this.field248;
                    if (this.field256 == 3) {
                        var12 = this.field431.method379((byte) -102);
                        var11 = this.field431.method378((byte) 7);
                        this.field238 = false;
                    }
                    if (this.field256 == 98) {
                        var11 = this.field431.method351();
                        var12 = this.field431.method377((byte) 46);
                        this.field431.method359((byte) 9);
                        int var13 = 0;
                        while (true) {
                            if (var13 >= 4) {
                                this.field431.method361((byte) 24);
                                this.field238 = true;
                                break;
                            }
                            for (int var14 = 0; var14 < 13; ++var14) {
                                for (int var15 = 0; var15 < 13; ++var15) {
                                    int var16 = this.field431.method360(true, 1);
                                    if (var16 == 1) {
                                        this.field582[var13][var14][var15] = this.field431.method360(true, 26);
                                    } else {
                                        this.field582[var13][var14][var15] = -1;
                                    }
                                }
                            }
                            ++var13;
                        }
                    }
                    if (this.field247 == var11 && this.field248 == var12 && this.field495 == 2) {
                        this.field256 = -1;
                        return true;
                    }
                    this.field247 = var11;
                    this.field248 = var12;
                    this.field537 = (this.field247 - 6) * 8;
                    this.field538 = (this.field248 - 6) * 8;
                    this.field527 = false;
                    if ((this.field247 / 8 == 48 || this.field247 / 8 == 49) && this.field248 / 8 == 48) {
                        this.field527 = true;
                    }
                    if (this.field247 / 8 == 48 && this.field248 / 8 == 148) {
                        this.field527 = true;
                    }
                    this.field495 = 1;
                    this.field394 = System.currentTimeMillis();
                    this.field442.method465(false);
                    this.field458.method248(1, 151, "Loading - please wait.", 257, 0);
                    this.field458.method248(1, 150, "Loading - please wait.", 256, 16777215);
                    this.field442.method466(2, super.field1175, 4, 4);
                    if (this.field256 == 3) {
                        int var17 = 0;
                        int var18 = (this.field247 - 6) / 8;
                        label1168: while (true) {
                            if (var18 > (this.field247 + 6) / 8) {
                                this.field463 = new byte[var17][];
                                this.field322 = new byte[var17][];
                                this.field315 = new int[var17];
                                this.field316 = new int[var17];
                                this.field317 = new int[var17];
                                int var20 = 0;
                                int var21 = (this.field247 - 6) / 8;
                                while (true) {
                                    if (var21 > (this.field247 + 6) / 8) {
                                        break label1168;
                                    }
                                    for (int var22 = (this.field248 - 6) / 8; var22 <= (this.field248 + 6) / 8; ++var22) {
                                        this.field315[var20] = (var21 << 8) + var22;
                                        if (this.field527 && (var22 == 49 || var22 == 149 || var22 == 147 || var21 == 50 || var21 == 49 && var22 == 47)) {
                                            this.field316[var20] = -1;
                                            this.field317[var20] = -1;
                                            ++var20;
                                        } else {
                                            int var23 = this.field316[var20] = this.field236.method541(0, var21, var22, false);
                                            if (var23 != -1) {
                                                this.field236.method531(3, var23);
                                            }
                                            int var24 = this.field317[var20] = this.field236.method541(1, var21, var22, false);
                                            if (var24 != -1) {
                                                this.field236.method531(3, var24);
                                            }
                                            ++var20;
                                        }
                                    }
                                    ++var21;
                                }
                            }
                            for (int var19 = (this.field248 - 6) / 8; var19 <= (this.field248 + 6) / 8; ++var19) {
                                ++var17;
                            }
                            ++var18;
                        }
                    }
                    if (this.field256 == 98) {
                        int var25 = 0;
                        int[] var26 = new int[676];
                        int var27 = 0;
                        label1129: while (true) {
                            if (var27 >= 4) {
                                this.field463 = new byte[var25][];
                                this.field322 = new byte[var25][];
                                this.field315 = new int[var25];
                                this.field316 = new int[var25];
                                this.field317 = new int[var25];
                                int var35 = 0;
                                while (true) {
                                    if (var35 >= var25) {
                                        break label1129;
                                    }
                                    int var36 = this.field315[var35] = var26[var35];
                                    int var37 = var36 >> 8 & 255;
                                    int var38 = var36 & 255;
                                    int var39 = this.field316[var35] = this.field236.method541(0, var37, var38, false);
                                    if (var39 != -1) {
                                        this.field236.method531(3, var39);
                                    }
                                    int var40 = this.field317[var35] = this.field236.method541(1, var37, var38, false);
                                    if (var40 != -1) {
                                        this.field236.method531(3, var40);
                                    }
                                    ++var35;
                                }
                            }
                            for (int var28 = 0; var28 < 13; ++var28) {
                                for (int var29 = 0; var29 < 13; ++var29) {
                                    int var30 = this.field582[var27][var28][var29];
                                    if (var30 != -1) {
                                        int var31 = var30 >> 14 & 1023;
                                        int var32 = var30 >> 3 & 2047;
                                        int var33 = (var31 / 8 << 8) + var32 / 8;
                                        for (int var34 = 0; var34 < var25; ++var34) {
                                            if (var26[var34] == var33) {
                                                var33 = -1;
                                                break;
                                            }
                                        }
                                        if (var33 != -1) {
                                            var26[var25++] = var33;
                                        }
                                    }
                                }
                            }
                            ++var27;
                        }
                    }
                    int var41 = this.field537 - this.field539;
                    int var42 = this.field538 - this.field540;
                    this.field539 = this.field537;
                    this.field540 = this.field538;
                    for (int var43 = 0; var43 < 16384; ++var43) {
                        class13 var44 = this.field480[var43];
                        if (var44 != null) {
                            for (int var45 = 0; var45 < 10; ++var45) {
                                var44.field1581[var45] -= var41;
                                var44.field1582[var45] -= var42;
                            }
                            var44.field1539 -= var41 * 128;
                            var44.field1540 -= var42 * 128;
                        }
                    }
                    for (int var46 = 0; var46 < this.field411; ++var46) {
                        class69 var47 = this.field413[var46];
                        if (var47 != null) {
                            for (int var48 = 0; var48 < 10; ++var48) {
                                var47.field1581[var48] -= var41;
                                var47.field1582[var48] -= var42;
                            }
                            var47.field1539 -= var41 * 128;
                            var47.field1540 -= var42 * 128;
                        }
                    }
                    this.field545 = true;
                    byte var49 = 0;
                    byte var50 = 104;
                    byte var51 = 1;
                    if (var41 < 0) {
                        var49 = 103;
                        var50 = -1;
                        var51 = -1;
                    }
                    byte var52 = 0;
                    byte var53 = 104;
                    byte var54 = 1;
                    if (var42 < 0) {
                        var52 = 103;
                        var53 = -1;
                        var54 = -1;
                    }
                    for (int var55 = var49; var50 != var55; var55 += var51) {
                        for (int var56 = var52; var53 != var56; var56 += var54) {
                            int var57 = var41 + var55;
                            int var58 = var42 + var56;
                            for (int var59 = 0; var59 < 4; ++var59) {
                                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                                    this.field309[var59][var55][var56] = this.field309[var59][var57][var58];
                                } else {
                                    this.field309[var59][var55][var56] = null;
                                }
                            }
                        }
                    }
                    for (class70 var60 = (class70) this.field216.method329(); var60 != null; var60 = (class70) this.field216.method331(9)) {
                        var60.field1682 -= var41;
                        var60.field1683 -= var42;
                        if (var60.field1682 < 0 || var60.field1683 < 0 || var60.field1682 >= 104 || var60.field1683 >= 104) {
                            var60.method1();
                        }
                    }
                    if (this.field242 != 0) {
                        this.field242 -= var41;
                        this.field243 -= var42;
                    }
                    this.field572 = false;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 221) {
                    this.field489 = this.field431.method349();
                    this.field490 = this.field431.method369(0);
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 104 || this.field256 == 197 || this.field256 == 171 || this.field256 == 231 || this.field256 == 101 || this.field256 == 29 || this.field256 == 78 || this.field256 == 59 || this.field256 == 40 || this.field256 == 216 || this.field256 == 25) {
                    this.method139(this.field256, 138, this.field431);
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 144) {
                    this.field362 = false;
                    this.field240 = 1;
                    this.field452 = "";
                    this.field530 = true;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 246) {
                    this.field179 = this.field431.method349();
                    if (this.field179 == 1) {
                        this.field194 = this.field431.method351();
                    }
                    if (this.field179 >= 2 && this.field179 <= 6) {
                        if (this.field179 == 2) {
                            this.field212 = 64;
                            this.field213 = 64;
                        }
                        if (this.field179 == 3) {
                            this.field212 = 0;
                            this.field213 = 64;
                        }
                        if (this.field179 == 4) {
                            this.field212 = 128;
                            this.field213 = 64;
                        }
                        if (this.field179 == 5) {
                            this.field212 = 64;
                            this.field213 = 0;
                        }
                        if (this.field179 == 6) {
                            this.field212 = 64;
                            this.field213 = 128;
                        }
                        this.field179 = 2;
                        this.field209 = this.field431.method351();
                        this.field210 = this.field431.method351();
                        this.field211 = this.field431.method349();
                    }
                    if (this.field179 == 10) {
                        this.field189 = this.field431.method351();
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 125) {
                    int var61 = this.field431.method379((byte) -102);
                    int var62 = this.field431.method379((byte) -102);
                    int var63 = this.field431.method377((byte) 46);
                    if (var63 == 65535) {
                        class2.field66[var61].field37 = 0;
                        this.field256 = -1;
                        return true;
                    }
                    class15 var64 = class15.method278(var63);
                    class2.field66[var61].field37 = 4;
                    class2.field66[var61].field38 = var63;
                    class2.field66[var61].field62 = var64.field786;
                    class2.field66[var61].field63 = var64.field788;
                    class2.field66[var61].field61 = var64.field749 * 100 / var62;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 206) {
                    this.field490 = this.field431.method349();
                    this.field489 = this.field431.method368(false);
                    for (int var65 = this.field489; var65 < this.field489 + 8; ++var65) {
                        for (int var66 = this.field490; var66 < this.field490 + 8; ++var66) {
                            if (this.field309[this.field358][var65][var66] != null) {
                                this.field309[this.field358][var65][var66] = null;
                                this.method144(var65, var66);
                            }
                        }
                    }
                    for (class70 var67 = (class70) this.field216.method329(); var67 != null; var67 = (class70) this.field216.method331(9)) {
                        if (var67.field1682 >= this.field489 && var67.field1682 < this.field489 + 8 && var67.field1683 >= this.field490 && var67.field1683 < this.field490 + 8 && this.field358 == var67.field1680) {
                            var67.field1685 = 0;
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 21) {
                    this.field572 = true;
                    this.field550 = this.field431.method349();
                    this.field551 = this.field431.method349();
                    this.field552 = this.field431.method351();
                    this.field553 = this.field431.method349();
                    this.field554 = this.field431.method349();
                    if (this.field554 >= 100) {
                        this.field293 = this.field550 * 128 + 64;
                        this.field295 = this.field551 * 128 + 64;
                        this.field294 = this.method156(this.field358, 478, this.field293, this.field295) - this.field552;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 124) {
                    int var68 = this.field431.method377((byte) 46);
                    this.method203(var68, false);
                    if (this.field178 != -1) {
                        this.field178 = -1;
                        this.field521 = true;
                        this.field421 = true;
                    }
                    if (this.field455 != -1) {
                        this.field455 = -1;
                        this.field530 = true;
                    }
                    if (this.field240 != 0) {
                        this.field240 = 0;
                        this.field530 = true;
                    }
                    this.field345 = var68;
                    this.field321 = false;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 41) {
                    int var69 = this.field431.method377((byte) 46);
                    int var70 = this.field431.method379((byte) -102);
                    class2.field66[var69].field37 = 1;
                    class2.field66[var69].field38 = var70;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 97) {
                    if (this.field178 != -1) {
                        this.field178 = -1;
                        this.field521 = true;
                        this.field421 = true;
                    }
                    if (this.field455 != -1) {
                        this.field455 = -1;
                        this.field530 = true;
                    }
                    if (this.field240 != 0) {
                        this.field240 = 0;
                        this.field530 = true;
                    }
                    this.field345 = -1;
                    this.field321 = false;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 83) {
                    this.method80(this.field255, this.field431, (byte) -110);
                    this.field545 = false;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 79) {
                    this.method68(this.field431, this.field255, true);
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 123) {
                    if (this.field333 == 12) {
                        this.field521 = true;
                    }
                    this.field188 = this.field431.method349();
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 152) {
                    this.field572 = false;
                    for (int var71 = 0; var71 < 5; ++var71) {
                        this.field335[var71] = false;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 23) {
                    this.field572 = true;
                    this.field337 = this.field431.method349();
                    this.field338 = this.field431.method349();
                    this.field339 = this.field431.method351();
                    this.field340 = this.field431.method349();
                    this.field341 = this.field431.method349();
                    if (this.field341 >= 100) {
                        int var72 = this.field337 * 128 + 64;
                        int var73 = this.field338 * 128 + 64;
                        int var74 = this.method156(this.field358, 478, var72, var73) - this.field339;
                        int var75 = var72 - this.field293;
                        int var76 = var74 - this.field294;
                        int var77 = var73 - this.field295;
                        int var78 = (int) Math.sqrt((double) (var75 * var75 + var77 * var77));
                        this.field296 = (int) (Math.atan2((double) var76, (double) var78) * 325.949D) & 2047;
                        this.field297 = (int) (Math.atan2((double) var75, (double) var77) * -325.949D) & 2047;
                        if (this.field296 < 128) {
                            this.field296 = 128;
                        }
                        if (this.field296 > 383) {
                            this.field296 = 383;
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 157) {
                    long var79 = this.field431.method355(true);
                    int var81 = this.field431.method354();
                    int var82 = this.field431.method349();
                    boolean var83 = false;
                    for (int var84 = 0; var84 < 100; ++var84) {
                        if (this.field331[var84] == var81) {
                            var83 = true;
                            break;
                        }
                    }
                    if (var82 <= 1) {
                        for (int var85 = 0; var85 < this.field498; ++var85) {
                            if (this.field201[var85] == var79) {
                                var83 = true;
                                break;
                            }
                        }
                    }
                    if (!var83 && this.field573 == 0) {
                        try {
                            this.field331[this.field195] = var81;
                            this.field195 = (this.field195 + 1) % 100;
                            String var86 = class28.method334(-25339, this.field431, this.field255 - 13);
                            if (var82 != 3) {
                                var86 = class41.method437(this.field336, var86);
                            }
                            if (var82 != 2 && var82 != 3) {
                                if (var82 == 1) {
                                    this.method182(0, "@cr1@" + class61.method584(true, class61.method581(var79, 581)), 7, var86);
                                } else {
                                    this.method182(0, class61.method584(true, class61.method581(var79, 581)), 3, var86);
                                }
                            } else {
                                this.method182(0, "@cr2@" + class61.method584(true, class61.method581(var79, 581)), 7, var86);
                            }
                        } catch (Exception var187) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 227) {
                    long var88 = this.field431.method355(true);
                    int var90 = this.field431.method349();
                    String var91 = class61.method584(true, class61.method581(var88, 581));
                    for (int var92 = 0; var92 < this.field542; ++var92) {
                        if (this.field483[var92] == var88) {
                            if (this.field583[var92] != var90) {
                                this.field583[var92] = var90;
                                this.field521 = true;
                                if (var90 > 0) {
                                    this.method182(0, "", 5, var91 + " has logged in.");
                                }
                                if (var90 == 0) {
                                    this.method182(0, "", 5, var91 + " has logged out.");
                                }
                            }
                            var91 = null;
                            break;
                        }
                    }
                    if (var91 != null && this.field542 < 200) {
                        this.field483[this.field542] = var88;
                        this.field494[this.field542] = var91;
                        this.field583[this.field542] = var90;
                        ++this.field542;
                        this.field521 = true;
                    }
                    boolean var93 = false;
                    while (!var93) {
                        var93 = true;
                        for (int var94 = 0; var94 < this.field542 - 1; ++var94) {
                            if (this.field583[var94] != field363 && this.field583[var94 + 1] == field363 || this.field583[var94] == 0 && this.field583[var94 + 1] != 0) {
                                int var95 = this.field583[var94];
                                this.field583[var94] = this.field583[var94 + 1];
                                this.field583[var94 + 1] = var95;
                                String var96 = this.field494[var94];
                                this.field494[var94] = this.field494[var94 + 1];
                                this.field494[var94 + 1] = var96;
                                long var97 = this.field483[var94];
                                this.field483[var94] = this.field483[var94 + 1];
                                this.field483[var94 + 1] = var97;
                                this.field521 = true;
                                var93 = false;
                            }
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 49) {
                    this.field333 = this.field431.method368(false);
                    this.field521 = true;
                    this.field421 = true;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 165) {
                    int var99 = this.field431.method368(false);
                    int var100 = this.field431.method368(false);
                    String var101 = this.field431.method356();
                    if (var99 >= 1 && var99 <= 5) {
                        if (var101.equalsIgnoreCase("null")) {
                            var101 = null;
                        }
                        this.field475[var99 - 1] = var101;
                        this.field476[var99 - 1] = var100 == 0;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 161) {
                    for (int var102 = 0; var102 < this.field413.length; ++var102) {
                        if (this.field413[var102] != null) {
                            this.field413[var102].field1552 = -1;
                        }
                    }
                    for (int var103 = 0; var103 < this.field480.length; ++var103) {
                        if (this.field480[var103] != null) {
                            this.field480[var103].field1552 = -1;
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 50) {
                    this.field521 = true;
                    int var104 = this.field431.method351();
                    class2 var105 = class2.field66[var104];
                    int var106 = this.field431.method351();
                    for (int var107 = 0; var107 < var106; ++var107) {
                        int var108 = this.field431.method349();
                        if (var108 == 255) {
                            var108 = this.field431.method386(-35940);
                        }
                        var105.field51[var107] = this.field431.method351();
                        var105.field58[var107] = var108;
                    }
                    for (int var109 = var106; var109 < var105.field51.length; ++var109) {
                        var105.field51[var109] = 0;
                        var105.field58[var109] = 0;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 214) {
                    this.field230 = this.field431.method349();
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 46) {
                    this.field342 = this.field431.method349();
                    this.field588 = this.field431.method377((byte) 46);
                    this.field214 = this.field431.method379((byte) -102);
                    this.field615 = this.field431.method386(-35940);
                    this.field283 = this.field431.method370(-719);
                    if (this.field615 != 0 && this.field345 == -1) {
                        signlink.dnslookup(class61.method583(9, this.field615));
                        this.method146(27555);
                        short var110 = 650;
                        if (this.field342 != 201 || this.field283 == 1) {
                            var110 = 655;
                        }
                        this.field326 = "";
                        this.field557 = false;
                        for (int var111 = 0; var111 < class2.field66.length; ++var111) {
                            if (class2.field66[var111] != null && class2.field66[var111].field54 == var110) {
                                this.field345 = class2.field66[var111].field7;
                                break;
                            }
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 34) {
                    this.field361 = this.field431.method377((byte) 46);
                    this.field496 = this.field431.method349();
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 47) {
                    int var112 = this.field431.method378((byte) 7);
                    class2 var113 = class2.field66[var112];
                    for (int var114 = 0; var114 < var113.field51.length; ++var114) {
                        var113.field51[var114] = -1;
                        var113.field51[var114] = 0;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 84) {
                    int var115 = this.field431.method377((byte) 46);
                    int var116 = this.field431.method378((byte) 7);
                    class2 var117 = class2.field66[var116];
                    if (var117 != null && var117.field35 == 0) {
                        if (var115 < 0) {
                            var115 = 0;
                        }
                        if (var115 > var117.field65 - var117.field13) {
                            var115 = var117.field65 - var117.field13;
                        }
                        var117.field49 = var115;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 237) {
                    int var118 = this.field431.method351();
                    int var119 = this.field431.method349();
                    int var120 = this.field431.method351();
                    if (this.field435 && !field366 && this.field602 < 50) {
                        this.field311[this.field602] = var118;
                        this.field451[this.field602] = var119;
                        this.field446[this.field602] = class3.field75[var118] + var120;
                        ++this.field602;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 199) {
                    int var121 = this.field431.method379((byte) -102);
                    boolean var122 = this.field431.method369(0) == 1;
                    class2.field66[var121].field30 = var122;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 203) {
                    int var123 = this.field431.method351();
                    this.method203(var123, false);
                    if (this.field178 != -1) {
                        this.field178 = -1;
                        this.field521 = true;
                        this.field421 = true;
                    }
                    this.field455 = var123;
                    this.field530 = true;
                    this.field345 = -1;
                    this.field321 = false;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 110) {
                    this.method185(this.field172);
                    this.field256 = -1;
                    return false;
                }
                if (this.field256 == 202) {
                    this.field288 = this.field431.method349();
                    if (this.field333 == this.field288) {
                        if (this.field288 == 3) {
                            this.field333 = 1;
                        } else {
                            this.field333 = 3;
                        }
                        this.field521 = true;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 142) {
                    int var124 = this.field431.method379((byte) -102);
                    if (var124 == 65535) {
                        var124 = -1;
                    }
                    if (this.field192 != var124 && this.field444 && !field366 && this.field239 == 0) {
                        this.field592 = var124;
                        this.field593 = true;
                        this.field236.method531(2, this.field592);
                    }
                    this.field192 = var124;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 129) {
                    int var125 = this.field431.method377((byte) 46);
                    int var126 = this.field431.method379((byte) -102);
                    if (this.field444 && !field366) {
                        this.field592 = var126;
                        this.field593 = false;
                        this.field236.method531(2, this.field592);
                        this.field239 = var125;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 223) {
                    this.field489 = this.field431.method349();
                    this.field490 = this.field431.method349();
                    while (this.field431.field1065 < this.field255) {
                        int var127 = this.field431.method349();
                        this.method139(var127, 138, this.field431);
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 53) {
                    for (int var128 = 0; var128 < this.field286.length; ++var128) {
                        if (this.field581[var128] != this.field286[var128]) {
                            this.field286[var128] = this.field581[var128];
                            this.method143(var128, true);
                            this.field521 = true;
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 187) {
                    int var129 = this.field431.method379((byte) -102);
                    int var130 = this.field431.method379((byte) -102);
                    class2.field66[var130].field37 = 2;
                    class2.field66[var130].field38 = var129;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 247) {
                    int var131 = this.field431.method354();
                    int var132 = this.field431.method377((byte) 46);
                    this.field581[var132] = var131;
                    if (this.field286[var132] != var131) {
                        this.field286[var132] = var131;
                        this.method143(var132, true);
                        this.field521 = true;
                        if (this.field268 != -1) {
                            this.field530 = true;
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 188) {
                    int var133 = this.field431.method379((byte) -102);
                    int var134 = this.field431.method379((byte) -102);
                    int var135 = this.field431.method378((byte) 7);
                    int var136 = this.field431.method351();
                    class2.field66[var135].field62 = var133;
                    class2.field66[var135].field63 = var134;
                    class2.field66[var135].field61 = var136;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 166) {
                    int var137 = this.field431.method378((byte) 7);
                    int var138 = this.field431.method351();
                    int var139 = var137 >> 10 & 31;
                    int var140 = var137 >> 5 & 31;
                    int var141 = var137 & 31;
                    class2.field66[var138].field55 = (var141 << 3) + (var139 << 19) + (var140 << 11);
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 254) {
                    int var142 = this.field431.method382(-33);
                    if (var142 >= 0) {
                        this.method203(var142, false);
                    }
                    this.field618 = var142;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 177) {
                    int var143 = this.field431.method379((byte) -102);
                    int var144 = this.field431.method380(this.field182);
                    class2 var145 = class2.field66[var143];
                    var145.field40 = var144;
                    if (var144 == -1) {
                        var145.field42 = 0;
                        var145.field59 = 0;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 44) {
                    int var146 = this.field431.method378((byte) 7);
                    this.method203(var146, false);
                    if (this.field455 != -1) {
                        this.field455 = -1;
                        this.field530 = true;
                    }
                    if (this.field240 != 0) {
                        this.field240 = 0;
                        this.field530 = true;
                    }
                    this.field178 = var146;
                    this.field521 = true;
                    this.field421 = true;
                    this.field345 = -1;
                    this.field321 = false;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 229) {
                    int var147 = this.field431.method352();
                    int var148 = this.field431.method351();
                    int var149 = this.field431.method352();
                    class2 var150 = class2.field66[var148];
                    var150.field48 = var147;
                    var150.field6 = var149;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 176) {
                    this.field533 = this.field431.method378((byte) 7) * 30;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 244) {
                    int var151 = this.field431.method377((byte) 46);
                    String var152 = this.field431.method356();
                    class2.field66[var151].field50 = var152;
                    if (this.field555[this.field333] == class2.field66[var151].field7) {
                        this.field521 = true;
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 180) {
                    int var153 = this.field431.method381(-262);
                    this.field268 = var153;
                    this.field530 = true;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 85) {
                    this.field576 = this.field431.method349();
                    this.field167 = this.field431.method349();
                    this.field319 = this.field431.method349();
                    this.field584 = true;
                    this.field530 = true;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 158) {
                    if (this.field333 == 12) {
                        this.field521 = true;
                    }
                    this.field493 = this.field431.method352();
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 178) {
                    this.field362 = false;
                    this.field240 = 2;
                    this.field452 = "";
                    this.field530 = true;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 234) {
                    int var154 = this.field431.method379((byte) -102);
                    byte var155 = this.field431.method373(-40354);
                    this.field581[var154] = var155;
                    if (this.field286[var154] != var155) {
                        this.field286[var154] = var155;
                        this.method143(var154, true);
                        this.field521 = true;
                        if (this.field268 != -1) {
                            this.field530 = true;
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 77) {
                    int var156 = this.field431.method349();
                    int var157 = this.field431.method379((byte) -102);
                    if (var157 == 65535) {
                        var157 = -1;
                    }
                    this.field555[var156] = var157;
                    this.field521 = true;
                    this.field421 = true;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 55) {
                    this.field543 = this.field431.method349();
                    this.field521 = true;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 72) {
                    this.field242 = 0;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 146) {
                    int var158 = this.field431.method349();
                    int var159 = this.field431.method349();
                    int var160 = this.field431.method349();
                    int var161 = this.field431.method349();
                    this.field335[var158] = true;
                    this.field447[var158] = var159;
                    this.field381[var158] = var160;
                    this.field360[var158] = var161;
                    this.field290[var158] = 0;
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 103) {
                    int var162 = this.field431.method351();
                    class2.field66[var162].field37 = 3;
                    if (field285.field1646 == null) {
                        class2.field66[var162].field38 = (field285.field1669[11] << 5) + (field285.field1669[8] << 10) + (field285.field1669[0] << 15) + (field285.field1648[0] << 25) + (field285.field1648[4] << 20) + field285.field1669[1];
                    } else {
                        class2.field66[var162].field38 = (int) (field285.field1646.field1532 + 305419896L);
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 51) {
                    String var163 = this.field431.method356();
                    if (var163.endsWith(":tradereq:")) {
                        String var164 = var163.substring(0, var163.indexOf(":"));
                        long var165 = class61.method580(var164);
                        boolean var167 = false;
                        for (int var168 = 0; var168 < this.field498; ++var168) {
                            if (this.field201[var168] == var165) {
                                var167 = true;
                                break;
                            }
                        }
                        if (!var167 && this.field573 == 0) {
                            this.method182(0, var164, 4, "wishes to trade with you.");
                        }
                    } else if (var163.endsWith(":duelreq:")) {
                        String var169 = var163.substring(0, var163.indexOf(":"));
                        long var170 = class61.method580(var169);
                        boolean var172 = false;
                        for (int var173 = 0; var173 < this.field498; ++var173) {
                            if (this.field201[var173] == var170) {
                                var172 = true;
                                break;
                            }
                        }
                        if (!var172 && this.field573 == 0) {
                            this.method182(0, var169, 8, "wishes to duel with you.");
                        }
                    } else if (!var163.endsWith(":chalreq:")) {
                        this.method182(0, "", 0, var163);
                    } else {
                        String var174 = var163.substring(0, var163.indexOf(":"));
                        long var175 = class61.method580(var174);
                        boolean var177 = false;
                        for (int var178 = 0; var178 < this.field498; ++var178) {
                            if (this.field201[var178] == var175) {
                                var177 = true;
                                break;
                            }
                        }
                        if (!var177 && this.field573 == 0) {
                            String var179 = var163.substring(var163.indexOf(":") + 1, var163.length() - 9);
                            this.method182(0, var174, 8, var179);
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 218) {
                    this.field521 = true;
                    int var180 = this.field431.method369(0);
                    int var181 = this.field431.method370(-719);
                    int var182 = this.field431.method385(true);
                    this.field419[var180] = var182;
                    this.field305[var180] = var181;
                    this.field591[var180] = 1;
                    for (int var183 = 0; var183 < 98; ++var183) {
                        if (var182 >= field536[var183]) {
                            this.field591[var180] = var183 + 2;
                        }
                    }
                    this.field256 = -1;
                    return true;
                }
                if (this.field256 == 148) {
                    this.field310 = this.field431.method349();
                    this.field256 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field256 + "," + this.field255 + " - " + this.field605 + "," + this.field606);
                this.method185(this.field172);
            } catch (IOException var188) {
                this.method66(true);
            } catch (Exception var189) {
                String var185 = "T2 - " + this.field256 + "," + this.field605 + "," + this.field606 + " - " + this.field255 + "," + (field285.field1581[0] + this.field537) + "," + (field285.field1582[0] + this.field538) + " - ";
                for (int var186 = 0; var186 < this.field255 && var186 < 50; ++var186) {
                    var185 = var185 + this.field431.field1064[var186] + ",";
                }
                signlink.reporterror(var185);
                this.method185(this.field172);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILKHOMSBHW;)V")
    public final void method139(int arg0, int arg1, class30 arg2) {
        if (arg1 <= 0) {
            arg0 = -1;
        }
        if (arg0 == 59) {
            int var4 = arg2.method351();
            int var5 = arg2.method369(0);
            int var6 = (var5 >> 4 & 7) + this.field489;
            int var7 = (var5 & 7) + this.field490;
            int var8 = arg2.method379((byte) -102);
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class44 var9 = new class44();
                var9.field1250 = var8;
                var9.field1251 = var4;
                if (this.field309[this.field358][var6][var7] == null) {
                    this.field309[this.field358][var6][var7] = new class25(3);
                }
                this.field309[this.field358][var6][var7].method326(var9);
                this.method144(var6, var7);
            }
        } else {
            if (arg0 == 104) {
                int var10 = arg2.method349();
                int var11 = (var10 >> 4 & 7) + this.field489;
                int var12 = (var10 & 7) + this.field490;
                int var13 = arg2.method351();
                int var14 = arg2.method349();
                int var15 = var14 >> 4 & 15;
                int var16 = var14 & 7;
                if (field285.field1581[0] >= var11 - var15 && field285.field1581[0] <= var11 + var15 && field285.field1582[0] >= var12 - var15 && field285.field1582[0] <= var12 + var15 && this.field435 && !field366 && this.field602 < 50) {
                    this.field311[this.field602] = var13;
                    this.field451[this.field602] = var16;
                    this.field446[this.field602] = class3.field75[var13];
                    ++this.field602;
                }
            }
            if (arg0 == 101) {
                int var17 = arg2.method349();
                int var18 = (var17 >> 4 & 7) + this.field489;
                int var19 = (var17 & 7) + this.field490;
                int var20 = arg2.method351();
                int var21 = arg2.method349();
                int var22 = arg2.method351();
                if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                    int var23 = var18 * 128 + 64;
                    int var24 = var19 * 128 + 64;
                    class7 var25 = new class7(var24, var23, var22, this.field358, 152, field464, var20, this.method156(this.field358, 478, var23, var24) - var21);
                    this.field367.method326(var25);
                }
            } else {
                if (arg0 == 171) {
                    int var26 = arg2.method379((byte) -102);
                    byte var27 = arg2.method373(-40354);
                    byte var28 = arg2.method350();
                    int var29 = arg2.method378((byte) 7);
                    int var30 = arg2.method379((byte) -102);
                    byte var31 = arg2.method372(false);
                    byte var32 = arg2.method371(false);
                    int var33 = arg2.method349();
                    int var34 = (var33 >> 4 & 7) + this.field489;
                    int var35 = (var33 & 7) + this.field490;
                    int var36 = arg2.method377((byte) 46);
                    int var37 = arg2.method368(false);
                    int var38 = var37 >> 2;
                    int var39 = var37 & 3;
                    int var40 = this.field497[var38];
                    class69 var41;
                    if (this.field361 == var36) {
                        var41 = field285;
                    } else {
                        var41 = this.field413[var36];
                    }
                    if (var41 != null) {
                        class50 var42 = class50.method512(var30);
                        int var43 = this.field405[this.field358][var34][var35];
                        int var44 = this.field405[this.field358][var34 + 1][var35];
                        int var45 = this.field405[this.field358][var34 + 1][var35 + 1];
                        int var46 = this.field405[this.field358][var34][var35 + 1];
                        class17 var47 = var42.method505(var38, var39, var43, var44, var45, var46, -1);
                        if (var47 != null) {
                            this.method151(var26 + 1, 0, 2, 0, var29 + 1, var35, this.field358, var34, -1, var40);
                            var41.field1667 = field464 + var29;
                            var41.field1668 = field464 + var26;
                            var41.field1653 = var47;
                            int var48 = var42.field1358;
                            int var49 = var42.field1365;
                            if (var39 == 1 || var39 == 3) {
                                var48 = var42.field1365;
                                var49 = var42.field1358;
                            }
                            var41.field1650 = var34 * 128 + var48 * 64;
                            var41.field1652 = var35 * 128 + var49 * 64;
                            var41.field1651 = this.method156(this.field358, 478, var41.field1650, var41.field1652);
                            if (var31 > var28) {
                                byte var50 = var31;
                                var31 = var28;
                                var28 = var50;
                            }
                            if (var32 > var27) {
                                byte var51 = var32;
                                var32 = var27;
                                var27 = var51;
                            }
                            var41.field1659 = var31 + var34;
                            var41.field1661 = var28 + var34;
                            var41.field1660 = var32 + var35;
                            var41.field1662 = var27 + var35;
                        }
                    }
                }
                if (arg0 == 29) {
                    int var52 = arg2.method349();
                    int var53 = (var52 >> 4 & 7) + this.field489;
                    int var54 = (var52 & 7) + this.field490;
                    int var55 = var53 + arg2.method350();
                    int var56 = var54 + arg2.method350();
                    int var57 = arg2.method352();
                    int var58 = arg2.method351();
                    int var59 = arg2.method349() * 4;
                    int var60 = arg2.method349() * 4;
                    int var61 = arg2.method351();
                    int var62 = arg2.method351();
                    int var63 = arg2.method349();
                    int var64 = arg2.method349();
                    if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104 && var58 != 65535) {
                        int var65 = var53 * 128 + 64;
                        int var66 = var54 * 128 + 64;
                        int var67 = var55 * 128 + 64;
                        int var68 = var56 * 128 + 64;
                        class51 var69 = new class51(var66, this.method156(this.field358, 478, var65, var66) - var59, var64, var57, field464 + var62, field464 + var61, var58, this.field358, var60, var65, var63, 8);
                        var69.method516(var68, true, field464 + var61, var67, this.method156(this.field358, 478, var67, var68) - var60);
                        this.field359.method326(var69);
                    }
                } else if (arg0 == 25) {
                    int var70 = arg2.method349();
                    int var71 = (var70 >> 4 & 7) + this.field489;
                    int var72 = (var70 & 7) + this.field490;
                    int var73 = arg2.method351();
                    int var74 = arg2.method369(0);
                    int var75 = var74 >> 2;
                    int var76 = var74 & 3;
                    int var77 = this.field497[var75];
                    if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                        this.method151(-1, var76, 2, var75, 0, var72, this.field358, var71, var73, var77);
                    }
                } else if (arg0 == 78) {
                    int var78 = arg2.method378((byte) 7);
                    int var79 = arg2.method349();
                    int var80 = (var79 >> 4 & 7) + this.field489;
                    int var81 = (var79 & 7) + this.field490;
                    if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                        class25 var82 = this.field309[this.field358][var80][var81];
                        if (var82 != null) {
                            for (class44 var83 = (class44) var82.method329(); var83 != null; var83 = (class44) var82.method331(9)) {
                                if ((var78 & 32767) == var83.field1250) {
                                    var83.method1();
                                    break;
                                }
                            }
                            if (var82.method329() == null) {
                                this.field309[this.field358][var80][var81] = null;
                            }
                            this.method144(var80, var81);
                        }
                    }
                } else if (arg0 == 231) {
                    int var84 = arg2.method351();
                    int var85 = arg2.method368(false);
                    int var86 = (var85 >> 4 & 7) + this.field489;
                    int var87 = (var85 & 7) + this.field490;
                    int var88 = arg2.method379((byte) -102);
                    int var89 = arg2.method379((byte) -102);
                    if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && this.field361 != var84) {
                        class44 var90 = new class44();
                        var90.field1250 = var88;
                        var90.field1251 = var89;
                        if (this.field309[this.field358][var86][var87] == null) {
                            this.field309[this.field358][var86][var87] = new class25(3);
                        }
                        this.field309[this.field358][var86][var87].method326(var90);
                        this.method144(var86, var87);
                    }
                } else if (arg0 != 197) {
                    if (arg0 == 216) {
                        int var99 = arg2.method368(false);
                        int var100 = var99 >> 2;
                        int var101 = var99 & 3;
                        int var102 = this.field497[var100];
                        int var103 = arg2.method370(-719);
                        int var104 = (var103 >> 4 & 7) + this.field489;
                        int var105 = (var103 & 7) + this.field490;
                        if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                            this.method151(-1, var101, 2, var100, 0, var105, this.field358, var104, -1, var102);
                        }
                    } else if (arg0 == 40) {
                        int var106 = arg2.method379((byte) -102);
                        int var107 = arg2.method369(0);
                        int var108 = (var107 >> 4 & 7) + this.field489;
                        int var109 = (var107 & 7) + this.field490;
                        int var110 = arg2.method369(0);
                        int var111 = var110 >> 2;
                        int var112 = var110 & 3;
                        int var113 = this.field497[var111];
                        if (var108 >= 0 && var109 >= 0 && var108 < 103 && var109 < 103) {
                            int var114 = this.field405[this.field358][var108][var109];
                            int var115 = this.field405[this.field358][var108 + 1][var109];
                            int var116 = this.field405[this.field358][var108 + 1][var109 + 1];
                            int var117 = this.field405[this.field358][var108][var109 + 1];
                            if (var113 == 0) {
                                class68 var118 = this.field369.method37((byte) 2, var108, this.field358, var109);
                                if (var118 != null) {
                                    int var119 = var118.field1642 >> 14 & 32767;
                                    if (var111 == 2) {
                                        var118.field1640 = new class56(var119, 2, var114, var117, var116, var115, false, var112 + 4, (byte) 6, var106);
                                        var118.field1641 = new class56(var119, 2, var114, var117, var116, var115, false, var112 + 1 & 3, (byte) 6, var106);
                                    } else {
                                        var118.field1640 = new class56(var119, var111, var114, var117, var116, var115, false, var112, (byte) 6, var106);
                                    }
                                }
                            }
                            if (var113 == 1) {
                                class67 var120 = this.field369.method38(var109, var108, this.field358, -556);
                                if (var120 != null) {
                                    var120.field1632 = new class56(var120.field1633 >> 14 & 32767, 4, var114, var117, var116, var115, false, 0, (byte) 6, var106);
                                }
                            }
                            if (var113 == 2) {
                                class26 var121 = this.field369.method39(this.field358, var109, (byte) -108, var108);
                                if (var111 == 11) {
                                    var111 = 10;
                                }
                                if (var121 != null) {
                                    var121.field1000 = new class56(var121.field1008 >> 14 & 32767, var111, var114, var117, var116, var115, false, var112, (byte) 6, var106);
                                }
                            }
                            if (var113 == 3) {
                                class71 var122 = this.field369.method40((byte) 6, var109, var108, this.field358);
                                if (var122 != null) {
                                    var122.field1689 = new class56(var122.field1690 >> 14 & 32767, 22, var114, var117, var116, var115, false, var112, (byte) 6, var106);
                                }
                            }
                        }
                    }
                } else {
                    int var91 = arg2.method349();
                    int var92 = (var91 >> 4 & 7) + this.field489;
                    int var93 = (var91 & 7) + this.field490;
                    int var94 = arg2.method351();
                    int var95 = arg2.method351();
                    int var96 = arg2.method351();
                    if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                        class25 var97 = this.field309[this.field358][var92][var93];
                        if (var97 != null) {
                            for (class44 var98 = (class44) var97.method329(); var98 != null; var98 = (class44) var97.method331(9)) {
                                if ((var94 & 32767) == var98.field1250 && var98.field1251 == var95) {
                                    var98.field1251 = var96;
                                    break;
                                }
                            }
                            this.method144(var92, var93);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method140(byte arg0) {
        this.field440.method465(false);
        class8.field668 = this.field355;
        this.field270.method319(0, 0, (byte) 71);
        if (this.field178 != -1) {
            this.method136(0, (byte) -111, 0, class2.field66[this.field178], 0);
        } else if (this.field555[this.field333] != -1) {
            this.method136(0, (byte) -111, 0, class2.field66[this.field555[this.field333]], 0);
        }
        if (this.field246 && this.field484 == 1) {
            this.method106((byte) 1);
        }
        this.field440.method466(2, super.field1175, 205, 553);
        this.field442.method465(false);
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field391 = !this.field391;
        }
        class8.field668 = this.field356;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method141(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field498 >= 100) {
                this.method182(0, "", 0, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class61.method584(true, class61.method581(arg1, 581));
                for (int var5 = 0; var5 < this.field498; ++var5) {
                    if (this.field201[var5] == arg1) {
                        this.method182(0, "", 0, var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field542; ++var6) {
                    if (this.field483[var6] == arg1) {
                        this.method182(0, "", 0, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field201[this.field498++] = arg1;
                this.field521 = true;
                this.field334.method338(0, 176);
                this.field222 &= arg0;
                this.field334.method345(arg1, (byte) 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLAMSZZFWC;)Z")
    public final boolean method142(byte arg0, class2 arg1) {
        if (arg0 != 8) {
            this.field256 = this.field431.method349();
        }
        int var3 = arg1.field54;
        if (this.field543 == 2) {
            if (var3 == 201) {
                this.field530 = true;
                this.field240 = 0;
                this.field362 = true;
                this.field289 = "";
                this.field404 = 1;
                this.field221 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field530 = true;
                this.field240 = 0;
                this.field362 = true;
                this.field289 = "";
                this.field404 = 2;
                this.field221 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field259 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field530 = true;
                this.field240 = 0;
                this.field362 = true;
                this.field289 = "";
                this.field404 = 4;
                this.field221 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field530 = true;
                this.field240 = 0;
                this.field362 = true;
                this.field289 = "";
                this.field404 = 5;
                this.field221 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field308[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class43.field1242 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class43.field1242) {
                                var6 = 0;
                            }
                        }
                        if (!class43.field1243[var6].field1249 && class43.field1243[var6].field1244 == var4 + (this.field229 ? 0 : 7)) {
                            this.field308[var4] = var6;
                            this.field217 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field193[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field570[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field570[var7].length) {
                        var9 = 0;
                    }
                }
                this.field193[var7] = var9;
                this.field217 = true;
            }
            if (var3 == 324 && !this.field229) {
                this.field229 = true;
                this.method174((byte) 2);
            }
            if (var3 == 325 && this.field229) {
                this.field229 = false;
                this.method174((byte) 2);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field557 = !this.field557;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method146(27555);
                    if (this.field326.length() > 0) {
                        this.field334.method338(0, 81);
                        this.field334.method345(class61.method580(this.field326), (byte) 12);
                        this.field334.method339(var3 - 601);
                        this.field334.method339(this.field557 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field334.method338(0, 100);
                this.field334.method339(this.field229 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field334.method339(this.field308[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field334.method339(this.field193[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method143(int arg0, boolean arg1) {
        int var3 = class24.field976[arg0].field984;
        if (!arg1) {
            this.field334.method339(21);
        }
        if (var3 != 0) {
            int var4 = this.field286[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class8.method232(-507, 0.9D);
                }
                if (var4 == 2) {
                    class8.method232(-507, 0.8D);
                }
                if (var4 == 3) {
                    class8.method232(-507, 0.7D);
                }
                if (var4 == 4) {
                    class8.method232(-507, 0.6D);
                }
                class15.field782.method568();
                this.field535 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field444;
                if (var4 == 0) {
                    this.method109(this.field444, (byte) 15, 0);
                    this.field444 = true;
                }
                if (var4 == 1) {
                    this.method109(this.field444, (byte) 15, -400);
                    this.field444 = true;
                }
                if (var4 == 2) {
                    this.method109(this.field444, (byte) 15, -800);
                    this.field444 = true;
                }
                if (var4 == 3) {
                    this.method109(this.field444, (byte) 15, -1200);
                    this.field444 = true;
                }
                if (var4 == 4) {
                    this.field444 = false;
                }
                if (this.field444 != var5 && !field366) {
                    if (this.field444) {
                        this.field592 = this.field192;
                        this.field593 = true;
                        this.field236.method531(2, this.field592);
                    } else {
                        this.method125(-32557);
                    }
                    this.field239 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field435 = true;
                    this.method126(0, 0);
                }
                if (var4 == 1) {
                    this.field435 = true;
                    this.method126(-400, 0);
                }
                if (var4 == 2) {
                    this.field435 = true;
                    this.method126(-800, 0);
                }
                if (var4 == 3) {
                    this.field435 = true;
                    this.method126(-1200, 0);
                }
                if (var4 == 4) {
                    this.field435 = false;
                }
            }
            if (var3 == 5) {
                this.field614 = var4;
            }
            if (var3 == 6) {
                this.field500 = var4;
            }
            if (var3 == 8) {
                this.field220 = var4;
                this.field530 = true;
            }
            if (var3 == 9) {
                this.field541 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method144(int arg0, int arg1) {
        class25 var3 = this.field309[this.field358][arg0][arg1];
        if (var3 == null) {
            this.field369.method36(this.field358, arg0, arg1);
        } else {
            int var4 = -99999999;
            class44 var5 = null;
            for (class44 var6 = (class44) var3.method329(); var6 != null; var6 = (class44) var3.method331(9)) {
                class15 var11 = class15.method278(var6.field1250);
                int var12 = var11.field760;
                if (var11.field779) {
                    var12 = (var6.field1251 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method327(0, var5);
            class44 var7 = null;
            class44 var8 = null;
            for (class44 var9 = (class44) var3.method329(); var9 != null; var9 = (class44) var3.method331(9)) {
                if (var5.field1250 != var9.field1250 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1250 != var9.field1250 && var7.field1250 != var9.field1250 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field369.method22(0, this.field358, var5, var10, this.method156(this.field358, 478, arg0 * 128 + 64, arg1 * 128 + 64), arg1, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method145(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            throw new NullPointerException();
        } else {
            int var3 = arg0 - arg2;
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

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method146(int arg0) {
        this.field334.method338(0, 194);
        if (this.field178 != -1) {
            this.field178 = -1;
            this.field521 = true;
            this.field321 = false;
            this.field421 = true;
        }
        if (this.field455 != -1) {
            this.field455 = -1;
            this.field530 = true;
            this.field321 = false;
        }
        this.field345 = -1;
        if (arg0 == 27555) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method147(byte arg0) {
        if (arg0 != 31) {
            this.field245 = -488;
        }
        for (int var2 = 0; var2 < this.field602; ++var2) {
            if (this.field446[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field311[var2] == this.field164 && this.field451[var2] == this.field532) {
                        if (!this.method120(49583)) {
                            var3 = true;
                        }
                    } else {
                        class30 var4 = class3.method9(4, this.field311[var2], this.field451[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1065 / 22) > (long) (this.field370 / 22) + this.field357) {
                            this.field370 = var4.field1065;
                            this.field357 = System.currentTimeMillis();
                            if (this.method71((byte) -126, var4.field1064, var4.field1065)) {
                                this.field164 = this.field311[var2];
                                this.field532 = this.field451[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field446[var2] != -5) {
                    this.field446[var2] = -5;
                } else {
                    --this.field602;
                    for (int var6 = var2; var6 < this.field602; ++var6) {
                        this.field311[var6] = this.field311[var6 + 1];
                        this.field451[var6] = this.field451[var6 + 1];
                        this.field446[var6] = this.field446[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field446[var2]--;
            }
        }
        if (this.field239 > 0) {
            this.field239 -= 20;
            if (this.field239 < 0) {
                this.field239 = 0;
            }
            if (this.field239 == 0 && this.field444 && !field366) {
                this.field592 = this.field192;
                this.field593 = true;
                this.field236.method531(2, this.field592);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILKHOMSBHW;)V")
    private final void method148(int arg0, int arg1, class30 arg2) {
        while (true) {
            if (arg2.field1066 + 21 < arg0 * 8) {
                int var4 = arg2.method360(true, 14);
                if (var4 != 16383) {
                    if (this.field480[var4] == null) {
                        this.field480[var4] = new class13();
                    }
                    class13 var5 = this.field480[var4];
                    this.field482[this.field481++] = var4;
                    var5.field1542 = field464;
                    int var6 = arg2.method360(true, 1);
                    int var7 = arg2.method360(true, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method360(true, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var5.field736 = class59.method570(arg2.method360(true, 12));
                    int var9 = arg2.method360(true, 1);
                    if (var9 == 1) {
                        this.field417[this.field416++] = var4;
                    }
                    var5.field1565 = var5.field736.field1508;
                    var5.field1558 = var5.field736.field1529;
                    var5.field1560 = var5.field736.field1515;
                    var5.field1561 = var5.field736.field1517;
                    var5.field1562 = var5.field736.field1526;
                    var5.field1563 = var5.field736.field1506;
                    var5.field1545 = var5.field736.field1504;
                    var5.method577(field285.field1581[0] + var7, var6 == 1, true, field285.field1582[0] + var8);
                    continue;
                }
            }
            arg2.method361((byte) 24);
            if (arg1 != 36162) {
                this.field334.method339(172);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LKHOMSBHW;II)V")
    private final void method149(class30 arg0, int arg1, int arg2) {
        int var10000 = arg1 + arg2;
        for (int var5 = 0; var5 < this.field416; ++var5) {
            int var6 = this.field417[var5];
            class69 var7 = this.field413[var6];
            int var8 = arg0.method349();
            if ((var8 & 32) != 0) {
                var8 += arg0.method349() << 8;
            }
            this.method186(var8, this.field617, arg0, var6, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;III)LSYUGXMZF;")
    public final class55 method150(String arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field169[0] != null) {
                var7 = this.field169[0].method310(arg1, 1);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field436.reset();
            this.field436.update(var7);
            int var9 = (int) this.field436.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class55(var7, (byte) 71);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method70("Requesting " + arg0, arg3, (byte) 7);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method107(arg2 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class30 var17 = new class30(var16, -982);
                    var17.field1065 = 3;
                    int var18 = var17.method353() + 6;
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
                            this.method70("Loading " + arg0 + " - " + var23 + "%", arg3, (byte) 7);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field169[0] != null) {
                            this.field169[0].method311((byte) -39, arg1, var7.length, var7);
                        }
                    } catch (Exception var29) {
                        this.field169[0] = null;
                    }
                    if (var7 != null) {
                        this.field436.reset();
                        this.field436.update(var7);
                        int var24 = (int) this.field436.getValue();
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
                            this.method70("Game updated - please reload page", arg3, (byte) 7);
                            var26 = 10;
                        } else {
                            this.method70(var12 + " - Retrying in " + var26, arg3, (byte) 7);
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
                    this.field613 = !this.field613;
                }
            }
            class55 var27 = new class55(var7, (byte) 71);
            if (arg4 >= 0) {
                field291 = 75;
            }
            return var27;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class70 var11 = null;
        for (class70 var12 = (class70) this.field216.method329(); var12 != null; var12 = (class70) this.field216.method331(9)) {
            if (var12.field1680 == arg6 && var12.field1682 == arg7 && var12.field1683 == arg5 && var12.field1681 == arg9) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class70();
            var11.field1680 = arg6;
            var11.field1681 = arg9;
            var11.field1682 = arg7;
            var11.field1683 = arg5;
            this.method207(90, var11);
            this.field216.method326(var11);
        }
        var11.field1674 = arg8;
        var11.field1676 = arg3;
        if (arg2 != 2) {
            field547 = !field547;
        }
        var11.field1675 = arg1;
        var11.field1684 = arg4;
        var11.field1685 = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLGLPEJJEY;)V")
    public final void method152(byte arg0, class19 arg1) {
        short var3 = 256;
        if (arg0 == 1) {
            boolean var4 = false;
        } else {
            this.field256 = this.field431.method349();
        }
        for (int var5 = 0; var5 < this.field558.length; ++var5) {
            this.field558[var5] = 0;
        }
        for (int var6 = 0; var6 < 5000; ++var6) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field558[var18] = (int) (Math.random() * 256.0D);
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field559[var17] = (this.field558[var17 - 1] + this.field558[var17 + 1] + this.field558[var17 - 128] + this.field558[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field558;
            this.field558 = this.field559;
            this.field559 = var15;
        }
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field896; ++var9) {
                for (int var10 = 0; var10 < arg1.field895; ++var10) {
                    if (arg1.field893[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field897;
                        int var12 = var9 + 16 + arg1.field898;
                        int var13 = (var12 << 7) + var11;
                        this.field558[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKHOMSBHW;BI)V")
    private final void method153(class30 arg0, byte arg1, int arg2) {
        while (true) {
            if (arg0.field1066 + 10 < arg2 * 8) {
                int var4 = arg0.method360(true, 11);
                if (var4 != 2047) {
                    if (this.field413[var4] == null) {
                        this.field413[var4] = new class69();
                        if (this.field418[var4] != null) {
                            this.field413[var4].method593(this.field418[var4], true);
                        }
                    }
                    this.field415[this.field414++] = var4;
                    class69 var5 = this.field413[var4];
                    var5.field1542 = field464;
                    int var6 = arg0.method360(true, 1);
                    int var7 = arg0.method360(true, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg0.method360(true, 1);
                    if (var8 == 1) {
                        this.field417[this.field416++] = var4;
                    }
                    int var9 = arg0.method360(true, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method577(field285.field1581[0] + var7, var6 == 1, true, field285.field1582[0] + var9);
                    continue;
                }
            }
            arg0.method361((byte) 24);
            if (arg1 == 2) {
                return;
            }
            for (int var10 = 1; var10 > 0; ++var10) {
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method154(boolean arg0, int arg1) {
        if (arg1 != -21136) {
            this.field256 = this.field431.method349();
        }
        if (field285.field1539 >> 7 == this.field242 && field285.field1540 >> 7 == this.field243) {
            this.field242 = 0;
        }
        int var3 = this.field414;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class69 var5;
            int var6;
            if (arg0) {
                var5 = field285;
                var6 = this.field412 << 14;
            } else {
                var5 = this.field413[this.field415[var4]];
                var6 = this.field415[var4] << 14;
            }
            if (var5 != null && var5.method263(6)) {
                var5.field1673 = false;
                if ((field366 && this.field414 > 50 || this.field414 > 200) && !arg0 && var5.field1567 == var5.field1545) {
                    var5.field1673 = true;
                }
                int var7 = var5.field1539 >> 7;
                int var8 = var5.field1540 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1653 != null && field464 >= var5.field1667 && field464 < var5.field1668) {
                        var5.field1673 = false;
                        var5.field1656 = this.method156(this.field358, 478, var5.field1539, var5.field1540);
                        this.field369.method27(var5.field1541, var5.field1661, var6, true, var5.field1656, 60, var5, var5.field1660, var5.field1540, var5.field1662, this.field358, var5.field1659, var5.field1539);
                    } else {
                        if ((var5.field1539 & 127) == 64 && (var5.field1540 & 127) == 64) {
                            if (this.field393[var7][var8] == this.field560) {
                                continue;
                            }
                            this.field393[var7][var8] = this.field560;
                        }
                        var5.field1656 = this.method156(this.field358, 478, var5.field1539, var5.field1540);
                        this.field369.method26(var5.field1540, var5.field1656, var6, var5.field1541, -671, this.field358, 60, var5.field1570, var5, var5.field1539);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method155(int arg0) {
        if (this.field443 == null) {
            this.method187((byte) -60);
            super.field1176 = null;
            this.field382 = null;
            this.field383 = null;
            this.field384 = null;
            this.field385 = null;
            this.field386 = null;
            this.field387 = null;
            this.field388 = null;
            this.field255 += arg0;
            this.field389 = null;
            this.field390 = null;
            this.field443 = new class42(479, 0, this.method192(-240), 96);
            this.field441 = new class42(172, 0, this.method192(-240), 156);
            class39.method418(320);
            this.field271.method319(0, 0, (byte) 71);
            this.field440 = new class42(190, 0, this.method192(-240), 261);
            this.field442 = new class42(512, 0, this.method192(-240), 334);
            class39.method418(320);
            this.field233 = new class42(496, 0, this.method192(-240), 50);
            this.field234 = new class42(269, 0, this.method192(-240), 37);
            this.field235 = new class42(249, 0, this.method192(-240), 45);
            this.field535 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method156(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field450[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg3 & 127;
            int var10 = (128 - var8) * this.field405[var7][var5][var6] + this.field405[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = 39 / arg1;
            int var12 = (128 - var8) * this.field405[var7][var5][var6 + 1] + this.field405[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var12 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILAMSZZFWC;)I")
    public final int method157(int arg0, int arg1, class2 arg2) {
        if (arg0 != 0) {
            this.method116();
        }
        if (arg2.field18 != null && arg1 < arg2.field18.length) {
            try {
                int[] var4 = arg2.field18[arg1];
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
                        var9 = this.field305[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field591[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field419[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class2 var11 = class2.field66[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class15.field746 && (!class15.method278(var12).field752 || field365)) {
                            for (int var13 = 0; var13 < var11.field51.length; ++var13) {
                                if (var12 + 1 == var11.field51[var13]) {
                                    var9 += var11.field58[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field286[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field536[this.field591[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field286[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field285.field1645;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class62.field1599; ++var14) {
                            if (class62.field1601[var14]) {
                                var9 += this.field591[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class2 var15 = class2.field66[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class15.field746 && (!class15.method278(var16).field752 || field365)) {
                            for (int var17 = 0; var17 < var15.field51.length; ++var17) {
                                if (var15.field51[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field188;
                    }
                    if (var8 == 12) {
                        var9 = this.field493;
                    }
                    if (var8 == 13) {
                        int var18 = this.field286[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class16 var21 = class16.field792[var20];
                        int var22 = var21.field794;
                        int var23 = var21.field795;
                        int var24 = var21.field796;
                        int var25 = field528[var24 - var23];
                        var9 = this.field286[var22] >> var23 & var25;
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
                        var9 = (field285.field1539 >> 7) + this.field537;
                    }
                    if (var8 == 19) {
                        var9 = (field285.field1540 >> 7) + this.field538;
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

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method158(int arg0) {
        this.field255 += arg0;
        this.field573 = 0;
        int var2 = (field285.field1539 >> 7) + this.field537;
        int var3 = (field285.field1540 >> 7) + this.field538;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field573 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field573 = 1;
        }
        if (this.field573 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field573 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method159(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field223 != null) {
                this.field223.method398();
            }
        } catch (Exception var2) {
        }
        this.field223 = null;
        if (arg0 != 0) {
            this.field309 = null;
        }
        this.method125(-32557);
        if (this.field249 != null) {
            this.field249.field902 = false;
        }
        this.field249 = null;
        this.field236.method545();
        this.field236 = null;
        this.field479 = null;
        this.field334 = null;
        this.field571 = null;
        this.field431 = null;
        this.field315 = null;
        this.field463 = null;
        this.field322 = null;
        this.field316 = null;
        this.field317 = null;
        this.field405 = null;
        this.field450 = null;
        this.field369 = null;
        this.field456 = null;
        this.field278 = null;
        this.field224 = null;
        this.field453 = null;
        this.field454 = null;
        this.field505 = null;
        this.field440 = null;
        this.field441 = null;
        this.field442 = null;
        this.field443 = null;
        this.field233 = null;
        this.field234 = null;
        this.field235 = null;
        this.field395 = null;
        this.field396 = null;
        this.field397 = null;
        this.field398 = null;
        this.field399 = null;
        this.field400 = null;
        this.field401 = null;
        this.field402 = null;
        this.field403 = null;
        this.field270 = null;
        this.field271 = null;
        this.field272 = null;
        this.field373 = null;
        this.field374 = null;
        this.field375 = null;
        this.field232 = null;
        this.field250 = null;
        this.field251 = null;
        this.field252 = null;
        this.field253 = null;
        this.field254 = null;
        this.field422 = null;
        this.field423 = null;
        this.field424 = null;
        this.field425 = null;
        this.field426 = null;
        this.field577 = null;
        this.field267 = null;
        this.field546 = null;
        this.field323 = null;
        this.field564 = null;
        this.field565 = null;
        this.field566 = null;
        this.field567 = null;
        this.field568 = null;
        this.field469 = null;
        this.field596 = null;
        this.field393 = null;
        this.field413 = null;
        this.field415 = null;
        this.field417 = null;
        this.field418 = null;
        this.field171 = null;
        this.field480 = null;
        this.field482 = null;
        this.field309 = null;
        this.field216 = null;
        this.field359 = null;
        this.field367 = null;
        this.field273 = null;
        this.field274 = null;
        this.field275 = null;
        this.field276 = null;
        this.field314 = null;
        this.field286 = null;
        this.field512 = null;
        this.field513 = null;
        this.field594 = null;
        this.field244 = null;
        this.field494 = null;
        this.field483 = null;
        this.field583 = null;
        this.field385 = null;
        this.field386 = null;
        this.field382 = null;
        this.field383 = null;
        this.field384 = null;
        this.field387 = null;
        this.field388 = null;
        this.field389 = null;
        this.field390 = null;
        this.method187((byte) -60);
        class50.method509(6);
        class59.method573(6);
        class15.method276(6);
        class10.field702 = null;
        class43.field1243 = null;
        class2.field66 = null;
        class27.field1010 = null;
        class9.field682 = null;
        class22.field913 = null;
        class22.field925 = null;
        class24.field976 = null;
        super.field1176 = null;
        class69.field1655 = null;
        class8.method223(6);
        class4.method14(6);
        class17.method281(6);
        class48.method502(6);
        System.gc();
        if (class1.field4) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILUKUMCXZT;I)V")
    public final void method160(int arg0, class60 arg1, int arg2) {
        if (arg0 != 1) {
            this.field309 = null;
        }
        this.method161(arg1.field1540, (byte) 8, arg1.field1539, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)V")
    public final void method161(int arg0, byte arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method156(this.field358, 478, arg2, arg0) - arg3;
            int var6 = arg2 - this.field293;
            if (arg1 != 8) {
                this.field237 = this.field619.method526();
            }
            int var7 = var5 - this.field294;
            int var8 = arg0 - this.field295;
            int var9 = class17.field875[this.field296];
            int var10 = class17.field876[this.field296];
            int var11 = class17.field875[this.field297];
            int var12 = class17.field876[this.field297];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field298 = (var13 << 9) / var17 + class8.field662;
                this.field299 = (var16 << 9) / var17 + class8.field663;
            } else {
                this.field298 = -1;
                this.field299 = -1;
            }
        } else {
            this.field298 = -1;
            this.field299 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILTNNDDWAZ;II)V")
    public final void method162(int arg0, class57 arg1, int arg2, int arg3) {
        int var5 = this.field466 + this.field407 & 2047;
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class17.field875[var5];
            int var8 = class17.field876[var5];
            int var9 = var7 * 256 / (this.field197 + 256);
            int var10 = var8 * 256 / (this.field197 + 256);
            int var11 = 45 / arg2;
            int var12 = arg0 * var10 + arg3 * var9 >> 16;
            int var13 = arg3 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method564(this.field271, 83 - var13 - arg1.field1487 / 2 - 4, 0, var12 + 94 - arg1.field1486 / 2 + 4);
            } else {
                arg1.method558(83 - var13 - arg1.field1487 / 2 - 4, var12 + 94 - arg1.field1486 / 2 + 4, (byte) 71);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
        if (arg0) {
            this.method116();
        }
        if (this.field179 == 2) {
            this.method161((this.field210 - this.field538 << 7) + this.field213, (byte) 8, (this.field209 - this.field537 << 7) + this.field212, this.field211 * 2);
            if (this.field298 > -1 && field464 % 20 < 10) {
                this.field546[2].method558(this.field299 - 28, this.field298 - 12, (byte) 71);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method164(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field470 = this.field619.method526();
        }
        this.method86((byte) 94);
        this.field384.method465(false);
        this.field589.method319(0, 0, (byte) 71);
        short var3 = 360;
        short var4 = 200;
        if (this.field563 == 0) {
            int var5 = var4 / 2 + 80;
            this.field457.method249(this.field236.field1400, false, true, var3 / 2, var5, 7711145);
            int var6 = var4 / 2 - 20;
            this.field459.method249("Welcome to RuneScape", false, true, var3 / 2, var6, 16776960);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field590.method319(var8 - 20, var7 - 73, (byte) 71);
            this.field459.method249("New User", false, true, var7, var8 + 5, 16777215);
            int var9 = var3 / 2 + 80;
            this.field590.method319(var8 - 20, var9 - 73, (byte) 71);
            this.field459.method249("Existing User", false, true, var9, var8 + 5, 16777215);
        }
        if (this.field563 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field409.length() > 0) {
                this.field459.method249(this.field409, false, true, var3 / 2, var10 - 15, 16776960);
                this.field459.method249(this.field410, false, true, var3 / 2, var10, 16776960);
                var10 += 30;
            } else {
                this.field459.method249(this.field410, false, true, var3 / 2, var10 - 7, 16776960);
                var10 += 30;
            }
            this.field459.method256(16777215, var10, true, var3 / 2 - 90, "Username: " + this.field312 + (this.field478 == 0 & field464 % 40 < 20 ? "@yel@|" : ""), (byte) 2);
            var10 += 15;
            this.field459.method256(16777215, var10, true, var3 / 2 - 88, "Password: " + class61.method585(this.field313, -4885) + (this.field478 == 1 & field464 % 40 < 20 ? "@yel@|" : ""), (byte) 2);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field590.method319(var12 - 20, var11 - 73, (byte) 71);
                this.field459.method249("Login", false, true, var11, var12 + 5, 16777215);
                int var13 = var3 / 2 + 80;
                this.field590.method319(var12 - 20, var13 - 73, (byte) 71);
                this.field459.method249("Cancel", false, true, var13, var12 + 5, 16777215);
            }
        }
        if (this.field563 == 3) {
            this.field459.method249("Create a free account", false, true, var3 / 2, var4 / 2 - 60, 16776960);
            int var14 = var4 / 2 - 35;
            this.field459.method249("To create a new account you need to", false, true, var3 / 2, var14, 16777215);
            int var18 = var14 + 15;
            this.field459.method249("go back to the main RuneScape webpage", false, true, var3 / 2, var18, 16777215);
            int var19 = var18 + 15;
            this.field459.method249("and choose the red 'create account'", false, true, var3 / 2, var19, 16777215);
            int var20 = var19 + 15;
            this.field459.method249("button at the top right of that page.", false, true, var3 / 2, var20, 16777215);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field590.method319(var16 - 20, var15 - 73, (byte) 71);
            this.field459.method249("Cancel", false, true, var15, var16 + 5, 16777215);
        }
        this.field384.method466(2, super.field1175, 171, 202);
        if (this.field535) {
            this.field535 = false;
            this.field382.method466(2, super.field1175, 0, 128);
            this.field383.method466(2, super.field1175, 371, 202);
            this.field387.method466(2, super.field1175, 265, 0);
            this.field388.method466(2, super.field1175, 265, 562);
            this.field389.method466(2, super.field1175, 171, 128);
            this.field390.method466(2, super.field1175, 171, 562);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method165(int arg0, boolean arg1) {
        if (arg0 < 0) {
            for (int var3 = 0; var3 < this.field481; ++var3) {
                class13 var4 = this.field480[this.field482[var3]];
                int var5 = (this.field482[var3] << 14) + 536870912;
                if (var4 != null && var4.method263(6) && var4.field736.field1524 == arg1) {
                    int var6 = var4.field1539 >> 7;
                    int var7 = var4.field1540 >> 7;
                    if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                        if (var4.field1565 == 1 && (var4.field1539 & 127) == 64 && (var4.field1540 & 127) == 64) {
                            if (this.field393[var6][var7] == this.field560) {
                                continue;
                            }
                            this.field393[var6][var7] = this.field560;
                        }
                        if (!var4.field736.field1512) {
                            var5 += Integer.MIN_VALUE;
                        }
                        this.field369.method26(var4.field1540, this.method156(this.field358, 478, var4.field1539, var4.field1540), var5, var4.field1541, -671, this.field358, (var4.field1565 - 1) * 64 + 60, var4.field1570, var4, var4.field1539);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method166(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field470 = this.field619.method526();
        }
        Graphics var2 = this.method192(-240).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method413((byte) 92, 1);
        if (this.field587) {
            this.field186 = false;
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
        if (this.field241) {
            this.field186 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field261) {
            this.field186 = false;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method167(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        return arg1 >= 0 ? this.field470 : ((arg0 & 16711935) * var5 + (arg2 & 16711935) * arg3 & -16711936) + ((arg0 & 65280) * var5 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILAMSZZFWC;IIIII)V")
    public final void method168(int arg0, class2 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1.field35 == 0 && arg1.field20 != null && !arg1.field30) {
            if (arg2 >= arg4 && arg5 >= arg3 && arg2 <= arg1.field43 + arg4 && arg5 <= arg1.field13 + arg3) {
                int var8 = arg1.field20.length;
                if (arg0 != 0) {
                    this.field256 = -1;
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg1.field24[var9] + arg4;
                    int var11 = arg1.field36[var9] + arg3 - arg6;
                    class2 var12 = class2.field66[arg1.field20[var9]];
                    int var13 = var12.field48 + var10;
                    int var14 = var12.field6 + var11;
                    if ((var12.field32 >= 0 || var12.field67 != 0) && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field43 + var13 && arg5 < var12.field13 + var14) {
                        if (var12.field32 >= 0) {
                            this.field343 = var12.field32;
                        } else {
                            this.field343 = var12.field15;
                        }
                    }
                    if (var12.field35 == 0) {
                        this.method168(0, var12, arg2, var14, var13, arg5, var12.field49);
                        if (var12.field65 > var12.field13) {
                            this.method130(var12.field65, arg5, var14, var12.field13, -12137, var12.field43 + var13, var12, true, arg2);
                        }
                    } else {
                        if (var12.field46 == 1 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field43 + var13 && arg5 < var12.field13 + var14) {
                            boolean var15 = false;
                            if (var12.field54 != 0) {
                                var15 = this.method117(var12, -117);
                            }
                            if (!var15) {
                                this.field314[this.field524] = var12.field45;
                                this.field275[this.field524] = 557;
                                this.field274[this.field524] = var12.field15;
                                ++this.field524;
                            }
                        }
                        if (var12.field46 == 2 && this.field301 == 0 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field43 + var13 && arg5 < var12.field13 + var14) {
                            String var16 = var12.field53;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field314[this.field524] = var16 + " @gre@" + var12.field19;
                            this.field275[this.field524] = 764;
                            this.field274[this.field524] = var12.field15;
                            ++this.field524;
                        }
                        if (var12.field46 == 3 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field43 + var13 && arg5 < var12.field13 + var14) {
                            this.field314[this.field524] = "Close";
                            this.field275[this.field524] = 342;
                            this.field274[this.field524] = var12.field15;
                            ++this.field524;
                        }
                        if (var12.field46 == 4 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field43 + var13 && arg5 < var12.field13 + var14) {
                            this.field314[this.field524] = var12.field45;
                            this.field275[this.field524] = 298;
                            this.field274[this.field524] = var12.field15;
                            ++this.field524;
                        }
                        if (var12.field46 == 5 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field43 + var13 && arg5 < var12.field13 + var14) {
                            this.field314[this.field524] = var12.field45;
                            this.field275[this.field524] = 965;
                            this.field274[this.field524] = var12.field15;
                            ++this.field524;
                        }
                        if (var12.field46 == 6 && !this.field321 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field43 + var13 && arg5 < var12.field13 + var14) {
                            this.field314[this.field524] = var12.field45;
                            this.field275[this.field524] = 513;
                            this.field274[this.field524] = var12.field15;
                            ++this.field524;
                        }
                        if (var12.field35 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field13; ++var18) {
                                for (int var19 = 0; var19 < var12.field43; ++var19) {
                                    int var20 = (var12.field60 + 32) * var19 + var13;
                                    int var21 = (var12.field69 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field31[var17];
                                        var21 += var12.field21[var17];
                                    }
                                    if (arg2 >= var20 && arg5 >= var21 && arg2 < var20 + 32 && arg5 < var21 + 32) {
                                        this.field437 = var17;
                                        this.field438 = var12.field15;
                                        if (var12.field51[var17] > 0) {
                                            class15 var22 = class15.method278(var12.field51[var17] - 1);
                                            if (this.field173 == 1 && var12.field44) {
                                                if (this.field175 != var12.field15 || this.field174 != var17) {
                                                    this.field314[this.field524] = "Use " + this.field177 + " with @lre@" + var22.field766;
                                                    this.field275[this.field524] = 363;
                                                    this.field276[this.field524] = var22.field747;
                                                    this.field273[this.field524] = var17;
                                                    this.field274[this.field524] = var12.field15;
                                                    ++this.field524;
                                                }
                                            } else if (this.field301 == 1 && var12.field44) {
                                                if ((this.field303 & 16) == 16) {
                                                    this.field314[this.field524] = this.field304 + " @lre@" + var22.field766;
                                                    this.field275[this.field524] = 964;
                                                    this.field276[this.field524] = var22.field747;
                                                    this.field273[this.field524] = var17;
                                                    this.field274[this.field524] = var12.field15;
                                                    ++this.field524;
                                                }
                                            } else {
                                                if (var12.field44) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field771 != null && var22.field771[var23] != null) {
                                                            this.field314[this.field524] = var22.field771[var23] + " @lre@" + var22.field766;
                                                            if (var23 == 3) {
                                                                this.field275[this.field524] = 265;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field275[this.field524] = 738;
                                                            }
                                                            this.field276[this.field524] = var22.field747;
                                                            this.field273[this.field524] = var17;
                                                            this.field274[this.field524] = var12.field15;
                                                            ++this.field524;
                                                        } else if (var23 == 4) {
                                                            this.field314[this.field524] = "Drop @lre@" + var22.field766;
                                                            this.field275[this.field524] = 738;
                                                            this.field276[this.field524] = var22.field747;
                                                            this.field273[this.field524] = var17;
                                                            this.field274[this.field524] = var12.field15;
                                                            ++this.field524;
                                                        }
                                                    }
                                                }
                                                if (var12.field33) {
                                                    this.field314[this.field524] = "Use @lre@" + var22.field766;
                                                    this.field275[this.field524] = 567;
                                                    this.field276[this.field524] = var22.field747;
                                                    this.field273[this.field524] = var17;
                                                    this.field274[this.field524] = var12.field15;
                                                    ++this.field524;
                                                }
                                                if (var12.field44 && var22.field771 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field771[var24] != null) {
                                                            this.field314[this.field524] = var22.field771[var24] + " @lre@" + var22.field766;
                                                            if (var24 == 0) {
                                                                this.field275[this.field524] = 212;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field275[this.field524] = 543;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field275[this.field524] = 506;
                                                            }
                                                            this.field276[this.field524] = var22.field747;
                                                            this.field273[this.field524] = var17;
                                                            this.field274[this.field524] = var12.field15;
                                                            ++this.field524;
                                                        }
                                                    }
                                                }
                                                if (var12.field47 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field47[var25] != null) {
                                                            this.field314[this.field524] = var12.field47[var25] + " @lre@" + var22.field766;
                                                            if (var25 == 0) {
                                                                this.field275[this.field524] = 189;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field275[this.field524] = 454;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field275[this.field524] = 571;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field275[this.field524] = 853;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field275[this.field524] = 246;
                                                            }
                                                            this.field276[this.field524] = var22.field747;
                                                            this.field273[this.field524] = var17;
                                                            this.field274[this.field524] = var12.field15;
                                                            ++this.field524;
                                                        }
                                                    }
                                                }
                                                this.field314[this.field524] = "Examine @lre@" + var22.field766;
                                                this.field275[this.field524] = 1717;
                                                this.field276[this.field524] = var22.field747;
                                                this.field273[this.field524] = var17;
                                                this.field274[this.field524] = var12.field15;
                                                ++this.field524;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (!this.field261 && !this.field587 && !this.field241) {
            ++field464;
            if (!this.field222) {
                this.method118((byte) 0);
            } else {
                this.method181(-12941);
            }
            this.method133(669);
            while (arg0 >= 0) {
                this.field371 = !this.field371;
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method170(int arg0) {
        short var2 = 256;
        if (this.field472 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field472 > 768) {
                    this.field515[var3] = this.method167(this.field516[var3], this.field561, this.field517[var3], 1024 - this.field472);
                } else if (this.field472 > 256) {
                    this.field515[var3] = this.field517[var3];
                } else {
                    this.field515[var3] = this.method167(this.field517[var3], this.field561, this.field516[var3], 256 - this.field472);
                }
            }
        } else if (this.field473 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field473 > 768) {
                    this.field515[var4] = this.method167(this.field516[var4], this.field561, this.field518[var4], 1024 - this.field473);
                } else if (this.field473 > 256) {
                    this.field515[var4] = this.field518[var4];
                } else {
                    this.field515[var4] = this.method167(this.field518[var4], this.field561, this.field516[var4], 256 - this.field473);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field515[var5] = this.field516[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field385.field1234[var6] = this.field607.field1481[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field219[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field377[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field515[var26];
                    int var30 = this.field385.field1234[var8];
                    this.field385.field1234[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field385.method466(2, super.field1175, 0, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field386.field1234[var10] = this.field608.field1481[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field219[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field377[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field515[var18];
                    int var22 = this.field386.field1234[var16];
                    this.field386.field1234[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field386.method466(2, super.field1175, 0, 637);
        this.field255 += arg0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(JI)V")
    public final void method171(long arg0, int arg1) {
        if (arg1 <= 0) {
            this.field561 = 131;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field542; ++var4) {
                if (this.field483[var4] == arg0) {
                    --this.field542;
                    this.field521 = true;
                    for (int var5 = var4; var5 < this.field542; ++var5) {
                        this.field494[var5] = this.field494[var5 + 1];
                        this.field583[var5] = this.field583[var5 + 1];
                        this.field483[var5] = this.field483[var5 + 1];
                    }
                    this.field334.method338(0, 151);
                    this.field334.method345(arg0, (byte) 12);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILUGDYQAXI;Z)V")
    public final void method172(int arg0, int arg1, int arg2, class59 arg3, boolean arg4) {
        if (this.field524 < 400) {
            if (arg3.field1510 != null) {
                arg3 = arg3.method574((byte) 8);
            }
            if (arg3 != null) {
                if (arg3.field1512) {
                    String var6 = arg3.field1500;
                    this.field222 &= arg4;
                    if (arg3.field1502 != 0) {
                        var6 = var6 + method145(field285.field1645, this.field391, arg3.field1502) + " (level-" + arg3.field1502 + ")";
                    }
                    if (this.field173 == 1) {
                        this.field314[this.field524] = "Use " + this.field177 + " with @yel@" + var6;
                        this.field275[this.field524] = 579;
                        this.field276[this.field524] = arg1;
                        this.field273[this.field524] = arg2;
                        this.field274[this.field524] = arg0;
                        ++this.field524;
                    } else {
                        if (this.field301 == 1) {
                            if ((this.field303 & 2) == 2) {
                                this.field314[this.field524] = this.field304 + " @yel@" + var6;
                                this.field275[this.field524] = 427;
                                this.field276[this.field524] = arg1;
                                this.field273[this.field524] = arg2;
                                this.field274[this.field524] = arg0;
                                ++this.field524;
                                return;
                            }
                        } else {
                            if (arg3.field1536 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg3.field1536[var7] != null && !arg3.field1536[var7].equalsIgnoreCase("attack")) {
                                        this.field314[this.field524] = arg3.field1536[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field275[this.field524] = 29;
                                        }
                                        if (var7 == 1) {
                                            this.field275[this.field524] = 784;
                                        }
                                        if (var7 == 2) {
                                            this.field275[this.field524] = 211;
                                        }
                                        if (var7 == 3) {
                                            this.field275[this.field524] = 322;
                                        }
                                        if (var7 == 4) {
                                            this.field275[this.field524] = 434;
                                        }
                                        this.field276[this.field524] = arg1;
                                        this.field273[this.field524] = arg2;
                                        this.field274[this.field524] = arg0;
                                        ++this.field524;
                                    }
                                }
                            }
                            if (arg3.field1536 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg3.field1536[var8] != null && arg3.field1536[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg3.field1502 > field285.field1645) {
                                            var9 = 2000;
                                        }
                                        this.field314[this.field524] = arg3.field1536[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field275[this.field524] = var9 + 29;
                                        }
                                        if (var8 == 1) {
                                            this.field275[this.field524] = var9 + 784;
                                        }
                                        if (var8 == 2) {
                                            this.field275[this.field524] = var9 + 211;
                                        }
                                        if (var8 == 3) {
                                            this.field275[this.field524] = var9 + 322;
                                        }
                                        if (var8 == 4) {
                                            this.field275[this.field524] = var9 + 434;
                                        }
                                        this.field276[this.field524] = arg1;
                                        this.field273[this.field524] = arg2;
                                        this.field274[this.field524] = arg0;
                                        ++this.field524;
                                    }
                                }
                            }
                            this.field314[this.field524] = "Examine @yel@" + var6;
                            this.field275[this.field524] = 1119;
                            this.field276[this.field524] = arg1;
                            this.field273[this.field524] = arg2;
                            this.field274[this.field524] = arg0;
                            ++this.field524;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public static final void method173(byte arg0) {
        class4.field89 = false;
        if (arg0 != 1) {
            field547 = !field547;
        }
        class8.field657 = false;
        field366 = false;
        class46.field1268 = false;
        class50.field1357 = false;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method174(byte arg0) {
        this.field217 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field308[var2] = -1;
            for (int var4 = 0; var4 < class43.field1242; ++var4) {
                if (!class43.field1243[var4].field1249 && class43.field1243[var4].field1244 == var2 + (this.field229 ? 0 : 7)) {
                    this.field308[var2] = var4;
                    break;
                }
            }
        }
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field256 = this.field431.method349();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public final boolean method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field278[var15][var35] = 0;
                this.field224[var15][var35] = 99999999;
            }
        }
        int var16 = arg11;
        int var17 = arg7;
        this.field278[arg11][arg7] = 99;
        this.field224[arg11][arg7] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field453[var18] = arg11;
        int var36 = var18 + 1;
        this.field454[var18] = arg7;
        boolean var20 = false;
        int var21 = this.field453.length;
        int[][] var22 = this.field456[this.field358].field636;
        while (var36 != var19) {
            var16 = this.field453[var19];
            var17 = this.field454[var19];
            var19 = (var19 + 1) % var21;
            if (arg5 == var16 && arg2 == var17) {
                var20 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && this.field456[this.field358].method217(arg6, (byte) 82, arg5, var17, arg2, arg0 - 1, var16)) {
                    var20 = true;
                    break;
                }
                if (arg0 < 10 && this.field456[this.field358].method218(arg0 - 1, var17, arg5, var16, arg2, arg6, (byte) -118)) {
                    var20 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg4 != 0 && this.field456[this.field358].method219(arg3, arg4, var17, var16, arg9, arg5, arg2, this.field196)) {
                var20 = true;
                break;
            }
            int var34 = this.field224[var16][var17] + 1;
            if (var16 > 0 && this.field278[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field453[var36] = var16 - 1;
                this.field454[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field278[var16 - 1][var17] = 2;
                this.field224[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field278[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field453[var36] = var16 + 1;
                this.field454[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field278[var16 + 1][var17] = 8;
                this.field224[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field278[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field453[var36] = var16;
                this.field454[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field278[var16][var17 - 1] = 1;
                this.field224[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field278[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field453[var36] = var16;
                this.field454[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field278[var16][var17 + 1] = 4;
                this.field224[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field278[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field453[var36] = var16 - 1;
                this.field454[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field278[var16 - 1][var17 - 1] = 3;
                this.field224[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field278[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field453[var36] = var16 + 1;
                this.field454[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field278[var16 + 1][var17 - 1] = 9;
                this.field224[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field278[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field453[var36] = var16 - 1;
                this.field454[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field278[var16 - 1][var17 + 1] = 6;
                this.field224[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field278[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field453[var36] = var16 + 1;
                this.field454[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field278[var16 + 1][var17 + 1] = 12;
                this.field224[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field502 = 0;
        if (!var20) {
            if (arg10) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg5 - var24; var25 <= arg5 + var24; ++var25) {
                        for (int var26 = arg2 - var24; var26 <= arg2 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field224[var25][var26] < var23) {
                                var23 = this.field224[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field502 = 1;
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
        this.field453[var27] = var16;
        if (arg1 <= 0) {
            this.field569 = this.field619.method526();
        }
        int var37 = var27 + 1;
        this.field454[var27] = var17;
        int var28;
        int var29 = var28 = this.field278[var16][var17];
        while (arg11 != var16 || arg7 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field453[var37] = var16;
                this.field454[var37++] = var17;
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
            var29 = this.field278[var16][var17];
        }
        if (var37 <= 0) {
            if (arg8 == 1) {
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
            int var31 = this.field453[var37];
            int var32 = this.field454[var37];
            if ((var30 & 3) == 0) {
                ++field603;
            }
            if (field603 >= 144) {
                this.field334.method338(0, 209);
                field603 = 0;
            }
            if (arg8 == 0) {
                this.field334.method338(0, 2);
                this.field334.method339(var30 + var30 + 3);
            }
            if (arg8 == 1) {
                this.field334.method338(0, 36);
                this.field334.method339(var30 + var30 + 3 + 14);
            }
            if (arg8 == 2) {
                this.field334.method338(0, 213);
                this.field334.method339(var30 + var30 + 3);
            }
            this.field334.method375(this.field538 + var32, true);
            this.field242 = this.field453[0];
            this.field243 = this.field454[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field334.method366(this.field453[var37] - var31, false);
                this.field334.method365(this.field454[var37] - var32, (byte) 64);
            }
            this.field334.method367(super.field1193[5] == 1 ? 1 : 0, -34719);
            this.field334.method340(this.field537 + var31);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)V")
    public final void method176(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            if (this.field240 != 0) {
                this.field240 = 0;
                this.field530 = true;
            }
            int var3 = this.field273[arg0];
            int var4 = this.field274[arg0];
            int var5 = this.field275[arg0];
            int var6 = this.field276[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 1717) {
                class15 var7 = class15.method278(var6);
                class2 var8 = class2.field66[var4];
                String var9;
                if (var8 != null && var8.field58[var3] >= 100000) {
                    var9 = var8.field58[var3] + " x " + var7.field766;
                } else if (var7.field772 != null) {
                    var9 = new String(var7.field772);
                } else {
                    var9 = "It's a " + var7.field766 + ".";
                }
                this.method182(0, "", 0, var9);
            }
            if (var5 == 738) {
                this.field334.method338(0, 157);
                this.field334.method374(0, var4);
                this.field334.method340(var6);
                this.field334.method340(var3);
                this.field506 = 0;
                this.field507 = var4;
                this.field508 = var3;
                this.field509 = 2;
                if (class2.field66[var4].field7 == this.field345) {
                    this.field509 = 1;
                }
                if (class2.field66[var4].field7 == this.field455) {
                    this.field509 = 3;
                }
            }
            if (var5 == 971) {
                boolean var10 = this.method175(0, 531, var4, 0, 0, var3, 0, field285.field1582[0], 2, 0, false, field285.field1581[0]);
                if (!var10) {
                    this.method175(0, 531, var4, 0, 1, var3, 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                }
                this.field279 = super.field1190;
                this.field280 = super.field1191;
                this.field282 = 2;
                this.field281 = 0;
                this.field334.method338(0, 55);
                this.field334.method374(0, this.field538 + var4);
                this.field334.method374(0, var6);
                this.field334.method374(0, this.field537 + var3);
            }
            if (var5 == 571) {
                ++field501;
                if (field501 >= 68) {
                    this.field334.method338(0, 166);
                    this.field334.method339(35);
                    field501 = 0;
                }
                this.field334.method338(0, 219);
                this.field334.method340(var4);
                this.field334.method376(true, var3);
                this.field334.method340(var6);
                this.field506 = 0;
                this.field507 = var4;
                this.field508 = var3;
                this.field509 = 2;
                if (class2.field66[var4].field7 == this.field345) {
                    this.field509 = 1;
                }
                if (class2.field66[var4].field7 == this.field455) {
                    this.field509 = 3;
                }
            }
            if (var5 == 39) {
                class69 var12 = this.field413[var6];
                if (var12 != null) {
                    this.method175(0, 531, var12.field1582[0], 0, 1, var12.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                    this.field279 = super.field1190;
                    this.field280 = super.field1191;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field334.method338(0, 207);
                    this.field334.method376(true, this.field174);
                    this.field334.method375(this.field175, true);
                    this.field334.method376(true, var6);
                    this.field334.method376(true, this.field176);
                }
            }
            if (var5 == 350) {
                this.method177(var6, 0, var4, var3);
                this.field334.method338(0, 107);
                this.field334.method376(true, var6 >> 14 & 32767);
                this.field334.method376(true, this.field537 + var3);
                this.field334.method375(this.field538 + var4, true);
            }
            if (var5 == 648) {
                this.method177(var6, 0, var4, var3);
                this.field334.method338(0, 20);
                this.field334.method340(this.field537 + var3);
                this.field334.method376(true, this.field538 + var4);
                this.field334.method340(var6 >> 14 & 32767);
            }
            if (var5 == 368) {
                class69 var13 = this.field413[var6];
                if (var13 != null) {
                    this.method175(0, 531, var13.field1582[0], 0, 1, var13.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                    this.field279 = super.field1190;
                    this.field280 = super.field1191;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field334.method338(0, 246);
                    this.field334.method375(this.field302, true);
                    this.field334.method340(var6);
                }
            }
            if (var5 == 567) {
                this.field173 = 1;
                this.field174 = var3;
                this.field175 = var4;
                this.field176 = var6;
                this.field177 = class15.method278(var6).field766;
                this.field301 = 0;
                this.field521 = true;
            } else {
                if (var5 == 965) {
                    this.field334.method338(0, 172);
                    this.field334.method340(var4);
                    class2 var14 = class2.field66[var4];
                    if (var14.field18 != null && var14.field18[0][0] == 5) {
                        int var15 = var14.field18[0][1];
                        if (this.field286[var15] != var14.field5[0]) {
                            this.field286[var15] = var14.field5[0];
                            this.method143(var15, true);
                            this.field521 = true;
                        }
                    }
                }
                if (var5 == 964) {
                    this.field334.method338(0, 212);
                    this.field334.method376(true, var6);
                    this.field334.method375(var4, true);
                    this.field334.method340(var3);
                    this.field334.method375(this.field302, true);
                    this.field506 = 0;
                    this.field507 = var4;
                    this.field508 = var3;
                    this.field509 = 2;
                    if (class2.field66[var4].field7 == this.field345) {
                        this.field509 = 1;
                    }
                    if (class2.field66[var4].field7 == this.field455) {
                        this.field509 = 3;
                    }
                }
                if (var5 == 434) {
                    class13 var16 = this.field480[var6];
                    if (var16 != null) {
                        this.method175(0, 531, var16.field1582[0], 0, 1, var16.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field334.method338(0, 237);
                        this.field334.method374(0, var6);
                    }
                }
                if (var5 == 983 || var5 == 616 || var5 == 940 || var5 == 172) {
                    String var17 = this.field314[arg0];
                    int var18 = var17.indexOf("@whi@");
                    if (var18 != -1) {
                        long var19 = class61.method580(var17.substring(var18 + 5).trim());
                        if (var5 == 983) {
                            this.method121(var19, 0);
                        }
                        if (var5 == 616) {
                            this.method141(true, var19);
                        }
                        if (var5 == 940) {
                            this.method171(var19, 349);
                        }
                        if (var5 == 172) {
                            this.method88(var19, 3);
                        }
                    }
                }
                if (var5 == 1015) {
                    class15 var21 = class15.method278(var6);
                    String var22;
                    if (var21.field772 != null) {
                        var22 = new String(var21.field772);
                    } else {
                        var22 = "It's a " + var21.field766 + ".";
                    }
                    this.method182(0, "", 0, var22);
                }
                if (var5 == 92) {
                    class69 var23 = this.field413[var6];
                    if (var23 != null) {
                        this.method175(0, 531, var23.field1582[0], 0, 1, var23.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field334.method338(0, 61);
                        this.field334.method376(true, var6);
                    }
                }
                if (var5 == 29) {
                    class13 var24 = this.field480[var6];
                    if (var24 != null) {
                        this.method175(0, 531, var24.field1582[0], 0, 1, var24.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field334.method338(0, 88);
                        this.field334.method375(var6, true);
                    }
                }
                if (var5 == 246) {
                    ++field585;
                    if (field585 >= 145) {
                        this.field334.method338(0, 231);
                        this.field334.method343(0);
                        field585 = 0;
                    }
                    this.field334.method338(0, 12);
                    this.field334.method340(var6);
                    this.field334.method374(0, var3);
                    this.field334.method375(var4, true);
                    this.field506 = 0;
                    this.field507 = var4;
                    this.field508 = var3;
                    this.field509 = 2;
                    if (class2.field66[var4].field7 == this.field345) {
                        this.field509 = 1;
                    }
                    if (class2.field66[var4].field7 == this.field455) {
                        this.field509 = 3;
                    }
                }
                if (var5 == 139) {
                    boolean var25 = this.method175(0, 531, var4, 0, 0, var3, 0, field285.field1582[0], 2, 0, false, field285.field1581[0]);
                    if (!var25) {
                        this.method175(0, 531, var4, 0, 1, var3, 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                    }
                    this.field279 = super.field1190;
                    this.field280 = super.field1191;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field334.method338(0, 199);
                    this.field334.method374(0, this.field537 + var3);
                    this.field334.method376(true, this.field538 + var4);
                    this.field334.method376(true, this.field302);
                    this.field334.method375(var6, true);
                }
                if (var5 == 207) {
                    String var27 = this.field314[arg0];
                    int var28 = var27.indexOf("@whi@");
                    if (var28 != -1) {
                        long var29 = class61.method580(var27.substring(var28 + 5).trim());
                        int var31 = -1;
                        for (int var32 = 0; var32 < this.field542; ++var32) {
                            if (this.field483[var32] == var29) {
                                var31 = var32;
                                break;
                            }
                        }
                        if (var31 != -1 && this.field583[var31] > 0) {
                            this.field530 = true;
                            this.field240 = 0;
                            this.field362 = true;
                            this.field289 = "";
                            this.field404 = 3;
                            this.field306 = this.field483[var31];
                            this.field221 = "Enter message to send to " + this.field494[var31];
                        }
                    }
                }
                if (var5 == 972) {
                    boolean var33 = this.method175(0, 531, var4, 0, 0, var3, 0, field285.field1582[0], 2, 0, false, field285.field1581[0]);
                    if (!var33) {
                        this.method175(0, 531, var4, 0, 1, var3, 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                    }
                    this.field279 = super.field1190;
                    this.field280 = super.field1191;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field334.method338(0, 34);
                    this.field334.method374(0, var6);
                    this.field334.method374(0, this.field537 + var3);
                    this.field334.method375(this.field538 + var4, true);
                }
                if (var5 == 557) {
                    class2 var35 = class2.field66[var4];
                    boolean var36 = true;
                    if (var35.field54 > 0) {
                        var36 = this.method142((byte) 8, var35);
                    }
                    if (var36) {
                        this.field334.method338(0, 172);
                        this.field334.method340(var4);
                    }
                }
                if (var5 == 427) {
                    class13 var37 = this.field480[var6];
                    if (var37 != null) {
                        this.method175(0, 531, var37.field1582[0], 0, 1, var37.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field334.method338(0, 18);
                        this.field334.method375(this.field302, true);
                        this.field334.method374(0, var6);
                    }
                }
                if (var5 == 516) {
                    class69 var38 = this.field413[var6];
                    if (var38 != null) {
                        this.method175(0, 531, var38.field1582[0], 0, 1, var38.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field334.method338(0, 49);
                        this.field334.method340(var6);
                    }
                }
                if (var5 == 583) {
                    boolean var39 = this.method175(0, 531, var4, 0, 0, var3, 0, field285.field1582[0], 2, 0, false, field285.field1581[0]);
                    if (!var39) {
                        this.method175(0, 531, var4, 0, 1, var3, 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                    }
                    this.field279 = super.field1190;
                    this.field280 = super.field1191;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field334.method338(0, 101);
                    this.field334.method340(this.field537 + var3);
                    this.field334.method376(true, this.field538 + var4);
                    this.field334.method374(0, var6);
                }
                if (var5 == 860) {
                    class69 var41 = this.field413[var6];
                    if (var41 != null) {
                        this.method175(0, 531, var41.field1582[0], 0, 1, var41.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field334.method338(0, 69);
                        this.field334.method375(var6, true);
                    }
                }
                if (var5 == 766) {
                    boolean var42 = this.method175(0, 531, var4, 0, 0, var3, 0, field285.field1582[0], 2, 0, false, field285.field1581[0]);
                    if (!var42) {
                        this.method175(0, 531, var4, 0, 1, var3, 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                    }
                    this.field279 = super.field1190;
                    this.field280 = super.field1191;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field334.method338(0, 150);
                    this.field334.method374(0, this.field537 + var3);
                    this.field334.method375(this.field538 + var4, true);
                    this.field334.method374(0, var6);
                }
                if (var5 == 1736) {
                    this.method177(var6, 0, var4, var3);
                    this.field334.method338(0, 15);
                    this.field334.method340(this.field537 + var3);
                    this.field334.method375(var6 >> 14 & 32767, true);
                    this.field334.method374(0, this.field538 + var4);
                }
                if (var5 == 475 && this.method177(var6, 0, var4, var3)) {
                    this.field334.method338(0, 7);
                    this.field334.method340(this.field538 + var4);
                    this.field334.method340(var6 >> 14 & 32767);
                    this.field334.method375(this.field302, true);
                    this.field334.method376(true, this.field537 + var3);
                }
                if (var5 == 341) {
                    this.method177(var6, 0, var4, var3);
                    this.field334.method338(0, 39);
                    this.field334.method375(this.field537 + var3, true);
                    this.field334.method375(var6 >> 14 & 32767, true);
                    this.field334.method376(true, this.field538 + var4);
                }
                if (var5 == 784) {
                    class13 var44 = this.field480[var6];
                    if (var44 != null) {
                        this.method175(0, 531, var44.field1582[0], 0, 1, var44.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 2;
                        this.field281 = 0;
                        field208 += var6;
                        if (field208 >= 149) {
                            this.field334.method338(0, 248);
                            field208 = 0;
                        }
                        this.field334.method338(0, 162);
                        this.field334.method376(true, var6);
                    }
                }
                if (var5 == 939) {
                    class69 var45 = this.field413[var6];
                    if (var45 != null) {
                        this.method175(0, 531, var45.field1582[0], 0, 1, var45.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 2;
                        this.field281 = 0;
                        field477 += var6;
                        if (field477 >= 91) {
                            this.field334.method338(0, 206);
                            this.field334.method340(40779);
                            field477 = 0;
                        }
                        this.field334.method338(0, 89);
                        this.field334.method340(var6);
                    }
                }
                if (var5 == 261) {
                    boolean var46 = this.method175(0, 531, var4, 0, 0, var3, 0, field285.field1582[0], 2, 0, false, field285.field1581[0]);
                    if (!var46) {
                        this.method175(0, 531, var4, 0, 1, var3, 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                    }
                    this.field279 = super.field1190;
                    this.field280 = super.field1191;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field334.method338(0, 45);
                    this.field334.method340(this.field537 + var3);
                    this.field334.method375(var6, true);
                    this.field334.method374(0, this.field538 + var4);
                }
                if (var5 == 298) {
                    this.field334.method338(0, 172);
                    this.field334.method340(var4);
                    class2 var48 = class2.field66[var4];
                    if (var48.field18 != null && var48.field18[0][0] == 5) {
                        int var49 = var48.field18[0][1];
                        this.field286[var49] = 1 - this.field286[var49];
                        this.method143(var49, true);
                        this.field521 = true;
                    }
                }
                if (var5 == 853) {
                    this.field334.method338(0, 33);
                    this.field334.method340(var4);
                    this.field334.method375(var6, true);
                    this.field334.method376(true, var3);
                    this.field506 = 0;
                    this.field507 = var4;
                    this.field508 = var3;
                    this.field509 = 2;
                    if (class2.field66[var4].field7 == this.field345) {
                        this.field509 = 1;
                    }
                    if (class2.field66[var4].field7 == this.field455) {
                        this.field509 = 3;
                    }
                }
                if (var5 == 451) {
                    if (!this.field246) {
                        this.field369.method53(super.field1191 - 4, (byte) 8, super.field1190 - 4);
                    } else {
                        this.field369.method53(var4 - 4, (byte) 8, var3 - 4);
                    }
                }
                if (var5 == 363) {
                    this.field334.method338(0, 254);
                    this.field334.method375(this.field174, true);
                    this.field334.method375(var4, true);
                    this.field334.method375(this.field175, true);
                    this.field334.method375(var6, true);
                    this.field334.method340(var3);
                    this.field334.method340(this.field176);
                    this.field506 = 0;
                    this.field507 = var4;
                    this.field508 = var3;
                    this.field509 = 2;
                    if (class2.field66[var4].field7 == this.field345) {
                        this.field509 = 1;
                    }
                    if (class2.field66[var4].field7 == this.field455) {
                        this.field509 = 3;
                    }
                }
                if (var5 == 1119) {
                    class13 var50 = this.field480[var6];
                    if (var50 != null) {
                        class59 var51 = var50.field736;
                        if (var51.field1510 != null) {
                            var51 = var51.method574((byte) 8);
                        }
                        if (var51 != null) {
                            String var52;
                            if (var51.field1525 != null) {
                                var52 = new String(var51.field1525);
                            } else {
                                var52 = "It's a " + var51.field1500 + ".";
                            }
                            this.method182(0, "", 0, var52);
                        }
                    }
                }
                if (var5 == 858) {
                    boolean var53 = this.method175(0, 531, var4, 0, 0, var3, 0, field285.field1582[0], 2, 0, false, field285.field1581[0]);
                    if (!var53) {
                        this.method175(0, 531, var4, 0, 1, var3, 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                    }
                    this.field279 = super.field1190;
                    this.field280 = super.field1191;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field334.method338(0, 4);
                    this.field334.method374(0, this.field537 + var3);
                    this.field334.method376(true, this.field175);
                    this.field334.method374(0, this.field538 + var4);
                    this.field334.method374(0, var6);
                    this.field334.method376(true, this.field174);
                    this.field334.method374(0, this.field176);
                }
                if (var5 == 764) {
                    class2 var55 = class2.field66[var4];
                    this.field301 = 1;
                    this.field302 = var4;
                    this.field303 = var55.field17;
                    this.field173 = 0;
                    this.field521 = true;
                    String var56 = var55.field53;
                    if (var56.indexOf(" ") != -1) {
                        var56 = var56.substring(0, var56.indexOf(" "));
                    }
                    String var57 = var55.field53;
                    if (var57.indexOf(" ") != -1) {
                        var57 = var57.substring(var57.indexOf(" ") + 1);
                    }
                    this.field304 = var56 + " " + var55.field19 + " " + var57;
                    if (this.field303 == 16) {
                        this.field521 = true;
                        this.field333 = 3;
                        this.field421 = true;
                    }
                } else {
                    if (var5 == 265) {
                        field612 += var6;
                        if (field612 >= 91) {
                            this.field334.method338(0, 24);
                            field612 = 0;
                        }
                        this.field334.method338(0, 163);
                        this.field334.method340(var6);
                        this.field334.method375(var3, true);
                        this.field334.method375(var4, true);
                        this.field506 = 0;
                        this.field507 = var4;
                        this.field508 = var3;
                        this.field509 = 2;
                        if (class2.field66[var4].field7 == this.field345) {
                            this.field509 = 1;
                        }
                        if (class2.field66[var4].field7 == this.field455) {
                            this.field509 = 3;
                        }
                    }
                    if (var5 == 910 && this.method177(var6, 0, var4, var3)) {
                        this.field334.method338(0, 174);
                        this.field334.method376(true, this.field537 + var3);
                        this.field334.method375(this.field175, true);
                        this.field334.method374(0, this.field538 + var4);
                        this.field334.method340(this.field176);
                        this.field334.method375(var6 >> 14 & 32767, true);
                        this.field334.method376(true, this.field174);
                    }
                    if (var5 == 988) {
                        this.method177(var6, 0, var4, var3);
                        this.field334.method338(0, 56);
                        this.field334.method376(true, this.field538 + var4);
                        this.field334.method375(var6 >> 14 & 32767, true);
                        this.field334.method375(this.field537 + var3, true);
                    }
                    if (var5 == 506) {
                        ++field392;
                        if (field392 >= 78) {
                            this.field334.method338(0, 251);
                            this.field334.method343(0);
                            field392 = 0;
                        }
                        this.field334.method338(0, 205);
                        this.field334.method340(var4);
                        this.field334.method374(0, var6);
                        this.field334.method374(0, var3);
                        this.field506 = 0;
                        this.field507 = var4;
                        this.field508 = var3;
                        this.field509 = 2;
                        if (class2.field66[var4].field7 == this.field345) {
                            this.field509 = 1;
                        }
                        if (class2.field66[var4].field7 == this.field455) {
                            this.field509 = 3;
                        }
                    }
                    if (var5 == 342) {
                        this.method146(27555);
                    }
                    if (var5 == 872) {
                        String var58 = this.field314[arg0];
                        int var59 = var58.indexOf("@whi@");
                        if (var59 != -1) {
                            if (this.field345 == -1) {
                                this.method146(27555);
                                this.field326 = var58.substring(var59 + 5).trim();
                                this.field557 = false;
                                for (int var60 = 0; var60 < class2.field66.length; ++var60) {
                                    if (class2.field66[var60] != null && class2.field66[var60].field54 == 600) {
                                        this.field344 = this.field345 = class2.field66[var60].field7;
                                        break;
                                    }
                                }
                            } else {
                                this.method182(0, "", 0, "Please close the interface you have open before using 'report abuse'");
                            }
                        }
                    }
                    if (var5 == 579) {
                        class13 var61 = this.field480[var6];
                        if (var61 != null) {
                            this.method175(0, 531, var61.field1582[0], 0, 1, var61.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                            this.field279 = super.field1190;
                            this.field280 = super.field1191;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field334.method338(0, 110);
                            this.field334.method376(true, this.field176);
                            this.field334.method374(0, this.field175);
                            this.field334.method340(this.field174);
                            this.field334.method375(var6, true);
                        }
                    }
                    if (var5 == 513 && !this.field321) {
                        this.field334.method338(0, 146);
                        this.field334.method340(var4);
                        this.field321 = true;
                    }
                    if (var5 == 454) {
                        this.field334.method338(0, 222);
                        this.field334.method340(var4);
                        this.field334.method375(var3, true);
                        this.field334.method374(0, var6);
                        this.field506 = 0;
                        this.field507 = var4;
                        this.field508 = var3;
                        this.field509 = 2;
                        if (class2.field66[var4].field7 == this.field345) {
                            this.field509 = 1;
                        }
                        if (class2.field66[var4].field7 == this.field455) {
                            this.field509 = 3;
                        }
                    }
                    if (var5 == 765 || var5 == 924) {
                        String var62 = this.field314[arg0];
                        int var63 = var62.indexOf("@whi@");
                        if (var63 != -1) {
                            String var64 = var62.substring(var63 + 5).trim();
                            String var65 = class61.method584(true, class61.method581(class61.method580(var64), 581));
                            boolean var66 = false;
                            for (int var67 = 0; var67 < this.field414; ++var67) {
                                class69 var68 = this.field413[this.field415[var67]];
                                if (var68 != null && var68.field1665 != null && var68.field1665.equalsIgnoreCase(var65)) {
                                    this.method175(0, 531, var68.field1582[0], 0, 1, var68.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                                    if (var5 == 765) {
                                        this.field334.method338(0, 69);
                                        this.field334.method375(this.field415[var67], true);
                                    }
                                    if (var5 == 924) {
                                        field611 += var6;
                                        if (field611 >= 101) {
                                            this.field334.method338(0, 14);
                                            this.field334.method342(9016742);
                                            field611 = 0;
                                        }
                                        this.field334.method338(0, 26);
                                        this.field334.method376(true, this.field415[var67]);
                                    }
                                    var66 = true;
                                    break;
                                }
                            }
                            if (!var66) {
                                this.method182(0, "", 0, "Unable to find " + var65);
                            }
                        }
                    }
                    if (var5 == 543) {
                        this.field334.method338(0, 112);
                        this.field334.method375(var4, true);
                        this.field334.method374(0, var3);
                        this.field334.method375(var6, true);
                        this.field506 = 0;
                        this.field507 = var4;
                        this.field508 = var3;
                        this.field509 = 2;
                        if (class2.field66[var4].field7 == this.field345) {
                            this.field509 = 1;
                        }
                        if (class2.field66[var4].field7 == this.field455) {
                            this.field509 = 3;
                        }
                    }
                    if (var5 == 1720) {
                        int var69 = var6 >> 14 & 32767;
                        class50 var70 = class50.method512(var69);
                        String var71;
                        if (var70.field1342 != null) {
                            var71 = new String(var70.field1342);
                        } else {
                            var71 = "It's a " + var70.field1339 + ".";
                        }
                        this.method182(0, "", 0, var71);
                    }
                    if (var5 == 322) {
                        class13 var72 = this.field480[var6];
                        if (var72 != null) {
                            this.method175(0, 531, var72.field1582[0], 0, 1, var72.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                            this.field279 = super.field1190;
                            this.field280 = super.field1191;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field334.method338(0, 141);
                            this.field334.method376(true, var6);
                        }
                    }
                    if (var5 == 211) {
                        class13 var73 = this.field480[var6];
                        if (var73 != null) {
                            this.method175(0, 531, var73.field1582[0], 0, 1, var73.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                            this.field279 = super.field1190;
                            this.field280 = super.field1191;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field334.method338(0, 51);
                            this.field334.method340(var6);
                        }
                    }
                    if (var5 == 509) {
                        class69 var74 = this.field413[var6];
                        if (var74 != null) {
                            this.method175(0, 531, var74.field1582[0], 0, 1, var74.field1581[0], 0, field285.field1582[0], 2, 1, false, field285.field1581[0]);
                            this.field279 = super.field1190;
                            this.field280 = super.field1191;
                            this.field282 = 2;
                            this.field281 = 0;
                            field611 += var6;
                            if (field611 >= 101) {
                                this.field334.method338(0, 14);
                                this.field334.method342(9016742);
                                field611 = 0;
                            }
                            this.field334.method338(0, 26);
                            this.field334.method376(true, var6);
                        }
                    }
                    if (var5 == 189) {
                        this.field334.method338(0, 16);
                        this.field334.method374(0, var3);
                        this.field334.method376(true, var4);
                        this.field334.method340(var6);
                        this.field506 = 0;
                        this.field507 = var4;
                        this.field508 = var3;
                        this.field509 = 2;
                        if (class2.field66[var4].field7 == this.field345) {
                            this.field509 = 1;
                        }
                        if (class2.field66[var4].field7 == this.field455) {
                            this.field509 = 3;
                        }
                    }
                    if (var5 == 212) {
                        this.field334.method338(0, 28);
                        this.field334.method374(0, var3);
                        this.field334.method376(true, var6);
                        this.field334.method374(0, var4);
                        this.field506 = 0;
                        this.field507 = var4;
                        this.field508 = var3;
                        this.field509 = 2;
                        if (class2.field66[var4].field7 == this.field345) {
                            this.field509 = 1;
                        }
                        if (class2.field66[var4].field7 == this.field455) {
                            this.field509 = 3;
                        }
                    }
                    this.field173 = 0;
                    this.field301 = 0;
                    if (arg1) {
                        this.field514 = this.field619.method526();
                    }
                    this.field521 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)Z")
    public final boolean method177(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field369.method45(this.field358, arg3, arg2, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method175(var7 + 1, 531, arg2, 0, 0, arg3, var8, field285.field1582[0], 2, 0, false, field285.field1581[0]);
            } else {
                class50 var9 = class50.method512(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1365;
                    var11 = var9.field1358;
                } else {
                    var10 = var9.field1358;
                    var11 = var9.field1365;
                }
                int var12 = var9.field1322;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method175(0, 531, arg2, var12, var11, arg3, 0, field285.field1582[0], 2, var10, false, field285.field1581[0]);
            }
            this.field279 = super.field1190;
            this.field280 = super.field1191;
            this.field282 = 2;
            if (arg1 != 0) {
                this.field492 = this.field619.method526();
            }
            this.field281 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method178(int arg0) {
        this.field152 = 0;
        if (arg0 == 47826) {
            for (int var2 = -1; var2 < this.field481 + this.field414; ++var2) {
                class60 var19;
                if (var2 == -1) {
                    var19 = field285;
                } else if (var2 < this.field414) {
                    var19 = this.field413[this.field415[var2]];
                } else {
                    var19 = this.field480[this.field482[var2 - this.field414]];
                }
                if (var19 != null && var19.method263(6)) {
                    if (var19 instanceof class13) {
                        class59 var20 = ((class13) var19).field736;
                        if (var20.field1510 != null) {
                            var20 = var20.method574((byte) 8);
                        }
                        if (var20 == null) {
                            continue;
                        }
                    }
                    if (var2 >= this.field414) {
                        class59 var24 = ((class13) var19).field736;
                        if (var24.field1513 >= 0 && var24.field1513 < this.field546.length) {
                            this.method160(1, var19, var19.field1566 + 15);
                            if (this.field298 > -1) {
                                this.field546[var24.field1513].method558(this.field299 - 30, this.field298 - 12, (byte) 71);
                            }
                        }
                        if (this.field179 == 1 && this.field482[var2 - this.field414] == this.field194 && field464 % 20 < 10) {
                            this.method160(1, var19, var19.field1566 + 15);
                            if (this.field298 > -1) {
                                this.field546[2].method558(this.field299 - 28, this.field298 - 12, (byte) 71);
                            }
                        }
                    } else {
                        int var21 = 30;
                        class69 var22 = (class69) var19;
                        if (var22.field1644 != 0) {
                            this.method160(1, var19, var19.field1566 + 15);
                            if (this.field298 > -1) {
                                for (int var23 = 0; var23 < 8; ++var23) {
                                    if ((var22.field1644 & 1 << var23) != 0) {
                                        this.field546[var23].method558(this.field299 - var21, this.field298 - 12, (byte) 71);
                                        var21 -= 25;
                                    }
                                }
                            }
                        }
                        if (var2 >= 0 && this.field179 == 10 && this.field415[var2] == this.field189) {
                            this.method160(1, var19, var19.field1566 + 15);
                            if (this.field298 > -1) {
                                this.field546[7].method558(this.field299 - var21, this.field298 - 12, (byte) 71);
                            }
                        }
                    }
                    if (var19.field1544 != null && (var2 >= this.field414 || this.field576 == 0 || this.field576 == 3 || this.field576 == 1 && this.method135(false, ((class69) var19).field1665))) {
                        this.method160(1, var19, var19.field1566);
                        if (this.field298 > -1 && this.field152 < this.field153) {
                            this.field157[this.field152] = this.field459.method251(var19.field1544, 0) / 2;
                            this.field156[this.field152] = this.field459.field725;
                            this.field154[this.field152] = this.field298;
                            this.field155[this.field152] = this.field299;
                            this.field158[this.field152] = var19.field1589;
                            this.field159[this.field152] = var19.field1564;
                            this.field160[this.field152] = var19.field1548;
                            this.field161[this.field152++] = var19.field1544;
                            if (this.field500 == 0 && var19.field1564 >= 1 && var19.field1564 <= 3) {
                                this.field156[this.field152] += 10;
                                this.field155[this.field152] += 5;
                            }
                            if (this.field500 == 0 && var19.field1564 == 4) {
                                this.field157[this.field152] = 60;
                            }
                            if (this.field500 == 0 && var19.field1564 == 5) {
                                this.field156[this.field152] += 5;
                            }
                        }
                    }
                    if (var19.field1549 > field464) {
                        this.method160(1, var19, var19.field1566 + 15);
                        if (this.field298 > -1) {
                            int var25 = var19.field1550 * 30 / var19.field1551;
                            if (var25 > 30) {
                                var25 = 30;
                            }
                            class39.method420(this.field298 - 15, (byte) 2, 65280, 5, var25, this.field299 - 3);
                            class39.method420(this.field298 - 15 + var25, (byte) 2, 16711680, 5, 30 - var25, this.field299 - 3);
                        }
                    }
                    for (int var26 = 0; var26 < 4; ++var26) {
                        if (var19.field1592[var26] > field464) {
                            this.method160(1, var19, var19.field1566 / 2);
                            if (this.field298 > -1) {
                                if (var26 == 1) {
                                    this.field299 -= 20;
                                }
                                if (var26 == 2) {
                                    this.field298 -= 15;
                                    this.field299 -= 10;
                                }
                                if (var26 == 3) {
                                    this.field298 += 15;
                                    this.field299 -= 10;
                                }
                                this.field267[var19.field1591[var26]].method558(this.field299 - 12, this.field298 - 12, (byte) 71);
                                this.field457.method248(1, this.field299 + 4, String.valueOf(var19.field1590[var26]), this.field298, 0);
                                this.field457.method248(1, this.field299 + 3, String.valueOf(var19.field1590[var26]), this.field298 - 1, 16777215);
                            }
                        }
                    }
                }
            }
            for (int var3 = 0; var3 < this.field152; ++var3) {
                int var4 = this.field154[var3];
                int var5 = this.field155[var3];
                int var6 = this.field157[var3];
                int var7 = this.field156[var3];
                boolean var8 = true;
                while (var8) {
                    var8 = false;
                    for (int var18 = 0; var18 < var3; ++var18) {
                        if (var5 + 2 > this.field155[var18] - this.field156[var18] && var5 - var7 < this.field155[var18] + 2 && var4 - var6 < this.field157[var18] + this.field154[var18] && var4 + var6 > this.field154[var18] - this.field157[var18] && this.field155[var18] - this.field156[var18] < var5) {
                            var5 = this.field155[var18] - this.field156[var18];
                            var8 = true;
                        }
                    }
                }
                this.field298 = this.field154[var3];
                this.field299 = this.field155[var3] = var5;
                String var9 = this.field161[var3];
                if (this.field500 == 0) {
                    int var10 = 16776960;
                    if (this.field158[var3] < 6) {
                        var10 = this.field349[this.field158[var3]];
                    }
                    if (this.field158[var3] == 6) {
                        var10 = this.field560 % 20 < 10 ? 16711680 : 16776960;
                    }
                    if (this.field158[var3] == 7) {
                        var10 = this.field560 % 20 < 10 ? 255 : 65535;
                    }
                    if (this.field158[var3] == 8) {
                        var10 = this.field560 % 20 < 10 ? 45056 : 8454016;
                    }
                    if (this.field158[var3] == 9) {
                        int var11 = 150 - this.field160[var3];
                        if (var11 < 50) {
                            var10 = var11 * 1280 + 16711680;
                        } else if (var11 < 100) {
                            var10 = 16776960 - (var11 - 50) * 327680;
                        } else if (var11 < 150) {
                            var10 = (var11 - 100) * 5 + 65280;
                        }
                    }
                    if (this.field158[var3] == 10) {
                        int var12 = 150 - this.field160[var3];
                        if (var12 < 50) {
                            var10 = var12 * 5 + 16711680;
                        } else if (var12 < 100) {
                            var10 = 16711935 - (var12 - 50) * 327680;
                        } else if (var12 < 150) {
                            var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                        }
                    }
                    if (this.field158[var3] == 11) {
                        int var13 = 150 - this.field160[var3];
                        if (var13 < 50) {
                            var10 = 16777215 - var13 * 327685;
                        } else if (var13 < 100) {
                            var10 = (var13 - 50) * 327685 + 65280;
                        } else if (var13 < 150) {
                            var10 = 16777215 - (var13 - 100) * 327680;
                        }
                    }
                    if (this.field159[var3] == 0) {
                        this.field459.method248(1, this.field299 + 1, var9, this.field298, 0);
                        this.field459.method248(1, this.field299, var9, this.field298, var10);
                    }
                    if (this.field159[var3] == 1) {
                        this.field459.method253(246, this.field560, this.field299 + 1, this.field298, 0, var9);
                        this.field459.method253(246, this.field560, this.field299, this.field298, var10, var9);
                    }
                    if (this.field159[var3] == 2) {
                        this.field459.method254(this.field298, var9, this.field560, 0, this.field299 + 1, -497);
                        this.field459.method254(this.field298, var9, this.field560, var10, this.field299, -497);
                    }
                    if (this.field159[var3] == 3) {
                        this.field459.method255(0, false, 150 - this.field160[var3], this.field560, this.field299 + 1, this.field298, var9);
                        this.field459.method255(var10, false, 150 - this.field160[var3], this.field560, this.field299, this.field298, var9);
                    }
                    if (this.field159[var3] == 4) {
                        int var14 = this.field459.method251(var9, 0);
                        int var15 = (150 - this.field160[var3]) * (var14 + 100) / 150;
                        class39.method417(this.field298 + 50, 0, 334, this.field298 - 50, 42773);
                        this.field459.method252(671, 0, this.field298 + 50 - var15, var9, this.field299 + 1);
                        this.field459.method252(671, var10, this.field298 + 50 - var15, var9, this.field299);
                        class39.method416(5758);
                    }
                    if (this.field159[var3] == 5) {
                        int var16 = 150 - this.field160[var3];
                        int var17 = 0;
                        if (var16 < 25) {
                            var17 = var16 - 25;
                        } else if (var16 > 125) {
                            var17 = var16 - 125;
                        }
                        class39.method417(512, this.field299 - this.field459.field725 - 1, this.field299 + 5, 0, 42773);
                        this.field459.method248(1, this.field299 + 1 + var17, var9, this.field298, 0);
                        this.field459.method248(1, this.field299 + var17, var9, this.field298, var10);
                        class39.method416(5758);
                    }
                } else {
                    this.field459.method248(1, this.field299 + 1, var9, this.field298, 0);
                    this.field459.method248(1, this.field299, var9, this.field298, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field427) {
            this.method96(825);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method179(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field409 = "";
                this.field410 = "Connecting to server...";
                this.method164(true, true);
            }
            this.field223 = new class33(this.method184(field364 + 43594), true, this);
            long var4 = class61.method580(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field334.field1065 = 0;
            this.field334.method339(14);
            this.field334.method339(var6);
            this.field223.method402(0, 2, this.field334.field1064, -766);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field223.method399();
            }
            int var8 = this.field223.method399();
            int var9 = var8;
            if (var8 == 0) {
                this.field223.method401(this.field431.field1064, 0, 8);
                this.field431.field1065 = 0;
                this.field206 = this.field431.method355(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field206 >> 32), (int) this.field206 };
                this.field334.field1065 = 0;
                this.field334.method339(10);
                this.field334.method343(var10[0]);
                this.field334.method343(var10[1]);
                this.field334.method343(var10[2]);
                this.field334.method343(var10[3]);
                this.field334.method343(signlink.uid);
                this.field334.method346(arg0);
                this.field334.method346(arg1);
                this.field334.method364(field227, 1, field203);
                this.field571.field1065 = 0;
                if (arg2) {
                    this.field571.method339(18);
                } else {
                    this.field571.method339(16);
                }
                this.field571.method339(this.field334.field1065 + 36 + 1 + 1 + 2);
                this.field571.method339(255);
                this.field571.method340(312);
                this.field571.method339(field366 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field571.method343(this.field531[var11]);
                }
                this.field571.method347(this.field334.field1065, 0, this.field334.field1064, this.field300);
                this.field334.field1069 = new class53(-739, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field619 = new class53(-739, var10);
                this.field223.method402(0, this.field571.field1065, this.field571.field1064, -766);
                var8 = this.field223.method399();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method179(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field184 = this.field223.method399();
                field199 = this.field223.method399() == 1;
                this.field180 = 0L;
                this.field269 = 0;
                this.field249.field904 = 0;
                super.field1180 = true;
                this.field185 = true;
                this.field222 = true;
                this.field334.field1065 = 0;
                this.field431.field1065 = 0;
                this.field256 = -1;
                this.field604 = -1;
                this.field605 = -1;
                this.field606 = -1;
                this.field255 = 0;
                this.field257 = 0;
                this.field533 = 0;
                this.field259 = 0;
                this.field179 = 0;
                this.field524 = 0;
                this.field246 = false;
                super.field1181 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field348[var13] = null;
                }
                this.field173 = 0;
                this.field301 = 0;
                this.field495 = 0;
                this.field602 = 0;
                this.field162 = (int) (Math.random() * 100.0D) - 50;
                this.field429 = (int) (Math.random() * 110.0D) - 55;
                this.field609 = (int) (Math.random() * 80.0D) - 40;
                this.field407 = (int) (Math.random() * 120.0D) - 60;
                this.field197 = (int) (Math.random() * 30.0D) - 20;
                this.field466 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field310 = 0;
                this.field449 = -1;
                this.field242 = 0;
                this.field243 = 0;
                this.field414 = 0;
                this.field481 = 0;
                for (int var14 = 0; var14 < this.field411; ++var14) {
                    this.field413[var14] = null;
                    this.field418[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field480[var15] = null;
                }
                field285 = this.field413[this.field412] = new class69();
                this.field359.method333();
                this.field367.method333();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field309[var16][var17][var18] = null;
                        }
                    }
                }
                this.field216 = new class25(3);
                this.field543 = 0;
                this.field542 = 0;
                this.field268 = -1;
                this.field455 = -1;
                this.field345 = -1;
                this.field178 = -1;
                this.field618 = -1;
                this.field321 = false;
                this.field333 = 3;
                this.field240 = 0;
                this.field246 = false;
                this.field362 = false;
                this.field307 = null;
                this.field230 = 0;
                this.field288 = -1;
                this.field229 = true;
                this.method174((byte) 2);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field193[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field475[var20] = null;
                    this.field476[var20] = false;
                }
                field585 = 0;
                field611 = 0;
                field612 = 0;
                field208 = 0;
                field477 = 0;
                field501 = 0;
                field603 = 0;
                field392 = 0;
                field428 = 0;
                field433 = 0;
                this.method155(0);
            } else if (var8 == 3) {
                this.field409 = "";
                this.field410 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field409 = "Your account has been disabled.";
                this.field410 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field409 = "Your account is already logged in.";
                this.field410 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field409 = "RuneScape has been updated!";
                this.field410 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field409 = "This world is full.";
                this.field410 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field409 = "Unable to connect.";
                this.field410 = "Login server offline.";
            } else if (var8 == 9) {
                this.field409 = "Login limit exceeded.";
                this.field410 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field409 = "Unable to connect.";
                this.field410 = "Bad session id.";
            } else if (var8 == 11) {
                this.field410 = "Login server rejected session.";
                this.field410 = "Please try again.";
            } else if (var8 == 12) {
                this.field409 = "You need a members account to login to this world.";
                this.field410 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field409 = "Could not complete login.";
                this.field410 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field409 = "The server is being updated.";
                this.field410 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field222 = true;
                this.field334.field1065 = 0;
                this.field431.field1065 = 0;
                this.field256 = -1;
                this.field604 = -1;
                this.field605 = -1;
                this.field606 = -1;
                this.field255 = 0;
                this.field257 = 0;
                this.field533 = 0;
                this.field524 = 0;
                this.field246 = false;
                this.field394 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field409 = "Login attempts exceeded.";
                this.field410 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field409 = "You are standing in a members-only area.";
                this.field410 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field409 = "Invalid loginserver requested";
                this.field410 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field292 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field292;
                            this.method179(arg0, arg1, arg2);
                        } else {
                            this.field409 = "No response from loginserver";
                            this.field410 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field409 = "No response from server";
                        this.field410 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field409 = "Unexpected server response";
                    this.field410 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field223.method399(); var21 >= 0; --var21) {
                    this.field409 = "You have only just left another world";
                    this.field410 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method164(true, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method179(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field409 = "";
            this.field410 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method180(byte arg0) {
        if (!this.field261 && !this.field587 && !this.field241) {
            ++field519;
            if (!this.field222) {
                this.method164(true, false);
            } else {
                this.method202((byte) 0);
            }
            this.field181 = 0;
            if (arg0 != 67) {
                this.field256 = this.field431.method349();
            }
        } else {
            this.method166(0);
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method181(int arg0) {
        if (arg0 == -12941) {
            if (this.field533 > 1) {
                --this.field533;
            }
            if (this.field259 > 0) {
                --this.field259;
            }
            for (int var2 = 0; var2 < 5 && this.method138((byte) 7); ++var2) {
            }
            if (this.field222) {
                Object var3 = this.field249.field905;
                synchronized (this.field249.field905) {
                    if (!field199) {
                        this.field249.field904 = 0;
                    } else if (super.field1189 != 0 || this.field249.field904 >= 40) {
                        this.field334.method338(0, 208);
                        this.field334.method339(0);
                        int var4 = this.field334.field1065;
                        int var5 = 0;
                        for (int var6 = 0; var6 < this.field249.field904 && var4 - this.field334.field1065 < 240; ++var6) {
                            ++var5;
                            int var7 = this.field249.field901[var6];
                            if (var7 < 0) {
                                var7 = 0;
                            } else if (var7 > 502) {
                                var7 = 502;
                            }
                            int var8 = this.field249.field903[var6];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 764) {
                                var8 = 764;
                            }
                            int var9 = var7 * 765 + var8;
                            if (this.field249.field901[var6] == -1 && this.field249.field903[var6] == -1) {
                                var8 = -1;
                                var7 = -1;
                                var9 = 524287;
                            }
                            if (this.field379 == var8 && this.field380 == var7) {
                                if (this.field269 < 2047) {
                                    ++this.field269;
                                }
                            } else {
                                int var10 = var8 - this.field379;
                                this.field379 = var8;
                                int var11 = var7 - this.field380;
                                this.field380 = var7;
                                if (this.field269 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                    var10 += 32;
                                    var11 += 32;
                                    this.field334.method340((this.field269 << 12) + (var10 << 6) + var11);
                                    this.field269 = 0;
                                } else if (this.field269 < 8) {
                                    this.field334.method342((this.field269 << 19) + 8388608 + var9);
                                    this.field269 = 0;
                                } else {
                                    this.field334.method343((this.field269 << 19) + -1073741824 + var9);
                                    this.field269 = 0;
                                }
                            }
                        }
                        this.field334.method348(this.field334.field1065 - var4, (byte) 1);
                        if (var5 >= this.field249.field904) {
                            this.field249.field904 = 0;
                        } else {
                            this.field249.field904 -= var5;
                            for (int var12 = 0; var12 < this.field249.field904; ++var12) {
                                this.field249.field903[var12] = this.field249.field903[var5 + var12];
                                this.field249.field901[var12] = this.field249.field901[var5 + var12];
                            }
                        }
                    }
                }
                if (super.field1189 != 0) {
                    long var13 = (super.field1192 - this.field180) / 50L;
                    if (var13 > 4095L) {
                        var13 = 4095L;
                    }
                    this.field180 = super.field1192;
                    int var15 = super.field1191;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 502) {
                        var15 = 502;
                    }
                    int var16 = super.field1190;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 764) {
                        var16 = 764;
                    }
                    int var17 = var15 * 765 + var16;
                    byte var18 = 0;
                    if (super.field1189 == 2) {
                        var18 = 1;
                    }
                    int var19 = (int) var13;
                    this.field334.method338(0, 66);
                    this.field334.method383(581, (var18 << 19) + (var19 << 20) + var17);
                }
                if (this.field600 > 0) {
                    --this.field600;
                }
                if (super.field1193[1] == 1 || super.field1193[2] == 1 || super.field1193[3] == 1 || super.field1193[4] == 1) {
                    this.field601 = true;
                }
                if (this.field601 && this.field600 <= 0) {
                    this.field600 = 20;
                    this.field601 = false;
                    this.field334.method338(0, 249);
                    this.field334.method340(this.field465);
                    this.field334.method375(this.field466, true);
                }
                if (super.field1180 && !this.field185) {
                    this.field185 = true;
                    this.field334.method338(0, 128);
                    this.field334.method339(1);
                }
                if (!super.field1180 && this.field185) {
                    this.field185 = false;
                    this.field334.method338(0, 128);
                    this.field334.method339(0);
                }
                this.method112(this.field245);
                this.method108(0);
                this.method147((byte) 31);
                ++this.field257;
                if (this.field257 > 750) {
                    this.method66(true);
                }
                this.method131(-43);
                this.method195(false);
                this.method78(605);
                ++this.field504;
                if (this.field282 != 0) {
                    this.field281 += 20;
                    if (this.field281 >= 400) {
                        this.field282 = 0;
                    }
                }
                if (this.field509 != 0) {
                    ++this.field506;
                    if (this.field506 >= 15) {
                        if (this.field509 == 2) {
                            this.field521 = true;
                        }
                        if (this.field509 == 3) {
                            this.field530 = true;
                        }
                        this.field509 = 0;
                    }
                }
                if (this.field264 != 0) {
                    ++this.field205;
                    if (super.field1183 > this.field265 + 5 || super.field1183 < this.field265 - 5 || super.field1184 > this.field266 + 5 || super.field1184 < this.field266 - 5) {
                        this.field351 = true;
                    }
                    if (super.field1182 == 0) {
                        if (this.field264 == 2) {
                            this.field521 = true;
                        }
                        if (this.field264 == 3) {
                            this.field530 = true;
                        }
                        this.field264 = 0;
                        if (this.field351 && this.field205 >= 5) {
                            this.field438 = -1;
                            this.method193((byte) 7);
                            if (this.field438 == this.field262 && this.field437 != this.field263) {
                                class2 var20 = class2.field66[this.field262];
                                byte var21 = 0;
                                if (this.field541 == 1 && var20.field54 == 206) {
                                    var21 = 1;
                                }
                                if (var20.field51[this.field437] <= 0) {
                                    var21 = 0;
                                }
                                if (var20.field8) {
                                    int var22 = this.field263;
                                    int var23 = this.field437;
                                    var20.field51[var23] = var20.field51[var22];
                                    var20.field58[var23] = var20.field58[var22];
                                    var20.field51[var22] = -1;
                                    var20.field58[var22] = 0;
                                } else if (var21 == 1) {
                                    int var24 = this.field263;
                                    int var25 = this.field437;
                                    while (var24 != var25) {
                                        if (var24 > var25) {
                                            var20.method4(var24, this.field376, var24 - 1);
                                            --var24;
                                        } else if (var24 < var25) {
                                            var20.method4(var24, this.field376, var24 + 1);
                                            ++var24;
                                        }
                                    }
                                } else {
                                    var20.method4(this.field263, this.field376, this.field437);
                                }
                                this.field334.method338(0, 154);
                                this.field334.method374(0, this.field437);
                                this.field334.method367(var21, -34719);
                                this.field334.method340(this.field263);
                                this.field334.method376(true, this.field262);
                            }
                        } else if ((this.field614 == 1 || this.method85(true, this.field524 - 1)) && this.field524 > 2) {
                            this.method95(904);
                        } else if (this.field524 > 0) {
                            this.method176(this.field524 - 1, false);
                        }
                        this.field506 = 10;
                        super.field1189 = 0;
                    }
                }
                if (class4.field123 != -1) {
                    int var26 = class4.field123;
                    int var27 = class4.field124;
                    boolean var28 = this.method175(0, 531, var27, 0, 0, var26, 0, field285.field1582[0], 0, 0, true, field285.field1581[0]);
                    class4.field123 = -1;
                    if (var28) {
                        this.field279 = super.field1190;
                        this.field280 = super.field1191;
                        this.field282 = 1;
                        this.field281 = 0;
                    }
                }
                if (super.field1189 == 1 && this.field307 != null) {
                    this.field307 = null;
                    this.field530 = true;
                    super.field1189 = 0;
                }
                this.method69(this.field332);
                this.method98((byte) -62);
                this.method194(true);
                this.method123((byte) 93);
                if (super.field1182 == 1 || super.field1189 == 1) {
                    ++this.field181;
                }
                if (this.field495 == 2) {
                    this.method103(41872);
                }
                if (this.field495 == 2 && this.field572) {
                    this.method101((byte) 1);
                }
                for (int var29 = 0; var29 < 5; ++var29) {
                    int var10002 = this.field290[var29]++;
                }
                this.method122(2);
                ++super.field1181;
                if (super.field1181 > 4500) {
                    this.field259 = 250;
                    super.field1181 -= 500;
                    this.field334.method338(0, 29);
                }
                ++this.field474;
                if (this.field474 > 500) {
                    this.field474 = 0;
                    int var30 = (int) (Math.random() * 8.0D);
                    if ((var30 & 1) == 1) {
                        this.field162 += this.field163;
                    }
                    if ((var30 & 2) == 2) {
                        this.field429 += this.field430;
                    }
                    if ((var30 & 4) == 4) {
                        this.field609 += this.field610;
                    }
                }
                if (this.field162 < -50) {
                    this.field163 = 2;
                }
                if (this.field162 > 50) {
                    this.field163 = -2;
                }
                if (this.field429 < -55) {
                    this.field430 = 2;
                }
                if (this.field429 > 55) {
                    this.field430 = -2;
                }
                if (this.field609 < -40) {
                    this.field610 = 1;
                }
                if (this.field609 > 40) {
                    this.field610 = -1;
                }
                ++this.field534;
                if (this.field534 > 500) {
                    this.field534 = 0;
                    int var31 = (int) (Math.random() * 8.0D);
                    if ((var31 & 1) == 1) {
                        this.field407 += this.field408;
                    }
                    if ((var31 & 2) == 2) {
                        this.field197 += this.field198;
                    }
                }
                if (this.field407 < -60) {
                    this.field408 = 2;
                }
                if (this.field407 > 60) {
                    this.field408 = -2;
                }
                if (this.field197 < -20) {
                    this.field198 = 1;
                }
                if (this.field197 > 10) {
                    this.field198 = -1;
                }
                ++field215;
                if (field215 > 184) {
                    field215 = 0;
                    this.field334.method338(0, 123);
                    this.field334.method340(43753);
                }
                ++this.field258;
                if (this.field258 > 50) {
                    this.field334.method338(0, 140);
                }
                try {
                    if (this.field223 != null && this.field334.field1065 > 0) {
                        this.field223.method402(0, this.field334.field1065, this.field334.field1064, -766);
                        this.field334.field1065 = 0;
                        this.field258 = 0;
                    }
                } catch (IOException var33) {
                    this.method66(true);
                } catch (Exception var34) {
                    this.method185(this.field172);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public final void method182(int arg0, String arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field268 != -1) {
            this.field307 = arg3;
            super.field1189 = 0;
        }
        if (this.field455 == -1) {
            this.field530 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field346[var5] = this.field346[var5 - 1];
            this.field347[var5] = this.field347[var5 - 1];
            this.field348[var5] = this.field348[var5 - 1];
        }
        this.field346[0] = arg2;
        this.field347[0] = arg1;
        this.field255 += arg0;
        this.field348[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LKHOMSBHW;II)V")
    private final void method183(class30 arg0, int arg1, int arg2) {
        if (arg1 != 41821) {
            this.field309 = null;
        }
        arg0.method359((byte) 9);
        int var4 = arg0.method360(true, 8);
        if (var4 < this.field481) {
            for (int var5 = var4; var5 < this.field481; ++var5) {
                this.field171[this.field170++] = this.field482[var5];
            }
        }
        if (var4 > this.field481) {
            signlink.reporterror(this.field312 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field481 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field482[var6];
                class13 var8 = this.field480[var7];
                int var9 = arg0.method360(true, 1);
                if (var9 == 0) {
                    this.field482[this.field481++] = var7;
                    var8.field1542 = field464;
                } else {
                    int var10 = arg0.method360(true, 2);
                    if (var10 == 0) {
                        this.field482[this.field481++] = var7;
                        var8.field1542 = field464;
                        this.field417[this.field416++] = var7;
                    } else if (var10 == 1) {
                        this.field482[this.field481++] = var7;
                        var8.field1542 = field464;
                        int var11 = arg0.method360(true, 3);
                        var8.method576(var11, false, 1);
                        int var12 = arg0.method360(true, 1);
                        if (var12 == 1) {
                            this.field417[this.field416++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field482[this.field481++] = var7;
                        var8.field1542 = field464;
                        int var13 = arg0.method360(true, 3);
                        var8.method576(var13, true, 1);
                        int var14 = arg0.method360(true, 3);
                        var8.method576(var14, true, 1);
                        int var15 = arg0.method360(true, 1);
                        if (var15 == 1) {
                            this.field417[this.field416++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field171[this.field170++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method184(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method185(byte arg0) {
        try {
            if (this.field223 != null) {
                this.field223.method398();
            }
        } catch (Exception var3) {
        }
        this.field223 = null;
        this.field222 = false;
        this.field563 = 0;
        this.field312 = "";
        if (arg0 != 104) {
            this.field256 = this.field431.method349();
        }
        this.field313 = "";
        this.method97(449);
        this.field369.method15(-24693);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field456[var2].method208();
        }
        System.gc();
        this.method125(-32557);
        this.field192 = -1;
        this.field592 = -1;
        this.field239 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILKHOMSBHW;ILYNSPIQRH;)V")
    private final void method186(int arg0, int arg1, class30 arg2, int arg3, class69 arg4) {
        int var6 = 38 / arg1;
        if ((arg0 & 1024) != 0) {
            int var7 = arg2.method369(0);
            int var8 = arg2.method369(0);
            arg4.method579(field464, var8, (byte) 44, var7);
            arg4.field1549 = field464 + 300;
            arg4.field1550 = arg2.method368(false);
            arg4.field1551 = arg2.method349();
        }
        if ((arg0 & 4) != 0) {
            arg4.field1538 = arg2.method377((byte) 46);
            if (arg4.field1538 == 65535) {
                arg4.field1538 = -1;
            }
        }
        if ((arg0 & 8) != 0) {
            int var9 = arg2.method351();
            int var10 = arg2.method349();
            int var11 = arg2.method349();
            int var12 = arg2.field1065;
            if (arg4.field1665 != null && arg4.field1671) {
                long var13 = class61.method580(arg4.field1665);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < this.field498; ++var16) {
                        if (this.field201[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && this.field573 == 0) {
                    try {
                        this.field479.field1065 = 0;
                        arg2.method388(this.field479.field1064, 0, false, var11);
                        this.field479.field1065 = 0;
                        String var17 = class28.method334(-25339, this.field479, var11);
                        String var18 = class41.method437(this.field336, var17);
                        arg4.field1544 = var18;
                        arg4.field1589 = var9 >> 8;
                        arg4.field1564 = var9 & 255;
                        arg4.field1548 = 150;
                        if (var10 != 2 && var10 != 3) {
                            if (var10 == 1) {
                                this.method182(0, "@cr1@" + arg4.field1665, 1, var18);
                            } else {
                                this.method182(0, arg4.field1665, 2, var18);
                            }
                        } else {
                            this.method182(0, "@cr2@" + arg4.field1665, 1, var18);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field1065 = var11 + var12;
        }
        if ((arg0 & 16) != 0) {
            int var20 = arg2.method349();
            byte[] var21 = new byte[var20];
            class30 var22 = new class30(var21, -982);
            arg2.method389(var20, 0, 0, var21);
            this.field418[arg3] = var22;
            arg4.method593(var22, true);
        }
        if ((arg0 & 256) != 0) {
            arg4.field1572 = arg2.method369(0);
            arg4.field1574 = arg2.method349();
            arg4.field1573 = arg2.method368(false);
            arg4.field1575 = arg2.method370(-719);
            arg4.field1576 = arg2.method378((byte) 7) + field464;
            arg4.field1577 = arg2.method351() + field464;
            arg4.field1578 = arg2.method369(0);
            arg4.method578(3);
        }
        if ((arg0 & 512) != 0) {
            arg4.field1584 = arg2.method377((byte) 46);
            int var23 = arg2.method384(false);
            arg4.field1588 = var23 >> 16;
            arg4.field1587 = (var23 & 65535) + field464;
            arg4.field1585 = 0;
            arg4.field1586 = 0;
            if (arg4.field1587 > field464) {
                arg4.field1585 = -1;
            }
            if (arg4.field1584 == 65535) {
                arg4.field1584 = -1;
            }
        }
        if ((arg0 & 2) != 0) {
            int var24 = arg2.method379((byte) -102);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = arg2.method368(false);
            if (arg4.field1552 == var24 && var24 != -1) {
                int var26 = class9.field682[var24].field696;
                if (var26 == 1) {
                    arg4.field1553 = 0;
                    arg4.field1554 = 0;
                    arg4.field1555 = var25;
                    arg4.field1556 = 0;
                }
                if (var26 == 2) {
                    arg4.field1556 = 0;
                }
            } else if (var24 == -1 || arg4.field1552 == -1 || class9.field682[var24].field690 >= class9.field682[arg4.field1552].field690) {
                arg4.field1552 = var24;
                arg4.field1553 = 0;
                arg4.field1554 = 0;
                arg4.field1555 = var25;
                arg4.field1556 = 0;
                arg4.field1593 = arg4.field1559;
            }
        }
        if ((arg0 & 1) != 0) {
            arg4.field1544 = arg2.method356();
            if (arg4.field1544.charAt(0) == '~') {
                arg4.field1544 = arg4.field1544.substring(1);
                this.method182(0, arg4.field1665, 2, arg4.field1544);
            } else if (field285 == arg4) {
                this.method182(0, arg4.field1665, 2, arg4.field1544);
            }
            arg4.field1589 = 0;
            arg4.field1564 = 0;
            arg4.field1548 = 150;
        }
        if ((arg0 & 64) != 0) {
            int var27 = arg2.method349();
            int var28 = arg2.method370(-719);
            arg4.method579(field464, var28, (byte) 44, var27);
            arg4.field1549 = field464 + 300;
            arg4.field1550 = arg2.method369(0);
            arg4.field1551 = arg2.method349();
        }
        if ((arg0 & 128) != 0) {
            arg4.field1579 = arg2.method378((byte) 7);
            arg4.field1580 = arg2.method378((byte) 7);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method187(byte arg0) {
        this.field186 = false;
        while (this.field448) {
            this.field186 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field589 = null;
        this.field590 = null;
        this.field503 = null;
        this.field515 = null;
        this.field516 = null;
        this.field517 = null;
        this.field518 = null;
        this.field558 = null;
        this.field559 = null;
        this.field377 = null;
        this.field378 = null;
        if (arg0 != -60) {
            this.field256 = -1;
        }
        this.field607 = null;
        this.field608 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method188(int arg0, byte arg1) {
        int[] var3 = this.field244.field1481;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field450[arg0][var25][var6] & 24) == 0) {
                    this.field369.method50(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (this.field450[arg0 + 1][var25][var6] & 8) != 0) {
                    this.field369.method50(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field244.method553(false);
        if (arg1 == 1) {
            boolean var9 = false;
            for (int var10 = 1; var10 < 103; ++var10) {
                for (int var23 = 1; var23 < 103; ++var23) {
                    if ((this.field450[arg0][var23][var10] & 24) == 0) {
                        this.method81(var8, var23, var10, this.field200, var7, arg0);
                    }
                    if (arg0 < 3 && (this.field450[arg0 + 1][var23][var10] & 8) != 0) {
                        this.method81(var8, var23, var10, this.field200, var7, arg0 + 1);
                    }
                }
            }
            this.field442.method465(false);
            this.field511 = 0;
            for (int var11 = 0; var11 < 104; ++var11) {
                for (int var12 = 0; var12 < 104; ++var12) {
                    int var13 = this.field369.method44(this.field358, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 32767;
                        int var15 = class50.method512(var14).field1353;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                byte var18 = 104;
                                byte var19 = 104;
                                int[][] var20 = this.field456[this.field358].field636;
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
                            this.field594[this.field511] = this.field596[var15];
                            this.field512[this.field511] = var16;
                            this.field513[this.field511] = var17;
                            ++this.field511;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method189(int arg0) {
        if (arg0 <= 0) {
            field291 = 79;
        }
        this.field535 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 < 0) {
            if (arg0 >= 1 && arg4 >= 1 && arg0 <= 102 && arg4 <= 102) {
                if (field366 && this.field358 != arg1) {
                    return;
                }
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = false;
                boolean var12 = false;
                if (arg3 == 0) {
                    var9 = this.field369.method41(arg1, arg0, arg4);
                }
                if (arg3 == 1) {
                    var9 = this.field369.method42(false, arg0, arg1, arg4);
                }
                if (arg3 == 2) {
                    var9 = this.field369.method43(arg1, arg0, arg4);
                }
                if (arg3 == 3) {
                    var9 = this.field369.method44(arg1, arg0, arg4);
                }
                if (var9 != 0) {
                    int var13 = this.field369.method45(arg1, arg0, arg4, var9);
                    int var14 = var9 >> 14 & 32767;
                    int var15 = var13 & 31;
                    int var16 = var13 >> 6;
                    if (arg3 == 0) {
                        this.field369.method32(arg0, arg4, 13847, arg1);
                        class50 var17 = class50.method512(var14);
                        if (var17.field1364) {
                            this.field456[arg1].method213(false, arg4, arg0, var16, var17.field1348, var15);
                        }
                    }
                    if (arg3 == 1) {
                        this.field369.method33(arg1, arg0, arg4, -661);
                    }
                    if (arg3 == 2) {
                        this.field369.method34(arg4, arg1, arg0, this.field320);
                        class50 var18 = class50.method512(var14);
                        if (var18.field1358 + arg0 > 103 || var18.field1358 + arg4 > 103 || var18.field1365 + arg0 > 103 || var18.field1365 + arg4 > 103) {
                            return;
                        }
                        if (var18.field1364) {
                            this.field456[arg1].method214(var18.field1358, var18.field1348, var16, arg4, arg0, var18.field1365, 564);
                        }
                    }
                    if (arg3 == 3) {
                        this.field369.method35(arg0, arg4, arg1, 66);
                        class50 var19 = class50.method512(var14);
                        if (var19.field1364 && var19.field1347) {
                            this.field456[arg1].method216(arg4, arg0, this.field327);
                        }
                    }
                }
                if (arg2 >= 0) {
                    int var20 = arg1;
                    if (arg1 < 3 && (this.field450[1][arg0][arg4] & 2) == 2) {
                        var20 = arg1 + 1;
                    }
                    class46.method486(this.field405, true, this.field456[arg1], arg4, arg2, var20, this.field369, arg7, arg1, arg5, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public void method191(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field491);
        if (this.field236 != null) {
            System.out.println("Od-cycle:" + this.field236.field1434);
        }
        System.out.println("loop-cycle:" + field464);
        System.out.println("draw-cycle:" + field519);
        System.out.println("ptype:" + this.field256);
        System.out.println("psize:" + this.field255);
        if (this.field223 != null) {
            this.field223.method403(0);
        }
        super.field1172 = true;
        this.field255 += arg0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final Component method192(int arg0) {
        if (arg0 < 0) {
            if (signlink.mainapp != null) {
                return signlink.mainapp;
            } else {
                return super.field1178 != null ? super.field1178 : this;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 312);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field363 = Integer.parseInt(arg0[0]);
                field364 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method83(441);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method173((byte) 1);
                }
                if (arg0[3].equals("free")) {
                    field365 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field365 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method410(503, 765, field291);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)V")
    public final void method193(byte arg0) {
        if (this.field264 == 0) {
            this.field314[0] = "Cancel";
            this.field275[0] = 1977;
            this.field524 = 1;
            this.method91(this.field595);
            this.field343 = 0;
            if (arg0 != 7) {
                this.method116();
            }
            if (super.field1183 > 4 && super.field1184 > 4 && super.field1183 < 516 && super.field1184 < 338) {
                if (this.field345 != -1) {
                    this.method168(0, class2.field66[this.field345], super.field1183, 4, 4, super.field1184, 0);
                } else {
                    this.method67(true);
                }
            }
            if (this.field343 != this.field277) {
                this.field277 = this.field343;
            }
            this.field343 = 0;
            if (super.field1183 > 553 && super.field1184 > 205 && super.field1183 < 743 && super.field1184 < 466) {
                if (this.field178 != -1) {
                    this.method168(0, class2.field66[this.field178], super.field1183, 205, 553, super.field1184, 0);
                } else if (this.field555[this.field333] != -1) {
                    this.method168(0, class2.field66[this.field555[this.field333]], super.field1183, 205, 553, super.field1184, 0);
                }
            }
            if (this.field471 != this.field343) {
                this.field521 = true;
                this.field471 = this.field343;
            }
            this.field343 = 0;
            if (super.field1183 > 17 && super.field1184 > 357 && super.field1183 < 496 && super.field1184 < 453) {
                if (this.field455 != -1) {
                    this.method168(0, class2.field66[this.field455], super.field1183, 357, 17, super.field1184, 0);
                } else if (super.field1184 < 434 && super.field1183 < 426) {
                    this.method124(super.field1183 - 17, (byte) 0, super.field1184 - 357);
                }
            }
            if (this.field455 != -1 && this.field574 != this.field343) {
                this.field530 = true;
                this.field574 = this.field343;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field524 - 1; ++var3) {
                    if (this.field275[var3] < 1000 && this.field275[var3 + 1] > 1000) {
                        String var4 = this.field314[var3];
                        this.field314[var3] = this.field314[var3 + 1];
                        this.field314[var3 + 1] = var4;
                        int var5 = this.field275[var3];
                        this.field275[var3] = this.field275[var3 + 1];
                        this.field275[var3 + 1] = var5;
                        int var6 = this.field273[var3];
                        this.field273[var3] = this.field273[var3 + 1];
                        this.field273[var3 + 1] = var6;
                        int var7 = this.field274[var3];
                        this.field274[var3] = this.field274[var3 + 1];
                        this.field274[var3 + 1] = var7;
                        int var8 = this.field276[var3];
                        this.field276[var3] = this.field276[var3 + 1];
                        this.field276[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method194(boolean arg0) {
        this.field222 &= arg0;
        if (super.field1189 == 1) {
            if (super.field1190 >= 539 && super.field1190 <= 573 && super.field1191 >= 169 && super.field1191 < 205 && this.field555[0] != -1) {
                this.field521 = true;
                this.field333 = 0;
                this.field421 = true;
            }
            if (super.field1190 >= 569 && super.field1190 <= 599 && super.field1191 >= 168 && super.field1191 < 205 && this.field555[1] != -1) {
                this.field521 = true;
                this.field333 = 1;
                this.field421 = true;
            }
            if (super.field1190 >= 597 && super.field1190 <= 627 && super.field1191 >= 168 && super.field1191 < 205 && this.field555[2] != -1) {
                this.field521 = true;
                this.field333 = 2;
                this.field421 = true;
            }
            if (super.field1190 >= 625 && super.field1190 <= 669 && super.field1191 >= 168 && super.field1191 < 203 && this.field555[3] != -1) {
                this.field521 = true;
                this.field333 = 3;
                this.field421 = true;
            }
            if (super.field1190 >= 666 && super.field1190 <= 696 && super.field1191 >= 168 && super.field1191 < 205 && this.field555[4] != -1) {
                this.field521 = true;
                this.field333 = 4;
                this.field421 = true;
            }
            if (super.field1190 >= 694 && super.field1190 <= 724 && super.field1191 >= 168 && super.field1191 < 205 && this.field555[5] != -1) {
                this.field521 = true;
                this.field333 = 5;
                this.field421 = true;
            }
            if (super.field1190 >= 722 && super.field1190 <= 756 && super.field1191 >= 169 && super.field1191 < 205 && this.field555[6] != -1) {
                this.field521 = true;
                this.field333 = 6;
                this.field421 = true;
            }
            if (super.field1190 >= 540 && super.field1190 <= 574 && super.field1191 >= 466 && super.field1191 < 502 && this.field555[7] != -1) {
                this.field521 = true;
                this.field333 = 7;
                this.field421 = true;
            }
            if (super.field1190 >= 572 && super.field1190 <= 602 && super.field1191 >= 466 && super.field1191 < 503 && this.field555[8] != -1) {
                this.field521 = true;
                this.field333 = 8;
                this.field421 = true;
            }
            if (super.field1190 >= 599 && super.field1190 <= 629 && super.field1191 >= 466 && super.field1191 < 503 && this.field555[9] != -1) {
                this.field521 = true;
                this.field333 = 9;
                this.field421 = true;
            }
            if (super.field1190 >= 627 && super.field1190 <= 671 && super.field1191 >= 467 && super.field1191 < 502 && this.field555[10] != -1) {
                this.field521 = true;
                this.field333 = 10;
                this.field421 = true;
            }
            if (super.field1190 >= 669 && super.field1190 <= 699 && super.field1191 >= 466 && super.field1191 < 503 && this.field555[11] != -1) {
                this.field521 = true;
                this.field333 = 11;
                this.field421 = true;
            }
            if (super.field1190 >= 696 && super.field1190 <= 726 && super.field1191 >= 466 && super.field1191 < 503 && this.field555[12] != -1) {
                this.field521 = true;
                this.field333 = 12;
                this.field421 = true;
            }
            if (super.field1190 >= 724 && super.field1190 <= 758 && super.field1191 >= 466 && super.field1191 < 502 && this.field555[13] != -1) {
                this.field521 = true;
                this.field333 = 13;
                this.field421 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method195(boolean arg0) {
        if (arg0) {
            this.field256 = this.field431.method349();
        }
        for (int var2 = 0; var2 < this.field481; ++var2) {
            int var3 = this.field482[var2];
            class13 var4 = this.field480[var3];
            if (var4 != null) {
                this.method196(var4.field736.field1508, var4, 9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILUKUMCXZT;I)V")
    public final void method196(int arg0, class60 arg1, int arg2) {
        if (arg1.field1539 < 128 || arg1.field1540 < 128 || arg1.field1539 >= 13184 || arg1.field1540 >= 13184) {
            arg1.field1552 = -1;
            arg1.field1584 = -1;
            arg1.field1576 = 0;
            arg1.field1577 = 0;
            arg1.field1539 = arg1.field1581[0] * 128 + arg1.field1565 * 64;
            arg1.field1540 = arg1.field1582[0] * 128 + arg1.field1565 * 64;
            arg1.method578(3);
        }
        if (field285 == arg1 && (arg1.field1539 < 1536 || arg1.field1540 < 1536 || arg1.field1539 >= 11776 || arg1.field1540 >= 11776)) {
            arg1.field1552 = -1;
            arg1.field1584 = -1;
            arg1.field1576 = 0;
            arg1.field1577 = 0;
            arg1.field1539 = arg1.field1581[0] * 128 + arg1.field1565 * 64;
            arg1.field1540 = arg1.field1582[0] * 128 + arg1.field1565 * 64;
            arg1.method578(3);
        }
        if (arg1.field1576 > field464) {
            this.method197(0, arg1);
        } else if (arg1.field1577 >= field464) {
            this.method198((byte) -11, arg1);
        } else {
            this.method199(arg1, (byte) 2);
        }
        this.method200(-417, arg1);
        this.method201(arg1, 7);
        if (arg2 < 9 || arg2 > 9) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILUKUMCXZT;)V")
    public final void method197(int arg0, class60 arg1) {
        int var3 = arg1.field1576 - field464;
        int var4 = arg1.field1572 * 128 + arg1.field1565 * 64;
        int var5 = arg1.field1574 * 128 + arg1.field1565 * 64;
        arg1.field1539 += (var4 - arg1.field1539) / var3;
        arg1.field1540 += (var5 - arg1.field1540) / var3;
        arg1.field1547 = 0;
        if (arg0 != 0) {
            this.field470 = 60;
        }
        if (arg1.field1578 == 0) {
            arg1.field1557 = 1024;
        }
        if (arg1.field1578 == 1) {
            arg1.field1557 = 1536;
        }
        if (arg1.field1578 == 2) {
            arg1.field1557 = 0;
        }
        if (arg1.field1578 == 3) {
            arg1.field1557 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLUKUMCXZT;)V")
    public final void method198(byte arg0, class60 arg1) {
        if (arg0 != -11) {
            this.field470 = this.field619.method526();
        }
        if (field464 == arg1.field1577 || arg1.field1552 == -1 || arg1.field1555 != 0 || arg1.field1554 + 1 > class9.field682[arg1.field1552].method241(true, arg1.field1553)) {
            int var3 = arg1.field1577 - arg1.field1576;
            int var4 = field464 - arg1.field1576;
            int var5 = arg1.field1572 * 128 + arg1.field1565 * 64;
            int var6 = arg1.field1574 * 128 + arg1.field1565 * 64;
            int var7 = arg1.field1573 * 128 + arg1.field1565 * 64;
            int var8 = arg1.field1575 * 128 + arg1.field1565 * 64;
            arg1.field1539 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1540 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1547 = 0;
        if (arg1.field1578 == 0) {
            arg1.field1557 = 1024;
        }
        if (arg1.field1578 == 1) {
            arg1.field1557 = 1536;
        }
        if (arg1.field1578 == 2) {
            arg1.field1557 = 0;
        }
        if (arg1.field1578 == 3) {
            arg1.field1557 = 512;
        }
        arg1.field1541 = arg1.field1557;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUKUMCXZT;B)V")
    public final void method199(class60 arg0, byte arg1) {
        arg0.field1567 = arg0.field1545;
        if (arg0.field1559 == 0) {
            arg0.field1547 = 0;
        } else {
            if (arg0.field1552 != -1 && arg0.field1555 == 0) {
                class9 var3 = class9.field682[arg0.field1552];
                if (arg0.field1593 > 0 && var3.field694 == 0) {
                    ++arg0.field1547;
                    return;
                }
                if (arg0.field1593 <= 0 && var3.field695 == 0) {
                    ++arg0.field1547;
                    return;
                }
            }
            int var4 = arg0.field1539;
            int var5 = arg0.field1540;
            int var6 = arg0.field1581[arg0.field1559 - 1] * 128 + arg0.field1565 * 64;
            int var7 = arg0.field1582[arg0.field1559 - 1] * 128 + arg0.field1565 * 64;
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
                int var8 = arg0.field1557 - arg0.field1541 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1561;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1560;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1563;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1562;
                }
                if (var9 == -1) {
                    var9 = arg0.field1560;
                }
                arg0.field1567 = var9;
                int var10 = 4;
                if (arg1 == 2) {
                    boolean var11 = false;
                    if (arg0.field1557 != arg0.field1541 && arg0.field1538 == -1 && arg0.field1558 != 0) {
                        var10 = 2;
                    }
                    if (arg0.field1559 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field1559 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field1547 > 0 && arg0.field1559 > 1) {
                        var10 = 8;
                        --arg0.field1547;
                    }
                    if (arg0.field1543[arg0.field1559 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field1567 == arg0.field1560 && arg0.field1583 != -1) {
                        arg0.field1567 = arg0.field1583;
                    }
                    if (var4 < var6) {
                        arg0.field1539 += var10;
                        if (arg0.field1539 > var6) {
                            arg0.field1539 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field1539 -= var10;
                        if (arg0.field1539 < var6) {
                            arg0.field1539 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field1540 += var10;
                        if (arg0.field1540 > var7) {
                            arg0.field1540 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field1540 -= var10;
                        if (arg0.field1540 < var7) {
                            arg0.field1540 = var7;
                        }
                    }
                    if (arg0.field1539 == var6 && arg0.field1540 == var7) {
                        --arg0.field1559;
                        if (arg0.field1593 > 0) {
                            --arg0.field1593;
                            return;
                        }
                    }
                }
            } else {
                arg0.field1539 = var6;
                arg0.field1540 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILUKUMCXZT;)V")
    public final void method200(int arg0, class60 arg1) {
        while (arg0 >= 0) {
            this.field309 = null;
        }
        if (arg1.field1558 != 0) {
            if (arg1.field1538 != -1 && arg1.field1538 < 32768) {
                class13 var3 = this.field480[arg1.field1538];
                if (var3 != null) {
                    int var4 = arg1.field1539 - var3.field1539;
                    int var5 = arg1.field1540 - var3.field1540;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1557 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1538 >= 32768) {
                int var6 = arg1.field1538 - 32768;
                if (this.field361 == var6) {
                    var6 = this.field412;
                }
                class69 var7 = this.field413[var6];
                if (var7 != null) {
                    int var8 = arg1.field1539 - var7.field1539;
                    int var9 = arg1.field1540 - var7.field1540;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1557 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1579 != 0 || arg1.field1580 != 0) && (arg1.field1559 == 0 || arg1.field1547 > 0)) {
                int var10 = arg1.field1539 - (arg1.field1579 - this.field537 - this.field537) * 64;
                int var11 = arg1.field1540 - (arg1.field1580 - this.field538 - this.field538) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1557 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1579 = 0;
                arg1.field1580 = 0;
            }
            int var12 = arg1.field1557 - arg1.field1541 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1558 && var12 <= 2048 - arg1.field1558) {
                    if (var12 > 1024) {
                        arg1.field1541 -= arg1.field1558;
                    } else {
                        arg1.field1541 += arg1.field1558;
                    }
                } else {
                    arg1.field1541 = arg1.field1557;
                }
                arg1.field1541 &= 2047;
                if (arg1.field1567 == arg1.field1545 && arg1.field1557 != arg1.field1541) {
                    if (arg1.field1546 != -1) {
                        arg1.field1567 = arg1.field1546;
                        return;
                    }
                    arg1.field1567 = arg1.field1560;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUKUMCXZT;I)V")
    public final void method201(class60 arg0, int arg1) {
        if (this.field350 != arg1) {
            this.field336 = !this.field336;
        }
        arg0.field1570 = false;
        if (arg0.field1567 != -1) {
            class9 var3 = class9.field682[arg0.field1567];
            ++arg0.field1569;
            if (arg0.field1568 < var3.field683 && arg0.field1569 > var3.method241(true, arg0.field1568)) {
                arg0.field1569 = 0;
                ++arg0.field1568;
            }
            if (arg0.field1568 >= var3.field683) {
                arg0.field1569 = 0;
                arg0.field1568 = 0;
            }
        }
        if (arg0.field1584 != -1 && field464 >= arg0.field1587) {
            if (arg0.field1585 < 0) {
                arg0.field1585 = 0;
            }
            class9 var4 = class22.field913[arg0.field1584].field917;
            ++arg0.field1586;
            while (arg0.field1585 < var4.field683 && arg0.field1586 > var4.method241(true, arg0.field1585)) {
                arg0.field1586 -= var4.method241(true, arg0.field1585);
                ++arg0.field1585;
            }
            if (arg0.field1585 >= var4.field683 && (arg0.field1585 < 0 || arg0.field1585 >= var4.field683)) {
                arg0.field1584 = -1;
            }
        }
        if (arg0.field1552 != -1 && arg0.field1555 <= 1) {
            class9 var5 = class9.field682[arg0.field1552];
            if (var5.field694 == 1 && arg0.field1593 > 0 && arg0.field1576 <= field464 && arg0.field1577 < field464) {
                arg0.field1555 = 1;
                return;
            }
        }
        if (arg0.field1552 != -1 && arg0.field1555 == 0) {
            class9 var6 = class9.field682[arg0.field1552];
            ++arg0.field1554;
            while (arg0.field1553 < var6.field683 && arg0.field1554 > var6.method241(true, arg0.field1553)) {
                arg0.field1554 -= var6.method241(true, arg0.field1553);
                ++arg0.field1553;
            }
            if (arg0.field1553 >= var6.field683) {
                arg0.field1553 -= var6.field687;
                ++arg0.field1556;
                if (arg0.field1556 >= var6.field693) {
                    arg0.field1552 = -1;
                }
                if (arg0.field1553 < 0 || arg0.field1553 >= var6.field683) {
                    arg0.field1552 = -1;
                }
            }
            arg0.field1570 = var6.field689;
        }
        if (arg0.field1555 > 0) {
            --arg0.field1555;
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(B)V")
    public final void method202(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field350 = this.field619.method526();
        }
        if (this.field535) {
            this.field535 = false;
            this.field395.method466(2, super.field1175, 4, 0);
            this.field396.method466(2, super.field1175, 357, 0);
            this.field397.method466(2, super.field1175, 4, 722);
            this.field398.method466(2, super.field1175, 205, 743);
            this.field399.method466(2, super.field1175, 0, 0);
            this.field400.method466(2, super.field1175, 4, 516);
            this.field401.method466(2, super.field1175, 205, 516);
            this.field402.method466(2, super.field1175, 357, 496);
            this.field403.method466(2, super.field1175, 338, 0);
            this.field521 = true;
            this.field530 = true;
            this.field421 = true;
            this.field584 = true;
            if (this.field495 != 2) {
                this.field442.method466(2, super.field1175, 4, 4);
                this.field441.method466(2, super.field1175, 4, 550);
            }
        }
        if (this.field495 == 2) {
            this.method132(500);
        }
        if (this.field246 && this.field484 == 1) {
            this.field521 = true;
        }
        if (this.field178 != -1) {
            boolean var3 = this.method79(923, this.field504, this.field178);
            if (var3) {
                this.field521 = true;
            }
        }
        if (this.field509 == 2) {
            this.field521 = true;
        }
        if (this.field264 == 2) {
            this.field521 = true;
        }
        if (this.field521) {
            this.method140((byte) 2);
            this.field521 = false;
        }
        if (this.field455 == -1) {
            this.field526.field49 = this.field207 - this.field462 - 77;
            if (super.field1183 > 448 && super.field1183 < 560 && super.field1184 > 332) {
                this.method130(this.field207, super.field1184 - 357, 0, 77, -12137, 463, this.field526, false, super.field1183 - 17);
            }
            int var4 = this.field207 - 77 - this.field526.field49;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > this.field207 - 77) {
                var4 = this.field207 - 77;
            }
            if (this.field462 != var4) {
                this.field462 = var4;
                this.field530 = true;
            }
        }
        if (this.field455 != -1) {
            boolean var5 = this.method79(923, this.field504, this.field455);
            if (var5) {
                this.field530 = true;
            }
        }
        if (this.field509 == 3) {
            this.field530 = true;
        }
        if (this.field264 == 3) {
            this.field530 = true;
        }
        if (this.field307 != null) {
            this.field530 = true;
        }
        if (this.field246 && this.field484 == 2) {
            this.field530 = true;
        }
        if (this.field530) {
            this.method87(3);
            this.field530 = false;
        }
        if (this.field495 == 2) {
            this.method100(7);
            this.field441.method466(2, super.field1175, 4, 550);
        }
        if (this.field288 != -1) {
            this.field421 = true;
        }
        if (this.field421) {
            if (this.field288 != -1 && this.field333 == this.field288) {
                this.field288 = -1;
                this.field334.method338(0, 201);
                this.field334.method339(this.field333);
            }
            this.field421 = false;
            this.field235.method465(false);
            this.field375.method319(0, 0, (byte) 71);
            if (this.field178 == -1) {
                if (this.field555[this.field333] != -1) {
                    if (this.field333 == 0) {
                        this.field250.method319(10, 22, (byte) 71);
                    }
                    if (this.field333 == 1) {
                        this.field251.method319(8, 54, (byte) 71);
                    }
                    if (this.field333 == 2) {
                        this.field251.method319(8, 82, (byte) 71);
                    }
                    if (this.field333 == 3) {
                        this.field252.method319(8, 110, (byte) 71);
                    }
                    if (this.field333 == 4) {
                        this.field254.method319(8, 153, (byte) 71);
                    }
                    if (this.field333 == 5) {
                        this.field254.method319(8, 181, (byte) 71);
                    }
                    if (this.field333 == 6) {
                        this.field253.method319(9, 209, (byte) 71);
                    }
                }
                if (this.field555[0] != -1 && (this.field288 != 0 || field464 % 20 < 10)) {
                    this.field232[0].method319(13, 29, (byte) 71);
                }
                if (this.field555[1] != -1 && (this.field288 != 1 || field464 % 20 < 10)) {
                    this.field232[1].method319(11, 53, (byte) 71);
                }
                if (this.field555[2] != -1 && (this.field288 != 2 || field464 % 20 < 10)) {
                    this.field232[2].method319(11, 82, (byte) 71);
                }
                if (this.field555[3] != -1 && (this.field288 != 3 || field464 % 20 < 10)) {
                    this.field232[3].method319(12, 115, (byte) 71);
                }
                if (this.field555[4] != -1 && (this.field288 != 4 || field464 % 20 < 10)) {
                    this.field232[4].method319(13, 153, (byte) 71);
                }
                if (this.field555[5] != -1 && (this.field288 != 5 || field464 % 20 < 10)) {
                    this.field232[5].method319(11, 180, (byte) 71);
                }
                if (this.field555[6] != -1 && (this.field288 != 6 || field464 % 20 < 10)) {
                    this.field232[6].method319(13, 208, (byte) 71);
                }
            }
            this.field235.method466(2, super.field1175, 160, 516);
            ++field586;
            if (field586 > 93) {
                field586 = 0;
                this.field334.method338(0, 156);
            }
            this.field234.method465(false);
            this.field374.method319(0, 0, (byte) 71);
            if (this.field178 == -1) {
                if (this.field555[this.field333] != -1) {
                    if (this.field333 == 7) {
                        this.field422.method319(0, 42, (byte) 71);
                    }
                    if (this.field333 == 8) {
                        this.field423.method319(0, 74, (byte) 71);
                    }
                    if (this.field333 == 9) {
                        this.field423.method319(0, 102, (byte) 71);
                    }
                    if (this.field333 == 10) {
                        this.field424.method319(1, 130, (byte) 71);
                    }
                    if (this.field333 == 11) {
                        this.field426.method319(0, 173, (byte) 71);
                    }
                    if (this.field333 == 12) {
                        this.field426.method319(0, 201, (byte) 71);
                    }
                    if (this.field333 == 13) {
                        this.field425.method319(0, 229, (byte) 71);
                    }
                }
                if (this.field555[8] != -1 && (this.field288 != 8 || field464 % 20 < 10)) {
                    this.field232[7].method319(2, 74, (byte) 71);
                }
                if (this.field555[9] != -1 && (this.field288 != 9 || field464 % 20 < 10)) {
                    this.field232[8].method319(3, 102, (byte) 71);
                }
                if (this.field555[10] != -1 && (this.field288 != 10 || field464 % 20 < 10)) {
                    this.field232[9].method319(4, 137, (byte) 71);
                }
                if (this.field555[11] != -1 && (this.field288 != 11 || field464 % 20 < 10)) {
                    this.field232[10].method319(2, 174, (byte) 71);
                }
                if (this.field555[12] != -1 && (this.field288 != 12 || field464 % 20 < 10)) {
                    this.field232[11].method319(2, 201, (byte) 71);
                }
                if (this.field555[13] != -1 && (this.field288 != 13 || field464 % 20 < 10)) {
                    this.field232[12].method319(2, 226, (byte) 71);
                }
            }
            this.field234.method466(2, super.field1175, 466, 496);
            this.field442.method465(false);
        }
        if (this.field584) {
            this.field584 = false;
            this.field233.method465(false);
            this.field373.method319(0, 0, (byte) 71);
            this.field458.method249("Public chat", false, true, 55, 28, 16777215);
            if (this.field576 == 0) {
                this.field458.method249("On", false, true, 55, 41, 65280);
            }
            if (this.field576 == 1) {
                this.field458.method249("Friends", false, true, 55, 41, 16776960);
            }
            if (this.field576 == 2) {
                this.field458.method249("Off", false, true, 55, 41, 16711680);
            }
            if (this.field576 == 3) {
                this.field458.method249("Hide", false, true, 55, 41, 65535);
            }
            this.field458.method249("Private chat", false, true, 184, 28, 16777215);
            if (this.field167 == 0) {
                this.field458.method249("On", false, true, 184, 41, 65280);
            }
            if (this.field167 == 1) {
                this.field458.method249("Friends", false, true, 184, 41, 16776960);
            }
            if (this.field167 == 2) {
                this.field458.method249("Off", false, true, 184, 41, 16711680);
            }
            this.field458.method249("Trade/compete", false, true, 324, 28, 16777215);
            if (this.field319 == 0) {
                this.field458.method249("On", false, true, 324, 41, 65280);
            }
            if (this.field319 == 1) {
                this.field458.method249("Friends", false, true, 324, 41, 16776960);
            }
            if (this.field319 == 2) {
                this.field458.method249("Off", false, true, 324, 41, 16711680);
            }
            this.field458.method249("Report abuse", false, true, 458, 33, 16777215);
            this.field233.method466(2, super.field1175, 453, 0);
            this.field442.method465(false);
        }
        this.field504 = 0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IZ)V")
    public final void method203(int arg0, boolean arg1) {
        class2 var3 = class2.field66[arg0];
        for (int var4 = 0; var4 < var3.field20.length && var3.field20[var4] != -1; ++var4) {
            class2 var5 = class2.field66[var3.field20[var4]];
            if (var5.field35 == 1) {
                this.method203(var5.field15, false);
            }
            var5.field42 = 0;
            var5.field59 = 0;
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method204(byte[] arg0, int arg1, boolean arg2) {
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg0, arg0.length);
        if (arg1 != 24560) {
            field291 = this.field619.method526();
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(B)V")
    private final void method205(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (class70 var4 = (class70) this.field216.method329(); var4 != null; var4 = (class70) this.field216.method331(9)) {
            if (var4.field1685 == -1) {
                var4.field1684 = 0;
                this.method207(90, var4);
            } else {
                var4.method1();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method206(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILZAHKTBCG;)V")
    private final void method207(int arg0, class70 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field1681 == 0) {
            var3 = this.field369.method41(arg1.field1680, arg1.field1682, arg1.field1683);
        }
        if (arg1.field1681 == 1) {
            var3 = this.field369.method42(false, arg1.field1682, arg1.field1680, arg1.field1683);
        }
        if (arg1.field1681 == 2) {
            var3 = this.field369.method43(arg1.field1680, arg1.field1682, arg1.field1683);
        }
        if (arg1.field1681 == 3) {
            var3 = this.field369.method44(arg1.field1680, arg1.field1682, arg1.field1683);
        }
        if (var3 != 0) {
            int var7 = this.field369.method45(arg1.field1680, arg1.field1682, arg1.field1683, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field1677 = var4;
        int var8 = 79 / arg0;
        arg1.field1679 = var5;
        arg1.field1678 = var6;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field528[var1] = var0 - 1;
            var0 += var0;
        }
        field536 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field536[var3] = var2 / 4;
        }
        field570 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field575 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
