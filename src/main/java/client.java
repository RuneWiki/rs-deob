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
public class client extends class3 {

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    private int field218 = -1;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[J")
    private long[] field220 = new long[200];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "[[I")
    private int[][] field223 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[[[I")
    private int[][][] field228 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    private int field229 = -1;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "LWBEWPIXO;")
    private class58 field230 = class58.method503(1, 8);

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
    private boolean field232 = false;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    private int field233 = -18411;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private final int field241 = 100;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    private int[] field242 = new int[100];

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
    private int[] field244 = new int[class62.field1648];

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    private int[] field246 = new int[151];

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field251 = 7759444;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    private boolean field252 = false;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "B")
    private byte field255 = 55;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
    private int[] field256 = new int[200];

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
    private boolean field258 = true;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
    private boolean field261 = false;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/lang/String;")
    private String field268 = "";

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "[Ljava/lang/String;")
    private String[] field270 = new String[100];

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
    private int[] field271 = new int[100];

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
    private boolean field273 = false;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
    private final int[] field274 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "Z")
    private volatile boolean field283 = false;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private int field284 = 3;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field286 = -1;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
    private int[] field288 = new int[500];

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "[I")
    private int[] field289 = new int[500];

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
    private int[] field290 = new int[500];

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
    private int[] field291 = new int[500];

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
    private int field292 = 1;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "B")
    private byte field294 = -40;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
    private int field298 = 2301979;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field301 = 2;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "[Ljava/lang/String;")
    private String[] field302 = new String[500];

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
    private int field304 = 3353893;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
    private boolean field306 = true;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
    private boolean field307 = true;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "Z")
    private boolean field308 = true;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field309 = new CRC32();

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int field310 = -1;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
    private int field311 = -817;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int field312 = -1;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private int field314 = -1;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "Z")
    private boolean field315 = true;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "[LOSRLSEOB;")
    private class41[] field316 = new class41[13];

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "Z")
    private boolean field317 = true;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
    private int field319 = -1;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "[LOGPNACTP;")
    private class40[] field323 = new class40[8];

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "B")
    private byte field324 = 7;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
    private int[] field326 = new int[9];

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
    private int[] field328 = new int[7];

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "B")
    private byte field330 = 5;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
    private boolean field334 = false;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "[LBBOYCGQQ;")
    private class5[] field335 = new class5[4];

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "Z")
    private boolean field338 = false;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
    private int[] field339 = new int[2000];

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
    private boolean field349 = false;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "Z")
    private boolean field350 = false;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "B")
    private byte field358 = 8;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
    private boolean field359 = true;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
    private int[] field360 = new int[33];

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
    private int[] field362 = new int[1000];

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
    private int[] field363 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "Z")
    private boolean field369 = false;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
    private boolean field370 = false;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "[LOGPNACTP;")
    private class40[] field371 = new class40[1000];

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "Z")
    private boolean field373 = true;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[[I")
    private int[][] field375 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
    public boolean field380 = true;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "[J")
    private long[] field383 = new long[100];

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "LNYZQPNXB;")
    private class37 field386 = new class37(2);

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field387 = 616;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "[Ljava/lang/String;")
    private String[] field388 = new String[200];

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "Z")
    private boolean field389 = false;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "[LOGPNACTP;")
    private class40[] field392 = new class40[100];

    @OriginalMember(owner = "client!client", name = "de", descriptor = "Z")
    private boolean field393 = false;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int field402 = 3982;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "LWBEWPIXO;")
    private class58 field403 = new class58((byte) -115, new byte[5000]);

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "[LPVFNGMTQ;")
    private class47[] field404 = new class47[16384];

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
    public int[] field406 = new int[16384];

    @OriginalMember(owner = "client!client", name = "re", descriptor = "[[[LNYZQPNXB;")
    private class37[][][] field407 = new class37[4][104][104];

    @OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
    private int[] field408 = new int[50];

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "LMRUJPFPS;")
    private class34 field414 = new class34();

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "Z")
    private boolean field415 = false;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "[Ljava/lang/String;")
    private String[] field419 = new String[5];

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "[Z")
    private boolean[] field420 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "[LOGPNACTP;")
    private class40[] field422 = new class40[32];

    @OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
    private int[] field423 = new int[5];

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field424 = -3338;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "[[I")
    private int[][] field427 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field430 = -1;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "[LOGPNACTP;")
    private class40[] field431 = new class40[32];

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field433 = 1;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "Ljava/lang/String;")
    private String field434 = "";

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "Ljava/lang/String;")
    private String field435 = "";

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "B")
    private byte field436 = -43;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "Z")
    private boolean field437 = false;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field438 = 5;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
    private int field456 = -1;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private int field476 = 2048;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field477 = 2047;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "[LSRMWIYVM;")
    private class53[] field478 = new class53[this.field476];

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
    public int[] field480 = new int[this.field476];

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "[I")
    private int[] field482 = new int[this.field476];

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "[LWBEWPIXO;")
    private class58[] field483 = new class58[this.field476];

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field484 = -1;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "LNYZQPNXB;")
    private class37 field489 = new class37(2);

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private int field490 = -1;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
    private int[] field494 = new int[50];

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field498 = 3;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "Ljava/lang/String;")
    private String field499 = "";

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field500 = 3;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "Ljava/lang/String;")
    private String field501 = "";

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field502 = 8;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "I")
    private int field507 = 5063219;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "[I")
    public int[] field509 = new int[1000];

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "B")
    private byte field510 = 2;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "B")
    private byte field523 = 0;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
    private int[] field529 = new int[151];

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
    private boolean field531 = false;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    private int field533 = -1;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
    private int[] field535 = new int[33];

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
    private int[] field545 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "Ljava/lang/String;")
    private String field555 = "";

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "[LOGPNACTP;")
    private class40[] field560 = new class40[32];

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field561 = 78;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
    private int[] field562 = new int[class62.field1648];

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "Z")
    private boolean field563 = false;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
    private int[] field564 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "Ljava/lang/String;")
    private String field565 = "";

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
    private boolean field571 = false;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "Z")
    private boolean field572 = false;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "Ljava/lang/String;")
    private String field573 = "";

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "Ljava/lang/String;")
    private String field574 = "";

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
    private int field576 = -1;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int field578 = 128;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "B")
    private byte field582 = 19;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "B")
    private byte field583 = 7;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "LWBEWPIXO;")
    private class58 field596 = class58.method503(1, 8);

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
    private int field599 = 1;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
    private volatile boolean field601 = false;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "LNYZQPNXB;")
    private class37 field603 = new class37(2);

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "[LOSRLSEOB;")
    private class41[] field605 = new class41[100];

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "[B")
    private byte[] field606 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "[LOSRLSEOB;")
    private class41[] field609 = new class41[2];

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field613 = 50;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
    private int[] field614 = new int[this.field613];

    @OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
    private int[] field615 = new int[this.field613];

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
    private int[] field616 = new int[this.field613];

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
    private int[] field617 = new int[this.field613];

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
    private int[] field618 = new int[this.field613];

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
    private int[] field619 = new int[this.field613];

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
    private int[] field620 = new int[this.field613];

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "[Ljava/lang/String;")
    private String[] field621 = new String[this.field613];

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
    private int[] field627 = new int[5];

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
    private int field628 = 8;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "B")
    private byte field634 = -82;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "[Z")
    private boolean[] field635 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "Z")
    private boolean field636 = false;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
    private int[] field638 = new int[5];

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "Ljava/lang/String;")
    private String field644 = "";

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private int field648 = -1;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
    private int field649 = -1;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private int field651 = 7;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "[I")
    private int[] field654 = new int[5];

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "[LOGPNACTP;")
    private class40[] field661 = new class40[20];

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field662 = 1000;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field665 = -1;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "Z")
    private boolean field666 = false;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
    public int[] field668 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
    private int field669 = 48;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
    private boolean field670 = false;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private int field672 = 2;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "Z")
    private boolean field673 = true;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    private int field675 = -25;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field676 = 9784;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
    private int[] field678 = new int[256];

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "Z")
    public boolean field680 = false;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "[LJXARNXDE;")
    public class30[] field682 = new class30[5];

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "Z")
    private boolean field686 = false;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "Z")
    private volatile boolean field687 = false;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
    private int[] field689 = new int[class62.field1648];

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "Z")
    private boolean field691 = false;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "[I")
    private int[] field692 = new int[50];

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
    public int[] field693 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "Z")
    private boolean field695 = false;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
    private int[] field696 = new int[5];

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "LWBEWPIXO;")
    private class58 field698 = class58.method503(1, 8);

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "B")
    private byte field701 = 9;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "[I")
    private int[] field703 = new int[4000];

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "[I")
    private int[] field704 = new int[4000];

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private int field706 = 2;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "[I")
    private int[] field707 = new int[100];

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[Ljava/lang/String;")
    private String[] field708 = new String[100];

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "[Ljava/lang/String;")
    private String[] field709 = new String[100];

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field267 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "[I")
    public static int[] field287 = new int[32];

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "Ljava/lang/String;")
    private static String field296;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "B")
    private static byte field321;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field332;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
    private static int[] field376;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "[[I")
    public static final int[][] field377;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private static int field410;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
    private static boolean field412;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
    public static final int[] field528;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private static int field532;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "B")
    private static byte field652;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private static int field240;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private static int field243;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private static int field247;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
    private static int field297;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private static int field305;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private static int field340;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
    private static int field374;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
    private static int field381;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private static int field421;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private static int field448;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private static int field534;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
    private static int field575;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
    private static int field593;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
    private static int field597;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private static int field604;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private static int field637;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
    private static int field646;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field664;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "J")
    private long field325;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "J")
    public long field341;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "J")
    private long field357;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "J")
    private long field645;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "J")
    private long field677;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "LHGHKUVEK;")
    private class26 field439;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "LHGHKUVEK;")
    private class26 field440;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "LHGHKUVEK;")
    private class26 field441;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "LHGHKUVEK;")
    private class26 field514;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "LHGHKUVEK;")
    private class26 field515;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "LHGHKUVEK;")
    private class26 field516;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "LHGHKUVEK;")
    private class26 field517;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "LHGHKUVEK;")
    private class26 field518;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "LHGHKUVEK;")
    private class26 field519;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "LHGHKUVEK;")
    private class26 field520;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "LHGHKUVEK;")
    private class26 field521;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "LHGHKUVEK;")
    private class26 field522;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "LHGHKUVEK;")
    private class26 field556;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "LHGHKUVEK;")
    private class26 field557;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "LHGHKUVEK;")
    private class26 field558;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "LHGHKUVEK;")
    private class26 field559;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "LHGHKUVEK;")
    private class26 field584;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "LHGHKUVEK;")
    private class26 field585;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "LHGHKUVEK;")
    private class26 field586;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "LHGHKUVEK;")
    private class26 field587;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "LHGHKUVEK;")
    private class26 field588;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "LHGHKUVEK;")
    private class26 field589;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "LHGHKUVEK;")
    private class26 field590;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "LHGHKUVEK;")
    private class26 field591;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "LHGHKUVEK;")
    private class26 field592;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "LIBVXWOKK;")
    private class28 field702;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "LKMJQVYHB;")
    private class31 field281;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "LLKPVZAQN;")
    private class33 field595;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "LOGPNACTP;")
    private class40 field275;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "LOGPNACTP;")
    private class40 field276;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "LOGPNACTP;")
    private class40 field322;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "LOGPNACTP;")
    private class40 field425;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "LOGPNACTP;")
    private class40 field426;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "LOGPNACTP;")
    private class40 field491;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "LOGPNACTP;")
    private class40 field492;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "LOGPNACTP;")
    private class40 field513;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "LOGPNACTP;")
    private class40 field554;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "LOGPNACTP;")
    private class40 field655;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "LOGPNACTP;")
    private class40 field656;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "LOGPNACTP;")
    private class40 field657;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "LOGPNACTP;")
    private class40 field658;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "LOGPNACTP;")
    private class40 field659;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "LOGPNACTP;")
    private class40 field710;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "LOSRLSEOB;")
    private class41 field336;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "LOSRLSEOB;")
    private class41 field337;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "LOSRLSEOB;")
    private class41 field342;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "LOSRLSEOB;")
    private class41 field343;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "LOSRLSEOB;")
    private class41 field344;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "LOSRLSEOB;")
    private class41 field345;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "LOSRLSEOB;")
    private class41 field346;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "LOSRLSEOB;")
    private class41 field473;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "LOSRLSEOB;")
    private class41 field474;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "LOSRLSEOB;")
    private class41 field475;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "LOSRLSEOB;")
    private class41 field546;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "LOSRLSEOB;")
    private class41 field547;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "LOSRLSEOB;")
    private class41 field548;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "LOSRLSEOB;")
    private class41 field549;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "LOSRLSEOB;")
    private class41 field550;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "LOSRLSEOB;")
    private class41 field683;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "LOSRLSEOB;")
    private class41 field684;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "LOSRLSEOB;")
    private class41 field685;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "LOSRLSEOB;")
    private class41 field699;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "LOSRLSEOB;")
    private class41 field700;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "LQPWZYOZR;")
    private class48 field667;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "LQVSTBDDY;")
    public class50 field379;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "LSRMWIYVM;")
    public static class53 field378;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "LXAGUDWSZ;")
    private class61 field688;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "LYCYYIGLM;")
    private class72 field462;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "LYCYYIGLM;")
    private class72 field463;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "LYCYYIGLM;")
    private class72 field464;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "LYCYYIGLM;")
    private class72 field465;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
    private String field226;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "Ljava/lang/String;")
    public String field356;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/lang/String;")
    public String field460;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "Ljava/lang/String;")
    private String field697;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/net/Socket;")
    private Socket field259;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
    private static boolean field413;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
    private static boolean field418;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
    public static boolean field486;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
    public static boolean field496;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "[I")
    private int[] field347;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
    private int[] field348;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
    private int[] field364;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
    private int[] field365;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
    private int[] field366;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
    private int[] field367;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
    private int[] field399;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
    private int[] field400;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
    private int[] field401;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
    private int[] field416;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "[I")
    private int[] field417;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
    private int[] field639;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
    private int[] field640;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
    private int[] field641;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
    private int[] field642;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[LOSRLSEOB;")
    private class41[] field250;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "[[B")
    private byte[][] field293;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "[[B")
    private byte[][] field472;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "[[[B")
    private byte[][][] field331;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "[[[I")
    private int[][][] field282;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method19() {
        this.method26(20, "Starting up", 2);
        if (signlink.sunjava) {
            super.field74 = 5;
        }
        if (field418) {
            this.field563 = true;
        } else {
            field418 = true;
            boolean var1 = false;
            String var2 = this.method111(40981);
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
                this.field670 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field682[var3] = new class30(500000, 0, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
                    }
                }
                try {
                    this.method167(false);
                    this.field595 = this.method75(this.field326[1], 1, (byte) 9, "title screen", 25, "title");
                    this.field462 = new class72(false, this.field595, "p11_full", (byte) 9);
                    this.field463 = new class72(false, this.field595, "p12_full", (byte) 9);
                    this.field464 = new class72(false, this.field595, "b12_full", (byte) 9);
                    this.field465 = new class72(true, this.field595, "q8_full", (byte) 9);
                    this.method119(0);
                    this.method152(38021);
                    class33 var4 = this.method75(this.field326[2], 2, (byte) 9, "config", 30, "config");
                    class33 var5 = this.method75(this.field326[3], 3, (byte) 9, "interface", 35, "interface");
                    class33 var6 = this.method75(this.field326[4], 4, (byte) 9, "2d graphics", 40, "media");
                    class33 var7 = this.method75(this.field326[6], 6, (byte) 9, "textures", 45, "textures");
                    class33 var8 = this.method75(this.field326[7], 7, (byte) 9, "chat system", 50, "wordenc");
                    class33 var9 = this.method75(this.field326[8], 8, (byte) 9, "sound effects", 55, "sounds");
                    this.field331 = new byte[4][104][104];
                    this.field282 = new int[4][105][105];
                    this.field667 = new class48(104, 4, this.field282, 104, -30);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field335[var10] = new class5(104, 104, field321);
                    }
                    this.field513 = new class40(512, 512);
                    class33 var11 = this.method75(this.field326[5], 5, (byte) 9, "update list", 60, "versionlist");
                    this.method26(60, "Connecting to update server", 2);
                    this.field702 = new class28();
                    this.field702.method295(var11, this);
                    class21.method231(this.field702.method281(field532));
                    class19.method196(this.field702.method293((byte) 4, 0), this.field702);
                    if (!field413) {
                        this.field257 = 0;
                        this.field258 = true;
                        this.field702.method292(2, this.field257);
                        while (this.field702.method291() > 0) {
                            this.method54(678);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field702.field1024 > 3) {
                                this.method180("ondemand");
                                return;
                            }
                        }
                    }
                    this.method26(65, "Requesting animations", 2);
                    int var12 = this.field702.method293((byte) 4, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field702.method292(1, var13);
                    }
                    while (this.field702.method291() > 0) {
                        int var14 = var12 - this.field702.method291();
                        if (var14 > 0) {
                            this.method26(65, "Loading animations - " + var14 * 100 / var12 + "%", 2);
                        }
                        this.method54(678);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field702.field1024 > 3) {
                            this.method180("ondemand");
                            return;
                        }
                    }
                    this.method26(70, "Requesting models", 2);
                    int var15 = this.field702.method293((byte) 4, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field702.method287(true, var16);
                        if ((var17 & 1) != 0) {
                            this.field702.method292(0, var16);
                        }
                    }
                    int var18 = this.field702.method291();
                    while (this.field702.method291() > 0) {
                        int var19 = var18 - this.field702.method291();
                        if (var19 > 0) {
                            this.method26(70, "Loading models - " + var19 * 100 / var18 + "%", 2);
                        }
                        this.method54(678);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field682[0] != null) {
                        this.method26(75, "Requesting maps", 2);
                        this.field702.method292(3, this.field702.method277(0, 47, 48, 0));
                        this.field702.method292(3, this.field702.method277(0, 47, 48, 1));
                        this.field702.method292(3, this.field702.method277(0, 48, 48, 0));
                        this.field702.method292(3, this.field702.method277(0, 48, 48, 1));
                        this.field702.method292(3, this.field702.method277(0, 49, 48, 0));
                        this.field702.method292(3, this.field702.method277(0, 49, 48, 1));
                        this.field702.method292(3, this.field702.method277(0, 47, 47, 0));
                        this.field702.method292(3, this.field702.method277(0, 47, 47, 1));
                        this.field702.method292(3, this.field702.method277(0, 48, 47, 0));
                        this.field702.method292(3, this.field702.method277(0, 48, 47, 1));
                        this.field702.method292(3, this.field702.method277(0, 48, 148, 0));
                        this.field702.method292(3, this.field702.method277(0, 48, 148, 1));
                        int var20 = this.field702.method291();
                        while (this.field702.method291() > 0) {
                            int var21 = var20 - this.field702.method291();
                            if (var21 > 0) {
                                this.method26(75, "Loading maps - " + var21 * 100 / var20 + "%", 2);
                            }
                            this.method54(678);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field702.method293((byte) 4, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field702.method287(true, var23);
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
                            this.field702.method284(-424, 0, var23, var25);
                        }
                    }
                    this.field702.method278(-27395, field412);
                    if (!field413) {
                        int var26 = this.field702.method293((byte) 4, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field702.method296(var27, 3)) {
                                this.field702.method284(-424, 2, var27, (byte) 1);
                            }
                        }
                    }
                    this.method26(80, "Unpacking media", 2);
                    this.field473 = new class41(var6, "invback", 0);
                    this.field475 = new class41(var6, "chatback", 0);
                    this.field474 = new class41(var6, "mapback", 0);
                    this.field683 = new class41(var6, "backbase1", 0);
                    this.field684 = new class41(var6, "backbase2", 0);
                    this.field685 = new class41(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field316[var28] = new class41(var6, "sideicons", var28);
                    }
                    this.field554 = new class40(var6, "compass", 0);
                    this.field710 = new class40(var6, "mapedge", 0);
                    this.field710.method353(684);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field605[var29] = new class41(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 70; ++var30) {
                        this.field392[var30] = new class40(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field661[var31] = new class40(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field560[var32] = new class40(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field431[var33] = new class40(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field422[var34] = new class40(var6, "headicons_hint", var34);
                    }
                    this.field322 = new class40(var6, "overlay_multiway", 0);
                    this.field491 = new class40(var6, "mapmarker", 0);
                    this.field492 = new class40(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field323[var35] = new class40(var6, "cross", var35);
                    }
                    this.field655 = new class40(var6, "mapdots", 0);
                    this.field656 = new class40(var6, "mapdots", 1);
                    this.field657 = new class40(var6, "mapdots", 2);
                    this.field658 = new class40(var6, "mapdots", 3);
                    this.field659 = new class40(var6, "mapdots", 4);
                    this.field336 = new class41(var6, "scrollbar", 0);
                    this.field337 = new class41(var6, "scrollbar", 1);
                    this.field546 = new class41(var6, "redstone1", 0);
                    this.field547 = new class41(var6, "redstone2", 0);
                    this.field548 = new class41(var6, "redstone3", 0);
                    this.field549 = new class41(var6, "redstone1", 0);
                    this.field549.method366(0);
                    this.field550 = new class41(var6, "redstone2", 0);
                    this.field550.method366(0);
                    this.field342 = new class41(var6, "redstone1", 0);
                    this.field342.method367(-17803);
                    this.field343 = new class41(var6, "redstone2", 0);
                    this.field343.method367(-17803);
                    this.field344 = new class41(var6, "redstone3", 0);
                    this.field344.method367(-17803);
                    this.field345 = new class41(var6, "redstone1", 0);
                    this.field345.method366(0);
                    this.field345.method367(-17803);
                    this.field346 = new class41(var6, "redstone2", 0);
                    this.field346.method366(0);
                    this.field346.method367(-17803);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field609[var36] = new class41(var6, "mod_icons", var36);
                    }
                    class40 var37 = new class40(var6, "backleft1", 0);
                    this.field514 = new class26((byte) 9, this.method24(731), var37.field1282, var37.field1283);
                    var37.method354(0, 8, 0);
                    class40 var38 = new class40(var6, "backleft2", 0);
                    this.field515 = new class26((byte) 9, this.method24(731), var38.field1282, var38.field1283);
                    var38.method354(0, 8, 0);
                    class40 var39 = new class40(var6, "backright1", 0);
                    this.field516 = new class26((byte) 9, this.method24(731), var39.field1282, var39.field1283);
                    var39.method354(0, 8, 0);
                    class40 var40 = new class40(var6, "backright2", 0);
                    this.field517 = new class26((byte) 9, this.method24(731), var40.field1282, var40.field1283);
                    var40.method354(0, 8, 0);
                    class40 var41 = new class40(var6, "backtop1", 0);
                    this.field518 = new class26((byte) 9, this.method24(731), var41.field1282, var41.field1283);
                    var41.method354(0, 8, 0);
                    class40 var42 = new class40(var6, "backvmid1", 0);
                    this.field519 = new class26((byte) 9, this.method24(731), var42.field1282, var42.field1283);
                    var42.method354(0, 8, 0);
                    class40 var43 = new class40(var6, "backvmid2", 0);
                    this.field520 = new class26((byte) 9, this.method24(731), var43.field1282, var43.field1283);
                    var43.method354(0, 8, 0);
                    class40 var44 = new class40(var6, "backvmid3", 0);
                    this.field521 = new class26((byte) 9, this.method24(731), var44.field1282, var44.field1283);
                    var44.method354(0, 8, 0);
                    class40 var45 = new class40(var6, "backhmid2", 0);
                    this.field522 = new class26((byte) 9, this.method24(731), var45.field1282, var45.field1283);
                    var45.method354(0, 8, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field392[var50] != null) {
                            this.field392[var50].method352(var46 + var49, var48 + var49, (byte) 4, var47 + var49);
                        }
                        if (this.field605[var50] != null) {
                            this.field605[var50].method368(var46 + var49, var48 + var49, (byte) 4, var47 + var49);
                        }
                    }
                    this.method26(83, "Unpacking textures", 2);
                    class45.method377(22016, var7);
                    class45.method381(-942, 0.8D);
                    class45.method376(20, (byte) 121);
                    this.method26(86, "Unpacking config", 2);
                    class66.method566(var4, 713);
                    class22.method236(var4);
                    class49.method450(var4, 713);
                    class1.method8(var4);
                    class46.method394(var4);
                    class20.method225(var4, 713);
                    class63.method561(var4, 713);
                    class64.method564(var4, 713);
                    class55.method495(var4, 713);
                    class1.field47 = field412;
                    if (!field413) {
                        this.method26(90, "Unpacking sounds", 2);
                        byte[] var51 = var9.method323("sounds.dat", (byte[]) null);
                        class58 var52 = new class58((byte) -115, var51);
                        class57.method497(var52, 713);
                    }
                    this.method26(95, "Unpacking interfaces", 2);
                    class72[] var53 = new class72[] { this.field462, this.field463, this.field464, this.field465 };
                    class34.method328(var5, var6, -621, var53);
                    this.method26(100, "Preparing game engine", 2);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field474.field1292[this.field474.field1294 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field360[var54] = var55;
                        this.field535[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field474.field1292[this.field474.field1294 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field246[var58 - 5] = var59 - 25;
                        this.field529[var58 - 5] = var60 - var59;
                    }
                    class45.method374(false, 765, 503);
                    this.field367 = class45.field1356;
                    class45.method374(false, 479, 96);
                    this.field364 = class45.field1356;
                    class45.method374(false, 190, 261);
                    this.field365 = class45.field1356;
                    class45.method374(false, 512, 334);
                    this.field366 = class45.field1356;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class45.field1354[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class48.method435(800, 334, 500, 512, true, var62);
                    class54.method457(var8);
                    this.field379 = new class50(true, this);
                    this.method25(this.field379, 10);
                    class67.field1725 = this;
                    class22.field883 = this;
                    class46.field1391 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field226 + " " + this.field485);
                    this.field369 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIII)V")
    public final void method47(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg4 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = class19.field830[var8];
            int var14 = class19.field831[var8];
            int var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class19.field830[var9];
            int var17 = class19.field831[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field629 = arg6 - var10;
        this.field630 = arg3 - var11;
        if (!arg2) {
            this.field631 = arg0 - var12;
            this.field632 = arg4;
            this.field633 = arg5;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method25(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method25(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILWBEWPIXO;)V")
    private final void method48(byte arg0, int arg1, class58 arg2) {
        if (arg0 != 103) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (arg2.field1616 + 21 < arg1 * 8) {
            int var5 = arg2.method526(true, 14);
            if (var5 == 16383) {
                break;
            }
            if (this.field404[var5] == null) {
                this.field404[var5] = new class47();
            }
            class47 var6 = this.field404[var5];
            this.field406[this.field405++] = var5;
            var6.field181 = field608;
            int var7 = arg2.method526(true, 1);
            int var8 = arg2.method526(true, 1);
            if (var8 == 1) {
                this.field482[this.field481++] = var5;
            }
            int var9 = arg2.method526(true, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg2.method526(true, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.field1410 = class46.method393(arg2.method526(true, 13));
            var6.field173 = var6.field1410.field1390;
            var6.field200 = var6.field1410.field1393;
            var6.field165 = var6.field1410.field1404;
            var6.field166 = var6.field1410.field1371;
            var6.field167 = var6.field1410.field1380;
            var6.field168 = var6.field1410.field1382;
            var6.field215 = var6.field1410.field1398;
            var6.method43(false, var7 == 1, field378.field161[0] + var10, field378.field160[0] + var9);
        }
        arg2.method527((byte) 5);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSRMWIYVM;ZIII)V")
    public final void method49(class53 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.field407 = null;
        }
        if (field378 != arg0) {
            if (this.field694 < 400) {
                String var6;
                if (arg0.field1531 == 0) {
                    var6 = arg0.field1554 + method158(9, field378.field1544, arg0.field1544) + " (level-" + arg0.field1544 + ")";
                } else {
                    var6 = arg0.field1554 + " (skill-" + arg0.field1531 + ")";
                }
                if (this.field352 == 1) {
                    this.field302[this.field694] = "Use " + this.field356 + " with @whi@" + var6;
                    this.field290[this.field694] = 225;
                    this.field291[this.field694] = arg3;
                    this.field288[this.field694] = arg4;
                    this.field289[this.field694] = arg2;
                    ++this.field694;
                } else if (this.field457 == 1) {
                    if ((this.field459 & 8) == 8) {
                        this.field302[this.field694] = this.field460 + " @whi@" + var6;
                        this.field290[this.field694] = 771;
                        this.field291[this.field694] = arg3;
                        this.field288[this.field694] = arg4;
                        this.field289[this.field694] = arg2;
                        ++this.field694;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field419[var7] != null) {
                            this.field302[this.field694] = this.field419[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field419[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field1544 > field378.field1544) {
                                    var9 = 2000;
                                }
                                if (field378.field1556 != 0 && arg0.field1556 != 0) {
                                    if (field378.field1556 == arg0.field1556) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field420[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field290[this.field694] = var9 + 33;
                            }
                            if (var7 == 1) {
                                this.field290[this.field694] = var9 + 805;
                            }
                            if (var7 == 2) {
                                this.field290[this.field694] = var9 + 650;
                            }
                            if (var7 == 3) {
                                this.field290[this.field694] = var9 + 66;
                            }
                            if (var7 == 4) {
                                this.field290[this.field694] = var9 + 328;
                            }
                            this.field291[this.field694] = arg3;
                            this.field288[this.field694] = arg4;
                            this.field289[this.field694] = arg2;
                            ++this.field694;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field694; ++var8) {
                    if (this.field290[var8] == 238) {
                        this.field302[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method50(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field610; ++var4) {
                if (this.field220[var4] == arg1) {
                    --this.field610;
                    this.field350 = true;
                    for (int var5 = var4; var5 < this.field610; ++var5) {
                        this.field388[var5] = this.field388[var5 + 1];
                        this.field256[var5] = this.field256[var5 + 1];
                        this.field220[var5] = this.field220[var5 + 1];
                    }
                    this.field230.method504(161, 1);
                    this.field230.method511(arg1, -845);
                    break;
                }
            }
            int var6 = 65 / arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LWBEWPIXO;II)V")
    private final void method51(class58 arg0, int arg1, int arg2) {
        while (true) {
            if (arg0.field1616 + 10 < arg2 * 8) {
                int var4 = arg0.method526(true, 11);
                if (var4 != 2047) {
                    if (this.field478[var4] == null) {
                        this.field478[var4] = new class53();
                        if (this.field483[var4] != null) {
                            this.field478[var4].method454(this.field502, this.field483[var4]);
                        }
                    }
                    this.field480[this.field479++] = var4;
                    class53 var5 = this.field478[var4];
                    var5.field181 = field608;
                    int var6 = arg0.method526(true, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method526(true, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg0.method526(true, 1);
                    int var9 = arg0.method526(true, 1);
                    if (var9 == 1) {
                        this.field482[this.field481++] = var4;
                    }
                    var5.method43(false, var8 == 1, field378.field161[0] + var7, field378.field160[0] + var6);
                    continue;
                }
            }
            arg0.method527((byte) 5);
            int var10 = 72 / arg1;
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
        if (!arg0) {
            this.field557.method273(1);
            if (this.field449 == 2) {
                byte[] var2 = this.field474.field1292;
                int[] var3 = class32.field1092;
                int var4 = var2.length;
                for (int var5 = 0; var5 < var4; ++var5) {
                    if (var2[var5] == 0) {
                        var3[var5] = 0;
                    }
                }
                this.field554.method360(256, 0, this.field579, 33, 25, this.field360, this.field535, 25, 33, 0, 0);
                this.field558.method273(1);
                class45.field1356 = this.field366;
            } else {
                int var6 = this.field579 + this.field300 & 2047;
                int var7 = field378.field211 / 32 + 48;
                int var8 = 464 - field378.field212 / 32;
                this.field513.method360(this.field598 + 256, 25, var6, 146, var8, this.field246, this.field529, var7, 151, 0, 5);
                this.field554.method360(256, 0, this.field579, 33, 25, this.field360, this.field535, 25, 33, 0, 0);
                for (int var9 = 0; var9 < this.field361; ++var9) {
                    int var39 = this.field362[var9] * 4 + 2 - field378.field211 / 32;
                    int var40 = this.field363[var9] * 4 + 2 - field378.field212 / 32;
                    this.method55(var40, -561, this.field371[var9], var39);
                }
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var35 = 0; var35 < 104; ++var35) {
                        class37 var36 = this.field407[this.field653][var10][var35];
                        if (var36 != null) {
                            int var37 = var10 * 4 + 2 - field378.field211 / 32;
                            int var38 = var35 * 4 + 2 - field378.field212 / 32;
                            this.method55(var38, -561, this.field655, var37);
                        }
                    }
                }
                for (int var11 = 0; var11 < this.field405; ++var11) {
                    class47 var31 = this.field404[this.field406[var11]];
                    if (var31 != null && var31.method42(5)) {
                        class46 var32 = var31.field1410;
                        if (var32.field1389 != null) {
                            var32 = var32.method392(true);
                        }
                        if (var32 != null && var32.field1403 && var32.field1373) {
                            int var33 = var31.field211 / 32 - field378.field211 / 32;
                            int var34 = var31.field212 / 32 - field378.field212 / 32;
                            this.method55(var34, -561, this.field656, var33);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field479; ++var12) {
                    class53 var23 = this.field478[this.field480[var12]];
                    if (var23 != null && var23.method42(5)) {
                        int var24 = var23.field211 / 32 - field378.field211 / 32;
                        int var25 = var23.field212 / 32 - field378.field212 / 32;
                        boolean var26 = false;
                        long var27 = class69.method578(var23.field1554);
                        for (int var29 = 0; var29 < this.field610; ++var29) {
                            if (this.field220[var29] == var27 && this.field256[var29] != 0) {
                                var26 = true;
                                break;
                            }
                        }
                        boolean var30 = false;
                        if (field378.field1556 != 0 && var23.field1556 != 0 && field378.field1556 == var23.field1556) {
                            var30 = true;
                        }
                        if (var26) {
                            this.method55(var25, -561, this.field658, var24);
                        } else if (var30) {
                            this.method55(var25, -561, this.field659, var24);
                        } else {
                            this.method55(var25, -561, this.field657, var24);
                        }
                    }
                }
                if (this.field461 != 0 && field608 % 20 < 10) {
                    if (this.field461 == 1 && this.field466 >= 0 && this.field466 < this.field404.length) {
                        class47 var13 = this.field404[this.field466];
                        if (var13 != null) {
                            int var14 = var13.field211 / 32 - field378.field211 / 32;
                            int var15 = var13.field212 / 32 - field378.field212 / 32;
                            this.method79(var14, this.field492, var15, 473);
                        }
                    }
                    if (this.field461 == 2) {
                        int var16 = (this.field262 - this.field541) * 4 + 2 - field378.field211 / 32;
                        int var17 = (this.field263 - this.field542) * 4 + 2 - field378.field212 / 32;
                        this.method79(var16, this.field492, var17, 473);
                    }
                    if (this.field461 == 10 && this.field384 >= 0 && this.field384 < this.field478.length) {
                        class53 var18 = this.field478[this.field384];
                        if (var18 != null) {
                            int var19 = var18.field211 / 32 - field378.field211 / 32;
                            int var20 = var18.field212 / 32 - field378.field212 / 32;
                            this.method79(var19, this.field492, var20, 473);
                        }
                    }
                }
                if (this.field511 != 0) {
                    int var21 = this.field511 * 4 + 2 - field378.field211 / 32;
                    int var22 = this.field512 * 4 + 2 - field378.field212 / 32;
                    this.method55(var22, -561, this.field491, var21);
                }
                class32.method315(16777215, this.field523, 97, 78, 3, 3);
                this.field558.method273(1);
                class45.field1356 = this.field366;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
    public final void method53(int arg0, boolean arg1, int arg2) {
        if (arg2 < 7 || arg2 > 7) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        signlink.midivol = arg0;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method54(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            class9 var3 = this.field702.method283();
            if (var3 == null) {
                return;
            }
            if (var3.field157 == 0) {
                class19.method197(this.field424, var3.field156, var3.field159);
                if ((this.field702.method287(true, var3.field156) & 98) != 0) {
                    this.field350 = true;
                    if (this.field319 != -1 || this.field533 != -1) {
                        this.field636 = true;
                    }
                }
            }
            if (var3.field157 == 1 && var3.field159 != null) {
                class21.method232(var3.field159, 0);
            }
            if (var3.field157 == 2 && this.field257 == var3.field156 && var3.field159 != null) {
                this.method88(this.field258, 1, var3.field159);
            }
            if (var3.field157 == 3 && this.field650 == 1) {
                for (int var4 = 0; var4 < this.field293.length; ++var4) {
                    if (this.field400[var4] == var3.field156) {
                        this.field293[var4] = var3.field159;
                        if (var3.field159 == null) {
                            this.field400[var4] = -1;
                        }
                        break;
                    }
                    if (this.field401[var4] == var3.field156) {
                        this.field472[var4] = var3.field159;
                        if (var3.field159 == null) {
                            this.field401[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field157 == 93 && this.field702.method276(true, var3.field156)) {
                class24.method247(new class58((byte) -115, var3.field159), this.field702, this.field676);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILOGPNACTP;I)V")
    public final void method55(int arg0, int arg1, class40 arg2, int arg3) {
        if (arg2 != null) {
            int var5 = this.field579 + this.field300 & 2047;
            int var6 = arg0 * arg0 + arg3 * arg3;
            while (arg1 >= 0) {
                this.method19();
            }
            if (var6 <= 6400) {
                int var7 = class19.field830[var5];
                int var8 = class19.field831[var5];
                int var9 = var7 * 256 / (this.field598 + 256);
                int var10 = var8 * 256 / (this.field598 + 256);
                int var11 = arg0 * var9 + arg3 * var10 >> 16;
                int var12 = arg0 * var10 - arg3 * var9 >> 16;
                if (var6 > 2500) {
                    arg2.method362(var11 + 94 - arg2.field1286 / 2 + 4, 83 - var12 - arg2.field1287 / 2 - 4, this.field474, true);
                } else {
                    arg2.method356(var11 + 94 - arg2.field1286 / 2 + 4, 83 - var12 - arg2.field1287 / 2 - 4, -973);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILPJGEBWSY;)V")
    public final void method56(int arg0, int arg1, int arg2, int arg3, class46 arg4) {
        if (this.field694 < 400) {
            if (arg4.field1389 != null) {
                arg4 = arg4.method392(true);
            }
            if (arg4 != null) {
                if (arg4.field1373) {
                    String var6 = arg4.field1400;
                    if (arg2 != 2) {
                        this.field444 = -1;
                    }
                    if (arg4.field1381 != 0) {
                        var6 = var6 + method158(9, field378.field1544, arg4.field1381) + " (level-" + arg4.field1381 + ")";
                    }
                    if (this.field352 == 1) {
                        this.field302[this.field694] = "Use " + this.field356 + " with @yel@" + var6;
                        this.field290[this.field694] = 60;
                        this.field291[this.field694] = arg3;
                        this.field288[this.field694] = arg1;
                        this.field289[this.field694] = arg0;
                        ++this.field694;
                    } else {
                        if (this.field457 == 1) {
                            if ((this.field459 & 2) == 2) {
                                this.field302[this.field694] = this.field460 + " @yel@" + var6;
                                this.field290[this.field694] = 154;
                                this.field291[this.field694] = arg3;
                                this.field288[this.field694] = arg1;
                                this.field289[this.field694] = arg0;
                                ++this.field694;
                                return;
                            }
                        } else {
                            if (arg4.field1399 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg4.field1399[var7] != null && !arg4.field1399[var7].equalsIgnoreCase("attack")) {
                                        this.field302[this.field694] = arg4.field1399[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field290[this.field694] = 531;
                                        }
                                        if (var7 == 1) {
                                            this.field290[this.field694] = 810;
                                        }
                                        if (var7 == 2) {
                                            this.field290[this.field694] = 641;
                                        }
                                        if (var7 == 3) {
                                            this.field290[this.field694] = 69;
                                        }
                                        if (var7 == 4) {
                                            this.field290[this.field694] = 157;
                                        }
                                        this.field291[this.field694] = arg3;
                                        this.field288[this.field694] = arg1;
                                        this.field289[this.field694] = arg0;
                                        ++this.field694;
                                    }
                                }
                            }
                            if (arg4.field1399 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg4.field1399[var8] != null && arg4.field1399[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg4.field1381 > field378.field1544) {
                                            var9 = 2000;
                                        }
                                        this.field302[this.field694] = arg4.field1399[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field290[this.field694] = var9 + 531;
                                        }
                                        if (var8 == 1) {
                                            this.field290[this.field694] = var9 + 810;
                                        }
                                        if (var8 == 2) {
                                            this.field290[this.field694] = var9 + 641;
                                        }
                                        if (var8 == 3) {
                                            this.field290[this.field694] = var9 + 69;
                                        }
                                        if (var8 == 4) {
                                            this.field290[this.field694] = var9 + 157;
                                        }
                                        this.field291[this.field694] = arg3;
                                        this.field288[this.field694] = arg1;
                                        this.field289[this.field694] = arg0;
                                        ++this.field694;
                                    }
                                }
                            }
                            this.field302[this.field694] = "Examine @yel@" + var6;
                            this.field290[this.field694] = 1261;
                            this.field291[this.field694] = arg3;
                            this.field288[this.field694] = arg1;
                            this.field289[this.field694] = arg0;
                            ++this.field694;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
    public final boolean method57(int arg0, byte arg1, int arg2) {
        boolean var4 = false;
        if (arg1 != 5) {
            this.field444 = -1;
        }
        class34 var5 = class34.method324(arg2);
        for (int var6 = 0; var6 < var5.field1162.length && var5.field1162[var6] != -1; ++var6) {
            class34 var7 = class34.method324(var5.field1162[var6]);
            if (var7.field1155 == 0) {
                var4 |= this.method57(arg0, (byte) 5, var7.field1170);
            }
            if (var7.field1155 == 6 && (var7.field1168 != -1 || var7.field1169 != -1)) {
                boolean var8 = this.method161(var7, false);
                int var9;
                if (var8) {
                    var9 = var7.field1169;
                } else {
                    var9 = var7.field1168;
                }
                if (var9 != -1) {
                    class66 var10 = class66.field1693[var9];
                    var7.field1122 += arg0;
                    while (var7.field1122 > var10.method567(0, var7.field1187)) {
                        var7.field1122 -= var10.method567(0, var7.field1187) + 1;
                        ++var7.field1187;
                        if (var7.field1187 >= var10.field1694) {
                            var7.field1187 -= var10.field1698;
                            if (var7.field1187 < 0 || var7.field1187 >= var10.field1694) {
                                var7.field1187 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1155 == 6 && var7.field1160 != 0) {
                int var11 = var7.field1160 >> 16;
                int var12 = var7.field1160 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field1128 = var7.field1128 + var13 & 2047;
                var7.field1129 = var7.field1129 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMRUJPFPS;Z)V")
    public final void method58(class34 arg0, boolean arg1) {
        if (arg1) {
            this.field444 = -1;
        }
        int var3 = arg0.field1115;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field610;
                if (this.field611 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field1126 = "";
                    arg0.field1178 = 0;
                } else {
                    if (this.field256[var3] == 0) {
                        arg0.field1126 = "@red@Offline";
                    } else if (this.field256[var3] < 200) {
                        if (this.field256[var3] == field410) {
                            arg0.field1126 = "@gre@World" + (this.field256[var3] - 9);
                        } else {
                            arg0.field1126 = "@yel@World" + (this.field256[var3] - 9);
                        }
                    } else if (this.field256[var3] == field410) {
                        arg0.field1126 = "@gre@Classic" + (this.field256[var3] - 219);
                    } else {
                        arg0.field1126 = "@yel@Classic" + (this.field256[var3] - 219);
                    }
                    arg0.field1178 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field610;
                if (this.field611 != 2) {
                    var6 = 0;
                }
                arg0.field1181 = var6 * 15 + 20;
                if (arg0.field1181 <= arg0.field1138) {
                    arg0.field1181 = arg0.field1138 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field611 == 0) {
                    arg0.field1126 = "Loading ignore list";
                    arg0.field1178 = 0;
                } else if (var3 == 1 && this.field611 == 0) {
                    arg0.field1126 = "Please wait...";
                    arg0.field1178 = 0;
                } else {
                    int var7 = this.field303;
                    if (this.field611 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field1126 = "";
                        arg0.field1178 = 0;
                    } else {
                        arg0.field1126 = class69.method582(class69.method579(this.field393, this.field383[var3]), true);
                        arg0.field1178 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field1181 = this.field303 * 15 + 20;
                if (arg0.field1181 <= arg0.field1138) {
                    arg0.field1181 = arg0.field1138 + 1;
                }
            } else if (var3 == 327) {
                arg0.field1128 = 150;
                arg0.field1129 = (int) (Math.sin((double) field608 / 40.0D) * 256.0D) & 2047;
                if (this.field368) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field328[var8];
                        if (var15 >= 0 && !class20.field839[var15].method227(this.field402)) {
                            return;
                        }
                    }
                    this.field368 = false;
                    class19[] var9 = new class19[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field328[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class20.field839[var14].method228((byte) -26);
                        }
                    }
                    class19 var12 = new class19(var10, -23, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field423[var13] != 0) {
                            var12.method213(field377[var13][0], field377[var13][this.field423[var13]]);
                            if (var13 == 1) {
                                var12.method213(field528[0], field528[this.field423[var13]]);
                            }
                        }
                    }
                    var12.method206(8);
                    var12.method207(class66.field1693[field378.field215].field1695[0], (byte) -14);
                    var12.method216(64, 850, -30, -50, -30, true);
                    arg0.field1133 = 5;
                    arg0.field1134 = 0;
                    class34.method329(true, var12, 5, 0);
                }
            } else if (var3 == 324) {
                if (this.field425 == null) {
                    this.field425 = arg0.field1171;
                    this.field426 = arg0.field1179;
                }
                if (this.field673) {
                    arg0.field1171 = this.field426;
                } else {
                    arg0.field1171 = this.field425;
                }
            } else if (var3 == 325) {
                if (this.field425 == null) {
                    this.field425 = arg0.field1171;
                    this.field426 = arg0.field1179;
                }
                if (this.field673) {
                    arg0.field1171 = this.field425;
                } else {
                    arg0.field1171 = this.field426;
                }
            } else if (var3 == 600) {
                arg0.field1126 = this.field644;
                if (field608 % 20 < 10) {
                    arg0.field1126 = arg0.field1126 + "|";
                } else {
                    arg0.field1126 = arg0.field1126 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field524 >= 1) {
                        if (this.field572) {
                            arg0.field1148 = 16711680;
                            arg0.field1126 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1148 = 16777215;
                            arg0.field1126 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1126 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field320 - this.field333;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg0.field1126 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field442 == 0) {
                        arg0.field1126 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field442 <= this.field320) {
                        arg0.field1126 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method59(this.field436, this.field442);
                    } else {
                        int var18 = this.field320 + 14 - this.field442;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg0.field1126 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method59(this.field436, this.field442) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field503 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field503 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field503 + " unread messages";
                    }
                    arg0.field1126 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field527 > 0 && this.field527 <= this.field320 + 10) {
                        arg0.field1126 = "Last password change:\\n@gre@" + this.method59(this.field436, this.field527);
                    } else {
                        arg0.field1126 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field487 > 2 && !field412) {
                        arg0.field1126 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field487 > 2) {
                        arg0.field1126 = "\\n\\nYou have @gre@" + this.field487 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field487 > 0) {
                        arg0.field1126 = "You have @gre@" + this.field487 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field1126 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field487 > 2 && !field412) {
                        arg0.field1126 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field487 > 0) {
                        arg0.field1126 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field1126 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field442 > this.field320) {
                        arg0.field1126 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field1126 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field611 == 0) {
            arg0.field1126 = "Loading friend list";
            arg0.field1178 = 0;
        } else if (var3 == 1 && this.field611 == 1) {
            arg0.field1126 = "Connecting to friendserver";
            arg0.field1178 = 0;
        } else if (var3 == 2 && this.field611 != 2) {
            arg0.field1126 = "Please wait...";
            arg0.field1178 = 0;
        } else {
            int var4 = this.field610;
            if (this.field611 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field1126 = "";
                arg0.field1178 = 0;
            } else {
                arg0.field1126 = this.field388[var3];
                arg0.field1178 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method59(byte arg0, int arg1) {
        if (arg1 > this.field320 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            if (arg0 != -43) {
                this.field230.method505(105);
            }
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILWBEWPIXO;I)V")
    private final void method60(int arg0, class58 arg1, int arg2) {
        arg1.method525(616);
        if (arg0 != 0) {
            this.method19();
        }
        int var4 = arg1.method526(true, 1);
        if (var4 != 0) {
            int var5 = arg1.method526(true, 2);
            if (var5 == 0) {
                this.field482[this.field481++] = this.field477;
            } else if (var5 == 1) {
                int var6 = arg1.method526(true, 3);
                field378.method45(false, false, var6);
                int var7 = arg1.method526(true, 1);
                if (var7 == 1) {
                    this.field482[this.field481++] = this.field477;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method526(true, 3);
                field378.method45(true, false, var8);
                int var9 = arg1.method526(true, 3);
                field378.method45(true, false, var9);
                int var10 = arg1.method526(true, 1);
                if (var10 == 1) {
                    this.field482[this.field481++] = this.field477;
                }
            } else if (var5 == 3) {
                this.field653 = arg1.method526(true, 2);
                int var11 = arg1.method526(true, 1);
                if (var11 == 1) {
                    this.field482[this.field481++] = this.field477;
                }
                int var12 = arg1.method526(true, 7);
                int var13 = arg1.method526(true, 1);
                int var14 = arg1.method526(true, 7);
                field378.method43(false, var13 == 1, var14, var12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILSRMWIYVM;IILWBEWPIXO;)V")
    private final void method61(int arg0, class53 arg1, int arg2, int arg3, class58 arg4) {
        if (arg0 != -10985) {
            this.field675 = 316;
        }
        if ((arg2 & 4) != 0) {
            int var6 = arg4.method517();
            int var7 = arg4.method533(18094);
            int var8 = arg4.method534(true);
            int var9 = arg4.field1615;
            if (arg1.field1554 != null && arg1.field1555) {
                long var10 = class69.method578(arg1.field1554);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.field303; ++var13) {
                        if (this.field383[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.field622 == 0) {
                    try {
                        this.field403.field1615 = 0;
                        arg4.method552(0, var8, this.field403.field1614, 893);
                        this.field403.field1615 = 0;
                        String var14 = class29.method297(var8, false, this.field403);
                        String var15 = class54.method467(var14, 7);
                        arg1.field207 = var15;
                        arg1.field196 = var6 >> 8;
                        arg1.field194 = var6 & 255;
                        arg1.field192 = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.method175((byte) 2, 1, var15, "@cr1@" + arg1.field1554);
                            } else {
                                this.method175((byte) 2, 2, var15, arg1.field1554);
                            }
                        } else {
                            this.method175((byte) 2, 1, var15, "@cr2@" + arg1.field1554);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field1615 = var8 + var9;
        }
        if ((arg2 & 8) != 0) {
            int var17 = arg4.method541(35378);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = arg4.method532(true);
            if (arg1.field202 == var17 && var17 != -1) {
                int var19 = class66.field1693[var17].field1707;
                if (var19 == 1) {
                    arg1.field203 = 0;
                    arg1.field204 = 0;
                    arg1.field205 = var18;
                    arg1.field206 = 0;
                }
                if (var19 == 2) {
                    arg1.field206 = 0;
                }
            } else if (var17 == -1 || arg1.field202 == -1 || class66.field1693[var17].field1701 >= class66.field1693[arg1.field202].field1701) {
                arg1.field202 = var17;
                arg1.field203 = 0;
                arg1.field204 = 0;
                arg1.field205 = var18;
                arg1.field206 = 0;
                arg1.field195 = arg1.field190;
            }
        }
        if ((arg2 & 512) != 0) {
            int var20 = arg4.method515();
            int var21 = arg4.method515();
            arg1.method46((byte) 5, var20, var21, field608);
            arg1.field197 = field608 + 300;
            arg1.field198 = arg4.method533(18094);
            arg1.field199 = arg4.method533(18094);
        }
        if ((arg2 & 1024) != 0) {
            arg1.field182 = arg4.method541(35378);
            int var22 = arg4.method520();
            arg1.field186 = var22 >> 16;
            arg1.field185 = (var22 & 65535) + field608;
            arg1.field183 = 0;
            arg1.field184 = 0;
            if (arg1.field185 > field608) {
                arg1.field183 = -1;
            }
            if (arg1.field182 == 65535) {
                arg1.field182 = -1;
            }
        }
        if ((arg2 & 2) != 0) {
            int var23 = arg4.method534(true);
            int var24 = arg4.method515();
            arg1.method46((byte) 5, var23, var24, field608);
            arg1.field197 = field608 + 300;
            arg1.field198 = arg4.method532(true);
            arg1.field199 = arg4.method515();
        }
        if ((arg2 & 256) != 0) {
            arg1.field174 = arg4.method534(true);
            arg1.field176 = arg4.method515();
            arg1.field175 = arg4.method534(true);
            arg1.field177 = arg4.method515();
            arg1.field178 = arg4.method541(35378) + field608;
            arg1.field179 = arg4.method542(this.field390) + field608;
            arg1.field180 = arg4.method534(true);
            arg1.method44(false);
        }
        if ((arg2 & 64) != 0) {
            int var25 = arg4.method533(18094);
            byte[] var26 = new byte[var25];
            class58 var27 = new class58((byte) -115, var26);
            arg4.method552(0, var25, var26, 893);
            this.field483[arg3] = var27;
            arg1.method454(this.field502, var27);
        }
        if ((arg2 & 1) != 0) {
            arg1.field170 = arg4.method541(35378);
            arg1.field171 = arg4.method542(this.field390);
        }
        if ((arg2 & 16) != 0) {
            arg1.field217 = arg4.method542(this.field390);
            if (arg1.field217 == 65535) {
                arg1.field217 = -1;
            }
        }
        if ((arg2 & 128) != 0) {
            arg1.field207 = arg4.method522();
            if (arg1.field207.charAt(0) == '~') {
                arg1.field207 = arg1.field207.substring(1);
                this.method175((byte) 2, 2, arg1.field207, arg1.field1554);
            } else if (field378 == arg1) {
                this.method175((byte) 2, 2, arg1.field207, arg1.field1554);
            }
            arg1.field196 = 0;
            arg1.field194 = 0;
            arg1.field192 = 150;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class8 var11 = null;
        class8 var12 = (class8) this.field386.method340();
        if (arg9 != -46589) {
            this.field628 = this.field688.method558();
        }
        while (var12 != null) {
            if (var12.field148 == arg3 && var12.field150 == arg5 && var12.field151 == arg7 && var12.field149 == arg2) {
                var11 = var12;
                break;
            }
            var12 = (class8) this.field386.method342(954);
        }
        if (var11 == null) {
            var11 = new class8();
            var11.field148 = arg3;
            var11.field149 = arg2;
            var11.field150 = arg5;
            var11.field151 = arg7;
            this.method103(-840, var11);
            this.field386.method337(var11);
        }
        var11.field152 = arg4;
        var11.field154 = arg8;
        var11.field153 = arg1;
        var11.field147 = arg6;
        var11.field146 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method63(String arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field610; ++var3) {
                if (arg0.equalsIgnoreCase(this.field388[var3])) {
                    return true;
                }
            }
            if (arg1 < 0) {
                return arg0.equalsIgnoreCase(field378.field1554);
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public static final void method64(boolean arg0) {
        class48.field1422 = true;
        if (arg0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class45.field1345 = true;
        field413 = true;
        class24.field912 = true;
        class22.field900 = true;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (this.field447 > 0) {
            this.method170((byte) 8);
        } else {
            this.method171((byte) -43, "Please wait - attempting to reestablish", "Connection lost");
            this.field449 = 0;
            this.field511 = 0;
            class31 var2 = this.field281;
            if (arg0 != 13228) {
                this.field666 = !this.field666;
            }
            this.field680 = false;
            this.field231 = 0;
            this.method108(this.field573, this.field574, true);
            if (!this.field680) {
                this.method170((byte) 8);
            }
            try {
                var2.method304();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
    public final void method66(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field709[var5] != null) {
                int var6 = this.field707[var5];
                int var7 = 70 - var4 * 14 + this.field681 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field708[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field429 == 0 || this.field429 == 1 && this.method63(var8, -222))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field378.field1554)) {
                        if (this.field524 >= 1) {
                            this.field302[this.field694] = "Report abuse @whi@" + var8;
                            this.field290[this.field694] = 674;
                            ++this.field694;
                        }
                        this.field302[this.field694] = "Add ignore @whi@" + var8;
                        this.field290[this.field694] = 478;
                        ++this.field694;
                        this.field302[this.field694] = "Add friend @whi@" + var8;
                        this.field290[this.field694] = 50;
                        ++this.field694;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field497 == 0 && (var6 == 7 || this.field313 == 0 || this.field313 == 1 && this.method63(var8, -222))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field524 >= 1) {
                            this.field302[this.field694] = "Report abuse @whi@" + var8;
                            this.field290[this.field694] = 674;
                            ++this.field694;
                        }
                        this.field302[this.field694] = "Add ignore @whi@" + var8;
                        this.field290[this.field694] = 478;
                        ++this.field694;
                        this.field302[this.field694] = "Add friend @whi@" + var8;
                        this.field290[this.field694] = 50;
                        ++this.field694;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field594 == 0 || this.field594 == 1 && this.method63(var8, -222))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field302[this.field694] = "Accept trade @whi@" + var8;
                        this.field290[this.field694] = 504;
                        ++this.field694;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field497 == 0 && this.field313 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field594 == 0 || this.field594 == 1 && this.method63(var8, -222))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field302[this.field694] = "Accept challenge @whi@" + var8;
                        this.field290[this.field694] = 56;
                        ++this.field694;
                    }
                    ++var4;
                }
            }
        }
        if (arg0 != 0) {
            this.field230.method505(170);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
    private static final String method67(byte arg0, int arg1) {
        if (field652 == arg0) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method68(int arg0) {
        this.field230.method504(54, 1);
        if (arg0 != 0) {
            this.field407 = null;
        }
        if (this.field312 != -1) {
            this.method73(0, this.field312);
            this.field312 = -1;
            this.field350 = true;
            this.field531 = false;
            this.field338 = true;
        }
        if (this.field319 != -1) {
            this.method73(0, this.field319);
            this.field319 = -1;
            this.field636 = true;
            this.field531 = false;
        }
        if (this.field576 != -1) {
            this.method73(0, this.field576);
            this.field576 = -1;
            this.field691 = true;
        }
        if (this.field490 != -1) {
            this.method73(0, this.field490);
            this.field490 = -1;
        }
        if (this.field665 != -1) {
            this.method73(0, this.field665);
            this.field665 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method69(byte arg0) {
        if (this.field324 != arg0) {
            this.field444 = -1;
        }
        for (int var2 = 0; var2 < this.field663; ++var2) {
            if (this.field692[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field494[var2] == this.field229 && this.field408[var2] == this.field456) {
                        if (!this.method151(false)) {
                            var3 = true;
                        }
                    } else {
                        class58 var4 = class57.method498(-95, this.field408[var2], this.field494[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1615 / 22) > (long) (this.field253 / 22) + this.field677) {
                            this.field253 = var4.field1615;
                            this.field677 = System.currentTimeMillis();
                            if (this.method110(this.field662, var4.field1614, var4.field1615)) {
                                this.field229 = this.field494[var2];
                                this.field456 = this.field408[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field230.method504(178, 1);
                        this.field230.method506(this.field494[var2] & 32767);
                    } else {
                        this.field230.method504(178, 1);
                        this.field230.method506(-1);
                    }
                }
                if (var3 && this.field692[var2] != -5) {
                    this.field692[var2] = -5;
                } else {
                    --this.field663;
                    for (int var6 = var2; var6 < this.field663; ++var6) {
                        this.field494[var6] = this.field494[var6 + 1];
                        this.field408[var6] = this.field408[var6 + 1];
                        this.field692[var6] = this.field692[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field692[var2]--;
            }
        }
        if (this.field471 > 0) {
            this.field471 -= 20;
            if (this.field471 < 0) {
                this.field471 = 0;
            }
            if (this.field471 == 0 && this.field373 && !field413) {
                this.field257 = this.field484;
                this.field258 = true;
                this.field702.method292(2, this.field257);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIIII)V")
    private final void method70(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -28) {
            this.field233 = 259;
        }
        if (arg1 >= 1 && arg7 >= 1 && arg1 <= 102 && arg7 <= 102) {
            if (field413 && this.field653 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg6 == 0) {
                var9 = this.field667.method425(arg2, arg1, arg7);
            }
            if (arg6 == 1) {
                var9 = this.field667.method426(arg2, 40041, arg7, arg1);
            }
            if (arg6 == 2) {
                var9 = this.field667.method427(arg2, arg1, arg7);
            }
            if (arg6 == 3) {
                var9 = this.field667.method428(arg2, arg1, arg7);
            }
            if (var9 != 0) {
                int var13 = this.field667.method429(arg2, arg1, arg7, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg6 == 0) {
                    this.field667.method416(true, arg1, arg2, arg7);
                    class22 var17 = class22.method246(var14);
                    if (var17.field868) {
                        this.field335[arg2].method32(arg1, var15, arg7, -506, var16, var17.field867);
                    }
                }
                if (arg6 == 1) {
                    this.field667.method417(arg2, -49986, arg1, arg7);
                }
                if (arg6 == 2) {
                    this.field667.method418(arg1, (byte) 9, arg2, arg7);
                    class22 var18 = class22.method246(var14);
                    if (var18.field904 + arg1 > 103 || var18.field904 + arg7 > 103 || var18.field893 + arg1 > 103 || var18.field893 + arg7 > 103) {
                        return;
                    }
                    if (var18.field868) {
                        this.field335[arg2].method33(var18.field867, (byte) 56, var16, var18.field904, arg1, var18.field893, arg7);
                    }
                }
                if (arg6 == 3) {
                    this.field667.method419(arg2, arg1, arg7, this.field311);
                    class22 var19 = class22.method246(var14);
                    if (var19.field868 && var19.field897) {
                        this.field335[arg2].method35(this.field582, arg7, arg1);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field331[1][arg1][arg7] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                class24.method257((byte) 13, var20, arg5, arg7, arg4, this.field335[arg2], arg2, arg1, arg0, this.field667, this.field282);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field83 != null) {
                    return new URL("http://127.0.0.1:" + (field411 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method71(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field407 = null;
        }
        if (this.field650 == 2) {
            for (class8 var2 = (class8) this.field386.method340(); var2 != null; var2 = (class8) this.field386.method342(954)) {
                if (var2.field146 > 0) {
                    --var2.field146;
                }
                if (var2.field146 == 0) {
                    if (var2.field143 < 0 || class24.method254(var2.field143, var2.field145, (byte) 44)) {
                        this.method70(var2.field144, var2.field150, var2.field148, (byte) -28, var2.field143, var2.field145, var2.field149, var2.field151);
                        var2.method41();
                    }
                } else {
                    if (var2.field147 > 0) {
                        --var2.field147;
                    }
                    if (var2.field147 == 0 && var2.field150 >= 1 && var2.field151 >= 1 && var2.field150 <= 102 && var2.field151 <= 102 && (var2.field152 < 0 || class24.method254(var2.field152, var2.field154, (byte) 44))) {
                        this.method70(var2.field153, var2.field150, var2.field148, (byte) -28, var2.field152, var2.field154, var2.field149, var2.field151);
                        var2.field147 = -1;
                        if (var2.field152 == var2.field143 && var2.field143 == -1) {
                            var2.method41();
                        } else if (var2.field152 == var2.field143 && var2.field153 == var2.field144 && var2.field154 == var2.field145) {
                            var2.method41();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method72(int arg0) {
        class48.field1422 = false;
        class45.field1345 = false;
        if (arg0 == -8266) {
            field413 = false;
            class24.field912 = false;
            class22.field900 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method73(int arg0, int arg1) {
        if (arg0 == 0) {
            class34.method332(0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method74(int arg0, int arg1) {
        int var2 = 57 / arg1;
        String var3 = String.valueOf(arg0);
        for (int var4 = var3.length() - 3; var4 > 0; var4 -= 3) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
        }
        if (var3.length() > 8) {
            var3 = "@gre@" + var3.substring(0, var3.length() - 8) + " million @whi@(" + var3 + ")";
        } else if (var3.length() > 4) {
            var3 = "@cya@" + var3.substring(0, var3.length() - 4) + "K @whi@(" + var3 + ")";
        }
        return " " + var3;
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field283) {
            this.method135(-8090);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLjava/lang/String;ILjava/lang/String;)LLKPVZAQN;")
    public final class33 method75(int arg0, int arg1, byte arg2, String arg3, int arg4, String arg5) {
        byte[] var7 = null;
        if (this.field701 != arg2) {
            this.field230.method505(179);
        }
        int var8 = 5;
        try {
            if (this.field682[0] != null) {
                var7 = this.field682[0].method300(arg1, 767);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field309.reset();
            this.field309.update(var7);
            int var9 = (int) this.field309.getValue();
            if (arg0 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class33(var7, 0);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method26(arg4, "Requesting " + arg3, 2);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method116(arg5 + arg0);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class58 var17 = new class58((byte) -115, var16);
                    var17.field1615 = 3;
                    int var18 = var17.method519() + 6;
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
                            this.method26(arg4, "Loading " + arg3 + " - " + var23 + "%", 2);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field682[0] != null) {
                            this.field682[0].method301(arg1, 697, var7.length, var7);
                        }
                    } catch (Exception var29) {
                        this.field682[0] = null;
                    }
                    if (var7 != null) {
                        this.field309.reset();
                        this.field309.update(var7);
                        int var24 = (int) this.field309.getValue();
                        if (arg0 != var24) {
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
                            this.method26(arg4, "Game updated - please reload page", 2);
                            var26 = 10;
                        } else {
                            this.method26(arg4, var12 + " - Retrying in " + var26, 2);
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
                    this.field349 = !this.field349;
                }
            }
            return new class33(var7, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method76(int arg0) {
        if (arg0 >= 3 && arg0 <= 3) {
            if (super.field94 == 1) {
                if (super.field95 >= 539 && super.field95 <= 573 && super.field96 >= 169 && super.field96 < 205 && this.field545[0] != -1) {
                    this.field350 = true;
                    this.field284 = 0;
                    this.field338 = true;
                }
                if (super.field95 >= 569 && super.field95 <= 599 && super.field96 >= 168 && super.field96 < 205 && this.field545[1] != -1) {
                    this.field350 = true;
                    this.field284 = 1;
                    this.field338 = true;
                }
                if (super.field95 >= 597 && super.field95 <= 627 && super.field96 >= 168 && super.field96 < 205 && this.field545[2] != -1) {
                    this.field350 = true;
                    this.field284 = 2;
                    this.field338 = true;
                }
                if (super.field95 >= 625 && super.field95 <= 669 && super.field96 >= 168 && super.field96 < 203 && this.field545[3] != -1) {
                    this.field350 = true;
                    this.field284 = 3;
                    this.field338 = true;
                }
                if (super.field95 >= 666 && super.field95 <= 696 && super.field96 >= 168 && super.field96 < 205 && this.field545[4] != -1) {
                    this.field350 = true;
                    this.field284 = 4;
                    this.field338 = true;
                }
                if (super.field95 >= 694 && super.field95 <= 724 && super.field96 >= 168 && super.field96 < 205 && this.field545[5] != -1) {
                    this.field350 = true;
                    this.field284 = 5;
                    this.field338 = true;
                }
                if (super.field95 >= 722 && super.field95 <= 756 && super.field96 >= 169 && super.field96 < 205 && this.field545[6] != -1) {
                    this.field350 = true;
                    this.field284 = 6;
                    this.field338 = true;
                }
                if (super.field95 >= 540 && super.field95 <= 574 && super.field96 >= 466 && super.field96 < 502 && this.field545[7] != -1) {
                    this.field350 = true;
                    this.field284 = 7;
                    this.field338 = true;
                }
                if (super.field95 >= 572 && super.field95 <= 602 && super.field96 >= 466 && super.field96 < 503 && this.field545[8] != -1) {
                    this.field350 = true;
                    this.field284 = 8;
                    this.field338 = true;
                }
                if (super.field95 >= 599 && super.field95 <= 629 && super.field96 >= 466 && super.field96 < 503 && this.field545[9] != -1) {
                    this.field350 = true;
                    this.field284 = 9;
                    this.field338 = true;
                }
                if (super.field95 >= 627 && super.field95 <= 671 && super.field96 >= 467 && super.field96 < 502 && this.field545[10] != -1) {
                    this.field350 = true;
                    this.field284 = 10;
                    this.field338 = true;
                }
                if (super.field95 >= 669 && super.field95 <= 699 && super.field96 >= 466 && super.field96 < 503 && this.field545[11] != -1) {
                    this.field350 = true;
                    this.field284 = 11;
                    this.field338 = true;
                }
                if (super.field95 >= 696 && super.field95 <= 726 && super.field96 >= 466 && super.field96 < 503 && this.field545[12] != -1) {
                    this.field350 = true;
                    this.field284 = 12;
                    this.field338 = true;
                }
                if (super.field95 >= 724 && super.field95 <= 758 && super.field96 >= 466 && super.field96 < 502 && this.field545[13] != -1) {
                    this.field350 = true;
                    this.field284 = 13;
                    this.field338 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method77(byte arg0) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        class22.field859.method336();
        class22.field899.method336();
        class46.field1376.method336();
        class1.field17.method336();
        class1.field21.method336();
        class53.field1535.method336();
        class63.field1664.method336();
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method78(int arg0, int arg1) {
        int[] var3 = this.field513.field1281;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field331[arg0][var24][var6] & 24) == 0) {
                    this.field667.method434(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field331[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field667.method434(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field513.method351(1);
        if (arg1 != 6) {
            this.method19();
        }
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field331[arg0][var22][var9] & 24) == 0) {
                    this.method98(var7, var8, arg0, 48544, var9, var22);
                }
                if (arg0 < 3 && (this.field331[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method98(var7, var8, arg0 + 1, 48544, var9, var22);
                }
            }
        }
        if (this.field558 != null) {
            this.field558.method273(1);
            class45.field1356 = this.field366;
        }
        this.field361 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field667.method428(this.field653, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class22.method246(var13).field878;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field335[this.field653].field134;
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
                        this.field371[this.field361] = this.field392[var14];
                        this.field362[this.field361] = var15;
                        this.field363[this.field361] = var16;
                        ++this.field361;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOGPNACTP;II)V")
    public final void method79(int arg0, class40 arg1, int arg2, int arg3) {
        int var5 = 90 / arg3;
        int var6 = arg0 * arg0 + arg2 * arg2;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = this.field579 + this.field300 & 2047;
            int var8 = class19.field830[var7];
            int var9 = class19.field831[var7];
            int var10 = var8 * 256 / (this.field598 + 256);
            int var11 = var9 * 256 / (this.field598 + 256);
            int var12 = arg0 * var11 + arg2 * var10 >> 16;
            int var13 = arg2 * var11 - arg0 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field710.method361(0, 15, var16 + 94 + 4 - 10, var14, 20, 15, 20, 83 - var17 - 20, 256);
        } else {
            this.method55(arg2, -561, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (this.field584 == null) {
            super.field81 = null;
            this.field559 = null;
            this.field557 = null;
            this.field556 = null;
            this.field558 = null;
            this.field439 = null;
            this.field440 = null;
            this.field441 = null;
            this.field587 = new class26((byte) 9, this.method24(731), 128, 265);
            class32.method313((byte) 73);
            this.field588 = new class26((byte) 9, this.method24(731), 128, 265);
            class32.method313((byte) 73);
            this.field584 = new class26((byte) 9, this.method24(731), 509, 171);
            class32.method313((byte) 73);
            this.field585 = new class26((byte) 9, this.method24(731), 360, 132);
            class32.method313((byte) 73);
            this.field586 = new class26((byte) 9, this.method24(731), 360, 200);
            class32.method313((byte) 73);
            this.field589 = new class26((byte) 9, this.method24(731), 202, 238);
            class32.method313((byte) 73);
            this.field590 = new class26((byte) 9, this.method24(731), 203, 238);
            class32.method313((byte) 73);
            this.field591 = new class26((byte) 9, this.method24(731), 74, 94);
            this.field443 += arg0;
            class32.method313((byte) 73);
            this.field592 = new class26((byte) 9, this.method24(731), 75, 94);
            class32.method313((byte) 73);
            if (this.field595 != null) {
                this.method119(0);
                this.method152(38021);
            }
            this.field691 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method81(boolean arg0, int arg1) {
        if (arg0) {
            this.field500 = -343;
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method82(int arg0, boolean arg1) {
        signlink.wavevol = arg0;
        if (!arg1) {
            this.field666 = !this.field666;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method83(byte arg0) {
        if (arg0 != 8) {
            this.method19();
        }
        if (field413 && this.field650 == 2 && class24.field936 != this.field653) {
            this.method171((byte) -43, (String) null, "Loading - please wait.");
            this.field650 = 1;
            this.field645 = System.currentTimeMillis();
        }
        if (this.field650 == 1) {
            int var2 = this.method84(this.field370);
            if (var2 != 0 && System.currentTimeMillis() - this.field645 > 360000L) {
                signlink.reporterror(this.field573 + " glcfb " + this.field325 + "," + var2 + "," + field413 + "," + this.field682[0] + "," + this.field702.method291() + "," + this.field653 + "," + this.field224 + "," + this.field225);
                this.field645 = System.currentTimeMillis();
            }
        }
        if (this.field650 == 2 && this.field653 != this.field218) {
            this.field218 = this.field653;
            this.method78(this.field653, 6);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)I")
    public final int method84(boolean arg0) {
        if (arg0) {
            this.field424 = 81;
        }
        for (int var2 = 0; var2 < this.field293.length; ++var2) {
            if (this.field293[var2] == null && this.field400[var2] != -1) {
                return -1;
            }
            if (this.field472[var2] == null && this.field401[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field293.length; ++var4) {
            byte[] var5 = this.field472[var4];
            if (var5 != null) {
                int var6 = (this.field399[var4] >> 8) * 64 - this.field541;
                int var7 = (this.field399[var4] & 255) * 64 - this.field542;
                if (this.field252) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class24.method252(-586, var5, var7, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field232) {
            return -4;
        } else {
            this.field650 = 2;
            class24.field936 = this.field653;
            this.method100(false);
            this.field230.method504(115, 1);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLMRUJPFPS;I)V")
    public final void method85(int arg0, int arg1, byte arg2, class34 arg3, int arg4) {
        if (arg3.field1155 == 0 && arg3.field1162 != null) {
            if (!arg3.field1150 || this.field219 == arg3.field1170 || this.field551 == arg3.field1170 || this.field647 == arg3.field1170) {
                int var6 = class32.field1097;
                int var7 = class32.field1095;
                int var8 = class32.field1098;
                int var9 = class32.field1096;
                class32.method312(arg0, 0, arg3.field1138 + arg0, arg3.field1117 + arg4, arg4);
                int var10 = arg3.field1162.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field1141[var11] + arg4;
                    int var13 = arg3.field1161[var11] + arg0 - arg1;
                    class34 var14 = class34.method324(arg3.field1162[var11]);
                    int var15 = var14.field1175 + var12;
                    int var16 = var14.field1164 + var13;
                    if (var14.field1115 > 0) {
                        this.method58(var14, false);
                    }
                    if (var14.field1155 == 0) {
                        if (var14.field1118 > var14.field1181 - var14.field1138) {
                            var14.field1118 = var14.field1181 - var14.field1138;
                        }
                        if (var14.field1118 < 0) {
                            var14.field1118 = 0;
                        }
                        this.method85(var16, var14.field1118, this.field583, var14, var15);
                        if (var14.field1181 > var14.field1138) {
                            this.method139(var14.field1181, var14.field1118, this.field500, var16, var14.field1117 + var15, var14.field1138);
                        }
                    } else if (var14.field1155 != 1) {
                        if (var14.field1155 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1138; ++var18) {
                                for (int var19 = 0; var19 < var14.field1117; ++var19) {
                                    int var20 = (var14.field1163 + 32) * var19 + var15;
                                    int var21 = (var14.field1144 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1188[var17];
                                        var21 += var14.field1180[var17];
                                    }
                                    if (var14.field1119[var17] <= 0) {
                                        if (var14.field1152 != null && var17 < 20) {
                                            class40 var30 = var14.field1152[var17];
                                            if (var30 != null) {
                                                var30.method356(var20, var21, -973);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1119[var17] - 1;
                                        if (var20 > class32.field1097 - 32 && var20 < class32.field1098 && var21 > class32.field1095 - 32 && var21 < class32.field1096 || this.field538 != 0 && this.field537 == var17) {
                                            int var25 = 0;
                                            if (this.field352 == 1 && this.field353 == var17 && this.field354 == var14.field1170) {
                                                var25 = 16777215;
                                            }
                                            class40 var26 = class1.method4(var25, var24, var14.field1135[var17], (byte) 1);
                                            if (var26 != null) {
                                                if (this.field538 != 0 && this.field537 == var17 && this.field536 == var14.field1170) {
                                                    var22 = super.field88 - this.field539;
                                                    var23 = super.field89 - this.field540;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field327 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method358(128, var21 + var23, var20 + var22, (byte) -33);
                                                    if (var21 + var23 < class32.field1095 && arg3.field1118 > 0) {
                                                        int var27 = (class32.field1095 - var21 - var23) * this.field552 / 3;
                                                        if (var27 > this.field552 * 10) {
                                                            var27 = this.field552 * 10;
                                                        }
                                                        if (var27 > arg3.field1118) {
                                                            var27 = arg3.field1118;
                                                        }
                                                        arg3.field1118 -= var27;
                                                        this.field540 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class32.field1096 && arg3.field1118 < arg3.field1181 - arg3.field1138) {
                                                        int var28 = (var21 + var23 + 32 - class32.field1096) * this.field552 / 3;
                                                        if (var28 > this.field552 * 10) {
                                                            var28 = this.field552 * 10;
                                                        }
                                                        if (var28 > arg3.field1181 - arg3.field1138 - arg3.field1118) {
                                                            var28 = arg3.field1181 - arg3.field1138 - arg3.field1118;
                                                        }
                                                        arg3.field1118 += var28;
                                                        this.field540 -= var28;
                                                    }
                                                } else if (this.field470 != 0 && this.field469 == var17 && this.field468 == var14.field1170) {
                                                    var26.method358(128, var21, var20, (byte) -33);
                                                } else {
                                                    var26.method356(var20, var21, -973);
                                                }
                                                if (var26.field1286 == 33 || var14.field1135[var17] != 1) {
                                                    int var29 = var14.field1135[var17];
                                                    this.field462.method593(false, 0, var21 + 10 + var23, method67((byte) 0, var29), var20 + 1 + var22);
                                                    this.field462.method593(false, 16776960, var21 + 9 + var23, method67((byte) 0, var29), var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1155 == 3) {
                            boolean var31 = false;
                            if (this.field647 == var14.field1170 || this.field551 == var14.field1170 || this.field219 == var14.field1170) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method161(var14, false)) {
                                var32 = var14.field1132;
                                if (var31 && var14.field1186 != 0) {
                                    var32 = var14.field1186;
                                }
                            } else {
                                var32 = var14.field1148;
                                if (var31 && var14.field1176 != 0) {
                                    var32 = var14.field1176;
                                }
                            }
                            if (var14.field1158 == 0) {
                                if (var14.field1153) {
                                    class32.method315(var32, this.field523, var15, var16, var14.field1138, var14.field1117);
                                } else {
                                    class32.method316(var14.field1117, var16, var14.field1138, var15, 0, var32);
                                }
                            } else if (var14.field1153) {
                                class32.method314(var32, var15, 256 - (var14.field1158 & 255), -26550, var14.field1117, var14.field1138, var16);
                            } else {
                                class32.method317(var14.field1138, var14.field1117, 0, var32, 256 - (var14.field1158 & 255), var15, var16);
                            }
                        } else if (var14.field1155 == 4) {
                            class72 var33 = var14.field1159;
                            String var34 = var14.field1126;
                            boolean var35 = false;
                            if (this.field647 == var14.field1170 || this.field551 == var14.field1170 || this.field219 == var14.field1170) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method161(var14, false)) {
                                var36 = var14.field1132;
                                if (var35 && var14.field1186 != 0) {
                                    var36 = var14.field1186;
                                }
                                if (var14.field1167.length() > 0) {
                                    var34 = var14.field1167;
                                }
                            } else {
                                var36 = var14.field1148;
                                if (var35 && var14.field1176 != 0) {
                                    var36 = var14.field1176;
                                }
                            }
                            if (var14.field1178 == 6 && this.field531) {
                                var34 = "Please wait...";
                                var36 = var14.field1148;
                            }
                            if (class32.field1093 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1751 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method81(false, this.method164(var14, 827, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method81(false, this.method164(var14, 827, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method81(false, this.method164(var14, 827, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method81(false, this.method164(var14, 827, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method81(false, this.method164(var14, 827, 0)) + var34.substring(var38 + 2);
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
                                if (var14.field1130) {
                                    var33.method590(var36, var14.field1151, var44, var14.field1117 / 2 + var15, var37, 0);
                                } else {
                                    var33.method597((byte) 3, var14.field1151, var44, var15, var36, var37);
                                }
                                var37 += var33.field1751;
                            }
                        } else if (var14.field1155 == 5) {
                            class40 var45;
                            if (this.method161(var14, false)) {
                                var45 = var14.field1179;
                            } else {
                                var45 = var14.field1171;
                            }
                            if (var45 != null) {
                                var45.method356(var15, var16, -973);
                            }
                        } else if (var14.field1155 == 6) {
                            int var46 = class45.field1350;
                            int var47 = class45.field1351;
                            class45.field1350 = var14.field1117 / 2 + var15;
                            class45.field1351 = var14.field1138 / 2 + var16;
                            int var48 = class45.field1354[var14.field1128] * var14.field1127 >> 16;
                            int var49 = class45.field1355[var14.field1128] * var14.field1127 >> 16;
                            boolean var50 = this.method161(var14, false);
                            int var51;
                            if (var50) {
                                var51 = var14.field1169;
                            } else {
                                var51 = var14.field1168;
                            }
                            class19 var52;
                            if (var51 == -1) {
                                var52 = var14.method326(var50, 0, -1, -1);
                            } else {
                                class66 var53 = class66.field1693[var51];
                                var52 = var14.method326(var50, 0, var53.field1695[var14.field1187], var53.field1696[var14.field1187]);
                            }
                            if (var52 != null) {
                                var52.method220(0, var14.field1129, 0, var14.field1128, 0, var48, var49);
                            }
                            class45.field1350 = var46;
                            class45.field1351 = var47;
                        } else {
                            if (var14.field1155 == 7) {
                                class72 var54 = var14.field1159;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1138; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1117; ++var57) {
                                        if (var14.field1119[var55] > 0) {
                                            class1 var58 = class1.method7(var14.field1119[var55] - 1);
                                            String var59 = String.valueOf(var58.field22);
                                            if (var58.field4 || var14.field1135[var55] != 1) {
                                                var59 = var59 + " x" + method74(var14.field1135[var55], 932);
                                            }
                                            int var60 = (var14.field1163 + 115) * var57 + var15;
                                            int var61 = (var14.field1144 + 12) * var56 + var16;
                                            if (var14.field1130) {
                                                var54.method590(var14.field1148, var14.field1151, var59, var14.field1117 / 2 + var60, var61, 0);
                                            } else {
                                                var54.method597((byte) 3, var14.field1151, var59, var60, var14.field1148, var61);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1155 == 8 && (this.field254 == var14.field1170 || this.field329 == var14.field1170 || this.field493 == var14.field1170) && this.field600 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class72 var64 = this.field463;
                                String var65 = var14.field1126;
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
                                    int var74 = var64.method591(false, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1751 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1117 + var15 - 5 - var62;
                                int var67 = var14.field1138 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg3.field1117 + arg4) {
                                    var66 = arg3.field1117 + arg4 - var62;
                                }
                                if (var63 + var67 > arg3.field1138 + arg0) {
                                    var67 = arg3.field1138 + arg0 - var63;
                                }
                                class32.method315(16777120, this.field523, var66, var67, var63, var62);
                                class32.method316(var62, var67, var63, var66, 0, 0);
                                String var68 = var14.field1126;
                                int var69 = var64.field1751 + var67 + 2;
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
                                    var64.method597((byte) 3, false, var71, var66 + 3, 0, var69);
                                    var69 += var64.field1751 + 1;
                                }
                            }
                        }
                    }
                }
                class32.method312(var7, 0, var9, var8, var6);
                if (arg2 != 7) {
                    this.field311 = 438;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method86(int arg0) {
        if (arg0 != 9) {
            this.field444 = -1;
        }
        for (class11 var2 = (class11) this.field489.method340(); var2 != null; var2 = (class11) this.field489.method342(954)) {
            if (this.field653 == var2.field719 && !var2.field713) {
                if (field608 >= var2.field723) {
                    var2.method186(11509, this.field552);
                    if (var2.field713) {
                        var2.method41();
                    } else {
                        this.field667.method410(var2.field719, -1, 60, var2, var2.field721, var2.field720, 0, var2.field722, 11810, false);
                    }
                }
            } else {
                var2.method41();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method87(int arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            int var4 = 3 / arg0;
            String[] var5 = new String[100];
            int var6 = 0;
            while (true) {
                int var7 = var3.indexOf(" ");
                if (var7 == -1) {
                    String var9 = var3.trim();
                    if (var9.length() > 0) {
                        var5[var6++] = var9.toLowerCase();
                    }
                    this.field269 = 0;
                    label47: for (int var10 = 0; var10 < class1.field18; ++var10) {
                        class1 var11 = class1.method7(var10);
                        if (var11.field35 == -1 && var11.field22 != null) {
                            String var12 = var11.field22.toLowerCase();
                            for (int var13 = 0; var13 < var6; ++var13) {
                                if (var12.indexOf(var5[var13]) == -1) {
                                    continue label47;
                                }
                            }
                            this.field270[this.field269] = var12;
                            this.field271[this.field269] = var10;
                            ++this.field269;
                            if (this.field269 >= this.field270.length) {
                                return;
                            }
                        }
                    }
                    return;
                }
                String var8 = var3.substring(0, var7).trim();
                if (var8.length() > 0) {
                    var5[var6++] = var8.toLowerCase();
                }
                var3 = var3.substring(var7 + 1);
            }
        } else {
            this.field269 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)V")
    public final void method88(boolean arg0, int arg1, byte[] arg2) {
        if (this.field373) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg2, arg2.length);
            if (arg1 < 1 || arg1 > 1) {
                this.method19();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method89(int arg0) {
        for (int var2 = -1; var2 < this.field479; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field477;
            } else {
                var4 = this.field480[var2];
            }
            class53 var5 = this.field478[var4];
            if (var5 != null) {
                this.method124(var5, false, 1);
            }
        }
        ++field646;
        if (arg0 >= 0) {
            field532 = 175;
        }
        if (field646 > 1721) {
            field646 = 0;
            this.field230.method504(165, 1);
            this.field230.method505(0);
            int var3 = this.field230.field1615;
            this.field230.method505(224);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field230.method505(216);
            }
            this.field230.method505(6);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field230.method505(255);
            }
            this.field230.method506((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field230.method506(11572);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field230.method506(24447);
            }
            this.field230.method505(42);
            this.field230.method505((int) (Math.random() * 256.0D));
            this.field230.method506((int) (Math.random() * 65536.0D));
            this.field230.method514(this.field230.field1615 - var3, 371);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method90(int arg0) {
        this.method131(this.field669);
        if (this.field626 == 1) {
            this.field323[this.field625 / 100].method356(this.field623 - 8 - 4, this.field624 - 8 - 4, -973);
        }
        if (this.field626 == 2) {
            this.field323[this.field625 / 100 + 4].method356(this.field623 - 8 - 4, this.field624 - 8 - 4, -973);
        }
        if (this.field314 != -1) {
            this.method57(this.field552, (byte) 5, this.field314);
            this.method85(0, 0, this.field583, class34.method324(this.field314), 0);
        }
        if (this.field665 != -1) {
            this.method57(this.field552, (byte) 5, this.field665);
            this.method85(0, 0, this.field583, class34.method324(this.field665), 0);
        }
        this.method95(0);
        if (arg0 != 7484) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field389) {
            this.method122(this.field651);
            this.method166(47975);
        } else if (this.field450 == 0) {
            this.method105(true);
        }
        if (this.field394 == 1) {
            this.field322.method356(472, 296, -973);
        }
        if (field486) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field76 < 30 && field413) {
                var5 = 16711680;
            }
            if (super.field76 < 20 && !field413) {
                var5 = 16711680;
            }
            this.field463.method588(var5, var3, "Fps:" + super.field76, var4, 5);
            int var14 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field413) {
                int var9 = 16711680;
            }
            if (var7 > 67108864 && !field413) {
                int var10 = 16711680;
            }
            this.field463.method588(16776960, var3, "Mem:" + var7 + "k", var14, 5);
            var14 += 15;
        }
        if (this.field391 != 0) {
            int var11 = this.field391 / 50;
            int var12 = var11 / 60;
            int var13 = var11 % 60;
            if (var13 < 10) {
                this.field463.method593(false, 16776960, 329, "System update in: " + var12 + ":0" + var13, 4);
            } else {
                this.field463.method593(false, 16776960, 329, "System update in: " + var12 + ":" + var13, 4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method91(int arg0) {
        int var2 = this.field566 * 128 + 64;
        int var3 = this.field567 * 128 + 64;
        int var4 = this.method154(-760, this.field653, var2, var3) - this.field568;
        if (arg0 != 5745) {
            this.field407 = null;
        }
        if (this.field629 < var2) {
            this.field629 += (var2 - this.field629) * this.field570 / 1000 + this.field569;
            if (this.field629 > var2) {
                this.field629 = var2;
            }
        }
        if (this.field629 > var2) {
            this.field629 -= (this.field629 - var2) * this.field570 / 1000 + this.field569;
            if (this.field629 < var2) {
                this.field629 = var2;
            }
        }
        if (this.field630 < var4) {
            this.field630 += (var4 - this.field630) * this.field570 / 1000 + this.field569;
            if (this.field630 > var4) {
                this.field630 = var4;
            }
        }
        if (this.field630 > var4) {
            this.field630 -= (this.field630 - var4) * this.field570 / 1000 + this.field569;
            if (this.field630 < var4) {
                this.field630 = var4;
            }
        }
        if (this.field631 < var3) {
            this.field631 += (var3 - this.field631) * this.field570 / 1000 + this.field569;
            if (this.field631 > var3) {
                this.field631 = var3;
            }
        }
        if (this.field631 > var3) {
            this.field631 -= (this.field631 - var3) * this.field570 / 1000 + this.field569;
            if (this.field631 < var3) {
                this.field631 = var3;
            }
        }
        int var5 = this.field234 * 128 + 64;
        int var6 = this.field235 * 128 + 64;
        int var7 = this.method154(-760, this.field653, var5, var6) - this.field236;
        int var8 = var5 - this.field629;
        int var9 = var7 - this.field630;
        int var10 = var6 - this.field631;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field632 < var12) {
            this.field632 += (var12 - this.field632) * this.field238 / 1000 + this.field237;
            if (this.field632 > var12) {
                this.field632 = var12;
            }
        }
        if (this.field632 > var12) {
            this.field632 -= (this.field632 - var12) * this.field238 / 1000 + this.field237;
            if (this.field632 < var12) {
                this.field632 = var12;
            }
        }
        int var14 = var13 - this.field633;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field633 += this.field238 * var14 / 1000 + this.field237;
            this.field633 &= 2047;
        }
        if (var14 < 0) {
            this.field633 -= -var14 * this.field238 / 1000 + this.field237;
            this.field633 &= 2047;
        }
        int var15 = var13 - this.field633;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field633 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method92(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field610 >= 100 && this.field455 != 1) {
                this.method175((byte) 2, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field610 >= 200) {
                this.method175((byte) 2, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = class69.method582(class69.method579(this.field393, arg1), true);
                for (int var5 = 0; var5 < this.field610; ++var5) {
                    if (this.field220[var5] == arg1) {
                        this.method175((byte) 2, 0, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field303; ++var6) {
                    if (this.field383[var6] == arg1) {
                        this.method175((byte) 2, 0, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field378.field1554)) {
                    this.field388[this.field610] = var4;
                    this.field680 &= arg0;
                    this.field220[this.field610] = arg1;
                    this.field256[this.field610] = 0;
                    ++this.field610;
                    this.field350 = true;
                    this.field230.method504(186, 1);
                    this.field230.method511(arg1, -845);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
    public final void method93(byte arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field303; ++var4) {
                if (this.field383[var4] == arg1) {
                    --this.field303;
                    this.field350 = true;
                    for (int var5 = var4; var5 < this.field303; ++var5) {
                        this.field383[var5] = this.field383[var5 + 1];
                    }
                    this.field230.method504(17, 1);
                    this.field230.method511(arg1, -845);
                    break;
                }
            }
            if (arg0 == 6) {
                boolean var6 = false;
            } else {
                this.field666 = !this.field666;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLWBEWPIXO;)V")
    private final void method94(int arg0, boolean arg1, class58 arg2) {
        this.field508 = 0;
        if (!arg1) {
            this.field481 = 0;
            this.method182(arg0, 3, arg2);
            this.method48((byte) 103, arg0, arg2);
            this.method183((byte) -25, arg0, arg2);
            for (int var4 = 0; var4 < this.field508; ++var4) {
                int var6 = this.field509[var4];
                if (field608 != this.field404[var6].field181) {
                    this.field404[var6].field1410 = null;
                    this.field404[var6] = null;
                }
            }
            if (arg2.field1615 != arg0) {
                signlink.reporterror(this.field573 + " size mismatch in getnpcpos - pos:" + arg2.field1615 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field405; ++var5) {
                    if (this.field404[this.field406[var5]] == null) {
                        signlink.reporterror(this.field573 + " null entry in npc list - pos:" + var5 + " size:" + this.field405);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method95(int arg0) {
        if (arg0 != 0) {
            this.field666 = !this.field666;
        }
        this.field622 = 0;
        int var2 = (field378.field211 >> 7) + this.field541;
        int var3 = (field378.field212 >> 7) + this.field542;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field622 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field622 = 1;
        }
        if (this.field622 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field622 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method96(int arg0) {
        if (arg0 != 0) {
            this.field666 = !this.field666;
        }
        if (this.field260 == 0) {
            int var2 = super.field78 / 2 - 80;
            int var3 = super.field79 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field94 == 1 && super.field95 >= var2 - 75 && super.field95 <= var2 + 75 && super.field96 >= var14 - 20 && super.field96 <= var14 + 20) {
                this.field260 = 3;
                this.field409 = 0;
            }
            int var4 = super.field78 / 2 + 80;
            if (super.field94 == 1 && super.field95 >= var4 - 75 && super.field95 <= var4 + 75 && super.field96 >= var14 - 20 && super.field96 <= var14 + 20) {
                this.field434 = "";
                this.field435 = "Enter your username & password.";
                this.field260 = 2;
                this.field409 = 0;
            }
        } else if (this.field260 == 2) {
            int var5 = super.field79 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field94 == 1 && super.field96 >= var16 - 15 && super.field96 < var16) {
                this.field409 = 0;
            }
            var5 = var16 + 15;
            if (super.field94 == 1 && super.field96 >= var5 - 15 && super.field96 < var5) {
                this.field409 = 1;
            }
            var5 += 15;
            int var6 = super.field78 / 2 - 80;
            int var7 = super.field79 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field94 == 1 && super.field95 >= var6 - 75 && super.field95 <= var6 + 75 && super.field96 >= var17 - 20 && super.field96 <= var17 + 20) {
                this.field231 = 0;
                this.method108(this.field573, this.field574, false);
                if (this.field680) {
                    return;
                }
            }
            int var8 = super.field78 / 2 + 80;
            if (super.field94 == 1 && super.field95 >= var8 - 75 && super.field95 <= var8 + 75 && super.field96 >= var17 - 20 && super.field96 <= var17 + 20) {
                this.field260 = 0;
                this.field573 = "";
                this.field574 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method18(-239);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field296.length(); ++var11) {
                        if (var9 == field296.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field409 == 0) {
                        if (var9 == 8 && this.field573.length() > 0) {
                            this.field573 = this.field573.substring(0, this.field573.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field409 = 1;
                        }
                        if (var10) {
                            this.field573 = this.field573 + (char) var9;
                        }
                        if (this.field573.length() > 12) {
                            this.field573 = this.field573.substring(0, 12);
                        }
                    } else if (this.field409 == 1) {
                        if (var9 == 8 && this.field574.length() > 0) {
                            this.field574 = this.field574.substring(0, this.field574.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field409 = 0;
                        }
                        if (var10) {
                            this.field574 = this.field574 + (char) var9;
                        }
                        if (this.field574.length() > 20) {
                            this.field574 = this.field574.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field260 == 3) {
                int var12 = super.field78 / 2;
                int var13 = super.field79 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field94 == 1 && super.field95 >= var12 - 75 && super.field95 <= var12 + 75 && super.field96 >= var18 - 20 && super.field96 <= var18 + 20) {
                    this.field260 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LMRUJPFPS;Z)Z")
    public final boolean method97(class34 arg0, boolean arg1) {
        this.field680 &= arg1;
        int var3 = arg0.field1115;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field302[this.field694] = "Remove @whi@" + arg0.field1126;
                this.field290[this.field694] = 34;
                ++this.field694;
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
            this.field302[this.field694] = "Remove @whi@" + this.field388[var3];
            this.field290[this.field694] = 169;
            ++this.field694;
            this.field302[this.field694] = "Message @whi@" + this.field388[var3];
            this.field290[this.field694] = 956;
            ++this.field694;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field667.method425(arg2, arg5, arg4);
        if (var7 != 0) {
            int var8 = this.field667.method429(arg2, arg5, arg4, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg0;
            if (var7 > 0) {
                var11 = arg1;
            }
            int[] var12 = this.field513.field1281;
            int var13 = (103 - arg4) * 512 * 4 + arg5 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class22 var15 = class22.method246(var14);
            if (var15.field880 != -1) {
                class41 var16 = this.field605[var15.field880];
                if (var16 != null) {
                    int var17 = (var15.field904 * 4 - var16.field1294) / 2;
                    int var18 = (var15.field893 * 4 - var16.field1295) / 2;
                    var16.method369(arg5 * 4 + 48 + var17, (104 - arg4 - var15.field893) * 4 + 48 + var18, -973);
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
        int var19 = this.field667.method427(arg2, arg5, arg4);
        if (var19 != 0) {
            int var20 = this.field667.method429(arg2, arg5, arg4, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class22 var24 = class22.method246(var23);
            if (var24.field880 != -1) {
                class41 var25 = this.field605[var24.field880];
                if (var25 != null) {
                    int var26 = (var24.field904 * 4 - var25.field1294) / 2;
                    int var27 = (var24.field893 * 4 - var25.field1295) / 2;
                    var25.method369(arg5 * 4 + 48 + var26, (104 - arg4 - var24.field893) * 4 + 48 + var27, -973);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field513.field1281;
                int var30 = (103 - arg4) * 512 * 4 + arg5 * 4 + 24624;
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
        int var31 = this.field667.method428(arg2, arg5, arg4);
        if (arg3 != 48544) {
            this.field230.method505(137);
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class22 var33 = class22.method246(var32);
            if (var33.field880 != -1) {
                class41 var34 = this.field605[var33.field880];
                if (var34 != null) {
                    int var35 = (var33.field904 * 4 - var34.field1294) / 2;
                    int var36 = (var33.field893 * 4 - var34.field1295) / 2;
                    var34.method369(arg5 * 4 + 48 + var35, (104 - arg4 - var33.field893) * 4 + 48 + var36, -973);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILMRUJPFPS;IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, class34 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != -31429) {
            this.method19();
        }
        if (this.field415) {
            this.field577 = 32;
        } else {
            this.field577 = 0;
        }
        this.field415 = false;
        if (arg4 >= arg1 && arg4 < arg1 + 16 && arg5 >= arg6 && arg5 < arg6 + 16) {
            arg3.field1118 -= this.field602 * 4;
            if (arg8 == 1) {
                this.field350 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field636 = true;
            }
        } else if (arg4 >= arg1 && arg4 < arg1 + 16 && arg5 >= arg0 + arg6 - 16 && arg5 < arg0 + arg6) {
            arg3.field1118 += this.field602 * 4;
            if (arg8 == 1) {
                this.field350 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field636 = true;
            }
        } else if (arg4 >= arg1 - this.field577 && arg4 < arg1 + 16 + this.field577 && arg5 >= arg6 + 16 && arg5 < arg0 + arg6 - 16 && this.field602 > 0) {
            int var10 = (arg0 - 32) * arg0 / arg7;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg5 - arg6 - 16 - var10 / 2;
            int var12 = arg0 - 32 - var10;
            arg3.field1118 = (arg7 - arg0) * var11 / var12;
            if (arg8 == 1) {
                this.field350 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field636 = true;
            }
            this.field415 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        try {
            this.field218 = -1;
            this.field489.method344();
            this.field603.method344();
            class45.method375(29798);
            this.method77((byte) 1);
            this.field667.method399(843);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field335[var2].method27();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field331[var3][var4][var5] = 0;
                    }
                }
            }
            class24 var6 = new class24(104, this.field331, 214, 104, this.field282);
            int var7 = this.field293.length;
            this.field230.method504(44, 1);
            if (!this.field252) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field399[var8] >> 8) * 64 - this.field541;
                    int var10 = (this.field399[var8] & 255) * 64 - this.field542;
                    byte[] var11 = this.field293[var8];
                    if (var11 != null) {
                        var6.method266(var10, (this.field225 - 6) * 8, var9, this.field335, var11, false, (this.field224 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field399[var12] >> 8) * 64 - this.field541;
                    int var14 = (this.field399[var12] & 255) * 64 - this.field542;
                    byte[] var15 = this.field293[var12];
                    if (var15 == null && this.field225 < 800) {
                        var6.method264(64, var14, var13, 64, (byte) 51);
                    }
                }
                this.field230.method504(44, 1);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field472[var16];
                    if (var17 != null) {
                        int var18 = (this.field399[var16] >> 8) * 64 - this.field541;
                        int var19 = (this.field399[var16] & 255) * 64 - this.field542;
                        var6.method267(this.field667, var19, -21446, this.field335, var18, var17);
                    }
                }
            }
            if (this.field252) {
                int var20 = 0;
                label256: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field228[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method264(8, var32 * 8, var31 * 8, 8, (byte) 51);
                                }
                            }
                        }
                        this.field230.method504(44, 1);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label256;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field228[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field399.length; ++var43) {
                                            if (this.field399[var43] == var42 && this.field472[var43] != null) {
                                                var6.method248(var39, (var40 & 7) * 8, var36 * 8, var34, this.field335, (byte) 9, var35 * 8, (var41 & 7) * 8, this.field472[var43], var38, this.field667);
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
                            int var24 = this.field228[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field399.length; ++var30) {
                                    if (this.field399[var30] == var29 && this.field293[var30] != null) {
                                        var6.method268((byte) -81, var25, (var28 & 7) * 8, (var27 & 7) * 8, var20, var21 * 8, var26, this.field293[var30], var22 * 8, this.field335);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method265((byte) 8, var22 * 8, var21 * 8, var20);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field230.method504(44, 1);
            var6.method263(this.field335, this.field667, 1);
            if (this.field558 != null) {
                this.field558.method273(1);
                class45.field1356 = this.field366;
            }
            this.field230.method504(44, 1);
            int var44 = class24.field931;
            if (var44 > this.field653) {
                var44 = this.field653;
            }
            if (var44 < this.field653 - 1) {
                int var45 = this.field653 - 1;
            }
            if (field413) {
                this.field667.method400(-678, class24.field931);
            } else {
                this.field667.method400(-678, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method112(var46, var47);
                }
            }
            this.method172(this.field308);
        } catch (Exception var60) {
        }
        class22.field859.method336();
        if (super.field83 != null) {
            this.field230.method504(56, 1);
            this.field230.method509(1057001181);
        }
        if (field413 && signlink.cache_dat != null) {
            int var49 = this.field702.method293((byte) 4, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field702.method287(true, var50);
                if ((var51 & 121) == 0) {
                    class19.method198(4, var50);
                }
            }
        }
        System.gc();
        class45.method376(20, (byte) 121);
        if (!arg0) {
            this.field702.method285(564);
            int var52 = (this.field224 - 6) / 8 - 1;
            int var53 = (this.field224 + 6) / 8 + 1;
            int var54 = (this.field225 - 6) / 8 - 1;
            int var55 = (this.field225 + 6) / 8 + 1;
            if (this.field295) {
                var52 = 49;
                var53 = 50;
                var54 = 49;
                var55 = 50;
            }
            for (int var56 = var52; var56 <= var53; ++var56) {
                for (int var57 = var54; var57 <= var55; ++var57) {
                    if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                        int var58 = this.field702.method277(0, var56, var57, 0);
                        if (var58 != -1) {
                            this.field702.method280(-951, 3, var58);
                        }
                        int var59 = this.field702.method277(0, var56, var57, 1);
                        if (var59 != -1) {
                            this.field702.method280(-951, 3, var59);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public final boolean method101(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        this.field443 += arg0;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field427[var15][var39] = 0;
                this.field375[var15][var39] = 99999999;
            }
        }
        int var16 = arg8;
        int var17 = arg5;
        this.field427[arg8][arg5] = 99;
        this.field375[arg8][arg5] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field703[var18] = arg8;
        int var40 = var18 + 1;
        this.field704[var18] = arg5;
        boolean var20 = false;
        int var21 = this.field703.length;
        int[][] var22 = this.field335[this.field653].field134;
        while (var40 != var19) {
            var16 = this.field703[var19];
            var17 = this.field704[var19];
            var19 = (var19 + 1) % var21;
            if (arg6 == var16 && arg9 == var17) {
                var20 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && this.field335[this.field653].method36(arg6, arg9, 0, arg1 - 1, var16, var17, arg4)) {
                    var20 = true;
                    break;
                }
                if (arg1 < 10 && this.field335[this.field653].method37(arg4, arg1 - 1, var16, arg6, 394, arg9, var17)) {
                    var20 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg3 != 0 && this.field335[this.field653].method38(arg11, var17, arg6, 213, arg3, arg10, var16, arg9)) {
                var20 = true;
                break;
            }
            int var38 = this.field375[var16][var17] + 1;
            if (var16 > 0 && this.field427[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field703[var40] = var16 - 1;
                this.field704[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field427[var16 - 1][var17] = 2;
                this.field375[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field427[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field703[var40] = var16 + 1;
                this.field704[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field427[var16 + 1][var17] = 8;
                this.field375[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field427[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field703[var40] = var16;
                this.field704[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field427[var16][var17 - 1] = 1;
                this.field375[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field427[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field703[var40] = var16;
                this.field704[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field427[var16][var17 + 1] = 4;
                this.field375[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field427[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field703[var40] = var16 - 1;
                this.field704[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field427[var16 - 1][var17 - 1] = 3;
                this.field375[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field427[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field703[var40] = var16 + 1;
                this.field704[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field427[var16 + 1][var17 - 1] = 9;
                this.field375[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field427[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field703[var40] = var16 - 1;
                this.field704[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field427[var16 - 1][var17 + 1] = 6;
                this.field375[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field427[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field703[var40] = var16 + 1;
                this.field704[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field427[var16 + 1][var17 + 1] = 12;
                this.field375[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field674 = 0;
        if (!var20) {
            if (!arg2) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg6 - var25; var26 <= arg6 + var25; ++var26) {
                for (int var27 = arg9 - var25; var27 <= arg9 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field375[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg6) {
                            var28 = arg6 - var26;
                        } else if (var26 > arg6 + arg10 - 1) {
                            var28 = var26 - (arg6 + arg10 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg9) {
                            var29 = arg9 - var27;
                        } else if (var27 > arg3 + arg9 - 1) {
                            var29 = var27 - (arg3 + arg9 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field375[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field375[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg8 == var16 && arg5 == var17) {
                return false;
            }
            this.field674 = 1;
        }
        byte var31 = 0;
        this.field703[var31] = var16;
        int var41 = var31 + 1;
        this.field704[var31] = var17;
        int var32;
        int var33 = var32 = this.field427[var16][var17];
        while (arg8 != var16 || arg5 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field703[var41] = var16;
                this.field704[var41++] = var17;
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
            var33 = this.field427[var16][var17];
        }
        if (var41 <= 0) {
            if (arg7 == 1) {
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
            int var35 = this.field703[var41];
            int var36 = this.field704[var41];
            if (arg7 == 0) {
                this.field230.method504(72, 1);
                this.field230.method505(var34 + var34 + 3);
            }
            if (arg7 == 1) {
                this.field230.method504(79, 1);
                this.field230.method505(var34 + var34 + 3 + 14);
            }
            if (arg7 == 2) {
                this.field230.method504(4, 1);
                this.field230.method505(var34 + var34 + 3);
            }
            this.field511 = this.field703[0];
            this.field512 = this.field704[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field230.method505(this.field703[var41] - var35);
                this.field230.method505(this.field704[var41] - var36);
            }
            this.field230.method505(super.field98[5] == 1 ? 1 : 0);
            this.field230.method506(this.field541 + var35);
            this.field230.method539(this.field542 + var36, 6573);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method102(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field391 > 1) {
            --this.field391;
        }
        if (this.field447 > 0) {
            --this.field447;
        }
        for (int var3 = 0; var3 < 5 && this.method109(0); ++var3) {
        }
        if (this.field680) {
            Object var4 = this.field379.field1502;
            synchronized (this.field379.field1502) {
                if (!field496) {
                    this.field379.field1506 = 0;
                } else if (super.field94 != 0 || this.field379.field1506 >= 40) {
                    this.field230.method504(57, 1);
                    this.field230.method505(0);
                    int var5 = this.field230.field1615;
                    int var6 = 0;
                    for (int var7 = 0; var7 < this.field379.field1506 && var5 - this.field230.field1615 < 240; ++var7) {
                        ++var6;
                        int var8 = this.field379.field1501[var7];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 502) {
                            var8 = 502;
                        }
                        int var9 = this.field379.field1500[var7];
                        if (var9 < 0) {
                            var9 = 0;
                        } else if (var9 > 764) {
                            var9 = 764;
                        }
                        int var10 = var8 * 765 + var9;
                        if (this.field379.field1501[var7] == -1 && this.field379.field1500[var7] == -1) {
                            var9 = -1;
                            var8 = -1;
                            var10 = 524287;
                        }
                        if (this.field248 == var9 && this.field249 == var8) {
                            if (this.field553 < 2047) {
                                ++this.field553;
                            }
                        } else {
                            int var11 = var9 - this.field248;
                            this.field248 = var9;
                            int var12 = var8 - this.field249;
                            this.field249 = var8;
                            if (this.field553 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                var11 += 32;
                                var12 += 32;
                                this.field230.method506((this.field553 << 12) + (var11 << 6) + var12);
                                this.field553 = 0;
                            } else if (this.field553 < 8) {
                                this.field230.method508((this.field553 << 19) + 8388608 + var10);
                                this.field553 = 0;
                            } else {
                                this.field230.method509((this.field553 << 19) + -1073741824 + var10);
                                this.field553 = 0;
                            }
                        }
                    }
                    this.field230.method514(this.field230.field1615 - var5, 371);
                    if (var6 >= this.field379.field1506) {
                        this.field379.field1506 = 0;
                    } else {
                        this.field379.field1506 -= var6;
                        for (int var13 = 0; var13 < this.field379.field1506; ++var13) {
                            this.field379.field1500[var13] = this.field379.field1500[var6 + var13];
                            this.field379.field1501[var13] = this.field379.field1501[var6 + var13];
                        }
                    }
                }
            }
            if (super.field94 != 0) {
                long var14 = (super.field97 - this.field341) / 50L;
                if (var14 > 4095L) {
                    var14 = 4095L;
                }
                this.field341 = super.field97;
                int var16 = super.field96;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 502) {
                    var16 = 502;
                }
                int var17 = super.field95;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 764) {
                    var17 = 764;
                }
                int var18 = var16 * 765 + var17;
                byte var19 = 0;
                if (super.field94 == 2) {
                    var19 = 1;
                }
                int var20 = (int) var14;
                this.field230.method504(184, 1);
                this.field230.method547((byte) 7, (var19 << 19) + (var20 << 20) + var18);
            }
            if (this.field279 > 0) {
                --this.field279;
            }
            if (super.field98[1] == 1 || super.field98[2] == 1 || super.field98[3] == 1 || super.field98[4] == 1) {
                this.field280 = true;
            }
            if (this.field280 && this.field279 <= 0) {
                this.field279 = 20;
                this.field280 = false;
                this.field230.method504(136, 1);
                this.field230.method540(this.field634, this.field579);
                this.field230.method540(this.field634, this.field578);
            }
            if (super.field85 && !this.field380) {
                this.field380 = true;
                this.field230.method504(251, 1);
                this.field230.method505(1);
            }
            if (!super.field85 && this.field380) {
                this.field380 = false;
                this.field230.method504(251, 1);
                this.field230.method505(0);
            }
            this.method83((byte) 8);
            this.method71(0);
            this.method69((byte) 7);
            ++this.field445;
            if (this.field445 > 750) {
                this.method65(13228);
            }
            this.method89(-368);
            this.method123(28319);
            this.method140((byte) 9);
            ++this.field552;
            if (this.field626 != 0) {
                this.field625 += 20;
                if (this.field625 >= 400) {
                    this.field626 = 0;
                }
            }
            if (this.field470 != 0) {
                ++this.field467;
                if (this.field467 >= 15) {
                    if (this.field470 == 2) {
                        this.field350 = true;
                    }
                    if (this.field470 == 3) {
                        this.field636 = true;
                    }
                    this.field470 = 0;
                }
            }
            if (this.field538 != 0) {
                ++this.field327;
                if (super.field88 > this.field539 + 5 || super.field88 < this.field539 - 5 || super.field89 > this.field540 + 5 || super.field89 < this.field540 - 5) {
                    this.field261 = true;
                }
                if (super.field87 == 0) {
                    if (this.field538 == 2) {
                        this.field350 = true;
                    }
                    if (this.field538 == 3) {
                        this.field636 = true;
                    }
                    this.field538 = 0;
                    if (this.field261 && this.field327 >= 5) {
                        this.field505 = -1;
                        this.method122(this.field651);
                        if (this.field536 == this.field505 && this.field537 != this.field504) {
                            class34 var21 = class34.method324(this.field536);
                            byte var22 = 0;
                            if (this.field488 == 1 && var21.field1115 == 206) {
                                var22 = 1;
                            }
                            if (var21.field1119[this.field504] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field1113) {
                                int var23 = this.field537;
                                int var24 = this.field504;
                                var21.field1119[var24] = var21.field1119[var23];
                                var21.field1135[var24] = var21.field1135[var23];
                                var21.field1119[var23] = -1;
                                var21.field1135[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field537;
                                int var26 = this.field504;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method327(var25 - 1, 797, var25);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method327(var25 + 1, 797, var25);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method327(this.field504, 797, this.field537);
                            }
                            this.field230.method504(194, 1);
                            this.field230.method506(this.field537);
                            this.field230.method540(this.field634, this.field536);
                            this.field230.method539(this.field504, 6573);
                            this.field230.method505(var22);
                        }
                    } else if ((this.field530 == 1 || this.method153(this.field694 - 1, -212)) && this.field694 > 2) {
                        this.method133(8);
                    } else if (this.field694 > 0) {
                        this.method177(true, this.field694 - 1);
                    }
                    this.field467 = 10;
                    super.field94 = 0;
                }
            }
            if (class48.field1456 != -1) {
                int var27 = class48.field1456;
                int var28 = class48.field1457;
                boolean var29 = this.method101(0, 0, true, 0, 0, field378.field161[0], var27, 0, field378.field160[0], var28, 0, 0);
                class48.field1456 = -1;
                if (var29) {
                    this.field623 = super.field95;
                    this.field624 = super.field96;
                    this.field626 = 1;
                    this.field625 = 0;
                }
            }
            if (super.field94 == 1 && this.field697 != null) {
                this.field697 = null;
                this.field636 = true;
                super.field94 = 0;
            }
            this.method174((byte) 6);
            if (this.field576 == -1) {
                this.method163(247);
                this.method76(3);
                this.method159(3);
            }
            if (super.field87 == 1 || super.field94 == 1) {
                ++this.field602;
            }
            if (this.field254 == 0 && this.field329 == 0 && this.field493 == 0) {
                if (this.field600 > 0) {
                    --this.field600;
                }
            } else if (this.field600 < 100) {
                ++this.field600;
                if (this.field600 == 100) {
                    if (this.field254 != 0) {
                        this.field636 = true;
                    }
                    if (this.field329 != 0) {
                        this.field350 = true;
                    }
                }
            }
            if (this.field650 == 2) {
                this.method132(-806);
            }
            if (this.field650 == 2 && this.field686) {
                this.method91(5745);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field627[var30]++;
            }
            this.method137(false);
            ++super.field86;
            if (super.field86 > 4500) {
                this.field447 = 250;
                super.field86 -= 500;
                this.field230.method504(84, 1);
            }
            ++this.field495;
            if (this.field495 > 500) {
                this.field495 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field705 += this.field706;
                }
                if ((var31 & 2) == 2) {
                    this.field671 += this.field672;
                }
                if ((var31 & 4) == 4) {
                    this.field432 += this.field433;
                }
            }
            if (this.field705 < -50) {
                this.field706 = 2;
            }
            if (this.field705 > 50) {
                this.field706 = -2;
            }
            if (this.field671 < -55) {
                this.field672 = 2;
            }
            if (this.field671 > 55) {
                this.field672 = -2;
            }
            if (this.field432 < -40) {
                this.field433 = 1;
            }
            if (this.field432 > 40) {
                this.field433 = -1;
            }
            ++this.field690;
            if (this.field690 > 500) {
                this.field690 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field300 += this.field301;
                }
                if ((var32 & 2) == 2) {
                    this.field598 += this.field599;
                }
            }
            if (this.field300 < -60) {
                this.field301 = 2;
            }
            if (this.field300 > 60) {
                this.field301 = -2;
            }
            if (this.field598 < -20) {
                this.field599 = 1;
            }
            if (this.field598 > 10) {
                this.field599 = -1;
            }
            ++this.field446;
            if (this.field446 > 50) {
                this.field230.method504(44, 1);
            }
            try {
                if (this.field281 != null && this.field230.field1615 > 0) {
                    this.field281.method308(this.field230.field1615, true, this.field230.field1614, 0);
                    this.field230.field1615 = 0;
                    this.field446 = 0;
                }
            } catch (IOException var34) {
                this.method65(13228);
            } catch (Exception var35) {
                this.method170((byte) 8);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILBIWICTTN;)V")
    private final void method103(int arg0, class8 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field149 == 0) {
            var3 = this.field667.method425(arg1.field148, arg1.field150, arg1.field151);
        }
        if (arg1.field149 == 1) {
            var3 = this.field667.method426(arg1.field148, 40041, arg1.field151, arg1.field150);
        }
        if (arg1.field149 == 2) {
            var3 = this.field667.method427(arg1.field148, arg1.field150, arg1.field151);
        }
        if (arg1.field149 == 3) {
            var3 = this.field667.method428(arg1.field148, arg1.field150, arg1.field151);
        }
        if (var3 != 0) {
            int var7 = this.field667.method429(arg1.field148, arg1.field150, arg1.field151, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field143 = var4;
        if (arg0 >= 0) {
            this.method19();
        }
        arg1.field145 = var5;
        arg1.field144 = var6;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILMRUJPFPS;IIII)V")
    public final void method104(int arg0, int arg1, int arg2, class34 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3.field1155 == 0 && arg3.field1162 != null && !arg3.field1150) {
            if (arg5 >= arg1 && arg4 >= arg7 && arg5 <= arg3.field1117 + arg1 && arg4 <= arg3.field1138 + arg7) {
                int var9 = arg3.field1162.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg3.field1141[var10] + arg1;
                    int var12 = arg3.field1161[var10] + arg7 - arg6;
                    class34 var13 = class34.method324(arg3.field1162[var10]);
                    int var14 = var13.field1175 + var11;
                    int var15 = var13.field1164 + var12;
                    if ((var13.field1166 >= 0 || var13.field1176 != 0) && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field1117 + var14 && arg4 < var13.field1138 + var15) {
                        if (var13.field1166 >= 0) {
                            this.field395 = var13.field1166;
                        } else {
                            this.field395 = var13.field1170;
                        }
                    }
                    if (var13.field1155 == 8 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field1117 + var14 && arg4 < var13.field1138 + var15) {
                        this.field679 = var13.field1170;
                    }
                    if (var13.field1155 == 0) {
                        this.method104(0, var14, arg2, var13, arg4, arg5, var13.field1118, var15);
                        if (var13.field1181 > var13.field1138) {
                            this.method99(var13.field1138, var13.field1117 + var14, -31429, var13, arg5, arg4, var15, var13.field1181, arg2);
                        }
                    } else {
                        if (var13.field1178 == 1 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field1117 + var14 && arg4 < var13.field1138 + var15) {
                            boolean var16 = false;
                            if (var13.field1115 != 0) {
                                var16 = this.method97(var13, true);
                            }
                            if (!var16) {
                                this.field302[this.field694] = var13.field1147;
                                this.field290[this.field694] = 120;
                                this.field289[this.field694] = var13.field1170;
                                ++this.field694;
                            }
                        }
                        if (var13.field1178 == 2 && this.field457 == 0 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field1117 + var14 && arg4 < var13.field1138 + var15) {
                            String var17 = var13.field1149;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field302[this.field694] = var17 + " @gre@" + var13.field1185;
                            this.field290[this.field694] = 457;
                            this.field289[this.field694] = var13.field1170;
                            ++this.field694;
                        }
                        if (var13.field1178 == 3 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field1117 + var14 && arg4 < var13.field1138 + var15) {
                            this.field302[this.field694] = "Close";
                            if (arg2 == 3) {
                                this.field290[this.field694] = 431;
                            } else {
                                this.field290[this.field694] = 542;
                            }
                            this.field289[this.field694] = var13.field1170;
                            ++this.field694;
                        }
                        if (var13.field1178 == 4 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field1117 + var14 && arg4 < var13.field1138 + var15) {
                            this.field302[this.field694] = var13.field1147;
                            this.field290[this.field694] = 878;
                            this.field289[this.field694] = var13.field1170;
                            ++this.field694;
                        }
                        if (var13.field1178 == 5 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field1117 + var14 && arg4 < var13.field1138 + var15) {
                            this.field302[this.field694] = var13.field1147;
                            this.field290[this.field694] = 917;
                            this.field289[this.field694] = var13.field1170;
                            ++this.field694;
                        }
                        if (var13.field1178 == 6 && !this.field531 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field1117 + var14 && arg4 < var13.field1138 + var15) {
                            this.field302[this.field694] = var13.field1147;
                            this.field290[this.field694] = 293;
                            this.field289[this.field694] = var13.field1170;
                            ++this.field694;
                        }
                        if (var13.field1155 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1138; ++var19) {
                                for (int var20 = 0; var20 < var13.field1117; ++var20) {
                                    int var21 = (var13.field1163 + 32) * var20 + var14;
                                    int var22 = (var13.field1144 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1188[var18];
                                        var22 += var13.field1180[var18];
                                    }
                                    if (arg5 >= var21 && arg4 >= var22 && arg5 < var21 + 32 && arg4 < var22 + 32) {
                                        this.field504 = var18;
                                        this.field505 = var13.field1170;
                                        if (var13.field1119[var18] > 0) {
                                            class1 var23 = class1.method7(var13.field1119[var18] - 1);
                                            if (this.field352 == 1 && var13.field1146) {
                                                if (this.field354 != var13.field1170 || this.field353 != var18) {
                                                    this.field302[this.field694] = "Use " + this.field356 + " with @lre@" + var23.field22;
                                                    this.field290[this.field694] = 576;
                                                    this.field291[this.field694] = var23.field11;
                                                    this.field288[this.field694] = var18;
                                                    this.field289[this.field694] = var13.field1170;
                                                    ++this.field694;
                                                }
                                            } else if (this.field457 == 1 && var13.field1146) {
                                                if ((this.field459 & 16) == 16) {
                                                    this.field302[this.field694] = this.field460 + " @lre@" + var23.field22;
                                                    this.field290[this.field694] = 974;
                                                    this.field291[this.field694] = var23.field11;
                                                    this.field288[this.field694] = var18;
                                                    this.field289[this.field694] = var13.field1170;
                                                    ++this.field694;
                                                }
                                            } else {
                                                if (var13.field1146) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field16 != null && var23.field16[var24] != null) {
                                                            this.field302[this.field694] = var23.field16[var24] + " @lre@" + var23.field22;
                                                            if (var24 == 3) {
                                                                this.field290[this.field694] = 501;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field290[this.field694] = 837;
                                                            }
                                                            this.field291[this.field694] = var23.field11;
                                                            this.field288[this.field694] = var18;
                                                            this.field289[this.field694] = var13.field1170;
                                                            ++this.field694;
                                                        } else if (var24 == 4) {
                                                            this.field302[this.field694] = "Drop @lre@" + var23.field22;
                                                            this.field290[this.field694] = 837;
                                                            this.field291[this.field694] = var23.field11;
                                                            this.field288[this.field694] = var18;
                                                            this.field289[this.field694] = var13.field1170;
                                                            ++this.field694;
                                                        }
                                                    }
                                                }
                                                if (var13.field1184) {
                                                    this.field302[this.field694] = "Use @lre@" + var23.field22;
                                                    this.field290[this.field694] = 888;
                                                    this.field291[this.field694] = var23.field11;
                                                    this.field288[this.field694] = var18;
                                                    this.field289[this.field694] = var13.field1170;
                                                    ++this.field694;
                                                }
                                                if (var13.field1146 && var23.field16 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field16[var25] != null) {
                                                            this.field302[this.field694] = var23.field16[var25] + " @lre@" + var23.field22;
                                                            if (var25 == 0) {
                                                                this.field290[this.field694] = 620;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field290[this.field694] = 5;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field290[this.field694] = 121;
                                                            }
                                                            this.field291[this.field694] = var23.field11;
                                                            this.field288[this.field694] = var18;
                                                            this.field289[this.field694] = var13.field1170;
                                                            ++this.field694;
                                                        }
                                                    }
                                                }
                                                if (var13.field1116 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1116[var26] != null) {
                                                            this.field302[this.field694] = var13.field1116[var26] + " @lre@" + var23.field22;
                                                            if (var26 == 0) {
                                                                this.field290[this.field694] = 219;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field290[this.field694] = 915;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field290[this.field694] = 486;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field290[this.field694] = 463;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field290[this.field694] = 343;
                                                            }
                                                            this.field291[this.field694] = var23.field11;
                                                            this.field288[this.field694] = var18;
                                                            this.field289[this.field694] = var13.field1170;
                                                            ++this.field694;
                                                        }
                                                    }
                                                }
                                                this.field302[this.field694] = "Examine @lre@" + var23.field22;
                                                this.field290[this.field694] = 1940;
                                                this.field291[this.field694] = var23.field11;
                                                this.field288[this.field694] = var18;
                                                this.field289[this.field694] = var13.field1170;
                                                ++this.field694;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
                if (arg0 != 0) {
                    this.field230.method505(122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method105(boolean arg0) {
        if (arg0) {
            int var2 = this.field451;
            int var3 = this.field452;
            int var4 = this.field453;
            int var5 = this.field454;
            int var6 = 6116423;
            class32.method315(var6, this.field523, var2, var3, var5, var4);
            class32.method315(0, this.field523, var2 + 1, var3 + 1, 16, var4 - 2);
            class32.method316(var4 - 2, var3 + 18, var5 - 19, var2 + 1, 0, 0);
            this.field464.method593(false, var6, var3 + 14, "Choose Option", var2 + 3);
            int var7 = super.field88;
            int var8 = super.field89;
            if (this.field450 == 0) {
                var7 -= 4;
                var8 -= 4;
            }
            if (this.field450 == 1) {
                var7 -= 553;
                var8 -= 205;
            }
            if (this.field450 == 2) {
                var7 -= 17;
                var8 -= 357;
            }
            for (int var9 = 0; var9 < this.field694; ++var9) {
                int var10 = (this.field694 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field464.method597((byte) 3, true, this.field302[var9], var2 + 3, var11, var10);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)Z")
    public final boolean method106(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field667.method429(this.field653, arg1, arg3, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            ++field421;
            if (field421 > 103) {
                field421 = 0;
                this.field230.method504(208, 1);
                this.field230.method505(55);
            }
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method101(0, var7 + 1, true, 0, var8, field378.field161[0], arg1, 2, field378.field160[0], arg3, 0, 0);
            } else {
                class22 var9 = class22.method246(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field893;
                    var11 = var9.field904;
                } else {
                    var10 = var9.field904;
                    var11 = var9.field893;
                }
                int var12 = var9.field874;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method101(0, 0, true, var11, 0, field378.field161[0], arg1, 2, field378.field160[0], arg3, var10, var12);
            }
            this.field623 = super.field95;
            this.field624 = super.field96;
            this.field626 = 2;
            this.field625 = 0;
            if (this.field294 != arg2) {
                this.field676 = this.field688.method558();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method107(boolean arg0, int arg1) {
        if (this.field438 != arg1) {
            this.field230.method505(204);
        }
        if (field378.field211 >> 7 == this.field511 && field378.field212 >> 7 == this.field512) {
            this.field511 = 0;
        }
        int var3 = this.field479;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class53 var5;
            int var6;
            if (arg0) {
                var5 = field378;
                var6 = this.field477 << 14;
            } else {
                var5 = this.field478[this.field480[var4]];
                var6 = this.field480[var4] << 14;
            }
            if (var5 != null && var5.method42(5)) {
                var5.field1537 = false;
                if ((field413 && this.field479 > 50 || this.field479 > 200) && !arg0 && var5.field215 == var5.field162) {
                    var5.field1537 = true;
                }
                int var7 = var5.field211 >> 7;
                int var8 = var5.field212 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1551 != null && field608 >= var5.field1541 && field608 < var5.field1542) {
                        var5.field1537 = false;
                        var5.field1547 = this.method154(-760, this.field653, var5.field211, var5.field212);
                        this.field667.method411(var5.field1528, var5.field1530, true, 60, var5, var6, var5.field1527, var5.field1529, var5.field213, var5.field212, var5.field1547, var5.field211, this.field653);
                    } else {
                        if ((var5.field211 & 127) == 64 && (var5.field212 & 127) == 64) {
                            if (this.field223[var7][var8] == this.field428) {
                                continue;
                            }
                            this.field223[var7][var8] = this.field428;
                        }
                        var5.field1547 = this.method154(-760, this.field653, var5.field211, var5.field212);
                        this.field667.method410(this.field653, var6, 60, var5, var5.field212, var5.field211, var5.field213, var5.field1547, 11810, var5.field201);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method108(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field434 = "";
                this.field435 = "Connecting to server...";
                this.method156((byte) 8, true);
            }
            this.field281 = new class31(this.method145(field411 + 43594), 2, this);
            long var4 = class69.method578(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field230.field1615 = 0;
            this.field230.method505(14);
            this.field230.method505(var6);
            this.field281.method308(2, true, this.field230.field1614, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field281.method305();
            }
            int var8 = this.field281.method305();
            int var9 = var8;
            if (var8 == 0) {
                this.field281.method307(this.field698.field1614, 0, 8);
                this.field698.field1615 = 0;
                this.field325 = this.field698.method521(0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field325 >> 32), (int) this.field325 };
                this.field230.field1615 = 0;
                this.field230.method505(10);
                this.field230.method509(var10[0]);
                this.field230.method509(var10[1]);
                this.field230.method509(var10[2]);
                this.field230.method509(var10[3]);
                this.field230.method509(signlink.uid);
                this.field230.method512(arg0);
                this.field230.method512(arg1);
                this.field230.method530(field267, true, field332);
                this.field596.field1615 = 0;
                if (arg2) {
                    this.field596.method505(18);
                } else {
                    this.field596.method505(16);
                }
                this.field596.method505(this.field230.field1615 + 36 + 1 + 1 + 2);
                this.field596.method505(255);
                this.field596.method506(369);
                this.field596.method505(field413 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field596.method509(this.field326[var11]);
                }
                this.field596.method513(-238, 0, this.field230.field1615, this.field230.field1614);
                this.field230.field1619 = new class61((byte) -9, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field688 = new class61((byte) -9, var10);
                this.field281.method308(this.field596.field1615, true, this.field596.field1614, 0);
                var8 = this.field281.method305();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method108(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field524 = this.field281.method305();
                field496 = this.field281.method305() == 1;
                this.field341 = 0L;
                this.field553 = 0;
                this.field379.field1506 = 0;
                super.field85 = true;
                this.field380 = true;
                this.field680 = true;
                this.field230.field1615 = 0;
                this.field698.field1615 = 0;
                this.field444 = -1;
                this.field396 = -1;
                this.field397 = -1;
                this.field398 = -1;
                this.field443 = 0;
                this.field445 = 0;
                this.field391 = 0;
                this.field447 = 0;
                this.field461 = 0;
                this.field694 = 0;
                this.field389 = false;
                super.field86 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field709[var13] = null;
                }
                this.field352 = 0;
                this.field457 = 0;
                this.field650 = 0;
                this.field663 = 0;
                this.field705 = (int) (Math.random() * 100.0D) - 50;
                this.field671 = (int) (Math.random() * 110.0D) - 55;
                this.field432 = (int) (Math.random() * 80.0D) - 40;
                this.field300 = (int) (Math.random() * 120.0D) - 60;
                this.field598 = (int) (Math.random() * 30.0D) - 20;
                this.field579 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field449 = 0;
                this.field218 = -1;
                this.field511 = 0;
                this.field512 = 0;
                this.field479 = 0;
                this.field405 = 0;
                for (int var14 = 0; var14 < this.field476; ++var14) {
                    this.field478[var14] = null;
                    this.field483[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field404[var15] = null;
                }
                field378 = this.field478[this.field477] = new class53();
                this.field603.method344();
                this.field489.method344();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field407[var16][var17][var18] = null;
                        }
                    }
                }
                this.field386 = new class37(2);
                this.field611 = 0;
                this.field610 = 0;
                this.method73(0, this.field533);
                this.field533 = -1;
                this.method73(0, this.field319);
                this.field319 = -1;
                this.method73(0, this.field665);
                this.field665 = -1;
                this.method73(0, this.field576);
                this.field576 = -1;
                this.method73(0, this.field490);
                this.field490 = -1;
                this.method73(0, this.field312);
                this.field312 = -1;
                this.method73(0, this.field314);
                this.field314 = -1;
                this.field531 = false;
                this.field284 = 3;
                this.field506 = 0;
                this.field389 = false;
                this.field273 = false;
                this.field697 = null;
                this.field394 = 0;
                this.field310 = -1;
                this.field673 = true;
                this.method179(this.field255);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field423[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field419[var20] = null;
                    this.field420[var20] = false;
                }
                field247 = 0;
                field448 = 0;
                field340 = 0;
                field637 = 0;
                field534 = 0;
                field305 = 0;
                field297 = 0;
                field604 = 0;
                field374 = 0;
                field240 = 0;
                this.method121(0);
            } else if (var8 == 3) {
                this.field434 = "";
                this.field435 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field434 = "Your account has been disabled.";
                this.field435 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field434 = "Your account is already logged in.";
                this.field435 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field434 = "RuneScape has been updated!";
                this.field435 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field434 = "This world is full.";
                this.field435 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field434 = "Unable to connect.";
                this.field435 = "Login server offline.";
            } else if (var8 == 9) {
                this.field434 = "Login limit exceeded.";
                this.field435 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field434 = "Unable to connect.";
                this.field435 = "Bad session id.";
            } else if (var8 == 12) {
                this.field434 = "You need a members account to login to this world.";
                this.field435 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field434 = "Could not complete login.";
                this.field435 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field434 = "The server is being updated.";
                this.field435 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field680 = true;
                this.field230.field1615 = 0;
                this.field698.field1615 = 0;
                this.field444 = -1;
                this.field396 = -1;
                this.field397 = -1;
                this.field398 = -1;
                this.field443 = 0;
                this.field445 = 0;
                this.field391 = 0;
                this.field694 = 0;
                this.field389 = false;
                this.field645 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field434 = "Login attempts exceeded.";
                this.field435 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field434 = "You are standing in a members-only area.";
                this.field435 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field434 = "Invalid loginserver requested";
                this.field435 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field434 = "Malformed login packet.";
                    this.field435 = "Please try again.";
                } else if (var8 == 23) {
                    this.field434 = "No reply from loginserver.";
                    this.field435 = "Please try again.";
                } else if (var8 == 24) {
                    this.field434 = "Error loading your profile.";
                    this.field435 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field434 = "Unexpected loginserver response.";
                    this.field435 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field434 = "This computers address has been blocked";
                    this.field435 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field231 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field231;
                            this.method108(arg0, arg1, arg2);
                        } else {
                            this.field434 = "No response from loginserver";
                            this.field435 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field434 = "No response from server";
                        this.field435 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field434 = "Unexpected server response";
                    this.field435 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field281.method305();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field434 = "You have only just left another world";
                    this.field435 = "Your profile will be transferred in: " + var26;
                    this.method156((byte) 8, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method108(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field434 = "";
            this.field435 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (!this.field563 && !this.field369 && !this.field670) {
            ++field382;
            if (!this.field680) {
                this.method156((byte) 8, false);
            } else {
                this.method130(true);
            }
            this.field602 = 0;
            if (arg0 == 9) {
                ;
            }
        } else {
            this.method157(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)Z")
    public final boolean method109(int arg0) {
        if (arg0 != 0) {
            this.field393 = !this.field393;
        }
        if (this.field281 == null) {
            return false;
        } else {
            try {
                int var2 = this.field281.method306();
                if (var2 == 0) {
                    return false;
                }
                if (this.field444 == -1) {
                    this.field281.method307(this.field698.field1614, 0, 1);
                    this.field444 = this.field698.field1614[0] & 255;
                    if (this.field688 != null) {
                        this.field444 = this.field444 - this.field688.method558() & 255;
                    }
                    this.field443 = class56.field1591[this.field444];
                    --var2;
                }
                if (this.field443 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field281.method307(this.field698.field1614, 0, 1);
                    this.field443 = this.field698.field1614[0] & 255;
                    --var2;
                }
                if (this.field443 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field281.method307(this.field698.field1614, 0, 2);
                    this.field698.field1615 = 0;
                    this.field443 = this.field698.method517();
                    var2 -= 2;
                }
                if (var2 < this.field443) {
                    return false;
                }
                this.field698.field1615 = 0;
                this.field281.method307(this.field698.field1614, 0, this.field443);
                this.field445 = 0;
                this.field398 = this.field397;
                this.field397 = this.field396;
                this.field396 = this.field444;
                if (this.field444 == 144) {
                    String var3 = this.field698.method522();
                    if (var3.endsWith(":tradereq:")) {
                        String var4 = var3.substring(0, var3.indexOf(":"));
                        long var5 = class69.method578(var4);
                        boolean var7 = false;
                        for (int var8 = 0; var8 < this.field303; ++var8) {
                            if (this.field383[var8] == var5) {
                                var7 = true;
                                break;
                            }
                        }
                        if (!var7 && this.field622 == 0) {
                            this.method175((byte) 2, 4, "wishes to trade with you.", var4);
                        }
                    } else if (var3.endsWith(":duelreq:")) {
                        String var9 = var3.substring(0, var3.indexOf(":"));
                        long var10 = class69.method578(var9);
                        boolean var12 = false;
                        for (int var13 = 0; var13 < this.field303; ++var13) {
                            if (this.field383[var13] == var10) {
                                var12 = true;
                                break;
                            }
                        }
                        if (!var12 && this.field622 == 0) {
                            this.method175((byte) 2, 8, "wishes to duel with you.", var9);
                        }
                    } else if (!var3.endsWith(":chalreq:")) {
                        this.method175((byte) 2, 0, var3, "");
                    } else {
                        String var14 = var3.substring(0, var3.indexOf(":"));
                        long var15 = class69.method578(var14);
                        boolean var17 = false;
                        for (int var18 = 0; var18 < this.field303; ++var18) {
                            if (this.field383[var18] == var15) {
                                var17 = true;
                                break;
                            }
                        }
                        if (!var17 && this.field622 == 0) {
                            String var19 = var3.substring(var3.indexOf(":") + 1, var3.length() - 9);
                            this.method175((byte) 2, 8, var19, var14);
                        }
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 75) {
                    int var20 = this.field698.method542(this.field390);
                    int var21 = this.field698.method542(this.field390);
                    int var22 = this.field698.method542(this.field390);
                    int var23 = this.field698.method542(this.field390);
                    class34.method324(var21).field1128 = var20;
                    class34.method324(var21).field1129 = var22;
                    class34.method324(var21).field1127 = var23;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 64) {
                    this.field611 = this.field698.method515();
                    this.field350 = true;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 217) {
                    int var24 = this.field698.method546(false);
                    int var25 = this.field698.method543(false);
                    int var26 = this.field698.method545(false);
                    class34 var27 = class34.method324(var25);
                    var27.field1175 = var26;
                    var27.field1164 = var24;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 113) {
                    int var28 = this.field698.method532(true);
                    String var29 = this.field698.method522();
                    int var30 = this.field698.method515();
                    if (var28 >= 1 && var28 <= 5) {
                        if (var29.equalsIgnoreCase("null")) {
                            var29 = null;
                        }
                        this.field419[var28 - 1] = var29;
                        this.field420[var28 - 1] = var30 == 0;
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 164) {
                    int var31 = this.field698.method517();
                    boolean var32 = this.field698.method533(18094) == 1;
                    class34.method324(var31).field1150 = var32;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 154) {
                    int var33 = this.field698.method517();
                    int var34 = this.field698.method517();
                    class34 var35 = class34.method324(var33);
                    if (var35 != null && var35.field1155 == 0) {
                        if (var34 < 0) {
                            var34 = 0;
                        }
                        if (var34 > var35.field1181 - var35.field1138) {
                            var34 = var35.field1181 - var35.field1138;
                        }
                        var35.field1118 = var34;
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 208) {
                    this.field455 = this.field698.method534(true);
                    this.field286 = this.field698.method542(this.field390);
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 28) {
                    int var36 = this.field698.method546(false);
                    int var37 = this.field698.method543(false);
                    class34 var38 = class34.method324(var37);
                    if (var38.field1168 != var36 || var36 == -1) {
                        var38.field1168 = var36;
                        var38.field1187 = 0;
                        var38.field1122 = 0;
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 124) {
                    int var39 = this.field698.method543(false);
                    int var40 = this.field698.method541(35378);
                    if (this.field319 != -1) {
                        this.method73(0, this.field319);
                        this.field319 = -1;
                        this.field636 = true;
                    }
                    if (this.field576 != -1) {
                        this.method73(0, this.field576);
                        this.field576 = -1;
                        this.field691 = true;
                    }
                    if (this.field490 != -1) {
                        this.method73(0, this.field490);
                        this.field490 = -1;
                    }
                    if (this.field665 != var39) {
                        this.method73(0, this.field665);
                        this.field665 = var39;
                    }
                    if (this.field312 != var40) {
                        this.method73(0, this.field312);
                        this.field312 = var40;
                    }
                    if (this.field506 != 0) {
                        this.field506 = 0;
                        this.field636 = true;
                    }
                    this.field350 = true;
                    this.field338 = true;
                    this.field531 = false;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 72) {
                    this.field686 = false;
                    for (int var41 = 0; var41 < 5; ++var41) {
                        this.field635[var41] = false;
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 18) {
                    this.field222 = this.field698.method533(18094);
                    this.field221 = this.field698.method532(true);
                    for (int var42 = this.field221; var42 < this.field221 + 8; ++var42) {
                        for (int var43 = this.field222; var43 < this.field222 + 8; ++var43) {
                            if (this.field407[this.field653][var42][var43] != null) {
                                this.field407[this.field653][var42][var43] = null;
                                this.method112(var42, var43);
                            }
                        }
                    }
                    for (class8 var44 = (class8) this.field386.method340(); var44 != null; var44 = (class8) this.field386.method342(954)) {
                        if (var44.field150 >= this.field221 && var44.field150 < this.field221 + 8 && var44.field151 >= this.field222 && var44.field151 < this.field222 + 8 && this.field653 == var44.field148) {
                            var44.field146 = 0;
                        }
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 184) {
                    this.field686 = true;
                    this.field234 = this.field698.method515();
                    this.field235 = this.field698.method515();
                    this.field236 = this.field698.method517();
                    this.field237 = this.field698.method515();
                    this.field238 = this.field698.method515();
                    if (this.field238 >= 100) {
                        int var45 = this.field234 * 128 + 64;
                        int var46 = this.field235 * 128 + 64;
                        int var47 = this.method154(-760, this.field653, var45, var46) - this.field236;
                        int var48 = var45 - this.field629;
                        int var49 = var47 - this.field630;
                        int var50 = var46 - this.field631;
                        int var51 = (int) Math.sqrt((double) (var48 * var48 + var50 * var50));
                        this.field632 = (int) (Math.atan2((double) var49, (double) var51) * 325.949D) & 2047;
                        this.field633 = (int) (Math.atan2((double) var48, (double) var50) * -325.949D) & 2047;
                        if (this.field632 < 128) {
                            this.field632 = 128;
                        }
                        if (this.field632 > 383) {
                            this.field632 = 383;
                        }
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 188) {
                    int var52 = this.field698.method517();
                    int var53 = this.field698.method515();
                    int var54 = this.field698.method517();
                    if (var54 == 65535) {
                        if (this.field663 < 50) {
                            this.field494[this.field663] = (short) var52;
                            this.field408[this.field663] = var53;
                            this.field692[this.field663] = 0;
                            ++this.field663;
                        }
                    } else if (this.field317 && !field413 && this.field663 < 50) {
                        this.field494[this.field663] = var52;
                        this.field408[this.field663] = var53;
                        this.field692[this.field663] = class57.field1595[var52] + var54;
                        ++this.field663;
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 52) {
                    this.field391 = this.field698.method543(false) * 30;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 195) {
                    int var55 = this.field698.method542(this.field390);
                    this.method134(var55, (byte) 1);
                    if (this.field312 != -1) {
                        this.method73(0, this.field312);
                        this.field312 = -1;
                        this.field350 = true;
                        this.field338 = true;
                    }
                    if (this.field576 != -1) {
                        this.method73(0, this.field576);
                        this.field576 = -1;
                        this.field691 = true;
                    }
                    if (this.field490 != -1) {
                        this.method73(0, this.field490);
                        this.field490 = -1;
                    }
                    if (this.field665 != -1) {
                        this.method73(0, this.field665);
                        this.field665 = -1;
                    }
                    if (this.field319 != var55) {
                        this.method73(0, this.field319);
                        this.field319 = var55;
                    }
                    this.field531 = false;
                    this.field636 = true;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 70) {
                    long var56 = this.field698.method521(0);
                    int var58 = this.field698.method515();
                    String var59 = class69.method582(class69.method579(this.field393, var56), true);
                    for (int var60 = 0; var60 < this.field610; ++var60) {
                        if (this.field220[var60] == var56) {
                            if (this.field256[var60] != var58) {
                                this.field256[var60] = var58;
                                this.field350 = true;
                                if (var58 > 0) {
                                    this.method175((byte) 2, 5, var59 + " has logged in.", "");
                                }
                                if (var58 == 0) {
                                    this.method175((byte) 2, 5, var59 + " has logged out.", "");
                                }
                            }
                            var59 = null;
                            break;
                        }
                    }
                    if (var59 != null && this.field610 < 200) {
                        this.field220[this.field610] = var56;
                        this.field388[this.field610] = var59;
                        this.field256[this.field610] = var58;
                        ++this.field610;
                        this.field350 = true;
                    }
                    boolean var61 = false;
                    while (!var61) {
                        var61 = true;
                        for (int var62 = 0; var62 < this.field610 - 1; ++var62) {
                            if (this.field256[var62] != field410 && this.field256[var62 + 1] == field410 || this.field256[var62] == 0 && this.field256[var62 + 1] != 0) {
                                int var63 = this.field256[var62];
                                this.field256[var62] = this.field256[var62 + 1];
                                this.field256[var62 + 1] = var63;
                                String var64 = this.field388[var62];
                                this.field388[var62] = this.field388[var62 + 1];
                                this.field388[var62 + 1] = var64;
                                long var65 = this.field220[var62];
                                this.field220[var62] = this.field220[var62 + 1];
                                this.field220[var62 + 1] = var65;
                                this.field350 = true;
                                var61 = false;
                            }
                        }
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 239) {
                    int var67 = this.field698.method542(this.field390);
                    int var68 = this.field698.method534(true);
                    if (var67 == 65535) {
                        var67 = -1;
                    }
                    if (this.field545[var68] != var67) {
                        this.method73(0, this.field545[var68]);
                        this.field545[var68] = var67;
                    }
                    this.field350 = true;
                    this.field338 = true;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 42) {
                    this.method170((byte) 8);
                    this.field444 = -1;
                    return false;
                }
                if (this.field444 == 247) {
                    this.field350 = true;
                    int var69 = this.field698.method517();
                    class34 var70 = class34.method324(var69);
                    while (this.field698.field1615 < this.field443) {
                        int var71 = this.field698.method529();
                        int var72 = this.field698.method517();
                        int var73 = this.field698.method515();
                        if (var73 == 255) {
                            var73 = this.field698.method520();
                        }
                        if (var71 >= 0 && var71 < var70.field1119.length) {
                            var70.field1119[var71] = var72;
                            var70.field1135[var71] = var73;
                        }
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 19) {
                    int var74 = this.field698.method542(this.field390);
                    int var75 = this.field698.method543(false);
                    class34.method324(var74).field1133 = 1;
                    class34.method324(var74).field1134 = var75;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 174) {
                    int var76 = this.field698.method541(35378);
                    int var77 = this.field698.method541(35378);
                    class34.method324(var77).field1133 = 2;
                    class34.method324(var77).field1134 = var76;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 172) {
                    this.field429 = this.field698.method515();
                    this.field313 = this.field698.method515();
                    this.field594 = this.field698.method515();
                    this.field571 = true;
                    this.field636 = true;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 237) {
                    int var78 = this.field698.method541(35378);
                    class34 var79 = class34.method324(var78);
                    for (int var80 = 0; var80 < var79.field1119.length; ++var80) {
                        var79.field1119[var80] = -1;
                        var79.field1119[var80] = 0;
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 169) {
                    this.field394 = this.field698.method515();
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 15) {
                    this.field273 = false;
                    this.field506 = 2;
                    this.field501 = "";
                    this.field636 = true;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 224) {
                    this.field310 = this.field698.method534(true);
                    if (this.field310 == this.field284) {
                        if (this.field310 == 3) {
                            this.field284 = 1;
                        } else {
                            this.field284 = 3;
                        }
                        this.field350 = true;
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 20) {
                    int var81 = this.field698.method541(35378);
                    int var82 = this.field698.method543(false);
                    int var83 = this.field698.method517();
                    class34.method324(var81).field1160 = (var83 << 16) + var82;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 243) {
                    this.field350 = true;
                    int var84 = this.field698.method534(true);
                    int var85 = this.field698.method534(true);
                    int var86 = this.field698.method550(16014);
                    this.field689[var85] = var86;
                    this.field244[var85] = var84;
                    this.field562[var85] = 1;
                    for (int var87 = 0; var87 < 98; ++var87) {
                        if (var86 >= field376[var87]) {
                            this.field562[var85] = var87 + 2;
                        }
                    }
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 30) {
                    int var88 = this.field698.method517();
                    this.method134(var88, (byte) 1);
                    if (this.field319 != -1) {
                        this.method73(0, this.field319);
                        this.field319 = -1;
                        this.field636 = true;
                    }
                    if (this.field576 != -1) {
                        this.method73(0, this.field576);
                        this.field576 = -1;
                        this.field691 = true;
                    }
                    if (this.field490 != -1) {
                        this.method73(0, this.field490);
                        this.field490 = -1;
                    }
                    if (this.field665 != -1) {
                        this.method73(0, this.field665);
                        this.field665 = -1;
                    }
                    if (this.field312 != var88) {
                        this.method73(0, this.field312);
                        this.field312 = var88;
                    }
                    if (this.field506 != 0) {
                        this.field506 = 0;
                        this.field636 = true;
                    }
                    this.field350 = true;
                    this.field338 = true;
                    this.field531 = false;
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 == 142) {
                    if (this.field284 == 12) {
                        this.field350 = true;
                    }
                    this.field285 = this.field698.method518();
                    this.field444 = -1;
                    return true;
                }
                if (this.field444 != 83 && this.field444 != 35) {
                    if (this.field444 != 138 && this.field444 != 119 && this.field444 != 149 && this.field444 != 225 && this.field444 != 250 && this.field444 != 190 && this.field444 != 210 && this.field444 != 141 && this.field444 != 135 && this.field444 != 150 && this.field444 != 205) {
                        if (this.field444 == 43) {
                            for (int var139 = 0; var139 < this.field693.length; ++var139) {
                                if (this.field693[var139] != this.field339[var139]) {
                                    this.field693[var139] = this.field339[var139];
                                    this.method173(var139, (byte) -120);
                                    this.field350 = true;
                                }
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 39) {
                            this.field222 = this.field698.method534(true);
                            this.field221 = this.field698.method515();
                            while (this.field698.field1615 < this.field443) {
                                int var140 = this.field698.method515();
                                this.method142(var140, (byte) 110, this.field698);
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 189) {
                            int var141 = this.field698.method545(false);
                            if (var141 >= 0) {
                                this.method134(var141, (byte) 1);
                            }
                            if (this.field314 != var141) {
                                this.method73(0, this.field314);
                                this.field314 = var141;
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 13) {
                            if (this.field312 != -1) {
                                this.method73(0, this.field312);
                                this.field312 = -1;
                                this.field350 = true;
                                this.field338 = true;
                            }
                            if (this.field319 != -1) {
                                this.method73(0, this.field319);
                                this.field319 = -1;
                                this.field636 = true;
                            }
                            if (this.field576 != -1) {
                                this.method73(0, this.field576);
                                this.field576 = -1;
                                this.field691 = true;
                            }
                            if (this.field490 != -1) {
                                this.method73(0, this.field490);
                                this.field490 = -1;
                            }
                            if (this.field665 != -1) {
                                this.method73(0, this.field665);
                                this.field665 = -1;
                            }
                            if (this.field506 != 0) {
                                this.field506 = 0;
                                this.field636 = true;
                            }
                            this.field531 = false;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 11) {
                            this.field284 = this.field698.method532(true);
                            this.field350 = true;
                            this.field338 = true;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 156) {
                            int var142 = this.field698.method543(false);
                            int var143 = this.field698.method541(35378);
                            int var144 = var143 >> 10 & 31;
                            int var145 = var143 >> 5 & 31;
                            int var146 = var143 & 31;
                            class34.method324(var142).field1148 = (var146 << 3) + (var144 << 19) + (var145 << 11);
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 118) {
                            int var147 = this.field698.method550(16014);
                            int var148 = this.field698.method542(this.field390);
                            this.field339[var148] = var147;
                            if (this.field693[var148] != var147) {
                                this.field693[var148] = var147;
                                this.method173(var148, (byte) -120);
                                this.field350 = true;
                                if (this.field533 != -1) {
                                    this.field636 = true;
                                }
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 207) {
                            this.field221 = this.field698.method533(18094);
                            this.field222 = this.field698.method533(18094);
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 73) {
                            int var149 = this.field698.method541(35378);
                            this.method134(var149, (byte) 1);
                            if (this.field312 != -1) {
                                this.method73(0, this.field312);
                                this.field312 = -1;
                                this.field350 = true;
                                this.field338 = true;
                            }
                            if (this.field319 != -1) {
                                this.method73(0, this.field319);
                                this.field319 = -1;
                                this.field636 = true;
                            }
                            if (this.field576 != -1) {
                                this.method73(0, this.field576);
                                this.field576 = -1;
                                this.field691 = true;
                            }
                            if (this.field490 != -1) {
                                this.method73(0, this.field490);
                                this.field490 = -1;
                            }
                            if (this.field665 != var149) {
                                this.method73(0, this.field665);
                                this.field665 = var149;
                            }
                            if (this.field506 != 0) {
                                this.field506 = 0;
                                this.field636 = true;
                            }
                            this.field531 = false;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 125) {
                            this.field449 = this.field698.method515();
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 69) {
                            this.method184(this.field443, -683, this.field698);
                            this.field232 = false;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 1) {
                            this.method94(this.field443, false, this.field698);
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 181) {
                            int var150 = this.field698.method544(965);
                            if (this.field533 != var150) {
                                this.method73(0, this.field533);
                                this.field533 = var150;
                            }
                            this.field636 = true;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 132) {
                            int var151 = this.field698.method542(this.field390);
                            int var152 = this.field698.method542(this.field390);
                            this.method134(var151, (byte) 1);
                            if (var152 != -1) {
                                this.method134(var152, (byte) 1);
                            }
                            if (this.field665 != -1) {
                                this.method73(0, this.field665);
                                this.field665 = -1;
                            }
                            if (this.field312 != -1) {
                                this.method73(0, this.field312);
                                this.field312 = -1;
                            }
                            if (this.field319 != -1) {
                                this.method73(0, this.field319);
                                this.field319 = -1;
                            }
                            if (this.field576 != var151) {
                                this.method73(0, this.field576);
                                this.field576 = var151;
                            }
                            if (this.field490 != var151) {
                                this.method73(0, this.field490);
                                this.field490 = var152;
                            }
                            this.field506 = 0;
                            this.field531 = false;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 162) {
                            this.field273 = false;
                            this.field506 = 1;
                            this.field501 = "";
                            this.field636 = true;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 100) {
                            if (this.field284 == 12) {
                                this.field350 = true;
                            }
                            this.field372 = this.field698.method515();
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 187) {
                            this.field686 = true;
                            this.field566 = this.field698.method515();
                            this.field567 = this.field698.method515();
                            this.field568 = this.field698.method517();
                            this.field569 = this.field698.method515();
                            this.field570 = this.field698.method515();
                            if (this.field570 >= 100) {
                                this.field629 = this.field566 * 128 + 64;
                                this.field631 = this.field567 * 128 + 64;
                                this.field630 = this.method154(-760, this.field653, this.field629, this.field631) - this.field568;
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 110) {
                            int var153 = this.field698.method541(35378);
                            int var154 = this.field698.method543(false);
                            int var155 = this.field698.method541(35378);
                            if (var155 == 65535) {
                                class34.method324(var154).field1133 = 0;
                                this.field444 = -1;
                                return true;
                            }
                            class1 var156 = class1.method7(var155);
                            class34.method324(var154).field1133 = 4;
                            class34.method324(var154).field1134 = var155;
                            class34.method324(var154).field1128 = var156.field52;
                            class34.method324(var154).field1129 = var156.field44;
                            class34.method324(var154).field1127 = var156.field6 * 100 / var153;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 236) {
                            int var157 = this.field698.method515();
                            int var158 = this.field698.method515();
                            int var159 = this.field698.method515();
                            int var160 = this.field698.method515();
                            this.field635[var157] = true;
                            this.field696[var157] = var158;
                            this.field638[var157] = var159;
                            this.field654[var157] = var160;
                            this.field627[var157] = 0;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 231) {
                            this.field303 = this.field443 / 8;
                            for (int var161 = 0; var161 < this.field303; ++var161) {
                                this.field383[var161] = this.field698.method521(0);
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 186) {
                            long var162 = this.field698.method521(0);
                            int var164 = this.field698.method520();
                            int var165 = this.field698.method515();
                            boolean var166 = false;
                            for (int var167 = 0; var167 < 100; ++var167) {
                                if (this.field242[var167] == var164) {
                                    var166 = true;
                                    break;
                                }
                            }
                            if (var165 <= 1) {
                                for (int var168 = 0; var168 < this.field303; ++var168) {
                                    if (this.field383[var168] == var162) {
                                        var166 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var166 && this.field622 == 0) {
                                try {
                                    this.field242[this.field227] = var164;
                                    this.field227 = (this.field227 + 1) % 100;
                                    String var169 = class29.method297(this.field443 - 13, false, this.field698);
                                    if (var165 != 3) {
                                        var169 = class54.method467(var169, 7);
                                    }
                                    if (var165 != 2 && var165 != 3) {
                                        if (var165 == 1) {
                                            this.method175((byte) 2, 7, var169, "@cr1@" + class69.method582(class69.method579(this.field393, var162), true));
                                        } else {
                                            this.method175((byte) 2, 3, var169, class69.method582(class69.method579(this.field393, var162), true));
                                        }
                                    } else {
                                        this.method175((byte) 2, 7, var169, "@cr2@" + class69.method582(class69.method579(this.field393, var162), true));
                                    }
                                } catch (Exception var190) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 204) {
                            byte var171 = this.field698.method536((byte) 1);
                            int var172 = this.field698.method543(false);
                            this.field339[var172] = var171;
                            if (this.field693[var172] != var171) {
                                this.field693[var172] = var171;
                                this.method173(var172, (byte) -120);
                                this.field350 = true;
                                if (this.field533 != -1) {
                                    this.field636 = true;
                                }
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 92) {
                            for (int var173 = 0; var173 < this.field478.length; ++var173) {
                                if (this.field478[var173] != null) {
                                    this.field478[var173].field202 = -1;
                                }
                            }
                            for (int var174 = 0; var174 < this.field404.length; ++var174) {
                                if (this.field404[var174] != null) {
                                    this.field404[var174].field202 = -1;
                                }
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 197) {
                            int var175 = this.field698.method543(false);
                            if (var175 == 65535) {
                                var175 = -1;
                            }
                            if (this.field484 != var175 && this.field373 && !field413 && this.field471 == 0) {
                                this.field257 = var175;
                                this.field258 = true;
                                this.field702.method292(2, this.field257);
                            }
                            this.field484 = var175;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 171) {
                            int var176 = this.field698.method519();
                            int var177 = this.field698.method517();
                            if (this.field373 && !field413) {
                                this.field257 = var177;
                                this.field258 = false;
                                this.field702.method292(2, this.field257);
                                this.field471 = var176;
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 193) {
                            this.field511 = 0;
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 5) {
                            int var178 = this.field698.method541(35378);
                            String var179 = this.field698.method522();
                            class34.method324(var178).field1126 = var179;
                            int var10001 = this.field545[this.field284];
                            if (class34.method324(var178).field1143 == var10001) {
                                this.field350 = true;
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 40) {
                            this.field643 = this.field698.method543(false);
                            this.field333 = this.field698.method543(false);
                            this.field442 = this.field698.method542(this.field390);
                            this.field698.method515();
                            this.field245 = this.field698.method548((byte) 2);
                            this.field320 = this.field698.method542(this.field390);
                            this.field299 = this.field698.method541(35378);
                            this.field487 = this.field698.method517();
                            this.field503 = this.field698.method541(35378);
                            this.field527 = this.field698.method541(35378);
                            this.field698.method543(false);
                            signlink.dnslookup(class69.method581(-29619, this.field245));
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 202) {
                            this.field461 = this.field698.method515();
                            if (this.field461 == 1) {
                                this.field466 = this.field698.method517();
                            }
                            if (this.field461 >= 2 && this.field461 <= 6) {
                                if (this.field461 == 2) {
                                    this.field265 = 64;
                                    this.field266 = 64;
                                }
                                if (this.field461 == 3) {
                                    this.field265 = 0;
                                    this.field266 = 64;
                                }
                                if (this.field461 == 4) {
                                    this.field265 = 128;
                                    this.field266 = 64;
                                }
                                if (this.field461 == 5) {
                                    this.field265 = 64;
                                    this.field266 = 0;
                                }
                                if (this.field461 == 6) {
                                    this.field265 = 64;
                                    this.field266 = 128;
                                }
                                this.field461 = 2;
                                this.field262 = this.field698.method517();
                                this.field263 = this.field698.method517();
                                this.field264 = this.field698.method515();
                            }
                            if (this.field461 == 10) {
                                this.field384 = this.field698.method517();
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 24) {
                            int var180 = this.field698.method541(35378);
                            class34.method324(var180).field1133 = 3;
                            if (field378.field1532 == null) {
                                class34.method324(var180).field1134 = (field378.field1543[11] << 5) + (field378.field1543[8] << 10) + (field378.field1543[0] << 15) + (field378.field1536[0] << 25) + (field378.field1536[4] << 20) + field378.field1543[1];
                            } else {
                                class34.method324(var180).field1134 = (int) (field378.field1532.field1372 + 305419896L);
                            }
                            this.field444 = -1;
                            return true;
                        }
                        if (this.field444 == 152) {
                            this.field350 = true;
                            int var181 = this.field698.method517();
                            class34 var182 = class34.method324(var181);
                            int var183 = this.field698.method517();
                            for (int var184 = 0; var184 < var183; ++var184) {
                                var182.field1119[var184] = this.field698.method543(false);
                                int var185 = this.field698.method532(true);
                                if (var185 == 255) {
                                    var185 = this.field698.method548((byte) 2);
                                }
                                var182.field1135[var184] = var185;
                            }
                            for (int var186 = var183; var186 < var182.field1119.length; ++var186) {
                                var182.field1119[var186] = 0;
                                var182.field1135[var186] = 0;
                            }
                            this.field444 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field444 + "," + this.field443 + " - " + this.field397 + "," + this.field398);
                        this.method170((byte) 8);
                        return true;
                    }
                    this.method142(this.field444, (byte) 110, this.field698);
                    this.field444 = -1;
                    return true;
                }
                int var89 = this.field224;
                int var90 = this.field225;
                if (this.field444 == 83) {
                    var90 = this.field698.method543(false);
                    var89 = this.field698.method542(this.field390);
                    this.field252 = false;
                }
                if (this.field444 == 35) {
                    this.field698.method525(616);
                    int var91 = 0;
                    while (true) {
                        if (var91 >= 4) {
                            this.field698.method527((byte) 5);
                            var89 = this.field698.method541(35378);
                            var90 = this.field698.method543(false);
                            this.field252 = true;
                            break;
                        }
                        for (int var92 = 0; var92 < 13; ++var92) {
                            for (int var93 = 0; var93 < 13; ++var93) {
                                int var94 = this.field698.method526(true, 1);
                                if (var94 == 1) {
                                    this.field228[var91][var92][var93] = this.field698.method526(true, 26);
                                } else {
                                    this.field228[var91][var92][var93] = -1;
                                }
                            }
                        }
                        ++var91;
                    }
                }
                if (this.field224 == var89 && this.field225 == var90 && this.field650 == 2) {
                    this.field444 = -1;
                    return true;
                }
                this.field224 = var89;
                this.field225 = var90;
                this.field541 = (this.field224 - 6) * 8;
                this.field542 = (this.field225 - 6) * 8;
                this.field295 = false;
                if ((this.field224 / 8 == 48 || this.field224 / 8 == 49) && this.field225 / 8 == 48) {
                    this.field295 = true;
                }
                if (this.field224 / 8 == 48 && this.field225 / 8 == 148) {
                    this.field295 = true;
                }
                this.field650 = 1;
                this.field645 = System.currentTimeMillis();
                this.method171((byte) -43, (String) null, "Loading - please wait.");
                if (this.field444 == 83) {
                    int var95 = 0;
                    int var96 = (this.field224 - 6) / 8;
                    label1231: while (true) {
                        if (var96 > (this.field224 + 6) / 8) {
                            this.field293 = new byte[var95][];
                            this.field472 = new byte[var95][];
                            this.field399 = new int[var95];
                            this.field400 = new int[var95];
                            this.field401 = new int[var95];
                            int var98 = 0;
                            int var99 = (this.field224 - 6) / 8;
                            while (true) {
                                if (var99 > (this.field224 + 6) / 8) {
                                    break label1231;
                                }
                                for (int var100 = (this.field225 - 6) / 8; var100 <= (this.field225 + 6) / 8; ++var100) {
                                    this.field399[var98] = (var99 << 8) + var100;
                                    if (this.field295 && (var100 == 49 || var100 == 149 || var100 == 147 || var99 == 50 || var99 == 49 && var100 == 47)) {
                                        this.field400[var98] = -1;
                                        this.field401[var98] = -1;
                                        ++var98;
                                    } else {
                                        int var101 = this.field400[var98] = this.field702.method277(0, var99, var100, 0);
                                        if (var101 != -1) {
                                            this.field702.method292(3, var101);
                                        }
                                        int var102 = this.field401[var98] = this.field702.method277(0, var99, var100, 1);
                                        if (var102 != -1) {
                                            this.field702.method292(3, var102);
                                        }
                                        ++var98;
                                    }
                                }
                                ++var99;
                            }
                        }
                        for (int var97 = (this.field225 - 6) / 8; var97 <= (this.field225 + 6) / 8; ++var97) {
                            ++var95;
                        }
                        ++var96;
                    }
                }
                if (this.field444 == 35) {
                    int var103 = 0;
                    int[] var104 = new int[676];
                    int var105 = 0;
                    label1192: while (true) {
                        if (var105 >= 4) {
                            this.field293 = new byte[var103][];
                            this.field472 = new byte[var103][];
                            this.field399 = new int[var103];
                            this.field400 = new int[var103];
                            this.field401 = new int[var103];
                            int var113 = 0;
                            while (true) {
                                if (var113 >= var103) {
                                    break label1192;
                                }
                                int var114 = this.field399[var113] = var104[var113];
                                int var115 = var114 >> 8 & 255;
                                int var116 = var114 & 255;
                                int var117 = this.field400[var113] = this.field702.method277(0, var115, var116, 0);
                                if (var117 != -1) {
                                    this.field702.method292(3, var117);
                                }
                                int var118 = this.field401[var113] = this.field702.method277(0, var115, var116, 1);
                                if (var118 != -1) {
                                    this.field702.method292(3, var118);
                                }
                                ++var113;
                            }
                        }
                        for (int var106 = 0; var106 < 13; ++var106) {
                            for (int var107 = 0; var107 < 13; ++var107) {
                                int var108 = this.field228[var105][var106][var107];
                                if (var108 != -1) {
                                    int var109 = var108 >> 14 & 1023;
                                    int var110 = var108 >> 3 & 2047;
                                    int var111 = (var109 / 8 << 8) + var110 / 8;
                                    for (int var112 = 0; var112 < var103; ++var112) {
                                        if (var104[var112] == var111) {
                                            var111 = -1;
                                            break;
                                        }
                                    }
                                    if (var111 != -1) {
                                        var104[var103++] = var111;
                                    }
                                }
                            }
                        }
                        ++var105;
                    }
                }
                int var119 = this.field541 - this.field543;
                int var120 = this.field542 - this.field544;
                this.field543 = this.field541;
                this.field544 = this.field542;
                for (int var121 = 0; var121 < 16384; ++var121) {
                    class47 var122 = this.field404[var121];
                    if (var122 != null) {
                        for (int var123 = 0; var123 < 10; ++var123) {
                            var122.field160[var123] -= var119;
                            var122.field161[var123] -= var120;
                        }
                        var122.field211 -= var119 * 128;
                        var122.field212 -= var120 * 128;
                    }
                }
                for (int var124 = 0; var124 < this.field476; ++var124) {
                    class53 var125 = this.field478[var124];
                    if (var125 != null) {
                        for (int var126 = 0; var126 < 10; ++var126) {
                            var125.field160[var126] -= var119;
                            var125.field161[var126] -= var120;
                        }
                        var125.field211 -= var119 * 128;
                        var125.field212 -= var120 * 128;
                    }
                }
                this.field232 = true;
                byte var127 = 0;
                byte var128 = 104;
                byte var129 = 1;
                if (var119 < 0) {
                    var127 = 103;
                    var128 = -1;
                    var129 = -1;
                }
                byte var130 = 0;
                byte var131 = 104;
                byte var132 = 1;
                if (var120 < 0) {
                    var130 = 103;
                    var131 = -1;
                    var132 = -1;
                }
                for (int var133 = var127; var128 != var133; var133 += var129) {
                    for (int var134 = var130; var131 != var134; var134 += var132) {
                        int var135 = var119 + var133;
                        int var136 = var120 + var134;
                        for (int var137 = 0; var137 < 4; ++var137) {
                            if (var135 >= 0 && var136 >= 0 && var135 < 104 && var136 < 104) {
                                this.field407[var137][var133][var134] = this.field407[var137][var135][var136];
                            } else {
                                this.field407[var137][var133][var134] = null;
                            }
                        }
                    }
                }
                for (class8 var138 = (class8) this.field386.method340(); var138 != null; var138 = (class8) this.field386.method342(954)) {
                    var138.field150 -= var119;
                    var138.field151 -= var120;
                    if (var138.field150 < 0 || var138.field151 < 0 || var138.field150 >= 104 || var138.field151 >= 104) {
                        var138.method41();
                    }
                }
                if (this.field511 != 0) {
                    this.field511 -= var119;
                    this.field512 -= var120;
                }
                this.field686 = false;
                this.field444 = -1;
                return true;
            } catch (IOException var191) {
                this.method65(13228);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field444 + "," + this.field397 + "," + this.field398 + " - " + this.field443 + "," + (field378.field160[0] + this.field541) + "," + (field378.field161[0] + this.field542) + " - ";
                for (int var189 = 0; var189 < this.field443 && var189 < 50; ++var189) {
                    var188 = var188 + this.field698.field1614[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method170((byte) 8);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method110(int arg0, byte[] arg1, int arg2) {
        int var4 = 45 / arg0;
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Ljava/lang/String;")
    public final String method111(int arg0) {
        if (arg0 != 40981) {
            this.field444 = this.field698.method515();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field83 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method112(int arg0, int arg1) {
        class37 var3 = this.field407[this.field653][arg0][arg1];
        if (var3 == null) {
            this.field667.method420(this.field653, arg0, arg1);
        } else {
            int var4 = -99999999;
            class51 var5 = null;
            for (class51 var6 = (class51) var3.method340(); var6 != null; var6 = (class51) var3.method342(954)) {
                class1 var11 = class1.method7(var6.field1508);
                int var12 = var11.field48;
                if (var11.field4) {
                    var12 = (var6.field1507 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method338(68, var5);
            class51 var7 = null;
            class51 var8 = null;
            for (class51 var9 = (class51) var3.method340(); var9 != null; var9 = (class51) var3.method342(954)) {
                if (var5.field1508 != var9.field1508 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1508 != var9.field1508 && var7.field1508 != var9.field1508 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field667.method406(arg1, this.method154(-760, this.field653, arg0 * 128 + 64, arg1 * 128 + 64), arg0, var7, this.field653, var5, var10, false, var8);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method113(boolean arg0) {
        this.field680 &= arg0;
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method114(boolean arg0) {
        if (this.field497 != 0) {
            int var2 = 0;
            if (!arg0) {
                this.field437 = !this.field437;
            }
            if (this.field391 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field709[var3] != null) {
                    int var4 = this.field707[var3];
                    String var5 = this.field708[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field313 == 0 || this.field313 == 1 && this.method63(var5, -222))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field88 > 4 && super.field89 - 4 > var9 - 10 && super.field89 - 4 <= var9 + 3) {
                            int var10 = this.field463.method591(false, "From:  " + var5 + this.field709[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field88 < var10 + 4) {
                                if (this.field524 >= 1) {
                                    this.field302[this.field694] = "Report abuse @whi@" + var5;
                                    this.field290[this.field694] = 2674;
                                    ++this.field694;
                                }
                                this.field302[this.field694] = "Add ignore @whi@" + var5;
                                this.field290[this.field694] = 2478;
                                ++this.field694;
                                this.field302[this.field694] = "Add friend @whi@" + var5;
                                this.field290[this.field694] = 2050;
                                ++this.field694;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field313 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLMRUJPFPS;)Z")
    public final boolean method115(byte arg0, class34 arg1) {
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            this.field230.method505(132);
        }
        int var4 = arg1.field1115;
        if (this.field611 == 2) {
            if (var4 == 201) {
                this.field636 = true;
                this.field506 = 0;
                this.field273 = true;
                this.field565 = "";
                this.field607 = 1;
                this.field555 = "Enter name of friend to add to list";
            }
            if (var4 == 202) {
                this.field636 = true;
                this.field506 = 0;
                this.field273 = true;
                this.field565 = "";
                this.field607 = 2;
                this.field555 = "Enter name of friend to delete from list";
            }
        }
        if (var4 == 205) {
            this.field447 = 250;
            return true;
        } else {
            if (var4 == 501) {
                this.field636 = true;
                this.field506 = 0;
                this.field273 = true;
                this.field565 = "";
                this.field607 = 4;
                this.field555 = "Enter name of player to add to list";
            }
            if (var4 == 502) {
                this.field636 = true;
                this.field506 = 0;
                this.field273 = true;
                this.field565 = "";
                this.field607 = 5;
                this.field555 = "Enter name of player to delete from list";
            }
            if (var4 >= 300 && var4 <= 313) {
                int var5 = (var4 - 300) / 2;
                int var6 = var4 & 1;
                int var7 = this.field328[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = class20.field838 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= class20.field838) {
                                var7 = 0;
                            }
                        }
                        if (!class20.field839[var7].field845 && class20.field839[var7].field840 == var5 + (this.field673 ? 0 : 7)) {
                            this.field328[var5] = var7;
                            this.field368 = true;
                            break;
                        }
                    }
                }
            }
            if (var4 >= 314 && var4 <= 323) {
                int var8 = (var4 - 314) / 2;
                int var9 = var4 & 1;
                int var10 = this.field423[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field377[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field377[var8].length) {
                        var10 = 0;
                    }
                }
                this.field423[var8] = var10;
                this.field368 = true;
            }
            if (var4 == 324 && !this.field673) {
                this.field673 = true;
                this.method179(this.field255);
            }
            if (var4 == 325 && this.field673) {
                this.field673 = false;
                this.method179(this.field255);
            }
            if (var4 != 326) {
                if (var4 == 620) {
                    this.field572 = !this.field572;
                }
                if (var4 >= 601 && var4 <= 613) {
                    this.method68(0);
                    if (this.field644.length() > 0) {
                        this.field230.method504(16, 1);
                        this.field230.method511(class69.method578(this.field644), -845);
                        this.field230.method505(var4 - 601);
                        this.field230.method505(this.field572 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field230.method504(162, 1);
                this.field230.method505(this.field673 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field230.method505(this.field328[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field230.method505(this.field423[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field410 = Integer.parseInt(this.getParameter("nodeid"));
        field411 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method64(false);
        } else {
            method72(-8266);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field412 = false;
        } else {
            field412 = true;
        }
        this.method15(5, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method116(String arg0) throws IOException {
        if (!this.field349) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field259 != null) {
                try {
                    this.field259.close();
                } catch (Exception var4) {
                }
                this.field259 = null;
            }
            this.field259 = this.method145(43595);
            this.field259.setSoTimeout(10000);
            InputStream var2 = this.field259.getInputStream();
            OutputStream var3 = this.field259.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)I")
    public final int method117(int arg0) {
        int var2 = 3;
        if (arg0 != 0) {
            this.field233 = -109;
        }
        if (this.field632 < 310) {
            ++field381;
            if (field381 > 151) {
                field381 = 0;
                this.field230.method504(83, 1);
                this.field230.method508(933039);
            }
            int var3 = this.field629 >> 7;
            int var4 = this.field631 >> 7;
            int var5 = field378.field211 >> 7;
            int var6 = field378.field212 >> 7;
            if ((this.field331[this.field653][var3][var4] & 4) != 0) {
                var2 = this.field653;
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
                    if ((this.field331[this.field653][var3][var4] & 4) != 0) {
                        var2 = this.field653;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field331[this.field653][var3][var4] & 4) != 0) {
                            var2 = this.field653;
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
                    if ((this.field331[this.field653][var3][var4] & 4) != 0) {
                        var2 = this.field653;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field331[this.field653][var3][var4] & 4) != 0) {
                            var2 = this.field653;
                        }
                    }
                }
            }
        }
        if ((this.field331[this.field653][field378.field211 >> 7][field378.field212 >> 7] & 4) != 0) {
            var2 = this.field653;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)I")
    public final int method118(int arg0) {
        int var2 = this.method154(-760, this.field653, this.field629, this.field631);
        if (arg0 < 0 || arg0 > 0) {
            this.field444 = -1;
        }
        return var2 - this.field630 < 800 && (this.field331[this.field653][this.field629 >> 7][this.field631 >> 7] & 4) != 0 ? this.field653 : 3;
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method119(int arg0) {
        byte[] var2 = this.field595.method323("title.dat", (byte[]) null);
        class40 var3 = new class40(var2, this);
        this.field587.method273(1);
        var3.method354(0, 8, 0);
        this.field588.method273(1);
        var3.method354(-637, 8, 0);
        this.field584.method273(1);
        var3.method354(-128, 8, 0);
        this.field585.method273(1);
        var3.method354(-202, 8, -371);
        this.field586.method273(1);
        var3.method354(-202, 8, -171);
        this.field589.method273(1);
        var3.method354(0, 8, -265);
        this.field590.method273(1);
        var3.method354(-562, 8, -265);
        this.field591.method273(1);
        var3.method354(-128, 8, -171);
        this.field592.method273(1);
        var3.method354(-562, 8, -171);
        int[] var4 = new int[var3.field1282];
        for (int var5 = 0; var5 < var3.field1283; ++var5) {
            for (int var10 = 0; var10 < var3.field1282; ++var10) {
                var4[var10] = var3.field1281[var3.field1282 * var5 + (var3.field1282 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1282; ++var11) {
                var3.field1281[var3.field1282 * var5 + var11] = var4[var11];
            }
        }
        this.field587.method273(1);
        var3.method354(382, 8, 0);
        this.field588.method273(1);
        var3.method354(-255, 8, 0);
        this.field584.method273(1);
        var3.method354(254, 8, 0);
        this.field585.method273(1);
        this.field443 += arg0;
        var3.method354(180, 8, -371);
        this.field586.method273(1);
        var3.method354(180, 8, -171);
        this.field589.method273(1);
        var3.method354(382, 8, -265);
        this.field590.method273(1);
        var3.method354(-180, 8, -265);
        this.field591.method273(1);
        var3.method354(254, 8, -171);
        this.field592.method273(1);
        var3.method354(-180, 8, -171);
        class40 var6 = new class40(this.field595, "logo", 0);
        this.field584.method273(1);
        var6.method356(382 - var6.field1282 / 2 - 128, 18, -973);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method120(int arg0, boolean arg1) {
        if (arg1) {
            if (!field413) {
                for (int var3 = 0; var3 < this.field668.length; ++var3) {
                    int var4 = this.field668[var3];
                    if (class45.field1364[var4] >= arg0) {
                        class41 var5 = class45.field1358[var4];
                        int var6 = var5.field1295 * var5.field1294 - 1;
                        int var7 = this.field552 * var5.field1294 * 2;
                        byte[] var8 = var5.field1292;
                        byte[] var9 = this.field606;
                        for (int var10 = 0; var10 <= var6; ++var10) {
                            var9[var10] = var8[var10 - var7 & var6];
                        }
                        var5.field1292 = var9;
                        this.field606 = var8;
                        class45.method379(var4, -676);
                        ++field593;
                        if (field593 > 196) {
                            field593 = 0;
                            this.field230.method504(67, 1);
                            this.field230.method506(20956);
                        }
                    }
                }
                ++field575;
                if (field575 > 84) {
                    field575 = 0;
                    this.field230.method504(227, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method121(int arg0) {
        if (this.field559 == null) {
            this.method162(-789);
            super.field81 = null;
            this.field584 = null;
            this.field585 = null;
            this.field586 = null;
            this.field587 = null;
            this.field588 = null;
            this.field589 = null;
            this.field590 = null;
            this.field591 = null;
            this.field592 = null;
            this.field559 = new class26((byte) 9, this.method24(731), 479, 96);
            this.field557 = new class26((byte) 9, this.method24(731), 172, 156);
            class32.method313((byte) 73);
            this.field474.method369(0, 0, -973);
            this.field556 = new class26((byte) 9, this.method24(731), 190, 261);
            this.field558 = new class26((byte) 9, this.method24(731), 512, 334);
            class32.method313((byte) 73);
            this.field439 = new class26((byte) 9, this.method24(731), 496, 50);
            this.field440 = new class26((byte) 9, this.method24(731), 269, 37);
            if (arg0 == 0) {
                this.field441 = new class26((byte) 9, this.method24(731), 249, 45);
                this.field691 = true;
                this.field558.method273(1);
                class45.field1356 = this.field366;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method122(int arg0) {
        if (this.field538 == 0) {
            this.field302[0] = "Cancel";
            this.field290[0] = 1442;
            this.field694 = 1;
            if (this.field576 != -1) {
                this.field395 = 0;
                this.field679 = 0;
                this.method104(0, 0, 0, class34.method324(this.field576), super.field89, super.field88, 0, 0);
                if (this.field395 != this.field219) {
                    this.field219 = this.field395;
                }
                if (this.field679 != this.field493) {
                    this.field493 = this.field679;
                }
            } else {
                this.method114(true);
                this.field395 = 0;
                this.field679 = 0;
                if (super.field88 > 4 && super.field89 > 4 && super.field88 < 516 && super.field89 < 338) {
                    if (this.field665 != -1) {
                        this.method104(0, 4, 0, class34.method324(this.field665), super.field89, super.field88, 0, 4);
                    } else {
                        this.method143((byte) 9);
                    }
                }
                if (this.field395 != this.field219) {
                    this.field219 = this.field395;
                }
                if (this.field679 != this.field493) {
                    this.field493 = this.field679;
                }
                this.field395 = 0;
                if (arg0 != 7) {
                    this.field444 = this.field698.method515();
                }
                this.field679 = 0;
                if (super.field88 > 553 && super.field89 > 205 && super.field88 < 743 && super.field89 < 466) {
                    if (this.field312 != -1) {
                        this.method104(0, 553, 1, class34.method324(this.field312), super.field89, super.field88, 0, 205);
                    } else if (this.field545[this.field284] != -1) {
                        this.method104(0, 553, 1, class34.method324(this.field545[this.field284]), super.field89, super.field88, 0, 205);
                    }
                }
                if (this.field551 != this.field395) {
                    this.field350 = true;
                    this.field551 = this.field395;
                }
                if (this.field679 != this.field329) {
                    this.field350 = true;
                    this.field329 = this.field679;
                }
                this.field395 = 0;
                this.field679 = 0;
                if (super.field88 > 17 && super.field89 > 357 && super.field88 < 496 && super.field89 < 453) {
                    if (this.field319 != -1) {
                        this.method104(0, 17, 2, class34.method324(this.field319), super.field89, super.field88, 0, 357);
                    } else if (this.field533 != -1) {
                        this.method104(0, 17, 3, class34.method324(this.field533), super.field89, super.field88, 0, 357);
                    } else if (super.field89 < 434 && super.field88 < 426 && this.field506 == 0) {
                        this.method66(0, super.field89 - 357, super.field88 - 17);
                    }
                }
                if ((this.field319 != -1 || this.field533 != -1) && this.field647 != this.field395) {
                    this.field636 = true;
                    this.field647 = this.field395;
                }
                if ((this.field319 != -1 || this.field533 != -1) && this.field679 != this.field254) {
                    this.field636 = true;
                    this.field254 = this.field679;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field694 - 1; ++var3) {
                        if (this.field290[var3] < 1000 && this.field290[var3 + 1] > 1000) {
                            String var4 = this.field302[var3];
                            this.field302[var3] = this.field302[var3 + 1];
                            this.field302[var3 + 1] = var4;
                            int var5 = this.field290[var3];
                            this.field290[var3] = this.field290[var3 + 1];
                            this.field290[var3 + 1] = var5;
                            int var6 = this.field288[var3];
                            this.field288[var3] = this.field288[var3 + 1];
                            this.field288[var3 + 1] = var6;
                            int var7 = this.field289[var3];
                            this.field289[var3] = this.field289[var3 + 1];
                            this.field289[var3 + 1] = var7;
                            int var8 = this.field291[var3];
                            this.field291[var3] = this.field291[var3 + 1];
                            this.field291[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method123(int arg0) {
        if (arg0 == 28319) {
            for (int var2 = 0; var2 < this.field405; ++var2) {
                int var3 = this.field406[var2];
                class47 var4 = this.field404[var3];
                if (var4 != null) {
                    this.method124(var4, false, var4.field1410.field1390);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCELKGLWS;ZI)V")
    public final void method124(class10 arg0, boolean arg1, int arg2) {
        if (arg0.field211 < 128 || arg0.field212 < 128 || arg0.field211 >= 13184 || arg0.field212 >= 13184) {
            arg0.field202 = -1;
            arg0.field182 = -1;
            arg0.field178 = 0;
            arg0.field179 = 0;
            arg0.field211 = arg0.field160[0] * 128 + arg0.field173 * 64;
            arg0.field212 = arg0.field161[0] * 128 + arg0.field173 * 64;
            arg0.method44(false);
        }
        if (field378 == arg0 && (arg0.field211 < 1536 || arg0.field212 < 1536 || arg0.field211 >= 11776 || arg0.field212 >= 11776)) {
            arg0.field202 = -1;
            arg0.field182 = -1;
            arg0.field178 = 0;
            arg0.field179 = 0;
            arg0.field211 = arg0.field160[0] * 128 + arg0.field173 * 64;
            arg0.field212 = arg0.field161[0] * 128 + arg0.field173 * 64;
            arg0.method44(false);
        }
        if (arg0.field178 > field608) {
            this.method125(arg0, true);
        } else if (arg0.field179 >= field608) {
            this.method126((byte) 6, arg0);
        } else {
            this.method127(arg0, -42323);
        }
        this.method128(0, arg0);
        if (arg1) {
            this.field230.method505(147);
        }
        this.method129(4, arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCELKGLWS;Z)V")
    public final void method125(class10 arg0, boolean arg1) {
        int var3 = arg0.field178 - field608;
        int var4 = arg0.field174 * 128 + arg0.field173 * 64;
        int var5 = arg0.field176 * 128 + arg0.field173 * 64;
        arg0.field211 += (var4 - arg0.field211) / var3;
        if (!arg1) {
            this.field695 = !this.field695;
        }
        arg0.field212 += (var5 - arg0.field212) / var3;
        arg0.field172 = 0;
        if (arg0.field180 == 0) {
            arg0.field214 = 1024;
        }
        if (arg0.field180 == 1) {
            arg0.field214 = 1536;
        }
        if (arg0.field180 == 2) {
            arg0.field214 = 0;
        }
        if (arg0.field180 == 3) {
            arg0.field214 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLCELKGLWS;)V")
    public final void method126(byte arg0, class10 arg1) {
        if (arg0 != 6) {
            this.field444 = this.field698.method515();
        }
        if (field608 == arg1.field179 || arg1.field202 == -1 || arg1.field205 != 0 || arg1.field204 + 1 > class66.field1693[arg1.field202].method567(0, arg1.field203)) {
            int var3 = arg1.field179 - arg1.field178;
            int var4 = field608 - arg1.field178;
            int var5 = arg1.field174 * 128 + arg1.field173 * 64;
            int var6 = arg1.field176 * 128 + arg1.field173 * 64;
            int var7 = arg1.field175 * 128 + arg1.field173 * 64;
            int var8 = arg1.field177 * 128 + arg1.field173 * 64;
            arg1.field211 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field212 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field172 = 0;
        if (arg1.field180 == 0) {
            arg1.field214 = 1024;
        }
        if (arg1.field180 == 1) {
            arg1.field214 = 1536;
        }
        if (arg1.field180 == 2) {
            arg1.field214 = 0;
        }
        if (arg1.field180 == 3) {
            arg1.field214 = 512;
        }
        arg1.field213 = arg1.field214;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCELKGLWS;I)V")
    public final void method127(class10 arg0, int arg1) {
        arg0.field162 = arg0.field215;
        if (arg0.field190 == 0) {
            arg0.field172 = 0;
        } else {
            if (arg0.field202 != -1 && arg0.field205 == 0) {
                class66 var3 = class66.field1693[arg0.field202];
                if (arg0.field195 > 0 && var3.field1705 == 0) {
                    ++arg0.field172;
                    return;
                }
                if (arg0.field195 <= 0 && var3.field1706 == 0) {
                    ++arg0.field172;
                    return;
                }
            }
            int var4 = arg0.field211;
            int var5 = arg0.field212;
            int var6 = arg0.field160[arg0.field190 - 1] * 128 + arg0.field173 * 64;
            int var7 = arg0.field161[arg0.field190 - 1] * 128 + arg0.field173 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field214 = 1280;
                    } else if (var5 > var7) {
                        arg0.field214 = 1792;
                    } else {
                        arg0.field214 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field214 = 768;
                    } else if (var5 > var7) {
                        arg0.field214 = 256;
                    } else {
                        arg0.field214 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field214 = 1024;
                } else {
                    arg0.field214 = 0;
                }
                int var8 = arg0.field214 - arg0.field213 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field166;
                if (arg1 != -42323) {
                    this.field695 = !this.field695;
                }
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field165;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field168;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field167;
                }
                if (var9 == -1) {
                    var9 = arg0.field165;
                }
                arg0.field162 = var9;
                int var10 = 4;
                if (arg0.field214 != arg0.field213 && arg0.field217 == -1 && arg0.field200 != 0) {
                    var10 = 2;
                }
                if (arg0.field190 > 2) {
                    var10 = 6;
                }
                if (arg0.field190 > 3) {
                    var10 = 8;
                }
                if (arg0.field172 > 0 && arg0.field190 > 1) {
                    var10 = 8;
                    --arg0.field172;
                }
                if (arg0.field169[arg0.field190 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field165 == arg0.field162 && arg0.field208 != -1) {
                    arg0.field162 = arg0.field208;
                }
                if (var4 < var6) {
                    arg0.field211 += var10;
                    if (arg0.field211 > var6) {
                        arg0.field211 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field211 -= var10;
                    if (arg0.field211 < var6) {
                        arg0.field211 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field212 += var10;
                    if (arg0.field212 > var7) {
                        arg0.field212 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field212 -= var10;
                    if (arg0.field212 < var7) {
                        arg0.field212 = var7;
                    }
                }
                if (arg0.field211 == var6 && arg0.field212 == var7) {
                    --arg0.field190;
                    if (arg0.field195 > 0) {
                        --arg0.field195;
                        return;
                    }
                }
            } else {
                arg0.field211 = var6;
                arg0.field212 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILCELKGLWS;)V")
    public final void method128(int arg0, class10 arg1) {
        if (arg0 != 0) {
            this.field666 = !this.field666;
        }
        if (arg1.field200 != 0) {
            if (arg1.field217 != -1 && arg1.field217 < 32768) {
                class47 var3 = this.field404[arg1.field217];
                if (var3 != null) {
                    int var4 = arg1.field211 - var3.field211;
                    int var5 = arg1.field212 - var3.field212;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field214 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field217 >= 32768) {
                int var6 = arg1.field217 - 32768;
                if (this.field286 == var6) {
                    var6 = this.field477;
                }
                class53 var7 = this.field478[var6];
                if (var7 != null) {
                    int var8 = arg1.field211 - var7.field211;
                    int var9 = arg1.field212 - var7.field212;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field214 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field170 != 0 || arg1.field171 != 0) && (arg1.field190 == 0 || arg1.field172 > 0)) {
                int var10 = arg1.field211 - (arg1.field170 - this.field541 - this.field541) * 64;
                int var11 = arg1.field212 - (arg1.field171 - this.field542 - this.field542) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field214 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field170 = 0;
                arg1.field171 = 0;
            }
            int var12 = arg1.field214 - arg1.field213 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field200 && var12 <= 2048 - arg1.field200) {
                    if (var12 > 1024) {
                        arg1.field213 -= arg1.field200;
                    } else {
                        arg1.field213 += arg1.field200;
                    }
                } else {
                    arg1.field213 = arg1.field214;
                }
                arg1.field213 &= 2047;
                if (arg1.field215 == arg1.field162 && arg1.field214 != arg1.field213) {
                    if (arg1.field216 != -1) {
                        arg1.field162 = arg1.field216;
                        return;
                    }
                    arg1.field162 = arg1.field165;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILCELKGLWS;)V")
    public final void method129(int arg0, class10 arg1) {
        if (arg0 < 4 || arg0 > 4) {
            this.field444 = this.field698.method515();
        }
        arg1.field201 = false;
        if (arg1.field162 != -1) {
            class66 var3 = class66.field1693[arg1.field162];
            ++arg1.field164;
            if (arg1.field163 < var3.field1694 && arg1.field164 > var3.method567(0, arg1.field163)) {
                arg1.field164 = 0;
                ++arg1.field163;
            }
            if (arg1.field163 >= var3.field1694) {
                arg1.field164 = 0;
                arg1.field163 = 0;
            }
        }
        if (arg1.field182 != -1 && field608 >= arg1.field185) {
            if (arg1.field183 < 0) {
                arg1.field183 = 0;
            }
            class66 var4 = class63.field1652[arg1.field182].field1656;
            ++arg1.field184;
            while (arg1.field183 < var4.field1694 && arg1.field184 > var4.method567(0, arg1.field183)) {
                arg1.field184 -= var4.method567(0, arg1.field183);
                ++arg1.field183;
            }
            if (arg1.field183 >= var4.field1694 && (arg1.field183 < 0 || arg1.field183 >= var4.field1694)) {
                arg1.field182 = -1;
            }
        }
        if (arg1.field202 != -1 && arg1.field205 <= 1) {
            class66 var5 = class66.field1693[arg1.field202];
            if (var5.field1705 == 1 && arg1.field195 > 0 && arg1.field178 <= field608 && arg1.field179 < field608) {
                arg1.field205 = 1;
                return;
            }
        }
        if (arg1.field202 != -1 && arg1.field205 == 0) {
            class66 var6 = class66.field1693[arg1.field202];
            ++arg1.field204;
            while (arg1.field203 < var6.field1694 && arg1.field204 > var6.method567(0, arg1.field203)) {
                arg1.field204 -= var6.method567(0, arg1.field203);
                ++arg1.field203;
            }
            if (arg1.field203 >= var6.field1694) {
                arg1.field203 -= var6.field1698;
                ++arg1.field206;
                if (arg1.field206 >= var6.field1704) {
                    arg1.field202 = -1;
                }
                if (arg1.field203 < 0 || arg1.field203 >= var6.field1694) {
                    arg1.field202 = -1;
                }
            }
            arg1.field201 = var6.field1700;
        }
        if (arg1.field205 > 0) {
            --arg1.field205;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method130(boolean arg0) {
        this.field680 &= arg0;
        if (this.field576 == -1 || this.field650 != 2 && super.field81 == null) {
            if (this.field691) {
                this.method121(0);
                this.field691 = false;
                this.field514.method274(super.field80, 0, 4, -331);
                this.field515.method274(super.field80, 0, 357, -331);
                this.field516.method274(super.field80, 722, 4, -331);
                this.field517.method274(super.field80, 743, 205, -331);
                this.field518.method274(super.field80, 0, 0, -331);
                this.field519.method274(super.field80, 516, 4, -331);
                this.field520.method274(super.field80, 516, 205, -331);
                this.field521.method274(super.field80, 496, 357, -331);
                this.field522.method274(super.field80, 0, 338, -331);
                this.field350 = true;
                this.field636 = true;
                this.field338 = true;
                this.field571 = true;
                if (this.field650 != 2) {
                    this.field558.method274(super.field80, 4, 4, -331);
                    this.field557.method274(super.field80, 550, 4, -331);
                }
            }
            if (this.field650 == 2) {
                this.method144(-917);
            }
            if (this.field389 && this.field450 == 1) {
                this.field350 = true;
            }
            if (this.field312 != -1) {
                boolean var4 = this.method57(this.field552, (byte) 5, this.field312);
                if (var4) {
                    this.field350 = true;
                }
            }
            if (this.field470 == 2) {
                this.field350 = true;
            }
            if (this.field538 == 2) {
                this.field350 = true;
            }
            if (this.field350) {
                this.method160(this.field307);
                this.field350 = false;
            }
            if (this.field319 == -1 && this.field506 == 0) {
                this.field414.field1118 = this.field561 - this.field681 - 77;
                if (super.field88 > 448 && super.field88 < 560 && super.field89 > 332) {
                    this.method99(77, 463, -31429, this.field414, super.field88 - 17, super.field89 - 357, 0, this.field561, -1);
                }
                int var5 = this.field561 - 77 - this.field414.field1118;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field561 - 77) {
                    var5 = this.field561 - 77;
                }
                if (this.field681 != var5) {
                    this.field681 = var5;
                    this.field636 = true;
                }
            }
            if (this.field319 == -1 && this.field506 == 3) {
                int var6 = this.field269 * 14 + 7;
                this.field414.field1118 = this.field272;
                if (super.field88 > 448 && super.field88 < 560 && super.field89 > 332) {
                    this.method99(77, 463, -31429, this.field414, super.field88 - 17, super.field89 - 357, 0, var6, -1);
                }
                int var7 = this.field414.field1118;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field272 != var7) {
                    this.field272 = var7;
                    this.field636 = true;
                }
            }
            if (this.field319 != -1) {
                boolean var8 = this.method57(this.field552, (byte) 5, this.field319);
                if (var8) {
                    this.field636 = true;
                }
            }
            if (this.field470 == 3) {
                this.field636 = true;
            }
            if (this.field538 == 3) {
                this.field636 = true;
            }
            if (this.field697 != null) {
                this.field636 = true;
            }
            if (this.field389 && this.field450 == 2) {
                this.field636 = true;
            }
            if (this.field636) {
                this.method148((byte) -32);
                this.field636 = false;
            }
            if (this.field650 == 2) {
                this.method52(false);
                this.field557.method274(super.field80, 550, 4, -331);
            }
            if (this.field310 != -1) {
                this.field338 = true;
            }
            if (this.field338) {
                if (this.field310 != -1 && this.field310 == this.field284) {
                    this.field310 = -1;
                    this.field230.method504(22, 1);
                    this.field230.method505(this.field284);
                }
                this.field338 = false;
                this.field441.method273(1);
                this.field685.method369(0, 0, -973);
                if (this.field312 == -1) {
                    if (this.field545[this.field284] != -1) {
                        if (this.field284 == 0) {
                            this.field546.method369(22, 10, -973);
                        }
                        if (this.field284 == 1) {
                            this.field547.method369(54, 8, -973);
                        }
                        if (this.field284 == 2) {
                            this.field547.method369(82, 8, -973);
                        }
                        if (this.field284 == 3) {
                            this.field548.method369(110, 8, -973);
                        }
                        if (this.field284 == 4) {
                            this.field550.method369(153, 8, -973);
                        }
                        if (this.field284 == 5) {
                            this.field550.method369(181, 8, -973);
                        }
                        if (this.field284 == 6) {
                            this.field549.method369(209, 9, -973);
                        }
                    }
                    if (this.field545[0] != -1 && (this.field310 != 0 || field608 % 20 < 10)) {
                        this.field316[0].method369(29, 13, -973);
                    }
                    if (this.field545[1] != -1 && (this.field310 != 1 || field608 % 20 < 10)) {
                        this.field316[1].method369(53, 11, -973);
                    }
                    if (this.field545[2] != -1 && (this.field310 != 2 || field608 % 20 < 10)) {
                        this.field316[2].method369(82, 11, -973);
                    }
                    if (this.field545[3] != -1 && (this.field310 != 3 || field608 % 20 < 10)) {
                        this.field316[3].method369(115, 12, -973);
                    }
                    if (this.field545[4] != -1 && (this.field310 != 4 || field608 % 20 < 10)) {
                        this.field316[4].method369(153, 13, -973);
                    }
                    if (this.field545[5] != -1 && (this.field310 != 5 || field608 % 20 < 10)) {
                        this.field316[5].method369(180, 11, -973);
                    }
                    if (this.field545[6] != -1 && (this.field310 != 6 || field608 % 20 < 10)) {
                        this.field316[6].method369(208, 13, -973);
                    }
                }
                this.field441.method274(super.field80, 516, 160, -331);
                ++field597;
                if (field597 > 1132) {
                    field597 = 0;
                    this.field230.method504(138, 1);
                    this.field230.method505(0);
                    int var9 = this.field230.field1615;
                    this.field230.method506(39349);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field230.method506(14942);
                    }
                    this.field230.method506((int) (Math.random() * 65536.0D));
                    this.field230.method506((int) (Math.random() * 65536.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field230.method505(75);
                    }
                    this.field230.method506(61516);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field230.method506(4375);
                    }
                    this.field230.method505(97);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field230.method506(29661);
                    }
                    this.field230.method506(5785);
                    this.field230.method514(this.field230.field1615 - var9, 371);
                }
                this.field440.method273(1);
                this.field684.method369(0, 0, -973);
                if (this.field312 == -1) {
                    if (this.field545[this.field284] != -1) {
                        if (this.field284 == 7) {
                            this.field342.method369(42, 0, -973);
                        }
                        if (this.field284 == 8) {
                            this.field343.method369(74, 0, -973);
                        }
                        if (this.field284 == 9) {
                            this.field343.method369(102, 0, -973);
                        }
                        if (this.field284 == 10) {
                            this.field344.method369(130, 1, -973);
                        }
                        if (this.field284 == 11) {
                            this.field346.method369(173, 0, -973);
                        }
                        if (this.field284 == 12) {
                            this.field346.method369(201, 0, -973);
                        }
                        if (this.field284 == 13) {
                            this.field345.method369(229, 0, -973);
                        }
                    }
                    if (this.field545[8] != -1 && (this.field310 != 8 || field608 % 20 < 10)) {
                        this.field316[7].method369(74, 2, -973);
                    }
                    if (this.field545[9] != -1 && (this.field310 != 9 || field608 % 20 < 10)) {
                        this.field316[8].method369(102, 3, -973);
                    }
                    if (this.field545[10] != -1 && (this.field310 != 10 || field608 % 20 < 10)) {
                        this.field316[9].method369(137, 4, -973);
                    }
                    if (this.field545[11] != -1 && (this.field310 != 11 || field608 % 20 < 10)) {
                        this.field316[10].method369(174, 2, -973);
                    }
                    if (this.field545[12] != -1 && (this.field310 != 12 || field608 % 20 < 10)) {
                        this.field316[11].method369(201, 2, -973);
                    }
                    if (this.field545[13] != -1 && (this.field310 != 13 || field608 % 20 < 10)) {
                        this.field316[12].method369(226, 2, -973);
                    }
                }
                this.field440.method274(super.field80, 496, 466, -331);
                this.field558.method273(1);
                class45.field1356 = this.field366;
            }
            if (this.field571) {
                this.field571 = false;
                this.field439.method273(1);
                this.field683.method369(0, 0, -973);
                this.field463.method590(16777215, true, "Public chat", 55, 28, 0);
                if (this.field429 == 0) {
                    this.field463.method590(65280, true, "On", 55, 41, 0);
                }
                if (this.field429 == 1) {
                    this.field463.method590(16776960, true, "Friends", 55, 41, 0);
                }
                if (this.field429 == 2) {
                    this.field463.method590(16711680, true, "Off", 55, 41, 0);
                }
                if (this.field429 == 3) {
                    this.field463.method590(65535, true, "Hide", 55, 41, 0);
                }
                this.field463.method590(16777215, true, "Private chat", 184, 28, 0);
                if (this.field313 == 0) {
                    this.field463.method590(65280, true, "On", 184, 41, 0);
                }
                if (this.field313 == 1) {
                    this.field463.method590(16776960, true, "Friends", 184, 41, 0);
                }
                if (this.field313 == 2) {
                    this.field463.method590(16711680, true, "Off", 184, 41, 0);
                }
                this.field463.method590(16777215, true, "Trade/compete", 324, 28, 0);
                if (this.field594 == 0) {
                    this.field463.method590(65280, true, "On", 324, 41, 0);
                }
                if (this.field594 == 1) {
                    this.field463.method590(16776960, true, "Friends", 324, 41, 0);
                }
                if (this.field594 == 2) {
                    this.field463.method590(16711680, true, "Off", 324, 41, 0);
                }
                this.field463.method590(16777215, true, "Report abuse", 458, 33, 0);
                this.field439.method274(super.field80, 0, 453, -331);
                this.field558.method273(1);
                class45.field1356 = this.field366;
            }
            this.field552 = 0;
        } else {
            if (this.field650 == 2) {
                this.method57(this.field552, (byte) 5, this.field576);
                if (this.field490 != -1) {
                    this.method57(this.field552, (byte) 5, this.field490);
                }
                this.field552 = 0;
                this.method178(-483);
                super.field81.method273(1);
                class45.field1356 = this.field367;
                class32.method313((byte) 73);
                this.field691 = true;
                class34 var2 = class34.method324(this.field576);
                if (var2.field1117 == 512 && var2.field1138 == 334 && var2.field1155 == 0) {
                    var2.field1117 = 765;
                    var2.field1138 = 503;
                }
                this.method85(0, 0, this.field583, var2, 0);
                if (this.field490 != -1) {
                    class34 var3 = class34.method324(this.field490);
                    if (var3.field1117 == 512 && var3.field1138 == 334 && var3.field1155 == 0) {
                        var3.field1117 = 765;
                        var3.field1138 = 503;
                    }
                    this.method85(0, 0, this.field583, var3, 0);
                }
                if (!this.field389) {
                    this.method122(this.field651);
                    this.method166(47975);
                } else {
                    this.method105(true);
                }
            }
            super.field81.method274(super.field80, 0, 0, -331);
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method131(int arg0) {
        if (this.field497 != 0) {
            class72 var2 = this.field463;
            int var3 = 0;
            if (this.field391 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field709[var4] != null) {
                    int var5 = this.field707[var4];
                    String var6 = this.field708[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field313 == 0 || this.field313 == 1 && this.method63(var6, -222))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method593(false, 0, var8, "From", var9);
                        var2.method593(false, 65535, var8 - 1, "From", var9);
                        int var10 = var9 + var2.method591(false, "From ");
                        if (var7 == 1) {
                            this.field609[0].method369(var10, var8 - 12, -973);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field609[1].method369(var10, var8 - 12, -973);
                            var10 += 14;
                        }
                        var2.method593(false, 0, var8, var6 + ": " + this.field709[var4], var10);
                        var2.method593(false, 65535, var8 - 1, var6 + ": " + this.field709[var4], var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field313 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method593(false, 0, var11, this.field709[var4], 4);
                        var2.method593(false, 65535, var11 - 1, this.field709[var4], 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field313 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method593(false, 0, var12, "To " + var6 + ": " + this.field709[var4], 4);
                        var2.method593(false, 65535, var12 - 1, "To " + var6 + ": " + this.field709[var4], 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 > 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method132(int arg0) {
        while (arg0 >= 0) {
            this.field628 = this.field688.method558();
        }
        try {
            int var2 = field378.field211 + this.field705;
            int var3 = field378.field212 + this.field671;
            if (this.field277 - var2 < -500 || this.field277 - var2 > 500 || this.field278 - var3 < -500 || this.field278 - var3 > 500) {
                this.field277 = var2;
                this.field278 = var3;
            }
            if (this.field277 != var2) {
                this.field277 += (var2 - this.field277) / 16;
            }
            if (this.field278 != var3) {
                this.field278 += (var3 - this.field278) / 16;
            }
            if (super.field98[1] == 1) {
                this.field580 += (-24 - this.field580) / 2;
            } else if (super.field98[2] == 1) {
                this.field580 += (24 - this.field580) / 2;
            } else {
                this.field580 /= 2;
            }
            if (super.field98[3] == 1) {
                this.field581 += (12 - this.field581) / 2;
            } else if (super.field98[4] == 1) {
                this.field581 += (-12 - this.field581) / 2;
            } else {
                this.field581 /= 2;
            }
            this.field579 = this.field580 / 2 + this.field579 & 2047;
            this.field578 += this.field581 / 2;
            if (this.field578 < 128) {
                this.field578 = 128;
            }
            if (this.field578 > 383) {
                this.field578 = 383;
            }
            ++field243;
            if (field243 > 1275) {
                field243 = 0;
                this.field230.method504(248, 1);
                this.field230.method505(0);
                int var4 = this.field230.field1615;
                this.field230.method505(67);
                this.field230.method506((int) (Math.random() * 65536.0D));
                this.field230.method505(218);
                this.field230.method506(61710);
                this.field230.method506(50460);
                this.field230.method506((int) (Math.random() * 65536.0D));
                this.field230.method505(212);
                this.field230.method505((int) (Math.random() * 256.0D));
                this.field230.method505(223);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field230.method506(26572);
                }
                this.field230.method514(this.field230.field1615 - var4, 371);
            }
            int var5 = this.field277 >> 7;
            int var6 = this.field278 >> 7;
            int var7 = this.method154(-760, this.field653, this.field277, this.field278);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field653;
                        if (var11 < 3 && (this.field331[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field282[var11][var9][var10];
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
            if (var13 > this.field660) {
                this.field660 += (var13 - this.field660) / 24;
            } else if (var13 < this.field660) {
                this.field660 += (var13 - this.field660) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field378.field211 + "," + field378.field212 + "," + this.field277 + "," + this.field278 + "," + this.field224 + "," + this.field225 + "," + this.field541 + "," + this.field542);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method133(int arg0) {
        int var2 = this.field464.method591(false, "Choose Option");
        for (int var3 = 0; var3 < this.field694; ++var3) {
            int var11 = this.field464.method591(false, this.field302[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field694 * 15 + 21;
        if (arg0 >= 8 && arg0 <= 8) {
            if (super.field95 > 4 && super.field96 > 4 && super.field95 < 516 && super.field96 < 338) {
                int var5 = super.field95 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field96 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field389 = true;
                this.field450 = 0;
                this.field451 = var5;
                this.field452 = var6;
                this.field453 = var2;
                this.field454 = this.field694 * 15 + 22;
            }
            if (super.field95 > 553 && super.field96 > 205 && super.field95 < 743 && super.field96 < 466) {
                int var7 = super.field95 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field96 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field389 = true;
                this.field450 = 1;
                this.field451 = var7;
                this.field452 = var8;
                this.field453 = var2;
                this.field454 = this.field694 * 15 + 22;
            }
            if (super.field95 > 17 && super.field96 > 357 && super.field95 < 496 && super.field96 < 453) {
                int var9 = super.field95 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field96 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field389 = true;
                this.field450 = 2;
                this.field451 = var9;
                this.field452 = var10;
                this.field453 = var2;
                this.field454 = this.field694 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public final void method134(int arg0, byte arg1) {
        if (arg1 == 1) {
            class34 var3 = class34.method324(arg0);
            for (int var4 = 0; var4 < var3.field1162.length && var3.field1162[var4] != -1; ++var4) {
                class34 var5 = class34.method324(var3.field1162[var4]);
                if (var5.field1155 == 1) {
                    this.method134(var5.field1170, (byte) 1);
                }
                var5.field1187 = 0;
                var5.field1122 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method135(int arg0) {
        this.field601 = true;
        if (arg0 != -8090) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            long var3 = System.currentTimeMillis();
            int var5 = 0;
            int var6 = 20;
            while (this.field687) {
                ++this.field239;
                this.method165(false);
                this.method165(false);
                this.method147(3);
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
        this.field601 = false;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method136(byte arg0) {
        if (arg0 != -80) {
            this.field438 = -446;
        }
        for (class38 var2 = (class38) this.field603.method340(); var2 != null; var2 = (class38) this.field603.method342(954)) {
            if (this.field653 == var2.field1240 && field608 <= var2.field1233) {
                if (field608 >= var2.field1232) {
                    if (var2.field1231 > 0) {
                        class47 var3 = this.field404[var2.field1231 - 1];
                        if (var3 != null && var3.field211 >= 0 && var3.field211 < 13312 && var3.field212 >= 0 && var3.field212 < 13312) {
                            var2.method345(field608, this.method154(-760, var2.field1240, var3.field211, var3.field212) - var2.field1245, var3.field212, true, var3.field211);
                        }
                    }
                    if (var2.field1231 < 0) {
                        int var4 = -var2.field1231 - 1;
                        class53 var5;
                        if (this.field286 == var4) {
                            var5 = field378;
                        } else {
                            var5 = this.field478[var4];
                        }
                        if (var5 != null && var5.field211 >= 0 && var5.field211 < 13312 && var5.field212 >= 0 && var5.field212 < 13312) {
                            var2.method345(field608, this.method154(-760, var2.field1240, var5.field211, var5.field212) - var2.field1245, var5.field212, true, var5.field211);
                        }
                    }
                    var2.method346(this.field552, true);
                    this.field667.method410(this.field653, -1, 60, var2, (int) var2.field1226, (int) var2.field1225, var2.field1223, (int) var2.field1227, 11810, false);
                }
            } else {
                var2.method41();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method137(boolean arg0) {
        if (arg0) {
            this.method19();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method18(-239);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field665 != -1 && this.field665 == this.field430) {
                        if (var2 == 8 && this.field644.length() > 0) {
                            this.field644 = this.field644.substring(0, this.field644.length() - 1);
                        }
                        break;
                    }
                    if (this.field273) {
                        if (var2 >= 32 && var2 <= 122 && this.field565.length() < 80) {
                            this.field565 = this.field565 + (char) var2;
                            this.field636 = true;
                        }
                        if (var2 == 8 && this.field565.length() > 0) {
                            this.field565 = this.field565.substring(0, this.field565.length() - 1);
                            this.field636 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field273 = false;
                            this.field636 = true;
                            if (this.field607 == 1) {
                                long var3 = class69.method578(this.field565);
                                this.method92(true, var3);
                            }
                            if (this.field607 == 2 && this.field610 > 0) {
                                long var5 = class69.method578(this.field565);
                                this.method50(438, var5);
                            }
                            if (this.field607 == 3 && this.field565.length() > 0) {
                                this.field230.method504(39, 1);
                                this.field230.method505(0);
                                int var7 = this.field230.field1615;
                                this.field230.method511(this.field357, -845);
                                class29.method298(this.field233, this.field230, this.field565);
                                this.field230.method514(this.field230.field1615 - var7, 371);
                                this.field565 = class29.method299(this.field565, 7);
                                this.field565 = class54.method467(this.field565, 7);
                                this.method175((byte) 2, 6, this.field565, class69.method582(class69.method579(this.field393, this.field357), true));
                                if (this.field313 == 2) {
                                    this.field313 = 1;
                                    this.field571 = true;
                                    this.field230.method504(102, 1);
                                    this.field230.method505(this.field429);
                                    this.field230.method505(this.field313);
                                    this.field230.method505(this.field594);
                                }
                            }
                            if (this.field607 == 4 && this.field303 < 100) {
                                long var8 = class69.method578(this.field565);
                                this.method141(true, var8);
                            }
                            if (this.field607 == 5 && this.field303 > 0) {
                                long var10 = class69.method578(this.field565);
                                this.method93((byte) 6, var10);
                            }
                        }
                    } else if (this.field506 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field501.length() < 10) {
                            this.field501 = this.field501 + (char) var2;
                            this.field636 = true;
                        }
                        if (var2 == 8 && this.field501.length() > 0) {
                            this.field501 = this.field501.substring(0, this.field501.length() - 1);
                            this.field636 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field501.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field501);
                                } catch (Exception var22) {
                                }
                                this.field230.method504(245, 1);
                                this.field230.method509(var12);
                            }
                            this.field506 = 0;
                            this.field636 = true;
                        }
                    } else if (this.field506 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field501.length() < 12) {
                            this.field501 = this.field501 + (char) var2;
                            this.field636 = true;
                        }
                        if (var2 == 8 && this.field501.length() > 0) {
                            this.field501 = this.field501.substring(0, this.field501.length() - 1);
                            this.field636 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field501.length() > 0) {
                                this.field230.method504(188, 1);
                                this.field230.method511(class69.method578(this.field501), -845);
                            }
                            this.field506 = 0;
                            this.field636 = true;
                        }
                    } else if (this.field506 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field501.length() < 40) {
                            this.field501 = this.field501 + (char) var2;
                            this.field636 = true;
                        }
                        if (var2 == 8 && this.field501.length() > 0) {
                            this.field501 = this.field501.substring(0, this.field501.length() - 1);
                            this.field636 = true;
                        }
                    } else if (this.field319 == -1 && this.field576 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field499.length() < 80) {
                            this.field499 = this.field499 + (char) var2;
                            this.field636 = true;
                        }
                        if (var2 == 8 && this.field499.length() > 0) {
                            this.field499 = this.field499.substring(0, this.field499.length() - 1);
                            this.field636 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field499.length() > 0) {
                            if (this.field524 == 2) {
                                if (this.field499.equals("::clientdrop")) {
                                    this.method65(13228);
                                }
                                if (this.field499.equals("::lag")) {
                                    this.method168(-26491);
                                }
                                if (this.field499.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field702.method293((byte) 4, 2); ++var13) {
                                        this.field702.method284(-424, 2, var13, (byte) 1);
                                    }
                                }
                                if (this.field499.equals("::fpson")) {
                                    field486 = true;
                                }
                                if (this.field499.equals("::fpsoff")) {
                                    field486 = false;
                                }
                                if (this.field499.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field335[var14].field134[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field499.startsWith("::")) {
                                this.field230.method504(200, 1);
                                this.field230.method505(this.field499.length() - 1);
                                this.field230.method512(this.field499.substring(2));
                            } else {
                                String var17 = this.field499.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field499 = this.field499.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field499 = this.field499.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field499 = this.field499.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field499 = this.field499.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field499 = this.field499.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field499 = this.field499.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field499 = this.field499.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field499 = this.field499.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field499 = this.field499.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field499 = this.field499.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field499 = this.field499.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field499 = this.field499.substring(6);
                                }
                                String var19 = this.field499.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field499 = this.field499.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field499 = this.field499.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field499 = this.field499.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field499 = this.field499.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field499 = this.field499.substring(6);
                                }
                                this.field230.method504(7, 1);
                                this.field230.method505(0);
                                int var21 = this.field230.field1615;
                                this.field403.field1615 = 0;
                                class29.method298(this.field233, this.field403, this.field499);
                                this.field230.method551(this.field403.field1614, this.field403.field1615, 0, 0);
                                this.field230.method531(var20, 7);
                                this.field230.method531(var18, 7);
                                this.field230.method514(this.field230.field1615 - var21, 371);
                                this.field499 = class29.method299(this.field499, 7);
                                this.field499 = class54.method467(this.field499, 7);
                                field378.field207 = this.field499;
                                field378.field196 = var18;
                                field378.field194 = var20;
                                field378.field192 = 150;
                                if (this.field524 == 2) {
                                    this.method175((byte) 2, 2, field378.field207, "@cr2@" + field378.field1554);
                                } else if (this.field524 == 1) {
                                    this.method175((byte) 2, 2, field378.field207, "@cr1@" + field378.field1554);
                                } else {
                                    this.method175((byte) 2, 2, field378.field207, field378.field1554);
                                }
                                if (this.field429 == 2) {
                                    this.field429 = 3;
                                    this.field571 = true;
                                    this.field230.method504(102, 1);
                                    this.field230.method505(this.field429);
                                    this.field230.method505(this.field313);
                                    this.field230.method505(this.field594);
                                }
                            }
                            this.field499 = "";
                            this.field636 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field644.length() < 12) {
                this.field644 = this.field644 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method26(int arg0, String arg1, int arg2) {
        this.field485 = arg0;
        if (arg2 != 2) {
            this.field292 = this.field688.method558();
        }
        this.field226 = arg1;
        this.method80(0);
        if (this.field595 == null) {
            super.method26(arg0, arg1, 2);
        } else {
            this.field586.method273(1);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field464.method589(var5 / 2 - 26 - var6, 16777215, var4 / 2, "RuneScape is loading - please wait...", -27242);
            int var7 = var5 / 2 - 18 - var6;
            class32.method316(304, var7, 34, var4 / 2 - 152, 0, 9179409);
            class32.method316(302, var7 + 1, 32, var4 / 2 - 151, 0, 0);
            class32.method315(9179409, this.field523, var4 / 2 - 150, var7 + 2, 30, arg0 * 3);
            class32.method315(0, this.field523, arg0 * 3 + (var4 / 2 - 150), var7 + 2, 30, 300 - arg0 * 3);
            this.field464.method589(var5 / 2 + 5 - var6, 16777215, var4 / 2, arg1, -27242);
            this.field586.method274(super.field80, 202, 171, -331);
            if (this.field691) {
                this.field691 = false;
                if (!this.field687) {
                    this.field587.method274(super.field80, 0, 0, -331);
                    this.field588.method274(super.field80, 637, 0, -331);
                }
                this.field584.method274(super.field80, 128, 0, -331);
                this.field585.method274(super.field80, 202, 371, -331);
                this.field589.method274(super.field80, 0, 265, -331);
                this.field590.method274(super.field80, 562, 265, -331);
                this.field591.method274(super.field80, 128, 171, -331);
                this.field592.method274(super.field80, 562, 171, -331);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LOSRLSEOB;I)V")
    public final void method138(class41 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field416.length; ++var4) {
            this.field416[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field416[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field417[var16] = (this.field416[var16 - 1] + this.field416[var16 + 1] + this.field416[var16 - 128] + this.field416[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field416;
            this.field416 = this.field417;
            this.field417 = var14;
        }
        if (arg1 == 8) {
            if (arg0 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg0.field1295; ++var8) {
                    for (int var9 = 0; var9 < arg0.field1294; ++var9) {
                        if (arg0.field1292[var7++] != 0) {
                            int var10 = var9 + 16 + arg0.field1296;
                            int var11 = var8 + 16 + arg0.field1297;
                            int var12 = (var11 << 7) + var10;
                            this.field416[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field336.method369(arg4, arg3, -973);
        this.field337.method369(arg4, arg3 + arg5 - 16, -973);
        class32.method315(this.field298, this.field523, arg4, arg3 + 16, arg5 - 32, 16);
        int var7 = (arg5 - 32) * arg5 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg1 / (arg0 - arg5);
        class32.method315(this.field507, this.field523, arg4, arg3 + 16 + var8, var7, 16);
        if (arg2 >= 3 && arg2 <= 3) {
            class32.method320((byte) 109, arg4, this.field251, arg3 + 16 + var8, var7);
            class32.method320((byte) 109, arg4 + 1, this.field251, arg3 + 16 + var8, var7);
            class32.method318(arg3 + 16 + var8, 16, true, arg4, this.field251);
            class32.method318(arg3 + 17 + var8, 16, true, arg4, this.field251);
            class32.method320((byte) 109, arg4 + 15, this.field304, arg3 + 16 + var8, var7);
            class32.method320((byte) 109, arg4 + 14, this.field304, arg3 + 17 + var8, var7 - 1);
            class32.method318(arg3 + 15 + var8 + var7, 16, true, arg4, this.field304);
            class32.method318(arg3 + 14 + var8 + var7, 15, true, arg4 + 1, this.field304);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method140(byte arg0) {
        if (arg0 != 9) {
            this.field407 = null;
        }
        for (int var2 = -1; var2 < this.field479; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field477;
            } else {
                var6 = this.field480[var2];
            }
            class53 var7 = this.field478[var6];
            if (var7 != null && var7.field192 > 0) {
                --var7.field192;
                if (var7.field192 == 0) {
                    var7.field207 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field405; ++var3) {
            int var4 = this.field406[var3];
            class47 var5 = this.field404[var4];
            if (var5 != null && var5.field192 > 0) {
                --var5.field192;
                if (var5.field192 == 0) {
                    var5.field207 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 369);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field410 = Integer.parseInt(arg0[0]);
                field411 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method64(false);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method72(-8266);
                }
                if (arg0[3].equals("free")) {
                    field412 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field412 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method14(765, 503, 805);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
    public final void method141(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field303 >= 100) {
                this.method175((byte) 2, 0, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = class69.method582(class69.method579(this.field393, arg1), true);
                for (int var5 = 0; var5 < this.field303; ++var5) {
                    if (this.field383[var5] == arg1) {
                        this.method175((byte) 2, 0, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field610; ++var6) {
                    if (this.field220[var6] == arg1) {
                        this.method175((byte) 2, 0, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                if (!arg0) {
                    this.field233 = this.field688.method558();
                }
                this.field383[this.field303++] = arg1;
                this.field350 = true;
                this.field230.method504(108, 1);
                this.field230.method511(arg1, -845);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLWBEWPIXO;)V")
    public final void method142(int arg0, byte arg1, class58 arg2) {
        if (arg1 != 110) {
            this.field230.method505(93);
        }
        if (arg0 == 138) {
            int var4 = arg2.method515();
            int var5 = (var4 >> 4 & 7) + this.field221;
            int var6 = (var4 & 7) + this.field222;
            int var7 = arg2.method517();
            int var8 = arg2.method515();
            int var9 = var8 >> 4 & 15;
            int var10 = var8 & 7;
            if (field378.field160[0] >= var5 - var9 && field378.field160[0] <= var5 + var9 && field378.field161[0] >= var6 - var9 && field378.field161[0] <= var6 + var9 && this.field317 && !field413 && this.field663 < 50) {
                this.field494[this.field663] = var7;
                this.field408[this.field663] = var10;
                this.field692[this.field663] = class57.field1595[var7];
                ++this.field663;
            }
        }
        if (arg0 == 225) {
            int var11 = arg2.method517();
            int var12 = arg2.method543(false);
            int var13 = arg2.method534(true);
            int var14 = (var13 >> 4 & 7) + this.field221;
            int var15 = (var13 & 7) + this.field222;
            int var16 = arg2.method517();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && this.field286 != var11) {
                class51 var17 = new class51();
                var17.field1508 = var16;
                var17.field1507 = var12;
                if (this.field407[this.field653][var14][var15] == null) {
                    this.field407[this.field653][var14][var15] = new class37(2);
                }
                this.field407[this.field653][var14][var15].method337(var17);
                this.method112(var14, var15);
            }
        } else if (arg0 == 119) {
            int var18 = arg2.method515();
            int var19 = (var18 >> 4 & 7) + this.field221;
            int var20 = (var18 & 7) + this.field222;
            int var21 = arg2.method517();
            int var22 = arg2.method517();
            int var23 = arg2.method517();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class37 var24 = this.field407[this.field653][var19][var20];
                if (var24 != null) {
                    for (class51 var25 = (class51) var24.method340(); var25 != null; var25 = (class51) var24.method342(954)) {
                        if ((var21 & 32767) == var25.field1508 && var25.field1507 == var22) {
                            var25.field1507 = var23;
                            break;
                        }
                    }
                    this.method112(var19, var20);
                }
            }
        } else if (arg0 == 250) {
            int var26 = arg2.method515();
            int var27 = (var26 >> 4 & 7) + this.field221;
            int var28 = (var26 & 7) + this.field222;
            int var29 = arg2.method517();
            int var30 = arg2.method515();
            int var31 = arg2.method517();
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                int var32 = var27 * 128 + 64;
                int var33 = var28 * 128 + 64;
                class11 var34 = new class11(this.method154(-760, this.field653, var32, var33) - var30, var32, field608, 207, var29, this.field653, var31, var33);
                this.field489.method337(var34);
            }
        } else if (arg0 == 210) {
            int var35 = arg2.method543(false);
            int var36 = arg2.method533(18094);
            int var37 = (var36 >> 4 & 7) + this.field221;
            int var38 = (var36 & 7) + this.field222;
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                class37 var39 = this.field407[this.field653][var37][var38];
                if (var39 != null) {
                    for (class51 var40 = (class51) var39.method340(); var40 != null; var40 = (class51) var39.method342(954)) {
                        if ((var35 & 32767) == var40.field1508) {
                            var40.method41();
                            break;
                        }
                    }
                    if (var39.method340() == null) {
                        this.field407[this.field653][var37][var38] = null;
                    }
                    this.method112(var37, var38);
                }
            }
        } else if (arg0 == 150) {
            int var41 = arg2.method515();
            int var42 = (var41 >> 4 & 7) + this.field221;
            int var43 = (var41 & 7) + this.field222;
            int var44 = arg2.method534(true);
            int var45 = var44 >> 2;
            int var46 = var44 & 3;
            int var47 = this.field274[var45];
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                this.method62(-1, var46, var47, this.field653, -1, var42, 0, var43, var45, -46589);
            }
        } else if (arg0 == 190) {
            int var48 = arg2.method515();
            int var49 = (var48 >> 4 & 7) + this.field221;
            int var50 = (var48 & 7) + this.field222;
            int var51 = var49 + arg2.method516();
            int var52 = var50 + arg2.method516();
            int var53 = arg2.method518();
            int var54 = arg2.method517();
            int var55 = arg2.method515() * 4;
            int var56 = arg2.method515() * 4;
            int var57 = arg2.method517();
            int var58 = arg2.method517();
            int var59 = arg2.method515();
            int var60 = arg2.method515();
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104 && var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104 && var54 != 65535) {
                int var61 = var49 * 128 + 64;
                int var62 = var50 * 128 + 64;
                int var63 = var51 * 128 + 64;
                int var64 = var52 * 128 + 64;
                class38 var65 = new class38(var59, field608 + var58, this.field653, var54, var53, var62, var56, this.method154(-760, this.field653, var61, var62) - var55, var61, field608 + var57, var60, (byte) 22);
                var65.method345(field608 + var57, this.method154(-760, this.field653, var63, var64) - var56, var64, true, var63);
                this.field603.method337(var65);
            }
        } else if (arg0 == 205) {
            int var66 = arg2.method532(true);
            int var67 = var66 >> 2;
            int var68 = var66 & 3;
            int var69 = this.field274[var67];
            int var70 = arg2.method534(true);
            int var71 = (var70 >> 4 & 7) + this.field221;
            int var72 = (var70 & 7) + this.field222;
            int var73 = arg2.method543(false);
            if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                this.method62(-1, var68, var69, this.field653, var73, var71, 0, var72, var67, -46589);
            }
        } else {
            if (arg0 == 149) {
                byte var74 = arg2.method537(true);
                byte var75 = arg2.method537(true);
                int var76 = arg2.method517();
                int var77 = arg2.method542(this.field390);
                byte var78 = arg2.method516();
                int var79 = arg2.method532(true);
                int var80 = var79 >> 2;
                int var81 = var79 & 3;
                int var82 = this.field274[var80];
                int var83 = arg2.method543(false);
                int var84 = arg2.method515();
                int var85 = (var84 >> 4 & 7) + this.field221;
                int var86 = (var84 & 7) + this.field222;
                byte var87 = arg2.method535(0);
                int var88 = arg2.method517();
                class53 var89;
                if (this.field286 == var76) {
                    var89 = field378;
                } else {
                    var89 = this.field478[var76];
                }
                if (var89 != null) {
                    class22 var90 = class22.method246(var88);
                    int var91 = this.field282[this.field653][var85][var86];
                    int var92 = this.field282[this.field653][var85 + 1][var86];
                    int var93 = this.field282[this.field653][var85 + 1][var86 + 1];
                    int var94 = this.field282[this.field653][var85][var86 + 1];
                    class19 var95 = var90.method244(var80, var81, var91, var92, var93, var94, -1);
                    if (var95 != null) {
                        this.method62(var83 + 1, 0, var82, this.field653, -1, var85, var77 + 1, var86, 0, -46589);
                        var89.field1541 = field608 + var77;
                        var89.field1542 = field608 + var83;
                        var89.field1551 = var95;
                        int var96 = var90.field904;
                        int var97 = var90.field893;
                        if (var81 == 1 || var81 == 3) {
                            var96 = var90.field893;
                            var97 = var90.field904;
                        }
                        var89.field1548 = var85 * 128 + var96 * 64;
                        var89.field1550 = var86 * 128 + var97 * 64;
                        var89.field1549 = this.method154(-760, this.field653, var89.field1548, var89.field1550);
                        if (var74 > var78) {
                            byte var98 = var74;
                            var74 = var78;
                            var78 = var98;
                        }
                        if (var75 > var87) {
                            byte var99 = var75;
                            var75 = var87;
                            var87 = var99;
                        }
                        var89.field1527 = var74 + var85;
                        var89.field1529 = var78 + var85;
                        var89.field1528 = var75 + var86;
                        var89.field1530 = var86 + var87;
                    }
                }
            }
            if (arg0 == 135) {
                int var100 = arg2.method534(true);
                int var101 = (var100 >> 4 & 7) + this.field221;
                int var102 = (var100 & 7) + this.field222;
                int var103 = arg2.method534(true);
                int var104 = var103 >> 2;
                int var105 = var103 & 3;
                int var106 = this.field274[var104];
                int var107 = arg2.method517();
                if (var101 >= 0 && var102 >= 0 && var101 < 103 && var102 < 103) {
                    int var108 = this.field282[this.field653][var101][var102];
                    int var109 = this.field282[this.field653][var101 + 1][var102];
                    int var110 = this.field282[this.field653][var101 + 1][var102 + 1];
                    int var111 = this.field282[this.field653][var101][var102 + 1];
                    if (var106 == 0) {
                        class65 var112 = this.field667.method421(var102, this.field653, var101, -11160);
                        if (var112 != null) {
                            int var113 = var112.field1689 >> 14 & 32767;
                            if (var104 == 2) {
                                var112.field1687 = new class67(var109, false, var113, (byte) 8, var107, var111, var108, var105 + 4, var110, 2);
                                var112.field1688 = new class67(var109, false, var113, (byte) 8, var107, var111, var108, var105 + 1 & 3, var110, 2);
                            } else {
                                var112.field1687 = new class67(var109, false, var113, (byte) 8, var107, var111, var108, var105, var110, var104);
                            }
                        }
                    }
                    if (var106 == 1) {
                        class17 var114 = this.field667.method422(var101, -215, this.field653, var102);
                        if (var114 != null) {
                            var114.field750 = new class67(var109, false, var114.field751 >> 14 & 32767, (byte) 8, var107, var111, var108, 0, var110, 4);
                        }
                    }
                    if (var106 == 2) {
                        class2 var115 = this.field667.method423(var101, (byte) 72, var102, this.field653);
                        if (var104 == 11) {
                            var104 = 10;
                        }
                        if (var115 != null) {
                            var115.field57 = new class67(var109, false, var115.field65 >> 14 & 32767, (byte) 8, var107, var111, var108, var105, var110, var104);
                        }
                    }
                    if (var106 == 3) {
                        class23 var116 = this.field667.method424(var102, var101, 43845, this.field653);
                        if (var116 != null) {
                            var116.field908 = new class67(var109, false, var116.field909 >> 14 & 32767, (byte) 8, var107, var111, var108, var105, var110, 22);
                        }
                    }
                }
            } else if (arg0 == 141) {
                int var117 = arg2.method517();
                int var118 = arg2.method517();
                int var119 = arg2.method515();
                int var120 = (var119 >> 4 & 7) + this.field221;
                int var121 = (var119 & 7) + this.field222;
                if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104) {
                    class51 var122 = new class51();
                    var122.field1508 = var117;
                    var122.field1507 = var118;
                    if (this.field407[this.field653][var120][var121] == null) {
                        this.field407[this.field653][var120][var121] = new class37(2);
                    }
                    this.field407[this.field653][var120][var121].method337(var122);
                    this.method112(var120, var121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method143(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field444 = this.field698.method515();
        }
        if (this.field352 == 0 && this.field457 == 0) {
            this.field302[this.field694] = "Walk here";
            this.field290[this.field694] = 238;
            this.field288[this.field694] = super.field88;
            this.field289[this.field694] = super.field89;
            ++this.field694;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < class19.field828; ++var4) {
            int var5 = class19.field829[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var3 != var5) {
                var3 = var5;
                if (var8 == 2 && this.field667.method429(this.field653, var6, var7, var5) >= 0) {
                    class22 var10 = class22.method246(var9);
                    if (var10.field858 != null) {
                        var10 = var10.method238(-734);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field352 == 1) {
                        this.field302[this.field694] = "Use " + this.field356 + " with @cya@" + var10.field886;
                        this.field290[this.field694] = 544;
                        this.field291[this.field694] = var5;
                        this.field288[this.field694] = var6;
                        this.field289[this.field694] = var7;
                        ++this.field694;
                    } else if (this.field457 == 1) {
                        if ((this.field459 & 4) == 4) {
                            this.field302[this.field694] = this.field460 + " @cya@" + var10.field886;
                            this.field290[this.field694] = 689;
                            this.field291[this.field694] = var5;
                            this.field288[this.field694] = var6;
                            this.field289[this.field694] = var7;
                            ++this.field694;
                        }
                    } else {
                        if (var10.field891 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field891[var11] != null) {
                                    this.field302[this.field694] = var10.field891[var11] + " @cya@" + var10.field886;
                                    if (var11 == 0) {
                                        this.field290[this.field694] = 87;
                                    }
                                    if (var11 == 1) {
                                        this.field290[this.field694] = 570;
                                    }
                                    if (var11 == 2) {
                                        this.field290[this.field694] = 198;
                                    }
                                    if (var11 == 3) {
                                        this.field290[this.field694] = 334;
                                    }
                                    if (var11 == 4) {
                                        this.field290[this.field694] = 1313;
                                    }
                                    this.field291[this.field694] = var5;
                                    this.field288[this.field694] = var6;
                                    this.field289[this.field694] = var7;
                                    ++this.field694;
                                }
                            }
                        }
                        this.field302[this.field694] = "Examine @cya@" + var10.field886;
                        this.field290[this.field694] = 1764;
                        this.field291[this.field694] = var10.field888 << 14;
                        this.field288[this.field694] = var6;
                        this.field289[this.field694] = var7;
                        ++this.field694;
                    }
                }
                if (var8 == 1) {
                    class47 var12 = this.field404[var9];
                    if (var12.field1410.field1390 == 1 && (var12.field211 & 127) == 64 && (var12.field212 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field405; ++var13) {
                            class47 var16 = this.field404[this.field406[var13]];
                            if (var16 != null && var12 != var16 && var16.field1410.field1390 == 1 && var12.field211 == var16.field211 && var12.field212 == var16.field212) {
                                this.method56(var7, var6, 2, this.field406[var13], var16.field1410);
                            }
                        }
                        for (int var14 = 0; var14 < this.field479; ++var14) {
                            class53 var15 = this.field478[this.field480[var14]];
                            if (var15 != null && var12.field211 == var15.field211 && var12.field212 == var15.field212) {
                                this.method49(var15, true, var7, this.field480[var14], var6);
                            }
                        }
                    }
                    this.method56(var7, var6, 2, var9, var12.field1410);
                }
                if (var8 == 0) {
                    class53 var17 = this.field478[var9];
                    if ((var17.field211 & 127) == 64 && (var17.field212 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field405; ++var18) {
                            class47 var21 = this.field404[this.field406[var18]];
                            if (var21 != null && var21.field1410.field1390 == 1 && var17.field211 == var21.field211 && var17.field212 == var21.field212) {
                                this.method56(var7, var6, 2, this.field406[var18], var21.field1410);
                            }
                        }
                        for (int var19 = 0; var19 < this.field479; ++var19) {
                            class53 var20 = this.field478[this.field480[var19]];
                            if (var20 != null && var17 != var20 && var17.field211 == var20.field211 && var17.field212 == var20.field212) {
                                this.method49(var20, true, var7, this.field480[var19], var6);
                            }
                        }
                    }
                    this.method49(var17, true, var7, var9, var6);
                }
                if (var8 == 3) {
                    class37 var22 = this.field407[this.field653][var6][var7];
                    if (var22 != null) {
                        for (class51 var23 = (class51) var22.method341((byte) -60); var23 != null; var23 = (class51) var22.method343(-717)) {
                            class1 var24 = class1.method7(var23.field1508);
                            if (this.field352 == 1) {
                                this.field302[this.field694] = "Use " + this.field356 + " with @lre@" + var24.field22;
                                this.field290[this.field694] = 555;
                                this.field291[this.field694] = var23.field1508;
                                this.field288[this.field694] = var6;
                                this.field289[this.field694] = var7;
                                ++this.field694;
                            } else if (this.field457 == 1) {
                                if ((this.field459 & 1) == 1) {
                                    this.field302[this.field694] = this.field460 + " @lre@" + var24.field22;
                                    this.field290[this.field694] = 57;
                                    this.field291[this.field694] = var23.field1508;
                                    this.field288[this.field694] = var6;
                                    this.field289[this.field694] = var7;
                                    ++this.field694;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field14 != null && var24.field14[var25] != null) {
                                        this.field302[this.field694] = var24.field14[var25] + " @lre@" + var24.field22;
                                        if (var25 == 0) {
                                            this.field290[this.field694] = 48;
                                        }
                                        if (var25 == 1) {
                                            this.field290[this.field694] = 639;
                                        }
                                        if (var25 == 2) {
                                            this.field290[this.field694] = 209;
                                        }
                                        if (var25 == 3) {
                                            this.field290[this.field694] = 624;
                                        }
                                        if (var25 == 4) {
                                            this.field290[this.field694] = 746;
                                        }
                                        this.field291[this.field694] = var23.field1508;
                                        this.field288[this.field694] = var6;
                                        this.field289[this.field694] = var7;
                                        ++this.field694;
                                    } else if (var25 == 2) {
                                        this.field302[this.field694] = "Take @lre@" + var24.field22;
                                        this.field290[this.field694] = 209;
                                        this.field291[this.field694] = var23.field1508;
                                        this.field288[this.field694] = var6;
                                        this.field289[this.field694] = var7;
                                        ++this.field694;
                                    }
                                }
                                this.field302[this.field694] = "Examine @lre@" + var24.field22;
                                this.field290[this.field694] = 1805;
                                this.field291[this.field694] = var23.field1508;
                                this.field288[this.field694] = var6;
                                this.field289[this.field694] = var7;
                                ++this.field694;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++this.field428;
        this.method107(true, 5);
        this.method176(true, (byte) 8);
        this.method107(false, 5);
        this.method176(false, (byte) 8);
        this.method136((byte) -80);
        this.method86(9);
        if (!this.field686) {
            int var2 = this.field578;
            if (this.field660 / 256 > var2) {
                var2 = this.field660 / 256;
            }
            if (this.field635[4] && this.field638[4] + 128 > var2) {
                var2 = this.field638[4] + 128;
            }
            int var3 = this.field579 + this.field432 & 2047;
            this.method47(this.field278, var2 * 3 + 600, false, this.method154(-760, this.field653, field378.field211, field378.field212) - 50, var2, var3, this.field277);
        }
        int var4;
        if (!this.field686) {
            var4 = this.method117(this.field318);
        } else {
            var4 = this.method118(0);
        }
        int var5 = this.field629;
        int var6 = this.field630;
        int var7 = this.field631;
        int var8 = this.field632;
        int var9 = this.field633;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field635[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field696[var10] * 2 + 1) - (double) this.field696[var10] + Math.sin((double) this.field654[var10] / 100.0D * (double) this.field627[var10]) * (double) this.field638[var10]);
                if (var10 == 0) {
                    this.field629 += var12;
                }
                if (var10 == 1) {
                    this.field630 += var12;
                }
                if (var10 == 2) {
                    this.field631 += var12;
                }
                if (var10 == 3) {
                    this.field633 = this.field633 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field632 += var12;
                    if (this.field632 < 128) {
                        this.field632 = 128;
                    }
                    if (this.field632 > 383) {
                        this.field632 = 383;
                    }
                }
            }
        }
        int var11 = class45.field1365;
        class19.field825 = true;
        class19.field828 = 0;
        class19.field826 = super.field88 - 4;
        class19.field827 = super.field89 - 4;
        if (arg0 < 0) {
            class32.method313((byte) 73);
            this.field667.method438((byte) -65, this.field633, this.field630, this.field631, var4, this.field629, this.field632);
            this.field667.method413(false);
            this.method181(this.field437);
            this.method169(true);
            this.method120(var11, true);
            this.method90(7484);
            this.field558.method274(super.field80, 4, 4, -331);
            this.field629 = var5;
            this.field630 = var6;
            this.field631 = var7;
            this.field632 = var8;
            this.field633 = var9;
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method145(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method146(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -45946) {
            this.field675 = -154;
        }
        int var5 = 256 - arg0;
        return ((arg1 & 16711935) * arg0 + (arg2 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg0 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method147(int arg0) {
        short var2 = 256;
        if (arg0 < 3 || arg0 > 3) {
            this.method19();
        }
        if (this.field525 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field525 > 768) {
                    this.field639[var3] = this.method146(1024 - this.field525, this.field641[var3], this.field640[var3], -45946);
                } else if (this.field525 > 256) {
                    this.field639[var3] = this.field641[var3];
                } else {
                    this.field639[var3] = this.method146(256 - this.field525, this.field640[var3], this.field641[var3], -45946);
                }
            }
        } else if (this.field526 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field526 > 768) {
                    this.field639[var4] = this.method146(1024 - this.field526, this.field642[var4], this.field640[var4], -45946);
                } else if (this.field526 > 256) {
                    this.field639[var4] = this.field642[var4];
                } else {
                    this.field639[var4] = this.method146(256 - this.field526, this.field640[var4], this.field642[var4], -45946);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field639[var5] = this.field640[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field587.field962[var6] = this.field275.field1281[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field678[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field347[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field639[var26];
                    int var30 = this.field587.field962[var8];
                    this.field587.field962[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field587.method274(super.field80, 0, 0, -331);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field588.field962[var10] = this.field276.field1281[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field678[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field347[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field639[var18];
                    int var22 = this.field588.field962[var16];
                    this.field588.field962[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field588.method274(super.field80, 637, 0, -331);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method148(byte arg0) {
        this.field559.method273(1);
        class45.field1356 = this.field364;
        if (arg0 != -32) {
            this.field407 = null;
        }
        this.field475.method369(0, 0, -973);
        if (this.field273) {
            this.field464.method589(40, 0, 239, this.field555, -27242);
            this.field464.method589(60, 128, 239, this.field565 + "*", -27242);
        } else if (this.field506 == 1) {
            this.field464.method589(40, 0, 239, "Enter amount:", -27242);
            this.field464.method589(60, 128, 239, this.field501 + "*", -27242);
        } else if (this.field506 == 2) {
            this.field464.method589(40, 0, 239, "Enter name:", -27242);
            this.field464.method589(60, 128, 239, this.field501 + "*", -27242);
        } else if (this.field506 == 3) {
            if (this.field501 != this.field268) {
                this.method87(616, this.field501);
                this.field268 = this.field501;
            }
            class72 var2 = this.field463;
            class32.method312(0, 0, 77, 463, 0);
            for (int var3 = 0; var3 < this.field269; ++var3) {
                int var4 = var3 * 14 + 18 - this.field272;
                if (var4 > 0 && var4 < 110) {
                    var2.method589(var4, 0, 239, this.field270[var3], -27242);
                }
            }
            class32.method311(0);
            if (this.field269 > 5) {
                this.method139(this.field269 * 14 + 7, this.field272, this.field500, 0, 463, 77);
            }
            if (this.field501.length() == 0) {
                this.field464.method589(40, 255, 239, "Enter object name", -27242);
            } else if (this.field269 == 0) {
                this.field464.method589(40, 0, 239, "No matching objects found, please shorten search", -27242);
            }
            var2.method589(90, 0, 239, this.field501 + "*", -27242);
            class32.method318(77, 479, true, 0, 0);
        } else if (this.field697 != null) {
            this.field464.method589(40, 0, 239, this.field697, -27242);
            this.field464.method589(60, 128, 239, "Click to continue", -27242);
        } else if (this.field319 != -1) {
            this.method85(0, 0, this.field583, class34.method324(this.field319), 0);
        } else if (this.field533 != -1) {
            this.method85(0, 0, this.field583, class34.method324(this.field533), 0);
        } else {
            class72 var5 = this.field463;
            int var6 = 0;
            class32.method312(0, 0, 77, 463, 0);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field709[var7] != null) {
                    int var9 = this.field707[var7];
                    int var10 = 70 - var6 * 14 + this.field681;
                    String var11 = this.field708[var7];
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
                            var5.method593(false, 0, var10, this.field709[var7], 4);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field429 == 0 || this.field429 == 1 && this.method63(var11, -222))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field609[0].method369(var13, var10 - 12, -973);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field609[1].method369(var13, var10 - 12, -973);
                                var13 += 14;
                            }
                            var5.method593(false, 0, var10, var11 + ":", var13);
                            int var14 = var13 + var5.method591(false, var11) + 8;
                            var5.method593(false, 255, var10, this.field709[var7], var14);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field497 == 0 && (var9 == 7 || this.field313 == 0 || this.field313 == 1 && this.method63(var11, -222))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method593(false, 0, var10, "From", var15);
                            int var16 = var15 + var5.method591(false, "From ");
                            if (var12 == 1) {
                                this.field609[0].method369(var16, var10 - 12, -973);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field609[1].method369(var16, var10 - 12, -973);
                                var16 += 14;
                            }
                            var5.method593(false, 0, var10, var11 + ":", var16);
                            int var17 = var16 + var5.method591(false, var11) + 8;
                            var5.method593(false, 8388608, var10, this.field709[var7], var17);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field594 == 0 || this.field594 == 1 && this.method63(var11, -222))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method593(false, 8388736, var10, var11 + " " + this.field709[var7], 4);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field497 == 0 && this.field313 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method593(false, 8388608, var10, this.field709[var7], 4);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field497 == 0 && this.field313 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method593(false, 0, var10, "To " + var11 + ":", 4);
                            var5.method593(false, 8388608, var10, this.field709[var7], 12 + var5.method591(false, "To " + var11));
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field594 == 0 || this.field594 == 1 && this.method63(var11, -222))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method593(false, 8270336, var10, var11 + " " + this.field709[var7], 4);
                        }
                        ++var6;
                    }
                }
            }
            class32.method311(0);
            this.field561 = var6 * 14 + 7;
            if (this.field561 < 78) {
                this.field561 = 78;
            }
            this.method139(this.field561, this.field561 - this.field681 - 77, this.field500, 0, 463, 77);
            String var8;
            if (field378 != null && field378.field1554 != null) {
                var8 = field378.field1554;
            } else {
                var8 = class69.method582(this.field573, true);
            }
            var5.method593(false, 0, 90, var8 + ":", 4);
            var5.method593(false, 255, 90, this.field499 + "*", 6 + var5.method591(false, var8 + ": "));
            class32.method318(77, 479, true, 0, 0);
        }
        if (this.field389 && this.field450 == 2) {
            this.method105(true);
        }
        this.field559.method274(super.field80, 17, 357, -331);
        this.field558.method273(1);
        class45.field1356 = this.field366;
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCELKGLWS;BI)V")
    public final void method149(class10 arg0, byte arg1, int arg2) {
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            this.field651 = -350;
        }
        this.method150(-19415, arg2, arg0.field212, arg0.field211);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
    public final void method150(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
            int var5 = this.method154(-760, this.field653, arg3, arg2) - arg1;
            int var6 = arg3 - this.field629;
            int var7 = var5 - this.field630;
            int var8 = arg2 - this.field631;
            int var9 = class19.field830[this.field632];
            int var10 = class19.field831[this.field632];
            int var11 = class19.field830[this.field633];
            int var12 = class19.field831[this.field633];
            if (arg0 != -19415) {
                this.field444 = this.field698.method515();
            }
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field648 = (var13 << 9) / var17 + class45.field1350;
                this.field649 = (var16 << 9) / var17 + class45.field1351;
            } else {
                this.field648 = -1;
                this.field649 = -1;
            }
        } else {
            this.field648 = -1;
            this.field649 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Z")
    public final boolean method151(boolean arg0) {
        if (arg0) {
            this.field444 = -1;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method152(int arg0) {
        this.field699 = new class41(this.field595, "titlebox", 0);
        this.field700 = new class41(this.field595, "titlebutton", 0);
        if (arg0 != 38021) {
            this.field695 = !this.field695;
        }
        this.field250 = new class41[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field250[var2] = new class41(this.field595, "runes", var2);
        }
        this.field275 = new class40(128, 265);
        this.field276 = new class40(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field275.field1281[var3] = this.field587.field962[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field276.field1281[var4] = this.field588.field962[var4];
        }
        this.field640 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field640[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field640[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field640[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field640[var8 + 192] = 16777215;
        }
        this.field641 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field641[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field641[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field641[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field641[var12 + 192] = 16777215;
        }
        this.field642 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field642[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field642[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field642[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field642[var16 + 192] = 16777215;
        }
        this.field639 = new int[256];
        this.field416 = new int[32768];
        this.field417 = new int[32768];
        this.method138((class41) null, this.field628);
        this.field347 = new int[32768];
        this.field348 = new int[32768];
        this.method26(10, "Connecting to fileserver", 2);
        if (!this.field687) {
            this.field283 = true;
            this.field687 = true;
            this.method25(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Z")
    public final boolean method153(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field407 = null;
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field290[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 50;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
    public final int method154(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field331[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg3 & 127;
            while (arg0 >= 0) {
                this.field444 = this.field698.method515();
            }
            int var10 = (128 - var8) * this.field282[var7][var5][var6] + this.field282[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field282[var7][var5][var6 + 1] + this.field282[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILWBEWPIXO;I)V")
    private final void method155(int arg0, class58 arg1, int arg2) {
        int var4 = arg1.method526(true, 8);
        if (var4 < this.field479) {
            for (int var5 = var4; var5 < this.field479; ++var5) {
                this.field509[this.field508++] = this.field480[var5];
            }
        }
        if (var4 > this.field479) {
            signlink.reporterror(this.field573 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field479 = 0;
            if (arg0 >= 9 && arg0 <= 9) {
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field480[var6];
                    class53 var8 = this.field478[var7];
                    int var9 = arg1.method526(true, 1);
                    if (var9 == 0) {
                        this.field480[this.field479++] = var7;
                        var8.field181 = field608;
                    } else {
                        int var10 = arg1.method526(true, 2);
                        if (var10 == 0) {
                            this.field480[this.field479++] = var7;
                            var8.field181 = field608;
                            this.field482[this.field481++] = var7;
                        } else if (var10 == 1) {
                            this.field480[this.field479++] = var7;
                            var8.field181 = field608;
                            int var11 = arg1.method526(true, 3);
                            var8.method45(false, false, var11);
                            int var12 = arg1.method526(true, 1);
                            if (var12 == 1) {
                                this.field482[this.field481++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field480[this.field479++] = var7;
                            var8.field181 = field608;
                            int var13 = arg1.method526(true, 3);
                            var8.method45(true, false, var13);
                            int var14 = arg1.method526(true, 3);
                            var8.method45(true, false, var14);
                            int var15 = arg1.method526(true, 1);
                            if (var15 == 1) {
                                this.field482[this.field481++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field509[this.field508++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method156(byte arg0, boolean arg1) {
        if (this.field358 == arg0) {
            boolean var3 = false;
            this.method80(0);
            this.field586.method273(1);
            this.field699.method369(0, 0, -973);
            short var4 = 360;
            short var5 = 200;
            if (this.field260 == 0) {
                int var6 = var5 / 2 + 80;
                this.field462.method590(7711145, true, this.field702.field1052, var4 / 2, var6, 0);
                int var7 = var5 / 2 - 20;
                this.field464.method590(16776960, true, "Welcome to RuneScape", var4 / 2, var7, 0);
                int var18 = var7 + 30;
                int var8 = var4 / 2 - 80;
                int var9 = var5 / 2 + 20;
                this.field700.method369(var8 - 73, var9 - 20, -973);
                this.field464.method590(16777215, true, "New User", var8, var9 + 5, 0);
                int var10 = var4 / 2 + 80;
                this.field700.method369(var10 - 73, var9 - 20, -973);
                this.field464.method590(16777215, true, "Existing User", var10, var9 + 5, 0);
            }
            if (this.field260 == 2) {
                int var11 = var5 / 2 - 40;
                if (this.field434.length() > 0) {
                    this.field464.method590(16776960, true, this.field434, var4 / 2, var11 - 15, 0);
                    this.field464.method590(16776960, true, this.field435, var4 / 2, var11, 0);
                    var11 += 30;
                } else {
                    this.field464.method590(16776960, true, this.field435, var4 / 2, var11 - 7, 0);
                    var11 += 30;
                }
                this.field464.method597((byte) 3, true, "Username: " + this.field573 + (this.field409 == 0 & field608 % 40 < 20 ? "@yel@|" : ""), var4 / 2 - 90, 16777215, var11);
                var11 += 15;
                this.field464.method597((byte) 3, true, "Password: " + class69.method583(-749, this.field574) + (this.field409 == 1 & field608 % 40 < 20 ? "@yel@|" : ""), var4 / 2 - 88, 16777215, var11);
                var11 += 15;
                if (!arg1) {
                    int var12 = var4 / 2 - 80;
                    int var13 = var5 / 2 + 50;
                    this.field700.method369(var12 - 73, var13 - 20, -973);
                    this.field464.method590(16777215, true, "Login", var12, var13 + 5, 0);
                    int var14 = var4 / 2 + 80;
                    this.field700.method369(var14 - 73, var13 - 20, -973);
                    this.field464.method590(16777215, true, "Cancel", var14, var13 + 5, 0);
                }
            }
            if (this.field260 == 3) {
                this.field464.method590(16776960, true, "Create a free account", var4 / 2, var5 / 2 - 60, 0);
                int var15 = var5 / 2 - 35;
                this.field464.method590(16777215, true, "To create a new account you need to", var4 / 2, var15, 0);
                int var19 = var15 + 15;
                this.field464.method590(16777215, true, "go back to the main RuneScape webpage", var4 / 2, var19, 0);
                int var20 = var19 + 15;
                this.field464.method590(16777215, true, "and choose the 'create account'", var4 / 2, var20, 0);
                int var21 = var20 + 15;
                this.field464.method590(16777215, true, "button near the top of that page.", var4 / 2, var21, 0);
                int var22 = var21 + 15;
                int var16 = var4 / 2;
                int var17 = var5 / 2 + 50;
                this.field700.method369(var16 - 73, var17 - 20, -973);
                this.field464.method590(16777215, true, "Cancel", var16, var17 + 5, 0);
            }
            this.field586.method274(super.field80, 202, 171, -331);
            if (this.field691) {
                this.field691 = false;
                this.field584.method274(super.field80, 128, 0, -331);
                this.field585.method274(super.field80, 202, 371, -331);
                this.field589.method274(super.field80, 0, 265, -331);
                this.field590.method274(super.field80, 562, 265, -331);
                this.field591.method274(super.field80, 128, 171, -331);
                this.field592.method274(super.field80, 562, 171, -331);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method157(int arg0) {
        Graphics var2 = this.method24(731).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != 0) {
            this.field444 = -1;
        }
        var2.fillRect(0, 0, 765, 503);
        this.method17(7121, 1);
        if (this.field369) {
            this.field687 = false;
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
        if (this.field670) {
            this.field687 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field563) {
            this.field687 = false;
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method158(int arg0, int arg1, int arg2) {
        if (arg0 >= 9 && arg0 <= 9) {
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
            } else {
                return var3 > 0 ? "@gr1@" : "@yel@";
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method159(int arg0) {
        if (arg0 != 3) {
            this.field230.method505(137);
        }
        if (super.field94 == 1) {
            if (super.field95 >= 6 && super.field95 <= 106 && super.field96 >= 467 && super.field96 <= 499) {
                this.field429 = (this.field429 + 1) % 4;
                this.field571 = true;
                this.field636 = true;
                this.field230.method504(102, 1);
                this.field230.method505(this.field429);
                this.field230.method505(this.field313);
                this.field230.method505(this.field594);
            }
            if (super.field95 >= 135 && super.field95 <= 235 && super.field96 >= 467 && super.field96 <= 499) {
                this.field313 = (this.field313 + 1) % 3;
                this.field571 = true;
                this.field636 = true;
                this.field230.method504(102, 1);
                this.field230.method505(this.field429);
                this.field230.method505(this.field313);
                this.field230.method505(this.field594);
            }
            if (super.field95 >= 273 && super.field95 <= 373 && super.field96 >= 467 && super.field96 <= 499) {
                this.field594 = (this.field594 + 1) % 3;
                this.field571 = true;
                this.field636 = true;
                this.field230.method504(102, 1);
                this.field230.method505(this.field429);
                this.field230.method505(this.field313);
                this.field230.method505(this.field594);
            }
            if (super.field95 >= 412 && super.field95 <= 512 && super.field96 >= 467 && super.field96 <= 499) {
                if (this.field665 == -1) {
                    this.method68(0);
                    this.field644 = "";
                    this.field572 = false;
                    this.field430 = this.field665 = class34.field1131;
                    return;
                }
                this.method175((byte) 2, 0, "Please close the interface you have open before using 'report abuse'", "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method160(boolean arg0) {
        if (!arg0) {
            this.field306 = !this.field306;
        }
        this.field556.method273(1);
        class45.field1356 = this.field365;
        this.field473.method369(0, 0, -973);
        if (this.field312 != -1) {
            this.method85(0, 0, this.field583, class34.method324(this.field312), 0);
        } else if (this.field545[this.field284] != -1) {
            this.method85(0, 0, this.field583, class34.method324(this.field545[this.field284]), 0);
        }
        if (this.field389 && this.field450 == 1) {
            this.method105(true);
        }
        this.field556.method274(super.field80, 553, 205, -331);
        this.field558.method273(1);
        class45.field1356 = this.field366;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(LMRUJPFPS;Z)Z")
    public final boolean method161(class34 arg0, boolean arg1) {
        if (arg1) {
            this.field444 = -1;
        }
        if (arg0.field1121 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1121.length; ++var3) {
                int var4 = this.method164(arg0, 827, var3);
                int var5 = arg0.field1139[var3];
                if (arg0.field1121[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1121[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1121[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field687 = false;
        while (this.field601) {
            this.field687 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field699 = null;
        this.field700 = null;
        this.field250 = null;
        this.field639 = null;
        this.field640 = null;
        this.field641 = null;
        this.field642 = null;
        this.field416 = null;
        this.field417 = null;
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field347 = null;
        this.field348 = null;
        this.field275 = null;
        this.field276 = null;
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method163(int arg0) {
        int var2 = 60 / arg0;
        if (this.field449 == 0) {
            if (super.field94 == 1) {
                int var3 = super.field95 - 25 - 550;
                int var4 = super.field96 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field579 + this.field300 & 2047;
                    int var6 = class45.field1354[var5];
                    int var7 = class45.field1355[var5];
                    int var8 = (this.field598 + 256) * var6 >> 8;
                    int var9 = (this.field598 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field378.field211 + var10 >> 7;
                    int var13 = field378.field212 - var11 >> 7;
                    boolean var14 = this.method101(0, 0, true, 0, 0, field378.field161[0], var12, 1, field378.field160[0], var13, 0, 0);
                    if (var14) {
                        this.field230.method505(var3);
                        this.field230.method505(var4);
                        this.field230.method506(this.field579);
                        this.field230.method505(57);
                        this.field230.method505(this.field300);
                        this.field230.method505(this.field598);
                        this.field230.method505(89);
                        this.field230.method506(field378.field211);
                        this.field230.method506(field378.field212);
                        this.field230.method505(this.field674);
                        this.field230.method505(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMRUJPFPS;II)I")
    public final int method164(class34 arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            this.field444 = this.field698.method515();
        }
        if (arg0.field1165 != null && arg2 < arg0.field1165.length) {
            try {
                int[] var4 = arg0.field1165[arg2];
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
                        var9 = this.field244[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field562[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field689[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class34 var11 = class34.method324(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class1.field18 && (!class1.method7(var12).field37 || field412)) {
                            for (int var13 = 0; var13 < var11.field1119.length; ++var13) {
                                if (var12 + 1 == var11.field1119[var13]) {
                                    var9 += var11.field1135[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field693[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field376[this.field562[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field693[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field378.field1544;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class62.field1648; ++var14) {
                            if (class62.field1650[var14]) {
                                var9 += this.field562[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class34 var15 = class34.method324(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class1.field18 && (!class1.method7(var16).field37 || field412)) {
                            for (int var17 = 0; var17 < var15.field1119.length; ++var17) {
                                if (var15.field1119[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field372;
                    }
                    if (var8 == 12) {
                        var9 = this.field285;
                    }
                    if (var8 == 13) {
                        int var18 = this.field693[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class55 var21 = class55.field1581[var20];
                        int var22 = var21.field1583;
                        int var23 = var21.field1584;
                        int var24 = var21.field1585;
                        int var25 = field287[var24 - var23];
                        var9 = this.field693[var22] >> var23 & var25;
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
                        var9 = (field378.field211 >> 7) + this.field541;
                    }
                    if (var8 == 19) {
                        var9 = (field378.field212 >> 7) + this.field542;
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

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method165(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field347[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field347[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field348[var14] = (this.field347[var14 - 1] + this.field347[var14 + 1] + this.field347[var14 - 128] + this.field347[var14 + 128]) / 4;
            }
        }
        this.field385 += 128;
        if (this.field385 > this.field416.length) {
            this.field385 -= this.field416.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method138(this.field250[var6], this.field628);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field348[var11 + 128] - this.field416[this.field385 + var11 & this.field416.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field347[var11] = var12;
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < var2 - 1; ++var8) {
                this.field678[var8] = this.field678[var8 + 1];
            }
            this.field678[var2 - 1] = (int) (Math.sin((double) field608 / 14.0D) * 16.0D + Math.sin((double) field608 / 15.0D) * 14.0D + Math.sin((double) field608 / 16.0D) * 12.0D);
            if (this.field525 > 0) {
                this.field525 -= 4;
            }
            if (this.field526 > 0) {
                this.field526 -= 4;
            }
            if (this.field525 == 0 && this.field526 == 0) {
                int var9 = (int) (Math.random() * 2000.0D);
                if (var9 == 0) {
                    this.field525 = 1024;
                }
                if (var9 == 1) {
                    this.field526 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method20(int arg0) {
        if (arg0 == 10962) {
            if (!this.field563 && !this.field369 && !this.field670) {
                ++field608;
                if (!this.field680) {
                    this.method96(0);
                } else {
                    this.method102(4);
                }
                this.method54(678);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    public final void method166(int arg0) {
        if (this.field694 >= 2 || this.field352 != 0 || this.field457 != 0) {
            String var2;
            if (this.field352 == 1 && this.field694 < 2) {
                var2 = "Use " + this.field356 + " with...";
            } else if (this.field457 == 1 && this.field694 < 2) {
                var2 = this.field460 + "...";
            } else {
                var2 = this.field302[this.field694 - 1];
            }
            if (this.field694 > 2) {
                var2 = var2 + "@whi@ / " + (this.field694 - 2) + " more options";
            }
            this.field464.method598(var2, true, 4, 0, 15, 16777215, field608 / 1000);
            if (arg0 == 47975) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method167(boolean arg0) {
        int var2 = 5;
        this.field326[8] = 0;
        int var3 = 0;
        if (arg0) {
            this.method19();
        }
        while (this.field326[8] == 0) {
            String var4 = "Unknown problem";
            this.method26(20, "Connecting to web server", 2);
            try {
                DataInputStream var5 = this.method116("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 369);
                class58 var6 = new class58((byte) -115, new byte[40]);
                var5.readFully(var6.field1614, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field326[var7] = var6.method520();
                }
                int var8 = var6.method520();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field326[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field326[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field326[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field326[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field326[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field326[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method26(10, "Game updated - please reload page", 2);
                        var11 = 10;
                    } else {
                        this.method26(10, var4 + " - Will retry in " + var11 + " secs.", 2);
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
                this.field349 = !this.field349;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
    public void method168(int arg0) {
        System.out.println("============");
        if (arg0 != -26491) {
            this.field407 = null;
        }
        System.out.println("flame-cycle:" + this.field239);
        if (this.field702 != null) {
            System.out.println("Od-cycle:" + this.field702.field1023);
        }
        System.out.println("loop-cycle:" + field608);
        System.out.println("draw-cycle:" + field382);
        System.out.println("ptype:" + this.field444);
        System.out.println("psize:" + this.field443);
        if (this.field281 != null) {
            this.field281.method309(-26491);
        }
        super.field77 = true;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/awt/Component;")
    public final Component method24(int arg0) {
        if (arg0 <= 0) {
            this.field402 = -289;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field83 != null ? super.field83 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        if (this.field461 == 2) {
            this.method150(-19415, this.field264 * 2, (this.field263 - this.field542 << 7) + this.field266, (this.field262 - this.field541 << 7) + this.field265);
            this.field680 &= arg0;
            if (this.field648 > -1 && field608 % 20 < 10) {
                this.field422[0].method356(this.field648 - 12, this.field649 - 28, -973);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method170(byte arg0) {
        try {
            if (this.field281 != null) {
                this.field281.method304();
            }
        } catch (Exception var3) {
        }
        this.field281 = null;
        this.field680 = false;
        this.field260 = 0;
        this.field573 = "";
        this.field574 = "";
        this.method77((byte) 1);
        if (arg0 != 8) {
            this.field292 = this.field688.method558();
        }
        this.field667.method399(843);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field335[var2].method27();
        }
        System.gc();
        this.method113(true);
        this.field484 = -1;
        this.field257 = -1;
        this.field471 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public final void method171(byte arg0, String arg1, String arg2) {
        if (arg0 != -43) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (this.field558 != null) {
            this.field558.method273(1);
            class45.field1356 = this.field366;
            int var5 = 151;
            if (arg1 != null) {
                var5 -= 7;
            }
            this.field463.method589(var5, 0, 257, arg2, -27242);
            this.field463.method589(var5 - 1, 16777215, 256, arg2, -27242);
            var5 += 15;
            if (arg1 != null) {
                this.field463.method589(var5, 0, 257, arg1, -27242);
                this.field463.method589(var5 - 1, 16777215, 256, arg1, -27242);
            }
            this.field558.method274(super.field80, 4, 4, -331);
        } else if (super.field81 != null) {
            super.field81.method273(1);
            class45.field1356 = this.field367;
            int var6 = 251;
            short var7 = 300;
            byte var8 = 50;
            class32.method315(0, this.field523, 383 - var7 / 2, var6 - 5 - var8 / 2, var8, var7);
            class32.method316(var7, var6 - 5 - var8 / 2, var8, 383 - var7 / 2, 0, 16777215);
            if (arg1 != null) {
                var6 -= 7;
            }
            this.field463.method589(var6, 0, 383, arg2, -27242);
            this.field463.method589(var6 - 1, 16777215, 382, arg2, -27242);
            var6 += 15;
            if (arg1 != null) {
                this.field463.method589(var6, 0, 383, arg1, -27242);
                this.field463.method589(var6 - 1, 16777215, 382, arg1, -27242);
            }
            super.field81.method274(super.field80, 0, 0, -331);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    private final void method172(boolean arg0) {
        if (!arg0) {
            this.field424 = this.field688.method558();
        }
        for (class8 var2 = (class8) this.field386.method340(); var2 != null; var2 = (class8) this.field386.method342(954)) {
            if (var2.field146 == -1) {
                var2.field147 = 0;
                this.method103(-840, var2);
            } else {
                var2.method41();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    public final void method173(int arg0, byte arg1) {
        if (arg1 != -120) {
            this.field370 = !this.field370;
        }
        int var3 = class64.field1667[arg0].field1675;
        if (var3 != 0) {
            int var4 = this.field693[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class45.method381(-942, 0.9D);
                }
                if (var4 == 2) {
                    class45.method381(-942, 0.8D);
                }
                if (var4 == 3) {
                    class45.method381(-942, 0.7D);
                }
                if (var4 == 4) {
                    class45.method381(-942, 0.6D);
                }
                class1.field21.method336();
                this.field691 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field373;
                if (var4 == 0) {
                    this.method53(0, this.field373, 7);
                    this.field373 = true;
                }
                if (var4 == 1) {
                    this.method53(-400, this.field373, 7);
                    this.field373 = true;
                }
                if (var4 == 2) {
                    this.method53(-800, this.field373, 7);
                    this.field373 = true;
                }
                if (var4 == 3) {
                    this.method53(-1200, this.field373, 7);
                    this.field373 = true;
                }
                if (var4 == 4) {
                    this.field373 = false;
                }
                if (this.field373 != var5 && !field413) {
                    if (this.field373) {
                        this.field257 = this.field484;
                        this.field258 = true;
                        this.field702.method292(2, this.field257);
                    } else {
                        this.method113(true);
                    }
                    this.field471 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field317 = true;
                    this.method82(0, this.field315);
                }
                if (var4 == 1) {
                    this.field317 = true;
                    this.method82(-400, this.field315);
                }
                if (var4 == 2) {
                    this.field317 = true;
                    this.method82(-800, this.field315);
                }
                if (var4 == 3) {
                    this.field317 = true;
                    this.method82(-1200, this.field315);
                }
                if (var4 == 4) {
                    this.field317 = false;
                }
            }
            if (var3 == 5) {
                this.field530 = var4;
            }
            if (var3 == 6) {
                this.field351 = var4;
            }
            if (var3 == 8) {
                this.field497 = var4;
                this.field636 = true;
            }
            if (var3 == 9) {
                this.field488 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (arg0 == 6) {
            if (this.field538 == 0) {
                int var2 = super.field94;
                if (this.field457 == 1 && super.field95 >= 516 && super.field96 >= 160 && super.field95 <= 765 && super.field96 <= 205) {
                    var2 = 0;
                }
                if (this.field389) {
                    if (var2 != 1) {
                        int var3 = super.field88;
                        int var4 = super.field89;
                        if (this.field450 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field450 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field450 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field451 - 10 || var3 > this.field453 + this.field451 + 10 || var4 < this.field452 - 10 || var4 > this.field454 + this.field452 + 10) {
                            this.field389 = false;
                            if (this.field450 == 1) {
                                this.field350 = true;
                            }
                            if (this.field450 == 2) {
                                this.field636 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field451;
                        int var6 = this.field452;
                        int var7 = this.field453;
                        int var8 = super.field95;
                        int var9 = super.field96;
                        if (this.field450 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field450 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field450 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field694; ++var11) {
                            int var12 = (this.field694 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method177(true, var10);
                        }
                        this.field389 = false;
                        if (this.field450 == 1) {
                            this.field350 = true;
                        }
                        if (this.field450 == 2) {
                            this.field636 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field694 > 0) {
                        int var13 = this.field290[this.field694 - 1];
                        if (var13 == 219 || var13 == 915 || var13 == 486 || var13 == 463 || var13 == 343 || var13 == 620 || var13 == 5 || var13 == 121 || var13 == 501 || var13 == 837 || var13 == 888 || var13 == 1940) {
                            int var14 = this.field288[this.field694 - 1];
                            int var15 = this.field289[this.field694 - 1];
                            class34 var16 = class34.method324(var15);
                            if (var16.field1177 || var16.field1113) {
                                this.field261 = false;
                                this.field327 = 0;
                                this.field536 = var15;
                                this.field537 = var14;
                                this.field538 = 2;
                                this.field539 = super.field95;
                                this.field540 = super.field96;
                                if (class34.method324(var15).field1143 == this.field665) {
                                    this.field538 = 1;
                                }
                                if (class34.method324(var15).field1143 == this.field319) {
                                    this.field538 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field530 == 1 || this.method153(this.field694 - 1, -212)) && this.field694 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field694 > 0) {
                        this.method177(true, this.field694 - 1);
                    }
                    if (var2 != 2 || this.field694 <= 0) {
                        return;
                    }
                    this.method133(8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
    public final void method175(byte arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field533 != -1) {
            this.field697 = arg2;
            super.field94 = 0;
        }
        if (this.field319 == -1) {
            this.field636 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field707[var5] = this.field707[var5 - 1];
            this.field708[var5] = this.field708[var5 - 1];
            this.field709[var5] = this.field709[var5 - 1];
        }
        if (this.field510 == arg0) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        this.field707[0] = arg1;
        this.field708[0] = arg3;
        this.field709[0] = arg2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public final void method176(boolean arg0, byte arg1) {
        if (arg1 != 8) {
            this.field407 = null;
        }
        for (int var3 = 0; var3 < this.field405; ++var3) {
            class47 var4 = this.field404[this.field406[var3]];
            int var5 = (this.field406[var3] << 14) + 536870912;
            if (var4 != null && var4.method42(5) && var4.field1410.field1388 == arg0 && var4.field1410.method389(767)) {
                int var6 = var4.field211 >> 7;
                int var7 = var4.field212 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field173 == 1 && (var4.field211 & 127) == 64 && (var4.field212 & 127) == 64) {
                        if (this.field223[var6][var7] == this.field428) {
                            continue;
                        }
                        this.field223[var6][var7] = this.field428;
                    }
                    if (!var4.field1410.field1373) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field667.method410(this.field653, var5, (var4.field173 - 1) * 64 + 60, var4, var4.field212, var4.field211, var4.field213, this.method154(-760, this.field653, var4.field211, var4.field212), 11810, var4.field201);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
    public final void method177(boolean arg0, int arg1) {
        if (arg1 >= 0) {
            int var3 = this.field288[arg1];
            int var4 = this.field289[arg1];
            int var5 = this.field290[arg1];
            int var6 = this.field291[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field506 != 0 && var5 != 1442) {
                this.field506 = 0;
                this.field636 = true;
            }
            if (var5 == 1313) {
                this.method106(var6, var3, (byte) -40, var4);
                this.field230.method504(218, 1);
                this.field230.method539(this.field542 + var4, 6573);
                this.field230.method539(this.field541 + var3, 6573);
                this.field230.method540(this.field634, var6 >> 14 & 32767);
            }
            if (var5 == 956) {
                String var7 = this.field302[arg1];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    long var9 = class69.method578(var7.substring(var8 + 5).trim());
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field610; ++var12) {
                        if (this.field220[var12] == var9) {
                            var11 = var12;
                            break;
                        }
                    }
                    if (var11 != -1 && this.field256[var11] > 0) {
                        this.field636 = true;
                        this.field506 = 0;
                        this.field273 = true;
                        this.field565 = "";
                        this.field607 = 3;
                        this.field357 = this.field220[var11];
                        this.field555 = "Enter message to send to " + this.field388[var11];
                    }
                }
            }
            if (var5 == 1940) {
                class1 var13 = class1.method7(var6);
                class34 var14 = class34.method324(var4);
                String var15;
                if (var14 != null && var14.field1135[var3] >= 100000) {
                    var15 = var14.field1135[var3] + " x " + var13.field22;
                } else if (var13.field41 != null) {
                    var15 = new String(var13.field41);
                } else {
                    var15 = "It's a " + var13.field22 + ".";
                }
                this.method175((byte) 2, 0, var15, "");
            }
            if (var5 == 431) {
                this.method73(0, this.field533);
                this.field533 = -1;
                this.field636 = true;
            }
            if (var5 == 48) {
                boolean var16 = this.method101(0, 0, false, 0, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 0, 0);
                if (!var16) {
                    this.method101(0, 0, false, 1, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 1, 0);
                }
                this.field623 = super.field95;
                this.field624 = super.field96;
                this.field626 = 2;
                this.field625 = 0;
                if ((var3 & 3) == 0) {
                    ++field297;
                }
                if (field297 >= 107) {
                    this.field230.method504(166, 1);
                    field297 = 0;
                }
                this.field230.method504(0, 1);
                this.field230.method539(this.field541 + var3, 6573);
                this.field230.method538(var6, (byte) 0);
                this.field230.method506(this.field542 + var4);
            }
            if (var5 == 343) {
                field448 += var3;
                if (field448 >= 73) {
                    this.field230.method504(32, 1);
                    this.field230.method509(0);
                    field448 = 0;
                }
                this.field230.method504(174, 1);
                this.field230.method540(this.field634, var3);
                this.field230.method540(this.field634, var6);
                this.field230.method540(this.field634, var4);
                this.field467 = 0;
                this.field468 = var4;
                this.field469 = var3;
                this.field470 = 2;
                if (class34.method324(var4).field1143 == this.field665) {
                    this.field470 = 1;
                }
                if (class34.method324(var4).field1143 == this.field319) {
                    this.field470 = 3;
                }
            }
            if (var5 == 837) {
                this.field230.method504(202, 1);
                this.field230.method540(this.field634, var4);
                this.field230.method540(this.field634, var3);
                this.field230.method539(var6, 6573);
                this.field467 = 0;
                this.field468 = var4;
                this.field469 = var3;
                this.field470 = 2;
                if (class34.method324(var4).field1143 == this.field665) {
                    this.field470 = 1;
                }
                if (class34.method324(var4).field1143 == this.field319) {
                    this.field470 = 3;
                }
            }
            if (var5 == 486) {
                this.field230.method504(135, 1);
                this.field230.method538(var6, (byte) 0);
                this.field230.method539(var4, 6573);
                this.field230.method506(var3);
                this.field467 = 0;
                this.field468 = var4;
                this.field469 = var3;
                this.field470 = 2;
                if (class34.method324(var4).field1143 == this.field665) {
                    this.field470 = 1;
                }
                if (class34.method324(var4).field1143 == this.field319) {
                    this.field470 = 3;
                }
            }
            if (var5 == 120) {
                class34 var18 = class34.method324(var4);
                boolean var19 = true;
                if (var18.field1115 > 0) {
                    var19 = this.method115((byte) 9, var18);
                }
                if (var19) {
                    this.field230.method504(124, 1);
                    this.field230.method506(var4);
                }
            }
            if (var5 == 209) {
                boolean var20 = this.method101(0, 0, false, 0, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 0, 0);
                if (!var20) {
                    this.method101(0, 0, false, 1, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 1, 0);
                }
                this.field623 = super.field95;
                this.field624 = super.field96;
                this.field626 = 2;
                this.field625 = 0;
                this.field230.method504(172, 1);
                this.field230.method539(this.field541 + var3, 6573);
                this.field230.method539(var6, 6573);
                this.field230.method506(this.field542 + var4);
            }
            if (var5 == 457) {
                class34 var22 = class34.method324(var4);
                this.field457 = 1;
                this.field458 = var4;
                this.field459 = var22.field1174;
                this.field352 = 0;
                this.field350 = true;
                String var23 = var22.field1149;
                if (var23.indexOf(" ") != -1) {
                    var23 = var23.substring(0, var23.indexOf(" "));
                }
                String var24 = var22.field1149;
                if (var24.indexOf(" ") != -1) {
                    var24 = var24.substring(var24.indexOf(" ") + 1);
                }
                this.field460 = var23 + " " + var22.field1185 + " " + var24;
                if (this.field459 == 16) {
                    this.field350 = true;
                    this.field284 = 3;
                    this.field338 = true;
                }
            } else {
                if (var5 == 542) {
                    this.method68(0);
                }
                if (var5 == 50 || var5 == 478 || var5 == 169 || var5 == 34) {
                    String var25 = this.field302[arg1];
                    int var26 = var25.indexOf("@whi@");
                    if (var26 != -1) {
                        long var27 = class69.method578(var25.substring(var26 + 5).trim());
                        if (var5 == 50) {
                            this.method92(true, var27);
                        }
                        if (var5 == 478) {
                            this.method141(true, var27);
                        }
                        if (var5 == 169) {
                            this.method50(438, var27);
                        }
                        if (var5 == 34) {
                            this.method93((byte) 6, var27);
                        }
                    }
                }
                if (var5 == 66) {
                    class53 var29 = this.field478[var6];
                    if (var29 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var29.field160[0], 2, field378.field160[0], var29.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(224, 1);
                        this.field230.method506(var6);
                    }
                }
                if (var5 == 531) {
                    class47 var30 = this.field404[var6];
                    if (var30 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var30.field160[0], 2, field378.field160[0], var30.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(242, 1);
                        this.field230.method540(this.field634, var6);
                    }
                }
                if (var5 == 501) {
                    field247 += var6;
                    if (field247 >= 70) {
                        this.field230.method504(177, 1);
                        this.field230.method509(0);
                        field247 = 0;
                    }
                    this.field230.method504(107, 1);
                    this.field230.method539(var4, 6573);
                    this.field230.method538(var3, (byte) 0);
                    this.field230.method538(var6, (byte) 0);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 576) {
                    this.field230.method504(168, 1);
                    this.field230.method540(this.field634, this.field353);
                    this.field230.method506(var4);
                    this.field230.method506(var6);
                    this.field230.method539(this.field355, 6573);
                    this.field230.method540(this.field634, this.field354);
                    this.field230.method540(this.field634, var3);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 974) {
                    this.field230.method504(98, 1);
                    this.field230.method539(var3, 6573);
                    this.field230.method506(var4);
                    this.field230.method506(var6);
                    this.field230.method506(this.field458);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 219) {
                    this.field230.method504(220, 1);
                    this.field230.method538(var6, (byte) 0);
                    this.field230.method538(var4, (byte) 0);
                    this.field230.method539(var3, 6573);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 915) {
                    this.field230.method504(151, 1);
                    this.field230.method538(var6, (byte) 0);
                    this.field230.method540(this.field634, var3);
                    this.field230.method506(var4);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 624) {
                    boolean var31 = this.method101(0, 0, false, 0, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 0, 0);
                    if (!var31) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 1, 0);
                    }
                    this.field623 = super.field95;
                    this.field624 = super.field96;
                    this.field626 = 2;
                    this.field625 = 0;
                    this.field230.method504(209, 1);
                    this.field230.method506(this.field542 + var4);
                    this.field230.method506(this.field541 + var3);
                    this.field230.method506(var6);
                }
                if (var5 == 878) {
                    this.field230.method504(124, 1);
                    this.field230.method506(var4);
                    class34 var33 = class34.method324(var4);
                    if (var33.field1165 != null && var33.field1165[0][0] == 5) {
                        int var34 = var33.field1165[0][1];
                        this.field693[var34] = 1 - this.field693[var34];
                        this.method173(var34, (byte) -120);
                        this.field350 = true;
                    }
                }
                if (var5 == 746) {
                    boolean var35 = this.method101(0, 0, false, 0, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 0, 0);
                    if (!var35) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 1, 0);
                    }
                    this.field623 = super.field95;
                    this.field624 = super.field96;
                    this.field626 = 2;
                    this.field625 = 0;
                    this.field230.method504(150, 1);
                    this.field230.method539(var6, 6573);
                    this.field230.method538(this.field542 + var4, (byte) 0);
                    this.field230.method506(this.field541 + var3);
                }
                if (var5 == 771) {
                    class53 var37 = this.field478[var6];
                    if (var37 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var37.field160[0], 2, field378.field160[0], var37.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(8, 1);
                        this.field230.method540(this.field634, var6);
                        this.field230.method539(this.field458, 6573);
                    }
                }
                if (var5 == 60) {
                    class47 var38 = this.field404[var6];
                    if (var38 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var38.field160[0], 2, field378.field160[0], var38.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(3, 1);
                        this.field230.method506(this.field354);
                        this.field230.method540(this.field634, var6);
                        this.field230.method538(this.field355, (byte) 0);
                        this.field230.method539(this.field353, 6573);
                    }
                }
                if (var5 == 917) {
                    this.field230.method504(124, 1);
                    this.field230.method506(var4);
                    class34 var39 = class34.method324(var4);
                    if (var39.field1165 != null && var39.field1165[0][0] == 5) {
                        int var40 = var39.field1165[0][1];
                        if (this.field693[var40] != var39.field1139[0]) {
                            this.field693[var40] = var39.field1139[0];
                            this.method173(var40, (byte) -120);
                            this.field350 = true;
                        }
                    }
                }
                if (var5 == 504 || var5 == 56) {
                    String var41 = this.field302[arg1];
                    int var42 = var41.indexOf("@whi@");
                    if (var42 != -1) {
                        String var43 = var41.substring(var42 + 5).trim();
                        String var44 = class69.method582(class69.method579(this.field393, class69.method578(var43)), true);
                        boolean var45 = false;
                        for (int var46 = 0; var46 < this.field479; ++var46) {
                            class53 var47 = this.field478[this.field480[var46]];
                            if (var47 != null && var47.field1554 != null && var47.field1554.equalsIgnoreCase(var44)) {
                                this.method101(0, 0, false, 1, 0, field378.field161[0], var47.field160[0], 2, field378.field160[0], var47.field161[0], 1, 0);
                                if (var5 == 504) {
                                    this.field230.method504(224, 1);
                                    this.field230.method506(this.field480[var46]);
                                }
                                if (var5 == 56) {
                                    this.field230.method504(21, 1);
                                    this.field230.method506(this.field480[var46]);
                                }
                                var45 = true;
                                break;
                            }
                        }
                        if (!var45) {
                            this.method175((byte) 2, 0, "Unable to find " + var44, "");
                        }
                    }
                }
                if (var5 == 87) {
                    if ((this.field542 & 3) == 0) {
                        ++field305;
                    }
                    if (field305 >= 112) {
                        this.field230.method504(90, 1);
                        field305 = 0;
                    }
                    this.method106(var6, var3, (byte) -40, var4);
                    this.field230.method504(43, 1);
                    this.field230.method540(this.field634, var6 >> 14 & 32767);
                    this.field230.method538(this.field541 + var3, (byte) 0);
                    this.field230.method538(this.field542 + var4, (byte) 0);
                }
                if (var5 == 5) {
                    this.field230.method504(33, 1);
                    this.field230.method506(var4);
                    this.field230.method540(this.field634, var3);
                    this.field230.method506(var6);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 674) {
                    String var48 = this.field302[arg1];
                    int var49 = var48.indexOf("@whi@");
                    if (var49 != -1) {
                        if (this.field665 == -1) {
                            this.method68(0);
                            this.field644 = var48.substring(var49 + 5).trim();
                            this.field572 = false;
                            this.field430 = this.field665 = class34.field1131;
                        } else {
                            this.method175((byte) 2, 0, "Please close the interface you have open before using 'report abuse'", "");
                        }
                    }
                }
                if (var5 == 198) {
                    this.method106(var6, var3, (byte) -40, var4);
                    this.field230.method504(131, 1);
                    this.field230.method538(var6 >> 14 & 32767, (byte) 0);
                    this.field230.method538(this.field542 + var4, (byte) 0);
                    this.field230.method538(this.field541 + var3, (byte) 0);
                }
                if (var5 == 639) {
                    boolean var50 = this.method101(0, 0, false, 0, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 0, 0);
                    if (!var50) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 1, 0);
                    }
                    this.field623 = super.field95;
                    this.field624 = super.field96;
                    this.field626 = 2;
                    this.field625 = 0;
                    this.field230.method504(45, 1);
                    this.field230.method506(this.field541 + var3);
                    this.field230.method540(this.field634, this.field542 + var4);
                    this.field230.method538(var6, (byte) 0);
                }
                if (var5 == 650) {
                    class53 var52 = this.field478[var6];
                    if (var52 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var52.field160[0], 2, field378.field160[0], var52.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(148, 1);
                        this.field230.method539(var6, 6573);
                    }
                }
                if (var5 == 1764) {
                    int var53 = var6 >> 14 & 32767;
                    class22 var54 = class22.method246(var53);
                    String var55;
                    if (var54.field894 != null) {
                        var55 = new String(var54.field894);
                    } else {
                        var55 = "It's a " + var54.field886 + ".";
                    }
                    this.method175((byte) 2, 0, var55, "");
                }
                if (var5 == 69) {
                    class47 var56 = this.field404[var6];
                    if (var56 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var56.field160[0], 2, field378.field160[0], var56.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        ++field534;
                        if (field534 >= 51) {
                            this.field230.method504(229, 1);
                            this.field230.method509(0);
                            field534 = 0;
                        }
                        this.field230.method504(147, 1);
                        this.field230.method538(var6, (byte) 0);
                    }
                }
                if (var5 == 33) {
                    class53 var57 = this.field478[var6];
                    if (var57 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var57.field160[0], 2, field378.field160[0], var57.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(21, 1);
                        this.field230.method506(var6);
                    }
                }
                if (var5 == 544 && this.method106(var6, var3, (byte) -40, var4)) {
                    this.field230.method504(74, 1);
                    this.field230.method538(this.field542 + var4, (byte) 0);
                    this.field230.method540(this.field634, this.field355);
                    this.field230.method538(this.field354, (byte) 0);
                    this.field230.method538(this.field353, (byte) 0);
                    this.field230.method506(this.field541 + var3);
                    this.field230.method540(this.field634, var6 >> 14 & 32767);
                }
                if (var5 == 293 && !this.field531) {
                    this.field230.method504(241, 1);
                    this.field230.method506(var4);
                    this.field531 = true;
                }
                if (var5 == 555) {
                    boolean var58 = this.method101(0, 0, false, 0, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 0, 0);
                    if (!var58) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 1, 0);
                    }
                    this.field623 = super.field95;
                    this.field624 = super.field96;
                    this.field626 = 2;
                    this.field625 = 0;
                    this.field230.method504(69, 1);
                    this.field230.method540(this.field634, var6);
                    this.field230.method506(this.field541 + var3);
                    this.field230.method506(this.field354);
                    this.field230.method540(this.field634, this.field353);
                    this.field230.method539(this.field355, 6573);
                    this.field230.method539(this.field542 + var4, 6573);
                }
                if (var5 == 689 && this.method106(var6, var3, (byte) -40, var4)) {
                    this.field230.method504(193, 1);
                    this.field230.method538(var6 >> 14 & 32767, (byte) 0);
                    this.field230.method540(this.field634, this.field542 + var4);
                    this.field230.method539(this.field458, 6573);
                    this.field230.method540(this.field634, this.field541 + var3);
                }
                if (var5 == 57) {
                    boolean var60 = this.method101(0, 0, false, 0, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 0, 0);
                    if (!var60) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var3, 2, field378.field160[0], var4, 1, 0);
                    }
                    this.field623 = super.field95;
                    this.field624 = super.field96;
                    this.field626 = 2;
                    this.field625 = 0;
                    this.field230.method504(109, 1);
                    this.field230.method538(var6, (byte) 0);
                    this.field230.method506(this.field542 + var4);
                    this.field230.method506(this.field541 + var3);
                    this.field230.method540(this.field634, this.field458);
                }
                if (var5 == 805) {
                    class53 var62 = this.field478[var6];
                    if (var62 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var62.field160[0], 2, field378.field160[0], var62.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(75, 1);
                        this.field230.method540(this.field634, var6);
                    }
                }
                if (var5 == 121) {
                    if ((var6 & 3) == 0) {
                        ++field340;
                    }
                    if (field340 >= 98) {
                        this.field230.method504(127, 1);
                        this.field230.method509(0);
                        field340 = 0;
                    }
                    this.field230.method504(144, 1);
                    this.field230.method538(var4, (byte) 0);
                    this.field230.method506(var6);
                    this.field230.method506(var3);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 154) {
                    class47 var63 = this.field404[var6];
                    if (var63 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var63.field160[0], 2, field378.field160[0], var63.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(52, 1);
                        this.field230.method539(this.field458, 6573);
                        this.field230.method538(var6, (byte) 0);
                    }
                }
                if (var5 == 641) {
                    class47 var64 = this.field404[var6];
                    if (var64 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var64.field160[0], 2, field378.field160[0], var64.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(158, 1);
                        this.field230.method538(var6, (byte) 0);
                    }
                }
                if (var5 == 225) {
                    class53 var65 = this.field478[var6];
                    if (var65 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var65.field160[0], 2, field378.field160[0], var65.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(30, 1);
                        this.field230.method539(this.field355, 6573);
                        this.field230.method540(this.field634, this.field353);
                        this.field230.method538(var6, (byte) 0);
                        this.field230.method538(this.field354, (byte) 0);
                    }
                }
                if (var5 == 1261) {
                    class47 var66 = this.field404[var6];
                    if (var66 != null) {
                        class46 var67 = var66.field1410;
                        if (var67.field1389 != null) {
                            var67 = var67.method392(true);
                        }
                        if (var67 != null) {
                            String var68;
                            if (var67.field1402 != null) {
                                var68 = new String(var67.field1402);
                            } else {
                                var68 = "It's a " + var67.field1400 + ".";
                            }
                            this.method175((byte) 2, 0, var68, "");
                        }
                    }
                }
                if (var5 == 570) {
                    this.method106(var6, var3, (byte) -40, var4);
                    this.field230.method504(36, 1);
                    this.field230.method506(this.field541 + var3);
                    this.field230.method540(this.field634, this.field542 + var4);
                    this.field230.method539(var6 >> 14 & 32767, 6573);
                }
                if (var5 == 463) {
                    this.field230.method504(46, 1);
                    this.field230.method540(this.field634, var3);
                    this.field230.method538(var6, (byte) 0);
                    this.field230.method538(var4, (byte) 0);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 157) {
                    class47 var69 = this.field404[var6];
                    if (var69 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var69.field160[0], 2, field378.field160[0], var69.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        this.field230.method504(103, 1);
                        this.field230.method506(var6);
                    }
                }
                if (var5 == 334) {
                    if ((var6 & 3) == 0) {
                        ++field637;
                    }
                    if (field637 >= 61) {
                        this.field230.method504(145, 1);
                        this.field230.method506(581);
                        field637 = 0;
                    }
                    this.method106(var6, var3, (byte) -40, var4);
                    this.field230.method504(139, 1);
                    this.field230.method540(this.field634, this.field542 + var4);
                    this.field230.method540(this.field634, var6 >> 14 & 32767);
                    this.field230.method539(this.field541 + var3, 6573);
                }
                if (var5 == 328) {
                    class53 var70 = this.field478[var6];
                    if (var70 != null) {
                        this.method101(0, 0, false, 1, 0, field378.field161[0], var70.field160[0], 2, field378.field160[0], var70.field161[0], 1, 0);
                        this.field623 = super.field95;
                        this.field624 = super.field96;
                        this.field626 = 2;
                        this.field625 = 0;
                        if ((var6 & 3) == 0) {
                            ++field604;
                        }
                        if (field604 >= 123) {
                            this.field230.method504(206, 1);
                            field604 = 0;
                        }
                        this.field230.method504(87, 1);
                        this.field230.method506(var6);
                    }
                }
                if (var5 == 1805) {
                    class1 var71 = class1.method7(var6);
                    String var72;
                    if (var71.field41 != null) {
                        var72 = new String(var71.field41);
                    } else {
                        var72 = "It's a " + var71.field22 + ".";
                    }
                    this.method175((byte) 2, 0, var72, "");
                }
                if (var5 == 620) {
                    this.field230.method504(40, 1);
                    this.field230.method540(this.field634, var6);
                    this.field230.method506(var3);
                    this.field230.method538(var4, (byte) 0);
                    this.field467 = 0;
                    this.field468 = var4;
                    this.field469 = var3;
                    this.field470 = 2;
                    if (class34.method324(var4).field1143 == this.field665) {
                        this.field470 = 1;
                    }
                    if (class34.method324(var4).field1143 == this.field319) {
                        this.field470 = 3;
                    }
                }
                if (var5 == 888) {
                    this.field352 = 1;
                    this.field353 = var3;
                    this.field354 = var4;
                    this.field355 = var6;
                    this.field356 = String.valueOf(class1.method7(var6).field22);
                    this.field457 = 0;
                    this.field350 = true;
                } else {
                    if (var5 == 238) {
                        if (!this.field389) {
                            this.field667.method437(super.field96 - 4, 0, super.field95 - 4);
                        } else {
                            this.field667.method437(var4 - 4, 0, var3 - 4);
                        }
                    }
                    if (var5 == 810) {
                        class47 var73 = this.field404[var6];
                        if (var73 != null) {
                            this.method101(0, 0, false, 1, 0, field378.field161[0], var73.field160[0], 2, field378.field160[0], var73.field161[0], 1, 0);
                            this.field623 = super.field95;
                            this.field624 = super.field96;
                            this.field626 = 2;
                            this.field625 = 0;
                            this.field230.method504(157, 1);
                            this.field230.method506(var6);
                        }
                    }
                    this.field352 = 0;
                    this.field457 = 0;
                    this.field680 &= arg0;
                    this.field350 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
    public final void method178(int arg0) {
        if (super.field81 == null) {
            this.method162(-789);
            this.field584 = null;
            this.field585 = null;
            this.field586 = null;
            this.field587 = null;
            this.field588 = null;
            this.field589 = null;
            this.field590 = null;
            this.field591 = null;
            this.field592 = null;
            this.field559 = null;
            this.field557 = null;
            this.field556 = null;
            this.field558 = null;
            while (arg0 >= 0) {
                this.field230.method505(241);
            }
            this.field439 = null;
            this.field440 = null;
            this.field441 = null;
            super.field81 = new class26((byte) 9, this.method24(731), 765, 503);
            this.field691 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method179(byte arg0) {
        this.field368 = true;
        if (this.field255 != arg0) {
            this.method19();
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field328[var2] = -1;
            for (int var3 = 0; var3 < class20.field838; ++var3) {
                if (!class20.field839[var3].field845 && class20.field839[var3].field840 == var2 + (this.field673 ? 0 : 7)) {
                    this.field328[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method180(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public final void method181(boolean arg0) {
        this.field612 = 0;
        if (arg0) {
            this.field662 = 342;
        }
        for (int var2 = -1; var2 < this.field479 + this.field405; ++var2) {
            class10 var19;
            if (var2 == -1) {
                var19 = field378;
            } else if (var2 < this.field479) {
                var19 = this.field478[this.field480[var2]];
            } else {
                var19 = this.field404[this.field406[var2 - this.field479]];
            }
            if (var19 != null && var19.method42(5)) {
                if (var19 instanceof class47) {
                    class46 var20 = ((class47) var19).field1410;
                    if (var20.field1389 != null) {
                        var20 = var20.method392(true);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field479) {
                    class46 var23 = ((class47) var19).field1410;
                    if (var23.field1396 >= 0 && var23.field1396 < this.field431.length) {
                        this.method149(var19, this.field330, var19.field209 + 15);
                        if (this.field648 > -1) {
                            this.field431[var23.field1396].method356(this.field648 - 12, this.field649 - 30, -973);
                        }
                    }
                    if (this.field461 == 1 && this.field406[var2 - this.field479] == this.field466 && field608 % 20 < 10) {
                        this.method149(var19, this.field330, var19.field209 + 15);
                        if (this.field648 > -1) {
                            this.field422[0].method356(this.field648 - 12, this.field649 - 28, -973);
                        }
                    }
                } else {
                    int var21 = 30;
                    class53 var22 = (class53) var19;
                    if (var22.field1545 != -1 || var22.field1553 != -1) {
                        this.method149(var19, this.field330, var19.field209 + 15);
                        if (this.field648 > -1) {
                            if (var22.field1545 != -1) {
                                this.field560[var22.field1545].method356(this.field648 - 12, this.field649 - var21, -973);
                                var21 += 25;
                            }
                            if (var22.field1553 != -1) {
                                this.field431[var22.field1553].method356(this.field648 - 12, this.field649 - var21, -973);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field461 == 10 && this.field480[var2] == this.field384) {
                        this.method149(var19, this.field330, var19.field209 + 15);
                        if (this.field648 > -1) {
                            this.field422[1].method356(this.field648 - 12, this.field649 - var21, -973);
                        }
                    }
                }
                if (var19.field207 != null && (var2 >= this.field479 || this.field429 == 0 || this.field429 == 3 || this.field429 == 1 && this.method63(((class53) var19).field1554, -222))) {
                    this.method149(var19, this.field330, var19.field209);
                    if (this.field648 > -1 && this.field612 < this.field613) {
                        this.field617[this.field612] = this.field464.method592(0, var19.field207) / 2;
                        this.field616[this.field612] = this.field464.field1751;
                        this.field614[this.field612] = this.field648;
                        this.field615[this.field612] = this.field649;
                        this.field618[this.field612] = var19.field196;
                        this.field619[this.field612] = var19.field194;
                        this.field620[this.field612] = var19.field192;
                        this.field621[this.field612++] = var19.field207;
                        if (this.field351 == 0 && var19.field194 >= 1 && var19.field194 <= 3) {
                            this.field616[this.field612] += 10;
                            this.field615[this.field612] += 5;
                        }
                        if (this.field351 == 0 && var19.field194 == 4) {
                            this.field617[this.field612] = 60;
                        }
                        if (this.field351 == 0 && var19.field194 == 5) {
                            this.field616[this.field612] += 5;
                        }
                    }
                }
                if (var19.field197 > field608) {
                    this.method149(var19, this.field330, var19.field209 + 15);
                    if (this.field648 > -1) {
                        int var24 = var19.field198 * 30 / var19.field199;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class32.method315(65280, this.field523, this.field648 - 15, this.field649 - 3, 5, var24);
                        class32.method315(16711680, this.field523, this.field648 - 15 + var24, this.field649 - 3, 5, 30 - var24);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field189[var25] > field608) {
                        this.method149(var19, this.field330, var19.field209 / 2);
                        if (this.field648 > -1) {
                            if (var25 == 1) {
                                this.field649 -= 20;
                            }
                            if (var25 == 2) {
                                this.field648 -= 15;
                                this.field649 -= 10;
                            }
                            if (var25 == 3) {
                                this.field648 += 15;
                                this.field649 -= 10;
                            }
                            this.field661[var19.field188[var25]].method356(this.field648 - 12, this.field649 - 12, -973);
                            this.field462.method589(this.field649 + 4, 0, this.field648, String.valueOf(var19.field187[var25]), -27242);
                            this.field462.method589(this.field649 + 3, 16777215, this.field648 - 1, String.valueOf(var19.field187[var25]), -27242);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field612; ++var3) {
            int var4 = this.field614[var3];
            int var5 = this.field615[var3];
            int var6 = this.field617[var3];
            int var7 = this.field616[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field615[var18] - this.field616[var18] && var5 - var7 < this.field615[var18] + 2 && var4 - var6 < this.field617[var18] + this.field614[var18] && var4 + var6 > this.field614[var18] - this.field617[var18] && this.field615[var18] - this.field616[var18] < var5) {
                        var5 = this.field615[var18] - this.field616[var18];
                        var8 = true;
                    }
                }
            }
            this.field648 = this.field614[var3];
            this.field649 = this.field615[var3] = var5;
            String var9 = this.field621[var3];
            if (this.field351 == 0) {
                int var10 = 16776960;
                if (this.field618[var3] < 6) {
                    var10 = this.field564[this.field618[var3]];
                }
                if (this.field618[var3] == 6) {
                    var10 = this.field428 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field618[var3] == 7) {
                    var10 = this.field428 % 20 < 10 ? 255 : 65535;
                }
                if (this.field618[var3] == 8) {
                    var10 = this.field428 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field618[var3] == 9) {
                    int var11 = 150 - this.field620[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field618[var3] == 10) {
                    int var12 = 150 - this.field620[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field618[var3] == 11) {
                    int var13 = 150 - this.field620[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field619[var3] == 0) {
                    this.field464.method589(this.field649 + 1, 0, this.field648, var9, -27242);
                    this.field464.method589(this.field649, var10, this.field648, var9, -27242);
                }
                if (this.field619[var3] == 1) {
                    this.field464.method594(var9, this.field649 + 1, this.field428, this.field648, 0, 0);
                    this.field464.method594(var9, this.field649, this.field428, this.field648, var10, 0);
                }
                if (this.field619[var3] == 2) {
                    this.field464.method595(0, this.field648, this.field649 + 1, 0, this.field428, var9);
                    this.field464.method595(var10, this.field648, this.field649, 0, this.field428, var9);
                }
                if (this.field619[var3] == 3) {
                    this.field464.method596(0, this.field649 + 1, this.field428, false, this.field648, 150 - this.field620[var3], var9);
                    this.field464.method596(var10, this.field649, this.field428, false, this.field648, 150 - this.field620[var3], var9);
                }
                if (this.field619[var3] == 4) {
                    int var14 = this.field464.method592(0, var9);
                    int var15 = (150 - this.field620[var3]) * (var14 + 100) / 150;
                    class32.method312(0, 0, 334, this.field648 + 50, this.field648 - 50);
                    this.field464.method593(false, 0, this.field649 + 1, var9, this.field648 + 50 - var15);
                    this.field464.method593(false, var10, this.field649, var9, this.field648 + 50 - var15);
                    class32.method311(0);
                }
                if (this.field619[var3] == 5) {
                    int var16 = 150 - this.field620[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class32.method312(this.field649 - this.field464.field1751 - 1, 0, this.field649 + 5, 512, 0);
                    this.field464.method589(this.field649 + 1 + var17, 0, this.field648, var9, -27242);
                    this.field464.method589(this.field649 + var17, var10, this.field648, var9, -27242);
                    class32.method311(0);
                }
            } else {
                this.field464.method589(this.field649 + 1, 0, this.field648, var9, -27242);
                this.field464.method589(this.field649, 16776960, this.field648, var9, -27242);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILWBEWPIXO;)V")
    private final void method182(int arg0, int arg1, class58 arg2) {
        arg2.method525(616);
        int var4 = arg2.method526(true, 8);
        if (this.field498 != arg1) {
            this.field628 = this.field688.method558();
        }
        if (var4 < this.field405) {
            for (int var5 = var4; var5 < this.field405; ++var5) {
                this.field509[this.field508++] = this.field406[var5];
            }
        }
        if (var4 > this.field405) {
            signlink.reporterror(this.field573 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field405 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field406[var6];
                class47 var8 = this.field404[var7];
                int var9 = arg2.method526(true, 1);
                if (var9 == 0) {
                    this.field406[this.field405++] = var7;
                    var8.field181 = field608;
                } else {
                    int var10 = arg2.method526(true, 2);
                    if (var10 == 0) {
                        this.field406[this.field405++] = var7;
                        var8.field181 = field608;
                        this.field482[this.field481++] = var7;
                    } else if (var10 == 1) {
                        this.field406[this.field405++] = var7;
                        var8.field181 = field608;
                        int var11 = arg2.method526(true, 3);
                        var8.method45(false, false, var11);
                        int var12 = arg2.method526(true, 1);
                        if (var12 == 1) {
                            this.field482[this.field481++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field406[this.field405++] = var7;
                        var8.field181 = field608;
                        int var13 = arg2.method526(true, 3);
                        var8.method45(true, false, var13);
                        int var14 = arg2.method526(true, 3);
                        var8.method45(true, false, var14);
                        int var15 = arg2.method526(true, 1);
                        if (var15 == 1) {
                            this.field482[this.field481++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field509[this.field508++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BILWBEWPIXO;)V")
    private final void method183(byte arg0, int arg1, class58 arg2) {
        for (int var4 = 0; var4 < this.field481; ++var4) {
            int var5 = this.field482[var4];
            class47 var6 = this.field404[var5];
            int var7 = arg2.method515();
            if ((var7 & 1) != 0) {
                var6.field170 = arg2.method541(35378);
                var6.field171 = arg2.method543(false);
            }
            if ((var7 & 16) != 0) {
                int var8 = arg2.method543(false);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = arg2.method533(18094);
                if (var6.field202 == var8 && var8 != -1) {
                    int var10 = class66.field1693[var8].field1707;
                    if (var10 == 1) {
                        var6.field203 = 0;
                        var6.field204 = 0;
                        var6.field205 = var9;
                        var6.field206 = 0;
                    }
                    if (var10 == 2) {
                        var6.field206 = 0;
                    }
                } else if (var8 == -1 || var6.field202 == -1 || class66.field1693[var8].field1701 >= class66.field1693[var6.field202].field1701) {
                    var6.field202 = var8;
                    var6.field203 = 0;
                    var6.field204 = 0;
                    var6.field205 = var9;
                    var6.field206 = 0;
                    var6.field195 = var6.field190;
                }
            }
            if ((var7 & 2) != 0) {
                int var11 = arg2.method533(18094);
                int var12 = arg2.method533(18094);
                var6.method46((byte) 5, var11, var12, field608);
                var6.field197 = field608 + 300;
                var6.field198 = arg2.method533(18094);
                var6.field199 = arg2.method534(true);
            }
            if ((var7 & 32) != 0) {
                int var13 = arg2.method533(18094);
                int var14 = arg2.method515();
                var6.method46((byte) 5, var13, var14, field608);
                var6.field197 = field608 + 300;
                var6.field198 = arg2.method534(true);
                var6.field199 = arg2.method532(true);
            }
            if ((var7 & 128) != 0) {
                var6.field1410 = class46.method393(arg2.method541(35378));
                var6.field173 = var6.field1410.field1390;
                var6.field200 = var6.field1410.field1393;
                var6.field165 = var6.field1410.field1404;
                var6.field166 = var6.field1410.field1371;
                var6.field167 = var6.field1410.field1380;
                var6.field168 = var6.field1410.field1382;
                var6.field215 = var6.field1410.field1398;
            }
            if ((var7 & 64) != 0) {
                var6.field182 = arg2.method517();
                int var15 = arg2.method549(0);
                var6.field186 = var15 >> 16;
                var6.field185 = (var15 & 65535) + field608;
                var6.field183 = 0;
                var6.field184 = 0;
                if (var6.field185 > field608) {
                    var6.field183 = -1;
                }
                if (var6.field182 == 65535) {
                    var6.field182 = -1;
                }
            }
            if ((var7 & 4) != 0) {
                var6.field207 = arg2.method522();
                var6.field192 = 100;
            }
            if ((var7 & 8) != 0) {
                var6.field217 = arg2.method517();
                if (var6.field217 == 65535) {
                    var6.field217 = -1;
                }
            }
        }
        if (arg0 != -25) {
            this.field393 = !this.field393;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILWBEWPIXO;)V")
    private final void method184(int arg0, int arg1, class58 arg2) {
        this.field508 = 0;
        this.field481 = 0;
        this.method60(this.field664, arg2, arg0);
        this.method155(9, arg2, arg0);
        this.method51(arg2, 329, arg0);
        this.method185(arg0, (byte) -16, arg2);
        if (arg1 >= 0) {
            this.field676 = this.field688.method558();
        }
        for (int var4 = 0; var4 < this.field508; ++var4) {
            int var6 = this.field509[var4];
            if (field608 != this.field478[var6].field181) {
                this.field478[var6] = null;
            }
        }
        if (arg2.field1615 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field1615 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field479; ++var5) {
                if (this.field478[this.field480[var5]] == null) {
                    signlink.reporterror(this.field573 + " null entry in pl list - pos:" + var5 + " size:" + this.field479);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IBLWBEWPIXO;)V")
    private final void method185(int arg0, byte arg1, class58 arg2) {
        for (int var4 = 0; var4 < this.field481; ++var4) {
            int var5 = this.field482[var4];
            class53 var6 = this.field478[var5];
            int var7 = arg2.method515();
            if ((var7 & 32) != 0) {
                var7 += arg2.method515() << 8;
            }
            this.method61(-10985, var6, var7, var5, arg2);
        }
        if (arg1 != -16) {
            this.field230.method505(179);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method21(int arg0) {
        this.field554 = null;
        this.field661 = null;
        this.field560 = null;
        this.field431 = null;
        this.field422 = null;
        this.field323 = null;
        if (this.field702 != null) {
            this.field702.method286();
        }
        this.field702 = null;
        this.field603 = null;
        this.field489 = null;
        this.field655 = null;
        this.field656 = null;
        this.field657 = null;
        this.field658 = null;
        this.field659 = null;
        this.field342 = null;
        this.field343 = null;
        this.field344 = null;
        this.field345 = null;
        this.field346 = null;
        if (this.field379 != null) {
            this.field379.field1504 = false;
        }
        this.field379 = null;
        try {
            if (this.field281 != null) {
                this.field281.method304();
            }
        } catch (Exception var2) {
        }
        this.field281 = null;
        this.field546 = null;
        this.field547 = null;
        this.field548 = null;
        this.field549 = null;
        this.field550 = null;
        this.field223 = null;
        this.field605 = null;
        this.field392 = null;
        this.field478 = null;
        this.field480 = null;
        this.field482 = null;
        this.field483 = null;
        this.field509 = null;
        this.field282 = null;
        this.field331 = null;
        this.field667 = null;
        this.field335 = null;
        this.field407 = null;
        this.field386 = null;
        this.method113(true);
        this.field556 = null;
        this.field557 = null;
        this.field558 = null;
        this.field559 = null;
        this.field587 = null;
        this.field588 = null;
        this.field584 = null;
        this.field585 = null;
        this.field586 = null;
        this.field518 = null;
        this.field519 = null;
        this.field520 = null;
        this.field521 = null;
        this.field522 = null;
        this.field322 = null;
        this.field388 = null;
        this.field220 = null;
        this.field256 = null;
        this.field399 = null;
        this.field293 = null;
        this.field472 = null;
        this.field400 = null;
        this.field401 = null;
        if (arg0 != 0) {
            this.field230.method505(210);
        }
        this.field589 = null;
        this.field590 = null;
        this.field591 = null;
        this.field592 = null;
        this.field513 = null;
        this.field427 = null;
        this.field375 = null;
        this.field703 = null;
        this.field704 = null;
        this.field404 = null;
        this.field406 = null;
        this.field230 = null;
        this.field596 = null;
        this.field698 = null;
        this.field316 = null;
        this.field473 = null;
        this.field474 = null;
        this.field475 = null;
        this.field403 = null;
        this.field514 = null;
        this.field515 = null;
        this.field516 = null;
        this.field517 = null;
        this.field683 = null;
        this.field684 = null;
        this.field685 = null;
        this.field693 = null;
        this.field439 = null;
        this.field440 = null;
        this.field441 = null;
        this.field606 = null;
        this.field288 = null;
        this.field289 = null;
        this.field290 = null;
        this.field291 = null;
        this.field302 = null;
        this.field362 = null;
        this.field363 = null;
        this.field371 = null;
        this.method162(-789);
        class22.method237(6);
        class46.method390(6);
        class1.method5(6);
        class34.method333(6);
        class49.field1488 = null;
        class20.field839 = null;
        class43.field1305 = null;
        class66.field1693 = null;
        class63.field1652 = null;
        class63.field1664 = null;
        class64.field1667 = null;
        super.field81 = null;
        class53.field1535 = null;
        class45.method372(6);
        class48.method398(6);
        class19.method195(6);
        class21.method233(6);
        System.gc();
        if (class7.field142) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method23(int arg0) {
        if (arg0 != 7066) {
            this.field230.method505(99);
        }
        this.field691 = true;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field287[var1] = var0 - 1;
            var0 += var0;
        }
        field296 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field321 = 8;
        field332 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field376 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field376[var3] = var2 / 4;
        }
        field377 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field410 = 10;
        field412 = true;
        field528 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field532 = 615;
    }
}
