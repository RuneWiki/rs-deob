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
public class client extends class4 {

    @OriginalMember(owner = "client", name = "P", descriptor = "Ljava/lang/String;")
    private String field169 = "";

    @OriginalMember(owner = "client", name = "Q", descriptor = "Ljava/lang/String;")
    private String field170 = "";

    @OriginalMember(owner = "client", name = "S", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field172 = new CRC32();

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field175 = new int[4000];

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field176 = new int[4000];

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field183 = new int[5];

    @OriginalMember(owner = "client", name = "pb", descriptor = "Ljava/lang/String;")
    private String field195 = "";

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[I")
    private int[] field213 = new int[class53.field1350];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Z")
    private boolean field219 = false;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field220 = -905;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "LEILHLJCE;")
    private class17 field222 = class17.method212(1, (byte) 9);

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field223 = -1;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "LEILHLJCE;")
    private class17 field230 = new class17(new byte[5000], -26583);

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[LONCZAQCQ;")
    private class43[] field231 = new class43[16384];

    @OriginalMember(owner = "client", name = "bc", descriptor = "[I")
    public int[] field233 = new int[16384];

    @OriginalMember(owner = "client", name = "jc", descriptor = "B")
    private byte field241 = 1;

    @OriginalMember(owner = "client", name = "mc", descriptor = "Ljava/lang/String;")
    private String field244 = "";

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field252 = -1;

    @OriginalMember(owner = "client", name = "zc", descriptor = "Z")
    private boolean field257 = false;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[I")
    public int[] field258 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client", name = "Bc", descriptor = "B")
    private byte field259 = 4;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LFLJWGVEY;")
    private class20 field260 = new class20(807);

    @OriginalMember(owner = "client", name = "Ec", descriptor = "Z")
    private volatile boolean field262 = false;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field263 = 1;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Z")
    private boolean field264 = false;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field265 = -1;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Z")
    private boolean field266 = false;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private int[] field267 = new int[50];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Z")
    private volatile boolean field268 = false;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Z")
    private boolean field270 = true;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field272 = 1914;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "[Ljava/lang/String;")
    private String[] field273 = new String[500];

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Z")
    private boolean field274 = false;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field275 = -1;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field277 = 31;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Z")
    private boolean field282 = true;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "B")
    private byte field283 = 7;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field286 = 27473;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field288 = 2;

    @OriginalMember(owner = "client", name = "gd", descriptor = "Z")
    private boolean field290 = true;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field292 = 3353893;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field293 = -1;

    @OriginalMember(owner = "client", name = "ld", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field300 = 5063219;

    @OriginalMember(owner = "client", name = "rd", descriptor = "[LODBDSPMH;")
    private class40[] field301 = new class40[32];

    @OriginalMember(owner = "client", name = "td", descriptor = "[I")
    private int[] field303 = new int[50];

    @OriginalMember(owner = "client", name = "ud", descriptor = "[LFCRLGSQA;")
    private class19[] field304 = new class19[100];

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field306 = new int[9];

    @OriginalMember(owner = "client", name = "xd", descriptor = "[I")
    private final int[] field307 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "yd", descriptor = "LFLJWGVEY;")
    private class20 field308 = new class20(807);

    @OriginalMember(owner = "client", name = "zd", descriptor = "B")
    private byte field309 = -24;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[I")
    private int[] field312 = new int[2000];

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field324 = 2;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field326 = -118;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private final int field338 = 100;

    @OriginalMember(owner = "client", name = "de", descriptor = "[I")
    private int[] field339 = new int[100];

    @OriginalMember(owner = "client", name = "fe", descriptor = "[I")
    private int[] field341 = new int[256];

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field342 = 947;

    @OriginalMember(owner = "client", name = "he", descriptor = "[I")
    private int[] field343 = new int[33];

    @OriginalMember(owner = "client", name = "je", descriptor = "[Z")
    private boolean[] field345 = new boolean[5];

    @OriginalMember(owner = "client", name = "ke", descriptor = "[I")
    private int[] field346 = new int[500];

    @OriginalMember(owner = "client", name = "le", descriptor = "[I")
    private int[] field347 = new int[500];

    @OriginalMember(owner = "client", name = "me", descriptor = "[I")
    private int[] field348 = new int[500];

    @OriginalMember(owner = "client", name = "ne", descriptor = "[I")
    private int[] field349 = new int[500];

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field350 = 8;

    @OriginalMember(owner = "client", name = "pe", descriptor = "[LODBDSPMH;")
    private class40[] field351 = new class40[32];

    @OriginalMember(owner = "client", name = "re", descriptor = "Z")
    private volatile boolean field353 = false;

    @OriginalMember(owner = "client", name = "se", descriptor = "[I")
    private int[] field354 = new int[151];

    @OriginalMember(owner = "client", name = "we", descriptor = "[I")
    public int[] field358 = new int[1000];

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field359 = 586;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field360 = 2301979;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    private int[] field362 = new int[1000];

    @OriginalMember(owner = "client", name = "Be", descriptor = "[I")
    private int[] field363 = new int[1000];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[LODBDSPMH;")
    private class40[] field364 = new class40[8];

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field365 = 3;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[LODBDSPMH;")
    private class40[] field366 = new class40[32];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "LIRYXZZFE;")
    private class27 field372 = new class27();

    @OriginalMember(owner = "client", name = "Le", descriptor = "[LODBDSPMH;")
    private class40[] field373 = new class40[1000];

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field374 = 3;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Z")
    private boolean field375 = true;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field378 = -1;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Z")
    private boolean field379 = true;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field380 = 78;

    @OriginalMember(owner = "client", name = "We", descriptor = "[LODBDSPMH;")
    private class40[] field384 = new class40[100];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[LDYTTVJNT;")
    private class16[] field385 = new class16[4];

    @OriginalMember(owner = "client", name = "bf", descriptor = "[I")
    private int[] field389 = new int[7];

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field390 = -1;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field391 = -1;

    @OriginalMember(owner = "client", name = "ef", descriptor = "Z")
    private boolean field392 = false;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[I")
    private int[] field393 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private boolean field399 = false;

    @OriginalMember(owner = "client", name = "nf", descriptor = "[I")
    private int[] field400 = new int[5];

    @OriginalMember(owner = "client", name = "rf", descriptor = "[I")
    private int[] field404 = new int[33];

    @OriginalMember(owner = "client", name = "tf", descriptor = "[[[LFLJWGVEY;")
    private class20[][][] field406 = new class20[4][104][104];

    @OriginalMember(owner = "client", name = "vf", descriptor = "Z")
    private boolean field408 = false;

    @OriginalMember(owner = "client", name = "wf", descriptor = "[[I")
    private int[][] field409 = new int[104][104];

    @OriginalMember(owner = "client", name = "cg", descriptor = "Ljava/lang/String;")
    private String field441 = "";

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field443 = 435;

    @OriginalMember(owner = "client", name = "gg", descriptor = "Z")
    private boolean field445 = true;

    @OriginalMember(owner = "client", name = "hg", descriptor = "Z")
    private boolean field446 = false;

    @OriginalMember(owner = "client", name = "og", descriptor = "Z")
    private boolean field453 = true;

    @OriginalMember(owner = "client", name = "pg", descriptor = "Z")
    private boolean field454 = false;

    @OriginalMember(owner = "client", name = "qg", descriptor = "B")
    private byte field455 = 4;

    @OriginalMember(owner = "client", name = "rg", descriptor = "[I")
    private int[] field456 = new int[200];

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field461 = 50;

    @OriginalMember(owner = "client", name = "xg", descriptor = "[I")
    private int[] field462 = new int[this.field461];

    @OriginalMember(owner = "client", name = "yg", descriptor = "[I")
    private int[] field463 = new int[this.field461];

    @OriginalMember(owner = "client", name = "zg", descriptor = "[I")
    private int[] field464 = new int[this.field461];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[I")
    private int[] field465 = new int[this.field461];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[I")
    private int[] field466 = new int[this.field461];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    private int[] field467 = new int[this.field461];

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field468 = new int[this.field461];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[Ljava/lang/String;")
    private String[] field469 = new String[this.field461];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[B")
    private byte[] field471 = new byte[16384];

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Z")
    private boolean field474 = false;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Z")
    private boolean field483 = false;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Z")
    public boolean field486 = true;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Z")
    private boolean field487 = false;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Z")
    private boolean field492 = false;

    @OriginalMember(owner = "client", name = "ch", descriptor = "[LFCRLGSQA;")
    private class19[] field493 = new class19[2];

    @OriginalMember(owner = "client", name = "dh", descriptor = "[[[I")
    private int[][][] field494 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "eh", descriptor = "[LFCRLGSQA;")
    private class19[] field495 = new class19[13];

    @OriginalMember(owner = "client", name = "fh", descriptor = "Z")
    private boolean field496 = false;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field499 = -1;

    @OriginalMember(owner = "client", name = "ph", descriptor = "B")
    private byte field506 = 7;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Z")
    private boolean field507 = true;

    @OriginalMember(owner = "client", name = "rh", descriptor = "Z")
    private boolean field508 = false;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Z")
    private boolean field509 = false;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Z")
    private boolean field511 = false;

    @OriginalMember(owner = "client", name = "vh", descriptor = "Ljava/lang/String;")
    private String field512 = "";

    @OriginalMember(owner = "client", name = "wh", descriptor = "Ljava/lang/String;")
    private String field513 = "";

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[J")
    private long[] field518 = new long[200];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field519 = -1;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[[I")
    private int[][] field520 = new int[104][104];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field521 = 7759444;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[Ljava/lang/String;")
    private String[] field523 = new String[200];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "LFLJWGVEY;")
    private class20 field525 = new class20(807);

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field527 = 665;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Z")
    private boolean field529 = true;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field533 = -1;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[I")
    private int[] field534 = new int[5];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private int[] field540 = new int[151];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    private boolean field541 = false;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[[I")
    private int[][] field542 = new int[104][104];

    @OriginalMember(owner = "client", name = "ai", descriptor = "Z")
    private boolean field543 = false;

    @OriginalMember(owner = "client", name = "bi", descriptor = "Z")
    private boolean field544 = false;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field552 = -23379;

    @OriginalMember(owner = "client", name = "li", descriptor = "[LBDNJGDVN;")
    public class7[] field554 = new class7[5];

    @OriginalMember(owner = "client", name = "mi", descriptor = "[I")
    private int[] field555 = new int[50];

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field556 = -1;

    @OriginalMember(owner = "client", name = "pi", descriptor = "[I")
    private int[] field558 = new int[100];

    @OriginalMember(owner = "client", name = "qi", descriptor = "[Ljava/lang/String;")
    private String[] field559 = new String[100];

    @OriginalMember(owner = "client", name = "ri", descriptor = "[Ljava/lang/String;")
    private String[] field560 = new String[100];

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field562 = 2048;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field563 = 2047;

    @OriginalMember(owner = "client", name = "vi", descriptor = "[LAWOZVMFS;")
    private class5[] field564 = new class5[this.field562];

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    public int[] field566 = new int[this.field562];

    @OriginalMember(owner = "client", name = "zi", descriptor = "[I")
    private int[] field568 = new int[this.field562];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[LEILHLJCE;")
    private class17[] field569 = new class17[this.field562];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field571 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Di", descriptor = "B")
    private byte field572 = 5;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field575 = 2;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "[J")
    private long[] field577 = new long[100];

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Z")
    public boolean field578 = false;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field591 = -618;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[I")
    private int[] field592 = new int[5];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field593 = -347;

    @OriginalMember(owner = "client", name = "aj", descriptor = "[Ljava/lang/String;")
    private String[] field595 = new String[5];

    @OriginalMember(owner = "client", name = "bj", descriptor = "[Z")
    private boolean[] field596 = new boolean[5];

    @OriginalMember(owner = "client", name = "cj", descriptor = "Ljava/lang/String;")
    private String field597 = "";

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field600 = 1;

    @OriginalMember(owner = "client", name = "gj", descriptor = "[I")
    private int[] field601 = new int[class53.field1350];

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field605 = 292;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field606 = -1;

    @OriginalMember(owner = "client", name = "mj", descriptor = "B")
    private byte field607 = 9;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field608 = -1;

    @OriginalMember(owner = "client", name = "sj", descriptor = "Z")
    private boolean field613 = true;

    @OriginalMember(owner = "client", name = "tj", descriptor = "Z")
    private boolean field614 = false;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field617 = 1;

    @OriginalMember(owner = "client", name = "zj", descriptor = "Z")
    private boolean field620 = false;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "LEILHLJCE;")
    private class17 field621 = class17.method212(1, (byte) 9);

    @OriginalMember(owner = "client", name = "Cj", descriptor = "LEILHLJCE;")
    private class17 field623 = class17.method212(1, (byte) 9);

    @OriginalMember(owner = "client", name = "Hj", descriptor = "Z")
    private boolean field628 = false;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field629 = -1;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field631 = -1;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field632 = 128;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "[I")
    private int[] field641 = new int[class53.field1350];

    @OriginalMember(owner = "client", name = "Vj", descriptor = "Z")
    private boolean field642 = false;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "[I")
    public int[] field643 = new int[2000];

    @OriginalMember(owner = "client", name = "Yj", descriptor = "[LODBDSPMH;")
    private class40[] field645 = new class40[20];

    @OriginalMember(owner = "client", name = "Zj", descriptor = "[I")
    private int[] field646 = new int[5];

    @OriginalMember(owner = "client", name = "bk", descriptor = "Ljava/lang/String;")
    private String field648 = "";

    @OriginalMember(owner = "client", name = "Jb", descriptor = "B")
    private static byte field215 = 28;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private static int field234 = 10;

    @OriginalMember(owner = "client", name = "ec", descriptor = "Z")
    private static boolean field236 = true;

    @OriginalMember(owner = "client", name = "md", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field296 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "of", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field401 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "sf", descriptor = "B")
    private static byte field405 = 71;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[[I")
    public static final int[][] field457 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[I")
    public static int[] field528 = new int[32];

    @OriginalMember(owner = "client", name = "ij", descriptor = "[I")
    public static final int[] field603;

    @OriginalMember(owner = "client", name = "ak", descriptor = "[I")
    private static int[] field647;

    @OriginalMember(owner = "client", name = "ck", descriptor = "Ljava/lang/String;")
    private static String field649;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private static int field194;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private static int field201;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private static int field246;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private static int field269;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private static int field279;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private static int field294;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private static int field327;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private static int field337;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private static int field340;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private static int field387;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private static int field395;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private static int field515;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private static int field526;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private static int field573;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private static int field590;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private static int field619;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field637;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client", name = "dk", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client", name = "nb", descriptor = "J")
    private long field193;

    @OriginalMember(owner = "client", name = "ic", descriptor = "J")
    private long field240;

    @OriginalMember(owner = "client", name = "od", descriptor = "J")
    public long field298;

    @OriginalMember(owner = "client", name = "yf", descriptor = "J")
    private long field411;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "J")
    private long field517;

    @OriginalMember(owner = "client", name = "vc", descriptor = "LFCRLGSQA;")
    private class19 field253;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LFCRLGSQA;")
    private class19 field254;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LFCRLGSQA;")
    private class19 field417;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "LFCRLGSQA;")
    private class19 field418;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "LFCRLGSQA;")
    private class19 field419;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "LFCRLGSQA;")
    private class19 field420;

    @OriginalMember(owner = "client", name = "If", descriptor = "LFCRLGSQA;")
    private class19 field421;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "LFCRLGSQA;")
    private class19 field430;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "LFCRLGSQA;")
    private class19 field431;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "LFCRLGSQA;")
    private class19 field432;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "LFCRLGSQA;")
    private class19 field475;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "LFCRLGSQA;")
    private class19 field476;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "LFCRLGSQA;")
    private class19 field477;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "LFCRLGSQA;")
    private class19 field478;

    @OriginalMember(owner = "client", name = "Og", descriptor = "LFCRLGSQA;")
    private class19 field479;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "LFCRLGSQA;")
    private class19 field535;

    @OriginalMember(owner = "client", name = "Th", descriptor = "LFCRLGSQA;")
    private class19 field536;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "LFCRLGSQA;")
    private class19 field537;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "LFCRLGSQA;")
    private class19 field538;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "LFCRLGSQA;")
    private class19 field539;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "LABBBHPCA;")
    private class1 field579;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "LMCYRKBJU;")
    private class34 field422;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "LMCYRKBJU;")
    private class34 field423;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "LMCYRKBJU;")
    private class34 field424;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "LMCYRKBJU;")
    private class34 field425;

    @OriginalMember(owner = "client", name = "J", descriptor = "LODBDSPMH;")
    private class40 field163;

    @OriginalMember(owner = "client", name = "qb", descriptor = "LODBDSPMH;")
    private class40 field196;

    @OriginalMember(owner = "client", name = "rb", descriptor = "LODBDSPMH;")
    private class40 field197;

    @OriginalMember(owner = "client", name = "sb", descriptor = "LODBDSPMH;")
    private class40 field198;

    @OriginalMember(owner = "client", name = "tb", descriptor = "LODBDSPMH;")
    private class40 field199;

    @OriginalMember(owner = "client", name = "ub", descriptor = "LODBDSPMH;")
    private class40 field200;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "LODBDSPMH;")
    private class40 field280;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "LODBDSPMH;")
    private class40 field310;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "LODBDSPMH;")
    private class40 field311;

    @OriginalMember(owner = "client", name = "Te", descriptor = "LODBDSPMH;")
    private class40 field381;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "LODBDSPMH;")
    private class40 field382;

    @OriginalMember(owner = "client", name = "bg", descriptor = "LODBDSPMH;")
    private class40 field440;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "LODBDSPMH;")
    private class40 field626;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "LODBDSPMH;")
    private class40 field627;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "LODBDSPMH;")
    private class40 field644;

    @OriginalMember(owner = "client", name = "yb", descriptor = "LUKPRFGXO;")
    private class58 field204;

    @OriginalMember(owner = "client", name = "zb", descriptor = "LUKPRFGXO;")
    private class58 field205;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "LUKPRFGXO;")
    private class58 field206;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "LUKPRFGXO;")
    private class58 field207;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "LUKPRFGXO;")
    private class58 field208;

    @OriginalMember(owner = "client", name = "Db", descriptor = "LUKPRFGXO;")
    private class58 field209;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "LUKPRFGXO;")
    private class58 field210;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "LUKPRFGXO;")
    private class58 field211;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "LUKPRFGXO;")
    private class58 field212;

    @OriginalMember(owner = "client", name = "Id", descriptor = "LUKPRFGXO;")
    private class58 field318;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "LUKPRFGXO;")
    private class58 field319;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "LUKPRFGXO;")
    private class58 field320;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "LUKPRFGXO;")
    private class58 field328;

    @OriginalMember(owner = "client", name = "Td", descriptor = "LUKPRFGXO;")
    private class58 field329;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "LUKPRFGXO;")
    private class58 field330;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "LUKPRFGXO;")
    private class58 field331;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "LUKPRFGXO;")
    private class58 field332;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "LUKPRFGXO;")
    private class58 field333;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "LUKPRFGXO;")
    private class58 field334;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "LUKPRFGXO;")
    private class58 field335;

    @OriginalMember(owner = "client", name = "ae", descriptor = "LUKPRFGXO;")
    private class58 field336;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "LUKPRFGXO;")
    private class58 field488;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "LUKPRFGXO;")
    private class58 field489;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "LUKPRFGXO;")
    private class58 field490;

    @OriginalMember(owner = "client", name = "ah", descriptor = "LUKPRFGXO;")
    private class58 field491;

    @OriginalMember(owner = "client", name = "kc", descriptor = "LULPROSHL;")
    public class59 field242;

    @OriginalMember(owner = "client", name = "pd", descriptor = "LAWOZVMFS;")
    public static class5 field299;

    @OriginalMember(owner = "client", name = "uf", descriptor = "LXOHMKFIT;")
    private class68 field407;

    @OriginalMember(owner = "client", name = "Md", descriptor = "LBBMKAXRK;")
    private class6 field322;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "LYPXEHIVX;")
    private class70 field625;

    @OriginalMember(owner = "client", name = "hj", descriptor = "LYSAVREBH;")
    private class71 field602;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Ljava/lang/String;")
    private String field321;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Ljava/lang/String;")
    public String field549;

    @OriginalMember(owner = "client", name = "jj", descriptor = "Ljava/lang/String;")
    private String field604;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "Ljava/lang/String;")
    public String field639;

    @OriginalMember(owner = "client", name = "X", descriptor = "Ljava/net/Socket;")
    private Socket field177;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private static boolean field237;

    @OriginalMember(owner = "client", name = "ad", descriptor = "Z")
    private static boolean field284;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Z")
    public static boolean field377;

    @OriginalMember(owner = "client", name = "xh", descriptor = "Z")
    public static boolean field514;

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    private int[] field189;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field190;

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field191;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[I")
    private int[] field216;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    private int[] field217;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field426;

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    private int[] field427;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[I")
    private int[] field428;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[I")
    private int[] field429;

    @OriginalMember(owner = "client", name = "jg", descriptor = "[I")
    private int[] field448;

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field449;

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field450;

    @OriginalMember(owner = "client", name = "mg", descriptor = "[I")
    private int[] field451;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field458;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field459;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[LFCRLGSQA;")
    private class19[] field383;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[[B")
    private byte[][] field305;

    @OriginalMember(owner = "client", name = "Df", descriptor = "[[B")
    private byte[][] field416;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[[[B")
    private byte[][][] field238;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[[[I")
    private int[][][] field622;

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIRYXZZFE;II)I")
    public final int method44(class27 arg0, int arg1, int arg2) {
        if (arg1 != -29344) {
            return 4;
        } else if (arg0.field943 != null && arg2 < arg0.field943.length) {
            try {
                int[] var4 = arg0.field943[arg2];
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
                        var9 = this.field601[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field641[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field213[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class27 var11 = class27.method329(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class67.field1534 && (!class67.method526(var12).field1507 || field236)) {
                            for (int var13 = 0; var13 < var11.field947.length; ++var13) {
                                if (var12 + 1 == var11.field947[var13]) {
                                    var9 += var11.field909[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field643[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field647[this.field641[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field643[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field299.field121;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class53.field1350; ++var14) {
                            if (class53.field1352[var14]) {
                                var9 += this.field641[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class27 var15 = class27.method329(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class67.field1534 && (!class67.method526(var16).field1507 || field236)) {
                            for (int var17 = 0; var17 < var15.field947.length; ++var17) {
                                if (var15.field947[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field239;
                    }
                    if (var8 == 12) {
                        var9 = this.field171;
                    }
                    if (var8 == 13) {
                        int var18 = this.field643[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class51 var21 = class51.field1328[var20];
                        int var22 = var21.field1330;
                        int var23 = var21.field1331;
                        int var24 = var21.field1332;
                        int var25 = field528[var24 - var23];
                        var9 = this.field643[var22] >> var23 & var25;
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
                        var9 = (field299.field67 >> 7) + this.field609;
                    }
                    if (var8 == 19) {
                        var9 = (field299.field68 >> 7) + this.field610;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIRYXZZFE;B)Z")
    public final boolean method45(class27 arg0, byte arg1) {
        if (arg1 != 21) {
            this.field434 = -1;
        }
        if (arg0.field903 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field903.length; ++var3) {
                int var4 = this.method44(arg0, -29344, var3);
                int var5 = arg0.field901[var3];
                if (arg0.field903[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field903[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field903[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method46(String arg0) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method47(boolean arg0) {
        if (!arg0) {
            if (this.field243 != 0) {
                int var2 = 0;
                if (this.field470 != 0) {
                    var2 = 1;
                }
                for (int var3 = 0; var3 < 100; ++var3) {
                    if (this.field560[var3] != null) {
                        int var4 = this.field558[var3];
                        String var5 = this.field559[var3];
                        boolean var6 = false;
                        if (var5 != null && var5.startsWith("@cr1@")) {
                            var5 = var5.substring(5);
                            boolean var7 = true;
                        }
                        if (var5 != null && var5.startsWith("@cr2@")) {
                            var5 = var5.substring(5);
                            boolean var8 = true;
                        }
                        if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field355 == 0 || this.field355 == 1 && this.method179(var5, 4))) {
                            int var9 = 329 - var2 * 13;
                            if (super.field92 > 4 && super.field93 - 4 > var9 - 10 && super.field93 - 4 <= var9 + 3) {
                                int var10 = this.field423.method375("From:  " + var5 + this.field560[var3], true) + 25;
                                if (var10 > 450) {
                                    var10 = 450;
                                }
                                if (super.field92 < var10 + 4) {
                                    if (this.field181 >= 1) {
                                        this.field273[this.field412] = "Report abuse @whi@" + var5;
                                        this.field348[this.field412] = 2787;
                                        ++this.field412;
                                    }
                                    this.field273[this.field412] = "Add ignore @whi@" + var5;
                                    this.field348[this.field412] = 2379;
                                    ++this.field412;
                                    this.field273[this.field412] = "Add friend @whi@" + var5;
                                    this.field348[this.field412] = 2696;
                                    ++this.field412;
                                }
                            }
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                        if ((var4 == 5 || var4 == 6) && this.field355 < 2) {
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method48(boolean arg0) {
        this.field489.method463((byte) 58);
        if (this.field594 == 2) {
            byte[] var2 = this.field431.field798;
            int[] var3 = class26.field876;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field644.method408(256, 33, this.field633, 33, 25, this.field404, 0, this.field343, 0, 0, 25);
            this.field490.method463((byte) 58);
            class21.field822 = this.field428;
        } else {
            int var6 = this.field633 + this.field323 & 2047;
            int var7 = field299.field67 / 32 + 48;
            int var8 = 464 - field299.field68 / 32;
            if (!arg0) {
                this.field440.method408(this.field599 + 256, 146, var6, 151, var7, this.field354, 5, this.field540, 0, 25, var8);
                this.field644.method408(256, 33, this.field633, 33, 25, this.field404, 0, this.field343, 0, 0, 25);
                for (int var9 = 0; var9 < this.field361; ++var9) {
                    int var39 = this.field362[var9] * 4 + 2 - field299.field67 / 32;
                    int var40 = this.field363[var9] * 4 + 2 - field299.field68 / 32;
                    this.method178(this.field373[var9], false, var40, var39);
                }
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var35 = 0; var35 < 104; ++var35) {
                        class20 var36 = this.field406[this.field180][var10][var35];
                        if (var36 != null) {
                            int var37 = var10 * 4 + 2 - field299.field67 / 32;
                            int var38 = var35 * 4 + 2 - field299.field68 / 32;
                            this.method178(this.field196, false, var38, var37);
                        }
                    }
                }
                for (int var11 = 0; var11 < this.field232; ++var11) {
                    class43 var31 = this.field231[this.field233[var11]];
                    if (var31 != null && var31.method10(true)) {
                        class37 var32 = var31.field1213;
                        if (var32.field1119 != null) {
                            var32 = var32.method389((byte) 108);
                        }
                        if (var32 != null && var32.field1132 && var32.field1128) {
                            int var33 = var31.field67 / 32 - field299.field67 / 32;
                            int var34 = var31.field68 / 32 - field299.field68 / 32;
                            this.method178(this.field197, false, var34, var33);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field565; ++var12) {
                    class5 var23 = this.field564[this.field566[var12]];
                    if (var23 != null && var23.method10(true)) {
                        int var24 = var23.field67 / 32 - field299.field67 / 32;
                        int var25 = var23.field68 / 32 - field299.field68 / 32;
                        boolean var26 = false;
                        long var27 = class33.method366(var23.field129);
                        for (int var29 = 0; var29 < this.field173; ++var29) {
                            if (this.field518[var29] == var27 && this.field456[var29] != 0) {
                                var26 = true;
                                break;
                            }
                        }
                        boolean var30 = false;
                        if (field299.field130 != 0 && var23.field130 != 0 && field299.field130 == var23.field130) {
                            var30 = true;
                        }
                        if (var26) {
                            this.method178(this.field199, false, var25, var24);
                        } else if (var30) {
                            this.method178(this.field200, false, var25, var24);
                        } else {
                            this.method178(this.field198, false, var25, var24);
                        }
                    }
                }
                if (this.field281 != 0 && field553 % 20 < 10) {
                    if (this.field281 == 1 && this.field570 >= 0 && this.field570 < this.field231.length) {
                        class43 var13 = this.field231[this.field570];
                        if (var13 != null) {
                            int var14 = var13.field67 / 32 - field299.field67 / 32;
                            int var15 = var13.field68 / 32 - field299.field68 / 32;
                            this.method115(this.field311, this.field496, var15, var14);
                        }
                    }
                    if (this.field281 == 2) {
                        int var16 = (this.field164 - this.field609) * 4 + 2 - field299.field67 / 32;
                        int var17 = (this.field165 - this.field610) * 4 + 2 - field299.field68 / 32;
                        this.method115(this.field311, this.field496, var17, var16);
                    }
                    if (this.field281 == 10 && this.field245 >= 0 && this.field245 < this.field564.length) {
                        class5 var18 = this.field564[this.field245];
                        if (var18 != null) {
                            int var19 = var18.field67 / 32 - field299.field67 / 32;
                            int var20 = var18.field68 / 32 - field299.field68 / 32;
                            this.method115(this.field311, this.field496, var20, var19);
                        }
                    }
                }
                if (this.field438 != 0) {
                    int var21 = this.field438 * 4 + 2 - field299.field67 / 32;
                    int var22 = this.field439 * 4 + 2 - field299.field68 / 32;
                    this.method178(this.field310, false, var22, var21);
                }
                class26.method315(16777215, 97, 99, 3, 3, 78);
                this.field490.method463((byte) 58);
                class21.field822 = this.field428;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method49(int arg0) {
        int var2 = this.field314;
        int var3 = this.field315;
        int var4 = this.field316;
        int var5 = this.field317;
        int var6 = 6116423;
        if (arg0 != 6) {
            this.field406 = null;
        }
        class26.method315(var6, var2, 99, var4, var5, var3);
        class26.method315(0, var2 + 1, 99, var4 - 2, 16, var3 + 1);
        class26.method316(var3 + 18, var4 - 2, var2 + 1, -110, var5 - 19, 0);
        this.field424.method377("Choose Option", var3 + 14, var2 + 3, 0, var6);
        int var7 = super.field92;
        int var8 = super.field93;
        if (this.field313 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field313 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field313 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field412; ++var9) {
            int var10 = (this.field412 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field424.method381(var2 + 3, var10, true, var11, this.field273[var9], -98);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            this.field326 = this.field625.method580();
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field560[var5] != null) {
                int var6 = this.field558[var5];
                int var7 = 70 - var4 * 14 + this.field356 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field559[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field498 == 0 || this.field498 == 1 && this.method179(var8, 4))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field299.field129)) {
                        if (this.field181 >= 1) {
                            this.field273[this.field412] = "Report abuse @whi@" + var8;
                            this.field348[this.field412] = 787;
                            ++this.field412;
                        }
                        this.field273[this.field412] = "Add ignore @whi@" + var8;
                        this.field348[this.field412] = 379;
                        ++this.field412;
                        this.field273[this.field412] = "Add friend @whi@" + var8;
                        this.field348[this.field412] = 696;
                        ++this.field412;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field243 == 0 && (var6 == 7 || this.field355 == 0 || this.field355 == 1 && this.method179(var8, 4))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field181 >= 1) {
                            this.field273[this.field412] = "Report abuse @whi@" + var8;
                            this.field348[this.field412] = 787;
                            ++this.field412;
                        }
                        this.field273[this.field412] = "Add ignore @whi@" + var8;
                        this.field348[this.field412] = 379;
                        ++this.field412;
                        this.field273[this.field412] = "Add friend @whi@" + var8;
                        this.field348[this.field412] = 696;
                        ++this.field412;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field386 == 0 || this.field386 == 1 && this.method179(var8, 4))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field273[this.field412] = "Accept trade @whi@" + var8;
                        this.field348[this.field412] = 940;
                        ++this.field412;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field243 == 0 && this.field355 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field386 == 0 || this.field386 == 1 && this.method179(var8, 4))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field273[this.field412] = "Accept challenge @whi@" + var8;
                        this.field348[this.field412] = 113;
                        ++this.field412;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method51(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field630 != 0) {
                this.field630 = 0;
                this.field642 = true;
            }
            int var3 = this.field346[arg0];
            int var4 = this.field347[arg0];
            int var5 = this.field348[arg0];
            int var6 = this.field349[arg0];
            while (arg1 >= 0) {
                this.field406 = null;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 281) {
                field395 += var4;
                if (field395 >= 82) {
                    this.field623.method213(-164, 182);
                    field395 = 0;
                }
                this.field623.method213(-164, 255);
                this.field623.method215(var3);
                this.field623.method250(var6, (byte) 0);
                this.field623.method250(var4, (byte) 0);
                this.field500 = 0;
                this.field501 = var4;
                this.field502 = var3;
                this.field503 = 2;
                if (class27.method329(var4).field895 == this.field265) {
                    this.field503 = 1;
                }
                if (class27.method329(var4).field895 == this.field499) {
                    this.field503 = 3;
                }
            }
            if (var5 == 946) {
                this.field623.method213(-164, 17);
                this.field623.method250(var3, (byte) 0);
                this.field623.method250(var6, (byte) 0);
                this.field623.method215(var4);
                this.field500 = 0;
                this.field501 = var4;
                this.field502 = var3;
                this.field503 = 2;
                if (class27.method329(var4).field895 == this.field265) {
                    this.field503 = 1;
                }
                if (class27.method329(var4).field895 == this.field499) {
                    this.field503 = 3;
                }
            }
            if (var5 == 1335) {
                class43 var7 = this.field231[var6];
                if (var7 != null) {
                    class37 var8 = var7.field1213;
                    if (var8.field1119 != null) {
                        var8 = var8.method389((byte) 108);
                    }
                    if (var8 != null) {
                        String var9;
                        if (var8.field1147 != null) {
                            var9 = new String(var8.field1147);
                        } else {
                            var9 = "It's a " + var8.field1142 + ".";
                        }
                        this.method126(0, var9, "", 0);
                    }
                }
            }
            if (var5 == 426) {
                class27 var10 = class27.method329(var4);
                boolean var11 = true;
                if (var10.field891 > 0) {
                    var11 = this.method56((byte) 53, var10);
                }
                if (var11) {
                    this.field623.method213(-164, 208);
                    this.field623.method215(var4);
                }
            }
            if (var5 == 377) {
                this.field623.method213(-164, 226);
                this.field623.method251(-302, var3);
                this.field623.method215(var6);
                this.field623.method249(-133, var4);
                this.field500 = 0;
                this.field501 = var4;
                this.field502 = var3;
                this.field503 = 2;
                if (class27.method329(var4).field895 == this.field265) {
                    this.field503 = 1;
                }
                if (class27.method329(var4).field895 == this.field499) {
                    this.field503 = 3;
                }
            }
            if (var5 == 405 && !this.field446) {
                this.field623.method213(-164, 154);
                this.field623.method215(var4);
                this.field446 = true;
            }
            if (var5 == 275) {
                boolean var12 = this.method155(var3, (byte) 6, var4, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
                if (!var12) {
                    this.method155(var3, (byte) 6, var4, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                }
                this.field247 = super.field99;
                this.field248 = super.field100;
                this.field250 = 2;
                this.field249 = 0;
                this.field623.method213(-164, 143);
                this.field623.method249(-133, this.field610 + var4);
                this.field623.method250(var6, (byte) 0);
                this.field623.method249(-133, this.field609 + var3);
            }
            if (var5 == 515) {
                class43 var14 = this.field231[var6];
                if (var14 != null) {
                    this.method155(var14.field37[0], (byte) 6, var14.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                    this.field247 = super.field99;
                    this.field248 = super.field100;
                    this.field250 = 2;
                    this.field249 = 0;
                    this.field623.method213(-164, 16);
                    this.field623.method250(var6, (byte) 0);
                }
            }
            if (var5 == 951) {
                this.field623.method213(-164, 208);
                this.field623.method215(var4);
                class27 var15 = class27.method329(var4);
                if (var15.field943 != null && var15.field943[0][0] == 5) {
                    int var16 = var15.field943[0][1];
                    if (this.field643[var16] != var15.field901[0]) {
                        this.field643[var16] = var15.field901[0];
                        this.method132(false, var16);
                        this.field541 = true;
                    }
                }
            }
            if (var5 == 983) {
                class43 var17 = this.field231[var6];
                if (var17 != null) {
                    this.method155(var17.field37[0], (byte) 6, var17.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                    this.field247 = super.field99;
                    this.field248 = super.field100;
                    this.field250 = 2;
                    this.field249 = 0;
                    this.field623.method213(-164, 158);
                    this.field623.method249(-133, var6);
                }
            }
            if (var5 == 646) {
                class43 var18 = this.field231[var6];
                if (var18 != null) {
                    this.method155(var18.field37[0], (byte) 6, var18.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                    this.field247 = super.field99;
                    this.field248 = super.field100;
                    this.field250 = 2;
                    this.field249 = 0;
                    this.field623.method213(-164, 48);
                    this.field623.method215(this.field547);
                    this.field623.method249(-133, this.field548);
                    this.field623.method249(-133, var6);
                    this.field623.method249(-133, this.field546);
                }
            }
            if (var5 == 1) {
                this.field623.method213(-164, 73);
                this.field623.method250(var4, (byte) 0);
                this.field623.method250(var6, (byte) 0);
                this.field623.method215(var3);
                this.field500 = 0;
                this.field501 = var4;
                this.field502 = var3;
                this.field503 = 2;
                if (class27.method329(var4).field895 == this.field265) {
                    this.field503 = 1;
                }
                if (class27.method329(var4).field895 == this.field499) {
                    this.field503 = 3;
                }
            }
            if (var5 == 98) {
                boolean var19 = this.method155(var3, (byte) 6, var4, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
                if (!var19) {
                    this.method155(var3, (byte) 6, var4, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                }
                this.field247 = super.field99;
                this.field248 = super.field100;
                this.field250 = 2;
                this.field249 = 0;
                this.field623.method213(-164, 105);
                this.field623.method251(-302, this.field610 + var4);
                this.field623.method249(-133, var6);
                this.field623.method250(this.field609 + var3, (byte) 0);
            }
            if (var5 == 582) {
                class27 var21 = class27.method329(var4);
                this.field636 = 1;
                this.field637 = var4;
                this.field638 = var21.field938;
                this.field545 = 0;
                this.field541 = true;
                String var22 = var21.field939;
                if (var22.indexOf(" ") != -1) {
                    var22 = var22.substring(0, var22.indexOf(" "));
                }
                String var23 = var21.field939;
                if (var23.indexOf(" ") != -1) {
                    var23 = var23.substring(var23.indexOf(" ") + 1);
                }
                this.field639 = var22 + " " + var21.field897 + " " + var23;
                if (this.field638 == 16) {
                    this.field541 = true;
                    this.field365 = 3;
                    this.field264 = true;
                }
            } else {
                if (var5 == 403) {
                    class43 var24 = this.field231[var6];
                    if (var24 != null) {
                        this.method155(var24.field37[0], (byte) 6, var24.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                        this.field247 = super.field99;
                        this.field248 = super.field100;
                        this.field250 = 2;
                        this.field249 = 0;
                        this.field623.method213(-164, 21);
                        this.field623.method249(-133, var6);
                        this.field623.method249(-133, this.field637);
                    }
                }
                if (var5 == 703) {
                    class5 var25 = this.field564[var6];
                    if (var25 != null) {
                        this.method155(var25.field37[0], (byte) 6, var25.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                        this.field247 = super.field99;
                        this.field248 = super.field100;
                        this.field250 = 2;
                        this.field249 = 0;
                        this.field623.method213(-164, 189);
                        this.field623.method250(var6, (byte) 0);
                        this.field623.method215(this.field547);
                        this.field623.method250(this.field546, (byte) 0);
                        this.field623.method249(-133, this.field548);
                    }
                }
                if (var5 == 419 && this.method101(1, var3, var6, var4)) {
                    this.field623.method213(-164, 18);
                    this.field623.method251(-302, this.field548);
                    this.field623.method250(var6 >> 14 & 32767, (byte) 0);
                    this.field623.method215(this.field546);
                    this.field623.method249(-133, this.field609 + var3);
                    this.field623.method251(-302, this.field547);
                    this.field623.method215(this.field610 + var4);
                }
                if (var5 == 621) {
                    class5 var26 = this.field564[var6];
                    if (var26 != null) {
                        this.method155(var26.field37[0], (byte) 6, var26.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                        this.field247 = super.field99;
                        this.field248 = super.field100;
                        this.field250 = 2;
                        this.field249 = 0;
                        this.field623.method213(-164, 170);
                        this.field623.method250(this.field637, (byte) 0);
                        this.field623.method215(var6);
                    }
                }
                if (var5 == 184) {
                    boolean var27 = this.method155(var3, (byte) 6, var4, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
                    if (!var27) {
                        this.method155(var3, (byte) 6, var4, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                    }
                    this.field247 = super.field99;
                    this.field248 = super.field100;
                    this.field250 = 2;
                    this.field249 = 0;
                    this.field623.method213(-164, 41);
                    this.field623.method215(var6);
                    this.field623.method251(-302, this.field610 + var4);
                    this.field623.method215(this.field609 + var3);
                }
                if (var5 == 985) {
                    field337 += var4;
                    if (field337 >= 145) {
                        this.field623.method213(-164, 100);
                        field337 = 0;
                    }
                    this.method101(1, var3, var6, var4);
                    this.field623.method213(-164, 59);
                    this.field623.method215(var6 >> 14 & 32767);
                    this.field623.method249(-133, this.field610 + var4);
                    this.field623.method250(this.field609 + var3, (byte) 0);
                }
                if (var5 == 883) {
                    class5 var29 = this.field564[var6];
                    if (var29 != null) {
                        this.method155(var29.field37[0], (byte) 6, var29.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                        this.field247 = super.field99;
                        this.field248 = super.field100;
                        this.field250 = 2;
                        this.field249 = 0;
                        this.field623.method213(-164, 99);
                        this.field623.method251(-302, var6);
                    }
                }
                if (var5 == 16) {
                    if (!this.field392) {
                        this.field407.method566(super.field99 - 4, super.field100 - 4, 7);
                    } else {
                        this.field407.method566(var3 - 4, var4 - 4, 7);
                    }
                }
                if (var5 == 208) {
                    this.method88(0);
                }
                if (var5 == 1577) {
                    this.method101(1, var3, var6, var4);
                    this.field623.method213(-164, 206);
                    this.field623.method251(-302, this.field609 + var3);
                    this.field623.method249(-133, this.field610 + var4);
                    this.field623.method215(var6 >> 14 & 32767);
                }
                if (var5 == 787) {
                    String var30 = this.field273[arg0];
                    int var31 = var30.indexOf("@whi@");
                    if (var31 != -1) {
                        if (this.field265 == -1) {
                            this.method88(0);
                            this.field597 = var30.substring(var31 + 5).trim();
                            this.field487 = false;
                            this.field608 = this.field265 = class27.field887;
                        } else {
                            this.method126(0, "Please close the interface you have open before using 'report abuse'", "", 0);
                        }
                    }
                }
                if (var5 == 157 && this.method101(1, var3, var6, var4)) {
                    this.field623.method213(-164, 90);
                    this.field623.method215(this.field610 + var4);
                    this.field623.method250(var6 >> 14 & 32767, (byte) 0);
                    this.field623.method215(this.field609 + var3);
                    this.field623.method251(-302, this.field637);
                }
                if (var5 == 62) {
                    boolean var32 = this.method155(var3, (byte) 6, var4, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
                    if (!var32) {
                        this.method155(var3, (byte) 6, var4, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                    }
                    this.field247 = super.field99;
                    this.field248 = super.field100;
                    this.field250 = 2;
                    this.field249 = 0;
                    this.field623.method213(-164, 113);
                    this.field623.method250(this.field546, (byte) 0);
                    this.field623.method249(-133, this.field610 + var4);
                    this.field623.method250(this.field548, (byte) 0);
                    this.field623.method251(-302, this.field547);
                    this.field623.method215(this.field609 + var3);
                    this.field623.method215(var6);
                }
                if (var5 == 391) {
                    this.field623.method213(-164, 174);
                    this.field623.method250(var3, (byte) 0);
                    this.field623.method251(-302, var6);
                    this.field623.method249(-133, var4);
                    this.field500 = 0;
                    this.field501 = var4;
                    this.field502 = var3;
                    this.field503 = 2;
                    if (class27.method329(var4).field895 == this.field265) {
                        this.field503 = 1;
                    }
                    if (class27.method329(var4).field895 == this.field499) {
                        this.field503 = 3;
                    }
                }
                if (var5 == 233) {
                    class5 var34 = this.field564[var6];
                    if (var34 != null) {
                        this.method155(var34.field37[0], (byte) 6, var34.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                        this.field247 = super.field99;
                        this.field248 = super.field100;
                        this.field250 = 2;
                        this.field249 = 0;
                        this.field623.method213(-164, 190);
                        this.field623.method215(var6);
                    }
                }
                if (var5 == 81) {
                    boolean var35 = this.method155(var3, (byte) 6, var4, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
                    if (!var35) {
                        this.method155(var3, (byte) 6, var4, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                    }
                    this.field247 = super.field99;
                    this.field248 = super.field100;
                    this.field250 = 2;
                    this.field249 = 0;
                    this.field623.method213(-164, 12);
                    this.field623.method250(var6, (byte) 0);
                    this.field623.method215(this.field610 + var4);
                    this.field623.method251(-302, this.field609 + var3);
                }
                if (var5 == 696 || var5 == 379 || var5 == 526 || var5 == 212) {
                    String var37 = this.field273[arg0];
                    int var38 = var37.indexOf("@whi@");
                    if (var38 != -1) {
                        long var39 = class33.method366(var37.substring(var38 + 5).trim());
                        if (var5 == 696) {
                            this.method68(var39, -20952);
                        }
                        if (var5 == 379) {
                            this.method57(false, var39);
                        }
                        if (var5 == 526) {
                            this.method61(var39, true);
                        }
                        if (var5 == 212) {
                            this.method114(var39, this.field557);
                        }
                    }
                }
                if (var5 == 1184) {
                    class67 var41 = class67.method526(var6);
                    String var42;
                    if (var41.field1528 != null) {
                        var42 = new String(var41.field1528);
                    } else {
                        var42 = "It's a " + var41.field1533 + ".";
                    }
                    this.method126(0, var42, "", 0);
                }
                if (var5 == 963) {
                    this.field545 = 1;
                    this.field546 = var3;
                    this.field547 = var4;
                    this.field548 = var6;
                    this.field549 = class67.method526(var6).field1533;
                    this.field636 = 0;
                    this.field541 = true;
                } else {
                    if (var5 == 447) {
                        class43 var43 = this.field231[var6];
                        if (var43 != null) {
                            this.method155(var43.field37[0], (byte) 6, var43.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                            this.field247 = super.field99;
                            this.field248 = super.field100;
                            this.field250 = 2;
                            this.field249 = 0;
                            this.field623.method213(-164, 163);
                            this.field623.method250(var6, (byte) 0);
                        }
                    }
                    if (var5 == 940 || var5 == 113) {
                        String var44 = this.field273[arg0];
                        int var45 = var44.indexOf("@whi@");
                        if (var45 != -1) {
                            String var46 = var44.substring(var45 + 5).trim();
                            String var47 = class33.method370(false, class33.method367(0, class33.method366(var46)));
                            boolean var48 = false;
                            for (int var49 = 0; var49 < this.field565; ++var49) {
                                class5 var50 = this.field564[this.field566[var49]];
                                if (var50 != null && var50.field129 != null && var50.field129.equalsIgnoreCase(var47)) {
                                    this.method155(var50.field37[0], (byte) 6, var50.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                                    if (var5 == 940) {
                                        this.field623.method213(-164, 162);
                                        this.field623.method215(this.field566[var49]);
                                    }
                                    if (var5 == 113) {
                                        this.field623.method213(-164, 99);
                                        this.field623.method251(-302, this.field566[var49]);
                                    }
                                    var48 = true;
                                    break;
                                }
                            }
                            if (!var48) {
                                this.method126(0, "Unable to find " + var47, "", 0);
                            }
                        }
                    }
                    if (var5 == 482) {
                        this.method146(this.field629, true);
                        this.field629 = -1;
                        this.field642 = true;
                    }
                    if (var5 == 896) {
                        class5 var51 = this.field564[var6];
                        if (var51 != null) {
                            this.method155(var51.field37[0], (byte) 6, var51.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                            this.field247 = super.field99;
                            this.field248 = super.field100;
                            this.field250 = 2;
                            this.field249 = 0;
                            this.field623.method213(-164, 162);
                            this.field623.method215(var6);
                        }
                    }
                    if (var5 == 789) {
                        this.field623.method213(-164, 14);
                        this.field623.method251(-302, this.field637);
                        this.field623.method215(var6);
                        this.field623.method249(-133, var4);
                        this.field623.method250(var3, (byte) 0);
                        this.field500 = 0;
                        this.field501 = var4;
                        this.field502 = var3;
                        this.field503 = 2;
                        if (class27.method329(var4).field895 == this.field265) {
                            this.field503 = 1;
                        }
                        if (class27.method329(var4).field895 == this.field499) {
                            this.field503 = 3;
                        }
                    }
                    if (var5 == 766) {
                        this.method101(1, var3, var6, var4);
                        this.field623.method213(-164, 217);
                        this.field623.method251(-302, this.field609 + var3);
                        this.field623.method249(-133, this.field610 + var4);
                        this.field623.method249(-133, var6 >> 14 & 32767);
                    }
                    if (var5 == 247) {
                        String var52 = this.field273[arg0];
                        int var53 = var52.indexOf("@whi@");
                        if (var53 != -1) {
                            long var54 = class33.method366(var52.substring(var53 + 5).trim());
                            int var56 = -1;
                            for (int var57 = 0; var57 < this.field173; ++var57) {
                                if (this.field518[var57] == var54) {
                                    var56 = var57;
                                    break;
                                }
                            }
                            if (var56 != -1 && this.field456[var56] > 0) {
                                this.field642 = true;
                                this.field630 = 0;
                                this.field614 = true;
                                this.field244 = "";
                                this.field516 = 3;
                                this.field193 = this.field518[var56];
                                this.field648 = "Enter message to send to " + this.field523[var56];
                            }
                        }
                    }
                    if (var5 == 277) {
                        ++field201;
                        if (field201 >= 132) {
                            this.field623.method213(-164, 95);
                            this.field623.method218(0);
                            field201 = 0;
                        }
                        this.field623.method213(-164, 93);
                        this.field623.method250(var4, (byte) 0);
                        this.field623.method250(var3, (byte) 0);
                        this.field623.method215(var6);
                        this.field500 = 0;
                        this.field501 = var4;
                        this.field502 = var3;
                        this.field503 = 2;
                        if (class27.method329(var4).field895 == this.field265) {
                            this.field503 = 1;
                        }
                        if (class27.method329(var4).field895 == this.field499) {
                            this.field503 = 3;
                        }
                    }
                    if (var5 == 359) {
                        class5 var58 = this.field564[var6];
                        if (var58 != null) {
                            this.method155(var58.field37[0], (byte) 6, var58.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                            this.field247 = super.field99;
                            this.field248 = super.field100;
                            this.field250 = 2;
                            this.field249 = 0;
                            this.field623.method213(-164, 134);
                            this.field623.method249(-133, var6);
                        }
                    }
                    if (var5 == 530) {
                        this.field623.method213(-164, 19);
                        this.field623.method249(-133, var4);
                        this.field623.method249(-133, var3);
                        this.field623.method251(-302, var6);
                        this.field500 = 0;
                        this.field501 = var4;
                        this.field502 = var3;
                        this.field503 = 2;
                        if (class27.method329(var4).field895 == this.field265) {
                            this.field503 = 1;
                        }
                        if (class27.method329(var4).field895 == this.field499) {
                            this.field503 = 3;
                        }
                    }
                    if (var5 == 485) {
                        this.field623.method213(-164, 117);
                        this.field623.method251(-302, var6);
                        this.field623.method249(-133, var3);
                        this.field623.method251(-302, var4);
                        this.field500 = 0;
                        this.field501 = var4;
                        this.field502 = var3;
                        this.field503 = 2;
                        if (class27.method329(var4).field895 == this.field265) {
                            this.field503 = 1;
                        }
                        if (class27.method329(var4).field895 == this.field499) {
                            this.field503 = 3;
                        }
                    }
                    if (var5 == 538) {
                        boolean var59 = this.method155(var3, (byte) 6, var4, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
                        if (!var59) {
                            this.method155(var3, (byte) 6, var4, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                        }
                        this.field247 = super.field99;
                        this.field248 = super.field100;
                        this.field250 = 2;
                        this.field249 = 0;
                        this.field623.method213(-164, 104);
                        this.field623.method250(this.field609 + var3, (byte) 0);
                        this.field623.method215(this.field610 + var4);
                        this.field623.method249(-133, this.field637);
                        this.field623.method215(var6);
                    }
                    if (var5 == 689) {
                        boolean var61 = this.method155(var3, (byte) 6, var4, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
                        if (!var61) {
                            this.method155(var3, (byte) 6, var4, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                        }
                        this.field247 = super.field99;
                        this.field248 = super.field100;
                        this.field250 = 2;
                        this.field249 = 0;
                        field246 += var4;
                        if (field246 >= 102) {
                            this.field623.method213(-164, 30);
                            this.field623.method218(0);
                            field246 = 0;
                        }
                        this.field623.method213(-164, 57);
                        this.field623.method215(var6);
                        this.field623.method215(this.field609 + var3);
                        this.field623.method250(this.field610 + var4, (byte) 0);
                    }
                    if (var5 == 790) {
                        this.field623.method213(-164, 208);
                        this.field623.method215(var4);
                        class27 var63 = class27.method329(var4);
                        if (var63.field943 != null && var63.field943[0][0] == 5) {
                            int var64 = var63.field943[0][1];
                            this.field643[var64] = 1 - this.field643[var64];
                            this.method132(false, var64);
                            this.field541 = true;
                        }
                    }
                    if (var5 == 1870) {
                        class67 var65 = class67.method526(var6);
                        class27 var66 = class27.method329(var4);
                        String var67;
                        if (var66 != null && var66.field909[var3] >= 100000) {
                            var67 = var66.field909[var3] + " x " + var65.field1533;
                        } else if (var65.field1528 != null) {
                            var67 = new String(var65.field1528);
                        } else {
                            var67 = "It's a " + var65.field1533 + ".";
                        }
                        this.method126(0, var67, "", 0);
                    }
                    if (var5 == 256) {
                        this.method101(1, var3, var6, var4);
                        this.field623.method213(-164, 102);
                        this.field623.method249(-133, this.field609 + var3);
                        this.field623.method250(this.field610 + var4, (byte) 0);
                        this.field623.method250(var6 >> 14 & 32767, (byte) 0);
                    }
                    if (var5 == 588) {
                        this.method101(1, var3, var6, var4);
                        this.field623.method213(-164, 9);
                        this.field623.method249(-133, this.field610 + var4);
                        this.field623.method250(var6 >> 14 & 32767, (byte) 0);
                        this.field623.method251(-302, this.field609 + var3);
                    }
                    if (var5 == 152) {
                        if ((var3 & 3) == 0) {
                            ++field526;
                        }
                        if (field526 >= 129) {
                            this.field623.method213(-164, 87);
                            this.field623.method215(37562);
                            field526 = 0;
                        }
                        this.field623.method213(-164, 176);
                        this.field623.method215(var4);
                        this.field623.method215(var3);
                        this.field623.method215(var6);
                        this.field500 = 0;
                        this.field501 = var4;
                        this.field502 = var3;
                        this.field503 = 2;
                        if (class27.method329(var4).field895 == this.field265) {
                            this.field503 = 1;
                        }
                        if (class27.method329(var4).field895 == this.field499) {
                            this.field503 = 3;
                        }
                    }
                    if (var5 == 145) {
                        class5 var68 = this.field564[var6];
                        if (var68 != null) {
                            this.method155(var68.field37[0], (byte) 6, var68.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                            this.field247 = super.field99;
                            this.field248 = super.field100;
                            this.field250 = 2;
                            this.field249 = 0;
                            field294 += var6;
                            if (field294 >= 50) {
                                this.field623.method213(-164, 164);
                                this.field623.method217(3839761);
                                field294 = 0;
                            }
                            this.field623.method213(-164, 54);
                            this.field623.method250(var6, (byte) 0);
                        }
                    }
                    if (var5 == 1327) {
                        int var69 = var6 >> 14 & 32767;
                        class14 var70 = class14.method192(var69);
                        String var71;
                        if (var70.field689 != null) {
                            var71 = new String(var70.field689);
                        } else {
                            var71 = "It's a " + var70.field729 + ".";
                        }
                        this.method126(0, var71, "", 0);
                    }
                    if (var5 == 24) {
                        class43 var72 = this.field231[var6];
                        if (var72 != null) {
                            this.method155(var72.field37[0], (byte) 6, var72.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                            this.field247 = super.field99;
                            this.field248 = super.field100;
                            this.field250 = 2;
                            this.field249 = 0;
                            this.field623.method213(-164, 76);
                            this.field623.method251(-302, var6);
                        }
                    }
                    if (var5 == 851) {
                        class43 var73 = this.field231[var6];
                        if (var73 != null) {
                            this.method155(var73.field37[0], (byte) 6, var73.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
                            this.field247 = super.field99;
                            this.field248 = super.field100;
                            this.field250 = 2;
                            this.field249 = 0;
                            if ((var6 & 3) == 0) {
                                ++field279;
                            }
                            if (field279 >= 111) {
                                this.field623.method213(-164, 199);
                                this.field623.method218(0);
                                field279 = 0;
                            }
                            this.field623.method213(-164, 37);
                            this.field623.method215(var6);
                        }
                    }
                    if (var5 == 395) {
                        this.field623.method213(-164, 137);
                        this.field623.method249(-133, var4);
                        this.field623.method215(this.field547);
                        this.field623.method249(-133, this.field548);
                        this.field623.method250(this.field546, (byte) 0);
                        this.field623.method250(var3, (byte) 0);
                        this.field623.method249(-133, var6);
                        this.field500 = 0;
                        this.field501 = var4;
                        this.field502 = var3;
                        this.field503 = 2;
                        if (class27.method329(var4).field895 == this.field265) {
                            this.field503 = 1;
                        }
                        if (class27.method329(var4).field895 == this.field499) {
                            this.field503 = 3;
                        }
                    }
                    if (var5 == 181) {
                        this.field623.method213(-164, 140);
                        this.field623.method249(-133, var3);
                        this.field623.method250(var4, (byte) 0);
                        this.field623.method251(-302, var6);
                        this.field500 = 0;
                        this.field501 = var4;
                        this.field502 = var3;
                        this.field503 = 2;
                        if (class27.method329(var4).field895 == this.field265) {
                            this.field503 = 1;
                        }
                        if (class27.method329(var4).field895 == this.field499) {
                            this.field503 = 3;
                        }
                    }
                    this.field545 = 0;
                    this.field636 = 0;
                    this.field541 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method52(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class27 var5 = class27.method329(arg0);
        for (int var6 = 0; var6 < var5.field911.length && var5.field911[var6] != -1; ++var6) {
            class27 var7 = class27.method329(var5.field911[var6]);
            if (var7.field922 == 1) {
                var4 |= this.method52(var7.field914, 1, arg2);
            }
            if (var7.field922 == 6 && (var7.field898 != -1 || var7.field899 != -1)) {
                boolean var8 = this.method45(var7, (byte) 21);
                int var9;
                if (var8) {
                    var9 = var7.field899;
                } else {
                    var9 = var7.field898;
                }
                if (var9 != -1) {
                    class41 var10 = class41.field1184[var9];
                    var7.field959 += arg2;
                    while (var7.field959 > var10.method413(var7.field948, false)) {
                        var7.field959 -= var10.method413(var7.field948, false) + 1;
                        ++var7.field948;
                        if (var7.field948 >= var10.field1185) {
                            var7.field948 -= var10.field1189;
                            if (var7.field948 < 0 || var7.field948 >= var10.field1185) {
                                var7.field948 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field922 == 6 && var7.field912 != 0) {
                int var11 = var7.field912 >> 16;
                int var12 = var7.field912 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field950 = var7.field950 + var13 & 2047;
                var7.field951 = var7.field951 + var14 & 2047;
                var4 = true;
            }
        }
        if (arg1 != 1) {
            this.field342 = this.field625.method580();
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    private static final String method53(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (field405 != arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method54(byte arg0, int arg1) {
        if (this.field506 == arg0) {
            boolean var3 = false;
        } else {
            this.method17();
        }
        if (!field237) {
            for (int var4 = 0; var4 < this.field258.length; ++var4) {
                int var5 = this.field258[var4];
                if (class21.field830[var5] >= arg1) {
                    class19 var6 = class21.field824[var5];
                    int var7 = var6.field801 * var6.field800 - 1;
                    int var8 = this.field447 * var6.field800 * 2;
                    byte[] var9 = var6.field798;
                    byte[] var10 = this.field471;
                    for (int var11 = 0; var11 <= var7; ++var11) {
                        var10[var11] = var9[var11 - var8 & var7];
                    }
                    var6.field798 = var10;
                    this.field471 = var9;
                    class21.method287(-137, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZI)V")
    public final void method55(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field478.method270(arg3, this.field527, arg5);
        this.field479.method270(arg3, this.field527, arg1 + arg5 - 16);
        class26.method315(this.field360, arg3, 99, 16, arg1 - 32, arg5 + 16);
        int var7 = (arg1 - 32) * arg1 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg0 / (arg2 - arg1);
        class26.method315(this.field300, arg3, 99, 16, var7, arg5 + 16 + var8);
        class26.method320(arg3, -83, this.field521, arg5 + 16 + var8, var7);
        class26.method320(arg3 + 1, -83, this.field521, arg5 + 16 + var8, var7);
        class26.method318(16, arg5 + 16 + var8, arg3, -548, this.field521);
        class26.method318(16, arg5 + 17 + var8, arg3, -548, this.field521);
        class26.method320(arg3 + 15, -83, this.field292, arg5 + 16 + var8, var7);
        if (!arg4) {
            class26.method320(arg3 + 14, -83, this.field292, arg5 + 17 + var8, var7 - 1);
            class26.method318(16, arg5 + 15 + var8 + var7, arg3, -548, this.field292);
            class26.method318(15, arg5 + 14 + var8 + var7, arg3 + 1, -548, this.field292);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLIRYXZZFE;)Z")
    public final boolean method56(byte arg0, class27 arg1) {
        if (arg0 != 53) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field891;
            if (this.field174 == 2) {
                if (var3 == 201) {
                    this.field642 = true;
                    this.field630 = 0;
                    this.field614 = true;
                    this.field244 = "";
                    this.field516 = 1;
                    this.field648 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field642 = true;
                    this.field630 = 0;
                    this.field614 = true;
                    this.field244 = "";
                    this.field516 = 2;
                    this.field648 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field437 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field642 = true;
                    this.field630 = 0;
                    this.field614 = true;
                    this.field244 = "";
                    this.field516 = 4;
                    this.field648 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field642 = true;
                    this.field630 = 0;
                    this.field614 = true;
                    this.field244 = "";
                    this.field516 = 5;
                    this.field648 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field389[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class54.field1356 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class54.field1356) {
                                    var6 = 0;
                                }
                            }
                            if (!class54.field1357[var6].field1363 && class54.field1357[var6].field1358 == var4 + (this.field613 ? 0 : 7)) {
                                this.field389[var4] = var6;
                                this.field257 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field646[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field457[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field457[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field646[var7] = var9;
                    this.field257 = true;
                }
                if (var3 == 324 && !this.field613) {
                    this.field613 = true;
                    this.method80(-279);
                }
                if (var3 == 325 && this.field613) {
                    this.field613 = false;
                    this.method80(-279);
                }
                if (var3 != 326) {
                    if (var3 == 620) {
                        this.field487 = !this.field487;
                    }
                    if (var3 >= 601 && var3 <= 613) {
                        this.method88(0);
                        if (this.field597.length() > 0) {
                            this.field623.method213(-164, 3);
                            this.field623.method220(class33.method366(this.field597), false);
                            this.field623.method214(var3 - 601);
                            this.field623.method214(this.field487 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field623.method213(-164, 205);
                    this.field623.method214(this.field613 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field623.method214(this.field389[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field623.method214(this.field646[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method57(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field225 >= 100) {
                this.method126(0, "Your ignore list is full. Max of 100 hit", "", 0);
            } else {
                String var4 = class33.method370(false, class33.method367(0, arg1));
                for (int var5 = 0; var5 < this.field225; ++var5) {
                    if (this.field577[var5] == arg1) {
                        this.method126(0, var4 + " is already on your ignore list", "", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field173; ++var6) {
                    if (this.field518[var6] == arg1) {
                        this.method126(0, "Please remove " + var4 + " from your friend list first", "", 0);
                        return;
                    }
                }
                this.field577[this.field225++] = arg1;
                this.field541 = true;
                this.field623.method213(-164, 71);
                this.field623.method220(arg1, false);
                if (arg0) {
                    this.field375 = !this.field375;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method58(int arg0) {
        int var2 = 19 / arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field87 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)Z")
    public final boolean method59(int arg0) {
        if (arg0 != 0) {
            this.field434 = this.field222.method224();
        }
        if (this.field579 == null) {
            return false;
        } else {
            try {
                int var2 = this.field579.method3();
                if (var2 == 0) {
                    return false;
                }
                if (this.field434 == -1) {
                    this.field579.method4(this.field222.field778, 0, 1);
                    this.field434 = this.field222.field778[0] & 255;
                    if (this.field625 != null) {
                        this.field434 = this.field434 - this.field625.method580() & 255;
                    }
                    this.field433 = class45.field1246[this.field434];
                    --var2;
                }
                if (this.field433 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field579.method4(this.field222.field778, 0, 1);
                    this.field433 = this.field222.field778[0] & 255;
                    --var2;
                }
                if (this.field433 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field579.method4(this.field222.field778, 0, 2);
                    this.field222.field779 = 0;
                    this.field433 = this.field222.method226();
                    var2 -= 2;
                }
                if (var2 < this.field433) {
                    return false;
                }
                this.field222.field779 = 0;
                this.field579.method4(this.field222.field778, 0, this.field433);
                this.field435 = 0;
                this.field229 = this.field228;
                this.field228 = this.field227;
                this.field227 = this.field434;
                if (this.field434 == 46) {
                    int var3 = this.field222.method226();
                    int var4 = this.field222.method252(0);
                    int var5 = var3 >> 10 & 31;
                    int var6 = var3 >> 5 & 31;
                    int var7 = var3 & 31;
                    class27.method329(var4).field892 = (var7 << 3) + (var5 << 19) + (var6 << 11);
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 152 || this.field434 == 20) {
                    int var8 = this.field472;
                    int var9 = this.field473;
                    if (this.field434 == 152) {
                        var9 = this.field222.method254(0);
                        var8 = this.field222.method254(0);
                        this.field509 = false;
                    }
                    if (this.field434 == 20) {
                        this.field222.method234(true);
                        int var10 = 0;
                        while (true) {
                            if (var10 >= 4) {
                                this.field222.method236(false);
                                var8 = this.field222.method226();
                                var9 = this.field222.method252(0);
                                this.field509 = true;
                                break;
                            }
                            for (int var11 = 0; var11 < 13; ++var11) {
                                for (int var12 = 0; var12 < 13; ++var12) {
                                    int var13 = this.field222.method235(1, 24335);
                                    if (var13 == 1) {
                                        this.field494[var10][var11][var12] = this.field222.method235(26, 24335);
                                    } else {
                                        this.field494[var10][var11][var12] = -1;
                                    }
                                }
                            }
                            ++var10;
                        }
                    }
                    if (this.field472 == var8 && this.field473 == var9 && this.field179 == 2) {
                        this.field434 = -1;
                        return true;
                    }
                    this.field472 = var8;
                    this.field473 = var9;
                    this.field609 = (this.field472 - 6) * 8;
                    this.field610 = (this.field473 - 6) * 8;
                    this.field628 = false;
                    if ((this.field472 / 8 == 48 || this.field472 / 8 == 49) && this.field473 / 8 == 48) {
                        this.field628 = true;
                    }
                    if (this.field472 / 8 == 48 && this.field473 / 8 == 148) {
                        this.field628 = true;
                    }
                    this.field179 = 1;
                    this.field240 = System.currentTimeMillis();
                    this.method72(this.field607, "Loading - please wait.", (String) null);
                    if (this.field434 == 152) {
                        int var14 = 0;
                        int var15 = (this.field472 - 6) / 8;
                        label1241: while (true) {
                            if (var15 > (this.field472 + 6) / 8) {
                                this.field416 = new byte[var14][];
                                this.field305 = new byte[var14][];
                                this.field189 = new int[var14];
                                this.field190 = new int[var14];
                                this.field191 = new int[var14];
                                int var17 = 0;
                                int var18 = (this.field472 - 6) / 8;
                                while (true) {
                                    if (var18 > (this.field472 + 6) / 8) {
                                        break label1241;
                                    }
                                    for (int var19 = (this.field473 - 6) / 8; var19 <= (this.field473 + 6) / 8; ++var19) {
                                        this.field189[var17] = (var18 << 8) + var19;
                                        if (!this.field628 || var19 != 49 && var19 != 149 && var19 != 147 && var18 != 50 && (var18 != 49 || var19 != 47)) {
                                            int var20 = this.field190[var17] = this.field602.method601(var19, var18, 0, false);
                                            if (var20 != -1) {
                                                this.field602.method585(3, var20);
                                            }
                                            int var21 = this.field191[var17] = this.field602.method601(var19, var18, 1, false);
                                            if (var21 != -1) {
                                                this.field602.method585(3, var21);
                                            }
                                            ++var17;
                                        } else {
                                            this.field190[var17] = -1;
                                            this.field191[var17] = -1;
                                            ++var17;
                                        }
                                    }
                                    ++var18;
                                }
                            }
                            for (int var16 = (this.field473 - 6) / 8; var16 <= (this.field473 + 6) / 8; ++var16) {
                                ++var14;
                            }
                            ++var15;
                        }
                    }
                    if (this.field434 == 20) {
                        int var22 = 0;
                        int[] var23 = new int[676];
                        int var24 = 0;
                        label1200: while (true) {
                            if (var24 >= 4) {
                                this.field416 = new byte[var22][];
                                this.field305 = new byte[var22][];
                                this.field189 = new int[var22];
                                this.field190 = new int[var22];
                                this.field191 = new int[var22];
                                int var32 = 0;
                                while (true) {
                                    if (var32 >= var22) {
                                        break label1200;
                                    }
                                    int var33 = this.field189[var32] = var23[var32];
                                    int var34 = var33 >> 8 & 255;
                                    int var35 = var33 & 255;
                                    int var36 = this.field190[var32] = this.field602.method601(var35, var34, 0, false);
                                    if (var36 != -1) {
                                        this.field602.method585(3, var36);
                                    }
                                    int var37 = this.field191[var32] = this.field602.method601(var35, var34, 1, false);
                                    if (var37 != -1) {
                                        this.field602.method585(3, var37);
                                    }
                                    ++var32;
                                }
                            }
                            for (int var25 = 0; var25 < 13; ++var25) {
                                for (int var26 = 0; var26 < 13; ++var26) {
                                    int var27 = this.field494[var24][var25][var26];
                                    if (var27 != -1) {
                                        int var28 = var27 >> 14 & 1023;
                                        int var29 = var27 >> 3 & 2047;
                                        int var30 = (var28 / 8 << 8) + var29 / 8;
                                        for (int var31 = 0; var31 < var22; ++var31) {
                                            if (var23[var31] == var30) {
                                                var30 = -1;
                                                break;
                                            }
                                        }
                                        if (var30 != -1) {
                                            var23[var22++] = var30;
                                        }
                                    }
                                }
                            }
                            ++var24;
                        }
                    }
                    int var38 = this.field609 - this.field611;
                    int var39 = this.field610 - this.field612;
                    this.field611 = this.field609;
                    this.field612 = this.field610;
                    for (int var40 = 0; var40 < 16384; ++var40) {
                        class43 var41 = this.field231[var40];
                        if (var41 != null) {
                            for (int var42 = 0; var42 < 10; ++var42) {
                                var41.field37[var42] -= var38;
                                var41.field38[var42] -= var39;
                            }
                            var41.field67 -= var38 * 128;
                            var41.field68 -= var39 * 128;
                        }
                    }
                    for (int var43 = 0; var43 < this.field562; ++var43) {
                        class5 var44 = this.field564[var43];
                        if (var44 != null) {
                            for (int var45 = 0; var45 < 10; ++var45) {
                                var44.field37[var45] -= var38;
                                var44.field38[var45] -= var39;
                            }
                            var44.field67 -= var38 * 128;
                            var44.field68 -= var39 * 128;
                        }
                    }
                    this.field266 = true;
                    byte var46 = 0;
                    byte var47 = 104;
                    byte var48 = 1;
                    if (var38 < 0) {
                        var46 = 103;
                        var47 = -1;
                        var48 = -1;
                    }
                    byte var49 = 0;
                    byte var50 = 104;
                    byte var51 = 1;
                    if (var39 < 0) {
                        var49 = 103;
                        var50 = -1;
                        var51 = -1;
                    }
                    for (int var52 = var46; var47 != var52; var52 += var48) {
                        for (int var53 = var49; var50 != var53; var53 += var51) {
                            int var54 = var38 + var52;
                            int var55 = var39 + var53;
                            for (int var56 = 0; var56 < 4; ++var56) {
                                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                                    this.field406[var56][var52][var53] = this.field406[var56][var54][var55];
                                } else {
                                    this.field406[var56][var52][var53] = null;
                                }
                            }
                        }
                    }
                    for (class23 var57 = (class23) this.field525.method275(); var57 != null; var57 = (class23) this.field525.method277(4)) {
                        var57.field854 -= var38;
                        var57.field855 -= var39;
                        if (var57.field854 < 0 || var57.field855 < 0 || var57.field854 >= 104 || var57.field855 >= 104) {
                            var57.method334();
                        }
                    }
                    if (this.field438 != 0) {
                        this.field438 -= var38;
                        this.field439 -= var39;
                    }
                    this.field295 = false;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 5) {
                    this.method71(37121);
                    this.field434 = -1;
                    return false;
                }
                if (this.field434 == 106) {
                    int var58 = this.field222.method252(0);
                    int var59 = this.field222.method226();
                    int var60 = this.field222.method226();
                    if (var58 == 65535) {
                        class27.method329(var59).field924 = 0;
                        this.field434 = -1;
                        return true;
                    }
                    class67 var61 = class67.method526(var58);
                    class27.method329(var59).field924 = 4;
                    class27.method329(var59).field925 = var58;
                    class27.method329(var59).field950 = var61.field1531;
                    class27.method329(var59).field951 = var61.field1511;
                    class27.method329(var59).field949 = var61.field1515 * 100 / var60;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 53) {
                    int var62 = this.field222.method254(0);
                    int var63 = this.field222.method252(0);
                    class27.method329(var63).field924 = 2;
                    class27.method329(var63).field925 = var62;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 192) {
                    for (int var64 = 0; var64 < this.field643.length; ++var64) {
                        if (this.field643[var64] != this.field312[var64]) {
                            this.field643[var64] = this.field312[var64];
                            this.method132(false, var64);
                            this.field541 = true;
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 16) {
                    this.field485 = this.field222.method243(true);
                    this.field484 = this.field222.method245(2);
                    while (this.field222.field779 < this.field433) {
                        int var65 = this.field222.method224();
                        this.method131(398, var65, this.field222);
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 128) {
                    this.field541 = true;
                    int var66 = this.field222.method259(-148);
                    int var67 = this.field222.method243(true);
                    int var68 = this.field222.method245(2);
                    this.field213[var68] = var66;
                    this.field601[var68] = var67;
                    this.field641[var68] = 1;
                    for (int var69 = 0; var69 < 98; ++var69) {
                        if (var66 >= field647[var69]) {
                            this.field641[var68] = var69 + 2;
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 205) {
                    this.field352 = this.field222.method259(-148);
                    this.field504 = this.field222.method226();
                    this.field510 = this.field222.method252(0);
                    this.field251 = this.field222.method226();
                    this.field221 = this.field222.method254(0);
                    this.field344 = this.field222.method243(true);
                    this.field402 = this.field222.method252(0);
                    this.field376 = this.field222.method226();
                    this.field224 = this.field222.method254(0);
                    this.field413 = this.field222.method253(394);
                    this.field285 = this.field222.method226();
                    signlink.dnslookup(class33.method369(4, this.field352));
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 125) {
                    this.field365 = this.field222.method243(true);
                    this.field541 = true;
                    this.field264 = true;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 14) {
                    int var70 = this.field222.method226();
                    this.method93(var70, (byte) 5);
                    if (this.field519 != -1) {
                        this.method146(this.field519, true);
                        this.field519 = -1;
                        this.field541 = true;
                        this.field264 = true;
                    }
                    if (this.field499 != -1) {
                        this.method146(this.field499, true);
                        this.field499 = -1;
                        this.field642 = true;
                    }
                    if (this.field631 != -1) {
                        this.method146(this.field631, true);
                        this.field631 = -1;
                        this.field399 = true;
                    }
                    if (this.field275 != -1) {
                        this.method146(this.field275, true);
                        this.field275 = -1;
                    }
                    if (this.field265 != var70) {
                        this.method146(this.field265, true);
                        this.field265 = var70;
                    }
                    if (this.field630 != 0) {
                        this.field630 = 0;
                        this.field642 = true;
                    }
                    this.field446 = false;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 129) {
                    this.field533 = this.field222.method224();
                    if (this.field533 == this.field365) {
                        if (this.field533 == 3) {
                            this.field365 = 1;
                        } else {
                            this.field365 = 3;
                        }
                        this.field541 = true;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 136) {
                    boolean var71 = this.field222.method245(2) == 1;
                    int var72 = this.field222.method226();
                    class27.method329(var72).field917 = var71;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 15) {
                    int var73 = this.field222.method226();
                    int var74 = this.field222.method253(394);
                    this.method93(var73, (byte) 5);
                    if (var74 != -1) {
                        this.method93(var74, (byte) 5);
                    }
                    if (this.field265 != -1) {
                        this.method146(this.field265, true);
                        this.field265 = -1;
                    }
                    if (this.field519 != -1) {
                        this.method146(this.field519, true);
                        this.field519 = -1;
                    }
                    if (this.field499 != -1) {
                        this.method146(this.field499, true);
                        this.field499 = -1;
                    }
                    if (this.field631 != var73) {
                        this.method146(this.field631, true);
                        this.field631 = var73;
                    }
                    if (this.field275 != var73) {
                        this.method146(this.field275, true);
                        this.field275 = var74;
                    }
                    this.field630 = 0;
                    this.field446 = false;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 104) {
                    int var75 = this.field222.method226();
                    int var76 = this.field222.method224();
                    int var77 = this.field222.method226();
                    if (this.field282 && !field237 && this.field615 < 50) {
                        this.field555[this.field615] = var75;
                        this.field303[this.field615] = var76;
                        this.field267[this.field615] = class22.field839[var75] + var77;
                        ++this.field615;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 181) {
                    this.field295 = true;
                    this.field367 = this.field222.method224();
                    this.field368 = this.field222.method224();
                    this.field369 = this.field222.method226();
                    this.field370 = this.field222.method224();
                    this.field371 = this.field222.method224();
                    if (this.field371 >= 100) {
                        this.field184 = this.field367 * 128 + 64;
                        this.field186 = this.field368 * 128 + 64;
                        this.field185 = this.method129(this.field184, this.field186, (byte) 111, this.field180) - this.field369;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 56) {
                    int var78 = this.field222.method253(394);
                    int var79 = this.field222.method252(0);
                    int var80 = this.field222.method226();
                    int var81 = this.field222.method254(0);
                    class27.method329(var80).field950 = var79;
                    class27.method329(var80).field951 = var78;
                    class27.method329(var80).field949 = var81;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 40 || this.field434 == 2 || this.field434 == 255 || this.field434 == 65 || this.field434 == 175 || this.field434 == 146 || this.field434 == 121 || this.field434 == 250 || this.field434 == 126 || this.field434 == 164 || this.field434 == 198) {
                    this.method131(398, this.field434, this.field222);
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 158) {
                    int var82 = this.field222.method226();
                    int var83 = this.field222.method254(0);
                    int var84 = this.field222.method252(0);
                    class27.method329(var82).field912 = (var84 << 16) + var83;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 114) {
                    this.field614 = false;
                    this.field630 = 1;
                    this.field195 = "";
                    this.field642 = true;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 251) {
                    this.field556 = this.field222.method252(0);
                    this.field403 = this.field222.method245(2);
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 150) {
                    byte var85 = this.field222.method225();
                    int var86 = this.field222.method226();
                    this.field312[var86] = var85;
                    if (this.field643[var86] != var85) {
                        this.field643[var86] = var85;
                        this.method132(false, var86);
                        this.field541 = true;
                        if (this.field629 != -1) {
                            this.field642 = true;
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 216) {
                    int var87 = this.field222.method224();
                    int var88 = this.field222.method245(2);
                    String var89 = this.field222.method231();
                    if (var87 >= 1 && var87 <= 5) {
                        if (var89.equalsIgnoreCase("null")) {
                            var89 = null;
                        }
                        this.field595[var87 - 1] = var89;
                        this.field596[var87 - 1] = var88 == 0;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 179) {
                    if (this.field365 == 12) {
                        this.field541 = true;
                    }
                    this.field171 = this.field222.method227();
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 35) {
                    int var90 = this.field222.method253(394);
                    int var91 = this.field222.method226();
                    class27 var92 = class27.method329(var91);
                    if (var92 != null && var92.field922 == 0) {
                        if (var90 < 0) {
                            var90 = 0;
                        }
                        if (var90 > var92.field921 - var92.field910) {
                            var90 = var92.field921 - var92.field910;
                        }
                        var92.field928 = var90;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 137) {
                    this.field295 = false;
                    for (int var93 = 0; var93 < 5; ++var93) {
                        this.field345[var93] = false;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 124) {
                    this.field614 = false;
                    this.field630 = 2;
                    this.field195 = "";
                    this.field642 = true;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 253) {
                    if (this.field519 != -1) {
                        this.method146(this.field519, true);
                        this.field519 = -1;
                        this.field541 = true;
                        this.field264 = true;
                    }
                    if (this.field499 != -1) {
                        this.method146(this.field499, true);
                        this.field499 = -1;
                        this.field642 = true;
                    }
                    if (this.field631 != -1) {
                        this.method146(this.field631, true);
                        this.field631 = -1;
                        this.field399 = true;
                    }
                    if (this.field275 != -1) {
                        this.method146(this.field275, true);
                        this.field275 = -1;
                    }
                    if (this.field265 != -1) {
                        this.method146(this.field265, true);
                        this.field265 = -1;
                    }
                    if (this.field630 != 0) {
                        this.field630 = 0;
                        this.field642 = true;
                    }
                    this.field446 = false;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 100) {
                    this.field618 = this.field222.method224();
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 241) {
                    this.field484 = this.field222.method244(6335);
                    this.field485 = this.field222.method244(6335);
                    for (int var94 = this.field484; var94 < this.field484 + 8; ++var94) {
                        for (int var95 = this.field485; var95 < this.field485 + 8; ++var95) {
                            if (this.field406[this.field180][var94][var95] != null) {
                                this.field406[this.field180][var94][var95] = null;
                                this.method133(var94, var95);
                            }
                        }
                    }
                    for (class23 var96 = (class23) this.field525.method275(); var96 != null; var96 = (class23) this.field525.method277(4)) {
                        if (var96.field854 >= this.field484 && var96.field854 < this.field484 + 8 && var96.field855 >= this.field485 && var96.field855 < this.field485 + 8 && this.field180 == var96.field852) {
                            var96.field851 = 0;
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 172) {
                    this.method69(this.field433, this.field222, (byte) 0);
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 219) {
                    this.field594 = this.field222.method224();
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 148) {
                    this.field498 = this.field222.method224();
                    this.field355 = this.field222.method224();
                    this.field386 = this.field222.method224();
                    this.field474 = true;
                    this.field642 = true;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 49) {
                    int var97 = this.field222.method243(true);
                    int var98 = this.field222.method226();
                    if (var98 == 65535) {
                        var98 = -1;
                    }
                    if (this.field571[var97] != var98) {
                        this.method146(this.field571[var97], true);
                        this.field571[var97] = var98;
                    }
                    this.field541 = true;
                    this.field264 = true;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 52) {
                    this.field438 = 0;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 223) {
                    String var99 = this.field222.method231();
                    int var100 = this.field222.method252(0);
                    class27.method329(var100).field918 = var99;
                    int var10001 = this.field571[this.field365];
                    if (class27.method329(var100).field895 == var10001) {
                        this.field541 = true;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 206) {
                    this.field541 = true;
                    int var101 = this.field222.method226();
                    class27 var102 = class27.method329(var101);
                    int var103 = this.field222.method226();
                    for (int var104 = 0; var104 < var103; ++var104) {
                        var102.field947[var104] = this.field222.method226();
                        int var105 = this.field222.method243(true);
                        if (var105 == 255) {
                            var105 = this.field222.method229();
                        }
                        var102.field909[var104] = var105;
                    }
                    for (int var106 = var103; var106 < var102.field947.length; ++var106) {
                        var102.field947[var106] = 0;
                        var102.field909[var106] = 0;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 84) {
                    int var107 = this.field222.method253(394);
                    int var108 = this.field222.method226();
                    class27.method329(var108).field924 = 1;
                    class27.method329(var108).field925 = var107;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 96) {
                    this.field295 = true;
                    this.field585 = this.field222.method224();
                    this.field586 = this.field222.method224();
                    this.field587 = this.field222.method226();
                    this.field588 = this.field222.method224();
                    this.field589 = this.field222.method224();
                    if (this.field589 >= 100) {
                        int var109 = this.field585 * 128 + 64;
                        int var110 = this.field586 * 128 + 64;
                        int var111 = this.method129(var109, var110, (byte) 111, this.field180) - this.field587;
                        int var112 = var109 - this.field184;
                        int var113 = var111 - this.field185;
                        int var114 = var110 - this.field186;
                        int var115 = (int) Math.sqrt((double) (var112 * var112 + var114 * var114));
                        this.field187 = (int) (Math.atan2((double) var113, (double) var115) * 325.949D) & 2047;
                        this.field188 = (int) (Math.atan2((double) var112, (double) var114) * -325.949D) & 2047;
                        if (this.field187 < 128) {
                            this.field187 = 128;
                        }
                        if (this.field187 > 383) {
                            this.field187 = 383;
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 86) {
                    int var116 = this.field222.method224();
                    int var117 = this.field222.method224();
                    int var118 = this.field222.method224();
                    int var119 = this.field222.method224();
                    this.field345[var116] = true;
                    this.field592[var116] = var117;
                    this.field534[var116] = var118;
                    this.field183[var116] = var119;
                    this.field400[var116] = 0;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 32) {
                    int var120 = this.field222.method226();
                    int var121 = this.field222.method261(this.field326);
                    this.field312[var120] = var121;
                    if (this.field643[var120] != var121) {
                        this.field643[var120] = var121;
                        this.method132(false, var120);
                        this.field541 = true;
                        if (this.field629 != -1) {
                            this.field642 = true;
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 197) {
                    long var122 = this.field222.method230(true);
                    int var124 = this.field222.method224();
                    String var125 = class33.method370(false, class33.method367(0, var122));
                    for (int var126 = 0; var126 < this.field173; ++var126) {
                        if (this.field518[var126] == var122) {
                            if (this.field456[var126] != var124) {
                                this.field456[var126] = var124;
                                this.field541 = true;
                                if (var124 > 0) {
                                    this.method126(5, var125 + " has logged in.", "", 0);
                                }
                                if (var124 == 0) {
                                    this.method126(5, var125 + " has logged out.", "", 0);
                                }
                            }
                            var125 = null;
                            break;
                        }
                    }
                    if (var125 != null && this.field173 < 200) {
                        this.field518[this.field173] = var122;
                        this.field523[this.field173] = var125;
                        this.field456[this.field173] = var124;
                        ++this.field173;
                        this.field541 = true;
                    }
                    boolean var127 = false;
                    while (!var127) {
                        var127 = true;
                        for (int var128 = 0; var128 < this.field173 - 1; ++var128) {
                            if (this.field456[var128] != field234 && this.field456[var128 + 1] == field234 || this.field456[var128] == 0 && this.field456[var128 + 1] != 0) {
                                int var129 = this.field456[var128];
                                this.field456[var128] = this.field456[var128 + 1];
                                this.field456[var128 + 1] = var129;
                                String var130 = this.field523[var128];
                                this.field523[var128] = this.field523[var128 + 1];
                                this.field523[var128 + 1] = var130;
                                long var131 = this.field518[var128];
                                this.field518[var128] = this.field518[var128 + 1];
                                this.field518[var128 + 1] = var131;
                                this.field541 = true;
                                var127 = false;
                            }
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 71) {
                    int var133 = this.field222.method252(0);
                    this.method93(var133, (byte) 5);
                    if (this.field499 != -1) {
                        this.method146(this.field499, true);
                        this.field499 = -1;
                        this.field642 = true;
                    }
                    if (this.field631 != -1) {
                        this.method146(this.field631, true);
                        this.field631 = -1;
                        this.field399 = true;
                    }
                    if (this.field275 != -1) {
                        this.method146(this.field275, true);
                        this.field275 = -1;
                    }
                    if (this.field265 != -1) {
                        this.method146(this.field265, true);
                        this.field265 = -1;
                    }
                    if (this.field519 != var133) {
                        this.method146(this.field519, true);
                        this.field519 = var133;
                    }
                    if (this.field630 != 0) {
                        this.field630 = 0;
                        this.field642 = true;
                    }
                    this.field541 = true;
                    this.field264 = true;
                    this.field446 = false;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 229) {
                    int var134 = this.field222.method226();
                    if (var134 == 65535) {
                        var134 = -1;
                    }
                    if (this.field223 != var134 && this.field379 && !field237 && this.field522 == 0) {
                        this.field452 = var134;
                        this.field453 = true;
                        this.field602.method585(2, this.field452);
                    }
                    this.field223 = var134;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 22) {
                    int var135 = this.field222.method258(true);
                    int var136 = this.field222.method252(0);
                    if (this.field379 && !field237) {
                        this.field452 = var136;
                        this.field453 = false;
                        this.field602.method585(2, this.field452);
                        this.field522 = var135;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 66) {
                    int var137 = this.field222.method226();
                    class27 var138 = class27.method329(var137);
                    for (int var139 = 0; var139 < var138.field947.length; ++var139) {
                        var138.field947[var139] = -1;
                        var138.field947[var139] = 0;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 165) {
                    if (this.field365 == 12) {
                        this.field541 = true;
                    }
                    this.field239 = this.field222.method224();
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 118) {
                    int var140 = this.field222.method253(394);
                    this.method93(var140, (byte) 5);
                    if (this.field519 != -1) {
                        this.method146(this.field519, true);
                        this.field519 = -1;
                        this.field541 = true;
                        this.field264 = true;
                    }
                    if (this.field631 != -1) {
                        this.method146(this.field631, true);
                        this.field631 = -1;
                        this.field399 = true;
                    }
                    if (this.field275 != -1) {
                        this.method146(this.field275, true);
                        this.field275 = -1;
                    }
                    if (this.field265 != -1) {
                        this.method146(this.field265, true);
                        this.field265 = -1;
                    }
                    if (this.field499 != var140) {
                        this.method146(this.field499, true);
                        this.field499 = var140;
                    }
                    this.field446 = false;
                    this.field642 = true;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 168) {
                    for (int var141 = 0; var141 < this.field564.length; ++var141) {
                        if (this.field564[var141] != null) {
                            this.field564[var141].field47 = -1;
                        }
                    }
                    for (int var142 = 0; var142 < this.field231.length; ++var142) {
                        if (this.field231[var142] != null) {
                            this.field231[var142].field47 = -1;
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 25) {
                    this.field174 = this.field222.method224();
                    this.field541 = true;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 242) {
                    String var143 = this.field222.method231();
                    if (var143.endsWith(":tradereq:")) {
                        String var144 = var143.substring(0, var143.indexOf(":"));
                        long var145 = class33.method366(var144);
                        boolean var147 = false;
                        for (int var148 = 0; var148 < this.field225; ++var148) {
                            if (this.field577[var148] == var145) {
                                var147 = true;
                                break;
                            }
                        }
                        if (!var147 && this.field640 == 0) {
                            this.method126(4, "wishes to trade with you.", var144, 0);
                        }
                    } else if (var143.endsWith(":duelreq:")) {
                        String var149 = var143.substring(0, var143.indexOf(":"));
                        long var150 = class33.method366(var149);
                        boolean var152 = false;
                        for (int var153 = 0; var153 < this.field225; ++var153) {
                            if (this.field577[var153] == var150) {
                                var152 = true;
                                break;
                            }
                        }
                        if (!var152 && this.field640 == 0) {
                            this.method126(8, "wishes to duel with you.", var149, 0);
                        }
                    } else if (!var143.endsWith(":chalreq:")) {
                        this.method126(0, var143, "", 0);
                    } else {
                        String var154 = var143.substring(0, var143.indexOf(":"));
                        long var155 = class33.method366(var154);
                        boolean var157 = false;
                        for (int var158 = 0; var158 < this.field225; ++var158) {
                            if (this.field577[var158] == var155) {
                                var157 = true;
                                break;
                            }
                        }
                        if (!var157 && this.field640 == 0) {
                            String var159 = var143.substring(var143.indexOf(":") + 1, var143.length() - 9);
                            this.method126(8, var159, var154, 0);
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 62) {
                    int var160 = this.field222.method226();
                    int var161 = this.field222.method253(394);
                    if (this.field499 != -1) {
                        this.method146(this.field499, true);
                        this.field499 = -1;
                        this.field642 = true;
                    }
                    if (this.field631 != -1) {
                        this.method146(this.field631, true);
                        this.field631 = -1;
                        this.field399 = true;
                    }
                    if (this.field275 != -1) {
                        this.method146(this.field275, true);
                        this.field275 = -1;
                    }
                    if (this.field265 != var161) {
                        this.method146(this.field265, true);
                        this.field265 = var161;
                    }
                    if (this.field519 != var160) {
                        this.method146(this.field519, true);
                        this.field519 = var160;
                    }
                    if (this.field630 != 0) {
                        this.field630 = 0;
                        this.field642 = true;
                    }
                    this.field541 = true;
                    this.field264 = true;
                    this.field446 = false;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 190) {
                    this.field470 = this.field222.method254(0) * 30;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 30) {
                    int var162 = this.field222.method253(394);
                    class27.method329(var162).field924 = 3;
                    if (field299.field127 == null) {
                        class27.method329(var162).field925 = (field299.field122[11] << 5) + (field299.field122[8] << 10) + (field299.field122[0] << 15) + (field299.field112[0] << 25) + (field299.field112[4] << 20) + field299.field122[1];
                    } else {
                        class27.method329(var162).field925 = (int) (field299.field127.field1122 + 305419896L);
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 144) {
                    int var163 = this.field222.method255(47979);
                    if (this.field629 != var163) {
                        this.method146(this.field629, true);
                        this.field629 = var163;
                    }
                    this.field642 = true;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 60) {
                    int var164 = this.field222.method256((byte) 6);
                    if (var164 >= 0) {
                        this.method93(var164, (byte) 5);
                    }
                    if (this.field378 != var164) {
                        this.method146(this.field378, true);
                        this.field378 = var164;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 58) {
                    this.field225 = this.field433 / 8;
                    for (int var165 = 0; var165 < this.field225; ++var165) {
                        this.field577[var165] = this.field222.method230(true);
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 37) {
                    this.method92(-938, this.field222, this.field433);
                    this.field266 = false;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 64) {
                    int var166 = this.field222.method226();
                    int var167 = this.field222.method255(47979);
                    int var168 = this.field222.method257(false);
                    class27 var169 = class27.method329(var166);
                    var169.field937 = var167;
                    var169.field907 = var168;
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 153) {
                    this.field281 = this.field222.method224();
                    if (this.field281 == 1) {
                        this.field570 = this.field222.method226();
                    }
                    if (this.field281 >= 2 && this.field281 <= 6) {
                        if (this.field281 == 2) {
                            this.field167 = 64;
                            this.field168 = 64;
                        }
                        if (this.field281 == 3) {
                            this.field167 = 0;
                            this.field168 = 64;
                        }
                        if (this.field281 == 4) {
                            this.field167 = 128;
                            this.field168 = 64;
                        }
                        if (this.field281 == 5) {
                            this.field167 = 64;
                            this.field168 = 0;
                        }
                        if (this.field281 == 6) {
                            this.field167 = 64;
                            this.field168 = 128;
                        }
                        this.field281 = 2;
                        this.field164 = this.field222.method226();
                        this.field165 = this.field222.method226();
                        this.field166 = this.field222.method224();
                    }
                    if (this.field281 == 10) {
                        this.field245 = this.field222.method226();
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 1) {
                    int var170 = this.field222.method255(47979);
                    int var171 = this.field222.method252(0);
                    class27 var172 = class27.method329(var171);
                    if (var172.field898 != var170 || var170 == -1) {
                        var172.field898 = var170;
                        var172.field948 = 0;
                        var172.field959 = 0;
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 243) {
                    this.field485 = this.field222.method224();
                    this.field484 = this.field222.method243(true);
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 176) {
                    long var173 = this.field222.method230(true);
                    int var175 = this.field222.method229();
                    int var176 = this.field222.method224();
                    boolean var177 = false;
                    for (int var178 = 0; var178 < 100; ++var178) {
                        if (this.field339[var178] == var175) {
                            var177 = true;
                            break;
                        }
                    }
                    if (var176 <= 1) {
                        for (int var179 = 0; var179 < this.field225; ++var179) {
                            if (this.field577[var179] == var173) {
                                var177 = true;
                                break;
                            }
                        }
                    }
                    if (!var177 && this.field640 == 0) {
                        try {
                            this.field339[this.field497] = var175;
                            this.field497 = (this.field497 + 1) % 100;
                            String var180 = class39.method396(this.field222, this.field433 - 13, -260);
                            if (var176 != 3) {
                                var180 = class65.method486(this.field552, var180);
                            }
                            if (var176 != 2 && var176 != 3) {
                                if (var176 == 1) {
                                    this.method126(7, var180, "@cr1@" + class33.method370(false, class33.method367(0, var173)), 0);
                                } else {
                                    this.method126(3, var180, class33.method370(false, class33.method367(0, var173)), 0);
                                }
                            } else {
                                this.method126(7, var180, "@cr2@" + class33.method370(false, class33.method367(0, var173)), 0);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                if (this.field434 == 89) {
                    this.field541 = true;
                    int var182 = this.field222.method226();
                    class27 var183 = class27.method329(var182);
                    while (this.field222.field779 < this.field433) {
                        int var184 = this.field222.method238();
                        int var185 = this.field222.method226();
                        int var186 = this.field222.method224();
                        if (var186 == 255) {
                            var186 = this.field222.method229();
                        }
                        if (var184 >= 0 && var184 < var183.field947.length) {
                            var183.field947[var184] = var185;
                            var183.field909[var184] = var186;
                        }
                    }
                    this.field434 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field434 + "," + this.field433 + " - " + this.field228 + "," + this.field229);
                this.method71(37121);
            } catch (IOException var191) {
                this.method125(38851);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field434 + "," + this.field228 + "," + this.field229 + " - " + this.field433 + "," + (field299.field37[0] + this.field609) + "," + (field299.field38[0] + this.field610) + " - ";
                for (int var189 = 0; var189 < this.field433 && var189 < 50; ++var189) {
                    var188 = var188 + this.field222.field778[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method71(37121);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method60(int arg0) {
        this.field353 = false;
        while (this.field268) {
            this.field353 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field253 = null;
        this.field254 = null;
        this.field383 = null;
        this.field448 = null;
        this.field449 = null;
        this.field450 = null;
        this.field451 = null;
        if (arg0 > 0) {
            this.field216 = null;
            this.field217 = null;
            this.field458 = null;
            this.field459 = null;
            this.field381 = null;
            this.field382 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method61(long arg0, boolean arg1) {
        if (!arg1) {
            this.field192 = 198;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field173; ++var4) {
                if (this.field518[var4] == arg0) {
                    --this.field173;
                    this.field541 = true;
                    for (int var5 = var4; var5 < this.field173; ++var5) {
                        this.field523[var5] = this.field523[var5 + 1];
                        this.field456[var5] = this.field456[var5 + 1];
                        this.field518[var5] = this.field518[var5 + 1];
                    }
                    this.field623.method213(-164, 223);
                    this.field623.method220(arg0, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILIRYXZZFE;IIIIIII)V")
    public final void method62(int arg0, class27 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field492) {
            this.field442 = 32;
        } else {
            this.field442 = 0;
        }
        this.field492 = false;
        if (arg0 != 1456) {
            this.field270 = !this.field270;
        }
        if (arg4 >= arg5 && arg4 < arg5 + 16 && arg6 >= arg8 && arg6 < arg8 + 16) {
            arg1.field928 -= this.field415 * 4;
            if (arg2 == 1) {
                this.field541 = true;
            }
            if (arg2 == 2 || arg2 == 3) {
                this.field642 = true;
            }
        } else if (arg4 >= arg5 && arg4 < arg5 + 16 && arg6 >= arg7 + arg8 - 16 && arg6 < arg7 + arg8) {
            arg1.field928 += this.field415 * 4;
            if (arg2 == 1) {
                this.field541 = true;
            }
            if (arg2 == 2 || arg2 == 3) {
                this.field642 = true;
            }
        } else if (arg4 >= arg5 - this.field442 && arg4 < arg5 + 16 + this.field442 && arg6 >= arg8 + 16 && arg6 < arg7 + arg8 - 16 && this.field415 > 0) {
            int var10 = (arg7 - 32) * arg7 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg8 - 16 - var10 / 2;
            int var12 = arg7 - 32 - var10;
            arg1.field928 = (arg3 - arg7) * var11 / var12;
            if (arg2 == 1) {
                this.field541 = true;
            }
            if (arg2 == 2 || arg2 == 3) {
                this.field642 = true;
            }
            this.field492 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method63(boolean arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method64(int arg0, int arg1, byte[] arg2) {
        if (arg0 >= 0) {
            this.field434 = this.field222.method224();
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILFCRLGSQA;)V")
    public final void method65(int arg0, class19 arg1) {
        this.field433 += arg0;
        short var3 = 256;
        for (int var4 = 0; var4 < this.field216.length; ++var4) {
            this.field216[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field216[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field217[var16] = (this.field216[var16 - 1] + this.field216[var16 + 1] + this.field216[var16 - 128] + this.field216[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field216;
            this.field216 = this.field217;
            this.field217 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field801; ++var8) {
                for (int var9 = 0; var9 < arg1.field800; ++var9) {
                    if (arg1.field798[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field802;
                        int var11 = var8 + 16 + arg1.field803;
                        int var12 = (var11 << 7) + var10;
                        this.field216[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method66(int arg0) {
        int var2 = this.field424.method375("Choose Option", true);
        for (int var3 = 0; var3 < this.field412; ++var3) {
            int var12 = this.field424.method375(this.field273[var3], true);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        var2 += 8;
        int var4 = 61 / arg0;
        int var5 = this.field412 * 15 + 21;
        if (super.field99 > 4 && super.field100 > 4 && super.field99 < 516 && super.field100 < 338) {
            int var6 = super.field99 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field100 - 4;
            if (var5 + var7 > 334) {
                var7 = 334 - var5;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field392 = true;
            this.field313 = 0;
            this.field314 = var6;
            this.field315 = var7;
            this.field316 = var2;
            this.field317 = this.field412 * 15 + 22;
        }
        if (super.field99 > 553 && super.field100 > 205 && super.field99 < 743 && super.field100 < 466) {
            int var8 = super.field99 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field100 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var5 + var9 > 261) {
                var9 = 261 - var5;
            }
            this.field392 = true;
            this.field313 = 1;
            this.field314 = var8;
            this.field315 = var9;
            this.field316 = var2;
            this.field317 = this.field412 * 15 + 22;
        }
        if (super.field99 > 17 && super.field100 > 357 && super.field99 < 496 && super.field100 < 453) {
            int var10 = super.field99 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field100 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var5 + var11 > 96) {
                var11 = 96 - var5;
            }
            this.field392 = true;
            this.field313 = 2;
            this.field314 = var10;
            this.field315 = var11;
            this.field316 = var2;
            this.field317 = this.field412 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        if (field299.field67 >> 7 == this.field438 && field299.field68 >> 7 == this.field439) {
            this.field438 = 0;
            ++field340;
            if (field340 > 96) {
                field340 = 0;
                this.field623.method213(-164, 35);
            }
        }
        int var3 = this.field565;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class5 var5;
            int var6;
            if (arg0) {
                var5 = field299;
                var6 = this.field563 << 14;
            } else {
                var5 = this.field564[this.field566[var4]];
                var6 = this.field566[var4] << 14;
            }
            if (var5 != null && var5.method10(true)) {
                var5.field113 = false;
                if ((field237 && this.field565 > 50 || this.field565 > 200) && !arg0 && var5.field70 == var5.field43) {
                    var5.field113 = true;
                }
                int var7 = var5.field67 >> 7;
                int var8 = var5.field68 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field126 != null && field553 >= var5.field107 && field553 < var5.field108) {
                        var5.field113 = false;
                        var5.field120 = this.method129(var5.field67, var5.field68, (byte) 111, this.field180);
                        this.field407.method540(var5.field67, var5.field69, var5.field120, var6, var5.field118, var5.field68, this.field180, var5.field117, 60, var5, var5.field116, this.field443, var5.field115);
                    } else {
                        if ((var5.field67 & 127) == 64 && (var5.field68 & 127) == 64) {
                            if (this.field409[var7][var8] == this.field297) {
                                continue;
                            }
                            this.field409[var7][var8] = this.field297;
                        }
                        var5.field120 = this.method129(var5.field67, var5.field68, (byte) 111, this.field180);
                        this.field407.method539(var5.field67, var5.field69, this.field180, var5.field68, true, 60, var5, var5.field120, var5.field39, var6);
                    }
                }
            }
        }
        if (arg1 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method68(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field173 >= 100 && this.field403 != 1) {
                this.method126(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
            } else if (this.field173 >= 200) {
                this.method126(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
            } else {
                String var4 = class33.method370(false, class33.method367(0, arg0));
                for (int var5 = 0; var5 < this.field173; ++var5) {
                    if (this.field518[var5] == arg0) {
                        this.method126(0, var4 + " is already on your friend list", "", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field225; ++var6) {
                    if (this.field577[var6] == arg0) {
                        this.method126(0, "Please remove " + var4 + " from your ignore list first", "", 0);
                        return;
                    }
                }
                if (!var4.equals(field299.field129)) {
                    this.field523[this.field173] = var4;
                    this.field518[this.field173] = arg0;
                    if (arg1 != -20952) {
                        this.field623.method214(190);
                    }
                    this.field456[this.field173] = 0;
                    ++this.field173;
                    this.field541 = true;
                    this.field623.method213(-164, 167);
                    this.field623.method220(arg0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILEILHLJCE;B)V")
    private final void method69(int arg0, class17 arg1, byte arg2) {
        this.field357 = 0;
        this.field567 = 0;
        this.method86(arg0, 9848, arg1);
        if (arg2 == 0) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        this.method111(arg0, true, arg1);
        this.method143(arg0, -459, arg1);
        for (int var6 = 0; var6 < this.field357; ++var6) {
            int var8 = this.field358[var6];
            if (field553 != this.field231[var8].field32) {
                this.field231[var8].field1213 = null;
                this.field231[var8] = null;
            }
        }
        if (arg1.field779 != arg0) {
            signlink.reporterror(this.field169 + " size mismatch in getnpcpos - pos:" + arg1.field779 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var7 = 0; var7 < this.field232; ++var7) {
                if (this.field231[this.field233[var7]] == null) {
                    signlink.reporterror(this.field169 + " null entry in npc list - pos:" + var7 + " size:" + this.field232);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method70(int arg0) {
        short var2 = 256;
        if (this.field396 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field396 > 768) {
                    this.field448[var3] = this.method159(this.field450[var3], true, 1024 - this.field396, this.field449[var3]);
                } else if (this.field396 > 256) {
                    this.field448[var3] = this.field450[var3];
                } else {
                    this.field448[var3] = this.method159(this.field449[var3], true, 256 - this.field396, this.field450[var3]);
                }
            }
        } else if (this.field397 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field397 > 768) {
                    this.field448[var4] = this.method159(this.field451[var4], true, 1024 - this.field397, this.field449[var4]);
                } else if (this.field397 > 256) {
                    this.field448[var4] = this.field451[var4];
                } else {
                    this.field448[var4] = this.method159(this.field449[var4], true, 256 - this.field397, this.field451[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field448[var5] = this.field449[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field331.field1402[var6] = this.field381.field1175[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field341[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field458[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field448[var26];
                    int var30 = this.field331.field1402[var8];
                    this.field331.field1402[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field331.method464(false, 0, super.field84, 0);
        if (arg0 != 4) {
            this.method17();
        }
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field332.field1402[var10] = this.field382.field1175[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field341[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field458[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field448[var18];
                    int var22 = this.field332.field1402[var16];
                    this.field332.field1402[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field332.method464(false, 0, super.field84, 637);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method71(int arg0) {
        try {
            if (this.field579 != null) {
                this.field579.method1();
            }
        } catch (Exception var3) {
        }
        this.field579 = null;
        this.field578 = false;
        this.field178 = 0;
        this.field169 = "";
        this.field170 = "";
        if (arg0 == 37121) {
            this.method76(0);
            this.field407.method528((byte) 9);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field385[var2].method200();
            }
            System.gc();
            this.method180(this.field263);
            this.field223 = -1;
            this.field452 = -1;
            this.field522 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public final void method72(byte arg0, String arg1, String arg2) {
        if (arg0 == 9) {
            boolean var4 = false;
        } else {
            this.field434 = this.field222.method224();
        }
        if (this.field490 != null) {
            this.field490.method463((byte) 58);
            class21.field822 = this.field428;
            int var5 = 151;
            if (arg2 != null) {
                var5 -= 7;
            }
            this.field423.method373(0, arg1, 257, var5, 48419);
            this.field423.method373(16777215, arg1, 256, var5 - 1, 48419);
            var5 += 15;
            if (arg2 != null) {
                this.field423.method373(0, arg2, 257, var5, 48419);
                this.field423.method373(16777215, arg2, 256, var5 - 1, 48419);
            }
            this.field490.method464(false, 4, super.field84, 4);
        } else if (super.field85 != null) {
            super.field85.method463((byte) 58);
            class21.field822 = this.field429;
            int var6 = 251;
            short var7 = 300;
            byte var8 = 50;
            class26.method315(0, 383 - var7 / 2, 99, var7, var8, var6 - 5 - var8 / 2);
            class26.method316(var6 - 5 - var8 / 2, var7, 383 - var7 / 2, -110, var8, 16777215);
            if (arg2 != null) {
                var6 -= 7;
            }
            this.field423.method373(0, arg1, 383, var6, 48419);
            this.field423.method373(16777215, arg1, 382, var6 - 1, 48419);
            var6 += 15;
            if (arg2 != null) {
                this.field423.method373(0, arg2, 383, var6, 48419);
                this.field423.method373(16777215, arg2, 382, var6 - 1, 48419);
            }
            super.field85.method464(false, 0, super.field84, 0);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (this.field470 > 1) {
            --this.field470;
        }
        if (this.field437 > 0) {
            --this.field437;
        }
        for (int var2 = 0; var2 < 5 && this.method59(0); ++var2) {
        }
        if (this.field578) {
            Object var3 = this.field242.field1408;
            synchronized (this.field242.field1408) {
                if (!field377) {
                    this.field242.field1410 = 0;
                } else if (super.field98 != 0 || this.field242.field1410 >= 40) {
                    this.field623.method213(-164, 224);
                    this.field623.method214(0);
                    int var4 = this.field623.field779;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field242.field1410 && var4 - this.field623.field779 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field242.field1411[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field242.field1413[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field242.field1411[var6] == -1 && this.field242.field1413[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field550 == var8 && this.field551 == var7) {
                            if (this.field218 < 2047) {
                                ++this.field218;
                            }
                        } else {
                            int var10 = var8 - this.field550;
                            this.field550 = var8;
                            int var11 = var7 - this.field551;
                            this.field551 = var7;
                            if (this.field218 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field623.method215((this.field218 << 12) + (var10 << 6) + var11);
                                this.field218 = 0;
                            } else if (this.field218 < 8) {
                                this.field623.method217((this.field218 << 19) + 8388608 + var9);
                                this.field218 = 0;
                            } else {
                                this.field623.method218((this.field218 << 19) + -1073741824 + var9);
                                this.field218 = 0;
                            }
                        }
                    }
                    this.field623.method223(this.field623.field779 - var4, this.field241);
                    if (var5 >= this.field242.field1410) {
                        this.field242.field1410 = 0;
                    } else {
                        this.field242.field1410 -= var5;
                        for (int var12 = 0; var12 < this.field242.field1410; ++var12) {
                            this.field242.field1413[var12] = this.field242.field1413[var5 + var12];
                            this.field242.field1411[var12] = this.field242.field1411[var5 + var12];
                        }
                    }
                }
            }
            if (super.field98 != 0) {
                long var13 = (super.field101 - this.field298) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field298 = super.field101;
                int var15 = super.field100;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field99;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field98 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field623.method213(-164, 150);
                this.field623.method218((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field482 > 0) {
                --this.field482;
            }
            if (super.field102[1] == 1 || super.field102[2] == 1 || super.field102[3] == 1 || super.field102[4] == 1) {
                this.field483 = true;
            }
            if (this.field483 && this.field482 <= 0) {
                this.field482 = 20;
                this.field483 = false;
                this.field623.method213(-164, 130);
                this.field623.method251(-302, this.field632);
                this.field623.method215(this.field633);
            }
            if (super.field89 && !this.field486) {
                this.field486 = true;
                this.field623.method213(-164, 139);
                this.field623.method214(1);
            }
            if (!super.field89 && this.field486) {
                this.field486 = false;
                this.field623.method213(-164, 139);
                this.field623.method214(0);
            }
            this.method123((byte) 16);
            this.method164((byte) 4);
            this.method122((byte) 8);
            ++this.field435;
            if (this.field435 > 750) {
                this.method125(38851);
            }
            this.method110(3);
            this.method135((byte) 65);
            this.method144(this.field259);
            ++this.field447;
            if (this.field250 != 0) {
                this.field249 += 20;
                if (this.field249 >= 400) {
                    this.field250 = 0;
                }
            }
            if (this.field503 != 0) {
                ++this.field500;
                if (this.field500 >= 15) {
                    if (this.field503 == 2) {
                        this.field541 = true;
                    }
                    if (this.field503 == 3) {
                        this.field642 = true;
                    }
                    this.field503 = 0;
                }
            }
            if (this.field582 != 0) {
                ++this.field444;
                if (super.field92 > this.field583 + 5 || super.field92 < this.field583 - 5 || super.field93 > this.field584 + 5 || super.field93 < this.field584 - 5) {
                    this.field544 = true;
                }
                if (super.field91 == 0) {
                    if (this.field582 == 2) {
                        this.field541 = true;
                    }
                    if (this.field582 == 3) {
                        this.field642 = true;
                    }
                    this.field582 = 0;
                    if (this.field544 && this.field444 >= 5) {
                        this.field532 = -1;
                        this.method158((byte) -53);
                        if (this.field580 == this.field532 && this.field581 != this.field531) {
                            class27 var20 = class27.method329(this.field580);
                            byte var21 = 0;
                            if (this.field410 == 1 && var20.field891 == 206) {
                                var21 = 1;
                            }
                            if (var20.field947[this.field531] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field896) {
                                int var22 = this.field581;
                                int var23 = this.field531;
                                var20.field947[var23] = var20.field947[var22];
                                var20.field909[var23] = var20.field909[var22];
                                var20.field947[var22] = -1;
                                var20.field909[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field581;
                                int var25 = this.field531;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method323(1, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method323(1, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method323(1, this.field531, this.field581);
                            }
                            this.field623.method213(-164, 109);
                            this.field623.method214(var21);
                            this.field623.method250(this.field580, (byte) 0);
                            this.field623.method250(this.field531, (byte) 0);
                            this.field623.method249(-133, this.field581);
                        }
                    } else if ((this.field182 == 1 || this.method77(0, this.field412 - 1)) && this.field412 > 2) {
                        this.method66(543);
                    } else if (this.field412 > 0) {
                        this.method51(this.field412 - 1, -44);
                    }
                    this.field500 = 10;
                    super.field98 = 0;
                }
            }
            if (class68.field1587 != -1) {
                int var26 = class68.field1587;
                int var27 = class68.field1588;
                boolean var28 = this.method155(var26, (byte) 6, var27, 0, 0, field299.field38[0], true, 0, field299.field37[0], 0, 0, 0);
                class68.field1587 = -1;
                if (var28) {
                    this.field247 = super.field99;
                    this.field248 = super.field100;
                    this.field250 = 1;
                    this.field249 = 0;
                }
            }
            if (super.field98 == 1 && this.field321 != null) {
                this.field321 = null;
                this.field642 = true;
                super.field98 = 0;
            }
            this.method127(-813);
            if (this.field631 == -1) {
                this.method81((byte) 7);
                this.method181(8);
                this.method166((byte) 9);
            }
            if (super.field91 == 1 || super.field98 == 1) {
                ++this.field415;
            }
            if (this.field530 == 0 && this.field203 == 0 && this.field302 == 0) {
                if (this.field278 > 0) {
                    --this.field278;
                }
            } else if (this.field278 < 100) {
                ++this.field278;
                if (this.field278 == 100) {
                    if (this.field530 != 0) {
                        this.field642 = true;
                    }
                    if (this.field203 != 0) {
                        this.field541 = true;
                    }
                }
            }
            if (this.field179 == 2) {
                this.method96(0);
            }
            if (this.field179 == 2 && this.field295) {
                this.method154((byte) 8);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field400[var29]++;
            }
            this.method152((byte) 8);
            ++field269;
            if (field269 > 153) {
                field269 = 0;
                this.field623.method213(-164, 1);
                this.field623.method215(26173);
            }
            ++super.field90;
            if (super.field90 > 4500) {
                this.field437 = 250;
                super.field90 -= 500;
                this.field623.method213(-164, 63);
            }
            ++this.field276;
            if (arg0 != 4) {
                this.field623.method214(5);
            }
            if (this.field276 > 500) {
                this.field276 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field287 += this.field288;
                }
                if ((var30 & 2) == 2) {
                    this.field574 += this.field575;
                }
                if ((var30 & 4) == 4) {
                    this.field616 += this.field617;
                }
            }
            if (this.field287 < -50) {
                this.field288 = 2;
            }
            if (this.field287 > 50) {
                this.field288 = -2;
            }
            if (this.field574 < -55) {
                this.field575 = 2;
            }
            if (this.field574 > 55) {
                this.field575 = -2;
            }
            if (this.field616 < -40) {
                this.field617 = 1;
            }
            if (this.field616 > 40) {
                this.field617 = -1;
            }
            ++this.field398;
            if (this.field398 > 500) {
                this.field398 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field323 += this.field324;
                }
                if ((var31 & 2) == 2) {
                    this.field599 += this.field600;
                }
            }
            if (this.field323 < -60) {
                this.field324 = 2;
            }
            if (this.field323 > 60) {
                this.field324 = -2;
            }
            if (this.field599 < -20) {
                this.field600 = 1;
            }
            if (this.field599 > 10) {
                this.field600 = -1;
            }
            ++this.field436;
            if (this.field436 > 50) {
                this.field623.method213(-164, 58);
            }
            try {
                if (this.field579 != null && this.field623.field779 > 0) {
                    this.field579.method5(0, this.field623.field778, this.field623.field779, (byte) 1);
                    this.field623.field779 = 0;
                    this.field436 = 0;
                }
            } catch (IOException var33) {
                this.method125(38851);
            } catch (Exception var34) {
                this.method71(37121);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLEILHLJCE;I)V")
    private final void method74(byte arg0, class17 arg1, int arg2) {
        if (arg0 != 103) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (arg1.field780 + 10 < arg2 * 8) {
            int var5 = arg1.method235(11, 24335);
            if (var5 == 2047) {
                break;
            }
            if (this.field564[var5] == null) {
                this.field564[var5] = new class5();
                if (this.field569[var5] != null) {
                    this.field564[var5].method27(this.field569[var5], this.field342);
                }
            }
            this.field566[this.field565++] = var5;
            class5 var6 = this.field564[var5];
            var6.field32 = field553;
            int var7 = arg1.method235(5, 24335);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method235(1, 24335);
            if (var8 == 1) {
                this.field568[this.field567++] = var5;
            }
            int var9 = arg1.method235(5, 24335);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg1.method235(1, 24335);
            var6.method11(false, field299.field37[0] + var9, field299.field38[0] + var7, var10 == 1);
        }
        arg1.method236(false);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method75(byte arg0) {
        this.field268 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field353) {
                ++this.field226;
                this.method79((byte) 8);
                this.method79((byte) 8);
                this.method70(4);
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
        this.field268 = false;
        if (arg0 == -31) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method76(int arg0) {
        class14.field735.method199();
        class14.field725.method199();
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        class37.field1118.method199();
        class67.field1532.method199();
        class67.field1522.method199();
        class5.field133.method199();
        class55.field1379.method199();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Z")
    public final boolean method77(int arg0, int arg1) {
        this.field433 += arg0;
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field348[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 696;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public void method78(byte arg0) {
        if (arg0 != -34) {
            this.method17();
        }
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field226);
        if (this.field602 != null) {
            System.out.println("Od-cycle:" + this.field602.field1638);
        }
        System.out.println("loop-cycle:" + field553);
        System.out.println("draw-cycle:" + field505);
        System.out.println("ptype:" + this.field434);
        System.out.println("psize:" + this.field433);
        if (this.field579 != null) {
            this.field579.method6((byte) -34);
        }
        super.field81 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method22(boolean arg0) {
        if (!arg0) {
            this.field434 = this.field222.method224();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field87 != null ? super.field87 : this;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method79(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field458[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field458[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field459[var14] = (this.field458[var14 - 1] + this.field458[var14 + 1] + this.field458[var14 - 128] + this.field458[var14 + 128]) / 4;
            }
        }
        this.field561 += 128;
        if (arg0 != 8) {
            this.field434 = -1;
        }
        if (this.field561 > this.field216.length) {
            this.field561 -= this.field216.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method65(0, this.field383[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field459[var11 + 128] - this.field216[this.field561 + var11 & this.field216.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field458[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field341[var8] = this.field341[var8 + 1];
        }
        this.field341[var2 - 1] = (int) (Math.sin((double) field553 / 14.0D) * 16.0D + Math.sin((double) field553 / 15.0D) * 14.0D + Math.sin((double) field553 / 16.0D) * 12.0D);
        if (this.field396 > 0) {
            this.field396 -= 4;
        }
        if (this.field397 > 0) {
            this.field397 -= 4;
        }
        if (this.field396 == 0 && this.field397 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field396 = 1024;
            }
            if (var9 == 1) {
                this.field397 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.field257 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field389[var2] = -1;
            for (int var3 = 0; var3 < class54.field1356; ++var3) {
                if (!class54.field1357[var3].field1363 && class54.field1357[var3].field1358 == var2 + (this.field613 ? 0 : 7)) {
                    this.field389[var2] = var3;
                    break;
                }
            }
        }
        while (arg0 >= 0) {
            this.field623.method214(235);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method81(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.method17();
        }
        if (this.field594 == 0) {
            if (super.field98 == 1) {
                int var3 = super.field99 - 25 - 550;
                int var4 = super.field100 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field633 + this.field323 & 2047;
                    int var6 = class21.field820[var5];
                    int var7 = class21.field821[var5];
                    int var8 = (this.field599 + 256) * var6 >> 8;
                    int var9 = (this.field599 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field299.field67 + var10 >> 7;
                    int var13 = field299.field68 - var11 >> 7;
                    boolean var14 = this.method155(var12, (byte) 6, var13, 1, 0, field299.field38[0], true, 0, field299.field37[0], 0, 0, 0);
                    if (var14) {
                        this.field623.method214(var3);
                        this.field623.method214(var4);
                        this.field623.method215(this.field633);
                        this.field623.method214(57);
                        this.field623.method214(this.field323);
                        this.field623.method214(this.field599);
                        this.field623.method214(89);
                        this.field623.method215(field299.field67);
                        this.field623.method215(field299.field68);
                        this.field623.method214(this.field414);
                        this.field623.method214(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIIIIIII)V")
    private final void method82(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class23 var11 = null;
        for (class23 var12 = (class23) this.field525.method275(); var12 != null; var12 = (class23) this.field525.method277(4)) {
            if (var12.field852 == arg3 && var12.field854 == arg2 && var12.field855 == arg0 && var12.field853 == arg4) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class23();
            var11.field852 = arg3;
            var11.field853 = arg4;
            var11.field854 = arg2;
            var11.field855 = arg0;
            this.method160(-905, var11);
            this.field525.method272(var11);
        }
        var11.field845 = arg5;
        var11.field847 = arg9;
        var11.field846 = arg6;
        if (arg1 == 1) {
            var11.field856 = arg8;
            var11.field851 = arg7;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)I")
    public final int method83(byte arg0) {
        if (this.field455 != arg0) {
            this.field289 = 101;
        }
        int var2 = 3;
        if (this.field187 < 310) {
            int var3 = this.field184 >> 7;
            int var4 = this.field186 >> 7;
            int var5 = field299.field67 >> 7;
            int var6 = field299.field68 >> 7;
            if ((this.field238[this.field180][var3][var4] & 4) != 0) {
                var2 = this.field180;
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
                    if ((this.field238[this.field180][var3][var4] & 4) != 0) {
                        var2 = this.field180;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field238[this.field180][var3][var4] & 4) != 0) {
                            var2 = this.field180;
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
                    if ((this.field238[this.field180][var3][var4] & 4) != 0) {
                        var2 = this.field180;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field238[this.field180][var3][var4] & 4) != 0) {
                            var2 = this.field180;
                        }
                    }
                }
            }
        }
        if ((this.field238[this.field180][field299.field67 >> 7][field299.field68 >> 7] & 4) != 0) {
            var2 = this.field180;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)I")
    public final int method84(boolean arg0) {
        if (!arg0) {
            this.field406 = null;
        }
        int var2 = this.method129(this.field184, this.field186, (byte) 111, this.field180);
        return var2 - this.field185 < 800 && (this.field238[this.field180][this.field184 >> 7][this.field186 >> 7] & 4) != 0 ? this.field180 : 3;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method85(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILEILHLJCE;)V")
    private final void method86(int arg0, int arg1, class17 arg2) {
        arg2.method234(true);
        if (arg1 != 9848) {
            this.field443 = -307;
        }
        int var4 = arg2.method235(8, 24335);
        if (var4 < this.field232) {
            for (int var5 = var4; var5 < this.field232; ++var5) {
                this.field358[this.field357++] = this.field233[var5];
            }
        }
        if (var4 > this.field232) {
            signlink.reporterror(this.field169 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field232 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field233[var6];
                class43 var8 = this.field231[var7];
                int var9 = arg2.method235(1, 24335);
                if (var9 == 0) {
                    this.field233[this.field232++] = var7;
                    var8.field32 = field553;
                } else {
                    int var10 = arg2.method235(2, 24335);
                    if (var10 == 0) {
                        this.field233[this.field232++] = var7;
                        var8.field32 = field553;
                        this.field568[this.field567++] = var7;
                    } else if (var10 == 1) {
                        this.field233[this.field232++] = var7;
                        var8.field32 = field553;
                        int var11 = arg2.method235(3, 24335);
                        var8.method8(var11, false, true);
                        int var12 = arg2.method235(1, 24335);
                        if (var12 == 1) {
                            this.field568[this.field567++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field233[this.field232++] = var7;
                        var8.field32 = field553;
                        int var13 = arg2.method235(3, 24335);
                        var8.method8(var13, true, true);
                        int var14 = arg2.method235(3, 24335);
                        var8.method8(var14, true, true);
                        int var15 = arg2.method235(1, 24335);
                        if (var15 == 1) {
                            this.field568[this.field567++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field358[this.field357++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method87(int arg0, int arg1) {
        int[] var3 = this.field440.field1175;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field238[arg1][var24][var6] & 24) == 0) {
                    this.field407.method563(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field238[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field407.method563(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field440.method399((byte) 58);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field238[arg1][var22][var9] & 24) == 0) {
                    this.method97(var7, (byte) 30, arg1, var9, var22, var8);
                }
                if (arg1 < 3 && (this.field238[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method97(var7, (byte) 30, arg1 + 1, var9, var22, var8);
                }
            }
        }
        if (this.field490 != null) {
            this.field490.method463((byte) 58);
            class21.field822 = this.field428;
        }
        this.field361 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field407.method557(this.field180, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class14.method192(var13).field721;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field385[this.field180].field761;
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
                        this.field373[this.field361] = this.field384[var14];
                        this.field362[this.field361] = var15;
                        this.field363[this.field361] = var16;
                        ++this.field361;
                    }
                }
            }
        }
        if (arg0 <= 0) {
            this.field261 = this.field625.method580();
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method88(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field623.method213(-164, 211);
        if (this.field519 != -1) {
            this.method146(this.field519, true);
            this.field519 = -1;
            this.field541 = true;
            this.field446 = false;
            this.field264 = true;
        }
        if (this.field499 != -1) {
            this.method146(this.field499, true);
            this.field499 = -1;
            this.field642 = true;
            this.field446 = false;
        }
        if (this.field631 != -1) {
            this.method146(this.field631, true);
            this.field631 = -1;
            this.field399 = true;
        }
        if (this.field275 != -1) {
            this.method146(this.field275, true);
            this.field275 = -1;
        }
        if (this.field265 != -1) {
            this.method146(this.field265, true);
            this.field265 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method19(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field579 != null) {
                this.field579.method1();
            }
        } catch (Exception var3) {
        }
        this.field579 = null;
        this.method180(this.field263);
        if (this.field242 != null) {
            this.field242.field1412 = false;
        }
        this.field242 = null;
        this.field602.method603();
        this.field602 = null;
        this.field230 = null;
        this.field623 = null;
        this.field621 = null;
        this.field222 = null;
        this.field189 = null;
        this.field416 = null;
        this.field305 = null;
        this.field190 = null;
        this.field191 = null;
        this.field622 = null;
        this.field238 = null;
        this.field407 = null;
        this.field385 = null;
        this.field520 = null;
        this.field542 = null;
        this.field175 = null;
        this.field176 = null;
        this.field471 = null;
        this.field488 = null;
        this.field489 = null;
        this.field490 = null;
        this.field491 = null;
        this.field318 = null;
        this.field319 = null;
        this.field320 = null;
        this.field204 = null;
        this.field205 = null;
        this.field206 = null;
        this.field207 = null;
        this.field208 = null;
        this.field209 = null;
        this.field210 = null;
        this.field211 = null;
        this.field212 = null;
        this.field430 = null;
        this.field431 = null;
        this.field432 = null;
        this.field475 = null;
        this.field476 = null;
        this.field477 = null;
        this.field495 = null;
        this.field535 = null;
        this.field536 = null;
        this.field537 = null;
        this.field538 = null;
        this.field539 = null;
        this.field417 = null;
        this.field418 = null;
        this.field419 = null;
        this.field420 = null;
        this.field421 = null;
        this.field644 = null;
        this.field645 = null;
        this.field301 = null;
        this.field366 = null;
        this.field351 = null;
        this.field364 = null;
        this.field163 = null;
        this.field196 = null;
        this.field197 = null;
        this.field198 = null;
        this.field199 = null;
        this.field200 = null;
        this.field304 = null;
        this.field384 = null;
        this.field409 = null;
        this.field564 = null;
        this.field566 = null;
        this.field568 = null;
        this.field569 = null;
        this.field358 = null;
        this.field231 = null;
        this.field233 = null;
        this.field406 = null;
        this.field525 = null;
        this.field260 = null;
        this.field308 = null;
        this.field346 = null;
        this.field347 = null;
        this.field348 = null;
        this.field349 = null;
        this.field273 = null;
        this.field643 = null;
        this.field362 = null;
        this.field363 = null;
        this.field373 = null;
        this.field440 = null;
        this.field523 = null;
        this.field518 = null;
        this.field456 = null;
        this.field331 = null;
        this.field332 = null;
        this.field328 = null;
        this.field329 = null;
        this.field330 = null;
        this.field333 = null;
        this.field334 = null;
        this.field335 = null;
        this.field336 = null;
        this.method60(978);
        class14.method193(0);
        class37.method394(0);
        class67.method519(0);
        class27.method327(0);
        class52.field1338 = null;
        class54.field1357 = null;
        class9.field152 = null;
        class41.field1184 = null;
        class55.field1367 = null;
        class55.field1379 = null;
        class28.field963 = null;
        super.field85 = null;
        class5.field133 = null;
        class21.method280(0);
        class68.method527(0);
        class31.method335(0);
        class25.method307(0);
        System.gc();
        int var2 = 78 / arg0;
        if (class30.field987) {
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method89(int arg0) {
        Graphics var2 = this.method22(true).getGraphics();
        var2.setColor(Color.black);
        if (arg0 < 0) {
            var2.fillRect(0, 0, 765, 503);
            this.method15(false, 1);
            if (this.field508) {
                this.field353 = false;
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
            if (this.field408) {
                this.field353 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field543) {
                this.field353 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg1 & 2047;
        int var9 = 2048 - arg3 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (arg2 == 8) {
            if (var8 != 0) {
                int var13 = class31.field1063[var8];
                int var14 = class31.field1064[var8];
                int var15 = var11 * var14 - arg4 * var13 >> 16;
                var12 = var11 * var13 + arg4 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = class31.field1063[var9];
                int var17 = class31.field1064[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field184 = arg0 - var10;
            this.field185 = arg6 - var11;
            this.field186 = arg5 - var12;
            this.field187 = arg1;
            this.field188 = arg3;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method91(int arg0) {
        class47 var2 = (class47) this.field260.method275();
        if (arg0 != 623) {
            this.field406 = null;
        }
        while (var2 != null) {
            if (this.field180 == var2.field1281 && field553 <= var2.field1297) {
                if (field553 >= var2.field1296) {
                    if (var2.field1288 > 0) {
                        class43 var3 = this.field231[var2.field1288 - 1];
                        if (var3 != null && var3.field67 >= 0 && var3.field67 < 13312 && var3.field68 >= 0 && var3.field68 < 13312) {
                            var2.method437(var3.field68, field553, false, var3.field67, this.method129(var3.field67, var3.field68, (byte) 111, var2.field1281) - var2.field1277);
                        }
                    }
                    if (var2.field1288 < 0) {
                        int var4 = -var2.field1288 - 1;
                        class5 var5;
                        if (this.field556 == var4) {
                            var5 = field299;
                        } else {
                            var5 = this.field564[var4];
                        }
                        if (var5 != null && var5.field67 >= 0 && var5.field67 < 13312 && var5.field68 >= 0 && var5.field68 < 13312) {
                            var2.method437(var5.field68, field553, false, var5.field67, this.method129(var5.field67, var5.field68, (byte) 111, var2.field1281) - var2.field1277);
                        }
                    }
                    var2.method438(0, this.field447);
                    this.field407.method539((int) var2.field1278, var2.field1293, this.field180, (int) var2.field1279, true, 60, var2, (int) var2.field1280, false, -1);
                }
            } else {
                var2.method334();
            }
            var2 = (class47) this.field260.method277(4);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILEILHLJCE;I)V")
    private final void method92(int arg0, class17 arg1, int arg2) {
        this.field357 = 0;
        this.field567 = 0;
        this.method165(arg1, arg2, (byte) -24);
        this.method150(arg2, 0, arg1);
        if (arg0 < 0) {
            this.method74((byte) 103, arg1, arg2);
            this.method172(arg1, (byte) 8, arg2);
            for (int var4 = 0; var4 < this.field357; ++var4) {
                int var6 = this.field358[var4];
                if (field553 != this.field564[var6].field32) {
                    this.field564[var6] = null;
                }
            }
            if (arg1.field779 != arg2) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field779 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field565; ++var5) {
                    if (this.field564[this.field566[var5]] == null) {
                        signlink.reporterror(this.field169 + " null entry in pl list - pos:" + var5 + " size:" + this.field565);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method93(int arg0, byte arg1) {
        class27 var3 = class27.method329(arg0);
        for (int var4 = 0; var4 < var3.field911.length && var3.field911[var4] != -1; ++var4) {
            class27 var5 = class27.method329(var3.field911[var4]);
            if (var5.field922 == 1) {
                this.method93(var5.field914, (byte) 5);
            }
            var5.field948 = 0;
            var5.field959 = 0;
        }
        if (arg1 != 5) {
            this.field527 = -388;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method94(int arg0) {
        ++this.field297;
        this.method67(true, 1);
        this.method163(true, 0);
        this.method67(false, 1);
        this.method163(false, 0);
        this.method91(623);
        this.method168(-767);
        if (!this.field295) {
            int var2 = this.field632;
            if (this.field325 / 256 > var2) {
                var2 = this.field325 / 256;
            }
            if (this.field345[4] && this.field534[4] + 128 > var2) {
                var2 = this.field534[4] + 128;
            }
            int var3 = this.field633 + this.field616 & 2047;
            this.method90(this.field480, var2, 8, var3, var2 * 3 + 600, this.field481, this.method129(field299.field67, field299.field68, (byte) 111, this.field180) - 50);
        }
        int var4;
        if (!this.field295) {
            var4 = this.method83((byte) 4);
        } else {
            var4 = this.method84(true);
        }
        int var5 = this.field184;
        int var6 = this.field185;
        int var7 = this.field186;
        int var8 = this.field187;
        int var9 = this.field188;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field345[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field592[var10] * 2 + 1) - (double) this.field592[var10] + Math.sin((double) this.field183[var10] / 100.0D * (double) this.field400[var10]) * (double) this.field534[var10]);
                if (var10 == 0) {
                    this.field184 += var12;
                }
                if (var10 == 1) {
                    this.field185 += var12;
                }
                if (var10 == 2) {
                    this.field186 += var12;
                }
                if (var10 == 3) {
                    this.field188 = this.field188 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field187 += var12;
                    if (this.field187 < 128) {
                        this.field187 = 128;
                    }
                    if (this.field187 > 383) {
                        this.field187 = 383;
                    }
                }
            }
        }
        int var11 = class21.field831;
        class31.field1058 = true;
        class31.field1061 = 0;
        class31.field1059 = super.field92 - 4;
        class31.field1060 = super.field93 - 4;
        class26.method313(805);
        this.field407.method567(this.field185, this.field184, this.field186, var4, 5696, this.field187, this.field188);
        this.field407.method542((byte) -22);
        this.method147(-670);
        this.method169(false);
        this.method54((byte) 7, var11);
        this.method153(this.field359);
        this.field490.method464(false, 4, super.field84, 4);
        this.field184 = var5;
        this.field185 = var6;
        this.field186 = var7;
        this.field187 = var8;
        while (arg0 >= 0) {
            this.field605 = this.field625.method580();
        }
        this.field188 = var9;
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method95(int arg0) {
        this.field253 = new class19(this.field322, "titlebox", 0);
        while (arg0 >= 0) {
            this.field623.method214(204);
        }
        this.field254 = new class19(this.field322, "titlebutton", 0);
        this.field383 = new class19[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field383[var2] = new class19(this.field322, "runes", var2);
        }
        this.field381 = new class40(128, 265);
        this.field382 = new class40(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field381.field1175[var3] = this.field331.field1402[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field382.field1175[var4] = this.field332.field1402[var4];
        }
        this.field449 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field449[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field449[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field449[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field449[var8 + 192] = 16777215;
        }
        this.field450 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field450[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field450[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field450[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field450[var12 + 192] = 16777215;
        }
        this.field451 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field451[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field451[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field451[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field451[var16 + 192] = 16777215;
        }
        this.field448 = new int[256];
        this.field216 = new int[32768];
        this.field217 = new int[32768];
        this.method65(0, (class19) null);
        this.field458 = new int[32768];
        this.field459 = new int[32768];
        this.method24("Connecting to fileserver", (byte) 8, 10);
        if (!this.field353) {
            this.field262 = true;
            this.field353 = true;
            this.method23(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method96(int arg0) {
        if (arg0 != 0) {
            this.field623.method214(206);
        }
        try {
            int var2 = field299.field67 + this.field287;
            int var3 = field299.field68 + this.field574;
            if (this.field480 - var2 < -500 || this.field480 - var2 > 500 || this.field481 - var3 < -500 || this.field481 - var3 > 500) {
                this.field480 = var2;
                this.field481 = var3;
            }
            if (this.field480 != var2) {
                this.field480 += (var2 - this.field480) / 16;
            }
            if (this.field481 != var3) {
                this.field481 += (var3 - this.field481) / 16;
            }
            if (super.field102[1] == 1) {
                this.field634 += (-24 - this.field634) / 2;
            } else if (super.field102[2] == 1) {
                this.field634 += (24 - this.field634) / 2;
            } else {
                this.field634 /= 2;
            }
            if (super.field102[3] == 1) {
                this.field635 += (12 - this.field635) / 2;
            } else if (super.field102[4] == 1) {
                this.field635 += (-12 - this.field635) / 2;
            } else {
                this.field635 /= 2;
            }
            this.field633 = this.field634 / 2 + this.field633 & 2047;
            this.field632 += this.field635 / 2;
            if (this.field632 < 128) {
                this.field632 = 128;
            }
            if (this.field632 > 383) {
                this.field632 = 383;
            }
            int var4 = this.field480 >> 7;
            int var5 = this.field481 >> 7;
            int var6 = this.method129(this.field480, this.field481, (byte) 111, this.field180);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field180;
                        if (var10 < 3 && (this.field238[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field622[var10][var8][var9];
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
            if (var12 > this.field325) {
                this.field325 += (var12 - this.field325) / 24;
            } else if (var12 < this.field325) {
                this.field325 += (var12 - this.field325) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field299.field67 + "," + field299.field68 + "," + this.field480 + "," + this.field481 + "," + this.field472 + "," + this.field473 + "," + this.field609 + "," + this.field610);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIII)V")
    public final void method97(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 30) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        int var8 = this.field407.method554(arg2, arg4, arg3);
        if (var8 != 0) {
            int var9 = this.field407.method558(arg2, arg4, arg3, var8);
            int var10 = var9 >> 6 & 3;
            int var11 = var9 & 31;
            int var12 = arg0;
            if (var8 > 0) {
                var12 = arg5;
            }
            int[] var13 = this.field440.field1175;
            int var14 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
            int var15 = var8 >> 14 & 32767;
            class14 var16 = class14.method192(var15);
            if (var16.field733 != -1) {
                class19 var17 = this.field304[var16.field733];
                if (var17 != null) {
                    int var18 = (var16.field708 * 4 - var17.field800) / 2;
                    int var19 = (var16.field703 * 4 - var17.field801) / 2;
                    var17.method270(arg4 * 4 + 48 + var18, this.field527, (104 - arg3 - var16.field703) * 4 + 48 + var19);
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
        int var20 = this.field407.method556(arg2, arg4, arg3);
        if (var20 != 0) {
            int var21 = this.field407.method558(arg2, arg4, arg3, var20);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var20 >> 14 & 32767;
            class14 var25 = class14.method192(var24);
            if (var25.field733 != -1) {
                class19 var26 = this.field304[var25.field733];
                if (var26 != null) {
                    int var27 = (var25.field708 * 4 - var26.field800) / 2;
                    int var28 = (var25.field703 * 4 - var26.field801) / 2;
                    var26.method270(arg4 * 4 + 48 + var27, this.field527, (104 - arg3 - var25.field703) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var20 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field440.field1175;
                int var31 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
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
        int var32 = this.field407.method557(arg2, arg4, arg3);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            class14 var34 = class14.method192(var33);
            if (var34.field733 != -1) {
                class19 var35 = this.field304[var34.field733];
                if (var35 != null) {
                    int var36 = (var34.field708 * 4 - var35.field800) / 2;
                    int var37 = (var34.field703 * 4 - var35.field801) / 2;
                    var35.method270(arg4 * 4 + 48 + var36, this.field527, (104 - arg3 - var34.field703) * 4 + 48 + var37);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method20(int arg0) {
        if (!this.field543 && !this.field508 && !this.field408) {
            ++field505;
            if (!this.field578) {
                this.method149(false, 326);
            } else {
                this.method142(-45619);
            }
            this.field415 = 0;
            if (arg0 != -26684) {
                this.field434 = this.field222.method224();
            }
        } else {
            this.method89(-453);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 349);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field234 = Integer.parseInt(arg0[0]);
                field235 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method130(15665);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method171(-229);
                }
                if (arg0[3].equals("free")) {
                    field236 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field236 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method12(765, (byte) 9, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILAWOZVMFS;I)V")
    public final void method98(int arg0, int arg1, int arg2, class5 arg3, int arg4) {
        if (field299 != arg3) {
            if (this.field412 < 400) {
                if (arg4 != 3) {
                    this.field406 = null;
                }
                String var6;
                if (arg3.field114 == 0) {
                    var6 = arg3.field129 + method104(arg3.field121, (byte) 28, field299.field121) + " (level-" + arg3.field121 + ")";
                } else {
                    var6 = arg3.field129 + " (skill-" + arg3.field114 + ")";
                }
                if (this.field545 == 1) {
                    this.field273[this.field412] = "Use " + this.field549 + " with @whi@" + var6;
                    this.field348[this.field412] = 703;
                    this.field349[this.field412] = arg1;
                    this.field346[this.field412] = arg0;
                    this.field347[this.field412] = arg2;
                    ++this.field412;
                } else if (this.field636 == 1) {
                    if ((this.field638 & 8) == 8) {
                        this.field273[this.field412] = this.field639 + " @whi@" + var6;
                        this.field348[this.field412] = 621;
                        this.field349[this.field412] = arg1;
                        this.field346[this.field412] = arg0;
                        this.field347[this.field412] = arg2;
                        ++this.field412;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field595[var7] != null) {
                            this.field273[this.field412] = this.field595[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field595[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field121 > field299.field121) {
                                    var9 = 2000;
                                }
                                if (field299.field130 != 0 && arg3.field130 != 0) {
                                    if (field299.field130 == arg3.field130) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field596[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field348[this.field412] = var9 + 883;
                            }
                            if (var7 == 1) {
                                this.field348[this.field412] = var9 + 145;
                            }
                            if (var7 == 2) {
                                this.field348[this.field412] = var9 + 359;
                            }
                            if (var7 == 3) {
                                this.field348[this.field412] = var9 + 896;
                            }
                            if (var7 == 4) {
                                this.field348[this.field412] = var9 + 233;
                            }
                            this.field349[this.field412] = arg1;
                            this.field346[this.field412] = arg0;
                            this.field347[this.field412] = arg2;
                            ++this.field412;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field412; ++var8) {
                    if (this.field348[var8] == 16) {
                        this.field273[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIRYXZZFE;Z)Z")
    public final boolean method99(class27 arg0, boolean arg1) {
        int var3 = arg0.field891;
        if (arg1) {
            this.field434 = this.field222.method224();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field273[this.field412] = "Remove @whi@" + arg0.field918;
                this.field348[this.field412] = 212;
                ++this.field412;
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
            this.field273[this.field412] = "Remove @whi@" + this.field523[var3];
            this.field348[this.field412] = 526;
            ++this.field412;
            this.field273[this.field412] = "Message @whi@" + this.field523[var3];
            this.field348[this.field412] = 247;
            ++this.field412;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field87 != null) {
                    return new URL("http://127.0.0.1:" + (field235 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method100(int arg0) {
        if (this.field243 != 0) {
            class34 var2 = this.field423;
            if (arg0 <= 0) {
                this.field443 = this.field625.method580();
            }
            int var3 = 0;
            if (this.field470 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field560[var4] != null) {
                    int var5 = this.field558[var4];
                    String var6 = this.field559[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field355 == 0 || this.field355 == 1 && this.method179(var6, 4))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method377("From", var8, var9, 0, 0);
                        var2.method377("From", var8 - 1, var9, 0, 65535);
                        int var10 = var9 + var2.method375("From ", true);
                        if (var7 == 1) {
                            this.field493[0].method270(var10, this.field527, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field493[1].method270(var10, this.field527, var8 - 12);
                            var10 += 14;
                        }
                        var2.method377(var6 + ": " + this.field560[var4], var8, var10, 0, 0);
                        var2.method377(var6 + ": " + this.field560[var4], var8 - 1, var10, 0, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field355 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method377(this.field560[var4], var11, 4, 0, 0);
                        var2.method377(this.field560[var4], var11 - 1, 4, 0, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field355 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method377("To " + var6 + ": " + this.field560[var4], var12, 4, 0, 0);
                        var2.method377("To " + var6 + ": " + this.field560[var4], var12 - 1, 4, 0, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method101(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 14 & 32767;
        int var6 = this.field407.method558(this.field180, arg1, arg3, arg2);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            ++field590;
            if (field590 > 1184) {
                field590 = 0;
                this.field623.method213(-164, 127);
                this.field623.method214(0);
                int var9 = this.field623.field779;
                this.field623.method215(8709);
                this.field623.method215(18795);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field623.method214(235);
                }
                this.field623.method214(38);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field623.method215(55800);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field623.method215(42667);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field623.method214(1);
                }
                this.field623.method214(163);
                this.field623.method215(42960);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field623.method214(194);
                }
                this.field623.method223(this.field623.field779 - var9, this.field241);
            }
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method155(arg1, (byte) 6, arg3, 2, 0, field299.field38[0], false, 0, field299.field37[0], var8, 0, var7 + 1);
            } else {
                class14 var10 = class14.method192(var5);
                int var11;
                int var12;
                if (var8 != 0 && var8 != 2) {
                    var11 = var10.field703;
                    var12 = var10.field708;
                } else {
                    var11 = var10.field708;
                    var12 = var10.field703;
                }
                int var13 = var10.field737;
                if (var8 != 0) {
                    var13 = (var13 >> 4 - var8) + (var13 << var8 & 15);
                }
                this.method155(arg1, (byte) 6, arg3, 2, var12, field299.field38[0], false, var13, field299.field37[0], 0, var11, 0);
            }
            this.field247 = super.field99;
            if (arg0 != 1) {
                this.field214 = -459;
            }
            this.field248 = super.field100;
            this.field250 = 2;
            this.field249 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILAPSQOGBV;)V")
    public final void method102(int arg0, int arg1, class3 arg2) {
        if (arg0 != -14612) {
            this.field623.method214(197);
        }
        this.method103(4, arg2.field68, arg1, arg2.field67);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method103(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
            int var5 = this.method129(arg3, arg1, (byte) 111, this.field180) - arg2;
            int var6 = arg3 - this.field184;
            int var7 = var5 - this.field185;
            int var8 = arg1 - this.field186;
            int var9 = class31.field1063[this.field187];
            int var10 = class31.field1064[this.field187];
            int var11 = class31.field1063[this.field188];
            int var12 = class31.field1064[this.field188];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            if (arg0 != 4) {
                this.field434 = -1;
            }
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field390 = (var13 << 9) / var17 + class21.field816;
                this.field391 = (var16 << 9) / var17 + class21.field817;
            } else {
                this.field390 = -1;
                this.field391 = -1;
            }
        } else {
            this.field390 = -1;
            this.field391 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method104(int arg0, byte arg1, int arg2) {
        if (field215 != arg1) {
            throw new NullPointerException();
        } else {
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
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method105(int arg0) {
        if (this.field491 == null) {
            this.method60(978);
            super.field85 = null;
            this.field328 = null;
            this.field329 = null;
            this.field330 = null;
            this.field331 = null;
            this.field332 = null;
            this.field333 = null;
            this.field334 = null;
            this.field335 = null;
            if (arg0 != 0) {
                this.field406 = null;
            }
            this.field336 = null;
            this.field491 = new class58(479, false, this.method22(true), 96);
            this.field489 = new class58(172, false, this.method22(true), 156);
            class26.method313(805);
            this.field431.method270(0, this.field527, 0);
            this.field488 = new class58(190, false, this.method22(true), 261);
            this.field490 = new class58(512, false, this.method22(true), 334);
            class26.method313(805);
            this.field318 = new class58(496, false, this.method22(true), 50);
            this.field319 = new class58(269, false, this.method22(true), 37);
            this.field320 = new class58(249, false, this.method22(true), 45);
            this.field399 = true;
            this.field490.method463((byte) 58);
            class21.field822 = this.field428;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILNPWLDXJE;II)V")
    public final void method106(boolean arg0, int arg1, class37 arg2, int arg3, int arg4) {
        if (!arg0) {
            this.field274 = !this.field274;
        }
        if (this.field412 < 400) {
            if (arg2.field1119 != null) {
                arg2 = arg2.method389((byte) 108);
            }
            if (arg2 != null) {
                if (arg2.field1128) {
                    String var6 = arg2.field1142;
                    if (arg2.field1137 != 0) {
                        var6 = var6 + method104(arg2.field1137, (byte) 28, field299.field121) + " (level-" + arg2.field1137 + ")";
                    }
                    if (this.field545 == 1) {
                        this.field273[this.field412] = "Use " + this.field549 + " with @yel@" + var6;
                        this.field348[this.field412] = 646;
                        this.field349[this.field412] = arg1;
                        this.field346[this.field412] = arg4;
                        this.field347[this.field412] = arg3;
                        ++this.field412;
                    } else {
                        if (this.field636 == 1) {
                            if ((this.field638 & 2) == 2) {
                                this.field273[this.field412] = this.field639 + " @yel@" + var6;
                                this.field348[this.field412] = 403;
                                this.field349[this.field412] = arg1;
                                this.field346[this.field412] = arg4;
                                this.field347[this.field412] = arg3;
                                ++this.field412;
                                return;
                            }
                        } else {
                            if (arg2.field1133 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg2.field1133[var7] != null && !arg2.field1133[var7].equalsIgnoreCase("attack")) {
                                        this.field273[this.field412] = arg2.field1133[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field348[this.field412] = 447;
                                        }
                                        if (var7 == 1) {
                                            this.field348[this.field412] = 24;
                                        }
                                        if (var7 == 2) {
                                            this.field348[this.field412] = 851;
                                        }
                                        if (var7 == 3) {
                                            this.field348[this.field412] = 515;
                                        }
                                        if (var7 == 4) {
                                            this.field348[this.field412] = 983;
                                        }
                                        this.field349[this.field412] = arg1;
                                        this.field346[this.field412] = arg4;
                                        this.field347[this.field412] = arg3;
                                        ++this.field412;
                                    }
                                }
                            }
                            if (arg2.field1133 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field1133[var8] != null && arg2.field1133[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg2.field1137 > field299.field121) {
                                            var9 = 2000;
                                        }
                                        this.field273[this.field412] = arg2.field1133[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field348[this.field412] = var9 + 447;
                                        }
                                        if (var8 == 1) {
                                            this.field348[this.field412] = var9 + 24;
                                        }
                                        if (var8 == 2) {
                                            this.field348[this.field412] = var9 + 851;
                                        }
                                        if (var8 == 3) {
                                            this.field348[this.field412] = var9 + 515;
                                        }
                                        if (var8 == 4) {
                                            this.field348[this.field412] = var9 + 983;
                                        }
                                        this.field349[this.field412] = arg1;
                                        this.field346[this.field412] = arg4;
                                        this.field347[this.field412] = arg3;
                                        ++this.field412;
                                    }
                                }
                            }
                            this.field273[this.field412] = "Examine @yel@" + var6;
                            this.field348[this.field412] = 1335;
                            this.field349[this.field412] = arg1;
                            this.field346[this.field412] = arg4;
                            this.field347[this.field412] = arg3;
                            ++this.field412;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)Ljava/lang/String;")
    public final String method107(int arg0, byte arg1) {
        if (arg1 != 93) {
            this.field290 = !this.field290;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IBI)LBBMKAXRK;")
    public final class6 method108(String arg0, int arg1, String arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -64) {
            throw new NullPointerException();
        } else {
            byte[] var7 = null;
            int var8 = 5;
            try {
                if (this.field554[0] != null) {
                    var7 = this.field554[0].method31(arg5, (byte) -50);
                }
            } catch (Exception var30) {
            }
            if (var7 != null) {
                this.field172.reset();
                this.field172.update(var7);
                int var9 = (int) this.field172.getValue();
                if (arg1 != var9) {
                    var7 = null;
                }
            }
            if (var7 != null) {
                return new class6((byte) 70, var7);
            } else {
                int var11 = 0;
                while (var7 == null) {
                    String var12 = "Unknown error";
                    this.method24("Requesting " + arg0, (byte) 8, arg3);
                    Object var13 = null;
                    try {
                        int var14 = 0;
                        DataInputStream var15 = this.method121(arg2 + arg1);
                        byte[] var16 = new byte[6];
                        var15.readFully(var16, 0, 6);
                        class17 var17 = new class17(var16, -26583);
                        var17.field779 = 3;
                        int var18 = var17.method228() + 6;
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
                                this.method24("Loading " + arg0 + " - " + var23 + "%", (byte) 8, arg3);
                            }
                            var14 = var23;
                        }
                        var15.close();
                        try {
                            if (this.field554[0] != null) {
                                this.field554[0].method32(var7.length, var7, (byte) -5, arg5);
                            }
                        } catch (Exception var29) {
                            this.field554[0] = null;
                        }
                        if (var7 != null) {
                            this.field172.reset();
                            this.field172.update(var7);
                            int var24 = (int) this.field172.getValue();
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
                                this.method24("Game updated - please reload page", (byte) 8, arg3);
                                var26 = 10;
                            } else {
                                this.method24(var12 + " - Retrying in " + var26, (byte) 8, arg3);
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
                        this.field511 = !this.field511;
                    }
                }
                return new class6((byte) 70, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (this.field328 == null) {
            super.field85 = null;
            this.field491 = null;
            this.field489 = null;
            this.field488 = null;
            this.field490 = null;
            this.field318 = null;
            this.field319 = null;
            this.field320 = null;
            this.field331 = new class58(128, false, this.method22(true), 265);
            class26.method313(805);
            this.field332 = new class58(128, false, this.method22(true), 265);
            class26.method313(805);
            this.field328 = new class58(509, false, this.method22(true), 171);
            class26.method313(805);
            this.field329 = new class58(360, false, this.method22(true), 132);
            class26.method313(805);
            this.field330 = new class58(360, false, this.method22(true), 200);
            class26.method313(805);
            this.field333 = new class58(202, false, this.method22(true), 238);
            class26.method313(805);
            this.field334 = new class58(203, false, this.method22(true), 238);
            class26.method313(805);
            this.field335 = new class58(74, false, this.method22(true), 94);
            class26.method313(805);
            this.field336 = new class58(75, false, this.method22(true), 94);
            if (arg0 <= 0) {
                this.field434 = -1;
            }
            class26.method313(805);
            if (this.field322 != null) {
                this.method120(-324);
                this.method95(-909);
            }
            this.field399 = true;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method110(int arg0) {
        for (int var2 = -1; var2 < this.field565; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field563;
            } else {
                var3 = this.field566[var2];
            }
            class5 var4 = this.field564[var3];
            if (var4 != null) {
                this.method136(var4, 1, -718);
            }
        }
        if (arg0 != 3) {
            this.method17();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLEILHLJCE;)V")
    private final void method111(int arg0, boolean arg1, class17 arg2) {
        while (true) {
            if (arg2.field780 + 21 < arg0 * 8) {
                int var4 = arg2.method235(14, 24335);
                if (var4 != 16383) {
                    if (this.field231[var4] == null) {
                        this.field231[var4] = new class43();
                    }
                    class43 var5 = this.field231[var4];
                    this.field233[this.field232++] = var4;
                    var5.field32 = field553;
                    int var6 = arg2.method235(1, 24335);
                    var5.field1213 = class37.method393(arg2.method235(13, 24335));
                    int var7 = arg2.method235(1, 24335);
                    if (var7 == 1) {
                        this.field568[this.field567++] = var4;
                    }
                    int var8 = arg2.method235(5, 24335);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg2.method235(5, 24335);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field54 = var5.field1213.field1127;
                    var5.field40 = var5.field1213.field1140;
                    var5.field20 = var5.field1213.field1151;
                    var5.field21 = var5.field1213.field1136;
                    var5.field22 = var5.field1213.field1123;
                    var5.field23 = var5.field1213.field1149;
                    var5.field70 = var5.field1213.field1141;
                    var5.method11(false, field299.field37[0] + var9, field299.field38[0] + var8, var6 == 1);
                    continue;
                }
            }
            arg2.method236(false);
            if (!arg1) {
                this.field434 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LIRYXZZFE;Z)V")
    public final void method112(class27 arg0, boolean arg1) {
        int var3 = arg0.field891;
        if (arg1) {
            this.field529 = !this.field529;
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field174 == 0) {
                arg0.field918 = "Loading friend list";
                arg0.field934 = 0;
            } else if (var3 == 1 && this.field174 == 1) {
                arg0.field918 = "Connecting to friendserver";
                arg0.field934 = 0;
            } else if (var3 == 2 && this.field174 != 2) {
                arg0.field918 = "Please wait...";
                arg0.field934 = 0;
            } else {
                int var4 = this.field173;
                if (this.field174 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field918 = "";
                    arg0.field934 = 0;
                } else {
                    arg0.field918 = this.field523[var3];
                    arg0.field934 = 1;
                }
            }
        } else if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
            int var5 = this.field173;
            if (this.field174 != 2) {
                var5 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var5) {
                arg0.field918 = "";
                arg0.field934 = 0;
            } else {
                if (this.field456[var3] == 0) {
                    arg0.field918 = "@red@Offline";
                } else if (this.field456[var3] < 200) {
                    if (this.field456[var3] == field234) {
                        arg0.field918 = "@gre@World" + (this.field456[var3] - 9);
                    } else {
                        arg0.field918 = "@yel@World" + (this.field456[var3] - 9);
                    }
                } else if (this.field456[var3] == field234) {
                    arg0.field918 = "@gre@Classic" + (this.field456[var3] - 219);
                } else {
                    arg0.field918 = "@yel@Classic" + (this.field456[var3] - 219);
                }
                arg0.field934 = 1;
            }
        } else if (var3 == 203) {
            int var6 = this.field173;
            if (this.field174 != 2) {
                var6 = 0;
            }
            arg0.field921 = var6 * 15 + 20;
            if (arg0.field921 <= arg0.field910) {
                arg0.field921 = arg0.field910 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 == 0 && this.field174 == 0) {
                arg0.field918 = "Loading ignore list";
                arg0.field934 = 0;
            } else if (var3 == 1 && this.field174 == 0) {
                arg0.field918 = "Please wait...";
                arg0.field934 = 0;
            } else {
                int var7 = this.field225;
                if (this.field174 == 0) {
                    var7 = 0;
                }
                if (var3 >= var7) {
                    arg0.field918 = "";
                    arg0.field934 = 0;
                } else {
                    arg0.field918 = class33.method370(false, class33.method367(0, this.field577[var3]));
                    arg0.field934 = 1;
                }
            }
        } else if (var3 == 503) {
            arg0.field921 = this.field225 * 15 + 20;
            if (arg0.field921 <= arg0.field910) {
                arg0.field921 = arg0.field910 + 1;
            }
        } else if (var3 == 327) {
            arg0.field950 = 150;
            arg0.field951 = (int) (Math.sin((double) field553 / 40.0D) * 256.0D) & 2047;
            if (this.field257) {
                for (int var8 = 0; var8 < 7; ++var8) {
                    int var15 = this.field389[var8];
                    if (var15 >= 0 && !class54.field1357[var15].method455(false)) {
                        return;
                    }
                }
                this.field257 = false;
                class31[] var9 = new class31[7];
                int var10 = 0;
                for (int var11 = 0; var11 < 7; ++var11) {
                    int var14 = this.field389[var11];
                    if (var14 >= 0) {
                        var9[var10++] = class54.field1357[var14].method456((byte) 9);
                    }
                }
                class31 var12 = new class31(var10, var9, 5);
                for (int var13 = 0; var13 < 5; ++var13) {
                    if (this.field646[var13] != 0) {
                        var12.method353(field457[var13][0], field457[var13][this.field646[var13]]);
                        if (var13 == 1) {
                            var12.method353(field603[0], field603[this.field646[var13]]);
                        }
                    }
                }
                var12.method346(311);
                var12.method347(-486, class41.field1184[field299.field70].field1186[0]);
                var12.method356(64, 850, -30, -50, -30, true);
                arg0.field924 = 5;
                arg0.field925 = 0;
                class27.method331(var12, 0, 5, this.field445);
            }
        } else if (var3 == 324) {
            if (this.field626 == null) {
                this.field626 = arg0.field927;
                this.field627 = arg0.field930;
            }
            if (this.field613) {
                arg0.field927 = this.field627;
            } else {
                arg0.field927 = this.field626;
            }
        } else if (var3 == 325) {
            if (this.field626 == null) {
                this.field626 = arg0.field927;
                this.field627 = arg0.field930;
            }
            if (this.field613) {
                arg0.field927 = this.field626;
            } else {
                arg0.field927 = this.field627;
            }
        } else if (var3 == 600) {
            arg0.field918 = this.field597;
            if (field553 % 20 < 10) {
                arg0.field918 = arg0.field918 + "|";
            } else {
                arg0.field918 = arg0.field918 + " ";
            }
        } else {
            if (var3 == 620) {
                if (this.field181 >= 1) {
                    if (this.field487) {
                        arg0.field892 = 16711680;
                        arg0.field918 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field892 = 16777215;
                        arg0.field918 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field918 = "";
                }
            }
            if (var3 == 660) {
                int var16 = this.field510 - this.field504;
                String var17;
                if (var16 <= 0) {
                    var17 = "earlier today";
                } else if (var16 == 1) {
                    var17 = "yesterday";
                } else {
                    var17 = var16 + " days ago";
                }
                arg0.field918 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
            }
            if (var3 == 661) {
                if (this.field413 == 0) {
                    arg0.field918 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                } else if (this.field413 <= this.field510) {
                    arg0.field918 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method113((byte) 8, this.field413);
                } else {
                    int var18 = this.field510 + 14 - this.field413;
                    String var19;
                    if (var18 <= 0) {
                        var19 = "Earlier today";
                    } else if (var18 == 1) {
                        var19 = "Yesterday";
                    } else {
                        var19 = var18 + " days ago";
                    }
                    arg0.field918 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method113((byte) 8, this.field413) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                }
            }
            if (var3 == 662) {
                String var20;
                if (this.field251 == 0) {
                    var20 = "@yel@0 unread messages";
                } else if (this.field251 == 1) {
                    var20 = "@gre@1 unread message";
                } else {
                    var20 = "@gre@" + this.field251 + " unread messages";
                }
                arg0.field918 = "You have " + var20 + "\\nin your message centre.";
            }
            if (var3 == 663) {
                if (this.field402 > 0 && this.field402 <= this.field510 + 10) {
                    arg0.field918 = "Last password change:\\n@gre@" + this.method113((byte) 8, this.field402);
                } else {
                    arg0.field918 = "Last password change:\\n@gre@Never changed";
                }
            }
            if (var3 == 664) {
                if (this.field344 == 0) {
                    arg0.field918 = "You have not yet set\\nany contact details.";
                }
                if (this.field344 == 1) {
                    arg0.field918 = "Contact Details Last Set:\\n@gre@" + this.method113((byte) 8, this.field376);
                }
                if (this.field344 == 2) {
                    arg0.field918 = "You need to set\\nnew contact details.";
                }
            }
            if (var3 == 665) {
                if (this.field224 > 2 && !field236) {
                    arg0.field918 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                } else if (this.field224 > 2) {
                    arg0.field918 = "\\n\\nYou have @gre@" + this.field224 + "@yel@ days of\\nmember credit remaining.";
                } else if (this.field224 > 0) {
                    arg0.field918 = "You have @gre@" + this.field224 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                } else {
                    arg0.field918 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                }
            }
            if (var3 == 667) {
                if (this.field224 > 2 && !field236) {
                    arg0.field918 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                } else if (this.field224 > 0) {
                    arg0.field918 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                } else {
                    arg0.field918 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                }
            }
            if (var3 == 668) {
                if (this.field413 > this.field510) {
                    arg0.field918 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                } else {
                    arg0.field918 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)Ljava/lang/String;")
    public final String method113(byte arg0, int arg1) {
        if (arg1 > this.field510 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            if (arg0 != 8) {
                this.field375 = !this.field375;
            }
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public final void method24(String arg0, byte arg1, int arg2) {
        this.field256 = arg2;
        this.field604 = arg0;
        this.method109(740);
        if (this.field322 == null) {
            super.method24(arg0, (byte) 8, arg2);
        } else {
            this.field330.method463((byte) 58);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field424.method373(16777215, "RuneScape is loading - please wait...", var4 / 2, var5 / 2 - 26 - var6, 48419);
            int var7 = var5 / 2 - 18 - var6;
            if (arg1 == 8) {
                boolean var8 = false;
                class26.method316(var7, 304, var4 / 2 - 152, -110, 34, 9179409);
                class26.method316(var7 + 1, 302, var4 / 2 - 151, -110, 32, 0);
                class26.method315(9179409, var4 / 2 - 150, 99, arg2 * 3, 30, var7 + 2);
                class26.method315(0, arg2 * 3 + (var4 / 2 - 150), 99, 300 - arg2 * 3, 30, var7 + 2);
                this.field424.method373(16777215, arg0, var4 / 2, var5 / 2 + 5 - var6, 48419);
                this.field330.method464(false, 171, super.field84, 202);
                if (this.field399) {
                    this.field399 = false;
                    if (!this.field353) {
                        this.field331.method464(false, 0, super.field84, 0);
                        this.field332.method464(false, 0, super.field84, 637);
                    }
                    this.field328.method464(false, 0, super.field84, 128);
                    this.field329.method464(false, 371, super.field84, 202);
                    this.field333.method464(false, 265, super.field84, 0);
                    this.field334.method464(false, 265, super.field84, 562);
                    this.field335.method464(false, 171, super.field84, 128);
                    this.field336.method464(false, 171, super.field84, 562);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method114(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field406 = null;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field225; ++var4) {
                if (this.field577[var4] == arg0) {
                    --this.field225;
                    this.field541 = true;
                    for (int var5 = var4; var5 < this.field225; ++var5) {
                        this.field577[var5] = this.field577[var5 + 1];
                    }
                    this.field623.method213(-164, 146);
                    this.field623.method220(arg0, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LODBDSPMH;ZII)V")
    public final void method115(class40 arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (arg1) {
            this.method17();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field633 + this.field323 & 2047;
            int var7 = class31.field1063[var6];
            int var8 = class31.field1064[var6];
            int var9 = var7 * 256 / (this.field599 + 256);
            int var10 = var8 * 256 / (this.field599 + 256);
            int var11 = arg2 * var9 + arg3 * var10 >> 16;
            int var12 = arg2 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field280.method409(var15 + 94 + 4 - 10, 15, 20, var13, 0, 15, 83 - var16 - 20, 256, 20);
        } else {
            this.method178(arg0, false, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method116(int arg0) {
        if (super.field85 == null) {
            this.method60(978);
            this.field328 = null;
            this.field329 = null;
            this.field330 = null;
            this.field331 = null;
            this.field332 = null;
            this.field333 = null;
            this.field334 = null;
            this.field335 = null;
            this.field336 = null;
            this.field491 = null;
            this.field489 = null;
            this.field488 = null;
            this.field490 = null;
            if (arg0 != 5) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field318 = null;
            this.field319 = null;
            this.field320 = null;
            super.field85 = new class58(765, false, this.method22(true), 503);
            this.field399 = true;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field262) {
            this.method75((byte) -31);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)Z")
    public final boolean method117(boolean arg0) {
        if (!arg0) {
            this.field623.method214(81);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    private final void method118(int arg0) {
        class23 var2 = (class23) this.field525.method275();
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field851 == -1) {
                var2.field856 = 0;
                this.method160(-905, var2);
            } else {
                var2.method334();
            }
            var2 = (class23) this.field525.method277(4);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method17() {
        this.method24("Starting up", (byte) 8, 20);
        if (signlink.sunjava) {
            super.field78 = 5;
        }
        if (field284) {
            this.field543 = true;
        } else {
            field284 = true;
            boolean var1 = false;
            String var2 = this.method58(267);
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
                this.field408 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field554[var3] = new class7(signlink.cache_dat, (byte) 6, signlink.cache_idx[var3], var3 + 1, 500000);
                    }
                }
                try {
                    this.method134((byte) 8);
                    this.field322 = this.method108("title screen", this.field306[1], "title", 25, (byte) -64, 1);
                    this.field422 = new class34(this.field322, 2, "p11_full", false);
                    this.field423 = new class34(this.field322, 2, "p12_full", false);
                    this.field424 = new class34(this.field322, 2, "b12_full", false);
                    this.field425 = new class34(this.field322, 2, "q8_full", true);
                    this.method120(-324);
                    this.method95(-909);
                    class6 var4 = this.method108("config", this.field306[2], "config", 30, (byte) -64, 2);
                    class6 var5 = this.method108("interface", this.field306[3], "interface", 35, (byte) -64, 3);
                    class6 var6 = this.method108("2d graphics", this.field306[4], "media", 40, (byte) -64, 4);
                    class6 var7 = this.method108("textures", this.field306[6], "textures", 45, (byte) -64, 6);
                    class6 var8 = this.method108("chat system", this.field306[7], "wordenc", 50, (byte) -64, 7);
                    class6 var9 = this.method108("sound effects", this.field306[8], "sounds", 55, (byte) -64, 8);
                    this.field238 = new byte[4][104][104];
                    this.field622 = new int[4][105][105];
                    this.field407 = new class68(104, 104, this.field622, 4, -160);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field385[var10] = new class16((byte) 6, 104, 104);
                    }
                    this.field440 = new class40(512, 512);
                    class6 var11 = this.method108("update list", this.field306[5], "versionlist", 60, (byte) -64, 5);
                    this.method24("Connecting to update server", (byte) 8, 60);
                    this.field602 = new class71();
                    this.field602.method593(var11, this);
                    class25.method305(this.field602.method597(0));
                    class31.method336(this.field602.method588(2, 0), this.field602);
                    if (!field237) {
                        this.field452 = 0;
                        this.field453 = true;
                        this.field602.method585(2, this.field452);
                        while (this.field602.method594() > 0) {
                            this.method177(true);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field602.field1671 > 3) {
                                this.method46("ondemand");
                                return;
                            }
                        }
                    }
                    this.method24("Requesting animations", (byte) 8, 65);
                    int var12 = this.field602.method588(2, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field602.method585(1, var13);
                    }
                    while (this.field602.method594() > 0) {
                        int var14 = var12 - this.field602.method594();
                        if (var14 > 0) {
                            this.method24("Loading animations - " + var14 * 100 / var12 + "%", (byte) 8, 65);
                        }
                        this.method177(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field602.field1671 > 3) {
                            this.method46("ondemand");
                            return;
                        }
                    }
                    this.method24("Requesting models", (byte) 8, 70);
                    int var15 = this.field602.method588(2, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field602.method592(0, var16);
                        if ((var17 & 1) != 0) {
                            this.field602.method585(0, var16);
                        }
                    }
                    int var18 = this.field602.method594();
                    while (this.field602.method594() > 0) {
                        int var19 = var18 - this.field602.method594();
                        if (var19 > 0) {
                            this.method24("Loading models - " + var19 * 100 / var18 + "%", (byte) 8, 70);
                        }
                        this.method177(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field554[0] != null) {
                        this.method24("Requesting maps", (byte) 8, 75);
                        this.field602.method585(3, this.field602.method601(48, 47, 0, false));
                        this.field602.method585(3, this.field602.method601(48, 47, 1, false));
                        this.field602.method585(3, this.field602.method601(48, 48, 0, false));
                        this.field602.method585(3, this.field602.method601(48, 48, 1, false));
                        this.field602.method585(3, this.field602.method601(48, 49, 0, false));
                        this.field602.method585(3, this.field602.method601(48, 49, 1, false));
                        this.field602.method585(3, this.field602.method601(47, 47, 0, false));
                        this.field602.method585(3, this.field602.method601(47, 47, 1, false));
                        this.field602.method585(3, this.field602.method601(47, 48, 0, false));
                        this.field602.method585(3, this.field602.method601(47, 48, 1, false));
                        this.field602.method585(3, this.field602.method601(148, 48, 0, false));
                        this.field602.method585(3, this.field602.method601(148, 48, 1, false));
                        int var20 = this.field602.method594();
                        while (this.field602.method594() > 0) {
                            int var21 = var20 - this.field602.method594();
                            if (var21 > 0) {
                                this.method24("Loading maps - " + var21 * 100 / var20 + "%", (byte) 8, 75);
                            }
                            this.method177(true);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field602.method588(2, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field602.method592(0, var23);
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
                            this.field602.method584(var23, -235, 0, var25);
                        }
                    }
                    this.field602.method595((byte) 14, field236);
                    if (!field237) {
                        int var26 = this.field602.method588(2, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field602.method586(var27, true)) {
                                this.field602.method584(var27, -235, 2, (byte) 1);
                            }
                        }
                    }
                    this.method24("Unpacking media", (byte) 8, 80);
                    this.field430 = new class19(var6, "invback", 0);
                    this.field432 = new class19(var6, "chatback", 0);
                    this.field431 = new class19(var6, "mapback", 0);
                    this.field475 = new class19(var6, "backbase1", 0);
                    this.field476 = new class19(var6, "backbase2", 0);
                    this.field477 = new class19(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field495[var28] = new class19(var6, "sideicons", var28);
                    }
                    this.field644 = new class40(var6, "compass", 0);
                    this.field280 = new class40(var6, "mapedge", 0);
                    this.field280.method401(-200);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field304[var29] = new class19(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field384[var30] = new class40(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field645[var31] = new class40(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field301[var32] = new class40(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field366[var33] = new class40(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field351[var34] = new class40(var6, "headicons_hint", var34);
                    }
                    this.field163 = new class40(var6, "overlay_multiway", 0);
                    this.field310 = new class40(var6, "mapmarker", 0);
                    this.field311 = new class40(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field364[var35] = new class40(var6, "cross", var35);
                    }
                    this.field196 = new class40(var6, "mapdots", 0);
                    this.field197 = new class40(var6, "mapdots", 1);
                    this.field198 = new class40(var6, "mapdots", 2);
                    this.field199 = new class40(var6, "mapdots", 3);
                    this.field200 = new class40(var6, "mapdots", 4);
                    this.field478 = new class19(var6, "scrollbar", 0);
                    this.field479 = new class19(var6, "scrollbar", 1);
                    this.field535 = new class19(var6, "redstone1", 0);
                    this.field536 = new class19(var6, "redstone2", 0);
                    this.field537 = new class19(var6, "redstone3", 0);
                    this.field538 = new class19(var6, "redstone1", 0);
                    this.field538.method267(804);
                    this.field539 = new class19(var6, "redstone2", 0);
                    this.field539.method267(804);
                    this.field417 = new class19(var6, "redstone1", 0);
                    this.field417.method268(0);
                    this.field418 = new class19(var6, "redstone2", 0);
                    this.field418.method268(0);
                    this.field419 = new class19(var6, "redstone3", 0);
                    this.field419.method268(0);
                    this.field420 = new class19(var6, "redstone1", 0);
                    this.field420.method267(804);
                    this.field420.method268(0);
                    this.field421 = new class19(var6, "redstone2", 0);
                    this.field421.method267(804);
                    this.field421.method268(0);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field493[var36] = new class19(var6, "mod_icons", var36);
                    }
                    class40 var37 = new class40(var6, "backleft1", 0);
                    this.field204 = new class58(var37.field1176, false, this.method22(true), var37.field1177);
                    var37.method402(0, 0, 261);
                    class40 var38 = new class40(var6, "backleft2", 0);
                    this.field205 = new class58(var38.field1176, false, this.method22(true), var38.field1177);
                    var38.method402(0, 0, 261);
                    class40 var39 = new class40(var6, "backright1", 0);
                    this.field206 = new class58(var39.field1176, false, this.method22(true), var39.field1177);
                    var39.method402(0, 0, 261);
                    class40 var40 = new class40(var6, "backright2", 0);
                    this.field207 = new class58(var40.field1176, false, this.method22(true), var40.field1177);
                    var40.method402(0, 0, 261);
                    class40 var41 = new class40(var6, "backtop1", 0);
                    this.field208 = new class58(var41.field1176, false, this.method22(true), var41.field1177);
                    var41.method402(0, 0, 261);
                    class40 var42 = new class40(var6, "backvmid1", 0);
                    this.field209 = new class58(var42.field1176, false, this.method22(true), var42.field1177);
                    var42.method402(0, 0, 261);
                    class40 var43 = new class40(var6, "backvmid2", 0);
                    this.field210 = new class58(var43.field1176, false, this.method22(true), var43.field1177);
                    var43.method402(0, 0, 261);
                    class40 var44 = new class40(var6, "backvmid3", 0);
                    this.field211 = new class58(var44.field1176, false, this.method22(true), var44.field1177);
                    var44.method402(0, 0, 261);
                    class40 var45 = new class40(var6, "backhmid2", 0);
                    this.field212 = new class58(var45.field1176, false, this.method22(true), var45.field1177);
                    var45.method402(0, 0, 261);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field384[var50] != null) {
                            this.field384[var50].method400(var48 + var49, var46 + var49, -35373, var47 + var49);
                        }
                        if (this.field304[var50] != null) {
                            this.field304[var50].method269(var48 + var49, var46 + var49, -35373, var47 + var49);
                        }
                    }
                    this.method24("Unpacking textures", (byte) 8, 83);
                    class21.method285(-28280, var7);
                    class21.method289(false, 0.8D);
                    class21.method284(20, false);
                    this.method24("Unpacking config", (byte) 8, 86);
                    class41.method412(-768, var4);
                    class14.method187(var4);
                    class52.method449(-768, var4);
                    class67.method518(var4);
                    class37.method391(var4);
                    class54.method453(-768, var4);
                    class55.method459(-768, var4);
                    class28.method332(-768, var4);
                    class51.method447(-768, var4);
                    class67.field1501 = field236;
                    if (!field237) {
                        this.method24("Unpacking sounds", (byte) 8, 90);
                        byte[] var51 = var9.method30("sounds.dat", (byte[]) null);
                        class17 var52 = new class17(var51, -26583);
                        class22.method297(-768, var52);
                    }
                    this.method24("Unpacking interfaces", (byte) 8, 95);
                    class34[] var53 = new class34[] { this.field422, this.field423, this.field424, this.field425 };
                    class27.method322((byte) 6, var6, var5, var53);
                    this.method24("Preparing game engine", (byte) 8, 100);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field431.field798[this.field431.field800 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field404[var54] = var55;
                        this.field343[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field431.field798[this.field431.field800 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field354[var58 - 5] = var59 - 25;
                        this.field540[var58 - 5] = var60 - var59;
                    }
                    class21.method282(477, 503, 765);
                    this.field429 = class21.field822;
                    class21.method282(477, 96, 479);
                    this.field426 = class21.field822;
                    class21.method282(477, 261, 190);
                    this.field427 = class21.field822;
                    class21.method282(477, 334, 512);
                    this.field428 = class21.field822;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class21.field820[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class68.method564(800, true, 500, 512, var62, 334);
                    class65.method476(var8);
                    this.field242 = new class59(0, this);
                    this.method23(this.field242, 10);
                    class57.field1395 = this;
                    class14.field700 = this;
                    class37.field1121 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field604 + " " + this.field256);
                    this.field508 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method119(int arg0) {
        if (this.field412 >= 2 || this.field545 != 0 || this.field636 != 0) {
            String var2;
            if (this.field545 == 1 && this.field412 < 2) {
                var2 = "Use " + this.field549 + " with...";
            } else if (this.field636 == 1 && this.field412 < 2) {
                var2 = this.field639 + "...";
            } else {
                var2 = this.field273[this.field412 - 1];
            }
            if (this.field412 > 2) {
                var2 = var2 + "@whi@ / " + (this.field412 - 2) + " more options";
            }
            this.field424.method382(16777215, true, var2, 15, field553 / 1000, 4, 8);
            if (arg0 == 5) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method120(int arg0) {
        byte[] var2 = this.field322.method30("title.dat", (byte[]) null);
        class40 var3 = new class40(var2, this);
        this.field331.method463((byte) 58);
        var3.method402(0, 0, 261);
        this.field332.method463((byte) 58);
        var3.method402(0, -637, 261);
        this.field328.method463((byte) 58);
        var3.method402(0, -128, 261);
        this.field329.method463((byte) 58);
        var3.method402(-371, -202, 261);
        this.field330.method463((byte) 58);
        var3.method402(-171, -202, 261);
        this.field333.method463((byte) 58);
        var3.method402(-265, 0, 261);
        this.field334.method463((byte) 58);
        var3.method402(-265, -562, 261);
        this.field335.method463((byte) 58);
        var3.method402(-171, -128, 261);
        this.field336.method463((byte) 58);
        var3.method402(-171, -562, 261);
        int[] var4 = new int[var3.field1176];
        for (int var5 = 0; var5 < var3.field1177; ++var5) {
            for (int var10 = 0; var10 < var3.field1176; ++var10) {
                var4[var10] = var3.field1175[var3.field1176 * var5 + (var3.field1176 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1176; ++var11) {
                var3.field1175[var3.field1176 * var5 + var11] = var4[var11];
            }
        }
        this.field331.method463((byte) 58);
        var3.method402(0, 382, 261);
        this.field332.method463((byte) 58);
        var3.method402(0, -255, 261);
        this.field328.method463((byte) 58);
        var3.method402(0, 254, 261);
        this.field329.method463((byte) 58);
        var3.method402(-371, 180, 261);
        this.field330.method463((byte) 58);
        var3.method402(-171, 180, 261);
        this.field333.method463((byte) 58);
        var3.method402(-265, 382, 261);
        this.field334.method463((byte) 58);
        var3.method402(-265, -180, 261);
        this.field335.method463((byte) 58);
        var3.method402(-171, 254, 261);
        this.field336.method463((byte) 58);
        var3.method402(-171, -180, 261);
        if (arg0 >= 0) {
            this.field623.method214(171);
        }
        class40 var6 = new class40(this.field322, "logo", 0);
        this.field328.method463((byte) 58);
        var6.method404(382 - var6.field1176 / 2 - 128, this.field527, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method121(String arg0) throws IOException {
        if (!this.field511) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field177 != null) {
                try {
                    this.field177.close();
                } catch (Exception var4) {
                }
                this.field177 = null;
            }
            this.field177 = this.method85(43595);
            this.field177.setSoTimeout(10000);
            InputStream var2 = this.field177.getInputStream();
            OutputStream var3 = this.field177.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method122(byte arg0) {
        for (int var2 = 0; var2 < this.field615; ++var2) {
            if (this.field267[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field555[var2] == this.field606 && this.field303[var2] == this.field293) {
                        if (!this.method117(true)) {
                            var3 = true;
                        }
                    } else {
                        class17 var4 = class22.method298((byte) 37, this.field303[var2], this.field555[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field779 / 22) > (long) (this.field202 / 22) + this.field411) {
                            this.field202 = var4.field779;
                            this.field411 = System.currentTimeMillis();
                            if (this.method64(-275, var4.field779, var4.field778)) {
                                this.field606 = this.field555[var2];
                                this.field293 = this.field303[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                }
                if (var3 && this.field267[var2] != -5) {
                    this.field267[var2] = -5;
                } else {
                    --this.field615;
                    for (int var6 = var2; var6 < this.field615; ++var6) {
                        this.field555[var6] = this.field555[var6 + 1];
                        this.field303[var6] = this.field303[var6 + 1];
                        this.field267[var6] = this.field267[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field267[var2]--;
            }
        }
        if (arg0 != 8) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        if (this.field522 > 0) {
            this.field522 -= 20;
            if (this.field522 < 0) {
                this.field522 = 0;
            }
            if (this.field522 == 0 && this.field379 && !field237) {
                this.field452 = this.field223;
                this.field453 = true;
                this.field602.method585(2, this.field452);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (arg0 != 16) {
            this.field434 = this.field222.method224();
        }
        if (field237 && this.field179 == 2 && class44.field1232 != this.field180) {
            this.method72(this.field607, "Loading - please wait.", (String) null);
            this.field179 = 1;
            this.field240 = System.currentTimeMillis();
        }
        if (this.field179 == 1) {
            int var2 = this.method124(-417);
            if (var2 != 0 && System.currentTimeMillis() - this.field240 > 360000L) {
                signlink.reporterror(this.field169 + " glcfb " + this.field517 + "," + var2 + "," + field237 + "," + this.field554[0] + "," + this.field602.method594() + "," + this.field180 + "," + this.field472 + "," + this.field473);
                this.field240 = System.currentTimeMillis();
            }
        }
        if (this.field179 == 2 && this.field252 != this.field180) {
            this.field252 = this.field180;
            this.method87(737, this.field180);
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)I")
    public final int method124(int arg0) {
        for (int var2 = 0; var2 < this.field416.length; ++var2) {
            if (this.field416[var2] == null && this.field190[var2] != -1) {
                return -1;
            }
            if (this.field305[var2] == null && this.field191[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field416.length; ++var4) {
            byte[] var5 = this.field305[var4];
            if (var5 != null) {
                int var6 = (this.field189[var4] >> 8) * 64 - this.field609;
                int var7 = (this.field189[var4] & 255) * 64 - this.field610;
                if (this.field509) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class44.method433(514, var5, var6, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field266) {
            return -4;
        } else {
            this.field179 = 2;
            class44.field1232 = this.field180;
            if (arg0 >= 0) {
                this.field434 = -1;
            }
            this.method145(this.field605);
            this.field623.method213(-164, 210);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method125(int arg0) {
        if (arg0 == 38851) {
            if (this.field437 > 0) {
                this.method71(37121);
            } else {
                this.method72(this.field607, "Connection lost", "Please wait - attempting to reestablish");
                this.field594 = 0;
                this.field438 = 0;
                class1 var2 = this.field579;
                this.field578 = false;
                this.field598 = 0;
                this.method161(this.field169, this.field170, true);
                if (!this.field578) {
                    this.method71(37121);
                }
                try {
                    var2.method1();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public final void method126(int arg0, String arg1, String arg2, int arg3) {
        this.field433 += arg3;
        if (arg0 == 0 && this.field629 != -1) {
            this.field321 = arg1;
            super.field98 = 0;
        }
        if (this.field499 == -1) {
            this.field642 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field558[var5] = this.field558[var5 - 1];
            this.field559[var5] = this.field559[var5 - 1];
            this.field560[var5] = this.field560[var5 - 1];
        }
        this.field558[0] = arg0;
        this.field559[0] = arg2;
        this.field560[0] = arg1;
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method127(int arg0) {
        while (arg0 >= 0) {
            this.field406 = null;
        }
        if (this.field582 == 0) {
            int var2 = super.field98;
            if (this.field636 == 1 && super.field99 >= 516 && super.field100 >= 160 && super.field99 <= 765 && super.field100 <= 205) {
                var2 = 0;
            }
            if (this.field392) {
                if (var2 != 1) {
                    int var3 = super.field92;
                    int var4 = super.field93;
                    if (this.field313 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field313 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field313 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field314 - 10 || var3 > this.field316 + this.field314 + 10 || var4 < this.field315 - 10 || var4 > this.field317 + this.field315 + 10) {
                        this.field392 = false;
                        if (this.field313 == 1) {
                            this.field541 = true;
                        }
                        if (this.field313 == 2) {
                            this.field642 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field314;
                    int var6 = this.field315;
                    int var7 = this.field316;
                    int var8 = super.field99;
                    int var9 = super.field100;
                    if (this.field313 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field313 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field313 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field412; ++var11) {
                        int var12 = (this.field412 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method51(var10, -44);
                    }
                    this.field392 = false;
                    if (this.field313 == 1) {
                        this.field541 = true;
                    }
                    if (this.field313 == 2) {
                        this.field642 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field412 > 0) {
                    int var13 = this.field348[this.field412 - 1];
                    if (var13 == 391 || var13 == 377 || var13 == 277 || var13 == 281 || var13 == 485 || var13 == 181 || var13 == 946 || var13 == 152 || var13 == 1 || var13 == 530 || var13 == 963 || var13 == 1870) {
                        int var14 = this.field346[this.field412 - 1];
                        int var15 = this.field347[this.field412 - 1];
                        class27 var16 = class27.method329(var15);
                        if (var16.field941 || var16.field896) {
                            this.field544 = false;
                            this.field444 = 0;
                            this.field580 = var15;
                            this.field581 = var14;
                            this.field582 = 2;
                            this.field583 = super.field99;
                            this.field584 = super.field100;
                            if (class27.method329(var15).field895 == this.field265) {
                                this.field582 = 1;
                            }
                            if (class27.method329(var15).field895 == this.field499) {
                                this.field582 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field182 == 1 || this.method77(0, this.field412 - 1)) && this.field412 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field412 > 0) {
                    this.method51(this.field412 - 1, -44);
                }
                if (var2 != 2 || this.field412 <= 0) {
                    return;
                }
                this.method66(543);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILIRYXZZFE;IIIIII)V")
    public final void method128(int arg0, class27 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1.field922 == 0 && arg1.field911 != null && !arg1.field917) {
            if (arg5 >= arg7 && arg4 >= arg6 && arg5 <= arg1.field932 + arg7 && arg4 <= arg1.field910 + arg6) {
                int var9 = arg1.field911.length;
                if (arg3 >= 0) {
                    this.field434 = -1;
                }
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg1.field933[var10] + arg7;
                    int var12 = arg1.field960[var10] + arg6 - arg0;
                    class27 var13 = class27.method329(arg1.field911[var10]);
                    int var14 = var13.field937 + var11;
                    int var15 = var13.field907 + var12;
                    if ((var13.field919 >= 0 || var13.field890 != 0) && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field932 + var14 && arg4 < var13.field910 + var15) {
                        if (var13.field919 >= 0) {
                            this.field524 = var13.field919;
                        } else {
                            this.field524 = var13.field914;
                        }
                    }
                    if (var13.field922 == 8 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field932 + var14 && arg4 < var13.field910 + var15) {
                        this.field394 = var13.field914;
                    }
                    if (var13.field922 == 0) {
                        this.method128(var13.field928, var13, arg2, -618, arg4, arg5, var15, var14);
                        if (var13.field921 > var13.field910) {
                            this.method62(1456, var13, arg2, var13.field921, arg5, var13.field932 + var14, arg4, var13.field910, var15);
                        }
                    } else {
                        if (var13.field934 == 1 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field932 + var14 && arg4 < var13.field910 + var15) {
                            boolean var16 = false;
                            if (var13.field891 != 0) {
                                var16 = this.method99(var13, false);
                            }
                            if (!var16) {
                                this.field273[this.field412] = var13.field906;
                                this.field348[this.field412] = 426;
                                this.field347[this.field412] = var13.field914;
                                ++this.field412;
                            }
                        }
                        if (var13.field934 == 2 && this.field636 == 0 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field932 + var14 && arg4 < var13.field910 + var15) {
                            String var17 = var13.field939;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field273[this.field412] = var17 + " @gre@" + var13.field897;
                            this.field348[this.field412] = 582;
                            this.field347[this.field412] = var13.field914;
                            ++this.field412;
                        }
                        if (var13.field934 == 3 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field932 + var14 && arg4 < var13.field910 + var15) {
                            this.field273[this.field412] = "Close";
                            if (arg2 == 3) {
                                this.field348[this.field412] = 482;
                            } else {
                                this.field348[this.field412] = 208;
                            }
                            this.field347[this.field412] = var13.field914;
                            ++this.field412;
                        }
                        if (var13.field934 == 4 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field932 + var14 && arg4 < var13.field910 + var15) {
                            this.field273[this.field412] = var13.field906;
                            this.field348[this.field412] = 790;
                            this.field347[this.field412] = var13.field914;
                            ++this.field412;
                        }
                        if (var13.field934 == 5 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field932 + var14 && arg4 < var13.field910 + var15) {
                            this.field273[this.field412] = var13.field906;
                            this.field348[this.field412] = 951;
                            this.field347[this.field412] = var13.field914;
                            ++this.field412;
                        }
                        if (var13.field934 == 6 && !this.field446 && arg5 >= var14 && arg4 >= var15 && arg5 < var13.field932 + var14 && arg4 < var13.field910 + var15) {
                            this.field273[this.field412] = var13.field906;
                            this.field348[this.field412] = 405;
                            this.field347[this.field412] = var13.field914;
                            ++this.field412;
                        }
                        if (var13.field922 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field910; ++var19) {
                                for (int var20 = 0; var20 < var13.field932; ++var20) {
                                    int var21 = (var13.field942 + 32) * var20 + var14;
                                    int var22 = (var13.field915 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field935[var18];
                                        var22 += var13.field893[var18];
                                    }
                                    if (arg5 >= var21 && arg4 >= var22 && arg5 < var21 + 32 && arg4 < var22 + 32) {
                                        this.field531 = var18;
                                        this.field532 = var13.field914;
                                        if (var13.field947[var18] > 0) {
                                            class67 var23 = class67.method526(var13.field947[var18] - 1);
                                            if (this.field545 == 1 && var13.field905) {
                                                if (this.field547 != var13.field914 || this.field546 != var18) {
                                                    this.field273[this.field412] = "Use " + this.field549 + " with @lre@" + var23.field1533;
                                                    this.field348[this.field412] = 395;
                                                    this.field349[this.field412] = var23.field1495;
                                                    this.field346[this.field412] = var18;
                                                    this.field347[this.field412] = var13.field914;
                                                    ++this.field412;
                                                }
                                            } else if (this.field636 == 1 && var13.field905) {
                                                if ((this.field638 & 16) == 16) {
                                                    this.field273[this.field412] = this.field639 + " @lre@" + var23.field1533;
                                                    this.field348[this.field412] = 789;
                                                    this.field349[this.field412] = var23.field1495;
                                                    this.field346[this.field412] = var18;
                                                    this.field347[this.field412] = var13.field914;
                                                    ++this.field412;
                                                }
                                            } else {
                                                if (var13.field905) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1530 != null && var23.field1530[var24] != null) {
                                                            this.field273[this.field412] = var23.field1530[var24] + " @lre@" + var23.field1533;
                                                            if (var24 == 3) {
                                                                this.field348[this.field412] = 1;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field348[this.field412] = 530;
                                                            }
                                                            this.field349[this.field412] = var23.field1495;
                                                            this.field346[this.field412] = var18;
                                                            this.field347[this.field412] = var13.field914;
                                                            ++this.field412;
                                                        } else if (var24 == 4) {
                                                            this.field273[this.field412] = "Drop @lre@" + var23.field1533;
                                                            this.field348[this.field412] = 530;
                                                            this.field349[this.field412] = var23.field1495;
                                                            this.field346[this.field412] = var18;
                                                            this.field347[this.field412] = var13.field914;
                                                            ++this.field412;
                                                        }
                                                    }
                                                }
                                                if (var13.field946) {
                                                    this.field273[this.field412] = "Use @lre@" + var23.field1533;
                                                    this.field348[this.field412] = 963;
                                                    this.field349[this.field412] = var23.field1495;
                                                    this.field346[this.field412] = var18;
                                                    this.field347[this.field412] = var13.field914;
                                                    ++this.field412;
                                                }
                                                if (var13.field905 && var23.field1530 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1530[var25] != null) {
                                                            this.field273[this.field412] = var23.field1530[var25] + " @lre@" + var23.field1533;
                                                            if (var25 == 0) {
                                                                this.field348[this.field412] = 181;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field348[this.field412] = 946;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field348[this.field412] = 152;
                                                            }
                                                            this.field349[this.field412] = var23.field1495;
                                                            this.field346[this.field412] = var18;
                                                            this.field347[this.field412] = var13.field914;
                                                            ++this.field412;
                                                        }
                                                    }
                                                }
                                                if (var13.field902 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field902[var26] != null) {
                                                            this.field273[this.field412] = var13.field902[var26] + " @lre@" + var23.field1533;
                                                            if (var26 == 0) {
                                                                this.field348[this.field412] = 391;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field348[this.field412] = 377;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field348[this.field412] = 277;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field348[this.field412] = 281;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field348[this.field412] = 485;
                                                            }
                                                            this.field349[this.field412] = var23.field1495;
                                                            this.field346[this.field412] = var18;
                                                            this.field347[this.field412] = var13.field914;
                                                            ++this.field412;
                                                        }
                                                    }
                                                }
                                                this.field273[this.field412] = "Examine @lre@" + var23.field1533;
                                                this.field348[this.field412] = 1870;
                                                this.field349[this.field412] = var23.field1495;
                                                this.field346[this.field412] = var18;
                                                this.field347[this.field412] = var13.field914;
                                                ++this.field412;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)I")
    public final int method129(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field238[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg1 & 127;
            if (arg2 != 111) {
                return 0;
            } else {
                int var10 = (128 - var8) * this.field622[var7][var5][var6] + this.field622[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field622[var7][var5][var6 + 1] + this.field622[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public static final void method130(int arg0) {
        class68.field1553 = true;
        class21.field811 = true;
        field237 = true;
        if (arg0 == 15665) {
            class44.field1228 = true;
            class14.field722 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILEILHLJCE;)V")
    public final void method131(int arg0, int arg1, class17 arg2) {
        int var4 = 11 / arg0;
        if (arg1 == 126) {
            int var5 = arg2.method226();
            int var6 = arg2.method244(6335);
            int var7 = var6 >> 2;
            int var8 = var6 & 3;
            int var9 = this.field307[var7];
            int var10 = arg2.method243(true);
            int var11 = (var10 >> 4 & 7) + this.field484;
            int var12 = (var10 & 7) + this.field485;
            if (var11 >= 0 && var12 >= 0 && var11 < 103 && var12 < 103) {
                int var13 = this.field622[this.field180][var11][var12];
                int var14 = this.field622[this.field180][var11 + 1][var12];
                int var15 = this.field622[this.field180][var11 + 1][var12 + 1];
                int var16 = this.field622[this.field180][var11][var12 + 1];
                if (var9 == 0) {
                    class38 var17 = this.field407.method550(this.field180, var11, 0, var12);
                    if (var17 != null) {
                        int var18 = var17.field1163 >> 14 & 32767;
                        if (var7 == 2) {
                            var17.field1161 = new class57(var18, 2, var14, var5, var16, false, var8 + 4, var15, (byte) -59, var13);
                            var17.field1162 = new class57(var18, 2, var14, var5, var16, false, var8 + 1 & 3, var15, (byte) -59, var13);
                        } else {
                            var17.field1161 = new class57(var18, var7, var14, var5, var16, false, var8, var15, (byte) -59, var13);
                        }
                    }
                }
                if (var9 == 1) {
                    class35 var19 = this.field407.method551(var12, this.field180, var11, -2944);
                    if (var19 != null) {
                        var19.field1111 = new class57(var19.field1112 >> 14 & 32767, 4, var14, var5, var16, false, 0, var15, (byte) -59, var13);
                    }
                }
                if (var9 == 2) {
                    class49 var20 = this.field407.method552(this.field180, 6, var11, var12);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var20 != null) {
                        var20.field1303 = new class57(var20.field1311 >> 14 & 32767, var7, var14, var5, var16, false, var8, var15, (byte) -59, var13);
                    }
                }
                if (var9 == 3) {
                    class29 var21 = this.field407.method553(var12, this.field180, this.field272, var11);
                    if (var21 != null) {
                        var21.field981 = new class57(var21.field982 >> 14 & 32767, 22, var14, var5, var16, false, var8, var15, (byte) -59, var13);
                    }
                }
            }
        } else if (arg1 == 121) {
            int var22 = arg2.method245(2);
            int var23 = (var22 >> 4 & 7) + this.field484;
            int var24 = (var22 & 7) + this.field485;
            int var25 = arg2.method254(0);
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class20 var26 = this.field406[this.field180][var23][var24];
                if (var26 != null) {
                    for (class63 var27 = (class63) var26.method275(); var27 != null; var27 = (class63) var26.method277(4)) {
                        if ((var25 & 32767) == var27.field1444) {
                            var27.method334();
                            break;
                        }
                    }
                    if (var26.method275() == null) {
                        this.field406[this.field180][var23][var24] = null;
                    }
                    this.method133(var23, var24);
                }
            }
        } else if (arg1 == 2) {
            int var28 = arg2.method224();
            int var29 = (var28 >> 4 & 7) + this.field484;
            int var30 = (var28 & 7) + this.field485;
            int var31 = arg2.method226();
            int var32 = arg2.method226();
            int var33 = arg2.method226();
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                class20 var34 = this.field406[this.field180][var29][var30];
                if (var34 != null) {
                    for (class63 var35 = (class63) var34.method275(); var35 != null; var35 = (class63) var34.method277(4)) {
                        if ((var31 & 32767) == var35.field1444 && var35.field1445 == var32) {
                            var35.field1445 = var33;
                            break;
                        }
                    }
                    this.method133(var29, var30);
                }
            }
        } else if (arg1 == 198) {
            int var36 = arg2.method245(2);
            int var37 = (var36 >> 4 & 7) + this.field484;
            int var38 = (var36 & 7) + this.field485;
            int var39 = arg2.method226();
            int var40 = arg2.method244(6335);
            int var41 = var40 >> 2;
            int var42 = var40 & 3;
            int var43 = this.field307[var41];
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                this.method82(var38, (byte) 1, var37, this.field180, var43, var39, var42, -1, 0, var41);
            }
        } else if (arg1 == 146) {
            int var44 = arg2.method224();
            int var45 = (var44 >> 4 & 7) + this.field484;
            int var46 = (var44 & 7) + this.field485;
            int var47 = var45 + arg2.method225();
            int var48 = var46 + arg2.method225();
            int var49 = arg2.method227();
            int var50 = arg2.method226();
            int var51 = arg2.method224() * 4;
            int var52 = arg2.method224() * 4;
            int var53 = arg2.method226();
            int var54 = arg2.method226();
            int var55 = arg2.method224();
            int var56 = arg2.method224();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var50 != 65535) {
                int var57 = var45 * 128 + 64;
                int var58 = var46 * 128 + 64;
                int var59 = var47 * 128 + 64;
                int var60 = var48 * 128 + 64;
                class47 var61 = new class47(var52, field553 + var54, var55, var49, var56, this.field180, 922, var57, field553 + var53, this.method129(var57, var58, (byte) 111, this.field180) - var51, var58, var50);
                var61.method437(var60, field553 + var53, false, var59, this.method129(var59, var60, (byte) 111, this.field180) - var52);
                this.field260.method272(var61);
            }
        } else {
            if (arg1 == 255) {
                int var62 = arg2.method252(0);
                byte var63 = arg2.method247((byte) 4);
                int var64 = arg2.method253(394);
                byte var65 = arg2.method248(30392);
                byte var66 = arg2.method248(30392);
                int var67 = arg2.method224();
                int var68 = (var67 >> 4 & 7) + this.field484;
                int var69 = (var67 & 7) + this.field485;
                int var70 = arg2.method254(0);
                int var71 = arg2.method245(2);
                int var72 = var71 >> 2;
                int var73 = var71 & 3;
                int var74 = this.field307[var72];
                byte var75 = arg2.method246((byte) -55);
                int var76 = arg2.method254(0);
                class5 var77;
                if (this.field556 == var62) {
                    var77 = field299;
                } else {
                    var77 = this.field564[var62];
                }
                if (var77 != null) {
                    class14 var78 = class14.method192(var76);
                    int var79 = this.field622[this.field180][var68][var69];
                    int var80 = this.field622[this.field180][var68 + 1][var69];
                    int var81 = this.field622[this.field180][var68 + 1][var69 + 1];
                    int var82 = this.field622[this.field180][var68][var69 + 1];
                    class31 var83 = var78.method189(var72, var73, var79, var80, var81, var82, -1);
                    if (var83 != null) {
                        this.method82(var69, (byte) 1, var68, this.field180, var74, -1, 0, var70 + 1, var64 + 1, 0);
                        var77.field107 = field553 + var64;
                        var77.field108 = field553 + var70;
                        var77.field126 = var83;
                        int var84 = var78.field708;
                        int var85 = var78.field703;
                        if (var73 == 1 || var73 == 3) {
                            var84 = var78.field703;
                            var85 = var78.field708;
                        }
                        var77.field123 = var68 * 128 + var84 * 64;
                        var77.field125 = var69 * 128 + var85 * 64;
                        var77.field124 = this.method129(var77.field123, var77.field125, (byte) 111, this.field180);
                        if (var66 > var65) {
                            byte var86 = var66;
                            var66 = var65;
                            var65 = var86;
                        }
                        if (var75 > var63) {
                            byte var87 = var75;
                            var75 = var63;
                            var63 = var87;
                        }
                        var77.field115 = var66 + var68;
                        var77.field117 = var65 + var68;
                        var77.field116 = var69 + var75;
                        var77.field118 = var63 + var69;
                    }
                }
            }
            if (arg1 == 164) {
                int var88 = arg2.method244(6335);
                int var89 = (var88 >> 4 & 7) + this.field484;
                int var90 = (var88 & 7) + this.field485;
                int var91 = arg2.method224();
                int var92 = var91 >> 2;
                int var93 = var91 & 3;
                int var94 = this.field307[var92];
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    this.method82(var90, (byte) 1, var89, this.field180, var94, -1, var93, -1, 0, var92);
                }
            } else if (arg1 == 250) {
                int var95 = arg2.method224();
                int var96 = (var95 >> 4 & 7) + this.field484;
                int var97 = (var95 & 7) + this.field485;
                int var98 = arg2.method253(394);
                int var99 = arg2.method254(0);
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    class63 var100 = new class63();
                    var100.field1444 = var98;
                    var100.field1445 = var99;
                    if (this.field406[this.field180][var96][var97] == null) {
                        this.field406[this.field180][var96][var97] = new class20(807);
                    }
                    this.field406[this.field180][var96][var97].method272(var100);
                    this.method133(var96, var97);
                }
            } else {
                if (arg1 == 40) {
                    int var101 = arg2.method224();
                    int var102 = (var101 >> 4 & 7) + this.field484;
                    int var103 = (var101 & 7) + this.field485;
                    int var104 = arg2.method226();
                    int var105 = arg2.method224();
                    int var106 = var105 >> 4 & 15;
                    int var107 = var105 & 7;
                    if (field299.field37[0] >= var102 - var106 && field299.field37[0] <= var102 + var106 && field299.field38[0] >= var103 - var106 && field299.field38[0] <= var103 + var106 && this.field282 && !field237 && this.field615 < 50) {
                        this.field555[this.field615] = var104;
                        this.field303[this.field615] = var107;
                        this.field267[this.field615] = class22.field839[var104];
                        ++this.field615;
                    }
                }
                if (arg1 == 65) {
                    int var108 = arg2.method224();
                    int var109 = (var108 >> 4 & 7) + this.field484;
                    int var110 = (var108 & 7) + this.field485;
                    int var111 = arg2.method253(394);
                    int var112 = arg2.method226();
                    int var113 = arg2.method226();
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104 && this.field556 != var112) {
                        class63 var114 = new class63();
                        var114.field1444 = var113;
                        var114.field1445 = var111;
                        if (this.field406[this.field180][var109][var110] == null) {
                            this.field406[this.field180][var109][var110] = new class20(807);
                        }
                        this.field406[this.field180][var109][var110].method272(var114);
                        this.method133(var109, var110);
                    }
                } else if (arg1 == 175) {
                    int var115 = arg2.method224();
                    int var116 = (var115 >> 4 & 7) + this.field484;
                    int var117 = (var115 & 7) + this.field485;
                    int var118 = arg2.method226();
                    int var119 = arg2.method224();
                    int var120 = arg2.method226();
                    if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                        int var121 = var116 * 128 + 64;
                        int var122 = var117 * 128 + 64;
                        class69 var123 = new class69(var122, this.method129(var121, var122, (byte) 111, this.field180) - var119, var118, this.field529, field553, this.field180, var120, var121);
                        this.field308.method272(var123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method132(boolean arg0, int arg1) {
        int var3 = class28.field963[arg1].field971;
        if (var3 != 0) {
            int var4 = this.field643[arg1];
            if (arg0) {
                this.method17();
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class21.method289(false, 0.9D);
                }
                if (var4 == 2) {
                    class21.method289(false, 0.8D);
                }
                if (var4 == 3) {
                    class21.method289(false, 0.7D);
                }
                if (var4 == 4) {
                    class21.method289(false, 0.6D);
                }
                class67.field1522.method199();
                this.field399 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field379;
                if (var4 == 0) {
                    this.method63(this.field379, this.field576, 0);
                    this.field379 = true;
                }
                if (var4 == 1) {
                    this.method63(this.field379, this.field576, -400);
                    this.field379 = true;
                }
                if (var4 == 2) {
                    this.method63(this.field379, this.field576, -800);
                    this.field379 = true;
                }
                if (var4 == 3) {
                    this.method63(this.field379, this.field576, -1200);
                    this.field379 = true;
                }
                if (var4 == 4) {
                    this.field379 = false;
                }
                if (this.field379 != var5 && !field237) {
                    if (this.field379) {
                        this.field452 = this.field223;
                        this.field453 = true;
                        this.field602.method585(2, this.field452);
                    } else {
                        this.method180(this.field263);
                    }
                    this.field522 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field282 = true;
                    this.method156(-687, 0);
                }
                if (var4 == 1) {
                    this.field282 = true;
                    this.method156(-687, -400);
                }
                if (var4 == 2) {
                    this.field282 = true;
                    this.method156(-687, -800);
                }
                if (var4 == 3) {
                    this.field282 = true;
                    this.method156(-687, -1200);
                }
                if (var4 == 4) {
                    this.field282 = false;
                }
            }
            if (var3 == 5) {
                this.field182 = var4;
            }
            if (var3 == 6) {
                this.field624 = var4;
            }
            if (var3 == 8) {
                this.field243 = var4;
                this.field642 = true;
            }
            if (var3 == 9) {
                this.field410 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method133(int arg0, int arg1) {
        class20 var3 = this.field406[this.field180][arg0][arg1];
        if (var3 == null) {
            this.field407.method549(this.field180, arg0, arg1);
        } else {
            int var4 = -99999999;
            class63 var5 = null;
            for (class63 var6 = (class63) var3.method275(); var6 != null; var6 = (class63) var3.method277(4)) {
                class67 var11 = class67.method526(var6.field1444);
                int var12 = var11.field1509;
                if (var11.field1526) {
                    var12 = (var6.field1445 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method273(-24824, var5);
            class63 var7 = null;
            class63 var8 = null;
            for (class63 var9 = (class63) var3.method275(); var9 != null; var9 = (class63) var3.method277(4)) {
                if (var5.field1444 != var9.field1444 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1444 != var9.field1444 && var7.field1444 != var9.field1444 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field407.method535(var8, 5, this.field180, this.method129(arg0 * 128 + 64, arg1 * 128 + 64, (byte) 111, this.field180), arg1, arg0, var7, var5, var10);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method134(byte arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = 5;
        this.field306[8] = 0;
        int var4 = 0;
        while (this.field306[8] == 0) {
            String var5 = "Unknown problem";
            this.method24("Connecting to web server", (byte) 8, 20);
            try {
                DataInputStream var6 = this.method121("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 349);
                class17 var7 = new class17(new byte[40], -26583);
                var6.readFully(var7.field778, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field306[var8] = var7.method229();
                }
                int var9 = var7.method229();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field306[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field306[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field306[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field306[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field306[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field306[8] == 0) {
                ++var4;
                for (int var12 = var3; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method24("Game updated - please reload page", (byte) 8, 10);
                        var12 = 10;
                    } else {
                        this.method24(var5 + " - Will retry in " + var12 + " secs.", (byte) 8, 10);
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
                this.field511 = !this.field511;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method135(byte arg0) {
        if (arg0 != 65) {
            this.field623.method214(131);
        }
        ++field573;
        if (field573 > 179) {
            field573 = 0;
            this.field623.method213(-164, 193);
            this.field623.method218(0);
        }
        for (int var2 = 0; var2 < this.field232; ++var2) {
            int var3 = this.field233[var2];
            class43 var4 = this.field231[var3];
            if (var4 != null) {
                this.method136(var4, var4.field1213.field1127, -718);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LAPSQOGBV;II)V")
    public final void method136(class3 arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            this.field406 = null;
        }
        if (arg0.field67 < 128 || arg0.field68 < 128 || arg0.field67 >= 13184 || arg0.field68 >= 13184) {
            arg0.field47 = -1;
            arg0.field27 = -1;
            arg0.field61 = 0;
            arg0.field62 = 0;
            arg0.field67 = arg0.field37[0] * 128 + arg0.field54 * 64;
            arg0.field68 = arg0.field38[0] * 128 + arg0.field54 * 64;
            arg0.method7((byte) 4);
        }
        if (field299 == arg0 && (arg0.field67 < 1536 || arg0.field68 < 1536 || arg0.field67 >= 11776 || arg0.field68 >= 11776)) {
            arg0.field47 = -1;
            arg0.field27 = -1;
            arg0.field61 = 0;
            arg0.field62 = 0;
            arg0.field67 = arg0.field37[0] * 128 + arg0.field54 * 64;
            arg0.field68 = arg0.field38[0] * 128 + arg0.field54 * 64;
            arg0.method7((byte) 4);
        }
        if (arg0.field61 > field553) {
            this.method137(true, arg0);
        } else if (arg0.field62 >= field553) {
            this.method138(arg0, (byte) 113);
        } else {
            this.method139(3, arg0);
        }
        this.method140(false, arg0);
        this.method141((byte) 5, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLAPSQOGBV;)V")
    public final void method137(boolean arg0, class3 arg1) {
        int var3 = arg1.field61 - field553;
        if (!arg0) {
            this.field406 = null;
        }
        int var4 = arg1.field57 * 128 + arg1.field54 * 64;
        int var5 = arg1.field59 * 128 + arg1.field54 * 64;
        arg1.field67 += (var4 - arg1.field67) / var3;
        arg1.field68 += (var5 - arg1.field68) / var3;
        arg1.field19 = 0;
        if (arg1.field63 == 0) {
            arg1.field66 = 1024;
        }
        if (arg1.field63 == 1) {
            arg1.field66 = 1536;
        }
        if (arg1.field63 == 2) {
            arg1.field66 = 0;
        }
        if (arg1.field63 == 3) {
            arg1.field66 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LAPSQOGBV;B)V")
    public final void method138(class3 arg0, byte arg1) {
        if (arg1 == 113) {
            if (field553 == arg0.field62 || arg0.field47 == -1 || arg0.field50 != 0 || arg0.field49 + 1 > class41.field1184[arg0.field47].method413(arg0.field48, false)) {
                int var3 = arg0.field62 - arg0.field61;
                int var4 = field553 - arg0.field61;
                int var5 = arg0.field57 * 128 + arg0.field54 * 64;
                int var6 = arg0.field59 * 128 + arg0.field54 * 64;
                int var7 = arg0.field58 * 128 + arg0.field54 * 64;
                int var8 = arg0.field60 * 128 + arg0.field54 * 64;
                arg0.field67 = ((var3 - var4) * var5 + var4 * var7) / var3;
                arg0.field68 = ((var3 - var4) * var6 + var4 * var8) / var3;
            }
            arg0.field19 = 0;
            if (arg0.field63 == 0) {
                arg0.field66 = 1024;
            }
            if (arg0.field63 == 1) {
                arg0.field66 = 1536;
            }
            if (arg0.field63 == 2) {
                arg0.field66 = 0;
            }
            if (arg0.field63 == 3) {
                arg0.field66 = 512;
            }
            arg0.field69 = arg0.field66;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILAPSQOGBV;)V")
    public final void method139(int arg0, class3 arg1) {
        if (arg0 != 3) {
            this.field263 = 477;
        }
        arg1.field43 = arg1.field70;
        if (arg1.field17 == 0) {
            arg1.field19 = 0;
        } else {
            if (arg1.field47 != -1 && arg1.field50 == 0) {
                class41 var3 = class41.field1184[arg1.field47];
                if (arg1.field65 > 0 && var3.field1196 == 0) {
                    ++arg1.field19;
                    return;
                }
                if (arg1.field65 <= 0 && var3.field1197 == 0) {
                    ++arg1.field19;
                    return;
                }
            }
            int var4 = arg1.field67;
            int var5 = arg1.field68;
            int var6 = arg1.field37[arg1.field17 - 1] * 128 + arg1.field54 * 64;
            int var7 = arg1.field38[arg1.field17 - 1] * 128 + arg1.field54 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field66 = 1280;
                    } else if (var5 > var7) {
                        arg1.field66 = 1792;
                    } else {
                        arg1.field66 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field66 = 768;
                    } else if (var5 > var7) {
                        arg1.field66 = 256;
                    } else {
                        arg1.field66 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field66 = 1024;
                } else {
                    arg1.field66 = 0;
                }
                int var8 = arg1.field66 - arg1.field69 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field21;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field20;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field23;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field22;
                }
                if (var9 == -1) {
                    var9 = arg1.field20;
                }
                arg1.field43 = var9;
                int var10 = 4;
                if (arg1.field69 != arg1.field66 && arg1.field52 == -1 && arg1.field40 != 0) {
                    var10 = 2;
                }
                if (arg1.field17 > 2) {
                    var10 = 6;
                }
                if (arg1.field17 > 3) {
                    var10 = 8;
                }
                if (arg1.field19 > 0 && arg1.field17 > 1) {
                    var10 = 8;
                    --arg1.field19;
                }
                if (arg1.field53[arg1.field17 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field43 == arg1.field20 && arg1.field18 != -1) {
                    arg1.field43 = arg1.field18;
                }
                if (var4 < var6) {
                    arg1.field67 += var10;
                    if (arg1.field67 > var6) {
                        arg1.field67 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field67 -= var10;
                    if (arg1.field67 < var6) {
                        arg1.field67 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field68 += var10;
                    if (arg1.field68 > var7) {
                        arg1.field68 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field68 -= var10;
                    if (arg1.field68 < var7) {
                        arg1.field68 = var7;
                    }
                }
                if (arg1.field67 == var6 && arg1.field68 == var7) {
                    --arg1.field17;
                    if (arg1.field65 > 0) {
                        --arg1.field65;
                        return;
                    }
                }
            } else {
                arg1.field67 = var6;
                arg1.field68 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLAPSQOGBV;)V")
    public final void method140(boolean arg0, class3 arg1) {
        if (arg0) {
            this.field270 = !this.field270;
        }
        if (arg1.field40 != 0) {
            if (arg1.field52 != -1 && arg1.field52 < 32768) {
                class43 var3 = this.field231[arg1.field52];
                if (var3 != null) {
                    int var4 = arg1.field67 - var3.field67;
                    int var5 = arg1.field68 - var3.field68;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field66 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field52 >= 32768) {
                int var6 = arg1.field52 - 32768;
                if (this.field556 == var6) {
                    var6 = this.field563;
                }
                class5 var7 = this.field564[var6];
                if (var7 != null) {
                    int var8 = arg1.field67 - var7.field67;
                    int var9 = arg1.field68 - var7.field68;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field66 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field41 != 0 || arg1.field42 != 0) && (arg1.field17 == 0 || arg1.field19 > 0)) {
                int var10 = arg1.field67 - (arg1.field41 - this.field609 - this.field609) * 64;
                int var11 = arg1.field68 - (arg1.field42 - this.field610 - this.field610) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field66 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field41 = 0;
                arg1.field42 = 0;
            }
            int var12 = arg1.field66 - arg1.field69 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field40 && var12 <= 2048 - arg1.field40) {
                    if (var12 > 1024) {
                        arg1.field69 -= arg1.field40;
                    } else {
                        arg1.field69 += arg1.field40;
                    }
                } else {
                    arg1.field69 = arg1.field66;
                }
                arg1.field69 &= 2047;
                if (arg1.field70 == arg1.field43 && arg1.field69 != arg1.field66) {
                    if (arg1.field71 != -1) {
                        arg1.field43 = arg1.field71;
                        return;
                    }
                    arg1.field43 = arg1.field20;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLAPSQOGBV;)V")
    public final void method141(byte arg0, class3 arg1) {
        if (this.field572 == arg0) {
            boolean var3 = false;
            arg1.field39 = false;
            if (arg1.field43 != -1) {
                class41 var4 = class41.field1184[arg1.field43];
                ++arg1.field45;
                if (arg1.field44 < var4.field1185 && arg1.field45 > var4.method413(arg1.field44, false)) {
                    arg1.field45 = 0;
                    ++arg1.field44;
                }
                if (arg1.field44 >= var4.field1185) {
                    arg1.field45 = 0;
                    arg1.field44 = 0;
                }
            }
            if (arg1.field27 != -1 && field553 >= arg1.field30) {
                if (arg1.field28 < 0) {
                    arg1.field28 = 0;
                }
                class41 var5 = class55.field1367[arg1.field27].field1371;
                ++arg1.field29;
                while (arg1.field28 < var5.field1185 && arg1.field29 > var5.method413(arg1.field28, false)) {
                    arg1.field29 -= var5.method413(arg1.field28, false);
                    ++arg1.field28;
                }
                if (arg1.field28 >= var5.field1185 && (arg1.field28 < 0 || arg1.field28 >= var5.field1185)) {
                    arg1.field27 = -1;
                }
            }
            if (arg1.field47 != -1 && arg1.field50 <= 1) {
                class41 var6 = class41.field1184[arg1.field47];
                if (var6.field1196 == 1 && arg1.field65 > 0 && arg1.field61 <= field553 && arg1.field62 < field553) {
                    arg1.field50 = 1;
                    return;
                }
            }
            if (arg1.field47 != -1 && arg1.field50 == 0) {
                class41 var7 = class41.field1184[arg1.field47];
                ++arg1.field49;
                while (arg1.field48 < var7.field1185 && arg1.field49 > var7.method413(arg1.field48, false)) {
                    arg1.field49 -= var7.method413(arg1.field48, false);
                    ++arg1.field48;
                }
                if (arg1.field48 >= var7.field1185) {
                    arg1.field48 -= var7.field1189;
                    ++arg1.field51;
                    if (arg1.field51 >= var7.field1195) {
                        arg1.field47 = -1;
                    }
                    if (arg1.field48 < 0 || arg1.field48 >= var7.field1185) {
                        arg1.field47 = -1;
                    }
                }
                arg1.field39 = var7.field1191;
            }
            if (arg1.field50 > 0) {
                --arg1.field50;
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method142(int arg0) {
        if (arg0 != -45619) {
            this.field434 = this.field222.method224();
        }
        if (this.field631 != -1 && (this.field179 == 2 || super.field85 != null)) {
            if (this.field179 == 2) {
                this.method52(this.field631, 1, this.field447);
                if (this.field275 != -1) {
                    this.method52(this.field275, 1, this.field447);
                }
                this.field447 = 0;
                this.method116(5);
                super.field85.method463((byte) 58);
                class21.field822 = this.field429;
                class26.method313(805);
                this.field399 = true;
                class27 var2 = class27.method329(this.field631);
                if (var2.field932 == 512 && var2.field910 == 334 && var2.field922 == 0) {
                    var2.field932 = 765;
                    var2.field910 = 503;
                }
                this.method157(var2, 0, (byte) 79, 0, 0);
                if (this.field275 != -1) {
                    class27 var3 = class27.method329(this.field275);
                    if (var3.field932 == 512 && var3.field910 == 334 && var3.field922 == 0) {
                        var3.field932 = 765;
                        var3.field910 = 503;
                    }
                    this.method157(var3, 0, (byte) 79, 0, 0);
                }
                if (!this.field392) {
                    this.method158((byte) -53);
                    this.method119(5);
                } else {
                    this.method49(6);
                }
            }
            super.field85.method464(false, 0, super.field84, 0);
        } else {
            if (this.field399) {
                this.method105(this.field261);
                this.field399 = false;
                this.field204.method464(false, 4, super.field84, 0);
                this.field205.method464(false, 357, super.field84, 0);
                this.field206.method464(false, 4, super.field84, 722);
                this.field207.method464(false, 205, super.field84, 743);
                this.field208.method464(false, 0, super.field84, 0);
                this.field209.method464(false, 4, super.field84, 516);
                this.field210.method464(false, 205, super.field84, 516);
                this.field211.method464(false, 357, super.field84, 496);
                this.field212.method464(false, 338, super.field84, 0);
                this.field541 = true;
                this.field642 = true;
                this.field264 = true;
                this.field474 = true;
                if (this.field179 != 2) {
                    this.field490.method464(false, 4, super.field84, 4);
                    this.field489.method464(false, 4, super.field84, 550);
                }
                ++field387;
                if (field387 > 131) {
                    field387 = 0;
                    this.field623.method213(-164, 84);
                    this.field623.method218(0);
                }
            }
            if (this.field179 == 2) {
                this.method94(this.field593);
            }
            if (this.field392 && this.field313 == 1) {
                this.field541 = true;
            }
            if (this.field519 != -1) {
                boolean var4 = this.method52(this.field519, 1, this.field447);
                if (var4) {
                    this.field541 = true;
                }
            }
            if (this.field503 == 2) {
                this.field541 = true;
            }
            if (this.field582 == 2) {
                this.field541 = true;
            }
            if (this.field541) {
                this.method170(0);
                this.field541 = false;
            }
            if (this.field499 == -1) {
                this.field372.field928 = this.field380 - this.field356 - 77;
                if (super.field92 > 448 && super.field92 < 560 && super.field93 > 332) {
                    this.method62(1456, this.field372, -1, this.field380, super.field92 - 17, 463, super.field93 - 357, 77, 0);
                }
                int var5 = this.field380 - 77 - this.field372.field928;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field380 - 77) {
                    var5 = this.field380 - 77;
                }
                if (this.field356 != var5) {
                    this.field356 = var5;
                    this.field642 = true;
                }
            }
            if (this.field499 != -1) {
                boolean var6 = this.method52(this.field499, 1, this.field447);
                if (var6) {
                    this.field642 = true;
                }
            }
            if (this.field503 == 3) {
                this.field642 = true;
            }
            if (this.field582 == 3) {
                this.field642 = true;
            }
            if (this.field321 != null) {
                this.field642 = true;
            }
            if (this.field392 && this.field313 == 2) {
                this.field642 = true;
            }
            if (this.field642) {
                this.method176(-27503);
                this.field642 = false;
            }
            if (this.field179 == 2) {
                this.method48(false);
                this.field489.method464(false, 4, super.field84, 550);
            }
            if (this.field533 != -1) {
                this.field264 = true;
            }
            if (this.field264) {
                if (this.field533 != -1 && this.field533 == this.field365) {
                    this.field533 = -1;
                    this.field623.method213(-164, 225);
                    this.field623.method214(this.field365);
                }
                this.field264 = false;
                this.field320.method463((byte) 58);
                this.field477.method270(0, this.field527, 0);
                if (this.field519 == -1) {
                    if (this.field571[this.field365] != -1) {
                        if (this.field365 == 0) {
                            this.field535.method270(22, this.field527, 10);
                        }
                        if (this.field365 == 1) {
                            this.field536.method270(54, this.field527, 8);
                        }
                        if (this.field365 == 2) {
                            this.field536.method270(82, this.field527, 8);
                        }
                        if (this.field365 == 3) {
                            this.field537.method270(110, this.field527, 8);
                        }
                        if (this.field365 == 4) {
                            this.field539.method270(153, this.field527, 8);
                        }
                        if (this.field365 == 5) {
                            this.field539.method270(181, this.field527, 8);
                        }
                        if (this.field365 == 6) {
                            this.field538.method270(209, this.field527, 9);
                        }
                    }
                    if (this.field571[0] != -1 && (this.field533 != 0 || field553 % 20 < 10)) {
                        this.field495[0].method270(29, this.field527, 13);
                    }
                    if (this.field571[1] != -1 && (this.field533 != 1 || field553 % 20 < 10)) {
                        this.field495[1].method270(53, this.field527, 11);
                    }
                    if (this.field571[2] != -1 && (this.field533 != 2 || field553 % 20 < 10)) {
                        this.field495[2].method270(82, this.field527, 11);
                    }
                    if (this.field571[3] != -1 && (this.field533 != 3 || field553 % 20 < 10)) {
                        this.field495[3].method270(115, this.field527, 12);
                    }
                    if (this.field571[4] != -1 && (this.field533 != 4 || field553 % 20 < 10)) {
                        this.field495[4].method270(153, this.field527, 13);
                    }
                    if (this.field571[5] != -1 && (this.field533 != 5 || field553 % 20 < 10)) {
                        this.field495[5].method270(180, this.field527, 11);
                    }
                    if (this.field571[6] != -1 && (this.field533 != 6 || field553 % 20 < 10)) {
                        this.field495[6].method270(208, this.field527, 13);
                    }
                }
                this.field320.method464(false, 160, super.field84, 516);
                this.field319.method463((byte) 58);
                this.field476.method270(0, this.field527, 0);
                if (this.field519 == -1) {
                    if (this.field571[this.field365] != -1) {
                        if (this.field365 == 7) {
                            this.field417.method270(42, this.field527, 0);
                        }
                        if (this.field365 == 8) {
                            this.field418.method270(74, this.field527, 0);
                        }
                        if (this.field365 == 9) {
                            this.field418.method270(102, this.field527, 0);
                        }
                        if (this.field365 == 10) {
                            this.field419.method270(130, this.field527, 1);
                        }
                        if (this.field365 == 11) {
                            this.field421.method270(173, this.field527, 0);
                        }
                        if (this.field365 == 12) {
                            this.field421.method270(201, this.field527, 0);
                        }
                        if (this.field365 == 13) {
                            this.field420.method270(229, this.field527, 0);
                        }
                    }
                    if (this.field571[8] != -1 && (this.field533 != 8 || field553 % 20 < 10)) {
                        this.field495[7].method270(74, this.field527, 2);
                    }
                    if (this.field571[9] != -1 && (this.field533 != 9 || field553 % 20 < 10)) {
                        this.field495[8].method270(102, this.field527, 3);
                    }
                    if (this.field571[10] != -1 && (this.field533 != 10 || field553 % 20 < 10)) {
                        this.field495[9].method270(137, this.field527, 4);
                    }
                    if (this.field571[11] != -1 && (this.field533 != 11 || field553 % 20 < 10)) {
                        this.field495[10].method270(174, this.field527, 2);
                    }
                    if (this.field571[12] != -1 && (this.field533 != 12 || field553 % 20 < 10)) {
                        this.field495[11].method270(201, this.field527, 2);
                    }
                    if (this.field571[13] != -1 && (this.field533 != 13 || field553 % 20 < 10)) {
                        this.field495[12].method270(226, this.field527, 2);
                    }
                }
                this.field319.method464(false, 466, super.field84, 496);
                this.field490.method463((byte) 58);
                class21.field822 = this.field428;
            }
            if (this.field474) {
                this.field474 = false;
                this.field318.method463((byte) 58);
                this.field475.method270(0, this.field527, 0);
                this.field423.method374(-8, 55, "Public chat", 28, true, 16777215);
                if (this.field498 == 0) {
                    this.field423.method374(-8, 55, "On", 41, true, 65280);
                }
                if (this.field498 == 1) {
                    this.field423.method374(-8, 55, "Friends", 41, true, 16776960);
                }
                if (this.field498 == 2) {
                    this.field423.method374(-8, 55, "Off", 41, true, 16711680);
                }
                if (this.field498 == 3) {
                    this.field423.method374(-8, 55, "Hide", 41, true, 65535);
                }
                this.field423.method374(-8, 184, "Private chat", 28, true, 16777215);
                if (this.field355 == 0) {
                    this.field423.method374(-8, 184, "On", 41, true, 65280);
                }
                if (this.field355 == 1) {
                    this.field423.method374(-8, 184, "Friends", 41, true, 16776960);
                }
                if (this.field355 == 2) {
                    this.field423.method374(-8, 184, "Off", 41, true, 16711680);
                }
                this.field423.method374(-8, 324, "Trade/compete", 28, true, 16777215);
                if (this.field386 == 0) {
                    this.field423.method374(-8, 324, "On", 41, true, 65280);
                }
                if (this.field386 == 1) {
                    this.field423.method374(-8, 324, "Friends", 41, true, 16776960);
                }
                if (this.field386 == 2) {
                    this.field423.method374(-8, 324, "Off", 41, true, 16711680);
                }
                this.field423.method374(-8, 458, "Report abuse", 33, true, 16777215);
                this.field318.method464(false, 453, super.field84, 0);
                this.field490.method463((byte) 58);
                class21.field822 = this.field428;
            }
            this.field447 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILEILHLJCE;)V")
    private final void method143(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < this.field567; ++var4) {
            int var5 = this.field568[var4];
            class43 var6 = this.field231[var5];
            int var7 = arg2.method224();
            if ((var7 & 64) != 0) {
                var6.field46 = arg2.method231();
                var6.field26 = 100;
            }
            if ((var7 & 32) != 0) {
                var6.field41 = arg2.method252(0);
                var6.field42 = arg2.method226();
            }
            if ((var7 & 1) != 0) {
                int var8 = arg2.method244(6335);
                int var9 = arg2.method244(6335);
                var6.method9(field553, 951, var9, var8);
                var6.field14 = field553 + 300;
                var6.field15 = arg2.method244(6335);
                var6.field16 = arg2.method243(true);
            }
            if ((var7 & 2) != 0) {
                int var10 = arg2.method244(6335);
                int var11 = arg2.method243(true);
                var6.method9(field553, 951, var11, var10);
                var6.field14 = field553 + 300;
                var6.field15 = arg2.method245(2);
                var6.field16 = arg2.method224();
            }
            if ((var7 & 128) != 0) {
                var6.field27 = arg2.method253(394);
                int var12 = arg2.method260((byte) 54);
                var6.field31 = var12 >> 16;
                var6.field30 = (var12 & 65535) + field553;
                var6.field28 = 0;
                var6.field29 = 0;
                if (var6.field30 > field553) {
                    var6.field28 = -1;
                }
                if (var6.field27 == 65535) {
                    var6.field27 = -1;
                }
            }
            if ((var7 & 16) != 0) {
                var6.field1213 = class37.method393(arg2.method254(0));
                var6.field54 = var6.field1213.field1127;
                var6.field40 = var6.field1213.field1140;
                var6.field20 = var6.field1213.field1151;
                var6.field21 = var6.field1213.field1136;
                var6.field22 = var6.field1213.field1123;
                var6.field23 = var6.field1213.field1149;
                var6.field70 = var6.field1213.field1141;
            }
            if ((var7 & 4) != 0) {
                var6.field52 = arg2.method253(394);
                if (var6.field52 == 65535) {
                    var6.field52 = -1;
                }
            }
            if ((var7 & 8) != 0) {
                int var13 = arg2.method252(0);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = arg2.method244(6335);
                if (var6.field47 == var13 && var13 != -1) {
                    int var15 = class41.field1184[var13].field1198;
                    if (var15 == 1) {
                        var6.field48 = 0;
                        var6.field49 = 0;
                        var6.field50 = var14;
                        var6.field51 = 0;
                    }
                    if (var15 == 2) {
                        var6.field51 = 0;
                    }
                } else if (var13 == -1 || var6.field47 == -1 || class41.field1184[var13].field1192 >= class41.field1184[var6.field47].field1192) {
                    var6.field47 = var13;
                    var6.field48 = 0;
                    var6.field49 = 0;
                    var6.field50 = var14;
                    var6.field51 = 0;
                    var6.field65 = var6.field17;
                }
            }
        }
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method144(byte arg0) {
        for (int var2 = -1; var2 < this.field565; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field563;
            } else {
                var6 = this.field566[var2];
            }
            class5 var7 = this.field564[var6];
            if (var7 != null && var7.field26 > 0) {
                --var7.field26;
                if (var7.field26 == 0) {
                    var7.field46 = null;
                }
            }
        }
        if (arg0 != 4) {
            this.field270 = !this.field270;
        }
        for (int var3 = 0; var3 < this.field232; ++var3) {
            int var4 = this.field233[var3];
            class43 var5 = this.field231[var4];
            if (var5 != null && var5.field26 > 0) {
                --var5.field26;
                if (var5.field26 == 0) {
                    var5.field46 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method145(int arg0) {
        try {
            this.field252 = -1;
            this.field308.method279();
            this.field260.method279();
            class21.method283(2);
            this.method76(0);
            this.field407.method528((byte) 9);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field385[var2].method200();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field238[var3][var4][var5] = 0;
                    }
                }
            }
            class44 var6 = new class44(this.field622, 104, this.field350, this.field238, 104);
            int var7 = this.field416.length;
            this.field623.method213(-164, 58);
            if (!this.field509) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field189[var8] >> 8) * 64 - this.field609;
                    int var10 = (this.field189[var8] & 255) * 64 - this.field610;
                    byte[] var11 = this.field416[var8];
                    if (var11 != null) {
                        var6.method435(var10, var11, (this.field472 - 6) * 8, true, this.field385, (this.field473 - 6) * 8, var9);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field189[var12] >> 8) * 64 - this.field609;
                    int var14 = (this.field189[var12] & 255) * 64 - this.field610;
                    byte[] var15 = this.field416[var12];
                    if (var15 == null && this.field473 < 800) {
                        var6.method423(var14, 64, 64, var13, (byte) 9);
                    }
                }
                this.field623.method213(-164, 58);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field305[var16];
                    if (var17 != null) {
                        int var18 = (this.field189[var16] >> 8) * 64 - this.field609;
                        int var19 = (this.field189[var16] & 255) * 64 - this.field610;
                        var6.method428(var18, true, var19, var17, this.field407, this.field385);
                    }
                }
            }
            if (this.field509) {
                int var20 = 0;
                label248: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field494[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method423(var31 * 8, 8, 8, var30 * 8, (byte) 9);
                                }
                            }
                        }
                        this.field623.method213(-164, 58);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label248;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field494[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field189.length; ++var42) {
                                            if (this.field189[var42] == var41 && this.field305[var42] != null) {
                                                var6.method426(var34 * 8, var33, var37, this.field407, (var40 & 7) * 8, (var39 & 7) * 8, this.field305[var42], this.field385, false, var35 * 8, var38);
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
                            int var23 = this.field494[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field189.length; ++var29) {
                                    if (this.field189[var29] == var28 && this.field416[var29] != null) {
                                        var6.method434(var24, (var26 & 7) * 8, var25, var20, this.field385, (var27 & 7) * 8, this.field416[var29], false, var21 * 8, var22 * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field623.method213(-164, 58);
            var6.method430(this.field385, false, this.field407);
            if (this.field490 != null) {
                this.field490.method463((byte) 58);
                class21.field822 = this.field428;
            }
            this.field623.method213(-164, 58);
            int var43 = class44.field1239;
            if (var43 > this.field180) {
                var43 = this.field180;
            }
            if (var43 < this.field180 - 1) {
                int var44 = this.field180 - 1;
            }
            if (field237) {
                this.field407.method529(this.field283, class44.field1239);
            } else {
                this.field407.method529(this.field283, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method133(var45, var46);
                }
            }
            this.method118(159);
        } catch (Exception var60) {
        }
        class14.field735.method199();
        if (super.field87 != null) {
            this.field623.method213(-164, 173);
            this.field623.method218(1057001181);
        }
        if (field237 && signlink.cache_dat != null) {
            int var48 = this.field602.method588(2, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field602.method592(0, var49);
                if ((var50 & 121) == 0) {
                    class31.method338(596, var49);
                }
            }
        }
        System.gc();
        int var51 = 58 / arg0;
        class21.method284(20, false);
        this.field602.method600(-376);
        int var52 = (this.field472 - 6) / 8 - 1;
        int var53 = (this.field472 + 6) / 8 + 1;
        int var54 = (this.field473 - 6) / 8 - 1;
        int var55 = (this.field473 + 6) / 8 + 1;
        if (this.field628) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field602.method601(var57, var56, 0, false);
                    if (var58 != -1) {
                        this.field602.method598((byte) 40, var58, 3);
                    }
                    int var59 = this.field602.method601(var57, var56, 1, false);
                    if (var59 != -1) {
                        this.field602.method598((byte) 40, var59, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method146(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class27.method324(arg0, true);
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method147(int arg0) {
        this.field460 = 0;
        for (int var2 = -1; var2 < this.field565 + this.field232; ++var2) {
            class3 var19;
            if (var2 == -1) {
                var19 = field299;
            } else if (var2 < this.field565) {
                var19 = this.field564[this.field566[var2]];
            } else {
                var19 = this.field231[this.field233[var2 - this.field565]];
            }
            if (var19 != null && var19.method10(true)) {
                if (var19 instanceof class43) {
                    class37 var20 = ((class43) var19).field1213;
                    if (var20.field1119 != null) {
                        var20 = var20.method389((byte) 108);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field565) {
                    class37 var23 = ((class43) var19).field1213;
                    if (var23.field1138 >= 0 && var23.field1138 < this.field366.length) {
                        this.method102(-14612, var19.field36 + 15, var19);
                        if (this.field390 > -1) {
                            this.field366[var23.field1138].method404(this.field390 - 12, this.field527, this.field391 - 30);
                        }
                    }
                    if (this.field281 == 1 && this.field233[var2 - this.field565] == this.field570 && field553 % 20 < 10) {
                        this.method102(-14612, var19.field36 + 15, var19);
                        if (this.field390 > -1) {
                            this.field351[0].method404(this.field390 - 12, this.field527, this.field391 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class5 var22 = (class5) var19;
                    if (var22.field134 != -1 || var22.field109 != -1) {
                        this.method102(-14612, var19.field36 + 15, var19);
                        if (this.field390 > -1) {
                            if (var22.field134 != -1) {
                                this.field301[var22.field134].method404(this.field390 - 12, this.field527, this.field391 - var21);
                                var21 += 25;
                            }
                            if (var22.field109 != -1) {
                                this.field366[var22.field109].method404(this.field390 - 12, this.field527, this.field391 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field281 == 10 && this.field566[var2] == this.field245) {
                        this.method102(-14612, var19.field36 + 15, var19);
                        if (this.field390 > -1) {
                            this.field351[1].method404(this.field390 - 12, this.field527, this.field391 - var21);
                        }
                    }
                }
                if (var19.field46 != null && (var2 >= this.field565 || this.field498 == 0 || this.field498 == 3 || this.field498 == 1 && this.method179(((class5) var19).field129, 4))) {
                    this.method102(-14612, var19.field36, var19);
                    if (this.field390 > -1 && this.field460 < this.field461) {
                        this.field465[this.field460] = this.field424.method376(var19.field46, -980) / 2;
                        this.field464[this.field460] = this.field424.field1103;
                        this.field462[this.field460] = this.field390;
                        this.field463[this.field460] = this.field391;
                        this.field466[this.field460] = var19.field56;
                        this.field467[this.field460] = var19.field24;
                        this.field468[this.field460] = var19.field26;
                        this.field469[this.field460++] = var19.field46;
                        if (this.field624 == 0 && var19.field24 >= 1 && var19.field24 <= 3) {
                            this.field464[this.field460] += 10;
                            this.field463[this.field460] += 5;
                        }
                        if (this.field624 == 0 && var19.field24 == 4) {
                            this.field465[this.field460] = 60;
                        }
                        if (this.field624 == 0 && var19.field24 == 5) {
                            this.field464[this.field460] += 5;
                        }
                    }
                }
                if (var19.field14 > field553) {
                    this.method102(-14612, var19.field36 + 15, var19);
                    if (this.field390 > -1) {
                        int var24 = var19.field15 * 30 / var19.field16;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class26.method315(65280, this.field390 - 15, 99, var24, 5, this.field391 - 3);
                        class26.method315(16711680, this.field390 - 15 + var24, 99, 30 - var24, 5, this.field391 - 3);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field35[var25] > field553) {
                        this.method102(-14612, var19.field36 / 2, var19);
                        if (this.field390 > -1) {
                            if (var25 == 1) {
                                this.field391 -= 20;
                            }
                            if (var25 == 2) {
                                this.field390 -= 15;
                                this.field391 -= 10;
                            }
                            if (var25 == 3) {
                                this.field390 += 15;
                                this.field391 -= 10;
                            }
                            this.field645[var19.field34[var25]].method404(this.field390 - 12, this.field527, this.field391 - 12);
                            this.field422.method373(0, String.valueOf(var19.field33[var25]), this.field390, this.field391 + 4, 48419);
                            this.field422.method373(16777215, String.valueOf(var19.field33[var25]), this.field390 - 1, this.field391 + 3, 48419);
                        }
                    }
                }
            }
        }
        if (arg0 < 0) {
            for (int var3 = 0; var3 < this.field460; ++var3) {
                int var4 = this.field462[var3];
                int var5 = this.field463[var3];
                int var6 = this.field465[var3];
                int var7 = this.field464[var3];
                boolean var8 = true;
                while (var8) {
                    var8 = false;
                    for (int var18 = 0; var18 < var3; ++var18) {
                        if (var5 + 2 > this.field463[var18] - this.field464[var18] && var5 - var7 < this.field463[var18] + 2 && var4 - var6 < this.field465[var18] + this.field462[var18] && var4 + var6 > this.field462[var18] - this.field465[var18] && this.field463[var18] - this.field464[var18] < var5) {
                            var5 = this.field463[var18] - this.field464[var18];
                            var8 = true;
                        }
                    }
                }
                this.field390 = this.field462[var3];
                this.field391 = this.field463[var3] = var5;
                String var9 = this.field469[var3];
                if (this.field624 == 0) {
                    int var10 = 16776960;
                    if (this.field466[var3] < 6) {
                        var10 = this.field393[this.field466[var3]];
                    }
                    if (this.field466[var3] == 6) {
                        var10 = this.field297 % 20 < 10 ? 16711680 : 16776960;
                    }
                    if (this.field466[var3] == 7) {
                        var10 = this.field297 % 20 < 10 ? 255 : 65535;
                    }
                    if (this.field466[var3] == 8) {
                        var10 = this.field297 % 20 < 10 ? 45056 : 8454016;
                    }
                    if (this.field466[var3] == 9) {
                        int var11 = 150 - this.field468[var3];
                        if (var11 < 50) {
                            var10 = var11 * 1280 + 16711680;
                        } else if (var11 < 100) {
                            var10 = 16776960 - (var11 - 50) * 327680;
                        } else if (var11 < 150) {
                            var10 = (var11 - 100) * 5 + 65280;
                        }
                    }
                    if (this.field466[var3] == 10) {
                        int var12 = 150 - this.field468[var3];
                        if (var12 < 50) {
                            var10 = var12 * 5 + 16711680;
                        } else if (var12 < 100) {
                            var10 = 16711935 - (var12 - 50) * 327680;
                        } else if (var12 < 150) {
                            var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                        }
                    }
                    if (this.field466[var3] == 11) {
                        int var13 = 150 - this.field468[var3];
                        if (var13 < 50) {
                            var10 = 16777215 - var13 * 327685;
                        } else if (var13 < 100) {
                            var10 = (var13 - 50) * 327685 + 65280;
                        } else if (var13 < 150) {
                            var10 = 16777215 - (var13 - 100) * 327680;
                        }
                    }
                    if (this.field467[var3] == 0) {
                        this.field424.method373(0, var9, this.field390, this.field391 + 1, 48419);
                        this.field424.method373(var10, var9, this.field390, this.field391, 48419);
                    }
                    if (this.field467[var3] == 1) {
                        this.field424.method378(this.field391 + 1, -31425, this.field390, this.field297, 0, var9);
                        this.field424.method378(this.field391, -31425, this.field390, this.field297, var10, var9);
                    }
                    if (this.field467[var3] == 2) {
                        this.field424.method379(this.field391 + 1, this.field390, 0, var9, true, this.field297);
                        this.field424.method379(this.field391, this.field390, var10, var9, true, this.field297);
                    }
                    if (this.field467[var3] == 3) {
                        this.field424.method380(150 - this.field468[var3], (byte) 9, var9, this.field391 + 1, 0, this.field390, this.field297);
                        this.field424.method380(150 - this.field468[var3], (byte) 9, var9, this.field391, var10, this.field390, this.field297);
                    }
                    if (this.field467[var3] == 4) {
                        int var14 = this.field424.method376(var9, -980);
                        int var15 = (150 - this.field468[var3]) * (var14 + 100) / 150;
                        class26.method312(this.field390 + 50, 334, this.field390 - 50, this.field214, 0);
                        this.field424.method377(var9, this.field391 + 1, this.field390 + 50 - var15, 0, 0);
                        this.field424.method377(var9, this.field391, this.field390 + 50 - var15, 0, var10);
                        class26.method311((byte) 2);
                    }
                    if (this.field467[var3] == 5) {
                        int var16 = 150 - this.field468[var3];
                        int var17 = 0;
                        if (var16 < 25) {
                            var17 = var16 - 25;
                        } else if (var16 > 125) {
                            var17 = var16 - 125;
                        }
                        class26.method312(512, this.field391 + 5, 0, this.field214, this.field391 - this.field424.field1103 - 1);
                        this.field424.method373(0, var9, this.field390, this.field391 + 1 + var17, 48419);
                        this.field424.method373(var10, var9, this.field390, this.field391 + var17, 48419);
                        class26.method311((byte) 2);
                    }
                } else {
                    this.field424.method373(0, var9, this.field390, this.field391 + 1, 48419);
                    this.field424.method373(16776960, var9, this.field390, this.field391, 48419);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method21(byte arg0) {
        if (arg0 != 6) {
            this.method17();
        }
        this.field399 = true;
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method148(int arg0) {
        if (this.field545 == 0 && this.field636 == 0) {
            this.field273[this.field412] = "Walk here";
            this.field348[this.field412] = 16;
            this.field346[this.field412] = super.field92;
            this.field347[this.field412] = super.field93;
            ++this.field412;
        }
        int var2 = -1;
        if (arg0 != 47798) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = 0; var4 < class31.field1061; ++var4) {
            int var5 = class31.field1062[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field407.method558(this.field180, var6, var7, var5) >= 0) {
                    class14 var10 = class14.method192(var9);
                    if (var10.field726 != null) {
                        var10 = var10.method194(this.field277);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field545 == 1) {
                        this.field273[this.field412] = "Use " + this.field549 + " with @cya@" + var10.field729;
                        this.field348[this.field412] = 419;
                        this.field349[this.field412] = var5;
                        this.field346[this.field412] = var6;
                        this.field347[this.field412] = var7;
                        ++this.field412;
                    } else if (this.field636 == 1) {
                        if ((this.field638 & 4) == 4) {
                            this.field273[this.field412] = this.field639 + " @cya@" + var10.field729;
                            this.field348[this.field412] = 157;
                            this.field349[this.field412] = var5;
                            this.field346[this.field412] = var6;
                            this.field347[this.field412] = var7;
                            ++this.field412;
                        }
                    } else {
                        if (var10.field718 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field718[var11] != null) {
                                    this.field273[this.field412] = var10.field718[var11] + " @cya@" + var10.field729;
                                    if (var11 == 0) {
                                        this.field348[this.field412] = 588;
                                    }
                                    if (var11 == 1) {
                                        this.field348[this.field412] = 256;
                                    }
                                    if (var11 == 2) {
                                        this.field348[this.field412] = 766;
                                    }
                                    if (var11 == 3) {
                                        this.field348[this.field412] = 985;
                                    }
                                    if (var11 == 4) {
                                        this.field348[this.field412] = 1577;
                                    }
                                    this.field349[this.field412] = var5;
                                    this.field346[this.field412] = var6;
                                    this.field347[this.field412] = var7;
                                    ++this.field412;
                                }
                            }
                        }
                        this.field273[this.field412] = "Examine @cya@" + var10.field729;
                        this.field348[this.field412] = 1327;
                        this.field349[this.field412] = var10.field714 << 14;
                        this.field346[this.field412] = var6;
                        this.field347[this.field412] = var7;
                        ++this.field412;
                    }
                }
                if (var8 == 1) {
                    class43 var12 = this.field231[var9];
                    if (var12.field1213.field1127 == 1 && (var12.field67 & 127) == 64 && (var12.field68 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field232; ++var13) {
                            class43 var16 = this.field231[this.field233[var13]];
                            if (var16 != null && var12 != var16 && var16.field1213.field1127 == 1 && var12.field67 == var16.field67 && var12.field68 == var16.field68) {
                                this.method106(true, this.field233[var13], var16.field1213, var7, var6);
                            }
                        }
                        for (int var14 = 0; var14 < this.field565; ++var14) {
                            class5 var15 = this.field564[this.field566[var14]];
                            if (var15 != null && var12.field67 == var15.field67 && var12.field68 == var15.field68) {
                                this.method98(var6, this.field566[var14], var7, var15, 3);
                            }
                        }
                    }
                    this.method106(true, var9, var12.field1213, var7, var6);
                }
                if (var8 == 0) {
                    class5 var17 = this.field564[var9];
                    if ((var17.field67 & 127) == 64 && (var17.field68 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field232; ++var18) {
                            class43 var21 = this.field231[this.field233[var18]];
                            if (var21 != null && var21.field1213.field1127 == 1 && var17.field67 == var21.field67 && var17.field68 == var21.field68) {
                                this.method106(true, this.field233[var18], var21.field1213, var7, var6);
                            }
                        }
                        for (int var19 = 0; var19 < this.field565; ++var19) {
                            class5 var20 = this.field564[this.field566[var19]];
                            if (var20 != null && var17 != var20 && var17.field67 == var20.field67 && var17.field68 == var20.field68) {
                                this.method98(var6, this.field566[var19], var7, var20, 3);
                            }
                        }
                    }
                    this.method98(var6, var9, var7, var17, 3);
                }
                if (var8 == 3) {
                    class20 var22 = this.field406[this.field180][var6][var7];
                    if (var22 != null) {
                        for (class63 var23 = (class63) var22.method276(0); var23 != null; var23 = (class63) var22.method278((byte) 3)) {
                            class67 var24 = class67.method526(var23.field1444);
                            if (this.field545 == 1) {
                                this.field273[this.field412] = "Use " + this.field549 + " with @lre@" + var24.field1533;
                                this.field348[this.field412] = 62;
                                this.field349[this.field412] = var23.field1444;
                                this.field346[this.field412] = var6;
                                this.field347[this.field412] = var7;
                                ++this.field412;
                            } else if (this.field636 == 1) {
                                if ((this.field638 & 1) == 1) {
                                    this.field273[this.field412] = this.field639 + " @lre@" + var24.field1533;
                                    this.field348[this.field412] = 538;
                                    this.field349[this.field412] = var23.field1444;
                                    this.field346[this.field412] = var6;
                                    this.field347[this.field412] = var7;
                                    ++this.field412;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1502 != null && var24.field1502[var25] != null) {
                                        this.field273[this.field412] = var24.field1502[var25] + " @lre@" + var24.field1533;
                                        if (var25 == 0) {
                                            this.field348[this.field412] = 184;
                                        }
                                        if (var25 == 1) {
                                            this.field348[this.field412] = 81;
                                        }
                                        if (var25 == 2) {
                                            this.field348[this.field412] = 98;
                                        }
                                        if (var25 == 3) {
                                            this.field348[this.field412] = 275;
                                        }
                                        if (var25 == 4) {
                                            this.field348[this.field412] = 689;
                                        }
                                        this.field349[this.field412] = var23.field1444;
                                        this.field346[this.field412] = var6;
                                        this.field347[this.field412] = var7;
                                        ++this.field412;
                                    } else if (var25 == 2) {
                                        this.field273[this.field412] = "Take @lre@" + var24.field1533;
                                        this.field348[this.field412] = 98;
                                        this.field349[this.field412] = var23.field1444;
                                        this.field346[this.field412] = var6;
                                        this.field347[this.field412] = var7;
                                        ++this.field412;
                                    }
                                }
                                this.field273[this.field412] = "Examine @lre@" + var24.field1533;
                                this.field348[this.field412] = 1184;
                                this.field349[this.field412] = var23.field1444;
                                this.field346[this.field412] = var6;
                                this.field347[this.field412] = var7;
                                ++this.field412;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method149(boolean arg0, int arg1) {
        this.method109(740);
        this.field330.method463((byte) 58);
        this.field253.method270(0, this.field527, 0);
        if (arg1 <= 0) {
            this.field289 = this.field625.method580();
        }
        short var3 = 360;
        short var4 = 200;
        if (this.field178 == 0) {
            int var5 = var4 / 2 + 80;
            this.field422.method374(-8, var3 / 2, this.field602.field1664, var5, true, 7711145);
            int var6 = var4 / 2 - 20;
            this.field424.method374(-8, var3 / 2, "Welcome to RuneScape", var6, true, 16776960);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field254.method270(var7 - 73, this.field527, var8 - 20);
            this.field424.method374(-8, var7, "New User", var8 + 5, true, 16777215);
            int var9 = var3 / 2 + 80;
            this.field254.method270(var9 - 73, this.field527, var8 - 20);
            this.field424.method374(-8, var9, "Existing User", var8 + 5, true, 16777215);
        }
        if (this.field178 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field512.length() > 0) {
                this.field424.method374(-8, var3 / 2, this.field512, var10 - 15, true, 16776960);
                this.field424.method374(-8, var3 / 2, this.field513, var10, true, 16776960);
                var10 += 30;
            } else {
                this.field424.method374(-8, var3 / 2, this.field513, var10 - 7, true, 16776960);
                var10 += 30;
            }
            this.field424.method381(var3 / 2 - 90, var10, true, 16777215, "Username: " + this.field169 + (this.field291 == 0 & field553 % 40 < 20 ? "@yel@|" : ""), -98);
            var10 += 15;
            this.field424.method381(var3 / 2 - 88, var10, true, 16777215, "Password: " + class33.method371(9, this.field170) + (this.field291 == 1 & field553 % 40 < 20 ? "@yel@|" : ""), -98);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field254.method270(var11 - 73, this.field527, var12 - 20);
                this.field424.method374(-8, var11, "Login", var12 + 5, true, 16777215);
                int var13 = var3 / 2 + 80;
                this.field254.method270(var13 - 73, this.field527, var12 - 20);
                this.field424.method374(-8, var13, "Cancel", var12 + 5, true, 16777215);
            }
        }
        if (this.field178 == 3) {
            this.field424.method374(-8, var3 / 2, "Create a free account", var4 / 2 - 60, true, 16776960);
            int var14 = var4 / 2 - 35;
            this.field424.method374(-8, var3 / 2, "To create a new account you need to", var14, true, 16777215);
            int var18 = var14 + 15;
            this.field424.method374(-8, var3 / 2, "go back to the main RuneScape webpage", var18, true, 16777215);
            int var19 = var18 + 15;
            this.field424.method374(-8, var3 / 2, "and choose the 'create account'", var19, true, 16777215);
            int var20 = var19 + 15;
            this.field424.method374(-8, var3 / 2, "button near the top of that page.", var20, true, 16777215);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field254.method270(var15 - 73, this.field527, var16 - 20);
            this.field424.method374(-8, var15, "Cancel", var16 + 5, true, 16777215);
        }
        this.field330.method464(false, 171, super.field84, 202);
        if (this.field399) {
            this.field399 = false;
            this.field328.method464(false, 0, super.field84, 128);
            this.field329.method464(false, 371, super.field84, 202);
            this.field333.method464(false, 265, super.field84, 0);
            this.field334.method464(false, 265, super.field84, 562);
            this.field335.method464(false, 171, super.field84, 128);
            this.field336.method464(false, 171, super.field84, 562);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IILEILHLJCE;)V")
    private final void method150(int arg0, int arg1, class17 arg2) {
        int var10000 = arg0 + arg1;
        int var5 = arg2.method235(8, 24335);
        if (var5 < this.field565) {
            for (int var6 = var5; var6 < this.field565; ++var6) {
                this.field358[this.field357++] = this.field566[var6];
            }
        }
        if (var5 > this.field565) {
            signlink.reporterror(this.field169 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field565 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field566[var7];
                class5 var9 = this.field564[var8];
                int var10 = arg2.method235(1, 24335);
                if (var10 == 0) {
                    this.field566[this.field565++] = var8;
                    var9.field32 = field553;
                } else {
                    int var11 = arg2.method235(2, 24335);
                    if (var11 == 0) {
                        this.field566[this.field565++] = var8;
                        var9.field32 = field553;
                        this.field568[this.field567++] = var8;
                    } else if (var11 == 1) {
                        this.field566[this.field565++] = var8;
                        var9.field32 = field553;
                        int var12 = arg2.method235(3, 24335);
                        var9.method8(var12, false, true);
                        int var13 = arg2.method235(1, 24335);
                        if (var13 == 1) {
                            this.field568[this.field567++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field566[this.field565++] = var8;
                        var9.field32 = field553;
                        int var14 = arg2.method235(3, 24335);
                        var9.method8(var14, true, true);
                        int var15 = arg2.method235(3, 24335);
                        var9.method8(var15, true, true);
                        int var16 = arg2.method235(1, 24335);
                        if (var16 == 1) {
                            this.field568[this.field567++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field358[this.field357++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILAWOZVMFS;LEILHLJCE;IZ)V")
    private final void method151(int arg0, class5 arg1, class17 arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.field406 = null;
        }
        if ((arg0 & 32) != 0) {
            int var6 = arg2.method243(true);
            byte[] var7 = new byte[var6];
            class17 var8 = new class17(var7, -26583);
            arg2.method233(var7, 8, var6, 0);
            this.field569[arg3] = var8;
            arg1.method27(var8, this.field342);
        }
        if ((arg0 & 256) != 0) {
            arg1.field27 = arg2.method254(0);
            int var9 = arg2.method260((byte) 54);
            arg1.field31 = var9 >> 16;
            arg1.field30 = (var9 & 65535) + field553;
            arg1.field28 = 0;
            arg1.field29 = 0;
            if (arg1.field30 > field553) {
                arg1.field28 = -1;
            }
            if (arg1.field27 == 65535) {
                arg1.field27 = -1;
            }
        }
        if ((arg0 & 1) != 0) {
            int var10 = arg2.method252(0);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = arg2.method243(true);
            if (arg1.field47 == var10 && var10 != -1) {
                int var12 = class41.field1184[var10].field1198;
                if (var12 == 1) {
                    arg1.field48 = 0;
                    arg1.field49 = 0;
                    arg1.field50 = var11;
                    arg1.field51 = 0;
                }
                if (var12 == 2) {
                    arg1.field51 = 0;
                }
            } else if (var10 == -1 || arg1.field47 == -1 || class41.field1184[var10].field1192 >= class41.field1184[arg1.field47].field1192) {
                arg1.field47 = var10;
                arg1.field48 = 0;
                arg1.field49 = 0;
                arg1.field50 = var11;
                arg1.field51 = 0;
                arg1.field65 = arg1.field17;
            }
        }
        if ((arg0 & 2) != 0) {
            arg1.field41 = arg2.method226();
            arg1.field42 = arg2.method252(0);
        }
        if ((arg0 & 1024) != 0) {
            arg1.field57 = arg2.method244(6335);
            arg1.field59 = arg2.method245(2);
            arg1.field58 = arg2.method243(true);
            arg1.field60 = arg2.method243(true);
            arg1.field61 = arg2.method252(0) + field553;
            arg1.field62 = arg2.method253(394) + field553;
            arg1.field63 = arg2.method224();
            arg1.method7((byte) 4);
        }
        if ((arg0 & 8) != 0) {
            arg1.field46 = arg2.method231();
            if (arg1.field46.charAt(0) == '~') {
                arg1.field46 = arg1.field46.substring(1);
                this.method126(2, arg1.field46, arg1.field129, 0);
            } else if (field299 == arg1) {
                this.method126(2, arg1.field46, arg1.field129, 0);
            }
            arg1.field56 = 0;
            arg1.field24 = 0;
            arg1.field26 = 150;
        }
        if ((arg0 & 128) != 0) {
            arg1.field52 = arg2.method226();
            if (arg1.field52 == 65535) {
                arg1.field52 = -1;
            }
        }
        if ((arg0 & 512) != 0) {
            int var13 = arg2.method224();
            int var14 = arg2.method245(2);
            arg1.method9(field553, 951, var14, var13);
            arg1.field14 = field553 + 300;
            arg1.field15 = arg2.method244(6335);
            arg1.field16 = arg2.method245(2);
        }
        if ((arg0 & 64) != 0) {
            int var15 = arg2.method254(0);
            int var16 = arg2.method224();
            int var17 = arg2.method245(2);
            int var18 = arg2.field779;
            if (arg1.field129 != null && arg1.field132) {
                long var19 = class33.method366(arg1.field129);
                boolean var21 = false;
                if (var16 <= 1) {
                    for (int var22 = 0; var22 < this.field225; ++var22) {
                        if (this.field577[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
                if (!var21 && this.field640 == 0) {
                    try {
                        this.field230.field779 = 0;
                        arg2.method263(0, var17, 0, this.field230.field778);
                        this.field230.field779 = 0;
                        String var23 = class39.method396(this.field230, var17, -260);
                        String var24 = class65.method486(this.field552, var23);
                        arg1.field46 = var24;
                        arg1.field56 = var15 >> 8;
                        arg1.field24 = var15 & 255;
                        arg1.field26 = 150;
                        if (var16 != 2 && var16 != 3) {
                            if (var16 == 1) {
                                this.method126(1, var24, "@cr1@" + arg1.field129, 0);
                            } else {
                                this.method126(2, var24, arg1.field129, 0);
                            }
                        } else {
                            this.method126(1, var24, "@cr2@" + arg1.field129, 0);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field779 = var17 + var18;
        }
        if ((arg0 & 16) != 0) {
            int var26 = arg2.method245(2);
            int var27 = arg2.method243(true);
            arg1.method9(field553, 951, var27, var26);
            arg1.field14 = field553 + 300;
            arg1.field15 = arg2.method224();
            arg1.field16 = arg2.method245(2);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method152(byte arg0) {
        if (arg0 != 8) {
            this.field623.method214(198);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method16(0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field265 != -1 && this.field608 == this.field265) {
                        if (var2 == 8 && this.field597.length() > 0) {
                            this.field597 = this.field597.substring(0, this.field597.length() - 1);
                        }
                        break;
                    }
                    if (this.field614) {
                        if (var2 >= 32 && var2 <= 122 && this.field244.length() < 80) {
                            this.field244 = this.field244 + (char) var2;
                            this.field642 = true;
                        }
                        if (var2 == 8 && this.field244.length() > 0) {
                            this.field244 = this.field244.substring(0, this.field244.length() - 1);
                            this.field642 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field614 = false;
                            this.field642 = true;
                            if (this.field516 == 1) {
                                long var3 = class33.method366(this.field244);
                                this.method68(var3, -20952);
                            }
                            if (this.field516 == 2 && this.field173 > 0) {
                                long var5 = class33.method366(this.field244);
                                this.method61(var5, true);
                            }
                            if (this.field516 == 3 && this.field244.length() > 0) {
                                this.field623.method213(-164, 168);
                                this.field623.method214(0);
                                int var7 = this.field623.field779;
                                this.field623.method220(this.field193, false);
                                class39.method397(this.field623, this.field244, true);
                                this.field623.method223(this.field623.field779 - var7, this.field241);
                                this.field244 = class39.method398(this.field552, this.field244);
                                this.field244 = class65.method486(this.field552, this.field244);
                                this.method126(6, this.field244, class33.method370(false, class33.method367(0, this.field193)), 0);
                                if (this.field355 == 2) {
                                    this.field355 = 1;
                                    this.field474 = true;
                                    this.field623.method213(-164, 124);
                                    this.field623.method214(this.field498);
                                    this.field623.method214(this.field355);
                                    this.field623.method214(this.field386);
                                }
                            }
                            if (this.field516 == 4 && this.field225 < 100) {
                                long var8 = class33.method366(this.field244);
                                this.method57(false, var8);
                            }
                            if (this.field516 == 5 && this.field225 > 0) {
                                long var10 = class33.method366(this.field244);
                                this.method114(var10, this.field557);
                            }
                        }
                    } else if (this.field630 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field195.length() < 10) {
                            this.field195 = this.field195 + (char) var2;
                            this.field642 = true;
                        }
                        if (var2 == 8 && this.field195.length() > 0) {
                            this.field195 = this.field195.substring(0, this.field195.length() - 1);
                            this.field642 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field195.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field195);
                                } catch (Exception var22) {
                                }
                                this.field623.method213(-164, 86);
                                this.field623.method218(var12);
                            }
                            this.field630 = 0;
                            this.field642 = true;
                        }
                    } else if (this.field630 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field195.length() < 12) {
                            this.field195 = this.field195 + (char) var2;
                            this.field642 = true;
                        }
                        if (var2 == 8 && this.field195.length() > 0) {
                            this.field195 = this.field195.substring(0, this.field195.length() - 1);
                            this.field642 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field195.length() > 0) {
                                this.field623.method213(-164, 200);
                                this.field623.method220(class33.method366(this.field195), false);
                            }
                            this.field630 = 0;
                            this.field642 = true;
                        }
                    } else if (this.field499 == -1 && this.field631 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field441.length() < 80) {
                            this.field441 = this.field441 + (char) var2;
                            this.field642 = true;
                        }
                        if (var2 == 8 && this.field441.length() > 0) {
                            this.field441 = this.field441.substring(0, this.field441.length() - 1);
                            this.field642 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field441.length() > 0) {
                            if (this.field181 == 2) {
                                if (this.field441.equals("::clientdrop")) {
                                    this.method125(38851);
                                }
                                if (this.field441.equals("::lag")) {
                                    this.method78((byte) -34);
                                }
                                if (this.field441.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field602.method588(2, 2); ++var13) {
                                        this.field602.method584(var13, -235, 2, (byte) 1);
                                    }
                                }
                                if (this.field441.equals("::fpson")) {
                                    field514 = true;
                                }
                                if (this.field441.equals("::fpsoff")) {
                                    field514 = false;
                                }
                                if (this.field441.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field385[var14].field761[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field441.startsWith("::")) {
                                this.field623.method213(-164, 230);
                                this.field623.method214(this.field441.length() - 1);
                                this.field623.method221(this.field441.substring(2));
                            } else {
                                String var17 = this.field441.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field441 = this.field441.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field441 = this.field441.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field441 = this.field441.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field441 = this.field441.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field441 = this.field441.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field441 = this.field441.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field441 = this.field441.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field441 = this.field441.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field441 = this.field441.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field441 = this.field441.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field441 = this.field441.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field441 = this.field441.substring(6);
                                }
                                String var19 = this.field441.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field441 = this.field441.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field441 = this.field441.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field441 = this.field441.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field441 = this.field441.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field441 = this.field441.substring(6);
                                }
                                this.field623.method213(-164, 169);
                                this.field623.method214(0);
                                int var21 = this.field623.field779;
                                this.field230.field779 = 0;
                                class39.method397(this.field230, this.field441, true);
                                this.field623.method262(this.field230.field778, this.field230.field779, -459, 0);
                                this.field623.method242(true, var20);
                                this.field623.method214(var18);
                                this.field623.method223(this.field623.field779 - var21, this.field241);
                                this.field441 = class39.method398(this.field552, this.field441);
                                this.field441 = class65.method486(this.field552, this.field441);
                                field299.field46 = this.field441;
                                field299.field56 = var18;
                                field299.field24 = var20;
                                field299.field26 = 150;
                                if (this.field181 == 2) {
                                    this.method126(2, field299.field46, "@cr2@" + field299.field129, 0);
                                } else if (this.field181 == 1) {
                                    this.method126(2, field299.field46, "@cr1@" + field299.field129, 0);
                                } else {
                                    this.method126(2, field299.field46, field299.field129, 0);
                                }
                                if (this.field498 == 2) {
                                    this.field498 = 3;
                                    this.field474 = true;
                                    this.field623.method213(-164, 124);
                                    this.field623.method214(this.field498);
                                    this.field623.method214(this.field355);
                                    this.field623.method214(this.field386);
                                }
                            }
                            this.field441 = "";
                            this.field642 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field597.length() < 12) {
                this.field597 = this.field597 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method153(int arg0) {
        int var2 = 8 / arg0;
        this.method100(33);
        if (this.field250 == 1) {
            this.field364[this.field249 / 100].method404(this.field247 - 8 - 4, this.field527, this.field248 - 8 - 4);
        }
        if (this.field250 == 2) {
            this.field364[this.field249 / 100 + 4].method404(this.field247 - 8 - 4, this.field527, this.field248 - 8 - 4);
        }
        if (this.field378 != -1) {
            this.method52(this.field378, 1, this.field447);
            this.method157(class27.method329(this.field378), 0, (byte) 79, 0, 0);
        }
        if (this.field265 != -1) {
            this.method52(this.field265, 1, this.field447);
            this.method157(class27.method329(this.field265), 0, (byte) 79, 0, 0);
        }
        this.method174(622);
        if (!this.field392) {
            this.method158((byte) -53);
            this.method119(5);
        } else if (this.field313 == 0) {
            this.method49(6);
        }
        if (this.field618 == 1) {
            this.field163.method404(472, this.field527, 296);
        }
        if (field514) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field80 < 30 && field237) {
                var5 = 16711680;
            }
            if (super.field80 < 20 && !field237) {
                var5 = 16711680;
            }
            this.field423.method372(617, var4, var3, var5, "Fps:" + super.field80);
            int var14 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field237) {
                int var9 = 16711680;
            }
            if (var7 > 67108864 && !field237) {
                int var10 = 16711680;
            }
            this.field423.method372(617, var14, var3, 16776960, "Mem:" + var7 + "k");
            var14 += 15;
        }
        if (this.field470 != 0) {
            int var11 = this.field470 / 50;
            int var12 = var11 / 60;
            int var13 = var11 % 60;
            if (var13 < 10) {
                this.field423.method377("System update in: " + var12 + ":0" + var13, 329, 4, 0, 16776960);
            } else {
                this.field423.method377("System update in: " + var12 + ":" + var13, 329, 4, 0, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method154(byte arg0) {
        if (arg0 != 8) {
            this.field623.method214(10);
        }
        int var2 = this.field367 * 128 + 64;
        int var3 = this.field368 * 128 + 64;
        int var4 = this.method129(var2, var3, (byte) 111, this.field180) - this.field369;
        if (this.field184 < var2) {
            this.field184 += (var2 - this.field184) * this.field371 / 1000 + this.field370;
            if (this.field184 > var2) {
                this.field184 = var2;
            }
        }
        if (this.field184 > var2) {
            this.field184 -= (this.field184 - var2) * this.field371 / 1000 + this.field370;
            if (this.field184 < var2) {
                this.field184 = var2;
            }
        }
        if (this.field185 < var4) {
            this.field185 += (var4 - this.field185) * this.field371 / 1000 + this.field370;
            if (this.field185 > var4) {
                this.field185 = var4;
            }
        }
        if (this.field185 > var4) {
            this.field185 -= (this.field185 - var4) * this.field371 / 1000 + this.field370;
            if (this.field185 < var4) {
                this.field185 = var4;
            }
        }
        if (this.field186 < var3) {
            this.field186 += (var3 - this.field186) * this.field371 / 1000 + this.field370;
            if (this.field186 > var3) {
                this.field186 = var3;
            }
        }
        if (this.field186 > var3) {
            this.field186 -= (this.field186 - var3) * this.field371 / 1000 + this.field370;
            if (this.field186 < var3) {
                this.field186 = var3;
            }
        }
        int var5 = this.field585 * 128 + 64;
        int var6 = this.field586 * 128 + 64;
        int var7 = this.method129(var5, var6, (byte) 111, this.field180) - this.field587;
        int var8 = var5 - this.field184;
        int var9 = var7 - this.field185;
        int var10 = var6 - this.field186;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field187 < var12) {
            this.field187 += (var12 - this.field187) * this.field589 / 1000 + this.field588;
            if (this.field187 > var12) {
                this.field187 = var12;
            }
        }
        if (this.field187 > var12) {
            this.field187 -= (this.field187 - var12) * this.field589 / 1000 + this.field588;
            if (this.field187 < var12) {
                this.field187 = var12;
            }
        }
        int var14 = var13 - this.field188;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field188 += this.field589 * var14 / 1000 + this.field588;
            this.field188 &= 2047;
        }
        if (var14 < 0) {
            this.field188 -= -var14 * this.field589 / 1000 + this.field588;
            this.field188 &= 2047;
        }
        int var15 = var13 - this.field188;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field188 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field234 = Integer.parseInt(this.getParameter("nodeid"));
        field235 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method130(15665);
        } else {
            method171(-229);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field236 = false;
        } else {
            field236 = true;
        }
        this.method13(765, -893, 503);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIIIZIIIII)Z")
    public final boolean method155(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field520[var15][var36] = 0;
                this.field542[var15][var36] = 99999999;
            }
        }
        int var16 = arg8;
        int var17 = arg5;
        this.field520[arg8][arg5] = 99;
        this.field542[arg8][arg5] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field175[var18] = arg8;
        int var37 = var18 + 1;
        this.field176[var18] = arg5;
        boolean var20 = false;
        int var21 = this.field175.length;
        int[][] var22 = this.field385[this.field180].field761;
        while (var37 != var19) {
            var16 = this.field175[var19];
            var17 = this.field176[var19];
            var19 = (var19 + 1) % var21;
            if (arg0 == var16 && arg2 == var17) {
                var20 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && this.field385[this.field180].method209(var16, arg0, arg11 - 1, true, arg2, var17, arg9)) {
                    var20 = true;
                    break;
                }
                if (arg11 < 10 && this.field385[this.field180].method210(arg9, arg2, arg11 - 1, arg0, this.field286, var17, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg4 != 0 && this.field385[this.field180].method211(false, arg0, var17, arg2, arg10, var16, arg4, arg7)) {
                var20 = true;
                break;
            }
            int var35 = this.field542[var16][var17] + 1;
            if (var16 > 0 && this.field520[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field175[var37] = var16 - 1;
                this.field176[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field520[var16 - 1][var17] = 2;
                this.field542[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field520[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field175[var37] = var16 + 1;
                this.field176[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field520[var16 + 1][var17] = 8;
                this.field542[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field520[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field175[var37] = var16;
                this.field176[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field520[var16][var17 - 1] = 1;
                this.field542[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field520[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field175[var37] = var16;
                this.field176[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field520[var16][var17 + 1] = 4;
                this.field542[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field520[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field175[var37] = var16 - 1;
                this.field176[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field520[var16 - 1][var17 - 1] = 3;
                this.field542[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field520[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field175[var37] = var16 + 1;
                this.field176[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field520[var16 + 1][var17 - 1] = 9;
                this.field542[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field520[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field175[var37] = var16 - 1;
                this.field176[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field520[var16 - 1][var17 + 1] = 6;
                this.field542[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field520[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field175[var37] = var16 + 1;
                this.field176[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field520[var16 + 1][var17 + 1] = 12;
                this.field542[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field414 = 0;
        if (arg1 == 6) {
            boolean var23 = false;
        } else {
            this.field454 = !this.field454;
        }
        if (!var20) {
            if (arg6) {
                int var24 = 100;
                for (int var25 = 1; var25 < 2; ++var25) {
                    for (int var26 = arg0 - var25; var26 <= arg0 + var25; ++var26) {
                        for (int var27 = arg2 - var25; var27 <= arg2 + var25; ++var27) {
                            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field542[var26][var27] < var24) {
                                var24 = this.field542[var26][var27];
                                var16 = var26;
                                var17 = var27;
                                this.field414 = 1;
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
        byte var28 = 0;
        this.field175[var28] = var16;
        int var38 = var28 + 1;
        this.field176[var28] = var17;
        int var29;
        int var30 = var29 = this.field520[var16][var17];
        while (arg8 != var16 || arg5 != var17) {
            if (var29 != var30) {
                var29 = var30;
                this.field175[var38] = var16;
                this.field176[var38++] = var17;
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
            var30 = this.field520[var16][var17];
        }
        if (var38 <= 0) {
            if (arg3 == 1) {
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
            int var32 = this.field175[var38];
            int var33 = this.field176[var38];
            if (arg3 == 0) {
                this.field623.method213(-164, 246);
                this.field623.method214(var31 + var31 + 3);
            }
            if (arg3 == 1) {
                this.field623.method213(-164, 147);
                this.field623.method214(var31 + var31 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field623.method213(-164, 216);
                this.field623.method214(var31 + var31 + 3);
            }
            this.field623.method240(-8063, super.field102[5] == 1 ? 1 : 0);
            this.field623.method249(-133, this.field610 + var33);
            this.field438 = this.field175[0];
            this.field439 = this.field176[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field623.method240(-8063, this.field175[var38] - var32);
                this.field623.method241(0, this.field176[var38] - var33);
            }
            this.field623.method249(-133, this.field609 + var32);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method156(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field261 = 332;
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIRYXZZFE;IBII)V")
    public final void method157(class27 arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg0.field922 == 0 && arg0.field911 != null) {
            if (!arg0.field917 || this.field388 == arg0.field914 || this.field255 == arg0.field914 || this.field271 == arg0.field914) {
                int var6 = class26.field881;
                int var7 = class26.field879;
                int var8 = class26.field882;
                int var9 = class26.field880;
                class26.method312(arg0.field932 + arg1, arg0.field910 + arg3, arg1, this.field214, arg3);
                int var10 = arg0.field911.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg0.field933[var11] + arg1;
                    int var13 = arg0.field960[var11] + arg3 - arg4;
                    class27 var14 = class27.method329(arg0.field911[var11]);
                    int var15 = var14.field937 + var12;
                    int var16 = var14.field907 + var13;
                    if (var14.field891 > 0) {
                        this.method112(var14, this.field620);
                    }
                    if (var14.field922 == 0) {
                        if (var14.field928 > var14.field921 - var14.field910) {
                            var14.field928 = var14.field921 - var14.field910;
                        }
                        if (var14.field928 < 0) {
                            var14.field928 = 0;
                        }
                        this.method157(var14, var15, (byte) 79, var16, var14.field928);
                        if (var14.field921 > var14.field910) {
                            this.method55(var14.field928, var14.field910, var14.field921, var14.field932 + var15, false, var16);
                        }
                    } else if (var14.field922 != 1) {
                        if (var14.field922 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field910; ++var18) {
                                for (int var19 = 0; var19 < var14.field932; ++var19) {
                                    int var20 = (var14.field942 + 32) * var19 + var15;
                                    int var21 = (var14.field915 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field935[var17];
                                        var21 += var14.field893[var17];
                                    }
                                    if (var14.field947[var17] <= 0) {
                                        if (var14.field957 != null && var17 < 20) {
                                            class40 var30 = var14.field957[var17];
                                            if (var30 != null) {
                                                var30.method404(var20, this.field527, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field947[var17] - 1;
                                        if (var20 > class26.field881 - 32 && var20 < class26.field882 && var21 > class26.field879 - 32 && var21 < class26.field880 || this.field582 != 0 && this.field581 == var17) {
                                            int var25 = 0;
                                            if (this.field545 == 1 && this.field546 == var17 && this.field547 == var14.field914) {
                                                var25 = 16777215;
                                            }
                                            class40 var26 = class67.method524(var24, (byte) -123, var25, var14.field909[var17]);
                                            if (var26 != null) {
                                                if (this.field582 != 0 && this.field581 == var17 && this.field580 == var14.field914) {
                                                    var22 = super.field92 - this.field583;
                                                    var23 = super.field93 - this.field584;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field444 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method406(128, var20 + var22, var21 + var23, this.field374);
                                                    if (var21 + var23 < class26.field879 && arg0.field928 > 0) {
                                                        int var27 = (class26.field879 - var21 - var23) * this.field447 / 3;
                                                        if (var27 > this.field447 * 10) {
                                                            var27 = this.field447 * 10;
                                                        }
                                                        if (var27 > arg0.field928) {
                                                            var27 = arg0.field928;
                                                        }
                                                        arg0.field928 -= var27;
                                                        this.field584 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class26.field880 && arg0.field928 < arg0.field921 - arg0.field910) {
                                                        int var28 = (var21 + var23 + 32 - class26.field880) * this.field447 / 3;
                                                        if (var28 > this.field447 * 10) {
                                                            var28 = this.field447 * 10;
                                                        }
                                                        if (var28 > arg0.field921 - arg0.field910 - arg0.field928) {
                                                            var28 = arg0.field921 - arg0.field910 - arg0.field928;
                                                        }
                                                        arg0.field928 += var28;
                                                        this.field584 -= var28;
                                                    }
                                                } else if (this.field503 != 0 && this.field502 == var17 && this.field501 == var14.field914) {
                                                    var26.method406(128, var20, var21, this.field374);
                                                } else {
                                                    var26.method404(var20, this.field527, var21);
                                                }
                                                if (var26.field1180 == 33 || var14.field909[var17] != 1) {
                                                    int var29 = var14.field909[var17];
                                                    this.field422.method377(method167(var29, -8), var21 + 10 + var23, var20 + 1 + var22, 0, 0);
                                                    this.field422.method377(method167(var29, -8), var21 + 9 + var23, var20 + var22, 0, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field922 == 3) {
                            boolean var31 = false;
                            if (this.field271 == var14.field914 || this.field255 == var14.field914 || this.field388 == var14.field914) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method45(var14, (byte) 21)) {
                                var32 = var14.field900;
                                if (var31 && var14.field940 != 0) {
                                    var32 = var14.field940;
                                }
                            } else {
                                var32 = var14.field892;
                                if (var31 && var14.field890 != 0) {
                                    var32 = var14.field890;
                                }
                            }
                            if (var14.field913 == 0) {
                                if (var14.field908) {
                                    class26.method315(var32, var15, 99, var14.field932, var14.field910, var16);
                                } else {
                                    class26.method316(var16, var14.field932, var15, -110, var14.field910, var32);
                                }
                            } else if (var14.field908) {
                                class26.method314(var14.field910, false, var15, 256 - (var14.field913 & 255), var16, var14.field932, var32);
                            } else {
                                class26.method317(var14.field932, var32, 0, var15, var16, 256 - (var14.field913 & 255), var14.field910);
                            }
                        } else if (var14.field922 == 4) {
                            class34 var33 = var14.field953;
                            String var34 = var14.field918;
                            boolean var35 = false;
                            if (this.field271 == var14.field914 || this.field255 == var14.field914 || this.field388 == var14.field914) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method45(var14, (byte) 21)) {
                                var36 = var14.field900;
                                if (var35 && var14.field940 != 0) {
                                    var36 = var14.field940;
                                }
                                if (var14.field954.length() > 0) {
                                    var34 = var14.field954;
                                }
                            } else {
                                var36 = var14.field892;
                                if (var35 && var14.field890 != 0) {
                                    var36 = var14.field890;
                                }
                            }
                            if (var14.field934 == 6 && this.field446) {
                                var34 = "Please wait...";
                                var36 = var14.field892;
                            }
                            if (class26.field877 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1103 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method107(this.method44(var14, -29344, 4), (byte) 93) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method107(this.method44(var14, -29344, 3), (byte) 93) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method107(this.method44(var14, -29344, 2), (byte) 93) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method107(this.method44(var14, -29344, 1), (byte) 93) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method107(this.method44(var14, -29344, 0), (byte) 93) + var34.substring(var38 + 2);
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
                                if (var14.field936) {
                                    var33.method374(-8, var14.field932 / 2 + var15, var44, var37, var14.field894, var36);
                                } else {
                                    var33.method381(var15, var37, var14.field894, var36, var44, -98);
                                }
                                var37 += var33.field1103;
                            }
                        } else if (var14.field922 == 5) {
                            class40 var45;
                            if (this.method45(var14, (byte) 21)) {
                                var45 = var14.field930;
                            } else {
                                var45 = var14.field927;
                            }
                            if (var45 != null) {
                                var45.method404(var15, this.field527, var16);
                            }
                        } else if (var14.field922 == 6) {
                            int var46 = class21.field816;
                            int var47 = class21.field817;
                            class21.field816 = var14.field932 / 2 + var15;
                            class21.field817 = var14.field910 / 2 + var16;
                            int var48 = class21.field820[var14.field950] * var14.field949 >> 16;
                            int var49 = class21.field821[var14.field950] * var14.field949 >> 16;
                            boolean var50 = this.method45(var14, (byte) 21);
                            int var51;
                            if (var50) {
                                var51 = var14.field899;
                            } else {
                                var51 = var14.field898;
                            }
                            class31 var52;
                            if (var51 == -1) {
                                var52 = var14.method326(-1, -1, var50, true);
                            } else {
                                class41 var53 = class41.field1184[var51];
                                var52 = var14.method326(var53.field1186[var14.field948], var53.field1187[var14.field948], var50, true);
                            }
                            if (var52 != null) {
                                var52.method360(0, var14.field951, 0, var14.field950, 0, var48, var49);
                            }
                            class21.field816 = var46;
                            class21.field817 = var47;
                        } else {
                            if (var14.field922 == 7) {
                                class34 var54 = var14.field953;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field910; ++var56) {
                                    for (int var57 = 0; var57 < var14.field932; ++var57) {
                                        if (var14.field947[var55] > 0) {
                                            class67 var58 = class67.method526(var14.field947[var55] - 1);
                                            String var59 = var58.field1533;
                                            if (var58.field1526 || var14.field909[var55] != 1) {
                                                var59 = var59 + " x" + method53((byte) 71, var14.field909[var55]);
                                            }
                                            int var60 = (var14.field942 + 115) * var57 + var15;
                                            int var61 = (var14.field915 + 12) * var56 + var16;
                                            if (var14.field936) {
                                                var54.method374(-8, var14.field932 / 2 + var60, var59, var61, var14.field894, var14.field892);
                                            } else {
                                                var54.method381(var60, var61, var14.field894, var14.field892, var59, -98);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field922 == 8 && (this.field530 == var14.field914 || this.field203 == var14.field914 || this.field302 == var14.field914) && this.field278 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class34 var64 = this.field423;
                                String var65 = var14.field918;
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
                                    int var74 = var64.method375(var73, true);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1103 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field932 + var15 - 5 - var62;
                                int var67 = var14.field910 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg0.field932 + arg1) {
                                    var66 = arg0.field932 + arg1 - var62;
                                }
                                class26.method315(16777120, var66, 99, var62, var63, var67);
                                class26.method316(var67, var62, var66, -110, var63, 0);
                                String var68 = var14.field918;
                                int var69 = var64.field1103 + var67 + 2;
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
                                    var64.method381(var66 + 3, var69, false, 0, var71, -98);
                                    var69 += var64.field1103 + 1;
                                }
                            }
                        }
                    }
                }
                if (arg2 == 79) {
                    class26.method312(var8, var9, var6, this.field214, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (this.field582 == 0) {
            this.field273[0] = "Cancel";
            this.field348[0] = 1921;
            if (arg0 != -53) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field412 = 1;
            if (this.field631 != -1) {
                this.field524 = 0;
                this.field394 = 0;
                this.method128(0, class27.method329(this.field631), 0, -618, super.field93, super.field92, 0, 0);
                if (this.field524 != this.field388) {
                    this.field388 = this.field524;
                }
                if (this.field394 != this.field302) {
                    this.field302 = this.field394;
                }
            } else {
                this.method47(false);
                this.field524 = 0;
                this.field394 = 0;
                if (super.field92 > 4 && super.field93 > 4 && super.field92 < 516 && super.field93 < 338) {
                    if (this.field265 != -1) {
                        this.method128(0, class27.method329(this.field265), 0, -618, super.field93, super.field92, 4, 4);
                    } else {
                        this.method148(47798);
                    }
                }
                if (this.field524 != this.field388) {
                    this.field388 = this.field524;
                }
                if (this.field394 != this.field302) {
                    this.field302 = this.field394;
                }
                this.field524 = 0;
                this.field394 = 0;
                if (super.field92 > 553 && super.field93 > 205 && super.field92 < 743 && super.field93 < 466) {
                    if (this.field519 != -1) {
                        this.method128(0, class27.method329(this.field519), 1, -618, super.field93, super.field92, 205, 553);
                    } else if (this.field571[this.field365] != -1) {
                        this.method128(0, class27.method329(this.field571[this.field365]), 1, -618, super.field93, super.field92, 205, 553);
                    }
                }
                if (this.field524 != this.field255) {
                    this.field541 = true;
                    this.field255 = this.field524;
                }
                if (this.field394 != this.field203) {
                    this.field541 = true;
                    this.field203 = this.field394;
                }
                this.field524 = 0;
                this.field394 = 0;
                if (super.field92 > 17 && super.field93 > 357 && super.field92 < 496 && super.field93 < 453) {
                    if (this.field499 != -1) {
                        this.method128(0, class27.method329(this.field499), 2, -618, super.field93, super.field92, 357, 17);
                    } else if (this.field629 != -1) {
                        this.method128(0, class27.method329(this.field629), 3, -618, super.field93, super.field92, 357, 17);
                    } else if (super.field93 < 434 && super.field92 < 426) {
                        this.method50(super.field93 - 357, -435, super.field92 - 17);
                    }
                }
                if ((this.field499 != -1 || this.field629 != -1) && this.field524 != this.field271) {
                    this.field642 = true;
                    this.field271 = this.field524;
                }
                if ((this.field499 != -1 || this.field629 != -1) && this.field530 != this.field394) {
                    this.field642 = true;
                    this.field530 = this.field394;
                }
                boolean var3 = false;
                while (!var3) {
                    var3 = true;
                    for (int var4 = 0; var4 < this.field412 - 1; ++var4) {
                        if (this.field348[var4] < 1000 && this.field348[var4 + 1] > 1000) {
                            String var5 = this.field273[var4];
                            this.field273[var4] = this.field273[var4 + 1];
                            this.field273[var4 + 1] = var5;
                            int var6 = this.field348[var4];
                            this.field348[var4] = this.field348[var4 + 1];
                            this.field348[var4 + 1] = var6;
                            int var7 = this.field346[var4];
                            this.field346[var4] = this.field346[var4 + 1];
                            this.field346[var4 + 1] = var7;
                            int var8 = this.field347[var4];
                            this.field347[var4] = this.field347[var4 + 1];
                            this.field347[var4 + 1] = var8;
                            int var9 = this.field349[var4];
                            this.field349[var4] = this.field349[var4 + 1];
                            this.field349[var4 + 1] = var9;
                            var3 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)I")
    public final int method159(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field289 = this.field625.method580();
        }
        int var5 = 256 - arg2;
        return ((arg0 & 16711935) * arg2 + (arg3 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg2 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHCPBXDEK;)V")
    private final void method160(int arg0, class23 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field853 == 0) {
            var3 = this.field407.method554(arg1.field852, arg1.field854, arg1.field855);
        }
        if (arg1.field853 == 1) {
            var3 = this.field407.method555(642, arg1.field852, arg1.field855, arg1.field854);
        }
        if (arg1.field853 == 2) {
            var3 = this.field407.method556(arg1.field852, arg1.field854, arg1.field855);
        }
        if (arg1.field853 == 3) {
            var3 = this.field407.method557(arg1.field852, arg1.field854, arg1.field855);
        }
        if (var3 != 0) {
            int var7 = this.field407.method558(arg1.field852, arg1.field854, arg1.field855, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field848 = var4;
        while (arg0 >= 0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        arg1.field850 = var5;
        arg1.field849 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method161(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field512 = "";
                this.field513 = "Connecting to server...";
                this.method149(true, 326);
            }
            this.field579 = new class1(0, this, this.method85(field235 + 43594));
            long var4 = class33.method366(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field623.field779 = 0;
            this.field623.method214(14);
            this.field623.method214(var6);
            this.field579.method5(0, this.field623.field778, 2, (byte) 1);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field579.method2();
            }
            int var8 = this.field579.method2();
            int var9 = var8;
            if (var8 == 0) {
                this.field579.method4(this.field222.field778, 0, 8);
                this.field222.field779 = 0;
                this.field517 = this.field222.method230(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field517 >> 32), (int) this.field517 };
                this.field623.field779 = 0;
                this.field623.method214(10);
                this.field623.method218(var10[0]);
                this.field623.method218(var10[1]);
                this.field623.method218(var10[2]);
                this.field623.method218(var10[3]);
                this.field623.method218(signlink.uid);
                this.field623.method221(arg0);
                this.field623.method221(arg1);
                this.field623.method239(this.field270, field401, field296);
                this.field621.field779 = 0;
                if (arg2) {
                    this.field621.method214(18);
                } else {
                    this.field621.method214(16);
                }
                this.field621.method214(this.field623.field779 + 36 + 1 + 1 + 2);
                this.field621.method214(255);
                this.field621.method215(349);
                this.field621.method214(field237 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field621.method218(this.field306[var11]);
                }
                this.field621.method222(this.field623.field779, this.field623.field778, 0, (byte) 44);
                this.field623.field783 = new class70(var10, 7);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field625 = new class70(var10, 7);
                this.field579.method5(0, this.field621.field778, this.field621.field779, (byte) 1);
                var8 = this.field579.method2();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method161(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field181 = this.field579.method2();
                field377 = this.field579.method2() == 1;
                this.field298 = 0L;
                this.field218 = 0;
                this.field242.field1410 = 0;
                super.field89 = true;
                this.field486 = true;
                this.field578 = true;
                this.field623.field779 = 0;
                this.field222.field779 = 0;
                this.field434 = -1;
                this.field227 = -1;
                this.field228 = -1;
                this.field229 = -1;
                this.field433 = 0;
                this.field435 = 0;
                this.field470 = 0;
                this.field437 = 0;
                this.field281 = 0;
                this.field412 = 0;
                this.field392 = false;
                super.field90 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field560[var13] = null;
                }
                this.field545 = 0;
                this.field636 = 0;
                this.field179 = 0;
                this.field615 = 0;
                this.field287 = (int) (Math.random() * 100.0D) - 50;
                this.field574 = (int) (Math.random() * 110.0D) - 55;
                this.field616 = (int) (Math.random() * 80.0D) - 40;
                this.field323 = (int) (Math.random() * 120.0D) - 60;
                this.field599 = (int) (Math.random() * 30.0D) - 20;
                this.field633 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field594 = 0;
                this.field252 = -1;
                this.field438 = 0;
                this.field439 = 0;
                this.field565 = 0;
                this.field232 = 0;
                for (int var14 = 0; var14 < this.field562; ++var14) {
                    this.field564[var14] = null;
                    this.field569[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field231[var15] = null;
                }
                field299 = this.field564[this.field563] = new class5();
                this.field260.method279();
                this.field308.method279();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field406[var16][var17][var18] = null;
                        }
                    }
                }
                this.field525 = new class20(807);
                this.field174 = 0;
                this.field173 = 0;
                this.method146(this.field629, true);
                this.field629 = -1;
                this.method146(this.field499, true);
                this.field499 = -1;
                this.method146(this.field265, true);
                this.field265 = -1;
                this.method146(this.field631, true);
                this.field631 = -1;
                this.method146(this.field275, true);
                this.field275 = -1;
                this.method146(this.field519, true);
                this.field519 = -1;
                this.method146(this.field378, true);
                this.field378 = -1;
                this.field446 = false;
                this.field365 = 3;
                this.field630 = 0;
                this.field392 = false;
                this.field614 = false;
                this.field321 = null;
                this.field618 = 0;
                this.field533 = -1;
                this.field613 = true;
                this.method80(-279);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field646[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field595[var20] = null;
                    this.field596[var20] = false;
                }
                field526 = 0;
                field279 = 0;
                field201 = 0;
                field294 = 0;
                field246 = 0;
                field337 = 0;
                field395 = 0;
                field194 = 0;
                field619 = 0;
                field327 = 0;
                this.method105(this.field261);
            } else if (var8 == 3) {
                this.field512 = "";
                this.field513 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field512 = "Your account has been disabled.";
                this.field513 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field512 = "Your account is already logged in.";
                this.field513 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field512 = "RuneScape has been updated!";
                this.field513 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field512 = "This world is full.";
                this.field513 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field512 = "Unable to connect.";
                this.field513 = "Login server offline.";
            } else if (var8 == 9) {
                this.field512 = "Login limit exceeded.";
                this.field513 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field512 = "Unable to connect.";
                this.field513 = "Bad session id.";
            } else if (var8 == 11) {
                this.field512 = "Login server rejected session.";
                this.field513 = "Please try again.";
            } else if (var8 == 12) {
                this.field512 = "You need a members account to login to this world.";
                this.field513 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field512 = "Could not complete login.";
                this.field513 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field512 = "The server is being updated.";
                this.field513 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field578 = true;
                this.field623.field779 = 0;
                this.field222.field779 = 0;
                this.field434 = -1;
                this.field227 = -1;
                this.field228 = -1;
                this.field229 = -1;
                this.field433 = 0;
                this.field435 = 0;
                this.field470 = 0;
                this.field412 = 0;
                this.field392 = false;
                this.field240 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field512 = "Login attempts exceeded.";
                this.field513 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field512 = "You are standing in a members-only area.";
                this.field513 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field512 = "Invalid loginserver requested";
                this.field513 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field512 = "Malformed login packet.";
                    this.field513 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field598 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field598;
                            this.method161(arg0, arg1, arg2);
                        } else {
                            this.field512 = "No response from loginserver";
                            this.field513 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field512 = "No response from server";
                        this.field513 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field512 = "Unexpected server response";
                    this.field513 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field579.method2();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field512 = "You have only just left another world";
                    this.field513 = "Your profile will be transferred in: " + var26;
                    this.method149(true, 326);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method161(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field512 = "";
            this.field513 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method162(int arg0) {
        int var2 = 31 / arg0;
        if (this.field178 == 0) {
            int var3 = super.field82 / 2 - 80;
            int var4 = super.field83 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field98 == 1 && super.field99 >= var3 - 75 && super.field99 <= var3 + 75 && super.field100 >= var15 - 20 && super.field100 <= var15 + 20) {
                this.field178 = 3;
                this.field291 = 0;
            }
            int var5 = super.field82 / 2 + 80;
            if (super.field98 == 1 && super.field99 >= var5 - 75 && super.field99 <= var5 + 75 && super.field100 >= var15 - 20 && super.field100 <= var15 + 20) {
                this.field512 = "";
                this.field513 = "Enter your username & password.";
                this.field178 = 2;
                this.field291 = 0;
            }
        } else if (this.field178 == 2) {
            int var6 = super.field83 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field98 == 1 && super.field100 >= var17 - 15 && super.field100 < var17) {
                this.field291 = 0;
            }
            var6 = var17 + 15;
            if (super.field98 == 1 && super.field100 >= var6 - 15 && super.field100 < var6) {
                this.field291 = 1;
            }
            var6 += 15;
            int var7 = super.field82 / 2 - 80;
            int var8 = super.field83 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field98 == 1 && super.field99 >= var7 - 75 && super.field99 <= var7 + 75 && super.field100 >= var18 - 20 && super.field100 <= var18 + 20) {
                this.field598 = 0;
                this.method161(this.field169, this.field170, false);
                if (this.field578) {
                    return;
                }
            }
            int var9 = super.field82 / 2 + 80;
            if (super.field98 == 1 && super.field99 >= var9 - 75 && super.field99 <= var9 + 75 && super.field100 >= var18 - 20 && super.field100 <= var18 + 20) {
                this.field178 = 0;
                this.field169 = "";
                this.field170 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method16(0);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field649.length(); ++var12) {
                        if (var10 == field649.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field291 == 0) {
                        if (var10 == 8 && this.field169.length() > 0) {
                            this.field169 = this.field169.substring(0, this.field169.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field291 = 1;
                        }
                        if (var11) {
                            this.field169 = this.field169 + (char) var10;
                        }
                        if (this.field169.length() > 12) {
                            this.field169 = this.field169.substring(0, 12);
                        }
                    } else if (this.field291 == 1) {
                        if (var10 == 8 && this.field170.length() > 0) {
                            this.field170 = this.field170.substring(0, this.field170.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field291 = 0;
                        }
                        if (var11) {
                            this.field170 = this.field170 + (char) var10;
                        }
                        if (this.field170.length() > 20) {
                            this.field170 = this.field170.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field178 == 3) {
                int var13 = super.field82 / 2;
                int var14 = super.field83 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field98 == 1 && super.field99 >= var13 - 75 && super.field99 <= var13 + 75 && super.field100 >= var19 - 20 && super.field100 <= var19 + 20) {
                    this.field178 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method23(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method23(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(ZI)V")
    public final void method163(boolean arg0, int arg1) {
        this.field433 += arg1;
        for (int var3 = 0; var3 < this.field232; ++var3) {
            class43 var4 = this.field231[this.field233[var3]];
            int var5 = (this.field233[var3] << 14) + 536870912;
            if (var4 != null && var4.method10(true) && var4.field1213.field1145 == arg0 && var4.field1213.method392(0)) {
                int var6 = var4.field67 >> 7;
                int var7 = var4.field68 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field54 == 1 && (var4.field67 & 127) == 64 && (var4.field68 & 127) == 64) {
                        if (this.field409[var6][var7] == this.field297) {
                            continue;
                        }
                        this.field409[var6][var7] = this.field297;
                    }
                    if (!var4.field1213.field1128) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field407.method539(var4.field67, var4.field69, this.field180, var4.field68, true, (var4.field54 - 1) * 64 + 60, var4, this.method129(var4.field67, var4.field68, (byte) 111, this.field180), var4.field39, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    private final void method164(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.method17();
        }
        if (this.field179 == 2) {
            for (class23 var3 = (class23) this.field525.method275(); var3 != null; var3 = (class23) this.field525.method277(4)) {
                if (var3.field851 > 0) {
                    --var3.field851;
                }
                if (var3.field851 == 0) {
                    if (var3.field848 < 0 || class44.method436(var3.field850, -11550, var3.field848)) {
                        this.method175(var3.field848, this.field290, var3.field849, var3.field852, var3.field853, var3.field854, var3.field855, var3.field850);
                        var3.method334();
                    }
                } else {
                    if (var3.field856 > 0) {
                        --var3.field856;
                    }
                    if (var3.field856 == 0 && var3.field854 >= 1 && var3.field855 >= 1 && var3.field854 <= 102 && var3.field855 <= 102 && (var3.field845 < 0 || class44.method436(var3.field847, -11550, var3.field845))) {
                        this.method175(var3.field845, this.field290, var3.field846, var3.field852, var3.field853, var3.field854, var3.field855, var3.field847);
                        var3.field856 = -1;
                        if (var3.field848 == var3.field845 && var3.field848 == -1) {
                            var3.method334();
                        } else if (var3.field848 == var3.field845 && var3.field849 == var3.field846 && var3.field850 == var3.field847) {
                            var3.method334();
                        }
                    }
                }
            }
            ++field515;
            if (field515 > 1896) {
                field515 = 0;
                this.field623.method213(-164, 119);
                this.field623.method214(0);
                int var4 = this.field623.field779;
                this.field623.method215((int) (Math.random() * 65536.0D));
                this.field623.method215((int) (Math.random() * 65536.0D));
                this.field623.method214(245);
                this.field623.method215(25901);
                this.field623.method214((int) (Math.random() * 256.0D));
                this.field623.method214(130);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field623.method214(74);
                }
                this.field623.method215(64410);
                this.field623.method214(239);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field623.method215(62571);
                }
                this.field623.method223(this.field623.field779 - var4, this.field241);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEILHLJCE;IB)V")
    private final void method165(class17 arg0, int arg1, byte arg2) {
        arg0.method234(true);
        int var4 = arg0.method235(1, 24335);
        if (this.field309 != arg2) {
            this.field434 = -1;
        }
        if (var4 != 0) {
            int var5 = arg0.method235(2, 24335);
            if (var5 == 0) {
                this.field568[this.field567++] = this.field563;
            } else if (var5 == 1) {
                int var6 = arg0.method235(3, 24335);
                field299.method8(var6, false, true);
                int var7 = arg0.method235(1, 24335);
                if (var7 == 1) {
                    this.field568[this.field567++] = this.field563;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method235(3, 24335);
                field299.method8(var8, true, true);
                int var9 = arg0.method235(3, 24335);
                field299.method8(var9, true, true);
                int var10 = arg0.method235(1, 24335);
                if (var10 == 1) {
                    this.field568[this.field567++] = this.field563;
                }
            } else if (var5 == 3) {
                int var11 = arg0.method235(7, 24335);
                int var12 = arg0.method235(7, 24335);
                this.field180 = arg0.method235(2, 24335);
                int var13 = arg0.method235(1, 24335);
                int var14 = arg0.method235(1, 24335);
                if (var14 == 1) {
                    this.field568[this.field567++] = this.field563;
                }
                field299.method11(false, var11, var12, var13 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method166(byte arg0) {
        if (arg0 != 9) {
            this.field623.method214(71);
        }
        if (super.field98 == 1) {
            if (super.field99 >= 6 && super.field99 <= 106 && super.field100 >= 467 && super.field100 <= 499) {
                this.field498 = (this.field498 + 1) % 4;
                this.field474 = true;
                this.field642 = true;
                this.field623.method213(-164, 124);
                this.field623.method214(this.field498);
                this.field623.method214(this.field355);
                this.field623.method214(this.field386);
            }
            if (super.field99 >= 135 && super.field99 <= 235 && super.field100 >= 467 && super.field100 <= 499) {
                this.field355 = (this.field355 + 1) % 3;
                this.field474 = true;
                this.field642 = true;
                this.field623.method213(-164, 124);
                this.field623.method214(this.field498);
                this.field623.method214(this.field355);
                this.field623.method214(this.field386);
            }
            if (super.field99 >= 273 && super.field99 <= 373 && super.field100 >= 467 && super.field100 <= 499) {
                this.field386 = (this.field386 + 1) % 3;
                this.field474 = true;
                this.field642 = true;
                this.field623.method213(-164, 124);
                this.field623.method214(this.field498);
                this.field623.method214(this.field355);
                this.field623.method214(this.field386);
            }
            if (super.field99 >= 412 && super.field99 <= 512 && super.field100 >= 467 && super.field100 <= 499) {
                if (this.field265 == -1) {
                    this.method88(0);
                    this.field597 = "";
                    this.field487 = false;
                    this.field608 = this.field265 = class27.field887;
                    return;
                }
                this.method126(0, "Please close the interface you have open before using 'report abuse'", "", 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method167(int arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method168(int arg0) {
        while (arg0 >= 0) {
            this.field434 = -1;
        }
        for (class69 var2 = (class69) this.field308.method275(); var2 != null; var2 = (class69) this.field308.method277(4)) {
            if (this.field180 == var2.field1616 && !var2.field1620) {
                if (field553 >= var2.field1627) {
                    var2.method579(this.field447, 8);
                    if (var2.field1620) {
                        var2.method334();
                    } else {
                        this.field407.method539(var2.field1617, 0, var2.field1616, var2.field1618, true, 60, var2, var2.field1619, false, -1);
                    }
                }
            } else {
                var2.method334();
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        if (this.field281 == 2) {
            this.method103(4, (this.field165 - this.field610 << 7) + this.field168, this.field166 * 2, (this.field164 - this.field609 << 7) + this.field167);
            if (arg0) {
                this.field261 = this.field625.method580();
            }
            if (this.field390 > -1 && field553 % 20 < 10) {
                this.field351[0].method404(this.field390 - 12, this.field527, this.field391 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method170(int arg0) {
        this.field488.method463((byte) 58);
        class21.field822 = this.field427;
        this.field430.method270(0, this.field527, 0);
        this.field433 += arg0;
        if (this.field519 != -1) {
            this.method157(class27.method329(this.field519), 0, (byte) 79, 0, 0);
        } else if (this.field571[this.field365] != -1) {
            this.method157(class27.method329(this.field571[this.field365]), 0, (byte) 79, 0, 0);
        }
        if (this.field392 && this.field313 == 1) {
            this.method49(6);
        }
        this.field488.method464(false, 205, super.field84, 553);
        this.field490.method463((byte) 58);
        class21.field822 = this.field428;
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public static final void method171(int arg0) {
        if (arg0 < 0) {
            class68.field1553 = false;
            class21.field811 = false;
            field237 = false;
            class44.field1228 = false;
            class14.field722 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEILHLJCE;BI)V")
    private final void method172(class17 arg0, byte arg1, int arg2) {
        for (int var4 = 0; var4 < this.field567; ++var4) {
            int var5 = this.field568[var4];
            class5 var6 = this.field564[var5];
            int var7 = arg0.method224();
            if ((var7 & 4) != 0) {
                var7 += arg0.method224() << 8;
            }
            this.method151(var7, var6, arg0, var5, false);
        }
        if (arg1 != 8) {
            this.field434 = arg0.method224();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BZZ)V")
    public final void method173(byte[] arg0, boolean arg1, boolean arg2) {
        if (this.field379) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
            if (arg1) {
                this.field406 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)V")
    public final void method174(int arg0) {
        if (arg0 <= 0) {
            this.field623.method214(45);
        }
        this.field640 = 0;
        int var2 = (field299.field67 >> 7) + this.field609;
        int var3 = (field299.field68 >> 7) + this.field610;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field640 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field640 = 1;
        }
        if (this.field640 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field640 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIIII)V")
    private final void method175(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg1) {
            this.field406 = null;
        }
        if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
            if (field237 && this.field180 != arg3) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg4 == 0) {
                var9 = this.field407.method554(arg3, arg5, arg6);
            }
            if (arg4 == 1) {
                var9 = this.field407.method555(642, arg3, arg6, arg5);
            }
            if (arg4 == 2) {
                var9 = this.field407.method556(arg3, arg5, arg6);
            }
            if (arg4 == 3) {
                var9 = this.field407.method557(arg3, arg5, arg6);
            }
            if (var9 != 0) {
                int var13 = this.field407.method558(arg3, arg5, arg6, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg4 == 0) {
                    this.field407.method545(false, arg5, arg3, arg6);
                    class14 var17 = class14.method192(var14);
                    if (var17.field698) {
                        this.field385[arg3].method205(var15, arg5, var17.field705, 4, var16, arg6);
                    }
                }
                if (arg4 == 1) {
                    this.field407.method546(arg3, arg6, 392, arg5);
                }
                if (arg4 == 2) {
                    this.field407.method547(arg6, -89, arg5, arg3);
                    class14 var18 = class14.method192(var14);
                    if (var18.field708 + arg5 > 103 || var18.field708 + arg6 > 103 || var18.field703 + arg5 > 103 || var18.field703 + arg6 > 103) {
                        return;
                    }
                    if (var18.field698) {
                        this.field385[arg3].method206(arg6, this.field192, var18.field708, var18.field703, var16, arg5, var18.field705);
                    }
                }
                if (arg4 == 3) {
                    this.field407.method548(arg6, arg5, 2, arg3);
                    class14 var19 = class14.method192(var14);
                    if (var19.field698 && var19.field699) {
                        this.field385[arg3].method208(arg5, false, arg6);
                    }
                }
            }
            if (arg0 >= 0) {
                int var20 = arg3;
                if (arg3 < 3 && (this.field238[1][arg5][arg6] & 2) == 2) {
                    var20 = arg3 + 1;
                }
                class44.method424(863, this.field385[arg3], this.field407, arg0, arg5, arg7, this.field622, var20, arg6, arg2, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "R", descriptor = "(I)V")
    public final void method176(int arg0) {
        this.field491.method463((byte) 58);
        class21.field822 = this.field426;
        this.field432.method270(0, this.field527, 0);
        if (this.field614) {
            this.field424.method373(0, this.field648, 239, 40, 48419);
            this.field424.method373(128, this.field244 + "*", 239, 60, 48419);
        } else if (this.field630 == 1) {
            this.field424.method373(0, "Enter amount:", 239, 40, 48419);
            this.field424.method373(128, this.field195 + "*", 239, 60, 48419);
        } else if (this.field630 == 2) {
            this.field424.method373(0, "Enter name:", 239, 40, 48419);
            this.field424.method373(128, this.field195 + "*", 239, 60, 48419);
        } else if (this.field321 != null) {
            this.field424.method373(0, this.field321, 239, 40, 48419);
            this.field424.method373(128, "Click to continue", 239, 60, 48419);
        } else if (this.field499 != -1) {
            this.method157(class27.method329(this.field499), 0, (byte) 79, 0, 0);
        } else if (this.field629 != -1) {
            this.method157(class27.method329(this.field629), 0, (byte) 79, 0, 0);
        } else {
            class34 var2 = this.field423;
            int var3 = 0;
            class26.method312(463, 77, 0, this.field214, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field560[var4] != null) {
                    int var6 = this.field558[var4];
                    int var7 = 70 - var3 * 14 + this.field356;
                    String var8 = this.field559[var4];
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
                            var2.method377(this.field560[var4], var7, 4, 0, 0);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field498 == 0 || this.field498 == 1 && this.method179(var8, 4))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field493[0].method270(var10, this.field527, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field493[1].method270(var10, this.field527, var7 - 12);
                                var10 += 14;
                            }
                            var2.method377(var8 + ":", var7, var10, 0, 0);
                            int var11 = var10 + var2.method375(var8, true) + 8;
                            var2.method377(this.field560[var4], var7, var11, 0, 255);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field243 == 0 && (var6 == 7 || this.field355 == 0 || this.field355 == 1 && this.method179(var8, 4))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method377("From", var7, var12, 0, 0);
                            int var13 = var12 + var2.method375("From ", true);
                            if (var9 == 1) {
                                this.field493[0].method270(var13, this.field527, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field493[1].method270(var13, this.field527, var7 - 12);
                                var13 += 14;
                            }
                            var2.method377(var8 + ":", var7, var13, 0, 0);
                            int var14 = var13 + var2.method375(var8, true) + 8;
                            var2.method377(this.field560[var4], var7, var14, 0, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field386 == 0 || this.field386 == 1 && this.method179(var8, 4))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method377(var8 + " " + this.field560[var4], var7, 4, 0, 8388736);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field243 == 0 && this.field355 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method377(this.field560[var4], var7, 4, 0, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field243 == 0 && this.field355 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method377("To " + var8 + ":", var7, 4, 0, 0);
                            var2.method377(this.field560[var4], var7, 12 + var2.method375("To " + var8, true), 0, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field386 == 0 || this.field386 == 1 && this.method179(var8, 4))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method377(var8 + " " + this.field560[var4], var7, 4, 0, 8270336);
                        }
                        ++var3;
                    }
                }
            }
            class26.method311((byte) 2);
            this.field380 = var3 * 14 + 7;
            if (this.field380 < 78) {
                this.field380 = 78;
            }
            this.method55(this.field380 - this.field356 - 77, 77, this.field380, 463, false, 0);
            String var5;
            if (field299 != null && field299.field129 != null) {
                var5 = field299.field129;
            } else {
                var5 = class33.method370(false, this.field169);
            }
            var2.method377(var5 + ":", 90, 4, 0, 0);
            var2.method377(this.field441 + "*", 90, 6 + var2.method375(var5 + ": ", true), 0, 255);
            class26.method318(479, 77, 0, -548, 0);
        }
        if (this.field392 && this.field313 == 2) {
            this.method49(6);
        }
        this.field491.method464(false, 357, super.field84, 17);
        if (arg0 != -27503) {
            this.field274 = !this.field274;
        }
        this.field490.method463((byte) 58);
        class21.field822 = this.field428;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (!this.field543 && !this.field508 && !this.field408) {
            ++field553;
            if (arg0 <= 0) {
                this.field527 = 341;
            }
            if (!this.field578) {
                this.method162(390);
            } else {
                this.method73((byte) 4);
            }
            this.method177(true);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method177(boolean arg0) {
        if (!arg0) {
            this.field406 = null;
        }
        while (true) {
            class12 var2 = this.field602.method599();
            if (var2 == null) {
                return;
            }
            if (var2.field679 == 0) {
                class31.method337(true, var2.field680, var2.field678);
                if ((this.field602.method592(0, var2.field680) & 98) != 0) {
                    this.field541 = true;
                    if (this.field499 != -1 || this.field629 != -1) {
                        this.field642 = true;
                    }
                }
            }
            if (var2.field679 == 1 && var2.field678 != null) {
                class25.method306((byte) 4, var2.field678);
            }
            if (var2.field679 == 2 && this.field452 == var2.field680 && var2.field678 != null) {
                this.method173(var2.field678, false, this.field453);
            }
            if (var2.field679 == 3 && this.field179 == 1) {
                for (int var3 = 0; var3 < this.field416.length; ++var3) {
                    if (this.field190[var3] == var2.field680) {
                        this.field416[var3] = var2.field678;
                        if (var2.field678 == null) {
                            this.field190[var3] = -1;
                        }
                        break;
                    }
                    if (this.field191[var3] == var2.field680) {
                        this.field305[var3] = var2.field678;
                        if (var2.field678 == null) {
                            this.field191[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field679 == 93 && this.field602.method590((byte) -75, var2.field680)) {
                class44.method417(0, new class17(var2.field678, -26583), this.field602);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LODBDSPMH;ZII)V")
    public final void method178(class40 arg0, boolean arg1, int arg2, int arg3) {
        int var5 = this.field633 + this.field323 & 2047;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class31.field1063[var5];
            int var8 = class31.field1064[var5];
            int var9 = var7 * 256 / (this.field599 + 256);
            int var10 = var8 * 256 / (this.field599 + 256);
            int var11 = arg2 * var9 + arg3 * var10 >> 16;
            int var12 = arg2 * var10 - arg3 * var9 >> 16;
            if (!arg1) {
                if (var6 > 2500) {
                    arg0.method410(41457, var11 + 94 - arg0.field1180 / 2 + 4, this.field431, 83 - var12 - arg0.field1181 / 2 - 4);
                } else {
                    arg0.method404(var11 + 94 - arg0.field1180 / 2 + 4, this.field527, 83 - var12 - arg0.field1181 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method179(String arg0, int arg1) {
        if (arg1 != 4) {
            this.field434 = this.field222.method224();
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field173; ++var3) {
                if (arg0.equalsIgnoreCase(this.field523[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field299.field129);
        }
    }

    @OriginalMember(owner = "client", name = "S", descriptor = "(I)V")
    public final void method180(int arg0) {
        if (arg0 == 1) {
            signlink.midiplay = false;
            signlink.midifade = 0;
            signlink.midi = "stop";
        }
    }

    @OriginalMember(owner = "client", name = "T", descriptor = "(I)V")
    public final void method181(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field434 = -1;
        }
        if (super.field98 == 1) {
            if (super.field99 >= 539 && super.field99 <= 573 && super.field100 >= 169 && super.field100 < 205 && this.field571[0] != -1) {
                this.field541 = true;
                this.field365 = 0;
                this.field264 = true;
            }
            if (super.field99 >= 569 && super.field99 <= 599 && super.field100 >= 168 && super.field100 < 205 && this.field571[1] != -1) {
                this.field541 = true;
                this.field365 = 1;
                this.field264 = true;
            }
            if (super.field99 >= 597 && super.field99 <= 627 && super.field100 >= 168 && super.field100 < 205 && this.field571[2] != -1) {
                this.field541 = true;
                this.field365 = 2;
                this.field264 = true;
            }
            if (super.field99 >= 625 && super.field99 <= 669 && super.field100 >= 168 && super.field100 < 203 && this.field571[3] != -1) {
                this.field541 = true;
                this.field365 = 3;
                this.field264 = true;
            }
            if (super.field99 >= 666 && super.field99 <= 696 && super.field100 >= 168 && super.field100 < 205 && this.field571[4] != -1) {
                this.field541 = true;
                this.field365 = 4;
                this.field264 = true;
            }
            if (super.field99 >= 694 && super.field99 <= 724 && super.field100 >= 168 && super.field100 < 205 && this.field571[5] != -1) {
                this.field541 = true;
                this.field365 = 5;
                this.field264 = true;
            }
            if (super.field99 >= 722 && super.field99 <= 756 && super.field100 >= 169 && super.field100 < 205 && this.field571[6] != -1) {
                this.field541 = true;
                this.field365 = 6;
                this.field264 = true;
            }
            if (super.field99 >= 540 && super.field99 <= 574 && super.field100 >= 466 && super.field100 < 502 && this.field571[7] != -1) {
                this.field541 = true;
                this.field365 = 7;
                this.field264 = true;
            }
            if (super.field99 >= 572 && super.field99 <= 602 && super.field100 >= 466 && super.field100 < 503 && this.field571[8] != -1) {
                this.field541 = true;
                this.field365 = 8;
                this.field264 = true;
            }
            if (super.field99 >= 599 && super.field99 <= 629 && super.field100 >= 466 && super.field100 < 503 && this.field571[9] != -1) {
                this.field541 = true;
                this.field365 = 9;
                this.field264 = true;
            }
            if (super.field99 >= 627 && super.field99 <= 671 && super.field100 >= 467 && super.field100 < 502 && this.field571[10] != -1) {
                this.field541 = true;
                this.field365 = 10;
                this.field264 = true;
            }
            if (super.field99 >= 669 && super.field99 <= 699 && super.field100 >= 466 && super.field100 < 503 && this.field571[11] != -1) {
                this.field541 = true;
                this.field365 = 11;
                this.field264 = true;
            }
            if (super.field99 >= 696 && super.field99 <= 726 && super.field100 >= 466 && super.field100 < 503 && this.field571[12] != -1) {
                this.field541 = true;
                this.field365 = 12;
                this.field264 = true;
            }
            if (super.field99 >= 724 && super.field99 <= 758 && super.field100 >= 466 && super.field100 < 502 && this.field571[13] != -1) {
                this.field541 = true;
                this.field365 = 13;
                this.field264 = true;
                return;
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field528[var1] = var0 - 1;
            var0 += var0;
        }
        field603 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field647 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field647[var3] = var2 / 4;
        }
        field649 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}
