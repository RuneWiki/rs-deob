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
public class client extends class37 {

    @OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
    public int[] field73 = new int[1000];

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
    private int[] field74 = new int[7];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "LIUVBENCV;")
    private class25 field77 = class25.method233(field181, 1);

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    private int field79 = 1;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
    private boolean field80 = false;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
    private boolean field81 = false;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "[LAOKWRKNA;")
    private class1[] field85 = new class1[4];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
    private boolean field90 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[[I")
    private int[][] field92 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
    private int[] field93 = new int[50];

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private int field94 = 128;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[LGPLGZASP;")
    private class21[] field102 = new class21[20];

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "[LGPLGZASP;")
    private class21[] field109 = new class21[8];

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
    private boolean field111 = true;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "B")
    private byte field112 = -85;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/String;")
    private String field114 = "";

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
    private boolean field120 = false;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field123 = 2301979;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "Z")
    private boolean field124 = false;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "Z")
    private boolean field125 = false;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field132 = 3353893;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "[LGPLGZASP;")
    private class21[] field133 = new class21[1000];

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "Z")
    private volatile boolean field139 = false;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field140 = -41334;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
    private int field144 = -1;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
    private int field151 = -42;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
    private boolean field152 = false;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field154 = -1;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "Ljava/lang/String;")
    private String field156 = "";

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "[Ljava/lang/String;")
    private String[] field158 = new String[100];

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
    private int[] field159 = new int[100];

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
    private boolean field161 = false;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
    private int field165 = -1;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "[I")
    private int[] field166 = new int[class18.field741];

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "[I")
    public int[] field167 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private int field168 = 9;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field172 = -46618;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "B")
    private byte field174 = -97;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
    private int[] field175 = new int[33];

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "Z")
    private boolean field179 = true;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
    private int field180 = -1;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "Z")
    private boolean field182 = false;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field183 = -1;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
    private int[] field184 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "B")
    private byte field190 = -123;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[[[LZEEWTYXI;")
    private class69[][][] field193 = new class69[4][104][104];

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "[[I")
    private int[][] field197 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
    private boolean field198 = false;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "[LSFVBUBEZ;")
    private class52[] field199 = new class52[13];

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field203 = -567;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field204 = -41562;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field209 = 631;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "[LGPLGZASP;")
    private class21[] field210 = new class21[32];

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "LIUVBENCV;")
    private class25 field213 = class25.method233(field181, 1);

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "B")
    private byte field214 = 8;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field218 = 2;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
    private int[] field219 = new int[151];

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field221 = -1;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field223 = 1;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "[Ljava/lang/String;")
    private String[] field228 = new String[200];

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "Z")
    private boolean field230 = false;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "[J")
    private long[] field232 = new long[200];

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
    private int field233 = 36117;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "[LBCXJTIWC;")
    public class3[] field235 = new class3[5];

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "[LSFVBUBEZ;")
    private class52[] field237 = new class52[100];

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "Z")
    private boolean field244 = false;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
    private int[] field251 = new int[5];

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "LIUVBENCV;")
    private class25 field252 = new class25(new byte[5000], 713);

    @OriginalMember(owner = "client!client", name = "je", descriptor = "[LKPZIZBER;")
    private class32[] field253 = new class32[16384];

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
    public int[] field255 = new int[16384];

    @OriginalMember(owner = "client!client", name = "me", descriptor = "[Ljava/lang/String;")
    private String[] field256 = new String[5];

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "[Z")
    private boolean[] field257 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field258 = -120;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field266 = 2;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
    private boolean field267 = false;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "[I")
    private int[] field269 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
    private int[] field270 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "B")
    private byte field271 = 0;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "B")
    private byte field272 = 0;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
    private boolean field273 = false;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field278 = 5063219;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "B")
    private byte field280 = 7;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "[I")
    private final int[] field281 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "[LGPLGZASP;")
    private class21[] field282 = new class21[32];

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "LIUVBENCV;")
    private class25 field283 = class25.method233(field181, 1);

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
    private int[] field284 = new int[5];

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field285 = -1;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field286 = -1;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
    private int[] field287 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "Ljava/lang/String;")
    private String field291 = "";

    @OriginalMember(owner = "client!client", name = "We", descriptor = "Ljava/lang/String;")
    private String field292 = "";

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field293 = -1;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field294 = -1;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "[I")
    private int[] field295 = new int[50];

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field303 = 2048;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field304 = 2047;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "[LVJDNWPCM;")
    private class62[] field305 = new class62[this.field303];

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "[I")
    public int[] field307 = new int[this.field303];

    @OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
    private int[] field309 = new int[this.field303];

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "[LIUVBENCV;")
    private class25[] field310 = new class25[this.field303];

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
    private boolean field319 = true;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    private int field321 = -1;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
    private int[] field322 = new int[33];

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
    private boolean field323 = false;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
    private int[] field327 = new int[50];

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "B")
    private byte field328 = 115;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private final int field329 = 100;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
    private int[] field330 = new int[100];

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "[I")
    public int[] field331 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field332 = -1;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field333 = 7058;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
    private int[] field334 = new int[5];

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
    public boolean field335 = false;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
    private boolean field337 = false;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
    private int[] field338 = new int[151];

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private int field339 = 78;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field340 = -7662;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "[LSFVBUBEZ;")
    private class52[] field347 = new class52[2];

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field350 = -1;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
    private int[] field351 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "[Z")
    private boolean[] field356 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field358 = 919;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "Ljava/lang/String;")
    private String field359 = "";

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "Z")
    private boolean field362 = true;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
    private int field363 = 488;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field367 = 50;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
    private int[] field368 = new int[this.field367];

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
    private int[] field369 = new int[this.field367];

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
    private int[] field370 = new int[this.field367];

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "[I")
    private int[] field371 = new int[this.field367];

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "[I")
    private int[] field372 = new int[this.field367];

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
    private int[] field373 = new int[this.field367];

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
    private int[] field374 = new int[this.field367];

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "[Ljava/lang/String;")
    private String[] field375 = new String[this.field367];

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "Z")
    private boolean field376 = false;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
    private int[] field378 = new int[500];

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
    private int[] field379 = new int[500];

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
    private int[] field380 = new int[500];

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "[I")
    private int[] field381 = new int[500];

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private int field382 = -205;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "Z")
    private boolean field388 = false;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "[B")
    private byte[] field391 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
    private int[] field392 = new int[100];

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "[Ljava/lang/String;")
    private String[] field393 = new String[100];

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "[Ljava/lang/String;")
    private String[] field394 = new String[100];

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
    private boolean field396 = false;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
    private volatile boolean field401 = false;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "[LGPLGZASP;")
    private class21[] field404 = new class21[32];

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field419 = 7;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "LZEEWTYXI;")
    private class69 field425 = new class69(223);

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "Z")
    private boolean field426 = false;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
    private boolean field427 = true;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field428 = 7759444;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
    private int[] field429 = new int[5];

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "LZEEWTYXI;")
    private class69 field430 = new class69(223);

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "B")
    private byte field431 = 9;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
    private int[] field432 = new int[9];

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
    private boolean field437 = false;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "Ljava/lang/String;")
    private String field438 = "";

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field439 = -1;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "[[I")
    private int[][] field440 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
    private int[] field441 = new int[200];

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "Z")
    public boolean field444 = true;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
    private volatile boolean field445 = false;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "Ljava/lang/String;")
    private String field447 = "";

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "Ljava/lang/String;")
    private String field448 = "";

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "Ljava/lang/String;")
    private String field450 = "";

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
    private int[] field451 = new int[256];

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
    private boolean field479 = false;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "[J")
    private long[] field481 = new long[100];

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field487 = -1;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field488 = 451;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "Ljava/lang/String;")
    private String field492 = "";

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field493 = new CRC32();

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "LMIIVNBFU;")
    private class36 field503 = new class36();

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
    private int[] field505 = new int[class18.field741];

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field519 = 2;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
    private boolean field521 = false;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "Z")
    private boolean field523 = true;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "Z")
    private boolean field525 = false;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "B")
    private byte field527 = 0;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
    private int[] field528 = new int[class18.field741];

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    private int field529 = 3;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
    private boolean field530 = false;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "[[[I")
    private int[][][] field531 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "Z")
    private boolean field537 = false;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "Z")
    private boolean field538 = false;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "LZEEWTYXI;")
    private class69 field539 = new class69(223);

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "[Ljava/lang/String;")
    private String[] field542 = new String[500];

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private int field543 = -66;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
    private boolean field554 = true;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "[LGPLGZASP;")
    private class21[] field558 = new class21[100];

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private int field560 = -1;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
    private int[] field562 = new int[4000];

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "[I")
    private int[] field563 = new int[4000];

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    private int field565 = 2;

    @OriginalMember(owner = "client!client", name = "nk", descriptor = "[I")
    private int[] field568 = new int[5];

    @OriginalMember(owner = "client!client", name = "W", descriptor = "B")
    private static byte field84 = -79;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Ljava/lang/String;")
    private static String field87 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
    private static int[] field138 = new int[99];

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "B")
    private static byte field169;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "[[I")
    public static final int[][] field188;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field192;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field279;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
    public static int[] field341;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
    public static final int[] field355;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private static int field402;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
    private static int field520;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private static int field550;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "Z")
    private static boolean field552;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private static int field103;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
    private static int field121;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
    private static int field122;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private static int field131;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private static int field185;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private static int field187;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private static int field212;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private static int field225;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
    private static int field227;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "I")
    private static int field261;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private static int field296;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    private static int field365;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private static int field390;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private static int field400;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private static int field461;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private static int field516;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private static int field526;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client!client", name = "qk", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client!client", name = "rk", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    private static int field83;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    private static int field86;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    private static int field91;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "J")
    private long field238;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "J")
    private long field290;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "J")
    private long field336;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "J")
    private long field486;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "J")
    public long field513;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "LDTPUNZHN;")
    private class11 field104;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "LDTPUNZHN;")
    private class11 field105;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "LDTPUNZHN;")
    private class11 field106;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "LDTPUNZHN;")
    private class11 field107;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "LDTPUNZHN;")
    private class11 field274;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "LDTPUNZHN;")
    private class11 field275;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "LDTPUNZHN;")
    private class11 field276;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "LDTPUNZHN;")
    private class11 field407;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "LDTPUNZHN;")
    private class11 field408;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "LDTPUNZHN;")
    private class11 field409;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "LDTPUNZHN;")
    private class11 field410;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "LDTPUNZHN;")
    private class11 field411;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "LDTPUNZHN;")
    private class11 field412;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "LDTPUNZHN;")
    private class11 field413;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "LDTPUNZHN;")
    private class11 field414;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "LDTPUNZHN;")
    private class11 field415;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "LDTPUNZHN;")
    private class11 field452;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "LDTPUNZHN;")
    private class11 field453;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "LDTPUNZHN;")
    private class11 field454;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "LDTPUNZHN;")
    private class11 field455;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "LDTPUNZHN;")
    private class11 field456;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "LDTPUNZHN;")
    private class11 field457;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "LDTPUNZHN;")
    private class11 field458;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "LDTPUNZHN;")
    private class11 field459;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "LDTPUNZHN;")
    private class11 field460;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "LGPLGZASP;")
    private class21 field145;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "LGPLGZASP;")
    private class21 field170;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "LGPLGZASP;")
    private class21 field171;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "LGPLGZASP;")
    private class21 field173;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "LGPLGZASP;")
    private class21 field288;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "LGPLGZASP;")
    private class21 field289;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "LGPLGZASP;")
    private class21 field318;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "LGPLGZASP;")
    private class21 field364;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "LGPLGZASP;")
    private class21 field470;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "LGPLGZASP;")
    private class21 field471;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "LGPLGZASP;")
    private class21 field472;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "LGPLGZASP;")
    private class21 field473;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "LGPLGZASP;")
    private class21 field474;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "LGPLGZASP;")
    private class21 field556;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "LGPLGZASP;")
    private class21 field557;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "LICHYZYSQ;")
    private class24 field176;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "LAWEEREDT;")
    private class2 field357;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "LLLZTMQTZ;")
    public class34 field524;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "LPOACSVST;")
    private class46 field277;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "LBISZONYZ;")
    private class4 field215;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "LSFVBUBEZ;")
    private class52 field115;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "LSFVBUBEZ;")
    private class52 field116;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "LSFVBUBEZ;")
    private class52 field117;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "LSFVBUBEZ;")
    private class52 field239;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "LSFVBUBEZ;")
    private class52 field240;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "LSFVBUBEZ;")
    private class52 field241;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "LSFVBUBEZ;")
    private class52 field242;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "LSFVBUBEZ;")
    private class52 field243;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "LSFVBUBEZ;")
    private class52 field348;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "LSFVBUBEZ;")
    private class52 field349;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "LSFVBUBEZ;")
    private class52 field353;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "LSFVBUBEZ;")
    private class52 field354;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "LSFVBUBEZ;")
    private class52 field465;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "LSFVBUBEZ;")
    private class52 field466;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "LSFVBUBEZ;")
    private class52 field467;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "LSFVBUBEZ;")
    private class52 field468;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "LSFVBUBEZ;")
    private class52 field469;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "LSFVBUBEZ;")
    private class52 field489;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "LSFVBUBEZ;")
    private class52 field490;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "LSFVBUBEZ;")
    private class52 field491;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "LUOINBUQD;")
    private class60 field494;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "LUOINBUQD;")
    private class60 field495;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "LUOINBUQD;")
    private class60 field496;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "LUOINBUQD;")
    private class60 field497;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "LVJDNWPCM;")
    public static class62 field559;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "LCSJOZVFM;")
    private class7 field164;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/String;")
    public String field101;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "Ljava/lang/String;")
    private String field231;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "Ljava/lang/String;")
    public String field301;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "Ljava/lang/String;")
    private String field540;

    @OriginalMember(owner = "client!client", name = "ok", descriptor = "Ljava/net/Socket;")
    private Socket field569;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
    public static boolean field134;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "Z")
    private static boolean field181;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "Z")
    public static boolean field186;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "Z")
    private static boolean field403;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "Z")
    private static boolean field418;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "Z")
    private static boolean field446;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "Z")
    private static boolean field553;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
    private int[] field259;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
    private int[] field260;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
    private int[] field262;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
    private int[] field263;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
    private int[] field264;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
    private int[] field265;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
    private int[] field311;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "[I")
    private int[] field312;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
    private int[] field313;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
    private int[] field314;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
    private int[] field360;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
    private int[] field361;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
    private int[] field462;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "[I")
    private int[] field463;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "[I")
    private int[] field464;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "[LSFVBUBEZ;")
    private class52[] field320;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "[[B")
    private byte[][] field416;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[[B")
    private byte[][] field82;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "[[[B")
    private byte[][][] field226;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "[[[I")
    private int[][][] field424;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method47(boolean arg0, int arg1) {
        if (arg1 == 7) {
            if (field559.field620 >> 7 == this.field316 && field559.field621 >> 7 == this.field317) {
                this.field316 = 0;
            }
            int var3 = this.field306;
            if (arg0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < var3; ++var4) {
                class62 var5;
                int var6;
                if (arg0) {
                    var5 = field559;
                    var6 = this.field304 << 14;
                } else {
                    var5 = this.field305[this.field307[var4]];
                    var6 = this.field307[var4] << 14;
                }
                if (var5 != null && var5.method203(this.field382)) {
                    var5.field1602 = false;
                    if ((field553 && this.field306 > 50 || this.field306 > 200) && !arg0 && var5.field634 == var5.field607) {
                        var5.field1602 = true;
                    }
                    int var7 = var5.field620 >> 7;
                    int var8 = var5.field621 >> 7;
                    if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                        if (var5.field1599 != null && field343 >= var5.field1608 && field343 < var5.field1609) {
                            var5.field1602 = false;
                            var5.field1585 = this.method146(var5.field621, this.field220, var5.field620, (byte) -112);
                            this.field277.method399(var5.field1586, var5.field1589, var5.field1585, var5.field1588, (byte) 7, var5.field621, var5.field620, 60, var5, var6, this.field220, var5.field622, var5.field1587);
                        } else {
                            if ((var5.field620 & 127) == 64 && (var5.field621 & 127) == 64) {
                                if (this.field440[var7][var8] == this.field202) {
                                    continue;
                                }
                                this.field440[var7][var8] = this.field202;
                            }
                            var5.field1585 = this.method146(var5.field621, this.field220, var5.field620, (byte) -112);
                            this.field277.method398(this.field108, 60, var5.field620, this.field220, var6, var5.field621, var5.field641, var5, var5.field1585, var5.field622);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method48(byte arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field254; ++var3) {
            class32 var4 = this.field253[this.field255[var3]];
            int var5 = (this.field255[var3] << 14) + 536870912;
            if (var4 != null && var4.method203(this.field382) && var4.field1028.field1244 == arg1 && var4.field1028.method369(0)) {
                int var6 = var4.field620 >> 7;
                int var7 = var4.field621 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field633 == 1 && (var4.field620 & 127) == 64 && (var4.field621 & 127) == 64) {
                        if (this.field440[var6][var7] == this.field202) {
                            continue;
                        }
                        this.field440[var6][var7] = this.field202;
                    }
                    if (!var4.field1028.field1239) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field277.method398(this.field108, (var4.field633 - 1) * 64 + 60, var4.field620, this.field220, var5, var4.field621, var4.field641, var4, this.method146(var4.field621, this.field220, var4.field620, (byte) -112), var4.field622);
                }
            }
        }
        if (arg0 != 20) {
            this.method176();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method49(boolean arg0) {
        short var2 = 256;
        if (this.field142 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field142 > 768) {
                    this.field311[var3] = this.method130(this.field312[var3], this.field313[var3], 1024 - this.field142, 0);
                } else if (this.field142 > 256) {
                    this.field311[var3] = this.field313[var3];
                } else {
                    this.field311[var3] = this.method130(this.field313[var3], this.field312[var3], 256 - this.field142, 0);
                }
            }
        } else if (this.field143 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field143 > 768) {
                    this.field311[var4] = this.method130(this.field312[var4], this.field314[var4], 1024 - this.field143, 0);
                } else if (this.field143 > 256) {
                    this.field311[var4] = this.field314[var4];
                } else {
                    this.field311[var4] = this.method130(this.field314[var4], this.field312[var4], 256 - this.field143, 0);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field311[var5] = this.field312[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field410.field676[var6] = this.field170.field777[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field451[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field259[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field311[var26];
                    int var30 = this.field410.field676[var8];
                    this.field410.field676[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field410.method206(0, super.field1172, 9, 0);
        this.field335 &= arg0;
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field411.field676[var10] = this.field171.field777[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field451[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field259[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field311[var18];
                    int var22 = this.field411.field676[var16];
                    this.field411.field676[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field411.method206(637, super.field1172, 9, 0);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (this.field561 == 2) {
            this.method119((this.field383 - this.field205 << 7) + this.field386, (this.field384 - this.field206 << 7) + this.field387, -17285, this.field385 * 2);
            this.field506 += arg0;
            if (this.field293 > -1 && field343 % 20 < 10) {
                this.field282[0].method220(-40219, this.field294 - 28, this.field293 - 12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method51(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field195 >= 100) {
                this.method160(-232, 0, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = class50.method456(839, class50.method453((byte) 3, arg0));
                if (arg1 != 0) {
                    this.field507 = this.field283.method245();
                }
                for (int var5 = 0; var5 < this.field195; ++var5) {
                    if (this.field481[var5] == arg0) {
                        this.method160(-232, 0, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field566; ++var6) {
                    if (this.field232[var6] == arg0) {
                        this.method160(-232, 0, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                this.field481[this.field195++] = arg0;
                this.field376 = true;
                this.field77.method234(-281, 238);
                this.field77.method241(arg0, -45352);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        int var3 = class58.field1541[arg1].field1549;
        if (var3 != 0) {
            int var4 = this.field167[arg1];
            if (arg0 < 7 || arg0 > 7) {
                this.field507 = -1;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class70.method594((byte) 108, 0.9D);
                }
                if (var4 == 2) {
                    class70.method594((byte) 108, 0.8D);
                }
                if (var4 == 3) {
                    class70.method594((byte) 108, 0.7D);
                }
                if (var4 == 4) {
                    class70.method594((byte) 108, 0.6D);
                }
                class27.field890.method440();
                this.field396 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field111;
                if (var4 == 0) {
                    this.method58(this.field111, this.field388, 0);
                    this.field111 = true;
                }
                if (var4 == 1) {
                    this.method58(this.field111, this.field388, -400);
                    this.field111 = true;
                }
                if (var4 == 2) {
                    this.method58(this.field111, this.field388, -800);
                    this.field111 = true;
                }
                if (var4 == 3) {
                    this.method58(this.field111, this.field388, -1200);
                    this.field111 = true;
                }
                if (var4 == 4) {
                    this.field111 = false;
                }
                if (this.field111 != var5 && !field553) {
                    if (this.field111) {
                        this.field522 = this.field180;
                        this.field523 = true;
                        this.field215.method40(2, this.field522);
                    } else {
                        this.method92(79);
                    }
                    this.field196 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field319 = true;
                    this.method181((byte) 6, 0);
                }
                if (var4 == 1) {
                    this.field319 = true;
                    this.method181((byte) 6, -400);
                }
                if (var4 == 2) {
                    this.field319 = true;
                    this.method181((byte) 6, -800);
                }
                if (var4 == 3) {
                    this.field319 = true;
                    this.method181((byte) 6, -1200);
                }
                if (var4 == 4) {
                    this.field319 = false;
                }
            }
            if (var3 == 5) {
                this.field211 = var4;
            }
            if (var3 == 6) {
                this.field571 = var4;
            }
            if (var3 == 8) {
                this.field88 = var4;
                this.field80 = true;
            }
            if (var3 == 9) {
                this.field137 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIII)V")
    public final void method53(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field277.method413(arg1, arg3, arg0);
        if (var7 != 0) {
            int var8 = this.field277.method417(arg1, arg3, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field318.field777;
            int var13 = (103 - arg0) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class35 var15 = class35.method341(var14);
            if (var15.field1069 != -1) {
                class52 var16 = this.field237[var15.field1069];
                if (var16 != null) {
                    int var17 = (var15.field1038 * 4 - var16.field1451) / 2;
                    int var18 = (var15.field1071 * 4 - var16.field1452) / 2;
                    var16.method463(-40219, (104 - arg0 - var15.field1071) * 4 + 48 + var18, arg3 * 4 + 48 + var17);
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
        int var19 = this.field277.method415(arg1, arg3, arg0);
        if (arg2) {
            if (var19 != 0) {
                int var20 = this.field277.method417(arg1, arg3, arg0, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                class35 var24 = class35.method341(var23);
                if (var24.field1069 != -1) {
                    class52 var25 = this.field237[var24.field1069];
                    if (var25 != null) {
                        int var26 = (var24.field1038 * 4 - var25.field1451) / 2;
                        int var27 = (var24.field1071 * 4 - var25.field1452) / 2;
                        var25.method463(-40219, (104 - arg0 - var24.field1071) * 4 + 48 + var27, arg3 * 4 + 48 + var26);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field318.field777;
                    int var30 = (103 - arg0) * 512 * 4 + arg3 * 4 + 24624;
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
            int var31 = this.field277.method416(arg1, arg3, arg0);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                class35 var33 = class35.method341(var32);
                if (var33.field1069 != -1) {
                    class52 var34 = this.field237[var33.field1069];
                    if (var34 != null) {
                        int var35 = (var33.field1038 * 4 - var34.field1451) / 2;
                        int var36 = (var33.field1071 * 4 - var34.field1452) / 2;
                        var34.method463(-40219, (104 - arg0 - var33.field1071) * 4 + 48 + var36, arg3 * 4 + 48 + var35);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSFVBUBEZ;B)V")
    public final void method54(class52 arg0, byte arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field360.length; ++var4) {
            this.field360[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field360[var17] = (int) (Math.random() * 256.0D);
        }
        if (this.field328 != arg1) {
            this.method176();
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field361[var16] = (this.field360[var16 - 1] + this.field360[var16 + 1] + this.field360[var16 - 128] + this.field360[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field360;
            this.field360 = this.field361;
            this.field361 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1452; ++var8) {
                for (int var9 = 0; var9 < arg0.field1451; ++var9) {
                    if (arg0.field1449[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1453;
                        int var11 = var8 + 16 + arg0.field1454;
                        int var12 = (var11 << 7) + var10;
                        this.field360[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method55(int arg0) {
        if (this.field140 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field191 == 2) {
            for (class30 var3 = (class30) this.field539.method580(); var3 != null; var3 = (class30) this.field539.method582((byte) 6)) {
                if (var3.field994 > 0) {
                    --var3.field994;
                }
                if (var3.field994 == 0) {
                    if (var3.field991 < 0 || class53.method485(var3.field993, var3.field991, true)) {
                        this.method56(var3.field997, var3.field993, var3.field998, var3.field991, 369, var3.field999, var3.field992, var3.field996);
                        var3.method602();
                    }
                } else {
                    if (var3.field995 > 0) {
                        --var3.field995;
                    }
                    if (var3.field995 == 0 && var3.field998 >= 1 && var3.field999 >= 1 && var3.field998 <= 102 && var3.field999 <= 102 && (var3.field988 < 0 || class53.method485(var3.field990, var3.field988, true))) {
                        this.method56(var3.field997, var3.field990, var3.field998, var3.field988, 369, var3.field999, var3.field989, var3.field996);
                        var3.field995 = -1;
                        if (var3.field991 == var3.field988 && var3.field991 == -1) {
                            var3.method602();
                        } else if (var3.field991 == var3.field988 && var3.field992 == var3.field989 && var3.field993 == var3.field990) {
                            var3.method602();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 <= 0) {
            this.field427 = !this.field427;
        }
        if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
            if (field553 && this.field220 != arg7) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg0 == 0) {
                var9 = this.field277.method413(arg7, arg2, arg5);
            }
            if (arg0 == 1) {
                var9 = this.field277.method414(arg5, 0, arg2, arg7);
            }
            if (arg0 == 2) {
                var9 = this.field277.method415(arg7, arg2, arg5);
            }
            if (arg0 == 3) {
                var9 = this.field277.method416(arg7, arg2, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field277.method417(arg7, arg2, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg0 == 0) {
                    this.field277.method404(arg5, true, arg7, arg2);
                    class35 var17 = class35.method341(var14);
                    if (var17.field1059) {
                        this.field85[arg7].method6(var15, var17.field1037, var16, 0, arg2, arg5);
                    }
                }
                if (arg0 == 1) {
                    this.field277.method405(390, arg7, arg5, arg2);
                }
                if (arg0 == 2) {
                    this.field277.method406(arg7, (byte) 1, arg5, arg2);
                    class35 var18 = class35.method341(var14);
                    if (var18.field1038 + arg2 > 103 || var18.field1038 + arg5 > 103 || var18.field1071 + arg2 > 103 || var18.field1071 + arg5 > 103) {
                        return;
                    }
                    if (var18.field1059) {
                        this.field85[arg7].method7(var18.field1037, var18.field1071, arg2, arg5, -614, var16, var18.field1038);
                    }
                }
                if (arg0 == 3) {
                    this.field277.method407(arg7, 5, arg2, arg5);
                    class35 var19 = class35.method341(var14);
                    if (var19.field1059 && var19.field1060) {
                        this.field85[arg7].method9((byte) 0, arg2, arg5);
                    }
                }
            }
            if (arg3 >= 0) {
                int var20 = arg7;
                if (arg7 < 3 && (this.field226[1][arg2][arg5] & 2) == 2) {
                    var20 = arg7 + 1;
                }
                class53.method481(arg5, var20, arg1, arg2, -688, arg6, arg7, this.field277, this.field85[arg7], this.field424, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method57(int arg0) {
        int var2 = this.field496.method504("Choose Option", -665);
        if (arg0 != 0) {
            this.method176();
        }
        for (int var3 = 0; var3 < this.field449; ++var3) {
            int var11 = this.field496.method504(this.field542[var3], -665);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field449 * 15 + 21;
        if (super.field1187 > 4 && super.field1188 > 4 && super.field1187 < 516 && super.field1188 < 338) {
            int var5 = super.field1187 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1188 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field230 = true;
            this.field146 = 0;
            this.field147 = var5;
            this.field148 = var6;
            this.field149 = var2;
            this.field150 = this.field449 * 15 + 22;
        }
        if (super.field1187 > 553 && super.field1188 > 205 && super.field1187 < 743 && super.field1188 < 466) {
            int var7 = super.field1187 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1188 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field230 = true;
            this.field146 = 1;
            this.field147 = var7;
            this.field148 = var8;
            this.field149 = var2;
            this.field150 = this.field449 * 15 + 22;
        }
        if (super.field1187 > 17 && super.field1188 > 357 && super.field1187 < 496 && super.field1188 < 453) {
            int var9 = super.field1187 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1188 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field230 = true;
            this.field146 = 2;
            this.field147 = var9;
            this.field148 = var10;
            this.field149 = var2;
            this.field150 = this.field449 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZI)V")
    public final void method58(boolean arg0, boolean arg1, int arg2) {
        signlink.midivol = arg2;
        if (arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method59(int arg0) {
        if (arg0 == -7744) {
            while (true) {
                class43 var2 = this.field215.method22();
                if (var2 == null) {
                    return;
                }
                if (var2.field1312 == 0) {
                    class29.method298(var2.field1315, var2.field1311, (byte) -126);
                    if ((this.field215.method35(var2.field1315, (byte) -6) & 98) != 0) {
                        this.field376 = true;
                        if (this.field321 != -1 || this.field439 != -1) {
                            this.field80 = true;
                        }
                    }
                }
                if (var2.field1312 == 1 && var2.field1311 != null) {
                    class42.method379(this.field190, var2.field1311);
                }
                if (var2.field1312 == 2 && this.field522 == var2.field1315 && var2.field1311 != null) {
                    this.method68(this.field523, var2.field1311, 446);
                }
                if (var2.field1312 == 3 && this.field191 == 1) {
                    for (int var3 = 0; var3 < this.field82.length; ++var3) {
                        if (this.field463[var3] == var2.field1315) {
                            this.field82[var3] = var2.field1311;
                            if (var2.field1311 == null) {
                                this.field463[var3] = -1;
                            }
                            break;
                        }
                        if (this.field464[var3] == var2.field1315) {
                            this.field416[var3] = var2.field1311;
                            if (var2.field1311 == null) {
                                this.field464[var3] = -1;
                            }
                            break;
                        }
                    }
                }
                if (var2.field1312 == 93 && this.field215.method37(var2.field1315, -981)) {
                    class53.method472(this.field215, (byte) 3, new class25(var2.field1311, 713));
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public final boolean method60(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field197[var15][var39] = 0;
                this.field92[var15][var39] = 99999999;
            }
        }
        int var16 = arg4;
        int var17 = arg10;
        this.field197[arg4][arg10] = 99;
        if (arg6 <= 0) {
            this.method176();
        }
        this.field92[arg4][arg10] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field562[var18] = arg4;
        int var40 = var18 + 1;
        this.field563[var18] = arg10;
        boolean var20 = false;
        int var21 = this.field562.length;
        int[][] var22 = this.field85[this.field220].field7;
        while (var40 != var19) {
            var16 = this.field562[var19];
            var17 = this.field563[var19];
            var19 = (var19 + 1) % var21;
            if (arg9 == var16 && arg0 == var17) {
                var20 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && this.field85[this.field220].method10(var17, arg0, arg7, arg3 - 1, var16, arg9, 0)) {
                    var20 = true;
                    break;
                }
                if (arg3 < 10 && this.field85[this.field220].method11(arg9, var17, var16, arg7, arg0, arg3 - 1, 6)) {
                    var20 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg5 != 0 && this.field85[this.field220].method12(arg11, arg0, (byte) 9, arg8, arg5, var17, arg9, var16)) {
                var20 = true;
                break;
            }
            int var38 = this.field92[var16][var17] + 1;
            if (var16 > 0 && this.field197[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field562[var40] = var16 - 1;
                this.field563[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field197[var16 - 1][var17] = 2;
                this.field92[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field197[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field562[var40] = var16 + 1;
                this.field563[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field197[var16 + 1][var17] = 8;
                this.field92[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field197[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field562[var40] = var16;
                this.field563[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field197[var16][var17 - 1] = 1;
                this.field92[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field197[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field562[var40] = var16;
                this.field563[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field197[var16][var17 + 1] = 4;
                this.field92[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field197[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field562[var40] = var16 - 1;
                this.field563[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field197[var16 - 1][var17 - 1] = 3;
                this.field92[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field197[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field562[var40] = var16 + 1;
                this.field563[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field197[var16 + 1][var17 - 1] = 9;
                this.field92[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field197[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field562[var40] = var16 - 1;
                this.field563[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field197[var16 - 1][var17 + 1] = 6;
                this.field92[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field197[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field562[var40] = var16 + 1;
                this.field563[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field197[var16 + 1][var17 + 1] = 12;
                this.field92[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field511 = 0;
        if (!var20) {
            if (!arg2) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg9 - var25; var26 <= arg9 + var25; ++var26) {
                for (int var27 = arg0 - var25; var27 <= arg0 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field92[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg9) {
                            var28 = arg9 - var26;
                        } else if (var26 > arg9 + arg11 - 1) {
                            var28 = var26 - (arg9 + arg11 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg0) {
                            var29 = arg0 - var27;
                        } else if (var27 > arg0 + arg5 - 1) {
                            var29 = var27 - (arg0 + arg5 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field92[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field92[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg4 == var16 && arg10 == var17) {
                return false;
            }
            this.field511 = 1;
        }
        byte var31 = 0;
        this.field562[var31] = var16;
        int var41 = var31 + 1;
        this.field563[var31] = var17;
        int var32;
        int var33 = var32 = this.field197[var16][var17];
        while (arg4 != var16 || arg10 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field562[var41] = var16;
                this.field563[var41++] = var17;
            }
            if ((var33 & 2) != 0) {
                ++var16;
            } else if ((var33 & 8) != 0) {
                --var16;
            }
            if ((var33 & 1) != 0) {
                ++var17;
            } else if ((var33 & 4) != 0) {
                --var17;
            }
            var33 = this.field197[var16][var17];
        }
        if (var41 <= 0) {
            if (arg1 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var34 = var41;
            if (var41 > 25) {
                var34 = 25;
            }
            --var41;
            int var35 = this.field562[var41];
            int var36 = this.field563[var41];
            if (arg1 == 0) {
                this.field77.method234(-281, 45);
                this.field77.method235(var34 + var34 + 3);
            }
            if (arg1 == 1) {
                this.field77.method234(-281, 89);
                this.field77.method235(var34 + var34 + 3 + 14);
            }
            if (arg1 == 2) {
                this.field77.method234(-281, 97);
                this.field77.method235(var34 + var34 + 3);
            }
            this.field316 = this.field562[0];
            this.field317 = this.field563[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field77.method235(this.field562[var41] - var35);
                this.field77.method235(this.field563[var41] - var36);
            }
            this.field77.method261(false, super.field1190[5] == 1 ? 1 : 0);
            this.field77.method270(this.field205 + var35, this.field151);
            this.field77.method269(-65, this.field206 + var36);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method61(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field291 = "";
                this.field292 = "Connecting to server...";
                this.method175(9542, true);
            }
            this.field164 = new class7(true, this.method158(field551 + 43594), this);
            long var4 = class50.method452(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field77.field837 = 0;
            this.field77.method235(14);
            this.field77.method235(var6);
            this.field164.method198(this.field77.field836, 2, 0, -296);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field164.method195();
            }
            int var8 = this.field164.method195();
            int var9 = var8;
            if (var8 == 0) {
                this.field164.method197(this.field283.field836, 0, 8);
                this.field283.field837 = 0;
                this.field486 = this.field283.method251(-225);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field486 >> 32), (int) this.field486 };
                this.field77.field837 = 0;
                this.field77.method235(10);
                this.field77.method239(var10[0]);
                this.field77.method239(var10[1]);
                this.field77.method239(var10[2]);
                this.field77.method239(var10[3]);
                this.field77.method239(signlink.uid);
                this.field77.method242(arg0);
                this.field77.method242(arg1);
                this.field77.method260(field279, true, field192);
                this.field213.field837 = 0;
                if (arg2) {
                    this.field213.method235(18);
                } else {
                    this.field213.method235(16);
                }
                this.field213.method235(this.field77.field837 + 36 + 1 + 1 + 2);
                this.field213.method235(255);
                this.field213.method236(376);
                this.field213.method235(field553 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field213.method239(this.field432[var11]);
                }
                this.field213.method243(0, this.field77.field836, 0, this.field77.field837);
                this.field77.field841 = new class24(var10, (byte) 119);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field176 = new class24(var10, (byte) 119);
                this.field164.method198(this.field213.field836, this.field213.field837, 0, -296);
                var8 = this.field164.method195();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method61(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field236 = this.field164.method195();
                field186 = this.field164.method195() == 1;
                this.field513 = 0L;
                this.field514 = 0;
                this.field524.field1033 = 0;
                super.field1177 = true;
                this.field444 = true;
                this.field335 = true;
                this.field77.field837 = 0;
                this.field283.field837 = 0;
                this.field507 = -1;
                this.field397 = -1;
                this.field398 = -1;
                this.field399 = -1;
                this.field506 = 0;
                this.field508 = 0;
                this.field113 = 0;
                this.field510 = 0;
                this.field561 = 0;
                this.field449 = 0;
                this.field230 = false;
                super.field1178 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field394[var13] = null;
                }
                this.field297 = 0;
                this.field98 = 0;
                this.field191 = 0;
                this.field480 = 0;
                this.field518 = (int) (Math.random() * 100.0D) - 50;
                this.field217 = (int) (Math.random() * 110.0D) - 55;
                this.field78 = (int) (Math.random() * 80.0D) - 40;
                this.field564 = (int) (Math.random() * 120.0D) - 60;
                this.field222 = (int) (Math.random() * 30.0D) - 20;
                this.field95 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field515 = 0;
                this.field154 = -1;
                this.field316 = 0;
                this.field317 = 0;
                this.field306 = 0;
                this.field254 = 0;
                for (int var14 = 0; var14 < this.field303; ++var14) {
                    this.field305[var14] = null;
                    this.field310[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field253[var15] = null;
                }
                field559 = this.field305[this.field304] = new class62();
                this.field430.method584();
                this.field425.method584();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field193[var16][var17][var18] = null;
                        }
                    }
                }
                this.field539 = new class69(223);
                this.field567 = 0;
                this.field566 = 0;
                this.method70(field84, this.field439);
                this.field439 = -1;
                this.method70(field84, this.field321);
                this.field321 = -1;
                this.method70(field84, this.field560);
                this.field560 = -1;
                this.method70(field84, this.field286);
                this.field286 = -1;
                this.method70(field84, this.field183);
                this.field183 = -1;
                this.method70(field84, this.field221);
                this.field221 = -1;
                this.method70(field84, this.field165);
                this.field165 = -1;
                this.field273 = false;
                this.field529 = 3;
                this.field229 = 0;
                this.field230 = false;
                this.field161 = false;
                this.field540 = null;
                this.field389 = 0;
                this.field285 = -1;
                this.field362 = true;
                this.method116(535);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field429[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field256[var20] = null;
                    this.field257[var20] = false;
                }
                field86 = 0;
                field225 = 0;
                field131 = 0;
                field227 = 0;
                field526 = 0;
                field187 = 0;
                field516 = 0;
                field121 = 0;
                field83 = 0;
                field185 = 0;
                this.method185(2756);
            } else if (var8 == 3) {
                this.field291 = "";
                this.field292 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field291 = "Your account has been disabled.";
                this.field292 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field291 = "Your account is already logged in.";
                this.field292 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field291 = "RuneScape has been updated!";
                this.field292 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field291 = "This world is full.";
                this.field292 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field291 = "Unable to connect.";
                this.field292 = "Login server offline.";
            } else if (var8 == 9) {
                this.field291 = "Login limit exceeded.";
                this.field292 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field291 = "Unable to connect.";
                this.field292 = "Bad session id.";
            } else if (var8 == 12) {
                this.field291 = "You need a members account to login to this world.";
                this.field292 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field291 = "Could not complete login.";
                this.field292 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field291 = "The server is being updated.";
                this.field292 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field335 = true;
                this.field77.field837 = 0;
                this.field283.field837 = 0;
                this.field507 = -1;
                this.field397 = -1;
                this.field398 = -1;
                this.field399 = -1;
                this.field506 = 0;
                this.field508 = 0;
                this.field113 = 0;
                this.field449 = 0;
                this.field230 = false;
                this.field290 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field291 = "Login attempts exceeded.";
                this.field292 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field291 = "You are standing in a members-only area.";
                this.field292 = "To play on this world move to a free area first";
            } else if (var8 == 18) {
                this.field291 = "Account locked as we suspect it has been stolen.";
                this.field292 = "Press 'recover a locked account' on front page.";
            } else if (var8 == 20) {
                this.field291 = "Invalid loginserver requested";
                this.field292 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field291 = "Malformed login packet.";
                    this.field292 = "Please try again.";
                } else if (var8 == 23) {
                    this.field291 = "No reply from loginserver.";
                    this.field292 = "Please try again.";
                } else if (var8 == 24) {
                    this.field291 = "Error loading your profile.";
                    this.field292 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field291 = "Unexpected loginserver response.";
                    this.field292 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field291 = "This computers address has been blocked";
                    this.field292 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field89 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field89;
                            this.method61(arg0, arg1, arg2);
                        } else {
                            this.field291 = "No response from loginserver";
                            this.field292 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field291 = "No response from server";
                        this.field292 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field291 = "Unexpected server response";
                    this.field292 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field164.method195();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field291 = "You have only just left another world";
                    this.field292 = "Your profile will be transferred in: " + var26;
                    this.method175(9542, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method61(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field291 = "";
            this.field292 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method62(byte arg0) {
        if (this.field407 == null) {
            super.field1173 = null;
            this.field107 = null;
            this.field105 = null;
            this.field104 = null;
            this.field106 = null;
            this.field274 = null;
            this.field275 = null;
            this.field276 = null;
            this.field410 = new class11(field169, 265, 128, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field411 = new class11(field169, 265, 128, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field407 = new class11(field169, 171, 509, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field408 = new class11(field169, 132, 360, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field409 = new class11(field169, 200, 360, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field412 = new class11(field169, 238, 202, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field413 = new class11(field169, 238, 203, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field414 = new class11(field169, 94, 74, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field415 = new class11(field169, 94, 75, this.method135((byte) 1));
            if (arg0 != 4) {
                this.field77.method235(62);
            }
            class57.method490(this.field315);
            if (this.field357 != null) {
                this.method169(true);
                this.method106(-88);
            }
            this.field396 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method63(int arg0) {
        if (arg0 >= 0) {
            this.field507 = -1;
        }
        if (this.field570 == 0) {
            int var2 = super.field1170 / 2 - 80;
            int var3 = super.field1171 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1186 == 1 && super.field1187 >= var2 - 75 && super.field1187 <= var2 + 75 && super.field1188 >= var14 - 20 && super.field1188 <= var14 + 20) {
                this.field570 = 3;
                this.field163 = 0;
            }
            int var4 = super.field1170 / 2 + 80;
            if (super.field1186 == 1 && super.field1187 >= var4 - 75 && super.field1187 <= var4 + 75 && super.field1188 >= var14 - 20 && super.field1188 <= var14 + 20) {
                this.field291 = "";
                this.field292 = "Enter your username & password.";
                this.field570 = 2;
                this.field163 = 0;
            }
        } else if (this.field570 == 2) {
            int var5 = super.field1171 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1186 == 1 && super.field1188 >= var16 - 15 && super.field1188 < var16) {
                this.field163 = 0;
            }
            var5 = var16 + 15;
            if (super.field1186 == 1 && super.field1188 >= var5 - 15 && super.field1188 < var5) {
                this.field163 = 1;
            }
            var5 += 15;
            int var6 = super.field1170 / 2 - 80;
            int var7 = super.field1171 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1186 == 1 && super.field1187 >= var6 - 75 && super.field1187 <= var6 + 75 && super.field1188 >= var17 - 20 && super.field1188 <= var17 + 20) {
                this.field89 = 0;
                this.method61(this.field447, this.field448, false);
                if (this.field335) {
                    return;
                }
            }
            int var8 = super.field1170 / 2 + 80;
            if (super.field1186 == 1 && super.field1187 >= var8 - 75 && super.field1187 <= var8 + 75 && super.field1188 >= var17 - 20 && super.field1188 <= var17 + 20) {
                this.field570 = 0;
                this.field447 = "";
                this.field448 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method357(-23366);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field87.length(); ++var11) {
                        if (var9 == field87.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field163 == 0) {
                        if (var9 == 8 && this.field447.length() > 0) {
                            this.field447 = this.field447.substring(0, this.field447.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field163 = 1;
                        }
                        if (var10) {
                            this.field447 = this.field447 + (char) var9;
                        }
                        if (this.field447.length() > 12) {
                            this.field447 = this.field447.substring(0, 12);
                        }
                    } else if (this.field163 == 1) {
                        if (var9 == 8 && this.field448.length() > 0) {
                            this.field448 = this.field448.substring(0, this.field448.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field163 = 0;
                        }
                        if (var10) {
                            this.field448 = this.field448 + (char) var9;
                        }
                        if (this.field448.length() > 20) {
                            this.field448 = this.field448.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field570 == 3) {
                int var12 = super.field1170 / 2;
                int var13 = super.field1171 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1186 == 1 && super.field1187 >= var12 - 75 && super.field1187 <= var12 + 75 && super.field1188 >= var18 - 20 && super.field1188 <= var18 + 20) {
                    this.field570 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.field252 = null;
        this.field237 = null;
        this.field558 = null;
        this.field104 = null;
        this.field105 = null;
        this.field106 = null;
        this.field107 = null;
        this.field378 = null;
        this.field379 = null;
        this.field380 = null;
        this.field381 = null;
        this.field542 = null;
        this.field456 = null;
        this.field457 = null;
        this.field458 = null;
        this.field459 = null;
        this.field460 = null;
        this.field274 = null;
        this.field275 = null;
        this.field276 = null;
        this.field391 = null;
        this.field228 = null;
        this.field232 = null;
        this.field441 = null;
        if (this.field215 != null) {
            this.field215.method25();
        }
        this.field215 = null;
        this.field440 = null;
        this.field253 = null;
        this.field255 = null;
        this.field430 = null;
        this.field425 = null;
        this.field489 = null;
        this.field490 = null;
        this.field491 = null;
        this.field452 = null;
        this.field453 = null;
        this.field454 = null;
        this.field455 = null;
        this.field364 = null;
        this.field199 = null;
        this.field77 = null;
        this.field213 = null;
        this.field283 = null;
        this.field269 = null;
        this.field270 = null;
        this.field133 = null;
        this.field239 = null;
        this.field240 = null;
        this.field241 = null;
        this.field242 = null;
        this.field243 = null;
        this.field424 = null;
        this.field226 = null;
        this.field277 = null;
        this.field85 = null;
        this.field412 = null;
        this.field413 = null;
        this.field414 = null;
        this.field415 = null;
        if (this.field524 != null) {
            this.field524.field1035 = false;
        }
        this.field524 = null;
        this.field305 = null;
        this.field307 = null;
        this.field309 = null;
        this.field310 = null;
        this.field73 = null;
        this.field410 = null;
        this.field411 = null;
        this.field407 = null;
        this.field408 = null;
        this.field409 = null;
        this.field465 = null;
        this.field466 = null;
        if (arg0 == -27208) {
            this.field467 = null;
            this.field468 = null;
            this.field469 = null;
            this.field173 = null;
            this.field102 = null;
            this.field404 = null;
            this.field210 = null;
            this.field282 = null;
            this.field109 = null;
            this.field193 = null;
            this.field539 = null;
            this.field318 = null;
            this.field167 = null;
            this.field470 = null;
            this.field471 = null;
            this.field472 = null;
            this.field473 = null;
            this.field474 = null;
            this.field115 = null;
            this.field116 = null;
            this.field117 = null;
            try {
                if (this.field164 != null) {
                    this.field164.method194();
                }
            } catch (Exception var2) {
            }
            this.field164 = null;
            this.field462 = null;
            this.field82 = null;
            this.field416 = null;
            this.field463 = null;
            this.field464 = null;
            this.method92(79);
            this.field197 = null;
            this.field92 = null;
            this.field562 = null;
            this.field563 = null;
            this.method124(0);
            class35.method334(false);
            class39.method366(false);
            class27.method295(false);
            class36.method343(false);
            class67.field1661 = null;
            class63.field1613 = null;
            class45.field1322 = null;
            class65.field1628 = null;
            class12.field683 = null;
            class12.field695 = null;
            class58.field1541 = null;
            super.field1173 = null;
            class62.field1606 = null;
            class70.method585(false);
            class46.method386(false);
            class29.method296(false);
            class42.method380(false);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (arg0 >= 0) {
            this.field209 = this.field176.method230();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method357(-23366);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field560 != -1 && this.field560 == this.field332) {
                        if (var2 == 8 && this.field359.length() > 0) {
                            this.field359 = this.field359.substring(0, this.field359.length() - 1);
                        }
                        break;
                    }
                    if (this.field161) {
                        if (var2 >= 32 && var2 <= 122 && this.field492.length() < 80) {
                            this.field492 = this.field492 + (char) var2;
                            this.field80 = true;
                        }
                        if (var2 == 8 && this.field492.length() > 0) {
                            this.field492 = this.field492.substring(0, this.field492.length() - 1);
                            this.field80 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field161 = false;
                            this.field80 = true;
                            if (this.field302 == 1) {
                                long var3 = class50.method452(this.field492);
                                this.method129(-633, var3);
                            }
                            if (this.field302 == 2 && this.field566 > 0) {
                                long var5 = class50.method452(this.field492);
                                this.method157(var5, 6362);
                            }
                            if (this.field302 == 3 && this.field492.length() > 0) {
                                this.field77.method234(-281, 73);
                                this.field77.method235(0);
                                int var7 = this.field77.field837;
                                this.field77.method241(this.field336, -45352);
                                class44.method384(this.field492, 0, this.field77);
                                this.field77.method244(0, this.field77.field837 - var7);
                                this.field492 = class44.method385(9, this.field492);
                                this.field492 = class66.method544(9, this.field492);
                                this.method160(-232, 6, this.field492, class50.method456(839, class50.method453((byte) 3, this.field336)));
                                if (this.field423 == 2) {
                                    this.field423 = 1;
                                    this.field182 = true;
                                    this.field77.method234(-281, 222);
                                    this.field77.method235(this.field352);
                                    this.field77.method235(this.field423);
                                    this.field77.method235(this.field326);
                                }
                            }
                            if (this.field302 == 4 && this.field195 < 100) {
                                long var8 = class50.method452(this.field492);
                                this.method51(var8, 0);
                            }
                            if (this.field302 == 5 && this.field195 > 0) {
                                long var10 = class50.method452(this.field492);
                                this.method150(var10, 0);
                            }
                        }
                    } else if (this.field229 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field114.length() < 10) {
                            this.field114 = this.field114 + (char) var2;
                            this.field80 = true;
                        }
                        if (var2 == 8 && this.field114.length() > 0) {
                            this.field114 = this.field114.substring(0, this.field114.length() - 1);
                            this.field80 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field114.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field114);
                                } catch (Exception var22) {
                                }
                                this.field77.method234(-281, 0);
                                this.field77.method239(var12);
                            }
                            this.field229 = 0;
                            this.field80 = true;
                        }
                    } else if (this.field229 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field114.length() < 12) {
                            this.field114 = this.field114 + (char) var2;
                            this.field80 = true;
                        }
                        if (var2 == 8 && this.field114.length() > 0) {
                            this.field114 = this.field114.substring(0, this.field114.length() - 1);
                            this.field80 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field114.length() > 0) {
                                this.field77.method234(-281, 124);
                                this.field77.method241(class50.method452(this.field114), -45352);
                            }
                            this.field229 = 0;
                            this.field80 = true;
                        }
                    } else if (this.field229 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field114.length() < 40) {
                            this.field114 = this.field114 + (char) var2;
                            this.field80 = true;
                        }
                        if (var2 == 8 && this.field114.length() > 0) {
                            this.field114 = this.field114.substring(0, this.field114.length() - 1);
                            this.field80 = true;
                        }
                    } else if (this.field321 == -1 && this.field286 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field450.length() < 80) {
                            this.field450 = this.field450 + (char) var2;
                            this.field80 = true;
                        }
                        if (var2 == 8 && this.field450.length() > 0) {
                            this.field450 = this.field450.substring(0, this.field450.length() - 1);
                            this.field80 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field450.length() > 0) {
                            if (this.field236 == 2) {
                                if (this.field450.equals("::clientdrop")) {
                                    this.method183(false);
                                }
                                if (this.field450.equals("::lag")) {
                                    this.method134(0);
                                }
                                if (this.field450.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field215.method27(-792, 2); ++var13) {
                                        this.field215.method23(var13, (byte) 1, 46267, 2);
                                    }
                                }
                                if (this.field450.equals("::fpson")) {
                                    field134 = true;
                                }
                                if (this.field450.equals("::fpsoff")) {
                                    field134 = false;
                                }
                                if (this.field450.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field85[var14].field7[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field450.startsWith("::")) {
                                this.field77.method234(-281, 63);
                                this.field77.method235(this.field450.length() - 1);
                                this.field77.method242(this.field450.substring(2));
                            } else {
                                String var17 = this.field450.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field450 = this.field450.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field450 = this.field450.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field450 = this.field450.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field450 = this.field450.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field450 = this.field450.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field450 = this.field450.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field450 = this.field450.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field450 = this.field450.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field450 = this.field450.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field450 = this.field450.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field450 = this.field450.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field450 = this.field450.substring(6);
                                }
                                String var19 = this.field450.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field450 = this.field450.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field450 = this.field450.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field450 = this.field450.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field450 = this.field450.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field450 = this.field450.substring(6);
                                }
                                this.field77.method234(-281, 34);
                                this.field77.method235(0);
                                int var21 = this.field77.field837;
                                this.field77.method235(var20);
                                this.field77.method235(var18);
                                this.field252.field837 = 0;
                                class44.method384(this.field450, 0, this.field252);
                                this.field77.method280(0, this.field340, this.field252.field837, this.field252.field836);
                                this.field77.method244(0, this.field77.field837 - var21);
                                this.field450 = class44.method385(9, this.field450);
                                this.field450 = class66.method544(9, this.field450);
                                field559.field606 = this.field450;
                                field559.field637 = var18;
                                field559.field632 = var20;
                                field559.field631 = 150;
                                if (this.field236 == 2) {
                                    this.method160(-232, 2, field559.field606, "@cr2@" + field559.field1594);
                                } else if (this.field236 == 1) {
                                    this.method160(-232, 2, field559.field606, "@cr1@" + field559.field1594);
                                } else {
                                    this.method160(-232, 2, field559.field606, field559.field1594);
                                }
                                if (this.field352 == 2) {
                                    this.field352 = 3;
                                    this.field182 = true;
                                    this.field77.method234(-281, 222);
                                    this.field77.method235(this.field352);
                                    this.field77.method235(this.field423);
                                    this.field77.method235(this.field326);
                                }
                            }
                            this.field450 = "";
                            this.field80 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field359.length() < 12) {
                this.field359 = this.field359 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (super.field1173 == null) {
            this.method124(0);
            this.field407 = null;
            this.field408 = null;
            this.field409 = null;
            this.field410 = null;
            this.field411 = null;
            this.field412 = null;
            this.field413 = null;
            this.field414 = null;
            this.field415 = null;
            this.field107 = null;
            this.field105 = null;
            this.field104 = null;
            this.field106 = null;
            this.field274 = null;
            this.field275 = null;
            this.field276 = null;
            if (arg0) {
                field402 = 68;
            }
            super.field1173 = new class11(field169, 503, 765, this.method135((byte) 1));
            this.field396 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLGPLGZASP;I)V")
    public final void method67(int arg0, boolean arg1, class21 arg2, int arg3) {
        if (arg1) {
            this.field119 = 311;
        }
        int var5 = arg0 * arg0 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field95 + this.field564 & 2047;
            int var7 = class29.field984[var6];
            int var8 = class29.field985[var6];
            int var9 = var7 * 256 / (this.field222 + 256);
            int var10 = var8 * 256 / (this.field222 + 256);
            int var11 = arg0 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg0 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field145.method225(256, 15, 20, 20, this.field244, var15 + 94 + 4 - 10, var13, 15, 83 - var16 - 20);
        } else {
            this.method171(arg0, arg3, arg2, this.field488);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
    public final void method68(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 <= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (this.field111) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method69(byte arg0) {
        this.field105.method205(0);
        if (this.field515 == 2) {
            byte[] var2 = this.field490.field1449;
            int[] var3 = class57.field1529;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field173.method224(0, 235, 256, this.field322, 0, this.field175, 33, 33, 25, 25, this.field95);
            this.field106.method205(0);
            class70.field1713 = this.field264;
        } else {
            int var6 = this.field95 + this.field564 & 2047;
            int var7 = field559.field620 / 32 + 48;
            if (arg0 == 9) {
                boolean var8 = false;
            } else {
                field181 = !field181;
            }
            int var9 = 464 - field559.field621 / 32;
            this.field318.method224(25, 235, this.field222 + 256, this.field338, 5, this.field219, 146, 151, var7, var9, var6);
            this.field173.method224(0, 235, 256, this.field322, 0, this.field175, 33, 33, 25, 25, this.field95);
            for (int var10 = 0; var10 < this.field268; ++var10) {
                int var40 = this.field269[var10] * 4 + 2 - field559.field620 / 32;
                int var41 = this.field270[var10] * 4 + 2 - field559.field621 / 32;
                this.method171(var40, var41, this.field133[var10], this.field488);
            }
            for (int var11 = 0; var11 < 104; ++var11) {
                for (int var36 = 0; var36 < 104; ++var36) {
                    class69 var37 = this.field193[this.field220][var11][var36];
                    if (var37 != null) {
                        int var38 = var11 * 4 + 2 - field559.field620 / 32;
                        int var39 = var36 * 4 + 2 - field559.field621 / 32;
                        this.method171(var38, var39, this.field470, this.field488);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field254; ++var12) {
                class32 var32 = this.field253[this.field255[var12]];
                if (var32 != null && var32.method203(this.field382)) {
                    class39 var33 = var32.field1028;
                    if (var33.field1231 != null) {
                        var33 = var33.method362(4);
                    }
                    if (var33 != null && var33.field1246 && var33.field1239) {
                        int var34 = var32.field620 / 32 - field559.field620 / 32;
                        int var35 = var32.field621 / 32 - field559.field621 / 32;
                        this.method171(var34, var35, this.field471, this.field488);
                    }
                }
            }
            for (int var13 = 0; var13 < this.field306; ++var13) {
                class62 var24 = this.field305[this.field307[var13]];
                if (var24 != null && var24.method203(this.field382)) {
                    int var25 = var24.field620 / 32 - field559.field620 / 32;
                    int var26 = var24.field621 / 32 - field559.field621 / 32;
                    boolean var27 = false;
                    long var28 = class50.method452(var24.field1594);
                    for (int var30 = 0; var30 < this.field566; ++var30) {
                        if (this.field232[var30] == var28 && this.field441[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var31 = false;
                    if (field559.field1604 != 0 && var24.field1604 != 0 && field559.field1604 == var24.field1604) {
                        var31 = true;
                    }
                    if (var27) {
                        this.method171(var25, var26, this.field473, this.field488);
                    } else if (var31) {
                        this.method171(var25, var26, this.field474, this.field488);
                    } else {
                        this.method171(var25, var26, this.field472, this.field488);
                    }
                }
            }
            if (this.field561 != 0 && field343 % 20 < 10) {
                if (this.field561 == 1 && this.field75 >= 0 && this.field75 < this.field253.length) {
                    class32 var14 = this.field253[this.field75];
                    if (var14 != null) {
                        int var15 = var14.field620 / 32 - field559.field620 / 32;
                        int var16 = var14.field621 / 32 - field559.field621 / 32;
                        this.method67(var15, false, this.field557, var16);
                    }
                }
                if (this.field561 == 2) {
                    int var17 = (this.field383 - this.field205) * 4 + 2 - field559.field620 / 32;
                    int var18 = (this.field384 - this.field206) * 4 + 2 - field559.field621 / 32;
                    this.method67(var17, false, this.field557, var18);
                }
                if (this.field561 == 10 && this.field135 >= 0 && this.field135 < this.field305.length) {
                    class62 var19 = this.field305[this.field135];
                    if (var19 != null) {
                        int var20 = var19.field620 / 32 - field559.field620 / 32;
                        int var21 = var19.field621 / 32 - field559.field621 / 32;
                        this.method67(var20, false, this.field557, var21);
                    }
                }
            }
            if (this.field316 != 0) {
                int var22 = this.field316 * 4 + 2 - field559.field620 / 32;
                int var23 = this.field317 * 4 + 2 - field559.field621 / 32;
                this.method171(var22, var23, this.field556, this.field488);
            }
            class57.method492(3, 78, 16777215, -60, 3, 97);
            this.field106.method205(0);
            class70.field1713 = this.field264;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method70(byte arg0, int arg1) {
        if (arg0 != -79) {
            field418 = !field418;
        }
        class36.method348(field84, arg1);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method71(boolean arg0) {
        int var2 = this.field147;
        int var3 = this.field148;
        int var4 = this.field149;
        int var5 = this.field150;
        int var6 = 6116423;
        class57.method492(var4, var3, var6, -60, var5, var2);
        class57.method492(var4 - 2, var3 + 1, 0, -60, 16, var2 + 1);
        class57.method493(0, var4 - 2, var5 - 19, var3 + 18, (byte) 0, var2 + 1);
        if (arg0) {
            field418 = !field418;
        }
        this.field496.method506(var6, "Choose Option", var2 + 3, false, var3 + 14);
        int var7 = super.field1180;
        int var8 = super.field1181;
        if (this.field146 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field146 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field146 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field449; ++var9) {
            int var10 = (this.field449 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field496.method510(this.field542[var9], true, var2 + 3, var11, var10, 441);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLMIIVNBFU;)Z")
    public final boolean method72(boolean arg0, class36 arg1) {
        this.field335 &= arg0;
        int var3 = arg1.field1146;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field542[this.field449] = "Remove @whi@" + arg1.field1094;
                this.field380[this.field449] = 169;
                ++this.field449;
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
            this.field542[this.field449] = "Remove @whi@" + this.field228[var3];
            this.field380[this.field449] = 140;
            ++this.field449;
            this.field542[this.field449] = "Message @whi@" + this.field228[var3];
            this.field380[this.field449] = 788;
            ++this.field449;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (arg0) {
            if (!this.field530 && !this.field426 && !this.field216) {
                ++field200;
                if (!this.field335) {
                    this.method175(9542, false);
                } else {
                    this.method82(this.field198);
                }
                this.field517 = 0;
            } else {
                this.method174(-473);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method74(int arg0) {
        ++this.field202;
        this.method47(true, 7);
        this.method48((byte) 20, true);
        this.method47(false, 7);
        this.method48((byte) 20, false);
        this.method101((byte) 0);
        this.method154(6);
        if (!this.field521) {
            int var2 = this.field94;
            if (this.field344 / 256 > var2) {
                var2 = this.field344 / 256;
            }
            if (this.field356[4] && this.field284[4] + 128 > var2) {
                var2 = this.field284[4] + 128;
            }
            int var3 = this.field95 + this.field78 & 2047;
            this.method140(58, var2, this.field534, this.method146(field559.field621, this.field220, field559.field620, (byte) -112) - 50, this.field535, var3, var2 * 3 + 600);
            ++field365;
            if (field365 > 148) {
                field365 = 0;
                this.field77.method234(-281, 75);
                this.field77.method239(0);
            }
        }
        int var4;
        if (!this.field521) {
            var4 = this.method114(this.field272);
        } else {
            var4 = this.method115((byte) 125);
        }
        int var5 = this.field126;
        int var6 = this.field127;
        int var7 = this.field128;
        int var8 = this.field129;
        int var9 = this.field130;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field356[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field251[var10] * 2 + 1) - (double) this.field251[var10] + Math.sin((double) this.field568[var10] / 100.0D * (double) this.field334[var10]) * (double) this.field284[var10]);
                if (var10 == 0) {
                    this.field126 += var13;
                }
                if (var10 == 1) {
                    this.field127 += var13;
                }
                if (var10 == 2) {
                    this.field128 += var13;
                }
                if (var10 == 3) {
                    this.field130 = this.field130 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field129 += var13;
                    if (this.field129 < 128) {
                        this.field129 = 128;
                    }
                    if (this.field129 > 383) {
                        this.field129 = 383;
                    }
                }
            }
        }
        int var11 = class70.field1722;
        class29.field979 = true;
        int var12 = 48 / arg0;
        class29.field982 = 0;
        class29.field980 = super.field1180 - 4;
        class29.field981 = super.field1181 - 4;
        class57.method490(this.field315);
        this.field277.method426(this.field130, var4, this.field129, this.field127, 1, this.field128, this.field126);
        this.field277.method401(-598);
        this.method165((byte) 1);
        this.method50(0);
        this.method149(var11, false);
        this.method117(this.field112);
        this.field106.method206(4, super.field1172, 9, 4);
        this.field126 = var5;
        this.field127 = var6;
        this.field128 = var7;
        this.field129 = var8;
        this.field130 = var9;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method75(int arg0) {
        if (arg0 == 3) {
            for (int var2 = 0; var2 < this.field254; ++var2) {
                int var3 = this.field255[var2];
                class32 var4 = this.field253[var3];
                if (var4 != null) {
                    this.method76(9, var4, var4.field1028.field1211);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILDBHOKPMQ;I)V")
    public final void method76(int arg0, class8 arg1, int arg2) {
        if (arg1.field620 < 128 || arg1.field621 < 128 || arg1.field620 >= 13184 || arg1.field621 >= 13184) {
            arg1.field615 = -1;
            arg1.field601 = -1;
            arg1.field590 = 0;
            arg1.field591 = 0;
            arg1.field620 = arg1.field609[0] * 128 + arg1.field633 * 64;
            arg1.field621 = arg1.field610[0] * 128 + arg1.field633 * 64;
            arg1.method200((byte) 89);
        }
        if (field559 == arg1 && (arg1.field620 < 1536 || arg1.field621 < 1536 || arg1.field620 >= 11776 || arg1.field621 >= 11776)) {
            arg1.field615 = -1;
            arg1.field601 = -1;
            arg1.field590 = 0;
            arg1.field591 = 0;
            arg1.field620 = arg1.field609[0] * 128 + arg1.field633 * 64;
            arg1.field621 = arg1.field610[0] * 128 + arg1.field633 * 64;
            arg1.method200((byte) 89);
        }
        if (arg1.field590 > field343) {
            this.method77(false, arg1);
        } else if (arg1.field591 >= field343) {
            this.method78(arg1, true);
        } else {
            this.method79(arg1, 826);
        }
        this.method80(arg1, -535);
        this.method81(0, arg1);
        if (arg0 != 9) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLDBHOKPMQ;)V")
    public final void method77(boolean arg0, class8 arg1) {
        int var3 = arg1.field590 - field343;
        int var4 = arg1.field633 * 64 + arg1.field586 * 128;
        int var5 = arg1.field633 * 64 + arg1.field588 * 128;
        arg1.field620 += (var4 - arg1.field620) / var3;
        arg1.field621 += (var5 - arg1.field621) / var3;
        arg1.field627 = 0;
        if (arg0) {
            this.field315 = -189;
        }
        if (arg1.field592 == 0) {
            arg1.field600 = 1024;
        }
        if (arg1.field592 == 1) {
            arg1.field600 = 1536;
        }
        if (arg1.field592 == 2) {
            arg1.field600 = 0;
        }
        if (arg1.field592 == 3) {
            arg1.field600 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LDBHOKPMQ;Z)V")
    public final void method78(class8 arg0, boolean arg1) {
        if (field343 == arg0.field591 || arg0.field615 == -1 || arg0.field618 != 0 || arg0.field617 + 1 > class65.field1628[arg0.field615].method532(arg0.field616, (byte) 6)) {
            int var3 = arg0.field591 - arg0.field590;
            int var4 = field343 - arg0.field590;
            int var5 = arg0.field633 * 64 + arg0.field586 * 128;
            int var6 = arg0.field633 * 64 + arg0.field588 * 128;
            int var7 = arg0.field633 * 64 + arg0.field587 * 128;
            int var8 = arg0.field633 * 64 + arg0.field589 * 128;
            arg0.field620 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field621 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field627 = 0;
        this.field335 &= arg1;
        if (arg0.field592 == 0) {
            arg0.field600 = 1024;
        }
        if (arg0.field592 == 1) {
            arg0.field600 = 1536;
        }
        if (arg0.field592 == 2) {
            arg0.field600 = 0;
        }
        if (arg0.field592 == 3) {
            arg0.field600 = 512;
        }
        arg0.field622 = arg0.field600;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LDBHOKPMQ;I)V")
    public final void method79(class8 arg0, int arg1) {
        arg0.field634 = arg0.field607;
        if (arg0.field595 == 0) {
            arg0.field627 = 0;
        } else {
            if (arg0.field615 != -1 && arg0.field618 == 0) {
                class65 var3 = class65.field1628[arg0.field615];
                if (arg0.field612 > 0 && var3.field1640 == 0) {
                    ++arg0.field627;
                    return;
                }
                if (arg0.field612 <= 0 && var3.field1641 == 0) {
                    ++arg0.field627;
                    return;
                }
            }
            int var4 = arg0.field620;
            int var5 = arg0.field621;
            int var6 = arg0.field609[arg0.field595 - 1] * 128 + arg0.field633 * 64;
            int var7 = arg0.field610[arg0.field595 - 1] * 128 + arg0.field633 * 64;
            if (arg1 <= 0) {
                this.field507 = -1;
            }
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field600 = 1280;
                    } else if (var5 > var7) {
                        arg0.field600 = 1792;
                    } else {
                        arg0.field600 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field600 = 768;
                    } else if (var5 > var7) {
                        arg0.field600 = 256;
                    } else {
                        arg0.field600 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field600 = 1024;
                } else {
                    arg0.field600 = 0;
                }
                int var8 = arg0.field600 - arg0.field622 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field597;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field596;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field599;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field598;
                }
                if (var9 == -1) {
                    var9 = arg0.field596;
                }
                arg0.field634 = var9;
                int var10 = 4;
                if (arg0.field622 != arg0.field600 && arg0.field626 == -1 && arg0.field611 != 0) {
                    var10 = 2;
                }
                if (arg0.field595 > 2) {
                    var10 = 6;
                }
                if (arg0.field595 > 3) {
                    var10 = 8;
                }
                if (arg0.field627 > 0 && arg0.field595 > 1) {
                    var10 = 8;
                    --arg0.field627;
                }
                if (arg0.field614[arg0.field595 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field634 == arg0.field596 && arg0.field639 != -1) {
                    arg0.field634 = arg0.field639;
                }
                if (var4 < var6) {
                    arg0.field620 += var10;
                    if (arg0.field620 > var6) {
                        arg0.field620 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field620 -= var10;
                    if (arg0.field620 < var6) {
                        arg0.field620 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field621 += var10;
                    if (arg0.field621 > var7) {
                        arg0.field621 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field621 -= var10;
                    if (arg0.field621 < var7) {
                        arg0.field621 = var7;
                    }
                }
                if (arg0.field620 == var6 && arg0.field621 == var7) {
                    --arg0.field595;
                    if (arg0.field612 > 0) {
                        --arg0.field612;
                        return;
                    }
                }
            } else {
                arg0.field620 = var6;
                arg0.field621 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LDBHOKPMQ;I)V")
    public final void method80(class8 arg0, int arg1) {
        if (arg1 >= 0) {
            this.method176();
        }
        if (arg0.field611 != 0) {
            if (arg0.field626 != -1 && arg0.field626 < 32768) {
                class32 var3 = this.field253[arg0.field626];
                if (var3 != null) {
                    int var4 = arg0.field620 - var3.field620;
                    int var5 = arg0.field621 - var3.field621;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field600 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field626 >= 32768) {
                int var6 = arg0.field626 - 32768;
                if (this.field350 == var6) {
                    var6 = this.field304;
                }
                class62 var7 = this.field305[var6];
                if (var7 != null) {
                    int var8 = arg0.field620 - var7.field620;
                    int var9 = arg0.field621 - var7.field621;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field600 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field593 != 0 || arg0.field594 != 0) && (arg0.field595 == 0 || arg0.field627 > 0)) {
                int var10 = arg0.field620 - (arg0.field593 - this.field205 - this.field205) * 64;
                int var11 = arg0.field621 - (arg0.field594 - this.field206 - this.field206) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field600 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field593 = 0;
                arg0.field594 = 0;
            }
            int var12 = arg0.field600 - arg0.field622 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field611 && var12 <= 2048 - arg0.field611) {
                    if (var12 > 1024) {
                        arg0.field622 -= arg0.field611;
                    } else {
                        arg0.field622 += arg0.field611;
                    }
                } else {
                    arg0.field622 = arg0.field600;
                }
                arg0.field622 &= 2047;
                if (arg0.field634 == arg0.field607 && arg0.field622 != arg0.field600) {
                    if (arg0.field608 != -1) {
                        arg0.field634 = arg0.field608;
                        return;
                    }
                    arg0.field634 = arg0.field596;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILDBHOKPMQ;)V")
    public final void method81(int arg0, class8 arg1) {
        if (arg0 != 0) {
            this.field507 = -1;
        }
        arg1.field641 = false;
        if (arg1.field634 != -1) {
            class65 var3 = class65.field1628[arg1.field634];
            ++arg1.field636;
            if (arg1.field635 < var3.field1629 && arg1.field636 > var3.method532(arg1.field635, (byte) 6)) {
                arg1.field636 = 1;
                ++arg1.field635;
            }
            if (arg1.field635 >= var3.field1629) {
                arg1.field636 = 1;
                arg1.field635 = 0;
            }
        }
        if (arg1.field601 != -1 && field343 >= arg1.field604) {
            if (arg1.field602 < 0) {
                arg1.field602 = 0;
            }
            class65 var4 = class12.field683[arg1.field601].field687;
            ++arg1.field603;
            if (arg1.field602 < var4.field1629 && arg1.field603 > var4.method532(arg1.field602, (byte) 6)) {
                arg1.field603 = 1;
                ++arg1.field602;
            }
            if (arg1.field602 >= var4.field1629 && (arg1.field602 < 0 || arg1.field602 >= var4.field1629)) {
                arg1.field601 = -1;
            }
        }
        if (arg1.field615 != -1 && arg1.field618 <= 1) {
            class65 var5 = class65.field1628[arg1.field615];
            if (var5.field1640 == 1 && arg1.field612 > 0 && arg1.field590 <= field343 && arg1.field591 < field343) {
                arg1.field618 = 1;
                return;
            }
        }
        if (arg1.field615 != -1 && arg1.field618 == 0) {
            class65 var6 = class65.field1628[arg1.field615];
            ++arg1.field617;
            if (arg1.field616 < var6.field1629 && arg1.field617 > var6.method532(arg1.field616, (byte) 6)) {
                arg1.field617 = 1;
                ++arg1.field616;
            }
            if (arg1.field616 >= var6.field1629) {
                arg1.field616 -= var6.field1633;
                ++arg1.field619;
                if (arg1.field619 >= var6.field1639) {
                    arg1.field615 = -1;
                }
                if (arg1.field616 < 0 || arg1.field616 >= var6.field1629) {
                    arg1.field615 = -1;
                }
            }
            arg1.field641 = var6.field1635;
        }
        if (arg1.field618 > 0) {
            --arg1.field618;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method82(boolean arg0) {
        if (!arg0) {
            if (this.field286 != -1 && (this.field191 == 2 || super.field1173 != null)) {
                if (this.field191 == 2) {
                    this.method87(this.field286, (byte) -13, this.field442);
                    if (this.field183 != -1) {
                        this.method87(this.field183, (byte) -13, this.field442);
                    }
                    this.field442 = 0;
                    this.method66(false);
                    super.field1173.method205(0);
                    class70.field1713 = this.field265;
                    class57.method490(this.field315);
                    this.field396 = true;
                    class36 var2 = class36.method350(this.field286);
                    if (var2.field1087 == 512 && var2.field1157 == 334 && var2.field1140 == 0) {
                        var2.field1087 = 765;
                        var2.field1157 = 503;
                    }
                    this.method133(0, 0, var2, 0, 0);
                    if (this.field183 != -1) {
                        class36 var3 = class36.method350(this.field183);
                        if (var3.field1087 == 512 && var3.field1157 == 334 && var3.field1140 == 0) {
                            var3.field1087 = 765;
                            var3.field1157 = 503;
                        }
                        this.method133(0, 0, var3, 0, 0);
                    }
                    if (!this.field230) {
                        this.method109(9);
                        this.method96(0);
                    } else {
                        this.method71(false);
                    }
                }
                super.field1173.method206(0, super.field1172, 9, 0);
            } else {
                if (this.field396) {
                    this.method185(2756);
                    this.field396 = false;
                    this.field452.method206(0, super.field1172, 9, 4);
                    this.field453.method206(0, super.field1172, 9, 357);
                    this.field454.method206(722, super.field1172, 9, 4);
                    this.field455.method206(743, super.field1172, 9, 205);
                    this.field456.method206(0, super.field1172, 9, 0);
                    this.field457.method206(516, super.field1172, 9, 4);
                    this.field458.method206(516, super.field1172, 9, 205);
                    this.field459.method206(496, super.field1172, 9, 357);
                    this.field460.method206(0, super.field1172, 9, 338);
                    this.field376 = true;
                    this.field80 = true;
                    this.field120 = true;
                    this.field182 = true;
                    if (this.field191 != 2) {
                        this.field106.method206(4, super.field1172, 9, 4);
                        this.field105.method206(550, super.field1172, 9, 4);
                    }
                }
                if (this.field191 == 2) {
                    this.method74(179);
                }
                if (this.field230 && this.field146 == 1) {
                    this.field376 = true;
                }
                if (this.field221 != -1) {
                    boolean var4 = this.method87(this.field221, (byte) -13, this.field442);
                    if (var4) {
                        this.field376 = true;
                    }
                }
                if (this.field478 == 2) {
                    this.field376 = true;
                }
                if (this.field546 == 2) {
                    this.field376 = true;
                }
                if (this.field376) {
                    this.method153(false);
                    this.field376 = false;
                }
                ++field212;
                if (field212 > 1085) {
                    field212 = 0;
                    this.field77.method234(-281, 22);
                    this.field77.method235(0);
                    int var5 = this.field77.field837;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field77.method235(22);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field77.method235(115);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field77.method236(11812);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field77.method235(72);
                    }
                    this.field77.method236(38281);
                    this.field77.method236(19117);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field77.method236(5064);
                    }
                    this.field77.method235(17);
                    this.field77.method236(51022);
                    this.field77.method235((int) (Math.random() * 256.0D));
                    this.field77.method244(0, this.field77.field837 - var5);
                }
                if (this.field321 == -1 && this.field229 == 0) {
                    this.field503.field1106 = this.field339 - this.field189 - 77;
                    if (super.field1180 > 448 && super.field1180 < 560 && super.field1181 > 332) {
                        this.method84(77, this.field339, 0, 463, super.field1180 - 17, this.field503, super.field1181 - 357, -1, 0);
                    }
                    int var6 = this.field339 - 77 - this.field503.field1106;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var6 > this.field339 - 77) {
                        var6 = this.field339 - 77;
                    }
                    if (this.field189 != var6) {
                        this.field189 = var6;
                        this.field80 = true;
                    }
                }
                if (this.field321 == -1 && this.field229 == 3) {
                    int var7 = this.field157 * 14 + 7;
                    this.field503.field1106 = this.field160;
                    if (super.field1180 > 448 && super.field1180 < 560 && super.field1181 > 332) {
                        this.method84(77, var7, 0, 463, super.field1180 - 17, this.field503, super.field1181 - 357, -1, 0);
                    }
                    int var8 = this.field503.field1106;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    if (var8 > var7 - 77) {
                        var8 = var7 - 77;
                    }
                    if (this.field160 != var8) {
                        this.field160 = var8;
                        this.field80 = true;
                    }
                }
                if (this.field321 != -1) {
                    boolean var9 = this.method87(this.field321, (byte) -13, this.field442);
                    if (var9) {
                        this.field80 = true;
                    }
                }
                if (this.field478 == 3) {
                    this.field80 = true;
                }
                if (this.field546 == 3) {
                    this.field80 = true;
                }
                if (this.field540 != null) {
                    this.field80 = true;
                }
                if (this.field230 && this.field146 == 2) {
                    this.field80 = true;
                }
                if (this.field80) {
                    this.method145(7);
                    this.field80 = false;
                }
                if (this.field191 == 2) {
                    this.method69(this.field431);
                    this.field105.method206(550, super.field1172, 9, 4);
                }
                if (this.field285 != -1) {
                    this.field120 = true;
                }
                if (this.field120) {
                    if (this.field285 != -1 && this.field529 == this.field285) {
                        this.field285 = -1;
                        this.field77.method234(-281, 192);
                        this.field77.method235(this.field529);
                    }
                    this.field120 = false;
                    this.field276.method205(0);
                    this.field117.method463(-40219, 0, 0);
                    if (this.field221 == -1) {
                        if (this.field351[this.field529] != -1) {
                            if (this.field529 == 0) {
                                this.field239.method463(-40219, 10, 22);
                            }
                            if (this.field529 == 1) {
                                this.field240.method463(-40219, 8, 54);
                            }
                            if (this.field529 == 2) {
                                this.field240.method463(-40219, 8, 82);
                            }
                            if (this.field529 == 3) {
                                this.field241.method463(-40219, 8, 110);
                            }
                            if (this.field529 == 4) {
                                this.field243.method463(-40219, 8, 153);
                            }
                            if (this.field529 == 5) {
                                this.field243.method463(-40219, 8, 181);
                            }
                            if (this.field529 == 6) {
                                this.field242.method463(-40219, 9, 209);
                            }
                        }
                        if (this.field351[0] != -1 && (this.field285 != 0 || field343 % 20 < 10)) {
                            this.field199[0].method463(-40219, 13, 29);
                        }
                        if (this.field351[1] != -1 && (this.field285 != 1 || field343 % 20 < 10)) {
                            this.field199[1].method463(-40219, 11, 53);
                        }
                        if (this.field351[2] != -1 && (this.field285 != 2 || field343 % 20 < 10)) {
                            this.field199[2].method463(-40219, 11, 82);
                        }
                        if (this.field351[3] != -1 && (this.field285 != 3 || field343 % 20 < 10)) {
                            this.field199[3].method463(-40219, 12, 115);
                        }
                        if (this.field351[4] != -1 && (this.field285 != 4 || field343 % 20 < 10)) {
                            this.field199[4].method463(-40219, 13, 153);
                        }
                        if (this.field351[5] != -1 && (this.field285 != 5 || field343 % 20 < 10)) {
                            this.field199[5].method463(-40219, 11, 180);
                        }
                        if (this.field351[6] != -1 && (this.field285 != 6 || field343 % 20 < 10)) {
                            this.field199[6].method463(-40219, 13, 208);
                        }
                    }
                    this.field276.method206(516, super.field1172, 9, 160);
                    this.field275.method205(0);
                    this.field116.method463(-40219, 0, 0);
                    if (this.field221 == -1) {
                        if (this.field351[this.field529] != -1) {
                            if (this.field529 == 7) {
                                this.field465.method463(-40219, 0, 42);
                            }
                            if (this.field529 == 8) {
                                this.field466.method463(-40219, 0, 74);
                            }
                            if (this.field529 == 9) {
                                this.field466.method463(-40219, 0, 102);
                            }
                            if (this.field529 == 10) {
                                this.field467.method463(-40219, 1, 130);
                            }
                            if (this.field529 == 11) {
                                this.field469.method463(-40219, 0, 173);
                            }
                            if (this.field529 == 12) {
                                this.field469.method463(-40219, 0, 201);
                            }
                            if (this.field529 == 13) {
                                this.field468.method463(-40219, 0, 229);
                            }
                        }
                        if (this.field351[8] != -1 && (this.field285 != 8 || field343 % 20 < 10)) {
                            this.field199[7].method463(-40219, 2, 74);
                        }
                        if (this.field351[9] != -1 && (this.field285 != 9 || field343 % 20 < 10)) {
                            this.field199[8].method463(-40219, 3, 102);
                        }
                        if (this.field351[10] != -1 && (this.field285 != 10 || field343 % 20 < 10)) {
                            this.field199[9].method463(-40219, 4, 137);
                        }
                        if (this.field351[11] != -1 && (this.field285 != 11 || field343 % 20 < 10)) {
                            this.field199[10].method463(-40219, 2, 174);
                        }
                        if (this.field351[12] != -1 && (this.field285 != 12 || field343 % 20 < 10)) {
                            this.field199[11].method463(-40219, 2, 201);
                        }
                        if (this.field351[13] != -1 && (this.field285 != 13 || field343 % 20 < 10)) {
                            this.field199[12].method463(-40219, 2, 226);
                        }
                    }
                    this.field275.method206(496, super.field1172, 9, 466);
                    this.field106.method205(0);
                    class70.field1713 = this.field264;
                }
                if (this.field182) {
                    this.field182 = false;
                    this.field274.method205(0);
                    this.field115.method463(-40219, 0, 0);
                    this.field495.method503("Public chat", 16777215, 55, 1, 28, true);
                    if (this.field352 == 0) {
                        this.field495.method503("On", 65280, 55, 1, 41, true);
                    }
                    if (this.field352 == 1) {
                        this.field495.method503("Friends", 16776960, 55, 1, 41, true);
                    }
                    if (this.field352 == 2) {
                        this.field495.method503("Off", 16711680, 55, 1, 41, true);
                    }
                    if (this.field352 == 3) {
                        this.field495.method503("Hide", 65535, 55, 1, 41, true);
                    }
                    this.field495.method503("Private chat", 16777215, 184, 1, 28, true);
                    if (this.field423 == 0) {
                        this.field495.method503("On", 65280, 184, 1, 41, true);
                    }
                    if (this.field423 == 1) {
                        this.field495.method503("Friends", 16776960, 184, 1, 41, true);
                    }
                    if (this.field423 == 2) {
                        this.field495.method503("Off", 16711680, 184, 1, 41, true);
                    }
                    this.field495.method503("Trade/compete", 16777215, 324, 1, 28, true);
                    if (this.field326 == 0) {
                        this.field495.method503("On", 65280, 324, 1, 41, true);
                    }
                    if (this.field326 == 1) {
                        this.field495.method503("Friends", 16776960, 324, 1, 41, true);
                    }
                    if (this.field326 == 2) {
                        this.field495.method503("Off", 16711680, 324, 1, 41, true);
                    }
                    this.field495.method503("Report abuse", 16777215, 458, 1, 33, true);
                    this.field274.method206(0, super.field1172, 9, 453);
                    this.field106.method205(0);
                    class70.field1713 = this.field264;
                }
                this.field442 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method83(byte arg0) {
        class30 var2 = (class30) this.field539.method580();
        if (arg0 != -18) {
            this.field507 = this.field283.method245();
        }
        while (var2 != null) {
            if (var2.field994 == -1) {
                var2.field995 = 0;
                this.method162(var2, 0);
            } else {
                var2.method602();
            }
            var2 = (class30) this.field539.method582((byte) 6);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILMIIVNBFU;III)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3, int arg4, class36 arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 0) {
            this.field108 = 364;
        }
        if (this.field90) {
            this.field377 = 32;
        } else {
            this.field377 = 0;
        }
        this.field90 = false;
        if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
            arg5.field1106 -= this.field517 * 4;
            if (arg7 == 1) {
                this.field376 = true;
            }
            if (arg7 == 2 || arg7 == 3) {
                this.field80 = true;
            }
        } else if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg0 + arg2 - 16 && arg6 < arg0 + arg2) {
            arg5.field1106 += this.field517 * 4;
            if (arg7 == 1) {
                this.field376 = true;
            }
            if (arg7 == 2 || arg7 == 3) {
                this.field80 = true;
            }
        } else if (arg4 >= arg3 - this.field377 && arg4 < arg3 + 16 + this.field377 && arg6 >= arg2 + 16 && arg6 < arg0 + arg2 - 16 && this.field517 > 0) {
            int var10 = (arg0 - 32) * arg0 / arg1;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg2 - 16 - var10 / 2;
            int var12 = arg0 - 32 - var10;
            arg5.field1106 = (arg1 - arg0) * var11 / var12;
            if (arg7 == 1) {
                this.field376 = true;
            }
            if (arg7 == 2 || arg7 == 3) {
                this.field80 = true;
            }
            this.field90 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILIUVBENCV;)V")
    private final void method85(int arg0, int arg1, class25 arg2) {
        this.field72 = 0;
        if (arg1 == 36117) {
            this.field308 = 0;
            this.method89(arg2, this.field172, arg0);
            this.method128(false, arg0, arg2);
            this.method112(arg0, arg2, 0);
            for (int var4 = 0; var4 < this.field72; ++var4) {
                int var6 = this.field73[var4];
                if (field343 != this.field253[var6].field640) {
                    this.field253[var6].field1028 = null;
                    this.field253[var6] = null;
                }
            }
            if (arg2.field837 != arg0) {
                signlink.reporterror(this.field447 + " size mismatch in getnpcpos - pos:" + arg2.field837 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field254; ++var5) {
                    if (this.field253[this.field255[var5]] == null) {
                        signlink.reporterror(this.field447 + " null entry in npc list - pos:" + var5 + " size:" + this.field254);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        int var2 = this.field498 * 128 + 64;
        int var3 = this.field499 * 128 + 64;
        int var4 = this.method146(var3, this.field220, var2, (byte) -112) - this.field500;
        if (this.field126 < var2) {
            this.field126 += (var2 - this.field126) * this.field502 / 1000 + this.field501;
            if (this.field126 > var2) {
                this.field126 = var2;
            }
        }
        if (this.field126 > var2) {
            this.field126 -= (this.field126 - var2) * this.field502 / 1000 + this.field501;
            if (this.field126 < var2) {
                this.field126 = var2;
            }
        }
        if (this.field127 < var4) {
            this.field127 += (var4 - this.field127) * this.field502 / 1000 + this.field501;
            if (this.field127 > var4) {
                this.field127 = var4;
            }
        }
        if (this.field127 > var4) {
            this.field127 -= (this.field127 - var4) * this.field502 / 1000 + this.field501;
            if (this.field127 < var4) {
                this.field127 = var4;
            }
        }
        if (this.field128 < var3) {
            this.field128 += (var3 - this.field128) * this.field502 / 1000 + this.field501;
            if (this.field128 > var3) {
                this.field128 = var3;
            }
        }
        if (this.field128 > var3) {
            this.field128 -= (this.field128 - var3) * this.field502 / 1000 + this.field501;
            if (this.field128 < var3) {
                this.field128 = var3;
            }
        }
        ++field461;
        if (arg0) {
            this.field209 = this.field176.method230();
        }
        if (field461 > 131) {
            field461 = 0;
            this.field77.method234(-281, 131);
            this.field77.method235(223);
        }
        int var5 = this.field245 * 128 + 64;
        int var6 = this.field246 * 128 + 64;
        int var7 = this.method146(var6, this.field220, var5, (byte) -112) - this.field247;
        int var8 = var5 - this.field126;
        int var9 = var7 - this.field127;
        int var10 = var6 - this.field128;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field129 < var12) {
            this.field129 += (var12 - this.field129) * this.field249 / 1000 + this.field248;
            if (this.field129 > var12) {
                this.field129 = var12;
            }
        }
        if (this.field129 > var12) {
            this.field129 -= (this.field129 - var12) * this.field249 / 1000 + this.field248;
            if (this.field129 < var12) {
                this.field129 = var12;
            }
        }
        int var14 = var13 - this.field130;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field130 += this.field249 * var14 / 1000 + this.field248;
            this.field130 &= 2047;
        }
        if (var14 < 0) {
            this.field130 -= -var14 * this.field249 / 1000 + this.field248;
            this.field130 &= 2047;
        }
        int var15 = var13 - this.field130;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field130 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
    public final boolean method87(int arg0, byte arg1, int arg2) {
        boolean var4 = false;
        if (arg1 != -13) {
            this.field119 = -261;
        }
        class36 var5 = class36.method350(arg0);
        for (int var6 = 0; var6 < var5.field1119.length && var5.field1119[var6] != -1; ++var6) {
            class36 var7 = class36.method350(var5.field1119[var6]);
            if (var7.field1140 == 0) {
                var4 |= this.method87(var7.field1088, (byte) -13, arg2);
            }
            if (var7.field1140 == 6 && (var7.field1107 != -1 || var7.field1108 != -1)) {
                boolean var8 = this.method138((byte) 2, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1108;
                } else {
                    var9 = var7.field1107;
                }
                if (var9 != -1) {
                    class65 var10 = class65.field1628[var9];
                    var7.field1120 += arg2;
                    while (var7.field1120 > var10.method532(var7.field1092, (byte) 6)) {
                        var7.field1120 -= var10.method532(var7.field1092, (byte) 6);
                        ++var7.field1092;
                        if (var7.field1092 >= var10.field1629) {
                            var7.field1092 -= var10.field1633;
                            if (var7.field1092 < 0 || var7.field1092 >= var10.field1629) {
                                var7.field1092 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1140 == 6 && var7.field1093 != 0) {
                int var11 = var7.field1093 >> 16;
                int var12 = var7.field1093 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field1137 = var7.field1137 + var13 & 2047;
                var7.field1138 = var7.field1138 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILIUVBENCV;I)V")
    private final void method88(int arg0, class25 arg1, int arg2) {
        int var4 = arg1.method256(830, 8);
        if (var4 < this.field306) {
            for (int var5 = var4; var5 < this.field306; ++var5) {
                this.field73[this.field72++] = this.field307[var5];
            }
        }
        if (var4 > this.field306) {
            signlink.reporterror(this.field447 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field306 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var8 = this.field307[var6];
                class62 var9 = this.field305[var8];
                int var10 = arg1.method256(830, 1);
                if (var10 == 0) {
                    this.field307[this.field306++] = var8;
                    var9.field640 = field343;
                } else {
                    int var11 = arg1.method256(830, 2);
                    if (var11 == 0) {
                        this.field307[this.field306++] = var8;
                        var9.field640 = field343;
                        this.field309[this.field308++] = var8;
                    } else if (var11 == 1) {
                        this.field307[this.field306++] = var8;
                        var9.field640 = field343;
                        int var12 = arg1.method256(830, 3);
                        var9.method201(337, var12, false);
                        int var13 = arg1.method256(830, 1);
                        if (var13 == 1) {
                            this.field309[this.field308++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field307[this.field306++] = var8;
                        var9.field640 = field343;
                        int var14 = arg1.method256(830, 3);
                        var9.method201(337, var14, true);
                        int var15 = arg1.method256(830, 3);
                        var9.method201(337, var15, true);
                        int var16 = arg1.method256(830, 1);
                        if (var16 == 1) {
                            this.field309[this.field308++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field73[this.field72++] = var8;
                    }
                }
            }
            int var7 = 94 / arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIUVBENCV;II)V")
    private final void method89(class25 arg0, int arg1, int arg2) {
        arg0.method255((byte) 81);
        int var4 = arg0.method256(830, 8);
        if (arg1 != -46618) {
            this.field193 = null;
        }
        if (var4 < this.field254) {
            for (int var5 = var4; var5 < this.field254; ++var5) {
                this.field73[this.field72++] = this.field255[var5];
            }
        }
        if (var4 > this.field254) {
            signlink.reporterror(this.field447 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field254 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field255[var6];
                class32 var8 = this.field253[var7];
                int var9 = arg0.method256(830, 1);
                if (var9 == 0) {
                    this.field255[this.field254++] = var7;
                    var8.field640 = field343;
                } else {
                    int var10 = arg0.method256(830, 2);
                    if (var10 == 0) {
                        this.field255[this.field254++] = var7;
                        var8.field640 = field343;
                        this.field309[this.field308++] = var7;
                    } else if (var10 == 1) {
                        this.field255[this.field254++] = var7;
                        var8.field640 = field343;
                        int var11 = arg0.method256(830, 3);
                        var8.method201(337, var11, false);
                        int var12 = arg0.method256(830, 1);
                        if (var12 == 1) {
                            this.field309[this.field308++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field255[this.field254++] = var7;
                        var8.field640 = field343;
                        int var13 = arg0.method256(830, 3);
                        var8.method201(337, var13, true);
                        int var14 = arg0.method256(830, 3);
                        var8.method201(337, var14, true);
                        int var15 = arg0.method256(830, 1);
                        if (var15 == 1) {
                            this.field309[this.field308++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field73[this.field72++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method90(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method90(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Ljava/lang/String;")
    public final String method91(int arg0) {
        if (arg0 != 5) {
            this.field507 = this.field283.method245();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1175 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method92(int arg0) {
        int var2 = 56 / arg0;
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILIUVBENCV;)V")
    private final void method93(int arg0, int arg1, class25 arg2) {
        if (arg1 < 0) {
            arg2.method255((byte) 81);
            int var4 = arg2.method256(830, 1);
            if (var4 != 0) {
                int var5 = arg2.method256(830, 2);
                if (var5 == 0) {
                    this.field309[this.field308++] = this.field304;
                } else if (var5 == 1) {
                    int var6 = arg2.method256(830, 3);
                    field559.method201(337, var6, false);
                    int var7 = arg2.method256(830, 1);
                    if (var7 == 1) {
                        this.field309[this.field308++] = this.field304;
                    }
                } else if (var5 == 2) {
                    int var8 = arg2.method256(830, 3);
                    field559.method201(337, var8, true);
                    int var9 = arg2.method256(830, 3);
                    field559.method201(337, var9, true);
                    int var10 = arg2.method256(830, 1);
                    if (var10 == 1) {
                        this.field309[this.field308++] = this.field304;
                    }
                } else if (var5 == 3) {
                    this.field220 = arg2.method256(830, 2);
                    int var11 = arg2.method256(830, 7);
                    int var12 = arg2.method256(830, 7);
                    int var13 = arg2.method256(830, 1);
                    int var14 = arg2.method256(830, 1);
                    if (var14 == 1) {
                        this.field309[this.field308++] = this.field304;
                    }
                    field559.method202(var12, var11, 7, var13 == 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method94(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
            if (!this.field530 && !this.field426 && !this.field216) {
                ++field343;
                if (!this.field335) {
                    this.method63(-899);
                } else {
                    this.method127((byte) 6);
                }
                this.method59(-7744);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field353.method463(-40219, arg5, arg3);
        this.field354.method463(-40219, arg1 + arg5 - 16, arg3);
        if (arg4 <= 0) {
            this.field507 = -1;
        }
        class57.method492(16, arg5 + 16, this.field123, -60, arg1 - 32, arg3);
        int var7 = (arg1 - 32) * arg1 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg0 / (arg2 - arg1);
        class57.method492(16, arg5 + 16 + var8, this.field278, -60, var7, arg3);
        class57.method497(arg5 + 16 + var8, 0, var7, arg3, this.field428);
        class57.method497(arg5 + 16 + var8, 0, var7, arg3 + 1, this.field428);
        class57.method495(9, arg5 + 16 + var8, this.field428, arg3, 16);
        class57.method495(9, arg5 + 17 + var8, this.field428, arg3, 16);
        class57.method497(arg5 + 16 + var8, 0, var7, arg3 + 15, this.field132);
        class57.method497(arg5 + 17 + var8, 0, var7 - 1, arg3 + 14, this.field132);
        class57.method495(9, arg5 + 15 + var8 + var7, this.field132, arg3, 16);
        class57.method495(9, arg5 + 14 + var8 + var7, this.field132, arg3 + 1, 15);
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method96(int arg0) {
        if (this.field449 >= 2 || this.field297 != 0 || this.field98 != 0) {
            String var2;
            if (this.field297 == 1 && this.field449 < 2) {
                var2 = "Use " + this.field301 + " with...";
            } else if (this.field98 == 1 && this.field449 < 2) {
                var2 = this.field101 + "...";
            } else {
                var2 = this.field542[this.field449 - 1];
            }
            if (this.field449 > 2) {
                var2 = var2 + "@whi@ / " + (this.field449 - 2) + " more options";
            }
            this.field496.method511(field343 / 1000, 4, true, var2, (byte) -11, 16777215, 15);
            this.field506 += arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method97(int arg0, int arg1) {
        class69 var3 = this.field193[this.field220][arg0][arg1];
        if (var3 == null) {
            this.field277.method408(this.field220, arg0, arg1);
        } else {
            int var4 = -99999999;
            class22 var5 = null;
            for (class22 var6 = (class22) var3.method580(); var6 != null; var6 = (class22) var3.method582((byte) 6)) {
                class27 var11 = class27.method285(var6.field784);
                int var12 = var11.field862;
                if (var11.field859) {
                    var12 = (var6.field786 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method578(var5, 0);
            class22 var7 = null;
            class22 var8 = null;
            for (class22 var9 = (class22) var3.method580(); var9 != null; var9 = (class22) var3.method582((byte) 6)) {
                if (var5.field784 != var9.field784 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field784 != var9.field784 && var7.field784 != var9.field784 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field277.method394(this.method146(arg1 * 128 + 64, this.field220, arg0 * 128 + 64, (byte) -112), var8, var7, arg1, var5, this.field220, 0, var10, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method98(int arg0, int arg1) {
        int[] var3 = this.field318.field777;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field226[arg0][var24][var6] & 24) == 0) {
                    this.field277.method422(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field226[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field277.method422(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        if (arg1 != 2317) {
            this.field193 = null;
        }
        this.field318.method215(0);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field226[arg0][var22][var9] & 24) == 0) {
                    this.method53(var9, arg0, true, var22, var7, var8);
                }
                if (arg0 < 3 && (this.field226[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method53(var9, arg0 + 1, true, var22, var7, var8);
                }
            }
        }
        if (this.field106 != null) {
            this.field106.method205(0);
            class70.field1713 = this.field264;
        }
        this.field268 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field277.method416(this.field220, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class35.method341(var13).field1043;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field85[this.field220].field7;
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
                        this.field133[this.field268] = this.field558[var14];
                        this.field269[this.field268] = var15;
                        this.field270[this.field268] = var16;
                        ++this.field268;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 != 2) {
            this.field507 = -1;
        }
        if (field553 && this.field191 == 2 && class53.field1485 != this.field220) {
            this.method104("Loading - please wait.", 8389, (String) null);
            this.field191 = 1;
            this.field290 = System.currentTimeMillis();
        }
        if (this.field191 == 1) {
            int var2 = this.method100((byte) 8);
            if (var2 != 0 && System.currentTimeMillis() - this.field290 > 360000L) {
                signlink.reporterror(this.field447 + " glcfb " + this.field486 + "," + var2 + "," + field553 + "," + this.field235[0] + "," + this.field215.method29() + "," + this.field220 + "," + this.field483 + "," + this.field484);
                this.field290 = System.currentTimeMillis();
            }
        }
        if (this.field191 == 2 && this.field220 != this.field154) {
            this.field154 = this.field220;
            this.method98(this.field220, 2317);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)I")
    public final int method100(byte arg0) {
        for (int var2 = 0; var2 < this.field82.length; ++var2) {
            if (this.field82[var2] == null && this.field463[var2] != -1) {
                return -1;
            }
            if (this.field416[var2] == null && this.field464[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        if (arg0 != 8) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field82.length; ++var5) {
            byte[] var6 = this.field416[var5];
            if (var6 != null) {
                int var7 = (this.field462[var5] >> 8) * 64 - this.field205;
                int var8 = (this.field462[var5] & 255) * 64 - this.field206;
                if (this.field267) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class53.method484(var7, var6, var8, 55);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field337) {
            return -4;
        } else {
            this.field191 = 2;
            class53.field1485 = this.field220;
            this.method110(7);
            this.field77.method234(-281, 66);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method101(byte arg0) {
        if (this.field271 == arg0) {
            for (class23 var2 = (class23) this.field430.method580(); var2 != null; var2 = (class23) this.field430.method582((byte) 6)) {
                if (this.field220 == var2.field811 && field343 <= var2.field808) {
                    if (field343 >= var2.field807) {
                        if (var2.field800 > 0) {
                            class32 var3 = this.field253[var2.field800 - 1];
                            if (var3 != null && var3.field620 >= 0 && var3.field620 < 13312 && var3.field621 >= 0 && var3.field621 < 13312) {
                                var2.method228(var3.field620, this.method146(var3.field621, var2.field811, var3.field620, (byte) -112) - var2.field790, false, field343, var3.field621);
                            }
                        }
                        if (var2.field800 < 0) {
                            int var4 = -var2.field800 - 1;
                            class62 var5;
                            if (this.field350 == var4) {
                                var5 = field559;
                            } else {
                                var5 = this.field305[var4];
                            }
                            if (var5 != null && var5.field620 >= 0 && var5.field620 < 13312 && var5.field621 >= 0 && var5.field621 < 13312) {
                                var2.method228(var5.field620, this.method146(var5.field621, var2.field811, var5.field620, (byte) -112) - var2.field790, false, field343, var5.field621);
                            }
                        }
                        var2.method229(false, this.field442);
                        this.field277.method398(this.field108, 60, (int) var2.field792, this.field220, -1, (int) var2.field793, false, var2, (int) var2.field794, var2.field809);
                    }
                } else {
                    var2.method602();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method102(int arg0) {
        this.field445 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field139) {
                ++this.field482;
                this.method164(1);
                this.method164(1);
                this.method49(this.field179);
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
        this.field445 = false;
        while (arg0 >= 0) {
            this.method176();
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method103(boolean arg0) {
        try {
            if (this.field164 != null) {
                this.field164.method194();
            }
        } catch (Exception var3) {
        }
        this.field164 = null;
        this.field335 = false;
        this.field570 = 0;
        this.field447 = "";
        this.field448 = "";
        this.method108(919);
        this.field335 &= arg0;
        this.field277.method387(false);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field85[var2].method1();
        }
        System.gc();
        this.method92(79);
        this.field180 = -1;
        this.field522 = -1;
        this.field196 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method104(String arg0, int arg1, String arg2) {
        if (arg1 == 8389) {
            if (this.field106 != null) {
                this.field106.method205(0);
                class70.field1713 = this.field264;
                int var4 = 151;
                if (arg2 != null) {
                    var4 -= 7;
                }
                this.field495.method502(0, 257, arg0, 7, var4);
                this.field495.method502(16777215, 256, arg0, 7, var4 - 1);
                var4 += 15;
                if (arg2 != null) {
                    this.field495.method502(0, 257, arg2, 7, var4);
                    this.field495.method502(16777215, 256, arg2, 7, var4 - 1);
                }
                this.field106.method206(4, super.field1172, 9, 4);
            } else if (super.field1173 != null) {
                super.field1173.method205(0);
                class70.field1713 = this.field265;
                int var5 = 251;
                short var6 = 300;
                byte var7 = 50;
                class57.method492(var6, var5 - 5 - var7 / 2, 0, -60, var7, 383 - var6 / 2);
                class57.method493(16777215, var6, var7, var5 - 5 - var7 / 2, (byte) 0, 383 - var6 / 2);
                if (arg2 != null) {
                    var5 -= 7;
                }
                this.field495.method502(0, 383, arg0, 7, var5);
                this.field495.method502(16777215, 382, arg0, 7, var5 - 1);
                var5 += 15;
                if (arg2 != null) {
                    this.field495.method502(0, 383, arg2, 7, var5);
                    this.field495.method502(16777215, 382, arg2, 7, var5 - 1);
                }
                super.field1173.method206(0, super.field1172, 9, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
    public final boolean method105(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field380[arg0];
            int var4 = 29 / arg1;
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 294;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method106(int arg0) {
        this.field348 = new class52(this.field357, "titlebox", 0);
        this.field349 = new class52(this.field357, "titlebutton", 0);
        if (arg0 >= 0) {
            field181 = !field181;
        }
        this.field320 = new class52[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field320[var2] = new class52(this.field357, "runes", var2);
        }
        this.field170 = new class21(128, 265);
        this.field171 = new class21(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field170.field777[var3] = this.field410.field676[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field171.field777[var4] = this.field411.field676[var4];
        }
        this.field312 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field312[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field312[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field312[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field312[var8 + 192] = 16777215;
        }
        this.field313 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field313[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field313[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field313[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field313[var12 + 192] = 16777215;
        }
        this.field314 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field314[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field314[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field314[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field314[var16 + 192] = 16777215;
        }
        this.field311 = new int[256];
        this.field360 = new int[32768];
        this.field361 = new int[32768];
        this.method54((class52) null, (byte) 115);
        this.field259 = new int[32768];
        this.field260 = new int[32768];
        this.method125("Connecting to fileserver", 10, (byte) 6);
        if (!this.field139) {
            this.field401 = true;
            this.field139 = true;
            this.method90(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILIUVBENCV;I)V")
    private final void method107(int arg0, class25 arg1, int arg2) {
        while (true) {
            if (arg1.field838 + 10 < arg0 * 8) {
                int var4 = arg1.method256(830, 11);
                if (var4 != 2047) {
                    if (this.field305[var4] == null) {
                        this.field305[var4] = new class62();
                        if (this.field310[var4] != null) {
                            this.field305[var4].method524(false, this.field310[var4]);
                        }
                    }
                    this.field307[this.field306++] = var4;
                    class62 var5 = this.field305[var4];
                    var5.field640 = field343;
                    int var6 = arg1.method256(830, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method256(830, 1);
                    if (var7 == 1) {
                        this.field309[this.field308++] = var4;
                    }
                    int var8 = arg1.method256(830, 1);
                    int var9 = arg1.method256(830, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method202(field559.field609[0] + var6, field559.field610[0] + var9, 7, var8 == 1);
                    continue;
                }
            }
            arg1.method257(547);
            if (arg2 <= 0) {
                this.method176();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method108(int arg0) {
        class35.field1058.method440();
        int var2 = 52 / arg0;
        class35.field1057.method440();
        class39.field1238.method440();
        class27.field889.method440();
        class27.field890.method440();
        class62.field1606.method440();
        class12.field695.method440();
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (this.field546 == 0) {
            this.field542[0] = "Cancel";
            this.field380[0] = 1957;
            this.field449 = 1;
            if (this.field286 != -1) {
                this.field153 = 0;
                this.field422 = 0;
                this.method141(0, 0, 0, class36.method350(this.field286), super.field1181, 0, super.field1180, -343);
                if (this.field485 != this.field153) {
                    this.field485 = this.field153;
                }
                if (this.field422 != this.field141) {
                    this.field141 = this.field422;
                }
            } else {
                this.method189(488);
                this.field153 = 0;
                this.field422 = 0;
                if (super.field1180 > 4 && super.field1181 > 4 && super.field1180 < 516 && super.field1181 < 338) {
                    if (this.field560 != -1) {
                        this.method141(4, 0, 0, class36.method350(this.field560), super.field1181, 4, super.field1180, -343);
                    } else {
                        this.method147(this.field333);
                    }
                }
                if (this.field485 != this.field153) {
                    this.field485 = this.field153;
                }
                if (this.field422 != this.field141) {
                    this.field141 = this.field422;
                }
                this.field153 = 0;
                this.field422 = 0;
                if (arg0 != 9) {
                    this.field193 = null;
                }
                if (super.field1180 > 553 && super.field1181 > 205 && super.field1180 < 743 && super.field1181 < 466) {
                    if (this.field221 != -1) {
                        this.method141(553, 1, 0, class36.method350(this.field221), super.field1181, 205, super.field1180, -343);
                    } else if (this.field351[this.field529] != -1) {
                        this.method141(553, 1, 0, class36.method350(this.field351[this.field529]), super.field1181, 205, super.field1180, -343);
                    }
                }
                if (this.field512 != this.field153) {
                    this.field376 = true;
                    this.field512 = this.field153;
                }
                if (this.field422 != this.field136) {
                    this.field376 = true;
                    this.field136 = this.field422;
                }
                this.field153 = 0;
                this.field422 = 0;
                if (super.field1180 > 17 && super.field1181 > 357 && super.field1180 < 496 && super.field1181 < 453) {
                    if (this.field321 != -1) {
                        this.method141(17, 2, 0, class36.method350(this.field321), super.field1181, 357, super.field1180, -343);
                    } else if (this.field439 != -1) {
                        this.method141(17, 3, 0, class36.method350(this.field439), super.field1181, 357, super.field1180, -343);
                    } else if (super.field1181 < 434 && super.field1180 < 426 && this.field229 == 0) {
                        this.method121(super.field1180 - 17, super.field1181 - 357, -22);
                    }
                }
                if ((this.field321 != -1 || this.field439 != -1) && this.field541 != this.field153) {
                    this.field80 = true;
                    this.field541 = this.field153;
                }
                if ((this.field321 != -1 || this.field439 != -1) && this.field422 != this.field155) {
                    this.field80 = true;
                    this.field155 = this.field422;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field449 - 1; ++var3) {
                        if (this.field380[var3] < 1000 && this.field380[var3 + 1] > 1000) {
                            String var4 = this.field542[var3];
                            this.field542[var3] = this.field542[var3 + 1];
                            this.field542[var3 + 1] = var4;
                            int var5 = this.field380[var3];
                            this.field380[var3] = this.field380[var3 + 1];
                            this.field380[var3 + 1] = var5;
                            int var6 = this.field378[var3];
                            this.field378[var3] = this.field378[var3 + 1];
                            this.field378[var3 + 1] = var6;
                            int var7 = this.field379[var3];
                            this.field379[var3] = this.field379[var3 + 1];
                            this.field379[var3 + 1] = var7;
                            int var8 = this.field381[var3];
                            this.field381[var3] = this.field381[var3 + 1];
                            this.field381[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 376);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field550 = Integer.parseInt(arg0[0]);
                field551 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method139(6823);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method144(26784);
                }
                if (arg0[3].equals("free")) {
                    field552 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field552 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method353(field122, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method110(int arg0) {
        try {
            this.field154 = -1;
            this.field425.method584();
            this.field430.method584();
            class70.method588(-536);
            this.method108(919);
            this.field277.method387(false);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field85[var2].method1();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field226[var3][var4][var5] = 0;
                    }
                }
            }
            class53 var6 = new class53(this.field424, this.field226, 104, 104, false);
            int var7 = this.field82.length;
            this.field77.method234(-281, 32);
            if (!this.field267) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field462[var8] >> 8) * 64 - this.field205;
                    int var10 = (this.field462[var8] & 255) * 64 - this.field206;
                    byte[] var11 = this.field82[var8];
                    if (var11 != null) {
                        var6.method474(var11, var10, this.field85, (this.field484 - 6) * 8, false, (this.field483 - 6) * 8, var9);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field462[var12] >> 8) * 64 - this.field205;
                    int var14 = (this.field462[var12] & 255) * 64 - this.field206;
                    byte[] var15 = this.field82[var12];
                    if (var15 == null && this.field484 < 800) {
                        var6.method468(64, var14, 64, -46682, var13);
                    }
                }
                ++field400;
                if (field400 > 107) {
                    field400 = 0;
                    this.field77.method234(-281, 231);
                    this.field77.method238(13980530);
                }
                this.field77.method234(-281, 32);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field416[var16];
                    if (var17 != null) {
                        int var18 = (this.field462[var16] >> 8) * 64 - this.field205;
                        int var19 = (this.field462[var16] & 255) * 64 - this.field206;
                        var6.method476(var19, this.field85, this.field277, (byte) -83, var17, var18);
                    }
                }
            }
            if (this.field267) {
                int var20 = 0;
                label260: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field531[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method468(8, var32 * 8, 8, -46682, var31 * 8);
                                }
                            }
                        }
                        this.field77.method234(-281, 32);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label260;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field531[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field462.length; ++var43) {
                                            if (this.field462[var43] == var42 && this.field416[var43] != null) {
                                                var6.method473(var35 * 8, this.field416[var43], var36 * 8, (var40 & 7) * 8, var34, this.field277, (var41 & 7) * 8, var38, this.field85, var39, true);
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
                            int var24 = this.field531[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field462.length; ++var30) {
                                    if (this.field462[var30] == var29 && this.field82[var30] != null) {
                                        var6.method467(this.field85, var22 * 8, (var27 & 7) * 8, var26, var20, var25, var21 * 8, this.field82[var30], field520, (var28 & 7) * 8);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method478(var21 * 8, var22 * 8, var20, -503);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field77.method234(-281, 32);
            var6.method486(this.field85, field418, this.field277);
            if (this.field106 != null) {
                this.field106.method205(0);
                class70.field1713 = this.field264;
            }
            this.field77.method234(-281, 32);
            int var44 = class53.field1472;
            if (var44 > this.field220) {
                var44 = this.field220;
            }
            if (var44 < this.field220 - 1) {
                int var45 = this.field220 - 1;
            }
            if (field553) {
                this.field277.method388(-15551, class53.field1472);
            } else {
                this.field277.method388(-15551, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method97(var46, var47);
                }
            }
            this.method83((byte) -18);
        } catch (Exception var60) {
        }
        class35.field1058.method440();
        if (super.field1175 != null) {
            this.field77.method234(-281, 127);
            this.field77.method239(1057001181);
        }
        if (field553 && signlink.cache_dat != null) {
            int var49 = this.field215.method27(-792, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field215.method35(var50, (byte) -6);
                if ((var51 & 121) == 0) {
                    class29.method299(var50, -39421);
                }
            }
        }
        System.gc();
        class70.method589(true, 20);
        this.field215.method39(3);
        if (this.field419 == arg0) {
            int var52 = (this.field483 - 6) / 8 - 1;
            int var53 = (this.field483 + 6) / 8 + 1;
            int var54 = (this.field484 - 6) / 8 - 1;
            int var55 = (this.field484 + 6) / 8 + 1;
            if (this.field538) {
                var52 = 49;
                var53 = 50;
                var54 = 49;
                var55 = 50;
            }
            for (int var56 = var52; var56 <= var53; ++var56) {
                for (int var57 = var54; var57 <= var55; ++var57) {
                    if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                        int var58 = this.field215.method28(0, var56, var57, 1);
                        if (var58 != -1) {
                            this.field215.method26(var58, (byte) 60, 3);
                        }
                        int var59 = this.field215.method28(1, var56, var57, 1);
                        if (var59 != -1) {
                            this.field215.method26(var59, (byte) 60, 3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method111(boolean arg0, int arg1) {
        class36 var3 = class36.method350(arg1);
        for (int var4 = 0; var4 < var3.field1119.length && var3.field1119[var4] != -1; ++var4) {
            class36 var5 = class36.method350(var3.field1119[var4]);
            if (var5.field1140 == 1) {
                this.method111(false, var5.field1088);
            }
            var5.field1092 = 0;
            var5.field1120 = 0;
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ILIUVBENCV;I)V")
    private final void method112(int arg0, class25 arg1, int arg2) {
        int var10000 = arg0 + arg2;
        for (int var5 = 0; var5 < this.field308; ++var5) {
            int var6 = this.field309[var5];
            class32 var7 = this.field253[var6];
            int var8 = arg1.method245();
            if ((var8 & 8) != 0) {
                int var9 = arg1.method245();
                int var10 = arg1.method264(this.field168);
                var7.method204(field343, true, var10, var9);
                var7.field623 = field343 + 300;
                var7.field624 = arg1.method264(this.field168);
                var7.field625 = arg1.method245();
            }
            if ((var8 & 16) != 0) {
                int var11 = arg1.method271(-725);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg1.method262(317);
                if (var7.field615 == var11 && var11 != -1) {
                    int var13 = class65.field1628[var11].field1642;
                    if (var13 == 1) {
                        var7.field616 = 0;
                        var7.field617 = 0;
                        var7.field618 = var12;
                        var7.field619 = 0;
                    }
                    if (var13 == 2) {
                        var7.field619 = 0;
                    }
                } else if (var11 == -1 || var7.field615 == -1 || class65.field1628[var11].field1636 >= class65.field1628[var7.field615].field1636) {
                    var7.field615 = var11;
                    var7.field616 = 0;
                    var7.field617 = 0;
                    var7.field618 = var12;
                    var7.field619 = 0;
                    var7.field612 = var7.field595;
                }
            }
            if ((var8 & 64) != 0) {
                var7.field601 = arg1.method271(-725);
                int var14 = arg1.method278(0);
                var7.field605 = var14 >> 16;
                var7.field604 = (var14 & 65535) + field343;
                var7.field602 = 0;
                var7.field603 = 0;
                if (var7.field604 > field343) {
                    var7.field602 = -1;
                }
                if (var7.field601 == 65535) {
                    var7.field601 = -1;
                }
            }
            if ((var8 & 32) != 0) {
                var7.field593 = arg1.method247();
                var7.field594 = arg1.method247();
            }
            if ((var8 & 1) != 0) {
                var7.field606 = arg1.method252();
                var7.field631 = 100;
            }
            if ((var8 & 128) != 0) {
                var7.field1028 = class39.method363(arg1.method271(-725));
                var7.field633 = var7.field1028.field1211;
                var7.field611 = var7.field1028.field1249;
                var7.field596 = var7.field1028.field1221;
                var7.field597 = var7.field1028.field1214;
                var7.field598 = var7.field1028.field1227;
                var7.field599 = var7.field1028.field1223;
                var7.field607 = var7.field1028.field1220;
            }
            if ((var8 & 4) != 0) {
                var7.field626 = arg1.method273(this.field204);
                if (var7.field626 == 65535) {
                    var7.field626 = -1;
                }
            }
            if ((var8 & 2) != 0) {
                int var15 = arg1.method245();
                int var16 = arg1.method245();
                var7.method204(field343, true, var16, var15);
                var7.field623 = field343 + 300;
                var7.field624 = arg1.method264(this.field168);
                var7.field625 = arg1.method245();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)Z")
    public final boolean method113(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field277.method417(this.field220, arg2, arg3, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method60(arg3, 2, true, var7 + 1, field559.field609[0], 0, this.field209, var8, 0, arg2, field559.field610[0], 0);
            } else {
                class35 var9 = class35.method341(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1071;
                    var11 = var9.field1038;
                } else {
                    var10 = var9.field1038;
                    var11 = var9.field1071;
                }
                int var12 = var9.field1056;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method60(arg3, 2, true, 0, field559.field609[0], var11, this.field209, 0, var12, arg2, field559.field610[0], var10);
            }
            this.field433 = super.field1187;
            this.field434 = super.field1188;
            if (arg1) {
                this.field193 = null;
            }
            this.field436 = 2;
            this.field435 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)I")
    public final int method114(byte arg0) {
        int var2 = 3;
        if (this.field527 != arg0) {
            this.field151 = this.field176.method230();
        }
        if (this.field129 < 310) {
            int var3 = this.field126 >> 7;
            int var4 = this.field128 >> 7;
            int var5 = field559.field620 >> 7;
            int var6 = field559.field621 >> 7;
            if ((this.field226[this.field220][var3][var4] & 4) != 0) {
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
                    if ((this.field226[this.field220][var3][var4] & 4) != 0) {
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
                        if ((this.field226[this.field220][var3][var4] & 4) != 0) {
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
                    if ((this.field226[this.field220][var3][var4] & 4) != 0) {
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
                        if ((this.field226[this.field220][var3][var4] & 4) != 0) {
                            var2 = this.field220;
                        }
                    }
                }
            }
        }
        if ((this.field226[this.field220][field559.field620 >> 7][field559.field621 >> 7] & 4) != 0) {
            var2 = this.field220;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)I")
    public final int method115(byte arg0) {
        if (arg0 != 125) {
            this.field507 = -1;
        }
        int var2 = this.method146(this.field128, this.field220, this.field126, (byte) -112);
        return var2 - this.field127 < 800 && (this.field226[this.field220][this.field126 >> 7][this.field128 >> 7] & 4) != 0 ? this.field220 : 3;
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method116(int arg0) {
        if (arg0 <= 0) {
            this.field193 = null;
        }
        this.field124 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field74[var2] = -1;
            for (int var3 = 0; var3 < class63.field1612; ++var3) {
                if (!class63.field1613[var3].field1619 && class63.field1613[var3].field1614 == var2 + (this.field362 ? 0 : 7)) {
                    this.field74[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method117(byte arg0) {
        this.method126(false);
        if (arg0 != -85) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field436 == 1) {
            this.field109[this.field435 / 100].method220(-40219, this.field434 - 8 - 4, this.field433 - 8 - 4);
        }
        if (this.field436 == 2) {
            this.field109[this.field435 / 100 + 4].method220(-40219, this.field434 - 8 - 4, this.field433 - 8 - 4);
            ++field91;
            if (field91 > 1352) {
                field91 = 0;
                this.field77.method234(-281, 145);
                this.field77.method235(0);
                int var3 = this.field77.field837;
                this.field77.method236((int) (Math.random() * 65536.0D));
                this.field77.method236(19362);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method236(38938);
                }
                this.field77.method236((int) (Math.random() * 65536.0D));
                this.field77.method236((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method236(3521);
                }
                this.field77.method235((int) (Math.random() * 256.0D));
                this.field77.method235(120);
                this.field77.method236(14321);
                this.field77.method235((int) (Math.random() * 256.0D));
                this.field77.method244(0, this.field77.field837 - var3);
            }
        }
        if (this.field165 != -1) {
            this.method87(this.field165, (byte) -13, this.field442);
            this.method133(0, 0, class36.method350(this.field165), 0, 0);
        }
        if (this.field560 != -1) {
            this.method87(this.field560, (byte) -13, this.field442);
            this.method133(0, 0, class36.method350(this.field560), 0, 0);
        }
        this.method122(true);
        if (!this.field230) {
            this.method109(9);
            this.method96(0);
        } else if (this.field146 == 0) {
            this.method71(false);
        }
        if (this.field389 == 1) {
            this.field364.method220(-40219, 296, 472);
        }
        if (field134) {
            short var4 = 507;
            byte var5 = 20;
            int var6 = 16776960;
            if (super.field1168 < 30 && field553) {
                var6 = 16711680;
            }
            if (super.field1168 < 20 && !field553) {
                var6 = 16711680;
            }
            this.field495.method501(var6, "Fps:" + super.field1168, var4, var5, this.field266);
            int var16 = var5 + 15;
            Runtime var7 = Runtime.getRuntime();
            int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
            int var9 = 16776960;
            if (var8 > 33554432 && field553) {
                int var10 = 16711680;
            }
            if (var8 > 67108864 && !field553) {
                int var11 = 16711680;
            }
            this.field495.method501(16776960, "Mem:" + var8 + "k", var4, var16, this.field266);
            var16 += 15;
        }
        if (this.field113 != 0) {
            int var12 = this.field113 / 50;
            int var13 = var12 / 60;
            int var14 = var12 % 60;
            if (var14 < 10) {
                this.field495.method506(16776960, "System update in: " + var13 + ":0" + var14, 4, false, 329);
            } else {
                this.field495.method506(16776960, "System update in: " + var13 + ":" + var14, 4, false, 329);
            }
            ++field390;
            if (field390 > 1517) {
                field390 = 0;
                this.field77.method234(-281, 200);
                this.field77.method235(0);
                int var15 = this.field77.field837;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method235(174);
                }
                this.field77.method235((int) (Math.random() * 256.0D));
                this.field77.method235(151);
                this.field77.method236(48341);
                this.field77.method235((int) (Math.random() * 256.0D));
                this.field77.method235((int) (Math.random() * 256.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method236(57937);
                }
                this.field77.method236((int) (Math.random() * 65536.0D));
                this.field77.method235(188);
                this.field77.method235(175);
                this.field77.method244(0, this.field77.field837 - var15);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILDBHOKPMQ;)V")
    public final void method118(boolean arg0, int arg1, class8 arg2) {
        this.method119(arg2.field620, arg2.field621, -17285, arg1);
        if (arg0) {
            this.field77.method235(103);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public final void method119(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
            int var5 = this.method146(arg1, this.field220, arg0, (byte) -112) - arg3;
            int var6 = arg0 - this.field126;
            int var7 = var5 - this.field127;
            int var8 = arg1 - this.field128;
            int var9 = class29.field984[this.field129];
            int var10 = class29.field985[this.field129];
            int var11 = class29.field984[this.field130];
            int var12 = class29.field985[this.field130];
            if (arg2 == -17285) {
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field293 = (var13 << 9) / var17 + class70.field1707;
                    this.field294 = (var16 << 9) / var17 + class70.field1708;
                } else {
                    this.field293 = -1;
                    this.field294 = -1;
                }
            }
        } else {
            this.field293 = -1;
            this.field294 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IZIILjava/lang/String;)LAWEEREDT;")
    public final class2 method120(String arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field235[0] != null) {
                var7 = this.field235[0].method15(arg4, (byte) 1);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field493.reset();
            this.field493.update(var7);
            int var9 = (int) this.field493.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class2(779, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method125("Requesting " + arg5, arg3, (byte) 6);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method166(arg0 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class25 var17 = new class25(var16, 713);
                    var17.field837 = 3;
                    int var18 = var17.method249() + 6;
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
                            this.method125("Loading " + arg5 + " - " + var23 + "%", arg3, (byte) 6);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field235[0] != null) {
                            this.field235[0].method16(var7, arg4, 6, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field235[0] = null;
                    }
                    if (var7 != null) {
                        this.field493.reset();
                        this.field493.update(var7);
                        int var24 = (int) this.field493.getValue();
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
                            this.method125("Game updated - please reload page", arg3, (byte) 6);
                            var26 = 10;
                        } else {
                            this.method125(var12 + " - Retrying in " + var26, arg3, (byte) 6);
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
                    this.field437 = !this.field437;
                }
            }
            class2 var27 = new class2(779, var7);
            this.field335 &= arg2;
            return var27;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
    public final void method121(int arg0, int arg1, int arg2) {
        int var4 = 0;
        if (arg2 < 0) {
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field394[var5] != null) {
                    int var6 = this.field392[var5];
                    int var7 = 70 - var4 * 14 + this.field189 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field393[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field352 == 0 || this.field352 == 1 && this.method180(var8, false))) {
                        if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field559.field1594)) {
                            if (this.field236 >= 1) {
                                this.field542[this.field449] = "Report abuse @whi@" + var8;
                                this.field380[this.field449] = 702;
                                ++this.field449;
                            }
                            this.field542[this.field449] = "Add ignore @whi@" + var8;
                            this.field380[this.field449] = 38;
                            ++this.field449;
                            this.field542[this.field449] = "Add friend @whi@" + var8;
                            this.field380[this.field449] = 294;
                            ++this.field449;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field88 == 0 && (var6 == 7 || this.field423 == 0 || this.field423 == 1 && this.method180(var8, false))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            if (this.field236 >= 1) {
                                this.field542[this.field449] = "Report abuse @whi@" + var8;
                                this.field380[this.field449] = 702;
                                ++this.field449;
                            }
                            this.field542[this.field449] = "Add ignore @whi@" + var8;
                            this.field380[this.field449] = 38;
                            ++this.field449;
                            this.field542[this.field449] = "Add friend @whi@" + var8;
                            this.field380[this.field449] = 294;
                            ++this.field449;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field326 == 0 || this.field326 == 1 && this.method180(var8, false))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            this.field542[this.field449] = "Accept trade @whi@" + var8;
                            this.field380[this.field449] = 899;
                            ++this.field449;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field88 == 0 && this.field423 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field326 == 0 || this.field326 == 1 && this.method180(var8, false))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            this.field542[this.field449] = "Accept challenge @whi@" + var8;
                            this.field380[this.field449] = 108;
                            ++this.field449;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method122(boolean arg0) {
        this.field504 = 0;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = (field559.field620 >> 7) + this.field205;
        int var4 = (field559.field621 >> 7) + this.field206;
        if (var3 >= 3053 && var3 <= 3156 && var4 >= 3056 && var4 <= 3136) {
            this.field504 = 1;
        }
        if (var3 >= 3072 && var3 <= 3118 && var4 >= 9492 && var4 <= 9535) {
            this.field504 = 1;
        }
        if (this.field504 == 1 && var3 >= 3139 && var3 <= 3199 && var4 >= 3008 && var4 <= 3062) {
            this.field504 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
    public final void method123(byte arg0, int arg1) {
        if (arg0 != -95) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1 >= 0) {
            int var4 = this.field378[arg1];
            int var5 = this.field379[arg1];
            int var6 = this.field380[arg1];
            int var7 = this.field381[arg1];
            if (var6 >= 2000) {
                var6 -= 2000;
            }
            if (this.field229 != 0 && var6 != 1957) {
                this.field229 = 0;
                this.field80 = true;
            }
            if (var6 == 618) {
                class62 var8 = this.field305[var7];
                if (var8 != null) {
                    this.method60(var8.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var8.field609[0], field559.field610[0], 1);
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 2;
                    this.field435 = 0;
                    this.field77.method234(-281, 136);
                    this.field77.method268(false, var7);
                    this.field77.method236(this.field99);
                }
            }
            if (var6 == 584 && this.method113(var7, false, var4, var5)) {
                this.field77.method234(-281, 86);
                this.field77.method270(var7 >> 14 & 32767, this.field151);
                this.field77.method236(this.field206 + var5);
                this.field77.method268(false, this.field205 + var4);
                this.field77.method269(-65, this.field99);
            }
            if (var6 == 450) {
                boolean var9 = this.method60(var5, 2, false, 0, field559.field609[0], 0, this.field209, 0, 0, var4, field559.field610[0], 0);
                if (!var9) {
                    this.method60(var5, 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var4, field559.field610[0], 1);
                }
                this.field433 = super.field1187;
                this.field434 = super.field1188;
                this.field436 = 2;
                this.field435 = 0;
                this.field77.method234(-281, 201);
                this.field77.method269(-65, this.field205 + var4);
                this.field77.method269(-65, this.field300);
                this.field77.method269(-65, this.field298);
                this.field77.method236(var7);
                this.field77.method270(this.field299, this.field151);
                this.field77.method269(-65, this.field206 + var5);
            }
            if (var6 == 899 || var6 == 108) {
                String var11 = this.field542[arg1];
                int var12 = var11.indexOf("@whi@");
                if (var12 != -1) {
                    String var13 = var11.substring(var12 + 5).trim();
                    String var14 = class50.method456(839, class50.method453((byte) 3, class50.method452(var13)));
                    boolean var15 = false;
                    for (int var16 = 0; var16 < this.field306; ++var16) {
                        class62 var17 = this.field305[this.field307[var16]];
                        if (var17 != null && var17.field1594 != null && var17.field1594.equalsIgnoreCase(var14)) {
                            this.method60(var17.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var17.field609[0], field559.field610[0], 1);
                            if (var6 == 899) {
                                this.field77.method234(-281, 132);
                                this.field77.method269(-65, this.field307[var16]);
                            }
                            if (var6 == 108) {
                                field187 += var7;
                                if (field187 >= 71) {
                                    this.field77.method234(-281, 149);
                                    this.field77.method236(42042);
                                    field187 = 0;
                                }
                                this.field77.method234(-281, 206);
                                this.field77.method236(this.field307[var16]);
                            }
                            var15 = true;
                            break;
                        }
                    }
                    if (!var15) {
                        this.method160(-232, 0, "Unable to find " + var14, "");
                    }
                }
            }
            if (var6 == 321) {
                boolean var18 = this.method60(var5, 2, false, 0, field559.field609[0], 0, this.field209, 0, 0, var4, field559.field610[0], 0);
                if (!var18) {
                    this.method60(var5, 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var4, field559.field610[0], 1);
                }
                this.field433 = super.field1187;
                this.field434 = super.field1188;
                this.field436 = 2;
                this.field435 = 0;
                this.field77.method234(-281, 154);
                this.field77.method236(this.field206 + var5);
                this.field77.method269(-65, var7);
                this.field77.method269(-65, this.field205 + var4);
            }
            if (var6 == 898) {
                this.field77.method234(-281, 94);
                this.field77.method270(var7, this.field151);
                this.field77.method270(var4, this.field151);
                this.field77.method268(false, var5);
                this.field475 = 0;
                this.field476 = var5;
                this.field477 = var4;
                this.field478 = 2;
                if (class36.method350(var5).field1117 == this.field560) {
                    this.field478 = 1;
                }
                if (class36.method350(var5).field1117 == this.field321) {
                    this.field478 = 3;
                }
            }
            if (var6 == 665) {
                class62 var20 = this.field305[var7];
                if (var20 != null) {
                    this.method60(var20.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var20.field609[0], field559.field610[0], 1);
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 2;
                    this.field435 = 0;
                    field187 += var7;
                    if (field187 >= 71) {
                        this.field77.method234(-281, 149);
                        this.field77.method236(42042);
                        field187 = 0;
                    }
                    this.field77.method234(-281, 206);
                    this.field77.method236(var7);
                }
            }
            if (var6 == 386) {
                this.method113(var7, false, var4, var5);
                this.field77.method234(-281, 229);
                this.field77.method269(-65, this.field205 + var4);
                this.field77.method269(-65, this.field206 + var5);
                this.field77.method269(-65, var7 >> 14 & 32767);
            }
            if (var6 == 845) {
                class32 var21 = this.field253[var7];
                if (var21 != null) {
                    this.method60(var21.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var21.field609[0], field559.field610[0], 1);
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 2;
                    this.field435 = 0;
                    this.field77.method234(-281, 155);
                    this.field77.method269(-65, var7);
                }
            }
            if (var6 == 42) {
                class62 var22 = this.field305[var7];
                if (var22 != null) {
                    this.method60(var22.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var22.field609[0], field559.field610[0], 1);
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 2;
                    this.field435 = 0;
                    this.field77.method234(-281, 198);
                    this.field77.method268(false, var7);
                }
            }
            if (var6 == 294 || var6 == 38 || var6 == 140 || var6 == 169) {
                String var23 = this.field542[arg1];
                int var24 = var23.indexOf("@whi@");
                if (var24 != -1) {
                    long var25 = class50.method452(var23.substring(var24 + 5).trim());
                    if (var6 == 294) {
                        this.method129(-633, var25);
                    }
                    if (var6 == 38) {
                        this.method51(var25, 0);
                    }
                    if (var6 == 140) {
                        this.method157(var25, 6362);
                    }
                    if (var6 == 169) {
                        this.method150(var25, 0);
                    }
                }
            }
            if (var6 == 871) {
                this.field77.method234(-281, 2);
                this.field77.method236(var5);
                class36 var27 = class36.method350(var5);
                if (var27.field1134 != null && var27.field1134[0][0] == 5) {
                    int var28 = var27.field1134[0][1];
                    if (this.field167[var28] != var27.field1152[0]) {
                        this.field167[var28] = var27.field1152[0];
                        this.method52(7, var28);
                        this.field376 = true;
                    }
                }
            }
            if (var6 == 524) {
                boolean var29 = this.method60(var5, 2, false, 0, field559.field609[0], 0, this.field209, 0, 0, var4, field559.field610[0], 0);
                if (!var29) {
                    this.method60(var5, 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var4, field559.field610[0], 1);
                }
                this.field433 = super.field1187;
                this.field434 = super.field1188;
                this.field436 = 2;
                this.field435 = 0;
                this.field77.method234(-281, 33);
                this.field77.method236(this.field205 + var4);
                this.field77.method269(-65, var7);
                this.field77.method269(-65, this.field99);
                this.field77.method270(this.field206 + var5, this.field151);
            }
            if (var6 == 788) {
                String var31 = this.field542[arg1];
                int var32 = var31.indexOf("@whi@");
                if (var32 != -1) {
                    long var33 = class50.method452(var31.substring(var32 + 5).trim());
                    int var35 = -1;
                    for (int var36 = 0; var36 < this.field566; ++var36) {
                        if (this.field232[var36] == var33) {
                            var35 = var36;
                            break;
                        }
                    }
                    if (var35 != -1 && this.field441[var35] > 0) {
                        this.field80 = true;
                        this.field229 = 0;
                        this.field161 = true;
                        this.field492 = "";
                        this.field302 = 3;
                        this.field336 = this.field232[var35];
                        this.field438 = "Enter message to send to " + this.field228[var35];
                    }
                }
            }
            if (var6 == 339) {
                class32 var37 = this.field253[var7];
                if (var37 != null) {
                    this.method60(var37.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var37.field609[0], field559.field610[0], 1);
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 2;
                    this.field435 = 0;
                    this.field77.method234(-281, 243);
                    this.field77.method268(false, var7);
                }
            }
            if (var6 == 851) {
                class32 var38 = this.field253[var7];
                if (var38 != null) {
                    this.method60(var38.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var38.field609[0], field559.field610[0], 1);
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 2;
                    this.field435 = 0;
                    this.field77.method234(-281, 178);
                    this.field77.method270(var7, this.field151);
                }
            }
            if (var6 == 409) {
                boolean var39 = this.method60(var5, 2, false, 0, field559.field609[0], 0, this.field209, 0, 0, var4, field559.field610[0], 0);
                if (!var39) {
                    this.method60(var5, 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var4, field559.field610[0], 1);
                }
                this.field433 = super.field1187;
                this.field434 = super.field1188;
                this.field436 = 2;
                this.field435 = 0;
                this.field77.method234(-281, 93);
                this.field77.method268(false, this.field205 + var4);
                this.field77.method236(this.field206 + var5);
                this.field77.method236(var7);
            }
            if (var6 == 967 && !this.field273) {
                this.field77.method234(-281, 115);
                this.field77.method236(var5);
                this.field273 = true;
            }
            if (var6 == 586) {
                this.field77.method234(-281, 211);
                this.field77.method270(var4, this.field151);
                this.field77.method236(var5);
                this.field77.method270(this.field299, this.field151);
                this.field77.method236(this.field298);
                this.field77.method270(this.field300, this.field151);
                this.field77.method268(false, var7);
                this.field475 = 0;
                this.field476 = var5;
                this.field477 = var4;
                this.field478 = 2;
                if (class36.method350(var5).field1117 == this.field560) {
                    this.field478 = 1;
                }
                if (class36.method350(var5).field1117 == this.field321) {
                    this.field478 = 3;
                }
            }
            if (var6 == 794) {
                boolean var41 = this.method60(var5, 2, false, 0, field559.field609[0], 0, this.field209, 0, 0, var4, field559.field610[0], 0);
                if (!var41) {
                    this.method60(var5, 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var4, field559.field610[0], 1);
                }
                this.field433 = super.field1187;
                this.field434 = super.field1188;
                this.field436 = 2;
                this.field435 = 0;
                this.field77.method234(-281, 223);
                this.field77.method236(var7);
                this.field77.method236(this.field205 + var4);
                this.field77.method268(false, this.field206 + var5);
            }
            if (var6 == 36) {
                class32 var43 = this.field253[var7];
                if (var43 != null) {
                    this.method60(var43.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var43.field609[0], field559.field610[0], 1);
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 2;
                    this.field435 = 0;
                    if ((var7 & 3) == 0) {
                        ++field227;
                    }
                    if (field227 >= 103) {
                        this.field77.method234(-281, 74);
                        this.field77.method238(4286979);
                        field227 = 0;
                    }
                    this.field77.method234(-281, 169);
                    this.field77.method268(false, var7);
                }
            }
            if (var6 == 877) {
                this.method131(35004);
            }
            if (var6 == 139) {
                this.field77.method234(-281, 180);
                this.field77.method236(var5);
                this.field77.method270(var4, this.field151);
                this.field77.method236(var7);
                this.field475 = 0;
                this.field476 = var5;
                this.field477 = var4;
                this.field478 = 2;
                if (class36.method350(var5).field1117 == this.field560) {
                    this.field478 = 1;
                }
                if (class36.method350(var5).field1117 == this.field321) {
                    this.field478 = 3;
                }
            }
            if (var6 == 1433) {
                class32 var44 = this.field253[var7];
                if (var44 != null) {
                    class39 var45 = var44.field1028;
                    if (var45.field1231 != null) {
                        var45 = var45.method362(4);
                    }
                    if (var45 != null) {
                        String var46;
                        if (var45.field1247 != null) {
                            var46 = new String(var45.field1247);
                        } else {
                            var46 = "It's a " + var45.field1215 + ".";
                        }
                        this.method160(-232, 0, var46, "");
                    }
                }
            }
            if (var6 == 1065) {
                class27 var47 = class27.method285(var7);
                String var48;
                if (var47.field857 != null) {
                    var48 = new String(var47.field857);
                } else {
                    var48 = "It's a " + var47.field894 + ".";
                }
                this.method160(-232, 0, var48, "");
            }
            if (var6 == 154) {
                class32 var49 = this.field253[var7];
                if (var49 != null) {
                    this.method60(var49.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var49.field609[0], field559.field610[0], 1);
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 2;
                    this.field435 = 0;
                    this.field77.method234(-281, 51);
                    this.field77.method236(var7);
                    this.field77.method269(-65, this.field99);
                }
            }
            if (var6 == 263) {
                this.field77.method234(-281, 101);
                this.field77.method269(-65, var4);
                this.field77.method270(var7, this.field151);
                this.field77.method268(false, var5);
                this.field475 = 0;
                this.field476 = var5;
                this.field477 = var4;
                this.field478 = 2;
                if (class36.method350(var5).field1117 == this.field560) {
                    this.field478 = 1;
                }
                if (class36.method350(var5).field1117 == this.field321) {
                    this.field478 = 3;
                }
            }
            if (var6 == 638) {
                this.method113(var7, false, var4, var5);
                this.field77.method234(-281, 49);
                this.field77.method268(false, this.field205 + var4);
                this.field77.method270(this.field206 + var5, this.field151);
                this.field77.method236(var7 >> 14 & 32767);
            }
            if (var6 == 26) {
                this.field297 = 1;
                this.field298 = var4;
                this.field299 = var5;
                this.field300 = var7;
                this.field301 = String.valueOf(class27.method285(var7).field894);
                this.field98 = 0;
                this.field376 = true;
            } else {
                if (var6 == 561) {
                    class32 var50 = this.field253[var7];
                    if (var50 != null) {
                        this.method60(var50.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var50.field609[0], field559.field610[0], 1);
                        this.field433 = super.field1187;
                        this.field434 = super.field1188;
                        this.field436 = 2;
                        this.field435 = 0;
                        this.field77.method234(-281, 52);
                        this.field77.method269(-65, this.field299);
                        this.field77.method270(var7, this.field151);
                        this.field77.method236(this.field298);
                        this.field77.method236(this.field300);
                    }
                }
                if (var6 == 859) {
                    class32 var51 = this.field253[var7];
                    if (var51 != null) {
                        this.method60(var51.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var51.field609[0], field559.field610[0], 1);
                        this.field433 = super.field1187;
                        this.field434 = super.field1188;
                        this.field436 = 2;
                        this.field435 = 0;
                        this.field77.method234(-281, 250);
                        this.field77.method268(false, var7);
                    }
                }
                if (var6 == 634) {
                    class62 var52 = this.field305[var7];
                    if (var52 != null) {
                        this.method60(var52.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var52.field609[0], field559.field610[0], 1);
                        this.field433 = super.field1187;
                        this.field434 = super.field1188;
                        this.field436 = 2;
                        this.field435 = 0;
                        this.field77.method234(-281, 28);
                        this.field77.method236(var7);
                    }
                }
                if (var6 == 663) {
                    class62 var53 = this.field305[var7];
                    if (var53 != null) {
                        this.method60(var53.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var53.field609[0], field559.field610[0], 1);
                        this.field433 = super.field1187;
                        this.field434 = super.field1188;
                        this.field436 = 2;
                        this.field435 = 0;
                        this.field77.method234(-281, 132);
                        this.field77.method269(-65, var7);
                    }
                }
                if (var6 == 463) {
                    this.method113(var7, false, var4, var5);
                    this.field77.method234(-281, 105);
                    this.field77.method269(-65, this.field206 + var5);
                    this.field77.method269(-65, this.field205 + var4);
                    this.field77.method236(var7 >> 14 & 32767);
                }
                if (var6 == 702) {
                    String var54 = this.field542[arg1];
                    int var55 = var54.indexOf("@whi@");
                    if (var55 != -1) {
                        if (this.field560 == -1) {
                            this.method131(35004);
                            this.field359 = var54.substring(var55 + 5).trim();
                            this.field479 = false;
                            this.field332 = this.field560 = class36.field1123;
                        } else {
                            this.method160(-232, 0, "Please close the interface you have open before using 'report abuse'", "");
                        }
                    }
                }
                if (var6 == 178) {
                    ++field131;
                    if (field131 >= 78) {
                        this.field77.method234(-281, 161);
                        this.field77.method239(0);
                        field131 = 0;
                    }
                    this.method113(var7, false, var4, var5);
                    this.field77.method234(-281, 254);
                    this.field77.method268(false, var7 >> 14 & 32767);
                    this.field77.method270(this.field205 + var4, this.field151);
                    this.field77.method268(false, this.field206 + var5);
                }
                if (var6 == 358) {
                    class36 var56 = class36.method350(var5);
                    this.field98 = 1;
                    this.field99 = var5;
                    this.field100 = var56.field1105;
                    this.field297 = 0;
                    this.field376 = true;
                    String var57 = var56.field1096;
                    if (var57.indexOf(" ") != -1) {
                        var57 = var57.substring(0, var57.indexOf(" "));
                    }
                    String var58 = var56.field1096;
                    if (var58.indexOf(" ") != -1) {
                        var58 = var58.substring(var58.indexOf(" ") + 1);
                    }
                    this.field101 = var57 + " " + var56.field1147 + " " + var58;
                    if (this.field100 == 16) {
                        this.field376 = true;
                        this.field529 = 3;
                        this.field120 = true;
                    }
                } else {
                    if (var6 == 426) {
                        ++field526;
                        if (field526 >= 56) {
                            this.field77.method234(-281, 202);
                            this.field77.method238(10272641);
                            field526 = 0;
                        }
                        this.field77.method234(-281, 177);
                        this.field77.method269(-65, var7);
                        this.field77.method268(false, var4);
                        this.field77.method270(var5, this.field151);
                        this.field475 = 0;
                        this.field476 = var5;
                        this.field477 = var4;
                        this.field478 = 2;
                        if (class36.method350(var5).field1117 == this.field560) {
                            this.field478 = 1;
                        }
                        if (class36.method350(var5).field1117 == this.field321) {
                            this.field478 = 3;
                        }
                    }
                    if (var6 == 931) {
                        this.field77.method234(-281, 14);
                        this.field77.method268(false, this.field99);
                        this.field77.method270(var5, this.field151);
                        this.field77.method270(var4, this.field151);
                        this.field77.method269(-65, var7);
                        this.field475 = 0;
                        this.field476 = var5;
                        this.field477 = var4;
                        this.field478 = 2;
                        if (class36.method350(var5).field1117 == this.field560) {
                            this.field478 = 1;
                        }
                        if (class36.method350(var5).field1117 == this.field321) {
                            this.field478 = 3;
                        }
                    }
                    if (var6 == 245) {
                        this.field77.method234(-281, 23);
                        this.field77.method269(-65, var5);
                        this.field77.method268(false, var7);
                        this.field77.method269(-65, var4);
                        this.field475 = 0;
                        this.field476 = var5;
                        this.field477 = var4;
                        this.field478 = 2;
                        if (class36.method350(var5).field1117 == this.field560) {
                            this.field478 = 1;
                        }
                        if (class36.method350(var5).field1117 == this.field321) {
                            this.field478 = 3;
                        }
                    }
                    if (var6 == 819) {
                        this.method70(field84, this.field439);
                        this.field439 = -1;
                        this.field80 = true;
                    }
                    if (var6 == 331) {
                        ++field86;
                        if (field86 >= 148) {
                            this.field77.method234(-281, 108);
                            this.field77.method236(64453);
                            field86 = 0;
                        }
                        this.field77.method234(-281, 190);
                        this.field77.method269(-65, var4);
                        this.field77.method270(var5, this.field151);
                        this.field77.method270(var7, this.field151);
                        this.field475 = 0;
                        this.field476 = var5;
                        this.field477 = var4;
                        this.field478 = 2;
                        if (class36.method350(var5).field1117 == this.field560) {
                            this.field478 = 1;
                        }
                        if (class36.method350(var5).field1117 == this.field321) {
                            this.field478 = 3;
                        }
                    }
                    if (var6 == 66) {
                        if (!this.field230) {
                            this.field277.method425(super.field1187 - 4, super.field1188 - 4, (byte) 9);
                        } else {
                            this.field277.method425(var4 - 4, var5 - 4, (byte) 9);
                        }
                    }
                    if (var6 == 80) {
                        this.field77.method234(-281, 46);
                        this.field77.method270(var7, this.field151);
                        this.field77.method236(var4);
                        this.field77.method269(-65, var5);
                        this.field475 = 0;
                        this.field476 = var5;
                        this.field477 = var4;
                        this.field478 = 2;
                        if (class36.method350(var5).field1117 == this.field560) {
                            this.field478 = 1;
                        }
                        if (class36.method350(var5).field1117 == this.field321) {
                            this.field478 = 3;
                        }
                    }
                    if (var6 == 124 && this.method113(var7, false, var4, var5)) {
                        this.field77.method234(-281, 4);
                        this.field77.method270(this.field298, this.field151);
                        this.field77.method269(-65, this.field206 + var5);
                        this.field77.method268(false, this.field300);
                        this.field77.method268(false, var7 >> 14 & 32767);
                        this.field77.method269(-65, this.field299);
                        this.field77.method270(this.field205 + var4, this.field151);
                    }
                    if (var6 == 766) {
                        class62 var59 = this.field305[var7];
                        if (var59 != null) {
                            this.method60(var59.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var59.field609[0], field559.field610[0], 1);
                            this.field433 = super.field1187;
                            this.field434 = super.field1188;
                            this.field436 = 2;
                            this.field435 = 0;
                            this.field77.method234(-281, 123);
                            this.field77.method270(this.field299, this.field151);
                            this.field77.method270(this.field300, this.field151);
                            this.field77.method269(-65, this.field298);
                            this.field77.method269(-65, var7);
                        }
                    }
                    if (var6 == 213) {
                        field225 += var5;
                        if (field225 >= 146) {
                            this.field77.method234(-281, 208);
                            this.field77.method238(7403351);
                            field225 = 0;
                        }
                        this.field77.method234(-281, 150);
                        this.field77.method268(false, var4);
                        this.field77.method270(var5, this.field151);
                        this.field77.method268(false, var7);
                        this.field475 = 0;
                        this.field476 = var5;
                        this.field477 = var4;
                        this.field478 = 2;
                        if (class36.method350(var5).field1117 == this.field560) {
                            this.field478 = 1;
                        }
                        if (class36.method350(var5).field1117 == this.field321) {
                            this.field478 = 3;
                        }
                    }
                    if (var6 == 890) {
                        this.field77.method234(-281, 87);
                        this.field77.method270(var7, this.field151);
                        this.field77.method236(var5);
                        this.field77.method268(false, var4);
                        this.field475 = 0;
                        this.field476 = var5;
                        this.field477 = var4;
                        this.field478 = 2;
                        if (class36.method350(var5).field1117 == this.field560) {
                            this.field478 = 1;
                        }
                        if (class36.method350(var5).field1117 == this.field321) {
                            this.field478 = 3;
                        }
                    }
                    if (var6 == 797) {
                        this.field77.method234(-281, 242);
                        this.field77.method236(var5);
                        this.field77.method270(var4, this.field151);
                        this.field77.method236(var7);
                        this.field475 = 0;
                        this.field476 = var5;
                        this.field477 = var4;
                        this.field478 = 2;
                        if (class36.method350(var5).field1117 == this.field560) {
                            this.field478 = 1;
                        }
                        if (class36.method350(var5).field1117 == this.field321) {
                            this.field478 = 3;
                        }
                    }
                    if (var6 == 1901) {
                        this.method113(var7, false, var4, var5);
                        this.field77.method234(-281, 237);
                        this.field77.method236(this.field206 + var5);
                        this.field77.method269(-65, var7 >> 14 & 32767);
                        this.field77.method268(false, this.field205 + var4);
                    }
                    if (var6 == 776) {
                        this.field77.method234(-281, 2);
                        this.field77.method236(var5);
                        class36 var60 = class36.method350(var5);
                        if (var60.field1134 != null && var60.field1134[0][0] == 5) {
                            int var61 = var60.field1134[0][1];
                            this.field167[var61] = 1 - this.field167[var61];
                            this.method52(7, var61);
                            this.field376 = true;
                        }
                    }
                    if (var6 == 315) {
                        class36 var62 = class36.method350(var5);
                        boolean var63 = true;
                        if (var62.field1146 > 0) {
                            var63 = this.method182((byte) 56, var62);
                        }
                        if (var63) {
                            this.field77.method234(-281, 2);
                            this.field77.method236(var5);
                        }
                    }
                    if (var6 == 54) {
                        boolean var64 = this.method60(var5, 2, false, 0, field559.field609[0], 0, this.field209, 0, 0, var4, field559.field610[0], 0);
                        if (!var64) {
                            this.method60(var5, 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var4, field559.field610[0], 1);
                        }
                        this.field433 = super.field1187;
                        this.field434 = super.field1188;
                        this.field436 = 2;
                        this.field435 = 0;
                        this.field77.method234(-281, 184);
                        this.field77.method268(false, this.field205 + var4);
                        this.field77.method270(var7, this.field151);
                        this.field77.method268(false, this.field206 + var5);
                    }
                    if (var6 == 1881) {
                        int var66 = var7 >> 14 & 32767;
                        class35 var67 = class35.method341(var66);
                        String var68;
                        if (var67.field1045 != null) {
                            var68 = new String(var67.field1045);
                        } else {
                            var68 = "It's a " + var67.field1068 + ".";
                        }
                        this.method160(-232, 0, var68, "");
                    }
                    if (var6 == 1164) {
                        class27 var69 = class27.method285(var7);
                        class36 var70 = class36.method350(var5);
                        String var71;
                        if (var70 != null && var70.field1116[var4] >= 100000) {
                            var71 = var70.field1116[var4] + " x " + var69.field894;
                        } else if (var69.field857 != null) {
                            var71 = new String(var69.field857);
                        } else {
                            var71 = "It's a " + var69.field894 + ".";
                        }
                        this.method160(-232, 0, var71, "");
                    }
                    if (var6 == 738) {
                        boolean var72 = this.method60(var5, 2, false, 0, field559.field609[0], 0, this.field209, 0, 0, var4, field559.field610[0], 0);
                        if (!var72) {
                            this.method60(var5, 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var4, field559.field610[0], 1);
                        }
                        this.field433 = super.field1187;
                        this.field434 = super.field1188;
                        this.field436 = 2;
                        this.field435 = 0;
                        field516 += var7;
                        if (field516 >= 111) {
                            this.field77.method234(-281, 173);
                            this.field77.method238(10397469);
                            field516 = 0;
                        }
                        this.field77.method234(-281, 164);
                        this.field77.method236(var7);
                        this.field77.method269(-65, this.field206 + var5);
                        this.field77.method268(false, this.field205 + var4);
                    }
                    if (var6 == 429) {
                        class62 var74 = this.field305[var7];
                        if (var74 != null) {
                            this.method60(var74.field610[0], 2, false, 0, field559.field609[0], 1, this.field209, 0, 0, var74.field609[0], field559.field610[0], 1);
                            this.field433 = super.field1187;
                            this.field434 = super.field1188;
                            this.field436 = 2;
                            this.field435 = 0;
                            this.field77.method234(-281, 39);
                            this.field77.method269(-65, var7);
                        }
                    }
                    this.field297 = 0;
                    this.field98 = 0;
                    this.field376 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field139 = false;
        while (this.field445) {
            this.field139 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field348 = null;
        this.field349 = null;
        this.field320 = null;
        this.field311 = null;
        this.field312 = null;
        this.field313 = null;
        this.field314 = null;
        this.field360 = null;
        this.field361 = null;
        this.field259 = null;
        this.field260 = null;
        if (arg0 != 0) {
            field402 = 241;
        }
        this.field170 = null;
        this.field171 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public final void method125(String arg0, int arg1, byte arg2) {
        this.field345 = arg1;
        this.field231 = arg0;
        this.method62((byte) 4);
        if (this.field357 == null) {
            super.method125(arg0, arg1, (byte) 6);
        } else {
            this.field409.method205(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field496.method502(16777215, var4 / 2, "RuneScape is loading - please wait...", 7, var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            class57.method493(9179409, 304, 34, var7, (byte) 0, var4 / 2 - 152);
            class57.method493(0, 302, 32, var7 + 1, (byte) 0, var4 / 2 - 151);
            class57.method492(arg1 * 3, var7 + 2, 9179409, -60, 30, var4 / 2 - 150);
            class57.method492(300 - arg1 * 3, var7 + 2, 0, -60, 30, arg1 * 3 + (var4 / 2 - 150));
            if (arg2 == 6) {
                boolean var8 = false;
            }
            this.field496.method502(16777215, var4 / 2, arg0, 7, var5 / 2 + 5 - var6);
            this.field409.method206(202, super.field1172, 9, 171);
            if (this.field396) {
                this.field396 = false;
                if (!this.field139) {
                    this.field410.method206(0, super.field1172, 9, 0);
                    this.field411.method206(637, super.field1172, 9, 0);
                }
                this.field407.method206(128, super.field1172, 9, 0);
                this.field408.method206(202, super.field1172, 9, 371);
                this.field412.method206(0, super.field1172, 9, 265);
                this.field413.method206(562, super.field1172, 9, 265);
                this.field414.method206(128, super.field1172, 9, 171);
                this.field415.method206(562, super.field1172, 9, 171);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method126(boolean arg0) {
        if (this.field88 != 0) {
            class60 var2 = this.field495;
            int var3 = 0;
            if (arg0) {
                this.field507 = this.field283.method245();
            }
            if (this.field113 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field394[var4] != null) {
                    int var5 = this.field392[var4];
                    String var6 = this.field393[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field423 == 0 || this.field423 == 1 && this.method180(var6, false))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method506(0, "From", var9, false, var8);
                        var2.method506(65535, "From", var9, false, var8 - 1);
                        int var10 = var9 + var2.method504("From ", -665);
                        if (var7 == 1) {
                            this.field347[0].method463(-40219, var8 - 12, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field347[1].method463(-40219, var8 - 12, var10);
                            var10 += 14;
                        }
                        var2.method506(0, var6 + ": " + this.field394[var4], var10, false, var8);
                        var2.method506(65535, var6 + ": " + this.field394[var4], var10, false, var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field423 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method506(0, this.field394[var4], 4, false, var11);
                        var2.method506(65535, this.field394[var4], 4, false, var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field423 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method506(0, "To " + var6 + ": " + this.field394[var4], 4, false, var12);
                        var2.method506(65535, "To " + var6 + ": " + this.field394[var4], 4, false, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method127(byte arg0) {
        if (this.field113 > 1) {
            --this.field113;
        }
        if (this.field510 > 0) {
            --this.field510;
        }
        for (int var2 = 0; var2 < 5 && this.method132(false); ++var2) {
        }
        if (this.field335) {
            Object var3 = this.field524.field1030;
            synchronized (this.field524.field1030) {
                if (!field186) {
                    this.field524.field1033 = 0;
                } else if (super.field1186 != 0 || this.field524.field1033 >= 40) {
                    this.field77.method234(-281, 11);
                    this.field77.method235(0);
                    int var4 = this.field77.field837;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field524.field1033 && var4 - this.field77.field837 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field524.field1032[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field524.field1031[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field524.field1032[var6] == -1 && this.field524.field1031[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field532 == var8 && this.field533 == var7) {
                            if (this.field514 < 2047) {
                                ++this.field514;
                            }
                        } else {
                            int var10 = var8 - this.field532;
                            this.field532 = var8;
                            int var11 = var7 - this.field533;
                            this.field533 = var7;
                            if (this.field514 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field77.method236((this.field514 << 12) + (var10 << 6) + var11);
                                this.field514 = 0;
                            } else if (this.field514 < 8) {
                                this.field77.method238((this.field514 << 19) + 8388608 + var9);
                                this.field514 = 0;
                            } else {
                                this.field77.method239((this.field514 << 19) + -1073741824 + var9);
                                this.field514 = 0;
                            }
                        }
                    }
                    this.field77.method244(0, this.field77.field837 - var4);
                    if (var5 >= this.field524.field1033) {
                        this.field524.field1033 = 0;
                    } else {
                        this.field524.field1033 -= var5;
                        for (int var12 = 0; var12 < this.field524.field1033; ++var12) {
                            this.field524.field1031[var12] = this.field524.field1031[var5 + var12];
                            this.field524.field1032[var12] = this.field524.field1032[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1186 != 0) {
                long var13 = (super.field1189 - this.field513) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field513 = super.field1189;
                int var15 = super.field1188;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1187;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1186 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field77.method234(-281, 62);
                this.field77.method239((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field536 > 0) {
                --this.field536;
            }
            if (super.field1190[1] == 1 || super.field1190[2] == 1 || super.field1190[3] == 1 || super.field1190[4] == 1) {
                this.field537 = true;
            }
            if (this.field537 && this.field536 <= 0) {
                this.field536 = 20;
                this.field537 = false;
                this.field77.method234(-281, 179);
                this.field77.method270(this.field95, this.field151);
                this.field77.method270(this.field94, this.field151);
            }
            if (super.field1177 && !this.field444) {
                this.field444 = true;
                this.field77.method234(-281, 18);
                this.field77.method235(1);
            }
            if (!super.field1177 && this.field444) {
                this.field444 = false;
                this.field77.method234(-281, 18);
                this.field77.method235(0);
            }
            this.method99(2);
            this.method55(-41334);
            this.method187(7);
            ++this.field508;
            if (this.field508 > 750) {
                this.method183(false);
            }
            this.method172(this.field554);
            this.method75(3);
            this.method161(6);
            ++this.field442;
            if (this.field436 != 0) {
                this.field435 += 20;
                if (this.field435 >= 400) {
                    this.field436 = 0;
                }
            }
            if (this.field478 != 0) {
                ++this.field475;
                if (this.field475 >= 15) {
                    if (this.field478 == 2) {
                        this.field376 = true;
                    }
                    if (this.field478 == 3) {
                        this.field80 = true;
                    }
                    this.field478 = 0;
                }
            }
            if (this.field546 != 0) {
                ++this.field420;
                if (super.field1180 > this.field547 + 5 || super.field1180 < this.field547 - 5 || super.field1181 > this.field548 + 5 || super.field1181 < this.field548 - 5) {
                    this.field125 = true;
                }
                if (super.field1179 == 0) {
                    if (this.field546 == 2) {
                        this.field376 = true;
                    }
                    if (this.field546 == 3) {
                        this.field80 = true;
                    }
                    this.field546 = 0;
                    if (this.field125 && this.field420 >= 5) {
                        this.field178 = -1;
                        this.method109(9);
                        if (this.field544 == this.field178 && this.field545 != this.field177) {
                            class36 var20 = class36.method350(this.field544);
                            byte var21 = 0;
                            if (this.field137 == 1 && var20.field1146 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1115[this.field177] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1112) {
                                int var22 = this.field545;
                                int var23 = this.field177;
                                var20.field1115[var23] = var20.field1115[var22];
                                var20.field1116[var23] = var20.field1116[var22];
                                var20.field1115[var22] = -1;
                                var20.field1116[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field545;
                                int var25 = this.field177;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method349(var24 - 1, var24, -338);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method349(var24 + 1, var24, -338);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method349(this.field177, this.field545, -338);
                            }
                            this.field77.method234(-281, 220);
                            this.field77.method235(var21);
                            this.field77.method268(false, this.field544);
                            this.field77.method269(-65, this.field177);
                            this.field77.method236(this.field545);
                        }
                    } else if ((this.field211 == 1 || this.method105(this.field449 - 1, 22)) && this.field449 > 2) {
                        this.method57(0);
                    } else if (this.field449 > 0) {
                        this.method123((byte) -95, this.field449 - 1);
                    }
                    this.field475 = 10;
                    super.field1186 = 0;
                }
            }
            if (class46.field1380 != -1) {
                int var26 = class46.field1380;
                int var27 = class46.field1381;
                boolean var28 = this.method60(var27, 0, true, 0, field559.field609[0], 0, this.field209, 0, 0, var26, field559.field610[0], 0);
                class46.field1380 = -1;
                if (var28) {
                    this.field433 = super.field1187;
                    this.field434 = super.field1188;
                    this.field436 = 1;
                    this.field435 = 0;
                }
            }
            if (super.field1186 == 1 && this.field540 != null) {
                this.field540 = null;
                this.field80 = true;
                super.field1186 = 0;
            }
            this.method173(true);
            if (this.field286 == -1) {
                this.method184(-374);
                this.method155((byte) -49);
                this.method190(-853);
            }
            if (super.field1179 == 1 || super.field1186 == 1) {
                ++this.field517;
            }
            if (this.field155 == 0 && this.field136 == 0 && this.field141 == 0) {
                if (this.field250 > 0) {
                    --this.field250;
                }
            } else if (this.field250 < 100) {
                ++this.field250;
                if (this.field250 == 100) {
                    if (this.field155 != 0) {
                        this.field80 = true;
                    }
                    if (this.field136 != 0) {
                        this.field376 = true;
                    }
                }
            }
            if (this.field191 == 2) {
                this.method170(8);
            }
            if (this.field191 == 2 && this.field521) {
                this.method86(false);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field334[var29]++;
            }
            this.method65(-567);
            ++super.field1178;
            if (super.field1178 > 4500) {
                this.field510 = 250;
                super.field1178 -= 500;
                this.field77.method234(-281, 217);
            }
            ++this.field110;
            if (this.field110 > 500) {
                this.field110 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field518 += this.field519;
                }
                if ((var30 & 2) == 2) {
                    this.field217 += this.field218;
                }
                if ((var30 & 4) == 4) {
                    this.field78 += this.field79;
                }
            }
            if (this.field518 < -50) {
                this.field519 = 2;
            }
            if (this.field518 > 50) {
                this.field519 = -2;
            }
            if (this.field217 < -55) {
                this.field218 = 2;
            }
            if (this.field217 > 55) {
                this.field218 = -2;
            }
            if (this.field78 < -40) {
                this.field79 = 1;
            }
            if (this.field78 > 40) {
                this.field79 = -1;
            }
            ++this.field395;
            if (arg0 == 6) {
                if (this.field395 > 500) {
                    this.field395 = 0;
                    int var31 = (int) (Math.random() * 8.0D);
                    if ((var31 & 1) == 1) {
                        this.field564 += this.field565;
                    }
                    if ((var31 & 2) == 2) {
                        this.field222 += this.field223;
                    }
                }
                if (this.field564 < -60) {
                    this.field565 = 2;
                }
                if (this.field564 > 60) {
                    this.field565 = -2;
                }
                if (this.field222 < -20) {
                    this.field223 = 1;
                }
                if (this.field222 > 10) {
                    this.field223 = -1;
                }
                ++this.field509;
                if (this.field509 > 50) {
                    this.field77.method234(-281, 32);
                }
                try {
                    if (this.field164 != null && this.field77.field837 > 0) {
                        this.field164.method198(this.field77.field836, this.field77.field837, 0, -296);
                        this.field77.field837 = 0;
                        this.field509 = 0;
                    }
                } catch (IOException var33) {
                    this.method183(false);
                } catch (Exception var34) {
                    this.method103(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILIUVBENCV;)V")
    private final void method128(boolean arg0, int arg1, class25 arg2) {
        if (!arg0) {
            while (arg2.field838 + 21 < arg1 * 8) {
                int var4 = arg2.method256(830, 14);
                if (var4 == 16383) {
                    break;
                }
                if (this.field253[var4] == null) {
                    this.field253[var4] = new class32();
                }
                class32 var5 = this.field253[var4];
                this.field255[this.field254++] = var4;
                var5.field640 = field343;
                var5.field1028 = class39.method363(arg2.method256(830, 13));
                int var6 = arg2.method256(830, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg2.method256(830, 1);
                int var8 = arg2.method256(830, 1);
                if (var8 == 1) {
                    this.field309[this.field308++] = var4;
                }
                int var9 = arg2.method256(830, 5);
                if (var9 > 15) {
                    var9 -= 32;
                }
                var5.field633 = var5.field1028.field1211;
                var5.field611 = var5.field1028.field1249;
                var5.field596 = var5.field1028.field1221;
                var5.field597 = var5.field1028.field1214;
                var5.field598 = var5.field1028.field1227;
                var5.field599 = var5.field1028.field1223;
                var5.field607 = var5.field1028.field1220;
                var5.method202(field559.field609[0] + var6, field559.field610[0] + var9, 7, var7 == 1);
            }
            arg2.method257(547);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method129(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field566 >= 100 && this.field224 != 1) {
                this.method160(-232, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field566 >= 200) {
                this.method160(-232, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = class50.method456(839, class50.method453((byte) 3, arg1));
                for (int var5 = 0; var5 < this.field566; ++var5) {
                    if (this.field232[var5] == arg1) {
                        this.method160(-232, 0, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                while (arg0 >= 0) {
                    this.field77.method235(137);
                }
                for (int var6 = 0; var6 < this.field195; ++var6) {
                    if (this.field481[var6] == arg1) {
                        this.method160(-232, 0, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field559.field1594)) {
                    this.field228[this.field566] = var4;
                    this.field232[this.field566] = arg1;
                    this.field441[this.field566] = 0;
                    ++this.field566;
                    this.field376 = true;
                    this.field77.method234(-281, 53);
                    this.field77.method241(arg1, -45352);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public final int method130(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        this.field506 += arg3;
        return ((arg0 & 16711935) * var5 + (arg1 & 16711935) * arg2 & -16711936) + ((arg0 & 65280) * var5 + (arg1 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method131(int arg0) {
        this.field77.method234(-281, 176);
        if (arg0 != 35004) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field221 != -1) {
            this.method70(field84, this.field221);
            this.field221 = -1;
            this.field376 = true;
            this.field273 = false;
            this.field120 = true;
        }
        if (this.field321 != -1) {
            this.method70(field84, this.field321);
            this.field321 = -1;
            this.field80 = true;
            this.field273 = false;
        }
        if (this.field286 != -1) {
            this.method70(field84, this.field286);
            this.field286 = -1;
            this.field396 = true;
        }
        if (this.field183 != -1) {
            this.method70(field84, this.field183);
            this.field183 = -1;
        }
        if (this.field560 != -1) {
            this.method70(field84, this.field560);
            this.field560 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Z")
    public final boolean method132(boolean arg0) {
        if (arg0) {
            this.field193 = null;
        }
        if (this.field164 == null) {
            return false;
        } else {
            try {
                int var2 = this.field164.method196();
                if (var2 == 0) {
                    return false;
                }
                if (this.field507 == -1) {
                    this.field164.method197(this.field283.field836, 0, 1);
                    this.field507 = this.field283.field836[0] & 255;
                    if (this.field176 != null) {
                        this.field507 = this.field507 - this.field176.method230() & 255;
                    }
                    this.field506 = class28.field907[this.field507];
                    --var2;
                }
                if (this.field506 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field164.method197(this.field283.field836, 0, 1);
                    this.field506 = this.field283.field836[0] & 255;
                    --var2;
                }
                if (this.field506 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field164.method197(this.field283.field836, 0, 2);
                    this.field283.field837 = 0;
                    this.field506 = this.field283.method247();
                    var2 -= 2;
                }
                if (var2 < this.field506) {
                    return false;
                }
                this.field283.field837 = 0;
                this.field164.method197(this.field283.field836, 0, this.field506);
                this.field508 = 0;
                this.field399 = this.field398;
                this.field398 = this.field397;
                this.field397 = this.field507;
                if (this.field507 == 23) {
                    this.field224 = this.field283.method264(this.field168);
                    this.field350 = this.field283.method247();
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 97) {
                    int var3 = this.field283.method272(7);
                    int var4 = this.field283.method248();
                    int var5 = this.field283.method275(-69);
                    class36 var6 = class36.method350(var3);
                    var6.field1111 = var4;
                    var6.field1089 = var5;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 219) {
                    boolean var7 = this.field283.method263(this.field427) == 1;
                    int var8 = this.field283.method271(-725);
                    class36.method350(var8).field1124 = var7;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 210) {
                    this.field285 = this.field283.method245();
                    if (this.field529 == this.field285) {
                        if (this.field285 == 3) {
                            this.field529 = 1;
                        } else {
                            this.field529 = 3;
                        }
                        this.field376 = true;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 19) {
                    this.method85(this.field506, this.field233, this.field283);
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 233) {
                    this.method191(this.field283, this.field506, this.field280);
                    this.field337 = false;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 155) {
                    int var9 = this.field283.method247();
                    if (var9 == 65535) {
                        var9 = -1;
                    }
                    if (this.field180 != var9 && this.field111 && !field553 && this.field196 == 0) {
                        this.field522 = var9;
                        this.field523 = true;
                        this.field215.method40(2, this.field522);
                    }
                    this.field180 = var9;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 225) {
                    int var10 = this.field283.method276(0);
                    int var11 = this.field283.method247();
                    if (this.field111 && !field553) {
                        this.field522 = var11;
                        this.field523 = false;
                        this.field215.method40(2, this.field522);
                        this.field196 = var10;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 213) {
                    this.field406 = this.field283.method263(this.field427);
                    this.field405 = this.field283.method264(this.field168);
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 236) {
                    this.field515 = this.field283.method245();
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 247) {
                    this.method103(true);
                    this.field507 = -1;
                    return false;
                }
                if (this.field507 == 30) {
                    int var12 = this.field283.method247();
                    class36 var13 = class36.method350(var12);
                    for (int var14 = 0; var14 < var13.field1115.length; ++var14) {
                        var13.field1115[var14] = -1;
                        var13.field1115[var14] = 0;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 230) {
                    int var15 = this.field283.method247();
                    int var16 = this.field283.method245();
                    int var17 = this.field283.method247();
                    if (var17 == 65535) {
                        if (this.field480 < 50) {
                            this.field295[this.field480] = (short) var15;
                            this.field93[this.field480] = var16;
                            this.field327[this.field480] = 0;
                            ++this.field480;
                        }
                    } else if (this.field319 && !field553 && this.field480 < 50) {
                        this.field295[this.field480] = var15;
                        this.field93[this.field480] = var16;
                        this.field327[this.field480] = class49.field1424[var15] + var17;
                        ++this.field480;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 208) {
                    long var18 = this.field283.method251(-225);
                    int var20 = this.field283.method250();
                    int var21 = this.field283.method245();
                    boolean var22 = false;
                    for (int var23 = 0; var23 < 100; ++var23) {
                        if (this.field330[var23] == var20) {
                            var22 = true;
                            break;
                        }
                    }
                    if (var21 <= 1) {
                        for (int var24 = 0; var24 < this.field195; ++var24) {
                            if (this.field481[var24] == var18) {
                                var22 = true;
                                break;
                            }
                        }
                    }
                    if (!var22 && this.field504 == 0) {
                        try {
                            this.field330[this.field162] = var20;
                            this.field162 = (this.field162 + 1) % 100;
                            String var25 = class44.method383(448, this.field506 - 13, this.field283);
                            if (var21 != 3) {
                                var25 = class66.method544(9, var25);
                            }
                            if (var21 != 2 && var21 != 3) {
                                if (var21 == 1) {
                                    this.method160(-232, 7, var25, "@cr1@" + class50.method456(839, class50.method453((byte) 3, var18)));
                                } else {
                                    this.method160(-232, 3, var25, class50.method456(839, class50.method453((byte) 3, var18)));
                                }
                            } else {
                                this.method160(-232, 7, var25, "@cr2@" + class50.method456(839, class50.method453((byte) 3, var18)));
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 178) {
                    int var27 = this.field283.method275(-69);
                    int var28 = this.field283.method271(-725);
                    class36 var29 = class36.method350(var28);
                    if (var29.field1107 != var27 || var27 == -1) {
                        var29.field1107 = var27;
                        var29.field1092 = 0;
                        var29.field1120 = 0;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 202) {
                    this.field405 = this.field283.method264(this.field168);
                    this.field406 = this.field283.method245();
                    while (this.field283.field837 < this.field506) {
                        int var30 = this.field283.method245();
                        this.method163(var30, this.field283, false);
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 180) {
                    this.field342 = this.field283.method271(-725);
                    this.field324 = this.field283.method279(this.field555);
                    this.field76 = this.field283.method273(this.field204);
                    this.field118 = this.field283.method273(this.field204);
                    this.field234 = this.field283.method247();
                    this.field346 = this.field283.method247();
                    this.field283.method273(this.field204);
                    this.field417 = this.field283.method271(-725);
                    this.field443 = this.field283.method273(this.field204);
                    this.field283.method245();
                    this.field421 = this.field283.method273(this.field204);
                    signlink.dnslookup(class50.method455(false, this.field324));
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 181) {
                    int var31 = this.field283.method273(this.field204);
                    int var32 = this.field283.method272(7);
                    int var33 = var31 >> 10 & 31;
                    int var34 = var31 >> 5 & 31;
                    int var35 = var31 & 31;
                    class36.method350(var32).field1103 = (var35 << 3) + (var33 << 19) + (var34 << 11);
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 237) {
                    this.field376 = true;
                    int var36 = this.field283.method262(317);
                    int var37 = this.field283.method278(0);
                    int var38 = this.field283.method263(this.field427);
                    this.field528[var36] = var37;
                    this.field505[var36] = var38;
                    this.field166[var36] = 1;
                    for (int var39 = 0; var39 < 98; ++var39) {
                        if (var37 >= field138[var39]) {
                            this.field166[var36] = var39 + 2;
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 43) {
                    for (int var40 = 0; var40 < this.field167.length; ++var40) {
                        if (this.field287[var40] != this.field167[var40]) {
                            this.field167[var40] = this.field287[var40];
                            this.method52(7, var40);
                            this.field376 = true;
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 120) {
                    this.field561 = this.field283.method245();
                    if (this.field561 == 1) {
                        this.field75 = this.field283.method247();
                    }
                    if (this.field561 >= 2 && this.field561 <= 6) {
                        if (this.field561 == 2) {
                            this.field386 = 64;
                            this.field387 = 64;
                        }
                        if (this.field561 == 3) {
                            this.field386 = 0;
                            this.field387 = 64;
                        }
                        if (this.field561 == 4) {
                            this.field386 = 128;
                            this.field387 = 64;
                        }
                        if (this.field561 == 5) {
                            this.field386 = 64;
                            this.field387 = 0;
                        }
                        if (this.field561 == 6) {
                            this.field386 = 64;
                            this.field387 = 128;
                        }
                        this.field561 = 2;
                        this.field383 = this.field283.method247();
                        this.field384 = this.field283.method247();
                        this.field385 = this.field283.method245();
                    }
                    if (this.field561 == 10) {
                        this.field135 = this.field283.method247();
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 189) {
                    int var41 = this.field283.method273(this.field204);
                    int var42 = this.field283.method273(this.field204);
                    int var43 = this.field283.method272(7);
                    int var44 = this.field283.method271(-725);
                    class36.method350(var41).field1137 = var43;
                    class36.method350(var41).field1138 = var42;
                    class36.method350(var41).field1136 = var44;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 83) {
                    int var45 = this.field283.method271(-725);
                    this.method111(false, var45);
                    if (this.field221 != -1) {
                        this.method70(field84, this.field221);
                        this.field221 = -1;
                        this.field376 = true;
                        this.field120 = true;
                    }
                    if (this.field321 != -1) {
                        this.method70(field84, this.field321);
                        this.field321 = -1;
                        this.field80 = true;
                    }
                    if (this.field286 != -1) {
                        this.method70(field84, this.field286);
                        this.field286 = -1;
                        this.field396 = true;
                    }
                    if (this.field183 != -1) {
                        this.method70(field84, this.field183);
                        this.field183 = -1;
                    }
                    if (this.field560 != var45) {
                        this.method70(field84, this.field560);
                        this.field560 = var45;
                    }
                    if (this.field229 != 0) {
                        this.field229 = 0;
                        this.field80 = true;
                    }
                    this.field273 = false;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 159) {
                    this.field521 = false;
                    for (int var46 = 0; var46 < 5; ++var46) {
                        this.field356[var46] = false;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 55 || this.field507 == 114 || this.field507 == 137 || this.field507 == 1 || this.field507 == 39 || this.field507 == 68 || this.field507 == 112 || this.field507 == 125 || this.field507 == 115 || this.field507 == 132 || this.field507 == 75) {
                    this.method163(this.field507, this.field283, false);
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 56) {
                    int var47 = this.field283.method277(true);
                    int var48 = this.field283.method272(7);
                    this.field287[var48] = var47;
                    if (this.field167[var48] != var47) {
                        this.field167[var48] = var47;
                        this.method52(7, var48);
                        this.field376 = true;
                        if (this.field439 != -1) {
                            this.field80 = true;
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 6) {
                    for (int var49 = 0; var49 < this.field305.length; ++var49) {
                        if (this.field305[var49] != null) {
                            this.field305[var49].field615 = -1;
                        }
                    }
                    for (int var50 = 0; var50 < this.field253.length; ++var50) {
                        if (this.field253[var50] != null) {
                            this.field253[var50].field615 = -1;
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 52) {
                    int var51 = this.field283.method271(-725);
                    int var52 = this.field283.method273(this.field204);
                    int var53 = this.field283.method271(-725);
                    class36.method350(var53).field1093 = (var52 << 16) + var51;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 161) {
                    int var54 = this.field283.method273(this.field204);
                    int var55 = this.field283.method273(this.field204);
                    class36.method350(var54).field1109 = 1;
                    class36.method350(var54).field1110 = var55;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 46) {
                    this.field113 = this.field283.method247() * 30;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 153) {
                    if (this.field529 == 12) {
                        this.field376 = true;
                    }
                    this.field549 = this.field283.method248();
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 88) {
                    this.field405 = this.field283.method262(317);
                    this.field406 = this.field283.method264(this.field168);
                    for (int var56 = this.field405; var56 < this.field405 + 8; ++var56) {
                        for (int var57 = this.field406; var57 < this.field406 + 8; ++var57) {
                            if (this.field193[this.field220][var56][var57] != null) {
                                this.field193[this.field220][var56][var57] = null;
                                this.method97(var56, var57);
                            }
                        }
                    }
                    for (class30 var58 = (class30) this.field539.method580(); var58 != null; var58 = (class30) this.field539.method582((byte) 6)) {
                        if (var58.field998 >= this.field405 && var58.field998 < this.field405 + 8 && var58.field999 >= this.field406 && var58.field999 < this.field406 + 8 && this.field220 == var58.field996) {
                            var58.field994 = 0;
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 38) {
                    int var59 = this.field283.method247();
                    int var60 = this.field283.method273(this.field204);
                    class36 var61 = class36.method350(var60);
                    if (var61 != null && var61.field1140 == 0) {
                        if (var59 < 0) {
                            var59 = 0;
                        }
                        if (var59 > var61.field1130 - var61.field1157) {
                            var59 = var61.field1130 - var61.field1157;
                        }
                        var61.field1106 = var59;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 254) {
                    this.field376 = true;
                    int var62 = this.field283.method247();
                    class36 var63 = class36.method350(var62);
                    int var64 = this.field283.method247();
                    for (int var65 = 0; var65 < var64; ++var65) {
                        var63.field1115[var65] = this.field283.method247();
                        int var66 = this.field283.method245();
                        if (var66 == 255) {
                            var66 = this.field283.method277(true);
                        }
                        var63.field1116[var65] = var66;
                    }
                    for (int var67 = var64; var67 < var63.field1115.length; ++var67) {
                        var63.field1115[var67] = 0;
                        var63.field1116[var67] = 0;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 0) {
                    String var68 = this.field283.method252();
                    int var69 = this.field283.method263(this.field427);
                    int var70 = this.field283.method264(this.field168);
                    if (var69 >= 1 && var69 <= 5) {
                        if (var68.equalsIgnoreCase("null")) {
                            var68 = null;
                        }
                        this.field256[var69 - 1] = var68;
                        this.field257[var69 - 1] = var70 == 0;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 186) {
                    this.field161 = false;
                    this.field229 = 1;
                    this.field114 = "";
                    this.field80 = true;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 160) {
                    this.field352 = this.field283.method245();
                    this.field423 = this.field283.method245();
                    this.field326 = this.field283.method245();
                    this.field182 = true;
                    this.field80 = true;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 35) {
                    int var71 = this.field283.method274(false);
                    if (this.field439 != var71) {
                        this.method70(field84, this.field439);
                        this.field439 = var71;
                    }
                    this.field80 = true;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 205) {
                    this.field521 = true;
                    this.field245 = this.field283.method245();
                    this.field246 = this.field283.method245();
                    this.field247 = this.field283.method247();
                    this.field248 = this.field283.method245();
                    this.field249 = this.field283.method245();
                    if (this.field249 >= 100) {
                        int var72 = this.field245 * 128 + 64;
                        int var73 = this.field246 * 128 + 64;
                        int var74 = this.method146(var73, this.field220, var72, (byte) -112) - this.field247;
                        int var75 = var72 - this.field126;
                        int var76 = var74 - this.field127;
                        int var77 = var73 - this.field128;
                        int var78 = (int) Math.sqrt((double) (var75 * var75 + var77 * var77));
                        this.field129 = (int) (Math.atan2((double) var76, (double) var78) * 325.949D) & 2047;
                        this.field130 = (int) (Math.atan2((double) var75, (double) var77) * -325.949D) & 2047;
                        if (this.field129 < 128) {
                            this.field129 = 128;
                        }
                        if (this.field129 > 383) {
                            this.field129 = 383;
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 175) {
                    int var79 = this.field283.method272(7);
                    this.method111(false, var79);
                    if (this.field321 != -1) {
                        this.method70(field84, this.field321);
                        this.field321 = -1;
                        this.field80 = true;
                    }
                    if (this.field286 != -1) {
                        this.method70(field84, this.field286);
                        this.field286 = -1;
                        this.field396 = true;
                    }
                    if (this.field183 != -1) {
                        this.method70(field84, this.field183);
                        this.field183 = -1;
                    }
                    if (this.field560 != -1) {
                        this.method70(field84, this.field560);
                        this.field560 = -1;
                    }
                    if (this.field221 != var79) {
                        this.method70(field84, this.field221);
                        this.field221 = var79;
                    }
                    if (this.field229 != 0) {
                        this.field229 = 0;
                        this.field80 = true;
                    }
                    this.field376 = true;
                    this.field120 = true;
                    this.field273 = false;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 21) {
                    int var80 = this.field283.method247();
                    class36.method350(var80).field1109 = 3;
                    if (field559.field1591 == null) {
                        class36.method350(var80).field1110 = (field559.field1593[11] << 5) + (field559.field1593[8] << 10) + (field559.field1593[0] << 15) + (field559.field1595[0] << 25) + (field559.field1595[4] << 20) + field559.field1593[1];
                    } else {
                        class36.method350(var80).field1110 = (int) (field559.field1591.field1219 + 305419896L);
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 170) {
                    this.field316 = 0;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 50) {
                    this.field389 = this.field283.method245();
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 200) {
                    this.field376 = true;
                    int var81 = this.field283.method247();
                    class36 var82 = class36.method350(var81);
                    while (this.field283.field837 < this.field506) {
                        int var83 = this.field283.method259();
                        int var84 = this.field283.method247();
                        int var85 = this.field283.method245();
                        if (var85 == 255) {
                            var85 = this.field283.method250();
                        }
                        if (var83 >= 0 && var83 < var82.field1115.length) {
                            var82.field1115[var83] = var84;
                            var82.field1116[var83] = var85;
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 25) {
                    long var86 = this.field283.method251(-225);
                    int var88 = this.field283.method245();
                    String var89 = class50.method456(839, class50.method453((byte) 3, var86));
                    for (int var90 = 0; var90 < this.field566; ++var90) {
                        if (this.field232[var90] == var86) {
                            if (this.field441[var90] != var88) {
                                this.field441[var90] = var88;
                                this.field376 = true;
                                if (var88 > 0) {
                                    this.method160(-232, 5, var89 + " has logged in.", "");
                                }
                                if (var88 == 0) {
                                    this.method160(-232, 5, var89 + " has logged out.", "");
                                }
                            }
                            var89 = null;
                            break;
                        }
                    }
                    if (var89 != null && this.field566 < 200) {
                        this.field232[this.field566] = var86;
                        this.field228[this.field566] = var89;
                        this.field441[this.field566] = var88;
                        ++this.field566;
                        this.field376 = true;
                    }
                    boolean var91 = false;
                    while (!var91) {
                        var91 = true;
                        for (int var92 = 0; var92 < this.field566 - 1; ++var92) {
                            if (this.field441[var92] != field550 && this.field441[var92 + 1] == field550 || this.field441[var92] == 0 && this.field441[var92 + 1] != 0) {
                                int var93 = this.field441[var92];
                                this.field441[var92] = this.field441[var92 + 1];
                                this.field441[var92 + 1] = var93;
                                String var94 = this.field228[var92];
                                this.field228[var92] = this.field228[var92 + 1];
                                this.field228[var92 + 1] = var94;
                                long var95 = this.field232[var92];
                                this.field232[var92] = this.field232[var92 + 1];
                                this.field232[var92 + 1] = var95;
                                this.field376 = true;
                                var91 = false;
                            }
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 142) {
                    int var97 = this.field283.method272(7);
                    this.method111(false, var97);
                    if (this.field221 != -1) {
                        this.method70(field84, this.field221);
                        this.field221 = -1;
                        this.field376 = true;
                        this.field120 = true;
                    }
                    if (this.field286 != -1) {
                        this.method70(field84, this.field286);
                        this.field286 = -1;
                        this.field396 = true;
                    }
                    if (this.field183 != -1) {
                        this.method70(field84, this.field183);
                        this.field183 = -1;
                    }
                    if (this.field560 != -1) {
                        this.method70(field84, this.field560);
                        this.field560 = -1;
                    }
                    if (this.field321 != var97) {
                        this.method70(field84, this.field321);
                        this.field321 = var97;
                    }
                    this.field273 = false;
                    this.field80 = true;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 177) {
                    int var98 = this.field283.method245();
                    int var99 = this.field283.method245();
                    int var100 = this.field283.method245();
                    int var101 = this.field283.method245();
                    this.field356[var98] = true;
                    this.field251[var98] = var99;
                    this.field284[var98] = var100;
                    this.field568[var98] = var101;
                    this.field334[var98] = 0;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 109) {
                    int var102 = this.field283.method248();
                    if (var102 >= 0) {
                        this.method111(false, var102);
                    }
                    if (this.field165 != var102) {
                        this.method70(field84, this.field165);
                        this.field165 = var102;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 239) {
                    int var103 = this.field283.method247();
                    int var104 = this.field283.method264(this.field168);
                    if (var103 == 65535) {
                        var103 = -1;
                    }
                    if (this.field351[var104] != var103) {
                        this.method70(field84, this.field351[var104]);
                        this.field351[var104] = var103;
                    }
                    this.field376 = true;
                    this.field120 = true;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 61) {
                    int var105 = this.field283.method247();
                    int var106 = this.field283.method272(7);
                    int var107 = this.field283.method272(7);
                    if (var107 == 65535) {
                        class36.method350(var106).field1109 = 0;
                        this.field507 = -1;
                        return true;
                    }
                    class27 var108 = class27.method285(var107);
                    class36.method350(var106).field1109 = 4;
                    class36.method350(var106).field1110 = var107;
                    class36.method350(var106).field1137 = var108.field901;
                    class36.method350(var106).field1138 = var108.field869;
                    class36.method350(var106).field1136 = var108.field893 * 100 / var105;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 235) {
                    this.field161 = false;
                    this.field229 = 2;
                    this.field114 = "";
                    this.field80 = true;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 84) {
                    this.field529 = this.field283.method264(this.field168);
                    this.field376 = true;
                    this.field120 = true;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 255) {
                    int var109 = this.field283.method271(-725);
                    int var110 = this.field283.method247();
                    class36.method350(var110).field1109 = 2;
                    class36.method350(var110).field1110 = var109;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 111) {
                    String var111 = this.field283.method252();
                    if (var111.endsWith(":tradereq:")) {
                        String var112 = var111.substring(0, var111.indexOf(":"));
                        long var113 = class50.method452(var112);
                        boolean var115 = false;
                        for (int var116 = 0; var116 < this.field195; ++var116) {
                            if (this.field481[var116] == var113) {
                                var115 = true;
                                break;
                            }
                        }
                        if (!var115 && this.field504 == 0) {
                            this.method160(-232, 4, "wishes to trade with you.", var112);
                        }
                    } else if (var111.endsWith(":duelreq:")) {
                        String var117 = var111.substring(0, var111.indexOf(":"));
                        long var118 = class50.method452(var117);
                        boolean var120 = false;
                        for (int var121 = 0; var121 < this.field195; ++var121) {
                            if (this.field481[var121] == var118) {
                                var120 = true;
                                break;
                            }
                        }
                        if (!var120 && this.field504 == 0) {
                            this.method160(-232, 8, "wishes to duel with you.", var117);
                        }
                    } else if (!var111.endsWith(":chalreq:")) {
                        this.method160(-232, 0, var111, "");
                    } else {
                        String var122 = var111.substring(0, var111.indexOf(":"));
                        long var123 = class50.method452(var122);
                        boolean var125 = false;
                        for (int var126 = 0; var126 < this.field195; ++var126) {
                            if (this.field481[var126] == var123) {
                                var125 = true;
                                break;
                            }
                        }
                        if (!var125 && this.field504 == 0) {
                            String var127 = var111.substring(var111.indexOf(":") + 1, var111.length() - 9);
                            this.method160(-232, 8, var127, var122);
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 156) {
                    this.field521 = true;
                    this.field498 = this.field283.method245();
                    this.field499 = this.field283.method245();
                    this.field500 = this.field283.method247();
                    this.field501 = this.field283.method245();
                    this.field502 = this.field283.method245();
                    if (this.field502 >= 100) {
                        this.field126 = this.field498 * 128 + 64;
                        this.field128 = this.field499 * 128 + 64;
                        this.field127 = this.method146(this.field128, this.field220, this.field126, (byte) -112) - this.field500;
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 87) {
                    this.field567 = this.field283.method245();
                    this.field376 = true;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 62 || this.field507 == 8) {
                    int var128 = this.field483;
                    int var129 = this.field484;
                    if (this.field507 == 62) {
                        var129 = this.field283.method273(this.field204);
                        var128 = this.field283.method273(this.field204);
                        this.field267 = false;
                    }
                    if (this.field507 == 8) {
                        this.field283.method255((byte) 81);
                        int var130 = 0;
                        while (true) {
                            if (var130 >= 4) {
                                this.field283.method257(547);
                                var129 = this.field283.method271(-725);
                                var128 = this.field283.method247();
                                this.field267 = true;
                                break;
                            }
                            for (int var131 = 0; var131 < 13; ++var131) {
                                for (int var132 = 0; var132 < 13; ++var132) {
                                    int var133 = this.field283.method256(830, 1);
                                    if (var133 == 1) {
                                        this.field531[var130][var131][var132] = this.field283.method256(830, 26);
                                    } else {
                                        this.field531[var130][var131][var132] = -1;
                                    }
                                }
                            }
                            ++var130;
                        }
                    }
                    if (this.field483 == var128 && this.field484 == var129 && this.field191 == 2) {
                        this.field507 = -1;
                        return true;
                    }
                    this.field483 = var128;
                    this.field484 = var129;
                    this.field205 = (this.field483 - 6) * 8;
                    this.field206 = (this.field484 - 6) * 8;
                    this.field538 = false;
                    if ((this.field483 / 8 == 48 || this.field483 / 8 == 49) && this.field484 / 8 == 48) {
                        this.field538 = true;
                    }
                    if (this.field483 / 8 == 48 && this.field484 / 8 == 148) {
                        this.field538 = true;
                    }
                    this.field191 = 1;
                    this.field290 = System.currentTimeMillis();
                    this.method104("Loading - please wait.", 8389, (String) null);
                    if (this.field507 == 62) {
                        int var134 = 0;
                        int var135 = (this.field483 - 6) / 8;
                        label1193: while (true) {
                            if (var135 > (this.field483 + 6) / 8) {
                                this.field82 = new byte[var134][];
                                this.field416 = new byte[var134][];
                                this.field462 = new int[var134];
                                this.field463 = new int[var134];
                                this.field464 = new int[var134];
                                int var137 = 0;
                                int var138 = (this.field483 - 6) / 8;
                                while (true) {
                                    if (var138 > (this.field483 + 6) / 8) {
                                        break label1193;
                                    }
                                    for (int var139 = (this.field484 - 6) / 8; var139 <= (this.field484 + 6) / 8; ++var139) {
                                        this.field462[var137] = (var138 << 8) + var139;
                                        if (this.field538 && (var139 == 49 || var139 == 149 || var139 == 147 || var138 == 50 || var138 == 49 && var139 == 47)) {
                                            this.field463[var137] = -1;
                                            this.field464[var137] = -1;
                                            ++var137;
                                        } else {
                                            int var140 = this.field463[var137] = this.field215.method28(0, var138, var139, 1);
                                            if (var140 != -1) {
                                                this.field215.method40(3, var140);
                                            }
                                            int var141 = this.field464[var137] = this.field215.method28(1, var138, var139, 1);
                                            if (var141 != -1) {
                                                this.field215.method40(3, var141);
                                            }
                                            ++var137;
                                        }
                                    }
                                    ++var138;
                                }
                            }
                            for (int var136 = (this.field484 - 6) / 8; var136 <= (this.field484 + 6) / 8; ++var136) {
                                ++var134;
                            }
                            ++var135;
                        }
                    }
                    if (this.field507 == 8) {
                        int var142 = 0;
                        int[] var143 = new int[676];
                        int var144 = 0;
                        label1154: while (true) {
                            if (var144 >= 4) {
                                this.field82 = new byte[var142][];
                                this.field416 = new byte[var142][];
                                this.field462 = new int[var142];
                                this.field463 = new int[var142];
                                this.field464 = new int[var142];
                                int var152 = 0;
                                while (true) {
                                    if (var152 >= var142) {
                                        break label1154;
                                    }
                                    int var153 = this.field462[var152] = var143[var152];
                                    int var154 = var153 >> 8 & 255;
                                    int var155 = var153 & 255;
                                    int var156 = this.field463[var152] = this.field215.method28(0, var154, var155, 1);
                                    if (var156 != -1) {
                                        this.field215.method40(3, var156);
                                    }
                                    int var157 = this.field464[var152] = this.field215.method28(1, var154, var155, 1);
                                    if (var157 != -1) {
                                        this.field215.method40(3, var157);
                                    }
                                    ++var152;
                                }
                            }
                            for (int var145 = 0; var145 < 13; ++var145) {
                                for (int var146 = 0; var146 < 13; ++var146) {
                                    int var147 = this.field531[var144][var145][var146];
                                    if (var147 != -1) {
                                        int var148 = var147 >> 14 & 1023;
                                        int var149 = var147 >> 3 & 2047;
                                        int var150 = (var148 / 8 << 8) + var149 / 8;
                                        for (int var151 = 0; var151 < var142; ++var151) {
                                            if (var143[var151] == var150) {
                                                var150 = -1;
                                                break;
                                            }
                                        }
                                        if (var150 != -1) {
                                            var143[var142++] = var150;
                                        }
                                    }
                                }
                            }
                            ++var144;
                        }
                    }
                    int var158 = this.field205 - this.field207;
                    int var159 = this.field206 - this.field208;
                    this.field207 = this.field205;
                    this.field208 = this.field206;
                    for (int var160 = 0; var160 < 16384; ++var160) {
                        class32 var161 = this.field253[var160];
                        if (var161 != null) {
                            for (int var162 = 0; var162 < 10; ++var162) {
                                var161.field609[var162] -= var158;
                                var161.field610[var162] -= var159;
                            }
                            var161.field620 -= var158 * 128;
                            var161.field621 -= var159 * 128;
                        }
                    }
                    for (int var163 = 0; var163 < this.field303; ++var163) {
                        class62 var164 = this.field305[var163];
                        if (var164 != null) {
                            for (int var165 = 0; var165 < 10; ++var165) {
                                var164.field609[var165] -= var158;
                                var164.field610[var165] -= var159;
                            }
                            var164.field620 -= var158 * 128;
                            var164.field621 -= var159 * 128;
                        }
                    }
                    this.field337 = true;
                    byte var166 = 0;
                    byte var167 = 104;
                    byte var168 = 1;
                    if (var158 < 0) {
                        var166 = 103;
                        var167 = -1;
                        var168 = -1;
                    }
                    byte var169 = 0;
                    byte var170 = 104;
                    byte var171 = 1;
                    if (var159 < 0) {
                        var169 = 103;
                        var170 = -1;
                        var171 = -1;
                    }
                    for (int var172 = var166; var167 != var172; var172 += var168) {
                        for (int var173 = var169; var170 != var173; var173 += var171) {
                            int var174 = var158 + var172;
                            int var175 = var159 + var173;
                            for (int var176 = 0; var176 < 4; ++var176) {
                                if (var174 >= 0 && var175 >= 0 && var174 < 104 && var175 < 104) {
                                    this.field193[var176][var172][var173] = this.field193[var176][var174][var175];
                                } else {
                                    this.field193[var176][var172][var173] = null;
                                }
                            }
                        }
                    }
                    for (class30 var177 = (class30) this.field539.method580(); var177 != null; var177 = (class30) this.field539.method582((byte) 6)) {
                        var177.field998 -= var158;
                        var177.field999 -= var159;
                        if (var177.field998 < 0 || var177.field999 < 0 || var177.field998 >= 104 || var177.field999 >= 104) {
                            var177.method602();
                        }
                    }
                    if (this.field316 != 0) {
                        this.field316 -= var158;
                        this.field317 -= var159;
                    }
                    this.field521 = false;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 232) {
                    int var178 = this.field283.method272(7);
                    int var179 = this.field283.method273(this.field204);
                    if (this.field321 != -1) {
                        this.method70(field84, this.field321);
                        this.field321 = -1;
                        this.field80 = true;
                    }
                    if (this.field286 != -1) {
                        this.method70(field84, this.field286);
                        this.field286 = -1;
                        this.field396 = true;
                    }
                    if (this.field183 != -1) {
                        this.method70(field84, this.field183);
                        this.field183 = -1;
                    }
                    if (this.field560 != var179) {
                        this.method70(field84, this.field560);
                        this.field560 = var179;
                    }
                    if (this.field221 != var178) {
                        this.method70(field84, this.field221);
                        this.field221 = var178;
                    }
                    if (this.field229 != 0) {
                        this.field229 = 0;
                        this.field80 = true;
                    }
                    this.field376 = true;
                    this.field120 = true;
                    this.field273 = false;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 150) {
                    byte var180 = this.field283.method266((byte) 1);
                    int var181 = this.field283.method273(this.field204);
                    this.field287[var181] = var180;
                    if (this.field167[var181] != var180) {
                        this.field167[var181] = var180;
                        this.method52(7, var181);
                        this.field376 = true;
                        if (this.field439 != -1) {
                            this.field80 = true;
                        }
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 18) {
                    this.field195 = this.field506 / 8;
                    for (int var182 = 0; var182 < this.field195; ++var182) {
                        this.field481[var182] = this.field283.method251(-225);
                    }
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 171) {
                    if (this.field221 != -1) {
                        this.method70(field84, this.field221);
                        this.field221 = -1;
                        this.field376 = true;
                        this.field120 = true;
                    }
                    if (this.field321 != -1) {
                        this.method70(field84, this.field321);
                        this.field321 = -1;
                        this.field80 = true;
                    }
                    if (this.field286 != -1) {
                        this.method70(field84, this.field286);
                        this.field286 = -1;
                        this.field396 = true;
                    }
                    if (this.field183 != -1) {
                        this.method70(field84, this.field183);
                        this.field183 = -1;
                    }
                    if (this.field560 != -1) {
                        this.method70(field84, this.field560);
                        this.field560 = -1;
                    }
                    if (this.field229 != 0) {
                        this.field229 = 0;
                        this.field80 = true;
                    }
                    this.field273 = false;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 143) {
                    int var183 = this.field283.method271(-725);
                    int var184 = this.field283.method271(-725);
                    this.method111(false, var183);
                    if (var184 != -1) {
                        this.method111(false, var184);
                    }
                    if (this.field560 != -1) {
                        this.method70(field84, this.field560);
                        this.field560 = -1;
                    }
                    if (this.field221 != -1) {
                        this.method70(field84, this.field221);
                        this.field221 = -1;
                    }
                    if (this.field321 != -1) {
                        this.method70(field84, this.field321);
                        this.field321 = -1;
                    }
                    if (this.field286 != var183) {
                        this.method70(field84, this.field286);
                        this.field286 = var183;
                    }
                    if (this.field183 != var183) {
                        this.method70(field84, this.field183);
                        this.field183 = var184;
                    }
                    this.field229 = 0;
                    this.field273 = false;
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 85) {
                    if (this.field529 == 12) {
                        this.field376 = true;
                    }
                    this.field325 = this.field283.method245();
                    this.field507 = -1;
                    return true;
                }
                if (this.field507 == 9) {
                    int var185 = this.field283.method271(-725);
                    String var186 = this.field283.method252();
                    class36.method350(var185).field1094 = var186;
                    int var10001 = this.field351[this.field529];
                    if (class36.method350(var185).field1117 == var10001) {
                        this.field376 = true;
                    }
                    this.field507 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field507 + "," + this.field506 + " - " + this.field398 + "," + this.field399);
                this.method103(true);
            } catch (IOException var191) {
                this.method183(false);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field507 + "," + this.field398 + "," + this.field399 + " - " + this.field506 + "," + (field559.field609[0] + this.field205) + "," + (field559.field610[0] + this.field206) + " - ";
                for (int var189 = 0; var189 < this.field506 && var189 < 50; ++var189) {
                    var188 = var188 + this.field283.field836[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method103(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILMIIVNBFU;II)V")
    public final void method133(int arg0, int arg1, class36 arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            this.field315 = 350;
        }
        if (arg2.field1140 == 0 && arg2.field1119 != null) {
            if (!arg2.field1124 || this.field485 == arg2.field1088 || this.field512 == arg2.field1088 || this.field541 == arg2.field1088) {
                int var6 = class57.field1534;
                int var7 = class57.field1532;
                int var8 = class57.field1535;
                int var9 = class57.field1533;
                class57.method489(arg2.field1157 + arg3, arg1, -34121, arg3, arg2.field1087 + arg1);
                int var10 = arg2.field1119.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg2.field1142[var11] + arg1;
                    int var13 = arg2.field1122[var11] + arg3 - arg4;
                    class36 var14 = class36.method350(arg2.field1119[var11]);
                    int var15 = var14.field1111 + var12;
                    int var16 = var14.field1089 + var13;
                    if (var14.field1146 > 0) {
                        this.method142(this.field258, var14);
                    }
                    if (var14.field1140 == 0) {
                        if (var14.field1106 > var14.field1130 - var14.field1157) {
                            var14.field1106 = var14.field1130 - var14.field1157;
                        }
                        if (var14.field1106 < 0) {
                            var14.field1106 = 0;
                        }
                        this.method133(0, var15, var14, var16, var14.field1106);
                        if (var14.field1130 > var14.field1157) {
                            this.method95(var14.field1106, var14.field1157, var14.field1130, var14.field1087 + var15, 462, var16);
                        }
                    } else if (var14.field1140 != 1) {
                        if (var14.field1140 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1157; ++var18) {
                                for (int var19 = 0; var19 < var14.field1087; ++var19) {
                                    int var20 = (var14.field1132 + 32) * var19 + var15;
                                    int var21 = (var14.field1095 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1153[var17];
                                        var21 += var14.field1104[var17];
                                    }
                                    if (var14.field1115[var17] <= 0) {
                                        if (var14.field1113 != null && var17 < 20) {
                                            class21 var30 = var14.field1113[var17];
                                            if (var30 != null) {
                                                var30.method220(-40219, var21, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1115[var17] - 1;
                                        if (var20 > class57.field1534 - 32 && var20 < class57.field1535 && var21 > class57.field1532 - 32 && var21 < class57.field1533 || this.field546 != 0 && this.field545 == var17) {
                                            int var25 = 0;
                                            if (this.field297 == 1 && this.field298 == var17 && this.field299 == var14.field1088) {
                                                var25 = 16777215;
                                            }
                                            class21 var26 = class27.method287(var14.field1116[var17], this.field81, var24, var25);
                                            if (var26 != null) {
                                                if (this.field546 != 0 && this.field545 == var17 && this.field544 == var14.field1088) {
                                                    var22 = super.field1180 - this.field547;
                                                    var23 = super.field1181 - this.field548;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field420 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method222(var21 + var23, var20 + var22, 128, this.field323);
                                                    if (var21 + var23 < class57.field1532 && arg2.field1106 > 0) {
                                                        int var27 = (class57.field1532 - var21 - var23) * this.field442 / 3;
                                                        if (var27 > this.field442 * 10) {
                                                            var27 = this.field442 * 10;
                                                        }
                                                        if (var27 > arg2.field1106) {
                                                            var27 = arg2.field1106;
                                                        }
                                                        arg2.field1106 -= var27;
                                                        this.field548 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class57.field1533 && arg2.field1106 < arg2.field1130 - arg2.field1157) {
                                                        int var28 = (var21 + var23 + 32 - class57.field1533) * this.field442 / 3;
                                                        if (var28 > this.field442 * 10) {
                                                            var28 = this.field442 * 10;
                                                        }
                                                        if (var28 > arg2.field1130 - arg2.field1157 - arg2.field1106) {
                                                            var28 = arg2.field1130 - arg2.field1157 - arg2.field1106;
                                                        }
                                                        arg2.field1106 += var28;
                                                        this.field548 -= var28;
                                                    }
                                                } else if (this.field478 != 0 && this.field477 == var17 && this.field476 == var14.field1088) {
                                                    var26.method222(var21, var20, 128, this.field323);
                                                } else {
                                                    var26.method220(-40219, var21, var20);
                                                }
                                                if (var26.field782 == 33 || var14.field1116[var17] != 1) {
                                                    int var29 = var14.field1116[var17];
                                                    this.field494.method506(0, method152(var29, 471), var20 + 1 + var22, false, var21 + 10 + var23);
                                                    this.field494.method506(16776960, method152(var29, 471), var20 + var22, false, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1140 == 3) {
                            boolean var31 = false;
                            if (this.field541 == var14.field1088 || this.field512 == var14.field1088 || this.field485 == var14.field1088) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method138((byte) 2, var14)) {
                                var32 = var14.field1097;
                                if (var31 && var14.field1129 != 0) {
                                    var32 = var14.field1129;
                                }
                            } else {
                                var32 = var14.field1103;
                                if (var31 && var14.field1149 != 0) {
                                    var32 = var14.field1149;
                                }
                            }
                            if (var14.field1085 == 0) {
                                if (var14.field1090) {
                                    class57.method492(var14.field1087, var16, var32, -60, var14.field1157, var15);
                                } else {
                                    class57.method493(var32, var14.field1087, var14.field1157, var16, (byte) 0, var15);
                                }
                            } else if (var14.field1090) {
                                class57.method491(var14.field1157, var15, -47082, var16, 256 - (var14.field1085 & 255), var14.field1087, var32);
                            } else {
                                class57.method494(256 - (var14.field1085 & 255), var15, var16, var32, var14.field1087, var14.field1157, false);
                            }
                        } else if (var14.field1140 == 4) {
                            class60 var33 = var14.field1158;
                            String var34 = var14.field1094;
                            boolean var35 = false;
                            if (this.field541 == var14.field1088 || this.field512 == var14.field1088 || this.field485 == var14.field1088) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method138((byte) 2, var14)) {
                                var36 = var14.field1097;
                                if (var35 && var14.field1129 != 0) {
                                    var36 = var14.field1129;
                                }
                                if (var14.field1143.length() > 0) {
                                    var34 = var14.field1143;
                                }
                            } else {
                                var36 = var14.field1103;
                                if (var35 && var14.field1149 != 0) {
                                    var36 = var14.field1149;
                                }
                            }
                            if (var14.field1127 == 6 && this.field273) {
                                var34 = "Please wait...";
                                var36 = var14.field1103;
                            }
                            if (class57.field1530 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1570 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label392: while (true) {
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
                                                                            break label392;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method136(8, this.method168(var14, (byte) 7, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method136(8, this.method168(var14, (byte) 7, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method136(8, this.method168(var14, (byte) 7, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method136(8, this.method168(var14, (byte) 7, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method136(8, this.method168(var14, (byte) 7, 0)) + var34.substring(var38 + 2);
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
                                if (var14.field1133) {
                                    var33.method503(var44, var36, var14.field1087 / 2 + var15, 1, var37, var14.field1099);
                                } else {
                                    var33.method510(var44, var14.field1099, var15, var36, var37, 441);
                                }
                                var37 += var33.field1570;
                            }
                        } else if (var14.field1140 == 5) {
                            class21 var45;
                            if (this.method138((byte) 2, var14)) {
                                var45 = var14.field1144;
                            } else {
                                var45 = var14.field1086;
                            }
                            if (var45 != null) {
                                var45.method220(-40219, var16, var15);
                            }
                        } else if (var14.field1140 == 6) {
                            int var46 = class70.field1707;
                            int var47 = class70.field1708;
                            class70.field1707 = var14.field1087 / 2 + var15;
                            class70.field1708 = var14.field1157 / 2 + var16;
                            int var48 = class70.field1711[var14.field1137] * var14.field1136 >> 16;
                            int var49 = class70.field1712[var14.field1137] * var14.field1136 >> 16;
                            boolean var50 = this.method138((byte) 2, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1108;
                            } else {
                                var51 = var14.field1107;
                            }
                            class29 var52;
                            if (var51 == -1) {
                                var52 = var14.method345(-1, -1, -768, var50);
                            } else {
                                class65 var53 = class65.field1628[var51];
                                var52 = var14.method345(var53.field1630[var14.field1092], var53.field1631[var14.field1092], -768, var50);
                            }
                            if (var52 != null) {
                                var52.method321(0, var14.field1138, 0, var14.field1137, 0, var48, var49);
                            }
                            class70.field1707 = var46;
                            class70.field1708 = var47;
                        } else {
                            if (var14.field1140 == 7) {
                                class60 var54 = var14.field1158;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1157; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1087; ++var57) {
                                        if (var14.field1115[var55] > 0) {
                                            class27 var58 = class27.method285(var14.field1115[var55] - 1);
                                            String var59 = String.valueOf(var58.field894);
                                            if (var58.field859 || var14.field1116[var55] != 1) {
                                                var59 = var59 + " x" + method193(true, var14.field1116[var55]);
                                            }
                                            int var60 = (var14.field1132 + 115) * var57 + var15;
                                            int var61 = (var14.field1095 + 12) * var56 + var16;
                                            if (var14.field1133) {
                                                var54.method503(var59, var14.field1103, var14.field1087 / 2 + var60, 1, var61, var14.field1099);
                                            } else {
                                                var54.method510(var59, var14.field1099, var60, var14.field1103, var61, 441);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1140 == 8 && (this.field155 == var14.field1088 || this.field136 == var14.field1088 || this.field141 == var14.field1088) && this.field250 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class60 var64 = this.field495;
                                String var65 = var14.field1094;
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
                                    int var74 = var64.method504(var73, -665);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1570 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1087 + var15 - 5 - var62;
                                int var67 = var14.field1157 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg2.field1087 + arg1) {
                                    var66 = arg2.field1087 + arg1 - var62;
                                }
                                if (var63 + var67 > arg2.field1157 + arg3) {
                                    var67 = arg2.field1157 + arg3 - var63;
                                }
                                class57.method492(var62, var67, 16777120, -60, var63, var66);
                                class57.method493(0, var62, var63, var67, (byte) 0, var66);
                                String var68 = var14.field1094;
                                int var69 = var64.field1570 + var67 + 2;
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
                                    var64.method510(var71, false, var66 + 3, 0, var69, 441);
                                    var69 += var64.field1570 + 1;
                                }
                            }
                        }
                    }
                }
                class57.method489(var9, var6, -34121, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public void method134(int arg0) {
        this.field506 += arg0;
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field482);
        if (this.field215 != null) {
            System.out.println("Od-cycle:" + this.field215.field41);
        }
        System.out.println("loop-cycle:" + field343);
        System.out.println("draw-cycle:" + field200);
        System.out.println("ptype:" + this.field507);
        System.out.println("psize:" + this.field506);
        if (this.field164 != null) {
            this.field164.method199(0);
        }
        super.field1169 = true;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public final Component method135(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field507 = this.field283.method245();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1175 != null ? super.field1175 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method136(int arg0, int arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        } else {
            return arg1 < 999999999 ? String.valueOf(arg1) : "*";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILVJDNWPCM;LIUVBENCV;)V")
    private final void method137(int arg0, int arg1, int arg2, class62 arg3, class25 arg4) {
        if (arg1 == 42045) {
            if ((arg2 & 8) != 0) {
                int var6 = arg4.method263(this.field427);
                int var7 = arg4.method262(317);
                arg3.method204(field343, true, var7, var6);
                arg3.field623 = field343 + 300;
                arg3.field624 = arg4.method262(317);
                arg3.field625 = arg4.method245();
            }
            if ((arg2 & 32) != 0) {
                arg3.field606 = arg4.method252();
                if (arg3.field606.charAt(0) == '~') {
                    arg3.field606 = arg3.field606.substring(1);
                    this.method160(-232, 2, arg3.field606, arg3.field1594);
                } else if (field559 == arg3) {
                    this.method160(-232, 2, arg3.field606, arg3.field1594);
                }
                arg3.field637 = 0;
                arg3.field632 = 0;
                arg3.field631 = 150;
            }
            if ((arg2 & 1) != 0) {
                int var8 = arg4.method272(7);
                int var9 = arg4.method245();
                int var10 = arg4.method264(this.field168);
                int var11 = arg4.field837;
                if (arg3.field1594 != null && arg3.field1592) {
                    long var12 = class50.method452(arg3.field1594);
                    boolean var14 = false;
                    if (var9 <= 1) {
                        for (int var15 = 0; var15 < this.field195; ++var15) {
                            if (this.field481[var15] == var12) {
                                var14 = true;
                                break;
                            }
                        }
                    }
                    if (!var14 && this.field504 == 0) {
                        try {
                            this.field252.field837 = 0;
                            arg4.method254(var10, false, 0, this.field252.field836);
                            this.field252.field837 = 0;
                            String var16 = class44.method383(448, var10, this.field252);
                            String var17 = class66.method544(9, var16);
                            arg3.field606 = var17;
                            arg3.field637 = var8 >> 8;
                            arg3.field632 = var8 & 255;
                            arg3.field631 = 150;
                            if (var9 != 2 && var9 != 3) {
                                if (var9 == 1) {
                                    this.method160(-232, 1, var17, "@cr1@" + arg3.field1594);
                                } else {
                                    this.method160(-232, 2, var17, arg3.field1594);
                                }
                            } else {
                                this.method160(-232, 1, var17, "@cr2@" + arg3.field1594);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg4.field837 = var10 + var11;
            }
            if ((arg2 & 64) != 0) {
                arg3.field626 = arg4.method271(-725);
                if (arg3.field626 == 65535) {
                    arg3.field626 = -1;
                }
            }
            if ((arg2 & 4) != 0) {
                int var19 = arg4.method273(this.field204);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = arg4.method245();
                if (arg3.field615 == var19 && var19 != -1) {
                    int var21 = class65.field1628[var19].field1642;
                    if (var21 == 1) {
                        arg3.field616 = 0;
                        arg3.field617 = 0;
                        arg3.field618 = var20;
                        arg3.field619 = 0;
                    }
                    if (var21 == 2) {
                        arg3.field619 = 0;
                    }
                } else if (var19 == -1 || arg3.field615 == -1 || class65.field1628[var19].field1636 >= class65.field1628[arg3.field615].field1636) {
                    arg3.field615 = var19;
                    arg3.field616 = 0;
                    arg3.field617 = 0;
                    arg3.field618 = var20;
                    arg3.field619 = 0;
                    arg3.field612 = arg3.field595;
                }
            }
            if ((arg2 & 512) != 0) {
                arg3.field586 = arg4.method263(this.field427);
                arg3.field588 = arg4.method245();
                arg3.field587 = arg4.method264(this.field168);
                arg3.field589 = arg4.method264(this.field168);
                arg3.field590 = arg4.method247() + field343;
                arg3.field591 = arg4.method271(-725) + field343;
                arg3.field592 = arg4.method262(317);
                arg3.method200((byte) 89);
            }
            if ((arg2 & 1024) != 0) {
                arg3.field601 = arg4.method272(7);
                int var22 = arg4.method279(this.field555);
                arg3.field605 = var22 >> 16;
                arg3.field604 = (var22 & 65535) + field343;
                arg3.field602 = 0;
                arg3.field603 = 0;
                if (arg3.field604 > field343) {
                    arg3.field602 = -1;
                }
                if (arg3.field601 == 65535) {
                    arg3.field601 = -1;
                }
            }
            if ((arg2 & 128) != 0) {
                int var23 = arg4.method262(317);
                byte[] var24 = new byte[var23];
                class25 var25 = new class25(var24, 713);
                arg4.method281(var23, var24, 0, (byte) -41);
                this.field310[arg0] = var25;
                arg3.method524(false, var25);
            }
            if ((arg2 & 2) != 0) {
                arg3.field593 = arg4.method272(7);
                arg3.field594 = arg4.method271(-725);
            }
            if ((arg2 & 256) != 0) {
                int var26 = arg4.method264(this.field168);
                int var27 = arg4.method262(317);
                arg3.method204(field343, true, var27, var26);
                arg3.field623 = field343 + 300;
                arg3.field624 = arg4.method262(317);
                arg3.field625 = arg4.method263(this.field427);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLMIIVNBFU;)Z")
    public final boolean method138(byte arg0, class36 arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
            if (arg1.field1121 == null) {
                return false;
            } else {
                for (int var4 = 0; var4 < arg1.field1121.length; ++var4) {
                    int var5 = this.method168(arg1, (byte) 7, var4);
                    int var6 = arg1.field1152[var4];
                    if (arg1.field1121[var4] == 2) {
                        if (var5 >= var6) {
                            return false;
                        }
                    } else if (arg1.field1121[var4] == 3) {
                        if (var5 <= var6) {
                            return false;
                        }
                    } else if (arg1.field1121[var4] == 4) {
                        if (var5 == var6) {
                            return false;
                        }
                    } else if (var5 != var6) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public static final void method139(int arg0) {
        if (arg0 == 6823) {
            class46.field1346 = true;
            class70.field1702 = true;
            field553 = true;
            class53.field1469 = true;
            class35.field1042 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg1 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = class29.field984[var8];
            int var14 = class29.field985[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class29.field984[var9];
            int var17 = class29.field985[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field126 = arg2 - var10;
        this.field127 = arg3 - var11;
        if (arg0 <= 0) {
            this.field77.method235(249);
        }
        this.field128 = arg4 - var12;
        this.field129 = arg1;
        this.field130 = arg5;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILMIIVNBFU;IIII)V")
    public final void method141(int arg0, int arg1, int arg2, class36 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3.field1140 == 0 && arg3.field1119 != null && !arg3.field1124) {
            if (arg6 >= arg0 && arg4 >= arg5 && arg6 <= arg3.field1087 + arg0 && arg4 <= arg3.field1157 + arg5) {
                int var9 = arg3.field1119.length;
                while (arg7 >= 0) {
                    this.method176();
                }
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg3.field1142[var10] + arg0;
                    int var12 = arg3.field1122[var10] + arg5 - arg2;
                    class36 var13 = class36.method350(arg3.field1119[var10]);
                    int var14 = var13.field1111 + var11;
                    int var15 = var13.field1089 + var12;
                    if ((var13.field1128 >= 0 || var13.field1149 != 0) && arg6 >= var14 && arg4 >= var15 && arg6 < var13.field1087 + var14 && arg4 < var13.field1157 + var15) {
                        if (var13.field1128 >= 0) {
                            this.field153 = var13.field1128;
                        } else {
                            this.field153 = var13.field1088;
                        }
                    }
                    if (var13.field1140 == 8 && arg6 >= var14 && arg4 >= var15 && arg6 < var13.field1087 + var14 && arg4 < var13.field1157 + var15) {
                        this.field422 = var13.field1088;
                    }
                    if (var13.field1140 == 0) {
                        this.method141(var14, arg1, var13.field1106, var13, arg4, var15, arg6, -343);
                        if (var13.field1130 > var13.field1157) {
                            this.method84(var13.field1157, var13.field1130, var15, var13.field1087 + var14, arg6, var13, arg4, arg1, 0);
                        }
                    } else {
                        if (var13.field1127 == 1 && arg6 >= var14 && arg4 >= var15 && arg6 < var13.field1087 + var14 && arg4 < var13.field1157 + var15) {
                            boolean var16 = false;
                            if (var13.field1146 != 0) {
                                var16 = this.method72(true, var13);
                            }
                            if (!var16) {
                                this.field542[this.field449] = var13.field1150;
                                this.field380[this.field449] = 315;
                                this.field379[this.field449] = var13.field1088;
                                ++this.field449;
                            }
                        }
                        if (var13.field1127 == 2 && this.field98 == 0 && arg6 >= var14 && arg4 >= var15 && arg6 < var13.field1087 + var14 && arg4 < var13.field1157 + var15) {
                            String var17 = var13.field1096;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field542[this.field449] = var17 + " @gre@" + var13.field1147;
                            this.field380[this.field449] = 358;
                            this.field379[this.field449] = var13.field1088;
                            ++this.field449;
                        }
                        if (var13.field1127 == 3 && arg6 >= var14 && arg4 >= var15 && arg6 < var13.field1087 + var14 && arg4 < var13.field1157 + var15) {
                            this.field542[this.field449] = "Close";
                            if (arg1 == 3) {
                                this.field380[this.field449] = 819;
                            } else {
                                this.field380[this.field449] = 877;
                            }
                            this.field379[this.field449] = var13.field1088;
                            ++this.field449;
                        }
                        if (var13.field1127 == 4 && arg6 >= var14 && arg4 >= var15 && arg6 < var13.field1087 + var14 && arg4 < var13.field1157 + var15) {
                            this.field542[this.field449] = var13.field1150;
                            this.field380[this.field449] = 776;
                            this.field379[this.field449] = var13.field1088;
                            ++this.field449;
                        }
                        if (var13.field1127 == 5 && arg6 >= var14 && arg4 >= var15 && arg6 < var13.field1087 + var14 && arg4 < var13.field1157 + var15) {
                            this.field542[this.field449] = var13.field1150;
                            this.field380[this.field449] = 871;
                            this.field379[this.field449] = var13.field1088;
                            ++this.field449;
                        }
                        if (var13.field1127 == 6 && !this.field273 && arg6 >= var14 && arg4 >= var15 && arg6 < var13.field1087 + var14 && arg4 < var13.field1157 + var15) {
                            this.field542[this.field449] = var13.field1150;
                            this.field380[this.field449] = 967;
                            this.field379[this.field449] = var13.field1088;
                            ++this.field449;
                        }
                        if (var13.field1140 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1157; ++var19) {
                                for (int var20 = 0; var20 < var13.field1087; ++var20) {
                                    int var21 = (var13.field1132 + 32) * var20 + var14;
                                    int var22 = (var13.field1095 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1153[var18];
                                        var22 += var13.field1104[var18];
                                    }
                                    if (arg6 >= var21 && arg4 >= var22 && arg6 < var21 + 32 && arg4 < var22 + 32) {
                                        this.field177 = var18;
                                        this.field178 = var13.field1088;
                                        if (var13.field1115[var18] > 0) {
                                            class27 var23 = class27.method285(var13.field1115[var18] - 1);
                                            if (this.field297 == 1 && var13.field1102) {
                                                if (this.field299 != var13.field1088 || this.field298 != var18) {
                                                    this.field542[this.field449] = "Use " + this.field301 + " with @lre@" + var23.field894;
                                                    this.field380[this.field449] = 586;
                                                    this.field381[this.field449] = var23.field877;
                                                    this.field378[this.field449] = var18;
                                                    this.field379[this.field449] = var13.field1088;
                                                    ++this.field449;
                                                }
                                            } else if (this.field98 == 1 && var13.field1102) {
                                                if ((this.field100 & 16) == 16) {
                                                    this.field542[this.field449] = this.field101 + " @lre@" + var23.field894;
                                                    this.field380[this.field449] = 931;
                                                    this.field381[this.field449] = var23.field877;
                                                    this.field378[this.field449] = var18;
                                                    this.field379[this.field449] = var13.field1088;
                                                    ++this.field449;
                                                }
                                            } else {
                                                if (var13.field1102) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field880 != null && var23.field880[var24] != null) {
                                                            this.field542[this.field449] = var23.field880[var24] + " @lre@" + var23.field894;
                                                            if (var24 == 3) {
                                                                this.field380[this.field449] = 213;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field380[this.field449] = 245;
                                                            }
                                                            this.field381[this.field449] = var23.field877;
                                                            this.field378[this.field449] = var18;
                                                            this.field379[this.field449] = var13.field1088;
                                                            ++this.field449;
                                                        } else if (var24 == 4) {
                                                            this.field542[this.field449] = "Drop @lre@" + var23.field894;
                                                            this.field380[this.field449] = 245;
                                                            this.field381[this.field449] = var23.field877;
                                                            this.field378[this.field449] = var18;
                                                            this.field379[this.field449] = var13.field1088;
                                                            ++this.field449;
                                                        }
                                                    }
                                                }
                                                if (var13.field1131) {
                                                    this.field542[this.field449] = "Use @lre@" + var23.field894;
                                                    this.field380[this.field449] = 26;
                                                    this.field381[this.field449] = var23.field877;
                                                    this.field378[this.field449] = var18;
                                                    this.field379[this.field449] = var13.field1088;
                                                    ++this.field449;
                                                }
                                                if (var13.field1102 && var23.field880 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field880[var25] != null) {
                                                            this.field542[this.field449] = var23.field880[var25] + " @lre@" + var23.field894;
                                                            if (var25 == 0) {
                                                                this.field380[this.field449] = 80;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field380[this.field449] = 331;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field380[this.field449] = 426;
                                                            }
                                                            this.field381[this.field449] = var23.field877;
                                                            this.field378[this.field449] = var18;
                                                            this.field379[this.field449] = var13.field1088;
                                                            ++this.field449;
                                                        }
                                                    }
                                                }
                                                if (var13.field1135 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1135[var26] != null) {
                                                            this.field542[this.field449] = var13.field1135[var26] + " @lre@" + var23.field894;
                                                            if (var26 == 0) {
                                                                this.field380[this.field449] = 263;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field380[this.field449] = 898;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field380[this.field449] = 890;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field380[this.field449] = 139;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field380[this.field449] = 797;
                                                            }
                                                            this.field381[this.field449] = var23.field877;
                                                            this.field378[this.field449] = var18;
                                                            this.field379[this.field449] = var13.field1088;
                                                            ++this.field449;
                                                        }
                                                    }
                                                }
                                                this.field542[this.field449] = "Examine @lre@" + var23.field894;
                                                this.field380[this.field449] = 1164;
                                                this.field381[this.field449] = var23.field877;
                                                this.field378[this.field449] = var18;
                                                this.field379[this.field449] = var13.field1088;
                                                ++this.field449;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMIIVNBFU;)V")
    public final void method142(int arg0, class36 arg1) {
        int var3 = arg1.field1146;
        while (arg0 >= 0) {
            this.field382 = this.field176.method230();
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
                if (var3 == 203) {
                    int var6 = this.field566;
                    if (this.field567 != 2) {
                        var6 = 0;
                    }
                    arg1.field1130 = var6 * 15 + 20;
                    if (arg1.field1130 <= arg1.field1157) {
                        arg1.field1130 = arg1.field1157 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 == 0 && this.field567 == 0) {
                        arg1.field1094 = "Loading ignore list";
                        arg1.field1127 = 0;
                    } else if (var3 == 1 && this.field567 == 0) {
                        arg1.field1094 = "Please wait...";
                        arg1.field1127 = 0;
                    } else {
                        int var7 = this.field195;
                        if (this.field567 == 0) {
                            var7 = 0;
                        }
                        if (var3 >= var7) {
                            arg1.field1094 = "";
                            arg1.field1127 = 0;
                        } else {
                            arg1.field1094 = class50.method456(839, class50.method453((byte) 3, this.field481[var3]));
                            arg1.field1127 = 1;
                        }
                    }
                } else if (var3 == 503) {
                    arg1.field1130 = this.field195 * 15 + 20;
                    if (arg1.field1130 <= arg1.field1157) {
                        arg1.field1130 = arg1.field1157 + 1;
                    }
                } else if (var3 == 327) {
                    arg1.field1137 = 150;
                    arg1.field1138 = (int) (Math.sin((double) field343 / 40.0D) * 256.0D) & 2047;
                    if (this.field124) {
                        for (int var8 = 0; var8 < 7; ++var8) {
                            int var15 = this.field74[var8];
                            if (var15 >= 0 && !class63.field1613[var15].method527(-331)) {
                                return;
                            }
                        }
                        this.field124 = false;
                        class29[] var9 = new class29[7];
                        int var10 = 0;
                        for (int var11 = 0; var11 < 7; ++var11) {
                            int var14 = this.field74[var11];
                            if (var14 >= 0) {
                                var9[var10++] = class63.field1613[var14].method528((byte) 0);
                            }
                        }
                        class29 var12 = new class29(var9, var10, -41715);
                        for (int var13 = 0; var13 < 5; ++var13) {
                            if (this.field429[var13] != 0) {
                                var12.method314(field188[var13][0], field188[var13][this.field429[var13]]);
                                if (var13 == 1) {
                                    var12.method314(field355[0], field355[this.field429[var13]]);
                                }
                            }
                        }
                        var12.method307(979);
                        var12.method308(class65.field1628[field559.field607].field1630[0], 771);
                        var12.method317(64, 850, -30, -50, -30, true);
                        arg1.field1109 = 5;
                        arg1.field1110 = 0;
                        class36.method346(5, var12, 0, -943);
                    }
                } else if (var3 == 324) {
                    if (this.field288 == null) {
                        this.field288 = arg1.field1086;
                        this.field289 = arg1.field1144;
                    }
                    if (this.field362) {
                        arg1.field1086 = this.field289;
                    } else {
                        arg1.field1086 = this.field288;
                    }
                } else if (var3 == 325) {
                    if (this.field288 == null) {
                        this.field288 = arg1.field1086;
                        this.field289 = arg1.field1144;
                    }
                    if (this.field362) {
                        arg1.field1086 = this.field288;
                    } else {
                        arg1.field1086 = this.field289;
                    }
                } else if (var3 == 600) {
                    arg1.field1094 = this.field359;
                    if (field343 % 20 < 10) {
                        arg1.field1094 = arg1.field1094 + "|";
                    } else {
                        arg1.field1094 = arg1.field1094 + " ";
                    }
                } else {
                    if (var3 == 620) {
                        if (this.field236 >= 1) {
                            if (this.field479) {
                                arg1.field1103 = 16711680;
                                arg1.field1094 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg1.field1103 = 16777215;
                                arg1.field1094 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg1.field1094 = "";
                        }
                    }
                    if (var3 == 660) {
                        int var16 = this.field76 - this.field421;
                        String var17;
                        if (var16 <= 0) {
                            var17 = "earlier today";
                        } else if (var16 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = var16 + " days ago";
                        }
                        arg1.field1094 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                    }
                    if (var3 == 661) {
                        if (this.field234 == 0) {
                            arg1.field1094 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                        } else if (this.field234 <= this.field76) {
                            arg1.field1094 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method143(this.field234, 756);
                        } else {
                            int var18 = this.field76 + 14 - this.field234;
                            String var19;
                            if (var18 <= 0) {
                                var19 = "Earlier today";
                            } else if (var18 == 1) {
                                var19 = "Yesterday";
                            } else {
                                var19 = var18 + " days ago";
                            }
                            arg1.field1094 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method143(this.field234, 756) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                        }
                    }
                    if (var3 == 662) {
                        String var20;
                        if (this.field417 == 0) {
                            var20 = "@yel@0 unread messages";
                        } else if (this.field417 == 1) {
                            var20 = "@gre@1 unread message";
                        } else {
                            var20 = "@gre@" + this.field417 + " unread messages";
                        }
                        arg1.field1094 = "You have " + var20 + "\\nin your message centre.";
                    }
                    if (var3 == 663) {
                        if (this.field443 > 0 && this.field443 <= this.field76 + 10) {
                            arg1.field1094 = "Last password change:\\n@gre@" + this.method143(this.field443, 756);
                        } else {
                            arg1.field1094 = "Last password change:\\n@gre@Never changed";
                        }
                    }
                    if (var3 == 665) {
                        if (this.field346 > 2 && !field552) {
                            arg1.field1094 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                        } else if (this.field346 > 2) {
                            arg1.field1094 = "\\n\\nYou have @gre@" + this.field346 + "@yel@ days of\\nmember credit remaining.";
                        } else if (this.field346 > 0) {
                            arg1.field1094 = "You have @gre@" + this.field346 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                        } else {
                            arg1.field1094 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                        }
                    }
                    if (var3 == 667) {
                        if (this.field346 > 2 && !field552) {
                            arg1.field1094 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                        } else if (this.field346 > 0) {
                            arg1.field1094 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                        } else {
                            arg1.field1094 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                        }
                    }
                    if (var3 == 668) {
                        if (this.field234 > this.field76) {
                            arg1.field1094 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                        } else {
                            arg1.field1094 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                        }
                    }
                }
            } else {
                int var5 = this.field566;
                if (this.field567 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field1094 = "";
                    arg1.field1127 = 0;
                } else {
                    if (this.field441[var3] == 0) {
                        arg1.field1094 = "@red@Offline";
                    } else if (this.field441[var3] < 200) {
                        if (this.field441[var3] == field550) {
                            arg1.field1094 = "@gre@World" + (this.field441[var3] - 9);
                        } else {
                            arg1.field1094 = "@yel@World" + (this.field441[var3] - 9);
                        }
                    } else if (this.field441[var3] == field550) {
                        arg1.field1094 = "@gre@Classic" + (this.field441[var3] - 219);
                    } else {
                        arg1.field1094 = "@yel@Classic" + (this.field441[var3] - 219);
                    }
                    arg1.field1127 = 1;
                }
            }
        } else if (var3 == 1 && this.field567 == 0) {
            arg1.field1094 = "Loading friend list";
            arg1.field1127 = 0;
        } else if (var3 == 1 && this.field567 == 1) {
            arg1.field1094 = "Connecting to friendserver";
            arg1.field1127 = 0;
        } else if (var3 == 2 && this.field567 != 2) {
            arg1.field1094 = "Please wait...";
            arg1.field1127 = 0;
        } else {
            int var4 = this.field566;
            if (this.field567 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field1094 = "";
                arg1.field1127 = 0;
            } else {
                arg1.field1094 = this.field228[var3];
                arg1.field1127 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
    public final String method143(int arg0, int arg1) {
        if (arg0 > this.field76 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            int var5 = 87 / arg1;
            Calendar var6 = Calendar.getInstance();
            var6.setTime(new Date(var3));
            int var7 = var6.get(5);
            int var8 = var6.get(2);
            int var9 = var6.get(1);
            String[] var10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var7 + "-" + var10[var8] + "-" + var9;
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public static final void method144(int arg0) {
        class46.field1346 = false;
        class70.field1702 = false;
        field553 = false;
        class53.field1469 = false;
        class35.field1042 = false;
        if (arg0 != 26784) {
            field446 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.field107.method205(0);
        class70.field1713 = this.field262;
        this.field491.method463(-40219, 0, 0);
        if (arg0 != 7) {
            this.method176();
        }
        if (this.field161) {
            this.field496.method502(0, 239, this.field438, 7, 40);
            this.field496.method502(128, 239, this.field492 + "*", 7, 60);
        } else if (this.field229 == 1) {
            this.field496.method502(0, 239, "Enter amount:", 7, 40);
            this.field496.method502(128, 239, this.field114 + "*", 7, 60);
        } else if (this.field229 == 2) {
            this.field496.method502(0, 239, "Enter name:", 7, 40);
            this.field496.method502(128, 239, this.field114 + "*", 7, 60);
        } else if (this.field229 == 3) {
            if (this.field156 != this.field114) {
                this.method188(false, this.field114);
                this.field156 = this.field114;
            }
            class60 var2 = this.field495;
            class57.method489(77, 0, -34121, 0, 463);
            for (int var3 = 0; var3 < this.field157; ++var3) {
                int var4 = var3 * 14 + 18 - this.field160;
                if (var4 > 0 && var4 < 110) {
                    var2.method502(0, 239, this.field158[var3], 7, var4);
                }
            }
            class57.method488(-847);
            if (this.field157 > 5) {
                this.method95(this.field160, 77, this.field157 * 14 + 7, 463, 462, 0);
            }
            if (this.field114.length() == 0) {
                this.field496.method502(255, 239, "Enter object name", 7, 40);
            } else if (this.field157 == 0) {
                this.field496.method502(0, 239, "No matching objects found, please shorten search", 7, 40);
            }
            var2.method502(0, 239, this.field114 + "*", 7, 90);
            class57.method495(9, 77, 0, 0, 479);
        } else if (this.field540 != null) {
            this.field496.method502(0, 239, this.field540, 7, 40);
            this.field496.method502(128, 239, "Click to continue", 7, 60);
        } else if (this.field321 != -1) {
            this.method133(0, 0, class36.method350(this.field321), 0, 0);
        } else if (this.field439 != -1) {
            this.method133(0, 0, class36.method350(this.field439), 0, 0);
        } else {
            class60 var5 = this.field495;
            int var6 = 0;
            class57.method489(77, 0, -34121, 0, 463);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field394[var7] != null) {
                    int var9 = this.field392[var7];
                    int var10 = 70 - var6 * 14 + this.field189;
                    String var11 = this.field393[var7];
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
                            var5.method506(0, this.field394[var7], 4, false, var10);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field352 == 0 || this.field352 == 1 && this.method180(var11, false))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field347[0].method463(-40219, var10 - 12, var13);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field347[1].method463(-40219, var10 - 12, var13);
                                var13 += 14;
                            }
                            var5.method506(0, var11 + ":", var13, false, var10);
                            int var14 = var13 + var5.method504(var11, -665) + 8;
                            var5.method506(255, this.field394[var7], var14, false, var10);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field88 == 0 && (var9 == 7 || this.field423 == 0 || this.field423 == 1 && this.method180(var11, false))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method506(0, "From", var15, false, var10);
                            int var16 = var15 + var5.method504("From ", -665);
                            if (var12 == 1) {
                                this.field347[0].method463(-40219, var10 - 12, var16);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field347[1].method463(-40219, var10 - 12, var16);
                                var16 += 14;
                            }
                            var5.method506(0, var11 + ":", var16, false, var10);
                            int var17 = var16 + var5.method504(var11, -665) + 8;
                            var5.method506(8388608, this.field394[var7], var17, false, var10);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field326 == 0 || this.field326 == 1 && this.method180(var11, false))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method506(8388736, var11 + " " + this.field394[var7], 4, false, var10);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field88 == 0 && this.field423 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method506(8388608, this.field394[var7], 4, false, var10);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field88 == 0 && this.field423 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method506(0, "To " + var11 + ":", 4, false, var10);
                            var5.method506(8388608, this.field394[var7], 12 + var5.method504("To " + var11, -665), false, var10);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field326 == 0 || this.field326 == 1 && this.method180(var11, false))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method506(8270336, var11 + " " + this.field394[var7], 4, false, var10);
                        }
                        ++var6;
                    }
                }
            }
            class57.method488(-847);
            this.field339 = var6 * 14 + 7;
            if (this.field339 < 78) {
                this.field339 = 78;
            }
            this.method95(this.field339 - this.field189 - 77, 77, this.field339, 463, 462, 0);
            String var8;
            if (field559 != null && field559.field1594 != null) {
                var8 = field559.field1594;
            } else {
                var8 = class50.method456(839, this.field447);
            }
            var5.method506(0, var8 + ":", 4, false, 90);
            var5.method506(255, this.field450 + "*", 6 + var5.method504(var8 + ": ", -665), false, 90);
            class57.method495(9, 77, 0, 0, 479);
        }
        if (this.field230 && this.field146 == 2) {
            this.method71(false);
        }
        this.field107.method206(17, super.field1172, 9, 357);
        this.field106.method205(0);
        class70.field1713 = this.field264;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
    public final int method146(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field226[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field424[var7][var5][var6] + this.field424[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field424[var7][var5][var6 + 1] + this.field424[var7][var5 + 1][var6 + 1] * var8 >> 7;
            if (arg3 != -112) {
                this.field193 = null;
            }
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method147(int arg0) {
        if (this.field297 == 0 && this.field98 == 0) {
            this.field542[this.field449] = "Walk here";
            this.field380[this.field449] = 66;
            this.field378[this.field449] = super.field1180;
            this.field379[this.field449] = super.field1181;
            ++this.field449;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class29.field982; ++var3) {
            int var4 = class29.field983[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field277.method417(this.field220, var5, var6, var4) >= 0) {
                    class35 var9 = class35.method341(var8);
                    if (var9.field1046 != null) {
                        var9 = var9.method332(this.field174);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field297 == 1) {
                        this.field542[this.field449] = "Use " + this.field301 + " with @cya@" + var9.field1068;
                        this.field380[this.field449] = 124;
                        this.field381[this.field449] = var4;
                        this.field378[this.field449] = var5;
                        this.field379[this.field449] = var6;
                        ++this.field449;
                    } else if (this.field98 == 1) {
                        if ((this.field100 & 4) == 4) {
                            this.field542[this.field449] = this.field101 + " @cya@" + var9.field1068;
                            this.field380[this.field449] = 584;
                            this.field381[this.field449] = var4;
                            this.field378[this.field449] = var5;
                            this.field379[this.field449] = var6;
                            ++this.field449;
                        }
                    } else {
                        if (var9.field1082 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1082[var10] != null) {
                                    this.field542[this.field449] = var9.field1082[var10] + " @cya@" + var9.field1068;
                                    if (var10 == 0) {
                                        this.field380[this.field449] = 178;
                                    }
                                    if (var10 == 1) {
                                        this.field380[this.field449] = 638;
                                    }
                                    if (var10 == 2) {
                                        this.field380[this.field449] = 386;
                                    }
                                    if (var10 == 3) {
                                        this.field380[this.field449] = 463;
                                    }
                                    if (var10 == 4) {
                                        this.field380[this.field449] = 1901;
                                    }
                                    this.field381[this.field449] = var4;
                                    this.field378[this.field449] = var5;
                                    this.field379[this.field449] = var6;
                                    ++this.field449;
                                }
                            }
                        }
                        this.field542[this.field449] = "Examine @cya@" + var9.field1068;
                        this.field380[this.field449] = 1881;
                        this.field381[this.field449] = var9.field1049 << 14;
                        this.field378[this.field449] = var5;
                        this.field379[this.field449] = var6;
                        ++this.field449;
                    }
                }
                if (var7 == 1) {
                    class32 var11 = this.field253[var8];
                    if (var11.field1028.field1211 == 1 && (var11.field620 & 127) == 64 && (var11.field621 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field254; ++var12) {
                            class32 var15 = this.field253[this.field255[var12]];
                            if (var15 != null && var11 != var15 && var15.field1028.field1211 == 1 && var11.field620 == var15.field620 && var11.field621 == var15.field621) {
                                this.method167(this.field255[var12], var6, var5, (byte) -113, var15.field1028);
                            }
                        }
                        for (int var13 = 0; var13 < this.field306; ++var13) {
                            class62 var14 = this.field305[this.field307[var13]];
                            if (var14 != null && var11.field620 == var14.field620 && var11.field621 == var14.field621) {
                                this.method156(false, var14, var6, var5, this.field307[var13]);
                            }
                        }
                    }
                    this.method167(var8, var6, var5, (byte) -113, var11.field1028);
                }
                if (var7 == 0) {
                    class62 var16 = this.field305[var8];
                    if ((var16.field620 & 127) == 64 && (var16.field621 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field254; ++var17) {
                            class32 var20 = this.field253[this.field255[var17]];
                            if (var20 != null && var20.field1028.field1211 == 1 && var16.field620 == var20.field620 && var16.field621 == var20.field621) {
                                this.method167(this.field255[var17], var6, var5, (byte) -113, var20.field1028);
                            }
                        }
                        for (int var18 = 0; var18 < this.field306; ++var18) {
                            class62 var19 = this.field305[this.field307[var18]];
                            if (var19 != null && var16 != var19 && var16.field620 == var19.field620 && var16.field621 == var19.field621) {
                                this.method156(false, var19, var6, var5, this.field307[var18]);
                            }
                        }
                    }
                    this.method156(false, var16, var6, var5, var8);
                }
                if (var7 == 3) {
                    class69 var21 = this.field193[this.field220][var5][var6];
                    if (var21 != null) {
                        for (class22 var22 = (class22) var21.method581(true); var22 != null; var22 = (class22) var21.method583(-79)) {
                            class27 var23 = class27.method285(var22.field784);
                            if (this.field297 == 1) {
                                this.field542[this.field449] = "Use " + this.field301 + " with @lre@" + var23.field894;
                                this.field380[this.field449] = 450;
                                this.field381[this.field449] = var22.field784;
                                this.field378[this.field449] = var5;
                                this.field379[this.field449] = var6;
                                ++this.field449;
                            } else if (this.field98 == 1) {
                                if ((this.field100 & 1) == 1) {
                                    this.field542[this.field449] = this.field101 + " @lre@" + var23.field894;
                                    this.field380[this.field449] = 524;
                                    this.field381[this.field449] = var22.field784;
                                    this.field378[this.field449] = var5;
                                    this.field379[this.field449] = var6;
                                    ++this.field449;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field879 != null && var23.field879[var24] != null) {
                                        this.field542[this.field449] = var23.field879[var24] + " @lre@" + var23.field894;
                                        if (var24 == 0) {
                                            this.field380[this.field449] = 738;
                                        }
                                        if (var24 == 1) {
                                            this.field380[this.field449] = 794;
                                        }
                                        if (var24 == 2) {
                                            this.field380[this.field449] = 54;
                                        }
                                        if (var24 == 3) {
                                            this.field380[this.field449] = 409;
                                        }
                                        if (var24 == 4) {
                                            this.field380[this.field449] = 321;
                                        }
                                        this.field381[this.field449] = var22.field784;
                                        this.field378[this.field449] = var5;
                                        this.field379[this.field449] = var6;
                                        ++this.field449;
                                    } else if (var24 == 2) {
                                        this.field542[this.field449] = "Take @lre@" + var23.field894;
                                        this.field380[this.field449] = 54;
                                        this.field381[this.field449] = var22.field784;
                                        this.field378[this.field449] = var5;
                                        this.field379[this.field449] = var6;
                                        ++this.field449;
                                    }
                                }
                                this.field542[this.field449] = "Examine @lre@" + var23.field894;
                                this.field380[this.field449] = 1065;
                                this.field381[this.field449] = var22.field784;
                                this.field378[this.field449] = var5;
                                this.field379[this.field449] = var6;
                                ++this.field449;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 7058) {
            this.field209 = -255;
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method148(int arg0) {
        int var2 = 5;
        this.field432[8] = 0;
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = 0;
        while (this.field432[8] == 0) {
            String var5 = "Unknown problem";
            this.method125("Connecting to web server", 20, (byte) 6);
            try {
                DataInputStream var6 = this.method166("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 376);
                class25 var7 = new class25(new byte[40], 713);
                var6.readFully(var7.field836, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field432[var8] = var7.method250();
                }
                int var9 = var7.method250();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field432[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field432[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field432[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field432[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field432[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field432[8] == 0) {
                ++var4;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method125("Game updated - please reload page", 10, (byte) 6);
                        var12 = 10;
                    } else {
                        this.method125(var5 + " - Will retry in " + var12 + " secs.", 10, (byte) 6);
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
                this.field437 = !this.field437;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method149(int arg0, boolean arg1) {
        if (arg1) {
            this.field77.method235(139);
        }
        if (!field553) {
            for (int var3 = 0; var3 < this.field331.length; ++var3) {
                int var4 = this.field331[var3];
                if (class70.field1721[var4] >= arg0) {
                    class52 var5 = class70.field1715[var4];
                    int var6 = var5.field1452 * var5.field1451 - 1;
                    int var7 = this.field442 * var5.field1451 * 2;
                    byte[] var8 = var5.field1449;
                    byte[] var9 = this.field391;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1449 = var9;
                    this.field391 = var8;
                    class70.method592(var4, 8);
                    ++field296;
                    if (field296 > 90) {
                        field296 = 0;
                        this.field77.method234(-281, 137);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
    public final void method150(long arg0, int arg1) {
        this.field506 += arg1;
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field195; ++var4) {
                if (this.field481[var4] == arg0) {
                    --this.field195;
                    this.field376 = true;
                    for (int var5 = var4; var5 < this.field195; ++var5) {
                        this.field481[var5] = this.field481[var5 + 1];
                    }
                    this.field77.method234(-281, 240);
                    this.field77.method241(arg0, -45352);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LIUVBENCV;II)V")
    private final void method151(class25 arg0, int arg1, int arg2) {
        int var4 = 17 / arg2;
        for (int var5 = 0; var5 < this.field308; ++var5) {
            int var6 = this.field309[var5];
            class62 var7 = this.field305[var6];
            int var8 = arg0.method245();
            if ((var8 & 16) != 0) {
                var8 += arg0.method245() << 8;
            }
            this.method137(var6, 42045, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
    private static final String method152(int arg0, int arg1) {
        int var2 = 80 / arg1;
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method153(boolean arg0) {
        if (arg0) {
            this.field77.method235(72);
        }
        this.field104.method205(0);
        class70.field1713 = this.field263;
        this.field489.method463(-40219, 0, 0);
        if (this.field221 != -1) {
            this.method133(0, 0, class36.method350(this.field221), 0, 0);
        } else if (this.field351[this.field529] != -1) {
            this.method133(0, 0, class36.method350(this.field351[this.field529]), 0, 0);
        }
        if (this.field230 && this.field146 == 1) {
            this.method71(false);
        }
        this.field104.method206(553, super.field1172, 9, 205);
        this.field106.method205(0);
        class70.field1713 = this.field264;
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method154(int arg0) {
        class17 var2 = (class17) this.field425.method580();
        if (arg0 != 6) {
            this.field507 = this.field283.method245();
        }
        while (var2 != null) {
            if (this.field220 == var2.field733 && !var2.field737) {
                if (field343 >= var2.field732) {
                    var2.method213(43006, this.field442);
                    if (var2.field737) {
                        var2.method602();
                    } else {
                        this.field277.method398(this.field108, 60, var2.field734, var2.field733, -1, var2.field735, false, var2, var2.field736, 0);
                    }
                }
            } else {
                var2.method602();
            }
            var2 = (class17) this.field425.method582((byte) 6);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method155(byte arg0) {
        if (arg0 != -49) {
            field446 = true;
        }
        if (super.field1186 == 1) {
            if (super.field1187 >= 539 && super.field1187 <= 573 && super.field1188 >= 169 && super.field1188 < 205 && this.field351[0] != -1) {
                this.field376 = true;
                this.field529 = 0;
                this.field120 = true;
            }
            if (super.field1187 >= 569 && super.field1187 <= 599 && super.field1188 >= 168 && super.field1188 < 205 && this.field351[1] != -1) {
                this.field376 = true;
                this.field529 = 1;
                this.field120 = true;
            }
            if (super.field1187 >= 597 && super.field1187 <= 627 && super.field1188 >= 168 && super.field1188 < 205 && this.field351[2] != -1) {
                this.field376 = true;
                this.field529 = 2;
                this.field120 = true;
            }
            if (super.field1187 >= 625 && super.field1187 <= 669 && super.field1188 >= 168 && super.field1188 < 203 && this.field351[3] != -1) {
                this.field376 = true;
                this.field529 = 3;
                this.field120 = true;
            }
            if (super.field1187 >= 666 && super.field1187 <= 696 && super.field1188 >= 168 && super.field1188 < 205 && this.field351[4] != -1) {
                this.field376 = true;
                this.field529 = 4;
                this.field120 = true;
            }
            if (super.field1187 >= 694 && super.field1187 <= 724 && super.field1188 >= 168 && super.field1188 < 205 && this.field351[5] != -1) {
                this.field376 = true;
                this.field529 = 5;
                this.field120 = true;
            }
            if (super.field1187 >= 722 && super.field1187 <= 756 && super.field1188 >= 169 && super.field1188 < 205 && this.field351[6] != -1) {
                this.field376 = true;
                this.field529 = 6;
                this.field120 = true;
            }
            if (super.field1187 >= 540 && super.field1187 <= 574 && super.field1188 >= 466 && super.field1188 < 502 && this.field351[7] != -1) {
                this.field376 = true;
                this.field529 = 7;
                this.field120 = true;
            }
            if (super.field1187 >= 572 && super.field1187 <= 602 && super.field1188 >= 466 && super.field1188 < 503 && this.field351[8] != -1) {
                this.field376 = true;
                this.field529 = 8;
                this.field120 = true;
            }
            if (super.field1187 >= 599 && super.field1187 <= 629 && super.field1188 >= 466 && super.field1188 < 503 && this.field351[9] != -1) {
                this.field376 = true;
                this.field529 = 9;
                this.field120 = true;
            }
            if (super.field1187 >= 627 && super.field1187 <= 671 && super.field1188 >= 467 && super.field1188 < 502 && this.field351[10] != -1) {
                this.field376 = true;
                this.field529 = 10;
                this.field120 = true;
            }
            if (super.field1187 >= 669 && super.field1187 <= 699 && super.field1188 >= 466 && super.field1188 < 503 && this.field351[11] != -1) {
                this.field376 = true;
                this.field529 = 11;
                this.field120 = true;
            }
            if (super.field1187 >= 696 && super.field1187 <= 726 && super.field1188 >= 466 && super.field1188 < 503 && this.field351[12] != -1) {
                this.field376 = true;
                this.field529 = 12;
                this.field120 = true;
            }
            if (super.field1187 >= 724 && super.field1187 <= 758 && super.field1188 >= 466 && super.field1188 < 502 && this.field351[13] != -1) {
                this.field376 = true;
                this.field529 = 13;
                this.field120 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLVJDNWPCM;III)V")
    public final void method156(boolean arg0, class62 arg1, int arg2, int arg3, int arg4) {
        if (field559 != arg1) {
            if (this.field449 < 400) {
                String var6;
                if (arg1.field1590 == 0) {
                    var6 = arg1.field1594 + method179(-161, field559.field1600, arg1.field1600) + " (level-" + arg1.field1600 + ")";
                } else {
                    var6 = arg1.field1594 + " (skill-" + arg1.field1590 + ")";
                }
                if (this.field297 == 1) {
                    this.field542[this.field449] = "Use " + this.field301 + " with @whi@" + var6;
                    this.field380[this.field449] = 766;
                    this.field381[this.field449] = arg4;
                    this.field378[this.field449] = arg3;
                    this.field379[this.field449] = arg2;
                    ++this.field449;
                } else if (this.field98 == 1) {
                    if ((this.field100 & 8) == 8) {
                        this.field542[this.field449] = this.field101 + " @whi@" + var6;
                        this.field380[this.field449] = 618;
                        this.field381[this.field449] = arg4;
                        this.field378[this.field449] = arg3;
                        this.field379[this.field449] = arg2;
                        ++this.field449;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field256[var7] != null) {
                            this.field542[this.field449] = this.field256[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field256[var7].equalsIgnoreCase("attack")) {
                                if (arg1.field1600 > field559.field1600) {
                                    var9 = 2000;
                                }
                                if (field559.field1604 != 0 && arg1.field1604 != 0) {
                                    if (field559.field1604 == arg1.field1604) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field257[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field380[this.field449] = var9 + 665;
                            }
                            if (var7 == 1) {
                                this.field380[this.field449] = var9 + 429;
                            }
                            if (var7 == 2) {
                                this.field380[this.field449] = var9 + 42;
                            }
                            if (var7 == 3) {
                                this.field380[this.field449] = var9 + 663;
                            }
                            if (var7 == 4) {
                                this.field380[this.field449] = var9 + 634;
                            }
                            this.field381[this.field449] = arg4;
                            this.field378[this.field449] = arg3;
                            this.field379[this.field449] = arg2;
                            ++this.field449;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field449; ++var8) {
                    if (this.field380[var8] == 66) {
                        this.field542[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg0) {
                    this.method176();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(JI)V")
    public final void method157(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field566; ++var4) {
                if (this.field232[var4] == arg0) {
                    --this.field566;
                    this.field376 = true;
                    for (int var5 = var4; var5 < this.field566; ++var5) {
                        this.field228[var5] = this.field228[var5 + 1];
                        this.field441[var5] = this.field441[var5 + 1];
                        this.field232[var5] = this.field232[var5 + 1];
                    }
                    this.field77.method234(-281, 19);
                    this.field77.method241(arg0, -45352);
                    break;
                }
            }
            if (arg1 != 6362) {
                this.field152 = !this.field152;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method158(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method159(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method160(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field439 != -1) {
            this.field540 = arg2;
            super.field1186 = 0;
        }
        if (this.field321 == -1) {
            this.field80 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field392[var5] = this.field392[var5 - 1];
            this.field393[var5] = this.field393[var5 - 1];
            this.field394[var5] = this.field394[var5 - 1];
        }
        this.field392[0] = arg1;
        if (arg0 < 0) {
            this.field393[0] = arg3;
            this.field394[0] = arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (arg0 != 6) {
            field122 = 463;
        }
        for (int var2 = -1; var2 < this.field306; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field304;
            } else {
                var6 = this.field307[var2];
            }
            class62 var7 = this.field305[var6];
            if (var7 != null && var7.field631 > 0) {
                --var7.field631;
                if (var7.field631 == 0) {
                    var7.field606 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field254; ++var3) {
            int var4 = this.field255[var3];
            class32 var5 = this.field253[var4];
            if (var5 != null && var5.field631 > 0) {
                --var5.field631;
                if (var5.field631 == 0) {
                    var5.field606 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LJQXBQBEJ;I)V")
    private final void method162(class30 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field997 == 0) {
            var3 = this.field277.method413(arg0.field996, arg0.field998, arg0.field999);
        }
        if (arg0.field997 == 1) {
            var3 = this.field277.method414(arg0.field999, 0, arg0.field998, arg0.field996);
        }
        if (arg0.field997 == 2) {
            var3 = this.field277.method415(arg0.field996, arg0.field998, arg0.field999);
        }
        if (arg0.field997 == 3) {
            var3 = this.field277.method416(arg0.field996, arg0.field998, arg0.field999);
        }
        if (var3 != 0) {
            int var7 = this.field277.method417(arg0.field996, arg0.field998, arg0.field999, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field991 = var4;
        arg0.field993 = var5;
        arg0.field992 = var6;
        this.field506 += arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILIUVBENCV;Z)V")
    public final void method163(int arg0, class25 arg1, boolean arg2) {
        if (arg2) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg0 == 112) {
            int var5 = arg1.method272(7);
            int var6 = arg1.method264(this.field168);
            int var7 = (var6 >> 4 & 7) + this.field405;
            int var8 = (var6 & 7) + this.field406;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class69 var9 = this.field193[this.field220][var7][var8];
                if (var9 != null) {
                    for (class22 var10 = (class22) var9.method580(); var10 != null; var10 = (class22) var9.method582((byte) 6)) {
                        if ((var5 & 32767) == var10.field784) {
                            var10.method602();
                            break;
                        }
                    }
                    if (var9.method580() == null) {
                        this.field193[this.field220][var7][var8] = null;
                    }
                    this.method97(var7, var8);
                }
            }
        } else if (arg0 == 114) {
            int var11 = arg1.method245();
            int var12 = (var11 >> 4 & 7) + this.field405;
            int var13 = (var11 & 7) + this.field406;
            int var14 = arg1.method247();
            int var15 = arg1.method247();
            int var16 = arg1.method247();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class69 var17 = this.field193[this.field220][var12][var13];
                if (var17 != null) {
                    for (class22 var18 = (class22) var17.method580(); var18 != null; var18 = (class22) var17.method582((byte) 6)) {
                        if ((var14 & 32767) == var18.field784 && var18.field786 == var15) {
                            var18.field786 = var16;
                            break;
                        }
                    }
                    this.method97(var12, var13);
                }
            }
        } else if (arg0 == 1) {
            int var19 = arg1.method273(this.field204);
            int var20 = arg1.method263(this.field427);
            int var21 = (var20 >> 4 & 7) + this.field405;
            int var22 = (var20 & 7) + this.field406;
            int var23 = arg1.method271(-725);
            int var24 = arg1.method271(-725);
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && this.field350 != var19) {
                class22 var25 = new class22();
                var25.field784 = var23;
                var25.field786 = var24;
                if (this.field193[this.field220][var21][var22] == null) {
                    this.field193[this.field220][var21][var22] = new class69(223);
                }
                this.field193[this.field220][var21][var22].method577(var25);
                this.method97(var21, var22);
            }
        } else if (arg0 == 75) {
            int var26 = arg1.method247();
            int var27 = arg1.method264(this.field168);
            int var28 = var27 >> 2;
            int var29 = var27 & 3;
            int var30 = this.field281[var28];
            int var31 = arg1.method262(317);
            int var32 = (var31 >> 4 & 7) + this.field405;
            int var33 = (var31 & 7) + this.field406;
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                this.method177(var32, var28, var33, var30, var29, (byte) 73, 0, this.field220, -1, var26);
            }
        } else if (arg0 == 39) {
            int var34 = arg1.method245();
            int var35 = (var34 >> 4 & 7) + this.field405;
            int var36 = (var34 & 7) + this.field406;
            int var37 = arg1.method247();
            int var38 = arg1.method245();
            int var39 = arg1.method247();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                int var40 = var35 * 128 + 64;
                int var41 = var36 * 128 + 64;
                class17 var42 = new class17(793, this.method146(var41, this.field220, var40, (byte) -112) - var38, var37, this.field220, var41, field343, var40, var39);
                this.field425.method577(var42);
            }
        } else if (arg0 == 125) {
            int var43 = arg1.method272(7);
            int var44 = arg1.method245();
            int var45 = (var44 >> 4 & 7) + this.field405;
            int var46 = (var44 & 7) + this.field406;
            int var47 = arg1.method271(-725);
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                class22 var48 = new class22();
                var48.field784 = var43;
                var48.field786 = var47;
                if (this.field193[this.field220][var45][var46] == null) {
                    this.field193[this.field220][var45][var46] = new class69(223);
                }
                this.field193[this.field220][var45][var46].method577(var48);
                this.method97(var45, var46);
            }
        } else if (arg0 == 115) {
            int var49 = arg1.method273(this.field204);
            int var50 = arg1.method263(this.field427);
            int var51 = (var50 >> 4 & 7) + this.field405;
            int var52 = (var50 & 7) + this.field406;
            int var53 = arg1.method245();
            int var54 = var53 >> 2;
            int var55 = var53 & 3;
            int var56 = this.field281[var54];
            if (var51 >= 0 && var52 >= 0 && var51 < 103 && var52 < 103) {
                int var57 = this.field424[this.field220][var51][var52];
                int var58 = this.field424[this.field220][var51 + 1][var52];
                int var59 = this.field424[this.field220][var51 + 1][var52 + 1];
                int var60 = this.field424[this.field220][var51][var52 + 1];
                if (var56 == 0) {
                    class72 var61 = this.field277.method409(var52, this.field220, var51, 2);
                    if (var61 != null) {
                        int var62 = var61.field1737 >> 14 & 32767;
                        if (var54 == 2) {
                            var61.field1735 = new class68(var60, var59, (byte) 7, var49, 2, false, var58, var57, var62, var55 + 4);
                            var61.field1736 = new class68(var60, var59, (byte) 7, var49, 2, false, var58, var57, var62, var55 + 1 & 3);
                        } else {
                            var61.field1735 = new class68(var60, var59, (byte) 7, var49, var54, false, var58, var57, var62, var55);
                        }
                    }
                }
                if (var56 == 1) {
                    class14 var63 = this.field277.method410(var52, -371, var51, this.field220);
                    if (var63 != null) {
                        var63.field711 = new class68(var60, var59, (byte) 7, var49, 4, false, var58, var57, var63.field712 >> 14 & 32767, 0);
                    }
                }
                if (var56 == 2) {
                    class15 var64 = this.field277.method411(var51, true, var52, this.field220);
                    if (var54 == 11) {
                        var54 = 10;
                    }
                    if (var64 != null) {
                        var64.field718 = new class68(var60, var59, (byte) 7, var49, var54, false, var58, var57, var64.field726 >> 14 & 32767, var55);
                    }
                }
                if (var56 == 3) {
                    class64 var65 = this.field277.method412(var51, var52, true, this.field220);
                    if (var65 != null) {
                        var65.field1623 = new class68(var60, var59, (byte) 7, var49, 22, false, var58, var57, var65.field1624 >> 14 & 32767, var55);
                    }
                }
            }
        } else if (arg0 == 68) {
            int var66 = arg1.method245();
            int var67 = (var66 >> 4 & 7) + this.field405;
            int var68 = (var66 & 7) + this.field406;
            int var69 = var67 + arg1.method246();
            int var70 = var68 + arg1.method246();
            int var71 = arg1.method248();
            int var72 = arg1.method247();
            int var73 = arg1.method245() * 4;
            int var74 = arg1.method245() * 4;
            int var75 = arg1.method247();
            int var76 = arg1.method247();
            int var77 = arg1.method245();
            int var78 = arg1.method245();
            if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104 && var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var72 != 65535) {
                int var79 = var67 * 128 + 64;
                int var80 = var68 * 128 + 64;
                int var81 = var69 * 128 + 64;
                int var82 = var70 * 128 + 64;
                class23 var83 = new class23(field343 + var75, this.method146(var80, this.field220, var79, (byte) -112) - var73, field343 + var76, var77, (byte) 2, var71, var78, var74, this.field220, var80, var72, var79);
                var83.method228(var81, this.method146(var82, this.field220, var81, (byte) -112) - var74, false, field343 + var75, var82);
                this.field430.method577(var83);
            }
        } else {
            if (arg0 == 55) {
                int var84 = arg1.method245();
                int var85 = (var84 >> 4 & 7) + this.field405;
                int var86 = (var84 & 7) + this.field406;
                int var87 = arg1.method247();
                int var88 = arg1.method245();
                int var89 = var88 >> 4 & 15;
                int var90 = var88 & 7;
                if (field559.field609[0] >= var85 - var89 && field559.field609[0] <= var85 + var89 && field559.field610[0] >= var86 - var89 && field559.field610[0] <= var86 + var89 && this.field319 && !field553 && this.field480 < 50) {
                    this.field295[this.field480] = var87;
                    this.field93[this.field480] = var90;
                    this.field327[this.field480] = class49.field1424[var87];
                    ++this.field480;
                }
            }
            if (arg0 == 132) {
                int var91 = arg1.method245();
                int var92 = var91 >> 2;
                int var93 = var91 & 3;
                int var94 = this.field281[var92];
                int var95 = arg1.method263(this.field427);
                int var96 = (var95 >> 4 & 7) + this.field405;
                int var97 = (var95 & 7) + this.field406;
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    this.method177(var96, var92, var97, var94, var93, (byte) 73, 0, this.field220, -1, -1);
                }
            } else {
                if (arg0 == 137) {
                    int var98 = arg1.method247();
                    int var99 = arg1.method264(this.field168);
                    int var100 = (var99 >> 4 & 7) + this.field405;
                    int var101 = (var99 & 7) + this.field406;
                    byte var102 = arg1.method265((byte) 117);
                    byte var103 = arg1.method267(this.field214);
                    int var104 = arg1.method273(this.field204);
                    byte var105 = arg1.method267(this.field214);
                    int var106 = arg1.method271(-725);
                    int var107 = arg1.method263(this.field427);
                    int var108 = var107 >> 2;
                    int var109 = var107 & 3;
                    int var110 = this.field281[var108];
                    int var111 = arg1.method271(-725);
                    byte var112 = arg1.method266((byte) 1);
                    class62 var113;
                    if (this.field350 == var98) {
                        var113 = field559;
                    } else {
                        var113 = this.field305[var98];
                    }
                    if (var113 != null) {
                        class35 var114 = class35.method341(var106);
                        int var115 = this.field424[this.field220][var100][var101];
                        int var116 = this.field424[this.field220][var100 + 1][var101];
                        int var117 = this.field424[this.field220][var100 + 1][var101 + 1];
                        int var118 = this.field424[this.field220][var100][var101 + 1];
                        class29 var119 = var114.method338(var108, var109, var115, var116, var117, var118, -1);
                        if (var119 != null) {
                            this.method177(var100, 0, var101, var110, 0, (byte) 73, var111 + 1, this.field220, var104 + 1, -1);
                            var113.field1608 = field343 + var111;
                            var113.field1609 = field343 + var104;
                            var113.field1599 = var119;
                            int var120 = var114.field1038;
                            int var121 = var114.field1071;
                            if (var109 == 1 || var109 == 3) {
                                var120 = var114.field1071;
                                var121 = var114.field1038;
                            }
                            var113.field1596 = var100 * 128 + var120 * 64;
                            var113.field1598 = var101 * 128 + var121 * 64;
                            var113.field1597 = this.method146(var113.field1598, this.field220, var113.field1596, (byte) -112);
                            if (var112 > var105) {
                                byte var122 = var112;
                                var112 = var105;
                                var105 = var122;
                            }
                            if (var103 > var102) {
                                byte var123 = var103;
                                var103 = var102;
                                var102 = var123;
                            }
                            var113.field1586 = var100 + var112;
                            var113.field1588 = var100 + var105;
                            var113.field1587 = var101 + var103;
                            var113.field1589 = var101 + var102;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field550 = Integer.parseInt(this.getParameter("nodeid"));
        field551 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method139(6823);
        } else {
            method144(26784);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field552 = false;
        } else {
            field552 = true;
        }
        this.method354(765, 503, -43024);
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method164(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field259[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field259[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field260[var14] = (this.field259[var14 - 1] + this.field259[var14 + 1] + this.field259[var14 - 128] + this.field259[var14 + 128]) / 4;
            }
        }
        if (arg0 < 1 || arg0 > 1) {
            this.method176();
        }
        this.field201 += 128;
        if (this.field201 > this.field360.length) {
            this.field201 -= this.field360.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method54(this.field320[var6], (byte) 115);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field260[var11 + 128] - this.field360[this.field201 + var11 & this.field360.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field259[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field451[var8] = this.field451[var8 + 1];
        }
        this.field451[var2 - 1] = (int) (Math.sin((double) field343 / 14.0D) * 16.0D + Math.sin((double) field343 / 15.0D) * 14.0D + Math.sin((double) field343 / 16.0D) * 12.0D);
        if (this.field142 > 0) {
            this.field142 -= 4;
        }
        if (this.field143 > 0) {
            this.field143 -= 4;
        }
        if (this.field142 == 0 && this.field143 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field142 = 1024;
            }
            if (var9 == 1) {
                this.field143 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field401) {
            this.method102(-986);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method165(byte arg0) {
        this.field366 = 0;
        for (int var2 = -1; var2 < this.field306 + this.field254; ++var2) {
            class8 var20;
            if (var2 == -1) {
                var20 = field559;
            } else if (var2 < this.field306) {
                var20 = this.field305[this.field307[var2]];
            } else {
                var20 = this.field253[this.field255[var2 - this.field306]];
            }
            if (var20 != null && var20.method203(this.field382)) {
                if (var20 instanceof class32) {
                    class39 var21 = ((class32) var20).field1028;
                    if (var21.field1231 != null) {
                        var21 = var21.method362(4);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field306) {
                    class39 var24 = ((class32) var20).field1028;
                    if (var24.field1230 >= 0 && var24.field1230 < this.field210.length) {
                        this.method118(false, var20.field613 + 15, var20);
                        if (this.field293 > -1) {
                            this.field210[var24.field1230].method220(-40219, this.field294 - 30, this.field293 - 12);
                        }
                    }
                    if (this.field561 == 1 && this.field255[var2 - this.field306] == this.field75 && field343 % 20 < 10) {
                        this.method118(false, var20.field613 + 15, var20);
                        if (this.field293 > -1) {
                            this.field282[0].method220(-40219, this.field294 - 28, this.field293 - 12);
                        }
                    }
                } else {
                    int var22 = 30;
                    class62 var23 = (class62) var20;
                    if (var23.field1605 != -1 || var23.field1607 != -1) {
                        this.method118(false, var20.field613 + 15, var20);
                        if (this.field293 > -1) {
                            if (var23.field1605 != -1) {
                                this.field404[var23.field1605].method220(-40219, this.field294 - var22, this.field293 - 12);
                                var22 += 25;
                            }
                            if (var23.field1607 != -1) {
                                this.field210[var23.field1607].method220(-40219, this.field294 - var22, this.field293 - 12);
                                var22 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field561 == 10 && this.field307[var2] == this.field135) {
                        this.method118(false, var20.field613 + 15, var20);
                        if (this.field293 > -1) {
                            this.field282[1].method220(-40219, this.field294 - var22, this.field293 - 12);
                        }
                    }
                }
                if (var20.field606 != null && (var2 >= this.field306 || this.field352 == 0 || this.field352 == 3 || this.field352 == 1 && this.method180(((class62) var20).field1594, false))) {
                    this.method118(false, var20.field613, var20);
                    if (this.field293 > -1 && this.field366 < this.field367) {
                        this.field371[this.field366] = this.field496.method505(var20.field606, 264) / 2;
                        this.field370[this.field366] = this.field496.field1570;
                        this.field368[this.field366] = this.field293;
                        this.field369[this.field366] = this.field294;
                        this.field372[this.field366] = var20.field637;
                        this.field373[this.field366] = var20.field632;
                        this.field374[this.field366] = var20.field631;
                        this.field375[this.field366++] = var20.field606;
                        if (this.field571 == 0 && var20.field632 >= 1 && var20.field632 <= 3) {
                            this.field370[this.field366] += 10;
                            this.field369[this.field366] += 5;
                        }
                        if (this.field571 == 0 && var20.field632 == 4) {
                            this.field371[this.field366] = 60;
                        }
                        if (this.field571 == 0 && var20.field632 == 5) {
                            this.field370[this.field366] += 5;
                        }
                    }
                }
                if (var20.field623 > field343) {
                    this.method118(false, var20.field613 + 15, var20);
                    if (this.field293 > -1) {
                        int var25 = var20.field624 * 30 / var20.field625;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class57.method492(var25, this.field294 - 3, 65280, -60, 5, this.field293 - 15);
                        class57.method492(30 - var25, this.field294 - 3, 16711680, -60, 5, this.field293 - 15 + var25);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var20.field630[var26] > field343) {
                        this.method118(false, var20.field613 / 2, var20);
                        if (this.field293 > -1) {
                            if (var26 == 1) {
                                this.field294 -= 20;
                            }
                            if (var26 == 2) {
                                this.field293 -= 15;
                                this.field294 -= 10;
                            }
                            if (var26 == 3) {
                                this.field293 += 15;
                                this.field294 -= 10;
                            }
                            this.field102[var20.field629[var26]].method220(-40219, this.field294 - 12, this.field293 - 12);
                            this.field494.method502(0, this.field293, String.valueOf(var20.field628[var26]), 7, this.field294 + 4);
                            this.field494.method502(16777215, this.field293 - 1, String.valueOf(var20.field628[var26]), 7, this.field294 + 3);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field366; ++var3) {
            int var5 = this.field368[var3];
            int var6 = this.field369[var3];
            int var7 = this.field371[var3];
            int var8 = this.field370[var3];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var3; ++var19) {
                    if (var6 + 2 > this.field369[var19] - this.field370[var19] && var6 - var8 < this.field369[var19] + 2 && var5 - var7 < this.field371[var19] + this.field368[var19] && var5 + var7 > this.field368[var19] - this.field371[var19] && this.field369[var19] - this.field370[var19] < var6) {
                        var6 = this.field369[var19] - this.field370[var19];
                        var9 = true;
                    }
                }
            }
            this.field293 = this.field368[var3];
            this.field294 = this.field369[var3] = var6;
            String var10 = this.field375[var3];
            if (this.field571 == 0) {
                int var11 = 16776960;
                if (this.field372[var3] < 6) {
                    var11 = this.field184[this.field372[var3]];
                }
                if (this.field372[var3] == 6) {
                    var11 = this.field202 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field372[var3] == 7) {
                    var11 = this.field202 % 20 < 10 ? 255 : 65535;
                }
                if (this.field372[var3] == 8) {
                    var11 = this.field202 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field372[var3] == 9) {
                    int var12 = 150 - this.field374[var3];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field372[var3] == 10) {
                    int var13 = 150 - this.field374[var3];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field372[var3] == 11) {
                    int var14 = 150 - this.field374[var3];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field373[var3] == 0) {
                    this.field496.method502(0, this.field293, var10, 7, this.field294 + 1);
                    this.field496.method502(var11, this.field293, var10, 7, this.field294);
                }
                if (this.field373[var3] == 1) {
                    this.field496.method507(this.field293, var10, this.field202, 7, 0, this.field294 + 1);
                    this.field496.method507(this.field293, var10, this.field202, 7, var11, this.field294);
                }
                if (this.field373[var3] == 2) {
                    this.field496.method508(this.field293, 0, this.field202, this.field294 + 1, var10, (byte) 0);
                    this.field496.method508(this.field293, var11, this.field202, this.field294, var10, (byte) 0);
                }
                if (this.field373[var3] == 3) {
                    this.field496.method509(0, this.field294 + 1, this.field293, 150 - this.field374[var3], 58, var10, this.field202);
                    this.field496.method509(var11, this.field294, this.field293, 150 - this.field374[var3], 58, var10, this.field202);
                }
                if (this.field373[var3] == 4) {
                    int var15 = this.field496.method505(var10, 264);
                    int var16 = (150 - this.field374[var3]) * (var15 + 100) / 150;
                    class57.method489(334, this.field293 - 50, -34121, 0, this.field293 + 50);
                    this.field496.method506(0, var10, this.field293 + 50 - var16, false, this.field294 + 1);
                    this.field496.method506(var11, var10, this.field293 + 50 - var16, false, this.field294);
                    class57.method488(-847);
                }
                if (this.field373[var3] == 5) {
                    int var17 = 150 - this.field374[var3];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class57.method489(this.field294 + 5, 0, -34121, this.field294 - this.field496.field1570 - 1, 512);
                    this.field496.method502(0, this.field293, var10, 7, this.field294 + 1 + var18);
                    this.field496.method502(var11, this.field293, var10, 7, this.field294 + var18);
                    class57.method488(-847);
                }
            } else {
                this.field496.method502(0, this.field293, var10, 7, this.field294 + 1);
                this.field496.method502(16776960, this.field293, var10, 7, this.field294);
            }
        }
        if (arg0 == 1) {
            boolean var4 = false;
        } else {
            this.field151 = this.field176.method230();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method166(String arg0) throws IOException {
        if (!this.field437) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field569 != null) {
                try {
                    this.field569.close();
                } catch (Exception var4) {
                }
                this.field569 = null;
            }
            this.field569 = this.method158(43595);
            this.field569.setSoTimeout(10000);
            InputStream var2 = this.field569.getInputStream();
            OutputStream var3 = this.field569.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBLNIJEYEOX;)V")
    public final void method167(int arg0, int arg1, int arg2, byte arg3, class39 arg4) {
        if (this.field449 < 400) {
            if (arg4.field1231 != null) {
                arg4 = arg4.method362(4);
            }
            if (arg4 != null) {
                if (arg4.field1239) {
                    String var6 = arg4.field1215;
                    if (arg3 == -113) {
                        if (arg4.field1245 != 0) {
                            var6 = var6 + method179(-161, field559.field1600, arg4.field1245) + " (level-" + arg4.field1245 + ")";
                        }
                        if (this.field297 == 1) {
                            this.field542[this.field449] = "Use " + this.field301 + " with @yel@" + var6;
                            this.field380[this.field449] = 561;
                            this.field381[this.field449] = arg0;
                            this.field378[this.field449] = arg2;
                            this.field379[this.field449] = arg1;
                            ++this.field449;
                        } else {
                            if (this.field98 == 1) {
                                if ((this.field100 & 2) == 2) {
                                    this.field542[this.field449] = this.field101 + " @yel@" + var6;
                                    this.field380[this.field449] = 154;
                                    this.field381[this.field449] = arg0;
                                    this.field378[this.field449] = arg2;
                                    this.field379[this.field449] = arg1;
                                    ++this.field449;
                                    return;
                                }
                            } else {
                                if (arg4.field1216 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg4.field1216[var7] != null && !arg4.field1216[var7].equalsIgnoreCase("attack")) {
                                            this.field542[this.field449] = arg4.field1216[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field380[this.field449] = 339;
                                            }
                                            if (var7 == 1) {
                                                this.field380[this.field449] = 845;
                                            }
                                            if (var7 == 2) {
                                                this.field380[this.field449] = 851;
                                            }
                                            if (var7 == 3) {
                                                this.field380[this.field449] = 36;
                                            }
                                            if (var7 == 4) {
                                                this.field380[this.field449] = 859;
                                            }
                                            this.field381[this.field449] = arg0;
                                            this.field378[this.field449] = arg2;
                                            this.field379[this.field449] = arg1;
                                            ++this.field449;
                                        }
                                    }
                                }
                                if (arg4.field1216 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg4.field1216[var8] != null && arg4.field1216[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg4.field1245 > field559.field1600) {
                                                var9 = 2000;
                                            }
                                            this.field542[this.field449] = arg4.field1216[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field380[this.field449] = var9 + 339;
                                            }
                                            if (var8 == 1) {
                                                this.field380[this.field449] = var9 + 845;
                                            }
                                            if (var8 == 2) {
                                                this.field380[this.field449] = var9 + 851;
                                            }
                                            if (var8 == 3) {
                                                this.field380[this.field449] = var9 + 36;
                                            }
                                            if (var8 == 4) {
                                                this.field380[this.field449] = var9 + 859;
                                            }
                                            this.field381[this.field449] = arg0;
                                            this.field378[this.field449] = arg2;
                                            this.field379[this.field449] = arg1;
                                            ++this.field449;
                                        }
                                    }
                                }
                                this.field542[this.field449] = "Examine @yel@" + var6;
                                this.field380[this.field449] = 1433;
                                this.field381[this.field449] = arg0;
                                this.field378[this.field449] = arg2;
                                this.field379[this.field449] = arg1;
                                ++this.field449;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMIIVNBFU;BI)I")
    public final int method168(class36 arg0, byte arg1, int arg2) {
        if (arg1 == 7) {
            boolean var4 = false;
        } else {
            this.method176();
        }
        if (arg0.field1134 != null && arg2 < arg0.field1134.length) {
            try {
                int[] var5 = arg0.field1134[arg2];
                int var6 = 0;
                int var7 = 0;
                byte var8 = 0;
                while (true) {
                    int var9 = var5[var7++];
                    int var10 = 0;
                    byte var11 = 0;
                    if (var9 == 0) {
                        return var6;
                    }
                    if (var9 == 1) {
                        var10 = this.field505[var5[var7++]];
                    }
                    if (var9 == 2) {
                        var10 = this.field166[var5[var7++]];
                    }
                    if (var9 == 3) {
                        var10 = this.field528[var5[var7++]];
                    }
                    if (var9 == 4) {
                        class36 var12 = class36.method350(var5[var7++]);
                        int var13 = var5[var7++];
                        if (var13 >= 0 && var13 < class27.field864 && (!class27.method285(var13).field854 || field552)) {
                            for (int var14 = 0; var14 < var12.field1115.length; ++var14) {
                                if (var13 + 1 == var12.field1115[var14]) {
                                    var10 += var12.field1116[var14];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var10 = this.field167[var5[var7++]];
                    }
                    if (var9 == 6) {
                        var10 = field138[this.field166[var5[var7++]] - 1];
                    }
                    if (var9 == 7) {
                        var10 = this.field167[var5[var7++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var10 = field559.field1600;
                    }
                    if (var9 == 9) {
                        for (int var15 = 0; var15 < class18.field741; ++var15) {
                            if (class18.field743[var15]) {
                                var10 += this.field166[var15];
                            }
                        }
                    }
                    if (var9 == 10) {
                        class36 var16 = class36.method350(var5[var7++]);
                        int var17 = var5[var7++] + 1;
                        if (var17 >= 0 && var17 < class27.field864 && (!class27.method285(var17).field854 || field552)) {
                            for (int var18 = 0; var18 < var16.field1115.length; ++var18) {
                                if (var16.field1115[var18] == var17) {
                                    var10 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var10 = this.field325;
                    }
                    if (var9 == 12) {
                        var10 = this.field549;
                    }
                    if (var9 == 13) {
                        int var19 = this.field167[var5[var7++]];
                        int var20 = var5[var7++];
                        var10 = (var19 & 1 << var20) != 0 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var21 = var5[var7++];
                        class13 var22 = class13.field697[var21];
                        int var23 = var22.field699;
                        int var24 = var22.field700;
                        int var25 = var22.field701;
                        int var26 = field341[var25 - var24];
                        var10 = this.field167[var23] >> var24 & var26;
                    }
                    if (var9 == 15) {
                        var11 = 1;
                    }
                    if (var9 == 16) {
                        var11 = 2;
                    }
                    if (var9 == 17) {
                        var11 = 3;
                    }
                    if (var9 == 18) {
                        var10 = (field559.field620 >> 7) + this.field205;
                    }
                    if (var9 == 19) {
                        var10 = (field559.field621 >> 7) + this.field206;
                    }
                    if (var9 == 20) {
                        var10 = var5[var7++];
                    }
                    if (var11 == 0) {
                        if (var8 == 0) {
                            var6 += var10;
                        }
                        if (var8 == 1) {
                            var6 -= var10;
                        }
                        if (var8 == 2 && var10 != 0) {
                            var6 /= var10;
                        }
                        if (var8 == 3) {
                            var6 *= var10;
                        }
                        var8 = 0;
                    } else {
                        var8 = var11;
                    }
                }
            } catch (Exception var27) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        byte[] var2 = this.field357.method14("title.dat", (byte[]) null);
        class21 var3 = new class21(var2, this);
        this.field410.method205(0);
        var3.method218(0, false, 0);
        this.field411.method205(0);
        var3.method218(-637, false, 0);
        this.field407.method205(0);
        var3.method218(-128, false, 0);
        this.field408.method205(0);
        var3.method218(-202, false, -371);
        this.field409.method205(0);
        var3.method218(-202, false, -171);
        this.field412.method205(0);
        var3.method218(0, false, -265);
        this.field413.method205(0);
        var3.method218(-562, false, -265);
        this.field414.method205(0);
        var3.method218(-128, false, -171);
        this.field415.method205(0);
        var3.method218(-562, false, -171);
        int[] var4 = new int[var3.field778];
        for (int var5 = 0; var5 < var3.field779; ++var5) {
            for (int var10 = 0; var10 < var3.field778; ++var10) {
                var4[var10] = var3.field777[var3.field778 * var5 + (var3.field778 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field778; ++var11) {
                var3.field777[var3.field778 * var5 + var11] = var4[var11];
            }
        }
        this.field410.method205(0);
        var3.method218(382, false, 0);
        this.field411.method205(0);
        var3.method218(-255, false, 0);
        this.field407.method205(0);
        var3.method218(254, false, 0);
        this.field408.method205(0);
        var3.method218(180, false, -371);
        this.field409.method205(0);
        var3.method218(180, false, -171);
        this.field412.method205(0);
        var3.method218(382, false, -265);
        this.field413.method205(0);
        var3.method218(-180, false, -265);
        this.field414.method205(0);
        if (!arg0) {
            this.field507 = -1;
        }
        var3.method218(254, false, -171);
        this.field415.method205(0);
        var3.method218(-180, false, -171);
        class21 var6 = new class21(this.field357, "logo", 0);
        this.field407.method205(0);
        var6.method220(-40219, 18, 382 - var6.field778 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class71.field1729) {
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field358 = 380;
        }
        try {
            int var2 = field559.field620 + this.field518;
            int var3 = field559.field621 + this.field217;
            if (this.field534 - var2 < -500 || this.field534 - var2 > 500 || this.field535 - var3 < -500 || this.field535 - var3 > 500) {
                this.field534 = var2;
                this.field535 = var3;
            }
            if (this.field534 != var2) {
                this.field534 += (var2 - this.field534) / 16;
            }
            if (this.field535 != var3) {
                this.field535 += (var3 - this.field535) / 16;
            }
            if (super.field1190[1] == 1) {
                this.field96 += (-24 - this.field96) / 2;
            } else if (super.field1190[2] == 1) {
                this.field96 += (24 - this.field96) / 2;
            } else {
                this.field96 /= 2;
            }
            if (super.field1190[3] == 1) {
                this.field97 += (12 - this.field97) / 2;
            } else if (super.field1190[4] == 1) {
                this.field97 += (-12 - this.field97) / 2;
            } else {
                this.field97 /= 2;
            }
            this.field95 = this.field96 / 2 + this.field95 & 2047;
            this.field94 += this.field97 / 2;
            if (this.field94 < 128) {
                this.field94 = 128;
            }
            if (this.field94 > 383) {
                this.field94 = 383;
            }
            ++field261;
            if (field261 > 1601) {
                field261 = 0;
                this.field77.method234(-281, 35);
                this.field77.method235(0);
                int var4 = this.field77.field837;
                this.field77.method235((int) (Math.random() * 256.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method236(18929);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method235(115);
                }
                this.field77.method236(40940);
                this.field77.method236(15807);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method235(215);
                }
                this.field77.method235(34);
                this.field77.method235(66);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method236(27687);
                }
                this.field77.method236((int) (Math.random() * 65536.0D));
                this.field77.method244(0, this.field77.field837 - var4);
            }
            int var5 = this.field534 >> 7;
            int var6 = this.field535 >> 7;
            int var7 = this.method146(this.field535, this.field220, this.field534, (byte) -112);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field220;
                        if (var11 < 3 && (this.field226[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field424[var11][var9][var10];
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
            if (var13 > this.field344) {
                this.field344 += (var13 - this.field344) / 24;
            } else if (var13 < this.field344) {
                this.field344 += (var13 - this.field344) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field559.field620 + "," + field559.field621 + "," + this.field534 + "," + this.field535 + "," + this.field483 + "," + this.field484 + "," + this.field205 + "," + this.field206);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILGPLGZASP;I)V")
    public final void method171(int arg0, int arg1, class21 arg2, int arg3) {
        if (arg2 != null) {
            int var5 = this.field95 + this.field564 & 2047;
            int var6 = arg0 * arg0 + arg1 * arg1;
            if (var6 <= 6400) {
                int var7 = class29.field984[var5];
                int var8 = class29.field985[var5];
                int var9 = var7 * 256 / (this.field222 + 256);
                if (arg3 <= 0) {
                    this.field333 = -240;
                }
                int var10 = var8 * 256 / (this.field222 + 256);
                int var11 = arg0 * var10 + arg1 * var9 >> 16;
                int var12 = arg1 * var10 - arg0 * var9 >> 16;
                if (var6 > 2500) {
                    arg2.method226(var11 + 94 - arg2.field782 / 2 + 4, (byte) 52, 83 - var12 - arg2.field783 / 2 - 4, this.field490);
                } else {
                    arg2.method220(-40219, 83 - var12 - arg2.field783 / 2 - 4, var11 + 94 - arg2.field782 / 2 + 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method172(boolean arg0) {
        for (int var2 = -1; var2 < this.field306; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field304;
            } else {
                var3 = this.field307[var2];
            }
            class62 var4 = this.field305[var3];
            if (var4 != null) {
                this.method76(9, var4, 1);
            }
        }
        this.field335 &= arg0;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method173(boolean arg0) {
        if (this.field546 == 0) {
            int var2 = super.field1186;
            this.field335 &= arg0;
            if (this.field98 == 1 && super.field1187 >= 516 && super.field1188 >= 160 && super.field1187 <= 765 && super.field1188 <= 205) {
                var2 = 0;
            }
            if (this.field230) {
                if (var2 != 1) {
                    int var3 = super.field1180;
                    int var4 = super.field1181;
                    if (this.field146 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field146 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field146 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field147 - 10 || var3 > this.field149 + this.field147 + 10 || var4 < this.field148 - 10 || var4 > this.field150 + this.field148 + 10) {
                        this.field230 = false;
                        if (this.field146 == 1) {
                            this.field376 = true;
                        }
                        if (this.field146 == 2) {
                            this.field80 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field147;
                    int var6 = this.field148;
                    int var7 = this.field149;
                    int var8 = super.field1187;
                    int var9 = super.field1188;
                    if (this.field146 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field146 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field146 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field449; ++var11) {
                        int var12 = (this.field449 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method123((byte) -95, var10);
                    }
                    this.field230 = false;
                    if (this.field146 == 1) {
                        this.field376 = true;
                    }
                    if (this.field146 == 2) {
                        this.field80 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field449 > 0) {
                    int var13 = this.field380[this.field449 - 1];
                    if (var13 == 263 || var13 == 898 || var13 == 890 || var13 == 139 || var13 == 797 || var13 == 80 || var13 == 331 || var13 == 426 || var13 == 213 || var13 == 245 || var13 == 26 || var13 == 1164) {
                        int var14 = this.field378[this.field449 - 1];
                        int var15 = this.field379[this.field449 - 1];
                        class36 var16 = class36.method350(var15);
                        if (var16.field1118 || var16.field1112) {
                            this.field125 = false;
                            this.field420 = 0;
                            this.field544 = var15;
                            this.field545 = var14;
                            this.field546 = 2;
                            this.field547 = super.field1187;
                            this.field548 = super.field1188;
                            if (class36.method350(var15).field1117 == this.field560) {
                                this.field546 = 1;
                            }
                            if (class36.method350(var15).field1117 == this.field321) {
                                this.field546 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field211 == 1 || this.method105(this.field449 - 1, 22)) && this.field449 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field449 > 0) {
                    this.method123((byte) -95, this.field449 - 1);
                }
                if (var2 != 2 || this.field449 <= 0) {
                    return;
                }
                this.method57(0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method174(int arg0) {
        Graphics var2 = this.method135((byte) 1).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        if (arg0 >= 0) {
            this.field507 = -1;
        }
        this.method356(1, true);
        if (this.field426) {
            this.field139 = false;
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
        if (this.field216) {
            this.field139 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field530) {
            this.field139 = false;
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

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
    public final void method175(int arg0, boolean arg1) {
        this.method62((byte) 4);
        this.field409.method205(0);
        if (arg0 != 9542) {
            this.method176();
        }
        this.field348.method463(-40219, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field570 == 0) {
            int var5 = var4 / 2 + 80;
            this.field494.method503(this.field215.field46, 7711145, var3 / 2, 1, var5, true);
            int var6 = var4 / 2 - 20;
            this.field496.method503("Welcome to RuneScape", 16776960, var3 / 2, 1, var6, true);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field349.method463(-40219, var8 - 20, var7 - 73);
            this.field496.method503("New User", 16777215, var7, 1, var8 + 5, true);
            int var9 = var3 / 2 + 80;
            this.field349.method463(-40219, var8 - 20, var9 - 73);
            this.field496.method503("Existing User", 16777215, var9, 1, var8 + 5, true);
        }
        if (this.field570 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field291.length() > 0) {
                this.field496.method503(this.field291, 16776960, var3 / 2, 1, var10 - 15, true);
                this.field496.method503(this.field292, 16776960, var3 / 2, 1, var10, true);
                var10 += 30;
            } else {
                this.field496.method503(this.field292, 16776960, var3 / 2, 1, var10 - 7, true);
                var10 += 30;
            }
            this.field496.method510("Username: " + this.field447 + (this.field163 == 0 & field343 % 40 < 20 ? "@yel@|" : ""), true, var3 / 2 - 90, 16777215, var10, 441);
            var10 += 15;
            this.field496.method510("Password: " + class50.method457(this.field448, -812) + (this.field163 == 1 & field343 % 40 < 20 ? "@yel@|" : ""), true, var3 / 2 - 88, 16777215, var10, 441);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field349.method463(-40219, var12 - 20, var11 - 73);
                this.field496.method503("Login", 16777215, var11, 1, var12 + 5, true);
                int var13 = var3 / 2 + 80;
                this.field349.method463(-40219, var12 - 20, var13 - 73);
                this.field496.method503("Cancel", 16777215, var13, 1, var12 + 5, true);
            }
        }
        if (this.field570 == 3) {
            this.field496.method503("Create a free account", 16776960, var3 / 2, 1, var4 / 2 - 60, true);
            int var14 = var4 / 2 - 35;
            this.field496.method503("To create a new account you need to", 16777215, var3 / 2, 1, var14, true);
            int var18 = var14 + 15;
            this.field496.method503("go back to the main RuneScape webpage", 16777215, var3 / 2, 1, var18, true);
            int var19 = var18 + 15;
            this.field496.method503("and choose the 'create account'", 16777215, var3 / 2, 1, var19, true);
            int var20 = var19 + 15;
            this.field496.method503("button near the top of that page.", 16777215, var3 / 2, 1, var20, true);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field349.method463(-40219, var16 - 20, var15 - 73);
            this.field496.method503("Cancel", 16777215, var15, 1, var16 + 5, true);
        }
        this.field409.method206(202, super.field1172, 9, 171);
        if (this.field396) {
            this.field396 = false;
            this.field407.method206(128, super.field1172, 9, 0);
            this.field408.method206(202, super.field1172, 9, 371);
            this.field412.method206(0, super.field1172, 9, 265);
            this.field413.method206(562, super.field1172, 9, 265);
            this.field414.method206(128, super.field1172, 9, 171);
            this.field415.method206(562, super.field1172, 9, 171);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method176() {
        this.method125("Starting up", 20, (byte) 6);
        if (signlink.sunjava) {
            super.field1166 = 5;
        }
        if (field403) {
            this.field530 = true;
        } else {
            field403 = true;
            boolean var1 = false;
            String var2 = this.method91(5);
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
            if (var2.endsWith("192.168.1.221")) {
                var1 = true;
            }
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field216 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field235[var3] = new class3(600000, signlink.cache_dat, var3 + 1, signlink.cache_idx[var3], true);
                    }
                }
                try {
                    this.method148(-800);
                    this.field357 = this.method120("title", this.field432[1], true, 25, 1, "title screen");
                    this.field494 = new class60(false, this.field357, false, "p11_full");
                    this.field495 = new class60(false, this.field357, false, "p12_full");
                    this.field496 = new class60(false, this.field357, false, "b12_full");
                    this.field497 = new class60(true, this.field357, false, "q8_full");
                    this.method169(true);
                    this.method106(-88);
                    class2 var4 = this.method120("config", this.field432[2], true, 30, 2, "config");
                    class2 var5 = this.method120("interface", this.field432[3], true, 35, 3, "interface");
                    class2 var6 = this.method120("media", this.field432[4], true, 40, 4, "2d graphics");
                    class2 var7 = this.method120("textures", this.field432[6], true, 45, 6, "textures");
                    class2 var8 = this.method120("wordenc", this.field432[7], true, 50, 7, "chat system");
                    class2 var9 = this.method120("sounds", this.field432[8], true, 55, 8, "sound effects");
                    this.field226 = new byte[4][104][104];
                    this.field424 = new int[4][105][105];
                    this.field277 = new class46(104, 104, 834, this.field424, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field85[var10] = new class1(646, 104, 104);
                    }
                    this.field318 = new class21(512, 512);
                    class2 var11 = this.method120("versionlist", this.field432[5], true, 60, 5, "update list");
                    this.method125("Connecting to update server", 60, (byte) 6);
                    this.field215 = new class4();
                    this.field215.method36(var11, this);
                    class42.method378(this.field215.method31(true));
                    class29.method297(this.field215.method27(-792, 0), this.field215);
                    if (!field553) {
                        this.field522 = 0;
                        this.field523 = true;
                        this.field215.method40(2, this.field522);
                        while (this.field215.method29() > 0) {
                            this.method59(-7744);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                            if (this.field215.field56 > 3) {
                                this.method159("ondemand");
                                return;
                            }
                        }
                    }
                    this.method125("Requesting animations", 65, (byte) 6);
                    int var12 = this.field215.method27(-792, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field215.method40(1, var13);
                    }
                    while (this.field215.method29() > 0) {
                        int var14 = var12 - this.field215.method29();
                        if (var14 > 0) {
                            this.method125("Loading animations - " + var14 * 100 / var12 + "%", 65, (byte) 6);
                        }
                        this.method59(-7744);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                        if (this.field215.field56 > 3) {
                            this.method159("ondemand");
                            return;
                        }
                    }
                    this.method125("Requesting models", 70, (byte) 6);
                    int var15 = this.field215.method27(-792, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field215.method35(var16, (byte) -6);
                        if ((var17 & 1) != 0) {
                            this.field215.method40(0, var16);
                        }
                    }
                    int var18 = this.field215.method29();
                    while (this.field215.method29() > 0) {
                        int var19 = var18 - this.field215.method29();
                        if (var19 > 0) {
                            this.method125("Loading models - " + var19 * 100 / var18 + "%", 70, (byte) 6);
                        }
                        this.method59(-7744);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field235[0] != null) {
                        this.method125("Requesting maps", 75, (byte) 6);
                        this.field215.method40(3, this.field215.method28(0, 47, 48, 1));
                        this.field215.method40(3, this.field215.method28(1, 47, 48, 1));
                        this.field215.method40(3, this.field215.method28(0, 48, 48, 1));
                        this.field215.method40(3, this.field215.method28(1, 48, 48, 1));
                        this.field215.method40(3, this.field215.method28(0, 49, 48, 1));
                        this.field215.method40(3, this.field215.method28(1, 49, 48, 1));
                        this.field215.method40(3, this.field215.method28(0, 47, 47, 1));
                        this.field215.method40(3, this.field215.method28(1, 47, 47, 1));
                        this.field215.method40(3, this.field215.method28(0, 48, 47, 1));
                        this.field215.method40(3, this.field215.method28(1, 48, 47, 1));
                        this.field215.method40(3, this.field215.method28(0, 48, 148, 1));
                        this.field215.method40(3, this.field215.method28(1, 48, 148, 1));
                        int var20 = this.field215.method29();
                        while (this.field215.method29() > 0) {
                            int var21 = var20 - this.field215.method29();
                            if (var21 > 0) {
                                this.method125("Loading maps - " + var21 * 100 / var20 + "%", 75, (byte) 6);
                            }
                            this.method59(-7744);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var22 = this.field215.method27(-792, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field215.method35(var23, (byte) -6);
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
                            this.field215.method23(var23, var25, 46267, 0);
                        }
                    }
                    this.field215.method34(false, field552);
                    if (!field553) {
                        int var26 = this.field215.method27(-792, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field215.method20(var27, 0)) {
                                this.field215.method23(var27, (byte) 1, 46267, 2);
                            }
                        }
                    }
                    int var28 = this.field215.method27(-792, 0);
                    for (int var29 = 0; var29 < var28; ++var29) {
                        int var30 = this.field215.method35(var29, (byte) -6);
                        if (var30 == 0 && this.field215.field59 < 200) {
                            this.field215.method23(var29, (byte) 1, 46267, 0);
                        }
                    }
                    this.method125("Unpacking media", 80, (byte) 6);
                    this.field489 = new class52(var6, "invback", 0);
                    this.field491 = new class52(var6, "chatback", 0);
                    this.field490 = new class52(var6, "mapback", 0);
                    this.field115 = new class52(var6, "backbase1", 0);
                    this.field116 = new class52(var6, "backbase2", 0);
                    this.field117 = new class52(var6, "backhmid1", 0);
                    for (int var31 = 0; var31 < 13; ++var31) {
                        this.field199[var31] = new class52(var6, "sideicons", var31);
                    }
                    this.field173 = new class21(var6, "compass", 0);
                    this.field145 = new class21(var6, "mapedge", 0);
                    this.field145.method217(true);
                    for (int var32 = 0; var32 < 72; ++var32) {
                        this.field237[var32] = new class52(var6, "mapscene", var32);
                    }
                    for (int var33 = 0; var33 < 70; ++var33) {
                        this.field558[var33] = new class21(var6, "mapfunction", var33);
                    }
                    for (int var34 = 0; var34 < 5; ++var34) {
                        this.field102[var34] = new class21(var6, "hitmarks", var34);
                    }
                    for (int var35 = 0; var35 < 6; ++var35) {
                        this.field404[var35] = new class21(var6, "headicons_pk", var35);
                    }
                    for (int var36 = 0; var36 < 9; ++var36) {
                        this.field210[var36] = new class21(var6, "headicons_prayer", var36);
                    }
                    for (int var37 = 0; var37 < 6; ++var37) {
                        this.field282[var37] = new class21(var6, "headicons_hint", var37);
                    }
                    this.field364 = new class21(var6, "overlay_multiway", 0);
                    this.field556 = new class21(var6, "mapmarker", 0);
                    this.field557 = new class21(var6, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field109[var38] = new class21(var6, "cross", var38);
                    }
                    this.field470 = new class21(var6, "mapdots", 0);
                    this.field471 = new class21(var6, "mapdots", 1);
                    this.field472 = new class21(var6, "mapdots", 2);
                    this.field473 = new class21(var6, "mapdots", 3);
                    this.field474 = new class21(var6, "mapdots", 4);
                    this.field353 = new class52(var6, "scrollbar", 0);
                    this.field354 = new class52(var6, "scrollbar", 1);
                    this.field239 = new class52(var6, "redstone1", 0);
                    this.field240 = new class52(var6, "redstone2", 0);
                    this.field241 = new class52(var6, "redstone3", 0);
                    this.field242 = new class52(var6, "redstone1", 0);
                    this.field242.method460(true);
                    this.field243 = new class52(var6, "redstone2", 0);
                    this.field243.method460(true);
                    this.field465 = new class52(var6, "redstone1", 0);
                    this.field465.method461(false);
                    this.field466 = new class52(var6, "redstone2", 0);
                    this.field466.method461(false);
                    this.field467 = new class52(var6, "redstone3", 0);
                    this.field467.method461(false);
                    this.field468 = new class52(var6, "redstone1", 0);
                    this.field468.method460(true);
                    this.field468.method461(false);
                    this.field469 = new class52(var6, "redstone2", 0);
                    this.field469.method460(true);
                    this.field469.method461(false);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field347[var39] = new class52(var6, "mod_icons", var39);
                    }
                    class21 var40 = new class21(var6, "backleft1", 0);
                    this.field452 = new class11(field169, var40.field779, var40.field778, this.method135((byte) 1));
                    var40.method218(0, false, 0);
                    class21 var41 = new class21(var6, "backleft2", 0);
                    this.field453 = new class11(field169, var41.field779, var41.field778, this.method135((byte) 1));
                    var41.method218(0, false, 0);
                    class21 var42 = new class21(var6, "backright1", 0);
                    this.field454 = new class11(field169, var42.field779, var42.field778, this.method135((byte) 1));
                    var42.method218(0, false, 0);
                    class21 var43 = new class21(var6, "backright2", 0);
                    this.field455 = new class11(field169, var43.field779, var43.field778, this.method135((byte) 1));
                    var43.method218(0, false, 0);
                    class21 var44 = new class21(var6, "backtop1", 0);
                    this.field456 = new class11(field169, var44.field779, var44.field778, this.method135((byte) 1));
                    var44.method218(0, false, 0);
                    class21 var45 = new class21(var6, "backvmid1", 0);
                    this.field457 = new class11(field169, var45.field779, var45.field778, this.method135((byte) 1));
                    var45.method218(0, false, 0);
                    class21 var46 = new class21(var6, "backvmid2", 0);
                    this.field458 = new class11(field169, var46.field779, var46.field778, this.method135((byte) 1));
                    var46.method218(0, false, 0);
                    class21 var47 = new class21(var6, "backvmid3", 0);
                    this.field459 = new class11(field169, var47.field779, var47.field778, this.method135((byte) 1));
                    var47.method218(0, false, 0);
                    class21 var48 = new class21(var6, "backhmid2", 0);
                    this.field460 = new class11(field169, var48.field779, var48.field778, this.method135((byte) 1));
                    var48.method218(0, false, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 100; ++var53) {
                        if (this.field558[var53] != null) {
                            this.field558[var53].method216(var49 + var52, var50 + var52, var51 + var52, field402);
                        }
                        if (this.field237[var53] != null) {
                            this.field237[var53].method462(var49 + var52, var50 + var52, var51 + var52, field402);
                        }
                    }
                    this.method125("Unpacking textures", 83, (byte) 6);
                    class70.method590((byte) -70, var7);
                    class70.method594((byte) 108, 0.8D);
                    class70.method589(true, 20);
                    this.method125("Unpacking config", 86, (byte) 6);
                    class65.method531(var4, 0);
                    class35.method339(var4);
                    class67.method572(var4, 0);
                    class27.method288(var4);
                    class39.method365(var4);
                    class63.method525(var4, 0);
                    class12.method208(var4, 0);
                    class58.method499(var4, 0);
                    class13.method211(var4, 0);
                    class27.field860 = field552;
                    if (!field553) {
                        this.method125("Unpacking sounds", 90, (byte) 6);
                        byte[] var54 = var9.method14("sounds.dat", (byte[]) null);
                        class25 var55 = new class25(var54, 713);
                        class49.method446(var55, 0);
                    }
                    this.method125("Unpacking interfaces", 95, (byte) 6);
                    class60[] var56 = new class60[] { this.field494, this.field495, this.field496, this.field497 };
                    class36.method351(9, var56, var5, var6);
                    this.method125("Preparing game engine", 100, (byte) 6);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field490.field1449[this.field490.field1451 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field175[var57] = var58;
                        this.field322[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field490.field1449[this.field490.field1451 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field219[var61 - 5] = var62 - 25;
                        this.field338[var61 - 5] = var63 - var62;
                    }
                    class70.method587(765, 4, 503);
                    this.field265 = class70.field1713;
                    class70.method587(479, 4, 96);
                    this.field262 = class70.field1713;
                    class70.method587(190, 4, 261);
                    this.field263 = class70.field1713;
                    class70.method587(512, 4, 334);
                    this.field264 = class70.field1713;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = class70.field1711[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    class46.method423(512, 334, var65, 178, 800, 500);
                    class66.method534(var8);
                    this.field524 = new class34(true, this);
                    this.method90(this.field524, 10);
                    class68.field1679 = this;
                    class35.field1076 = this;
                    class39.field1237 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field231 + " " + this.field345);
                    this.field426 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBIIII)V")
    private final void method177(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        class30 var11 = null;
        class30 var12 = (class30) this.field539.method580();
        if (arg5 != 73) {
            this.field203 = this.field176.method230();
        }
        while (var12 != null) {
            if (var12.field996 == arg7 && var12.field998 == arg0 && var12.field999 == arg2 && var12.field997 == arg3) {
                var11 = var12;
                break;
            }
            var12 = (class30) this.field539.method582((byte) 6);
        }
        if (var11 == null) {
            var11 = new class30();
            var11.field996 = arg7;
            var11.field997 = arg3;
            var11.field998 = arg0;
            var11.field999 = arg2;
            this.method162(var11, 0);
            this.field539.method577(var11);
        }
        var11.field988 = arg9;
        var11.field990 = arg1;
        var11.field989 = arg4;
        var11.field995 = arg6;
        var11.field994 = arg8;
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)Z")
    public final boolean method178(int arg0) {
        if (arg0 != 1172) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method179(int arg0, int arg1, int arg2) {
        while (arg0 >= 0) {
            field520 = -329;
        }
        int var3 = arg1 - arg2;
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
        } else if (var3 > 0) {
            return "@gr1@";
        } else {
            return "@yel@";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method180(String arg0, boolean arg1) {
        if (arg1) {
            this.field193 = null;
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field566; ++var3) {
                if (arg0.equalsIgnoreCase(this.field228[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field559.field1594);
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
    public final void method181(byte arg0, int arg1) {
        if (arg0 != 6) {
            this.field363 = this.field176.method230();
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BLMIIVNBFU;)Z")
    public final boolean method182(byte arg0, class36 arg1) {
        int var3 = arg1.field1146;
        if (arg0 != 56) {
            this.field172 = 6;
        }
        if (this.field567 == 2) {
            if (var3 == 201) {
                this.field80 = true;
                this.field229 = 0;
                this.field161 = true;
                this.field492 = "";
                this.field302 = 1;
                this.field438 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field80 = true;
                this.field229 = 0;
                this.field161 = true;
                this.field492 = "";
                this.field302 = 2;
                this.field438 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field510 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field80 = true;
                this.field229 = 0;
                this.field161 = true;
                this.field492 = "";
                this.field302 = 4;
                this.field438 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field80 = true;
                this.field229 = 0;
                this.field161 = true;
                this.field492 = "";
                this.field302 = 5;
                this.field438 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field74[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class63.field1612 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class63.field1612) {
                                var6 = 0;
                            }
                        }
                        if (!class63.field1613[var6].field1619 && class63.field1613[var6].field1614 == var4 + (this.field362 ? 0 : 7)) {
                            this.field74[var4] = var6;
                            this.field124 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field429[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field188[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field188[var7].length) {
                        var9 = 0;
                    }
                }
                this.field429[var7] = var9;
                this.field124 = true;
            }
            if (var3 == 324 && !this.field362) {
                this.field362 = true;
                this.method116(535);
            }
            if (var3 == 325 && this.field362) {
                this.field362 = false;
                this.method116(535);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field479 = !this.field479;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method131(35004);
                    if (this.field359.length() > 0) {
                        this.field77.method234(-281, 158);
                        this.field77.method241(class50.method452(this.field359), -45352);
                        this.field77.method235(var3 - 601);
                        this.field77.method235(this.field479 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field77.method234(-281, 225);
                this.field77.method235(this.field362 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field77.method235(this.field74[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field77.method235(this.field429[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void method183(boolean arg0) {
        if (this.field510 > 0) {
            this.method103(true);
        } else {
            this.method104("Connection lost", 8389, "Please wait - attempting to reestablish");
            this.field515 = 0;
            this.field316 = 0;
            if (arg0) {
                this.field193 = null;
            }
            class7 var2 = this.field164;
            this.field335 = false;
            this.field89 = 0;
            this.method61(this.field447, this.field448, true);
            if (!this.field335) {
                this.method103(true);
            }
            try {
                var2.method194();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method184(int arg0) {
        if (arg0 >= 0) {
            field402 = this.field176.method230();
        }
        if (this.field515 == 0) {
            if (super.field1186 == 1) {
                int var2 = super.field1187 - 25 - 550;
                int var3 = super.field1188 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field95 + this.field564 & 2047;
                    int var5 = class70.field1711[var4];
                    int var6 = class70.field1712[var4];
                    int var7 = (this.field222 + 256) * var5 >> 8;
                    int var8 = (this.field222 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field559.field620 + var9 >> 7;
                    int var12 = field559.field621 - var10 >> 7;
                    boolean var13 = this.method60(var12, 1, true, 0, field559.field609[0], 0, this.field209, 0, 0, var11, field559.field610[0], 0);
                    if (var13) {
                        this.field77.method235(var2);
                        this.field77.method235(var3);
                        this.field77.method236(this.field95);
                        this.field77.method235(57);
                        this.field77.method235(this.field564);
                        this.field77.method235(this.field222);
                        this.field77.method235(89);
                        this.field77.method236(field559.field620);
                        this.field77.method236(field559.field621);
                        this.field77.method235(this.field511);
                        this.field77.method235(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method185(int arg0) {
        if (this.field107 == null) {
            this.method124(0);
            super.field1173 = null;
            this.field407 = null;
            this.field408 = null;
            this.field409 = null;
            this.field410 = null;
            if (arg0 != 2756) {
                this.field193 = null;
            }
            this.field411 = null;
            this.field412 = null;
            this.field413 = null;
            this.field414 = null;
            this.field415 = null;
            this.field107 = new class11(field169, 96, 479, this.method135((byte) 1));
            this.field105 = new class11(field169, 156, 172, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field490.method463(-40219, 0, 0);
            this.field104 = new class11(field169, 261, 190, this.method135((byte) 1));
            this.field106 = new class11(field169, 334, 512, this.method135((byte) 1));
            class57.method490(this.field315);
            this.field274 = new class11(field169, 50, 496, this.method135((byte) 1));
            this.field275 = new class11(field169, 37, 269, this.method135((byte) 1));
            this.field276 = new class11(field169, 45, 249, this.method135((byte) 1));
            this.field396 = true;
            this.field106.method205(0);
            class70.field1713 = this.field264;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method186(int arg0) {
        this.field396 = true;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method187(int arg0) {
        if (arg0 != 7) {
            this.field77.method235(83);
        }
        for (int var2 = 0; var2 < this.field480; ++var2) {
            if (this.field327[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field295[var2] == this.field144 && this.field93[var2] == this.field487) {
                        if (!this.method178(1172)) {
                            var3 = true;
                        }
                    } else {
                        class25 var4 = class49.method447(this.field93[var2], 0, this.field295[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field837 / 22) > (long) (this.field194 / 22) + this.field238) {
                            this.field194 = var4.field837;
                            this.field238 = System.currentTimeMillis();
                            if (this.method192(var4.field836, var4.field837, -66)) {
                                this.field144 = this.field295[var2];
                                this.field487 = this.field93[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field77.method234(-281, 199);
                        this.field77.method236(this.field295[var2] & 32767);
                    } else {
                        this.field77.method234(-281, 199);
                        this.field77.method236(-1);
                    }
                }
                if (var3 && this.field327[var2] != -5) {
                    this.field327[var2] = -5;
                } else {
                    --this.field480;
                    for (int var6 = var2; var6 < this.field480; ++var6) {
                        this.field295[var6] = this.field295[var6 + 1];
                        this.field93[var6] = this.field93[var6 + 1];
                        this.field327[var6] = this.field327[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field327[var2]--;
            }
        }
        if (this.field196 > 0) {
            this.field196 -= 20;
            if (this.field196 < 0) {
                this.field196 = 0;
            }
            if (this.field196 == 0 && this.field111 && !field553) {
                this.field522 = this.field180;
                this.field523 = true;
                this.field215.method40(2, this.field522);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method188(boolean arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            String[] var4 = new String[100];
            int var5 = 0;
            if (arg0) {
                this.field507 = -1;
            }
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field157 = 0;
                    label49: for (int var9 = 0; var9 < class27.field864; ++var9) {
                        class27 var10 = class27.method285(var9);
                        if (var10.field904 == -1 && var10.field894 != null) {
                            String var11 = var10.field894.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label49;
                                }
                            }
                            this.field158[this.field157] = var11;
                            this.field159[this.field157] = var9;
                            ++this.field157;
                            if (this.field157 >= this.field158.length) {
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
            this.field157 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method189(int arg0) {
        if (this.field88 != 0) {
            int var2 = 0;
            int var3 = 90 / arg0;
            if (this.field113 != 0) {
                var2 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field394[var4] != null) {
                    int var5 = this.field392[var4];
                    String var6 = this.field393[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field423 == 0 || this.field423 == 1 && this.method180(var6, false))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field1180 > 4 && super.field1181 - 4 > var10 - 10 && super.field1181 - 4 <= var10 + 3) {
                            int var11 = this.field495.method504("From:  " + var6 + this.field394[var4], -665) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field1180 < var11 + 4) {
                                if (this.field236 >= 1) {
                                    this.field542[this.field449] = "Report abuse @whi@" + var6;
                                    this.field380[this.field449] = 2702;
                                    ++this.field449;
                                }
                                this.field542[this.field449] = "Add ignore @whi@" + var6;
                                this.field380[this.field449] = 2038;
                                ++this.field449;
                                this.field542[this.field449] = "Add friend @whi@" + var6;
                                this.field380[this.field449] = 2294;
                                ++this.field449;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field423 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1175 != null) {
                    return new URL("http://127.0.0.1:" + (field551 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    public final void method190(int arg0) {
        if (arg0 >= 0) {
            this.field507 = this.field283.method245();
        }
        if (super.field1186 == 1) {
            if (super.field1187 >= 6 && super.field1187 <= 106 && super.field1188 >= 467 && super.field1188 <= 499) {
                this.field352 = (this.field352 + 1) % 4;
                this.field182 = true;
                this.field80 = true;
                this.field77.method234(-281, 222);
                this.field77.method235(this.field352);
                this.field77.method235(this.field423);
                this.field77.method235(this.field326);
            }
            if (super.field1187 >= 135 && super.field1187 <= 235 && super.field1188 >= 467 && super.field1188 <= 499) {
                this.field423 = (this.field423 + 1) % 3;
                this.field182 = true;
                this.field80 = true;
                this.field77.method234(-281, 222);
                this.field77.method235(this.field352);
                this.field77.method235(this.field423);
                this.field77.method235(this.field326);
            }
            if (super.field1187 >= 273 && super.field1187 <= 373 && super.field1188 >= 467 && super.field1188 <= 499) {
                this.field326 = (this.field326 + 1) % 3;
                this.field182 = true;
                this.field80 = true;
                this.field77.method234(-281, 222);
                this.field77.method235(this.field352);
                this.field77.method235(this.field423);
                this.field77.method235(this.field326);
            }
            if (super.field1187 >= 412 && super.field1187 <= 512 && super.field1188 >= 467 && super.field1188 <= 499) {
                if (this.field560 == -1) {
                    this.method131(35004);
                    this.field359 = "";
                    this.field479 = false;
                    this.field332 = this.field560 = class36.field1123;
                } else {
                    this.method160(-232, 0, "Please close the interface you have open before using 'report abuse'", "");
                }
            }
            ++field103;
            if (field103 > 1392) {
                field103 = 0;
                this.field77.method234(-281, 92);
                this.field77.method235(0);
                int var2 = this.field77.field837;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method236(22162);
                }
                this.field77.method235(6);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method236(23692);
                }
                this.field77.method236(43388);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method235(88);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method235(231);
                }
                this.field77.method236((int) (Math.random() * 65536.0D));
                this.field77.method235(152);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field77.method236(14937);
                }
                this.field77.method236(64269);
                this.field77.method244(0, this.field77.field837 - var2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIUVBENCV;IB)V")
    private final void method191(class25 arg0, int arg1, byte arg2) {
        if (arg2 != 7) {
            this.field507 = -1;
        }
        this.field72 = 0;
        this.field308 = 0;
        this.method93(arg1, -227, arg0);
        this.method88(arg1, arg0, 869);
        this.method107(arg1, arg0, 601);
        this.method151(arg0, arg1, 940);
        for (int var4 = 0; var4 < this.field72; ++var4) {
            int var6 = this.field73[var4];
            if (field343 != this.field305[var6].field640) {
                this.field305[var6] = null;
            }
        }
        if (arg0.field837 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field837 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field306; ++var5) {
                if (this.field305[this.field307[var5]] == null) {
                    signlink.reporterror(this.field447 + " null entry in pl list - pos:" + var5 + " size:" + this.field306);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
    public final boolean method192(byte[] arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            this.field340 = this.field176.method230();
        }
        if (arg0 == null) {
            return true;
        } else {
            return signlink.wavesave(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method193(boolean arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (!arg0) {
            throw new NullPointerException();
        } else {
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

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field138[var1] = var0 / 4;
        }
        field169 = 26;
        field188 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field192 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field279 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field341 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field341[var3] = var2 - 1;
            var2 += var2;
        }
        field355 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field402 = -81;
        field520 = 45;
        field550 = 10;
        field552 = true;
    }
}
