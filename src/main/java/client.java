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
public class client extends class25 {

    @OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
    private int[] field198 = new int[500];

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
    private int[] field199 = new int[500];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
    private int[] field200 = new int[500];

    @OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
    private int[] field201 = new int[500];

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
    private volatile boolean field202 = false;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[LLOVQYTIZ;")
    private class38[] field204 = new class38[32];

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
    private int[] field214 = new int[50];

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
    private boolean field215 = false;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field216 = -340;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    private int[] field217 = new int[5];

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[LZLYJLLFY;")
    public class72[] field218 = new class72[5];

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    private int field233 = 3353893;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
    public boolean field234 = true;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field237 = -693;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field238 = 7759444;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "Z")
    private boolean field244 = false;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "Ljava/lang/String;")
    private String field245 = "";

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "Ljava/lang/String;")
    private String field246 = "";

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
    private int[] field252 = new int[5];

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private int field259 = -1;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "[LLOVQYTIZ;")
    private class38[] field265 = new class38[32];

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
    private boolean field267 = false;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "Z")
    private boolean field268 = false;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
    private boolean field281 = false;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "[[[I")
    private int[][][] field282 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    private int field283 = -24060;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "[LVDSFJUIR;")
    private class62[] field284 = new class62[4];

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "Z")
    private boolean field285 = true;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "[I")
    private int[] field287 = new int[class70.field1732];

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
    private int field288 = 5063219;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "LTKPFKOXP;")
    private class59 field292 = class59.method517(1, 28934);

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field295 = 3;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "Ljava/lang/String;")
    private String field296 = "";

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field298 = -17889;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
    private boolean field305 = false;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "Z")
    private boolean field308 = false;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
    private int field309 = -1;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
    private boolean field312 = true;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
    private int[] field314 = new int[5];

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "LIJNDWVIL;")
    private class29 field316 = new class29();

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private final int field317 = 100;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
    private int[] field318 = new int[100];

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "[I")
    private int[] field320 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "id", descriptor = "Z")
    private boolean field321 = false;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
    private int[] field329 = new int[7];

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field330 = new CRC32();

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "[LLOVQYTIZ;")
    private class38[] field331 = new class38[32];

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private int field334 = -20671;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field341 = -38836;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field343 = 2;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
    private boolean field349 = true;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "B")
    private byte field351 = -54;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
    private int field352 = 78;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
    private boolean field355 = false;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
    private int[] field360 = new int[5];

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "[[I")
    private int[][] field362 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
    private int[] field365 = new int[33];

    @OriginalMember(owner = "client!client", name = "be", descriptor = "[I")
    private int[] field366 = new int[100];

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "[Ljava/lang/String;")
    private String[] field367 = new String[100];

    @OriginalMember(owner = "client!client", name = "de", descriptor = "[Ljava/lang/String;")
    private String[] field368 = new String[100];

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "B")
    private byte field369 = 0;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
    private int[] field373 = new int[5];

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "I")
    private int field376 = 128;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "Z")
    private boolean field386 = false;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
    private int[] field387 = new int[50];

    @OriginalMember(owner = "client!client", name = "He", descriptor = "[Z")
    private boolean[] field398 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
    private int[] field399 = new int[151];

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "[I")
    private final int[] field401 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "LSXQMCHPP;")
    private class56 field402 = new class56(5);

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field403 = -1;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "[[I")
    private int[][] field404 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field405 = -1;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
    private int[] field406 = new int[9];

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "[LNPZZPPRD;")
    private class43[] field411 = new class43[2];

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field413 = 1;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "Ljava/lang/String;")
    private String field420 = "";

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "Ljava/lang/String;")
    private String field421 = "";

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
    private int[] field422 = new int[200];

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
    public boolean field428 = false;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "LTKPFKOXP;")
    private class59 field429 = new class59(859, new byte[5000]);

    @OriginalMember(owner = "client!client", name = "of", descriptor = "[LZHNLOFBM;")
    private class71[] field430 = new class71[16384];

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
    public int[] field432 = new int[16384];

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
    private int field435 = -1;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field436 = -1;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
    private int field438 = 2048;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int field439 = 2047;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "[LTINBLEHZ;")
    private class58[] field440 = new class58[this.field438];

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
    public int[] field442 = new int[this.field438];

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
    private int[] field444 = new int[this.field438];

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "[LTKPFKOXP;")
    private class59[] field445 = new class59[this.field438];

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
    private int field446 = -1;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "[I")
    private int[] field456 = new int[33];

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "B")
    private byte field464 = 6;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field468 = -1;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "LSXQMCHPP;")
    private class56 field469 = new class56(5);

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field472 = -1;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "[LLOVQYTIZ;")
    private class38[] field473 = new class38[1000];

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
    private volatile boolean field474 = false;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "B")
    private byte field475 = 111;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field481 = -333;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field483 = -1;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "[J")
    private long[] field486 = new long[100];

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "[Ljava/lang/String;")
    private String[] field487 = new String[500];

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field489 = 1;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
    private int[] field490 = new int[2000];

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "B")
    private byte field492 = 3;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "Z")
    private volatile boolean field495 = false;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "[I")
    private int[] field497 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "[I")
    private int[] field498 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field504 = -1;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
    private int[] field505 = new int[class70.field1732];

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "Ljava/lang/String;")
    private String field506 = "";

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field507 = -1;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
    private boolean field508 = true;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field509 = 14;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
    public int[] field511 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "[Ljava/lang/String;")
    private String[] field512 = new String[5];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "[Z")
    private boolean[] field513 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
    private int field514 = -490;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field516 = 2;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
    private int[] field519 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
    private int[] field520 = new int[1000];

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "Z")
    private boolean field521 = false;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "[[I")
    private int[][] field523 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "Z")
    private boolean field525 = true;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
    private boolean field529 = true;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "[LNPZZPPRD;")
    private class43[] field530 = new class43[100];

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
    private int field537 = 5;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "[LLOVQYTIZ;")
    private class38[] field539 = new class38[8];

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "[Ljava/lang/String;")
    private String[] field548 = new String[200];

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "Ljava/lang/String;")
    private String field552 = "";

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "Z")
    private boolean field553 = false;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "LTKPFKOXP;")
    private class59 field554 = class59.method517(1, 28934);

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "LSXQMCHPP;")
    private class56 field555 = new class56(5);

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "[I")
    private int[] field556 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "[I")
    private int[] field558 = new int[class70.field1732];

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "B")
    private byte field559 = 3;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
    private int[] field560 = new int[256];

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
    public int[] field562 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field566 = -1;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "[I")
    private int[] field567 = new int[151];

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "[J")
    private long[] field568 = new long[200];

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "Z")
    private boolean field569 = false;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
    public int[] field570 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
    private boolean field572 = false;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field573 = -182;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private int field577 = 1;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
    private boolean field579 = true;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field586 = -1;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "Z")
    private boolean field588 = false;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "Z")
    private boolean field589 = false;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field590 = -276;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "LTKPFKOXP;")
    private class59 field591 = class59.method517(1, 28934);

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "[[[LSXQMCHPP;")
    private class56[][][] field594 = new class56[4][104][104];

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "B")
    private byte field595 = 18;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "[LLOVQYTIZ;")
    private class38[] field596 = new class38[100];

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
    private int field600 = -223;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "B")
    private byte field602 = 8;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "B")
    private byte field603 = 73;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
    private boolean field606 = false;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "Z")
    private boolean field607 = false;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "[LLOVQYTIZ;")
    private class38[] field608 = new class38[20];

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "Ljava/lang/String;")
    private String field609 = "";

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "Ljava/lang/String;")
    private String field610 = "";

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "[Ljava/lang/String;")
    private String[] field612 = new String[100];

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
    private int[] field613 = new int[100];

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "Z")
    private boolean field615 = false;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "Z")
    private boolean field618 = false;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field622 = 2;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
    private int[] field624 = new int[50];

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "B")
    private byte field625 = 17;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private int field626 = 577;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
    private boolean field628 = false;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "Ljava/lang/String;")
    private String field633 = "";

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field640 = -1;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "B")
    private byte field642 = -24;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "[B")
    private byte[] field643 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private int field647 = -962;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "Z")
    private boolean field649 = false;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field653 = 50;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
    private int[] field654 = new int[this.field653];

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
    private int[] field655 = new int[this.field653];

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
    private int[] field656 = new int[this.field653];

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
    private int[] field657 = new int[this.field653];

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
    private int[] field658 = new int[this.field653];

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
    private int[] field659 = new int[this.field653];

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "[I")
    private int[] field660 = new int[this.field653];

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "[Ljava/lang/String;")
    private String[] field661 = new String[this.field653];

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field662 = 924;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
    private boolean field663 = false;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private int field664 = 2301979;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
    private int field666 = 2;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "[LNPZZPPRD;")
    private class43[] field667 = new class43[13];

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    private int field672 = -1;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field251 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
    private static boolean field273 = true;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
    public static final int[] field306 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "[[I")
    public static final int[][] field356 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
    private static int[] field374 = new int[99];

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field461;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "Ljava/lang/String;")
    private static String field491;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private static int field496;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private static int field541;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "Z")
    private static boolean field543;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private static int field587;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private static int field619;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
    public static int[] field632;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "B")
    private static byte field634;

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    private static int field191;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    private static int field203;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    private static int field236;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
    private static int field272;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private static int field310;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private static int field319;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
    private static int field388;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private static int field454;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private static int field549;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private static int field576;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private static int field580;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private static int field583;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private static int field601;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private static int field623;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private static int field635;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field637;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
    private static int field641;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
    private int field646;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private static int field648;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "J")
    private long field275;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "J")
    private long field294;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "J")
    private long field297;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "J")
    private long field335;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "J")
    public long field527;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "LFKXPJREN;")
    private class19 field597;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "LAKBGAGNS;")
    private class1 field205;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "LAKBGAGNS;")
    private class1 field206;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "LAKBGAGNS;")
    private class1 field207;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "LAKBGAGNS;")
    private class1 field208;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "LAKBGAGNS;")
    private class1 field209;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "LAKBGAGNS;")
    private class1 field210;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "LAKBGAGNS;")
    private class1 field211;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "LAKBGAGNS;")
    private class1 field212;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "LAKBGAGNS;")
    private class1 field213;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "LAKBGAGNS;")
    private class1 field227;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "LAKBGAGNS;")
    private class1 field228;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "LAKBGAGNS;")
    private class1 field229;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "LAKBGAGNS;")
    private class1 field336;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "LAKBGAGNS;")
    private class1 field337;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "LAKBGAGNS;")
    private class1 field338;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "LAKBGAGNS;")
    private class1 field339;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "LAKBGAGNS;")
    private class1 field673;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "LAKBGAGNS;")
    private class1 field674;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "LAKBGAGNS;")
    private class1 field675;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "LAKBGAGNS;")
    private class1 field676;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "LAKBGAGNS;")
    private class1 field677;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "LAKBGAGNS;")
    private class1 field678;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "LAKBGAGNS;")
    private class1 field679;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "LAKBGAGNS;")
    private class1 field680;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "LAKBGAGNS;")
    private class1 field681;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "LFOFQGQZJ;")
    private class20 field328;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "LJPCEPCNA;")
    private class30 field434;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "LJUPFHAZZ;")
    private class32 field344;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "LLICHOWDY;")
    private class36 field407;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "LLICHOWDY;")
    private class36 field408;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "LLICHOWDY;")
    private class36 field409;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "LLICHOWDY;")
    private class36 field410;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "LLOVQYTIZ;")
    private class38 field315;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "LLOVQYTIZ;")
    private class38 field363;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "LLOVQYTIZ;")
    private class38 field517;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "LLOVQYTIZ;")
    private class38 field531;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "LLOVQYTIZ;")
    private class38 field532;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "LLOVQYTIZ;")
    private class38 field533;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "LLOVQYTIZ;")
    private class38 field534;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "LLOVQYTIZ;")
    private class38 field535;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "LLOVQYTIZ;")
    private class38 field550;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "LLOVQYTIZ;")
    private class38 field551;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "LLOVQYTIZ;")
    private class38 field574;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "LLOVQYTIZ;")
    private class38 field575;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "LLOVQYTIZ;")
    private class38 field604;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "LLOVQYTIZ;")
    private class38 field605;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "LLOVQYTIZ;")
    private class38 field684;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "LNPZZPPRD;")
    private class43 field276;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "LNPZZPPRD;")
    private class43 field277;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "LNPZZPPRD;")
    private class43 field278;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "LNPZZPPRD;")
    private class43 field279;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "LNPZZPPRD;")
    private class43 field280;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "LNPZZPPRD;")
    private class43 field289;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "LNPZZPPRD;")
    private class43 field290;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "LNPZZPPRD;")
    private class43 field291;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "LNPZZPPRD;")
    private class43 field300;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "LNPZZPPRD;")
    private class43 field301;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "LNPZZPPRD;")
    private class43 field302;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "LNPZZPPRD;")
    private class43 field303;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "LNPZZPPRD;")
    private class43 field304;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "LNPZZPPRD;")
    private class43 field447;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "LNPZZPPRD;")
    private class43 field448;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "LNPZZPPRD;")
    private class43 field465;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "LNPZZPPRD;")
    private class43 field466;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "LNPZZPPRD;")
    private class43 field467;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "LNPZZPPRD;")
    private class43 field644;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "LNPZZPPRD;")
    private class43 field645;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "LPDGRVIXR;")
    public class49 field482;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "LPWLKORWL;")
    private class50 field326;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "LTINBLEHZ;")
    public static class58 field219;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "Ljava/lang/String;")
    public String field348;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "Ljava/lang/String;")
    private String field484;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "Ljava/lang/String;")
    public String field503;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "Ljava/lang/String;")
    private String field524;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "Ljava/net/Socket;")
    private Socket field638;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
    public static boolean field416;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "Z")
    private static boolean field485;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
    public static boolean field494;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
    private static boolean field544;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
    private int[] field270;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
    private int[] field271;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "[I")
    private int[] field424;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "[I")
    private int[] field425;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
    private int[] field426;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
    private int[] field427;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "[I")
    private int[] field545;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
    private int[] field546;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
    private int[] field592;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
    private int[] field593;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
    private int[] field668;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "[I")
    private int[] field669;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "[I")
    private int[] field670;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
    private int[] field671;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "[LNPZZPPRD;")
    private class43[] field286;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "[[B")
    private byte[][] field258;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "[[B")
    private byte[][] field353;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "[[[B")
    private byte[][][] field540;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "[[[I")
    private int[][][] field395;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILTKPFKOXP;B)V")
    private final void method34(int arg0, class59 arg1, byte arg2) {
        this.field561 = 0;
        this.field443 = 0;
        this.method179(arg0, this.field602, arg1);
        this.method103(arg1, arg0, 0);
        this.method160(arg1, arg0, -12914);
        if (arg2 != 9) {
            this.field237 = -48;
        }
        this.method175(arg0, arg1, 585);
        for (int var4 = 0; var4 < this.field561; ++var4) {
            int var6 = this.field562[var4];
            if (field493 != this.field440[var6].field29) {
                this.field440[var6] = null;
            }
        }
        if (arg1.field1589 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1589 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field441; ++var5) {
                if (this.field440[this.field442[var5]] == null) {
                    signlink.reporterror(this.field420 + " null entry in pl list - pos:" + var5 + " size:" + this.field441);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method35(int arg0) {
        int var2 = this.field409.method382("Choose Option", (byte) 3);
        for (int var3 = 0; var3 < this.field630; ++var3) {
            int var11 = this.field409.method382(this.field487[var3], (byte) 3);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        while (arg0 >= 0) {
            field273 = !field273;
        }
        int var4 = this.field630 * 15 + 21;
        if (super.field903 > 4 && super.field904 > 4 && super.field903 < 516 && super.field904 < 338) {
            int var5 = super.field903 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field904 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field589 = true;
            this.field260 = 0;
            this.field261 = var5;
            this.field262 = var6;
            this.field263 = var2;
            this.field264 = this.field630 * 15 + 22;
        }
        if (super.field903 > 553 && super.field904 > 205 && super.field903 < 743 && super.field904 < 466) {
            int var7 = super.field903 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field904 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field589 = true;
            this.field260 = 1;
            this.field261 = var7;
            this.field262 = var8;
            this.field263 = var2;
            this.field264 = this.field630 * 15 + 22;
        }
        if (super.field903 > 17 && super.field904 > 357 && super.field903 < 496 && super.field904 < 453) {
            int var9 = super.field903 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field904 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field589 = true;
            this.field260 = 2;
            this.field261 = var9;
            this.field262 = var10;
            this.field263 = var2;
            this.field264 = this.field630 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method36(int arg0) {
        int var2 = this.field390 * 128 + 64;
        int var3 = this.field391 * 128 + 64;
        int var4 = this.method173(var2, this.field417, var3, this.field327) - this.field392;
        if (arg0 <= 0) {
            this.field240 = -1;
        }
        if (this.field193 < var2) {
            this.field193 += (var2 - this.field193) * this.field394 / 1000 + this.field393;
            if (this.field193 > var2) {
                this.field193 = var2;
            }
        }
        if (this.field193 > var2) {
            this.field193 -= (this.field193 - var2) * this.field394 / 1000 + this.field393;
            if (this.field193 < var2) {
                this.field193 = var2;
            }
        }
        if (this.field194 < var4) {
            this.field194 += (var4 - this.field194) * this.field394 / 1000 + this.field393;
            if (this.field194 > var4) {
                this.field194 = var4;
            }
        }
        if (this.field194 > var4) {
            this.field194 -= (this.field194 - var4) * this.field394 / 1000 + this.field393;
            if (this.field194 < var4) {
                this.field194 = var4;
            }
        }
        if (this.field195 < var3) {
            this.field195 += (var3 - this.field195) * this.field394 / 1000 + this.field393;
            if (this.field195 > var3) {
                this.field195 = var3;
            }
        }
        if (this.field195 > var3) {
            this.field195 -= (this.field195 - var3) * this.field394 / 1000 + this.field393;
            if (this.field195 < var3) {
                this.field195 = var3;
            }
        }
        int var5 = this.field449 * 128 + 64;
        int var6 = this.field450 * 128 + 64;
        int var7 = this.method173(var5, this.field417, var6, this.field327) - this.field451;
        int var8 = var5 - this.field193;
        int var9 = var7 - this.field194;
        int var10 = var6 - this.field195;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field196 < var12) {
            this.field196 += (var12 - this.field196) * this.field453 / 1000 + this.field452;
            if (this.field196 > var12) {
                this.field196 = var12;
            }
        }
        if (this.field196 > var12) {
            this.field196 -= (this.field196 - var12) * this.field453 / 1000 + this.field452;
            if (this.field196 < var12) {
                this.field196 = var12;
            }
        }
        int var14 = var13 - this.field197;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field197 += this.field453 * var14 / 1000 + this.field452;
            this.field197 &= 2047;
        }
        if (var14 < 0) {
            this.field197 -= -var14 * this.field453 / 1000 + this.field452;
            this.field197 &= 2047;
        }
        int var15 = var13 - this.field197;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field197 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILTKPFKOXP;)V")
    private final void method37(int arg0, int arg1, class59 arg2) {
        this.field561 = 0;
        if (arg0 == 2) {
            this.field443 = 0;
            this.method40(arg1, arg2, 40961);
            this.method141((byte) 5, arg1, arg2);
            this.method91(arg2, false, arg1);
            for (int var4 = 0; var4 < this.field561; ++var4) {
                int var6 = this.field562[var4];
                if (field493 != this.field430[var6].field29) {
                    this.field430[var6].field1737 = null;
                    this.field430[var6] = null;
                }
            }
            if (arg2.field1589 != arg1) {
                signlink.reporterror(this.field420 + " size mismatch in getnpcpos - pos:" + arg2.field1589 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field431; ++var5) {
                    if (this.field430[this.field432[var5]] == null) {
                        signlink.reporterror(this.field420 + " null entry in npc list - pos:" + var5 + " size:" + this.field431);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method38(int arg0) {
        try {
            this.field405 = -1;
            this.field469.method513();
            this.field555.method513();
            class22.method229(0);
            this.method172(true);
            this.field434.method320(false);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field284[var2].method570();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field540[var3][var4][var5] = 0;
                    }
                }
            }
            class7 var6 = new class7(this.field395, this.field540, 6, 104, 104);
            int var7 = this.field353.length;
            this.field554.method518(122, true);
            if (!this.field521) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field269[var8] >> 8) * 64 - this.field247;
                    int var10 = (this.field269[var8] & 255) * 64 - this.field248;
                    byte[] var11 = this.field353[var8];
                    if (var11 != null) {
                        var6.method23((this.field226 - 6) * 8, var11, var10, var9, (this.field225 - 6) * 8, this.field284, 4);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field269[var12] >> 8) * 64 - this.field247;
                    int var14 = (this.field269[var12] & 255) * 64 - this.field248;
                    byte[] var15 = this.field353[var12];
                    if (var15 == null && this.field226 < 800) {
                        var6.method26(var13, -38997, 64, var14, 64);
                    }
                }
                ++field236;
                if (field236 > 67) {
                    field236 = 0;
                    this.field554.method518(9, true);
                }
                this.field554.method518(122, true);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field258[var16];
                    if (var17 != null) {
                        int var18 = (this.field269[var16] >> 8) * 64 - this.field247;
                        int var19 = (this.field269[var16] & 255) * 64 - this.field248;
                        var6.method32(var17, this.field284, var18, 416, this.field434, var19);
                    }
                }
            }
            if (this.field521) {
                int var20 = 0;
                label256: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field282[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method26(var31 * 8, -38997, 8, var32 * 8, 8);
                                }
                            }
                        }
                        this.field554.method518(122, true);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label256;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field282[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field269.length; ++var43) {
                                            if (this.field269[var43] == var42 && this.field258[var43] != null) {
                                                var6.method24((var40 & 7) * 8, this.field434, var36 * 8, 0, var38, var35 * 8, (var41 & 7) * 8, var39, this.field284, var34, this.field258[var43]);
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
                            int var24 = this.field282[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field269.length; ++var30) {
                                    if (this.field269[var30] == var29 && this.field353[var30] != null) {
                                        var6.method31(var22 * 8, var26, var25, this.field353[var30], var21 * 8, (var28 & 7) * 8, true, (var27 & 7) * 8, this.field284, var20);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method33(var22 * 8, 20, var20, var21 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field554.method518(122, true);
            var6.method21(this.field284, this.field434, true);
            if (this.field338 != null) {
                this.field338.method1(this.field603);
                class22.field843 = this.field426;
            }
            this.field554.method518(122, true);
            int var44 = class7.field109;
            if (var44 > this.field417) {
                var44 = this.field417;
            }
            if (var44 < this.field417 - 1) {
                int var45 = this.field417 - 1;
            }
            if (field544) {
                this.field434.method321(-255, class7.field109);
            } else {
                this.field434.method321(-255, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method152(var46, var47);
                }
            }
            this.method106((byte) 1);
        } catch (Exception var60) {
        }
        class55.field1499.method415();
        if (super.field891 != null) {
            this.field554.method518(159, true);
            this.field554.method523(1057001181);
        }
        if (field544 && signlink.cache_dat != null) {
            int var49 = this.field328.method221(14917, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field328.method212(var50, 30468);
                if ((var51 & 121) == 0) {
                    class45.method432(var50, (byte) 87);
                }
            }
        }
        System.gc();
        class22.method230(20, field619);
        this.field328.method220((byte) 0);
        int var52 = (this.field225 - 6) / 8 - 1;
        int var53 = (this.field225 + 6) / 8 + 1;
        this.field239 += arg0;
        int var54 = (this.field226 - 6) / 8 - 1;
        int var55 = (this.field226 + 6) / 8 + 1;
        if (this.field663) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field328.method217(0, false, var57, var56);
                    if (var58 != -1) {
                        this.field328.method215(3, var58, 687);
                    }
                    int var59 = this.field328.method217(1, false, var57, var56);
                    if (var59 != -1) {
                        this.field328.method215(3, var59, 687);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method39(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field245 = "";
                this.field246 = "Connecting to server...";
                this.method162(true, (byte) 0);
            }
            this.field326 = new class50(this, this.method120(field542 + 43594), (byte) 5);
            long var4 = class12.method182(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field554.field1589 = 0;
            this.field554.method519(14);
            this.field554.method519(var6);
            this.field326.method472(this.field554.field1588, 2, 0, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field326.method469();
            }
            int var8 = this.field326.method469();
            int var9 = var8;
            if (var8 == 0) {
                this.field326.method471(this.field292.field1588, 0, 8);
                this.field292.field1589 = 0;
                this.field294 = this.field292.method535((byte) 37);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field294 >> 32), (int) this.field294 };
                this.field554.field1589 = 0;
                this.field554.method519(10);
                this.field554.method523(var10[0]);
                this.field554.method523(var10[1]);
                this.field554.method523(var10[2]);
                this.field554.method523(var10[3]);
                this.field554.method523(signlink.uid);
                this.field554.method526(arg0);
                this.field554.method526(arg1);
                this.field554.method544((byte) 2, field461, field251);
                this.field591.field1589 = 0;
                if (arg2) {
                    this.field591.method519(18);
                } else {
                    this.field591.method519(16);
                }
                this.field591.method519(this.field554.field1589 + 36 + 1 + 1 + 2);
                this.field591.method519(255);
                this.field591.method520(366);
                this.field591.method519(field544 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field591.method523(this.field406[var11]);
                }
                this.field591.method527(0, this.field554.field1588, this.field554.field1589, this.field662);
                this.field554.field1593 = new class19(var10, false);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field597 = new class19(var10, false);
                this.field326.method472(this.field591.field1588, this.field591.field1589, 0, 0);
                var8 = this.field326.method469();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method39(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field620 = this.field326.method469();
                field416 = this.field326.method469() == 1;
                this.field527 = 0L;
                this.field463 = 0;
                this.field482.field1363 = 0;
                super.field893 = true;
                this.field234 = true;
                this.field428 = true;
                this.field554.field1589 = 0;
                this.field292.field1589 = 0;
                this.field240 = -1;
                this.field563 = -1;
                this.field564 = -1;
                this.field565 = -1;
                this.field239 = 0;
                this.field241 = 0;
                this.field370 = 0;
                this.field243 = 0;
                this.field389 = 0;
                this.field630 = 0;
                this.field589 = false;
                super.field894 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field368[var13] = null;
                }
                this.field499 = 0;
                this.field345 = 0;
                this.field274 = 0;
                this.field361 = 0;
                this.field515 = (int) (Math.random() * 100.0D) - 50;
                this.field342 = (int) (Math.random() * 110.0D) - 55;
                this.field412 = (int) (Math.random() * 80.0D) - 40;
                this.field665 = (int) (Math.random() * 120.0D) - 60;
                this.field488 = (int) (Math.random() * 30.0D) - 20;
                this.field377 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field235 = 0;
                this.field405 = -1;
                this.field682 = 0;
                this.field683 = 0;
                this.field441 = 0;
                this.field431 = 0;
                for (int var14 = 0; var14 < this.field438; ++var14) {
                    this.field440[var14] = null;
                    this.field445[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field430[var15] = null;
                }
                field219 = this.field440[this.field439] = new class58();
                this.field555.method513();
                this.field469.method513();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field594[var16][var17][var18] = null;
                        }
                    }
                }
                this.field402 = new class56(5);
                this.field419 = 0;
                this.field418 = 0;
                this.method157(this.field672, 882);
                this.field672 = -1;
                this.method157(this.field468, 882);
                this.field468 = -1;
                this.method157(this.field403, 882);
                this.field403 = -1;
                this.method157(this.field259, 882);
                this.field259 = -1;
                this.method157(this.field309, 882);
                this.field309 = -1;
                this.method157(this.field446, 882);
                this.field446 = -1;
                this.method157(this.field640, 882);
                this.field640 = -1;
                this.field321 = false;
                this.field295 = 3;
                this.field547 = 0;
                this.field589 = false;
                this.field615 = false;
                this.field524 = null;
                this.field415 = 0;
                this.field566 = -1;
                this.field525 = true;
                this.method46(0);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field360[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field512[var20] = null;
                    this.field513[var20] = false;
                }
                field388 = 0;
                field648 = 0;
                field454 = 0;
                field576 = 0;
                field601 = 0;
                field272 = 0;
                field580 = 0;
                field549 = 0;
                field635 = 0;
                field310 = 0;
                this.method143(false);
            } else if (var8 == 3) {
                this.field245 = "";
                this.field246 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field245 = "Your account has been disabled.";
                this.field246 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field245 = "Your account is already logged in.";
                this.field246 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field245 = "RuneScape has been updated!";
                this.field246 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field245 = "This world is full.";
                this.field246 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field245 = "Unable to connect.";
                this.field246 = "Login server offline.";
            } else if (var8 == 9) {
                this.field245 = "Login limit exceeded.";
                this.field246 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field245 = "Unable to connect.";
                this.field246 = "Bad session id.";
            } else if (var8 == 12) {
                this.field245 = "You need a members account to login to this world.";
                this.field246 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field245 = "Could not complete login.";
                this.field246 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field245 = "The server is being updated.";
                this.field246 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field428 = true;
                this.field554.field1589 = 0;
                this.field292.field1589 = 0;
                this.field240 = -1;
                this.field563 = -1;
                this.field564 = -1;
                this.field565 = -1;
                this.field239 = 0;
                this.field241 = 0;
                this.field370 = 0;
                this.field630 = 0;
                this.field589 = false;
                this.field297 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field245 = "Login attempts exceeded.";
                this.field246 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field245 = "You are standing in a members-only area.";
                this.field246 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field245 = "Invalid loginserver requested";
                this.field246 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field245 = "Malformed login packet.";
                    this.field246 = "Please try again.";
                } else if (var8 == 23) {
                    this.field245 = "No reply from loginserver.";
                    this.field246 = "Please try again.";
                } else if (var8 == 24) {
                    this.field245 = "Error loading your profile.";
                    this.field246 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field245 = "Unexpected loginserver response.";
                    this.field246 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field245 = "This computers address has been blocked";
                    this.field246 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field581 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field581;
                            this.method39(arg0, arg1, arg2);
                        } else {
                            this.field245 = "No response from loginserver";
                            this.field246 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field245 = "No response from server";
                        this.field246 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field245 = "Unexpected server response";
                    this.field246 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field326.method469();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field245 = "You have only just left another world";
                    this.field246 = "Your profile will be transferred in: " + var26;
                    this.method162(true, (byte) 0);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method39(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field245 = "";
            this.field246 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILTKPFKOXP;I)V")
    private final void method40(int arg0, class59 arg1, int arg2) {
        arg1.method539((byte) 5);
        int var4 = arg1.method540(8, true);
        if (var4 < this.field431) {
            for (int var5 = var4; var5 < this.field431; ++var5) {
                this.field562[this.field561++] = this.field432[var5];
            }
        }
        if (var4 > this.field431) {
            signlink.reporterror(this.field420 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field431 = 0;
            if (arg2 != 40961) {
                this.field349 = !this.field349;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field432[var6];
                class71 var8 = this.field430[var7];
                int var9 = arg1.method540(1, true);
                if (var9 == 0) {
                    this.field432[this.field431++] = var7;
                    var8.field29 = field493;
                } else {
                    int var10 = arg1.method540(2, true);
                    if (var10 == 0) {
                        this.field432[this.field431++] = var7;
                        var8.field29 = field493;
                        this.field444[this.field443++] = var7;
                    } else if (var10 == 1) {
                        this.field432[this.field431++] = var7;
                        var8.field29 = field493;
                        int var11 = arg1.method540(3, true);
                        var8.method9(var11, true, false);
                        int var12 = arg1.method540(1, true);
                        if (var12 == 1) {
                            this.field444[this.field443++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field432[this.field431++] = var7;
                        var8.field29 = field493;
                        int var13 = arg1.method540(3, true);
                        var8.method9(var13, true, true);
                        int var14 = arg1.method540(3, true);
                        var8.method9(var14, true, true);
                        int var15 = arg1.method540(1, true);
                        if (var15 == 1) {
                            this.field444[this.field443++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field562[this.field561++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;ILjava/lang/String;I)LJUPFHAZZ;")
    public final class32 method41(byte arg0, int arg1, String arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field218[0] != null) {
                var7 = this.field218[0].method601(arg1, (byte) 4);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field330.reset();
            this.field330.update(var7);
            int var9 = (int) this.field330.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class32(-6438, var7);
        } else {
            int var11 = 0;
            if (arg0 != -54) {
                this.field594 = null;
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method118(arg3, "Requesting " + arg4, 0);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method153(arg2 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class59 var17 = new class59(859, var16);
                    var17.field1589 = 3;
                    int var18 = var17.method533() + 6;
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
                            this.method118(arg3, "Loading " + arg4 + " - " + var23 + "%", 0);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field218[0] != null) {
                            this.field218[0].method602(var7, var7.length, arg1, true);
                        }
                    } catch (Exception var29) {
                        this.field218[0] = null;
                    }
                    if (var7 != null) {
                        this.field330.reset();
                        this.field330.update(var7);
                        int var24 = (int) this.field330.getValue();
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
                            this.method118(arg3, "Game updated - please reload page", 0);
                            var26 = 10;
                        } else {
                            this.method118(arg3, var12 + " - Retrying in " + var26, 0);
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
                    this.field607 = !this.field607;
                }
            }
            return new class32(-6438, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method42(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field522 >= 100) {
                this.method111("Your ignore list is full. Max of 100 hit", 0, "", this.field382);
            } else {
                String var4 = class12.method186(class12.method183(39082, arg0), 7139);
                for (int var5 = 0; var5 < this.field522; ++var5) {
                    if (this.field486[var5] == arg0) {
                        this.method111(var4 + " is already on your ignore list", 0, "", this.field382);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field418; ++var6) {
                    if (this.field568[var6] == arg0) {
                        this.method111("Please remove " + var4 + " from your friend list first", 0, "", this.field382);
                        return;
                    }
                }
                this.field486[this.field522++] = arg0;
                if (arg1 >= 5 && arg1 <= 5) {
                    this.field375 = true;
                    this.field554.method518(74, true);
                    this.field554.method525(arg0, this.field237);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field239 += arg2;
        if (arg6 >= 1 && arg4 >= 1 && arg6 <= 102 && arg4 <= 102) {
            if (field544 && this.field417 != arg5) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field434.method346(arg5, arg6, arg4);
            }
            if (arg7 == 1) {
                var9 = this.field434.method347(arg4, 251, arg5, arg6);
            }
            if (arg7 == 2) {
                var9 = this.field434.method348(arg5, arg6, arg4);
            }
            if (arg7 == 3) {
                var9 = this.field434.method349(arg5, arg6, arg4);
            }
            if (var9 != 0) {
                int var13 = this.field434.method350(arg5, arg6, arg4, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field434.method337(arg4, arg6, arg5, -441);
                    class55 var17 = class55.method499(var14);
                    if (var17.field1503) {
                        this.field284[arg5].method575(arg4, -380, var15, arg6, var16, var17.field1508);
                    }
                }
                if (arg7 == 1) {
                    this.field434.method338(arg5, true, arg6, arg4);
                }
                if (arg7 == 2) {
                    this.field434.method339(arg4, 0, arg6, arg5);
                    class55 var18 = class55.method499(var14);
                    if (var18.field1469 + arg6 > 103 || var18.field1469 + arg4 > 103 || var18.field1515 + arg6 > 103 || var18.field1515 + arg4 > 103) {
                        return;
                    }
                    if (var18.field1503) {
                        this.field284[arg5].method576(var18.field1515, arg6, var18.field1469, var16, arg4, var18.field1508, (byte) 45);
                    }
                }
                if (arg7 == 3) {
                    this.field434.method340(arg6, arg5, arg4, (byte) 1);
                    class55 var19 = class55.method499(var14);
                    if (var19.field1503 && var19.field1511) {
                        this.field284[arg5].method578(arg4, true, arg6);
                    }
                }
            }
            if (arg3 >= 0) {
                int var20 = arg5;
                if (arg5 < 3 && (this.field540[1][arg6][arg4] & 2) == 2) {
                    var20 = arg5 + 1;
                }
                class7.method29(this.field395, this.field284[arg5], arg4, arg1, arg5, this.field434, arg6, (byte) 50, var20, arg3, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)V")
    public final void method44(int arg0, boolean arg1, byte[] arg2) {
        if (this.field579) {
            signlink.midifade = arg1 ? 1 : 0;
            signlink.midisave(arg2, arg2.length);
            if (arg0 <= 0) {
                this.field240 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method45(boolean arg0) {
        this.field428 &= arg0;
        if (this.field639 == 0) {
            int var2 = super.field886 / 2 - 80;
            int var3 = super.field887 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field902 == 1 && super.field903 >= var2 - 75 && super.field903 <= var2 + 75 && super.field904 >= var14 - 20 && super.field904 <= var14 + 20) {
                this.field639 = 3;
                this.field350 = 0;
            }
            int var4 = super.field886 / 2 + 80;
            if (super.field902 == 1 && super.field903 >= var4 - 75 && super.field903 <= var4 + 75 && super.field904 >= var14 - 20 && super.field904 <= var14 + 20) {
                this.field245 = "";
                this.field246 = "Enter your username & password.";
                this.field639 = 2;
                this.field350 = 0;
            }
        } else if (this.field639 == 2) {
            int var5 = super.field887 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field902 == 1 && super.field904 >= var16 - 15 && super.field904 < var16) {
                this.field350 = 0;
            }
            var5 = var16 + 15;
            if (super.field902 == 1 && super.field904 >= var5 - 15 && super.field904 < var5) {
                this.field350 = 1;
            }
            var5 += 15;
            int var6 = super.field886 / 2 - 80;
            int var7 = super.field887 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field902 == 1 && super.field903 >= var6 - 75 && super.field903 <= var6 + 75 && super.field904 >= var17 - 20 && super.field904 <= var17 + 20) {
                this.field581 = 0;
                this.method39(this.field420, this.field421, false);
                if (this.field428) {
                    return;
                }
            }
            int var8 = super.field886 / 2 + 80;
            if (super.field902 == 1 && super.field903 >= var8 - 75 && super.field903 <= var8 + 75 && super.field904 >= var17 - 20 && super.field904 <= var17 + 20) {
                this.field639 = 0;
                this.field420 = "";
                this.field421 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method250((byte) 8);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field491.length(); ++var11) {
                        if (var9 == field491.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field350 == 0) {
                        if (var9 == 8 && this.field420.length() > 0) {
                            this.field420 = this.field420.substring(0, this.field420.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field350 = 1;
                        }
                        if (var10) {
                            this.field420 = this.field420 + (char) var9;
                        }
                        if (this.field420.length() > 12) {
                            this.field420 = this.field420.substring(0, 12);
                        }
                    } else if (this.field350 == 1) {
                        if (var9 == 8 && this.field421.length() > 0) {
                            this.field421 = this.field421.substring(0, this.field421.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field350 = 0;
                        }
                        if (var10) {
                            this.field421 = this.field421 + (char) var9;
                        }
                        if (this.field421.length() > 20) {
                            this.field421 = this.field421.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field639 == 3) {
                int var12 = super.field886 / 2;
                int var13 = super.field887 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field902 == 1 && super.field903 >= var12 - 75 && super.field903 <= var12 + 75 && super.field904 >= var18 - 20 && super.field904 <= var18 + 20) {
                    this.field639 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.field239 += arg0;
        this.field606 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field329[var2] = -1;
            for (int var3 = 0; var3 < class44.field1257; ++var3) {
                if (!class44.field1258[var3].field1264 && class44.field1258[var3].field1259 == var2 + (this.field525 ? 0 : 7)) {
                    this.field329[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method47(int arg0) {
        this.field336.method1(this.field603);
        class22.field843 = this.field425;
        if (arg0 != 0) {
            this.field594 = null;
        }
        this.field465.method421(0, this.field334, 0);
        if (this.field446 != -1) {
            this.method80(0, 0, true, 0, class29.method311(this.field446));
        } else if (this.field320[this.field295] != -1) {
            this.method80(0, 0, true, 0, class29.method311(this.field320[this.field295]));
        }
        if (this.field589 && this.field260 == 1) {
            this.method50((byte) 0);
        }
        this.field336.method2(205, 553, (byte) 6, super.field888);
        this.field338.method1(this.field603);
        class22.field843 = this.field426;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method48(byte arg0) {
        class35 var2 = (class35) this.field555.method509();
        if (arg0 == 4) {
            while (var2 != null) {
                if (this.field417 == var2.field1161 && field493 <= var2.field1159) {
                    if (field493 >= var2.field1158) {
                        if (var2.field1177 > 0) {
                            class71 var3 = this.field430[var2.field1177 - 1];
                            if (var3 != null && var3.field30 >= 0 && var3.field30 < 13312 && var3.field31 >= 0 && var3.field31 < 13312) {
                                var2.method377(var3.field31, this.method173(var3.field30, var2.field1161, var3.field31, this.field327) - var2.field1165, var3.field30, field493, -477);
                            }
                        }
                        if (var2.field1177 < 0) {
                            int var4 = -var2.field1177 - 1;
                            class58 var5;
                            if (this.field504 == var4) {
                                var5 = field219;
                            } else {
                                var5 = this.field440[var4];
                            }
                            if (var5 != null && var5.field30 >= 0 && var5.field30 < 13312 && var5.field31 >= 0 && var5.field31 < 13312) {
                                var2.method377(var5.field31, this.method173(var5.field30, var2.field1161, var5.field31, this.field327) - var2.field1165, var5.field30, field493, -477);
                            }
                        }
                        var2.method378(this.field322, true);
                        this.field434.method331(-18681, (int) var2.field1173, (int) var2.field1174, var2.field1180, (int) var2.field1172, this.field417, 60, -1, false, var2);
                    }
                } else {
                    var2.method588();
                }
                var2 = (class35) this.field555.method511(0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIBIIIIZ)Z")
    public final boolean method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var40 = 0; var40 < var14; ++var40) {
                this.field404[var15][var40] = 0;
                this.field362[var15][var40] = 99999999;
            }
        }
        int var16 = arg3;
        int var17 = arg2;
        this.field404[arg3][arg2] = 99;
        if (arg6 == 9) {
            boolean var18 = false;
        } else {
            this.field594 = null;
        }
        this.field362[arg3][arg2] = 0;
        byte var19 = 0;
        int var20 = 0;
        this.field497[var19] = arg3;
        int var41 = var19 + 1;
        this.field498[var19] = arg2;
        boolean var21 = false;
        int var22 = this.field497.length;
        int[][] var23 = this.field284[this.field417].field1630;
        while (var41 != var20) {
            var16 = this.field497[var20];
            var17 = this.field498[var20];
            var20 = (var20 + 1) % var22;
            if (arg5 == var16 && arg8 == var17) {
                var21 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && this.field284[this.field417].method579(arg8, arg5, arg4, var16, var17, false, arg7 - 1)) {
                    var21 = true;
                    break;
                }
                if (arg7 < 10 && this.field284[this.field417].method580(6, arg8, var16, var17, arg7 - 1, arg5, arg4)) {
                    var21 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg10 != 0 && this.field284[this.field417].method581(arg1, var17, arg10, 749, var16, arg5, arg0, arg8)) {
                var21 = true;
                break;
            }
            int var39 = this.field362[var16][var17] + 1;
            if (var16 > 0 && this.field404[var16 - 1][var17] == 0 && (var23[var16 - 1][var17] & 19398920) == 0) {
                this.field497[var41] = var16 - 1;
                this.field498[var41] = var17;
                var41 = (var41 + 1) % var22;
                this.field404[var16 - 1][var17] = 2;
                this.field362[var16 - 1][var17] = var39;
            }
            if (var16 < var13 - 1 && this.field404[var16 + 1][var17] == 0 && (var23[var16 + 1][var17] & 19399040) == 0) {
                this.field497[var41] = var16 + 1;
                this.field498[var41] = var17;
                var41 = (var41 + 1) % var22;
                this.field404[var16 + 1][var17] = 8;
                this.field362[var16 + 1][var17] = var39;
            }
            if (var17 > 0 && this.field404[var16][var17 - 1] == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field497[var41] = var16;
                this.field498[var41] = var17 - 1;
                var41 = (var41 + 1) % var22;
                this.field404[var16][var17 - 1] = 1;
                this.field362[var16][var17 - 1] = var39;
            }
            if (var17 < var14 - 1 && this.field404[var16][var17 + 1] == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field497[var41] = var16;
                this.field498[var41] = var17 + 1;
                var41 = (var41 + 1) % var22;
                this.field404[var16][var17 + 1] = 4;
                this.field362[var16][var17 + 1] = var39;
            }
            if (var16 > 0 && var17 > 0 && this.field404[var16 - 1][var17 - 1] == 0 && (var23[var16 - 1][var17 - 1] & 19398926) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field497[var41] = var16 - 1;
                this.field498[var41] = var17 - 1;
                var41 = (var41 + 1) % var22;
                this.field404[var16 - 1][var17 - 1] = 3;
                this.field362[var16 - 1][var17 - 1] = var39;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field404[var16 + 1][var17 - 1] == 0 && (var23[var16 + 1][var17 - 1] & 19399043) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field497[var41] = var16 + 1;
                this.field498[var41] = var17 - 1;
                var41 = (var41 + 1) % var22;
                this.field404[var16 + 1][var17 - 1] = 9;
                this.field362[var16 + 1][var17 - 1] = var39;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field404[var16 - 1][var17 + 1] == 0 && (var23[var16 - 1][var17 + 1] & 19398968) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field497[var41] = var16 - 1;
                this.field498[var41] = var17 + 1;
                var41 = (var41 + 1) % var22;
                this.field404[var16 - 1][var17 + 1] = 6;
                this.field362[var16 - 1][var17 + 1] = var39;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field404[var16 + 1][var17 + 1] == 0 && (var23[var16 + 1][var17 + 1] & 19399136) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field497[var41] = var16 + 1;
                this.field498[var41] = var17 + 1;
                var41 = (var41 + 1) % var22;
                this.field404[var16 + 1][var17 + 1] = 12;
                this.field362[var16 + 1][var17 + 1] = var39;
            }
        }
        this.field584 = 0;
        if (!var21) {
            if (!arg11) {
                return false;
            }
            int var24 = 1000;
            int var25 = 100;
            byte var26 = 10;
            for (int var27 = arg5 - var26; var27 <= arg5 + var26; ++var27) {
                for (int var28 = arg8 - var26; var28 <= arg8 + var26; ++var28) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && this.field362[var27][var28] < 100) {
                        int var29 = 0;
                        if (var27 < arg5) {
                            var29 = arg5 - var27;
                        } else if (var27 > arg0 + arg5 - 1) {
                            var29 = var27 - (arg0 + arg5 - 1);
                        }
                        int var30 = 0;
                        if (var28 < arg8) {
                            var30 = arg8 - var28;
                        } else if (var28 > arg8 + arg10 - 1) {
                            var30 = var28 - (arg8 + arg10 - 1);
                        }
                        int var31 = var29 * var29 + var30 * var30;
                        if (var31 < var24 || var24 == var31 && this.field362[var27][var28] < var25) {
                            var24 = var31;
                            var25 = this.field362[var27][var28];
                            var16 = var27;
                            var17 = var28;
                        }
                    }
                }
            }
            if (var24 == 1000) {
                return false;
            }
            if (arg3 == var16 && arg2 == var17) {
                return false;
            }
            this.field584 = 1;
        }
        byte var32 = 0;
        this.field497[var32] = var16;
        int var42 = var32 + 1;
        this.field498[var32] = var17;
        int var33;
        int var34 = var33 = this.field404[var16][var17];
        while (arg3 != var16 || arg2 != var17) {
            if (var33 != var34) {
                var33 = var34;
                this.field497[var42] = var16;
                this.field498[var42++] = var17;
            }
            if ((var34 & 2) != 0) {
                ++var16;
            } else if ((var34 & 8) != 0) {
                --var16;
            }
            if ((var34 & 1) != 0) {
                ++var17;
            } else if ((var34 & 4) != 0) {
                --var17;
            }
            var34 = this.field404[var16][var17];
        }
        if (var42 <= 0) {
            if (arg9 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var35 = var42;
            if (var42 > 25) {
                var35 = 25;
            }
            --var42;
            int var36 = this.field497[var42];
            int var37 = this.field498[var42];
            field576 += var35;
            if (field576 >= 142) {
                this.field554.method518(161, true);
                field576 = 0;
            }
            if (arg9 == 0) {
                this.field554.method518(64, true);
                this.field554.method519(var35 + var35 + 3);
            }
            if (arg9 == 1) {
                this.field554.method518(177, true);
                this.field554.method519(var35 + var35 + 3 + 14);
            }
            if (arg9 == 2) {
                this.field554.method518(181, true);
                this.field554.method519(var35 + var35 + 3);
            }
            this.field554.method554(this.field595, this.field247 + var36);
            this.field554.method554(this.field595, this.field248 + var37);
            this.field682 = this.field497[0];
            this.field683 = this.field498[0];
            for (int var38 = 1; var38 < var35; ++var38) {
                --var42;
                this.field554.method546(this.field497[var42] - var36, 4);
                this.field554.method545((byte) -53, this.field498[var42] - var37);
            }
            this.field554.method546(super.field906[5] == 1 ? 1 : 0, 4);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method50(byte arg0) {
        int var2 = this.field261;
        int var3 = this.field262;
        int var4 = this.field263;
        int var5 = this.field264;
        int var6 = 6116423;
        if (arg0 == 0) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        class26.method256(var2, var4, var3, var6, var5, (byte) 127);
        class26.method256(var2 + 1, var4 - 2, var3 + 1, 0, 16, (byte) 127);
        class26.method257(var2 + 1, var3 + 18, var5 - 19, var4 - 2, 0, 149);
        this.field409.method384("Choose Option", var3 + 14, var2 + 3, this.field285, var6);
        int var9 = super.field896;
        int var10 = super.field897;
        if (this.field260 == 0) {
            var9 -= 4;
            var10 -= 4;
        }
        if (this.field260 == 1) {
            var9 -= 553;
            var10 -= 205;
        }
        if (this.field260 == 2) {
            var9 -= 17;
            var10 -= 357;
        }
        for (int var11 = 0; var11 < this.field630; ++var11) {
            int var12 = (this.field630 - 1 - var11) * 15 + var3 + 31;
            int var13 = 16777215;
            if (var9 > var2 && var9 < var2 + var4 && var10 > var12 - 13 && var10 < var12 + 3) {
                var13 = 16776960;
            }
            this.field409.method388(0, var2 + 3, var12, var13, true, this.field487[var11]);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method51(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field308 = true;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
        this.field339.method1(this.field603);
        class22.field843 = this.field424;
        this.field467.method421(0, this.field334, 0);
        if (this.field615) {
            this.field409.method380(this.field552, (byte) 0, 239, 40, 0);
            this.field409.method380(this.field609 + "*", (byte) 0, 239, 60, 128);
        } else if (this.field547 == 1) {
            this.field409.method380("Enter amount:", (byte) 0, 239, 40, 0);
            this.field409.method380(this.field633 + "*", (byte) 0, 239, 60, 128);
        } else if (this.field547 == 2) {
            this.field409.method380("Enter name:", (byte) 0, 239, 40, 0);
            this.field409.method380(this.field633 + "*", (byte) 0, 239, 60, 128);
        } else if (this.field547 == 3) {
            if (this.field633 != this.field610) {
                this.method146(this.field633, true);
                this.field610 = this.field633;
            }
            class36 var2 = this.field408;
            class26.method253(-76, 0, 0, 463, 77);
            for (int var3 = 0; var3 < this.field611; ++var3) {
                int var4 = var3 * 14 + 18 - this.field614;
                if (var4 > 0 && var4 < 110) {
                    var2.method380(this.field612[var3], (byte) 0, 239, var4, 0);
                }
            }
            class26.method252(132);
            if (this.field611 > 5) {
                this.method105(77, this.field614, 2, this.field611 * 14 + 7, 0, 463);
            }
            if (this.field633.length() == 0) {
                this.field409.method380("Enter object name", (byte) 0, 239, 40, 255);
            } else if (this.field611 == 0) {
                this.field409.method380("No matching objects found, please shorten search", (byte) 0, 239, 40, 0);
            }
            var2.method380(this.field633 + "*", (byte) 0, 239, 90, 0);
            class26.method259(479, 0, 77, 0, (byte) 3);
        } else if (this.field524 != null) {
            this.field409.method380(this.field524, (byte) 0, 239, 40, 0);
            this.field409.method380("Click to continue", (byte) 0, 239, 60, 128);
        } else if (this.field468 != -1) {
            this.method80(0, 0, true, 0, class29.method311(this.field468));
        } else if (this.field672 != -1) {
            this.method80(0, 0, true, 0, class29.method311(this.field672));
        } else {
            class36 var5 = this.field408;
            int var6 = 0;
            class26.method253(-76, 0, 0, 463, 77);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field368[var7] != null) {
                    int var10 = this.field366[var7];
                    int var11 = 70 - var6 * 14 + this.field538;
                    String var12 = this.field367[var7];
                    byte var13 = 0;
                    if (var12 != null && var12.startsWith("@cr1@")) {
                        var12 = var12.substring(5);
                        var13 = 1;
                    }
                    if (var12 != null && var12.startsWith("@cr2@")) {
                        var12 = var12.substring(5);
                        var13 = 2;
                    }
                    if (var10 == 0) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method384(this.field368[var7], var11, 4, this.field285, 0);
                        }
                        ++var6;
                    }
                    if ((var10 == 1 || var10 == 2) && (var10 == 1 || this.field585 == 0 || this.field585 == 1 && this.method110(var12, 6938))) {
                        if (var11 > 0 && var11 < 110) {
                            int var14 = 4;
                            if (var13 == 1) {
                                this.field411[0].method421(var11 - 12, this.field334, var14);
                                var14 += 14;
                            }
                            if (var13 == 2) {
                                this.field411[1].method421(var11 - 12, this.field334, var14);
                                var14 += 14;
                            }
                            var5.method384(var12 + ":", var11, var14, this.field285, 0);
                            int var15 = var14 + var5.method382(var12, (byte) 3) + 8;
                            var5.method384(this.field368[var7], var11, var15, this.field285, 255);
                        }
                        ++var6;
                    }
                    if ((var10 == 3 || var10 == 7) && this.field371 == 0 && (var10 == 7 || this.field364 == 0 || this.field364 == 1 && this.method110(var12, 6938))) {
                        if (var11 > 0 && var11 < 110) {
                            byte var16 = 4;
                            var5.method384("From", var11, var16, this.field285, 0);
                            int var17 = var16 + var5.method382("From ", (byte) 3);
                            if (var13 == 1) {
                                this.field411[0].method421(var11 - 12, this.field334, var17);
                                var17 += 14;
                            }
                            if (var13 == 2) {
                                this.field411[1].method421(var11 - 12, this.field334, var17);
                                var17 += 14;
                            }
                            var5.method384(var12 + ":", var11, var17, this.field285, 0);
                            int var18 = var17 + var5.method382(var12, (byte) 3) + 8;
                            var5.method384(this.field368[var7], var11, var18, this.field285, 8388608);
                        }
                        ++var6;
                    }
                    if (var10 == 4 && (this.field536 == 0 || this.field536 == 1 && this.method110(var12, 6938))) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method384(var12 + " " + this.field368[var7], var11, 4, this.field285, 8388736);
                        }
                        ++var6;
                    }
                    if (var10 == 5 && this.field371 == 0 && this.field364 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method384(this.field368[var7], var11, 4, this.field285, 8388608);
                        }
                        ++var6;
                    }
                    if (var10 == 6 && this.field371 == 0 && this.field364 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method384("To " + var12 + ":", var11, 4, this.field285, 0);
                            var5.method384(this.field368[var7], var11, 12 + var5.method382("To " + var12, (byte) 3), this.field285, 8388608);
                        }
                        ++var6;
                    }
                    if (var10 == 8 && (this.field536 == 0 || this.field536 == 1 && this.method110(var12, 6938))) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method384(var12 + " " + this.field368[var7], var11, 4, this.field285, 8270336);
                        }
                        ++var6;
                    }
                }
            }
            class26.method252(132);
            this.field352 = var6 * 14 + 7;
            if (this.field352 < 78) {
                this.field352 = 78;
            }
            this.method105(77, this.field352 - this.field538 - 77, 2, this.field352, 0, 463);
            String var8;
            if (field219 != null && field219.field1573 != null) {
                var8 = field219.field1573;
            } else {
                var8 = class12.method186(this.field420, 7139);
            }
            var5.method384(var8 + ":", 90, 4, this.field285, 0);
            var5.method384(this.field506 + "*", 90, 6 + var5.method382(var8 + ": ", (byte) 3), this.field285, 255);
            class26.method259(479, 0, 77, 0, (byte) 3);
        }
        if (this.field589 && this.field260 == 2) {
            this.method50((byte) 0);
        }
        this.field339.method2(357, 17, (byte) 6, super.field888);
        this.field338.method1(this.field603);
        if (arg0) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        class22.field843 = this.field426;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLLOVQYTIZ;II)V")
    public final void method53(boolean arg0, class38 arg1, int arg2, int arg3) {
        if (arg1 != null) {
            int var5 = this.field665 + this.field377 & 2047;
            int var6 = arg2 * arg2 + arg3 * arg3;
            if (var6 <= 6400) {
                int var7 = class45.field1339[var5];
                int var8 = class45.field1340[var5];
                int var9 = var7 * 256 / (this.field488 + 256);
                int var10 = var8 * 256 / (this.field488 + 256);
                int var11 = arg2 * var10 + arg3 * var9 >> 16;
                int var12 = arg3 * var10 - arg2 * var9 >> 16;
                if (!arg0) {
                    this.field382 = 443;
                }
                if (var6 > 2500) {
                    arg1.method406(false, this.field466, 83 - var12 - arg1.field1210 / 2 - 4, var11 + 94 - arg1.field1209 / 2 + 4);
                } else {
                    arg1.method400(83 - var12 - arg1.field1210 / 2 - 4, this.field334, var11 + 94 - arg1.field1209 / 2 + 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LTINBLEHZ;IIII)V")
    public final void method54(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field537 != arg3) {
            this.field577 = 21;
        }
        if (field219 != arg0) {
            if (this.field630 < 400) {
                String var6;
                if (arg0.field1560 == 0) {
                    var6 = arg0.field1573 + method125(0, arg0.field1567, field219.field1567) + " (level-" + arg0.field1567 + ")";
                } else {
                    var6 = arg0.field1573 + " (skill-" + arg0.field1560 + ")";
                }
                if (this.field499 == 1) {
                    this.field487[this.field630] = "Use " + this.field503 + " with @whi@" + var6;
                    this.field200[this.field630] = 8;
                    this.field201[this.field630] = arg2;
                    this.field198[this.field630] = arg1;
                    this.field199[this.field630] = arg4;
                    ++this.field630;
                } else if (this.field345 == 1) {
                    if ((this.field347 & 8) == 8) {
                        this.field487[this.field630] = this.field348 + " @whi@" + var6;
                        this.field200[this.field630] = 493;
                        this.field201[this.field630] = arg2;
                        this.field198[this.field630] = arg1;
                        this.field199[this.field630] = arg4;
                        ++this.field630;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field512[var7] != null) {
                            this.field487[this.field630] = this.field512[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field512[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field1567 > field219.field1567) {
                                    var9 = 2000;
                                }
                                if (field219.field1554 != 0 && arg0.field1554 != 0) {
                                    if (field219.field1554 == arg0.field1554) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field513[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field200[this.field630] = var9 + 246;
                            }
                            if (var7 == 1) {
                                this.field200[this.field630] = var9 + 147;
                            }
                            if (var7 == 2) {
                                this.field200[this.field630] = var9 + 389;
                            }
                            if (var7 == 3) {
                                this.field200[this.field630] = var9 + 51;
                            }
                            if (var7 == 4) {
                                this.field200[this.field630] = var9 + 178;
                            }
                            this.field201[this.field630] = arg2;
                            this.field198[this.field630] = arg1;
                            this.field199[this.field630] = arg4;
                            ++this.field630;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field630; ++var8) {
                    if (this.field200[var8] == 113) {
                        this.field487[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method55(boolean arg0) {
        this.field652 = 0;
        if (arg0) {
            this.field312 = !this.field312;
        }
        for (int var2 = -1; var2 < this.field441 + this.field431; ++var2) {
            class3 var19;
            if (var2 == -1) {
                var19 = field219;
            } else if (var2 < this.field441) {
                var19 = this.field440[this.field442[var2]];
            } else {
                var19 = this.field430[this.field432[var2 - this.field441]];
            }
            if (var19 != null && var19.method8(this.field400)) {
                if (var19 instanceof class71) {
                    class69 var20 = ((class71) var19).field1737;
                    if (var20.field1705 != null) {
                        var20 = var20.method593(false);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field441) {
                    class69 var23 = ((class71) var19).field1737;
                    if (var23.field1701 >= 0 && var23.field1701 < this.field331.length) {
                        this.method170(var19, var19.field56 + 15, -29444);
                        if (this.field435 > -1) {
                            this.field331[var23.field1701].method400(this.field436 - 30, this.field334, this.field435 - 12);
                        }
                    }
                    if (this.field389 == 1 && this.field432[var2 - this.field441] == this.field629 && field493 % 20 < 10) {
                        this.method170(var19, var19.field56 + 15, -29444);
                        if (this.field435 > -1) {
                            this.field265[0].method400(this.field436 - 28, this.field334, this.field435 - 12);
                        }
                    }
                } else {
                    int var21 = 30;
                    class58 var22 = (class58) var19;
                    if (var22.field1571 != -1 || var22.field1569 != -1) {
                        this.method170(var19, var19.field56 + 15, -29444);
                        if (this.field435 > -1) {
                            if (var22.field1571 != -1) {
                                this.field204[var22.field1571].method400(this.field436 - var21, this.field334, this.field435 - 12);
                                var21 += 25;
                            }
                            if (var22.field1569 != -1) {
                                this.field331[var22.field1569].method400(this.field436 - var21, this.field334, this.field435 - 12);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field389 == 10 && this.field442[var2] == this.field232) {
                        this.method170(var19, var19.field56 + 15, -29444);
                        if (this.field435 > -1) {
                            this.field265[1].method400(this.field436 - var21, this.field334, this.field435 - 12);
                        }
                    }
                }
                if (var19.field43 != null && (var2 >= this.field441 || this.field585 == 0 || this.field585 == 3 || this.field585 == 1 && this.method110(((class58) var19).field1573, 6938))) {
                    this.method170(var19, var19.field56, -29444);
                    if (this.field435 > -1 && this.field652 < this.field653) {
                        this.field657[this.field652] = this.field409.method383(var19.field43, -117) / 2;
                        this.field656[this.field652] = this.field409.field1192;
                        this.field654[this.field652] = this.field435;
                        this.field655[this.field652] = this.field436;
                        this.field658[this.field652] = var19.field46;
                        this.field659[this.field652] = var19.field42;
                        this.field660[this.field652] = var19.field45;
                        this.field661[this.field652++] = var19.field43;
                        if (this.field325 == 0 && var19.field42 >= 1 && var19.field42 <= 3) {
                            this.field656[this.field652] += 10;
                            this.field655[this.field652] += 5;
                        }
                        if (this.field325 == 0 && var19.field42 == 4) {
                            this.field657[this.field652] = 60;
                        }
                        if (this.field325 == 0 && var19.field42 == 5) {
                            this.field656[this.field652] += 5;
                        }
                    }
                }
                if (var19.field36 > field493) {
                    this.method170(var19, var19.field56 + 15, -29444);
                    if (this.field435 > -1) {
                        int var24 = var19.field37 * 30 / var19.field38;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class26.method256(this.field435 - 15, var24, this.field436 - 3, 65280, 5, (byte) 127);
                        class26.method256(this.field435 - 15 + var24, 30 - var24, this.field436 - 3, 16711680, 5, (byte) 127);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field61[var25] > field493) {
                        this.method170(var19, var19.field56 / 2, -29444);
                        if (this.field435 > -1) {
                            if (var25 == 1) {
                                this.field436 -= 20;
                            }
                            if (var25 == 2) {
                                this.field435 -= 15;
                                this.field436 -= 10;
                            }
                            if (var25 == 3) {
                                this.field435 += 15;
                                this.field436 -= 10;
                            }
                            this.field608[var19.field60[var25]].method400(this.field436 - 12, this.field334, this.field435 - 12);
                            this.field407.method380(String.valueOf(var19.field59[var25]), (byte) 0, this.field435, this.field436 + 4, 0);
                            this.field407.method380(String.valueOf(var19.field59[var25]), (byte) 0, this.field435 - 1, this.field436 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field652; ++var3) {
            int var4 = this.field654[var3];
            int var5 = this.field655[var3];
            int var6 = this.field657[var3];
            int var7 = this.field656[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field655[var18] - this.field656[var18] && var5 - var7 < this.field655[var18] + 2 && var4 - var6 < this.field657[var18] + this.field654[var18] && var4 + var6 > this.field654[var18] - this.field657[var18] && this.field655[var18] - this.field656[var18] < var5) {
                        var5 = this.field655[var18] - this.field656[var18];
                        var8 = true;
                    }
                }
            }
            this.field435 = this.field654[var3];
            this.field436 = this.field655[var3] = var5;
            String var9 = this.field661[var3];
            if (this.field325 == 0) {
                int var10 = 16776960;
                if (this.field658[var3] < 6) {
                    var10 = this.field556[this.field658[var3]];
                }
                if (this.field658[var3] == 6) {
                    var10 = this.field396 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field658[var3] == 7) {
                    var10 = this.field396 % 20 < 10 ? 255 : 65535;
                }
                if (this.field658[var3] == 8) {
                    var10 = this.field396 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field658[var3] == 9) {
                    int var11 = 150 - this.field660[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field658[var3] == 10) {
                    int var12 = 150 - this.field660[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field658[var3] == 11) {
                    int var13 = 150 - this.field660[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field659[var3] == 0) {
                    this.field409.method380(var9, (byte) 0, this.field435, this.field436 + 1, 0);
                    this.field409.method380(var9, (byte) 0, this.field435, this.field436, var10);
                }
                if (this.field659[var3] == 1) {
                    this.field409.method385(-383, this.field436 + 1, this.field396, 0, this.field435, var9);
                    this.field409.method385(-383, this.field436, this.field396, var10, this.field435, var9);
                }
                if (this.field659[var3] == 2) {
                    this.field409.method386(this.field396, 435, this.field436 + 1, this.field435, 0, var9);
                    this.field409.method386(this.field396, 435, this.field436, this.field435, var10, var9);
                }
                if (this.field659[var3] == 3) {
                    this.field409.method387(0, 712, this.field396, var9, this.field435, this.field436 + 1, 150 - this.field660[var3]);
                    this.field409.method387(var10, 712, this.field396, var9, this.field435, this.field436, 150 - this.field660[var3]);
                }
                if (this.field659[var3] == 4) {
                    int var14 = this.field409.method383(var9, -117);
                    int var15 = (150 - this.field660[var3]) * (var14 + 100) / 150;
                    class26.method253(-76, 0, this.field435 - 50, this.field435 + 50, 334);
                    this.field409.method384(var9, this.field436 + 1, this.field435 + 50 - var15, this.field285, 0);
                    this.field409.method384(var9, this.field436, this.field435 + 50 - var15, this.field285, var10);
                    class26.method252(132);
                }
                if (this.field659[var3] == 5) {
                    int var16 = 150 - this.field660[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class26.method253(-76, this.field436 - this.field409.field1192 - 1, 0, 512, this.field436 + 5);
                    this.field409.method380(var9, (byte) 0, this.field435, this.field436 + 1 + var17, 0);
                    this.field409.method380(var9, (byte) 0, this.field435, this.field436 + var17, var10);
                    class26.method252(132);
                }
            } else {
                this.field409.method380(var9, (byte) 0, this.field435, this.field436 + 1, 0);
                this.field409.method380(var9, (byte) 0, this.field435, this.field436, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
    public final void method56(int arg0, boolean arg1, int arg2) {
        if (arg0 < 9 || arg0 > 9) {
            this.field240 = this.field292.method529();
        }
        signlink.midivol = arg2;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        if (arg0 != 4) {
            this.field594 = null;
        }
        for (class2 var2 = (class2) this.field469.method509(); var2 != null; var2 = (class2) this.field469.method511(0)) {
            if (this.field417 == var2.field11 && !var2.field10) {
                if (field493 >= var2.field15) {
                    var2.method4(-149, this.field322);
                    if (var2.field10) {
                        var2.method588();
                    } else {
                        this.field434.method331(-18681, var2.field13, var2.field14, 0, var2.field12, var2.field11, 60, -1, false, var2);
                    }
                }
            } else {
                var2.method588();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (this.field243 > 0) {
            this.method137(false);
        } else {
            this.method138("Connection lost", (byte) 51, "Please wait - attempting to reestablish");
            this.field235 = 0;
            this.field428 &= arg0;
            this.field682 = 0;
            class50 var2 = this.field326;
            this.field428 = false;
            this.field581 = 0;
            this.method39(this.field420, this.field421, true);
            if (!this.field428) {
                this.method137(false);
            }
            try {
                var2.method468();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method59(int arg0) {
        this.field239 += arg0;
        if (field544 && this.field274 == 2 && class7.field119 != this.field417) {
            this.method138("Loading - please wait.", (byte) 51, (String) null);
            this.field274 = 1;
            this.field297 = System.currentTimeMillis();
        }
        if (this.field274 == 1) {
            int var2 = this.method60(-48111);
            if (var2 != 0 && System.currentTimeMillis() - this.field297 > 360000L) {
                signlink.reporterror(this.field420 + " glcfb " + this.field294 + "," + var2 + "," + field544 + "," + this.field218[0] + "," + this.field328.method207() + "," + this.field417 + "," + this.field225 + "," + this.field226);
                this.field297 = System.currentTimeMillis();
            }
        }
        if (this.field274 == 2 && this.field417 != this.field405) {
            this.field405 = this.field417;
            this.method83(this.field417, 655);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)I")
    public final int method60(int arg0) {
        for (int var2 = 0; var2 < this.field353.length; ++var2) {
            if (this.field353[var2] == null && this.field270[var2] != -1) {
                return -1;
            }
            if (this.field258[var2] == null && this.field271[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field353.length; ++var4) {
            byte[] var5 = this.field258[var4];
            if (var5 != null) {
                int var6 = (this.field269[var4] >> 8) * 64 - this.field247;
                int var7 = (this.field269[var4] & 255) * 64 - this.field248;
                if (this.field521) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class7.method14(true, var7, var5, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field267) {
            return -4;
        } else {
            this.field274 = 2;
            class7.field119 = this.field417;
            if (arg0 != -48111) {
                field587 = -495;
            }
            this.method38(0);
            this.field554.method518(255, true);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method61(int arg0) {
        if (arg0 <= 0) {
            this.field594 = null;
        }
        for (int var2 = 0; var2 < this.field361; ++var2) {
            if (this.field624[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field214[var2] == this.field507 && this.field387[var2] == this.field483) {
                        if (!this.method135(589)) {
                            var3 = true;
                        }
                    } else {
                        class59 var4 = class53.method477(this.field387[var2], this.field214[var2], true);
                        if (System.currentTimeMillis() + (long) (var4.field1589 / 22) > (long) (this.field293 / 22) + this.field335) {
                            this.field293 = var4.field1589;
                            this.field335 = System.currentTimeMillis();
                            if (this.method74(478, var4.field1588, var4.field1589)) {
                                this.field507 = this.field214[var2];
                                this.field483 = this.field387[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field554.method518(152, true);
                        this.field554.method520(this.field214[var2] & 32767);
                    } else {
                        this.field554.method518(152, true);
                        this.field554.method520(-1);
                    }
                }
                if (var3 && this.field624[var2] != -5) {
                    this.field624[var2] = -5;
                } else {
                    --this.field361;
                    for (int var6 = var2; var6 < this.field361; ++var6) {
                        this.field214[var6] = this.field214[var6 + 1];
                        this.field387[var6] = this.field387[var6 + 1];
                        this.field624[var6] = this.field624[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field624[var2]--;
            }
        }
        if (this.field433 > 0) {
            this.field433 -= 20;
            if (this.field433 < 0) {
                this.field433 = 0;
            }
            if (this.field433 == 0 && this.field579 && !field544) {
                this.field528 = this.field586;
                this.field529 = true;
                this.field328.method208(2, this.field528);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method62(int arg0, int arg1) {
        if (arg0 < 0) {
            if (arg1 >= 0) {
                int var3 = this.field198[arg1];
                int var4 = this.field199[arg1];
                int var5 = this.field200[arg1];
                int var6 = this.field201[arg1];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (this.field547 != 0 && var5 != 1946) {
                    this.field547 = 0;
                    this.field305 = true;
                }
                if (var5 == 404 || var5 == 394) {
                    String var7 = this.field487[arg1];
                    int var8 = var7.indexOf("@whi@");
                    if (var8 != -1) {
                        String var9 = var7.substring(var8 + 5).trim();
                        String var10 = class12.method186(class12.method183(39082, class12.method182(var9)), 7139);
                        boolean var11 = false;
                        for (int var12 = 0; var12 < this.field441; ++var12) {
                            class58 var13 = this.field440[this.field442[var12]];
                            if (var13 != null && var13.field1573 != null && var13.field1573.equalsIgnoreCase(var10)) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var13.field62[0], (byte) 9, 0, var13.field63[0], 2, 1, false);
                                if (var5 == 404) {
                                    ++field454;
                                    if (field454 >= 110) {
                                        this.field554.method518(164, true);
                                        this.field554.method523(0);
                                        field454 = 0;
                                    }
                                    this.field554.method518(143, true);
                                    this.field554.method520(this.field442[var12]);
                                }
                                if (var5 == 394) {
                                    this.field554.method518(204, true);
                                    this.field554.method555(this.field442[var12], 5);
                                }
                                var11 = true;
                                break;
                            }
                        }
                        if (!var11) {
                            this.method111("Unable to find " + var10, 0, "", this.field382);
                        }
                    }
                }
                if (var5 == 113) {
                    if (!this.field589) {
                        this.field434.method358(super.field903 - 4, super.field904 - 4, 5);
                    } else {
                        this.field434.method358(var3 - 4, var4 - 4, 5);
                    }
                }
                if (var5 == 440) {
                    this.field499 = 1;
                    this.field500 = var3;
                    this.field501 = var4;
                    this.field502 = var6;
                    this.field503 = String.valueOf(class54.method482(var6).field1422);
                    this.field345 = 0;
                    this.field375 = true;
                } else {
                    if (var5 == 280) {
                        this.field554.method518(173, true);
                        this.field554.method553(var4, 674);
                        this.field554.method553(this.field500, 674);
                        this.field554.method553(var6, 674);
                        this.field554.method555(this.field502, 5);
                        this.field554.method553(this.field501, 674);
                        this.field554.method553(var3, 674);
                        this.field457 = 0;
                        this.field458 = var4;
                        this.field459 = var3;
                        this.field460 = 2;
                        if (class29.method311(var4).field1012 == this.field403) {
                            this.field460 = 1;
                        }
                        if (class29.method311(var4).field1012 == this.field468) {
                            this.field460 = 3;
                        }
                    }
                    if (var5 == 420) {
                        boolean var14 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 0, false);
                        if (!var14) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 1, false);
                        }
                        this.field254 = super.field903;
                        this.field255 = super.field904;
                        this.field257 = 2;
                        this.field256 = 0;
                        this.field554.method518(26, true);
                        this.field554.method520(var6);
                        this.field554.method553(this.field247 + var3, 674);
                        this.field554.method520(this.field248 + var4);
                    }
                    if (var5 == 753) {
                        this.method174(var3, 618, var4, var6);
                        this.field554.method518(200, true);
                        this.field554.method553(this.field247 + var3, 674);
                        this.field554.method520(this.field248 + var4);
                        this.field554.method555(var6 >> 14 & 32767, 5);
                    }
                    if (var5 == 202) {
                        this.method174(var3, 618, var4, var6);
                        this.field554.method518(217, true);
                        this.field554.method555(this.field247 + var3, 5);
                        this.field554.method554(this.field595, this.field248 + var4);
                        this.field554.method553(var6 >> 14 & 32767, 674);
                    }
                    if (var5 == 839) {
                        this.field554.method518(77, true);
                        this.field554.method520(var6);
                        this.field554.method555(var3, 5);
                        this.field554.method554(this.field595, var4);
                        this.field457 = 0;
                        this.field458 = var4;
                        this.field459 = var3;
                        this.field460 = 2;
                        if (class29.method311(var4).field1012 == this.field403) {
                            this.field460 = 1;
                        }
                        if (class29.method311(var4).field1012 == this.field468) {
                            this.field460 = 3;
                        }
                    }
                    if (var5 == 764) {
                        class71 var16 = this.field430[var6];
                        if (var16 != null) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var16.field62[0], (byte) 9, 0, var16.field63[0], 2, 1, false);
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            this.field554.method518(149, true);
                            this.field554.method555(var6, 5);
                            this.field554.method555(this.field346, 5);
                        }
                    }
                    if (var5 == 221 && !this.field321) {
                        this.field554.method518(126, true);
                        this.field554.method520(var4);
                        this.field321 = true;
                    }
                    if (var5 == 627 || var5 == 608 || var5 == 819 || var5 == 650) {
                        String var17 = this.field487[arg1];
                        int var18 = var17.indexOf("@whi@");
                        if (var18 != -1) {
                            long var19 = class12.method182(var17.substring(var18 + 5).trim());
                            if (var5 == 627) {
                                this.method139(var19, (byte) 4);
                            }
                            if (var5 == 608) {
                                this.method42(var19, 5);
                            }
                            if (var5 == 819) {
                                this.method108(false, var19);
                            }
                            if (var5 == 650) {
                                this.method66(var19, (byte) 3);
                            }
                        }
                    }
                    if (var5 == 1251) {
                        class54 var21 = class54.method482(var6);
                        class29 var22 = class29.method311(var4);
                        String var23;
                        if (var22 != null && var22.field978[var3] >= 100000) {
                            var23 = var22.field978[var3] + " x " + var21.field1422;
                        } else if (var21.field1417 != null) {
                            var23 = new String(var21.field1417);
                        } else {
                            var23 = "It's a " + var21.field1422 + ".";
                        }
                        this.method111(var23, 0, "", this.field382);
                    }
                    if (var5 == 178) {
                        class58 var24 = this.field440[var6];
                        if (var24 != null) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var24.field62[0], (byte) 9, 0, var24.field63[0], 2, 1, false);
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            this.field554.method518(197, true);
                            this.field554.method553(var6, 674);
                        }
                    }
                    if (var5 == 479) {
                        this.method174(var3, 618, var4, var6);
                        this.field554.method518(5, true);
                        this.field554.method520(this.field247 + var3);
                        this.field554.method555(this.field248 + var4, 5);
                        this.field554.method555(var6 >> 14 & 32767, 5);
                    }
                    if (var5 == 51) {
                        class58 var25 = this.field440[var6];
                        if (var25 != null) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var25.field62[0], (byte) 9, 0, var25.field63[0], 2, 1, false);
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            ++field454;
                            if (field454 >= 110) {
                                this.field554.method518(164, true);
                                this.field554.method523(0);
                                field454 = 0;
                            }
                            this.field554.method518(143, true);
                            this.field554.method520(var6);
                        }
                    }
                    if (var5 == 990) {
                        class71 var26 = this.field430[var6];
                        if (var26 != null) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var26.field62[0], (byte) 9, 0, var26.field63[0], 2, 1, false);
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            this.field554.method518(191, true);
                            this.field554.method554(this.field595, var6);
                        }
                    }
                    if (var5 == 98) {
                        this.field554.method518(50, true);
                        this.field554.method520(var4);
                        class29 var27 = class29.method311(var4);
                        if (var27.field954 != null && var27.field954[0][0] == 5) {
                            int var28 = var27.field954[0][1];
                            this.field511[var28] = 1 - this.field511[var28];
                            this.method167(var28, true);
                            this.field375 = true;
                        }
                    }
                    if (var5 == 8) {
                        class58 var29 = this.field440[var6];
                        if (var29 != null) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var29.field62[0], (byte) 9, 0, var29.field63[0], 2, 1, false);
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            this.field554.method518(73, true);
                            this.field554.method553(this.field500, 674);
                            this.field554.method553(this.field501, 674);
                            this.field554.method553(this.field502, 674);
                            this.field554.method520(var6);
                        }
                    }
                    if (var5 == 882) {
                        boolean var30 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 0, false);
                        if (!var30) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 1, false);
                        }
                        this.field254 = super.field903;
                        this.field255 = super.field904;
                        this.field257 = 2;
                        this.field256 = 0;
                        this.field554.method518(202, true);
                        this.field554.method554(this.field595, var6);
                        this.field554.method554(this.field595, this.field248 + var4);
                        this.field554.method520(this.field247 + var3);
                    }
                    if (var5 == 352) {
                        this.field554.method518(82, true);
                        this.field554.method554(this.field595, var3);
                        this.field554.method553(var4, 674);
                        this.field554.method553(var6, 674);
                        this.field457 = 0;
                        this.field458 = var4;
                        this.field459 = var3;
                        this.field460 = 2;
                        if (class29.method311(var4).field1012 == this.field403) {
                            this.field460 = 1;
                        }
                        if (class29.method311(var4).field1012 == this.field468) {
                            this.field460 = 3;
                        }
                    }
                    if (var5 == 228) {
                        this.field554.method518(109, true);
                        this.field554.method553(var4, 674);
                        this.field554.method553(var6, 674);
                        this.field554.method520(var3);
                        this.field457 = 0;
                        this.field458 = var4;
                        this.field459 = var3;
                        this.field460 = 2;
                        if (class29.method311(var4).field1012 == this.field403) {
                            this.field460 = 1;
                        }
                        if (class29.method311(var4).field1012 == this.field468) {
                            this.field460 = 3;
                        }
                    }
                    if (var5 == 1071) {
                        class71 var32 = this.field430[var6];
                        if (var32 != null) {
                            class69 var33 = var32.field1737;
                            if (var33.field1705 != null) {
                                var33 = var33.method593(false);
                            }
                            if (var33 != null) {
                                String var34;
                                if (var33.field1730 != null) {
                                    var34 = new String(var33.field1730);
                                } else {
                                    var34 = "It's a " + var33.field1697 + ".";
                                }
                                this.method111(var34, 0, "", this.field382);
                            }
                        }
                    }
                    if (var5 == 553) {
                        class71 var35 = this.field430[var6];
                        if (var35 != null) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var35.field62[0], (byte) 9, 0, var35.field63[0], 2, 1, false);
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            this.field554.method518(165, true);
                            this.field554.method554(this.field595, var6);
                        }
                    }
                    if (var5 == 768) {
                        this.method166(true);
                    }
                    if (var5 == 648) {
                        this.field554.method518(212, true);
                        this.field554.method553(var3, 674);
                        this.field554.method555(var4, 5);
                        this.field554.method555(var6, 5);
                        this.field457 = 0;
                        this.field458 = var4;
                        this.field459 = var3;
                        this.field460 = 2;
                        if (class29.method311(var4).field1012 == this.field403) {
                            this.field460 = 1;
                        }
                        if (class29.method311(var4).field1012 == this.field468) {
                            this.field460 = 3;
                        }
                    }
                    if (var5 == 246) {
                        class58 var36 = this.field440[var6];
                        if (var36 != null) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var36.field62[0], (byte) 9, 0, var36.field63[0], 2, 1, false);
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            this.field554.method518(204, true);
                            this.field554.method555(var6, 5);
                        }
                    }
                    if (var5 == 436) {
                        this.field554.method518(50, true);
                        this.field554.method520(var4);
                        class29 var37 = class29.method311(var4);
                        if (var37.field954 != null && var37.field954[0][0] == 5) {
                            int var38 = var37.field954[0][1];
                            if (this.field511[var38] != var37.field968[0]) {
                                this.field511[var38] = var37.field968[0];
                                this.method167(var38, true);
                                this.field375 = true;
                            }
                        }
                    }
                    if (var5 == 978) {
                        boolean var39 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 0, false);
                        if (!var39) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 1, false);
                        }
                        this.field254 = super.field903;
                        this.field255 = super.field904;
                        this.field257 = 2;
                        this.field256 = 0;
                        this.field554.method518(55, true);
                        this.field554.method554(this.field595, this.field247 + var3);
                        this.field554.method554(this.field595, var6);
                        this.field554.method553(this.field346, 674);
                        this.field554.method520(this.field248 + var4);
                    }
                    if (var5 == 233) {
                        boolean var41 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 0, false);
                        if (!var41) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 1, false);
                        }
                        this.field254 = super.field903;
                        this.field255 = super.field904;
                        this.field257 = 2;
                        this.field256 = 0;
                        this.field554.method518(123, true);
                        this.field554.method555(var6, 5);
                        this.field554.method520(this.field247 + var3);
                        this.field554.method520(this.field248 + var4);
                    }
                    if (var5 == 618) {
                        boolean var43 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 0, false);
                        if (!var43) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 1, false);
                        }
                        this.field254 = super.field903;
                        this.field255 = super.field904;
                        this.field257 = 2;
                        this.field256 = 0;
                        this.field554.method518(18, true);
                        this.field554.method520(this.field247 + var3);
                        this.field554.method554(this.field595, var6);
                        this.field554.method520(this.field248 + var4);
                    }
                    if (var5 == 633) {
                        this.field554.method518(171, true);
                        this.field554.method555(var4, 5);
                        this.field554.method520(var3);
                        this.field554.method553(var6, 674);
                        this.field457 = 0;
                        this.field458 = var4;
                        this.field459 = var3;
                        this.field460 = 2;
                        if (class29.method311(var4).field1012 == this.field403) {
                            this.field460 = 1;
                        }
                        if (class29.method311(var4).field1012 == this.field468) {
                            this.field460 = 3;
                        }
                    }
                    if (var5 == 417) {
                        this.field554.method518(245, true);
                        this.field554.method554(this.field595, var3);
                        this.field554.method520(var6);
                        this.field554.method555(var4, 5);
                        this.field554.method555(this.field346, 5);
                        this.field457 = 0;
                        this.field458 = var4;
                        this.field459 = var3;
                        this.field460 = 2;
                        if (class29.method311(var4).field1012 == this.field403) {
                            this.field460 = 1;
                        }
                        if (class29.method311(var4).field1012 == this.field468) {
                            this.field460 = 3;
                        }
                    }
                    if (var5 == 438 && this.method174(var3, 618, var4, var6)) {
                        this.field554.method518(54, true);
                        this.field554.method520(this.field247 + var3);
                        this.field554.method520(var6 >> 14 & 32767);
                        this.field554.method554(this.field595, this.field500);
                        this.field554.method554(this.field595, this.field502);
                        this.field554.method555(this.field501, 5);
                        this.field554.method553(this.field248 + var4, 674);
                    }
                    if (var5 == 471) {
                        String var45 = this.field487[arg1];
                        int var46 = var45.indexOf("@whi@");
                        if (var46 != -1) {
                            if (this.field403 == -1) {
                                this.method166(true);
                                this.field296 = var45.substring(var46 + 5).trim();
                                this.field572 = false;
                                this.field472 = this.field403 = class29.field962;
                            } else {
                                this.method111("Please close the interface you have open before using 'report abuse'", 0, "", this.field382);
                            }
                        }
                    }
                    if (var5 == 227) {
                        class71 var47 = this.field430[var6];
                        if (var47 != null) {
                            this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var47.field62[0], (byte) 9, 0, var47.field63[0], 2, 1, false);
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            if ((var6 & 3) == 0) {
                                ++field272;
                            }
                            if (field272 >= 81) {
                                this.field554.method518(239, true);
                                this.field554.method519(166);
                                field272 = 0;
                            }
                            this.field554.method518(187, true);
                            this.field554.method553(var6, 674);
                        }
                    }
                    if (var5 == 266) {
                        class29 var48 = class29.method311(var4);
                        this.field345 = 1;
                        this.field346 = var4;
                        this.field347 = var48.field956;
                        this.field499 = 0;
                        this.field375 = true;
                        String var49 = var48.field969;
                        if (var49.indexOf(" ") != -1) {
                            var49 = var49.substring(0, var49.indexOf(" "));
                        }
                        String var50 = var48.field969;
                        if (var50.indexOf(" ") != -1) {
                            var50 = var50.substring(var50.indexOf(" ") + 1);
                        }
                        this.field348 = var49 + " " + var48.field971 + " " + var50;
                        if (this.field347 == 16) {
                            this.field375 = true;
                            this.field295 = 3;
                            this.field281 = true;
                        }
                    } else {
                        if (var5 == 561) {
                            this.field554.method518(63, true);
                            this.field554.method554(this.field595, var3);
                            this.field554.method554(this.field595, var4);
                            this.field554.method554(this.field595, var6);
                            this.field457 = 0;
                            this.field458 = var4;
                            this.field459 = var3;
                            this.field460 = 2;
                            if (class29.method311(var4).field1012 == this.field403) {
                                this.field460 = 1;
                            }
                            if (class29.method311(var4).field1012 == this.field468) {
                                this.field460 = 3;
                            }
                        }
                        if (var5 == 660) {
                            this.field554.method518(113, true);
                            this.field554.method520(var3);
                            this.field554.method520(var6);
                            this.field554.method553(var4, 674);
                            this.field457 = 0;
                            this.field458 = var4;
                            this.field459 = var3;
                            this.field460 = 2;
                            if (class29.method311(var4).field1012 == this.field403) {
                                this.field460 = 1;
                            }
                            if (class29.method311(var4).field1012 == this.field468) {
                                this.field460 = 3;
                            }
                        }
                        if (var5 == 103) {
                            field648 += var4;
                            if (field648 >= 78) {
                                this.field554.method518(153, true);
                                this.field554.method519(42);
                                field648 = 0;
                            }
                            this.field554.method518(240, true);
                            this.field554.method520(var6);
                            this.field554.method554(this.field595, var4);
                            this.field554.method520(var3);
                            this.field457 = 0;
                            this.field458 = var4;
                            this.field459 = var3;
                            this.field460 = 2;
                            if (class29.method311(var4).field1012 == this.field403) {
                                this.field460 = 1;
                            }
                            if (class29.method311(var4).field1012 == this.field468) {
                                this.field460 = 3;
                            }
                        }
                        if (var5 == 147) {
                            class58 var51 = this.field440[var6];
                            if (var51 != null) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var51.field62[0], (byte) 9, 0, var51.field63[0], 2, 1, false);
                                this.field254 = super.field903;
                                this.field255 = super.field904;
                                this.field257 = 2;
                                this.field256 = 0;
                                this.field554.method518(20, true);
                                this.field554.method554(this.field595, var6);
                            }
                        }
                        if (var5 == 672) {
                            class71 var52 = this.field430[var6];
                            if (var52 != null) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var52.field62[0], (byte) 9, 0, var52.field63[0], 2, 1, false);
                                this.field254 = super.field903;
                                this.field255 = super.field904;
                                this.field257 = 2;
                                this.field256 = 0;
                                this.field554.method518(34, true);
                                this.field554.method553(var6, 674);
                            }
                        }
                        if (var5 == 240) {
                            if ((var4 & 3) == 0) {
                                ++field601;
                            }
                            if (field601 >= 144) {
                                this.field554.method518(91, true);
                                this.field554.method522(6100950);
                                field601 = 0;
                            }
                            this.field554.method518(205, true);
                            this.field554.method555(var4, 5);
                            this.field554.method554(this.field595, var3);
                            this.field554.method520(var6);
                            this.field457 = 0;
                            this.field458 = var4;
                            this.field459 = var3;
                            this.field460 = 2;
                            if (class29.method311(var4).field1012 == this.field403) {
                                this.field460 = 1;
                            }
                            if (class29.method311(var4).field1012 == this.field468) {
                                this.field460 = 3;
                            }
                        }
                        if (var5 == 111) {
                            this.method174(var3, 618, var4, var6);
                            this.field554.method518(188, true);
                            this.field554.method555(this.field248 + var4, 5);
                            this.field554.method555(var6 >> 14 & 32767, 5);
                            this.field554.method553(this.field247 + var3, 674);
                        }
                        if (var5 == 1936) {
                            class54 var53 = class54.method482(var6);
                            String var54;
                            if (var53.field1417 != null) {
                                var54 = new String(var53.field1417);
                            } else {
                                var54 = "It's a " + var53.field1422 + ".";
                            }
                            this.method111(var54, 0, "", this.field382);
                        }
                        if (var5 == 724) {
                            this.field554.method518(38, true);
                            this.field554.method554(this.field595, var4);
                            this.field554.method555(var6, 5);
                            this.field554.method520(var3);
                            this.field457 = 0;
                            this.field458 = var4;
                            this.field459 = var3;
                            this.field460 = 2;
                            if (class29.method311(var4).field1012 == this.field403) {
                                this.field460 = 1;
                            }
                            if (class29.method311(var4).field1012 == this.field468) {
                                this.field460 = 3;
                            }
                        }
                        if (var5 == 138) {
                            class29 var55 = class29.method311(var4);
                            boolean var56 = true;
                            if (var55.field1008 > 0) {
                                var56 = this.method88(3, var55);
                            }
                            if (var56) {
                                this.field554.method518(50, true);
                                this.field554.method520(var4);
                            }
                        }
                        if (var5 == 229) {
                            class71 var57 = this.field430[var6];
                            if (var57 != null) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var57.field62[0], (byte) 9, 0, var57.field63[0], 2, 1, false);
                                this.field254 = super.field903;
                                this.field255 = super.field904;
                                this.field257 = 2;
                                this.field256 = 0;
                                this.field554.method518(79, true);
                                this.field554.method555(this.field502, 5);
                                this.field554.method553(this.field501, 674);
                                this.field554.method553(this.field500, 674);
                                this.field554.method554(this.field595, var6);
                            }
                        }
                        if (var5 == 493) {
                            class58 var58 = this.field440[var6];
                            if (var58 != null) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var58.field62[0], (byte) 9, 0, var58.field63[0], 2, 1, false);
                                this.field254 = super.field903;
                                this.field255 = super.field904;
                                this.field257 = 2;
                                this.field256 = 0;
                                this.field554.method518(25, true);
                                this.field554.method555(this.field346, 5);
                                this.field554.method555(var6, 5);
                            }
                        }
                        if (var5 == 389) {
                            class58 var59 = this.field440[var6];
                            if (var59 != null) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var59.field62[0], (byte) 9, 0, var59.field63[0], 2, 1, false);
                                this.field254 = super.field903;
                                this.field255 = super.field904;
                                this.field257 = 2;
                                this.field256 = 0;
                                this.field554.method518(137, true);
                                this.field554.method555(var6, 5);
                            }
                        }
                        if (var5 == 1790) {
                            this.method174(var3, 618, var4, var6);
                            this.field554.method518(216, true);
                            this.field554.method555(this.field248 + var4, 5);
                            this.field554.method555(var6 >> 14 & 32767, 5);
                            this.field554.method520(this.field247 + var3);
                        }
                        if (var5 == 469) {
                            boolean var60 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 0, false);
                            if (!var60) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 1, false);
                            }
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            this.field554.method518(41, true);
                            this.field554.method554(this.field595, var6);
                            this.field554.method555(this.field500, 5);
                            this.field554.method520(this.field502);
                            this.field554.method555(this.field248 + var4, 5);
                            this.field554.method520(this.field247 + var3);
                            this.field554.method555(this.field501, 5);
                        }
                        if (var5 == 918 && this.method174(var3, 618, var4, var6)) {
                            this.field554.method518(247, true);
                            this.field554.method555(this.field247 + var3, 5);
                            this.field554.method554(this.field595, this.field346);
                            this.field554.method554(this.field595, var6 >> 14 & 32767);
                            this.field554.method553(this.field248 + var4, 674);
                        }
                        if (var5 == 81) {
                            class71 var62 = this.field430[var6];
                            if (var62 != null) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var62.field62[0], (byte) 9, 0, var62.field63[0], 2, 1, false);
                                this.field254 = super.field903;
                                this.field255 = super.field904;
                                this.field257 = 2;
                                this.field256 = 0;
                                this.field554.method518(233, true);
                                this.field554.method553(var6, 674);
                            }
                        }
                        if (var5 == 908) {
                            this.method157(this.field672, 882);
                            this.field672 = -1;
                            this.field305 = true;
                        }
                        if (var5 == 756) {
                            boolean var63 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 0, false);
                            if (!var63) {
                                this.method49(1, 0, field219.field63[0], field219.field62[0], 0, var3, (byte) 9, 0, var4, 2, 1, false);
                            }
                            this.field254 = super.field903;
                            this.field255 = super.field904;
                            this.field257 = 2;
                            this.field256 = 0;
                            field388 += var4;
                            if (field388 >= 121) {
                                this.field554.method518(10, true);
                                this.field554.method522(1866764);
                                field388 = 0;
                            }
                            this.field554.method518(174, true);
                            this.field554.method554(this.field595, var6);
                            this.field554.method520(this.field248 + var4);
                            this.field554.method555(this.field247 + var3, 5);
                        }
                        if (var5 == 1083) {
                            int var65 = var6 >> 14 & 32767;
                            class55 var66 = class55.method499(var65);
                            String var67;
                            if (var66.field1480 != null) {
                                var67 = new String(var66.field1480);
                            } else {
                                var67 = "It's a " + var66.field1506 + ".";
                            }
                            this.method111(var67, 0, "", this.field382);
                        }
                        if (var5 == 824) {
                            String var68 = this.field487[arg1];
                            int var69 = var68.indexOf("@whi@");
                            if (var69 != -1) {
                                long var70 = class12.method182(var68.substring(var69 + 5).trim());
                                int var72 = -1;
                                for (int var73 = 0; var73 < this.field418; ++var73) {
                                    if (this.field568[var73] == var70) {
                                        var72 = var73;
                                        break;
                                    }
                                }
                                if (var72 != -1 && this.field422[var72] > 0) {
                                    this.field305 = true;
                                    this.field547 = 0;
                                    this.field615 = true;
                                    this.field609 = "";
                                    this.field324 = 3;
                                    this.field275 = this.field568[var72];
                                    this.field552 = "Enter message to send to " + this.field548[var72];
                                }
                            }
                        }
                        this.field499 = 0;
                        this.field345 = 0;
                        this.field375 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LBHRFVUZN;Z)V")
    private final void method63(class4 arg0, boolean arg1) {
        if (arg1) {
            this.field554.method519(154);
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field77 == 0) {
            var3 = this.field434.method346(arg0.field76, arg0.field78, arg0.field79);
        }
        if (arg0.field77 == 1) {
            var3 = this.field434.method347(arg0.field79, 251, arg0.field76, arg0.field78);
        }
        if (arg0.field77 == 2) {
            var3 = this.field434.method348(arg0.field76, arg0.field78, arg0.field79);
        }
        if (arg0.field77 == 3) {
            var3 = this.field434.method349(arg0.field76, arg0.field78, arg0.field79);
        }
        if (var3 != 0) {
            int var7 = this.field434.method350(arg0.field76, arg0.field78, arg0.field79, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field80 = var4;
        arg0.field82 = var5;
        arg0.field81 = var6;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNPZZPPRD;Z)V")
    public final void method64(class43 arg0, boolean arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field545.length; ++var4) {
            this.field545[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field545[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg1) {
            this.field594 = null;
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field546[var16] = (this.field545[var16 - 1] + this.field545[var16 + 1] + this.field545[var16 - 128] + this.field545[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field545;
            this.field545 = this.field546;
            this.field546 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1251; ++var8) {
                for (int var9 = 0; var9 < arg0.field1250; ++var9) {
                    if (arg0.field1248[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1252;
                        int var11 = var8 + 16 + arg0.field1253;
                        int var12 = (var11 << 7) + var10;
                        this.field545[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIJNDWVIL;I)Z")
    public final boolean method65(class29 arg0, int arg1) {
        if (arg1 != 3) {
            this.field594 = null;
        }
        int var3 = arg0.field1008;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field487[this.field630] = "Remove @whi@" + arg0.field972;
                this.field200[this.field630] = 650;
                ++this.field630;
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
            this.field487[this.field630] = "Remove @whi@" + this.field548[var3];
            this.field200[this.field630] = 819;
            ++this.field630;
            this.field487[this.field630] = "Message @whi@" + this.field548[var3];
            this.field200[this.field630] = 824;
            ++this.field630;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
    public final void method66(long arg0, byte arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field522; ++var4) {
                if (this.field486[var4] == arg0) {
                    --this.field522;
                    this.field375 = true;
                    for (int var5 = var4; var5 < this.field522; ++var5) {
                        this.field486[var5] = this.field486[var5 + 1];
                    }
                    this.field554.method518(215, true);
                    this.field554.method525(arg0, this.field237);
                    break;
                }
            }
            if (arg1 != 3) {
                this.field240 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        if (arg0) {
            this.field237 = -334;
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method68(int arg0) {
        byte[] var2 = this.field344.method372("title.dat", (byte[]) null);
        class38 var3 = new class38(var2, this);
        this.field676.method1(this.field603);
        var3.method398(0, 488, 0);
        this.field677.method1(this.field603);
        var3.method398(-637, 488, 0);
        this.field673.method1(this.field603);
        var3.method398(-128, 488, 0);
        this.field674.method1(this.field603);
        var3.method398(-202, 488, -371);
        this.field675.method1(this.field603);
        var3.method398(-202, 488, -171);
        this.field678.method1(this.field603);
        var3.method398(0, 488, -265);
        this.field679.method1(this.field603);
        var3.method398(-562, 488, -265);
        this.field680.method1(this.field603);
        var3.method398(-128, 488, -171);
        this.field681.method1(this.field603);
        var3.method398(-562, 488, -171);
        int[] var4 = new int[var3.field1205];
        for (int var5 = 0; var5 < var3.field1206; ++var5) {
            for (int var10 = 0; var10 < var3.field1205; ++var10) {
                var4[var10] = var3.field1204[var3.field1205 * var5 + (var3.field1205 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1205; ++var11) {
                var3.field1204[var3.field1205 * var5 + var11] = var4[var11];
            }
        }
        if (arg0 != 8) {
            this.field554.method519(8);
        }
        this.field676.method1(this.field603);
        var3.method398(382, 488, 0);
        this.field677.method1(this.field603);
        var3.method398(-255, 488, 0);
        this.field673.method1(this.field603);
        var3.method398(254, 488, 0);
        this.field674.method1(this.field603);
        var3.method398(180, 488, -371);
        this.field675.method1(this.field603);
        var3.method398(180, 488, -171);
        this.field678.method1(this.field603);
        var3.method398(382, 488, -265);
        this.field679.method1(this.field603);
        var3.method398(-180, 488, -265);
        this.field680.method1(this.field603);
        var3.method398(254, 488, -171);
        this.field681.method1(this.field603);
        var3.method398(-180, 488, -171);
        class38 var6 = new class38(this.field344, "logo", 0);
        this.field673.method1(this.field603);
        var6.method400(18, this.field334, 382 - var6.field1205 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class67.field1688) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == 24210) {
            class4 var11 = null;
            for (class4 var12 = (class4) this.field402.method509(); var12 != null; var12 = (class4) this.field402.method511(0)) {
                if (var12.field76 == arg8 && var12.field78 == arg5 && var12.field79 == arg7 && var12.field77 == arg9) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                var11 = new class4();
                var11.field76 = arg8;
                var11.field77 = arg9;
                var11.field78 = arg5;
                var11.field79 = arg7;
                this.method63(var11, false);
                this.field402.method506(var11);
            }
            var11.field84 = arg1;
            var11.field86 = arg6;
            var11.field85 = arg2;
            var11.field87 = arg3;
            var11.field83 = arg4;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method70(boolean arg0) {
        for (int var2 = -1; var2 < this.field441; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field439;
            } else {
                var6 = this.field442[var2];
            }
            class58 var7 = this.field440[var6];
            if (var7 != null && var7.field45 > 0) {
                --var7.field45;
                if (var7.field45 == 0) {
                    var7.field43 = null;
                }
            }
        }
        this.field428 &= arg0;
        for (int var3 = 0; var3 < this.field431; ++var3) {
            int var4 = this.field432[var3];
            class71 var5 = this.field430[var4];
            if (var5 != null && var5.field45 > 0) {
                --var5.field45;
                if (var5.field45 == 0) {
                    var5.field43 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method71(int arg0) {
        Graphics var2 = this.method85(field273).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        if (arg0 >= 3 && arg0 <= 3) {
            this.method249(this.field559, 1);
            if (this.field569) {
                this.field495 = false;
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
            if (this.field215) {
                this.field495 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field355) {
                this.field495 = false;
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

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method72(byte arg0) {
        if (arg0 != -16) {
            field619 = -96;
        }
        if (super.field902 == 1) {
            if (super.field903 >= 6 && super.field903 <= 106 && super.field904 >= 467 && super.field904 <= 499) {
                this.field585 = (this.field585 + 1) % 4;
                this.field588 = true;
                this.field305 = true;
                this.field554.method518(14, true);
                this.field554.method519(this.field585);
                this.field554.method519(this.field364);
                this.field554.method519(this.field536);
            }
            if (super.field903 >= 135 && super.field903 <= 235 && super.field904 >= 467 && super.field904 <= 499) {
                this.field364 = (this.field364 + 1) % 3;
                this.field588 = true;
                this.field305 = true;
                this.field554.method518(14, true);
                this.field554.method519(this.field585);
                this.field554.method519(this.field364);
                this.field554.method519(this.field536);
            }
            if (super.field903 >= 273 && super.field903 <= 373 && super.field904 >= 467 && super.field904 <= 499) {
                this.field536 = (this.field536 + 1) % 3;
                this.field588 = true;
                this.field305 = true;
                this.field554.method518(14, true);
                this.field554.method519(this.field585);
                this.field554.method519(this.field364);
                this.field554.method519(this.field536);
            }
            if (super.field903 >= 412 && super.field903 <= 512 && super.field904 >= 467 && super.field904 <= 499) {
                if (this.field403 == -1) {
                    this.method166(true);
                    this.field296 = "";
                    this.field572 = false;
                    this.field472 = this.field403 = class29.field962;
                    return;
                }
                this.method111("Please close the interface you have open before using 'report abuse'", 0, "", this.field382);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method73(int arg0, int arg1) {
        class29 var3 = class29.method311(arg1);
        for (int var4 = 0; var4 < var3.field994.length && var3.field994[var4] != -1; ++var4) {
            class29 var5 = class29.method311(var3.field994[var4]);
            if (var5.field1014 == 1) {
                this.method73(337, var5.field983);
            }
            var5.field980 = 0;
            var5.field1009 = 0;
        }
        if (arg0 <= 0) {
            this.field594 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method74(int arg0, byte[] arg1, int arg2) {
        int var4 = 68 / arg0;
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method75(int arg0) {
        if (this.field370 > 1) {
            --this.field370;
        }
        if (this.field243 > 0) {
            --this.field243;
        }
        for (int var2 = 0; var2 < 5 && this.method155(1); ++var2) {
        }
        if (this.field428) {
            Object var3 = this.field482.field1362;
            synchronized (this.field482.field1362) {
                if (!field416) {
                    this.field482.field1363 = 0;
                } else if (super.field902 != 0 || this.field482.field1363 >= 40) {
                    this.field554.method518(43, true);
                    this.field554.method519(0);
                    int var4 = this.field554.field1589;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field482.field1363 && var4 - this.field554.field1589 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field482.field1365[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field482.field1364[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field482.field1365[var6] == -1 && this.field482.field1364[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field650 == var8 && this.field651 == var7) {
                            if (this.field463 < 2047) {
                                ++this.field463;
                            }
                        } else {
                            int var10 = var8 - this.field650;
                            this.field650 = var8;
                            int var11 = var7 - this.field651;
                            this.field651 = var7;
                            if (this.field463 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field554.method520((this.field463 << 12) + (var10 << 6) + var11);
                                this.field463 = 0;
                            } else if (this.field463 < 8) {
                                this.field554.method522((this.field463 << 19) + 8388608 + var9);
                                this.field463 = 0;
                            } else {
                                this.field554.method523((this.field463 << 19) + -1073741824 + var9);
                                this.field463 = 0;
                            }
                        }
                    }
                    this.field554.method528(this.field554.field1589 - var4, 0);
                    if (var5 >= this.field482.field1363) {
                        this.field482.field1363 = 0;
                    } else {
                        this.field482.field1363 -= var5;
                        for (int var12 = 0; var12 < this.field482.field1363; ++var12) {
                            this.field482.field1364[var12] = this.field482.field1364[var5 + var12];
                            this.field482.field1365[var12] = this.field482.field1365[var5 + var12];
                        }
                    }
                }
            }
            if (super.field902 != 0) {
                long var13 = (super.field905 - this.field527) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field527 = super.field905;
                int var15 = super.field904;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field903;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field902 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field554.method518(135, true);
                this.field554.method563(-104, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field385 > 0) {
                --this.field385;
            }
            if (super.field906[1] == 1 || super.field906[2] == 1 || super.field906[3] == 1 || super.field906[4] == 1) {
                this.field386 = true;
            }
            if (this.field386 && this.field385 <= 0) {
                this.field385 = 20;
                this.field386 = false;
                this.field554.method518(219, true);
                this.field554.method520(this.field376);
                this.field554.method520(this.field377);
            }
            if (super.field893 && !this.field234) {
                this.field234 = true;
                this.field554.method518(30, true);
                this.field554.method519(1);
            }
            if (!super.field893 && this.field234) {
                this.field234 = false;
                this.field554.method518(30, true);
                this.field554.method519(0);
            }
            this.method59(0);
            this.method136(183);
            this.method61(26);
            ++field641;
            if (field641 > 168) {
                field641 = 0;
                this.field554.method518(139, true);
                this.field554.method520(12152);
            }
            ++this.field241;
            if (this.field241 > 750) {
                this.method58(true);
            }
            this.method77(314);
            this.method92(496);
            this.method70(true);
            ++this.field322;
            if (this.field257 != 0) {
                this.field256 += 20;
                if (this.field256 >= 400) {
                    this.field257 = 0;
                }
            }
            if (this.field460 != 0) {
                ++this.field457;
                if (this.field457 >= 15) {
                    if (this.field460 == 2) {
                        this.field375 = true;
                    }
                    if (this.field460 == 3) {
                        this.field305 = true;
                    }
                    this.field460 = 0;
                }
            }
            if (this.field478 != 0) {
                ++this.field631;
                if (super.field896 > this.field479 + 5 || super.field896 < this.field479 - 5 || super.field897 > this.field480 + 5 || super.field897 < this.field480 - 5) {
                    this.field244 = true;
                }
                if (super.field895 == 0) {
                    if (this.field478 == 2) {
                        this.field375 = true;
                    }
                    if (this.field478 == 3) {
                        this.field305 = true;
                    }
                    this.field478 = 0;
                    if (this.field244 && this.field631 >= 5) {
                        this.field358 = -1;
                        this.method79((byte) -113);
                        if (this.field476 == this.field358 && this.field477 != this.field357) {
                            class29 var20 = class29.method311(this.field476);
                            byte var21 = 0;
                            if (this.field266 == 1 && var20.field1008 == 206) {
                                var21 = 1;
                            }
                            if (var20.field998[this.field357] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1004) {
                                int var22 = this.field477;
                                int var23 = this.field357;
                                var20.field998[var23] = var20.field998[var22];
                                var20.field978[var23] = var20.field978[var22];
                                var20.field998[var22] = -1;
                                var20.field978[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field477;
                                int var25 = this.field357;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method309(var24, false, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method309(var24, false, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method309(this.field477, false, this.field357);
                            }
                            this.field554.method518(157, true);
                            this.field554.method545((byte) -53, var21);
                            this.field554.method520(this.field357);
                            this.field554.method553(this.field477, 674);
                            this.field554.method520(this.field476);
                        }
                    } else if ((this.field598 == 1 || this.method113(-42569, this.field630 - 1)) && this.field630 > 2) {
                        this.method35(this.field514);
                    } else if (this.field630 > 0) {
                        this.method62(-701, this.field630 - 1);
                    }
                    this.field457 = 10;
                    super.field902 = 0;
                }
            }
            if (class30.field1070 != -1) {
                int var26 = class30.field1070;
                int var27 = class30.field1071;
                boolean var28 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var26, (byte) 9, 0, var27, 0, 0, true);
                class30.field1070 = -1;
                if (var28) {
                    this.field254 = super.field903;
                    this.field255 = super.field904;
                    this.field257 = 1;
                    this.field256 = 0;
                }
            }
            if (super.field902 == 1 && this.field524 != null) {
                this.field524 = null;
                this.field305 = true;
                super.field902 = 0;
            }
            this.method176((byte) -54);
            if (this.field259 == -1) {
                this.method82(-69);
                this.method117(-388);
                this.method72((byte) -16);
            }
            if (super.field895 == 1 || super.field902 == 1) {
                ++this.field380;
            }
            if (this.field627 == 0 && this.field340 == 0 && this.field332 == 0) {
                if (this.field192 > 0) {
                    --this.field192;
                }
            } else if (this.field192 < 100) {
                ++this.field192;
                if (this.field192 == 100) {
                    if (this.field627 != 0) {
                        this.field305 = true;
                    }
                    if (this.field340 != 0) {
                        this.field375 = true;
                    }
                }
            }
            if (this.field274 == 2) {
                this.method90((byte) 15);
            }
            if (this.field274 == 2 && this.field649) {
                this.method36(390);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field252[var29]++;
            }
            this.method107(true);
            ++super.field894;
            if (super.field894 > 4500) {
                this.field243 = 250;
                super.field894 -= 500;
                this.field554.method518(120, true);
            }
            ++this.field372;
            if (arg0 >= 0) {
                this.field349 = !this.field349;
            }
            if (this.field372 > 500) {
                this.field372 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field515 += this.field516;
                }
                if ((var30 & 2) == 2) {
                    this.field342 += this.field343;
                }
                if ((var30 & 4) == 4) {
                    this.field412 += this.field413;
                }
            }
            if (this.field515 < -50) {
                this.field516 = 2;
            }
            if (this.field515 > 50) {
                this.field516 = -2;
            }
            if (this.field342 < -55) {
                this.field343 = 2;
            }
            if (this.field342 > 55) {
                this.field343 = -2;
            }
            if (this.field412 < -40) {
                this.field413 = 1;
            }
            if (this.field412 > 40) {
                this.field413 = -1;
            }
            ++this.field307;
            if (this.field307 > 500) {
                this.field307 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field665 += this.field666;
                }
                if ((var31 & 2) == 2) {
                    this.field488 += this.field489;
                }
            }
            if (this.field665 < -60) {
                this.field666 = 2;
            }
            if (this.field665 > 60) {
                this.field666 = -2;
            }
            if (this.field488 < -20) {
                this.field489 = 1;
            }
            if (this.field488 > 10) {
                this.field489 = -1;
            }
            ++field203;
            if (field203 > 1503) {
                field203 = 0;
                this.field554.method518(148, true);
                this.field554.method519(0);
                int var32 = this.field554.field1589;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field554.method520(49529);
                }
                this.field554.method519(10);
                this.field554.method519(242);
                this.field554.method519(58);
                this.field554.method520((int) (Math.random() * 65536.0D));
                this.field554.method519(245);
                this.field554.method520(51582);
                this.field554.method519(73);
                this.field554.method520(62060);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field554.method519(175);
                }
                this.field554.method528(this.field554.field1589 - var32, 0);
            }
            ++this.field242;
            if (this.field242 > 50) {
                this.field554.method518(122, true);
            }
            try {
                if (this.field326 != null && this.field554.field1589 > 0) {
                    this.field326.method472(this.field554.field1588, this.field554.field1589, 0, 0);
                    this.field554.field1589 = 0;
                    this.field242 = 0;
                }
            } catch (IOException var34) {
                this.method58(true);
            } catch (Exception var35) {
                this.method137(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILIJNDWVIL;)I")
    public final int method76(int arg0, int arg1, class29 arg2) {
        if (arg0 <= 0) {
            this.field594 = null;
        }
        if (arg2.field954 != null && arg1 < arg2.field954.length) {
            try {
                int[] var4 = arg2.field954[arg1];
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
                        var9 = this.field505[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field287[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field558[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class29 var11 = class29.method311(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class54.field1427 && (!class54.method482(var12).field1431 || field543)) {
                            for (int var13 = 0; var13 < var11.field998.length; ++var13) {
                                if (var12 + 1 == var11.field998[var13]) {
                                    var9 += var11.field978[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field511[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field374[this.field287[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field511[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field219.field1567;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class70.field1732; ++var14) {
                            if (class70.field1734[var14]) {
                                var9 += this.field287[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class29 var15 = class29.method311(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class54.field1427 && (!class54.method482(var16).field1431 || field543)) {
                            for (int var17 = 0; var17 < var15.field998.length; ++var17) {
                                if (var15.field998[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field462;
                    }
                    if (var8 == 12) {
                        var9 = this.field299;
                    }
                    if (var8 == 13) {
                        int var18 = this.field511[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class60 var21 = class60.field1604[var20];
                        int var22 = var21.field1606;
                        int var23 = var21.field1607;
                        int var24 = var21.field1608;
                        int var25 = field632[var24 - var23];
                        var9 = this.field511[var22] >> var23 & var25;
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
                        var9 = (field219.field30 >> 7) + this.field247;
                    }
                    if (var8 == 19) {
                        var9 = (field219.field31 >> 7) + this.field248;
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

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method77(int arg0) {
        for (int var2 = -1; var2 < this.field441; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field439;
            } else {
                var3 = this.field442[var2];
            }
            class58 var4 = this.field440[var3];
            if (var4 != null) {
                this.method93(-962, 1, var4);
            }
        }
        ++field319;
        if (arg0 > 0) {
            if (field319 > 69) {
                field319 = 0;
                this.field554.method518(75, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method78(int arg0) {
        this.field495 = false;
        while (this.field474) {
            this.field495 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field447 = null;
        this.field448 = null;
        this.field286 = null;
        this.field668 = null;
        this.field669 = null;
        this.field670 = null;
        this.field671 = null;
        this.field545 = null;
        this.field546 = null;
        this.field592 = null;
        this.field593 = null;
        if (arg0 < 0) {
            this.field604 = null;
            this.field605 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method79(byte arg0) {
        if (this.field478 == 0) {
            this.field487[0] = "Cancel";
            this.field200[0] = 1946;
            this.field630 = 1;
            if (this.field259 != -1) {
                this.field230 = 0;
                this.field253 = 0;
                this.method180(0, class29.method311(this.field259), 0, 0, this.field590, 0, super.field896, super.field897);
                if (this.field621 != this.field230) {
                    this.field621 = this.field230;
                }
                if (this.field332 != this.field253) {
                    this.field332 = this.field253;
                }
            } else {
                this.method163(169);
                this.field230 = 0;
                this.field253 = 0;
                if (super.field896 > 4 && super.field897 > 4 && super.field896 < 516 && super.field897 < 338) {
                    if (this.field403 != -1) {
                        this.method180(4, class29.method311(this.field403), 0, 0, this.field590, 4, super.field896, super.field897);
                    } else {
                        this.method169(14);
                    }
                }
                if (this.field621 != this.field230) {
                    this.field621 = this.field230;
                }
                if (this.field332 != this.field253) {
                    this.field332 = this.field253;
                }
                this.field230 = 0;
                this.field253 = 0;
                if (super.field896 > 553 && super.field897 > 205 && super.field896 < 743 && super.field897 < 466) {
                    if (this.field446 != -1) {
                        this.method180(553, class29.method311(this.field446), 1, 0, this.field590, 205, super.field896, super.field897);
                    } else if (this.field320[this.field295] != -1) {
                        this.method180(553, class29.method311(this.field320[this.field295]), 1, 0, this.field590, 205, super.field896, super.field897);
                    }
                }
                if (this.field311 != this.field230) {
                    this.field375 = true;
                    this.field311 = this.field230;
                }
                if (this.field340 != this.field253) {
                    this.field375 = true;
                    this.field340 = this.field253;
                }
                this.field230 = 0;
                this.field253 = 0;
                if (super.field896 > 17 && super.field897 > 357 && super.field896 < 496 && super.field897 < 453) {
                    if (this.field468 != -1) {
                        this.method180(17, class29.method311(this.field468), 2, 0, this.field590, 357, super.field896, super.field897);
                    } else if (this.field672 != -1) {
                        this.method180(17, class29.method311(this.field672), 3, 0, this.field590, 357, super.field896, super.field897);
                    } else if (super.field897 < 434 && super.field896 < 426 && this.field547 == 0) {
                        this.method129(super.field896 - 17, false, super.field897 - 357);
                    }
                }
                if ((this.field468 != -1 || this.field672 != -1) && this.field381 != this.field230) {
                    this.field305 = true;
                    this.field381 = this.field230;
                }
                if ((this.field468 != -1 || this.field672 != -1) && this.field627 != this.field253) {
                    this.field305 = true;
                    this.field627 = this.field253;
                }
                boolean var2 = false;
                if (arg0 != -113) {
                    this.field571 = -389;
                }
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field630 - 1; ++var3) {
                        if (this.field200[var3] < 1000 && this.field200[var3 + 1] > 1000) {
                            String var4 = this.field487[var3];
                            this.field487[var3] = this.field487[var3 + 1];
                            this.field487[var3 + 1] = var4;
                            int var5 = this.field200[var3];
                            this.field200[var3] = this.field200[var3 + 1];
                            this.field200[var3 + 1] = var5;
                            int var6 = this.field198[var3];
                            this.field198[var3] = this.field198[var3 + 1];
                            this.field198[var3 + 1] = var6;
                            int var7 = this.field199[var3];
                            this.field199[var3] = this.field199[var3 + 1];
                            this.field199[var3 + 1] = var7;
                            int var8 = this.field201[var3];
                            this.field201[var3] = this.field201[var3 + 1];
                            this.field201[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZILIJNDWVIL;)V")
    public final void method80(int arg0, int arg1, boolean arg2, int arg3, class29 arg4) {
        if (arg4.field1014 == 0 && arg4.field994 != null) {
            if (!arg4.field1010 || this.field621 == arg4.field983 || this.field311 == arg4.field983 || this.field381 == arg4.field983) {
                int var6 = class26.field922;
                int var7 = class26.field920;
                int var8 = class26.field923;
                int var9 = class26.field921;
                class26.method253(-76, arg1, arg3, arg4.field975 + arg3, arg4.field1000 + arg1);
                this.field428 &= arg2;
                int var10 = arg4.field994.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field992[var11] + arg3;
                    int var13 = arg4.field1020[var11] + arg1 - arg0;
                    class29 var14 = class29.method311(arg4.field994[var11]);
                    int var15 = var14.field974 + var12;
                    int var16 = var14.field979 + var13;
                    if (var14.field1008 > 0) {
                        this.method177(var14, true);
                    }
                    if (var14.field1014 == 0) {
                        if (var14.field976 > var14.field981 - var14.field1000) {
                            var14.field976 = var14.field981 - var14.field1000;
                        }
                        if (var14.field976 < 0) {
                            var14.field976 = 0;
                        }
                        this.method80(var14.field976, var16, true, var15, var14);
                        if (var14.field981 > var14.field1000) {
                            this.method105(var14.field1000, var14.field976, 2, var14.field981, var16, var14.field975 + var15);
                        }
                    } else if (var14.field1014 != 1) {
                        if (var14.field1014 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1000; ++var18) {
                                for (int var19 = 0; var19 < var14.field975; ++var19) {
                                    int var20 = (var14.field1001 + 32) * var19 + var15;
                                    int var21 = (var14.field988 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1021[var17];
                                        var21 += var14.field1024[var17];
                                    }
                                    if (var14.field998[var17] <= 0) {
                                        if (var14.field984 != null && var17 < 20) {
                                            class38 var30 = var14.field984[var17];
                                            if (var30 != null) {
                                                var30.method400(var21, this.field334, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field998[var17] - 1;
                                        if (var20 > class26.field922 - 32 && var20 < class26.field923 && var21 > class26.field920 - 32 && var21 < class26.field921 || this.field478 != 0 && this.field477 == var17) {
                                            int var25 = 0;
                                            if (this.field499 == 1 && this.field500 == var17 && this.field501 == var14.field983) {
                                                var25 = 16777215;
                                            }
                                            class38 var26 = class54.method492(var24, var14.field978[var17], var25, -24356);
                                            if (var26 != null) {
                                                if (this.field478 != 0 && this.field477 == var17 && this.field476 == var14.field983) {
                                                    var22 = super.field896 - this.field479;
                                                    var23 = super.field897 - this.field480;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field631 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method402(var20 + var22, var21 + var23, 0, 128);
                                                    if (var21 + var23 < class26.field920 && arg4.field976 > 0) {
                                                        int var27 = (class26.field920 - var21 - var23) * this.field322 / 3;
                                                        if (var27 > this.field322 * 10) {
                                                            var27 = this.field322 * 10;
                                                        }
                                                        if (var27 > arg4.field976) {
                                                            var27 = arg4.field976;
                                                        }
                                                        arg4.field976 -= var27;
                                                        this.field480 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class26.field921 && arg4.field976 < arg4.field981 - arg4.field1000) {
                                                        int var28 = (var21 + var23 + 32 - class26.field921) * this.field322 / 3;
                                                        if (var28 > this.field322 * 10) {
                                                            var28 = this.field322 * 10;
                                                        }
                                                        if (var28 > arg4.field981 - arg4.field1000 - arg4.field976) {
                                                            var28 = arg4.field981 - arg4.field1000 - arg4.field976;
                                                        }
                                                        arg4.field976 += var28;
                                                        this.field480 -= var28;
                                                    }
                                                } else if (this.field460 != 0 && this.field459 == var17 && this.field458 == var14.field983) {
                                                    var26.method402(var20, var21, 0, 128);
                                                } else {
                                                    var26.method400(var21, this.field334, var20);
                                                }
                                                if (var26.field1209 == 33 || var14.field978[var17] != 1) {
                                                    int var29 = var14.field978[var17];
                                                    this.field407.method384(method101(-394, var29), var21 + 10 + var23, var20 + 1 + var22, this.field285, 0);
                                                    this.field407.method384(method101(-394, var29), var21 + 9 + var23, var20 + var22, this.field285, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1014 == 3) {
                            boolean var31 = false;
                            if (this.field381 == var14.field983 || this.field311 == var14.field983 || this.field621 == var14.field983) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method150(0, var14)) {
                                var32 = var14.field970;
                                if (var31 && var14.field951 != 0) {
                                    var32 = var14.field951;
                                }
                            } else {
                                var32 = var14.field999;
                                if (var31 && var14.field965 != 0) {
                                    var32 = var14.field965;
                                }
                            }
                            if (var14.field989 == 0) {
                                if (var14.field973) {
                                    class26.method256(var15, var14.field975, var16, var32, var14.field1000, (byte) 127);
                                } else {
                                    class26.method257(var15, var16, var14.field1000, var14.field975, var32, 149);
                                }
                            } else if (var14.field973) {
                                class26.method255(var32, var14.field975, 256 - (var14.field989 & 255), var14.field1000, var16, 252, var15);
                            } else {
                                class26.method258(256 - (var14.field989 & 255), var16, var14.field975, var32, 0, var14.field1000, var15);
                            }
                        } else if (var14.field1014 == 4) {
                            class36 var33 = var14.field1006;
                            String var34 = var14.field972;
                            boolean var35 = false;
                            if (this.field381 == var14.field983 || this.field311 == var14.field983 || this.field621 == var14.field983) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method150(0, var14)) {
                                var36 = var14.field970;
                                if (var35 && var14.field951 != 0) {
                                    var36 = var14.field951;
                                }
                                if (var14.field997.length() > 0) {
                                    var34 = var14.field997;
                                }
                            } else {
                                var36 = var14.field999;
                                if (var35 && var14.field965 != 0) {
                                    var36 = var14.field965;
                                }
                            }
                            if (var14.field1007 == 6 && this.field321) {
                                var34 = "Please wait...";
                                var36 = var14.field999;
                            }
                            if (class26.field918 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1192 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method144(this.method76(417, 4, var14), 0) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method144(this.method76(417, 3, var14), 0) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method144(this.method76(417, 2, var14), 0) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method144(this.method76(417, 1, var14), 0) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method144(this.method76(417, 0, var14), 0) + var34.substring(var38 + 2);
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
                                if (var14.field1023) {
                                    var33.method381(9, var44, var14.field1017, var37, var36, var14.field975 / 2 + var15);
                                } else {
                                    var33.method388(0, var15, var37, var36, var14.field1017, var44);
                                }
                                var37 += var33.field1192;
                            }
                        } else if (var14.field1014 == 5) {
                            class38 var45;
                            if (this.method150(0, var14)) {
                                var45 = var14.field967;
                            } else {
                                var45 = var14.field1025;
                            }
                            if (var45 != null) {
                                var45.method400(var16, this.field334, var15);
                            }
                        } else if (var14.field1014 == 6) {
                            int var46 = class22.field837;
                            int var47 = class22.field838;
                            class22.field837 = var14.field975 / 2 + var15;
                            class22.field838 = var14.field1000 / 2 + var16;
                            int var48 = class22.field841[var14.field986] * var14.field985 >> 16;
                            int var49 = class22.field842[var14.field986] * var14.field985 >> 16;
                            boolean var50 = this.method150(0, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field964;
                            } else {
                                var51 = var14.field963;
                            }
                            class45 var52;
                            if (var51 == -1) {
                                var52 = var14.method314(var50, -1, -1, 866);
                            } else {
                                class34 var53 = class34.field1140[var51];
                                var52 = var14.method314(var50, var53.field1143[var14.field980], var53.field1142[var14.field980], 866);
                            }
                            if (var52 != null) {
                                var52.method454(0, var14.field987, 0, var14.field986, 0, var48, var49);
                            }
                            class22.field837 = var46;
                            class22.field838 = var47;
                        } else {
                            if (var14.field1014 == 7) {
                                class36 var54 = var14.field1006;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1000; ++var56) {
                                    for (int var57 = 0; var57 < var14.field975; ++var57) {
                                        if (var14.field998[var55] > 0) {
                                            class54 var58 = class54.method482(var14.field998[var55] - 1);
                                            String var59 = String.valueOf(var58.field1422);
                                            if (var58.field1430 || var14.field978[var55] != 1) {
                                                var59 = var59 + " x" + method112(var14.field978[var55], 888);
                                            }
                                            int var60 = (var14.field1001 + 115) * var57 + var15;
                                            int var61 = (var14.field988 + 12) * var56 + var16;
                                            if (var14.field1023) {
                                                var54.method381(9, var59, var14.field1017, var61, var14.field999, var14.field975 / 2 + var60);
                                            } else {
                                                var54.method388(0, var60, var61, var14.field999, var14.field1017, var59);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1014 == 8 && (this.field627 == var14.field983 || this.field340 == var14.field983 || this.field332 == var14.field983) && this.field192 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class36 var64 = this.field408;
                                String var65 = var14.field972;
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
                                    int var74 = var64.method382(var73, (byte) 3);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1192 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field975 + var15 - 5 - var62;
                                int var67 = var14.field1000 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg4.field975 + arg3) {
                                    var66 = arg4.field975 + arg3 - var62;
                                }
                                if (var63 + var67 > arg4.field1000 + arg1) {
                                    var67 = arg4.field1000 + arg1 - var63;
                                }
                                class26.method256(var66, var62, var67, 16777120, var63, (byte) 127);
                                class26.method257(var66, var67, var63, var62, 0, 149);
                                String var68 = var14.field972;
                                int var69 = var64.field1192 + var67 + 2;
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
                                    var64.method388(0, var66 + 3, var69, 0, false, var71);
                                    var69 += var64.field1192 + 1;
                                }
                            }
                        }
                    }
                }
                class26.method253(-76, var7, var6, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method81(byte arg0) {
        if (arg0 == 5) {
            this.field447 = new class43(this.field344, "titlebox", 0);
            this.field448 = new class43(this.field344, "titlebutton", 0);
            this.field286 = new class43[12];
            for (int var2 = 0; var2 < 12; ++var2) {
                this.field286[var2] = new class43(this.field344, "runes", var2);
            }
            this.field604 = new class38(128, 265);
            this.field605 = new class38(128, 265);
            for (int var3 = 0; var3 < 33920; ++var3) {
                this.field604.field1204[var3] = this.field676.field4[var3];
            }
            for (int var4 = 0; var4 < 33920; ++var4) {
                this.field605.field1204[var4] = this.field677.field4[var4];
            }
            this.field669 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                this.field669[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                this.field669[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field669[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field669[var8 + 192] = 16777215;
            }
            this.field670 = new int[256];
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field670[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field670[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field670[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field670[var12 + 192] = 16777215;
            }
            this.field671 = new int[256];
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field671[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field671[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field671[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field671[var16 + 192] = 16777215;
            }
            this.field668 = new int[256];
            this.field545 = new int[32768];
            this.field546 = new int[32768];
            this.method64((class43) null, false);
            this.field592 = new int[32768];
            this.field593 = new int[32768];
            this.method118(10, "Connecting to fileserver", 0);
            if (!this.field495) {
                this.field202 = true;
                this.field495 = true;
                this.method154(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method82(int arg0) {
        while (arg0 >= 0) {
            this.field240 = this.field292.method529();
        }
        if (this.field235 == 0) {
            if (super.field902 == 1) {
                int var2 = super.field903 - 25 - 550;
                int var3 = super.field904 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field665 + this.field377 & 2047;
                    int var5 = class22.field841[var4];
                    int var6 = class22.field842[var4];
                    int var7 = (this.field488 + 256) * var5 >> 8;
                    int var8 = (this.field488 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field219.field30 + var9 >> 7;
                    int var12 = field219.field31 - var10 >> 7;
                    boolean var13 = this.method49(0, 0, field219.field63[0], field219.field62[0], 0, var11, (byte) 9, 0, var12, 1, 0, true);
                    if (var13) {
                        this.field554.method519(var2);
                        this.field554.method519(var3);
                        this.field554.method520(this.field377);
                        this.field554.method519(57);
                        this.field554.method519(this.field665);
                        this.field554.method519(this.field488);
                        this.field554.method519(89);
                        this.field554.method520(field219.field30);
                        this.field554.method520(field219.field31);
                        this.field554.method519(this.field584);
                        this.field554.method519(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method83(int arg0, int arg1) {
        int[] var3 = this.field684.field1204;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field540[arg0][var25][var6] & 24) == 0) {
                    this.field434.method355(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (this.field540[arg0 + 1][var25][var6] & 8) != 0) {
                    this.field434.method355(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field684.method395(this.field603);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field540[arg0][var23][var9] & 24) == 0) {
                    this.method126(var9, var7, var23, arg0, var8, (byte) 119);
                }
                if (arg0 < 3 && (this.field540[arg0 + 1][var23][var9] & 8) != 0) {
                    this.method126(var9, var7, var23, arg0 + 1, var8, (byte) 119);
                }
            }
        }
        if (this.field338 != null) {
            this.field338.method1(this.field603);
            class22.field843 = this.field426;
        }
        this.field518 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field434.method349(this.field417, var10, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class55.method499(var14).field1475;
                    if (var15 >= 0) {
                        int var16 = var10;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field284[this.field417].field1630;
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
                        this.field473[this.field518] = this.field596[var15];
                        this.field519[this.field518] = var16;
                        this.field520[this.field518] = var17;
                        ++this.field518;
                    }
                }
            }
        }
        int var11 = 90 / arg1;
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public void method84(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field313);
        if (this.field328 != null) {
            System.out.println("Od-cycle:" + this.field328.field822);
        }
        System.out.println("loop-cycle:" + field493);
        System.out.println("draw-cycle:" + field437);
        System.out.println("ptype:" + this.field240);
        int var2 = 74 / arg0;
        System.out.println("psize:" + this.field239);
        if (this.field326 != null) {
            this.field326.method473(62);
        }
        super.field885 = true;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method85(boolean arg0) {
        this.field428 &= arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field891 != null ? super.field891 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        if (this.field673 == null) {
            super.field889 = null;
            this.field339 = null;
            this.field337 = null;
            this.field336 = null;
            this.field338 = null;
            this.field227 = null;
            if (!arg0) {
                field273 = !field273;
            }
            this.field228 = null;
            this.field229 = null;
            this.field676 = new class1(265, -826, this.method85(field273), 128);
            class26.method254(662);
            this.field677 = new class1(265, -826, this.method85(field273), 128);
            class26.method254(662);
            this.field673 = new class1(171, -826, this.method85(field273), 509);
            class26.method254(662);
            this.field674 = new class1(132, -826, this.method85(field273), 360);
            class26.method254(662);
            this.field675 = new class1(200, -826, this.method85(field273), 360);
            class26.method254(662);
            this.field678 = new class1(238, -826, this.method85(field273), 202);
            class26.method254(662);
            this.field679 = new class1(238, -826, this.method85(field273), 203);
            class26.method254(662);
            this.field680 = new class1(94, -826, this.method85(field273), 74);
            class26.method254(662);
            this.field681 = new class1(94, -826, this.method85(field273), 75);
            class26.method254(662);
            if (this.field344 != null) {
                this.method68(field587);
                this.method81((byte) 5);
            }
            this.field308 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method87(int arg0) {
        if (super.field889 == null) {
            this.method78(-182);
            this.field673 = null;
            this.field674 = null;
            this.field675 = null;
            this.field676 = null;
            this.field677 = null;
            this.field678 = null;
            this.field679 = null;
            this.field680 = null;
            this.field681 = null;
            this.field339 = null;
            this.field337 = null;
            this.field336 = null;
            this.field338 = null;
            this.field227 = null;
            this.field228 = null;
            this.field229 = null;
            super.field889 = new class1(503, -826, this.method85(field273), 765);
            this.field308 = true;
            if (arg0 < 1 || arg0 > 1) {
                this.field481 = this.field597.method201();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILIJNDWVIL;)Z")
    public final boolean method88(int arg0, class29 arg1) {
        int var3 = arg1.field1008;
        if (arg0 != 3) {
            this.field577 = 363;
        }
        if (this.field419 == 2) {
            if (var3 == 201) {
                this.field305 = true;
                this.field547 = 0;
                this.field615 = true;
                this.field609 = "";
                this.field324 = 1;
                this.field552 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field305 = true;
                this.field547 = 0;
                this.field615 = true;
                this.field609 = "";
                this.field324 = 2;
                this.field552 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field243 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field305 = true;
                this.field547 = 0;
                this.field615 = true;
                this.field609 = "";
                this.field324 = 4;
                this.field552 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field305 = true;
                this.field547 = 0;
                this.field615 = true;
                this.field609 = "";
                this.field324 = 5;
                this.field552 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field329[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class44.field1257 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class44.field1257) {
                                var6 = 0;
                            }
                        }
                        if (!class44.field1258[var6].field1264 && class44.field1258[var6].field1259 == var4 + (this.field525 ? 0 : 7)) {
                            this.field329[var4] = var6;
                            this.field606 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field360[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field356[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field356[var7].length) {
                        var9 = 0;
                    }
                }
                this.field360[var7] = var9;
                this.field606 = true;
            }
            if (var3 == 324 && !this.field525) {
                this.field525 = true;
                this.method46(0);
            }
            if (var3 == 325 && this.field525) {
                this.field525 = false;
                this.method46(0);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field572 = !this.field572;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method166(true);
                    if (this.field296.length() > 0) {
                        this.field554.method518(114, true);
                        this.field554.method525(class12.method182(this.field296), this.field237);
                        this.field554.method519(var3 - 601);
                        this.field554.method519(this.field572 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field554.method518(115, true);
                this.field554.method519(this.field525 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field554.method519(this.field329[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field554.method519(this.field360[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method89(int arg0) {
        if (this.field630 >= 2 || this.field499 != 0 || this.field345 != 0) {
            String var2;
            if (this.field499 == 1 && this.field630 < 2) {
                var2 = "Use " + this.field503 + " with...";
            } else if (this.field345 == 1 && this.field630 < 2) {
                var2 = this.field348 + "...";
            } else {
                var2 = this.field487[this.field630 - 1];
            }
            if (this.field630 > 2) {
                var2 = var2 + "@whi@ / " + (this.field630 - 2) + " more options";
            }
            this.field409.method389(field493 / 1000, 15, 16777215, 4, true, var2, 21911);
            this.field239 += arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 366);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field541 = Integer.parseInt(arg0[0]);
                field542 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method123(6);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method116(field634);
                }
                if (arg0[3].equals("free")) {
                    field543 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field543 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method246(765, 503, 1);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method90(byte arg0) {
        if (arg0 != 15) {
            this.field594 = null;
        }
        try {
            int var2 = field219.field30 + this.field515;
            int var3 = field219.field31 + this.field342;
            if (this.field383 - var2 < -500 || this.field383 - var2 > 500 || this.field384 - var3 < -500 || this.field384 - var3 > 500) {
                this.field383 = var2;
                this.field384 = var3;
            }
            if (this.field383 != var2) {
                this.field383 += (var2 - this.field383) / 16;
            }
            if (this.field384 != var3) {
                this.field384 += (var3 - this.field384) / 16;
            }
            if (super.field906[1] == 1) {
                this.field378 += (-24 - this.field378) / 2;
            } else if (super.field906[2] == 1) {
                this.field378 += (24 - this.field378) / 2;
            } else {
                this.field378 /= 2;
            }
            if (super.field906[3] == 1) {
                this.field379 += (12 - this.field379) / 2;
            } else if (super.field906[4] == 1) {
                this.field379 += (-12 - this.field379) / 2;
            } else {
                this.field379 /= 2;
            }
            this.field377 = this.field378 / 2 + this.field377 & 2047;
            this.field376 += this.field379 / 2;
            if (this.field376 < 128) {
                this.field376 = 128;
            }
            if (this.field376 > 383) {
                this.field376 = 383;
            }
            int var4 = this.field383 >> 7;
            int var5 = this.field384 >> 7;
            int var6 = this.method173(this.field383, this.field417, this.field384, this.field327);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field417;
                        if (var10 < 3 && (this.field540[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field395[var10][var8][var9];
                        if (var11 > var7) {
                            var7 = var11;
                        }
                    }
                }
            }
            ++field583;
            if (field583 > 1496) {
                field583 = 0;
                this.field554.method518(253, true);
                this.field554.method519(0);
                int var12 = this.field554.field1589;
                this.field554.method520(33963);
                this.field554.method519(182);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field554.method520(51200);
                }
                this.field554.method519((int) (Math.random() * 256.0D));
                this.field554.method520((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field554.method520(6721);
                }
                this.field554.method520((int) (Math.random() * 65536.0D));
                this.field554.method519(136);
                this.field554.method519(59);
                this.field554.method520(42501);
                this.field554.method528(this.field554.field1589 - var12, 0);
            }
            int var13 = var7 * 192;
            if (var13 > 98048) {
                var13 = 98048;
            }
            if (var13 < 32768) {
                var13 = 32768;
            }
            if (var13 > this.field646) {
                this.field646 += (var13 - this.field646) / 24;
            } else if (var13 < this.field646) {
                this.field646 += (var13 - this.field646) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field219.field30 + "," + field219.field31 + "," + this.field383 + "," + this.field384 + "," + this.field225 + "," + this.field226 + "," + this.field247 + "," + this.field248);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LTKPFKOXP;ZI)V")
    private final void method91(class59 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field554.method519(139);
        }
        for (int var4 = 0; var4 < this.field443; ++var4) {
            int var5 = this.field444[var4];
            class71 var6 = this.field430[var5];
            int var7 = arg0.method529();
            if ((var7 & 32) != 0) {
                var6.field20 = arg0.method557(false);
                int var8 = arg0.method534();
                var6.field24 = var8 >> 16;
                var6.field23 = (var8 & 65535) + field493;
                var6.field21 = 0;
                var6.field22 = 0;
                if (var6.field23 > field493) {
                    var6.field21 = -1;
                }
                if (var6.field20 == 65535) {
                    var6.field20 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                int var9 = arg0.method558((byte) 74);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method548(435);
                if (var6.field47 == var9 && var9 != -1) {
                    int var11 = class34.field1140[var9].field1154;
                    if (var11 == 1) {
                        var6.field48 = 0;
                        var6.field49 = 0;
                        var6.field50 = var10;
                        var6.field51 = 0;
                    }
                    if (var11 == 2) {
                        var6.field51 = 0;
                    }
                } else if (var9 == -1 || var6.field47 == -1 || class34.field1140[var9].field1148 >= class34.field1140[var6.field47].field1148) {
                    var6.field47 = var9;
                    var6.field48 = 0;
                    var6.field49 = 0;
                    var6.field50 = var10;
                    var6.field51 = 0;
                    var6.field52 = var6.field44;
                }
            }
            if ((var7 & 1) != 0) {
                int var12 = arg0.method547(this.field642);
                int var13 = arg0.method548(435);
                var6.method10(var12, field493, true, var13);
                var6.field36 = field493 + 300;
                var6.field37 = arg0.method529();
                var6.field38 = arg0.method529();
            }
            if ((var7 & 128) != 0) {
                var6.field43 = arg0.method536();
                var6.field45 = 100;
            }
            if ((var7 & 16) != 0) {
                var6.field35 = arg0.method531();
                if (var6.field35 == 65535) {
                    var6.field35 = -1;
                }
            }
            if ((var7 & 64) != 0) {
                int var14 = arg0.method549(0);
                int var15 = arg0.method549(0);
                var6.method10(var14, field493, true, var15);
                var6.field36 = field493 + 300;
                var6.field37 = arg0.method548(435);
                var6.field38 = arg0.method529();
            }
            if ((var7 & 4) != 0) {
                var6.field1737 = class69.method598(arg0.method556(false));
                var6.field41 = var6.field1737.field1716;
                var6.field33 = var6.field1737.field1693;
                var6.field25 = var6.field1737.field1707;
                var6.field26 = var6.field1737.field1722;
                var6.field27 = var6.field1737.field1721;
                var6.field28 = var6.field1737.field1696;
                var6.field65 = var6.field1737.field1700;
            }
            if ((var7 & 8) != 0) {
                var6.field57 = arg0.method558((byte) 74);
                var6.field58 = arg0.method558((byte) 74);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method92(int arg0) {
        int var2 = 79 / arg0;
        for (int var3 = 0; var3 < this.field431; ++var3) {
            int var4 = this.field432[var3];
            class71 var5 = this.field430[var4];
            if (var5 != null) {
                this.method93(-962, var5.field1737.field1716, var5);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILAQPBLKMD;)V")
    public final void method93(int arg0, int arg1, class3 arg2) {
        if (arg2.field30 < 128 || arg2.field31 < 128 || arg2.field30 >= 13184 || arg2.field31 >= 13184) {
            arg2.field47 = -1;
            arg2.field20 = -1;
            arg2.field71 = 0;
            arg2.field72 = 0;
            arg2.field30 = arg2.field62[0] * 128 + arg2.field41 * 64;
            arg2.field31 = arg2.field63[0] * 128 + arg2.field41 * 64;
            arg2.method6(28123);
        }
        if (field219 == arg2 && (arg2.field30 < 1536 || arg2.field31 < 1536 || arg2.field30 >= 11776 || arg2.field31 >= 11776)) {
            arg2.field47 = -1;
            arg2.field20 = -1;
            arg2.field71 = 0;
            arg2.field72 = 0;
            arg2.field30 = arg2.field62[0] * 128 + arg2.field41 * 64;
            arg2.field31 = arg2.field63[0] * 128 + arg2.field41 * 64;
            arg2.method6(28123);
        }
        if (arg2.field71 > field493) {
            this.method94(arg2, (byte) 44);
        } else if (arg2.field72 >= field493) {
            this.method95(arg2, -223);
        } else {
            this.method96(arg2, true);
        }
        this.method97((byte) 3, arg2);
        this.method98(0, arg2);
        while (arg0 >= 0) {
            this.field327 = this.field597.method201();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LAQPBLKMD;B)V")
    public final void method94(class3 arg0, byte arg1) {
        int var3 = arg0.field71 - field493;
        int var4 = arg0.field67 * 128 + arg0.field41 * 64;
        int var5 = arg0.field69 * 128 + arg0.field41 * 64;
        if (arg1 != 44) {
            this.method124();
        }
        arg0.field30 += (var4 - arg0.field30) / var3;
        arg0.field31 += (var5 - arg0.field31) / var3;
        arg0.field74 = 0;
        if (arg0.field73 == 0) {
            arg0.field75 = 1024;
        }
        if (arg0.field73 == 1) {
            arg0.field75 = 1536;
        }
        if (arg0.field73 == 2) {
            arg0.field75 = 0;
        }
        if (arg0.field73 == 3) {
            arg0.field75 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LAQPBLKMD;I)V")
    public final void method95(class3 arg0, int arg1) {
        if (field493 == arg0.field72 || arg0.field47 == -1 || arg0.field50 != 0 || arg0.field49 + 1 > class34.field1140[arg0.field47].method375((byte) -37, arg0.field48)) {
            int var3 = arg0.field72 - arg0.field71;
            int var4 = field493 - arg0.field71;
            int var5 = arg0.field67 * 128 + arg0.field41 * 64;
            int var6 = arg0.field69 * 128 + arg0.field41 * 64;
            int var7 = arg0.field68 * 128 + arg0.field41 * 64;
            int var8 = arg0.field70 * 128 + arg0.field41 * 64;
            arg0.field30 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field31 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field74 = 0;
        if (arg0.field73 == 0) {
            arg0.field75 = 1024;
        }
        if (arg0.field73 == 1) {
            arg0.field75 = 1536;
        }
        if (arg0.field73 == 2) {
            arg0.field75 = 0;
        }
        if (arg0.field73 == 3) {
            arg0.field75 = 512;
        }
        arg0.field32 = arg0.field75;
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LAQPBLKMD;Z)V")
    public final void method96(class3 arg0, boolean arg1) {
        arg0.field53 = arg0.field65;
        if (arg0.field44 == 0) {
            arg0.field74 = 0;
        } else {
            if (arg0.field47 != -1 && arg0.field50 == 0) {
                class34 var3 = class34.field1140[arg0.field47];
                if (arg0.field52 > 0 && var3.field1152 == 0) {
                    ++arg0.field74;
                    return;
                }
                if (arg0.field52 <= 0 && var3.field1153 == 0) {
                    ++arg0.field74;
                    return;
                }
            }
            int var4 = arg0.field30;
            int var5 = arg0.field31;
            this.field428 &= arg1;
            int var6 = arg0.field62[arg0.field44 - 1] * 128 + arg0.field41 * 64;
            int var7 = arg0.field63[arg0.field44 - 1] * 128 + arg0.field41 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field75 = 1280;
                    } else if (var5 > var7) {
                        arg0.field75 = 1792;
                    } else {
                        arg0.field75 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field75 = 768;
                    } else if (var5 > var7) {
                        arg0.field75 = 256;
                    } else {
                        arg0.field75 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field75 = 1024;
                } else {
                    arg0.field75 = 0;
                }
                int var8 = arg0.field75 - arg0.field32 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field26;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field25;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field28;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field27;
                }
                if (var9 == -1) {
                    var9 = arg0.field25;
                }
                arg0.field53 = var9;
                int var10 = 4;
                if (arg0.field75 != arg0.field32 && arg0.field35 == -1 && arg0.field33 != 0) {
                    var10 = 2;
                }
                if (arg0.field44 > 2) {
                    var10 = 6;
                }
                if (arg0.field44 > 3) {
                    var10 = 8;
                }
                if (arg0.field74 > 0 && arg0.field44 > 1) {
                    var10 = 8;
                    --arg0.field74;
                }
                if (arg0.field40[arg0.field44 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field53 == arg0.field25 && arg0.field64 != -1) {
                    arg0.field53 = arg0.field64;
                }
                if (var4 < var6) {
                    arg0.field30 += var10;
                    if (arg0.field30 > var6) {
                        arg0.field30 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field30 -= var10;
                    if (arg0.field30 < var6) {
                        arg0.field30 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field31 += var10;
                    if (arg0.field31 > var7) {
                        arg0.field31 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field31 -= var10;
                    if (arg0.field31 < var7) {
                        arg0.field31 = var7;
                    }
                }
                if (arg0.field30 == var6 && arg0.field31 == var7) {
                    --arg0.field44;
                    if (arg0.field52 > 0) {
                        --arg0.field52;
                        return;
                    }
                }
            } else {
                arg0.field30 = var6;
                arg0.field31 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLAQPBLKMD;)V")
    public final void method97(byte arg0, class3 arg1) {
        if (this.field492 != arg0) {
            this.field554.method519(99);
        }
        if (arg1.field33 != 0) {
            if (arg1.field35 != -1 && arg1.field35 < 32768) {
                class71 var3 = this.field430[arg1.field35];
                if (var3 != null) {
                    int var4 = arg1.field30 - var3.field30;
                    int var5 = arg1.field31 - var3.field31;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field75 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field35 >= 32768) {
                int var6 = arg1.field35 - 32768;
                if (this.field504 == var6) {
                    var6 = this.field439;
                }
                class58 var7 = this.field440[var6];
                if (var7 != null) {
                    int var8 = arg1.field30 - var7.field30;
                    int var9 = arg1.field31 - var7.field31;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field75 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field57 != 0 || arg1.field58 != 0) && (arg1.field44 == 0 || arg1.field74 > 0)) {
                int var10 = arg1.field30 - (arg1.field57 - this.field247 - this.field247) * 64;
                int var11 = arg1.field31 - (arg1.field58 - this.field248 - this.field248) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field75 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field57 = 0;
                arg1.field58 = 0;
            }
            int var12 = arg1.field75 - arg1.field32 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field33 && var12 <= 2048 - arg1.field33) {
                    if (var12 > 1024) {
                        arg1.field32 -= arg1.field33;
                    } else {
                        arg1.field32 += arg1.field33;
                    }
                } else {
                    arg1.field32 = arg1.field75;
                }
                arg1.field32 &= 2047;
                if (arg1.field65 == arg1.field53 && arg1.field75 != arg1.field32) {
                    if (arg1.field66 != -1) {
                        arg1.field53 = arg1.field66;
                        return;
                    }
                    arg1.field53 = arg1.field25;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILAQPBLKMD;)V")
    public final void method98(int arg0, class3 arg1) {
        if (arg0 != 0) {
            this.field554.method519(130);
        }
        arg1.field39 = false;
        if (arg1.field53 != -1) {
            class34 var3 = class34.field1140[arg1.field53];
            ++arg1.field55;
            if (arg1.field54 < var3.field1141 && arg1.field55 > var3.method375((byte) -37, arg1.field54)) {
                arg1.field55 = 0;
                ++arg1.field54;
            }
            if (arg1.field54 >= var3.field1141) {
                arg1.field55 = 0;
                arg1.field54 = 0;
            }
        }
        if (arg1.field20 != -1 && field493 >= arg1.field23) {
            if (arg1.field21 < 0) {
                arg1.field21 = 0;
            }
            class34 var4 = class24.field864[arg1.field20].field868;
            ++arg1.field22;
            while (arg1.field21 < var4.field1141 && arg1.field22 > var4.method375((byte) -37, arg1.field21)) {
                arg1.field22 -= var4.method375((byte) -37, arg1.field21);
                ++arg1.field21;
            }
            if (arg1.field21 >= var4.field1141 && (arg1.field21 < 0 || arg1.field21 >= var4.field1141)) {
                arg1.field20 = -1;
            }
        }
        if (arg1.field47 != -1 && arg1.field50 <= 1) {
            class34 var5 = class34.field1140[arg1.field47];
            if (var5.field1152 == 1 && arg1.field52 > 0 && arg1.field71 <= field493 && arg1.field72 < field493) {
                arg1.field50 = 1;
                return;
            }
        }
        if (arg1.field47 != -1 && arg1.field50 == 0) {
            class34 var6 = class34.field1140[arg1.field47];
            ++arg1.field49;
            while (arg1.field48 < var6.field1141 && arg1.field49 > var6.method375((byte) -37, arg1.field48)) {
                arg1.field49 -= var6.method375((byte) -37, arg1.field48);
                ++arg1.field48;
            }
            if (arg1.field48 >= var6.field1141) {
                arg1.field48 -= var6.field1145;
                ++arg1.field51;
                if (arg1.field51 >= var6.field1151) {
                    arg1.field47 = -1;
                }
                if (arg1.field48 < 0 || arg1.field48 >= var6.field1141) {
                    arg1.field47 = -1;
                }
            }
            arg1.field39 = var6.field1147;
        }
        if (arg1.field50 > 0) {
            --arg1.field50;
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (this.field259 == -1 || this.field274 != 2 && super.field889 == null) {
            if (this.field308) {
                this.method143(false);
                this.field308 = false;
                this.field205.method2(4, 0, (byte) 6, super.field888);
                this.field206.method2(357, 0, (byte) 6, super.field888);
                this.field207.method2(4, 722, (byte) 6, super.field888);
                this.field208.method2(205, 743, (byte) 6, super.field888);
                this.field209.method2(0, 0, (byte) 6, super.field888);
                this.field210.method2(4, 516, (byte) 6, super.field888);
                this.field211.method2(205, 516, (byte) 6, super.field888);
                this.field212.method2(357, 496, (byte) 6, super.field888);
                this.field213.method2(338, 0, (byte) 6, super.field888);
                this.field375 = true;
                this.field305 = true;
                this.field281 = true;
                this.field588 = true;
                if (this.field274 != 2) {
                    this.field338.method2(4, 4, (byte) 6, super.field888);
                    this.field337.method2(4, 550, (byte) 6, super.field888);
                }
            }
            if (this.field274 == 2) {
                this.method158((byte) 2);
            }
            if (this.field589 && this.field260 == 1) {
                this.field375 = true;
            }
            if (this.field446 != -1) {
                boolean var4 = this.method127(this.field322, (byte) 8, this.field446);
                if (var4) {
                    this.field375 = true;
                }
            }
            if (this.field460 == 2) {
                this.field375 = true;
            }
            if (this.field478 == 2) {
                this.field375 = true;
            }
            if (this.field375) {
                this.method47(0);
                this.field375 = false;
            }
            if (this.field468 == -1 && this.field547 == 0) {
                this.field316.field976 = this.field352 - this.field538 - 77;
                if (super.field896 > 448 && super.field896 < 560 && super.field897 > 332) {
                    this.method140(true, 77, 0, this.field352, super.field897 - 357, -1, super.field896 - 17, 463, this.field316);
                }
                int var5 = this.field352 - 77 - this.field316.field976;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field352 - 77) {
                    var5 = this.field352 - 77;
                }
                if (this.field538 != var5) {
                    this.field538 = var5;
                    this.field305 = true;
                }
            }
            if (this.field468 == -1 && this.field547 == 3) {
                int var6 = this.field611 * 14 + 7;
                this.field316.field976 = this.field614;
                if (super.field896 > 448 && super.field896 < 560 && super.field897 > 332) {
                    this.method140(true, 77, 0, var6, super.field897 - 357, -1, super.field896 - 17, 463, this.field316);
                }
                int var7 = this.field316.field976;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field614 != var7) {
                    this.field614 = var7;
                    this.field305 = true;
                }
            }
            if (this.field468 != -1) {
                boolean var8 = this.method127(this.field322, (byte) 8, this.field468);
                if (var8) {
                    this.field305 = true;
                }
            }
            if (this.field460 == 3) {
                this.field305 = true;
            }
            if (this.field478 == 3) {
                this.field305 = true;
            }
            if (this.field524 != null) {
                this.field305 = true;
            }
            if (this.field589 && this.field260 == 2) {
                this.field305 = true;
            }
            if (this.field305) {
                this.method52(false);
                this.field305 = false;
            }
            if (this.field274 == 2) {
                this.method148(-24060);
                this.field337.method2(4, 550, (byte) 6, super.field888);
                ++field191;
                if (field191 > 69) {
                    field191 = 0;
                    this.field554.method518(167, true);
                }
            }
            if (this.field566 != -1) {
                this.field281 = true;
            }
            if (this.field281) {
                if (this.field566 != -1 && this.field566 == this.field295) {
                    this.field566 = -1;
                    this.field554.method518(178, true);
                    this.field554.method519(this.field295);
                }
                this.field281 = false;
                this.field229.method1(this.field603);
                this.field291.method421(0, this.field334, 0);
                if (this.field446 == -1) {
                    if (this.field320[this.field295] != -1) {
                        if (this.field295 == 0) {
                            this.field276.method421(10, this.field334, 22);
                        }
                        if (this.field295 == 1) {
                            this.field277.method421(8, this.field334, 54);
                        }
                        if (this.field295 == 2) {
                            this.field277.method421(8, this.field334, 82);
                        }
                        if (this.field295 == 3) {
                            this.field278.method421(8, this.field334, 110);
                        }
                        if (this.field295 == 4) {
                            this.field280.method421(8, this.field334, 153);
                        }
                        if (this.field295 == 5) {
                            this.field280.method421(8, this.field334, 181);
                        }
                        if (this.field295 == 6) {
                            this.field279.method421(9, this.field334, 209);
                        }
                    }
                    if (this.field320[0] != -1 && (this.field566 != 0 || field493 % 20 < 10)) {
                        this.field667[0].method421(13, this.field334, 29);
                    }
                    if (this.field320[1] != -1 && (this.field566 != 1 || field493 % 20 < 10)) {
                        this.field667[1].method421(11, this.field334, 53);
                    }
                    if (this.field320[2] != -1 && (this.field566 != 2 || field493 % 20 < 10)) {
                        this.field667[2].method421(11, this.field334, 82);
                    }
                    if (this.field320[3] != -1 && (this.field566 != 3 || field493 % 20 < 10)) {
                        this.field667[3].method421(12, this.field334, 115);
                    }
                    if (this.field320[4] != -1 && (this.field566 != 4 || field493 % 20 < 10)) {
                        this.field667[4].method421(13, this.field334, 153);
                    }
                    if (this.field320[5] != -1 && (this.field566 != 5 || field493 % 20 < 10)) {
                        this.field667[5].method421(11, this.field334, 180);
                    }
                    if (this.field320[6] != -1 && (this.field566 != 6 || field493 % 20 < 10)) {
                        this.field667[6].method421(13, this.field334, 208);
                    }
                }
                this.field229.method2(160, 516, (byte) 6, super.field888);
                this.field228.method1(this.field603);
                this.field290.method421(0, this.field334, 0);
                if (this.field446 == -1) {
                    if (this.field320[this.field295] != -1) {
                        if (this.field295 == 7) {
                            this.field300.method421(0, this.field334, 42);
                        }
                        if (this.field295 == 8) {
                            this.field301.method421(0, this.field334, 74);
                        }
                        if (this.field295 == 9) {
                            this.field301.method421(0, this.field334, 102);
                        }
                        if (this.field295 == 10) {
                            this.field302.method421(1, this.field334, 130);
                        }
                        if (this.field295 == 11) {
                            this.field304.method421(0, this.field334, 173);
                        }
                        if (this.field295 == 12) {
                            this.field304.method421(0, this.field334, 201);
                        }
                        if (this.field295 == 13) {
                            this.field303.method421(0, this.field334, 229);
                        }
                    }
                    if (this.field320[8] != -1 && (this.field566 != 8 || field493 % 20 < 10)) {
                        this.field667[7].method421(2, this.field334, 74);
                    }
                    if (this.field320[9] != -1 && (this.field566 != 9 || field493 % 20 < 10)) {
                        this.field667[8].method421(3, this.field334, 102);
                    }
                    if (this.field320[10] != -1 && (this.field566 != 10 || field493 % 20 < 10)) {
                        this.field667[9].method421(4, this.field334, 137);
                    }
                    if (this.field320[11] != -1 && (this.field566 != 11 || field493 % 20 < 10)) {
                        this.field667[10].method421(2, this.field334, 174);
                    }
                    if (this.field320[12] != -1 && (this.field566 != 12 || field493 % 20 < 10)) {
                        this.field667[11].method421(2, this.field334, 201);
                    }
                    if (this.field320[13] != -1 && (this.field566 != 13 || field493 % 20 < 10)) {
                        this.field667[12].method421(2, this.field334, 226);
                    }
                }
                this.field228.method2(466, 496, (byte) 6, super.field888);
                this.field338.method1(this.field603);
                class22.field843 = this.field426;
            }
            if (this.field588) {
                this.field588 = false;
                this.field227.method1(this.field603);
                this.field289.method421(0, this.field334, 0);
                this.field408.method381(9, "Public chat", true, 28, 16777215, 55);
                if (this.field585 == 0) {
                    this.field408.method381(9, "On", true, 41, 65280, 55);
                }
                if (this.field585 == 1) {
                    this.field408.method381(9, "Friends", true, 41, 16776960, 55);
                }
                if (this.field585 == 2) {
                    this.field408.method381(9, "Off", true, 41, 16711680, 55);
                }
                if (this.field585 == 3) {
                    this.field408.method381(9, "Hide", true, 41, 65535, 55);
                }
                this.field408.method381(9, "Private chat", true, 28, 16777215, 184);
                if (this.field364 == 0) {
                    this.field408.method381(9, "On", true, 41, 65280, 184);
                }
                if (this.field364 == 1) {
                    this.field408.method381(9, "Friends", true, 41, 16776960, 184);
                }
                if (this.field364 == 2) {
                    this.field408.method381(9, "Off", true, 41, 16711680, 184);
                }
                this.field408.method381(9, "Trade/compete", true, 28, 16777215, 324);
                if (this.field536 == 0) {
                    this.field408.method381(9, "On", true, 41, 65280, 324);
                }
                if (this.field536 == 1) {
                    this.field408.method381(9, "Friends", true, 41, 16776960, 324);
                }
                if (this.field536 == 2) {
                    this.field408.method381(9, "Off", true, 41, 16711680, 324);
                }
                this.field408.method381(9, "Report abuse", true, 33, 16777215, 458);
                this.field227.method2(453, 0, (byte) 6, super.field888);
                this.field338.method1(this.field603);
                class22.field843 = this.field426;
            }
            this.field322 = 0;
            if (arg0 >= 0) {
                this.field554.method519(107);
            }
        } else {
            if (this.field274 == 2) {
                this.method127(this.field322, (byte) 8, this.field259);
                if (this.field309 != -1) {
                    this.method127(this.field322, (byte) 8, this.field309);
                }
                this.field322 = 0;
                this.method87(1);
                super.field889.method1(this.field603);
                class22.field843 = this.field427;
                class26.method254(662);
                this.field308 = true;
                class29 var2 = class29.method311(this.field259);
                if (var2.field975 == 512 && var2.field1000 == 334 && var2.field1014 == 0) {
                    var2.field975 = 765;
                    var2.field1000 = 503;
                }
                this.method80(0, 0, true, 0, var2);
                if (this.field309 != -1) {
                    class29 var3 = class29.method311(this.field309);
                    if (var3.field975 == 512 && var3.field1000 == 334 && var3.field1014 == 0) {
                        var3.field975 = 765;
                        var3.field1000 = 503;
                    }
                    this.method80(0, 0, true, 0, var3);
                }
                if (!this.field589) {
                    this.method79((byte) -113);
                    this.method89(this.field323);
                } else {
                    this.method50((byte) 0);
                }
            }
            super.field889.method2(0, 0, (byte) 6, super.field888);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method100(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field554.method519(253);
        }
        if (this.field389 == 2) {
            this.method171((this.field220 - this.field247 << 7) + this.field223, 4, (this.field221 - this.field248 << 7) + this.field224, this.field222 * 2);
            if (this.field435 > -1 && field493 % 20 < 10) {
                this.field265[0].method400(this.field436 - 28, this.field334, this.field435 - 12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method101(int arg0, int arg1) {
        if (arg0 >= 0) {
            field273 = !field273;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method102(int arg0) {
        if (!this.field355 && !this.field569 && !this.field215) {
            ++field437;
            this.field239 += arg0;
            if (!this.field428) {
                this.method162(false, (byte) 0);
            } else {
                this.method99(-340);
            }
            this.field380 = 0;
        } else {
            this.method71(3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LTKPFKOXP;II)V")
    private final void method103(class59 arg0, int arg1, int arg2) {
        int var10000 = arg1 + arg2;
        int var5 = arg0.method540(8, true);
        if (var5 < this.field441) {
            for (int var6 = var5; var6 < this.field441; ++var6) {
                this.field562[this.field561++] = this.field442[var6];
            }
        }
        if (var5 > this.field441) {
            signlink.reporterror(this.field420 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field441 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field442[var7];
                class58 var9 = this.field440[var8];
                int var10 = arg0.method540(1, true);
                if (var10 == 0) {
                    this.field442[this.field441++] = var8;
                    var9.field29 = field493;
                } else {
                    int var11 = arg0.method540(2, true);
                    if (var11 == 0) {
                        this.field442[this.field441++] = var8;
                        var9.field29 = field493;
                        this.field444[this.field443++] = var8;
                    } else if (var11 == 1) {
                        this.field442[this.field441++] = var8;
                        var9.field29 = field493;
                        int var12 = arg0.method540(3, true);
                        var9.method9(var12, true, false);
                        int var13 = arg0.method540(1, true);
                        if (var13 == 1) {
                            this.field444[this.field443++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field442[this.field441++] = var8;
                        var9.field29 = field493;
                        int var14 = arg0.method540(3, true);
                        var9.method9(var14, true, true);
                        int var15 = arg0.method540(3, true);
                        var9.method9(var15, true, true);
                        int var16 = arg0.method540(1, true);
                        if (var16 == 1) {
                            this.field444[this.field443++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field562[this.field561++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method104(int arg0, int arg1) {
        if (arg0 > 0) {
            if (!field544) {
                for (int var3 = 0; var3 < this.field570.length; ++var3) {
                    int var4 = this.field570[var3];
                    if (class22.field851[var4] >= arg1) {
                        class43 var5 = class22.field845[var4];
                        int var6 = var5.field1251 * var5.field1250 - 1;
                        int var7 = this.field322 * var5.field1250 * 2;
                        byte[] var8 = var5.field1248;
                        byte[] var9 = this.field643;
                        for (int var10 = 0; var10 <= var6; ++var10) {
                            var9[var10] = var8[var10 - var7 & var6];
                        }
                        var5.field1248 = var9;
                        this.field643 = var8;
                        class22.method233(-30, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field644.method421(arg4, this.field334, arg5);
        if (arg2 >= this.field622 && arg2 <= this.field622) {
            this.field645.method421(arg0 + arg4 - 16, this.field334, arg5);
            class26.method256(arg5, 16, arg4 + 16, this.field664, arg0 - 32, (byte) 127);
            int var7 = (arg0 - 32) * arg0 / arg3;
            if (var7 < 8) {
                var7 = 8;
            }
            int var8 = (arg0 - 32 - var7) * arg1 / (arg3 - arg0);
            class26.method256(arg5, 16, arg4 + 16 + var8, this.field288, var7, (byte) 127);
            class26.method261(var7, arg4 + 16 + var8, arg5, 1, this.field238);
            class26.method261(var7, arg4 + 16 + var8, arg5 + 1, 1, this.field238);
            class26.method259(16, arg5, arg4 + 16 + var8, this.field238, (byte) 3);
            class26.method259(16, arg5, arg4 + 17 + var8, this.field238, (byte) 3);
            class26.method261(var7, arg4 + 16 + var8, arg5 + 15, 1, this.field233);
            class26.method261(var7 - 1, arg4 + 17 + var8, arg5 + 14, 1, this.field233);
            class26.method259(16, arg5, arg4 + 15 + var8 + var7, this.field233, (byte) 3);
            class26.method259(15, arg5 + 1, arg4 + 14 + var8 + var7, this.field233, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    private final void method106(byte arg0) {
        if (arg0 != 1) {
            this.field240 = this.field292.method529();
        }
        for (class4 var2 = (class4) this.field402.method509(); var2 != null; var2 = (class4) this.field402.method511(0)) {
            if (var2.field83 == -1) {
                var2.field87 = 0;
                this.method63(var2, false);
            } else {
                var2.method588();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method107(boolean arg0) {
        if (!arg0) {
            this.field573 = 4;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method250((byte) 8);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field403 != -1 && this.field472 == this.field403) {
                        if (var2 == 8 && this.field296.length() > 0) {
                            this.field296 = this.field296.substring(0, this.field296.length() - 1);
                        }
                        break;
                    }
                    if (this.field615) {
                        if (var2 >= 32 && var2 <= 122 && this.field609.length() < 80) {
                            this.field609 = this.field609 + (char) var2;
                            this.field305 = true;
                        }
                        if (var2 == 8 && this.field609.length() > 0) {
                            this.field609 = this.field609.substring(0, this.field609.length() - 1);
                            this.field305 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field615 = false;
                            this.field305 = true;
                            if (this.field324 == 1) {
                                long var3 = class12.method182(this.field609);
                                this.method139(var3, (byte) 4);
                            }
                            if (this.field324 == 2 && this.field418 > 0) {
                                long var5 = class12.method182(this.field609);
                                this.method108(false, var5);
                            }
                            if (this.field324 == 3 && this.field609.length() > 0) {
                                this.field554.method518(28, true);
                                this.field554.method519(0);
                                int var7 = this.field554.field1589;
                                this.field554.method525(this.field275, this.field237);
                                class68.method590(this.field554, this.field475, this.field609);
                                this.field554.method528(this.field554.field1589 - var7, 0);
                                this.field609 = class68.method591(this.field609, false);
                                this.field609 = class28.method281(this.field609, false);
                                this.method111(this.field609, 6, class12.method186(class12.method183(39082, this.field275), 7139), this.field382);
                                if (this.field364 == 2) {
                                    this.field364 = 1;
                                    this.field588 = true;
                                    this.field554.method518(14, true);
                                    this.field554.method519(this.field585);
                                    this.field554.method519(this.field364);
                                    this.field554.method519(this.field536);
                                }
                            }
                            if (this.field324 == 4 && this.field522 < 100) {
                                long var8 = class12.method182(this.field609);
                                this.method42(var8, 5);
                            }
                            if (this.field324 == 5 && this.field522 > 0) {
                                long var10 = class12.method182(this.field609);
                                this.method66(var10, (byte) 3);
                            }
                        }
                    } else if (this.field547 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field633.length() < 10) {
                            this.field633 = this.field633 + (char) var2;
                            this.field305 = true;
                        }
                        if (var2 == 8 && this.field633.length() > 0) {
                            this.field633 = this.field633.substring(0, this.field633.length() - 1);
                            this.field305 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field633.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field633);
                                } catch (Exception var22) {
                                }
                                this.field554.method518(234, true);
                                this.field554.method523(var12);
                            }
                            this.field547 = 0;
                            this.field305 = true;
                        }
                    } else if (this.field547 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field633.length() < 12) {
                            this.field633 = this.field633 + (char) var2;
                            this.field305 = true;
                        }
                        if (var2 == 8 && this.field633.length() > 0) {
                            this.field633 = this.field633.substring(0, this.field633.length() - 1);
                            this.field305 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field633.length() > 0) {
                                this.field554.method518(224, true);
                                this.field554.method525(class12.method182(this.field633), this.field237);
                            }
                            this.field547 = 0;
                            this.field305 = true;
                        }
                    } else if (this.field547 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field633.length() < 40) {
                            this.field633 = this.field633 + (char) var2;
                            this.field305 = true;
                        }
                        if (var2 == 8 && this.field633.length() > 0) {
                            this.field633 = this.field633.substring(0, this.field633.length() - 1);
                            this.field305 = true;
                        }
                    } else if (this.field468 == -1 && this.field259 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field506.length() < 80) {
                            this.field506 = this.field506 + (char) var2;
                            this.field305 = true;
                        }
                        if (var2 == 8 && this.field506.length() > 0) {
                            this.field506 = this.field506.substring(0, this.field506.length() - 1);
                            this.field305 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field506.length() > 0) {
                            if (this.field620 == 2) {
                                if (this.field506.equals("::clientdrop")) {
                                    this.method58(true);
                                }
                                if (this.field506.equals("::lag")) {
                                    this.method84(62);
                                }
                                if (this.field506.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field328.method221(14917, 2); ++var13) {
                                        this.field328.method213((byte) 1, var13, true, 2);
                                    }
                                }
                                if (this.field506.equals("::fpson")) {
                                    field494 = true;
                                }
                                if (this.field506.equals("::fpsoff")) {
                                    field494 = false;
                                }
                                if (this.field506.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field284[var14].field1630[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field506.startsWith("::")) {
                                this.field554.method518(235, true);
                                this.field554.method519(this.field506.length() - 1);
                                this.field554.method526(this.field506.substring(2));
                            } else {
                                String var17 = this.field506.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field506 = this.field506.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field506 = this.field506.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field506 = this.field506.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field506 = this.field506.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field506 = this.field506.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field506 = this.field506.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field506 = this.field506.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field506 = this.field506.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field506 = this.field506.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field506 = this.field506.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field506 = this.field506.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field506 = this.field506.substring(6);
                                }
                                String var19 = this.field506.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field506 = this.field506.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field506 = this.field506.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field506 = this.field506.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field506 = this.field506.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field506 = this.field506.substring(6);
                                }
                                this.field554.method518(175, true);
                                this.field554.method519(0);
                                int var21 = this.field554.field1589;
                                this.field554.method519(var18);
                                this.field429.field1589 = 0;
                                class68.method590(this.field429, this.field475, this.field506);
                                this.field554.method527(0, this.field429.field1588, this.field429.field1589, this.field662);
                                this.field554.method545((byte) -53, var20);
                                this.field554.method528(this.field554.field1589 - var21, 0);
                                this.field506 = class68.method591(this.field506, false);
                                this.field506 = class28.method281(this.field506, false);
                                field219.field43 = this.field506;
                                field219.field46 = var18;
                                field219.field42 = var20;
                                field219.field45 = 150;
                                if (this.field620 == 2) {
                                    this.method111(field219.field43, 2, "@cr2@" + field219.field1573, this.field382);
                                } else if (this.field620 == 1) {
                                    this.method111(field219.field43, 2, "@cr1@" + field219.field1573, this.field382);
                                } else {
                                    this.method111(field219.field43, 2, field219.field1573, this.field382);
                                }
                                if (this.field585 == 2) {
                                    this.field585 = 3;
                                    this.field588 = true;
                                    this.field554.method518(14, true);
                                    this.field554.method519(this.field585);
                                    this.field554.method519(this.field364);
                                    this.field554.method519(this.field536);
                                }
                            }
                            this.field506 = "";
                            this.field305 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field296.length() < 12) {
                this.field296 = this.field296 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method108(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field418; ++var4) {
                if (this.field568[var4] == arg1) {
                    --this.field418;
                    this.field375 = true;
                    for (int var5 = var4; var5 < this.field418; ++var5) {
                        this.field548[var5] = this.field548[var5 + 1];
                        this.field422[var5] = this.field422[var5 + 1];
                        this.field568[var5] = this.field568[var5 + 1];
                    }
                    this.field554.method518(142, true);
                    this.field554.method525(arg1, this.field237);
                    break;
                }
            }
            if (arg0) {
                this.field554.method519(181);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method109(int arg0) {
        short var2 = 256;
        if (this.field470 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field470 > 768) {
                    this.field668[var3] = this.method134(true, this.field669[var3], this.field670[var3], 1024 - this.field470);
                } else if (this.field470 > 256) {
                    this.field668[var3] = this.field670[var3];
                } else {
                    this.field668[var3] = this.method134(true, this.field670[var3], this.field669[var3], 256 - this.field470);
                }
            }
        } else if (this.field471 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field471 > 768) {
                    this.field668[var4] = this.method134(true, this.field669[var4], this.field671[var4], 1024 - this.field471);
                } else if (this.field471 > 256) {
                    this.field668[var4] = this.field671[var4];
                } else {
                    this.field668[var4] = this.method134(true, this.field671[var4], this.field669[var4], 256 - this.field471);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field668[var5] = this.field669[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field676.field4[var6] = this.field604.field1204[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field560[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field592[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field668[var26];
                    int var30 = this.field676.field4[var8];
                    this.field676.field4[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 == 0) {
            this.field676.method2(0, 0, (byte) 6, super.field888);
            for (int var10 = 0; var10 < 33920; ++var10) {
                this.field677.field4[var10] = this.field605.field1204[var10];
            }
            int var11 = 0;
            int var12 = 1176;
            for (int var13 = 1; var13 < var2 - 1; ++var13) {
                int var14 = (var2 - var13) * this.field560[var13] / var2;
                int var15 = 103 - var14;
                int var16 = var12 + var14;
                for (int var17 = 0; var17 < var15; ++var17) {
                    int var18 = this.field592[var11++];
                    if (var18 != 0) {
                        int var20 = 256 - var18;
                        int var21 = this.field668[var18];
                        int var22 = this.field677.field4[var16];
                        this.field677.field4[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                    } else {
                        ++var16;
                    }
                }
                var11 += 128 - var15;
                var12 = 128 - var15 - var14 + var16;
            }
            this.field677.method2(0, 637, (byte) 6, super.field888);
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field891 != null) {
                    return new URL("http://127.0.0.1:" + (field542 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method110(String arg0, int arg1) {
        if (arg1 != 6938) {
            this.field554.method519(177);
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field418; ++var3) {
                if (arg0.equalsIgnoreCase(this.field548[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field219.field1573);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public final void method111(String arg0, int arg1, String arg2, int arg3) {
        if (arg1 == 0 && this.field672 != -1) {
            this.field524 = arg0;
            super.field902 = 0;
        }
        if (this.field468 == -1) {
            this.field305 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field366[var5] = this.field366[var5 - 1];
            this.field367[var5] = this.field367[var5 - 1];
            this.field368[var5] = this.field368[var5 - 1];
        }
        this.field366[0] = arg1;
        this.field367[0] = arg2;
        if (arg3 != 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        this.field368[0] = arg0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method112(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        int var4 = 76 / arg1;
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field541 = Integer.parseInt(this.getParameter("nodeid"));
        field542 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method123(6);
        } else {
            method116(field634);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field543 = false;
        } else {
            field543 = true;
        }
        this.method247(field496, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
    public final boolean method113(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field200[arg1];
            if (arg0 != -42569) {
                this.field662 = -252;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 627;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)I")
    public final int method114(boolean arg0) {
        if (arg0) {
            this.field334 = 468;
        }
        int var2 = 3;
        if (this.field196 < 310) {
            int var3 = this.field193 >> 7;
            int var4 = this.field195 >> 7;
            int var5 = field219.field30 >> 7;
            int var6 = field219.field31 >> 7;
            if ((this.field540[this.field417][var3][var4] & 4) != 0) {
                var2 = this.field417;
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
                    if ((this.field540[this.field417][var3][var4] & 4) != 0) {
                        var2 = this.field417;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field540[this.field417][var3][var4] & 4) != 0) {
                            var2 = this.field417;
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
                    if ((this.field540[this.field417][var3][var4] & 4) != 0) {
                        var2 = this.field417;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field540[this.field417][var3][var4] & 4) != 0) {
                            var2 = this.field417;
                        }
                    }
                }
            }
        }
        if ((this.field540[this.field417][field219.field30 >> 7][field219.field31 >> 7] & 4) != 0) {
            var2 = this.field417;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)I")
    public final int method115(boolean arg0) {
        if (arg0) {
            this.field554.method519(193);
        }
        int var2 = this.method173(this.field193, this.field417, this.field195, this.field327);
        return var2 - this.field194 < 800 && (this.field540[this.field417][this.field193 >> 7][this.field195 >> 7] & 4) != 0 ? this.field417 : 3;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public static final void method116(byte arg0) {
        class30.field1036 = false;
        class22.field832 = false;
        if (field634 == arg0) {
            field544 = false;
            class7.field122 = false;
            class55.field1486 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method117(int arg0) {
        while (arg0 >= 0) {
            this.field334 = 111;
        }
        if (super.field902 == 1) {
            if (super.field903 >= 539 && super.field903 <= 573 && super.field904 >= 169 && super.field904 < 205 && this.field320[0] != -1) {
                this.field375 = true;
                this.field295 = 0;
                this.field281 = true;
            }
            if (super.field903 >= 569 && super.field903 <= 599 && super.field904 >= 168 && super.field904 < 205 && this.field320[1] != -1) {
                this.field375 = true;
                this.field295 = 1;
                this.field281 = true;
            }
            if (super.field903 >= 597 && super.field903 <= 627 && super.field904 >= 168 && super.field904 < 205 && this.field320[2] != -1) {
                this.field375 = true;
                this.field295 = 2;
                this.field281 = true;
            }
            if (super.field903 >= 625 && super.field903 <= 669 && super.field904 >= 168 && super.field904 < 203 && this.field320[3] != -1) {
                this.field375 = true;
                this.field295 = 3;
                this.field281 = true;
            }
            if (super.field903 >= 666 && super.field903 <= 696 && super.field904 >= 168 && super.field904 < 205 && this.field320[4] != -1) {
                this.field375 = true;
                this.field295 = 4;
                this.field281 = true;
            }
            if (super.field903 >= 694 && super.field903 <= 724 && super.field904 >= 168 && super.field904 < 205 && this.field320[5] != -1) {
                this.field375 = true;
                this.field295 = 5;
                this.field281 = true;
            }
            if (super.field903 >= 722 && super.field903 <= 756 && super.field904 >= 169 && super.field904 < 205 && this.field320[6] != -1) {
                this.field375 = true;
                this.field295 = 6;
                this.field281 = true;
            }
            if (super.field903 >= 540 && super.field903 <= 574 && super.field904 >= 466 && super.field904 < 502 && this.field320[7] != -1) {
                this.field375 = true;
                this.field295 = 7;
                this.field281 = true;
            }
            if (super.field903 >= 572 && super.field903 <= 602 && super.field904 >= 466 && super.field904 < 503 && this.field320[8] != -1) {
                this.field375 = true;
                this.field295 = 8;
                this.field281 = true;
            }
            if (super.field903 >= 599 && super.field903 <= 629 && super.field904 >= 466 && super.field904 < 503 && this.field320[9] != -1) {
                this.field375 = true;
                this.field295 = 9;
                this.field281 = true;
            }
            if (super.field903 >= 627 && super.field903 <= 671 && super.field904 >= 467 && super.field904 < 502 && this.field320[10] != -1) {
                this.field375 = true;
                this.field295 = 10;
                this.field281 = true;
            }
            if (super.field903 >= 669 && super.field903 <= 699 && super.field904 >= 466 && super.field904 < 503 && this.field320[11] != -1) {
                this.field375 = true;
                this.field295 = 11;
                this.field281 = true;
            }
            if (super.field903 >= 696 && super.field903 <= 726 && super.field904 >= 466 && super.field904 < 503 && this.field320[12] != -1) {
                this.field375 = true;
                this.field295 = 12;
                this.field281 = true;
            }
            if (super.field903 >= 724 && super.field903 <= 758 && super.field904 >= 466 && super.field904 < 502 && this.field320[13] != -1) {
                this.field375 = true;
                this.field295 = 13;
                this.field281 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method118(int arg0, String arg1, int arg2) {
        this.field455 = arg0;
        this.field484 = arg1;
        this.method86(true);
        if (this.field344 == null) {
            super.method118(arg0, arg1, 0);
        } else {
            this.field675.method1(this.field603);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field409.method380("RuneScape is loading - please wait...", (byte) 0, var4 / 2, var5 / 2 - 26 - var6, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            this.field239 += arg2;
            class26.method257(var4 / 2 - 152, var7, 34, 304, 9179409, 149);
            class26.method257(var4 / 2 - 151, var7 + 1, 32, 302, 0, 149);
            class26.method256(var4 / 2 - 150, arg0 * 3, var7 + 2, 9179409, 30, (byte) 127);
            class26.method256(arg0 * 3 + (var4 / 2 - 150), 300 - arg0 * 3, var7 + 2, 0, 30, (byte) 127);
            this.field409.method380(arg1, (byte) 0, var4 / 2, var5 / 2 + 5 - var6, 16777215);
            this.field675.method2(171, 202, (byte) 6, super.field888);
            if (this.field308) {
                this.field308 = false;
                if (!this.field495) {
                    this.field676.method2(0, 0, (byte) 6, super.field888);
                    this.field677.method2(0, 637, (byte) 6, super.field888);
                }
                this.field673.method2(0, 128, (byte) 6, super.field888);
                this.field674.method2(371, 202, (byte) 6, super.field888);
                this.field678.method2(265, 0, (byte) 6, super.field888);
                this.field679.method2(265, 562, (byte) 6, super.field888);
                this.field680.method2(171, 128, (byte) 6, super.field888);
                this.field681.method2(171, 562, (byte) 6, super.field888);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILLOVQYTIZ;I)V")
    public final void method119(int arg0, int arg1, class38 arg2, int arg3) {
        int var5 = arg0 * arg0 + arg1 * arg1;
        while (arg3 >= 0) {
            this.field554.method519(156);
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field665 + this.field377 & 2047;
            int var7 = class45.field1339[var6];
            int var8 = class45.field1340[var6];
            int var9 = var7 * 256 / (this.field488 + 256);
            int var10 = var8 * 256 / (this.field488 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field517.method405(20, var13, 15, 15, 20, 83 - var16 - 20, var15 + 94 + 4 - 10, (byte) -60, 256);
        } else {
            this.method53(true, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method120(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)Ljava/lang/String;")
    public final String method121(int arg0) {
        int var2 = 78 / arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field891 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method122(byte arg0) {
        this.method161(0);
        if (this.field257 == 1) {
            this.field539[this.field256 / 100].method400(this.field255 - 8 - 4, this.field334, this.field254 - 8 - 4);
        }
        if (this.field257 == 2) {
            this.field539[this.field256 / 100 + 4].method400(this.field255 - 8 - 4, this.field334, this.field254 - 8 - 4);
        }
        if (this.field640 != -1) {
            this.method127(this.field322, (byte) 8, this.field640);
            this.method80(0, 0, true, 0, class29.method311(this.field640));
        }
        if (this.field403 != -1) {
            this.method127(this.field322, (byte) 8, this.field403);
            this.method80(0, 0, true, 0, class29.method311(this.field403));
        }
        this.method128((byte) 23);
        if (arg0 != -126) {
            this.field240 = -1;
        }
        if (!this.field589) {
            this.method79((byte) -113);
            this.method89(this.field323);
        } else if (this.field260 == 0) {
            this.method50((byte) 0);
        }
        if (this.field415 == 1) {
            this.field363.method400(296, this.field334, 472);
        }
        if (field494) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field884 < 30 && field544) {
                var4 = 16711680;
            }
            if (super.field884 < 20 && !field544) {
                var4 = 16711680;
            }
            this.field408.method379(-570, var4, var3, "Fps:" + super.field884, var2);
            int var14 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field544) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field544) {
                int var9 = 16711680;
            }
            this.field408.method379(-570, 16776960, var14, "Mem:" + var6 + "k", var2);
            var14 += 15;
        }
        if (this.field370 != 0) {
            int var10 = this.field370 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field408.method384("System update in: " + var11 + ":0" + var12, 329, 4, this.field285, 16776960);
            } else {
                this.field408.method384("System update in: " + var11 + ":" + var12, 329, 4, this.field285, 16776960);
            }
            ++field623;
            if (field623 > 1696) {
                field623 = 0;
                this.field554.method518(11, true);
                this.field554.method519(0);
                int var13 = this.field554.field1589;
                this.field554.method520((int) (Math.random() * 65536.0D));
                this.field554.method520((int) (Math.random() * 65536.0D));
                this.field554.method520((int) (Math.random() * 65536.0D));
                this.field554.method520(15088);
                this.field554.method520((int) (Math.random() * 65536.0D));
                this.field554.method520((int) (Math.random() * 65536.0D));
                this.field554.method519(226);
                this.field554.method519((int) (Math.random() * 256.0D));
                this.field554.method520(61697);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field554.method520(35704);
                }
                this.field554.method528(this.field554.field1589 - var13, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public static final void method123(int arg0) {
        class30.field1036 = true;
        if (arg0 == 6) {
            class22.field832 = true;
            field544 = true;
            class7.field122 = true;
            class55.field1486 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method124() {
        this.method118(20, "Starting up", 0);
        if (signlink.sunjava) {
            super.field882 = 5;
        }
        if (field485) {
            this.field355 = true;
        } else {
            field485 = true;
            boolean var1 = false;
            String var2 = this.method121(759);
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
                this.field215 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field218[var3] = new class72(signlink.cache_dat, signlink.cache_idx[var3], false, var3 + 1, 500000);
                    }
                }
                try {
                    this.method149((byte) 9);
                    this.field344 = this.method41((byte) -54, 1, "title", 25, "title screen", this.field406[1]);
                    this.field407 = new class36(934, this.field344, "p11_full", false);
                    this.field408 = new class36(934, this.field344, "p12_full", false);
                    this.field409 = new class36(934, this.field344, "b12_full", false);
                    this.field410 = new class36(934, this.field344, "q8_full", true);
                    this.method68(field587);
                    this.method81((byte) 5);
                    class32 var4 = this.method41((byte) -54, 2, "config", 30, "config", this.field406[2]);
                    class32 var5 = this.method41((byte) -54, 3, "interface", 35, "interface", this.field406[3]);
                    class32 var6 = this.method41((byte) -54, 4, "media", 40, "2d graphics", this.field406[4]);
                    class32 var7 = this.method41((byte) -54, 6, "textures", 45, "textures", this.field406[6]);
                    class32 var8 = this.method41((byte) -54, 7, "wordenc", 50, "chat system", this.field406[7]);
                    class32 var9 = this.method41((byte) -54, 8, "sounds", 55, "sound effects", this.field406[8]);
                    this.field540 = new byte[4][104][104];
                    this.field395 = new int[4][105][105];
                    this.field434 = new class30(104, this.field395, 4, 104, (byte) -47);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field284[var10] = new class62(104, -39368, 104);
                    }
                    this.field684 = new class38(512, 512);
                    class32 var11 = this.method41((byte) -54, 5, "versionlist", 60, "update list", this.field406[5]);
                    this.method118(60, "Connecting to update server", 0);
                    this.field328 = new class20();
                    this.field328.method206(var11, this);
                    class47.method463(this.field328.method209(5));
                    class45.method430(this.field328.method221(14917, 0), this.field328);
                    if (!field544) {
                        this.field528 = 0;
                        this.field529 = true;
                        this.field328.method208(2, this.field528);
                        while (this.field328.method207() > 0) {
                            this.method145(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field328.field813 > 3) {
                                this.method159("ondemand");
                                return;
                            }
                        }
                    }
                    this.method118(65, "Requesting animations", 0);
                    int var12 = this.field328.method221(14917, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field328.method208(1, var13);
                    }
                    while (this.field328.method207() > 0) {
                        int var14 = var12 - this.field328.method207();
                        if (var14 > 0) {
                            this.method118(65, "Loading animations - " + var14 * 100 / var12 + "%", 0);
                        }
                        this.method145(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field328.field813 > 3) {
                            this.method159("ondemand");
                            return;
                        }
                    }
                    this.method118(70, "Requesting models", 0);
                    int var15 = this.field328.method221(14917, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field328.method212(var16, 30468);
                        if ((var17 & 1) != 0) {
                            this.field328.method208(0, var16);
                        }
                    }
                    int var18 = this.field328.method207();
                    while (this.field328.method207() > 0) {
                        int var19 = var18 - this.field328.method207();
                        if (var19 > 0) {
                            this.method118(70, "Loading models - " + var19 * 100 / var18 + "%", 0);
                        }
                        this.method145(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field218[0] != null) {
                        this.method118(75, "Requesting maps", 0);
                        this.field328.method208(3, this.field328.method217(0, false, 48, 47));
                        this.field328.method208(3, this.field328.method217(1, false, 48, 47));
                        this.field328.method208(3, this.field328.method217(0, false, 48, 48));
                        this.field328.method208(3, this.field328.method217(1, false, 48, 48));
                        this.field328.method208(3, this.field328.method217(0, false, 48, 49));
                        this.field328.method208(3, this.field328.method217(1, false, 48, 49));
                        this.field328.method208(3, this.field328.method217(0, false, 47, 47));
                        this.field328.method208(3, this.field328.method217(1, false, 47, 47));
                        this.field328.method208(3, this.field328.method217(0, false, 47, 48));
                        this.field328.method208(3, this.field328.method217(1, false, 47, 48));
                        this.field328.method208(3, this.field328.method217(0, false, 148, 48));
                        this.field328.method208(3, this.field328.method217(1, false, 148, 48));
                        int var20 = this.field328.method207();
                        while (this.field328.method207() > 0) {
                            int var21 = var20 - this.field328.method207();
                            if (var21 > 0) {
                                this.method118(75, "Loading maps - " + var21 * 100 / var20 + "%", 0);
                            }
                            this.method145(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field328.method221(14917, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field328.method212(var23, 30468);
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
                            this.field328.method213(var25, var23, true, 0);
                        }
                    }
                    this.field328.method216(6, field543);
                    if (!field544) {
                        int var26 = this.field328.method221(14917, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field328.method222(var27, false)) {
                                this.field328.method213((byte) 1, var27, true, 2);
                            }
                        }
                    }
                    this.method118(80, "Unpacking media", 0);
                    this.field465 = new class43(var6, "invback", 0);
                    this.field467 = new class43(var6, "chatback", 0);
                    this.field466 = new class43(var6, "mapback", 0);
                    this.field289 = new class43(var6, "backbase1", 0);
                    this.field290 = new class43(var6, "backbase2", 0);
                    this.field291 = new class43(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field667[var28] = new class43(var6, "sideicons", var28);
                    }
                    this.field315 = new class38(var6, "compass", 0);
                    this.field517 = new class38(var6, "mapedge", 0);
                    this.field517.method397(0);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field530[var29] = new class43(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 70; ++var30) {
                        this.field596[var30] = new class38(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field608[var31] = new class38(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field204[var32] = new class38(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field331[var33] = new class38(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field265[var34] = new class38(var6, "headicons_hint", var34);
                    }
                    this.field363 = new class38(var6, "overlay_multiway", 0);
                    this.field550 = new class38(var6, "mapmarker", 0);
                    this.field551 = new class38(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field539[var35] = new class38(var6, "cross", var35);
                    }
                    this.field531 = new class38(var6, "mapdots", 0);
                    this.field532 = new class38(var6, "mapdots", 1);
                    this.field533 = new class38(var6, "mapdots", 2);
                    this.field534 = new class38(var6, "mapdots", 3);
                    this.field535 = new class38(var6, "mapdots", 4);
                    this.field644 = new class43(var6, "scrollbar", 0);
                    this.field645 = new class43(var6, "scrollbar", 1);
                    this.field276 = new class43(var6, "redstone1", 0);
                    this.field277 = new class43(var6, "redstone2", 0);
                    this.field278 = new class43(var6, "redstone3", 0);
                    this.field279 = new class43(var6, "redstone1", 0);
                    this.field279.method418(315);
                    this.field280 = new class43(var6, "redstone2", 0);
                    this.field280.method418(315);
                    this.field300 = new class43(var6, "redstone1", 0);
                    this.field300.method419(68);
                    this.field301 = new class43(var6, "redstone2", 0);
                    this.field301.method419(68);
                    this.field302 = new class43(var6, "redstone3", 0);
                    this.field302.method419(68);
                    this.field303 = new class43(var6, "redstone1", 0);
                    this.field303.method418(315);
                    this.field303.method419(68);
                    this.field304 = new class43(var6, "redstone2", 0);
                    this.field304.method418(315);
                    this.field304.method419(68);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field411[var36] = new class43(var6, "mod_icons", var36);
                    }
                    class38 var37 = new class38(var6, "backleft1", 0);
                    this.field205 = new class1(var37.field1206, -826, this.method85(field273), var37.field1205);
                    var37.method398(0, 488, 0);
                    class38 var38 = new class38(var6, "backleft2", 0);
                    this.field206 = new class1(var38.field1206, -826, this.method85(field273), var38.field1205);
                    var38.method398(0, 488, 0);
                    class38 var39 = new class38(var6, "backright1", 0);
                    this.field207 = new class1(var39.field1206, -826, this.method85(field273), var39.field1205);
                    var39.method398(0, 488, 0);
                    class38 var40 = new class38(var6, "backright2", 0);
                    this.field208 = new class1(var40.field1206, -826, this.method85(field273), var40.field1205);
                    var40.method398(0, 488, 0);
                    class38 var41 = new class38(var6, "backtop1", 0);
                    this.field209 = new class1(var41.field1206, -826, this.method85(field273), var41.field1205);
                    var41.method398(0, 488, 0);
                    class38 var42 = new class38(var6, "backvmid1", 0);
                    this.field210 = new class1(var42.field1206, -826, this.method85(field273), var42.field1205);
                    var42.method398(0, 488, 0);
                    class38 var43 = new class38(var6, "backvmid2", 0);
                    this.field211 = new class1(var43.field1206, -826, this.method85(field273), var43.field1205);
                    var43.method398(0, 488, 0);
                    class38 var44 = new class38(var6, "backvmid3", 0);
                    this.field212 = new class1(var44.field1206, -826, this.method85(field273), var44.field1205);
                    var44.method398(0, 488, 0);
                    class38 var45 = new class38(var6, "backhmid2", 0);
                    this.field213 = new class1(var45.field1206, -826, this.method85(field273), var45.field1205);
                    var45.method398(0, 488, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field596[var50] != null) {
                            this.field596[var50].method396(var48 + var49, var47 + var49, var46 + var49, 0);
                        }
                        if (this.field530[var50] != null) {
                            this.field530[var50].method420(var48 + var49, var47 + var49, var46 + var49, 0);
                        }
                    }
                    this.method118(83, "Unpacking textures", 0);
                    class22.method231(-14099, var7);
                    class22.method235(694, 0.8D);
                    class22.method230(20, field619);
                    this.method118(86, "Unpacking config", 0);
                    class34.method374((byte) -3, var4);
                    class55.method497(var4);
                    class17.method197((byte) -3, var4);
                    class54.method493(var4);
                    class69.method592(var4);
                    class44.method423((byte) -3, var4);
                    class24.method243((byte) -3, var4);
                    class51.method474((byte) -3, var4);
                    class60.method568((byte) -3, var4);
                    class54.field1435 = field543;
                    if (!field544) {
                        this.method118(90, "Unpacking sounds", 0);
                        byte[] var51 = var9.method372("sounds.dat", (byte[]) null);
                        class59 var52 = new class59(859, var51);
                        class53.method476((byte) -3, var52);
                    }
                    this.method118(95, "Unpacking interfaces", 0);
                    class36[] var53 = new class36[] { this.field407, this.field408, this.field409, this.field410 };
                    class29.method315(467, var5, var53, var6);
                    this.method118(100, "Preparing game engine", 0);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field466.field1248[this.field466.field1250 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field365[var54] = var55;
                        this.field456[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field466.field1248[this.field466.field1250 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field399[var58 - 5] = var59 - 25;
                        this.field567[var58 - 5] = var60 - var59;
                    }
                    class22.method228(765, (byte) 2, 503);
                    this.field427 = class22.field843;
                    class22.method228(479, (byte) 2, 96);
                    this.field424 = class22.field843;
                    class22.method228(190, (byte) 2, 261);
                    this.field425 = class22.field843;
                    class22.method228(512, (byte) 2, 334);
                    this.field426 = class22.field843;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class22.field841[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class30.method356(var62, 800, 512, 334, 500, 736);
                    class28.method271(var8);
                    this.field482 = new class49(this, 45345);
                    this.method154(this.field482, 10);
                    class6.field100 = this;
                    class55.field1512 = this;
                    class69.field1724 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field484 + " " + this.field455);
                    this.field569 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method125(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            int var3 = arg2 - arg1;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIB)V")
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = this.field434.method346(arg3, arg2, arg0);
        if (var7 != 0) {
            int var8 = this.field434.method350(arg3, arg2, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field684.field1204;
            int var13 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class55 var15 = class55.method499(var14);
            if (var15.field1496 != -1) {
                class43 var16 = this.field530[var15.field1496];
                if (var16 != null) {
                    int var17 = (var15.field1469 * 4 - var16.field1250) / 2;
                    int var18 = (var15.field1515 * 4 - var16.field1251) / 2;
                    var16.method421((104 - arg0 - var15.field1515) * 4 + 48 + var18, this.field334, arg2 * 4 + 48 + var17);
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
        int var19 = this.field434.method348(arg3, arg2, arg0);
        if (arg5 != 119) {
            this.field400 = this.field597.method201();
        }
        if (var19 != 0) {
            int var20 = this.field434.method350(arg3, arg2, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class55 var24 = class55.method499(var23);
            if (var24.field1496 != -1) {
                class43 var25 = this.field530[var24.field1496];
                if (var25 != null) {
                    int var26 = (var24.field1469 * 4 - var25.field1250) / 2;
                    int var27 = (var24.field1515 * 4 - var25.field1251) / 2;
                    var25.method421((104 - arg0 - var24.field1515) * 4 + 48 + var27, this.field334, arg2 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field684.field1204;
                int var30 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
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
        int var31 = this.field434.method349(arg3, arg2, arg0);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class55 var33 = class55.method499(var32);
            if (var33.field1496 != -1) {
                class43 var34 = this.field530[var33.field1496];
                if (var34 != null) {
                    int var35 = (var33.field1469 * 4 - var34.field1250) / 2;
                    int var36 = (var33.field1515 * 4 - var34.field1251) / 2;
                    var34.method421((104 - arg0 - var33.field1515) * 4 + 48 + var36, this.field334, arg2 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
    public final boolean method127(int arg0, byte arg1, int arg2) {
        boolean var4 = false;
        if (arg1 == 8) {
            boolean var5 = false;
        } else {
            this.field590 = this.field597.method201();
        }
        class29 var6 = class29.method311(arg2);
        for (int var7 = 0; var7 < var6.field994.length && var6.field994[var7] != -1; ++var7) {
            class29 var8 = class29.method311(var6.field994[var7]);
            if (var8.field1014 == 0) {
                var4 |= this.method127(arg0, (byte) 8, var8.field983);
            }
            if (var8.field1014 == 6 && (var8.field963 != -1 || var8.field964 != -1)) {
                boolean var9 = this.method150(0, var8);
                int var10;
                if (var9) {
                    var10 = var8.field964;
                } else {
                    var10 = var8.field963;
                }
                if (var10 != -1) {
                    class34 var11 = class34.field1140[var10];
                    var8.field1009 += arg0;
                    while (var8.field1009 > var11.method375((byte) -37, var8.field980)) {
                        var8.field1009 -= var11.method375((byte) -37, var8.field980) + 1;
                        ++var8.field980;
                        if (var8.field980 >= var11.field1141) {
                            var8.field980 -= var11.field1145;
                            if (var8.field980 < 0 || var8.field980 >= var11.field1141) {
                                var8.field980 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var8.field1014 == 6 && var8.field996 != 0) {
                int var12 = var8.field996 >> 16;
                int var13 = var8.field996 << 16 >> 16;
                int var14 = arg0 * var12;
                int var15 = arg0 * var13;
                var8.field986 = var8.field986 + var14 & 2047;
                var8.field987 = var8.field987 + var15 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method128(byte arg0) {
        if (arg0 != 23) {
            this.field312 = !this.field312;
        }
        this.field578 = 0;
        int var2 = (field219.field30 >> 7) + this.field247;
        int var3 = (field219.field31 >> 7) + this.field248;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field578 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field578 = 1;
        }
        if (this.field578 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field578 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)V")
    public final void method129(int arg0, boolean arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field368[var5] != null) {
                int var6 = this.field366[var5];
                int var7 = 70 - var4 * 14 + this.field538 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field367[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field585 == 0 || this.field585 == 1 && this.method110(var8, 6938))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field219.field1573)) {
                        if (this.field620 >= 1) {
                            this.field487[this.field630] = "Report abuse @whi@" + var8;
                            this.field200[this.field630] = 471;
                            ++this.field630;
                        }
                        this.field487[this.field630] = "Add ignore @whi@" + var8;
                        this.field200[this.field630] = 608;
                        ++this.field630;
                        this.field487[this.field630] = "Add friend @whi@" + var8;
                        this.field200[this.field630] = 627;
                        ++this.field630;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field371 == 0 && (var6 == 7 || this.field364 == 0 || this.field364 == 1 && this.method110(var8, 6938))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field620 >= 1) {
                            this.field487[this.field630] = "Report abuse @whi@" + var8;
                            this.field200[this.field630] = 471;
                            ++this.field630;
                        }
                        this.field487[this.field630] = "Add ignore @whi@" + var8;
                        this.field200[this.field630] = 608;
                        ++this.field630;
                        this.field487[this.field630] = "Add friend @whi@" + var8;
                        this.field200[this.field630] = 627;
                        ++this.field630;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field536 == 0 || this.field536 == 1 && this.method110(var8, 6938))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field487[this.field630] = "Accept trade @whi@" + var8;
                        this.field200[this.field630] = 404;
                        ++this.field630;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field371 == 0 && this.field364 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field536 == 0 || this.field536 == 1 && this.method110(var8, 6938))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field487[this.field630] = "Accept challenge @whi@" + var8;
                        this.field200[this.field630] = 394;
                        ++this.field630;
                    }
                    ++var4;
                }
            }
        }
        if (arg1) {
            this.field481 = this.field597.method201();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method130(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field431; ++var3) {
            class71 var5 = this.field430[this.field432[var3]];
            int var6 = (this.field432[var3] << 14) + 536870912;
            if (var5 != null && var5.method8(this.field400) && var5.field1737.field1704 == arg0 && var5.field1737.method597(-32596)) {
                int var7 = var5.field30 >> 7;
                int var8 = var5.field31 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field41 == 1 && (var5.field30 & 127) == 64 && (var5.field31 & 127) == 64) {
                        if (this.field523[var7][var8] == this.field396) {
                            continue;
                        }
                        this.field523[var7][var8] = this.field396;
                    }
                    if (!var5.field1737.field1726) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field434.method331(-18681, var5.field31, this.method173(var5.field30, this.field417, var5.field31, this.field327), var5.field32, var5.field30, this.field417, (var5.field41 - 1) * 64 + 60, var6, var5.field39, var5);
                }
            }
        }
        if (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field592[(var2 - 2 << 7) + var3] = 255;
            }
        }
        if (arg0) {
            this.field554.method519(56);
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field592[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field593[var14] = (this.field592[var14 - 1] + this.field592[var14 + 1] + this.field592[var14 - 128] + this.field592[var14 + 128]) / 4;
            }
        }
        this.field414 += 128;
        if (this.field414 > this.field545.length) {
            this.field414 -= this.field545.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method64(this.field286[var6], false);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field593[var11 + 128] - this.field545[this.field414 + var11 & this.field545.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field592[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field560[var8] = this.field560[var8 + 1];
        }
        this.field560[var2 - 1] = (int) (Math.sin((double) field493 / 14.0D) * 16.0D + Math.sin((double) field493 / 15.0D) * 14.0D + Math.sin((double) field493 / 16.0D) * 12.0D);
        if (this.field470 > 0) {
            this.field470 -= 4;
        }
        if (this.field471 > 0) {
            this.field471 -= 4;
        }
        if (this.field470 == 0 && this.field471 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field470 = 1024;
            }
            if (var9 == 1) {
                this.field471 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (arg0 != -22666) {
            field273 = !field273;
        }
        this.field474 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field495) {
                ++this.field313;
                this.method131(false);
                this.method131(false);
                this.method109(0);
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
        this.field474 = false;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method133(boolean arg0) {
        this.field428 &= arg0;
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
    public final int method134(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        this.field428 &= arg0;
        return ((arg1 & 16711935) * var5 + (arg2 & 16711935) * arg3 & -16711936) + ((arg1 & 65280) * var5 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Z")
    public final boolean method135(int arg0) {
        if (arg0 <= 0) {
            this.field626 = 15;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    private final void method136(int arg0) {
        if (arg0 <= 0) {
            field587 = this.field597.method201();
        }
        if (this.field274 == 2) {
            for (class4 var2 = (class4) this.field402.method509(); var2 != null; var2 = (class4) this.field402.method511(0)) {
                if (var2.field83 > 0) {
                    --var2.field83;
                }
                if (var2.field83 == 0) {
                    if (var2.field80 < 0 || class7.method27((byte) -50, var2.field82, var2.field80)) {
                        this.method43(var2.field82, var2.field81, 0, var2.field80, var2.field79, var2.field76, var2.field78, var2.field77);
                        var2.method588();
                    }
                } else {
                    if (var2.field87 > 0) {
                        --var2.field87;
                    }
                    if (var2.field87 == 0 && var2.field78 >= 1 && var2.field79 >= 1 && var2.field78 <= 102 && var2.field79 <= 102 && (var2.field84 < 0 || class7.method27((byte) -50, var2.field86, var2.field84))) {
                        this.method43(var2.field86, var2.field85, 0, var2.field84, var2.field79, var2.field76, var2.field78, var2.field77);
                        var2.field87 = -1;
                        if (var2.field84 == var2.field80 && var2.field80 == -1) {
                            var2.method588();
                        } else if (var2.field84 == var2.field80 && var2.field85 == var2.field81 && var2.field86 == var2.field82) {
                            var2.method588();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method137(boolean arg0) {
        if (arg0) {
            this.method124();
        }
        try {
            if (this.field326 != null) {
                this.field326.method468();
            }
        } catch (Exception var3) {
        }
        this.field326 = null;
        this.field428 = false;
        this.field639 = 0;
        this.field420 = "";
        this.field421 = "";
        this.method172(true);
        this.field434.method320(false);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field284[var2].method570();
        }
        System.gc();
        this.method133(true);
        this.field586 = -1;
        this.field528 = -1;
        this.field433 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
    public final void method138(String arg0, byte arg1, String arg2) {
        if (arg1 != 51) {
            field587 = 314;
        }
        if (this.field338 != null) {
            this.field338.method1(this.field603);
            class22.field843 = this.field426;
            int var4 = 151;
            if (arg2 != null) {
                var4 -= 7;
            }
            this.field408.method380(arg0, (byte) 0, 257, var4, 0);
            this.field408.method380(arg0, (byte) 0, 256, var4 - 1, 16777215);
            var4 += 15;
            if (arg2 != null) {
                this.field408.method380(arg2, (byte) 0, 257, var4, 0);
                this.field408.method380(arg2, (byte) 0, 256, var4 - 1, 16777215);
            }
            this.field338.method2(4, 4, (byte) 6, super.field888);
        } else if (super.field889 != null) {
            super.field889.method1(this.field603);
            class22.field843 = this.field427;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class26.method256(383 - var6 / 2, var6, var5 - 5 - var7 / 2, 0, var7, (byte) 127);
            class26.method257(383 - var6 / 2, var5 - 5 - var7 / 2, var7, var6, 16777215, 149);
            if (arg2 != null) {
                var5 -= 7;
            }
            this.field408.method380(arg0, (byte) 0, 383, var5, 0);
            this.field408.method380(arg0, (byte) 0, 382, var5 - 1, 16777215);
            var5 += 15;
            if (arg2 != null) {
                this.field408.method380(arg2, (byte) 0, 383, var5, 0);
                this.field408.method380(arg2, (byte) 0, 382, var5 - 1, 16777215);
            }
            super.field889.method2(0, 0, (byte) 6, super.field888);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(JB)V")
    public final void method139(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field418 >= 100 && this.field354 != 1) {
                this.method111("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this.field382);
            } else if (this.field418 >= 200) {
                this.method111("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this.field382);
            } else {
                String var4 = class12.method186(class12.method183(39082, arg0), 7139);
                for (int var5 = 0; var5 < this.field418; ++var5) {
                    if (this.field568[var5] == arg0) {
                        this.method111(var4 + " is already on your friend list", 0, "", this.field382);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field522; ++var6) {
                    if (this.field486[var6] == arg0) {
                        this.method111("Please remove " + var4 + " from your ignore list first", 0, "", this.field382);
                        return;
                    }
                }
                if (!var4.equals(field219.field1573)) {
                    this.field548[this.field418] = var4;
                    this.field568[this.field418] = arg0;
                    this.field422[this.field418] = 0;
                    ++this.field418;
                    if (arg1 == 4) {
                        boolean var7 = false;
                        this.field375 = true;
                        this.field554.method518(172, true);
                        this.field554.method525(arg0, this.field237);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIILIJNDWVIL;)V")
    public final void method140(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class29 arg8) {
        if (this.field618) {
            this.field599 = 32;
        } else {
            this.field599 = 0;
        }
        this.field618 = false;
        if (!arg0) {
            this.field237 = this.field597.method201();
        }
        if (arg6 >= arg7 && arg6 < arg7 + 16 && arg4 >= arg2 && arg4 < arg2 + 16) {
            arg8.field976 -= this.field380 * 4;
            if (arg5 == 1) {
                this.field375 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field305 = true;
            }
        } else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg4 >= arg1 + arg2 - 16 && arg4 < arg1 + arg2) {
            arg8.field976 += this.field380 * 4;
            if (arg5 == 1) {
                this.field375 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field305 = true;
            }
        } else if (arg6 >= arg7 - this.field599 && arg6 < arg7 + 16 + this.field599 && arg4 >= arg2 + 16 && arg4 < arg1 + arg2 - 16 && this.field380 > 0) {
            int var10 = (arg1 - 32) * arg1 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg4 - arg2 - 16 - var10 / 2;
            int var12 = arg1 - 32 - var10;
            arg8.field976 = (arg3 - arg1) * var11 / var12;
            if (arg5 == 1) {
                this.field375 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field305 = true;
            }
            this.field618 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILTKPFKOXP;)V")
    private final void method141(byte arg0, int arg1, class59 arg2) {
        while (true) {
            if (arg2.field1590 + 21 < arg1 * 8) {
                int var4 = arg2.method540(14, true);
                if (var4 != 16383) {
                    if (this.field430[var4] == null) {
                        this.field430[var4] = new class71();
                    }
                    class71 var5 = this.field430[var4];
                    this.field432[this.field431++] = var4;
                    var5.field29 = field493;
                    int var6 = arg2.method540(1, true);
                    if (var6 == 1) {
                        this.field444[this.field443++] = var4;
                    }
                    int var7 = arg2.method540(1, true);
                    var5.field1737 = class69.method598(arg2.method540(13, true));
                    int var8 = arg2.method540(5, true);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg2.method540(5, true);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field41 = var5.field1737.field1716;
                    var5.field33 = var5.field1737.field1693;
                    var5.field25 = var5.field1737.field1707;
                    var5.field26 = var5.field1737.field1722;
                    var5.field27 = var5.field1737.field1721;
                    var5.field28 = var5.field1737.field1696;
                    var5.field65 = var5.field1737.field1700;
                    var5.method7(field219.field62[0] + var9, var7 == 1, field219.field63[0] + var8, false);
                    continue;
                }
            }
            arg2.method541(7);
            if (arg0 != 5) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIIII)V")
    public final void method142(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = class45.field1339[var8];
            int var14 = class45.field1340[var8];
            int var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class45.field1339[var9];
            int var17 = class45.field1340[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field193 = arg2 - var10;
        this.field194 = arg6 - var11;
        this.field195 = arg4 - var12;
        this.field196 = arg3;
        if (arg0 != 17) {
            field619 = this.field597.method201();
        }
        this.field197 = arg5;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void method143(boolean arg0) {
        if (this.field339 == null) {
            this.method78(-182);
            super.field889 = null;
            this.field673 = null;
            this.field674 = null;
            this.field675 = null;
            this.field676 = null;
            if (arg0) {
                this.field554.method519(6);
            }
            this.field677 = null;
            this.field678 = null;
            this.field679 = null;
            this.field680 = null;
            this.field681 = null;
            this.field339 = new class1(96, -826, this.method85(field273), 479);
            this.field337 = new class1(156, -826, this.method85(field273), 172);
            class26.method254(662);
            this.field466.method421(0, this.field334, 0);
            this.field336 = new class1(261, -826, this.method85(field273), 190);
            this.field338 = new class1(334, -826, this.method85(field273), 512);
            class26.method254(662);
            this.field227 = new class1(50, -826, this.method85(field273), 496);
            this.field228 = new class1(37, -826, this.method85(field273), 269);
            this.field229 = new class1(45, -826, this.method85(field273), 249);
            this.field308 = true;
            this.field338.method1(this.field603);
            class22.field843 = this.field426;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
    public final String method144(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field312 = !this.field312;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public final void method145(boolean arg0) {
        if (arg0) {
            this.field594 = null;
        }
        while (true) {
            class5 var2 = this.field328.method204();
            if (var2 == null) {
                return;
            }
            if (var2.field88 == 0) {
                class45.method431(var2.field92, false, var2.field91);
                if ((this.field328.method212(var2.field91, 30468) & 98) != 0) {
                    this.field375 = true;
                    if (this.field468 != -1 || this.field672 != -1) {
                        this.field305 = true;
                    }
                }
            }
            if (var2.field88 == 1 && var2.field92 != null) {
                class47.method464(var2.field92, 767);
            }
            if (var2.field88 == 2 && this.field528 == var2.field91 && var2.field92 != null) {
                this.method44(577, this.field529, var2.field92);
            }
            if (var2.field88 == 3 && this.field274 == 1) {
                for (int var3 = 0; var3 < this.field353.length; ++var3) {
                    if (this.field270[var3] == var2.field91) {
                        this.field353[var3] = var2.field92;
                        if (var2.field92 == null) {
                            this.field270[var3] = -1;
                        }
                        break;
                    }
                    if (this.field271[var3] == var2.field91) {
                        this.field258[var3] = var2.field92;
                        if (var2.field92 == null) {
                            this.field271[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field88 == 93 && this.field328.method219(var2.field91, 422)) {
                class7.method13(true, new class59(859, var2.field92), this.field328);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method146(String arg0, boolean arg1) {
        if (arg0 != null && arg0.length() != 0) {
            String var3 = arg0;
            String[] var4 = new String[100];
            if (arg1) {
                int var5 = 0;
                while (true) {
                    int var6 = var3.indexOf(" ");
                    if (var6 == -1) {
                        String var8 = var3.trim();
                        if (var8.length() > 0) {
                            var4[var5++] = var8.toLowerCase();
                        }
                        this.field611 = 0;
                        label51: for (int var9 = 0; var9 < class54.field1427; ++var9) {
                            class54 var10 = class54.method482(var9);
                            if (var10.field1419 == -1 && var10.field1422 != null) {
                                String var11 = var10.field1422.toLowerCase();
                                for (int var12 = 0; var12 < var5; ++var12) {
                                    if (var11.indexOf(var4[var12]) == -1) {
                                        continue label51;
                                    }
                                }
                                this.field612[this.field611] = var11;
                                this.field613[this.field611] = var9;
                                ++this.field611;
                                if (this.field611 >= this.field612.length) {
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
            }
        } else {
            this.field611 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method147(int arg0) {
        if (!this.field355 && !this.field569 && !this.field215) {
            ++field493;
            int var2 = 49 / arg0;
            if (!this.field428) {
                this.method45(true);
            } else {
                this.method75(this.field481);
            }
            this.method145(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method148(int arg0) {
        this.field337.method1(this.field603);
        if (this.field283 == arg0) {
            if (this.field235 == 2) {
                byte[] var2 = this.field466.field1248;
                int[] var3 = class26.field917;
                int var4 = var2.length;
                for (int var5 = 0; var5 < var4; ++var5) {
                    if (var2[var5] == 0) {
                        var3[var5] = 0;
                    }
                }
                this.field315.method404(0, 256, 0, -31511, this.field365, this.field377, this.field456, 33, 33, 25, 25);
                this.field338.method1(this.field603);
                class22.field843 = this.field426;
            } else {
                int var6 = this.field665 + this.field377 & 2047;
                int var7 = field219.field30 / 32 + 48;
                int var8 = 464 - field219.field31 / 32;
                this.field684.method404(5, this.field488 + 256, 25, -31511, this.field399, var6, this.field567, 151, 146, var8, var7);
                this.field315.method404(0, 256, 0, -31511, this.field365, this.field377, this.field456, 33, 33, 25, 25);
                for (int var9 = 0; var9 < this.field518; ++var9) {
                    int var39 = this.field519[var9] * 4 + 2 - field219.field30 / 32;
                    int var40 = this.field520[var9] * 4 + 2 - field219.field31 / 32;
                    this.method53(true, this.field473[var9], var39, var40);
                }
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var35 = 0; var35 < 104; ++var35) {
                        class56 var36 = this.field594[this.field417][var10][var35];
                        if (var36 != null) {
                            int var37 = var10 * 4 + 2 - field219.field30 / 32;
                            int var38 = var35 * 4 + 2 - field219.field31 / 32;
                            this.method53(true, this.field531, var37, var38);
                        }
                    }
                }
                for (int var11 = 0; var11 < this.field431; ++var11) {
                    class71 var31 = this.field430[this.field432[var11]];
                    if (var31 != null && var31.method8(this.field400)) {
                        class69 var32 = var31.field1737;
                        if (var32.field1705 != null) {
                            var32 = var32.method593(false);
                        }
                        if (var32 != null && var32.field1711 && var32.field1726) {
                            int var33 = var31.field30 / 32 - field219.field30 / 32;
                            int var34 = var31.field31 / 32 - field219.field31 / 32;
                            this.method53(true, this.field532, var33, var34);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field441; ++var12) {
                    class58 var23 = this.field440[this.field442[var12]];
                    if (var23 != null && var23.method8(this.field400)) {
                        int var24 = var23.field30 / 32 - field219.field30 / 32;
                        int var25 = var23.field31 / 32 - field219.field31 / 32;
                        boolean var26 = false;
                        long var27 = class12.method182(var23.field1573);
                        for (int var29 = 0; var29 < this.field418; ++var29) {
                            if (this.field568[var29] == var27 && this.field422[var29] != 0) {
                                var26 = true;
                                break;
                            }
                        }
                        boolean var30 = false;
                        if (field219.field1554 != 0 && var23.field1554 != 0 && field219.field1554 == var23.field1554) {
                            var30 = true;
                        }
                        if (var26) {
                            this.method53(true, this.field534, var24, var25);
                        } else if (var30) {
                            this.method53(true, this.field535, var24, var25);
                        } else {
                            this.method53(true, this.field533, var24, var25);
                        }
                    }
                }
                if (this.field389 != 0 && field493 % 20 < 10) {
                    if (this.field389 == 1 && this.field629 >= 0 && this.field629 < this.field430.length) {
                        class71 var13 = this.field430[this.field629];
                        if (var13 != null) {
                            int var14 = var13.field30 / 32 - field219.field30 / 32;
                            int var15 = var13.field31 / 32 - field219.field31 / 32;
                            this.method119(var15, var14, this.field551, -668);
                        }
                    }
                    if (this.field389 == 2) {
                        int var16 = (this.field220 - this.field247) * 4 + 2 - field219.field30 / 32;
                        int var17 = (this.field221 - this.field248) * 4 + 2 - field219.field31 / 32;
                        this.method119(var17, var16, this.field551, -668);
                    }
                    if (this.field389 == 10 && this.field232 >= 0 && this.field232 < this.field440.length) {
                        class58 var18 = this.field440[this.field232];
                        if (var18 != null) {
                            int var19 = var18.field30 / 32 - field219.field30 / 32;
                            int var20 = var18.field31 / 32 - field219.field31 / 32;
                            this.method119(var20, var19, this.field551, -668);
                        }
                    }
                }
                if (this.field682 != 0) {
                    int var21 = this.field682 * 4 + 2 - field219.field30 / 32;
                    int var22 = this.field683 * 4 + 2 - field219.field31 / 32;
                    this.method53(true, this.field550, var21, var22);
                }
                class26.method256(97, 3, 78, 16777215, 3, (byte) 127);
                this.field338.method1(this.field603);
                class22.field843 = this.field426;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method149(byte arg0) {
        int var2 = 5;
        this.field406[8] = 0;
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            this.field240 = -1;
        }
        int var4 = 0;
        while (this.field406[8] == 0) {
            String var5 = "Unknown problem";
            this.method118(20, "Connecting to web server", 0);
            try {
                DataInputStream var6 = this.method153("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 366);
                class59 var7 = new class59(859, new byte[40]);
                var6.readFully(var7.field1588, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field406[var8] = var7.method534();
                }
                int var9 = var7.method534();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field406[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field406[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field406[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field406[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field406[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field406[8] == 0) {
                ++var4;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method118(10, "Game updated - please reload page", 0);
                        var12 = 10;
                    } else {
                        this.method118(10, var5 + " - Will retry in " + var12 + " secs.", 0);
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
                this.field607 = !this.field607;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILIJNDWVIL;)Z")
    public final boolean method150(int arg0, class29 arg1) {
        if (arg1.field1026 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1026.length; ++var3) {
                int var4 = this.method76(417, var3, arg1);
                int var5 = arg1.field968[var3];
                if (arg1.field1026[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1026[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1026[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILYXSRFNQD;IBI)V")
    public final void method151(int arg0, class69 arg1, int arg2, byte arg3, int arg4) {
        if (this.field630 < 400) {
            if (arg1.field1705 != null) {
                arg1 = arg1.method593(false);
            }
            if (arg1 != null) {
                if (arg1.field1726) {
                    String var6 = arg1.field1697;
                    if (arg3 != 120) {
                        this.field594 = null;
                    }
                    if (arg1.field1725 != 0) {
                        var6 = var6 + method125(0, arg1.field1725, field219.field1567) + " (level-" + arg1.field1725 + ")";
                    }
                    if (this.field499 == 1) {
                        this.field487[this.field630] = "Use " + this.field503 + " with @yel@" + var6;
                        this.field200[this.field630] = 229;
                        this.field201[this.field630] = arg4;
                        this.field198[this.field630] = arg0;
                        this.field199[this.field630] = arg2;
                        ++this.field630;
                    } else {
                        if (this.field345 == 1) {
                            if ((this.field347 & 2) == 2) {
                                this.field487[this.field630] = this.field348 + " @yel@" + var6;
                                this.field200[this.field630] = 764;
                                this.field201[this.field630] = arg4;
                                this.field198[this.field630] = arg0;
                                this.field199[this.field630] = arg2;
                                ++this.field630;
                                return;
                            }
                        } else {
                            if (arg1.field1712 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg1.field1712[var7] != null && !arg1.field1712[var7].equalsIgnoreCase("attack")) {
                                        this.field487[this.field630] = arg1.field1712[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field200[this.field630] = 990;
                                        }
                                        if (var7 == 1) {
                                            this.field200[this.field630] = 553;
                                        }
                                        if (var7 == 2) {
                                            this.field200[this.field630] = 672;
                                        }
                                        if (var7 == 3) {
                                            this.field200[this.field630] = 81;
                                        }
                                        if (var7 == 4) {
                                            this.field200[this.field630] = 227;
                                        }
                                        this.field201[this.field630] = arg4;
                                        this.field198[this.field630] = arg0;
                                        this.field199[this.field630] = arg2;
                                        ++this.field630;
                                    }
                                }
                            }
                            if (arg1.field1712 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field1712[var8] != null && arg1.field1712[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg1.field1725 > field219.field1567) {
                                            var9 = 2000;
                                        }
                                        this.field487[this.field630] = arg1.field1712[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field200[this.field630] = var9 + 990;
                                        }
                                        if (var8 == 1) {
                                            this.field200[this.field630] = var9 + 553;
                                        }
                                        if (var8 == 2) {
                                            this.field200[this.field630] = var9 + 672;
                                        }
                                        if (var8 == 3) {
                                            this.field200[this.field630] = var9 + 81;
                                        }
                                        if (var8 == 4) {
                                            this.field200[this.field630] = var9 + 227;
                                        }
                                        this.field201[this.field630] = arg4;
                                        this.field198[this.field630] = arg0;
                                        this.field199[this.field630] = arg2;
                                        ++this.field630;
                                    }
                                }
                            }
                            this.field487[this.field630] = "Examine @yel@" + var6;
                            this.field200[this.field630] = 1071;
                            this.field201[this.field630] = arg4;
                            this.field198[this.field630] = arg0;
                            this.field199[this.field630] = arg2;
                            ++this.field630;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
    public final void method152(int arg0, int arg1) {
        class56 var3 = this.field594[this.field417][arg0][arg1];
        if (var3 == null) {
            this.field434.method341(this.field417, arg0, arg1);
        } else {
            int var4 = -99999999;
            class15 var5 = null;
            for (class15 var6 = (class15) var3.method509(); var6 != null; var6 = (class15) var3.method511(0)) {
                class54 var11 = class54.method482(var6.field747);
                int var12 = var11.field1438;
                if (var11.field1430) {
                    var12 = (var6.field748 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method507(var5, 0);
            class15 var7 = null;
            class15 var8 = null;
            for (class15 var9 = (class15) var3.method509(); var9 != null; var9 = (class15) var3.method511(0)) {
                if (var5.field747 != var9.field747 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field747 != var9.field747 && var7.field747 != var9.field747 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field434.method327(820, arg0, this.field417, this.method173(arg0 * 128 + 64, this.field417, arg1 * 128 + 64, this.field327), var5, var10, var7, arg1, var8);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method153(String arg0) throws IOException {
        if (!this.field607) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field638 != null) {
                try {
                    this.field638.close();
                } catch (Exception var4) {
                }
                this.field638 = null;
            }
            this.field638 = this.method120(43595);
            this.field638.setSoTimeout(10000);
            InputStream var2 = this.field638.getInputStream();
            OutputStream var3 = this.field638.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method154(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method154(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)Z")
    public final boolean method155(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field327 = this.field597.method201();
        }
        if (this.field326 == null) {
            return false;
        } else {
            try {
                int var2 = this.field326.method470();
                if (var2 == 0) {
                    return false;
                }
                if (this.field240 == -1) {
                    this.field326.method471(this.field292.field1588, 0, 1);
                    this.field240 = this.field292.field1588[0] & 255;
                    if (this.field597 != null) {
                        this.field240 = this.field240 - this.field597.method201() & 255;
                    }
                    this.field239 = class9.field190[this.field240];
                    --var2;
                }
                if (this.field239 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field326.method471(this.field292.field1588, 0, 1);
                    this.field239 = this.field292.field1588[0] & 255;
                    --var2;
                }
                if (this.field239 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field326.method471(this.field292.field1588, 0, 2);
                    this.field292.field1589 = 0;
                    this.field239 = this.field292.method531();
                    var2 -= 2;
                }
                if (var2 < this.field239) {
                    return false;
                }
                this.field292.field1589 = 0;
                this.field326.method471(this.field292.field1588, 0, this.field239);
                this.field241 = 0;
                this.field565 = this.field564;
                this.field564 = this.field563;
                this.field563 = this.field240;
                if (this.field240 == 255) {
                    int var3 = this.field292.method557(false);
                    class29.method311(var3).field1002 = 3;
                    if (field219.field1568 == null) {
                        class29.method311(var3).field1003 = (field219.field1562[11] << 5) + (field219.field1562[8] << 10) + (field219.field1562[0] << 15) + (field219.field1558[0] << 25) + (field219.field1558[4] << 20) + field219.field1562[1];
                    } else {
                        class29.method311(var3).field1003 = (int) (field219.field1568.field1710 + 305419896L);
                    }
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 165) {
                    this.field235 = this.field292.method529();
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 203) {
                    this.field419 = this.field292.method529();
                    this.field375 = true;
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 79) {
                    this.field649 = true;
                    this.field449 = this.field292.method529();
                    this.field450 = this.field292.method529();
                    this.field451 = this.field292.method531();
                    this.field452 = this.field292.method529();
                    this.field453 = this.field292.method529();
                    if (this.field453 >= 100) {
                        int var4 = this.field449 * 128 + 64;
                        int var5 = this.field450 * 128 + 64;
                        int var6 = this.method173(var4, this.field417, var5, this.field327) - this.field451;
                        int var7 = var4 - this.field193;
                        int var8 = var6 - this.field194;
                        int var9 = var5 - this.field195;
                        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
                        this.field196 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 2047;
                        this.field197 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 2047;
                        if (this.field196 < 128) {
                            this.field196 = 128;
                        }
                        if (this.field196 > 383) {
                            this.field196 = 383;
                        }
                    }
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 37) {
                    this.field566 = this.field292.method529();
                    if (this.field566 == this.field295) {
                        if (this.field566 == 3) {
                            this.field295 = 1;
                        } else {
                            this.field295 = 3;
                        }
                        this.field375 = true;
                    }
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 66) {
                    this.field504 = this.field292.method531();
                    this.field354 = this.field292.method547(this.field642);
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 72) {
                    this.field617 = this.field292.method556(false);
                    this.field231 = this.field292.method556(false);
                    this.field423 = this.field292.method556(false);
                    this.field397 = this.field292.method556(false);
                    this.field292.method548(435);
                    this.field359 = this.field292.method531();
                    this.field526 = this.field292.method556(false);
                    this.field510 = this.field292.method531();
                    this.field292.method557(false);
                    this.field333 = this.field292.method565(true);
                    this.field582 = this.field292.method531();
                    signlink.dnslookup(class12.method185(8, this.field333));
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 148) {
                    this.field615 = false;
                    this.field547 = 2;
                    this.field633 = "";
                    this.field305 = true;
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 56) {
                    this.field375 = true;
                    int var11 = this.field292.method531();
                    class29 var12 = class29.method311(var11);
                    while (this.field292.field1589 < this.field239) {
                        int var13 = this.field292.method543();
                        int var14 = this.field292.method531();
                        int var15 = this.field292.method529();
                        if (var15 == 255) {
                            var15 = this.field292.method534();
                        }
                        if (var13 >= 0 && var13 < var12.field998.length) {
                            var12.field998[var13] = var14;
                            var12.field978[var13] = var15;
                        }
                    }
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 215) {
                    this.field637 = this.field292.method549(0);
                    this.field636 = this.field292.method548(435);
                    for (int var16 = this.field636; var16 < this.field636 + 8; ++var16) {
                        for (int var17 = this.field637; var17 < this.field637 + 8; ++var17) {
                            if (this.field594[this.field417][var16][var17] != null) {
                                this.field594[this.field417][var16][var17] = null;
                                this.method152(var16, var17);
                            }
                        }
                    }
                    for (class4 var18 = (class4) this.field402.method509(); var18 != null; var18 = (class4) this.field402.method511(0)) {
                        if (var18.field78 >= this.field636 && var18.field78 < this.field636 + 8 && var18.field79 >= this.field637 && var18.field79 < this.field637 + 8 && this.field417 == var18.field76) {
                            var18.field83 = 0;
                        }
                    }
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 235) {
                    int var19 = this.field292.method558((byte) 74);
                    if (var19 == 65535) {
                        var19 = -1;
                    }
                    if (this.field586 != var19 && this.field579 && !field544 && this.field433 == 0) {
                        this.field528 = var19;
                        this.field529 = true;
                        this.field328.method208(2, this.field528);
                    }
                    this.field586 = var19;
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 179) {
                    int var20 = this.field292.method558((byte) 74);
                    int var21 = this.field292.method562(false);
                    if (this.field579 && !field544) {
                        this.field528 = var20;
                        this.field529 = false;
                        this.field328.method208(2, this.field528);
                        this.field433 = var21;
                    }
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 174) {
                    int var22 = this.field292.method556(false);
                    this.method73(337, var22);
                    if (this.field446 != -1) {
                        this.method157(this.field446, 882);
                        this.field446 = -1;
                        this.field375 = true;
                        this.field281 = true;
                    }
                    if (this.field259 != -1) {
                        this.method157(this.field259, 882);
                        this.field259 = -1;
                        this.field308 = true;
                    }
                    if (this.field309 != -1) {
                        this.method157(this.field309, 882);
                        this.field309 = -1;
                    }
                    if (this.field403 != -1) {
                        this.method157(this.field403, 882);
                        this.field403 = -1;
                    }
                    if (this.field468 != var22) {
                        this.method157(this.field468, 882);
                        this.field468 = var22;
                    }
                    this.field321 = false;
                    this.field305 = true;
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 == 111) {
                    this.field522 = this.field239 / 8;
                    for (int var23 = 0; var23 < this.field522; ++var23) {
                        this.field486[var23] = this.field292.method535((byte) 37);
                    }
                    this.field240 = -1;
                    return true;
                }
                if (this.field240 != 44 && this.field240 != 110 && this.field240 != 58 && this.field240 != 40 && this.field240 != 145 && this.field240 != 90 && this.field240 != 146 && this.field240 != 142 && this.field240 != 33 && this.field240 != 16 && this.field240 != 197) {
                    if (this.field240 == 64) {
                        int var24 = this.field292.method557(false);
                        int var25 = this.field292.method557(false);
                        class29 var26 = class29.method311(var24);
                        if (var26 != null && var26.field1014 == 0) {
                            if (var25 < 0) {
                                var25 = 0;
                            }
                            if (var25 > var26.field981 - var26.field1000) {
                                var25 = var26.field981 - var26.field1000;
                            }
                            var26.field976 = var25;
                        }
                        this.field240 = -1;
                        return true;
                    }
                    if (this.field240 == 138) {
                        this.field649 = false;
                        for (int var27 = 0; var27 < 5; ++var27) {
                            this.field398[var27] = false;
                        }
                        this.field240 = -1;
                        return true;
                    }
                    if (this.field240 == 247) {
                        String var28 = this.field292.method536();
                        if (var28.endsWith(":tradereq:")) {
                            String var29 = var28.substring(0, var28.indexOf(":"));
                            long var30 = class12.method182(var29);
                            boolean var32 = false;
                            for (int var33 = 0; var33 < this.field522; ++var33) {
                                if (this.field486[var33] == var30) {
                                    var32 = true;
                                    break;
                                }
                            }
                            if (!var32 && this.field578 == 0) {
                                this.method111("wishes to trade with you.", 4, var29, this.field382);
                            }
                        } else if (var28.endsWith(":duelreq:")) {
                            String var34 = var28.substring(0, var28.indexOf(":"));
                            long var35 = class12.method182(var34);
                            boolean var37 = false;
                            for (int var38 = 0; var38 < this.field522; ++var38) {
                                if (this.field486[var38] == var35) {
                                    var37 = true;
                                    break;
                                }
                            }
                            if (!var37 && this.field578 == 0) {
                                this.method111("wishes to duel with you.", 8, var34, this.field382);
                            }
                        } else if (!var28.endsWith(":chalreq:")) {
                            this.method111(var28, 0, "", this.field382);
                        } else {
                            String var39 = var28.substring(0, var28.indexOf(":"));
                            long var40 = class12.method182(var39);
                            boolean var42 = false;
                            for (int var43 = 0; var43 < this.field522; ++var43) {
                                if (this.field486[var43] == var40) {
                                    var42 = true;
                                    break;
                                }
                            }
                            if (!var42 && this.field578 == 0) {
                                String var44 = var28.substring(var28.indexOf(":") + 1, var28.length() - 9);
                                this.method111(var44, 8, var39, this.field382);
                            }
                        }
                        this.field240 = -1;
                        return true;
                    }
                    if (this.field240 == 120) {
                        this.field615 = false;
                        this.field547 = 1;
                        this.field633 = "";
                        this.field305 = true;
                        this.field240 = -1;
                        return true;
                    }
                    if (this.field240 != 211) {
                        if (this.field240 == 202) {
                            this.field636 = this.field292.method529();
                            this.field637 = this.field292.method549(0);
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 125) {
                            int var47 = this.field292.method531();
                            class29 var48 = class29.method311(var47);
                            for (int var49 = 0; var49 < var48.field998.length; ++var49) {
                                var48.field998[var49] = -1;
                                var48.field998[var49] = 0;
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 204) {
                            this.field389 = this.field292.method529();
                            if (this.field389 == 1) {
                                this.field629 = this.field292.method531();
                            }
                            if (this.field389 >= 2 && this.field389 <= 6) {
                                if (this.field389 == 2) {
                                    this.field223 = 64;
                                    this.field224 = 64;
                                }
                                if (this.field389 == 3) {
                                    this.field223 = 0;
                                    this.field224 = 64;
                                }
                                if (this.field389 == 4) {
                                    this.field223 = 128;
                                    this.field224 = 64;
                                }
                                if (this.field389 == 5) {
                                    this.field223 = 64;
                                    this.field224 = 0;
                                }
                                if (this.field389 == 6) {
                                    this.field223 = 64;
                                    this.field224 = 128;
                                }
                                this.field389 = 2;
                                this.field220 = this.field292.method531();
                                this.field221 = this.field292.method531();
                                this.field222 = this.field292.method529();
                            }
                            if (this.field389 == 10) {
                                this.field232 = this.field292.method531();
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 196) {
                            int var50 = this.field292.method558((byte) 74);
                            int var51 = this.field292.method531();
                            int var52 = this.field292.method531();
                            int var53 = this.field292.method558((byte) 74);
                            class29.method311(var53).field986 = var51;
                            class29.method311(var53).field987 = var52;
                            class29.method311(var53).field985 = var50;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 112) {
                            this.method137(false);
                            this.field240 = -1;
                            return false;
                        }
                        if (this.field240 == 129) {
                            this.field370 = this.field292.method556(false) * 30;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 124) {
                            int var54 = this.field292.method531();
                            int var55 = this.field292.method557(false);
                            class29.method311(var55).field1002 = 2;
                            class29.method311(var55).field1003 = var54;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 42) {
                            byte var56 = this.field292.method550((byte) 84);
                            int var57 = this.field292.method558((byte) 74);
                            this.field490[var57] = var56;
                            if (this.field511[var57] != var56) {
                                this.field511[var57] = var56;
                                this.method167(var57, true);
                                this.field375 = true;
                                if (this.field672 != -1) {
                                    this.field305 = true;
                                }
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 32) {
                            int var58 = this.field292.method560(this.field349);
                            if (var58 >= 0) {
                                this.method73(337, var58);
                            }
                            if (this.field640 != var58) {
                                this.method157(this.field640, 882);
                                this.field640 = var58;
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 81) {
                            this.field682 = 0;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 39) {
                            this.field637 = this.field292.method548(435);
                            this.field636 = this.field292.method549(0);
                            while (this.field292.field1589 < this.field239) {
                                int var59 = this.field292.method529();
                                this.method164(this.field557, this.field292, var59);
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 73) {
                            for (int var60 = 0; var60 < this.field511.length; ++var60) {
                                if (this.field511[var60] != this.field490[var60]) {
                                    this.field511[var60] = this.field490[var60];
                                    this.method167(var60, true);
                                    this.field375 = true;
                                }
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 95) {
                            int var61 = this.field292.method529();
                            int var62 = this.field292.method557(false);
                            if (var62 == 65535) {
                                var62 = -1;
                            }
                            if (this.field320[var61] != var62) {
                                this.method157(this.field320[var61], 882);
                                this.field320[var61] = var62;
                            }
                            this.field375 = true;
                            this.field281 = true;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 224) {
                            this.field295 = this.field292.method547(this.field642);
                            this.field375 = true;
                            this.field281 = true;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 149) {
                            int var63 = this.field292.method558((byte) 74);
                            int var64 = this.field292.method531();
                            int var65 = this.field292.method558((byte) 74);
                            class29.method311(var63).field996 = (var65 << 16) + var64;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 136 || this.field240 == 244) {
                            int var66 = this.field225;
                            int var67 = this.field226;
                            if (this.field240 == 136) {
                                var67 = this.field292.method531();
                                var66 = this.field292.method531();
                                this.field521 = false;
                            }
                            if (this.field240 == 244) {
                                this.field292.method539((byte) 5);
                                int var68 = 0;
                                while (true) {
                                    if (var68 >= 4) {
                                        this.field292.method541(7);
                                        var67 = this.field292.method558((byte) 74);
                                        var66 = this.field292.method556(false);
                                        this.field521 = true;
                                        break;
                                    }
                                    for (int var69 = 0; var69 < 13; ++var69) {
                                        for (int var70 = 0; var70 < 13; ++var70) {
                                            int var71 = this.field292.method540(1, true);
                                            if (var71 == 1) {
                                                this.field282[var68][var69][var70] = this.field292.method540(26, true);
                                            } else {
                                                this.field282[var68][var69][var70] = -1;
                                            }
                                        }
                                    }
                                    ++var68;
                                }
                            }
                            if (this.field225 == var66 && this.field226 == var67 && this.field274 == 2) {
                                this.field240 = -1;
                                return true;
                            }
                            this.field225 = var66;
                            this.field226 = var67;
                            this.field247 = (this.field225 - 6) * 8;
                            this.field248 = (this.field226 - 6) * 8;
                            this.field663 = false;
                            if ((this.field225 / 8 == 48 || this.field225 / 8 == 49) && this.field226 / 8 == 48) {
                                this.field663 = true;
                            }
                            if (this.field225 / 8 == 48 && this.field226 / 8 == 148) {
                                this.field663 = true;
                            }
                            this.field274 = 1;
                            this.field297 = System.currentTimeMillis();
                            this.method138("Loading - please wait.", (byte) 51, (String) null);
                            if (this.field240 == 136) {
                                int var72 = 0;
                                int var73 = (this.field225 - 6) / 8;
                                label1225: while (true) {
                                    if (var73 > (this.field225 + 6) / 8) {
                                        this.field353 = new byte[var72][];
                                        this.field258 = new byte[var72][];
                                        this.field269 = new int[var72];
                                        this.field270 = new int[var72];
                                        this.field271 = new int[var72];
                                        int var75 = 0;
                                        int var76 = (this.field225 - 6) / 8;
                                        while (true) {
                                            if (var76 > (this.field225 + 6) / 8) {
                                                break label1225;
                                            }
                                            for (int var77 = (this.field226 - 6) / 8; var77 <= (this.field226 + 6) / 8; ++var77) {
                                                this.field269[var75] = (var76 << 8) + var77;
                                                if (this.field663 && (var77 == 49 || var77 == 149 || var77 == 147 || var76 == 50 || var76 == 49 && var77 == 47)) {
                                                    this.field270[var75] = -1;
                                                    this.field271[var75] = -1;
                                                    ++var75;
                                                } else {
                                                    int var78 = this.field270[var75] = this.field328.method217(0, false, var77, var76);
                                                    if (var78 != -1) {
                                                        this.field328.method208(3, var78);
                                                    }
                                                    int var79 = this.field271[var75] = this.field328.method217(1, false, var77, var76);
                                                    if (var79 != -1) {
                                                        this.field328.method208(3, var79);
                                                    }
                                                    ++var75;
                                                }
                                            }
                                            ++var76;
                                        }
                                    }
                                    for (int var74 = (this.field226 - 6) / 8; var74 <= (this.field226 + 6) / 8; ++var74) {
                                        ++var72;
                                    }
                                    ++var73;
                                }
                            }
                            if (this.field240 == 244) {
                                int var80 = 0;
                                int[] var81 = new int[676];
                                int var82 = 0;
                                label1186: while (true) {
                                    if (var82 >= 4) {
                                        this.field353 = new byte[var80][];
                                        this.field258 = new byte[var80][];
                                        this.field269 = new int[var80];
                                        this.field270 = new int[var80];
                                        this.field271 = new int[var80];
                                        int var90 = 0;
                                        while (true) {
                                            if (var90 >= var80) {
                                                break label1186;
                                            }
                                            int var91 = this.field269[var90] = var81[var90];
                                            int var92 = var91 >> 8 & 255;
                                            int var93 = var91 & 255;
                                            int var94 = this.field270[var90] = this.field328.method217(0, false, var93, var92);
                                            if (var94 != -1) {
                                                this.field328.method208(3, var94);
                                            }
                                            int var95 = this.field271[var90] = this.field328.method217(1, false, var93, var92);
                                            if (var95 != -1) {
                                                this.field328.method208(3, var95);
                                            }
                                            ++var90;
                                        }
                                    }
                                    for (int var83 = 0; var83 < 13; ++var83) {
                                        for (int var84 = 0; var84 < 13; ++var84) {
                                            int var85 = this.field282[var82][var83][var84];
                                            if (var85 != -1) {
                                                int var86 = var85 >> 14 & 1023;
                                                int var87 = var85 >> 3 & 2047;
                                                int var88 = (var86 / 8 << 8) + var87 / 8;
                                                for (int var89 = 0; var89 < var80; ++var89) {
                                                    if (var81[var89] == var88) {
                                                        var88 = -1;
                                                        break;
                                                    }
                                                }
                                                if (var88 != -1) {
                                                    var81[var80++] = var88;
                                                }
                                            }
                                        }
                                    }
                                    ++var82;
                                }
                            }
                            int var96 = this.field247 - this.field249;
                            int var97 = this.field248 - this.field250;
                            this.field249 = this.field247;
                            this.field250 = this.field248;
                            for (int var98 = 0; var98 < 16384; ++var98) {
                                class71 var99 = this.field430[var98];
                                if (var99 != null) {
                                    for (int var100 = 0; var100 < 10; ++var100) {
                                        var99.field62[var100] -= var96;
                                        var99.field63[var100] -= var97;
                                    }
                                    var99.field30 -= var96 * 128;
                                    var99.field31 -= var97 * 128;
                                }
                            }
                            for (int var101 = 0; var101 < this.field438; ++var101) {
                                class58 var102 = this.field440[var101];
                                if (var102 != null) {
                                    for (int var103 = 0; var103 < 10; ++var103) {
                                        var102.field62[var103] -= var96;
                                        var102.field63[var103] -= var97;
                                    }
                                    var102.field30 -= var96 * 128;
                                    var102.field31 -= var97 * 128;
                                }
                            }
                            this.field267 = true;
                            byte var104 = 0;
                            byte var105 = 104;
                            byte var106 = 1;
                            if (var96 < 0) {
                                var104 = 103;
                                var105 = -1;
                                var106 = -1;
                            }
                            byte var107 = 0;
                            byte var108 = 104;
                            byte var109 = 1;
                            if (var97 < 0) {
                                var107 = 103;
                                var108 = -1;
                                var109 = -1;
                            }
                            for (int var110 = var104; var105 != var110; var110 += var106) {
                                for (int var111 = var107; var108 != var111; var111 += var109) {
                                    int var112 = var96 + var110;
                                    int var113 = var97 + var111;
                                    for (int var114 = 0; var114 < 4; ++var114) {
                                        if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                                            this.field594[var114][var110][var111] = this.field594[var114][var112][var113];
                                        } else {
                                            this.field594[var114][var110][var111] = null;
                                        }
                                    }
                                }
                            }
                            for (class4 var115 = (class4) this.field402.method509(); var115 != null; var115 = (class4) this.field402.method511(0)) {
                                var115.field78 -= var96;
                                var115.field79 -= var97;
                                if (var115.field78 < 0 || var115.field79 < 0 || var115.field78 >= 104 || var115.field79 >= 104) {
                                    var115.method588();
                                }
                            }
                            if (this.field682 != 0) {
                                this.field682 -= var96;
                                this.field683 -= var97;
                            }
                            this.field649 = false;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 246) {
                            if (this.field295 == 12) {
                                this.field375 = true;
                            }
                            this.field462 = this.field292.method529();
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 243) {
                            int var116 = this.field292.method556(false);
                            this.method73(337, var116);
                            if (this.field446 != -1) {
                                this.method157(this.field446, 882);
                                this.field446 = -1;
                                this.field375 = true;
                                this.field281 = true;
                            }
                            if (this.field468 != -1) {
                                this.method157(this.field468, 882);
                                this.field468 = -1;
                                this.field305 = true;
                            }
                            if (this.field259 != -1) {
                                this.method157(this.field259, 882);
                                this.field259 = -1;
                                this.field308 = true;
                            }
                            if (this.field309 != -1) {
                                this.method157(this.field309, 882);
                                this.field309 = -1;
                            }
                            if (this.field403 != var116) {
                                this.method157(this.field403, 882);
                                this.field403 = var116;
                            }
                            if (this.field547 != 0) {
                                this.field547 = 0;
                                this.field305 = true;
                            }
                            this.field321 = false;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 70) {
                            if (this.field446 != -1) {
                                this.method157(this.field446, 882);
                                this.field446 = -1;
                                this.field375 = true;
                                this.field281 = true;
                            }
                            if (this.field468 != -1) {
                                this.method157(this.field468, 882);
                                this.field468 = -1;
                                this.field305 = true;
                            }
                            if (this.field259 != -1) {
                                this.method157(this.field259, 882);
                                this.field259 = -1;
                                this.field308 = true;
                            }
                            if (this.field309 != -1) {
                                this.method157(this.field309, 882);
                                this.field309 = -1;
                            }
                            if (this.field403 != -1) {
                                this.method157(this.field403, 882);
                                this.field403 = -1;
                            }
                            if (this.field547 != 0) {
                                this.field547 = 0;
                                this.field305 = true;
                            }
                            this.field321 = false;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 36) {
                            long var117 = this.field292.method535((byte) 37);
                            int var119 = this.field292.method529();
                            String var120 = class12.method186(class12.method183(39082, var117), 7139);
                            for (int var121 = 0; var121 < this.field418; ++var121) {
                                if (this.field568[var121] == var117) {
                                    if (this.field422[var121] != var119) {
                                        this.field422[var121] = var119;
                                        this.field375 = true;
                                        if (var119 > 0) {
                                            this.method111(var120 + " has logged in.", 5, "", this.field382);
                                        }
                                        if (var119 == 0) {
                                            this.method111(var120 + " has logged out.", 5, "", this.field382);
                                        }
                                    }
                                    var120 = null;
                                    break;
                                }
                            }
                            if (var120 != null && this.field418 < 200) {
                                this.field568[this.field418] = var117;
                                this.field548[this.field418] = var120;
                                this.field422[this.field418] = var119;
                                ++this.field418;
                                this.field375 = true;
                            }
                            boolean var122 = false;
                            while (!var122) {
                                var122 = true;
                                for (int var123 = 0; var123 < this.field418 - 1; ++var123) {
                                    if (this.field422[var123] != field541 && this.field422[var123 + 1] == field541 || this.field422[var123] == 0 && this.field422[var123 + 1] != 0) {
                                        int var124 = this.field422[var123];
                                        this.field422[var123] = this.field422[var123 + 1];
                                        this.field422[var123 + 1] = var124;
                                        String var125 = this.field548[var123];
                                        this.field548[var123] = this.field548[var123 + 1];
                                        this.field548[var123 + 1] = var125;
                                        long var126 = this.field568[var123];
                                        this.field568[var123] = this.field568[var123 + 1];
                                        this.field568[var123 + 1] = var126;
                                        this.field375 = true;
                                        var122 = false;
                                    }
                                }
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 53) {
                            long var128 = this.field292.method535((byte) 37);
                            int var130 = this.field292.method534();
                            int var131 = this.field292.method529();
                            boolean var132 = false;
                            for (int var133 = 0; var133 < 100; ++var133) {
                                if (this.field318[var133] == var130) {
                                    var132 = true;
                                    break;
                                }
                            }
                            if (var131 <= 1) {
                                for (int var134 = 0; var134 < this.field522; ++var134) {
                                    if (this.field486[var134] == var128) {
                                        var132 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var132 && this.field578 == 0) {
                                try {
                                    this.field318[this.field616] = var130;
                                    this.field616 = (this.field616 + 1) % 100;
                                    String var135 = class68.method589(1, this.field239 - 13, this.field292);
                                    if (var131 != 3) {
                                        var135 = class28.method281(var135, false);
                                    }
                                    if (var131 != 2 && var131 != 3) {
                                        if (var131 == 1) {
                                            this.method111(var135, 7, "@cr1@" + class12.method186(class12.method183(39082, var128), 7139), this.field382);
                                        } else {
                                            this.method111(var135, 3, class12.method186(class12.method183(39082, var128), 7139), this.field382);
                                        }
                                    } else {
                                        this.method111(var135, 7, "@cr2@" + class12.method186(class12.method183(39082, var128), 7139), this.field382);
                                    }
                                } catch (Exception var190) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 183) {
                            if (this.field295 == 12) {
                                this.field375 = true;
                            }
                            this.field299 = this.field292.method532();
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 47) {
                            this.field649 = true;
                            this.field390 = this.field292.method529();
                            this.field391 = this.field292.method529();
                            this.field392 = this.field292.method531();
                            this.field393 = this.field292.method529();
                            this.field394 = this.field292.method529();
                            if (this.field394 >= 100) {
                                this.field193 = this.field390 * 128 + 64;
                                this.field195 = this.field391 * 128 + 64;
                                this.field194 = this.method173(this.field193, this.field417, this.field195, this.field327) - this.field392;
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 218) {
                            this.field375 = true;
                            int var137 = this.field292.method531();
                            class29 var138 = class29.method311(var137);
                            int var139 = this.field292.method531();
                            for (int var140 = 0; var140 < var139; ++var140) {
                                int var141 = this.field292.method547(this.field642);
                                if (var141 == 255) {
                                    var141 = this.field292.method564(0);
                                }
                                var138.field998[var140] = this.field292.method558((byte) 74);
                                var138.field978[var140] = var141;
                            }
                            for (int var142 = var139; var142 < var138.field998.length; ++var142) {
                                var138.field998[var142] = 0;
                                var138.field978[var142] = 0;
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 49) {
                            this.method37(2, this.field239, this.field292);
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 80) {
                            int var143 = this.field292.method558((byte) 74);
                            int var144 = this.field292.method558((byte) 74);
                            int var145 = this.field292.method556(false);
                            if (var145 == 65535) {
                                class29.method311(var143).field1002 = 0;
                                this.field240 = -1;
                                return true;
                            }
                            class54 var146 = class54.method482(var145);
                            class29.method311(var143).field1002 = 4;
                            class29.method311(var143).field1003 = var145;
                            class29.method311(var143).field986 = var146.field1447;
                            class29.method311(var143).field987 = var146.field1429;
                            class29.method311(var143).field985 = var146.field1450 * 100 / var144;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 214) {
                            this.field585 = this.field292.method529();
                            this.field364 = this.field292.method529();
                            this.field536 = this.field292.method529();
                            this.field588 = true;
                            this.field305 = true;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 175) {
                            this.field375 = true;
                            int var147 = this.field292.method564(0);
                            int var148 = this.field292.method547(this.field642);
                            int var149 = this.field292.method548(435);
                            this.field558[var149] = var147;
                            this.field505[var149] = var148;
                            this.field287[var149] = 1;
                            for (int var150 = 0; var150 < 98; ++var150) {
                                if (var147 >= field374[var150]) {
                                    this.field287[var149] = var150 + 2;
                                }
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 172) {
                            int var151 = this.field292.method557(false);
                            int var152 = this.field292.method558((byte) 74);
                            int var153 = var151 >> 10 & 31;
                            int var154 = var151 >> 5 & 31;
                            int var155 = var151 & 31;
                            class29.method311(var152).field999 = (var155 << 3) + (var153 << 19) + (var154 << 11);
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 134) {
                            int var156 = this.field292.method556(false);
                            boolean var157 = this.field292.method548(435) == 1;
                            class29.method311(var156).field1010 = var157;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 189) {
                            this.method34(this.field239, this.field292, (byte) 9);
                            this.field267 = false;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 223) {
                            int var158 = this.field292.method549(0);
                            int var159 = this.field292.method549(0);
                            String var160 = this.field292.method536();
                            if (var159 >= 1 && var159 <= 5) {
                                if (var160.equalsIgnoreCase("null")) {
                                    var160 = null;
                                }
                                this.field512[var159 - 1] = var160;
                                this.field513[var159 - 1] = var158 == 0;
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 141) {
                            int var161 = this.field292.method561(0);
                            if (this.field672 != var161) {
                                this.method157(this.field672, 882);
                                this.field672 = var161;
                            }
                            this.field305 = true;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 20) {
                            int var162 = this.field292.method531();
                            int var163 = this.field292.method558((byte) 74);
                            class29.method311(var163).field1002 = 1;
                            class29.method311(var163).field1003 = var162;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 226) {
                            int var164 = this.field292.method531();
                            int var165 = this.field292.method558((byte) 74);
                            this.method73(337, var165);
                            if (var164 != -1) {
                                this.method73(337, var164);
                            }
                            if (this.field403 != -1) {
                                this.method157(this.field403, 882);
                                this.field403 = -1;
                            }
                            if (this.field446 != -1) {
                                this.method157(this.field446, 882);
                                this.field446 = -1;
                            }
                            if (this.field468 != -1) {
                                this.method157(this.field468, 882);
                                this.field468 = -1;
                            }
                            if (this.field259 != var165) {
                                this.method157(this.field259, 882);
                                this.field259 = var165;
                            }
                            if (this.field309 != var165) {
                                this.method157(this.field309, 882);
                                this.field309 = var164;
                            }
                            this.field547 = 0;
                            this.field321 = false;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 167) {
                            int var166 = this.field292.method556(false);
                            String var167 = this.field292.method536();
                            class29.method311(var166).field972 = var167;
                            int var10001 = this.field320[this.field295];
                            if (class29.method311(var166).field1012 == var10001) {
                                this.field375 = true;
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 131) {
                            int var168 = this.field292.method564(0);
                            int var169 = this.field292.method558((byte) 74);
                            this.field490[var169] = var168;
                            if (this.field511[var169] != var168) {
                                this.field511[var169] = var168;
                                this.method167(var169, true);
                                this.field375 = true;
                                if (this.field672 != -1) {
                                    this.field305 = true;
                                }
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 249) {
                            int var170 = this.field292.method531();
                            int var171 = this.field292.method561(0);
                            int var172 = this.field292.method532();
                            class29 var173 = class29.method311(var170);
                            var173.field974 = var172;
                            var173.field979 = var171;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 209) {
                            for (int var174 = 0; var174 < this.field440.length; ++var174) {
                                if (this.field440[var174] != null) {
                                    this.field440[var174].field47 = -1;
                                }
                            }
                            for (int var175 = 0; var175 < this.field430.length; ++var175) {
                                if (this.field430[var175] != null) {
                                    this.field430[var175].field47 = -1;
                                }
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 239) {
                            int var176 = this.field292.method559(true);
                            int var177 = this.field292.method531();
                            class29 var178 = class29.method311(var177);
                            if (var178.field963 != var176 || var176 == -1) {
                                var178.field963 = var176;
                                var178.field980 = 0;
                                var178.field1009 = 0;
                            }
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 71) {
                            this.field415 = this.field292.method529();
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 92) {
                            int var179 = this.field292.method529();
                            int var180 = this.field292.method529();
                            int var181 = this.field292.method529();
                            int var182 = this.field292.method529();
                            this.field398[var179] = true;
                            this.field373[var179] = var180;
                            this.field217[var179] = var181;
                            this.field314[var179] = var182;
                            this.field252[var179] = 0;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 221) {
                            int var183 = this.field292.method557(false);
                            this.method73(337, var183);
                            if (this.field468 != -1) {
                                this.method157(this.field468, 882);
                                this.field468 = -1;
                                this.field305 = true;
                            }
                            if (this.field259 != -1) {
                                this.method157(this.field259, 882);
                                this.field259 = -1;
                                this.field308 = true;
                            }
                            if (this.field309 != -1) {
                                this.method157(this.field309, 882);
                                this.field309 = -1;
                            }
                            if (this.field403 != -1) {
                                this.method157(this.field403, 882);
                                this.field403 = -1;
                            }
                            if (this.field446 != var183) {
                                this.method157(this.field446, 882);
                                this.field446 = var183;
                            }
                            if (this.field547 != 0) {
                                this.field547 = 0;
                                this.field305 = true;
                            }
                            this.field375 = true;
                            this.field281 = true;
                            this.field321 = false;
                            this.field240 = -1;
                            return true;
                        }
                        if (this.field240 == 97) {
                            int var184 = this.field292.method531();
                            int var185 = this.field292.method529();
                            int var186 = this.field292.method531();
                            if (var186 == 65535) {
                                if (this.field361 < 50) {
                                    this.field214[this.field361] = (short) var184;
                                    this.field387[this.field361] = var185;
                                    this.field624[this.field361] = 0;
                                    ++this.field361;
                                }
                            } else if (this.field508 && !field544 && this.field361 < 50) {
                                this.field214[this.field361] = var184;
                                this.field387[this.field361] = var185;
                                this.field624[this.field361] = class53.field1405[var184] + var186;
                                ++this.field361;
                            }
                            this.field240 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field240 + "," + this.field239 + " - " + this.field564 + "," + this.field565);
                        this.method137(false);
                        return true;
                    }
                    int var45 = this.field292.method531();
                    int var46 = this.field292.method557(false);
                    if (this.field468 != -1) {
                        this.method157(this.field468, 882);
                        this.field468 = -1;
                        this.field305 = true;
                    }
                    if (this.field259 != -1) {
                        this.method157(this.field259, 882);
                        this.field259 = -1;
                        this.field308 = true;
                    }
                    if (this.field309 != -1) {
                        this.method157(this.field309, 882);
                        this.field309 = -1;
                    }
                    if (this.field403 != var46) {
                        this.method157(this.field403, 882);
                        this.field403 = var46;
                    }
                    if (this.field446 != var45) {
                        this.method157(this.field446, 882);
                        this.field446 = var45;
                    }
                    if (this.field547 != 0) {
                        this.field547 = 0;
                        this.field305 = true;
                    }
                    this.field375 = true;
                    this.field281 = true;
                    this.field321 = false;
                    this.field240 = -1;
                    return true;
                }
                this.method164(this.field557, this.field292, this.field240);
                this.field240 = -1;
                return true;
            } catch (IOException var191) {
                this.method58(true);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field240 + "," + this.field564 + "," + this.field565 + " - " + this.field239 + "," + (field219.field62[0] + this.field247) + "," + (field219.field63[0] + this.field248) + " - ";
                for (int var189 = 0; var189 < this.field239 && var189 < 50; ++var189) {
                    var188 = var188 + this.field292.field1588[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method137(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method156(byte arg0, boolean arg1) {
        if (field219.field30 >> 7 == this.field682 && field219.field31 >> 7 == this.field683) {
            this.field682 = 0;
        }
        int var3 = this.field441;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class58 var6;
            int var7;
            if (arg1) {
                var6 = field219;
                var7 = this.field439 << 14;
            } else {
                var6 = this.field440[this.field442[var4]];
                var7 = this.field442[var4] << 14;
            }
            if (var6 != null && var6.method8(this.field400)) {
                var6.field1572 = false;
                if ((field544 && this.field441 > 50 || this.field441 > 200) && !arg1 && var6.field65 == var6.field53) {
                    var6.field1572 = true;
                }
                int var8 = var6.field30 >> 7;
                int var9 = var6.field31 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field1566 != null && field493 >= var6.field1551 && field493 < var6.field1552) {
                        var6.field1572 = false;
                        var6.field1570 = this.method173(var6.field30, this.field417, var6.field31, this.field327);
                        this.field434.method332(var6.field1546, var6.field31, var6, this.field417, 60, var6.field1570, (byte) -57, var7, var6.field32, var6.field1549, var6.field30, var6.field1547, var6.field1548);
                    } else {
                        if ((var6.field30 & 127) == 64 && (var6.field31 & 127) == 64) {
                            if (this.field523[var8][var9] == this.field396) {
                                continue;
                            }
                            this.field523[var8][var9] = this.field396;
                        }
                        var6.field1570 = this.method173(var6.field30, this.field417, var6.field31, this.field327);
                        this.field434.method331(-18681, var6.field31, var6.field1570, var6.field32, var6.field30, this.field417, 60, var7, var6.field39, var6);
                    }
                }
            }
        }
        if (arg0 != 112) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field202) {
            this.method132(-22666);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(II)V")
    public final void method157(int arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class29.method313(arg0, 882);
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method158(byte arg0) {
        ++this.field396;
        this.method156((byte) 112, true);
        this.method130(true, -680);
        this.method156((byte) 112, false);
        this.method130(false, -680);
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field237 = this.field597.method201();
        }
        this.method48((byte) 4);
        this.method57((byte) 4);
        if (!this.field649) {
            int var3 = this.field376;
            if (this.field646 / 256 > var3) {
                var3 = this.field646 / 256;
            }
            if (this.field398[4] && this.field217[4] + 128 > var3) {
                var3 = this.field217[4] + 128;
            }
            int var4 = this.field412 + this.field377 & 2047;
            this.method142(this.field625, var3 * 3 + 600, this.field383, var3, this.field384, var4, this.method173(field219.field30, this.field417, field219.field31, this.field327) - 50);
        }
        int var5;
        if (!this.field649) {
            var5 = this.method114(false);
        } else {
            var5 = this.method115(false);
        }
        int var6 = this.field193;
        int var7 = this.field194;
        int var8 = this.field195;
        int var9 = this.field196;
        int var10 = this.field197;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field398[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field373[var11] * 2 + 1) - (double) this.field373[var11] + Math.sin((double) this.field314[var11] / 100.0D * (double) this.field252[var11]) * (double) this.field217[var11]);
                if (var11 == 0) {
                    this.field193 += var13;
                }
                if (var11 == 1) {
                    this.field194 += var13;
                }
                if (var11 == 2) {
                    this.field195 += var13;
                }
                if (var11 == 3) {
                    this.field197 = this.field197 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field196 += var13;
                    if (this.field196 < 128) {
                        this.field196 = 128;
                    }
                    if (this.field196 > 383) {
                        this.field196 = 383;
                    }
                }
            }
        }
        int var12 = class22.field852;
        class45.field1334 = true;
        class45.field1337 = 0;
        class45.field1335 = super.field896 - 4;
        class45.field1336 = super.field897 - 4;
        class26.method254(662);
        this.field434.method359(this.field196, var5, this.field195, this.field193, 0, this.field197, this.field194);
        this.field434.method334(0);
        this.method55(false);
        this.method100((byte) 9);
        this.method104(888, var12);
        this.method122((byte) -126);
        this.field338.method2(4, 4, (byte) 6, super.field888);
        this.field193 = var6;
        this.field194 = var7;
        this.field195 = var8;
        this.field196 = var9;
        this.field197 = var10;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LTKPFKOXP;II)V")
    private final void method160(class59 arg0, int arg1, int arg2) {
        while (true) {
            if (arg0.field1590 + 10 < arg1 * 8) {
                int var4 = arg0.method540(11, true);
                if (var4 != 2047) {
                    if (this.field440[var4] == null) {
                        this.field440[var4] = new class58();
                        if (this.field445[var4] != null) {
                            this.field440[var4].method516(this.field445[var4], -43453);
                        }
                    }
                    this.field442[this.field441++] = var4;
                    class58 var5 = this.field440[var4];
                    var5.field29 = field493;
                    int var6 = arg0.method540(5, true);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method540(1, true);
                    if (var7 == 1) {
                        this.field444[this.field443++] = var4;
                    }
                    int var8 = arg0.method540(1, true);
                    int var9 = arg0.method540(5, true);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method7(field219.field62[0] + var9, var8 == 1, field219.field63[0] + var6, false);
                    continue;
                }
            }
            arg0.method541(7);
            if (arg2 != -12914) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (this.field371 != 0) {
            class36 var2 = this.field408;
            int var3 = 0;
            if (this.field370 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field368[var4] != null) {
                    int var5 = this.field366[var4];
                    String var6 = this.field367[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field364 == 0 || this.field364 == 1 && this.method110(var6, 6938))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method384("From", var8, var9, this.field285, 0);
                        var2.method384("From", var8 - 1, var9, this.field285, 65535);
                        int var10 = var9 + var2.method382("From ", (byte) 3);
                        if (var7 == 1) {
                            this.field411[0].method421(var8 - 12, this.field334, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field411[1].method421(var8 - 12, this.field334, var10);
                            var10 += 14;
                        }
                        var2.method384(var6 + ": " + this.field368[var4], var8, var10, this.field285, 0);
                        var2.method384(var6 + ": " + this.field368[var4], var8 - 1, var10, this.field285, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field364 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method384(this.field368[var4], var11, 4, this.field285, 0);
                        var2.method384(this.field368[var4], var11 - 1, 4, this.field285, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field364 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method384("To " + var6 + ": " + this.field368[var4], var12, 4, this.field285, 0);
                        var2.method384("To " + var6 + ": " + this.field368[var4], var12 - 1, 4, this.field285, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 0) {
                this.field312 = !this.field312;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public final void method162(boolean arg0, byte arg1) {
        this.method86(true);
        if (this.field369 == arg1) {
            boolean var3 = false;
        } else {
            this.field594 = null;
        }
        this.field675.method1(this.field603);
        this.field447.method421(0, this.field334, 0);
        short var4 = 360;
        short var5 = 200;
        if (this.field639 == 0) {
            int var6 = var5 / 2 + 80;
            this.field407.method381(9, this.field328.field787, true, var6, 7711145, var4 / 2);
            int var7 = var5 / 2 - 20;
            this.field409.method381(9, "Welcome to RuneScape", true, var7, 16776960, var4 / 2);
            int var18 = var7 + 30;
            int var8 = var4 / 2 - 80;
            int var9 = var5 / 2 + 20;
            this.field448.method421(var9 - 20, this.field334, var8 - 73);
            this.field409.method381(9, "New User", true, var9 + 5, 16777215, var8);
            int var10 = var4 / 2 + 80;
            this.field448.method421(var9 - 20, this.field334, var10 - 73);
            this.field409.method381(9, "Existing User", true, var9 + 5, 16777215, var10);
        }
        if (this.field639 == 2) {
            int var11 = var5 / 2 - 40;
            if (this.field245.length() > 0) {
                this.field409.method381(9, this.field245, true, var11 - 15, 16776960, var4 / 2);
                this.field409.method381(9, this.field246, true, var11, 16776960, var4 / 2);
                var11 += 30;
            } else {
                this.field409.method381(9, this.field246, true, var11 - 7, 16776960, var4 / 2);
                var11 += 30;
            }
            this.field409.method388(0, var4 / 2 - 90, var11, 16777215, true, "Username: " + this.field420 + (this.field350 == 0 & field493 % 40 < 20 ? "@yel@|" : ""));
            var11 += 15;
            this.field409.method388(0, var4 / 2 - 88, var11, 16777215, true, "Password: " + class12.method187(this.field421, (byte) -26) + (this.field350 == 1 & field493 % 40 < 20 ? "@yel@|" : ""));
            var11 += 15;
            if (!arg0) {
                int var12 = var4 / 2 - 80;
                int var13 = var5 / 2 + 50;
                this.field448.method421(var13 - 20, this.field334, var12 - 73);
                this.field409.method381(9, "Login", true, var13 + 5, 16777215, var12);
                int var14 = var4 / 2 + 80;
                this.field448.method421(var13 - 20, this.field334, var14 - 73);
                this.field409.method381(9, "Cancel", true, var13 + 5, 16777215, var14);
            }
        }
        if (this.field639 == 3) {
            this.field409.method381(9, "Create a free account", true, var5 / 2 - 60, 16776960, var4 / 2);
            int var15 = var5 / 2 - 35;
            this.field409.method381(9, "To create a new account you need to", true, var15, 16777215, var4 / 2);
            int var19 = var15 + 15;
            this.field409.method381(9, "go back to the main RuneScape webpage", true, var19, 16777215, var4 / 2);
            int var20 = var19 + 15;
            this.field409.method381(9, "and choose the 'create account'", true, var20, 16777215, var4 / 2);
            int var21 = var20 + 15;
            this.field409.method381(9, "button near the top of that page.", true, var21, 16777215, var4 / 2);
            int var22 = var21 + 15;
            int var16 = var4 / 2;
            int var17 = var5 / 2 + 50;
            this.field448.method421(var17 - 20, this.field334, var16 - 73);
            this.field409.method381(9, "Cancel", true, var17 + 5, 16777215, var16);
        }
        this.field675.method2(171, 202, (byte) 6, super.field888);
        if (this.field308) {
            this.field308 = false;
            this.field673.method2(0, 128, (byte) 6, super.field888);
            this.field674.method2(371, 202, (byte) 6, super.field888);
            this.field678.method2(265, 0, (byte) 6, super.field888);
            this.field679.method2(265, 562, (byte) 6, super.field888);
            this.field680.method2(171, 128, (byte) 6, super.field888);
            this.field681.method2(171, 562, (byte) 6, super.field888);
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (this.field371 != 0) {
            int var2 = 0;
            int var3 = 15 / arg0;
            if (this.field370 != 0) {
                var2 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field368[var4] != null) {
                    int var5 = this.field366[var4];
                    String var6 = this.field367[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field364 == 0 || this.field364 == 1 && this.method110(var6, 6938))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field896 > 4 && super.field897 - 4 > var10 - 10 && super.field897 - 4 <= var10 + 3) {
                            int var11 = this.field408.method382("From:  " + var6 + this.field368[var4], (byte) 3) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field896 < var11 + 4) {
                                if (this.field620 >= 1) {
                                    this.field487[this.field630] = "Report abuse @whi@" + var6;
                                    this.field200[this.field630] = 2471;
                                    ++this.field630;
                                }
                                this.field487[this.field630] = "Add ignore @whi@" + var6;
                                this.field200[this.field630] = 2608;
                                ++this.field630;
                                this.field487[this.field630] = "Add friend @whi@" + var6;
                                this.field200[this.field630] = 2627;
                                ++this.field630;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field364 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILTKPFKOXP;I)V")
    public final void method164(int arg0, class59 arg1, int arg2) {
        this.field239 += arg0;
        if (arg2 == 197) {
            int var4 = arg1.method558((byte) 74);
            int var5 = arg1.method549(0);
            int var6 = var5 >> 2;
            int var7 = var5 & 3;
            int var8 = this.field401[var6];
            int var9 = arg1.method547(this.field642);
            int var10 = (var9 >> 4 & 7) + this.field636;
            int var11 = (var9 & 7) + this.field637;
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                this.method69(24210, var4, var7, 0, -1, var10, var6, var11, this.field417, var8);
            }
        } else if (arg2 == 145) {
            int var12 = arg1.method529();
            int var13 = (var12 >> 4 & 7) + this.field636;
            int var14 = (var12 & 7) + this.field637;
            int var15 = arg1.method531();
            int var16 = arg1.method529();
            int var17 = arg1.method531();
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                int var18 = var13 * 128 + 64;
                int var19 = var14 * 128 + 64;
                class2 var20 = new class2(this.method173(var18, this.field417, var19, this.field327) - var16, field493, var15, var19, this.field417, this.field298, var17, var18);
                this.field469.method506(var20);
            }
        } else if (arg2 == 110) {
            int var21 = arg1.method529();
            int var22 = (var21 >> 4 & 7) + this.field636;
            int var23 = (var21 & 7) + this.field637;
            int var24 = arg1.method531();
            int var25 = arg1.method531();
            int var26 = arg1.method531();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                class56 var27 = this.field594[this.field417][var22][var23];
                if (var27 != null) {
                    for (class15 var28 = (class15) var27.method509(); var28 != null; var28 = (class15) var27.method511(0)) {
                        if ((var24 & 32767) == var28.field747 && var28.field748 == var25) {
                            var28.field748 = var26;
                            break;
                        }
                    }
                    this.method152(var22, var23);
                }
            }
        } else if (arg2 == 16) {
            int var29 = arg1.method548(435);
            int var30 = (var29 >> 4 & 7) + this.field636;
            int var31 = (var29 & 7) + this.field637;
            int var32 = arg1.method529();
            int var33 = var32 >> 2;
            int var34 = var32 & 3;
            int var35 = this.field401[var33];
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                this.method69(24210, -1, var34, 0, -1, var30, var33, var31, this.field417, var35);
            }
        } else if (arg2 == 40) {
            int var36 = arg1.method558((byte) 74);
            int var37 = arg1.method531();
            int var38 = arg1.method557(false);
            int var39 = arg1.method549(0);
            int var40 = (var39 >> 4 & 7) + this.field636;
            int var41 = (var39 & 7) + this.field637;
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && this.field504 != var38) {
                class15 var42 = new class15();
                var42.field747 = var37;
                var42.field748 = var36;
                if (this.field594[this.field417][var40][var41] == null) {
                    this.field594[this.field417][var40][var41] = new class56(5);
                }
                this.field594[this.field417][var40][var41].method506(var42);
                this.method152(var40, var41);
            }
        } else {
            if (arg2 == 58) {
                int var43 = arg1.method557(false);
                int var44 = arg1.method547(this.field642);
                int var45 = var44 >> 2;
                int var46 = var44 & 3;
                int var47 = this.field401[var45];
                byte var48 = arg1.method550((byte) 84);
                int var49 = arg1.method531();
                int var50 = arg1.method547(this.field642);
                int var51 = (var50 >> 4 & 7) + this.field636;
                int var52 = (var50 & 7) + this.field637;
                byte var53 = arg1.method551((byte) 23);
                byte var54 = arg1.method552((byte) 8);
                int var55 = arg1.method556(false);
                int var56 = arg1.method556(false);
                byte var57 = arg1.method552((byte) 8);
                class58 var58;
                if (this.field504 == var43) {
                    var58 = field219;
                } else {
                    var58 = this.field440[var43];
                }
                if (var58 != null) {
                    class55 var59 = class55.method499(var55);
                    int var60 = this.field395[this.field417][var51][var52];
                    int var61 = this.field395[this.field417][var51 + 1][var52];
                    int var62 = this.field395[this.field417][var51 + 1][var52 + 1];
                    int var63 = this.field395[this.field417][var51][var52 + 1];
                    class45 var64 = var59.method496(var45, var46, var60, var61, var62, var63, -1);
                    if (var64 != null) {
                        this.method69(24210, -1, 0, var49 + 1, var56 + 1, var51, 0, var52, this.field417, var47);
                        var58.field1551 = field493 + var49;
                        var58.field1552 = field493 + var56;
                        var58.field1566 = var64;
                        int var65 = var59.field1469;
                        int var66 = var59.field1515;
                        if (var46 == 1 || var46 == 3) {
                            var65 = var59.field1515;
                            var66 = var59.field1469;
                        }
                        var58.field1563 = var51 * 128 + var65 * 64;
                        var58.field1565 = var52 * 128 + var66 * 64;
                        var58.field1564 = this.method173(var58.field1563, this.field417, var58.field1565, this.field327);
                        if (var54 > var53) {
                            byte var67 = var54;
                            var54 = var53;
                            var53 = var67;
                        }
                        if (var57 > var48) {
                            byte var68 = var57;
                            var57 = var48;
                            var48 = var68;
                        }
                        var58.field1546 = var51 + var54;
                        var58.field1548 = var51 + var53;
                        var58.field1547 = var52 + var57;
                        var58.field1549 = var48 + var52;
                    }
                }
            }
            if (arg2 == 142) {
                int var69 = arg1.method531();
                int var70 = arg1.method549(0);
                int var71 = (var70 >> 4 & 7) + this.field636;
                int var72 = (var70 & 7) + this.field637;
                int var73 = arg1.method556(false);
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                    class15 var74 = new class15();
                    var74.field747 = var73;
                    var74.field748 = var69;
                    if (this.field594[this.field417][var71][var72] == null) {
                        this.field594[this.field417][var71][var72] = new class56(5);
                    }
                    this.field594[this.field417][var71][var72].method506(var74);
                    this.method152(var71, var72);
                }
            } else {
                if (arg2 == 44) {
                    int var75 = arg1.method529();
                    int var76 = (var75 >> 4 & 7) + this.field636;
                    int var77 = (var75 & 7) + this.field637;
                    int var78 = arg1.method531();
                    int var79 = arg1.method529();
                    int var80 = var79 >> 4 & 15;
                    int var81 = var79 & 7;
                    if (field219.field62[0] >= var76 - var80 && field219.field62[0] <= var76 + var80 && field219.field63[0] >= var77 - var80 && field219.field63[0] <= var77 + var80 && this.field508 && !field544 && this.field361 < 50) {
                        this.field214[this.field361] = var78;
                        this.field387[this.field361] = var81;
                        this.field624[this.field361] = class53.field1405[var78];
                        ++this.field361;
                    }
                }
                if (arg2 == 33) {
                    int var82 = arg1.method548(435);
                    int var83 = var82 >> 2;
                    int var84 = var82 & 3;
                    int var85 = this.field401[var83];
                    int var86 = arg1.method558((byte) 74);
                    int var87 = arg1.method547(this.field642);
                    int var88 = (var87 >> 4 & 7) + this.field636;
                    int var89 = (var87 & 7) + this.field637;
                    if (var88 >= 0 && var89 >= 0 && var88 < 103 && var89 < 103) {
                        int var90 = this.field395[this.field417][var88][var89];
                        int var91 = this.field395[this.field417][var88 + 1][var89];
                        int var92 = this.field395[this.field417][var88 + 1][var89 + 1];
                        int var93 = this.field395[this.field417][var88][var89 + 1];
                        if (var85 == 0) {
                            class42 var94 = this.field434.method342(var89, var88, this.field417, this.field341);
                            if (var94 != null) {
                                int var95 = var94.field1242 >> 14 & 32767;
                                if (var83 == 2) {
                                    var94.field1240 = new class6(2, var93, var95, 2, var86, var92, var91, var90, false, var84 + 4);
                                    var94.field1241 = new class6(2, var93, var95, 2, var86, var92, var91, var90, false, var84 + 1 & 3);
                                } else {
                                    var94.field1240 = new class6(var83, var93, var95, 2, var86, var92, var91, var90, false, var84);
                                }
                            }
                        }
                        if (var85 == 1) {
                            class23 var96 = this.field434.method343(88, var88, var89, this.field417);
                            if (var96 != null) {
                                var96.field860 = new class6(4, var93, var96.field861 >> 14 & 32767, 2, var86, var92, var91, var90, false, 0);
                            }
                        }
                        if (var85 == 2) {
                            class14 var97 = this.field434.method344(var88, var89, 71, this.field417);
                            if (var83 == 11) {
                                var83 = 10;
                            }
                            if (var97 != null) {
                                var97.field736 = new class6(var83, var93, var97.field744 >> 14 & 32767, 2, var86, var92, var91, var90, false, var84);
                            }
                        }
                        if (var85 == 3) {
                            class48 var98 = this.field434.method345(var88, 156, this.field417, var89);
                            if (var98 != null) {
                                var98.field1359 = new class6(22, var93, var98.field1360 >> 14 & 32767, 2, var86, var92, var91, var90, false, var84);
                            }
                        }
                    }
                } else if (arg2 == 90) {
                    int var99 = arg1.method529();
                    int var100 = (var99 >> 4 & 7) + this.field636;
                    int var101 = (var99 & 7) + this.field637;
                    int var102 = var100 + arg1.method530();
                    int var103 = var101 + arg1.method530();
                    int var104 = arg1.method532();
                    int var105 = arg1.method531();
                    int var106 = arg1.method529() * 4;
                    int var107 = arg1.method529() * 4;
                    int var108 = arg1.method531();
                    int var109 = arg1.method531();
                    int var110 = arg1.method529();
                    int var111 = arg1.method529();
                    if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104 && var105 != 65535) {
                        int var112 = var100 * 128 + 64;
                        int var113 = var101 * 128 + 64;
                        int var114 = var102 * 128 + 64;
                        int var115 = var103 * 128 + 64;
                        class35 var116 = new class35(this.method173(var112, this.field417, var113, this.field327) - var106, var105, -940, field493 + var109, var111, var107, var110, var112, field493 + var108, this.field417, var104, var113);
                        var116.method377(var115, this.method173(var114, this.field417, var115, this.field327) - var107, var114, field493 + var108, -477);
                        this.field555.method506(var116);
                    }
                } else if (arg2 == 146) {
                    int var117 = arg1.method558((byte) 74);
                    int var118 = arg1.method547(this.field642);
                    int var119 = (var118 >> 4 & 7) + this.field636;
                    int var120 = (var118 & 7) + this.field637;
                    if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                        class56 var121 = this.field594[this.field417][var119][var120];
                        if (var121 != null) {
                            for (class15 var122 = (class15) var121.method509(); var122 != null; var122 = (class15) var121.method511(0)) {
                                if ((var117 & 32767) == var122.field747) {
                                    var122.method588();
                                    break;
                                }
                            }
                            if (var121.method509() == null) {
                                this.field594[this.field417][var119][var120] = null;
                            }
                            this.method152(var119, var120);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LTKPFKOXP;LTINBLEHZ;III)V")
    private final void method165(class59 arg0, class58 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < this.field577 || arg3 > this.field577) {
            this.field240 = arg0.method529();
        }
        if ((arg2 & 4) != 0) {
            arg1.field35 = arg0.method557(false);
            if (arg1.field35 == 65535) {
                arg1.field35 = -1;
            }
        }
        if ((arg2 & 32) != 0) {
            int var6 = arg0.method558((byte) 74);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg0.method549(0);
            if (arg1.field47 == var6 && var6 != -1) {
                int var8 = class34.field1140[var6].field1154;
                if (var8 == 1) {
                    arg1.field48 = 0;
                    arg1.field49 = 0;
                    arg1.field50 = var7;
                    arg1.field51 = 0;
                }
                if (var8 == 2) {
                    arg1.field51 = 0;
                }
            } else if (var6 == -1 || arg1.field47 == -1 || class34.field1140[var6].field1148 >= class34.field1140[arg1.field47].field1148) {
                arg1.field47 = var6;
                arg1.field48 = 0;
                arg1.field49 = 0;
                arg1.field50 = var7;
                arg1.field51 = 0;
                arg1.field52 = arg1.field44;
            }
        }
        if ((arg2 & 8) != 0) {
            arg1.field57 = arg0.method558((byte) 74);
            arg1.field58 = arg0.method531();
        }
        if ((arg2 & 64) != 0) {
            arg1.field43 = arg0.method536();
            if (arg1.field43.charAt(0) == '~') {
                arg1.field43 = arg1.field43.substring(1);
                this.method111(arg1.field43, 2, arg1.field1573, this.field382);
            } else if (field219 == arg1) {
                this.method111(arg1.field43, 2, arg1.field1573, this.field382);
            }
            arg1.field46 = 0;
            arg1.field42 = 0;
            arg1.field45 = 150;
        }
        if ((arg2 & 2) != 0) {
            int var9 = arg0.method557(false);
            int var10 = arg0.method548(435);
            int var11 = arg0.method529();
            int var12 = arg0.field1589;
            if (arg1.field1573 != null && arg1.field1559) {
                long var13 = class12.method182(arg1.field1573);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < this.field522; ++var16) {
                        if (this.field486[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && this.field578 == 0) {
                    try {
                        this.field429.field1589 = 0;
                        arg0.method567(7, 0, this.field429.field1588, var11);
                        this.field429.field1589 = 0;
                        String var17 = class68.method589(1, var11, this.field429);
                        String var18 = class28.method281(var17, false);
                        arg1.field43 = var18;
                        arg1.field46 = var9 >> 8;
                        arg1.field42 = var9 & 255;
                        arg1.field45 = 150;
                        if (var10 != 2 && var10 != 3) {
                            if (var10 == 1) {
                                this.method111(var18, 1, "@cr1@" + arg1.field1573, this.field382);
                            } else {
                                this.method111(var18, 2, arg1.field1573, this.field382);
                            }
                        } else {
                            this.method111(var18, 1, "@cr2@" + arg1.field1573, this.field382);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field1589 = var11 + var12;
        }
        if ((arg2 & 1024) != 0) {
            arg1.field20 = arg0.method557(false);
            int var20 = arg0.method566((byte) 112);
            arg1.field24 = var20 >> 16;
            arg1.field23 = (var20 & 65535) + field493;
            arg1.field21 = 0;
            arg1.field22 = 0;
            if (arg1.field23 > field493) {
                arg1.field21 = -1;
            }
            if (arg1.field20 == 65535) {
                arg1.field20 = -1;
            }
        }
        if ((arg2 & 512) != 0) {
            arg1.field67 = arg0.method529();
            arg1.field69 = arg0.method529();
            arg1.field68 = arg0.method529();
            arg1.field70 = arg0.method549(0);
            arg1.field71 = arg0.method531() + field493;
            arg1.field72 = arg0.method556(false) + field493;
            arg1.field73 = arg0.method529();
            arg1.method6(28123);
        }
        if ((arg2 & 16) != 0) {
            int var21 = arg0.method547(this.field642);
            int var22 = arg0.method549(0);
            arg1.method10(var21, field493, true, var22);
            arg1.field36 = field493 + 300;
            arg1.field37 = arg0.method547(this.field642);
            arg1.field38 = arg0.method529();
        }
        if ((arg2 & 128) != 0) {
            int var23 = arg0.method548(435);
            byte[] var24 = new byte[var23];
            class59 var25 = new class59(859, var24);
            arg0.method567(7, 0, var24, var23);
            this.field445[arg4] = var25;
            arg1.method516(var25, -43453);
        }
        if ((arg2 & 256) != 0) {
            int var26 = arg0.method548(435);
            int var27 = arg0.method548(435);
            arg1.method10(var26, field493, true, var27);
            arg1.field36 = field493 + 300;
            arg1.field37 = arg0.method547(this.field642);
            arg1.field38 = arg0.method549(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
    public final void method166(boolean arg0) {
        this.field428 &= arg0;
        this.field554.method518(1, true);
        if (this.field446 != -1) {
            this.method157(this.field446, 882);
            this.field446 = -1;
            this.field375 = true;
            this.field321 = false;
            this.field281 = true;
        }
        if (this.field468 != -1) {
            this.method157(this.field468, 882);
            this.field468 = -1;
            this.field305 = true;
            this.field321 = false;
        }
        if (this.field259 != -1) {
            this.method157(this.field259, 882);
            this.field259 = -1;
            this.field308 = true;
        }
        if (this.field309 != -1) {
            this.method157(this.field309, 882);
            this.field309 = -1;
        }
        if (this.field403 != -1) {
            this.method157(this.field403, 882);
            this.field403 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method167(int arg0, boolean arg1) {
        int var3 = class51.field1380[arg0].field1388;
        if (var3 != 0) {
            int var4 = this.field511[arg0];
            this.field428 &= arg1;
            if (var3 == 1) {
                if (var4 == 1) {
                    class22.method235(694, 0.9D);
                }
                if (var4 == 2) {
                    class22.method235(694, 0.8D);
                }
                if (var4 == 3) {
                    class22.method235(694, 0.7D);
                }
                if (var4 == 4) {
                    class22.method235(694, 0.6D);
                }
                class54.field1461.method415();
                this.field308 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field579;
                if (var4 == 0) {
                    this.method56(9, this.field579, 0);
                    this.field579 = true;
                }
                if (var4 == 1) {
                    this.method56(9, this.field579, -400);
                    this.field579 = true;
                }
                if (var4 == 2) {
                    this.method56(9, this.field579, -800);
                    this.field579 = true;
                }
                if (var4 == 3) {
                    this.method56(9, this.field579, -1200);
                    this.field579 = true;
                }
                if (var4 == 4) {
                    this.field579 = false;
                }
                if (this.field579 != var5 && !field544) {
                    if (this.field579) {
                        this.field528 = this.field586;
                        this.field529 = true;
                        this.field328.method208(2, this.field528);
                    } else {
                        this.method133(true);
                    }
                    this.field433 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field508 = true;
                    this.method67(false, 0);
                }
                if (var4 == 1) {
                    this.field508 = true;
                    this.method67(false, -400);
                }
                if (var4 == 2) {
                    this.field508 = true;
                    this.method67(false, -800);
                }
                if (var4 == 3) {
                    this.field508 = true;
                    this.method67(false, -1200);
                }
                if (var4 == 4) {
                    this.field508 = false;
                }
            }
            if (var3 == 5) {
                this.field598 = var4;
            }
            if (var3 == 6) {
                this.field325 = var4;
            }
            if (var3 == 8) {
                this.field371 = var4;
                this.field305 = true;
            }
            if (var3 == 9) {
                this.field266 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method168(int arg0) {
        this.field205 = null;
        this.field206 = null;
        this.field207 = null;
        this.field208 = null;
        this.field554 = null;
        this.field591 = null;
        this.field292 = null;
        this.field548 = null;
        this.field568 = null;
        this.field422 = null;
        this.field336 = null;
        this.field337 = null;
        this.field338 = null;
        this.field339 = null;
        this.field676 = null;
        this.field677 = null;
        this.field673 = null;
        this.field674 = null;
        this.field675 = null;
        this.field209 = null;
        if (arg0 == -41727) {
            this.field210 = null;
            this.field211 = null;
            this.field212 = null;
            this.field213 = null;
            try {
                if (this.field326 != null) {
                    this.field326.method468();
                }
            } catch (Exception var2) {
            }
            this.field326 = null;
            this.method133(true);
            this.field363 = null;
            this.field531 = null;
            this.field532 = null;
            this.field533 = null;
            this.field534 = null;
            this.field535 = null;
            this.field684 = null;
            this.field198 = null;
            this.field199 = null;
            this.field200 = null;
            this.field201 = null;
            this.field487 = null;
            this.field667 = null;
            this.field395 = null;
            this.field540 = null;
            this.field434 = null;
            this.field284 = null;
            this.field519 = null;
            this.field520 = null;
            this.field473 = null;
            this.field440 = null;
            this.field442 = null;
            this.field444 = null;
            this.field445 = null;
            this.field562 = null;
            this.field429 = null;
            this.field511 = null;
            this.field430 = null;
            this.field432 = null;
            this.field523 = null;
            this.field555 = null;
            this.field469 = null;
            this.field276 = null;
            this.field277 = null;
            this.field278 = null;
            this.field279 = null;
            this.field280 = null;
            this.field465 = null;
            this.field466 = null;
            this.field467 = null;
            this.field300 = null;
            this.field301 = null;
            this.field302 = null;
            this.field303 = null;
            this.field304 = null;
            if (this.field328 != null) {
                this.field328.method210();
            }
            this.field328 = null;
            this.field404 = null;
            this.field362 = null;
            this.field497 = null;
            this.field498 = null;
            this.field227 = null;
            this.field228 = null;
            this.field229 = null;
            this.field315 = null;
            this.field608 = null;
            this.field204 = null;
            this.field331 = null;
            this.field265 = null;
            this.field539 = null;
            this.field269 = null;
            this.field353 = null;
            this.field258 = null;
            this.field270 = null;
            this.field271 = null;
            this.field643 = null;
            this.field594 = null;
            this.field402 = null;
            this.field678 = null;
            this.field679 = null;
            this.field680 = null;
            this.field681 = null;
            this.field530 = null;
            this.field596 = null;
            if (this.field482 != null) {
                this.field482.field1366 = false;
            }
            this.field482 = null;
            this.field289 = null;
            this.field290 = null;
            this.field291 = null;
            this.method78(-182);
            class55.method495((byte) 7);
            class69.method594((byte) 7);
            class54.method485((byte) 7);
            class29.method318((byte) 7);
            class17.field761 = null;
            class44.field1258 = null;
            class39.field1212 = null;
            class34.field1140 = null;
            class24.field864 = null;
            class24.field876 = null;
            class51.field1380 = null;
            super.field889 = null;
            class58.field1556 = null;
            class22.method226((byte) 7);
            class30.method319((byte) 7);
            class45.method429((byte) 7);
            class47.method465((byte) 7);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (this.field499 == 0 && this.field345 == 0) {
            this.field487[this.field630] = "Walk here";
            this.field200[this.field630] = 113;
            this.field198[this.field630] = super.field896;
            this.field199[this.field630] = super.field897;
            ++this.field630;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class45.field1337; ++var3) {
            int var5 = class45.field1338[var3];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field434.method350(this.field417, var6, var7, var5) >= 0) {
                    class55 var10 = class55.method499(var9);
                    if (var10.field1516 != null) {
                        var10 = var10.method503(363);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field499 == 1) {
                        this.field487[this.field630] = "Use " + this.field503 + " with @cya@" + var10.field1506;
                        this.field200[this.field630] = 438;
                        this.field201[this.field630] = var5;
                        this.field198[this.field630] = var6;
                        this.field199[this.field630] = var7;
                        ++this.field630;
                    } else if (this.field345 == 1) {
                        if ((this.field347 & 4) == 4) {
                            this.field487[this.field630] = this.field348 + " @cya@" + var10.field1506;
                            this.field200[this.field630] = 918;
                            this.field201[this.field630] = var5;
                            this.field198[this.field630] = var6;
                            this.field199[this.field630] = var7;
                            ++this.field630;
                        }
                    } else {
                        if (var10.field1493 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1493[var11] != null) {
                                    this.field487[this.field630] = var10.field1493[var11] + " @cya@" + var10.field1506;
                                    if (var11 == 0) {
                                        this.field200[this.field630] = 479;
                                    }
                                    if (var11 == 1) {
                                        this.field200[this.field630] = 753;
                                    }
                                    if (var11 == 2) {
                                        this.field200[this.field630] = 202;
                                    }
                                    if (var11 == 3) {
                                        this.field200[this.field630] = 111;
                                    }
                                    if (var11 == 4) {
                                        this.field200[this.field630] = 1790;
                                    }
                                    this.field201[this.field630] = var5;
                                    this.field198[this.field630] = var6;
                                    this.field199[this.field630] = var7;
                                    ++this.field630;
                                }
                            }
                        }
                        this.field487[this.field630] = "Examine @cya@" + var10.field1506;
                        this.field200[this.field630] = 1083;
                        this.field201[this.field630] = var10.field1477 << 14;
                        this.field198[this.field630] = var6;
                        this.field199[this.field630] = var7;
                        ++this.field630;
                    }
                }
                if (var8 == 1) {
                    class71 var12 = this.field430[var9];
                    if (var12.field1737.field1716 == 1 && (var12.field30 & 127) == 64 && (var12.field31 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field431; ++var13) {
                            class71 var16 = this.field430[this.field432[var13]];
                            if (var16 != null && var12 != var16 && var16.field1737.field1716 == 1 && var12.field30 == var16.field30 && var12.field31 == var16.field31) {
                                this.method151(var6, var16.field1737, var7, (byte) 120, this.field432[var13]);
                            }
                        }
                        for (int var14 = 0; var14 < this.field441; ++var14) {
                            class58 var15 = this.field440[this.field442[var14]];
                            if (var15 != null && var12.field30 == var15.field30 && var12.field31 == var15.field31) {
                                this.method54(var15, var6, this.field442[var14], this.field537, var7);
                            }
                        }
                    }
                    this.method151(var6, var12.field1737, var7, (byte) 120, var9);
                }
                if (var8 == 0) {
                    class58 var17 = this.field440[var9];
                    if ((var17.field30 & 127) == 64 && (var17.field31 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field431; ++var18) {
                            class71 var21 = this.field430[this.field432[var18]];
                            if (var21 != null && var21.field1737.field1716 == 1 && var17.field30 == var21.field30 && var17.field31 == var21.field31) {
                                this.method151(var6, var21.field1737, var7, (byte) 120, this.field432[var18]);
                            }
                        }
                        for (int var19 = 0; var19 < this.field441; ++var19) {
                            class58 var20 = this.field440[this.field442[var19]];
                            if (var20 != null && var17 != var20 && var17.field30 == var20.field30 && var17.field31 == var20.field31) {
                                this.method54(var20, var6, this.field442[var19], this.field537, var7);
                            }
                        }
                    }
                    this.method54(var17, var6, var9, this.field537, var7);
                }
                if (var8 == 3) {
                    class56 var22 = this.field594[this.field417][var6][var7];
                    if (var22 != null) {
                        for (class15 var23 = (class15) var22.method510((byte) 61); var23 != null; var23 = (class15) var22.method512(this.field464)) {
                            class54 var24 = class54.method482(var23.field747);
                            if (this.field499 == 1) {
                                this.field487[this.field630] = "Use " + this.field503 + " with @lre@" + var24.field1422;
                                this.field200[this.field630] = 469;
                                this.field201[this.field630] = var23.field747;
                                this.field198[this.field630] = var6;
                                this.field199[this.field630] = var7;
                                ++this.field630;
                            } else if (this.field345 == 1) {
                                if ((this.field347 & 1) == 1) {
                                    this.field487[this.field630] = this.field348 + " @lre@" + var24.field1422;
                                    this.field200[this.field630] = 978;
                                    this.field201[this.field630] = var23.field747;
                                    this.field198[this.field630] = var6;
                                    this.field199[this.field630] = var7;
                                    ++this.field630;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1455 != null && var24.field1455[var25] != null) {
                                        this.field487[this.field630] = var24.field1455[var25] + " @lre@" + var24.field1422;
                                        if (var25 == 0) {
                                            this.field200[this.field630] = 882;
                                        }
                                        if (var25 == 1) {
                                            this.field200[this.field630] = 756;
                                        }
                                        if (var25 == 2) {
                                            this.field200[this.field630] = 420;
                                        }
                                        if (var25 == 3) {
                                            this.field200[this.field630] = 618;
                                        }
                                        if (var25 == 4) {
                                            this.field200[this.field630] = 233;
                                        }
                                        this.field201[this.field630] = var23.field747;
                                        this.field198[this.field630] = var6;
                                        this.field199[this.field630] = var7;
                                        ++this.field630;
                                    } else if (var25 == 2) {
                                        this.field487[this.field630] = "Take @lre@" + var24.field1422;
                                        this.field200[this.field630] = 420;
                                        this.field201[this.field630] = var23.field747;
                                        this.field198[this.field630] = var6;
                                        this.field199[this.field630] = var7;
                                        ++this.field630;
                                    }
                                }
                                this.field487[this.field630] = "Examine @lre@" + var24.field1422;
                                this.field200[this.field630] = 1936;
                                this.field201[this.field630] = var23.field747;
                                this.field198[this.field630] = var6;
                                this.field199[this.field630] = var7;
                                ++this.field630;
                            }
                        }
                    }
                }
            }
        }
        int var4 = 51 / arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LAQPBLKMD;II)V")
    public final void method170(class3 arg0, int arg1, int arg2) {
        if (arg2 != -29444) {
            this.method124();
        }
        this.method171(arg0.field30, 4, arg0.field31, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public final void method171(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
            int var5 = this.method173(arg0, this.field417, arg2, this.field327) - arg3;
            int var6 = arg0 - this.field193;
            int var7 = var5 - this.field194;
            int var8 = arg2 - this.field195;
            int var9 = class45.field1339[this.field196];
            int var10 = class45.field1340[this.field196];
            int var11 = class45.field1339[this.field197];
            int var12 = class45.field1340[this.field197];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (arg1 < 4 || arg1 > 4) {
                this.method124();
            }
            if (var17 >= 50) {
                this.field435 = (var13 << 9) / var17 + class22.field837;
                this.field436 = (var16 << 9) / var17 + class22.field838;
            } else {
                this.field435 = -1;
                this.field436 = -1;
            }
        } else {
            this.field435 = -1;
            this.field436 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
    public final void method172(boolean arg0) {
        class55.field1499.method415();
        this.field428 &= arg0;
        class55.field1510.method415();
        class69.field1702.method415();
        class54.field1425.method415();
        class54.field1461.method415();
        class58.field1556.method415();
        class24.field876.method415();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public final int method173(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field540[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg2 & 127;
            int var10 = (128 - var8) * this.field395[var7][var5][var6] + this.field395[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field395[var7][var5][var6 + 1] + this.field395[var7][var5 + 1][var6 + 1] * var8 >> 7;
            if (arg3 != 0) {
                this.field240 = -1;
            }
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
    public final boolean method174(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field434.method350(this.field417, arg0, arg2, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method49(0, 0, field219.field63[0], field219.field62[0], var8, arg0, (byte) 9, var7 + 1, arg2, 2, 0, true);
            } else {
                class55 var9 = class55.method499(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1515;
                    var11 = var9.field1469;
                } else {
                    var10 = var9.field1469;
                    var11 = var9.field1515;
                }
                int var12 = var9.field1513;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method49(var10, var12, field219.field63[0], field219.field62[0], 0, arg0, (byte) 9, 0, arg2, 2, var11, true);
            }
            this.field254 = super.field903;
            this.field255 = super.field904;
            this.field257 = 2;
            this.field256 = 0;
            int var13 = 23 / arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ILTKPFKOXP;I)V")
    private final void method175(int arg0, class59 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field443; ++var4) {
            int var5 = this.field444[var4];
            class58 var6 = this.field440[var5];
            int var7 = arg1.method529();
            if ((var7 & 1) != 0) {
                var7 += arg1.method529() << 8;
            }
            this.method165(arg1, var6, var7, 1, var5);
        }
        if (arg2 <= 0) {
            this.field323 = 37;
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method176(byte arg0) {
        if (this.field351 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field478 == 0) {
            int var3 = super.field902;
            if (this.field345 == 1 && super.field903 >= 516 && super.field904 >= 160 && super.field903 <= 765 && super.field904 <= 205) {
                var3 = 0;
            }
            if (this.field589) {
                if (var3 != 1) {
                    int var4 = super.field896;
                    int var5 = super.field897;
                    if (this.field260 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field260 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field260 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field261 - 10 || var4 > this.field263 + this.field261 + 10 || var5 < this.field262 - 10 || var5 > this.field264 + this.field262 + 10) {
                        this.field589 = false;
                        if (this.field260 == 1) {
                            this.field375 = true;
                        }
                        if (this.field260 == 2) {
                            this.field305 = true;
                        }
                    }
                }
                if (var3 == 1) {
                    int var6 = this.field261;
                    int var7 = this.field262;
                    int var8 = this.field263;
                    int var9 = super.field903;
                    int var10 = super.field904;
                    if (this.field260 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field260 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field260 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field630; ++var12) {
                        int var13 = (this.field630 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method62(-701, var11);
                    }
                    this.field589 = false;
                    if (this.field260 == 1) {
                        this.field375 = true;
                    }
                    if (this.field260 == 2) {
                        this.field305 = true;
                        return;
                    }
                }
            } else {
                if (var3 == 1 && this.field630 > 0) {
                    int var14 = this.field200[this.field630 - 1];
                    if (var14 == 352 || var14 == 839 || var14 == 561 || var14 == 240 || var14 == 648 || var14 == 724 || var14 == 660 || var14 == 228 || var14 == 633 || var14 == 103 || var14 == 440 || var14 == 1251) {
                        int var15 = this.field198[this.field630 - 1];
                        int var16 = this.field199[this.field630 - 1];
                        class29 var17 = class29.method311(var16);
                        if (var17.field995 || var17.field1004) {
                            this.field244 = false;
                            this.field631 = 0;
                            this.field476 = var16;
                            this.field477 = var15;
                            this.field478 = 2;
                            this.field479 = super.field903;
                            this.field480 = super.field904;
                            if (class29.method311(var16).field1012 == this.field403) {
                                this.field478 = 1;
                            }
                            if (class29.method311(var16).field1012 == this.field468) {
                                this.field478 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var3 == 1 && (this.field598 == 1 || this.method113(-42569, this.field630 - 1)) && this.field630 > 2) {
                    var3 = 2;
                }
                if (var3 == 1 && this.field630 > 0) {
                    this.method62(-701, this.field630 - 1);
                }
                if (var3 != 2 || this.field630 <= 0) {
                    return;
                }
                this.method35(this.field514);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIJNDWVIL;Z)V")
    public final void method177(class29 arg0, boolean arg1) {
        int var3 = arg0.field1008;
        this.field428 &= arg1;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field418;
                if (this.field419 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field972 = "";
                    arg0.field1007 = 0;
                } else {
                    if (this.field422[var3] == 0) {
                        arg0.field972 = "@red@Offline";
                    } else if (this.field422[var3] < 200) {
                        if (this.field422[var3] == field541) {
                            arg0.field972 = "@gre@World" + (this.field422[var3] - 9);
                        } else {
                            arg0.field972 = "@yel@World" + (this.field422[var3] - 9);
                        }
                    } else if (this.field422[var3] == field541) {
                        arg0.field972 = "@gre@Classic" + (this.field422[var3] - 219);
                    } else {
                        arg0.field972 = "@yel@Classic" + (this.field422[var3] - 219);
                    }
                    arg0.field1007 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field418;
                if (this.field419 != 2) {
                    var6 = 0;
                }
                arg0.field981 = var6 * 15 + 20;
                if (arg0.field981 <= arg0.field1000) {
                    arg0.field981 = arg0.field1000 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field419 == 0) {
                    arg0.field972 = "Loading ignore list";
                    arg0.field1007 = 0;
                } else if (var3 == 1 && this.field419 == 0) {
                    arg0.field972 = "Please wait...";
                    arg0.field1007 = 0;
                } else {
                    int var7 = this.field522;
                    if (this.field419 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field972 = "";
                        arg0.field1007 = 0;
                    } else {
                        arg0.field972 = class12.method186(class12.method183(39082, this.field486[var3]), 7139);
                        arg0.field1007 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field981 = this.field522 * 15 + 20;
                if (arg0.field981 <= arg0.field1000) {
                    arg0.field981 = arg0.field1000 + 1;
                }
            } else if (var3 == 327) {
                arg0.field986 = 150;
                arg0.field987 = (int) (Math.sin((double) field493 / 40.0D) * 256.0D) & 2047;
                if (this.field606) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field329[var8];
                        if (var15 >= 0 && !class44.field1258[var15].method425((byte) -32)) {
                            return;
                        }
                    }
                    this.field606 = false;
                    class45[] var9 = new class45[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field329[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class44.field1258[var14].method426(937);
                        }
                    }
                    class45 var12 = new class45(var10, (byte) -112, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field360[var13] != 0) {
                            var12.method447(field356[var13][0], field356[var13][this.field360[var13]]);
                            if (var13 == 1) {
                                var12.method447(field306[0], field306[this.field360[var13]]);
                            }
                        }
                    }
                    var12.method440(474);
                    var12.method441((byte) 9, class34.field1140[field219.field65].field1142[0]);
                    var12.method450(64, 850, -30, -50, -30, true);
                    arg0.field1002 = 5;
                    arg0.field1003 = 0;
                    class29.method317(0, var12, 42896, 5);
                }
            } else if (var3 == 324) {
                if (this.field574 == null) {
                    this.field574 = arg0.field1025;
                    this.field575 = arg0.field967;
                }
                if (this.field525) {
                    arg0.field1025 = this.field575;
                } else {
                    arg0.field1025 = this.field574;
                }
            } else if (var3 == 325) {
                if (this.field574 == null) {
                    this.field574 = arg0.field1025;
                    this.field575 = arg0.field967;
                }
                if (this.field525) {
                    arg0.field1025 = this.field574;
                } else {
                    arg0.field1025 = this.field575;
                }
            } else if (var3 == 600) {
                arg0.field972 = this.field296;
                if (field493 % 20 < 10) {
                    arg0.field972 = arg0.field972 + "|";
                } else {
                    arg0.field972 = arg0.field972 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field620 >= 1) {
                        if (this.field572) {
                            arg0.field999 = 16711680;
                            arg0.field972 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field999 = 16777215;
                            arg0.field972 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field972 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field231 - this.field423;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg0.field972 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field526 == 0) {
                        arg0.field972 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field526 <= this.field231) {
                        arg0.field972 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method178(0, this.field526);
                    } else {
                        int var18 = this.field231 + 14 - this.field526;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg0.field972 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method178(0, this.field526) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field582 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field582 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field582 + " unread messages";
                    }
                    arg0.field972 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field510 > 0 && this.field510 <= this.field231 + 10) {
                        arg0.field972 = "Last password change:\\n@gre@" + this.method178(0, this.field510);
                    } else {
                        arg0.field972 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field397 > 2 && !field543) {
                        arg0.field972 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field397 > 2) {
                        arg0.field972 = "\\n\\nYou have @gre@" + this.field397 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field397 > 0) {
                        arg0.field972 = "You have @gre@" + this.field397 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field972 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field397 > 2 && !field543) {
                        arg0.field972 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field397 > 0) {
                        arg0.field972 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field972 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field526 > this.field231) {
                        arg0.field972 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field972 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field419 == 0) {
            arg0.field972 = "Loading friend list";
            arg0.field1007 = 0;
        } else if (var3 == 1 && this.field419 == 1) {
            arg0.field972 = "Connecting to friendserver";
            arg0.field1007 = 0;
        } else if (var3 == 2 && this.field419 != 2) {
            arg0.field972 = "Please wait...";
            arg0.field1007 = 0;
        } else {
            int var4 = this.field418;
            if (this.field419 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field972 = "";
                arg0.field1007 = 0;
            } else {
                arg0.field972 = this.field548[var3];
                arg0.field1007 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(II)Ljava/lang/String;")
    public final String method178(int arg0, int arg1) {
        if (arg1 > this.field231 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            if (arg0 != 0) {
                this.field240 = this.field292.method529();
            }
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLTKPFKOXP;)V")
    private final void method179(int arg0, byte arg1, class59 arg2) {
        if (arg1 != 8) {
            this.field554.method519(95);
        }
        arg2.method539((byte) 5);
        int var4 = arg2.method540(1, true);
        if (var4 != 0) {
            int var5 = arg2.method540(2, true);
            if (var5 == 0) {
                this.field444[this.field443++] = this.field439;
            } else if (var5 == 1) {
                int var6 = arg2.method540(3, true);
                field219.method9(var6, true, false);
                int var7 = arg2.method540(1, true);
                if (var7 == 1) {
                    this.field444[this.field443++] = this.field439;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method540(3, true);
                field219.method9(var8, true, true);
                int var9 = arg2.method540(3, true);
                field219.method9(var9, true, true);
                int var10 = arg2.method540(1, true);
                if (var10 == 1) {
                    this.field444[this.field443++] = this.field439;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method540(7, true);
                int var12 = arg2.method540(1, true);
                int var13 = arg2.method540(1, true);
                if (var13 == 1) {
                    this.field444[this.field443++] = this.field439;
                }
                int var14 = arg2.method540(7, true);
                this.field417 = arg2.method540(2, true);
                field219.method7(var14, var12 == 1, var11, false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILIJNDWVIL;IIIIII)V")
    public final void method180(int arg0, class29 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1.field1014 == 0 && arg1.field994 != null && !arg1.field1010) {
            if (arg6 >= arg0 && arg7 >= arg5 && arg6 <= arg1.field975 + arg0 && arg7 <= arg1.field1000 + arg5) {
                int var9 = arg1.field994.length;
                if (arg4 >= 0) {
                    this.field268 = !this.field268;
                }
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg1.field992[var10] + arg0;
                    int var12 = arg1.field1020[var10] + arg5 - arg3;
                    class29 var13 = class29.method311(arg1.field994[var10]);
                    int var14 = var13.field974 + var11;
                    int var15 = var13.field979 + var12;
                    if ((var13.field993 >= 0 || var13.field965 != 0) && arg6 >= var14 && arg7 >= var15 && arg6 < var13.field975 + var14 && arg7 < var13.field1000 + var15) {
                        if (var13.field993 >= 0) {
                            this.field230 = var13.field993;
                        } else {
                            this.field230 = var13.field983;
                        }
                    }
                    if (var13.field1014 == 8 && arg6 >= var14 && arg7 >= var15 && arg6 < var13.field975 + var14 && arg7 < var13.field1000 + var15) {
                        this.field253 = var13.field983;
                    }
                    if (var13.field1014 == 0) {
                        this.method180(var14, var13, arg2, var13.field976, this.field590, var15, arg6, arg7);
                        if (var13.field981 > var13.field1000) {
                            this.method140(true, var13.field1000, var15, var13.field981, arg7, arg2, arg6, var13.field975 + var14, var13);
                        }
                    } else {
                        if (var13.field1007 == 1 && arg6 >= var14 && arg7 >= var15 && arg6 < var13.field975 + var14 && arg7 < var13.field1000 + var15) {
                            boolean var16 = false;
                            if (var13.field1008 != 0) {
                                var16 = this.method65(var13, 3);
                            }
                            if (!var16) {
                                this.field487[this.field630] = var13.field952;
                                this.field200[this.field630] = 138;
                                this.field199[this.field630] = var13.field983;
                                ++this.field630;
                            }
                        }
                        if (var13.field1007 == 2 && this.field345 == 0 && arg6 >= var14 && arg7 >= var15 && arg6 < var13.field975 + var14 && arg7 < var13.field1000 + var15) {
                            String var17 = var13.field969;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field487[this.field630] = var17 + " @gre@" + var13.field971;
                            this.field200[this.field630] = 266;
                            this.field199[this.field630] = var13.field983;
                            ++this.field630;
                        }
                        if (var13.field1007 == 3 && arg6 >= var14 && arg7 >= var15 && arg6 < var13.field975 + var14 && arg7 < var13.field1000 + var15) {
                            this.field487[this.field630] = "Close";
                            if (arg2 == 3) {
                                this.field200[this.field630] = 908;
                            } else {
                                this.field200[this.field630] = 768;
                            }
                            this.field199[this.field630] = var13.field983;
                            ++this.field630;
                        }
                        if (var13.field1007 == 4 && arg6 >= var14 && arg7 >= var15 && arg6 < var13.field975 + var14 && arg7 < var13.field1000 + var15) {
                            this.field487[this.field630] = var13.field952;
                            this.field200[this.field630] = 98;
                            this.field199[this.field630] = var13.field983;
                            ++this.field630;
                        }
                        if (var13.field1007 == 5 && arg6 >= var14 && arg7 >= var15 && arg6 < var13.field975 + var14 && arg7 < var13.field1000 + var15) {
                            this.field487[this.field630] = var13.field952;
                            this.field200[this.field630] = 436;
                            this.field199[this.field630] = var13.field983;
                            ++this.field630;
                        }
                        if (var13.field1007 == 6 && !this.field321 && arg6 >= var14 && arg7 >= var15 && arg6 < var13.field975 + var14 && arg7 < var13.field1000 + var15) {
                            this.field487[this.field630] = var13.field952;
                            this.field200[this.field630] = 221;
                            this.field199[this.field630] = var13.field983;
                            ++this.field630;
                        }
                        if (var13.field1014 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1000; ++var19) {
                                for (int var20 = 0; var20 < var13.field975; ++var20) {
                                    int var21 = (var13.field1001 + 32) * var20 + var14;
                                    int var22 = (var13.field988 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1021[var18];
                                        var22 += var13.field1024[var18];
                                    }
                                    if (arg6 >= var21 && arg7 >= var22 && arg6 < var21 + 32 && arg7 < var22 + 32) {
                                        this.field357 = var18;
                                        this.field358 = var13.field983;
                                        if (var13.field998[var18] > 0) {
                                            class54 var23 = class54.method482(var13.field998[var18] - 1);
                                            if (this.field499 == 1 && var13.field1005) {
                                                if (this.field501 != var13.field983 || this.field500 != var18) {
                                                    this.field487[this.field630] = "Use " + this.field503 + " with @lre@" + var23.field1422;
                                                    this.field200[this.field630] = 280;
                                                    this.field201[this.field630] = var23.field1440;
                                                    this.field198[this.field630] = var18;
                                                    this.field199[this.field630] = var13.field983;
                                                    ++this.field630;
                                                }
                                            } else if (this.field345 == 1 && var13.field1005) {
                                                if ((this.field347 & 16) == 16) {
                                                    this.field487[this.field630] = this.field348 + " @lre@" + var23.field1422;
                                                    this.field200[this.field630] = 417;
                                                    this.field201[this.field630] = var23.field1440;
                                                    this.field198[this.field630] = var18;
                                                    this.field199[this.field630] = var13.field983;
                                                    ++this.field630;
                                                }
                                            } else {
                                                if (var13.field1005) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1414 != null && var23.field1414[var24] != null) {
                                                            this.field487[this.field630] = var23.field1414[var24] + " @lre@" + var23.field1422;
                                                            if (var24 == 3) {
                                                                this.field200[this.field630] = 633;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field200[this.field630] = 103;
                                                            }
                                                            this.field201[this.field630] = var23.field1440;
                                                            this.field198[this.field630] = var18;
                                                            this.field199[this.field630] = var13.field983;
                                                            ++this.field630;
                                                        } else if (var24 == 4) {
                                                            this.field487[this.field630] = "Drop @lre@" + var23.field1422;
                                                            this.field200[this.field630] = 103;
                                                            this.field201[this.field630] = var23.field1440;
                                                            this.field198[this.field630] = var18;
                                                            this.field199[this.field630] = var13.field983;
                                                            ++this.field630;
                                                        }
                                                    }
                                                }
                                                if (var13.field977) {
                                                    this.field487[this.field630] = "Use @lre@" + var23.field1422;
                                                    this.field200[this.field630] = 440;
                                                    this.field201[this.field630] = var23.field1440;
                                                    this.field198[this.field630] = var18;
                                                    this.field199[this.field630] = var13.field983;
                                                    ++this.field630;
                                                }
                                                if (var13.field1005 && var23.field1414 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1414[var25] != null) {
                                                            this.field487[this.field630] = var23.field1414[var25] + " @lre@" + var23.field1422;
                                                            if (var25 == 0) {
                                                                this.field200[this.field630] = 724;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field200[this.field630] = 660;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field200[this.field630] = 228;
                                                            }
                                                            this.field201[this.field630] = var23.field1440;
                                                            this.field198[this.field630] = var18;
                                                            this.field199[this.field630] = var13.field983;
                                                            ++this.field630;
                                                        }
                                                    }
                                                }
                                                if (var13.field1013 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1013[var26] != null) {
                                                            this.field487[this.field630] = var13.field1013[var26] + " @lre@" + var23.field1422;
                                                            if (var26 == 0) {
                                                                this.field200[this.field630] = 352;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field200[this.field630] = 839;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field200[this.field630] = 561;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field200[this.field630] = 240;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field200[this.field630] = 648;
                                                            }
                                                            this.field201[this.field630] = var23.field1440;
                                                            this.field198[this.field630] = var18;
                                                            this.field199[this.field630] = var13.field983;
                                                            ++this.field630;
                                                        }
                                                    }
                                                }
                                                this.field487[this.field630] = "Examine @lre@" + var23.field1422;
                                                this.field200[this.field630] = 1251;
                                                this.field201[this.field630] = var23.field1440;
                                                this.field198[this.field630] = var18;
                                                this.field199[this.field630] = var13.field983;
                                                ++this.field630;
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

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field374[var1] = var0 / 4;
        }
        field461 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field491 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field496 = 37470;
        field541 = 10;
        field543 = true;
        field587 = 8;
        field619 = -34;
        field632 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field632[var3] = var2 - 1;
            var2 += var2;
        }
        field634 = -55;
    }
}
