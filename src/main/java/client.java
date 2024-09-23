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
public class client extends class3 {

    @OriginalMember(owner = "client", name = "L", descriptor = "[[I")
    private int[][] field36 = new int[104][104];

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field38 = -1;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field39 = 510;

    @OriginalMember(owner = "client", name = "Q", descriptor = "[J")
    private long[] field41 = new long[100];

    @OriginalMember(owner = "client", name = "R", descriptor = "[LRZWMPYWU;")
    private class47[] field42 = new class47[13];

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field44 = 9;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field45 = -1;

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field46 = new int[100];

    @OriginalMember(owner = "client", name = "W", descriptor = "[Ljava/lang/String;")
    private String[] field47 = new String[100];

    @OriginalMember(owner = "client", name = "X", descriptor = "[Ljava/lang/String;")
    private String[] field48 = new String[100];

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field52 = 5233;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field63 = false;

    @OriginalMember(owner = "client", name = "nb", descriptor = "[LZWUMKFUX;")
    private class72[] field64 = new class72[1000];

    @OriginalMember(owner = "client", name = "ob", descriptor = "Z")
    private boolean field65 = true;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field79 = -427;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Z")
    private volatile boolean field80 = false;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private boolean field81 = true;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Z")
    private boolean field86 = false;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field88 = 897;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field91 = 2;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[J")
    private long[] field93 = new long[200];

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field94 = 368;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Ljava/lang/String;")
    private String field96 = "";

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[LXGQETHKV;")
    public class59[] field99 = new class59[5];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[I")
    public int[] field102 = new int[1000];

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    private int[] field103 = new int[50];

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field104 = -1;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field105 = 4;

    @OriginalMember(owner = "client", name = "ec", descriptor = "[I")
    private int[] field107 = new int[class40.field1204];

    @OriginalMember(owner = "client", name = "gc", descriptor = "[Ljava/lang/String;")
    private String[] field109 = new String[200];

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field110 = 5063219;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[LZWUMKFUX;")
    private class72[] field113 = new class72[32];

    @OriginalMember(owner = "client", name = "lc", descriptor = "Z")
    private boolean field114 = true;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field120 = 2301979;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field122 = 1;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field131 = 7759444;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[I")
    private int[] field133 = new int[151];

    @OriginalMember(owner = "client", name = "Fc", descriptor = "[I")
    public int[] field134 = new int[2000];

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Z")
    private boolean field135 = false;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field136 = -53;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Ljava/lang/String;")
    private String field137 = "";

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Ljava/lang/String;")
    private String field138 = "";

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field144 = 3353893;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "B")
    private byte field145 = 8;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field149 = 6;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Z")
    private boolean field152 = false;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field154 = -1;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field156 = -1;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[Ljava/lang/String;")
    private String[] field166 = new String[500];

    @OriginalMember(owner = "client", name = "md", descriptor = "Z")
    private boolean field167 = true;

    @OriginalMember(owner = "client", name = "od", descriptor = "Z")
    private boolean field169 = true;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Z")
    private boolean field170 = false;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Z")
    private boolean field176 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field177 = -930;

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    private int[] field179 = new int[151];

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Z")
    private boolean field185 = false;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field186 = -100;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Z")
    private boolean field192 = false;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field193 = -44493;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field195 = 78;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field197 = -1;

    @OriginalMember(owner = "client", name = "Td", descriptor = "[I")
    private int[] field200 = new int[50];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Ljava/lang/String;")
    private String field202 = "";

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Z")
    private boolean field203 = false;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field215 = 3;

    @OriginalMember(owner = "client", name = "je", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field217 = new CRC32();

    @OriginalMember(owner = "client", name = "le", descriptor = "[B")
    private byte[] field218 = new byte[16384];

    @OriginalMember(owner = "client", name = "me", descriptor = "Z")
    private volatile boolean field219 = false;

    @OriginalMember(owner = "client", name = "oe", descriptor = "[LEAREBDMK;")
    private class8[] field221 = new class8[4];

    @OriginalMember(owner = "client", name = "pe", descriptor = "B")
    private byte field222 = 1;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field227 = -556;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field233 = -1;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Z")
    private boolean field234 = false;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[I")
    private int[] field235 = new int[500];

    @OriginalMember(owner = "client", name = "De", descriptor = "[I")
    private int[] field236 = new int[500];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[I")
    private int[] field237 = new int[500];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[I")
    private int[] field238 = new int[500];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field241 = -32879;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private int[] field242 = new int[5];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    private int[] field243 = new int[256];

    @OriginalMember(owner = "client", name = "Me", descriptor = "Z")
    private boolean field245 = false;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Z")
    private boolean field248 = true;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field249 = -4;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field250 = 44885;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[I")
    private int[] field253 = new int[200];

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[I")
    private int[] field254 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Z")
    private boolean field256 = false;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "LNHEPCMLW;")
    private class35 field257 = class35.method337(field518, 1);

    @OriginalMember(owner = "client", name = "Ze", descriptor = "[[[LOCPYCLUF;")
    private class38[][][] field258 = new class38[4][104][104];

    @OriginalMember(owner = "client", name = "ef", descriptor = "Z")
    private boolean field263 = false;

    @OriginalMember(owner = "client", name = "ff", descriptor = "Z")
    private boolean field264 = false;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Z")
    private boolean field265 = false;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Ljava/lang/String;")
    private String field266 = "";

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field267 = -15455;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Z")
    private boolean field275 = false;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field285 = new int[5];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[Ljava/lang/String;")
    private String[] field286 = new String[5];

    @OriginalMember(owner = "client", name = "Df", descriptor = "[Z")
    private boolean[] field287 = new boolean[5];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Z")
    private boolean field289 = false;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field297 = new int[4000];

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    private int[] field298 = new int[4000];

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field302 = 1;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Z")
    private boolean field303 = false;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Z")
    private boolean field306 = true;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[LZWUMKFUX;")
    private class72[] field307 = new class72[32];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field309 = 2;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field312 = -1;

    @OriginalMember(owner = "client", name = "ng", descriptor = "[I")
    private int[] field323 = new int[5];

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field324 = 128;

    @OriginalMember(owner = "client", name = "wg", descriptor = "LOCPYCLUF;")
    private class38 field332 = new class38((byte) 118);

    @OriginalMember(owner = "client", name = "yg", descriptor = "[LZWUMKFUX;")
    private class72[] field334 = new class72[100];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field338 = -1;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "LNHEPCMLW;")
    private class35 field339 = new class35((byte) -103, new byte[5000]);

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[LZLSEKGJR;")
    private class67[] field340 = new class67[16384];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    public int[] field342 = new int[16384];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[I")
    private int[] field344 = new int[7];

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Z")
    private boolean field348 = false;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field351 = -867;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "Z")
    private boolean field356 = false;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field358 = new int[9];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field359 = 930;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    private final int[] field360 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "ah", descriptor = "Ljava/lang/String;")
    private String field362 = "";

    @OriginalMember(owner = "client", name = "bh", descriptor = "Ljava/lang/String;")
    private String field363 = "";

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field364 = -1;

    @OriginalMember(owner = "client", name = "dh", descriptor = "LNHEPCMLW;")
    private class35 field365 = class35.method337(field518, 1);

    @OriginalMember(owner = "client", name = "kh", descriptor = "Ljava/lang/String;")
    private String field372 = "";

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field377 = -1;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field378 = -1;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field379 = -359;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    private int[] field380 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "vh", descriptor = "Z")
    private boolean field383 = false;

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field384 = new int[5];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field389 = 2048;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field390 = 2047;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[LHDYGEGXY;")
    private class17[] field391 = new class17[this.field389];

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[I")
    public int[] field393 = new int[this.field389];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[I")
    private int[] field395 = new int[this.field389];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[LNHEPCMLW;")
    private class35[] field396 = new class35[this.field389];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field397 = 343;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[LZWUMKFUX;")
    private class72[] field398 = new class72[32];

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Z")
    private boolean field400 = false;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "LOCPYCLUF;")
    private class38 field402 = new class38((byte) 118);

    @OriginalMember(owner = "client", name = "Ph", descriptor = "[I")
    private int[] field403 = new int[class40.field1204];

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Z")
    private boolean field404 = false;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Z")
    public boolean field410 = false;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[LRZWMPYWU;")
    private class47[] field411 = new class47[2];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[I")
    private int[] field413 = new int[33];

    @OriginalMember(owner = "client", name = "fi", descriptor = "LHZINZKXF;")
    private class20 field419 = new class20();

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field420 = -1;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[Z")
    private boolean[] field422 = new boolean[5];

    @OriginalMember(owner = "client", name = "ji", descriptor = "LNHEPCMLW;")
    private class35 field423 = class35.method337(field518, 1);

    @OriginalMember(owner = "client", name = "ki", descriptor = "Z")
    private volatile boolean field424 = false;

    @OriginalMember(owner = "client", name = "li", descriptor = "Z")
    private boolean field425 = true;

    @OriginalMember(owner = "client", name = "mi", descriptor = "[I")
    private int[] field426 = new int[33];

    @OriginalMember(owner = "client", name = "ti", descriptor = "Z")
    public boolean field433 = true;

    @OriginalMember(owner = "client", name = "ui", descriptor = "[I")
    private int[] field434 = new int[50];

    @OriginalMember(owner = "client", name = "xi", descriptor = "[[I")
    private int[][] field437 = new int[104][104];

    @OriginalMember(owner = "client", name = "yi", descriptor = "[[I")
    private int[][] field438 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private final int field440 = 100;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[I")
    private int[] field441 = new int[100];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "B")
    private byte field442 = -100;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "B")
    private byte field447 = 52;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "[I")
    private int[] field448 = new int[5];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field450 = 50;

    @OriginalMember(owner = "client", name = "Li", descriptor = "[I")
    private int[] field451 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[I")
    private int[] field452 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[I")
    private int[] field453 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field454 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[I")
    private int[] field455 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[I")
    private int[] field456 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[I")
    private int[] field457 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Si", descriptor = "[Ljava/lang/String;")
    private String[] field458 = new String[this.field450];

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    public int[] field459 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Z")
    private boolean field462 = false;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Ljava/lang/String;")
    private String field463 = "";

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field468 = -1;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field470 = -1;

    @OriginalMember(owner = "client", name = "gj", descriptor = "[[[I")
    private int[][][] field472 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "ij", descriptor = "[I")
    private int[] field474 = new int[1000];

    @OriginalMember(owner = "client", name = "jj", descriptor = "[I")
    private int[] field475 = new int[1000];

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field476 = -1;

    @OriginalMember(owner = "client", name = "lj", descriptor = "[I")
    private int[] field477 = new int[class40.field1204];

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field486 = 2;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field487 = 403;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "[LZWUMKFUX;")
    private class72[] field495 = new class72[20];

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[I")
    private int[] field496 = new int[2000];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field497 = -911;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "Z")
    private boolean field498 = true;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "B")
    private byte field515 = 8;

    @OriginalMember(owner = "client", name = "Yj", descriptor = "[LZWUMKFUX;")
    private class72[] field516 = new class72[8];

    @OriginalMember(owner = "client", name = "Zj", descriptor = "[LRZWMPYWU;")
    private class47[] field517 = new class47[100];

    @OriginalMember(owner = "client", name = "bk", descriptor = "LOCPYCLUF;")
    private class38 field519 = new class38((byte) 118);

    @OriginalMember(owner = "client", name = "ck", descriptor = "I")
    private int field520 = -456;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private static int field57 = -44493;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field132 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "ud", descriptor = "[[I")
    public static final int[][] field175 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Sd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field199 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Ljava/lang/String;")
    private static String field247 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[I")
    private static int[] field304 = new int[99];

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    public static final int[] field311;

    @OriginalMember(owner = "client", name = "nh", descriptor = "Z")
    private static boolean field375;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[I")
    public static int[] field405;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private static int field464;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Z")
    private static boolean field466;

    @OriginalMember(owner = "client", name = "ak", descriptor = "I")
    private static int field518;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private static int field123;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private static int field150;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private static int field155;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private static int field213;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private static int field214;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private static int field252;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private static int field296;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private static int field352;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private static int field355;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private static int field368;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private static int field385;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private static int field412;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private static int field421;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private static int field443;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field51;

    @OriginalMember(owner = "client", name = "dk", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client", name = "ek", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field58;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field61;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private static int field76;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private static int field87;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "J")
    private long field153;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "J")
    private long field194;

    @OriginalMember(owner = "client", name = "af", descriptor = "J")
    private long field259;

    @OriginalMember(owner = "client", name = "dg", descriptor = "J")
    private long field313;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "J")
    public long field399;

    @OriginalMember(owner = "client", name = "ni", descriptor = "LGCURPWTI;")
    private class13 field427;

    @OriginalMember(owner = "client", name = "oi", descriptor = "LGCURPWTI;")
    private class13 field428;

    @OriginalMember(owner = "client", name = "pi", descriptor = "LGCURPWTI;")
    private class13 field429;

    @OriginalMember(owner = "client", name = "qi", descriptor = "LGCURPWTI;")
    private class13 field430;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LHDYGEGXY;")
    public static class17 field446;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LINOFEYKQ;")
    private class21 field288;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "LIPEHOOFG;")
    private class22 field353;

    @OriginalMember(owner = "client", name = "xb", descriptor = "LLZVLFSBA;")
    public class31 field74;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "LRZWMPYWU;")
    private class47 field204;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "LRZWMPYWU;")
    private class47 field205;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "LRZWMPYWU;")
    private class47 field206;

    @OriginalMember(owner = "client", name = "ae", descriptor = "LRZWMPYWU;")
    private class47 field207;

    @OriginalMember(owner = "client", name = "be", descriptor = "LRZWMPYWU;")
    private class47 field208;

    @OriginalMember(owner = "client", name = "zg", descriptor = "LRZWMPYWU;")
    private class47 field335;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "LRZWMPYWU;")
    private class47 field336;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "LRZWMPYWU;")
    private class47 field337;

    @OriginalMember(owner = "client", name = "yh", descriptor = "LRZWMPYWU;")
    private class47 field386;

    @OriginalMember(owner = "client", name = "zh", descriptor = "LRZWMPYWU;")
    private class47 field387;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "LRZWMPYWU;")
    private class47 field388;

    @OriginalMember(owner = "client", name = "ai", descriptor = "LRZWMPYWU;")
    private class47 field414;

    @OriginalMember(owner = "client", name = "bi", descriptor = "LRZWMPYWU;")
    private class47 field415;

    @OriginalMember(owner = "client", name = "ci", descriptor = "LRZWMPYWU;")
    private class47 field416;

    @OriginalMember(owner = "client", name = "di", descriptor = "LRZWMPYWU;")
    private class47 field417;

    @OriginalMember(owner = "client", name = "ei", descriptor = "LRZWMPYWU;")
    private class47 field418;

    @OriginalMember(owner = "client", name = "ri", descriptor = "LRZWMPYWU;")
    private class47 field431;

    @OriginalMember(owner = "client", name = "si", descriptor = "LRZWMPYWU;")
    private class47 field432;

    @OriginalMember(owner = "client", name = "Y", descriptor = "LRZWMPYWU;")
    private class47 field49;

    @OriginalMember(owner = "client", name = "Z", descriptor = "LRZWMPYWU;")
    private class47 field50;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LTEXKPKZX;")
    private class49 field130;

    @OriginalMember(owner = "client", name = "P", descriptor = "LVNVHYJAS;")
    private class55 field40;

    @OriginalMember(owner = "client", name = "cd", descriptor = "LVOQVBLJN;")
    private class56 field157;

    @OriginalMember(owner = "client", name = "dd", descriptor = "LVOQVBLJN;")
    private class56 field158;

    @OriginalMember(owner = "client", name = "ed", descriptor = "LVOQVBLJN;")
    private class56 field159;

    @OriginalMember(owner = "client", name = "fd", descriptor = "LVOQVBLJN;")
    private class56 field160;

    @OriginalMember(owner = "client", name = "gd", descriptor = "LVOQVBLJN;")
    private class56 field161;

    @OriginalMember(owner = "client", name = "hd", descriptor = "LVOQVBLJN;")
    private class56 field162;

    @OriginalMember(owner = "client", name = "id", descriptor = "LVOQVBLJN;")
    private class56 field163;

    @OriginalMember(owner = "client", name = "jd", descriptor = "LVOQVBLJN;")
    private class56 field164;

    @OriginalMember(owner = "client", name = "kd", descriptor = "LVOQVBLJN;")
    private class56 field165;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "LVOQVBLJN;")
    private class56 field187;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "LVOQVBLJN;")
    private class56 field188;

    @OriginalMember(owner = "client", name = "Id", descriptor = "LVOQVBLJN;")
    private class56 field189;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "LVOQVBLJN;")
    private class56 field190;

    @OriginalMember(owner = "client", name = "hh", descriptor = "LVOQVBLJN;")
    private class56 field369;

    @OriginalMember(owner = "client", name = "ih", descriptor = "LVOQVBLJN;")
    private class56 field370;

    @OriginalMember(owner = "client", name = "jh", descriptor = "LVOQVBLJN;")
    private class56 field371;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "LVOQVBLJN;")
    private class56 field506;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "LVOQVBLJN;")
    private class56 field507;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "LVOQVBLJN;")
    private class56 field508;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "LVOQVBLJN;")
    private class56 field509;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "LVOQVBLJN;")
    private class56 field510;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "LVOQVBLJN;")
    private class56 field511;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "LVOQVBLJN;")
    private class56 field512;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "LVOQVBLJN;")
    private class56 field513;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "LVOQVBLJN;")
    private class56 field514;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "LYVLAOVKQ;")
    private class64 field146;

    @OriginalMember(owner = "client", name = "ee", descriptor = "LZWUMKFUX;")
    private class72 field211;

    @OriginalMember(owner = "client", name = "jg", descriptor = "LZWUMKFUX;")
    private class72 field319;

    @OriginalMember(owner = "client", name = "kg", descriptor = "LZWUMKFUX;")
    private class72 field320;

    @OriginalMember(owner = "client", name = "tg", descriptor = "LZWUMKFUX;")
    private class72 field329;

    @OriginalMember(owner = "client", name = "M", descriptor = "LZWUMKFUX;")
    private class72 field37;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "LZWUMKFUX;")
    private class72 field461;

    @OriginalMember(owner = "client", name = "mj", descriptor = "LZWUMKFUX;")
    private class72 field478;

    @OriginalMember(owner = "client", name = "nj", descriptor = "LZWUMKFUX;")
    private class72 field479;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "LZWUMKFUX;")
    private class72 field499;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "LZWUMKFUX;")
    private class72 field500;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "LZWUMKFUX;")
    private class72 field501;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "LZWUMKFUX;")
    private class72 field502;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "LZWUMKFUX;")
    private class72 field503;

    @OriginalMember(owner = "client", name = "ub", descriptor = "LZWUMKFUX;")
    private class72 field71;

    @OriginalMember(owner = "client", name = "vb", descriptor = "LZWUMKFUX;")
    private class72 field72;

    @OriginalMember(owner = "client", name = "td", descriptor = "Ljava/lang/String;")
    public String field174;

    @OriginalMember(owner = "client", name = "mh", descriptor = "Ljava/lang/String;")
    private String field374;

    @OriginalMember(owner = "client", name = "vi", descriptor = "Ljava/lang/String;")
    private String field435;

    @OriginalMember(owner = "client", name = "sj", descriptor = "Ljava/lang/String;")
    public String field484;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Ljava/net/Socket;")
    private Socket field349;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    public static boolean field108;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private static boolean field270;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    private static boolean field467;

    @OriginalMember(owner = "client", name = "wj", descriptor = "Z")
    public static boolean field488;

    @OriginalMember(owner = "client", name = "re", descriptor = "[I")
    private int[] field224;

    @OriginalMember(owner = "client", name = "se", descriptor = "[I")
    private int[] field225;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[I")
    private int[] field239;

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field240;

    @OriginalMember(owner = "client", name = "bf", descriptor = "[I")
    private int[] field260;

    @OriginalMember(owner = "client", name = "cf", descriptor = "[I")
    private int[] field261;

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field262;

    @OriginalMember(owner = "client", name = "zj", descriptor = "[I")
    private int[] field491;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "[I")
    private int[] field492;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[I")
    private int[] field493;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[I")
    private int[] field494;

    @OriginalMember(owner = "client", name = "cb", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field54;

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "client", name = "xg", descriptor = "[LRZWMPYWU;")
    private class47[] field333;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[[B")
    private byte[][] field305;

    @OriginalMember(owner = "client", name = "zi", descriptor = "[[B")
    private byte[][] field439;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[[[B")
    private byte[][][] field343;

    @OriginalMember(owner = "client", name = "dc", descriptor = "[[[I")
    private int[][][] field106;

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method5(int arg0, int arg1, int arg2) {
        if (arg1 >= 0 && arg1 <= 0) {
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
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZIIIIIIZI)Z")
    public final boolean method6(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field36[var15][var35] = 0;
                this.field438[var15][var35] = 99999999;
            }
        }
        int var16 = arg9;
        int var17 = arg2;
        this.field36[arg9][arg2] = 99;
        this.field438[arg9][arg2] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field297[var18] = arg9;
        int var36 = var18 + 1;
        this.field298[var18] = arg2;
        boolean var20 = false;
        int var21 = this.field297.length;
        int[][] var22 = this.field221[this.field97].field691;
        while (var36 != var19) {
            var16 = this.field297[var19];
            var17 = this.field298[var19];
            var19 = (var19 + 1) % var21;
            if (arg7 == var16 && arg1 == var17) {
                var20 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && this.field221[this.field97].method197(var17, arg0 - 1, arg1, var16, false, arg5, arg7)) {
                    var20 = true;
                    break;
                }
                if (arg0 < 10 && this.field221[this.field97].method198(arg5, arg7, arg0 - 1, var17, arg1, 0, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg11 != 0 && this.field221[this.field97].method199(arg4, arg7, -30038, arg8, var16, var17, arg1, arg11)) {
                var20 = true;
                break;
            }
            int var34 = this.field438[var16][var17] + 1;
            if (var16 > 0 && this.field36[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field297[var36] = var16 - 1;
                this.field298[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field36[var16 - 1][var17] = 2;
                this.field438[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field36[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field297[var36] = var16 + 1;
                this.field298[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field36[var16 + 1][var17] = 8;
                this.field438[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field36[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field297[var36] = var16;
                this.field298[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field36[var16][var17 - 1] = 1;
                this.field438[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field36[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field297[var36] = var16;
                this.field298[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field36[var16][var17 + 1] = 4;
                this.field438[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field36[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field297[var36] = var16 - 1;
                this.field298[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field36[var16 - 1][var17 - 1] = 3;
                this.field438[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field36[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field297[var36] = var16 + 1;
                this.field298[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field36[var16 + 1][var17 - 1] = 9;
                this.field438[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field36[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field297[var36] = var16 - 1;
                this.field298[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field36[var16 - 1][var17 + 1] = 6;
                this.field438[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field36[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field297[var36] = var16 + 1;
                this.field298[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field36[var16 + 1][var17 + 1] = 12;
                this.field438[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field198 = 0;
        if (!var20) {
            if (arg3) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg7 - var24; var25 <= arg7 + var24; ++var25) {
                        for (int var26 = arg1 - var24; var26 <= arg1 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field438[var25][var26] < var23) {
                                var23 = this.field438[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field198 = 1;
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
        this.field297[var27] = var16;
        int var37 = var27 + 1;
        this.field298[var27] = var17;
        int var28;
        int var29 = var28 = this.field36[var16][var17];
        if (arg10) {
            throw new NullPointerException();
        } else {
            while (arg9 != var16 || arg2 != var17) {
                if (var28 != var29) {
                    var28 = var29;
                    this.field297[var37] = var16;
                    this.field298[var37++] = var17;
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
                var29 = this.field36[var16][var17];
            }
            if (var37 <= 0) {
                if (arg6 == 1) {
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
                int var31 = this.field297[var37];
                int var32 = this.field298[var37];
                if (arg6 == 0) {
                    this.field365.method338(226, 10041);
                    this.field365.method339(var30 + var30 + 3);
                }
                if (arg6 == 1) {
                    this.field365.method338(114, 10041);
                    this.field365.method339(var30 + var30 + 3 + 14);
                }
                if (arg6 == 2) {
                    this.field365.method338(143, 10041);
                    this.field365.method339(var30 + var30 + 3);
                }
                this.field365.method374(this.field290 + var31, this.field170);
                this.field365.method374(this.field291 + var32, this.field170);
                this.field365.method366(2, super.field552[5] == 1 ? 1 : 0);
                this.field209 = this.field297[0];
                this.field210 = this.field298[0];
                for (int var33 = 1; var33 < var30; ++var33) {
                    --var37;
                    this.field365.method366(2, this.field297[var37] - var31);
                    this.field365.method365(this.field298[var37] - var32, this.field442);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (this.field521 >= 2 || this.field480 != 0 || this.field171 != 0) {
            if (!arg0) {
                this.field365.method339(99);
            }
            String var2;
            if (this.field480 == 1 && this.field521 < 2) {
                var2 = "Use " + this.field484 + " with...";
            } else if (this.field171 == 1 && this.field521 < 2) {
                var2 = this.field174 + "...";
            } else {
                var2 = this.field166[this.field521 - 1];
            }
            if (this.field521 > 2) {
                var2 = var2 + "@whi@ / " + (this.field521 - 2) + " more options";
            }
            this.field429.method221(15, field505 / 1000, true, 16777215, true, 4, var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method8(byte arg0) {
        int var2 = this.field228 * 128 + 64;
        int var3 = this.field229 * 128 + 64;
        int var4 = this.method52(this.field97, var3, -430, var2) - this.field230;
        if (this.field66 < var2) {
            this.field66 += (var2 - this.field66) * this.field232 / 1000 + this.field231;
            if (this.field66 > var2) {
                this.field66 = var2;
            }
        }
        if (this.field66 > var2) {
            this.field66 -= (this.field66 - var2) * this.field232 / 1000 + this.field231;
            if (this.field66 < var2) {
                this.field66 = var2;
            }
        }
        if (this.field67 < var4) {
            this.field67 += (var4 - this.field67) * this.field232 / 1000 + this.field231;
            if (this.field67 > var4) {
                this.field67 = var4;
            }
        }
        if (this.field67 > var4) {
            this.field67 -= (this.field67 - var4) * this.field232 / 1000 + this.field231;
            if (this.field67 < var4) {
                this.field67 = var4;
            }
        }
        if (this.field68 < var3) {
            this.field68 += (var3 - this.field68) * this.field232 / 1000 + this.field231;
            if (this.field68 > var3) {
                this.field68 = var3;
            }
        }
        if (this.field68 > var3) {
            this.field68 -= (this.field68 - var3) * this.field232 / 1000 + this.field231;
            if (this.field68 < var3) {
                this.field68 = var3;
            }
        }
        int var5 = this.field124 * 128 + 64;
        int var6 = this.field125 * 128 + 64;
        int var7 = this.method52(this.field97, var6, -430, var5) - this.field126;
        if (arg0 != -48) {
            this.field140 = -1;
        }
        int var8 = var5 - this.field66;
        int var9 = var7 - this.field67;
        int var10 = var6 - this.field68;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field69 < var12) {
            this.field69 += (var12 - this.field69) * this.field128 / 1000 + this.field127;
            if (this.field69 > var12) {
                this.field69 = var12;
            }
        }
        if (this.field69 > var12) {
            this.field69 -= (this.field69 - var12) * this.field128 / 1000 + this.field127;
            if (this.field69 < var12) {
                this.field69 = var12;
            }
        }
        int var14 = var13 - this.field70;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field70 += this.field128 * var14 / 1000 + this.field127;
            this.field70 &= 2047;
        }
        if (var14 < 0) {
            this.field70 -= -var14 * this.field128 / 1000 + this.field127;
            this.field70 &= 2047;
        }
        int var15 = var13 - this.field70;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field70 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)I")
    public final int method9(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        if (arg1 != 5) {
            field375 = !field375;
        }
        return ((arg0 & 16711935) * arg2 + (arg3 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg2 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method10(boolean arg0, long arg1) {
        this.field410 &= arg0;
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field460; ++var4) {
                if (this.field41[var4] == arg1) {
                    --this.field460;
                    this.field135 = true;
                    for (int var5 = var4; var5 < this.field460; ++var5) {
                        this.field41[var5] = this.field41[var5 + 1];
                    }
                    this.field365.method338(174, 10041);
                    this.field365.method345(arg1, (byte) 7);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method11(byte[] arg0, int arg1, boolean arg2) {
        this.field139 += arg1;
        if (this.field167) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method12(int arg0, int arg1) {
        int var2 = 60 / arg0;
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIILHZINZKXF;I)V")
    public final void method13(boolean arg0, int arg1, int arg2, class20 arg3, int arg4) {
        if (!arg0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (arg3.field894 == 0 && arg3.field950 != null) {
            if (!arg3.field904 || this.field92 == arg3.field898 || this.field148 == arg3.field898 || this.field382 == arg3.field898) {
                int var7 = class36.field1129;
                int var8 = class36.field1127;
                int var9 = class36.field1130;
                int var10 = class36.field1128;
                class36.method390(arg2, arg3.field895 + arg1, (byte) 98, arg1, arg3.field923 + arg2);
                int var11 = arg3.field950.length;
                for (int var12 = 0; var12 < var11; ++var12) {
                    int var13 = arg3.field941[var12] + arg2;
                    int var14 = arg3.field906[var12] + arg1 - arg4;
                    class20 var15 = class20.method269(arg3.field950[var12]);
                    int var16 = var15.field964 + var13;
                    int var17 = var15.field943 + var14;
                    if (var15.field961 > 0) {
                        this.method142(this.field498, var15);
                    }
                    if (var15.field894 == 0) {
                        if (var15.field903 > var15.field926 - var15.field895) {
                            var15.field903 = var15.field926 - var15.field895;
                        }
                        if (var15.field903 < 0) {
                            var15.field903 = 0;
                        }
                        this.method13(true, var17, var16, var15, var15.field903);
                        if (var15.field926 > var15.field895) {
                            this.method34((byte) 85, var15.field926, var15.field923 + var16, var17, var15.field903, var15.field895);
                        }
                    } else if (var15.field894 != 1) {
                        if (var15.field894 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field895; ++var19) {
                                for (int var20 = 0; var20 < var15.field923; ++var20) {
                                    int var21 = (var15.field921 + 32) * var20 + var16;
                                    int var22 = (var15.field892 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field933[var18];
                                        var22 += var15.field930[var18];
                                    }
                                    if (var15.field946[var18] <= 0) {
                                        if (var15.field918 != null && var18 < 20) {
                                            class72 var31 = var15.field918[var18];
                                            if (var31 != null) {
                                                var31.method594(var21, var22, (byte) 8);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field946[var18] - 1;
                                        if (var21 > class36.field1129 - 32 && var21 < class36.field1130 && var22 > class36.field1127 - 32 && var22 < class36.field1128 || this.field278 != 0 && this.field277 == var18) {
                                            int var26 = 0;
                                            if (this.field480 == 1 && this.field481 == var18 && this.field482 == var15.field898) {
                                                var26 = 16777215;
                                            }
                                            class72 var27 = class19.method256(var26, var25, var15.field944[var18], false);
                                            if (var27 != null) {
                                                if (this.field278 != 0 && this.field277 == var18 && this.field276 == var15.field898) {
                                                    var23 = super.field542 - this.field279;
                                                    var24 = super.field543 - this.field280;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field223 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method596(var22 + var24, var21 + var23, 128, 928);
                                                    if (var22 + var24 < class36.field1127 && arg3.field903 > 0) {
                                                        int var28 = (class36.field1127 - var22 - var24) * this.field281 / 3;
                                                        if (var28 > this.field281 * 10) {
                                                            var28 = this.field281 * 10;
                                                        }
                                                        if (var28 > arg3.field903) {
                                                            var28 = arg3.field903;
                                                        }
                                                        arg3.field903 -= var28;
                                                        this.field280 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class36.field1128 && arg3.field903 < arg3.field926 - arg3.field895) {
                                                        int var29 = (var22 + var24 + 32 - class36.field1128) * this.field281 / 3;
                                                        if (var29 > this.field281 * 10) {
                                                            var29 = this.field281 * 10;
                                                        }
                                                        if (var29 > arg3.field926 - arg3.field895 - arg3.field903) {
                                                            var29 = arg3.field926 - arg3.field895 - arg3.field903;
                                                        }
                                                        arg3.field903 += var29;
                                                        this.field280 -= var29;
                                                    }
                                                } else if (this.field85 != 0 && this.field84 == var18 && this.field83 == var15.field898) {
                                                    var27.method596(var22, var21, 128, 928);
                                                } else {
                                                    var27.method594(var21, var22, (byte) 8);
                                                }
                                                if (var27.field1729 == 33 || var15.field944[var18] != 1) {
                                                    int var30 = var15.field944[var18];
                                                    this.field427.method216(method12(202, var30), var21 + 1 + var23, (byte) 2, var22 + 10 + var24, 0);
                                                    this.field427.method216(method12(202, var30), var21 + var23, (byte) 2, var22 + 9 + var24, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field894 == 3) {
                            boolean var32 = false;
                            if (this.field382 == var15.field898 || this.field148 == var15.field898 || this.field92 == var15.field898) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method99(var15, (byte) 2)) {
                                var33 = var15.field966;
                                if (var32 && var15.field922 != 0) {
                                    var33 = var15.field922;
                                }
                            } else {
                                var33 = var15.field932;
                                if (var32 && var15.field915 != 0) {
                                    var33 = var15.field915;
                                }
                            }
                            if (var15.field929 == 0) {
                                if (var15.field949) {
                                    class36.method393(var16, var33, var15.field895, var17, 0, var15.field923);
                                } else {
                                    class36.method394(var33, (byte) 52, var17, var15.field923, var15.field895, var16);
                                }
                            } else if (var15.field949) {
                                class36.method392(0, var15.field923, var17, var33, 256 - (var15.field929 & 255), var15.field895, var16);
                            } else {
                                class36.method395(var17, var16, 1, 256 - (var15.field929 & 255), var15.field895, var33, var15.field923);
                            }
                        } else if (var15.field894 == 4) {
                            class13 var34 = var15.field909;
                            String var35 = var15.field900;
                            boolean var36 = false;
                            if (this.field382 == var15.field898 || this.field148 == var15.field898 || this.field92 == var15.field898) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method99(var15, (byte) 2)) {
                                var37 = var15.field966;
                                if (var36 && var15.field922 != 0) {
                                    var37 = var15.field922;
                                }
                                if (var15.field924.length() > 0) {
                                    var35 = var15.field924;
                                }
                            } else {
                                var37 = var15.field932;
                                if (var36 && var15.field915 != 0) {
                                    var37 = var15.field915;
                                }
                            }
                            if (var15.field953 == 6 && this.field185) {
                                var35 = "Please wait...";
                                var37 = var15.field932;
                            }
                            if (class36.field1125 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field760 + var17;
                            while (var35.length() > 0) {
                                if (var35.indexOf("%") != -1) {
                                    label390: while (true) {
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
                                                                            break label390;
                                                                        }
                                                                        var35 = var35.substring(0, var43) + this.method112(this.method82((byte) 65, var15, 4), -427) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method112(this.method82((byte) 65, var15, 3), -427) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method112(this.method82((byte) 65, var15, 2), -427) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method112(this.method82((byte) 65, var15, 1), -427) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method112(this.method82((byte) 65, var15, 0), -427) + var35.substring(var39 + 2);
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
                                if (var15.field920) {
                                    var34.method213(var37, var15.field948, false, var15.field923 / 2 + var16, var38, var45);
                                } else {
                                    var34.method220(var38, var45, false, var15.field948, var37, var16);
                                }
                                var38 += var34.field760;
                            }
                        } else if (var15.field894 == 5) {
                            class72 var46;
                            if (this.method99(var15, (byte) 2)) {
                                var46 = var15.field955;
                            } else {
                                var46 = var15.field960;
                            }
                            if (var46 != null) {
                                var46.method594(var16, var17, (byte) 8);
                            }
                        } else if (var15.field894 == 6) {
                            int var47 = class62.field1638;
                            int var48 = class62.field1639;
                            class62.field1638 = var15.field923 / 2 + var16;
                            class62.field1639 = var15.field895 / 2 + var17;
                            int var49 = class62.field1642[var15.field935] * var15.field934 >> 16;
                            int var50 = class62.field1643[var15.field935] * var15.field934 >> 16;
                            boolean var51 = this.method99(var15, (byte) 2);
                            int var52;
                            if (var51) {
                                var52 = var15.field913;
                            } else {
                                var52 = var15.field912;
                            }
                            class4 var53;
                            if (var52 == -1) {
                                var53 = var15.method270(426, -1, var51, -1);
                            } else {
                                class42 var54 = class42.field1219[var52];
                                var53 = var15.method270(426, var54.field1221[var15.field939], var51, var54.field1222[var15.field939]);
                            }
                            if (var53 != null) {
                                var53.method180(0, var15.field936, 0, var15.field935, 0, var49, var50);
                            }
                            class62.field1638 = var47;
                            class62.field1639 = var48;
                        } else {
                            if (var15.field894 == 7) {
                                class13 var55 = var15.field909;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field895; ++var57) {
                                    for (int var58 = 0; var58 < var15.field923; ++var58) {
                                        if (var15.field946[var56] > 0) {
                                            class19 var59 = class19.method254(var15.field946[var56] - 1);
                                            String var60 = var59.field882;
                                            if (var59.field889 || var15.field944[var56] != 1) {
                                                var60 = var60 + " x" + method23(-972, var15.field944[var56]);
                                            }
                                            int var61 = (var15.field921 + 115) * var58 + var16;
                                            int var62 = (var15.field892 + 12) * var57 + var17;
                                            if (var15.field920) {
                                                var55.method213(var15.field932, var15.field948, false, var15.field923 / 2 + var61, var62, var60);
                                            } else {
                                                var55.method220(var62, var60, false, var15.field948, var15.field932, var61);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field894 == 8 && (this.field251 == var15.field898 || this.field295 == var15.field898 || this.field436 == var15.field898) && this.field357 == 100) {
                                int var63 = 0;
                                int var64 = 0;
                                class13 var65 = this.field428;
                                String var66 = var15.field900;
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
                                    int var75 = var65.method214(0, var74);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field760 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field923 + var16 - 5 - var63;
                                int var68 = var15.field895 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg3.field923 + arg2) {
                                    var67 = arg3.field923 + arg2 - var63;
                                }
                                class36.method393(var67, 16777120, var64, var68, 0, var63);
                                class36.method394(0, (byte) 52, var68, var63, var64, var67);
                                String var69 = var15.field900;
                                int var70 = var65.field760 + var68 + 2;
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
                                    var65.method220(var70, var72, false, false, 0, var67 + 3);
                                    var70 += var65.field760 + 1;
                                }
                            }
                        }
                    }
                }
                class36.method390(var7, var10, (byte) 98, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method14(byte arg0, boolean arg1) {
        if (field446.field1601 >> 7 == this.field209 && field446.field1602 >> 7 == this.field210) {
            this.field209 = 0;
        }
        int var3 = this.field392;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class17 var5;
            int var6;
            if (arg1) {
                var5 = field446;
                var6 = this.field390 << 14;
            } else {
                var5 = this.field391[this.field393[var4]];
                var6 = this.field393[var4] << 14;
            }
            if (var5 != null && var5.method250(29)) {
                var5.field808 = false;
                if ((field467 && this.field392 > 50 || this.field392 > 200) && !arg1 && var5.field1599 == var5.field1550) {
                    var5.field808 = true;
                }
                int var7 = var5.field1601 >> 7;
                int var8 = var5.field1602 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field825 != null && field505 >= var5.field813 && field505 < var5.field814) {
                        var5.field808 = false;
                        var5.field821 = this.method52(this.field97, var5.field1602, -430, var5.field1601);
                        this.field130.method461(var5.field1602, var5.field832, var5.field1601, var5.field1603, var5.field821, var6, 60, -540, var5.field833, var5, var5.field834, var5.field831, this.field97);
                    } else {
                        if ((var5.field1601 & 127) == 64 && (var5.field1602 & 127) == 64) {
                            if (this.field437[var7][var8] == this.field272) {
                                continue;
                            }
                            this.field437[var7][var8] = this.field272;
                        }
                        var5.field821 = this.method52(this.field97, var5.field1602, -430, var5.field1601);
                        this.field130.method460(var5.field1601, 60, (byte) -103, var5, this.field97, var5.field1603, var6, var5.field1602, var5.field821, var5.field1580);
                    }
                }
            }
        }
        if (arg0 != 72) {
            this.field258 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNHEPCMLW;IB)V")
    private final void method15(class35 arg0, int arg1, byte arg2) {
        arg0.method359(false);
        int var4 = arg0.method360(168, 1);
        if (var4 != 0) {
            int var5 = arg0.method360(168, 2);
            if (arg2 != 89) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            if (var5 == 0) {
                this.field395[this.field394++] = this.field390;
            } else if (var5 == 1) {
                int var7 = arg0.method360(168, 3);
                field446.method548(0, false, var7);
                int var8 = arg0.method360(168, 1);
                if (var8 == 1) {
                    this.field395[this.field394++] = this.field390;
                }
            } else if (var5 == 2) {
                int var9 = arg0.method360(168, 3);
                field446.method548(0, true, var9);
                int var10 = arg0.method360(168, 3);
                field446.method548(0, true, var10);
                int var11 = arg0.method360(168, 1);
                if (var11 == 1) {
                    this.field395[this.field394++] = this.field390;
                }
            } else if (var5 == 3) {
                int var12 = arg0.method360(168, 7);
                this.field97 = arg0.method360(168, 2);
                int var13 = arg0.method360(168, 1);
                int var14 = arg0.method360(168, 1);
                if (var14 == 1) {
                    this.field395[this.field394++] = this.field390;
                }
                int var15 = arg0.method360(168, 7);
                field446.method547((byte) 9, var12, var15, var13 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILZWUMKFUX;)V")
    public final void method16(int arg0, int arg1, int arg2, class72 arg3) {
        if (this.field149 == arg2) {
            int var5 = arg0 * arg0 + arg1 * arg1;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field325 + this.field308 & 2047;
                int var7 = class4.field632[var6];
                int var8 = class4.field633[var6];
                int var9 = var7 * 256 / (this.field301 + 256);
                int var10 = var8 * 256 / (this.field301 + 256);
                int var11 = arg0 * var9 + arg1 * var10 >> 16;
                int var12 = arg0 * var10 - arg1 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field329.method599(20, 15, var13, var15 + 94 + 4 - 10, 256, 15, this.field39, 20, 83 - var16 - 20);
            } else {
                this.method131(arg0, arg1, (byte) 4, arg3);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILYCAXTCCQ;)V")
    private final void method17(int arg0, class61 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field1622 == 0) {
            var3 = this.field130.method475(arg1.field1621, arg1.field1623, arg1.field1624);
        }
        if (arg1.field1622 == 1) {
            var3 = this.field130.method476(arg1.field1624, arg1.field1621, arg1.field1623, -223);
        }
        if (arg1.field1622 == 2) {
            var3 = this.field130.method477(arg1.field1621, arg1.field1623, arg1.field1624);
        }
        if (arg1.field1622 == 3) {
            var3 = this.field130.method478(arg1.field1621, arg1.field1623, arg1.field1624);
        }
        if (var3 != 0) {
            int var7 = this.field130.method479(arg1.field1621, arg1.field1623, arg1.field1624, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field1618 = var4;
        arg1.field1620 = var5;
        int var8 = 39 / arg0;
        arg1.field1619 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method18(String arg0) {
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

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method19(int arg0) {
        signlink.midiplay = false;
        this.field139 += arg0;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    private final void method20(boolean arg0) {
        class61 var2 = (class61) this.field402.method414();
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field1626 == -1) {
                var2.field1625 = 0;
                this.method17(343, var2);
            } else {
                var2.method336();
            }
            var2 = (class61) this.field402.method416(this.field406);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLNHEPCMLW;)V")
    private final void method21(int arg0, boolean arg1, class35 arg2) {
        if (!arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field394; ++var5) {
            int var6 = this.field395[var5];
            class17 var7 = this.field391[var6];
            int var8 = arg2.method349();
            if ((var8 & 8) != 0) {
                var8 += arg2.method349() << 8;
            }
            this.method113(var6, 952, var8, var7, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field219) {
            this.method76(7);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method23(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            if (var2.length() > 8) {
                var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
            } else if (var2.length() > 4) {
                var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
            }
            return " " + var2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method24(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field460 >= 100) {
                this.method106("", 0, "Your ignore list is full. Max of 100 hit", 0);
            } else {
                String var4 = class51.method508(class51.method505(4, arg1), 0);
                for (int var5 = 0; var5 < this.field460; ++var5) {
                    if (this.field41[var5] == arg1) {
                        this.method106("", 0, var4 + " is already on your ignore list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field489; ++var6) {
                    if (this.field93[var6] == arg1) {
                        this.method106("", 0, "Please remove " + var4 + " from your friend list first", 0);
                        return;
                    }
                }
                this.field41[this.field460++] = arg1;
                this.field135 = true;
                this.field365.method338(39, 10041);
                if (arg0 == 8) {
                    boolean var7 = false;
                } else {
                    for (int var8 = 1; var8 > 0; ++var8) {
                    }
                }
                this.field365.method345(arg1, (byte) 7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method25(byte arg0) {
        try {
            this.field38 = -1;
            this.field332.method418();
            this.field519.method418();
            ++field421;
            if (field421 > 1662) {
                field421 = 0;
                this.field365.method338(251, 10041);
                this.field365.method339(0);
                int var2 = this.field365.field1107;
                this.field365.method340(35357);
                this.field365.method340(44205);
                this.field365.method340((int) (Math.random() * 65536.0D));
                this.field365.method339(195);
                this.field365.method339(135);
                this.field365.method340(22200);
                this.field365.method340((int) (Math.random() * 65536.0D));
                this.field365.method340(10016);
                this.field365.method340((int) (Math.random() * 65536.0D));
                this.field365.method339(206);
                this.field365.method348(6, this.field365.field1107 - var2);
            }
            class62.method559(-32);
            this.method45(false);
            this.field130.method449(true);
            System.gc();
            for (int var3 = 0; var3 < 4; ++var3) {
                this.field221[var3].method188();
            }
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; var6 < 104; ++var6) {
                        this.field343[var4][var5][var6] = 0;
                    }
                }
            }
            class14 var7 = new class14(5, 104, this.field106, 104, this.field343);
            int var8 = this.field439.length;
            this.field365.method338(37, 10041);
            if (!this.field176) {
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = (this.field260[var9] >> 8) * 64 - this.field290;
                    int var11 = (this.field260[var9] & 255) * 64 - this.field291;
                    byte[] var12 = this.field439[var9];
                    if (var12 != null) {
                        var7.method228((this.field34 - 6) * 8, (byte) 110, var10, (this.field33 - 6) * 8, var11, this.field221, var12);
                    }
                }
                for (int var13 = 0; var13 < var8; ++var13) {
                    int var14 = (this.field260[var13] >> 8) * 64 - this.field290;
                    int var15 = (this.field260[var13] & 255) * 64 - this.field291;
                    byte[] var16 = this.field439[var13];
                    if (var16 == null && this.field34 < 800) {
                        var7.method230(64, true, var14, 64, var15);
                    }
                }
                this.field365.method338(37, 10041);
                for (int var17 = 0; var17 < var8; ++var17) {
                    byte[] var18 = this.field305[var17];
                    if (var18 != null) {
                        int var19 = (this.field260[var17] >> 8) * 64 - this.field290;
                        int var20 = (this.field260[var17] & 255) * 64 - this.field291;
                        var7.method242(this.field221, var19, var18, -79, var20, this.field130);
                    }
                }
            }
            if (this.field176) {
                int var21 = 0;
                label256: while (true) {
                    if (var21 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field472[0][var31][var32];
                                if (var33 == -1) {
                                    var7.method230(8, true, var31 * 8, 8, var32 * 8);
                                }
                            }
                        }
                        this.field365.method338(37, 10041);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label256;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field472[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field260.length; ++var43) {
                                            if (this.field260[var43] == var42 && this.field305[var43] != null) {
                                                var7.method245((var41 & 7) * 8, this.field130, var38, this.field305[var43], var39, (var40 & 7) * 8, var35 * 8, var36 * 8, this.field221, var34, this.field241);
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
                            int var24 = this.field472[var21][var22][var23];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field260.length; ++var30) {
                                    if (this.field260[var30] == var29 && this.field439[var30] != null) {
                                        var7.method229((var27 & 7) * 8, var23 * 8, this.field439[var30], this.field221, var22 * 8, var25, false, var21, (var28 & 7) * 8, var26);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var21;
                }
            }
            this.field365.method338(37, 10041);
            var7.method247(false, this.field221, this.field130);
            if (this.field189 != null) {
                this.field189.method535((byte) 6);
                class62.field1644 = this.field55;
            }
            this.field365.method338(37, 10041);
            int var44 = class14.field792;
            if (var44 > this.field97) {
                var44 = this.field97;
            }
            if (var44 < this.field97 - 1) {
                int var45 = this.field97 - 1;
            }
            if (field467) {
                this.field130.method450(class14.field792, false);
            } else {
                this.field130.method450(0, false);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method120(var46, var47);
                }
            }
            this.method20(false);
        } catch (Exception var60) {
        }
        class37.field1175.method588();
        if (super.field537 != null) {
            this.field365.method338(225, 10041);
            this.field365.method343(1057001181);
        }
        if (field467 && signlink.cache_dat != null) {
            int var49 = this.field40.method533(-559, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field40.method524(var50, 9);
                if ((var51 & 121) == 0) {
                    class4.method159((byte) 2, var50);
                }
            }
        }
        System.gc();
        class62.method560((byte) 0, 20);
        this.field40.method527(true);
        int var52 = (this.field33 - 6) / 8 - 1;
        int var53 = (this.field33 + 6) / 8 + 1;
        int var54 = (this.field34 - 6) / 8 - 1;
        int var55 = (this.field34 + 6) / 8 + 1;
        if (arg0 != 42) {
            field57 = this.field353.method278();
        }
        if (this.field404) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field40.method520(var56, var57, 0, -632);
                    if (var58 != -1) {
                        this.field40.method523((byte) 28, var58, 3);
                    }
                    int var59 = this.field40.method520(var56, var57, 1, -632);
                    if (var59 != -1) {
                        this.field40.method523((byte) 28, var59, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= 0) {
            this.field264 = !this.field264;
        }
        if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
            if (field467 && this.field97 != arg0) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg6 == 0) {
                var9 = this.field130.method475(arg0, arg2, arg5);
            }
            if (arg6 == 1) {
                var9 = this.field130.method476(arg5, arg0, arg2, -223);
            }
            if (arg6 == 2) {
                var9 = this.field130.method477(arg0, arg2, arg5);
            }
            if (arg6 == 3) {
                var9 = this.field130.method478(arg0, arg2, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field130.method479(arg0, arg2, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg6 == 0) {
                    this.field130.method466(arg5, arg0, 991, arg2);
                    class37 var17 = class37.method400(var14);
                    if (var17.field1151) {
                        this.field221[arg0].method193(true, var17.field1182, var16, arg2, var15, arg5);
                    }
                }
                if (arg6 == 1) {
                    this.field130.method467(arg5, arg2, this.field359, arg0);
                }
                if (arg6 == 2) {
                    this.field130.method468(arg2, arg5, (byte) 5, arg0);
                    class37 var18 = class37.method400(var14);
                    if (var18.field1135 + arg2 > 103 || var18.field1135 + arg5 > 103 || var18.field1168 + arg2 > 103 || var18.field1168 + arg5 > 103) {
                        return;
                    }
                    if (var18.field1151) {
                        this.field221[arg0].method194(var16, arg2, var18.field1135, var18.field1182, var18.field1168, 0, arg5);
                    }
                }
                if (arg6 == 3) {
                    this.field130.method469(arg2, true, arg0, arg5);
                    class37 var19 = class37.method400(var14);
                    if (var19.field1151 && var19.field1163) {
                        this.field221[arg0].method196((byte) 9, arg5, arg2);
                    }
                }
            }
            if (arg3 >= 0) {
                int var20 = arg0;
                if (arg0 < 3 && (this.field343[1][arg2][arg5] & 2) == 2) {
                    var20 = arg0 + 1;
                }
                class14.method244(arg0, this.field106, arg3, arg5, arg4, var20, this.field130, arg7, this.field221[arg0], -714, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method27(byte arg0) {
        if (this.field222 != arg0) {
            this.field136 = -425;
        }
        for (class44 var2 = (class44) this.field519.method414(); var2 != null; var2 = (class44) this.field519.method416(this.field406)) {
            if (this.field97 == var2.field1276 && field505 <= var2.field1271) {
                if (field505 >= var2.field1270) {
                    if (var2.field1264 > 0) {
                        class67 var3 = this.field340[var2.field1264 - 1];
                        if (var3 != null && var3.field1601 >= 0 && var3.field1601 < 13312 && var3.field1602 >= 0 && var3.field1602 < 13312) {
                            var2.method429(this.method52(var2.field1276, var3.field1602, -430, var3.field1601) - var2.field1275, (byte) 6, var3.field1601, var3.field1602, field505);
                        }
                    }
                    if (var2.field1264 < 0) {
                        int var4 = -var2.field1264 - 1;
                        class17 var5;
                        if (this.field470 == var4) {
                            var5 = field446;
                        } else {
                            var5 = this.field391[var4];
                        }
                        if (var5 != null && var5.field1601 >= 0 && var5.field1601 < 13312 && var5.field1602 >= 0 && var5.field1602 < 13312) {
                            var2.method429(this.method52(var2.field1276, var5.field1602, -430, var5.field1601) - var2.field1275, (byte) 6, var5.field1601, var5.field1602, field505);
                        }
                    }
                    var2.method430(this.field281, 3);
                    this.field130.method460((int) var2.field1286, 60, (byte) -103, var2, this.field97, var2.field1277, -1, (int) var2.field1287, (int) var2.field1288, false);
                }
            } else {
                var2.method336();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Z")
    public final boolean method28(int arg0, byte arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field237[arg0];
            if (arg1 != -19) {
                this.field140 = -1;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 918;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLHZINZKXF;)Z")
    public final boolean method29(boolean arg0, class20 arg1) {
        this.field410 &= arg0;
        int var3 = arg1.field961;
        if (this.field490 == 2) {
            if (var3 == 201) {
                this.field265 = true;
                this.field191 = 0;
                this.field356 = true;
                this.field463 = "";
                this.field317 = 1;
                this.field202 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field265 = true;
                this.field191 = 0;
                this.field356 = true;
                this.field463 = "";
                this.field317 = 2;
                this.field202 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field143 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field265 = true;
                this.field191 = 0;
                this.field356 = true;
                this.field463 = "";
                this.field317 = 4;
                this.field202 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field265 = true;
                this.field191 = 0;
                this.field356 = true;
                this.field463 = "";
                this.field317 = 5;
                this.field202 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field344[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class46.field1338 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class46.field1338) {
                                var6 = 0;
                            }
                        }
                        if (!class46.field1339[var6].field1345 && class46.field1339[var6].field1340 == var4 + (this.field306 ? 0 : 7)) {
                            this.field344[var4] = var6;
                            this.field63 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field242[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field175[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field175[var7].length) {
                        var9 = 0;
                    }
                }
                this.field242[var7] = var9;
                this.field63 = true;
            }
            if (var3 == 324 && !this.field306) {
                this.field306 = true;
                this.method122(false);
            }
            if (var3 == 325 && this.field306) {
                this.field306 = false;
                this.method122(false);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field303 = !this.field303;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method110(true);
                    if (this.field266.length() > 0) {
                        this.field365.method338(96, 10041);
                        this.field365.method345(class51.method504(this.field266), (byte) 7);
                        this.field365.method339(var3 - 601);
                        this.field365.method339(this.field303 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field365.method338(104, 10041);
                this.field365.method339(this.field306 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field365.method339(this.field344[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field365.method339(this.field242[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLRZWMPYWU;)V")
    public final void method30(byte arg0, class47 arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field140 = -1;
        }
        short var4 = 256;
        for (int var5 = 0; var5 < this.field239.length; ++var5) {
            this.field239[var5] = 0;
        }
        for (int var6 = 0; var6 < 5000; ++var6) {
            int var18 = (int) (Math.random() * 128.0D * (double) var4);
            this.field239[var18] = (int) (Math.random() * 256.0D);
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var4 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field240[var17] = (this.field239[var17 - 1] + this.field239[var17 + 1] + this.field239[var17 - 128] + this.field239[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field239;
            this.field239 = this.field240;
            this.field240 = var15;
        }
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field1351; ++var9) {
                for (int var10 = 0; var10 < arg1.field1350; ++var10) {
                    if (arg1.field1348[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field1352;
                        int var12 = var9 + 16 + arg1.field1353;
                        int var13 = (var12 << 7) + var11;
                        this.field239[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method31(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field146 != null) {
                this.field146.method578();
            }
        } catch (Exception var2) {
        }
        this.field146 = null;
        this.method19(0);
        if (this.field74 != null) {
            this.field74.field1061 = false;
        }
        this.field74 = null;
        this.field40.method530();
        this.field40 = null;
        this.field339 = null;
        this.field365 = null;
        this.field257 = null;
        this.field423 = null;
        this.field260 = null;
        this.field439 = null;
        this.field305 = null;
        this.field261 = null;
        this.field262 = null;
        this.field106 = null;
        this.field343 = null;
        this.field130 = null;
        this.field221 = null;
        this.field36 = null;
        this.field438 = null;
        this.field297 = null;
        this.field298 = null;
        this.field218 = null;
        this.field187 = null;
        this.field188 = null;
        if (arg0 != -21214) {
            this.field365.method339(223);
        }
        this.field189 = null;
        this.field190 = null;
        this.field369 = null;
        this.field370 = null;
        this.field371 = null;
        this.field506 = null;
        this.field507 = null;
        this.field508 = null;
        this.field509 = null;
        this.field510 = null;
        this.field511 = null;
        this.field512 = null;
        this.field513 = null;
        this.field514 = null;
        this.field386 = null;
        this.field387 = null;
        this.field388 = null;
        this.field335 = null;
        this.field336 = null;
        this.field337 = null;
        this.field42 = null;
        this.field414 = null;
        this.field415 = null;
        this.field416 = null;
        this.field417 = null;
        this.field418 = null;
        this.field204 = null;
        this.field205 = null;
        this.field206 = null;
        this.field207 = null;
        this.field208 = null;
        this.field461 = null;
        this.field495 = null;
        this.field307 = null;
        this.field113 = null;
        this.field398 = null;
        this.field516 = null;
        this.field37 = null;
        this.field499 = null;
        this.field500 = null;
        this.field501 = null;
        this.field502 = null;
        this.field503 = null;
        this.field517 = null;
        this.field334 = null;
        this.field437 = null;
        this.field391 = null;
        this.field393 = null;
        this.field395 = null;
        this.field396 = null;
        this.field102 = null;
        this.field340 = null;
        this.field342 = null;
        this.field258 = null;
        this.field402 = null;
        this.field519 = null;
        this.field332 = null;
        this.field235 = null;
        this.field236 = null;
        this.field237 = null;
        this.field238 = null;
        this.field166 = null;
        this.field134 = null;
        this.field474 = null;
        this.field475 = null;
        this.field64 = null;
        this.field211 = null;
        this.field109 = null;
        this.field93 = null;
        this.field253 = null;
        this.field160 = null;
        this.field161 = null;
        this.field157 = null;
        this.field158 = null;
        this.field159 = null;
        this.field162 = null;
        this.field163 = null;
        this.field164 = null;
        this.field165 = null;
        this.method78(-409);
        class37.method403(false);
        class12.method209(false);
        class19.method265(false);
        class20.method271(false);
        class52.field1463 = null;
        class46.field1339 = null;
        class15.field796 = null;
        class42.field1219 = null;
        class11.field698 = null;
        class11.field710 = null;
        class32.field1065 = null;
        super.field535 = null;
        class17.field812 = null;
        class62.method556(false);
        class49.method448(false);
        class4.method156(false);
        class25.method283(false);
        System.gc();
        if (class34.field1089) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method32(int arg0, int arg1, String arg2) {
        this.field35 = arg1;
        this.field374 = arg2;
        this.method81(6);
        if (this.field288 == null) {
            super.method32(3, arg1, arg2);
        } else {
            this.field159.method535((byte) 6);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            if (arg0 != 3) {
                this.field258 = null;
            }
            this.field429.method212(16777215, var4 / 2, "RuneScape is loading - please wait...", (byte) 6, var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            class36.method394(9179409, (byte) 52, var7, 304, 34, var4 / 2 - 152);
            class36.method394(0, (byte) 52, var7 + 1, 302, 32, var4 / 2 - 151);
            class36.method393(var4 / 2 - 150, 9179409, 30, var7 + 2, 0, arg1 * 3);
            class36.method393(arg1 * 3 + (var4 / 2 - 150), 0, 30, var7 + 2, 0, 300 - arg1 * 3);
            this.field429.method212(16777215, var4 / 2, arg2, (byte) 6, var5 / 2 + 5 - var6);
            this.field159.method536(202, 5, 171, super.field534);
            if (this.field256) {
                this.field256 = false;
                if (!this.field424) {
                    this.field160.method536(0, 5, 0, super.field534);
                    this.field161.method536(637, 5, 0, super.field534);
                }
                this.field157.method536(128, 5, 0, super.field534);
                this.field158.method536(202, 5, 371, super.field534);
                this.field162.method536(0, 5, 265, super.field534);
                this.field163.method536(562, 5, 265, super.field534);
                this.field164.method536(128, 5, 171, super.field534);
                this.field165.method536(562, 5, 171, super.field534);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method33(int arg0) {
        if (arg0 == 9) {
            this.field256 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIIII)V")
    public final void method34(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field49.method442(arg2, arg3, (byte) 8);
        this.field50.method442(arg2, arg3 + arg5 - 16, (byte) 8);
        class36.method393(arg2, this.field120, arg5 - 32, arg3 + 16, 0, 16);
        int var7 = (arg5 - 32) * arg5 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg4 / (arg1 - arg5);
        class36.method393(arg2, this.field110, var7, arg3 + 16 + var8, 0, 16);
        class36.method398(this.field131, arg3 + 16 + var8, arg2, 834, var7);
        class36.method398(this.field131, arg3 + 16 + var8, arg2 + 1, 834, var7);
        class36.method396(arg3 + 16 + var8, this.field131, arg2, 0, 16);
        class36.method396(arg3 + 17 + var8, this.field131, arg2, 0, 16);
        if (arg0 != 85) {
            this.field140 = this.field423.method349();
        }
        class36.method398(this.field144, arg3 + 16 + var8, arg2 + 15, 834, var7);
        class36.method398(this.field144, arg3 + 17 + var8, arg2 + 14, 834, var7 - 1);
        class36.method396(arg3 + 15 + var8 + var7, this.field144, arg2, 0, 16);
        class36.method396(arg3 + 14 + var8 + var7, this.field144, arg2 + 1, 0, 15);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method35(int arg0) {
        if (this.field480 == 0 && this.field171 == 0) {
            this.field166[this.field521] = "Walk here";
            this.field237[this.field521] = 872;
            this.field235[this.field521] = super.field542;
            this.field236[this.field521] = super.field543;
            ++this.field521;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class4.field630; ++var3) {
            int var5 = class4.field631[var3];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field130.method479(this.field97, var6, var7, var5) >= 0) {
                    class37 var10 = class37.method400(var9);
                    if (var10.field1156 != null) {
                        var10 = var10.method410((byte) 41);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field480 == 1) {
                        this.field166[this.field521] = "Use " + this.field484 + " with @cya@" + var10.field1171;
                        this.field237[this.field521] = 677;
                        this.field238[this.field521] = var5;
                        this.field235[this.field521] = var6;
                        this.field236[this.field521] = var7;
                        ++this.field521;
                    } else if (this.field171 == 1) {
                        if ((this.field173 & 4) == 4) {
                            this.field166[this.field521] = this.field174 + " @cya@" + var10.field1171;
                            this.field237[this.field521] = 45;
                            this.field238[this.field521] = var5;
                            this.field235[this.field521] = var6;
                            this.field236[this.field521] = var7;
                            ++this.field521;
                        }
                    } else {
                        if (var10.field1141 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1141[var11] != null) {
                                    this.field166[this.field521] = var10.field1141[var11] + " @cya@" + var10.field1171;
                                    if (var11 == 0) {
                                        this.field237[this.field521] = 673;
                                    }
                                    if (var11 == 1) {
                                        this.field237[this.field521] = 795;
                                    }
                                    if (var11 == 2) {
                                        this.field237[this.field521] = 652;
                                    }
                                    if (var11 == 3) {
                                        this.field237[this.field521] = 307;
                                    }
                                    if (var11 == 4) {
                                        this.field237[this.field521] = 1238;
                                    }
                                    this.field238[this.field521] = var5;
                                    this.field235[this.field521] = var6;
                                    this.field236[this.field521] = var7;
                                    ++this.field521;
                                }
                            }
                        }
                        this.field166[this.field521] = "Examine @cya@" + var10.field1171;
                        this.field237[this.field521] = 1788;
                        this.field238[this.field521] = var10.field1145 << 14;
                        this.field235[this.field521] = var6;
                        this.field236[this.field521] = var7;
                        ++this.field521;
                    }
                }
                if (var8 == 1) {
                    class67 var12 = this.field340[var9];
                    if (var12.field1688.field736 == 1 && (var12.field1601 & 127) == 64 && (var12.field1602 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field341; ++var13) {
                            class67 var16 = this.field340[this.field342[var13]];
                            if (var16 != null && var12 != var16 && var16.field1688.field736 == 1 && var12.field1601 == var16.field1601 && var12.field1602 == var16.field1602) {
                                this.method111(this.field342[var13], var7, var16.field1688, var6, 8);
                            }
                        }
                        for (int var14 = 0; var14 < this.field392; ++var14) {
                            class17 var15 = this.field391[this.field393[var14]];
                            if (var15 != null && var12.field1601 == var15.field1601 && var12.field1602 == var15.field1602) {
                                this.method136(6, this.field393[var14], var7, var15, var6);
                            }
                        }
                    }
                    this.method111(var9, var7, var12.field1688, var6, 8);
                }
                if (var8 == 0) {
                    class17 var17 = this.field391[var9];
                    if ((var17.field1601 & 127) == 64 && (var17.field1602 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field341; ++var18) {
                            class67 var21 = this.field340[this.field342[var18]];
                            if (var21 != null && var21.field1688.field736 == 1 && var17.field1601 == var21.field1601 && var17.field1602 == var21.field1602) {
                                this.method111(this.field342[var18], var7, var21.field1688, var6, 8);
                            }
                        }
                        for (int var19 = 0; var19 < this.field392; ++var19) {
                            class17 var20 = this.field391[this.field393[var19]];
                            if (var20 != null && var17 != var20 && var17.field1601 == var20.field1601 && var17.field1602 == var20.field1602) {
                                this.method136(6, this.field393[var19], var7, var20, var6);
                            }
                        }
                    }
                    this.method136(6, var9, var7, var17, var6);
                }
                if (var8 == 3) {
                    class38 var22 = this.field258[this.field97][var6][var7];
                    if (var22 != null) {
                        for (class9 var23 = (class9) var22.method415(6); var23 != null; var23 = (class9) var22.method417(true)) {
                            class19 var24 = class19.method254(var23.field693);
                            if (this.field480 == 1) {
                                this.field166[this.field521] = "Use " + this.field484 + " with @lre@" + var24.field882;
                                this.field237[this.field521] = 800;
                                this.field238[this.field521] = var23.field693;
                                this.field235[this.field521] = var6;
                                this.field236[this.field521] = var7;
                                ++this.field521;
                            } else if (this.field171 == 1) {
                                if ((this.field173 & 1) == 1) {
                                    this.field166[this.field521] = this.field174 + " @lre@" + var24.field882;
                                    this.field237[this.field521] = 807;
                                    this.field238[this.field521] = var23.field693;
                                    this.field235[this.field521] = var6;
                                    this.field236[this.field521] = var7;
                                    ++this.field521;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field876 != null && var24.field876[var25] != null) {
                                        this.field166[this.field521] = var24.field876[var25] + " @lre@" + var24.field882;
                                        if (var25 == 0) {
                                            this.field237[this.field521] = 948;
                                        }
                                        if (var25 == 1) {
                                            this.field237[this.field521] = 816;
                                        }
                                        if (var25 == 2) {
                                            this.field237[this.field521] = 185;
                                        }
                                        if (var25 == 3) {
                                            this.field237[this.field521] = 405;
                                        }
                                        if (var25 == 4) {
                                            this.field237[this.field521] = 309;
                                        }
                                        this.field238[this.field521] = var23.field693;
                                        this.field235[this.field521] = var6;
                                        this.field236[this.field521] = var7;
                                        ++this.field521;
                                    } else if (var25 == 2) {
                                        this.field166[this.field521] = "Take @lre@" + var24.field882;
                                        this.field237[this.field521] = 185;
                                        this.field238[this.field521] = var23.field693;
                                        this.field235[this.field521] = var6;
                                        this.field236[this.field521] = var7;
                                        ++this.field521;
                                    }
                                }
                                this.field166[this.field521] = "Examine @lre@" + var24.field882;
                                this.field237[this.field521] = 1249;
                                this.field238[this.field521] = var23.field693;
                                this.field235[this.field521] = var6;
                                this.field236[this.field521] = var7;
                                ++this.field521;
                            }
                        }
                    }
                }
            }
        }
        int var4 = 28 / arg0;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method36(int arg0) {
        this.field139 += arg0;
        try {
            int var2 = field446.field1601 + this.field90;
            int var3 = field446.field1602 + this.field485;
            if (this.field345 - var2 < -500 || this.field345 - var2 > 500 || this.field346 - var3 < -500 || this.field346 - var3 > 500) {
                this.field345 = var2;
                this.field346 = var3;
            }
            if (this.field345 != var2) {
                this.field345 += (var2 - this.field345) / 16;
            }
            if (this.field346 != var3) {
                this.field346 += (var3 - this.field346) / 16;
            }
            if (super.field552[1] == 1) {
                this.field326 += (-24 - this.field326) / 2;
            } else if (super.field552[2] == 1) {
                this.field326 += (24 - this.field326) / 2;
            } else {
                this.field326 /= 2;
            }
            if (super.field552[3] == 1) {
                this.field327 += (12 - this.field327) / 2;
            } else if (super.field552[4] == 1) {
                this.field327 += (-12 - this.field327) / 2;
            } else {
                this.field327 /= 2;
            }
            this.field325 = this.field326 / 2 + this.field325 & 2047;
            this.field324 += this.field327 / 2;
            if (this.field324 < 128) {
                this.field324 = 128;
            }
            if (this.field324 > 383) {
                this.field324 = 383;
            }
            int var4 = this.field345 >> 7;
            int var5 = this.field346 >> 7;
            int var6 = this.method52(this.field97, this.field346, -430, this.field345);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field97;
                        if (var10 < 3 && (this.field343[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field106[var10][var8][var9];
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
            if (var12 > this.field151) {
                this.field151 += (var12 - this.field151) / 24;
            } else if (var12 < this.field151) {
                this.field151 += (var12 - this.field151) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field446.field1601 + "," + field446.field1602 + "," + this.field345 + "," + this.field346 + "," + this.field33 + "," + this.field34 + "," + this.field290 + "," + this.field291);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method37(byte arg0) {
        if (arg0 != 0) {
            this.field365.method339(25);
        }
        if (field467 && this.field273 == 2 && class14.field779 != this.field97) {
            this.method145(873, "Loading - please wait.", (String) null);
            this.field273 = 1;
            this.field194 = System.currentTimeMillis();
        }
        if (this.field273 == 1) {
            int var2 = this.method38(8);
            if (var2 != 0 && System.currentTimeMillis() - this.field194 > 360000L) {
                signlink.reporterror(this.field137 + " glcfb " + this.field153 + "," + var2 + "," + field467 + "," + this.field99[0] + "," + this.field40.method529() + "," + this.field97 + "," + this.field33 + "," + this.field34);
                this.field194 = System.currentTimeMillis();
            }
        }
        if (this.field273 == 2 && this.field97 != this.field38) {
            this.field38 = this.field97;
            this.method148(-556, this.field97);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)I")
    public final int method38(int arg0) {
        if (arg0 != 8) {
            this.field140 = -1;
        }
        for (int var2 = 0; var2 < this.field439.length; ++var2) {
            if (this.field439[var2] == null && this.field261[var2] != -1) {
                return -1;
            }
            if (this.field305[var2] == null && this.field262[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field439.length; ++var4) {
            byte[] var5 = this.field305[var4];
            if (var5 != null) {
                int var6 = (this.field260[var4] >> 8) * 64 - this.field290;
                int var7 = (this.field260[var4] & 255) * 64 - this.field291;
                if (this.field176) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class14.method233(var7, var6, var5, 0);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field289) {
            return -4;
        } else {
            this.field273 = 2;
            class14.field779 = this.field97;
            this.method25((byte) 42);
            this.field365.method338(223, 10041);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method39(int arg0) {
        for (int var2 = -1; var2 < this.field392; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field390;
            } else {
                var4 = this.field393[var2];
            }
            class17 var5 = this.field391[var4];
            if (var5 != null) {
                this.method63(1, var5, this.field145);
            }
        }
        ++field355;
        if (arg0 <= 0) {
            this.field140 = this.field423.method349();
        }
        if (field355 > 1283) {
            field355 = 0;
            this.field365.method338(91, 10041);
            this.field365.method339(0);
            int var3 = this.field365.field1107;
            this.field365.method340((int) (Math.random() * 65536.0D));
            this.field365.method339(50);
            this.field365.method340((int) (Math.random() * 65536.0D));
            this.field365.method339((int) (Math.random() * 256.0D));
            this.field365.method340((int) (Math.random() * 65536.0D));
            this.field365.method339(101);
            this.field365.method339(204);
            this.field365.method340((int) (Math.random() * 65536.0D));
            this.field365.method339((int) (Math.random() * 256.0D));
            this.field365.method340(26268);
            this.field365.method348(6, this.field365.field1107 - var3);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method40(int arg0) {
        if (super.field535 == null) {
            this.method78(-409);
            if (arg0 != 7182) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field157 = null;
            this.field158 = null;
            this.field159 = null;
            this.field160 = null;
            this.field161 = null;
            this.field162 = null;
            this.field163 = null;
            this.field164 = null;
            this.field165 = null;
            this.field190 = null;
            this.field188 = null;
            this.field187 = null;
            this.field189 = null;
            this.field369 = null;
            this.field370 = null;
            this.field371 = null;
            super.field535 = new class56(503, 5, 765, this.method92(true));
            this.field256 = true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public static final void method41(int arg0) {
        class49.field1390 = true;
        class62.field1633 = true;
        field467 = true;
        class14.field766 = true;
        if (arg0 != -39415) {
            field375 = !field375;
        }
        class37.field1150 = true;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method42(int arg0) {
        if (arg0 != 4) {
            this.field264 = !this.field264;
        }
        for (int var2 = -1; var2 < this.field392; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field390;
            } else {
                var6 = this.field393[var2];
            }
            class17 var7 = this.field391[var6];
            if (var7 != null && var7.field1558 > 0) {
                --var7.field1558;
                if (var7.field1558 == 0) {
                    var7.field1565 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field341; ++var3) {
            int var4 = this.field342[var3];
            class67 var5 = this.field340[var4];
            if (var5 != null && var5.field1558 > 0) {
                --var5.field1558;
                if (var5.field1558 == 0) {
                    var5.field1565 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 != 10361) {
            this.field365.method339(95);
        }
        if (this.field310 != 0) {
            int var2 = 0;
            if (this.field376 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field48[var3] != null) {
                    int var4 = this.field46[var3];
                    String var5 = this.field47[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field196 == 0 || this.field196 == 1 && this.method114(-154, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field542 > 4 && super.field543 - 4 > var9 - 10 && super.field543 - 4 <= var9 + 3) {
                            int var10 = this.field428.method214(0, "From:  " + var5 + this.field48[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field542 < var10 + 4) {
                                if (this.field95 >= 1) {
                                    this.field166[this.field521] = "Report abuse @whi@" + var5;
                                    this.field237[this.field521] = 2345;
                                    ++this.field521;
                                }
                                this.field166[this.field521] = "Add ignore @whi@" + var5;
                                this.field237[this.field521] = 2648;
                                ++this.field521;
                                this.field166[this.field521] = "Add friend @whi@" + var5;
                                this.field237[this.field521] = 2918;
                                ++this.field521;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field196 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 81 / arg3;
        int var8 = this.field130.method475(arg4, arg5, arg0);
        if (var8 != 0) {
            int var9 = this.field130.method479(arg4, arg5, arg0, var8);
            int var10 = var9 >> 6 & 3;
            int var11 = var9 & 31;
            int var12 = arg2;
            if (var8 > 0) {
                var12 = arg1;
            }
            int[] var13 = this.field211.field1724;
            int var14 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
            int var15 = var8 >> 14 & 32767;
            class37 var16 = class37.method400(var15);
            if (var16.field1170 != -1) {
                class47 var17 = this.field517[var16.field1170];
                if (var17 != null) {
                    int var18 = (var16.field1135 * 4 - var17.field1350) / 2;
                    int var19 = (var16.field1168 * 4 - var17.field1351) / 2;
                    var17.method442(arg5 * 4 + 48 + var18, (104 - arg0 - var16.field1168) * 4 + 48 + var19, (byte) 8);
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
        int var20 = this.field130.method477(arg4, arg5, arg0);
        if (var20 != 0) {
            int var21 = this.field130.method479(arg4, arg5, arg0, var20);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var20 >> 14 & 32767;
            class37 var25 = class37.method400(var24);
            if (var25.field1170 != -1) {
                class47 var26 = this.field517[var25.field1170];
                if (var26 != null) {
                    int var27 = (var25.field1135 * 4 - var26.field1350) / 2;
                    int var28 = (var25.field1168 * 4 - var26.field1351) / 2;
                    var26.method442(arg5 * 4 + 48 + var27, (104 - arg0 - var25.field1168) * 4 + 48 + var28, (byte) 8);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var20 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field211.field1724;
                int var31 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
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
        int var32 = this.field130.method478(arg4, arg5, arg0);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            class37 var34 = class37.method400(var33);
            if (var34.field1170 != -1) {
                class47 var35 = this.field517[var34.field1170];
                if (var35 != null) {
                    int var36 = (var34.field1135 * 4 - var35.field1350) / 2;
                    int var37 = (var34.field1168 * 4 - var35.field1351) / 2;
                    var35.method442(arg5 * 4 + 48 + var36, (104 - arg0 - var34.field1168) * 4 + 48 + var37, (byte) 8);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method45(boolean arg0) {
        class37.field1175.method588();
        class37.field1179.method588();
        class12.field712.method588();
        class19.field845.method588();
        class19.field866.method588();
        class17.field812.method588();
        if (!arg0) {
            class11.field710.method588();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (!this.field354 && !this.field234 && !this.field192) {
            ++field505;
            if (arg0) {
                this.field258 = null;
            }
            if (!this.field410) {
                this.method70(true);
            } else {
                this.method88(true);
            }
            this.method147((byte) 92);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)I")
    public final int method47(boolean arg0) {
        int var2 = 3;
        if (!arg0) {
            this.field140 = -1;
        }
        if (this.field69 < 310) {
            int var3 = this.field66 >> 7;
            int var4 = this.field68 >> 7;
            int var5 = field446.field1601 >> 7;
            int var6 = field446.field1602 >> 7;
            if ((this.field343[this.field97][var3][var4] & 4) != 0) {
                var2 = this.field97;
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
                    if ((this.field343[this.field97][var3][var4] & 4) != 0) {
                        var2 = this.field97;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field343[this.field97][var3][var4] & 4) != 0) {
                            var2 = this.field97;
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
                    if ((this.field343[this.field97][var3][var4] & 4) != 0) {
                        var2 = this.field97;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field343[this.field97][var3][var4] & 4) != 0) {
                            var2 = this.field97;
                        }
                    }
                }
            }
        }
        if ((this.field343[this.field97][field446.field1601 >> 7][field446.field1602 >> 7] & 4) != 0) {
            var2 = this.field97;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)I")
    public final int method48(boolean arg0) {
        this.field410 &= arg0;
        int var2 = this.method52(this.field97, this.field68, -430, this.field66);
        return var2 - this.field67 < 800 && (this.field343[this.field97][this.field66 >> 7][this.field68 >> 7] & 4) != 0 ? this.field97 : 3;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method49(int arg0) {
        if (!this.field354 && !this.field234 && !this.field192) {
            ++field244;
            if (!this.field410) {
                this.method71(true, false);
            } else {
                this.method69(40439);
            }
            this.field98 = 0;
            this.field139 += arg0;
        } else {
            this.method101(0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method50(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field489; ++var4) {
                if (this.field93[var4] == arg1) {
                    --this.field489;
                    this.field135 = true;
                    for (int var5 = var4; var5 < this.field489; ++var5) {
                        this.field109[var5] = this.field109[var5 + 1];
                        this.field253[var5] = this.field253[var5 + 1];
                        this.field93[var5] = this.field93[var5 + 1];
                    }
                    this.field365.method338(202, 10041);
                    this.field365.method345(arg1, (byte) 7);
                    break;
                }
            }
            if (arg0 != -33590) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method51(int arg0, boolean arg1, int arg2) {
        signlink.midivol = arg0;
        while (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method52(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 0) {
            return 2;
        } else {
            int var5 = arg3 >> 7;
            int var6 = arg1 >> 7;
            if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
                int var7 = arg0;
                if (arg0 < 3 && (this.field343[1][var5][var6] & 2) == 2) {
                    var7 = arg0 + 1;
                }
                int var8 = arg3 & 127;
                int var9 = arg1 & 127;
                int var10 = (128 - var8) * this.field106[var7][var5][var6] + this.field106[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field106[var7][var5][var6 + 1] + this.field106[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method53(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field341; ++var3) {
            class67 var4 = this.field340[this.field342[var3]];
            int var5 = (this.field342[var3] << 14) + 536870912;
            if (var4 != null && var4.method250(29) && var4.field1688.field715 == arg0 && var4.field1688.method208(true)) {
                int var6 = var4.field1601 >> 7;
                int var7 = var4.field1602 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1571 == 1 && (var4.field1601 & 127) == 64 && (var4.field1602 & 127) == 64) {
                        if (this.field437[var6][var7] == this.field272) {
                            continue;
                        }
                        this.field437[var6][var7] = this.field272;
                    }
                    if (!var4.field1688.field744) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field130.method460(var4.field1601, (var4.field1571 - 1) * 64 + 60, (byte) -103, var4, this.field97, var4.field1603, var5, var4.field1602, this.method52(this.field97, var4.field1602, -430, var4.field1601), var4.field1580);
                }
            }
        }
        if (arg1 != -19874) {
            this.field44 = this.field353.method278();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILNHEPCMLW;I)V")
    private final void method54(int arg0, class35 arg1, int arg2) {
        arg1.method359(false);
        int var4 = 84 / arg0;
        int var5 = arg1.method360(168, 8);
        if (var5 < this.field341) {
            for (int var6 = var5; var6 < this.field341; ++var6) {
                this.field102[this.field101++] = this.field342[var6];
            }
        }
        if (var5 > this.field341) {
            signlink.reporterror(this.field137 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field341 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field342[var7];
                class67 var9 = this.field340[var8];
                int var10 = arg1.method360(168, 1);
                if (var10 == 0) {
                    this.field342[this.field341++] = var8;
                    var9.field1561 = field505;
                } else {
                    int var11 = arg1.method360(168, 2);
                    if (var11 == 0) {
                        this.field342[this.field341++] = var8;
                        var9.field1561 = field505;
                        this.field395[this.field394++] = var8;
                    } else if (var11 == 1) {
                        this.field342[this.field341++] = var8;
                        var9.field1561 = field505;
                        int var12 = arg1.method360(168, 3);
                        var9.method548(0, false, var12);
                        int var13 = arg1.method360(168, 1);
                        if (var13 == 1) {
                            this.field395[this.field394++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field342[this.field341++] = var8;
                        var9.field1561 = field505;
                        int var14 = arg1.method360(168, 3);
                        var9.method548(0, true, var14);
                        int var15 = arg1.method360(168, 3);
                        var9.method548(0, true, var15);
                        int var16 = arg1.method360(168, 1);
                        if (var16 == 1) {
                            this.field395[this.field394++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field102[this.field101++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method55(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            if (this.field191 != 0) {
                this.field191 = 0;
                this.field265 = true;
            }
            int var3 = this.field235[arg0];
            int var4 = this.field236[arg0];
            int var5 = this.field237[arg0];
            int var6 = this.field238[arg0];
            this.field410 &= arg1;
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 996) {
                class17 var7 = this.field391[var6];
                if (var7 != null) {
                    this.method6(0, var7.field1560[0], field446.field1560[0], false, 0, 0, 2, var7.field1559[0], 1, field446.field1559[0], false, 1);
                    this.field58 = super.field549;
                    this.field59 = super.field550;
                    this.field61 = 2;
                    this.field60 = 0;
                    this.field365.method338(21, 10041);
                    this.field365.method372(var6, this.field81);
                }
            }
            if (var5 == 795) {
                this.method128(var3, var4, var6, 504);
                this.field365.method338(78, 10041);
                this.field365.method373(8, var6 >> 14 & 32767);
                this.field365.method340(this.field290 + var3);
                this.field365.method373(8, this.field291 + var4);
            }
            if (var5 == 87) {
                this.field480 = 1;
                this.field481 = var3;
                this.field482 = var4;
                this.field483 = var6;
                this.field484 = class19.method254(var6).field882;
                this.field171 = 0;
                this.field135 = true;
            } else {
                if (var5 == 816) {
                    boolean var8 = this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 0, field446.field1559[0], false, 0);
                    if (!var8) {
                        this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 1, field446.field1559[0], false, 1);
                    }
                    this.field58 = super.field549;
                    this.field59 = super.field550;
                    this.field61 = 2;
                    this.field60 = 0;
                    this.field365.method338(9, 10041);
                    this.field365.method374(var6, this.field170);
                    this.field365.method340(this.field290 + var3);
                    this.field365.method340(this.field291 + var4);
                }
                if (var5 == 214 && !this.field185) {
                    this.field365.method338(214, 10041);
                    this.field365.method340(var4);
                    this.field185 = true;
                }
                if (var5 == 597) {
                    this.field365.method338(80, 10041);
                    this.field365.method340(var4);
                    class20 var10 = class20.method269(var4);
                    if (var10.field962 != null && var10.field962[0][0] == 5) {
                        int var11 = var10.field962[0][1];
                        if (this.field134[var11] != var10.field893[0]) {
                            this.field134[var11] = var10.field893[0];
                            this.method85(true, var11);
                            this.field135 = true;
                        }
                    }
                }
                if (var5 == 1238) {
                    this.method128(var3, var4, var6, 504);
                    this.field365.method338(113, 10041);
                    this.field365.method373(8, var6 >> 14 & 32767);
                    this.field365.method372(this.field291 + var4, this.field81);
                    this.field365.method374(this.field290 + var3, this.field170);
                }
                if (var5 == 623) {
                    class20 var12 = class20.method269(var4);
                    boolean var13 = true;
                    if (var12.field961 > 0) {
                        var13 = this.method29(field375, var12);
                    }
                    if (var13) {
                        this.field365.method338(80, 10041);
                        this.field365.method340(var4);
                    }
                }
                if (var5 == 943) {
                    class20 var14 = class20.method269(var4);
                    this.field171 = 1;
                    this.field172 = var4;
                    this.field173 = var14.field914;
                    this.field480 = 0;
                    this.field135 = true;
                    String var15 = var14.field951;
                    if (var15.indexOf(" ") != -1) {
                        var15 = var15.substring(0, var15.indexOf(" "));
                    }
                    String var16 = var14.field951;
                    if (var16.indexOf(" ") != -1) {
                        var16 = var16.substring(var16.indexOf(" ") + 1);
                    }
                    this.field174 = var15 + " " + var14.field896 + " " + var16;
                    if (this.field173 == 16) {
                        this.field135 = true;
                        this.field215 = 3;
                        this.field275 = true;
                    }
                } else {
                    if (var5 == 58) {
                        class67 var17 = this.field340[var6];
                        if (var17 != null) {
                            this.method6(0, var17.field1560[0], field446.field1560[0], false, 0, 0, 2, var17.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(231, 10041);
                            this.field365.method340(this.field481);
                            this.field365.method372(this.field483, this.field81);
                            this.field365.method372(this.field482, this.field81);
                            this.field365.method373(8, var6);
                        }
                    }
                    if (var5 == 807) {
                        boolean var18 = this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 0, field446.field1559[0], false, 0);
                        if (!var18) {
                            this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 1, field446.field1559[0], false, 1);
                        }
                        this.field58 = super.field549;
                        this.field59 = super.field550;
                        this.field61 = 2;
                        this.field60 = 0;
                        this.field365.method338(99, 10041);
                        this.field365.method373(8, this.field290 + var3);
                        this.field365.method372(var6, this.field81);
                        this.field365.method372(this.field172, this.field81);
                        this.field365.method340(this.field291 + var4);
                    }
                    if (var5 == 320) {
                        this.field365.method338(165, 10041);
                        this.field365.method374(var6, this.field170);
                        this.field365.method374(this.field482, this.field170);
                        this.field365.method340(var4);
                        this.field365.method373(8, var3);
                        this.field365.method374(this.field483, this.field170);
                        this.field365.method374(this.field481, this.field170);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 478) {
                        this.field365.method338(234, 10041);
                        this.field365.method373(8, var4);
                        this.field365.method373(8, var6);
                        this.field365.method374(var3, this.field170);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 1249) {
                        class19 var20 = class19.method254(var6);
                        String var21;
                        if (var20.field878 != null) {
                            var21 = new String(var20.field878);
                        } else {
                            var21 = "It's a " + var20.field882 + ".";
                        }
                        this.method106("", 0, var21, 0);
                    }
                    if (var5 == 641) {
                        this.field365.method338(233, 10041);
                        this.field365.method340(var3);
                        this.field365.method340(var6);
                        this.field365.method373(8, var4);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 461) {
                        class17 var22 = this.field391[var6];
                        if (var22 != null) {
                            this.method6(0, var22.field1560[0], field446.field1560[0], false, 0, 0, 2, var22.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(2, 10041);
                            this.field365.method372(var6, this.field81);
                        }
                    }
                    if (var5 == 546) {
                        this.field365.method338(221, 10041);
                        this.field365.method374(var4, this.field170);
                        this.field365.method374(var3, this.field170);
                        this.field365.method372(var6, this.field81);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 45 && this.method128(var3, var4, var6, 504)) {
                        this.field365.method338(28, 10041);
                        this.field365.method372(var6 >> 14 & 32767, this.field81);
                        this.field365.method372(this.field290 + var3, this.field81);
                        this.field365.method372(this.field172, this.field81);
                        this.field365.method373(8, this.field291 + var4);
                    }
                    if (var5 == 652) {
                        this.method128(var3, var4, var6, 504);
                        this.field365.method338(61, 10041);
                        this.field365.method374(this.field291 + var4, this.field170);
                        this.field365.method340(this.field290 + var3);
                        this.field365.method373(8, var6 >> 14 & 32767);
                    }
                    if (var5 == 691) {
                        class67 var23 = this.field340[var6];
                        if (var23 != null) {
                            this.method6(0, var23.field1560[0], field446.field1560[0], false, 0, 0, 2, var23.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            field412 += var6;
                            if (field412 >= 109) {
                                this.field365.method338(68, 10041);
                                this.field365.method340(23936);
                                field412 = 0;
                            }
                            this.field365.method338(93, 10041);
                            this.field365.method374(var6, this.field170);
                        }
                    }
                    if (var5 == 48) {
                        this.field365.method338(80, 10041);
                        this.field365.method340(var4);
                        class20 var24 = class20.method269(var4);
                        if (var24.field962 != null && var24.field962[0][0] == 5) {
                            int var25 = var24.field962[0][1];
                            this.field134[var25] = 1 - this.field134[var25];
                            this.method85(true, var25);
                            this.field135 = true;
                        }
                    }
                    if (var5 == 503) {
                        String var26 = this.field166[arg0];
                        int var27 = var26.indexOf("@whi@");
                        if (var27 != -1) {
                            long var28 = class51.method504(var26.substring(var27 + 5).trim());
                            int var30 = -1;
                            for (int var31 = 0; var31 < this.field489; ++var31) {
                                if (this.field93[var31] == var28) {
                                    var30 = var31;
                                    break;
                                }
                            }
                            if (var30 != -1 && this.field253[var30] > 0) {
                                this.field265 = true;
                                this.field191 = 0;
                                this.field356 = true;
                                this.field463 = "";
                                this.field317 = 3;
                                this.field259 = this.field93[var30];
                                this.field202 = "Enter message to send to " + this.field109[var30];
                            }
                        }
                    }
                    if (var5 == 743) {
                        class67 var32 = this.field340[var6];
                        if (var32 != null) {
                            this.method6(0, var32.field1560[0], field446.field1560[0], false, 0, 0, 2, var32.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(108, 10041);
                            this.field365.method372(var6, this.field81);
                        }
                    }
                    if (var5 == 518) {
                        class17 var33 = this.field391[var6];
                        if (var33 != null) {
                            this.method6(0, var33.field1560[0], field446.field1560[0], false, 0, 0, 2, var33.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(152, 10041);
                            this.field365.method373(8, var6);
                        }
                    }
                    if (var5 == 307) {
                        this.method128(var3, var4, var6, 504);
                        this.field365.method338(176, 10041);
                        this.field365.method372(this.field290 + var3, this.field81);
                        this.field365.method374(var6 >> 14 & 32767, this.field170);
                        this.field365.method340(this.field291 + var4);
                    }
                    if (var5 == 96) {
                        ++field214;
                        if (field214 >= 124) {
                            this.field365.method338(184, 10041);
                            this.field365.method343(0);
                            field214 = 0;
                        }
                        this.field365.method338(115, 10041);
                        this.field365.method340(var3);
                        this.field365.method373(8, var4);
                        this.field365.method374(var6, this.field170);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 405) {
                        boolean var34 = this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 0, field446.field1559[0], false, 0);
                        if (!var34) {
                            this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 1, field446.field1559[0], false, 1);
                        }
                        this.field58 = super.field549;
                        this.field59 = super.field550;
                        this.field61 = 2;
                        this.field60 = 0;
                        this.field365.method338(117, 10041);
                        this.field365.method373(8, var6);
                        this.field365.method340(this.field291 + var4);
                        this.field365.method372(this.field290 + var3, this.field81);
                    }
                    if (var5 == 129) {
                        this.field365.method338(59, 10041);
                        this.field365.method374(var4, this.field170);
                        this.field365.method374(var3, this.field170);
                        this.field365.method340(var6);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 504) {
                        this.method110(true);
                    }
                    if (var5 == 905) {
                        this.field365.method338(215, 10041);
                        this.field365.method372(var6, this.field81);
                        this.field365.method340(var3);
                        this.field365.method374(var4, this.field170);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 170) {
                        this.field365.method338(164, 10041);
                        this.field365.method373(8, var6);
                        this.field365.method373(8, var4);
                        this.field365.method373(8, var3);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 918 || var5 == 648 || var5 == 37 || var5 == 730) {
                        String var36 = this.field166[arg0];
                        int var37 = var36.indexOf("@whi@");
                        if (var37 != -1) {
                            long var38 = class51.method504(var36.substring(var37 + 5).trim());
                            if (var5 == 918) {
                                this.method84(false, var38);
                            }
                            if (var5 == 648) {
                                this.method24((byte) 8, var38);
                            }
                            if (var5 == 37) {
                                this.method50(-33590, var38);
                            }
                            if (var5 == 730) {
                                this.method10(true, var38);
                            }
                        }
                    }
                    if (var5 == 309) {
                        boolean var40 = this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 0, field446.field1559[0], false, 0);
                        if (!var40) {
                            this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 1, field446.field1559[0], false, 1);
                        }
                        this.field58 = super.field549;
                        this.field59 = super.field550;
                        this.field61 = 2;
                        this.field60 = 0;
                        ++field352;
                        if (field352 >= 91) {
                            this.field365.method338(162, 10041);
                            field352 = 0;
                        }
                        this.field365.method338(171, 10041);
                        this.field365.method374(this.field291 + var4, this.field170);
                        this.field365.method374(var6, this.field170);
                        this.field365.method340(this.field290 + var3);
                    }
                    if (var5 == 1788) {
                        int var42 = var6 >> 14 & 32767;
                        class37 var43 = class37.method400(var42);
                        String var44;
                        if (var43.field1183 != null) {
                            var44 = new String(var43.field1183);
                        } else {
                            var44 = "It's a " + var43.field1171 + ".";
                        }
                        this.method106("", 0, var44, 0);
                    }
                    if (var5 == 408) {
                        class17 var45 = this.field391[var6];
                        if (var45 != null) {
                            this.method6(0, var45.field1560[0], field446.field1560[0], false, 0, 0, 2, var45.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(187, 10041);
                            this.field365.method374(var6, this.field170);
                        }
                    }
                    if (var5 == 465) {
                        class67 var46 = this.field340[var6];
                        if (var46 != null) {
                            this.method6(0, var46.field1560[0], field446.field1560[0], false, 0, 0, 2, var46.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(54, 10041);
                            this.field365.method372(var6, this.field81);
                            this.field365.method340(this.field172);
                        }
                    }
                    if (var5 == 355) {
                        class17 var47 = this.field391[var6];
                        if (var47 != null) {
                            this.method6(0, var47.field1560[0], field446.field1560[0], false, 0, 0, 2, var47.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(129, 10041);
                            this.field365.method372(var6, this.field81);
                        }
                    }
                    if (var5 == 940) {
                        ++field76;
                        if (field76 >= 78) {
                            this.field365.method338(17, 10041);
                            field76 = 0;
                        }
                        this.field365.method338(70, 10041);
                        this.field365.method340(var3);
                        this.field365.method372(var4, this.field81);
                        this.field365.method340(var6);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 1187) {
                        class19 var48 = class19.method254(var6);
                        class20 var49 = class20.method269(var4);
                        String var50;
                        if (var49 != null && var49.field944[var3] >= 100000) {
                            var50 = var49.field944[var3] + " x " + var48.field882;
                        } else if (var48.field878 != null) {
                            var50 = new String(var48.field878);
                        } else {
                            var50 = "It's a " + var48.field882 + ".";
                        }
                        this.method106("", 0, var50, 0);
                    }
                    if (var5 == 916) {
                        class67 var51 = this.field340[var6];
                        if (var51 != null) {
                            this.method6(0, var51.field1560[0], field446.field1560[0], false, 0, 0, 2, var51.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(206, 10041);
                            this.field365.method373(8, var6);
                        }
                    }
                    if (var5 == 1117) {
                        class67 var52 = this.field340[var6];
                        if (var52 != null) {
                            class12 var53 = var52.field1688;
                            if (var53.field738 != null) {
                                var53 = var53.method206(0);
                            }
                            if (var53 != null) {
                                String var54;
                                if (var53.field711 != null) {
                                    var54 = new String(var53.field711);
                                } else {
                                    var54 = "It's a " + var53.field737 + ".";
                                }
                                this.method106("", 0, var54, 0);
                            }
                        }
                    }
                    if (var5 == 872) {
                        if (!this.field152) {
                            this.field130.method487(super.field549 - 4, -31221, super.field550 - 4);
                        } else {
                            this.field130.method487(var3 - 4, -31221, var4 - 4);
                        }
                    }
                    if (var5 == 800) {
                        boolean var55 = this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 0, field446.field1559[0], false, 0);
                        if (!var55) {
                            this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 1, field446.field1559[0], false, 1);
                        }
                        this.field58 = super.field549;
                        this.field59 = super.field550;
                        this.field61 = 2;
                        this.field60 = 0;
                        this.field365.method338(67, 10041);
                        this.field365.method374(this.field483, this.field170);
                        this.field365.method372(this.field481, this.field81);
                        this.field365.method340(this.field291 + var4);
                        this.field365.method372(this.field290 + var3, this.field81);
                        this.field365.method340(this.field482);
                        this.field365.method373(8, var6);
                    }
                    if (var5 == 677 && this.method128(var3, var4, var6, 504)) {
                        this.field365.method338(190, 10041);
                        this.field365.method374(var6 >> 14 & 32767, this.field170);
                        this.field365.method372(this.field481, this.field81);
                        this.field365.method373(8, this.field482);
                        this.field365.method373(8, this.field290 + var3);
                        this.field365.method373(8, this.field483);
                        this.field365.method372(this.field291 + var4, this.field81);
                    }
                    if (var5 == 185) {
                        boolean var57 = this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 0, field446.field1559[0], false, 0);
                        if (!var57) {
                            this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 1, field446.field1559[0], false, 1);
                        }
                        this.field58 = super.field549;
                        this.field59 = super.field550;
                        this.field61 = 2;
                        this.field60 = 0;
                        this.field365.method338(45, 10041);
                        this.field365.method373(8, this.field291 + var4);
                        this.field365.method373(8, var6);
                        this.field365.method373(8, this.field290 + var3);
                    }
                    if (var5 == 249) {
                        class67 var59 = this.field340[var6];
                        if (var59 != null) {
                            this.method6(0, var59.field1560[0], field446.field1560[0], false, 0, 0, 2, var59.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(138, 10041);
                            this.field365.method374(var6, this.field170);
                        }
                    }
                    if (var5 == 124 || var5 == 475) {
                        String var60 = this.field166[arg0];
                        int var61 = var60.indexOf("@whi@");
                        if (var61 != -1) {
                            String var62 = var60.substring(var61 + 5).trim();
                            String var63 = class51.method508(class51.method505(4, class51.method504(var62)), 0);
                            boolean var64 = false;
                            for (int var65 = 0; var65 < this.field392; ++var65) {
                                class17 var66 = this.field391[this.field393[var65]];
                                if (var66 != null && var66.field830 != null && var66.field830.equalsIgnoreCase(var63)) {
                                    this.method6(0, var66.field1560[0], field446.field1560[0], false, 0, 0, 2, var66.field1559[0], 1, field446.field1559[0], false, 1);
                                    if (var5 == 124) {
                                        this.field365.method338(21, 10041);
                                        this.field365.method372(this.field393[var65], this.field81);
                                    }
                                    if (var5 == 475) {
                                        this.field365.method338(129, 10041);
                                        this.field365.method372(this.field393[var65], this.field81);
                                    }
                                    var64 = true;
                                    break;
                                }
                            }
                            if (!var64) {
                                this.method106("", 0, "Unable to find " + var63, 0);
                            }
                        }
                    }
                    if (var5 == 318) {
                        class17 var67 = this.field391[var6];
                        if (var67 != null) {
                            this.method6(0, var67.field1560[0], field446.field1560[0], false, 0, 0, 2, var67.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(199, 10041);
                            this.field365.method340(this.field172);
                            this.field365.method372(var6, this.field81);
                        }
                    }
                    if (var5 == 265) {
                        class17 var68 = this.field391[var6];
                        if (var68 != null) {
                            this.method6(0, var68.field1560[0], field446.field1560[0], false, 0, 0, 2, var68.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(31, 10041);
                            this.field365.method374(this.field482, this.field170);
                            this.field365.method374(var6, this.field170);
                            this.field365.method374(this.field483, this.field170);
                            this.field365.method340(this.field481);
                        }
                    }
                    if (var5 == 107) {
                        this.method121(this.field154, false);
                        this.field154 = -1;
                        this.field265 = true;
                    }
                    if (var5 == 948) {
                        boolean var69 = this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 0, field446.field1559[0], false, 0);
                        if (!var69) {
                            this.method6(0, var4, field446.field1560[0], false, 0, 0, 2, var3, 1, field446.field1559[0], false, 1);
                        }
                        this.field58 = super.field549;
                        this.field59 = super.field550;
                        this.field61 = 2;
                        this.field60 = 0;
                        if ((this.field291 & 3) == 0) {
                            ++field150;
                        }
                        if (field150 >= 72) {
                            this.field365.method338(245, 10041);
                            this.field365.method343(0);
                            field150 = 0;
                        }
                        this.field365.method338(79, 10041);
                        this.field365.method372(var6, this.field81);
                        this.field365.method340(this.field291 + var4);
                        this.field365.method374(this.field290 + var3, this.field170);
                    }
                    if (var5 == 460) {
                        this.field365.method338(179, 10041);
                        this.field365.method340(var3);
                        this.field365.method373(8, var4);
                        this.field365.method374(var6, this.field170);
                        this.field365.method373(8, this.field172);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 458) {
                        class67 var71 = this.field340[var6];
                        if (var71 != null) {
                            this.method6(0, var71.field1560[0], field446.field1560[0], false, 0, 0, 2, var71.field1559[0], 1, field446.field1559[0], false, 1);
                            this.field58 = super.field549;
                            this.field59 = super.field550;
                            this.field61 = 2;
                            this.field60 = 0;
                            this.field365.method338(153, 10041);
                            this.field365.method340(var6);
                        }
                    }
                    if (var5 == 133) {
                        this.field365.method338(66, 10041);
                        this.field365.method373(8, var3);
                        this.field365.method340(var6);
                        this.field365.method340(var4);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    if (var5 == 345) {
                        String var72 = this.field166[arg0];
                        int var73 = var72.indexOf("@whi@");
                        if (var73 != -1) {
                            if (this.field312 == -1) {
                                this.method110(true);
                                this.field266 = var72.substring(var73 + 5).trim();
                                this.field303 = false;
                                this.field476 = this.field312 = class20.field899;
                            } else {
                                this.method106("", 0, "Please close the interface you have open before using 'report abuse'", 0);
                            }
                        }
                    }
                    if (var5 == 673) {
                        this.method128(var3, var4, var6, 504);
                        this.field365.method338(120, 10041);
                        this.field365.method372(this.field291 + var4, this.field81);
                        this.field365.method374(var6 >> 14 & 32767, this.field170);
                        this.field365.method373(8, this.field290 + var3);
                    }
                    if (var5 == 513) {
                        this.field365.method338(141, 10041);
                        this.field365.method373(8, var6);
                        this.field365.method373(8, var4);
                        this.field365.method374(var3, this.field170);
                        this.field82 = 0;
                        this.field83 = var4;
                        this.field84 = var3;
                        this.field85 = 2;
                        if (class20.method269(var4).field928 == this.field312) {
                            this.field85 = 1;
                        }
                        if (class20.method269(var4).field928 == this.field338) {
                            this.field85 = 3;
                        }
                    }
                    this.field480 = 0;
                    this.field171 = 0;
                    this.field135 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method56(byte arg0) {
        byte[] var2 = this.field288.method277("title.dat", (byte[]) null);
        class72 var3 = new class72(var2, this);
        this.field160.method535((byte) 6);
        var3.method592(0, 0, 0);
        this.field161.method535((byte) 6);
        var3.method592(0, -637, 0);
        this.field157.method535((byte) 6);
        var3.method592(0, -128, 0);
        this.field158.method535((byte) 6);
        var3.method592(0, -202, -371);
        this.field159.method535((byte) 6);
        var3.method592(0, -202, -171);
        this.field162.method535((byte) 6);
        var3.method592(0, 0, -265);
        this.field163.method535((byte) 6);
        var3.method592(0, -562, -265);
        this.field164.method535((byte) 6);
        var3.method592(0, -128, -171);
        this.field165.method535((byte) 6);
        var3.method592(0, -562, -171);
        int[] var4 = new int[var3.field1725];
        for (int var5 = 0; var5 < var3.field1726; ++var5) {
            for (int var10 = 0; var10 < var3.field1725; ++var10) {
                var4[var10] = var3.field1724[var3.field1725 * var5 + (var3.field1725 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1725; ++var11) {
                var3.field1724[var3.field1725 * var5 + var11] = var4[var11];
            }
        }
        this.field160.method535((byte) 6);
        var3.method592(0, 382, 0);
        this.field161.method535((byte) 6);
        var3.method592(0, -255, 0);
        this.field157.method535((byte) 6);
        var3.method592(0, 254, 0);
        this.field158.method535((byte) 6);
        var3.method592(0, 180, -371);
        this.field159.method535((byte) 6);
        var3.method592(0, 180, -171);
        this.field162.method535((byte) 6);
        if (arg0 != 30) {
            this.field258 = null;
        }
        var3.method592(0, 382, -265);
        this.field163.method535((byte) 6);
        var3.method592(0, -180, -265);
        this.field164.method535((byte) 6);
        var3.method592(0, 254, -171);
        this.field165.method535((byte) 6);
        var3.method592(0, -180, -171);
        class72 var6 = new class72(this.field288, "logo", 0);
        this.field157.method535((byte) 6);
        var6.method594(382 - var6.field1725 / 2 - 128, 18, (byte) 8);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method57(byte arg0) {
        if (this.field190 == null) {
            this.method78(-409);
            super.field535 = null;
            this.field157 = null;
            this.field158 = null;
            this.field159 = null;
            this.field160 = null;
            this.field161 = null;
            this.field162 = null;
            this.field163 = null;
            this.field164 = null;
            if (arg0 != -21) {
                this.field203 = !this.field203;
            }
            this.field165 = null;
            this.field190 = new class56(96, 5, 479, this.method92(true));
            this.field188 = new class56(156, 5, 172, this.method92(true));
            class36.method391(7);
            this.field387.method442(0, 0, (byte) 8);
            this.field187 = new class56(261, 5, 190, this.method92(true));
            this.field189 = new class56(334, 5, 512, this.method92(true));
            class36.method391(7);
            this.field369 = new class56(50, 5, 496, this.method92(true));
            this.field370 = new class56(37, 5, 269, this.method92(true));
            this.field371 = new class56(45, 5, 249, this.method92(true));
            this.field256 = true;
            this.field189.method535((byte) 6);
            class62.field1644 = this.field55;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method58(int arg0) {
        if (this.field143 > 0) {
            this.method144((byte) -81);
        } else {
            this.method145(873, "Connection lost", "Please wait - attempting to reestablish");
            this.field246 = 0;
            this.field209 = 0;
            int var2 = 88 / arg0;
            class64 var3 = this.field146;
            this.field410 = false;
            this.field322 = 0;
            this.method138(this.field137, this.field138, true);
            if (!this.field410) {
                this.method144((byte) -81);
            }
            try {
                var3.method578();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHZINZKXF;)Z")
    public final boolean method59(int arg0, class20 arg1) {
        if (arg0 != 0) {
            this.field140 = this.field423.method349();
        }
        int var3 = arg1.field961;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field166[this.field521] = "Remove @whi@" + arg1.field900;
                this.field237[this.field521] = 730;
                ++this.field521;
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
            this.field166[this.field521] = "Remove @whi@" + this.field109[var3];
            this.field237[this.field521] = 37;
            ++this.field521;
            this.field166[this.field521] = "Message @whi@" + this.field109[var3];
            this.field237[this.field521] = 503;
            ++this.field521;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method60(int arg0) {
        this.field190.method535((byte) 6);
        class62.field1644 = this.field53;
        this.field388.method442(0, 0, (byte) 8);
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field356) {
            this.field429.method212(0, 239, this.field202, (byte) 6, 40);
            this.field429.method212(128, 239, this.field463 + "*", (byte) 6, 60);
        } else if (this.field191 == 1) {
            this.field429.method212(0, 239, "Enter amount:", (byte) 6, 40);
            this.field429.method212(128, 239, this.field96 + "*", (byte) 6, 60);
        } else if (this.field191 == 2) {
            this.field429.method212(0, 239, "Enter name:", (byte) 6, 40);
            this.field429.method212(128, 239, this.field96 + "*", (byte) 6, 60);
        } else if (this.field435 != null) {
            this.field429.method212(0, 239, this.field435, (byte) 6, 40);
            this.field429.method212(128, 239, "Click to continue", (byte) 6, 60);
        } else if (this.field338 != -1) {
            this.method13(true, 0, 0, class20.method269(this.field338), 0);
        } else if (this.field154 != -1) {
            this.method13(true, 0, 0, class20.method269(this.field154), 0);
        } else {
            class13 var3 = this.field428;
            int var4 = 0;
            class36.method390(0, 77, (byte) 98, 0, 463);
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field48[var5] != null) {
                    int var7 = this.field46[var5];
                    int var8 = 70 - var4 * 14 + this.field271;
                    String var9 = this.field47[var5];
                    byte var10 = 0;
                    if (var9 != null && var9.startsWith("@cr1@")) {
                        var9 = var9.substring(5);
                        var10 = 1;
                    }
                    if (var9 != null && var9.startsWith("@cr2@")) {
                        var9 = var9.substring(5);
                        var10 = 2;
                    }
                    if (var7 == 0) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method216(this.field48[var5], 4, (byte) 2, var8, 0);
                        }
                        ++var4;
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field226 == 0 || this.field226 == 1 && this.method114(-154, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            int var11 = 4;
                            if (var10 == 1) {
                                this.field411[0].method442(var11, var8 - 12, (byte) 8);
                                var11 += 14;
                            }
                            if (var10 == 2) {
                                this.field411[1].method442(var11, var8 - 12, (byte) 8);
                                var11 += 14;
                            }
                            var3.method216(var9 + ":", var11, (byte) 2, var8, 0);
                            int var12 = var11 + var3.method214(0, var9) + 8;
                            var3.method216(this.field48[var5], var12, (byte) 2, var8, 255);
                        }
                        ++var4;
                    }
                    if ((var7 == 3 || var7 == 7) && this.field310 == 0 && (var7 == 7 || this.field196 == 0 || this.field196 == 1 && this.method114(-154, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var13 = 4;
                            var3.method216("From", var13, (byte) 2, var8, 0);
                            int var14 = var13 + var3.method214(0, "From ");
                            if (var10 == 1) {
                                this.field411[0].method442(var14, var8 - 12, (byte) 8);
                                var14 += 14;
                            }
                            if (var10 == 2) {
                                this.field411[1].method442(var14, var8 - 12, (byte) 8);
                                var14 += 14;
                            }
                            var3.method216(var9 + ":", var14, (byte) 2, var8, 0);
                            int var15 = var14 + var3.method214(0, var9) + 8;
                            var3.method216(this.field48[var5], var15, (byte) 2, var8, 8388608);
                        }
                        ++var4;
                    }
                    if (var7 == 4 && (this.field178 == 0 || this.field178 == 1 && this.method114(-154, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method216(var9 + " " + this.field48[var5], 4, (byte) 2, var8, 8388736);
                        }
                        ++var4;
                    }
                    if (var7 == 5 && this.field310 == 0 && this.field196 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method216(this.field48[var5], 4, (byte) 2, var8, 8388608);
                        }
                        ++var4;
                    }
                    if (var7 == 6 && this.field310 == 0 && this.field196 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method216("To " + var9 + ":", 4, (byte) 2, var8, 0);
                            var3.method216(this.field48[var5], 12 + var3.method214(0, "To " + var9), (byte) 2, var8, 8388608);
                        }
                        ++var4;
                    }
                    if (var7 == 8 && (this.field178 == 0 || this.field178 == 1 && this.method114(-154, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method216(var9 + " " + this.field48[var5], 4, (byte) 2, var8, 8270336);
                        }
                        ++var4;
                    }
                }
            }
            class36.method389(15);
            this.field195 = var4 * 14 + 7;
            if (this.field195 < 78) {
                this.field195 = 78;
            }
            this.method34((byte) 85, this.field195, 463, 0, this.field195 - this.field271 - 77, 77);
            String var6;
            if (field446 != null && field446.field830 != null) {
                var6 = field446.field830;
            } else {
                var6 = class51.method508(this.field137, 0);
            }
            var3.method216(var6 + ":", 4, (byte) 2, 90, 0);
            var3.method216(this.field372 + "*", 6 + var3.method214(0, var6 + ": "), (byte) 2, 90, 255);
            class36.method396(77, 0, 0, 0, 479);
        }
        if (this.field152 && this.field115 == 2) {
            this.method108(true);
        }
        this.field190.method536(17, 5, 357, super.field534);
        this.field189.method535((byte) 6);
        class62.field1644 = this.field55;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILHZINZKXF;II)V")
    public final void method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class20 arg6, int arg7, int arg8) {
        if (this.field400) {
            this.field283 = 32;
        } else {
            this.field283 = 0;
        }
        this.field400 = false;
        if (arg7 < 7 || arg7 > 7) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (arg0 >= arg3 && arg0 < arg3 + 16 && arg4 >= arg5 && arg4 < arg5 + 16) {
            arg6.field903 -= this.field98 * 4;
            if (arg1 == 1) {
                this.field135 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field265 = true;
            }
        } else if (arg0 >= arg3 && arg0 < arg3 + 16 && arg4 >= arg2 + arg5 - 16 && arg4 < arg2 + arg5) {
            arg6.field903 += this.field98 * 4;
            if (arg1 == 1) {
                this.field135 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field265 = true;
            }
        } else if (arg0 >= arg3 - this.field283 && arg0 < arg3 + 16 + this.field283 && arg4 >= arg5 + 16 && arg4 < arg2 + arg5 - 16 && this.field98 > 0) {
            int var11 = (arg2 - 32) * arg2 / arg8;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg4 - arg5 - 16 - var11 / 2;
            int var13 = arg2 - 32 - var11;
            arg6.field903 = (arg8 - arg2) * var12 / var13;
            if (arg1 == 1) {
                this.field135 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field265 = true;
            }
            this.field400 = true;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method62(int arg0) {
        if (arg0 <= 0) {
            this.field365.method339(55);
        }
        for (int var2 = 0; var2 < this.field341; ++var2) {
            int var3 = this.field342[var2];
            class67 var4 = this.field340[var3];
            if (var4 != null) {
                this.method63(var4.field1688.field736, var4, this.field145);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILXETERYIW;B)V")
    public final void method63(int arg0, class58 arg1, byte arg2) {
        if (this.field515 == arg2) {
            boolean var4 = false;
            if (arg1.field1601 < 128 || arg1.field1602 < 128 || arg1.field1601 >= 13184 || arg1.field1602 >= 13184) {
                arg1.field1587 = -1;
                arg1.field1553 = -1;
                arg1.field1576 = 0;
                arg1.field1577 = 0;
                arg1.field1601 = arg1.field1559[0] * 128 + arg1.field1571 * 64;
                arg1.field1602 = arg1.field1560[0] * 128 + arg1.field1571 * 64;
                arg1.method549(this.field94);
            }
            if (field446 == arg1 && (arg1.field1601 < 1536 || arg1.field1602 < 1536 || arg1.field1601 >= 11776 || arg1.field1602 >= 11776)) {
                arg1.field1587 = -1;
                arg1.field1553 = -1;
                arg1.field1576 = 0;
                arg1.field1577 = 0;
                arg1.field1601 = arg1.field1559[0] * 128 + arg1.field1571 * 64;
                arg1.field1602 = arg1.field1560[0] * 128 + arg1.field1571 * 64;
                arg1.method549(this.field94);
            }
            if (arg1.field1576 > field505) {
                this.method64(this.field366, arg1);
            } else if (arg1.field1577 >= field505) {
                this.method65(true, arg1);
            } else {
                this.method66(arg1, (byte) -64);
            }
            this.method67(true, arg1);
            this.method68((byte) -43, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILXETERYIW;)V")
    public final void method64(int arg0, class58 arg1) {
        int var3 = arg1.field1576 - field505;
        int var4 = arg1.field1572 * 128 + arg1.field1571 * 64;
        int var5 = arg1.field1574 * 128 + arg1.field1571 * 64;
        arg1.field1601 += (var4 - arg1.field1601) / var3;
        arg1.field1602 += (var5 - arg1.field1602) / var3;
        if (arg0 != 0) {
            this.field140 = -1;
        }
        arg1.field1564 = 0;
        if (arg1.field1578 == 0) {
            arg1.field1581 = 1024;
        }
        if (arg1.field1578 == 1) {
            arg1.field1581 = 1536;
        }
        if (arg1.field1578 == 2) {
            arg1.field1581 = 0;
        }
        if (arg1.field1578 == 3) {
            arg1.field1581 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLXETERYIW;)V")
    public final void method65(boolean arg0, class58 arg1) {
        if (field505 == arg1.field1577 || arg1.field1587 == -1 || arg1.field1590 != 0 || arg1.field1589 + 1 > class42.field1219[arg1.field1587].method427(arg1.field1588, this.field44)) {
            int var3 = arg1.field1577 - arg1.field1576;
            int var4 = field505 - arg1.field1576;
            int var5 = arg1.field1572 * 128 + arg1.field1571 * 64;
            int var6 = arg1.field1574 * 128 + arg1.field1571 * 64;
            int var7 = arg1.field1573 * 128 + arg1.field1571 * 64;
            int var8 = arg1.field1575 * 128 + arg1.field1571 * 64;
            arg1.field1601 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1602 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1564 = 0;
        if (arg1.field1578 == 0) {
            arg1.field1581 = 1024;
        }
        if (arg1.field1578 == 1) {
            arg1.field1581 = 1536;
        }
        if (arg1.field1578 == 2) {
            arg1.field1581 = 0;
        }
        if (arg1.field1578 == 3) {
            arg1.field1581 = 512;
        }
        arg1.field1603 = arg1.field1581;
        if (!arg0) {
            this.field328 = this.field353.method278();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXETERYIW;B)V")
    public final void method66(class58 arg0, byte arg1) {
        arg0.field1550 = arg0.field1599;
        if (arg1 != -64) {
            this.field365.method339(171);
        }
        if (arg0.field1579 == 0) {
            arg0.field1564 = 0;
        } else {
            if (arg0.field1587 != -1 && arg0.field1590 == 0) {
                class42 var3 = class42.field1219[arg0.field1587];
                if (arg0.field1562 > 0 && var3.field1231 == 0) {
                    ++arg0.field1564;
                    return;
                }
                if (arg0.field1562 <= 0 && var3.field1232 == 0) {
                    ++arg0.field1564;
                    return;
                }
            }
            int var4 = arg0.field1601;
            int var5 = arg0.field1602;
            int var6 = arg0.field1559[arg0.field1579 - 1] * 128 + arg0.field1571 * 64;
            int var7 = arg0.field1560[arg0.field1579 - 1] * 128 + arg0.field1571 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1581 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1581 = 1792;
                    } else {
                        arg0.field1581 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1581 = 768;
                    } else if (var5 > var7) {
                        arg0.field1581 = 256;
                    } else {
                        arg0.field1581 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1581 = 1024;
                } else {
                    arg0.field1581 = 0;
                }
                int var8 = arg0.field1581 - arg0.field1603 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1596;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1595;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1598;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1597;
                }
                if (var9 == -1) {
                    var9 = arg0.field1595;
                }
                arg0.field1550 = var9;
                int var10 = 4;
                if (arg0.field1603 != arg0.field1581 && arg0.field1549 == -1 && arg0.field1605 != 0) {
                    var10 = 2;
                }
                if (arg0.field1579 > 2) {
                    var10 = 6;
                }
                if (arg0.field1579 > 3) {
                    var10 = 8;
                }
                if (arg0.field1564 > 0 && arg0.field1579 > 1) {
                    var10 = 8;
                    --arg0.field1564;
                }
                if (arg0.field1563[arg0.field1579 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1595 == arg0.field1550 && arg0.field1582 != -1) {
                    arg0.field1550 = arg0.field1582;
                }
                if (var4 < var6) {
                    arg0.field1601 += var10;
                    if (arg0.field1601 > var6) {
                        arg0.field1601 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1601 -= var10;
                    if (arg0.field1601 < var6) {
                        arg0.field1601 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1602 += var10;
                    if (arg0.field1602 > var7) {
                        arg0.field1602 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1602 -= var10;
                    if (arg0.field1602 < var7) {
                        arg0.field1602 = var7;
                    }
                }
                if (arg0.field1601 == var6 && arg0.field1602 == var7) {
                    --arg0.field1579;
                    if (arg0.field1562 > 0) {
                        --arg0.field1562;
                        return;
                    }
                }
            } else {
                arg0.field1601 = var6;
                arg0.field1602 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLXETERYIW;)V")
    public final void method67(boolean arg0, class58 arg1) {
        if (!arg0) {
            this.field140 = this.field423.method349();
        }
        if (arg1.field1605 != 0) {
            if (arg1.field1549 != -1 && arg1.field1549 < 32768) {
                class67 var3 = this.field340[arg1.field1549];
                if (var3 != null) {
                    int var4 = arg1.field1601 - var3.field1601;
                    int var5 = arg1.field1602 - var3.field1602;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1581 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1549 >= 32768) {
                int var6 = arg1.field1549 - 32768;
                if (this.field470 == var6) {
                    var6 = this.field390;
                }
                class17 var7 = this.field391[var6];
                if (var7 != null) {
                    int var8 = arg1.field1601 - var7.field1601;
                    int var9 = arg1.field1602 - var7.field1602;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1581 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1569 != 0 || arg1.field1570 != 0) && (arg1.field1579 == 0 || arg1.field1564 > 0)) {
                int var10 = arg1.field1601 - (arg1.field1569 - this.field290 - this.field290) * 64;
                int var11 = arg1.field1602 - (arg1.field1570 - this.field291 - this.field291) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1581 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1569 = 0;
                arg1.field1570 = 0;
            }
            int var12 = arg1.field1581 - arg1.field1603 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1605 && var12 <= 2048 - arg1.field1605) {
                    if (var12 > 1024) {
                        arg1.field1603 -= arg1.field1605;
                    } else {
                        arg1.field1603 += arg1.field1605;
                    }
                } else {
                    arg1.field1603 = arg1.field1581;
                }
                arg1.field1603 &= 2047;
                if (arg1.field1599 == arg1.field1550 && arg1.field1603 != arg1.field1581) {
                    if (arg1.field1600 != -1) {
                        arg1.field1550 = arg1.field1600;
                        return;
                    }
                    arg1.field1550 = arg1.field1595;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLXETERYIW;)V")
    public final void method68(byte arg0, class58 arg1) {
        if (arg0 != -43) {
            this.method116();
        }
        arg1.field1580 = false;
        if (arg1.field1550 != -1) {
            class42 var3 = class42.field1219[arg1.field1550];
            ++arg1.field1552;
            if (arg1.field1551 < var3.field1220 && arg1.field1552 > var3.method427(arg1.field1551, this.field44)) {
                arg1.field1552 = 0;
                ++arg1.field1551;
            }
            if (arg1.field1551 >= var3.field1220) {
                arg1.field1552 = 0;
                arg1.field1551 = 0;
            }
        }
        if (arg1.field1553 != -1 && field505 >= arg1.field1556) {
            if (arg1.field1554 < 0) {
                arg1.field1554 = 0;
            }
            class42 var4 = class11.field698[arg1.field1553].field702;
            ++arg1.field1555;
            while (arg1.field1554 < var4.field1220 && arg1.field1555 > var4.method427(arg1.field1554, this.field44)) {
                arg1.field1555 -= var4.method427(arg1.field1554, this.field44);
                ++arg1.field1554;
            }
            if (arg1.field1554 >= var4.field1220 && (arg1.field1554 < 0 || arg1.field1554 >= var4.field1220)) {
                arg1.field1553 = -1;
            }
        }
        if (arg1.field1587 != -1 && arg1.field1590 <= 1) {
            class42 var5 = class42.field1219[arg1.field1587];
            if (var5.field1231 == 1 && arg1.field1562 > 0 && arg1.field1576 <= field505 && arg1.field1577 < field505) {
                arg1.field1590 = 1;
                return;
            }
        }
        if (arg1.field1587 != -1 && arg1.field1590 == 0) {
            class42 var6 = class42.field1219[arg1.field1587];
            ++arg1.field1589;
            while (arg1.field1588 < var6.field1220 && arg1.field1589 > var6.method427(arg1.field1588, this.field44)) {
                arg1.field1589 -= var6.method427(arg1.field1588, this.field44);
                ++arg1.field1588;
            }
            if (arg1.field1588 >= var6.field1220) {
                arg1.field1588 -= var6.field1224;
                ++arg1.field1591;
                if (arg1.field1591 >= var6.field1230) {
                    arg1.field1587 = -1;
                }
                if (arg1.field1588 < 0 || arg1.field1588 >= var6.field1220) {
                    arg1.field1587 = -1;
                }
            }
            arg1.field1580 = var6.field1226;
        }
        if (arg1.field1590 > 0) {
            --arg1.field1590;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method69(int arg0) {
        if (arg0 != 40439) {
            this.field140 = this.field423.method349();
        }
        if (this.field197 != -1 && (this.field273 == 2 || super.field535 != null)) {
            if (this.field273 == 2) {
                this.method123(this.field197, false, this.field281);
                if (this.field468 != -1) {
                    this.method123(this.field468, false, this.field281);
                }
                this.field281 = 0;
                this.method40(7182);
                super.field535.method535((byte) 6);
                class62.field1644 = this.field56;
                class36.method391(7);
                this.field256 = true;
                class20 var2 = class20.method269(this.field197);
                if (var2.field923 == 512 && var2.field895 == 334 && var2.field894 == 0) {
                    var2.field923 = 765;
                    var2.field895 = 503;
                }
                this.method13(true, 0, 0, var2, 0);
                if (this.field468 != -1) {
                    class20 var3 = class20.method269(this.field468);
                    if (var3.field923 == 512 && var3.field895 == 334 && var3.field894 == 0) {
                        var3.field923 = 765;
                        var3.field895 = 503;
                    }
                    this.method13(true, 0, 0, var3, 0);
                }
                if (!this.field152) {
                    this.method126(-4);
                    this.method7(true);
                } else {
                    this.method108(true);
                }
            }
            super.field535.method536(0, 5, 0, super.field534);
        } else {
            if (this.field256) {
                this.method57((byte) -21);
                this.field256 = false;
                this.field506.method536(0, 5, 4, super.field534);
                this.field507.method536(0, 5, 357, super.field534);
                this.field508.method536(722, 5, 4, super.field534);
                this.field509.method536(743, 5, 205, super.field534);
                this.field510.method536(0, 5, 0, super.field534);
                this.field511.method536(516, 5, 4, super.field534);
                this.field512.method536(516, 5, 205, super.field534);
                this.field513.method536(496, 5, 357, super.field534);
                this.field514.method536(0, 5, 338, super.field534);
                this.field135 = true;
                this.field265 = true;
                this.field275 = true;
                this.field462 = true;
                if (this.field273 != 2) {
                    this.field189.method536(4, 5, 4, super.field534);
                    this.field188.method536(550, 5, 4, super.field534);
                }
            }
            if (this.field273 == 2) {
                this.method118((byte) 20);
            }
            if (this.field152 && this.field115 == 1) {
                this.field135 = true;
            }
            if (this.field420 != -1) {
                boolean var4 = this.method123(this.field420, false, this.field281);
                if (var4) {
                    this.field135 = true;
                }
            }
            if (this.field85 == 2) {
                this.field135 = true;
            }
            if (this.field278 == 2) {
                this.field135 = true;
            }
            if (this.field135) {
                this.method117(0);
                this.field135 = false;
            }
            if (this.field338 == -1) {
                this.field419.field903 = this.field195 - this.field271 - 77;
                if (super.field542 > 448 && super.field542 < 560 && super.field543 > 332) {
                    this.method61(super.field542 - 17, -1, 77, 463, super.field543 - 357, 0, this.field419, 7, this.field195);
                }
                int var5 = this.field195 - 77 - this.field419.field903;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field195 - 77) {
                    var5 = this.field195 - 77;
                }
                if (this.field271 != var5) {
                    this.field271 = var5;
                    this.field265 = true;
                }
            }
            if (this.field338 != -1) {
                boolean var6 = this.method123(this.field338, false, this.field281);
                if (var6) {
                    this.field265 = true;
                }
            }
            if (this.field85 == 3) {
                this.field265 = true;
            }
            if (this.field278 == 3) {
                this.field265 = true;
            }
            if (this.field435 != null) {
                this.field265 = true;
            }
            if (this.field152 && this.field115 == 2) {
                this.field265 = true;
            }
            if (this.field265) {
                this.method60(44);
                this.field265 = false;
            }
            if (this.field273 == 2) {
                this.method132((byte) 2);
                this.field188.method536(550, 5, 4, super.field534);
            }
            if (this.field364 != -1) {
                this.field275 = true;
            }
            if (this.field275) {
                if (this.field364 != -1 && this.field364 == this.field215) {
                    this.field364 = -1;
                    this.field365.method338(121, 10041);
                    this.field365.method339(this.field215);
                }
                this.field275 = false;
                this.field371.method535((byte) 6);
                this.field337.method442(0, 0, (byte) 8);
                if (this.field420 == -1) {
                    if (this.field254[this.field215] != -1) {
                        if (this.field215 == 0) {
                            this.field414.method442(22, 10, (byte) 8);
                        }
                        if (this.field215 == 1) {
                            this.field415.method442(54, 8, (byte) 8);
                        }
                        if (this.field215 == 2) {
                            this.field415.method442(82, 8, (byte) 8);
                        }
                        if (this.field215 == 3) {
                            this.field416.method442(110, 8, (byte) 8);
                        }
                        if (this.field215 == 4) {
                            this.field418.method442(153, 8, (byte) 8);
                        }
                        if (this.field215 == 5) {
                            this.field418.method442(181, 8, (byte) 8);
                        }
                        if (this.field215 == 6) {
                            this.field417.method442(209, 9, (byte) 8);
                        }
                    }
                    if (this.field254[0] != -1 && (this.field364 != 0 || field505 % 20 < 10)) {
                        this.field42[0].method442(29, 13, (byte) 8);
                    }
                    if (this.field254[1] != -1 && (this.field364 != 1 || field505 % 20 < 10)) {
                        this.field42[1].method442(53, 11, (byte) 8);
                    }
                    if (this.field254[2] != -1 && (this.field364 != 2 || field505 % 20 < 10)) {
                        this.field42[2].method442(82, 11, (byte) 8);
                    }
                    if (this.field254[3] != -1 && (this.field364 != 3 || field505 % 20 < 10)) {
                        this.field42[3].method442(115, 12, (byte) 8);
                    }
                    if (this.field254[4] != -1 && (this.field364 != 4 || field505 % 20 < 10)) {
                        this.field42[4].method442(153, 13, (byte) 8);
                    }
                    if (this.field254[5] != -1 && (this.field364 != 5 || field505 % 20 < 10)) {
                        this.field42[5].method442(180, 11, (byte) 8);
                    }
                    if (this.field254[6] != -1 && (this.field364 != 6 || field505 % 20 < 10)) {
                        this.field42[6].method442(208, 13, (byte) 8);
                    }
                }
                this.field371.method536(516, 5, 160, super.field534);
                ++field252;
                if (field252 > 68) {
                    field252 = 0;
                    this.field365.method338(102, 10041);
                }
                this.field370.method535((byte) 6);
                this.field336.method442(0, 0, (byte) 8);
                if (this.field420 == -1) {
                    if (this.field254[this.field215] != -1) {
                        if (this.field215 == 7) {
                            this.field204.method442(42, 0, (byte) 8);
                        }
                        if (this.field215 == 8) {
                            this.field205.method442(74, 0, (byte) 8);
                        }
                        if (this.field215 == 9) {
                            this.field205.method442(102, 0, (byte) 8);
                        }
                        if (this.field215 == 10) {
                            this.field206.method442(130, 1, (byte) 8);
                        }
                        if (this.field215 == 11) {
                            this.field208.method442(173, 0, (byte) 8);
                        }
                        if (this.field215 == 12) {
                            this.field208.method442(201, 0, (byte) 8);
                        }
                        if (this.field215 == 13) {
                            this.field207.method442(229, 0, (byte) 8);
                        }
                    }
                    if (this.field254[8] != -1 && (this.field364 != 8 || field505 % 20 < 10)) {
                        this.field42[7].method442(74, 2, (byte) 8);
                    }
                    if (this.field254[9] != -1 && (this.field364 != 9 || field505 % 20 < 10)) {
                        this.field42[8].method442(102, 3, (byte) 8);
                    }
                    if (this.field254[10] != -1 && (this.field364 != 10 || field505 % 20 < 10)) {
                        this.field42[9].method442(137, 4, (byte) 8);
                    }
                    if (this.field254[11] != -1 && (this.field364 != 11 || field505 % 20 < 10)) {
                        this.field42[10].method442(174, 2, (byte) 8);
                    }
                    if (this.field254[12] != -1 && (this.field364 != 12 || field505 % 20 < 10)) {
                        this.field42[11].method442(201, 2, (byte) 8);
                    }
                    if (this.field254[13] != -1 && (this.field364 != 13 || field505 % 20 < 10)) {
                        this.field42[12].method442(226, 2, (byte) 8);
                    }
                }
                this.field370.method536(496, 5, 466, super.field534);
                this.field189.method535((byte) 6);
                class62.field1644 = this.field55;
            }
            if (this.field462) {
                this.field462 = false;
                this.field369.method535((byte) 6);
                this.field335.method442(0, 0, (byte) 8);
                this.field428.method213(16777215, true, false, 55, 28, "Public chat");
                if (this.field226 == 0) {
                    this.field428.method213(65280, true, false, 55, 41, "On");
                }
                if (this.field226 == 1) {
                    this.field428.method213(16776960, true, false, 55, 41, "Friends");
                }
                if (this.field226 == 2) {
                    this.field428.method213(16711680, true, false, 55, 41, "Off");
                }
                if (this.field226 == 3) {
                    this.field428.method213(65535, true, false, 55, 41, "Hide");
                }
                this.field428.method213(16777215, true, false, 184, 28, "Private chat");
                if (this.field196 == 0) {
                    this.field428.method213(65280, true, false, 184, 41, "On");
                }
                if (this.field196 == 1) {
                    this.field428.method213(16776960, true, false, 184, 41, "Friends");
                }
                if (this.field196 == 2) {
                    this.field428.method213(16711680, true, false, 184, 41, "Off");
                }
                this.field428.method213(16777215, true, false, 324, 28, "Trade/compete");
                if (this.field178 == 0) {
                    this.field428.method213(65280, true, false, 324, 41, "On");
                }
                if (this.field178 == 1) {
                    this.field428.method213(16776960, true, false, 324, 41, "Friends");
                }
                if (this.field178 == 2) {
                    this.field428.method213(16711680, true, false, 324, 41, "Off");
                }
                this.field428.method213(16777215, true, false, 458, 33, "Report abuse");
                this.field369.method536(0, 5, 453, super.field534);
                this.field189.method535((byte) 6);
                class62.field1644 = this.field55;
            }
            this.field281 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method70(boolean arg0) {
        if (!arg0) {
            this.field203 = !this.field203;
        }
        if (this.field350 == 0) {
            int var2 = super.field532 / 2 - 80;
            int var3 = super.field533 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field548 == 1 && super.field549 >= var2 - 75 && super.field549 <= var2 + 75 && super.field550 >= var14 - 20 && super.field550 <= var14 + 20) {
                this.field350 = 3;
                this.field111 = 0;
            }
            int var4 = super.field532 / 2 + 80;
            if (super.field548 == 1 && super.field549 >= var4 - 75 && super.field549 <= var4 + 75 && super.field550 >= var14 - 20 && super.field550 <= var14 + 20) {
                this.field362 = "";
                this.field363 = "Enter your username & password.";
                this.field350 = 2;
                this.field111 = 0;
            }
        } else if (this.field350 == 2) {
            int var5 = super.field533 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field548 == 1 && super.field550 >= var16 - 15 && super.field550 < var16) {
                this.field111 = 0;
            }
            var5 = var16 + 15;
            if (super.field548 == 1 && super.field550 >= var5 - 15 && super.field550 < var5) {
                this.field111 = 1;
            }
            var5 += 15;
            int var6 = super.field532 / 2 - 80;
            int var7 = super.field533 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field548 == 1 && super.field549 >= var6 - 75 && super.field549 <= var6 + 75 && super.field550 >= var17 - 20 && super.field550 <= var17 + 20) {
                this.field322 = 0;
                this.method138(this.field137, this.field138, false);
                if (this.field410) {
                    return;
                }
            }
            int var8 = super.field532 / 2 + 80;
            if (super.field548 == 1 && super.field549 >= var8 - 75 && super.field549 <= var8 + 75 && super.field550 >= var17 - 20 && super.field550 <= var17 + 20) {
                this.field350 = 0;
                this.field137 = "";
                this.field138 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method155(-520);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field247.length(); ++var11) {
                        if (var9 == field247.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field111 == 0) {
                        if (var9 == 8 && this.field137.length() > 0) {
                            this.field137 = this.field137.substring(0, this.field137.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field111 = 1;
                        }
                        if (var10) {
                            this.field137 = this.field137 + (char) var9;
                        }
                        if (this.field137.length() > 12) {
                            this.field137 = this.field137.substring(0, 12);
                        }
                    } else if (this.field111 == 1) {
                        if (var9 == 8 && this.field138.length() > 0) {
                            this.field138 = this.field138.substring(0, this.field138.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field111 = 0;
                        }
                        if (var10) {
                            this.field138 = this.field138 + (char) var9;
                        }
                        if (this.field138.length() > 20) {
                            this.field138 = this.field138.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field350 == 3) {
                int var12 = super.field532 / 2;
                int var13 = super.field533 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field548 == 1 && super.field549 >= var12 - 75 && super.field549 <= var12 + 75 && super.field550 >= var18 - 20 && super.field550 <= var18 + 20) {
                    this.field350 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method71(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method116();
        }
        this.method81(6);
        this.field159.method535((byte) 6);
        this.field431.method442(0, 0, (byte) 8);
        short var3 = 360;
        short var4 = 200;
        if (this.field350 == 0) {
            int var5 = var4 / 2 + 80;
            this.field427.method213(7711145, true, false, var3 / 2, var5, this.field40.field1525);
            int var6 = var4 / 2 - 20;
            this.field429.method213(16776960, true, false, var3 / 2, var6, "Welcome to RuneScape");
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field432.method442(var7 - 73, var8 - 20, (byte) 8);
            this.field429.method213(16777215, true, false, var7, var8 + 5, "New User");
            int var9 = var3 / 2 + 80;
            this.field432.method442(var9 - 73, var8 - 20, (byte) 8);
            this.field429.method213(16777215, true, false, var9, var8 + 5, "Existing User");
        }
        if (this.field350 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field362.length() > 0) {
                this.field429.method213(16776960, true, false, var3 / 2, var10 - 15, this.field362);
                this.field429.method213(16776960, true, false, var3 / 2, var10, this.field363);
                var10 += 30;
            } else {
                this.field429.method213(16776960, true, false, var3 / 2, var10 - 7, this.field363);
                var10 += 30;
            }
            this.field429.method220(var10, "Username: " + this.field137 + (this.field111 == 0 & field505 % 40 < 20 ? "@yel@|" : ""), false, true, 16777215, var3 / 2 - 90);
            var10 += 15;
            this.field429.method220(var10, "Password: " + class51.method509(this.field138, 0) + (this.field111 == 1 & field505 % 40 < 20 ? "@yel@|" : ""), false, true, 16777215, var3 / 2 - 88);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field432.method442(var11 - 73, var12 - 20, (byte) 8);
                this.field429.method213(16777215, true, false, var11, var12 + 5, "Login");
                int var13 = var3 / 2 + 80;
                this.field432.method442(var13 - 73, var12 - 20, (byte) 8);
                this.field429.method213(16777215, true, false, var13, var12 + 5, "Cancel");
            }
        }
        if (this.field350 == 3) {
            this.field429.method213(16776960, true, false, var3 / 2, var4 / 2 - 60, "Create a free account");
            int var14 = var4 / 2 - 35;
            this.field429.method213(16777215, true, false, var3 / 2, var14, "To create a new account you need to");
            int var18 = var14 + 15;
            this.field429.method213(16777215, true, false, var3 / 2, var18, "go back to the main RuneScape webpage");
            int var19 = var18 + 15;
            this.field429.method213(16777215, true, false, var3 / 2, var19, "and choose the red 'create account'");
            int var20 = var19 + 15;
            this.field429.method213(16777215, true, false, var3 / 2, var20, "button at the top right of that page.");
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field432.method442(var15 - 73, var16 - 20, (byte) 8);
            this.field429.method213(16777215, true, false, var15, var16 + 5, "Cancel");
        }
        this.field159.method536(202, 5, 171, super.field534);
        if (this.field256) {
            this.field256 = false;
            this.field157.method536(128, 5, 0, super.field534);
            this.field158.method536(202, 5, 371, super.field534);
            this.field162.method536(0, 5, 265, super.field534);
            this.field163.method536(562, 5, 265, super.field534);
            this.field164.method536(128, 5, 171, super.field534);
            this.field165.method536(562, 5, 171, super.field534);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILNHEPCMLW;Z)V")
    private final void method72(int arg0, class35 arg1, boolean arg2) {
        this.field101 = 0;
        this.field394 = 0;
        if (arg2) {
            this.field140 = arg1.method349();
        }
        this.method15(arg1, arg0, (byte) 89);
        this.method79(false, arg1, arg0);
        this.method150(arg0, arg1, true);
        this.method21(arg0, true, arg1);
        for (int var4 = 0; var4 < this.field101; ++var4) {
            int var6 = this.field102[var4];
            if (field505 != this.field391[var6].field1561) {
                this.field391[var6] = null;
            }
        }
        if (arg1.field1107 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1107 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field392; ++var5) {
                if (this.field391[this.field393[var5]] == null) {
                    signlink.reporterror(this.field137 + " null entry in pl list - pos:" + var5 + " size:" + this.field392);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;I)LINOFEYKQ;")
    public final class21 method73(int arg0, int arg1, int arg2, String arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field99[0] != null) {
                var7 = this.field99[0].method550(false, arg1);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field217.reset();
            this.field217.update(var7);
            int var9 = (int) this.field217.getValue();
            if (arg0 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class21(this.field203, var7);
        } else {
            int var11 = 0;
            if (this.field193 != arg2) {
                field518 = -450;
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method32(3, arg5, "Requesting " + arg3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method86(arg4 + arg0);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class35 var17 = new class35((byte) -103, var16);
                    var17.field1107 = 3;
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
                            this.method32(3, arg5, "Loading " + arg3 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field99[0] != null) {
                            this.field99[0].method551(var7.length, true, var7, arg1);
                        }
                    } catch (Exception var29) {
                        this.field99[0] = null;
                    }
                    if (var7 != null) {
                        this.field217.reset();
                        this.field217.update(var7);
                        int var24 = (int) this.field217.getValue();
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
                            this.method32(3, arg5, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method32(3, arg5, var12 + " - Retrying in " + var26);
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
                    this.field245 = !this.field245;
                }
            }
            return new class21(this.field203, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method74(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method74(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 339);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field464 = Integer.parseInt(arg0[0]);
                field465 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method41(-39415);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method125((byte) -105);
                }
                if (arg0[3].equals("free")) {
                    field466 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field466 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method151(true, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    private final void method75(int arg0) {
        if (arg0 >= 0) {
            this.field140 = -1;
        }
        if (this.field273 == 2) {
            for (class61 var2 = (class61) this.field402.method414(); var2 != null; var2 = (class61) this.field402.method416(this.field406)) {
                if (var2.field1626 > 0) {
                    --var2.field1626;
                }
                if (var2.field1626 == 0) {
                    if (var2.field1618 < 0 || class14.method238(this.field267, var2.field1620, var2.field1618)) {
                        this.method26(var2.field1621, -210, var2.field1623, var2.field1618, var2.field1620, var2.field1624, var2.field1622, var2.field1619);
                        var2.method336();
                    }
                } else {
                    if (var2.field1625 > 0) {
                        --var2.field1625;
                    }
                    if (var2.field1625 == 0 && var2.field1623 >= 1 && var2.field1624 >= 1 && var2.field1623 <= 102 && var2.field1624 <= 102 && (var2.field1627 < 0 || class14.method238(this.field267, var2.field1629, var2.field1627))) {
                        this.method26(var2.field1621, -210, var2.field1623, var2.field1627, var2.field1629, var2.field1624, var2.field1622, var2.field1628);
                        var2.field1625 = -1;
                        if (var2.field1627 == var2.field1618 && var2.field1618 == -1) {
                            var2.method336();
                        } else if (var2.field1627 == var2.field1618 && var2.field1628 == var2.field1619 && var2.field1629 == var2.field1620) {
                            var2.method336();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field537 != null) {
                    return new URL("http://127.0.0.1:" + (field465 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method76(int arg0) {
        this.field80 = true;
        if (arg0 != 7) {
            this.field140 = -1;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field424) {
                ++this.field469;
                this.method130(-145);
                this.method130(-145);
                this.method94(5429);
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
        this.field80 = false;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LNHEPCMLW;IB)V")
    private final void method77(class35 arg0, int arg1, byte arg2) {
        for (int var4 = 0; var4 < this.field394; ++var4) {
            int var6 = this.field395[var4];
            class67 var7 = this.field340[var6];
            int var8 = arg0.method349();
            if ((var8 & 16) != 0) {
                int var9 = arg0.method351();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method369(this.field88);
                if (var7.field1587 == var9 && var9 != -1) {
                    int var11 = class42.field1219[var9].field1233;
                    if (var11 == 1) {
                        var7.field1588 = 0;
                        var7.field1589 = 0;
                        var7.field1590 = var10;
                        var7.field1591 = 0;
                    }
                    if (var11 == 2) {
                        var7.field1591 = 0;
                    }
                } else if (var9 == -1 || var7.field1587 == -1 || class42.field1219[var9].field1227 >= class42.field1219[var7.field1587].field1227) {
                    var7.field1587 = var9;
                    var7.field1588 = 0;
                    var7.field1589 = 0;
                    var7.field1590 = var10;
                    var7.field1591 = 0;
                    var7.field1562 = var7.field1579;
                }
            }
            if ((var8 & 4) != 0) {
                int var12 = arg0.method369(this.field88);
                int var13 = arg0.method367(34652);
                var7.method546(var12, field505, -333, var13);
                var7.field1584 = field505 + 300;
                var7.field1585 = arg0.method368(0);
                var7.field1586 = arg0.method367(34652);
            }
            if ((var8 & 128) != 0) {
                int var14 = arg0.method368(0);
                int var15 = arg0.method367(34652);
                var7.method546(var14, field505, -333, var15);
                var7.field1584 = field505 + 300;
                var7.field1585 = arg0.method369(this.field88);
                var7.field1586 = arg0.method349();
            }
            if ((var8 & 64) != 0) {
                var7.field1565 = arg0.method356();
                var7.field1558 = 100;
            }
            if ((var8 & 2) != 0) {
                var7.field1549 = arg0.method351();
                if (var7.field1549 == 65535) {
                    var7.field1549 = -1;
                }
            }
            if ((var8 & 8) != 0) {
                var7.field1569 = arg0.method376(5);
                var7.field1570 = arg0.method375(-889);
            }
            if ((var8 & 1) != 0) {
                var7.field1688 = class12.method203(arg0.method377(true));
                var7.field1571 = var7.field1688.field736;
                var7.field1605 = var7.field1688.field728;
                var7.field1595 = var7.field1688.field714;
                var7.field1596 = var7.field1688.field739;
                var7.field1597 = var7.field1688.field713;
                var7.field1598 = var7.field1688.field725;
                var7.field1599 = var7.field1688.field747;
            }
            if ((var8 & 32) != 0) {
                var7.field1553 = arg0.method376(5);
                int var16 = arg0.method382(true);
                var7.field1557 = var16 >> 16;
                var7.field1556 = (var16 & 65535) + field505;
                var7.field1554 = 0;
                var7.field1555 = 0;
                if (var7.field1556 > field505) {
                    var7.field1554 = -1;
                }
                if (var7.field1553 == 65535) {
                    var7.field1553 = -1;
                }
            }
        }
        if (arg2 == 2) {
            boolean var5 = false;
        } else {
            this.field250 = -194;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method78(int arg0) {
        this.field424 = false;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (this.field80) {
            this.field424 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field431 = null;
        this.field432 = null;
        this.field333 = null;
        this.field491 = null;
        this.field492 = null;
        this.field493 = null;
        this.field494 = null;
        this.field239 = null;
        this.field240 = null;
        this.field224 = null;
        this.field225 = null;
        this.field71 = null;
        this.field72 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLNHEPCMLW;I)V")
    private final void method79(boolean arg0, class35 arg1, int arg2) {
        if (arg0) {
            this.field140 = arg1.method349();
        }
        int var4 = arg1.method360(168, 8);
        if (var4 < this.field392) {
            for (int var5 = var4; var5 < this.field392; ++var5) {
                this.field102[this.field101++] = this.field393[var5];
            }
        }
        if (var4 > this.field392) {
            signlink.reporterror(this.field137 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field392 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field393[var6];
                class17 var8 = this.field391[var7];
                int var9 = arg1.method360(168, 1);
                if (var9 == 0) {
                    this.field393[this.field392++] = var7;
                    var8.field1561 = field505;
                } else {
                    int var10 = arg1.method360(168, 2);
                    if (var10 == 0) {
                        this.field393[this.field392++] = var7;
                        var8.field1561 = field505;
                        this.field395[this.field394++] = var7;
                    } else if (var10 == 1) {
                        this.field393[this.field392++] = var7;
                        var8.field1561 = field505;
                        int var11 = arg1.method360(168, 3);
                        var8.method548(0, false, var11);
                        int var12 = arg1.method360(168, 1);
                        if (var12 == 1) {
                            this.field395[this.field394++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field393[this.field392++] = var7;
                        var8.field1561 = field505;
                        int var13 = arg1.method360(168, 3);
                        var8.method548(0, true, var13);
                        int var14 = arg1.method360(168, 3);
                        var8.method548(0, true, var14);
                        int var15 = arg1.method360(168, 1);
                        if (var15 == 1) {
                            this.field395[this.field394++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field102[this.field101++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.field449 = 0;
        while (arg0 >= 0) {
            this.field258 = null;
        }
        for (int var2 = -1; var2 < this.field392 + this.field341; ++var2) {
            class58 var19;
            if (var2 == -1) {
                var19 = field446;
            } else if (var2 < this.field392) {
                var19 = this.field391[this.field393[var2]];
            } else {
                var19 = this.field340[this.field342[var2 - this.field392]];
            }
            if (var19 != null && var19.method250(29)) {
                if (var19 instanceof class67) {
                    class12 var20 = ((class67) var19).field1688;
                    if (var20.field738 != null) {
                        var20 = var20.method206(0);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field392) {
                    class12 var23 = ((class67) var19).field1688;
                    if (var23.field745 >= 0 && var23.field745 < this.field113.length) {
                        this.method89(var19, 9, var19.field1606 + 15);
                        if (this.field377 > -1) {
                            this.field113[var23.field745].method594(this.field377 - 12, this.field378 - 30, (byte) 8);
                        }
                    }
                    if (this.field367 == 1 && this.field342[var2 - this.field392] == this.field75 && field505 % 20 < 10) {
                        this.method89(var19, 9, var19.field1606 + 15);
                        if (this.field377 > -1) {
                            this.field398[0].method594(this.field377 - 12, this.field378 - 28, (byte) 8);
                        }
                    }
                } else {
                    int var21 = 30;
                    class17 var22 = (class17) var19;
                    if (var22.field828 != -1 || var22.field810 != -1) {
                        this.method89(var19, 9, var19.field1606 + 15);
                        if (this.field377 > -1) {
                            if (var22.field828 != -1) {
                                this.field307[var22.field828].method594(this.field377 - 12, this.field378 - var21, (byte) 8);
                                var21 += 25;
                            }
                            if (var22.field810 != -1) {
                                this.field113[var22.field810].method594(this.field377 - 12, this.field378 - var21, (byte) 8);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field367 == 10 && this.field393[var2] == this.field112) {
                        this.method89(var19, 9, var19.field1606 + 15);
                        if (this.field377 > -1) {
                            this.field398[1].method594(this.field377 - 12, this.field378 - var21, (byte) 8);
                        }
                    }
                }
                if (var19.field1565 != null && (var2 >= this.field392 || this.field226 == 0 || this.field226 == 3 || this.field226 == 1 && this.method114(-154, ((class17) var19).field830))) {
                    this.method89(var19, 9, var19.field1606);
                    if (this.field377 > -1 && this.field449 < this.field450) {
                        this.field454[this.field449] = this.field429.method215(var19.field1565, (byte) 2) / 2;
                        this.field453[this.field449] = this.field429.field760;
                        this.field451[this.field449] = this.field377;
                        this.field452[this.field449] = this.field378;
                        this.field455[this.field449] = var19.field1568;
                        this.field456[this.field449] = var19.field1583;
                        this.field457[this.field449] = var19.field1558;
                        this.field458[this.field449++] = var19.field1565;
                        if (this.field147 == 0 && var19.field1583 >= 1 && var19.field1583 <= 3) {
                            this.field453[this.field449] += 10;
                            this.field452[this.field449] += 5;
                        }
                        if (this.field147 == 0 && var19.field1583 == 4) {
                            this.field454[this.field449] = 60;
                        }
                        if (this.field147 == 0 && var19.field1583 == 5) {
                            this.field453[this.field449] += 5;
                        }
                    }
                }
                if (var19.field1584 > field505) {
                    this.method89(var19, 9, var19.field1606 + 15);
                    if (this.field377 > -1) {
                        int var24 = var19.field1585 * 30 / var19.field1586;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class36.method393(this.field377 - 15, 65280, 5, this.field378 - 3, 0, var24);
                        class36.method393(this.field377 - 15 + var24, 16711680, 5, this.field378 - 3, 0, 30 - var24);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1594[var25] > field505) {
                        this.method89(var19, 9, var19.field1606 / 2);
                        if (this.field377 > -1) {
                            if (var25 == 1) {
                                this.field378 -= 20;
                            }
                            if (var25 == 2) {
                                this.field377 -= 15;
                                this.field378 -= 10;
                            }
                            if (var25 == 3) {
                                this.field377 += 15;
                                this.field378 -= 10;
                            }
                            this.field495[var19.field1593[var25]].method594(this.field377 - 12, this.field378 - 12, (byte) 8);
                            this.field427.method212(0, this.field377, String.valueOf(var19.field1592[var25]), (byte) 6, this.field378 + 4);
                            this.field427.method212(16777215, this.field377 - 1, String.valueOf(var19.field1592[var25]), (byte) 6, this.field378 + 3);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field449; ++var3) {
            int var4 = this.field451[var3];
            int var5 = this.field452[var3];
            int var6 = this.field454[var3];
            int var7 = this.field453[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field452[var18] - this.field453[var18] && var5 - var7 < this.field452[var18] + 2 && var4 - var6 < this.field454[var18] + this.field451[var18] && var4 + var6 > this.field451[var18] - this.field454[var18] && this.field452[var18] - this.field453[var18] < var5) {
                        var5 = this.field452[var18] - this.field453[var18];
                        var8 = true;
                    }
                }
            }
            this.field377 = this.field451[var3];
            this.field378 = this.field452[var3] = var5;
            String var9 = this.field458[var3];
            if (this.field147 == 0) {
                int var10 = 16776960;
                if (this.field455[var3] < 6) {
                    var10 = this.field380[this.field455[var3]];
                }
                if (this.field455[var3] == 6) {
                    var10 = this.field272 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field455[var3] == 7) {
                    var10 = this.field272 % 20 < 10 ? 255 : 65535;
                }
                if (this.field455[var3] == 8) {
                    var10 = this.field272 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field455[var3] == 9) {
                    int var11 = 150 - this.field457[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field455[var3] == 10) {
                    int var12 = 150 - this.field457[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field455[var3] == 11) {
                    int var13 = 150 - this.field457[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field456[var3] == 0) {
                    this.field429.method212(0, this.field377, var9, (byte) 6, this.field378 + 1);
                    this.field429.method212(var10, this.field377, var9, (byte) 6, this.field378);
                }
                if (this.field456[var3] == 1) {
                    this.field429.method217(this.field272, this.field378 + 1, 0, this.field377, -987, var9);
                    this.field429.method217(this.field272, this.field378, var10, this.field377, -987, var9);
                }
                if (this.field456[var3] == 2) {
                    this.field429.method218(var9, this.field377, -330, this.field378 + 1, this.field272, 0);
                    this.field429.method218(var9, this.field377, -330, this.field378, this.field272, var10);
                }
                if (this.field456[var3] == 3) {
                    this.field429.method219(150 - this.field457[var3], this.field272, this.field377, 0, false, var9, this.field378 + 1);
                    this.field429.method219(150 - this.field457[var3], this.field272, this.field377, var10, false, var9, this.field378);
                }
                if (this.field456[var3] == 4) {
                    int var14 = this.field429.method215(var9, (byte) 2);
                    int var15 = (150 - this.field457[var3]) * (var14 + 100) / 150;
                    class36.method390(this.field377 - 50, 334, (byte) 98, 0, this.field377 + 50);
                    this.field429.method216(var9, this.field377 + 50 - var15, (byte) 2, this.field378 + 1, 0);
                    this.field429.method216(var9, this.field377 + 50 - var15, (byte) 2, this.field378, var10);
                    class36.method389(15);
                }
                if (this.field456[var3] == 5) {
                    int var16 = 150 - this.field457[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class36.method390(0, this.field378 + 5, (byte) 98, this.field378 - this.field429.field760 - 1, 512);
                    this.field429.method212(0, this.field377, var9, (byte) 6, this.field378 + 1 + var17);
                    this.field429.method212(var10, this.field377, var9, (byte) 6, this.field378 + var17);
                    class36.method389(15);
                }
            } else {
                this.field429.method212(0, this.field377, var9, (byte) 6, this.field378 + 1);
                this.field429.method212(16776960, this.field377, var9, (byte) 6, this.field378);
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method81(int arg0) {
        if (this.field157 == null) {
            super.field535 = null;
            this.field190 = null;
            this.field188 = null;
            this.field187 = null;
            this.field189 = null;
            this.field369 = null;
            this.field370 = null;
            if (arg0 != 6) {
                this.field365.method339(123);
            }
            this.field371 = null;
            this.field160 = new class56(265, 5, 128, this.method92(true));
            class36.method391(7);
            this.field161 = new class56(265, 5, 128, this.method92(true));
            class36.method391(7);
            this.field157 = new class56(171, 5, 509, this.method92(true));
            class36.method391(7);
            this.field158 = new class56(132, 5, 360, this.method92(true));
            class36.method391(7);
            this.field159 = new class56(200, 5, 360, this.method92(true));
            class36.method391(7);
            this.field162 = new class56(238, 5, 202, this.method92(true));
            class36.method391(7);
            this.field163 = new class56(238, 5, 203, this.method92(true));
            class36.method391(7);
            this.field164 = new class56(94, 5, 74, this.method92(true));
            class36.method391(7);
            this.field165 = new class56(94, 5, 75, this.method92(true));
            class36.method391(7);
            if (this.field288 != null) {
                this.method56((byte) 30);
                this.method141(669);
            }
            this.field256 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLHZINZKXF;I)I")
    public final int method82(byte arg0, class20 arg1, int arg2) {
        if (arg0 != 65) {
            this.field366 = -140;
        }
        if (arg1.field962 != null && arg2 < arg1.field962.length) {
            try {
                int[] var4 = arg1.field962[arg2];
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
                        var9 = this.field403[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field477[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field107[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class20 var11 = class20.method269(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class19.field873 && (!class19.method254(var12).field859 || field466)) {
                            for (int var13 = 0; var13 < var11.field946.length; ++var13) {
                                if (var12 + 1 == var11.field946[var13]) {
                                    var9 += var11.field944[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field134[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field304[this.field477[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field134[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field446.field819;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class40.field1204; ++var14) {
                            if (class40.field1206[var14]) {
                                var9 += this.field477[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class20 var15 = class20.method269(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class19.field873 && (!class19.method254(var16).field859 || field466)) {
                            for (int var17 = 0; var17 < var15.field946.length; ++var17) {
                                if (var15.field946[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field51;
                    }
                    if (var8 == 12) {
                        var9 = this.field318;
                    }
                    if (var8 == 13) {
                        int var18 = this.field134[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class39 var21 = class39.field1195[var20];
                        int var22 = var21.field1197;
                        int var23 = var21.field1198;
                        int var24 = var21.field1199;
                        int var25 = field405[var24 - var23];
                        var9 = this.field134[var22] >> var23 & var25;
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
                        var9 = (field446.field1601 >> 7) + this.field290;
                    }
                    if (var8 == 19) {
                        var9 = (field446.field1602 >> 7) + this.field291;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILNHEPCMLW;I)V")
    private final void method83(int arg0, class35 arg1, int arg2) {
        while (arg2 >= 0) {
            this.field105 = -225;
        }
        while (arg1.field1108 + 21 < arg0 * 8) {
            int var4 = arg1.method360(168, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field340[var4] == null) {
                this.field340[var4] = new class67();
            }
            class67 var5 = this.field340[var4];
            this.field342[this.field341++] = var4;
            var5.field1561 = field505;
            int var6 = arg1.method360(168, 1);
            int var7 = arg1.method360(168, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method360(168, 1);
            if (var8 == 1) {
                this.field395[this.field394++] = var4;
            }
            int var9 = arg1.method360(168, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.field1688 = class12.method203(arg1.method360(168, 12));
            var5.field1571 = var5.field1688.field736;
            var5.field1605 = var5.field1688.field728;
            var5.field1595 = var5.field1688.field714;
            var5.field1596 = var5.field1688.field739;
            var5.field1597 = var5.field1688.field713;
            var5.field1598 = var5.field1688.field725;
            var5.field1599 = var5.field1688.field747;
            var5.method547((byte) 9, field446.field1559[0] + var9, field446.field1560[0] + var7, var6 == 1);
        }
        arg1.method361(this.field520);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZJ)V")
    public final void method84(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field489 >= 100 && this.field77 != 1) {
                this.method106("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else if (this.field489 >= 200) {
                this.method106("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else {
                String var4 = class51.method508(class51.method505(4, arg1), 0);
                for (int var5 = 0; var5 < this.field489; ++var5) {
                    if (this.field93[var5] == arg1) {
                        this.method106("", 0, var4 + " is already on your friend list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field460; ++var6) {
                    if (this.field41[var6] == arg1) {
                        this.method106("", 0, "Please remove " + var4 + " from your ignore list first", 0);
                        return;
                    }
                }
                if (arg0) {
                    this.field140 = this.field423.method349();
                }
                if (!var4.equals(field446.field830)) {
                    this.field109[this.field489] = var4;
                    this.field93[this.field489] = arg1;
                    this.field253[this.field489] = 0;
                    ++this.field489;
                    this.field135 = true;
                    this.field365.method338(240, 10041);
                    this.field365.method345(arg1, (byte) 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method85(boolean arg0, int arg1) {
        int var3 = class32.field1065[arg1].field1073;
        if (var3 != 0) {
            int var4 = this.field134[arg1];
            if (arg0) {
                if (var3 == 1) {
                    if (var4 == 1) {
                        class62.method565(22698, 0.9D);
                    }
                    if (var4 == 2) {
                        class62.method565(22698, 0.8D);
                    }
                    if (var4 == 3) {
                        class62.method565(22698, 0.7D);
                    }
                    if (var4 == 4) {
                        class62.method565(22698, 0.6D);
                    }
                    class19.field866.method588();
                    this.field256 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field167;
                    if (var4 == 0) {
                        this.method51(0, this.field167, -930);
                        this.field167 = true;
                    }
                    if (var4 == 1) {
                        this.method51(-400, this.field167, -930);
                        this.field167 = true;
                    }
                    if (var4 == 2) {
                        this.method51(-800, this.field167, -930);
                        this.field167 = true;
                    }
                    if (var4 == 3) {
                        this.method51(-1200, this.field167, -930);
                        this.field167 = true;
                    }
                    if (var4 == 4) {
                        this.field167 = false;
                    }
                    if (this.field167 != var5 && !field467) {
                        if (this.field167) {
                            this.field168 = this.field156;
                            this.field169 = true;
                            this.field40.method532(2, this.field168);
                        } else {
                            this.method19(0);
                        }
                        this.field316 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field248 = true;
                        this.method22(0, 0);
                    }
                    if (var4 == 1) {
                        this.field248 = true;
                        this.method22(-400, 0);
                    }
                    if (var4 == 2) {
                        this.field248 = true;
                        this.method22(-800, 0);
                    }
                    if (var4 == 3) {
                        this.field248 = true;
                        this.method22(-1200, 0);
                    }
                    if (var4 == 4) {
                        this.field248 = false;
                    }
                }
                if (var3 == 5) {
                    this.field62 = var4;
                }
                if (var3 == 6) {
                    this.field147 = var4;
                }
                if (var3 == 8) {
                    this.field310 = var4;
                    this.field265 = true;
                }
                if (var3 == 9) {
                    this.field504 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method86(String arg0) throws IOException {
        if (!this.field245) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field349 != null) {
                try {
                    this.field349.close();
                } catch (Exception var4) {
                }
                this.field349 = null;
            }
            this.field349 = this.method139(43595);
            this.field349.setSoTimeout(10000);
            InputStream var2 = this.field349.getInputStream();
            OutputStream var3 = this.field349.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILHZINZKXF;IIII)V")
    public final void method87(int arg0, int arg1, int arg2, class20 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3.field894 == 0 && arg3.field950 != null && !arg3.field904) {
            if (arg1 >= arg4 && arg5 >= arg2 && arg1 <= arg3.field923 + arg4 && arg5 <= arg3.field895 + arg2) {
                int var9 = arg3.field950.length;
                this.field139 += arg0;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg3.field941[var10] + arg4;
                    int var12 = arg3.field906[var10] + arg2 - arg6;
                    class20 var13 = class20.method269(arg3.field950[var10]);
                    int var14 = var13.field964 + var11;
                    int var15 = var13.field943 + var12;
                    if ((var13.field967 >= 0 || var13.field915 != 0) && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field923 + var14 && arg5 < var13.field895 + var15) {
                        if (var13.field967 >= 0) {
                            this.field373 = var13.field967;
                        } else {
                            this.field373 = var13.field898;
                        }
                    }
                    if (var13.field894 == 8 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field923 + var14 && arg5 < var13.field895 + var15) {
                        this.field361 = var13.field898;
                    }
                    if (var13.field894 == 0) {
                        this.method87(0, arg1, var15, var13, var14, arg5, var13.field903, arg7);
                        if (var13.field926 > var13.field895) {
                            this.method61(arg1, arg7, var13.field895, var13.field923 + var14, arg5, var15, var13, 7, var13.field926);
                        }
                    } else {
                        if (var13.field953 == 1 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field923 + var14 && arg5 < var13.field895 + var15) {
                            boolean var16 = false;
                            if (var13.field961 != 0) {
                                var16 = this.method59(0, var13);
                            }
                            if (!var16) {
                                this.field166[this.field521] = var13.field952;
                                this.field237[this.field521] = 623;
                                this.field236[this.field521] = var13.field898;
                                ++this.field521;
                            }
                        }
                        if (var13.field953 == 2 && this.field171 == 0 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field923 + var14 && arg5 < var13.field895 + var15) {
                            String var17 = var13.field951;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field166[this.field521] = var17 + " @gre@" + var13.field896;
                            this.field237[this.field521] = 943;
                            this.field236[this.field521] = var13.field898;
                            ++this.field521;
                        }
                        if (var13.field953 == 3 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field923 + var14 && arg5 < var13.field895 + var15) {
                            this.field166[this.field521] = "Close";
                            if (arg7 == 3) {
                                this.field237[this.field521] = 107;
                            } else {
                                this.field237[this.field521] = 504;
                            }
                            this.field236[this.field521] = var13.field898;
                            ++this.field521;
                        }
                        if (var13.field953 == 4 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field923 + var14 && arg5 < var13.field895 + var15) {
                            this.field166[this.field521] = var13.field952;
                            this.field237[this.field521] = 48;
                            this.field236[this.field521] = var13.field898;
                            ++this.field521;
                        }
                        if (var13.field953 == 5 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field923 + var14 && arg5 < var13.field895 + var15) {
                            this.field166[this.field521] = var13.field952;
                            this.field237[this.field521] = 597;
                            this.field236[this.field521] = var13.field898;
                            ++this.field521;
                        }
                        if (var13.field953 == 6 && !this.field185 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field923 + var14 && arg5 < var13.field895 + var15) {
                            this.field166[this.field521] = var13.field952;
                            this.field237[this.field521] = 214;
                            this.field236[this.field521] = var13.field898;
                            ++this.field521;
                        }
                        if (var13.field894 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field895; ++var19) {
                                for (int var20 = 0; var20 < var13.field923; ++var20) {
                                    int var21 = (var13.field921 + 32) * var20 + var14;
                                    int var22 = (var13.field892 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field933[var18];
                                        var22 += var13.field930[var18];
                                    }
                                    if (arg1 >= var21 && arg5 >= var22 && arg1 < var21 + 32 && arg5 < var22 + 32) {
                                        this.field330 = var18;
                                        this.field331 = var13.field898;
                                        if (var13.field946[var18] > 0) {
                                            class19 var23 = class19.method254(var13.field946[var18] - 1);
                                            if (this.field480 == 1 && var13.field917) {
                                                if (this.field482 != var13.field898 || this.field481 != var18) {
                                                    this.field166[this.field521] = "Use " + this.field484 + " with @lre@" + var23.field882;
                                                    this.field237[this.field521] = 320;
                                                    this.field238[this.field521] = var23.field869;
                                                    this.field235[this.field521] = var18;
                                                    this.field236[this.field521] = var13.field898;
                                                    ++this.field521;
                                                }
                                            } else if (this.field171 == 1 && var13.field917) {
                                                if ((this.field173 & 16) == 16) {
                                                    this.field166[this.field521] = this.field174 + " @lre@" + var23.field882;
                                                    this.field237[this.field521] = 460;
                                                    this.field238[this.field521] = var23.field869;
                                                    this.field235[this.field521] = var18;
                                                    this.field236[this.field521] = var13.field898;
                                                    ++this.field521;
                                                }
                                            } else {
                                                if (var13.field917) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field871 != null && var23.field871[var24] != null) {
                                                            this.field166[this.field521] = var23.field871[var24] + " @lre@" + var23.field882;
                                                            if (var24 == 3) {
                                                                this.field237[this.field521] = 478;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field237[this.field521] = 170;
                                                            }
                                                            this.field238[this.field521] = var23.field869;
                                                            this.field235[this.field521] = var18;
                                                            this.field236[this.field521] = var13.field898;
                                                            ++this.field521;
                                                        } else if (var24 == 4) {
                                                            this.field166[this.field521] = "Drop @lre@" + var23.field882;
                                                            this.field237[this.field521] = 170;
                                                            this.field238[this.field521] = var23.field869;
                                                            this.field235[this.field521] = var18;
                                                            this.field236[this.field521] = var13.field898;
                                                            ++this.field521;
                                                        }
                                                    }
                                                }
                                                if (var13.field945) {
                                                    this.field166[this.field521] = "Use @lre@" + var23.field882;
                                                    this.field237[this.field521] = 87;
                                                    this.field238[this.field521] = var23.field869;
                                                    this.field235[this.field521] = var18;
                                                    this.field236[this.field521] = var13.field898;
                                                    ++this.field521;
                                                }
                                                if (var13.field917 && var23.field871 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field871[var25] != null) {
                                                            this.field166[this.field521] = var23.field871[var25] + " @lre@" + var23.field882;
                                                            if (var25 == 0) {
                                                                this.field237[this.field521] = 641;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field237[this.field521] = 546;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field237[this.field521] = 129;
                                                            }
                                                            this.field238[this.field521] = var23.field869;
                                                            this.field235[this.field521] = var18;
                                                            this.field236[this.field521] = var13.field898;
                                                            ++this.field521;
                                                        }
                                                    }
                                                }
                                                if (var13.field954 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field954[var26] != null) {
                                                            this.field166[this.field521] = var13.field954[var26] + " @lre@" + var23.field882;
                                                            if (var26 == 0) {
                                                                this.field237[this.field521] = 940;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field237[this.field521] = 905;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field237[this.field521] = 96;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field237[this.field521] = 513;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field237[this.field521] = 133;
                                                            }
                                                            this.field238[this.field521] = var23.field869;
                                                            this.field235[this.field521] = var18;
                                                            this.field236[this.field521] = var13.field898;
                                                            ++this.field521;
                                                        }
                                                    }
                                                }
                                                this.field166[this.field521] = "Examine @lre@" + var23.field882;
                                                this.field237[this.field521] = 1187;
                                                this.field238[this.field521] = var23.field869;
                                                this.field235[this.field521] = var18;
                                                this.field236[this.field521] = var13.field898;
                                                ++this.field521;
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

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method88(boolean arg0) {
        if (this.field376 > 1) {
            --this.field376;
        }
        if (this.field143 > 0) {
            --this.field143;
        }
        for (int var2 = 0; var2 < 5 && this.method149(-549); ++var2) {
        }
        if (this.field410) {
            Object var3 = this.field74.field1058;
            synchronized (this.field74.field1058) {
                if (!field488) {
                    this.field74.field1059 = 0;
                } else if (super.field548 != 0 || this.field74.field1059 >= 40) {
                    this.field365.method338(239, 10041);
                    this.field365.method339(0);
                    int var4 = this.field365.field1107;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field74.field1059 && var4 - this.field365.field1107 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field74.field1056[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field74.field1057[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field74.field1056[var6] == -1 && this.field74.field1057[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field268 == var8 && this.field269 == var7) {
                            if (this.field78 < 2047) {
                                ++this.field78;
                            }
                        } else {
                            int var10 = var8 - this.field268;
                            this.field268 = var8;
                            int var11 = var7 - this.field269;
                            this.field269 = var7;
                            if (this.field78 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field365.method340((this.field78 << 12) + (var10 << 6) + var11);
                                this.field78 = 0;
                            } else if (this.field78 < 8) {
                                this.field365.method342((this.field78 << 19) + 8388608 + var9);
                                this.field78 = 0;
                            } else {
                                this.field365.method343((this.field78 << 19) + -1073741824 + var9);
                                this.field78 = 0;
                            }
                        }
                    }
                    this.field365.method348(6, this.field365.field1107 - var4);
                    if (var5 >= this.field74.field1059) {
                        this.field74.field1059 = 0;
                    } else {
                        this.field74.field1059 -= var5;
                        for (int var12 = 0; var12 < this.field74.field1059; ++var12) {
                            this.field74.field1057[var12] = this.field74.field1057[var5 + var12];
                            this.field74.field1056[var12] = this.field74.field1056[var5 + var12];
                        }
                    }
                }
            }
            if (super.field548 != 0) {
                long var13 = (super.field551 - this.field399) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field399 = super.field551;
                int var15 = super.field550;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field549;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field548 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field365.method338(254, 10041);
                this.field365.method381((var18 << 19) + (var19 << 20) + var17, 451);
            }
            if (this.field347 > 0) {
                --this.field347;
            }
            if (super.field552[1] == 1 || super.field552[2] == 1 || super.field552[3] == 1 || super.field552[4] == 1) {
                this.field348 = true;
            }
            if (this.field348 && this.field347 <= 0) {
                this.field347 = 20;
                this.field348 = false;
                this.field365.method338(178, 10041);
                this.field365.method374(this.field325, this.field170);
                this.field365.method374(this.field324, this.field170);
            }
            if (super.field539 && !this.field433) {
                this.field433 = true;
                this.field365.method338(217, 10041);
                this.field365.method339(1);
            }
            if (!super.field539 && this.field433) {
                this.field433 = false;
                this.field365.method338(217, 10041);
                this.field365.method339(0);
            }
            this.method37((byte) 0);
            this.method75(this.field497);
            this.method107(false);
            ++field296;
            if (field296 > 1013) {
                field296 = 0;
                this.field365.method338(144, 10041);
                this.field365.method339(0);
                int var20 = this.field365.field1107;
                this.field365.method339((int) (Math.random() * 256.0D));
                this.field365.method339(84);
                this.field365.method340(36060);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field365.method339(57);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field365.method339(112);
                }
                this.field365.method340(63934);
                this.field365.method339((int) (Math.random() * 256.0D));
                this.field365.method340((int) (Math.random() * 65536.0D));
                this.field365.method340((int) (Math.random() * 65536.0D));
                this.field365.method340(29666);
                this.field365.method348(6, this.field365.field1107 - var20);
            }
            ++this.field141;
            if (this.field141 > 750) {
                this.method58(324);
            }
            this.method39(63);
            this.method62(792);
            this.method42(this.field105);
            ++this.field281;
            if (this.field61 != 0) {
                this.field60 += 20;
                if (this.field60 >= 400) {
                    this.field61 = 0;
                }
            }
            if (this.field85 != 0) {
                ++this.field82;
                if (this.field82 >= 15) {
                    if (this.field85 == 2) {
                        this.field135 = true;
                    }
                    if (this.field85 == 3) {
                        this.field265 = true;
                    }
                    this.field85 = 0;
                }
            }
            if (this.field278 != 0) {
                ++this.field223;
                if (super.field542 > this.field279 + 5 || super.field542 < this.field279 - 5 || super.field543 > this.field280 + 5 || super.field543 < this.field280 - 5) {
                    this.field263 = true;
                }
                if (super.field541 == 0) {
                    if (this.field278 == 2) {
                        this.field135 = true;
                    }
                    if (this.field278 == 3) {
                        this.field265 = true;
                    }
                    this.field278 = 0;
                    if (this.field263 && this.field223 >= 5) {
                        this.field331 = -1;
                        this.method126(-4);
                        if (this.field331 == this.field276 && this.field330 != this.field277) {
                            class20 var21 = class20.method269(this.field276);
                            byte var22 = 0;
                            if (this.field504 == 1 && var21.field961 == 206) {
                                var22 = 1;
                            }
                            if (var21.field946[this.field330] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field925) {
                                int var23 = this.field277;
                                int var24 = this.field330;
                                var21.field946[var24] = var21.field946[var23];
                                var21.field944[var24] = var21.field944[var23];
                                var21.field946[var23] = -1;
                                var21.field944[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field277;
                                int var26 = this.field330;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method272(var25, 33171, var25 - 1);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method272(var25, 33171, var25 + 1);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method272(this.field277, 33171, this.field330);
                            }
                            this.field365.method338(26, 10041);
                            this.field365.method365(var22, this.field442);
                            this.field365.method374(this.field276, this.field170);
                            this.field365.method372(this.field330, this.field81);
                            this.field365.method340(this.field277);
                        }
                    } else if ((this.field62 == 1 || this.method28(this.field521 - 1, (byte) -19)) && this.field521 > 2) {
                        this.method119(-1729);
                    } else if (this.field521 > 0) {
                        this.method55(this.field521 - 1, true);
                    }
                    this.field82 = 10;
                    super.field548 = 0;
                }
            }
            if (class49.field1424 != -1) {
                int var27 = class49.field1424;
                int var28 = class49.field1425;
                boolean var29 = this.method6(0, var28, field446.field1560[0], true, 0, 0, 0, var27, 0, field446.field1559[0], false, 0);
                class49.field1424 = -1;
                if (var29) {
                    this.field58 = super.field549;
                    this.field59 = super.field550;
                    this.field61 = 1;
                    this.field60 = 0;
                }
            }
            if (super.field548 == 1 && this.field435 != null) {
                this.field435 = null;
                this.field265 = true;
                super.field548 = 0;
            }
            this.method105(126);
            if (!arg0) {
                this.method116();
            }
            if (this.field197 == -1) {
                this.method109(-12166);
                this.method133(1);
                this.method98((byte) 0);
            }
            if (super.field541 == 1 || super.field548 == 1) {
                ++this.field98;
            }
            if (this.field251 == 0 && this.field295 == 0 && this.field436 == 0) {
                if (this.field357 > 0) {
                    --this.field357;
                }
            } else if (this.field357 < 100) {
                ++this.field357;
                if (this.field357 == 100) {
                    if (this.field251 != 0) {
                        this.field265 = true;
                    }
                    if (this.field295 != 0) {
                        this.field135 = true;
                    }
                }
            }
            if (this.field273 == 2) {
                this.method36(0);
            }
            if (this.field273 == 2 && this.field383) {
                this.method8((byte) -48);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field384[var30]++;
            }
            this.method95(-359);
            ++field155;
            if (field155 > 1016) {
                field155 = 0;
                this.field365.method338(49, 10041);
                this.field365.method339(0);
                int var31 = this.field365.field1107;
                this.field365.method340(16080);
                this.field365.method340((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field365.method339(254);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field365.method340(4084);
                }
                this.field365.method339(160);
                this.field365.method339(246);
                this.field365.method339(124);
                this.field365.method339((int) (Math.random() * 256.0D));
                this.field365.method340((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field365.method340(59156);
                }
                this.field365.method348(6, this.field365.field1107 - var31);
            }
            ++super.field540;
            if (super.field540 > 4500) {
                this.field143 = 250;
                super.field540 -= 500;
                this.field365.method338(195, 10041);
            }
            ++this.field212;
            if (this.field212 > 500) {
                this.field212 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field90 += this.field91;
                }
                if ((var32 & 2) == 2) {
                    this.field485 += this.field486;
                }
                if ((var32 & 4) == 4) {
                    this.field121 += this.field122;
                }
            }
            if (this.field90 < -50) {
                this.field91 = 2;
            }
            if (this.field90 > 50) {
                this.field91 = -2;
            }
            if (this.field485 < -55) {
                this.field486 = 2;
            }
            if (this.field485 > 55) {
                this.field486 = -2;
            }
            if (this.field121 < -40) {
                this.field122 = 1;
            }
            if (this.field121 > 40) {
                this.field122 = -1;
            }
            ++this.field255;
            if (this.field255 > 500) {
                this.field255 = 0;
                int var33 = (int) (Math.random() * 8.0D);
                if ((var33 & 1) == 1) {
                    this.field308 += this.field309;
                }
                if ((var33 & 2) == 2) {
                    this.field301 += this.field302;
                }
            }
            if (this.field308 < -60) {
                this.field309 = 2;
            }
            if (this.field308 > 60) {
                this.field309 = -2;
            }
            if (this.field301 < -20) {
                this.field302 = 1;
            }
            if (this.field301 > 10) {
                this.field302 = -1;
            }
            ++this.field142;
            if (this.field142 > 50) {
                this.field365.method338(37, 10041);
            }
            try {
                if (this.field146 != null && this.field365.field1107 > 0) {
                    this.field146.method582(this.field365.field1106, this.field365.field1107, 29470, 0);
                    this.field365.field1107 = 0;
                    this.field142 = 0;
                }
            } catch (IOException var35) {
                this.method58(324);
            } catch (Exception var36) {
                this.method144((byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXETERYIW;II)V")
    public final void method89(class58 arg0, int arg1, int arg2) {
        this.method90(arg0.field1602, arg0.field1601, true, arg2);
        if (arg1 < 9 || arg1 > 9) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)V")
    public final void method90(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
            int var5 = this.method52(this.field97, arg0, -430, arg1) - arg3;
            int var6 = arg1 - this.field66;
            int var7 = var5 - this.field67;
            this.field410 &= arg2;
            int var8 = arg0 - this.field68;
            int var9 = class4.field632[this.field69];
            int var10 = class4.field633[this.field69];
            int var11 = class4.field632[this.field70];
            int var12 = class4.field633[this.field70];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field377 = (var13 << 9) / var17 + class62.field1638;
                this.field378 = (var16 << 9) / var17 + class62.field1639;
            } else {
                this.field377 = -1;
                this.field378 = -1;
            }
        } else {
            this.field377 = -1;
            this.field378 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public void method91(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field469);
        if (this.field40 != null) {
            System.out.println("Od-cycle:" + this.field40.field1519);
        }
        System.out.println("loop-cycle:" + field505);
        if (!arg0) {
            this.method116();
        }
        System.out.println("draw-cycle:" + field244);
        System.out.println("ptype:" + this.field140);
        System.out.println("psize:" + this.field139);
        if (this.field146 != null) {
            this.field146.method583(true);
        }
        super.field531 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method92(boolean arg0) {
        this.field410 &= arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field537 != null ? super.field537 : this;
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method93(int arg0) {
        this.method115(true);
        if (arg0 < 0) {
            if (this.field61 == 1) {
                this.field516[this.field60 / 100].method594(this.field58 - 8 - 4, this.field59 - 8 - 4, (byte) 8);
            }
            if (this.field61 == 2) {
                this.field516[this.field60 / 100 + 4].method594(this.field58 - 8 - 4, this.field59 - 8 - 4, (byte) 8);
            }
            if (this.field45 != -1) {
                this.method123(this.field45, false, this.field281);
                this.method13(true, 0, 0, class20.method269(this.field45), 0);
            }
            if (this.field312 != -1) {
                this.method123(this.field312, false, this.field281);
                this.method13(true, 0, 0, class20.method269(this.field312), 0);
            }
            this.method124(-231);
            if (!this.field152) {
                this.method126(-4);
                this.method7(true);
            } else if (this.field115 == 0) {
                this.method108(true);
            }
            if (this.field129 == 1) {
                this.field37.method594(472, 296, (byte) 8);
            }
            if (field108) {
                short var2 = 507;
                byte var3 = 20;
                int var4 = 16776960;
                if (super.field530 < 30 && field467) {
                    var4 = 16711680;
                }
                if (super.field530 < 20 && !field467) {
                    var4 = 16711680;
                }
                this.field428.method211(var2, false, var3, "Fps:" + super.field530, var4);
                int var13 = var3 + 15;
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                int var7 = 16776960;
                if (var6 > 33554432 && field467) {
                    int var8 = 16711680;
                }
                if (var6 > 67108864 && !field467) {
                    int var9 = 16711680;
                }
                this.field428.method211(var2, false, var13, "Mem:" + var6 + "k", 16776960);
                var13 += 15;
            }
            if (this.field376 != 0) {
                int var10 = this.field376 / 50;
                int var11 = var10 / 60;
                int var12 = var10 % 60;
                if (var12 < 10) {
                    this.field428.method216("System update in: " + var11 + ":0" + var12, 4, (byte) 2, 329, 16776960);
                } else {
                    this.field428.method216("System update in: " + var11 + ":" + var12, 4, (byte) 2, 329, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method94(int arg0) {
        short var2 = 256;
        if (this.field299 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field299 > 768) {
                    this.field491[var3] = this.method9(this.field493[var3], (byte) 5, 1024 - this.field299, this.field492[var3]);
                } else if (this.field299 > 256) {
                    this.field491[var3] = this.field493[var3];
                } else {
                    this.field491[var3] = this.method9(this.field492[var3], (byte) 5, 256 - this.field299, this.field493[var3]);
                }
            }
        } else if (this.field300 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field300 > 768) {
                    this.field491[var4] = this.method9(this.field494[var4], (byte) 5, 1024 - this.field300, this.field492[var4]);
                } else if (this.field300 > 256) {
                    this.field491[var4] = this.field494[var4];
                } else {
                    this.field491[var4] = this.method9(this.field492[var4], (byte) 5, 256 - this.field300, this.field494[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field491[var5] = this.field492[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field160.field1542[var6] = this.field71.field1724[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field243[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field224[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field491[var26];
                    int var30 = this.field160.field1542[var8];
                    this.field160.field1542[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 == 5429) {
            this.field160.method536(0, 5, 0, super.field534);
            for (int var10 = 0; var10 < 33920; ++var10) {
                this.field161.field1542[var10] = this.field72.field1724[var10];
            }
            int var11 = 0;
            int var12 = 1176;
            for (int var13 = 1; var13 < var2 - 1; ++var13) {
                int var14 = (var2 - var13) * this.field243[var13] / var2;
                int var15 = 103 - var14;
                int var16 = var12 + var14;
                for (int var17 = 0; var17 < var15; ++var17) {
                    int var18 = this.field224[var11++];
                    if (var18 != 0) {
                        int var20 = 256 - var18;
                        int var21 = this.field491[var18];
                        int var22 = this.field161.field1542[var16];
                        this.field161.field1542[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                    } else {
                        ++var16;
                    }
                }
                var11 += 128 - var15;
                var12 = 128 - var15 - var14 + var16;
            }
            this.field161.method536(637, 5, 0, super.field534);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method95(int arg0) {
        if (arg0 < 0) {
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method155(-520);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field312 != -1 && this.field476 == this.field312) {
                            if (var2 == 8 && this.field266.length() > 0) {
                                this.field266 = this.field266.substring(0, this.field266.length() - 1);
                            }
                            break;
                        }
                        if (this.field356) {
                            if (var2 >= 32 && var2 <= 122 && this.field463.length() < 80) {
                                this.field463 = this.field463 + (char) var2;
                                this.field265 = true;
                            }
                            if (var2 == 8 && this.field463.length() > 0) {
                                this.field463 = this.field463.substring(0, this.field463.length() - 1);
                                this.field265 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field356 = false;
                                this.field265 = true;
                                if (this.field317 == 1) {
                                    long var3 = class51.method504(this.field463);
                                    this.method84(false, var3);
                                }
                                if (this.field317 == 2 && this.field489 > 0) {
                                    long var5 = class51.method504(this.field463);
                                    this.method50(-33590, var5);
                                }
                                if (this.field317 == 3 && this.field463.length() > 0) {
                                    this.field365.method338(201, 10041);
                                    this.field365.method339(0);
                                    int var7 = this.field365.field1107;
                                    this.field365.method345(this.field259, (byte) 7);
                                    class30.method332(6, this.field365, this.field463);
                                    this.field365.method348(6, this.field365.field1107 - var7);
                                    this.field463 = class30.method333(this.field328, this.field463);
                                    this.field463 = class27.method302(this.field328, this.field463);
                                    this.method106(class51.method508(class51.method505(4, this.field259), 0), 0, this.field463, 6);
                                    if (this.field196 == 2) {
                                        this.field196 = 1;
                                        this.field462 = true;
                                        this.field365.method338(100, 10041);
                                        this.field365.method339(this.field226);
                                        this.field365.method339(this.field196);
                                        this.field365.method339(this.field178);
                                    }
                                }
                                if (this.field317 == 4 && this.field460 < 100) {
                                    long var8 = class51.method504(this.field463);
                                    this.method24((byte) 8, var8);
                                }
                                if (this.field317 == 5 && this.field460 > 0) {
                                    long var10 = class51.method504(this.field463);
                                    this.method10(true, var10);
                                }
                            }
                        } else if (this.field191 == 1) {
                            if (var2 >= 48 && var2 <= 57 && this.field96.length() < 10) {
                                this.field96 = this.field96 + (char) var2;
                                this.field265 = true;
                            }
                            if (var2 == 8 && this.field96.length() > 0) {
                                this.field96 = this.field96.substring(0, this.field96.length() - 1);
                                this.field265 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field96.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field96);
                                    } catch (Exception var22) {
                                    }
                                    this.field365.method338(146, 10041);
                                    this.field365.method343(var12);
                                }
                                this.field191 = 0;
                                this.field265 = true;
                            }
                        } else if (this.field191 == 2) {
                            if (var2 >= 32 && var2 <= 122 && this.field96.length() < 12) {
                                this.field96 = this.field96 + (char) var2;
                                this.field265 = true;
                            }
                            if (var2 == 8 && this.field96.length() > 0) {
                                this.field96 = this.field96.substring(0, this.field96.length() - 1);
                                this.field265 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field96.length() > 0) {
                                    this.field365.method338(98, 10041);
                                    this.field365.method345(class51.method504(this.field96), (byte) 7);
                                }
                                this.field191 = 0;
                                this.field265 = true;
                            }
                        } else if (this.field338 == -1 && this.field197 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field372.length() < 80) {
                                this.field372 = this.field372 + (char) var2;
                                this.field265 = true;
                            }
                            if (var2 == 8 && this.field372.length() > 0) {
                                this.field372 = this.field372.substring(0, this.field372.length() - 1);
                                this.field265 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field372.length() > 0) {
                                if (this.field95 == 2) {
                                    if (this.field372.equals("::clientdrop")) {
                                        this.method58(324);
                                    }
                                    if (this.field372.equals("::lag")) {
                                        this.method91(true);
                                    }
                                    if (this.field372.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field40.method533(-559, 2); ++var13) {
                                            this.field40.method522(0, 2, var13, (byte) 1);
                                        }
                                    }
                                    if (this.field372.equals("::fpson")) {
                                        field108 = true;
                                    }
                                    if (this.field372.equals("::fpsoff")) {
                                        field108 = false;
                                    }
                                    if (this.field372.equals("::noclip")) {
                                        for (int var14 = 0; var14 < 4; ++var14) {
                                            for (int var15 = 1; var15 < 103; ++var15) {
                                                for (int var16 = 1; var16 < 103; ++var16) {
                                                    this.field221[var14].field691[var15][var16] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (this.field372.startsWith("::")) {
                                    this.field365.method338(247, 10041);
                                    this.field365.method339(this.field372.length() - 1);
                                    this.field365.method346(this.field372.substring(2));
                                } else {
                                    String var17 = this.field372.toLowerCase();
                                    byte var18 = 0;
                                    if (var17.startsWith("yellow:")) {
                                        var18 = 0;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var17.startsWith("red:")) {
                                        var18 = 1;
                                        this.field372 = this.field372.substring(4);
                                    } else if (var17.startsWith("green:")) {
                                        var18 = 2;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var17.startsWith("cyan:")) {
                                        var18 = 3;
                                        this.field372 = this.field372.substring(5);
                                    } else if (var17.startsWith("purple:")) {
                                        var18 = 4;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var17.startsWith("white:")) {
                                        var18 = 5;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var17.startsWith("flash1:")) {
                                        var18 = 6;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var17.startsWith("flash2:")) {
                                        var18 = 7;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var17.startsWith("flash3:")) {
                                        var18 = 8;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var17.startsWith("glow1:")) {
                                        var18 = 9;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var17.startsWith("glow2:")) {
                                        var18 = 10;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var17.startsWith("glow3:")) {
                                        var18 = 11;
                                        this.field372 = this.field372.substring(6);
                                    }
                                    String var19 = this.field372.toLowerCase();
                                    byte var20 = 0;
                                    if (var19.startsWith("wave:")) {
                                        var20 = 1;
                                        this.field372 = this.field372.substring(5);
                                    } else if (var19.startsWith("wave2:")) {
                                        var20 = 2;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var19.startsWith("shake:")) {
                                        var20 = 3;
                                        this.field372 = this.field372.substring(6);
                                    } else if (var19.startsWith("scroll:")) {
                                        var20 = 4;
                                        this.field372 = this.field372.substring(7);
                                    } else if (var19.startsWith("slide:")) {
                                        var20 = 5;
                                        this.field372 = this.field372.substring(6);
                                    }
                                    this.field365.method338(72, 10041);
                                    this.field365.method339(0);
                                    int var21 = this.field365.field1107;
                                    this.field365.method365(var20, this.field442);
                                    this.field365.method365(var18, this.field442);
                                    this.field339.field1107 = 0;
                                    class30.method332(6, this.field339, this.field372);
                                    this.field365.method385(this.field339.field1107, -113, 0, this.field339.field1106);
                                    this.field365.method348(6, this.field365.field1107 - var21);
                                    this.field372 = class30.method333(this.field328, this.field372);
                                    this.field372 = class27.method302(this.field328, this.field372);
                                    field446.field1565 = this.field372;
                                    field446.field1568 = var18;
                                    field446.field1583 = var20;
                                    field446.field1558 = 150;
                                    if (this.field95 == 2) {
                                        this.method106("@cr2@" + field446.field830, 0, field446.field1565, 2);
                                    } else if (this.field95 == 1) {
                                        this.method106("@cr1@" + field446.field830, 0, field446.field1565, 2);
                                    } else {
                                        this.method106(field446.field830, 0, field446.field1565, 2);
                                    }
                                    if (this.field226 == 2) {
                                        this.field226 = 3;
                                        this.field462 = true;
                                        this.field365.method338(100, 10041);
                                        this.field365.method339(this.field226);
                                        this.field365.method339(this.field196);
                                        this.field365.method339(this.field178);
                                    }
                                }
                                this.field372 = "";
                                this.field265 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field266.length() < 12) {
                    this.field266 = this.field266 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method96(byte arg0, int arg1) {
        if (arg0 != 0) {
            this.field140 = this.field423.method349();
        }
        if (!field467) {
            for (int var3 = 0; var3 < this.field459.length; ++var3) {
                int var4 = this.field459[var3];
                if (class62.field1652[var4] >= arg1) {
                    class47 var5 = class62.field1646[var4];
                    int var6 = var5.field1351 * var5.field1350 - 1;
                    int var7 = this.field281 * var5.field1350 * 2;
                    byte[] var8 = var5.field1348;
                    byte[] var9 = this.field218;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1348 = var9;
                    this.field218 = var8;
                    class62.method563(0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIBIIIII)V")
    private final void method97(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class61 var11 = null;
        for (class61 var12 = (class61) this.field402.method414(); var12 != null; var12 = (class61) this.field402.method416(this.field406)) {
            if (var12.field1621 == arg1 && var12.field1623 == arg7 && var12.field1624 == arg0 && var12.field1622 == arg3) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class61();
            var11.field1621 = arg1;
            var11.field1622 = arg3;
            var11.field1623 = arg7;
            var11.field1624 = arg0;
            this.method17(343, var11);
            this.field402.method411(var11);
        }
        var11.field1627 = arg2;
        var11.field1629 = arg8;
        var11.field1628 = arg5;
        var11.field1625 = arg9;
        var11.field1626 = arg6;
        if (arg4 != -2) {
            this.field81 = !this.field81;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method98(byte arg0) {
        if (arg0 != 0) {
            this.field140 = this.field423.method349();
        }
        if (super.field548 == 1) {
            if (super.field549 >= 6 && super.field549 <= 106 && super.field550 >= 467 && super.field550 <= 499) {
                this.field226 = (this.field226 + 1) % 4;
                this.field462 = true;
                this.field265 = true;
                this.field365.method338(100, 10041);
                this.field365.method339(this.field226);
                this.field365.method339(this.field196);
                this.field365.method339(this.field178);
            }
            if (super.field549 >= 135 && super.field549 <= 235 && super.field550 >= 467 && super.field550 <= 499) {
                this.field196 = (this.field196 + 1) % 3;
                this.field462 = true;
                this.field265 = true;
                this.field365.method338(100, 10041);
                this.field365.method339(this.field226);
                this.field365.method339(this.field196);
                this.field365.method339(this.field178);
            }
            if (super.field549 >= 273 && super.field549 <= 373 && super.field550 >= 467 && super.field550 <= 499) {
                this.field178 = (this.field178 + 1) % 3;
                this.field462 = true;
                this.field265 = true;
                this.field365.method338(100, 10041);
                this.field365.method339(this.field226);
                this.field365.method339(this.field196);
                this.field365.method339(this.field178);
            }
            if (super.field549 >= 412 && super.field549 <= 512 && super.field550 >= 467 && super.field550 <= 499) {
                if (this.field312 == -1) {
                    this.method110(true);
                    this.field266 = "";
                    this.field303 = false;
                    this.field476 = this.field312 = class20.field899;
                    return;
                }
                this.method106("", 0, "Please close the interface you have open before using 'report abuse'", 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LHZINZKXF;B)Z")
    public final boolean method99(class20 arg0, byte arg1) {
        if (arg0.field956 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field956.length; ++var3) {
                int var5 = this.method82((byte) 65, arg0, var3);
                int var6 = arg0.field893[var3];
                if (arg0.field956[var3] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg0.field956[var3] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg0.field956[var3] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            if (arg1 != 2) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)Ljava/lang/String;")
    public final String method100(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.method116();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field537 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method101(int arg0) {
        Graphics var2 = this.method92(true).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method154(169, 1);
        this.field139 += arg0;
        if (this.field234) {
            this.field424 = false;
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
        if (this.field192) {
            this.field424 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field354) {
            this.field424 = false;
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

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method102(byte arg0) {
        class65 var2 = (class65) this.field332.method414();
        if (arg0 == 5) {
            while (var2 != null) {
                if (this.field97 == var2.field1673 && !var2.field1672) {
                    if (field505 >= var2.field1682) {
                        var2.method584(this.field281, 254);
                        if (var2.field1672) {
                            var2.method336();
                        } else {
                            this.field130.method460(var2.field1674, 60, (byte) -103, var2, var2.field1673, 0, -1, var2.field1675, var2.field1676, false);
                        }
                    }
                } else {
                    var2.method336();
                }
                var2 = (class65) this.field332.method416(this.field406);
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field464 = Integer.parseInt(this.getParameter("nodeid"));
        field465 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method41(-39415);
        } else {
            method125((byte) -105);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field466 = false;
        } else {
            field466 = true;
        }
        this.method152(503, 765, -699);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)Z")
    public final boolean method103(byte arg0) {
        if (arg0 != 7) {
            this.field140 = -1;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BI)Z")
    public final boolean method104(byte arg0, byte[] arg1, int arg2) {
        if (arg0 == 6) {
            boolean var4 = false;
        } else {
            this.field365.method339(122);
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method105(int arg0) {
        if (this.field278 == 0) {
            int var2 = super.field548;
            int var3 = 79 / arg0;
            if (this.field171 == 1 && super.field549 >= 516 && super.field550 >= 160 && super.field549 <= 765 && super.field550 <= 205) {
                var2 = 0;
            }
            if (this.field152) {
                if (var2 != 1) {
                    int var4 = super.field542;
                    int var5 = super.field543;
                    if (this.field115 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field115 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field115 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field116 - 10 || var4 > this.field118 + this.field116 + 10 || var5 < this.field117 - 10 || var5 > this.field119 + this.field117 + 10) {
                        this.field152 = false;
                        if (this.field115 == 1) {
                            this.field135 = true;
                        }
                        if (this.field115 == 2) {
                            this.field265 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var6 = this.field116;
                    int var7 = this.field117;
                    int var8 = this.field118;
                    int var9 = super.field549;
                    int var10 = super.field550;
                    if (this.field115 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field115 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field115 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field521; ++var12) {
                        int var13 = (this.field521 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method55(var11, true);
                    }
                    this.field152 = false;
                    if (this.field115 == 1) {
                        this.field135 = true;
                    }
                    if (this.field115 == 2) {
                        this.field265 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field521 > 0) {
                    int var14 = this.field237[this.field521 - 1];
                    if (var14 == 940 || var14 == 905 || var14 == 96 || var14 == 513 || var14 == 133 || var14 == 641 || var14 == 546 || var14 == 129 || var14 == 478 || var14 == 170 || var14 == 87 || var14 == 1187) {
                        int var15 = this.field235[this.field521 - 1];
                        int var16 = this.field236[this.field521 - 1];
                        class20 var17 = class20.method269(var16);
                        if (var17.field947 || var17.field925) {
                            this.field263 = false;
                            this.field223 = 0;
                            this.field276 = var16;
                            this.field277 = var15;
                            this.field278 = 2;
                            this.field279 = super.field549;
                            this.field280 = super.field550;
                            if (class20.method269(var16).field928 == this.field312) {
                                this.field278 = 1;
                            }
                            if (class20.method269(var16).field928 == this.field338) {
                                this.field278 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field62 == 1 || this.method28(this.field521 - 1, (byte) -19)) && this.field521 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field521 > 0) {
                    this.method55(this.field521 - 1, true);
                }
                if (var2 != 2 || this.field521 <= 0) {
                    return;
                }
                this.method119(-1729);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public final void method106(String arg0, int arg1, String arg2, int arg3) {
        if (arg3 == 0 && this.field154 != -1) {
            this.field435 = arg2;
            super.field548 = 0;
        }
        if (this.field338 == -1) {
            this.field265 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field46[var5] = this.field46[var5 - 1];
            this.field47[var5] = this.field47[var5 - 1];
            this.field48[var5] = this.field48[var5 - 1];
        }
        this.field46[0] = arg3;
        this.field47[0] = arg0;
        this.field48[0] = arg2;
        if (arg1 != 0) {
            this.field258 = null;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method107(boolean arg0) {
        if (arg0) {
            this.method116();
        }
        for (int var2 = 0; var2 < this.field381; ++var2) {
            if (this.field200[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field103[var2] == this.field104 && this.field434[var2] == this.field233) {
                        if (!this.method103((byte) 7)) {
                            var3 = true;
                        }
                    } else {
                        class35 var4 = class26.method287(this.field434[var2], this.field103[var2], false);
                        if (System.currentTimeMillis() + (long) (var4.field1107 / 22) > (long) (this.field100 / 22) + this.field313) {
                            this.field100 = var4.field1107;
                            this.field313 = System.currentTimeMillis();
                            if (this.method104((byte) 6, var4.field1106, var4.field1107)) {
                                this.field104 = this.field103[var2];
                                this.field233 = this.field434[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field200[var2] != -5) {
                    this.field200[var2] = -5;
                } else {
                    --this.field381;
                    for (int var6 = var2; var6 < this.field381; ++var6) {
                        this.field103[var6] = this.field103[var6 + 1];
                        this.field434[var6] = this.field434[var6 + 1];
                        this.field200[var6] = this.field200[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field200[var2]--;
            }
        }
        if (this.field316 > 0) {
            this.field316 -= 20;
            if (this.field316 < 0) {
                this.field316 = 0;
            }
            if (this.field316 == 0 && this.field167 && !field467) {
                this.field168 = this.field156;
                this.field169 = true;
                this.field40.method532(2, this.field168);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method108(boolean arg0) {
        int var2 = this.field116;
        int var3 = this.field117;
        int var4 = this.field118;
        int var5 = this.field119;
        int var6 = 6116423;
        class36.method393(var2, var6, var5, var3, 0, var4);
        this.field410 &= arg0;
        class36.method393(var2 + 1, 0, 16, var3 + 1, 0, var4 - 2);
        class36.method394(0, (byte) 52, var3 + 18, var4 - 2, var5 - 19, var2 + 1);
        this.field429.method216("Choose Option", var2 + 3, (byte) 2, var3 + 14, var6);
        int var7 = super.field542;
        int var8 = super.field543;
        if (this.field115 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field115 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field115 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field521; ++var9) {
            int var10 = (this.field521 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field429.method220(var10, this.field166[var9], false, true, var11, var2 + 3);
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (arg0 != -12166) {
            this.field81 = !this.field81;
        }
        if (this.field246 == 0) {
            if (super.field548 == 1) {
                int var2 = super.field549 - 25 - 550;
                int var3 = super.field550 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field325 + this.field308 & 2047;
                    int var5 = class62.field1642[var4];
                    int var6 = class62.field1643[var4];
                    int var7 = (this.field301 + 256) * var5 >> 8;
                    int var8 = (this.field301 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field446.field1601 + var9 >> 7;
                    int var12 = field446.field1602 - var10 >> 7;
                    boolean var13 = this.method6(0, var12, field446.field1560[0], true, 0, 0, 1, var11, 0, field446.field1559[0], false, 0);
                    if (var13) {
                        this.field365.method339(var2);
                        this.field365.method339(var3);
                        this.field365.method340(this.field325);
                        this.field365.method339(57);
                        this.field365.method339(this.field308);
                        this.field365.method339(this.field301);
                        this.field365.method339(89);
                        this.field365.method340(field446.field1601);
                        this.field365.method340(field446.field1602);
                        this.field365.method339(this.field198);
                        this.field365.method339(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method110(boolean arg0) {
        this.field410 &= arg0;
        this.field365.method338(241, 10041);
        if (this.field420 != -1) {
            this.method121(this.field420, false);
            this.field420 = -1;
            this.field135 = true;
            this.field185 = false;
            this.field275 = true;
        }
        if (this.field338 != -1) {
            this.method121(this.field338, false);
            this.field338 = -1;
            this.field265 = true;
            this.field185 = false;
        }
        if (this.field197 != -1) {
            this.method121(this.field197, false);
            this.field197 = -1;
            this.field256 = true;
        }
        if (this.field468 != -1) {
            this.method121(this.field468, false);
            this.field468 = -1;
        }
        if (this.field312 != -1) {
            this.method121(this.field312, false);
            this.field312 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILGALAVQEJ;II)V")
    public final void method111(int arg0, int arg1, class12 arg2, int arg3, int arg4) {
        if (arg4 != 8) {
            this.field227 = -431;
        }
        if (this.field521 < 400) {
            if (arg2.field738 != null) {
                arg2 = arg2.method206(0);
            }
            if (arg2 != null) {
                if (arg2.field744) {
                    String var6 = arg2.field737;
                    if (arg2.field732 != 0) {
                        var6 = var6 + method5(arg2.field732, 0, field446.field819) + " (level-" + arg2.field732 + ")";
                    }
                    if (this.field480 == 1) {
                        this.field166[this.field521] = "Use " + this.field484 + " with @yel@" + var6;
                        this.field237[this.field521] = 58;
                        this.field238[this.field521] = arg0;
                        this.field235[this.field521] = arg3;
                        this.field236[this.field521] = arg1;
                        ++this.field521;
                    } else {
                        if (this.field171 == 1) {
                            if ((this.field173 & 2) == 2) {
                                this.field166[this.field521] = this.field174 + " @yel@" + var6;
                                this.field237[this.field521] = 465;
                                this.field238[this.field521] = arg0;
                                this.field235[this.field521] = arg3;
                                this.field236[this.field521] = arg1;
                                ++this.field521;
                                return;
                            }
                        } else {
                            if (arg2.field729 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg2.field729[var7] != null && !arg2.field729[var7].equalsIgnoreCase("attack")) {
                                        this.field166[this.field521] = arg2.field729[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field237[this.field521] = 249;
                                        }
                                        if (var7 == 1) {
                                            this.field237[this.field521] = 691;
                                        }
                                        if (var7 == 2) {
                                            this.field237[this.field521] = 458;
                                        }
                                        if (var7 == 3) {
                                            this.field237[this.field521] = 916;
                                        }
                                        if (var7 == 4) {
                                            this.field237[this.field521] = 743;
                                        }
                                        this.field238[this.field521] = arg0;
                                        this.field235[this.field521] = arg3;
                                        this.field236[this.field521] = arg1;
                                        ++this.field521;
                                    }
                                }
                            }
                            if (arg2.field729 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field729[var8] != null && arg2.field729[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg2.field732 > field446.field819) {
                                            var9 = 2000;
                                        }
                                        this.field166[this.field521] = arg2.field729[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field237[this.field521] = var9 + 249;
                                        }
                                        if (var8 == 1) {
                                            this.field237[this.field521] = var9 + 691;
                                        }
                                        if (var8 == 2) {
                                            this.field237[this.field521] = var9 + 458;
                                        }
                                        if (var8 == 3) {
                                            this.field237[this.field521] = var9 + 916;
                                        }
                                        if (var8 == 4) {
                                            this.field237[this.field521] = var9 + 743;
                                        }
                                        this.field238[this.field521] = arg0;
                                        this.field235[this.field521] = arg3;
                                        this.field236[this.field521] = arg1;
                                        ++this.field521;
                                    }
                                }
                            }
                            this.field166[this.field521] = "Examine @yel@" + var6;
                            this.field237[this.field521] = 1117;
                            this.field238[this.field521] = arg0;
                            this.field235[this.field521] = arg3;
                            this.field236[this.field521] = arg1;
                            ++this.field521;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method112(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field397 = this.field353.method278();
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILHDYGEGXY;LNHEPCMLW;)V")
    private final void method113(int arg0, int arg1, int arg2, class17 arg3, class35 arg4) {
        if (arg1 <= 0) {
            this.method116();
        }
        if ((arg2 & 32) != 0) {
            int var6 = arg4.method375(-889);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg4.method369(this.field88);
            if (arg3.field1587 == var6 && var6 != -1) {
                int var8 = class42.field1219[var6].field1233;
                if (var8 == 1) {
                    arg3.field1588 = 0;
                    arg3.field1589 = 0;
                    arg3.field1590 = var7;
                    arg3.field1591 = 0;
                }
                if (var8 == 2) {
                    arg3.field1591 = 0;
                }
            } else if (var6 == -1 || arg3.field1587 == -1 || class42.field1219[var6].field1227 >= class42.field1219[arg3.field1587].field1227) {
                arg3.field1587 = var6;
                arg3.field1588 = 0;
                arg3.field1589 = 0;
                arg3.field1590 = var7;
                arg3.field1591 = 0;
                arg3.field1562 = arg3.field1579;
            }
        }
        if ((arg2 & 256) != 0) {
            arg3.field1553 = arg4.method376(5);
            int var9 = arg4.method384(false);
            arg3.field1557 = var9 >> 16;
            arg3.field1556 = (var9 & 65535) + field505;
            arg3.field1554 = 0;
            arg3.field1555 = 0;
            if (arg3.field1556 > field505) {
                arg3.field1554 = -1;
            }
            if (arg3.field1553 == 65535) {
                arg3.field1553 = -1;
            }
        }
        if ((arg2 & 2) != 0) {
            int var10 = arg4.method349();
            int var11 = arg4.method367(34652);
            arg3.method546(var10, field505, -333, var11);
            arg3.field1584 = field505 + 300;
            arg3.field1585 = arg4.method369(this.field88);
            arg3.field1586 = arg4.method349();
        }
        if ((arg2 & 64) != 0) {
            arg3.field1549 = arg4.method376(5);
            if (arg3.field1549 == 65535) {
                arg3.field1549 = -1;
            }
        }
        if ((arg2 & 1024) != 0) {
            arg3.field1572 = arg4.method369(this.field88);
            arg3.field1574 = arg4.method369(this.field88);
            arg3.field1573 = arg4.method369(this.field88);
            arg3.field1575 = arg4.method349();
            arg3.field1576 = arg4.method376(5) + field505;
            arg3.field1577 = arg4.method377(true) + field505;
            arg3.field1578 = arg4.method369(this.field88);
            arg3.method549(this.field94);
        }
        if ((arg2 & 4) != 0) {
            int var12 = arg4.method377(true);
            int var13 = arg4.method369(this.field88);
            int var14 = arg4.method369(this.field88);
            int var15 = arg4.field1107;
            if (arg3.field830 != null && arg3.field829) {
                long var16 = class51.method504(arg3.field830);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < this.field460; ++var19) {
                        if (this.field41[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && this.field274 == 0) {
                    try {
                        this.field339.field1107 = 0;
                        arg4.method387(var14, (byte) 6, this.field339.field1106, 0);
                        this.field339.field1107 = 0;
                        String var20 = class30.method331(var14, true, this.field339);
                        String var21 = class27.method302(this.field328, var20);
                        arg3.field1565 = var21;
                        arg3.field1568 = var12 >> 8;
                        arg3.field1583 = var12 & 255;
                        arg3.field1558 = 150;
                        if (var13 != 2 && var13 != 3) {
                            if (var13 == 1) {
                                this.method106("@cr1@" + arg3.field830, 0, var21, 1);
                            } else {
                                this.method106(arg3.field830, 0, var21, 2);
                            }
                        } else {
                            this.method106("@cr2@" + arg3.field830, 0, var21, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field1107 = var14 + var15;
        }
        if ((arg2 & 16) != 0) {
            arg3.field1569 = arg4.method351();
            arg3.field1570 = arg4.method376(5);
        }
        if ((arg2 & 512) != 0) {
            int var23 = arg4.method367(34652);
            int var24 = arg4.method367(34652);
            arg3.method546(var23, field505, -333, var24);
            arg3.field1584 = field505 + 300;
            arg3.field1585 = arg4.method368(0);
            arg3.field1586 = arg4.method369(this.field88);
        }
        if ((arg2 & 128) != 0) {
            arg3.field1565 = arg4.method356();
            if (arg3.field1565.charAt(0) == '~') {
                arg3.field1565 = arg3.field1565.substring(1);
                this.method106(arg3.field830, 0, arg3.field1565, 2);
            } else if (field446 == arg3) {
                this.method106(arg3.field830, 0, arg3.field1565, 2);
            }
            arg3.field1568 = 0;
            arg3.field1583 = 0;
            arg3.field1558 = 150;
        }
        if ((arg2 & 1) != 0) {
            int var25 = arg4.method368(0);
            byte[] var26 = new byte[var25];
            class35 var27 = new class35((byte) -103, var26);
            arg4.method386(0, this.field250, var26, var25);
            this.field396[arg0] = var27;
            arg3.method252(var27, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method114(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field489; ++var3) {
                if (arg1.equalsIgnoreCase(this.field109[var3])) {
                    return true;
                }
            }
            if (arg0 >= 0) {
                this.field136 = -79;
            }
            return arg1.equalsIgnoreCase(field446.field830);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        if (this.field310 != 0) {
            class13 var2 = this.field428;
            int var3 = 0;
            this.field410 &= arg0;
            if (this.field376 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field48[var4] != null) {
                    int var5 = this.field46[var4];
                    String var6 = this.field47[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field196 == 0 || this.field196 == 1 && this.method114(-154, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method216("From", var9, (byte) 2, var8, 0);
                        var2.method216("From", var9, (byte) 2, var8 - 1, 65535);
                        int var10 = var9 + var2.method214(0, "From ");
                        if (var7 == 1) {
                            this.field411[0].method442(var10, var8 - 12, (byte) 8);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field411[1].method442(var10, var8 - 12, (byte) 8);
                            var10 += 14;
                        }
                        var2.method216(var6 + ": " + this.field48[var4], var10, (byte) 2, var8, 0);
                        var2.method216(var6 + ": " + this.field48[var4], var10, (byte) 2, var8 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field196 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method216(this.field48[var4], 4, (byte) 2, var11, 0);
                        var2.method216(this.field48[var4], 4, (byte) 2, var11 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field196 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method216("To " + var6 + ": " + this.field48[var4], 4, (byte) 2, var12, 0);
                        var2.method216("To " + var6 + ": " + this.field48[var4], 4, (byte) 2, var12 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method116() {
        this.method32(3, 20, "Starting up");
        if (signlink.sunjava) {
            super.field528 = 5;
        }
        if (field270) {
            this.field354 = true;
        } else {
            field270 = true;
            boolean var1 = false;
            String var2 = this.method100((byte) 3);
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
                this.field192 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field99[var3] = new class59(signlink.cache_idx[var3], 40916, var3 + 1, signlink.cache_dat, 500000);
                    }
                }
                try {
                    this.method146(true);
                    this.field288 = this.method73(this.field358[1], 1, field57, "title screen", "title", 25);
                    this.field427 = new class13(this.field288, 38414, false, "p11_full");
                    this.field428 = new class13(this.field288, 38414, false, "p12_full");
                    this.field429 = new class13(this.field288, 38414, false, "b12_full");
                    this.field430 = new class13(this.field288, 38414, true, "q8_full");
                    this.method56((byte) 30);
                    this.method141(669);
                    class21 var4 = this.method73(this.field358[2], 2, field57, "config", "config", 30);
                    class21 var5 = this.method73(this.field358[3], 3, field57, "interface", "interface", 35);
                    class21 var6 = this.method73(this.field358[4], 4, field57, "2d graphics", "media", 40);
                    class21 var7 = this.method73(this.field358[6], 6, field57, "textures", "textures", 45);
                    class21 var8 = this.method73(this.field358[7], 7, field57, "chat system", "wordenc", 50);
                    class21 var9 = this.method73(this.field358[8], 8, field57, "sound effects", "sounds", 55);
                    this.field343 = new byte[4][104][104];
                    this.field106 = new int[4][105][105];
                    this.field130 = new class49(4, this.field106, 104, 104, -11783);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field221[var10] = new class8(104, (byte) 9, 104);
                    }
                    this.field211 = new class72(512, 512);
                    class21 var11 = this.method73(this.field358[5], 5, field57, "update list", "versionlist", 60);
                    this.method32(3, 60, "Connecting to update server");
                    this.field40 = new class55();
                    this.field40.method515(var11, this);
                    class25.method281(this.field40.method516(true));
                    class4.method157(this.field40.method533(-559, 0), this.field40);
                    if (!field467) {
                        this.field168 = 0;
                        try {
                            this.field168 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var72) {
                        }
                        this.field169 = true;
                        this.field40.method532(2, this.field168);
                        while (this.field40.method529() > 0) {
                            this.method147((byte) 92);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field40.field1503 > 3) {
                                this.method18("ondemand");
                                return;
                            }
                        }
                    }
                    this.method32(3, 65, "Requesting animations");
                    int var12 = this.field40.method533(-559, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field40.method532(1, var13);
                    }
                    while (this.field40.method529() > 0) {
                        int var14 = var12 - this.field40.method529();
                        if (var14 > 0) {
                            this.method32(3, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method147((byte) 92);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field40.field1503 > 3) {
                            this.method18("ondemand");
                            return;
                        }
                    }
                    this.method32(3, 70, "Requesting models");
                    int var15 = this.field40.method533(-559, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field40.method524(var16, 9);
                        if ((var17 & 1) != 0) {
                            this.field40.method532(0, var16);
                        }
                    }
                    int var18 = this.field40.method529();
                    while (this.field40.method529() > 0) {
                        int var19 = var18 - this.field40.method529();
                        if (var19 > 0) {
                            this.method32(3, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method147((byte) 92);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field99[0] != null) {
                        this.method32(3, 75, "Requesting maps");
                        this.field40.method532(3, this.field40.method520(47, 48, 0, -632));
                        this.field40.method532(3, this.field40.method520(47, 48, 1, -632));
                        this.field40.method532(3, this.field40.method520(48, 48, 0, -632));
                        this.field40.method532(3, this.field40.method520(48, 48, 1, -632));
                        this.field40.method532(3, this.field40.method520(49, 48, 0, -632));
                        this.field40.method532(3, this.field40.method520(49, 48, 1, -632));
                        this.field40.method532(3, this.field40.method520(47, 47, 0, -632));
                        this.field40.method532(3, this.field40.method520(47, 47, 1, -632));
                        this.field40.method532(3, this.field40.method520(48, 47, 0, -632));
                        this.field40.method532(3, this.field40.method520(48, 47, 1, -632));
                        this.field40.method532(3, this.field40.method520(48, 148, 0, -632));
                        this.field40.method532(3, this.field40.method520(48, 148, 1, -632));
                        int var20 = this.field40.method529();
                        while (this.field40.method529() > 0) {
                            int var21 = var20 - this.field40.method529();
                            if (var21 > 0) {
                                this.method32(3, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method147((byte) 92);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field40.method533(-559, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field40.method524(var23, 9);
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
                            this.field40.method522(0, 0, var23, var25);
                        }
                    }
                    this.field40.method517(-388, field466);
                    if (!field467) {
                        int var26 = this.field40.method533(-559, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field40.method514(2, var27)) {
                                this.field40.method522(0, 2, var27, (byte) 1);
                            }
                        }
                    }
                    this.method32(3, 80, "Unpacking media");
                    this.field386 = new class47(var6, "invback", 0);
                    this.field388 = new class47(var6, "chatback", 0);
                    this.field387 = new class47(var6, "mapback", 0);
                    this.field335 = new class47(var6, "backbase1", 0);
                    this.field336 = new class47(var6, "backbase2", 0);
                    this.field337 = new class47(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field42[var28] = new class47(var6, "sideicons", var28);
                    }
                    this.field461 = new class72(var6, "compass", 0);
                    this.field329 = new class72(var6, "mapedge", 0);
                    this.field329.method591(2);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field517[var29] = new class47(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field334[var30] = new class72(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field495[var31] = new class72(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field307[var32] = new class72(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field113[var33] = new class72(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field398[var34] = new class72(var6, "headicons_hint", var34);
                    }
                    this.field37 = new class72(var6, "overlay_multiway", 0);
                    this.field319 = new class72(var6, "mapmarker", 0);
                    this.field320 = new class72(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field516[var35] = new class72(var6, "cross", var35);
                    }
                    this.field499 = new class72(var6, "mapdots", 0);
                    this.field500 = new class72(var6, "mapdots", 1);
                    this.field501 = new class72(var6, "mapdots", 2);
                    this.field502 = new class72(var6, "mapdots", 3);
                    this.field503 = new class72(var6, "mapdots", 4);
                    this.field49 = new class47(var6, "scrollbar", 0);
                    this.field50 = new class47(var6, "scrollbar", 1);
                    this.field414 = new class47(var6, "redstone1", 0);
                    this.field415 = new class47(var6, "redstone2", 0);
                    this.field416 = new class47(var6, "redstone3", 0);
                    this.field417 = new class47(var6, "redstone1", 0);
                    this.field417.method439(0);
                    this.field418 = new class47(var6, "redstone2", 0);
                    this.field418.method439(0);
                    this.field204 = new class47(var6, "redstone1", 0);
                    this.field204.method440(-29160);
                    this.field205 = new class47(var6, "redstone2", 0);
                    this.field205.method440(-29160);
                    this.field206 = new class47(var6, "redstone3", 0);
                    this.field206.method440(-29160);
                    this.field207 = new class47(var6, "redstone1", 0);
                    this.field207.method439(0);
                    this.field207.method440(-29160);
                    this.field208 = new class47(var6, "redstone2", 0);
                    this.field208.method439(0);
                    this.field208.method440(-29160);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field411[var36] = new class47(var6, "mod_icons", var36);
                    }
                    class72 var37 = new class72(var6, "backleft1", 0);
                    this.field506 = new class56(var37.field1726, 5, var37.field1725, this.method92(true));
                    var37.method592(0, 0, 0);
                    class72 var38 = new class72(var6, "backleft2", 0);
                    this.field507 = new class56(var38.field1726, 5, var38.field1725, this.method92(true));
                    var38.method592(0, 0, 0);
                    class72 var39 = new class72(var6, "backright1", 0);
                    this.field508 = new class56(var39.field1726, 5, var39.field1725, this.method92(true));
                    var39.method592(0, 0, 0);
                    class72 var40 = new class72(var6, "backright2", 0);
                    this.field509 = new class56(var40.field1726, 5, var40.field1725, this.method92(true));
                    var40.method592(0, 0, 0);
                    class72 var41 = new class72(var6, "backtop1", 0);
                    this.field510 = new class56(var41.field1726, 5, var41.field1725, this.method92(true));
                    var41.method592(0, 0, 0);
                    class72 var42 = new class72(var6, "backvmid1", 0);
                    this.field511 = new class56(var42.field1726, 5, var42.field1725, this.method92(true));
                    var42.method592(0, 0, 0);
                    class72 var43 = new class72(var6, "backvmid2", 0);
                    this.field512 = new class56(var43.field1726, 5, var43.field1725, this.method92(true));
                    var43.method592(0, 0, 0);
                    class72 var44 = new class72(var6, "backvmid3", 0);
                    this.field513 = new class56(var44.field1726, 5, var44.field1725, this.method92(true));
                    var44.method592(0, 0, 0);
                    class72 var45 = new class72(var6, "backhmid2", 0);
                    this.field514 = new class56(var45.field1726, 5, var45.field1725, this.method92(true));
                    var45.method592(0, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field334[var50] != null) {
                            this.field334[var50].method590(var46 + var49, var48 + var49, var47 + var49, (byte) 7);
                        }
                        if (this.field517[var50] != null) {
                            this.field517[var50].method441(var46 + var49, var48 + var49, var47 + var49, (byte) 7);
                        }
                    }
                    this.method32(3, 83, "Unpacking textures");
                    class62.method561(var7, 21568);
                    class62.method565(22698, 0.8D);
                    class62.method560((byte) 0, 20);
                    this.method32(3, 86, "Unpacking config");
                    class42.method426(-351, var4);
                    class37.method402(var4);
                    class52.method510(-351, var4);
                    class19.method255(var4);
                    class12.method210(var4);
                    class46.method431(-351, var4);
                    class11.method200(-351, var4);
                    class32.method334(-351, var4);
                    class39.method419(-351, var4);
                    class19.field888 = field466;
                    if (!field467) {
                        this.method32(3, 90, "Unpacking sounds");
                        byte[] var51 = var9.method277("sounds.dat", (byte[]) null);
                        class35 var52 = new class35((byte) -103, var51);
                        class26.method286(-351, var52);
                    }
                    this.method32(3, 95, "Unpacking interfaces");
                    class13[] var53 = new class13[] { this.field427, this.field428, this.field429, this.field430 };
                    class20.method274((byte) -121, var6, var53, var5);
                    this.method32(3, 100, "Preparing game engine");
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field387.field1348[this.field387.field1350 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field426[var54] = var55;
                        this.field413[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field387.field1348[this.field387.field1350 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field179[var58 - 5] = var59 - 25;
                        this.field133[var58 - 5] = var60 - var59;
                    }
                    class62.method558(503, 765, -27);
                    this.field56 = class62.field1644;
                    class62.method558(96, 479, -27);
                    this.field53 = class62.field1644;
                    class62.method558(261, 190, -27);
                    this.field54 = class62.field1644;
                    class62.method558(334, 512, -27);
                    this.field55 = class62.field1644;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class62.field1642[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class49.method485(334, 512, 49025, 500, 800, var62);
                    class27.method292(var8);
                    this.field74 = new class31((byte) 0, this);
                    this.method74(this.field74, 10);
                    class6.field670 = this;
                    class37.field1137 = this;
                    class12.field724 = this;
                } catch (Exception var73) {
                    signlink.reporterror("loaderror " + this.field374 + " " + this.field35);
                    this.field234 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method117(int arg0) {
        this.field187.method535((byte) 6);
        class62.field1644 = this.field54;
        this.field386.method442(0, 0, (byte) 8);
        if (arg0 != 0) {
            field57 = this.field353.method278();
        }
        if (this.field420 != -1) {
            this.method13(true, 0, 0, class20.method269(this.field420), 0);
        } else if (this.field254[this.field215] != -1) {
            this.method13(true, 0, 0, class20.method269(this.field254[this.field215]), 0);
        }
        if (this.field152 && this.field115 == 1) {
            this.method108(true);
        }
        this.field187.method536(553, 5, 205, super.field534);
        this.field189.method535((byte) 6);
        class62.field1644 = this.field55;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method118(byte arg0) {
        ++this.field272;
        this.method14((byte) 72, true);
        this.method53(true, -19874);
        this.method14((byte) 72, false);
        this.method53(false, -19874);
        this.method27((byte) 1);
        this.method102((byte) 5);
        if (!this.field383) {
            int var2 = this.field324;
            if (this.field151 / 256 > var2) {
                var2 = this.field151 / 256;
            }
            if (this.field422[4] && this.field285[4] + 128 > var2) {
                var2 = this.field285[4] + 128;
            }
            int var3 = this.field325 + this.field121 & 2047;
            this.method135(var2 * 3 + 600, this.field346, this.method52(this.field97, field446.field1602, -430, field446.field1601) - 50, var3, -970, var2, this.field345);
            ++field87;
            if (field87 > 70) {
                field87 = 0;
                this.field365.method338(235, 10041);
            }
        }
        int var4;
        if (!this.field383) {
            var4 = this.method47(true);
        } else {
            var4 = this.method48(true);
        }
        int var5 = this.field66;
        int var6 = this.field67;
        int var7 = this.field68;
        int var8 = this.field69;
        int var9 = this.field70;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field422[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field323[var10] * 2 + 1) - (double) this.field323[var10] + Math.sin((double) this.field448[var10] / 100.0D * (double) this.field384[var10]) * (double) this.field285[var10]);
                if (var10 == 0) {
                    this.field66 += var12;
                }
                if (var10 == 1) {
                    this.field67 += var12;
                }
                if (var10 == 2) {
                    this.field68 += var12;
                }
                if (var10 == 3) {
                    this.field70 = this.field70 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field69 += var12;
                    if (this.field69 < 128) {
                        this.field69 = 128;
                    }
                    if (this.field69 > 383) {
                        this.field69 = 383;
                    }
                }
            }
        }
        int var11 = class62.field1653;
        class4.field627 = true;
        class4.field630 = 0;
        class4.field628 = super.field542 - 4;
        class4.field629 = super.field543 - 4;
        class36.method391(7);
        this.field130.method488(true, this.field70, this.field68, this.field69, this.field67, var4, this.field66);
        this.field130.method463(this.field351);
        if (arg0 != 20) {
            field57 = this.field353.method278();
        }
        this.method80(this.field136);
        this.method137((byte) 2);
        this.method96((byte) 0, var11);
        this.method93(-195);
        this.field189.method536(4, 5, 4, super.field534);
        this.field66 = var5;
        this.field67 = var6;
        this.field68 = var7;
        this.field69 = var8;
        this.field70 = var9;
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method119(int arg0) {
        int var2 = this.field429.method214(0, "Choose Option");
        for (int var3 = 0; var3 < this.field521; ++var3) {
            int var11 = this.field429.method214(0, this.field166[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field521 * 15 + 21;
        if (arg0 != -1729) {
            this.field487 = -169;
        }
        if (super.field549 > 4 && super.field550 > 4 && super.field549 < 516 && super.field550 < 338) {
            int var5 = super.field549 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field550 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field152 = true;
            this.field115 = 0;
            this.field116 = var5;
            this.field117 = var6;
            this.field118 = var2;
            this.field119 = this.field521 * 15 + 22;
        }
        if (super.field549 > 553 && super.field550 > 205 && super.field549 < 743 && super.field550 < 466) {
            int var7 = super.field549 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field550 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field152 = true;
            this.field115 = 1;
            this.field116 = var7;
            this.field117 = var8;
            this.field118 = var2;
            this.field119 = this.field521 * 15 + 22;
        }
        if (super.field549 > 17 && super.field550 > 357 && super.field549 < 496 && super.field550 < 453) {
            int var9 = super.field549 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field550 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field152 = true;
            this.field115 = 2;
            this.field116 = var9;
            this.field117 = var10;
            this.field118 = var2;
            this.field119 = this.field521 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method120(int arg0, int arg1) {
        class38 var3 = this.field258[this.field97][arg0][arg1];
        if (var3 == null) {
            this.field130.method470(this.field97, arg0, arg1);
        } else {
            int var4 = -99999999;
            class9 var5 = null;
            for (class9 var6 = (class9) var3.method414(); var6 != null; var6 = (class9) var3.method416(this.field406)) {
                class19 var11 = class19.method254(var6.field693);
                int var12 = var11.field846;
                if (var11.field889) {
                    var12 = (var6.field692 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method412(var5, (byte) -109);
            class9 var7 = null;
            class9 var8 = null;
            for (class9 var9 = (class9) var3.method414(); var9 != null; var9 = (class9) var3.method416(this.field406)) {
                if (var5.field693 != var9.field693 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field693 != var9.field693 && var7.field693 != var9.field693 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field130.method456(var10, arg0, this.field97, this.method52(this.field97, arg1 * 128 + 64, -430, arg0 * 128 + 64), 9, var7, var8, var5, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method121(int arg0, boolean arg1) {
        if (arg1) {
            field375 = !field375;
        }
        class20.method267(arg0, false);
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method122(boolean arg0) {
        this.field63 = true;
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field344[var3] = -1;
            for (int var4 = 0; var4 < class46.field1338; ++var4) {
                if (!class46.field1339[var4].field1345 && class46.field1339[var4].field1340 == var3 + (this.field306 ? 0 : 7)) {
                    this.field344[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZI)Z")
    public final boolean method123(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method116();
        }
        boolean var4 = false;
        class20 var5 = class20.method269(arg0);
        for (int var6 = 0; var6 < var5.field950.length && var5.field950[var6] != -1; ++var6) {
            class20 var7 = class20.method269(var5.field950[var6]);
            if (var7.field894 == 1) {
                var4 |= this.method123(var7.field898, false, arg2);
            }
            if (var7.field894 == 6 && (var7.field912 != -1 || var7.field913 != -1)) {
                boolean var8 = this.method99(var7, (byte) 2);
                int var9;
                if (var8) {
                    var9 = var7.field913;
                } else {
                    var9 = var7.field912;
                }
                if (var9 != -1) {
                    class42 var10 = class42.field1219[var9];
                    var7.field908 += arg2;
                    while (var7.field908 > var10.method427(var7.field939, this.field44)) {
                        var7.field908 -= var10.method427(var7.field939, this.field44) + 1;
                        ++var7.field939;
                        if (var7.field939 >= var10.field1220) {
                            var7.field939 -= var10.field1224;
                            if (var7.field939 < 0 || var7.field939 >= var10.field1220) {
                                var7.field939 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field894 == 6 && var7.field901 != 0) {
                int var11 = var7.field901 >> 16;
                int var12 = var7.field901 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field935 = var7.field935 + var13 & 2047;
                var7.field936 = var7.field936 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field274 = 0;
        int var2 = (field446.field1601 >> 7) + this.field290;
        int var3 = (field446.field1602 >> 7) + this.field291;
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field274 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field274 = 1;
        }
        if (this.field274 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field274 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public static final void method125(byte arg0) {
        if (arg0 == -105) {
            class49.field1390 = false;
            class62.field1633 = false;
            field467 = false;
            class14.field766 = false;
            class37.field1150 = false;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (this.field278 == 0) {
            this.field166[0] = "Cancel";
            this.field237[0] = 1400;
            this.field521 = 1;
            if (this.field197 != -1) {
                this.field373 = 0;
                this.field361 = 0;
                this.method87(0, super.field542, 0, class20.method269(this.field197), 0, super.field543, 0, 0);
                if (this.field92 != this.field373) {
                    this.field92 = this.field373;
                }
                if (this.field436 != this.field361) {
                    this.field436 = this.field361;
                }
            } else {
                this.method43(10361);
                this.field373 = 0;
                this.field361 = 0;
                if (super.field542 > 4 && super.field543 > 4 && super.field542 < 516 && super.field543 < 338) {
                    if (this.field312 != -1) {
                        this.method87(0, super.field542, 4, class20.method269(this.field312), 4, super.field543, 0, 0);
                    } else {
                        this.method35(359);
                    }
                }
                if (this.field92 != this.field373) {
                    this.field92 = this.field373;
                }
                if (this.field436 != this.field361) {
                    this.field436 = this.field361;
                }
                this.field373 = 0;
                this.field361 = 0;
                if (super.field542 > 553 && super.field543 > 205 && super.field542 < 743 && super.field543 < 466) {
                    if (this.field420 != -1) {
                        this.method87(0, super.field542, 205, class20.method269(this.field420), 553, super.field543, 0, 1);
                    } else if (this.field254[this.field215] != -1) {
                        this.method87(0, super.field542, 205, class20.method269(this.field254[this.field215]), 553, super.field543, 0, 1);
                    }
                }
                if (this.field373 != this.field148) {
                    this.field135 = true;
                    this.field148 = this.field373;
                }
                if (this.field361 != this.field295) {
                    this.field135 = true;
                    this.field295 = this.field361;
                }
                this.field373 = 0;
                this.field361 = 0;
                if (arg0 >= 0) {
                    this.field140 = this.field423.method349();
                }
                if (super.field542 > 17 && super.field543 > 357 && super.field542 < 496 && super.field543 < 453) {
                    if (this.field338 != -1) {
                        this.method87(0, super.field542, 357, class20.method269(this.field338), 17, super.field543, 0, 2);
                    } else if (this.field154 != -1) {
                        this.method87(0, super.field542, 357, class20.method269(this.field154), 17, super.field543, 0, 3);
                    } else if (super.field543 < 434 && super.field542 < 426) {
                        this.method127(super.field543 - 357, super.field542 - 17, 5233);
                    }
                }
                if ((this.field338 != -1 || this.field154 != -1) && this.field382 != this.field373) {
                    this.field265 = true;
                    this.field382 = this.field373;
                }
                if ((this.field338 != -1 || this.field154 != -1) && this.field361 != this.field251) {
                    this.field265 = true;
                    this.field251 = this.field361;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field521 - 1; ++var3) {
                        if (this.field237[var3] < 1000 && this.field237[var3 + 1] > 1000) {
                            String var4 = this.field166[var3];
                            this.field166[var3] = this.field166[var3 + 1];
                            this.field166[var3 + 1] = var4;
                            int var5 = this.field237[var3];
                            this.field237[var3] = this.field237[var3 + 1];
                            this.field237[var3 + 1] = var5;
                            int var6 = this.field235[var3];
                            this.field235[var3] = this.field235[var3 + 1];
                            this.field235[var3 + 1] = var6;
                            int var7 = this.field236[var3];
                            this.field236[var3] = this.field236[var3 + 1];
                            this.field236[var3 + 1] = var7;
                            int var8 = this.field238[var3];
                            this.field238[var3] = this.field238[var3 + 1];
                            this.field238[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method127(int arg0, int arg1, int arg2) {
        if (this.field52 == arg2) {
            int var4 = 0;
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field48[var5] != null) {
                    int var6 = this.field46[var5];
                    int var7 = 70 - var4 * 14 + this.field271 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field47[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field226 == 0 || this.field226 == 1 && this.method114(-154, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field446.field830)) {
                            if (this.field95 >= 1) {
                                this.field166[this.field521] = "Report abuse @whi@" + var8;
                                this.field237[this.field521] = 345;
                                ++this.field521;
                            }
                            this.field166[this.field521] = "Add ignore @whi@" + var8;
                            this.field237[this.field521] = 648;
                            ++this.field521;
                            this.field166[this.field521] = "Add friend @whi@" + var8;
                            this.field237[this.field521] = 918;
                            ++this.field521;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field310 == 0 && (var6 == 7 || this.field196 == 0 || this.field196 == 1 && this.method114(-154, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            if (this.field95 >= 1) {
                                this.field166[this.field521] = "Report abuse @whi@" + var8;
                                this.field237[this.field521] = 345;
                                ++this.field521;
                            }
                            this.field166[this.field521] = "Add ignore @whi@" + var8;
                            this.field237[this.field521] = 648;
                            ++this.field521;
                            this.field166[this.field521] = "Add friend @whi@" + var8;
                            this.field237[this.field521] = 918;
                            ++this.field521;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field178 == 0 || this.field178 == 1 && this.method114(-154, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field166[this.field521] = "Accept trade @whi@" + var8;
                            this.field237[this.field521] = 124;
                            ++this.field521;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field310 == 0 && this.field196 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field178 == 0 || this.field178 == 1 && this.method114(-154, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field166[this.field521] = "Accept challenge @whi@" + var8;
                            this.field237[this.field521] = 475;
                            ++this.field521;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)Z")
    public final boolean method128(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 14 & 32767;
        int var6 = this.field130.method479(this.field97, arg0, arg1, arg2);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            int var9 = 29 / arg3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method6(var7 + 1, arg1, field446.field1560[0], false, 0, var8, 2, arg0, 0, field446.field1559[0], false, 0);
            } else {
                class37 var10 = class37.method400(var5);
                int var11;
                int var12;
                if (var8 != 0 && var8 != 2) {
                    var11 = var10.field1168;
                    var12 = var10.field1135;
                } else {
                    var11 = var10.field1135;
                    var12 = var10.field1168;
                }
                int var13 = var10.field1176;
                if (var8 != 0) {
                    var13 = (var13 >> 4 - var8) + (var13 << var8 & 15);
                }
                this.method6(0, arg1, field446.field1560[0], false, var13, 0, 2, arg0, var11, field446.field1559[0], false, var12);
            }
            this.field58 = super.field549;
            this.field59 = super.field550;
            this.field61 = 2;
            this.field60 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNHEPCMLW;II)V")
    public final void method129(class35 arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            this.field365.method339(45);
        }
        if (arg1 == 255) {
            int var4 = arg0.method376(5);
            int var5 = arg0.method367(34652);
            int var6 = (var5 >> 4 & 7) + this.field314;
            int var7 = (var5 & 7) + this.field315;
            int var8 = arg0.method367(34652);
            int var9 = var8 >> 2;
            int var10 = var8 & 3;
            int var11 = this.field360[var9];
            if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                int var12 = this.field106[this.field97][var6][var7];
                int var13 = this.field106[this.field97][var6 + 1][var7];
                int var14 = this.field106[this.field97][var6 + 1][var7 + 1];
                int var15 = this.field106[this.field97][var6][var7 + 1];
                if (var11 == 0) {
                    class71 var16 = this.field130.method471(0, this.field97, var7, var6);
                    if (var16 != null) {
                        int var17 = var16.field1718 >> 14 & 32767;
                        if (var9 == 2) {
                            var16.field1716 = new class6(var12, var4, false, var15, var14, var10 + 4, 2, true, var13, var17);
                            var16.field1717 = new class6(var12, var4, false, var15, var14, var10 + 1 & 3, 2, true, var13, var17);
                        } else {
                            var16.field1716 = new class6(var12, var4, false, var15, var14, var10, var9, true, var13, var17);
                        }
                    }
                }
                if (var11 == 1) {
                    class23 var18 = this.field130.method472(this.field97, var6, false, var7);
                    if (var18 != null) {
                        var18.field990 = new class6(var12, var4, false, var15, var14, 0, 4, true, var13, var18.field991 >> 14 & 32767);
                    }
                }
                if (var11 == 2) {
                    class29 var19 = this.field130.method473(false, this.field97, var6, var7);
                    if (var9 == 11) {
                        var9 = 10;
                    }
                    if (var19 != null) {
                        var19.field1041 = new class6(var12, var4, false, var15, var14, var10, var9, true, var13, var19.field1049 >> 14 & 32767);
                    }
                }
                if (var11 == 3) {
                    class33 var20 = this.field130.method474(var6, 338, this.field97, var7);
                    if (var20 != null) {
                        var20.field1083 = new class6(var12, var4, false, var15, var14, var10, 22, true, var13, var20.field1084 >> 14 & 32767);
                    }
                }
            }
        } else if (arg1 == 203) {
            int var21 = arg0.method369(this.field88);
            int var22 = (var21 >> 4 & 7) + this.field314;
            int var23 = (var21 & 7) + this.field315;
            int var24 = arg0.method351();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                class38 var25 = this.field258[this.field97][var22][var23];
                if (var25 != null) {
                    for (class9 var26 = (class9) var25.method414(); var26 != null; var26 = (class9) var25.method416(this.field406)) {
                        if ((var24 & 32767) == var26.field693) {
                            var26.method336();
                            break;
                        }
                    }
                    if (var25.method414() == null) {
                        this.field258[this.field97][var22][var23] = null;
                    }
                    this.method120(var22, var23);
                }
            }
        } else {
            if (arg1 == 10) {
                int var27 = arg0.method349();
                int var28 = (var27 >> 4 & 7) + this.field314;
                int var29 = (var27 & 7) + this.field315;
                int var30 = arg0.method351();
                int var31 = arg0.method349();
                int var32 = var31 >> 4 & 15;
                int var33 = var31 & 7;
                if (field446.field1559[0] >= var28 - var32 && field446.field1559[0] <= var28 + var32 && field446.field1560[0] >= var29 - var32 && field446.field1560[0] <= var29 + var32 && this.field248 && !field467 && this.field381 < 50) {
                    this.field103[this.field381] = var30;
                    this.field434[this.field381] = var33;
                    this.field200[this.field381] = class26.field1013[var30];
                    ++this.field381;
                }
            }
            if (arg1 == 150) {
                int var34 = arg0.method375(-889);
                int var35 = arg0.method376(5);
                int var36 = arg0.method349();
                int var37 = (var36 >> 4 & 7) + this.field314;
                int var38 = (var36 & 7) + this.field315;
                if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    class9 var39 = new class9();
                    var39.field693 = var35;
                    var39.field692 = var34;
                    if (this.field258[this.field97][var37][var38] == null) {
                        this.field258[this.field97][var37][var38] = new class38((byte) 118);
                    }
                    this.field258[this.field97][var37][var38].method411(var39);
                    this.method120(var37, var38);
                }
            } else if (arg1 == 75) {
                int var40 = arg0.method349();
                int var41 = (var40 >> 4 & 7) + this.field314;
                int var42 = (var40 & 7) + this.field315;
                int var43 = arg0.method351();
                int var44 = arg0.method349();
                int var45 = arg0.method351();
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    int var46 = var41 * 128 + 64;
                    int var47 = var42 * 128 + 64;
                    class65 var48 = new class65(this.field97, var46, true, field505, var43, this.method52(this.field97, var47, -430, var46) - var44, var45, var47);
                    this.field332.method411(var48);
                }
            } else if (arg1 == 42) {
                int var49 = arg0.method349();
                int var50 = (var49 >> 4 & 7) + this.field314;
                int var51 = (var49 & 7) + this.field315;
                int var52 = arg0.method351();
                int var53 = arg0.method351();
                int var54 = arg0.method351();
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    class38 var55 = this.field258[this.field97][var50][var51];
                    if (var55 != null) {
                        for (class9 var56 = (class9) var55.method414(); var56 != null; var56 = (class9) var55.method416(this.field406)) {
                            if ((var52 & 32767) == var56.field693 && var56.field692 == var53) {
                                var56.field692 = var54;
                                break;
                            }
                        }
                        this.method120(var50, var51);
                    }
                }
            } else {
                if (arg1 == 200) {
                    byte var57 = arg0.method350();
                    byte var58 = arg0.method370(984);
                    int var59 = arg0.method367(34652);
                    int var60 = var59 >> 2;
                    int var61 = var59 & 3;
                    int var62 = this.field360[var60];
                    byte var63 = arg0.method371(24248);
                    int var64 = arg0.method351();
                    byte var65 = arg0.method370(984);
                    int var66 = arg0.method351();
                    int var67 = arg0.method376(5);
                    int var68 = arg0.method377(true);
                    int var69 = arg0.method368(0);
                    int var70 = (var69 >> 4 & 7) + this.field314;
                    int var71 = (var69 & 7) + this.field315;
                    class17 var72;
                    if (this.field470 == var66) {
                        var72 = field446;
                    } else {
                        var72 = this.field391[var66];
                    }
                    if (var72 != null) {
                        class37 var73 = class37.method400(var67);
                        int var74 = this.field106[this.field97][var70][var71];
                        int var75 = this.field106[this.field97][var70 + 1][var71];
                        int var76 = this.field106[this.field97][var70 + 1][var71 + 1];
                        int var77 = this.field106[this.field97][var70][var71 + 1];
                        class4 var78 = var73.method408(var60, var61, var74, var75, var76, var77, -1);
                        if (var78 != null) {
                            this.method97(var71, this.field97, -1, var62, (byte) -2, 0, var64 + 1, var70, 0, var68 + 1);
                            var72.field813 = field505 + var68;
                            var72.field814 = field505 + var64;
                            var72.field825 = var78;
                            int var79 = var73.field1135;
                            int var80 = var73.field1168;
                            if (var61 == 1 || var61 == 3) {
                                var79 = var73.field1168;
                                var80 = var73.field1135;
                            }
                            var72.field822 = var70 * 128 + var79 * 64;
                            var72.field824 = var71 * 128 + var80 * 64;
                            var72.field823 = this.method52(this.field97, var72.field824, -430, var72.field822);
                            if (var65 > var58) {
                                byte var81 = var65;
                                var65 = var58;
                                var58 = var81;
                            }
                            if (var63 > var57) {
                                byte var82 = var63;
                                var63 = var57;
                                var57 = var82;
                            }
                            var72.field831 = var65 + var70;
                            var72.field833 = var58 + var70;
                            var72.field832 = var63 + var71;
                            var72.field834 = var57 + var71;
                        }
                    }
                }
                if (arg1 == 238) {
                    int var83 = arg0.method349();
                    int var84 = (var83 >> 4 & 7) + this.field314;
                    int var85 = (var83 & 7) + this.field315;
                    int var86 = var84 + arg0.method350();
                    int var87 = var85 + arg0.method350();
                    int var88 = arg0.method352();
                    int var89 = arg0.method351();
                    int var90 = arg0.method349() * 4;
                    int var91 = arg0.method349() * 4;
                    int var92 = arg0.method351();
                    int var93 = arg0.method351();
                    int var94 = arg0.method349();
                    int var95 = arg0.method349();
                    if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && var89 != 65535) {
                        int var96 = var84 * 128 + 64;
                        int var97 = var85 * 128 + 64;
                        int var98 = var86 * 128 + 64;
                        int var99 = var87 * 128 + 64;
                        class44 var100 = new class44(var97, var96, field505 + var93, field505 + var92, var88, this.field97, 0, this.method52(this.field97, var97, -430, var96) - var90, var89, var95, var91, var94);
                        var100.method429(this.method52(this.field97, var99, -430, var98) - var91, (byte) 6, var98, var99, field505 + var92);
                        this.field519.method411(var100);
                    }
                } else if (arg1 == 241) {
                    int var101 = arg0.method368(0);
                    int var102 = (var101 >> 4 & 7) + this.field314;
                    int var103 = (var101 & 7) + this.field315;
                    int var104 = arg0.method376(5);
                    int var105 = arg0.method368(0);
                    int var106 = var105 >> 2;
                    int var107 = var105 & 3;
                    int var108 = this.field360[var106];
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                        this.method97(var103, this.field97, var104, var108, (byte) -2, var107, -1, var102, var106, 0);
                    }
                } else if (arg1 == 116) {
                    int var109 = arg0.method376(5);
                    int var110 = arg0.method377(true);
                    int var111 = arg0.method349();
                    int var112 = (var111 >> 4 & 7) + this.field314;
                    int var113 = (var111 & 7) + this.field315;
                    int var114 = arg0.method375(-889);
                    if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && this.field470 != var109) {
                        class9 var115 = new class9();
                        var115.field693 = var114;
                        var115.field692 = var110;
                        if (this.field258[this.field97][var112][var113] == null) {
                            this.field258[this.field97][var112][var113] = new class38((byte) 118);
                        }
                        this.field258[this.field97][var112][var113].method411(var115);
                        this.method120(var112, var113);
                    }
                } else if (arg1 == 2) {
                    int var116 = arg0.method369(this.field88);
                    int var117 = (var116 >> 4 & 7) + this.field314;
                    int var118 = (var116 & 7) + this.field315;
                    int var119 = arg0.method367(34652);
                    int var120 = var119 >> 2;
                    int var121 = var119 & 3;
                    int var122 = this.field360[var120];
                    if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                        this.method97(var118, this.field97, -1, var122, (byte) -2, var121, -1, var117, var120, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method130(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field224[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field224[var17] = 192;
        }
        if (arg0 >= 0) {
            this.field140 = -1;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field225[var14] = (this.field224[var14 - 1] + this.field224[var14 + 1] + this.field224[var14 - 128] + this.field224[var14 + 128]) / 4;
            }
        }
        this.field401 += 128;
        if (this.field401 > this.field239.length) {
            this.field401 -= this.field239.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method30((byte) 2, this.field333[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field225[var11 + 128] - this.field239[this.field401 + var11 & this.field239.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field224[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field243[var8] = this.field243[var8 + 1];
        }
        this.field243[var2 - 1] = (int) (Math.sin((double) field505 / 14.0D) * 16.0D + Math.sin((double) field505 / 15.0D) * 14.0D + Math.sin((double) field505 / 16.0D) * 12.0D);
        if (this.field299 > 0) {
            this.field299 -= 4;
        }
        if (this.field300 > 0) {
            this.field300 -= 4;
        }
        if (this.field299 == 0 && this.field300 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field299 = 1024;
            }
            if (var9 == 1) {
                this.field300 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBLZWUMKFUX;)V")
    public final void method131(int arg0, int arg1, byte arg2, class72 arg3) {
        int var5 = this.field325 + this.field308 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = class4.field632[var5];
            int var8 = class4.field633[var5];
            int var9 = var7 * 256 / (this.field301 + 256);
            int var10 = var8 * 256 / (this.field301 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            if (arg2 == 4) {
                if (var6 > 2500) {
                    arg3.method600(var11 + 94 - arg3.field1729 / 2 + 4, this.field447, 83 - var12 - arg3.field1730 / 2 - 4, this.field387);
                } else {
                    arg3.method594(var11 + 94 - arg3.field1729 / 2 + 4, 83 - var12 - arg3.field1730 / 2 - 4, (byte) 8);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method132(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        this.field188.method535((byte) 6);
        if (this.field246 == 2) {
            byte[] var4 = this.field387.field1348;
            int[] var5 = class36.field1124;
            int var6 = var4.length;
            for (int var7 = 0; var7 < var6; ++var7) {
                if (var4[var7] == 0) {
                    var5[var7] = 0;
                }
            }
            this.field461.method598((byte) 4, 33, 256, this.field325, 0, this.field426, 33, this.field413, 0, 25, 25);
            this.field189.method535((byte) 6);
            class62.field1644 = this.field55;
        } else {
            int var8 = this.field325 + this.field308 & 2047;
            int var9 = field446.field1601 / 32 + 48;
            int var10 = 464 - field446.field1602 / 32;
            this.field211.method598((byte) 4, 146, this.field301 + 256, var8, 25, this.field179, 151, this.field133, 5, var10, var9);
            this.field461.method598((byte) 4, 33, 256, this.field325, 0, this.field426, 33, this.field413, 0, 25, 25);
            for (int var11 = 0; var11 < this.field473; ++var11) {
                int var41 = this.field474[var11] * 4 + 2 - field446.field1601 / 32;
                int var42 = this.field475[var11] * 4 + 2 - field446.field1602 / 32;
                this.method131(var42, var41, (byte) 4, this.field64[var11]);
            }
            for (int var12 = 0; var12 < 104; ++var12) {
                for (int var37 = 0; var37 < 104; ++var37) {
                    class38 var38 = this.field258[this.field97][var12][var37];
                    if (var38 != null) {
                        int var39 = var12 * 4 + 2 - field446.field1601 / 32;
                        int var40 = var37 * 4 + 2 - field446.field1602 / 32;
                        this.method131(var40, var39, (byte) 4, this.field499);
                    }
                }
            }
            for (int var13 = 0; var13 < this.field341; ++var13) {
                class67 var33 = this.field340[this.field342[var13]];
                if (var33 != null && var33.method250(29)) {
                    class12 var34 = var33.field1688;
                    if (var34.field738 != null) {
                        var34 = var34.method206(0);
                    }
                    if (var34 != null && var34.field731 && var34.field744) {
                        int var35 = var33.field1601 / 32 - field446.field1601 / 32;
                        int var36 = var33.field1602 / 32 - field446.field1602 / 32;
                        this.method131(var36, var35, (byte) 4, this.field500);
                    }
                }
            }
            for (int var14 = 0; var14 < this.field392; ++var14) {
                class17 var25 = this.field391[this.field393[var14]];
                if (var25 != null && var25.method250(29)) {
                    int var26 = var25.field1601 / 32 - field446.field1601 / 32;
                    int var27 = var25.field1602 / 32 - field446.field1602 / 32;
                    boolean var28 = false;
                    long var29 = class51.method504(var25.field830);
                    for (int var31 = 0; var31 < this.field489; ++var31) {
                        if (this.field93[var31] == var29 && this.field253[var31] != 0) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (field446.field827 != 0 && var25.field827 != 0 && field446.field827 == var25.field827) {
                        var32 = true;
                    }
                    if (var28) {
                        this.method131(var27, var26, (byte) 4, this.field502);
                    } else if (var32) {
                        this.method131(var27, var26, (byte) 4, this.field503);
                    } else {
                        this.method131(var27, var26, (byte) 4, this.field501);
                    }
                }
            }
            if (this.field367 != 0 && field505 % 20 < 10) {
                if (this.field367 == 1 && this.field75 >= 0 && this.field75 < this.field340.length) {
                    class67 var15 = this.field340[this.field75];
                    if (var15 != null) {
                        int var16 = var15.field1601 / 32 - field446.field1601 / 32;
                        int var17 = var15.field1602 / 32 - field446.field1602 / 32;
                        this.method16(var17, var16, 6, this.field320);
                    }
                }
                if (this.field367 == 2) {
                    int var18 = (this.field180 - this.field290) * 4 + 2 - field446.field1601 / 32;
                    int var19 = (this.field181 - this.field291) * 4 + 2 - field446.field1602 / 32;
                    this.method16(var19, var18, 6, this.field320);
                }
                if (this.field367 == 10 && this.field112 >= 0 && this.field112 < this.field391.length) {
                    class17 var20 = this.field391[this.field112];
                    if (var20 != null) {
                        int var21 = var20.field1601 / 32 - field446.field1601 / 32;
                        int var22 = var20.field1602 / 32 - field446.field1602 / 32;
                        this.method16(var22, var21, 6, this.field320);
                    }
                }
            }
            if (this.field209 != 0) {
                int var23 = this.field209 * 4 + 2 - field446.field1601 / 32;
                int var24 = this.field210 * 4 + 2 - field446.field1602 / 32;
                this.method131(var24, var23, (byte) 4, this.field319);
            }
            class36.method393(97, 16777215, 3, 78, 0, 3);
            this.field189.method535((byte) 6);
            class62.field1644 = this.field55;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method133(int arg0) {
        if (arg0 != 1) {
            this.method116();
        }
        if (super.field548 == 1) {
            if (super.field549 >= 539 && super.field549 <= 573 && super.field550 >= 169 && super.field550 < 205 && this.field254[0] != -1) {
                this.field135 = true;
                this.field215 = 0;
                this.field275 = true;
            }
            if (super.field549 >= 569 && super.field549 <= 599 && super.field550 >= 168 && super.field550 < 205 && this.field254[1] != -1) {
                this.field135 = true;
                this.field215 = 1;
                this.field275 = true;
            }
            if (super.field549 >= 597 && super.field549 <= 627 && super.field550 >= 168 && super.field550 < 205 && this.field254[2] != -1) {
                this.field135 = true;
                this.field215 = 2;
                this.field275 = true;
            }
            if (super.field549 >= 625 && super.field549 <= 669 && super.field550 >= 168 && super.field550 < 203 && this.field254[3] != -1) {
                this.field135 = true;
                this.field215 = 3;
                this.field275 = true;
            }
            if (super.field549 >= 666 && super.field549 <= 696 && super.field550 >= 168 && super.field550 < 205 && this.field254[4] != -1) {
                this.field135 = true;
                this.field215 = 4;
                this.field275 = true;
            }
            if (super.field549 >= 694 && super.field549 <= 724 && super.field550 >= 168 && super.field550 < 205 && this.field254[5] != -1) {
                this.field135 = true;
                this.field215 = 5;
                this.field275 = true;
            }
            if (super.field549 >= 722 && super.field549 <= 756 && super.field550 >= 169 && super.field550 < 205 && this.field254[6] != -1) {
                this.field135 = true;
                this.field215 = 6;
                this.field275 = true;
            }
            if (super.field549 >= 540 && super.field549 <= 574 && super.field550 >= 466 && super.field550 < 502 && this.field254[7] != -1) {
                this.field135 = true;
                this.field215 = 7;
                this.field275 = true;
            }
            if (super.field549 >= 572 && super.field549 <= 602 && super.field550 >= 466 && super.field550 < 503 && this.field254[8] != -1) {
                this.field135 = true;
                this.field215 = 8;
                this.field275 = true;
            }
            if (super.field549 >= 599 && super.field549 <= 629 && super.field550 >= 466 && super.field550 < 503 && this.field254[9] != -1) {
                this.field135 = true;
                this.field215 = 9;
                this.field275 = true;
            }
            if (super.field549 >= 627 && super.field549 <= 671 && super.field550 >= 467 && super.field550 < 502 && this.field254[10] != -1) {
                this.field135 = true;
                this.field215 = 10;
                this.field275 = true;
            }
            if (super.field549 >= 669 && super.field549 <= 699 && super.field550 >= 466 && super.field550 < 503 && this.field254[11] != -1) {
                this.field135 = true;
                this.field215 = 11;
                this.field275 = true;
            }
            if (super.field549 >= 696 && super.field549 <= 726 && super.field550 >= 466 && super.field550 < 503 && this.field254[12] != -1) {
                this.field135 = true;
                this.field215 = 12;
                this.field275 = true;
            }
            if (super.field549 >= 724 && super.field549 <= 758 && super.field550 >= 466 && super.field550 < 502 && this.field254[13] != -1) {
                this.field135 = true;
                this.field215 = 13;
                this.field275 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LNHEPCMLW;II)V")
    private final void method134(class35 arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            this.field258 = null;
        }
        this.field101 = 0;
        this.field394 = 0;
        this.method54(467, arg0, arg2);
        this.method83(arg2, arg0, -751);
        this.method77(arg0, arg2, (byte) 2);
        for (int var4 = 0; var4 < this.field101; ++var4) {
            int var6 = this.field102[var4];
            if (field505 != this.field340[var6].field1561) {
                this.field340[var6].field1688 = null;
                this.field340[var6] = null;
            }
        }
        if (arg0.field1107 != arg2) {
            signlink.reporterror(this.field137 + " size mismatch in getnpcpos - pos:" + arg0.field1107 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field341; ++var5) {
                if (this.field340[this.field342[var5]] == null) {
                    signlink.reporterror(this.field137 + " null entry in npc list - pos:" + var5 + " size:" + this.field341);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg3 & 2047;
        if (arg4 < 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = arg0;
            if (var8 != 0) {
                int var13 = class4.field632[var8];
                int var14 = class4.field633[var8];
                int var15 = var11 * var14 - arg0 * var13 >> 16;
                var12 = var11 * var13 + arg0 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = class4.field632[var9];
                int var17 = class4.field633[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field66 = arg6 - var10;
            this.field67 = arg2 - var11;
            this.field68 = arg1 - var12;
            this.field69 = arg5;
            this.field70 = arg3;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILHDYGEGXY;I)V")
    public final void method136(int arg0, int arg1, int arg2, class17 arg3, int arg4) {
        if (field446 != arg3) {
            if (this.field521 < 400) {
                String var6;
                if (arg3.field807 == 0) {
                    var6 = arg3.field830 + method5(arg3.field819, 0, field446.field819) + " (level-" + arg3.field819 + ")";
                } else {
                    var6 = arg3.field830 + " (skill-" + arg3.field807 + ")";
                }
                if (this.field480 == 1) {
                    this.field166[this.field521] = "Use " + this.field484 + " with @whi@" + var6;
                    this.field237[this.field521] = 265;
                    this.field238[this.field521] = arg1;
                    this.field235[this.field521] = arg4;
                    this.field236[this.field521] = arg2;
                    ++this.field521;
                } else if (this.field171 == 1) {
                    if ((this.field173 & 8) == 8) {
                        this.field166[this.field521] = this.field174 + " @whi@" + var6;
                        this.field237[this.field521] = 318;
                        this.field238[this.field521] = arg1;
                        this.field235[this.field521] = arg4;
                        this.field236[this.field521] = arg2;
                        ++this.field521;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field286[var7] != null) {
                            this.field166[this.field521] = this.field286[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field286[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field819 > field446.field819) {
                                    var9 = 2000;
                                }
                                if (field446.field827 != 0 && arg3.field827 != 0) {
                                    if (field446.field827 == arg3.field827) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field287[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field237[this.field521] = var9 + 355;
                            }
                            if (var7 == 1) {
                                this.field237[this.field521] = var9 + 518;
                            }
                            if (var7 == 2) {
                                this.field237[this.field521] = var9 + 461;
                            }
                            if (var7 == 3) {
                                this.field237[this.field521] = var9 + 996;
                            }
                            if (var7 == 4) {
                                this.field237[this.field521] = var9 + 408;
                            }
                            this.field238[this.field521] = arg1;
                            this.field235[this.field521] = arg4;
                            this.field236[this.field521] = arg2;
                            ++this.field521;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field521; ++var8) {
                    if (this.field237[var8] == 872) {
                        this.field166[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg0 != 6) {
                    this.field140 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method137(byte arg0) {
        if (this.field367 == 2) {
            this.method90((this.field181 - this.field291 << 7) + this.field184, (this.field180 - this.field290 << 7) + this.field183, true, this.field182 * 2);
            if (arg0 == 2) {
                boolean var2 = false;
                if (this.field377 > -1 && field505 % 20 < 10) {
                    this.field398[0].method594(this.field377 - 12, this.field378 - 28, (byte) 8);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method138(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field362 = "";
                this.field363 = "Connecting to server...";
                this.method71(true, true);
            }
            this.field146 = new class64(this, 0, this.method139(field465 + 43594));
            long var4 = class51.method504(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field365.field1107 = 0;
            this.field365.method339(14);
            this.field365.method339(var6);
            this.field146.method582(this.field365.field1106, 2, 29470, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field146.method579();
            }
            int var8 = this.field146.method579();
            int var9 = var8;
            if (var8 == 0) {
                this.field146.method581(this.field423.field1106, 0, 8);
                this.field423.field1107 = 0;
                this.field153 = this.field423.method355(-584);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field153 >> 32), (int) this.field153 };
                this.field365.field1107 = 0;
                this.field365.method339(10);
                this.field365.method343(var10[0]);
                this.field365.method343(var10[1]);
                this.field365.method343(var10[2]);
                this.field365.method343(var10[3]);
                this.field365.method343(signlink.uid);
                this.field365.method346(arg0);
                this.field365.method346(arg1);
                this.field365.method364(false, field199, field132);
                this.field257.field1107 = 0;
                if (arg2) {
                    this.field257.method339(18);
                } else {
                    this.field257.method339(16);
                }
                this.field257.method339(this.field365.field1107 + 36 + 1 + 1 + 2);
                this.field257.method339(255);
                this.field257.method340(339);
                this.field257.method339(field467 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field257.method343(this.field358[var11]);
                }
                this.field257.method347(this.field365.field1107, this.field365.field1106, 0, 0);
                this.field365.field1111 = new class22(var10, this.field264);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field353 = new class22(var10, this.field264);
                this.field146.method582(this.field257.field1106, this.field257.field1107, 29470, 0);
                var8 = this.field146.method579();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method138(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field95 = this.field146.method579();
                field488 = this.field146.method579() == 1;
                this.field399 = 0L;
                this.field78 = 0;
                this.field74.field1059 = 0;
                super.field539 = true;
                this.field433 = true;
                this.field410 = true;
                this.field365.field1107 = 0;
                this.field423.field1107 = 0;
                this.field140 = -1;
                this.field407 = -1;
                this.field408 = -1;
                this.field409 = -1;
                this.field139 = 0;
                this.field141 = 0;
                this.field376 = 0;
                this.field143 = 0;
                this.field367 = 0;
                this.field521 = 0;
                this.field152 = false;
                super.field540 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field48[var13] = null;
                }
                this.field480 = 0;
                this.field171 = 0;
                this.field273 = 0;
                this.field381 = 0;
                this.field90 = (int) (Math.random() * 100.0D) - 50;
                this.field485 = (int) (Math.random() * 110.0D) - 55;
                this.field121 = (int) (Math.random() * 80.0D) - 40;
                this.field308 = (int) (Math.random() * 120.0D) - 60;
                this.field301 = (int) (Math.random() * 30.0D) - 20;
                this.field325 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field246 = 0;
                this.field38 = -1;
                this.field209 = 0;
                this.field210 = 0;
                this.field392 = 0;
                this.field341 = 0;
                for (int var14 = 0; var14 < this.field389; ++var14) {
                    this.field391[var14] = null;
                    this.field396[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field340[var15] = null;
                }
                field446 = this.field391[this.field390] = new class17();
                this.field519.method418();
                this.field332.method418();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field258[var16][var17][var18] = null;
                        }
                    }
                }
                this.field402 = new class38((byte) 118);
                this.field490 = 0;
                this.field489 = 0;
                this.method121(this.field154, false);
                this.field154 = -1;
                this.method121(this.field338, false);
                this.field338 = -1;
                this.method121(this.field312, false);
                this.field312 = -1;
                this.method121(this.field197, false);
                this.field197 = -1;
                this.method121(this.field468, false);
                this.field468 = -1;
                this.method121(this.field420, false);
                this.field420 = -1;
                this.method121(this.field45, false);
                this.field45 = -1;
                this.field185 = false;
                this.field215 = 3;
                this.field191 = 0;
                this.field152 = false;
                this.field356 = false;
                this.field435 = null;
                this.field129 = 0;
                this.field364 = -1;
                this.field306 = true;
                this.method122(false);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field242[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field286[var20] = null;
                    this.field287[var20] = false;
                }
                field150 = 0;
                field214 = 0;
                field76 = 0;
                field352 = 0;
                field412 = 0;
                field368 = 0;
                field385 = 0;
                field123 = 0;
                field443 = 0;
                field213 = 0;
                this.method57((byte) -21);
            } else if (var8 == 3) {
                this.field362 = "";
                this.field363 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field362 = "Your account has been disabled.";
                this.field363 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field362 = "Your account is already logged in.";
                this.field363 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field362 = "RuneScape has been updated!";
                this.field363 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field362 = "This world is full.";
                this.field363 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field362 = "Unable to connect.";
                this.field363 = "Login server offline.";
            } else if (var8 == 9) {
                this.field362 = "Login limit exceeded.";
                this.field363 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field362 = "Unable to connect.";
                this.field363 = "Bad session id.";
            } else if (var8 == 11) {
                this.field362 = "Login server rejected session.";
                this.field363 = "Please try again.";
            } else if (var8 == 12) {
                this.field362 = "You need a members account to login to this world.";
                this.field363 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field362 = "Could not complete login.";
                this.field363 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field362 = "The server is being updated.";
                this.field363 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field410 = true;
                this.field365.field1107 = 0;
                this.field423.field1107 = 0;
                this.field140 = -1;
                this.field407 = -1;
                this.field408 = -1;
                this.field409 = -1;
                this.field139 = 0;
                this.field141 = 0;
                this.field376 = 0;
                this.field521 = 0;
                this.field152 = false;
                this.field194 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field362 = "Login attempts exceeded.";
                this.field363 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field362 = "You are standing in a members-only area.";
                this.field363 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field362 = "Invalid loginserver requested";
                this.field363 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field362 = "Malformed login packet.";
                    this.field363 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field322 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field322;
                            this.method138(arg0, arg1, arg2);
                        } else {
                            this.field362 = "No response from loginserver";
                            this.field363 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field362 = "No response from server";
                        this.field363 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field362 = "Unexpected server response";
                    this.field363 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field146.method579();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field362 = "You have only just left another world";
                    this.field363 = "Your profile will be transferred in: " + var26;
                    this.method71(true, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method138(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field362 = "";
            this.field363 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method139(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method140(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field328 = -304;
        }
        class20 var3 = class20.method269(arg0);
        for (int var4 = 0; var4 < var3.field950.length && var3.field950[var4] != -1; ++var4) {
            class20 var5 = class20.method269(var3.field950[var4]);
            if (var5.field894 == 1) {
                this.method140(var5.field898, 0);
            }
            var5.field939 = 0;
            var5.field908 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method141(int arg0) {
        this.field431 = new class47(this.field288, "titlebox", 0);
        this.field432 = new class47(this.field288, "titlebutton", 0);
        this.field333 = new class47[12];
        int var2 = 0;
        int var3 = 18 / arg0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var20) {
        }
        if (var2 == 0) {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field333[var4] = new class47(this.field288, "runes", var4);
            }
        } else {
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field333[var5] = new class47(this.field288, "runes", (var5 & 3) + 12);
            }
        }
        this.field71 = new class72(128, 265);
        this.field72 = new class72(128, 265);
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field71.field1724[var6] = this.field160.field1542[var6];
        }
        for (int var7 = 0; var7 < 33920; ++var7) {
            this.field72.field1724[var7] = this.field161.field1542[var7];
        }
        this.field492 = new int[256];
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field492[var8] = var8 * 262144;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field492[var9 + 64] = var9 * 1024 + 16711680;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field492[var10 + 128] = var10 * 4 + 16776960;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field492[var11 + 192] = 16777215;
        }
        this.field493 = new int[256];
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field493[var12] = var12 * 1024;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field493[var13 + 64] = var13 * 4 + 65280;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field493[var14 + 128] = var14 * 262144 + 65535;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field493[var15 + 192] = 16777215;
        }
        this.field494 = new int[256];
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field494[var16] = var16 * 4;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field494[var17 + 64] = var17 * 262144 + 255;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field494[var18 + 128] = var18 * 1024 + 16711935;
        }
        for (int var19 = 0; var19 < 64; ++var19) {
            this.field494[var19 + 192] = 16777215;
        }
        this.field491 = new int[256];
        this.field239 = new int[32768];
        this.field240 = new int[32768];
        this.method30((byte) 2, (class47) null);
        this.field224 = new int[32768];
        this.field225 = new int[32768];
        this.method32(3, 10, "Connecting to fileserver");
        if (!this.field424) {
            this.field219 = true;
            this.field424 = true;
            this.method74(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLHZINZKXF;)V")
    public final void method142(boolean arg0, class20 arg1) {
        if (!arg0) {
            this.method116();
        }
        int var3 = arg1.field961;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field489;
                if (this.field490 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field900 = "";
                    arg1.field953 = 0;
                } else {
                    if (this.field253[var3] == 0) {
                        arg1.field900 = "@red@Offline";
                    } else if (this.field253[var3] < 200) {
                        if (this.field253[var3] == field464) {
                            arg1.field900 = "@gre@World-" + (this.field253[var3] - 9);
                        } else {
                            arg1.field900 = "@yel@World-" + (this.field253[var3] - 9);
                        }
                    } else if (this.field253[var3] == field464) {
                        arg1.field900 = "@gre@Classic" + (this.field253[var3] - 219);
                    } else {
                        arg1.field900 = "@yel@Classic" + (this.field253[var3] - 219);
                    }
                    arg1.field953 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field489;
                if (this.field490 != 2) {
                    var6 = 0;
                }
                arg1.field926 = var6 * 15 + 20;
                if (arg1.field926 <= arg1.field895) {
                    arg1.field926 = arg1.field895 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field490 == 0) {
                    arg1.field900 = "Loading ignore list";
                    arg1.field953 = 0;
                } else if (var3 == 1 && this.field490 == 0) {
                    arg1.field900 = "Please wait...";
                    arg1.field953 = 0;
                } else {
                    int var7 = this.field460;
                    if (this.field490 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field900 = "";
                        arg1.field953 = 0;
                    } else {
                        arg1.field900 = class51.method508(class51.method505(4, this.field41[var3]), 0);
                        arg1.field953 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field926 = this.field460 * 15 + 20;
                if (arg1.field926 <= arg1.field895) {
                    arg1.field926 = arg1.field895 + 1;
                }
            } else if (var3 == 327) {
                arg1.field935 = 150;
                arg1.field936 = (int) (Math.sin((double) field505 / 40.0D) * 256.0D) & 2047;
                if (this.field63) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field344[var8];
                        if (var15 >= 0 && !class46.field1339[var15].method433(-793)) {
                            return;
                        }
                    }
                    this.field63 = false;
                    class4[] var9 = new class4[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field344[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class46.field1339[var14].method434(201);
                        }
                    }
                    class4 var12 = new class4(var10, -39808, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field242[var13] != 0) {
                            var12.method174(field175[var13][0], field175[var13][this.field242[var13]]);
                            if (var13 == 1) {
                                var12.method174(field311[0], field311[this.field242[var13]]);
                            }
                        }
                    }
                    var12.method167(7);
                    var12.method168(false, class42.field1219[field446.field1599].field1221[0]);
                    var12.method177(64, 850, -30, -50, -30, true);
                    arg1.field910 = 5;
                    arg1.field911 = 0;
                    class20.method266(0, true, 5, var12);
                }
            } else if (var3 == 324) {
                if (this.field478 == null) {
                    this.field478 = arg1.field960;
                    this.field479 = arg1.field955;
                }
                if (this.field306) {
                    arg1.field960 = this.field479;
                } else {
                    arg1.field960 = this.field478;
                }
            } else if (var3 == 325) {
                if (this.field478 == null) {
                    this.field478 = arg1.field960;
                    this.field479 = arg1.field955;
                }
                if (this.field306) {
                    arg1.field960 = this.field478;
                } else {
                    arg1.field960 = this.field479;
                }
            } else if (var3 == 600) {
                arg1.field900 = this.field266;
                if (field505 % 20 < 10) {
                    arg1.field900 = arg1.field900 + "|";
                } else {
                    arg1.field900 = arg1.field900 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field95 >= 1) {
                        if (this.field303) {
                            arg1.field932 = 16711680;
                            arg1.field900 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field932 = 16777215;
                            arg1.field900 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field900 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field444 - this.field284;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field900 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field321 == 0) {
                        arg1.field900 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field321 <= this.field444) {
                        arg1.field900 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method143(this.field321, 622);
                    } else {
                        int var18 = this.field444 + 14 - this.field321;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field900 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method143(this.field321, 622) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field294 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field294 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field294 + " unread messages";
                    }
                    arg1.field900 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field471 > 0 && this.field471 <= this.field444 + 10) {
                        arg1.field900 = "Last password change:\\n@gre@" + this.method143(this.field471, 622);
                    } else {
                        arg1.field900 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 664) {
                    if (this.field43 == 0) {
                        arg1.field900 = "You have not yet set\\nany contact details.";
                    }
                    if (this.field43 == 1) {
                        arg1.field900 = "Contact Details Last Set:\\n@gre@" + this.method143(this.field282, 622);
                    }
                    if (this.field43 == 2) {
                        arg1.field900 = "You need to set\\nnew contact details.";
                    }
                }
                if (var3 == 665) {
                    if (this.field201 > 2 && !field466) {
                        arg1.field900 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field201 > 2) {
                        arg1.field900 = "\\n\\nYou have @gre@" + this.field201 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field201 > 0) {
                        arg1.field900 = "You have @gre@" + this.field201 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field900 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field201 > 2 && !field466) {
                        arg1.field900 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field201 > 0) {
                        arg1.field900 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field900 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field321 > this.field444) {
                        arg1.field900 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field900 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field490 == 0) {
            arg1.field900 = "Loading friend list";
            arg1.field953 = 0;
        } else if (var3 == 1 && this.field490 == 1) {
            arg1.field900 = "Connecting to friendserver";
            arg1.field953 = 0;
        } else if (var3 == 2 && this.field490 != 2) {
            arg1.field900 = "Please wait...";
            arg1.field953 = 0;
        } else {
            int var4 = this.field489;
            if (this.field490 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field900 = "";
                arg1.field953 = 0;
            } else {
                arg1.field900 = this.field109[var3];
                arg1.field953 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    public final String method143(int arg0, int arg1) {
        int var3 = 44 / arg1;
        if (arg0 > this.field444 + 10) {
            return "Unknown";
        } else {
            long var4 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var6 = Calendar.getInstance();
            var6.setTime(new Date(var4));
            int var7 = var6.get(5);
            int var8 = var6.get(2);
            int var9 = var6.get(1);
            String[] var10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var7 + "-" + var10[var8] + "-" + var9;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method144(byte arg0) {
        try {
            if (this.field146 != null) {
                this.field146.method578();
            }
        } catch (Exception var3) {
        }
        this.field146 = null;
        this.field410 = false;
        this.field350 = 0;
        this.field137 = "";
        this.field138 = "";
        this.method45(false);
        this.field130.method449(true);
        if (arg0 != -81) {
            field57 = 437;
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field221[var2].method188();
        }
        System.gc();
        this.method19(0);
        this.field156 = -1;
        this.field168 = -1;
        this.field316 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
    public final void method145(int arg0, String arg1, String arg2) {
        if (arg0 <= 0) {
            this.method116();
        }
        if (this.field189 != null) {
            this.field189.method535((byte) 6);
            class62.field1644 = this.field55;
            int var4 = 151;
            if (arg2 != null) {
                var4 -= 7;
            }
            this.field428.method212(0, 257, arg1, (byte) 6, var4);
            this.field428.method212(16777215, 256, arg1, (byte) 6, var4 - 1);
            var4 += 15;
            if (arg2 != null) {
                this.field428.method212(0, 257, arg2, (byte) 6, var4);
                this.field428.method212(16777215, 256, arg2, (byte) 6, var4 - 1);
            }
            this.field189.method536(4, 5, 4, super.field534);
        } else if (super.field535 != null) {
            super.field535.method535((byte) 6);
            class62.field1644 = this.field56;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class36.method393(383 - var6 / 2, 0, var7, var5 - 5 - var7 / 2, 0, var6);
            class36.method394(16777215, (byte) 52, var5 - 5 - var7 / 2, var6, var7, 383 - var6 / 2);
            if (arg2 != null) {
                var5 -= 7;
            }
            this.field428.method212(0, 383, arg1, (byte) 6, var5);
            this.field428.method212(16777215, 382, arg1, (byte) 6, var5 - 1);
            var5 += 15;
            if (arg2 != null) {
                this.field428.method212(0, 383, arg2, (byte) 6, var5);
                this.field428.method212(16777215, 382, arg2, (byte) 6, var5 - 1);
            }
            super.field535.method536(0, 5, 0, super.field534);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
        if (arg0) {
            int var2 = 5;
            this.field358[8] = 0;
            int var3 = 0;
            while (this.field358[8] == 0) {
                String var4 = "Unknown problem";
                this.method32(3, 20, "Connecting to web server");
                try {
                    DataInputStream var5 = this.method86("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 339);
                    class35 var6 = new class35((byte) -103, new byte[40]);
                    var5.readFully(var6.field1106, 0, 40);
                    var5.close();
                    for (int var7 = 0; var7 < 9; ++var7) {
                        this.field358[var7] = var6.method354();
                    }
                    int var8 = var6.method354();
                    int var9 = 1234;
                    for (int var10 = 0; var10 < 9; ++var10) {
                        var9 = (var9 << 1) + this.field358[var10];
                    }
                    if (var8 != var9) {
                        var4 = "checksum problem";
                        this.field358[8] = 0;
                    }
                } catch (EOFException var13) {
                    var4 = "EOF problem";
                    this.field358[8] = 0;
                } catch (IOException var14) {
                    var4 = "connection problem";
                    this.field358[8] = 0;
                } catch (Exception var15) {
                    var4 = "logic problem";
                    this.field358[8] = 0;
                    if (!signlink.reporterror) {
                        return;
                    }
                }
                if (this.field358[8] == 0) {
                    ++var3;
                    for (int var11 = var2; var11 > 0; --var11) {
                        if (var3 >= 10) {
                            this.method32(3, 10, "Game updated - please reload page");
                            var11 = 10;
                        } else {
                            this.method32(3, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                    this.field245 = !this.field245;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method147(byte arg0) {
        if (arg0 != 92) {
            this.method116();
        }
        while (true) {
            class70 var2 = this.field40.method526();
            if (var2 == null) {
                return;
            }
            if (var2.field1707 == 0) {
                class4.method158(var2.field1709, this.field186, var2.field1706);
                if ((this.field40.method524(var2.field1709, 9) & 98) != 0) {
                    this.field135 = true;
                    if (this.field338 != -1 || this.field154 != -1) {
                        this.field265 = true;
                    }
                }
            }
            if (var2.field1707 == 1 && var2.field1706 != null) {
                class25.method282(var2.field1706, false);
            }
            if (var2.field1707 == 2 && this.field168 == var2.field1709 && var2.field1706 != null) {
                this.method11(var2.field1706, 0, this.field169);
            }
            if (var2.field1707 == 3 && this.field273 == 1) {
                for (int var3 = 0; var3 < this.field439.length; ++var3) {
                    if (this.field261[var3] == var2.field1709) {
                        this.field439[var3] = var2.field1706;
                        if (var2.field1706 == null) {
                            this.field261[var3] = -1;
                        }
                        break;
                    }
                    if (this.field262[var3] == var2.field1709) {
                        this.field305[var3] = var2.field1706;
                        if (var2.field1706 == null) {
                            this.field262[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1707 == 93 && this.field40.method521(var2.field1709, this.field487)) {
                class14.method239(new class35((byte) -103, var2.field1706), this.field40, 7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(II)V")
    public final void method148(int arg0, int arg1) {
        int[] var3 = this.field211.field1724;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field343[arg1][var24][var6] & 24) == 0) {
                    this.field130.method484(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field343[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field130.method484(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field211.method589((byte) 6);
        while (arg0 >= 0) {
            this.field140 = -1;
        }
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field343[arg1][var22][var9] & 24) == 0) {
                    this.method44(var9, var8, var7, 656, arg1, var22);
                }
                if (arg1 < 3 && (this.field343[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method44(var9, var8, var7, 656, arg1 + 1, var22);
                }
            }
        }
        if (this.field189 != null) {
            this.field189.method535((byte) 6);
            class62.field1644 = this.field55;
        }
        this.field473 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field130.method478(this.field97, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class37.method400(var13).field1184;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field221[this.field97].field691;
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
                        this.field64[this.field473] = this.field334[var14];
                        this.field474[this.field473] = var15;
                        this.field475[this.field473] = var16;
                        ++this.field473;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)Z")
    public final boolean method149(int arg0) {
        while (arg0 >= 0) {
            this.field140 = -1;
        }
        if (this.field146 == null) {
            return false;
        } else {
            try {
                int var2 = this.field146.method580();
                if (var2 == 0) {
                    return false;
                }
                if (this.field140 == -1) {
                    this.field146.method581(this.field423.field1106, 0, 1);
                    this.field140 = this.field423.field1106[0] & 255;
                    if (this.field353 != null) {
                        this.field140 = this.field140 - this.field353.method278() & 255;
                    }
                    this.field139 = class18.field838[this.field140];
                    --var2;
                }
                if (this.field139 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field146.method581(this.field423.field1106, 0, 1);
                    this.field139 = this.field423.field1106[0] & 255;
                    --var2;
                }
                if (this.field139 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field146.method581(this.field423.field1106, 0, 2);
                    this.field423.field1107 = 0;
                    this.field139 = this.field423.method351();
                    var2 -= 2;
                }
                if (var2 < this.field139) {
                    return false;
                }
                this.field423.field1107 = 0;
                this.field146.method581(this.field423.field1106, 0, this.field139);
                this.field141 = 0;
                this.field409 = this.field408;
                this.field408 = this.field407;
                this.field407 = this.field140;
                if (this.field140 == 46) {
                    if (this.field215 == 12) {
                        this.field135 = true;
                    }
                    this.field318 = this.field423.method352();
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 38) {
                    this.method72(this.field139, this.field423, false);
                    this.field289 = false;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 221) {
                    this.field356 = false;
                    this.field191 = 2;
                    this.field96 = "";
                    this.field265 = true;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 59) {
                    int var3 = this.field423.method351();
                    int var4 = this.field423.method380((byte) 81);
                    class20 var5 = class20.method269(var3);
                    if (var5.field912 != var4 || var4 == -1) {
                        var5.field912 = var4;
                        var5.field939 = 0;
                        var5.field908 = 0;
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 170) {
                    int var6 = this.field423.method375(-889);
                    int var7 = this.field423.method377(true);
                    class20.method269(var6).field910 = 1;
                    class20.method269(var6).field911 = var7;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 111) {
                    this.field383 = true;
                    this.field228 = this.field423.method349();
                    this.field229 = this.field423.method349();
                    this.field230 = this.field423.method351();
                    this.field231 = this.field423.method349();
                    this.field232 = this.field423.method349();
                    if (this.field232 >= 100) {
                        this.field66 = this.field228 * 128 + 64;
                        this.field68 = this.field229 * 128 + 64;
                        this.field67 = this.method52(this.field97, this.field68, -430, this.field66) - this.field230;
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 67) {
                    int var8 = this.field423.method377(true);
                    int var9 = this.field423.method379(-296);
                    int var10 = this.field423.method352();
                    class20 var11 = class20.method269(var8);
                    var11.field964 = var10;
                    var11.field943 = var9;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 193) {
                    this.field77 = this.field423.method368(0);
                    this.field470 = this.field423.method351();
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 176) {
                    this.field490 = this.field423.method349();
                    this.field135 = true;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 118) {
                    for (int var12 = 0; var12 < this.field134.length; ++var12) {
                        if (this.field496[var12] != this.field134[var12]) {
                            this.field134[var12] = this.field496[var12];
                            this.method85(true, var12);
                            this.field135 = true;
                        }
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 163) {
                    int var13 = this.field423.method377(true);
                    byte var14 = this.field423.method370(984);
                    this.field496[var13] = var14;
                    if (this.field134[var13] != var14) {
                        this.field134[var13] = var14;
                        this.method85(true, var13);
                        this.field135 = true;
                        if (this.field154 != -1) {
                            this.field265 = true;
                        }
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 119) {
                    long var15 = this.field423.method355(-584);
                    int var17 = this.field423.method354();
                    int var18 = this.field423.method349();
                    boolean var19 = false;
                    for (int var20 = 0; var20 < 100; ++var20) {
                        if (this.field441[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                    if (var18 <= 1) {
                        for (int var21 = 0; var21 < this.field460; ++var21) {
                            if (this.field41[var21] == var15) {
                                var19 = true;
                                break;
                            }
                        }
                    }
                    if (!var19 && this.field274 == 0) {
                        try {
                            this.field441[this.field89] = var17;
                            this.field89 = (this.field89 + 1) % 100;
                            String var22 = class30.method331(this.field139 - 13, true, this.field423);
                            if (var18 != 3) {
                                var22 = class27.method302(this.field328, var22);
                            }
                            if (var18 != 2 && var18 != 3) {
                                if (var18 == 1) {
                                    this.method106("@cr1@" + class51.method508(class51.method505(4, var15), 0), 0, var22, 7);
                                } else {
                                    this.method106(class51.method508(class51.method505(4, var15), 0), 0, var22, 3);
                                }
                            } else {
                                this.method106("@cr2@" + class51.method508(class51.method505(4, var15), 0), 0, var22, 7);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 41) {
                    this.method134(this.field423, -934, this.field139);
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 227) {
                    this.field220 = this.field423.method382(true);
                    this.field471 = this.field423.method376(5);
                    this.field444 = this.field423.method376(5);
                    this.field73 = this.field423.method375(-889);
                    this.field321 = this.field423.method375(-889);
                    this.field284 = this.field423.method375(-889);
                    this.field445 = this.field423.method351();
                    this.field43 = this.field423.method369(this.field88);
                    this.field294 = this.field423.method377(true);
                    this.field282 = this.field423.method377(true);
                    this.field201 = this.field423.method351();
                    signlink.dnslookup(class51.method507(-325, this.field220));
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 212) {
                    int var24 = this.field423.method351();
                    this.method140(var24, 0);
                    if (this.field420 != -1) {
                        this.method121(this.field420, false);
                        this.field420 = -1;
                        this.field135 = true;
                        this.field275 = true;
                    }
                    if (this.field197 != -1) {
                        this.method121(this.field197, false);
                        this.field197 = -1;
                        this.field256 = true;
                    }
                    if (this.field468 != -1) {
                        this.method121(this.field468, false);
                        this.field468 = -1;
                    }
                    if (this.field312 != -1) {
                        this.method121(this.field312, false);
                        this.field312 = -1;
                    }
                    if (this.field338 != var24) {
                        this.method121(this.field338, false);
                        this.field338 = var24;
                    }
                    this.field185 = false;
                    this.field265 = true;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 28) {
                    int var25 = this.field423.method377(true);
                    int var26 = this.field423.method376(5);
                    this.method140(var25, 0);
                    if (var26 != -1) {
                        this.method140(var26, 0);
                    }
                    if (this.field312 != -1) {
                        this.method121(this.field312, false);
                        this.field312 = -1;
                    }
                    if (this.field420 != -1) {
                        this.method121(this.field420, false);
                        this.field420 = -1;
                    }
                    if (this.field338 != -1) {
                        this.method121(this.field338, false);
                        this.field338 = -1;
                    }
                    if (this.field197 != var25) {
                        this.method121(this.field197, false);
                        this.field197 = var25;
                    }
                    if (this.field468 != var25) {
                        this.method121(this.field468, false);
                        this.field468 = var26;
                    }
                    this.field191 = 0;
                    this.field185 = false;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 190) {
                    int var27 = this.field423.method380((byte) 81);
                    if (var27 >= 0) {
                        this.method140(var27, 0);
                    }
                    if (this.field45 != var27) {
                        this.method121(this.field45, false);
                        this.field45 = var27;
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 23) {
                    long var28 = this.field423.method355(-584);
                    int var30 = this.field423.method349();
                    String var31 = class51.method508(class51.method505(4, var28), 0);
                    for (int var32 = 0; var32 < this.field489; ++var32) {
                        if (this.field93[var32] == var28) {
                            if (this.field253[var32] != var30) {
                                this.field253[var32] = var30;
                                this.field135 = true;
                                if (var30 > 0) {
                                    this.method106("", 0, var31 + " has logged in.", 5);
                                }
                                if (var30 == 0) {
                                    this.method106("", 0, var31 + " has logged out.", 5);
                                }
                            }
                            var31 = null;
                            break;
                        }
                    }
                    if (var31 != null && this.field489 < 200) {
                        this.field93[this.field489] = var28;
                        this.field109[this.field489] = var31;
                        this.field253[this.field489] = var30;
                        ++this.field489;
                        this.field135 = true;
                    }
                    boolean var33 = false;
                    while (!var33) {
                        var33 = true;
                        for (int var34 = 0; var34 < this.field489 - 1; ++var34) {
                            if (this.field253[var34] != field464 && this.field253[var34 + 1] == field464 || this.field253[var34] == 0 && this.field253[var34 + 1] != 0) {
                                int var35 = this.field253[var34];
                                this.field253[var34] = this.field253[var34 + 1];
                                this.field253[var34 + 1] = var35;
                                String var36 = this.field109[var34];
                                this.field109[var34] = this.field109[var34 + 1];
                                this.field109[var34 + 1] = var36;
                                long var37 = this.field93[var34];
                                this.field93[var34] = this.field93[var34 + 1];
                                this.field93[var34 + 1] = var37;
                                this.field135 = true;
                                var33 = false;
                            }
                        }
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 229) {
                    this.field135 = true;
                    int var39 = this.field423.method351();
                    class20 var40 = class20.method269(var39);
                    while (this.field423.field1107 < this.field139) {
                        int var41 = this.field423.method363();
                        int var42 = this.field423.method351();
                        int var43 = this.field423.method349();
                        if (var43 == 255) {
                            var43 = this.field423.method354();
                        }
                        if (var41 >= 0 && var41 < var40.field946.length) {
                            var40.field946[var41] = var42;
                            var40.field944[var41] = var43;
                        }
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 216) {
                    if (this.field215 == 12) {
                        this.field135 = true;
                    }
                    this.field51 = this.field423.method349();
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 76) {
                    String var44 = this.field423.method356();
                    int var45 = this.field423.method369(this.field88);
                    int var46 = this.field423.method349();
                    if (var45 >= 1 && var45 <= 5) {
                        if (var44.equalsIgnoreCase("null")) {
                            var44 = null;
                        }
                        this.field286[var45 - 1] = var44;
                        this.field287[var45 - 1] = var46 == 0;
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 52) {
                    int var47 = this.field423.method349();
                    int var48 = this.field423.method349();
                    int var49 = this.field423.method349();
                    int var50 = this.field423.method349();
                    this.field422[var47] = true;
                    this.field323[var47] = var48;
                    this.field285[var47] = var49;
                    this.field448[var47] = var50;
                    this.field384[var47] = 0;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 5) {
                    int var51 = this.field423.method377(true);
                    class20.method269(var51).field910 = 3;
                    if (field446.field815 == null) {
                        class20.method269(var51).field911 = (field446.field816[11] << 5) + (field446.field816[8] << 10) + (field446.field816[0] << 15) + (field446.field806[0] << 25) + (field446.field806[4] << 20) + field446.field816[1];
                    } else {
                        class20.method269(var51).field911 = (int) (field446.field815.field734 + 305419896L);
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 153) {
                    this.field314 = this.field423.method369(this.field88);
                    this.field315 = this.field423.method349();
                    while (this.field423.field1107 < this.field139) {
                        int var52 = this.field423.method349();
                        this.method129(this.field423, var52, 151);
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 11) {
                    this.field364 = this.field423.method349();
                    if (this.field364 == this.field215) {
                        if (this.field364 == 3) {
                            this.field215 = 1;
                        } else {
                            this.field215 = 3;
                        }
                        this.field135 = true;
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 162) {
                    int var53 = this.field423.method351();
                    this.method140(var53, 0);
                    if (this.field420 != -1) {
                        this.method121(this.field420, false);
                        this.field420 = -1;
                        this.field135 = true;
                        this.field275 = true;
                    }
                    if (this.field338 != -1) {
                        this.method121(this.field338, false);
                        this.field338 = -1;
                        this.field265 = true;
                    }
                    if (this.field197 != -1) {
                        this.method121(this.field197, false);
                        this.field197 = -1;
                        this.field256 = true;
                    }
                    if (this.field468 != -1) {
                        this.method121(this.field468, false);
                        this.field468 = -1;
                    }
                    if (this.field312 != var53) {
                        this.method121(this.field312, false);
                        this.field312 = var53;
                    }
                    if (this.field191 != 0) {
                        this.field191 = 0;
                        this.field265 = true;
                    }
                    this.field185 = false;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 233) {
                    this.field383 = false;
                    for (int var54 = 0; var54 < 5; ++var54) {
                        this.field422[var54] = false;
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 135) {
                    this.field209 = 0;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 49) {
                    int var55 = this.field423.method377(true);
                    int var56 = this.field423.method351();
                    if (this.field338 != -1) {
                        this.method121(this.field338, false);
                        this.field338 = -1;
                        this.field265 = true;
                    }
                    if (this.field197 != -1) {
                        this.method121(this.field197, false);
                        this.field197 = -1;
                        this.field256 = true;
                    }
                    if (this.field468 != -1) {
                        this.method121(this.field468, false);
                        this.field468 = -1;
                    }
                    if (this.field312 != var56) {
                        this.method121(this.field312, false);
                        this.field312 = var56;
                    }
                    if (this.field420 != var55) {
                        this.method121(this.field420, false);
                        this.field420 = var55;
                    }
                    if (this.field191 != 0) {
                        this.field191 = 0;
                        this.field265 = true;
                    }
                    this.field135 = true;
                    this.field275 = true;
                    this.field185 = false;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 102) {
                    int var57 = this.field423.method375(-889);
                    class20 var58 = class20.method269(var57);
                    for (int var59 = 0; var59 < var58.field946.length; ++var59) {
                        var58.field946[var59] = -1;
                        var58.field946[var59] = 0;
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 240) {
                    this.field315 = this.field423.method349();
                    this.field314 = this.field423.method368(0);
                    for (int var60 = this.field314; var60 < this.field314 + 8; ++var60) {
                        for (int var61 = this.field315; var61 < this.field315 + 8; ++var61) {
                            if (this.field258[this.field97][var60][var61] != null) {
                                this.field258[this.field97][var60][var61] = null;
                                this.method120(var60, var61);
                            }
                        }
                    }
                    for (class61 var62 = (class61) this.field402.method414(); var62 != null; var62 = (class61) this.field402.method416(this.field406)) {
                        if (var62.field1623 >= this.field314 && var62.field1623 < this.field314 + 8 && var62.field1624 >= this.field315 && var62.field1624 < this.field315 + 8 && this.field97 == var62.field1621) {
                            var62.field1626 = 0;
                        }
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 151) {
                    String var63 = this.field423.method356();
                    if (var63.endsWith(":tradereq:")) {
                        String var64 = var63.substring(0, var63.indexOf(":"));
                        long var65 = class51.method504(var64);
                        boolean var67 = false;
                        for (int var68 = 0; var68 < this.field460; ++var68) {
                            if (this.field41[var68] == var65) {
                                var67 = true;
                                break;
                            }
                        }
                        if (!var67 && this.field274 == 0) {
                            this.method106(var64, 0, "wishes to trade with you.", 4);
                        }
                    } else if (var63.endsWith(":duelreq:")) {
                        String var69 = var63.substring(0, var63.indexOf(":"));
                        long var70 = class51.method504(var69);
                        boolean var72 = false;
                        for (int var73 = 0; var73 < this.field460; ++var73) {
                            if (this.field41[var73] == var70) {
                                var72 = true;
                                break;
                            }
                        }
                        if (!var72 && this.field274 == 0) {
                            this.method106(var69, 0, "wishes to duel with you.", 8);
                        }
                    } else if (!var63.endsWith(":chalreq:")) {
                        this.method106("", 0, var63, 0);
                    } else {
                        String var74 = var63.substring(0, var63.indexOf(":"));
                        long var75 = class51.method504(var74);
                        boolean var77 = false;
                        for (int var78 = 0; var78 < this.field460; ++var78) {
                            if (this.field41[var78] == var75) {
                                var77 = true;
                                break;
                            }
                        }
                        if (!var77 && this.field274 == 0) {
                            String var79 = var63.substring(var63.indexOf(":") + 1, var63.length() - 9);
                            this.method106(var74, 0, var79, 8);
                        }
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 33) {
                    for (int var80 = 0; var80 < this.field391.length; ++var80) {
                        if (this.field391[var80] != null) {
                            this.field391[var80].field1587 = -1;
                        }
                    }
                    for (int var81 = 0; var81 < this.field340.length; ++var81) {
                        if (this.field340[var81] != null) {
                            this.field340[var81].field1587 = -1;
                        }
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 223) {
                    this.field135 = true;
                    int var82 = this.field423.method351();
                    class20 var83 = class20.method269(var82);
                    int var84 = this.field423.method351();
                    for (int var85 = 0; var85 < var84; ++var85) {
                        var83.field946[var85] = this.field423.method375(-889);
                        int var86 = this.field423.method368(0);
                        if (var86 == 255) {
                            var86 = this.field423.method354();
                        }
                        var83.field944[var85] = var86;
                    }
                    for (int var87 = var84; var87 < var83.field946.length; ++var87) {
                        var83.field946[var87] = 0;
                        var83.field944[var87] = 0;
                    }
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 == 83) {
                    int var88 = this.field423.method375(-889);
                    this.method140(var88, 0);
                    if (this.field338 != -1) {
                        this.method121(this.field338, false);
                        this.field338 = -1;
                        this.field265 = true;
                    }
                    if (this.field197 != -1) {
                        this.method121(this.field197, false);
                        this.field197 = -1;
                        this.field256 = true;
                    }
                    if (this.field468 != -1) {
                        this.method121(this.field468, false);
                        this.field468 = -1;
                    }
                    if (this.field312 != -1) {
                        this.method121(this.field312, false);
                        this.field312 = -1;
                    }
                    if (this.field420 != var88) {
                        this.method121(this.field420, false);
                        this.field420 = var88;
                    }
                    if (this.field191 != 0) {
                        this.field191 = 0;
                        this.field265 = true;
                    }
                    this.field135 = true;
                    this.field275 = true;
                    this.field185 = false;
                    this.field140 = -1;
                    return true;
                }
                if (this.field140 != 9 && this.field140 != 99) {
                    if (this.field140 == 60) {
                        this.field315 = this.field423.method349();
                        this.field314 = this.field423.method369(this.field88);
                        this.field140 = -1;
                        return true;
                    }
                    if (this.field140 == 93) {
                        int var139 = this.field423.method376(5);
                        int var140 = this.field423.method375(-889);
                        class20 var141 = class20.method269(var140);
                        if (var141 != null && var141.field894 == 0) {
                            if (var139 < 0) {
                                var139 = 0;
                            }
                            if (var139 > var141.field926 - var141.field895) {
                                var139 = var141.field926 - var141.field895;
                            }
                            var141.field903 = var139;
                        }
                        this.field140 = -1;
                        return true;
                    }
                    if (this.field140 == 131) {
                        this.field367 = this.field423.method349();
                        if (this.field367 == 1) {
                            this.field75 = this.field423.method351();
                        }
                        if (this.field367 >= 2 && this.field367 <= 6) {
                            if (this.field367 == 2) {
                                this.field183 = 64;
                                this.field184 = 64;
                            }
                            if (this.field367 == 3) {
                                this.field183 = 0;
                                this.field184 = 64;
                            }
                            if (this.field367 == 4) {
                                this.field183 = 128;
                                this.field184 = 64;
                            }
                            if (this.field367 == 5) {
                                this.field183 = 64;
                                this.field184 = 0;
                            }
                            if (this.field367 == 6) {
                                this.field183 = 64;
                                this.field184 = 128;
                            }
                            this.field367 = 2;
                            this.field180 = this.field423.method351();
                            this.field181 = this.field423.method351();
                            this.field182 = this.field423.method349();
                        }
                        if (this.field367 == 10) {
                            this.field112 = this.field423.method351();
                        }
                        this.field140 = -1;
                        return true;
                    }
                    if (this.field140 == 175) {
                        String var142 = this.field423.method356();
                        int var143 = this.field423.method375(-889);
                        class20.method269(var143).field900 = var142;
                        int var10001 = this.field254[this.field215];
                        if (class20.method269(var143).field928 == var10001) {
                            this.field135 = true;
                        }
                        this.field140 = -1;
                        return true;
                    }
                    if (this.field140 == 186) {
                        this.field135 = true;
                        int var144 = this.field423.method369(this.field88);
                        int var145 = this.field423.method383(107);
                        int var146 = this.field423.method349();
                        this.field107[var144] = var145;
                        this.field403[var144] = var146;
                        this.field477[var144] = 1;
                        for (int var147 = 0; var147 < 98; ++var147) {
                            if (var145 >= field304[var147]) {
                                this.field477[var144] = var147 + 2;
                            }
                        }
                        this.field140 = -1;
                        return true;
                    }
                    if (this.field140 == 35) {
                        this.field376 = this.field423.method377(true) * 30;
                        this.field140 = -1;
                        return true;
                    }
                    if (this.field140 == 192) {
                        this.field383 = true;
                        this.field124 = this.field423.method349();
                        this.field125 = this.field423.method349();
                        this.field126 = this.field423.method351();
                        this.field127 = this.field423.method349();
                        this.field128 = this.field423.method349();
                        if (this.field128 >= 100) {
                            int var148 = this.field124 * 128 + 64;
                            int var149 = this.field125 * 128 + 64;
                            int var150 = this.method52(this.field97, var149, -430, var148) - this.field126;
                            int var151 = var148 - this.field66;
                            int var152 = var150 - this.field67;
                            int var153 = var149 - this.field68;
                            int var154 = (int) Math.sqrt((double) (var151 * var151 + var153 * var153));
                            this.field69 = (int) (Math.atan2((double) var152, (double) var154) * 325.949D) & 2047;
                            this.field70 = (int) (Math.atan2((double) var151, (double) var153) * -325.949D) & 2047;
                            if (this.field69 < 128) {
                                this.field69 = 128;
                            }
                            if (this.field69 > 383) {
                                this.field69 = 383;
                            }
                        }
                        this.field140 = -1;
                        return true;
                    }
                    if (this.field140 != 10 && this.field140 != 42 && this.field140 != 200 && this.field140 != 116 && this.field140 != 75 && this.field140 != 238 && this.field140 != 203 && this.field140 != 150 && this.field140 != 255 && this.field140 != 2 && this.field140 != 241) {
                        if (this.field140 == 132) {
                            int var155 = this.field423.method351();
                            int var156 = this.field423.method349();
                            int var157 = this.field423.method351();
                            if (this.field248 && !field467 && this.field381 < 50) {
                                this.field103[this.field381] = var155;
                                this.field434[this.field381] = var156;
                                this.field200[this.field381] = class26.field1013[var155] + var157;
                                ++this.field381;
                            }
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 97) {
                            this.field215 = this.field423.method349();
                            this.field135 = true;
                            this.field275 = true;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 13) {
                            int var158 = this.field423.method378((byte) -12);
                            if (this.field154 != var158) {
                                this.method121(this.field154, false);
                                this.field154 = var158;
                            }
                            this.field265 = true;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 107) {
                            int var159 = this.field423.method376(5);
                            int var160 = this.field423.method377(true);
                            int var161 = var160 >> 10 & 31;
                            int var162 = var160 >> 5 & 31;
                            int var163 = var160 & 31;
                            class20.method269(var159).field932 = (var163 << 3) + (var161 << 19) + (var162 << 11);
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 195) {
                            this.method144((byte) -81);
                            this.field140 = -1;
                            return false;
                        }
                        if (this.field140 == 204) {
                            int var164 = this.field423.method375(-889);
                            int var165 = this.field423.method375(-889);
                            int var166 = this.field423.method376(5);
                            class20.method269(var166).field901 = (var164 << 16) + var165;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 51) {
                            boolean var167 = this.field423.method368(0) == 1;
                            int var168 = this.field423.method376(5);
                            class20.method269(var168).field904 = var167;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 149) {
                            int var169 = this.field423.method377(true);
                            int var170 = this.field423.method376(5);
                            class20.method269(var170).field910 = 2;
                            class20.method269(var170).field911 = var169;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 81) {
                            int var171 = this.field423.method376(5);
                            if (var171 == 65535) {
                                var171 = -1;
                            }
                            if (this.field156 != var171 && this.field167 && !field467 && this.field316 == 0) {
                                this.field168 = var171;
                                this.field169 = true;
                                this.field40.method532(2, this.field168);
                            }
                            this.field156 = var171;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 165) {
                            int var172 = this.field423.method353();
                            int var173 = this.field423.method351();
                            if (this.field167 && !field467) {
                                this.field168 = var173;
                                this.field169 = false;
                                this.field40.method532(2, this.field168);
                                this.field316 = var172;
                            }
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 214) {
                            int var174 = this.field423.method376(5);
                            int var175 = this.field423.method351();
                            int var176 = this.field423.method376(5);
                            if (var174 == 65535) {
                                class20.method269(var175).field910 = 0;
                                this.field140 = -1;
                                return true;
                            }
                            class19 var177 = class19.method254(var174);
                            class20.method269(var175).field910 = 4;
                            class20.method269(var175).field911 = var174;
                            class20.method269(var175).field935 = var177.field840;
                            class20.method269(var175).field936 = var177.field851;
                            class20.method269(var175).field934 = var177.field880 * 100 / var176;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 62) {
                            this.field129 = this.field423.method349();
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 199) {
                            int var178 = this.field423.method349();
                            int var179 = this.field423.method375(-889);
                            if (var179 == 65535) {
                                var179 = -1;
                            }
                            if (this.field254[var178] != var179) {
                                this.method121(this.field254[var178], false);
                                this.field254[var178] = var179;
                            }
                            this.field135 = true;
                            this.field275 = true;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 64) {
                            this.field356 = false;
                            this.field191 = 1;
                            this.field96 = "";
                            this.field265 = true;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 245) {
                            this.field246 = this.field423.method349();
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 1) {
                            this.field226 = this.field423.method349();
                            this.field196 = this.field423.method349();
                            this.field178 = this.field423.method349();
                            this.field462 = true;
                            this.field265 = true;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 27) {
                            int var180 = this.field423.method377(true);
                            int var181 = this.field423.method376(5);
                            int var182 = this.field423.method376(5);
                            int var183 = this.field423.method377(true);
                            class20.method269(var183).field935 = var181;
                            class20.method269(var183).field936 = var182;
                            class20.method269(var183).field934 = var180;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 196) {
                            this.field460 = this.field139 / 8;
                            for (int var184 = 0; var184 < this.field460; ++var184) {
                                this.field41[var184] = this.field423.method355(-584);
                            }
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 8) {
                            if (this.field420 != -1) {
                                this.method121(this.field420, false);
                                this.field420 = -1;
                                this.field135 = true;
                                this.field275 = true;
                            }
                            if (this.field338 != -1) {
                                this.method121(this.field338, false);
                                this.field338 = -1;
                                this.field265 = true;
                            }
                            if (this.field197 != -1) {
                                this.method121(this.field197, false);
                                this.field197 = -1;
                                this.field256 = true;
                            }
                            if (this.field468 != -1) {
                                this.method121(this.field468, false);
                                this.field468 = -1;
                            }
                            if (this.field312 != -1) {
                                this.method121(this.field312, false);
                                this.field312 = -1;
                            }
                            if (this.field191 != 0) {
                                this.field191 = 0;
                                this.field265 = true;
                            }
                            this.field185 = false;
                            this.field140 = -1;
                            return true;
                        }
                        if (this.field140 == 56) {
                            int var185 = this.field423.method383(107);
                            int var186 = this.field423.method376(5);
                            this.field496[var186] = var185;
                            if (this.field134[var186] != var185) {
                                this.field134[var186] = var185;
                                this.method85(true, var186);
                                this.field135 = true;
                                if (this.field154 != -1) {
                                    this.field265 = true;
                                }
                            }
                            this.field140 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field140 + "," + this.field139 + " - " + this.field408 + "," + this.field409);
                        this.method144((byte) -81);
                        return true;
                    }
                    this.method129(this.field423, this.field140, 151);
                    this.field140 = -1;
                    return true;
                }
                int var89 = this.field33;
                int var90 = this.field34;
                if (this.field140 == 9) {
                    var90 = this.field423.method375(-889);
                    var89 = this.field423.method376(5);
                    this.field176 = false;
                }
                if (this.field140 == 99) {
                    var90 = this.field423.method375(-889);
                    var89 = this.field423.method377(true);
                    this.field423.method359(false);
                    int var91 = 0;
                    while (true) {
                        if (var91 >= 4) {
                            this.field423.method361(this.field520);
                            this.field176 = true;
                            break;
                        }
                        for (int var92 = 0; var92 < 13; ++var92) {
                            for (int var93 = 0; var93 < 13; ++var93) {
                                int var94 = this.field423.method360(168, 1);
                                if (var94 == 1) {
                                    this.field472[var91][var92][var93] = this.field423.method360(168, 26);
                                } else {
                                    this.field472[var91][var92][var93] = -1;
                                }
                            }
                        }
                        ++var91;
                    }
                }
                if (this.field33 == var89 && this.field34 == var90 && this.field273 == 2) {
                    this.field140 = -1;
                    return true;
                }
                this.field33 = var89;
                this.field34 = var90;
                this.field290 = (this.field33 - 6) * 8;
                this.field291 = (this.field34 - 6) * 8;
                this.field404 = false;
                if ((this.field33 / 8 == 48 || this.field33 / 8 == 49) && this.field34 / 8 == 48) {
                    this.field404 = true;
                }
                if (this.field33 / 8 == 48 && this.field34 / 8 == 148) {
                    this.field404 = true;
                }
                this.field273 = 1;
                this.field194 = System.currentTimeMillis();
                this.method145(873, "Loading - please wait.", (String) null);
                if (this.field140 == 9) {
                    int var95 = 0;
                    int var96 = (this.field33 - 6) / 8;
                    label1207: while (true) {
                        if (var96 > (this.field33 + 6) / 8) {
                            this.field439 = new byte[var95][];
                            this.field305 = new byte[var95][];
                            this.field260 = new int[var95];
                            this.field261 = new int[var95];
                            this.field262 = new int[var95];
                            int var98 = 0;
                            int var99 = (this.field33 - 6) / 8;
                            while (true) {
                                if (var99 > (this.field33 + 6) / 8) {
                                    break label1207;
                                }
                                for (int var100 = (this.field34 - 6) / 8; var100 <= (this.field34 + 6) / 8; ++var100) {
                                    this.field260[var98] = (var99 << 8) + var100;
                                    if (!this.field404 || var100 != 49 && var100 != 149 && var100 != 147 && var99 != 50 && (var99 != 49 || var100 != 47)) {
                                        int var101 = this.field261[var98] = this.field40.method520(var99, var100, 0, -632);
                                        if (var101 != -1) {
                                            this.field40.method532(3, var101);
                                        }
                                        int var102 = this.field262[var98] = this.field40.method520(var99, var100, 1, -632);
                                        if (var102 != -1) {
                                            this.field40.method532(3, var102);
                                        }
                                        ++var98;
                                    } else {
                                        this.field261[var98] = -1;
                                        this.field262[var98] = -1;
                                        ++var98;
                                    }
                                }
                                ++var99;
                            }
                        }
                        for (int var97 = (this.field34 - 6) / 8; var97 <= (this.field34 + 6) / 8; ++var97) {
                            ++var95;
                        }
                        ++var96;
                    }
                }
                if (this.field140 == 99) {
                    int var103 = 0;
                    int[] var104 = new int[676];
                    int var105 = 0;
                    label1166: while (true) {
                        if (var105 >= 4) {
                            this.field439 = new byte[var103][];
                            this.field305 = new byte[var103][];
                            this.field260 = new int[var103];
                            this.field261 = new int[var103];
                            this.field262 = new int[var103];
                            int var113 = 0;
                            while (true) {
                                if (var113 >= var103) {
                                    break label1166;
                                }
                                int var114 = this.field260[var113] = var104[var113];
                                int var115 = var114 >> 8 & 255;
                                int var116 = var114 & 255;
                                int var117 = this.field261[var113] = this.field40.method520(var115, var116, 0, -632);
                                if (var117 != -1) {
                                    this.field40.method532(3, var117);
                                }
                                int var118 = this.field262[var113] = this.field40.method520(var115, var116, 1, -632);
                                if (var118 != -1) {
                                    this.field40.method532(3, var118);
                                }
                                ++var113;
                            }
                        }
                        for (int var106 = 0; var106 < 13; ++var106) {
                            for (int var107 = 0; var107 < 13; ++var107) {
                                int var108 = this.field472[var105][var106][var107];
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
                int var119 = this.field290 - this.field292;
                int var120 = this.field291 - this.field293;
                this.field292 = this.field290;
                this.field293 = this.field291;
                for (int var121 = 0; var121 < 16384; ++var121) {
                    class67 var122 = this.field340[var121];
                    if (var122 != null) {
                        for (int var123 = 0; var123 < 10; ++var123) {
                            var122.field1559[var123] -= var119;
                            var122.field1560[var123] -= var120;
                        }
                        var122.field1601 -= var119 * 128;
                        var122.field1602 -= var120 * 128;
                    }
                }
                for (int var124 = 0; var124 < this.field389; ++var124) {
                    class17 var125 = this.field391[var124];
                    if (var125 != null) {
                        for (int var126 = 0; var126 < 10; ++var126) {
                            var125.field1559[var126] -= var119;
                            var125.field1560[var126] -= var120;
                        }
                        var125.field1601 -= var119 * 128;
                        var125.field1602 -= var120 * 128;
                    }
                }
                this.field289 = true;
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
                                this.field258[var137][var133][var134] = this.field258[var137][var135][var136];
                            } else {
                                this.field258[var137][var133][var134] = null;
                            }
                        }
                    }
                }
                for (class61 var138 = (class61) this.field402.method414(); var138 != null; var138 = (class61) this.field402.method416(this.field406)) {
                    var138.field1623 -= var119;
                    var138.field1624 -= var120;
                    if (var138.field1623 < 0 || var138.field1624 < 0 || var138.field1623 >= 104 || var138.field1624 >= 104) {
                        var138.method336();
                    }
                }
                if (this.field209 != 0) {
                    this.field209 -= var119;
                    this.field210 -= var120;
                }
                this.field383 = false;
                this.field140 = -1;
                return true;
            } catch (IOException var191) {
                this.method58(324);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field140 + "," + this.field408 + "," + this.field409 + " - " + this.field139 + "," + (field446.field1559[0] + this.field290) + "," + (field446.field1560[0] + this.field291) + " - ";
                for (int var189 = 0; var189 < this.field139 && var189 < 50; ++var189) {
                    var188 = var188 + this.field423.field1106[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method144((byte) -81);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILNHEPCMLW;Z)V")
    private final void method150(int arg0, class35 arg1, boolean arg2) {
        if (!arg2) {
            this.field328 = -342;
        }
        while (arg1.field1108 + 10 < arg0 * 8) {
            int var4 = arg1.method360(168, 11);
            if (var4 == 2047) {
                break;
            }
            if (this.field391[var4] == null) {
                this.field391[var4] = new class17();
                if (this.field396[var4] != null) {
                    this.field391[var4].method252(this.field396[var4], true);
                }
            }
            this.field393[this.field392++] = var4;
            class17 var5 = this.field391[var4];
            var5.field1561 = field505;
            int var6 = arg1.method360(168, 1);
            int var7 = arg1.method360(168, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method360(168, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg1.method360(168, 1);
            if (var9 == 1) {
                this.field395[this.field394++] = var4;
            }
            var5.method547((byte) 9, field446.field1559[0] + var8, field446.field1560[0] + var7, var6 == 1);
        }
        arg1.method361(this.field520);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field304[var1] = var0 / 4;
        }
        field311 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field375 = true;
        field405 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field405[var3] = var2 - 1;
            var2 += var2;
        }
        field464 = 10;
        field466 = true;
        field518 = 389;
    }
}
