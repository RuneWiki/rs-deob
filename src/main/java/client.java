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
public class client extends class47 {

    @OriginalMember(owner = "client!client", name = "L", descriptor = "B")
    private byte field91 = -27;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "LTQYMAXSO;")
    private class53 field92 = class53.method456(1, (byte) 1);

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field93 = -782;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
    private boolean field95 = false;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "[LVCTXURSE;")
    private class59[] field97 = new class59[100];

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
    private boolean field98 = false;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    private int field99 = -1;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
    private int[] field102 = new int[50];

    @OriginalMember(owner = "client!client", name = "X", descriptor = "LTQYMAXSO;")
    private class53 field103 = class53.method456(1, (byte) 1);

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    private int field106 = 12272;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    private int field108 = -1;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
    private boolean field109 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    private int field110 = 1;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    private int field111 = -1;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
    private final int[] field112 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    private boolean field113 = true;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
    private String field114 = "";

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
    private int[] field115 = new int[5];

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[LTPUDHOHI;")
    private class52[] field118 = new class52[32];

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "[[I")
    private int[][] field123 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "LTQYMAXSO;")
    private class53 field125 = new class53(new byte[5000], -631);

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[LGYKYBIID;")
    private class15[] field126 = new class15[16384];

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
    public int[] field128 = new int[16384];

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field129 = -1;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    private int field130 = -1;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "[I")
    private int[] field131 = new int[200];

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "[LTPUDHOHI;")
    private class52[] field132 = new class52[1000];

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    private int field133 = -1;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Ljava/lang/String;")
    private String field134 = "";

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Ljava/lang/String;")
    private String field135 = "";

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
    private int[] field136 = new int[151];

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "[[[LCRZPTUPR;")
    private class7[][][] field137 = new class7[4][104][104];

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
    private int field139 = 1;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field140 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "Z")
    private boolean field142 = true;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field144 = -1;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field146 = -10523;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "Z")
    private boolean field150 = false;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "[LVCTXURSE;")
    private class59[] field162 = new class59[2];

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
    private boolean field168 = false;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
    private int field169 = 4;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
    private boolean field170 = false;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field172 = 2;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
    private boolean field176 = true;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field177 = -1;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
    private int[] field178 = new int[4000];

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "[I")
    private int[] field179 = new int[4000];

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
    private int[] field180 = new int[5];

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
    private int[] field182 = new int[5];

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "B")
    private byte field183 = -27;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "Z")
    private boolean field184 = false;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private int field186 = -1;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
    private int field189 = -1;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "LOMJBPTVL;")
    private class37 field190 = new class37();

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "B")
    private byte field191 = 0;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field195 = 373;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "B")
    private byte field200 = 0;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "B")
    private byte field201 = -50;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private int field203 = 2301979;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
    private int[] field208 = new int[151];

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
    private int[] field209 = new int[256];

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private int field210 = 78;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "[[I")
    private int[][] field214 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field216 = 2;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field222 = 50;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
    private int[] field223 = new int[this.field222];

    @OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
    private int[] field224 = new int[this.field222];

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
    private int[] field225 = new int[this.field222];

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
    private int[] field226 = new int[this.field222];

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
    private int[] field227 = new int[this.field222];

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
    private int[] field228 = new int[this.field222];

    @OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
    private int[] field229 = new int[this.field222];

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "[Ljava/lang/String;")
    private String[] field230 = new String[this.field222];

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
    private boolean field231 = false;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "LCRZPTUPR;")
    private class7 field234 = new class7((byte) 1);

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "[J")
    private long[] field241 = new long[200];

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "[[[I")
    private int[][][] field246 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "Z")
    private boolean field251 = false;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field257 = 2;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "B")
    private byte field263 = 7;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "[LTPUDHOHI;")
    private class52[] field264 = new class52[32];

    @OriginalMember(owner = "client!client", name = "de", descriptor = "B")
    private byte field265 = -34;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
    private boolean field267 = false;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
    private boolean field270 = false;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
    private int[] field273 = new int[class10.field642];

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field277 = 1;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "[Ljava/lang/String;")
    private String[] field285 = new String[5];

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "[Z")
    private boolean[] field286 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field287 = -313;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
    private boolean field288 = false;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "Z")
    private boolean field293 = false;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private int field294 = 128;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private int field299 = 2;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "B")
    private byte field300 = 0;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "Z")
    private boolean field301 = false;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field302 = 21413;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "[LTPUDHOHI;")
    private class52[] field303 = new class52[8];

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field307 = 4;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "B")
    private byte field311 = 9;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "[I")
    public int[] field313 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "[J")
    private long[] field319 = new long[100];

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "[I")
    private int[] field321 = new int[5];

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LTQYMAXSO;")
    private class53 field327 = class53.method456(1, (byte) 1);

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "B")
    private byte field338 = 0;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "Ljava/lang/String;")
    private String field339 = "";

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "B")
    private byte field340 = 19;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "Z")
    public boolean field344 = false;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
    private volatile boolean field353 = false;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "[LTPUDHOHI;")
    private class52[] field355 = new class52[32];

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "Z")
    public boolean field356 = true;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
    private int[] field357 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field358 = 4;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field359 = 5063219;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
    private int[] field361 = new int[class10.field642];

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field366 = 502;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field369 = -1;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "Ljava/lang/String;")
    private String field371 = "";

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "[Z")
    private boolean[] field384 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
    public int[] field385 = new int[2000];

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "Z")
    private boolean field387 = false;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
    private int[] field388 = new int[9];

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "[Ljava/lang/String;")
    private String[] field389 = new String[200];

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "LCRZPTUPR;")
    private class7 field391 = new class7((byte) 1);

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
    private int[] field392 = new int[100];

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "[Ljava/lang/String;")
    private String[] field393 = new String[100];

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Ljava/lang/String;")
    private String[] field394 = new String[100];

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "Z")
    private boolean field395 = false;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
    private int[] field402 = new int[33];

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field404 = 3;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field408 = -1;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "[Ljava/lang/String;")
    private String[] field409 = new String[500];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
    private boolean field410 = true;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field413 = 680;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private int field415 = 2048;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
    private int field416 = 2047;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "[LDEHYKQII;")
    private class8[] field417 = new class8[this.field415];

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
    public int[] field419 = new int[this.field415];

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
    private int[] field421 = new int[this.field415];

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "[LTQYMAXSO;")
    private class53[] field422 = new class53[this.field415];

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field423 = -931;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
    private boolean field424 = false;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "[[I")
    private int[][] field430 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "Ljava/lang/String;")
    private String field438 = "";

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private final int field446 = 100;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
    private int[] field447 = new int[100];

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "Ljava/lang/String;")
    private String field448 = "";

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "Ljava/lang/String;")
    private String field449 = "";

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "Z")
    private boolean field451 = false;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
    private int[] field452 = new int[33];

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "Z")
    private boolean field453 = false;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field454 = 7759444;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
    private int[] field462 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
    private int[] field463 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "[B")
    private byte[] field464 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
    private boolean field465 = true;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "[LUEKAQTXH;")
    public class56[] field467 = new class56[5];

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
    private int[] field468 = new int[class10.field642];

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
    private int field471 = -1;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field482 = -1;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
    private boolean field483 = false;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private int field484 = -1;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "[I")
    private int[] field485 = new int[7];

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "B")
    private byte field490 = 123;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field496 = 4;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
    private boolean field497 = false;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "Z")
    private boolean field498 = true;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
    private boolean field499 = false;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
    private int[] field500 = new int[50];

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "Ljava/lang/String;")
    private String field501 = "";

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "[Ljava/lang/String;")
    private String[] field503 = new String[100];

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
    private int[] field504 = new int[100];

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "Z")
    private boolean field506 = false;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "[LTPUDHOHI;")
    private class52[] field508 = new class52[20];

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
    private int[] field517 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "Z")
    private boolean field518 = true;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
    private boolean field521 = false;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "B")
    private byte field522 = -118;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "[LUDXVXGJJ;")
    private class55[] field533 = new class55[4];

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "Ljava/lang/String;")
    private String field534 = "";

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "[I")
    private int[] field535 = new int[500];

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
    private int[] field536 = new int[500];

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "[I")
    private int[] field537 = new int[500];

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
    private int[] field538 = new int[500];

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
    private int field541 = 7320;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private int field544 = -31502;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
    private int[] field545 = new int[50];

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field548 = 1;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
    private int[] field549 = new int[5];

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "Z")
    private volatile boolean field550 = false;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "Z")
    private boolean field561 = false;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "[I")
    private int[] field566 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "[LVCTXURSE;")
    private class59[] field567 = new class59[13];

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
    public int[] field569 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    private int field571 = 373;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field577 = -1;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field579 = 42179;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "Z")
    private boolean field585 = false;

    @OriginalMember(owner = "client!client", name = "pk", descriptor = "Z")
    private boolean field588 = true;

    @OriginalMember(owner = "client!client", name = "qk", descriptor = "[LTPUDHOHI;")
    private class52[] field589 = new class52[100];

    @OriginalMember(owner = "client!client", name = "rk", descriptor = "I")
    private int field590 = 3353893;

    @OriginalMember(owner = "client!client", name = "sk", descriptor = "Z")
    private volatile boolean field591 = false;

    @OriginalMember(owner = "client!client", name = "uk", descriptor = "LCRZPTUPR;")
    private class7 field593 = new class7((byte) 1);

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
    private static int[] field232 = new int[99];

    @OriginalMember(owner = "client!client", name = "je", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field271;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private static int field272;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "[[I")
    public static final int[][] field274;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "[I")
    public static int[] field306;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private static int field345;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field346;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "B")
    private static byte field412;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private static int field481;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private static int field491;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
    private static boolean field493;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private static int field552;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
    public static final int[] field563;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "Ljava/lang/String;")
    private static String field570;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private static int field122;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private static int field124;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private static int field187;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private static int field205;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
    private static int field220;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private static int field235;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private static int field255;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private static int field308;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private static int field309;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private static int field341;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private static int field351;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private static int field370;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private static int field378;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private static int field398;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private static int field414;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private static int field476;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private static int field516;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private static int field546;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    private int field572;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private static int field578;

    @OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!client", name = "ok", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!client", name = "vk", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "J")
    private long field173;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "J")
    public long field266;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "J")
    private long field268;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "J")
    private long field343;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "J")
    private long field94;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "LHJOZCGZH;")
    private class16 field194;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "LLBXRBQZX;")
    private class29 field107;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "LMPMWDRAA;")
    private class32 field509;

    @OriginalMember(owner = "client!client", name = "tk", descriptor = "LMRWOUQJV;")
    private class33 field592;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "LSXKKBWPU;")
    private class50 field435;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "LTPUDHOHI;")
    private class52 field253;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "LTPUDHOHI;")
    private class52 field254;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "LTPUDHOHI;")
    private class52 field322;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "LTPUDHOHI;")
    private class52 field323;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "LTPUDHOHI;")
    private class52 field324;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "LTPUDHOHI;")
    private class52 field325;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "LTPUDHOHI;")
    private class52 field326;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "LTPUDHOHI;")
    private class52 field350;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "LTPUDHOHI;")
    private class52 field390;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "LTPUDHOHI;")
    private class52 field400;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "LTPUDHOHI;")
    private class52 field401;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "LTPUDHOHI;")
    private class52 field436;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "LTPUDHOHI;")
    private class52 field507;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "LTPUDHOHI;")
    private class52 field539;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "LTPUDHOHI;")
    private class52 field540;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "LVCTXURSE;")
    private class59 field104;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "LVCTXURSE;")
    private class59 field105;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "LVCTXURSE;")
    private class59 field217;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "LVCTXURSE;")
    private class59 field218;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "LVCTXURSE;")
    private class59 field219;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "LVCTXURSE;")
    private class59 field239;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "LVCTXURSE;")
    private class59 field240;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "LVCTXURSE;")
    private class59 field362;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "LVCTXURSE;")
    private class59 field363;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "LVCTXURSE;")
    private class59 field364;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "LVCTXURSE;")
    private class59 field528;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "LVCTXURSE;")
    private class59 field529;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "LVCTXURSE;")
    private class59 field530;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "LVCTXURSE;")
    private class59 field531;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "LVCTXURSE;")
    private class59 field532;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "LVCTXURSE;")
    private class59 field580;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "LVCTXURSE;")
    private class59 field581;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "LVCTXURSE;")
    private class59 field582;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "LVCTXURSE;")
    private class59 field583;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "LVCTXURSE;")
    private class59 field584;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "LVFZXUVTW;")
    private class60 field151;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "LVFZXUVTW;")
    private class60 field152;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "LVFZXUVTW;")
    private class60 field153;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "LVFZXUVTW;")
    private class60 field154;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "LVFZXUVTW;")
    private class60 field155;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "LVFZXUVTW;")
    private class60 field156;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "LVFZXUVTW;")
    private class60 field157;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "LVFZXUVTW;")
    private class60 field158;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "LVFZXUVTW;")
    private class60 field159;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "LVFZXUVTW;")
    private class60 field316;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "LVFZXUVTW;")
    private class60 field317;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "LVFZXUVTW;")
    private class60 field318;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LVFZXUVTW;")
    private class60 field328;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "LVFZXUVTW;")
    private class60 field329;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "LVFZXUVTW;")
    private class60 field330;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "LVFZXUVTW;")
    private class60 field331;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "LVFZXUVTW;")
    private class60 field332;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "LVFZXUVTW;")
    private class60 field333;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "LVFZXUVTW;")
    private class60 field334;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "LVFZXUVTW;")
    private class60 field335;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "LVFZXUVTW;")
    private class60 field336;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "LVFZXUVTW;")
    private class60 field524;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "LVFZXUVTW;")
    private class60 field525;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "LVFZXUVTW;")
    private class60 field526;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "LVFZXUVTW;")
    private class60 field527;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "LXSRHTFUZ;")
    public class65 field450;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "LZGPIKWUW;")
    private class71 field163;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "LZGPIKWUW;")
    private class71 field164;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "LZGPIKWUW;")
    private class71 field165;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "LZGPIKWUW;")
    private class71 field166;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "LDEHYKQII;")
    public static class8 field304;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "Ljava/lang/String;")
    private String field320;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "Ljava/lang/String;")
    public String field429;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "Ljava/lang/String;")
    public String field434;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Ljava/lang/String;")
    private String field96;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Ljava/net/Socket;")
    private Socket field120;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
    public static boolean field238;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "Z")
    public static boolean field360;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
    private static boolean field405;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "Z")
    private static boolean field494;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
    private int[] field198;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
    private int[] field199;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
    private int[] field247;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
    private int[] field248;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
    private int[] field249;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "[I")
    private int[] field289;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
    private int[] field290;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
    private int[] field456;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
    private int[] field457;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "[I")
    private int[] field458;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
    private int[] field459;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
    private int[] field486;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
    private int[] field487;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
    private int[] field488;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
    private int[] field489;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "[LVCTXURSE;")
    private class59[] field242;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "[[B")
    private byte[][] field167;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "[[B")
    private byte[][] field562;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "[[[B")
    private byte[][][] field352;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "[[[I")
    private int[][][] field278;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method29(boolean arg0) {
        short var2 = 256;
        if (this.field586 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field586 > 768) {
                    this.field486[var3] = this.method52(this.field488[var3], this.field487[var3], 1024 - this.field586, false);
                } else if (this.field586 > 256) {
                    this.field486[var3] = this.field488[var3];
                } else {
                    this.field486[var3] = this.method52(this.field487[var3], this.field488[var3], 256 - this.field586, false);
                }
            }
        } else if (this.field587 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field587 > 768) {
                    this.field486[var4] = this.method52(this.field489[var4], this.field487[var4], 1024 - this.field587, false);
                } else if (this.field587 > 256) {
                    this.field486[var4] = this.field489[var4];
                } else {
                    this.field486[var4] = this.method52(this.field487[var4], this.field489[var4], 256 - this.field587, false);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field486[var5] = this.field487[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field154.field1533[var6] = this.field400.field1431[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field209[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field198[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field486[var26];
                    int var30 = this.field154.field1533[var8];
                    this.field154.field1533[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field154.method542(7, 0, 0, super.field1338);
        if (arg0) {
            this.field588 = !this.field588;
        }
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field155.field1533[var10] = this.field401.field1431[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field209[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field198[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field486[var18];
                    int var22 = this.field155.field1533[var16];
                    this.field155.field1533[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field155.method542(7, 0, 637, super.field1338);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LTQYMAXSO;II)V")
    private final void method30(class53 arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            this.field541 = this.field592.method335();
        }
        for (int var4 = 0; var4 < this.field420; ++var4) {
            int var5 = this.field421[var4];
            class15 var6 = this.field126[var5];
            int var7 = arg0.method468();
            if ((var7 & 4) != 0) {
                var6.field781 = arg0.method497(this.field188);
                var6.field782 = arg0.method497(this.field188);
            }
            if ((var7 & 128) != 0) {
                var6.field818 = arg0.method496((byte) 7);
                int var8 = arg0.method502((byte) 87);
                var6.field822 = var8 >> 16;
                var6.field821 = (var8 & 65535) + field291;
                var6.field819 = 0;
                var6.field820 = 0;
                if (var6.field821 > field291) {
                    var6.field819 = -1;
                }
                if (var6.field818 == 65535) {
                    var6.field818 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                int var9 = arg0.method498(this.field340);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method468();
                if (var6.field813 == var9 && var9 != -1) {
                    int var11 = class30.field982[var9].field996;
                    if (var11 == 1) {
                        var6.field814 = 0;
                        var6.field815 = 0;
                        var6.field816 = var10;
                        var6.field817 = 0;
                    }
                    if (var11 == 2) {
                        var6.field817 = 0;
                    }
                } else if (var9 == -1 || var6.field813 == -1 || class30.field982[var9].field990 >= class30.field982[var6.field813].field990) {
                    var6.field813 = var9;
                    var6.field814 = 0;
                    var6.field815 = 0;
                    var6.field816 = var10;
                    var6.field817 = 0;
                    var6.field799 = var6.field812;
                }
            }
            if ((var7 & 32) != 0) {
                var6.field800 = arg0.method497(this.field188);
                if (var6.field800 == 65535) {
                    var6.field800 = -1;
                }
            }
            if ((var7 & 8) != 0) {
                var6.field802 = arg0.method475();
                var6.field778 = 100;
            }
            if ((var7 & 16) != 0) {
                var6.field709 = class66.method563(arg0.method470());
                var6.field833 = var6.field709.field1616;
                var6.field803 = var6.field709.field1631;
                var6.field823 = var6.field709.field1643;
                var6.field824 = var6.field709.field1623;
                var6.field825 = var6.field709.field1652;
                var6.field826 = var6.field709.field1635;
                var6.field788 = var6.field709.field1618;
            }
            if ((var7 & 64) != 0) {
                int var12 = arg0.method487((byte) 0);
                int var13 = arg0.method468();
                var6.method229(var12, field291, 155, var13);
                var6.field804 = field291 + 300;
                var6.field805 = arg0.method468();
                var6.field806 = arg0.method489(-33025);
            }
            if ((var7 & 2) != 0) {
                int var14 = arg0.method489(-33025);
                int var15 = arg0.method489(-33025);
                var6.method229(var14, field291, 155, var15);
                var6.field804 = field291 + 300;
                var6.field805 = arg0.method487((byte) 0);
                var6.field806 = arg0.method488(-33544);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LDEHYKQII;IZII)V")
    public final void method31(class8 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (field304 != arg0) {
            if (this.field455 < 400) {
                if (arg2) {
                    this.field259 = this.field327.method468();
                }
                String var6;
                if (arg0.field602 == 0) {
                    var6 = arg0.field615 + method99(arg0.field607, field304.field607, -27024) + " (level-" + arg0.field607 + ")";
                } else {
                    var6 = arg0.field615 + " (skill-" + arg0.field602 + ")";
                }
                if (this.field425 == 1) {
                    this.field409[this.field455] = "Use " + this.field429 + " with @whi@" + var6;
                    this.field537[this.field455] = 493;
                    this.field538[this.field455] = arg1;
                    this.field535[this.field455] = arg3;
                    this.field536[this.field455] = arg4;
                    ++this.field455;
                } else if (this.field431 == 1) {
                    if ((this.field433 & 8) == 8) {
                        this.field409[this.field455] = this.field434 + " @whi@" + var6;
                        this.field537[this.field455] = 452;
                        this.field538[this.field455] = arg1;
                        this.field535[this.field455] = arg3;
                        this.field536[this.field455] = arg4;
                        ++this.field455;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field285[var7] != null) {
                            this.field409[this.field455] = this.field285[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field285[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field607 > field304.field607) {
                                    var9 = 2000;
                                }
                                if (field304.field600 != 0 && arg0.field600 != 0) {
                                    if (field304.field600 == arg0.field600) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field286[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field537[this.field455] = var9 + 753;
                            }
                            if (var7 == 1) {
                                this.field537[this.field455] = var9 + 148;
                            }
                            if (var7 == 2) {
                                this.field537[this.field455] = var9 + 914;
                            }
                            if (var7 == 3) {
                                this.field537[this.field455] = var9 + 772;
                            }
                            if (var7 == 4) {
                                this.field537[this.field455] = var9 + 963;
                            }
                            this.field538[this.field455] = arg1;
                            this.field535[this.field455] = arg3;
                            this.field536[this.field455] = arg4;
                            ++this.field455;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field455; ++var8) {
                    if (this.field537[var8] == 134) {
                        this.field409[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field491 = Integer.parseInt(this.getParameter("nodeid"));
        field492 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method134(216);
        } else {
            method118(field345);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field493 = false;
        } else {
            field493 = true;
        }
        this.method415(765, 503, (byte) 9);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method32(int arg0) {
        if (arg0 != 0) {
            this.field259 = this.field327.method468();
        }
        int var2 = 5;
        this.field388[8] = 0;
        int var3 = 0;
        while (this.field388[8] == 0) {
            String var4 = "Unknown problem";
            this.method61(20, (byte) -127, "Connecting to web server");
            try {
                DataInputStream var5 = this.method172("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 363);
                class53 var6 = new class53(new byte[40], -631);
                var5.readFully(var6.field1456, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field388[var7] = var6.method473();
                }
                int var8 = var6.method473();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field388[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field388[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field388[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field388[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field388[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field388[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method61(10, (byte) -127, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method61(10, (byte) -127, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field521 = !this.field521;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method33(int arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        this.field258 += arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Z")
    public final boolean method34(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (this.field107 == null) {
            return false;
        } else {
            try {
                int var2 = this.field107.method275();
                if (var2 == 0) {
                    return false;
                }
                if (this.field259 == -1) {
                    this.field107.method276(this.field327.field1456, 0, 1);
                    this.field259 = this.field327.field1456[0] & 255;
                    if (this.field592 != null) {
                        this.field259 = this.field259 - this.field592.method335() & 255;
                    }
                    this.field258 = class64.field1607[this.field259];
                    --var2;
                }
                if (this.field258 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field107.method276(this.field327.field1456, 0, 1);
                    this.field258 = this.field327.field1456[0] & 255;
                    --var2;
                }
                if (this.field258 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field107.method276(this.field327.field1456, 0, 2);
                    this.field327.field1457 = 0;
                    this.field258 = this.field327.method470();
                    var2 -= 2;
                }
                if (var2 < this.field258) {
                    return false;
                }
                this.field327.field1457 = 0;
                this.field107.method276(this.field327.field1456, 0, this.field258);
                this.field260 = 0;
                this.field213 = this.field212;
                this.field212 = this.field211;
                this.field211 = this.field259;
                if (this.field259 == 163) {
                    this.method53((byte) 6);
                    this.field259 = -1;
                    return false;
                }
                if (this.field259 == 56) {
                    this.method77(this.field258, false, this.field327);
                    this.field170 = false;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 183) {
                    long var3 = this.field327.method474(0);
                    int var5 = this.field327.method473();
                    int var6 = this.field327.method468();
                    boolean var7 = false;
                    for (int var8 = 0; var8 < 100; ++var8) {
                        if (this.field447[var8] == var5) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var6 <= 1) {
                        for (int var9 = 0; var9 < this.field161; ++var9) {
                            if (this.field319[var9] == var3) {
                                var7 = true;
                                break;
                            }
                        }
                    }
                    if (!var7 && this.field292 == 0) {
                        try {
                            this.field447[this.field466] = var5;
                            this.field466 = (this.field466 + 1) % 100;
                            String var10 = class6.method26(this.field258 - 13, -765, this.field327);
                            if (var6 != 3) {
                                var10 = class40.method377(var10, this.field338);
                            }
                            if (var6 != 2 && var6 != 3) {
                                if (var6 == 1) {
                                    this.method133("@cr1@" + class41.method409(-354, class41.method406(var3, (byte) 1)), var10, (byte) -30, 7);
                                } else {
                                    this.method133(class41.method409(-354, class41.method406(var3, (byte) 1)), var10, (byte) -30, 3);
                                }
                            } else {
                                this.method133("@cr2@" + class41.method409(-354, class41.method406(var3, (byte) 1)), var10, (byte) -30, 7);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 24) {
                    this.field288 = true;
                    int var12 = this.field327.method489(-33025);
                    int var13 = this.field327.method504(0);
                    int var14 = this.field327.method468();
                    this.field361[var12] = var13;
                    this.field468[var12] = var14;
                    this.field273[var12] = 1;
                    for (int var15 = 0; var15 < 98; ++var15) {
                        if (var13 >= field232[var15]) {
                            this.field273[var12] = var15 + 2;
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 245) {
                    int var16 = this.field327.method499(this.field184);
                    if (var16 >= 0) {
                        this.method143(true, var16);
                    }
                    if (this.field108 != var16) {
                        this.method80(this.field108, (byte) -79);
                        this.field108 = var16;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 209) {
                    if (this.field404 == 12) {
                        this.field288 = true;
                    }
                    this.field560 = this.field327.method468();
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 150) {
                    this.field565 = this.field327.method468();
                    this.field288 = true;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 51) {
                    this.field100 = this.field327.method488(-33544);
                    this.field101 = this.field327.method488(-33544);
                    while (this.field327.field1457 < this.field258) {
                        int var17 = this.field327.method468();
                        this.method113((byte) 24, var17, this.field327);
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 43) {
                    int var18 = this.field327.method497(this.field188);
                    int var19 = this.field327.method496((byte) 7);
                    this.method143(true, var19);
                    if (var18 != -1) {
                        this.method143(true, var18);
                    }
                    if (this.field99 != -1) {
                        this.method80(this.field99, (byte) -79);
                        this.field99 = -1;
                    }
                    if (this.field133 != -1) {
                        this.method80(this.field133, (byte) -79);
                        this.field133 = -1;
                    }
                    if (this.field111 != -1) {
                        this.method80(this.field111, (byte) -79);
                        this.field111 = -1;
                    }
                    if (this.field369 != var19) {
                        this.method80(this.field369, (byte) -79);
                        this.field369 = var19;
                    }
                    if (this.field484 != var19) {
                        this.method80(this.field484, (byte) -79);
                        this.field484 = var18;
                    }
                    this.field437 = 0;
                    this.field497 = false;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 242) {
                    this.field95 = true;
                    this.field279 = this.field327.method468();
                    this.field280 = this.field327.method468();
                    this.field281 = this.field327.method470();
                    this.field282 = this.field327.method468();
                    this.field283 = this.field327.method468();
                    if (this.field283 >= 100) {
                        int var20 = this.field279 * 128 + 64;
                        int var21 = this.field280 * 128 + 64;
                        int var22 = this.method109(var21, var20, (byte) 55, this.field237) - this.field281;
                        int var23 = var20 - this.field372;
                        int var24 = var22 - this.field373;
                        int var25 = var21 - this.field374;
                        int var26 = (int) Math.sqrt((double) (var23 * var23 + var25 * var25));
                        this.field375 = (int) (Math.atan2((double) var24, (double) var26) * 325.949D) & 2047;
                        this.field376 = (int) (Math.atan2((double) var23, (double) var25) * -325.949D) & 2047;
                        if (this.field375 < 128) {
                            this.field375 = 128;
                        }
                        if (this.field375 > 383) {
                            this.field375 = 383;
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 87) {
                    int var27 = this.field327.method468();
                    String var28 = this.field327.method475();
                    int var29 = this.field327.method487((byte) 0);
                    if (var29 >= 1 && var29 <= 5) {
                        if (var28.equalsIgnoreCase("null")) {
                            var28 = null;
                        }
                        this.field285[var29 - 1] = var28;
                        this.field286[var29 - 1] = var27 == 0;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 110) {
                    this.field506 = false;
                    this.field437 = 1;
                    this.field339 = "";
                    this.field168 = true;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 18) {
                    long var30 = this.field327.method474(0);
                    int var32 = this.field327.method468();
                    String var33 = class41.method409(-354, class41.method406(var30, (byte) 1));
                    for (int var34 = 0; var34 < this.field564; ++var34) {
                        if (this.field241[var34] == var30) {
                            if (this.field131[var34] != var32) {
                                this.field131[var34] = var32;
                                this.field288 = true;
                                if (var32 > 0) {
                                    this.method133("", var33 + " has logged in.", (byte) -30, 5);
                                }
                                if (var32 == 0) {
                                    this.method133("", var33 + " has logged out.", (byte) -30, 5);
                                }
                            }
                            var33 = null;
                            break;
                        }
                    }
                    if (var33 != null && this.field564 < 200) {
                        this.field241[this.field564] = var30;
                        this.field389[this.field564] = var33;
                        this.field131[this.field564] = var32;
                        ++this.field564;
                        this.field288 = true;
                    }
                    boolean var35 = false;
                    while (!var35) {
                        var35 = true;
                        for (int var36 = 0; var36 < this.field564 - 1; ++var36) {
                            if (this.field131[var36] != field491 && this.field131[var36 + 1] == field491 || this.field131[var36] == 0 && this.field131[var36 + 1] != 0) {
                                int var37 = this.field131[var36];
                                this.field131[var36] = this.field131[var36 + 1];
                                this.field131[var36 + 1] = var37;
                                String var38 = this.field389[var36];
                                this.field389[var36] = this.field389[var36 + 1];
                                this.field389[var36 + 1] = var38;
                                long var39 = this.field241[var36];
                                this.field241[var36] = this.field241[var36 + 1];
                                this.field241[var36 + 1] = var39;
                                this.field288 = true;
                                var35 = false;
                            }
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 138) {
                    int var41 = this.field327.method497(this.field188);
                    int var42 = this.field327.method497(this.field188);
                    class37 var43 = class37.method359(var41);
                    if (var43 != null && var43.field1145 == 0) {
                        if (var42 < 0) {
                            var42 = 0;
                        }
                        if (var42 > var43.field1197 - var43.field1174) {
                            var42 = var43.field1197 - var43.field1174;
                        }
                        var43.field1198 = var42;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 37) {
                    int var44 = this.field327.method497(this.field188);
                    int var45 = this.field327.method496((byte) 7);
                    int var46 = this.field327.method470();
                    if (var46 == 65535) {
                        class37.method359(var45).field1146 = 0;
                        this.field259 = -1;
                        return true;
                    }
                    class67 var47 = class67.method575(var46);
                    class37.method359(var45).field1146 = 4;
                    class37.method359(var45).field1147 = var46;
                    class37.method359(var45).field1151 = var47.field1708;
                    class37.method359(var45).field1152 = var47.field1686;
                    class37.method359(var45).field1150 = var47.field1657 * 100 / var44;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 169) {
                    int var48 = this.field327.method470();
                    int var49 = this.field327.method468();
                    int var50 = this.field327.method470();
                    if (var50 == 65535) {
                        if (this.field138 < 50) {
                            this.field545[this.field138] = (short) var48;
                            this.field500[this.field138] = var49;
                            this.field102[this.field138] = 0;
                            ++this.field138;
                        }
                    } else if (this.field465 && !field494 && this.field138 < 50) {
                        this.field545[this.field138] = var48;
                        this.field500[this.field138] = var49;
                        this.field102[this.field138] = class62.field1548[var48] + var50;
                        ++this.field138;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 7) {
                    int var51 = this.field327.method470();
                    int var52 = this.field327.method497(this.field188);
                    int var53 = var52 >> 10 & 31;
                    int var54 = var52 >> 5 & 31;
                    int var55 = var52 & 31;
                    class37.method359(var51).field1208 = (var55 << 3) + (var53 << 19) + (var54 << 11);
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 250) {
                    int var56 = this.field327.method470();
                    int var57 = this.field327.method498(this.field340);
                    if (this.field111 != -1) {
                        this.method80(this.field111, (byte) -79);
                        this.field111 = -1;
                        this.field168 = true;
                    }
                    if (this.field369 != -1) {
                        this.method80(this.field369, (byte) -79);
                        this.field369 = -1;
                        this.field251 = true;
                    }
                    if (this.field484 != -1) {
                        this.method80(this.field484, (byte) -79);
                        this.field484 = -1;
                    }
                    if (this.field99 != var56) {
                        this.method80(this.field99, (byte) -79);
                        this.field99 = var56;
                    }
                    if (this.field133 != var57) {
                        this.method80(this.field133, (byte) -79);
                        this.field133 = var57;
                    }
                    if (this.field437 != 0) {
                        this.field437 = 0;
                        this.field168 = true;
                    }
                    this.field288 = true;
                    this.field451 = true;
                    this.field497 = false;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 237) {
                    int var58 = this.field327.method470();
                    int var59 = this.field327.method473();
                    this.field357[var58] = var59;
                    if (this.field385[var58] != var59) {
                        this.field385[var58] = var59;
                        this.method138(var58, true);
                        this.field288 = true;
                        if (this.field577 != -1) {
                            this.field168 = true;
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 21) {
                    byte var60 = this.field327.method492((byte) -9);
                    int var61 = this.field327.method470();
                    this.field357[var61] = var60;
                    if (this.field385[var61] != var60) {
                        this.field385[var61] = var60;
                        this.method138(var61, true);
                        this.field288 = true;
                        if (this.field577 != -1) {
                            this.field168 = true;
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 71) {
                    this.field288 = true;
                    int var62 = this.field327.method470();
                    class37 var63 = class37.method359(var62);
                    int var64 = this.field327.method470();
                    for (int var65 = 0; var65 < var64; ++var65) {
                        int var66 = this.field327.method488(-33544);
                        if (var66 == 255) {
                            var66 = this.field327.method503(-699);
                        }
                        var63.field1167[var65] = this.field327.method470();
                        var63.field1209[var65] = var66;
                    }
                    for (int var67 = var64; var67 < var63.field1167.length; ++var67) {
                        var63.field1167[var67] = 0;
                        var63.field1209[var67] = 0;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 26) {
                    this.field314 = this.field327.method496((byte) 7);
                    this.field327.method497(this.field188);
                    this.field327.method487((byte) 0);
                    this.field145 = this.field327.method470();
                    this.field197 = this.field327.method503(-699);
                    this.field236 = this.field327.method496((byte) 7);
                    this.field244 = this.field327.method498(this.field340);
                    this.field523 = this.field327.method496((byte) 7);
                    this.field365 = this.field327.method497(this.field188);
                    this.field185 = this.field327.method470();
                    this.field181 = this.field327.method498(this.field340);
                    signlink.dnslookup(class41.method408(this.field197, (byte) -63));
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 146) {
                    this.field404 = this.field327.method489(-33025);
                    this.field288 = true;
                    this.field451 = true;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 33) {
                    int var68 = this.field327.method468();
                    int var69 = this.field327.method468();
                    int var70 = this.field327.method468();
                    int var71 = this.field327.method468();
                    this.field384[var68] = true;
                    this.field549[var68] = var69;
                    this.field321[var68] = var70;
                    this.field182[var68] = var71;
                    this.field115[var68] = 0;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 46) {
                    int var72 = this.field327.method470();
                    this.method143(true, var72);
                    if (this.field111 != -1) {
                        this.method80(this.field111, (byte) -79);
                        this.field111 = -1;
                        this.field168 = true;
                    }
                    if (this.field369 != -1) {
                        this.method80(this.field369, (byte) -79);
                        this.field369 = -1;
                        this.field251 = true;
                    }
                    if (this.field484 != -1) {
                        this.method80(this.field484, (byte) -79);
                        this.field484 = -1;
                    }
                    if (this.field99 != -1) {
                        this.method80(this.field99, (byte) -79);
                        this.field99 = -1;
                    }
                    if (this.field133 != var72) {
                        this.method80(this.field133, (byte) -79);
                        this.field133 = var72;
                    }
                    if (this.field437 != 0) {
                        this.field437 = 0;
                        this.field168 = true;
                    }
                    this.field288 = true;
                    this.field451 = true;
                    this.field497 = false;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 90) {
                    int var73 = this.field327.method498(this.field340);
                    this.method143(true, var73);
                    if (this.field133 != -1) {
                        this.method80(this.field133, (byte) -79);
                        this.field133 = -1;
                        this.field288 = true;
                        this.field451 = true;
                    }
                    if (this.field111 != -1) {
                        this.method80(this.field111, (byte) -79);
                        this.field111 = -1;
                        this.field168 = true;
                    }
                    if (this.field369 != -1) {
                        this.method80(this.field369, (byte) -79);
                        this.field369 = -1;
                        this.field251 = true;
                    }
                    if (this.field484 != -1) {
                        this.method80(this.field484, (byte) -79);
                        this.field484 = -1;
                    }
                    if (this.field99 != var73) {
                        this.method80(this.field99, (byte) -79);
                        this.field99 = var73;
                    }
                    if (this.field437 != 0) {
                        this.field437 = 0;
                        this.field168 = true;
                    }
                    this.field497 = false;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 66) {
                    this.field161 = this.field258 / 8;
                    for (int var74 = 0; var74 < this.field161; ++var74) {
                        this.field319[var74] = this.field327.method474(0);
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 104) {
                    this.field101 = this.field327.method487((byte) 0);
                    this.field100 = this.field327.method488(-33544);
                    for (int var75 = this.field100; var75 < this.field100 + 8; ++var75) {
                        for (int var76 = this.field101; var76 < this.field101 + 8; ++var76) {
                            if (this.field137[this.field237][var75][var76] != null) {
                                this.field137[this.field237][var75][var76] = null;
                                this.method98(var75, var76);
                            }
                        }
                    }
                    for (class28 var77 = (class28) this.field391.method179(); var77 != null; var77 = (class28) this.field391.method181((byte) 2)) {
                        if (var77.field964 >= this.field100 && var77.field964 < this.field100 + 8 && var77.field965 >= this.field101 && var77.field965 < this.field101 + 8 && this.field237 == var77.field962) {
                            var77.field958 = 0;
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 94) {
                    for (int var78 = 0; var78 < this.field385.length; ++var78) {
                        if (this.field385[var78] != this.field357[var78]) {
                            this.field385[var78] = this.field357[var78];
                            this.method138(var78, true);
                            this.field288 = true;
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 123) {
                    int var79 = this.field327.method497(this.field188);
                    boolean var80 = this.field327.method489(-33025) == 1;
                    class37.method359(var79).field1173 = var80;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 177) {
                    this.field186 = this.field327.method468();
                    if (this.field404 == this.field186) {
                        if (this.field186 == 3) {
                            this.field404 = 1;
                        } else {
                            this.field404 = 3;
                        }
                        this.field288 = true;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 59) {
                    this.field95 = false;
                    for (int var81 = 0; var81 < 5; ++var81) {
                        this.field384[var81] = false;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 225) {
                    int var82 = this.field327.method470();
                    int var83 = this.field327.method497(this.field188);
                    class37.method359(var83).field1146 = 2;
                    class37.method359(var83).field1147 = var82;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 189) {
                    int var84 = this.field327.method500(false);
                    if (this.field577 != var84) {
                        this.method80(this.field577, (byte) -79);
                        this.field577 = var84;
                    }
                    this.field168 = true;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 188) {
                    this.field100 = this.field327.method487((byte) 0);
                    this.field101 = this.field327.method489(-33025);
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 25) {
                    int var85 = this.field327.method498(this.field340);
                    int var86 = this.field327.method498(this.field340);
                    class37.method359(var86).field1146 = 1;
                    class37.method359(var86).field1147 = var85;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 100) {
                    this.field288 = true;
                    int var87 = this.field327.method470();
                    class37 var88 = class37.method359(var87);
                    while (this.field327.field1457 < this.field258) {
                        int var89 = this.field327.method482();
                        int var90 = this.field327.method470();
                        int var91 = this.field327.method468();
                        if (var91 == 255) {
                            var91 = this.field327.method473();
                        }
                        if (var89 >= 0 && var89 < var88.field1167.length) {
                            var88.field1167[var89] = var90;
                            var88.field1209[var89] = var91;
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 190) {
                    this.field95 = true;
                    this.field555 = this.field327.method468();
                    this.field556 = this.field327.method468();
                    this.field557 = this.field327.method470();
                    this.field558 = this.field327.method468();
                    this.field559 = this.field327.method468();
                    if (this.field559 >= 100) {
                        this.field372 = this.field555 * 128 + 64;
                        this.field374 = this.field556 * 128 + 64;
                        this.field373 = this.method109(this.field374, this.field372, (byte) 55, this.field237) - this.field557;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 252) {
                    String var92 = this.field327.method475();
                    if (var92.endsWith(":tradereq:")) {
                        String var93 = var92.substring(0, var92.indexOf(":"));
                        long var94 = class41.method405(var93);
                        boolean var96 = false;
                        for (int var97 = 0; var97 < this.field161; ++var97) {
                            if (this.field319[var97] == var94) {
                                var96 = true;
                                break;
                            }
                        }
                        if (!var96 && this.field292 == 0) {
                            this.method133(var93, "wishes to trade with you.", (byte) -30, 4);
                        }
                    } else if (var92.endsWith(":duelreq:")) {
                        String var98 = var92.substring(0, var92.indexOf(":"));
                        long var99 = class41.method405(var98);
                        boolean var101 = false;
                        for (int var102 = 0; var102 < this.field161; ++var102) {
                            if (this.field319[var102] == var99) {
                                var101 = true;
                                break;
                            }
                        }
                        if (!var101 && this.field292 == 0) {
                            this.method133(var98, "wishes to duel with you.", (byte) -30, 8);
                        }
                    } else if (!var92.endsWith(":chalreq:")) {
                        this.method133("", var92, (byte) -30, 0);
                    } else {
                        String var103 = var92.substring(0, var92.indexOf(":"));
                        long var104 = class41.method405(var103);
                        boolean var106 = false;
                        for (int var107 = 0; var107 < this.field161; ++var107) {
                            if (this.field319[var107] == var104) {
                                var106 = true;
                                break;
                            }
                        }
                        if (!var106 && this.field292 == 0) {
                            String var108 = var92.substring(var92.indexOf(":") + 1, var92.length() - 9);
                            this.method133(var103, var108, (byte) -30, 8);
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 8) {
                    int var109 = this.field327.method498(this.field340);
                    int var110 = this.field327.method500(false);
                    class37 var111 = class37.method359(var109);
                    if (var111.field1193 != var110 || var110 == -1) {
                        var111.field1193 = var110;
                        var111.field1166 = 0;
                        var111.field1158 = 0;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 127) {
                    int var112 = this.field327.method470();
                    String var113 = this.field327.method475();
                    class37.method359(var112).field1184 = var113;
                    int var10001 = this.field566[this.field404];
                    if (class37.method359(var112).field1182 == var10001) {
                        this.field288 = true;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 93) {
                    if (this.field133 != -1) {
                        this.method80(this.field133, (byte) -79);
                        this.field133 = -1;
                        this.field288 = true;
                        this.field451 = true;
                    }
                    if (this.field111 != -1) {
                        this.method80(this.field111, (byte) -79);
                        this.field111 = -1;
                        this.field168 = true;
                    }
                    if (this.field369 != -1) {
                        this.method80(this.field369, (byte) -79);
                        this.field369 = -1;
                        this.field251 = true;
                    }
                    if (this.field484 != -1) {
                        this.method80(this.field484, (byte) -79);
                        this.field484 = -1;
                    }
                    if (this.field99 != -1) {
                        this.method80(this.field99, (byte) -79);
                        this.field99 = -1;
                    }
                    if (this.field437 != 0) {
                        this.field437 = 0;
                        this.field168 = true;
                    }
                    this.field497 = false;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 243) {
                    int var114 = this.field327.method498(this.field340);
                    int var115 = this.field327.method500(false);
                    int var116 = this.field327.method471();
                    class37 var117 = class37.method359(var114);
                    var117.field1149 = var116;
                    var117.field1199 = var115;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 185 || this.field259 == 47 || this.field259 == 128 || this.field259 == 210 || this.field259 == 160 || this.field259 == 187 || this.field259 == 91 || this.field259 == 69 || this.field259 == 255 || this.field259 == 103 || this.field259 == 14) {
                    this.method113((byte) 24, this.field259, this.field327);
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 113) {
                    this.field275 = this.field327.method498(this.field340) * 30;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 55) {
                    int var118 = this.field327.method496((byte) 7);
                    int var119 = this.field327.method498(this.field340);
                    int var120 = this.field327.method496((byte) 7);
                    class37.method359(var119).field1160 = (var118 << 16) + var120;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 251) {
                    int var121 = this.field327.method497(this.field188);
                    if (var121 == 65535) {
                        var121 = -1;
                    }
                    if (this.field189 != var121 && this.field113 && !field494 && this.field284 == 0) {
                        this.field141 = var121;
                        this.field142 = true;
                        this.field194.method213(2, this.field141);
                    }
                    this.field189 = var121;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 41) {
                    int var122 = this.field327.method498(this.field340);
                    int var123 = this.field327.method472();
                    if (this.field113 && !field494) {
                        this.field141 = var122;
                        this.field142 = false;
                        this.field194.method213(2, this.field141);
                        this.field284 = var123;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 108) {
                    int var124 = this.field327.method496((byte) 7);
                    int var125 = this.field327.method497(this.field188);
                    int var126 = this.field327.method470();
                    int var127 = this.field327.method498(this.field340);
                    class37.method359(var125).field1151 = var127;
                    class37.method359(var125).field1152 = var124;
                    class37.method359(var125).field1150 = var126;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 173) {
                    for (int var128 = 0; var128 < this.field417.length; ++var128) {
                        if (this.field417[var128] != null) {
                            this.field417[var128].field813 = -1;
                        }
                    }
                    for (int var129 = 0; var129 < this.field126.length; ++var129) {
                        if (this.field126[var129] != null) {
                            this.field126[var129].field813 = -1;
                        }
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 99) {
                    this.method169(this.field327, 0, this.field258);
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 229) {
                    int var130 = this.field327.method496((byte) 7);
                    this.method143(true, var130);
                    if (this.field133 != -1) {
                        this.method80(this.field133, (byte) -79);
                        this.field133 = -1;
                        this.field288 = true;
                        this.field451 = true;
                    }
                    if (this.field369 != -1) {
                        this.method80(this.field369, (byte) -79);
                        this.field369 = -1;
                        this.field251 = true;
                    }
                    if (this.field484 != -1) {
                        this.method80(this.field484, (byte) -79);
                        this.field484 = -1;
                    }
                    if (this.field99 != -1) {
                        this.method80(this.field99, (byte) -79);
                        this.field99 = -1;
                    }
                    if (this.field111 != var130) {
                        this.method80(this.field111, (byte) -79);
                        this.field111 = var130;
                    }
                    this.field497 = false;
                    this.field168 = true;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 85) {
                    this.field337 = this.field327.method468();
                    this.field403 = this.field327.method468();
                    this.field256 = this.field327.method468();
                    this.field377 = true;
                    this.field168 = true;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 171) {
                    this.field144 = this.field327.method498(this.field340);
                    this.field396 = this.field327.method488(-33544);
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 12) {
                    if (this.field404 == 12) {
                        this.field288 = true;
                    }
                    this.field160 = this.field327.method471();
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 95 || this.field259 == 81) {
                    int var131 = this.field116;
                    int var132 = this.field117;
                    if (this.field259 == 95) {
                        var132 = this.field327.method498(this.field340);
                        var131 = this.field327.method497(this.field188);
                        this.field109 = false;
                    }
                    if (this.field259 == 81) {
                        var132 = this.field327.method498(this.field340);
                        this.field327.method478((byte) -43);
                        int var133 = 0;
                        while (true) {
                            if (var133 >= 4) {
                                this.field327.method480(9);
                                var131 = this.field327.method497(this.field188);
                                this.field109 = true;
                                break;
                            }
                            for (int var134 = 0; var134 < 13; ++var134) {
                                for (int var135 = 0; var135 < 13; ++var135) {
                                    int var136 = this.field327.method479(1, (byte) 63);
                                    if (var136 == 1) {
                                        this.field246[var133][var134][var135] = this.field327.method479(26, (byte) 63);
                                    } else {
                                        this.field246[var133][var134][var135] = -1;
                                    }
                                }
                            }
                            ++var133;
                        }
                    }
                    if (this.field116 == var131 && this.field117 == var132 && this.field90 == 2) {
                        this.field259 = -1;
                        return true;
                    }
                    this.field116 = var131;
                    this.field117 = var132;
                    this.field472 = (this.field116 - 6) * 8;
                    this.field473 = (this.field117 - 6) * 8;
                    this.field267 = false;
                    if ((this.field116 / 8 == 48 || this.field116 / 8 == 49) && this.field117 / 8 == 48) {
                        this.field267 = true;
                    }
                    if (this.field116 / 8 == 48 && this.field117 / 8 == 148) {
                        this.field267 = true;
                    }
                    this.field90 = 1;
                    this.field268 = System.currentTimeMillis();
                    this.method54("Loading - please wait.", 685, (String) null);
                    if (this.field259 == 95) {
                        int var137 = 0;
                        int var138 = (this.field116 - 6) / 8;
                        label1195: while (true) {
                            if (var138 > (this.field116 + 6) / 8) {
                                this.field562 = new byte[var137][];
                                this.field167 = new byte[var137][];
                                this.field247 = new int[var137];
                                this.field248 = new int[var137];
                                this.field249 = new int[var137];
                                int var140 = 0;
                                int var141 = (this.field116 - 6) / 8;
                                while (true) {
                                    if (var141 > (this.field116 + 6) / 8) {
                                        break label1195;
                                    }
                                    for (int var142 = (this.field117 - 6) / 8; var142 <= (this.field117 + 6) / 8; ++var142) {
                                        this.field247[var140] = (var141 << 8) + var142;
                                        if (this.field267 && (var142 == 49 || var142 == 149 || var142 == 147 || var141 == 50 || var141 == 49 && var142 == 47)) {
                                            this.field248[var140] = -1;
                                            this.field249[var140] = -1;
                                            ++var140;
                                        } else {
                                            int var143 = this.field248[var140] = this.field194.method207(var142, var141, 0, field272);
                                            if (var143 != -1) {
                                                this.field194.method213(3, var143);
                                            }
                                            int var144 = this.field249[var140] = this.field194.method207(var142, var141, 1, field272);
                                            if (var144 != -1) {
                                                this.field194.method213(3, var144);
                                            }
                                            ++var140;
                                        }
                                    }
                                    ++var141;
                                }
                            }
                            for (int var139 = (this.field117 - 6) / 8; var139 <= (this.field117 + 6) / 8; ++var139) {
                                ++var137;
                            }
                            ++var138;
                        }
                    }
                    if (this.field259 == 81) {
                        int var145 = 0;
                        int[] var146 = new int[676];
                        int var147 = 0;
                        label1156: while (true) {
                            if (var147 >= 4) {
                                this.field562 = new byte[var145][];
                                this.field167 = new byte[var145][];
                                this.field247 = new int[var145];
                                this.field248 = new int[var145];
                                this.field249 = new int[var145];
                                int var155 = 0;
                                while (true) {
                                    if (var155 >= var145) {
                                        break label1156;
                                    }
                                    int var156 = this.field247[var155] = var146[var155];
                                    int var157 = var156 >> 8 & 255;
                                    int var158 = var156 & 255;
                                    int var159 = this.field248[var155] = this.field194.method207(var158, var157, 0, field272);
                                    if (var159 != -1) {
                                        this.field194.method213(3, var159);
                                    }
                                    int var160 = this.field249[var155] = this.field194.method207(var158, var157, 1, field272);
                                    if (var160 != -1) {
                                        this.field194.method213(3, var160);
                                    }
                                    ++var155;
                                }
                            }
                            for (int var148 = 0; var148 < 13; ++var148) {
                                for (int var149 = 0; var149 < 13; ++var149) {
                                    int var150 = this.field246[var147][var148][var149];
                                    if (var150 != -1) {
                                        int var151 = var150 >> 14 & 1023;
                                        int var152 = var150 >> 3 & 2047;
                                        int var153 = (var151 / 8 << 8) + var152 / 8;
                                        for (int var154 = 0; var154 < var145; ++var154) {
                                            if (var146[var154] == var153) {
                                                var153 = -1;
                                                break;
                                            }
                                        }
                                        if (var153 != -1) {
                                            var146[var145++] = var153;
                                        }
                                    }
                                }
                            }
                            ++var147;
                        }
                    }
                    int var161 = this.field472 - this.field474;
                    int var162 = this.field473 - this.field475;
                    this.field474 = this.field472;
                    this.field475 = this.field473;
                    for (int var163 = 0; var163 < 16384; ++var163) {
                        class15 var164 = this.field126[var163];
                        if (var164 != null) {
                            for (int var165 = 0; var165 < 10; ++var165) {
                                var164.field827[var165] -= var161;
                                var164.field828[var165] -= var162;
                            }
                            var164.field830 -= var161 * 128;
                            var164.field831 -= var162 * 128;
                        }
                    }
                    for (int var166 = 0; var166 < this.field415; ++var166) {
                        class8 var167 = this.field417[var166];
                        if (var167 != null) {
                            for (int var168 = 0; var168 < 10; ++var168) {
                                var167.field827[var168] -= var161;
                                var167.field828[var168] -= var162;
                            }
                            var167.field830 -= var161 * 128;
                            var167.field831 -= var162 * 128;
                        }
                    }
                    this.field170 = true;
                    byte var169 = 0;
                    byte var170 = 104;
                    byte var171 = 1;
                    if (var161 < 0) {
                        var169 = 103;
                        var170 = -1;
                        var171 = -1;
                    }
                    byte var172 = 0;
                    byte var173 = 104;
                    byte var174 = 1;
                    if (var162 < 0) {
                        var172 = 103;
                        var173 = -1;
                        var174 = -1;
                    }
                    for (int var175 = var169; var170 != var175; var175 += var171) {
                        for (int var176 = var172; var173 != var176; var176 += var174) {
                            int var177 = var161 + var175;
                            int var178 = var162 + var176;
                            for (int var179 = 0; var179 < 4; ++var179) {
                                if (var177 >= 0 && var178 >= 0 && var177 < 104 && var178 < 104) {
                                    this.field137[var179][var175][var176] = this.field137[var179][var177][var178];
                                } else {
                                    this.field137[var179][var175][var176] = null;
                                }
                            }
                        }
                    }
                    for (class28 var180 = (class28) this.field391.method179(); var180 != null; var180 = (class28) this.field391.method181((byte) 2)) {
                        var180.field964 -= var161;
                        var180.field965 -= var162;
                        if (var180.field964 < 0 || var180.field965 < 0 || var180.field964 >= 104 || var180.field965 >= 104) {
                            var180.method272();
                        }
                    }
                    if (this.field348 != 0) {
                        this.field348 -= var161;
                        this.field349 -= var162;
                    }
                    this.field95 = false;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 133) {
                    this.field348 = 0;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 101) {
                    int var181 = this.field327.method470();
                    int var182 = this.field327.method488(-33544);
                    if (var181 == 65535) {
                        var181 = -1;
                    }
                    if (this.field566[var182] != var181) {
                        this.method80(this.field566[var182], (byte) -79);
                        this.field566[var182] = var181;
                    }
                    this.field288 = true;
                    this.field451 = true;
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 220) {
                    int var183 = this.field327.method498(this.field340);
                    class37.method359(var183).field1146 = 3;
                    if (field304.field625 == null) {
                        class37.method359(var183).field1147 = (field304.field605[11] << 5) + (field304.field605[8] << 10) + (field304.field605[0] << 15) + (field304.field603[0] << 25) + (field304.field603[4] << 20) + field304.field605[1];
                    } else {
                        class37.method359(var183).field1147 = (int) (field304.field625.field1629 + 305419896L);
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 30) {
                    this.field204 = this.field327.method468();
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 80) {
                    this.field568 = this.field327.method468();
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 155) {
                    this.field206 = this.field327.method468();
                    if (this.field206 == 1) {
                        this.field252 = this.field327.method470();
                    }
                    if (this.field206 >= 2 && this.field206 <= 6) {
                        if (this.field206 == 2) {
                            this.field443 = 64;
                            this.field444 = 64;
                        }
                        if (this.field206 == 3) {
                            this.field443 = 0;
                            this.field444 = 64;
                        }
                        if (this.field206 == 4) {
                            this.field443 = 128;
                            this.field444 = 64;
                        }
                        if (this.field206 == 5) {
                            this.field443 = 64;
                            this.field444 = 0;
                        }
                        if (this.field206 == 6) {
                            this.field443 = 64;
                            this.field444 = 128;
                        }
                        this.field206 = 2;
                        this.field440 = this.field327.method470();
                        this.field441 = this.field327.method470();
                        this.field442 = this.field327.method468();
                    }
                    if (this.field206 == 10) {
                        this.field543 = this.field327.method470();
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 186) {
                    int var184 = this.field327.method470();
                    class37 var185 = class37.method359(var184);
                    for (int var186 = 0; var186 < var185.field1167.length; ++var186) {
                        var185.field1167[var186] = -1;
                        var185.field1167[var186] = 0;
                    }
                    this.field259 = -1;
                    return true;
                }
                if (this.field259 == 211) {
                    this.field506 = false;
                    this.field437 = 2;
                    this.field339 = "";
                    this.field168 = true;
                    this.field259 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field259 + "," + this.field258 + " - " + this.field212 + "," + this.field213);
                this.method53((byte) 6);
            } catch (IOException var191) {
                this.method60(false);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field259 + "," + this.field212 + "," + this.field213 + " - " + this.field258 + "," + (field304.field827[0] + this.field472) + "," + (field304.field828[0] + this.field473) + " - ";
                for (int var189 = 0; var189 < this.field258 && var189 < 50; ++var189) {
                    var188 = var188 + this.field327.field1456[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method53((byte) 6);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method35(int arg0) {
        this.field258 += arg0;
        for (int var2 = 0; var2 < this.field138; ++var2) {
            if (this.field102[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field545[var2] == this.field177 && this.field500[var2] == this.field471) {
                        if (!this.method57(-809)) {
                            var3 = true;
                        }
                    } else {
                        class53 var4 = class62.method545((byte) 9, this.field500[var2], this.field545[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1457 / 22) > (long) (this.field460 / 22) + this.field94) {
                            this.field460 = var4.field1457;
                            this.field94 = System.currentTimeMillis();
                            if (this.method140(0, var4.field1456, var4.field1457)) {
                                this.field177 = this.field545[var2];
                                this.field471 = this.field500[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field92.method457(525, 189);
                        this.field92.method459(this.field545[var2] & 32767);
                    } else {
                        this.field92.method457(525, 189);
                        this.field92.method459(-1);
                    }
                }
                if (var3 && this.field102[var2] != -5) {
                    this.field102[var2] = -5;
                } else {
                    --this.field138;
                    for (int var6 = var2; var6 < this.field138; ++var6) {
                        this.field545[var6] = this.field545[var6 + 1];
                        this.field500[var6] = this.field500[var6 + 1];
                        this.field102[var6] = this.field102[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field102[var2]--;
            }
        }
        if (this.field284 > 0) {
            this.field284 -= 20;
            if (this.field284 < 0) {
                this.field284 = 0;
            }
            if (this.field284 == 0 && this.field113 && !field494) {
                this.field141 = this.field189;
                this.field142 = true;
                this.field194.method213(2, this.field141);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method36(int arg0) {
        if (arg0 <= 0) {
            this.field259 = this.field327.method468();
        }
        if (this.field568 == 0) {
            if (super.field1352 == 1) {
                int var2 = super.field1353 - 25 - 550;
                int var3 = super.field1354 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field298 + this.field295 & 2047;
                    int var5 = class49.field1383[var4];
                    int var6 = class49.field1384[var4];
                    int var7 = (this.field547 + 256) * var5 >> 8;
                    int var8 = (this.field547 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field304.field830 + var9 >> 7;
                    int var12 = field304.field831 - var10 >> 7;
                    boolean var13 = this.method73(0, 0, 2, 1, true, 0, 0, field304.field828[0], var12, 0, var11, field304.field827[0]);
                    if (var13) {
                        this.field92.method458(var2);
                        this.field92.method458(var3);
                        this.field92.method459(this.field295);
                        this.field92.method458(57);
                        this.field92.method458(this.field298);
                        this.field92.method458(this.field547);
                        this.field92.method458(89);
                        this.field92.method459(field304.field830);
                        this.field92.method459(field304.field831);
                        this.field92.method458(this.field310);
                        this.field92.method458(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
    public final boolean method37(int arg0, int arg1) {
        int var3 = 15 / arg0;
        if (arg1 < 0) {
            return false;
        } else {
            int var4 = this.field537[arg1];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 646;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method38(int arg0) {
        if (arg0 != 7320) {
            this.field137 = null;
        }
        for (class31 var2 = (class31) this.field234.method179(); var2 != null; var2 = (class31) this.field234.method181((byte) 2)) {
            if (this.field237 == var2.field1003 && !var2.field1002) {
                if (field291 >= var2.field999) {
                    var2.method282(this.field196, (byte) 5);
                    if (var2.field1002) {
                        var2.method272();
                    } else {
                        this.field509.method295(var2.field1005, -1, 8, var2.field1003, var2.field1004, var2, 60, 0, false, var2.field1006);
                    }
                }
            } else {
                var2.method272();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method39(int arg0) {
        this.field258 += arg0;
        while (true) {
            class61 var2 = this.field194.method214();
            if (var2 == null) {
                return;
            }
            if (var2.field1540 == 0) {
                class25.method244(var2.field1542, var2.field1543, true);
                if ((this.field194.method220((byte) 4, var2.field1543) & 98) != 0) {
                    this.field288 = true;
                    if (this.field111 != -1 || this.field577 != -1) {
                        this.field168 = true;
                    }
                }
            }
            if (var2.field1540 == 1 && var2.field1542 != null) {
                class48.method420(var2.field1542, (byte) 6);
            }
            if (var2.field1540 == 2 && this.field141 == var2.field1543 && var2.field1542 != null) {
                this.method144((byte) -91, this.field142, var2.field1542);
            }
            if (var2.field1540 == 3 && this.field90 == 1) {
                for (int var3 = 0; var3 < this.field562.length; ++var3) {
                    if (this.field248[var3] == var2.field1543) {
                        this.field562[var3] = var2.field1542;
                        if (var2.field1542 == null) {
                            this.field248[var3] = -1;
                        }
                        break;
                    }
                    if (this.field249[var3] == var2.field1543) {
                        this.field167[var3] = var2.field1542;
                        if (var2.field1542 == null) {
                            this.field249[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1540 == 93 && this.field194.method205(var2.field1543, 0)) {
                class2.method14(this.field194, new class53(var2.field1542, -631), -524);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method40(int arg0, int arg1) {
        if (arg0 < 0) {
            signlink.wavevol = arg1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
    public final void method41(boolean arg0, boolean arg1) {
        this.field344 &= arg1;
        if (field304.field830 >> 7 == this.field348 && field304.field831 >> 7 == this.field349) {
            this.field348 = 0;
        }
        int var3 = this.field418;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class8 var5;
            int var6;
            if (arg0) {
                var5 = field304;
                var6 = this.field416 << 14;
            } else {
                var5 = this.field417[this.field419[var4]];
                var6 = this.field419[var4] << 14;
            }
            if (var5 != null && var5.method188(true)) {
                var5.field610 = false;
                if ((field494 && this.field418 > 50 || this.field418 > 200) && !arg0 && var5.field808 == var5.field788) {
                    var5.field610 = true;
                }
                int var7 = var5.field830 >> 7;
                int var8 = var5.field831 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field620 != null && field291 >= var5.field608 && field291 < var5.field609) {
                        var5.field610 = false;
                        var5.field614 = this.method109(var5.field831, var5.field830, (byte) 55, this.field237);
                        this.field509.method296(60, var5.field830, var5.field831, var5.field832, var5.field622, var6, var5.field621, var5, var5.field614, var5.field624, var5.field623, -617, this.field237);
                    } else {
                        if ((var5.field830 & 127) == 64 && (var5.field831 & 127) == 64) {
                            if (this.field430[var7][var8] == this.field554) {
                                continue;
                            }
                            this.field430[var7][var8] = this.field554;
                        }
                        var5.field614 = this.method109(var5.field831, var5.field830, (byte) 55, this.field237);
                        this.field509.method295(var5.field831, var6, 8, this.field237, var5.field830, var5, 60, var5.field832, var5.field801, var5.field614);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method42(int arg0) {
        class63.field1601.method232();
        class63.field1574.method232();
        if (arg0 != 0) {
            field552 = -73;
        }
        class66.field1622.method232();
        class67.field1670.method232();
        class67.field1679.method232();
        class8.field612.method232();
        class45.field1319.method232();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILTPUDHOHI;)V")
    public final void method43(byte arg0, int arg1, int arg2, class52 arg3) {
        if (arg3 != null) {
            int var5 = this.field298 + this.field295 & 2047;
            int var6 = arg1 * arg1 + arg2 * arg2;
            if (arg0 == 5) {
                boolean var7 = false;
            } else {
                this.field92.method458(221);
            }
            if (var6 <= 6400) {
                int var8 = class25.field938[var5];
                int var9 = class25.field939[var5];
                int var10 = var8 * 256 / (this.field547 + 256);
                int var11 = var9 * 256 / (this.field547 + 256);
                int var12 = arg1 * var10 + arg2 * var11 >> 16;
                int var13 = arg1 * var11 - arg2 * var10 >> 16;
                if (var6 > 2500) {
                    arg3.method454(83 - var13 - arg3.field1437 / 2 - 4, var12 + 94 - arg3.field1436 / 2 + 4, this.field218, (byte) 4);
                } else {
                    arg3.method448(var12 + 94 - arg3.field1436 / 2 + 4, 83 - var13 - arg3.field1437 / 2 - 4, 714);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method44(int arg0) {
        this.field525.method541((byte) 3);
        if (this.field568 == 2) {
            byte[] var2 = this.field218.field1523;
            int[] var3 = class35.field1110;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field390.method452(0, this.field402, 25, 256, 33, 33, 25, 0, (byte) 1, this.field452, this.field295);
            this.field526.method541((byte) 3);
            class49.field1385 = this.field458;
        } else {
            int var6 = this.field298 + this.field295 & 2047;
            int var7 = field304.field830 / 32 + 48;
            int var8 = 464 - field304.field831 / 32;
            this.field350.method452(25, this.field136, var7, this.field547 + 256, 151, 146, var8, 5, (byte) 1, this.field208, var6);
            this.field258 += arg0;
            this.field390.method452(0, this.field402, 25, 256, 33, 33, 25, 0, (byte) 1, this.field452, this.field295);
            for (int var9 = 0; var9 < this.field461; ++var9) {
                int var39 = this.field462[var9] * 4 + 2 - field304.field830 / 32;
                int var40 = this.field463[var9] * 4 + 2 - field304.field831 / 32;
                this.method43((byte) 5, var40, var39, this.field132[var9]);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class7 var36 = this.field137[this.field237][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field304.field830 / 32;
                        int var38 = var35 * 4 + 2 - field304.field831 / 32;
                        this.method43((byte) 5, var38, var37, this.field322);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field127; ++var11) {
                class15 var31 = this.field126[this.field128[var11]];
                if (var31 != null && var31.method188(true)) {
                    class66 var32 = var31.field709;
                    if (var32.field1638 != null) {
                        var32 = var32.method568(this.field579);
                    }
                    if (var32 != null && var32.field1633 && var32.field1634) {
                        int var33 = var31.field830 / 32 - field304.field830 / 32;
                        int var34 = var31.field831 / 32 - field304.field831 / 32;
                        this.method43((byte) 5, var34, var33, this.field323);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field418; ++var12) {
                class8 var23 = this.field417[this.field419[var12]];
                if (var23 != null && var23.method188(true)) {
                    int var24 = var23.field830 / 32 - field304.field830 / 32;
                    int var25 = var23.field831 / 32 - field304.field831 / 32;
                    boolean var26 = false;
                    long var27 = class41.method405(var23.field615);
                    for (int var29 = 0; var29 < this.field564; ++var29) {
                        if (this.field241[var29] == var27 && this.field131[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field304.field600 != 0 && var23.field600 != 0 && field304.field600 == var23.field600) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method43((byte) 5, var25, var24, this.field325);
                    } else if (var30) {
                        this.method43((byte) 5, var25, var24, this.field326);
                    } else {
                        this.method43((byte) 5, var25, var24, this.field324);
                    }
                }
            }
            if (this.field206 != 0 && field291 % 20 < 10) {
                if (this.field206 == 1 && this.field252 >= 0 && this.field252 < this.field126.length) {
                    class15 var13 = this.field126[this.field252];
                    if (var13 != null) {
                        int var14 = var13.field830 / 32 - field304.field830 / 32;
                        int var15 = var13.field831 / 32 - field304.field831 / 32;
                        this.method88(this.field254, true, var15, var14);
                    }
                }
                if (this.field206 == 2) {
                    int var16 = (this.field440 - this.field472) * 4 + 2 - field304.field830 / 32;
                    int var17 = (this.field441 - this.field473) * 4 + 2 - field304.field831 / 32;
                    this.method88(this.field254, true, var17, var16);
                }
                if (this.field206 == 10 && this.field543 >= 0 && this.field543 < this.field417.length) {
                    class8 var18 = this.field417[this.field543];
                    if (var18 != null) {
                        int var19 = var18.field830 / 32 - field304.field830 / 32;
                        int var20 = var18.field831 / 32 - field304.field831 / 32;
                        this.method88(this.field254, true, var20, var19);
                    }
                }
            }
            if (this.field348 != 0) {
                int var21 = this.field348 * 4 + 2 - field304.field830 / 32;
                int var22 = this.field349 * 4 + 2 - field304.field831 / 32;
                this.method43((byte) 5, var22, var21, this.field253);
            }
            class35.method345(3, 0, 16777215, 97, 3, 78);
            this.field526.method541((byte) 3);
            class49.field1385 = this.field458;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method45(int arg0, int arg1) {
        if (arg1 < 6 || arg1 > 6) {
            this.field585 = !this.field585;
        }
        if (!field494) {
            for (int var3 = 0; var3 < this.field569.length; ++var3) {
                int var4 = this.field569[var3];
                if (class49.field1393[var4] >= arg0) {
                    class59 var5 = class49.field1387[var4];
                    int var6 = var5.field1526 * var5.field1525 - 1;
                    int var7 = this.field196 * var5.field1525 * 2;
                    byte[] var8 = var5.field1523;
                    byte[] var9 = this.field464;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1523 = var9;
                    this.field464 = var8;
                    class49.method431(var4, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (!this.field445 && !this.field499 && !this.field231) {
            ++field291;
            if (!this.field344) {
                this.method75(26091);
            } else {
                this.method51(-737);
            }
            this.method39(0);
            if (arg0 >= 0) {
                field345 = this.field592.method335();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILTQYMAXSO;)V")
    private final void method47(boolean arg0, int arg1, class53 arg2) {
        arg2.method478((byte) -43);
        int var4 = arg2.method479(1, (byte) 63);
        if (var4 != 0) {
            int var5 = arg2.method479(2, (byte) 63);
            if (!arg0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            if (var5 == 0) {
                this.field421[this.field420++] = this.field416;
            } else if (var5 == 1) {
                int var7 = arg2.method479(3, (byte) 63);
                field304.method226(this.field302, false, var7);
                int var8 = arg2.method479(1, (byte) 63);
                if (var8 == 1) {
                    this.field421[this.field420++] = this.field416;
                }
            } else if (var5 == 2) {
                int var9 = arg2.method479(3, (byte) 63);
                field304.method226(this.field302, true, var9);
                int var10 = arg2.method479(3, (byte) 63);
                field304.method226(this.field302, true, var10);
                int var11 = arg2.method479(1, (byte) 63);
                if (var11 == 1) {
                    this.field421[this.field420++] = this.field416;
                }
            } else if (var5 == 3) {
                this.field237 = arg2.method479(2, (byte) 63);
                int var12 = arg2.method479(7, (byte) 63);
                int var13 = arg2.method479(7, (byte) 63);
                int var14 = arg2.method479(1, (byte) 63);
                int var15 = arg2.method479(1, (byte) 63);
                if (var15 == 1) {
                    this.field421[this.field420++] = this.field416;
                }
                field304.method227(var14 == 1, var12, true, var13);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method48(int arg0) {
        if (this.field367 != 0) {
            class71 var2 = this.field164;
            int var3 = 0;
            if (this.field275 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field394[var4] != null) {
                    int var6 = this.field392[var4];
                    String var7 = this.field393[var4];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field403 == 0 || this.field403 == 1 && this.method65(var7, false))) {
                        int var9 = 329 - var3 * 13;
                        byte var10 = 4;
                        var2.method594(var9, 0, "From", 914, var10);
                        var2.method594(var9 - 1, 65535, "From", 914, var10);
                        int var11 = var10 + var2.method592(-6377, "From ");
                        if (var8 == 1) {
                            this.field162[0].method539(var11, var9 - 12, 714);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field162[1].method539(var11, var9 - 12, 714);
                            var11 += 14;
                        }
                        var2.method594(var9, 0, var7 + ": " + this.field394[var4], 914, var11);
                        var2.method594(var9 - 1, 65535, var7 + ": " + this.field394[var4], 914, var11);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field403 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method594(var12, 0, this.field394[var4], 914, 4);
                        var2.method594(var12 - 1, 65535, this.field394[var4], 914, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field403 < 2) {
                        int var13 = 329 - var3 * 13;
                        var2.method594(var13, 0, "To " + var7 + ": " + this.field394[var4], 914, 4);
                        var2.method594(var13 - 1, 65535, "To " + var7 + ": " + this.field394[var4], 914, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            while (arg0 >= 0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLOMJBPTVL;)Z")
    public final boolean method49(byte arg0, class37 arg1) {
        int var3 = arg1.field1191;
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field409[this.field455] = "Remove @whi@" + arg1.field1184;
                this.field537[this.field455] = 366;
                ++this.field455;
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
            this.field409[this.field455] = "Remove @whi@" + this.field389[var3];
            this.field537[this.field455] = 978;
            ++this.field455;
            this.field409[this.field455] = "Message @whi@" + this.field389[var3];
            this.field537[this.field455] = 34;
            ++this.field455;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method50(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this.field137 = null;
        }
        Graphics var3 = this.method167(0).getGraphics();
        var3.setColor(Color.black);
        var3.fillRect(0, 0, 765, 503);
        this.method417(-177, 1);
        if (this.field499) {
            this.field550 = false;
            var3.setFont(new Font("Helvetica", 1, 16));
            var3.setColor(Color.yellow);
            byte var4 = 35;
            var3.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
            int var6 = var4 + 50;
            var3.setColor(Color.white);
            var3.drawString("To fix this try the following (in order):", 30, var6);
            int var7 = var6 + 50;
            var3.setColor(Color.white);
            var3.setFont(new Font("Helvetica", 1, 12));
            var3.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
            int var8 = var7 + 30;
            var3.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
            int var9 = var8 + 30;
            var3.drawString("3: Try using a different game-world", 30, var9);
            int var11 = var9 + 30;
            var3.drawString("4: Try rebooting your computer", 30, var11);
            int var13 = var11 + 30;
            var3.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
        }
        if (this.field231) {
            this.field550 = false;
            var3.setFont(new Font("Helvetica", 1, 20));
            var3.setColor(Color.white);
            var3.drawString("Error - unable to load game!", 50, 50);
            var3.drawString("To play RuneScape make sure you play from", 50, 100);
            var3.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field445) {
            this.field550 = false;
            var3.setColor(Color.yellow);
            byte var5 = 35;
            var3.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
            int var10 = var5 + 50;
            var3.setColor(Color.white);
            var3.drawString("To fix this try the following (in order):", 30, var10);
            int var12 = var10 + 50;
            var3.setColor(Color.white);
            var3.setFont(new Font("Helvetica", 1, 12));
            var3.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
            int var14 = var12 + 30;
            var3.drawString("2: Try rebooting your computer, and reloading", 30, var14);
            int var15 = var14 + 30;
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (this.field275 > 1) {
            --this.field275;
        }
        if (this.field262 > 0) {
            --this.field262;
        }
        for (int var2 = 0; var2 < 5 && this.method34(72); ++var2) {
        }
        if (arg0 >= 0) {
            this.field368 = !this.field368;
        }
        if (this.field344) {
            Object var3 = this.field450.field1610;
            synchronized (this.field450.field1610) {
                if (!field360) {
                    this.field450.field1609 = 0;
                } else if (super.field1352 != 0 || this.field450.field1609 >= 40) {
                    this.field92.method457(525, 0);
                    this.field92.method458(0);
                    int var4 = this.field92.field1457;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field450.field1609 && var4 - this.field92.field1457 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field450.field1613[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field450.field1612[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field450.field1613[var6] == -1 && this.field450.field1612[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field519 == var8 && this.field520 == var7) {
                            if (this.field469 < 2047) {
                                ++this.field469;
                            }
                        } else {
                            int var10 = var8 - this.field519;
                            this.field519 = var8;
                            int var11 = var7 - this.field520;
                            this.field520 = var7;
                            if (this.field469 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field92.method459((this.field469 << 12) + (var10 << 6) + var11);
                                this.field469 = 0;
                            } else if (this.field469 < 8) {
                                this.field92.method461((this.field469 << 19) + 8388608 + var9);
                                this.field469 = 0;
                            } else {
                                this.field92.method462((this.field469 << 19) + -1073741824 + var9);
                                this.field469 = 0;
                            }
                        }
                    }
                    this.field92.method467(this.field92.field1457 - var4, this.field263);
                    if (var5 >= this.field450.field1609) {
                        this.field450.field1609 = 0;
                    } else {
                        this.field450.field1609 -= var5;
                        for (int var12 = 0; var12 < this.field450.field1609; ++var12) {
                            this.field450.field1612[var12] = this.field450.field1612[var5 + var12];
                            this.field450.field1613[var12] = this.field450.field1613[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1352 != 0) {
                long var13 = (super.field1355 - this.field266) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field266 = super.field1355;
                int var15 = super.field1354;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1353;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1352 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field92.method457(525, 3);
                this.field92.method501((var18 << 19) + (var19 << 20) + var17, false);
            }
            if (this.field149 > 0) {
                --this.field149;
            }
            if (super.field1356[1] == 1 || super.field1356[2] == 1 || super.field1356[3] == 1 || super.field1356[4] == 1) {
                this.field150 = true;
            }
            if (this.field150 && this.field149 <= 0) {
                this.field149 = 20;
                this.field150 = false;
                this.field92.method457(525, 83);
                this.field92.method493(0, this.field294);
                this.field92.method493(0, this.field295);
            }
            if (super.field1343 && !this.field356) {
                this.field356 = true;
                this.field92.method457(525, 174);
                this.field92.method458(1);
            }
            if (!super.field1343 && this.field356) {
                this.field356 = false;
                this.field92.method457(525, 174);
                this.field92.method458(0);
            }
            this.method147(8);
            this.method175(true);
            this.method35(this.field411);
            ++this.field260;
            if (this.field260 > 750) {
                this.method60(false);
            }
            this.method100((byte) -61);
            this.method121(true);
            this.method171(1041);
            ++this.field196;
            if (this.field480 != 0) {
                this.field479 += 20;
                if (this.field479 >= 400) {
                    this.field480 = 0;
                }
            }
            if (this.field575 != 0) {
                ++this.field572;
                if (this.field572 >= 15) {
                    if (this.field575 == 2) {
                        this.field288 = true;
                    }
                    if (this.field575 == 3) {
                        this.field168 = true;
                    }
                    this.field575 = 0;
                }
            }
            if (this.field381 != 0) {
                ++this.field399;
                if (super.field1346 > this.field382 + 5 || super.field1346 < this.field382 - 5 || super.field1347 > this.field383 + 5 || super.field1347 < this.field383 - 5) {
                    this.field561 = true;
                }
                if (super.field1345 == 0) {
                    if (this.field381 == 2) {
                        this.field288 = true;
                    }
                    if (this.field381 == 3) {
                        this.field168 = true;
                    }
                    this.field381 = 0;
                    if (this.field561 && this.field399 >= 5) {
                        this.field175 = -1;
                        this.method157(-411);
                        if (this.field379 == this.field175 && this.field380 != this.field174) {
                            class37 var20 = class37.method359(this.field379);
                            byte var21 = 0;
                            if (this.field510 == 1 && var20.field1191 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1167[this.field174] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1138) {
                                int var22 = this.field380;
                                int var23 = this.field174;
                                var20.field1167[var23] = var20.field1167[var22];
                                var20.field1209[var23] = var20.field1209[var22];
                                var20.field1167[var22] = -1;
                                var20.field1209[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field380;
                                int var25 = this.field174;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method356(var24 - 1, 0, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method356(var24 + 1, 0, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method356(this.field174, 0, this.field380);
                            }
                            this.field92.method457(525, 97);
                            this.field92.method494(this.field174, this.field397);
                            this.field92.method494(this.field379, this.field397);
                            this.field92.method484(var21, false);
                            this.field92.method495(this.field380, 0);
                        }
                    } else if ((this.field88 == 1 || this.method37(671, this.field455 - 1)) && this.field455 > 2) {
                        this.method164((byte) 69);
                    } else if (this.field455 > 0) {
                        this.method163(this.field455 - 1, 338);
                    }
                    this.field572 = 10;
                    super.field1352 = 0;
                }
            }
            if (class32.field1052 != -1) {
                int var26 = class32.field1052;
                int var27 = class32.field1053;
                boolean var28 = this.method73(0, 0, 2, 0, true, 0, 0, field304.field828[0], var27, 0, var26, field304.field827[0]);
                class32.field1052 = -1;
                if (var28) {
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 1;
                    this.field479 = 0;
                }
            }
            if (super.field1352 == 1 && this.field320 != null) {
                this.field320 = null;
                this.field168 = true;
                super.field1352 = 0;
            }
            this.method162(-313);
            if (this.field369 == -1) {
                this.method36(791);
                this.method68(this.field265);
                this.method116(this.field518);
            }
            if (super.field1345 == 1 || super.field1352 == 1) {
                ++this.field347;
            }
            if (this.field269 == 0 && this.field495 == 0 && this.field386 == 0) {
                if (this.field245 > 0) {
                    --this.field245;
                }
            } else if (this.field245 < 100) {
                ++this.field245;
                if (this.field245 == 100) {
                    if (this.field269 != 0) {
                        this.field168 = true;
                    }
                    if (this.field495 != 0) {
                        this.field288 = true;
                    }
                }
            }
            if (this.field90 == 2) {
                this.method59(680);
            }
            if (this.field90 == 2 && this.field95) {
                this.method120((byte) -2);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field115[var29]++;
            }
            this.method146((byte) -33);
            ++super.field1344;
            if (super.field1344 > 4500) {
                this.field262 = 250;
                super.field1344 -= 500;
                this.field92.method457(525, 61);
            }
            ++this.field439;
            if (this.field439 > 500) {
                this.field439 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field215 += this.field216;
                }
                if ((var30 & 2) == 2) {
                    this.field171 += this.field172;
                }
                if ((var30 & 4) == 4) {
                    this.field276 += this.field277;
                }
            }
            if (this.field215 < -50) {
                this.field216 = 2;
            }
            if (this.field215 > 50) {
                this.field216 = -2;
            }
            if (this.field171 < -55) {
                this.field172 = 2;
            }
            if (this.field171 > 55) {
                this.field172 = -2;
            }
            if (this.field276 < -40) {
                this.field277 = 1;
            }
            if (this.field276 > 40) {
                this.field277 = -1;
            }
            ++this.field250;
            if (this.field250 > 500) {
                this.field250 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field298 += this.field299;
                }
                if ((var31 & 2) == 2) {
                    this.field547 += this.field548;
                }
            }
            if (this.field298 < -60) {
                this.field299 = 2;
            }
            if (this.field298 > 60) {
                this.field299 = -2;
            }
            if (this.field547 < -20) {
                this.field548 = 1;
            }
            if (this.field547 > 10) {
                this.field548 = -1;
            }
            ++this.field261;
            if (this.field261 > 50) {
                this.field92.method457(525, 235);
            }
            try {
                if (this.field107 != null && this.field92.field1457 > 0) {
                    this.field107.method277(this.field92.field1457, (byte) 5, 0, this.field92.field1456);
                    this.field92.field1457 = 0;
                    this.field261 = 0;
                }
            } catch (IOException var33) {
                this.method60(false);
            } catch (Exception var34) {
                this.method53((byte) 6);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)I")
    public final int method52(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = 256 - arg2;
        if (arg3) {
            this.field423 = this.field592.method335();
        }
        return ((arg0 & 16711935) * arg2 + (arg1 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg2 + (arg1 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method53(byte arg0) {
        try {
            if (this.field107 != null) {
                this.field107.method273();
            }
        } catch (Exception var4) {
        }
        this.field107 = null;
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field423 = 321;
        }
        this.field344 = false;
        this.field121 = 0;
        this.field448 = "";
        this.field449 = "";
        this.method42(0);
        this.field509.method284(true);
        for (int var3 = 0; var3 < 4; ++var3) {
            this.field533[var3].method515();
        }
        System.gc();
        this.method33(0);
        this.field189 = -1;
        this.field141 = -1;
        this.field284 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method54(String arg0, int arg1, String arg2) {
        int var4 = 30 / arg1;
        if (this.field526 != null) {
            this.field526.method541((byte) 3);
            class49.field1385 = this.field458;
            int var5 = 151;
            if (arg2 != null) {
                var5 -= 7;
            }
            this.field164.method590(0, 0, 257, arg0, var5);
            this.field164.method590(0, 16777215, 256, arg0, var5 - 1);
            var5 += 15;
            if (arg2 != null) {
                this.field164.method590(0, 0, 257, arg2, var5);
                this.field164.method590(0, 16777215, 256, arg2, var5 - 1);
            }
            this.field526.method542(7, 4, 4, super.field1338);
        } else if (super.field1339 != null) {
            super.field1339.method541((byte) 3);
            class49.field1385 = this.field459;
            int var6 = 251;
            short var7 = 300;
            byte var8 = 50;
            class35.method345(var7, 0, 0, 383 - var7 / 2, var8, var6 - 5 - var8 / 2);
            class35.method346(383 - var7 / 2, 16777215, var6 - 5 - var8 / 2, 903, var7, var8);
            if (arg2 != null) {
                var6 -= 7;
            }
            this.field164.method590(0, 0, 383, arg0, var6);
            this.field164.method590(0, 16777215, 382, arg0, var6 - 1);
            var6 += 15;
            if (arg2 != null) {
                this.field164.method590(0, 0, 383, arg2, var6);
                this.field164.method590(0, 16777215, 382, arg2, var6 - 1);
            }
            super.field1339.method542(7, 0, 0, super.field1338);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method55(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field161 >= 100) {
                this.method133("", "Your ignore list is full. Max of 100 hit", (byte) -30, 0);
            } else {
                String var4 = class41.method409(-354, class41.method406(arg0, (byte) 1));
                if (arg1 == 4) {
                    for (int var5 = 0; var5 < this.field161; ++var5) {
                        if (this.field319[var5] == arg0) {
                            this.method133("", var4 + " is already on your ignore list", (byte) -30, 0);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field564; ++var6) {
                        if (this.field241[var6] == arg0) {
                            this.method133("", "Please remove " + var4 + " from your friend list first", (byte) -30, 0);
                            return;
                        }
                    }
                    this.field319[this.field161++] = arg0;
                    this.field288 = true;
                    this.field92.method457(525, 240);
                    this.field92.method464(66, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
    public final boolean method56(int arg0, byte arg1, int arg2) {
        if (arg1 == 4) {
            boolean var4 = false;
        } else {
            this.field498 = !this.field498;
        }
        boolean var5 = false;
        class37 var6 = class37.method359(arg0);
        for (int var7 = 0; var7 < var6.field1155.length && var6.field1155[var7] != -1; ++var7) {
            class37 var8 = class37.method359(var6.field1155[var7]);
            if (var8.field1145 == 0) {
                var5 |= this.method56(var8.field1202, (byte) 4, arg2);
            }
            if (var8.field1145 == 6 && (var8.field1193 != -1 || var8.field1194 != -1)) {
                boolean var9 = this.method105(var8, -642);
                int var10;
                if (var9) {
                    var10 = var8.field1194;
                } else {
                    var10 = var8.field1193;
                }
                if (var10 != -1) {
                    class30 var11 = class30.field982[var10];
                    var8.field1158 += arg2;
                    while (var8.field1158 > var11.method280(-204, var8.field1166)) {
                        var8.field1158 -= var11.method280(-204, var8.field1166) + 1;
                        ++var8.field1166;
                        if (var8.field1166 >= var11.field983) {
                            var8.field1166 -= var11.field987;
                            if (var8.field1166 < 0 || var8.field1166 >= var11.field983) {
                                var8.field1166 = 0;
                            }
                        }
                        var5 = true;
                    }
                }
            }
            if (var8.field1145 == 6 && var8.field1160 != 0) {
                int var12 = var8.field1160 >> 16;
                int var13 = var8.field1160 << 16 >> 16;
                int var14 = arg2 * var12;
                int var15 = arg2 * var13;
                var8.field1151 = var8.field1151 + var14 & 2047;
                var8.field1152 = var8.field1152 + var15 & 2047;
                var5 = true;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Z")
    public final boolean method57(int arg0) {
        while (arg0 >= 0) {
            this.field195 = 335;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method58(int arg0) {
        while (arg0 >= 0) {
            field398 = 1;
        }
        this.field353 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field550) {
                ++this.field342;
                this.method96(this.field490);
                this.method96(this.field490);
                this.method29(false);
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
        this.field353 = false;
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method59(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            int var3 = field304.field830 + this.field215;
            int var4 = field304.field831 + this.field171;
            if (this.field147 - var3 < -500 || this.field147 - var3 > 500 || this.field148 - var4 < -500 || this.field148 - var4 > 500) {
                this.field147 = var3;
                this.field148 = var4;
            }
            if (this.field147 != var3) {
                this.field147 += (var3 - this.field147) / 16;
            }
            if (this.field148 != var4) {
                this.field148 += (var4 - this.field148) / 16;
            }
            if (super.field1356[1] == 1) {
                this.field296 += (-24 - this.field296) / 2;
            } else if (super.field1356[2] == 1) {
                this.field296 += (24 - this.field296) / 2;
            } else {
                this.field296 /= 2;
            }
            if (super.field1356[3] == 1) {
                this.field297 += (12 - this.field297) / 2;
            } else if (super.field1356[4] == 1) {
                this.field297 += (-12 - this.field297) / 2;
            } else {
                this.field297 /= 2;
            }
            this.field295 = this.field296 / 2 + this.field295 & 2047;
            this.field294 += this.field297 / 2;
            if (this.field294 < 128) {
                this.field294 = 128;
            }
            if (this.field294 > 383) {
                this.field294 = 383;
            }
            int var5 = this.field147 >> 7;
            int var6 = this.field148 >> 7;
            int var7 = this.method109(this.field148, this.field147, (byte) 55, this.field237);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field237;
                        if (var11 < 3 && (this.field352[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field278[var11][var9][var10];
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
            if (var13 > this.field202) {
                this.field202 += (var13 - this.field202) / 24;
            } else if (var13 < this.field202) {
                this.field202 += (var13 - this.field202) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field304.field830 + "," + field304.field831 + "," + this.field147 + "," + this.field148 + "," + this.field116 + "," + this.field117 + "," + this.field472 + "," + this.field473);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method60(boolean arg0) {
        if (this.field262 > 0) {
            this.method53((byte) 6);
        } else {
            this.method54("Connection lost", 685, "Please wait - attempting to reestablish");
            this.field568 = 0;
            this.field348 = 0;
            class29 var2 = this.field107;
            this.field344 = false;
            if (arg0) {
                this.field137 = null;
            }
            this.field576 = 0;
            this.method173(this.field448, this.field449, true);
            if (!this.field344) {
                this.method53((byte) 6);
            }
            try {
                var2.method273();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public final void method61(int arg0, byte arg1, String arg2) {
        this.field233 = arg0;
        this.field96 = arg2;
        this.method168((byte) 3);
        if (this.field435 == null) {
            super.method61(arg0, (byte) -127, arg2);
        } else {
            this.field153.method541((byte) 3);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field165.method590(0, 16777215, var4 / 2, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            class35.method346(var4 / 2 - 152, 9179409, var7, 903, 304, 34);
            class35.method346(var4 / 2 - 151, 0, var7 + 1, 903, 302, 32);
            class35.method345(arg0 * 3, 0, 9179409, var4 / 2 - 150, 30, var7 + 2);
            class35.method345(300 - arg0 * 3, 0, 0, arg0 * 3 + (var4 / 2 - 150), 30, var7 + 2);
            this.field165.method590(0, 16777215, var4 / 2, arg2, var5 / 2 + 5 - var6);
            this.field153.method542(7, 171, 202, super.field1338);
            if (arg1 == -127) {
                if (this.field251) {
                    this.field251 = false;
                    if (!this.field550) {
                        this.field154.method542(7, 0, 0, super.field1338);
                        this.field155.method542(7, 0, 637, super.field1338);
                    }
                    this.field151.method542(7, 0, 128, super.field1338);
                    this.field152.method542(7, 371, 202, super.field1338);
                    this.field156.method542(7, 265, 0, super.field1338);
                    this.field157.method542(7, 265, 562, super.field1338);
                    this.field158.method542(7, 171, 128, super.field1338);
                    this.field159.method542(7, 171, 562, super.field1338);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILOMJBPTVL;III)V")
    public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, class37 arg5, int arg6, int arg7, int arg8) {
        if (this.field354) {
            this.field207 = 32;
        } else {
            this.field207 = 0;
        }
        this.field354 = false;
        if (this.field146 != arg3) {
            this.field259 = -1;
        }
        if (arg8 >= arg1 && arg8 < arg1 + 16 && arg4 >= arg7 && arg4 < arg7 + 16) {
            arg5.field1198 -= this.field347 * 4;
            if (arg6 == 1) {
                this.field288 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field168 = true;
            }
        } else if (arg8 >= arg1 && arg8 < arg1 + 16 && arg4 >= arg0 + arg7 - 16 && arg4 < arg0 + arg7) {
            arg5.field1198 += this.field347 * 4;
            if (arg6 == 1) {
                this.field288 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field168 = true;
            }
        } else if (arg8 >= arg1 - this.field207 && arg8 < arg1 + 16 + this.field207 && arg4 >= arg7 + 16 && arg4 < arg0 + arg7 - 16 && this.field347 > 0) {
            int var10 = (arg0 - 32) * arg0 / arg2;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg4 - arg7 - 16 - var10 / 2;
            int var12 = arg0 - 32 - var10;
            arg5.field1198 = (arg2 - arg0) * var11 / var12;
            if (arg6 == 1) {
                this.field288 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field168 = true;
            }
            this.field354 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 7) {
            this.field259 = -1;
        }
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg6 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = class25.field938[var8];
            int var14 = class25.field939[var8];
            int var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class25.field938[var9];
            int var17 = class25.field939[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field372 = arg5 - var10;
        this.field373 = arg4 - var11;
        this.field374 = arg0 - var12;
        this.field375 = arg3;
        this.field376 = arg6;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIILOMJBPTVL;II)V")
    public final void method64(int arg0, int arg1, byte arg2, int arg3, int arg4, class37 arg5, int arg6, int arg7) {
        if (arg5.field1145 == 0 && arg5.field1155 != null && !arg5.field1173) {
            if (arg3 >= arg0 && arg7 >= arg1 && arg3 <= arg5.field1201 + arg0 && arg7 <= arg5.field1174 + arg1) {
                int var9 = arg5.field1155.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var13 = arg5.field1200[var10] + arg0;
                    int var14 = arg5.field1190[var10] + arg1 - arg4;
                    class37 var15 = class37.method359(arg5.field1155[var10]);
                    int var16 = var15.field1149 + var13;
                    int var17 = var15.field1199 + var14;
                    if ((var15.field1154 >= 0 || var15.field1211 != 0) && arg3 >= var16 && arg7 >= var17 && arg3 < var15.field1201 + var16 && arg7 < var15.field1174 + var17) {
                        if (var15.field1154 >= 0) {
                            this.field407 = var15.field1154;
                        } else {
                            this.field407 = var15.field1202;
                        }
                    }
                    if (var15.field1145 == 8 && arg3 >= var16 && arg7 >= var17 && arg3 < var15.field1201 + var16 && arg7 < var15.field1174 + var17) {
                        this.field551 = var15.field1202;
                    }
                    if (var15.field1145 == 0) {
                        this.method64(var16, var17, (byte) 0, arg3, var15.field1198, var15, arg6, arg7);
                        if (var15.field1197 > var15.field1174) {
                            this.method62(var15.field1174, var15.field1201 + var16, var15.field1197, -10523, arg7, var15, arg6, var17, arg3);
                        }
                    } else {
                        if (var15.field1163 == 1 && arg3 >= var16 && arg7 >= var17 && arg3 < var15.field1201 + var16 && arg7 < var15.field1174 + var17) {
                            boolean var18 = false;
                            if (var15.field1191 != 0) {
                                var18 = this.method49((byte) 0, var15);
                            }
                            if (!var18) {
                                this.field409[this.field455] = var15.field1140;
                                this.field537[this.field455] = 451;
                                this.field536[this.field455] = var15.field1202;
                                ++this.field455;
                            }
                        }
                        if (var15.field1163 == 2 && this.field431 == 0 && arg3 >= var16 && arg7 >= var17 && arg3 < var15.field1201 + var16 && arg7 < var15.field1174 + var17) {
                            String var19 = var15.field1168;
                            if (var19.indexOf(" ") != -1) {
                                var19 = var19.substring(0, var19.indexOf(" "));
                            }
                            this.field409[this.field455] = var19 + " @gre@" + var15.field1185;
                            this.field537[this.field455] = 746;
                            this.field536[this.field455] = var15.field1202;
                            ++this.field455;
                        }
                        if (var15.field1163 == 3 && arg3 >= var16 && arg7 >= var17 && arg3 < var15.field1201 + var16 && arg7 < var15.field1174 + var17) {
                            this.field409[this.field455] = "Close";
                            if (arg6 == 3) {
                                this.field537[this.field455] = 424;
                            } else {
                                this.field537[this.field455] = 618;
                            }
                            this.field536[this.field455] = var15.field1202;
                            ++this.field455;
                        }
                        if (var15.field1163 == 4 && arg3 >= var16 && arg7 >= var17 && arg3 < var15.field1201 + var16 && arg7 < var15.field1174 + var17) {
                            this.field409[this.field455] = var15.field1140;
                            this.field537[this.field455] = 226;
                            this.field536[this.field455] = var15.field1202;
                            ++this.field455;
                        }
                        if (var15.field1163 == 5 && arg3 >= var16 && arg7 >= var17 && arg3 < var15.field1201 + var16 && arg7 < var15.field1174 + var17) {
                            this.field409[this.field455] = var15.field1140;
                            this.field537[this.field455] = 737;
                            this.field536[this.field455] = var15.field1202;
                            ++this.field455;
                        }
                        if (var15.field1163 == 6 && !this.field497 && arg3 >= var16 && arg7 >= var17 && arg3 < var15.field1201 + var16 && arg7 < var15.field1174 + var17) {
                            this.field409[this.field455] = var15.field1140;
                            this.field537[this.field455] = 655;
                            this.field536[this.field455] = var15.field1202;
                            ++this.field455;
                        }
                        if (var15.field1145 == 2) {
                            int var20 = 0;
                            for (int var21 = 0; var21 < var15.field1174; ++var21) {
                                for (int var22 = 0; var22 < var15.field1201; ++var22) {
                                    int var23 = (var15.field1153 + 32) * var22 + var16;
                                    int var24 = (var15.field1188 + 32) * var21 + var17;
                                    if (var20 < 20) {
                                        var23 += var15.field1143[var20];
                                        var24 += var15.field1159[var20];
                                    }
                                    if (arg3 >= var23 && arg7 >= var24 && arg3 < var23 + 32 && arg7 < var24 + 32) {
                                        this.field174 = var20;
                                        this.field175 = var15.field1202;
                                        if (var15.field1167[var20] > 0) {
                                            class67 var25 = class67.method575(var15.field1167[var20] - 1);
                                            if (this.field425 == 1 && var15.field1203) {
                                                if (this.field427 != var15.field1202 || this.field426 != var20) {
                                                    this.field409[this.field455] = "Use " + this.field429 + " with @lre@" + var25.field1709;
                                                    this.field537[this.field455] = 940;
                                                    this.field538[this.field455] = var25.field1661;
                                                    this.field535[this.field455] = var20;
                                                    this.field536[this.field455] = var15.field1202;
                                                    ++this.field455;
                                                }
                                            } else if (this.field431 == 1 && var15.field1203) {
                                                if ((this.field433 & 16) == 16) {
                                                    this.field409[this.field455] = this.field434 + " @lre@" + var25.field1709;
                                                    this.field537[this.field455] = 666;
                                                    this.field538[this.field455] = var25.field1661;
                                                    this.field535[this.field455] = var20;
                                                    this.field536[this.field455] = var15.field1202;
                                                    ++this.field455;
                                                }
                                            } else {
                                                if (var15.field1203) {
                                                    for (int var26 = 4; var26 >= 3; --var26) {
                                                        if (var25.field1690 != null && var25.field1690[var26] != null) {
                                                            this.field409[this.field455] = var25.field1690[var26] + " @lre@" + var25.field1709;
                                                            if (var26 == 3) {
                                                                this.field537[this.field455] = 800;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field537[this.field455] = 529;
                                                            }
                                                            this.field538[this.field455] = var25.field1661;
                                                            this.field535[this.field455] = var20;
                                                            this.field536[this.field455] = var15.field1202;
                                                            ++this.field455;
                                                        } else if (var26 == 4) {
                                                            this.field409[this.field455] = "Drop @lre@" + var25.field1709;
                                                            this.field537[this.field455] = 529;
                                                            this.field538[this.field455] = var25.field1661;
                                                            this.field535[this.field455] = var20;
                                                            this.field536[this.field455] = var15.field1202;
                                                            ++this.field455;
                                                        }
                                                    }
                                                }
                                                if (var15.field1176) {
                                                    this.field409[this.field455] = "Use @lre@" + var25.field1709;
                                                    this.field537[this.field455] = 11;
                                                    this.field538[this.field455] = var25.field1661;
                                                    this.field535[this.field455] = var20;
                                                    this.field536[this.field455] = var15.field1202;
                                                    ++this.field455;
                                                }
                                                if (var15.field1203 && var25.field1690 != null) {
                                                    for (int var27 = 2; var27 >= 0; --var27) {
                                                        if (var25.field1690[var27] != null) {
                                                            this.field409[this.field455] = var25.field1690[var27] + " @lre@" + var25.field1709;
                                                            if (var27 == 0) {
                                                                this.field537[this.field455] = 8;
                                                            }
                                                            if (var27 == 1) {
                                                                this.field537[this.field455] = 581;
                                                            }
                                                            if (var27 == 2) {
                                                                this.field537[this.field455] = 197;
                                                            }
                                                            this.field538[this.field455] = var25.field1661;
                                                            this.field535[this.field455] = var20;
                                                            this.field536[this.field455] = var15.field1202;
                                                            ++this.field455;
                                                        }
                                                    }
                                                }
                                                if (var15.field1179 != null) {
                                                    for (int var28 = 4; var28 >= 0; --var28) {
                                                        if (var15.field1179[var28] != null) {
                                                            this.field409[this.field455] = var15.field1179[var28] + " @lre@" + var25.field1709;
                                                            if (var28 == 0) {
                                                                this.field537[this.field455] = 378;
                                                            }
                                                            if (var28 == 1) {
                                                                this.field537[this.field455] = 350;
                                                            }
                                                            if (var28 == 2) {
                                                                this.field537[this.field455] = 236;
                                                            }
                                                            if (var28 == 3) {
                                                                this.field537[this.field455] = 815;
                                                            }
                                                            if (var28 == 4) {
                                                                this.field537[this.field455] = 519;
                                                            }
                                                            this.field538[this.field455] = var25.field1661;
                                                            this.field535[this.field455] = var20;
                                                            this.field536[this.field455] = var15.field1202;
                                                            ++this.field455;
                                                        }
                                                    }
                                                }
                                                this.field409[this.field455] = "Examine @lre@" + var25.field1709;
                                                this.field537[this.field455] = 1107;
                                                this.field538[this.field455] = var25.field1661;
                                                this.field535[this.field455] = var20;
                                                this.field536[this.field455] = var15.field1202;
                                                ++this.field455;
                                            }
                                        }
                                    }
                                    ++var20;
                                }
                            }
                        }
                    }
                }
                if (this.field191 == arg2) {
                    boolean var11 = false;
                } else {
                    for (int var12 = 1; var12 > 0; ++var12) {
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method65(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field564; ++var3) {
                if (arg0.equalsIgnoreCase(this.field389[var3])) {
                    return true;
                }
            }
            if (arg1) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            return arg0.equalsIgnoreCase(field304.field615);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LOMJBPTVL;B)Z")
    public final boolean method66(class37 arg0, byte arg1) {
        if (arg1 != -69) {
            this.field259 = this.field327.method468();
        }
        int var3 = arg0.field1191;
        if (this.field565 == 2) {
            if (var3 == 201) {
                this.field168 = true;
                this.field437 = 0;
                this.field506 = true;
                this.field534 = "";
                this.field406 = 1;
                this.field438 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field168 = true;
                this.field437 = 0;
                this.field506 = true;
                this.field534 = "";
                this.field406 = 2;
                this.field438 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field262 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field168 = true;
                this.field437 = 0;
                this.field506 = true;
                this.field534 = "";
                this.field406 = 4;
                this.field438 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field168 = true;
                this.field437 = 0;
                this.field506 = true;
                this.field534 = "";
                this.field406 = 5;
                this.field438 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field485[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class9.field634 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class9.field634) {
                                var6 = 0;
                            }
                        }
                        if (!class9.field635[var6].field641 && class9.field635[var6].field636 == var4 + (this.field410 ? 0 : 7)) {
                            this.field485[var4] = var6;
                            this.field270 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field180[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field274[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field274[var7].length) {
                        var9 = 0;
                    }
                }
                this.field180[var7] = var9;
                this.field270 = true;
            }
            if (var3 == 324 && !this.field410) {
                this.field410 = true;
                this.method174(749);
            }
            if (var3 == 325 && this.field410) {
                this.field410 = false;
                this.method174(749);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field301 = !this.field301;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method119((byte) 2);
                    if (this.field371.length() > 0) {
                        this.field92.method457(525, 144);
                        this.field92.method464(66, class41.method405(this.field371));
                        this.field92.method458(var3 - 601);
                        this.field92.method458(this.field301 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field92.method457(525, 199);
                this.field92.method458(this.field410 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field92.method458(this.field485[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field92.method458(this.field180[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method67(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method68(byte arg0) {
        if (arg0 == -34) {
            if (super.field1352 == 1) {
                if (super.field1353 >= 539 && super.field1353 <= 573 && super.field1354 >= 169 && super.field1354 < 205 && this.field566[0] != -1) {
                    this.field288 = true;
                    this.field404 = 0;
                    this.field451 = true;
                }
                if (super.field1353 >= 569 && super.field1353 <= 599 && super.field1354 >= 168 && super.field1354 < 205 && this.field566[1] != -1) {
                    this.field288 = true;
                    this.field404 = 1;
                    this.field451 = true;
                }
                if (super.field1353 >= 597 && super.field1353 <= 627 && super.field1354 >= 168 && super.field1354 < 205 && this.field566[2] != -1) {
                    this.field288 = true;
                    this.field404 = 2;
                    this.field451 = true;
                }
                if (super.field1353 >= 625 && super.field1353 <= 669 && super.field1354 >= 168 && super.field1354 < 203 && this.field566[3] != -1) {
                    this.field288 = true;
                    this.field404 = 3;
                    this.field451 = true;
                }
                if (super.field1353 >= 666 && super.field1353 <= 696 && super.field1354 >= 168 && super.field1354 < 205 && this.field566[4] != -1) {
                    this.field288 = true;
                    this.field404 = 4;
                    this.field451 = true;
                }
                if (super.field1353 >= 694 && super.field1353 <= 724 && super.field1354 >= 168 && super.field1354 < 205 && this.field566[5] != -1) {
                    this.field288 = true;
                    this.field404 = 5;
                    this.field451 = true;
                }
                if (super.field1353 >= 722 && super.field1353 <= 756 && super.field1354 >= 169 && super.field1354 < 205 && this.field566[6] != -1) {
                    this.field288 = true;
                    this.field404 = 6;
                    this.field451 = true;
                }
                if (super.field1353 >= 540 && super.field1353 <= 574 && super.field1354 >= 466 && super.field1354 < 502 && this.field566[7] != -1) {
                    this.field288 = true;
                    this.field404 = 7;
                    this.field451 = true;
                }
                if (super.field1353 >= 572 && super.field1353 <= 602 && super.field1354 >= 466 && super.field1354 < 503 && this.field566[8] != -1) {
                    this.field288 = true;
                    this.field404 = 8;
                    this.field451 = true;
                }
                if (super.field1353 >= 599 && super.field1353 <= 629 && super.field1354 >= 466 && super.field1354 < 503 && this.field566[9] != -1) {
                    this.field288 = true;
                    this.field404 = 9;
                    this.field451 = true;
                }
                if (super.field1353 >= 627 && super.field1353 <= 671 && super.field1354 >= 467 && super.field1354 < 502 && this.field566[10] != -1) {
                    this.field288 = true;
                    this.field404 = 10;
                    this.field451 = true;
                }
                if (super.field1353 >= 669 && super.field1353 <= 699 && super.field1354 >= 466 && super.field1354 < 503 && this.field566[11] != -1) {
                    this.field288 = true;
                    this.field404 = 11;
                    this.field451 = true;
                }
                if (super.field1353 >= 696 && super.field1353 <= 726 && super.field1354 >= 466 && super.field1354 < 503 && this.field566[12] != -1) {
                    this.field288 = true;
                    this.field404 = 12;
                    this.field451 = true;
                }
                if (super.field1353 >= 724 && super.field1353 <= 758 && super.field1354 >= 466 && super.field1354 < 502 && this.field566[13] != -1) {
                    this.field288 = true;
                    this.field404 = 13;
                    this.field451 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LTQYMAXSO;IB)V")
    private final void method69(class53 arg0, int arg1, byte arg2) {
        if (this.field183 != arg2) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (arg0.field1458 + 10 < arg1 * 8) {
            int var5 = arg0.method479(11, (byte) 63);
            if (var5 == 2047) {
                break;
            }
            if (this.field417[var5] == null) {
                this.field417[var5] = new class8();
                if (this.field422[var5] != null) {
                    this.field417[var5].method187(-5329, this.field422[var5]);
                }
            }
            this.field419[this.field418++] = var5;
            class8 var6 = this.field417[var5];
            var6.field784 = field291;
            int var7 = arg0.method479(5, (byte) 63);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method479(1, (byte) 63);
            int var9 = arg0.method479(1, (byte) 63);
            if (var9 == 1) {
                this.field421[this.field420++] = var5;
            }
            int var10 = arg0.method479(5, (byte) 63);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.method227(var8 == 1, field304.field827[0] + var10, true, field304.field828[0] + var7);
        }
        arg0.method480(9);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIB)V")
    public final void method70(int arg0, int arg1, byte arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field394[var5] != null) {
                int var6 = this.field392[var5];
                int var7 = 70 - var4 * 14 + this.field119 + 4;
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field337 == 0 || this.field337 == 1 && this.method65(var8, false))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field304.field615)) {
                        if (this.field305 >= 1) {
                            this.field409[this.field455] = "Report abuse @whi@" + var8;
                            this.field537[this.field455] = 550;
                            ++this.field455;
                        }
                        this.field409[this.field455] = "Add ignore @whi@" + var8;
                        this.field537[this.field455] = 955;
                        ++this.field455;
                        this.field409[this.field455] = "Add friend @whi@" + var8;
                        this.field537[this.field455] = 646;
                        ++this.field455;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field367 == 0 && (var6 == 7 || this.field403 == 0 || this.field403 == 1 && this.method65(var8, false))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field305 >= 1) {
                            this.field409[this.field455] = "Report abuse @whi@" + var8;
                            this.field537[this.field455] = 550;
                            ++this.field455;
                        }
                        this.field409[this.field455] = "Add ignore @whi@" + var8;
                        this.field537[this.field455] = 955;
                        ++this.field455;
                        this.field409[this.field455] = "Add friend @whi@" + var8;
                        this.field537[this.field455] = 646;
                        ++this.field455;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field256 == 0 || this.field256 == 1 && this.method65(var8, false))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field409[this.field455] = "Accept trade @whi@" + var8;
                        this.field537[this.field455] = 365;
                        ++this.field455;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field367 == 0 && this.field403 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field256 == 0 || this.field256 == 1 && this.method65(var8, false))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field409[this.field455] = "Accept challenge @whi@" + var8;
                        this.field537[this.field455] = 355;
                        ++this.field455;
                    }
                    ++var4;
                }
            }
        }
        if (arg2 == 0) {
            boolean var12 = false;
        } else {
            this.field397 = this.field592.method335();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
    public final void method71(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method158();
        }
        this.method168((byte) 3);
        this.field153.method541((byte) 3);
        this.field104.method539(0, 0, 714);
        short var3 = 360;
        short var4 = 200;
        if (this.field121 == 0) {
            int var5 = var4 / 2 + 80;
            this.field163.method591(var5, var3 / 2, true, -918, this.field194.field732, 7711145);
            int var6 = var4 / 2 - 20;
            this.field165.method591(var6, var3 / 2, true, -918, "Welcome to RuneScape", 16776960);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field105.method539(var7 - 73, var8 - 20, 714);
            this.field165.method591(var8 + 5, var7, true, -918, "New User", 16777215);
            int var9 = var3 / 2 + 80;
            this.field105.method539(var9 - 73, var8 - 20, 714);
            this.field165.method591(var8 + 5, var9, true, -918, "Existing User", 16777215);
        }
        if (this.field121 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field134.length() > 0) {
                this.field165.method591(var10 - 15, var3 / 2, true, -918, this.field134, 16776960);
                this.field165.method591(var10, var3 / 2, true, -918, this.field135, 16776960);
                var10 += 30;
            } else {
                this.field165.method591(var10 - 7, var3 / 2, true, -918, this.field135, 16776960);
                var10 += 30;
            }
            this.field165.method598(0, 16777215, var3 / 2 - 90, true, var10, "Username: " + this.field448 + (this.field193 == 0 & field291 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            this.field165.method598(0, 16777215, var3 / 2 - 88, true, var10, "Password: " + class41.method410(false, this.field449) + (this.field193 == 1 & field291 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field105.method539(var11 - 73, var12 - 20, 714);
                this.field165.method591(var12 + 5, var11, true, -918, "Login", 16777215);
                int var13 = var3 / 2 + 80;
                this.field105.method539(var13 - 73, var12 - 20, 714);
                this.field165.method591(var12 + 5, var13, true, -918, "Cancel", 16777215);
            }
        }
        if (this.field121 == 3) {
            this.field165.method591(var4 / 2 - 60, var3 / 2, true, -918, "Create a free account", 16776960);
            int var14 = var4 / 2 - 35;
            this.field165.method591(var14, var3 / 2, true, -918, "To create a new account you need to", 16777215);
            int var18 = var14 + 15;
            this.field165.method591(var18, var3 / 2, true, -918, "go back to the main RuneScape webpage", 16777215);
            int var19 = var18 + 15;
            this.field165.method591(var19, var3 / 2, true, -918, "and choose the 'create account'", 16777215);
            int var20 = var19 + 15;
            this.field165.method591(var20, var3 / 2, true, -918, "button near the top of that page.", 16777215);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field105.method539(var15 - 73, var16 - 20, 714);
            this.field165.method591(var16 + 5, var15, true, -918, "Cancel", 16777215);
        }
        this.field153.method542(7, 171, 202, super.field1338);
        if (this.field251) {
            this.field251 = false;
            this.field151.method542(7, 0, 128, super.field1338);
            this.field152.method542(7, 371, 202, super.field1338);
            this.field156.method542(7, 265, 0, super.field1338);
            this.field157.method542(7, 265, 562, super.field1338);
            this.field158.method542(7, 171, 128, super.field1338);
            this.field159.method542(7, 171, 562, super.field1338);
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method72(int arg0) {
        int var2 = this.field512;
        int var3 = this.field513;
        int var4 = this.field514;
        int var5 = this.field515;
        int var6 = 6116423;
        class35.method345(var4, 0, var6, var2, var5, var3);
        class35.method345(var4 - 2, 0, 0, var2 + 1, 16, var3 + 1);
        class35.method346(var2 + 1, 0, var3 + 18, 903, var4 - 2, var5 - 19);
        this.field165.method594(var3 + 14, var6, "Choose Option", 914, var2 + 3);
        int var7 = super.field1346;
        int var8 = super.field1347;
        if (this.field511 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field511 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field511 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field455; ++var9) {
            int var10 = (this.field455 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field165.method598(0, var11, var2 + 3, true, var10, this.field409[var9]);
        }
        if (arg0 != -10414) {
            field552 = 87;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 363);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field491 = Integer.parseInt(arg0[0]);
                field492 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method134(216);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method118(field345);
                }
                if (arg0[3].equals("free")) {
                    field493 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field493 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method414(-31255, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIIIIIII)Z")
    public final boolean method73(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field214[var15][var39] = 0;
                this.field123[var15][var39] = 99999999;
            }
        }
        int var16 = arg11;
        int var17 = arg7;
        this.field214[arg11][arg7] = 99;
        this.field123[arg11][arg7] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field178[var18] = arg11;
        int var40 = var18 + 1;
        this.field179[var18] = arg7;
        boolean var20 = false;
        if (arg2 < this.field257 || arg2 > this.field257) {
            this.field137 = null;
        }
        int var21 = this.field178.length;
        int[][] var22 = this.field533[this.field237].field1480;
        while (var40 != var19) {
            var16 = this.field178[var19];
            var17 = this.field179[var19];
            var19 = (var19 + 1) % var21;
            if (arg10 == var16 && arg8 == var17) {
                var20 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && this.field533[this.field237].method524((byte) -83, var16, arg10, arg5, var17, arg1 - 1, arg8)) {
                    var20 = true;
                    break;
                }
                if (arg1 < 10 && this.field533[this.field237].method525(arg5, var17, arg1 - 1, arg8, arg10, this.field366, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg6 != 0 && this.field533[this.field237].method526((byte) 1, arg9, arg6, arg0, var16, var17, arg10, arg8)) {
                var20 = true;
                break;
            }
            int var38 = this.field123[var16][var17] + 1;
            if (var16 > 0 && this.field214[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field178[var40] = var16 - 1;
                this.field179[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field214[var16 - 1][var17] = 2;
                this.field123[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field214[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field178[var40] = var16 + 1;
                this.field179[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field214[var16 + 1][var17] = 8;
                this.field123[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field214[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field178[var40] = var16;
                this.field179[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field214[var16][var17 - 1] = 1;
                this.field123[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field214[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field178[var40] = var16;
                this.field179[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field214[var16][var17 + 1] = 4;
                this.field123[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field214[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field178[var40] = var16 - 1;
                this.field179[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field214[var16 - 1][var17 - 1] = 3;
                this.field123[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field214[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field178[var40] = var16 + 1;
                this.field179[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field214[var16 + 1][var17 - 1] = 9;
                this.field123[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field214[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field178[var40] = var16 - 1;
                this.field179[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field214[var16 - 1][var17 + 1] = 6;
                this.field123[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field214[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field178[var40] = var16 + 1;
                this.field179[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field214[var16 + 1][var17 + 1] = 12;
                this.field123[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field310 = 0;
        if (!var20) {
            if (!arg4) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg10 - var25; var26 <= arg10 + var25; ++var26) {
                for (int var27 = arg8 - var25; var27 <= arg8 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field123[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg10) {
                            var28 = arg10 - var26;
                        } else if (var26 > arg0 + arg10 - 1) {
                            var28 = var26 - (arg0 + arg10 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg8) {
                            var29 = arg8 - var27;
                        } else if (var27 > arg6 + arg8 - 1) {
                            var29 = var27 - (arg6 + arg8 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field123[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field123[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg11 == var16 && arg7 == var17) {
                return false;
            }
            this.field310 = 1;
        }
        byte var31 = 0;
        this.field178[var31] = var16;
        int var41 = var31 + 1;
        this.field179[var31] = var17;
        int var32;
        int var33 = var32 = this.field214[var16][var17];
        while (arg11 != var16 || arg7 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field178[var41] = var16;
                this.field179[var41++] = var17;
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
            var33 = this.field214[var16][var17];
        }
        if (var41 <= 0) {
            if (arg3 == 1) {
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
            int var35 = this.field178[var41];
            int var36 = this.field179[var41];
            if (arg3 == 0) {
                this.field92.method457(525, 125);
                this.field92.method458(var34 + var34 + 3);
            }
            if (arg3 == 1) {
                this.field92.method457(525, 209);
                this.field92.method458(var34 + var34 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field92.method457(525, 39);
                this.field92.method458(var34 + var34 + 3);
            }
            this.field92.method495(this.field473 + var36, 0);
            this.field92.method458(super.field1356[5] == 1 ? 1 : 0);
            this.field92.method459(this.field472 + var35);
            this.field348 = this.field178[0];
            this.field349 = this.field179[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field92.method484(this.field178[var41] - var35, false);
                this.field92.method485(this.field179[var41] - var36, -752);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -1730) {
            field552 = this.field592.method335();
        }
        int var7 = this.field509.method310(arg4, arg2, arg3);
        if (var7 != 0) {
            int var8 = this.field509.method314(arg4, arg2, arg3, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field350.field1431;
            int var13 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class63 var15 = class63.method555(var14);
            if (var15.field1569 != -1) {
                class59 var16 = this.field97[var15.field1569];
                if (var16 != null) {
                    int var17 = (var15.field1566 * 4 - var16.field1525) / 2;
                    int var18 = (var15.field1605 * 4 - var16.field1526) / 2;
                    var16.method539(arg2 * 4 + 48 + var17, (104 - arg3 - var15.field1605) * 4 + 48 + var18, 714);
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
        int var19 = this.field509.method312(arg4, arg2, arg3);
        if (var19 != 0) {
            int var20 = this.field509.method314(arg4, arg2, arg3, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class63 var24 = class63.method555(var23);
            if (var24.field1569 != -1) {
                class59 var25 = this.field97[var24.field1569];
                if (var25 != null) {
                    int var26 = (var24.field1566 * 4 - var25.field1525) / 2;
                    int var27 = (var24.field1605 * 4 - var25.field1526) / 2;
                    var25.method539(arg2 * 4 + 48 + var26, (104 - arg3 - var24.field1605) * 4 + 48 + var27, 714);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field350.field1431;
                int var30 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
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
        int var31 = this.field509.method313(arg4, arg2, arg3);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class63 var33 = class63.method555(var32);
            if (var33.field1569 != -1) {
                class59 var34 = this.field97[var33.field1569];
                if (var34 != null) {
                    int var35 = (var33.field1566 * 4 - var34.field1525) / 2;
                    int var36 = (var33.field1605 * 4 - var34.field1526) / 2;
                    var34.method539(arg2 * 4 + 48 + var35, (104 - arg3 - var33.field1605) * 4 + 48 + var36, 714);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method75(int arg0) {
        if (arg0 != 26091) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field121 == 0) {
            int var3 = super.field1336 / 2 - 80;
            int var4 = super.field1337 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field1352 == 1 && super.field1353 >= var3 - 75 && super.field1353 <= var3 + 75 && super.field1354 >= var15 - 20 && super.field1354 <= var15 + 20) {
                this.field121 = 3;
                this.field193 = 0;
            }
            int var5 = super.field1336 / 2 + 80;
            if (super.field1352 == 1 && super.field1353 >= var5 - 75 && super.field1353 <= var5 + 75 && super.field1354 >= var15 - 20 && super.field1354 <= var15 + 20) {
                this.field134 = "";
                this.field135 = "Enter your username & password.";
                this.field121 = 2;
                this.field193 = 0;
            }
        } else if (this.field121 == 2) {
            int var6 = super.field1337 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field1352 == 1 && super.field1354 >= var17 - 15 && super.field1354 < var17) {
                this.field193 = 0;
            }
            var6 = var17 + 15;
            if (super.field1352 == 1 && super.field1354 >= var6 - 15 && super.field1354 < var6) {
                this.field193 = 1;
            }
            var6 += 15;
            int var7 = super.field1336 / 2 - 80;
            int var8 = super.field1337 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field1352 == 1 && super.field1353 >= var7 - 75 && super.field1353 <= var7 + 75 && super.field1354 >= var18 - 20 && super.field1354 <= var18 + 20) {
                this.field576 = 0;
                this.method173(this.field448, this.field449, false);
                if (this.field344) {
                    return;
                }
            }
            int var9 = super.field1336 / 2 + 80;
            if (super.field1352 == 1 && super.field1353 >= var9 - 75 && super.field1353 <= var9 + 75 && super.field1354 >= var18 - 20 && super.field1354 <= var18 + 20) {
                this.field121 = 0;
                this.field448 = "";
                this.field449 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method418(false);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field570.length(); ++var12) {
                        if (var10 == field570.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field193 == 0) {
                        if (var10 == 8 && this.field448.length() > 0) {
                            this.field448 = this.field448.substring(0, this.field448.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field193 = 1;
                        }
                        if (var11) {
                            this.field448 = this.field448 + (char) var10;
                        }
                        if (this.field448.length() > 12) {
                            this.field448 = this.field448.substring(0, 12);
                        }
                    } else if (this.field193 == 1) {
                        if (var10 == 8 && this.field449.length() > 0) {
                            this.field449 = this.field449.substring(0, this.field449.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field193 = 0;
                        }
                        if (var11) {
                            this.field449 = this.field449 + (char) var10;
                        }
                        if (this.field449.length() > 20) {
                            this.field449 = this.field449.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field121 == 3) {
                int var13 = super.field1336 / 2;
                int var14 = super.field1337 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field1352 == 1 && super.field1353 >= var13 - 75 && super.field1353 <= var13 + 75 && super.field1354 >= var19 - 20 && super.field1354 <= var19 + 20) {
                    this.field121 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLTQYMAXSO;)V")
    private final void method76(int arg0, boolean arg1, class53 arg2) {
        arg2.method478((byte) -43);
        int var4 = arg2.method479(8, (byte) 63);
        if (var4 < this.field127) {
            for (int var5 = var4; var5 < this.field127; ++var5) {
                this.field313[this.field312++] = this.field128[var5];
            }
        }
        if (var4 > this.field127) {
            signlink.reporterror(this.field448 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field127 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field128[var6];
                class15 var8 = this.field126[var7];
                int var9 = arg2.method479(1, (byte) 63);
                if (var9 == 0) {
                    this.field128[this.field127++] = var7;
                    var8.field784 = field291;
                } else {
                    int var10 = arg2.method479(2, (byte) 63);
                    if (var10 == 0) {
                        this.field128[this.field127++] = var7;
                        var8.field784 = field291;
                        this.field421[this.field420++] = var7;
                    } else if (var10 == 1) {
                        this.field128[this.field127++] = var7;
                        var8.field784 = field291;
                        int var11 = arg2.method479(3, (byte) 63);
                        var8.method226(this.field302, false, var11);
                        int var12 = arg2.method479(1, (byte) 63);
                        if (var12 == 1) {
                            this.field421[this.field420++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field128[this.field127++] = var7;
                        var8.field784 = field291;
                        int var13 = arg2.method479(3, (byte) 63);
                        var8.method226(this.field302, true, var13);
                        int var14 = arg2.method479(3, (byte) 63);
                        var8.method226(this.field302, true, var14);
                        int var15 = arg2.method479(1, (byte) 63);
                        if (var15 == 1) {
                            this.field421[this.field420++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field313[this.field312++] = var7;
                    }
                }
            }
            if (arg1) {
                this.field259 = arg2.method468();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZLTQYMAXSO;)V")
    private final void method77(int arg0, boolean arg1, class53 arg2) {
        this.field312 = 0;
        this.field420 = 0;
        this.method47(this.field498, arg0, arg2);
        this.method165(arg0, 1, arg2);
        this.method69(arg2, arg0, this.field91);
        this.method86(arg2, arg0, -870);
        for (int var4 = 0; var4 < this.field312; ++var4) {
            int var7 = this.field313[var4];
            if (field291 != this.field417[var7].field784) {
                this.field417[var7] = null;
            }
        }
        if (arg1) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (arg2.field1457 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field1457 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field418; ++var6) {
                if (this.field417[this.field419[var6]] == null) {
                    signlink.reporterror(this.field448 + " null entry in pl list - pos:" + var6 + " size:" + this.field418);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method78(int arg0, boolean arg1) {
        if (arg0 < 5 || arg0 > 5) {
            this.field137 = null;
        }
        for (int var3 = 0; var3 < this.field127; ++var3) {
            class15 var4 = this.field126[this.field128[var3]];
            int var5 = (this.field128[var3] << 14) + 536870912;
            if (var4 != null && var4.method188(true) && var4.field709.field1648 == arg1 && var4.field709.method567(0)) {
                int var6 = var4.field830 >> 7;
                int var7 = var4.field831 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field833 == 1 && (var4.field830 & 127) == 64 && (var4.field831 & 127) == 64) {
                        if (this.field430[var6][var7] == this.field554) {
                            continue;
                        }
                        this.field430[var6][var7] = this.field554;
                    }
                    if (!var4.field709.field1634) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field509.method295(var4.field831, var5, 8, this.field237, var4.field830, var4, (var4.field833 - 1) * 64 + 60, var4.field832, var4.field801, this.method109(var4.field831, var4.field830, (byte) 55, this.field237));
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    private static final String method79(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 != -9) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public final void method80(int arg0, byte arg1) {
        if (arg1 == -79) {
            class37.method360(arg0, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOMJBPTVL;)V")
    public final void method81(int arg0, class37 arg1) {
        if (arg0 != -31502) {
            this.field411 = this.field592.method335();
        }
        int var3 = arg1.field1191;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field564;
                if (this.field565 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field1184 = "";
                    arg1.field1163 = 0;
                } else {
                    if (this.field131[var3] == 0) {
                        arg1.field1184 = "@red@Offline";
                    } else if (this.field131[var3] < 200) {
                        if (this.field131[var3] == field491) {
                            arg1.field1184 = "@gre@World" + (this.field131[var3] - 9);
                        } else {
                            arg1.field1184 = "@yel@World" + (this.field131[var3] - 9);
                        }
                    } else if (this.field131[var3] == field491) {
                        arg1.field1184 = "@gre@Classic" + (this.field131[var3] - 219);
                    } else {
                        arg1.field1184 = "@yel@Classic" + (this.field131[var3] - 219);
                    }
                    arg1.field1163 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field564;
                if (this.field565 != 2) {
                    var6 = 0;
                }
                arg1.field1197 = var6 * 15 + 20;
                if (arg1.field1197 <= arg1.field1174) {
                    arg1.field1197 = arg1.field1174 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field565 == 0) {
                    arg1.field1184 = "Loading ignore list";
                    arg1.field1163 = 0;
                } else if (var3 == 1 && this.field565 == 0) {
                    arg1.field1184 = "Please wait...";
                    arg1.field1163 = 0;
                } else {
                    int var7 = this.field161;
                    if (this.field565 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1184 = "";
                        arg1.field1163 = 0;
                    } else {
                        arg1.field1184 = class41.method409(-354, class41.method406(this.field319[var3], (byte) 1));
                        arg1.field1163 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1197 = this.field161 * 15 + 20;
                if (arg1.field1197 <= arg1.field1174) {
                    arg1.field1197 = arg1.field1174 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1151 = 150;
                arg1.field1152 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 2047;
                if (this.field270) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field485[var8];
                        if (var15 >= 0 && !class9.field635[var15].method191(2)) {
                            return;
                        }
                    }
                    this.field270 = false;
                    class25[] var9 = new class25[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field485[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class9.field635[var14].method192(false);
                        }
                    }
                    class25 var12 = new class25(var9, var10, this.field106);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field180[var13] != 0) {
                            var12.method260(field274[var13][0], field274[var13][this.field180[var13]]);
                            if (var13 == 1) {
                                var12.method260(field563[0], field563[this.field180[var13]]);
                            }
                        }
                    }
                    var12.method253(0);
                    var12.method254(class30.field982[field304.field788].field984[0], 151);
                    var12.method263(64, 850, -30, -50, -30, true);
                    arg1.field1146 = 5;
                    arg1.field1147 = 0;
                    class37.method361(var12, true, 5, 0);
                }
            } else if (var3 == 324) {
                if (this.field539 == null) {
                    this.field539 = arg1.field1189;
                    this.field540 = arg1.field1157;
                }
                if (this.field410) {
                    arg1.field1189 = this.field540;
                } else {
                    arg1.field1189 = this.field539;
                }
            } else if (var3 == 325) {
                if (this.field539 == null) {
                    this.field539 = arg1.field1189;
                    this.field540 = arg1.field1157;
                }
                if (this.field410) {
                    arg1.field1189 = this.field539;
                } else {
                    arg1.field1189 = this.field540;
                }
            } else if (var3 == 600) {
                arg1.field1184 = this.field371;
                if (field291 % 20 < 10) {
                    arg1.field1184 = arg1.field1184 + "|";
                } else {
                    arg1.field1184 = arg1.field1184 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field305 >= 1) {
                        if (this.field301) {
                            arg1.field1208 = 16711680;
                            arg1.field1184 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1208 = 16777215;
                            arg1.field1184 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1184 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field314 - this.field181;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field1184 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field523 == 0) {
                        arg1.field1184 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field523 <= this.field314) {
                        arg1.field1184 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method82(this.field483, this.field523);
                    } else {
                        int var18 = this.field314 + 14 - this.field523;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field1184 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method82(this.field483, this.field523) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field365 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field365 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field365 + " unread messages";
                    }
                    arg1.field1184 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field236 > 0 && this.field236 <= this.field314 + 10) {
                        arg1.field1184 = "Last password change:\\n@gre@" + this.method82(this.field483, this.field236);
                    } else {
                        arg1.field1184 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field145 > 2 && !field493) {
                        arg1.field1184 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field145 > 2) {
                        arg1.field1184 = "\\n\\nYou have @gre@" + this.field145 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field145 > 0) {
                        arg1.field1184 = "You have @gre@" + this.field145 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field1184 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field145 > 2 && !field493) {
                        arg1.field1184 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field145 > 0) {
                        arg1.field1184 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field1184 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field523 > this.field314) {
                        arg1.field1184 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field1184 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field565 == 0) {
            arg1.field1184 = "Loading friend list";
            arg1.field1163 = 0;
        } else if (var3 == 1 && this.field565 == 1) {
            arg1.field1184 = "Connecting to friendserver";
            arg1.field1163 = 0;
        } else if (var3 == 2 && this.field565 != 2) {
            arg1.field1184 = "Please wait...";
            arg1.field1163 = 0;
        } else {
            int var4 = this.field564;
            if (this.field565 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field1184 = "";
                arg1.field1163 = 0;
            } else {
                arg1.field1184 = this.field389[var3];
                arg1.field1163 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method82(boolean arg0, int arg1) {
        if (arg1 > this.field314 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            if (arg0) {
                this.field483 = !this.field483;
            }
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method83(byte arg0) {
        if (this.field527 == null) {
            this.method90(515);
            super.field1339 = null;
            this.field151 = null;
            this.field152 = null;
            this.field153 = null;
            this.field154 = null;
            this.field155 = null;
            this.field156 = null;
            this.field157 = null;
            this.field158 = null;
            this.field159 = null;
            this.field527 = new class60(96, 479, field412, this.method167(0));
            this.field525 = new class60(156, 172, field412, this.method167(0));
            class35.method343(-793);
            this.field218.method539(0, 0, 714);
            this.field524 = new class60(261, 190, field412, this.method167(0));
            this.field526 = new class60(334, 512, field412, this.method167(0));
            class35.method343(-793);
            this.field316 = new class60(50, 496, field412, this.method167(0));
            this.field317 = new class60(37, 269, field412, this.method167(0));
            this.field318 = new class60(45, 249, field412, this.method167(0));
            this.field251 = true;
            this.field526.method541((byte) 3);
            class49.field1385 = this.field458;
            if (arg0 == 7) {
                boolean var2 = false;
            } else {
                this.field92.method458(41);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method84(int arg0) {
        this.field221 = 0;
        for (int var2 = -1; var2 < this.field418 + this.field127; ++var2) {
            class21 var19;
            if (var2 == -1) {
                var19 = field304;
            } else if (var2 < this.field418) {
                var19 = this.field417[this.field419[var2]];
            } else {
                var19 = this.field126[this.field128[var2 - this.field418]];
            }
            if (var19 != null && var19.method188(true)) {
                if (var19 instanceof class15) {
                    class66 var20 = ((class15) var19).field709;
                    if (var20.field1638 != null) {
                        var20 = var20.method568(this.field579);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field418) {
                    class66 var23 = ((class15) var19).field709;
                    if (var23.field1645 >= 0 && var23.field1645 < this.field355.length) {
                        this.method154(var19, var19.field790 + 15, true);
                        if (this.field129 > -1) {
                            this.field355[var23.field1645].method448(this.field129 - 12, this.field130 - 30, 714);
                        }
                    }
                    if (this.field206 == 1 && this.field128[var2 - this.field418] == this.field252 && field291 % 20 < 10) {
                        this.method154(var19, var19.field790 + 15, true);
                        if (this.field129 > -1) {
                            this.field118[0].method448(this.field129 - 12, this.field130 - 28, 714);
                        }
                    }
                } else {
                    int var21 = 30;
                    class8 var22 = (class8) var19;
                    if (var22.field626 != -1 || var22.field628 != -1) {
                        this.method154(var19, var19.field790 + 15, true);
                        if (this.field129 > -1) {
                            if (var22.field626 != -1) {
                                this.field264[var22.field626].method448(this.field129 - 12, this.field130 - var21, 714);
                                var21 += 25;
                            }
                            if (var22.field628 != -1) {
                                this.field355[var22.field628].method448(this.field129 - 12, this.field130 - var21, 714);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field206 == 10 && this.field419[var2] == this.field543) {
                        this.method154(var19, var19.field790 + 15, true);
                        if (this.field129 > -1) {
                            this.field118[1].method448(this.field129 - 12, this.field130 - var21, 714);
                        }
                    }
                }
                if (var19.field802 != null && (var2 >= this.field418 || this.field337 == 0 || this.field337 == 3 || this.field337 == 1 && this.method65(((class8) var19).field615, false))) {
                    this.method154(var19, var19.field790, true);
                    if (this.field129 > -1 && this.field221 < this.field222) {
                        this.field226[this.field221] = this.field165.method593(var19.field802, 0) / 2;
                        this.field225[this.field221] = this.field165.field1751;
                        this.field223[this.field221] = this.field129;
                        this.field224[this.field221] = this.field130;
                        this.field227[this.field221] = var19.field829;
                        this.field228[this.field221] = var19.field807;
                        this.field229[this.field221] = var19.field778;
                        this.field230[this.field221++] = var19.field802;
                        if (this.field315 == 0 && var19.field807 >= 1 && var19.field807 <= 3) {
                            this.field225[this.field221] += 10;
                            this.field224[this.field221] += 5;
                        }
                        if (this.field315 == 0 && var19.field807 == 4) {
                            this.field226[this.field221] = 60;
                        }
                        if (this.field315 == 0 && var19.field807 == 5) {
                            this.field225[this.field221] += 5;
                        }
                    }
                }
                if (var19.field804 > field291) {
                    this.method154(var19, var19.field790 + 15, true);
                    if (this.field129 > -1) {
                        int var24 = var19.field805 * 30 / var19.field806;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class35.method345(var24, 0, 65280, this.field129 - 15, 5, this.field130 - 3);
                        class35.method345(30 - var24, 0, 16711680, this.field129 - 15 + var24, 5, this.field130 - 3);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field787[var25] > field291) {
                        this.method154(var19, var19.field790 / 2, true);
                        if (this.field129 > -1) {
                            if (var25 == 1) {
                                this.field130 -= 20;
                            }
                            if (var25 == 2) {
                                this.field129 -= 15;
                                this.field130 -= 10;
                            }
                            if (var25 == 3) {
                                this.field129 += 15;
                                this.field130 -= 10;
                            }
                            this.field508[var19.field786[var25]].method448(this.field129 - 12, this.field130 - 12, 714);
                            this.field163.method590(0, 0, this.field129, String.valueOf(var19.field785[var25]), this.field130 + 4);
                            this.field163.method590(0, 16777215, this.field129 - 1, String.valueOf(var19.field785[var25]), this.field130 + 3);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field221; ++var3) {
            int var4 = this.field223[var3];
            int var5 = this.field224[var3];
            int var6 = this.field226[var3];
            int var7 = this.field225[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field224[var18] - this.field225[var18] && var5 - var7 < this.field224[var18] + 2 && var4 - var6 < this.field226[var18] + this.field223[var18] && var4 + var6 > this.field223[var18] - this.field226[var18] && this.field224[var18] - this.field225[var18] < var5) {
                        var5 = this.field224[var18] - this.field225[var18];
                        var8 = true;
                    }
                }
            }
            this.field129 = this.field223[var3];
            this.field130 = this.field224[var3] = var5;
            String var9 = this.field230[var3];
            if (this.field315 == 0) {
                int var10 = 16776960;
                if (this.field227[var3] < 6) {
                    var10 = this.field517[this.field227[var3]];
                }
                if (this.field227[var3] == 6) {
                    var10 = this.field554 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field227[var3] == 7) {
                    var10 = this.field554 % 20 < 10 ? 255 : 65535;
                }
                if (this.field227[var3] == 8) {
                    var10 = this.field554 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field227[var3] == 9) {
                    int var11 = 150 - this.field229[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field227[var3] == 10) {
                    int var12 = 150 - this.field229[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field227[var3] == 11) {
                    int var13 = 150 - this.field229[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field228[var3] == 0) {
                    this.field165.method590(0, 0, this.field129, var9, this.field130 + 1);
                    this.field165.method590(0, var10, this.field129, var9, this.field130);
                }
                if (this.field228[var3] == 1) {
                    this.field165.method595(this.field130 + 1, this.field129, 0, var9, this.field89, this.field554);
                    this.field165.method595(this.field130, this.field129, var10, var9, this.field89, this.field554);
                }
                if (this.field228[var3] == 2) {
                    this.field165.method596(this.field554, this.field129, this.field130 + 1, var9, 0, true);
                    this.field165.method596(this.field554, this.field129, this.field130, var9, var10, true);
                }
                if (this.field228[var3] == 3) {
                    this.field165.method597(-34278, var9, this.field130 + 1, this.field554, 150 - this.field229[var3], 0, this.field129);
                    this.field165.method597(-34278, var9, this.field130, this.field554, 150 - this.field229[var3], var10, this.field129);
                }
                if (this.field228[var3] == 4) {
                    int var14 = this.field165.method593(var9, 0);
                    int var15 = (150 - this.field229[var3]) * (var14 + 100) / 150;
                    class35.method342(0, this.field129 - 50, this.field129 + 50, 334, 14641);
                    this.field165.method594(this.field130 + 1, 0, var9, 914, this.field129 + 50 - var15);
                    this.field165.method594(this.field130, var10, var9, 914, this.field129 + 50 - var15);
                    class35.method341(2);
                }
                if (this.field228[var3] == 5) {
                    int var16 = 150 - this.field229[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class35.method342(this.field130 - this.field165.field1751 - 1, 0, 512, this.field130 + 5, 14641);
                    this.field165.method590(0, 0, this.field129, var9, this.field130 + 1 + var17);
                    this.field165.method590(0, var10, this.field129, var9, this.field130 + var17);
                    class35.method341(2);
                }
            } else {
                this.field165.method590(0, 0, this.field129, var9, this.field130 + 1);
                this.field165.method590(0, 16776960, this.field129, var9, this.field130);
            }
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIII)V")
    public final void method85(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field239.method539(arg4, arg0, 714);
        this.field240.method539(arg4, arg0 + arg2 - 16, 714);
        class35.method345(16, 0, this.field203, arg4, arg2 - 32, arg0 + 16);
        int var7 = (arg2 - 32) * arg2 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - 32 - var7) * arg5 / (arg3 - arg2);
        class35.method345(16, 0, this.field359, arg4, var7, arg0 + 16 + var8);
        class35.method350(arg0 + 16 + var8, this.field454, var7, arg4, true);
        class35.method350(arg0 + 16 + var8, this.field454, var7, arg4 + 1, true);
        if (!arg1) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        class35.method348(0, this.field454, arg0 + 16 + var8, arg4, 16);
        class35.method348(0, this.field454, arg0 + 17 + var8, arg4, 16);
        class35.method350(arg0 + 16 + var8, this.field590, var7, arg4 + 15, true);
        class35.method350(arg0 + 17 + var8, this.field590, var7 - 1, arg4 + 14, true);
        class35.method348(0, this.field590, arg0 + 15 + var8 + var7, arg4, 16);
        class35.method348(0, this.field590, arg0 + 14 + var8 + var7, arg4 + 1, 15);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LTQYMAXSO;II)V")
    private final void method86(class53 arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field420; ++var5) {
            int var6 = this.field421[var5];
            class8 var7 = this.field417[var6];
            int var8 = arg0.method468();
            if ((var8 & 64) != 0) {
                var8 += arg0.method468() << 8;
            }
            this.method104(this.field571, arg0, var6, var7, var8);
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    private final void method87(int arg0) {
        if (arg0 < 0) {
            for (class28 var2 = (class28) this.field391.method179(); var2 != null; var2 = (class28) this.field391.method181((byte) 2)) {
                if (var2.field958 == -1) {
                    var2.field966 = 0;
                    this.method91(-26862, var2);
                } else {
                    var2.method272();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LTPUDHOHI;ZII)V")
    public final void method88(class52 arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (arg1) {
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field298 + this.field295 & 2047;
                int var7 = class25.field938[var6];
                int var8 = class25.field939[var6];
                int var9 = var7 * 256 / (this.field547 + 256);
                int var10 = var8 * 256 / (this.field547 + 256);
                int var11 = arg2 * var9 + arg3 * var10 >> 16;
                int var12 = arg2 * var10 - arg3 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field436.method453(20, 256, 15, var13, 20, this.field169, var15 + 94 + 4 - 10, 83 - var16 - 20, 15);
            } else {
                this.method43((byte) 5, arg2, arg3, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILOMJBPTVL;)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, class37 arg4) {
        if (arg4.field1145 == 0 && arg4.field1155 != null) {
            if (!arg4.field1173 || this.field553 == arg4.field1202 || this.field143 == arg4.field1202 || this.field542 == arg4.field1202) {
                int var6 = class35.field1115;
                int var7 = class35.field1113;
                int var8 = class35.field1116;
                int var9 = class35.field1114;
                class35.method342(arg1, arg2, arg4.field1201 + arg2, arg4.field1174 + arg1, 14641);
                int var10 = 51 / arg0;
                int var11 = arg4.field1155.length;
                for (int var12 = 0; var12 < var11; ++var12) {
                    int var13 = arg4.field1200[var12] + arg2;
                    int var14 = arg4.field1190[var12] + arg1 - arg3;
                    class37 var15 = class37.method359(arg4.field1155[var12]);
                    int var16 = var15.field1149 + var13;
                    int var17 = var15.field1199 + var14;
                    if (var15.field1191 > 0) {
                        this.method81(this.field544, var15);
                    }
                    if (var15.field1145 == 0) {
                        if (var15.field1198 > var15.field1197 - var15.field1174) {
                            var15.field1198 = var15.field1197 - var15.field1174;
                        }
                        if (var15.field1198 < 0) {
                            var15.field1198 = 0;
                        }
                        this.method89(127, var17, var16, var15.field1198, var15);
                        if (var15.field1197 > var15.field1174) {
                            this.method85(var17, true, var15.field1174, var15.field1197, var15.field1201 + var16, var15.field1198);
                        }
                    } else if (var15.field1145 != 1) {
                        if (var15.field1145 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field1174; ++var19) {
                                for (int var20 = 0; var20 < var15.field1201; ++var20) {
                                    int var21 = (var15.field1153 + 32) * var20 + var16;
                                    int var22 = (var15.field1188 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field1143[var18];
                                        var22 += var15.field1159[var18];
                                    }
                                    if (var15.field1167[var18] <= 0) {
                                        if (var15.field1177 != null && var18 < 20) {
                                            class52 var31 = var15.field1177[var18];
                                            if (var31 != null) {
                                                var31.method448(var21, var22, 714);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field1167[var18] - 1;
                                        if (var21 > class35.field1115 - 32 && var21 < class35.field1116 && var22 > class35.field1113 - 32 && var22 < class35.field1114 || this.field381 != 0 && this.field380 == var18) {
                                            int var26 = 0;
                                            if (this.field425 == 1 && this.field426 == var18 && this.field427 == var15.field1202) {
                                                var26 = 16777215;
                                            }
                                            class52 var27 = class67.method573(25, var25, var15.field1209[var18], var26);
                                            if (var27 != null) {
                                                if (this.field381 != 0 && this.field380 == var18 && this.field379 == var15.field1202) {
                                                    var23 = super.field1346 - this.field382;
                                                    var24 = super.field1347 - this.field383;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field399 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method450(var22 + var24, var21 + var23, 128, true);
                                                    if (var22 + var24 < class35.field1113 && arg4.field1198 > 0) {
                                                        int var28 = (class35.field1113 - var22 - var24) * this.field196 / 3;
                                                        if (var28 > this.field196 * 10) {
                                                            var28 = this.field196 * 10;
                                                        }
                                                        if (var28 > arg4.field1198) {
                                                            var28 = arg4.field1198;
                                                        }
                                                        arg4.field1198 -= var28;
                                                        this.field383 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class35.field1114 && arg4.field1198 < arg4.field1197 - arg4.field1174) {
                                                        int var29 = (var22 + var24 + 32 - class35.field1114) * this.field196 / 3;
                                                        if (var29 > this.field196 * 10) {
                                                            var29 = this.field196 * 10;
                                                        }
                                                        if (var29 > arg4.field1197 - arg4.field1174 - arg4.field1198) {
                                                            var29 = arg4.field1197 - arg4.field1174 - arg4.field1198;
                                                        }
                                                        arg4.field1198 += var29;
                                                        this.field383 -= var29;
                                                    }
                                                } else if (this.field575 != 0 && this.field574 == var18 && this.field573 == var15.field1202) {
                                                    var27.method450(var22, var21, 128, true);
                                                } else {
                                                    var27.method448(var21, var22, 714);
                                                }
                                                if (var27.field1436 == 33 || var15.field1209[var18] != 1) {
                                                    int var30 = var15.field1209[var18];
                                                    this.field163.method594(var22 + 10 + var24, 0, method117(43, var30), 914, var21 + 1 + var23);
                                                    this.field163.method594(var22 + 9 + var24, 16776960, method117(43, var30), 914, var21 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field1145 == 3) {
                            boolean var32 = false;
                            if (this.field542 == var15.field1202 || this.field143 == var15.field1202 || this.field553 == var15.field1202) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method105(var15, -642)) {
                                var33 = var15.field1180;
                                if (var32 && var15.field1161 != 0) {
                                    var33 = var15.field1161;
                                }
                            } else {
                                var33 = var15.field1208;
                                if (var32 && var15.field1211 != 0) {
                                    var33 = var15.field1211;
                                }
                            }
                            if (var15.field1187 == 0) {
                                if (var15.field1186) {
                                    class35.method345(var15.field1201, 0, var33, var16, var15.field1174, var17);
                                } else {
                                    class35.method346(var16, var33, var17, 903, var15.field1201, var15.field1174);
                                }
                            } else if (var15.field1186) {
                                class35.method344(var15.field1201, var16, var33, var17, 256 - (var15.field1187 & 255), var15.field1174, this.field93);
                            } else {
                                class35.method347(256 - (var15.field1187 & 255), var15.field1174, var15.field1201, var17, -487, var16, var33);
                            }
                        } else if (var15.field1145 == 4) {
                            class71 var34 = var15.field1164;
                            String var35 = var15.field1184;
                            boolean var36 = false;
                            if (this.field542 == var15.field1202 || this.field143 == var15.field1202 || this.field553 == var15.field1202) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method105(var15, -642)) {
                                var37 = var15.field1180;
                                if (var36 && var15.field1161 != 0) {
                                    var37 = var15.field1161;
                                }
                                if (var15.field1144.length() > 0) {
                                    var35 = var15.field1144;
                                }
                            } else {
                                var37 = var15.field1208;
                                if (var36 && var15.field1211 != 0) {
                                    var37 = var15.field1211;
                                }
                            }
                            if (var15.field1163 == 6 && this.field497) {
                                var35 = "Please wait...";
                                var37 = var15.field1208;
                            }
                            if (class35.field1111 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1751 + var17;
                            while (var35.length() > 0) {
                                if (var35.indexOf("%") != -1) {
                                    label389: while (true) {
                                        int var39 = var35.indexOf("%1");
                                        if (var39 == -1) {
                                            while (true) {
                                                int var40 = var35.indexOf("%2");
                                                if (var40 == -1) {
                                                    while (true) {
                                                        int var41 = var35.indexOf("%3");
                                                        if (var41 == -1) {
                                                            while (true) {
                                                                int var42 = var35.indexOf("%4");
                                                                if (var42 == -1) {
                                                                    while (true) {
                                                                        int var43 = var35.indexOf("%5");
                                                                        if (var43 == -1) {
                                                                            break label389;
                                                                        }
                                                                        var35 = var35.substring(0, var43) + this.method159(this.method135(4, var15, (byte) -76), -278) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method159(this.method135(3, var15, (byte) -76), -278) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method159(this.method135(2, var15, (byte) -76), -278) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method159(this.method135(1, var15, (byte) -76), -278) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method159(this.method135(0, var15, (byte) -76), -278) + var35.substring(var39 + 2);
                                    }
                                }
                                int var44 = var35.indexOf("\\n");
                                String var45;
                                if (var44 != -1) {
                                    var45 = var35.substring(0, var44);
                                    var35 = var35.substring(var44 + 2);
                                } else {
                                    var45 = var35;
                                    var35 = "";
                                }
                                if (var15.field1170) {
                                    var34.method591(var38, var15.field1201 / 2 + var16, var15.field1165, -918, var45, var37);
                                } else {
                                    var34.method598(0, var37, var16, var15.field1165, var38, var45);
                                }
                                var38 += var34.field1751;
                            }
                        } else if (var15.field1145 == 5) {
                            class52 var46;
                            if (this.method105(var15, -642)) {
                                var46 = var15.field1157;
                            } else {
                                var46 = var15.field1189;
                            }
                            if (var46 != null) {
                                var46.method448(var16, var17, 714);
                            }
                        } else if (var15.field1145 == 6) {
                            int var47 = class49.field1379;
                            int var48 = class49.field1380;
                            class49.field1379 = var15.field1201 / 2 + var16;
                            class49.field1380 = var15.field1174 / 2 + var17;
                            int var49 = class49.field1383[var15.field1151] * var15.field1150 >> 16;
                            int var50 = class49.field1384[var15.field1151] * var15.field1150 >> 16;
                            boolean var51 = this.method105(var15, -642);
                            int var52;
                            if (var51) {
                                var52 = var15.field1194;
                            } else {
                                var52 = var15.field1193;
                            }
                            class25 var53;
                            if (var52 == -1) {
                                var53 = var15.method353(var51, -1, 4318, -1);
                            } else {
                                class30 var54 = class30.field982[var52];
                                var53 = var15.method353(var51, var54.field984[var15.field1166], 4318, var54.field985[var15.field1166]);
                            }
                            if (var53 != null) {
                                var53.method267(0, var15.field1152, 0, var15.field1151, 0, var49, var50);
                            }
                            class49.field1379 = var47;
                            class49.field1380 = var48;
                        } else {
                            if (var15.field1145 == 7) {
                                class71 var55 = var15.field1164;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field1174; ++var57) {
                                    for (int var58 = 0; var58 < var15.field1201; ++var58) {
                                        if (var15.field1167[var56] > 0) {
                                            class67 var59 = class67.method575(var15.field1167[var56] - 1);
                                            String var60 = String.valueOf(var59.field1709);
                                            if (var59.field1700 || var15.field1209[var56] != 1) {
                                                var60 = var60 + " x" + method79((byte) -9, var15.field1209[var56]);
                                            }
                                            int var61 = (var15.field1153 + 115) * var58 + var16;
                                            int var62 = (var15.field1188 + 12) * var57 + var17;
                                            if (var15.field1170) {
                                                var55.method591(var62, var15.field1201 / 2 + var61, var15.field1165, -918, var60, var15.field1208);
                                            } else {
                                                var55.method598(0, var15.field1208, var61, var15.field1165, var62, var60);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field1145 == 8 && (this.field269 == var15.field1202 || this.field495 == var15.field1202 || this.field386 == var15.field1202) && this.field245 == 100) {
                                int var63 = 0;
                                int var64 = 0;
                                class71 var65 = this.field164;
                                String var66 = var15.field1184;
                                while (var66.length() > 0) {
                                    int var73 = var66.indexOf("\\n");
                                    String var74;
                                    if (var73 != -1) {
                                        var74 = var66.substring(0, var73);
                                        var66 = var66.substring(var73 + 2);
                                    } else {
                                        var74 = var66;
                                        var66 = "";
                                    }
                                    int var75 = var65.method592(-6377, var74);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field1751 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field1201 + var16 - 5 - var63;
                                int var68 = var15.field1174 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg4.field1201 + arg2) {
                                    var67 = arg4.field1201 + arg2 - var63;
                                }
                                if (var64 + var68 > arg4.field1174 + arg1) {
                                    var68 = arg4.field1174 + arg1 - var64;
                                }
                                class35.method345(var63, 0, 16777120, var67, var64, var68);
                                class35.method346(var67, 0, var68, 903, var63, var64);
                                String var69 = var15.field1184;
                                int var70 = var65.field1751 + var68 + 2;
                                while (var69.length() > 0) {
                                    int var71 = var69.indexOf("\\n");
                                    String var72;
                                    if (var71 != -1) {
                                        var72 = var69.substring(0, var71);
                                        var69 = var69.substring(var71 + 2);
                                    } else {
                                        var72 = var69;
                                        var69 = "";
                                    }
                                    var65.method598(0, 0, var67 + 3, false, var70, var72);
                                    var70 += var65.field1751 + 1;
                                }
                            }
                        }
                    }
                }
                class35.method342(var7, var6, var8, var9, 14641);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method90(int arg0) {
        this.field550 = false;
        if (arg0 <= 0) {
            field481 = this.field592.method335();
        }
        while (this.field353) {
            this.field550 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field104 = null;
        this.field105 = null;
        this.field242 = null;
        this.field486 = null;
        this.field487 = null;
        this.field488 = null;
        this.field489 = null;
        this.field289 = null;
        this.field290 = null;
        this.field198 = null;
        this.field199 = null;
        this.field400 = null;
        this.field401 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILKOXMDHST;)V")
    private final void method91(int arg0, class28 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -26862) {
            this.field423 = this.field592.method335();
        }
        if (arg1.field963 == 0) {
            var3 = this.field509.method310(arg1.field962, arg1.field964, arg1.field965);
        }
        if (arg1.field963 == 1) {
            var3 = this.field509.method311(false, arg1.field965, arg1.field962, arg1.field964);
        }
        if (arg1.field963 == 2) {
            var3 = this.field509.method312(arg1.field962, arg1.field964, arg1.field965);
        }
        if (arg1.field963 == 3) {
            var3 = this.field509.method313(arg1.field962, arg1.field964, arg1.field965);
        }
        if (var3 != 0) {
            int var7 = this.field509.method314(arg1.field962, arg1.field964, arg1.field965, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field959 = var4;
        arg1.field961 = var5;
        arg1.field960 = var6;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
    public final void method92(long arg0, boolean arg1) {
        this.field344 &= arg1;
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field564; ++var4) {
                if (this.field241[var4] == arg0) {
                    --this.field564;
                    this.field288 = true;
                    for (int var5 = var4; var5 < this.field564; ++var5) {
                        this.field389[var5] = this.field389[var5 + 1];
                        this.field131[var5] = this.field131[var5 + 1];
                        this.field241[var5] = this.field241[var5 + 1];
                    }
                    this.field92.method457(525, 52);
                    this.field92.method464(66, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.method48(-804);
        if (this.field480 == 1) {
            this.field303[this.field479 / 100].method448(this.field477 - 8 - 4, this.field478 - 8 - 4, 714);
        }
        if (this.field480 == 2) {
            this.field303[this.field479 / 100 + 4].method448(this.field477 - 8 - 4, this.field478 - 8 - 4, 714);
        }
        if (this.field108 != -1) {
            this.method56(this.field108, (byte) 4, this.field196);
            this.method89(127, 0, 0, 0, class37.method359(this.field108));
        }
        if (this.field99 != -1) {
            this.method56(this.field99, (byte) 4, this.field196);
            this.method89(127, 0, 0, 0, class37.method359(this.field99));
        }
        this.method111(this.field522);
        if (!arg0) {
            this.field92.method458(4);
        }
        if (!this.field293) {
            this.method157(-411);
            this.method153(588);
        } else if (this.field511 == 0) {
            this.method72(-10414);
        }
        if (this.field204 == 1) {
            this.field507.method448(472, 296, 714);
        }
        if (field238) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1334 < 30 && field494) {
                var4 = 16711680;
            }
            if (super.field1334 < 20 && !field494) {
                var4 = 16711680;
            }
            this.field164.method589(var3, "Fps:" + super.field1334, var2, var4, false);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field494) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field494) {
                int var9 = 16711680;
            }
            this.field164.method589(var13, "Mem:" + var6 + "k", var2, 16776960, false);
            var13 += 15;
        }
        if (this.field275 != 0) {
            int var10 = this.field275 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field164.method594(329, 16776960, "System update in: " + var11 + ":0" + var12, 914, 4);
            } else {
                this.field164.method594(329, 16776960, "System update in: " + var11 + ":" + var12, 914, 4);
            }
            ++field516;
            if (field516 > 73) {
                field516 = 0;
                this.field92.method457(525, 110);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZIIII)V")
    private final void method94(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3) {
            this.field92.method458(167);
        }
        if (arg6 >= 1 && arg2 >= 1 && arg6 <= 102 && arg2 <= 102) {
            if (field494 && this.field237 != arg0) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field509.method310(arg0, arg6, arg2);
            }
            if (arg7 == 1) {
                var9 = this.field509.method311(false, arg2, arg0, arg6);
            }
            if (arg7 == 2) {
                var9 = this.field509.method312(arg0, arg6, arg2);
            }
            if (arg7 == 3) {
                var9 = this.field509.method313(arg0, arg6, arg2);
            }
            if (var9 != 0) {
                int var13 = this.field509.method314(arg0, arg6, arg2, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field509.method301(arg0, arg2, arg6, -763);
                    class63 var17 = class63.method555(var14);
                    if (var17.field1559) {
                        this.field533[arg0].method520(var17.field1604, var16, arg6, arg2, -967, var15);
                    }
                }
                if (arg7 == 1) {
                    this.field509.method302(true, arg2, arg6, arg0);
                }
                if (arg7 == 2) {
                    this.field509.method303(-983, arg2, arg0, arg6);
                    class63 var18 = class63.method555(var14);
                    if (var18.field1566 + arg6 > 103 || var18.field1566 + arg2 > 103 || var18.field1605 + arg6 > 103 || var18.field1605 + arg2 > 103) {
                        return;
                    }
                    if (var18.field1559) {
                        this.field533[arg0].method521(arg2, var18.field1566, var18.field1604, 1, var16, var18.field1605, arg6);
                    }
                }
                if (arg7 == 3) {
                    this.field509.method304(arg2, true, arg0, arg6);
                    class63 var19 = class63.method555(var14);
                    if (var19.field1559 && var19.field1599) {
                        this.field533[arg0].method523(true, arg2, arg6);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg0;
                if (arg0 < 3 && (this.field352[1][arg6][arg2] & 2) == 2) {
                    var20 = arg0 + 1;
                }
                class2.method16(arg6, arg0, arg4, this.field533[arg0], arg5, var20, arg2, this.field509, 0, arg1, this.field278);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method95(byte arg0) {
        this.field104 = new class59(this.field435, "titlebox", 0);
        if (arg0 != 65) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field105 = new class59(this.field435, "titlebutton", 0);
        this.field242 = new class59[12];
        for (int var3 = 0; var3 < 12; ++var3) {
            this.field242[var3] = new class59(this.field435, "runes", var3);
        }
        this.field400 = new class52(128, 265);
        this.field401 = new class52(128, 265);
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field400.field1431[var4] = this.field154.field1533[var4];
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field401.field1431[var5] = this.field155.field1533[var5];
        }
        this.field487 = new int[256];
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field487[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field487[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field487[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field487[var9 + 192] = 16777215;
        }
        this.field488 = new int[256];
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field488[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field488[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field488[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field488[var13 + 192] = 16777215;
        }
        this.field489 = new int[256];
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field489[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field489[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field489[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field489[var17 + 192] = 16777215;
        }
        this.field486 = new int[256];
        this.field289 = new int[32768];
        this.field290 = new int[32768];
        this.method139((class59) null, 48162);
        this.field198 = new int[32768];
        this.field199 = new int[32768];
        this.method61(10, (byte) -127, "Connecting to fileserver");
        if (!this.field550) {
            this.field591 = true;
            this.field550 = true;
            this.method108(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method96(byte arg0) {
        if (arg0 != 123) {
            this.field259 = -1;
        }
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field198[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field198[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field199[var14] = (this.field198[var14 - 1] + this.field198[var14 + 1] + this.field198[var14 - 128] + this.field198[var14 + 128]) / 4;
            }
        }
        this.field470 += 128;
        if (this.field470 > this.field289.length) {
            this.field470 -= this.field289.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method139(this.field242[var6], 48162);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field199[var11 + 128] - this.field289[this.field470 + var11 & this.field289.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field198[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field209[var8] = this.field209[var8 + 1];
        }
        this.field209[var2 - 1] = (int) (Math.sin((double) field291 / 14.0D) * 16.0D + Math.sin((double) field291 / 15.0D) * 14.0D + Math.sin((double) field291 / 16.0D) * 12.0D);
        if (this.field586 > 0) {
            this.field586 -= 4;
        }
        if (this.field587 > 0) {
            this.field587 -= 4;
        }
        if (this.field586 == 0 && this.field587 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field586 = 1024;
            }
            if (var9 == 1) {
                this.field587 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (super.field1339 == null) {
            this.method90(515);
            this.field151 = null;
            this.field152 = null;
            this.field258 += arg0;
            this.field153 = null;
            this.field154 = null;
            this.field155 = null;
            this.field156 = null;
            this.field157 = null;
            this.field158 = null;
            this.field159 = null;
            this.field527 = null;
            this.field525 = null;
            this.field524 = null;
            this.field526 = null;
            this.field316 = null;
            this.field317 = null;
            this.field318 = null;
            super.field1339 = new class60(503, 765, field412, this.method167(0));
            this.field251 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method98(int arg0, int arg1) {
        class7 var3 = this.field137[this.field237][arg0][arg1];
        if (var3 == null) {
            this.field509.method305(this.field237, arg0, arg1);
        } else {
            int var4 = -99999999;
            class14 var5 = null;
            for (class14 var6 = (class14) var3.method179(); var6 != null; var6 = (class14) var3.method181((byte) 2)) {
                class67 var11 = class67.method575(var6.field704);
                int var12 = var11.field1674;
                if (var11.field1700) {
                    var12 = (var6.field703 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method177(var5, 6);
            class14 var7 = null;
            class14 var8 = null;
            for (class14 var9 = (class14) var3.method179(); var9 != null; var9 = (class14) var3.method181((byte) 2)) {
                if (var5.field704 != var9.field704 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field704 != var9.field704 && var7.field704 != var9.field704 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field509.method291(this.field237, var7, var10, 3, this.method109(arg1 * 128 + 64, arg0 * 128 + 64, (byte) 55, this.field237), var8, arg1, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method99(int arg0, int arg1, int arg2) {
        if (arg2 != -27024) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg1 - arg0;
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

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method100(byte arg0) {
        for (int var2 = -1; var2 < this.field418; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field416;
            } else {
                var3 = this.field419[var2];
            }
            class8 var4 = this.field417[var3];
            if (var4 != null) {
                this.method122(1, false, var4);
            }
        }
        ++field255;
        if (arg0 != -61) {
            this.field92.method458(149);
        }
        if (field255 > 109) {
            field255 = 0;
            this.field92.method457(525, 129);
            this.field92.method462(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)Ljava/lang/String;")
    public final String method101(byte arg0) {
        if (arg0 != 3) {
            this.field106 = this.field592.method335();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1341 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method102(int arg0) {
        class58 var2 = (class58) this.field593.method179();
        if (arg0 != 11600) {
            this.field92.method458(200);
        }
        while (var2 != null) {
            if (this.field237 == var2.field1516 && field291 <= var2.field1510) {
                if (field291 >= var2.field1509) {
                    if (var2.field1505 > 0) {
                        class15 var3 = this.field126[var2.field1505 - 1];
                        if (var3 != null && var3.field830 >= 0 && var3.field830 < 13312 && var3.field831 >= 0 && var3.field831 < 13312) {
                            var2.method532(this.method109(var3.field831, var3.field830, (byte) 55, var2.field1516) - var2.field1514, var3.field830, field291, 2, var3.field831);
                        }
                    }
                    if (var2.field1505 < 0) {
                        int var4 = -var2.field1505 - 1;
                        class8 var5;
                        if (this.field144 == var4) {
                            var5 = field304;
                        } else {
                            var5 = this.field417[var4];
                        }
                        if (var5 != null && var5.field830 >= 0 && var5.field830 < 13312 && var5.field831 >= 0 && var5.field831 < 13312) {
                            var2.method532(this.method109(var5.field831, var5.field830, (byte) 55, var2.field1516) - var2.field1514, var5.field830, field291, 2, var5.field831);
                        }
                    }
                    var2.method533(this.field196, true);
                    this.field509.method295((int) var2.field1501, -1, 8, this.field237, (int) var2.field1500, var2, 60, var2.field1507, false, (int) var2.field1502);
                }
            } else {
                var2.method272();
            }
            var2 = (class58) this.field593.method181((byte) 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)Z")
    public final boolean method103(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field509.method314(this.field237, arg0, arg1, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method73(0, var7 + 1, 2, 2, true, var8, 0, field304.field828[0], arg1, 0, arg0, field304.field827[0]);
            } else {
                class63 var9 = class63.method555(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1605;
                    var11 = var9.field1566;
                } else {
                    var10 = var9.field1566;
                    var11 = var9.field1605;
                }
                int var12 = var9.field1562;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method73(var10, 0, 2, 2, true, 0, var11, field304.field828[0], arg1, var12, arg0, field304.field827[0]);
            }
            this.field477 = super.field1353;
            this.field478 = super.field1354;
            this.field480 = 2;
            if (arg2 == 4) {
                boolean var13 = false;
            } else {
                this.field110 = this.field592.method335();
            }
            this.field479 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILTQYMAXSO;ILDEHYKQII;I)V")
    private final void method104(int arg0, class53 arg1, int arg2, class8 arg3, int arg4) {
        int var6 = 92 / arg0;
        if ((arg4 & 1024) != 0) {
            arg3.field818 = arg1.method470();
            int var7 = arg1.method503(-699);
            arg3.field822 = var7 >> 16;
            arg3.field821 = (var7 & 65535) + field291;
            arg3.field819 = 0;
            arg3.field820 = 0;
            if (arg3.field821 > field291) {
                arg3.field819 = -1;
            }
            if (arg3.field818 == 65535) {
                arg3.field818 = -1;
            }
        }
        if ((arg4 & 16) != 0) {
            arg3.field802 = arg1.method475();
            if (arg3.field802.charAt(0) == '~') {
                arg3.field802 = arg3.field802.substring(1);
                this.method133(arg3.field615, arg3.field802, (byte) -30, 2);
            } else if (field304 == arg3) {
                this.method133(arg3.field615, arg3.field802, (byte) -30, 2);
            }
            arg3.field829 = 0;
            arg3.field807 = 0;
            arg3.field778 = 150;
        }
        if ((arg4 & 256) != 0) {
            arg3.field791 = arg1.method468();
            arg3.field793 = arg1.method488(-33544);
            arg3.field792 = arg1.method489(-33025);
            arg3.field794 = arg1.method488(-33544);
            arg3.field795 = arg1.method498(this.field340) + field291;
            arg3.field796 = arg1.method498(this.field340) + field291;
            arg3.field797 = arg1.method468();
            arg3.method228(-369);
        }
        if ((arg4 & 128) != 0) {
            arg3.field800 = arg1.method496((byte) 7);
            if (arg3.field800 == 65535) {
                arg3.field800 = -1;
            }
        }
        if ((arg4 & 2) != 0) {
            int var8 = arg1.method470();
            int var9 = arg1.method487((byte) 0);
            int var10 = arg1.method489(-33025);
            int var11 = arg1.field1457;
            if (arg3.field615 != null && arg3.field613) {
                long var12 = class41.method405(arg3.field615);
                boolean var14 = false;
                if (var9 <= 1) {
                    for (int var15 = 0; var15 < this.field161; ++var15) {
                        if (this.field319[var15] == var12) {
                            var14 = true;
                            break;
                        }
                    }
                }
                if (!var14 && this.field292 == 0) {
                    try {
                        this.field125.field1457 = 0;
                        arg1.method506(this.field125.field1456, -161, 0, var10);
                        this.field125.field1457 = 0;
                        String var16 = class6.method26(var10, -765, this.field125);
                        String var17 = class40.method377(var16, this.field338);
                        arg3.field802 = var17;
                        arg3.field829 = var8 >> 8;
                        arg3.field807 = var8 & 255;
                        arg3.field778 = 150;
                        if (var9 != 2 && var9 != 3) {
                            if (var9 == 1) {
                                this.method133("@cr1@" + arg3.field615, var17, (byte) -30, 1);
                            } else {
                                this.method133(arg3.field615, var17, (byte) -30, 2);
                            }
                        } else {
                            this.method133("@cr2@" + arg3.field615, var17, (byte) -30, 1);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field1457 = var10 + var11;
        }
        if ((arg4 & 8) != 0) {
            arg3.field781 = arg1.method470();
            arg3.field782 = arg1.method498(this.field340);
        }
        if ((arg4 & 1) != 0) {
            int var19 = arg1.method498(this.field340);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = arg1.method487((byte) 0);
            if (arg3.field813 == var19 && var19 != -1) {
                int var21 = class30.field982[var19].field996;
                if (var21 == 1) {
                    arg3.field814 = 0;
                    arg3.field815 = 0;
                    arg3.field816 = var20;
                    arg3.field817 = 0;
                }
                if (var21 == 2) {
                    arg3.field817 = 0;
                }
            } else if (var19 == -1 || arg3.field813 == -1 || class30.field982[var19].field990 >= class30.field982[arg3.field813].field990) {
                arg3.field813 = var19;
                arg3.field814 = 0;
                arg3.field815 = 0;
                arg3.field816 = var20;
                arg3.field817 = 0;
                arg3.field799 = arg3.field812;
            }
        }
        if ((arg4 & 512) != 0) {
            int var22 = arg1.method487((byte) 0);
            int var23 = arg1.method487((byte) 0);
            arg3.method229(var22, field291, 155, var23);
            arg3.field804 = field291 + 300;
            arg3.field805 = arg1.method488(-33544);
            arg3.field806 = arg1.method488(-33544);
        }
        if ((arg4 & 4) != 0) {
            int var24 = arg1.method489(-33025);
            byte[] var25 = new byte[var24];
            class53 var26 = new class53(var25, -631);
            arg1.method477(691, 0, var24, var25);
            this.field422[arg2] = var26;
            arg3.method187(-5329, var26);
        }
        if ((arg4 & 32) != 0) {
            int var27 = arg1.method488(-33544);
            int var28 = arg1.method488(-33544);
            arg3.method229(var27, field291, 155, var28);
            arg3.field804 = field291 + 300;
            arg3.field805 = arg1.method468();
            arg3.field806 = arg1.method489(-33025);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LOMJBPTVL;I)Z")
    public final boolean method105(class37 arg0, int arg1) {
        while (arg1 >= 0) {
            this.field588 = !this.field588;
        }
        if (arg0.field1196 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1196.length; ++var3) {
                int var4 = this.method135(var3, arg0, (byte) -76);
                int var5 = arg0.field1192[var3];
                if (arg0.field1196[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1196[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1196[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZI)V")
    public final void method106(boolean arg0, boolean arg1, int arg2) {
        signlink.midivol = arg2;
        if (arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILTQYMAXSO;)V")
    private final void method107(int arg0, int arg1, class53 arg2) {
        if (arg1 <= 0) {
            this.field259 = -1;
        }
        while (arg2.field1458 + 21 < arg0 * 8) {
            int var4 = arg2.method479(14, (byte) 63);
            if (var4 == 16383) {
                break;
            }
            if (this.field126[var4] == null) {
                this.field126[var4] = new class15();
            }
            class15 var5 = this.field126[var4];
            this.field128[this.field127++] = var4;
            var5.field784 = field291;
            int var6 = arg2.method479(1, (byte) 63);
            int var7 = arg2.method479(5, (byte) 63);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.field709 = class66.method563(arg2.method479(13, (byte) 63));
            int var8 = arg2.method479(5, (byte) 63);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method479(1, (byte) 63);
            if (var9 == 1) {
                this.field421[this.field420++] = var4;
            }
            var5.field833 = var5.field709.field1616;
            var5.field803 = var5.field709.field1631;
            var5.field823 = var5.field709.field1643;
            var5.field824 = var5.field709.field1623;
            var5.field825 = var5.field709.field1652;
            var5.field826 = var5.field709.field1635;
            var5.field788 = var5.field709.field1618;
            var5.method227(var6 == 1, field304.field827[0] + var8, true, field304.field828[0] + var7);
        }
        arg2.method480(9);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method108(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method108(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIBI)I")
    public final int method109(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 55) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        int var6 = arg1 >> 7;
        int var7 = arg0 >> 7;
        if (var6 >= 0 && var7 >= 0 && var6 <= 103 && var7 <= 103) {
            int var8 = arg3;
            if (arg3 < 3 && (this.field352[1][var6][var7] & 2) == 2) {
                var8 = arg3 + 1;
            }
            int var9 = arg1 & 127;
            int var10 = arg0 & 127;
            int var11 = (128 - var9) * this.field278[var8][var6][var7] + this.field278[var8][var6 + 1][var7] * var9 >> 7;
            int var12 = (128 - var9) * this.field278[var8][var6][var7 + 1] + this.field278[var8][var6 + 1][var7 + 1] * var9 >> 7;
            return (128 - var10) * var11 + var10 * var12 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method110(int arg0) {
        if (arg0 < 0) {
            this.field251 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method111(byte arg0) {
        this.field292 = 0;
        int var2 = (field304.field830 >> 7) + this.field472;
        int var3 = (field304.field831 >> 7) + this.field473;
        if (arg0 != -118) {
            this.field137 = null;
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field292 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field292 = 1;
        }
        if (this.field292 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field292 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method112(boolean arg0) {
        byte[] var2 = this.field435.method442("title.dat", (byte[]) null);
        class52 var3 = new class52(var2, this);
        this.field154.method541((byte) 3);
        var3.method446(-30434, 0, 0);
        this.field155.method541((byte) 3);
        var3.method446(-30434, 0, -637);
        this.field151.method541((byte) 3);
        var3.method446(-30434, 0, -128);
        this.field152.method541((byte) 3);
        if (!arg0) {
            field481 = 395;
        }
        var3.method446(-30434, -371, -202);
        this.field153.method541((byte) 3);
        var3.method446(-30434, -171, -202);
        this.field156.method541((byte) 3);
        var3.method446(-30434, -265, 0);
        this.field157.method541((byte) 3);
        var3.method446(-30434, -265, -562);
        this.field158.method541((byte) 3);
        var3.method446(-30434, -171, -128);
        this.field159.method541((byte) 3);
        var3.method446(-30434, -171, -562);
        int[] var4 = new int[var3.field1432];
        for (int var5 = 0; var5 < var3.field1433; ++var5) {
            for (int var10 = 0; var10 < var3.field1432; ++var10) {
                var4[var10] = var3.field1431[var3.field1432 * var5 + (var3.field1432 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1432; ++var11) {
                var3.field1431[var3.field1432 * var5 + var11] = var4[var11];
            }
        }
        this.field154.method541((byte) 3);
        var3.method446(-30434, 0, 382);
        this.field155.method541((byte) 3);
        var3.method446(-30434, 0, -255);
        this.field151.method541((byte) 3);
        var3.method446(-30434, 0, 254);
        this.field152.method541((byte) 3);
        var3.method446(-30434, -371, 180);
        this.field153.method541((byte) 3);
        var3.method446(-30434, -171, 180);
        this.field156.method541((byte) 3);
        var3.method446(-30434, -265, 382);
        this.field157.method541((byte) 3);
        var3.method446(-30434, -265, -180);
        this.field158.method541((byte) 3);
        var3.method446(-30434, -171, 254);
        this.field159.method541((byte) 3);
        var3.method446(-30434, -171, -180);
        class52 var6 = new class52(this.field435, "logo", 0);
        this.field151.method541((byte) 3);
        var6.method448(382 - var6.field1432 / 2 - 128, 18, 714);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class27.field954) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILTQYMAXSO;)V")
    public final void method113(byte arg0, int arg1, class53 arg2) {
        if (arg0 != 24) {
            this.method158();
        }
        if (arg1 == 187) {
            int var4 = arg2.method468();
            int var5 = (var4 >> 4 & 7) + this.field100;
            int var6 = (var4 & 7) + this.field101;
            int var7 = var5 + arg2.method469();
            int var8 = var6 + arg2.method469();
            int var9 = arg2.method471();
            int var10 = arg2.method470();
            int var11 = arg2.method468() * 4;
            int var12 = arg2.method468() * 4;
            int var13 = arg2.method470();
            int var14 = arg2.method470();
            int var15 = arg2.method468();
            int var16 = arg2.method468();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var10 != 65535) {
                int var17 = var5 * 128 + 64;
                int var18 = var6 * 128 + 64;
                int var19 = var7 * 128 + 64;
                int var20 = var8 * 128 + 64;
                class58 var21 = new class58(field291 + var13, var15, (byte) -35, var9, var18, this.method109(var18, var17, (byte) 55, this.field237) - var11, this.field237, var12, var16, var10, field291 + var14, var17);
                var21.method532(this.method109(var20, var19, (byte) 55, this.field237) - var12, var19, field291 + var13, 2, var20);
                this.field593.method176(var21);
            }
        } else if (arg1 == 160) {
            int var22 = arg2.method468();
            int var23 = (var22 >> 4 & 7) + this.field100;
            int var24 = (var22 & 7) + this.field101;
            int var25 = arg2.method470();
            int var26 = arg2.method468();
            int var27 = arg2.method470();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                int var28 = var23 * 128 + 64;
                int var29 = var24 * 128 + 64;
                class31 var30 = new class31(this.field237, 0, this.method109(var29, var28, (byte) 55, this.field237) - var26, field291, var28, var27, var25, var29);
                this.field234.method176(var30);
            }
        } else {
            if (arg1 == 185) {
                int var31 = arg2.method468();
                int var32 = (var31 >> 4 & 7) + this.field100;
                int var33 = (var31 & 7) + this.field101;
                int var34 = arg2.method470();
                int var35 = arg2.method468();
                int var36 = var35 >> 4 & 15;
                int var37 = var35 & 7;
                if (field304.field827[0] >= var32 - var36 && field304.field827[0] <= var32 + var36 && field304.field828[0] >= var33 - var36 && field304.field828[0] <= var33 + var36 && this.field465 && !field494 && this.field138 < 50) {
                    this.field545[this.field138] = var34;
                    this.field500[this.field138] = var37;
                    this.field102[this.field138] = class62.field1548[var34];
                    ++this.field138;
                }
            }
            if (arg1 == 14) {
                int var38 = arg2.method489(-33025);
                int var39 = (var38 >> 4 & 7) + this.field100;
                int var40 = (var38 & 7) + this.field101;
                int var41 = arg2.method488(-33544);
                int var42 = var41 >> 2;
                int var43 = var41 & 3;
                int var44 = this.field112[var42];
                int var45 = arg2.method496((byte) 7);
                if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                    this.method149(var45, 0, this.field311, var39, var44, -1, var43, this.field237, var42, var40);
                }
            } else if (arg1 == 91) {
                int var46 = arg2.method489(-33025);
                int var47 = (var46 >> 4 & 7) + this.field100;
                int var48 = (var46 & 7) + this.field101;
                int var49 = arg2.method498(this.field340);
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                    class7 var50 = this.field137[this.field237][var47][var48];
                    if (var50 != null) {
                        for (class14 var51 = (class14) var50.method179(); var51 != null; var51 = (class14) var50.method181((byte) 2)) {
                            if ((var49 & 32767) == var51.field704) {
                                var51.method272();
                                break;
                            }
                        }
                        if (var50.method179() == null) {
                            this.field137[this.field237][var47][var48] = null;
                        }
                        this.method98(var47, var48);
                    }
                }
            } else {
                if (arg1 == 128) {
                    int var52 = arg2.method496((byte) 7);
                    int var53 = arg2.method468();
                    int var54 = (var53 >> 4 & 7) + this.field100;
                    int var55 = (var53 & 7) + this.field101;
                    int var56 = arg2.method497(this.field188);
                    int var57 = arg2.method470();
                    int var58 = arg2.method470();
                    int var59 = arg2.method468();
                    int var60 = var59 >> 2;
                    int var61 = var59 & 3;
                    int var62 = this.field112[var60];
                    byte var63 = arg2.method490(1);
                    byte var64 = arg2.method490(1);
                    byte var65 = arg2.method491(false);
                    byte var66 = arg2.method490(1);
                    class8 var67;
                    if (this.field144 == var58) {
                        var67 = field304;
                    } else {
                        var67 = this.field417[var58];
                    }
                    if (var67 != null) {
                        class63 var68 = class63.method555(var57);
                        int var69 = this.field278[this.field237][var54][var55];
                        int var70 = this.field278[this.field237][var54 + 1][var55];
                        int var71 = this.field278[this.field237][var54 + 1][var55 + 1];
                        int var72 = this.field278[this.field237][var54][var55 + 1];
                        class25 var73 = var68.method556(var60, var61, var69, var70, var71, var72, -1);
                        if (var73 != null) {
                            this.method149(-1, var56 + 1, this.field311, var54, var62, var52 + 1, 0, this.field237, 0, var55);
                            var67.field608 = field291 + var56;
                            var67.field609 = field291 + var52;
                            var67.field620 = var73;
                            int var74 = var68.field1566;
                            int var75 = var68.field1605;
                            if (var61 == 1 || var61 == 3) {
                                var74 = var68.field1605;
                                var75 = var68.field1566;
                            }
                            var67.field617 = var54 * 128 + var74 * 64;
                            var67.field619 = var55 * 128 + var75 * 64;
                            var67.field618 = this.method109(var67.field619, var67.field617, (byte) 55, this.field237);
                            if (var65 > var66) {
                                byte var76 = var65;
                                var65 = var66;
                                var66 = var76;
                            }
                            if (var63 > var64) {
                                byte var77 = var63;
                                var63 = var64;
                                var64 = var77;
                            }
                            var67.field621 = var54 + var65;
                            var67.field623 = var54 + var66;
                            var67.field622 = var55 + var63;
                            var67.field624 = var55 + var64;
                        }
                    }
                }
                if (arg1 == 103) {
                    int var78 = arg2.method489(-33025);
                    int var79 = var78 >> 2;
                    int var80 = var78 & 3;
                    int var81 = this.field112[var79];
                    int var82 = arg2.method487((byte) 0);
                    int var83 = (var82 >> 4 & 7) + this.field100;
                    int var84 = (var82 & 7) + this.field101;
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                        this.method149(-1, 0, this.field311, var83, var81, -1, var80, this.field237, var79, var84);
                    }
                } else if (arg1 == 255) {
                    int var85 = arg2.method497(this.field188);
                    int var86 = arg2.method488(-33544);
                    int var87 = (var86 >> 4 & 7) + this.field100;
                    int var88 = (var86 & 7) + this.field101;
                    int var89 = arg2.method468();
                    int var90 = var89 >> 2;
                    int var91 = var89 & 3;
                    int var92 = this.field112[var90];
                    if (var87 >= 0 && var88 >= 0 && var87 < 103 && var88 < 103) {
                        int var93 = this.field278[this.field237][var87][var88];
                        int var94 = this.field278[this.field237][var87 + 1][var88];
                        int var95 = this.field278[this.field237][var87 + 1][var88 + 1];
                        int var96 = this.field278[this.field237][var87][var88 + 1];
                        if (var92 == 0) {
                            class26 var97 = this.field509.method306(-42158, this.field237, var87, var88);
                            if (var97 != null) {
                                int var98 = var97.field949 >> 14 & 32767;
                                if (var90 == 2) {
                                    var97.field947 = new class36(var96, var98, var94, false, var91 + 4, 2, var95, var85, (byte) -108, var93);
                                    var97.field948 = new class36(var96, var98, var94, false, var91 + 1 & 3, 2, var95, var85, (byte) -108, var93);
                                } else {
                                    var97.field947 = new class36(var96, var98, var94, false, var91, var90, var95, var85, (byte) -108, var93);
                                }
                            }
                        }
                        if (var92 == 1) {
                            class72 var99 = this.field509.method307(this.field237, var88, var87, this.field358);
                            if (var99 != null) {
                                var99.field1759 = new class36(var96, var99.field1760 >> 14 & 32767, var94, false, 0, 4, var95, var85, (byte) -108, var93);
                            }
                        }
                        if (var92 == 2) {
                            class69 var100 = this.field509.method308(var88, this.field237, -10, var87);
                            if (var90 == 11) {
                                var90 = 10;
                            }
                            if (var100 != null) {
                                var100.field1720 = new class36(var96, var100.field1728 >> 14 & 32767, var94, false, var91, var90, var95, var85, (byte) -108, var93);
                            }
                        }
                        if (var92 == 3) {
                            class38 var101 = this.field509.method309(var87, var88, (byte) 8, this.field237);
                            if (var101 != null) {
                                var101.field1216 = new class36(var96, var101.field1217 >> 14 & 32767, var94, false, var91, 22, var95, var85, (byte) -108, var93);
                            }
                        }
                    }
                } else if (arg1 == 210) {
                    int var102 = arg2.method470();
                    int var103 = arg2.method488(-33544);
                    int var104 = (var103 >> 4 & 7) + this.field100;
                    int var105 = (var103 & 7) + this.field101;
                    int var106 = arg2.method496((byte) 7);
                    int var107 = arg2.method498(this.field340);
                    if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104 && this.field144 != var106) {
                        class14 var108 = new class14();
                        var108.field704 = var102;
                        var108.field703 = var107;
                        if (this.field137[this.field237][var104][var105] == null) {
                            this.field137[this.field237][var104][var105] = new class7((byte) 1);
                        }
                        this.field137[this.field237][var104][var105].method176(var108);
                        this.method98(var104, var105);
                    }
                } else if (arg1 != 47) {
                    if (arg1 == 69) {
                        int var117 = arg2.method489(-33025);
                        int var118 = (var117 >> 4 & 7) + this.field100;
                        int var119 = (var117 & 7) + this.field101;
                        int var120 = arg2.method497(this.field188);
                        int var121 = arg2.method496((byte) 7);
                        if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                            class14 var122 = new class14();
                            var122.field704 = var121;
                            var122.field703 = var120;
                            if (this.field137[this.field237][var118][var119] == null) {
                                this.field137[this.field237][var118][var119] = new class7((byte) 1);
                            }
                            this.field137[this.field237][var118][var119].method176(var122);
                            this.method98(var118, var119);
                        }
                    }
                } else {
                    int var109 = arg2.method468();
                    int var110 = (var109 >> 4 & 7) + this.field100;
                    int var111 = (var109 & 7) + this.field101;
                    int var112 = arg2.method470();
                    int var113 = arg2.method470();
                    int var114 = arg2.method470();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class7 var115 = this.field137[this.field237][var110][var111];
                        if (var115 != null) {
                            for (class14 var116 = (class14) var115.method179(); var116 != null; var116 = (class14) var115.method181((byte) 2)) {
                                if ((var112 & 32767) == var116.field704 && var116.field703 == var113) {
                                    var116.field703 = var114;
                                    break;
                                }
                            }
                            this.method98(var110, var111);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method114(boolean arg0) {
        ++this.field554;
        this.method41(true, true);
        this.method78(5, true);
        this.method41(false, true);
        this.method78(5, false);
        this.method102(11600);
        this.method38(this.field541);
        if (!this.field95) {
            int var2 = this.field294;
            if (this.field202 / 256 > var2) {
                var2 = this.field202 / 256;
            }
            if (this.field384[4] && this.field321[4] + 128 > var2) {
                var2 = this.field321[4] + 128;
            }
            int var3 = this.field295 + this.field276 & 2047;
            this.method63(this.field148, var2 * 3 + 600, 7, var2, this.method109(field304.field831, field304.field830, (byte) 55, this.field237) - 50, this.field147, var3);
        }
        if (arg0) {
            field481 = -437;
        }
        int var4;
        if (!this.field95) {
            var4 = this.method150(436);
        } else {
            var4 = this.method151((byte) 3);
        }
        int var5 = this.field372;
        int var6 = this.field373;
        int var7 = this.field374;
        int var8 = this.field375;
        int var9 = this.field376;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field384[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field549[var10] * 2 + 1) - (double) this.field549[var10] + Math.sin((double) this.field182[var10] / 100.0D * (double) this.field115[var10]) * (double) this.field321[var10]);
                if (var10 == 0) {
                    this.field372 += var12;
                }
                if (var10 == 1) {
                    this.field373 += var12;
                }
                if (var10 == 2) {
                    this.field374 += var12;
                }
                if (var10 == 3) {
                    this.field376 = this.field376 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field375 += var12;
                    if (this.field375 < 128) {
                        this.field375 = 128;
                    }
                    if (this.field375 > 383) {
                        this.field375 = 383;
                    }
                }
            }
        }
        int var11 = class49.field1394;
        class25.field933 = true;
        class25.field936 = 0;
        class25.field934 = super.field1346 - 4;
        class25.field935 = super.field1347 - 4;
        class35.method343(-793);
        this.field509.method323(this.field139, this.field374, this.field375, var4, this.field373, this.field372, this.field376);
        this.field509.method298(false);
        this.method84(0);
        this.method156((byte) 3);
        this.method45(var11, 6);
        this.method93(true);
        this.field526.method542(7, 4, 4, super.field1338);
        this.field372 = var5;
        this.field373 = var6;
        this.field374 = var7;
        this.field375 = var8;
        this.field376 = var9;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
    public final void method115(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field161; ++var4) {
                if (this.field319[var4] == arg0) {
                    --this.field161;
                    this.field288 = true;
                    for (int var5 = var4; var5 < this.field161; ++var5) {
                        this.field319[var5] = this.field319[var5 + 1];
                    }
                    this.field92.method457(525, 185);
                    this.field92.method464(66, arg0);
                    break;
                }
            }
            if (arg1 < 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method116(boolean arg0) {
        if (arg0) {
            if (super.field1352 == 1) {
                if (super.field1353 >= 6 && super.field1353 <= 106 && super.field1354 >= 467 && super.field1354 <= 499) {
                    this.field337 = (this.field337 + 1) % 4;
                    this.field377 = true;
                    this.field168 = true;
                    this.field92.method457(525, 232);
                    this.field92.method458(this.field337);
                    this.field92.method458(this.field403);
                    this.field92.method458(this.field256);
                }
                if (super.field1353 >= 135 && super.field1353 <= 235 && super.field1354 >= 467 && super.field1354 <= 499) {
                    this.field403 = (this.field403 + 1) % 3;
                    this.field377 = true;
                    this.field168 = true;
                    this.field92.method457(525, 232);
                    this.field92.method458(this.field337);
                    this.field92.method458(this.field403);
                    this.field92.method458(this.field256);
                }
                if (super.field1353 >= 273 && super.field1353 <= 373 && super.field1354 >= 467 && super.field1354 <= 499) {
                    this.field256 = (this.field256 + 1) % 3;
                    this.field377 = true;
                    this.field168 = true;
                    this.field92.method457(525, 232);
                    this.field92.method458(this.field337);
                    this.field92.method458(this.field403);
                    this.field92.method458(this.field256);
                }
                if (super.field1353 >= 412 && super.field1353 <= 512 && super.field1354 >= 467 && super.field1354 <= 499) {
                    if (this.field99 == -1) {
                        this.method119((byte) 2);
                        this.field371 = "";
                        this.field301 = false;
                        this.field408 = this.field99 = class37.field1178;
                        return;
                    }
                    this.method133("", "Please close the interface you have open before using 'report abuse'", (byte) -30, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method117(int arg0, int arg1) {
        int var2 = 88 / arg0;
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public static final void method118(int arg0) {
        class32.field1018 = false;
        class49.field1374 = false;
        if (arg0 < 0) {
            field494 = false;
            class2.field16 = false;
            class63.field1602 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method119(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field93 = this.field592.method335();
        }
        this.field92.method457(525, 188);
        if (this.field133 != -1) {
            this.method80(this.field133, (byte) -79);
            this.field133 = -1;
            this.field288 = true;
            this.field497 = false;
            this.field451 = true;
        }
        if (this.field111 != -1) {
            this.method80(this.field111, (byte) -79);
            this.field111 = -1;
            this.field168 = true;
            this.field497 = false;
        }
        if (this.field369 != -1) {
            this.method80(this.field369, (byte) -79);
            this.field369 = -1;
            this.field251 = true;
        }
        if (this.field484 != -1) {
            this.method80(this.field484, (byte) -79);
            this.field484 = -1;
        }
        if (this.field99 != -1) {
            this.method80(this.field99, (byte) -79);
            this.field99 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method120(byte arg0) {
        int var2 = this.field555 * 128 + 64;
        int var3 = this.field556 * 128 + 64;
        int var4 = this.method109(var3, var2, (byte) 55, this.field237) - this.field557;
        if (this.field372 < var2) {
            this.field372 += (var2 - this.field372) * this.field559 / 1000 + this.field558;
            if (this.field372 > var2) {
                this.field372 = var2;
            }
        }
        if (this.field372 > var2) {
            this.field372 -= (this.field372 - var2) * this.field559 / 1000 + this.field558;
            if (this.field372 < var2) {
                this.field372 = var2;
            }
        }
        if (this.field373 < var4) {
            this.field373 += (var4 - this.field373) * this.field559 / 1000 + this.field558;
            if (this.field373 > var4) {
                this.field373 = var4;
            }
        }
        if (this.field373 > var4) {
            this.field373 -= (this.field373 - var4) * this.field559 / 1000 + this.field558;
            if (this.field373 < var4) {
                this.field373 = var4;
            }
        }
        if (this.field374 < var3) {
            this.field374 += (var3 - this.field374) * this.field559 / 1000 + this.field558;
            if (this.field374 > var3) {
                this.field374 = var3;
            }
        }
        if (this.field374 > var3) {
            this.field374 -= (this.field374 - var3) * this.field559 / 1000 + this.field558;
            if (this.field374 < var3) {
                this.field374 = var3;
            }
        }
        int var5 = this.field279 * 128 + 64;
        int var6 = this.field280 * 128 + 64;
        int var7 = this.method109(var6, var5, (byte) 55, this.field237) - this.field281;
        if (arg0 == -2) {
            int var8 = var5 - this.field372;
            int var9 = var7 - this.field373;
            int var10 = var6 - this.field374;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field375 < var12) {
                this.field375 += (var12 - this.field375) * this.field283 / 1000 + this.field282;
                if (this.field375 > var12) {
                    this.field375 = var12;
                }
            }
            if (this.field375 > var12) {
                this.field375 -= (this.field375 - var12) * this.field283 / 1000 + this.field282;
                if (this.field375 < var12) {
                    this.field375 = var12;
                }
            }
            int var14 = var13 - this.field376;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field376 += this.field283 * var14 / 1000 + this.field282;
                this.field376 &= 2047;
            }
            if (var14 < 0) {
                this.field376 -= -var14 * this.field283 / 1000 + this.field282;
                this.field376 &= 2047;
            }
            int var15 = var13 - this.field376;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field376 = var13;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        if (!arg0) {
            this.field518 = !this.field518;
        }
        for (int var2 = 0; var2 < this.field127; ++var2) {
            int var3 = this.field128[var2];
            class15 var4 = this.field126[var3];
            if (var4 != null) {
                this.method122(var4.field709.field1616, false, var4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLJFHWDRLM;)V")
    public final void method122(int arg0, boolean arg1, class21 arg2) {
        if (arg2.field830 < 128 || arg2.field831 < 128 || arg2.field830 >= 13184 || arg2.field831 >= 13184) {
            arg2.field813 = -1;
            arg2.field818 = -1;
            arg2.field795 = 0;
            arg2.field796 = 0;
            arg2.field830 = arg2.field827[0] * 128 + arg2.field833 * 64;
            arg2.field831 = arg2.field828[0] * 128 + arg2.field833 * 64;
            arg2.method228(-369);
        }
        if (field304 == arg2 && (arg2.field830 < 1536 || arg2.field831 < 1536 || arg2.field830 >= 11776 || arg2.field831 >= 11776)) {
            arg2.field813 = -1;
            arg2.field818 = -1;
            arg2.field795 = 0;
            arg2.field796 = 0;
            arg2.field830 = arg2.field827[0] * 128 + arg2.field833 * 64;
            arg2.field831 = arg2.field828[0] * 128 + arg2.field833 * 64;
            arg2.method228(-369);
        }
        if (arg2.field795 > field291) {
            this.method123(32707, arg2);
        } else if (arg2.field796 >= field291) {
            this.method124(arg2, true);
        } else {
            this.method125(3, arg2);
        }
        this.method126((byte) 0, arg2);
        if (arg1) {
            field552 = 194;
        }
        this.method127(arg2, -241);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILJFHWDRLM;)V")
    public final void method123(int arg0, class21 arg1) {
        int var3 = arg1.field795 - field291;
        if (arg0 != 32707) {
            this.field413 = this.field592.method335();
        }
        int var4 = arg1.field833 * 64 + arg1.field791 * 128;
        int var5 = arg1.field833 * 64 + arg1.field793 * 128;
        arg1.field830 += (var4 - arg1.field830) / var3;
        arg1.field831 += (var5 - arg1.field831) / var3;
        arg1.field798 = 0;
        if (arg1.field797 == 0) {
            arg1.field780 = 1024;
        }
        if (arg1.field797 == 1) {
            arg1.field780 = 1536;
        }
        if (arg1.field797 == 2) {
            arg1.field780 = 0;
        }
        if (arg1.field797 == 3) {
            arg1.field780 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LJFHWDRLM;Z)V")
    public final void method124(class21 arg0, boolean arg1) {
        this.field344 &= arg1;
        if (field291 == arg0.field796 || arg0.field813 == -1 || arg0.field816 != 0 || arg0.field815 + 1 > class30.field982[arg0.field813].method280(-204, arg0.field814)) {
            int var3 = arg0.field796 - arg0.field795;
            int var4 = field291 - arg0.field795;
            int var5 = arg0.field833 * 64 + arg0.field791 * 128;
            int var6 = arg0.field833 * 64 + arg0.field793 * 128;
            int var7 = arg0.field833 * 64 + arg0.field792 * 128;
            int var8 = arg0.field833 * 64 + arg0.field794 * 128;
            arg0.field830 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field831 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field798 = 0;
        if (arg0.field797 == 0) {
            arg0.field780 = 1024;
        }
        if (arg0.field797 == 1) {
            arg0.field780 = 1536;
        }
        if (arg0.field797 == 2) {
            arg0.field780 = 0;
        }
        if (arg0.field797 == 3) {
            arg0.field780 = 512;
        }
        arg0.field832 = arg0.field780;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILJFHWDRLM;)V")
    public final void method125(int arg0, class21 arg1) {
        arg1.field808 = arg1.field788;
        if (arg1.field812 == 0) {
            arg1.field798 = 0;
        } else {
            if (arg1.field813 != -1 && arg1.field816 == 0) {
                class30 var3 = class30.field982[arg1.field813];
                if (arg1.field799 > 0 && var3.field994 == 0) {
                    ++arg1.field798;
                    return;
                }
                if (arg1.field799 <= 0 && var3.field995 == 0) {
                    ++arg1.field798;
                    return;
                }
            }
            int var4 = arg1.field830;
            int var5 = arg1.field831;
            if (arg0 != 3) {
                this.method158();
            }
            int var6 = arg1.field827[arg1.field812 - 1] * 128 + arg1.field833 * 64;
            int var7 = arg1.field828[arg1.field812 - 1] * 128 + arg1.field833 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field780 = 1280;
                    } else if (var5 > var7) {
                        arg1.field780 = 1792;
                    } else {
                        arg1.field780 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field780 = 768;
                    } else if (var5 > var7) {
                        arg1.field780 = 256;
                    } else {
                        arg1.field780 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field780 = 1024;
                } else {
                    arg1.field780 = 0;
                }
                int var8 = arg1.field780 - arg1.field832 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field824;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field823;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field826;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field825;
                }
                if (var9 == -1) {
                    var9 = arg1.field823;
                }
                arg1.field808 = var9;
                int var10 = 4;
                if (arg1.field832 != arg1.field780 && arg1.field800 == -1 && arg1.field803 != 0) {
                    var10 = 2;
                }
                if (arg1.field812 > 2) {
                    var10 = 6;
                }
                if (arg1.field812 > 3) {
                    var10 = 8;
                }
                if (arg1.field798 > 0 && arg1.field812 > 1) {
                    var10 = 8;
                    --arg1.field798;
                }
                if (arg1.field779[arg1.field812 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field823 == arg1.field808 && arg1.field783 != -1) {
                    arg1.field808 = arg1.field783;
                }
                if (var4 < var6) {
                    arg1.field830 += var10;
                    if (arg1.field830 > var6) {
                        arg1.field830 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field830 -= var10;
                    if (arg1.field830 < var6) {
                        arg1.field830 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field831 += var10;
                    if (arg1.field831 > var7) {
                        arg1.field831 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field831 -= var10;
                    if (arg1.field831 < var7) {
                        arg1.field831 = var7;
                    }
                }
                if (arg1.field830 == var6 && arg1.field831 == var7) {
                    --arg1.field812;
                    if (arg1.field799 > 0) {
                        --arg1.field799;
                        return;
                    }
                }
            } else {
                arg1.field830 = var6;
                arg1.field831 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLJFHWDRLM;)V")
    public final void method126(byte arg0, class21 arg1) {
        if (this.field300 == arg0) {
            boolean var3 = false;
        } else {
            this.method158();
        }
        if (arg1.field803 != 0) {
            if (arg1.field800 != -1 && arg1.field800 < 32768) {
                class15 var4 = this.field126[arg1.field800];
                if (var4 != null) {
                    int var5 = arg1.field830 - var4.field830;
                    int var6 = arg1.field831 - var4.field831;
                    if (var5 != 0 || var6 != 0) {
                        arg1.field780 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field800 >= 32768) {
                int var7 = arg1.field800 - 32768;
                if (this.field144 == var7) {
                    var7 = this.field416;
                }
                class8 var8 = this.field417[var7];
                if (var8 != null) {
                    int var9 = arg1.field830 - var8.field830;
                    int var10 = arg1.field831 - var8.field831;
                    if (var9 != 0 || var10 != 0) {
                        arg1.field780 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field781 != 0 || arg1.field782 != 0) && (arg1.field812 == 0 || arg1.field798 > 0)) {
                int var11 = arg1.field830 - (arg1.field781 - this.field472 - this.field472) * 64;
                int var12 = arg1.field831 - (arg1.field782 - this.field473 - this.field473) * 64;
                if (var11 != 0 || var12 != 0) {
                    arg1.field780 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
                }
                arg1.field781 = 0;
                arg1.field782 = 0;
            }
            int var13 = arg1.field780 - arg1.field832 & 2047;
            if (var13 != 0) {
                if (var13 >= arg1.field803 && var13 <= 2048 - arg1.field803) {
                    if (var13 > 1024) {
                        arg1.field832 -= arg1.field803;
                    } else {
                        arg1.field832 += arg1.field803;
                    }
                } else {
                    arg1.field832 = arg1.field780;
                }
                arg1.field832 &= 2047;
                if (arg1.field808 == arg1.field788 && arg1.field832 != arg1.field780) {
                    if (arg1.field789 != -1) {
                        arg1.field808 = arg1.field789;
                        return;
                    }
                    arg1.field808 = arg1.field823;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LJFHWDRLM;I)V")
    public final void method127(class21 arg0, int arg1) {
        if (arg1 >= 0) {
            this.field98 = !this.field98;
        }
        arg0.field801 = false;
        if (arg0.field808 != -1) {
            class30 var3 = class30.field982[arg0.field808];
            ++arg0.field810;
            if (arg0.field809 < var3.field983 && arg0.field810 > var3.method280(-204, arg0.field809)) {
                arg0.field810 = 0;
                ++arg0.field809;
            }
            if (arg0.field809 >= var3.field983) {
                arg0.field810 = 0;
                arg0.field809 = 0;
            }
        }
        if (arg0.field818 != -1 && field291 >= arg0.field821) {
            if (arg0.field819 < 0) {
                arg0.field819 = 0;
            }
            class30 var4 = class45.field1307[arg0.field818].field1311;
            ++arg0.field820;
            while (arg0.field819 < var4.field983 && arg0.field820 > var4.method280(-204, arg0.field819)) {
                arg0.field820 -= var4.method280(-204, arg0.field819);
                ++arg0.field819;
            }
            if (arg0.field819 >= var4.field983 && (arg0.field819 < 0 || arg0.field819 >= var4.field983)) {
                arg0.field818 = -1;
            }
        }
        if (arg0.field813 != -1 && arg0.field816 <= 1) {
            class30 var5 = class30.field982[arg0.field813];
            if (var5.field994 == 1 && arg0.field799 > 0 && arg0.field795 <= field291 && arg0.field796 < field291) {
                arg0.field816 = 1;
                return;
            }
        }
        if (arg0.field813 != -1 && arg0.field816 == 0) {
            class30 var6 = class30.field982[arg0.field813];
            ++arg0.field815;
            while (arg0.field814 < var6.field983 && arg0.field815 > var6.method280(-204, arg0.field814)) {
                arg0.field815 -= var6.method280(-204, arg0.field814);
                ++arg0.field814;
            }
            if (arg0.field814 >= var6.field983) {
                arg0.field814 -= var6.field987;
                ++arg0.field817;
                if (arg0.field817 >= var6.field993) {
                    arg0.field813 = -1;
                }
                if (arg0.field814 < 0 || arg0.field814 >= var6.field983) {
                    arg0.field813 = -1;
                }
            }
            arg0.field801 = var6.field989;
        }
        if (arg0.field816 > 0) {
            --arg0.field816;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method128(byte arg0) {
        if (this.field201 != arg0) {
            this.field259 = -1;
        }
        if (this.field369 != -1 && (this.field90 == 2 || super.field1339 != null)) {
            if (this.field90 == 2) {
                this.method56(this.field369, (byte) 4, this.field196);
                if (this.field484 != -1) {
                    this.method56(this.field484, (byte) 4, this.field196);
                }
                this.field196 = 0;
                this.method97(0);
                super.field1339.method541((byte) 3);
                class49.field1385 = this.field459;
                class35.method343(-793);
                this.field251 = true;
                class37 var2 = class37.method359(this.field369);
                if (var2.field1201 == 512 && var2.field1174 == 334 && var2.field1145 == 0) {
                    var2.field1201 = 765;
                    var2.field1174 = 503;
                }
                this.method89(127, 0, 0, 0, var2);
                if (this.field484 != -1) {
                    class37 var3 = class37.method359(this.field484);
                    if (var3.field1201 == 512 && var3.field1174 == 334 && var3.field1145 == 0) {
                        var3.field1201 = 765;
                        var3.field1174 = 503;
                    }
                    this.method89(127, 0, 0, 0, var3);
                }
                if (!this.field293) {
                    this.method157(-411);
                    this.method153(588);
                } else {
                    this.method72(-10414);
                }
            }
            super.field1339.method542(7, 0, 0, super.field1338);
        } else {
            if (this.field251) {
                this.method83((byte) 7);
                this.field251 = false;
                this.field328.method542(7, 4, 0, super.field1338);
                this.field329.method542(7, 357, 0, super.field1338);
                this.field330.method542(7, 4, 722, super.field1338);
                this.field331.method542(7, 205, 743, super.field1338);
                this.field332.method542(7, 0, 0, super.field1338);
                this.field333.method542(7, 4, 516, super.field1338);
                this.field334.method542(7, 205, 516, super.field1338);
                this.field335.method542(7, 357, 496, super.field1338);
                this.field336.method542(7, 338, 0, super.field1338);
                this.field288 = true;
                this.field168 = true;
                this.field451 = true;
                this.field377 = true;
                if (this.field90 != 2) {
                    this.field526.method542(7, 4, 4, super.field1338);
                    this.field525.method542(7, 4, 550, super.field1338);
                }
            }
            if (this.field90 == 2) {
                this.method114(false);
            }
            if (this.field293 && this.field511 == 1) {
                this.field288 = true;
            }
            if (this.field133 != -1) {
                boolean var4 = this.method56(this.field133, (byte) 4, this.field196);
                if (var4) {
                    this.field288 = true;
                }
            }
            if (this.field575 == 2) {
                this.field288 = true;
            }
            if (this.field381 == 2) {
                this.field288 = true;
            }
            if (this.field288) {
                this.method145(-21824);
                this.field288 = false;
            }
            if (this.field111 == -1 && this.field437 == 0) {
                this.field190.field1198 = this.field210 - this.field119 - 77;
                if (super.field1346 > 448 && super.field1346 < 560 && super.field1347 > 332) {
                    this.method62(77, 463, this.field210, -10523, super.field1347 - 357, this.field190, -1, 0, super.field1346 - 17);
                }
                int var5 = this.field210 - 77 - this.field190.field1198;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field210 - 77) {
                    var5 = this.field210 - 77;
                }
                if (this.field119 != var5) {
                    this.field119 = var5;
                    this.field168 = true;
                }
                ++field308;
                if (field308 > 156) {
                    field308 = 0;
                    this.field92.method457(525, 80);
                    this.field92.method458(96);
                }
            }
            if (this.field111 == -1 && this.field437 == 3) {
                int var6 = this.field502 * 14 + 7;
                this.field190.field1198 = this.field505;
                if (super.field1346 > 448 && super.field1346 < 560 && super.field1347 > 332) {
                    this.method62(77, 463, var6, -10523, super.field1347 - 357, this.field190, -1, 0, super.field1346 - 17);
                }
                int var7 = this.field190.field1198;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field505 != var7) {
                    this.field505 = var7;
                    this.field168 = true;
                }
            }
            if (this.field111 != -1) {
                boolean var8 = this.method56(this.field111, (byte) 4, this.field196);
                if (var8) {
                    this.field168 = true;
                }
            }
            if (this.field575 == 3) {
                this.field168 = true;
            }
            if (this.field381 == 3) {
                this.field168 = true;
            }
            if (this.field320 != null) {
                this.field168 = true;
            }
            if (this.field293 && this.field511 == 2) {
                this.field168 = true;
            }
            if (this.field168) {
                this.method142(0);
                this.field168 = false;
            }
            if (this.field90 == 2) {
                this.method44(0);
                this.field525.method542(7, 4, 550, super.field1338);
            }
            if (this.field186 != -1) {
                this.field451 = true;
            }
            if (this.field451) {
                if (this.field186 != -1 && this.field404 == this.field186) {
                    this.field186 = -1;
                    this.field92.method457(525, 255);
                    this.field92.method458(this.field404);
                }
                this.field451 = false;
                this.field318.method541((byte) 3);
                this.field364.method539(0, 0, 714);
                if (this.field133 == -1) {
                    if (this.field566[this.field404] != -1) {
                        if (this.field404 == 0) {
                            this.field580.method539(22, 10, 714);
                        }
                        if (this.field404 == 1) {
                            this.field581.method539(54, 8, 714);
                        }
                        if (this.field404 == 2) {
                            this.field581.method539(82, 8, 714);
                        }
                        if (this.field404 == 3) {
                            this.field582.method539(110, 8, 714);
                        }
                        if (this.field404 == 4) {
                            this.field584.method539(153, 8, 714);
                        }
                        if (this.field404 == 5) {
                            this.field584.method539(181, 8, 714);
                        }
                        if (this.field404 == 6) {
                            this.field583.method539(209, 9, 714);
                        }
                    }
                    if (this.field566[0] != -1 && (this.field186 != 0 || field291 % 20 < 10)) {
                        this.field567[0].method539(29, 13, 714);
                    }
                    if (this.field566[1] != -1 && (this.field186 != 1 || field291 % 20 < 10)) {
                        this.field567[1].method539(53, 11, 714);
                    }
                    if (this.field566[2] != -1 && (this.field186 != 2 || field291 % 20 < 10)) {
                        this.field567[2].method539(82, 11, 714);
                    }
                    if (this.field566[3] != -1 && (this.field186 != 3 || field291 % 20 < 10)) {
                        this.field567[3].method539(115, 12, 714);
                    }
                    if (this.field566[4] != -1 && (this.field186 != 4 || field291 % 20 < 10)) {
                        this.field567[4].method539(153, 13, 714);
                    }
                    if (this.field566[5] != -1 && (this.field186 != 5 || field291 % 20 < 10)) {
                        this.field567[5].method539(180, 11, 714);
                    }
                    if (this.field566[6] != -1 && (this.field186 != 6 || field291 % 20 < 10)) {
                        this.field567[6].method539(208, 13, 714);
                    }
                }
                this.field318.method542(7, 160, 516, super.field1338);
                ++field220;
                if (field220 > 61) {
                    field220 = 0;
                    this.field92.method457(525, 1);
                }
                this.field317.method541((byte) 3);
                this.field363.method539(0, 0, 714);
                if (this.field133 == -1) {
                    if (this.field566[this.field404] != -1) {
                        if (this.field404 == 7) {
                            this.field528.method539(42, 0, 714);
                        }
                        if (this.field404 == 8) {
                            this.field529.method539(74, 0, 714);
                        }
                        if (this.field404 == 9) {
                            this.field529.method539(102, 0, 714);
                        }
                        if (this.field404 == 10) {
                            this.field530.method539(130, 1, 714);
                        }
                        if (this.field404 == 11) {
                            this.field532.method539(173, 0, 714);
                        }
                        if (this.field404 == 12) {
                            this.field532.method539(201, 0, 714);
                        }
                        if (this.field404 == 13) {
                            this.field531.method539(229, 0, 714);
                        }
                    }
                    if (this.field566[8] != -1 && (this.field186 != 8 || field291 % 20 < 10)) {
                        this.field567[7].method539(74, 2, 714);
                    }
                    if (this.field566[9] != -1 && (this.field186 != 9 || field291 % 20 < 10)) {
                        this.field567[8].method539(102, 3, 714);
                    }
                    if (this.field566[10] != -1 && (this.field186 != 10 || field291 % 20 < 10)) {
                        this.field567[9].method539(137, 4, 714);
                    }
                    if (this.field566[11] != -1 && (this.field186 != 11 || field291 % 20 < 10)) {
                        this.field567[10].method539(174, 2, 714);
                    }
                    if (this.field566[12] != -1 && (this.field186 != 12 || field291 % 20 < 10)) {
                        this.field567[11].method539(201, 2, 714);
                    }
                    if (this.field566[13] != -1 && (this.field186 != 13 || field291 % 20 < 10)) {
                        this.field567[12].method539(226, 2, 714);
                    }
                }
                this.field317.method542(7, 466, 496, super.field1338);
                this.field526.method541((byte) 3);
                class49.field1385 = this.field458;
            }
            if (this.field377) {
                this.field377 = false;
                this.field316.method541((byte) 3);
                this.field362.method539(0, 0, 714);
                this.field164.method591(28, 55, true, -918, "Public chat", 16777215);
                if (this.field337 == 0) {
                    this.field164.method591(41, 55, true, -918, "On", 65280);
                }
                if (this.field337 == 1) {
                    this.field164.method591(41, 55, true, -918, "Friends", 16776960);
                }
                if (this.field337 == 2) {
                    this.field164.method591(41, 55, true, -918, "Off", 16711680);
                }
                if (this.field337 == 3) {
                    this.field164.method591(41, 55, true, -918, "Hide", 65535);
                }
                this.field164.method591(28, 184, true, -918, "Private chat", 16777215);
                if (this.field403 == 0) {
                    this.field164.method591(41, 184, true, -918, "On", 65280);
                }
                if (this.field403 == 1) {
                    this.field164.method591(41, 184, true, -918, "Friends", 16776960);
                }
                if (this.field403 == 2) {
                    this.field164.method591(41, 184, true, -918, "Off", 16711680);
                }
                this.field164.method591(28, 324, true, -918, "Trade/compete", 16777215);
                if (this.field256 == 0) {
                    this.field164.method591(41, 324, true, -918, "On", 65280);
                }
                if (this.field256 == 1) {
                    this.field164.method591(41, 324, true, -918, "Friends", 16776960);
                }
                if (this.field256 == 2) {
                    this.field164.method591(41, 324, true, -918, "Off", 16711680);
                }
                this.field164.method591(33, 458, true, -918, "Report abuse", 16777215);
                this.field316.method542(7, 453, 0, super.field1338);
                this.field526.method541((byte) 3);
                class49.field1385 = this.field458;
            }
            this.field196 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 != 2) {
            field481 = -138;
        }
        int[] var3 = this.field350.field1431;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field352[arg0][var25][var6] & 24) == 0) {
                    this.field509.method319(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (this.field352[arg0 + 1][var25][var6] & 8) != 0) {
                    this.field509.method319(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field350.method443((byte) 3);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field352[arg0][var23][var9] & 24) == 0) {
                    this.method74(-1730, var7, var23, var9, arg0, var8);
                }
                if (arg0 < 3 && (this.field352[arg0 + 1][var23][var9] & 8) != 0) {
                    this.method74(-1730, var7, var23, var9, arg0 + 1, var8);
                }
            }
        }
        if (this.field526 != null) {
            this.field526.method541((byte) 3);
            class49.field1385 = this.field458;
        }
        ++field205;
        if (field205 > 1530) {
            field205 = 0;
            this.field92.method457(525, 221);
            this.field92.method458(0);
            int var10 = this.field92.field1457;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field92.method458(208);
            }
            this.field92.method459(61880);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field92.method459(9307);
            }
            this.field92.method459((int) (Math.random() * 65536.0D));
            this.field92.method459((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field92.method458(227);
            }
            this.field92.method459((int) (Math.random() * 65536.0D));
            this.field92.method459(6023);
            this.field92.method458(127);
            this.field92.method459(54661);
            this.field92.method467(this.field92.field1457 - var10, this.field263);
        }
        this.field461 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field509.method313(this.field237, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class63.method555(var14).field1593;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field533[this.field237].field1480;
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
                        this.field132[this.field461] = this.field589[var15];
                        this.field462[this.field461] = var16;
                        this.field463[this.field461] = var17;
                        ++this.field461;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;BILjava/lang/String;)LSXKKBWPU;")
    public final class50 method130(int arg0, int arg1, String arg2, byte arg3, int arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field467[0] != null) {
                var7 = this.field467[0].method527(3, arg0);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field140.reset();
            this.field140.update(var7);
            int var9 = (int) this.field140.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class50(var7, 7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method61(arg4, (byte) -127, "Requesting " + arg5);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method172(arg2 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class53 var17 = new class53(var16, -631);
                    var17.field1457 = 3;
                    int var18 = var17.method472() + 6;
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
                            this.method61(arg4, (byte) -127, "Loading " + arg5 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field467[0] != null) {
                            this.field467[0].method528(var7.length, (byte) 74, var7, arg0);
                        }
                    } catch (Exception var29) {
                        this.field467[0] = null;
                    }
                    if (var7 != null) {
                        this.field140.reset();
                        this.field140.update(var7);
                        int var24 = (int) this.field140.getValue();
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
                            this.method61(arg4, (byte) -127, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method61(arg4, (byte) -127, var12 + " - Retrying in " + var26);
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
                    this.field521 = !this.field521;
                }
            }
            class50 var27 = new class50(var7, 7);
            if (arg3 != 49) {
                throw new NullPointerException();
            } else {
                return var27;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILYANZSPIT;IZI)V")
    public final void method131(int arg0, class66 arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.field139 = -69;
        }
        if (this.field455 < 400) {
            if (arg1.field1638 != null) {
                arg1 = arg1.method568(this.field579);
            }
            if (arg1 != null) {
                if (arg1.field1634) {
                    String var6 = arg1.field1644;
                    if (arg1.field1620 != 0) {
                        var6 = var6 + method99(arg1.field1620, field304.field607, -27024) + " (level-" + arg1.field1620 + ")";
                    }
                    if (this.field425 == 1) {
                        this.field409[this.field455] = "Use " + this.field429 + " with @yel@" + var6;
                        this.field537[this.field455] = 776;
                        this.field538[this.field455] = arg0;
                        this.field535[this.field455] = arg2;
                        this.field536[this.field455] = arg4;
                        ++this.field455;
                    } else {
                        if (this.field431 == 1) {
                            if ((this.field433 & 2) == 2) {
                                this.field409[this.field455] = this.field434 + " @yel@" + var6;
                                this.field537[this.field455] = 719;
                                this.field538[this.field455] = arg0;
                                this.field535[this.field455] = arg2;
                                this.field536[this.field455] = arg4;
                                ++this.field455;
                                return;
                            }
                        } else {
                            if (arg1.field1640 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg1.field1640[var7] != null && !arg1.field1640[var7].equalsIgnoreCase("attack")) {
                                        this.field409[this.field455] = arg1.field1640[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field537[this.field455] = 184;
                                        }
                                        if (var7 == 1) {
                                            this.field537[this.field455] = 49;
                                        }
                                        if (var7 == 2) {
                                            this.field537[this.field455] = 356;
                                        }
                                        if (var7 == 3) {
                                            this.field537[this.field455] = 80;
                                        }
                                        if (var7 == 4) {
                                            this.field537[this.field455] = 113;
                                        }
                                        this.field538[this.field455] = arg0;
                                        this.field535[this.field455] = arg2;
                                        this.field536[this.field455] = arg4;
                                        ++this.field455;
                                    }
                                }
                            }
                            if (arg1.field1640 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field1640[var8] != null && arg1.field1640[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg1.field1620 > field304.field607) {
                                            var9 = 2000;
                                        }
                                        this.field409[this.field455] = arg1.field1640[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field537[this.field455] = var9 + 184;
                                        }
                                        if (var8 == 1) {
                                            this.field537[this.field455] = var9 + 49;
                                        }
                                        if (var8 == 2) {
                                            this.field537[this.field455] = var9 + 356;
                                        }
                                        if (var8 == 3) {
                                            this.field537[this.field455] = var9 + 80;
                                        }
                                        if (var8 == 4) {
                                            this.field537[this.field455] = var9 + 113;
                                        }
                                        this.field538[this.field455] = arg0;
                                        this.field535[this.field455] = arg2;
                                        this.field536[this.field455] = arg4;
                                        ++this.field455;
                                    }
                                }
                            }
                            this.field409[this.field455] = "Examine @yel@" + var6;
                            this.field537[this.field455] = 1827;
                            this.field538[this.field455] = arg0;
                            this.field535[this.field455] = arg2;
                            this.field536[this.field455] = arg4;
                            ++this.field455;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method132(byte arg0) {
        this.field464 = null;
        this.field97 = null;
        this.field589 = null;
        this.field535 = null;
        this.field536 = null;
        this.field537 = null;
        this.field538 = null;
        this.field409 = null;
        this.field385 = null;
        this.method33(0);
        if (this.field450 != null) {
            this.field450.field1608 = false;
        }
        this.field450 = null;
        this.field462 = null;
        this.field463 = null;
        this.field132 = null;
        this.field593 = null;
        this.field234 = null;
        this.field389 = null;
        this.field241 = null;
        this.field131 = null;
        this.field430 = null;
        this.field247 = null;
        this.field562 = null;
        this.field167 = null;
        this.field248 = null;
        this.field249 = null;
        this.field580 = null;
        this.field581 = null;
        this.field582 = null;
        this.field583 = null;
        this.field584 = null;
        if (this.field194 != null) {
            this.field194.method202();
        }
        this.field194 = null;
        this.field328 = null;
        this.field329 = null;
        this.field330 = null;
        this.field331 = null;
        this.field137 = null;
        this.field391 = null;
        this.field154 = null;
        this.field155 = null;
        this.field151 = null;
        this.field152 = null;
        this.field153 = null;
        this.field322 = null;
        this.field323 = null;
        this.field324 = null;
        this.field325 = null;
        this.field326 = null;
        this.field362 = null;
        this.field363 = null;
        this.field364 = null;
        this.field417 = null;
        this.field419 = null;
        this.field421 = null;
        this.field422 = null;
        this.field313 = null;
        this.field156 = null;
        this.field157 = null;
        this.field158 = null;
        this.field159 = null;
        this.field278 = null;
        this.field352 = null;
        this.field509 = null;
        this.field533 = null;
        this.field524 = null;
        this.field525 = null;
        this.field526 = null;
        this.field527 = null;
        try {
            if (this.field107 != null) {
                this.field107.method273();
            }
        } catch (Exception var3) {
        }
        this.field107 = null;
        this.field92 = null;
        this.field103 = null;
        this.field327 = null;
        this.field125 = null;
        this.field507 = null;
        this.field390 = null;
        this.field508 = null;
        this.field264 = null;
        this.field355 = null;
        this.field118 = null;
        this.field303 = null;
        this.field332 = null;
        this.field333 = null;
        this.field334 = null;
        this.field335 = null;
        this.field336 = null;
        this.field126 = null;
        this.field128 = null;
        this.field567 = null;
        this.field528 = null;
        this.field529 = null;
        this.field530 = null;
        this.field531 = null;
        this.field532 = null;
        this.field214 = null;
        this.field123 = null;
        this.field178 = null;
        this.field179 = null;
        this.field316 = null;
        this.field317 = null;
        this.field318 = null;
        this.field350 = null;
        this.field217 = null;
        this.field218 = null;
        this.field219 = null;
        this.method90(515);
        class63.method560(5);
        class66.method562(5);
        class67.method577(5);
        class37.method362(5);
        class24.field852 = null;
        class9.field635 = null;
        class12.field668 = null;
        class30.field982 = null;
        class45.field1307 = null;
        class45.field1319 = null;
        class34.field1090 = null;
        super.field1339 = null;
        class8.field612 = null;
        class49.method424(5);
        class32.method283(5);
        class25.method242(5);
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field259 = this.field327.method468();
        }
        class48.method421(5);
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
    public final void method133(String arg0, String arg1, byte arg2, int arg3) {
        if (arg3 == 0 && this.field577 != -1) {
            this.field320 = arg1;
            super.field1352 = 0;
        }
        if (this.field111 == -1) {
            this.field168 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field392[var5] = this.field392[var5 - 1];
            this.field393[var5] = this.field393[var5 - 1];
            this.field394[var5] = this.field394[var5 - 1];
        }
        this.field392[0] = arg3;
        if (arg2 != -30) {
            this.field176 = !this.field176;
        }
        this.field393[0] = arg0;
        this.field394[0] = arg1;
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public static final void method134(int arg0) {
        class32.field1018 = true;
        class49.field1374 = true;
        field494 = true;
        class2.field16 = true;
        int var1 = 64 / arg0;
        class63.field1602 = true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOMJBPTVL;B)I")
    public final int method135(int arg0, class37 arg1, byte arg2) {
        if (arg2 != -76) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1.field1156 != null && arg0 < arg1.field1156.length) {
            try {
                int[] var5 = arg1.field1156[arg0];
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
                        var10 = this.field468[var5[var7++]];
                    }
                    if (var9 == 2) {
                        var10 = this.field273[var5[var7++]];
                    }
                    if (var9 == 3) {
                        var10 = this.field361[var5[var7++]];
                    }
                    if (var9 == 4) {
                        class37 var12 = class37.method359(var5[var7++]);
                        int var13 = var5[var7++];
                        if (var13 >= 0 && var13 < class67.field1682 && (!class67.method575(var13).field1658 || field493)) {
                            for (int var14 = 0; var14 < var12.field1167.length; ++var14) {
                                if (var13 + 1 == var12.field1167[var14]) {
                                    var10 += var12.field1209[var14];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var10 = this.field385[var5[var7++]];
                    }
                    if (var9 == 6) {
                        var10 = field232[this.field273[var5[var7++]] - 1];
                    }
                    if (var9 == 7) {
                        var10 = this.field385[var5[var7++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var10 = field304.field607;
                    }
                    if (var9 == 9) {
                        for (int var15 = 0; var15 < class10.field642; ++var15) {
                            if (class10.field644[var15]) {
                                var10 += this.field273[var15];
                            }
                        }
                    }
                    if (var9 == 10) {
                        class37 var16 = class37.method359(var5[var7++]);
                        int var17 = var5[var7++] + 1;
                        if (var17 >= 0 && var17 < class67.field1682 && (!class67.method575(var17).field1658 || field493)) {
                            for (int var18 = 0; var18 < var16.field1167.length; ++var18) {
                                if (var16.field1167[var18] == var17) {
                                    var10 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var10 = this.field560;
                    }
                    if (var9 == 12) {
                        var10 = this.field160;
                    }
                    if (var9 == 13) {
                        int var19 = this.field385[var5[var7++]];
                        int var20 = var5[var7++];
                        var10 = (var19 & 1 << var20) != 0 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var21 = var5[var7++];
                        class5 var22 = class5.field74[var21];
                        int var23 = var22.field76;
                        int var24 = var22.field77;
                        int var25 = var22.field78;
                        int var26 = field306[var25 - var24];
                        var10 = this.field385[var23] >> var24 & var26;
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
                        var10 = (field304.field830 >> 7) + this.field472;
                    }
                    if (var9 == 19) {
                        var10 = (field304.field831 >> 7) + this.field473;
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

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (this.field367 != 0) {
            int var2 = 0;
            if (this.field275 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field394[var3] != null) {
                    int var4 = this.field392[var3];
                    String var5 = this.field393[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field403 == 0 || this.field403 == 1 && this.method65(var5, false))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1346 > 4 && super.field1347 - 4 > var9 - 10 && super.field1347 - 4 <= var9 + 3) {
                            int var10 = this.field164.method592(-6377, "From:  " + var5 + this.field394[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1346 < var10 + 4) {
                                if (this.field305 >= 1) {
                                    this.field409[this.field455] = "Report abuse @whi@" + var5;
                                    this.field537[this.field455] = 2550;
                                    ++this.field455;
                                }
                                this.field409[this.field455] = "Add ignore @whi@" + var5;
                                this.field537[this.field455] = 2955;
                                ++this.field455;
                                this.field409[this.field455] = "Add friend @whi@" + var5;
                                this.field537[this.field455] = 2646;
                                ++this.field455;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field403 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 < 3 || arg0 > 3) {
                this.field139 = this.field592.method335();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method137(byte arg0) {
        if (!this.field445 && !this.field499 && !this.field231) {
            ++field192;
            if (arg0 != 71) {
                this.field92.method458(53);
            }
            if (!this.field344) {
                this.method71(false, true);
            } else {
                this.method128((byte) -50);
            }
            this.field347 = 0;
        } else {
            this.method50((byte) 8);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method138(int arg0, boolean arg1) {
        int var3 = class34.field1090[arg0].field1098;
        if (var3 != 0) {
            int var4 = this.field385[arg0];
            if (!arg1) {
                this.field137 = null;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class49.method433(true, 0.9D);
                }
                if (var4 == 2) {
                    class49.method433(true, 0.8D);
                }
                if (var4 == 3) {
                    class49.method433(true, 0.7D);
                }
                if (var4 == 4) {
                    class49.method433(true, 0.6D);
                }
                class67.field1679.method232();
                this.field251 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field113;
                if (var4 == 0) {
                    this.method106(false, this.field113, 0);
                    this.field113 = true;
                }
                if (var4 == 1) {
                    this.method106(false, this.field113, -400);
                    this.field113 = true;
                }
                if (var4 == 2) {
                    this.method106(false, this.field113, -800);
                    this.field113 = true;
                }
                if (var4 == 3) {
                    this.method106(false, this.field113, -1200);
                    this.field113 = true;
                }
                if (var4 == 4) {
                    this.field113 = false;
                }
                if (this.field113 != var5 && !field494) {
                    if (this.field113) {
                        this.field141 = this.field189;
                        this.field142 = true;
                        this.field194.method213(2, this.field141);
                    } else {
                        this.method33(0);
                    }
                    this.field284 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field465 = true;
                    this.method40(-826, 0);
                }
                if (var4 == 1) {
                    this.field465 = true;
                    this.method40(-826, -400);
                }
                if (var4 == 2) {
                    this.field465 = true;
                    this.method40(-826, -800);
                }
                if (var4 == 3) {
                    this.field465 = true;
                    this.method40(-826, -1200);
                }
                if (var4 == 4) {
                    this.field465 = false;
                }
            }
            if (var3 == 5) {
                this.field88 = var4;
            }
            if (var3 == 6) {
                this.field315 = var4;
            }
            if (var3 == 8) {
                this.field367 = var4;
                this.field168 = true;
            }
            if (var3 == 9) {
                this.field510 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LVCTXURSE;I)V")
    public final void method139(class59 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field289.length; ++var4) {
            this.field289[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field289[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field290[var16] = (this.field289[var16 - 1] + this.field289[var16 + 1] + this.field289[var16 - 128] + this.field289[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field289;
            this.field289 = this.field290;
            this.field290 = var14;
        }
        if (arg1 != 48162) {
            this.method158();
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1526; ++var8) {
                for (int var9 = 0; var9 < arg0.field1525; ++var9) {
                    if (arg0.field1523[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1527;
                        int var11 = var8 + 16 + arg0.field1528;
                        int var12 = (var11 << 7) + var10;
                        this.field289[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method140(int arg0, byte[] arg1, int arg2) {
        this.field258 += arg0;
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method141(int arg0) {
        if (this.field425 == 0 && this.field431 == 0) {
            this.field409[this.field455] = "Walk here";
            this.field537[this.field455] = 134;
            this.field535[this.field455] = super.field1346;
            this.field536[this.field455] = super.field1347;
            ++this.field455;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class25.field936; ++var3) {
            int var5 = class25.field937[var3];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field509.method314(this.field237, var6, var7, var5) >= 0) {
                    class63 var10 = class63.method555(var9);
                    if (var10.field1573 != null) {
                        var10 = var10.method557((byte) 2);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field425 == 1) {
                        this.field409[this.field455] = "Use " + this.field429 + " with @cya@" + var10.field1603;
                        this.field537[this.field455] = 413;
                        this.field538[this.field455] = var5;
                        this.field535[this.field455] = var6;
                        this.field536[this.field455] = var7;
                        ++this.field455;
                    } else if (this.field431 == 1) {
                        if ((this.field433 & 4) == 4) {
                            this.field409[this.field455] = this.field434 + " @cya@" + var10.field1603;
                            this.field537[this.field455] = 382;
                            this.field538[this.field455] = var5;
                            this.field535[this.field455] = var6;
                            this.field536[this.field455] = var7;
                            ++this.field455;
                        }
                    } else {
                        if (var10.field1592 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1592[var11] != null) {
                                    this.field409[this.field455] = var10.field1592[var11] + " @cya@" + var10.field1603;
                                    if (var11 == 0) {
                                        this.field537[this.field455] = 286;
                                    }
                                    if (var11 == 1) {
                                        this.field537[this.field455] = 88;
                                    }
                                    if (var11 == 2) {
                                        this.field537[this.field455] = 377;
                                    }
                                    if (var11 == 3) {
                                        this.field537[this.field455] = 383;
                                    }
                                    if (var11 == 4) {
                                        this.field537[this.field455] = 1536;
                                    }
                                    this.field538[this.field455] = var5;
                                    this.field535[this.field455] = var6;
                                    this.field536[this.field455] = var7;
                                    ++this.field455;
                                }
                            }
                        }
                        this.field409[this.field455] = "Examine @cya@" + var10.field1603;
                        this.field537[this.field455] = 1273;
                        this.field538[this.field455] = var10.field1570 << 14;
                        this.field535[this.field455] = var6;
                        this.field536[this.field455] = var7;
                        ++this.field455;
                    }
                }
                if (var8 == 1) {
                    class15 var12 = this.field126[var9];
                    if (var12.field709.field1616 == 1 && (var12.field830 & 127) == 64 && (var12.field831 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field127; ++var13) {
                            class15 var16 = this.field126[this.field128[var13]];
                            if (var16 != null && var12 != var16 && var16.field709.field1616 == 1 && var12.field830 == var16.field830 && var12.field831 == var16.field831) {
                                this.method131(this.field128[var13], var16.field709, var6, false, var7);
                            }
                        }
                        for (int var14 = 0; var14 < this.field418; ++var14) {
                            class8 var15 = this.field417[this.field419[var14]];
                            if (var15 != null && var12.field830 == var15.field830 && var12.field831 == var15.field831) {
                                this.method31(var15, this.field419[var14], false, var6, var7);
                            }
                        }
                    }
                    this.method131(var9, var12.field709, var6, false, var7);
                }
                if (var8 == 0) {
                    class8 var17 = this.field417[var9];
                    if ((var17.field830 & 127) == 64 && (var17.field831 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field127; ++var18) {
                            class15 var21 = this.field126[this.field128[var18]];
                            if (var21 != null && var21.field709.field1616 == 1 && var17.field830 == var21.field830 && var17.field831 == var21.field831) {
                                this.method131(this.field128[var18], var21.field709, var6, false, var7);
                            }
                        }
                        for (int var19 = 0; var19 < this.field418; ++var19) {
                            class8 var20 = this.field417[this.field419[var19]];
                            if (var20 != null && var17 != var20 && var17.field830 == var20.field830 && var17.field831 == var20.field831) {
                                this.method31(var20, this.field419[var19], false, var6, var7);
                            }
                        }
                    }
                    this.method31(var17, var9, false, var6, var7);
                }
                if (var8 == 3) {
                    class7 var22 = this.field137[this.field237][var6][var7];
                    if (var22 != null) {
                        for (class14 var23 = (class14) var22.method180((byte) 7); var23 != null; var23 = (class14) var22.method182(false)) {
                            class67 var24 = class67.method575(var23.field704);
                            if (this.field425 == 1) {
                                this.field409[this.field455] = "Use " + this.field429 + " with @lre@" + var24.field1709;
                                this.field537[this.field455] = 380;
                                this.field538[this.field455] = var23.field704;
                                this.field535[this.field455] = var6;
                                this.field536[this.field455] = var7;
                                ++this.field455;
                            } else if (this.field431 == 1) {
                                if ((this.field433 & 1) == 1) {
                                    this.field409[this.field455] = this.field434 + " @lre@" + var24.field1709;
                                    this.field537[this.field455] = 545;
                                    this.field538[this.field455] = var23.field704;
                                    this.field535[this.field455] = var6;
                                    this.field536[this.field455] = var7;
                                    ++this.field455;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1707 != null && var24.field1707[var25] != null) {
                                        this.field409[this.field455] = var24.field1707[var25] + " @lre@" + var24.field1709;
                                        if (var25 == 0) {
                                            this.field537[this.field455] = 409;
                                        }
                                        if (var25 == 1) {
                                            this.field537[this.field455] = 4;
                                        }
                                        if (var25 == 2) {
                                            this.field537[this.field455] = 856;
                                        }
                                        if (var25 == 3) {
                                            this.field537[this.field455] = 145;
                                        }
                                        if (var25 == 4) {
                                            this.field537[this.field455] = 756;
                                        }
                                        this.field538[this.field455] = var23.field704;
                                        this.field535[this.field455] = var6;
                                        this.field536[this.field455] = var7;
                                        ++this.field455;
                                    } else if (var25 == 2) {
                                        this.field409[this.field455] = "Take @lre@" + var24.field1709;
                                        this.field537[this.field455] = 856;
                                        this.field538[this.field455] = var23.field704;
                                        this.field535[this.field455] = var6;
                                        this.field536[this.field455] = var7;
                                        ++this.field455;
                                    }
                                }
                                this.field409[this.field455] = "Examine @lre@" + var24.field1709;
                                this.field537[this.field455] = 1438;
                                this.field538[this.field455] = var23.field704;
                                this.field535[this.field455] = var6;
                                this.field536[this.field455] = var7;
                                ++this.field455;
                            }
                        }
                    }
                }
            }
        }
        int var4 = 30 / arg0;
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method142(int arg0) {
        this.field527.method541((byte) 3);
        class49.field1385 = this.field456;
        this.field219.method539(0, 0, 714);
        if (this.field506) {
            this.field165.method590(0, 0, 239, this.field438, 40);
            this.field165.method590(0, 128, 239, this.field534 + "*", 60);
        } else if (this.field437 == 1) {
            this.field165.method590(0, 0, 239, "Enter amount:", 40);
            this.field165.method590(0, 128, 239, this.field339 + "*", 60);
        } else if (this.field437 == 2) {
            this.field165.method590(0, 0, 239, "Enter name:", 40);
            this.field165.method590(0, 128, 239, this.field339 + "*", 60);
        } else if (this.field437 == 3) {
            if (this.field501 != this.field339) {
                this.method170(0, this.field339);
                this.field501 = this.field339;
            }
            class71 var2 = this.field164;
            class35.method342(0, 0, 463, 77, 14641);
            for (int var3 = 0; var3 < this.field502; ++var3) {
                int var4 = var3 * 14 + 18 - this.field505;
                if (var4 > 0 && var4 < 110) {
                    var2.method590(0, 0, 239, this.field503[var3], var4);
                }
            }
            class35.method341(2);
            if (this.field502 > 5) {
                this.method85(0, true, 77, this.field502 * 14 + 7, 463, this.field505);
            }
            if (this.field339.length() == 0) {
                this.field165.method590(0, 255, 239, "Enter object name", 40);
            } else if (this.field502 == 0) {
                this.field165.method590(0, 0, 239, "No matching objects found, please shorten search", 40);
            }
            var2.method590(0, 0, 239, this.field339 + "*", 90);
            class35.method348(0, 0, 77, 0, 479);
        } else if (this.field320 != null) {
            this.field165.method590(0, 0, 239, this.field320, 40);
            this.field165.method590(0, 128, 239, "Click to continue", 60);
        } else if (this.field111 != -1) {
            this.method89(127, 0, 0, 0, class37.method359(this.field111));
        } else if (this.field577 != -1) {
            this.method89(127, 0, 0, 0, class37.method359(this.field577));
        } else {
            class71 var5 = this.field164;
            int var6 = 0;
            class35.method342(0, 0, 463, 77, 14641);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field394[var7] != null) {
                    int var9 = this.field392[var7];
                    int var10 = 70 - var6 * 14 + this.field119;
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
                            var5.method594(var10, 0, this.field394[var7], 914, 4);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field337 == 0 || this.field337 == 1 && this.method65(var11, false))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field162[0].method539(var13, var10 - 12, 714);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field162[1].method539(var13, var10 - 12, 714);
                                var13 += 14;
                            }
                            var5.method594(var10, 0, var11 + ":", 914, var13);
                            int var14 = var13 + var5.method592(-6377, var11) + 8;
                            var5.method594(var10, 255, this.field394[var7], 914, var14);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field367 == 0 && (var9 == 7 || this.field403 == 0 || this.field403 == 1 && this.method65(var11, false))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method594(var10, 0, "From", 914, var15);
                            int var16 = var15 + var5.method592(-6377, "From ");
                            if (var12 == 1) {
                                this.field162[0].method539(var16, var10 - 12, 714);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field162[1].method539(var16, var10 - 12, 714);
                                var16 += 14;
                            }
                            var5.method594(var10, 0, var11 + ":", 914, var16);
                            int var17 = var16 + var5.method592(-6377, var11) + 8;
                            var5.method594(var10, 8388608, this.field394[var7], 914, var17);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field256 == 0 || this.field256 == 1 && this.method65(var11, false))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method594(var10, 8388736, var11 + " " + this.field394[var7], 914, 4);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field367 == 0 && this.field403 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method594(var10, 8388608, this.field394[var7], 914, 4);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field367 == 0 && this.field403 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method594(var10, 0, "To " + var11 + ":", 914, 4);
                            var5.method594(var10, 8388608, this.field394[var7], 914, 12 + var5.method592(-6377, "To " + var11));
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field256 == 0 || this.field256 == 1 && this.method65(var11, false))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method594(var10, 8270336, var11 + " " + this.field394[var7], 914, 4);
                        }
                        ++var6;
                    }
                }
            }
            class35.method341(2);
            this.field210 = var6 * 14 + 7;
            if (this.field210 < 78) {
                this.field210 = 78;
            }
            this.method85(0, true, 77, this.field210, 463, this.field210 - this.field119 - 77);
            String var8;
            if (field304 != null && field304.field615 != null) {
                var8 = field304.field615;
            } else {
                var8 = class41.method409(-354, this.field448);
            }
            var5.method594(90, 0, var8 + ":", 914, 4);
            var5.method594(90, 255, this.field114 + "*", 914, 6 + var5.method592(-6377, var8 + ": "));
            class35.method348(0, 0, 77, 0, 479);
        }
        if (this.field293 && this.field511 == 2) {
            this.method72(-10414);
        }
        this.field527.method542(7, 357, 17, super.field1338);
        this.field526.method541((byte) 3);
        class49.field1385 = this.field458;
        this.field258 += arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method143(boolean arg0, int arg1) {
        class37 var3 = class37.method359(arg1);
        for (int var4 = 0; var4 < var3.field1155.length && var3.field1155[var4] != -1; ++var4) {
            class37 var5 = class37.method359(var3.field1155[var4]);
            if (var5.field1145 == 1) {
                this.method143(true, var5.field1202);
            }
            var5.field1166 = 0;
            var5.field1158 = 0;
        }
        this.field344 &= arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ[B)V")
    public final void method144(byte arg0, boolean arg1, byte[] arg2) {
        if (this.field113) {
            signlink.midifade = arg1 ? 1 : 0;
            signlink.midisave(arg2, arg2.length);
            if (arg0 != -91) {
                this.field257 = this.field592.method335();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1341 != null) {
                    return new URL("http://127.0.0.1:" + (field492 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.field524.method541((byte) 3);
        if (arg0 != -21824) {
            this.field498 = !this.field498;
        }
        class49.field1385 = this.field457;
        this.field217.method539(0, 0, 714);
        if (this.field133 != -1) {
            this.method89(127, 0, 0, 0, class37.method359(this.field133));
        } else if (this.field566[this.field404] != -1) {
            this.method89(127, 0, 0, 0, class37.method359(this.field566[this.field404]));
        }
        if (this.field293 && this.field511 == 1) {
            this.method72(-10414);
        }
        this.field524.method542(7, 205, 553, super.field1338);
        this.field526.method541((byte) 3);
        class49.field1385 = this.field458;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method146(byte arg0) {
        ++field309;
        if (arg0 != -33) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field309 > 114) {
            field309 = 0;
            this.field92.method457(525, 239);
            this.field92.method461(15039916);
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method418(false);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field99 != -1 && this.field99 == this.field408) {
                        if (var3 == 8 && this.field371.length() > 0) {
                            this.field371 = this.field371.substring(0, this.field371.length() - 1);
                        }
                        break;
                    }
                    if (this.field506) {
                        if (var3 >= 32 && var3 <= 122 && this.field534.length() < 80) {
                            this.field534 = this.field534 + (char) var3;
                            this.field168 = true;
                        }
                        if (var3 == 8 && this.field534.length() > 0) {
                            this.field534 = this.field534.substring(0, this.field534.length() - 1);
                            this.field168 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field506 = false;
                            this.field168 = true;
                            if (this.field406 == 1) {
                                long var4 = class41.method405(this.field534);
                                this.method160(var4, false);
                            }
                            if (this.field406 == 2 && this.field564 > 0) {
                                long var6 = class41.method405(this.field534);
                                this.method92(var6, true);
                            }
                            if (this.field406 == 3 && this.field534.length() > 0) {
                                this.field92.method457(525, 135);
                                this.field92.method458(0);
                                int var8 = this.field92.field1457;
                                this.field92.method464(66, this.field173);
                                class6.method27(this.field534, 922, this.field92);
                                this.field92.method467(this.field92.field1457 - var8, this.field263);
                                this.field534 = class6.method28(this.field534, this.field338);
                                this.field534 = class40.method377(this.field534, this.field338);
                                this.method133(class41.method409(-354, class41.method406(this.field173, (byte) 1)), this.field534, (byte) -30, 6);
                                if (this.field403 == 2) {
                                    this.field403 = 1;
                                    this.field377 = true;
                                    this.field92.method457(525, 232);
                                    this.field92.method458(this.field337);
                                    this.field92.method458(this.field403);
                                    this.field92.method458(this.field256);
                                }
                            }
                            if (this.field406 == 4 && this.field161 < 100) {
                                long var9 = class41.method405(this.field534);
                                this.method55(var9, 4);
                            }
                            if (this.field406 == 5 && this.field161 > 0) {
                                long var11 = class41.method405(this.field534);
                                this.method115(var11, -778);
                            }
                        }
                    } else if (this.field437 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field339.length() < 10) {
                            this.field339 = this.field339 + (char) var3;
                            this.field168 = true;
                        }
                        if (var3 == 8 && this.field339.length() > 0) {
                            this.field339 = this.field339.substring(0, this.field339.length() - 1);
                            this.field168 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field339.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field339);
                                } catch (Exception var23) {
                                }
                                this.field92.method457(525, 151);
                                this.field92.method462(var13);
                            }
                            this.field437 = 0;
                            this.field168 = true;
                        }
                    } else if (this.field437 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field339.length() < 12) {
                            this.field339 = this.field339 + (char) var3;
                            this.field168 = true;
                        }
                        if (var3 == 8 && this.field339.length() > 0) {
                            this.field339 = this.field339.substring(0, this.field339.length() - 1);
                            this.field168 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field339.length() > 0) {
                                this.field92.method457(525, 158);
                                this.field92.method464(66, class41.method405(this.field339));
                            }
                            this.field437 = 0;
                            this.field168 = true;
                        }
                    } else if (this.field437 == 3) {
                        if (var3 >= 32 && var3 <= 122 && this.field339.length() < 40) {
                            this.field339 = this.field339 + (char) var3;
                            this.field168 = true;
                        }
                        if (var3 == 8 && this.field339.length() > 0) {
                            this.field339 = this.field339.substring(0, this.field339.length() - 1);
                            this.field168 = true;
                        }
                    } else if (this.field111 == -1 && this.field369 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field114.length() < 80) {
                            this.field114 = this.field114 + (char) var3;
                            this.field168 = true;
                        }
                        if (var3 == 8 && this.field114.length() > 0) {
                            this.field114 = this.field114.substring(0, this.field114.length() - 1);
                            this.field168 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field114.length() > 0) {
                            if (this.field305 == 2) {
                                if (this.field114.equals("::clientdrop")) {
                                    this.method60(false);
                                }
                                if (this.field114.equals("::lag")) {
                                    this.method166(0);
                                }
                                if (this.field114.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field194.method206(2, 32); ++var14) {
                                        this.field194.method211((byte) 1, var14, 0, 2);
                                    }
                                }
                                if (this.field114.equals("::fpson")) {
                                    field238 = true;
                                }
                                if (this.field114.equals("::fpsoff")) {
                                    field238 = false;
                                }
                                if (this.field114.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field533[var15].field1480[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field114.startsWith("::")) {
                                this.field92.method457(525, 124);
                                this.field92.method458(this.field114.length() - 1);
                                this.field92.method465(this.field114.substring(2));
                            } else {
                                String var18 = this.field114.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field114 = this.field114.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field114 = this.field114.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field114 = this.field114.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field114 = this.field114.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field114 = this.field114.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field114 = this.field114.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field114 = this.field114.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field114 = this.field114.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field114 = this.field114.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field114 = this.field114.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field114 = this.field114.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field114 = this.field114.substring(6);
                                }
                                String var20 = this.field114.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field114 = this.field114.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field114 = this.field114.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field114 = this.field114.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field114 = this.field114.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field114 = this.field114.substring(6);
                                }
                                this.field92.method457(525, 75);
                                this.field92.method458(0);
                                int var22 = this.field92.field1457;
                                this.field92.method486(var19, 0);
                                this.field92.method485(var21, -752);
                                this.field125.field1457 = 0;
                                class6.method27(this.field114, 922, this.field125);
                                this.field92.method505(this.field125.field1456, 0, false, this.field125.field1457);
                                this.field92.method467(this.field92.field1457 - var22, this.field263);
                                this.field114 = class6.method28(this.field114, this.field338);
                                this.field114 = class40.method377(this.field114, this.field338);
                                field304.field802 = this.field114;
                                field304.field829 = var19;
                                field304.field807 = var21;
                                field304.field778 = 150;
                                if (this.field305 == 2) {
                                    this.method133("@cr2@" + field304.field615, field304.field802, (byte) -30, 2);
                                } else if (this.field305 == 1) {
                                    this.method133("@cr1@" + field304.field615, field304.field802, (byte) -30, 2);
                                } else {
                                    this.method133(field304.field615, field304.field802, (byte) -30, 2);
                                }
                                if (this.field337 == 2) {
                                    this.field337 = 3;
                                    this.field377 = true;
                                    this.field92.method457(525, 232);
                                    this.field92.method458(this.field337);
                                    this.field92.method458(this.field403);
                                    this.field92.method458(this.field256);
                                }
                            }
                            this.field114 = "";
                            this.field168 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field371.length() < 12) {
                this.field371 = this.field371 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method147(int arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field494 && this.field90 == 2 && class2.field6 != this.field237) {
            this.method54("Loading - please wait.", 685, (String) null);
            this.field90 = 1;
            this.field268 = System.currentTimeMillis();
        }
        if (this.field90 == 1) {
            int var3 = this.method148(-5852);
            if (var3 != 0 && System.currentTimeMillis() - this.field268 > 360000L) {
                signlink.reporterror(this.field448 + " glcfb " + this.field343 + "," + var3 + "," + field494 + "," + this.field467[0] + "," + this.field194.method210() + "," + this.field237 + "," + this.field116 + "," + this.field117);
                this.field268 = System.currentTimeMillis();
            }
        }
        if (this.field90 == 2 && this.field482 != this.field237) {
            this.field482 = this.field237;
            this.method129(this.field237, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)I")
    public final int method148(int arg0) {
        if (arg0 != -5852) {
            this.field98 = !this.field98;
        }
        for (int var2 = 0; var2 < this.field562.length; ++var2) {
            if (this.field562[var2] == null && this.field248[var2] != -1) {
                return -1;
            }
            if (this.field167[var2] == null && this.field249[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field562.length; ++var4) {
            byte[] var5 = this.field167[var4];
            if (var5 != null) {
                int var6 = (this.field247[var4] >> 8) * 64 - this.field472;
                int var7 = (this.field247[var4] & 255) * 64 - this.field473;
                if (this.field109) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class2.method15(var6, true, var7, var5);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field170) {
            return -4;
        } else {
            this.field90 = 2;
            class2.field6 = this.field237;
            this.method152(this.field307);
            this.field92.method457(525, 103);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIIIIIII)V")
    private final void method149(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class28 var11 = null;
        for (class28 var12 = (class28) this.field391.method179(); var12 != null; var12 = (class28) this.field391.method181((byte) 2)) {
            if (var12.field962 == arg7 && var12.field964 == arg3 && var12.field965 == arg9 && var12.field963 == arg4) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class28();
            var11.field962 = arg7;
            var11.field963 = arg4;
            var11.field964 = arg3;
            var11.field965 = arg9;
            this.method91(-26862, var11);
            this.field391.method176(var11);
        }
        var11.field955 = arg0;
        var11.field957 = arg8;
        var11.field956 = arg6;
        var11.field966 = arg1;
        var11.field958 = arg5;
        if (arg2 == 9) {
            boolean var13 = false;
        } else {
            this.field259 = this.field327.method468();
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)I")
    public final int method150(int arg0) {
        int var2 = 54 / arg0;
        int var3 = 3;
        if (this.field375 < 310) {
            int var4 = this.field372 >> 7;
            int var5 = this.field374 >> 7;
            int var6 = field304.field830 >> 7;
            int var7 = field304.field831 >> 7;
            if ((this.field352[this.field237][var4][var5] & 4) != 0) {
                var3 = this.field237;
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
                    if ((this.field352[this.field237][var4][var5] & 4) != 0) {
                        var3 = this.field237;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field352[this.field237][var4][var5] & 4) != 0) {
                            var3 = this.field237;
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
                    if ((this.field352[this.field237][var4][var5] & 4) != 0) {
                        var3 = this.field237;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field352[this.field237][var4][var5] & 4) != 0) {
                            var3 = this.field237;
                        }
                    }
                }
            }
        }
        if ((this.field352[this.field237][field304.field830 >> 7][field304.field831 >> 7] & 4) != 0) {
            var3 = this.field237;
        }
        return var3;
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)I")
    public final int method151(byte arg0) {
        int var2 = this.method109(this.field374, this.field372, (byte) 55, this.field237);
        if (arg0 == 3) {
            boolean var3 = false;
            return var2 - this.field373 < 800 && (this.field352[this.field237][this.field372 >> 7][this.field374 >> 7] & 4) != 0 ? this.field237 : 3;
        } else {
            return this.field423;
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method152(int arg0) {
        try {
            this.field482 = -1;
            this.field234.method183();
            this.field593.method183();
            class49.method427(true);
            this.method42(0);
            this.field509.method284(true);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field533[var2].method515();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field352[var3][var4][var5] = 0;
                    }
                }
            }
            class2 var6 = new class2(this.field352, 104, this.field278, 104, true);
            int var7 = this.field562.length;
            this.field92.method457(525, 235);
            if (!this.field109) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field247[var8] >> 8) * 64 - this.field472;
                    int var10 = (this.field247[var8] & 255) * 64 - this.field473;
                    byte[] var11 = this.field562[var8];
                    if (var11 != null) {
                        var6.method23(var9, this.field533, (this.field116 - 6) * 8, var11, (this.field117 - 6) * 8, 9, var10);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field247[var12] >> 8) * 64 - this.field472;
                    int var14 = (this.field247[var12] & 255) * 64 - this.field473;
                    byte[] var15 = this.field562[var12];
                    if (var15 == null && this.field117 < 800) {
                        var6.method8(64, 64, var13, -523, var14);
                    }
                }
                this.field92.method457(525, 235);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field167[var16];
                    if (var17 != null) {
                        int var18 = (this.field247[var16] >> 8) * 64 - this.field472;
                        int var19 = (this.field247[var16] & 255) * 64 - this.field473;
                        var6.method21(var18, 488, this.field509, this.field533, var19, var17);
                    }
                }
            }
            if (this.field109) {
                int var20 = 0;
                label260: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field246[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method8(8, 8, var31 * 8, -523, var32 * 8);
                                }
                            }
                        }
                        this.field92.method457(525, 235);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label260;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field246[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field247.length; ++var43) {
                                            if (this.field247[var43] == var42 && this.field167[var43] != null) {
                                                var6.method13(var39, var34, var35 * 8, this.field167[var43], (var41 & 7) * 8, 0, var38, this.field509, var36 * 8, this.field533, (var40 & 7) * 8);
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
                            int var24 = this.field246[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field247.length; ++var30) {
                                    if (this.field247[var30] == var29 && this.field562[var30] != null) {
                                        var6.method19(this.field562[var30], var22 * 8, false, (var28 & 7) * 8, var20, var21 * 8, var25, (var27 & 7) * 8, this.field533, var26);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method4(var21 * 8, var20, true, var22 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field92.method457(525, 235);
            var6.method9(this.field509, this.field533, this.field110);
            if (this.field526 != null) {
                this.field526.method541((byte) 3);
                class49.field1385 = this.field458;
            }
            this.field92.method457(525, 235);
            int var44 = class2.field1;
            if (var44 > this.field237) {
                var44 = this.field237;
            }
            if (var44 < this.field237 - 1) {
                int var45 = this.field237 - 1;
            }
            if (field494) {
                this.field509.method285(true, class2.field1);
            } else {
                this.field509.method285(true, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method98(var46, var47);
                }
            }
            ++field235;
            if (field235 > 85) {
                field235 = 0;
                this.field92.method457(525, 253);
            }
            this.method87(-977);
        } catch (Exception var60) {
        }
        class63.field1601.method232();
        if (super.field1341 != null) {
            this.field92.method457(525, 85);
            this.field92.method462(1057001181);
        }
        if (field494 && signlink.cache_dat != null) {
            int var49 = this.field194.method206(0, 32);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field194.method220((byte) 4, var50);
                if ((var51 & 121) == 0) {
                    class25.method245(var50, (byte) 9);
                }
            }
        }
        System.gc();
        class49.method428(-60, 20);
        this.field194.method200(this.field176);
        if (this.field496 != arg0) {
            this.field259 = -1;
        }
        int var52 = (this.field116 - 6) / 8 - 1;
        int var53 = (this.field116 + 6) / 8 + 1;
        int var54 = (this.field117 - 6) / 8 - 1;
        int var55 = (this.field117 + 6) / 8 + 1;
        if (this.field267) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field194.method207(var57, var56, 0, field272);
                    if (var58 != -1) {
                        this.field194.method203(var58, 222, 3);
                    }
                    int var59 = this.field194.method207(var57, var56, 1, field272);
                    if (var59 != -1) {
                        this.field194.method203(var59, 222, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method153(int arg0) {
        if (this.field455 >= 2 || this.field425 != 0 || this.field431 != 0) {
            String var2;
            if (this.field425 == 1 && this.field455 < 2) {
                var2 = "Use " + this.field429 + " with...";
            } else if (this.field431 == 1 && this.field455 < 2) {
                var2 = this.field434 + "...";
            } else {
                var2 = this.field409[this.field455 - 1];
            }
            if (this.field455 > 2) {
                var2 = var2 + "@whi@ / " + (this.field455 - 2) + " more options";
            }
            this.field165.method599(field291 / 1000, var2, (byte) 8, 4, true, 15, 16777215);
            int var3 = 4 / arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LJFHWDRLM;IZ)V")
    public final void method154(class21 arg0, int arg1, boolean arg2) {
        this.field344 &= arg2;
        this.method155(-24143, arg0.field831, arg0.field830, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public final void method155(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
            int var5 = this.method109(arg1, arg2, (byte) 55, this.field237) - arg3;
            int var6 = arg2 - this.field372;
            int var7 = var5 - this.field373;
            int var8 = arg1 - this.field374;
            int var9 = class25.field938[this.field375];
            int var10 = class25.field939[this.field375];
            int var11 = class25.field938[this.field376];
            int var12 = class25.field939[this.field376];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (arg0 != -24143) {
                this.field259 = this.field327.method468();
            }
            if (var17 >= 50) {
                this.field129 = (var13 << 9) / var17 + class49.field1379;
                this.field130 = (var16 << 9) / var17 + class49.field1380;
            } else {
                this.field129 = -1;
                this.field130 = -1;
            }
        } else {
            this.field129 = -1;
            this.field130 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
    public final void method156(byte arg0) {
        if (arg0 != 3) {
            this.field98 = !this.field98;
        }
        if (this.field206 == 2) {
            this.method155(-24143, (this.field441 - this.field473 << 7) + this.field444, (this.field440 - this.field472 << 7) + this.field443, this.field442 * 2);
            if (this.field129 > -1 && field291 % 20 < 10) {
                this.field118[0].method448(this.field129 - 12, this.field130 - 28, 714);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method157(int arg0) {
        if (this.field381 == 0) {
            this.field409[0] = "Cancel";
            this.field537[0] = 1423;
            this.field455 = 1;
            if (this.field369 != -1) {
                this.field407 = 0;
                this.field551 = 0;
                this.method64(0, 0, (byte) 0, super.field1346, 0, class37.method359(this.field369), 0, super.field1347);
                if (this.field553 != this.field407) {
                    this.field553 = this.field407;
                }
                if (this.field551 != this.field386) {
                    this.field386 = this.field551;
                }
            } else {
                this.method136(3);
                this.field407 = 0;
                this.field551 = 0;
                if (super.field1346 > 4 && super.field1347 > 4 && super.field1346 < 516 && super.field1347 < 338) {
                    if (this.field99 != -1) {
                        this.method64(4, 4, (byte) 0, super.field1346, 0, class37.method359(this.field99), 0, super.field1347);
                    } else {
                        this.method141(653);
                    }
                }
                if (this.field553 != this.field407) {
                    this.field553 = this.field407;
                }
                if (this.field551 != this.field386) {
                    this.field386 = this.field551;
                }
                this.field407 = 0;
                while (arg0 >= 0) {
                    this.field92.method458(185);
                }
                this.field551 = 0;
                if (super.field1346 > 553 && super.field1347 > 205 && super.field1346 < 743 && super.field1347 < 466) {
                    if (this.field133 != -1) {
                        this.method64(553, 205, (byte) 0, super.field1346, 0, class37.method359(this.field133), 1, super.field1347);
                    } else if (this.field566[this.field404] != -1) {
                        this.method64(553, 205, (byte) 0, super.field1346, 0, class37.method359(this.field566[this.field404]), 1, super.field1347);
                    }
                }
                if (this.field407 != this.field143) {
                    this.field288 = true;
                    this.field143 = this.field407;
                }
                if (this.field551 != this.field495) {
                    this.field288 = true;
                    this.field495 = this.field551;
                }
                this.field407 = 0;
                this.field551 = 0;
                if (super.field1346 > 17 && super.field1347 > 357 && super.field1346 < 496 && super.field1347 < 453) {
                    if (this.field111 != -1) {
                        this.method64(17, 357, (byte) 0, super.field1346, 0, class37.method359(this.field111), 2, super.field1347);
                    } else if (this.field577 != -1) {
                        this.method64(17, 357, (byte) 0, super.field1346, 0, class37.method359(this.field577), 3, super.field1347);
                    } else if (super.field1347 < 434 && super.field1346 < 426 && this.field437 == 0) {
                        this.method70(super.field1346 - 17, super.field1347 - 357, this.field200);
                    }
                }
                if ((this.field111 != -1 || this.field577 != -1) && this.field542 != this.field407) {
                    this.field168 = true;
                    this.field542 = this.field407;
                }
                if ((this.field111 != -1 || this.field577 != -1) && this.field551 != this.field269) {
                    this.field168 = true;
                    this.field269 = this.field551;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field455 - 1; ++var3) {
                        if (this.field537[var3] < 1000 && this.field537[var3 + 1] > 1000) {
                            String var4 = this.field409[var3];
                            this.field409[var3] = this.field409[var3 + 1];
                            this.field409[var3 + 1] = var4;
                            int var5 = this.field537[var3];
                            this.field537[var3] = this.field537[var3 + 1];
                            this.field537[var3 + 1] = var5;
                            int var6 = this.field535[var3];
                            this.field535[var3] = this.field535[var3 + 1];
                            this.field535[var3 + 1] = var6;
                            int var7 = this.field536[var3];
                            this.field536[var3] = this.field536[var3 + 1];
                            this.field536[var3 + 1] = var7;
                            int var8 = this.field538[var3];
                            this.field538[var3] = this.field538[var3 + 1];
                            this.field538[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method158() {
        this.method61(20, (byte) -127, "Starting up");
        if (signlink.sunjava) {
            super.field1332 = 5;
        }
        if (field405) {
            this.field445 = true;
        } else {
            field405 = true;
            boolean var1 = false;
            String var2 = this.method101((byte) 3);
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
                this.field231 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field467[var3] = new class56(signlink.cache_idx[var3], 500000, var3 + 1, signlink.cache_dat, 0);
                    }
                }
                try {
                    this.method32(0);
                    this.field435 = this.method130(1, this.field388[1], "title", (byte) 49, 25, "title screen");
                    this.field163 = new class71(this.field435, (byte) -3, "p11_full", false);
                    this.field164 = new class71(this.field435, (byte) -3, "p12_full", false);
                    this.field165 = new class71(this.field435, (byte) -3, "b12_full", false);
                    this.field166 = new class71(this.field435, (byte) -3, "q8_full", true);
                    this.method112(true);
                    this.method95((byte) 65);
                    class50 var4 = this.method130(2, this.field388[2], "config", (byte) 49, 30, "config");
                    class50 var5 = this.method130(3, this.field388[3], "interface", (byte) 49, 35, "interface");
                    class50 var6 = this.method130(4, this.field388[4], "media", (byte) 49, 40, "2d graphics");
                    class50 var7 = this.method130(6, this.field388[6], "textures", (byte) 49, 45, "textures");
                    class50 var8 = this.method130(7, this.field388[7], "wordenc", (byte) 49, 50, "chat system");
                    class50 var9 = this.method130(8, this.field388[8], "sounds", (byte) 49, 55, "sound effects");
                    this.field352 = new byte[4][104][104];
                    this.field278 = new int[4][105][105];
                    this.field509 = new class32(this.field278, 104, 4, field481, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field533[var10] = new class55(74, 104, 104);
                    }
                    this.field350 = new class52(512, 512);
                    class50 var11 = this.method130(5, this.field388[5], "versionlist", (byte) 49, 60, "update list");
                    this.method61(60, (byte) -127, "Connecting to update server");
                    this.field194 = new class16();
                    this.field194.method209(var11, this);
                    class48.method419(this.field194.method208(675));
                    class25.method243(this.field194.method206(0, 32), this.field194);
                    if (!field494) {
                        this.field141 = 0;
                        this.field142 = true;
                        this.field194.method213(2, this.field141);
                        while (this.field194.method210() > 0) {
                            this.method39(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field194.field714 > 3) {
                                this.method67("ondemand");
                                return;
                            }
                        }
                    }
                    this.method61(65, (byte) -127, "Requesting animations");
                    int var12 = this.field194.method206(1, 32);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field194.method213(1, var13);
                    }
                    while (this.field194.method210() > 0) {
                        int var14 = var12 - this.field194.method210();
                        if (var14 > 0) {
                            this.method61(65, (byte) -127, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method39(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field194.field714 > 3) {
                            this.method67("ondemand");
                            return;
                        }
                    }
                    this.method61(70, (byte) -127, "Requesting models");
                    int var15 = this.field194.method206(0, 32);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field194.method220((byte) 4, var16);
                        if ((var17 & 1) != 0) {
                            this.field194.method213(0, var16);
                        }
                    }
                    int var18 = this.field194.method210();
                    while (this.field194.method210() > 0) {
                        int var19 = var18 - this.field194.method210();
                        if (var19 > 0) {
                            this.method61(70, (byte) -127, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method39(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field467[0] != null) {
                        this.method61(75, (byte) -127, "Requesting maps");
                        this.field194.method213(3, this.field194.method207(48, 47, 0, field272));
                        this.field194.method213(3, this.field194.method207(48, 47, 1, field272));
                        this.field194.method213(3, this.field194.method207(48, 48, 0, field272));
                        this.field194.method213(3, this.field194.method207(48, 48, 1, field272));
                        this.field194.method213(3, this.field194.method207(48, 49, 0, field272));
                        this.field194.method213(3, this.field194.method207(48, 49, 1, field272));
                        this.field194.method213(3, this.field194.method207(47, 47, 0, field272));
                        this.field194.method213(3, this.field194.method207(47, 47, 1, field272));
                        this.field194.method213(3, this.field194.method207(47, 48, 0, field272));
                        this.field194.method213(3, this.field194.method207(47, 48, 1, field272));
                        this.field194.method213(3, this.field194.method207(148, 48, 0, field272));
                        this.field194.method213(3, this.field194.method207(148, 48, 1, field272));
                        int var20 = this.field194.method210();
                        while (this.field194.method210() > 0) {
                            int var21 = var20 - this.field194.method210();
                            if (var21 > 0) {
                                this.method61(75, (byte) -127, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method39(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field194.method206(0, 32);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field194.method220((byte) 4, var23);
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
                            this.field194.method211(var25, var23, 0, 0);
                        }
                    }
                    this.field194.method218((byte) 4, field493);
                    if (!field494) {
                        int var26 = this.field194.method206(2, 32);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field194.method201(var27, (byte) 4)) {
                                this.field194.method211((byte) 1, var27, 0, 2);
                            }
                        }
                    }
                    this.method61(80, (byte) -127, "Unpacking media");
                    this.field217 = new class59(var6, "invback", 0);
                    this.field219 = new class59(var6, "chatback", 0);
                    this.field218 = new class59(var6, "mapback", 0);
                    this.field362 = new class59(var6, "backbase1", 0);
                    this.field363 = new class59(var6, "backbase2", 0);
                    this.field364 = new class59(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field567[var28] = new class59(var6, "sideicons", var28);
                    }
                    this.field390 = new class52(var6, "compass", 0);
                    this.field436 = new class52(var6, "mapedge", 0);
                    this.field436.method445(4);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field97[var29] = new class59(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 70; ++var30) {
                        this.field589[var30] = new class52(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field508[var31] = new class52(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field264[var32] = new class52(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field355[var33] = new class52(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field118[var34] = new class52(var6, "headicons_hint", var34);
                    }
                    this.field507 = new class52(var6, "overlay_multiway", 0);
                    this.field253 = new class52(var6, "mapmarker", 0);
                    this.field254 = new class52(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field303[var35] = new class52(var6, "cross", var35);
                    }
                    this.field322 = new class52(var6, "mapdots", 0);
                    this.field323 = new class52(var6, "mapdots", 1);
                    this.field324 = new class52(var6, "mapdots", 2);
                    this.field325 = new class52(var6, "mapdots", 3);
                    this.field326 = new class52(var6, "mapdots", 4);
                    this.field239 = new class59(var6, "scrollbar", 0);
                    this.field240 = new class59(var6, "scrollbar", 1);
                    this.field580 = new class59(var6, "redstone1", 0);
                    this.field581 = new class59(var6, "redstone2", 0);
                    this.field582 = new class59(var6, "redstone3", 0);
                    this.field583 = new class59(var6, "redstone1", 0);
                    this.field583.method536(field398);
                    this.field584 = new class59(var6, "redstone2", 0);
                    this.field584.method536(field398);
                    this.field528 = new class59(var6, "redstone1", 0);
                    this.field528.method537(42862);
                    this.field529 = new class59(var6, "redstone2", 0);
                    this.field529.method537(42862);
                    this.field530 = new class59(var6, "redstone3", 0);
                    this.field530.method537(42862);
                    this.field531 = new class59(var6, "redstone1", 0);
                    this.field531.method536(field398);
                    this.field531.method537(42862);
                    this.field532 = new class59(var6, "redstone2", 0);
                    this.field532.method536(field398);
                    this.field532.method537(42862);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field162[var36] = new class59(var6, "mod_icons", var36);
                    }
                    class52 var37 = new class52(var6, "backleft1", 0);
                    this.field328 = new class60(var37.field1433, var37.field1432, field412, this.method167(0));
                    var37.method446(-30434, 0, 0);
                    class52 var38 = new class52(var6, "backleft2", 0);
                    this.field329 = new class60(var38.field1433, var38.field1432, field412, this.method167(0));
                    var38.method446(-30434, 0, 0);
                    class52 var39 = new class52(var6, "backright1", 0);
                    this.field330 = new class60(var39.field1433, var39.field1432, field412, this.method167(0));
                    var39.method446(-30434, 0, 0);
                    class52 var40 = new class52(var6, "backright2", 0);
                    this.field331 = new class60(var40.field1433, var40.field1432, field412, this.method167(0));
                    var40.method446(-30434, 0, 0);
                    class52 var41 = new class52(var6, "backtop1", 0);
                    this.field332 = new class60(var41.field1433, var41.field1432, field412, this.method167(0));
                    var41.method446(-30434, 0, 0);
                    class52 var42 = new class52(var6, "backvmid1", 0);
                    this.field333 = new class60(var42.field1433, var42.field1432, field412, this.method167(0));
                    var42.method446(-30434, 0, 0);
                    class52 var43 = new class52(var6, "backvmid2", 0);
                    this.field334 = new class60(var43.field1433, var43.field1432, field412, this.method167(0));
                    var43.method446(-30434, 0, 0);
                    class52 var44 = new class52(var6, "backvmid3", 0);
                    this.field335 = new class60(var44.field1433, var44.field1432, field412, this.method167(0));
                    var44.method446(-30434, 0, 0);
                    class52 var45 = new class52(var6, "backhmid2", 0);
                    this.field336 = new class60(var45.field1433, var45.field1432, field412, this.method167(0));
                    var45.method446(-30434, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field589[var50] != null) {
                            this.field589[var50].method444(var47 + var49, var48 + var49, var46 + var49, 3);
                        }
                        if (this.field97[var50] != null) {
                            this.field97[var50].method538(var47 + var49, var48 + var49, var46 + var49, 3);
                        }
                    }
                    this.method61(83, (byte) -127, "Unpacking textures");
                    class49.method429(var7, false);
                    class49.method433(true, 0.8D);
                    class49.method428(-60, 20);
                    this.method61(86, (byte) -127, "Unpacking config");
                    class30.method279((byte) -109, var4);
                    class63.method559(var4);
                    class24.method238((byte) -109, var4);
                    class67.method574(var4);
                    class66.method565(var4);
                    class9.method189((byte) -109, var4);
                    class45.method411((byte) -109, var4);
                    class34.method338((byte) -109, var4);
                    class5.method24((byte) -109, var4);
                    class67.field1672 = field493;
                    if (!field494) {
                        this.method61(90, (byte) -127, "Unpacking sounds");
                        byte[] var51 = var9.method442("sounds.dat", (byte[]) null);
                        class53 var52 = new class53(var51, -631);
                        class62.method544((byte) -109, var52);
                    }
                    this.method61(95, (byte) -127, "Unpacking interfaces");
                    class71[] var53 = new class71[] { this.field163, this.field164, this.field165, this.field166 };
                    class37.method355(var6, var5, var53, true);
                    this.method61(100, (byte) -127, "Preparing game engine");
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field218.field1523[this.field218.field1525 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field402[var54] = var55;
                        this.field452[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field218.field1523[this.field218.field1525 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field136[var58 - 5] = var59 - 25;
                        this.field208[var58 - 5] = var60 - var59;
                    }
                    class49.method426(503, -20531, 765);
                    this.field459 = class49.field1385;
                    class49.method426(96, -20531, 479);
                    this.field456 = class49.field1385;
                    class49.method426(261, -20531, 190);
                    this.field457 = class49.field1385;
                    class49.method426(334, -20531, 512);
                    this.field458 = class49.field1385;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class49.field1383[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class32.method320(800, 334, 512, 500, (byte) -42, var62);
                    class40.method367(var8);
                    this.field450 = new class65(this, false);
                    this.method108(this.field450, 10);
                    class36.field1125 = this;
                    class63.field1588 = this;
                    class66.field1655 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field96 + " " + this.field233);
                    this.field499 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
    public final String method159(int arg0, int arg1) {
        if (arg1 < 0) {
            return arg0 < 999999999 ? String.valueOf(arg0) : "*";
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(JZ)V")
    public final void method160(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field564 >= 100 && this.field396 != 1) {
                this.method133("", "Your friendlist is full. Max of 100 for free users, and 200 for members", (byte) -30, 0);
            } else if (this.field564 >= 200) {
                this.method133("", "Your friendlist is full. Max of 100 for free users, and 200 for members", (byte) -30, 0);
            } else {
                String var4 = class41.method409(-354, class41.method406(arg0, (byte) 1));
                for (int var5 = 0; var5 < this.field564; ++var5) {
                    if (this.field241[var5] == arg0) {
                        this.method133("", var4 + " is already on your friend list", (byte) -30, 0);
                        return;
                    }
                }
                if (!arg1) {
                    for (int var6 = 0; var6 < this.field161; ++var6) {
                        if (this.field319[var6] == arg0) {
                            this.method133("", "Please remove " + var4 + " from your ignore list first", (byte) -30, 0);
                            return;
                        }
                    }
                    if (!var4.equals(field304.field615)) {
                        this.field389[this.field564] = var4;
                        this.field241[this.field564] = arg0;
                        this.field131[this.field564] = 0;
                        ++this.field564;
                        this.field288 = true;
                        this.field92.method457(525, 66);
                        this.field92.method464(66, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method161(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method162(int arg0) {
        if (arg0 >= 0) {
            this.field92.method458(179);
        }
        if (this.field381 == 0) {
            int var2 = super.field1352;
            if (this.field431 == 1 && super.field1353 >= 516 && super.field1354 >= 160 && super.field1353 <= 765 && super.field1354 <= 205) {
                var2 = 0;
            }
            if (this.field293) {
                if (var2 != 1) {
                    int var3 = super.field1346;
                    int var4 = super.field1347;
                    if (this.field511 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field511 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field511 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field512 - 10 || var3 > this.field514 + this.field512 + 10 || var4 < this.field513 - 10 || var4 > this.field515 + this.field513 + 10) {
                        this.field293 = false;
                        if (this.field511 == 1) {
                            this.field288 = true;
                        }
                        if (this.field511 == 2) {
                            this.field168 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field512;
                    int var6 = this.field513;
                    int var7 = this.field514;
                    int var8 = super.field1353;
                    int var9 = super.field1354;
                    if (this.field511 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field511 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field511 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field455; ++var11) {
                        int var12 = (this.field455 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method163(var10, 338);
                    }
                    this.field293 = false;
                    if (this.field511 == 1) {
                        this.field288 = true;
                    }
                    if (this.field511 == 2) {
                        this.field168 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field455 > 0) {
                    int var13 = this.field537[this.field455 - 1];
                    if (var13 == 378 || var13 == 350 || var13 == 236 || var13 == 815 || var13 == 519 || var13 == 8 || var13 == 581 || var13 == 197 || var13 == 800 || var13 == 529 || var13 == 11 || var13 == 1107) {
                        int var14 = this.field535[this.field455 - 1];
                        int var15 = this.field536[this.field455 - 1];
                        class37 var16 = class37.method359(var15);
                        if (var16.field1142 || var16.field1138) {
                            this.field561 = false;
                            this.field399 = 0;
                            this.field379 = var15;
                            this.field380 = var14;
                            this.field381 = 2;
                            this.field382 = super.field1353;
                            this.field383 = super.field1354;
                            if (class37.method359(var15).field1182 == this.field99) {
                                this.field381 = 1;
                            }
                            if (class37.method359(var15).field1182 == this.field111) {
                                this.field381 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field88 == 1 || this.method37(671, this.field455 - 1)) && this.field455 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field455 > 0) {
                    this.method163(this.field455 - 1, 338);
                }
                if (var2 != 2 || this.field455 <= 0) {
                    return;
                }
                this.method164((byte) 69);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
    public final void method163(int arg0, int arg1) {
        if (arg0 >= 0) {
            int var3 = this.field535[arg0];
            int var4 = this.field536[arg0];
            int var5 = this.field537[arg0];
            int var6 = this.field538[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field437 != 0 && var5 != 1423) {
                this.field437 = 0;
                this.field168 = true;
            }
            if (var5 == 1273) {
                int var7 = var6 >> 14 & 32767;
                class63 var8 = class63.method555(var7);
                String var9;
                if (var8.field1584 != null) {
                    var9 = new String(var8.field1584);
                } else {
                    var9 = "It's a " + var8.field1603 + ".";
                }
                this.method133("", var9, (byte) -30, 0);
            }
            if (var5 == 756) {
                boolean var10 = this.method73(0, 0, 2, 2, false, 0, 0, field304.field828[0], var4, 0, var3, field304.field827[0]);
                if (!var10) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var4, 0, var3, field304.field827[0]);
                }
                this.field477 = super.field1353;
                this.field478 = super.field1354;
                this.field480 = 2;
                this.field479 = 0;
                this.field92.method457(525, 92);
                this.field92.method493(0, this.field472 + var3);
                this.field92.method495(this.field473 + var4, 0);
                this.field92.method459(var6);
            }
            if (var5 == 350) {
                this.field92.method457(525, 145);
                this.field92.method493(0, var6);
                this.field92.method494(var3, this.field397);
                this.field92.method459(var4);
                this.field572 = 0;
                this.field573 = var4;
                this.field574 = var3;
                this.field575 = 2;
                if (class37.method359(var4).field1182 == this.field99) {
                    this.field575 = 1;
                }
                if (class37.method359(var4).field1182 == this.field111) {
                    this.field575 = 3;
                }
            }
            if (var5 == 380) {
                boolean var12 = this.method73(0, 0, 2, 2, false, 0, 0, field304.field828[0], var4, 0, var3, field304.field827[0]);
                if (!var12) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var4, 0, var3, field304.field827[0]);
                }
                this.field477 = super.field1353;
                this.field478 = super.field1354;
                this.field480 = 2;
                this.field479 = 0;
                this.field92.method457(525, 43);
                this.field92.method493(0, this.field427);
                this.field92.method493(0, this.field428);
                this.field92.method493(0, this.field473 + var4);
                this.field92.method459(var6);
                this.field92.method494(this.field472 + var3, this.field397);
                this.field92.method493(0, this.field426);
            }
            if (var5 == 963) {
                class8 var14 = this.field417[var6];
                if (var14 != null) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var14.field828[0], 0, var14.field827[0], field304.field827[0]);
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    ++field546;
                    if (field546 >= 54) {
                        this.field92.method457(525, 234);
                        this.field92.method461(14720213);
                        field546 = 0;
                    }
                    this.field92.method457(525, 30);
                    this.field92.method495(var6, 0);
                }
            }
            if (var5 == 383) {
                this.method103(var3, var4, (byte) 4, var6);
                this.field92.method457(525, 20);
                this.field92.method494(var6 >> 14 & 32767, this.field397);
                this.field92.method495(this.field473 + var4, 0);
                this.field92.method495(this.field472 + var3, 0);
            }
            if (var5 == 1827) {
                class15 var15 = this.field126[var6];
                if (var15 != null) {
                    class66 var16 = var15.field709;
                    if (var16.field1638 != null) {
                        var16 = var16.method568(this.field579);
                    }
                    if (var16 != null) {
                        String var17;
                        if (var16.field1646 != null) {
                            var17 = new String(var16.field1646);
                        } else {
                            var17 = "It's a " + var16.field1644 + ".";
                        }
                        this.method133("", var17, (byte) -30, 0);
                    }
                }
            }
            if (var5 == 452) {
                class8 var18 = this.field417[var6];
                if (var18 != null) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var18.field828[0], 0, var18.field827[0], field304.field827[0]);
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    this.field92.method457(525, 217);
                    this.field92.method495(this.field432, 0);
                    this.field92.method459(var6);
                }
            }
            if (var5 == 753) {
                class8 var19 = this.field417[var6];
                if (var19 != null) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var19.field828[0], 0, var19.field827[0], field304.field827[0]);
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    this.field92.method457(525, 38);
                    this.field92.method494(var6, this.field397);
                }
            }
            if (var5 == 34) {
                String var20 = this.field409[arg0];
                int var21 = var20.indexOf("@whi@");
                if (var21 != -1) {
                    long var22 = class41.method405(var20.substring(var21 + 5).trim());
                    int var24 = -1;
                    for (int var25 = 0; var25 < this.field564; ++var25) {
                        if (this.field241[var25] == var22) {
                            var24 = var25;
                            break;
                        }
                    }
                    if (var24 != -1 && this.field131[var24] > 0) {
                        this.field168 = true;
                        this.field437 = 0;
                        this.field506 = true;
                        this.field534 = "";
                        this.field406 = 3;
                        this.field173 = this.field241[var24];
                        this.field438 = "Enter message to send to " + this.field389[var24];
                    }
                }
            }
            if (var5 == 184) {
                class15 var26 = this.field126[var6];
                if (var26 != null) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var26.field828[0], 0, var26.field827[0], field304.field827[0]);
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    this.field92.method457(525, 14);
                    this.field92.method459(var6);
                }
            }
            if (var5 == 493) {
                class8 var27 = this.field417[var6];
                if (var27 != null) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var27.field828[0], 0, var27.field827[0], field304.field827[0]);
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    this.field92.method457(525, 169);
                    this.field92.method494(this.field428, this.field397);
                    this.field92.method494(this.field426, this.field397);
                    this.field92.method493(0, var6);
                    this.field92.method459(this.field427);
                }
            }
            if (var5 == 8) {
                this.field92.method457(525, 86);
                this.field92.method459(var3);
                this.field92.method493(0, var4);
                this.field92.method494(var6, this.field397);
                this.field572 = 0;
                this.field573 = var4;
                this.field574 = var3;
                this.field575 = 2;
                if (class37.method359(var4).field1182 == this.field99) {
                    this.field575 = 1;
                }
                if (class37.method359(var4).field1182 == this.field111) {
                    this.field575 = 3;
                }
            }
            if (var5 == 666) {
                this.field92.method457(525, 247);
                this.field92.method495(var4, 0);
                this.field92.method493(0, var6);
                this.field92.method459(this.field432);
                this.field92.method495(var3, 0);
                this.field572 = 0;
                this.field573 = var4;
                this.field574 = var3;
                this.field575 = 2;
                if (class37.method359(var4).field1182 == this.field99) {
                    this.field575 = 1;
                }
                if (class37.method359(var4).field1182 == this.field111) {
                    this.field575 = 3;
                }
            }
            if (var5 == 550) {
                String var28 = this.field409[arg0];
                int var29 = var28.indexOf("@whi@");
                if (var29 != -1) {
                    if (this.field99 == -1) {
                        this.method119((byte) 2);
                        this.field371 = var28.substring(var29 + 5).trim();
                        this.field301 = false;
                        this.field408 = this.field99 = class37.field1178;
                    } else {
                        this.method133("", "Please close the interface you have open before using 'report abuse'", (byte) -30, 0);
                    }
                }
            }
            if (var5 == 424) {
                this.method80(this.field577, (byte) -79);
                this.field577 = -1;
                this.field168 = true;
            }
            if (var5 == 772) {
                class8 var30 = this.field417[var6];
                if (var30 != null) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var30.field828[0], 0, var30.field827[0], field304.field827[0]);
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    this.field92.method457(525, 166);
                    this.field92.method459(var6);
                }
            }
            if (var5 == 145) {
                boolean var31 = this.method73(0, 0, 2, 2, false, 0, 0, field304.field828[0], var4, 0, var3, field304.field827[0]);
                if (!var31) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var4, 0, var3, field304.field827[0]);
                }
                this.field477 = super.field1353;
                this.field478 = super.field1354;
                this.field480 = 2;
                this.field479 = 0;
                this.field92.method457(525, 214);
                this.field92.method493(0, this.field472 + var3);
                this.field92.method459(this.field473 + var4);
                this.field92.method494(var6, this.field397);
            }
            if (var5 == 236) {
                field578 += var6;
                if (field578 >= 64) {
                    this.field92.method457(525, 54);
                    this.field92.method459(19877);
                    field578 = 0;
                }
                this.field92.method457(525, 193);
                this.field92.method495(var4, 0);
                this.field92.method493(0, var3);
                this.field92.method495(var6, 0);
                this.field572 = 0;
                this.field573 = var4;
                this.field574 = var3;
                this.field575 = 2;
                if (class37.method359(var4).field1182 == this.field99) {
                    this.field575 = 1;
                }
                if (class37.method359(var4).field1182 == this.field111) {
                    this.field575 = 3;
                }
            }
            if (var5 == 655 && !this.field497) {
                this.field92.method457(525, 120);
                this.field92.method459(var4);
                this.field497 = true;
            }
            if (var5 == 49) {
                class15 var33 = this.field126[var6];
                if (var33 != null) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var33.field828[0], 0, var33.field827[0], field304.field827[0]);
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    this.field92.method457(525, 21);
                    this.field92.method459(var6);
                }
            }
            if (var5 == 519) {
                this.field92.method457(525, 251);
                this.field92.method494(var6, this.field397);
                this.field92.method493(0, var4);
                this.field92.method493(0, var3);
                this.field572 = 0;
                this.field573 = var4;
                this.field574 = var3;
                this.field575 = 2;
                if (class37.method359(var4).field1182 == this.field99) {
                    this.field575 = 1;
                }
                if (class37.method359(var4).field1182 == this.field111) {
                    this.field575 = 3;
                }
            }
            if (var5 == 378) {
                field476 += var4;
                if (field476 >= 131) {
                    this.field92.method457(525, 87);
                    this.field92.method461(1812634);
                    field476 = 0;
                }
                this.field92.method457(525, 215);
                this.field92.method495(var6, 0);
                this.field92.method459(var3);
                this.field92.method494(var4, this.field397);
                this.field572 = 0;
                this.field573 = var4;
                this.field574 = var3;
                this.field575 = 2;
                if (class37.method359(var4).field1182 == this.field99) {
                    this.field575 = 1;
                }
                if (class37.method359(var4).field1182 == this.field111) {
                    this.field575 = 3;
                }
            }
            if (var5 == 409) {
                boolean var34 = this.method73(0, 0, 2, 2, false, 0, 0, field304.field828[0], var4, 0, var3, field304.field827[0]);
                if (!var34) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var4, 0, var3, field304.field827[0]);
                }
                this.field477 = super.field1353;
                this.field478 = super.field1354;
                this.field480 = 2;
                this.field479 = 0;
                this.field92.method457(525, 197);
                this.field92.method495(this.field472 + var3, 0);
                this.field92.method494(var6, this.field397);
                this.field92.method494(this.field473 + var4, this.field397);
            }
            if (var5 == 451) {
                class37 var36 = class37.method359(var4);
                boolean var37 = true;
                if (var36.field1191 > 0) {
                    var37 = this.method66(var36, (byte) -69);
                }
                if (var37) {
                    this.field92.method457(525, 210);
                    this.field92.method459(var4);
                }
            }
            if (var5 == 815) {
                this.field92.method457(525, 178);
                this.field92.method495(var4, 0);
                this.field92.method459(var3);
                this.field92.method494(var6, this.field397);
                this.field572 = 0;
                this.field573 = var4;
                this.field574 = var3;
                this.field575 = 2;
                if (class37.method359(var4).field1182 == this.field99) {
                    this.field575 = 1;
                }
                if (class37.method359(var4).field1182 == this.field111) {
                    this.field575 = 3;
                }
            }
            if (var5 == 80) {
                class15 var38 = this.field126[var6];
                if (var38 != null) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var38.field828[0], 0, var38.field827[0], field304.field827[0]);
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    ++field124;
                    if (field124 >= 79) {
                        this.field92.method457(525, 224);
                        this.field92.method459(41106);
                        field124 = 0;
                    }
                    this.field92.method457(525, 136);
                    this.field92.method459(var6);
                }
            }
            if (var5 == 1107) {
                class67 var39 = class67.method575(var6);
                class37 var40 = class37.method359(var4);
                String var41;
                if (var40 != null && var40.field1209[var3] >= 100000) {
                    var41 = var40.field1209[var3] + " x " + var39.field1709;
                } else if (var39.field1660 != null) {
                    var41 = new String(var39.field1660);
                } else {
                    var41 = "It's a " + var39.field1709 + ".";
                }
                this.method133("", var41, (byte) -30, 0);
            }
            if (var5 == 618) {
                this.method119((byte) 2);
            }
            if (var5 == 413 && this.method103(var3, var4, (byte) 4, var6)) {
                this.field92.method457(525, 220);
                this.field92.method495(this.field428, 0);
                this.field92.method495(this.field473 + var4, 0);
                this.field92.method459(this.field472 + var3);
                this.field92.method459(this.field426);
                this.field92.method494(var6 >> 14 & 32767, this.field397);
                this.field92.method493(0, this.field427);
            }
            if (var5 == 365 || var5 == 355) {
                String var42 = this.field409[arg0];
                int var43 = var42.indexOf("@whi@");
                if (var43 != -1) {
                    String var44 = var42.substring(var43 + 5).trim();
                    String var45 = class41.method409(-354, class41.method406(class41.method405(var44), (byte) 1));
                    boolean var46 = false;
                    for (int var47 = 0; var47 < this.field418; ++var47) {
                        class8 var48 = this.field417[this.field419[var47]];
                        if (var48 != null && var48.field615 != null && var48.field615.equalsIgnoreCase(var45)) {
                            this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var48.field828[0], 0, var48.field827[0], field304.field827[0]);
                            if (var5 == 365) {
                                this.field92.method457(525, 166);
                                this.field92.method459(this.field419[var47]);
                            }
                            if (var5 == 355) {
                                this.field92.method457(525, 38);
                                this.field92.method494(this.field419[var47], this.field397);
                            }
                            var46 = true;
                            break;
                        }
                    }
                    if (!var46) {
                        this.method133("", "Unable to find " + var45, (byte) -30, 0);
                    }
                }
            }
            if (var5 == 545) {
                boolean var49 = this.method73(0, 0, 2, 2, false, 0, 0, field304.field828[0], var4, 0, var3, field304.field827[0]);
                if (!var49) {
                    this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var4, 0, var3, field304.field827[0]);
                }
                this.field477 = super.field1353;
                this.field478 = super.field1354;
                this.field480 = 2;
                this.field479 = 0;
                this.field92.method457(525, 96);
                this.field92.method493(0, this.field472 + var3);
                this.field92.method459(var6);
                this.field92.method459(this.field432);
                this.field92.method494(this.field473 + var4, this.field397);
            }
            if (var5 == 377) {
                this.method103(var3, var4, (byte) 4, var6);
                this.field92.method457(525, 162);
                this.field92.method495(this.field473 + var4, 0);
                this.field92.method494(this.field472 + var3, this.field397);
                this.field92.method459(var6 >> 14 & 32767);
            }
            if (var5 == 11) {
                this.field425 = 1;
                this.field426 = var3;
                this.field427 = var4;
                this.field428 = var6;
                this.field429 = String.valueOf(class67.method575(var6).field1709);
                this.field431 = 0;
                this.field288 = true;
            } else {
                if (var5 == 382 && this.method103(var3, var4, (byte) 4, var6)) {
                    this.field92.method457(525, 154);
                    this.field92.method494(var6 >> 14 & 32767, this.field397);
                    this.field92.method459(this.field472 + var3);
                    this.field92.method459(this.field432);
                    this.field92.method493(0, this.field473 + var4);
                }
                if (var5 == 719) {
                    class15 var51 = this.field126[var6];
                    if (var51 != null) {
                        this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var51.field828[0], 0, var51.field827[0], field304.field827[0]);
                        this.field477 = super.field1353;
                        this.field478 = super.field1354;
                        this.field480 = 2;
                        this.field479 = 0;
                        this.field92.method457(525, 183);
                        this.field92.method493(0, this.field432);
                        this.field92.method495(var6, 0);
                    }
                }
                if (var5 == 737) {
                    this.field92.method457(525, 210);
                    this.field92.method459(var4);
                    class37 var52 = class37.method359(var4);
                    if (var52.field1156 != null && var52.field1156[0][0] == 5) {
                        int var53 = var52.field1156[0][1];
                        if (this.field385[var53] != var52.field1192[0]) {
                            this.field385[var53] = var52.field1192[0];
                            this.method138(var53, true);
                            this.field288 = true;
                        }
                    }
                }
                if (var5 == 646 || var5 == 955 || var5 == 978 || var5 == 366) {
                    String var54 = this.field409[arg0];
                    int var55 = var54.indexOf("@whi@");
                    if (var55 != -1) {
                        long var56 = class41.method405(var54.substring(var55 + 5).trim());
                        if (var5 == 646) {
                            this.method160(var56, false);
                        }
                        if (var5 == 955) {
                            this.method55(var56, 4);
                        }
                        if (var5 == 978) {
                            this.method92(var56, true);
                        }
                        if (var5 == 366) {
                            this.method115(var56, -778);
                        }
                    }
                }
                if (var5 == 134) {
                    if (!this.field293) {
                        this.field509.method322(super.field1353 - 4, true, super.field1354 - 4);
                    } else {
                        this.field509.method322(var3 - 4, true, var4 - 4);
                    }
                }
                if (var5 == 581) {
                    this.field92.method457(525, 173);
                    this.field92.method494(var6, this.field397);
                    this.field92.method493(0, var4);
                    this.field92.method493(0, var3);
                    this.field572 = 0;
                    this.field573 = var4;
                    this.field574 = var3;
                    this.field575 = 2;
                    if (class37.method359(var4).field1182 == this.field99) {
                        this.field575 = 1;
                    }
                    if (class37.method359(var4).field1182 == this.field111) {
                        this.field575 = 3;
                    }
                }
                if (var5 == 113) {
                    class15 var58 = this.field126[var6];
                    if (var58 != null) {
                        this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var58.field828[0], 0, var58.field827[0], field304.field827[0]);
                        this.field477 = super.field1353;
                        this.field478 = super.field1354;
                        this.field480 = 2;
                        this.field479 = 0;
                        field414 += var6;
                        if (field414 >= 105) {
                            this.field92.method457(525, 51);
                            this.field92.method458(125);
                            field414 = 0;
                        }
                        this.field92.method457(525, 246);
                        this.field92.method494(var6, this.field397);
                    }
                }
                if (var5 == 148) {
                    class8 var59 = this.field417[var6];
                    if (var59 != null) {
                        this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var59.field828[0], 0, var59.field827[0], field304.field827[0]);
                        this.field477 = super.field1353;
                        this.field478 = super.field1354;
                        this.field480 = 2;
                        this.field479 = 0;
                        this.field92.method457(525, 168);
                        this.field92.method494(var6, this.field397);
                    }
                }
                if (var5 == 800) {
                    field351 += var4;
                    if (field351 >= 136) {
                        this.field92.method457(525, 191);
                        this.field92.method459(46982);
                        field351 = 0;
                    }
                    this.field92.method457(525, 44);
                    this.field92.method494(var3, this.field397);
                    this.field92.method493(0, var4);
                    this.field92.method494(var6, this.field397);
                    this.field572 = 0;
                    this.field573 = var4;
                    this.field574 = var3;
                    this.field575 = 2;
                    if (class37.method359(var4).field1182 == this.field99) {
                        this.field575 = 1;
                    }
                    if (class37.method359(var4).field1182 == this.field111) {
                        this.field575 = 3;
                    }
                }
                if (var5 == 4) {
                    boolean var60 = this.method73(0, 0, 2, 2, false, 0, 0, field304.field828[0], var4, 0, var3, field304.field827[0]);
                    if (!var60) {
                        this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var4, 0, var3, field304.field827[0]);
                    }
                    this.field477 = super.field1353;
                    this.field478 = super.field1354;
                    this.field480 = 2;
                    this.field479 = 0;
                    this.field92.method457(525, 213);
                    this.field92.method459(this.field472 + var3);
                    this.field92.method495(this.field473 + var4, 0);
                    this.field92.method495(var6, 0);
                }
                if (var5 == 1536) {
                    this.method103(var3, var4, (byte) 4, var6);
                    this.field92.method457(525, 78);
                    this.field92.method493(0, this.field472 + var3);
                    this.field92.method495(this.field473 + var4, 0);
                    this.field92.method494(var6 >> 14 & 32767, this.field397);
                }
                if (var5 == 940) {
                    this.field92.method457(525, 137);
                    this.field92.method495(this.field427, 0);
                    this.field92.method493(0, this.field428);
                    this.field92.method493(0, var3);
                    this.field92.method459(var4);
                    this.field92.method459(this.field426);
                    this.field92.method494(var6, this.field397);
                    this.field572 = 0;
                    this.field573 = var4;
                    this.field574 = var3;
                    this.field575 = 2;
                    if (class37.method359(var4).field1182 == this.field99) {
                        this.field575 = 1;
                    }
                    if (class37.method359(var4).field1182 == this.field111) {
                        this.field575 = 3;
                    }
                }
                if (var5 == 88) {
                    field378 += var4;
                    if (field378 >= 84) {
                        this.field92.method457(525, 7);
                        this.field92.method459(20732);
                        field378 = 0;
                    }
                    this.method103(var3, var4, (byte) 4, var6);
                    this.field92.method457(525, 37);
                    this.field92.method495(this.field473 + var4, 0);
                    this.field92.method494(var6 >> 14 & 32767, this.field397);
                    this.field92.method494(this.field472 + var3, this.field397);
                }
                if (var5 == 746) {
                    class37 var62 = class37.method359(var4);
                    this.field431 = 1;
                    this.field432 = var4;
                    this.field433 = var62.field1212;
                    this.field425 = 0;
                    this.field288 = true;
                    String var63 = var62.field1168;
                    if (var63.indexOf(" ") != -1) {
                        var63 = var63.substring(0, var63.indexOf(" "));
                    }
                    String var64 = var62.field1168;
                    if (var64.indexOf(" ") != -1) {
                        var64 = var64.substring(var64.indexOf(" ") + 1);
                    }
                    this.field434 = var63 + " " + var62.field1185 + " " + var64;
                    if (this.field433 == 16) {
                        this.field288 = true;
                        this.field404 = 3;
                        this.field451 = true;
                    }
                } else {
                    if (var5 == 226) {
                        this.field92.method457(525, 210);
                        this.field92.method459(var4);
                        class37 var65 = class37.method359(var4);
                        if (var65.field1156 != null && var65.field1156[0][0] == 5) {
                            int var66 = var65.field1156[0][1];
                            this.field385[var66] = 1 - this.field385[var66];
                            this.method138(var66, true);
                            this.field288 = true;
                        }
                    }
                    if (var5 == 776) {
                        class15 var67 = this.field126[var6];
                        if (var67 != null) {
                            this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var67.field828[0], 0, var67.field827[0], field304.field827[0]);
                            this.field477 = super.field1353;
                            this.field478 = super.field1354;
                            this.field480 = 2;
                            this.field479 = 0;
                            this.field92.method457(525, 111);
                            this.field92.method493(0, var6);
                            this.field92.method495(this.field428, 0);
                            this.field92.method494(this.field427, this.field397);
                            this.field92.method495(this.field426, 0);
                        }
                    }
                    if (var5 == 914) {
                        class8 var68 = this.field417[var6];
                        if (var68 != null) {
                            this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var68.field828[0], 0, var68.field827[0], field304.field827[0]);
                            this.field477 = super.field1353;
                            this.field478 = super.field1354;
                            this.field480 = 2;
                            this.field479 = 0;
                            this.field92.method457(525, 4);
                            this.field92.method459(var6);
                        }
                    }
                    if (var5 == 856) {
                        boolean var69 = this.method73(0, 0, 2, 2, false, 0, 0, field304.field828[0], var4, 0, var3, field304.field827[0]);
                        if (!var69) {
                            this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var4, 0, var3, field304.field827[0]);
                        }
                        this.field477 = super.field1353;
                        this.field478 = super.field1354;
                        this.field480 = 2;
                        this.field479 = 0;
                        this.field92.method457(525, 2);
                        this.field92.method494(this.field472 + var3, this.field397);
                        this.field92.method494(this.field473 + var4, this.field397);
                        this.field92.method495(var6, 0);
                    }
                    if (var5 == 197) {
                        this.field92.method457(525, 33);
                        this.field92.method495(var6, 0);
                        this.field92.method495(var4, 0);
                        this.field92.method459(var3);
                        this.field572 = 0;
                        this.field573 = var4;
                        this.field574 = var3;
                        this.field575 = 2;
                        if (class37.method359(var4).field1182 == this.field99) {
                            this.field575 = 1;
                        }
                        if (class37.method359(var4).field1182 == this.field111) {
                            this.field575 = 3;
                        }
                    }
                    if (var5 == 286) {
                        ++field341;
                        if (field341 >= 89) {
                            this.field92.method457(525, 241);
                            this.field92.method462(0);
                            field341 = 0;
                        }
                        this.method103(var3, var4, (byte) 4, var6);
                        this.field92.method457(525, 161);
                        this.field92.method495(this.field473 + var4, 0);
                        this.field92.method494(var6 >> 14 & 32767, this.field397);
                        this.field92.method459(this.field472 + var3);
                    }
                    if (var5 == 356) {
                        class15 var71 = this.field126[var6];
                        if (var71 != null) {
                            this.method73(1, 0, 2, 2, false, 0, 1, field304.field828[0], var71.field828[0], 0, var71.field827[0], field304.field827[0]);
                            this.field477 = super.field1353;
                            this.field478 = super.field1354;
                            this.field480 = 2;
                            this.field479 = 0;
                            this.field92.method457(525, 116);
                            this.field92.method495(var6, 0);
                        }
                    }
                    if (var5 == 529) {
                        this.field92.method457(525, 248);
                        this.field92.method493(0, var3);
                        this.field92.method459(var6);
                        this.field92.method493(0, var4);
                        this.field572 = 0;
                        this.field573 = var4;
                        this.field574 = var3;
                        this.field575 = 2;
                        if (class37.method359(var4).field1182 == this.field99) {
                            this.field575 = 1;
                        }
                        if (class37.method359(var4).field1182 == this.field111) {
                            this.field575 = 3;
                        }
                    }
                    if (var5 == 1438) {
                        class67 var72 = class67.method575(var6);
                        String var73;
                        if (var72.field1660 != null) {
                            var73 = new String(var72.field1660);
                        } else {
                            var73 = "It's a " + var72.field1709 + ".";
                        }
                        this.method133("", var73, (byte) -30, 0);
                    }
                    this.field425 = 0;
                    this.field431 = 0;
                    int var74 = 56 / arg1;
                    this.field288 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
    public final void method164(byte arg0) {
        int var2 = this.field165.method592(-6377, "Choose Option");
        for (int var3 = 0; var3 < this.field455; ++var3) {
            int var11 = this.field165.method592(-6377, this.field409[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        if (arg0 != 69) {
            this.method158();
        }
        int var4 = this.field455 * 15 + 21;
        if (super.field1353 > 4 && super.field1354 > 4 && super.field1353 < 516 && super.field1354 < 338) {
            int var5 = super.field1353 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1354 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field293 = true;
            this.field511 = 0;
            this.field512 = var5;
            this.field513 = var6;
            this.field514 = var2;
            this.field515 = this.field455 * 15 + 22;
        }
        if (super.field1353 > 553 && super.field1354 > 205 && super.field1353 < 743 && super.field1354 < 466) {
            int var7 = super.field1353 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1354 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field293 = true;
            this.field511 = 1;
            this.field512 = var7;
            this.field513 = var8;
            this.field514 = var2;
            this.field515 = this.field455 * 15 + 22;
        }
        if (super.field1353 > 17 && super.field1354 > 357 && super.field1353 < 496 && super.field1354 < 453) {
            int var9 = super.field1353 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1354 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field293 = true;
            this.field511 = 2;
            this.field512 = var9;
            this.field513 = var10;
            this.field514 = var2;
            this.field515 = this.field455 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILTQYMAXSO;)V")
    private final void method165(int arg0, int arg1, class53 arg2) {
        int var4 = arg2.method479(8, (byte) 63);
        if (var4 < this.field418) {
            for (int var5 = var4; var5 < this.field418; ++var5) {
                this.field313[this.field312++] = this.field419[var5];
            }
        }
        if (var4 > this.field418) {
            signlink.reporterror(this.field448 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field418 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field419[var6];
                class8 var8 = this.field417[var7];
                int var9 = arg2.method479(1, (byte) 63);
                if (var9 == 0) {
                    this.field419[this.field418++] = var7;
                    var8.field784 = field291;
                } else {
                    int var10 = arg2.method479(2, (byte) 63);
                    if (var10 == 0) {
                        this.field419[this.field418++] = var7;
                        var8.field784 = field291;
                        this.field421[this.field420++] = var7;
                    } else if (var10 == 1) {
                        this.field419[this.field418++] = var7;
                        var8.field784 = field291;
                        int var11 = arg2.method479(3, (byte) 63);
                        var8.method226(this.field302, false, var11);
                        int var12 = arg2.method479(1, (byte) 63);
                        if (var12 == 1) {
                            this.field421[this.field420++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field419[this.field418++] = var7;
                        var8.field784 = field291;
                        int var13 = arg2.method479(3, (byte) 63);
                        var8.method226(this.field302, true, var13);
                        int var14 = arg2.method479(3, (byte) 63);
                        var8.method226(this.field302, true, var14);
                        int var15 = arg2.method479(1, (byte) 63);
                        if (var15 == 1) {
                            this.field421[this.field420++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field313[this.field312++] = var7;
                    }
                }
            }
            if (arg1 < 1 || arg1 > 1) {
                this.field243 = -17;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public void method166(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field342);
        if (this.field194 != null) {
            System.out.println("Od-cycle:" + this.field194.field749);
        }
        System.out.println("loop-cycle:" + field291);
        System.out.println("draw-cycle:" + field192);
        this.field258 += arg0;
        System.out.println("ptype:" + this.field259);
        System.out.println("psize:" + this.field258);
        if (this.field107 != null) {
            this.field107.method278(0);
        }
        super.field1335 = true;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final Component method167(int arg0) {
        if (arg0 != 0) {
            this.method158();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1341 != null ? super.field1341 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(B)V")
    public final void method168(byte arg0) {
        if (this.field151 == null) {
            super.field1339 = null;
            this.field527 = null;
            this.field525 = null;
            this.field524 = null;
            this.field526 = null;
            this.field316 = null;
            this.field317 = null;
            this.field318 = null;
            this.field154 = new class60(265, 128, field412, this.method167(0));
            class35.method343(-793);
            this.field155 = new class60(265, 128, field412, this.method167(0));
            class35.method343(-793);
            this.field151 = new class60(171, 509, field412, this.method167(0));
            class35.method343(-793);
            this.field152 = new class60(132, 360, field412, this.method167(0));
            class35.method343(-793);
            this.field153 = new class60(200, 360, field412, this.method167(0));
            class35.method343(-793);
            this.field156 = new class60(238, 202, field412, this.method167(0));
            class35.method343(-793);
            this.field157 = new class60(238, 203, field412, this.method167(0));
            class35.method343(-793);
            this.field158 = new class60(94, 74, field412, this.method167(0));
            class35.method343(-793);
            this.field159 = new class60(94, 75, field412, this.method167(0));
            class35.method343(-793);
            if (arg0 != 3) {
                field398 = 247;
            }
            if (this.field435 != null) {
                this.method112(true);
                this.method95((byte) 65);
            }
            this.field251 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(LTQYMAXSO;II)V")
    private final void method169(class53 arg0, int arg1, int arg2) {
        this.field312 = 0;
        this.field420 = 0;
        this.method76(arg2, false, arg0);
        int var4 = arg1 + arg2;
        this.method107(var4, 452, arg0);
        this.method30(arg0, var4, -889);
        for (int var5 = 0; var5 < this.field312; ++var5) {
            int var7 = this.field313[var5];
            if (field291 != this.field126[var7].field784) {
                this.field126[var7].field709 = null;
                this.field126[var7] = null;
            }
        }
        if (arg0.field1457 != var4) {
            signlink.reporterror(this.field448 + " size mismatch in getnpcpos - pos:" + arg0.field1457 + " psize:" + var4);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field127; ++var6) {
                if (this.field126[this.field128[var6]] == null) {
                    signlink.reporterror(this.field448 + " null entry in npc list - pos:" + var6 + " size:" + this.field127);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method170(int arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            if (arg0 == 0) {
                String[] var4 = new String[100];
                int var5 = 0;
                while (true) {
                    int var6 = var3.indexOf(" ");
                    if (var6 == -1) {
                        String var8 = var3.trim();
                        if (var8.length() > 0) {
                            var4[var5++] = var8.toLowerCase();
                        }
                        this.field502 = 0;
                        label51: for (int var9 = 0; var9 < class67.field1682; ++var9) {
                            class67 var10 = class67.method575(var9);
                            if (var10.field1699 == -1 && var10.field1709 != null) {
                                String var11 = var10.field1709.toLowerCase();
                                for (int var12 = 0; var12 < var5; ++var12) {
                                    if (var11.indexOf(var4[var12]) == -1) {
                                        continue label51;
                                    }
                                }
                                this.field503[this.field502] = var11;
                                this.field504[this.field502] = var9;
                                ++this.field502;
                                if (this.field502 >= this.field503.length) {
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
            this.field502 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method171(int arg0) {
        if (arg0 != 1041) {
            field398 = this.field592.method335();
        }
        for (int var2 = -1; var2 < this.field418; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field416;
            } else {
                var6 = this.field419[var2];
            }
            class8 var7 = this.field417[var6];
            if (var7 != null && var7.field778 > 0) {
                --var7.field778;
                if (var7.field778 == 0) {
                    var7.field802 = null;
                }
            }
        }
        ++field122;
        if (field122 > 61) {
            field122 = 0;
            this.field92.method457(525, 138);
        }
        for (int var3 = 0; var3 < this.field127; ++var3) {
            int var4 = this.field128[var3];
            class15 var5 = this.field126[var4];
            if (var5 != null && var5.field778 > 0) {
                --var5.field778;
                if (var5.field778 == 0) {
                    var5.field802 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method172(String arg0) throws IOException {
        if (!this.field521) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field120 != null) {
                try {
                    this.field120.close();
                } catch (Exception var4) {
                }
                this.field120 = null;
            }
            this.field120 = this.method161(43595);
            this.field120.setSoTimeout(10000);
            InputStream var2 = this.field120.getInputStream();
            OutputStream var3 = this.field120.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method173(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field134 = "";
                this.field135 = "Connecting to server...";
                this.method71(true, true);
            }
            this.field107 = new class29(this.method161(field492 + 43594), this, true);
            long var4 = class41.method405(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field92.field1457 = 0;
            this.field92.method458(14);
            this.field92.method458(var6);
            this.field107.method277(2, (byte) 5, 0, this.field92.field1456);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field107.method274();
            }
            int var8 = this.field107.method274();
            int var9 = var8;
            if (var8 == 0) {
                this.field107.method276(this.field327.field1456, 0, 8);
                this.field327.field1457 = 0;
                this.field343 = this.field327.method474(0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field343 >> 32), (int) this.field343 };
                this.field92.field1457 = 0;
                this.field92.method458(10);
                this.field92.method462(var10[0]);
                this.field92.method462(var10[1]);
                this.field92.method462(var10[2]);
                this.field92.method462(var10[3]);
                this.field92.method462(signlink.uid);
                this.field92.method465(arg0);
                this.field92.method465(arg1);
                this.field92.method483(field271, field346, this.field585);
                this.field103.field1457 = 0;
                if (arg2) {
                    this.field103.method458(18);
                } else {
                    this.field103.method458(16);
                }
                this.field103.method458(this.field92.field1457 + 36 + 1 + 1 + 2);
                this.field103.method458(255);
                this.field103.method459(363);
                this.field103.method458(field494 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field103.method462(this.field388[var11]);
                }
                this.field103.method466(this.field92.field1457, this.field92.field1456, 0, (byte) -4);
                this.field92.field1461 = new class33(0, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field592 = new class33(0, var10);
                this.field107.method277(this.field103.field1457, (byte) 5, 0, this.field103.field1456);
                var8 = this.field107.method274();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method173(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field305 = this.field107.method274();
                field360 = this.field107.method274() == 1;
                this.field266 = 0L;
                this.field469 = 0;
                this.field450.field1609 = 0;
                super.field1343 = true;
                this.field356 = true;
                this.field344 = true;
                this.field92.field1457 = 0;
                this.field327.field1457 = 0;
                this.field259 = -1;
                this.field211 = -1;
                this.field212 = -1;
                this.field213 = -1;
                this.field258 = 0;
                this.field260 = 0;
                this.field275 = 0;
                this.field262 = 0;
                this.field206 = 0;
                this.field455 = 0;
                this.field293 = false;
                super.field1344 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field394[var13] = null;
                }
                this.field425 = 0;
                this.field431 = 0;
                this.field90 = 0;
                this.field138 = 0;
                this.field215 = (int) (Math.random() * 100.0D) - 50;
                this.field171 = (int) (Math.random() * 110.0D) - 55;
                this.field276 = (int) (Math.random() * 80.0D) - 40;
                this.field298 = (int) (Math.random() * 120.0D) - 60;
                this.field547 = (int) (Math.random() * 30.0D) - 20;
                this.field295 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field568 = 0;
                this.field482 = -1;
                this.field348 = 0;
                this.field349 = 0;
                this.field418 = 0;
                this.field127 = 0;
                for (int var14 = 0; var14 < this.field415; ++var14) {
                    this.field417[var14] = null;
                    this.field422[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field126[var15] = null;
                }
                field304 = this.field417[this.field416] = new class8();
                this.field593.method183();
                this.field234.method183();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field137[var16][var17][var18] = null;
                        }
                    }
                }
                this.field391 = new class7((byte) 1);
                this.field565 = 0;
                this.field564 = 0;
                this.method80(this.field577, (byte) -79);
                this.field577 = -1;
                this.method80(this.field111, (byte) -79);
                this.field111 = -1;
                this.method80(this.field99, (byte) -79);
                this.field99 = -1;
                this.method80(this.field369, (byte) -79);
                this.field369 = -1;
                this.method80(this.field484, (byte) -79);
                this.field484 = -1;
                this.method80(this.field133, (byte) -79);
                this.field133 = -1;
                this.method80(this.field108, (byte) -79);
                this.field108 = -1;
                this.field497 = false;
                this.field404 = 3;
                this.field437 = 0;
                this.field293 = false;
                this.field506 = false;
                this.field320 = null;
                this.field204 = 0;
                this.field186 = -1;
                this.field410 = true;
                this.method174(749);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field180[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field285[var20] = null;
                    this.field286[var20] = false;
                }
                field476 = 0;
                field546 = 0;
                field124 = 0;
                field414 = 0;
                field578 = 0;
                field378 = 0;
                field351 = 0;
                field341 = 0;
                field187 = 0;
                field370 = 0;
                this.method83((byte) 7);
            } else if (var8 == 3) {
                this.field134 = "";
                this.field135 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field134 = "Your account has been disabled.";
                this.field135 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field134 = "Your account is already logged in.";
                this.field135 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field134 = "RuneScape has been updated!";
                this.field135 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field134 = "This world is full.";
                this.field135 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field134 = "Unable to connect.";
                this.field135 = "Login server offline.";
            } else if (var8 == 9) {
                this.field134 = "Login limit exceeded.";
                this.field135 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field134 = "Unable to connect.";
                this.field135 = "Bad session id.";
            } else if (var8 == 11) {
                this.field134 = "Login server rejected session.";
                this.field135 = "Please try again.";
            } else if (var8 == 12) {
                this.field134 = "You need a members account to login to this world.";
                this.field135 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field134 = "Could not complete login.";
                this.field135 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field134 = "The server is being updated.";
                this.field135 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field344 = true;
                this.field92.field1457 = 0;
                this.field327.field1457 = 0;
                this.field259 = -1;
                this.field211 = -1;
                this.field212 = -1;
                this.field213 = -1;
                this.field258 = 0;
                this.field260 = 0;
                this.field275 = 0;
                this.field455 = 0;
                this.field293 = false;
                this.field268 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field134 = "Login attempts exceeded.";
                this.field135 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field134 = "You are standing in a members-only area.";
                this.field135 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field134 = "Invalid loginserver requested";
                this.field135 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field134 = "Malformed login packet.";
                    this.field135 = "Please try again.";
                } else if (var8 == 23) {
                    this.field134 = "No reply from loginserver.";
                    this.field135 = "Please try again.";
                } else if (var8 == 24) {
                    this.field134 = "Error loading your profile.";
                    this.field135 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field134 = "Unexpected loginserver response.";
                    this.field135 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field134 = "This computers address has been blocked";
                    this.field135 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field576 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field576;
                            this.method173(arg0, arg1, arg2);
                        } else {
                            this.field134 = "No response from loginserver";
                            this.field135 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field134 = "No response from server";
                        this.field135 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field134 = "Unexpected server response";
                    this.field135 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field107.method274();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field134 = "You have only just left another world";
                    this.field135 = "Your profile will be transferred in: " + var26;
                    this.method71(true, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method173(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field134 = "";
            this.field135 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    public final void method174(int arg0) {
        int var2 = 57 / arg0;
        this.field270 = true;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field485[var3] = -1;
            for (int var4 = 0; var4 < class9.field634; ++var4) {
                if (!class9.field635[var4].field641 && class9.field635[var4].field636 == var3 + (this.field410 ? 0 : 7)) {
                    this.field485[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    private final void method175(boolean arg0) {
        if (arg0) {
            if (this.field90 == 2) {
                for (class28 var2 = (class28) this.field391.method179(); var2 != null; var2 = (class28) this.field391.method181((byte) 2)) {
                    if (var2.field958 > 0) {
                        --var2.field958;
                    }
                    if (var2.field958 == 0) {
                        if (var2.field959 < 0 || class2.method18(var2.field959, -41002, var2.field961)) {
                            this.method94(var2.field962, var2.field961, var2.field965, false, var2.field959, var2.field960, var2.field964, var2.field963);
                            var2.method272();
                        }
                    } else {
                        if (var2.field966 > 0) {
                            --var2.field966;
                        }
                        if (var2.field966 == 0 && var2.field964 >= 1 && var2.field965 >= 1 && var2.field964 <= 102 && var2.field965 <= 102 && (var2.field955 < 0 || class2.method18(var2.field955, -41002, var2.field957))) {
                            this.method94(var2.field962, var2.field957, var2.field965, false, var2.field955, var2.field956, var2.field964, var2.field963);
                            var2.field966 = -1;
                            if (var2.field959 == var2.field955 && var2.field959 == -1) {
                                var2.method272();
                            } else if (var2.field959 == var2.field955 && var2.field960 == var2.field956 && var2.field961 == var2.field957) {
                                var2.method272();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field591) {
            this.method58(-931);
        } else {
            super.run();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field232[var1] = var0 / 4;
        }
        field271 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field272 = 43127;
        field274 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field306 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field306[var3] = var2 - 1;
            var2 += var2;
        }
        field345 = -975;
        field346 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field412 = 4;
        field481 = 166;
        field491 = 10;
        field493 = true;
        field552 = 216;
        field563 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field570 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}
