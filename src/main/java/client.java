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
public class client extends class38 {

    @OriginalMember(owner = "client", name = "I", descriptor = "Z")
    private boolean field99 = false;

    @OriginalMember(owner = "client", name = "J", descriptor = "B")
    private byte field100 = -40;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field107 = 2;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field109 = 9538;

    @OriginalMember(owner = "client", name = "Y", descriptor = "[I")
    public int[] field115 = new int[2000];

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field117 = 7759444;

    @OriginalMember(owner = "client", name = "cb", descriptor = "[I")
    private int[] field119 = new int[50];

    @OriginalMember(owner = "client", name = "db", descriptor = "[LBXNXROZD;")
    private class3[] field120 = new class3[4];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[LDGXCFOYI;")
    private class11[] field121 = new class11[2];

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field122 = 3;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Ljava/lang/String;")
    private String field123 = "";

    @OriginalMember(owner = "client", name = "hb", descriptor = "Ljava/lang/String;")
    private String field124 = "";

    @OriginalMember(owner = "client", name = "ib", descriptor = "Ljava/lang/String;")
    private String field125 = "";

    @OriginalMember(owner = "client", name = "jb", descriptor = "Ljava/lang/String;")
    private String field126 = "";

    @OriginalMember(owner = "client", name = "rb", descriptor = "Z")
    private boolean field134 = false;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[B")
    private byte[] field136 = new byte[16384];

    @OriginalMember(owner = "client", name = "xb", descriptor = "Z")
    private boolean field140 = false;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field143 = -1;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[I")
    private int[] field144 = new int[200];

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field145 = 1;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[LHOSNGCXH;")
    private class28[] field157 = new class28[1000];

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field159 = 1;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field160 = 4;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "Z")
    private boolean field161 = false;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Z")
    private boolean field162 = true;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field163 = -1;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field164 = new int[class44.field1296];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Z")
    private boolean field165 = true;

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private int[] field171 = new int[7];

    @OriginalMember(owner = "client", name = "dc", descriptor = "[[I")
    private int[][] field172 = new int[104][104];

    @OriginalMember(owner = "client", name = "ec", descriptor = "Z")
    private boolean field173 = true;

    @OriginalMember(owner = "client", name = "ic", descriptor = "Z")
    private boolean field177 = false;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    private int[] field181 = new int[50];

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field182 = 2301979;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Z")
    private boolean field186 = false;

    @OriginalMember(owner = "client", name = "sc", descriptor = "B")
    private byte field187 = -71;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Z")
    private boolean field190 = false;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "Z")
    private boolean field195 = true;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "LEGCCHUZS;")
    private class15 field199 = class15.method249(2, 1);

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Ljava/lang/String;")
    private String field201 = "";

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[[I")
    private int[][] field202 = new int[104][104];

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    public int[] field204 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client", name = "Kc", descriptor = "B")
    private byte field205 = 5;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Z")
    private boolean field207 = false;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "B")
    private byte field212 = 2;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "Ljava/lang/String;")
    private String field213 = "";

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Z")
    private volatile boolean field219 = false;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "[I")
    private int[] field220 = new int[33];

    @OriginalMember(owner = "client", name = "jd", descriptor = "[Z")
    private boolean[] field230 = new boolean[5];

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field232 = 1;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field243 = 50;

    @OriginalMember(owner = "client", name = "xd", descriptor = "[I")
    private int[] field244 = new int[this.field243];

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    private int[] field245 = new int[this.field243];

    @OriginalMember(owner = "client", name = "zd", descriptor = "[I")
    private int[] field246 = new int[this.field243];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[I")
    private int[] field247 = new int[this.field243];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    private int[] field248 = new int[this.field243];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[I")
    private int[] field249 = new int[this.field243];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[I")
    private int[] field250 = new int[this.field243];

    @OriginalMember(owner = "client", name = "Ed", descriptor = "[Ljava/lang/String;")
    private String[] field251 = new String[this.field243];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field254 = -1;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[LHOSNGCXH;")
    private class28[] field257 = new class28[100];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field258 = 2048;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field259 = 2047;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[LQAJCAYDZ;")
    private class53[] field260 = new class53[this.field258];

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[I")
    public int[] field262 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[I")
    private int[] field264 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[LEGCCHUZS;")
    private class15[] field265 = new class15[this.field258];

    @OriginalMember(owner = "client", name = "Td", descriptor = "Z")
    private boolean field266 = true;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field267 = new int[500];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    private int[] field268 = new int[500];

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[I")
    private int[] field269 = new int[500];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field270 = new int[500];

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field272 = new int[1000];

    @OriginalMember(owner = "client", name = "ae", descriptor = "[I")
    private int[] field273 = new int[1000];

    @OriginalMember(owner = "client", name = "he", descriptor = "[I")
    private final int[] field280 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "ke", descriptor = "[I")
    private int[] field283 = new int[50];

    @OriginalMember(owner = "client", name = "le", descriptor = "Z")
    private boolean field284 = false;

    @OriginalMember(owner = "client", name = "oe", descriptor = "[I")
    private int[] field287 = new int[5];

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field289 = -39192;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field294 = new CRC32();

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field296 = 3353893;

    @OriginalMember(owner = "client", name = "He", descriptor = "[LHOSNGCXH;")
    private class28[] field306 = new class28[8];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field309 = -1;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field310 = -1;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Ljava/lang/String;")
    private String field311 = "";

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    private int[] field315 = new int[5];

    @OriginalMember(owner = "client", name = "Ye", descriptor = "Z")
    private boolean field323 = false;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field327 = -253;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private final int field328 = 100;

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field329 = new int[100];

    @OriginalMember(owner = "client", name = "ff", descriptor = "LLORGYGVM;")
    private class41 field330 = new class41();

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field331 = 5063219;

    @OriginalMember(owner = "client", name = "nf", descriptor = "[Ljava/lang/String;")
    private String[] field337 = new String[5];

    @OriginalMember(owner = "client", name = "of", descriptor = "[Z")
    private boolean[] field338 = new boolean[5];

    @OriginalMember(owner = "client", name = "qf", descriptor = "[I")
    private int[] field340 = new int[5];

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field346 = -1;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field347 = -1;

    @OriginalMember(owner = "client", name = "Df", descriptor = "[I")
    private int[] field353 = new int[151];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Ljava/lang/String;")
    private String field355 = "";

    @OriginalMember(owner = "client", name = "Gf", descriptor = "B")
    private byte field356 = -92;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "LJQSVNFRT;")
    private class36 field363 = new class36(0);

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Z")
    private boolean field365 = false;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field366 = 2;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Z")
    private volatile boolean field368 = false;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[I")
    private int[] field372 = new int[2000];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "LJQSVNFRT;")
    private class36 field373 = new class36(0);

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field378 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "eg", descriptor = "[LDGXCFOYI;")
    private class11[] field380 = new class11[100];

    @OriginalMember(owner = "client", name = "fg", descriptor = "Ljava/lang/String;")
    private String field381 = "";

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field384 = -1;

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field386 = new int[9];

    @OriginalMember(owner = "client", name = "lg", descriptor = "Z")
    private volatile boolean field387 = false;

    @OriginalMember(owner = "client", name = "qg", descriptor = "B")
    private byte field392 = -92;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field393 = 5;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[Ljava/lang/String;")
    private String[] field394 = new String[500];

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field396 = 762;

    @OriginalMember(owner = "client", name = "wg", descriptor = "[I")
    private int[] field398 = new int[151];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field402 = -1;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[I")
    private int[] field403 = new int[class44.field1296];

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Z")
    public boolean field415 = true;

    @OriginalMember(owner = "client", name = "Og", descriptor = "LEGCCHUZS;")
    private class15 field416 = class15.method249(2, 1);

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field419 = -1;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[[I")
    private int[][] field420 = new int[104][104];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[J")
    private long[] field421 = new long[100];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "LJQSVNFRT;")
    private class36 field422 = new class36(0);

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    private boolean field427 = false;

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field428 = new int[5];

    @OriginalMember(owner = "client", name = "bh", descriptor = "[LDGXCFOYI;")
    private class11[] field429 = new class11[13];

    @OriginalMember(owner = "client", name = "ih", descriptor = "[I")
    private int[] field436 = new int[256];

    @OriginalMember(owner = "client", name = "jh", descriptor = "Z")
    private boolean field437 = false;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[LHOSNGCXH;")
    private class28[] field438 = new class28[32];

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private int[] field440 = new int[4000];

    @OriginalMember(owner = "client", name = "nh", descriptor = "[I")
    private int[] field441 = new int[4000];

    @OriginalMember(owner = "client", name = "rh", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Z")
    private boolean field459 = false;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "Z")
    private boolean field460 = false;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Z")
    private boolean field461 = true;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "B")
    private byte field462 = -88;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field468 = -1;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field469 = 78;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[LHOSNGCXH;")
    private class28[] field470 = new class28[20];

    @OriginalMember(owner = "client", name = "Uh", descriptor = "LEGCCHUZS;")
    private class15 field474 = new class15(new byte[5000], false);

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[LCHUIKYUV;")
    private class6[] field475 = new class6[16384];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    public int[] field477 = new int[16384];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field478 = -11857;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field484 = 128;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[LHOSNGCXH;")
    private class28[] field488 = new class28[32];

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field489 = -696;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Z")
    private boolean field490 = false;

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field491 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "mi", descriptor = "[LHOSNGCXH;")
    private class28[] field492 = new class28[32];

    @OriginalMember(owner = "client", name = "oi", descriptor = "B")
    private byte field494 = 9;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field495 = -1;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field496 = -1;

    @OriginalMember(owner = "client", name = "ui", descriptor = "[J")
    private long[] field500 = new long[200];

    @OriginalMember(owner = "client", name = "vi", descriptor = "Z")
    private boolean field501 = true;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "B")
    private byte field514 = 9;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Z")
    private boolean field515 = false;

    @OriginalMember(owner = "client", name = "Li", descriptor = "[I")
    public int[] field517 = new int[1000];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Z")
    private boolean field518 = false;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field521 = 2;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[[[LJQSVNFRT;")
    private class36[][][] field527 = new class36[4][104][104];

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Z")
    private boolean field528 = false;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Z")
    public boolean field529 = false;

    @OriginalMember(owner = "client", name = "bj", descriptor = "LEGCCHUZS;")
    private class15 field533 = class15.method249(2, 1);

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field536 = -1;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field537 = -1;

    @OriginalMember(owner = "client", name = "gj", descriptor = "B")
    private byte field538 = 5;

    @OriginalMember(owner = "client", name = "nj", descriptor = "B")
    private byte field545 = 3;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field547 = new int[33];

    @OriginalMember(owner = "client", name = "qj", descriptor = "B")
    private byte field548 = 8;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[LEEVNVHNQ;")
    public class14[] field549 = new class14[5];

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field553 = -1;

    @OriginalMember(owner = "client", name = "wj", descriptor = "B")
    private byte field554 = 5;

    @OriginalMember(owner = "client", name = "xj", descriptor = "[I")
    private int[] field555 = new int[100];

    @OriginalMember(owner = "client", name = "yj", descriptor = "[Ljava/lang/String;")
    private String[] field556 = new String[100];

    @OriginalMember(owner = "client", name = "zj", descriptor = "[Ljava/lang/String;")
    private String[] field557 = new String[100];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "Z")
    private boolean field559 = false;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[I")
    private int[] field560 = new int[5];

    @OriginalMember(owner = "client", name = "Ij", descriptor = "Z")
    private boolean field566 = true;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "[Ljava/lang/String;")
    private String[] field574 = new String[200];

    @OriginalMember(owner = "client", name = "Rj", descriptor = "[[[I")
    private int[][][] field575 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Vj", descriptor = "Z")
    private boolean field579 = false;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "I")
    private int field580 = 4;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "[I")
    private int[] field581 = new int[class44.field1296];

    @OriginalMember(owner = "client", name = "ck", descriptor = "I")
    private int field586 = 2;

    @OriginalMember(owner = "client", name = "dk", descriptor = "Z")
    private boolean field587 = false;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private static int field108 = -313;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private static int field127 = 10;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private static boolean field129 = true;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Ljava/lang/String;")
    private static String field138 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private static int[] field189 = new int[99];

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private static int field275;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private static boolean field286;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field303;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field314;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private static int field406;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Z")
    private static boolean field408;

    @OriginalMember(owner = "client", name = "qh", descriptor = "[[I")
    public static final int[][] field444;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    public static int[] field446;

    @OriginalMember(owner = "client", name = "Th", descriptor = "B")
    private static byte field473;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "[I")
    public static final int[] field526;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private static int field535;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private static int field110;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private static int field112;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private static int field116;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private static int field131;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private static int field174;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private static int field229;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private static int field252;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private static int field277;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private static int field339;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private static int field354;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private static int field358;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private static int field395;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private static int field404;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private static int field417;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private static int field472;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private static int field519;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private static int field532;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client", name = "Yj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "Zj", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client", name = "ak", descriptor = "I")
    private static int field584;

    @OriginalMember(owner = "client", name = "bk", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client", name = "ek", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client", name = "wb", descriptor = "J")
    private long field139;

    @OriginalMember(owner = "client", name = "jc", descriptor = "J")
    private long field178;

    @OriginalMember(owner = "client", name = "pd", descriptor = "J")
    private long field236;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "J")
    public long field253;

    @OriginalMember(owner = "client", name = "de", descriptor = "J")
    private long field276;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LDGXCFOYI;")
    private class11 field197;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "LDGXCFOYI;")
    private class11 field198;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "LDGXCFOYI;")
    private class11 field324;

    @OriginalMember(owner = "client", name = "af", descriptor = "LDGXCFOYI;")
    private class11 field325;

    @OriginalMember(owner = "client", name = "bf", descriptor = "LDGXCFOYI;")
    private class11 field326;

    @OriginalMember(owner = "client", name = "mg", descriptor = "LDGXCFOYI;")
    private class11 field388;

    @OriginalMember(owner = "client", name = "ng", descriptor = "LDGXCFOYI;")
    private class11 field389;

    @OriginalMember(owner = "client", name = "og", descriptor = "LDGXCFOYI;")
    private class11 field390;

    @OriginalMember(owner = "client", name = "ch", descriptor = "LDGXCFOYI;")
    private class11 field430;

    @OriginalMember(owner = "client", name = "dh", descriptor = "LDGXCFOYI;")
    private class11 field431;

    @OriginalMember(owner = "client", name = "eh", descriptor = "LDGXCFOYI;")
    private class11 field432;

    @OriginalMember(owner = "client", name = "fh", descriptor = "LDGXCFOYI;")
    private class11 field433;

    @OriginalMember(owner = "client", name = "gh", descriptor = "LDGXCFOYI;")
    private class11 field434;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "LDGXCFOYI;")
    private class11 field479;

    @OriginalMember(owner = "client", name = "ai", descriptor = "LDGXCFOYI;")
    private class11 field480;

    @OriginalMember(owner = "client", name = "bi", descriptor = "LDGXCFOYI;")
    private class11 field481;

    @OriginalMember(owner = "client", name = "ci", descriptor = "LDGXCFOYI;")
    private class11 field482;

    @OriginalMember(owner = "client", name = "di", descriptor = "LDGXCFOYI;")
    private class11 field483;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "LDGXCFOYI;")
    private class11 field572;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "LDGXCFOYI;")
    private class11 field573;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "LDHNAQSHE;")
    private class13 field256;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "LGAUMGPFH;")
    public class22 field301;

    @OriginalMember(owner = "client", name = "Db", descriptor = "LHOSNGCXH;")
    private class28 field146;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "LHOSNGCXH;")
    private class28 field166;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "LHOSNGCXH;")
    private class28 field167;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "LHOSNGCXH;")
    private class28 field168;

    @OriginalMember(owner = "client", name = "ac", descriptor = "LHOSNGCXH;")
    private class28 field169;

    @OriginalMember(owner = "client", name = "bc", descriptor = "LHOSNGCXH;")
    private class28 field170;

    @OriginalMember(owner = "client", name = "zg", descriptor = "LHOSNGCXH;")
    private class28 field401;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "LHOSNGCXH;")
    private class28 field405;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "LHOSNGCXH;")
    private class28 field530;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "LHOSNGCXH;")
    private class28 field531;

    @OriginalMember(owner = "client", name = "kj", descriptor = "LHOSNGCXH;")
    private class28 field542;

    @OriginalMember(owner = "client", name = "lj", descriptor = "LHOSNGCXH;")
    private class28 field543;

    @OriginalMember(owner = "client", name = "tj", descriptor = "LHOSNGCXH;")
    private class28 field551;

    @OriginalMember(owner = "client", name = "uj", descriptor = "LHOSNGCXH;")
    private class28 field552;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "LHOSNGCXH;")
    private class28 field569;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "LKYNTOGBR;")
    private class39 field208;

    @OriginalMember(owner = "client", name = "Id", descriptor = "LQAJCAYDZ;")
    public static class53 field255;

    @OriginalMember(owner = "client", name = "be", descriptor = "LQHNACLRF;")
    private class54 field274;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LRLQTDOAP;")
    private class55 field191;

    @OriginalMember(owner = "client", name = "xc", descriptor = "LRLQTDOAP;")
    private class55 field192;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LRLQTDOAP;")
    private class55 field193;

    @OriginalMember(owner = "client", name = "zc", descriptor = "LRLQTDOAP;")
    private class55 field194;

    @OriginalMember(owner = "client", name = "td", descriptor = "LTKEGJSFV;")
    private class58 field240;

    @OriginalMember(owner = "client", name = "xg", descriptor = "LUFCPVKNJ;")
    private class60 field399;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "LYJGBGRIO;")
    private class68 field148;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "LYJGBGRIO;")
    private class68 field149;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "LYJGBGRIO;")
    private class68 field150;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "LYJGBGRIO;")
    private class68 field151;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "LYJGBGRIO;")
    private class68 field152;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "LYJGBGRIO;")
    private class68 field153;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "LYJGBGRIO;")
    private class68 field154;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "LYJGBGRIO;")
    private class68 field155;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "LYJGBGRIO;")
    private class68 field156;

    @OriginalMember(owner = "client", name = "qd", descriptor = "LYJGBGRIO;")
    private class68 field237;

    @OriginalMember(owner = "client", name = "rd", descriptor = "LYJGBGRIO;")
    private class68 field238;

    @OriginalMember(owner = "client", name = "sd", descriptor = "LYJGBGRIO;")
    private class68 field239;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "LYJGBGRIO;")
    private class68 field359;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "LYJGBGRIO;")
    private class68 field360;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "LYJGBGRIO;")
    private class68 field361;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "LYJGBGRIO;")
    private class68 field362;

    @OriginalMember(owner = "client", name = "th", descriptor = "LYJGBGRIO;")
    private class68 field447;

    @OriginalMember(owner = "client", name = "uh", descriptor = "LYJGBGRIO;")
    private class68 field448;

    @OriginalMember(owner = "client", name = "vh", descriptor = "LYJGBGRIO;")
    private class68 field449;

    @OriginalMember(owner = "client", name = "wh", descriptor = "LYJGBGRIO;")
    private class68 field450;

    @OriginalMember(owner = "client", name = "xh", descriptor = "LYJGBGRIO;")
    private class68 field451;

    @OriginalMember(owner = "client", name = "yh", descriptor = "LYJGBGRIO;")
    private class68 field452;

    @OriginalMember(owner = "client", name = "zh", descriptor = "LYJGBGRIO;")
    private class68 field453;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "LYJGBGRIO;")
    private class68 field454;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "LYJGBGRIO;")
    private class68 field455;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Ljava/lang/String;")
    private String field188;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Ljava/lang/String;")
    public String field218;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Ljava/lang/String;")
    public String field426;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Ljava/lang/String;")
    private String field539;

    @OriginalMember(owner = "client", name = "md", descriptor = "Ljava/net/Socket;")
    private Socket field233;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Z")
    private static boolean field130;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Z")
    public static boolean field179;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Z")
    public static boolean field196;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Z")
    private static boolean field352;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    private static boolean field379;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field307;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private int[] field308;

    @OriginalMember(owner = "client", name = "zf", descriptor = "[I")
    private int[] field349;

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field350;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field351;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field374;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field375;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field376;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field377;

    @OriginalMember(owner = "client", name = "wi", descriptor = "[I")
    private int[] field502;

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field503;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "[I")
    private int[] field561;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[I")
    private int[] field562;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "[I")
    private int[] field563;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[I")
    private int[] field564;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "[LDGXCFOYI;")
    private class11[] field578;

    @OriginalMember(owner = "client", name = "We", descriptor = "[[B")
    private byte[][] field321;

    @OriginalMember(owner = "client", name = "Of", descriptor = "[[B")
    private byte[][] field364;

    @OriginalMember(owner = "client", name = "ph", descriptor = "[[[B")
    private byte[][][] field443;

    @OriginalMember(owner = "client", name = "jg", descriptor = "[[[I")
    private int[][][] field385;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLDGXCFOYI;)V")
    public final void method31(boolean arg0, class11 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field307.length; ++var4) {
            this.field307[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field307[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field308[var16] = (this.field307[var16 - 1] + this.field307[var16 + 1] + this.field307[var16 - 128] + this.field307[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field307;
            this.field307 = this.field308;
            this.field308 = var14;
        }
        this.field529 &= arg0;
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field610; ++var8) {
                for (int var9 = 0; var9 < arg1.field609; ++var9) {
                    if (arg1.field607[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field611;
                        int var11 = var8 + 16 + arg1.field612;
                        int var12 = (var11 << 7) + var10;
                        this.field307[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)I")
    public final int method32(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        return arg0 ? 3 : ((arg1 & 16711935) * arg3 + (arg2 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg3 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method33(int arg0, int arg1) {
        class36 var3 = this.field527[this.field367][arg0][arg1];
        if (var3 == null) {
            this.field208.method435(this.field367, arg0, arg1);
        } else {
            int var4 = -99999999;
            class34 var5 = null;
            for (class34 var6 = (class34) var3.method395(); var6 != null; var6 = (class34) var3.method397(-125)) {
                class65 var11 = class65.method560(var6.field1012);
                int var12 = var11.field1647;
                if (var11.field1623) {
                    var12 = (var6.field1011 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method393(var5, -558);
            class34 var7 = null;
            class34 var8 = null;
            for (class34 var9 = (class34) var3.method395(); var9 != null; var9 = (class34) var3.method397(-125)) {
                if (var5.field1012 != var9.field1012 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1012 != var9.field1012 && var7.field1012 != var9.field1012 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field208.method421(var7, var8, arg1, -11757, arg0, this.method152(arg0 * 128 + 64, 0, arg1 * 128 + 64, this.field367), var5, this.field367, var10);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZOMFWUWL;BI)V")
    public final void method34(class71 arg0, byte arg1, int arg2) {
        this.method35(arg2, true, arg0.field1721, arg0.field1722);
        if (arg1 == 5) {
            boolean var4 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)V")
    public final void method35(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg3 >= 128 && arg2 <= 13056 && arg3 <= 13056) {
            int var5 = this.method152(arg2, 0, arg3, this.field367) - arg0;
            int var6 = arg2 - this.field410;
            int var7 = var5 - this.field411;
            int var8 = arg3 - this.field412;
            int var9 = class32.field1001[this.field413];
            int var10 = class32.field1002[this.field413];
            int var11 = class32.field1001[this.field414];
            int var12 = class32.field1002[this.field414];
            this.field529 &= arg1;
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field495 = (var13 << 9) / var17 + class49.field1357;
                this.field496 = (var16 << 9) / var17 + class49.field1358;
            } else {
                this.field495 = -1;
                this.field496 = -1;
            }
        } else {
            this.field495 = -1;
            this.field496 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method36(int arg0) {
        int var2 = 5;
        this.field386[8] = 0;
        int var3 = 0 / arg0;
        int var4 = 0;
        while (this.field386[8] == 0) {
            String var5 = "Unknown problem";
            this.method92("Connecting to web server", 20, (byte) 8);
            try {
                DataInputStream var6 = this.method99("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 346);
                class15 var7 = new class15(new byte[40], false);
                var6.readFully(var7.field708, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field386[var8] = var7.method266();
                }
                int var9 = var7.method266();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field386[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field386[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field386[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field386[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field386[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field386[8] == 0) {
                ++var4;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method92("Game updated - please reload page", 10, (byte) 8);
                        var12 = 10;
                    } else {
                        this.method92(var5 + " - Will retry in " + var12 + " secs.", 10, (byte) 8);
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
                this.field445 = !this.field445;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method37(boolean arg0, int arg1) {
        if (arg1 < 5 || arg1 > 5) {
            field535 = -212;
        }
        for (int var3 = 0; var3 < this.field476; ++var3) {
            class6 var4 = this.field475[this.field477[var3]];
            int var5 = (this.field477[var3] << 14) + 536870912;
            if (var4 != null && var4.method29(true) && var4.field86.field21 == arg0 && var4.field86.method4(this.field327)) {
                int var6 = var4.field1721 >> 7;
                int var7 = var4.field1722 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1717 == 1 && (var4.field1721 & 127) == 64 && (var4.field1722 & 127) == 64) {
                        if (this.field420[var6][var7] == this.field540) {
                            continue;
                        }
                        this.field420[var6][var7] = this.field540;
                    }
                    if (!var4.field86.field12) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field208.method425((var4.field1717 - 1) * 64 + 60, var4.field1699, 34, var4.field1722, var4, this.method152(var4.field1721, 0, var4.field1722, this.field367), var4.field1721, this.field367, var5, var4.field1723);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILQAJCAYDZ;IIB)V")
    public final void method38(int arg0, class53 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -77) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (field255 != arg1) {
            if (this.field550 < 400) {
                String var7;
                if (arg1.field1460 == 0) {
                    var7 = arg1.field1462 + method146(arg1.field1467, field255.field1467, (byte) 56) + " (level-" + arg1.field1467 + ")";
                } else {
                    var7 = arg1.field1462 + " (skill-" + arg1.field1460 + ")";
                }
                if (this.field214 == 1) {
                    this.field394[this.field550] = "Use " + this.field218 + " with @whi@" + var7;
                    this.field269[this.field550] = 131;
                    this.field270[this.field550] = arg3;
                    this.field267[this.field550] = arg2;
                    this.field268[this.field550] = arg0;
                    ++this.field550;
                } else if (this.field423 == 1) {
                    if ((this.field425 & 8) == 8) {
                        this.field394[this.field550] = this.field426 + " @whi@" + var7;
                        this.field269[this.field550] = 673;
                        this.field270[this.field550] = arg3;
                        this.field267[this.field550] = arg2;
                        this.field268[this.field550] = arg0;
                        ++this.field550;
                    }
                } else {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (this.field337[var8] != null) {
                            this.field394[this.field550] = this.field337[var8] + " @whi@" + var7;
                            short var10 = 0;
                            if (this.field337[var8].equalsIgnoreCase("attack")) {
                                if (arg1.field1467 > field255.field1467) {
                                    var10 = 2000;
                                }
                                if (field255.field1468 != 0 && arg1.field1468 != 0) {
                                    if (field255.field1468 == arg1.field1468) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field338[var8]) {
                                var10 = 2000;
                            }
                            if (var8 == 0) {
                                this.field269[this.field550] = var10 + 912;
                            }
                            if (var8 == 1) {
                                this.field269[this.field550] = var10 + 90;
                            }
                            if (var8 == 2) {
                                this.field269[this.field550] = var10 + 288;
                            }
                            if (var8 == 3) {
                                this.field269[this.field550] = var10 + 587;
                            }
                            if (var8 == 4) {
                                this.field269[this.field550] = var10 + 858;
                            }
                            this.field270[this.field550] = arg3;
                            this.field267[this.field550] = arg2;
                            this.field268[this.field550] = arg0;
                            ++this.field550;
                        }
                    }
                }
                for (int var9 = 0; var9 < this.field550; ++var9) {
                    if (this.field269[var9] == 506) {
                        this.field394[var9] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILEGCCHUZS;I)V")
    private final void method39(int arg0, class15 arg1, int arg2) {
        this.field516 = 0;
        if (arg0 != 1) {
            this.field278 = this.field274.method522();
        }
        this.field263 = 0;
        this.method135(false, arg1, arg2);
        this.method110((byte) 0, arg2, arg1);
        this.method126(arg1, 9, arg2);
        this.method116((byte) 5, arg2, arg1);
        for (int var4 = 0; var4 < this.field516; ++var4) {
            int var6 = this.field517[var4];
            if (field147 != this.field260[var6].field1746) {
                this.field260[var6] = null;
            }
        }
        if (arg1.field709 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field709 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field261; ++var5) {
                if (this.field260[this.field262[var5]] == null) {
                    signlink.reporterror(this.field123 + " null entry in pl list - pos:" + var5 + " size:" + this.field261);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLORGYGVM;I)Z")
    public final boolean method40(class41 arg0, int arg1) {
        int var3 = arg0.field1211;
        if (arg1 != 4) {
            this.field145 = 300;
        }
        if (this.field223 == 2) {
            if (var3 == 201) {
                this.field365 = true;
                this.field498 = 0;
                this.field518 = true;
                this.field355 = "";
                this.field558 = 1;
                this.field201 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field365 = true;
                this.field498 = 0;
                this.field518 = true;
                this.field355 = "";
                this.field558 = 2;
                this.field201 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field228 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field365 = true;
                this.field498 = 0;
                this.field518 = true;
                this.field355 = "";
                this.field558 = 4;
                this.field201 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field365 = true;
                this.field498 = 0;
                this.field518 = true;
                this.field355 = "";
                this.field558 = 5;
                this.field201 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field171[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class72.field1754 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class72.field1754) {
                                var6 = 0;
                            }
                        }
                        if (!class72.field1755[var6].field1761 && class72.field1755[var6].field1756 == var4 + (this.field266 ? 0 : 7)) {
                            this.field171[var4] = var6;
                            this.field140 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field428[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field444[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field444[var7].length) {
                        var9 = 0;
                    }
                }
                this.field428[var7] = var9;
                this.field140 = true;
            }
            if (var3 == 324 && !this.field266) {
                this.field266 = true;
                this.method170(1);
            }
            if (var3 == 325 && this.field266) {
                this.field266 = false;
                this.method170(1);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field490 = !this.field490;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method159(0);
                    if (this.field213.length() > 0) {
                        this.field533.method250(1, 189);
                        this.field533.method257(0, class67.method574(this.field213));
                        this.field533.method251(var3 - 601);
                        this.field533.method251(this.field490 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field533.method250(1, 234);
                this.field533.method251(this.field266 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field533.method251(this.field171[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field533.method251(this.field428[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method41(byte arg0) {
        if (this.field343 == 0) {
            this.field394[0] = "Cancel";
            this.field269[0] = 1761;
            this.field550 = 1;
            if (this.field419 != -1) {
                this.field282 = 0;
                this.field221 = 0;
                this.method165(super.field1058, 0, class41.method477(this.field419), 0, 0, 173, 0, super.field1057);
                if (this.field534 != this.field282) {
                    this.field534 = this.field282;
                }
                if (this.field442 != this.field221) {
                    this.field442 = this.field221;
                }
            } else {
                this.method90(true);
                this.field282 = 0;
                this.field221 = 0;
                if (super.field1057 > 4 && super.field1058 > 4 && super.field1057 < 516 && super.field1058 < 338) {
                    if (this.field254 != -1) {
                        this.method165(super.field1058, 0, class41.method477(this.field254), 0, 4, 173, 4, super.field1057);
                    } else {
                        this.method45(0);
                    }
                }
                if (this.field534 != this.field282) {
                    this.field534 = this.field282;
                }
                if (this.field442 != this.field221) {
                    this.field442 = this.field221;
                }
                this.field282 = 0;
                if (this.field514 == arg0) {
                    boolean var2 = false;
                } else {
                    this.field134 = !this.field134;
                }
                this.field221 = 0;
                if (super.field1057 > 553 && super.field1058 > 205 && super.field1057 < 743 && super.field1058 < 466) {
                    if (this.field347 != -1) {
                        this.method165(super.field1058, 0, class41.method477(this.field347), 1, 205, 173, 553, super.field1057);
                    } else if (this.field378[this.field122] != -1) {
                        this.method165(super.field1058, 0, class41.method477(this.field378[this.field122]), 1, 205, 173, 553, super.field1057);
                    }
                }
                if (this.field316 != this.field282) {
                    this.field284 = true;
                    this.field316 = this.field282;
                }
                if (this.field541 != this.field221) {
                    this.field284 = true;
                    this.field541 = this.field221;
                }
                this.field282 = 0;
                this.field221 = 0;
                if (super.field1057 > 17 && super.field1058 > 357 && super.field1057 < 496 && super.field1058 < 453) {
                    if (this.field310 != -1) {
                        this.method165(super.field1058, 0, class41.method477(this.field310), 2, 357, 173, 17, super.field1057);
                    } else if (this.field468 != -1) {
                        this.method165(super.field1058, 0, class41.method477(this.field468), 3, 357, 173, 17, super.field1057);
                    } else if (super.field1058 < 434 && super.field1057 < 426) {
                        this.method153((byte) -15, super.field1057 - 17, super.field1058 - 357);
                    }
                }
                if ((this.field310 != -1 || this.field468 != -1) && this.field282 != this.field111) {
                    this.field365 = true;
                    this.field111 = this.field282;
                }
                if ((this.field310 != -1 || this.field468 != -1) && this.field439 != this.field221) {
                    this.field365 = true;
                    this.field439 = this.field221;
                }
                boolean var3 = false;
                while (!var3) {
                    var3 = true;
                    for (int var4 = 0; var4 < this.field550 - 1; ++var4) {
                        if (this.field269[var4] < 1000 && this.field269[var4 + 1] > 1000) {
                            String var5 = this.field394[var4];
                            this.field394[var4] = this.field394[var4 + 1];
                            this.field394[var4 + 1] = var5;
                            int var6 = this.field269[var4];
                            this.field269[var4] = this.field269[var4 + 1];
                            this.field269[var4 + 1] = var6;
                            int var7 = this.field267[var4];
                            this.field267[var4] = this.field267[var4 + 1];
                            this.field267[var4 + 1] = var7;
                            int var8 = this.field268[var4];
                            this.field268[var4] = this.field268[var4 + 1];
                            this.field268[var4 + 1] = var8;
                            int var9 = this.field270[var4];
                            this.field270[var4] = this.field270[var4 + 1];
                            this.field270[var4 + 1] = var9;
                            var3 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method42(int arg0, boolean arg1) {
        if (arg1) {
            field535 = -378;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method43(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field234 == 0) {
            int var4 = super.field1047 / 2 - 80;
            int var5 = super.field1048 / 2 + 20;
            int var16 = var5 + 20;
            if (super.field1063 == 1 && super.field1064 >= var4 - 75 && super.field1064 <= var4 + 75 && super.field1065 >= var16 - 20 && super.field1065 <= var16 + 20) {
                this.field234 = 3;
                this.field137 = 0;
            }
            int var6 = super.field1047 / 2 + 80;
            if (super.field1063 == 1 && super.field1064 >= var6 - 75 && super.field1064 <= var6 + 75 && super.field1065 >= var16 - 20 && super.field1065 <= var16 + 20) {
                this.field125 = "";
                this.field126 = "Enter your username & password.";
                this.field234 = 2;
                this.field137 = 0;
                return;
            }
        } else {
            if (this.field234 == 2) {
                int var7 = super.field1048 / 2 - 40;
                int var17 = var7 + 30;
                int var18 = var17 + 25;
                if (super.field1063 == 1 && super.field1065 >= var18 - 15 && super.field1065 < var18) {
                    this.field137 = 0;
                }
                var7 = var18 + 15;
                if (super.field1063 == 1 && super.field1065 >= var7 - 15 && super.field1065 < var7) {
                    this.field137 = 1;
                }
                var7 += 15;
                int var8 = super.field1047 / 2 - 80;
                int var9 = super.field1048 / 2 + 50;
                int var19 = var9 + 20;
                if (super.field1063 == 1 && super.field1064 >= var8 - 75 && super.field1064 <= var8 + 75 && super.field1065 >= var19 - 20 && super.field1065 <= var19 + 20) {
                    this.field391 = 0;
                    this.method158(this.field123, this.field124, false);
                    if (this.field529) {
                        return;
                    }
                }
                int var10 = super.field1047 / 2 + 80;
                if (super.field1063 == 1 && super.field1064 >= var10 - 75 && super.field1064 <= var10 + 75 && super.field1065 >= var19 - 20 && super.field1065 <= var19 + 20) {
                    this.field234 = 0;
                    this.field123 = "";
                    this.field124 = "";
                }
                while (true) {
                    while (true) {
                        int var11 = this.method412(true);
                        if (var11 == -1) {
                            return;
                        }
                        boolean var12 = false;
                        for (int var13 = 0; var13 < field138.length(); ++var13) {
                            if (var11 == field138.charAt(var13)) {
                                var12 = true;
                                break;
                            }
                        }
                        if (this.field137 == 0) {
                            if (var11 == 8 && this.field123.length() > 0) {
                                this.field123 = this.field123.substring(0, this.field123.length() - 1);
                            }
                            if (var11 == 9 || var11 == 10 || var11 == 13) {
                                this.field137 = 1;
                            }
                            if (var12) {
                                this.field123 = this.field123 + (char) var11;
                            }
                            if (this.field123.length() > 12) {
                                this.field123 = this.field123.substring(0, 12);
                            }
                        } else if (this.field137 == 1) {
                            if (var11 == 8 && this.field124.length() > 0) {
                                this.field124 = this.field124.substring(0, this.field124.length() - 1);
                            }
                            if (var11 == 9 || var11 == 10 || var11 == 13) {
                                this.field137 = 0;
                            }
                            if (var12) {
                                this.field124 = this.field124 + (char) var11;
                            }
                            if (this.field124.length() > 20) {
                                this.field124 = this.field124.substring(0, 20);
                            }
                        }
                    }
                }
            }
            if (this.field234 != 3) {
                return;
            }
            int var14 = super.field1047 / 2;
            int var15 = super.field1048 / 2 + 50;
            int var20 = var15 + 20;
            if (super.field1063 != 1 || super.field1064 < var14 - 75 || super.field1064 > var14 + 75 || super.field1065 < var20 - 20 || super.field1065 > var20 + 20) {
                return;
            }
            this.field234 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method44(byte arg0) {
        this.field359.method580(true);
        class49.field1363 = this.field562;
        this.field388.method183(7964, 0, 0);
        if (arg0 != 5) {
            field408 = !field408;
        }
        if (this.field347 != -1) {
            this.method148(0, 9538, 0, 0, class41.method477(this.field347));
        } else if (this.field378[this.field122] != -1) {
            this.method148(0, 9538, 0, 0, class41.method477(this.field378[this.field122]));
        }
        if (this.field528 && this.field463 == 1) {
            this.method58(0);
        }
        this.field359.method581(553, 205, -41725, super.field1049);
        this.field361.method580(true);
        class49.field1363 = this.field563;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (this.field214 == 0 && this.field423 == 0) {
            this.field394[this.field550] = "Walk here";
            this.field269[this.field550] = 506;
            this.field267[this.field550] = super.field1057;
            this.field268[this.field550] = super.field1058;
            ++this.field550;
        }
        int var2 = -1;
        this.field224 += arg0;
        for (int var3 = 0; var3 < class32.field999; ++var3) {
            int var4 = class32.field1000[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field208.method444(this.field367, var5, var6, var4) >= 0) {
                    class27 var9 = class27.method326(var8);
                    if (var9.field825 != null) {
                        var9 = var9.method329(-485);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field214 == 1) {
                        this.field394[this.field550] = "Use " + this.field218 + " with @cya@" + var9.field833;
                        this.field269[this.field550] = 688;
                        this.field270[this.field550] = var4;
                        this.field267[this.field550] = var5;
                        this.field268[this.field550] = var6;
                        ++this.field550;
                    } else if (this.field423 == 1) {
                        if ((this.field425 & 4) == 4) {
                            this.field394[this.field550] = this.field426 + " @cya@" + var9.field833;
                            this.field269[this.field550] = 355;
                            this.field270[this.field550] = var4;
                            this.field267[this.field550] = var5;
                            this.field268[this.field550] = var6;
                            ++this.field550;
                        }
                    } else {
                        if (var9.field862 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field862[var10] != null) {
                                    this.field394[this.field550] = var9.field862[var10] + " @cya@" + var9.field833;
                                    if (var10 == 0) {
                                        this.field269[this.field550] = 941;
                                    }
                                    if (var10 == 1) {
                                        this.field269[this.field550] = 559;
                                    }
                                    if (var10 == 2) {
                                        this.field269[this.field550] = 535;
                                    }
                                    if (var10 == 3) {
                                        this.field269[this.field550] = 705;
                                    }
                                    if (var10 == 4) {
                                        this.field269[this.field550] = 1258;
                                    }
                                    this.field270[this.field550] = var4;
                                    this.field267[this.field550] = var5;
                                    this.field268[this.field550] = var6;
                                    ++this.field550;
                                }
                            }
                        }
                        this.field394[this.field550] = "Examine @cya@" + var9.field833;
                        this.field269[this.field550] = 1225;
                        this.field270[this.field550] = var9.field824 << 14;
                        this.field267[this.field550] = var5;
                        this.field268[this.field550] = var6;
                        ++this.field550;
                    }
                }
                if (var7 == 1) {
                    class6 var11 = this.field475[var8];
                    if (var11.field86.field18 == 1 && (var11.field1721 & 127) == 64 && (var11.field1722 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field476; ++var12) {
                            class6 var15 = this.field475[this.field477[var12]];
                            if (var15 != null && var11 != var15 && var15.field86.field18 == 1 && var11.field1721 == var15.field1721 && var11.field1722 == var15.field1722) {
                                this.method156(this.field477[var12], var15.field86, var5, true, var6);
                            }
                        }
                        for (int var13 = 0; var13 < this.field261; ++var13) {
                            class53 var14 = this.field260[this.field262[var13]];
                            if (var14 != null && var11.field1721 == var14.field1721 && var11.field1722 == var14.field1722) {
                                this.method38(var6, var14, var5, this.field262[var13], (byte) -77);
                            }
                        }
                    }
                    this.method156(var8, var11.field86, var5, true, var6);
                }
                if (var7 == 0) {
                    class53 var16 = this.field260[var8];
                    if ((var16.field1721 & 127) == 64 && (var16.field1722 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field476; ++var17) {
                            class6 var20 = this.field475[this.field477[var17]];
                            if (var20 != null && var20.field86.field18 == 1 && var16.field1721 == var20.field1721 && var16.field1722 == var20.field1722) {
                                this.method156(this.field477[var17], var20.field86, var5, true, var6);
                            }
                        }
                        for (int var18 = 0; var18 < this.field261; ++var18) {
                            class53 var19 = this.field260[this.field262[var18]];
                            if (var19 != null && var16 != var19 && var16.field1721 == var19.field1721 && var16.field1722 == var19.field1722) {
                                this.method38(var6, var19, var5, this.field262[var18], (byte) -77);
                            }
                        }
                    }
                    this.method38(var6, var16, var5, var8, (byte) -77);
                }
                if (var7 == 3) {
                    class36 var21 = this.field527[this.field367][var5][var6];
                    if (var21 != null) {
                        for (class34 var22 = (class34) var21.method396(3); var22 != null; var22 = (class34) var21.method398((byte) -128)) {
                            class65 var23 = class65.method560(var22.field1012);
                            if (this.field214 == 1) {
                                this.field394[this.field550] = "Use " + this.field218 + " with @lre@" + var23.field1645;
                                this.field269[this.field550] = 819;
                                this.field270[this.field550] = var22.field1012;
                                this.field267[this.field550] = var5;
                                this.field268[this.field550] = var6;
                                ++this.field550;
                            } else if (this.field423 == 1) {
                                if ((this.field425 & 1) == 1) {
                                    this.field394[this.field550] = this.field426 + " @lre@" + var23.field1645;
                                    this.field269[this.field550] = 302;
                                    this.field270[this.field550] = var22.field1012;
                                    this.field267[this.field550] = var5;
                                    this.field268[this.field550] = var6;
                                    ++this.field550;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1652 != null && var23.field1652[var24] != null) {
                                        this.field394[this.field550] = var23.field1652[var24] + " @lre@" + var23.field1645;
                                        if (var24 == 0) {
                                            this.field269[this.field550] = 100;
                                        }
                                        if (var24 == 1) {
                                            this.field269[this.field550] = 485;
                                        }
                                        if (var24 == 2) {
                                            this.field269[this.field550] = 613;
                                        }
                                        if (var24 == 3) {
                                            this.field269[this.field550] = 583;
                                        }
                                        if (var24 == 4) {
                                            this.field269[this.field550] = 46;
                                        }
                                        this.field270[this.field550] = var22.field1012;
                                        this.field267[this.field550] = var5;
                                        this.field268[this.field550] = var6;
                                        ++this.field550;
                                    } else if (var24 == 2) {
                                        this.field394[this.field550] = "Take @lre@" + var23.field1645;
                                        this.field269[this.field550] = 613;
                                        this.field270[this.field550] = var22.field1012;
                                        this.field267[this.field550] = var5;
                                        this.field268[this.field550] = var6;
                                        ++this.field550;
                                    }
                                }
                                this.field394[this.field550] = "Examine @lre@" + var23.field1645;
                                this.field269[this.field550] = 1583;
                                this.field270[this.field550] = var22.field1012;
                                this.field267[this.field550] = var5;
                                this.field268[this.field550] = var6;
                                ++this.field550;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field197.method183(7964, arg4, arg5);
        this.field198.method183(7964, arg0 + arg4 - 16, arg5);
        class35.method385(arg4 + 16, 16, arg0 - 32, arg5, (byte) 5, this.field182);
        int var7 = (arg0 - 32) * arg0 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg0 - 32 - var7) * arg2 / (arg1 - arg0);
        class35.method385(arg4 + 16 + var8, 16, var7, arg5, (byte) 5, this.field331);
        class35.method390(arg4 + 16 + var8, arg5, this.field117, true, var7);
        class35.method390(arg4 + 16 + var8, arg5 + 1, this.field117, true, var7);
        class35.method388(-532, arg4 + 16 + var8, arg5, 16, this.field117);
        class35.method388(-532, arg4 + 17 + var8, arg5, 16, this.field117);
        class35.method390(arg4 + 16 + var8, arg5 + 15, this.field296, true, var7);
        class35.method390(arg4 + 17 + var8, arg5 + 14, this.field296, true, var7 - 1);
        class35.method388(-532, arg4 + 15 + var8 + var7, arg5, 16, this.field296);
        if (arg3 != 0) {
            this.field225 = this.field199.method261();
        }
        class35.method388(-532, arg4 + 14 + var8 + var7, arg5 + 1, 15, this.field296);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method47(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method48(byte arg0) {
        this.field507 = 0;
        int var2 = (field255.field1721 >> 7) + this.field522;
        int var3 = (field255.field1722 >> 7) + this.field523;
        if (arg0 != 8) {
            field275 = -253;
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field507 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field507 = 1;
        }
        if (this.field507 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field507 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        if (arg0 >= 0) {
            this.field225 = this.field199.method261();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method50(int arg0) {
        for (int var2 = -1; var2 < this.field261; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field259;
            } else {
                var3 = this.field262[var2];
            }
            class53 var4 = this.field260[var3];
            if (var4 != null) {
                this.method61(1, false, var4);
            }
        }
        while (arg0 >= 0) {
            this.field225 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method51(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method51(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLORGYGVM;IIIIIIB)V")
    public final void method52(int arg0, class41 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 != 125) {
            this.field145 = this.field274.method522();
        }
        if (this.field437) {
            this.field285 = 32;
        } else {
            this.field285 = 0;
        }
        this.field437 = false;
        if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg2 && arg5 < arg2 + 16) {
            arg1.field1181 -= this.field499 * 4;
            if (arg4 == 1) {
                this.field284 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field365 = true;
            }
        } else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg0 + arg2 - 16 && arg5 < arg0 + arg2) {
            arg1.field1181 += this.field499 * 4;
            if (arg4 == 1) {
                this.field284 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field365 = true;
            }
        } else if (arg6 >= arg7 - this.field285 && arg6 < arg7 + 16 + this.field285 && arg5 >= arg2 + 16 && arg5 < arg0 + arg2 - 16 && this.field499 > 0) {
            int var10 = (arg0 - 32) * arg0 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg5 - arg2 - 16 - var10 / 2;
            int var12 = arg0 - 32 - var10;
            arg1.field1181 = (arg3 - arg0) * var11 / var12;
            if (arg4 == 1) {
                this.field284 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field365 = true;
            }
            this.field437 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method53(int arg0, byte arg1) {
        if (arg1 != -104) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class41.method473(arg0, (byte) -104);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method54(int arg0) {
        if (arg0 >= 0) {
            field286 = !field286;
        }
        if (super.field1050 == null) {
            this.method173(this.field356);
            this.field447 = null;
            this.field448 = null;
            this.field449 = null;
            this.field450 = null;
            this.field451 = null;
            this.field452 = null;
            this.field453 = null;
            this.field454 = null;
            this.field455 = null;
            this.field362 = null;
            this.field360 = null;
            this.field359 = null;
            this.field361 = null;
            this.field237 = null;
            this.field238 = null;
            this.field239 = null;
            super.field1050 = new class68(this.method139(field535), true, 765, 503);
            this.field177 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public final String method55(boolean arg0) {
        if (!arg0) {
            this.field527 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1052 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method56(int arg0) {
        if (this.field343 == 0) {
            int var2 = super.field1063;
            if (arg0 < 0) {
                if (this.field423 == 1 && super.field1064 >= 516 && super.field1065 >= 160 && super.field1064 <= 765 && super.field1065 <= 205) {
                    var2 = 0;
                }
                if (this.field528) {
                    if (var2 != 1) {
                        int var3 = super.field1057;
                        int var4 = super.field1058;
                        if (this.field463 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field463 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field463 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field464 - 10 || var3 > this.field466 + this.field464 + 10 || var4 < this.field465 - 10 || var4 > this.field467 + this.field465 + 10) {
                            this.field528 = false;
                            if (this.field463 == 1) {
                                this.field284 = true;
                            }
                            if (this.field463 == 2) {
                                this.field365 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field464;
                        int var6 = this.field465;
                        int var7 = this.field466;
                        int var8 = super.field1064;
                        int var9 = super.field1065;
                        if (this.field463 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field463 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field463 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field550; ++var11) {
                            int var12 = (this.field550 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method112(-41187, var10);
                        }
                        this.field528 = false;
                        if (this.field463 == 1) {
                            this.field284 = true;
                        }
                        if (this.field463 == 2) {
                            this.field365 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field550 > 0) {
                        int var13 = this.field269[this.field550 - 1];
                        if (var13 == 285 || var13 == 881 || var13 == 875 || var13 == 397 || var13 == 233 || var13 == 963 || var13 == 984 || var13 == 816 || var13 == 800 || var13 == 866 || var13 == 219 || var13 == 1948) {
                            int var14 = this.field267[this.field550 - 1];
                            int var15 = this.field268[this.field550 - 1];
                            class41 var16 = class41.method477(var15);
                            if (var16.field1222 || var16.field1195) {
                                this.field515 = false;
                                this.field546 = 0;
                                this.field341 = var15;
                                this.field342 = var14;
                                this.field343 = 2;
                                this.field344 = super.field1064;
                                this.field345 = super.field1065;
                                if (class41.method477(var15).field1205 == this.field254) {
                                    this.field343 = 1;
                                }
                                if (class41.method477(var15).field1205 == this.field310) {
                                    this.field343 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field241 == 1 || this.method77(357, this.field550 - 1)) && this.field550 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field550 > 0) {
                        this.method112(-41187, this.field550 - 1);
                    }
                    if (var2 != 2 || this.field550 <= 0) {
                        return;
                    }
                    this.method154(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BZI)V")
    public final void method57(byte[] arg0, boolean arg1, int arg2) {
        if (this.field501) {
            signlink.midifade = arg1 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
            if (arg2 != -38594) {
                this.field225 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method58(int arg0) {
        int var2 = this.field464;
        int var3 = this.field465;
        int var4 = this.field466;
        int var5 = this.field467;
        int var6 = 6116423;
        class35.method385(var3, var4, var5, var2, (byte) 5, var6);
        class35.method385(var3 + 1, var4 - 2, 16, var2 + 1, (byte) 5, 0);
        class35.method386(var4 - 2, var5 - 19, this.field278, 0, var2 + 1, var3 + 18);
        this.field193.method530(var3 + 14, "Choose Option", var2 + 3, var6, 411);
        this.field224 += arg0;
        int var7 = super.field1057;
        int var8 = super.field1058;
        if (this.field463 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field463 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field463 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field550; ++var9) {
            int var10 = (this.field550 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field193.method534(this.field394[var9], var11, var10, -964, var2 + 3, true);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method59(int arg0) {
        class27.field822.method3();
        class27.field821.method3();
        class2.field11.method3();
        class65.field1627.method3();
        if (arg0 != 17519) {
            this.field225 = this.field199.method261();
        }
        class65.field1622.method3();
        class53.field1454.method3();
        class62.field1582.method3();
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 != -36) {
            this.method151();
        }
        for (int var2 = 0; var2 < this.field476; ++var2) {
            int var3 = this.field477[var2];
            class6 var4 = this.field475[var3];
            if (var4 != null) {
                this.method61(var4.field86.field18, false, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLZOMFWUWL;)V")
    public final void method61(int arg0, boolean arg1, class71 arg2) {
        if (arg2.field1721 < 128 || arg2.field1722 < 128 || arg2.field1721 >= 13184 || arg2.field1722 >= 13184) {
            arg2.field1694 = -1;
            arg2.field1747 = -1;
            arg2.field1728 = 0;
            arg2.field1729 = 0;
            arg2.field1721 = arg2.field1706[0] * 128 + arg2.field1717 * 64;
            arg2.field1722 = arg2.field1707[0] * 128 + arg2.field1717 * 64;
            arg2.method592(-95);
        }
        if (field255 == arg2 && (arg2.field1721 < 1536 || arg2.field1722 < 1536 || arg2.field1721 >= 11776 || arg2.field1722 >= 11776)) {
            arg2.field1694 = -1;
            arg2.field1747 = -1;
            arg2.field1728 = 0;
            arg2.field1729 = 0;
            arg2.field1721 = arg2.field1706[0] * 128 + arg2.field1717 * 64;
            arg2.field1722 = arg2.field1707[0] * 128 + arg2.field1717 * 64;
            arg2.method592(-95);
        }
        if (arg2.field1728 > field147) {
            this.method62(arg2, 0);
        } else if (arg2.field1729 >= field147) {
            this.method63(arg2, 0);
        } else {
            this.method64(arg2, (byte) 2);
        }
        this.method65(arg2, true);
        if (arg1) {
            this.field225 = -1;
        }
        this.method66(arg2, (byte) 5);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZOMFWUWL;I)V")
    public final void method62(class71 arg0, int arg1) {
        int var3 = arg0.field1728 - field147;
        int var4 = arg0.field1724 * 128 + arg0.field1717 * 64;
        int var5 = arg0.field1726 * 128 + arg0.field1717 * 64;
        arg0.field1721 += (var4 - arg0.field1721) / var3;
        arg0.field1722 += (var5 - arg0.field1722) / var3;
        if (arg1 == 0) {
            arg0.field1713 = 0;
            if (arg0.field1730 == 0) {
                arg0.field1720 = 1024;
            }
            if (arg0.field1730 == 1) {
                arg0.field1720 = 1536;
            }
            if (arg0.field1730 == 2) {
                arg0.field1720 = 0;
            }
            if (arg0.field1730 == 3) {
                arg0.field1720 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LZOMFWUWL;I)V")
    public final void method63(class71 arg0, int arg1) {
        if (arg1 == 0) {
            if (field147 == arg0.field1729 || arg0.field1694 == -1 || arg0.field1697 != 0 || arg0.field1696 + 1 > class5.field67[arg0.field1694].method27(arg0.field1695, (byte) -127)) {
                int var3 = arg0.field1729 - arg0.field1728;
                int var4 = field147 - arg0.field1728;
                int var5 = arg0.field1724 * 128 + arg0.field1717 * 64;
                int var6 = arg0.field1726 * 128 + arg0.field1717 * 64;
                int var7 = arg0.field1725 * 128 + arg0.field1717 * 64;
                int var8 = arg0.field1727 * 128 + arg0.field1717 * 64;
                arg0.field1721 = ((var3 - var4) * var5 + var4 * var7) / var3;
                arg0.field1722 = ((var3 - var4) * var6 + var4 * var8) / var3;
            }
            arg0.field1713 = 0;
            if (arg0.field1730 == 0) {
                arg0.field1720 = 1024;
            }
            if (arg0.field1730 == 1) {
                arg0.field1720 = 1536;
            }
            if (arg0.field1730 == 2) {
                arg0.field1720 = 0;
            }
            if (arg0.field1730 == 3) {
                arg0.field1720 = 512;
            }
            arg0.field1723 = arg0.field1720;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZOMFWUWL;B)V")
    public final void method64(class71 arg0, byte arg1) {
        arg0.field1741 = arg0.field1718;
        if (arg0.field1701 == 0) {
            arg0.field1713 = 0;
        } else {
            if (arg0.field1694 != -1 && arg0.field1697 == 0) {
                class5 var3 = class5.field67[arg0.field1694];
                if (arg0.field1693 > 0 && var3.field79 == 0) {
                    ++arg0.field1713;
                    return;
                }
                if (arg0.field1693 <= 0 && var3.field80 == 0) {
                    ++arg0.field1713;
                    return;
                }
            }
            int var4 = arg0.field1721;
            int var5 = arg0.field1722;
            int var6 = arg0.field1706[arg0.field1701 - 1] * 128 + arg0.field1717 * 64;
            int var7 = arg0.field1707[arg0.field1701 - 1] * 128 + arg0.field1717 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1720 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1720 = 1792;
                    } else {
                        arg0.field1720 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1720 = 768;
                    } else if (var5 > var7) {
                        arg0.field1720 = 256;
                    } else {
                        arg0.field1720 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1720 = 1024;
                } else {
                    arg0.field1720 = 0;
                }
                int var8 = arg0.field1720 - arg0.field1723 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1703;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1702;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1705;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1704;
                }
                if (var9 == -1) {
                    var9 = arg0.field1702;
                }
                arg0.field1741 = var9;
                if (this.field212 == arg1) {
                    int var10 = 4;
                    if (arg0.field1723 != arg0.field1720 && arg0.field1734 == -1 && arg0.field1716 != 0) {
                        var10 = 2;
                    }
                    if (arg0.field1701 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field1701 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field1713 > 0 && arg0.field1701 > 1) {
                        var10 = 8;
                        --arg0.field1713;
                    }
                    if (arg0.field1700[arg0.field1701 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field1741 == arg0.field1702 && arg0.field1736 != -1) {
                        arg0.field1741 = arg0.field1736;
                    }
                    if (var4 < var6) {
                        arg0.field1721 += var10;
                        if (arg0.field1721 > var6) {
                            arg0.field1721 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field1721 -= var10;
                        if (arg0.field1721 < var6) {
                            arg0.field1721 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field1722 += var10;
                        if (arg0.field1722 > var7) {
                            arg0.field1722 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field1722 -= var10;
                        if (arg0.field1722 < var7) {
                            arg0.field1722 = var7;
                        }
                    }
                    if (arg0.field1721 == var6 && arg0.field1722 == var7) {
                        --arg0.field1701;
                        if (arg0.field1693 > 0) {
                            --arg0.field1693;
                            return;
                        }
                    }
                }
            } else {
                arg0.field1721 = var6;
                arg0.field1722 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZOMFWUWL;Z)V")
    public final void method65(class71 arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0.field1716 != 0) {
            if (arg0.field1734 != -1 && arg0.field1734 < 32768) {
                class6 var4 = this.field475[arg0.field1734];
                if (var4 != null) {
                    int var5 = arg0.field1721 - var4.field1721;
                    int var6 = arg0.field1722 - var4.field1722;
                    if (var5 != 0 || var6 != 0) {
                        arg0.field1720 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1734 >= 32768) {
                int var7 = arg0.field1734 - 32768;
                if (this.field384 == var7) {
                    var7 = this.field259;
                }
                class53 var8 = this.field260[var7];
                if (var8 != null) {
                    int var9 = arg0.field1721 - var8.field1721;
                    int var10 = arg0.field1722 - var8.field1722;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field1720 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1737 != 0 || arg0.field1738 != 0) && (arg0.field1701 == 0 || arg0.field1713 > 0)) {
                int var11 = arg0.field1721 - (arg0.field1737 - this.field522 - this.field522) * 64;
                int var12 = arg0.field1722 - (arg0.field1738 - this.field523 - this.field523) * 64;
                if (var11 != 0 || var12 != 0) {
                    arg0.field1720 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
                }
                arg0.field1737 = 0;
                arg0.field1738 = 0;
            }
            int var13 = arg0.field1720 - arg0.field1723 & 2047;
            if (var13 != 0) {
                if (var13 >= arg0.field1716 && var13 <= 2048 - arg0.field1716) {
                    if (var13 > 1024) {
                        arg0.field1723 -= arg0.field1716;
                    } else {
                        arg0.field1723 += arg0.field1716;
                    }
                } else {
                    arg0.field1723 = arg0.field1720;
                }
                arg0.field1723 &= 2047;
                if (arg0.field1741 == arg0.field1718 && arg0.field1723 != arg0.field1720) {
                    if (arg0.field1719 != -1) {
                        arg0.field1741 = arg0.field1719;
                        return;
                    }
                    arg0.field1741 = arg0.field1702;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LZOMFWUWL;B)V")
    public final void method66(class71 arg0, byte arg1) {
        if (arg1 == 5) {
            boolean var3 = false;
            arg0.field1699 = false;
            if (arg0.field1741 != -1) {
                class5 var4 = class5.field67[arg0.field1741];
                ++arg0.field1743;
                if (arg0.field1742 < var4.field68 && arg0.field1743 > var4.method27(arg0.field1742, (byte) -127)) {
                    arg0.field1743 = 0;
                    ++arg0.field1742;
                }
                if (arg0.field1742 >= var4.field68) {
                    arg0.field1743 = 0;
                    arg0.field1742 = 0;
                }
            }
            if (arg0.field1747 != -1 && field147 >= arg0.field1750) {
                if (arg0.field1748 < 0) {
                    arg0.field1748 = 0;
                }
                class5 var5 = class62.field1570[arg0.field1747].field1574;
                ++arg0.field1749;
                while (arg0.field1748 < var5.field68 && arg0.field1749 > var5.method27(arg0.field1748, (byte) -127)) {
                    arg0.field1749 -= var5.method27(arg0.field1748, (byte) -127);
                    ++arg0.field1748;
                }
                if (arg0.field1748 >= var5.field68 && (arg0.field1748 < 0 || arg0.field1748 >= var5.field68)) {
                    arg0.field1747 = -1;
                }
            }
            if (arg0.field1694 != -1 && arg0.field1697 <= 1) {
                class5 var6 = class5.field67[arg0.field1694];
                if (var6.field79 == 1 && arg0.field1693 > 0 && arg0.field1728 <= field147 && arg0.field1729 < field147) {
                    arg0.field1697 = 1;
                    return;
                }
            }
            if (arg0.field1694 != -1 && arg0.field1697 == 0) {
                class5 var7 = class5.field67[arg0.field1694];
                ++arg0.field1696;
                while (arg0.field1695 < var7.field68 && arg0.field1696 > var7.method27(arg0.field1695, (byte) -127)) {
                    arg0.field1696 -= var7.method27(arg0.field1695, (byte) -127);
                    ++arg0.field1695;
                }
                if (arg0.field1695 >= var7.field68) {
                    arg0.field1695 -= var7.field72;
                    ++arg0.field1698;
                    if (arg0.field1698 >= var7.field78) {
                        arg0.field1694 = -1;
                    }
                    if (arg0.field1695 < 0 || arg0.field1695 >= var7.field68) {
                        arg0.field1694 = -1;
                    }
                }
                arg0.field1699 = var7.field74;
            }
            if (arg0.field1697 > 0) {
                --arg0.field1697;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method67(boolean arg0) {
        this.field529 &= arg0;
        if (this.field419 == -1 || this.field180 != 2 && super.field1050 == null) {
            if (this.field177) {
                this.method73(this.field366);
                this.field177 = false;
                this.field148.method581(0, 4, -41725, super.field1049);
                this.field149.method581(0, 357, -41725, super.field1049);
                this.field150.method581(722, 4, -41725, super.field1049);
                this.field151.method581(743, 205, -41725, super.field1049);
                this.field152.method581(0, 0, -41725, super.field1049);
                this.field153.method581(516, 4, -41725, super.field1049);
                this.field154.method581(516, 205, -41725, super.field1049);
                this.field155.method581(496, 357, -41725, super.field1049);
                this.field156.method581(0, 338, -41725, super.field1049);
                this.field284 = true;
                this.field365 = true;
                this.field186 = true;
                this.field559 = true;
                if (this.field180 != 2) {
                    this.field361.method581(4, 4, -41725, super.field1049);
                    this.field360.method581(550, 4, -41725, super.field1049);
                }
            }
            if (this.field180 == 2) {
                this.method111(2);
            }
            if (this.field528 && this.field463 == 1) {
                this.field284 = true;
            }
            if (this.field347 != -1) {
                boolean var4 = this.method108(375, this.field113, this.field347);
                if (var4) {
                    this.field284 = true;
                }
            }
            if (this.field293 == 2) {
                this.field284 = true;
            }
            if (this.field343 == 2) {
                this.field284 = true;
            }
            if (this.field284) {
                this.method44((byte) 5);
                this.field284 = false;
            }
            if (this.field310 == -1) {
                this.field330.field1181 = this.field469 - this.field348 - 77;
                if (super.field1057 > 448 && super.field1057 < 560 && super.field1058 > 332) {
                    this.method52(77, this.field330, 0, this.field469, -1, super.field1058 - 357, super.field1057 - 17, 463, (byte) 125);
                }
                int var5 = this.field469 - 77 - this.field330.field1181;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field469 - 77) {
                    var5 = this.field469 - 77;
                }
                if (this.field348 != var5) {
                    this.field348 = var5;
                    this.field365 = true;
                }
            }
            if (this.field310 != -1) {
                boolean var6 = this.method108(375, this.field113, this.field310);
                if (var6) {
                    this.field365 = true;
                }
            }
            if (this.field293 == 3) {
                this.field365 = true;
            }
            if (this.field343 == 3) {
                this.field365 = true;
            }
            if (this.field539 != null) {
                this.field365 = true;
            }
            if (this.field528 && this.field463 == 2) {
                this.field365 = true;
            }
            if (this.field365) {
                this.method171(this.field462);
                this.field365 = false;
            }
            if (this.field180 == 2) {
                this.method167(true);
                this.field360.method581(550, 4, -41725, super.field1049);
            }
            if (this.field163 != -1) {
                this.field186 = true;
            }
            if (this.field186) {
                if (this.field163 != -1 && this.field163 == this.field122) {
                    this.field163 = -1;
                    this.field533.method250(1, 125);
                    this.field533.method251(this.field122);
                }
                this.field186 = false;
                this.field239.method580(true);
                this.field326.method183(7964, 0, 0);
                if (this.field347 == -1) {
                    if (this.field378[this.field122] != -1) {
                        if (this.field122 == 0) {
                            this.field430.method183(7964, 10, 22);
                        }
                        if (this.field122 == 1) {
                            this.field431.method183(7964, 8, 54);
                        }
                        if (this.field122 == 2) {
                            this.field431.method183(7964, 8, 82);
                        }
                        if (this.field122 == 3) {
                            this.field432.method183(7964, 8, 110);
                        }
                        if (this.field122 == 4) {
                            this.field434.method183(7964, 8, 153);
                        }
                        if (this.field122 == 5) {
                            this.field434.method183(7964, 8, 181);
                        }
                        if (this.field122 == 6) {
                            this.field433.method183(7964, 9, 209);
                        }
                    }
                    if (this.field378[0] != -1 && (this.field163 != 0 || field147 % 20 < 10)) {
                        this.field429[0].method183(7964, 13, 29);
                    }
                    if (this.field378[1] != -1 && (this.field163 != 1 || field147 % 20 < 10)) {
                        this.field429[1].method183(7964, 11, 53);
                    }
                    if (this.field378[2] != -1 && (this.field163 != 2 || field147 % 20 < 10)) {
                        this.field429[2].method183(7964, 11, 82);
                    }
                    if (this.field378[3] != -1 && (this.field163 != 3 || field147 % 20 < 10)) {
                        this.field429[3].method183(7964, 12, 115);
                    }
                    if (this.field378[4] != -1 && (this.field163 != 4 || field147 % 20 < 10)) {
                        this.field429[4].method183(7964, 13, 153);
                    }
                    if (this.field378[5] != -1 && (this.field163 != 5 || field147 % 20 < 10)) {
                        this.field429[5].method183(7964, 11, 180);
                    }
                    if (this.field378[6] != -1 && (this.field163 != 6 || field147 % 20 < 10)) {
                        this.field429[6].method183(7964, 13, 208);
                    }
                }
                this.field239.method581(516, 160, -41725, super.field1049);
                this.field238.method580(true);
                this.field325.method183(7964, 0, 0);
                if (this.field347 == -1) {
                    if (this.field378[this.field122] != -1) {
                        if (this.field122 == 7) {
                            this.field479.method183(7964, 0, 42);
                        }
                        if (this.field122 == 8) {
                            this.field480.method183(7964, 0, 74);
                        }
                        if (this.field122 == 9) {
                            this.field480.method183(7964, 0, 102);
                        }
                        if (this.field122 == 10) {
                            this.field481.method183(7964, 1, 130);
                        }
                        if (this.field122 == 11) {
                            this.field483.method183(7964, 0, 173);
                        }
                        if (this.field122 == 12) {
                            this.field483.method183(7964, 0, 201);
                        }
                        if (this.field122 == 13) {
                            this.field482.method183(7964, 0, 229);
                        }
                    }
                    if (this.field378[8] != -1 && (this.field163 != 8 || field147 % 20 < 10)) {
                        this.field429[7].method183(7964, 2, 74);
                    }
                    if (this.field378[9] != -1 && (this.field163 != 9 || field147 % 20 < 10)) {
                        this.field429[8].method183(7964, 3, 102);
                    }
                    if (this.field378[10] != -1 && (this.field163 != 10 || field147 % 20 < 10)) {
                        this.field429[9].method183(7964, 4, 137);
                    }
                    if (this.field378[11] != -1 && (this.field163 != 11 || field147 % 20 < 10)) {
                        this.field429[10].method183(7964, 2, 174);
                    }
                    if (this.field378[12] != -1 && (this.field163 != 12 || field147 % 20 < 10)) {
                        this.field429[11].method183(7964, 2, 201);
                    }
                    if (this.field378[13] != -1 && (this.field163 != 13 || field147 % 20 < 10)) {
                        this.field429[12].method183(7964, 2, 226);
                    }
                }
                this.field238.method581(496, 466, -41725, super.field1049);
                this.field361.method580(true);
                class49.field1363 = this.field563;
            }
            if (this.field559) {
                this.field559 = false;
                this.field237.method580(true);
                this.field324.method183(7964, 0, 0);
                this.field192.method527(28, 16777215, 55, true, true, "Public chat");
                if (this.field497 == 0) {
                    this.field192.method527(41, 65280, 55, true, true, "On");
                }
                if (this.field497 == 1) {
                    this.field192.method527(41, 16776960, 55, true, true, "Friends");
                }
                if (this.field497 == 2) {
                    this.field192.method527(41, 16711680, 55, true, true, "Off");
                }
                if (this.field497 == 3) {
                    this.field192.method527(41, 65535, 55, true, true, "Hide");
                }
                this.field192.method527(28, 16777215, 184, true, true, "Private chat");
                if (this.field369 == 0) {
                    this.field192.method527(41, 65280, 184, true, true, "On");
                }
                if (this.field369 == 1) {
                    this.field192.method527(41, 16776960, 184, true, true, "Friends");
                }
                if (this.field369 == 2) {
                    this.field192.method527(41, 16711680, 184, true, true, "Off");
                }
                this.field192.method527(28, 16777215, 324, true, true, "Trade/compete");
                if (this.field383 == 0) {
                    this.field192.method527(41, 65280, 324, true, true, "On");
                }
                if (this.field383 == 1) {
                    this.field192.method527(41, 16776960, 324, true, true, "Friends");
                }
                if (this.field383 == 2) {
                    this.field192.method527(41, 16711680, 324, true, true, "Off");
                }
                this.field192.method527(33, 16777215, 458, true, true, "Report abuse");
                this.field237.method581(0, 453, -41725, super.field1049);
                this.field361.method580(true);
                class49.field1363 = this.field563;
            }
            this.field113 = 0;
        } else {
            if (this.field180 == 2) {
                this.method108(375, this.field113, this.field419);
                if (this.field402 != -1) {
                    this.method108(375, this.field113, this.field402);
                }
                this.field113 = 0;
                this.method54(-504);
                super.field1050.method580(true);
                class49.field1363 = this.field564;
                class35.method383((byte) 6);
                this.field177 = true;
                class41 var2 = class41.method477(this.field419);
                if (var2.field1212 == 512 && var2.field1238 == 334 && var2.field1199 == 0) {
                    var2.field1212 = 765;
                    var2.field1238 = 503;
                }
                this.method148(0, 9538, 0, 0, var2);
                if (this.field402 != -1) {
                    class41 var3 = class41.method477(this.field402);
                    if (var3.field1212 == 512 && var3.field1238 == 334 && var3.field1199 == 0) {
                        var3.field1212 = 765;
                        var3.field1238 = 503;
                    }
                    this.method148(0, 9538, 0, 0, var3);
                }
                if (!this.field528) {
                    this.method41((byte) 9);
                    this.method105((byte) 5);
                } else {
                    this.method58(0);
                }
            }
            super.field1050.method581(0, 0, -41725, super.field1049);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method68(int arg0, int arg1) {
        signlink.wavevol = arg0;
        this.field224 += arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEGCCHUZS;II)V")
    private final void method69(class15 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            for (int var4 = 0; var4 < this.field263; ++var4) {
                int var5 = this.field264[var4];
                class6 var6 = this.field475[var5];
                int var7 = arg0.method261();
                if ((var7 & 4) != 0) {
                    var6.field1712 = arg0.method268();
                    var6.field1714 = 100;
                }
                if ((var7 & 128) != 0) {
                    var6.field1734 = arg0.method287(5);
                    if (var6.field1734 == 65535) {
                        var6.field1734 = -1;
                    }
                }
                if ((var7 & 64) != 0) {
                    int var8 = arg0.method261();
                    int var9 = arg0.method261();
                    var6.method593(field147, var9, var8, 9);
                    var6.field1708 = field147 + 300;
                    var6.field1709 = arg0.method281(true);
                    var6.field1710 = arg0.method281(true);
                }
                if ((var7 & 16) != 0) {
                    var6.field1747 = arg0.method263();
                    int var10 = arg0.method295(false);
                    var6.field1751 = var10 >> 16;
                    var6.field1750 = (var10 & 65535) + field147;
                    var6.field1748 = 0;
                    var6.field1749 = 0;
                    if (var6.field1750 > field147) {
                        var6.field1748 = -1;
                    }
                    if (var6.field1747 == 65535) {
                        var6.field1747 = -1;
                    }
                }
                if ((var7 & 8) != 0) {
                    int var11 = arg0.method289(0);
                    if (var11 == 65535) {
                        var11 = -1;
                    }
                    int var12 = arg0.method261();
                    if (var6.field1694 == var11 && var11 != -1) {
                        int var13 = class5.field67[var11].field81;
                        if (var13 == 1) {
                            var6.field1695 = 0;
                            var6.field1696 = 0;
                            var6.field1697 = var12;
                            var6.field1698 = 0;
                        }
                        if (var13 == 2) {
                            var6.field1698 = 0;
                        }
                    } else if (var11 == -1 || var6.field1694 == -1 || class5.field67[var11].field75 >= class5.field67[var6.field1694].field75) {
                        var6.field1694 = var11;
                        var6.field1695 = 0;
                        var6.field1696 = 0;
                        var6.field1697 = var12;
                        var6.field1698 = 0;
                        var6.field1693 = var6.field1701;
                    }
                }
                if ((var7 & 32) != 0) {
                    int var14 = arg0.method261();
                    int var15 = arg0.method261();
                    var6.method593(field147, var15, var14, 9);
                    var6.field1708 = field147 + 300;
                    var6.field1709 = arg0.method280(true);
                    var6.field1710 = arg0.method261();
                }
                if ((var7 & 1) != 0) {
                    var6.field1737 = arg0.method289(0);
                    var6.field1738 = arg0.method288(-36835);
                }
                if ((var7 & 2) != 0) {
                    var6.field86 = class2.method9(arg0.method287(5));
                    var6.field1717 = var6.field86.field18;
                    var6.field1716 = var6.field86.field10;
                    var6.field1702 = var6.field86.field14;
                    var6.field1703 = var6.field86.field16;
                    var6.field1704 = var6.field86.field36;
                    var6.field1705 = var6.field86.field23;
                    var6.field1718 = var6.field86.field31;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZIII)V")
    private final void method70(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            this.field407 = 89;
        }
        if (arg7 >= 1 && arg5 >= 1 && arg7 <= 102 && arg5 <= 102) {
            if (field130 && this.field367 != arg1) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field208.method440(arg1, arg7, arg5);
            }
            if (arg3 == 1) {
                var9 = this.field208.method441(true, arg5, arg7, arg1);
            }
            if (arg3 == 2) {
                var9 = this.field208.method442(arg1, arg7, arg5);
            }
            if (arg3 == 3) {
                var9 = this.field208.method443(arg1, arg7, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field208.method444(arg1, arg7, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field208.method431(29266, arg1, arg5, arg7);
                    class27 var17 = class27.method326(var14);
                    if (var17.field855) {
                        this.field120[arg1].method17(this.field396, var15, arg5, arg7, var17.field863, var16);
                    }
                }
                if (arg3 == 1) {
                    this.field208.method432(arg5, 0, arg1, arg7);
                }
                if (arg3 == 2) {
                    this.field208.method433(this.field478, arg5, arg1, arg7);
                    class27 var18 = class27.method326(var14);
                    if (var18.field851 + arg7 > 103 || var18.field851 + arg5 > 103 || var18.field832 + arg7 > 103 || var18.field832 + arg5 > 103) {
                        return;
                    }
                    if (var18.field855) {
                        this.field120[arg1].method18(var18.field832, var18.field863, arg7, var18.field851, true, arg5, var16);
                    }
                }
                if (arg3 == 3) {
                    this.field208.method434(arg5, false, arg7, arg1);
                    class27 var19 = class27.method326(var14);
                    if (var19.field855 && var19.field841) {
                        this.field120[arg1].method20(arg7, arg5, (byte) -58);
                    }
                }
            }
            if (arg6 >= 0) {
                int var20 = arg1;
                if (arg1 < 3 && (this.field443[1][arg7][arg5] & 2) == 2) {
                    var20 = arg1 + 1;
                }
                class43.method496(this.field208, this.field385, var20, arg0, arg6, this.field120[arg1], arg7, arg5, arg1, 0, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILEGCCHUZS;I)V")
    private final void method71(int arg0, class15 arg1, int arg2) {
        arg1.method271(false);
        int var4 = arg1.method272(8, (byte) 0);
        if (var4 < this.field476) {
            for (int var5 = var4; var5 < this.field476; ++var5) {
                this.field517[this.field516++] = this.field477[var5];
            }
        }
        if (var4 > this.field476) {
            signlink.reporterror(this.field123 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field476 = 0;
            if (arg0 >= 0) {
                this.field396 = this.field274.method522();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field477[var6];
                class6 var8 = this.field475[var7];
                int var9 = arg1.method272(1, (byte) 0);
                if (var9 == 0) {
                    this.field477[this.field476++] = var7;
                    var8.field1746 = field147;
                } else {
                    int var10 = arg1.method272(2, (byte) 0);
                    if (var10 == 0) {
                        this.field477[this.field476++] = var7;
                        var8.field1746 = field147;
                        this.field264[this.field263++] = var7;
                    } else if (var10 == 1) {
                        this.field477[this.field476++] = var7;
                        var8.field1746 = field147;
                        int var11 = arg1.method272(3, (byte) 0);
                        var8.method594(this.field289, false, var11);
                        int var12 = arg1.method272(1, (byte) 0);
                        if (var12 == 1) {
                            this.field264[this.field263++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field477[this.field476++] = var7;
                        var8.field1746 = field147;
                        int var13 = arg1.method272(3, (byte) 0);
                        var8.method594(this.field289, true, var13);
                        int var14 = arg1.method272(3, (byte) 0);
                        var8.method594(this.field289, true, var14);
                        int var15 = arg1.method272(1, (byte) 0);
                        if (var15 == 1) {
                            this.field264[this.field263++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field517[this.field516++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method72(int arg0, int arg1) {
        if (arg1 != 42769) {
            throw new NullPointerException();
        } else {
            return arg0 < 999999999 ? String.valueOf(arg0) : "*";
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method73(int arg0) {
        if (this.field362 == null) {
            this.method173(this.field356);
            super.field1050 = null;
            this.field447 = null;
            this.field448 = null;
            this.field449 = null;
            this.field450 = null;
            this.field451 = null;
            this.field452 = null;
            this.field453 = null;
            this.field454 = null;
            this.field455 = null;
            this.field362 = new class68(this.method139(field535), true, 479, 96);
            this.field360 = new class68(this.method139(field535), true, 172, 156);
            class35.method383((byte) 6);
            this.field389.method183(7964, 0, 0);
            this.field359 = new class68(this.method139(field535), true, 190, 261);
            this.field361 = new class68(this.method139(field535), true, 512, 334);
            class35.method383((byte) 6);
            this.field237 = new class68(this.method139(field535), true, 496, 50);
            this.field238 = new class68(this.method139(field535), true, 269, 37);
            this.field239 = new class68(this.method139(field535), true, 249, 45);
            this.field177 = true;
            if (arg0 < 2 || arg0 > 2) {
                this.field533.method251(44);
            }
            this.field361.method580(true);
            class49.field1363 = this.field563;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
    public final void method74(String arg0, int arg1, String arg2, boolean arg3) {
        if (arg1 == 0 && this.field468 != -1) {
            this.field539 = arg2;
            super.field1063 = 0;
        }
        if (this.field310 == -1) {
            this.field365 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field555[var5] = this.field555[var5 - 1];
            this.field556[var5] = this.field556[var5 - 1];
            this.field557[var5] = this.field557[var5 - 1];
        }
        if (!arg3) {
            this.field304 = 464;
        }
        this.field555[0] = arg1;
        this.field556[0] = arg0;
        this.field557[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method75(boolean arg0, int arg1, int arg2) {
        if (arg1 == -28023) {
            signlink.midivol = arg2;
            if (arg0) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILEGCCHUZS;I)V")
    private final void method76(int arg0, class15 arg1, int arg2) {
        while (true) {
            if (arg1.field710 + 21 < arg2 * 8) {
                int var4 = arg1.method272(14, (byte) 0);
                if (var4 != 16383) {
                    if (this.field475[var4] == null) {
                        this.field475[var4] = new class6();
                    }
                    class6 var5 = this.field475[var4];
                    this.field477[this.field476++] = var4;
                    var5.field1746 = field147;
                    int var6 = arg1.method272(1, (byte) 0);
                    var5.field86 = class2.method9(arg1.method272(12, (byte) 0));
                    int var7 = arg1.method272(1, (byte) 0);
                    if (var7 == 1) {
                        this.field264[this.field263++] = var4;
                    }
                    int var8 = arg1.method272(5, (byte) 0);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method272(5, (byte) 0);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field1717 = var5.field86.field18;
                    var5.field1716 = var5.field86.field10;
                    var5.field1702 = var5.field86.field14;
                    var5.field1703 = var5.field86.field16;
                    var5.field1704 = var5.field86.field36;
                    var5.field1705 = var5.field86.field23;
                    var5.field1718 = var5.field86.field31;
                    var5.method591(var6 == 1, field255.field1707[0] + var9, -15802, field255.field1706[0] + var8);
                    continue;
                }
            }
            arg1.method273((byte) -2);
            int var10 = 6 / arg0;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Z")
    public final boolean method77(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var4 = this.field269[arg1];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 342;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method78(byte arg0, boolean arg1) {
        if (arg0 != 59) {
            this.field225 = this.field199.method261();
        }
        if (field255.field1721 >> 7 == this.field567 && field255.field1722 >> 7 == this.field568) {
            this.field567 = 0;
        }
        int var3 = this.field261;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class53 var5;
            int var6;
            if (arg1) {
                var5 = field255;
                var6 = this.field259 << 14;
            } else {
                var5 = this.field260[this.field262[var4]];
                var6 = this.field262[var4] << 14;
            }
            if (var5 != null && var5.method29(true)) {
                var5.field1464 = false;
                if ((field130 && this.field261 > 50 || this.field261 > 200) && !arg1 && var5.field1741 == var5.field1718) {
                    var5.field1464 = true;
                }
                int var7 = var5.field1721 >> 7;
                int var8 = var5.field1722 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1458 != null && field147 >= var5.field1451 && field147 < var5.field1452) {
                        var5.field1464 = false;
                        var5.field1461 = this.method152(var5.field1721, 0, var5.field1722, this.field367);
                        this.field208.method426(var5.field1443, 60, var6, var5, false, var5.field1722, this.field367, var5.field1721, var5.field1723, var5.field1461, var5.field1441, var5.field1440, var5.field1442);
                    } else {
                        if ((var5.field1721 & 127) == 64 && (var5.field1722 & 127) == 64) {
                            if (this.field420[var7][var8] == this.field540) {
                                continue;
                            }
                            this.field420[var7][var8] = this.field540;
                        }
                        var5.field1461 = this.method152(var5.field1721, 0, var5.field1722, this.field367);
                        this.field208.method425(60, var5.field1699, 34, var5.field1722, var5, var5.field1461, var5.field1721, this.field367, var6, var5.field1723);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILHOSNGCXH;B)V")
    public final void method79(int arg0, int arg1, class28 arg2, byte arg3) {
        int var5 = this.field485 + this.field106 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = class32.field1001[var5];
            int var8 = class32.field1002[var5];
            int var9 = var7 * 256 / (this.field158 + 256);
            if (arg3 != 87) {
                this.method151();
            }
            int var10 = var8 * 256 / (this.field158 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method341(var11 + 94 - arg2.field884 / 2 + 4, this.field389, (byte) -8, 83 - var12 - arg2.field885 / 2 - 4);
            } else {
                arg2.method335(7964, 83 - var12 - arg2.field885 / 2 - 4, var11 + 94 - arg2.field884 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method80(boolean arg0) {
        try {
            if (this.field399 != null) {
                this.field399.method543();
            }
        } catch (Exception var3) {
        }
        this.field399 = null;
        this.field529 = false;
        this.field234 = 0;
        this.field123 = "";
        this.field529 &= arg0;
        this.field124 = "";
        this.method59(17519);
        this.field208.method414(-2562);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field120[var2].method12();
        }
        System.gc();
        this.method145(177);
        this.field346 = -1;
        this.field565 = -1;
        this.field505 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method81(String arg0, int arg1, String arg2) {
        this.field224 += arg1;
        if (this.field361 != null) {
            this.field361.method580(true);
            class49.field1363 = this.field563;
            int var4 = 151;
            if (arg2 != null) {
                var4 -= 7;
            }
            this.field192.method526(0, 3, var4, 257, arg0);
            this.field192.method526(16777215, 3, var4 - 1, 256, arg0);
            var4 += 15;
            if (arg2 != null) {
                this.field192.method526(0, 3, var4, 257, arg2);
                this.field192.method526(16777215, 3, var4 - 1, 256, arg2);
            }
            this.field361.method581(4, 4, -41725, super.field1049);
        } else if (super.field1050 != null) {
            super.field1050.method580(true);
            class49.field1363 = this.field564;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class35.method385(var5 - 5 - var7 / 2, var6, var7, 383 - var6 / 2, (byte) 5, 0);
            class35.method386(var6, var7, this.field278, 16777215, 383 - var6 / 2, var5 - 5 - var7 / 2);
            if (arg2 != null) {
                var5 -= 7;
            }
            this.field192.method526(0, 3, var5, 383, arg0);
            this.field192.method526(16777215, 3, var5 - 1, 382, arg0);
            var5 += 15;
            if (arg2 != null) {
                this.field192.method526(0, 3, var5, 383, arg2);
                this.field192.method526(16777215, 3, var5 - 1, 382, arg2);
            }
            super.field1050.method581(0, 0, -41725, super.field1049);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method82(int arg0) {
        this.field224 += arg0;
        Graphics var2 = this.method139(field535).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method411((byte) 4, 1);
        if (this.field161) {
            this.field219 = false;
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
        if (this.field460) {
            this.field219 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field323) {
            this.field219 = false;
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

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        if (this.field312 != 0) {
            class55 var2 = this.field192;
            this.field529 &= arg0;
            int var3 = 0;
            if (this.field571 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field557[var4] != null) {
                    int var5 = this.field555[var4];
                    String var6 = this.field556[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field369 == 0 || this.field369 == 1 && this.method91(false, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method530(var8, "From", var9, 0, 411);
                        var2.method530(var8 - 1, "From", var9, 65535, 411);
                        int var10 = var9 + var2.method528("From ", 555);
                        if (var7 == 1) {
                            this.field121[0].method183(7964, var8 - 12, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field121[1].method183(7964, var8 - 12, var10);
                            var10 += 14;
                        }
                        var2.method530(var8, var6 + ": " + this.field557[var4], var10, 0, 411);
                        var2.method530(var8 - 1, var6 + ": " + this.field557[var4], var10, 65535, 411);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field369 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method530(var11, this.field557[var4], 4, 0, 411);
                        var2.method530(var11 - 1, this.field557[var4], 4, 65535, 411);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field369 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method530(var12, "To " + var6 + ": " + this.field557[var4], 4, 0, 411);
                        var2.method530(var12 - 1, "To " + var6 + ": " + this.field557[var4], 4, 65535, 411);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLORGYGVM;B)V")
    public final void method84(class41 arg0, byte arg1) {
        int var3 = arg0.field1211;
        if (arg1 != -22) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field223 == 0) {
                arg0.field1245 = "Loading friend list";
                arg0.field1217 = 0;
            } else if (var3 == 1 && this.field223 == 1) {
                arg0.field1245 = "Connecting to friendserver";
                arg0.field1217 = 0;
            } else if (var3 == 2 && this.field223 != 2) {
                arg0.field1245 = "Please wait...";
                arg0.field1217 = 0;
            } else {
                int var5 = this.field222;
                if (this.field223 != 2) {
                    var5 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var5) {
                    arg0.field1245 = "";
                    arg0.field1217 = 0;
                } else {
                    arg0.field1245 = this.field574[var3];
                    arg0.field1217 = 1;
                }
            }
        } else if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
            int var6 = this.field222;
            if (this.field223 != 2) {
                var6 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var6) {
                arg0.field1245 = "";
                arg0.field1217 = 0;
            } else {
                if (this.field144[var3] == 0) {
                    arg0.field1245 = "@red@Offline";
                } else if (this.field144[var3] < 200) {
                    if (this.field144[var3] == field127) {
                        arg0.field1245 = "@gre@World-" + (this.field144[var3] - 9);
                    } else {
                        arg0.field1245 = "@yel@World-" + (this.field144[var3] - 9);
                    }
                } else if (this.field144[var3] == field127) {
                    arg0.field1245 = "@gre@Classic" + (this.field144[var3] - 219);
                } else {
                    arg0.field1245 = "@yel@Classic" + (this.field144[var3] - 219);
                }
                arg0.field1217 = 1;
            }
        } else if (var3 == 203) {
            int var7 = this.field222;
            if (this.field223 != 2) {
                var7 = 0;
            }
            arg0.field1202 = var7 * 15 + 20;
            if (arg0.field1202 <= arg0.field1238) {
                arg0.field1202 = arg0.field1238 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 == 0 && this.field223 == 0) {
                arg0.field1245 = "Loading ignore list";
                arg0.field1217 = 0;
            } else if (var3 == 1 && this.field223 == 0) {
                arg0.field1245 = "Please wait...";
                arg0.field1217 = 0;
            } else {
                int var8 = this.field322;
                if (this.field223 == 0) {
                    var8 = 0;
                }
                if (var3 >= var8) {
                    arg0.field1245 = "";
                    arg0.field1217 = 0;
                } else {
                    arg0.field1245 = class67.method578(class67.method575(false, this.field421[var3]), (byte) -85);
                    arg0.field1217 = 1;
                }
            }
        } else if (var3 == 503) {
            arg0.field1202 = this.field322 * 15 + 20;
            if (arg0.field1202 <= arg0.field1238) {
                arg0.field1202 = arg0.field1238 + 1;
            }
        } else if (var3 == 327) {
            arg0.field1189 = 150;
            arg0.field1190 = (int) (Math.sin((double) field147 / 40.0D) * 256.0D) & 2047;
            if (this.field140) {
                for (int var9 = 0; var9 < 7; ++var9) {
                    int var16 = this.field171[var9];
                    if (var16 >= 0 && !class72.field1755[var16].method597((byte) 108)) {
                        return;
                    }
                }
                this.field140 = false;
                class32[] var10 = new class32[7];
                int var11 = 0;
                for (int var12 = 0; var12 < 7; ++var12) {
                    int var15 = this.field171[var12];
                    if (var15 >= 0) {
                        var10[var11++] = class72.field1755[var15].method598(this.field205);
                    }
                }
                class32 var13 = new class32(true, var11, var10);
                for (int var14 = 0; var14 < 5; ++var14) {
                    if (this.field428[var14] != 0) {
                        var13.method368(field444[var14][0], field444[var14][this.field428[var14]]);
                        if (var14 == 1) {
                            var13.method368(field526[0], field526[this.field428[var14]]);
                        }
                    }
                }
                var13.method361(6);
                var13.method362(33114, class5.field67[field255.field1718].field69[0]);
                var13.method371(64, 850, -30, -50, -30, true);
                arg0.field1175 = 5;
                arg0.field1176 = 0;
                class41.method476(var13, 8, 5, 0);
            }
        } else if (var3 == 324) {
            if (this.field551 == null) {
                this.field551 = arg0.field1227;
                this.field552 = arg0.field1186;
            }
            if (this.field266) {
                arg0.field1227 = this.field552;
            } else {
                arg0.field1227 = this.field551;
            }
        } else if (var3 == 325) {
            if (this.field551 == null) {
                this.field551 = arg0.field1227;
                this.field552 = arg0.field1186;
            }
            if (this.field266) {
                arg0.field1227 = this.field551;
            } else {
                arg0.field1227 = this.field552;
            }
        } else if (var3 == 600) {
            arg0.field1245 = this.field213;
            if (field147 % 20 < 10) {
                arg0.field1245 = arg0.field1245 + "|";
            } else {
                arg0.field1245 = arg0.field1245 + " ";
            }
        } else {
            if (var3 == 620) {
                if (this.field305 >= 1) {
                    if (this.field490) {
                        arg0.field1229 = 16711680;
                        arg0.field1245 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field1229 = 16777215;
                        arg0.field1245 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field1245 = "";
                }
            }
            if (var3 == 660) {
                int var17 = this.field135 - this.field203;
                String var18;
                if (var17 <= 0) {
                    var18 = "earlier today";
                } else if (var17 == 1) {
                    var18 = "yesterday";
                } else {
                    var18 = var17 + " days ago";
                }
                arg0.field1245 = "You last logged in @red@" + var18 + "@bla@ from: @red@" + signlink.dns;
            }
            if (var3 == 661) {
                if (this.field141 == 0) {
                    arg0.field1245 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                } else if (this.field141 <= this.field135) {
                    arg0.field1245 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method85(this.field141, false);
                } else {
                    int var19 = this.field135 + 14 - this.field141;
                    String var20;
                    if (var19 <= 0) {
                        var20 = "Earlier today";
                    } else if (var19 == 1) {
                        var20 = "Yesterday";
                    } else {
                        var20 = var19 + " days ago";
                    }
                    arg0.field1245 = var20 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method85(this.field141, false) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                }
            }
            if (var3 == 662) {
                String var21;
                if (this.field418 == 0) {
                    var21 = "@yel@0 unread messages";
                } else if (this.field418 == 1) {
                    var21 = "@gre@1 unread message";
                } else {
                    var21 = "@gre@" + this.field418 + " unread messages";
                }
                arg0.field1245 = "You have " + var21 + "\\nin your message centre.";
            }
            if (var3 == 663) {
                if (this.field297 > 0 && this.field297 <= this.field135 + 10) {
                    arg0.field1245 = "Last password change:\\n@gre@" + this.method85(this.field297, false);
                } else {
                    arg0.field1245 = "Last password change:\\n@gre@Never changed";
                }
            }
            if (var3 == 664) {
                if (this.field544 == 0) {
                    arg0.field1245 = "You have not yet set\\nany contact details.";
                }
                if (this.field544 == 1) {
                    arg0.field1245 = "Contact Details Last Set:\\n@gre@" + this.method85(this.field295, false);
                }
                if (this.field544 == 2) {
                    arg0.field1245 = "You need to set\\nnew contact details.";
                }
            }
            if (var3 == 665) {
                if (this.field200 > 2 && !field129) {
                    arg0.field1245 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                } else if (this.field200 > 2) {
                    arg0.field1245 = "\\n\\nYou have @gre@" + this.field200 + "@yel@ days of\\nmember credit remaining.";
                } else if (this.field200 > 0) {
                    arg0.field1245 = "You have @gre@" + this.field200 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                } else {
                    arg0.field1245 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                }
            }
            if (var3 == 667) {
                if (this.field200 > 2 && !field129) {
                    arg0.field1245 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                } else if (this.field200 > 0) {
                    arg0.field1245 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                } else {
                    arg0.field1245 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                }
            }
            if (var3 == 668) {
                if (this.field141 > this.field135) {
                    arg0.field1245 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                } else {
                    arg0.field1245 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    public final String method85(int arg0, boolean arg1) {
        if (arg0 > this.field135 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            if (arg1) {
                this.field279 = -332;
            }
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)Z")
    public final boolean method86(boolean arg0) {
        if (!arg0) {
            this.field533.method251(238);
        }
        if (this.field399 == null) {
            return false;
        } else {
            try {
                int var2 = this.field399.method545();
                if (var2 == 0) {
                    return false;
                }
                if (this.field225 == -1) {
                    this.field399.method546(this.field199.field708, 0, 1);
                    this.field225 = this.field199.field708[0] & 255;
                    if (this.field274 != null) {
                        this.field225 = this.field225 - this.field274.method522() & 255;
                    }
                    this.field224 = class25.field815[this.field225];
                    --var2;
                }
                if (this.field224 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field399.method546(this.field199.field708, 0, 1);
                    this.field224 = this.field199.field708[0] & 255;
                    --var2;
                }
                if (this.field224 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field399.method546(this.field199.field708, 0, 2);
                    this.field199.field709 = 0;
                    this.field224 = this.field199.method263();
                    var2 -= 2;
                }
                if (var2 < this.field224) {
                    return false;
                }
                this.field199.field709 = 0;
                this.field399.method546(this.field199.field708, 0, this.field224);
                this.field226 = 0;
                this.field185 = this.field184;
                this.field184 = this.field183;
                this.field183 = this.field225;
                if (this.field225 == 95) {
                    this.field223 = this.field199.method261();
                    this.field284 = true;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 21) {
                    boolean var3 = this.field199.method279(0) == 1;
                    int var4 = this.field199.method287(5);
                    class41.method477(var4).field1193 = var3;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 194) {
                    int var5 = this.field199.method289(0);
                    int var6 = this.field199.method287(5);
                    class41 var7 = class41.method477(var6);
                    if (var7 != null && var7.field1199 == 0) {
                        if (var5 < 0) {
                            var5 = 0;
                        }
                        if (var5 > var7.field1202 - var7.field1238) {
                            var5 = var7.field1202 - var7.field1238;
                        }
                        var7.field1181 = var5;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 195) {
                    int var8 = this.field199.method263();
                    int var9 = this.field199.method261();
                    int var10 = this.field199.method263();
                    if (this.field195 && !field130 && this.field382 < 50) {
                        this.field283[this.field382] = var8;
                        this.field181[this.field382] = var9;
                        this.field119[this.field382] = class20.field754[var8] + var10;
                        ++this.field382;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 40) {
                    this.field281 = this.field199.method261();
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 78) {
                    int var11 = this.field199.method261();
                    String var12 = this.field199.method268();
                    int var13 = this.field199.method281(true);
                    if (var11 >= 1 && var11 <= 5) {
                        if (var12.equalsIgnoreCase("null")) {
                            var12 = null;
                        }
                        this.field337[var11 - 1] = var12;
                        this.field338[var11 - 1] = var13 == 0;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 50) {
                    this.method80(true);
                    this.field225 = -1;
                    return false;
                }
                if (this.field225 == 60) {
                    int var14 = this.field199.method291((byte) 92);
                    int var15 = this.field199.method288(-36835);
                    class41 var16 = class41.method477(var15);
                    if (var16.field1209 != var14 || var14 == -1) {
                        var16.field1209 = var14;
                        var16.field1187 = 0;
                        var16.field1240 = 0;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 234) {
                    int var17 = this.field199.method289(0);
                    int var18 = this.field199.method295(false);
                    this.field372[var17] = var18;
                    if (this.field115[var17] != var18) {
                        this.field115[var17] = var18;
                        this.method88(false, var17);
                        this.field284 = true;
                        if (this.field468 != -1) {
                            this.field365 = true;
                        }
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 146) {
                    int var19 = this.field199.method289(0);
                    int var20 = this.field199.method287(5);
                    int var21 = this.field199.method288(-36835);
                    int var22 = this.field199.method287(5);
                    class41.method477(var20).field1189 = var19;
                    class41.method477(var20).field1190 = var22;
                    class41.method477(var20).field1188 = var21;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 115) {
                    int var23 = this.field199.method288(-36835);
                    byte var24 = this.field199.method282((byte) -95);
                    this.field372[var23] = var24;
                    if (this.field115[var23] != var24) {
                        this.field115[var23] = var24;
                        this.method88(false, var23);
                        this.field284 = true;
                        if (this.field468 != -1) {
                            this.field365 = true;
                        }
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 32) {
                    this.field567 = 0;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 149) {
                    this.method39(1, this.field199, this.field224);
                    this.field579 = false;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 215) {
                    int var25 = this.field199.method290(false);
                    int var26 = this.field199.method289(0);
                    int var27 = this.field199.method292(0);
                    class41 var28 = class41.method477(var26);
                    var28.field1239 = var27;
                    var28.field1230 = var25;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 180) {
                    this.field163 = this.field199.method261();
                    if (this.field163 == this.field122) {
                        if (this.field163 == 3) {
                            this.field122 = 1;
                        } else {
                            this.field122 = 3;
                        }
                        this.field284 = true;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 57) {
                    int var29 = this.field199.method287(5);
                    this.method124(true, var29);
                    if (this.field347 != -1) {
                        this.method53(this.field347, (byte) -104);
                        this.field347 = -1;
                        this.field284 = true;
                        this.field186 = true;
                    }
                    if (this.field310 != -1) {
                        this.method53(this.field310, (byte) -104);
                        this.field310 = -1;
                        this.field365 = true;
                    }
                    if (this.field419 != -1) {
                        this.method53(this.field419, (byte) -104);
                        this.field419 = -1;
                        this.field177 = true;
                    }
                    if (this.field402 != -1) {
                        this.method53(this.field402, (byte) -104);
                        this.field402 = -1;
                    }
                    if (this.field254 != var29) {
                        this.method53(this.field254, (byte) -104);
                        this.field254 = var29;
                    }
                    if (this.field498 != 0) {
                        this.field498 = 0;
                        this.field365 = true;
                    }
                    this.field99 = false;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 27) {
                    if (this.field347 != -1) {
                        this.method53(this.field347, (byte) -104);
                        this.field347 = -1;
                        this.field284 = true;
                        this.field186 = true;
                    }
                    if (this.field310 != -1) {
                        this.method53(this.field310, (byte) -104);
                        this.field310 = -1;
                        this.field365 = true;
                    }
                    if (this.field419 != -1) {
                        this.method53(this.field419, (byte) -104);
                        this.field419 = -1;
                        this.field177 = true;
                    }
                    if (this.field402 != -1) {
                        this.method53(this.field402, (byte) -104);
                        this.field402 = -1;
                    }
                    if (this.field254 != -1) {
                        this.method53(this.field254, (byte) -104);
                        this.field254 = -1;
                    }
                    if (this.field498 != 0) {
                        this.field498 = 0;
                        this.field365 = true;
                    }
                    this.field99 = false;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 58) {
                    this.field122 = this.field199.method280(true);
                    this.field284 = true;
                    this.field186 = true;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 212) {
                    int var30 = this.field199.method288(-36835);
                    String var31 = this.field199.method268();
                    class41.method477(var30).field1245 = var31;
                    int var10001 = this.field378[this.field122];
                    if (class41.method477(var30).field1205 == var10001) {
                        this.field284 = true;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 2) {
                    int var32 = this.field199.method289(0);
                    int var33 = this.field199.method289(0);
                    this.method124(true, var33);
                    if (var32 != -1) {
                        this.method124(true, var32);
                    }
                    if (this.field254 != -1) {
                        this.method53(this.field254, (byte) -104);
                        this.field254 = -1;
                    }
                    if (this.field347 != -1) {
                        this.method53(this.field347, (byte) -104);
                        this.field347 = -1;
                    }
                    if (this.field310 != -1) {
                        this.method53(this.field310, (byte) -104);
                        this.field310 = -1;
                    }
                    if (this.field419 != var33) {
                        this.method53(this.field419, (byte) -104);
                        this.field419 = var33;
                    }
                    if (this.field402 != var33) {
                        this.method53(this.field402, (byte) -104);
                        this.field402 = var32;
                    }
                    this.field498 = 0;
                    this.field99 = false;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 33) {
                    this.field427 = true;
                    this.field508 = this.field199.method261();
                    this.field509 = this.field199.method261();
                    this.field510 = this.field199.method263();
                    this.field511 = this.field199.method261();
                    this.field512 = this.field199.method261();
                    if (this.field512 >= 100) {
                        int var34 = this.field508 * 128 + 64;
                        int var35 = this.field509 * 128 + 64;
                        int var36 = this.method152(var34, 0, var35, this.field367) - this.field510;
                        int var37 = var34 - this.field410;
                        int var38 = var36 - this.field411;
                        int var39 = var35 - this.field412;
                        int var40 = (int) Math.sqrt((double) (var37 * var37 + var39 * var39));
                        this.field413 = (int) (Math.atan2((double) var38, (double) var40) * 325.949D) & 2047;
                        this.field414 = (int) (Math.atan2((double) var37, (double) var39) * -325.949D) & 2047;
                        if (this.field413 < 128) {
                            this.field413 = 128;
                        }
                        if (this.field413 > 383) {
                            this.field413 = 383;
                        }
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 138) {
                    this.field209 = this.field199.method279(0);
                    this.field210 = this.field199.method281(true);
                    while (this.field199.field709 < this.field224) {
                        int var41 = this.field199.method261();
                        this.method101(var41, true, this.field199);
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 44) {
                    int var42 = this.field199.method291((byte) 92);
                    if (var42 >= 0) {
                        this.method124(true, var42);
                    }
                    if (this.field553 != var42) {
                        this.method53(this.field553, (byte) -104);
                        this.field553 = var42;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 36) {
                    this.field284 = true;
                    int var43 = this.field199.method263();
                    class41 var44 = class41.method477(var43);
                    int var45 = this.field199.method263();
                    for (int var46 = 0; var46 < var45; ++var46) {
                        int var47 = this.field199.method261();
                        if (var47 == 255) {
                            var47 = this.field199.method296(this.field302);
                        }
                        var44.field1197[var46] = this.field199.method263();
                        var44.field1220[var46] = var47;
                    }
                    for (int var48 = var45; var48 < var44.field1197.length; ++var48) {
                        var44.field1197[var48] = 0;
                        var44.field1220[var48] = 0;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 209) {
                    long var49 = this.field199.method267(false);
                    int var51 = this.field199.method261();
                    String var52 = class67.method578(class67.method575(false, var49), (byte) -85);
                    for (int var53 = 0; var53 < this.field222; ++var53) {
                        if (this.field500[var53] == var49) {
                            if (this.field144[var53] != var51) {
                                this.field144[var53] = var51;
                                this.field284 = true;
                                if (var51 > 0) {
                                    this.method74("", 5, var52 + " has logged in.", true);
                                }
                                if (var51 == 0) {
                                    this.method74("", 5, var52 + " has logged out.", true);
                                }
                            }
                            var52 = null;
                            break;
                        }
                    }
                    if (var52 != null && this.field222 < 200) {
                        this.field500[this.field222] = var49;
                        this.field574[this.field222] = var52;
                        this.field144[this.field222] = var51;
                        ++this.field222;
                        this.field284 = true;
                    }
                    boolean var54 = false;
                    while (!var54) {
                        var54 = true;
                        for (int var55 = 0; var55 < this.field222 - 1; ++var55) {
                            if (this.field144[var55] != field127 && this.field144[var55 + 1] == field127 || this.field144[var55] == 0 && this.field144[var55 + 1] != 0) {
                                int var56 = this.field144[var55];
                                this.field144[var55] = this.field144[var55 + 1];
                                this.field144[var55 + 1] = var56;
                                String var57 = this.field574[var55];
                                this.field574[var55] = this.field574[var55 + 1];
                                this.field574[var55 + 1] = var57;
                                long var58 = this.field500[var55];
                                this.field500[var55] = this.field500[var55 + 1];
                                this.field500[var55 + 1] = var58;
                                this.field284 = true;
                                var54 = false;
                            }
                        }
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 205) {
                    this.field427 = false;
                    for (int var60 = 0; var60 < 5; ++var60) {
                        this.field230[var60] = false;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 193) {
                    if (this.field122 == 12) {
                        this.field284 = true;
                    }
                    this.field142 = this.field199.method264();
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 135) {
                    int var61 = this.field199.method263();
                    class41 var62 = class41.method477(var61);
                    for (int var63 = 0; var63 < var62.field1197.length; ++var63) {
                        var62.field1197[var63] = -1;
                        var62.field1197[var63] = 0;
                    }
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 223) {
                    int var64 = this.field199.method263();
                    int var65 = this.field199.method287(5);
                    int var66 = var65 >> 10 & 31;
                    int var67 = var65 >> 5 & 31;
                    int var68 = var65 & 31;
                    class41.method477(var64).field1229 = (var68 << 3) + (var66 << 19) + (var67 << 11);
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 225) {
                    this.field210 = this.field199.method280(true);
                    this.field209 = this.field199.method279(0);
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 116) {
                    int var69 = this.field199.method289(0);
                    int var70 = this.field199.method287(5);
                    class41.method477(var69).field1175 = 1;
                    class41.method477(var69).field1176 = var70;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 == 185) {
                    int var71 = this.field199.method263();
                    this.method124(true, var71);
                    if (this.field310 != -1) {
                        this.method53(this.field310, (byte) -104);
                        this.field310 = -1;
                        this.field365 = true;
                    }
                    if (this.field419 != -1) {
                        this.method53(this.field419, (byte) -104);
                        this.field419 = -1;
                        this.field177 = true;
                    }
                    if (this.field402 != -1) {
                        this.method53(this.field402, (byte) -104);
                        this.field402 = -1;
                    }
                    if (this.field254 != -1) {
                        this.method53(this.field254, (byte) -104);
                        this.field254 = -1;
                    }
                    if (this.field347 != var71) {
                        this.method53(this.field347, (byte) -104);
                        this.field347 = var71;
                    }
                    if (this.field498 != 0) {
                        this.field498 = 0;
                        this.field365 = true;
                    }
                    this.field284 = true;
                    this.field186 = true;
                    this.field99 = false;
                    this.field225 = -1;
                    return true;
                }
                if (this.field225 != 86 && this.field225 != 199 && this.field225 != 3 && this.field225 != 147 && this.field225 != 188 && this.field225 != 237 && this.field225 != 69 && this.field225 != 99 && this.field225 != 246 && this.field225 != 52 && this.field225 != 198) {
                    if (this.field225 == 68) {
                        this.field284 = true;
                        int var72 = this.field199.method279(0);
                        int var73 = this.field199.method280(true);
                        int var74 = this.field199.method297(0);
                        this.field403[var73] = var74;
                        this.field581[var73] = var72;
                        this.field164[var73] = 1;
                        for (int var75 = 0; var75 < 98; ++var75) {
                            if (var74 >= field189[var75]) {
                                this.field164[var73] = var75 + 2;
                            }
                        }
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 178) {
                        this.field518 = false;
                        this.field498 = 1;
                        this.field381 = "";
                        this.field365 = true;
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 168) {
                        this.field518 = false;
                        this.field498 = 2;
                        this.field381 = "";
                        this.field365 = true;
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 192) {
                        int var76 = this.field199.method288(-36835);
                        int var77 = this.field199.method289(0);
                        class41.method477(var77).field1175 = 2;
                        class41.method477(var77).field1176 = var76;
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 0) {
                        this.field427 = true;
                        this.field101 = this.field199.method261();
                        this.field102 = this.field199.method261();
                        this.field103 = this.field199.method263();
                        this.field104 = this.field199.method261();
                        this.field105 = this.field199.method261();
                        if (this.field105 >= 100) {
                            this.field410 = this.field101 * 128 + 64;
                            this.field412 = this.field102 * 128 + 64;
                            this.field411 = this.method152(this.field410, 0, this.field412, this.field367) - this.field103;
                        }
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 161) {
                        String var78 = this.field199.method268();
                        if (var78.endsWith(":tradereq:")) {
                            String var79 = var78.substring(0, var78.indexOf(":"));
                            long var80 = class67.method574(var79);
                            boolean var82 = false;
                            for (int var83 = 0; var83 < this.field322; ++var83) {
                                if (this.field421[var83] == var80) {
                                    var82 = true;
                                    break;
                                }
                            }
                            if (!var82 && this.field507 == 0) {
                                this.method74(var79, 4, "wishes to trade with you.", true);
                            }
                        } else if (var78.endsWith(":duelreq:")) {
                            String var84 = var78.substring(0, var78.indexOf(":"));
                            long var85 = class67.method574(var84);
                            boolean var87 = false;
                            for (int var88 = 0; var88 < this.field322; ++var88) {
                                if (this.field421[var88] == var85) {
                                    var87 = true;
                                    break;
                                }
                            }
                            if (!var87 && this.field507 == 0) {
                                this.method74(var84, 8, "wishes to duel with you.", true);
                            }
                        } else if (!var78.endsWith(":chalreq:")) {
                            this.method74("", 0, var78, true);
                        } else {
                            String var89 = var78.substring(0, var78.indexOf(":"));
                            long var90 = class67.method574(var89);
                            boolean var92 = false;
                            for (int var93 = 0; var93 < this.field322; ++var93) {
                                if (this.field421[var93] == var90) {
                                    var92 = true;
                                    break;
                                }
                            }
                            if (!var92 && this.field507 == 0) {
                                String var94 = var78.substring(var78.indexOf(":") + 1, var78.length() - 9);
                                this.method74(var89, 8, var94, true);
                            }
                        }
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 76) {
                        int var95 = this.field199.method287(5);
                        if (var95 == 65535) {
                            var95 = -1;
                        }
                        if (this.field346 != var95 && this.field501 && !field130 && this.field505 == 0) {
                            this.field565 = var95;
                            this.field566 = true;
                            this.field256.method228(2, this.field565);
                        }
                        this.field346 = var95;
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 71) {
                        int var96 = this.field199.method293(-364);
                        int var97 = this.field199.method287(5);
                        if (this.field501 && !field130) {
                            this.field565 = var97;
                            this.field566 = false;
                            this.field256.method228(2, this.field565);
                            this.field505 = var96;
                        }
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 238) {
                        this.method117(-23633, this.field199, this.field224);
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 94) {
                        int var98 = this.field199.method287(5);
                        int var99 = this.field199.method281(true);
                        if (var98 == 65535) {
                            var98 = -1;
                        }
                        if (this.field378[var99] != var98) {
                            this.method53(this.field378[var99], (byte) -104);
                            this.field378[var99] = var98;
                        }
                        this.field284 = true;
                        this.field186 = true;
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 20) {
                        this.field284 = true;
                        int var100 = this.field199.method263();
                        class41 var101 = class41.method477(var100);
                        while (this.field199.field709 < this.field224) {
                            int var102 = this.field199.method275();
                            int var103 = this.field199.method263();
                            int var104 = this.field199.method261();
                            if (var104 == 255) {
                                var104 = this.field199.method266();
                            }
                            if (var102 >= 0 && var102 < var101.field1197.length) {
                                var101.field1197[var102] = var103;
                                var101.field1220[var102] = var104;
                            }
                        }
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 171) {
                        if (this.field122 == 12) {
                            this.field284 = true;
                        }
                        this.field435 = this.field199.method261();
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 196) {
                        this.field298 = this.field199.method261();
                        if (this.field298 == 1) {
                            this.field313 = this.field199.method263();
                        }
                        if (this.field298 >= 2 && this.field298 <= 6) {
                            if (this.field298 == 2) {
                                this.field335 = 64;
                                this.field336 = 64;
                            }
                            if (this.field298 == 3) {
                                this.field335 = 0;
                                this.field336 = 64;
                            }
                            if (this.field298 == 4) {
                                this.field335 = 128;
                                this.field336 = 64;
                            }
                            if (this.field298 == 5) {
                                this.field335 = 64;
                                this.field336 = 0;
                            }
                            if (this.field298 == 6) {
                                this.field335 = 64;
                                this.field336 = 128;
                            }
                            this.field298 = 2;
                            this.field332 = this.field199.method263();
                            this.field333 = this.field199.method263();
                            this.field334 = this.field199.method261();
                        }
                        if (this.field298 == 10) {
                            this.field235 = this.field199.method263();
                        }
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 141) {
                        int var105 = this.field199.method292(0);
                        if (this.field468 != var105) {
                            this.method53(this.field468, (byte) -104);
                            this.field468 = var105;
                        }
                        this.field365 = true;
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 43) {
                        this.field210 = this.field199.method261();
                        this.field209 = this.field199.method280(true);
                        for (int var106 = this.field209; var106 < this.field209 + 8; ++var106) {
                            for (int var107 = this.field210; var107 < this.field210 + 8; ++var107) {
                                if (this.field527[this.field367][var106][var107] != null) {
                                    this.field527[this.field367][var106][var107] = null;
                                    this.method33(var106, var107);
                                }
                            }
                        }
                        for (class57 var108 = (class57) this.field363.method395(); var108 != null; var108 = (class57) this.field363.method397(-125)) {
                            if (var108.field1497 >= this.field209 && var108.field1497 < this.field209 + 8 && var108.field1498 >= this.field210 && var108.field1498 < this.field210 + 8 && this.field367 == var108.field1495) {
                                var108.field1499 = 0;
                            }
                        }
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 == 11) {
                        this.field493 = this.field199.method279(0);
                        this.field384 = this.field199.method263();
                        this.field225 = -1;
                        return true;
                    }
                    if (this.field225 != 83) {
                        if (this.field225 == 131) {
                            this.field297 = this.field199.method288(-36835);
                            this.field418 = this.field199.method263();
                            this.field118 = this.field199.method263();
                            this.field211 = this.field199.method287(5);
                            this.field135 = this.field199.method289(0);
                            this.field203 = this.field199.method288(-36835);
                            this.field141 = this.field199.method288(-36835);
                            this.field506 = this.field199.method297(0);
                            this.field295 = this.field199.method287(5);
                            this.field200 = this.field199.method263();
                            this.field544 = this.field199.method281(true);
                            signlink.dnslookup(class67.method577(this.field506, 7));
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 175 || this.field225 == 137) {
                            int var110 = this.field576;
                            int var111 = this.field577;
                            if (this.field225 == 175) {
                                var110 = this.field199.method288(-36835);
                                var111 = this.field199.method287(5);
                                this.field190 = false;
                            }
                            if (this.field225 == 137) {
                                var111 = this.field199.method288(-36835);
                                var110 = this.field199.method289(0);
                                this.field199.method271(false);
                                int var112 = 0;
                                while (true) {
                                    if (var112 >= 4) {
                                        this.field199.method273((byte) -2);
                                        this.field190 = true;
                                        break;
                                    }
                                    for (int var113 = 0; var113 < 13; ++var113) {
                                        for (int var114 = 0; var114 < 13; ++var114) {
                                            int var115 = this.field199.method272(1, (byte) 0);
                                            if (var115 == 1) {
                                                this.field575[var112][var113][var114] = this.field199.method272(26, (byte) 0);
                                            } else {
                                                this.field575[var112][var113][var114] = -1;
                                            }
                                        }
                                    }
                                    ++var112;
                                }
                            }
                            if (this.field576 == var110 && this.field577 == var111 && this.field180 == 2) {
                                this.field225 = -1;
                                return true;
                            }
                            this.field576 = var110;
                            this.field577 = var111;
                            this.field522 = (this.field576 - 6) * 8;
                            this.field523 = (this.field577 - 6) * 8;
                            this.field207 = false;
                            if ((this.field576 / 8 == 48 || this.field576 / 8 == 49) && this.field577 / 8 == 48) {
                                this.field207 = true;
                            }
                            if (this.field576 / 8 == 48 && this.field577 / 8 == 148) {
                                this.field207 = true;
                            }
                            this.field180 = 1;
                            this.field139 = System.currentTimeMillis();
                            this.method81("Loading - please wait.", 0, (String) null);
                            if (this.field225 == 175) {
                                int var116 = 0;
                                int var117 = (this.field576 - 6) / 8;
                                label1193: while (true) {
                                    if (var117 > (this.field576 + 6) / 8) {
                                        this.field364 = new byte[var116][];
                                        this.field321 = new byte[var116][];
                                        this.field349 = new int[var116];
                                        this.field350 = new int[var116];
                                        this.field351 = new int[var116];
                                        int var119 = 0;
                                        int var120 = (this.field576 - 6) / 8;
                                        while (true) {
                                            if (var120 > (this.field576 + 6) / 8) {
                                                break label1193;
                                            }
                                            for (int var121 = (this.field577 - 6) / 8; var121 <= (this.field577 + 6) / 8; ++var121) {
                                                this.field349[var119] = (var120 << 8) + var121;
                                                if (!this.field207 || var121 != 49 && var121 != 149 && var121 != 147 && var120 != 50 && (var120 != 49 || var121 != 47)) {
                                                    int var122 = this.field350[var119] = this.field256.method227((byte) 9, 0, var121, var120);
                                                    if (var122 != -1) {
                                                        this.field256.method228(3, var122);
                                                    }
                                                    int var123 = this.field351[var119] = this.field256.method227((byte) 9, 1, var121, var120);
                                                    if (var123 != -1) {
                                                        this.field256.method228(3, var123);
                                                    }
                                                    ++var119;
                                                } else {
                                                    this.field350[var119] = -1;
                                                    this.field351[var119] = -1;
                                                    ++var119;
                                                }
                                            }
                                            ++var120;
                                        }
                                    }
                                    for (int var118 = (this.field577 - 6) / 8; var118 <= (this.field577 + 6) / 8; ++var118) {
                                        ++var116;
                                    }
                                    ++var117;
                                }
                            }
                            if (this.field225 == 137) {
                                int var124 = 0;
                                int[] var125 = new int[676];
                                int var126 = 0;
                                label1152: while (true) {
                                    if (var126 >= 4) {
                                        this.field364 = new byte[var124][];
                                        this.field321 = new byte[var124][];
                                        this.field349 = new int[var124];
                                        this.field350 = new int[var124];
                                        this.field351 = new int[var124];
                                        int var134 = 0;
                                        while (true) {
                                            if (var134 >= var124) {
                                                break label1152;
                                            }
                                            int var135 = this.field349[var134] = var125[var134];
                                            int var136 = var135 >> 8 & 255;
                                            int var137 = var135 & 255;
                                            int var138 = this.field350[var134] = this.field256.method227((byte) 9, 0, var137, var136);
                                            if (var138 != -1) {
                                                this.field256.method228(3, var138);
                                            }
                                            int var139 = this.field351[var134] = this.field256.method227((byte) 9, 1, var137, var136);
                                            if (var139 != -1) {
                                                this.field256.method228(3, var139);
                                            }
                                            ++var134;
                                        }
                                    }
                                    for (int var127 = 0; var127 < 13; ++var127) {
                                        for (int var128 = 0; var128 < 13; ++var128) {
                                            int var129 = this.field575[var126][var127][var128];
                                            if (var129 != -1) {
                                                int var130 = var129 >> 14 & 1023;
                                                int var131 = var129 >> 3 & 2047;
                                                int var132 = (var130 / 8 << 8) + var131 / 8;
                                                for (int var133 = 0; var133 < var124; ++var133) {
                                                    if (var125[var133] == var132) {
                                                        var132 = -1;
                                                        break;
                                                    }
                                                }
                                                if (var132 != -1) {
                                                    var125[var124++] = var132;
                                                }
                                            }
                                        }
                                    }
                                    ++var126;
                                }
                            }
                            int var140 = this.field522 - this.field524;
                            int var141 = this.field523 - this.field525;
                            this.field524 = this.field522;
                            this.field525 = this.field523;
                            for (int var142 = 0; var142 < 16384; ++var142) {
                                class6 var143 = this.field475[var142];
                                if (var143 != null) {
                                    for (int var144 = 0; var144 < 10; ++var144) {
                                        var143.field1706[var144] -= var140;
                                        var143.field1707[var144] -= var141;
                                    }
                                    var143.field1721 -= var140 * 128;
                                    var143.field1722 -= var141 * 128;
                                }
                            }
                            for (int var145 = 0; var145 < this.field258; ++var145) {
                                class53 var146 = this.field260[var145];
                                if (var146 != null) {
                                    for (int var147 = 0; var147 < 10; ++var147) {
                                        var146.field1706[var147] -= var140;
                                        var146.field1707[var147] -= var141;
                                    }
                                    var146.field1721 -= var140 * 128;
                                    var146.field1722 -= var141 * 128;
                                }
                            }
                            this.field579 = true;
                            byte var148 = 0;
                            byte var149 = 104;
                            byte var150 = 1;
                            if (var140 < 0) {
                                var148 = 103;
                                var149 = -1;
                                var150 = -1;
                            }
                            byte var151 = 0;
                            byte var152 = 104;
                            byte var153 = 1;
                            if (var141 < 0) {
                                var151 = 103;
                                var152 = -1;
                                var153 = -1;
                            }
                            for (int var154 = var148; var149 != var154; var154 += var150) {
                                for (int var155 = var151; var152 != var155; var155 += var153) {
                                    int var156 = var140 + var154;
                                    int var157 = var141 + var155;
                                    for (int var158 = 0; var158 < 4; ++var158) {
                                        if (var156 >= 0 && var157 >= 0 && var156 < 104 && var157 < 104) {
                                            this.field527[var158][var154][var155] = this.field527[var158][var156][var157];
                                        } else {
                                            this.field527[var158][var154][var155] = null;
                                        }
                                    }
                                }
                            }
                            for (class57 var159 = (class57) this.field363.method395(); var159 != null; var159 = (class57) this.field363.method397(-125)) {
                                var159.field1497 -= var140;
                                var159.field1498 -= var141;
                                if (var159.field1497 < 0 || var159.field1498 < 0 || var159.field1497 >= 104 || var159.field1498 >= 104) {
                                    var159.method379();
                                }
                            }
                            if (this.field567 != 0) {
                                this.field567 -= var140;
                                this.field568 -= var141;
                            }
                            this.field427 = false;
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 150) {
                            int var160 = this.field199.method288(-36835);
                            int var161 = this.field199.method287(5);
                            int var162 = this.field199.method287(5);
                            if (var162 == 65535) {
                                class41.method477(var161).field1175 = 0;
                                this.field225 = -1;
                                return true;
                            }
                            class65 var163 = class65.method560(var162);
                            class41.method477(var161).field1175 = 4;
                            class41.method477(var161).field1176 = var162;
                            class41.method477(var161).field1189 = var163.field1660;
                            class41.method477(var161).field1190 = var163.field1643;
                            class41.method477(var161).field1188 = var163.field1615 * 100 / var160;
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 73) {
                            int var164 = this.field199.method288(-36835);
                            class41.method477(var164).field1175 = 3;
                            if (field255.field1465 == null) {
                                class41.method477(var164).field1176 = (field255.field1459[11] << 5) + (field255.field1459[8] << 10) + (field255.field1459[0] << 15) + (field255.field1463[0] << 25) + (field255.field1463[4] << 20) + field255.field1459[1];
                            } else {
                                class41.method477(var164).field1176 = (int) (field255.field1465.field48 + 305419896L);
                            }
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 224) {
                            this.field397 = this.field199.method261();
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 172) {
                            this.field322 = this.field224 / 8;
                            for (int var165 = 0; var165 < this.field322; ++var165) {
                                this.field421[var165] = this.field199.method267(false);
                            }
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 128) {
                            int var166 = this.field199.method289(0);
                            int var167 = this.field199.method289(0);
                            int var168 = this.field199.method263();
                            class41.method477(var166).field1196 = (var168 << 16) + var167;
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 241) {
                            for (int var169 = 0; var169 < this.field115.length; ++var169) {
                                if (this.field372[var169] != this.field115[var169]) {
                                    this.field115[var169] = this.field372[var169];
                                    this.method88(false, var169);
                                    this.field284 = true;
                                }
                            }
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 220) {
                            this.field497 = this.field199.method261();
                            this.field369 = this.field199.method261();
                            this.field383 = this.field199.method261();
                            this.field559 = true;
                            this.field365 = true;
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 19) {
                            for (int var170 = 0; var170 < this.field260.length; ++var170) {
                                if (this.field260[var170] != null) {
                                    this.field260[var170].field1694 = -1;
                                }
                            }
                            for (int var171 = 0; var171 < this.field475.length; ++var171) {
                                if (this.field475[var171] != null) {
                                    this.field475[var171].field1694 = -1;
                                }
                            }
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 117) {
                            this.field571 = this.field199.method289(0) * 30;
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 93) {
                            long var172 = this.field199.method267(false);
                            int var174 = this.field199.method266();
                            int var175 = this.field199.method261();
                            boolean var176 = false;
                            for (int var177 = 0; var177 < 100; ++var177) {
                                if (this.field329[var177] == var174) {
                                    var176 = true;
                                    break;
                                }
                            }
                            if (var175 <= 1) {
                                for (int var178 = 0; var178 < this.field322; ++var178) {
                                    if (this.field421[var178] == var172) {
                                        var176 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var176 && this.field507 == 0) {
                                try {
                                    this.field329[this.field400] = var174;
                                    this.field400 = (this.field400 + 1) % 100;
                                    String var179 = class70.method588(8, this.field224 - 13, this.field199);
                                    if (var175 != 3) {
                                        var179 = class12.method195(var179, 624);
                                    }
                                    if (var175 != 2 && var175 != 3) {
                                        if (var175 == 1) {
                                            this.method74("@cr1@" + class67.method578(class67.method575(false, var172), (byte) -85), 7, var179, true);
                                        } else {
                                            this.method74(class67.method578(class67.method575(false, var172), (byte) -85), 3, var179, true);
                                        }
                                    } else {
                                        this.method74("@cr2@" + class67.method578(class67.method575(false, var172), (byte) -85), 7, var179, true);
                                    }
                                } catch (Exception var190) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 91) {
                            int var181 = this.field199.method287(5);
                            int var182 = this.field199.method288(-36835);
                            if (this.field310 != -1) {
                                this.method53(this.field310, (byte) -104);
                                this.field310 = -1;
                                this.field365 = true;
                            }
                            if (this.field419 != -1) {
                                this.method53(this.field419, (byte) -104);
                                this.field419 = -1;
                                this.field177 = true;
                            }
                            if (this.field402 != -1) {
                                this.method53(this.field402, (byte) -104);
                                this.field402 = -1;
                            }
                            if (this.field254 != var181) {
                                this.method53(this.field254, (byte) -104);
                                this.field254 = var181;
                            }
                            if (this.field347 != var182) {
                                this.method53(this.field347, (byte) -104);
                                this.field347 = var182;
                            }
                            if (this.field498 != 0) {
                                this.field498 = 0;
                                this.field365 = true;
                            }
                            this.field284 = true;
                            this.field186 = true;
                            this.field99 = false;
                            this.field225 = -1;
                            return true;
                        }
                        if (this.field225 == 228) {
                            int var183 = this.field199.method261();
                            int var184 = this.field199.method261();
                            int var185 = this.field199.method261();
                            int var186 = this.field199.method261();
                            this.field230[var183] = true;
                            this.field340[var183] = var184;
                            this.field287[var183] = var185;
                            this.field560[var183] = var186;
                            this.field315[var183] = 0;
                            this.field225 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field225 + "," + this.field224 + " - " + this.field184 + "," + this.field185);
                        this.method80(true);
                        return true;
                    }
                    int var109 = this.field199.method288(-36835);
                    this.method124(true, var109);
                    if (this.field347 != -1) {
                        this.method53(this.field347, (byte) -104);
                        this.field347 = -1;
                        this.field284 = true;
                        this.field186 = true;
                    }
                    if (this.field419 != -1) {
                        this.method53(this.field419, (byte) -104);
                        this.field419 = -1;
                        this.field177 = true;
                    }
                    if (this.field402 != -1) {
                        this.method53(this.field402, (byte) -104);
                        this.field402 = -1;
                    }
                    if (this.field254 != -1) {
                        this.method53(this.field254, (byte) -104);
                        this.field254 = -1;
                    }
                    if (this.field310 != var109) {
                        this.method53(this.field310, (byte) -104);
                        this.field310 = var109;
                    }
                    this.field99 = false;
                    this.field365 = true;
                    this.field225 = -1;
                    return true;
                }
                this.method101(this.field225, true, this.field199);
                this.field225 = -1;
                return true;
            } catch (IOException var191) {
                this.method94((byte) -40);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field225 + "," + this.field184 + "," + this.field185 + " - " + this.field224 + "," + (field255.field1706[0] + this.field522) + "," + (field255.field1707[0] + this.field523) + " - ";
                for (int var189 = 0; var189 < this.field224 && var189 < 50; ++var189) {
                    var188 = var188 + this.field199.field708[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method80(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method87(byte arg0, long arg1) {
        if (arg0 != -33) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1 != 0L) {
            for (int var5 = 0; var5 < this.field322; ++var5) {
                if (this.field421[var5] == arg1) {
                    --this.field322;
                    this.field284 = true;
                    for (int var6 = var5; var6 < this.field322; ++var6) {
                        this.field421[var6] = this.field421[var6 + 1];
                    }
                    this.field533.method250(1, 61);
                    this.field533.method257(0, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method88(boolean arg0, int arg1) {
        if (arg0) {
            this.field279 = 187;
        }
        int var3 = class23.field785[arg1].field793;
        if (var3 != 0) {
            int var4 = this.field115[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class49.method511(-313, 0.9D);
                }
                if (var4 == 2) {
                    class49.method511(-313, 0.8D);
                }
                if (var4 == 3) {
                    class49.method511(-313, 0.7D);
                }
                if (var4 == 4) {
                    class49.method511(-313, 0.6D);
                }
                class65.field1622.method3();
                this.field177 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field501;
                if (var4 == 0) {
                    this.method75(this.field501, -28023, 0);
                    this.field501 = true;
                }
                if (var4 == 1) {
                    this.method75(this.field501, -28023, -400);
                    this.field501 = true;
                }
                if (var4 == 2) {
                    this.method75(this.field501, -28023, -800);
                    this.field501 = true;
                }
                if (var4 == 3) {
                    this.method75(this.field501, -28023, -1200);
                    this.field501 = true;
                }
                if (var4 == 4) {
                    this.field501 = false;
                }
                if (this.field501 != var5 && !field130) {
                    if (this.field501) {
                        this.field565 = this.field346;
                        this.field566 = true;
                        this.field256.method228(2, this.field565);
                    } else {
                        this.method145(177);
                    }
                    this.field505 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field195 = true;
                    this.method68(0, 0);
                }
                if (var4 == 1) {
                    this.field195 = true;
                    this.method68(-400, 0);
                }
                if (var4 == 2) {
                    this.field195 = true;
                    this.method68(-800, 0);
                }
                if (var4 == 3) {
                    this.field195 = true;
                    this.method68(-1200, 0);
                }
                if (var4 == 4) {
                    this.field195 = false;
                }
            }
            if (var3 == 5) {
                this.field241 = var4;
            }
            if (var3 == 6) {
                this.field175 = var4;
            }
            if (var3 == 8) {
                this.field312 = var4;
                this.field365 = true;
            }
            if (var3 == 9) {
                this.field132 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method89(byte arg0) {
        for (int var2 = -1; var2 < this.field261; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field259;
            } else {
                var7 = this.field262[var2];
            }
            class53 var8 = this.field260[var7];
            if (var8 != null && var8.field1714 > 0) {
                --var8.field1714;
                if (var8.field1714 == 0) {
                    var8.field1712 = null;
                }
            }
        }
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = 0; var4 < this.field476; ++var4) {
            int var5 = this.field477[var4];
            class6 var6 = this.field475[var5];
            if (var6 != null && var6.field1714 > 0) {
                --var6.field1714;
                if (var6.field1714 == 0) {
                    var6.field1712 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method90(boolean arg0) {
        if (this.field312 != 0) {
            int var2 = 0;
            if (this.field571 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field557[var3] != null) {
                    int var4 = this.field555[var3];
                    String var5 = this.field556[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field369 == 0 || this.field369 == 1 && this.method91(false, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1057 > 4 && super.field1058 - 4 > var9 - 10 && super.field1058 - 4 <= var9 + 3) {
                            int var10 = this.field192.method528("From:  " + var5 + this.field557[var3], 555) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1057 < var10 + 4) {
                                if (this.field305 >= 1) {
                                    this.field394[this.field550] = "Report abuse @whi@" + var5;
                                    this.field269[this.field550] = 2440;
                                    ++this.field550;
                                }
                                this.field394[this.field550] = "Add ignore @whi@" + var5;
                                this.field269[this.field550] = 2539;
                                ++this.field550;
                                this.field394[this.field550] = "Add friend @whi@" + var5;
                                this.field269[this.field550] = 2342;
                                ++this.field550;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field369 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field529 &= arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method91(boolean arg0, String arg1) {
        if (arg0) {
            field286 = !field286;
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field222; ++var3) {
                if (arg1.equalsIgnoreCase(this.field574[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field255.field1462);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public final void method92(String arg0, int arg1, byte arg2) {
        this.field133 = arg1;
        this.field188 = arg0;
        this.method98(false);
        if (this.field240 == null) {
            super.method92(arg0, arg1, (byte) 8);
        } else {
            this.field449.method580(true);
            short var4 = 360;
            short var5 = 200;
            if (arg2 != 8) {
                field286 = !field286;
            }
            byte var6 = 20;
            this.field193.method526(16777215, 3, var5 / 2 - 26 - var6, var4 / 2, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            class35.method386(304, 34, this.field278, 9179409, var4 / 2 - 152, var7);
            class35.method386(302, 32, this.field278, 0, var4 / 2 - 151, var7 + 1);
            class35.method385(var7 + 2, arg1 * 3, 30, var4 / 2 - 150, (byte) 5, 9179409);
            class35.method385(var7 + 2, 300 - arg1 * 3, 30, arg1 * 3 + (var4 / 2 - 150), (byte) 5, 0);
            this.field193.method526(16777215, 3, var5 / 2 + 5 - var6, var4 / 2, arg0);
            this.field449.method581(202, 171, -41725, super.field1049);
            if (this.field177) {
                this.field177 = false;
                if (!this.field219) {
                    this.field450.method581(0, 0, -41725, super.field1049);
                    this.field451.method581(637, 0, -41725, super.field1049);
                }
                this.field447.method581(128, 0, -41725, super.field1049);
                this.field448.method581(202, 371, -41725, super.field1049);
                this.field452.method581(0, 265, -41725, super.field1049);
                this.field453.method581(562, 265, -41725, super.field1049);
                this.field454.method581(128, 171, -41725, super.field1049);
                this.field455.method581(562, 171, -41725, super.field1049);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method93(boolean arg0, int arg1) {
        int var3 = 60 / arg1;
        this.method98(false);
        this.field449.method580(true);
        this.field572.method183(7964, 0, 0);
        short var4 = 360;
        short var5 = 200;
        if (this.field234 == 0) {
            int var6 = var5 / 2 + 80;
            this.field191.method527(var6, 7711145, var4 / 2, true, true, this.field256.field650);
            int var7 = var5 / 2 - 20;
            this.field193.method527(var7, 16776960, var4 / 2, true, true, "Welcome to RuneScape");
            int var18 = var7 + 30;
            int var8 = var4 / 2 - 80;
            int var9 = var5 / 2 + 20;
            this.field573.method183(7964, var9 - 20, var8 - 73);
            this.field193.method527(var9 + 5, 16777215, var8, true, true, "New User");
            int var10 = var4 / 2 + 80;
            this.field573.method183(7964, var9 - 20, var10 - 73);
            this.field193.method527(var9 + 5, 16777215, var10, true, true, "Existing User");
        }
        if (this.field234 == 2) {
            int var11 = var5 / 2 - 40;
            if (this.field125.length() > 0) {
                this.field193.method527(var11 - 15, 16776960, var4 / 2, true, true, this.field125);
                this.field193.method527(var11, 16776960, var4 / 2, true, true, this.field126);
                var11 += 30;
            } else {
                this.field193.method527(var11 - 7, 16776960, var4 / 2, true, true, this.field126);
                var11 += 30;
            }
            this.field193.method534("Username: " + this.field123 + (this.field137 == 0 & field147 % 40 < 20 ? "@yel@|" : ""), 16777215, var11, -964, var4 / 2 - 90, true);
            var11 += 15;
            this.field193.method534("Password: " + class67.method579(true, this.field124) + (this.field137 == 1 & field147 % 40 < 20 ? "@yel@|" : ""), 16777215, var11, -964, var4 / 2 - 88, true);
            var11 += 15;
            if (!arg0) {
                int var12 = var4 / 2 - 80;
                int var13 = var5 / 2 + 50;
                this.field573.method183(7964, var13 - 20, var12 - 73);
                this.field193.method527(var13 + 5, 16777215, var12, true, true, "Login");
                int var14 = var4 / 2 + 80;
                this.field573.method183(7964, var13 - 20, var14 - 73);
                this.field193.method527(var13 + 5, 16777215, var14, true, true, "Cancel");
            }
        }
        if (this.field234 == 3) {
            this.field193.method527(var5 / 2 - 60, 16776960, var4 / 2, true, true, "Create a free account");
            int var15 = var5 / 2 - 35;
            this.field193.method527(var15, 16777215, var4 / 2, true, true, "To create a new account you need to");
            int var19 = var15 + 15;
            this.field193.method527(var19, 16777215, var4 / 2, true, true, "go back to the main RuneScape webpage");
            int var20 = var19 + 15;
            this.field193.method527(var20, 16777215, var4 / 2, true, true, "and choose the 'create account'");
            int var21 = var20 + 15;
            this.field193.method527(var21, 16777215, var4 / 2, true, true, "button near the top of that page.");
            int var22 = var21 + 15;
            int var16 = var4 / 2;
            int var17 = var5 / 2 + 50;
            this.field573.method183(7964, var17 - 20, var16 - 73);
            this.field193.method527(var17 + 5, 16777215, var16, true, true, "Cancel");
        }
        this.field449.method581(202, 171, -41725, super.field1049);
        if (this.field177) {
            this.field177 = false;
            this.field447.method581(128, 0, -41725, super.field1049);
            this.field448.method581(202, 371, -41725, super.field1049);
            this.field452.method581(0, 265, -41725, super.field1049);
            this.field453.method581(562, 265, -41725, super.field1049);
            this.field454.method581(128, 171, -41725, super.field1049);
            this.field455.method581(562, 171, -41725, super.field1049);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method94(byte arg0) {
        if (this.field228 > 0) {
            this.method80(true);
        } else {
            this.method81("Connection lost", 0, "Please wait - attempting to reestablish");
            this.field397 = 0;
            this.field567 = 0;
            if (this.field100 == arg0) {
                class60 var2 = this.field399;
                this.field529 = false;
                this.field391 = 0;
                this.method158(this.field123, this.field124, true);
                if (!this.field529) {
                    this.method80(true);
                }
                try {
                    var2.method543();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEGCCHUZS;ILQAJCAYDZ;II)V")
    private final void method95(class15 arg0, int arg1, class53 arg2, int arg3, int arg4) {
        int var6 = 76 / arg1;
        if ((arg4 & 1024) != 0) {
            int var7 = arg0.method280(true);
            int var8 = arg0.method261();
            arg2.method593(field147, var8, var7, 9);
            arg2.field1708 = field147 + 300;
            arg2.field1709 = arg0.method279(0);
            arg2.field1710 = arg0.method281(true);
        }
        if ((arg4 & 16) != 0) {
            int var9 = arg0.method279(0);
            byte[] var10 = new byte[var9];
            class15 var11 = new class15(var10, false);
            arg0.method298(true, var10, var9, 0);
            this.field265[arg3] = var11;
            arg2.method521(var11, 352);
        }
        if ((arg4 & 2) != 0) {
            arg2.field1737 = arg0.method288(-36835);
            arg2.field1738 = arg0.method287(5);
        }
        if ((arg4 & 4) != 0) {
            int var12 = arg0.method279(0);
            int var13 = arg0.method261();
            arg2.method593(field147, var13, var12, 9);
            arg2.field1708 = field147 + 300;
            arg2.field1709 = arg0.method281(true);
            arg2.field1710 = arg0.method281(true);
        }
        if ((arg4 & 1) != 0) {
            int var14 = arg0.method263();
            int var15 = arg0.method281(true);
            int var16 = arg0.method281(true);
            int var17 = arg0.field709;
            if (arg2.field1462 != null && arg2.field1453) {
                long var18 = class67.method574(arg2.field1462);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field322; ++var21) {
                        if (this.field421[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field507 == 0) {
                    try {
                        this.field474.field709 = 0;
                        arg0.method270(var16, 0, this.field474.field708, 18677);
                        this.field474.field709 = 0;
                        String var22 = class70.method588(8, var16, this.field474);
                        String var23 = class12.method195(var22, 624);
                        arg2.field1712 = var23;
                        arg2.field1739 = var14 >> 8;
                        arg2.field1740 = var14 & 255;
                        arg2.field1714 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method74("@cr1@" + arg2.field1462, 1, var23, true);
                            } else {
                                this.method74(arg2.field1462, 2, var23, true);
                            }
                        } else {
                            this.method74("@cr2@" + arg2.field1462, 1, var23, true);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field709 = var16 + var17;
        }
        if ((arg4 & 64) != 0) {
            arg2.field1712 = arg0.method268();
            if (arg2.field1712.charAt(0) == '~') {
                arg2.field1712 = arg2.field1712.substring(1);
                this.method74(arg2.field1462, 2, arg2.field1712, true);
            } else if (field255 == arg2) {
                this.method74(arg2.field1462, 2, arg2.field1712, true);
            }
            arg2.field1739 = 0;
            arg2.field1740 = 0;
            arg2.field1714 = 150;
        }
        if ((arg4 & 512) != 0) {
            arg2.field1724 = arg0.method281(true);
            arg2.field1726 = arg0.method281(true);
            arg2.field1725 = arg0.method261();
            arg2.field1727 = arg0.method279(0);
            arg2.field1728 = arg0.method288(-36835) + field147;
            arg2.field1729 = arg0.method288(-36835) + field147;
            arg2.field1730 = arg0.method281(true);
            arg2.method592(-95);
        }
        if ((arg4 & 128) != 0) {
            int var25 = arg0.method263();
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg0.method261();
            if (arg2.field1694 == var25 && var25 != -1) {
                int var27 = class5.field67[var25].field81;
                if (var27 == 1) {
                    arg2.field1695 = 0;
                    arg2.field1696 = 0;
                    arg2.field1697 = var26;
                    arg2.field1698 = 0;
                }
                if (var27 == 2) {
                    arg2.field1698 = 0;
                }
            } else if (var25 == -1 || arg2.field1694 == -1 || class5.field67[var25].field75 >= class5.field67[arg2.field1694].field75) {
                arg2.field1694 = var25;
                arg2.field1695 = 0;
                arg2.field1696 = 0;
                arg2.field1697 = var26;
                arg2.field1698 = 0;
                arg2.field1693 = arg2.field1701;
            }
        }
        if ((arg4 & 256) != 0) {
            arg2.field1747 = arg0.method287(5);
            int var28 = arg0.method295(false);
            arg2.field1751 = var28 >> 16;
            arg2.field1750 = (var28 & 65535) + field147;
            arg2.field1748 = 0;
            arg2.field1749 = 0;
            if (arg2.field1750 > field147) {
                arg2.field1748 = -1;
            }
            if (arg2.field1747 == 65535) {
                arg2.field1747 = -1;
            }
        }
        if ((arg4 & 8) != 0) {
            arg2.field1734 = arg0.method287(5);
            if (arg2.field1734 == 65535) {
                arg2.field1734 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method96(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        if (arg2 != 4) {
            throw new NullPointerException();
        } else {
            int var6 = this.field208.method444(this.field367, arg0, arg1, arg3);
            if (var6 == -1) {
                return false;
            } else {
                int var7 = var6 & 31;
                int var8 = var6 >> 6 & 3;
                if (var7 != 10 && var7 != 11 && var7 != 22) {
                    this.method140(false, var8, 0, arg0, arg1, 0, 0, field255.field1706[0], 2, 5, field255.field1707[0], var7 + 1);
                } else {
                    class27 var9 = class27.method326(var5);
                    int var10;
                    int var11;
                    if (var8 != 0 && var8 != 2) {
                        var10 = var9.field832;
                        var11 = var9.field851;
                    } else {
                        var10 = var9.field851;
                        var11 = var9.field832;
                    }
                    int var12 = var9.field842;
                    if (var8 != 0) {
                        var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                    }
                    this.method140(false, 0, var11, arg0, arg1, var10, var12, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                }
                this.field317 = super.field1064;
                this.field318 = super.field1065;
                this.field320 = 2;
                this.field319 = 0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method97(String arg0) {
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

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method98(boolean arg0) {
        if (this.field447 == null) {
            super.field1050 = null;
            this.field362 = null;
            this.field360 = null;
            this.field359 = null;
            this.field361 = null;
            this.field237 = null;
            this.field238 = null;
            this.field239 = null;
            this.field450 = new class68(this.method139(field535), true, 128, 265);
            if (arg0) {
                this.field527 = null;
            }
            class35.method383((byte) 6);
            this.field451 = new class68(this.method139(field535), true, 128, 265);
            class35.method383((byte) 6);
            this.field447 = new class68(this.method139(field535), true, 509, 171);
            class35.method383((byte) 6);
            this.field448 = new class68(this.method139(field535), true, 360, 132);
            class35.method383((byte) 6);
            this.field449 = new class68(this.method139(field535), true, 360, 200);
            class35.method383((byte) 6);
            this.field452 = new class68(this.method139(field535), true, 202, 238);
            class35.method383((byte) 6);
            this.field453 = new class68(this.method139(field535), true, 203, 238);
            class35.method383((byte) 6);
            this.field454 = new class68(this.method139(field535), true, 74, 94);
            class35.method383((byte) 6);
            this.field455 = new class68(this.method139(field535), true, 75, 94);
            class35.method383((byte) 6);
            if (this.field240 != null) {
                this.method155(-616);
                this.method121(0);
            }
            this.field177 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method99(String arg0) throws IOException {
        if (!this.field445) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field233 != null) {
                try {
                    this.field233.close();
                } catch (Exception var4) {
                }
                this.field233 = null;
            }
            this.field233 = this.method47(43595);
            this.field233.setSoTimeout(10000);
            InputStream var2 = this.field233.getInputStream();
            OutputStream var3 = this.field233.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (!arg0) {
            this.field225 = -1;
        }
        if (this.field397 == 0) {
            if (super.field1063 == 1) {
                int var2 = super.field1064 - 25 - 550;
                int var3 = super.field1065 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field485 + this.field106 & 2047;
                    int var5 = class49.field1361[var4];
                    int var6 = class49.field1362[var4];
                    int var7 = (this.field158 + 256) * var5 >> 8;
                    int var8 = (this.field158 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field255.field1721 + var9 >> 7;
                    int var12 = field255.field1722 - var10 >> 7;
                    boolean var13 = this.method140(true, 0, 0, var11, var12, 0, 0, field255.field1706[0], 1, 5, field255.field1707[0], 0);
                    if (var13) {
                        this.field533.method251(var2);
                        this.field533.method251(var3);
                        this.field533.method252(this.field485);
                        this.field533.method251(57);
                        this.field533.method251(this.field106);
                        this.field533.method251(this.field158);
                        this.field533.method251(89);
                        this.field533.method252(field255.field1721);
                        this.field533.method252(field255.field1722);
                        this.field533.method251(this.field513);
                        this.field533.method251(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLEGCCHUZS;)V")
    public final void method101(int arg0, boolean arg1, class15 arg2) {
        if (!arg1) {
            this.field527 = null;
        }
        if (arg0 == 3) {
            byte var4 = arg2.method283((byte) 3);
            byte var5 = arg2.method283((byte) 3);
            byte var6 = arg2.method262();
            byte var7 = arg2.method283((byte) 3);
            int var8 = arg2.method280(true);
            int var9 = (var8 >> 4 & 7) + this.field209;
            int var10 = (var8 & 7) + this.field210;
            int var11 = arg2.method289(0);
            int var12 = arg2.method289(0);
            int var13 = arg2.method263();
            int var14 = arg2.method263();
            int var15 = arg2.method261();
            int var16 = var15 >> 2;
            int var17 = var15 & 3;
            int var18 = this.field280[var16];
            class53 var19;
            if (this.field384 == var11) {
                var19 = field255;
            } else {
                var19 = this.field260[var11];
            }
            if (var19 != null) {
                class27 var20 = class27.method326(var12);
                int var21 = this.field385[this.field367][var9][var10];
                int var22 = this.field385[this.field367][var9 + 1][var10];
                int var23 = this.field385[this.field367][var9 + 1][var10 + 1];
                int var24 = this.field385[this.field367][var9][var10 + 1];
                class32 var25 = var20.method321(var16, var17, var21, var22, var23, var24, -1);
                if (var25 != null) {
                    this.method168(var10, 0, -1, var18, 0, var9, 594, var14 + 1, this.field367, var13 + 1);
                    var19.field1451 = field147 + var13;
                    var19.field1452 = field147 + var14;
                    var19.field1458 = var25;
                    int var26 = var20.field851;
                    int var27 = var20.field832;
                    if (var17 == 1 || var17 == 3) {
                        var26 = var20.field832;
                        var27 = var20.field851;
                    }
                    var19.field1455 = var9 * 128 + var26 * 64;
                    var19.field1457 = var10 * 128 + var27 * 64;
                    var19.field1456 = this.method152(var19.field1455, 0, var19.field1457, this.field367);
                    if (var5 > var7) {
                        byte var28 = var5;
                        var5 = var7;
                        var7 = var28;
                    }
                    if (var4 > var6) {
                        byte var29 = var4;
                        var4 = var6;
                        var6 = var29;
                    }
                    var19.field1440 = var5 + var9;
                    var19.field1442 = var7 + var9;
                    var19.field1441 = var4 + var10;
                    var19.field1443 = var6 + var10;
                }
            }
        }
        if (arg0 == 246) {
            int var30 = arg2.method280(true);
            int var31 = var30 >> 2;
            int var32 = var30 & 3;
            int var33 = this.field280[var31];
            int var34 = arg2.method287(5);
            int var35 = arg2.method281(true);
            int var36 = (var35 >> 4 & 7) + this.field209;
            int var37 = (var35 & 7) + this.field210;
            if (var36 >= 0 && var37 >= 0 && var36 < 103 && var37 < 103) {
                int var38 = this.field385[this.field367][var36][var37];
                int var39 = this.field385[this.field367][var36 + 1][var37];
                int var40 = this.field385[this.field367][var36 + 1][var37 + 1];
                int var41 = this.field385[this.field367][var36][var37 + 1];
                if (var33 == 0) {
                    class50 var42 = this.field208.method436((byte) 121, var37, this.field367, var36);
                    if (var42 != null) {
                        int var43 = var42.field1382 >> 14 & 32767;
                        if (var31 == 2) {
                            var42.field1380 = new class64(var34, var38, var32 + 4, var39, var43, 2, false, var40, 18451, var41);
                            var42.field1381 = new class64(var34, var38, var32 + 1 & 3, var39, var43, 2, false, var40, 18451, var41);
                        } else {
                            var42.field1380 = new class64(var34, var38, var32, var39, var43, var31, false, var40, 18451, var41);
                        }
                    }
                }
                if (var33 == 1) {
                    class51 var44 = this.field208.method437(var36, var37, this.field367, true);
                    if (var44 != null) {
                        var44.field1389 = new class64(var34, var38, 0, var39, var44.field1390 >> 14 & 32767, 4, false, var40, 18451, var41);
                    }
                }
                if (var33 == 2) {
                    class48 var45 = this.field208.method438(var36, this.field367, var37, false);
                    if (var31 == 11) {
                        var31 = 10;
                    }
                    if (var45 != null) {
                        var45.field1339 = new class64(var34, var38, var32, var39, var45.field1347 >> 14 & 32767, var31, false, var40, 18451, var41);
                    }
                }
                if (var33 == 3) {
                    class9 var46 = this.field208.method439(var36, var37, 0, this.field367);
                    if (var46 != null) {
                        var46.field592 = new class64(var34, var38, var32, var39, var46.field593 >> 14 & 32767, 22, false, var40, 18451, var41);
                    }
                }
            }
        } else if (arg0 == 237) {
            int var47 = arg2.method261();
            int var48 = (var47 >> 4 & 7) + this.field209;
            int var49 = (var47 & 7) + this.field210;
            int var50 = var48 + arg2.method262();
            int var51 = var49 + arg2.method262();
            int var52 = arg2.method264();
            int var53 = arg2.method263();
            int var54 = arg2.method261() * 4;
            int var55 = arg2.method261() * 4;
            int var56 = arg2.method263();
            int var57 = arg2.method263();
            int var58 = arg2.method261();
            int var59 = arg2.method261();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104 && var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104 && var53 != 65535) {
                int var60 = var48 * 128 + 64;
                int var61 = var49 * 128 + 64;
                int var62 = var50 * 128 + 64;
                int var63 = var51 * 128 + 64;
                class47 var64 = new class47(field147 + var56, this.field367, var61, var59, var52, var60, this.method152(var60, 0, var61, this.field367) - var54, var58, var53, field147 + var57, var55, 29);
                var64.method500(field147 + var56, var62, -41536, var63, this.method152(var62, 0, var63, this.field367) - var55);
                this.field373.method392(var64);
            }
        } else if (arg0 == 147) {
            int var65 = arg2.method288(-36835);
            int var66 = arg2.method288(-36835);
            int var67 = arg2.method287(5);
            int var68 = arg2.method280(true);
            int var69 = (var68 >> 4 & 7) + this.field209;
            int var70 = (var68 & 7) + this.field210;
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && this.field384 != var67) {
                class34 var71 = new class34();
                var71.field1012 = var65;
                var71.field1011 = var66;
                if (this.field527[this.field367][var69][var70] == null) {
                    this.field527[this.field367][var69][var70] = new class36(0);
                }
                this.field527[this.field367][var69][var70].method392(var71);
                this.method33(var69, var70);
            }
        } else if (arg0 == 188) {
            int var72 = arg2.method261();
            int var73 = (var72 >> 4 & 7) + this.field209;
            int var74 = (var72 & 7) + this.field210;
            int var75 = arg2.method263();
            int var76 = arg2.method261();
            int var77 = arg2.method263();
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                int var78 = var73 * 128 + 64;
                int var79 = var74 * 128 + 64;
                class17 var80 = new class17(var75, var77, this.method152(var78, 0, var79, this.field367) - var76, this.field367, 494, field147, var78, var79);
                this.field422.method392(var80);
            }
        } else if (arg0 == 199) {
            int var81 = arg2.method261();
            int var82 = (var81 >> 4 & 7) + this.field209;
            int var83 = (var81 & 7) + this.field210;
            int var84 = arg2.method263();
            int var85 = arg2.method263();
            int var86 = arg2.method263();
            if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                class36 var87 = this.field527[this.field367][var82][var83];
                if (var87 != null) {
                    for (class34 var88 = (class34) var87.method395(); var88 != null; var88 = (class34) var87.method397(-125)) {
                        if ((var84 & 32767) == var88.field1012 && var88.field1011 == var85) {
                            var88.field1011 = var86;
                            break;
                        }
                    }
                    this.method33(var82, var83);
                }
            }
        } else if (arg0 == 198) {
            int var89 = arg2.method261();
            int var90 = var89 >> 2;
            int var91 = var89 & 3;
            int var92 = this.field280[var90];
            int var93 = arg2.method261();
            int var94 = (var93 >> 4 & 7) + this.field209;
            int var95 = (var93 & 7) + this.field210;
            int var96 = arg2.method289(0);
            if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                this.method168(var95, var91, var96, var92, var90, var94, 594, -1, this.field367, 0);
            }
        } else if (arg0 == 52) {
            int var97 = arg2.method280(true);
            int var98 = (var97 >> 4 & 7) + this.field209;
            int var99 = (var97 & 7) + this.field210;
            int var100 = arg2.method280(true);
            int var101 = var100 >> 2;
            int var102 = var100 & 3;
            int var103 = this.field280[var101];
            if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                this.method168(var99, var102, -1, var103, var101, var98, 594, -1, this.field367, 0);
            }
        } else if (arg0 != 69) {
            if (arg0 == 99) {
                int var110 = arg2.method288(-36835);
                int var111 = arg2.method287(5);
                int var112 = arg2.method280(true);
                int var113 = (var112 >> 4 & 7) + this.field209;
                int var114 = (var112 & 7) + this.field210;
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    class34 var115 = new class34();
                    var115.field1012 = var111;
                    var115.field1011 = var110;
                    if (this.field527[this.field367][var113][var114] == null) {
                        this.field527[this.field367][var113][var114] = new class36(0);
                    }
                    this.field527[this.field367][var113][var114].method392(var115);
                    this.method33(var113, var114);
                }
            } else {
                if (arg0 == 86) {
                    int var116 = arg2.method261();
                    int var117 = (var116 >> 4 & 7) + this.field209;
                    int var118 = (var116 & 7) + this.field210;
                    int var119 = arg2.method263();
                    int var120 = arg2.method261();
                    int var121 = var120 >> 4 & 15;
                    int var122 = var120 & 7;
                    if (field255.field1706[0] >= var117 - var121 && field255.field1706[0] <= var117 + var121 && field255.field1707[0] >= var118 - var121 && field255.field1707[0] <= var118 + var121 && this.field195 && !field130 && this.field382 < 50) {
                        this.field283[this.field382] = var119;
                        this.field181[this.field382] = var122;
                        this.field119[this.field382] = class20.field754[var119];
                        ++this.field382;
                        return;
                    }
                }
            }
        } else {
            int var104 = arg2.method261();
            int var105 = (var104 >> 4 & 7) + this.field209;
            int var106 = (var104 & 7) + this.field210;
            int var107 = arg2.method263();
            if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                class36 var108 = this.field527[this.field367][var105][var106];
                if (var108 != null) {
                    for (class34 var109 = (class34) var108.method395(); var109 != null; var109 = (class34) var108.method397(-125)) {
                        if ((var107 & 32767) == var109.field1012) {
                            var109.method379();
                            break;
                        }
                    }
                    if (var108.method395() == null) {
                        this.field527[this.field367][var105][var106] = null;
                    }
                    this.method33(var105, var106);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method102(byte arg0) {
        this.method83(true);
        if (arg0 != -24) {
            this.field533.method251(241);
        }
        if (this.field320 == 1) {
            this.field306[this.field319 / 100].method335(7964, this.field318 - 8 - 4, this.field317 - 8 - 4);
        }
        if (this.field320 == 2) {
            this.field306[this.field319 / 100 + 4].method335(7964, this.field318 - 8 - 4, this.field317 - 8 - 4);
        }
        if (this.field553 != -1) {
            this.method108(375, this.field113, this.field553);
            this.method148(0, 9538, 0, 0, class41.method477(this.field553));
        }
        if (this.field254 != -1) {
            this.method108(375, this.field113, this.field254);
            this.method148(0, 9538, 0, 0, class41.method477(this.field254));
        }
        this.method48(this.field548);
        if (!this.field528) {
            this.method41((byte) 9);
            this.method105((byte) 5);
        } else if (this.field463 == 0) {
            this.method58(0);
        }
        if (this.field281 == 1) {
            this.field405.method335(7964, 296, 472);
        }
        if (field179) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1045 < 30 && field130) {
                var4 = 16711680;
            }
            if (super.field1045 < 20 && !field130) {
                var4 = 16711680;
            }
            this.field192.method525(var2, "Fps:" + super.field1045, var3, var4, 150);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field130) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field130) {
                int var9 = 16711680;
            }
            this.field192.method525(var2, "Mem:" + var6 + "k", var13, 16776960, 150);
            var13 += 15;
        }
        if (this.field571 != 0) {
            int var10 = this.field571 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field192.method530(329, "System update in: " + var11 + ":0" + var12, 4, 16776960, 411);
            } else {
                this.field192.method530(329, "System update in: " + var11 + ":" + var12, 4, 16776960, 411);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 != -7538) {
            this.field278 = -228;
        }
        for (class47 var2 = (class47) this.field373.method395(); var2 != null; var2 = (class47) this.field373.method397(-125)) {
            if (this.field367 == var2.field1326 && field147 <= var2.field1334) {
                if (field147 >= var2.field1333) {
                    if (var2.field1325 > 0) {
                        class6 var3 = this.field475[var2.field1325 - 1];
                        if (var3 != null && var3.field1721 >= 0 && var3.field1721 < 13312 && var3.field1722 >= 0 && var3.field1722 < 13312) {
                            var2.method500(field147, var3.field1721, -41536, var3.field1722, this.method152(var3.field1721, 0, var3.field1722, var2.field1326) - var2.field1321);
                        }
                    }
                    if (var2.field1325 < 0) {
                        int var4 = -var2.field1325 - 1;
                        class53 var5;
                        if (this.field384 == var4) {
                            var5 = field255;
                        } else {
                            var5 = this.field260[var4];
                        }
                        if (var5 != null && var5.field1721 >= 0 && var5.field1721 < 13312 && var5.field1722 >= 0 && var5.field1722 < 13312) {
                            var2.method500(field147, var5.field1721, -41536, var5.field1722, this.method152(var5.field1721, 0, var5.field1722, var2.field1326) - var2.field1321);
                        }
                    }
                    var2.method501(this.field113, this.field494);
                    this.field208.method425(60, false, 34, (int) var2.field1313, var2, (int) var2.field1314, (int) var2.field1312, this.field367, -1, var2.field1331);
                }
            } else {
                var2.method379();
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public static final void method104(int arg0) {
        class39.field1082 = true;
        class49.field1352 = true;
        field130 = true;
        class43.field1271 = true;
        class27.field847 = true;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method105(byte arg0) {
        if (this.field550 >= 2 || this.field214 != 0 || this.field423 != 0) {
            String var2;
            if (this.field214 == 1 && this.field550 < 2) {
                var2 = "Use " + this.field218 + " with...";
            } else if (this.field423 == 1 && this.field550 < 2) {
                var2 = this.field426 + "...";
            } else {
                var2 = this.field394[this.field550 - 1];
            }
            if (this.field550 > 2) {
                var2 = var2 + "@whi@ / " + (this.field550 - 2) + " more options";
            }
            this.field193.method535(16777215, field147 / 1000, var2, 15, 7, 4, true);
            if (arg0 != 5) {
                this.field580 = -428;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method106(boolean arg0) {
        if (this.field298 == 2) {
            this.method35(this.field334 * 2, true, (this.field332 - this.field522 << 7) + this.field335, (this.field333 - this.field523 << 7) + this.field336);
            if (arg0) {
                this.field225 = -1;
            }
            if (this.field495 > -1 && field147 % 20 < 10) {
                this.field488[0].method335(7964, this.field496 - 28, this.field495 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method107(int arg0) {
        if (arg0 != 0) {
            field108 = this.field274.method522();
        }
        if (super.field1063 == 1) {
            if (super.field1064 >= 539 && super.field1064 <= 573 && super.field1065 >= 169 && super.field1065 < 205 && this.field378[0] != -1) {
                this.field284 = true;
                this.field122 = 0;
                this.field186 = true;
            }
            if (super.field1064 >= 569 && super.field1064 <= 599 && super.field1065 >= 168 && super.field1065 < 205 && this.field378[1] != -1) {
                this.field284 = true;
                this.field122 = 1;
                this.field186 = true;
            }
            if (super.field1064 >= 597 && super.field1064 <= 627 && super.field1065 >= 168 && super.field1065 < 205 && this.field378[2] != -1) {
                this.field284 = true;
                this.field122 = 2;
                this.field186 = true;
            }
            if (super.field1064 >= 625 && super.field1064 <= 669 && super.field1065 >= 168 && super.field1065 < 203 && this.field378[3] != -1) {
                this.field284 = true;
                this.field122 = 3;
                this.field186 = true;
            }
            if (super.field1064 >= 666 && super.field1064 <= 696 && super.field1065 >= 168 && super.field1065 < 205 && this.field378[4] != -1) {
                this.field284 = true;
                this.field122 = 4;
                this.field186 = true;
            }
            if (super.field1064 >= 694 && super.field1064 <= 724 && super.field1065 >= 168 && super.field1065 < 205 && this.field378[5] != -1) {
                this.field284 = true;
                this.field122 = 5;
                this.field186 = true;
            }
            if (super.field1064 >= 722 && super.field1064 <= 756 && super.field1065 >= 169 && super.field1065 < 205 && this.field378[6] != -1) {
                this.field284 = true;
                this.field122 = 6;
                this.field186 = true;
            }
            if (super.field1064 >= 540 && super.field1064 <= 574 && super.field1065 >= 466 && super.field1065 < 502 && this.field378[7] != -1) {
                this.field284 = true;
                this.field122 = 7;
                this.field186 = true;
            }
            if (super.field1064 >= 572 && super.field1064 <= 602 && super.field1065 >= 466 && super.field1065 < 503 && this.field378[8] != -1) {
                this.field284 = true;
                this.field122 = 8;
                this.field186 = true;
            }
            if (super.field1064 >= 599 && super.field1064 <= 629 && super.field1065 >= 466 && super.field1065 < 503 && this.field378[9] != -1) {
                this.field284 = true;
                this.field122 = 9;
                this.field186 = true;
            }
            if (super.field1064 >= 627 && super.field1064 <= 671 && super.field1065 >= 467 && super.field1065 < 502 && this.field378[10] != -1) {
                this.field284 = true;
                this.field122 = 10;
                this.field186 = true;
            }
            if (super.field1064 >= 669 && super.field1064 <= 699 && super.field1065 >= 466 && super.field1065 < 503 && this.field378[11] != -1) {
                this.field284 = true;
                this.field122 = 11;
                this.field186 = true;
            }
            if (super.field1064 >= 696 && super.field1064 <= 726 && super.field1065 >= 466 && super.field1065 < 503 && this.field378[12] != -1) {
                this.field284 = true;
                this.field122 = 12;
                this.field186 = true;
            }
            if (super.field1064 >= 724 && super.field1064 <= 758 && super.field1065 >= 466 && super.field1065 < 502 && this.field378[13] != -1) {
                this.field284 = true;
                this.field122 = 13;
                this.field186 = true;
            }
            ++field229;
            if (field229 > 145) {
                field229 = 0;
                this.field533.method250(1, 173);
                this.field533.method251(124);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Z")
    public final boolean method108(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg0 <= 0) {
            this.field533.method251(68);
        }
        class41 var5 = class41.method477(arg2);
        for (int var6 = 0; var6 < var5.field1221.length && var5.field1221[var6] != -1; ++var6) {
            class41 var7 = class41.method477(var5.field1221[var6]);
            if (var7.field1199 == 1) {
                var4 |= this.method108(375, arg1, var7.field1213);
            }
            if (var7.field1199 == 6 && (var7.field1209 != -1 || var7.field1210 != -1)) {
                boolean var8 = this.method115(var7, -434);
                int var9;
                if (var8) {
                    var9 = var7.field1210;
                } else {
                    var9 = var7.field1209;
                }
                if (var9 != -1) {
                    class5 var10 = class5.field67[var9];
                    var7.field1240 += arg1;
                    while (var7.field1240 > var10.method27(var7.field1187, (byte) -127)) {
                        var7.field1240 -= var10.method27(var7.field1187, (byte) -127) + 1;
                        ++var7.field1187;
                        if (var7.field1187 >= var10.field68) {
                            var7.field1187 -= var10.field72;
                            if (var7.field1187 < 0 || var7.field1187 >= var10.field68) {
                                var7.field1187 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1199 == 6 && var7.field1196 != 0) {
                int var11 = var7.field1196 >> 16;
                int var12 = var7.field1196 << 16 >> 16;
                int var13 = arg1 * var11;
                int var14 = arg1 * var12;
                var7.field1189 = var7.field1189 + var13 & 2047;
                var7.field1190 = var7.field1190 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method109(byte arg0) {
        if (arg0 == 94) {
            this.field177 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILEGCCHUZS;)V")
    private final void method110(byte arg0, int arg1, class15 arg2) {
        int var4 = arg2.method272(8, (byte) 0);
        if (arg0 != 0) {
            this.field225 = arg2.method261();
        }
        if (var4 < this.field261) {
            for (int var5 = var4; var5 < this.field261; ++var5) {
                this.field517[this.field516++] = this.field262[var5];
            }
        }
        if (var4 > this.field261) {
            signlink.reporterror(this.field123 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field261 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field262[var6];
                class53 var8 = this.field260[var7];
                int var9 = arg2.method272(1, (byte) 0);
                if (var9 == 0) {
                    this.field262[this.field261++] = var7;
                    var8.field1746 = field147;
                } else {
                    int var10 = arg2.method272(2, (byte) 0);
                    if (var10 == 0) {
                        this.field262[this.field261++] = var7;
                        var8.field1746 = field147;
                        this.field264[this.field263++] = var7;
                    } else if (var10 == 1) {
                        this.field262[this.field261++] = var7;
                        var8.field1746 = field147;
                        int var11 = arg2.method272(3, (byte) 0);
                        var8.method594(this.field289, false, var11);
                        int var12 = arg2.method272(1, (byte) 0);
                        if (var12 == 1) {
                            this.field264[this.field263++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field262[this.field261++] = var7;
                        var8.field1746 = field147;
                        int var13 = arg2.method272(3, (byte) 0);
                        var8.method594(this.field289, true, var13);
                        int var14 = arg2.method272(3, (byte) 0);
                        var8.method594(this.field289, true, var14);
                        int var15 = arg2.method272(1, (byte) 0);
                        if (var15 == 1) {
                            this.field264[this.field263++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field517[this.field516++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method111(int arg0) {
        ++this.field540;
        this.method78((byte) 59, true);
        this.method37(true, 5);
        this.method78((byte) 59, false);
        this.method37(false, 5);
        this.method103(-7538);
        this.method137(271);
        if (!this.field427) {
            int var2 = this.field484;
            if (this.field409 / 256 > var2) {
                var2 = this.field409 / 256;
            }
            if (this.field230[4] && this.field287[4] + 128 > var2) {
                var2 = this.field287[4] + 128;
            }
            int var3 = this.field485 + this.field231 & 2047;
            this.method114(this.field456, var3, this.method152(field255.field1721, 0, field255.field1722, this.field367) - 50, var2, var2 * 3 + 600, this.field457, 38459);
        }
        int var4;
        if (!this.field427) {
            var4 = this.method130(-1904);
        } else {
            var4 = this.method131(389);
        }
        int var5 = this.field410;
        int var6 = this.field411;
        int var7 = this.field412;
        int var8 = this.field413;
        int var9 = this.field414;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field230[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field340[var10] * 2 + 1) - (double) this.field340[var10] + Math.sin((double) this.field560[var10] / 100.0D * (double) this.field315[var10]) * (double) this.field287[var10]);
                if (var10 == 0) {
                    this.field410 += var12;
                }
                if (var10 == 1) {
                    this.field411 += var12;
                }
                if (var10 == 2) {
                    this.field412 += var12;
                }
                if (var10 == 3) {
                    this.field414 = this.field414 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field413 += var12;
                    if (this.field413 < 128) {
                        this.field413 = 128;
                    }
                    if (this.field413 > 383) {
                        this.field413 = 383;
                    }
                }
            }
        }
        int var11 = class49.field1372;
        class32.field996 = true;
        class32.field999 = 0;
        class32.field997 = super.field1057 - 4;
        class32.field998 = super.field1058 - 4;
        class35.method383((byte) 6);
        this.field208.method453(this.field414, var4, this.field413, false, this.field411, this.field410, this.field412);
        this.field208.method428(this.field393);
        this.method129((byte) 15);
        this.method106(false);
        if (arg0 >= 2 && arg0 <= 2) {
            this.method176(var11, -6907);
            this.method102((byte) -24);
            this.field361.method581(4, 4, -41725, super.field1049);
            this.field410 = var5;
            this.field411 = var6;
            this.field412 = var7;
            this.field413 = var8;
            this.field414 = var9;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method112(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field498 != 0) {
                this.field498 = 0;
                this.field365 = true;
            }
            int var3 = this.field267[arg1];
            int var4 = this.field268[arg1];
            int var5 = this.field269[arg1];
            int var6 = this.field270[arg1];
            if (arg0 != -41187) {
                this.field173 = !this.field173;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 912) {
                class53 var7 = this.field260[var6];
                if (var7 != null) {
                    this.method140(false, 0, 1, var7.field1706[0], var7.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                    this.field317 = super.field1064;
                    this.field318 = super.field1065;
                    this.field320 = 2;
                    this.field319 = 0;
                    this.field533.method250(1, 23);
                    this.field533.method286(var6, (byte) 9);
                }
            }
            if (var5 == 587) {
                class53 var8 = this.field260[var6];
                if (var8 != null) {
                    this.method140(false, 0, 1, var8.field1706[0], var8.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                    this.field317 = super.field1064;
                    this.field318 = super.field1065;
                    this.field320 = 2;
                    this.field319 = 0;
                    this.field533.method250(1, 166);
                    this.field533.method252(var6);
                }
            }
            if (var5 == 1258) {
                this.method96(var3, var4, 4, var6);
                this.field533.method250(1, 231);
                this.field533.method286(var6 >> 14 & 32767, (byte) 9);
                this.field533.method252(this.field523 + var4);
                this.field533.method252(this.field522 + var3);
            }
            if (var5 == 492) {
                this.field533.method250(1, 229);
                this.field533.method285(true, var4);
                this.field533.method252(this.field424);
                this.field533.method286(var6, (byte) 9);
                this.field533.method284(var3, 33414);
                this.field290 = 0;
                this.field291 = var4;
                this.field292 = var3;
                this.field293 = 2;
                if (class41.method477(var4).field1205 == this.field254) {
                    this.field293 = 1;
                }
                if (class41.method477(var4).field1205 == this.field310) {
                    this.field293 = 3;
                }
            }
            if (var5 == 734) {
                class6 var9 = this.field475[var6];
                if (var9 != null) {
                    this.method140(false, 0, 1, var9.field1706[0], var9.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                    this.field317 = super.field1064;
                    this.field318 = super.field1065;
                    this.field320 = 2;
                    this.field319 = 0;
                    this.field533.method250(1, 180);
                    this.field533.method286(this.field424, (byte) 9);
                    this.field533.method286(var6, (byte) 9);
                }
            }
            if (var5 == 583) {
                boolean var10 = this.method140(false, 0, 0, var3, var4, 0, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                if (!var10) {
                    this.method140(false, 0, 1, var3, var4, 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                }
                this.field317 = super.field1064;
                this.field318 = super.field1065;
                this.field320 = 2;
                this.field319 = 0;
                this.field533.method250(1, 226);
                this.field533.method252(this.field522 + var3);
                this.field533.method285(true, this.field523 + var4);
                this.field533.method285(true, var6);
            }
            if (var5 == 211 && !this.field99) {
                this.field533.method250(1, 163);
                this.field533.method252(var4);
                this.field99 = true;
            }
            if (var5 == 37) {
                class41 var12 = class41.method477(var4);
                this.field423 = 1;
                this.field424 = var4;
                this.field425 = var12.field1185;
                this.field214 = 0;
                this.field284 = true;
                String var13 = var12.field1228;
                if (var13.indexOf(" ") != -1) {
                    var13 = var13.substring(0, var13.indexOf(" "));
                }
                String var14 = var12.field1228;
                if (var14.indexOf(" ") != -1) {
                    var14 = var14.substring(var14.indexOf(" ") + 1);
                }
                this.field426 = var13 + " " + var12.field1177 + " " + var14;
                if (this.field425 == 16) {
                    this.field284 = true;
                    this.field122 = 3;
                    this.field186 = true;
                }
            } else {
                if (var5 == 941) {
                    this.method96(var3, var4, 4, var6);
                    this.field533.method250(1, 105);
                    this.field533.method285(true, this.field523 + var4);
                    this.field533.method286(var6 >> 14 & 32767, (byte) 9);
                    this.field533.method284(this.field522 + var3, 33414);
                }
                if (var5 == 768 || var5 == 443) {
                    String var15 = this.field394[arg1];
                    int var16 = var15.indexOf("@whi@");
                    if (var16 != -1) {
                        String var17 = var15.substring(var16 + 5).trim();
                        String var18 = class67.method578(class67.method575(false, class67.method574(var17)), (byte) -85);
                        boolean var19 = false;
                        for (int var20 = 0; var20 < this.field261; ++var20) {
                            class53 var21 = this.field260[this.field262[var20]];
                            if (var21 != null && var21.field1462 != null && var21.field1462.equalsIgnoreCase(var18)) {
                                this.method140(false, 0, 1, var21.field1706[0], var21.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                                if (var5 == 768) {
                                    this.field533.method250(1, 166);
                                    this.field533.method252(this.field262[var20]);
                                }
                                if (var5 == 443) {
                                    this.field533.method250(1, 23);
                                    this.field533.method286(this.field262[var20], (byte) 9);
                                }
                                var19 = true;
                                break;
                            }
                        }
                        if (!var19) {
                            this.method74("", 0, "Unable to find " + var18, true);
                        }
                    }
                }
                if (var5 == 1948) {
                    class65 var22 = class65.method560(var6);
                    class41 var23 = class41.method477(var4);
                    String var24;
                    if (var23 != null && var23.field1220[var3] >= 100000) {
                        var24 = var23.field1220[var3] + " x " + var22.field1645;
                    } else if (var22.field1656 != null) {
                        var24 = new String(var22.field1656);
                    } else {
                        var24 = "It's a " + var22.field1645 + ".";
                    }
                    this.method74("", 0, var24, true);
                }
                if (var5 == 786) {
                    this.method159(0);
                }
                if (var5 == 1787) {
                    class6 var25 = this.field475[var6];
                    if (var25 != null) {
                        class2 var26 = var25.field86;
                        if (var26.field22 != null) {
                            var26 = var26.method6(this.field187);
                        }
                        if (var26 != null) {
                            String var27;
                            if (var26.field28 != null) {
                                var27 = new String(var26.field28);
                            } else {
                                var27 = "It's a " + var26.field39 + ".";
                            }
                            this.method74("", 0, var27, true);
                        }
                    }
                }
                if (var5 == 482) {
                    this.field533.method250(1, 73);
                    this.field533.method284(var3, 33414);
                    this.field533.method252(this.field217);
                    this.field533.method252(var6);
                    this.field533.method284(var4, 33414);
                    this.field533.method286(this.field216, (byte) 9);
                    this.field533.method252(this.field215);
                    this.field290 = 0;
                    this.field291 = var4;
                    this.field292 = var3;
                    this.field293 = 2;
                    if (class41.method477(var4).field1205 == this.field254) {
                        this.field293 = 1;
                    }
                    if (class41.method477(var4).field1205 == this.field310) {
                        this.field293 = 3;
                    }
                }
                if (var5 == 355 && this.method96(var3, var4, 4, var6)) {
                    this.field533.method250(1, 19);
                    this.field533.method284(var6 >> 14 & 32767, 33414);
                    this.field533.method284(this.field522 + var3, 33414);
                    this.field533.method284(this.field523 + var4, 33414);
                    this.field533.method286(this.field424, (byte) 9);
                }
                if (var5 == 673) {
                    class53 var28 = this.field260[var6];
                    if (var28 != null) {
                        this.method140(false, 0, 1, var28.field1706[0], var28.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        this.field317 = super.field1064;
                        this.field318 = super.field1065;
                        this.field320 = 2;
                        this.field319 = 0;
                        this.field533.method250(1, 118);
                        this.field533.method284(var6, 33414);
                        this.field533.method284(this.field424, 33414);
                    }
                }
                if (var5 == 535) {
                    this.method96(var3, var4, 4, var6);
                    this.field533.method250(1, 162);
                    this.field533.method286(this.field522 + var3, (byte) 9);
                    this.field533.method286(this.field523 + var4, (byte) 9);
                    this.field533.method252(var6 >> 14 & 32767);
                }
                if (var5 == 819) {
                    boolean var29 = this.method140(false, 0, 0, var3, var4, 0, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                    if (!var29) {
                        this.method140(false, 0, 1, var3, var4, 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                    }
                    this.field317 = super.field1064;
                    this.field318 = super.field1065;
                    this.field320 = 2;
                    this.field319 = 0;
                    this.field533.method250(1, 200);
                    this.field533.method285(true, this.field217);
                    this.field533.method286(var6, (byte) 9);
                    this.field533.method286(this.field216, (byte) 9);
                    this.field533.method252(this.field215);
                    this.field533.method286(this.field523 + var4, (byte) 9);
                    this.field533.method286(this.field522 + var3, (byte) 9);
                }
                if (var5 == 963) {
                    this.field533.method250(1, 131);
                    this.field533.method252(var3);
                    this.field533.method284(var4, 33414);
                    this.field533.method284(var6, 33414);
                    this.field290 = 0;
                    this.field291 = var4;
                    this.field292 = var3;
                    this.field293 = 2;
                    if (class41.method477(var4).field1205 == this.field254) {
                        this.field293 = 1;
                    }
                    if (class41.method477(var4).field1205 == this.field310) {
                        this.field293 = 3;
                    }
                }
                if (var5 == 280) {
                    class6 var31 = this.field475[var6];
                    if (var31 != null) {
                        this.method140(false, 0, 1, var31.field1706[0], var31.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        this.field317 = super.field1064;
                        this.field318 = super.field1065;
                        this.field320 = 2;
                        this.field319 = 0;
                        this.field533.method250(1, 161);
                        this.field533.method286(this.field217, (byte) 9);
                        this.field533.method285(true, var6);
                        this.field533.method252(this.field215);
                        this.field533.method252(this.field216);
                    }
                }
                if (var5 == 688 && this.method96(var3, var4, 4, var6)) {
                    this.field533.method250(1, 133);
                    this.field533.method286(var6 >> 14 & 32767, (byte) 9);
                    this.field533.method286(this.field523 + var4, (byte) 9);
                    this.field533.method252(this.field217);
                    this.field533.method285(true, this.field522 + var3);
                    this.field533.method285(true, this.field215);
                    this.field533.method252(this.field216);
                }
                if (var5 == 800) {
                    this.field533.method250(1, 241);
                    this.field533.method285(true, var6);
                    this.field533.method284(var3, 33414);
                    this.field533.method252(var4);
                    this.field290 = 0;
                    this.field291 = var4;
                    this.field292 = var3;
                    this.field293 = 2;
                    if (class41.method477(var4).field1205 == this.field254) {
                        this.field293 = 1;
                    }
                    if (class41.method477(var4).field1205 == this.field310) {
                        this.field293 = 3;
                    }
                }
                if (var5 == 858) {
                    class53 var32 = this.field260[var6];
                    if (var32 != null) {
                        this.method140(false, 0, 1, var32.field1706[0], var32.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        this.field317 = super.field1064;
                        this.field318 = super.field1065;
                        this.field320 = 2;
                        this.field319 = 0;
                        this.field533.method250(1, 167);
                        this.field533.method286(var6, (byte) 9);
                    }
                }
                if (var5 == 1583) {
                    class65 var33 = class65.method560(var6);
                    String var34;
                    if (var33.field1656 != null) {
                        var34 = new String(var33.field1656);
                    } else {
                        var34 = "It's a " + var33.field1645 + ".";
                    }
                    this.method74("", 0, var34, true);
                }
                if (var5 == 9) {
                    class6 var35 = this.field475[var6];
                    if (var35 != null) {
                        this.method140(false, 0, 1, var35.field1706[0], var35.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        this.field317 = super.field1064;
                        this.field318 = super.field1065;
                        this.field320 = 2;
                        this.field319 = 0;
                        this.field533.method250(1, 253);
                        this.field533.method286(var6, (byte) 9);
                    }
                }
                if (var5 == 233) {
                    this.field533.method250(1, 222);
                    this.field533.method284(var6, 33414);
                    this.field533.method284(var4, 33414);
                    this.field533.method285(true, var3);
                    this.field290 = 0;
                    this.field291 = var4;
                    this.field292 = var3;
                    this.field293 = 2;
                    if (class41.method477(var4).field1205 == this.field254) {
                        this.field293 = 1;
                    }
                    if (class41.method477(var4).field1205 == this.field310) {
                        this.field293 = 3;
                    }
                }
                if (var5 == 1225) {
                    int var36 = var6 >> 14 & 32767;
                    class27 var37 = class27.method326(var36);
                    String var38;
                    if (var37.field857 != null) {
                        var38 = new String(var37.field857);
                    } else {
                        var38 = "It's a " + var37.field833 + ".";
                    }
                    this.method74("", 0, var38, true);
                }
                if (var5 == 36) {
                    class41 var39 = class41.method477(var4);
                    boolean var40 = true;
                    if (var39.field1211 > 0) {
                        var40 = this.method40(var39, 4);
                    }
                    if (var40) {
                        this.field533.method250(1, 47);
                        this.field533.method252(var4);
                    }
                }
                if (var5 == 100) {
                    boolean var41 = this.method140(false, 0, 0, var3, var4, 0, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                    if (!var41) {
                        this.method140(false, 0, 1, var3, var4, 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                    }
                    this.field317 = super.field1064;
                    this.field318 = super.field1065;
                    this.field320 = 2;
                    this.field319 = 0;
                    this.field533.method250(1, 34);
                    this.field533.method286(this.field523 + var4, (byte) 9);
                    this.field533.method284(var6, 33414);
                    this.field533.method252(this.field522 + var3);
                }
                if (var5 == 881) {
                    this.field533.method250(1, 82);
                    this.field533.method286(var3, (byte) 9);
                    this.field533.method286(var4, (byte) 9);
                    this.field533.method252(var6);
                    this.field290 = 0;
                    this.field291 = var4;
                    this.field292 = var3;
                    this.field293 = 2;
                    if (class41.method477(var4).field1205 == this.field254) {
                        this.field293 = 1;
                    }
                    if (class41.method477(var4).field1205 == this.field310) {
                        this.field293 = 3;
                    }
                }
                if (var5 == 559) {
                    this.method96(var3, var4, 4, var6);
                    this.field533.method250(1, 179);
                    this.field533.method286(this.field522 + var3, (byte) 9);
                    this.field533.method285(true, var6 >> 14 & 32767);
                    this.field533.method286(this.field523 + var4, (byte) 9);
                }
                if (var5 == 397) {
                    this.field533.method250(1, 127);
                    this.field533.method286(var3, (byte) 9);
                    this.field533.method285(true, var6);
                    this.field533.method285(true, var4);
                    this.field290 = 0;
                    this.field291 = var4;
                    this.field292 = var3;
                    this.field293 = 2;
                    if (class41.method477(var4).field1205 == this.field254) {
                        this.field293 = 1;
                    }
                    if (class41.method477(var4).field1205 == this.field310) {
                        this.field293 = 3;
                    }
                }
                if (var5 == 219) {
                    this.field214 = 1;
                    this.field215 = var3;
                    this.field216 = var4;
                    this.field217 = var6;
                    this.field218 = class65.method560(var6).field1645;
                    this.field423 = 0;
                    this.field284 = true;
                } else {
                    if (var5 == 58) {
                        class6 var43 = this.field475[var6];
                        if (var43 != null) {
                            this.method140(false, 0, 1, var43.field1706[0], var43.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                            this.field317 = super.field1064;
                            this.field318 = super.field1065;
                            this.field320 = 2;
                            this.field319 = 0;
                            this.field533.method250(1, 181);
                            this.field533.method285(true, var6);
                        }
                    }
                    if (var5 == 227) {
                        this.field533.method250(1, 47);
                        this.field533.method252(var4);
                        class41 var44 = class41.method477(var4);
                        if (var44.field1180 != null && var44.field1180[0][0] == 5) {
                            int var45 = var44.field1180[0][1];
                            this.field115[var45] = 1 - this.field115[var45];
                            this.method88(false, var45);
                            this.field284 = true;
                        }
                    }
                    if (var5 == 288) {
                        class53 var46 = this.field260[var6];
                        if (var46 != null) {
                            this.method140(false, 0, 1, var46.field1706[0], var46.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                            this.field317 = super.field1064;
                            this.field318 = super.field1065;
                            this.field320 = 2;
                            this.field319 = 0;
                            this.field533.method250(1, 140);
                            this.field533.method285(true, var6);
                        }
                    }
                    if (var5 == 485) {
                        boolean var47 = this.method140(false, 0, 0, var3, var4, 0, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        if (!var47) {
                            this.method140(false, 0, 1, var3, var4, 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        }
                        this.field317 = super.field1064;
                        this.field318 = super.field1065;
                        this.field320 = 2;
                        this.field319 = 0;
                        this.field533.method250(1, 171);
                        this.field533.method252(var6);
                        this.field533.method285(true, this.field523 + var4);
                        this.field533.method285(true, this.field522 + var3);
                    }
                    if (var5 == 302) {
                        boolean var49 = this.method140(false, 0, 0, var3, var4, 0, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        if (!var49) {
                            this.method140(false, 0, 1, var3, var4, 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        }
                        this.field317 = super.field1064;
                        this.field318 = super.field1065;
                        this.field320 = 2;
                        this.field319 = 0;
                        this.field533.method250(1, 60);
                        this.field533.method252(this.field522 + var3);
                        this.field533.method285(true, this.field424);
                        this.field533.method284(var6, 33414);
                        this.field533.method286(this.field523 + var4, (byte) 9);
                    }
                    if (var5 == 440) {
                        String var51 = this.field394[arg1];
                        int var52 = var51.indexOf("@whi@");
                        if (var52 != -1) {
                            if (this.field254 == -1) {
                                this.method159(0);
                                this.field213 = var51.substring(var52 + 5).trim();
                                this.field490 = false;
                                this.field143 = this.field254 = class41.field1194;
                            } else {
                                this.method74("", 0, "Please close the interface you have open before using 'report abuse'", true);
                            }
                        }
                    }
                    if (var5 == 875) {
                        this.field533.method250(1, 104);
                        this.field533.method284(var3, 33414);
                        this.field533.method285(true, var4);
                        this.field533.method252(var6);
                        this.field290 = 0;
                        this.field291 = var4;
                        this.field292 = var3;
                        this.field293 = 2;
                        if (class41.method477(var4).field1205 == this.field254) {
                            this.field293 = 1;
                        }
                        if (class41.method477(var4).field1205 == this.field310) {
                            this.field293 = 3;
                        }
                    }
                    if (var5 == 50) {
                        class6 var53 = this.field475[var6];
                        if (var53 != null) {
                            this.method140(false, 0, 1, var53.field1706[0], var53.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                            this.field317 = super.field1064;
                            this.field318 = super.field1065;
                            this.field320 = 2;
                            this.field319 = 0;
                            ++field358;
                            if (field358 >= 94) {
                                this.field533.method250(1, 240);
                                this.field533.method254(12002440);
                                field358 = 0;
                            }
                            this.field533.method250(1, 30);
                            this.field533.method252(var6);
                        }
                    }
                    if (var5 == 97) {
                        class6 var54 = this.field475[var6];
                        if (var54 != null) {
                            this.method140(false, 0, 1, var54.field1706[0], var54.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                            this.field317 = super.field1064;
                            this.field318 = super.field1065;
                            this.field320 = 2;
                            this.field319 = 0;
                            if ((var6 & 3) == 0) {
                                ++field395;
                            }
                            if (field395 >= 93) {
                                this.field533.method250(1, 95);
                                field395 = 0;
                            }
                            this.field533.method250(1, 146);
                            this.field533.method284(var6, 33414);
                        }
                    }
                    if (var5 == 866) {
                        this.field533.method250(1, 214);
                        this.field533.method284(var4, 33414);
                        this.field533.method284(var6, 33414);
                        this.field533.method252(var3);
                        this.field290 = 0;
                        this.field291 = var4;
                        this.field292 = var3;
                        this.field293 = 2;
                        if (class41.method477(var4).field1205 == this.field254) {
                            this.field293 = 1;
                        }
                        if (class41.method477(var4).field1205 == this.field310) {
                            this.field293 = 3;
                        }
                    }
                    if (var5 == 613) {
                        boolean var55 = this.method140(false, 0, 0, var3, var4, 0, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        if (!var55) {
                            this.method140(false, 0, 1, var3, var4, 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        }
                        this.field317 = super.field1064;
                        this.field318 = super.field1065;
                        this.field320 = 2;
                        this.field319 = 0;
                        field472 += var6;
                        if (field472 >= 114) {
                            this.field533.method250(1, 255);
                            this.field533.method254(421994);
                            field472 = 0;
                        }
                        this.field533.method250(1, 187);
                        this.field533.method284(this.field522 + var3, 33414);
                        this.field533.method285(true, var6);
                        this.field533.method252(this.field523 + var4);
                    }
                    if (var5 == 984) {
                        this.field533.method250(1, 136);
                        this.field533.method252(var4);
                        this.field533.method284(var6, 33414);
                        this.field533.method285(true, var3);
                        this.field290 = 0;
                        this.field291 = var4;
                        this.field292 = var3;
                        this.field293 = 2;
                        if (class41.method477(var4).field1205 == this.field254) {
                            this.field293 = 1;
                        }
                        if (class41.method477(var4).field1205 == this.field310) {
                            this.field293 = 3;
                        }
                    }
                    if (var5 == 285) {
                        field131 += var4;
                        if (field131 >= 112) {
                            this.field533.method250(1, 247);
                            this.field533.method251(199);
                            field131 = 0;
                        }
                        this.field533.method250(1, 110);
                        this.field533.method286(var3, (byte) 9);
                        this.field533.method285(true, var6);
                        this.field533.method286(var4, (byte) 9);
                        this.field290 = 0;
                        this.field291 = var4;
                        this.field292 = var3;
                        this.field293 = 2;
                        if (class41.method477(var4).field1205 == this.field254) {
                            this.field293 = 1;
                        }
                        if (class41.method477(var4).field1205 == this.field310) {
                            this.field293 = 3;
                        }
                    }
                    if (var5 == 90) {
                        class53 var57 = this.field260[var6];
                        if (var57 != null) {
                            this.method140(false, 0, 1, var57.field1706[0], var57.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                            this.field317 = super.field1064;
                            this.field318 = super.field1065;
                            this.field320 = 2;
                            this.field319 = 0;
                            field112 += var6;
                            if (field112 >= 68) {
                                this.field533.method250(1, 232);
                                this.field533.method252(7862);
                                field112 = 0;
                            }
                            this.field533.method250(1, 152);
                            this.field533.method252(var6);
                        }
                    }
                    if (var5 == 703) {
                        class6 var58 = this.field475[var6];
                        if (var58 != null) {
                            this.method140(false, 0, 1, var58.field1706[0], var58.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                            this.field317 = super.field1064;
                            this.field318 = super.field1065;
                            this.field320 = 2;
                            this.field319 = 0;
                            this.field533.method250(1, 32);
                            this.field533.method284(var6, 33414);
                        }
                    }
                    if (var5 == 705) {
                        this.method96(var3, var4, 4, var6);
                        this.field533.method250(1, 139);
                        this.field533.method284(this.field522 + var3, 33414);
                        this.field533.method252(var6 >> 14 & 32767);
                        this.field533.method285(true, this.field523 + var4);
                    }
                    if (var5 == 131) {
                        class53 var59 = this.field260[var6];
                        if (var59 != null) {
                            this.method140(false, 0, 1, var59.field1706[0], var59.field1707[0], 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                            this.field317 = super.field1064;
                            this.field318 = super.field1065;
                            this.field320 = 2;
                            this.field319 = 0;
                            this.field533.method250(1, 8);
                            this.field533.method252(var6);
                            this.field533.method252(this.field217);
                            this.field533.method286(this.field215, (byte) 9);
                            this.field533.method284(this.field216, 33414);
                        }
                    }
                    if (var5 == 342 || var5 == 539 || var5 == 388 || var5 == 711) {
                        String var60 = this.field394[arg1];
                        int var61 = var60.indexOf("@whi@");
                        if (var61 != -1) {
                            long var62 = class67.method574(var60.substring(var61 + 5).trim());
                            if (var5 == 342) {
                                this.method169(var62, this.field580);
                            }
                            if (var5 == 539) {
                                this.method141(5, var62);
                            }
                            if (var5 == 388) {
                                this.method132(false, var62);
                            }
                            if (var5 == 711) {
                                this.method87((byte) -33, var62);
                            }
                        }
                    }
                    if (var5 == 738) {
                        this.field533.method250(1, 47);
                        this.field533.method252(var4);
                        class41 var64 = class41.method477(var4);
                        if (var64.field1180 != null && var64.field1180[0][0] == 5) {
                            int var65 = var64.field1180[0][1];
                            if (this.field115[var65] != var64.field1208[0]) {
                                this.field115[var65] = var64.field1208[0];
                                this.method88(false, var65);
                                this.field284 = true;
                            }
                        }
                    }
                    if (var5 == 17) {
                        String var66 = this.field394[arg1];
                        int var67 = var66.indexOf("@whi@");
                        if (var67 != -1) {
                            long var68 = class67.method574(var66.substring(var67 + 5).trim());
                            int var70 = -1;
                            for (int var71 = 0; var71 < this.field222; ++var71) {
                                if (this.field500[var71] == var68) {
                                    var70 = var71;
                                    break;
                                }
                            }
                            if (var70 != -1 && this.field144[var70] > 0) {
                                this.field365 = true;
                                this.field498 = 0;
                                this.field518 = true;
                                this.field355 = "";
                                this.field558 = 3;
                                this.field276 = this.field500[var70];
                                this.field201 = "Enter message to send to " + this.field574[var70];
                            }
                        }
                    }
                    if (var5 == 816) {
                        this.field533.method250(1, 244);
                        this.field533.method285(true, var3);
                        this.field533.method286(var4, (byte) 9);
                        this.field533.method286(var6, (byte) 9);
                        this.field290 = 0;
                        this.field291 = var4;
                        this.field292 = var3;
                        this.field293 = 2;
                        if (class41.method477(var4).field1205 == this.field254) {
                            this.field293 = 1;
                        }
                        if (class41.method477(var4).field1205 == this.field310) {
                            this.field293 = 3;
                        }
                    }
                    if (var5 == 46) {
                        boolean var72 = this.method140(false, 0, 0, var3, var4, 0, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        if (!var72) {
                            this.method140(false, 0, 1, var3, var4, 1, 0, field255.field1706[0], 2, 5, field255.field1707[0], 0);
                        }
                        this.field317 = super.field1064;
                        this.field318 = super.field1065;
                        this.field320 = 2;
                        this.field319 = 0;
                        this.field533.method250(1, 176);
                        this.field533.method286(this.field522 + var3, (byte) 9);
                        this.field533.method285(true, this.field523 + var4);
                        this.field533.method285(true, var6);
                    }
                    if (var5 == 506) {
                        if (!this.field528) {
                            this.field208.method452((byte) 97, super.field1065 - 4, super.field1064 - 4);
                        } else {
                            this.field208.method452((byte) 97, var4 - 4, var3 - 4);
                        }
                    }
                    if (var5 == 841) {
                        this.method53(this.field468, (byte) -104);
                        this.field468 = -1;
                        this.field365 = true;
                    }
                    this.field214 = 0;
                    this.field423 = 0;
                    this.field284 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;IIILjava/lang/String;)LTKEGJSFV;")
    public final class58 method113(int arg0, String arg1, int arg2, int arg3, int arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field549[0] != null) {
                var7 = this.field549[0].method245(arg4, true);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field294.reset();
            this.field294.update(var7);
            int var9 = (int) this.field294.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class58((byte) -74, var7);
        } else {
            int var11 = 0;
            this.field224 += arg0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method92("Requesting " + arg1, arg3, (byte) 8);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method99(arg5 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class15 var17 = new class15(var16, false);
                    var17.field709 = 3;
                    int var18 = var17.method265() + 6;
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
                            this.method92("Loading " + arg1 + " - " + var23 + "%", arg3, (byte) 8);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field549[0] != null) {
                            this.field549[0].method246(3, var7, var7.length, arg4);
                        }
                    } catch (Exception var29) {
                        this.field549[0] = null;
                    }
                    if (var7 != null) {
                        this.field294.reset();
                        this.field294.update(var7);
                        int var24 = (int) this.field294.getValue();
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
                            this.method92("Game updated - please reload page", arg3, (byte) 8);
                            var26 = 10;
                        } else {
                            this.method92(var12 + " - Retrying in " + var26, arg3, (byte) 8);
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
                    this.field445 = !this.field445;
                }
            }
            return new class58((byte) -74, var7);
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg1 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class32.field1001[var8];
            int var14 = class32.field1002[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class32.field1001[var9];
            int var17 = class32.field1002[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field410 = arg0 - var10;
        this.field411 = arg2 - var11;
        this.field412 = arg5 - var12;
        this.field413 = arg3;
        this.field414 = arg1;
        if (arg6 == 38459) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LLORGYGVM;I)Z")
    public final boolean method115(class41 arg0, int arg1) {
        if (arg0.field1247 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1247.length; ++var3) {
                int var4 = this.method125(0, arg0, var3);
                int var5 = arg0.field1208[var3];
                if (arg0.field1247[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1247[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1247[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 >= 0) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field127 = Integer.parseInt(this.getParameter("nodeid"));
        field128 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method104(0);
        } else {
            method144(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field129 = false;
        } else {
            field129 = true;
        }
        this.method409(1, 503, 765);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BILEGCCHUZS;)V")
    private final void method116(byte arg0, int arg1, class15 arg2) {
        for (int var4 = 0; var4 < this.field263; ++var4) {
            int var5 = this.field264[var4];
            class53 var6 = this.field260[var5];
            int var7 = arg2.method261();
            if ((var7 & 32) != 0) {
                var7 += arg2.method261() << 8;
            }
            this.method95(arg2, 590, var6, var5, var7);
        }
        if (this.field554 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ILEGCCHUZS;I)V")
    private final void method117(int arg0, class15 arg1, int arg2) {
        this.field516 = 0;
        this.field263 = 0;
        if (arg0 != -23633) {
            field275 = this.field274.method522();
        }
        this.method71(-696, arg1, arg2);
        this.method76(376, arg1, arg2);
        this.method69(arg1, arg2, 0);
        for (int var4 = 0; var4 < this.field516; ++var4) {
            int var6 = this.field517[var4];
            if (field147 != this.field475[var6].field1746) {
                this.field475[var6].field86 = null;
                this.field475[var6] = null;
            }
        }
        if (arg1.field709 != arg2) {
            signlink.reporterror(this.field123 + " size mismatch in getnpcpos - pos:" + arg1.field709 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field476; ++var5) {
                if (this.field475[this.field477[var5]] == null) {
                    signlink.reporterror(this.field123 + " null entry in npc list - pos:" + var5 + " size:" + this.field476);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method118(int arg0) {
        int var2 = this.field101 * 128 + 64;
        int var3 = this.field102 * 128 + 64;
        int var4 = this.method152(var2, 0, var3, this.field367) - this.field103;
        if (this.field410 < var2) {
            this.field410 += (var2 - this.field410) * this.field105 / 1000 + this.field104;
            if (this.field410 > var2) {
                this.field410 = var2;
            }
        }
        if (this.field410 > var2) {
            this.field410 -= (this.field410 - var2) * this.field105 / 1000 + this.field104;
            if (this.field410 < var2) {
                this.field410 = var2;
            }
        }
        if (this.field411 < var4) {
            this.field411 += (var4 - this.field411) * this.field105 / 1000 + this.field104;
            if (this.field411 > var4) {
                this.field411 = var4;
            }
        }
        if (this.field411 > var4) {
            this.field411 -= (this.field411 - var4) * this.field105 / 1000 + this.field104;
            if (this.field411 < var4) {
                this.field411 = var4;
            }
        }
        if (this.field412 < var3) {
            this.field412 += (var3 - this.field412) * this.field105 / 1000 + this.field104;
            if (this.field412 > var3) {
                this.field412 = var3;
            }
        }
        if (this.field412 > var3) {
            this.field412 -= (this.field412 - var3) * this.field105 / 1000 + this.field104;
            if (this.field412 < var3) {
                this.field412 = var3;
            }
        }
        ++field174;
        if (field174 > 75) {
            field174 = 0;
            this.field533.method250(1, 183);
        }
        int var5 = this.field508 * 128 + 64;
        int var6 = this.field509 * 128 + 64;
        if (arg0 != -9251) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        int var8 = this.method152(var5, 0, var6, this.field367) - this.field510;
        int var9 = var5 - this.field410;
        int var10 = var8 - this.field411;
        int var11 = var6 - this.field412;
        int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
        int var13 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 2047;
        int var14 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 2047;
        if (var13 < 128) {
            var13 = 128;
        }
        if (var13 > 383) {
            var13 = 383;
        }
        if (this.field413 < var13) {
            this.field413 += (var13 - this.field413) * this.field512 / 1000 + this.field511;
            if (this.field413 > var13) {
                this.field413 = var13;
            }
        }
        if (this.field413 > var13) {
            this.field413 -= (this.field413 - var13) * this.field512 / 1000 + this.field511;
            if (this.field413 < var13) {
                this.field413 = var13;
            }
        }
        int var15 = var14 - this.field414;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 > 0) {
            this.field414 += this.field512 * var15 / 1000 + this.field511;
            this.field414 &= 2047;
        }
        if (var15 < 0) {
            this.field414 -= -var15 * this.field512 / 1000 + this.field511;
            this.field414 &= 2047;
        }
        int var16 = var14 - this.field414;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            this.field414 = var14;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    private final void method119(boolean arg0) {
        class57 var2 = (class57) this.field363.method395();
        this.field529 &= arg0;
        while (var2 != null) {
            if (var2.field1499 == -1) {
                var2.field1500 = 0;
                this.method160(-31799, var2);
            } else {
                var2.method379();
            }
            var2 = (class57) this.field363.method397(-125);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 346);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field127 = Integer.parseInt(arg0[0]);
                field128 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method104(0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method144(0);
                }
                if (arg0[3].equals("free")) {
                    field129 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field129 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method408(503, 765, false);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field208.method440(arg2, arg1, arg5);
        if (var7 != 0) {
            int var8 = this.field208.method444(arg2, arg1, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field569.field879;
            int var13 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class27 var15 = class27.method326(var14);
            if (var15.field835 != -1) {
                class11 var16 = this.field380[var15.field835];
                if (var16 != null) {
                    int var17 = (var15.field851 * 4 - var16.field609) / 2;
                    int var18 = (var15.field832 * 4 - var16.field610) / 2;
                    var16.method183(7964, (104 - arg5 - var15.field832) * 4 + 48 + var18, arg1 * 4 + 48 + var17);
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
        int var19 = this.field208.method442(arg2, arg1, arg5);
        if (var19 != 0) {
            int var20 = this.field208.method444(arg2, arg1, arg5, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class27 var24 = class27.method326(var23);
            if (var24.field835 != -1) {
                class11 var25 = this.field380[var24.field835];
                if (var25 != null) {
                    int var26 = (var24.field851 * 4 - var25.field609) / 2;
                    int var27 = (var24.field832 * 4 - var25.field610) / 2;
                    var25.method183(7964, (104 - arg5 - var24.field832) * 4 + 48 + var27, arg1 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field569.field879;
                int var30 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
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
        int var31 = this.field208.method443(arg2, arg1, arg5);
        this.field224 += arg3;
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class27 var33 = class27.method326(var32);
            if (var33.field835 != -1) {
                class11 var34 = this.field380[var33.field835];
                if (var34 != null) {
                    int var35 = (var33.field851 * 4 - var34.field609) / 2;
                    int var36 = (var33.field832 * 4 - var34.field610) / 2;
                    var34.method183(7964, (104 - arg5 - var33.field832) * 4 + 48 + var36, arg1 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method121(int arg0) {
        this.field572 = new class11(this.field240, "titlebox", 0);
        this.field573 = new class11(this.field240, "titlebutton", 0);
        this.field578 = new class11[12];
        this.field224 += arg0;
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field578[var2] = new class11(this.field240, "runes", var2);
        }
        this.field530 = new class28(128, 265);
        this.field531 = new class28(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field530.field879[var3] = this.field450.field1672[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field531.field879[var4] = this.field451.field1672[var4];
        }
        this.field375 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field375[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field375[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field375[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field375[var8 + 192] = 16777215;
        }
        this.field376 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field376[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field376[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field376[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field376[var12 + 192] = 16777215;
        }
        this.field377 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field377[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field377[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field377[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field377[var16 + 192] = 16777215;
        }
        this.field374 = new int[256];
        this.field307 = new int[32768];
        this.field308 = new int[32768];
        this.method31(true, (class11) null);
        this.field502 = new int[32768];
        this.field503 = new int[32768];
        this.method92("Connecting to fileserver", 10, (byte) 8);
        if (!this.field219) {
            this.field387 = true;
            this.field219 = true;
            this.method51(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method122(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field130 && this.field180 == 2 && class43.field1282 != this.field367) {
            this.method81("Loading - please wait.", 0, (String) null);
            this.field180 = 1;
            this.field139 = System.currentTimeMillis();
        }
        if (this.field180 == 1) {
            int var3 = this.method123(824);
            if (var3 != 0 && System.currentTimeMillis() - this.field139 > 360000L) {
                signlink.reporterror(this.field123 + " glcfb " + this.field178 + "," + var3 + "," + field130 + "," + this.field549[0] + "," + this.field256.method233() + "," + this.field367 + "," + this.field576 + "," + this.field577);
                this.field139 = System.currentTimeMillis();
            }
        }
        if (this.field180 == 2 && this.field367 != this.field309) {
            this.field309 = this.field367;
            this.method133(this.field367, 1);
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)I")
    public final int method123(int arg0) {
        int var2 = 80 / arg0;
        for (int var3 = 0; var3 < this.field364.length; ++var3) {
            if (this.field364[var3] == null && this.field350[var3] != -1) {
                return -1;
            }
            if (this.field321[var3] == null && this.field351[var3] != -1) {
                return -2;
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field364.length; ++var5) {
            byte[] var6 = this.field321[var5];
            if (var6 != null) {
                int var7 = (this.field349[var5] >> 8) * 64 - this.field522;
                int var8 = (this.field349[var5] & 255) * 64 - this.field523;
                if (this.field190) {
                    var7 = 10;
                    var8 = 10;
                }
                var4 &= class43.method491(false, var6, var7, var8);
            }
        }
        if (!var4) {
            return -3;
        } else if (this.field579) {
            return -4;
        } else {
            this.field180 = 2;
            class43.field1282 = this.field367;
            this.method161(true);
            this.field533.method250(1, 209);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method124(boolean arg0, int arg1) {
        class41 var3 = class41.method477(arg1);
        for (int var4 = 0; var4 < var3.field1221.length && var3.field1221[var4] != -1; ++var4) {
            class41 var5 = class41.method477(var3.field1221[var4]);
            if (var5.field1199 == 1) {
                this.method124(true, var5.field1213);
            }
            var5.field1187 = 0;
            var5.field1240 = 0;
        }
        if (!arg0) {
            this.field527 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLORGYGVM;I)I")
    public final int method125(int arg0, class41 arg1, int arg2) {
        this.field224 += arg0;
        if (arg1.field1180 != null && arg2 < arg1.field1180.length) {
            try {
                int[] var4 = arg1.field1180[arg2];
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
                        var9 = this.field581[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field164[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field403[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class41 var11 = class41.method477(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class65.field1621 && (!class65.method560(var12).field1625 || field129)) {
                            for (int var13 = 0; var13 < var11.field1197.length; ++var13) {
                                if (var12 + 1 == var11.field1197[var13]) {
                                    var9 += var11.field1220[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field115[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field189[this.field164[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field115[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field255.field1467;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class44.field1296; ++var14) {
                            if (class44.field1298[var14]) {
                                var9 += this.field164[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class41 var15 = class41.method477(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class65.field1621 && (!class65.method560(var16).field1625 || field129)) {
                            for (int var17 = 0; var17 < var15.field1197.length; ++var17) {
                                if (var15.field1197[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field435;
                    }
                    if (var8 == 12) {
                        var9 = this.field142;
                    }
                    if (var8 == 13) {
                        int var18 = this.field115[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class16 var21 = class16.field724[var20];
                        int var22 = var21.field726;
                        int var23 = var21.field727;
                        int var24 = var21.field728;
                        int var25 = field446[var24 - var23];
                        var9 = this.field115[var22] >> var23 & var25;
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
                        var9 = (field255.field1721 >> 7) + this.field522;
                    }
                    if (var8 == 19) {
                        var9 = (field255.field1722 >> 7) + this.field523;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(LEGCCHUZS;II)V")
    private final void method126(class15 arg0, int arg1, int arg2) {
        if (arg1 == 9) {
            while (arg0.field710 + 10 < arg2 * 8) {
                int var4 = arg0.method272(11, (byte) 0);
                if (var4 == 2047) {
                    break;
                }
                if (this.field260[var4] == null) {
                    this.field260[var4] = new class53();
                    if (this.field265[var4] != null) {
                        this.field260[var4].method521(this.field265[var4], 352);
                    }
                }
                this.field262[this.field261++] = var4;
                class53 var5 = this.field260[var4];
                var5.field1746 = field147;
                int var6 = arg0.method272(1, (byte) 0);
                int var7 = arg0.method272(5, (byte) 0);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg0.method272(1, (byte) 0);
                if (var8 == 1) {
                    this.field264[this.field263++] = var4;
                }
                int var9 = arg0.method272(5, (byte) 0);
                if (var9 > 15) {
                    var9 -= 32;
                }
                var5.method591(var6 == 1, field255.field1707[0] + var7, -15802, field255.field1706[0] + var9);
            }
            arg0.method273((byte) -2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method127(byte arg0) {
        if (arg0 == 0) {
            if (!this.field323 && !this.field161 && !this.field460) {
                ++field147;
                if (!this.field529) {
                    this.method43((byte) 1);
                } else {
                    this.method163(1);
                }
                this.method162(9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method128(int arg0) {
        if (arg0 < 0) {
            this.field368 = true;
            try {
                long var2 = System.currentTimeMillis();
                int var4 = 0;
                int var5 = 20;
                while (this.field219) {
                    ++this.field206;
                    this.method157(false);
                    this.method157(false);
                    this.method174(0);
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
            this.field368 = false;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method129(byte arg0) {
        this.field242 = 0;
        for (int var2 = -1; var2 < this.field476 + this.field261; ++var2) {
            class71 var19;
            if (var2 == -1) {
                var19 = field255;
            } else if (var2 < this.field261) {
                var19 = this.field260[this.field262[var2]];
            } else {
                var19 = this.field475[this.field477[var2 - this.field261]];
            }
            if (var19 != null && var19.method29(true)) {
                if (var19 instanceof class6) {
                    class2 var20 = ((class6) var19).field86;
                    if (var20.field22 != null) {
                        var20 = var20.method6(this.field187);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field261) {
                    class2 var23 = ((class6) var19).field86;
                    if (var23.field30 >= 0 && var23.field30 < this.field492.length) {
                        this.method34(var19, (byte) 5, var19.field1715 + 15);
                        if (this.field495 > -1) {
                            this.field492[var23.field30].method335(7964, this.field496 - 30, this.field495 - 12);
                        }
                    }
                    if (this.field298 == 1 && this.field477[var2 - this.field261] == this.field313 && field147 % 20 < 10) {
                        this.method34(var19, (byte) 5, var19.field1715 + 15);
                        if (this.field495 > -1) {
                            this.field488[0].method335(7964, this.field496 - 28, this.field495 - 12);
                        }
                    }
                } else {
                    int var21 = 30;
                    class53 var22 = (class53) var19;
                    if (var22.field1447 != -1 || var22.field1448 != -1) {
                        this.method34(var19, (byte) 5, var19.field1715 + 15);
                        if (this.field495 > -1) {
                            if (var22.field1447 != -1) {
                                this.field438[var22.field1447].method335(7964, this.field496 - var21, this.field495 - 12);
                                var21 += 25;
                            }
                            if (var22.field1448 != -1) {
                                this.field492[var22.field1448].method335(7964, this.field496 - var21, this.field495 - 12);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field298 == 10 && this.field262[var2] == this.field235) {
                        this.method34(var19, (byte) 5, var19.field1715 + 15);
                        if (this.field495 > -1) {
                            this.field488[1].method335(7964, this.field496 - var21, this.field495 - 12);
                        }
                    }
                }
                if (var19.field1712 != null && (var2 >= this.field261 || this.field497 == 0 || this.field497 == 3 || this.field497 == 1 && this.method91(false, ((class53) var19).field1462))) {
                    this.method34(var19, (byte) 5, var19.field1715);
                    if (this.field495 > -1 && this.field242 < this.field243) {
                        this.field247[this.field242] = this.field193.method529(37461, var19.field1712) / 2;
                        this.field246[this.field242] = this.field193.field1484;
                        this.field244[this.field242] = this.field495;
                        this.field245[this.field242] = this.field496;
                        this.field248[this.field242] = var19.field1739;
                        this.field249[this.field242] = var19.field1740;
                        this.field250[this.field242] = var19.field1714;
                        this.field251[this.field242++] = var19.field1712;
                        if (this.field175 == 0 && var19.field1740 >= 1 && var19.field1740 <= 3) {
                            this.field246[this.field242] += 10;
                            this.field245[this.field242] += 5;
                        }
                        if (this.field175 == 0 && var19.field1740 == 4) {
                            this.field247[this.field242] = 60;
                        }
                        if (this.field175 == 0 && var19.field1740 == 5) {
                            this.field246[this.field242] += 5;
                        }
                    }
                }
                if (var19.field1708 > field147) {
                    this.method34(var19, (byte) 5, var19.field1715 + 15);
                    if (this.field495 > -1) {
                        int var24 = var19.field1709 * 30 / var19.field1710;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class35.method385(this.field496 - 3, var24, 5, this.field495 - 15, (byte) 5, 65280);
                        class35.method385(this.field496 - 3, 30 - var24, 5, this.field495 - 15 + var24, (byte) 5, 16711680);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1733[var25] > field147) {
                        this.method34(var19, (byte) 5, var19.field1715 / 2);
                        if (this.field495 > -1) {
                            if (var25 == 1) {
                                this.field496 -= 20;
                            }
                            if (var25 == 2) {
                                this.field495 -= 15;
                                this.field496 -= 10;
                            }
                            if (var25 == 3) {
                                this.field495 += 15;
                                this.field496 -= 10;
                            }
                            this.field470[var19.field1732[var25]].method335(7964, this.field496 - 12, this.field495 - 12);
                            this.field191.method526(0, 3, this.field496 + 4, this.field495, String.valueOf(var19.field1731[var25]));
                            this.field191.method526(16777215, 3, this.field496 + 3, this.field495 - 1, String.valueOf(var19.field1731[var25]));
                        }
                    }
                }
            }
        }
        ++field277;
        if (field277 > 96) {
            field277 = 0;
            this.field533.method250(1, 138);
        }
        for (int var3 = 0; var3 < this.field242; ++var3) {
            int var4 = this.field244[var3];
            int var5 = this.field245[var3];
            int var6 = this.field247[var3];
            int var7 = this.field246[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field245[var18] - this.field246[var18] && var5 - var7 < this.field245[var18] + 2 && var4 - var6 < this.field247[var18] + this.field244[var18] && var4 + var6 > this.field244[var18] - this.field247[var18] && this.field245[var18] - this.field246[var18] < var5) {
                        var5 = this.field245[var18] - this.field246[var18];
                        var8 = true;
                    }
                }
            }
            this.field495 = this.field244[var3];
            this.field496 = this.field245[var3] = var5;
            String var9 = this.field251[var3];
            if (this.field175 == 0) {
                int var10 = 16776960;
                if (this.field248[var3] < 6) {
                    var10 = this.field491[this.field248[var3]];
                }
                if (this.field248[var3] == 6) {
                    var10 = this.field540 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field248[var3] == 7) {
                    var10 = this.field540 % 20 < 10 ? 255 : 65535;
                }
                if (this.field248[var3] == 8) {
                    var10 = this.field540 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field248[var3] == 9) {
                    int var11 = 150 - this.field250[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field248[var3] == 10) {
                    int var12 = 150 - this.field250[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field248[var3] == 11) {
                    int var13 = 150 - this.field250[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field249[var3] == 0) {
                    this.field193.method526(0, 3, this.field496 + 1, this.field495, var9);
                    this.field193.method526(var10, 3, this.field496, this.field495, var9);
                }
                if (this.field249[var3] == 1) {
                    this.field193.method531(this.field540, 0, 42587, var9, this.field495, this.field496 + 1);
                    this.field193.method531(this.field540, var10, 42587, var9, this.field495, this.field496);
                }
                if (this.field249[var3] == 2) {
                    this.field193.method532(var9, this.field540, (byte) 0, this.field496 + 1, this.field495, 0);
                    this.field193.method532(var9, this.field540, (byte) 0, this.field496, this.field495, var10);
                }
                if (this.field249[var3] == 3) {
                    this.field193.method533(this.field496 + 1, 150 - this.field250[var3], false, 0, this.field495, var9, this.field540);
                    this.field193.method533(this.field496, 150 - this.field250[var3], false, var10, this.field495, var9, this.field540);
                }
                if (this.field249[var3] == 4) {
                    int var14 = this.field193.method529(37461, var9);
                    int var15 = (150 - this.field250[var3]) * (var14 + 100) / 150;
                    class35.method382(this.field495 + 50, this.field495 - 50, 0, 334, -701);
                    this.field193.method530(this.field496 + 1, var9, this.field495 + 50 - var15, 0, 411);
                    this.field193.method530(this.field496, var9, this.field495 + 50 - var15, var10, 411);
                    class35.method381((byte) 1);
                }
                if (this.field249[var3] == 5) {
                    int var16 = 150 - this.field250[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class35.method382(512, 0, this.field496 - this.field193.field1484 - 1, this.field496 + 5, -701);
                    this.field193.method526(0, 3, this.field496 + 1 + var17, this.field495, var9);
                    this.field193.method526(var10, 3, this.field496 + var17, this.field495, var9);
                    class35.method381((byte) 1);
                }
            } else {
                this.field193.method526(0, 3, this.field496 + 1, this.field495, var9);
                this.field193.method526(16776960, 3, this.field496, this.field495, var9);
            }
        }
        if (arg0 != 15) {
            this.field533.method251(130);
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)I")
    public final int method130(int arg0) {
        int var2 = 3;
        if (arg0 != -1904) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field413 < 310) {
            int var4 = this.field410 >> 7;
            int var5 = this.field412 >> 7;
            int var6 = field255.field1721 >> 7;
            int var7 = field255.field1722 >> 7;
            if ((this.field443[this.field367][var4][var5] & 4) != 0) {
                var2 = this.field367;
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
                    if ((this.field443[this.field367][var4][var5] & 4) != 0) {
                        var2 = this.field367;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field443[this.field367][var4][var5] & 4) != 0) {
                            var2 = this.field367;
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
                    if ((this.field443[this.field367][var4][var5] & 4) != 0) {
                        var2 = this.field367;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field443[this.field367][var4][var5] & 4) != 0) {
                            var2 = this.field367;
                        }
                    }
                }
            }
        }
        if ((this.field443[this.field367][field255.field1721 >> 7][field255.field1722 >> 7] & 4) != 0) {
            var2 = this.field367;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)I")
    public final int method131(int arg0) {
        int var2 = this.method152(this.field410, 0, this.field412, this.field367);
        int var3 = 44 / arg0;
        return var2 - this.field411 < 800 && (this.field443[this.field367][this.field410 >> 7][this.field412 >> 7] & 4) != 0 ? this.field367 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method132(boolean arg0, long arg1) {
        if (arg0) {
            field275 = 367;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field222; ++var4) {
                if (this.field500[var4] == arg1) {
                    --this.field222;
                    this.field284 = true;
                    for (int var5 = var4; var5 < this.field222; ++var5) {
                        this.field574[var5] = this.field574[var5 + 1];
                        this.field144[var5] = this.field144[var5 + 1];
                        this.field500[var5] = this.field500[var5 + 1];
                    }
                    this.field533.method250(1, 48);
                    this.field533.method257(0, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method133(int arg0, int arg1) {
        int[] var3 = this.field569.field879;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field443[arg0][var24][var6] & 24) == 0) {
                    this.field208.method449(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field443[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field208.method449(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        if (arg1 < 1 || arg1 > 1) {
            this.field527 = null;
        }
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field569.method330(true);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field443[arg0][var22][var9] & 24) == 0) {
                    this.method120(var8, var22, arg0, 0, var7, var9);
                }
                if (arg0 < 3 && (this.field443[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method120(var8, var22, arg0 + 1, 0, var7, var9);
                }
            }
        }
        if (this.field361 != null) {
            this.field361.method580(true);
            class49.field1363 = this.field563;
        }
        ++field532;
        if (field532 > 95) {
            field532 = 0;
            this.field533.method250(1, 142);
        }
        this.field271 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field208.method443(this.field367, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class27.method326(var13).field853;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field120[this.field367].field61;
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
                        this.field157[this.field271] = this.field257[var14];
                        this.field272[this.field271] = var15;
                        this.field273[this.field271] = var16;
                        ++this.field271;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method134(byte arg0) {
        if (arg0 == 15) {
            if (super.field1063 == 1) {
                if (super.field1064 >= 6 && super.field1064 <= 106 && super.field1065 >= 467 && super.field1065 <= 499) {
                    this.field497 = (this.field497 + 1) % 4;
                    this.field559 = true;
                    this.field365 = true;
                    this.field533.method250(1, 0);
                    this.field533.method251(this.field497);
                    this.field533.method251(this.field369);
                    this.field533.method251(this.field383);
                }
                if (super.field1064 >= 135 && super.field1064 <= 235 && super.field1065 >= 467 && super.field1065 <= 499) {
                    this.field369 = (this.field369 + 1) % 3;
                    this.field559 = true;
                    this.field365 = true;
                    this.field533.method250(1, 0);
                    this.field533.method251(this.field497);
                    this.field533.method251(this.field369);
                    this.field533.method251(this.field383);
                }
                if (super.field1064 >= 273 && super.field1064 <= 373 && super.field1065 >= 467 && super.field1065 <= 499) {
                    this.field383 = (this.field383 + 1) % 3;
                    this.field559 = true;
                    this.field365 = true;
                    this.field533.method250(1, 0);
                    this.field533.method251(this.field497);
                    this.field533.method251(this.field369);
                    this.field533.method251(this.field383);
                }
                if (super.field1064 >= 412 && super.field1064 <= 512 && super.field1065 >= 467 && super.field1065 <= 499) {
                    if (this.field254 == -1) {
                        this.method159(0);
                        this.field213 = "";
                        this.field490 = false;
                        this.field143 = this.field254 = class41.field1194;
                        return;
                    }
                    this.method74("", 0, "Please close the interface you have open before using 'report abuse'", true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLEGCCHUZS;I)V")
    private final void method135(boolean arg0, class15 arg1, int arg2) {
        if (arg0) {
            this.field393 = this.field274.method522();
        }
        arg1.method271(false);
        int var4 = arg1.method272(1, (byte) 0);
        if (var4 != 0) {
            int var5 = arg1.method272(2, (byte) 0);
            if (var5 == 0) {
                this.field264[this.field263++] = this.field259;
            } else if (var5 == 1) {
                int var6 = arg1.method272(3, (byte) 0);
                field255.method594(this.field289, false, var6);
                int var7 = arg1.method272(1, (byte) 0);
                if (var7 == 1) {
                    this.field264[this.field263++] = this.field259;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method272(3, (byte) 0);
                field255.method594(this.field289, true, var8);
                int var9 = arg1.method272(3, (byte) 0);
                field255.method594(this.field289, true, var9);
                int var10 = arg1.method272(1, (byte) 0);
                if (var10 == 1) {
                    this.field264[this.field263++] = this.field259;
                }
            } else if (var5 == 3) {
                int var11 = arg1.method272(7, (byte) 0);
                int var12 = arg1.method272(7, (byte) 0);
                int var13 = arg1.method272(1, (byte) 0);
                if (var13 == 1) {
                    this.field264[this.field263++] = this.field259;
                }
                int var14 = arg1.method272(1, (byte) 0);
                this.field367 = arg1.method272(2, (byte) 0);
                field255.method591(var14 == 1, var11, -15802, var12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method136(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method412(true);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field254 != -1 && this.field254 == this.field143) {
                        if (var3 == 8 && this.field213.length() > 0) {
                            this.field213 = this.field213.substring(0, this.field213.length() - 1);
                        }
                        break;
                    }
                    if (this.field518) {
                        if (var3 >= 32 && var3 <= 122 && this.field355.length() < 80) {
                            this.field355 = this.field355 + (char) var3;
                            this.field365 = true;
                        }
                        if (var3 == 8 && this.field355.length() > 0) {
                            this.field355 = this.field355.substring(0, this.field355.length() - 1);
                            this.field365 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field518 = false;
                            this.field365 = true;
                            if (this.field558 == 1) {
                                long var4 = class67.method574(this.field355);
                                this.method169(var4, this.field580);
                            }
                            if (this.field558 == 2 && this.field222 > 0) {
                                long var6 = class67.method574(this.field355);
                                this.method132(false, var6);
                            }
                            if (this.field558 == 3 && this.field355.length() > 0) {
                                this.field533.method250(1, 31);
                                this.field533.method251(0);
                                int var8 = this.field533.field709;
                                this.field533.method257(0, this.field276);
                                class70.method589(true, this.field533, this.field355);
                                this.field533.method260(-380, this.field533.field709 - var8);
                                this.field355 = class70.method590(this.field355, 624);
                                this.field355 = class12.method195(this.field355, 624);
                                this.method74(class67.method578(class67.method575(false, this.field276), (byte) -85), 6, this.field355, true);
                                if (this.field369 == 2) {
                                    this.field369 = 1;
                                    this.field559 = true;
                                    this.field533.method250(1, 0);
                                    this.field533.method251(this.field497);
                                    this.field533.method251(this.field369);
                                    this.field533.method251(this.field383);
                                }
                            }
                            if (this.field558 == 4 && this.field322 < 100) {
                                long var9 = class67.method574(this.field355);
                                this.method141(5, var9);
                            }
                            if (this.field558 == 5 && this.field322 > 0) {
                                long var11 = class67.method574(this.field355);
                                this.method87((byte) -33, var11);
                            }
                        }
                    } else if (this.field498 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field381.length() < 10) {
                            this.field381 = this.field381 + (char) var3;
                            this.field365 = true;
                        }
                        if (var3 == 8 && this.field381.length() > 0) {
                            this.field381 = this.field381.substring(0, this.field381.length() - 1);
                            this.field365 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field381.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field381);
                                } catch (Exception var23) {
                                }
                                this.field533.method250(1, 67);
                                this.field533.method255(var13);
                            }
                            this.field498 = 0;
                            this.field365 = true;
                        }
                    } else if (this.field498 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field381.length() < 12) {
                            this.field381 = this.field381 + (char) var3;
                            this.field365 = true;
                        }
                        if (var3 == 8 && this.field381.length() > 0) {
                            this.field381 = this.field381.substring(0, this.field381.length() - 1);
                            this.field365 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field381.length() > 0) {
                                this.field533.method250(1, 143);
                                this.field533.method257(0, class67.method574(this.field381));
                            }
                            this.field498 = 0;
                            this.field365 = true;
                        }
                    } else if (this.field310 == -1 && this.field419 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field311.length() < 80) {
                            this.field311 = this.field311 + (char) var3;
                            this.field365 = true;
                        }
                        if (var3 == 8 && this.field311.length() > 0) {
                            this.field311 = this.field311.substring(0, this.field311.length() - 1);
                            this.field365 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field311.length() > 0) {
                            if (this.field305 == 2) {
                                if (this.field311.equals("::clientdrop")) {
                                    this.method94((byte) -40);
                                }
                                if (this.field311.equals("::lag")) {
                                    this.method138(8);
                                }
                                if (this.field311.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field256.method239(field275, 2); ++var14) {
                                        this.field256.method231(2, var14, field406, (byte) 1);
                                    }
                                }
                                if (this.field311.equals("::fpson")) {
                                    field179 = true;
                                }
                                if (this.field311.equals("::fpsoff")) {
                                    field179 = false;
                                }
                                if (this.field311.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field120[var15].field61[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field311.startsWith("::")) {
                                this.field533.method250(1, 227);
                                this.field533.method251(this.field311.length() - 1);
                                this.field533.method258(this.field311.substring(2));
                            } else {
                                String var18 = this.field311.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field311 = this.field311.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field311 = this.field311.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field311 = this.field311.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field311 = this.field311.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field311 = this.field311.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field311 = this.field311.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field311 = this.field311.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field311 = this.field311.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field311 = this.field311.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field311 = this.field311.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field311 = this.field311.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field311 = this.field311.substring(6);
                                }
                                String var20 = this.field311.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field311 = this.field311.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field311 = this.field311.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field311 = this.field311.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field311 = this.field311.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field311 = this.field311.substring(6);
                                }
                                this.field533.method250(1, 137);
                                this.field533.method251(0);
                                int var22 = this.field533.field709;
                                this.field533.method277(var19, (byte) -105);
                                this.field474.field709 = 0;
                                class70.method589(true, this.field474, this.field311);
                                this.field533.method259(this.field474.field708, 0, this.field474.field709, true);
                                this.field533.method251(var21);
                                this.field533.method260(-380, this.field533.field709 - var22);
                                this.field311 = class70.method590(this.field311, 624);
                                this.field311 = class12.method195(this.field311, 624);
                                field255.field1712 = this.field311;
                                field255.field1739 = var19;
                                field255.field1740 = var21;
                                field255.field1714 = 150;
                                if (this.field305 == 2) {
                                    this.method74("@cr2@" + field255.field1462, 2, field255.field1712, true);
                                } else if (this.field305 == 1) {
                                    this.method74("@cr1@" + field255.field1462, 2, field255.field1712, true);
                                } else {
                                    this.method74(field255.field1462, 2, field255.field1712, true);
                                }
                                if (this.field497 == 2) {
                                    this.field497 = 3;
                                    this.field559 = true;
                                    this.field533.method250(1, 0);
                                    this.field533.method251(this.field497);
                                    this.field533.method251(this.field369);
                                    this.field533.method251(this.field383);
                                }
                            }
                            this.field311 = "";
                            this.field365 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field213.length() < 12) {
                this.field213 = this.field213 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method137(int arg0) {
        int var2 = 51 / arg0;
        for (class17 var3 = (class17) this.field422.method395(); var3 != null; var3 = (class17) this.field422.method397(-125)) {
            if (this.field367 == var3.field735 && !var3.field741) {
                if (field147 >= var3.field740) {
                    var3.method301(0, this.field113);
                    if (var3.field741) {
                        var3.method379();
                    } else {
                        this.field208.method425(60, false, 34, var3.field737, var3, var3.field738, var3.field736, var3.field735, -1, 0);
                    }
                }
            } else {
                var3.method379();
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public void method138(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field206);
        int var2 = 77 / arg0;
        if (this.field256 != null) {
            System.out.println("Od-cycle:" + this.field256.field676);
        }
        System.out.println("loop-cycle:" + field147);
        System.out.println("draw-cycle:" + field114);
        System.out.println("ptype:" + this.field225);
        System.out.println("psize:" + this.field224);
        if (this.field399 != null) {
            this.field399.method548(8);
        }
        super.field1046 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)Ljava/awt/Component;")
    public final Component method139(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            this.field527 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1052 != null ? super.field1052 : this;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1052 != null) {
                    return new URL("http://127.0.0.1:" + (field128 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public final boolean method140(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field202[var15][var35] = 0;
                this.field172[var15][var35] = 99999999;
            }
        }
        int var16 = arg7;
        int var17 = arg10;
        this.field202[arg7][arg10] = 99;
        this.field172[arg7][arg10] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field440[var18] = arg7;
        int var36 = var18 + 1;
        this.field441[var18] = arg10;
        boolean var20 = false;
        int var21 = this.field440.length;
        int[][] var22 = this.field120[this.field367].field61;
        while (var36 != var19) {
            var16 = this.field440[var19];
            var17 = this.field441[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg4 == var17) {
                var20 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && this.field120[this.field367].method21(arg4, arg3, var16, arg1, false, arg11 - 1, var17)) {
                    var20 = true;
                    break;
                }
                if (arg11 < 10 && this.field120[this.field367].method22(var16, arg11 - 1, arg1, arg4, false, var17, arg3)) {
                    var20 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg2 != 0 && this.field120[this.field367].method23(arg2, arg5, -544, arg3, arg4, arg6, var16, var17)) {
                var20 = true;
                break;
            }
            int var34 = this.field172[var16][var17] + 1;
            if (var16 > 0 && this.field202[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field440[var36] = var16 - 1;
                this.field441[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field202[var16 - 1][var17] = 2;
                this.field172[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field202[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field440[var36] = var16 + 1;
                this.field441[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field202[var16 + 1][var17] = 8;
                this.field172[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field202[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field440[var36] = var16;
                this.field441[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field202[var16][var17 - 1] = 1;
                this.field172[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field202[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field440[var36] = var16;
                this.field441[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field202[var16][var17 + 1] = 4;
                this.field172[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field202[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field440[var36] = var16 - 1;
                this.field441[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field202[var16 - 1][var17 - 1] = 3;
                this.field172[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field202[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field440[var36] = var16 + 1;
                this.field441[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field202[var16 + 1][var17 - 1] = 9;
                this.field172[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field202[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field440[var36] = var16 - 1;
                this.field441[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field202[var16 - 1][var17 + 1] = 6;
                this.field172[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field202[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field440[var36] = var16 + 1;
                this.field441[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field202[var16 + 1][var17 + 1] = 12;
                this.field172[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field513 = 0;
        if (arg9 != 5) {
            throw new NullPointerException();
        } else {
            if (!var20) {
                if (arg0) {
                    int var23 = 100;
                    for (int var24 = 1; var24 < 2; ++var24) {
                        for (int var25 = arg3 - var24; var25 <= arg3 + var24; ++var25) {
                            for (int var26 = arg4 - var24; var26 <= arg4 + var24; ++var26) {
                                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field172[var25][var26] < var23) {
                                    var23 = this.field172[var25][var26];
                                    var16 = var25;
                                    var17 = var26;
                                    this.field513 = 1;
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
            this.field440[var27] = var16;
            int var37 = var27 + 1;
            this.field441[var27] = var17;
            int var28;
            int var29 = var28 = this.field202[var16][var17];
            while (arg7 != var16 || arg10 != var17) {
                if (var28 != var29) {
                    var28 = var29;
                    this.field440[var37] = var16;
                    this.field441[var37++] = var17;
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
                var29 = this.field202[var16][var17];
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
                int var31 = this.field440[var37];
                int var32 = this.field441[var37];
                if (arg8 == 0) {
                    this.field533.method250(1, 12);
                    this.field533.method251(var30 + var30 + 3);
                }
                if (arg8 == 1) {
                    this.field533.method250(1, 221);
                    this.field533.method251(var30 + var30 + 3 + 14);
                }
                if (arg8 == 2) {
                    this.field533.method250(1, 155);
                    this.field533.method251(var30 + var30 + 3);
                }
                this.field533.method285(true, this.field523 + var32);
                this.field567 = this.field440[0];
                this.field568 = this.field441[0];
                for (int var33 = 1; var33 < var30; ++var33) {
                    --var37;
                    this.field533.method277(this.field440[var37] - var31, (byte) -105);
                    this.field533.method277(this.field441[var37] - var32, (byte) -105);
                }
                this.field533.method284(this.field522 + var31, 33414);
                this.field533.method277(super.field1067[5] == 1 ? 1 : 0, (byte) -105);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method141(int arg0, long arg1) {
        if (arg0 >= 5 && arg0 <= 5) {
            if (arg1 != 0L) {
                if (this.field322 >= 100) {
                    this.method74("", 0, "Your ignore list is full. Max of 100 hit", true);
                } else {
                    String var4 = class67.method578(class67.method575(false, arg1), (byte) -85);
                    for (int var5 = 0; var5 < this.field322; ++var5) {
                        if (this.field421[var5] == arg1) {
                            this.method74("", 0, var4 + " is already on your ignore list", true);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field222; ++var6) {
                        if (this.field500[var6] == arg1) {
                            this.method74("", 0, "Please remove " + var4 + " from your friend list first", true);
                            return;
                        }
                    }
                    this.field421[this.field322++] = arg1;
                    this.field284 = true;
                    this.field533.method250(1, 193);
                    this.field533.method257(0, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)Ljava/lang/String;")
    private static final String method142(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != 0) {
            field352 = !field352;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method143(int arg0) {
        while (arg0 >= 0) {
            this.method151();
        }
        for (int var2 = 0; var2 < this.field382; ++var2) {
            if (this.field119[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field283[var2] == this.field536 && this.field181[var2] == this.field537) {
                        if (!this.method49(-775)) {
                            var3 = true;
                        }
                    } else {
                        class15 var4 = class20.method308(-11, this.field283[var2], this.field181[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field709 / 22) > (long) (this.field471 / 22) + this.field236) {
                            this.field471 = var4.field709;
                            this.field236 = System.currentTimeMillis();
                            if (this.method172(var4.field708, var4.field709, 10)) {
                                this.field536 = this.field283[var2];
                                this.field537 = this.field181[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field119[var2] != -5) {
                    this.field119[var2] = -5;
                } else {
                    --this.field382;
                    for (int var6 = var2; var6 < this.field382; ++var6) {
                        this.field283[var6] = this.field283[var6 + 1];
                        this.field181[var6] = this.field181[var6 + 1];
                        this.field119[var6] = this.field119[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field119[var2]--;
            }
        }
        if (this.field505 > 0) {
            this.field505 -= 20;
            if (this.field505 < 0) {
                this.field505 = 0;
            }
            if (this.field505 == 0 && this.field501 && !field130) {
                this.field565 = this.field346;
                this.field566 = true;
                this.field256.method228(2, this.field565);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public static final void method144(int arg0) {
        if (arg0 != 0) {
            field286 = !field286;
        }
        class39.field1082 = false;
        class49.field1352 = false;
        field130 = false;
        class43.field1271 = false;
        class27.field847 = false;
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method145(int arg0) {
        int var2 = 15 / arg0;
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method146(int arg0, int arg1, byte arg2) {
        if (arg2 != 56) {
            field408 = !field408;
        }
        int var3 = arg1 - arg0;
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

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field387) {
            this.method128(-80);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method147(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field399 != null) {
                this.field399.method543();
            }
        } catch (Exception var4) {
        }
        this.field399 = null;
        this.method145(177);
        if (this.field301 != null) {
            this.field301.field781 = false;
        }
        this.field301 = null;
        this.field256.method243();
        this.field256 = null;
        this.field474 = null;
        this.field533 = null;
        this.field416 = null;
        this.field199 = null;
        this.field349 = null;
        this.field364 = null;
        this.field321 = null;
        this.field350 = null;
        this.field351 = null;
        this.field385 = null;
        this.field443 = null;
        this.field208 = null;
        this.field120 = null;
        this.field202 = null;
        this.field172 = null;
        this.field440 = null;
        this.field441 = null;
        this.field136 = null;
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        this.field359 = null;
        this.field360 = null;
        this.field361 = null;
        this.field362 = null;
        this.field237 = null;
        this.field238 = null;
        this.field239 = null;
        this.field148 = null;
        this.field149 = null;
        this.field150 = null;
        this.field151 = null;
        this.field152 = null;
        this.field153 = null;
        this.field154 = null;
        this.field155 = null;
        this.field156 = null;
        this.field388 = null;
        this.field389 = null;
        this.field390 = null;
        this.field324 = null;
        this.field325 = null;
        this.field326 = null;
        this.field429 = null;
        this.field430 = null;
        this.field431 = null;
        this.field432 = null;
        this.field433 = null;
        this.field434 = null;
        this.field479 = null;
        this.field480 = null;
        this.field481 = null;
        this.field482 = null;
        this.field483 = null;
        this.field146 = null;
        this.field470 = null;
        this.field438 = null;
        this.field492 = null;
        this.field488 = null;
        this.field306 = null;
        this.field405 = null;
        this.field166 = null;
        this.field167 = null;
        this.field168 = null;
        this.field169 = null;
        this.field170 = null;
        this.field380 = null;
        this.field257 = null;
        this.field420 = null;
        this.field260 = null;
        this.field262 = null;
        this.field264 = null;
        this.field265 = null;
        this.field517 = null;
        this.field475 = null;
        this.field477 = null;
        this.field527 = null;
        this.field363 = null;
        this.field373 = null;
        this.field422 = null;
        this.field267 = null;
        this.field268 = null;
        this.field269 = null;
        this.field270 = null;
        this.field394 = null;
        this.field115 = null;
        this.field272 = null;
        this.field273 = null;
        this.field157 = null;
        this.field569 = null;
        this.field574 = null;
        this.field500 = null;
        this.field144 = null;
        this.field450 = null;
        this.field451 = null;
        this.field447 = null;
        this.field448 = null;
        this.field449 = null;
        this.field452 = null;
        this.field453 = null;
        this.field454 = null;
        this.field455 = null;
        this.method173(this.field356);
        class27.method327((byte) 1);
        class2.method10((byte) 1);
        class65.method563((byte) 1);
        class41.method470((byte) 1);
        class24.field802 = null;
        class72.field1755 = null;
        class63.field1584 = null;
        class5.field67 = null;
        class62.field1570 = null;
        class62.field1582 = null;
        class23.field785 = null;
        super.field1050 = null;
        class53.field1454 = null;
        class49.method502((byte) 1);
        class39.method413((byte) 1);
        class32.method350((byte) 1);
        class31.method347((byte) 1);
        System.gc();
        if (class33.field1009) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILLORGYGVM;)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3, class41 arg4) {
        if (this.field109 != arg1) {
            this.method151();
        }
        if (arg4.field1199 == 0 && arg4.field1221 != null) {
            if (!arg4.field1193 || this.field534 == arg4.field1213 || this.field316 == arg4.field1213 || this.field111 == arg4.field1213) {
                int var6 = class35.field1024;
                int var7 = class35.field1022;
                int var8 = class35.field1025;
                int var9 = class35.field1023;
                class35.method382(arg4.field1212 + arg3, arg3, arg0, arg4.field1238 + arg0, -701);
                int var10 = arg4.field1221.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field1173[var11] + arg3;
                    int var13 = arg4.field1179[var11] + arg0 - arg2;
                    class41 var14 = class41.method477(arg4.field1221[var11]);
                    int var15 = var14.field1239 + var12;
                    int var16 = var14.field1230 + var13;
                    if (var14.field1211 > 0) {
                        this.method84(var14, (byte) -22);
                    }
                    if (var14.field1199 == 0) {
                        if (var14.field1181 > var14.field1202 - var14.field1238) {
                            var14.field1181 = var14.field1202 - var14.field1238;
                        }
                        if (var14.field1181 < 0) {
                            var14.field1181 = 0;
                        }
                        this.method148(var16, 9538, var14.field1181, var15, var14);
                        if (var14.field1202 > var14.field1238) {
                            this.method46(var14.field1238, var14.field1202, var14.field1181, 0, var16, var14.field1212 + var15);
                        }
                    } else if (var14.field1199 != 1) {
                        if (var14.field1199 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1238; ++var18) {
                                for (int var19 = 0; var19 < var14.field1212; ++var19) {
                                    int var20 = (var14.field1235 + 32) * var19 + var15;
                                    int var21 = (var14.field1234 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1216[var17];
                                        var21 += var14.field1198[var17];
                                    }
                                    if (var14.field1197[var17] <= 0) {
                                        if (var14.field1171 != null && var17 < 20) {
                                            class28 var30 = var14.field1171[var17];
                                            if (var30 != null) {
                                                var30.method335(7964, var21, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1197[var17] - 1;
                                        if (var20 > class35.field1024 - 32 && var20 < class35.field1025 && var21 > class35.field1022 - 32 && var21 < class35.field1023 || this.field343 != 0 && this.field342 == var17) {
                                            int var25 = 0;
                                            if (this.field214 == 1 && this.field215 == var17 && this.field216 == var14.field1213) {
                                                var25 = 16777215;
                                            }
                                            class28 var26 = class65.method567(var25, -24419, var14.field1220[var17], var24);
                                            if (var26 != null) {
                                                if (this.field343 != 0 && this.field342 == var17 && this.field341 == var14.field1213) {
                                                    var22 = super.field1057 - this.field344;
                                                    var23 = super.field1058 - this.field345;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field546 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method337(128, var20 + var22, var21 + var23, this.field545);
                                                    if (var21 + var23 < class35.field1022 && arg4.field1181 > 0) {
                                                        int var27 = (class35.field1022 - var21 - var23) * this.field113 / 3;
                                                        if (var27 > this.field113 * 10) {
                                                            var27 = this.field113 * 10;
                                                        }
                                                        if (var27 > arg4.field1181) {
                                                            var27 = arg4.field1181;
                                                        }
                                                        arg4.field1181 -= var27;
                                                        this.field345 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class35.field1023 && arg4.field1181 < arg4.field1202 - arg4.field1238) {
                                                        int var28 = (var21 + var23 + 32 - class35.field1023) * this.field113 / 3;
                                                        if (var28 > this.field113 * 10) {
                                                            var28 = this.field113 * 10;
                                                        }
                                                        if (var28 > arg4.field1202 - arg4.field1238 - arg4.field1181) {
                                                            var28 = arg4.field1202 - arg4.field1238 - arg4.field1181;
                                                        }
                                                        arg4.field1181 += var28;
                                                        this.field345 -= var28;
                                                    }
                                                } else if (this.field293 != 0 && this.field292 == var17 && this.field291 == var14.field1213) {
                                                    var26.method337(128, var20, var21, this.field545);
                                                } else {
                                                    var26.method335(7964, var21, var20);
                                                }
                                                if (var26.field884 == 33 || var14.field1220[var17] != 1) {
                                                    int var29 = var14.field1220[var17];
                                                    this.field191.method530(var21 + 10 + var23, method42(var29, false), var20 + 1 + var22, 0, 411);
                                                    this.field191.method530(var21 + 9 + var23, method42(var29, false), var20 + var22, 16776960, 411);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1199 == 3) {
                            boolean var31 = false;
                            if (this.field111 == var14.field1213 || this.field316 == var14.field1213 || this.field534 == var14.field1213) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method115(var14, -434)) {
                                var32 = var14.field1207;
                                if (var31 && var14.field1224 != 0) {
                                    var32 = var14.field1224;
                                }
                            } else {
                                var32 = var14.field1229;
                                if (var31 && var14.field1183 != 0) {
                                    var32 = var14.field1183;
                                }
                            }
                            if (var14.field1200 == 0) {
                                if (var14.field1233) {
                                    class35.method385(var16, var14.field1212, var14.field1238, var15, (byte) 5, var32);
                                } else {
                                    class35.method386(var14.field1212, var14.field1238, this.field278, var32, var15, var16);
                                }
                            } else if (var14.field1233) {
                                class35.method384(256 - (var14.field1200 & 255), var14.field1212, var16, var14.field1238, var15, var32, true);
                            } else {
                                class35.method387((byte) 61, var14.field1238, var16, var32, var14.field1212, 256 - (var14.field1200 & 255), var15);
                            }
                        } else if (var14.field1199 == 4) {
                            class55 var33 = var14.field1226;
                            String var34 = var14.field1245;
                            boolean var35 = false;
                            if (this.field111 == var14.field1213 || this.field316 == var14.field1213 || this.field534 == var14.field1213) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method115(var14, -434)) {
                                var36 = var14.field1207;
                                if (var35 && var14.field1224 != 0) {
                                    var36 = var14.field1224;
                                }
                                if (var14.field1182.length() > 0) {
                                    var34 = var14.field1182;
                                }
                            } else {
                                var36 = var14.field1229;
                                if (var35 && var14.field1183 != 0) {
                                    var36 = var14.field1183;
                                }
                            }
                            if (var14.field1217 == 6 && this.field99) {
                                var34 = "Please wait...";
                                var36 = var14.field1229;
                            }
                            if (class35.field1020 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1484 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method72(this.method125(0, var14, 4), 42769) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method72(this.method125(0, var14, 3), 42769) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method72(this.method125(0, var14, 2), 42769) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method72(this.method125(0, var14, 1), 42769) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method72(this.method125(0, var14, 0), 42769) + var34.substring(var38 + 2);
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
                                if (var14.field1191) {
                                    var33.method527(var37, var36, var14.field1212 / 2 + var15, var14.field1214, true, var44);
                                } else {
                                    var33.method534(var44, var36, var37, -964, var15, var14.field1214);
                                }
                                var37 += var33.field1484;
                            }
                        } else if (var14.field1199 == 5) {
                            class28 var45;
                            if (this.method115(var14, -434)) {
                                var45 = var14.field1186;
                            } else {
                                var45 = var14.field1227;
                            }
                            if (var45 != null) {
                                var45.method335(7964, var16, var15);
                            }
                        } else if (var14.field1199 == 6) {
                            int var46 = class49.field1357;
                            int var47 = class49.field1358;
                            class49.field1357 = var14.field1212 / 2 + var15;
                            class49.field1358 = var14.field1238 / 2 + var16;
                            int var48 = class49.field1361[var14.field1189] * var14.field1188 >> 16;
                            int var49 = class49.field1362[var14.field1189] * var14.field1188 >> 16;
                            boolean var50 = this.method115(var14, -434);
                            int var51;
                            if (var50) {
                                var51 = var14.field1210;
                            } else {
                                var51 = var14.field1209;
                            }
                            class32 var52;
                            if (var51 == -1) {
                                var52 = var14.method469((byte) 15, -1, -1, var50);
                            } else {
                                class5 var53 = class5.field67[var51];
                                var52 = var14.method469((byte) 15, var53.field70[var14.field1187], var53.field69[var14.field1187], var50);
                            }
                            if (var52 != null) {
                                var52.method374(0, var14.field1190, 0, var14.field1189, 0, var48, var49);
                            }
                            class49.field1357 = var46;
                            class49.field1358 = var47;
                        } else {
                            if (var14.field1199 == 7) {
                                class55 var54 = var14.field1226;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1238; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1212; ++var57) {
                                        if (var14.field1197[var55] > 0) {
                                            class65 var58 = class65.method560(var14.field1197[var55] - 1);
                                            String var59 = var58.field1645;
                                            if (var58.field1623 || var14.field1220[var55] != 1) {
                                                var59 = var59 + " x" + method142(0, var14.field1220[var55]);
                                            }
                                            int var60 = (var14.field1235 + 115) * var57 + var15;
                                            int var61 = (var14.field1234 + 12) * var56 + var16;
                                            if (var14.field1191) {
                                                var54.method527(var61, var14.field1229, var14.field1212 / 2 + var60, var14.field1214, true, var59);
                                            } else {
                                                var54.method534(var59, var14.field1229, var61, -964, var60, var14.field1214);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1199 == 8 && (this.field439 == var14.field1213 || this.field541 == var14.field1213 || this.field442 == var14.field1213) && this.field570 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class55 var64 = this.field192;
                                String var65 = var14.field1245;
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
                                    int var74 = var64.method528(var73, 555);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1484 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1212 + var15 - 5 - var62;
                                int var67 = var14.field1238 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg4.field1212 + arg3) {
                                    var66 = arg4.field1212 + arg3 - var62;
                                }
                                class35.method385(var67, var62, var63, var66, (byte) 5, 16777120);
                                class35.method386(var62, var63, this.field278, 0, var66, var67);
                                String var68 = var14.field1245;
                                int var69 = var64.field1484 + var67 + 2;
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
                                    var64.method534(var71, 0, var69, -964, var66 + 3, false);
                                    var69 += var64.field1484 + 1;
                                }
                            }
                        }
                    }
                }
                class35.method382(var8, var6, var7, var9, -701);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHOSNGCXH;BI)V")
    public final void method149(int arg0, class28 arg1, byte arg2, int arg3) {
        if (arg2 != 0) {
            this.field527 = null;
        }
        int var5 = arg0 * arg0 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field485 + this.field106 & 2047;
            int var7 = class32.field1001[var6];
            int var8 = class32.field1002[var6];
            int var9 = var7 * 256 / (this.field158 + 256);
            int var10 = var8 * 256 / (this.field158 + 256);
            int var11 = arg0 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg0 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field401.method340(15, 15, var15 + 94 + 4 - 10, var13, 20, (byte) 5, 256, 83 - var16 - 20, 20);
        } else {
            this.method79(arg3, arg0, arg1, (byte) 87);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method150(byte arg0) {
        if (!this.field323 && !this.field161 && !this.field460) {
            ++field114;
            if (!this.field529) {
                this.method93(false, 884);
            } else {
                this.method67(true);
            }
            this.field499 = 0;
            if (arg0 == 0) {
                boolean var2 = false;
            } else {
                field286 = !field286;
            }
        } else {
            this.method82(0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method151() {
        this.method92("Starting up", 20, (byte) 8);
        if (signlink.sunjava) {
            super.field1043 = 5;
        }
        if (field379) {
            this.field323 = true;
        } else {
            field379 = true;
            boolean var1 = false;
            String var2 = this.method55(true);
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
                this.field460 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field549[var3] = new class14(true, var3 + 1, signlink.cache_idx[var3], signlink.cache_dat, 500000);
                    }
                }
                try {
                    this.method36(677);
                    this.field240 = this.method113(0, "title screen", this.field386[1], 25, 1, "title");
                    this.field191 = new class55(false, "p11_full", 0, this.field240);
                    this.field192 = new class55(false, "p12_full", 0, this.field240);
                    this.field193 = new class55(false, "b12_full", 0, this.field240);
                    this.field194 = new class55(true, "q8_full", 0, this.field240);
                    this.method155(-616);
                    this.method121(0);
                    class58 var4 = this.method113(0, "config", this.field386[2], 30, 2, "config");
                    class58 var5 = this.method113(0, "interface", this.field386[3], 35, 3, "interface");
                    class58 var6 = this.method113(0, "2d graphics", this.field386[4], 40, 4, "media");
                    class58 var7 = this.method113(0, "textures", this.field386[6], 45, 6, "textures");
                    class58 var8 = this.method113(0, "chat system", this.field386[7], 50, 7, "wordenc");
                    class58 var9 = this.method113(0, "sound effects", this.field386[8], 55, 8, "sounds");
                    this.field443 = new byte[4][104][104];
                    this.field385 = new int[4][105][105];
                    this.field208 = new class39(this.field385, 104, 4, (byte) 0, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field120[var10] = new class3(104, 104, 457);
                    }
                    this.field569 = new class28(512, 512);
                    class58 var11 = this.method113(0, "update list", this.field386[5], 60, 5, "versionlist");
                    this.method92("Connecting to update server", 60, (byte) 8);
                    this.field256 = new class13();
                    this.field256.method230(var11, this);
                    class31.method345(this.field256.method224(1));
                    class32.method351(this.field256.method239(field275, 0), this.field256);
                    if (!field130) {
                        this.field565 = 0;
                        this.field566 = true;
                        this.field256.method228(2, this.field565);
                        while (this.field256.method233() > 0) {
                            this.method162(9);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field256.field667 > 3) {
                                this.method97("ondemand");
                                return;
                            }
                        }
                    }
                    this.method92("Requesting animations", 65, (byte) 8);
                    int var12 = this.field256.method239(field275, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field256.method228(1, var13);
                    }
                    while (this.field256.method233() > 0) {
                        int var14 = var12 - this.field256.method233();
                        if (var14 > 0) {
                            this.method92("Loading animations - " + var14 * 100 / var12 + "%", 65, (byte) 8);
                        }
                        this.method162(9);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field256.field667 > 3) {
                            this.method97("ondemand");
                            return;
                        }
                    }
                    this.method92("Requesting models", 70, (byte) 8);
                    int var15 = this.field256.method239(field275, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field256.method232(3, var16);
                        if ((var17 & 1) != 0) {
                            this.field256.method228(0, var16);
                        }
                    }
                    int var18 = this.field256.method233();
                    while (this.field256.method233() > 0) {
                        int var19 = var18 - this.field256.method233();
                        if (var19 > 0) {
                            this.method92("Loading models - " + var19 * 100 / var18 + "%", 70, (byte) 8);
                        }
                        this.method162(9);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field549[0] != null) {
                        this.method92("Requesting maps", 75, (byte) 8);
                        this.field256.method228(3, this.field256.method227((byte) 9, 0, 48, 47));
                        this.field256.method228(3, this.field256.method227((byte) 9, 1, 48, 47));
                        this.field256.method228(3, this.field256.method227((byte) 9, 0, 48, 48));
                        this.field256.method228(3, this.field256.method227((byte) 9, 1, 48, 48));
                        this.field256.method228(3, this.field256.method227((byte) 9, 0, 48, 49));
                        this.field256.method228(3, this.field256.method227((byte) 9, 1, 48, 49));
                        this.field256.method228(3, this.field256.method227((byte) 9, 0, 47, 47));
                        this.field256.method228(3, this.field256.method227((byte) 9, 1, 47, 47));
                        this.field256.method228(3, this.field256.method227((byte) 9, 0, 47, 48));
                        this.field256.method228(3, this.field256.method227((byte) 9, 1, 47, 48));
                        this.field256.method228(3, this.field256.method227((byte) 9, 0, 148, 48));
                        this.field256.method228(3, this.field256.method227((byte) 9, 1, 148, 48));
                        int var20 = this.field256.method233();
                        while (this.field256.method233() > 0) {
                            int var21 = var20 - this.field256.method233();
                            if (var21 > 0) {
                                this.method92("Loading maps - " + var21 * 100 / var20 + "%", 75, (byte) 8);
                            }
                            this.method162(9);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field256.method239(field275, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field256.method232(3, var23);
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
                            this.field256.method231(0, var23, field406, var25);
                        }
                    }
                    this.field256.method241(-895, field129);
                    if (!field130) {
                        int var26 = this.field256.method239(field275, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field256.method225(0, var27)) {
                                this.field256.method231(2, var27, field406, (byte) 1);
                            }
                        }
                    }
                    this.method92("Unpacking media", 80, (byte) 8);
                    this.field388 = new class11(var6, "invback", 0);
                    this.field390 = new class11(var6, "chatback", 0);
                    this.field389 = new class11(var6, "mapback", 0);
                    this.field324 = new class11(var6, "backbase1", 0);
                    this.field325 = new class11(var6, "backbase2", 0);
                    this.field326 = new class11(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field429[var28] = new class11(var6, "sideicons", var28);
                    }
                    this.field146 = new class28(var6, "compass", 0);
                    this.field401 = new class28(var6, "mapedge", 0);
                    this.field401.method332(-985);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field380[var29] = new class11(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field257[var30] = new class28(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field470[var31] = new class28(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field438[var32] = new class28(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field492[var33] = new class28(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field488[var34] = new class28(var6, "headicons_hint", var34);
                    }
                    this.field405 = new class28(var6, "overlay_multiway", 0);
                    this.field542 = new class28(var6, "mapmarker", 0);
                    this.field543 = new class28(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field306[var35] = new class28(var6, "cross", var35);
                    }
                    this.field166 = new class28(var6, "mapdots", 0);
                    this.field167 = new class28(var6, "mapdots", 1);
                    this.field168 = new class28(var6, "mapdots", 2);
                    this.field169 = new class28(var6, "mapdots", 3);
                    this.field170 = new class28(var6, "mapdots", 4);
                    this.field197 = new class11(var6, "scrollbar", 0);
                    this.field198 = new class11(var6, "scrollbar", 1);
                    this.field430 = new class11(var6, "redstone1", 0);
                    this.field431 = new class11(var6, "redstone2", 0);
                    this.field432 = new class11(var6, "redstone3", 0);
                    this.field433 = new class11(var6, "redstone1", 0);
                    this.field433.method180(1);
                    this.field434 = new class11(var6, "redstone2", 0);
                    this.field434.method180(1);
                    this.field479 = new class11(var6, "redstone1", 0);
                    this.field479.method181(field108);
                    this.field480 = new class11(var6, "redstone2", 0);
                    this.field480.method181(field108);
                    this.field481 = new class11(var6, "redstone3", 0);
                    this.field481.method181(field108);
                    this.field482 = new class11(var6, "redstone1", 0);
                    this.field482.method180(1);
                    this.field482.method181(field108);
                    this.field483 = new class11(var6, "redstone2", 0);
                    this.field483.method180(1);
                    this.field483.method181(field108);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field121[var36] = new class11(var6, "mod_icons", var36);
                    }
                    class28 var37 = new class28(var6, "backleft1", 0);
                    this.field148 = new class68(this.method139(field535), true, var37.field880, var37.field881);
                    var37.method333(false, 0, 0);
                    class28 var38 = new class28(var6, "backleft2", 0);
                    this.field149 = new class68(this.method139(field535), true, var38.field880, var38.field881);
                    var38.method333(false, 0, 0);
                    class28 var39 = new class28(var6, "backright1", 0);
                    this.field150 = new class68(this.method139(field535), true, var39.field880, var39.field881);
                    var39.method333(false, 0, 0);
                    class28 var40 = new class28(var6, "backright2", 0);
                    this.field151 = new class68(this.method139(field535), true, var40.field880, var40.field881);
                    var40.method333(false, 0, 0);
                    class28 var41 = new class28(var6, "backtop1", 0);
                    this.field152 = new class68(this.method139(field535), true, var41.field880, var41.field881);
                    var41.method333(false, 0, 0);
                    class28 var42 = new class28(var6, "backvmid1", 0);
                    this.field153 = new class68(this.method139(field535), true, var42.field880, var42.field881);
                    var42.method333(false, 0, 0);
                    class28 var43 = new class28(var6, "backvmid2", 0);
                    this.field154 = new class68(this.method139(field535), true, var43.field880, var43.field881);
                    var43.method333(false, 0, 0);
                    class28 var44 = new class28(var6, "backvmid3", 0);
                    this.field155 = new class68(this.method139(field535), true, var44.field880, var44.field881);
                    var44.method333(false, 0, 0);
                    class28 var45 = new class28(var6, "backhmid2", 0);
                    this.field156 = new class68(this.method139(field535), true, var45.field880, var45.field881);
                    var45.method333(false, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field257[var50] != null) {
                            this.field257[var50].method331(var47 + var49, var46 + var49, (byte) 1, var48 + var49);
                        }
                        if (this.field380[var50] != null) {
                            this.field380[var50].method182(var47 + var49, var46 + var49, (byte) 1, var48 + var49);
                        }
                    }
                    this.method92("Unpacking textures", 83, (byte) 8);
                    class49.method507(3, var7);
                    class49.method511(-313, 0.8D);
                    class49.method506(-160, 20);
                    this.method92("Unpacking config", 86, (byte) 8);
                    class5.method26(0, var4);
                    class27.method323(var4);
                    class24.method315(0, var4);
                    class65.method561(var4);
                    class2.method8(var4);
                    class72.method595(0, var4);
                    class62.method553(0, var4);
                    class23.method313(0, var4);
                    class16.method299(0, var4);
                    class65.field1616 = field129;
                    if (!field130) {
                        this.method92("Unpacking sounds", 90, (byte) 8);
                        byte[] var51 = var9.method542("sounds.dat", (byte[]) null);
                        class15 var52 = new class15(var51, false);
                        class20.method307(0, var52);
                    }
                    this.method92("Unpacking interfaces", 95, (byte) 8);
                    class55[] var53 = new class55[] { this.field191, this.field192, this.field193, this.field194 };
                    class41.method475(var5, -631, var6, var53);
                    this.method92("Preparing game engine", 100, (byte) 8);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field389.field607[this.field389.field609 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field547[var54] = var55;
                        this.field220[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field389.field607[this.field389.field609 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field398[var58 - 5] = var59 - 25;
                        this.field353[var58 - 5] = var60 - var59;
                    }
                    class49.method504(765, 503, -110);
                    this.field564 = class49.field1363;
                    class49.method504(479, 96, -110);
                    this.field561 = class49.field1363;
                    class49.method504(190, 261, -110);
                    this.field562 = class49.field1363;
                    class49.method504(512, 334, -110);
                    this.field563 = class49.field1363;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class49.field1361[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class39.method450(512, 334, (byte) 117, 500, var62, 800);
                    class12.method185(var8);
                    this.field301 = new class22(this, field473);
                    this.method51(this.field301, 10);
                    class64.field1601 = this;
                    class27.field839 = this;
                    class2.field33 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field188 + " " + this.field133);
                    this.field161 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method152(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field443[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg2 & 127;
            int var10 = (128 - var8) * this.field385[var7][var5][var6] + this.field385[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field385[var7][var5][var6 + 1] + this.field385[var7][var5 + 1][var6 + 1] * var8 >> 7;
            if (arg1 != 0) {
                field108 = this.field274.method522();
            }
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BII)V")
    public final void method153(byte arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field557[var5] != null) {
                int var6 = this.field555[var5];
                int var7 = 70 - var4 * 14 + this.field348 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field556[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field497 == 0 || this.field497 == 1 && this.method91(false, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field255.field1462)) {
                        if (this.field305 >= 1) {
                            this.field394[this.field550] = "Report abuse @whi@" + var8;
                            this.field269[this.field550] = 440;
                            ++this.field550;
                        }
                        this.field394[this.field550] = "Add ignore @whi@" + var8;
                        this.field269[this.field550] = 539;
                        ++this.field550;
                        this.field394[this.field550] = "Add friend @whi@" + var8;
                        this.field269[this.field550] = 342;
                        ++this.field550;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field312 == 0 && (var6 == 7 || this.field369 == 0 || this.field369 == 1 && this.method91(false, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field305 >= 1) {
                            this.field394[this.field550] = "Report abuse @whi@" + var8;
                            this.field269[this.field550] = 440;
                            ++this.field550;
                        }
                        this.field394[this.field550] = "Add ignore @whi@" + var8;
                        this.field269[this.field550] = 539;
                        ++this.field550;
                        this.field394[this.field550] = "Add friend @whi@" + var8;
                        this.field269[this.field550] = 342;
                        ++this.field550;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field383 == 0 || this.field383 == 1 && this.method91(false, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field394[this.field550] = "Accept trade @whi@" + var8;
                        this.field269[this.field550] = 768;
                        ++this.field550;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field312 == 0 && this.field369 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field383 == 0 || this.field383 == 1 && this.method91(false, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field394[this.field550] = "Accept challenge @whi@" + var8;
                        this.field269[this.field550] = 443;
                        ++this.field550;
                    }
                    ++var4;
                }
            }
        }
        if (arg0 != -15) {
            this.field225 = this.field199.method261();
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method154(int arg0) {
        if (arg0 != 0) {
            this.field302 = this.field274.method522();
        }
        int var2 = this.field193.method528("Choose Option", 555);
        for (int var3 = 0; var3 < this.field550; ++var3) {
            int var11 = this.field193.method528(this.field394[var3], 555);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field550 * 15 + 21;
        if (super.field1064 > 4 && super.field1065 > 4 && super.field1064 < 516 && super.field1065 < 338) {
            int var5 = super.field1064 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1065 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field528 = true;
            this.field463 = 0;
            this.field464 = var5;
            this.field465 = var6;
            this.field466 = var2;
            this.field467 = this.field550 * 15 + 22;
        }
        if (super.field1064 > 553 && super.field1065 > 205 && super.field1064 < 743 && super.field1065 < 466) {
            int var7 = super.field1064 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1065 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field528 = true;
            this.field463 = 1;
            this.field464 = var7;
            this.field465 = var8;
            this.field466 = var2;
            this.field467 = this.field550 * 15 + 22;
        }
        if (super.field1064 > 17 && super.field1065 > 357 && super.field1064 < 496 && super.field1065 < 453) {
            int var9 = super.field1064 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1065 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field528 = true;
            this.field463 = 2;
            this.field464 = var9;
            this.field465 = var10;
            this.field466 = var2;
            this.field467 = this.field550 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method155(int arg0) {
        byte[] var2 = this.field240.method542("title.dat", (byte[]) null);
        class28 var3 = new class28(var2, this);
        this.field450.method580(true);
        var3.method333(false, 0, 0);
        this.field451.method580(true);
        var3.method333(false, -637, 0);
        this.field447.method580(true);
        var3.method333(false, -128, 0);
        this.field448.method580(true);
        var3.method333(false, -202, -371);
        this.field449.method580(true);
        var3.method333(false, -202, -171);
        this.field452.method580(true);
        var3.method333(false, 0, -265);
        this.field453.method580(true);
        var3.method333(false, -562, -265);
        this.field454.method580(true);
        var3.method333(false, -128, -171);
        this.field455.method580(true);
        var3.method333(false, -562, -171);
        int[] var4 = new int[var3.field880];
        for (int var5 = 0; var5 < var3.field881; ++var5) {
            for (int var10 = 0; var10 < var3.field880; ++var10) {
                var4[var10] = var3.field879[var3.field880 * var5 + (var3.field880 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field880; ++var11) {
                var3.field879[var3.field880 * var5 + var11] = var4[var11];
            }
        }
        this.field450.method580(true);
        var3.method333(false, 382, 0);
        this.field451.method580(true);
        var3.method333(false, -255, 0);
        this.field447.method580(true);
        var3.method333(false, 254, 0);
        this.field448.method580(true);
        var3.method333(false, 180, -371);
        this.field449.method580(true);
        var3.method333(false, 180, -171);
        this.field452.method580(true);
        var3.method333(false, 382, -265);
        this.field453.method580(true);
        var3.method333(false, -180, -265);
        this.field454.method580(true);
        var3.method333(false, 254, -171);
        this.field455.method580(true);
        var3.method333(false, -180, -171);
        while (arg0 >= 0) {
            field406 = this.field274.method522();
        }
        class28 var6 = new class28(this.field240, "logo", 0);
        this.field447.method580(true);
        var6.method335(7964, 18, 382 - var6.field880 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILAUWOQLEO;IZI)V")
    public final void method156(int arg0, class2 arg1, int arg2, boolean arg3, int arg4) {
        this.field529 &= arg3;
        if (this.field550 < 400) {
            if (arg1.field22 != null) {
                arg1 = arg1.method6(this.field187);
            }
            if (arg1 != null) {
                if (arg1.field12) {
                    String var6 = arg1.field39;
                    if (arg1.field47 != 0) {
                        var6 = var6 + method146(arg1.field47, field255.field1467, (byte) 56) + " (level-" + arg1.field47 + ")";
                    }
                    if (this.field214 == 1) {
                        this.field394[this.field550] = "Use " + this.field218 + " with @yel@" + var6;
                        this.field269[this.field550] = 280;
                        this.field270[this.field550] = arg0;
                        this.field267[this.field550] = arg2;
                        this.field268[this.field550] = arg4;
                        ++this.field550;
                    } else {
                        if (this.field423 == 1) {
                            if ((this.field425 & 2) == 2) {
                                this.field394[this.field550] = this.field426 + " @yel@" + var6;
                                this.field269[this.field550] = 734;
                                this.field270[this.field550] = arg0;
                                this.field267[this.field550] = arg2;
                                this.field268[this.field550] = arg4;
                                ++this.field550;
                                return;
                            }
                        } else {
                            if (arg1.field42 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg1.field42[var7] != null && !arg1.field42[var7].equalsIgnoreCase("attack")) {
                                        this.field394[this.field550] = arg1.field42[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field269[this.field550] = 58;
                                        }
                                        if (var7 == 1) {
                                            this.field269[this.field550] = 9;
                                        }
                                        if (var7 == 2) {
                                            this.field269[this.field550] = 97;
                                        }
                                        if (var7 == 3) {
                                            this.field269[this.field550] = 703;
                                        }
                                        if (var7 == 4) {
                                            this.field269[this.field550] = 50;
                                        }
                                        this.field270[this.field550] = arg0;
                                        this.field267[this.field550] = arg2;
                                        this.field268[this.field550] = arg4;
                                        ++this.field550;
                                    }
                                }
                            }
                            if (arg1.field42 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field42[var8] != null && arg1.field42[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg1.field47 > field255.field1467) {
                                            var9 = 2000;
                                        }
                                        this.field394[this.field550] = arg1.field42[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field269[this.field550] = var9 + 58;
                                        }
                                        if (var8 == 1) {
                                            this.field269[this.field550] = var9 + 9;
                                        }
                                        if (var8 == 2) {
                                            this.field269[this.field550] = var9 + 97;
                                        }
                                        if (var8 == 3) {
                                            this.field269[this.field550] = var9 + 703;
                                        }
                                        if (var8 == 4) {
                                            this.field269[this.field550] = var9 + 50;
                                        }
                                        this.field270[this.field550] = arg0;
                                        this.field267[this.field550] = arg2;
                                        this.field268[this.field550] = arg4;
                                        ++this.field550;
                                    }
                                }
                            }
                            this.field394[this.field550] = "Examine @yel@" + var6;
                            this.field269[this.field550] = 1787;
                            this.field270[this.field550] = arg0;
                            this.field267[this.field550] = arg2;
                            this.field268[this.field550] = arg4;
                            ++this.field550;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field502[(var2 - 2 << 7) + var3] = 255;
            }
        }
        if (arg0) {
            this.field225 = -1;
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field502[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field503[var14] = (this.field502[var14 - 1] + this.field502[var14 + 1] + this.field502[var14 - 128] + this.field502[var14 + 128]) / 4;
            }
        }
        this.field504 += 128;
        if (this.field504 > this.field307.length) {
            this.field504 -= this.field307.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method31(true, this.field578[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field503[var11 + 128] - this.field307[this.field504 + var11 & this.field307.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field502[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field436[var8] = this.field436[var8 + 1];
        }
        this.field436[var2 - 1] = (int) (Math.sin((double) field147 / 14.0D) * 16.0D + Math.sin((double) field147 / 15.0D) * 14.0D + Math.sin((double) field147 / 16.0D) * 12.0D);
        if (this.field370 > 0) {
            this.field370 -= 4;
        }
        if (this.field371 > 0) {
            this.field371 -= 4;
        }
        if (this.field370 == 0 && this.field371 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field370 = 1024;
            }
            if (var9 == 1) {
                this.field371 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method158(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field125 = "";
                this.field126 = "Connecting to server...";
                this.method93(true, 884);
            }
            this.field399 = new class60(5, this.method47(field128 + 43594), this);
            long var4 = class67.method574(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field533.field709 = 0;
            this.field533.method251(14);
            this.field533.method251(var6);
            this.field399.method547((byte) 120, this.field533.field708, 2, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field399.method544();
            }
            int var8 = this.field399.method544();
            int var9 = var8;
            if (var8 == 0) {
                this.field399.method546(this.field199.field708, 0, 8);
                this.field199.field709 = 0;
                this.field178 = this.field199.method267(false);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field178 >> 32), (int) this.field178 };
                this.field533.field709 = 0;
                this.field533.method251(10);
                this.field533.method255(var10[0]);
                this.field533.method255(var10[1]);
                this.field533.method255(var10[2]);
                this.field533.method255(var10[3]);
                this.field533.method255(signlink.uid);
                this.field533.method258(arg0);
                this.field533.method258(arg1);
                this.field533.method276(field303, false, field314);
                this.field416.field709 = 0;
                if (arg2) {
                    this.field416.method251(18);
                } else {
                    this.field416.method251(16);
                }
                this.field416.method251(this.field533.field709 + 36 + 1 + 1 + 2);
                this.field416.method251(255);
                this.field416.method252(346);
                this.field416.method251(field130 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field416.method255(this.field386[var11]);
                }
                this.field416.method259(this.field533.field708, 0, this.field533.field709, true);
                this.field533.field713 = new class54(var10, field408);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field274 = new class54(var10, field408);
                this.field399.method547((byte) 120, this.field416.field708, this.field416.field709, 0);
                var8 = this.field399.method544();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method158(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field305 = this.field399.method544();
                field196 = this.field399.method544() == 1;
                this.field253 = 0L;
                this.field357 = 0;
                this.field301.field782 = 0;
                super.field1054 = true;
                this.field415 = true;
                this.field529 = true;
                this.field533.field709 = 0;
                this.field199.field709 = 0;
                this.field225 = -1;
                this.field183 = -1;
                this.field184 = -1;
                this.field185 = -1;
                this.field224 = 0;
                this.field226 = 0;
                this.field571 = 0;
                this.field228 = 0;
                this.field298 = 0;
                this.field550 = 0;
                this.field528 = false;
                super.field1055 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field557[var13] = null;
                }
                this.field214 = 0;
                this.field423 = 0;
                this.field180 = 0;
                this.field382 = 0;
                this.field520 = (int) (Math.random() * 100.0D) - 50;
                this.field585 = (int) (Math.random() * 110.0D) - 55;
                this.field231 = (int) (Math.random() * 80.0D) - 40;
                this.field106 = (int) (Math.random() * 120.0D) - 60;
                this.field158 = (int) (Math.random() * 30.0D) - 20;
                this.field485 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field397 = 0;
                this.field309 = -1;
                this.field567 = 0;
                this.field568 = 0;
                this.field261 = 0;
                this.field476 = 0;
                for (int var14 = 0; var14 < this.field258; ++var14) {
                    this.field260[var14] = null;
                    this.field265[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field475[var15] = null;
                }
                field255 = this.field260[this.field259] = new class53();
                this.field373.method399();
                this.field422.method399();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field527[var16][var17][var18] = null;
                        }
                    }
                }
                this.field363 = new class36(0);
                this.field223 = 0;
                this.field222 = 0;
                this.method53(this.field468, (byte) -104);
                this.field468 = -1;
                this.method53(this.field310, (byte) -104);
                this.field310 = -1;
                this.method53(this.field254, (byte) -104);
                this.field254 = -1;
                this.method53(this.field419, (byte) -104);
                this.field419 = -1;
                this.method53(this.field402, (byte) -104);
                this.field402 = -1;
                this.method53(this.field347, (byte) -104);
                this.field347 = -1;
                this.method53(this.field553, (byte) -104);
                this.field553 = -1;
                this.field99 = false;
                this.field122 = 3;
                this.field498 = 0;
                this.field528 = false;
                this.field518 = false;
                this.field539 = null;
                this.field281 = 0;
                this.field163 = -1;
                this.field266 = true;
                this.method170(1);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field428[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field337[var20] = null;
                    this.field338[var20] = false;
                }
                field472 = 0;
                field112 = 0;
                field395 = 0;
                field358 = 0;
                field131 = 0;
                field584 = 0;
                field417 = 0;
                field519 = 0;
                field339 = 0;
                field116 = 0;
                this.method73(this.field366);
            } else if (var8 == 3) {
                this.field125 = "";
                this.field126 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field125 = "Your account has been disabled.";
                this.field126 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field125 = "Your account is already logged in.";
                this.field126 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field125 = "RuneScape has been updated!";
                this.field126 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field125 = "This world is full.";
                this.field126 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field125 = "Unable to connect.";
                this.field126 = "Login server offline.";
            } else if (var8 == 9) {
                this.field125 = "Login limit exceeded.";
                this.field126 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field125 = "Unable to connect.";
                this.field126 = "Bad session id.";
            } else if (var8 == 11) {
                this.field125 = "Login server rejected session.";
                this.field126 = "Please try again.";
            } else if (var8 == 12) {
                this.field125 = "You need a members account to login to this world.";
                this.field126 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field125 = "Could not complete login.";
                this.field126 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field125 = "The server is being updated.";
                this.field126 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field529 = true;
                this.field533.field709 = 0;
                this.field199.field709 = 0;
                this.field225 = -1;
                this.field183 = -1;
                this.field184 = -1;
                this.field185 = -1;
                this.field224 = 0;
                this.field226 = 0;
                this.field571 = 0;
                this.field550 = 0;
                this.field528 = false;
                this.field139 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field125 = "Login attempts exceeded.";
                this.field126 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field125 = "You are standing in a members-only area.";
                this.field126 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field125 = "Invalid loginserver requested";
                this.field126 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field125 = "Malformed login packet.";
                    this.field126 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field391 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field391;
                            this.method158(arg0, arg1, arg2);
                        } else {
                            this.field125 = "No response from loginserver";
                            this.field126 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field125 = "No response from server";
                        this.field126 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field125 = "Unexpected server response";
                    this.field126 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field399.method544();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field125 = "You have only just left another world";
                    this.field126 = "Your profile will be transferred in: " + var26;
                    this.method93(true, 884);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method158(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field125 = "";
            this.field126 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method159(int arg0) {
        this.field224 += arg0;
        this.field533.method250(1, 243);
        if (this.field347 != -1) {
            this.method53(this.field347, (byte) -104);
            this.field347 = -1;
            this.field284 = true;
            this.field99 = false;
            this.field186 = true;
        }
        if (this.field310 != -1) {
            this.method53(this.field310, (byte) -104);
            this.field310 = -1;
            this.field365 = true;
            this.field99 = false;
        }
        if (this.field419 != -1) {
            this.method53(this.field419, (byte) -104);
            this.field419 = -1;
            this.field177 = true;
        }
        if (this.field402 != -1) {
            this.method53(this.field402, (byte) -104);
            this.field402 = -1;
        }
        if (this.field254 != -1) {
            this.method53(this.field254, (byte) -104);
            this.field254 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILSZJROHQV;)V")
    private final void method160(int arg0, class57 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field1496 == 0) {
            var3 = this.field208.method440(arg1.field1495, arg1.field1497, arg1.field1498);
        }
        if (arg1.field1496 == 1) {
            var3 = this.field208.method441(true, arg1.field1498, arg1.field1497, arg1.field1495);
        }
        if (arg1.field1496 == 2) {
            var3 = this.field208.method442(arg1.field1495, arg1.field1497, arg1.field1498);
        }
        if (arg1.field1496 == 3) {
            var3 = this.field208.method443(arg1.field1495, arg1.field1497, arg1.field1498);
        }
        if (var3 != 0) {
            int var7 = this.field208.method444(arg1.field1495, arg1.field1497, arg1.field1498, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field1492 = var4;
        arg1.field1494 = var5;
        arg1.field1493 = var6;
        if (arg0 != -31799) {
            this.field225 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
        try {
            this.field309 = -1;
            this.field422.method399();
            this.field373.method399();
            ++field252;
            if (field252 > 65) {
                field252 = 0;
                this.field533.method250(1, 203);
            }
            class49.method505(false);
            this.method59(17519);
            this.field208.method414(-2562);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field120[var2].method12();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field443[var3][var4][var5] = 0;
                    }
                }
            }
            class43 var6 = new class43(this.field385, 0, 104, 104, this.field443);
            int var7 = this.field364.length;
            this.field533.method250(1, 121);
            if (!this.field190) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field349[var8] >> 8) * 64 - this.field522;
                    int var10 = (this.field349[var8] & 255) * 64 - this.field523;
                    byte[] var11 = this.field364[var8];
                    if (var11 != null) {
                        var6.method493(this.field120, (byte) -78, var9, var10, var11, (this.field577 - 6) * 8, (this.field576 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field349[var12] >> 8) * 64 - this.field522;
                    int var14 = (this.field349[var12] & 255) * 64 - this.field523;
                    byte[] var15 = this.field364[var12];
                    if (var15 == null && this.field577 < 800) {
                        var6.method483(var13, 64, 64, -137, var14);
                    }
                }
                ++field110;
                if (field110 > 59) {
                    field110 = 0;
                    this.field533.method250(1, 126);
                }
                this.field533.method250(1, 121);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field321[var16];
                    if (var17 != null) {
                        int var18 = (this.field349[var16] >> 8) * 64 - this.field522;
                        int var19 = (this.field349[var16] & 255) * 64 - this.field523;
                        var6.method499(var19, this.field208, 7, var17, this.field120, var18);
                    }
                }
            }
            if (this.field190) {
                int var20 = 0;
                label256: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field575[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method483(var30 * 8, 8, 8, -137, var31 * 8);
                                }
                            }
                        }
                        this.field533.method250(1, 121);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label256;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field575[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field349.length; ++var42) {
                                            if (this.field349[var42] == var41 && this.field321[var42] != null) {
                                                var6.method480(this.field321[var42], this.field120, (var40 & 7) * 8, var34 * 8, var38, var33, (var39 & 7) * 8, this.field208, var35 * 8, var37, 13580);
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
                            int var23 = this.field575[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field349.length; ++var29) {
                                    if (this.field349[var29] == var28 && this.field364[var29] != null) {
                                        var6.method490(var22 * 8, var24, (var27 & 7) * 8, 293, var21 * 8, var25, this.field364[var29], this.field120, var20, (var26 & 7) * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field533.method250(1, 121);
            var6.method494(this.field120, this.field208, this.field461);
            if (this.field361 != null) {
                this.field361.method580(true);
                class49.field1363 = this.field563;
            }
            this.field533.method250(1, 121);
            int var43 = class43.field1279;
            if (var43 > this.field367) {
                var43 = this.field367;
            }
            if (var43 < this.field367 - 1) {
                int var44 = this.field367 - 1;
            }
            if (field130) {
                this.field208.method415(false, class43.field1279);
            } else {
                this.field208.method415(false, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method33(var45, var46);
                }
            }
            this.method119(this.field173);
        } catch (Exception var59) {
        }
        class27.field822.method3();
        if (super.field1052 != null) {
            this.field533.method250(1, 98);
            this.field533.method255(1057001181);
        }
        if (field130 && signlink.cache_dat != null) {
            int var48 = this.field256.method239(field275, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field256.method232(3, var49);
                if ((var50 & 121) == 0) {
                    class32.method353((byte) 29, var49);
                }
            }
        }
        System.gc();
        class49.method506(-160, 20);
        this.field529 &= arg0;
        this.field256.method237(true);
        int var51 = (this.field576 - 6) / 8 - 1;
        int var52 = (this.field576 + 6) / 8 + 1;
        int var53 = (this.field577 - 6) / 8 - 1;
        int var54 = (this.field577 + 6) / 8 + 1;
        if (this.field207) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field256.method227((byte) 9, 0, var56, var55);
                    if (var57 != -1) {
                        this.field256.method234(3, var57, false);
                    }
                    int var58 = this.field256.method227((byte) 9, 1, var56, var55);
                    if (var58 != -1) {
                        this.field256.method234(3, var58, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method162(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            this.field225 = -1;
        }
        while (true) {
            class56 var2 = this.field256.method223();
            if (var2 == null) {
                return;
            }
            if (var2.field1489 == 0) {
                class32.method352(var2.field1491, (byte) 2, var2.field1490);
                if ((this.field256.method232(3, var2.field1490) & 98) != 0) {
                    this.field284 = true;
                    if (this.field310 != -1 || this.field468 != -1) {
                        this.field365 = true;
                    }
                }
            }
            if (var2.field1489 == 1 && var2.field1491 != null) {
                class31.method346(930, var2.field1491);
            }
            if (var2.field1489 == 2 && this.field565 == var2.field1490 && var2.field1491 != null) {
                this.method57(var2.field1491, this.field566, -38594);
            }
            if (var2.field1489 == 3 && this.field180 == 1) {
                for (int var3 = 0; var3 < this.field364.length; ++var3) {
                    if (this.field350[var3] == var2.field1490) {
                        this.field364[var3] = var2.field1491;
                        if (var2.field1491 == null) {
                            this.field350[var3] = -1;
                        }
                        break;
                    }
                    if (this.field351[var3] == var2.field1490) {
                        this.field321[var3] = var2.field1491;
                        if (var2.field1491 == null) {
                            this.field351[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1489 == 93 && this.field256.method236(223, var2.field1490)) {
                class43.method495(new class15(var2.field1491, false), this.field256, -41384);
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (this.field571 > 1) {
            --this.field571;
        }
        if (this.field228 > 0) {
            --this.field228;
        }
        for (int var2 = 0; var2 < 5 && this.method86(true); ++var2) {
        }
        if (this.field529) {
            Object var3 = this.field301.field778;
            synchronized (this.field301.field778) {
                if (!field196) {
                    this.field301.field782 = 0;
                } else if (super.field1063 != 0 || this.field301.field782 >= 40) {
                    this.field533.method250(1, 93);
                    this.field533.method251(0);
                    int var4 = this.field533.field709;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field301.field782 && var4 - this.field533.field709 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field301.field777[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field301.field780[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field301.field777[var6] == -1 && this.field301.field780[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field299 == var8 && this.field300 == var7) {
                            if (this.field357 < 2047) {
                                ++this.field357;
                            }
                        } else {
                            int var10 = var8 - this.field299;
                            this.field299 = var8;
                            int var11 = var7 - this.field300;
                            this.field300 = var7;
                            if (this.field357 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field533.method252((this.field357 << 12) + (var10 << 6) + var11);
                                this.field357 = 0;
                            } else if (this.field357 < 8) {
                                this.field533.method254((this.field357 << 19) + 8388608 + var9);
                                this.field357 = 0;
                            } else {
                                this.field533.method255((this.field357 << 19) + -1073741824 + var9);
                                this.field357 = 0;
                            }
                        }
                    }
                    this.field533.method260(-380, this.field533.field709 - var4);
                    if (var5 >= this.field301.field782) {
                        this.field301.field782 = 0;
                    } else {
                        this.field301.field782 -= var5;
                        for (int var12 = 0; var12 < this.field301.field782; ++var12) {
                            this.field301.field780[var12] = this.field301.field780[var5 + var12];
                            this.field301.field777[var12] = this.field301.field777[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1063 != 0) {
                long var13 = (super.field1066 - this.field253) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field253 = super.field1066;
                int var15 = super.field1065;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1064;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1063 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field533.method250(1, 185);
                this.field533.method294((var18 << 19) + (var19 << 20) + var17, this.field162);
            }
            if (this.field458 > 0) {
                --this.field458;
            }
            if (super.field1067[1] == 1 || super.field1067[2] == 1 || super.field1067[3] == 1 || super.field1067[4] == 1) {
                this.field459 = true;
            }
            if (this.field459 && this.field458 <= 0) {
                this.field458 = 20;
                this.field459 = false;
                this.field533.method250(1, 218);
                this.field533.method286(this.field485, (byte) 9);
                this.field533.method252(this.field484);
            }
            if (super.field1054 && !this.field415) {
                this.field415 = true;
                this.field533.method250(1, 28);
                this.field533.method251(1);
            }
            if (!super.field1054 && this.field415) {
                this.field415 = false;
                this.field533.method250(1, 28);
                this.field533.method251(0);
            }
            this.method122(-851);
            this.method175(337);
            this.method143(-732);
            ++this.field226;
            if (this.field226 > 750) {
                this.method94((byte) -40);
            }
            this.method50(-104);
            this.method60((byte) -36);
            this.method89((byte) 6);
            ++this.field113;
            if (this.field320 != 0) {
                this.field319 += 20;
                if (this.field319 >= 400) {
                    this.field320 = 0;
                }
            }
            if (this.field293 != 0) {
                ++this.field290;
                if (this.field290 >= 15) {
                    if (this.field293 == 2) {
                        this.field284 = true;
                    }
                    if (this.field293 == 3) {
                        this.field365 = true;
                    }
                    this.field293 = 0;
                }
            }
            if (this.field343 != 0) {
                ++this.field546;
                if (super.field1057 > this.field344 + 5 || super.field1057 < this.field344 - 5 || super.field1058 > this.field345 + 5 || super.field1058 < this.field345 - 5) {
                    this.field515 = true;
                }
                if (super.field1056 == 0) {
                    if (this.field343 == 2) {
                        this.field284 = true;
                    }
                    if (this.field343 == 3) {
                        this.field365 = true;
                    }
                    this.field343 = 0;
                    if (this.field515 && this.field546 >= 5) {
                        this.field583 = -1;
                        this.method41((byte) 9);
                        if (this.field583 == this.field341 && this.field582 != this.field342) {
                            class41 var20 = class41.method477(this.field341);
                            byte var21 = 0;
                            if (this.field132 == 1 && var20.field1211 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1197[this.field582] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1195) {
                                int var22 = this.field342;
                                int var23 = this.field582;
                                var20.field1197[var23] = var20.field1197[var22];
                                var20.field1220[var23] = var20.field1220[var22];
                                var20.field1197[var22] = -1;
                                var20.field1220[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field342;
                                int var25 = this.field582;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method472(var24 - 1, 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method472(var24 + 1, 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method472(this.field582, 1, this.field342);
                            }
                            this.field533.method250(1, 205);
                            this.field533.method284(this.field342, 33414);
                            this.field533.method278(this.field538, var21);
                            this.field533.method284(this.field582, 33414);
                            this.field533.method285(true, this.field341);
                        }
                    } else if ((this.field241 == 1 || this.method77(357, this.field550 - 1)) && this.field550 > 2) {
                        this.method154(0);
                    } else if (this.field550 > 0) {
                        this.method112(-41187, this.field550 - 1);
                    }
                    this.field290 = 10;
                    super.field1063 = 0;
                }
            }
            if (class39.field1116 != -1) {
                int var26 = class39.field1116;
                int var27 = class39.field1117;
                boolean var28 = this.method140(true, 0, 0, var26, var27, 0, 0, field255.field1706[0], 0, 5, field255.field1707[0], 0);
                class39.field1116 = -1;
                if (var28) {
                    this.field317 = super.field1064;
                    this.field318 = super.field1065;
                    this.field320 = 1;
                    this.field319 = 0;
                }
            }
            if (super.field1063 == 1 && this.field539 != null) {
                this.field539 = null;
                this.field365 = true;
                super.field1063 = 0;
            }
            this.method56(-599);
            if (this.field419 == -1) {
                this.method100(true);
                this.method107(0);
                this.method134((byte) 15);
            }
            if (super.field1056 == 1 || super.field1063 == 1) {
                ++this.field499;
            }
            if (this.field439 == 0 && this.field541 == 0 && this.field442 == 0) {
                if (this.field570 > 0) {
                    --this.field570;
                }
            } else if (this.field570 < 100) {
                ++this.field570;
                if (this.field570 == 100) {
                    if (this.field439 != 0) {
                        this.field365 = true;
                    }
                    if (this.field541 != 0) {
                        this.field284 = true;
                    }
                }
            }
            if (this.field180 == 2) {
                this.method166((byte) -103);
            }
            if (this.field180 == 2 && this.field427) {
                this.method118(-9251);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field315[var29]++;
            }
            this.method136(false);
            ++super.field1055;
            if (super.field1055 > 4500) {
                this.field228 = 250;
                super.field1055 -= 500;
                this.field533.method250(1, 54);
            }
            ++this.field288;
            if (arg0 < this.field145 || arg0 > this.field145) {
                this.field134 = !this.field134;
            }
            if (this.field288 > 500) {
                this.field288 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field520 += this.field521;
                }
                if ((var30 & 2) == 2) {
                    this.field585 += this.field586;
                }
                if ((var30 & 4) == 4) {
                    this.field231 += this.field232;
                }
            }
            if (this.field520 < -50) {
                this.field521 = 2;
            }
            if (this.field520 > 50) {
                this.field521 = -2;
            }
            if (this.field585 < -55) {
                this.field586 = 2;
            }
            if (this.field585 > 55) {
                this.field586 = -2;
            }
            if (this.field231 < -40) {
                this.field232 = 1;
            }
            if (this.field231 > 40) {
                this.field232 = -1;
            }
            ++this.field176;
            if (this.field176 > 500) {
                this.field176 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field106 += this.field107;
                }
                if ((var31 & 2) == 2) {
                    this.field158 += this.field159;
                }
            }
            if (this.field106 < -60) {
                this.field107 = 2;
            }
            if (this.field106 > 60) {
                this.field107 = -2;
            }
            if (this.field158 < -20) {
                this.field159 = 1;
            }
            if (this.field158 > 10) {
                this.field159 = -1;
            }
            ++this.field227;
            if (this.field227 > 50) {
                this.field533.method250(1, 121);
            }
            try {
                if (this.field399 != null && this.field533.field709 > 0) {
                    this.field399.method547((byte) 120, this.field533.field708, this.field533.field709, 0);
                    this.field533.field709 = 0;
                    this.field227 = 0;
                }
            } catch (IOException var33) {
                this.method94((byte) -40);
            } catch (Exception var34) {
                this.method80(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLORGYGVM;)Z")
    public final boolean method164(int arg0, class41 arg1) {
        int var3 = arg1.field1211;
        if (arg0 != -25839) {
            throw new NullPointerException();
        } else if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field394[this.field550] = "Remove @whi@" + arg1.field1245;
                this.field269[this.field550] = 711;
                ++this.field550;
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
            this.field394[this.field550] = "Remove @whi@" + this.field574[var3];
            this.field269[this.field550] = 388;
            ++this.field550;
            this.field394[this.field550] = "Message @whi@" + this.field574[var3];
            this.field269[this.field550] = 17;
            ++this.field550;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILLORGYGVM;IIIII)V")
    public final void method165(int arg0, int arg1, class41 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2.field1199 == 0 && arg2.field1221 != null && !arg2.field1193) {
            if (arg7 >= arg6 && arg0 >= arg4 && arg7 <= arg2.field1212 + arg6 && arg0 <= arg2.field1238 + arg4) {
                int var9 = arg2.field1221.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg2.field1173[var10] + arg6;
                    int var12 = arg2.field1179[var10] + arg4 - arg1;
                    class41 var13 = class41.method477(arg2.field1221[var10]);
                    int var14 = var13.field1239 + var11;
                    int var15 = var13.field1230 + var12;
                    if ((var13.field1201 >= 0 || var13.field1183 != 0) && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1212 + var14 && arg0 < var13.field1238 + var15) {
                        if (var13.field1201 >= 0) {
                            this.field282 = var13.field1201;
                        } else {
                            this.field282 = var13.field1213;
                        }
                    }
                    if (var13.field1199 == 8 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1212 + var14 && arg0 < var13.field1238 + var15) {
                        this.field221 = var13.field1213;
                    }
                    if (var13.field1199 == 0) {
                        this.method165(arg0, var13.field1181, var13, arg3, var15, 173, var14, arg7);
                        if (var13.field1202 > var13.field1238) {
                            this.method52(var13.field1238, var13, var15, var13.field1202, arg3, arg0, arg7, var13.field1212 + var14, (byte) 125);
                        }
                    } else {
                        if (var13.field1217 == 1 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1212 + var14 && arg0 < var13.field1238 + var15) {
                            boolean var16 = false;
                            if (var13.field1211 != 0) {
                                var16 = this.method164(-25839, var13);
                            }
                            if (!var16) {
                                this.field394[this.field550] = var13.field1218;
                                this.field269[this.field550] = 36;
                                this.field268[this.field550] = var13.field1213;
                                ++this.field550;
                            }
                        }
                        if (var13.field1217 == 2 && this.field423 == 0 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1212 + var14 && arg0 < var13.field1238 + var15) {
                            String var17 = var13.field1228;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field394[this.field550] = var17 + " @gre@" + var13.field1177;
                            this.field269[this.field550] = 37;
                            this.field268[this.field550] = var13.field1213;
                            ++this.field550;
                        }
                        if (var13.field1217 == 3 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1212 + var14 && arg0 < var13.field1238 + var15) {
                            this.field394[this.field550] = "Close";
                            if (arg3 == 3) {
                                this.field269[this.field550] = 841;
                            } else {
                                this.field269[this.field550] = 786;
                            }
                            this.field268[this.field550] = var13.field1213;
                            ++this.field550;
                        }
                        if (var13.field1217 == 4 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1212 + var14 && arg0 < var13.field1238 + var15) {
                            this.field394[this.field550] = var13.field1218;
                            this.field269[this.field550] = 227;
                            this.field268[this.field550] = var13.field1213;
                            ++this.field550;
                        }
                        if (var13.field1217 == 5 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1212 + var14 && arg0 < var13.field1238 + var15) {
                            this.field394[this.field550] = var13.field1218;
                            this.field269[this.field550] = 738;
                            this.field268[this.field550] = var13.field1213;
                            ++this.field550;
                        }
                        if (var13.field1217 == 6 && !this.field99 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1212 + var14 && arg0 < var13.field1238 + var15) {
                            this.field394[this.field550] = var13.field1218;
                            this.field269[this.field550] = 211;
                            this.field268[this.field550] = var13.field1213;
                            ++this.field550;
                        }
                        if (var13.field1199 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1238; ++var19) {
                                for (int var20 = 0; var20 < var13.field1212; ++var20) {
                                    int var21 = (var13.field1235 + 32) * var20 + var14;
                                    int var22 = (var13.field1234 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1216[var18];
                                        var22 += var13.field1198[var18];
                                    }
                                    if (arg7 >= var21 && arg0 >= var22 && arg7 < var21 + 32 && arg0 < var22 + 32) {
                                        this.field582 = var18;
                                        this.field583 = var13.field1213;
                                        if (var13.field1197[var18] > 0) {
                                            class65 var23 = class65.method560(var13.field1197[var18] - 1);
                                            if (this.field214 == 1 && var13.field1246) {
                                                if (this.field216 != var13.field1213 || this.field215 != var18) {
                                                    this.field394[this.field550] = "Use " + this.field218 + " with @lre@" + var23.field1645;
                                                    this.field269[this.field550] = 482;
                                                    this.field270[this.field550] = var23.field1655;
                                                    this.field267[this.field550] = var18;
                                                    this.field268[this.field550] = var13.field1213;
                                                    ++this.field550;
                                                }
                                            } else if (this.field423 == 1 && var13.field1246) {
                                                if ((this.field425 & 16) == 16) {
                                                    this.field394[this.field550] = this.field426 + " @lre@" + var23.field1645;
                                                    this.field269[this.field550] = 492;
                                                    this.field270[this.field550] = var23.field1655;
                                                    this.field267[this.field550] = var18;
                                                    this.field268[this.field550] = var13.field1213;
                                                    ++this.field550;
                                                }
                                            } else {
                                                if (var13.field1246) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1624 != null && var23.field1624[var24] != null) {
                                                            this.field394[this.field550] = var23.field1624[var24] + " @lre@" + var23.field1645;
                                                            if (var24 == 3) {
                                                                this.field269[this.field550] = 800;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field269[this.field550] = 866;
                                                            }
                                                            this.field270[this.field550] = var23.field1655;
                                                            this.field267[this.field550] = var18;
                                                            this.field268[this.field550] = var13.field1213;
                                                            ++this.field550;
                                                        } else if (var24 == 4) {
                                                            this.field394[this.field550] = "Drop @lre@" + var23.field1645;
                                                            this.field269[this.field550] = 866;
                                                            this.field270[this.field550] = var23.field1655;
                                                            this.field267[this.field550] = var18;
                                                            this.field268[this.field550] = var13.field1213;
                                                            ++this.field550;
                                                        }
                                                    }
                                                }
                                                if (var13.field1236) {
                                                    this.field394[this.field550] = "Use @lre@" + var23.field1645;
                                                    this.field269[this.field550] = 219;
                                                    this.field270[this.field550] = var23.field1655;
                                                    this.field267[this.field550] = var18;
                                                    this.field268[this.field550] = var13.field1213;
                                                    ++this.field550;
                                                }
                                                if (var13.field1246 && var23.field1624 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1624[var25] != null) {
                                                            this.field394[this.field550] = var23.field1624[var25] + " @lre@" + var23.field1645;
                                                            if (var25 == 0) {
                                                                this.field269[this.field550] = 963;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field269[this.field550] = 984;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field269[this.field550] = 816;
                                                            }
                                                            this.field270[this.field550] = var23.field1655;
                                                            this.field267[this.field550] = var18;
                                                            this.field268[this.field550] = var13.field1213;
                                                            ++this.field550;
                                                        }
                                                    }
                                                }
                                                if (var13.field1206 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1206[var26] != null) {
                                                            this.field394[this.field550] = var13.field1206[var26] + " @lre@" + var23.field1645;
                                                            if (var26 == 0) {
                                                                this.field269[this.field550] = 285;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field269[this.field550] = 881;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field269[this.field550] = 875;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field269[this.field550] = 397;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field269[this.field550] = 233;
                                                            }
                                                            this.field270[this.field550] = var23.field1655;
                                                            this.field267[this.field550] = var18;
                                                            this.field268[this.field550] = var13.field1213;
                                                            ++this.field550;
                                                        }
                                                    }
                                                }
                                                this.field394[this.field550] = "Examine @lre@" + var23.field1645;
                                                this.field269[this.field550] = 1948;
                                                this.field270[this.field550] = var23.field1655;
                                                this.field267[this.field550] = var18;
                                                this.field268[this.field550] = var13.field1213;
                                                ++this.field550;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
                if (arg5 > 0) {
                    ;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method166(byte arg0) {
        if (arg0 != -103) {
            this.field225 = this.field199.method261();
        }
        try {
            int var2 = field255.field1721 + this.field520;
            int var3 = field255.field1722 + this.field585;
            if (this.field456 - var2 < -500 || this.field456 - var2 > 500 || this.field457 - var3 < -500 || this.field457 - var3 > 500) {
                this.field456 = var2;
                this.field457 = var3;
            }
            if (this.field456 != var2) {
                this.field456 += (var2 - this.field456) / 16;
            }
            if (this.field457 != var3) {
                this.field457 += (var3 - this.field457) / 16;
            }
            if (super.field1067[1] == 1) {
                this.field486 += (-24 - this.field486) / 2;
            } else if (super.field1067[2] == 1) {
                this.field486 += (24 - this.field486) / 2;
            } else {
                this.field486 /= 2;
            }
            if (super.field1067[3] == 1) {
                this.field487 += (12 - this.field487) / 2;
            } else if (super.field1067[4] == 1) {
                this.field487 += (-12 - this.field487) / 2;
            } else {
                this.field487 /= 2;
            }
            this.field485 = this.field486 / 2 + this.field485 & 2047;
            this.field484 += this.field487 / 2;
            if (this.field484 < 128) {
                this.field484 = 128;
            }
            if (this.field484 > 383) {
                this.field484 = 383;
            }
            int var4 = this.field456 >> 7;
            int var5 = this.field457 >> 7;
            int var6 = this.method152(this.field456, 0, this.field457, this.field367);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field367;
                        if (var10 < 3 && (this.field443[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field385[var10][var8][var9];
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
            if (var12 > this.field409) {
                this.field409 += (var12 - this.field409) / 24;
            } else if (var12 < this.field409) {
                this.field409 += (var12 - this.field409) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field255.field1721 + "," + field255.field1722 + "," + this.field456 + "," + this.field457 + "," + this.field576 + "," + this.field577 + "," + this.field522 + "," + this.field523);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method167(boolean arg0) {
        this.field360.method580(true);
        if (this.field397 == 2) {
            byte[] var2 = this.field389.field607;
            int[] var3 = class35.field1019;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field146.method339(this.field485, this.field220, 25, 25, -696, this.field547, 33, 33, 0, 256, 0);
            this.field361.method580(true);
            class49.field1363 = this.field563;
        } else {
            int var6 = this.field485 + this.field106 & 2047;
            int var7 = field255.field1721 / 32 + 48;
            int var8 = 464 - field255.field1722 / 32;
            this.field569.method339(var6, this.field353, var7, var8, -696, this.field398, 146, 151, 25, this.field158 + 256, 5);
            this.field146.method339(this.field485, this.field220, 25, 25, -696, this.field547, 33, 33, 0, 256, 0);
            for (int var9 = 0; var9 < this.field271; ++var9) {
                int var39 = this.field272[var9] * 4 + 2 - field255.field1721 / 32;
                int var40 = this.field273[var9] * 4 + 2 - field255.field1722 / 32;
                this.method79(var40, var39, this.field157[var9], (byte) 87);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class36 var36 = this.field527[this.field367][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field255.field1721 / 32;
                        int var38 = var35 * 4 + 2 - field255.field1722 / 32;
                        this.method79(var38, var37, this.field166, (byte) 87);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field476; ++var11) {
                class6 var31 = this.field475[this.field477[var11]];
                if (var31 != null && var31.method29(true)) {
                    class2 var32 = var31.field86;
                    if (var32.field22 != null) {
                        var32 = var32.method6(this.field187);
                    }
                    if (var32 != null && var32.field46 && var32.field12) {
                        int var33 = var31.field1721 / 32 - field255.field1721 / 32;
                        int var34 = var31.field1722 / 32 - field255.field1722 / 32;
                        this.method79(var34, var33, this.field167, (byte) 87);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field261; ++var12) {
                class53 var23 = this.field260[this.field262[var12]];
                if (var23 != null && var23.method29(true)) {
                    int var24 = var23.field1721 / 32 - field255.field1721 / 32;
                    int var25 = var23.field1722 / 32 - field255.field1722 / 32;
                    boolean var26 = false;
                    long var27 = class67.method574(var23.field1462);
                    for (int var29 = 0; var29 < this.field222; ++var29) {
                        if (this.field500[var29] == var27 && this.field144[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field255.field1468 != 0 && var23.field1468 != 0 && field255.field1468 == var23.field1468) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method79(var25, var24, this.field169, (byte) 87);
                    } else if (var30) {
                        this.method79(var25, var24, this.field170, (byte) 87);
                    } else {
                        this.method79(var25, var24, this.field168, (byte) 87);
                    }
                }
            }
            if (this.field298 != 0 && field147 % 20 < 10) {
                if (this.field298 == 1 && this.field313 >= 0 && this.field313 < this.field475.length) {
                    class6 var13 = this.field475[this.field313];
                    if (var13 != null) {
                        int var14 = var13.field1721 / 32 - field255.field1721 / 32;
                        int var15 = var13.field1722 / 32 - field255.field1722 / 32;
                        this.method149(var14, this.field543, (byte) 0, var15);
                    }
                }
                if (this.field298 == 2) {
                    int var16 = (this.field332 - this.field522) * 4 + 2 - field255.field1721 / 32;
                    int var17 = (this.field333 - this.field523) * 4 + 2 - field255.field1722 / 32;
                    this.method149(var16, this.field543, (byte) 0, var17);
                }
                if (this.field298 == 10 && this.field235 >= 0 && this.field235 < this.field260.length) {
                    class53 var18 = this.field260[this.field235];
                    if (var18 != null) {
                        int var19 = var18.field1721 / 32 - field255.field1721 / 32;
                        int var20 = var18.field1722 / 32 - field255.field1722 / 32;
                        this.method149(var19, this.field543, (byte) 0, var20);
                    }
                }
            }
            if (this.field567 != 0) {
                int var21 = this.field567 * 4 + 2 - field255.field1721 / 32;
                int var22 = this.field568 * 4 + 2 - field255.field1722 / 32;
                this.method79(var22, var21, this.field542, (byte) 87);
            }
            class35.method385(78, 3, 3, 97, (byte) 5, 16777215);
            if (arg0) {
                this.field361.method580(true);
                class49.field1363 = this.field563;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class57 var11 = null;
        for (class57 var12 = (class57) this.field363.method395(); var12 != null; var12 = (class57) this.field363.method397(-125)) {
            if (var12.field1495 == arg8 && var12.field1497 == arg5 && var12.field1498 == arg0 && var12.field1496 == arg3) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class57();
            var11.field1495 = arg8;
            var11.field1496 = arg3;
            var11.field1497 = arg5;
            var11.field1498 = arg0;
            this.method160(-31799, var11);
            this.field363.method392(var11);
        }
        var11.field1501 = arg2;
        var11.field1503 = arg4;
        int var13 = 1 / arg6;
        var11.field1502 = arg1;
        var11.field1500 = arg9;
        var11.field1499 = arg7;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method169(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field222 >= 100 && this.field493 != 1) {
                this.method74("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", true);
            } else if (this.field222 >= 200) {
                this.method74("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", true);
            } else {
                String var4 = class67.method578(class67.method575(false, arg0), (byte) -85);
                if (this.field160 != arg1) {
                    this.field533.method251(22);
                }
                for (int var5 = 0; var5 < this.field222; ++var5) {
                    if (this.field500[var5] == arg0) {
                        this.method74("", 0, var4 + " is already on your friend list", true);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field322; ++var6) {
                    if (this.field421[var6] == arg0) {
                        this.method74("", 0, "Please remove " + var4 + " from your ignore list first", true);
                        return;
                    }
                }
                if (!var4.equals(field255.field1462)) {
                    this.field574[this.field222] = var4;
                    this.field500[this.field222] = arg0;
                    this.field144[this.field222] = 0;
                    ++this.field222;
                    this.field284 = true;
                    this.field533.method250(1, 217);
                    this.field533.method257(0, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method170(int arg0) {
        this.field140 = true;
        if (arg0 < 1 || arg0 > 1) {
            this.field533.method251(204);
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field171[var2] = -1;
            for (int var3 = 0; var3 < class72.field1754; ++var3) {
                if (!class72.field1755[var3].field1761 && class72.field1755[var3].field1756 == var2 + (this.field266 ? 0 : 7)) {
                    this.field171[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method171(byte arg0) {
        this.field362.method580(true);
        class49.field1363 = this.field561;
        this.field390.method183(7964, 0, 0);
        if (this.field518) {
            this.field193.method526(0, 3, 40, 239, this.field201);
            this.field193.method526(128, 3, 60, 239, this.field355 + "*");
        } else if (this.field498 == 1) {
            this.field193.method526(0, 3, 40, 239, "Enter amount:");
            this.field193.method526(128, 3, 60, 239, this.field381 + "*");
        } else if (this.field498 == 2) {
            this.field193.method526(0, 3, 40, 239, "Enter name:");
            this.field193.method526(128, 3, 60, 239, this.field381 + "*");
        } else if (this.field539 != null) {
            this.field193.method526(0, 3, 40, 239, this.field539);
            this.field193.method526(128, 3, 60, 239, "Click to continue");
        } else if (this.field310 != -1) {
            this.method148(0, 9538, 0, 0, class41.method477(this.field310));
        } else if (this.field468 != -1) {
            this.method148(0, 9538, 0, 0, class41.method477(this.field468));
        } else {
            class55 var2 = this.field192;
            int var3 = 0;
            class35.method382(463, 0, 0, 77, -701);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field557[var4] != null) {
                    int var6 = this.field555[var4];
                    int var7 = 70 - var3 * 14 + this.field348;
                    String var8 = this.field556[var4];
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
                            var2.method530(var7, this.field557[var4], 4, 0, 411);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field497 == 0 || this.field497 == 1 && this.method91(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field121[0].method183(7964, var7 - 12, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field121[1].method183(7964, var7 - 12, var10);
                                var10 += 14;
                            }
                            var2.method530(var7, var8 + ":", var10, 0, 411);
                            int var11 = var10 + var2.method528(var8, 555) + 8;
                            var2.method530(var7, this.field557[var4], var11, 255, 411);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field312 == 0 && (var6 == 7 || this.field369 == 0 || this.field369 == 1 && this.method91(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method530(var7, "From", var12, 0, 411);
                            int var13 = var12 + var2.method528("From ", 555);
                            if (var9 == 1) {
                                this.field121[0].method183(7964, var7 - 12, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field121[1].method183(7964, var7 - 12, var13);
                                var13 += 14;
                            }
                            var2.method530(var7, var8 + ":", var13, 0, 411);
                            int var14 = var13 + var2.method528(var8, 555) + 8;
                            var2.method530(var7, this.field557[var4], var14, 8388608, 411);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field383 == 0 || this.field383 == 1 && this.method91(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method530(var7, var8 + " " + this.field557[var4], 4, 8388736, 411);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field312 == 0 && this.field369 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method530(var7, this.field557[var4], 4, 8388608, 411);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field312 == 0 && this.field369 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method530(var7, "To " + var8 + ":", 4, 0, 411);
                            var2.method530(var7, this.field557[var4], 12 + var2.method528("To " + var8, 555), 8388608, 411);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field383 == 0 || this.field383 == 1 && this.method91(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method530(var7, var8 + " " + this.field557[var4], 4, 8270336, 411);
                        }
                        ++var3;
                    }
                }
            }
            class35.method381((byte) 1);
            this.field469 = var3 * 14 + 7;
            if (this.field469 < 78) {
                this.field469 = 78;
            }
            this.method46(77, this.field469, this.field469 - this.field348 - 77, 0, 0, 463);
            String var5;
            if (field255 != null && field255.field1462 != null) {
                var5 = field255.field1462;
            } else {
                var5 = class67.method578(this.field123, (byte) -85);
            }
            var2.method530(90, var5 + ":", 4, 0, 411);
            var2.method530(90, this.field311 + "*", 6 + var2.method528(var5 + ": ", 555), 255, 411);
            class35.method388(-532, 77, 0, 479, 0);
        }
        if (this.field528 && this.field463 == 2) {
            this.method58(0);
        }
        this.field362.method581(17, 357, -41725, super.field1049);
        this.field361.method580(true);
        if (this.field462 != arg0) {
            this.method151();
        }
        class49.field1363 = this.field563;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method172(byte[] arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            this.field533.method251(137);
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method173(byte arg0) {
        this.field219 = false;
        while (this.field368) {
            this.field219 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field572 = null;
        this.field573 = null;
        this.field578 = null;
        this.field374 = null;
        this.field375 = null;
        this.field376 = null;
        this.field377 = null;
        this.field307 = null;
        this.field308 = null;
        this.field502 = null;
        this.field503 = null;
        this.field530 = null;
        this.field531 = null;
        if (this.field392 != arg0) {
            this.method151();
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method174(int arg0) {
        short var2 = 256;
        if (this.field370 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field370 > 768) {
                    this.field374[var3] = this.method32(this.field134, this.field376[var3], this.field375[var3], 1024 - this.field370);
                } else if (this.field370 > 256) {
                    this.field374[var3] = this.field376[var3];
                } else {
                    this.field374[var3] = this.method32(this.field134, this.field375[var3], this.field376[var3], 256 - this.field370);
                }
            }
        } else if (this.field371 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field371 > 768) {
                    this.field374[var4] = this.method32(this.field134, this.field377[var4], this.field375[var4], 1024 - this.field371);
                } else if (this.field371 > 256) {
                    this.field374[var4] = this.field377[var4];
                } else {
                    this.field374[var4] = this.method32(this.field134, this.field375[var4], this.field377[var4], 256 - this.field371);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field374[var5] = this.field375[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field450.field1672[var6] = this.field530.field879[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field436[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field502[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field374[var26];
                    int var30 = this.field450.field1672[var8];
                    this.field450.field1672[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 != 0) {
            this.method151();
        }
        this.field450.method581(0, 0, -41725, super.field1049);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field451.field1672[var10] = this.field531.field879[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field436[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field502[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field374[var18];
                    int var22 = this.field451.field1672[var16];
                    this.field451.field1672[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field451.method581(637, 0, -41725, super.field1049);
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    private final void method175(int arg0) {
        int var2 = 70 / arg0;
        if (this.field180 == 2) {
            for (class57 var3 = (class57) this.field363.method395(); var3 != null; var3 = (class57) this.field363.method397(-125)) {
                if (var3.field1499 > 0) {
                    --var3.field1499;
                }
                if (var3.field1499 == 0) {
                    if (var3.field1492 < 0 || class43.method497(var3.field1494, var3.field1492, true)) {
                        this.method70(var3.field1494, var3.field1495, var3.field1493, var3.field1496, field352, var3.field1498, var3.field1492, var3.field1497);
                        var3.method379();
                    }
                } else {
                    if (var3.field1500 > 0) {
                        --var3.field1500;
                    }
                    if (var3.field1500 == 0 && var3.field1497 >= 1 && var3.field1498 >= 1 && var3.field1497 <= 102 && var3.field1498 <= 102 && (var3.field1501 < 0 || class43.method497(var3.field1503, var3.field1501, true))) {
                        this.method70(var3.field1503, var3.field1495, var3.field1502, var3.field1496, field352, var3.field1498, var3.field1501, var3.field1497);
                        var3.field1500 = -1;
                        if (var3.field1501 == var3.field1492 && var3.field1492 == -1) {
                            var3.method379();
                        } else if (var3.field1501 == var3.field1492 && var3.field1502 == var3.field1493 && var3.field1503 == var3.field1494) {
                            var3.method379();
                        }
                    }
                }
            }
            ++field404;
            if (field404 > 141) {
                field404 = 0;
                this.field533.method250(1, 25);
                this.field533.method254(7714495);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method176(int arg0, int arg1) {
        if (arg1 != -6907) {
            this.method151();
        }
        if (!field130) {
            for (int var3 = 0; var3 < this.field204.length; ++var3) {
                int var4 = this.field204[var3];
                if (class49.field1371[var4] >= arg0) {
                    class11 var5 = class49.field1365[var4];
                    int var6 = var5.field610 * var5.field609 - 1;
                    int var7 = this.field113 * var5.field609 * 2;
                    byte[] var8 = var5.field607;
                    byte[] var9 = this.field136;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field607 = var9;
                    this.field136 = var8;
                    class49.method509(518, var4);
                    ++field354;
                    if (field354 > 1130) {
                        field354 = 0;
                        this.field533.method250(1, 158);
                        this.field533.method251(0);
                        int var11 = this.field533.field709;
                        this.field533.method252(10252);
                        if ((int) (Math.random() * 2.0D) == 0) {
                            this.field533.method252(36403);
                        }
                        if ((int) (Math.random() * 2.0D) == 0) {
                            this.field533.method252(32298);
                        }
                        this.field533.method251(172);
                        this.field533.method252(23928);
                        this.field533.method251(143);
                        this.field533.method252((int) (Math.random() * 65536.0D));
                        this.field533.method251(27);
                        this.field533.method251(129);
                        this.field533.method251(55);
                        this.field533.method260(-380, this.field533.field709 - var11);
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
            field189[var1] = var0 / 4;
        }
        field275 = 64;
        field286 = true;
        field303 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field314 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field406 = 258;
        field408 = true;
        field444 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field446 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field446[var3] = var2 - 1;
            var2 += var2;
        }
        field473 = 8;
        field526 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field535 = 6;
    }
}
