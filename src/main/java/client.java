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
public class client extends class15 {

    @OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
    private int[] field73 = new int[50];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field76 = 1;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
    private boolean field78 = true;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
    private boolean field79 = false;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "LQQMJEFXK;")
    private class44 field82 = new class44();

    @OriginalMember(owner = "client!client", name = "X", descriptor = "[LWSNKRVXZ;")
    private class66[] field85 = new class66[32];

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
    private boolean field86 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljava/lang/String;")
    private String field92 = "";

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    public int[] field96 = new int[1000];

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field97 = 5;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    private final int field98 = 100;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
    private int[] field99 = new int[100];

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    private int field113 = -1;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Ljava/lang/String;")
    private String field115 = "";

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field116 = -1;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "LWNCFPLWV;")
    private class63 field119 = class63.method490(1, 0);

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
    private boolean field121 = false;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
    private int field133 = -1;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field135 = 2;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
    private int field136 = 128;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field140 = -1;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "LWAPMJSJO;")
    private class61 field141 = new class61(field211);

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "[LWSNKRVXZ;")
    private class66[] field143 = new class66[32];

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
    private int field144 = 7759444;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
    private int[] field145 = new int[7];

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field154 = 9;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "Ljava/lang/String;")
    private String field155 = "";

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "[Ljava/lang/String;")
    private String[] field157 = new String[100];

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
    private int[] field158 = new int[100];

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
    private boolean field160 = false;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
    private boolean field161 = false;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
    private int[] field162 = new int[151];

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "Z")
    public boolean field175 = false;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field177 = -971;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
    private boolean field178 = false;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
    private boolean field184 = false;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "Z")
    public boolean field186 = true;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int field187 = 78;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "LWAPMJSJO;")
    private class61 field200 = new class61(field211);

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
    private boolean field202 = false;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "[LSSCICQYX;")
    private class52[] field208 = new class52[2];

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "[J")
    private long[] field210 = new long[200];

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
    private int[] field213 = new int[256];

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
    private int field214 = -462;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private int field217 = -420;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field218 = -438;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field219 = -529;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field221 = -34942;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
    private int[] field222 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
    private int[] field223 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
    private boolean field224 = false;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field225 = -290;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "[LSSCICQYX;")
    private class52[] field226 = new class52[100];

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field241 = 547;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field242 = -447;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
    public int[] field243 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "de", descriptor = "Z")
    private boolean field247 = false;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "Z")
    private boolean field248 = false;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "[J")
    private long[] field249 = new long[100];

    @OriginalMember(owner = "client!client", name = "je", descriptor = "I")
    private int field253 = 4;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
    private int[] field259 = new int[5];

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "B")
    private byte field260 = 96;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private int field263 = -1;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field266 = 2;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
    private boolean field267 = true;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    private int field268 = 560;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "B")
    private byte field269 = 0;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field271 = 2;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/lang/String;")
    private String field279 = "";

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "Ljava/lang/String;")
    private String field280 = "";

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private int field281 = 2048;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field282 = 2047;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "[LWQWDCUWR;")
    private class65[] field283 = new class65[this.field281];

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
    public int[] field285 = new int[this.field281];

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
    private int[] field287 = new int[this.field281];

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "[LWNCFPLWV;")
    private class63[] field288 = new class63[this.field281];

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
    private int[] field293 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
    private int[] field294 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
    private int[] field296 = new int[5];

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "B")
    private byte field297 = 113;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "LWAPMJSJO;")
    private class61 field300 = new class61(field211);

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
    private boolean field302 = false;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "Z")
    private boolean field305 = true;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "[LTUZTEZTO;")
    public class53[] field306 = new class53[5];

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "[LWSNKRVXZ;")
    private class66[] field307 = new class66[1000];

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "B")
    private byte field308 = 2;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "[Ljava/lang/String;")
    private String[] field309 = new String[5];

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "[Z")
    private boolean[] field310 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "Z")
    private volatile boolean field316 = false;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
    private volatile boolean field317 = false;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
    private int[] field319 = new int[5];

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field320 = -1;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    private int field321 = 2301979;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
    private volatile boolean field324 = false;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
    private int field326 = 3;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "[LSSCICQYX;")
    private class52[] field332 = new class52[13];

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field342 = -868;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private int field344 = -1;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "B")
    private byte field346 = 14;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field347 = 843;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field348 = -1;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int field349 = 602;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
    private int[] field350 = new int[class31.field939];

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "Z")
    private boolean field355 = false;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "Ljava/lang/String;")
    private String field356 = "";

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "B")
    private byte field357 = 8;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
    private int[] field359 = new int[50];

    @OriginalMember(owner = "client!client", name = "og", descriptor = "I")
    private int field361 = -1;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
    private int[] field362 = new int[100];

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "[Ljava/lang/String;")
    private String[] field363 = new String[100];

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "[Ljava/lang/String;")
    private String[] field364 = new String[100];

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
    private boolean field366 = false;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "[LWSNKRVXZ;")
    private class66[] field370 = new class66[32];

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "[LWSNKRVXZ;")
    private class66[] field377 = new class66[8];

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field381 = -902;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
    private boolean field385 = false;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field388 = 50;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
    private int[] field389 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
    private int[] field390 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
    private int[] field391 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
    private int[] field392 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
    private int[] field393 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
    private int[] field394 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
    private int[] field395 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "[Ljava/lang/String;")
    private String[] field396 = new String[this.field388];

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
    private int[] field397 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "[LWSNKRVXZ;")
    private class66[] field399 = new class66[20];

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private int field400 = -1;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "B")
    private byte field416 = 12;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
    private boolean field421 = false;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "[[I")
    private int[][] field423 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
    private int field430 = 1;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "[B")
    private byte[] field431 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int field432 = 673;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "[Ljava/lang/String;")
    private String[] field433 = new String[500];

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
    private int[] field441 = new int[50];

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "[Ljava/lang/String;")
    private String[] field442 = new String[200];

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field444 = 3;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field445 = -1;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
    private boolean field447 = false;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private int field448 = -1;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
    private int field449 = -1;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
    private int[] field450 = new int[33];

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
    private boolean field453 = false;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
    private final int[] field457 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "Ljava/lang/String;")
    private String field460 = "";

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "Ljava/lang/String;")
    private String field461 = "";

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
    private boolean field463 = false;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "[LFUVVWALN;")
    private class13[] field468 = new class13[4];

    @OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
    private int[] field469 = new int[200];

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
    private boolean field471 = false;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private int field472 = -1;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
    private int[] field474 = new int[151];

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
    private int[] field475 = new int[class31.field939];

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
    private boolean field481 = false;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "LWNCFPLWV;")
    private class63 field483 = class63.method490(1, 0);

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "[[[I")
    private int[][][] field485 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "LWNCFPLWV;")
    private class63 field486 = new class63((byte) -58, new byte[5000]);

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "[LUGARWYIU;")
    private class55[] field487 = new class55[16384];

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
    public int[] field489 = new int[16384];

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
    private int[] field493 = new int[class31.field939];

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
    private int[] field495 = new int[9];

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
    private int[] field497 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "Z")
    private boolean field498 = true;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "B")
    private byte field499 = 34;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
    private int[] field500 = new int[5];

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "Z")
    private boolean field502 = false;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "[LWSNKRVXZ;")
    private class66[] field510 = new class66[100];

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
    private int field512 = 790;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "Z")
    private boolean field515 = false;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field517 = 9;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
    private int[] field523 = new int[500];

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "[I")
    private int[] field524 = new int[500];

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
    private int[] field525 = new int[500];

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
    private int[] field526 = new int[500];

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field532 = -1;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
    private int field533 = -1;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
    public int[] field534 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "Ljava/lang/String;")
    private String field535 = "";

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field536 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "Z")
    private boolean field537 = true;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "[Z")
    private boolean[] field541 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
    private int field542 = -521;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private int field543 = 987;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "[[I")
    private int[][] field545 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field547 = 5063219;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "Z")
    private boolean field549 = false;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "Ljava/lang/String;")
    private String field550 = "";

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
    private int[] field556 = new int[5];

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
    private int field557 = 916;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "LWNCFPLWV;")
    private class63 field558 = class63.method490(1, 0);

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "[[[LWAPMJSJO;")
    private class61[][][] field559 = new class61[4][104][104];

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "[I")
    private int[] field560 = new int[2000];

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field561 = 3353893;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[[I")
    private int[][] field562 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "[I")
    private int[] field563 = new int[33];

    @OriginalMember(owner = "client!client", name = "ok", descriptor = "Z")
    private boolean field569 = false;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "B")
    private static byte field100 = 1;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
    public static int[] field114 = new int[32];

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field122;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
    private static int field146;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "Z")
    private static boolean field148;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
    private static int[] field181;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "B")
    private static byte field211;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "[[I")
    public static final int[][] field277;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field298;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "B")
    private static byte field378;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private static int field428;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "Ljava/lang/String;")
    private static String field456;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
    private static int field482;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "[I")
    public static final int[] field490;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private static int field103;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    private int field125;

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
    private int field131;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private static int field254;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private static int field327;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private static int field345;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private static int field358;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private static int field379;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private static int field386;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
    private static int field425;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
    private static int field427;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private static int field462;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private static int field470;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private static int field491;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private static int field492;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
    private static int field538;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private static int field548;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
    private static int field568;

    @OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    private static int field81;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "J")
    public long field151;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "J")
    private long field173;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "J")
    private long field278;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "J")
    private long field516;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "J")
    private long field554;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "LGYXQUUFC;")
    private class17 field311;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "LGYXQUUFC;")
    private class17 field312;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "LGYXQUUFC;")
    private class17 field313;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "LGYXQUUFC;")
    private class17 field314;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "LGYXQUUFC;")
    private class17 field333;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "LGYXQUUFC;")
    private class17 field334;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "LGYXQUUFC;")
    private class17 field335;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "LGYXQUUFC;")
    private class17 field336;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "LGYXQUUFC;")
    private class17 field337;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "LGYXQUUFC;")
    private class17 field338;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "LGYXQUUFC;")
    private class17 field339;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "LGYXQUUFC;")
    private class17 field340;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "LGYXQUUFC;")
    private class17 field341;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "LGYXQUUFC;")
    private class17 field407;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "LGYXQUUFC;")
    private class17 field408;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "LGYXQUUFC;")
    private class17 field409;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "LGYXQUUFC;")
    private class17 field410;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "LGYXQUUFC;")
    private class17 field411;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "LGYXQUUFC;")
    private class17 field412;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "LGYXQUUFC;")
    private class17 field413;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "LGYXQUUFC;")
    private class17 field414;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "LGYXQUUFC;")
    private class17 field415;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "LGYXQUUFC;")
    private class17 field464;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "LGYXQUUFC;")
    private class17 field465;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "LGYXQUUFC;")
    private class17 field466;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "LHKGQPBYJ;")
    private class21 field544;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "LIKKPZVXM;")
    public class23 field93;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "LKDQJDBED;")
    private class29 field152;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "LMCPCRICF;")
    private class35 field452;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "LRPFMUSNN;")
    private class49 field451;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "LBTJUXBKR;")
    private class4 field417;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "LBTJUXBKR;")
    private class4 field418;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "LBTJUXBKR;")
    private class4 field419;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "LBTJUXBKR;")
    private class4 field420;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "LSSCICQYX;")
    private class52 field188;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "LSSCICQYX;")
    private class52 field189;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "LSSCICQYX;")
    private class52 field195;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "LSSCICQYX;")
    private class52 field196;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "LSSCICQYX;")
    private class52 field197;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "LSSCICQYX;")
    private class52 field198;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "LSSCICQYX;")
    private class52 field199;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "LSSCICQYX;")
    private class52 field203;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "LSSCICQYX;")
    private class52 field204;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "LSSCICQYX;")
    private class52 field374;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "LSSCICQYX;")
    private class52 field375;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "LSSCICQYX;")
    private class52 field376;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "LSSCICQYX;")
    private class52 field434;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "LSSCICQYX;")
    private class52 field435;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "LSSCICQYX;")
    private class52 field436;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "LSSCICQYX;")
    private class52 field437;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "LSSCICQYX;")
    private class52 field438;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "LSSCICQYX;")
    private class52 field505;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "LSSCICQYX;")
    private class52 field506;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "LSSCICQYX;")
    private class52 field507;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "LVAVAOKUB;")
    private class59 field484;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "LWQWDCUWR;")
    public static class65 field398;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "LWSNKRVXZ;")
    private class66 field215;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "LWSNKRVXZ;")
    private class66 field216;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "LWSNKRVXZ;")
    private class66 field239;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "LWSNKRVXZ;")
    private class66 field240;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "LWSNKRVXZ;")
    private class66 field262;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "LWSNKRVXZ;")
    private class66 field272;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "LWSNKRVXZ;")
    private class66 field273;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "LWSNKRVXZ;")
    private class66 field274;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "LWSNKRVXZ;")
    private class66 field275;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "LWSNKRVXZ;")
    private class66 field276;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "LWSNKRVXZ;")
    private class66 field291;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "LWSNKRVXZ;")
    private class66 field322;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "LWSNKRVXZ;")
    private class66 field454;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "LWSNKRVXZ;")
    private class66 field458;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "LWSNKRVXZ;")
    private class66 field459;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "Ljava/lang/String;")
    public String field194;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "Ljava/lang/String;")
    private String field237;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "Ljava/lang/String;")
    private String field380;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "Ljava/lang/String;")
    public String field567;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "Ljava/net/Socket;")
    private Socket field508;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    public static boolean field104;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
    private static boolean field149;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "Z")
    public static boolean field258;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
    private static boolean field371;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
    private static boolean field94;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
    private int[] field108;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
    private int[] field109;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
    private int[] field111;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
    private int[] field227;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
    private int[] field228;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
    private int[] field229;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
    private int[] field230;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
    private int[] field232;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
    private int[] field233;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
    private int[] field234;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
    private int[] field250;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
    private int[] field251;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
    private int[] field353;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "[I")
    private int[] field354;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "[LSSCICQYX;")
    private class52[] field443;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "[[B")
    private byte[][] field150;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "[[B")
    private byte[][] field244;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[[[B")
    private byte[][][] field255;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "[[[I")
    private int[][][] field539;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method27(int arg0) {
        if (arg0 != 6) {
            this.field268 = this.field152.method317();
        }
        if (this.field509 == 0) {
            int var2 = super.field775 / 2 - 80;
            int var3 = super.field776 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field791 == 1 && super.field792 >= var2 - 75 && super.field792 <= var2 + 75 && super.field793 >= var14 - 20 && super.field793 <= var14 + 20) {
                this.field509 = 3;
                this.field360 = 0;
            }
            int var4 = super.field775 / 2 + 80;
            if (super.field791 == 1 && super.field792 >= var4 - 75 && super.field792 <= var4 + 75 && super.field793 >= var14 - 20 && super.field793 <= var14 + 20) {
                this.field460 = "";
                this.field461 = "Enter your username & password.";
                this.field509 = 2;
                this.field360 = 0;
            }
        } else if (this.field509 == 2) {
            int var5 = super.field776 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field791 == 1 && super.field793 >= var16 - 15 && super.field793 < var16) {
                this.field360 = 0;
            }
            var5 = var16 + 15;
            if (super.field791 == 1 && super.field793 >= var5 - 15 && super.field793 < var5) {
                this.field360 = 1;
            }
            var5 += 15;
            int var6 = super.field775 / 2 - 80;
            int var7 = super.field776 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field791 == 1 && super.field792 >= var6 - 75 && super.field792 <= var6 + 75 && super.field793 >= var17 - 20 && super.field793 <= var17 + 20) {
                this.field467 = 0;
                this.method47(this.field279, this.field280, false);
                if (this.field175) {
                    return;
                }
            }
            int var8 = super.field775 / 2 + 80;
            if (super.field791 == 1 && super.field792 >= var8 - 75 && super.field792 <= var8 + 75 && super.field793 >= var17 - 20 && super.field793 <= var17 + 20) {
                this.field509 = 0;
                this.field279 = "";
                this.field280 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method244(this.field543);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field456.length(); ++var11) {
                        if (var9 == field456.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field360 == 0) {
                        if (var9 == 8 && this.field279.length() > 0) {
                            this.field279 = this.field279.substring(0, this.field279.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field360 = 1;
                        }
                        if (var10) {
                            this.field279 = this.field279 + (char) var9;
                        }
                        if (this.field279.length() > 12) {
                            this.field279 = this.field279.substring(0, 12);
                        }
                    } else if (this.field360 == 1) {
                        if (var9 == 8 && this.field280.length() > 0) {
                            this.field280 = this.field280.substring(0, this.field280.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field360 = 0;
                        }
                        if (var10) {
                            this.field280 = this.field280 + (char) var9;
                        }
                        if (this.field280.length() > 20) {
                            this.field280 = this.field280.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field509 == 3) {
                int var12 = super.field775 / 2;
                int var13 = super.field776 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field791 == 1 && super.field792 >= var12 - 75 && super.field792 <= var12 + 75 && super.field793 >= var18 - 20 && super.field793 <= var18 + 20) {
                    this.field509 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBLBJGOYLYN;)V")
    public final void method28(int arg0, int arg1, int arg2, byte arg3, class2 arg4) {
        if (this.field552 < 400) {
            if (arg4.field38 != null) {
                arg4 = arg4.method6(324);
            }
            if (arg4 != null) {
                if (arg4.field23) {
                    String var6 = arg4.field30;
                    if (arg3 != 2) {
                        this.method102();
                    }
                    if (arg4.field42 != 0) {
                        var6 = var6 + method115((byte) -45, arg4.field42, field398.field1637) + " (level-" + arg4.field42 + ")";
                    }
                    if (this.field190 == 1) {
                        this.field433[this.field552] = "Use " + this.field194 + " with @yel@" + var6;
                        this.field525[this.field552] = 625;
                        this.field526[this.field552] = arg2;
                        this.field523[this.field552] = arg1;
                        this.field524[this.field552] = arg0;
                        ++this.field552;
                    } else {
                        if (this.field564 == 1) {
                            if ((this.field566 & 2) == 2) {
                                this.field433[this.field552] = this.field567 + " @yel@" + var6;
                                this.field525[this.field552] = 959;
                                this.field526[this.field552] = arg2;
                                this.field523[this.field552] = arg1;
                                this.field524[this.field552] = arg0;
                                ++this.field552;
                                return;
                            }
                        } else {
                            if (arg4.field34 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg4.field34[var7] != null && !arg4.field34[var7].equalsIgnoreCase("attack")) {
                                        this.field433[this.field552] = arg4.field34[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field525[this.field552] = 884;
                                        }
                                        if (var7 == 1) {
                                            this.field525[this.field552] = 316;
                                        }
                                        if (var7 == 2) {
                                            this.field525[this.field552] = 369;
                                        }
                                        if (var7 == 3) {
                                            this.field525[this.field552] = 825;
                                        }
                                        if (var7 == 4) {
                                            this.field525[this.field552] = 708;
                                        }
                                        this.field526[this.field552] = arg2;
                                        this.field523[this.field552] = arg1;
                                        this.field524[this.field552] = arg0;
                                        ++this.field552;
                                    }
                                }
                            }
                            if (arg4.field34 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg4.field34[var8] != null && arg4.field34[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg4.field42 > field398.field1637) {
                                            var9 = 2000;
                                        }
                                        this.field433[this.field552] = arg4.field34[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field525[this.field552] = var9 + 884;
                                        }
                                        if (var8 == 1) {
                                            this.field525[this.field552] = var9 + 316;
                                        }
                                        if (var8 == 2) {
                                            this.field525[this.field552] = var9 + 369;
                                        }
                                        if (var8 == 3) {
                                            this.field525[this.field552] = var9 + 825;
                                        }
                                        if (var8 == 4) {
                                            this.field525[this.field552] = var9 + 708;
                                        }
                                        this.field526[this.field552] = arg2;
                                        this.field523[this.field552] = arg1;
                                        this.field524[this.field552] = arg0;
                                        ++this.field552;
                                    }
                                }
                            }
                            this.field433[this.field552] = "Examine @yel@" + var6;
                            this.field525[this.field552] = 1250;
                            this.field526[this.field552] = arg2;
                            this.field523[this.field552] = arg1;
                            this.field524[this.field552] = arg0;
                            ++this.field552;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method29(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field235; ++var3) {
                if (arg0.equalsIgnoreCase(this.field442[var3])) {
                    return true;
                }
            }
            if (arg1 == 5) {
                boolean var4 = false;
                return arg0.equalsIgnoreCase(field398.field1628);
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field484 == null) {
            return false;
        } else {
            try {
                int var3 = this.field484.method476();
                if (var3 == 0) {
                    return false;
                }
                if (this.field164 == -1) {
                    this.field484.method477(this.field119.field1570, 0, 1);
                    this.field164 = this.field119.field1570[0] & 255;
                    if (this.field152 != null) {
                        this.field164 = this.field164 - this.field152.method317() & 255;
                    }
                    this.field163 = class27.field926[this.field164];
                    --var3;
                }
                if (this.field163 == -1) {
                    if (var3 <= 0) {
                        return false;
                    }
                    this.field484.method477(this.field119.field1570, 0, 1);
                    this.field163 = this.field119.field1570[0] & 255;
                    --var3;
                }
                if (this.field163 == -2) {
                    if (var3 <= 1) {
                        return false;
                    }
                    this.field484.method477(this.field119.field1570, 0, 2);
                    this.field119.field1571 = 0;
                    this.field163 = this.field119.method504();
                    var3 -= 2;
                }
                if (var3 < this.field163) {
                    return false;
                }
                this.field119.field1571 = 0;
                this.field484.method477(this.field119.field1570, 0, this.field163);
                this.field165 = 0;
                this.field107 = this.field106;
                this.field106 = this.field105;
                this.field105 = this.field164;
                if (this.field164 == 189) {
                    int var4 = this.field119.method530(255);
                    class44.method397(var4).field1200 = 3;
                    if (field398.field1638 == null) {
                        class44.method397(var4).field1201 = (field398.field1629[11] << 5) + (field398.field1629[8] << 10) + (field398.field1629[0] << 15) + (field398.field1634[0] << 25) + (field398.field1634[4] << 20) + field398.field1629[1];
                    } else {
                        class44.method397(var4).field1201 = (int) (field398.field1638.field26 + 305419896L);
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 80) {
                    int var5 = this.field119.method505();
                    int var6 = this.field119.method529((byte) 6);
                    int var7 = this.field119.method533(true);
                    class44 var8 = class44.method397(var6);
                    var8.field1265 = var5;
                    var8.field1237 = var7;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 143) {
                    int var9 = this.field119.method531(4);
                    String var10 = this.field119.method509();
                    class44.method397(var9).field1250 = var10;
                    int var10001 = this.field397[this.field444];
                    if (class44.method397(var9).field1216 == var10001) {
                        this.field178 = true;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 29) {
                    int var11 = this.field119.method531(4);
                    class44 var12 = class44.method397(var11);
                    for (int var13 = 0; var13 < var12.field1233.length; ++var13) {
                        var12.field1233[var13] = -1;
                        var12.field1233[var13] = 0;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 147) {
                    int var14 = this.field119.method504();
                    boolean var15 = this.field119.method521(true) == 1;
                    class44.method397(var14).field1236 = var15;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 46) {
                    if (this.field444 == 12) {
                        this.field178 = true;
                    }
                    this.field343 = this.field119.method502();
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 139) {
                    this.field176 = this.field119.method502();
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 214) {
                    int var16 = this.field119.method532((byte) 8);
                    if (this.field448 != var16) {
                        this.method54(6, this.field448);
                        this.field448 = var16;
                    }
                    this.field79 = true;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 7) {
                    String var17 = this.field119.method509();
                    int var18 = this.field119.method502();
                    int var19 = this.field119.method522(0);
                    if (var18 >= 1 && var18 <= 5) {
                        if (var17.equalsIgnoreCase("null")) {
                            var17 = null;
                        }
                        this.field309[var18 - 1] = var17;
                        this.field310[var18 - 1] = var19 == 0;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 184) {
                    this.field178 = true;
                    int var20 = this.field119.method504();
                    class44 var21 = class44.method397(var20);
                    while (this.field119.field1571 < this.field163) {
                        int var22 = this.field119.method516();
                        int var23 = this.field119.method504();
                        int var24 = this.field119.method502();
                        if (var24 == 255) {
                            var24 = this.field119.method507();
                        }
                        if (var22 >= 0 && var22 < var21.field1233.length) {
                            var21.field1233[var22] = var23;
                            var21.field1211[var22] = var24;
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 237) {
                    long var25 = this.field119.method508((byte) 0);
                    int var27 = this.field119.method502();
                    String var28 = class19.method290(true, class19.method287(false, var25));
                    for (int var29 = 0; var29 < this.field235; ++var29) {
                        if (this.field210[var29] == var25) {
                            if (this.field469[var29] != var27) {
                                this.field469[var29] = var27;
                                this.field178 = true;
                                if (var27 > 0) {
                                    this.method44(5, "", var28 + " has logged in.", (byte) 1);
                                }
                                if (var27 == 0) {
                                    this.method44(5, "", var28 + " has logged out.", (byte) 1);
                                }
                            }
                            var28 = null;
                            break;
                        }
                    }
                    if (var28 != null && this.field235 < 200) {
                        this.field210[this.field235] = var25;
                        this.field442[this.field235] = var28;
                        this.field469[this.field235] = var27;
                        ++this.field235;
                        this.field178 = true;
                    }
                    boolean var30 = false;
                    while (!var30) {
                        var30 = true;
                        for (int var31 = 0; var31 < this.field235 - 1; ++var31) {
                            if (this.field469[var31] != field146 && this.field469[var31 + 1] == field146 || this.field469[var31] == 0 && this.field469[var31 + 1] != 0) {
                                int var32 = this.field469[var31];
                                this.field469[var31] = this.field469[var31 + 1];
                                this.field469[var31 + 1] = var32;
                                String var33 = this.field442[var31];
                                this.field442[var31] = this.field442[var31 + 1];
                                this.field442[var31 + 1] = var33;
                                long var34 = this.field210[var31];
                                this.field210[var31] = this.field210[var31 + 1];
                                this.field210[var31 + 1] = var34;
                                this.field178 = true;
                                var30 = false;
                            }
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 17) {
                    int var36 = this.field119.method505();
                    if (var36 >= 0) {
                        this.method118(var36, false);
                    }
                    if (this.field445 != var36) {
                        this.method54(6, this.field445);
                        this.field445 = var36;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 190) {
                    int var37 = this.field119.method532((byte) 8);
                    int var38 = this.field119.method531(4);
                    class44 var39 = class44.method397(var38);
                    if (var39.field1202 != var37 || var37 == -1) {
                        var39.field1202 = var37;
                        var39.field1253 = 0;
                        var39.field1229 = 0;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 186) {
                    byte var40 = this.field119.method524(false);
                    int var41 = this.field119.method530(255);
                    this.field560[var41] = var40;
                    if (this.field534[var41] != var40) {
                        this.field534[var41] = var40;
                        this.method95(var41, 0);
                        this.field178 = true;
                        if (this.field448 != -1) {
                            this.field79 = true;
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 18) {
                    this.field207 = this.field119.method522(0);
                    this.field206 = this.field119.method522(0);
                    for (int var42 = this.field206; var42 < this.field206 + 8; ++var42) {
                        for (int var43 = this.field207; var43 < this.field207 + 8; ++var43) {
                            if (this.field559[this.field205][var42][var43] != null) {
                                this.field559[this.field205][var42][var43] = null;
                                this.method113(var42, var43);
                            }
                        }
                    }
                    for (class26 var44 = (class26) this.field300.method485(); var44 != null; var44 = (class26) this.field300.method487(6)) {
                        if (var44.field915 >= this.field206 && var44.field915 < this.field206 + 8 && var44.field916 >= this.field207 && var44.field916 < this.field207 + 8 && this.field205 == var44.field913) {
                            var44.field917 = 0;
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 137) {
                    this.field289 = 0;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 250) {
                    int var45 = this.field119.method530(255);
                    int var46 = this.field119.method520(-37135);
                    if (var45 == 65535) {
                        var45 = -1;
                    }
                    if (this.field397[var46] != var45) {
                        this.method54(6, this.field397[var46]);
                        this.field397[var46] = var45;
                    }
                    this.field178 = true;
                    this.field184 = true;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 207) {
                    this.field264 = this.field119.method531(4);
                    this.field496 = this.field119.method529((byte) 6);
                    this.field439 = this.field119.method531(4);
                    this.field426 = this.field119.method529((byte) 6);
                    this.field132 = this.field119.method536(-445);
                    this.field119.method530(255);
                    this.field220 = this.field119.method530(255);
                    this.field518 = this.field119.method529((byte) 6);
                    this.field120 = this.field119.method529((byte) 6);
                    this.field119.method521(true);
                    this.field182 = this.field119.method504();
                    signlink.dnslookup(class19.method289(this.field132, (byte) 7));
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 62) {
                    this.field236 = this.field119.method502();
                    this.field178 = true;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 255) {
                    int var47 = this.field119.method504();
                    int var48 = this.field119.method529((byte) 6);
                    this.method118(var47, false);
                    if (var48 != -1) {
                        this.method118(var48, false);
                    }
                    if (this.field361 != -1) {
                        this.method54(6, this.field361);
                        this.field361 = -1;
                    }
                    if (this.field263 != -1) {
                        this.method54(6, this.field263);
                        this.field263 = -1;
                    }
                    if (this.field116 != -1) {
                        this.method54(6, this.field116);
                        this.field116 = -1;
                    }
                    if (this.field449 != var47) {
                        this.method54(6, this.field449);
                        this.field449 = var47;
                    }
                    if (this.field348 != var47) {
                        this.method54(6, this.field348);
                        this.field348 = var48;
                    }
                    this.field511 = 0;
                    this.field161 = false;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 236) {
                    int var49 = this.field119.method504();
                    int var50 = this.field119.method537(this.field432);
                    this.field560[var49] = var50;
                    if (this.field534[var49] != var50) {
                        this.field534[var49] = var50;
                        this.method95(var49, 0);
                        this.field178 = true;
                        if (this.field448 != -1) {
                            this.field79 = true;
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 231) {
                    for (int var51 = 0; var51 < this.field534.length; ++var51) {
                        if (this.field560[var51] != this.field534[var51]) {
                            this.field534[var51] = this.field560[var51];
                            this.method95(var51, 0);
                            this.field178 = true;
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 64) {
                    this.field472 = this.field119.method504();
                    this.field80 = this.field119.method502();
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 192) {
                    int var52 = this.field119.method531(4);
                    int var53 = this.field119.method504();
                    class44.method397(var52).field1200 = 2;
                    class44.method397(var52).field1201 = var53;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 134) {
                    this.field207 = this.field119.method502();
                    this.field206 = this.field119.method522(0);
                    while (this.field119.field1571 < this.field163) {
                        int var54 = this.field119.method502();
                        this.method149(var54, this.field119, false);
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 59) {
                    int var55 = this.field119.method504();
                    this.method118(var55, false);
                    if (this.field116 != -1) {
                        this.method54(6, this.field116);
                        this.field116 = -1;
                        this.field79 = true;
                    }
                    if (this.field449 != -1) {
                        this.method54(6, this.field449);
                        this.field449 = -1;
                        this.field202 = true;
                    }
                    if (this.field348 != -1) {
                        this.method54(6, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field361 != -1) {
                        this.method54(6, this.field361);
                        this.field361 = -1;
                    }
                    if (this.field263 != var55) {
                        this.method54(6, this.field263);
                        this.field263 = var55;
                    }
                    if (this.field511 != 0) {
                        this.field511 = 0;
                        this.field79 = true;
                    }
                    this.field178 = true;
                    this.field184 = true;
                    this.field161 = false;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 217) {
                    long var56 = this.field119.method508((byte) 0);
                    int var58 = this.field119.method507();
                    int var59 = this.field119.method502();
                    boolean var60 = false;
                    for (int var61 = 0; var61 < 100; ++var61) {
                        if (this.field99[var61] == var58) {
                            var60 = true;
                            break;
                        }
                    }
                    if (var59 <= 1) {
                        for (int var62 = 0; var62 < this.field553; ++var62) {
                            if (this.field249[var62] == var56) {
                                var60 = true;
                                break;
                            }
                        }
                    }
                    if (!var60 && this.field117 == 0) {
                        try {
                            this.field99[this.field424] = var58;
                            this.field424 = (this.field424 + 1) % 100;
                            String var63 = class30.method320(this.field163 - 13, this.field119, -21362);
                            if (var59 != 3) {
                                var63 = class18.method258(var63, true);
                            }
                            if (var59 != 2 && var59 != 3) {
                                if (var59 == 1) {
                                    this.method44(7, "@cr1@" + class19.method290(true, class19.method287(false, var56)), var63, (byte) 1);
                                } else {
                                    this.method44(3, class19.method290(true, class19.method287(false, var56)), var63, (byte) 1);
                                }
                            } else {
                                this.method44(7, "@cr2@" + class19.method290(true, class19.method287(false, var56)), var63, (byte) 1);
                            }
                        } catch (Exception var191) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 168) {
                    this.field178 = true;
                    int var65 = this.field119.method520(-37135);
                    int var66 = this.field119.method520(-37135);
                    int var67 = this.field119.method507();
                    this.field493[var65] = var67;
                    this.field475[var65] = var66;
                    this.field350[var65] = 1;
                    for (int var68 = 0; var68 < 98; ++var68) {
                        if (var67 >= field181[var68]) {
                            this.field350[var65] = var68 + 2;
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 203 || this.field164 == 89) {
                    int var69 = this.field245;
                    int var70 = this.field246;
                    if (this.field164 == 203) {
                        var69 = this.field119.method529((byte) 6);
                        var70 = this.field119.method530(255);
                        this.field453 = false;
                    }
                    if (this.field164 == 89) {
                        var70 = this.field119.method530(255);
                        this.field119.method512(255);
                        int var71 = 0;
                        while (true) {
                            if (var71 >= 4) {
                                this.field119.method514(-18093);
                                var69 = this.field119.method531(4);
                                this.field453 = true;
                                break;
                            }
                            for (int var72 = 0; var72 < 13; ++var72) {
                                for (int var73 = 0; var73 < 13; ++var73) {
                                    int var74 = this.field119.method513(1, 0);
                                    if (var74 == 1) {
                                        this.field485[var71][var72][var73] = this.field119.method513(26, 0);
                                    } else {
                                        this.field485[var71][var72][var73] = -1;
                                    }
                                }
                            }
                            ++var71;
                        }
                    }
                    if (this.field245 == var69 && this.field246 == var70 && this.field551 == 2) {
                        this.field164 = -1;
                        return true;
                    }
                    this.field245 = var69;
                    this.field246 = var70;
                    this.field328 = (this.field245 - 6) * 8;
                    this.field329 = (this.field246 - 6) * 8;
                    this.field447 = false;
                    if ((this.field245 / 8 == 48 || this.field245 / 8 == 49) && this.field246 / 8 == 48) {
                        this.field447 = true;
                    }
                    if (this.field245 / 8 == 48 && this.field246 / 8 == 148) {
                        this.field447 = true;
                    }
                    this.field551 = 1;
                    this.field516 = System.currentTimeMillis();
                    this.method50((byte) -95, "Loading - please wait.", (String) null);
                    if (this.field164 == 203) {
                        int var75 = 0;
                        int var76 = (this.field245 - 6) / 8;
                        label1210: while (true) {
                            if (var76 > (this.field245 + 6) / 8) {
                                this.field244 = new byte[var75][];
                                this.field150 = new byte[var75][];
                                this.field232 = new int[var75];
                                this.field233 = new int[var75];
                                this.field234 = new int[var75];
                                int var78 = 0;
                                int var79 = (this.field245 - 6) / 8;
                                while (true) {
                                    if (var79 > (this.field245 + 6) / 8) {
                                        break label1210;
                                    }
                                    for (int var80 = (this.field246 - 6) / 8; var80 <= (this.field246 + 6) / 8; ++var80) {
                                        this.field232[var78] = (var79 << 8) + var80;
                                        if (this.field447 && (var80 == 49 || var80 == 149 || var80 == 147 || var79 == 50 || var79 == 49 && var80 == 47)) {
                                            this.field233[var78] = -1;
                                            this.field234[var78] = -1;
                                            ++var78;
                                        } else {
                                            int var81 = this.field233[var78] = this.field544.method298(-45861, var79, 0, var80);
                                            if (var81 != -1) {
                                                this.field544.method309(3, var81);
                                            }
                                            int var82 = this.field234[var78] = this.field544.method298(-45861, var79, 1, var80);
                                            if (var82 != -1) {
                                                this.field544.method309(3, var82);
                                            }
                                            ++var78;
                                        }
                                    }
                                    ++var79;
                                }
                            }
                            for (int var77 = (this.field246 - 6) / 8; var77 <= (this.field246 + 6) / 8; ++var77) {
                                ++var75;
                            }
                            ++var76;
                        }
                    }
                    if (this.field164 == 89) {
                        int var83 = 0;
                        int[] var84 = new int[676];
                        int var85 = 0;
                        label1171: while (true) {
                            if (var85 >= 4) {
                                this.field244 = new byte[var83][];
                                this.field150 = new byte[var83][];
                                this.field232 = new int[var83];
                                this.field233 = new int[var83];
                                this.field234 = new int[var83];
                                int var93 = 0;
                                while (true) {
                                    if (var93 >= var83) {
                                        break label1171;
                                    }
                                    int var94 = this.field232[var93] = var84[var93];
                                    int var95 = var94 >> 8 & 255;
                                    int var96 = var94 & 255;
                                    int var97 = this.field233[var93] = this.field544.method298(-45861, var95, 0, var96);
                                    if (var97 != -1) {
                                        this.field544.method309(3, var97);
                                    }
                                    int var98 = this.field234[var93] = this.field544.method298(-45861, var95, 1, var96);
                                    if (var98 != -1) {
                                        this.field544.method309(3, var98);
                                    }
                                    ++var93;
                                }
                            }
                            for (int var86 = 0; var86 < 13; ++var86) {
                                for (int var87 = 0; var87 < 13; ++var87) {
                                    int var88 = this.field485[var85][var86][var87];
                                    if (var88 != -1) {
                                        int var89 = var88 >> 14 & 1023;
                                        int var90 = var88 >> 3 & 2047;
                                        int var91 = (var89 / 8 << 8) + var90 / 8;
                                        for (int var92 = 0; var92 < var83; ++var92) {
                                            if (var84[var92] == var91) {
                                                var91 = -1;
                                                break;
                                            }
                                        }
                                        if (var91 != -1) {
                                            var84[var83++] = var91;
                                        }
                                    }
                                }
                            }
                            ++var85;
                        }
                    }
                    int var99 = this.field328 - this.field330;
                    int var100 = this.field329 - this.field331;
                    this.field330 = this.field328;
                    this.field331 = this.field329;
                    for (int var101 = 0; var101 < 16384; ++var101) {
                        class55 var102 = this.field487[var101];
                        if (var102 != null) {
                            for (int var103 = 0; var103 < 10; ++var103) {
                                var102.field1324[var103] -= var99;
                                var102.field1325[var103] -= var100;
                            }
                            var102.field1344 -= var99 * 128;
                            var102.field1345 -= var100 * 128;
                        }
                    }
                    for (int var104 = 0; var104 < this.field281; ++var104) {
                        class65 var105 = this.field283[var104];
                        if (var105 != null) {
                            for (int var106 = 0; var106 < 10; ++var106) {
                                var105.field1324[var106] -= var99;
                                var105.field1325[var106] -= var100;
                            }
                            var105.field1344 -= var99 * 128;
                            var105.field1345 -= var100 * 128;
                        }
                    }
                    this.field421 = true;
                    byte var107 = 0;
                    byte var108 = 104;
                    byte var109 = 1;
                    if (var99 < 0) {
                        var107 = 103;
                        var108 = -1;
                        var109 = -1;
                    }
                    byte var110 = 0;
                    byte var111 = 104;
                    byte var112 = 1;
                    if (var100 < 0) {
                        var110 = 103;
                        var111 = -1;
                        var112 = -1;
                    }
                    for (int var113 = var107; var108 != var113; var113 += var109) {
                        for (int var114 = var110; var111 != var114; var114 += var112) {
                            int var115 = var99 + var113;
                            int var116 = var100 + var114;
                            for (int var117 = 0; var117 < 4; ++var117) {
                                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                                    this.field559[var117][var113][var114] = this.field559[var117][var115][var116];
                                } else {
                                    this.field559[var117][var113][var114] = null;
                                }
                            }
                        }
                    }
                    for (class26 var118 = (class26) this.field300.method485(); var118 != null; var118 = (class26) this.field300.method487(6)) {
                        var118.field915 -= var99;
                        var118.field916 -= var100;
                        if (var118.field915 < 0 || var118.field916 < 0 || var118.field915 >= 104 || var118.field916 >= 104) {
                            var118.method327();
                        }
                    }
                    if (this.field289 != 0) {
                        this.field289 -= var99;
                        this.field290 -= var100;
                    }
                    this.field121 = false;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 92) {
                    int var119 = this.field119.method531(4);
                    int var120 = this.field119.method530(255);
                    int var121 = var119 >> 10 & 31;
                    int var122 = var119 >> 5 & 31;
                    int var123 = var119 & 31;
                    class44.method397(var120).field1269 = (var123 << 3) + (var121 << 19) + (var122 << 11);
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 252) {
                    int var124 = this.field119.method504();
                    int var125 = this.field119.method502();
                    int var126 = this.field119.method504();
                    if (var126 == 65535) {
                        if (this.field422 < 50) {
                            this.field359[this.field422] = (short) var124;
                            this.field73[this.field422] = var125;
                            this.field441[this.field422] = 0;
                            ++this.field422;
                        }
                    } else if (this.field305 && !field149 && this.field422 < 50) {
                        this.field359[this.field422] = var124;
                        this.field73[this.field422] = var125;
                        this.field441[this.field422] = class58.field1508[var124] + var126;
                        ++this.field422;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 155) {
                    this.field153 = this.field119.method502();
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 132) {
                    this.field121 = false;
                    for (int var127 = 0; var127 < 5; ++var127) {
                        this.field541[var127] = false;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 220) {
                    this.field446 = this.field119.method531(4) * 30;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 194) {
                    int var128 = this.field119.method529((byte) 6);
                    this.method118(var128, false);
                    if (this.field263 != -1) {
                        this.method54(6, this.field263);
                        this.field263 = -1;
                        this.field178 = true;
                        this.field184 = true;
                    }
                    if (this.field116 != -1) {
                        this.method54(6, this.field116);
                        this.field116 = -1;
                        this.field79 = true;
                    }
                    if (this.field449 != -1) {
                        this.method54(6, this.field449);
                        this.field449 = -1;
                        this.field202 = true;
                    }
                    if (this.field348 != -1) {
                        this.method54(6, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field361 != var128) {
                        this.method54(6, this.field361);
                        this.field361 = var128;
                    }
                    if (this.field511 != 0) {
                        this.field511 = 0;
                        this.field79 = true;
                    }
                    this.field161 = false;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 19) {
                    this.method107(this.field119, this.field163, 0);
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 187) {
                    this.method49((byte) 3);
                    this.field164 = -1;
                    return false;
                }
                if (this.field164 == 165) {
                    for (int var129 = 0; var129 < this.field283.length; ++var129) {
                        if (this.field283[var129] != null) {
                            this.field283[var129].field1311 = -1;
                        }
                    }
                    for (int var130 = 0; var130 < this.field487.length; ++var130) {
                        if (this.field487[var130] != null) {
                            this.field487[var130].field1311 = -1;
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 14) {
                    if (this.field444 == 12) {
                        this.field178 = true;
                    }
                    this.field369 = this.field119.method505();
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 216) {
                    this.field113 = this.field119.method522(0);
                    if (this.field444 == this.field113) {
                        if (this.field113 == 3) {
                            this.field444 = 1;
                        } else {
                            this.field444 = 3;
                        }
                        this.field178 = true;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 111) {
                    this.method42(this.field119, this.field163, (byte) 3);
                    this.field421 = false;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 63) {
                    this.field160 = false;
                    this.field511 = 1;
                    this.field550 = "";
                    this.field79 = true;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 116) {
                    if (this.field263 != -1) {
                        this.method54(6, this.field263);
                        this.field263 = -1;
                        this.field178 = true;
                        this.field184 = true;
                    }
                    if (this.field116 != -1) {
                        this.method54(6, this.field116);
                        this.field116 = -1;
                        this.field79 = true;
                    }
                    if (this.field449 != -1) {
                        this.method54(6, this.field449);
                        this.field449 = -1;
                        this.field202 = true;
                    }
                    if (this.field348 != -1) {
                        this.method54(6, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field361 != -1) {
                        this.method54(6, this.field361);
                        this.field361 = -1;
                    }
                    if (this.field511 != 0) {
                        this.field511 = 0;
                        this.field79 = true;
                    }
                    this.field161 = false;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 108) {
                    int var131 = this.field119.method529((byte) 6);
                    if (var131 == 65535) {
                        var131 = -1;
                    }
                    if (this.field133 != var131 && this.field498 && !field149 && this.field212 == 0) {
                        this.field77 = var131;
                        this.field78 = true;
                        this.field544.method309(2, this.field77);
                    }
                    this.field133 = var131;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 193) {
                    int var132 = this.field119.method534(true);
                    int var133 = this.field119.method530(255);
                    if (this.field498 && !field149) {
                        this.field77 = var133;
                        this.field78 = false;
                        this.field544.method309(2, this.field77);
                        this.field212 = var132;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 227 || this.field164 == 206 || this.field164 == 152 || this.field164 == 79 || this.field164 == 177 || this.field164 == 185 || this.field164 == 45 || this.field164 == 94 || this.field164 == 115 || this.field164 == 57 || this.field164 == 101) {
                    this.method149(this.field164, this.field119, false);
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 244) {
                    this.field553 = this.field163 / 8;
                    for (int var134 = 0; var134 < this.field553; ++var134) {
                        this.field249[var134] = this.field119.method508((byte) 0);
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 251) {
                    int var135 = this.field119.method530(255);
                    int var136 = this.field119.method504();
                    int var137 = this.field119.method530(255);
                    class44.method397(var137).field1252 = (var135 << 16) + var136;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 107) {
                    this.field160 = false;
                    this.field511 = 2;
                    this.field550 = "";
                    this.field79 = true;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 97) {
                    this.field185 = this.field119.method502();
                    if (this.field185 == 1) {
                        this.field231 = this.field119.method504();
                    }
                    if (this.field185 >= 2 && this.field185 <= 6) {
                        if (this.field185 == 2) {
                            this.field171 = 64;
                            this.field172 = 64;
                        }
                        if (this.field185 == 3) {
                            this.field171 = 0;
                            this.field172 = 64;
                        }
                        if (this.field185 == 4) {
                            this.field171 = 128;
                            this.field172 = 64;
                        }
                        if (this.field185 == 5) {
                            this.field171 = 64;
                            this.field172 = 0;
                        }
                        if (this.field185 == 6) {
                            this.field171 = 64;
                            this.field172 = 128;
                        }
                        this.field185 = 2;
                        this.field168 = this.field119.method504();
                        this.field169 = this.field119.method504();
                        this.field170 = this.field119.method502();
                    }
                    if (this.field185 == 10) {
                        this.field365 = this.field119.method504();
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 5) {
                    this.field368 = this.field119.method502();
                    this.field301 = this.field119.method502();
                    this.field112 = this.field119.method502();
                    this.field355 = true;
                    this.field79 = true;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 176) {
                    int var138 = this.field119.method530(255);
                    int var139 = this.field119.method504();
                    class44 var140 = class44.method397(var139);
                    if (var140 != null && var140.field1263 == 0) {
                        if (var138 < 0) {
                            var138 = 0;
                        }
                        if (var138 > var140.field1204 - var140.field1260) {
                            var138 = var140.field1204 - var140.field1260;
                        }
                        var140.field1259 = var138;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 167) {
                    int var141 = this.field119.method531(4);
                    int var142 = this.field119.method530(255);
                    int var143 = this.field119.method504();
                    if (var143 == 65535) {
                        class44.method397(var141).field1200 = 0;
                        this.field164 = -1;
                        return true;
                    }
                    class12 var144 = class12.method218(var143);
                    class44.method397(var141).field1200 = 4;
                    class44.method397(var141).field1201 = var143;
                    class44.method397(var141).field1206 = var144.field719;
                    class44.method397(var141).field1207 = var144.field728;
                    class44.method397(var141).field1205 = var144.field713 * 100 / var142;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 93) {
                    int var145 = this.field119.method531(4);
                    this.method118(var145, false);
                    if (this.field263 != -1) {
                        this.method54(6, this.field263);
                        this.field263 = -1;
                        this.field178 = true;
                        this.field184 = true;
                    }
                    if (this.field449 != -1) {
                        this.method54(6, this.field449);
                        this.field449 = -1;
                        this.field202 = true;
                    }
                    if (this.field348 != -1) {
                        this.method54(6, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field361 != -1) {
                        this.method54(6, this.field361);
                        this.field361 = -1;
                    }
                    if (this.field116 != var145) {
                        this.method54(6, this.field116);
                        this.field116 = var145;
                    }
                    this.field161 = false;
                    this.field79 = true;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 50) {
                    int var146 = this.field119.method531(4);
                    int var147 = this.field119.method530(255);
                    if (this.field116 != -1) {
                        this.method54(6, this.field116);
                        this.field116 = -1;
                        this.field79 = true;
                    }
                    if (this.field449 != -1) {
                        this.method54(6, this.field449);
                        this.field449 = -1;
                        this.field202 = true;
                    }
                    if (this.field348 != -1) {
                        this.method54(6, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field361 != var146) {
                        this.method54(6, this.field361);
                        this.field361 = var146;
                    }
                    if (this.field263 != var147) {
                        this.method54(6, this.field263);
                        this.field263 = var147;
                    }
                    if (this.field511 != 0) {
                        this.field511 = 0;
                        this.field79 = true;
                    }
                    this.field178 = true;
                    this.field184 = true;
                    this.field161 = false;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 201) {
                    int var148 = this.field119.method530(255);
                    int var149 = this.field119.method531(4);
                    class44.method397(var149).field1200 = 1;
                    class44.method397(var149).field1201 = var148;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 99) {
                    this.field178 = true;
                    int var150 = this.field119.method504();
                    class44 var151 = class44.method397(var150);
                    int var152 = this.field119.method504();
                    for (int var153 = 0; var153 < var152; ++var153) {
                        int var154 = this.field119.method522(0);
                        if (var154 == 255) {
                            var154 = this.field119.method537(this.field432);
                        }
                        var151.field1233[var153] = this.field119.method530(255);
                        var151.field1211[var153] = var154;
                    }
                    for (int var155 = var152; var155 < var151.field1233.length; ++var155) {
                        var151.field1233[var155] = 0;
                        var151.field1211[var155] = 0;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 159) {
                    this.field121 = true;
                    this.field87 = this.field119.method502();
                    this.field88 = this.field119.method502();
                    this.field89 = this.field119.method504();
                    this.field90 = this.field119.method502();
                    this.field91 = this.field119.method502();
                    if (this.field91 >= 100) {
                        int var156 = this.field87 * 128 + 64;
                        int var157 = this.field88 * 128 + 64;
                        int var158 = this.method133(var156, var157, 899, this.field205) - this.field89;
                        int var159 = var156 - this.field527;
                        int var160 = var158 - this.field528;
                        int var161 = var157 - this.field529;
                        int var162 = (int) Math.sqrt((double) (var159 * var159 + var161 * var161));
                        this.field530 = (int) (Math.atan2((double) var160, (double) var162) * 325.949D) & 2047;
                        this.field531 = (int) (Math.atan2((double) var159, (double) var161) * -325.949D) & 2047;
                        if (this.field530 < 128) {
                            this.field530 = 128;
                        }
                        if (this.field530 > 383) {
                            this.field530 = 383;
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 36) {
                    this.field207 = this.field119.method521(true);
                    this.field206 = this.field119.method520(-37135);
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 118) {
                    int var163 = this.field119.method529((byte) 6);
                    int var164 = this.field119.method504();
                    int var165 = this.field119.method504();
                    int var166 = this.field119.method529((byte) 6);
                    class44.method397(var163).field1206 = var165;
                    class44.method397(var163).field1207 = var166;
                    class44.method397(var163).field1205 = var164;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 130) {
                    String var167 = this.field119.method509();
                    if (var167.endsWith(":tradereq:")) {
                        String var168 = var167.substring(0, var167.indexOf(":"));
                        long var169 = class19.method286(var168);
                        boolean var171 = false;
                        for (int var172 = 0; var172 < this.field553; ++var172) {
                            if (this.field249[var172] == var169) {
                                var171 = true;
                                break;
                            }
                        }
                        if (!var171 && this.field117 == 0) {
                            this.method44(4, var168, "wishes to trade with you.", (byte) 1);
                        }
                    } else if (var167.endsWith(":duelreq:")) {
                        String var173 = var167.substring(0, var167.indexOf(":"));
                        long var174 = class19.method286(var173);
                        boolean var176 = false;
                        for (int var177 = 0; var177 < this.field553; ++var177) {
                            if (this.field249[var177] == var174) {
                                var176 = true;
                                break;
                            }
                        }
                        if (!var176 && this.field117 == 0) {
                            this.method44(8, var173, "wishes to duel with you.", (byte) 1);
                        }
                    } else if (!var167.endsWith(":chalreq:")) {
                        this.method44(0, "", var167, (byte) 1);
                    } else {
                        String var178 = var167.substring(0, var167.indexOf(":"));
                        long var179 = class19.method286(var178);
                        boolean var181 = false;
                        for (int var182 = 0; var182 < this.field553; ++var182) {
                            if (this.field249[var182] == var179) {
                                var181 = true;
                                break;
                            }
                        }
                        if (!var181 && this.field117 == 0) {
                            String var183 = var167.substring(var167.indexOf(":") + 1, var167.length() - 9);
                            this.method44(8, var178, var183, (byte) 1);
                        }
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 2) {
                    this.field444 = this.field119.method522(0);
                    this.field178 = true;
                    this.field184 = true;
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 78) {
                    this.field121 = true;
                    this.field123 = this.field119.method502();
                    this.field124 = this.field119.method502();
                    this.field125 = this.field119.method504();
                    this.field126 = this.field119.method502();
                    this.field127 = this.field119.method502();
                    if (this.field127 >= 100) {
                        this.field527 = this.field123 * 128 + 64;
                        this.field529 = this.field124 * 128 + 64;
                        this.field528 = this.method133(this.field527, this.field529, 899, this.field205) - this.field125;
                    }
                    this.field164 = -1;
                    return true;
                }
                if (this.field164 == 129) {
                    int var184 = this.field119.method502();
                    int var185 = this.field119.method502();
                    int var186 = this.field119.method502();
                    int var187 = this.field119.method502();
                    this.field541[var184] = true;
                    this.field296[var184] = var185;
                    this.field259[var184] = var186;
                    this.field556[var184] = var187;
                    this.field500[var184] = 0;
                    this.field164 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field164 + "," + this.field163 + " - " + this.field106 + "," + this.field107);
                this.method49((byte) 3);
            } catch (IOException var192) {
                this.method114(true);
            } catch (Exception var193) {
                String var189 = "T2 - " + this.field164 + "," + this.field106 + "," + this.field107 + " - " + this.field163 + "," + (field398.field1324[0] + this.field328) + "," + (field398.field1325[0] + this.field329) + " - ";
                for (int var190 = 0; var190 < this.field163 && var190 < 50; ++var190) {
                    var189 = var189 + this.field119.field1570[var190] + ",";
                }
                signlink.reporterror(var189);
                this.method49((byte) 3);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method31(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method31(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method32(int arg0) {
        if (arg0 < this.field97 || arg0 > this.field97) {
            this.method102();
        }
        if (!this.field86 && !this.field366 && !this.field515) {
            ++field261;
            if (!this.field175) {
                this.method27(6);
            } else {
                this.method38(9956);
            }
            this.method48(field482);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
    public final void method33(boolean arg0, boolean arg1) {
        if (field398.field1344 >> 7 == this.field289 && field398.field1345 >> 7 == this.field290) {
            this.field289 = 0;
        }
        int var3 = this.field284;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class65 var5;
            int var6;
            if (arg0) {
                var5 = field398;
                var6 = this.field282 << 14;
            } else {
                var5 = this.field283[this.field285[var4]];
                var6 = this.field285[var4] << 14;
            }
            if (var5 != null && var5.method408((byte) 8)) {
                var5.field1633 = false;
                if ((field149 && this.field284 > 50 || this.field284 > 200) && !arg0 && var5.field1348 == var5.field1298) {
                    var5.field1633 = true;
                }
                int var7 = var5.field1344 >> 7;
                int var8 = var5.field1345 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1618 != null && field261 >= var5.field1612 && field261 < var5.field1613) {
                        var5.field1633 = false;
                        var5.field1611 = this.method133(var5.field1344, var5.field1345, 899, this.field205);
                        this.field452.method341(var5.field1346, var5.field1344, var5.field1345, (byte) 6, var5.field1622, 60, var5.field1611, var6, var5, var5.field1623, var5.field1621, var5.field1624, this.field205);
                    } else {
                        if ((var5.field1344 & 127) == 64 && (var5.field1345 & 127) == 64) {
                            if (this.field545[var7][var8] == this.field304) {
                                continue;
                            }
                            this.field545[var7][var8] = this.field304;
                        }
                        var5.field1611 = this.method133(var5.field1344, var5.field1345, 899, this.field205);
                        this.field452.method340(var5.field1302, 32536, this.field205, var5, var5.field1346, var5.field1345, 60, var5.field1611, var5.field1344, var6);
                    }
                }
            }
        }
        if (arg1) {
            this.field463 = !this.field463;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg1 & 2047;
        int var9 = 2048 - arg4 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = class56.field1497[var8];
            int var14 = class56.field1498[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class56.field1497[var9];
            int var17 = class56.field1498[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field527 = arg6 - var10;
        this.field528 = arg0 - var11;
        if (arg3 != 3) {
            this.field559 = null;
        }
        this.field529 = arg5 - var12;
        this.field530 = arg1;
        this.field531 = arg4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LWNCFPLWV;IZ)V")
    private final void method35(class63 arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < this.field286; ++var4) {
            int var5 = this.field287[var4];
            class55 var6 = this.field487[var5];
            int var7 = arg0.method502();
            if ((var7 & 2) != 0) {
                var6.field1422 = class2.method4(arg0.method530(255));
                var6.field1326 = var6.field1422.field29;
                var6.field1318 = var6.field1422.field51;
                var6.field1334 = var6.field1422.field24;
                var6.field1335 = var6.field1422.field39;
                var6.field1336 = var6.field1422.field18;
                var6.field1337 = var6.field1422.field48;
                var6.field1298 = var6.field1422.field40;
            }
            if ((var7 & 64) != 0) {
                int var8 = arg0.method502();
                int var9 = arg0.method502();
                var6.method412(var9, this.field242, field261, var8);
                var6.field1340 = field261 + 300;
                var6.field1341 = arg0.method502();
                var6.field1342 = arg0.method522(0);
            }
            if ((var7 & 128) != 0) {
                int var10 = arg0.method502();
                int var11 = arg0.method502();
                var6.method412(var11, this.field242, field261, var10);
                var6.field1340 = field261 + 300;
                var6.field1341 = arg0.method520(-37135);
                var6.field1342 = arg0.method502();
            }
            if ((var7 & 4) != 0) {
                var6.field1339 = arg0.method529((byte) 6);
                if (var6.field1339 == 65535) {
                    var6.field1339 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                int var12 = arg0.method529((byte) 6);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = arg0.method521(true);
                if (var6.field1311 == var12 && var12 != -1) {
                    int var14 = class41.field1147[var12].field1161;
                    if (var14 == 1) {
                        var6.field1312 = 0;
                        var6.field1313 = 0;
                        var6.field1314 = var13;
                        var6.field1315 = 0;
                    }
                    if (var14 == 2) {
                        var6.field1315 = 0;
                    }
                } else if (var12 == -1 || var6.field1311 == -1 || class41.field1147[var12].field1155 >= class41.field1147[var6.field1311].field1155) {
                    var6.field1311 = var12;
                    var6.field1312 = 0;
                    var6.field1313 = 0;
                    var6.field1314 = var13;
                    var6.field1315 = 0;
                    var6.field1343 = var6.field1329;
                }
            }
            if ((var7 & 16) != 0) {
                var6.field1316 = arg0.method529((byte) 6);
                var6.field1317 = arg0.method504();
            }
            if ((var7 & 32) != 0) {
                var6.field1319 = arg0.method529((byte) 6);
                int var15 = arg0.method536(-445);
                var6.field1323 = var15 >> 16;
                var6.field1322 = (var15 & 65535) + field261;
                var6.field1320 = 0;
                var6.field1321 = 0;
                if (var6.field1322 > field261) {
                    var6.field1320 = -1;
                }
                if (var6.field1319 == 65535) {
                    var6.field1319 = -1;
                }
            }
            if ((var7 & 8) != 0) {
                var6.field1297 = arg0.method509();
                var6.field1351 = 100;
            }
        }
        this.field175 &= arg2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILWNCFPLWV;I)V")
    private final void method36(int arg0, class63 arg1, int arg2) {
        if (arg2 < 2 || arg2 > 2) {
            this.field164 = -1;
        }
        while (arg1.field1572 + 10 < arg0 * 8) {
            int var4 = arg1.method513(11, 0);
            if (var4 == 2047) {
                break;
            }
            if (this.field283[var4] == null) {
                this.field283[var4] = new class65();
                if (this.field288[var4] != null) {
                    this.field283[var4].method544(this.field288[var4], 0);
                }
            }
            this.field285[this.field284++] = var4;
            class65 var5 = this.field283[var4];
            var5.field1328 = field261;
            int var6 = arg1.method513(5, 0);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method513(1, 0);
            if (var7 == 1) {
                this.field287[this.field286++] = var4;
            }
            int var8 = arg1.method513(5, 0);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg1.method513(1, 0);
            var5.method411(field398.field1324[0] + var6, (byte) 4, var9 == 1, field398.field1325[0] + var8);
        }
        arg1.method514(-18093);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method37(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field353[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field353[var18] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var5 << 7) + var14;
                this.field354[var15] = (this.field353[var15 - 1] + this.field353[var15 + 1] + this.field353[var15 - 128] + this.field353[var15 + 128]) / 4;
            }
        }
        this.field455 += 128;
        if (arg0 < 9 || arg0 > 9) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (this.field455 > this.field250.length) {
            this.field455 -= this.field250.length;
            int var7 = (int) (Math.random() * 12.0D);
            this.method82(this.field154, this.field443[var7]);
        }
        for (int var8 = 1; var8 < var2 - 1; ++var8) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var8 << 7) + var11;
                int var13 = this.field354[var12 + 128] - this.field250[this.field455 + var12 & this.field250.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field353[var12] = var13;
            }
        }
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field213[var9] = this.field213[var9 + 1];
        }
        this.field213[var2 - 1] = (int) (Math.sin((double) field261 / 14.0D) * 16.0D + Math.sin((double) field261 / 15.0D) * 14.0D + Math.sin((double) field261 / 16.0D) * 12.0D);
        if (this.field179 > 0) {
            this.field179 -= 4;
        }
        if (this.field180 > 0) {
            this.field180 -= 4;
        }
        if (this.field179 == 0 && this.field180 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field179 = 1024;
            }
            if (var10 == 1) {
                this.field180 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method38(int arg0) {
        if (this.field446 > 1) {
            --this.field446;
        }
        if (this.field167 > 0) {
            --this.field167;
        }
        for (int var2 = 0; var2 < 5 && this.method30(1); ++var2) {
        }
        if (this.field175) {
            Object var3 = this.field93.field896;
            synchronized (this.field93.field896) {
                if (!field104) {
                    this.field93.field898 = 0;
                } else if (super.field791 != 0 || this.field93.field898 >= 40) {
                    this.field483.method491(52, (byte) -80);
                    this.field483.method492(0);
                    int var4 = this.field483.field1571;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field93.field898 && var4 - this.field483.field1571 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field93.field900[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field93.field895[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field93.field900[var6] == -1 && this.field93.field895[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field351 == var8 && this.field352 == var7) {
                            if (this.field209 < 2047) {
                                ++this.field209;
                            }
                        } else {
                            int var10 = var8 - this.field351;
                            this.field351 = var8;
                            int var11 = var7 - this.field352;
                            this.field352 = var7;
                            if (this.field209 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field483.method493((this.field209 << 12) + (var10 << 6) + var11);
                                this.field209 = 0;
                            } else if (this.field209 < 8) {
                                this.field483.method495((this.field209 << 19) + 8388608 + var9);
                                this.field209 = 0;
                            } else {
                                this.field483.method496((this.field209 << 19) + -1073741824 + var9);
                                this.field209 = 0;
                            }
                        }
                    }
                    this.field483.method501(this.field483.field1571 - var4, 0);
                    if (var5 >= this.field93.field898) {
                        this.field93.field898 = 0;
                    } else {
                        this.field93.field898 -= var5;
                        for (int var12 = 0; var12 < this.field93.field898; ++var12) {
                            this.field93.field895[var12] = this.field93.field895[var5 + var12];
                            this.field93.field900[var12] = this.field93.field900[var5 + var12];
                        }
                    }
                }
            }
            if (super.field791 != 0) {
                long var13 = (super.field794 - this.field151) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field151 = super.field794;
                int var15 = super.field793;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field792;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field791 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field483.method491(154, (byte) -80);
                this.field483.method535((var18 << 19) + (var19 << 20) + var17, (byte) 76);
            }
            if (this.field384 > 0) {
                --this.field384;
            }
            if (super.field795[1] == 1 || super.field795[2] == 1 || super.field795[3] == 1 || super.field795[4] == 1) {
                this.field385 = true;
            }
            if (this.field385 && this.field384 <= 0) {
                this.field384 = 20;
                this.field385 = false;
                this.field483.method491(6, (byte) -80);
                this.field483.method526(3, this.field137);
                this.field483.method493(this.field136);
            }
            if (super.field782 && !this.field186) {
                this.field186 = true;
                this.field483.method491(107, (byte) -80);
                this.field483.method492(1);
            }
            if (!super.field782 && this.field186) {
                this.field186 = false;
                this.field483.method491(107, (byte) -80);
                this.field483.method492(0);
            }
            this.method150(0);
            this.method70(4);
            this.method83(-17345);
            ++this.field165;
            if (this.field165 > 750) {
                this.method114(true);
            }
            this.method86(true);
            this.method158((byte) -18);
            this.method100(-972);
            ++this.field174;
            if (this.field522 != 0) {
                this.field521 += 20;
                if (this.field521 >= 400) {
                    this.field522 = 0;
                }
            }
            if (this.field131 != 0) {
                ++this.field128;
                if (this.field128 >= 15) {
                    if (this.field131 == 2) {
                        this.field178 = true;
                    }
                    if (this.field131 == 3) {
                        this.field79 = true;
                    }
                    this.field131 = 0;
                }
            }
            if (this.field404 != 0) {
                ++this.field118;
                if (super.field785 > this.field405 + 5 || super.field785 < this.field405 - 5 || super.field786 > this.field406 + 5 || super.field786 < this.field406 - 5) {
                    this.field549 = true;
                }
                if (super.field784 == 0) {
                    if (this.field404 == 2) {
                        this.field178 = true;
                    }
                    if (this.field404 == 3) {
                        this.field79 = true;
                    }
                    this.field404 = 0;
                    if (this.field549 && this.field118 >= 5) {
                        this.field373 = -1;
                        this.method79(0);
                        if (this.field402 == this.field373 && this.field403 != this.field372) {
                            class44 var20 = class44.method397(this.field402);
                            byte var21 = 0;
                            if (this.field325 == 1 && var20.field1228 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1233[this.field372] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1222) {
                                int var22 = this.field403;
                                int var23 = this.field372;
                                var20.field1233[var23] = var20.field1233[var22];
                                var20.field1211[var23] = var20.field1211[var22];
                                var20.field1233[var22] = -1;
                                var20.field1211[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field403;
                                int var25 = this.field372;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method398(true, var24, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method398(true, var24, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method398(true, this.field403, this.field372);
                            }
                            this.field483.method491(84, (byte) -80);
                            this.field483.method526(3, this.field372);
                            this.field483.method493(this.field402);
                            this.field483.method519(var21, 0);
                            this.field483.method493(this.field403);
                        }
                    } else if ((this.field440 == 1 || this.method84(this.field257, this.field552 - 1)) && this.field552 > 2) {
                        this.method72((byte) 3);
                    } else if (this.field552 > 0) {
                        this.method69(-718, this.field552 - 1);
                    }
                    this.field128 = 10;
                    super.field791 = 0;
                }
            }
            if (class35.field1006 != -1) {
                int var26 = class35.field1006;
                int var27 = class35.field1007;
                boolean var28 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var26, 0, 0, 0, 0, true, true, var27);
                class35.field1006 = -1;
                if (var28) {
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 1;
                    this.field521 = 0;
                }
            }
            if (super.field791 == 1 && this.field380 != null) {
                this.field380 = null;
                this.field79 = true;
                super.field791 = 0;
            }
            this.method67(true);
            if (arg0 != 9956) {
                this.field559 = null;
            }
            if (this.field449 == -1) {
                this.method55(0);
                this.method154(this.field349);
                this.method52(-26949);
            }
            if (super.field784 == 1 || super.field791 == 1) {
                ++this.field513;
            }
            if (this.field323 == 0 && this.field74 == 0 && this.field318 == 0) {
                if (this.field256 > 0) {
                    --this.field256;
                }
            } else if (this.field256 < 100) {
                ++this.field256;
                if (this.field256 == 100) {
                    if (this.field323 != 0) {
                        this.field79 = true;
                    }
                    if (this.field74 != 0) {
                        this.field178 = true;
                    }
                }
            }
            if (this.field551 == 2) {
                this.method138((byte) -25);
            }
            if (this.field551 == 2 && this.field121) {
                this.method156(843);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field500[var29]++;
            }
            this.method129(-170);
            ++super.field783;
            if (super.field783 > 4500) {
                this.field167 = 250;
                super.field783 -= 500;
                this.field483.method491(221, (byte) -80);
            }
            ++this.field299;
            if (this.field299 > 500) {
                this.field299 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field270 += this.field271;
                }
                if ((var30 & 2) == 2) {
                    this.field265 += this.field266;
                }
                if ((var30 & 4) == 4) {
                    this.field75 += this.field76;
                }
            }
            if (this.field270 < -50) {
                this.field271 = 2;
            }
            if (this.field270 > 50) {
                this.field271 = -2;
            }
            if (this.field265 < -55) {
                this.field266 = 2;
            }
            if (this.field265 > 55) {
                this.field266 = -2;
            }
            if (this.field75 < -40) {
                this.field76 = 1;
            }
            if (this.field75 > 40) {
                this.field76 = -1;
            }
            ++this.field201;
            if (this.field201 > 500) {
                this.field201 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field134 += this.field135;
                }
                if ((var31 & 2) == 2) {
                    this.field429 += this.field430;
                }
            }
            if (this.field134 < -60) {
                this.field135 = 2;
            }
            if (this.field134 > 60) {
                this.field135 = -2;
            }
            if (this.field429 < -20) {
                this.field430 = 1;
            }
            if (this.field429 > 10) {
                this.field430 = -1;
            }
            ++field491;
            if (field491 > 1287) {
                field491 = 0;
                this.field483.method491(20, (byte) -80);
                this.field483.method492(0);
                int var32 = this.field483.field1571;
                this.field483.method492(104);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field483.method492(249);
                }
                this.field483.method493(60855);
                this.field483.method492((int) (Math.random() * 256.0D));
                this.field483.method493(46023);
                this.field483.method492(143);
                this.field483.method493((int) (Math.random() * 65536.0D));
                this.field483.method492(165);
                this.field483.method493(49928);
                this.field483.method492((int) (Math.random() * 256.0D));
                this.field483.method501(this.field483.field1571 - var32, 0);
            }
            ++this.field166;
            if (this.field166 > 50) {
                this.field483.method491(186, (byte) -80);
            }
            try {
                if (this.field484 != null && this.field483.field1571 > 0) {
                    this.field484.method478(this.field483.field1570, 759, 0, this.field483.field1571);
                    this.field483.field1571 = 0;
                    this.field166 = 0;
                }
            } catch (IOException var34) {
                this.method114(true);
            } catch (Exception var35) {
                this.method49((byte) 3);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field163 += arg3;
        class26 var11 = null;
        for (class26 var12 = (class26) this.field300.method485(); var12 != null; var12 = (class26) this.field300.method487(6)) {
            if (var12.field913 == arg5 && var12.field915 == arg1 && var12.field916 == arg9 && var12.field914 == arg4) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class26();
            var11.field913 = arg5;
            var11.field914 = arg4;
            var11.field915 = arg1;
            var11.field916 = arg9;
            this.method120(var11, -46483);
            this.field300.method482(var11);
        }
        var11.field918 = arg8;
        var11.field920 = arg7;
        var11.field919 = arg2;
        var11.field921 = arg6;
        var11.field917 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILQQMJEFXK;II)V")
    public final void method40(byte arg0, int arg1, class44 arg2, int arg3, int arg4) {
        if (arg2.field1263 == 0 && arg2.field1258 != null) {
            if (!arg2.field1236 || this.field494 == arg2.field1261 || this.field83 == arg2.field1261 || this.field501 == arg2.field1261) {
                int var6 = class72.field1735;
                int var7 = class72.field1733;
                int var8 = class72.field1736;
                int var9 = class72.field1734;
                class72.method594(7, arg2.field1260 + arg4, arg1, arg2.field1256 + arg1, arg4);
                int var10 = arg2.field1258.length;
                if (arg0 == 66) {
                    for (int var11 = 0; var11 < var10; ++var11) {
                        int var12 = arg2.field1230[var11] + arg1;
                        int var13 = arg2.field1254[var11] + arg4 - arg3;
                        class44 var14 = class44.method397(arg2.field1258[var11]);
                        int var15 = var14.field1265 + var12;
                        int var16 = var14.field1237 + var13;
                        if (var14.field1228 > 0) {
                            this.method98(-44119, var14);
                        }
                        if (var14.field1263 == 0) {
                            if (var14.field1259 > var14.field1204 - var14.field1260) {
                                var14.field1259 = var14.field1204 - var14.field1260;
                            }
                            if (var14.field1259 < 0) {
                                var14.field1259 = 0;
                            }
                            this.method40((byte) 66, var15, var14, var14.field1259, var16);
                            if (var14.field1204 > var14.field1260) {
                                this.method142(var16, var14.field1260, var14.field1256 + var15, var14.field1204, 2, var14.field1259);
                            }
                        } else if (var14.field1263 != 1) {
                            if (var14.field1263 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var14.field1260; ++var18) {
                                    for (int var19 = 0; var19 < var14.field1256; ++var19) {
                                        int var20 = (var14.field1226 + 32) * var19 + var15;
                                        int var21 = (var14.field1235 + 32) * var18 + var16;
                                        if (var17 < 20) {
                                            var20 += var14.field1225[var17];
                                            var21 += var14.field1239[var17];
                                        }
                                        if (var14.field1233[var17] <= 0) {
                                            if (var14.field1215 != null && var17 < 20) {
                                                class66 var30 = var14.field1215[var17];
                                                if (var30 != null) {
                                                    var30.method550(false, var20, var21);
                                                }
                                            }
                                        } else {
                                            int var22 = 0;
                                            int var23 = 0;
                                            int var24 = var14.field1233[var17] - 1;
                                            if (var20 > class72.field1735 - 32 && var20 < class72.field1736 && var21 > class72.field1733 - 32 && var21 < class72.field1734 || this.field404 != 0 && this.field403 == var17) {
                                                int var25 = 0;
                                                if (this.field190 == 1 && this.field191 == var17 && this.field192 == var14.field1261) {
                                                    var25 = 16777215;
                                                }
                                                class66 var26 = class12.method224(var25, var14.field1211[var17], var24, 22266);
                                                if (var26 != null) {
                                                    if (this.field404 != 0 && this.field403 == var17 && this.field402 == var14.field1261) {
                                                        var22 = super.field785 - this.field405;
                                                        var23 = super.field786 - this.field406;
                                                        if (var22 < 5 && var22 > -5) {
                                                            var22 = 0;
                                                        }
                                                        if (var23 < 5 && var23 > -5) {
                                                            var23 = 0;
                                                        }
                                                        if (this.field118 < 5) {
                                                            var22 = 0;
                                                            var23 = 0;
                                                        }
                                                        var26.method552(128, (byte) 4, var20 + var22, var21 + var23);
                                                        if (var21 + var23 < class72.field1733 && arg2.field1259 > 0) {
                                                            int var27 = (class72.field1733 - var21 - var23) * this.field174 / 3;
                                                            if (var27 > this.field174 * 10) {
                                                                var27 = this.field174 * 10;
                                                            }
                                                            if (var27 > arg2.field1259) {
                                                                var27 = arg2.field1259;
                                                            }
                                                            arg2.field1259 -= var27;
                                                            this.field406 += var27;
                                                        }
                                                        if (var21 + var23 + 32 > class72.field1734 && arg2.field1259 < arg2.field1204 - arg2.field1260) {
                                                            int var28 = (var21 + var23 + 32 - class72.field1734) * this.field174 / 3;
                                                            if (var28 > this.field174 * 10) {
                                                                var28 = this.field174 * 10;
                                                            }
                                                            if (var28 > arg2.field1204 - arg2.field1260 - arg2.field1259) {
                                                                var28 = arg2.field1204 - arg2.field1260 - arg2.field1259;
                                                            }
                                                            arg2.field1259 += var28;
                                                            this.field406 -= var28;
                                                        }
                                                    } else if (this.field131 != 0 && this.field130 == var17 && this.field129 == var14.field1261) {
                                                        var26.method552(128, (byte) 4, var20, var21);
                                                    } else {
                                                        var26.method550(false, var20, var21);
                                                    }
                                                    if (var26.field1649 == 33 || var14.field1211[var17] != 1) {
                                                        int var29 = var14.field1211[var17];
                                                        this.field417.method16(var20 + 1 + var22, 0, method119(var29, -306), var21 + 10 + var23, this.field381);
                                                        this.field417.method16(var20 + var22, 16776960, method119(var29, -306), var21 + 9 + var23, this.field381);
                                                    }
                                                }
                                            }
                                        }
                                        ++var17;
                                    }
                                }
                            } else if (var14.field1263 == 3) {
                                boolean var31 = false;
                                if (this.field501 == var14.field1261 || this.field83 == var14.field1261 || this.field494 == var14.field1261) {
                                    var31 = true;
                                }
                                int var32;
                                if (this.method139(var14, (byte) 77)) {
                                    var32 = var14.field1227;
                                    if (var31 && var14.field1223 != 0) {
                                        var32 = var14.field1223;
                                    }
                                } else {
                                    var32 = var14.field1269;
                                    if (var31 && var14.field1213 != 0) {
                                        var32 = var14.field1213;
                                    }
                                }
                                if (var14.field1232 == 0) {
                                    if (var14.field1264) {
                                        class72.method597(var14.field1256, var32, var14.field1260, var15, this.field357, var16);
                                    } else {
                                        class72.method598(var14.field1260, var14.field1256, true, var32, var16, var15);
                                    }
                                } else if (var14.field1264) {
                                    class72.method596(var16, 256 - (var14.field1232 & 255), var14.field1260, var14.field1256, this.field546, var15, var32);
                                } else {
                                    class72.method599(var16, var32, this.field221, var15, var14.field1256, 256 - (var14.field1232 & 255), var14.field1260);
                                }
                            } else if (var14.field1263 == 4) {
                                class4 var33 = var14.field1262;
                                String var34 = var14.field1250;
                                boolean var35 = false;
                                if (this.field501 == var14.field1261 || this.field83 == var14.field1261 || this.field494 == var14.field1261) {
                                    var35 = true;
                                }
                                int var36;
                                if (this.method139(var14, (byte) 77)) {
                                    var36 = var14.field1227;
                                    if (var35 && var14.field1223 != 0) {
                                        var36 = var14.field1223;
                                    }
                                    if (var14.field1219.length() > 0) {
                                        var34 = var14.field1219;
                                    }
                                } else {
                                    var36 = var14.field1269;
                                    if (var35 && var14.field1213 != 0) {
                                        var36 = var14.field1213;
                                    }
                                }
                                if (var14.field1208 == 6 && this.field161) {
                                    var34 = "Please wait...";
                                    var36 = var14.field1269;
                                }
                                if (class72.field1731 == 479) {
                                    if (var36 == 16776960) {
                                        var36 = 255;
                                    }
                                    if (var36 == 49152) {
                                        var36 = 16777215;
                                    }
                                }
                                int var37 = var33.field69 + var16;
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
                                                                            var34 = var34.substring(0, var42) + this.method77(-977, this.method131(var14, -341, 4)) + var34.substring(var42 + 2);
                                                                        }
                                                                    }
                                                                    var34 = var34.substring(0, var41) + this.method77(-977, this.method131(var14, -341, 3)) + var34.substring(var41 + 2);
                                                                }
                                                            }
                                                            var34 = var34.substring(0, var40) + this.method77(-977, this.method131(var14, -341, 2)) + var34.substring(var40 + 2);
                                                        }
                                                    }
                                                    var34 = var34.substring(0, var39) + this.method77(-977, this.method131(var14, -341, 1)) + var34.substring(var39 + 2);
                                                }
                                            }
                                            var34 = var34.substring(0, var38) + this.method77(-977, this.method131(var14, -341, 0)) + var34.substring(var38 + 2);
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
                                    if (var14.field1210) {
                                        var33.method13(var44, true, var37, var14.field1224, var14.field1256 / 2 + var15, var36);
                                    } else {
                                        var33.method20((byte) 1, var14.field1224, var37, var36, var15, var44);
                                    }
                                    var37 += var33.field69;
                                }
                            } else if (var14.field1263 == 5) {
                                class66 var45;
                                if (this.method139(var14, (byte) 77)) {
                                    var45 = var14.field1244;
                                } else {
                                    var45 = var14.field1234;
                                }
                                if (var45 != null) {
                                    var45.method550(false, var15, var16);
                                }
                            } else if (var14.field1263 == 6) {
                                int var46 = class11.field676;
                                int var47 = class11.field677;
                                class11.field676 = var14.field1256 / 2 + var15;
                                class11.field677 = var14.field1260 / 2 + var16;
                                int var48 = class11.field680[var14.field1206] * var14.field1205 >> 16;
                                int var49 = class11.field681[var14.field1206] * var14.field1205 >> 16;
                                boolean var50 = this.method139(var14, (byte) 77);
                                int var51;
                                if (var50) {
                                    var51 = var14.field1203;
                                } else {
                                    var51 = var14.field1202;
                                }
                                class56 var52;
                                if (var51 == -1) {
                                    var52 = var14.method400(-1, var50, -1, false);
                                } else {
                                    class41 var53 = class41.field1147[var51];
                                    var52 = var14.method400(var53.field1150[var14.field1253], var50, var53.field1149[var14.field1253], false);
                                }
                                if (var52 != null) {
                                    var52.method463(0, var14.field1207, 0, var14.field1206, 0, var48, var49);
                                }
                                class11.field676 = var46;
                                class11.field677 = var47;
                            } else {
                                if (var14.field1263 == 7) {
                                    class4 var54 = var14.field1262;
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var14.field1260; ++var56) {
                                        for (int var57 = 0; var57 < var14.field1256; ++var57) {
                                            if (var14.field1233[var55] > 0) {
                                                class12 var58 = class12.method218(var14.field1233[var55] - 1);
                                                String var59 = String.valueOf(var58.field705);
                                                if (var58.field696 || var14.field1211[var55] != 1) {
                                                    var59 = var59 + " x" + method130(-327, var14.field1211[var55]);
                                                }
                                                int var60 = (var14.field1226 + 115) * var57 + var15;
                                                int var61 = (var14.field1235 + 12) * var56 + var16;
                                                if (var14.field1210) {
                                                    var54.method13(var59, true, var61, var14.field1224, var14.field1256 / 2 + var60, var14.field1269);
                                                } else {
                                                    var54.method20((byte) 1, var14.field1224, var61, var14.field1269, var60, var59);
                                                }
                                            }
                                            ++var55;
                                        }
                                    }
                                }
                                if (var14.field1263 == 8 && (this.field323 == var14.field1261 || this.field74 == var14.field1261 || this.field318 == var14.field1261) && this.field256 == 100) {
                                    int var62 = 0;
                                    int var63 = 0;
                                    class4 var64 = this.field418;
                                    String var65 = var14.field1250;
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
                                        int var74 = var64.method14(this.field512, var73);
                                        if (var74 > var62) {
                                            var62 = var74;
                                        }
                                        var63 += var64.field69 + 1;
                                    }
                                    var62 += 6;
                                    var63 += 7;
                                    int var66 = var14.field1256 + var15 - 5 - var62;
                                    int var67 = var14.field1260 + var16 + 5;
                                    if (var66 < var15 + 5) {
                                        var66 = var15 + 5;
                                    }
                                    if (var62 + var66 > arg2.field1256 + arg1) {
                                        var66 = arg2.field1256 + arg1 - var62;
                                    }
                                    if (var63 + var67 > arg2.field1260 + arg4) {
                                        var67 = arg2.field1260 + arg4 - var63;
                                    }
                                    class72.method597(var62, 16777120, var63, var66, this.field357, var67);
                                    class72.method598(var63, var62, true, 0, var67, var66);
                                    String var68 = var14.field1250;
                                    int var69 = var64.field69 + var67 + 2;
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
                                        var64.method20((byte) 1, false, var69, 0, var66 + 3, var71);
                                        var69 += var64.field69 + 1;
                                    }
                                }
                            }
                        }
                    }
                    class72.method594(7, var9, var6, var8, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
    public final void method41(int arg0, int arg1, boolean arg2) {
        if (arg1 <= 0) {
            this.method102();
        }
        signlink.midivol = arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LWNCFPLWV;IB)V")
    private final void method42(class63 arg0, int arg1, byte arg2) {
        this.field95 = 0;
        this.field286 = 0;
        this.method109(arg0, arg1, false);
        if (arg2 != 3) {
            field428 = -77;
        }
        this.method59((byte) 9, arg0, arg1);
        this.method36(arg1, arg0, 2);
        this.method89(4, arg1, arg0);
        for (int var4 = 0; var4 < this.field95; ++var4) {
            int var6 = this.field96[var4];
            if (field261 != this.field283[var6].field1328) {
                this.field283[var6] = null;
            }
        }
        if (arg0.field1571 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1571 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field284; ++var5) {
                if (this.field283[this.field285[var5]] == null) {
                    signlink.reporterror(this.field279 + " null entry in pl list - pos:" + var5 + " size:" + this.field284);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 != 0) {
            this.field154 = this.field152.method317();
        }
        if (this.field185 == 2) {
            this.method112((this.field168 - this.field328 << 7) + this.field171, this.field269, (this.field169 - this.field329 << 7) + this.field172, this.field170 * 2);
            if (this.field532 > -1 && field261 % 20 < 10) {
                this.field370[0].method550(false, this.field532 - 12, this.field533 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
    public final void method44(int arg0, String arg1, String arg2, byte arg3) {
        if (arg0 == 0 && this.field448 != -1) {
            this.field380 = arg2;
            super.field791 = 0;
        }
        if (this.field116 == -1) {
            this.field79 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field362[var5] = this.field362[var5 - 1];
            this.field363[var5] = this.field363[var5 - 1];
            this.field364[var5] = this.field364[var5 - 1];
        }
        this.field362[0] = arg0;
        if (arg3 != 1) {
            field94 = !field94;
        }
        this.field363[0] = arg1;
        this.field364[0] = arg2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method45(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.field324 = false;
        while (this.field316) {
            this.field324 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field188 = null;
        this.field189 = null;
        int var2 = 2 / arg0;
        this.field443 = null;
        this.field108 = null;
        this.field109 = null;
        this.field110 = null;
        this.field111 = null;
        this.field250 = null;
        this.field251 = null;
        this.field353 = null;
        this.field354 = null;
        this.field215 = null;
        this.field216 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method47(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field460 = "";
                this.field461 = "Connecting to server...";
                this.method147(9, true);
            }
            this.field484 = new class59(this.method63(field147 + 43594), 9, this);
            long var4 = class19.method286(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field483.field1571 = 0;
            this.field483.method492(14);
            this.field483.method492(var6);
            this.field484.method478(this.field483.field1570, 759, 0, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field484.method475();
            }
            int var8 = this.field484.method475();
            int var9 = var8;
            if (var8 == 0) {
                this.field484.method477(this.field119.field1570, 0, 8);
                this.field119.field1571 = 0;
                this.field278 = this.field119.method508((byte) 0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field278 >> 32), (int) this.field278 };
                this.field483.field1571 = 0;
                this.field483.method492(10);
                this.field483.method496(var10[0]);
                this.field483.method496(var10[1]);
                this.field483.method496(var10[2]);
                this.field483.method496(var10[3]);
                this.field483.method496(signlink.uid);
                this.field483.method499(arg0);
                this.field483.method499(arg1);
                this.field483.method517(true, field298, field122);
                this.field558.field1571 = 0;
                if (arg2) {
                    this.field558.method492(18);
                } else {
                    this.field558.method492(16);
                }
                this.field558.method492(this.field483.field1571 + 36 + 1 + 1 + 2);
                this.field558.method492(255);
                this.field558.method493(373);
                this.field558.method492(field149 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field558.method496(this.field495[var11]);
                }
                this.field558.method500(this.field260, 0, this.field483.field1570, this.field483.field1571);
                this.field483.field1575 = new class29(var10, (byte) 53);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field152 = new class29(var10, (byte) 53);
                this.field484.method478(this.field558.field1570, 759, 0, this.field558.field1571);
                var8 = this.field484.method475();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method47(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field72 = this.field484.method475();
                field104 = this.field484.method475() == 1;
                this.field151 = 0L;
                this.field209 = 0;
                this.field93.field898 = 0;
                super.field782 = true;
                this.field186 = true;
                this.field175 = true;
                this.field483.field1571 = 0;
                this.field119.field1571 = 0;
                this.field164 = -1;
                this.field105 = -1;
                this.field106 = -1;
                this.field107 = -1;
                this.field163 = 0;
                this.field165 = 0;
                this.field446 = 0;
                this.field167 = 0;
                this.field185 = 0;
                this.field552 = 0;
                this.field481 = false;
                super.field783 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field364[var13] = null;
                }
                this.field190 = 0;
                this.field564 = 0;
                this.field551 = 0;
                this.field422 = 0;
                this.field270 = (int) (Math.random() * 100.0D) - 50;
                this.field265 = (int) (Math.random() * 110.0D) - 55;
                this.field75 = (int) (Math.random() * 80.0D) - 40;
                this.field134 = (int) (Math.random() * 120.0D) - 60;
                this.field429 = (int) (Math.random() * 30.0D) - 20;
                this.field137 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field176 = 0;
                this.field344 = -1;
                this.field289 = 0;
                this.field290 = 0;
                this.field284 = 0;
                this.field488 = 0;
                for (int var14 = 0; var14 < this.field281; ++var14) {
                    this.field283[var14] = null;
                    this.field288[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field487[var15] = null;
                }
                field398 = this.field283[this.field282] = new class65();
                this.field141.method489();
                this.field200.method489();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field559[var16][var17][var18] = null;
                        }
                    }
                }
                this.field300 = new class61(field211);
                this.field236 = 0;
                this.field235 = 0;
                this.method54(6, this.field448);
                this.field448 = -1;
                this.method54(6, this.field116);
                this.field116 = -1;
                this.method54(6, this.field361);
                this.field361 = -1;
                this.method54(6, this.field449);
                this.field449 = -1;
                this.method54(6, this.field348);
                this.field348 = -1;
                this.method54(6, this.field263);
                this.field263 = -1;
                this.method54(6, this.field445);
                this.field445 = -1;
                this.field161 = false;
                this.field444 = 3;
                this.field511 = 0;
                this.field481 = false;
                this.field160 = false;
                this.field380 = null;
                this.field153 = 0;
                this.field113 = -1;
                this.field537 = true;
                this.method121((byte) -26);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field319[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field309[var20] = null;
                    this.field310[var20] = false;
                }
                field427 = 0;
                field345 = 0;
                field254 = 0;
                field462 = 0;
                field327 = 0;
                field538 = 0;
                field492 = 0;
                field103 = 0;
                field425 = 0;
                field470 = 0;
                this.method170(9);
            } else if (var8 == 3) {
                this.field460 = "";
                this.field461 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field460 = "Your account has been disabled.";
                this.field461 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field460 = "Your account is already logged in.";
                this.field461 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field460 = "RuneScape has been updated!";
                this.field461 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field460 = "This world is full.";
                this.field461 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field460 = "Unable to connect.";
                this.field461 = "Login server offline.";
            } else if (var8 == 9) {
                this.field460 = "Login limit exceeded.";
                this.field461 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field460 = "Unable to connect.";
                this.field461 = "Bad session id.";
            } else if (var8 == 12) {
                this.field460 = "You need a members account to login to this world.";
                this.field461 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field460 = "Could not complete login.";
                this.field461 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field460 = "The server is being updated.";
                this.field461 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field175 = true;
                this.field483.field1571 = 0;
                this.field119.field1571 = 0;
                this.field164 = -1;
                this.field105 = -1;
                this.field106 = -1;
                this.field107 = -1;
                this.field163 = 0;
                this.field165 = 0;
                this.field446 = 0;
                this.field552 = 0;
                this.field481 = false;
                this.field516 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field460 = "Login attempts exceeded.";
                this.field461 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field460 = "You are standing in a members-only area.";
                this.field461 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field460 = "Invalid loginserver requested";
                this.field461 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field460 = "Malformed login packet.";
                    this.field461 = "Please try again.";
                } else if (var8 == 23) {
                    this.field460 = "No reply from loginserver.";
                    this.field461 = "Please try again.";
                } else if (var8 == 24) {
                    this.field460 = "Error loading your profile.";
                    this.field461 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field460 = "Unexpected loginserver response.";
                    this.field461 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field460 = "This computers address has been blocked";
                    this.field461 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field467 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field467;
                            this.method47(arg0, arg1, arg2);
                        } else {
                            this.field460 = "No response from loginserver";
                            this.field461 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field460 = "No response from server";
                        this.field461 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field460 = "Unexpected server response";
                    this.field461 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field484.method475();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field460 = "You have only just left another world";
                    this.field461 = "Your profile will be transferred in: " + var26;
                    this.method147(9, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method47(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field460 = "";
            this.field461 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method48(int arg0) {
        if (arg0 >= 0) {
            this.field164 = -1;
        }
        while (true) {
            class34 var2 = this.field544.method312();
            if (var2 == null) {
                return;
            }
            if (var2.field962 == 0) {
                class56.method440(var2.field965, var2.field963, (byte) 6);
                if ((this.field544.method295(var2.field965, -32251) & 98) != 0) {
                    this.field178 = true;
                    if (this.field116 != -1 || this.field448 != -1) {
                        this.field79 = true;
                    }
                }
            }
            if (var2.field962 == 1 && var2.field963 != null) {
                class6.method175(true, var2.field963);
            }
            if (var2.field962 == 2 && this.field77 == var2.field965 && var2.field963 != null) {
                this.method92(this.field78, var2.field963, false);
            }
            if (var2.field962 == 3 && this.field551 == 1) {
                for (int var3 = 0; var3 < this.field244.length; ++var3) {
                    if (this.field233[var3] == var2.field965) {
                        this.field244[var3] = var2.field963;
                        if (var2.field963 == null) {
                            this.field233[var3] = -1;
                        }
                        break;
                    }
                    if (this.field234[var3] == var2.field965) {
                        this.field150[var3] = var2.field963;
                        if (var2.field963 == null) {
                            this.field234[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field962 == 93 && this.field544.method302(var2.field965, (byte) 2)) {
                class68.method565(3, new class63((byte) -58, var2.field963), this.field544);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method49(byte arg0) {
        if (arg0 != 3) {
            this.field164 = -1;
        }
        try {
            if (this.field484 != null) {
                this.field484.method474();
            }
        } catch (Exception var3) {
        }
        this.field484 = null;
        this.field175 = false;
        this.field509 = 0;
        this.field279 = "";
        this.field280 = "";
        this.method125(0);
        this.field452.method329(-54);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field468[var2].method228();
        }
        System.gc();
        this.method81(false);
        this.field133 = -1;
        this.field77 = -1;
        this.field212 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public final void method50(byte arg0, String arg1, String arg2) {
        if (arg0 != -95) {
            this.field483.method492(1);
        }
        if (this.field313 != null) {
            this.field313.method245(this.field463);
            class11.field682 = this.field229;
            int var4 = 151;
            if (arg2 != null) {
                var4 -= 7;
            }
            this.field418.method12(var4, arg1, 257, 0, 0);
            this.field418.method12(var4 - 1, arg1, 256, 16777215, 0);
            var4 += 15;
            if (arg2 != null) {
                this.field418.method12(var4, arg2, 257, 0, 0);
                this.field418.method12(var4 - 1, arg2, 256, 16777215, 0);
            }
            this.field313.method246(4, super.field777, 4, 1);
        } else if (super.field778 != null) {
            super.field778.method245(this.field463);
            class11.field682 = this.field230;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class72.method597(var6, 0, var7, 383 - var6 / 2, this.field357, var5 - 5 - var7 / 2);
            class72.method598(var7, var6, true, 16777215, var5 - 5 - var7 / 2, 383 - var6 / 2);
            if (arg2 != null) {
                var5 -= 7;
            }
            this.field418.method12(var5, arg1, 383, 0, 0);
            this.field418.method12(var5 - 1, arg1, 382, 16777215, 0);
            var5 += 15;
            if (arg2 != null) {
                this.field418.method12(var5, arg2, 383, 0, 0);
                this.field418.method12(var5 - 1, arg2, 382, 16777215, 0);
            }
            super.field778.method246(0, super.field777, 0, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIZZI)Z")
    public final boolean method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var40 = 0; var40 < var14; ++var40) {
                this.field423[var15][var40] = 0;
                this.field562[var15][var40] = 99999999;
            }
        }
        int var16 = arg2;
        int var17 = arg1;
        this.field423[arg2][arg1] = 99;
        this.field562[arg2][arg1] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field222[var18] = arg2;
        int var41 = var18 + 1;
        this.field223[var18] = arg1;
        boolean var20 = false;
        int var21 = this.field222.length;
        int[][] var22 = this.field468[this.field205].field755;
        while (var41 != var19) {
            var16 = this.field222[var19];
            var17 = this.field223[var19];
            var19 = (var19 + 1) % var21;
            if (arg4 == var16 && arg11 == var17) {
                var20 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && this.field468[this.field205].method237(var17, arg11, arg3, arg4, var16, arg7 - 1, 0)) {
                    var20 = true;
                    break;
                }
                if (arg7 < 10 && this.field468[this.field205].method238(arg11, var17, (byte) 2, arg3, arg7 - 1, arg4, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg0 != 0 && this.field468[this.field205].method239(arg11, arg4, arg0, arg6, 939, arg5, var16, var17)) {
                var20 = true;
                break;
            }
            int var39 = this.field562[var16][var17] + 1;
            if (var16 > 0 && this.field423[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field222[var41] = var16 - 1;
                this.field223[var41] = var17;
                var41 = (var41 + 1) % var21;
                this.field423[var16 - 1][var17] = 2;
                this.field562[var16 - 1][var17] = var39;
            }
            if (var16 < var13 - 1 && this.field423[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field222[var41] = var16 + 1;
                this.field223[var41] = var17;
                var41 = (var41 + 1) % var21;
                this.field423[var16 + 1][var17] = 8;
                this.field562[var16 + 1][var17] = var39;
            }
            if (var17 > 0 && this.field423[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field222[var41] = var16;
                this.field223[var41] = var17 - 1;
                var41 = (var41 + 1) % var21;
                this.field423[var16][var17 - 1] = 1;
                this.field562[var16][var17 - 1] = var39;
            }
            if (var17 < var14 - 1 && this.field423[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field222[var41] = var16;
                this.field223[var41] = var17 + 1;
                var41 = (var41 + 1) % var21;
                this.field423[var16][var17 + 1] = 4;
                this.field562[var16][var17 + 1] = var39;
            }
            if (var16 > 0 && var17 > 0 && this.field423[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field222[var41] = var16 - 1;
                this.field223[var41] = var17 - 1;
                var41 = (var41 + 1) % var21;
                this.field423[var16 - 1][var17 - 1] = 3;
                this.field562[var16 - 1][var17 - 1] = var39;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field423[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field222[var41] = var16 + 1;
                this.field223[var41] = var17 - 1;
                var41 = (var41 + 1) % var21;
                this.field423[var16 + 1][var17 - 1] = 9;
                this.field562[var16 + 1][var17 - 1] = var39;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field423[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field222[var41] = var16 - 1;
                this.field223[var41] = var17 + 1;
                var41 = (var41 + 1) % var21;
                this.field423[var16 - 1][var17 + 1] = 6;
                this.field562[var16 - 1][var17 + 1] = var39;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field423[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field222[var41] = var16 + 1;
                this.field223[var41] = var17 + 1;
                var41 = (var41 + 1) % var21;
                this.field423[var16 + 1][var17 + 1] = 12;
                this.field562[var16 + 1][var17 + 1] = var39;
            }
        }
        this.field555 = 0;
        if (!var20) {
            if (!arg10) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg4 - var25; var26 <= arg4 + var25; ++var26) {
                for (int var27 = arg11 - var25; var27 <= arg11 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field562[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg4) {
                            var28 = arg4 - var26;
                        } else if (var26 > arg4 + arg6 - 1) {
                            var28 = var26 - (arg4 + arg6 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg11) {
                            var29 = arg11 - var27;
                        } else if (var27 > arg0 + arg11 - 1) {
                            var29 = var27 - (arg0 + arg11 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field562[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field562[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg2 == var16 && arg1 == var17) {
                return false;
            }
            this.field555 = 1;
        }
        byte var31 = 0;
        this.field222[var31] = var16;
        int var42 = var31 + 1;
        this.field223[var31] = var17;
        int var32;
        int var33 = var32 = this.field423[var16][var17];
        if (!arg9) {
            for (int var34 = 1; var34 > 0; ++var34) {
            }
        }
        while (arg2 != var16 || arg1 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field222[var42] = var16;
                this.field223[var42++] = var17;
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
            var33 = this.field423[var16][var17];
        }
        if (var42 <= 0) {
            if (arg8 == 1) {
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
            int var36 = this.field222[var42];
            int var37 = this.field223[var42];
            if (arg8 == 0) {
                this.field483.method491(67, (byte) -80);
                this.field483.method492(var35 + var35 + 3);
            }
            if (arg8 == 1) {
                this.field483.method491(125, (byte) -80);
                this.field483.method492(var35 + var35 + 3 + 14);
            }
            if (arg8 == 2) {
                this.field483.method491(10, (byte) -80);
                this.field483.method492(var35 + var35 + 3);
            }
            this.field289 = this.field222[0];
            this.field290 = this.field223[0];
            for (int var38 = 1; var38 < var35; ++var38) {
                --var42;
                this.field483.method518(true, this.field222[var42] - var36);
                this.field483.method492(this.field223[var42] - var37);
            }
            this.field483.method526(3, this.field329 + var37);
            this.field483.method492(super.field795[5] == 1 ? 1 : 0);
            this.field483.method493(this.field328 + var36);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method52(int arg0) {
        if (arg0 != -26949) {
            this.method102();
        }
        if (super.field791 == 1) {
            if (super.field792 >= 6 && super.field792 <= 106 && super.field793 >= 467 && super.field793 <= 499) {
                this.field368 = (this.field368 + 1) % 4;
                this.field355 = true;
                this.field79 = true;
                this.field483.method491(8, (byte) -80);
                this.field483.method492(this.field368);
                this.field483.method492(this.field301);
                this.field483.method492(this.field112);
            }
            if (super.field792 >= 135 && super.field792 <= 235 && super.field793 >= 467 && super.field793 <= 499) {
                this.field301 = (this.field301 + 1) % 3;
                this.field355 = true;
                this.field79 = true;
                this.field483.method491(8, (byte) -80);
                this.field483.method492(this.field368);
                this.field483.method492(this.field301);
                this.field483.method492(this.field112);
            }
            if (super.field792 >= 273 && super.field792 <= 373 && super.field793 >= 467 && super.field793 <= 499) {
                this.field112 = (this.field112 + 1) % 3;
                this.field355 = true;
                this.field79 = true;
                this.field483.method491(8, (byte) -80);
                this.field483.method492(this.field368);
                this.field483.method492(this.field301);
                this.field483.method492(this.field112);
            }
            if (super.field792 >= 412 && super.field792 <= 512 && super.field793 >= 467 && super.field793 <= 499) {
                if (this.field361 == -1) {
                    this.method128(5);
                    this.field115 = "";
                    this.field248 = false;
                    this.field400 = this.field361 = class44.field1212;
                    return;
                }
                this.method44(0, "", "Please close the interface you have open before using 'report abuse'", (byte) 1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method53(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field553; ++var4) {
                if (this.field249[var4] == arg1) {
                    --this.field553;
                    this.field178 = true;
                    for (int var5 = var4; var5 < this.field553; ++var5) {
                        this.field249[var5] = this.field249[var5 + 1];
                    }
                    this.field483.method491(35, (byte) -80);
                    this.field483.method498(0, arg1);
                    break;
                }
            }
            if (arg0) {
                this.field267 = !this.field267;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method54(int arg0, int arg1) {
        if (arg0 != 6) {
            field94 = !field94;
        }
        class44.method399(6, arg1);
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method55(int arg0) {
        this.field163 += arg0;
        if (this.field176 == 0) {
            if (super.field791 == 1) {
                int var2 = super.field792 - 25 - 550;
                int var3 = super.field793 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field137 + this.field134 & 2047;
                    int var5 = class11.field680[var4];
                    int var6 = class11.field681[var4];
                    int var7 = (this.field429 + 256) * var5 >> 8;
                    int var8 = (this.field429 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field398.field1344 + var9 >> 7;
                    int var12 = field398.field1345 - var10 >> 7;
                    boolean var13 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var11, 0, 0, 0, 1, true, true, var12);
                    if (var13) {
                        this.field483.method492(var2);
                        this.field483.method492(var3);
                        this.field483.method493(this.field137);
                        this.field483.method492(57);
                        this.field483.method492(this.field134);
                        this.field483.method492(this.field429);
                        this.field483.method492(89);
                        this.field483.method493(field398.field1344);
                        this.field483.method493(field398.field1345);
                        this.field483.method492(this.field555);
                        this.field483.method492(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method56(byte arg0) {
        this.field188 = new class52(this.field451, "titlebox", 0);
        this.field189 = new class52(this.field451, "titlebutton", 0);
        this.field443 = new class52[12];
        if (arg0 == 2) {
            for (int var2 = 0; var2 < 12; ++var2) {
                this.field443[var2] = new class52(this.field451, "runes", var2);
            }
            this.field215 = new class66(128, 265);
            this.field216 = new class66(128, 265);
            for (int var3 = 0; var3 < 33920; ++var3) {
                this.field215.field1644[var3] = this.field336.field803[var3];
            }
            for (int var4 = 0; var4 < 33920; ++var4) {
                this.field216.field1644[var4] = this.field337.field803[var4];
            }
            this.field109 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                this.field109[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                this.field109[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field109[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field109[var8 + 192] = 16777215;
            }
            this.field110 = new int[256];
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field110[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field110[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field110[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field110[var12 + 192] = 16777215;
            }
            this.field111 = new int[256];
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field111[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field111[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field111[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field111[var16 + 192] = 16777215;
            }
            this.field108 = new int[256];
            this.field250 = new int[32768];
            this.field251 = new int[32768];
            this.method82(this.field154, (class52) null);
            this.field353 = new int[32768];
            this.field354 = new int[32768];
            this.method58((byte) -59, 10, "Connecting to fileserver");
            if (!this.field324) {
                this.field317 = true;
                this.field324 = true;
                this.method31(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Z")
    public final boolean method57(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field517 = this.field152.method317();
        }
        boolean var4 = false;
        class44 var5 = class44.method397(arg0);
        for (int var6 = 0; var6 < var5.field1258.length && var5.field1258[var6] != -1; ++var6) {
            class44 var7 = class44.method397(var5.field1258[var6]);
            if (var7.field1263 == 0) {
                var4 |= this.method57(var7.field1261, false, arg2);
            }
            if (var7.field1263 == 6 && (var7.field1202 != -1 || var7.field1203 != -1)) {
                boolean var8 = this.method139(var7, (byte) 77);
                int var9;
                if (var8) {
                    var9 = var7.field1203;
                } else {
                    var9 = var7.field1202;
                }
                if (var9 != -1) {
                    class41 var10 = class41.field1147[var9];
                    var7.field1229 += arg2;
                    while (var7.field1229 > var10.method390(var7.field1253, (byte) -99)) {
                        var7.field1229 -= var10.method390(var7.field1253, (byte) -99);
                        ++var7.field1253;
                        if (var7.field1253 >= var10.field1148) {
                            var7.field1253 -= var10.field1152;
                            if (var7.field1253 < 0 || var7.field1253 >= var10.field1148) {
                                var7.field1253 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1263 == 6 && var7.field1252 != 0) {
                int var11 = var7.field1252 >> 16;
                int var12 = var7.field1252 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field1206 = var7.field1206 + var13 & 2047;
                var7.field1207 = var7.field1207 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;)V")
    public final void method58(byte arg0, int arg1, String arg2) {
        this.field504 = arg1;
        this.field237 = arg2;
        this.method140(560);
        if (arg0 != -59) {
            this.field238 = 303;
        }
        if (this.field451 == null) {
            super.method58((byte) -59, arg1, arg2);
        } else {
            this.field335.method245(this.field463);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field419.method12(var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", var4 / 2, 16777215, 0);
            int var7 = var5 / 2 - 18 - var6;
            class72.method598(34, 304, true, 9179409, var7, var4 / 2 - 152);
            class72.method598(32, 302, true, 0, var7 + 1, var4 / 2 - 151);
            class72.method597(arg1 * 3, 9179409, 30, var4 / 2 - 150, this.field357, var7 + 2);
            class72.method597(300 - arg1 * 3, 0, 30, arg1 * 3 + (var4 / 2 - 150), this.field357, var7 + 2);
            this.field419.method12(var5 / 2 + 5 - var6, arg2, var4 / 2, 16777215, 0);
            this.field335.method246(171, super.field777, 202, 1);
            if (this.field202) {
                this.field202 = false;
                if (!this.field324) {
                    this.field336.method246(0, super.field777, 0, 1);
                    this.field337.method246(0, super.field777, 637, 1);
                }
                this.field333.method246(0, super.field777, 128, 1);
                this.field334.method246(371, super.field777, 202, 1);
                this.field338.method246(265, super.field777, 0, 1);
                this.field339.method246(265, super.field777, 562, 1);
                this.field340.method246(171, super.field777, 128, 1);
                this.field341.method246(171, super.field777, 562, 1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLWNCFPLWV;I)V")
    private final void method59(byte arg0, class63 arg1, int arg2) {
        if (arg0 != 9) {
            this.method102();
        }
        int var4 = arg1.method513(8, 0);
        if (var4 < this.field284) {
            for (int var5 = var4; var5 < this.field284; ++var5) {
                this.field96[this.field95++] = this.field285[var5];
            }
        }
        if (var4 > this.field284) {
            signlink.reporterror(this.field279 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field284 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field285[var6];
                class65 var8 = this.field283[var7];
                int var9 = arg1.method513(1, 0);
                if (var9 == 0) {
                    this.field285[this.field284++] = var7;
                    var8.field1328 = field261;
                } else {
                    int var10 = arg1.method513(2, 0);
                    if (var10 == 0) {
                        this.field285[this.field284++] = var7;
                        var8.field1328 = field261;
                        this.field287[this.field286++] = var7;
                    } else if (var10 == 1) {
                        this.field285[this.field284++] = var7;
                        var8.field1328 = field261;
                        int var11 = arg1.method513(3, 0);
                        var8.method410(false, var11, 9);
                        int var12 = arg1.method513(1, 0);
                        if (var12 == 1) {
                            this.field287[this.field286++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field285[this.field284++] = var7;
                        var8.field1328 = field261;
                        int var13 = arg1.method513(3, 0);
                        var8.method410(true, var13, 9);
                        int var14 = arg1.method513(3, 0);
                        var8.method410(true, var14, 9);
                        int var15 = arg1.method513(1, 0);
                        if (var15 == 1) {
                            this.field287[this.field286++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field96[this.field95++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method60(boolean arg0) {
        if (super.field778 == null) {
            this.method46(17);
            this.field333 = null;
            if (!arg0) {
                this.field334 = null;
                this.field335 = null;
                this.field336 = null;
                this.field337 = null;
                this.field338 = null;
                this.field339 = null;
                this.field340 = null;
                this.field341 = null;
                this.field314 = null;
                this.field312 = null;
                this.field311 = null;
                this.field313 = null;
                this.field464 = null;
                this.field465 = null;
                this.field466 = null;
                super.field778 = new class17(3, 503, 765, this.method117(0));
                this.field202 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LWNCFPLWV;LWQWDCUWR;III)V")
    private final void method61(class63 arg0, class65 arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0) {
            this.method102();
        }
        if ((arg3 & 1) != 0) {
            int var6 = arg0.method504();
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg0.method502();
            if (arg1.field1311 == var6 && var6 != -1) {
                int var8 = class41.field1147[var6].field1161;
                if (var8 == 1) {
                    arg1.field1312 = 0;
                    arg1.field1313 = 0;
                    arg1.field1314 = var7;
                    arg1.field1315 = 0;
                }
                if (var8 == 2) {
                    arg1.field1315 = 0;
                }
            } else if (var6 == -1 || arg1.field1311 == -1 || class41.field1147[var6].field1155 >= class41.field1147[arg1.field1311].field1155) {
                arg1.field1311 = var6;
                arg1.field1312 = 0;
                arg1.field1313 = 0;
                arg1.field1314 = var7;
                arg1.field1315 = 0;
                arg1.field1343 = arg1.field1329;
            }
        }
        if ((arg3 & 512) != 0) {
            arg1.field1304 = arg0.method502();
            arg1.field1306 = arg0.method521(true);
            arg1.field1305 = arg0.method502();
            arg1.field1307 = arg0.method502();
            arg1.field1308 = arg0.method530(255) + field261;
            arg1.field1309 = arg0.method530(255) + field261;
            arg1.field1310 = arg0.method522(0);
            arg1.method409(37498);
        }
        if ((arg3 & 128) != 0) {
            int var9 = arg0.method520(-37135);
            byte[] var10 = new byte[var9];
            class63 var11 = new class63((byte) -58, var10);
            arg0.method539(0, var9, 7, var10);
            this.field288[arg4] = var11;
            arg1.method544(var11, 0);
        }
        if ((arg3 & 64) != 0) {
            arg1.field1297 = arg0.method509();
            if (arg1.field1297.charAt(0) == '~') {
                arg1.field1297 = arg1.field1297.substring(1);
                this.method44(2, arg1.field1628, arg1.field1297, (byte) 1);
            } else if (field398 == arg1) {
                this.method44(2, arg1.field1628, arg1.field1297, (byte) 1);
            }
            arg1.field1301 = 0;
            arg1.field1338 = 0;
            arg1.field1351 = 150;
        }
        if ((arg3 & 4) != 0) {
            arg1.field1316 = arg0.method529((byte) 6);
            arg1.field1317 = arg0.method529((byte) 6);
        }
        if ((arg3 & 16) != 0) {
            int var12 = arg0.method530(255);
            int var13 = arg0.method522(0);
            int var14 = arg0.method522(0);
            int var15 = arg0.field1571;
            if (arg1.field1628 != null && arg1.field1631) {
                long var16 = class19.method286(arg1.field1628);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < this.field553; ++var19) {
                        if (this.field249[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && this.field117 == 0) {
                    try {
                        this.field486.field1571 = 0;
                        arg0.method538(0, false, var14, this.field486.field1570);
                        this.field486.field1571 = 0;
                        String var20 = class30.method320(var14, this.field486, -21362);
                        String var21 = class18.method258(var20, true);
                        arg1.field1297 = var21;
                        arg1.field1301 = var12 >> 8;
                        arg1.field1338 = var12 & 255;
                        arg1.field1351 = 150;
                        if (var13 != 2 && var13 != 3) {
                            if (var13 == 1) {
                                this.method44(1, "@cr1@" + arg1.field1628, var21, (byte) 1);
                            } else {
                                this.method44(2, arg1.field1628, var21, (byte) 1);
                            }
                        } else {
                            this.method44(1, "@cr2@" + arg1.field1628, var21, (byte) 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field1571 = var14 + var15;
        }
        if ((arg3 & 2) != 0) {
            arg1.field1339 = arg0.method530(255);
            if (arg1.field1339 == 65535) {
                arg1.field1339 = -1;
            }
        }
        if ((arg3 & 1024) != 0) {
            arg1.field1319 = arg0.method530(255);
            int var23 = arg0.method537(this.field432);
            arg1.field1323 = var23 >> 16;
            arg1.field1322 = (var23 & 65535) + field261;
            arg1.field1320 = 0;
            arg1.field1321 = 0;
            if (arg1.field1322 > field261) {
                arg1.field1320 = -1;
            }
            if (arg1.field1319 == 65535) {
                arg1.field1319 = -1;
            }
        }
        if ((arg3 & 8) != 0) {
            int var24 = arg0.method522(0);
            int var25 = arg0.method522(0);
            arg1.method412(var25, this.field242, field261, var24);
            arg1.field1340 = field261 + 300;
            arg1.field1341 = arg0.method520(-37135);
            arg1.field1342 = arg0.method522(0);
        }
        if ((arg3 & 256) != 0) {
            int var26 = arg0.method522(0);
            int var27 = arg0.method520(-37135);
            arg1.method412(var27, this.field242, field261, var26);
            arg1.field1340 = field261 + 300;
            arg1.field1341 = arg0.method522(0);
            arg1.field1342 = arg0.method521(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method62(byte arg0) {
        if (this.field346 != arg0) {
            this.field164 = -1;
        }
        for (class47 var2 = (class47) this.field200.method485(); var2 != null; var2 = (class47) this.field200.method487(6)) {
            if (this.field205 == var2.field1293 && !var2.field1290) {
                if (field261 >= var2.field1288) {
                    var2.method407(-24812, this.field174);
                    if (var2.field1290) {
                        var2.method327();
                    } else {
                        this.field452.method340(false, 32536, var2.field1293, var2, 0, var2.field1295, 60, var2.field1296, var2.field1294, -1);
                    }
                }
            } else {
                var2.method327();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method63(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public static final void method64(int arg0) {
        class35.field972 = false;
        class11.field671 = false;
        field149 = false;
        class68.field1692 = false;
        class9.field642 = false;
        if (arg0 != -23613) {
            field428 = -357;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILWNCFPLWV;I)V")
    private final void method65(int arg0, class63 arg1, int arg2) {
        if (arg0 == 27810) {
            while (arg1.field1572 + 21 < arg2 * 8) {
                int var4 = arg1.method513(14, 0);
                if (var4 == 16383) {
                    break;
                }
                if (this.field487[var4] == null) {
                    this.field487[var4] = new class55();
                }
                class55 var5 = this.field487[var4];
                this.field489[this.field488++] = var4;
                var5.field1328 = field261;
                int var6 = arg1.method513(5, 0);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg1.method513(5, 0);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg1.method513(1, 0);
                if (var8 == 1) {
                    this.field287[this.field286++] = var4;
                }
                int var9 = arg1.method513(1, 0);
                var5.field1422 = class2.method4(arg1.method513(13, 0));
                var5.field1326 = var5.field1422.field29;
                var5.field1318 = var5.field1422.field51;
                var5.field1334 = var5.field1422.field24;
                var5.field1335 = var5.field1422.field39;
                var5.field1336 = var5.field1422.field18;
                var5.field1337 = var5.field1422.field48;
                var5.field1298 = var5.field1422.field40;
                var5.method411(field398.field1324[0] + var6, (byte) 4, var9 == 1, field398.field1325[0] + var7);
            }
            arg1.method514(-18093);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method66(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field235 >= 100 && this.field80 != 1) {
                this.method44(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", (byte) 1);
            } else if (this.field235 >= 200) {
                this.method44(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", (byte) 1);
            } else {
                String var4 = class19.method290(true, class19.method287(false, arg0));
                if (arg1 == -34932) {
                    for (int var5 = 0; var5 < this.field235; ++var5) {
                        if (this.field210[var5] == arg0) {
                            this.method44(0, "", var4 + " is already on your friend list", (byte) 1);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field553; ++var6) {
                        if (this.field249[var6] == arg0) {
                            this.method44(0, "", "Please remove " + var4 + " from your ignore list first", (byte) 1);
                            return;
                        }
                    }
                    if (!var4.equals(field398.field1628)) {
                        this.field442[this.field235] = var4;
                        this.field210[this.field235] = arg0;
                        this.field469[this.field235] = 0;
                        ++this.field235;
                        this.field178 = true;
                        this.field483.method491(128, (byte) -80);
                        this.field483.method498(0, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method67(boolean arg0) {
        if (this.field404 == 0) {
            int var2 = super.field791;
            if (!arg0) {
                this.field559 = null;
            }
            if (this.field564 == 1 && super.field792 >= 516 && super.field793 >= 160 && super.field792 <= 765 && super.field793 <= 205) {
                var2 = 0;
            }
            if (this.field481) {
                if (var2 != 1) {
                    int var3 = super.field785;
                    int var4 = super.field786;
                    if (this.field476 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field476 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field476 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field477 - 10 || var3 > this.field479 + this.field477 + 10 || var4 < this.field478 - 10 || var4 > this.field480 + this.field478 + 10) {
                        this.field481 = false;
                        if (this.field476 == 1) {
                            this.field178 = true;
                        }
                        if (this.field476 == 2) {
                            this.field79 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field477;
                    int var6 = this.field478;
                    int var7 = this.field479;
                    int var8 = super.field792;
                    int var9 = super.field793;
                    if (this.field476 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field476 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field476 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field552; ++var11) {
                        int var12 = (this.field552 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method69(-718, var10);
                    }
                    this.field481 = false;
                    if (this.field476 == 1) {
                        this.field178 = true;
                    }
                    if (this.field476 == 2) {
                        this.field79 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field552 > 0) {
                    int var13 = this.field525[this.field552 - 1];
                    if (var13 == 190 || var13 == 669 || var13 == 516 || var13 == 173 || var13 == 237 || var13 == 205 || var13 == 755 || var13 == 848 || var13 == 840 || var13 == 280 || var13 == 18 || var13 == 1156) {
                        int var14 = this.field523[this.field552 - 1];
                        int var15 = this.field524[this.field552 - 1];
                        class44 var16 = class44.method397(var15);
                        if (var16.field1238 || var16.field1222) {
                            this.field549 = false;
                            this.field118 = 0;
                            this.field402 = var15;
                            this.field403 = var14;
                            this.field404 = 2;
                            this.field405 = super.field792;
                            this.field406 = super.field793;
                            if (class44.method397(var15).field1216 == this.field361) {
                                this.field404 = 1;
                            }
                            if (class44.method397(var15).field1216 == this.field116) {
                                this.field404 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field440 == 1 || this.method84(this.field257, this.field552 - 1)) && this.field552 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field552 > 0) {
                    this.method69(-718, this.field552 - 1);
                }
                if (var2 != 2 || this.field552 <= 0) {
                    return;
                }
                this.method72((byte) 3);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILWQWDCUWR;II)V")
    public final void method68(int arg0, int arg1, class65 arg2, int arg3, int arg4) {
        if (field398 != arg2) {
            if (this.field552 < 400) {
                if (arg1 >= 0) {
                    this.field295 = !this.field295;
                }
                String var6;
                if (arg2.field1630 == 0) {
                    var6 = arg2.field1628 + method115((byte) -45, arg2.field1637, field398.field1637) + " (level-" + arg2.field1637 + ")";
                } else {
                    var6 = arg2.field1628 + " (skill-" + arg2.field1630 + ")";
                }
                if (this.field190 == 1) {
                    this.field433[this.field552] = "Use " + this.field194 + " with @whi@" + var6;
                    this.field525[this.field552] = 411;
                    this.field526[this.field552] = arg0;
                    this.field523[this.field552] = arg4;
                    this.field524[this.field552] = arg3;
                    ++this.field552;
                } else if (this.field564 == 1) {
                    if ((this.field566 & 8) == 8) {
                        this.field433[this.field552] = this.field567 + " @whi@" + var6;
                        this.field525[this.field552] = 483;
                        this.field526[this.field552] = arg0;
                        this.field523[this.field552] = arg4;
                        this.field524[this.field552] = arg3;
                        ++this.field552;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field309[var7] != null) {
                            this.field433[this.field552] = this.field309[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field309[var7].equalsIgnoreCase("attack")) {
                                if (arg2.field1637 > field398.field1637) {
                                    var9 = 2000;
                                }
                                if (field398.field1627 != 0 && arg2.field1627 != 0) {
                                    if (field398.field1627 == arg2.field1627) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field310[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field525[this.field552] = var9 + 710;
                            }
                            if (var7 == 1) {
                                this.field525[this.field552] = var9 + 116;
                            }
                            if (var7 == 2) {
                                this.field525[this.field552] = var9 + 149;
                            }
                            if (var7 == 3) {
                                this.field525[this.field552] = var9 + 750;
                            }
                            if (var7 == 4) {
                                this.field525[this.field552] = var9 + 740;
                            }
                            this.field526[this.field552] = arg0;
                            this.field523[this.field552] = arg4;
                            this.field524[this.field552] = arg3;
                            ++this.field552;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field552; ++var8) {
                    if (this.field525[var8] == 599) {
                        this.field433[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.method102();
        }
        if (arg1 >= 0) {
            int var3 = this.field523[arg1];
            int var4 = this.field524[arg1];
            int var5 = this.field525[arg1];
            int var6 = this.field526[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field511 != 0 && var5 != 1725) {
                this.field511 = 0;
                this.field79 = true;
            }
            if (var5 == 497) {
                boolean var7 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var3, 0, 0, 0, 2, true, false, var4);
                if (!var7) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var3, 0, 1, 0, 2, true, false, var4);
                }
                this.field519 = super.field792;
                this.field520 = super.field793;
                this.field522 = 2;
                this.field521 = 0;
                ++field345;
                if (field345 >= 114) {
                    this.field483.method491(153, (byte) -80);
                    this.field483.method496(0);
                    field345 = 0;
                }
                this.field483.method491(251, (byte) -80);
                this.field483.method527(this.field329 + var4, 7);
                this.field483.method528((byte) 8, var6);
                this.field483.method528((byte) 8, this.field328 + var3);
            }
            if (var5 == 560) {
                this.field483.method491(170, (byte) -80);
                this.field483.method527(var6, 7);
                this.field483.method527(var3, 7);
                this.field483.method526(3, var4);
                this.field483.method526(3, this.field565);
                this.field128 = 0;
                this.field129 = var4;
                this.field130 = var3;
                this.field131 = 2;
                if (class44.method397(var4).field1216 == this.field361) {
                    this.field131 = 1;
                }
                if (class44.method397(var4).field1216 == this.field116) {
                    this.field131 = 3;
                }
            }
            if (var5 == 277 && this.method85(var3, (byte) 59, var4, var6)) {
                this.field483.method491(185, (byte) -80);
                this.field483.method526(3, this.field329 + var4);
                this.field483.method528((byte) 8, this.field328 + var3);
                this.field483.method526(3, this.field565);
                this.field483.method528((byte) 8, var6 >> 14 & 32767);
            }
            if (var5 == 144) {
                this.field483.method491(176, (byte) -80);
                this.field483.method493(var4);
                class44 var9 = class44.method397(var4);
                if (var9.field1221 != null && var9.field1221[0][0] == 5) {
                    int var10 = var9.field1221[0][1];
                    this.field534[var10] = 1 - this.field534[var10];
                    this.method95(var10, 0);
                    this.field178 = true;
                }
            }
            if (var5 == 1156) {
                class12 var11 = class12.method218(var6);
                class44 var12 = class44.method397(var4);
                String var13;
                if (var12 != null && var12.field1211[var3] >= 100000) {
                    var13 = var12.field1211[var3] + " x " + var11.field705;
                } else if (var11.field742 != null) {
                    var13 = new String(var11.field742);
                } else {
                    var13 = "It's a " + var11.field705 + ".";
                }
                this.method44(0, "", var13, (byte) 1);
            }
            if (var5 == 884) {
                class55 var14 = this.field487[var6];
                if (var14 != null) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var14.field1324[0], 0, 1, 0, 2, true, false, var14.field1325[0]);
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(72, (byte) -80);
                    this.field483.method493(var6);
                }
            }
            if (var5 == 825) {
                class55 var15 = this.field487[var6];
                if (var15 != null) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var15.field1324[0], 0, 1, 0, 2, true, false, var15.field1325[0]);
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    field462 += var6;
                    if (field462 >= 146) {
                        this.field483.method491(245, (byte) -80);
                        this.field483.method493(3789);
                        field462 = 0;
                    }
                    this.field483.method491(5, (byte) -80);
                    this.field483.method493(var6);
                }
            }
            if (var5 == 959) {
                class55 var16 = this.field487[var6];
                if (var16 != null) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var16.field1324[0], 0, 1, 0, 2, true, false, var16.field1325[0]);
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(220, (byte) -80);
                    this.field483.method526(3, this.field565);
                    this.field483.method493(var6);
                }
            }
            if (var5 == 264) {
                boolean var17 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var3, 0, 0, 0, 2, true, false, var4);
                if (!var17) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var3, 0, 1, 0, 2, true, false, var4);
                }
                this.field519 = super.field792;
                this.field520 = super.field793;
                this.field522 = 2;
                this.field521 = 0;
                this.field483.method491(181, (byte) -80);
                this.field483.method528((byte) 8, this.field329 + var4);
                this.field483.method527(var6, 7);
                this.field483.method527(this.field328 + var3, 7);
            }
            if (var5 == 750) {
                class65 var19 = this.field283[var6];
                if (var19 != null) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var19.field1324[0], 0, 1, 0, 2, true, false, var19.field1325[0]);
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(14, (byte) -80);
                    this.field483.method493(var6);
                }
            }
            if (var5 == 840) {
                this.field483.method491(225, (byte) -80);
                this.field483.method527(var6, 7);
                this.field483.method527(var3, 7);
                this.field483.method527(var4, 7);
                this.field128 = 0;
                this.field129 = var4;
                this.field130 = var3;
                this.field131 = 2;
                if (class44.method397(var4).field1216 == this.field361) {
                    this.field131 = 1;
                }
                if (class44.method397(var4).field1216 == this.field116) {
                    this.field131 = 3;
                }
            }
            if (var5 == 265) {
                boolean var20 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var3, 0, 0, 0, 2, true, false, var4);
                if (!var20) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var3, 0, 1, 0, 2, true, false, var4);
                }
                this.field519 = super.field792;
                this.field520 = super.field793;
                this.field522 = 2;
                this.field521 = 0;
                this.field483.method491(41, (byte) -80);
                this.field483.method526(3, this.field329 + var4);
                this.field483.method493(var6);
                this.field483.method493(this.field328 + var3);
            }
            if (var5 == 369) {
                class55 var22 = this.field487[var6];
                if (var22 != null) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var22.field1324[0], 0, 1, 0, 2, true, false, var22.field1325[0]);
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(135, (byte) -80);
                    this.field483.method528((byte) 8, var6);
                }
            }
            if (var5 == 1250) {
                class55 var23 = this.field487[var6];
                if (var23 != null) {
                    class2 var24 = var23.field1422;
                    if (var24.field38 != null) {
                        var24 = var24.method6(324);
                    }
                    if (var24 != null) {
                        String var25;
                        if (var24.field15 != null) {
                            var25 = new String(var24.field15);
                        } else {
                            var25 = "It's a " + var24.field30 + ".";
                        }
                        this.method44(0, "", var25, (byte) 1);
                    }
                }
            }
            if (var5 == 755) {
                this.field483.method491(149, (byte) -80);
                this.field483.method527(var4, 7);
                this.field483.method527(var3, 7);
                this.field483.method493(var6);
                this.field128 = 0;
                this.field129 = var4;
                this.field130 = var3;
                this.field131 = 2;
                if (class44.method397(var4).field1216 == this.field361) {
                    this.field131 = 1;
                }
                if (class44.method397(var4).field1216 == this.field116) {
                    this.field131 = 3;
                }
            }
            if (var5 == 282) {
                class44 var26 = class44.method397(var4);
                boolean var27 = true;
                if (var26.field1228 > 0) {
                    var27 = this.method155(var26, (byte) 8);
                }
                if (var27) {
                    this.field483.method491(176, (byte) -80);
                    this.field483.method493(var4);
                }
            }
            if (var5 == 848) {
                this.field483.method491(143, (byte) -80);
                this.field483.method526(3, var4);
                this.field483.method526(3, var3);
                this.field483.method493(var6);
                this.field128 = 0;
                this.field129 = var4;
                this.field130 = var3;
                this.field131 = 2;
                if (class44.method397(var4).field1216 == this.field361) {
                    this.field131 = 1;
                }
                if (class44.method397(var4).field1216 == this.field116) {
                    this.field131 = 3;
                }
            }
            if (var5 == 516) {
                this.field483.method491(142, (byte) -80);
                this.field483.method527(var3, 7);
                this.field483.method493(var4);
                this.field483.method526(3, var6);
                this.field128 = 0;
                this.field129 = var4;
                this.field130 = var3;
                this.field131 = 2;
                if (class44.method397(var4).field1216 == this.field361) {
                    this.field131 = 1;
                }
                if (class44.method397(var4).field1216 == this.field116) {
                    this.field131 = 3;
                }
            }
            if (var5 == 669) {
                this.field483.method491(187, (byte) -80);
                this.field483.method527(var6, 7);
                this.field483.method526(3, var4);
                this.field483.method528((byte) 8, var3);
                this.field128 = 0;
                this.field129 = var4;
                this.field130 = var3;
                this.field131 = 2;
                if (class44.method397(var4).field1216 == this.field361) {
                    this.field131 = 1;
                }
                if (class44.method397(var4).field1216 == this.field116) {
                    this.field131 = 3;
                }
            }
            if (var5 == 708) {
                class55 var28 = this.field487[var6];
                if (var28 != null) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var28.field1324[0], 0, 1, 0, 2, true, false, var28.field1325[0]);
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(160, (byte) -80);
                    this.field483.method526(3, var6);
                }
            }
            if (var5 == 190) {
                this.field483.method491(183, (byte) -80);
                this.field483.method526(3, var4);
                this.field483.method528((byte) 8, var6);
                this.field483.method527(var3, 7);
                this.field128 = 0;
                this.field129 = var4;
                this.field130 = var3;
                this.field131 = 2;
                if (class44.method397(var4).field1216 == this.field361) {
                    this.field131 = 1;
                }
                if (class44.method397(var4).field1216 == this.field116) {
                    this.field131 = 3;
                }
            }
            if (var5 == 599) {
                if (!this.field481) {
                    this.field452.method367(0, super.field793 - 4, super.field792 - 4);
                } else {
                    this.field452.method367(0, var4 - 4, var3 - 4);
                }
            }
            if (var5 == 1247) {
                class12 var29 = class12.method218(var6);
                String var30;
                if (var29.field742 != null) {
                    var30 = new String(var29.field742);
                } else {
                    var30 = "It's a " + var29.field705 + ".";
                }
                this.method44(0, "", var30, (byte) 1);
            }
            if (var5 == 625) {
                class55 var31 = this.field487[var6];
                if (var31 != null) {
                    this.method51(1, field398.field1325[0], field398.field1324[0], 0, var31.field1324[0], 0, 1, 0, 2, true, false, var31.field1325[0]);
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(82, (byte) -80);
                    this.field483.method527(this.field192, 7);
                    this.field483.method526(3, var6);
                    this.field483.method528((byte) 8, this.field193);
                    this.field483.method528((byte) 8, this.field191);
                }
            }
            if (var5 == 112) {
                this.field483.method491(172, (byte) -80);
                this.field483.method528((byte) 8, this.field191);
                this.field483.method493(this.field193);
                this.field483.method493(var3);
                this.field483.method527(this.field192, 7);
                this.field483.method528((byte) 8, var4);
                this.field483.method526(3, var6);
                this.field128 = 0;
                this.field129 = var4;
                this.field130 = var3;
                this.field131 = 2;
                if (class44.method397(var4).field1216 == this.field361) {
                    this.field131 = 1;
                }
                if (class44.method397(var4).field1216 == this.field116) {
                    this.field131 = 3;
                }
            }
            if (var5 == 18) {
                this.field190 = 1;
                this.field191 = var3;
                this.field192 = var4;
                this.field193 = var6;
                this.field194 = String.valueOf(class12.method218(var6).field705);
                this.field564 = 0;
                this.field178 = true;
            } else {
                if (var5 == 393) {
                    this.field483.method491(176, (byte) -80);
                    this.field483.method493(var4);
                    class44 var32 = class44.method397(var4);
                    if (var32.field1221 != null && var32.field1221[0][0] == 5) {
                        int var33 = var32.field1221[0][1];
                        if (this.field534[var33] != var32.field1214[0]) {
                            this.field534[var33] = var32.field1214[0];
                            this.method95(var33, 0);
                            this.field178 = true;
                        }
                    }
                }
                if (var5 == 545) {
                    String var34 = this.field433[arg1];
                    int var35 = var34.indexOf("@whi@");
                    if (var35 != -1) {
                        if (this.field361 == -1) {
                            this.method128(5);
                            this.field115 = var34.substring(var35 + 5).trim();
                            this.field248 = false;
                            this.field400 = this.field361 = class44.field1212;
                        } else {
                            this.method44(0, "", "Please close the interface you have open before using 'report abuse'", (byte) 1);
                        }
                    }
                }
                if (var5 == 964) {
                    boolean var36 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var3, 0, 0, 0, 2, true, false, var4);
                    if (!var36) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var3, 0, 1, 0, 2, true, false, var4);
                    }
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(31, (byte) -80);
                    this.field483.method526(3, this.field193);
                    this.field483.method493(var6);
                    this.field483.method527(this.field191, 7);
                    this.field483.method527(this.field329 + var4, 7);
                    this.field483.method526(3, this.field328 + var3);
                    this.field483.method526(3, this.field192);
                }
                if (var5 == 237) {
                    this.field483.method491(224, (byte) -80);
                    this.field483.method527(var3, 7);
                    this.field483.method526(3, var6);
                    this.field483.method526(3, var4);
                    this.field128 = 0;
                    this.field129 = var4;
                    this.field130 = var3;
                    this.field131 = 2;
                    if (class44.method397(var4).field1216 == this.field361) {
                        this.field131 = 1;
                    }
                    if (class44.method397(var4).field1216 == this.field116) {
                        this.field131 = 3;
                    }
                }
                if (var5 == 710) {
                    class65 var38 = this.field283[var6];
                    if (var38 != null) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var38.field1324[0], 0, 1, 0, 2, true, false, var38.field1325[0]);
                        this.field519 = super.field792;
                        this.field520 = super.field793;
                        this.field522 = 2;
                        this.field521 = 0;
                        this.field483.method491(53, (byte) -80);
                        this.field483.method493(var6);
                    }
                }
                if (var5 == 1436) {
                    this.method85(var3, (byte) 59, var4, var6);
                    this.field483.method491(222, (byte) -80);
                    this.field483.method527(var6 >> 14 & 32767, 7);
                    this.field483.method527(this.field328 + var3, 7);
                    this.field483.method526(3, this.field329 + var4);
                }
                if (var5 == 194) {
                    this.method128(5);
                }
                if (var5 == 756) {
                    boolean var39 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var3, 0, 0, 0, 2, true, false, var4);
                    if (!var39) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var3, 0, 1, 0, 2, true, false, var4);
                    }
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(248, (byte) -80);
                    this.field483.method528((byte) 8, var6);
                    this.field483.method493(this.field328 + var3);
                    this.field483.method527(this.field565, 7);
                    this.field483.method493(this.field329 + var4);
                }
                if (var5 == 448) {
                    boolean var41 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var3, 0, 0, 0, 2, true, false, var4);
                    if (!var41) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var3, 0, 1, 0, 2, true, false, var4);
                    }
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    this.field483.method491(46, (byte) -80);
                    this.field483.method528((byte) 8, var6);
                    this.field483.method493(this.field328 + var3);
                    this.field483.method493(this.field329 + var4);
                }
                if (var5 == 52 || var5 == 285) {
                    String var43 = this.field433[arg1];
                    int var44 = var43.indexOf("@whi@");
                    if (var44 != -1) {
                        String var45 = var43.substring(var44 + 5).trim();
                        String var46 = class19.method290(true, class19.method287(false, class19.method286(var45)));
                        boolean var47 = false;
                        for (int var48 = 0; var48 < this.field284; ++var48) {
                            class65 var49 = this.field283[this.field285[var48]];
                            if (var49 != null && var49.field1628 != null && var49.field1628.equalsIgnoreCase(var46)) {
                                this.method51(1, field398.field1325[0], field398.field1324[0], 0, var49.field1324[0], 0, 1, 0, 2, true, false, var49.field1325[0]);
                                if (var5 == 52) {
                                    this.field483.method491(14, (byte) -80);
                                    this.field483.method493(this.field285[var48]);
                                }
                                if (var5 == 285) {
                                    this.field483.method491(53, (byte) -80);
                                    this.field483.method493(this.field285[var48]);
                                }
                                var47 = true;
                                break;
                            }
                        }
                        if (!var47) {
                            this.method44(0, "", "Unable to find " + var46, (byte) 1);
                        }
                    }
                }
                if (var5 == 134) {
                    this.method85(var3, (byte) 59, var4, var6);
                    this.field483.method491(85, (byte) -80);
                    this.field483.method528((byte) 8, this.field329 + var4);
                    this.field483.method527(this.field328 + var3, 7);
                    this.field483.method527(var6 >> 14 & 32767, 7);
                }
                if (var5 == 280) {
                    this.field483.method491(106, (byte) -80);
                    this.field483.method526(3, var6);
                    this.field483.method527(var4, 7);
                    this.field483.method526(3, var3);
                    this.field128 = 0;
                    this.field129 = var4;
                    this.field130 = var3;
                    this.field131 = 2;
                    if (class44.method397(var4).field1216 == this.field361) {
                        this.field131 = 1;
                    }
                    if (class44.method397(var4).field1216 == this.field116) {
                        this.field131 = 3;
                    }
                }
                if (var5 == 205) {
                    this.field483.method491(109, (byte) -80);
                    this.field483.method493(var3);
                    this.field483.method493(var4);
                    this.field483.method527(var6, 7);
                    this.field128 = 0;
                    this.field129 = var4;
                    this.field130 = var3;
                    this.field131 = 2;
                    if (class44.method397(var4).field1216 == this.field361) {
                        this.field131 = 1;
                    }
                    if (class44.method397(var4).field1216 == this.field116) {
                        this.field131 = 3;
                    }
                }
                if (var5 == 116) {
                    class65 var50 = this.field283[var6];
                    if (var50 != null) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var50.field1324[0], 0, 1, 0, 2, true, false, var50.field1325[0]);
                        this.field519 = super.field792;
                        this.field520 = super.field793;
                        this.field522 = 2;
                        this.field521 = 0;
                        this.field483.method491(254, (byte) -80);
                        this.field483.method526(3, var6);
                    }
                }
                if (var5 == 1286) {
                    int var51 = var6 >> 14 & 32767;
                    class9 var52 = class9.method184(var51);
                    String var53;
                    if (var52.field664 != null) {
                        var53 = new String(var52.field664);
                    } else {
                        var53 = "It's a " + var52.field631 + ".";
                    }
                    this.method44(0, "", var53, (byte) 1);
                }
                if (var5 == 203) {
                    field427 += var4;
                    if (field427 >= 77) {
                        this.field483.method491(208, (byte) -80);
                        this.field483.method492(154);
                        field427 = 0;
                    }
                    this.method85(var3, (byte) 59, var4, var6);
                    this.field483.method491(112, (byte) -80);
                    this.field483.method526(3, this.field328 + var3);
                    this.field483.method526(3, this.field329 + var4);
                    this.field483.method493(var6 >> 14 & 32767);
                }
                if (var5 == 483) {
                    class65 var54 = this.field283[var6];
                    if (var54 != null) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var54.field1324[0], 0, 1, 0, 2, true, false, var54.field1325[0]);
                        this.field519 = super.field792;
                        this.field520 = super.field793;
                        this.field522 = 2;
                        this.field521 = 0;
                        this.field483.method491(66, (byte) -80);
                        this.field483.method493(this.field565);
                        this.field483.method528((byte) 8, var6);
                    }
                }
                if (var5 == 493 || var5 == 968 || var5 == 366 || var5 == 453) {
                    String var55 = this.field433[arg1];
                    int var56 = var55.indexOf("@whi@");
                    if (var56 != -1) {
                        long var57 = class19.method286(var55.substring(var56 + 5).trim());
                        if (var5 == 493) {
                            this.method66(var57, -34932);
                        }
                        if (var5 == 968) {
                            this.method141(var57, this.field84);
                        }
                        if (var5 == 366) {
                            this.method167(2, var57);
                        }
                        if (var5 == 453) {
                            this.method53(false, var57);
                        }
                    }
                }
                if (var5 == 886) {
                    this.method85(var3, (byte) 59, var4, var6);
                    this.field483.method491(71, (byte) -80);
                    this.field483.method527(var6 >> 14 & 32767, 7);
                    this.field483.method527(this.field329 + var4, 7);
                    this.field483.method493(this.field328 + var3);
                }
                if (var5 == 645) {
                    this.method85(var3, (byte) 59, var4, var6);
                    this.field483.method491(218, (byte) -80);
                    this.field483.method493(this.field329 + var4);
                    this.field483.method528((byte) 8, this.field328 + var3);
                    this.field483.method526(3, var6 >> 14 & 32767);
                }
                if (var5 == 830) {
                    boolean var59 = this.method51(0, field398.field1325[0], field398.field1324[0], 0, var3, 0, 0, 0, 2, true, false, var4);
                    if (!var59) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var3, 0, 1, 0, 2, true, false, var4);
                    }
                    this.field519 = super.field792;
                    this.field520 = super.field793;
                    this.field522 = 2;
                    this.field521 = 0;
                    ++field254;
                    if (field254 >= 89) {
                        this.field483.method491(73, (byte) -80);
                        this.field483.method492(156);
                        field254 = 0;
                    }
                    this.field483.method491(54, (byte) -80);
                    this.field483.method528((byte) 8, this.field329 + var4);
                    this.field483.method493(var6);
                    this.field483.method528((byte) 8, this.field328 + var3);
                }
                if (var5 == 149) {
                    class65 var61 = this.field283[var6];
                    if (var61 != null) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var61.field1324[0], 0, 1, 0, 2, true, false, var61.field1325[0]);
                        this.field519 = super.field792;
                        this.field520 = super.field793;
                        this.field522 = 2;
                        this.field521 = 0;
                        this.field483.method491(147, (byte) -80);
                        this.field483.method493(var6);
                    }
                }
                if (var5 == 740) {
                    class65 var62 = this.field283[var6];
                    if (var62 != null) {
                        this.method51(1, field398.field1325[0], field398.field1324[0], 0, var62.field1324[0], 0, 1, 0, 2, true, false, var62.field1325[0]);
                        this.field519 = super.field792;
                        this.field520 = super.field793;
                        this.field522 = 2;
                        this.field521 = 0;
                        if ((var6 & 3) == 0) {
                            ++field327;
                        }
                        if (field327 >= 135) {
                            this.field483.method491(127, (byte) -80);
                            this.field483.method493(42923);
                            field327 = 0;
                        }
                        this.field483.method491(58, (byte) -80);
                        this.field483.method528((byte) 8, var6);
                    }
                }
                if (var5 == 173) {
                    this.field483.method491(237, (byte) -80);
                    this.field483.method493(var3);
                    this.field483.method528((byte) 8, var4);
                    this.field483.method527(var6, 7);
                    this.field128 = 0;
                    this.field129 = var4;
                    this.field130 = var3;
                    this.field131 = 2;
                    if (class44.method397(var4).field1216 == this.field361) {
                        this.field131 = 1;
                    }
                    if (class44.method397(var4).field1216 == this.field116) {
                        this.field131 = 3;
                    }
                }
                if (var5 == 945) {
                    String var63 = this.field433[arg1];
                    int var64 = var63.indexOf("@whi@");
                    if (var64 != -1) {
                        long var65 = class19.method286(var63.substring(var64 + 5).trim());
                        int var67 = -1;
                        for (int var68 = 0; var68 < this.field235; ++var68) {
                            if (this.field210[var68] == var65) {
                                var67 = var68;
                                break;
                            }
                        }
                        if (var67 != -1 && this.field469[var67] > 0) {
                            this.field79 = true;
                            this.field511 = 0;
                            this.field160 = true;
                            this.field92 = "";
                            this.field303 = 3;
                            this.field554 = this.field210[var67];
                            this.field356 = "Enter message to send to " + this.field442[var67];
                        }
                    }
                }
                if (var5 == 507) {
                    class44 var69 = class44.method397(var4);
                    this.field564 = 1;
                    this.field565 = var4;
                    this.field566 = var69.field1257;
                    this.field190 = 0;
                    this.field178 = true;
                    String var70 = var69.field1209;
                    if (var70.indexOf(" ") != -1) {
                        var70 = var70.substring(0, var70.indexOf(" "));
                    }
                    String var71 = var69.field1209;
                    if (var71.indexOf(" ") != -1) {
                        var71 = var71.substring(var71.indexOf(" ") + 1);
                    }
                    this.field567 = var70 + " " + var69.field1249 + " " + var71;
                    if (this.field566 == 16) {
                        this.field178 = true;
                        this.field444 = 3;
                        this.field184 = true;
                    }
                } else {
                    if (var5 == 316) {
                        class55 var72 = this.field487[var6];
                        if (var72 != null) {
                            this.method51(1, field398.field1325[0], field398.field1324[0], 0, var72.field1324[0], 0, 1, 0, 2, true, false, var72.field1325[0]);
                            this.field519 = super.field792;
                            this.field520 = super.field793;
                            this.field522 = 2;
                            this.field521 = 0;
                            this.field483.method491(70, (byte) -80);
                            this.field483.method527(var6, 7);
                        }
                    }
                    if (var5 == 613 && this.method85(var3, (byte) 59, var4, var6)) {
                        this.field483.method491(59, (byte) -80);
                        this.field483.method527(this.field192, 7);
                        this.field483.method493(this.field328 + var3);
                        this.field483.method528((byte) 8, var6 >> 14 & 32767);
                        this.field483.method528((byte) 8, this.field193);
                        this.field483.method527(this.field329 + var4, 7);
                        this.field483.method527(this.field191, 7);
                    }
                    if (var5 == 411) {
                        class65 var73 = this.field283[var6];
                        if (var73 != null) {
                            this.method51(1, field398.field1325[0], field398.field1324[0], 0, var73.field1324[0], 0, 1, 0, 2, true, false, var73.field1325[0]);
                            this.field519 = super.field792;
                            this.field520 = super.field793;
                            this.field522 = 2;
                            this.field521 = 0;
                            this.field483.method491(159, (byte) -80);
                            this.field483.method526(3, this.field193);
                            this.field483.method527(this.field191, 7);
                            this.field483.method493(this.field192);
                            this.field483.method493(var6);
                        }
                    }
                    if (var5 == 588 && !this.field161) {
                        this.field483.method491(182, (byte) -80);
                        this.field483.method493(var4);
                        this.field161 = true;
                    }
                    if (var5 == 210) {
                        this.method54(6, this.field448);
                        this.field448 = -1;
                        this.field79 = true;
                    }
                    this.field190 = 0;
                    this.field564 = 0;
                    this.field178 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    private final void method70(int arg0) {
        if (this.field253 != arg0) {
            this.field164 = -1;
        }
        if (this.field551 == 2) {
            for (class26 var2 = (class26) this.field300.method485(); var2 != null; var2 = (class26) this.field300.method487(6)) {
                if (var2.field917 > 0) {
                    --var2.field917;
                }
                if (var2.field917 == 0) {
                    if (var2.field922 < 0 || class68.method575(365, var2.field922, var2.field924)) {
                        this.method88(var2.field916, 12071, var2.field913, var2.field923, var2.field924, var2.field914, var2.field922, var2.field915);
                        var2.method327();
                    }
                } else {
                    if (var2.field921 > 0) {
                        --var2.field921;
                    }
                    if (var2.field921 == 0 && var2.field915 >= 1 && var2.field916 >= 1 && var2.field915 <= 102 && var2.field916 <= 102 && (var2.field918 < 0 || class68.method575(365, var2.field918, var2.field920))) {
                        this.method88(var2.field916, 12071, var2.field913, var2.field919, var2.field920, var2.field914, var2.field918, var2.field915);
                        var2.field921 = -1;
                        if (var2.field922 == var2.field918 && var2.field922 == -1) {
                            var2.method327();
                        } else if (var2.field922 == var2.field918 && var2.field923 == var2.field919 && var2.field924 == var2.field920) {
                            var2.method327();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method71(int arg0) {
        this.field202 = true;
        if (arg0 != 23974) {
            this.method102();
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method72(byte arg0) {
        if (arg0 == 3) {
            int var2 = this.field419.method14(this.field512, "Choose Option");
            for (int var3 = 0; var3 < this.field552; ++var3) {
                int var11 = this.field419.method14(this.field512, this.field433[var3]);
                if (var11 > var2) {
                    var2 = var11;
                }
            }
            var2 += 8;
            int var4 = this.field552 * 15 + 21;
            if (super.field792 > 4 && super.field793 > 4 && super.field792 < 516 && super.field793 < 338) {
                int var5 = super.field792 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field793 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field481 = true;
                this.field476 = 0;
                this.field477 = var5;
                this.field478 = var6;
                this.field479 = var2;
                this.field480 = this.field552 * 15 + 22;
            }
            if (super.field792 > 553 && super.field793 > 205 && super.field792 < 743 && super.field793 < 466) {
                int var7 = super.field792 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field793 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field481 = true;
                this.field476 = 1;
                this.field477 = var7;
                this.field478 = var8;
                this.field479 = var2;
                this.field480 = this.field552 * 15 + 22;
            }
            if (super.field792 > 17 && super.field793 > 357 && super.field792 < 496 && super.field793 < 453) {
                int var9 = super.field792 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field793 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field481 = true;
                this.field476 = 2;
                this.field477 = var9;
                this.field478 = var10;
                this.field479 = var2;
                this.field480 = this.field552 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method73(int arg0) {
        this.field163 += arg0;
        this.field316 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field324) {
                ++this.field473;
                this.method37(9);
                this.method37(9);
                this.method76((byte) 5);
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
        this.field316 = false;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method74(byte arg0, int arg1) {
        int[] var3 = this.field291.field1644;
        int var4 = var3.length;
        if (arg0 != 25) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        for (int var6 = 0; var6 < var4; ++var6) {
            var3[var6] = 0;
        }
        for (int var7 = 1; var7 < 103; ++var7) {
            int var24 = (103 - var7) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field255[arg1][var25][var7] & 24) == 0) {
                    this.field452.method364(var3, var24, 512, arg1, var25, var7);
                }
                if (arg1 < 3 && (this.field255[arg1 + 1][var25][var7] & 8) != 0) {
                    this.field452.method364(var3, var24, 512, arg1 + 1, var25, var7);
                }
                var24 += 4;
            }
        }
        int var8 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var9 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field291.method545(this.field463);
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field255[arg1][var23][var10] & 24) == 0) {
                    this.method171(var9, -868, arg1, var8, var23, var10);
                }
                if (arg1 < 3 && (this.field255[arg1 + 1][var23][var10] & 8) != 0) {
                    this.method171(var9, -868, arg1 + 1, var8, var23, var10);
                }
            }
        }
        if (this.field313 != null) {
            this.field313.method245(this.field463);
            class11.field682 = this.field229;
        }
        ++field548;
        if (field548 > 134) {
            field548 = 0;
            this.field483.method491(101, (byte) -80);
            this.field483.method496(0);
        }
        this.field292 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field452.method358(this.field205, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class9.method184(var14).field645;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field468[this.field205].field755;
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
                        this.field307[this.field292] = this.field510[var15];
                        this.field293[this.field292] = var16;
                        this.field294[this.field292] = var17;
                        ++this.field292;
                    }
                }
            }
        }
        ++field81;
        if (field81 > 196) {
            field81 = 0;
            this.field483.method491(23, (byte) -80);
            this.field483.method492(203);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static final void method75(byte arg0) {
        class35.field972 = true;
        if (arg0 == 0) {
            class11.field671 = true;
            field149 = true;
            class68.field1692 = true;
            class9.field642 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method76(byte arg0) {
        short var2 = 256;
        if (this.field179 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field179 > 768) {
                    this.field108[var3] = this.method169((byte) 66, 1024 - this.field179, this.field110[var3], this.field109[var3]);
                } else if (this.field179 > 256) {
                    this.field108[var3] = this.field110[var3];
                } else {
                    this.field108[var3] = this.method169((byte) 66, 256 - this.field179, this.field109[var3], this.field110[var3]);
                }
            }
        } else if (this.field180 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field180 > 768) {
                    this.field108[var4] = this.method169((byte) 66, 1024 - this.field180, this.field111[var4], this.field109[var4]);
                } else if (this.field180 > 256) {
                    this.field108[var4] = this.field111[var4];
                } else {
                    this.field108[var4] = this.method169((byte) 66, 256 - this.field180, this.field109[var4], this.field111[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field108[var5] = this.field109[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field336.field803[var6] = this.field215.field1644[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field213[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field353[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field108[var26];
                    int var30 = this.field336.field803[var8];
                    this.field336.field803[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field336.method246(0, super.field777, 0, 1);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field337.field803[var10] = this.field216.field1644[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field213[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field353[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field108[var18];
                    int var22 = this.field337.field803[var16];
                    this.field337.field803[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field337.method246(0, super.field777, 637, 1);
        if (arg0 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method77(int arg0, int arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            return arg1 < 999999999 ? String.valueOf(arg1) : "*";
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (this.field183 != 0) {
            int var2 = 0;
            if (this.field446 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field364[var3] != null) {
                    int var4 = this.field362[var3];
                    String var5 = this.field363[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field301 == 0 || this.field301 == 1 && this.method29(var5, (byte) 5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field785 > 4 && super.field786 - 4 > var9 - 10 && super.field786 - 4 <= var9 + 3) {
                            int var10 = this.field418.method14(this.field512, "From:  " + var5 + this.field364[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field785 < var10 + 4) {
                                if (this.field72 >= 1) {
                                    this.field433[this.field552] = "Report abuse @whi@" + var5;
                                    this.field525[this.field552] = 2545;
                                    ++this.field552;
                                }
                                this.field433[this.field552] = "Add ignore @whi@" + var5;
                                this.field525[this.field552] = 2968;
                                ++this.field552;
                                this.field433[this.field552] = "Add friend @whi@" + var5;
                                this.field525[this.field552] = 2493;
                                ++this.field552;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field301 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != -76) {
                this.field164 = this.field119.method502();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method79(int arg0) {
        if (this.field404 == 0) {
            this.field433[0] = "Cancel";
            this.field525[0] = 1725;
            this.field552 = 1;
            if (this.field449 != -1) {
                this.field401 = 0;
                this.field514 = 0;
                this.method122(super.field786, 0, 0, 0, 0, (byte) 12, class44.method397(this.field449), super.field785);
                if (this.field494 != this.field401) {
                    this.field494 = this.field401;
                }
                if (this.field514 != this.field318) {
                    this.field318 = this.field514;
                }
            } else {
                this.method78((byte) -76);
                this.field401 = 0;
                this.field514 = 0;
                if (super.field785 > 4 && super.field786 > 4 && super.field785 < 516 && super.field786 < 338) {
                    if (this.field361 != -1) {
                        this.method122(super.field786, 0, 0, 4, 4, (byte) 12, class44.method397(this.field361), super.field785);
                    } else {
                        this.method123(false);
                    }
                }
                if (this.field494 != this.field401) {
                    this.field494 = this.field401;
                }
                if (this.field514 != this.field318) {
                    this.field318 = this.field514;
                }
                this.field401 = 0;
                this.field514 = 0;
                if (super.field785 > 553 && super.field786 > 205 && super.field785 < 743 && super.field786 < 466) {
                    if (this.field263 != -1) {
                        this.method122(super.field786, 0, 1, 553, 205, (byte) 12, class44.method397(this.field263), super.field785);
                    } else if (this.field397[this.field444] != -1) {
                        this.method122(super.field786, 0, 1, 553, 205, (byte) 12, class44.method397(this.field397[this.field444]), super.field785);
                    }
                }
                if (this.field83 != this.field401) {
                    this.field178 = true;
                    this.field83 = this.field401;
                }
                if (this.field74 != this.field514) {
                    this.field178 = true;
                    this.field74 = this.field514;
                }
                this.field401 = 0;
                this.field514 = 0;
                if (arg0 != 0) {
                    field482 = this.field152.method317();
                }
                if (super.field785 > 17 && super.field786 > 357 && super.field785 < 496 && super.field786 < 453) {
                    if (this.field116 != -1) {
                        this.method122(super.field786, 0, 2, 17, 357, (byte) 12, class44.method397(this.field116), super.field785);
                    } else if (this.field448 != -1) {
                        this.method122(super.field786, 0, 3, 17, 357, (byte) 12, class44.method397(this.field448), super.field785);
                    } else if (super.field786 < 434 && super.field785 < 426 && this.field511 == 0) {
                        this.method103(super.field785 - 17, super.field786 - 357, this.field225);
                    }
                }
                if ((this.field116 != -1 || this.field448 != -1) && this.field501 != this.field401) {
                    this.field79 = true;
                    this.field501 = this.field401;
                }
                if ((this.field116 != -1 || this.field448 != -1) && this.field514 != this.field323) {
                    this.field79 = true;
                    this.field323 = this.field514;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field552 - 1; ++var3) {
                        if (this.field525[var3] < 1000 && this.field525[var3 + 1] > 1000) {
                            String var4 = this.field433[var3];
                            this.field433[var3] = this.field433[var3 + 1];
                            this.field433[var3 + 1] = var4;
                            int var5 = this.field525[var3];
                            this.field525[var3] = this.field525[var3 + 1];
                            this.field525[var3 + 1] = var5;
                            int var6 = this.field523[var3];
                            this.field523[var3] = this.field523[var3 + 1];
                            this.field523[var3 + 1] = var6;
                            int var7 = this.field524[var3];
                            this.field524[var3] = this.field524[var3 + 1];
                            this.field524[var3 + 1] = var7;
                            int var8 = this.field526[var3];
                            this.field526[var3] = this.field526[var3 + 1];
                            this.field526[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)Z")
    public final boolean method80(byte arg0) {
        if (this.field308 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0) {
            field94 = !field94;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILSSCICQYX;)V")
    public final void method82(int arg0, class52 arg1) {
        short var3 = 256;
        if (arg0 < 9 || arg0 > 9) {
            this.field164 = -1;
        }
        for (int var4 = 0; var4 < this.field250.length; ++var4) {
            this.field250[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field250[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field251[var16] = (this.field250[var16 - 1] + this.field250[var16 + 1] + this.field250[var16 - 128] + this.field250[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field250;
            this.field250 = this.field251;
            this.field251 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field1394; ++var8) {
                for (int var9 = 0; var9 < arg1.field1393; ++var9) {
                    if (arg1.field1391[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field1395;
                        int var11 = var8 + 16 + arg1.field1396;
                        int var12 = (var11 << 7) + var10;
                        this.field250[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method83(int arg0) {
        for (int var2 = 0; var2 < this.field422; ++var2) {
            if (this.field441[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field359[var2] == this.field320 && this.field73[var2] == this.field140) {
                        if (!this.method80((byte) 2)) {
                            var3 = true;
                        }
                    } else {
                        class63 var4 = class58.method469(this.field359[var2], 0, this.field73[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1571 / 22) > (long) (this.field367 / 22) + this.field173) {
                            this.field367 = var4.field1571;
                            this.field173 = System.currentTimeMillis();
                            if (this.method132(var4.field1570, var4.field1571, -6504)) {
                                this.field320 = this.field359[var2];
                                this.field140 = this.field73[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field483.method491(121, (byte) -80);
                        this.field483.method493(this.field359[var2] & 32767);
                    } else {
                        this.field483.method491(121, (byte) -80);
                        this.field483.method493(-1);
                    }
                }
                if (var3 && this.field441[var2] != -5) {
                    this.field441[var2] = -5;
                } else {
                    --this.field422;
                    for (int var6 = var2; var6 < this.field422; ++var6) {
                        this.field359[var6] = this.field359[var6 + 1];
                        this.field73[var6] = this.field73[var6 + 1];
                        this.field441[var6] = this.field441[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field441[var2]--;
            }
        }
        if (arg0 == -17345) {
            if (this.field212 > 0) {
                this.field212 -= 20;
                if (this.field212 < 0) {
                    this.field212 = 0;
                }
                if (this.field212 == 0 && this.field498 && !field149) {
                    this.field77 = this.field133;
                    this.field78 = true;
                    this.field544.method309(2, this.field77);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
    public final boolean method84(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field483.method492(226);
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field525[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 493;
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field317) {
            this.method73(0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)Z")
    public final boolean method85(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field452.method359(this.field205, arg0, arg2, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method51(0, field398.field1325[0], field398.field1324[0], var8, arg0, 0, 0, var7 + 1, 2, true, true, arg2);
            } else {
                class9 var9 = class9.method184(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field656;
                    var11 = var9.field636;
                } else {
                    var10 = var9.field636;
                    var11 = var9.field656;
                }
                int var12 = var9.field616;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method51(var11, field398.field1325[0], field398.field1324[0], 0, arg0, var12, var10, 0, 2, true, true, arg2);
            }
            this.field519 = super.field792;
            if (arg1 != 59) {
                this.field267 = !this.field267;
            }
            this.field520 = super.field793;
            this.field522 = 2;
            this.field521 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        for (int var2 = -1; var2 < this.field284; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field282;
            } else {
                var4 = this.field285[var2];
            }
            class65 var5 = this.field283[var4];
            if (var5 != null) {
                this.method159(29067, var5, 1);
            }
        }
        ++field386;
        if (arg0) {
            if (field386 > 1881) {
                field386 = 0;
                this.field483.method491(207, (byte) -80);
                this.field483.method492(0);
                int var3 = this.field483.field1571;
                this.field483.method492((int) (Math.random() * 256.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field483.method492(68);
                }
                this.field483.method493(46660);
                this.field483.method493((int) (Math.random() * 65536.0D));
                this.field483.method493(9575);
                this.field483.method493(41697);
                this.field483.method492(216);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field483.method493(36121);
                }
                this.field483.method493(64072);
                this.field483.method493(26089);
                this.field483.method501(this.field483.field1571 - var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method87(byte arg0, boolean arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.method102();
        }
        for (int var4 = 0; var4 < this.field488; ++var4) {
            class55 var5 = this.field487[this.field489[var4]];
            int var6 = (this.field489[var4] << 14) + 536870912;
            if (var5 != null && var5.method408((byte) 8) && var5.field1422.field19 == arg1 && var5.field1422.method1(true)) {
                int var7 = var5.field1344 >> 7;
                int var8 = var5.field1345 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1326 == 1 && (var5.field1344 & 127) == 64 && (var5.field1345 & 127) == 64) {
                        if (this.field545[var7][var8] == this.field304) {
                            continue;
                        }
                        this.field545[var7][var8] = this.field304;
                    }
                    if (!var5.field1422.field23) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field452.method340(var5.field1302, 32536, this.field205, var5, var5.field1346, var5.field1345, (var5.field1326 - 1) * 64 + 60, this.method133(var5.field1344, var5.field1345, 899, this.field205), var5.field1344, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 12071) {
            this.field295 = !this.field295;
        }
        if (arg7 >= 1 && arg0 >= 1 && arg7 <= 102 && arg0 <= 102) {
            if (field149 && this.field205 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.field452.method355(arg2, arg7, arg0);
            }
            if (arg5 == 1) {
                var9 = this.field452.method356(arg0, 0, arg7, arg2);
            }
            if (arg5 == 2) {
                var9 = this.field452.method357(arg2, arg7, arg0);
            }
            if (arg5 == 3) {
                var9 = this.field452.method358(arg2, arg7, arg0);
            }
            if (var9 != 0) {
                int var13 = this.field452.method359(arg2, arg7, arg0, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg5 == 0) {
                    this.field452.method346(false, arg0, arg7, arg2);
                    class9 var17 = class9.method184(var14);
                    if (var17.field630) {
                        this.field468[arg2].method233(1, var16, arg7, arg0, var17.field655, var15);
                    }
                }
                if (arg5 == 1) {
                    this.field452.method347(arg0, arg2, arg7, 15430);
                }
                if (arg5 == 2) {
                    this.field452.method348(arg0, arg2, arg7, this.field177);
                    class9 var18 = class9.method184(var14);
                    if (var18.field636 + arg7 > 103 || var18.field636 + arg0 > 103 || var18.field656 + arg7 > 103 || var18.field656 + arg0 > 103) {
                        return;
                    }
                    if (var18.field630) {
                        this.field468[arg2].method234(arg7, var18.field655, var18.field656, var18.field636, true, arg0, var16);
                    }
                }
                if (arg5 == 3) {
                    this.field452.method349(arg0, arg2, 0, arg7);
                    class9 var19 = class9.method184(var14);
                    if (var19.field630 && var19.field644) {
                        this.field468[arg2].method236(-1868, arg0, arg7);
                    }
                }
            }
            if (arg6 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field255[1][arg7][arg0] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                class68.method560(this.field539, arg6, var20, arg0, this.field452, this.field468[arg2], arg4, arg2, false, arg3, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILWNCFPLWV;)V")
    private final void method89(int arg0, int arg1, class63 arg2) {
        if (arg0 == 4) {
            for (int var4 = 0; var4 < this.field286; ++var4) {
                int var5 = this.field287[var4];
                class65 var6 = this.field283[var5];
                int var7 = arg2.method502();
                if ((var7 & 32) != 0) {
                    var7 += arg2.method502() << 8;
                }
                this.method61(arg2, var6, 529, var7, var5);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQQMJEFXK;)Z")
    public final boolean method90(int arg0, class44 arg1) {
        int var3 = arg1.field1228;
        if (arg0 != 0) {
            this.field546 = this.field152.method317();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field433[this.field552] = "Remove @whi@" + arg1.field1250;
                this.field525[this.field552] = 453;
                ++this.field552;
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
            this.field433[this.field552] = "Remove @whi@" + this.field442[var3];
            this.field525[this.field552] = 366;
            ++this.field552;
            this.field433[this.field552] = "Message @whi@" + this.field442[var3];
            this.field525[this.field552] = 945;
            ++this.field552;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method91(int arg0) {
        this.method101((byte) 0);
        if (arg0 >= 0) {
            this.field483.method492(255);
        }
        if (this.field522 == 1) {
            this.field377[this.field521 / 100].method550(false, this.field519 - 8 - 4, this.field520 - 8 - 4);
        }
        if (this.field522 == 2) {
            this.field377[this.field521 / 100 + 4].method550(false, this.field519 - 8 - 4, this.field520 - 8 - 4);
        }
        if (this.field445 != -1) {
            this.method57(this.field445, false, this.field174);
            this.method40((byte) 66, 0, class44.method397(this.field445), 0, 0);
        }
        if (this.field361 != -1) {
            this.method57(this.field361, false, this.field174);
            this.method40((byte) 66, 0, class44.method397(this.field361), 0, 0);
        }
        this.method106(false);
        if (!this.field481) {
            this.method79(0);
            this.method143(-213);
        } else if (this.field476 == 0) {
            this.method173((byte) 114);
        }
        if (this.field153 == 1) {
            this.field262.method550(false, 472, 296);
        }
        if (field258) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field773 < 30 && field149) {
                var4 = 16711680;
            }
            if (super.field773 < 20 && !field149) {
                var4 = 16711680;
            }
            this.field418.method11("Fps:" + super.field773, var4, -738, var3, var2);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field149) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field149) {
                int var9 = 16711680;
            }
            this.field418.method11("Mem:" + var6 + "k", 16776960, -738, var13, var2);
            var13 += 15;
        }
        if (this.field446 != 0) {
            int var10 = this.field446 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field418.method16(4, 16776960, "System update in: " + var11 + ":0" + var12, 329, this.field381);
            } else {
                this.field418.method16(4, 16776960, "System update in: " + var11 + ":" + var12, 329, this.field381);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BZ)V")
    public final void method92(boolean arg0, byte[] arg1, boolean arg2) {
        if (this.field498) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
            if (arg2) {
                this.field483.method492(49);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method93(int arg0) {
        Graphics var2 = this.method117(0).getGraphics();
        var2.setColor(Color.black);
        if (arg0 <= 0) {
            this.field164 = this.field119.method502();
        }
        var2.fillRect(0, 0, 765, 503);
        this.method243(false, 1);
        if (this.field366) {
            this.field324 = false;
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
        if (this.field515) {
            this.field324 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field86) {
            this.field324 = false;
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

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        this.field311.method245(this.field463);
        this.field175 &= arg0;
        class11.field682 = this.field228;
        this.field505.method428(false, 0, 0);
        if (this.field263 != -1) {
            this.method40((byte) 66, 0, class44.method397(this.field263), 0, 0);
        } else if (this.field397[this.field444] != -1) {
            this.method40((byte) 66, 0, class44.method397(this.field397[this.field444]), 0, 0);
        }
        if (this.field481 && this.field476 == 1) {
            this.method173((byte) 114);
        }
        this.field311.method246(205, super.field777, 553, 1);
        this.field313.method245(this.field463);
        class11.field682 = this.field229;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method95(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = class51.field1372[arg0].field1380;
        if (var4 != 0) {
            int var5 = this.field534[arg0];
            if (var4 == 1) {
                if (var5 == 1) {
                    class11.method207(0.9D, (byte) -117);
                }
                if (var5 == 2) {
                    class11.method207(0.8D, (byte) -117);
                }
                if (var5 == 3) {
                    class11.method207(0.7D, (byte) -117);
                }
                if (var5 == 4) {
                    class11.method207(0.6D, (byte) -117);
                }
                class12.field694.method181();
                this.field202 = true;
            }
            if (var4 == 3) {
                boolean var6 = this.field498;
                if (var5 == 0) {
                    this.method41(0, 941, this.field498);
                    this.field498 = true;
                }
                if (var5 == 1) {
                    this.method41(-400, 941, this.field498);
                    this.field498 = true;
                }
                if (var5 == 2) {
                    this.method41(-800, 941, this.field498);
                    this.field498 = true;
                }
                if (var5 == 3) {
                    this.method41(-1200, 941, this.field498);
                    this.field498 = true;
                }
                if (var5 == 4) {
                    this.field498 = false;
                }
                if (this.field498 != var6 && !field149) {
                    if (this.field498) {
                        this.field77 = this.field133;
                        this.field78 = true;
                        this.field544.method309(2, this.field77);
                    } else {
                        this.method81(false);
                    }
                    this.field212 = 0;
                }
            }
            if (var4 == 4) {
                if (var5 == 0) {
                    this.field305 = true;
                    this.method126((byte) 77, 0);
                }
                if (var5 == 1) {
                    this.field305 = true;
                    this.method126((byte) 77, -400);
                }
                if (var5 == 2) {
                    this.field305 = true;
                    this.method126((byte) 77, -800);
                }
                if (var5 == 3) {
                    this.field305 = true;
                    this.method126((byte) 77, -1200);
                }
                if (var5 == 4) {
                    this.field305 = false;
                }
            }
            if (var4 == 5) {
                this.field440 = var5;
            }
            if (var4 == 6) {
                this.field540 = var5;
            }
            if (var4 == 8) {
                this.field183 = var5;
                this.field79 = true;
            }
            if (var4 == 9) {
                this.field325 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method96(int arg0) {
        this.field387 = 0;
        for (int var2 = -1; var2 < this.field488 + this.field284; ++var2) {
            class48 var21;
            if (var2 == -1) {
                var21 = field398;
            } else if (var2 < this.field284) {
                var21 = this.field283[this.field285[var2]];
            } else {
                var21 = this.field487[this.field489[var2 - this.field284]];
            }
            if (var21 != null && var21.method408((byte) 8)) {
                if (var21 instanceof class55) {
                    class2 var22 = ((class55) var21).field1422;
                    if (var22.field38 != null) {
                        var22 = var22.method6(324);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field284) {
                    class2 var25 = ((class55) var21).field1422;
                    if (var25.field44 >= 0 && var25.field44 < this.field85.length) {
                        this.method111(var21, var21.field1300 + 15, (byte) -122);
                        if (this.field532 > -1) {
                            this.field85[var25.field44].method550(false, this.field532 - 12, this.field533 - 30);
                        }
                    }
                    if (this.field185 == 1 && this.field489[var2 - this.field284] == this.field231 && field261 % 20 < 10) {
                        this.method111(var21, var21.field1300 + 15, (byte) -122);
                        if (this.field532 > -1) {
                            this.field370[0].method550(false, this.field532 - 12, this.field533 - 28);
                        }
                    }
                } else {
                    int var23 = 30;
                    class65 var24 = (class65) var21;
                    if (var24.field1614 != -1 || var24.field1626 != -1) {
                        this.method111(var21, var21.field1300 + 15, (byte) -122);
                        if (this.field532 > -1) {
                            if (var24.field1614 != -1) {
                                this.field143[var24.field1614].method550(false, this.field532 - 12, this.field533 - var23);
                                var23 += 25;
                            }
                            if (var24.field1626 != -1) {
                                this.field85[var24.field1626].method550(false, this.field532 - 12, this.field533 - var23);
                                var23 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field185 == 10 && this.field285[var2] == this.field365) {
                        this.method111(var21, var21.field1300 + 15, (byte) -122);
                        if (this.field532 > -1) {
                            this.field370[1].method550(false, this.field532 - 12, this.field533 - var23);
                        }
                    }
                }
                if (var21.field1297 != null && (var2 >= this.field284 || this.field368 == 0 || this.field368 == 3 || this.field368 == 1 && this.method29(((class65) var21).field1628, (byte) 5))) {
                    this.method111(var21, var21.field1300, (byte) -122);
                    if (this.field532 > -1 && this.field387 < this.field388) {
                        this.field392[this.field387] = this.field419.method15(-162, var21.field1297) / 2;
                        this.field391[this.field387] = this.field419.field69;
                        this.field389[this.field387] = this.field532;
                        this.field390[this.field387] = this.field533;
                        this.field393[this.field387] = var21.field1301;
                        this.field394[this.field387] = var21.field1338;
                        this.field395[this.field387] = var21.field1351;
                        this.field396[this.field387++] = var21.field1297;
                        if (this.field540 == 0 && var21.field1338 >= 1 && var21.field1338 <= 3) {
                            this.field391[this.field387] += 10;
                            this.field390[this.field387] += 5;
                        }
                        if (this.field540 == 0 && var21.field1338 == 4) {
                            this.field392[this.field387] = 60;
                        }
                        if (this.field540 == 0 && var21.field1338 == 5) {
                            this.field391[this.field387] += 5;
                        }
                    }
                }
                if (var21.field1340 > field261) {
                    this.method111(var21, var21.field1300 + 15, (byte) -122);
                    if (this.field532 > -1) {
                        int var26 = var21.field1341 * 30 / var21.field1342;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class72.method597(var26, 65280, 5, this.field532 - 15, this.field357, this.field533 - 3);
                        class72.method597(30 - var26, 16711680, 5, this.field532 - 15 + var26, this.field357, this.field533 - 3);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var21.field1332[var27] > field261) {
                        this.method111(var21, var21.field1300 / 2, (byte) -122);
                        if (this.field532 > -1) {
                            if (var27 == 1) {
                                this.field533 -= 20;
                            }
                            if (var27 == 2) {
                                this.field532 -= 15;
                                this.field533 -= 10;
                            }
                            if (var27 == 3) {
                                this.field532 += 15;
                                this.field533 -= 10;
                            }
                            this.field399[var21.field1331[var27]].method550(false, this.field532 - 12, this.field533 - 12);
                            this.field417.method12(this.field533 + 4, String.valueOf(var21.field1330[var27]), this.field532, 0, 0);
                            this.field417.method12(this.field533 + 3, String.valueOf(var21.field1330[var27]), this.field532 - 1, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        ++field379;
        if (field379 > 1667) {
            field379 = 0;
            this.field483.method491(33, (byte) -80);
            this.field483.method492(0);
            int var4 = this.field483.field1571;
            this.field483.method493((int) (Math.random() * 65536.0D));
            this.field483.method493(56176);
            this.field483.method493(44384);
            this.field483.method492((int) (Math.random() * 256.0D));
            this.field483.method492((int) (Math.random() * 256.0D));
            this.field483.method493(5941);
            this.field483.method492((int) (Math.random() * 256.0D));
            this.field483.method492(94);
            this.field483.method492((int) (Math.random() * 256.0D));
            this.field483.method492(244);
            this.field483.method501(this.field483.field1571 - var4, 0);
        }
        for (int var5 = 0; var5 < this.field387; ++var5) {
            int var6 = this.field389[var5];
            int var7 = this.field390[var5];
            int var8 = this.field392[var5];
            int var9 = this.field391[var5];
            boolean var10 = true;
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var5; ++var20) {
                    if (var7 + 2 > this.field390[var20] - this.field391[var20] && var7 - var9 < this.field390[var20] + 2 && var6 - var8 < this.field392[var20] + this.field389[var20] && var6 + var8 > this.field389[var20] - this.field392[var20] && this.field390[var20] - this.field391[var20] < var7) {
                        var7 = this.field390[var20] - this.field391[var20];
                        var10 = true;
                    }
                }
            }
            this.field532 = this.field389[var5];
            this.field533 = this.field390[var5] = var7;
            String var11 = this.field396[var5];
            if (this.field540 == 0) {
                int var12 = 16776960;
                if (this.field393[var5] < 6) {
                    var12 = this.field497[this.field393[var5]];
                }
                if (this.field393[var5] == 6) {
                    var12 = this.field304 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field393[var5] == 7) {
                    var12 = this.field304 % 20 < 10 ? 255 : 65535;
                }
                if (this.field393[var5] == 8) {
                    var12 = this.field304 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field393[var5] == 9) {
                    int var13 = 150 - this.field395[var5];
                    if (var13 < 50) {
                        var12 = var13 * 1280 + 16711680;
                    } else if (var13 < 100) {
                        var12 = 16776960 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var12 = (var13 - 100) * 5 + 65280;
                    }
                }
                if (this.field393[var5] == 10) {
                    int var14 = 150 - this.field395[var5];
                    if (var14 < 50) {
                        var12 = var14 * 5 + 16711680;
                    } else if (var14 < 100) {
                        var12 = 16711935 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var12 = (var14 - 100) * 327680 + 255 - (var14 - 100) * 5;
                    }
                }
                if (this.field393[var5] == 11) {
                    int var15 = 150 - this.field395[var5];
                    if (var15 < 50) {
                        var12 = 16777215 - var15 * 327685;
                    } else if (var15 < 100) {
                        var12 = (var15 - 50) * 327685 + 65280;
                    } else if (var15 < 150) {
                        var12 = 16777215 - (var15 - 100) * 327680;
                    }
                }
                if (this.field394[var5] == 0) {
                    this.field419.method12(this.field533 + 1, var11, this.field532, 0, 0);
                    this.field419.method12(this.field533, var11, this.field532, var12, 0);
                }
                if (this.field394[var5] == 1) {
                    this.field419.method17(-298, var11, 0, this.field532, this.field304, this.field533 + 1);
                    this.field419.method17(-298, var11, var12, this.field532, this.field304, this.field533);
                }
                if (this.field394[var5] == 2) {
                    this.field419.method18(this.field532, this.field304, 0, (byte) 8, this.field533 + 1, var11);
                    this.field419.method18(this.field532, this.field304, var12, (byte) 8, this.field533, var11);
                }
                if (this.field394[var5] == 3) {
                    this.field419.method19(this.field304, this.field533 + 1, 0, 150 - this.field395[var5], var11, this.field532, 0);
                    this.field419.method19(this.field304, this.field533, var12, 150 - this.field395[var5], var11, this.field532, 0);
                }
                if (this.field394[var5] == 4) {
                    int var16 = this.field419.method15(-162, var11);
                    int var17 = (150 - this.field395[var5]) * (var16 + 100) / 150;
                    class72.method594(7, 334, this.field532 - 50, this.field532 + 50, 0);
                    this.field419.method16(this.field532 + 50 - var17, 0, var11, this.field533 + 1, this.field381);
                    this.field419.method16(this.field532 + 50 - var17, var12, var11, this.field533, this.field381);
                    class72.method593(-38001);
                }
                if (this.field394[var5] == 5) {
                    int var18 = 150 - this.field395[var5];
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class72.method594(7, this.field533 + 5, 0, 512, this.field533 - this.field419.field69 - 1);
                    this.field419.method12(this.field533 + 1 + var19, var11, this.field532, 0, 0);
                    this.field419.method12(this.field533 + var19, var11, this.field532, var12, 0);
                    class72.method593(-38001);
                }
            } else {
                this.field419.method12(this.field533 + 1, var11, this.field532, 0, 0);
                this.field419.method12(this.field533, var11, this.field532, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method97(String arg0) throws IOException {
        if (!this.field502) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field508 != null) {
                try {
                    this.field508.close();
                } catch (Exception var4) {
                }
                this.field508 = null;
            }
            this.field508 = this.method63(43595);
            this.field508.setSoTimeout(10000);
            InputStream var2 = this.field508.getInputStream();
            OutputStream var3 = this.field508.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILQQMJEFXK;)V")
    public final void method98(int arg0, class44 arg1) {
        if (arg0 != -44119) {
            this.method102();
        }
        int var3 = arg1.field1228;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field235;
                if (this.field236 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field1250 = "";
                    arg1.field1208 = 0;
                } else {
                    if (this.field469[var3] == 0) {
                        arg1.field1250 = "@red@Offline";
                    } else if (this.field469[var3] < 200) {
                        if (this.field469[var3] == field146) {
                            arg1.field1250 = "@gre@World" + (this.field469[var3] - 9);
                        } else {
                            arg1.field1250 = "@yel@World" + (this.field469[var3] - 9);
                        }
                    } else if (this.field469[var3] == field146) {
                        arg1.field1250 = "@gre@Classic" + (this.field469[var3] - 219);
                    } else {
                        arg1.field1250 = "@yel@Classic" + (this.field469[var3] - 219);
                    }
                    arg1.field1208 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field235;
                if (this.field236 != 2) {
                    var6 = 0;
                }
                arg1.field1204 = var6 * 15 + 20;
                if (arg1.field1204 <= arg1.field1260) {
                    arg1.field1204 = arg1.field1260 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field236 == 0) {
                    arg1.field1250 = "Loading ignore list";
                    arg1.field1208 = 0;
                } else if (var3 == 1 && this.field236 == 0) {
                    arg1.field1250 = "Please wait...";
                    arg1.field1208 = 0;
                } else {
                    int var7 = this.field553;
                    if (this.field236 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1250 = "";
                        arg1.field1208 = 0;
                    } else {
                        arg1.field1250 = class19.method290(true, class19.method287(false, this.field249[var3]));
                        arg1.field1208 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1204 = this.field553 * 15 + 20;
                if (arg1.field1204 <= arg1.field1260) {
                    arg1.field1204 = arg1.field1260 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1206 = 150;
                arg1.field1207 = (int) (Math.sin((double) field261 / 40.0D) * 256.0D) & 2047;
                if (this.field247) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field145[var8];
                        if (var15 >= 0 && !class50.field1363[var15].method417(false)) {
                            return;
                        }
                    }
                    this.field247 = false;
                    class56[] var9 = new class56[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field145[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class50.field1363[var14].method418(691);
                        }
                    }
                    class56 var12 = new class56(var10, var9, 0);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field319[var13] != 0) {
                            var12.method456(field277[var13][0], field277[var13][this.field319[var13]]);
                            if (var13 == 1) {
                                var12.method456(field490[0], field490[this.field319[var13]]);
                            }
                        }
                    }
                    var12.method449(956);
                    var12.method450(936, class41.field1147[field398.field1298].field1149[0]);
                    var12.method459(64, 850, -30, -50, -30, true);
                    arg1.field1200 = 5;
                    arg1.field1201 = 0;
                    class44.method405(var12, 0, false, 5);
                }
            } else if (var3 == 324) {
                if (this.field239 == null) {
                    this.field239 = arg1.field1234;
                    this.field240 = arg1.field1244;
                }
                if (this.field537) {
                    arg1.field1234 = this.field240;
                } else {
                    arg1.field1234 = this.field239;
                }
            } else if (var3 == 325) {
                if (this.field239 == null) {
                    this.field239 = arg1.field1234;
                    this.field240 = arg1.field1244;
                }
                if (this.field537) {
                    arg1.field1234 = this.field239;
                } else {
                    arg1.field1234 = this.field240;
                }
            } else if (var3 == 600) {
                arg1.field1250 = this.field115;
                if (field261 % 20 < 10) {
                    arg1.field1250 = arg1.field1250 + "|";
                } else {
                    arg1.field1250 = arg1.field1250 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field72 >= 1) {
                        if (this.field248) {
                            arg1.field1269 = 16711680;
                            arg1.field1250 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1269 = 16777215;
                            arg1.field1250 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1250 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field120 - this.field182;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field1250 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field518 == 0) {
                        arg1.field1250 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field518 <= this.field120) {
                        arg1.field1250 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method99(this.field518, false);
                    } else {
                        int var18 = this.field120 + 14 - this.field518;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field1250 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method99(this.field518, false) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field496 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field496 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field496 + " unread messages";
                    }
                    arg1.field1250 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field264 > 0 && this.field264 <= this.field120 + 10) {
                        arg1.field1250 = "Last password change:\\n@gre@" + this.method99(this.field264, false);
                    } else {
                        arg1.field1250 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field220 > 2 && !field148) {
                        arg1.field1250 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field220 > 2) {
                        arg1.field1250 = "\\n\\nYou have @gre@" + this.field220 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field220 > 0) {
                        arg1.field1250 = "You have @gre@" + this.field220 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field1250 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field220 > 2 && !field148) {
                        arg1.field1250 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field220 > 0) {
                        arg1.field1250 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field1250 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field518 > this.field120) {
                        arg1.field1250 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field1250 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field236 == 0) {
            arg1.field1250 = "Loading friend list";
            arg1.field1208 = 0;
        } else if (var3 == 1 && this.field236 == 1) {
            arg1.field1250 = "Connecting to friendserver";
            arg1.field1208 = 0;
        } else if (var3 == 2 && this.field236 != 2) {
            arg1.field1250 = "Please wait...";
            arg1.field1208 = 0;
        } else {
            int var4 = this.field235;
            if (this.field236 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field1250 = "";
                arg1.field1208 = 0;
            } else {
                arg1.field1250 = this.field442[var3];
                arg1.field1208 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method99(int arg0, boolean arg1) {
        if (arg0 > this.field120 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            if (arg1) {
                throw new NullPointerException();
            } else {
                int var8 = var5.get(1);
                String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
                return var6 + "-" + var9[var7] + "-" + var8;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method100(int arg0) {
        for (int var2 = -1; var2 < this.field284; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field282;
            } else {
                var6 = this.field285[var2];
            }
            class65 var7 = this.field283[var6];
            if (var7 != null && var7.field1351 > 0) {
                --var7.field1351;
                if (var7.field1351 == 0) {
                    var7.field1297 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field488; ++var3) {
            int var4 = this.field489[var3];
            class55 var5 = this.field487[var4];
            if (var5 != null && var5.field1351 > 0) {
                --var5.field1351;
                if (var5.field1351 == 0) {
                    var5.field1297 = null;
                }
            }
        }
        if (arg0 >= 0) {
            this.method102();
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method101(byte arg0) {
        if (this.field183 != 0) {
            class4 var2 = this.field418;
            int var3 = 0;
            if (this.field446 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field364[var4] != null) {
                    int var5 = this.field362[var4];
                    String var6 = this.field363[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field301 == 0 || this.field301 == 1 && this.method29(var6, (byte) 5))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method16(var9, 0, "From", var8, this.field381);
                        var2.method16(var9, 65535, "From", var8 - 1, this.field381);
                        int var10 = var9 + var2.method14(this.field512, "From ");
                        if (var7 == 1) {
                            this.field208[0].method428(false, var10, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field208[1].method428(false, var10, var8 - 12);
                            var10 += 14;
                        }
                        var2.method16(var10, 0, var6 + ": " + this.field364[var4], var8, this.field381);
                        var2.method16(var10, 65535, var6 + ": " + this.field364[var4], var8 - 1, this.field381);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field301 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method16(4, 0, this.field364[var4], var11, this.field381);
                        var2.method16(4, 65535, this.field364[var4], var11 - 1, this.field381);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field301 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method16(4, 0, "To " + var6 + ": " + this.field364[var4], var12, this.field381);
                        var2.method16(4, 65535, "To " + var6 + ": " + this.field364[var4], var12 - 1, this.field381);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 0) {
                this.field559 = null;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method102() {
        this.method58((byte) -59, 20, "Starting up");
        if (signlink.sunjava) {
            super.field771 = 5;
        }
        if (field371) {
            this.field86 = true;
        } else {
            field371 = true;
            boolean var1 = false;
            String var2 = this.method137(false);
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
                this.field515 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field306[var3] = new class53(signlink.cache_dat, 0, signlink.cache_idx[var3], 600000, var3 + 1);
                    }
                }
                try {
                    this.method124((byte) 113);
                    this.field451 = this.method110("title", -3191, this.field495[1], 1, "title screen", 25);
                    this.field417 = new class4("p11_full", this.field451, (byte) -104, false);
                    this.field418 = new class4("p12_full", this.field451, (byte) -104, false);
                    this.field419 = new class4("b12_full", this.field451, (byte) -104, false);
                    this.field420 = new class4("q8_full", this.field451, (byte) -104, true);
                    this.method152(false);
                    this.method56((byte) 2);
                    class49 var4 = this.method110("config", -3191, this.field495[2], 2, "config", 30);
                    class49 var5 = this.method110("interface", -3191, this.field495[3], 3, "interface", 35);
                    class49 var6 = this.method110("media", -3191, this.field495[4], 4, "2d graphics", 40);
                    class49 var7 = this.method110("textures", -3191, this.field495[6], 6, "textures", 45);
                    class49 var8 = this.method110("wordenc", -3191, this.field495[7], 7, "chat system", 50);
                    class49 var9 = this.method110("sounds", -3191, this.field495[8], 8, "sound effects", 55);
                    this.field255 = new byte[4][104][104];
                    this.field539 = new int[4][105][105];
                    this.field452 = new class35(104, -954, this.field539, 4, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field468[var10] = new class13(104, 32, 104);
                    }
                    this.field291 = new class66(512, 512);
                    class49 var11 = this.method110("versionlist", -3191, this.field495[5], 5, "update list", 60);
                    this.method58((byte) -59, 60, "Connecting to update server");
                    this.field544 = new class21();
                    this.field544.method301(var11, this);
                    class6.method174(this.field544.method311(-48454));
                    class56.method439(this.field544.method293(0, 0), this.field544);
                    if (!field149) {
                        this.field77 = 0;
                        this.field78 = true;
                        this.field544.method309(2, this.field77);
                        while (this.field544.method297() > 0) {
                            this.method48(field482);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                            if (this.field544.field850 > 3) {
                                this.method45("ondemand");
                                return;
                            }
                        }
                    }
                    this.method58((byte) -59, 65, "Requesting animations");
                    int var12 = this.field544.method293(0, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field544.method309(1, var13);
                    }
                    while (this.field544.method297() > 0) {
                        int var14 = var12 - this.field544.method297();
                        if (var14 > 0) {
                            this.method58((byte) -59, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method48(field482);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                        if (this.field544.field850 > 3) {
                            this.method45("ondemand");
                            return;
                        }
                    }
                    this.method58((byte) -59, 70, "Requesting models");
                    int var15 = this.field544.method293(0, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field544.method295(var16, -32251);
                        if ((var17 & 1) != 0) {
                            this.field544.method309(0, var16);
                        }
                    }
                    int var18 = this.field544.method297();
                    while (this.field544.method297() > 0) {
                        int var19 = var18 - this.field544.method297();
                        if (var19 > 0) {
                            this.method58((byte) -59, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method48(field482);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field306[0] != null) {
                        this.method58((byte) -59, 75, "Requesting maps");
                        this.field544.method309(3, this.field544.method298(-45861, 47, 0, 48));
                        this.field544.method309(3, this.field544.method298(-45861, 47, 1, 48));
                        this.field544.method309(3, this.field544.method298(-45861, 48, 0, 48));
                        this.field544.method309(3, this.field544.method298(-45861, 48, 1, 48));
                        this.field544.method309(3, this.field544.method298(-45861, 49, 0, 48));
                        this.field544.method309(3, this.field544.method298(-45861, 49, 1, 48));
                        this.field544.method309(3, this.field544.method298(-45861, 47, 0, 47));
                        this.field544.method309(3, this.field544.method298(-45861, 47, 1, 47));
                        this.field544.method309(3, this.field544.method298(-45861, 48, 0, 47));
                        this.field544.method309(3, this.field544.method298(-45861, 48, 1, 47));
                        this.field544.method309(3, this.field544.method298(-45861, 48, 0, 148));
                        this.field544.method309(3, this.field544.method298(-45861, 48, 1, 148));
                        int var20 = this.field544.method297();
                        while (this.field544.method297() > 0) {
                            int var21 = var20 - this.field544.method297();
                            if (var21 > 0) {
                                this.method58((byte) -59, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method48(field482);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var22 = this.field544.method293(0, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field544.method295(var23, -32251);
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
                            this.field544.method306(var23, 0, var25, false);
                        }
                    }
                    this.field544.method294(field148, 27878);
                    if (!field149) {
                        int var26 = this.field544.method293(0, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field544.method299(var27, 9)) {
                                this.field544.method306(var27, 2, (byte) 1, false);
                            }
                        }
                    }
                    int var28 = this.field544.method293(0, 0);
                    for (int var29 = 0; var29 < var28; ++var29) {
                        int var30 = this.field544.method295(var29, -32251);
                        if (var30 == 0 && this.field544.field835 < 200) {
                            this.field544.method306(var29, 0, (byte) 1, false);
                        }
                    }
                    this.method58((byte) -59, 80, "Unpacking media");
                    this.field505 = new class52(var6, "invback", 0);
                    this.field507 = new class52(var6, "chatback", 0);
                    this.field506 = new class52(var6, "mapback", 0);
                    this.field374 = new class52(var6, "backbase1", 0);
                    this.field375 = new class52(var6, "backbase2", 0);
                    this.field376 = new class52(var6, "backhmid1", 0);
                    for (int var31 = 0; var31 < 13; ++var31) {
                        this.field332[var31] = new class52(var6, "sideicons", var31);
                    }
                    this.field454 = new class66(var6, "compass", 0);
                    this.field322 = new class66(var6, "mapedge", 0);
                    this.field322.method547(6);
                    for (int var32 = 0; var32 < 72; ++var32) {
                        this.field226[var32] = new class52(var6, "mapscene", var32);
                    }
                    for (int var33 = 0; var33 < 70; ++var33) {
                        this.field510[var33] = new class66(var6, "mapfunction", var33);
                    }
                    for (int var34 = 0; var34 < 5; ++var34) {
                        this.field399[var34] = new class66(var6, "hitmarks", var34);
                    }
                    for (int var35 = 0; var35 < 6; ++var35) {
                        this.field143[var35] = new class66(var6, "headicons_pk", var35);
                    }
                    for (int var36 = 0; var36 < 9; ++var36) {
                        this.field85[var36] = new class66(var6, "headicons_prayer", var36);
                    }
                    for (int var37 = 0; var37 < 6; ++var37) {
                        this.field370[var37] = new class66(var6, "headicons_hint", var37);
                    }
                    this.field262 = new class66(var6, "overlay_multiway", 0);
                    this.field458 = new class66(var6, "mapmarker", 0);
                    this.field459 = new class66(var6, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field377[var38] = new class66(var6, "cross", var38);
                    }
                    this.field272 = new class66(var6, "mapdots", 0);
                    this.field273 = new class66(var6, "mapdots", 1);
                    this.field274 = new class66(var6, "mapdots", 2);
                    this.field275 = new class66(var6, "mapdots", 3);
                    this.field276 = new class66(var6, "mapdots", 4);
                    this.field203 = new class52(var6, "scrollbar", 0);
                    this.field204 = new class52(var6, "scrollbar", 1);
                    this.field434 = new class52(var6, "redstone1", 0);
                    this.field435 = new class52(var6, "redstone2", 0);
                    this.field436 = new class52(var6, "redstone3", 0);
                    this.field437 = new class52(var6, "redstone1", 0);
                    this.field437.method425(field100);
                    this.field438 = new class52(var6, "redstone2", 0);
                    this.field438.method425(field100);
                    this.field195 = new class52(var6, "redstone1", 0);
                    this.field195.method426(false);
                    this.field196 = new class52(var6, "redstone2", 0);
                    this.field196.method426(false);
                    this.field197 = new class52(var6, "redstone3", 0);
                    this.field197.method426(false);
                    this.field198 = new class52(var6, "redstone1", 0);
                    this.field198.method425(field100);
                    this.field198.method426(false);
                    this.field199 = new class52(var6, "redstone2", 0);
                    this.field199.method425(field100);
                    this.field199.method426(false);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field208[var39] = new class52(var6, "mod_icons", var39);
                    }
                    class66 var40 = new class66(var6, "backleft1", 0);
                    this.field407 = new class17(3, var40.field1646, var40.field1645, this.method117(0));
                    var40.method548(6, 0, 0);
                    class66 var41 = new class66(var6, "backleft2", 0);
                    this.field408 = new class17(3, var41.field1646, var41.field1645, this.method117(0));
                    var41.method548(6, 0, 0);
                    class66 var42 = new class66(var6, "backright1", 0);
                    this.field409 = new class17(3, var42.field1646, var42.field1645, this.method117(0));
                    var42.method548(6, 0, 0);
                    class66 var43 = new class66(var6, "backright2", 0);
                    this.field410 = new class17(3, var43.field1646, var43.field1645, this.method117(0));
                    var43.method548(6, 0, 0);
                    class66 var44 = new class66(var6, "backtop1", 0);
                    this.field411 = new class17(3, var44.field1646, var44.field1645, this.method117(0));
                    var44.method548(6, 0, 0);
                    class66 var45 = new class66(var6, "backvmid1", 0);
                    this.field412 = new class17(3, var45.field1646, var45.field1645, this.method117(0));
                    var45.method548(6, 0, 0);
                    class66 var46 = new class66(var6, "backvmid2", 0);
                    this.field413 = new class17(3, var46.field1646, var46.field1645, this.method117(0));
                    var46.method548(6, 0, 0);
                    class66 var47 = new class66(var6, "backvmid3", 0);
                    this.field414 = new class17(3, var47.field1646, var47.field1645, this.method117(0));
                    var47.method548(6, 0, 0);
                    class66 var48 = new class66(var6, "backhmid2", 0);
                    this.field415 = new class17(3, var48.field1646, var48.field1645, this.method117(0));
                    var48.method548(6, 0, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 100; ++var53) {
                        if (this.field510[var53] != null) {
                            this.field510[var53].method546(3, var51 + var52, var50 + var52, var49 + var52);
                        }
                        if (this.field226[var53] != null) {
                            this.field226[var53].method427(3, var51 + var52, var50 + var52, var49 + var52);
                        }
                    }
                    this.method58((byte) -59, 83, "Unpacking textures");
                    class11.method203(var7, (byte) -102);
                    class11.method207(0.8D, (byte) -117);
                    class11.method202(20, (byte) 6);
                    this.method58((byte) -59, 86, "Unpacking config");
                    class41.method389((byte) -114, var4);
                    class9.method192(var4);
                    class37.method381((byte) -114, var4);
                    class12.method215(var4);
                    class2.method8(var4);
                    class50.method415((byte) -114, var4);
                    class54.method434((byte) -114, var4);
                    class51.method421((byte) -114, var4);
                    class60.method480((byte) -114, var4);
                    class12.field711 = field148;
                    if (!field149) {
                        this.method58((byte) -59, 90, "Unpacking sounds");
                        byte[] var54 = var9.method414("sounds.dat", (byte[]) null);
                        class63 var55 = new class63((byte) -58, var54);
                        class58.method468((byte) -114, var55);
                    }
                    this.method58((byte) -59, 95, "Unpacking interfaces");
                    class4[] var56 = new class4[] { this.field417, this.field418, this.field419, this.field420 };
                    class44.method402((byte) 22, var5, var56, var6);
                    this.method58((byte) -59, 100, "Preparing game engine");
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field506.field1391[this.field506.field1393 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field563[var57] = var58;
                        this.field450[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field506.field1391[this.field506.field1393 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field474[var61 - 5] = var62 - 25;
                        this.field162[var61 - 5] = var63 - var62;
                    }
                    class11.method200(503, 765, 5);
                    this.field230 = class11.field682;
                    class11.method200(96, 479, 5);
                    this.field227 = class11.field682;
                    class11.method200(261, 190, 5);
                    this.field228 = class11.field682;
                    class11.method200(334, 512, 5);
                    this.field229 = class11.field682;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = class11.field680[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    class35.method365(var65, 500, (byte) 7, 512, 800, 334);
                    class18.method248(var8);
                    this.field93 = new class23(this, -30992);
                    this.method31(this.field93, 10);
                    class22.field884 = this;
                    class9.field646 = this;
                    class2.field16 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field237 + " " + this.field504);
                    this.field366 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
    public final void method103(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field364[var5] != null) {
                int var6 = this.field362[var5];
                int var7 = 70 - var4 * 14 + this.field142 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field363[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field368 == 0 || this.field368 == 1 && this.method29(var8, (byte) 5))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field398.field1628)) {
                        if (this.field72 >= 1) {
                            this.field433[this.field552] = "Report abuse @whi@" + var8;
                            this.field525[this.field552] = 545;
                            ++this.field552;
                        }
                        this.field433[this.field552] = "Add ignore @whi@" + var8;
                        this.field525[this.field552] = 968;
                        ++this.field552;
                        this.field433[this.field552] = "Add friend @whi@" + var8;
                        this.field525[this.field552] = 493;
                        ++this.field552;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field183 == 0 && (var6 == 7 || this.field301 == 0 || this.field301 == 1 && this.method29(var8, (byte) 5))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field72 >= 1) {
                            this.field433[this.field552] = "Report abuse @whi@" + var8;
                            this.field525[this.field552] = 545;
                            ++this.field552;
                        }
                        this.field433[this.field552] = "Add ignore @whi@" + var8;
                        this.field525[this.field552] = 968;
                        ++this.field552;
                        this.field433[this.field552] = "Add friend @whi@" + var8;
                        this.field525[this.field552] = 493;
                        ++this.field552;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field112 == 0 || this.field112 == 1 && this.method29(var8, (byte) 5))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field433[this.field552] = "Accept trade @whi@" + var8;
                        this.field525[this.field552] = 52;
                        ++this.field552;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field183 == 0 && this.field301 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field112 == 0 || this.field112 == 1 && this.method29(var8, (byte) 5))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field433[this.field552] = "Accept challenge @whi@" + var8;
                        this.field525[this.field552] = 285;
                        ++this.field552;
                    }
                    ++var4;
                }
            }
        }
        if (arg2 >= 0) {
            field482 = 381;
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQQMJEFXK;IIIIIII)V")
    public final void method104(int arg0, class44 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field302) {
            this.field252 = 32;
        } else {
            this.field252 = 0;
        }
        this.field302 = false;
        if (arg0 == 0) {
            if (arg5 >= arg8 && arg5 < arg8 + 16 && arg3 >= arg4 && arg3 < arg4 + 16) {
                arg1.field1259 -= this.field513 * 4;
                if (arg6 == 1) {
                    this.field178 = true;
                }
                if (arg6 == 2 || arg6 == 3) {
                    this.field79 = true;
                }
            } else if (arg5 >= arg8 && arg5 < arg8 + 16 && arg3 >= arg2 + arg4 - 16 && arg3 < arg2 + arg4) {
                arg1.field1259 += this.field513 * 4;
                if (arg6 == 1) {
                    this.field178 = true;
                }
                if (arg6 == 2 || arg6 == 3) {
                    this.field79 = true;
                }
            } else if (arg5 >= arg8 - this.field252 && arg5 < arg8 + 16 + this.field252 && arg3 >= arg4 + 16 && arg3 < arg2 + arg4 - 16 && this.field513 > 0) {
                int var10 = (arg2 - 32) * arg2 / arg7;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg3 - arg4 - 16 - var10 / 2;
                int var12 = arg2 - 32 - var10;
                arg1.field1259 = (arg7 - arg2) * var11 / var12;
                if (arg6 == 1) {
                    this.field178 = true;
                }
                if (arg6 == 2 || arg6 == 3) {
                    this.field79 = true;
                }
                this.field302 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LWNCFPLWV;II)V")
    private final void method105(class63 arg0, int arg1, int arg2) {
        arg0.method512(255);
        int var4 = arg0.method513(8, 0);
        if (arg2 > 0) {
            if (var4 < this.field488) {
                for (int var5 = var4; var5 < this.field488; ++var5) {
                    this.field96[this.field95++] = this.field489[var5];
                }
            }
            if (var4 > this.field488) {
                signlink.reporterror(this.field279 + " Too many npcs");
                throw new RuntimeException("eek");
            } else {
                this.field488 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field489[var6];
                    class55 var8 = this.field487[var7];
                    int var9 = arg0.method513(1, 0);
                    if (var9 == 0) {
                        this.field489[this.field488++] = var7;
                        var8.field1328 = field261;
                    } else {
                        int var10 = arg0.method513(2, 0);
                        if (var10 == 0) {
                            this.field489[this.field488++] = var7;
                            var8.field1328 = field261;
                            this.field287[this.field286++] = var7;
                        } else if (var10 == 1) {
                            this.field489[this.field488++] = var7;
                            var8.field1328 = field261;
                            int var11 = arg0.method513(3, 0);
                            var8.method410(false, var11, 9);
                            int var12 = arg0.method513(1, 0);
                            if (var12 == 1) {
                                this.field287[this.field286++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field489[this.field488++] = var7;
                            var8.field1328 = field261;
                            int var13 = arg0.method513(3, 0);
                            var8.method410(true, var13, 9);
                            int var14 = arg0.method513(3, 0);
                            var8.method410(true, var14, 9);
                            int var15 = arg0.method513(1, 0);
                            if (var15 == 1) {
                                this.field287[this.field286++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field96[this.field95++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method106(boolean arg0) {
        this.field117 = 0;
        if (arg0) {
            this.field463 = !this.field463;
        }
        int var2 = (field398.field1344 >> 7) + this.field328;
        int var3 = (field398.field1345 >> 7) + this.field329;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field117 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field117 = 1;
        }
        if (this.field117 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field117 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LWNCFPLWV;II)V")
    private final void method107(class63 arg0, int arg1, int arg2) {
        this.field95 = 0;
        int var4 = arg1 + arg2;
        this.field286 = 0;
        this.method105(arg0, var4, this.field557);
        this.method65(27810, arg0, var4);
        this.method35(arg0, var4, true);
        for (int var5 = 0; var5 < this.field95; ++var5) {
            int var7 = this.field96[var5];
            if (field261 != this.field487[var7].field1328) {
                this.field487[var7].field1422 = null;
                this.field487[var7] = null;
            }
        }
        if (arg0.field1571 != var4) {
            signlink.reporterror(this.field279 + " size mismatch in getnpcpos - pos:" + arg0.field1571 + " psize:" + var4);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field488; ++var6) {
                if (this.field487[this.field489[var6]] == null) {
                    signlink.reporterror(this.field279 + " null entry in npc list - pos:" + var6 + " size:" + this.field488);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method108(int arg0) {
        if (arg0 != -18786) {
            this.field164 = -1;
        }
        this.field312.method245(this.field463);
        if (this.field176 == 2) {
            byte[] var2 = this.field506.field1391;
            int[] var3 = class72.field1730;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field454.method554(this.field450, 25, 0, this.field137, 256, 0, 33, 1, 33, this.field563, 25);
            this.field313.method245(this.field463);
            class11.field682 = this.field229;
        } else {
            int var6 = this.field137 + this.field134 & 2047;
            int var7 = field398.field1344 / 32 + 48;
            int var8 = 464 - field398.field1345 / 32;
            this.field291.method554(this.field162, var8, 25, var6, this.field429 + 256, 5, 146, 1, 151, this.field474, var7);
            this.field454.method554(this.field450, 25, 0, this.field137, 256, 0, 33, 1, 33, this.field563, 25);
            for (int var9 = 0; var9 < this.field292; ++var9) {
                int var39 = this.field293[var9] * 4 + 2 - field398.field1344 / 32;
                int var40 = this.field294[var9] * 4 + 2 - field398.field1345 / 32;
                this.method127(var40, var39, false, this.field307[var9]);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class61 var36 = this.field559[this.field205][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field398.field1344 / 32;
                        int var38 = var35 * 4 + 2 - field398.field1345 / 32;
                        this.method127(var38, var37, false, this.field272);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field488; ++var11) {
                class55 var31 = this.field487[this.field489[var11]];
                if (var31 != null && var31.method408((byte) 8)) {
                    class2 var32 = var31.field1422;
                    if (var32.field38 != null) {
                        var32 = var32.method6(324);
                    }
                    if (var32 != null && var32.field43 && var32.field23) {
                        int var33 = var31.field1344 / 32 - field398.field1344 / 32;
                        int var34 = var31.field1345 / 32 - field398.field1345 / 32;
                        this.method127(var34, var33, false, this.field273);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field284; ++var12) {
                class65 var23 = this.field283[this.field285[var12]];
                if (var23 != null && var23.method408((byte) 8)) {
                    int var24 = var23.field1344 / 32 - field398.field1344 / 32;
                    int var25 = var23.field1345 / 32 - field398.field1345 / 32;
                    boolean var26 = false;
                    long var27 = class19.method286(var23.field1628);
                    for (int var29 = 0; var29 < this.field235; ++var29) {
                        if (this.field210[var29] == var27 && this.field469[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field398.field1627 != 0 && var23.field1627 != 0 && field398.field1627 == var23.field1627) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method127(var25, var24, false, this.field275);
                    } else if (var30) {
                        this.method127(var25, var24, false, this.field276);
                    } else {
                        this.method127(var25, var24, false, this.field274);
                    }
                }
            }
            if (this.field185 != 0 && field261 % 20 < 10) {
                if (this.field185 == 1 && this.field231 >= 0 && this.field231 < this.field487.length) {
                    class55 var13 = this.field487[this.field231];
                    if (var13 != null) {
                        int var14 = var13.field1344 / 32 - field398.field1344 / 32;
                        int var15 = var13.field1345 / 32 - field398.field1345 / 32;
                        this.method135(var15, true, var14, this.field459);
                    }
                }
                if (this.field185 == 2) {
                    int var16 = (this.field168 - this.field328) * 4 + 2 - field398.field1344 / 32;
                    int var17 = (this.field169 - this.field329) * 4 + 2 - field398.field1345 / 32;
                    this.method135(var17, true, var16, this.field459);
                }
                if (this.field185 == 10 && this.field365 >= 0 && this.field365 < this.field283.length) {
                    class65 var18 = this.field283[this.field365];
                    if (var18 != null) {
                        int var19 = var18.field1344 / 32 - field398.field1344 / 32;
                        int var20 = var18.field1345 / 32 - field398.field1345 / 32;
                        this.method135(var20, true, var19, this.field459);
                    }
                }
            }
            if (this.field289 != 0) {
                int var21 = this.field289 * 4 + 2 - field398.field1344 / 32;
                int var22 = this.field290 * 4 + 2 - field398.field1345 / 32;
                this.method127(var22, var21, false, this.field458);
            }
            class72.method597(3, 16777215, 3, 97, this.field357, 78);
            this.field313.method245(this.field463);
            class11.field682 = this.field229;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LWNCFPLWV;IZ)V")
    private final void method109(class63 arg0, int arg1, boolean arg2) {
        arg0.method512(255);
        if (arg2) {
            this.field349 = this.field152.method317();
        }
        int var4 = arg0.method513(1, 0);
        if (var4 != 0) {
            int var5 = arg0.method513(2, 0);
            if (var5 == 0) {
                this.field287[this.field286++] = this.field282;
            } else if (var5 == 1) {
                int var6 = arg0.method513(3, 0);
                field398.method410(false, var6, 9);
                int var7 = arg0.method513(1, 0);
                if (var7 == 1) {
                    this.field287[this.field286++] = this.field282;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method513(3, 0);
                field398.method410(true, var8, 9);
                int var9 = arg0.method513(3, 0);
                field398.method410(true, var9, 9);
                int var10 = arg0.method513(1, 0);
                if (var10 == 1) {
                    this.field287[this.field286++] = this.field282;
                }
            } else if (var5 == 3) {
                int var11 = arg0.method513(1, 0);
                this.field205 = arg0.method513(2, 0);
                int var12 = arg0.method513(7, 0);
                int var13 = arg0.method513(1, 0);
                if (var13 == 1) {
                    this.field287[this.field286++] = this.field282;
                }
                int var14 = arg0.method513(7, 0);
                field398.method411(var12, (byte) 4, var11 == 1, var14);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)LRPFMUSNN;")
    public final class49 method110(String arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field306[0] != null) {
                var7 = this.field306[0].method430(-934, arg3);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field536.reset();
            this.field536.update(var7);
            int var9 = (int) this.field536.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class49(34083, var7);
        } else {
            int var11 = 0;
            if (arg1 != -3191) {
                field428 = this.field152.method317();
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method58((byte) -59, arg5, "Requesting " + arg4);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method97(arg0 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class63 var17 = new class63((byte) -58, var16);
                    var17.field1571 = 3;
                    int var18 = var17.method506() + 6;
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
                            this.method58((byte) -59, arg5, "Loading " + arg4 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field306[0] != null) {
                            this.field306[0].method431(var7, (byte) 5, var7.length, arg3);
                        }
                    } catch (Exception var29) {
                        this.field306[0] = null;
                    }
                    if (var7 != null) {
                        this.field536.reset();
                        this.field536.update(var7);
                        int var24 = (int) this.field536.getValue();
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
                            this.method58((byte) -59, arg5, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method58((byte) -59, arg5, var12 + " - Retrying in " + var26);
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
                    this.field502 = !this.field502;
                }
            }
            return new class49(34083, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LRODHPQMW;IB)V")
    public final void method111(class48 arg0, int arg1, byte arg2) {
        this.method112(arg0.field1344, this.field269, arg0.field1345, arg1);
        if (arg2 != -122) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IBII)V")
    public final void method112(int arg0, byte arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
            int var5 = this.method133(arg0, arg2, 899, this.field205) - arg3;
            int var6 = arg0 - this.field527;
            int var7 = var5 - this.field528;
            int var8 = arg2 - this.field529;
            int var9 = class56.field1497[this.field530];
            int var10 = class56.field1498[this.field530];
            int var11 = class56.field1497[this.field531];
            int var12 = class56.field1498[this.field531];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (arg1 == 0) {
                boolean var18 = false;
                if (var17 >= 50) {
                    this.field532 = (var13 << 9) / var17 + class11.field676;
                    this.field533 = (var16 << 9) / var17 + class11.field677;
                } else {
                    this.field532 = -1;
                    this.field533 = -1;
                }
            }
        } else {
            this.field532 = -1;
            this.field533 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        class61 var3 = this.field559[this.field205][arg0][arg1];
        if (var3 == null) {
            this.field452.method350(this.field205, arg0, arg1);
        } else {
            int var4 = -99999999;
            class16 var5 = null;
            for (class16 var6 = (class16) var3.method485(); var6 != null; var6 = (class16) var3.method487(6)) {
                class12 var11 = class12.method218(var6.field801);
                int var12 = var11.field701;
                if (var11.field696) {
                    var12 = (var6.field800 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method483(var5, true);
            class16 var7 = null;
            class16 var8 = null;
            for (class16 var9 = (class16) var3.method485(); var9 != null; var9 = (class16) var3.method487(6)) {
                if (var5.field801 != var9.field801 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field801 != var9.field801 && var7.field801 != var9.field801 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field452.method336(arg1, 23092, this.method133(arg0 * 128 + 64, arg1 * 128 + 64, 899, this.field205), var8, var5, var10, var7, this.field205, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method114(boolean arg0) {
        if (!arg0) {
            this.field238 = 391;
        }
        if (this.field167 > 0) {
            this.method49((byte) 3);
        } else {
            this.method50((byte) -95, "Connection lost", "Please wait - attempting to reestablish");
            this.field176 = 0;
            this.field289 = 0;
            class59 var2 = this.field484;
            this.field175 = false;
            this.field467 = 0;
            this.method47(this.field279, this.field280, true);
            if (!this.field175) {
                this.method49((byte) 3);
            }
            try {
                var2.method474();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method115(byte arg0, int arg1, int arg2) {
        if (field378 != arg0) {
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

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field146 = Integer.parseInt(this.getParameter("nodeid"));
        field147 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method75((byte) 0);
        } else {
            method64(-23613);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field148 = false;
        } else {
            field148 = true;
        }
        this.method241(37560, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public void method116(boolean arg0) {
        System.out.println("============");
        this.field175 &= arg0;
        System.out.println("flame-cycle:" + this.field473);
        if (this.field544 != null) {
            System.out.println("Od-cycle:" + this.field544.field842);
        }
        System.out.println("loop-cycle:" + field261);
        System.out.println("draw-cycle:" + field102);
        System.out.println("ptype:" + this.field164);
        System.out.println("psize:" + this.field163);
        if (this.field484 != null) {
            this.field484.method479(true);
        }
        super.field774 = true;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final Component method117(int arg0) {
        this.field163 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field780 != null ? super.field780 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method118(int arg0, boolean arg1) {
        if (arg1) {
            this.field225 = this.field152.method317();
        }
        class44 var3 = class44.method397(arg0);
        for (int var4 = 0; var4 < var3.field1258.length && var3.field1258[var4] != -1; ++var4) {
            class44 var5 = class44.method397(var3.field1258[var4]);
            if (var5.field1263 == 1) {
                this.method118(var5.field1261, false);
            }
            var5.field1253 = 0;
            var5.field1229 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
    private static final String method119(int arg0, int arg1) {
        if (arg1 < 0) {
            if (arg0 < 100000) {
                return String.valueOf(arg0);
            } else {
                return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LJMLHLOET;I)V")
    private final void method120(class26 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field914 == 0) {
            var3 = this.field452.method355(arg0.field913, arg0.field915, arg0.field916);
        }
        if (arg0.field914 == 1) {
            var3 = this.field452.method356(arg0.field916, 0, arg0.field915, arg0.field913);
        }
        if (arg0.field914 == 2) {
            var3 = this.field452.method357(arg0.field913, arg0.field915, arg0.field916);
        }
        if (arg0.field914 == 3) {
            var3 = this.field452.method358(arg0.field913, arg0.field915, arg0.field916);
        }
        if (var3 != 0) {
            int var7 = this.field452.method359(arg0.field913, arg0.field915, arg0.field916, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field922 = var4;
        if (arg1 != -46483) {
            this.field295 = !this.field295;
        }
        arg0.field924 = var5;
        arg0.field923 = var6;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (arg0 != -26) {
            this.field164 = this.field119.method502();
        }
        this.field247 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field145[var2] = -1;
            for (int var3 = 0; var3 < class50.field1362; ++var3) {
                if (!class50.field1363[var3].field1369 && class50.field1363[var3].field1364 == var2 + (this.field537 ? 0 : 7)) {
                    this.field145[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBLQQMJEFXK;I)V")
    public final void method122(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class44 arg6, int arg7) {
        if (this.field416 != arg5) {
            this.field164 = -1;
        }
        if (arg6.field1263 == 0 && arg6.field1258 != null && !arg6.field1236) {
            if (arg7 >= arg3 && arg0 >= arg4 && arg7 <= arg6.field1256 + arg3 && arg0 <= arg6.field1260 + arg4) {
                int var9 = arg6.field1258.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg6.field1230[var10] + arg3;
                    int var12 = arg6.field1254[var10] + arg4 - arg1;
                    class44 var13 = class44.method397(arg6.field1258[var10]);
                    int var14 = var13.field1265 + var11;
                    int var15 = var13.field1237 + var12;
                    if ((var13.field1267 >= 0 || var13.field1213 != 0) && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1256 + var14 && arg0 < var13.field1260 + var15) {
                        if (var13.field1267 >= 0) {
                            this.field401 = var13.field1267;
                        } else {
                            this.field401 = var13.field1261;
                        }
                    }
                    if (var13.field1263 == 8 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1256 + var14 && arg0 < var13.field1260 + var15) {
                        this.field514 = var13.field1261;
                    }
                    if (var13.field1263 == 0) {
                        this.method122(arg0, var13.field1259, arg2, var14, var15, (byte) 12, var13, arg7);
                        if (var13.field1204 > var13.field1260) {
                            this.method104(0, var13, var13.field1260, arg0, var15, arg7, arg2, var13.field1204, var13.field1256 + var14);
                        }
                    } else {
                        if (var13.field1208 == 1 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1256 + var14 && arg0 < var13.field1260 + var15) {
                            boolean var16 = false;
                            if (var13.field1228 != 0) {
                                var16 = this.method90(0, var13);
                            }
                            if (!var16) {
                                this.field433[this.field552] = var13.field1266;
                                this.field525[this.field552] = 282;
                                this.field524[this.field552] = var13.field1261;
                                ++this.field552;
                            }
                        }
                        if (var13.field1208 == 2 && this.field564 == 0 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1256 + var14 && arg0 < var13.field1260 + var15) {
                            String var17 = var13.field1209;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field433[this.field552] = var17 + " @gre@" + var13.field1249;
                            this.field525[this.field552] = 507;
                            this.field524[this.field552] = var13.field1261;
                            ++this.field552;
                        }
                        if (var13.field1208 == 3 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1256 + var14 && arg0 < var13.field1260 + var15) {
                            this.field433[this.field552] = "Close";
                            if (arg2 == 3) {
                                this.field525[this.field552] = 210;
                            } else {
                                this.field525[this.field552] = 194;
                            }
                            this.field524[this.field552] = var13.field1261;
                            ++this.field552;
                        }
                        if (var13.field1208 == 4 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1256 + var14 && arg0 < var13.field1260 + var15) {
                            this.field433[this.field552] = var13.field1266;
                            this.field525[this.field552] = 144;
                            this.field524[this.field552] = var13.field1261;
                            ++this.field552;
                        }
                        if (var13.field1208 == 5 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1256 + var14 && arg0 < var13.field1260 + var15) {
                            this.field433[this.field552] = var13.field1266;
                            this.field525[this.field552] = 393;
                            this.field524[this.field552] = var13.field1261;
                            ++this.field552;
                        }
                        if (var13.field1208 == 6 && !this.field161 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field1256 + var14 && arg0 < var13.field1260 + var15) {
                            this.field433[this.field552] = var13.field1266;
                            this.field525[this.field552] = 588;
                            this.field524[this.field552] = var13.field1261;
                            ++this.field552;
                        }
                        if (var13.field1263 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1260; ++var19) {
                                for (int var20 = 0; var20 < var13.field1256; ++var20) {
                                    int var21 = (var13.field1226 + 32) * var20 + var14;
                                    int var22 = (var13.field1235 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1225[var18];
                                        var22 += var13.field1239[var18];
                                    }
                                    if (arg7 >= var21 && arg0 >= var22 && arg7 < var21 + 32 && arg0 < var22 + 32) {
                                        this.field372 = var18;
                                        this.field373 = var13.field1261;
                                        if (var13.field1233[var18] > 0) {
                                            class12 var23 = class12.method218(var13.field1233[var18] - 1);
                                            if (this.field190 == 1 && var13.field1247) {
                                                if (this.field192 != var13.field1261 || this.field191 != var18) {
                                                    this.field433[this.field552] = "Use " + this.field194 + " with @lre@" + var23.field705;
                                                    this.field525[this.field552] = 112;
                                                    this.field526[this.field552] = var23.field726;
                                                    this.field523[this.field552] = var18;
                                                    this.field524[this.field552] = var13.field1261;
                                                    ++this.field552;
                                                }
                                            } else if (this.field564 == 1 && var13.field1247) {
                                                if ((this.field566 & 16) == 16) {
                                                    this.field433[this.field552] = this.field567 + " @lre@" + var23.field705;
                                                    this.field525[this.field552] = 560;
                                                    this.field526[this.field552] = var23.field726;
                                                    this.field523[this.field552] = var18;
                                                    this.field524[this.field552] = var13.field1261;
                                                    ++this.field552;
                                                }
                                            } else {
                                                if (var13.field1247) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field729 != null && var23.field729[var24] != null) {
                                                            this.field433[this.field552] = var23.field729[var24] + " @lre@" + var23.field705;
                                                            if (var24 == 3) {
                                                                this.field525[this.field552] = 840;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field525[this.field552] = 280;
                                                            }
                                                            this.field526[this.field552] = var23.field726;
                                                            this.field523[this.field552] = var18;
                                                            this.field524[this.field552] = var13.field1261;
                                                            ++this.field552;
                                                        } else if (var24 == 4) {
                                                            this.field433[this.field552] = "Drop @lre@" + var23.field705;
                                                            this.field525[this.field552] = 280;
                                                            this.field526[this.field552] = var23.field726;
                                                            this.field523[this.field552] = var18;
                                                            this.field524[this.field552] = var13.field1261;
                                                            ++this.field552;
                                                        }
                                                    }
                                                }
                                                if (var13.field1268) {
                                                    this.field433[this.field552] = "Use @lre@" + var23.field705;
                                                    this.field525[this.field552] = 18;
                                                    this.field526[this.field552] = var23.field726;
                                                    this.field523[this.field552] = var18;
                                                    this.field524[this.field552] = var13.field1261;
                                                    ++this.field552;
                                                }
                                                if (var13.field1247 && var23.field729 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field729[var25] != null) {
                                                            this.field433[this.field552] = var23.field729[var25] + " @lre@" + var23.field705;
                                                            if (var25 == 0) {
                                                                this.field525[this.field552] = 205;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field525[this.field552] = 755;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field525[this.field552] = 848;
                                                            }
                                                            this.field526[this.field552] = var23.field726;
                                                            this.field523[this.field552] = var18;
                                                            this.field524[this.field552] = var13.field1261;
                                                            ++this.field552;
                                                        }
                                                    }
                                                }
                                                if (var13.field1251 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1251[var26] != null) {
                                                            this.field433[this.field552] = var13.field1251[var26] + " @lre@" + var23.field705;
                                                            if (var26 == 0) {
                                                                this.field525[this.field552] = 190;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field525[this.field552] = 669;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field525[this.field552] = 516;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field525[this.field552] = 173;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field525[this.field552] = 237;
                                                            }
                                                            this.field526[this.field552] = var23.field726;
                                                            this.field523[this.field552] = var18;
                                                            this.field524[this.field552] = var13.field1261;
                                                            ++this.field552;
                                                        }
                                                    }
                                                }
                                                this.field433[this.field552] = "Examine @lre@" + var23.field705;
                                                this.field525[this.field552] = 1156;
                                                this.field526[this.field552] = var23.field726;
                                                this.field523[this.field552] = var18;
                                                this.field524[this.field552] = var13.field1261;
                                                ++this.field552;
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

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        if (this.field190 == 0 && this.field564 == 0) {
            this.field433[this.field552] = "Walk here";
            this.field525[this.field552] = 599;
            this.field523[this.field552] = super.field785;
            this.field524[this.field552] = super.field786;
            ++this.field552;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class56.field1495; ++var3) {
            int var4 = class56.field1496[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field452.method359(this.field205, var5, var6, var4) >= 0) {
                    class9 var9 = class9.method184(var8);
                    if (var9.field614 != null) {
                        var9 = var9.method191(false);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field190 == 1) {
                        this.field433[this.field552] = "Use " + this.field194 + " with @cya@" + var9.field631;
                        this.field525[this.field552] = 613;
                        this.field526[this.field552] = var4;
                        this.field523[this.field552] = var5;
                        this.field524[this.field552] = var6;
                        ++this.field552;
                    } else if (this.field564 == 1) {
                        if ((this.field566 & 4) == 4) {
                            this.field433[this.field552] = this.field567 + " @cya@" + var9.field631;
                            this.field525[this.field552] = 277;
                            this.field526[this.field552] = var4;
                            this.field523[this.field552] = var5;
                            this.field524[this.field552] = var6;
                            ++this.field552;
                        }
                    } else {
                        if (var9.field622 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field622[var10] != null) {
                                    this.field433[this.field552] = var9.field622[var10] + " @cya@" + var9.field631;
                                    if (var10 == 0) {
                                        this.field525[this.field552] = 203;
                                    }
                                    if (var10 == 1) {
                                        this.field525[this.field552] = 645;
                                    }
                                    if (var10 == 2) {
                                        this.field525[this.field552] = 134;
                                    }
                                    if (var10 == 3) {
                                        this.field525[this.field552] = 886;
                                    }
                                    if (var10 == 4) {
                                        this.field525[this.field552] = 1436;
                                    }
                                    this.field526[this.field552] = var4;
                                    this.field523[this.field552] = var5;
                                    this.field524[this.field552] = var6;
                                    ++this.field552;
                                }
                            }
                        }
                        this.field433[this.field552] = "Examine @cya@" + var9.field631;
                        this.field525[this.field552] = 1286;
                        this.field526[this.field552] = var9.field625 << 14;
                        this.field523[this.field552] = var5;
                        this.field524[this.field552] = var6;
                        ++this.field552;
                    }
                }
                if (var7 == 1) {
                    class55 var11 = this.field487[var8];
                    if (var11.field1422.field29 == 1 && (var11.field1344 & 127) == 64 && (var11.field1345 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field488; ++var12) {
                            class55 var15 = this.field487[this.field489[var12]];
                            if (var15 != null && var11 != var15 && var15.field1422.field29 == 1 && var11.field1344 == var15.field1344 && var11.field1345 == var15.field1345) {
                                this.method28(var6, var5, this.field489[var12], (byte) 2, var15.field1422);
                            }
                        }
                        for (int var13 = 0; var13 < this.field284; ++var13) {
                            class65 var14 = this.field283[this.field285[var13]];
                            if (var14 != null && var11.field1344 == var14.field1344 && var11.field1345 == var14.field1345) {
                                this.method68(this.field285[var13], -154, var14, var6, var5);
                            }
                        }
                    }
                    this.method28(var6, var5, var8, (byte) 2, var11.field1422);
                }
                if (var7 == 0) {
                    class65 var16 = this.field283[var8];
                    if ((var16.field1344 & 127) == 64 && (var16.field1345 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field488; ++var17) {
                            class55 var20 = this.field487[this.field489[var17]];
                            if (var20 != null && var20.field1422.field29 == 1 && var16.field1344 == var20.field1344 && var16.field1345 == var20.field1345) {
                                this.method28(var6, var5, this.field489[var17], (byte) 2, var20.field1422);
                            }
                        }
                        for (int var18 = 0; var18 < this.field284; ++var18) {
                            class65 var19 = this.field283[this.field285[var18]];
                            if (var19 != null && var16 != var19 && var16.field1344 == var19.field1344 && var16.field1345 == var19.field1345) {
                                this.method68(this.field285[var18], -154, var19, var6, var5);
                            }
                        }
                    }
                    this.method68(var8, -154, var16, var6, var5);
                }
                if (var7 == 3) {
                    class61 var21 = this.field559[this.field205][var5][var6];
                    if (var21 != null) {
                        for (class16 var22 = (class16) var21.method486(7); var22 != null; var22 = (class16) var21.method488(836)) {
                            class12 var23 = class12.method218(var22.field801);
                            if (this.field190 == 1) {
                                this.field433[this.field552] = "Use " + this.field194 + " with @lre@" + var23.field705;
                                this.field525[this.field552] = 964;
                                this.field526[this.field552] = var22.field801;
                                this.field523[this.field552] = var5;
                                this.field524[this.field552] = var6;
                                ++this.field552;
                            } else if (this.field564 == 1) {
                                if ((this.field566 & 1) == 1) {
                                    this.field433[this.field552] = this.field567 + " @lre@" + var23.field705;
                                    this.field525[this.field552] = 756;
                                    this.field526[this.field552] = var22.field801;
                                    this.field523[this.field552] = var5;
                                    this.field524[this.field552] = var6;
                                    ++this.field552;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field718 != null && var23.field718[var24] != null) {
                                        this.field433[this.field552] = var23.field718[var24] + " @lre@" + var23.field705;
                                        if (var24 == 0) {
                                            this.field525[this.field552] = 448;
                                        }
                                        if (var24 == 1) {
                                            this.field525[this.field552] = 264;
                                        }
                                        if (var24 == 2) {
                                            this.field525[this.field552] = 830;
                                        }
                                        if (var24 == 3) {
                                            this.field525[this.field552] = 497;
                                        }
                                        if (var24 == 4) {
                                            this.field525[this.field552] = 265;
                                        }
                                        this.field526[this.field552] = var22.field801;
                                        this.field523[this.field552] = var5;
                                        this.field524[this.field552] = var6;
                                        ++this.field552;
                                    } else if (var24 == 2) {
                                        this.field433[this.field552] = "Take @lre@" + var23.field705;
                                        this.field525[this.field552] = 830;
                                        this.field526[this.field552] = var22.field801;
                                        this.field523[this.field552] = var5;
                                        this.field524[this.field552] = var6;
                                        ++this.field552;
                                    }
                                }
                                this.field433[this.field552] = "Examine @lre@" + var23.field705;
                                this.field525[this.field552] = 1247;
                                this.field526[this.field552] = var22.field801;
                                this.field523[this.field552] = var5;
                                this.field524[this.field552] = var6;
                                ++this.field552;
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            this.field84 = 122;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method124(byte arg0) {
        int var2 = 5;
        this.field495[8] = 0;
        if (this.field297 != arg0) {
            this.field471 = !this.field471;
        }
        int var3 = 0;
        while (this.field495[8] == 0) {
            String var4 = "Unknown problem";
            this.method58((byte) -59, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method97("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 373);
                class63 var6 = new class63((byte) -58, new byte[40]);
                var5.readFully(var6.field1570, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field495[var7] = var6.method507();
                }
                int var8 = var6.method507();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field495[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field495[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field495[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field495[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field495[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field495[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method58((byte) -59, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method58((byte) -59, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field502 = !this.field502;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method125(int arg0) {
        class9.field657.method181();
        class9.field615.method181();
        class2.field37.method181();
        class12.field707.method181();
        class12.field694.method181();
        this.field163 += arg0;
        class65.field1610.method181();
        class54.field1419.method181();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
    public final void method126(byte arg0, int arg1) {
        if (arg0 != 77) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZLWSNKRVXZ;)V")
    public final void method127(int arg0, int arg1, boolean arg2, class66 arg3) {
        if (arg3 != null) {
            int var5 = this.field137 + this.field134 & 2047;
            int var6 = arg0 * arg0 + arg1 * arg1;
            if (var6 <= 6400) {
                int var7 = class56.field1497[var5];
                int var8 = class56.field1498[var5];
                int var9 = var7 * 256 / (this.field429 + 256);
                int var10 = var8 * 256 / (this.field429 + 256);
                int var11 = arg0 * var9 + arg1 * var10 >> 16;
                int var12 = arg0 * var10 - arg1 * var9 >> 16;
                if (arg2) {
                    this.field164 = this.field119.method502();
                }
                if (var6 > 2500) {
                    arg3.method556(var11 + 94 - arg3.field1649 / 2 + 4, this.field506, false, 83 - var12 - arg3.field1650 / 2 - 4);
                } else {
                    arg3.method550(false, var11 + 94 - arg3.field1649 / 2 + 4, 83 - var12 - arg3.field1650 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method128(int arg0) {
        if (arg0 == 5) {
            this.field483.method491(178, (byte) -80);
            if (this.field263 != -1) {
                this.method54(6, this.field263);
                this.field263 = -1;
                this.field178 = true;
                this.field161 = false;
                this.field184 = true;
            }
            if (this.field116 != -1) {
                this.method54(6, this.field116);
                this.field116 = -1;
                this.field79 = true;
                this.field161 = false;
            }
            if (this.field449 != -1) {
                this.method54(6, this.field449);
                this.field449 = -1;
                this.field202 = true;
            }
            if (this.field348 != -1) {
                this.method54(6, this.field348);
                this.field348 = -1;
            }
            if (this.field361 != -1) {
                this.method54(6, this.field361);
                this.field361 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method129(int arg0) {
        while (arg0 >= 0) {
            this.field559 = null;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method244(this.field543);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field361 != -1 && this.field400 == this.field361) {
                        if (var2 == 8 && this.field115.length() > 0) {
                            this.field115 = this.field115.substring(0, this.field115.length() - 1);
                        }
                        break;
                    }
                    if (this.field160) {
                        if (var2 >= 32 && var2 <= 122 && this.field92.length() < 80) {
                            this.field92 = this.field92 + (char) var2;
                            this.field79 = true;
                        }
                        if (var2 == 8 && this.field92.length() > 0) {
                            this.field92 = this.field92.substring(0, this.field92.length() - 1);
                            this.field79 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field160 = false;
                            this.field79 = true;
                            if (this.field303 == 1) {
                                long var3 = class19.method286(this.field92);
                                this.method66(var3, -34932);
                            }
                            if (this.field303 == 2 && this.field235 > 0) {
                                long var5 = class19.method286(this.field92);
                                this.method167(2, var5);
                            }
                            if (this.field303 == 3 && this.field92.length() > 0) {
                                this.field483.method491(235, (byte) -80);
                                this.field483.method492(0);
                                int var7 = this.field483.field1571;
                                this.field483.method498(0, this.field554);
                                class30.method321(this.field92, this.field483, (byte) 109);
                                this.field483.method501(this.field483.field1571 - var7, 0);
                                this.field92 = class30.method322(this.field92, true);
                                this.field92 = class18.method258(this.field92, true);
                                this.method44(6, class19.method290(true, class19.method287(false, this.field554)), this.field92, (byte) 1);
                                if (this.field301 == 2) {
                                    this.field301 = 1;
                                    this.field355 = true;
                                    this.field483.method491(8, (byte) -80);
                                    this.field483.method492(this.field368);
                                    this.field483.method492(this.field301);
                                    this.field483.method492(this.field112);
                                }
                            }
                            if (this.field303 == 4 && this.field553 < 100) {
                                long var8 = class19.method286(this.field92);
                                this.method141(var8, this.field84);
                            }
                            if (this.field303 == 5 && this.field553 > 0) {
                                long var10 = class19.method286(this.field92);
                                this.method53(false, var10);
                            }
                        }
                    } else if (this.field511 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field550.length() < 10) {
                            this.field550 = this.field550 + (char) var2;
                            this.field79 = true;
                        }
                        if (var2 == 8 && this.field550.length() > 0) {
                            this.field550 = this.field550.substring(0, this.field550.length() - 1);
                            this.field79 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field550.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field550);
                                } catch (Exception var22) {
                                }
                                this.field483.method491(24, (byte) -80);
                                this.field483.method496(var12);
                            }
                            this.field511 = 0;
                            this.field79 = true;
                        }
                    } else if (this.field511 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field550.length() < 12) {
                            this.field550 = this.field550 + (char) var2;
                            this.field79 = true;
                        }
                        if (var2 == 8 && this.field550.length() > 0) {
                            this.field550 = this.field550.substring(0, this.field550.length() - 1);
                            this.field79 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field550.length() > 0) {
                                this.field483.method491(25, (byte) -80);
                                this.field483.method498(0, class19.method286(this.field550));
                            }
                            this.field511 = 0;
                            this.field79 = true;
                        }
                    } else if (this.field511 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field550.length() < 40) {
                            this.field550 = this.field550 + (char) var2;
                            this.field79 = true;
                        }
                        if (var2 == 8 && this.field550.length() > 0) {
                            this.field550 = this.field550.substring(0, this.field550.length() - 1);
                            this.field79 = true;
                        }
                    } else if (this.field116 == -1 && this.field449 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field535.length() < 80) {
                            this.field535 = this.field535 + (char) var2;
                            this.field79 = true;
                        }
                        if (var2 == 8 && this.field535.length() > 0) {
                            this.field535 = this.field535.substring(0, this.field535.length() - 1);
                            this.field79 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field535.length() > 0) {
                            if (this.field72 == 2) {
                                if (this.field535.equals("::clientdrop")) {
                                    this.method114(true);
                                }
                                if (this.field535.equals("::lag")) {
                                    this.method116(true);
                                }
                                if (this.field535.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field544.method293(0, 2); ++var13) {
                                        this.field544.method306(var13, 2, (byte) 1, false);
                                    }
                                }
                                if (this.field535.equals("::fpson")) {
                                    field258 = true;
                                }
                                if (this.field535.equals("::fpsoff")) {
                                    field258 = false;
                                }
                                if (this.field535.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field468[var14].field755[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field535.startsWith("::")) {
                                this.field483.method491(151, (byte) -80);
                                this.field483.method492(this.field535.length() - 1);
                                this.field483.method499(this.field535.substring(2));
                            } else {
                                String var17 = this.field535.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field535 = this.field535.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field535 = this.field535.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field535 = this.field535.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field535 = this.field535.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field535 = this.field535.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field535 = this.field535.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field535 = this.field535.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field535 = this.field535.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field535 = this.field535.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field535 = this.field535.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field535 = this.field535.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field535 = this.field535.substring(6);
                                }
                                String var19 = this.field535.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field535 = this.field535.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field535 = this.field535.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field535 = this.field535.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field535 = this.field535.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field535 = this.field535.substring(6);
                                }
                                this.field483.method491(130, (byte) -80);
                                this.field483.method492(0);
                                int var21 = this.field483.field1571;
                                this.field483.method519(var18, 0);
                                this.field486.field1571 = 0;
                                class30.method321(this.field535, this.field486, (byte) 109);
                                this.field483.method500(this.field260, 0, this.field486.field1570, this.field486.field1571);
                                this.field483.method518(true, var20);
                                this.field483.method501(this.field483.field1571 - var21, 0);
                                this.field535 = class30.method322(this.field535, true);
                                this.field535 = class18.method258(this.field535, true);
                                field398.field1297 = this.field535;
                                field398.field1301 = var18;
                                field398.field1338 = var20;
                                field398.field1351 = 150;
                                if (this.field72 == 2) {
                                    this.method44(2, "@cr2@" + field398.field1628, field398.field1297, (byte) 1);
                                } else if (this.field72 == 1) {
                                    this.method44(2, "@cr1@" + field398.field1628, field398.field1297, (byte) 1);
                                } else {
                                    this.method44(2, field398.field1628, field398.field1297, (byte) 1);
                                }
                                if (this.field368 == 2) {
                                    this.field368 = 3;
                                    this.field355 = true;
                                    this.field483.method491(8, (byte) -80);
                                    this.field483.method492(this.field368);
                                    this.field483.method492(this.field301);
                                    this.field483.method492(this.field112);
                                }
                            }
                            this.field535 = "";
                            this.field79 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field115.length() < 12) {
                this.field115 = this.field115 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method130(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 >= 0) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQQMJEFXK;II)I")
    public final int method131(class44 arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            this.field483.method492(129);
        }
        if (arg0.field1221 != null && arg2 < arg0.field1221.length) {
            try {
                int[] var4 = arg0.field1221[arg2];
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
                        var9 = this.field475[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field350[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field493[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class44 var11 = class44.method397(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class12.field703 && (!class12.method218(var12).field720 || field148)) {
                            for (int var13 = 0; var13 < var11.field1233.length; ++var13) {
                                if (var12 + 1 == var11.field1233[var13]) {
                                    var9 += var11.field1211[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field534[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field181[this.field350[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field534[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field398.field1637;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class31.field939; ++var14) {
                            if (class31.field941[var14]) {
                                var9 += this.field350[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class44 var15 = class44.method397(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class12.field703 && (!class12.method218(var16).field720 || field148)) {
                            for (int var17 = 0; var17 < var15.field1233.length; ++var17) {
                                if (var15.field1233[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field343;
                    }
                    if (var8 == 12) {
                        var9 = this.field369;
                    }
                    if (var8 == 13) {
                        int var18 = this.field534[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class60 var21 = class60.field1530[var20];
                        int var22 = var21.field1532;
                        int var23 = var21.field1533;
                        int var24 = var21.field1534;
                        int var25 = field114[var24 - var23];
                        var9 = this.field534[var22] >> var23 & var25;
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
                        var9 = (field398.field1344 >> 7) + this.field328;
                    }
                    if (var8 == 19) {
                        var9 = (field398.field1345 >> 7) + this.field329;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
    public final boolean method132(byte[] arg0, int arg1, int arg2) {
        if (arg2 != -6504) {
            throw new NullPointerException();
        } else {
            return arg0 == null ? true : signlink.wavesave(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method133(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 65 / arg2;
        int var6 = arg0 >> 7;
        int var7 = arg1 >> 7;
        if (var6 >= 0 && var7 >= 0 && var6 <= 103 && var7 <= 103) {
            int var8 = arg3;
            if (arg3 < 3 && (this.field255[1][var6][var7] & 2) == 2) {
                var8 = arg3 + 1;
            }
            int var9 = arg0 & 127;
            int var10 = arg1 & 127;
            int var11 = (128 - var9) * this.field539[var8][var6][var7] + this.field539[var8][var6 + 1][var7] * var9 >> 7;
            int var12 = (128 - var9) * this.field539[var8][var6][var7 + 1] + this.field539[var8][var6 + 1][var7 + 1] * var9 >> 7;
            return (128 - var10) * var11 + var10 * var12 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++this.field304;
        this.method33(true, this.field295);
        this.method87((byte) 6, true);
        this.method33(false, this.field295);
        this.method87((byte) 6, false);
        this.method136(0);
        this.method62((byte) 14);
        if (!this.field121) {
            int var2 = this.field136;
            if (this.field503 / 256 > var2) {
                var2 = this.field503 / 256;
            }
            if (this.field541[4] && this.field259[4] + 128 > var2) {
                var2 = this.field259[4] + 128;
            }
            int var3 = this.field75 + this.field137 & 2047;
            this.method34(this.method133(field398.field1344, field398.field1345, 899, this.field205) - 50, var2, var2 * 3 + 600, 3, var3, this.field383, this.field382);
        }
        int var4;
        if (!this.field121) {
            var4 = this.method145(-521);
        } else {
            var4 = this.method146(false);
        }
        int var5 = this.field527;
        int var6 = this.field528;
        int var7 = this.field529;
        int var8 = this.field530;
        int var9 = this.field531;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field541[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field296[var10] * 2 + 1) - (double) this.field296[var10] + Math.sin((double) this.field556[var10] / 100.0D * (double) this.field500[var10]) * (double) this.field259[var10]);
                if (var10 == 0) {
                    this.field527 += var12;
                }
                if (var10 == 1) {
                    this.field528 += var12;
                }
                if (var10 == 2) {
                    this.field529 += var12;
                }
                if (var10 == 3) {
                    this.field531 = this.field531 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field530 += var12;
                    if (this.field530 < 128) {
                        this.field530 = 128;
                    }
                    if (this.field530 > 383) {
                        this.field530 = 383;
                    }
                }
            }
        }
        int var11 = class11.field691;
        class56.field1492 = true;
        class56.field1495 = 0;
        class56.field1493 = super.field785 - 4;
        class56.field1494 = super.field786 - 4;
        class72.method595(-102);
        this.field452.method368(this.field529, this.field527, this.field528, (byte) -102, this.field530, this.field531, var4);
        this.field452.method343(7);
        this.method96(0);
        this.method43(0);
        this.method144(1, var11);
        this.method91(this.field219);
        this.field313.method246(4, super.field777, 4, 1);
        this.field527 = var5;
        this.field528 = var6;
        this.field529 = var7;
        this.field530 = var8;
        if (arg0 >= 0) {
            this.field483.method492(10);
        }
        this.field531 = var9;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILWSNKRVXZ;)V")
    public final void method135(int arg0, boolean arg1, int arg2, class66 arg3) {
        this.field175 &= arg1;
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field137 + this.field134 & 2047;
            int var7 = class56.field1497[var6];
            int var8 = class56.field1498[var6];
            int var9 = var7 * 256 / (this.field429 + 256);
            int var10 = var8 * 256 / (this.field429 + 256);
            int var11 = arg0 * var9 + arg2 * var10 >> 16;
            int var12 = arg0 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field322.method555(15, 20, 20, 15, var15 + 94 + 4 - 10, var13, 83 - var16 - 20, 256, false);
        } else {
            this.method127(arg0, arg2, false, arg3);
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method136(int arg0) {
        for (class64 var2 = (class64) this.field141.method485(); var2 != null; var2 = (class64) this.field141.method487(6)) {
            if (this.field205 == var2.field1588 && field261 <= var2.field1608) {
                if (field261 >= var2.field1607) {
                    if (var2.field1606 > 0) {
                        class55 var4 = this.field487[var2.field1606 - 1];
                        if (var4 != null && var4.field1344 >= 0 && var4.field1344 < 13312 && var4.field1345 >= 0 && var4.field1345 < 13312) {
                            var2.method541(var4.field1345, var4.field1344, this.method133(var4.field1344, var4.field1345, 899, var2.field1588) - var2.field1587, (byte) 8, field261);
                        }
                    }
                    if (var2.field1606 < 0) {
                        int var5 = -var2.field1606 - 1;
                        class65 var6;
                        if (this.field472 == var5) {
                            var6 = field398;
                        } else {
                            var6 = this.field283[var5];
                        }
                        if (var6 != null && var6.field1344 >= 0 && var6.field1344 < 13312 && var6.field1345 >= 0 && var6.field1345 < 13312) {
                            var2.method541(var6.field1345, var6.field1344, this.method133(var6.field1344, var6.field1345, 899, var2.field1588) - var2.field1587, (byte) 8, field261);
                        }
                    }
                    var2.method540(this.field174, this.field315);
                    this.field452.method340(false, 32536, this.field205, var2, var2.field1599, (int) var2.field1595, 60, (int) var2.field1596, (int) var2.field1594, -1);
                }
            } else {
                var2.method327();
            }
        }
        ++field358;
        if (arg0 < 0 || arg0 > 0) {
            this.field241 = 432;
        }
        if (field358 > 1602) {
            field358 = 0;
            this.field483.method491(138, (byte) -80);
            this.field483.method492(0);
            int var3 = this.field483.field1571;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field483.method492(0);
            }
            this.field483.method493(63187);
            this.field483.method492(25);
            this.field483.method492(148);
            this.field483.method492((int) (Math.random() * 256.0D));
            this.field483.method492(111);
            this.field483.method493(13097);
            this.field483.method492(50);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field483.method493(42137);
            }
            this.field483.method492((int) (Math.random() * 256.0D));
            this.field483.method501(this.field483.field1571 - var3, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Ljava/lang/String;")
    public final String method137(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field780 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method138(byte arg0) {
        if (arg0 != -25) {
            this.field559 = null;
        }
        try {
            int var2 = field398.field1344 + this.field270;
            int var3 = field398.field1345 + this.field265;
            if (this.field382 - var2 < -500 || this.field382 - var2 > 500 || this.field383 - var3 < -500 || this.field383 - var3 > 500) {
                this.field382 = var2;
                this.field383 = var3;
            }
            if (this.field382 != var2) {
                this.field382 += (var2 - this.field382) / 16;
            }
            if (this.field383 != var3) {
                this.field383 += (var3 - this.field383) / 16;
            }
            if (super.field795[1] == 1) {
                this.field138 += (-24 - this.field138) / 2;
            } else if (super.field795[2] == 1) {
                this.field138 += (24 - this.field138) / 2;
            } else {
                this.field138 /= 2;
            }
            if (super.field795[3] == 1) {
                this.field139 += (12 - this.field139) / 2;
            } else if (super.field795[4] == 1) {
                this.field139 += (-12 - this.field139) / 2;
            } else {
                this.field139 /= 2;
            }
            this.field137 = this.field138 / 2 + this.field137 & 2047;
            this.field136 += this.field139 / 2;
            if (this.field136 < 128) {
                this.field136 = 128;
            }
            if (this.field136 > 383) {
                this.field136 = 383;
            }
            int var4 = this.field382 >> 7;
            int var5 = this.field383 >> 7;
            int var6 = this.method133(this.field382, this.field383, 899, this.field205);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field205;
                        if (var10 < 3 && (this.field255[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field539[var10][var8][var9];
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
            if (var12 > this.field503) {
                this.field503 += (var12 - this.field503) / 24;
            } else if (var12 < this.field503) {
                this.field503 += (var12 - this.field503) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field398.field1344 + "," + field398.field1345 + "," + this.field382 + "," + this.field383 + "," + this.field245 + "," + this.field246 + "," + this.field328 + "," + this.field329);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQQMJEFXK;B)Z")
    public final boolean method139(class44 arg0, byte arg1) {
        if (arg1 != 77) {
            this.method102();
        }
        if (arg0.field1241 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1241.length; ++var3) {
                int var4 = this.method131(arg0, -341, var3);
                int var5 = arg0.field1214[var3];
                if (arg0.field1241[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1241[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1241[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (this.field333 == null) {
            super.field778 = null;
            this.field314 = null;
            this.field312 = null;
            this.field311 = null;
            this.field313 = null;
            this.field464 = null;
            this.field465 = null;
            int var2 = 80 / arg0;
            this.field466 = null;
            this.field336 = new class17(3, 265, 128, this.method117(0));
            class72.method595(-102);
            this.field337 = new class17(3, 265, 128, this.method117(0));
            class72.method595(-102);
            this.field333 = new class17(3, 171, 509, this.method117(0));
            class72.method595(-102);
            this.field334 = new class17(3, 132, 360, this.method117(0));
            class72.method595(-102);
            this.field335 = new class17(3, 200, 360, this.method117(0));
            class72.method595(-102);
            this.field338 = new class17(3, 238, 202, this.method117(0));
            class72.method595(-102);
            this.field339 = new class17(3, 238, 203, this.method117(0));
            class72.method595(-102);
            this.field340 = new class17(3, 94, 74, this.method117(0));
            class72.method595(-102);
            this.field341 = new class17(3, 94, 75, this.method117(0));
            class72.method595(-102);
            if (this.field451 != null) {
                this.method152(false);
                this.method56((byte) 2);
            }
            this.field202 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
    public final void method141(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field553 >= 100) {
                this.method44(0, "", "Your ignore list is full. Max of 100 hit", (byte) 1);
            } else {
                String var4 = class19.method290(true, class19.method287(false, arg0));
                for (int var5 = 0; var5 < this.field553; ++var5) {
                    if (this.field249[var5] == arg0) {
                        this.method44(0, "", var4 + " is already on your ignore list", (byte) 1);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field235; ++var6) {
                    if (this.field210[var6] == arg0) {
                        this.method44(0, "", "Please remove " + var4 + " from your friend list first", (byte) 1);
                        return;
                    }
                }
                this.field163 += arg1;
                this.field249[this.field553++] = arg0;
                this.field178 = true;
                this.field483.method491(200, (byte) -80);
                this.field483.method498(0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field780 != null) {
                    return new URL("http://127.0.0.1:" + (field147 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field203.method428(false, arg2, arg0);
        this.field204.method428(false, arg2, arg0 + arg1 - 16);
        class72.method597(16, this.field321, arg1 - 32, arg2, this.field357, arg0 + 16);
        int var7 = (arg1 - 32) * arg1 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg5 / (arg3 - arg1);
        class72.method597(16, this.field547, var7, arg2, this.field357, arg0 + 16 + var8);
        class72.method602(var7, (byte) 1, this.field144, arg0 + 16 + var8, arg2);
        if (arg4 == 2) {
            class72.method602(var7, (byte) 1, this.field144, arg0 + 16 + var8, arg2 + 1);
            class72.method600(9916, arg0 + 16 + var8, this.field144, 16, arg2);
            class72.method600(9916, arg0 + 17 + var8, this.field144, 16, arg2);
            class72.method602(var7, (byte) 1, this.field561, arg0 + 16 + var8, arg2 + 15);
            class72.method602(var7 - 1, (byte) 1, this.field561, arg0 + 17 + var8, arg2 + 14);
            class72.method600(9916, arg0 + 15 + var8 + var7, this.field561, 16, arg2);
            class72.method600(9916, arg0 + 14 + var8 + var7, this.field561, 15, arg2 + 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method143(int arg0) {
        while (arg0 >= 0) {
            this.field483.method492(222);
        }
        if (this.field552 >= 2 || this.field190 != 0 || this.field564 != 0) {
            String var2;
            if (this.field190 == 1 && this.field552 < 2) {
                var2 = "Use " + this.field194 + " with...";
            } else if (this.field564 == 1 && this.field552 < 2) {
                var2 = this.field567 + "...";
            } else {
                var2 = this.field433[this.field552 - 1];
            }
            if (this.field552 > 2) {
                var2 = var2 + "@whi@ / " + (this.field552 - 2) + " more options";
            }
            this.field419.method21(4, (byte) 1, 15, true, field261 / 1000, var2, 16777215);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
    public final void method144(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field164 = -1;
        }
        if (!field149) {
            for (int var3 = 0; var3 < this.field243.length; ++var3) {
                int var4 = this.field243[var3];
                if (class11.field690[var4] >= arg1) {
                    class52 var5 = class11.field684[var4];
                    int var6 = var5.field1394 * var5.field1393 - 1;
                    int var7 = this.field174 * var5.field1393 * 2;
                    byte[] var8 = var5.field1391;
                    byte[] var9 = this.field431;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1391 = var9;
                    this.field431 = var8;
                    class11.method205(var4, 59);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)I")
    public final int method145(int arg0) {
        if (arg0 >= 0) {
            this.method102();
        }
        int var2 = 3;
        if (this.field530 < 310) {
            int var3 = this.field527 >> 7;
            int var4 = this.field529 >> 7;
            int var5 = field398.field1344 >> 7;
            int var6 = field398.field1345 >> 7;
            if ((this.field255[this.field205][var3][var4] & 4) != 0) {
                var2 = this.field205;
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
                    if ((this.field255[this.field205][var3][var4] & 4) != 0) {
                        var2 = this.field205;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field255[this.field205][var3][var4] & 4) != 0) {
                            var2 = this.field205;
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
                    if ((this.field255[this.field205][var3][var4] & 4) != 0) {
                        var2 = this.field205;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field255[this.field205][var3][var4] & 4) != 0) {
                            var2 = this.field205;
                        }
                    }
                }
            }
        }
        if ((this.field255[this.field205][field398.field1344 >> 7][field398.field1345 >> 7] & 4) != 0) {
            var2 = this.field205;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)I")
    public final int method146(boolean arg0) {
        int var2 = this.method133(this.field527, this.field529, 899, this.field205);
        if (arg0) {
            this.field543 = this.field152.method317();
        }
        return var2 - this.field528 < 800 && (this.field255[this.field205][this.field527 >> 7][this.field529 >> 7] & 4) != 0 ? this.field205 : 3;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
    public final void method147(int arg0, boolean arg1) {
        this.method140(560);
        this.field335.method245(this.field463);
        this.field188.method428(false, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field509 == 0) {
            int var5 = var4 / 2 + 80;
            this.field417.method13(this.field544.field870, true, var5, true, var3 / 2, 7711145);
            int var6 = var4 / 2 - 20;
            this.field419.method13("Welcome to RuneScape", true, var6, true, var3 / 2, 16776960);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field189.method428(false, var7 - 73, var8 - 20);
            this.field419.method13("New User", true, var8 + 5, true, var7, 16777215);
            int var9 = var3 / 2 + 80;
            this.field189.method428(false, var9 - 73, var8 - 20);
            this.field419.method13("Existing User", true, var8 + 5, true, var9, 16777215);
        }
        if (this.field509 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field460.length() > 0) {
                this.field419.method13(this.field460, true, var10 - 15, true, var3 / 2, 16776960);
                this.field419.method13(this.field461, true, var10, true, var3 / 2, 16776960);
                var10 += 30;
            } else {
                this.field419.method13(this.field461, true, var10 - 7, true, var3 / 2, 16776960);
                var10 += 30;
            }
            this.field419.method20((byte) 1, true, var10, 16777215, var3 / 2 - 90, "Username: " + this.field279 + (this.field360 == 0 & field261 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            this.field419.method20((byte) 1, true, var10, 16777215, var3 / 2 - 88, "Password: " + class19.method291(this.field280, (byte) 6) + (this.field360 == 1 & field261 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field189.method428(false, var11 - 73, var12 - 20);
                this.field419.method13("Login", true, var12 + 5, true, var11, 16777215);
                int var13 = var3 / 2 + 80;
                this.field189.method428(false, var13 - 73, var12 - 20);
                this.field419.method13("Cancel", true, var12 + 5, true, var13, 16777215);
            }
        }
        if (this.field509 == 3) {
            this.field419.method13("Create a free account", true, var4 / 2 - 60, true, var3 / 2, 16776960);
            int var14 = var4 / 2 - 35;
            this.field419.method13("To create a new account you need to", true, var14, true, var3 / 2, 16777215);
            int var18 = var14 + 15;
            this.field419.method13("go back to the main RuneScape webpage", true, var18, true, var3 / 2, 16777215);
            int var19 = var18 + 15;
            this.field419.method13("and choose the 'create account'", true, var19, true, var3 / 2, 16777215);
            int var20 = var19 + 15;
            this.field419.method13("button near the top of that page.", true, var20, true, var3 / 2, 16777215);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field189.method428(false, var15 - 73, var16 - 20);
            this.field419.method13("Cancel", true, var16 + 5, true, var15, 16777215);
        }
        this.field335.method246(171, super.field777, 202, 1);
        if (this.field517 == arg0) {
            if (this.field202) {
                this.field202 = false;
                this.field333.method246(0, super.field777, 128, 1);
                this.field334.method246(371, super.field777, 202, 1);
                this.field338.method246(265, super.field777, 0, 1);
                this.field339.method246(265, super.field777, 562, 1);
                this.field340.method246(171, super.field777, 128, 1);
                this.field341.method246(171, super.field777, 562, 1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method148(byte arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            String[] var4 = new String[100];
            int var5 = 0;
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field156 = 0;
                    if (arg0 != 8) {
                        return;
                    } else {
                        label51: for (int var9 = 0; var9 < class12.field703; ++var9) {
                            class12 var10 = class12.method218(var9);
                            if (var10.field702 == -1 && var10.field705 != null) {
                                String var11 = var10.field705.toLowerCase();
                                for (int var12 = 0; var12 < var5; ++var12) {
                                    if (var11.indexOf(var4[var12]) == -1) {
                                        continue label51;
                                    }
                                }
                                this.field157[this.field156] = var11;
                                this.field158[this.field156] = var9;
                                ++this.field156;
                                if (this.field156 >= this.field157.length) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
                String var7 = var3.substring(0, var6).trim();
                if (var7.length() > 0) {
                    var4[var5++] = var7.toLowerCase();
                }
                var3 = var3.substring(var6 + 1);
            }
        } else {
            this.field156 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILWNCFPLWV;Z)V")
    public final void method149(int arg0, class63 arg1, boolean arg2) {
        if (arg2) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg0 == 101) {
            int var5 = arg1.method520(-37135);
            int var6 = var5 >> 2;
            int var7 = var5 & 3;
            int var8 = this.field457[var6];
            int var9 = arg1.method502();
            int var10 = (var9 >> 4 & 7) + this.field206;
            int var11 = (var9 & 7) + this.field207;
            int var12 = arg1.method504();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                this.method39(-1, var10, var7, 0, var8, this.field205, 0, var6, var12, var11);
            }
        } else if (arg0 == 177) {
            int var13 = arg1.method502();
            int var14 = (var13 >> 4 & 7) + this.field206;
            int var15 = (var13 & 7) + this.field207;
            int var16 = arg1.method504();
            int var17 = arg1.method502();
            int var18 = arg1.method504();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                int var19 = var14 * 128 + 64;
                int var20 = var15 * 128 + 64;
                class47 var21 = new class47(this.field205, var20, var18, var16, field261, this.method133(var19, var20, 899, this.field205) - var17, var19, (byte) 1);
                this.field200.method482(var21);
            }
        } else if (arg0 == 79) {
            int var22 = arg1.method520(-37135);
            int var23 = (var22 >> 4 & 7) + this.field206;
            int var24 = (var22 & 7) + this.field207;
            int var25 = arg1.method529((byte) 6);
            int var26 = arg1.method531(4);
            int var27 = arg1.method530(255);
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && this.field472 != var25) {
                class16 var28 = new class16();
                var28.field801 = var27;
                var28.field800 = var26;
                if (this.field559[this.field205][var23][var24] == null) {
                    this.field559[this.field205][var23][var24] = new class61(field211);
                }
                this.field559[this.field205][var23][var24].method482(var28);
                this.method113(var23, var24);
            }
        } else {
            if (arg0 == 152) {
                int var29 = arg1.method522(0);
                int var30 = (var29 >> 4 & 7) + this.field206;
                int var31 = (var29 & 7) + this.field207;
                byte var32 = arg1.method523((byte) 115);
                int var33 = arg1.method530(255);
                byte var34 = arg1.method525(-17575);
                byte var35 = arg1.method523((byte) 115);
                int var36 = arg1.method522(0);
                int var37 = var36 >> 2;
                int var38 = var36 & 3;
                int var39 = this.field457[var37];
                int var40 = arg1.method531(4);
                byte var41 = arg1.method503();
                int var42 = arg1.method529((byte) 6);
                int var43 = arg1.method530(255);
                class65 var44;
                if (this.field472 == var42) {
                    var44 = field398;
                } else {
                    var44 = this.field283[var42];
                }
                if (var44 != null) {
                    class9 var45 = class9.method184(var40);
                    int var46 = this.field539[this.field205][var30][var31];
                    int var47 = this.field539[this.field205][var30 + 1][var31];
                    int var48 = this.field539[this.field205][var30 + 1][var31 + 1];
                    int var49 = this.field539[this.field205][var30][var31 + 1];
                    class56 var50 = var45.method190(var37, var38, var46, var47, var48, var49, -1);
                    if (var50 != null) {
                        this.method39(var33 + 1, var30, 0, 0, var39, this.field205, var43 + 1, 0, -1, var31);
                        var44.field1612 = field261 + var43;
                        var44.field1613 = field261 + var33;
                        var44.field1618 = var50;
                        int var51 = var45.field636;
                        int var52 = var45.field656;
                        if (var38 == 1 || var38 == 3) {
                            var51 = var45.field656;
                            var52 = var45.field636;
                        }
                        var44.field1615 = var30 * 128 + var51 * 64;
                        var44.field1617 = var31 * 128 + var52 * 64;
                        var44.field1616 = this.method133(var44.field1615, var44.field1617, 899, this.field205);
                        if (var41 > var34) {
                            byte var53 = var41;
                            var41 = var34;
                            var34 = var53;
                        }
                        if (var32 > var35) {
                            byte var54 = var32;
                            var32 = var35;
                            var35 = var54;
                        }
                        var44.field1621 = var30 + var41;
                        var44.field1623 = var30 + var34;
                        var44.field1622 = var31 + var32;
                        var44.field1624 = var31 + var35;
                    }
                }
            }
            if (arg0 == 185) {
                int var55 = arg1.method502();
                int var56 = (var55 >> 4 & 7) + this.field206;
                int var57 = (var55 & 7) + this.field207;
                int var58 = var56 + arg1.method503();
                int var59 = var57 + arg1.method503();
                int var60 = arg1.method505();
                int var61 = arg1.method504();
                int var62 = arg1.method502() * 4;
                int var63 = arg1.method502() * 4;
                int var64 = arg1.method504();
                int var65 = arg1.method504();
                int var66 = arg1.method502();
                int var67 = arg1.method502();
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104 && var61 != 65535) {
                    int var68 = var56 * 128 + 64;
                    int var69 = var57 * 128 + 64;
                    int var70 = var58 * 128 + 64;
                    int var71 = var59 * 128 + 64;
                    class64 var72 = new class64(this.field205, var63, var69, var67, var68, this.method133(var68, var69, 899, this.field205) - var62, var66, (byte) -30, field261 + var64, field261 + var65, var61, var60);
                    var72.method541(var71, var70, this.method133(var70, var71, 899, this.field205) - var63, (byte) 8, field261 + var64);
                    this.field141.method482(var72);
                }
            } else if (arg0 == 94) {
                int var73 = arg1.method531(4);
                int var74 = arg1.method529((byte) 6);
                int var75 = arg1.method522(0);
                int var76 = (var75 >> 4 & 7) + this.field206;
                int var77 = (var75 & 7) + this.field207;
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class16 var78 = new class16();
                    var78.field801 = var74;
                    var78.field800 = var73;
                    if (this.field559[this.field205][var76][var77] == null) {
                        this.field559[this.field205][var76][var77] = new class61(field211);
                    }
                    this.field559[this.field205][var76][var77].method482(var78);
                    this.method113(var76, var77);
                }
            } else if (arg0 == 115) {
                int var79 = arg1.method531(4);
                int var80 = arg1.method521(true);
                int var81 = (var80 >> 4 & 7) + this.field206;
                int var82 = (var80 & 7) + this.field207;
                int var83 = arg1.method520(-37135);
                int var84 = var83 >> 2;
                int var85 = var83 & 3;
                int var86 = this.field457[var84];
                if (var81 >= 0 && var82 >= 0 && var81 < 103 && var82 < 103) {
                    int var87 = this.field539[this.field205][var81][var82];
                    int var88 = this.field539[this.field205][var81 + 1][var82];
                    int var89 = this.field539[this.field205][var81 + 1][var82 + 1];
                    int var90 = this.field539[this.field205][var81][var82 + 1];
                    if (var86 == 0) {
                        class46 var91 = this.field452.method351(-39464, this.field205, var82, var81);
                        if (var91 != null) {
                            int var92 = var91.field1284 >> 14 & 32767;
                            if (var84 == 2) {
                                var91.field1282 = new class22(var89, var88, var90, false, true, var87, 2, var85 + 4, var92, var79);
                                var91.field1283 = new class22(var89, var88, var90, false, true, var87, 2, var85 + 1 & 3, var92, var79);
                            } else {
                                var91.field1282 = new class22(var89, var88, var90, false, true, var87, var84, var85, var92, var79);
                            }
                        }
                    }
                    if (var86 == 1) {
                        class14 var93 = this.field452.method352(var81, 0, var82, this.field205);
                        if (var93 != null) {
                            var93.field761 = new class22(var89, var88, var90, false, true, var87, 4, 0, var93.field762 >> 14 & 32767, var79);
                        }
                    }
                    if (var86 == 2) {
                        class1 var94 = this.field452.method353(var82, (byte) 124, var81, this.field205);
                        if (var84 == 11) {
                            var84 = 10;
                        }
                        if (var94 != null) {
                            var94.field5 = new class22(var89, var88, var90, false, true, var87, var84, var85, var94.field13 >> 14 & 32767, var79);
                        }
                    }
                    if (var86 == 3) {
                        class7 var95 = this.field452.method354(this.field326, var81, this.field205, var82);
                        if (var95 != null) {
                            var95.field603 = new class22(var89, var88, var90, false, true, var87, 22, var85, var95.field604 >> 14 & 32767, var79);
                        }
                    }
                }
            } else if (arg0 == 45) {
                int var96 = arg1.method531(4);
                int var97 = arg1.method521(true);
                int var98 = (var97 >> 4 & 7) + this.field206;
                int var99 = (var97 & 7) + this.field207;
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    class61 var100 = this.field559[this.field205][var98][var99];
                    if (var100 != null) {
                        for (class16 var101 = (class16) var100.method485(); var101 != null; var101 = (class16) var100.method487(6)) {
                            if ((var96 & 32767) == var101.field801) {
                                var101.method327();
                                break;
                            }
                        }
                        if (var100.method485() == null) {
                            this.field559[this.field205][var98][var99] = null;
                        }
                        this.method113(var98, var99);
                    }
                }
            } else if (arg0 == 57) {
                int var102 = arg1.method520(-37135);
                int var103 = var102 >> 2;
                int var104 = var102 & 3;
                int var105 = this.field457[var103];
                int var106 = arg1.method522(0);
                int var107 = (var106 >> 4 & 7) + this.field206;
                int var108 = (var106 & 7) + this.field207;
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    this.method39(-1, var107, var104, 0, var105, this.field205, 0, var103, -1, var108);
                }
            } else {
                if (arg0 == 227) {
                    int var109 = arg1.method502();
                    int var110 = (var109 >> 4 & 7) + this.field206;
                    int var111 = (var109 & 7) + this.field207;
                    int var112 = arg1.method504();
                    int var113 = arg1.method502();
                    int var114 = var113 >> 4 & 15;
                    int var115 = var113 & 7;
                    if (field398.field1324[0] >= var110 - var114 && field398.field1324[0] <= var110 + var114 && field398.field1325[0] >= var111 - var114 && field398.field1325[0] <= var111 + var114 && this.field305 && !field149 && this.field422 < 50) {
                        this.field359[this.field422] = var112;
                        this.field73[this.field422] = var115;
                        this.field441[this.field422] = class58.field1508[var112];
                        ++this.field422;
                    }
                }
                if (arg0 == 206) {
                    int var116 = arg1.method502();
                    int var117 = (var116 >> 4 & 7) + this.field206;
                    int var118 = (var116 & 7) + this.field207;
                    int var119 = arg1.method504();
                    int var120 = arg1.method504();
                    int var121 = arg1.method504();
                    if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                        class61 var122 = this.field559[this.field205][var117][var118];
                        if (var122 != null) {
                            for (class16 var123 = (class16) var122.method485(); var123 != null; var123 = (class16) var122.method487(6)) {
                                if ((var119 & 32767) == var123.field801 && var123.field800 == var120) {
                                    var123.field800 = var121;
                                    break;
                                }
                            }
                            this.method113(var117, var118);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method150(int arg0) {
        this.field163 += arg0;
        if (field149 && this.field551 == 2 && class68.field1693 != this.field205) {
            this.method50((byte) -95, "Loading - please wait.", (String) null);
            this.field551 = 1;
            this.field516 = System.currentTimeMillis();
        }
        if (this.field551 == 1) {
            int var2 = this.method151((byte) 4);
            if (var2 != 0 && System.currentTimeMillis() - this.field516 > 360000L) {
                signlink.reporterror(this.field279 + " glcfb " + this.field278 + "," + var2 + "," + field149 + "," + this.field306[0] + "," + this.field544.method297() + "," + this.field205 + "," + this.field245 + "," + this.field246);
                this.field516 = System.currentTimeMillis();
            }
        }
        if (this.field551 == 2 && this.field344 != this.field205) {
            this.field344 = this.field205;
            this.method74((byte) 25, this.field205);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)I")
    public final int method151(byte arg0) {
        for (int var2 = 0; var2 < this.field244.length; ++var2) {
            if (this.field244[var2] == null && this.field233[var2] != -1) {
                return -1;
            }
            if (this.field150[var2] == null && this.field234[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field244.length; ++var4) {
            byte[] var6 = this.field150[var4];
            if (var6 != null) {
                int var7 = (this.field232[var4] >> 8) * 64 - this.field328;
                int var8 = (this.field232[var4] & 255) * 64 - this.field329;
                if (this.field453) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class68.method571(var7, var6, var8, 302);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field421) {
            return -4;
        } else {
            this.field551 = 2;
            class68.field1693 = this.field205;
            this.method172(664);
            if (arg0 == 4) {
                boolean var5 = false;
            } else {
                this.field483.method492(212);
            }
            this.field483.method491(188, (byte) -80);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method152(boolean arg0) {
        byte[] var2 = this.field451.method414("title.dat", (byte[]) null);
        class66 var3 = new class66(var2, this);
        this.field336.method245(this.field463);
        var3.method548(6, 0, 0);
        this.field337.method245(this.field463);
        var3.method548(6, 0, -637);
        this.field333.method245(this.field463);
        var3.method548(6, 0, -128);
        this.field334.method245(this.field463);
        var3.method548(6, -371, -202);
        this.field335.method245(this.field463);
        var3.method548(6, -171, -202);
        this.field338.method245(this.field463);
        var3.method548(6, -265, 0);
        this.field339.method245(this.field463);
        var3.method548(6, -265, -562);
        this.field340.method245(this.field463);
        var3.method548(6, -171, -128);
        this.field341.method245(this.field463);
        var3.method548(6, -171, -562);
        int[] var4 = new int[var3.field1645];
        for (int var5 = 0; var5 < var3.field1646; ++var5) {
            for (int var10 = 0; var10 < var3.field1645; ++var10) {
                var4[var10] = var3.field1644[var3.field1645 * var5 + (var3.field1645 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1645; ++var11) {
                var3.field1644[var3.field1645 * var5 + var11] = var4[var11];
            }
        }
        this.field336.method245(this.field463);
        var3.method548(6, 0, 382);
        this.field337.method245(this.field463);
        var3.method548(6, 0, -255);
        this.field333.method245(this.field463);
        var3.method548(6, 0, 254);
        this.field334.method245(this.field463);
        if (arg0) {
            this.field164 = -1;
        }
        var3.method548(6, -371, 180);
        this.field335.method245(this.field463);
        var3.method548(6, -171, 180);
        this.field338.method245(this.field463);
        var3.method548(6, -265, 382);
        this.field339.method245(this.field463);
        var3.method548(6, -265, -180);
        this.field340.method245(this.field463);
        var3.method548(6, -171, 254);
        this.field341.method245(this.field463);
        var3.method548(6, -171, -180);
        class66 var6 = new class66(this.field451, "logo", 0);
        this.field333.method245(this.field463);
        var6.method550(false, 382 - var6.field1645 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class33.field960) {
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    private final void method153(int arg0) {
        class26 var2 = (class26) this.field300.method485();
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field917 == -1) {
                var2.field921 = 0;
                this.method120(var2, -46483);
            } else {
                var2.method327();
            }
            var2 = (class26) this.field300.method487(6);
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method154(int arg0) {
        int var2 = 10 / arg0;
        if (super.field791 == 1) {
            if (super.field792 >= 539 && super.field792 <= 573 && super.field793 >= 169 && super.field793 < 205 && this.field397[0] != -1) {
                this.field178 = true;
                this.field444 = 0;
                this.field184 = true;
            }
            if (super.field792 >= 569 && super.field792 <= 599 && super.field793 >= 168 && super.field793 < 205 && this.field397[1] != -1) {
                this.field178 = true;
                this.field444 = 1;
                this.field184 = true;
            }
            if (super.field792 >= 597 && super.field792 <= 627 && super.field793 >= 168 && super.field793 < 205 && this.field397[2] != -1) {
                this.field178 = true;
                this.field444 = 2;
                this.field184 = true;
            }
            if (super.field792 >= 625 && super.field792 <= 669 && super.field793 >= 168 && super.field793 < 203 && this.field397[3] != -1) {
                this.field178 = true;
                this.field444 = 3;
                this.field184 = true;
            }
            if (super.field792 >= 666 && super.field792 <= 696 && super.field793 >= 168 && super.field793 < 205 && this.field397[4] != -1) {
                this.field178 = true;
                this.field444 = 4;
                this.field184 = true;
            }
            if (super.field792 >= 694 && super.field792 <= 724 && super.field793 >= 168 && super.field793 < 205 && this.field397[5] != -1) {
                this.field178 = true;
                this.field444 = 5;
                this.field184 = true;
            }
            if (super.field792 >= 722 && super.field792 <= 756 && super.field793 >= 169 && super.field793 < 205 && this.field397[6] != -1) {
                this.field178 = true;
                this.field444 = 6;
                this.field184 = true;
            }
            if (super.field792 >= 540 && super.field792 <= 574 && super.field793 >= 466 && super.field793 < 502 && this.field397[7] != -1) {
                this.field178 = true;
                this.field444 = 7;
                this.field184 = true;
            }
            if (super.field792 >= 572 && super.field792 <= 602 && super.field793 >= 466 && super.field793 < 503 && this.field397[8] != -1) {
                this.field178 = true;
                this.field444 = 8;
                this.field184 = true;
            }
            if (super.field792 >= 599 && super.field792 <= 629 && super.field793 >= 466 && super.field793 < 503 && this.field397[9] != -1) {
                this.field178 = true;
                this.field444 = 9;
                this.field184 = true;
            }
            if (super.field792 >= 627 && super.field792 <= 671 && super.field793 >= 467 && super.field793 < 502 && this.field397[10] != -1) {
                this.field178 = true;
                this.field444 = 10;
                this.field184 = true;
            }
            if (super.field792 >= 669 && super.field792 <= 699 && super.field793 >= 466 && super.field793 < 503 && this.field397[11] != -1) {
                this.field178 = true;
                this.field444 = 11;
                this.field184 = true;
            }
            if (super.field792 >= 696 && super.field792 <= 726 && super.field793 >= 466 && super.field793 < 503 && this.field397[12] != -1) {
                this.field178 = true;
                this.field444 = 12;
                this.field184 = true;
            }
            if (super.field792 >= 724 && super.field792 <= 758 && super.field793 >= 466 && super.field793 < 502 && this.field397[13] != -1) {
                this.field178 = true;
                this.field444 = 13;
                this.field184 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LQQMJEFXK;B)Z")
    public final boolean method155(class44 arg0, byte arg1) {
        if (arg1 != 8) {
            this.field483.method492(151);
        }
        int var3 = arg0.field1228;
        if (this.field236 == 2) {
            if (var3 == 201) {
                this.field79 = true;
                this.field511 = 0;
                this.field160 = true;
                this.field92 = "";
                this.field303 = 1;
                this.field356 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field79 = true;
                this.field511 = 0;
                this.field160 = true;
                this.field92 = "";
                this.field303 = 2;
                this.field356 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field167 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field79 = true;
                this.field511 = 0;
                this.field160 = true;
                this.field92 = "";
                this.field303 = 4;
                this.field356 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field79 = true;
                this.field511 = 0;
                this.field160 = true;
                this.field92 = "";
                this.field303 = 5;
                this.field356 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field145[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class50.field1362 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class50.field1362) {
                                var6 = 0;
                            }
                        }
                        if (!class50.field1363[var6].field1369 && class50.field1363[var6].field1364 == var4 + (this.field537 ? 0 : 7)) {
                            this.field145[var4] = var6;
                            this.field247 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field319[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field277[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field277[var7].length) {
                        var9 = 0;
                    }
                }
                this.field319[var7] = var9;
                this.field247 = true;
            }
            if (var3 == 324 && !this.field537) {
                this.field537 = true;
                this.method121((byte) -26);
            }
            if (var3 == 325 && this.field537) {
                this.field537 = false;
                this.method121((byte) -26);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field248 = !this.field248;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method128(5);
                    if (this.field115.length() > 0) {
                        this.field483.method491(158, (byte) -80);
                        this.field483.method498(0, class19.method286(this.field115));
                        this.field483.method492(var3 - 601);
                        this.field483.method492(this.field248 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field483.method491(236, (byte) -80);
                this.field483.method492(this.field537 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field483.method492(this.field145[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field483.method492(this.field319[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method156(int arg0) {
        int var2 = this.field123 * 128 + 64;
        int var3 = this.field124 * 128 + 64;
        int var4 = this.method133(var2, var3, 899, this.field205) - this.field125;
        if (this.field527 < var2) {
            this.field527 += (var2 - this.field527) * this.field127 / 1000 + this.field126;
            if (this.field527 > var2) {
                this.field527 = var2;
            }
        }
        if (this.field527 > var2) {
            this.field527 -= (this.field527 - var2) * this.field127 / 1000 + this.field126;
            if (this.field527 < var2) {
                this.field527 = var2;
            }
        }
        if (this.field528 < var4) {
            this.field528 += (var4 - this.field528) * this.field127 / 1000 + this.field126;
            if (this.field528 > var4) {
                this.field528 = var4;
            }
        }
        if (this.field528 > var4) {
            this.field528 -= (this.field528 - var4) * this.field127 / 1000 + this.field126;
            if (this.field528 < var4) {
                this.field528 = var4;
            }
        }
        if (this.field529 < var3) {
            this.field529 += (var3 - this.field529) * this.field127 / 1000 + this.field126;
            if (this.field529 > var3) {
                this.field529 = var3;
            }
        }
        if (this.field529 > var3) {
            this.field529 -= (this.field529 - var3) * this.field127 / 1000 + this.field126;
            if (this.field529 < var3) {
                this.field529 = var3;
            }
        }
        int var5 = this.field87 * 128 + 64;
        int var6 = this.field88 * 128 + 64;
        int var7 = this.method133(var5, var6, 899, this.field205) - this.field89;
        int var8 = var5 - this.field527;
        int var9 = var7 - this.field528;
        int var10 = var6 - this.field529;
        int var11 = 52 / arg0;
        int var12 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var13 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 2047;
        int var14 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var13 < 128) {
            var13 = 128;
        }
        if (var13 > 383) {
            var13 = 383;
        }
        if (this.field530 < var13) {
            this.field530 += (var13 - this.field530) * this.field91 / 1000 + this.field90;
            if (this.field530 > var13) {
                this.field530 = var13;
            }
        }
        if (this.field530 > var13) {
            this.field530 -= (this.field530 - var13) * this.field91 / 1000 + this.field90;
            if (this.field530 < var13) {
                this.field530 = var13;
            }
        }
        int var15 = var14 - this.field531;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 > 0) {
            this.field531 += this.field91 * var15 / 1000 + this.field90;
            this.field531 &= 2047;
        }
        if (var15 < 0) {
            this.field531 -= -var15 * this.field91 / 1000 + this.field90;
            this.field531 &= 2047;
        }
        int var16 = var14 - this.field531;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            this.field531 = var14;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method157(int arg0) {
        if (arg0 != 7) {
            this.field559 = null;
        }
        if (!this.field86 && !this.field366 && !this.field515) {
            ++field102;
            if (!this.field175) {
                this.method147(9, false);
            } else {
                this.method165(true);
            }
            this.field513 = 0;
        } else {
            this.method93(this.field241);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (arg0 != -18) {
            field428 = this.field152.method317();
        }
        for (int var2 = 0; var2 < this.field488; ++var2) {
            int var3 = this.field489[var2];
            class55 var4 = this.field487[var3];
            if (var4 != null) {
                this.method159(29067, var4, var4.field1422.field29);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILRODHPQMW;I)V")
    public final void method159(int arg0, class48 arg1, int arg2) {
        if (arg1.field1344 < 128 || arg1.field1345 < 128 || arg1.field1344 >= 13184 || arg1.field1345 >= 13184) {
            arg1.field1311 = -1;
            arg1.field1319 = -1;
            arg1.field1308 = 0;
            arg1.field1309 = 0;
            arg1.field1344 = arg1.field1324[0] * 128 + arg1.field1326 * 64;
            arg1.field1345 = arg1.field1325[0] * 128 + arg1.field1326 * 64;
            arg1.method409(37498);
        }
        if (field398 == arg1 && (arg1.field1344 < 1536 || arg1.field1345 < 1536 || arg1.field1344 >= 11776 || arg1.field1345 >= 11776)) {
            arg1.field1311 = -1;
            arg1.field1319 = -1;
            arg1.field1308 = 0;
            arg1.field1309 = 0;
            arg1.field1344 = arg1.field1324[0] * 128 + arg1.field1326 * 64;
            arg1.field1345 = arg1.field1325[0] * 128 + arg1.field1326 * 64;
            arg1.method409(37498);
        }
        if (arg1.field1308 > field261) {
            this.method160((byte) 54, arg1);
        } else if (arg1.field1309 >= field261) {
            this.method161(false, arg1);
        } else {
            this.method162((byte) 102, arg1);
        }
        this.method163(3562, arg1);
        if (arg0 != 29067) {
            this.field164 = -1;
        }
        this.method164(arg1, false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLRODHPQMW;)V")
    public final void method160(byte arg0, class48 arg1) {
        int var3 = arg1.field1308 - field261;
        if (arg0 == 54) {
            int var4 = arg1.field1326 * 64 + arg1.field1304 * 128;
            int var5 = arg1.field1326 * 64 + arg1.field1306 * 128;
            arg1.field1344 += (var4 - arg1.field1344) / var3;
            arg1.field1345 += (var5 - arg1.field1345) / var3;
            arg1.field1333 = 0;
            if (arg1.field1310 == 0) {
                arg1.field1347 = 1024;
            }
            if (arg1.field1310 == 1) {
                arg1.field1347 = 1536;
            }
            if (arg1.field1310 == 2) {
                arg1.field1347 = 0;
            }
            if (arg1.field1310 == 3) {
                arg1.field1347 = 512;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLRODHPQMW;)V")
    public final void method161(boolean arg0, class48 arg1) {
        if (field261 == arg1.field1309 || arg1.field1311 == -1 || arg1.field1314 != 0 || arg1.field1313 + 1 > class41.field1147[arg1.field1311].method390(arg1.field1312, (byte) -99)) {
            int var3 = arg1.field1309 - arg1.field1308;
            int var4 = field261 - arg1.field1308;
            int var5 = arg1.field1326 * 64 + arg1.field1304 * 128;
            int var6 = arg1.field1326 * 64 + arg1.field1306 * 128;
            int var7 = arg1.field1326 * 64 + arg1.field1305 * 128;
            int var8 = arg1.field1326 * 64 + arg1.field1307 * 128;
            arg1.field1344 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1345 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1333 = 0;
        if (arg1.field1310 == 0) {
            arg1.field1347 = 1024;
        }
        if (arg1.field1310 == 1) {
            arg1.field1347 = 1536;
        }
        if (arg1.field1310 == 2) {
            arg1.field1347 = 0;
        }
        if (arg1.field1310 == 3) {
            arg1.field1347 = 512;
        }
        arg1.field1346 = arg1.field1347;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BLRODHPQMW;)V")
    public final void method162(byte arg0, class48 arg1) {
        arg1.field1348 = arg1.field1298;
        if (arg1.field1329 == 0) {
            arg1.field1333 = 0;
        } else {
            if (arg1.field1311 != -1 && arg1.field1314 == 0) {
                class41 var3 = class41.field1147[arg1.field1311];
                if (arg1.field1343 > 0 && var3.field1159 == 0) {
                    ++arg1.field1333;
                    return;
                }
                if (arg1.field1343 <= 0 && var3.field1160 == 0) {
                    ++arg1.field1333;
                    return;
                }
            }
            int var4 = arg1.field1344;
            int var5 = arg1.field1345;
            int var6 = arg1.field1324[arg1.field1329 - 1] * 128 + arg1.field1326 * 64;
            int var7 = arg1.field1325[arg1.field1329 - 1] * 128 + arg1.field1326 * 64;
            if (arg0 != 102) {
                this.field101 = this.field152.method317();
            }
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1347 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1347 = 1792;
                    } else {
                        arg1.field1347 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1347 = 768;
                    } else if (var5 > var7) {
                        arg1.field1347 = 256;
                    } else {
                        arg1.field1347 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1347 = 1024;
                } else {
                    arg1.field1347 = 0;
                }
                int var8 = arg1.field1347 - arg1.field1346 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1335;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1334;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1337;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1336;
                }
                if (var9 == -1) {
                    var9 = arg1.field1334;
                }
                arg1.field1348 = var9;
                int var10 = 4;
                if (arg1.field1347 != arg1.field1346 && arg1.field1339 == -1 && arg1.field1318 != 0) {
                    var10 = 2;
                }
                if (arg1.field1329 > 2) {
                    var10 = 6;
                }
                if (arg1.field1329 > 3) {
                    var10 = 8;
                }
                if (arg1.field1333 > 0 && arg1.field1329 > 1) {
                    var10 = 8;
                    --arg1.field1333;
                }
                if (arg1.field1327[arg1.field1329 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1348 == arg1.field1334 && arg1.field1303 != -1) {
                    arg1.field1348 = arg1.field1303;
                }
                if (var4 < var6) {
                    arg1.field1344 += var10;
                    if (arg1.field1344 > var6) {
                        arg1.field1344 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1344 -= var10;
                    if (arg1.field1344 < var6) {
                        arg1.field1344 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1345 += var10;
                    if (arg1.field1345 > var7) {
                        arg1.field1345 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1345 -= var10;
                    if (arg1.field1345 < var7) {
                        arg1.field1345 = var7;
                    }
                }
                if (arg1.field1344 == var6 && arg1.field1345 == var7) {
                    --arg1.field1329;
                    if (arg1.field1343 > 0) {
                        --arg1.field1343;
                        return;
                    }
                }
            } else {
                arg1.field1344 = var6;
                arg1.field1345 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILRODHPQMW;)V")
    public final void method163(int arg0, class48 arg1) {
        if (arg0 != 3562) {
            this.field164 = this.field119.method502();
        }
        if (arg1.field1318 != 0) {
            if (arg1.field1339 != -1 && arg1.field1339 < 32768) {
                class55 var3 = this.field487[arg1.field1339];
                if (var3 != null) {
                    int var4 = arg1.field1344 - var3.field1344;
                    int var5 = arg1.field1345 - var3.field1345;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1347 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1339 >= 32768) {
                int var6 = arg1.field1339 - 32768;
                if (this.field472 == var6) {
                    var6 = this.field282;
                }
                class65 var7 = this.field283[var6];
                if (var7 != null) {
                    int var8 = arg1.field1344 - var7.field1344;
                    int var9 = arg1.field1345 - var7.field1345;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1347 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1316 != 0 || arg1.field1317 != 0) && (arg1.field1329 == 0 || arg1.field1333 > 0)) {
                int var10 = arg1.field1344 - (arg1.field1316 - this.field328 - this.field328) * 64;
                int var11 = arg1.field1345 - (arg1.field1317 - this.field329 - this.field329) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1347 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1316 = 0;
                arg1.field1317 = 0;
            }
            int var12 = arg1.field1347 - arg1.field1346 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1318 && var12 <= 2048 - arg1.field1318) {
                    if (var12 > 1024) {
                        arg1.field1346 -= arg1.field1318;
                    } else {
                        arg1.field1346 += arg1.field1318;
                    }
                } else {
                    arg1.field1346 = arg1.field1347;
                }
                arg1.field1346 &= 2047;
                if (arg1.field1348 == arg1.field1298 && arg1.field1347 != arg1.field1346) {
                    if (arg1.field1299 != -1) {
                        arg1.field1348 = arg1.field1299;
                        return;
                    }
                    arg1.field1348 = arg1.field1334;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LRODHPQMW;Z)V")
    public final void method164(class48 arg0, boolean arg1) {
        if (arg1) {
            this.field164 = this.field119.method502();
        }
        arg0.field1302 = false;
        if (arg0.field1348 != -1) {
            class41 var3 = class41.field1147[arg0.field1348];
            ++arg0.field1350;
            if (arg0.field1349 < var3.field1148 && arg0.field1350 > var3.method390(arg0.field1349, (byte) -99)) {
                arg0.field1350 = 1;
                ++arg0.field1349;
            }
            if (arg0.field1349 >= var3.field1148) {
                arg0.field1350 = 1;
                arg0.field1349 = 0;
            }
        }
        if (arg0.field1319 != -1 && field261 >= arg0.field1322) {
            if (arg0.field1320 < 0) {
                arg0.field1320 = 0;
            }
            class41 var4 = class54.field1407[arg0.field1319].field1411;
            ++arg0.field1321;
            if (arg0.field1320 < var4.field1148 && arg0.field1321 > var4.method390(arg0.field1320, (byte) -99)) {
                arg0.field1321 = 1;
                ++arg0.field1320;
            }
            if (arg0.field1320 >= var4.field1148 && (arg0.field1320 < 0 || arg0.field1320 >= var4.field1148)) {
                arg0.field1319 = -1;
            }
        }
        if (arg0.field1311 != -1 && arg0.field1314 <= 1) {
            class41 var5 = class41.field1147[arg0.field1311];
            if (var5.field1159 == 1 && arg0.field1343 > 0 && arg0.field1308 <= field261 && arg0.field1309 < field261) {
                arg0.field1314 = 1;
                return;
            }
        }
        if (arg0.field1311 != -1 && arg0.field1314 == 0) {
            class41 var6 = class41.field1147[arg0.field1311];
            ++arg0.field1313;
            if (arg0.field1312 < var6.field1148 && arg0.field1313 > var6.method390(arg0.field1312, (byte) -99)) {
                arg0.field1313 = 1;
                ++arg0.field1312;
            }
            if (arg0.field1312 >= var6.field1148) {
                arg0.field1312 -= var6.field1152;
                ++arg0.field1315;
                if (arg0.field1315 >= var6.field1158) {
                    arg0.field1311 = -1;
                }
                if (arg0.field1312 < 0 || arg0.field1312 >= var6.field1148) {
                    arg0.field1311 = -1;
                }
            }
            arg0.field1302 = var6.field1154;
        }
        if (arg0.field1314 > 0) {
            --arg0.field1314;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method165(boolean arg0) {
        if (!arg0) {
            this.field559 = null;
        }
        if (this.field449 == -1 || this.field551 != 2 && super.field778 == null) {
            if (this.field202) {
                this.method170(9);
                this.field202 = false;
                this.field407.method246(4, super.field777, 0, 1);
                this.field408.method246(357, super.field777, 0, 1);
                this.field409.method246(4, super.field777, 722, 1);
                this.field410.method246(205, super.field777, 743, 1);
                this.field411.method246(0, super.field777, 0, 1);
                this.field412.method246(4, super.field777, 516, 1);
                this.field413.method246(205, super.field777, 516, 1);
                this.field414.method246(357, super.field777, 496, 1);
                this.field415.method246(338, super.field777, 0, 1);
                this.field178 = true;
                this.field79 = true;
                this.field184 = true;
                this.field355 = true;
                if (this.field551 != 2) {
                    this.field313.method246(4, super.field777, 4, 1);
                    this.field312.method246(4, super.field777, 550, 1);
                }
            }
            if (this.field551 == 2) {
                this.method134(this.field218);
            }
            if (this.field481 && this.field476 == 1) {
                this.field178 = true;
            }
            if (this.field263 != -1) {
                boolean var4 = this.method57(this.field263, false, this.field174);
                if (var4) {
                    this.field178 = true;
                }
            }
            if (this.field131 == 2) {
                this.field178 = true;
            }
            if (this.field404 == 2) {
                this.field178 = true;
            }
            if (this.field178) {
                this.method94(true);
                this.field178 = false;
            }
            if (this.field116 == -1 && this.field511 == 0) {
                this.field82.field1259 = this.field187 - this.field142 - 77;
                if (super.field785 > 448 && super.field785 < 560 && super.field786 > 332) {
                    this.method104(0, this.field82, 77, super.field786 - 357, 0, super.field785 - 17, -1, this.field187, 463);
                }
                int var5 = this.field187 - 77 - this.field82.field1259;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field187 - 77) {
                    var5 = this.field187 - 77;
                }
                if (this.field142 != var5) {
                    this.field142 = var5;
                    this.field79 = true;
                }
            }
            if (this.field116 == -1 && this.field511 == 3) {
                int var6 = this.field156 * 14 + 7;
                this.field82.field1259 = this.field159;
                if (super.field785 > 448 && super.field785 < 560 && super.field786 > 332) {
                    this.method104(0, this.field82, 77, super.field786 - 357, 0, super.field785 - 17, -1, var6, 463);
                }
                int var7 = this.field82.field1259;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field159 != var7) {
                    this.field159 = var7;
                    this.field79 = true;
                }
            }
            if (this.field116 != -1) {
                boolean var8 = this.method57(this.field116, false, this.field174);
                if (var8) {
                    this.field79 = true;
                }
            }
            if (this.field131 == 3) {
                this.field79 = true;
            }
            if (this.field404 == 3) {
                this.field79 = true;
            }
            if (this.field380 != null) {
                this.field79 = true;
            }
            if (this.field481 && this.field476 == 2) {
                this.field79 = true;
            }
            if (this.field79) {
                this.method166(true);
                this.field79 = false;
            }
            if (this.field551 == 2) {
                this.method108(-18786);
                this.field312.method246(4, super.field777, 550, 1);
                ++field568;
                if (field568 > 71) {
                    field568 = 0;
                    this.field483.method491(252, (byte) -80);
                }
            }
            if (this.field113 != -1) {
                this.field184 = true;
            }
            if (this.field184) {
                if (this.field113 != -1 && this.field444 == this.field113) {
                    this.field113 = -1;
                    this.field483.method491(202, (byte) -80);
                    this.field483.method492(this.field444);
                }
                this.field184 = false;
                this.field466.method245(this.field463);
                this.field376.method428(false, 0, 0);
                if (this.field263 == -1) {
                    if (this.field397[this.field444] != -1) {
                        if (this.field444 == 0) {
                            this.field434.method428(false, 22, 10);
                        }
                        if (this.field444 == 1) {
                            this.field435.method428(false, 54, 8);
                        }
                        if (this.field444 == 2) {
                            this.field435.method428(false, 82, 8);
                        }
                        if (this.field444 == 3) {
                            this.field436.method428(false, 110, 8);
                        }
                        if (this.field444 == 4) {
                            this.field438.method428(false, 153, 8);
                        }
                        if (this.field444 == 5) {
                            this.field438.method428(false, 181, 8);
                        }
                        if (this.field444 == 6) {
                            this.field437.method428(false, 209, 9);
                        }
                    }
                    if (this.field397[0] != -1 && (this.field113 != 0 || field261 % 20 < 10)) {
                        this.field332[0].method428(false, 29, 13);
                    }
                    if (this.field397[1] != -1 && (this.field113 != 1 || field261 % 20 < 10)) {
                        this.field332[1].method428(false, 53, 11);
                    }
                    if (this.field397[2] != -1 && (this.field113 != 2 || field261 % 20 < 10)) {
                        this.field332[2].method428(false, 82, 11);
                    }
                    if (this.field397[3] != -1 && (this.field113 != 3 || field261 % 20 < 10)) {
                        this.field332[3].method428(false, 115, 12);
                    }
                    if (this.field397[4] != -1 && (this.field113 != 4 || field261 % 20 < 10)) {
                        this.field332[4].method428(false, 153, 13);
                    }
                    if (this.field397[5] != -1 && (this.field113 != 5 || field261 % 20 < 10)) {
                        this.field332[5].method428(false, 180, 11);
                    }
                    if (this.field397[6] != -1 && (this.field113 != 6 || field261 % 20 < 10)) {
                        this.field332[6].method428(false, 208, 13);
                    }
                }
                this.field466.method246(160, super.field777, 516, 1);
                this.field465.method245(this.field463);
                this.field375.method428(false, 0, 0);
                if (this.field263 == -1) {
                    if (this.field397[this.field444] != -1) {
                        if (this.field444 == 7) {
                            this.field195.method428(false, 42, 0);
                        }
                        if (this.field444 == 8) {
                            this.field196.method428(false, 74, 0);
                        }
                        if (this.field444 == 9) {
                            this.field196.method428(false, 102, 0);
                        }
                        if (this.field444 == 10) {
                            this.field197.method428(false, 130, 1);
                        }
                        if (this.field444 == 11) {
                            this.field199.method428(false, 173, 0);
                        }
                        if (this.field444 == 12) {
                            this.field199.method428(false, 201, 0);
                        }
                        if (this.field444 == 13) {
                            this.field198.method428(false, 229, 0);
                        }
                    }
                    if (this.field397[8] != -1 && (this.field113 != 8 || field261 % 20 < 10)) {
                        this.field332[7].method428(false, 74, 2);
                    }
                    if (this.field397[9] != -1 && (this.field113 != 9 || field261 % 20 < 10)) {
                        this.field332[8].method428(false, 102, 3);
                    }
                    if (this.field397[10] != -1 && (this.field113 != 10 || field261 % 20 < 10)) {
                        this.field332[9].method428(false, 137, 4);
                    }
                    if (this.field397[11] != -1 && (this.field113 != 11 || field261 % 20 < 10)) {
                        this.field332[10].method428(false, 174, 2);
                    }
                    if (this.field397[12] != -1 && (this.field113 != 12 || field261 % 20 < 10)) {
                        this.field332[11].method428(false, 201, 2);
                    }
                    if (this.field397[13] != -1 && (this.field113 != 13 || field261 % 20 < 10)) {
                        this.field332[12].method428(false, 226, 2);
                    }
                }
                this.field465.method246(466, super.field777, 496, 1);
                this.field313.method245(this.field463);
                class11.field682 = this.field229;
            }
            if (this.field355) {
                this.field355 = false;
                this.field464.method245(this.field463);
                this.field374.method428(false, 0, 0);
                this.field418.method13("Public chat", true, 28, true, 55, 16777215);
                if (this.field368 == 0) {
                    this.field418.method13("On", true, 41, true, 55, 65280);
                }
                if (this.field368 == 1) {
                    this.field418.method13("Friends", true, 41, true, 55, 16776960);
                }
                if (this.field368 == 2) {
                    this.field418.method13("Off", true, 41, true, 55, 16711680);
                }
                if (this.field368 == 3) {
                    this.field418.method13("Hide", true, 41, true, 55, 65535);
                }
                this.field418.method13("Private chat", true, 28, true, 184, 16777215);
                if (this.field301 == 0) {
                    this.field418.method13("On", true, 41, true, 184, 65280);
                }
                if (this.field301 == 1) {
                    this.field418.method13("Friends", true, 41, true, 184, 16776960);
                }
                if (this.field301 == 2) {
                    this.field418.method13("Off", true, 41, true, 184, 16711680);
                }
                this.field418.method13("Trade/compete", true, 28, true, 324, 16777215);
                if (this.field112 == 0) {
                    this.field418.method13("On", true, 41, true, 324, 65280);
                }
                if (this.field112 == 1) {
                    this.field418.method13("Friends", true, 41, true, 324, 16776960);
                }
                if (this.field112 == 2) {
                    this.field418.method13("Off", true, 41, true, 324, 16711680);
                }
                this.field418.method13("Report abuse", true, 33, true, 458, 16777215);
                this.field464.method246(453, super.field777, 0, 1);
                this.field313.method245(this.field463);
                class11.field682 = this.field229;
            }
            this.field174 = 0;
        } else {
            if (this.field551 == 2) {
                this.method57(this.field449, false, this.field174);
                if (this.field348 != -1) {
                    this.method57(this.field348, false, this.field174);
                }
                this.field174 = 0;
                this.method60(this.field569);
                super.field778.method245(this.field463);
                class11.field682 = this.field230;
                class72.method595(-102);
                this.field202 = true;
                class44 var2 = class44.method397(this.field449);
                if (var2.field1256 == 512 && var2.field1260 == 334 && var2.field1263 == 0) {
                    var2.field1256 = 765;
                    var2.field1260 = 503;
                }
                this.method40((byte) 66, 0, var2, 0, 0);
                if (this.field348 != -1) {
                    class44 var3 = class44.method397(this.field348);
                    if (var3.field1256 == 512 && var3.field1260 == 334 && var3.field1263 == 0) {
                        var3.field1256 = 765;
                        var3.field1260 = 503;
                    }
                    this.method40((byte) 66, 0, var3, 0, 0);
                }
                if (!this.field481) {
                    this.method79(0);
                    this.method143(-213);
                } else {
                    this.method173((byte) 114);
                }
            }
            super.field778.method246(0, super.field777, 0, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method166(boolean arg0) {
        this.field314.method245(this.field463);
        class11.field682 = this.field227;
        this.field507.method428(false, 0, 0);
        if (this.field160) {
            this.field419.method12(40, this.field356, 239, 0, 0);
            this.field419.method12(60, this.field92 + "*", 239, 128, 0);
        } else if (this.field511 == 1) {
            this.field419.method12(40, "Enter amount:", 239, 0, 0);
            this.field419.method12(60, this.field550 + "*", 239, 128, 0);
        } else if (this.field511 == 2) {
            this.field419.method12(40, "Enter name:", 239, 0, 0);
            this.field419.method12(60, this.field550 + "*", 239, 128, 0);
        } else if (this.field511 == 3) {
            if (this.field550 != this.field155) {
                this.method148((byte) 8, this.field550);
                this.field155 = this.field550;
            }
            class4 var2 = this.field418;
            class72.method594(7, 77, 0, 463, 0);
            for (int var3 = 0; var3 < this.field156; ++var3) {
                int var4 = var3 * 14 + 18 - this.field159;
                if (var4 > 0 && var4 < 110) {
                    var2.method12(var4, this.field157[var3], 239, 0, 0);
                }
            }
            class72.method593(-38001);
            if (this.field156 > 5) {
                this.method142(0, 77, 463, this.field156 * 14 + 7, 2, this.field159);
            }
            if (this.field550.length() == 0) {
                this.field419.method12(40, "Enter object name", 239, 255, 0);
            } else if (this.field156 == 0) {
                this.field419.method12(40, "No matching objects found, please shorten search", 239, 0, 0);
            }
            var2.method12(90, this.field550 + "*", 239, 0, 0);
            class72.method600(9916, 77, 0, 479, 0);
        } else if (this.field380 != null) {
            this.field419.method12(40, this.field380, 239, 0, 0);
            this.field419.method12(60, "Click to continue", 239, 128, 0);
        } else if (this.field116 != -1) {
            this.method40((byte) 66, 0, class44.method397(this.field116), 0, 0);
        } else if (this.field448 != -1) {
            this.method40((byte) 66, 0, class44.method397(this.field448), 0, 0);
        } else {
            class4 var5 = this.field418;
            int var6 = 0;
            class72.method594(7, 77, 0, 463, 0);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field364[var7] != null) {
                    int var9 = this.field362[var7];
                    int var10 = 70 - var6 * 14 + this.field142;
                    String var11 = this.field363[var7];
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
                            var5.method16(4, 0, this.field364[var7], var10, this.field381);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field368 == 0 || this.field368 == 1 && this.method29(var11, (byte) 5))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field208[0].method428(false, var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field208[1].method428(false, var13, var10 - 12);
                                var13 += 14;
                            }
                            var5.method16(var13, 0, var11 + ":", var10, this.field381);
                            int var14 = var13 + var5.method14(this.field512, var11) + 8;
                            var5.method16(var14, 255, this.field364[var7], var10, this.field381);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field183 == 0 && (var9 == 7 || this.field301 == 0 || this.field301 == 1 && this.method29(var11, (byte) 5))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method16(var15, 0, "From", var10, this.field381);
                            int var16 = var15 + var5.method14(this.field512, "From ");
                            if (var12 == 1) {
                                this.field208[0].method428(false, var16, var10 - 12);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field208[1].method428(false, var16, var10 - 12);
                                var16 += 14;
                            }
                            var5.method16(var16, 0, var11 + ":", var10, this.field381);
                            int var17 = var16 + var5.method14(this.field512, var11) + 8;
                            var5.method16(var17, 8388608, this.field364[var7], var10, this.field381);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field112 == 0 || this.field112 == 1 && this.method29(var11, (byte) 5))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method16(4, 8388736, var11 + " " + this.field364[var7], var10, this.field381);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field183 == 0 && this.field301 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method16(4, 8388608, this.field364[var7], var10, this.field381);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field183 == 0 && this.field301 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method16(4, 0, "To " + var11 + ":", var10, this.field381);
                            var5.method16(12 + var5.method14(this.field512, "To " + var11), 8388608, this.field364[var7], var10, this.field381);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field112 == 0 || this.field112 == 1 && this.method29(var11, (byte) 5))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method16(4, 8270336, var11 + " " + this.field364[var7], var10, this.field381);
                        }
                        ++var6;
                    }
                }
            }
            class72.method593(-38001);
            this.field187 = var6 * 14 + 7;
            if (this.field187 < 78) {
                this.field187 = 78;
            }
            this.method142(0, 77, 463, this.field187, 2, this.field187 - this.field142 - 77);
            String var8;
            if (field398 != null && field398.field1628 != null) {
                var8 = field398.field1628;
            } else {
                var8 = class19.method290(true, this.field279);
            }
            var5.method16(4, 0, var8 + ":", 90, this.field381);
            var5.method16(6 + var5.method14(this.field512, var8 + ": "), 255, this.field535 + "*", 90, this.field381);
            class72.method600(9916, 77, 0, 479, 0);
        }
        if (this.field481 && this.field476 == 2) {
            this.method173((byte) 114);
        }
        this.field314.method246(357, super.field777, 17, 1);
        this.field313.method245(this.field463);
        class11.field682 = this.field229;
        if (!arg0) {
            field94 = !field94;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method167(int arg0, long arg1) {
        if (arg0 != 2) {
            this.field471 = !this.field471;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field235; ++var4) {
                if (this.field210[var4] == arg1) {
                    --this.field235;
                    this.field178 = true;
                    for (int var5 = var4; var5 < this.field235; ++var5) {
                        this.field442[var5] = this.field442[var5 + 1];
                        this.field469[var5] = this.field469[var5 + 1];
                        this.field210[var5] = this.field210[var5 + 1];
                    }
                    this.field483.method491(241, (byte) -80);
                    this.field483.method498(0, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method168(int arg0) {
        this.field283 = null;
        this.field285 = null;
        this.field287 = null;
        this.field288 = null;
        this.field96 = null;
        this.field374 = null;
        this.field375 = null;
        this.field376 = null;
        if (this.field93 != null) {
            this.field93.field897 = false;
        }
        this.field93 = null;
        this.field487 = null;
        this.field489 = null;
        this.field423 = null;
        this.field562 = null;
        this.field222 = null;
        this.field223 = null;
        this.field332 = null;
        this.field464 = null;
        this.field465 = null;
        this.field466 = null;
        this.field407 = null;
        this.field408 = null;
        this.field409 = null;
        this.field410 = null;
        this.field195 = null;
        this.field196 = null;
        this.field197 = null;
        this.field198 = null;
        this.field199 = null;
        this.field291 = null;
        this.field272 = null;
        this.field273 = null;
        this.field274 = null;
        this.field275 = null;
        this.field276 = null;
        this.field559 = null;
        this.field300 = null;
        this.field454 = null;
        this.field399 = null;
        this.field143 = null;
        this.field85 = null;
        this.field370 = null;
        this.field377 = null;
        this.field534 = null;
        this.field338 = null;
        this.field339 = null;
        this.field340 = null;
        this.field341 = null;
        if (this.field544 != null) {
            this.field544.method308();
        }
        this.field544 = null;
        this.field483 = null;
        this.field558 = null;
        this.field119 = null;
        this.field523 = null;
        this.field524 = null;
        this.field525 = null;
        this.field526 = null;
        this.field433 = null;
        this.field486 = null;
        this.field434 = null;
        this.field435 = null;
        this.field436 = null;
        this.field437 = null;
        if (arg0 <= 0) {
            this.field463 = !this.field463;
        }
        this.field438 = null;
        this.field431 = null;
        this.field411 = null;
        this.field412 = null;
        this.field413 = null;
        this.field414 = null;
        this.field415 = null;
        this.field293 = null;
        this.field294 = null;
        this.field307 = null;
        this.field311 = null;
        this.field312 = null;
        this.field313 = null;
        this.field314 = null;
        this.field545 = null;
        this.field539 = null;
        this.field255 = null;
        this.field452 = null;
        this.field468 = null;
        this.field505 = null;
        this.field506 = null;
        this.field507 = null;
        this.method81(false);
        try {
            if (this.field484 != null) {
                this.field484.method474();
            }
        } catch (Exception var2) {
        }
        this.field484 = null;
        this.field226 = null;
        this.field510 = null;
        this.field232 = null;
        this.field244 = null;
        this.field150 = null;
        this.field233 = null;
        this.field234 = null;
        this.field262 = null;
        this.field442 = null;
        this.field210 = null;
        this.field469 = null;
        this.field141 = null;
        this.field200 = null;
        this.field336 = null;
        this.field337 = null;
        this.field333 = null;
        this.field334 = null;
        this.field335 = null;
        this.method46(17);
        class9.method187(0);
        class2.method3(0);
        class12.method216(0);
        class44.method404(0);
        class37.field1040 = null;
        class50.field1363 = null;
        class70.field1712 = null;
        class41.field1147 = null;
        class54.field1407 = null;
        class54.field1419 = null;
        class51.field1372 = null;
        super.field778 = null;
        class65.field1610 = null;
        class11.method198(0);
        class35.method328(0);
        class56.method438(0);
        class6.method176(0);
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
    public final int method169(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        return arg0 != 66 ? 2 : ((arg2 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg2 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (this.field314 == null) {
            this.method46(17);
            super.field778 = null;
            this.field333 = null;
            this.field334 = null;
            this.field335 = null;
            this.field336 = null;
            this.field337 = null;
            this.field338 = null;
            this.field339 = null;
            this.field340 = null;
            this.field341 = null;
            this.field314 = new class17(3, 96, 479, this.method117(0));
            this.field312 = new class17(3, 156, 172, this.method117(0));
            class72.method595(-102);
            this.field506.method428(false, 0, 0);
            this.field311 = new class17(3, 261, 190, this.method117(0));
            this.field313 = new class17(3, 334, 512, this.method117(0));
            class72.method595(-102);
            if (arg0 < 9 || arg0 > 9) {
                field482 = this.field152.method317();
            }
            this.field464 = new class17(3, 50, 496, this.method117(0));
            this.field465 = new class17(3, 37, 269, this.method117(0));
            this.field466 = new class17(3, 45, 249, this.method117(0));
            this.field202 = true;
            this.field313.method245(this.field463);
            class11.field682 = this.field229;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field452.method355(arg2, arg4, arg5);
        if (arg1 < 0) {
            if (var7 != 0) {
                int var8 = this.field452.method359(arg2, arg4, arg5, var7);
                int var9 = var8 >> 6 & 3;
                int var10 = var8 & 31;
                int var11 = arg3;
                if (var7 > 0) {
                    var11 = arg0;
                }
                int[] var12 = this.field291.field1644;
                int var13 = (103 - arg5) * 512 * 4 + arg4 * 4 + 24624;
                int var14 = var7 >> 14 & 32767;
                class9 var15 = class9.method184(var14);
                if (var15.field661 != -1) {
                    class52 var16 = this.field226[var15.field661];
                    if (var16 != null) {
                        int var17 = (var15.field636 * 4 - var16.field1393) / 2;
                        int var18 = (var15.field656 * 4 - var16.field1394) / 2;
                        var16.method428(false, arg4 * 4 + 48 + var17, (104 - arg5 - var15.field656) * 4 + 48 + var18);
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
            int var19 = this.field452.method357(arg2, arg4, arg5);
            if (var19 != 0) {
                int var20 = this.field452.method359(arg2, arg4, arg5, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                class9 var24 = class9.method184(var23);
                if (var24.field661 != -1) {
                    class52 var25 = this.field226[var24.field661];
                    if (var25 != null) {
                        int var26 = (var24.field636 * 4 - var25.field1393) / 2;
                        int var27 = (var24.field656 * 4 - var25.field1394) / 2;
                        var25.method428(false, arg4 * 4 + 48 + var26, (104 - arg5 - var24.field656) * 4 + 48 + var27);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field291.field1644;
                    int var30 = (103 - arg5) * 512 * 4 + arg4 * 4 + 24624;
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
            int var31 = this.field452.method358(arg2, arg4, arg5);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                class9 var33 = class9.method184(var32);
                if (var33.field661 != -1) {
                    class52 var34 = this.field226[var33.field661];
                    if (var34 != null) {
                        int var35 = (var33.field636 * 4 - var34.field1393) / 2;
                        int var36 = (var33.field656 * 4 - var34.field1394) / 2;
                        var34.method428(false, arg4 * 4 + 48 + var35, (104 - arg5 - var33.field656) * 4 + 48 + var36);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 373);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field146 = Integer.parseInt(arg0[0]);
                field147 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method75((byte) 0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method64(-23613);
                }
                if (arg0[3].equals("free")) {
                    field148 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field148 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method240(-12006, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method172(int arg0) {
        try {
            this.field344 = -1;
            this.field200.method489();
            this.field141.method489();
            class11.method201(0);
            this.method125(0);
            this.field452.method329(-54);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field468[var2].method228();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field255[var3][var4][var5] = 0;
                    }
                }
            }
            class68 var6 = new class68(104, this.field539, 104, -706, this.field255);
            int var7 = this.field244.length;
            this.field483.method491(186, (byte) -80);
            if (!this.field453) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field232[var8] >> 8) * 64 - this.field328;
                    int var10 = (this.field232[var8] & 255) * 64 - this.field329;
                    byte[] var11 = this.field244[var8];
                    if (var11 != null) {
                        var6.method574(var10, (byte) 54, (this.field245 - 6) * 8, var11, (this.field246 - 6) * 8, var9, this.field468);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field232[var12] >> 8) * 64 - this.field328;
                    int var14 = (this.field232[var12] & 255) * 64 - this.field329;
                    byte[] var15 = this.field244[var12];
                    if (var15 == null && this.field246 < 800) {
                        var6.method562(false, var13, 64, var14, 64);
                    }
                }
                this.field483.method491(186, (byte) -80);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field150[var16];
                    if (var17 != null) {
                        int var18 = (this.field232[var16] >> 8) * 64 - this.field328;
                        int var19 = (this.field232[var16] & 255) * 64 - this.field329;
                        var6.method570(this.field468, var17, (byte) 6, var18, var19, this.field452);
                    }
                }
            }
            if (this.field453) {
                int var20 = 0;
                label256: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field485[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method562(false, var31 * 8, 8, var32 * 8, 8);
                                }
                            }
                        }
                        this.field483.method491(186, (byte) -80);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label256;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field485[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field232.length; ++var43) {
                                            if (this.field232[var43] == var42 && this.field150[var43] != null) {
                                                var6.method561(var35 * 8, (var41 & 7) * 8, (var40 & 7) * 8, this.field150[var43], var39, 867, var34, this.field452, var38, var36 * 8, this.field468);
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
                            int var24 = this.field485[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field232.length; ++var30) {
                                    if (this.field232[var30] == var29 && this.field244[var30] != null) {
                                        var6.method576(true, (var28 & 7) * 8, var20, var22 * 8, this.field244[var30], (var27 & 7) * 8, this.field468, var21 * 8, var26, var25);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method566(var20, var21 * 8, -130, var22 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field483.method491(186, (byte) -80);
            var6.method567(this.field214, this.field452, this.field468);
            if (this.field313 != null) {
                this.field313.method245(this.field463);
                class11.field682 = this.field229;
            }
            this.field483.method491(186, (byte) -80);
            int var44 = class68.field1680;
            if (var44 > this.field205) {
                var44 = this.field205;
            }
            if (var44 < this.field205 - 1) {
                int var45 = this.field205 - 1;
            }
            if (field149) {
                this.field452.method330(class68.field1680, 2);
            } else {
                this.field452.method330(0, 2);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method113(var46, var47);
                }
            }
            this.method153(-58);
        } catch (Exception var60) {
        }
        class9.field657.method181();
        if (super.field780 != null) {
            this.field483.method491(94, (byte) -80);
            this.field483.method496(1057001181);
        }
        if (field149 && signlink.cache_dat != null) {
            int var49 = this.field544.method293(0, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field544.method295(var50, -32251);
                if ((var51 & 121) == 0) {
                    class56.method441((byte) 109, var50);
                }
            }
        }
        System.gc();
        class11.method202(20, (byte) 6);
        this.field544.method310(this.field499);
        if (arg0 <= 0) {
            this.field217 = 350;
        }
        int var52 = (this.field245 - 6) / 8 - 1;
        int var53 = (this.field245 + 6) / 8 + 1;
        int var54 = (this.field246 - 6) / 8 - 1;
        int var55 = (this.field246 + 6) / 8 + 1;
        if (this.field447) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field544.method298(-45861, var56, 0, var57);
                    if (var58 != -1) {
                        this.field544.method296(3, var58, 407);
                    }
                    int var59 = this.field544.method298(-45861, var56, 1, var57);
                    if (var59 != -1) {
                        this.field544.method296(3, var59, 407);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method173(byte arg0) {
        int var2 = this.field477;
        int var3 = this.field478;
        int var4 = this.field479;
        int var5 = this.field480;
        int var6 = 6116423;
        class72.method597(var4, var6, var5, var2, this.field357, var3);
        class72.method597(var4 - 2, 0, 16, var2 + 1, this.field357, var3 + 1);
        class72.method598(var5 - 19, var4 - 2, true, 0, var3 + 18, var2 + 1);
        this.field419.method16(var2 + 3, var6, "Choose Option", var3 + 14, this.field381);
        int var7 = super.field785;
        int var8 = super.field786;
        if (this.field476 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field476 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field476 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field552; ++var9) {
            int var11 = (this.field552 - 1 - var9) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var11 - 13 && var8 < var11 + 3) {
                var12 = 16776960;
            }
            this.field419.method20((byte) 1, true, var11, var12, var2 + 3, this.field433[var9]);
        }
        if (arg0 != 114) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field114[var1] = var0 - 1;
            var0 += var0;
        }
        field122 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field146 = 10;
        field148 = true;
        field181 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field181[var3] = var2 / 4;
        }
        field211 = -126;
        field277 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field298 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field378 = -45;
        field428 = 576;
        field456 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field482 = -420;
        field490 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
