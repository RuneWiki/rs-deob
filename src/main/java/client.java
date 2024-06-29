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
public class client extends class41 {

    @OriginalMember(owner = "client!client", name = "J", descriptor = "Z")
    private boolean field125 = false;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "[Ljava/lang/String;")
    private String[] field126 = new String[500];

    @OriginalMember(owner = "client!client", name = "L", descriptor = "LBSNPYLEV;")
    private class7 field127 = class7.method35(1, 908);

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
    private volatile boolean field131 = false;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
    private boolean field133 = false;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[[[LFEIPMYNH;")
    private class15[][][] field136 = new class15[4][104][104];

    @OriginalMember(owner = "client!client", name = "V", descriptor = "B")
    private byte field137 = -89;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
    private boolean field139 = true;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
    private int[] field140 = new int[7];

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    private int field141 = 2301979;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
    private boolean field142 = false;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
    private int[] field143 = new int[151];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    private final int[] field144 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field155 = 128;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "B")
    private byte field160 = 2;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Ljava/lang/String;")
    private String field165 = "";

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Ljava/lang/String;")
    private String field166 = "";

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "B")
    private byte field168 = -115;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "LBSNPYLEV;")
    private class7 field169 = new class7(new byte[5000], (byte) 3);

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "[LTOFRUGLM;")
    private class53[] field170 = new class53[16384];

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
    public int[] field172 = new int[16384];

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "LBSNPYLEV;")
    private class7 field174 = class7.method35(1, 908);

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    private int field178 = 8990;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
    private int[] field179 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
    private int[] field180 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    private int field181 = -1;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field183 = -1;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
    private boolean field184 = false;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field186 = 2;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "Ljava/lang/String;")
    private String field187 = "";

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field189 = 502;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "Z")
    private boolean field192 = false;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
    private int[] field193 = new int[5];

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
    private int[] field194 = new int[2000];

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "[I")
    private int[] field195 = new int[500];

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
    private int[] field196 = new int[500];

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "[I")
    private int[] field197 = new int[500];

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
    private int[] field198 = new int[500];

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int field199 = -48151;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
    private boolean field200 = false;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
    private int[] field203 = new int[33];

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
    public int[] field205 = new int[2000];

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "[LBISLJVZR;")
    private class5[] field206 = new class5[100];

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
    private int[] field208 = new int[5];

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "Z")
    private boolean field209 = false;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
    private volatile boolean field212 = false;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "Ljava/lang/String;")
    private String field214 = "";

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "[Ljava/lang/String;")
    private String[] field216 = new String[100];

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
    private int[] field217 = new int[100];

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "Z")
    private boolean field219 = false;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "LFEIPMYNH;")
    private class15 field222 = new class15(true);

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
    private int[] field225 = new int[class59.field1556];

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "Z")
    private boolean field233 = false;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "B")
    private byte field234 = 1;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field235 = -1;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
    private int field236 = 78;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private int field239 = -773;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int field241 = 897;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
    private int field242 = 4;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
    private boolean field243 = false;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
    private boolean field244 = false;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int field253 = -1;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "[I")
    private int[] field255 = new int[50];

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "[[I")
    private int[][] field256 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private final int field257 = 100;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "[I")
    private int[] field258 = new int[100];

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
    private boolean field267 = false;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "[LBISLJVZR;")
    private class5[] field273 = new class5[32];

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
    private boolean field278 = true;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "Z")
    private boolean field279 = false;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "[LTPHBVXKD;")
    public class54[] field282 = new class54[5];

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
    private boolean field283 = true;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "[Ljava/lang/String;")
    private String[] field289 = new String[5];

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "[Z")
    private boolean[] field290 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field293 = 1;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "B")
    private byte field294 = 42;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "LQHGHUTGN;")
    private class43 field295 = new class43();

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "[J")
    private long[] field297 = new long[200];

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "[J")
    private long[] field298 = new long[100];

    @OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
    private int[] field305 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "je", descriptor = "I")
    private int field307 = 1;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "Ljava/lang/String;")
    private String field308 = "";

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field312 = 1;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field313 = -1;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "Z")
    private boolean field315 = true;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "Z")
    public boolean field316 = true;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "[LKYEPSAQL;")
    private class31[] field317 = new class31[13];

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field318 = -1;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
    public boolean field322 = false;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "[LBISLJVZR;")
    private class5[] field323 = new class5[1000];

    @OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
    public int[] field331 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field332 = 9998;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/lang/String;")
    private String field333 = "";

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private int field335 = -1;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field336 = -1;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "[I")
    private int[] field337 = new int[9];

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field340 = -98;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
    private int field342 = 2048;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field343 = 2047;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "[LKZCOXKKW;")
    private class32[] field344 = new class32[this.field342];

    @OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
    public int[] field346 = new int[this.field342];

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
    private int[] field348 = new int[this.field342];

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "[LBSNPYLEV;")
    private class7[] field349 = new class7[this.field342];

    @OriginalMember(owner = "client!client", name = "af", descriptor = "Z")
    private boolean field350 = true;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "[I")
    private int[] field351 = new int[50];

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
    private boolean field352 = false;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "LFEIPMYNH;")
    private class15 field360 = new class15(true);

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "[Z")
    private boolean[] field361 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "Z")
    private boolean field362 = false;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "[LEOLCIJGV;")
    private class14[] field363 = new class14[4];

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
    private int[] field370 = new int[class59.field1556];

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
    private boolean field371 = false;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "Z")
    private boolean field372 = false;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
    private boolean field373 = true;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
    private int[] field375 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
    private int[] field376 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private int field377 = 7759444;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
    private int[] field378 = new int[5];

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "[LKYEPSAQL;")
    private class31[] field379 = new class31[2];

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/lang/String;")
    private String field380 = "";

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "Ljava/lang/String;")
    private String field381 = "";

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "Z")
    private boolean field386 = false;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "B")
    private byte field387 = 9;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "[I")
    private int[] field390 = new int[200];

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
    private boolean field391 = false;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    private int field397 = -1;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
    private boolean field403 = false;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private int field409 = -1;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field412 = 8;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "[[I")
    private int[][] field422 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
    private int[] field427 = new int[151];

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
    private int field430 = 3353893;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
    private int[] field432 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "[LBISLJVZR;")
    private class5[] field435 = new class5[32];

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "B")
    private byte field436 = 9;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
    private int[] field438 = new int[33];

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
    private int[] field444 = new int[5];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
    private int field446 = -1;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "Z")
    private boolean field447 = false;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "[[[I")
    private int[][][] field448 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "[Ljava/lang/String;")
    private String[] field453 = new String[200];

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field455 = -1;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
    private boolean field456 = false;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
    private int field461 = 711;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "[I")
    private int[] field462 = new int[class59.field1556];

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    private int field463 = 850;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
    public int[] field469 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field473 = 9;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "LBSNPYLEV;")
    private class7 field474 = class7.method35(1, 908);

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
    private int[] field475 = new int[256];

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
    private int[] field476 = new int[100];

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "[Ljava/lang/String;")
    private String[] field477 = new String[100];

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "[Ljava/lang/String;")
    private String[] field478 = new String[100];

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
    private boolean field479 = true;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field482 = 2;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "[LBISLJVZR;")
    private class5[] field483 = new class5[32];

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
    private int field484 = 939;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "[LKYEPSAQL;")
    private class31[] field485 = new class31[100];

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private int field494 = -1;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
    private int[] field496 = new int[50];

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
    private boolean field503 = true;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "[LBISLJVZR;")
    private class5[] field507 = new class5[20];

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "Z")
    private volatile boolean field510 = false;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int field511 = 39072;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
    private boolean field520 = false;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "Z")
    private boolean field521 = false;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "Ljava/lang/String;")
    private String field522 = "";

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field524 = 2;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
    private int field528 = -1;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
    private int field536 = 50;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
    private int[] field537 = new int[this.field536];

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "[I")
    private int[] field538 = new int[this.field536];

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "[I")
    private int[] field539 = new int[this.field536];

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
    private int[] field540 = new int[this.field536];

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
    private int[] field541 = new int[this.field536];

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
    private int[] field542 = new int[this.field536];

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
    private int[] field543 = new int[this.field536];

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "[Ljava/lang/String;")
    private String[] field544 = new String[this.field536];

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "[B")
    private byte[] field550 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "Z")
    private boolean field551 = false;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "[LBISLJVZR;")
    private class5[] field559 = new class5[8];

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field561 = -1;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "Ljava/lang/String;")
    private String field567 = "";

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
    private boolean field571 = false;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "[[I")
    private int[][] field573 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private int field580 = 3;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field581 = new CRC32();

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
    private int[] field582 = new int[5];

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
    private int field596 = -1;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "LFEIPMYNH;")
    private class15 field597 = new class15(true);

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "B")
    private byte field600 = 8;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    private int field605 = 5063219;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
    private static boolean field135 = true;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
    public static int[] field304 = new int[32];

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "[[I")
    public static final int[][] field413;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field418;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "Ljava/lang/String;")
    private static String field460;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "[I")
    private static int[] field468;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field491;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
    public static final int[] field508;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
    private static int field606;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
    private static boolean field608;

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private static int field159;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private static int field207;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private static int field224;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private static int field228;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private static int field303;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private static int field338;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
    private static int field417;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
    private static int field428;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private static int field429;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private static int field433;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private static int field439;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
    private static int field492;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
    private static int field495;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private static int field502;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    private static int field583;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "J")
    private long field389;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "J")
    public long field445;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "J")
    private long field493;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "J")
    private long field554;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "J")
    private long field603;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "LIJIEJOTK;")
    public class25 field572;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "LIOGVZQTL;")
    private class26 field145;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "LIOGVZQTL;")
    private class26 field146;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "LIOGVZQTL;")
    private class26 field147;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "LIOGVZQTL;")
    private class26 field148;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "LIOGVZQTL;")
    private class26 field149;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "LIOGVZQTL;")
    private class26 field150;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "LIOGVZQTL;")
    private class26 field151;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "LIOGVZQTL;")
    private class26 field152;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "LIOGVZQTL;")
    private class26 field153;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "LIOGVZQTL;")
    private class26 field259;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "LIOGVZQTL;")
    private class26 field260;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "LIOGVZQTL;")
    private class26 field261;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "LIOGVZQTL;")
    private class26 field545;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "LIOGVZQTL;")
    private class26 field546;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "LIOGVZQTL;")
    private class26 field547;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "LIOGVZQTL;")
    private class26 field548;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "LIOGVZQTL;")
    private class26 field587;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "LIOGVZQTL;")
    private class26 field588;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "LIOGVZQTL;")
    private class26 field589;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "LIOGVZQTL;")
    private class26 field590;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "LIOGVZQTL;")
    private class26 field591;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "LIOGVZQTL;")
    private class26 field592;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "LIOGVZQTL;")
    private class26 field593;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "LIOGVZQTL;")
    private class26 field594;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "LIOGVZQTL;")
    private class26 field595;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "LAKTTXKXI;")
    private class2 field299;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "LAKTTXKXI;")
    private class2 field300;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "LAKTTXKXI;")
    private class2 field301;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "LAKTTXKXI;")
    private class2 field302;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "LKYEPSAQL;")
    private class31 field210;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "LKYEPSAQL;")
    private class31 field211;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "LKYEPSAQL;")
    private class31 field229;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "LKYEPSAQL;")
    private class31 field230;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "LKYEPSAQL;")
    private class31 field231;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "LKYEPSAQL;")
    private class31 field358;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "LKYEPSAQL;")
    private class31 field359;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "LKYEPSAQL;")
    private class31 field464;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "LKYEPSAQL;")
    private class31 field465;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "LKYEPSAQL;")
    private class31 field466;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "LKYEPSAQL;")
    private class31 field486;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "LKYEPSAQL;")
    private class31 field487;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "LKYEPSAQL;")
    private class31 field488;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "LKYEPSAQL;")
    private class31 field489;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "LKYEPSAQL;")
    private class31 field490;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "LKYEPSAQL;")
    private class31 field562;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "LKYEPSAQL;")
    private class31 field563;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "LKYEPSAQL;")
    private class31 field564;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "LKYEPSAQL;")
    private class31 field565;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "LKYEPSAQL;")
    private class31 field566;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "LKZCOXKKW;")
    public static class32 field452;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "LNTPVSATL;")
    private class38 field416;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "LPAJXYXWG;")
    private class39 field188;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "LSMIVAFST;")
    private class52 field558;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "LBISLJVZR;")
    private class5 field129;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "LBISLJVZR;")
    private class5 field154;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "LBISLJVZR;")
    private class5 field175;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "LBISLJVZR;")
    private class5 field176;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "LBISLJVZR;")
    private class5 field274;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "LBISLJVZR;")
    private class5 field275;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "LBISLJVZR;")
    private class5 field321;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "LBISLJVZR;")
    private class5 field457;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "LBISLJVZR;")
    private class5 field458;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "LBISLJVZR;")
    private class5 field574;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "LBISLJVZR;")
    private class5 field575;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "LBISLJVZR;")
    private class5 field576;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "LBISLJVZR;")
    private class5 field577;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "LBISLJVZR;")
    private class5 field578;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "LBISLJVZR;")
    private class5 field601;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "LVYNRIVYZ;")
    private class62 field505;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "LXXMIBCTG;")
    private class68 field309;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "Ljava/lang/String;")
    private String field221;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "Ljava/lang/String;")
    private String field245;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/lang/String;")
    public String field368;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "Ljava/lang/String;")
    public String field443;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "Ljava/net/Socket;")
    private Socket field500;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "Z")
    public static boolean field334;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "Z")
    private static boolean field353;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
    public static boolean field437;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
    private static boolean field568;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "Z")
    private static boolean field609;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
    private int[] field247;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "[I")
    private int[] field248;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
    private int[] field249;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "[I")
    private int[] field250;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
    private int[] field270;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
    private int[] field271;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
    private int[] field272;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
    private int[] field276;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
    private int[] field277;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
    private int[] field419;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
    private int[] field420;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
    private int[] field421;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "[I")
    private int[] field598;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
    private int[] field599;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "[LKYEPSAQL;")
    private class31[] field388;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "[[B")
    private byte[][] field182;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "[[B")
    private byte[][] field467;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "[[[B")
    private byte[][][] field549;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "[[[I")
    private int[][][] field604;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LBSNPYLEV;IZ)V")
    private final void method124(class7 arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field399 = -1;
        }
        while (arg0.field92 + 21 < arg1 * 8) {
            int var4 = arg0.method58(14, 588);
            if (var4 == 16383) {
                break;
            }
            if (this.field170[var4] == null) {
                this.field170[var4] = new class53();
            }
            class53 var5 = this.field170[var4];
            this.field172[this.field171++] = var4;
            var5.field737 = field396;
            int var6 = arg0.method58(1, 588);
            if (var6 == 1) {
                this.field348[this.field347++] = var4;
            }
            int var7 = arg0.method58(5, 588);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method58(1, 588);
            int var9 = arg0.method58(5, 588);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.field1508 = class70.method597(arg0.method58(13, 588));
            var5.field682 = var5.field1508.field1718;
            var5.field726 = var5.field1508.field1739;
            var5.field683 = var5.field1508.field1711;
            var5.field684 = var5.field1508.field1714;
            var5.field685 = var5.field1508.field1733;
            var5.field686 = var5.field1508.field1736;
            var5.field696 = var5.field1508.field1705;
            var5.method309(593, field452.field703[0] + var7, field452.field704[0] + var9, var8 == 1);
        }
        arg0.method59(0);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method125(int arg0) {
        this.field546.method321(this.field499);
        if (this.field454 == 2) {
            byte[] var2 = this.field465.field913;
            int[] var3 = class58.field1545;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field154.method28(256, true, this.field438, 25, 0, this.field156, 0, 33, this.field203, 25, 33);
            this.field547.method321(this.field499);
            class27.field869 = this.field249;
        } else {
            int var6 = this.field481 + this.field156 & 2047;
            if (arg0 == -7092) {
                int var7 = field452.field706 / 32 + 48;
                int var8 = 464 - field452.field707 / 32;
                this.field321.method28(this.field311 + 256, true, this.field143, var8, 5, var6, 25, 151, this.field427, var7, 146);
                this.field154.method28(256, true, this.field438, 25, 0, this.field156, 0, 33, this.field203, 25, 33);
                for (int var9 = 0; var9 < this.field374; ++var9) {
                    int var39 = this.field375[var9] * 4 + 2 - field452.field706 / 32;
                    int var40 = this.field376[var9] * 4 + 2 - field452.field707 / 32;
                    this.method232(30930, this.field323[var9], var40, var39);
                }
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var35 = 0; var35 < 104; ++var35) {
                        class15 var36 = this.field136[this.field213][var10][var35];
                        if (var36 != null) {
                            int var37 = var10 * 4 + 2 - field452.field706 / 32;
                            int var38 = var35 * 4 + 2 - field452.field707 / 32;
                            this.method232(30930, this.field574, var38, var37);
                        }
                    }
                }
                for (int var11 = 0; var11 < this.field171; ++var11) {
                    class53 var31 = this.field170[this.field172[var11]];
                    if (var31 != null && var31.method307(39489)) {
                        class70 var32 = var31.field1508;
                        if (var32.field1722 != null) {
                            var32 = var32.method599((byte) 2);
                        }
                        if (var32 != null && var32.field1727 && var32.field1728) {
                            int var33 = var31.field706 / 32 - field452.field706 / 32;
                            int var34 = var31.field707 / 32 - field452.field707 / 32;
                            this.method232(30930, this.field575, var34, var33);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field345; ++var12) {
                    class32 var23 = this.field344[this.field346[var12]];
                    if (var23 != null && var23.method307(39489)) {
                        int var24 = var23.field706 / 32 - field452.field706 / 32;
                        int var25 = var23.field707 / 32 - field452.field707 / 32;
                        boolean var26 = false;
                        long var27 = class51.method505(var23.field924);
                        for (int var29 = 0; var29 < this.field471; ++var29) {
                            if (this.field297[var29] == var27 && this.field390[var29] != 0) {
                                var26 = true;
                                break;
                            }
                        }
                        boolean var30 = false;
                        if (field452.field929 != 0 && var23.field929 != 0 && field452.field929 == var23.field929) {
                            var30 = true;
                        }
                        if (var26) {
                            this.method232(30930, this.field577, var25, var24);
                        } else if (var30) {
                            this.method232(30930, this.field578, var25, var24);
                        } else {
                            this.method232(30930, this.field576, var25, var24);
                        }
                    }
                }
                if (this.field509 != 0 && field396 % 20 < 10) {
                    if (this.field509 == 1 && this.field570 >= 0 && this.field570 < this.field170.length) {
                        class53 var13 = this.field170[this.field570];
                        if (var13 != null) {
                            int var14 = var13.field706 / 32 - field452.field706 / 32;
                            int var15 = var13.field707 / 32 - field452.field707 / 32;
                            this.method126(2, this.field176, var14, var15);
                        }
                    }
                    if (this.field509 == 2) {
                        int var16 = (this.field404 - this.field354) * 4 + 2 - field452.field706 / 32;
                        int var17 = (this.field405 - this.field355) * 4 + 2 - field452.field707 / 32;
                        this.method126(2, this.field176, var16, var17);
                    }
                    if (this.field509 == 10 && this.field190 >= 0 && this.field190 < this.field344.length) {
                        class32 var18 = this.field344[this.field190];
                        if (var18 != null) {
                            int var19 = var18.field706 / 32 - field452.field706 / 32;
                            int var20 = var18.field707 / 32 - field452.field707 / 32;
                            this.method126(2, this.field176, var19, var20);
                        }
                    }
                }
                if (this.field319 != 0) {
                    int var21 = this.field319 * 4 + 2 - field452.field706 / 32;
                    int var22 = this.field320 * 4 + 2 - field452.field707 / 32;
                    this.method232(30930, this.field175, var22, var21);
                }
                class58.method528(this.field234, 3, 78, 97, 3, 16777215);
                this.field547.method321(this.field499);
                class27.field869 = this.field249;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILBISLJVZR;II)V")
    public final void method126(int arg0, class5 arg1, int arg2, int arg3) {
        if (arg0 != 2) {
            this.field399 = this.field474.method47();
        }
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field481 + this.field156 & 2047;
            int var7 = class47.field1399[var6];
            int var8 = class47.field1400[var6];
            int var9 = var7 * 256 / (this.field311 + 256);
            int var10 = var8 * 256 / (this.field311 + 256);
            int var11 = arg2 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field601.method29(460, 15, 83 - var16 - 20, 15, var15 + 94 + 4 - 10, 20, 256, var13, 20);
        } else {
            this.method232(30930, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (this.field548 == null) {
            this.method240(true);
            super.field1130 = null;
            this.field145 = null;
            this.field146 = null;
            this.field147 = null;
            this.field148 = null;
            this.field149 = null;
            this.field150 = null;
            this.field151 = null;
            this.field152 = null;
            this.field153 = null;
            this.field548 = new class26(479, 96, this.method194(1), field568);
            this.field546 = new class26(172, 156, this.method194(1), field568);
            class58.method526(30983);
            this.field465.method350(0, (byte) 0, 0);
            this.field545 = new class26(190, 261, this.method194(1), field568);
            this.field547 = new class26(512, 334, this.method194(1), field568);
            class58.method526(30983);
            this.field259 = new class26(496, 50, this.method194(1), field568);
            this.field260 = new class26(269, 37, this.method194(1), field568);
            this.field261 = new class26(249, 45, this.method194(1), field568);
            this.field133 = true;
            if (arg0 <= 0) {
                field568 = !field568;
            }
            this.field547.method321(this.field499);
            class27.field869 = this.field249;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method128() {
        this.method158((byte) 6, 20, "Starting up");
        if (signlink.sunjava) {
            super.field1123 = 5;
        }
        if (field353) {
            this.field520 = true;
        } else {
            field353 = true;
            boolean var1 = false;
            String var2 = this.method131((byte) 107);
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
                this.field184 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field282[var3] = new class54(false, signlink.cache_idx[var3], 600000, var3 + 1, signlink.cache_dat);
                    }
                }
                try {
                    this.method196(4);
                    this.field558 = this.method148(25, 1, "title screen", "title", false, this.field337[1]);
                    this.field299 = new class2((byte) 16, this.field558, false, "p11_full");
                    this.field300 = new class2((byte) 16, this.field558, false, "p12_full");
                    this.field301 = new class2((byte) 16, this.field558, false, "b12_full");
                    this.field302 = new class2((byte) 16, this.field558, true, "q8_full");
                    this.method133((byte) 0);
                    this.method129(2);
                    class52 var4 = this.method148(30, 2, "config", "config", false, this.field337[2]);
                    class52 var5 = this.method148(35, 3, "interface", "interface", false, this.field337[3]);
                    class52 var6 = this.method148(40, 4, "2d graphics", "media", false, this.field337[4]);
                    class52 var7 = this.method148(45, 6, "textures", "textures", false, this.field337[6]);
                    class52 var8 = this.method148(50, 7, "chat system", "wordenc", false, this.field337[7]);
                    class52 var9 = this.method148(55, 8, "sound effects", "sounds", false, this.field337[8]);
                    this.field549 = new byte[4][104][104];
                    this.field604 = new int[4][105][105];
                    this.field188 = new class39(0, 4, this.field604, 104, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field363[var10] = new class14(1, 104, 104);
                    }
                    this.field321 = new class5(512, 512);
                    class52 var11 = this.method148(60, 5, "update list", "versionlist", false, this.field337[5]);
                    this.method158((byte) 6, 60, "Connecting to update server");
                    this.field505 = new class62();
                    this.field505.method553(var11, this);
                    class67.method582(this.field505.method542((byte) -33));
                    class47.method463(this.field505.method544(0, 2), this.field505);
                    if (!field609) {
                        this.field138 = 0;
                        this.field139 = true;
                        this.field505.method556(2, this.field138);
                        while (this.field505.method552() > 0) {
                            this.method236(897);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                            if (this.field505.field1589 > 3) {
                                this.method188("ondemand");
                                return;
                            }
                        }
                    }
                    this.method158((byte) 6, 65, "Requesting animations");
                    int var12 = this.field505.method544(1, 2);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field505.method556(1, var13);
                    }
                    while (this.field505.method552() > 0) {
                        int var14 = var12 - this.field505.method552();
                        if (var14 > 0) {
                            this.method158((byte) 6, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method236(897);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                        if (this.field505.field1589 > 3) {
                            this.method188("ondemand");
                            return;
                        }
                    }
                    this.method158((byte) 6, 70, "Requesting models");
                    int var15 = this.field505.method544(0, 2);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field505.method539(var16, -90);
                        if ((var17 & 1) != 0) {
                            this.field505.method556(0, var16);
                        }
                    }
                    int var18 = this.field505.method552();
                    while (this.field505.method552() > 0) {
                        int var19 = var18 - this.field505.method552();
                        if (var19 > 0) {
                            this.method158((byte) 6, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method236(897);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field282[0] != null) {
                        this.method158((byte) 6, 75, "Requesting maps");
                        this.field505.method556(3, this.field505.method541(0, false, 47, 48));
                        this.field505.method556(3, this.field505.method541(1, false, 47, 48));
                        this.field505.method556(3, this.field505.method541(0, false, 48, 48));
                        this.field505.method556(3, this.field505.method541(1, false, 48, 48));
                        this.field505.method556(3, this.field505.method541(0, false, 49, 48));
                        this.field505.method556(3, this.field505.method541(1, false, 49, 48));
                        this.field505.method556(3, this.field505.method541(0, false, 47, 47));
                        this.field505.method556(3, this.field505.method541(1, false, 47, 47));
                        this.field505.method556(3, this.field505.method541(0, false, 48, 47));
                        this.field505.method556(3, this.field505.method541(1, false, 48, 47));
                        this.field505.method556(3, this.field505.method541(0, false, 48, 148));
                        this.field505.method556(3, this.field505.method541(1, false, 48, 148));
                        int var20 = this.field505.method552();
                        while (this.field505.method552() > 0) {
                            int var21 = var20 - this.field505.method552();
                            if (var21 > 0) {
                                this.method158((byte) 6, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method236(897);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var22 = this.field505.method544(0, 2);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field505.method539(var23, -90);
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
                            this.field505.method548(var23, var25, -198, 0);
                        }
                    }
                    this.field505.method558(11404, field608);
                    if (!field609) {
                        int var26 = this.field505.method544(2, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field505.method543(var27, 454)) {
                                this.field505.method548(var27, (byte) 1, -198, 2);
                            }
                        }
                    }
                    int var28 = this.field505.method544(0, 2);
                    for (int var29 = 0; var29 < var28; ++var29) {
                        int var30 = this.field505.method539(var29, -90);
                        if (var30 == 0 && this.field505.field1602 < 200) {
                            this.field505.method548(var29, (byte) 1, -198, 0);
                        }
                    }
                    this.method158((byte) 6, 80, "Unpacking media");
                    this.field464 = new class31(var6, "invback", 0);
                    this.field466 = new class31(var6, "chatback", 0);
                    this.field465 = new class31(var6, "mapback", 0);
                    this.field229 = new class31(var6, "backbase1", 0);
                    this.field230 = new class31(var6, "backbase2", 0);
                    this.field231 = new class31(var6, "backhmid1", 0);
                    for (int var31 = 0; var31 < 13; ++var31) {
                        this.field317[var31] = new class31(var6, "sideicons", var31);
                    }
                    this.field154 = new class5(var6, "compass", 0);
                    this.field601 = new class5(var6, "mapedge", 0);
                    this.field601.method21(0);
                    for (int var32 = 0; var32 < 72; ++var32) {
                        this.field485[var32] = new class31(var6, "mapscene", var32);
                    }
                    for (int var33 = 0; var33 < 70; ++var33) {
                        this.field206[var33] = new class5(var6, "mapfunction", var33);
                    }
                    for (int var34 = 0; var34 < 5; ++var34) {
                        this.field507[var34] = new class5(var6, "hitmarks", var34);
                    }
                    for (int var35 = 0; var35 < 6; ++var35) {
                        this.field483[var35] = new class5(var6, "headicons_pk", var35);
                    }
                    for (int var36 = 0; var36 < 9; ++var36) {
                        this.field273[var36] = new class5(var6, "headicons_prayer", var36);
                    }
                    for (int var37 = 0; var37 < 6; ++var37) {
                        this.field435[var37] = new class5(var6, "headicons_hint", var37);
                    }
                    this.field129 = new class5(var6, "overlay_multiway", 0);
                    this.field175 = new class5(var6, "mapmarker", 0);
                    this.field176 = new class5(var6, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field559[var38] = new class5(var6, "cross", var38);
                    }
                    this.field574 = new class5(var6, "mapdots", 0);
                    this.field575 = new class5(var6, "mapdots", 1);
                    this.field576 = new class5(var6, "mapdots", 2);
                    this.field577 = new class5(var6, "mapdots", 3);
                    this.field578 = new class5(var6, "mapdots", 4);
                    this.field358 = new class31(var6, "scrollbar", 0);
                    this.field359 = new class31(var6, "scrollbar", 1);
                    this.field486 = new class31(var6, "redstone1", 0);
                    this.field487 = new class31(var6, "redstone2", 0);
                    this.field488 = new class31(var6, "redstone3", 0);
                    this.field489 = new class31(var6, "redstone1", 0);
                    this.field489.method347(false);
                    this.field490 = new class31(var6, "redstone2", 0);
                    this.field490.method347(false);
                    this.field562 = new class31(var6, "redstone1", 0);
                    this.field562.method348(-972);
                    this.field563 = new class31(var6, "redstone2", 0);
                    this.field563.method348(-972);
                    this.field564 = new class31(var6, "redstone3", 0);
                    this.field564.method348(-972);
                    this.field565 = new class31(var6, "redstone1", 0);
                    this.field565.method347(false);
                    this.field565.method348(-972);
                    this.field566 = new class31(var6, "redstone2", 0);
                    this.field566.method347(false);
                    this.field566.method348(-972);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field379[var39] = new class31(var6, "mod_icons", var39);
                    }
                    class5 var40 = new class5(var6, "backleft1", 0);
                    this.field587 = new class26(var40.field57, var40.field58, this.method194(1), field568);
                    var40.method22(0, 952, 0);
                    class5 var41 = new class5(var6, "backleft2", 0);
                    this.field588 = new class26(var41.field57, var41.field58, this.method194(1), field568);
                    var41.method22(0, 952, 0);
                    class5 var42 = new class5(var6, "backright1", 0);
                    this.field589 = new class26(var42.field57, var42.field58, this.method194(1), field568);
                    var42.method22(0, 952, 0);
                    class5 var43 = new class5(var6, "backright2", 0);
                    this.field590 = new class26(var43.field57, var43.field58, this.method194(1), field568);
                    var43.method22(0, 952, 0);
                    class5 var44 = new class5(var6, "backtop1", 0);
                    this.field591 = new class26(var44.field57, var44.field58, this.method194(1), field568);
                    var44.method22(0, 952, 0);
                    class5 var45 = new class5(var6, "backvmid1", 0);
                    this.field592 = new class26(var45.field57, var45.field58, this.method194(1), field568);
                    var45.method22(0, 952, 0);
                    class5 var46 = new class5(var6, "backvmid2", 0);
                    this.field593 = new class26(var46.field57, var46.field58, this.method194(1), field568);
                    var46.method22(0, 952, 0);
                    class5 var47 = new class5(var6, "backvmid3", 0);
                    this.field594 = new class26(var47.field57, var47.field58, this.method194(1), field568);
                    var47.method22(0, 952, 0);
                    class5 var48 = new class5(var6, "backhmid2", 0);
                    this.field595 = new class26(var48.field57, var48.field58, this.method194(1), field568);
                    var48.method22(0, 952, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 100; ++var53) {
                        if (this.field206[var53] != null) {
                            this.field206[var53].method20(var49 + var52, var51 + var52, var50 + var52, true);
                        }
                        if (this.field485[var53] != null) {
                            this.field485[var53].method349(var49 + var52, var51 + var52, var50 + var52, true);
                        }
                    }
                    this.method158((byte) 6, 83, "Unpacking textures");
                    class27.method329(var7, 527);
                    class27.method333(0.8D, -43048);
                    class27.method328(20, (byte) 94);
                    this.method158((byte) 6, 86, "Unpacking config");
                    class29.method341(var4, -29636);
                    class48.method498(var4);
                    class60.method535(var4, -29636);
                    class45.method448(var4);
                    class70.method598(var4);
                    class18.method310(var4, -29636);
                    class37.method365(var4, -29636);
                    class1.method1(var4, -29636);
                    class12.method278(var4, -29636);
                    class45.field1269 = field608;
                    if (!field609) {
                        this.method158((byte) 6, 90, "Unpacking sounds");
                        byte[] var54 = var9.method512("sounds.dat", (byte[]) null);
                        class7 var55 = new class7(var54, (byte) 3);
                        class10.method271(var55, -29636);
                    }
                    this.method158((byte) 6, 95, "Unpacking interfaces");
                    class2[] var56 = new class2[] { this.field299, this.field300, this.field301, this.field302 };
                    class43.method444(var6, (byte) 113, var56, var5);
                    this.method158((byte) 6, 100, "Preparing game engine");
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field465.field913[this.field465.field915 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field203[var57] = var58;
                        this.field438[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field465.field913[this.field465.field915 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field427[var61 - 5] = var62 - 25;
                        this.field143[var61 - 5] = var63 - var62;
                    }
                    class27.method326(true, 503, 765);
                    this.field250 = class27.field869;
                    class27.method326(true, 96, 479);
                    this.field247 = class27.field869;
                    class27.method326(true, 261, 190);
                    this.field248 = class27.field869;
                    class27.method326(true, 334, 512);
                    this.field249 = class27.field869;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = class27.field867[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    class39.method411(800, 25509, 512, 500, 334, var65);
                    class8.method86(var8);
                    this.field572 = new class25(0, this);
                    this.method164(this.field572, 10);
                    class50.field1484 = this;
                    class48.field1426 = this;
                    class70.field1716 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field221 + " " + this.field579);
                    this.field521 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method129(int arg0) {
        this.field210 = new class31(this.field558, "titlebox", 0);
        this.field211 = new class31(this.field558, "titlebutton", 0);
        this.field388 = new class31[12];
        if (arg0 < 2 || arg0 > 2) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = 0; var3 < 12; ++var3) {
            this.field388[var3] = new class31(this.field558, "runes", var3);
        }
        this.field274 = new class5(128, 265);
        this.field275 = new class5(128, 265);
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field274.field56[var4] = this.field148.field847[var4];
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field275.field56[var5] = this.field149.field847[var5];
        }
        this.field270 = new int[256];
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field270[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field270[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field270[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field270[var9 + 192] = 16777215;
        }
        this.field271 = new int[256];
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field271[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field271[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field271[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field271[var13 + 192] = 16777215;
        }
        this.field272 = new int[256];
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field272[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field272[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field272[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field272[var17 + 192] = 16777215;
        }
        this.field269 = new int[256];
        this.field276 = new int[32768];
        this.field277 = new int[32768];
        this.method264(539, (class31) null);
        this.field598 = new int[32768];
        this.field599 = new int[32768];
        this.method158((byte) 6, 10, "Connecting to fileserver");
        if (!this.field212) {
            this.field131 = true;
            this.field212 = true;
            this.method164(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLBSNPYLEV;I)V")
    private final void method130(byte arg0, class7 arg1, int arg2) {
        if (this.field600 == arg0) {
            boolean var4 = false;
        } else {
            this.field239 = this.field309.method587();
        }
        while (arg1.field92 + 10 < arg2 * 8) {
            int var5 = arg1.method58(11, 588);
            if (var5 == 2047) {
                break;
            }
            if (this.field344[var5] == null) {
                this.field344[var5] = new class32();
                if (this.field349[var5] != null) {
                    this.field344[var5].method354(false, this.field349[var5]);
                }
            }
            this.field346[this.field345++] = var5;
            class32 var6 = this.field344[var5];
            var6.field737 = field396;
            int var7 = arg1.method58(5, 588);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method58(1, 588);
            if (var8 == 1) {
                this.field348[this.field347++] = var5;
            }
            int var9 = arg1.method58(5, 588);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg1.method58(1, 588);
            var6.method309(593, field452.field703[0] + var7, field452.field704[0] + var9, var10 == 1);
        }
        arg1.method59(0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method131(byte arg0) {
        if (arg0 != 107) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1132 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
    public final boolean method132(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field188.method405(this.field213, arg3, arg1, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method200(var7 + 1, 0, 0, arg3, field452.field704[0], 2, false, 0, field452.field703[0], true, var8, arg1);
            } else {
                class48 var9 = class48.method494(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1443;
                    var11 = var9.field1429;
                } else {
                    var10 = var9.field1429;
                    var11 = var9.field1443;
                }
                int var12 = var9.field1437;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method200(0, var11, var10, arg3, field452.field704[0], 2, false, var12, field452.field703[0], true, 0, arg1);
            }
            this.field423 = super.field1144;
            if (arg2 != -41461) {
                this.method128();
            }
            this.field424 = super.field1145;
            this.field426 = 2;
            this.field425 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method133(byte arg0) {
        byte[] var2 = this.field558.method512("title.dat", (byte[]) null);
        class5 var3 = new class5(var2, this);
        this.field148.method321(this.field499);
        var3.method22(0, 952, 0);
        this.field149.method321(this.field499);
        var3.method22(0, 952, -637);
        this.field145.method321(this.field499);
        var3.method22(0, 952, -128);
        this.field146.method321(this.field499);
        var3.method22(-371, 952, -202);
        this.field147.method321(this.field499);
        var3.method22(-171, 952, -202);
        this.field150.method321(this.field499);
        var3.method22(-265, 952, 0);
        this.field151.method321(this.field499);
        var3.method22(-265, 952, -562);
        this.field152.method321(this.field499);
        var3.method22(-171, 952, -128);
        this.field153.method321(this.field499);
        var3.method22(-171, 952, -562);
        int[] var4 = new int[var3.field57];
        for (int var5 = 0; var5 < var3.field58; ++var5) {
            for (int var11 = 0; var11 < var3.field57; ++var11) {
                var4[var11] = var3.field56[var3.field57 * var5 + (var3.field57 - var11 - 1)];
            }
            for (int var12 = 0; var12 < var3.field57; ++var12) {
                var3.field56[var3.field57 * var5 + var12] = var4[var12];
            }
        }
        this.field148.method321(this.field499);
        var3.method22(0, 952, 382);
        this.field149.method321(this.field499);
        var3.method22(0, 952, -255);
        this.field145.method321(this.field499);
        var3.method22(0, 952, 254);
        this.field146.method321(this.field499);
        var3.method22(-371, 952, 180);
        this.field147.method321(this.field499);
        var3.method22(-171, 952, 180);
        this.field150.method321(this.field499);
        var3.method22(-265, 952, 382);
        this.field151.method321(this.field499);
        var3.method22(-265, 952, -180);
        this.field152.method321(this.field499);
        var3.method22(-171, 952, 254);
        this.field153.method321(this.field499);
        var3.method22(-171, 952, -180);
        class5 var6 = new class5(this.field558, "logo", 0);
        this.field145.method321(this.field499);
        var6.method24(18, (byte) 0, 382 - var6.field57 / 2 - 128);
        if (arg0 == 0) {
            boolean var7 = false;
        } else {
            this.field399 = this.field474.method47();
        }
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method134(boolean arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            String[] var4 = new String[100];
            int var5 = 0;
            if (!arg0) {
                this.field399 = this.field474.method47();
            }
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field215 = 0;
                    label49: for (int var9 = 0; var9 < class45.field1244; ++var9) {
                        class45 var10 = class45.method455(var9);
                        if (var10.field1291 == -1 && var10.field1248 != null) {
                            String var11 = var10.field1248.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label49;
                                }
                            }
                            this.field216[this.field215] = var11;
                            this.field217[this.field215] = var9;
                            ++this.field215;
                            if (this.field215 >= this.field216.length) {
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
            this.field215 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method135(int arg0, int arg1) {
        class15 var3 = this.field136[this.field213][arg0][arg1];
        if (var3 == null) {
            this.field188.method396(this.field213, arg0, arg1);
        } else {
            int var4 = -99999999;
            class30 var5 = null;
            for (class30 var6 = (class30) var3.method300(); var6 != null; var6 = (class30) var3.method302(true)) {
                class45 var11 = class45.method455(var6.field906);
                int var12 = var11.field1282;
                if (var11.field1272) {
                    var12 = (var6.field904 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method298(false, var5);
            class30 var7 = null;
            class30 var8 = null;
            for (class30 var9 = (class30) var3.method300(); var9 != null; var9 = (class30) var3.method302(true)) {
                if (var5.field906 != var9.field906 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field906 != var9.field906 && var7.field906 != var9.field906 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field188.method382(952, arg0, var7, var10, this.field213, var5, var8, this.method159(arg1 * 128 + 64, -70, this.field213, arg0 * 128 + 64), arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method136(int arg0) {
        int var2 = this.field513 * 128 + 64;
        int var3 = this.field514 * 128 + 64;
        int var4 = this.method159(var3, -70, this.field213, var2) - this.field515;
        if (this.field284 < var2) {
            this.field284 += (var2 - this.field284) * this.field517 / 1000 + this.field516;
            if (this.field284 > var2) {
                this.field284 = var2;
            }
        }
        if (this.field284 > var2) {
            this.field284 -= (this.field284 - var2) * this.field517 / 1000 + this.field516;
            if (this.field284 < var2) {
                this.field284 = var2;
            }
        }
        if (this.field285 < var4) {
            this.field285 += (var4 - this.field285) * this.field517 / 1000 + this.field516;
            if (this.field285 > var4) {
                this.field285 = var4;
            }
        }
        if (this.field285 > var4) {
            this.field285 -= (this.field285 - var4) * this.field517 / 1000 + this.field516;
            if (this.field285 < var4) {
                this.field285 = var4;
            }
        }
        if (this.field286 < var3) {
            this.field286 += (var3 - this.field286) * this.field517 / 1000 + this.field516;
            if (this.field286 > var3) {
                this.field286 = var3;
            }
        }
        if (this.field286 > var3) {
            this.field286 -= (this.field286 - var3) * this.field517 / 1000 + this.field516;
            if (this.field286 < var3) {
                this.field286 = var3;
            }
        }
        int var5 = this.field262 * 128 + 64;
        int var6 = this.field263 * 128 + 64;
        int var7 = this.method159(var6, -70, this.field213, var5) - this.field264;
        int var8 = var5 - this.field284;
        int var9 = var7 - this.field285;
        int var10 = var6 - this.field286;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        if (arg0 != 49563) {
            this.field399 = this.field474.method47();
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field287 < var12) {
            this.field287 += (var12 - this.field287) * this.field266 / 1000 + this.field265;
            if (this.field287 > var12) {
                this.field287 = var12;
            }
        }
        if (this.field287 > var12) {
            this.field287 -= (this.field287 - var12) * this.field266 / 1000 + this.field265;
            if (this.field287 < var12) {
                this.field287 = var12;
            }
        }
        int var14 = var13 - this.field288;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field288 += this.field266 * var14 / 1000 + this.field265;
            this.field288 &= 2047;
        }
        if (var14 < 0) {
            this.field288 -= -var14 * this.field266 / 1000 + this.field265;
            this.field288 &= 2047;
        }
        int var15 = var13 - this.field288;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field288 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method137(int arg0, boolean arg1) {
        if (field452.field706 >> 7 == this.field319 && field452.field707 >> 7 == this.field320) {
            this.field319 = 0;
        }
        int var3 = this.field345;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class32 var5;
            int var6;
            if (arg1) {
                var5 = field452;
                var6 = this.field343 << 14;
            } else {
                var5 = this.field344[this.field346[var4]];
                var6 = this.field346[var4] << 14;
            }
            if (var5 != null && var5.method307(39489)) {
                var5.field952 = false;
                if ((field609 && this.field345 > 50 || this.field345 > 200) && !arg1 && var5.field723 == var5.field696) {
                    var5.field952 = true;
                }
                int var7 = var5.field706 >> 7;
                int var8 = var5.field707 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field951 != null && field396 >= var5.field946 && field396 < var5.field947) {
                        var5.field952 = false;
                        var5.field925 = this.method159(var5.field707, -70, this.field213, var5.field706);
                        this.field188.method387(var5.field708, var5.field940, 60, var5.field939, var5.field942, var5.field925, var5.field941, var6, -611, var5, var5.field707, var5.field706, this.field213);
                    } else {
                        if ((var5.field706 & 127) == 64 && (var5.field707 & 127) == 64) {
                            if (this.field422[var7][var8] == this.field223) {
                                continue;
                            }
                            this.field422[var7][var8] = this.field223;
                        }
                        var5.field925 = this.method159(var5.field707, -70, this.field213, var5.field706);
                        this.field188.method386(var5, (byte) -123, this.field213, var5.field708, var5.field695, var6, var5.field925, 60, var5.field707, var5.field706);
                    }
                }
            }
        }
        if (arg0 == 37609) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method138(int arg0) {
        for (int var2 = 0; var2 < this.field329; ++var2) {
            if (this.field255[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field351[var2] == this.field528 && this.field496[var2] == this.field596) {
                        if (!this.method214(-313)) {
                            var3 = true;
                        }
                    } else {
                        class7 var4 = class10.method272(this.field351[var2], field135, this.field496[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field91 / 22) > (long) (this.field341 / 22) + this.field389) {
                            this.field341 = var4.field91;
                            this.field389 = System.currentTimeMillis();
                            if (this.method235(this.field503, var4.field90, var4.field91)) {
                                this.field528 = this.field351[var2];
                                this.field596 = this.field496[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field127.method36(true, 227);
                        this.field127.method38(this.field351[var2] & 32767);
                    } else {
                        this.field127.method36(true, 227);
                        this.field127.method38(-1);
                    }
                }
                if (var3 && this.field255[var2] != -5) {
                    this.field255[var2] = -5;
                } else {
                    --this.field329;
                    for (int var6 = var2; var6 < this.field329; ++var6) {
                        this.field351[var6] = this.field351[var6 + 1];
                        this.field496[var6] = this.field496[var6 + 1];
                        this.field255[var6] = this.field255[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field255[var2]--;
            }
        }
        if (this.field473 != arg0) {
            this.field479 = !this.field479;
        }
        if (this.field534 > 0) {
            this.field534 -= 20;
            if (this.field534 < 0) {
                this.field534 = 0;
            }
            if (this.field534 == 0 && this.field278 && !field609) {
                this.field138 = this.field235;
                this.field139 = true;
                this.field505.method556(2, this.field138);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public final int method139(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 8990) {
            this.field136 = null;
        }
        int var5 = 256 - arg2;
        return ((arg0 & 16711935) * arg2 + (arg1 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg2 + (arg1 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQHGHUTGN;)Z")
    public final boolean method140(int arg0, class43 arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        } else if (arg1.field1232 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1232.length; ++var3) {
                int var4 = this.method234(var3, arg1, 0);
                int var5 = arg1.field1211[var3];
                if (arg1.field1232[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1232[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1232[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field606 = Integer.parseInt(this.getParameter("nodeid"));
        field607 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method224(-444);
        } else {
            method215(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field608 = false;
        } else {
            field608 = true;
        }
        this.method427(765, 9, 503);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method141(int arg0) {
        while (arg0 >= 0) {
            this.field136 = null;
        }
        int var2 = this.field301.method6(-754, "Choose Option");
        for (int var3 = 0; var3 < this.field449; ++var3) {
            int var11 = this.field301.method6(-754, this.field126[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field449 * 15 + 21;
        if (super.field1144 > 4 && super.field1145 > 4 && super.field1144 < 516 && super.field1145 < 338) {
            int var5 = super.field1144 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1145 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field456 = true;
            this.field529 = 0;
            this.field530 = var5;
            this.field531 = var6;
            this.field532 = var2;
            this.field533 = this.field449 * 15 + 22;
        }
        if (super.field1144 > 553 && super.field1145 > 205 && super.field1144 < 743 && super.field1145 < 466) {
            int var7 = super.field1144 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1145 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field456 = true;
            this.field529 = 1;
            this.field530 = var7;
            this.field531 = var8;
            this.field532 = var2;
            this.field533 = this.field449 * 15 + 22;
        }
        if (super.field1144 > 17 && super.field1145 > 357 && super.field1144 < 496 && super.field1145 < 453) {
            int var9 = super.field1144 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1145 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field456 = true;
            this.field529 = 2;
            this.field530 = var9;
            this.field531 = var10;
            this.field532 = var2;
            this.field533 = this.field449 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        this.field510 = true;
        if (arg0) {
            this.field340 = 418;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field212) {
                ++this.field410;
                this.method147((byte) 2);
                this.method147((byte) 2);
                this.method153(this.field350);
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
        this.field510 = false;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method143(int arg0, int arg1) {
        if (arg1 <= 0) {
            field135 = !field135;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method144(byte arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (this.field137 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method145(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field399 = this.field474.method47();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method430(126);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field253 != -1 && this.field494 == this.field253) {
                        if (var2 == 8 && this.field187.length() > 0) {
                            this.field187 = this.field187.substring(0, this.field187.length() - 1);
                        }
                        break;
                    }
                    if (this.field219) {
                        if (var2 >= 32 && var2 <= 122 && this.field567.length() < 80) {
                            this.field567 = this.field567 + (char) var2;
                            this.field267 = true;
                        }
                        if (var2 == 8 && this.field567.length() > 0) {
                            this.field567 = this.field567.substring(0, this.field567.length() - 1);
                            this.field267 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field219 = false;
                            this.field267 = true;
                            if (this.field252 == 1) {
                                long var3 = class51.method505(this.field567);
                                this.method155(var3, true);
                            }
                            if (this.field252 == 2 && this.field471 > 0) {
                                long var5 = class51.method505(this.field567);
                                this.method231(true, var5);
                            }
                            if (this.field252 == 3 && this.field567.length() > 0) {
                                this.field127.method36(true, 186);
                                this.field127.method37(0);
                                int var7 = this.field127.field91;
                                this.field127.method43(this.field493, 3);
                                class69.method591(this.field567, this.field127, (byte) -4);
                                this.field127.method46(5, this.field127.field91 - var7);
                                this.field567 = class69.method592(0, this.field567);
                                this.field567 = class8.method96(0, this.field567);
                                this.method267(class51.method509(class51.method506(false, this.field493), true), false, this.field567, 6);
                                if (this.field246 == 2) {
                                    this.field246 = 1;
                                    this.field125 = true;
                                    this.field127.method36(true, 24);
                                    this.field127.method37(this.field584);
                                    this.field127.method37(this.field246);
                                    this.field127.method37(this.field238);
                                }
                            }
                            if (this.field252 == 4 && this.field519 < 100) {
                                long var8 = class51.method505(this.field567);
                                this.method181(var8, 0);
                            }
                            if (this.field252 == 5 && this.field519 > 0) {
                                long var10 = class51.method505(this.field567);
                                this.method191(var10, this.field560);
                            }
                        }
                    } else if (this.field281 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field308.length() < 10) {
                            this.field308 = this.field308 + (char) var2;
                            this.field267 = true;
                        }
                        if (var2 == 8 && this.field308.length() > 0) {
                            this.field308 = this.field308.substring(0, this.field308.length() - 1);
                            this.field267 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field308.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field308);
                                } catch (Exception var22) {
                                }
                                this.field127.method36(true, 33);
                                this.field127.method41(var12);
                            }
                            this.field281 = 0;
                            this.field267 = true;
                        }
                    } else if (this.field281 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field308.length() < 12) {
                            this.field308 = this.field308 + (char) var2;
                            this.field267 = true;
                        }
                        if (var2 == 8 && this.field308.length() > 0) {
                            this.field308 = this.field308.substring(0, this.field308.length() - 1);
                            this.field267 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field308.length() > 0) {
                                this.field127.method36(true, 119);
                                this.field127.method43(class51.method505(this.field308), 3);
                            }
                            this.field281 = 0;
                            this.field267 = true;
                        }
                    } else if (this.field281 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field308.length() < 40) {
                            this.field308 = this.field308 + (char) var2;
                            this.field267 = true;
                        }
                        if (var2 == 8 && this.field308.length() > 0) {
                            this.field308 = this.field308.substring(0, this.field308.length() - 1);
                            this.field267 = true;
                        }
                    } else if (this.field183 == -1 && this.field455 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field333.length() < 80) {
                            this.field333 = this.field333 + (char) var2;
                            this.field267 = true;
                        }
                        if (var2 == 8 && this.field333.length() > 0) {
                            this.field333 = this.field333.substring(0, this.field333.length() - 1);
                            this.field267 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field333.length() > 0) {
                            if (this.field296 == 2) {
                                if (this.field333.equals("::clientdrop")) {
                                    this.method201(-39300);
                                }
                                if (this.field333.equals("::lag")) {
                                    this.method193(-955);
                                }
                                if (this.field333.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field505.method544(2, 2); ++var13) {
                                        this.field505.method548(var13, (byte) 1, -198, 2);
                                    }
                                }
                                if (this.field333.equals("::fpson")) {
                                    field334 = true;
                                }
                                if (this.field333.equals("::fpsoff")) {
                                    field334 = false;
                                }
                                if (this.field333.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field363[var14].field675[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field333.startsWith("::")) {
                                this.field127.method36(true, 46);
                                this.field127.method37(this.field333.length() - 1);
                                this.field127.method44(this.field333.substring(2));
                            } else {
                                String var17 = this.field333.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field333 = this.field333.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field333 = this.field333.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field333 = this.field333.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field333 = this.field333.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field333 = this.field333.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field333 = this.field333.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field333 = this.field333.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field333 = this.field333.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field333 = this.field333.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field333 = this.field333.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field333 = this.field333.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field333 = this.field333.substring(6);
                                }
                                String var19 = this.field333.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field333 = this.field333.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field333 = this.field333.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field333 = this.field333.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field333 = this.field333.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field333 = this.field333.substring(6);
                                }
                                this.field127.method36(true, 145);
                                this.field127.method37(0);
                                int var21 = this.field127.field91;
                                this.field127.method64(var20, false);
                                this.field127.method37(var18);
                                this.field169.field91 = 0;
                                class69.method591(this.field333, this.field169, (byte) -4);
                                this.field127.method83(this.field169.field91, 0, true, this.field169.field90);
                                this.field127.method46(5, this.field127.field91 - var21);
                                this.field333 = class69.method592(0, this.field333);
                                this.field333 = class8.method96(0, this.field333);
                                field452.field736 = this.field333;
                                field452.field711 = var18;
                                field452.field715 = var20;
                                field452.field709 = 150;
                                if (this.field296 == 2) {
                                    this.method267("@cr2@" + field452.field924, false, field452.field736, 2);
                                } else if (this.field296 == 1) {
                                    this.method267("@cr1@" + field452.field924, false, field452.field736, 2);
                                } else {
                                    this.method267(field452.field924, false, field452.field736, 2);
                                }
                                if (this.field584 == 2) {
                                    this.field584 = 3;
                                    this.field125 = true;
                                    this.field127.method36(true, 24);
                                    this.field127.method37(this.field584);
                                    this.field127.method37(this.field246);
                                    this.field127.method37(this.field238);
                                }
                            }
                            this.field333 = "";
                            this.field267 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field187.length() < 12) {
                this.field187 = this.field187 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method146(int arg0) {
        this.field548.method321(this.field499);
        class27.field869 = this.field247;
        this.field466.method350(0, (byte) 0, 0);
        if (this.field219) {
            this.field301.method4(0, 40, this.field522, (byte) 5, 239);
            this.field301.method4(128, 60, this.field567 + "*", (byte) 5, 239);
        } else if (this.field281 == 1) {
            this.field301.method4(0, 40, "Enter amount:", (byte) 5, 239);
            this.field301.method4(128, 60, this.field308 + "*", (byte) 5, 239);
        } else if (this.field281 == 2) {
            this.field301.method4(0, 40, "Enter name:", (byte) 5, 239);
            this.field301.method4(128, 60, this.field308 + "*", (byte) 5, 239);
        } else if (this.field281 == 3) {
            if (this.field308 != this.field214) {
                this.method134(true, this.field308);
                this.field214 = this.field308;
            }
            class2 var2 = this.field300;
            class58.method525(32409, 0, 0, 77, 463);
            for (int var3 = 0; var3 < this.field215; ++var3) {
                int var4 = var3 * 14 + 18 - this.field218;
                if (var4 > 0 && var4 < 110) {
                    var2.method4(0, var4, this.field216[var3], (byte) 5, 239);
                }
            }
            class58.method524(this.field436);
            if (this.field215 > 5) {
                this.method203(0, this.field215 * 14 + 7, this.field218, 463, false, 77);
            }
            if (this.field308.length() == 0) {
                this.field301.method4(255, 40, "Enter object name", (byte) 5, 239);
            } else if (this.field215 == 0) {
                this.field301.method4(0, 40, "No matching objects found, please shorten search", (byte) 5, 239);
            }
            var2.method4(0, 90, this.field308 + "*", (byte) 5, 239);
            class58.method531(77, 479, 0, 0, 0);
        } else if (this.field245 != null) {
            this.field301.method4(0, 40, this.field245, (byte) 5, 239);
            this.field301.method4(128, 60, "Click to continue", (byte) 5, 239);
        } else if (this.field183 != -1) {
            this.method166(0, 0, class43.method445(this.field183), 7, 0);
        } else if (this.field313 != -1) {
            this.method166(0, 0, class43.method445(this.field313), 7, 0);
        } else {
            class2 var5 = this.field300;
            int var6 = 0;
            class58.method525(32409, 0, 0, 77, 463);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field478[var7] != null) {
                    int var9 = this.field476[var7];
                    int var10 = 70 - var6 * 14 + this.field128;
                    String var11 = this.field477[var7];
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
                            var5.method8(4, this.field478[var7], var10, 0, (byte) 27);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field584 == 0 || this.field584 == 1 && this.method180(var11, (byte) 17))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field379[0].method350(var10 - 12, (byte) 0, var13);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field379[1].method350(var10 - 12, (byte) 0, var13);
                                var13 += 14;
                            }
                            var5.method8(var13, var11 + ":", var10, 0, (byte) 27);
                            int var14 = var13 + var5.method6(-754, var11) + 8;
                            var5.method8(var14, this.field478[var7], var10, 255, (byte) 27);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field414 == 0 && (var9 == 7 || this.field246 == 0 || this.field246 == 1 && this.method180(var11, (byte) 17))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method8(var15, "From", var10, 0, (byte) 27);
                            int var16 = var15 + var5.method6(-754, "From ");
                            if (var12 == 1) {
                                this.field379[0].method350(var10 - 12, (byte) 0, var16);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field379[1].method350(var10 - 12, (byte) 0, var16);
                                var16 += 14;
                            }
                            var5.method8(var16, var11 + ":", var10, 0, (byte) 27);
                            int var17 = var16 + var5.method6(-754, var11) + 8;
                            var5.method8(var17, this.field478[var7], var10, 8388608, (byte) 27);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field238 == 0 || this.field238 == 1 && this.method180(var11, (byte) 17))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method8(4, var11 + " " + this.field478[var7], var10, 8388736, (byte) 27);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field414 == 0 && this.field246 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method8(4, this.field478[var7], var10, 8388608, (byte) 27);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field414 == 0 && this.field246 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method8(4, "To " + var11 + ":", var10, 0, (byte) 27);
                            var5.method8(12 + var5.method6(-754, "To " + var11), this.field478[var7], var10, 8388608, (byte) 27);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field238 == 0 || this.field238 == 1 && this.method180(var11, (byte) 17))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method8(4, var11 + " " + this.field478[var7], var10, 8270336, (byte) 27);
                        }
                        ++var6;
                    }
                }
            }
            class58.method524(this.field436);
            this.field236 = var6 * 14 + 7;
            if (this.field236 < 78) {
                this.field236 = 78;
            }
            this.method203(0, this.field236, this.field236 - this.field128 - 77, 463, false, 77);
            String var8;
            if (field452 != null && field452.field924 != null) {
                var8 = field452.field924;
            } else {
                var8 = class51.method509(this.field380, true);
            }
            var5.method8(4, var8 + ":", 90, 0, (byte) 27);
            var5.method8(6 + var5.method6(-754, var8 + ": "), this.field333 + "*", 90, 255, (byte) 27);
            class58.method531(77, 479, 0, 0, 0);
        }
        if (this.field456 && this.field529 == 2) {
            this.method239(120);
        }
        this.field548.method322(357, super.field1129, 17, (byte) -47);
        this.field547.method321(this.field499);
        if (arg0 >= 0) {
            this.field399 = this.field474.method47();
        }
        class27.field869 = this.field249;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method147(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field598[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field598[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field599[var14] = (this.field598[var14 - 1] + this.field598[var14 + 1] + this.field598[var14 - 128] + this.field598[var14 + 128]) / 4;
            }
        }
        this.field201 += 128;
        if (this.field201 > this.field276.length) {
            this.field201 -= this.field276.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method264(539, this.field388[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field599[var11 + 128] - this.field276[this.field201 + var11 & this.field276.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field598[var11] = var12;
            }
        }
        if (this.field160 != arg0) {
            this.field127.method37(214);
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field475[var8] = this.field475[var8 + 1];
        }
        this.field475[var2 - 1] = (int) (Math.sin((double) field396 / 14.0D) * 16.0D + Math.sin((double) field396 / 15.0D) * 14.0D + Math.sin((double) field396 / 16.0D) * 12.0D);
        if (this.field497 > 0) {
            this.field497 -= 4;
        }
        if (this.field498 > 0) {
            this.field498 -= 4;
        }
        if (this.field497 == 0 && this.field498 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field497 = 1024;
            }
            if (var9 == 1) {
                this.field498 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 375);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field606 = Integer.parseInt(arg0[0]);
                field607 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method224(-444);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method215(0);
                }
                if (arg0[3].equals("free")) {
                    field608 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field608 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method426(0, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ZI)LSMIVAFST;")
    public final class52 method148(int arg0, int arg1, String arg2, String arg3, boolean arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field282[0] != null) {
                var7 = this.field282[0].method514(7, arg1);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field581.reset();
            this.field581.update(var7);
            int var9 = (int) this.field581.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class52(var7, 0);
        } else {
            int var11 = 0;
            if (arg4) {
                throw new NullPointerException();
            } else {
                while (var7 == null) {
                    String var12 = "Unknown error";
                    this.method158((byte) 6, arg0, "Requesting " + arg2);
                    Object var13 = null;
                    try {
                        int var14 = 0;
                        DataInputStream var15 = this.method154(arg3 + arg5);
                        byte[] var16 = new byte[6];
                        var15.readFully(var16, 0, 6);
                        class7 var17 = new class7(var16, (byte) 3);
                        var17.field91 = 3;
                        int var18 = var17.method51() + 6;
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
                                this.method158((byte) 6, arg0, "Loading " + arg2 + " - " + var23 + "%");
                            }
                            var14 = var23;
                        }
                        var15.close();
                        try {
                            if (this.field282[0] != null) {
                                this.field282[0].method515(arg1, var7, var7.length, (byte) 1);
                            }
                        } catch (Exception var29) {
                            this.field282[0] = null;
                        }
                        if (var7 != null) {
                            this.field581.reset();
                            this.field581.update(var7);
                            int var24 = (int) this.field581.getValue();
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
                                this.method158((byte) 6, arg0, "Game updated - please reload page");
                                var26 = 10;
                            } else {
                                this.method158((byte) 6, arg0, var12 + " - Retrying in " + var26);
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
                        this.field209 = !this.field209;
                    }
                }
                return new class52(var7, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LKZCOXKKW;IILBSNPYLEV;Z)V")
    private final void method149(class32 arg0, int arg1, int arg2, class7 arg3, boolean arg4) {
        if (arg4) {
            this.field136 = null;
        }
        if ((arg1 & 128) != 0) {
            int var6 = arg3.method75(true);
            int var7 = arg3.method67(-48149);
            int var8 = arg3.method66(2);
            int var9 = arg3.field91;
            if (arg0.field924 != null && arg0.field921) {
                long var10 = class51.method505(arg0.field924);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.field519; ++var13) {
                        if (this.field298[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.field602 == 0) {
                    try {
                        this.field169.field91 = 0;
                        arg3.method84(var8, 531, this.field169.field90, 0);
                        this.field169.field91 = 0;
                        String var14 = class69.method590(3, this.field169, var8);
                        String var15 = class8.method96(0, var14);
                        arg0.field736 = var15;
                        arg0.field711 = var6 >> 8;
                        arg0.field715 = var6 & 255;
                        arg0.field709 = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.method267("@cr1@" + arg0.field924, false, var15, 1);
                            } else {
                                this.method267(arg0.field924, false, var15, 2);
                            }
                        } else {
                            this.method267("@cr2@" + arg0.field924, false, var15, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field91 = var8 + var9;
        }
        if ((arg1 & 32) != 0) {
            int var17 = arg3.method47();
            byte[] var18 = new byte[var17];
            class7 var19 = new class7(var18, (byte) 3);
            arg3.method85(var18, var17, (byte) 8, 0);
            this.field349[arg2] = var19;
            arg0.method354(false, var19);
        }
        if ((arg1 & 1) != 0) {
            arg0.field713 = arg3.method73(6);
            arg0.field714 = arg3.method49();
        }
        if ((arg1 & 1024) != 0) {
            arg0.field687 = arg3.method67(-48149);
            arg0.field689 = arg3.method67(-48149);
            arg0.field688 = arg3.method67(-48149);
            arg0.field690 = arg3.method67(-48149);
            arg0.field691 = arg3.method75(true) + field396;
            arg0.field692 = arg3.method74((byte) -99) + field396;
            arg0.field693 = arg3.method66(2);
            arg0.method306((byte) 6);
        }
        if ((arg1 & 64) != 0) {
            arg0.field718 = arg3.method74((byte) -99);
            if (arg0.field718 == 65535) {
                arg0.field718 = -1;
            }
        }
        if ((arg1 & 4) != 0) {
            arg0.field736 = arg3.method54();
            if (arg0.field736.charAt(0) == '~') {
                arg0.field736 = arg0.field736.substring(1);
                this.method267(arg0.field924, false, arg0.field736, 2);
            } else if (field452 == arg0) {
                this.method267(arg0.field924, false, arg0.field736, 2);
            }
            arg0.field711 = 0;
            arg0.field715 = 0;
            arg0.field709 = 150;
        }
        if ((arg1 & 16) != 0) {
            int var20 = arg3.method66(2);
            int var21 = arg3.method66(2);
            arg0.method308(var21, var20, true, field396);
            arg0.field733 = field396 + 300;
            arg0.field734 = arg3.method66(2);
            arg0.field735 = arg3.method66(2);
        }
        if ((arg1 & 512) != 0) {
            int var22 = arg3.method65(0);
            int var23 = arg3.method65(0);
            arg0.method308(var23, var22, true, field396);
            arg0.field733 = field396 + 300;
            arg0.field734 = arg3.method66(2);
            arg0.field735 = arg3.method66(2);
        }
        if ((arg1 & 8) != 0) {
            int var24 = arg3.method74((byte) -99);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = arg3.method67(-48149);
            if (arg0.field698 == var24 && var24 != -1) {
                int var26 = class29.field887[var24].field901;
                if (var26 == 1) {
                    arg0.field699 = 0;
                    arg0.field700 = 0;
                    arg0.field701 = var25;
                    arg0.field702 = 0;
                }
                if (var26 == 2) {
                    arg0.field702 = 0;
                }
            } else if (var24 == -1 || arg0.field698 == -1 || class29.field887[var24].field895 >= class29.field887[arg0.field698].field895) {
                arg0.field698 = var24;
                arg0.field699 = 0;
                arg0.field700 = 0;
                arg0.field701 = var25;
                arg0.field702 = 0;
                arg0.field710 = arg0.field705;
            }
        }
        if ((arg1 & 256) != 0) {
            arg0.field728 = arg3.method73(6);
            int var27 = arg3.method81((byte) -12);
            arg0.field732 = var27 >> 16;
            arg0.field731 = (var27 & 65535) + field396;
            arg0.field729 = 0;
            arg0.field730 = 0;
            if (arg0.field731 > field396) {
                arg0.field729 = -1;
            }
            if (arg0.field728 == 65535) {
                arg0.field728 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILBSNPYLEV;I)V")
    private final void method150(int arg0, class7 arg1, int arg2) {
        int var4 = arg1.method58(8, 588);
        if (arg0 <= 0) {
            this.field136 = null;
        }
        if (var4 < this.field345) {
            for (int var5 = var4; var5 < this.field345; ++var5) {
                this.field331[this.field330++] = this.field346[var5];
            }
        }
        if (var4 > this.field345) {
            signlink.reporterror(this.field380 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field345 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field346[var6];
                class32 var8 = this.field344[var7];
                int var9 = arg1.method58(1, 588);
                if (var9 == 0) {
                    this.field346[this.field345++] = var7;
                    var8.field737 = field396;
                } else {
                    int var10 = arg1.method58(2, 588);
                    if (var10 == 0) {
                        this.field346[this.field345++] = var7;
                        var8.field737 = field396;
                        this.field348[this.field347++] = var7;
                    } else if (var10 == 1) {
                        this.field346[this.field345++] = var7;
                        var8.field737 = field396;
                        int var11 = arg1.method58(3, 588);
                        var8.method305(4, false, var11);
                        int var12 = arg1.method58(1, 588);
                        if (var12 == 1) {
                            this.field348[this.field347++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field346[this.field345++] = var7;
                        var8.field737 = field396;
                        int var13 = arg1.method58(3, 588);
                        var8.method305(4, true, var13);
                        int var14 = arg1.method58(3, 588);
                        var8.method305(4, true, var14);
                        int var15 = arg1.method58(1, 588);
                        if (var15 == 1) {
                            this.field348[this.field347++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field331[this.field330++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method151(int arg0) {
        this.field545.method321(this.field499);
        class27.field869 = this.field248;
        this.field464.method350(0, (byte) 0, 0);
        if (this.field409 != -1) {
            this.method166(0, 0, class43.method445(this.field409), 7, 0);
        } else if (this.field432[this.field580] != -1) {
            this.method166(0, 0, class43.method445(this.field432[this.field580]), 7, 0);
        }
        if (this.field456 && this.field529 == 1) {
            this.method239(120);
        }
        this.field545.method322(205, super.field1129, 553, (byte) -47);
        int var2 = 22 / arg0;
        this.field547.method321(this.field499);
        class27.field869 = this.field249;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public final void method152(int arg0, byte arg1) {
        if (arg1 != 62) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class43.method438(arg0, (byte) 62);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method153(boolean arg0) {
        short var2 = 256;
        if (this.field497 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field497 > 768) {
                    this.field269[var3] = this.method139(this.field271[var3], this.field270[var3], 1024 - this.field497, this.field178);
                } else if (this.field497 > 256) {
                    this.field269[var3] = this.field271[var3];
                } else {
                    this.field269[var3] = this.method139(this.field270[var3], this.field271[var3], 256 - this.field497, this.field178);
                }
            }
        } else if (this.field498 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field498 > 768) {
                    this.field269[var4] = this.method139(this.field272[var4], this.field270[var4], 1024 - this.field498, this.field178);
                } else if (this.field498 > 256) {
                    this.field269[var4] = this.field272[var4];
                } else {
                    this.field269[var4] = this.method139(this.field270[var4], this.field272[var4], 256 - this.field498, this.field178);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field269[var5] = this.field270[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field148.field847[var6] = this.field274.field56[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field475[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field598[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field269[var26];
                    int var30 = this.field148.field847[var8];
                    this.field148.field847[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field148.method322(0, super.field1129, 0, (byte) -47);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field149.field847[var10] = this.field275.field56[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field475[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field598[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field269[var18];
                    int var22 = this.field149.field847[var16];
                    this.field149.field847[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field322 &= arg0;
        this.field149.method322(0, super.field1129, 637, (byte) -47);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method154(String arg0) throws IOException {
        if (!this.field209) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field500 != null) {
                try {
                    this.field500.close();
                } catch (Exception var4) {
                }
                this.field500 = null;
            }
            this.field500 = this.method176(43595);
            this.field500.setSoTimeout(10000);
            InputStream var2 = this.field500.getInputStream();
            OutputStream var3 = this.field500.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
    public final void method155(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field471 >= 100 && this.field226 != 1) {
                this.method267("", false, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else if (this.field471 >= 200) {
                this.method267("", false, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else {
                String var4 = class51.method509(class51.method506(false, arg0), true);
                for (int var5 = 0; var5 < this.field471; ++var5) {
                    if (this.field297[var5] == arg0) {
                        this.method267("", false, var4 + " is already on your friend list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field519; ++var6) {
                    if (this.field298[var6] == arg0) {
                        this.method267("", false, "Please remove " + var4 + " from your ignore list first", 0);
                        return;
                    }
                }
                if (!var4.equals(field452.field924)) {
                    this.field453[this.field471] = var4;
                    if (!arg1) {
                        this.field279 = !this.field279;
                    }
                    this.field297[this.field471] = arg0;
                    this.field390[this.field471] = 0;
                    ++this.field471;
                    this.field192 = true;
                    this.field127.method36(true, 92);
                    this.field127.method43(arg0, 3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQHGHUTGN;B)Z")
    public final boolean method156(class43 arg0, byte arg1) {
        int var3 = arg0.field1193;
        if (arg1 != -67) {
            this.field399 = this.field474.method47();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field126[this.field449] = "Remove @whi@" + arg0.field1183;
                this.field197[this.field449] = 144;
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
            this.field126[this.field449] = "Remove @whi@" + this.field453[var3];
            this.field197[this.field449] = 70;
            ++this.field449;
            this.field126[this.field449] = "Message @whi@" + this.field453[var3];
            this.field197[this.field449] = 334;
            ++this.field449;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLBSNPYLEV;)V")
    private final void method157(int arg0, byte arg1, class7 arg2) {
        if (arg1 != 117) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field347; ++var5) {
            int var6 = this.field348[var5];
            class53 var7 = this.field170[var6];
            int var8 = arg2.method47();
            if ((var8 & 32) != 0) {
                var7.field713 = arg2.method74((byte) -99);
                var7.field714 = arg2.method49();
            }
            if ((var8 & 8) != 0) {
                var7.field718 = arg2.method49();
                if (var7.field718 == 65535) {
                    var7.field718 = -1;
                }
            }
            if ((var8 & 4) != 0) {
                var7.field736 = arg2.method54();
                var7.field709 = 100;
            }
            if ((var8 & 128) != 0) {
                var7.field1508 = class70.method597(arg2.method49());
                var7.field682 = var7.field1508.field1718;
                var7.field726 = var7.field1508.field1739;
                var7.field683 = var7.field1508.field1711;
                var7.field684 = var7.field1508.field1714;
                var7.field685 = var7.field1508.field1733;
                var7.field686 = var7.field1508.field1736;
                var7.field696 = var7.field1508.field1705;
            }
            if ((var8 & 64) != 0) {
                int var9 = arg2.method66(2);
                int var10 = arg2.method47();
                var7.method308(var10, var9, true, field396);
                var7.field733 = field396 + 300;
                var7.field734 = arg2.method67(-48149);
                var7.field735 = arg2.method66(2);
            }
            if ((var8 & 2) != 0) {
                int var11 = arg2.method49();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg2.method47();
                if (var7.field698 == var11 && var11 != -1) {
                    int var13 = class29.field887[var11].field901;
                    if (var13 == 1) {
                        var7.field699 = 0;
                        var7.field700 = 0;
                        var7.field701 = var12;
                        var7.field702 = 0;
                    }
                    if (var13 == 2) {
                        var7.field702 = 0;
                    }
                } else if (var11 == -1 || var7.field698 == -1 || class29.field887[var11].field895 >= class29.field887[var7.field698].field895) {
                    var7.field698 = var11;
                    var7.field699 = 0;
                    var7.field700 = 0;
                    var7.field701 = var12;
                    var7.field702 = 0;
                    var7.field710 = var7.field705;
                }
            }
            if ((var8 & 16) != 0) {
                int var14 = arg2.method66(2);
                int var15 = arg2.method65(0);
                var7.method308(var15, var14, true, field396);
                var7.field733 = field396 + 300;
                var7.field734 = arg2.method67(-48149);
                var7.field735 = arg2.method66(2);
            }
            if ((var8 & 1) != 0) {
                var7.field728 = arg2.method73(6);
                int var16 = arg2.method81((byte) -12);
                var7.field732 = var16 >> 16;
                var7.field731 = (var16 & 65535) + field396;
                var7.field729 = 0;
                var7.field730 = 0;
                if (var7.field731 > field396) {
                    var7.field729 = -1;
                }
                if (var7.field728 == 65535) {
                    var7.field728 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;)V")
    public final void method158(byte arg0, int arg1, String arg2) {
        this.field579 = arg1;
        this.field221 = arg2;
        this.method195(828);
        if (this.field558 == null) {
            super.method158((byte) 6, arg1, arg2);
        } else {
            this.field147.method321(this.field499);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field301.method4(16777215, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", (byte) 5, var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            class58.method529(304, 34, 42741, var7, 9179409, var4 / 2 - 152);
            class58.method529(302, 32, 42741, var7 + 1, 0, var4 / 2 - 151);
            class58.method528(this.field234, arg1 * 3, var7 + 2, var4 / 2 - 150, 30, 9179409);
            if (arg0 == 6) {
                boolean var8 = false;
                class58.method528(this.field234, 300 - arg1 * 3, var7 + 2, arg1 * 3 + (var4 / 2 - 150), 30, 0);
                this.field301.method4(16777215, var5 / 2 + 5 - var6, arg2, (byte) 5, var4 / 2);
                this.field147.method322(171, super.field1129, 202, (byte) -47);
                if (this.field133) {
                    this.field133 = false;
                    if (!this.field212) {
                        this.field148.method322(0, super.field1129, 0, (byte) -47);
                        this.field149.method322(0, super.field1129, 637, (byte) -47);
                    }
                    this.field145.method322(0, super.field1129, 128, (byte) -47);
                    this.field146.method322(371, super.field1129, 202, (byte) -47);
                    this.field150.method322(265, super.field1129, 0, (byte) -47);
                    this.field151.method322(265, super.field1129, 562, (byte) -47);
                    this.field152.method322(171, super.field1129, 128, (byte) -47);
                    this.field153.method322(171, super.field1129, 562, (byte) -47);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
    public final int method159(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            while (arg1 >= 0) {
                this.field241 = 121;
            }
            if (arg2 < 3 && (this.field549[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field604[var7][var5][var6] + this.field604[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field604[var7][var5][var6 + 1] + this.field604[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILQHGHUTGN;IIBII)V")
    public final void method160(int arg0, int arg1, class43 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != -21) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        if (arg2.field1204 == 0 && arg2.field1167 != null && !arg2.field1210) {
            if (arg7 >= arg4 && arg0 >= arg1 && arg7 <= arg2.field1227 + arg4 && arg0 <= arg2.field1206 + arg1) {
                int var10 = arg2.field1167.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg2.field1165[var11] + arg4;
                    int var13 = arg2.field1179[var11] + arg1 - arg3;
                    class43 var14 = class43.method445(arg2.field1167[var11]);
                    int var15 = var14.field1174 + var12;
                    int var16 = var14.field1171 + var13;
                    if ((var14.field1182 >= 0 || var14.field1212 != 0) && arg7 >= var15 && arg0 >= var16 && arg7 < var14.field1227 + var15 && arg0 < var14.field1206 + var16) {
                        if (var14.field1182 >= 0) {
                            this.field393 = var14.field1182;
                        } else {
                            this.field393 = var14.field1175;
                        }
                    }
                    if (var14.field1204 == 8 && arg7 >= var15 && arg0 >= var16 && arg7 < var14.field1227 + var15 && arg0 < var14.field1206 + var16) {
                        this.field130 = var14.field1175;
                    }
                    if (var14.field1204 == 0) {
                        this.method160(arg0, var16, var14, var14.field1195, var15, (byte) -21, arg6, arg7);
                        if (var14.field1188 > var14.field1206) {
                            this.method162(arg0, arg6, arg7, var14, var14.field1227 + var15, var14.field1188, 0, var14.field1206, var16);
                        }
                    } else {
                        if (var14.field1233 == 1 && arg7 >= var15 && arg0 >= var16 && arg7 < var14.field1227 + var15 && arg0 < var14.field1206 + var16) {
                            boolean var17 = false;
                            if (var14.field1193 != 0) {
                                var17 = this.method156(var14, (byte) -67);
                            }
                            if (!var17) {
                                this.field126[this.field449] = var14.field1225;
                                this.field197[this.field449] = 887;
                                this.field196[this.field449] = var14.field1175;
                                ++this.field449;
                            }
                        }
                        if (var14.field1233 == 2 && this.field440 == 0 && arg7 >= var15 && arg0 >= var16 && arg7 < var14.field1227 + var15 && arg0 < var14.field1206 + var16) {
                            String var18 = var14.field1226;
                            if (var18.indexOf(" ") != -1) {
                                var18 = var18.substring(0, var18.indexOf(" "));
                            }
                            this.field126[this.field449] = var18 + " @gre@" + var14.field1214;
                            this.field197[this.field449] = 654;
                            this.field196[this.field449] = var14.field1175;
                            ++this.field449;
                        }
                        if (var14.field1233 == 3 && arg7 >= var15 && arg0 >= var16 && arg7 < var14.field1227 + var15 && arg0 < var14.field1206 + var16) {
                            this.field126[this.field449] = "Close";
                            if (arg6 == 3) {
                                this.field197[this.field449] = 419;
                            } else {
                                this.field197[this.field449] = 8;
                            }
                            this.field196[this.field449] = var14.field1175;
                            ++this.field449;
                        }
                        if (var14.field1233 == 4 && arg7 >= var15 && arg0 >= var16 && arg7 < var14.field1227 + var15 && arg0 < var14.field1206 + var16) {
                            this.field126[this.field449] = var14.field1225;
                            this.field197[this.field449] = 609;
                            this.field196[this.field449] = var14.field1175;
                            ++this.field449;
                        }
                        if (var14.field1233 == 5 && arg7 >= var15 && arg0 >= var16 && arg7 < var14.field1227 + var15 && arg0 < var14.field1206 + var16) {
                            this.field126[this.field449] = var14.field1225;
                            this.field197[this.field449] = 338;
                            this.field196[this.field449] = var14.field1175;
                            ++this.field449;
                        }
                        if (var14.field1233 == 6 && !this.field142 && arg7 >= var15 && arg0 >= var16 && arg7 < var14.field1227 + var15 && arg0 < var14.field1206 + var16) {
                            this.field126[this.field449] = var14.field1225;
                            this.field197[this.field449] = 477;
                            this.field196[this.field449] = var14.field1175;
                            ++this.field449;
                        }
                        if (var14.field1204 == 2) {
                            int var19 = 0;
                            for (int var20 = 0; var20 < var14.field1206; ++var20) {
                                for (int var21 = 0; var21 < var14.field1227; ++var21) {
                                    int var22 = (var14.field1162 + 32) * var21 + var15;
                                    int var23 = (var14.field1228 + 32) * var20 + var16;
                                    if (var19 < 20) {
                                        var22 += var14.field1209[var19];
                                        var23 += var14.field1197[var19];
                                    }
                                    if (arg7 >= var22 && arg0 >= var23 && arg7 < var22 + 32 && arg0 < var23 + 32) {
                                        this.field394 = var19;
                                        this.field395 = var14.field1175;
                                        if (var14.field1177[var19] > 0) {
                                            class45 var24 = class45.method455(var14.field1177[var19] - 1);
                                            if (this.field364 == 1 && var14.field1230) {
                                                if (this.field366 != var14.field1175 || this.field365 != var19) {
                                                    this.field126[this.field449] = "Use " + this.field368 + " with @lre@" + var24.field1248;
                                                    this.field197[this.field449] = 730;
                                                    this.field198[this.field449] = var24.field1265;
                                                    this.field195[this.field449] = var19;
                                                    this.field196[this.field449] = var14.field1175;
                                                    ++this.field449;
                                                }
                                            } else if (this.field440 == 1 && var14.field1230) {
                                                if ((this.field442 & 16) == 16) {
                                                    this.field126[this.field449] = this.field443 + " @lre@" + var24.field1248;
                                                    this.field197[this.field449] = 153;
                                                    this.field198[this.field449] = var24.field1265;
                                                    this.field195[this.field449] = var19;
                                                    this.field196[this.field449] = var14.field1175;
                                                    ++this.field449;
                                                }
                                            } else {
                                                if (var14.field1230) {
                                                    for (int var25 = 4; var25 >= 3; --var25) {
                                                        if (var24.field1274 != null && var24.field1274[var25] != null) {
                                                            this.field126[this.field449] = var24.field1274[var25] + " @lre@" + var24.field1248;
                                                            if (var25 == 3) {
                                                                this.field197[this.field449] = 19;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field197[this.field449] = 936;
                                                            }
                                                            this.field198[this.field449] = var24.field1265;
                                                            this.field195[this.field449] = var19;
                                                            this.field196[this.field449] = var14.field1175;
                                                            ++this.field449;
                                                        } else if (var25 == 4) {
                                                            this.field126[this.field449] = "Drop @lre@" + var24.field1248;
                                                            this.field197[this.field449] = 936;
                                                            this.field198[this.field449] = var24.field1265;
                                                            this.field195[this.field449] = var19;
                                                            this.field196[this.field449] = var14.field1175;
                                                            ++this.field449;
                                                        }
                                                    }
                                                }
                                                if (var14.field1178) {
                                                    this.field126[this.field449] = "Use @lre@" + var24.field1248;
                                                    this.field197[this.field449] = 638;
                                                    this.field198[this.field449] = var24.field1265;
                                                    this.field195[this.field449] = var19;
                                                    this.field196[this.field449] = var14.field1175;
                                                    ++this.field449;
                                                }
                                                if (var14.field1230 && var24.field1274 != null) {
                                                    for (int var26 = 2; var26 >= 0; --var26) {
                                                        if (var24.field1274[var26] != null) {
                                                            this.field126[this.field449] = var24.field1274[var26] + " @lre@" + var24.field1248;
                                                            if (var26 == 0) {
                                                                this.field197[this.field449] = 414;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field197[this.field449] = 424;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field197[this.field449] = 38;
                                                            }
                                                            this.field198[this.field449] = var24.field1265;
                                                            this.field195[this.field449] = var19;
                                                            this.field196[this.field449] = var14.field1175;
                                                            ++this.field449;
                                                        }
                                                    }
                                                }
                                                if (var14.field1221 != null) {
                                                    for (int var27 = 4; var27 >= 0; --var27) {
                                                        if (var14.field1221[var27] != null) {
                                                            this.field126[this.field449] = var14.field1221[var27] + " @lre@" + var24.field1248;
                                                            if (var27 == 0) {
                                                                this.field197[this.field449] = 155;
                                                            }
                                                            if (var27 == 1) {
                                                                this.field197[this.field449] = 717;
                                                            }
                                                            if (var27 == 2) {
                                                                this.field197[this.field449] = 242;
                                                            }
                                                            if (var27 == 3) {
                                                                this.field197[this.field449] = 339;
                                                            }
                                                            if (var27 == 4) {
                                                                this.field197[this.field449] = 509;
                                                            }
                                                            this.field198[this.field449] = var24.field1265;
                                                            this.field195[this.field449] = var19;
                                                            this.field196[this.field449] = var14.field1175;
                                                            ++this.field449;
                                                        }
                                                    }
                                                }
                                                this.field126[this.field449] = "Examine @lre@" + var24.field1248;
                                                this.field197[this.field449] = 1455;
                                                this.field198[this.field449] = var24.field1265;
                                                this.field195[this.field449] = var19;
                                                this.field196[this.field449] = var14.field1175;
                                                ++this.field449;
                                            }
                                        }
                                    }
                                    ++var19;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method161(byte arg0) {
        Graphics var2 = this.method194(1).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method429((byte) -48, 1);
        if (arg0 != 30) {
            this.field127.method37(238);
        }
        if (this.field521) {
            this.field212 = false;
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
        if (this.field184) {
            this.field212 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field520) {
            this.field212 = false;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILQHGHUTGN;IIIII)V")
    public final void method162(int arg0, int arg1, int arg2, class43 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field372) {
            this.field251 = 32;
        } else {
            this.field251 = 0;
        }
        this.field372 = false;
        if (arg6 != 0) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (arg2 >= arg4 && arg2 < arg4 + 16 && arg0 >= arg8 && arg0 < arg8 + 16) {
            arg3.field1195 -= this.field339 * 4;
            if (arg1 == 1) {
                this.field192 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field267 = true;
            }
        } else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg0 >= arg7 + arg8 - 16 && arg0 < arg7 + arg8) {
            arg3.field1195 += this.field339 * 4;
            if (arg1 == 1) {
                this.field192 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field267 = true;
            }
        } else if (arg2 >= arg4 - this.field251 && arg2 < arg4 + 16 + this.field251 && arg0 >= arg8 + 16 && arg0 < arg7 + arg8 - 16 && this.field339 > 0) {
            int var11 = (arg7 - 32) * arg7 / arg5;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg0 - arg8 - 16 - var11 / 2;
            int var13 = arg7 - 32 - var11;
            arg3.field1195 = (arg5 - arg7) * var12 / var13;
            if (arg1 == 1) {
                this.field192 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field267 = true;
            }
            this.field372 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LBSNPYLEV;IZ)V")
    private final void method163(class7 arg0, int arg1, boolean arg2) {
        this.field330 = 0;
        this.field347 = 0;
        this.method261((byte) 7, arg1, arg0);
        if (!arg2) {
            this.field399 = -1;
        }
        this.method124(arg0, arg1, this.field279);
        this.method157(arg1, (byte) 117, arg0);
        for (int var4 = 0; var4 < this.field330; ++var4) {
            int var6 = this.field331[var4];
            if (field396 != this.field170[var6].field737) {
                this.field170[var6].field1508 = null;
                this.field170[var6] = null;
            }
        }
        if (arg0.field91 != arg1) {
            signlink.reporterror(this.field380 + " size mismatch in getnpcpos - pos:" + arg0.field91 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field171; ++var5) {
                if (this.field170[this.field172[var5]] == null) {
                    signlink.reporterror(this.field380 + " null entry in npc list - pos:" + var5 + " size:" + this.field171);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method164(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method164(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method165(boolean arg0) {
        if (this.field414 != 0) {
            class2 var2 = this.field300;
            if (arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            int var4 = 0;
            if (this.field586 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field478[var5] != null) {
                    int var6 = this.field476[var5];
                    String var7 = this.field477[var5];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field246 == 0 || this.field246 == 1 && this.method180(var7, (byte) 17))) {
                        int var9 = 329 - var4 * 13;
                        byte var10 = 4;
                        var2.method8(var10, "From", var9, 0, (byte) 27);
                        var2.method8(var10, "From", var9 - 1, 65535, (byte) 27);
                        int var11 = var10 + var2.method6(-754, "From ");
                        if (var8 == 1) {
                            this.field379[0].method350(var9 - 12, (byte) 0, var11);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field379[1].method350(var9 - 12, (byte) 0, var11);
                            var11 += 14;
                        }
                        var2.method8(var11, var7 + ": " + this.field478[var5], var9, 0, (byte) 27);
                        var2.method8(var11, var7 + ": " + this.field478[var5], var9 - 1, 65535, (byte) 27);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field246 < 2) {
                        int var12 = 329 - var4 * 13;
                        var2.method8(4, this.field478[var5], var12, 0, (byte) 27);
                        var2.method8(4, this.field478[var5], var12 - 1, 65535, (byte) 27);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field246 < 2) {
                        int var13 = 329 - var4 * 13;
                        var2.method8(4, "To " + var7 + ": " + this.field478[var5], var13, 0, (byte) 27);
                        var2.method8(4, "To " + var7 + ": " + this.field478[var5], var13 - 1, 65535, (byte) 27);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILQHGHUTGN;II)V")
    public final void method166(int arg0, int arg1, class43 arg2, int arg3, int arg4) {
        if (arg2.field1204 == 0 && arg2.field1167 != null) {
            if (!arg2.field1210 || this.field240 == arg2.field1175 || this.field415 == arg2.field1175 || this.field506 == arg2.field1175) {
                int var6 = class58.field1550;
                int var7 = class58.field1548;
                int var8 = class58.field1551;
                int var9 = class58.field1549;
                class58.method525(32409, arg0, arg4, arg2.field1206 + arg4, arg2.field1227 + arg0);
                int var10 = arg2.field1167.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg2.field1165[var11] + arg0;
                    int var13 = arg2.field1179[var11] + arg4 - arg1;
                    class43 var14 = class43.method445(arg2.field1167[var11]);
                    int var15 = var14.field1174 + var12;
                    int var16 = var14.field1171 + var13;
                    if (var14.field1193 > 0) {
                        this.method241(var14, false);
                    }
                    if (var14.field1204 == 0) {
                        if (var14.field1195 > var14.field1188 - var14.field1206) {
                            var14.field1195 = var14.field1188 - var14.field1206;
                        }
                        if (var14.field1195 < 0) {
                            var14.field1195 = 0;
                        }
                        this.method166(var15, var14.field1195, var14, 7, var16);
                        if (var14.field1188 > var14.field1206) {
                            this.method203(var16, var14.field1188, var14.field1195, var14.field1227 + var15, false, var14.field1206);
                        }
                    } else if (var14.field1204 != 1) {
                        if (var14.field1204 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1206; ++var18) {
                                for (int var19 = 0; var19 < var14.field1227; ++var19) {
                                    int var20 = (var14.field1162 + 32) * var19 + var15;
                                    int var21 = (var14.field1228 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1209[var17];
                                        var21 += var14.field1197[var17];
                                    }
                                    if (var14.field1177[var17] <= 0) {
                                        if (var14.field1176 != null && var17 < 20) {
                                            class5 var30 = var14.field1176[var17];
                                            if (var30 != null) {
                                                var30.method24(var21, (byte) 0, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1177[var17] - 1;
                                        if (var20 > class58.field1550 - 32 && var20 < class58.field1551 && var21 > class58.field1548 - 32 && var21 < class58.field1549 || this.field326 != 0 && this.field325 == var17) {
                                            int var25 = 0;
                                            if (this.field364 == 1 && this.field365 == var17 && this.field366 == var14.field1175) {
                                                var25 = 16777215;
                                            }
                                            class5 var26 = class45.method452(var14.field1229[var17], (byte) -8, var24, var25);
                                            if (var26 != null) {
                                                if (this.field326 != 0 && this.field325 == var17 && this.field324 == var14.field1175) {
                                                    var22 = super.field1137 - this.field327;
                                                    var23 = super.field1138 - this.field328;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field204 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method26(var21 + var23, 128, true, var20 + var22);
                                                    if (var21 + var23 < class58.field1548 && arg2.field1195 > 0) {
                                                        int var27 = (class58.field1548 - var21 - var23) * this.field220 / 3;
                                                        if (var27 > this.field220 * 10) {
                                                            var27 = this.field220 * 10;
                                                        }
                                                        if (var27 > arg2.field1195) {
                                                            var27 = arg2.field1195;
                                                        }
                                                        arg2.field1195 -= var27;
                                                        this.field328 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class58.field1549 && arg2.field1195 < arg2.field1188 - arg2.field1206) {
                                                        int var28 = (var21 + var23 + 32 - class58.field1549) * this.field220 / 3;
                                                        if (var28 > this.field220 * 10) {
                                                            var28 = this.field220 * 10;
                                                        }
                                                        if (var28 > arg2.field1188 - arg2.field1206 - arg2.field1195) {
                                                            var28 = arg2.field1188 - arg2.field1206 - arg2.field1195;
                                                        }
                                                        arg2.field1195 += var28;
                                                        this.field328 -= var28;
                                                    }
                                                } else if (this.field164 != 0 && this.field163 == var17 && this.field162 == var14.field1175) {
                                                    var26.method26(var21, 128, true, var20);
                                                } else {
                                                    var26.method24(var21, (byte) 0, var20);
                                                }
                                                if (var26.field61 == 33 || var14.field1229[var17] != 1) {
                                                    int var29 = var14.field1229[var17];
                                                    this.field299.method8(var20 + 1 + var22, method143(var29, 644), var21 + 10 + var23, 0, (byte) 27);
                                                    this.field299.method8(var20 + var22, method143(var29, 644), var21 + 9 + var23, 16776960, (byte) 27);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1204 == 3) {
                            boolean var31 = false;
                            if (this.field506 == var14.field1175 || this.field415 == var14.field1175 || this.field240 == var14.field1175) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method140(7, var14)) {
                                var32 = var14.field1224;
                                if (var31 && var14.field1222 != 0) {
                                    var32 = var14.field1222;
                                }
                            } else {
                                var32 = var14.field1237;
                                if (var31 && var14.field1212 != 0) {
                                    var32 = var14.field1212;
                                }
                            }
                            if (var14.field1223 == 0) {
                                if (var14.field1168) {
                                    class58.method528(this.field234, var14.field1227, var16, var15, var14.field1206, var32);
                                } else {
                                    class58.method529(var14.field1227, var14.field1206, 42741, var16, var32, var15);
                                }
                            } else if (var14.field1168) {
                                class58.method527(var14.field1206, (byte) 0, var14.field1227, var15, 256 - (var14.field1223 & 255), var16, var32);
                            } else {
                                class58.method530(var15, 17146, var16, 256 - (var14.field1223 & 255), var32, var14.field1227, var14.field1206);
                            }
                        } else if (var14.field1204 == 4) {
                            class2 var33 = var14.field1185;
                            String var34 = var14.field1183;
                            boolean var35 = false;
                            if (this.field506 == var14.field1175 || this.field415 == var14.field1175 || this.field240 == var14.field1175) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method140(7, var14)) {
                                var36 = var14.field1224;
                                if (var35 && var14.field1222 != 0) {
                                    var36 = var14.field1222;
                                }
                                if (var14.field1208.length() > 0) {
                                    var34 = var14.field1208;
                                }
                            } else {
                                var36 = var14.field1237;
                                if (var35 && var14.field1212 != 0) {
                                    var36 = var14.field1212;
                                }
                            }
                            if (var14.field1233 == 6 && this.field142) {
                                var34 = "Please wait...";
                                var36 = var14.field1237;
                            }
                            if (class58.field1546 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field31 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label381: while (true) {
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
                                                                            break label381;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method225(this.method234(4, var14, 0), -120) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method225(this.method234(3, var14, 0), -120) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method225(this.method234(2, var14, 0), -120) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method225(this.method234(1, var14, 0), -120) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method225(this.method234(0, var14, 0), -120) + var34.substring(var38 + 2);
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
                                if (var14.field1205) {
                                    var33.method5(false, var14.field1202, var44, var37, var36, var14.field1227 / 2 + var15);
                                } else {
                                    var33.method12(var15, var14.field1202, var37, var44, var36, 32048);
                                }
                                var37 += var33.field31;
                            }
                        } else if (var14.field1204 == 5) {
                            class5 var45;
                            if (this.method140(7, var14)) {
                                var45 = var14.field1196;
                            } else {
                                var45 = var14.field1199;
                            }
                            if (var45 != null) {
                                var45.method24(var16, (byte) 0, var15);
                            }
                        } else if (var14.field1204 == 6) {
                            int var46 = class27.field863;
                            int var47 = class27.field864;
                            class27.field863 = var14.field1227 / 2 + var15;
                            class27.field864 = var14.field1206 / 2 + var16;
                            int var48 = class27.field867[var14.field1235] * var14.field1234 >> 16;
                            int var49 = class27.field868[var14.field1235] * var14.field1234 >> 16;
                            boolean var50 = this.method140(7, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1192;
                            } else {
                                var51 = var14.field1191;
                            }
                            class47 var52;
                            if (var51 == -1) {
                                var52 = var14.method441(0, var50, -1, -1);
                            } else {
                                class29 var53 = class29.field887[var51];
                                var52 = var14.method441(0, var50, var53.field889[var14.field1203], var53.field890[var14.field1203]);
                            }
                            if (var52 != null) {
                                var52.method487(0, var14.field1236, 0, var14.field1235, 0, var48, var49);
                            }
                            class27.field863 = var46;
                            class27.field864 = var47;
                        } else {
                            if (var14.field1204 == 7) {
                                class2 var54 = var14.field1185;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1206; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1227; ++var57) {
                                        if (var14.field1177[var55] > 0) {
                                            class45 var58 = class45.method455(var14.field1177[var55] - 1);
                                            String var59 = String.valueOf(var58.field1248);
                                            if (var58.field1272 || var14.field1229[var55] != 1) {
                                                var59 = var59 + " x" + method243(var14.field1229[var55], (byte) 9);
                                            }
                                            int var60 = (var14.field1162 + 115) * var57 + var15;
                                            int var61 = (var14.field1228 + 12) * var56 + var16;
                                            if (var14.field1205) {
                                                var54.method5(false, var14.field1202, var59, var61, var14.field1237, var14.field1227 / 2 + var60);
                                            } else {
                                                var54.method12(var60, var14.field1202, var61, var59, var14.field1237, 32048);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1204 == 8 && (this.field512 == var14.field1175 || this.field431 == var14.field1175 || this.field585 == var14.field1175) && this.field254 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class2 var64 = this.field300;
                                String var65 = var14.field1183;
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
                                    int var74 = var64.method6(-754, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field31 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1227 + var15 - 5 - var62;
                                int var67 = var14.field1206 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg2.field1227 + arg0) {
                                    var66 = arg2.field1227 + arg0 - var62;
                                }
                                if (var63 + var67 > arg2.field1206 + arg4) {
                                    var67 = arg2.field1206 + arg4 - var63;
                                }
                                class58.method528(this.field234, var62, var67, var66, var63, 16777120);
                                class58.method529(var62, var63, 42741, var67, 0, var66);
                                String var68 = var14.field1183;
                                int var69 = var64.field31 + var67 + 2;
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
                                    var64.method12(var66 + 3, false, var69, var71, 0, 32048);
                                    var69 += var64.field31 + 1;
                                }
                            }
                        }
                    }
                }
                if (arg3 < 7 || arg3 > 7) {
                    this.field332 = -432;
                }
                class58.method525(32409, var6, var7, var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method167(byte arg0) {
        try {
            if (this.field416 != null) {
                this.field416.method368();
            }
        } catch (Exception var3) {
        }
        this.field416 = null;
        this.field322 = false;
        if (arg0 == -84) {
            this.field501 = 0;
            this.field380 = "";
            this.field381 = "";
            this.method252(-17985);
            this.field188.method375(23934);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field363[var2].method285();
            }
            System.gc();
            this.method144(this.field137);
            this.field235 = -1;
            this.field138 = -1;
            this.field534 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public final void method168(String arg0, String arg1, int arg2) {
        if (arg2 >= 0) {
            this.field350 = !this.field350;
        }
        if (this.field547 != null) {
            this.field547.method321(this.field499);
            class27.field869 = this.field249;
            int var4 = 151;
            if (arg1 != null) {
                var4 -= 7;
            }
            this.field300.method4(0, var4, arg0, (byte) 5, 257);
            this.field300.method4(16777215, var4 - 1, arg0, (byte) 5, 256);
            var4 += 15;
            if (arg1 != null) {
                this.field300.method4(0, var4, arg1, (byte) 5, 257);
                this.field300.method4(16777215, var4 - 1, arg1, (byte) 5, 256);
            }
            this.field547.method322(4, super.field1129, 4, (byte) -47);
        } else if (super.field1130 != null) {
            super.field1130.method321(this.field499);
            class27.field869 = this.field250;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class58.method528(this.field234, var6, var5 - 5 - var7 / 2, 383 - var6 / 2, var7, 0);
            class58.method529(var6, var7, 42741, var5 - 5 - var7 / 2, 16777215, 383 - var6 / 2);
            if (arg1 != null) {
                var5 -= 7;
            }
            this.field300.method4(0, var5, arg0, (byte) 5, 383);
            this.field300.method4(16777215, var5 - 1, arg0, (byte) 5, 382);
            var5 += 15;
            if (arg1 != null) {
                this.field300.method4(0, var5, arg1, (byte) 5, 383);
                this.field300.method4(16777215, var5 - 1, arg1, (byte) 5, 382);
            }
            super.field1130.method322(0, super.field1129, 0, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
    public final boolean method169(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        this.field398 += arg2;
        class43 var5 = class43.method445(arg1);
        for (int var6 = 0; var6 < var5.field1167.length && var5.field1167[var6] != -1; ++var6) {
            class43 var7 = class43.method445(var5.field1167[var6]);
            if (var7.field1204 == 0) {
                var4 |= this.method169(arg0, var7.field1175, 0);
            }
            if (var7.field1204 == 6 && (var7.field1191 != -1 || var7.field1192 != -1)) {
                boolean var8 = this.method140(7, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1192;
                } else {
                    var9 = var7.field1191;
                }
                if (var9 != -1) {
                    class29 var10 = class29.field887[var9];
                    var7.field1180 += arg0;
                    while (var7.field1180 > var10.method342(var7.field1203, this.field412)) {
                        var7.field1180 -= var10.method342(var7.field1203, this.field412);
                        ++var7.field1203;
                        if (var7.field1203 >= var10.field888) {
                            var7.field1203 -= var10.field892;
                            if (var7.field1203 < 0 || var7.field1203 >= var10.field888) {
                                var7.field1203 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1204 == 6 && var7.field1189 != 0) {
                int var11 = var7.field1189 >> 16;
                int var12 = var7.field1189 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field1235 = var7.field1235 + var13 & 2047;
                var7.field1236 = var7.field1236 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Z")
    public final boolean method170(int arg0, boolean arg1) {
        this.field322 &= arg1;
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field197[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 702;
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method171(int arg0) {
        if (this.field326 == 0) {
            this.field126[0] = "Cancel";
            this.field197[0] = 1122;
            this.field449 = 1;
            if (this.field455 != -1) {
                this.field393 = 0;
                this.field130 = 0;
                this.method160(super.field1138, 0, class43.method445(this.field455), 0, 0, (byte) -21, 0, super.field1137);
                if (this.field393 != this.field240) {
                    this.field240 = this.field393;
                }
                if (this.field585 != this.field130) {
                    this.field585 = this.field130;
                }
            } else {
                this.method228(31518);
                this.field393 = 0;
                if (arg0 <= 0) {
                    this.field399 = this.field474.method47();
                }
                this.field130 = 0;
                if (super.field1137 > 4 && super.field1138 > 4 && super.field1137 < 516 && super.field1138 < 338) {
                    if (this.field253 != -1) {
                        this.method160(super.field1138, 4, class43.method445(this.field253), 0, 4, (byte) -21, 0, super.field1137);
                    } else {
                        this.method198(true);
                    }
                }
                if (this.field393 != this.field240) {
                    this.field240 = this.field393;
                }
                if (this.field585 != this.field130) {
                    this.field585 = this.field130;
                }
                this.field393 = 0;
                this.field130 = 0;
                if (super.field1137 > 553 && super.field1138 > 205 && super.field1137 < 743 && super.field1138 < 466) {
                    if (this.field409 != -1) {
                        this.method160(super.field1138, 205, class43.method445(this.field409), 0, 553, (byte) -21, 1, super.field1137);
                    } else if (this.field432[this.field580] != -1) {
                        this.method160(super.field1138, 205, class43.method445(this.field432[this.field580]), 0, 553, (byte) -21, 1, super.field1137);
                    }
                }
                if (this.field415 != this.field393) {
                    this.field192 = true;
                    this.field415 = this.field393;
                }
                if (this.field431 != this.field130) {
                    this.field192 = true;
                    this.field431 = this.field130;
                }
                this.field393 = 0;
                this.field130 = 0;
                if (super.field1137 > 17 && super.field1138 > 357 && super.field1137 < 496 && super.field1138 < 453) {
                    if (this.field183 != -1) {
                        this.method160(super.field1138, 357, class43.method445(this.field183), 0, 17, (byte) -21, 2, super.field1137);
                    } else if (this.field313 != -1) {
                        this.method160(super.field1138, 357, class43.method445(this.field313), 0, 17, (byte) -21, 3, super.field1137);
                    } else if (super.field1138 < 434 && super.field1137 < 426 && this.field281 == 0) {
                        this.method256(super.field1137 - 17, super.field1138 - 357, false);
                    }
                }
                if ((this.field183 != -1 || this.field313 != -1) && this.field506 != this.field393) {
                    this.field267 = true;
                    this.field506 = this.field393;
                }
                if ((this.field183 != -1 || this.field313 != -1) && this.field512 != this.field130) {
                    this.field267 = true;
                    this.field512 = this.field130;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field449 - 1; ++var3) {
                        if (this.field197[var3] < 1000 && this.field197[var3 + 1] > 1000) {
                            String var4 = this.field126[var3];
                            this.field126[var3] = this.field126[var3 + 1];
                            this.field126[var3 + 1] = var4;
                            int var5 = this.field197[var3];
                            this.field197[var3] = this.field197[var3 + 1];
                            this.field197[var3 + 1] = var5;
                            int var6 = this.field195[var3];
                            this.field195[var3] = this.field195[var3 + 1];
                            this.field195[var3 + 1] = var6;
                            int var7 = this.field196[var3];
                            this.field196[var3] = this.field196[var3 + 1];
                            this.field196[var3 + 1] = var7;
                            int var8 = this.field198[var3];
                            this.field198[var3] = this.field198[var3 + 1];
                            this.field198[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method172(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field399 = -1;
        }
        int var3 = class1.field5[arg0].field13;
        if (var3 != 0) {
            int var4 = this.field205[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class27.method333(0.9D, -43048);
                }
                if (var4 == 2) {
                    class27.method333(0.8D, -43048);
                }
                if (var4 == 3) {
                    class27.method333(0.7D, -43048);
                }
                if (var4 == 4) {
                    class27.method333(0.6D, -43048);
                }
                class45.field1277.method34();
                this.field133 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field278;
                if (var4 == 0) {
                    this.method238(0, 0, this.field278);
                    this.field278 = true;
                }
                if (var4 == 1) {
                    this.method238(0, -400, this.field278);
                    this.field278 = true;
                }
                if (var4 == 2) {
                    this.method238(0, -800, this.field278);
                    this.field278 = true;
                }
                if (var4 == 3) {
                    this.method238(0, -1200, this.field278);
                    this.field278 = true;
                }
                if (var4 == 4) {
                    this.field278 = false;
                }
                if (this.field278 != var5 && !field609) {
                    if (this.field278) {
                        this.field138 = this.field235;
                        this.field139 = true;
                        this.field505.method556(2, this.field138);
                    } else {
                        this.method144(this.field137);
                    }
                    this.field534 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field315 = true;
                    this.method199(28913, 0);
                }
                if (var4 == 1) {
                    this.field315 = true;
                    this.method199(28913, -400);
                }
                if (var4 == 2) {
                    this.field315 = true;
                    this.method199(28913, -800);
                }
                if (var4 == 3) {
                    this.field315 = true;
                    this.method199(28913, -1200);
                }
                if (var4 == 4) {
                    this.field315 = false;
                }
            }
            if (var3 == 5) {
                this.field173 = var4;
            }
            if (var3 == 6) {
                this.field232 = var4;
            }
            if (var3 == 8) {
                this.field414 = var4;
                this.field267 = true;
            }
            if (var3 == 9) {
                this.field557 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field131) {
            this.method142(false);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LBSNPYLEV;BI)V")
    public final void method173(class7 arg0, byte arg1, int arg2) {
        if (arg1 == 6) {
            boolean var4 = false;
        } else {
            arg2 = arg0.method47();
        }
        if (arg2 == 25) {
            int var5 = arg0.method66(2);
            int var6 = (var5 >> 4 & 7) + this.field552;
            int var7 = (var5 & 7) + this.field553;
            byte var8 = arg0.method69(37923);
            int var9 = arg0.method74((byte) -99);
            int var10 = arg0.method75(true);
            int var11 = arg0.method67(-48149);
            int var12 = var11 >> 2;
            int var13 = var11 & 3;
            int var14 = this.field144[var12];
            byte var15 = arg0.method68((byte) -77);
            byte var16 = arg0.method68((byte) -77);
            int var17 = arg0.method73(6);
            byte var18 = arg0.method68((byte) -77);
            int var19 = arg0.method49();
            class32 var20;
            if (this.field318 == var19) {
                var20 = field452;
            } else {
                var20 = this.field344[var19];
            }
            if (var20 != null) {
                class48 var21 = class48.method494(var17);
                int var22 = this.field604[this.field213][var6][var7];
                int var23 = this.field604[this.field213][var6 + 1][var7];
                int var24 = this.field604[this.field213][var6 + 1][var7 + 1];
                int var25 = this.field604[this.field213][var6][var7 + 1];
                class47 var26 = var21.method492(var12, var13, var22, var23, var24, var25, -1);
                if (var26 != null) {
                    this.method270(0, var14, -1, this.field213, var7, var9 + 1, var10 + 1, var6, 0, 0);
                    var20.field946 = field396 + var9;
                    var20.field947 = field396 + var10;
                    var20.field951 = var26;
                    int var27 = var21.field1429;
                    int var28 = var21.field1443;
                    if (var13 == 1 || var13 == 3) {
                        var27 = var21.field1443;
                        var28 = var21.field1429;
                    }
                    var20.field948 = var6 * 128 + var27 * 64;
                    var20.field950 = var7 * 128 + var28 * 64;
                    var20.field949 = this.method159(var20.field950, -70, this.field213, var20.field948);
                    if (var18 > var16) {
                        byte var29 = var18;
                        var18 = var16;
                        var16 = var29;
                    }
                    if (var8 > var15) {
                        byte var30 = var8;
                        var8 = var15;
                        var15 = var30;
                    }
                    var20.field939 = var6 + var18;
                    var20.field941 = var6 + var16;
                    var20.field940 = var7 + var8;
                    var20.field942 = var7 + var15;
                }
            }
        }
        if (arg2 == 174) {
            int var31 = arg0.method66(2);
            int var32 = (var31 >> 4 & 7) + this.field552;
            int var33 = (var31 & 7) + this.field553;
            int var34 = arg0.method74((byte) -99);
            int var35 = arg0.method75(true);
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                class30 var36 = new class30();
                var36.field906 = var35;
                var36.field904 = var34;
                if (this.field136[this.field213][var32][var33] == null) {
                    this.field136[this.field213][var32][var33] = new class15(true);
                }
                this.field136[this.field213][var32][var33].method297(var36);
                this.method135(var32, var33);
            }
        } else if (arg2 == 152) {
            int var37 = arg0.method47();
            int var38 = (var37 >> 4 & 7) + this.field552;
            int var39 = (var37 & 7) + this.field553;
            int var40 = arg0.method49();
            int var41 = arg0.method49();
            int var42 = arg0.method49();
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                class15 var43 = this.field136[this.field213][var38][var39];
                if (var43 != null) {
                    for (class30 var44 = (class30) var43.method300(); var44 != null; var44 = (class30) var43.method302(true)) {
                        if ((var40 & 32767) == var44.field906 && var44.field904 == var41) {
                            var44.field904 = var42;
                            break;
                        }
                    }
                    this.method135(var38, var39);
                }
            }
        } else {
            if (arg2 == 183) {
                int var45 = arg0.method47();
                int var46 = (var45 >> 4 & 7) + this.field552;
                int var47 = (var45 & 7) + this.field553;
                int var48 = arg0.method49();
                int var49 = arg0.method47();
                int var50 = var49 >> 4 & 15;
                int var51 = var49 & 7;
                if (field452.field703[0] >= var46 - var50 && field452.field703[0] <= var46 + var50 && field452.field704[0] >= var47 - var50 && field452.field704[0] <= var47 + var50 && this.field315 && !field609 && this.field329 < 50) {
                    this.field351[this.field329] = var48;
                    this.field496[this.field329] = var51;
                    this.field255[this.field329] = class10.field643[var48];
                    ++this.field329;
                }
            }
            if (arg2 == 128) {
                int var52 = arg0.method66(2);
                int var53 = var52 >> 2;
                int var54 = var52 & 3;
                int var55 = this.field144[var53];
                int var56 = arg0.method47();
                int var57 = (var56 >> 4 & 7) + this.field552;
                int var58 = (var56 & 7) + this.field553;
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    this.method270(var54, var55, -1, this.field213, var58, 0, -1, var57, 0, var53);
                }
            } else if (arg2 == 143) {
                int var59 = arg0.method47();
                int var60 = (var59 >> 4 & 7) + this.field552;
                int var61 = (var59 & 7) + this.field553;
                int var62 = arg0.method49();
                int var63 = arg0.method47();
                int var64 = arg0.method49();
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    int var65 = var60 * 128 + 64;
                    int var66 = var61 * 128 + 64;
                    class49 var67 = new class49(field396, var65, var64, var66, this.method159(var66, -70, this.field213, var65) - var63, this.field213, -542, var62);
                    this.field222.method297(var67);
                }
            } else if (arg2 == 168) {
                int var68 = arg0.method75(true);
                int var69 = arg0.method47();
                int var70 = var69 >> 2;
                int var71 = var69 & 3;
                int var72 = this.field144[var70];
                int var73 = arg0.method47();
                int var74 = (var73 >> 4 & 7) + this.field552;
                int var75 = (var73 & 7) + this.field553;
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                    this.method270(var71, var72, var68, this.field213, var75, 0, -1, var74, 0, var70);
                }
            } else if (arg2 != 201) {
                if (arg2 == 1) {
                    int var82 = arg0.method66(2);
                    int var83 = (var82 >> 4 & 7) + this.field552;
                    int var84 = (var82 & 7) + this.field553;
                    int var85 = arg0.method74((byte) -99);
                    int var86 = arg0.method73(6);
                    int var87 = arg0.method74((byte) -99);
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && this.field318 != var87) {
                        class30 var88 = new class30();
                        var88.field906 = var85;
                        var88.field904 = var86;
                        if (this.field136[this.field213][var83][var84] == null) {
                            this.field136[this.field213][var83][var84] = new class15(true);
                        }
                        this.field136[this.field213][var83][var84].method297(var88);
                        this.method135(var83, var84);
                    }
                } else if (arg2 == 39) {
                    int var89 = arg0.method67(-48149);
                    int var90 = var89 >> 2;
                    int var91 = var89 & 3;
                    int var92 = this.field144[var90];
                    int var93 = arg0.method73(6);
                    int var94 = arg0.method66(2);
                    int var95 = (var94 >> 4 & 7) + this.field552;
                    int var96 = (var94 & 7) + this.field553;
                    if (var95 >= 0 && var96 >= 0 && var95 < 103 && var96 < 103) {
                        int var97 = this.field604[this.field213][var95][var96];
                        int var98 = this.field604[this.field213][var95 + 1][var96];
                        int var99 = this.field604[this.field213][var95 + 1][var96 + 1];
                        int var100 = this.field604[this.field213][var95][var96 + 1];
                        if (var92 == 0) {
                            class66 var101 = this.field188.method397(var96, var95, this.field213, 8);
                            if (var101 != null) {
                                int var102 = var101.field1683 >> 14 & 32767;
                                if (var90 == 2) {
                                    var101.field1681 = new class50(var99, var91 + 4, var102, 2, var93, false, (byte) -21, var100, var98, var97);
                                    var101.field1682 = new class50(var99, var91 + 1 & 3, var102, 2, var93, false, (byte) -21, var100, var98, var97);
                                } else {
                                    var101.field1681 = new class50(var99, var91, var102, var90, var93, false, (byte) -21, var100, var98, var97);
                                }
                            }
                        }
                        if (var92 == 1) {
                            class34 var103 = this.field188.method398(7, var96, this.field213, var95);
                            if (var103 != null) {
                                var103.field959 = new class50(var99, 0, var103.field960 >> 14 & 32767, 4, var93, false, (byte) -21, var100, var98, var97);
                            }
                        }
                        if (var92 == 2) {
                            class21 var104 = this.field188.method399(var95, var96, false, this.field213);
                            if (var90 == 11) {
                                var90 = 10;
                            }
                            if (var104 != null) {
                                var104.field773 = new class50(var99, var91, var104.field781 >> 14 & 32767, var90, var93, false, (byte) -21, var100, var98, var97);
                            }
                        }
                        if (var92 == 3) {
                            class19 var105 = this.field188.method400(var96, var95, this.field213, -820);
                            if (var105 != null) {
                                var105.field751 = new class50(var99, var91, var105.field752 >> 14 & 32767, 22, var93, false, (byte) -21, var100, var98, var97);
                            }
                        }
                    }
                } else if (arg2 == 99) {
                    int var106 = arg0.method47();
                    int var107 = (var106 >> 4 & 7) + this.field552;
                    int var108 = (var106 & 7) + this.field553;
                    int var109 = var107 + arg0.method48();
                    int var110 = var108 + arg0.method48();
                    int var111 = arg0.method50();
                    int var112 = arg0.method49();
                    int var113 = arg0.method47() * 4;
                    int var114 = arg0.method47() * 4;
                    int var115 = arg0.method49();
                    int var116 = arg0.method49();
                    int var117 = arg0.method47();
                    int var118 = arg0.method47();
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104 && var112 != 65535) {
                        int var119 = var107 * 128 + 64;
                        int var120 = var108 * 128 + 64;
                        int var121 = var109 * 128 + 64;
                        int var122 = var110 * 128 + 64;
                        class46 var123 = new class46(field396 + var115, var112, var117, var118, this.field213, var119, var114, this.method159(var120, -70, this.field213, var119) - var113, field396 + var116, var111, this.field294, var120);
                        var123.method460(this.method159(var122, -70, this.field213, var121) - var114, var121, var122, field396 + var115, (byte) 48);
                        this.field597.method297(var123);
                    }
                }
            } else {
                int var76 = arg0.method75(true);
                int var77 = arg0.method66(2);
                int var78 = (var77 >> 4 & 7) + this.field552;
                int var79 = (var77 & 7) + this.field553;
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    class15 var80 = this.field136[this.field213][var78][var79];
                    if (var80 != null) {
                        for (class30 var81 = (class30) var80.method300(); var81 != null; var81 = (class30) var80.method302(true)) {
                            if ((var76 & 32767) == var81.field906) {
                                var81.method518();
                                break;
                            }
                        }
                        if (var80.method300() == null) {
                            this.field136[this.field213][var78][var79] = null;
                        }
                        this.method135(var78, var79);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method174(byte arg0) {
        this.field127.method36(true, 224);
        if (arg0 != 4) {
            this.method128();
        }
        if (this.field409 != -1) {
            this.method152(this.field409, (byte) 62);
            this.field409 = -1;
            this.field192 = true;
            this.field142 = false;
            this.field280 = true;
        }
        if (this.field183 != -1) {
            this.method152(this.field183, (byte) 62);
            this.field183 = -1;
            this.field267 = true;
            this.field142 = false;
        }
        if (this.field455 != -1) {
            this.method152(this.field455, (byte) 62);
            this.field455 = -1;
            this.field133 = true;
        }
        if (this.field446 != -1) {
            this.method152(this.field446, (byte) 62);
            this.field446 = -1;
        }
        if (this.field253 != -1) {
            this.method152(this.field253, (byte) 62);
            this.field253 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILBSNPYLEV;)V")
    private final void method175(boolean arg0, int arg1, class7 arg2) {
        arg2.method57(-322);
        int var4 = arg2.method58(1, 588);
        if (arg0) {
            this.field399 = -1;
        }
        if (var4 != 0) {
            int var5 = arg2.method58(2, 588);
            if (var5 == 0) {
                this.field348[this.field347++] = this.field343;
            } else if (var5 == 1) {
                int var6 = arg2.method58(3, 588);
                field452.method305(4, false, var6);
                int var7 = arg2.method58(1, 588);
                if (var7 == 1) {
                    this.field348[this.field347++] = this.field343;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method58(3, 588);
                field452.method305(4, true, var8);
                int var9 = arg2.method58(3, 588);
                field452.method305(4, true, var9);
                int var10 = arg2.method58(1, 588);
                if (var10 == 1) {
                    this.field348[this.field347++] = this.field343;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method58(7, 588);
                this.field213 = arg2.method58(2, 588);
                int var12 = arg2.method58(1, 588);
                int var13 = arg2.method58(7, 588);
                int var14 = arg2.method58(1, 588);
                if (var14 == 1) {
                    this.field348[this.field347++] = this.field343;
                }
                field452.method309(593, var13, var11, var12 == 1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method176(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method177(byte arg0) {
        if (super.field1130 == null) {
            this.method240(true);
            this.field145 = null;
            this.field146 = null;
            this.field147 = null;
            this.field148 = null;
            if (arg0 == 90) {
                this.field149 = null;
                this.field150 = null;
                this.field151 = null;
                this.field152 = null;
                this.field153 = null;
                this.field548 = null;
                this.field546 = null;
                this.field545 = null;
                this.field547 = null;
                this.field259 = null;
                this.field260 = null;
                this.field261 = null;
                super.field1130 = new class26(765, 503, this.method194(1), field568);
                this.field133 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method178(int arg0) {
        this.method165(false);
        if (this.field426 == 1) {
            this.field559[this.field425 / 100].method24(this.field424 - 8 - 4, (byte) 0, this.field423 - 8 - 4);
        }
        if (this.field426 == 2) {
            this.field559[this.field425 / 100 + 4].method24(this.field424 - 8 - 4, (byte) 0, this.field423 - 8 - 4);
        }
        if (this.field181 != -1) {
            this.method169(this.field220, this.field181, 0);
            this.method166(0, 0, class43.method445(this.field181), 7, 0);
        }
        if (this.field253 != -1) {
            this.method169(this.field220, this.field253, 0);
            this.method166(0, 0, class43.method445(this.field253), 7, 0);
        }
        this.method210(false);
        if (arg0 >= 0) {
            this.field127.method37(45);
        }
        if (!this.field456) {
            this.method171(616);
            this.method190((byte) 0);
        } else if (this.field529 == 0) {
            this.method239(120);
        }
        if (this.field382 == 1) {
            this.field129.method24(296, (byte) 0, 472);
        }
        if (field334) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1125 < 30 && field609) {
                var4 = 16711680;
            }
            if (super.field1125 < 20 && !field609) {
                var4 = 16711680;
            }
            this.field300.method3(var2, "Fps:" + super.field1125, var4, (byte) -83, var3);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field609) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field609) {
                int var9 = 16711680;
            }
            this.field300.method3(var2, "Mem:" + var6 + "k", 16776960, (byte) -83, var13);
            var13 += 15;
        }
        if (this.field586 != 0) {
            int var10 = this.field586 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field300.method8(4, "System update in: " + var11 + ":0" + var12, 329, 16776960, (byte) 27);
            } else {
                this.field300.method8(4, "System update in: " + var11 + ":" + var12, 329, 16776960, (byte) 27);
            }
            ++field492;
            if (field492 > 68) {
                field492 = 0;
                this.field127.method36(true, 179);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILQHGHUTGN;)Z")
    public final boolean method179(int arg0, class43 arg1) {
        if (arg0 < 5 || arg0 > 5) {
            this.field399 = this.field474.method47();
        }
        int var3 = arg1.field1193;
        if (this.field472 == 2) {
            if (var3 == 201) {
                this.field267 = true;
                this.field281 = 0;
                this.field219 = true;
                this.field567 = "";
                this.field252 = 1;
                this.field522 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field267 = true;
                this.field281 = 0;
                this.field219 = true;
                this.field567 = "";
                this.field252 = 2;
                this.field522 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field402 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field267 = true;
                this.field281 = 0;
                this.field219 = true;
                this.field567 = "";
                this.field252 = 4;
                this.field522 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field267 = true;
                this.field281 = 0;
                this.field219 = true;
                this.field567 = "";
                this.field252 = 5;
                this.field522 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field140[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class18.field740 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class18.field740) {
                                var6 = 0;
                            }
                        }
                        if (!class18.field741[var6].field747 && class18.field741[var6].field742 == var4 + (this.field373 ? 0 : 7)) {
                            this.field140[var4] = var6;
                            this.field244 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field582[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field413[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field413[var7].length) {
                        var9 = 0;
                    }
                }
                this.field582[var7] = var9;
                this.field244 = true;
            }
            if (var3 == 324 && !this.field373) {
                this.field373 = true;
                this.method223(false);
            }
            if (var3 == 325 && this.field373) {
                this.field373 = false;
                this.method223(false);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field200 = !this.field200;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method174((byte) 4);
                    if (this.field187.length() > 0) {
                        this.field127.method36(true, 32);
                        this.field127.method43(class51.method505(this.field187), 3);
                        this.field127.method37(var3 - 601);
                        this.field127.method37(this.field200 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field127.method36(true, 66);
                this.field127.method37(this.field373 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field127.method37(this.field140[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field127.method37(this.field582[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method180(String arg0, byte arg1) {
        if (arg1 != 17) {
            this.field399 = -1;
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field471; ++var3) {
                if (arg0.equalsIgnoreCase(this.field453[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field452.field924);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method181(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field519 >= 100) {
                this.method267("", false, "Your ignore list is full. Max of 100 hit", 0);
            } else {
                String var4 = class51.method509(class51.method506(false, arg0), true);
                if (arg1 != 0) {
                    this.field399 = -1;
                }
                for (int var5 = 0; var5 < this.field519; ++var5) {
                    if (this.field298[var5] == arg0) {
                        this.method267("", false, var4 + " is already on your ignore list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field471; ++var6) {
                    if (this.field297[var6] == arg0) {
                        this.method267("", false, "Please remove " + var4 + " from your friend list first", 0);
                        return;
                    }
                }
                this.field298[this.field519++] = arg0;
                this.field192 = true;
                this.field127.method36(true, 166);
                this.field127.method43(arg0, 3);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method182(int arg0) {
        while (arg0 >= 0) {
            this.field136 = null;
        }
        this.field133 = true;
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method183(int arg0) {
        try {
            this.field397 = -1;
            this.field222.method304();
            this.field597.method304();
            class27.method327(3117);
            this.method252(-17985);
            this.field188.method375(23934);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field363[var2].method285();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field549[var3][var4][var5] = 0;
                    }
                }
            }
            class64 var6 = new class64(104, this.field549, (byte) 1, 104, this.field604);
            int var7 = this.field182.length;
            this.field127.method36(true, 11);
            if (!this.field551) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field419[var8] >> 8) * 64 - this.field354;
                    int var10 = (this.field419[var8] & 255) * 64 - this.field355;
                    byte[] var11 = this.field182[var8];
                    if (var11 != null) {
                        var6.method573((this.field450 - 6) * 8, -48086, this.field363, (this.field451 - 6) * 8, var11, var9, var10);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field419[var12] >> 8) * 64 - this.field354;
                    int var14 = (this.field419[var12] & 255) * 64 - this.field355;
                    byte[] var15 = this.field182[var12];
                    if (var15 == null && this.field451 < 800) {
                        var6.method577(64, var13, var14, 64, -464);
                    }
                }
                this.field127.method36(true, 11);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field467[var16];
                    if (var17 != null) {
                        int var18 = (this.field419[var16] >> 8) * 64 - this.field354;
                        int var19 = (this.field419[var16] & 255) * 64 - this.field355;
                        var6.method567(true, var17, this.field363, this.field188, var18, var19);
                    }
                }
            }
            if (this.field551) {
                int var20 = 0;
                label256: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field448[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method577(8, var31 * 8, var32 * 8, 8, -464);
                                }
                            }
                        }
                        this.field127.method36(true, 11);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label256;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field448[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field419.length; ++var43) {
                                            if (this.field419[var43] == var42 && this.field467[var43] != null) {
                                                var6.method568(var34, (byte) -103, (var41 & 7) * 8, this.field363, var38, var35 * 8, (var40 & 7) * 8, this.field467[var43], var39, var36 * 8, this.field188);
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
                            int var24 = this.field448[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field419.length; ++var30) {
                                    if (this.field419[var30] == var29 && this.field182[var30] != null) {
                                        var6.method566(this.field363, (var28 & 7) * 8, var25, var21 * 8, var22 * 8, this.field182[var30], var20, 7, (var27 & 7) * 8, var26);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method576(var21 * 8, var22 * 8, (byte) -96, var20);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field127.method36(true, 11);
            var6.method564(this.field188, true, this.field363);
            if (this.field547 != null) {
                this.field547.method321(this.field499);
                class27.field869 = this.field249;
            }
            this.field127.method36(true, 11);
            int var44 = class64.field1664;
            if (var44 > this.field213) {
                var44 = this.field213;
            }
            if (var44 < this.field213 - 1) {
                int var45 = this.field213 - 1;
            }
            if (field609) {
                this.field188.method376(this.field463, class64.field1664);
            } else {
                this.field188.method376(this.field463, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method135(var46, var47);
                }
            }
            this.method260(this.field459);
        } catch (Exception var60) {
        }
        class48.field1405.method34();
        if (super.field1132 != null) {
            this.field127.method36(true, 146);
            this.field127.method41(1057001181);
        }
        if (field609 && signlink.cache_dat != null) {
            int var49 = this.field505.method544(0, 2);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field505.method539(var50, -90);
                if ((var51 & 121) == 0) {
                    class47.method465(var50, 2);
                }
            }
        }
        System.gc();
        class27.method328(20, (byte) 94);
        this.field505.method554(this.field569);
        int var52 = (this.field450 - 6) / 8 - 1;
        int var53 = (this.field450 + 6) / 8 + 1;
        if (arg0 >= 0) {
            this.field293 = this.field309.method587();
        }
        int var54 = (this.field451 - 6) / 8 - 1;
        int var55 = (this.field451 + 6) / 8 + 1;
        if (this.field233) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field505.method541(0, false, var56, var57);
                    if (var58 != -1) {
                        this.field505.method549(3, var58, (byte) -23);
                    }
                    int var59 = this.field505.method541(1, false, var56, var57);
                    if (var59 != -1) {
                        this.field505.method549(3, var59, (byte) -23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLFSZDVUBI;)V")
    public final void method184(int arg0, boolean arg1, class17 arg2) {
        if (arg1) {
            this.method185(arg0, arg2.field706, 2, arg2.field707);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(IIII)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg3 >= 128 && arg1 <= 13056 && arg3 <= 13056) {
            int var5 = this.method159(arg3, -70, this.field213, arg1) - arg0;
            int var6 = arg1 - this.field284;
            int var7 = var5 - this.field285;
            int var8 = arg3 - this.field286;
            int var9 = class47.field1399[this.field287];
            int var10 = class47.field1400[this.field287];
            int var11 = class47.field1399[this.field288];
            int var12 = class47.field1400[this.field288];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            if (arg2 != 2) {
                this.field136 = null;
            }
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field335 = (var13 << 9) / var17 + class27.field863;
                this.field336 = (var16 << 9) / var17 + class27.field864;
            } else {
                this.field335 = -1;
                this.field336 = -1;
            }
        } else {
            this.field335 = -1;
            this.field336 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method186(boolean arg0) {
        this.field259 = null;
        this.field260 = null;
        this.field261 = null;
        this.field550 = null;
        this.field150 = null;
        this.field151 = null;
        this.field152 = null;
        this.field153 = null;
        this.field574 = null;
        this.field575 = null;
        this.field576 = null;
        if (arg0) {
            this.field136 = null;
        }
        this.field577 = null;
        this.field578 = null;
        this.field169 = null;
        this.field229 = null;
        this.field230 = null;
        this.field231 = null;
        this.field545 = null;
        this.field546 = null;
        this.field547 = null;
        this.field548 = null;
        this.field562 = null;
        this.field563 = null;
        this.field564 = null;
        this.field565 = null;
        this.field566 = null;
        this.field591 = null;
        this.field592 = null;
        this.field593 = null;
        this.field594 = null;
        this.field595 = null;
        this.field375 = null;
        this.field376 = null;
        this.field323 = null;
        this.field485 = null;
        this.field206 = null;
        this.field205 = null;
        try {
            if (this.field416 != null) {
                this.field416.method368();
            }
        } catch (Exception var2) {
        }
        this.field416 = null;
        this.field129 = null;
        this.field321 = null;
        if (this.field572 != null) {
            this.field572.field840 = false;
        }
        this.field572 = null;
        this.field127 = null;
        this.field174 = null;
        this.field474 = null;
        this.field422 = null;
        if (this.field505 != null) {
            this.field505.method559();
        }
        this.field505 = null;
        this.field587 = null;
        this.field588 = null;
        this.field589 = null;
        this.field590 = null;
        this.field317 = null;
        this.field344 = null;
        this.field346 = null;
        this.field348 = null;
        this.field349 = null;
        this.field331 = null;
        this.field597 = null;
        this.field222 = null;
        this.method144(this.field137);
        this.field604 = null;
        this.field549 = null;
        this.field188 = null;
        this.field363 = null;
        this.field136 = null;
        this.field360 = null;
        this.field195 = null;
        this.field196 = null;
        this.field197 = null;
        this.field198 = null;
        this.field126 = null;
        this.field148 = null;
        this.field149 = null;
        this.field145 = null;
        this.field146 = null;
        this.field147 = null;
        this.field486 = null;
        this.field487 = null;
        this.field488 = null;
        this.field489 = null;
        this.field490 = null;
        this.field453 = null;
        this.field297 = null;
        this.field390 = null;
        this.field154 = null;
        this.field507 = null;
        this.field483 = null;
        this.field273 = null;
        this.field435 = null;
        this.field559 = null;
        this.field419 = null;
        this.field182 = null;
        this.field467 = null;
        this.field420 = null;
        this.field421 = null;
        this.field256 = null;
        this.field573 = null;
        this.field179 = null;
        this.field180 = null;
        this.field464 = null;
        this.field465 = null;
        this.field466 = null;
        this.field170 = null;
        this.field172 = null;
        this.method240(true);
        class48.method495(-308);
        class70.method595(-308);
        class45.method451(-308);
        class43.method436(-308);
        class60.field1562 = null;
        class18.field741 = null;
        class4.field39 = null;
        class29.field887 = null;
        class37.field991 = null;
        class37.field1003 = null;
        class1.field5 = null;
        super.field1130 = null;
        class32.field926 = null;
        class27.method324(-308);
        class39.method374(-308);
        class47.method462(-308);
        class67.method584(-308);
        System.gc();
        if (class56.field1535) {
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method187(int arg0) {
        if (arg0 != 3) {
            this.field503 = !this.field503;
        }
        for (class49 var2 = (class49) this.field222.method300(); var2 != null; var2 = (class49) this.field222.method302(true)) {
            if (this.field213 == var2.field1461 && !var2.field1457) {
                if (field396 >= var2.field1456) {
                    var2.method503(this.field220, 914);
                    if (var2.field1457) {
                        var2.method518();
                    } else {
                        this.field188.method386(var2, (byte) -123, var2.field1461, 0, false, -1, var2.field1464, 60, var2.field1463, var2.field1462);
                    }
                }
            } else {
                var2.method518();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method188(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method189(boolean arg0, int arg1) {
        this.field322 &= arg0;
        class43 var3 = class43.method445(arg1);
        for (int var4 = 0; var4 < var3.field1167.length && var3.field1167[var4] != -1; ++var4) {
            class43 var5 = class43.method445(var3.field1167[var4]);
            if (var5.field1204 == 1) {
                this.method189(true, var5.field1175);
            }
            var5.field1203 = 0;
            var5.field1180 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method190(byte arg0) {
        if (this.field449 >= 2 || this.field364 != 0 || this.field440 != 0) {
            String var2;
            if (this.field364 == 1 && this.field449 < 2) {
                var2 = "Use " + this.field368 + " with...";
            } else if (this.field440 == 1 && this.field449 < 2) {
                var2 = this.field443 + "...";
            } else {
                var2 = this.field126[this.field449 - 1];
            }
            if (this.field449 > 2) {
                var2 = var2 + "@whi@ / " + (this.field449 - 2) + " more options";
            }
            this.field301.method13(true, var2, 4, true, 16777215, field396 / 1000, 15);
            if (arg0 == 0) {
                boolean var3 = false;
            } else {
                this.field127.method37(216);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1132 != null) {
                    return new URL("http://127.0.0.1:" + (field607 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
    public final void method191(long arg0, int arg1) {
        this.field398 += arg1;
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field519; ++var4) {
                if (this.field298[var4] == arg0) {
                    --this.field519;
                    this.field192 = true;
                    for (int var5 = var4; var5 < this.field519; ++var5) {
                        this.field298[var5] = this.field298[var5 + 1];
                    }
                    this.field127.method36(true, 87);
                    this.field127.method43(arg0, 3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method192(int arg0) {
        if (arg0 == 0) {
            if (super.field1143 == 1) {
                if (super.field1144 >= 6 && super.field1144 <= 106 && super.field1145 >= 467 && super.field1145 <= 499) {
                    this.field584 = (this.field584 + 1) % 4;
                    this.field125 = true;
                    this.field267 = true;
                    this.field127.method36(true, 24);
                    this.field127.method37(this.field584);
                    this.field127.method37(this.field246);
                    this.field127.method37(this.field238);
                }
                if (super.field1144 >= 135 && super.field1144 <= 235 && super.field1145 >= 467 && super.field1145 <= 499) {
                    this.field246 = (this.field246 + 1) % 3;
                    this.field125 = true;
                    this.field267 = true;
                    this.field127.method36(true, 24);
                    this.field127.method37(this.field584);
                    this.field127.method37(this.field246);
                    this.field127.method37(this.field238);
                }
                if (super.field1144 >= 273 && super.field1144 <= 373 && super.field1145 >= 467 && super.field1145 <= 499) {
                    this.field238 = (this.field238 + 1) % 3;
                    this.field125 = true;
                    this.field267 = true;
                    this.field127.method36(true, 24);
                    this.field127.method37(this.field584);
                    this.field127.method37(this.field246);
                    this.field127.method37(this.field238);
                }
                if (super.field1144 >= 412 && super.field1144 <= 512 && super.field1145 >= 467 && super.field1145 <= 499) {
                    if (this.field253 == -1) {
                        this.method174((byte) 4);
                        this.field187 = "";
                        this.field200 = false;
                        this.field494 = this.field253 = class43.field1173;
                        return;
                    }
                    this.method267("", false, "Please close the interface you have open before using 'report abuse'", 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public void method193(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field410);
        if (this.field505 != null) {
            System.out.println("Od-cycle:" + this.field505.field1605);
        }
        System.out.println("loop-cycle:" + field396);
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        System.out.println("draw-cycle:" + field480);
        System.out.println("ptype:" + this.field399);
        System.out.println("psize:" + this.field398);
        if (this.field416 != null) {
            this.field416.method373(-955);
        }
        super.field1126 = true;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final Component method194(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field127.method37(173);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1132 != null ? super.field1132 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method195(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field145 == null) {
            super.field1130 = null;
            this.field548 = null;
            this.field546 = null;
            this.field545 = null;
            this.field547 = null;
            this.field259 = null;
            this.field260 = null;
            this.field261 = null;
            this.field148 = new class26(128, 265, this.method194(1), field568);
            class58.method526(30983);
            this.field149 = new class26(128, 265, this.method194(1), field568);
            class58.method526(30983);
            this.field145 = new class26(509, 171, this.method194(1), field568);
            class58.method526(30983);
            this.field146 = new class26(360, 132, this.method194(1), field568);
            class58.method526(30983);
            this.field147 = new class26(360, 200, this.method194(1), field568);
            class58.method526(30983);
            this.field150 = new class26(202, 238, this.method194(1), field568);
            class58.method526(30983);
            this.field151 = new class26(203, 238, this.method194(1), field568);
            class58.method526(30983);
            this.field152 = new class26(74, 94, this.method194(1), field568);
            class58.method526(30983);
            this.field153 = new class26(75, 94, this.method194(1), field568);
            class58.method526(30983);
            if (this.field558 != null) {
                this.method133((byte) 0);
                this.method129(2);
            }
            this.field133 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method196(int arg0) {
        int var2 = 5;
        this.field337[8] = 0;
        if (arg0 >= this.field242 && arg0 <= this.field242) {
            int var3 = 0;
            while (this.field337[8] == 0) {
                String var4 = "Unknown problem";
                this.method158((byte) 6, 20, "Connecting to web server");
                try {
                    DataInputStream var5 = this.method154("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 375);
                    class7 var6 = new class7(new byte[40], (byte) 3);
                    var5.readFully(var6.field90, 0, 40);
                    var5.close();
                    for (int var7 = 0; var7 < 9; ++var7) {
                        this.field337[var7] = var6.method52();
                    }
                    int var8 = var6.method52();
                    int var9 = 1234;
                    for (int var10 = 0; var10 < 9; ++var10) {
                        var9 = (var9 << 1) + this.field337[var10];
                    }
                    if (var8 != var9) {
                        var4 = "checksum problem";
                        this.field337[8] = 0;
                    }
                } catch (EOFException var13) {
                    var4 = "EOF problem";
                    this.field337[8] = 0;
                } catch (IOException var14) {
                    var4 = "connection problem";
                    this.field337[8] = 0;
                } catch (Exception var15) {
                    var4 = "logic problem";
                    this.field337[8] = 0;
                    if (!signlink.reporterror) {
                        return;
                    }
                }
                if (this.field337[8] == 0) {
                    ++var3;
                    for (int var11 = var2; var11 > 0; --var11) {
                        if (var3 >= 10) {
                            this.method158((byte) 6, 10, "Game updated - please reload page");
                            var11 = 10;
                        } else {
                            this.method158((byte) 6, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                    this.field209 = !this.field209;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method197(int arg0, int arg1, int arg2) {
        if (arg2 < 8 || arg2 > 8) {
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

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method198(boolean arg0) {
        this.field322 &= arg0;
        if (this.field364 == 0 && this.field440 == 0) {
            this.field126[this.field449] = "Walk here";
            this.field197[this.field449] = 46;
            this.field195[this.field449] = super.field1137;
            this.field196[this.field449] = super.field1138;
            ++this.field449;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class47.field1397; ++var3) {
            int var4 = class47.field1398[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field188.method405(this.field213, var5, var6, var4) >= 0) {
                    class48 var9 = class48.method494(var8);
                    if (var9.field1436 != null) {
                        var9 = var9.method493(this.field484);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field364 == 1) {
                        this.field126[this.field449] = "Use " + this.field368 + " with @cya@" + var9.field1419;
                        this.field197[this.field449] = 653;
                        this.field198[this.field449] = var4;
                        this.field195[this.field449] = var5;
                        this.field196[this.field449] = var6;
                        ++this.field449;
                    } else if (this.field440 == 1) {
                        if ((this.field442 & 4) == 4) {
                            this.field126[this.field449] = this.field443 + " @cya@" + var9.field1419;
                            this.field197[this.field449] = 546;
                            this.field198[this.field449] = var4;
                            this.field195[this.field449] = var5;
                            this.field196[this.field449] = var6;
                            ++this.field449;
                        }
                    } else {
                        if (var9.field1438 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1438[var10] != null) {
                                    this.field126[this.field449] = var9.field1438[var10] + " @cya@" + var9.field1419;
                                    if (var10 == 0) {
                                        this.field197[this.field449] = 51;
                                    }
                                    if (var10 == 1) {
                                        this.field197[this.field449] = 66;
                                    }
                                    if (var10 == 2) {
                                        this.field197[this.field449] = 824;
                                    }
                                    if (var10 == 3) {
                                        this.field197[this.field449] = 106;
                                    }
                                    if (var10 == 4) {
                                        this.field197[this.field449] = 1359;
                                    }
                                    this.field198[this.field449] = var4;
                                    this.field195[this.field449] = var5;
                                    this.field196[this.field449] = var6;
                                    ++this.field449;
                                }
                            }
                        }
                        this.field126[this.field449] = "Examine @cya@" + var9.field1419;
                        this.field197[this.field449] = 1456;
                        this.field198[this.field449] = var9.field1427 << 14;
                        this.field195[this.field449] = var5;
                        this.field196[this.field449] = var6;
                        ++this.field449;
                    }
                }
                if (var7 == 1) {
                    class53 var11 = this.field170[var8];
                    if (var11.field1508.field1718 == 1 && (var11.field706 & 127) == 64 && (var11.field707 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field171; ++var12) {
                            class53 var15 = this.field170[this.field172[var12]];
                            if (var15 != null && var11 != var15 && var15.field1508.field1718 == 1 && var11.field706 == var15.field706 && var11.field707 == var15.field707) {
                                this.method229(var6, this.field172[var12], var15.field1508, 311, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field345; ++var13) {
                            class32 var14 = this.field344[this.field346[var13]];
                            if (var14 != null && var11.field706 == var14.field706 && var11.field707 == var14.field707) {
                                this.method208(2, this.field346[var13], var6, var5, var14);
                            }
                        }
                    }
                    this.method229(var6, var8, var11.field1508, 311, var5);
                }
                if (var7 == 0) {
                    class32 var16 = this.field344[var8];
                    if ((var16.field706 & 127) == 64 && (var16.field707 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field171; ++var17) {
                            class53 var20 = this.field170[this.field172[var17]];
                            if (var20 != null && var20.field1508.field1718 == 1 && var16.field706 == var20.field706 && var16.field707 == var20.field707) {
                                this.method229(var6, this.field172[var17], var20.field1508, 311, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field345; ++var18) {
                            class32 var19 = this.field344[this.field346[var18]];
                            if (var19 != null && var16 != var19 && var16.field706 == var19.field706 && var16.field707 == var19.field707) {
                                this.method208(2, this.field346[var18], var6, var5, var19);
                            }
                        }
                    }
                    this.method208(2, var8, var6, var5, var16);
                }
                if (var7 == 3) {
                    class15 var21 = this.field136[this.field213][var5][var6];
                    if (var21 != null) {
                        for (class30 var22 = (class30) var21.method301(659); var22 != null; var22 = (class30) var21.method303(318)) {
                            class45 var23 = class45.method455(var22.field906);
                            if (this.field364 == 1) {
                                this.field126[this.field449] = "Use " + this.field368 + " with @lre@" + var23.field1248;
                                this.field197[this.field449] = 196;
                                this.field198[this.field449] = var22.field906;
                                this.field195[this.field449] = var5;
                                this.field196[this.field449] = var6;
                                ++this.field449;
                            } else if (this.field440 == 1) {
                                if ((this.field442 & 1) == 1) {
                                    this.field126[this.field449] = this.field443 + " @lre@" + var23.field1248;
                                    this.field197[this.field449] = 735;
                                    this.field198[this.field449] = var22.field906;
                                    this.field195[this.field449] = var5;
                                    this.field196[this.field449] = var6;
                                    ++this.field449;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1255 != null && var23.field1255[var24] != null) {
                                        this.field126[this.field449] = var23.field1255[var24] + " @lre@" + var23.field1248;
                                        if (var24 == 0) {
                                            this.field197[this.field449] = 864;
                                        }
                                        if (var24 == 1) {
                                            this.field197[this.field449] = 995;
                                        }
                                        if (var24 == 2) {
                                            this.field197[this.field449] = 941;
                                        }
                                        if (var24 == 3) {
                                            this.field197[this.field449] = 808;
                                        }
                                        if (var24 == 4) {
                                            this.field197[this.field449] = 656;
                                        }
                                        this.field198[this.field449] = var22.field906;
                                        this.field195[this.field449] = var5;
                                        this.field196[this.field449] = var6;
                                        ++this.field449;
                                    } else if (var24 == 2) {
                                        this.field126[this.field449] = "Take @lre@" + var23.field1248;
                                        this.field197[this.field449] = 941;
                                        this.field198[this.field449] = var22.field906;
                                        this.field195[this.field449] = var5;
                                        this.field196[this.field449] = var6;
                                        ++this.field449;
                                    }
                                }
                                this.field126[this.field449] = "Examine @lre@" + var23.field1248;
                                this.field197[this.field449] = 1686;
                                this.field198[this.field449] = var22.field906;
                                this.field195[this.field449] = var5;
                                this.field196[this.field449] = var6;
                                ++this.field449;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method199(int arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 != 28913) {
            this.field399 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZIIZII)Z")
    public final boolean method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        if (arg6) {
            this.field127.method37(202);
        }
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field256[var15][var39] = 0;
                this.field573[var15][var39] = 99999999;
            }
        }
        int var16 = arg8;
        int var17 = arg4;
        this.field256[arg8][arg4] = 99;
        this.field573[arg8][arg4] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field179[var18] = arg8;
        int var40 = var18 + 1;
        this.field180[var18] = arg4;
        boolean var20 = false;
        int var21 = this.field179.length;
        int[][] var22 = this.field363[this.field213].field675;
        while (var40 != var19) {
            var16 = this.field179[var19];
            var17 = this.field180[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg11 == var17) {
                var20 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && this.field363[this.field213].method294(arg11, var17, arg10, var16, arg0 - 1, arg3, false)) {
                    var20 = true;
                    break;
                }
                if (arg0 < 10 && this.field363[this.field213].method295(arg0 - 1, -39934, var17, arg3, arg11, var16, arg10)) {
                    var20 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg1 != 0 && this.field363[this.field213].method296(438, arg2, arg7, var17, arg3, arg1, var16, arg11)) {
                var20 = true;
                break;
            }
            int var38 = this.field573[var16][var17] + 1;
            if (var16 > 0 && this.field256[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field179[var40] = var16 - 1;
                this.field180[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field256[var16 - 1][var17] = 2;
                this.field573[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field256[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field179[var40] = var16 + 1;
                this.field180[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field256[var16 + 1][var17] = 8;
                this.field573[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field256[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field179[var40] = var16;
                this.field180[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field256[var16][var17 - 1] = 1;
                this.field573[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field256[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field179[var40] = var16;
                this.field180[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field256[var16][var17 + 1] = 4;
                this.field573[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field256[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field179[var40] = var16 - 1;
                this.field180[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field256[var16 - 1][var17 - 1] = 3;
                this.field573[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field256[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field179[var40] = var16 + 1;
                this.field180[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field256[var16 + 1][var17 - 1] = 9;
                this.field573[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field256[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field179[var40] = var16 - 1;
                this.field180[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field256[var16 - 1][var17 + 1] = 6;
                this.field573[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field256[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field179[var40] = var16 + 1;
                this.field180[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field256[var16 + 1][var17 + 1] = 12;
                this.field573[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field177 = 0;
        if (!var20) {
            if (!arg9) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg3 - var25; var26 <= arg3 + var25; ++var26) {
                for (int var27 = arg11 - var25; var27 <= arg11 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field573[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg3) {
                            var28 = arg3 - var26;
                        } else if (var26 > arg2 + arg3 - 1) {
                            var28 = var26 - (arg2 + arg3 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg11) {
                            var29 = arg11 - var27;
                        } else if (var27 > arg1 + arg11 - 1) {
                            var29 = var27 - (arg1 + arg11 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field573[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field573[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg8 == var16 && arg4 == var17) {
                return false;
            }
            this.field177 = 1;
        }
        byte var31 = 0;
        this.field179[var31] = var16;
        int var41 = var31 + 1;
        this.field180[var31] = var17;
        int var32;
        int var33 = var32 = this.field256[var16][var17];
        while (arg8 != var16 || arg4 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field179[var41] = var16;
                this.field180[var41++] = var17;
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
            var33 = this.field256[var16][var17];
        }
        if (var41 <= 0) {
            if (arg5 == 1) {
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
            int var35 = this.field179[var41];
            int var36 = this.field180[var41];
            if (arg5 == 0) {
                this.field127.method36(true, 5);
                this.field127.method37(var34 + var34 + 3);
            }
            if (arg5 == 1) {
                this.field127.method36(true, 41);
                this.field127.method37(var34 + var34 + 3 + 14);
            }
            if (arg5 == 2) {
                this.field127.method36(true, 74);
                this.field127.method37(var34 + var34 + 3);
            }
            this.field319 = this.field179[0];
            this.field320 = this.field180[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field127.method37(this.field179[var41] - var35);
                this.field127.method63(868, this.field180[var41] - var36);
            }
            this.field127.method71(this.field354 + var35, 607);
            this.field127.method63(868, super.field1147[5] == 1 ? 1 : 0);
            this.field127.method70(this.field355 + var36, 26);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method201(int arg0) {
        if (arg0 != -39300) {
            this.field511 = this.field309.method587();
        }
        if (this.field402 > 0) {
            this.method167((byte) -84);
        } else {
            this.method168("Connection lost", "Please wait - attempting to reestablish", this.field239);
            this.field454 = 0;
            this.field319 = 0;
            class38 var2 = this.field416;
            this.field322 = false;
            this.field202 = 0;
            this.method268(this.field380, this.field381, true);
            if (!this.field322) {
                this.method167((byte) -84);
            }
            try {
                var2.method368();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method202(byte arg0) {
        if (arg0 != 5) {
            this.field499 = 482;
        }
        for (int var2 = -1; var2 < this.field345; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field343;
            } else {
                var3 = this.field346[var2];
            }
            class32 var4 = this.field344[var3];
            if (var4 != null) {
                this.method245(1, -6841, var4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZI)V")
    public final void method203(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field358.method350(arg0, (byte) 0, arg3);
        this.field359.method350(arg0 + arg5 - 16, (byte) 0, arg3);
        class58.method528(this.field234, 16, arg0 + 16, arg3, arg5 - 32, this.field141);
        if (arg4) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        int var8 = (arg5 - 32) * arg5 / arg1;
        if (var8 < 8) {
            var8 = 8;
        }
        int var9 = (arg5 - 32 - var8) * arg2 / (arg1 - arg5);
        class58.method528(this.field234, 16, arg0 + 16 + var9, arg3, var8, this.field605);
        class58.method533(var8, this.field377, arg0 + 16 + var9, 1, arg3);
        class58.method533(var8, this.field377, arg0 + 16 + var9, 1, arg3 + 1);
        class58.method531(arg0 + 16 + var9, 16, this.field377, arg3, 0);
        class58.method531(arg0 + 17 + var9, 16, this.field377, arg3, 0);
        class58.method533(var8, this.field430, arg0 + 16 + var9, 1, arg3 + 15);
        class58.method533(var8 - 1, this.field430, arg0 + 17 + var9, 1, arg3 + 14);
        class58.method531(arg0 + 15 + var9 + var8, 16, this.field430, arg3, 0);
        class58.method531(arg0 + 14 + var9 + var8, 15, this.field430, arg3 + 1, 0);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method204(int arg0, int arg1) {
        int[] var3 = this.field321.field56;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field549[arg1][var24][var6] & 24) == 0) {
                    this.field188.method410(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field549[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field188.method410(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field321.method19(this.field499);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field549[arg1][var22][var9] & 24) == 0) {
                    this.method221(var9, var22, var8, arg1, var7, true);
                }
                if (arg1 < 3 && (this.field549[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method221(var9, var22, var8, arg1 + 1, var7, true);
                }
            }
        }
        if (this.field547 != null) {
            this.field547.method321(this.field499);
            class27.field869 = this.field249;
        }
        ++field303;
        while (arg0 >= 0) {
            this.field399 = -1;
        }
        if (field303 > 89) {
            field303 = 0;
            this.field127.method36(true, 108);
        }
        this.field374 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field188.method404(this.field213, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class48.method494(var13).field1450;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field363[this.field213].field675;
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
                        this.field323[this.field374] = this.field206[var14];
                        this.field375[this.field374] = var15;
                        this.field376[this.field374] = var16;
                        ++this.field374;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZII)V")
    private final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        if (arg3 >= 1 && arg7 >= 1 && arg3 <= 102 && arg7 <= 102) {
            if (field609 && this.field213 != arg6) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg1 == 0) {
                var10 = this.field188.method401(arg6, arg3, arg7);
            }
            if (arg1 == 1) {
                var10 = this.field188.method402(arg7, 12813, arg6, arg3);
            }
            if (arg1 == 2) {
                var10 = this.field188.method403(arg6, arg3, arg7);
            }
            if (arg1 == 3) {
                var10 = this.field188.method404(arg6, arg3, arg7);
            }
            if (var10 != 0) {
                int var14 = this.field188.method405(arg6, arg3, arg7, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg1 == 0) {
                    this.field188.method392(false, arg7, arg6, arg3);
                    class48 var18 = class48.method494(var15);
                    if (var18.field1430) {
                        this.field363[arg6].method290(var17, arg7, var18.field1453, arg3, var16, false);
                    }
                }
                if (arg1 == 1) {
                    this.field188.method393(arg7, arg6, 15, arg3);
                }
                if (arg1 == 2) {
                    this.field188.method394(false, arg3, arg7, arg6);
                    class48 var19 = class48.method494(var15);
                    if (var19.field1429 + arg3 > 103 || var19.field1429 + arg7 > 103 || var19.field1443 + arg3 > 103 || var19.field1443 + arg7 > 103) {
                        return;
                    }
                    if (var19.field1430) {
                        this.field363[arg6].method291(arg3, var19.field1453, -45320, var17, var19.field1443, var19.field1429, arg7);
                    }
                }
                if (arg1 == 3) {
                    this.field188.method395(arg7, 815, arg6, arg3);
                    class48 var20 = class48.method494(var15);
                    if (var20.field1430 && var20.field1424) {
                        this.field363[arg6].method293(-495, arg3, arg7);
                    }
                }
            }
            if (arg0 >= 0) {
                int var21 = arg6;
                if (arg6 < 3 && (this.field549[1][arg3][arg7] & 2) == 2) {
                    var21 = arg6 + 1;
                }
                class64.method570(this.field604, -604, arg2, this.field188, arg6, this.field363[arg6], var21, arg3, arg7, arg4, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LWGFLNQLA;I)V")
    private final void method206(class63 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1631 == 0) {
            var3 = this.field188.method401(arg0.field1630, arg0.field1632, arg0.field1633);
        }
        if (arg0.field1631 == 1) {
            var3 = this.field188.method402(arg0.field1633, 12813, arg0.field1630, arg0.field1632);
        }
        if (arg0.field1631 == 2) {
            var3 = this.field188.method403(arg0.field1630, arg0.field1632, arg0.field1633);
        }
        if (arg0.field1631 == 3) {
            var3 = this.field188.method404(arg0.field1630, arg0.field1632, arg0.field1633);
        }
        if (var3 != 0) {
            int var7 = this.field188.method405(arg0.field1630, arg0.field1632, arg0.field1633, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1624 = var4;
        arg0.field1626 = var5;
        arg0.field1625 = var6;
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method207(byte arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field171; ++var3) {
            class53 var4 = this.field170[this.field172[var3]];
            int var5 = (this.field172[var3] << 14) + 536870912;
            if (var4 != null && var4.method307(39489) && var4.field1508.field1707 == arg1 && var4.field1508.method596(29597)) {
                int var6 = var4.field706 >> 7;
                int var7 = var4.field707 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field682 == 1 && (var4.field706 & 127) == 64 && (var4.field707 & 127) == 64) {
                        if (this.field422[var6][var7] == this.field223) {
                            continue;
                        }
                        this.field422[var6][var7] = this.field223;
                    }
                    if (!var4.field1508.field1728) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field188.method386(var4, (byte) -123, this.field213, var4.field708, var4.field695, var5, this.method159(var4.field707, -70, this.field213, var4.field706), (var4.field682 - 1) * 64 + 60, var4.field707, var4.field706);
                }
            }
        }
        if (arg0 != 109) {
            this.field136 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILKZCOXKKW;)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, class32 arg4) {
        if (arg0 != 2) {
            this.field127.method37(220);
        }
        if (field452 != arg4) {
            if (this.field449 < 400) {
                String var6;
                if (arg4.field943 == 0) {
                    var6 = arg4.field924 + method197(arg4.field935, field452.field935, 8) + " (level-" + arg4.field935 + ")";
                } else {
                    var6 = arg4.field924 + " (skill-" + arg4.field943 + ")";
                }
                if (this.field364 == 1) {
                    this.field126[this.field449] = "Use " + this.field368 + " with @whi@" + var6;
                    this.field197[this.field449] = 226;
                    this.field198[this.field449] = arg1;
                    this.field195[this.field449] = arg3;
                    this.field196[this.field449] = arg2;
                    ++this.field449;
                } else if (this.field440 == 1) {
                    if ((this.field442 & 8) == 8) {
                        this.field126[this.field449] = this.field443 + " @whi@" + var6;
                        this.field197[this.field449] = 280;
                        this.field198[this.field449] = arg1;
                        this.field195[this.field449] = arg3;
                        this.field196[this.field449] = arg2;
                        ++this.field449;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field289[var7] != null) {
                            this.field126[this.field449] = this.field289[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field289[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field935 > field452.field935) {
                                    var9 = 2000;
                                }
                                if (field452.field929 != 0 && arg4.field929 != 0) {
                                    if (field452.field929 == arg4.field929) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field290[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field197[this.field449] = var9 + 595;
                            }
                            if (var7 == 1) {
                                this.field197[this.field449] = var9 + 827;
                            }
                            if (var7 == 2) {
                                this.field197[this.field449] = var9 + 439;
                            }
                            if (var7 == 3) {
                                this.field197[this.field449] = var9 + 273;
                            }
                            if (var7 == 4) {
                                this.field197[this.field449] = var9 + 996;
                            }
                            this.field198[this.field449] = arg1;
                            this.field195[this.field449] = arg3;
                            this.field196[this.field449] = arg2;
                            ++this.field449;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field449; ++var8) {
                    if (this.field197[var8] == 46) {
                        this.field126[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method209(int arg0, int arg1) {
        if (arg1 >= 0) {
            int var3 = this.field195[arg1];
            int var4 = this.field196[arg1];
            int var5 = this.field197[arg1];
            int var6 = this.field198[arg1];
            if (arg0 != 9) {
                this.field399 = -1;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field281 != 0 && var5 != 1122) {
                this.field281 = 0;
                this.field267 = true;
            }
            if (var5 == 864) {
                boolean var7 = this.method200(0, 0, 0, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                if (!var7) {
                    this.method200(0, 1, 1, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                }
                this.field423 = super.field1144;
                this.field424 = super.field1145;
                this.field426 = 2;
                this.field425 = 0;
                ++field433;
                if (field433 >= 54) {
                    this.field127.method36(true, 35);
                    this.field127.method40(13984990);
                    field433 = 0;
                }
                this.field127.method36(true, 207);
                this.field127.method70(var6, 26);
                this.field127.method72(this.field354 + var3, (byte) 2);
                this.field127.method72(this.field355 + var4, (byte) 2);
            }
            if (var5 == 19) {
                this.field127.method36(true, 221);
                this.field127.method38(var6);
                this.field127.method72(var3, (byte) 2);
                this.field127.method70(var4, 26);
                this.field161 = 0;
                this.field162 = var4;
                this.field163 = var3;
                this.field164 = 2;
                if (class43.method445(var4).field1184 == this.field253) {
                    this.field164 = 1;
                }
                if (class43.method445(var4).field1184 == this.field183) {
                    this.field164 = 3;
                }
            }
            if (var5 == 669) {
                class53 var9 = this.field170[var6];
                if (var9 != null) {
                    this.method200(0, 1, 1, var9.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var9.field704[0]);
                    this.field423 = super.field1144;
                    this.field424 = super.field1145;
                    this.field426 = 2;
                    this.field425 = 0;
                    this.field127.method36(true, 188);
                    this.field127.method38(this.field365);
                    this.field127.method71(var6, 607);
                    this.field127.method72(this.field367, (byte) 2);
                    this.field127.method70(this.field366, 26);
                }
            }
            if (var5 == 533) {
                class53 var10 = this.field170[var6];
                if (var10 != null) {
                    this.method200(0, 1, 1, var10.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var10.field704[0]);
                    this.field423 = super.field1144;
                    this.field424 = super.field1145;
                    this.field426 = 2;
                    this.field425 = 0;
                    this.field127.method36(true, 213);
                    this.field127.method71(var6, 607);
                    this.field127.method72(this.field441, (byte) 2);
                }
            }
            if (var5 == 46) {
                if (!this.field456) {
                    this.field188.method413(super.field1145 - 4, (byte) 11, super.field1144 - 4);
                } else {
                    this.field188.method413(var4 - 4, (byte) 11, var3 - 4);
                }
            }
            if (var5 == 808) {
                boolean var11 = this.method200(0, 0, 0, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                if (!var11) {
                    this.method200(0, 1, 1, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                }
                this.field423 = super.field1144;
                this.field424 = super.field1145;
                this.field426 = 2;
                this.field425 = 0;
                if ((var3 & 3) == 0) {
                    ++field428;
                }
                if (field428 >= 119) {
                    this.field127.method36(true, 123);
                    this.field127.method38(58942);
                    field428 = 0;
                }
                this.field127.method36(true, 29);
                this.field127.method72(var6, (byte) 2);
                this.field127.method38(this.field354 + var3);
                this.field127.method71(this.field355 + var4, 607);
            }
            if (var5 == 419) {
                this.method152(this.field313, (byte) 62);
                this.field313 = -1;
                this.field267 = true;
            }
            if (var5 == 824) {
                this.method132(var6, var4, -41461, var3);
                this.field127.method36(true, 163);
                this.field127.method38(this.field355 + var4);
                this.field127.method70(var6 >> 14 & 32767, 26);
                this.field127.method72(this.field354 + var3, (byte) 2);
            }
            if (var5 == 410) {
                class53 var13 = this.field170[var6];
                if (var13 != null) {
                    this.method200(0, 1, 1, var13.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var13.field704[0]);
                    this.field423 = super.field1144;
                    this.field424 = super.field1145;
                    this.field426 = 2;
                    this.field425 = 0;
                    if ((var6 & 3) == 0) {
                        ++field495;
                    }
                    if (field495 >= 95) {
                        this.field127.method36(true, 61);
                        this.field127.method40(15541804);
                        field495 = 0;
                    }
                    this.field127.method36(true, 0);
                    this.field127.method38(var6);
                }
            }
            if (var5 == 735) {
                boolean var14 = this.method200(0, 0, 0, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                if (!var14) {
                    this.method200(0, 1, 1, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                }
                this.field423 = super.field1144;
                this.field424 = super.field1145;
                this.field426 = 2;
                this.field425 = 0;
                this.field127.method36(true, 129);
                this.field127.method71(var6, 607);
                this.field127.method38(this.field355 + var4);
                this.field127.method38(this.field441);
                this.field127.method38(this.field354 + var3);
            }
            if (var5 == 338) {
                this.field127.method36(true, 190);
                this.field127.method38(var4);
                class43 var16 = class43.method445(var4);
                if (var16.field1190 != null && var16.field1190[0][0] == 5) {
                    int var17 = var16.field1190[0][1];
                    if (this.field205[var17] != var16.field1211[0]) {
                        this.field205[var17] = var16.field1211[0];
                        this.method172(var17, 0);
                        this.field192 = true;
                    }
                }
            }
            if (var5 == 1455) {
                class45 var18 = class45.method455(var6);
                class43 var19 = class43.method445(var4);
                String var20;
                if (var19 != null && var19.field1229[var3] >= 100000) {
                    var20 = var19.field1229[var3] + " x " + var18.field1248;
                } else if (var18.field1256 != null) {
                    var20 = new String(var18.field1256);
                } else {
                    var20 = "It's a " + var18.field1248 + ".";
                }
                this.method267("", false, var20, 0);
            }
            if (var5 == 1456) {
                int var21 = var6 >> 14 & 32767;
                class48 var22 = class48.method494(var21);
                String var23;
                if (var22.field1415 != null) {
                    var23 = new String(var22.field1415);
                } else {
                    var23 = "It's a " + var22.field1419 + ".";
                }
                this.method267("", false, var23, 0);
            }
            if (var5 == 8) {
                this.method174((byte) 4);
            }
            if (var5 == 226) {
                class32 var24 = this.field344[var6];
                if (var24 != null) {
                    this.method200(0, 1, 1, var24.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var24.field704[0]);
                    this.field423 = super.field1144;
                    this.field424 = super.field1145;
                    this.field426 = 2;
                    this.field425 = 0;
                    this.field127.method36(true, 39);
                    this.field127.method38(this.field365);
                    this.field127.method70(this.field366, 26);
                    this.field127.method70(this.field367, 26);
                    this.field127.method70(var6, 26);
                }
            }
            if (var5 == 334) {
                String var25 = this.field126[arg1];
                int var26 = var25.indexOf("@whi@");
                if (var26 != -1) {
                    long var27 = class51.method505(var25.substring(var26 + 5).trim());
                    int var29 = -1;
                    for (int var30 = 0; var30 < this.field471; ++var30) {
                        if (this.field297[var30] == var27) {
                            var29 = var30;
                            break;
                        }
                    }
                    if (var29 != -1 && this.field390[var29] > 0) {
                        this.field267 = true;
                        this.field281 = 0;
                        this.field219 = true;
                        this.field567 = "";
                        this.field252 = 3;
                        this.field493 = this.field297[var29];
                        this.field522 = "Enter message to send to " + this.field453[var29];
                    }
                }
            }
            if (var5 == 1020) {
                class53 var31 = this.field170[var6];
                if (var31 != null) {
                    class70 var32 = var31.field1508;
                    if (var32.field1722 != null) {
                        var32 = var32.method599((byte) 2);
                    }
                    if (var32 != null) {
                        String var33;
                        if (var32.field1729 != null) {
                            var33 = new String(var32.field1729);
                        } else {
                            var33 = "It's a " + var32.field1721 + ".";
                        }
                        this.method267("", false, var33, 0);
                    }
                }
            }
            if (var5 == 280) {
                class32 var34 = this.field344[var6];
                if (var34 != null) {
                    this.method200(0, 1, 1, var34.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var34.field704[0]);
                    this.field423 = super.field1144;
                    this.field424 = super.field1145;
                    this.field426 = 2;
                    this.field425 = 0;
                    this.field127.method36(true, 68);
                    this.field127.method71(var6, 607);
                    this.field127.method70(this.field441, 26);
                }
            }
            if (var5 == 764) {
                class53 var35 = this.field170[var6];
                if (var35 != null) {
                    this.method200(0, 1, 1, var35.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var35.field704[0]);
                    this.field423 = super.field1144;
                    this.field424 = super.field1145;
                    this.field426 = 2;
                    this.field425 = 0;
                    this.field127.method36(true, 193);
                    this.field127.method70(var6, 26);
                }
            }
            if (var5 == 196) {
                boolean var36 = this.method200(0, 0, 0, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                if (!var36) {
                    this.method200(0, 1, 1, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                }
                this.field423 = super.field1144;
                this.field424 = super.field1145;
                this.field426 = 2;
                this.field425 = 0;
                this.field127.method36(true, 90);
                this.field127.method71(this.field355 + var4, 607);
                this.field127.method72(this.field367, (byte) 2);
                this.field127.method72(var6, (byte) 2);
                this.field127.method72(this.field366, (byte) 2);
                this.field127.method38(this.field354 + var3);
                this.field127.method38(this.field365);
            }
            if (var5 == 595) {
                class32 var38 = this.field344[var6];
                if (var38 != null) {
                    this.method200(0, 1, 1, var38.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var38.field704[0]);
                    this.field423 = super.field1144;
                    this.field424 = super.field1145;
                    this.field426 = 2;
                    this.field425 = 0;
                    this.field127.method36(true, 72);
                    this.field127.method71(var6, 607);
                }
            }
            if (var5 == 638) {
                this.field364 = 1;
                this.field365 = var3;
                this.field366 = var4;
                this.field367 = var6;
                this.field368 = String.valueOf(class45.method455(var6).field1248);
                this.field440 = 0;
                this.field192 = true;
            } else {
                if (var5 == 15) {
                    class53 var39 = this.field170[var6];
                    if (var39 != null) {
                        this.method200(0, 1, 1, var39.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var39.field704[0]);
                        this.field423 = super.field1144;
                        this.field424 = super.field1145;
                        this.field426 = 2;
                        this.field425 = 0;
                        this.field127.method36(true, 112);
                        this.field127.method38(var6);
                    }
                }
                if (var5 == 273) {
                    class32 var40 = this.field344[var6];
                    if (var40 != null) {
                        this.method200(0, 1, 1, var40.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var40.field704[0]);
                        this.field423 = super.field1144;
                        this.field424 = super.field1145;
                        this.field426 = 2;
                        this.field425 = 0;
                        this.field127.method36(true, 181);
                        this.field127.method72(var6, (byte) 2);
                    }
                }
                if (var5 == 936) {
                    this.field127.method36(true, 55);
                    this.field127.method70(var3, 26);
                    this.field127.method38(var6);
                    this.field127.method71(var4, 607);
                    this.field161 = 0;
                    this.field162 = var4;
                    this.field163 = var3;
                    this.field164 = 2;
                    if (class43.method445(var4).field1184 == this.field253) {
                        this.field164 = 1;
                    }
                    if (class43.method445(var4).field1184 == this.field183) {
                        this.field164 = 3;
                    }
                }
                if (var5 == 414) {
                    this.field127.method36(true, 51);
                    this.field127.method70(var3, 26);
                    this.field127.method38(var6);
                    this.field127.method70(var4, 26);
                    this.field161 = 0;
                    this.field162 = var4;
                    this.field163 = var3;
                    this.field164 = 2;
                    if (class43.method445(var4).field1184 == this.field253) {
                        this.field164 = 1;
                    }
                    if (class43.method445(var4).field1184 == this.field183) {
                        this.field164 = 3;
                    }
                }
                if (var5 == 653 && this.method132(var6, var4, -41461, var3)) {
                    this.field127.method36(true, 82);
                    this.field127.method71(this.field355 + var4, 607);
                    this.field127.method72(var6 >> 14 & 32767, (byte) 2);
                    this.field127.method38(this.field367);
                    this.field127.method71(this.field354 + var3, 607);
                    this.field127.method71(this.field365, 607);
                    this.field127.method72(this.field366, (byte) 2);
                }
                if (var5 == 66) {
                    ++field338;
                    if (field338 >= 72) {
                        this.field127.method36(true, 54);
                        field338 = 0;
                    }
                    this.method132(var6, var4, -41461, var3);
                    this.field127.method36(true, 201);
                    this.field127.method72(this.field354 + var3, (byte) 2);
                    this.field127.method70(var6 >> 14 & 32767, 26);
                    this.field127.method70(this.field355 + var4, 26);
                }
                if (var5 == 816) {
                    class53 var41 = this.field170[var6];
                    if (var41 != null) {
                        this.method200(0, 1, 1, var41.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var41.field704[0]);
                        this.field423 = super.field1144;
                        this.field424 = super.field1145;
                        this.field426 = 2;
                        this.field425 = 0;
                        this.field127.method36(true, 2);
                        this.field127.method38(var6);
                    }
                }
                if (var5 == 609) {
                    this.field127.method36(true, 190);
                    this.field127.method38(var4);
                    class43 var42 = class43.method445(var4);
                    if (var42.field1190 != null && var42.field1190[0][0] == 5) {
                        int var43 = var42.field1190[0][1];
                        this.field205[var43] = 1 - this.field205[var43];
                        this.method172(var43, 0);
                        this.field192 = true;
                    }
                }
                if (var5 == 160) {
                    String var44 = this.field126[arg1];
                    int var45 = var44.indexOf("@whi@");
                    if (var45 != -1) {
                        if (this.field253 == -1) {
                            this.method174((byte) 4);
                            this.field187 = var44.substring(var45 + 5).trim();
                            this.field200 = false;
                            this.field494 = this.field253 = class43.field1173;
                        } else {
                            this.method267("", false, "Please close the interface you have open before using 'report abuse'", 0);
                        }
                    }
                }
                if (var5 == 424) {
                    ++field439;
                    if (field439 >= 144) {
                        this.field127.method36(true, 235);
                        this.field127.method41(0);
                        field439 = 0;
                    }
                    this.field127.method36(true, 243);
                    this.field127.method70(var3, 26);
                    this.field127.method38(var4);
                    this.field127.method70(var6, 26);
                    this.field161 = 0;
                    this.field162 = var4;
                    this.field163 = var3;
                    this.field164 = 2;
                    if (class43.method445(var4).field1184 == this.field253) {
                        this.field164 = 1;
                    }
                    if (class43.method445(var4).field1184 == this.field183) {
                        this.field164 = 3;
                    }
                }
                if (var5 == 339) {
                    this.field127.method36(true, 140);
                    this.field127.method71(var4, 607);
                    this.field127.method70(var3, 26);
                    this.field127.method72(var6, (byte) 2);
                    this.field161 = 0;
                    this.field162 = var4;
                    this.field163 = var3;
                    this.field164 = 2;
                    if (class43.method445(var4).field1184 == this.field253) {
                        this.field164 = 1;
                    }
                    if (class43.method445(var4).field1184 == this.field183) {
                        this.field164 = 3;
                    }
                }
                if (var5 == 242) {
                    field583 += var4;
                    if (field583 >= 146) {
                        this.field127.method36(true, 49);
                        field583 = 0;
                    }
                    this.field127.method36(true, 208);
                    this.field127.method70(var4, 26);
                    this.field127.method70(var3, 26);
                    this.field127.method72(var6, (byte) 2);
                    this.field161 = 0;
                    this.field162 = var4;
                    this.field163 = var3;
                    this.field164 = 2;
                    if (class43.method445(var4).field1184 == this.field253) {
                        this.field164 = 1;
                    }
                    if (class43.method445(var4).field1184 == this.field183) {
                        this.field164 = 3;
                    }
                }
                if (var5 == 51) {
                    ++field207;
                    if (field207 >= 98) {
                        this.field127.method36(true, 52);
                        field207 = 0;
                    }
                    this.method132(var6, var4, -41461, var3);
                    this.field127.method36(true, 1);
                    this.field127.method71(var6 >> 14 & 32767, 607);
                    this.field127.method38(this.field355 + var4);
                    this.field127.method38(this.field354 + var3);
                }
                if (var5 == 509) {
                    this.field127.method36(true, 78);
                    this.field127.method71(var4, 607);
                    this.field127.method70(var3, 26);
                    this.field127.method72(var6, (byte) 2);
                    this.field161 = 0;
                    this.field162 = var4;
                    this.field163 = var3;
                    this.field164 = 2;
                    if (class43.method445(var4).field1184 == this.field253) {
                        this.field164 = 1;
                    }
                    if (class43.method445(var4).field1184 == this.field183) {
                        this.field164 = 3;
                    }
                }
                if (var5 == 439) {
                    class32 var46 = this.field344[var6];
                    if (var46 != null) {
                        this.method200(0, 1, 1, var46.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var46.field704[0]);
                        this.field423 = super.field1144;
                        this.field424 = super.field1145;
                        this.field426 = 2;
                        this.field425 = 0;
                        this.field127.method36(true, 71);
                        this.field127.method71(var6, 607);
                    }
                }
                if (var5 == 1359) {
                    this.method132(var6, var4, -41461, var3);
                    this.field127.method36(true, 22);
                    this.field127.method70(var6 >> 14 & 32767, 26);
                    this.field127.method70(this.field354 + var3, 26);
                    this.field127.method38(this.field355 + var4);
                }
                if (var5 == 654) {
                    class43 var47 = class43.method445(var4);
                    this.field440 = 1;
                    this.field441 = var4;
                    this.field442 = var47.field1213;
                    this.field364 = 0;
                    this.field192 = true;
                    String var48 = var47.field1226;
                    if (var48.indexOf(" ") != -1) {
                        var48 = var48.substring(0, var48.indexOf(" "));
                    }
                    String var49 = var47.field1226;
                    if (var49.indexOf(" ") != -1) {
                        var49 = var49.substring(var49.indexOf(" ") + 1);
                    }
                    this.field443 = var48 + " " + var47.field1214 + " " + var49;
                    if (this.field442 == 16) {
                        this.field192 = true;
                        this.field580 = 3;
                        this.field280 = true;
                    }
                } else {
                    if (var5 == 153) {
                        this.field127.method36(true, 62);
                        this.field127.method71(var4, 607);
                        this.field127.method38(var6);
                        this.field127.method71(var3, 607);
                        this.field127.method72(this.field441, (byte) 2);
                        this.field161 = 0;
                        this.field162 = var4;
                        this.field163 = var3;
                        this.field164 = 2;
                        if (class43.method445(var4).field1184 == this.field253) {
                            this.field164 = 1;
                        }
                        if (class43.method445(var4).field1184 == this.field183) {
                            this.field164 = 3;
                        }
                    }
                    if (var5 == 106) {
                        this.method132(var6, var4, -41461, var3);
                        this.field127.method36(true, 28);
                        this.field127.method71(this.field355 + var4, 607);
                        this.field127.method71(this.field354 + var3, 607);
                        this.field127.method72(var6 >> 14 & 32767, (byte) 2);
                    }
                    if (var5 == 656) {
                        boolean var50 = this.method200(0, 0, 0, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                        if (!var50) {
                            this.method200(0, 1, 1, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                        }
                        this.field423 = super.field1144;
                        this.field424 = super.field1145;
                        this.field426 = 2;
                        this.field425 = 0;
                        if ((var3 & 3) == 0) {
                            ++field159;
                        }
                        if (field159 >= 115) {
                            this.field127.method36(true, 159);
                            this.field127.method40(8764737);
                            field159 = 0;
                        }
                        this.field127.method36(true, 7);
                        this.field127.method72(var6, (byte) 2);
                        this.field127.method72(this.field355 + var4, (byte) 2);
                        this.field127.method72(this.field354 + var3, (byte) 2);
                    }
                    if (var5 == 1686) {
                        class45 var52 = class45.method455(var6);
                        String var53;
                        if (var52.field1256 != null) {
                            var53 = new String(var52.field1256);
                        } else {
                            var53 = "It's a " + var52.field1248 + ".";
                        }
                        this.method267("", false, var53, 0);
                    }
                    if (var5 == 271) {
                        class53 var54 = this.field170[var6];
                        if (var54 != null) {
                            this.method200(0, 1, 1, var54.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var54.field704[0]);
                            this.field423 = super.field1144;
                            this.field424 = super.field1145;
                            this.field426 = 2;
                            this.field425 = 0;
                            this.field127.method36(true, 12);
                            this.field127.method38(var6);
                        }
                    }
                    if (var5 == 827) {
                        class32 var55 = this.field344[var6];
                        if (var55 != null) {
                            this.method200(0, 1, 1, var55.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var55.field704[0]);
                            this.field423 = super.field1144;
                            this.field424 = super.field1145;
                            this.field426 = 2;
                            this.field425 = 0;
                            field224 += var6;
                            if (field224 >= 63) {
                                this.field127.method36(true, 232);
                                this.field127.method40(16325003);
                                field224 = 0;
                            }
                            this.field127.method36(true, 16);
                            this.field127.method70(var6, 26);
                        }
                    }
                    if (var5 == 887) {
                        class43 var56 = class43.method445(var4);
                        boolean var57 = true;
                        if (var56.field1193 > 0) {
                            var57 = this.method179(5, var56);
                        }
                        if (var57) {
                            this.field127.method36(true, 190);
                            this.field127.method38(var4);
                        }
                    }
                    if (var5 == 155) {
                        this.field127.method36(true, 150);
                        this.field127.method38(var6);
                        this.field127.method72(var4, (byte) 2);
                        this.field127.method71(var3, 607);
                        this.field161 = 0;
                        this.field162 = var4;
                        this.field163 = var3;
                        this.field164 = 2;
                        if (class43.method445(var4).field1184 == this.field253) {
                            this.field164 = 1;
                        }
                        if (class43.method445(var4).field1184 == this.field183) {
                            this.field164 = 3;
                        }
                    }
                    if (var5 == 941) {
                        boolean var58 = this.method200(0, 0, 0, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                        if (!var58) {
                            this.method200(0, 1, 1, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                        }
                        this.field423 = super.field1144;
                        this.field424 = super.field1145;
                        this.field426 = 2;
                        this.field425 = 0;
                        this.field127.method36(true, 196);
                        this.field127.method72(this.field354 + var3, (byte) 2);
                        this.field127.method72(var6, (byte) 2);
                        this.field127.method38(this.field355 + var4);
                    }
                    if (var5 == 995) {
                        boolean var60 = this.method200(0, 0, 0, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                        if (!var60) {
                            this.method200(0, 1, 1, var3, field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var4);
                        }
                        this.field423 = super.field1144;
                        this.field424 = super.field1145;
                        this.field426 = 2;
                        this.field425 = 0;
                        this.field127.method36(true, 142);
                        this.field127.method71(var6, 607);
                        this.field127.method38(this.field354 + var3);
                        this.field127.method71(this.field355 + var4, 607);
                    }
                    if (var5 == 717) {
                        this.field127.method36(true, 248);
                        this.field127.method71(var6, 607);
                        this.field127.method71(var4, 607);
                        this.field127.method72(var3, (byte) 2);
                        this.field161 = 0;
                        this.field162 = var4;
                        this.field163 = var3;
                        this.field164 = 2;
                        if (class43.method445(var4).field1184 == this.field253) {
                            this.field164 = 1;
                        }
                        if (class43.method445(var4).field1184 == this.field183) {
                            this.field164 = 3;
                        }
                    }
                    if (var5 == 996) {
                        class32 var62 = this.field344[var6];
                        if (var62 != null) {
                            this.method200(0, 1, 1, var62.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var62.field704[0]);
                            this.field423 = super.field1144;
                            this.field424 = super.field1145;
                            this.field426 = 2;
                            this.field425 = 0;
                            this.field127.method36(true, 4);
                            this.field127.method72(var6, (byte) 2);
                        }
                    }
                    if (var5 == 477 && !this.field142) {
                        this.field127.method36(true, 42);
                        this.field127.method38(var4);
                        this.field142 = true;
                    }
                    if (var5 == 702 || var5 == 352 || var5 == 70 || var5 == 144) {
                        String var63 = this.field126[arg1];
                        int var64 = var63.indexOf("@whi@");
                        if (var64 != -1) {
                            long var65 = class51.method505(var63.substring(var64 + 5).trim());
                            if (var5 == 702) {
                                this.method155(var65, true);
                            }
                            if (var5 == 352) {
                                this.method181(var65, 0);
                            }
                            if (var5 == 70) {
                                this.method231(true, var65);
                            }
                            if (var5 == 144) {
                                this.method191(var65, this.field560);
                            }
                        }
                    }
                    if (var5 == 38) {
                        this.field127.method36(true, 250);
                        this.field127.method72(var4, (byte) 2);
                        this.field127.method70(var3, 26);
                        this.field127.method38(var6);
                        this.field161 = 0;
                        this.field162 = var4;
                        this.field163 = var3;
                        this.field164 = 2;
                        if (class43.method445(var4).field1184 == this.field253) {
                            this.field164 = 1;
                        }
                        if (class43.method445(var4).field1184 == this.field183) {
                            this.field164 = 3;
                        }
                    }
                    if (var5 == 546 && this.method132(var6, var4, -41461, var3)) {
                        this.field127.method36(true, 246);
                        this.field127.method70(this.field354 + var3, 26);
                        this.field127.method70(this.field441, 26);
                        this.field127.method70(var6 >> 14 & 32767, 26);
                        this.field127.method70(this.field355 + var4, 26);
                    }
                    if (var5 == 172 || var5 == 716) {
                        String var67 = this.field126[arg1];
                        int var68 = var67.indexOf("@whi@");
                        if (var68 != -1) {
                            String var69 = var67.substring(var68 + 5).trim();
                            String var70 = class51.method509(class51.method506(false, class51.method505(var69)), true);
                            boolean var71 = false;
                            for (int var72 = 0; var72 < this.field345; ++var72) {
                                class32 var73 = this.field344[this.field346[var72]];
                                if (var73 != null && var73.field924 != null && var73.field924.equalsIgnoreCase(var70)) {
                                    this.method200(0, 1, 1, var73.field703[0], field452.field704[0], 2, false, 0, field452.field703[0], false, 0, var73.field704[0]);
                                    if (var5 == 172) {
                                        this.field127.method36(true, 181);
                                        this.field127.method72(this.field346[var72], (byte) 2);
                                    }
                                    if (var5 == 716) {
                                        this.field127.method36(true, 72);
                                        this.field127.method71(this.field346[var72], 607);
                                    }
                                    var71 = true;
                                    break;
                                }
                            }
                            if (!var71) {
                                this.method267("", false, "Unable to find " + var70, 0);
                            }
                        }
                    }
                    if (var5 == 730) {
                        this.field127.method36(true, 162);
                        this.field127.method71(this.field366, 607);
                        this.field127.method72(this.field365, (byte) 2);
                        this.field127.method71(var6, 607);
                        this.field127.method38(var3);
                        this.field127.method72(this.field367, (byte) 2);
                        this.field127.method72(var4, (byte) 2);
                        this.field161 = 0;
                        this.field162 = var4;
                        this.field163 = var3;
                        this.field164 = 2;
                        if (class43.method445(var4).field1184 == this.field253) {
                            this.field164 = 1;
                        }
                        if (class43.method445(var4).field1184 == this.field183) {
                            this.field164 = 3;
                        }
                    }
                    this.field364 = 0;
                    this.field440 = 0;
                    this.field192 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method210(boolean arg0) {
        this.field602 = 0;
        if (arg0) {
            this.method128();
        }
        int var2 = (field452.field706 >> 7) + this.field354;
        int var3 = (field452.field707 >> 7) + this.field355;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field602 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field602 = 1;
        }
        if (this.field602 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field602 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = class47.field1399[var8];
            int var14 = class47.field1400[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class47.field1399[var9];
            int var17 = class47.field1400[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field284 = arg1 - var10;
        this.field285 = arg2 - var11;
        this.field286 = arg6 - var12;
        if (arg4 >= 3 && arg4 <= 3) {
            this.field287 = arg0;
            this.field288 = arg5;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILBSNPYLEV;)V")
    private final void method212(int arg0, int arg1, class7 arg2) {
        this.field330 = 0;
        this.field347 = 0;
        this.method175(false, arg1, arg2);
        int var4 = 38 / arg0;
        this.method150(854, arg2, arg1);
        this.method130((byte) 8, arg2, arg1);
        this.method258(39981, arg2, arg1);
        for (int var5 = 0; var5 < this.field330; ++var5) {
            int var7 = this.field331[var5];
            if (field396 != this.field344[var7].field737) {
                this.field344[var7] = null;
            }
        }
        if (arg2.field91 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field91 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field345; ++var6) {
                if (this.field344[this.field346[var6]] == null) {
                    signlink.reporterror(this.field380 + " null entry in pl list - pos:" + var6 + " size:" + this.field345);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)Z")
    public final boolean method213(boolean arg0) {
        if (arg0) {
            this.field127.method37(0);
        }
        if (this.field416 == null) {
            return false;
        } else {
            try {
                int var2 = this.field416.method370();
                if (var2 == 0) {
                    return false;
                }
                if (this.field399 == -1) {
                    this.field416.method371(this.field474.field90, 0, 1);
                    this.field399 = this.field474.field90[0] & 255;
                    if (this.field309 != null) {
                        this.field399 = this.field399 - this.field309.method587() & 255;
                    }
                    this.field398 = class61.field1575[this.field399];
                    --var2;
                }
                if (this.field398 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field416.method371(this.field474.field90, 0, 1);
                    this.field398 = this.field474.field90[0] & 255;
                    --var2;
                }
                if (this.field398 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field416.method371(this.field474.field90, 0, 2);
                    this.field474.field91 = 0;
                    this.field398 = this.field474.method49();
                    var2 -= 2;
                }
                if (var2 < this.field398) {
                    return false;
                }
                this.field474.field91 = 0;
                this.field416.method371(this.field474.field90, 0, this.field398);
                this.field400 = 0;
                this.field527 = this.field526;
                this.field526 = this.field525;
                this.field525 = this.field399;
                if (this.field399 == 220) {
                    int var3 = this.field474.method47();
                    int var4 = this.field474.method73(6);
                    if (var4 == 65535) {
                        var4 = -1;
                    }
                    if (this.field432[var3] != var4) {
                        this.method152(this.field432[var3], (byte) 62);
                        this.field432[var3] = var4;
                    }
                    this.field192 = true;
                    this.field280 = true;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 241) {
                    this.field552 = this.field474.method47();
                    this.field553 = this.field474.method47();
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 70) {
                    int var5 = this.field474.method49();
                    String var6 = this.field474.method54();
                    class43.method445(var5).field1183 = var6;
                    int var10001 = this.field432[this.field580];
                    if (class43.method445(var5).field1184 == var10001) {
                        this.field192 = true;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 228) {
                    int var7 = this.field474.method74((byte) -99);
                    class43 var8 = class43.method445(var7);
                    for (int var9 = 0; var9 < var8.field1177.length; ++var9) {
                        var8.field1177[var9] = -1;
                        var8.field1177[var9] = 0;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 185) {
                    this.field352 = true;
                    this.field513 = this.field474.method47();
                    this.field514 = this.field474.method47();
                    this.field515 = this.field474.method49();
                    this.field516 = this.field474.method47();
                    this.field517 = this.field474.method47();
                    if (this.field517 >= 100) {
                        this.field284 = this.field513 * 128 + 64;
                        this.field286 = this.field514 * 128 + 64;
                        this.field285 = this.method159(this.field286, -70, this.field213, this.field284) - this.field515;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 236) {
                    this.field509 = this.field474.method47();
                    if (this.field509 == 1) {
                        this.field570 = this.field474.method49();
                    }
                    if (this.field509 >= 2 && this.field509 <= 6) {
                        if (this.field509 == 2) {
                            this.field407 = 64;
                            this.field408 = 64;
                        }
                        if (this.field509 == 3) {
                            this.field407 = 0;
                            this.field408 = 64;
                        }
                        if (this.field509 == 4) {
                            this.field407 = 128;
                            this.field408 = 64;
                        }
                        if (this.field509 == 5) {
                            this.field407 = 64;
                            this.field408 = 0;
                        }
                        if (this.field509 == 6) {
                            this.field407 = 64;
                            this.field408 = 128;
                        }
                        this.field509 = 2;
                        this.field404 = this.field474.method49();
                        this.field405 = this.field474.method49();
                        this.field406 = this.field474.method47();
                    }
                    if (this.field509 == 10) {
                        this.field190 = this.field474.method49();
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 21) {
                    int var10 = this.field474.method75(true);
                    int var11 = this.field474.method75(true);
                    class43 var12 = class43.method445(var11);
                    if (var12 != null && var12.field1204 == 0) {
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        if (var10 > var12.field1188 - var12.field1206) {
                            var10 = var12.field1188 - var12.field1206;
                        }
                        var12.field1195 = var10;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 80) {
                    this.method167((byte) -84);
                    this.field399 = -1;
                    return false;
                }
                if (this.field399 == 206) {
                    int var13 = this.field474.method49();
                    int var14 = this.field474.method47();
                    int var15 = this.field474.method49();
                    if (var15 == 65535) {
                        if (this.field329 < 50) {
                            this.field351[this.field329] = (short) var13;
                            this.field496[this.field329] = var14;
                            this.field255[this.field329] = 0;
                            ++this.field329;
                        }
                    } else if (this.field315 && !field609 && this.field329 < 50) {
                        this.field351[this.field329] = var13;
                        this.field496[this.field329] = var14;
                        this.field255[this.field329] = class10.field643[var13] + var15;
                        ++this.field329;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 36) {
                    int var16 = this.field474.method50();
                    int var17 = this.field474.method73(6);
                    int var18 = this.field474.method76(0);
                    class43 var19 = class43.method445(var17);
                    var19.field1174 = var16;
                    var19.field1171 = var18;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 158) {
                    this.field454 = this.field474.method47();
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 230) {
                    int var20 = this.field474.method75(true);
                    this.method189(true, var20);
                    if (this.field183 != -1) {
                        this.method152(this.field183, (byte) 62);
                        this.field183 = -1;
                        this.field267 = true;
                    }
                    if (this.field455 != -1) {
                        this.method152(this.field455, (byte) 62);
                        this.field455 = -1;
                        this.field133 = true;
                    }
                    if (this.field446 != -1) {
                        this.method152(this.field446, (byte) 62);
                        this.field446 = -1;
                    }
                    if (this.field253 != -1) {
                        this.method152(this.field253, (byte) 62);
                        this.field253 = -1;
                    }
                    if (this.field409 != var20) {
                        this.method152(this.field409, (byte) 62);
                        this.field409 = var20;
                    }
                    if (this.field281 != 0) {
                        this.field281 = 0;
                        this.field267 = true;
                    }
                    this.field192 = true;
                    this.field280 = true;
                    this.field142 = false;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 34) {
                    int var21 = this.field474.method75(true);
                    int var22 = this.field474.method49();
                    int var23 = this.field474.method73(6);
                    class43.method445(var23).field1189 = (var22 << 16) + var21;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 22) {
                    this.field553 = this.field474.method67(-48149);
                    this.field552 = this.field474.method67(-48149);
                    while (this.field474.field91 < this.field398) {
                        int var24 = this.field474.method47();
                        this.method173(this.field474, (byte) 6, var24);
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 172) {
                    this.method163(this.field474, this.field398, true);
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 87) {
                    this.field352 = true;
                    this.field262 = this.field474.method47();
                    this.field263 = this.field474.method47();
                    this.field264 = this.field474.method49();
                    this.field265 = this.field474.method47();
                    this.field266 = this.field474.method47();
                    if (this.field266 >= 100) {
                        int var25 = this.field262 * 128 + 64;
                        int var26 = this.field263 * 128 + 64;
                        int var27 = this.method159(var26, -70, this.field213, var25) - this.field264;
                        int var28 = var25 - this.field284;
                        int var29 = var27 - this.field285;
                        int var30 = var26 - this.field286;
                        int var31 = (int) Math.sqrt((double) (var28 * var28 + var30 * var30));
                        this.field287 = (int) (Math.atan2((double) var29, (double) var31) * 325.949D) & 2047;
                        this.field288 = (int) (Math.atan2((double) var28, (double) var30) * -325.949D) & 2047;
                        if (this.field287 < 128) {
                            this.field287 = 128;
                        }
                        if (this.field287 > 383) {
                            this.field287 = 383;
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 123) {
                    int var32 = this.field474.method74((byte) -99);
                    int var33 = this.field474.method75(true);
                    class43.method445(var32).field1215 = 2;
                    class43.method445(var32).field1216 = var33;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 134) {
                    String var34 = this.field474.method54();
                    if (var34.endsWith(":tradereq:")) {
                        String var35 = var34.substring(0, var34.indexOf(":"));
                        long var36 = class51.method505(var35);
                        boolean var38 = false;
                        for (int var39 = 0; var39 < this.field519; ++var39) {
                            if (this.field298[var39] == var36) {
                                var38 = true;
                                break;
                            }
                        }
                        if (!var38 && this.field602 == 0) {
                            this.method267(var35, false, "wishes to trade with you.", 4);
                        }
                    } else if (var34.endsWith(":duelreq:")) {
                        String var40 = var34.substring(0, var34.indexOf(":"));
                        long var41 = class51.method505(var40);
                        boolean var43 = false;
                        for (int var44 = 0; var44 < this.field519; ++var44) {
                            if (this.field298[var44] == var41) {
                                var43 = true;
                                break;
                            }
                        }
                        if (!var43 && this.field602 == 0) {
                            this.method267(var40, false, "wishes to duel with you.", 8);
                        }
                    } else if (!var34.endsWith(":chalreq:")) {
                        this.method267("", false, var34, 0);
                    } else {
                        String var45 = var34.substring(0, var34.indexOf(":"));
                        long var46 = class51.method505(var45);
                        boolean var48 = false;
                        for (int var49 = 0; var49 < this.field519; ++var49) {
                            if (this.field298[var49] == var46) {
                                var48 = true;
                                break;
                            }
                        }
                        if (!var48 && this.field602 == 0) {
                            String var50 = var34.substring(var34.indexOf(":") + 1, var34.length() - 9);
                            this.method267(var45, false, var50, 8);
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 102) {
                    this.field519 = this.field398 / 8;
                    for (int var51 = 0; var51 < this.field519; ++var51) {
                        this.field298[var51] = this.field474.method53((byte) 51);
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 249 || this.field399 == 8) {
                    int var52 = this.field450;
                    int var53 = this.field451;
                    if (this.field399 == 249) {
                        var53 = this.field474.method75(true);
                        var52 = this.field474.method74((byte) -99);
                        this.field551 = false;
                    }
                    if (this.field399 == 8) {
                        this.field474.method57(-322);
                        int var54 = 0;
                        while (true) {
                            if (var54 >= 4) {
                                this.field474.method59(0);
                                var52 = this.field474.method75(true);
                                var53 = this.field474.method73(6);
                                this.field551 = true;
                                break;
                            }
                            for (int var55 = 0; var55 < 13; ++var55) {
                                for (int var56 = 0; var56 < 13; ++var56) {
                                    int var57 = this.field474.method58(1, 588);
                                    if (var57 == 1) {
                                        this.field448[var54][var55][var56] = this.field474.method58(26, 588);
                                    } else {
                                        this.field448[var54][var55][var56] = -1;
                                    }
                                }
                            }
                            ++var54;
                        }
                    }
                    if (this.field450 == var52 && this.field451 == var53 && this.field314 == 2) {
                        this.field399 = -1;
                        return true;
                    }
                    this.field450 = var52;
                    this.field451 = var53;
                    this.field354 = (this.field450 - 6) * 8;
                    this.field355 = (this.field451 - 6) * 8;
                    this.field233 = false;
                    if ((this.field450 / 8 == 48 || this.field450 / 8 == 49) && this.field451 / 8 == 48) {
                        this.field233 = true;
                    }
                    if (this.field450 / 8 == 48 && this.field451 / 8 == 148) {
                        this.field233 = true;
                    }
                    this.field314 = 1;
                    this.field603 = System.currentTimeMillis();
                    this.method168("Loading - please wait.", (String) null, this.field239);
                    if (this.field399 == 249) {
                        int var58 = 0;
                        int var59 = (this.field450 - 6) / 8;
                        label1205: while (true) {
                            if (var59 > (this.field450 + 6) / 8) {
                                this.field182 = new byte[var58][];
                                this.field467 = new byte[var58][];
                                this.field419 = new int[var58];
                                this.field420 = new int[var58];
                                this.field421 = new int[var58];
                                int var61 = 0;
                                int var62 = (this.field450 - 6) / 8;
                                while (true) {
                                    if (var62 > (this.field450 + 6) / 8) {
                                        break label1205;
                                    }
                                    for (int var63 = (this.field451 - 6) / 8; var63 <= (this.field451 + 6) / 8; ++var63) {
                                        this.field419[var61] = (var62 << 8) + var63;
                                        if (!this.field233 || var63 != 49 && var63 != 149 && var63 != 147 && var62 != 50 && (var62 != 49 || var63 != 47)) {
                                            int var64 = this.field420[var61] = this.field505.method541(0, false, var62, var63);
                                            if (var64 != -1) {
                                                this.field505.method556(3, var64);
                                            }
                                            int var65 = this.field421[var61] = this.field505.method541(1, false, var62, var63);
                                            if (var65 != -1) {
                                                this.field505.method556(3, var65);
                                            }
                                            ++var61;
                                        } else {
                                            this.field420[var61] = -1;
                                            this.field421[var61] = -1;
                                            ++var61;
                                        }
                                    }
                                    ++var62;
                                }
                            }
                            for (int var60 = (this.field451 - 6) / 8; var60 <= (this.field451 + 6) / 8; ++var60) {
                                ++var58;
                            }
                            ++var59;
                        }
                    }
                    if (this.field399 == 8) {
                        int var66 = 0;
                        int[] var67 = new int[676];
                        int var68 = 0;
                        label1164: while (true) {
                            if (var68 >= 4) {
                                this.field182 = new byte[var66][];
                                this.field467 = new byte[var66][];
                                this.field419 = new int[var66];
                                this.field420 = new int[var66];
                                this.field421 = new int[var66];
                                int var76 = 0;
                                while (true) {
                                    if (var76 >= var66) {
                                        break label1164;
                                    }
                                    int var77 = this.field419[var76] = var67[var76];
                                    int var78 = var77 >> 8 & 255;
                                    int var79 = var77 & 255;
                                    int var80 = this.field420[var76] = this.field505.method541(0, false, var78, var79);
                                    if (var80 != -1) {
                                        this.field505.method556(3, var80);
                                    }
                                    int var81 = this.field421[var76] = this.field505.method541(1, false, var78, var79);
                                    if (var81 != -1) {
                                        this.field505.method556(3, var81);
                                    }
                                    ++var76;
                                }
                            }
                            for (int var69 = 0; var69 < 13; ++var69) {
                                for (int var70 = 0; var70 < 13; ++var70) {
                                    int var71 = this.field448[var68][var69][var70];
                                    if (var71 != -1) {
                                        int var72 = var71 >> 14 & 1023;
                                        int var73 = var71 >> 3 & 2047;
                                        int var74 = (var72 / 8 << 8) + var73 / 8;
                                        for (int var75 = 0; var75 < var66; ++var75) {
                                            if (var67[var75] == var74) {
                                                var74 = -1;
                                                break;
                                            }
                                        }
                                        if (var74 != -1) {
                                            var67[var66++] = var74;
                                        }
                                    }
                                }
                            }
                            ++var68;
                        }
                    }
                    int var82 = this.field354 - this.field356;
                    int var83 = this.field355 - this.field357;
                    this.field356 = this.field354;
                    this.field357 = this.field355;
                    for (int var84 = 0; var84 < 16384; ++var84) {
                        class53 var85 = this.field170[var84];
                        if (var85 != null) {
                            for (int var86 = 0; var86 < 10; ++var86) {
                                var85.field703[var86] -= var82;
                                var85.field704[var86] -= var83;
                            }
                            var85.field706 -= var82 * 128;
                            var85.field707 -= var83 * 128;
                        }
                    }
                    for (int var87 = 0; var87 < this.field342; ++var87) {
                        class32 var88 = this.field344[var87];
                        if (var88 != null) {
                            for (int var89 = 0; var89 < 10; ++var89) {
                                var88.field703[var89] -= var82;
                                var88.field704[var89] -= var83;
                            }
                            var88.field706 -= var82 * 128;
                            var88.field707 -= var83 * 128;
                        }
                    }
                    this.field243 = true;
                    byte var90 = 0;
                    byte var91 = 104;
                    byte var92 = 1;
                    if (var82 < 0) {
                        var90 = 103;
                        var91 = -1;
                        var92 = -1;
                    }
                    byte var93 = 0;
                    byte var94 = 104;
                    byte var95 = 1;
                    if (var83 < 0) {
                        var93 = 103;
                        var94 = -1;
                        var95 = -1;
                    }
                    for (int var96 = var90; var91 != var96; var96 += var92) {
                        for (int var97 = var93; var94 != var97; var97 += var95) {
                            int var98 = var82 + var96;
                            int var99 = var83 + var97;
                            for (int var100 = 0; var100 < 4; ++var100) {
                                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                                    this.field136[var100][var96][var97] = this.field136[var100][var98][var99];
                                } else {
                                    this.field136[var100][var96][var97] = null;
                                }
                            }
                        }
                    }
                    for (class63 var101 = (class63) this.field360.method300(); var101 != null; var101 = (class63) this.field360.method302(true)) {
                        var101.field1632 -= var82;
                        var101.field1633 -= var83;
                        if (var101.field1632 < 0 || var101.field1633 < 0 || var101.field1632 >= 104 || var101.field1633 >= 104) {
                            var101.method518();
                        }
                    }
                    if (this.field319 != 0) {
                        this.field319 -= var82;
                        this.field320 -= var83;
                    }
                    this.field352 = false;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 124) {
                    this.field192 = true;
                    int var102 = this.field474.method49();
                    class43 var103 = class43.method445(var102);
                    int var104 = this.field474.method49();
                    for (int var105 = 0; var105 < var104; ++var105) {
                        var103.field1177[var105] = this.field474.method75(true);
                        int var106 = this.field474.method67(-48149);
                        if (var106 == 255) {
                            var106 = this.field474.method81((byte) -12);
                        }
                        var103.field1229[var105] = var106;
                    }
                    for (int var107 = var104; var107 < var103.field1177.length; ++var107) {
                        var103.field1177[var107] = 0;
                        var103.field1229[var107] = 0;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 103) {
                    int var108 = this.field474.method75(true);
                    int var109 = this.field474.method73(6);
                    if (this.field183 != -1) {
                        this.method152(this.field183, (byte) 62);
                        this.field183 = -1;
                        this.field267 = true;
                    }
                    if (this.field455 != -1) {
                        this.method152(this.field455, (byte) 62);
                        this.field455 = -1;
                        this.field133 = true;
                    }
                    if (this.field446 != -1) {
                        this.method152(this.field446, (byte) 62);
                        this.field446 = -1;
                    }
                    if (this.field253 != var108) {
                        this.method152(this.field253, (byte) 62);
                        this.field253 = var108;
                    }
                    if (this.field409 != var109) {
                        this.method152(this.field409, (byte) 62);
                        this.field409 = var109;
                    }
                    if (this.field281 != 0) {
                        this.field281 = 0;
                        this.field267 = true;
                    }
                    this.field192 = true;
                    this.field280 = true;
                    this.field142 = false;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 170) {
                    int var110 = this.field474.method49();
                    int var111 = this.field474.method73(6);
                    int var112 = this.field474.method49();
                    int var113 = this.field474.method73(6);
                    class43.method445(var112).field1235 = var113;
                    class43.method445(var112).field1236 = var110;
                    class43.method445(var112).field1234 = var111;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 248) {
                    if (this.field580 == 12) {
                        this.field192 = true;
                    }
                    this.field470 = this.field474.method50();
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 73) {
                    int var114 = this.field474.method75(true);
                    this.method189(true, var114);
                    if (this.field409 != -1) {
                        this.method152(this.field409, (byte) 62);
                        this.field409 = -1;
                        this.field192 = true;
                        this.field280 = true;
                    }
                    if (this.field183 != -1) {
                        this.method152(this.field183, (byte) 62);
                        this.field183 = -1;
                        this.field267 = true;
                    }
                    if (this.field455 != -1) {
                        this.method152(this.field455, (byte) 62);
                        this.field455 = -1;
                        this.field133 = true;
                    }
                    if (this.field446 != -1) {
                        this.method152(this.field446, (byte) 62);
                        this.field446 = -1;
                    }
                    if (this.field253 != var114) {
                        this.method152(this.field253, (byte) 62);
                        this.field253 = var114;
                    }
                    if (this.field281 != 0) {
                        this.field281 = 0;
                        this.field267 = true;
                    }
                    this.field142 = false;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 240) {
                    this.field472 = this.field474.method47();
                    this.field192 = true;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 247) {
                    int var115 = this.field474.method74((byte) -99);
                    int var116 = this.field474.method82(7);
                    this.field194[var115] = var116;
                    if (this.field205[var115] != var116) {
                        this.field205[var115] = var116;
                        this.method172(var115, 0);
                        this.field192 = true;
                        if (this.field313 != -1) {
                            this.field267 = true;
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 4) {
                    this.field318 = this.field474.method73(6);
                    this.field226 = this.field474.method67(-48149);
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 149) {
                    for (int var117 = 0; var117 < this.field344.length; ++var117) {
                        if (this.field344[var117] != null) {
                            this.field344[var117].field698 = -1;
                        }
                    }
                    for (int var118 = 0; var118 < this.field170.length; ++var118) {
                        if (this.field170[var118] != null) {
                            this.field170[var118].field698 = -1;
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 101) {
                    int var119 = this.field474.method74((byte) -99);
                    int var120 = this.field474.method74((byte) -99);
                    int var121 = var119 >> 10 & 31;
                    int var122 = var119 >> 5 & 31;
                    int var123 = var119 & 31;
                    class43.method445(var120).field1237 = (var123 << 3) + (var121 << 19) + (var122 << 11);
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 74) {
                    long var124 = this.field474.method53((byte) 51);
                    int var126 = this.field474.method47();
                    String var127 = class51.method509(class51.method506(false, var124), true);
                    for (int var128 = 0; var128 < this.field471; ++var128) {
                        if (this.field297[var128] == var124) {
                            if (this.field390[var128] != var126) {
                                this.field390[var128] = var126;
                                this.field192 = true;
                                if (var126 > 0) {
                                    this.method267("", false, var127 + " has logged in.", 5);
                                }
                                if (var126 == 0) {
                                    this.method267("", false, var127 + " has logged out.", 5);
                                }
                            }
                            var127 = null;
                            break;
                        }
                    }
                    if (var127 != null && this.field471 < 200) {
                        this.field297[this.field471] = var124;
                        this.field453[this.field471] = var127;
                        this.field390[this.field471] = var126;
                        ++this.field471;
                        this.field192 = true;
                    }
                    boolean var129 = false;
                    while (!var129) {
                        var129 = true;
                        for (int var130 = 0; var130 < this.field471 - 1; ++var130) {
                            if (this.field390[var130] != field606 && this.field390[var130 + 1] == field606 || this.field390[var130] == 0 && this.field390[var130 + 1] != 0) {
                                int var131 = this.field390[var130];
                                this.field390[var130] = this.field390[var130 + 1];
                                this.field390[var130 + 1] = var131;
                                String var132 = this.field453[var130];
                                this.field453[var130] = this.field453[var130 + 1];
                                this.field453[var130 + 1] = var132;
                                long var133 = this.field297[var130];
                                this.field297[var130] = this.field297[var130 + 1];
                                this.field297[var130 + 1] = var133;
                                this.field192 = true;
                                var129 = false;
                            }
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 157) {
                    this.field319 = 0;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 116) {
                    if (this.field580 == 12) {
                        this.field192 = true;
                    }
                    this.field191 = this.field474.method47();
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 165) {
                    this.field219 = false;
                    this.field281 = 1;
                    this.field308 = "";
                    this.field267 = true;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 130) {
                    this.field192 = true;
                    int var135 = this.field474.method49();
                    class43 var136 = class43.method445(var135);
                    while (this.field474.field91 < this.field398) {
                        int var137 = this.field474.method61();
                        int var138 = this.field474.method49();
                        int var139 = this.field474.method47();
                        if (var139 == 255) {
                            var139 = this.field474.method52();
                        }
                        if (var137 >= 0 && var137 < var136.field1177.length) {
                            var136.field1177[var137] = var138;
                            var136.field1229[var137] = var139;
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 120) {
                    this.field580 = this.field474.method65(0);
                    this.field192 = true;
                    this.field280 = true;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 105) {
                    int var140 = this.field474.method47();
                    int var141 = this.field474.method47();
                    int var142 = this.field474.method47();
                    int var143 = this.field474.method47();
                    this.field361[var140] = true;
                    this.field193[var140] = var141;
                    this.field378[var140] = var142;
                    this.field444[var140] = var143;
                    this.field208[var140] = 0;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 166) {
                    int var144 = this.field474.method49();
                    class43.method445(var144).field1215 = 3;
                    if (field452.field930 == null) {
                        class43.method445(var144).field1216 = (field452.field923[11] << 5) + (field452.field923[8] << 10) + (field452.field923[0] << 15) + (field452.field928[0] << 25) + (field452.field928[4] << 20) + field452.field923[1];
                    } else {
                        class43.method445(var144).field1216 = (int) (field452.field930.field1730 + 305419896L);
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 197) {
                    this.field586 = this.field474.method74((byte) -99) * 30;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 200) {
                    this.field352 = false;
                    for (int var145 = 0; var145 < 5; ++var145) {
                        this.field361[var145] = false;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 162) {
                    if (this.field409 != -1) {
                        this.method152(this.field409, (byte) 62);
                        this.field409 = -1;
                        this.field192 = true;
                        this.field280 = true;
                    }
                    if (this.field183 != -1) {
                        this.method152(this.field183, (byte) 62);
                        this.field183 = -1;
                        this.field267 = true;
                    }
                    if (this.field455 != -1) {
                        this.method152(this.field455, (byte) 62);
                        this.field455 = -1;
                        this.field133 = true;
                    }
                    if (this.field446 != -1) {
                        this.method152(this.field446, (byte) 62);
                        this.field446 = -1;
                    }
                    if (this.field253 != -1) {
                        this.method152(this.field253, (byte) 62);
                        this.field253 = -1;
                    }
                    if (this.field281 != 0) {
                        this.field281 = 0;
                        this.field267 = true;
                    }
                    this.field142 = false;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 150) {
                    this.field192 = true;
                    int var146 = this.field474.method80((byte) 1);
                    int var147 = this.field474.method67(-48149);
                    int var148 = this.field474.method47();
                    this.field370[var147] = var146;
                    this.field462[var147] = var148;
                    this.field225[var147] = 1;
                    for (int var149 = 0; var149 < 98; ++var149) {
                        if (var146 >= field468[var149]) {
                            this.field225[var147] = var149 + 2;
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 212) {
                    int var150 = this.field474.method77((byte) 4);
                    if (var150 >= 0) {
                        this.method189(true, var150);
                    }
                    if (this.field181 != var150) {
                        this.method152(this.field181, (byte) 62);
                        this.field181 = var150;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 118) {
                    int var151 = this.field474.method65(0);
                    String var152 = this.field474.method54();
                    int var153 = this.field474.method66(2);
                    if (var153 >= 1 && var153 <= 5) {
                        if (var152.equalsIgnoreCase("null")) {
                            var152 = null;
                        }
                        this.field289[var153 - 1] = var152;
                        this.field290[var153 - 1] = var151 == 0;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 215) {
                    this.field561 = this.field474.method47();
                    if (this.field580 == this.field561) {
                        if (this.field561 == 3) {
                            this.field580 = 1;
                        } else {
                            this.field580 = 3;
                        }
                        this.field192 = true;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 183 || this.field399 == 152 || this.field399 == 25 || this.field399 == 1 || this.field399 == 143 || this.field399 == 99 || this.field399 == 201 || this.field399 == 174 || this.field399 == 39 || this.field399 == 128 || this.field399 == 168) {
                    this.method173(this.field474, (byte) 6, this.field399);
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 139) {
                    for (int var154 = 0; var154 < this.field205.length; ++var154) {
                        if (this.field205[var154] != this.field194[var154]) {
                            this.field205[var154] = this.field194[var154];
                            this.method172(var154, 0);
                            this.field192 = true;
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 221) {
                    this.field382 = this.field474.method47();
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 72) {
                    byte var155 = this.field474.method68((byte) -77);
                    int var156 = this.field474.method75(true);
                    this.field194[var156] = var155;
                    if (this.field205[var156] != var155) {
                        this.field205[var156] = var155;
                        this.method172(var156, 0);
                        this.field192 = true;
                        if (this.field313 != -1) {
                            this.field267 = true;
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 43) {
                    this.method212(27, this.field398, this.field474);
                    this.field243 = false;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 203) {
                    int var157 = this.field474.method74((byte) -99);
                    int var158 = this.field474.method75(true);
                    class43.method445(var158).field1215 = 1;
                    class43.method445(var158).field1216 = var157;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 13) {
                    this.field584 = this.field474.method47();
                    this.field246 = this.field474.method47();
                    this.field238 = this.field474.method47();
                    this.field125 = true;
                    this.field267 = true;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 146) {
                    int var159 = this.field474.method49();
                    boolean var160 = this.field474.method66(2) == 1;
                    class43.method445(var159).field1210 = var160;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 144) {
                    int var161 = this.field474.method73(6);
                    this.method189(true, var161);
                    if (this.field409 != -1) {
                        this.method152(this.field409, (byte) 62);
                        this.field409 = -1;
                        this.field192 = true;
                        this.field280 = true;
                    }
                    if (this.field455 != -1) {
                        this.method152(this.field455, (byte) 62);
                        this.field455 = -1;
                        this.field133 = true;
                    }
                    if (this.field446 != -1) {
                        this.method152(this.field446, (byte) 62);
                        this.field446 = -1;
                    }
                    if (this.field253 != -1) {
                        this.method152(this.field253, (byte) 62);
                        this.field253 = -1;
                    }
                    if (this.field183 != var161) {
                        this.method152(this.field183, (byte) 62);
                        this.field183 = var161;
                    }
                    this.field142 = false;
                    this.field267 = true;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 26) {
                    this.field219 = false;
                    this.field281 = 2;
                    this.field308 = "";
                    this.field267 = true;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 178) {
                    int var162 = this.field474.method74((byte) -99);
                    if (var162 == 65535) {
                        var162 = -1;
                    }
                    if (this.field235 != var162 && this.field278 && !field609 && this.field534 == 0) {
                        this.field138 = var162;
                        this.field139 = true;
                        this.field505.method556(2, this.field138);
                    }
                    this.field235 = var162;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 163) {
                    int var163 = this.field474.method78(false);
                    int var164 = this.field474.method73(6);
                    if (this.field278 && !field609) {
                        this.field138 = var164;
                        this.field139 = false;
                        this.field505.method556(2, this.field138);
                        this.field534 = var163;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 211) {
                    int var165 = this.field474.method49();
                    int var166 = this.field474.method73(6);
                    this.method189(true, var166);
                    if (var165 != -1) {
                        this.method189(true, var165);
                    }
                    if (this.field253 != -1) {
                        this.method152(this.field253, (byte) 62);
                        this.field253 = -1;
                    }
                    if (this.field409 != -1) {
                        this.method152(this.field409, (byte) 62);
                        this.field409 = -1;
                    }
                    if (this.field183 != -1) {
                        this.method152(this.field183, (byte) 62);
                        this.field183 = -1;
                    }
                    if (this.field455 != var166) {
                        this.method152(this.field455, (byte) 62);
                        this.field455 = var166;
                    }
                    if (this.field446 != var166) {
                        this.method152(this.field446, (byte) 62);
                        this.field446 = var165;
                    }
                    this.field281 = 0;
                    this.field142 = false;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 32) {
                    this.field310 = this.field474.method74((byte) -99);
                    this.field434 = this.field474.method81((byte) -12);
                    this.field124 = this.field474.method74((byte) -99);
                    this.field411 = this.field474.method75(true);
                    this.field227 = this.field474.method75(true);
                    this.field474.method67(-48149);
                    this.field504 = this.field474.method49();
                    this.field167 = this.field474.method73(6);
                    this.field268 = this.field474.method49();
                    this.field134 = this.field474.method74((byte) -99);
                    this.field474.method75(true);
                    signlink.dnslookup(class51.method508(this.field434, true));
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 190) {
                    int var167 = this.field474.method74((byte) -99);
                    int var168 = this.field474.method49();
                    int var169 = this.field474.method73(6);
                    if (var168 == 65535) {
                        class43.method445(var167).field1215 = 0;
                        this.field399 = -1;
                        return true;
                    }
                    class45 var170 = class45.method455(var168);
                    class43.method445(var167).field1215 = 4;
                    class43.method445(var167).field1216 = var168;
                    class43.method445(var167).field1235 = var170.field1250;
                    class43.method445(var167).field1236 = var170.field1275;
                    class43.method445(var167).field1234 = var170.field1260 * 100 / var169;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 154) {
                    long var171 = this.field474.method53((byte) 51);
                    int var173 = this.field474.method52();
                    int var174 = this.field474.method47();
                    boolean var175 = false;
                    for (int var176 = 0; var176 < 100; ++var176) {
                        if (this.field258[var176] == var173) {
                            var175 = true;
                            break;
                        }
                    }
                    if (var174 <= 1) {
                        for (int var177 = 0; var177 < this.field519; ++var177) {
                            if (this.field298[var177] == var171) {
                                var175 = true;
                                break;
                            }
                        }
                    }
                    if (!var175 && this.field602 == 0) {
                        try {
                            this.field258[this.field292] = var173;
                            this.field292 = (this.field292 + 1) % 100;
                            String var178 = class69.method590(3, this.field474, this.field398 - 13);
                            if (var174 != 3) {
                                var178 = class8.method96(0, var178);
                            }
                            if (var174 != 2 && var174 != 3) {
                                if (var174 == 1) {
                                    this.method267("@cr1@" + class51.method509(class51.method506(false, var171), true), false, var178, 7);
                                } else {
                                    this.method267(class51.method509(class51.method506(false, var171), true), false, var178, 3);
                                }
                            } else {
                                this.method267("@cr2@" + class51.method509(class51.method506(false, var171), true), false, var178, 7);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 186) {
                    int var180 = this.field474.method73(6);
                    int var181 = this.field474.method50();
                    class43 var182 = class43.method445(var180);
                    if (var182.field1191 != var181 || var181 == -1) {
                        var182.field1191 = var181;
                        var182.field1203 = 0;
                        var182.field1180 = 0;
                    }
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 112) {
                    int var183 = this.field474.method77((byte) 4);
                    if (this.field313 != var183) {
                        this.method152(this.field313, (byte) 62);
                        this.field313 = var183;
                    }
                    this.field267 = true;
                    this.field399 = -1;
                    return true;
                }
                if (this.field399 == 126) {
                    this.field552 = this.field474.method67(-48149);
                    this.field553 = this.field474.method47();
                    for (int var184 = this.field552; var184 < this.field552 + 8; ++var184) {
                        for (int var185 = this.field553; var185 < this.field553 + 8; ++var185) {
                            if (this.field136[this.field213][var184][var185] != null) {
                                this.field136[this.field213][var184][var185] = null;
                                this.method135(var184, var185);
                            }
                        }
                    }
                    for (class63 var186 = (class63) this.field360.method300(); var186 != null; var186 = (class63) this.field360.method302(true)) {
                        if (var186.field1632 >= this.field552 && var186.field1632 < this.field552 + 8 && var186.field1633 >= this.field553 && var186.field1633 < this.field553 + 8 && this.field213 == var186.field1630) {
                            var186.field1634 = 0;
                        }
                    }
                    this.field399 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field399 + "," + this.field398 + " - " + this.field526 + "," + this.field527);
                this.method167((byte) -84);
            } catch (IOException var191) {
                this.method201(-39300);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field399 + "," + this.field526 + "," + this.field527 + " - " + this.field398 + "," + (field452.field703[0] + this.field354) + "," + (field452.field704[0] + this.field355) + " - ";
                for (int var189 = 0; var189 < this.field398 && var189 < 50; ++var189) {
                    var188 = var188 + this.field474.field90[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method167((byte) -84);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Z")
    public final boolean method214(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public static final void method215(int arg0) {
        if (arg0 == 0) {
            class39.field1030 = false;
            class27.field858 = false;
            field609 = false;
            class64.field1659 = false;
            class48.field1452 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method216(int arg0) {
        if (this.field189 == arg0) {
            if (this.field454 == 0) {
                if (super.field1143 == 1) {
                    int var2 = super.field1144 - 25 - 550;
                    int var3 = super.field1145 - 5 - 4;
                    if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                        var2 -= 73;
                        var3 -= 75;
                        int var4 = this.field481 + this.field156 & 2047;
                        int var5 = class27.field867[var4];
                        int var6 = class27.field868[var4];
                        int var7 = (this.field311 + 256) * var5 >> 8;
                        int var8 = (this.field311 + 256) * var6 >> 8;
                        int var9 = var2 * var8 + var3 * var7 >> 11;
                        int var10 = var3 * var8 - var2 * var7 >> 11;
                        int var11 = field452.field706 + var9 >> 7;
                        int var12 = field452.field707 - var10 >> 7;
                        boolean var13 = this.method200(0, 0, 0, var11, field452.field704[0], 1, false, 0, field452.field703[0], true, 0, var12);
                        if (var13) {
                            this.field127.method37(var2);
                            this.field127.method37(var3);
                            this.field127.method38(this.field156);
                            this.field127.method37(57);
                            this.field127.method37(this.field481);
                            this.field127.method37(this.field311);
                            this.field127.method37(89);
                            this.field127.method38(field452.field706);
                            this.field127.method38(field452.field707);
                            this.field127.method37(this.field177);
                            this.field127.method37(63);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method217(int arg0) {
        if (arg0 != -12559) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field1143 == 1) {
            if (super.field1144 >= 539 && super.field1144 <= 573 && super.field1145 >= 169 && super.field1145 < 205 && this.field432[0] != -1) {
                this.field192 = true;
                this.field580 = 0;
                this.field280 = true;
            }
            if (super.field1144 >= 569 && super.field1144 <= 599 && super.field1145 >= 168 && super.field1145 < 205 && this.field432[1] != -1) {
                this.field192 = true;
                this.field580 = 1;
                this.field280 = true;
            }
            if (super.field1144 >= 597 && super.field1144 <= 627 && super.field1145 >= 168 && super.field1145 < 205 && this.field432[2] != -1) {
                this.field192 = true;
                this.field580 = 2;
                this.field280 = true;
            }
            if (super.field1144 >= 625 && super.field1144 <= 669 && super.field1145 >= 168 && super.field1145 < 203 && this.field432[3] != -1) {
                this.field192 = true;
                this.field580 = 3;
                this.field280 = true;
            }
            if (super.field1144 >= 666 && super.field1144 <= 696 && super.field1145 >= 168 && super.field1145 < 205 && this.field432[4] != -1) {
                this.field192 = true;
                this.field580 = 4;
                this.field280 = true;
            }
            if (super.field1144 >= 694 && super.field1144 <= 724 && super.field1145 >= 168 && super.field1145 < 205 && this.field432[5] != -1) {
                this.field192 = true;
                this.field580 = 5;
                this.field280 = true;
            }
            if (super.field1144 >= 722 && super.field1144 <= 756 && super.field1145 >= 169 && super.field1145 < 205 && this.field432[6] != -1) {
                this.field192 = true;
                this.field580 = 6;
                this.field280 = true;
            }
            if (super.field1144 >= 540 && super.field1144 <= 574 && super.field1145 >= 466 && super.field1145 < 502 && this.field432[7] != -1) {
                this.field192 = true;
                this.field580 = 7;
                this.field280 = true;
            }
            if (super.field1144 >= 572 && super.field1144 <= 602 && super.field1145 >= 466 && super.field1145 < 503 && this.field432[8] != -1) {
                this.field192 = true;
                this.field580 = 8;
                this.field280 = true;
            }
            if (super.field1144 >= 599 && super.field1144 <= 629 && super.field1145 >= 466 && super.field1145 < 503 && this.field432[9] != -1) {
                this.field192 = true;
                this.field580 = 9;
                this.field280 = true;
            }
            if (super.field1144 >= 627 && super.field1144 <= 671 && super.field1145 >= 467 && super.field1145 < 502 && this.field432[10] != -1) {
                this.field192 = true;
                this.field580 = 10;
                this.field280 = true;
            }
            if (super.field1144 >= 669 && super.field1144 <= 699 && super.field1145 >= 466 && super.field1145 < 503 && this.field432[11] != -1) {
                this.field192 = true;
                this.field580 = 11;
                this.field280 = true;
            }
            if (super.field1144 >= 696 && super.field1144 <= 726 && super.field1145 >= 466 && super.field1145 < 503 && this.field432[12] != -1) {
                this.field192 = true;
                this.field580 = 12;
                this.field280 = true;
            }
            if (super.field1144 >= 724 && super.field1144 <= 758 && super.field1145 >= 466 && super.field1145 < 502 && this.field432[13] != -1) {
                this.field192 = true;
                this.field580 = 13;
                this.field280 = true;
            }
            ++field502;
            if (field502 > 153) {
                field502 = 0;
                this.field127.method36(true, 155);
                this.field127.method37(114);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method218(int arg0) {
        if (arg0 != 9998) {
            this.field136 = null;
        }
        if (field609 && this.field314 == 2 && class64.field1647 != this.field213) {
            this.method168("Loading - please wait.", (String) null, this.field239);
            this.field314 = 1;
            this.field603 = System.currentTimeMillis();
        }
        if (this.field314 == 1) {
            int var2 = this.method219(335);
            if (var2 != 0 && System.currentTimeMillis() - this.field603 > 360000L) {
                signlink.reporterror(this.field380 + " glcfb " + this.field554 + "," + var2 + "," + field609 + "," + this.field282[0] + "," + this.field505.method552() + "," + this.field213 + "," + this.field450 + "," + this.field451);
                this.field603 = System.currentTimeMillis();
            }
        }
        if (this.field314 == 2 && this.field397 != this.field213) {
            this.field397 = this.field213;
            this.method204(-938, this.field213);
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)I")
    public final int method219(int arg0) {
        for (int var2 = 0; var2 < this.field182.length; ++var2) {
            if (this.field182[var2] == null && this.field420[var2] != -1) {
                return -1;
            }
            if (this.field467[var2] == null && this.field421[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field182.length; ++var4) {
            byte[] var5 = this.field467[var4];
            if (var5 != null) {
                int var6 = (this.field419[var4] >> 8) * 64 - this.field354;
                int var7 = (this.field419[var4] & 255) * 64 - this.field355;
                if (this.field551) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class64.method572(var7, this.field199, var5, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field243) {
            return -4;
        } else {
            this.field314 = 2;
            class64.field1647 = this.field213;
            if (arg0 <= 0) {
                return 0;
            } else {
                this.method183(-175);
                this.field127.method36(true, 233);
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method220(boolean arg0, int arg1) {
        if (!arg0) {
            this.field473 = 377;
        }
        if (!field609) {
            for (int var3 = 0; var3 < this.field469.length; ++var3) {
                int var4 = this.field469[var3];
                if (class27.field877[var4] >= arg1) {
                    class31 var5 = class27.field871[var4];
                    int var6 = var5.field916 * var5.field915 - 1;
                    int var7 = this.field220 * var5.field915 * 2;
                    byte[] var8 = var5.field913;
                    byte[] var9 = this.field550;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field913 = var9;
                    this.field550 = var8;
                    class27.method331((byte) 20, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZ)V")
    public final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.field188.method401(arg3, arg1, arg0);
        if (var7 != 0) {
            int var8 = this.field188.method405(arg3, arg1, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field321.field56;
            int var13 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class48 var15 = class48.method494(var14);
            if (var15.field1406 != -1) {
                class31 var16 = this.field485[var15.field1406];
                if (var16 != null) {
                    int var17 = (var15.field1429 * 4 - var16.field915) / 2;
                    int var18 = (var15.field1443 * 4 - var16.field916) / 2;
                    var16.method350((104 - arg0 - var15.field1443) * 4 + 48 + var18, (byte) 0, arg1 * 4 + 48 + var17);
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
        int var19 = this.field188.method403(arg3, arg1, arg0);
        if (!arg5) {
            field568 = !field568;
        }
        if (var19 != 0) {
            int var20 = this.field188.method405(arg3, arg1, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class48 var24 = class48.method494(var23);
            if (var24.field1406 != -1) {
                class31 var25 = this.field485[var24.field1406];
                if (var25 != null) {
                    int var26 = (var24.field1429 * 4 - var25.field915) / 2;
                    int var27 = (var24.field1443 * 4 - var25.field916) / 2;
                    var25.method350((104 - arg0 - var24.field1443) * 4 + 48 + var27, (byte) 0, arg1 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field321.field56;
                int var30 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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
        int var31 = this.field188.method404(arg3, arg1, arg0);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class48 var33 = class48.method494(var32);
            if (var33.field1406 != -1) {
                class31 var34 = this.field485[var33.field1406];
                if (var34 != null) {
                    int var35 = (var33.field1429 * 4 - var34.field915) / 2;
                    int var36 = (var33.field1443 * 4 - var34.field916) / 2;
                    var34.method350((104 - arg0 - var33.field1443) * 4 + 48 + var36, (byte) 0, arg1 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method222(byte arg0) {
        if (this.field509 == 2) {
            this.method185(this.field406 * 2, (this.field404 - this.field354 << 7) + this.field407, 2, (this.field405 - this.field355 << 7) + this.field408);
            if (arg0 != 72) {
                this.field189 = 347;
            }
            if (this.field335 > -1 && field396 % 20 < 10) {
                this.field435[0].method24(this.field336 - 28, (byte) 0, this.field335 - 12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method223(boolean arg0) {
        this.field244 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field140[var2] = -1;
            for (int var3 = 0; var3 < class18.field740; ++var3) {
                if (!class18.field741[var3].field747 && class18.field741[var3].field742 == var2 + (this.field373 ? 0 : 7)) {
                    this.field140[var2] = var3;
                    break;
                }
            }
        }
        if (arg0) {
            this.field560 = 44;
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public static final void method224(int arg0) {
        class39.field1030 = true;
        if (arg0 < 0) {
            class27.field858 = true;
            field609 = true;
            class64.field1659 = true;
            class48.field1452 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
    public final String method225(int arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
    public final int method226(boolean arg0) {
        int var2 = 3;
        if (!arg0) {
            return this.field473;
        } else {
            if (this.field287 < 310) {
                int var3 = this.field284 >> 7;
                int var4 = this.field286 >> 7;
                int var5 = field452.field706 >> 7;
                int var6 = field452.field707 >> 7;
                if ((this.field549[this.field213][var3][var4] & 4) != 0) {
                    var2 = this.field213;
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
                        if ((this.field549[this.field213][var3][var4] & 4) != 0) {
                            var2 = this.field213;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field549[this.field213][var3][var4] & 4) != 0) {
                                var2 = this.field213;
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
                        if ((this.field549[this.field213][var3][var4] & 4) != 0) {
                            var2 = this.field213;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field549[this.field213][var3][var4] & 4) != 0) {
                                var2 = this.field213;
                            }
                        }
                    }
                }
            }
            if ((this.field549[this.field213][field452.field706 >> 7][field452.field707 >> 7] & 4) != 0) {
                var2 = this.field213;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)I")
    public final int method227(int arg0) {
        while (arg0 >= 0) {
            this.field199 = 393;
        }
        int var2 = this.method159(this.field286, -70, this.field213, this.field284);
        if (var2 - this.field285 < 800 && (this.field549[this.field213][this.field284 >> 7][this.field286 >> 7] & 4) != 0) {
            return this.field213;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method228(int arg0) {
        if (this.field414 != 0) {
            int var2 = 0;
            if (this.field586 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field478[var3] != null) {
                    int var4 = this.field476[var3];
                    String var5 = this.field477[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field246 == 0 || this.field246 == 1 && this.method180(var5, (byte) 17))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1137 > 4 && super.field1138 - 4 > var9 - 10 && super.field1138 - 4 <= var9 + 3) {
                            int var10 = this.field300.method6(-754, "From:  " + var5 + this.field478[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1137 < var10 + 4) {
                                if (this.field296 >= 1) {
                                    this.field126[this.field449] = "Report abuse @whi@" + var5;
                                    this.field197[this.field449] = 2160;
                                    ++this.field449;
                                }
                                this.field126[this.field449] = "Add ignore @whi@" + var5;
                                this.field197[this.field449] = 2352;
                                ++this.field449;
                                this.field126[this.field449] = "Add friend @whi@" + var5;
                                this.field197[this.field449] = 2702;
                                ++this.field449;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field246 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 31518) {
                this.field127.method37(34);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILYSYPMZMO;II)V")
    public final void method229(int arg0, int arg1, class70 arg2, int arg3, int arg4) {
        if (this.field449 < 400) {
            if (arg2.field1722 != null) {
                arg2 = arg2.method599((byte) 2);
            }
            if (arg2 != null) {
                if (arg2.field1728) {
                    String var6 = arg2.field1721;
                    int var7 = 79 / arg3;
                    if (arg2.field1725 != 0) {
                        var6 = var6 + method197(arg2.field1725, field452.field935, 8) + " (level-" + arg2.field1725 + ")";
                    }
                    if (this.field364 == 1) {
                        this.field126[this.field449] = "Use " + this.field368 + " with @yel@" + var6;
                        this.field197[this.field449] = 669;
                        this.field198[this.field449] = arg1;
                        this.field195[this.field449] = arg4;
                        this.field196[this.field449] = arg0;
                        ++this.field449;
                    } else {
                        if (this.field440 == 1) {
                            if ((this.field442 & 2) == 2) {
                                this.field126[this.field449] = this.field443 + " @yel@" + var6;
                                this.field197[this.field449] = 533;
                                this.field198[this.field449] = arg1;
                                this.field195[this.field449] = arg4;
                                this.field196[this.field449] = arg0;
                                ++this.field449;
                                return;
                            }
                        } else {
                            if (arg2.field1735 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field1735[var8] != null && !arg2.field1735[var8].equalsIgnoreCase("attack")) {
                                        this.field126[this.field449] = arg2.field1735[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field197[this.field449] = 15;
                                        }
                                        if (var8 == 1) {
                                            this.field197[this.field449] = 271;
                                        }
                                        if (var8 == 2) {
                                            this.field197[this.field449] = 764;
                                        }
                                        if (var8 == 3) {
                                            this.field197[this.field449] = 410;
                                        }
                                        if (var8 == 4) {
                                            this.field197[this.field449] = 816;
                                        }
                                        this.field198[this.field449] = arg1;
                                        this.field195[this.field449] = arg4;
                                        this.field196[this.field449] = arg0;
                                        ++this.field449;
                                    }
                                }
                            }
                            if (arg2.field1735 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (arg2.field1735[var9] != null && arg2.field1735[var9].equalsIgnoreCase("attack")) {
                                        short var10 = 0;
                                        if (arg2.field1725 > field452.field935) {
                                            var10 = 2000;
                                        }
                                        this.field126[this.field449] = arg2.field1735[var9] + " @yel@" + var6;
                                        if (var9 == 0) {
                                            this.field197[this.field449] = var10 + 15;
                                        }
                                        if (var9 == 1) {
                                            this.field197[this.field449] = var10 + 271;
                                        }
                                        if (var9 == 2) {
                                            this.field197[this.field449] = var10 + 764;
                                        }
                                        if (var9 == 3) {
                                            this.field197[this.field449] = var10 + 410;
                                        }
                                        if (var9 == 4) {
                                            this.field197[this.field449] = var10 + 816;
                                        }
                                        this.field198[this.field449] = arg1;
                                        this.field195[this.field449] = arg4;
                                        this.field196[this.field449] = arg0;
                                        ++this.field449;
                                    }
                                }
                            }
                            this.field126[this.field449] = "Examine @yel@" + var6;
                            this.field197[this.field449] = 1020;
                            this.field198[this.field449] = arg1;
                            this.field195[this.field449] = arg4;
                            this.field196[this.field449] = arg0;
                            ++this.field449;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method230(int arg0) {
        this.field398 += arg0;
        if (this.field326 == 0) {
            int var2 = super.field1143;
            if (this.field440 == 1 && super.field1144 >= 516 && super.field1145 >= 160 && super.field1144 <= 765 && super.field1145 <= 205) {
                var2 = 0;
            }
            if (this.field456) {
                if (var2 != 1) {
                    int var3 = super.field1137;
                    int var4 = super.field1138;
                    if (this.field529 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field529 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field529 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field530 - 10 || var3 > this.field532 + this.field530 + 10 || var4 < this.field531 - 10 || var4 > this.field533 + this.field531 + 10) {
                        this.field456 = false;
                        if (this.field529 == 1) {
                            this.field192 = true;
                        }
                        if (this.field529 == 2) {
                            this.field267 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field530;
                    int var6 = this.field531;
                    int var7 = this.field532;
                    int var8 = super.field1144;
                    int var9 = super.field1145;
                    if (this.field529 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field529 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field529 == 2) {
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
                        this.method209(9, var10);
                    }
                    this.field456 = false;
                    if (this.field529 == 1) {
                        this.field192 = true;
                    }
                    if (this.field529 == 2) {
                        this.field267 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field449 > 0) {
                    int var13 = this.field197[this.field449 - 1];
                    if (var13 == 155 || var13 == 717 || var13 == 242 || var13 == 339 || var13 == 509 || var13 == 414 || var13 == 424 || var13 == 38 || var13 == 19 || var13 == 936 || var13 == 638 || var13 == 1455) {
                        int var14 = this.field195[this.field449 - 1];
                        int var15 = this.field196[this.field449 - 1];
                        class43 var16 = class43.method445(var15);
                        if (var16.field1194 || var16.field1201) {
                            this.field571 = false;
                            this.field204 = 0;
                            this.field324 = var15;
                            this.field325 = var14;
                            this.field326 = 2;
                            this.field327 = super.field1144;
                            this.field328 = super.field1145;
                            if (class43.method445(var15).field1184 == this.field253) {
                                this.field326 = 1;
                            }
                            if (class43.method445(var15).field1184 == this.field183) {
                                this.field326 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field173 == 1 || this.method170(this.field449 - 1, true)) && this.field449 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field449 > 0) {
                    this.method209(9, this.field449 - 1);
                }
                if (var2 != 2 || this.field449 <= 0) {
                    return;
                }
                this.method141(-944);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method231(boolean arg0, long arg1) {
        if (!arg0) {
            this.field332 = 373;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field471; ++var4) {
                if (this.field297[var4] == arg1) {
                    --this.field471;
                    this.field192 = true;
                    for (int var5 = var4; var5 < this.field471; ++var5) {
                        this.field453[var5] = this.field453[var5 + 1];
                        this.field390[var5] = this.field390[var5 + 1];
                        this.field297[var5] = this.field297[var5 + 1];
                    }
                    this.field127.method36(true, 44);
                    this.field127.method43(arg1, 3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILBISLJVZR;II)V")
    public final void method232(int arg0, class5 arg1, int arg2, int arg3) {
        if (arg1 != null) {
            int var5 = this.field481 + this.field156 & 2047;
            int var6 = arg2 * arg2 + arg3 * arg3;
            if (var6 <= 6400) {
                int var7 = class47.field1399[var5];
                int var8 = class47.field1400[var5];
                int var9 = var7 * 256 / (this.field311 + 256);
                if (arg0 != 30930) {
                    this.field403 = !this.field403;
                }
                int var10 = var8 * 256 / (this.field311 + 256);
                int var11 = arg2 * var9 + arg3 * var10 >> 16;
                int var12 = arg2 * var10 - arg3 * var9 >> 16;
                if (var6 > 2500) {
                    arg1.method30(var11 + 94 - arg1.field61 / 2 + 4, (byte) -105, this.field465, 83 - var12 - arg1.field62 / 2 - 4);
                } else {
                    arg1.method24(83 - var12 - arg1.field62 / 2 - 4, (byte) 0, var11 + 94 - arg1.field61 / 2 + 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method233(byte arg0) {
        if (!this.field520 && !this.field521 && !this.field184) {
            ++field480;
            if (arg0 != 84) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (!this.field322) {
                this.method254(-879, false);
            } else {
                this.method251((byte) 9);
            }
            this.field339 = 0;
        } else {
            this.method161((byte) 30);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQHGHUTGN;I)I")
    public final int method234(int arg0, class43 arg1, int arg2) {
        if (arg2 != 0) {
            this.field136 = null;
        }
        if (arg1.field1190 != null && arg0 < arg1.field1190.length) {
            try {
                int[] var4 = arg1.field1190[arg0];
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
                        var9 = this.field462[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field225[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field370[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class43 var11 = class43.method445(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class45.field1244 && (!class45.method455(var12).field1280 || field608)) {
                            for (int var13 = 0; var13 < var11.field1177.length; ++var13) {
                                if (var12 + 1 == var11.field1177[var13]) {
                                    var9 += var11.field1229[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field205[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field468[this.field225[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field205[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field452.field935;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class59.field1556; ++var14) {
                            if (class59.field1558[var14]) {
                                var9 += this.field225[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class43 var15 = class43.method445(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class45.field1244 && (!class45.method455(var16).field1280 || field608)) {
                            for (int var17 = 0; var17 < var15.field1177.length; ++var17) {
                                if (var15.field1177[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field191;
                    }
                    if (var8 == 12) {
                        var9 = this.field470;
                    }
                    if (var8 == 13) {
                        int var18 = this.field205[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class12 var21 = class12.field653[var20];
                        int var22 = var21.field655;
                        int var23 = var21.field656;
                        int var24 = var21.field657;
                        int var25 = field304[var24 - var23];
                        var9 = this.field205[var22] >> var23 & var25;
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
                        var9 = (field452.field706 >> 7) + this.field354;
                    }
                    if (var8 == 19) {
                        var9 = (field452.field707 >> 7) + this.field355;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)Z")
    public final boolean method235(boolean arg0, byte[] arg1, int arg2) {
        this.field322 &= arg0;
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method236(int arg0) {
        if (arg0 <= 0) {
            this.field399 = this.field474.method47();
        }
        while (true) {
            class24 var2 = this.field505.method551();
            if (var2 == null) {
                return;
            }
            if (var2.field837 == 0) {
                class47.method464(var2.field838, (byte) 4, var2.field834);
                if ((this.field505.method539(var2.field838, -90) & 98) != 0) {
                    this.field192 = true;
                    if (this.field183 != -1 || this.field313 != -1) {
                        this.field267 = true;
                    }
                }
            }
            if (var2.field837 == 1 && var2.field834 != null) {
                class67.method583(var2.field834, (byte) -75);
            }
            if (var2.field837 == 2 && this.field138 == var2.field838 && var2.field834 != null) {
                this.method269(this.field139, var2.field834, 0);
            }
            if (var2.field837 == 3 && this.field314 == 1) {
                for (int var3 = 0; var3 < this.field182.length; ++var3) {
                    if (this.field420[var3] == var2.field838) {
                        this.field182[var3] = var2.field834;
                        if (var2.field834 == null) {
                            this.field420[var3] = -1;
                        }
                        break;
                    }
                    if (this.field421[var3] == var2.field838) {
                        this.field467[var3] = var2.field834;
                        if (var2.field834 == null) {
                            this.field421[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field837 == 93 && this.field505.method546(0, var2.field838)) {
                class64.method563(new class7(var2.field834, (byte) 3), true, this.field505);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method237(boolean arg0) {
        class46 var2 = (class46) this.field597.method300();
        if (arg0) {
            while (var2 != null) {
                if (this.field213 == var2.field1315 && field396 <= var2.field1301) {
                    if (field396 >= var2.field1300) {
                        if (var2.field1314 > 0) {
                            class53 var3 = this.field170[var2.field1314 - 1];
                            if (var3 != null && var3.field706 >= 0 && var3.field706 < 13312 && var3.field707 >= 0 && var3.field707 < 13312) {
                                var2.method460(this.method159(var3.field707, -70, var2.field1315, var3.field706) - var2.field1319, var3.field706, var3.field707, field396, (byte) 48);
                            }
                        }
                        if (var2.field1314 < 0) {
                            int var4 = -var2.field1314 - 1;
                            class32 var5;
                            if (this.field318 == var4) {
                                var5 = field452;
                            } else {
                                var5 = this.field344[var4];
                            }
                            if (var5 != null && var5.field706 >= 0 && var5.field706 < 13312 && var5.field707 >= 0 && var5.field707 < 13312) {
                                var2.method460(this.method159(var5.field707, -70, var2.field1315, var5.field706) - var2.field1319, var5.field706, var5.field707, field396, (byte) 48);
                            }
                        }
                        var2.method461(this.field220, (byte) 4);
                        this.field188.method386(var2, (byte) -123, this.field213, var2.field1298, false, -1, (int) var2.field1323, 60, (int) var2.field1322, (int) var2.field1321);
                    }
                } else {
                    var2.method518();
                }
                var2 = (class46) this.field597.method302(true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
    public final void method238(int arg0, int arg1, boolean arg2) {
        if (arg0 != 0) {
            this.field503 = !this.field503;
        }
        signlink.midivol = arg1;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method239(int arg0) {
        int var2 = this.field530;
        int var3 = this.field531;
        int var4 = this.field532;
        int var5 = this.field533;
        int var6 = 6116423;
        class58.method528(this.field234, var4, var3, var2, var5, var6);
        class58.method528(this.field234, var4 - 2, var3 + 1, var2 + 1, 16, 0);
        class58.method529(var4 - 2, var5 - 19, 42741, var3 + 18, 0, var2 + 1);
        int var7 = 64 / arg0;
        this.field301.method8(var2 + 3, "Choose Option", var3 + 14, var6, (byte) 27);
        int var8 = super.field1137;
        int var9 = super.field1138;
        if (this.field529 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (this.field529 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (this.field529 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < this.field449; ++var10) {
            int var11 = (this.field449 - 1 - var10) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var8 > var2 && var8 < var2 + var4 && var9 > var11 - 13 && var9 < var11 + 3) {
                var12 = 16776960;
            }
            this.field301.method12(var2 + 3, true, var11, this.field126[var10], var12, 32048);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method240(boolean arg0) {
        this.field212 = false;
        while (this.field510) {
            this.field212 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field210 = null;
        this.field211 = null;
        this.field388 = null;
        this.field269 = null;
        this.field270 = null;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field271 = null;
        this.field272 = null;
        this.field276 = null;
        this.field277 = null;
        this.field598 = null;
        this.field599 = null;
        this.field274 = null;
        this.field275 = null;
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQHGHUTGN;Z)V")
    public final void method241(class43 arg0, boolean arg1) {
        int var3 = arg0.field1193;
        if (arg1) {
            this.field403 = !this.field403;
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field472 == 0) {
                arg0.field1183 = "Loading friend list";
                arg0.field1233 = 0;
            } else if (var3 == 1 && this.field472 == 1) {
                arg0.field1183 = "Connecting to friendserver";
                arg0.field1233 = 0;
            } else if (var3 == 2 && this.field472 != 2) {
                arg0.field1183 = "Please wait...";
                arg0.field1233 = 0;
            } else {
                int var4 = this.field471;
                if (this.field472 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field1183 = "";
                    arg0.field1233 = 0;
                } else {
                    arg0.field1183 = this.field453[var3];
                    arg0.field1233 = 1;
                }
            }
        } else if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
            if (var3 == 203) {
                int var6 = this.field471;
                if (this.field472 != 2) {
                    var6 = 0;
                }
                arg0.field1188 = var6 * 15 + 20;
                if (arg0.field1188 <= arg0.field1206) {
                    arg0.field1188 = arg0.field1206 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field472 == 0) {
                    arg0.field1183 = "Loading ignore list";
                    arg0.field1233 = 0;
                } else if (var3 == 1 && this.field472 == 0) {
                    arg0.field1183 = "Please wait...";
                    arg0.field1233 = 0;
                } else {
                    int var7 = this.field519;
                    if (this.field472 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field1183 = "";
                        arg0.field1233 = 0;
                    } else {
                        arg0.field1183 = class51.method509(class51.method506(false, this.field298[var3]), true);
                        arg0.field1233 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field1188 = this.field519 * 15 + 20;
                if (arg0.field1188 <= arg0.field1206) {
                    arg0.field1188 = arg0.field1206 + 1;
                }
            } else if (var3 == 327) {
                arg0.field1235 = 150;
                arg0.field1236 = (int) (Math.sin((double) field396 / 40.0D) * 256.0D) & 2047;
                if (this.field244) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field140[var8];
                        if (var15 >= 0 && !class18.field741[var15].method312(539)) {
                            return;
                        }
                    }
                    this.field244 = false;
                    class47[] var9 = new class47[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field140[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class18.field741[var14].method313(true);
                        }
                    }
                    class47 var12 = new class47(var10, var9, 118);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field582[var13] != 0) {
                            var12.method480(field413[var13][0], field413[var13][this.field582[var13]]);
                            if (var13 == 1) {
                                var12.method480(field508[0], field508[this.field582[var13]]);
                            }
                        }
                    }
                    var12.method473(8);
                    var12.method474(-770, class29.field887[field452.field696].field889[0]);
                    var12.method483(64, 850, -30, -50, -30, true);
                    arg0.field1215 = 5;
                    arg0.field1216 = 0;
                    class43.method442(var12, 0, true, 5);
                }
            } else if (var3 == 324) {
                if (this.field457 == null) {
                    this.field457 = arg0.field1199;
                    this.field458 = arg0.field1196;
                }
                if (this.field373) {
                    arg0.field1199 = this.field458;
                } else {
                    arg0.field1199 = this.field457;
                }
            } else if (var3 == 325) {
                if (this.field457 == null) {
                    this.field457 = arg0.field1199;
                    this.field458 = arg0.field1196;
                }
                if (this.field373) {
                    arg0.field1199 = this.field457;
                } else {
                    arg0.field1199 = this.field458;
                }
            } else if (var3 == 600) {
                arg0.field1183 = this.field187;
                if (field396 % 20 < 10) {
                    arg0.field1183 = arg0.field1183 + "|";
                } else {
                    arg0.field1183 = arg0.field1183 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field296 >= 1) {
                        if (this.field200) {
                            arg0.field1237 = 16711680;
                            arg0.field1183 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1237 = 16777215;
                            arg0.field1183 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1183 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field504 - this.field310;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg0.field1183 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field167 == 0) {
                        arg0.field1183 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field167 <= this.field504) {
                        arg0.field1183 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method242(this.field167, (byte) -2);
                    } else {
                        int var18 = this.field504 + 14 - this.field167;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg0.field1183 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method242(this.field167, (byte) -2) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field134 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field134 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field134 + " unread messages";
                    }
                    arg0.field1183 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field268 > 0 && this.field268 <= this.field504 + 10) {
                        arg0.field1183 = "Last password change:\\n@gre@" + this.method242(this.field268, (byte) -2);
                    } else {
                        arg0.field1183 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field124 > 2 && !field608) {
                        arg0.field1183 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field124 > 2) {
                        arg0.field1183 = "\\n\\nYou have @gre@" + this.field124 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field124 > 0) {
                        arg0.field1183 = "You have @gre@" + this.field124 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field1183 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field124 > 2 && !field608) {
                        arg0.field1183 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field124 > 0) {
                        arg0.field1183 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field1183 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field167 > this.field504) {
                        arg0.field1183 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field1183 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else {
            int var5 = this.field471;
            if (this.field472 != 2) {
                var5 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var5) {
                arg0.field1183 = "";
                arg0.field1233 = 0;
            } else {
                if (this.field390[var3] == 0) {
                    arg0.field1183 = "@red@Offline";
                } else if (this.field390[var3] < 200) {
                    if (this.field390[var3] == field606) {
                        arg0.field1183 = "@gre@World" + (this.field390[var3] - 9);
                    } else {
                        arg0.field1183 = "@yel@World" + (this.field390[var3] - 9);
                    }
                } else if (this.field390[var3] == field606) {
                    arg0.field1183 = "@gre@Classic" + (this.field390[var3] - 219);
                } else {
                    arg0.field1183 = "@yel@Classic" + (this.field390[var3] - 219);
                }
                arg0.field1233 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
    public final String method242(int arg0, byte arg1) {
        if (arg0 > this.field504 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            if (arg1 != -2) {
                this.field392 = 179;
            }
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)Ljava/lang/String;")
    private static final String method243(int arg0, byte arg1) {
        if (arg1 == 9) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        String var4 = String.valueOf(arg0);
        for (int var5 = var4.length() - 3; var5 > 0; var5 -= 3) {
            var4 = var4.substring(0, var5) + "," + var4.substring(var5);
        }
        if (var4.length() > 8) {
            var4 = "@gre@" + var4.substring(0, var4.length() - 8) + " million @whi@(" + var4 + ")";
        } else if (var4.length() > 4) {
            var4 = "@cya@" + var4.substring(0, var4.length() - 4) + "K @whi@(" + var4 + ")";
        }
        return " " + var4;
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method244(int arg0) {
        for (int var2 = 0; var2 < this.field171; ++var2) {
            int var3 = this.field172[var2];
            class53 var4 = this.field170[var3];
            if (var4 != null) {
                this.method245(var4.field1508.field1718, -6841, var4);
            }
        }
        if (arg0 <= 0) {
            field135 = !field135;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILFSZDVUBI;)V")
    public final void method245(int arg0, int arg1, class17 arg2) {
        if (arg2.field706 < 128 || arg2.field707 < 128 || arg2.field706 >= 13184 || arg2.field707 >= 13184) {
            arg2.field698 = -1;
            arg2.field728 = -1;
            arg2.field691 = 0;
            arg2.field692 = 0;
            arg2.field706 = arg2.field703[0] * 128 + arg2.field682 * 64;
            arg2.field707 = arg2.field704[0] * 128 + arg2.field682 * 64;
            arg2.method306((byte) 6);
        }
        if (field452 == arg2 && (arg2.field706 < 1536 || arg2.field707 < 1536 || arg2.field706 >= 11776 || arg2.field707 >= 11776)) {
            arg2.field698 = -1;
            arg2.field728 = -1;
            arg2.field691 = 0;
            arg2.field692 = 0;
            arg2.field706 = arg2.field703[0] * 128 + arg2.field682 * 64;
            arg2.field707 = arg2.field704[0] * 128 + arg2.field682 * 64;
            arg2.method306((byte) 6);
        }
        if (arg2.field691 > field396) {
            this.method246(5, arg2);
        } else if (arg2.field692 >= field396) {
            this.method247(arg2, this.field403);
        } else {
            this.method248(arg2, (byte) -115);
        }
        this.method249(-959, arg2);
        this.method250(arg2, (byte) -114);
        if (arg1 != -6841) {
            this.field242 = this.field309.method587();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILFSZDVUBI;)V")
    public final void method246(int arg0, class17 arg1) {
        int var3 = arg1.field691 - field396;
        int var4 = arg1.field687 * 128 + arg1.field682 * 64;
        int var5 = arg1.field689 * 128 + arg1.field682 * 64;
        arg1.field706 += (var4 - arg1.field706) / var3;
        arg1.field707 += (var5 - arg1.field707) / var3;
        arg1.field694 = 0;
        if (arg0 != 5) {
            this.method128();
        }
        if (arg1.field693 == 0) {
            arg1.field717 = 1024;
        }
        if (arg1.field693 == 1) {
            arg1.field717 = 1536;
        }
        if (arg1.field693 == 2) {
            arg1.field717 = 0;
        }
        if (arg1.field693 == 3) {
            arg1.field717 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFSZDVUBI;Z)V")
    public final void method247(class17 arg0, boolean arg1) {
        if (arg1) {
            this.field560 = -416;
        }
        if (field396 == arg0.field692 || arg0.field698 == -1 || arg0.field701 != 0 || arg0.field700 + 1 > class29.field887[arg0.field698].method342(arg0.field699, this.field412)) {
            int var3 = arg0.field692 - arg0.field691;
            int var4 = field396 - arg0.field691;
            int var5 = arg0.field687 * 128 + arg0.field682 * 64;
            int var6 = arg0.field689 * 128 + arg0.field682 * 64;
            int var7 = arg0.field688 * 128 + arg0.field682 * 64;
            int var8 = arg0.field690 * 128 + arg0.field682 * 64;
            arg0.field706 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field707 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field694 = 0;
        if (arg0.field693 == 0) {
            arg0.field717 = 1024;
        }
        if (arg0.field693 == 1) {
            arg0.field717 = 1536;
        }
        if (arg0.field693 == 2) {
            arg0.field717 = 0;
        }
        if (arg0.field693 == 3) {
            arg0.field717 = 512;
        }
        arg0.field708 = arg0.field717;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFSZDVUBI;B)V")
    public final void method248(class17 arg0, byte arg1) {
        arg0.field723 = arg0.field696;
        if (arg0.field705 == 0) {
            arg0.field694 = 0;
        } else {
            if (arg0.field698 != -1 && arg0.field701 == 0) {
                class29 var3 = class29.field887[arg0.field698];
                if (arg0.field710 > 0 && var3.field899 == 0) {
                    ++arg0.field694;
                    return;
                }
                if (arg0.field710 <= 0 && var3.field900 == 0) {
                    ++arg0.field694;
                    return;
                }
            }
            int var4 = arg0.field706;
            int var5 = arg0.field707;
            int var6 = arg0.field703[arg0.field705 - 1] * 128 + arg0.field682 * 64;
            int var7 = arg0.field704[arg0.field705 - 1] * 128 + arg0.field682 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field717 = 1280;
                    } else if (var5 > var7) {
                        arg0.field717 = 1792;
                    } else {
                        arg0.field717 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field717 = 768;
                    } else if (var5 > var7) {
                        arg0.field717 = 256;
                    } else {
                        arg0.field717 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field717 = 1024;
                } else {
                    arg0.field717 = 0;
                }
                int var8 = arg0.field717 - arg0.field708 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field684;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field683;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field686;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field685;
                }
                if (var9 == -1) {
                    var9 = arg0.field683;
                }
                arg0.field723 = var9;
                int var10 = 4;
                if (this.field168 == arg1) {
                    if (arg0.field717 != arg0.field708 && arg0.field718 == -1 && arg0.field726 != 0) {
                        var10 = 2;
                    }
                    if (arg0.field705 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field705 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field694 > 0 && arg0.field705 > 1) {
                        var10 = 8;
                        --arg0.field694;
                    }
                    if (arg0.field719[arg0.field705 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field723 == arg0.field683 && arg0.field727 != -1) {
                        arg0.field723 = arg0.field727;
                    }
                    if (var4 < var6) {
                        arg0.field706 += var10;
                        if (arg0.field706 > var6) {
                            arg0.field706 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field706 -= var10;
                        if (arg0.field706 < var6) {
                            arg0.field706 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field707 += var10;
                        if (arg0.field707 > var7) {
                            arg0.field707 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field707 -= var10;
                        if (arg0.field707 < var7) {
                            arg0.field707 = var7;
                        }
                    }
                    if (arg0.field706 == var6 && arg0.field707 == var7) {
                        --arg0.field705;
                        if (arg0.field710 > 0) {
                            --arg0.field710;
                            return;
                        }
                    }
                }
            } else {
                arg0.field706 = var6;
                arg0.field707 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILFSZDVUBI;)V")
    public final void method249(int arg0, class17 arg1) {
        while (arg0 >= 0) {
            this.field399 = -1;
        }
        if (arg1.field726 != 0) {
            if (arg1.field718 != -1 && arg1.field718 < 32768) {
                class53 var3 = this.field170[arg1.field718];
                if (var3 != null) {
                    int var4 = arg1.field706 - var3.field706;
                    int var5 = arg1.field707 - var3.field707;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field717 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field718 >= 32768) {
                int var6 = arg1.field718 - 32768;
                if (this.field318 == var6) {
                    var6 = this.field343;
                }
                class32 var7 = this.field344[var6];
                if (var7 != null) {
                    int var8 = arg1.field706 - var7.field706;
                    int var9 = arg1.field707 - var7.field707;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field717 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field713 != 0 || arg1.field714 != 0) && (arg1.field705 == 0 || arg1.field694 > 0)) {
                int var10 = arg1.field706 - (arg1.field713 - this.field354 - this.field354) * 64;
                int var11 = arg1.field707 - (arg1.field714 - this.field355 - this.field355) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field717 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field713 = 0;
                arg1.field714 = 0;
            }
            int var12 = arg1.field717 - arg1.field708 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field726 && var12 <= 2048 - arg1.field726) {
                    if (var12 > 1024) {
                        arg1.field708 -= arg1.field726;
                    } else {
                        arg1.field708 += arg1.field726;
                    }
                } else {
                    arg1.field708 = arg1.field717;
                }
                arg1.field708 &= 2047;
                if (arg1.field723 == arg1.field696 && arg1.field717 != arg1.field708) {
                    if (arg1.field697 != -1) {
                        arg1.field723 = arg1.field697;
                        return;
                    }
                    arg1.field723 = arg1.field683;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LFSZDVUBI;B)V")
    public final void method250(class17 arg0, byte arg1) {
        if (arg1 == -114) {
            arg0.field695 = false;
            if (arg0.field723 != -1) {
                class29 var3 = class29.field887[arg0.field723];
                ++arg0.field725;
                if (arg0.field724 < var3.field888 && arg0.field725 > var3.method342(arg0.field724, this.field412)) {
                    arg0.field725 = 1;
                    ++arg0.field724;
                }
                if (arg0.field724 >= var3.field888) {
                    arg0.field725 = 1;
                    arg0.field724 = 0;
                }
            }
            if (arg0.field728 != -1 && field396 >= arg0.field731) {
                if (arg0.field729 < 0) {
                    arg0.field729 = 0;
                }
                class29 var4 = class37.field991[arg0.field728].field995;
                ++arg0.field730;
                if (arg0.field729 < var4.field888 && arg0.field730 > var4.method342(arg0.field729, this.field412)) {
                    arg0.field730 = 1;
                    ++arg0.field729;
                }
                if (arg0.field729 >= var4.field888 && (arg0.field729 < 0 || arg0.field729 >= var4.field888)) {
                    arg0.field728 = -1;
                }
            }
            if (arg0.field698 != -1 && arg0.field701 <= 1) {
                class29 var5 = class29.field887[arg0.field698];
                if (var5.field899 == 1 && arg0.field710 > 0 && arg0.field691 <= field396 && arg0.field692 < field396) {
                    arg0.field701 = 1;
                    return;
                }
            }
            if (arg0.field698 != -1 && arg0.field701 == 0) {
                class29 var6 = class29.field887[arg0.field698];
                ++arg0.field700;
                if (arg0.field699 < var6.field888 && arg0.field700 > var6.method342(arg0.field699, this.field412)) {
                    arg0.field700 = 1;
                    ++arg0.field699;
                }
                if (arg0.field699 >= var6.field888) {
                    arg0.field699 -= var6.field892;
                    ++arg0.field702;
                    if (arg0.field702 >= var6.field898) {
                        arg0.field698 = -1;
                    }
                    if (arg0.field699 < 0 || arg0.field699 >= var6.field888) {
                        arg0.field698 = -1;
                    }
                }
                arg0.field695 = var6.field894;
            }
            if (arg0.field701 > 0) {
                --arg0.field701;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method251(byte arg0) {
        if (this.field455 != -1 && (this.field314 == 2 || super.field1130 != null)) {
            if (this.field314 == 2) {
                this.method169(this.field220, this.field455, 0);
                if (this.field446 != -1) {
                    this.method169(this.field220, this.field446, 0);
                }
                this.field220 = 0;
                this.method177((byte) 90);
                super.field1130.method321(this.field499);
                class27.field869 = this.field250;
                class58.method526(30983);
                this.field133 = true;
                class43 var2 = class43.method445(this.field455);
                if (var2.field1227 == 512 && var2.field1206 == 334 && var2.field1204 == 0) {
                    var2.field1227 = 765;
                    var2.field1206 = 503;
                }
                this.method166(0, 0, var2, 7, 0);
                if (this.field446 != -1) {
                    class43 var3 = class43.method445(this.field446);
                    if (var3.field1227 == 512 && var3.field1206 == 334 && var3.field1204 == 0) {
                        var3.field1227 = 765;
                        var3.field1206 = 503;
                    }
                    this.method166(0, 0, var3, 7, 0);
                }
                if (!this.field456) {
                    this.method171(616);
                    this.method190((byte) 0);
                } else {
                    this.method239(120);
                }
            }
            super.field1130.method322(0, super.field1129, 0, (byte) -47);
        } else {
            if (this.field133) {
                this.method127(895);
                this.field133 = false;
                this.field587.method322(4, super.field1129, 0, (byte) -47);
                this.field588.method322(357, super.field1129, 0, (byte) -47);
                this.field589.method322(4, super.field1129, 722, (byte) -47);
                this.field590.method322(205, super.field1129, 743, (byte) -47);
                this.field591.method322(0, super.field1129, 0, (byte) -47);
                this.field592.method322(4, super.field1129, 516, (byte) -47);
                this.field593.method322(205, super.field1129, 516, (byte) -47);
                this.field594.method322(357, super.field1129, 496, (byte) -47);
                this.field595.method322(338, super.field1129, 0, (byte) -47);
                this.field192 = true;
                this.field267 = true;
                this.field280 = true;
                this.field125 = true;
                if (this.field314 != 2) {
                    this.field547.method322(4, super.field1129, 4, (byte) -47);
                    this.field546.method322(4, super.field1129, 550, (byte) -47);
                }
            }
            if (this.field314 == 2) {
                this.method262(729);
            }
            if (this.field456 && this.field529 == 1) {
                this.field192 = true;
            }
            if (this.field409 != -1) {
                boolean var4 = this.method169(this.field220, this.field409, 0);
                if (var4) {
                    this.field192 = true;
                }
            }
            if (this.field164 == 2) {
                this.field192 = true;
            }
            if (this.field326 == 2) {
                this.field192 = true;
            }
            if (this.field192) {
                this.method151(711);
                this.field192 = false;
            }
            ++field228;
            if (field228 > 179) {
                field228 = 0;
                this.field127.method36(true, 73);
                this.field127.method41(0);
            }
            if (this.field183 == -1 && this.field281 == 0) {
                this.field295.field1195 = this.field236 - this.field128 - 77;
                if (super.field1137 > 448 && super.field1137 < 560 && super.field1138 > 332) {
                    this.method162(super.field1138 - 357, -1, super.field1137 - 17, this.field295, 463, this.field236, 0, 77, 0);
                }
                int var5 = this.field236 - 77 - this.field295.field1195;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field236 - 77) {
                    var5 = this.field236 - 77;
                }
                if (this.field128 != var5) {
                    this.field128 = var5;
                    this.field267 = true;
                }
            }
            if (this.field183 == -1 && this.field281 == 3) {
                int var6 = this.field215 * 14 + 7;
                this.field295.field1195 = this.field218;
                if (super.field1137 > 448 && super.field1137 < 560 && super.field1138 > 332) {
                    this.method162(super.field1138 - 357, -1, super.field1137 - 17, this.field295, 463, var6, 0, 77, 0);
                }
                int var7 = this.field295.field1195;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field218 != var7) {
                    this.field218 = var7;
                    this.field267 = true;
                }
            }
            if (this.field183 != -1) {
                boolean var8 = this.method169(this.field220, this.field183, 0);
                if (var8) {
                    this.field267 = true;
                }
            }
            if (this.field164 == 3) {
                this.field267 = true;
            }
            if (this.field326 == 3) {
                this.field267 = true;
            }
            if (this.field245 != null) {
                this.field267 = true;
            }
            if (this.field456 && this.field529 == 2) {
                this.field267 = true;
            }
            if (this.field267) {
                this.method146(-574);
                this.field267 = false;
            }
            if (this.field314 == 2) {
                this.method125(-7092);
                this.field546.method322(4, super.field1129, 550, (byte) -47);
            }
            if (this.field561 != -1) {
                this.field280 = true;
            }
            if (this.field280) {
                if (this.field561 != -1 && this.field580 == this.field561) {
                    this.field561 = -1;
                    this.field127.method36(true, 97);
                    this.field127.method37(this.field580);
                }
                this.field280 = false;
                this.field261.method321(this.field499);
                this.field231.method350(0, (byte) 0, 0);
                if (this.field409 == -1) {
                    if (this.field432[this.field580] != -1) {
                        if (this.field580 == 0) {
                            this.field486.method350(10, (byte) 0, 22);
                        }
                        if (this.field580 == 1) {
                            this.field487.method350(8, (byte) 0, 54);
                        }
                        if (this.field580 == 2) {
                            this.field487.method350(8, (byte) 0, 82);
                        }
                        if (this.field580 == 3) {
                            this.field488.method350(8, (byte) 0, 110);
                        }
                        if (this.field580 == 4) {
                            this.field490.method350(8, (byte) 0, 153);
                        }
                        if (this.field580 == 5) {
                            this.field490.method350(8, (byte) 0, 181);
                        }
                        if (this.field580 == 6) {
                            this.field489.method350(9, (byte) 0, 209);
                        }
                    }
                    if (this.field432[0] != -1 && (this.field561 != 0 || field396 % 20 < 10)) {
                        this.field317[0].method350(13, (byte) 0, 29);
                    }
                    if (this.field432[1] != -1 && (this.field561 != 1 || field396 % 20 < 10)) {
                        this.field317[1].method350(11, (byte) 0, 53);
                    }
                    if (this.field432[2] != -1 && (this.field561 != 2 || field396 % 20 < 10)) {
                        this.field317[2].method350(11, (byte) 0, 82);
                    }
                    if (this.field432[3] != -1 && (this.field561 != 3 || field396 % 20 < 10)) {
                        this.field317[3].method350(12, (byte) 0, 115);
                    }
                    if (this.field432[4] != -1 && (this.field561 != 4 || field396 % 20 < 10)) {
                        this.field317[4].method350(13, (byte) 0, 153);
                    }
                    if (this.field432[5] != -1 && (this.field561 != 5 || field396 % 20 < 10)) {
                        this.field317[5].method350(11, (byte) 0, 180);
                    }
                    if (this.field432[6] != -1 && (this.field561 != 6 || field396 % 20 < 10)) {
                        this.field317[6].method350(13, (byte) 0, 208);
                    }
                }
                this.field261.method322(160, super.field1129, 516, (byte) -47);
                this.field260.method321(this.field499);
                this.field230.method350(0, (byte) 0, 0);
                if (this.field409 == -1) {
                    if (this.field432[this.field580] != -1) {
                        if (this.field580 == 7) {
                            this.field562.method350(0, (byte) 0, 42);
                        }
                        if (this.field580 == 8) {
                            this.field563.method350(0, (byte) 0, 74);
                        }
                        if (this.field580 == 9) {
                            this.field563.method350(0, (byte) 0, 102);
                        }
                        if (this.field580 == 10) {
                            this.field564.method350(1, (byte) 0, 130);
                        }
                        if (this.field580 == 11) {
                            this.field566.method350(0, (byte) 0, 173);
                        }
                        if (this.field580 == 12) {
                            this.field566.method350(0, (byte) 0, 201);
                        }
                        if (this.field580 == 13) {
                            this.field565.method350(0, (byte) 0, 229);
                        }
                    }
                    if (this.field432[8] != -1 && (this.field561 != 8 || field396 % 20 < 10)) {
                        this.field317[7].method350(2, (byte) 0, 74);
                    }
                    if (this.field432[9] != -1 && (this.field561 != 9 || field396 % 20 < 10)) {
                        this.field317[8].method350(3, (byte) 0, 102);
                    }
                    if (this.field432[10] != -1 && (this.field561 != 10 || field396 % 20 < 10)) {
                        this.field317[9].method350(4, (byte) 0, 137);
                    }
                    if (this.field432[11] != -1 && (this.field561 != 11 || field396 % 20 < 10)) {
                        this.field317[10].method350(2, (byte) 0, 174);
                    }
                    if (this.field432[12] != -1 && (this.field561 != 12 || field396 % 20 < 10)) {
                        this.field317[11].method350(2, (byte) 0, 201);
                    }
                    if (this.field432[13] != -1 && (this.field561 != 13 || field396 % 20 < 10)) {
                        this.field317[12].method350(2, (byte) 0, 226);
                    }
                }
                this.field260.method322(466, super.field1129, 496, (byte) -47);
                this.field547.method321(this.field499);
                class27.field869 = this.field249;
            }
            if (this.field125) {
                this.field125 = false;
                this.field259.method321(this.field499);
                this.field229.method350(0, (byte) 0, 0);
                this.field300.method5(false, true, "Public chat", 28, 16777215, 55);
                if (this.field584 == 0) {
                    this.field300.method5(false, true, "On", 41, 65280, 55);
                }
                if (this.field584 == 1) {
                    this.field300.method5(false, true, "Friends", 41, 16776960, 55);
                }
                if (this.field584 == 2) {
                    this.field300.method5(false, true, "Off", 41, 16711680, 55);
                }
                if (this.field584 == 3) {
                    this.field300.method5(false, true, "Hide", 41, 65535, 55);
                }
                this.field300.method5(false, true, "Private chat", 28, 16777215, 184);
                if (this.field246 == 0) {
                    this.field300.method5(false, true, "On", 41, 65280, 184);
                }
                if (this.field246 == 1) {
                    this.field300.method5(false, true, "Friends", 41, 16776960, 184);
                }
                if (this.field246 == 2) {
                    this.field300.method5(false, true, "Off", 41, 16711680, 184);
                }
                this.field300.method5(false, true, "Trade/compete", 28, 16777215, 324);
                if (this.field238 == 0) {
                    this.field300.method5(false, true, "On", 41, 65280, 324);
                }
                if (this.field238 == 1) {
                    this.field300.method5(false, true, "Friends", 41, 16776960, 324);
                }
                if (this.field238 == 2) {
                    this.field300.method5(false, true, "Off", 41, 16711680, 324);
                }
                this.field300.method5(false, true, "Report abuse", 33, 16777215, 458);
                this.field259.method322(453, super.field1129, 0, (byte) -47);
                this.field547.method321(this.field499);
                class27.field869 = this.field249;
            }
            this.field220 = 0;
            if (arg0 != 9) {
                this.field412 = this.field309.method587();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method252(int arg0) {
        class48.field1405.method34();
        class48.field1409.method34();
        class70.field1724.method34();
        class45.field1273.method34();
        class45.field1277.method34();
        if (arg0 != -17985) {
            this.field511 = 498;
        }
        class32.field926.method34();
        class37.field1003.method34();
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method253(byte arg0) {
        this.field535 = 0;
        for (int var2 = -1; var2 < this.field345 + this.field171; ++var2) {
            class17 var19;
            if (var2 == -1) {
                var19 = field452;
            } else if (var2 < this.field345) {
                var19 = this.field344[this.field346[var2]];
            } else {
                var19 = this.field170[this.field172[var2 - this.field345]];
            }
            if (var19 != null && var19.method307(39489)) {
                if (var19 instanceof class53) {
                    class70 var20 = ((class53) var19).field1508;
                    if (var20.field1722 != null) {
                        var20 = var20.method599((byte) 2);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field345) {
                    class70 var23 = ((class53) var19).field1508;
                    if (var23.field1743 >= 0 && var23.field1743 < this.field273.length) {
                        this.method184(var19.field712 + 15, true, var19);
                        if (this.field335 > -1) {
                            this.field273[var23.field1743].method24(this.field336 - 30, (byte) 0, this.field335 - 12);
                        }
                    }
                    if (this.field509 == 1 && this.field172[var2 - this.field345] == this.field570 && field396 % 20 < 10) {
                        this.method184(var19.field712 + 15, true, var19);
                        if (this.field335 > -1) {
                            this.field435[0].method24(this.field336 - 28, (byte) 0, this.field335 - 12);
                        }
                    }
                } else {
                    int var21 = 30;
                    class32 var22 = (class32) var19;
                    if (var22.field927 != -1 || var22.field922 != -1) {
                        this.method184(var19.field712 + 15, true, var19);
                        if (this.field335 > -1) {
                            if (var22.field927 != -1) {
                                this.field483[var22.field927].method24(this.field336 - var21, (byte) 0, this.field335 - 12);
                                var21 += 25;
                            }
                            if (var22.field922 != -1) {
                                this.field273[var22.field922].method24(this.field336 - var21, (byte) 0, this.field335 - 12);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field509 == 10 && this.field346[var2] == this.field190) {
                        this.method184(var19.field712 + 15, true, var19);
                        if (this.field335 > -1) {
                            this.field435[1].method24(this.field336 - var21, (byte) 0, this.field335 - 12);
                        }
                    }
                }
                if (var19.field736 != null && (var2 >= this.field345 || this.field584 == 0 || this.field584 == 3 || this.field584 == 1 && this.method180(((class32) var19).field924, (byte) 17))) {
                    this.method184(var19.field712, true, var19);
                    if (this.field335 > -1 && this.field535 < this.field536) {
                        this.field540[this.field535] = this.field301.method7(var19.field736, 324) / 2;
                        this.field539[this.field535] = this.field301.field31;
                        this.field537[this.field535] = this.field335;
                        this.field538[this.field535] = this.field336;
                        this.field541[this.field535] = var19.field711;
                        this.field542[this.field535] = var19.field715;
                        this.field543[this.field535] = var19.field709;
                        this.field544[this.field535++] = var19.field736;
                        if (this.field232 == 0 && var19.field715 >= 1 && var19.field715 <= 3) {
                            this.field539[this.field535] += 10;
                            this.field538[this.field535] += 5;
                        }
                        if (this.field232 == 0 && var19.field715 == 4) {
                            this.field540[this.field535] = 60;
                        }
                        if (this.field232 == 0 && var19.field715 == 5) {
                            this.field539[this.field535] += 5;
                        }
                    }
                }
                if (var19.field733 > field396) {
                    this.method184(var19.field712 + 15, true, var19);
                    if (this.field335 > -1) {
                        int var24 = var19.field734 * 30 / var19.field735;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class58.method528(this.field234, var24, this.field336 - 3, this.field335 - 15, 5, 65280);
                        class58.method528(this.field234, 30 - var24, this.field336 - 3, this.field335 - 15 + var24, 5, 16711680);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field722[var25] > field396) {
                        this.method184(var19.field712 / 2, true, var19);
                        if (this.field335 > -1) {
                            if (var25 == 1) {
                                this.field336 -= 20;
                            }
                            if (var25 == 2) {
                                this.field335 -= 15;
                                this.field336 -= 10;
                            }
                            if (var25 == 3) {
                                this.field335 += 15;
                                this.field336 -= 10;
                            }
                            this.field507[var19.field721[var25]].method24(this.field336 - 12, (byte) 0, this.field335 - 12);
                            this.field299.method4(0, this.field336 + 4, String.valueOf(var19.field720[var25]), (byte) 5, this.field335);
                            this.field299.method4(16777215, this.field336 + 3, String.valueOf(var19.field720[var25]), (byte) 5, this.field335 - 1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field535; ++var3) {
            int var4 = this.field537[var3];
            int var5 = this.field538[var3];
            int var6 = this.field540[var3];
            int var7 = this.field539[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field538[var18] - this.field539[var18] && var5 - var7 < this.field538[var18] + 2 && var4 - var6 < this.field540[var18] + this.field537[var18] && var4 + var6 > this.field537[var18] - this.field540[var18] && this.field538[var18] - this.field539[var18] < var5) {
                        var5 = this.field538[var18] - this.field539[var18];
                        var8 = true;
                    }
                }
            }
            this.field335 = this.field537[var3];
            this.field336 = this.field538[var3] = var5;
            String var9 = this.field544[var3];
            if (this.field232 == 0) {
                int var10 = 16776960;
                if (this.field541[var3] < 6) {
                    var10 = this.field305[this.field541[var3]];
                }
                if (this.field541[var3] == 6) {
                    var10 = this.field223 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field541[var3] == 7) {
                    var10 = this.field223 % 20 < 10 ? 255 : 65535;
                }
                if (this.field541[var3] == 8) {
                    var10 = this.field223 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field541[var3] == 9) {
                    int var11 = 150 - this.field543[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field541[var3] == 10) {
                    int var12 = 150 - this.field543[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field541[var3] == 11) {
                    int var13 = 150 - this.field543[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field542[var3] == 0) {
                    this.field301.method4(0, this.field336 + 1, var9, (byte) 5, this.field335);
                    this.field301.method4(var10, this.field336, var9, (byte) 5, this.field335);
                }
                if (this.field542[var3] == 1) {
                    this.field301.method9((byte) -106, var9, this.field335, this.field336 + 1, this.field223, 0);
                    this.field301.method9((byte) -106, var9, this.field335, this.field336, this.field223, var10);
                }
                if (this.field542[var3] == 2) {
                    this.field301.method10(true, this.field223, 0, this.field336 + 1, this.field335, var9);
                    this.field301.method10(true, this.field223, var10, this.field336, this.field335, var9);
                }
                if (this.field542[var3] == 3) {
                    this.field301.method11(var9, 150 - this.field543[var3], this.field223, this.field293, this.field335, this.field336 + 1, 0);
                    this.field301.method11(var9, 150 - this.field543[var3], this.field223, this.field293, this.field335, this.field336, var10);
                }
                if (this.field542[var3] == 4) {
                    int var14 = this.field301.method7(var9, 324);
                    int var15 = (150 - this.field543[var3]) * (var14 + 100) / 150;
                    class58.method525(32409, this.field335 - 50, 0, 334, this.field335 + 50);
                    this.field301.method8(this.field335 + 50 - var15, var9, this.field336 + 1, 0, (byte) 27);
                    this.field301.method8(this.field335 + 50 - var15, var9, this.field336, var10, (byte) 27);
                    class58.method524(this.field436);
                }
                if (this.field542[var3] == 5) {
                    int var16 = 150 - this.field543[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class58.method525(32409, 0, this.field336 - this.field301.field31 - 1, this.field336 + 5, 512);
                    this.field301.method4(0, this.field336 + 1 + var17, var9, (byte) 5, this.field335);
                    this.field301.method4(var10, this.field336 + var17, var9, (byte) 5, this.field335);
                    class58.method524(this.field436);
                }
            } else {
                this.field301.method4(0, this.field336 + 1, var9, (byte) 5, this.field335);
                this.field301.method4(16776960, this.field336, var9, (byte) 5, this.field335);
            }
        }
        if (arg0 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
    public final void method254(int arg0, boolean arg1) {
        this.method195(828);
        this.field147.method321(this.field499);
        this.field210.method350(0, (byte) 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field501 == 0) {
            int var5 = var4 / 2 + 80;
            this.field299.method5(false, true, this.field505.field1586, var5, 7711145, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field301.method5(false, true, "Welcome to RuneScape", var6, 16776960, var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field211.method350(var8 - 20, (byte) 0, var7 - 73);
            this.field301.method5(false, true, "New User", var8 + 5, 16777215, var7);
            int var9 = var3 / 2 + 80;
            this.field211.method350(var8 - 20, (byte) 0, var9 - 73);
            this.field301.method5(false, true, "Existing User", var8 + 5, 16777215, var9);
        }
        if (this.field501 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field165.length() > 0) {
                this.field301.method5(false, true, this.field165, var10 - 15, 16776960, var3 / 2);
                this.field301.method5(false, true, this.field166, var10, 16776960, var3 / 2);
                var10 += 30;
            } else {
                this.field301.method5(false, true, this.field166, var10 - 7, 16776960, var3 / 2);
                var10 += 30;
            }
            this.field301.method12(var3 / 2 - 90, true, var10, "Username: " + this.field380 + (this.field369 == 0 & field396 % 40 < 20 ? "@yel@|" : ""), 16777215, 32048);
            var10 += 15;
            this.field301.method12(var3 / 2 - 88, true, var10, "Password: " + class51.method510(0, this.field381) + (this.field369 == 1 & field396 % 40 < 20 ? "@yel@|" : ""), 16777215, 32048);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field211.method350(var12 - 20, (byte) 0, var11 - 73);
                this.field301.method5(false, true, "Login", var12 + 5, 16777215, var11);
                int var13 = var3 / 2 + 80;
                this.field211.method350(var12 - 20, (byte) 0, var13 - 73);
                this.field301.method5(false, true, "Cancel", var12 + 5, 16777215, var13);
            }
        }
        if (this.field501 == 3) {
            this.field301.method5(false, true, "Create a free account", var4 / 2 - 60, 16776960, var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field301.method5(false, true, "To create a new account you need to", var14, 16777215, var3 / 2);
            int var18 = var14 + 15;
            this.field301.method5(false, true, "go back to the main RuneScape webpage", var18, 16777215, var3 / 2);
            int var19 = var18 + 15;
            this.field301.method5(false, true, "and choose the 'create account'", var19, 16777215, var3 / 2);
            int var20 = var19 + 15;
            this.field301.method5(false, true, "button near the top of that page.", var20, 16777215, var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field211.method350(var16 - 20, (byte) 0, var15 - 73);
            this.field301.method5(false, true, "Cancel", var16 + 5, 16777215, var15);
        }
        this.field147.method322(171, super.field1129, 202, (byte) -47);
        while (arg0 >= 0) {
            this.field127.method37(56);
        }
        if (this.field133) {
            this.field133 = false;
            this.field145.method322(0, super.field1129, 128, (byte) -47);
            this.field146.method322(371, super.field1129, 202, (byte) -47);
            this.field150.method322(265, super.field1129, 0, (byte) -47);
            this.field151.method322(265, super.field1129, 562, (byte) -47);
            this.field152.method322(171, super.field1129, 128, (byte) -47);
            this.field153.method322(171, super.field1129, 562, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method255(int arg0) {
        if (!this.field520 && !this.field521 && !this.field184) {
            ++field396;
            this.field398 += arg0;
            if (!this.field322) {
                this.method259(-370);
            } else {
                this.method265((byte) -81);
            }
            this.method236(897);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)V")
    public final void method256(int arg0, int arg1, boolean arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field478[var5] != null) {
                int var6 = this.field476[var5];
                int var7 = 70 - var4 * 14 + this.field128 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field477[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field584 == 0 || this.field584 == 1 && this.method180(var8, (byte) 17))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field452.field924)) {
                        if (this.field296 >= 1) {
                            this.field126[this.field449] = "Report abuse @whi@" + var8;
                            this.field197[this.field449] = 160;
                            ++this.field449;
                        }
                        this.field126[this.field449] = "Add ignore @whi@" + var8;
                        this.field197[this.field449] = 352;
                        ++this.field449;
                        this.field126[this.field449] = "Add friend @whi@" + var8;
                        this.field197[this.field449] = 702;
                        ++this.field449;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field414 == 0 && (var6 == 7 || this.field246 == 0 || this.field246 == 1 && this.method180(var8, (byte) 17))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field296 >= 1) {
                            this.field126[this.field449] = "Report abuse @whi@" + var8;
                            this.field197[this.field449] = 160;
                            ++this.field449;
                        }
                        this.field126[this.field449] = "Add ignore @whi@" + var8;
                        this.field197[this.field449] = 352;
                        ++this.field449;
                        this.field126[this.field449] = "Add friend @whi@" + var8;
                        this.field197[this.field449] = 702;
                        ++this.field449;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field238 == 0 || this.field238 == 1 && this.method180(var8, (byte) 17))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field126[this.field449] = "Accept trade @whi@" + var8;
                        this.field197[this.field449] = 172;
                        ++this.field449;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field414 == 0 && this.field246 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field238 == 0 || this.field238 == 1 && this.method180(var8, (byte) 17))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field126[this.field449] = "Accept challenge @whi@" + var8;
                        this.field197[this.field449] = 716;
                        ++this.field449;
                    }
                    ++var4;
                }
            }
        }
        if (arg2) {
            this.field127.method37(141);
        }
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    private final void method257(int arg0) {
        if (arg0 == 39212) {
            if (this.field314 == 2) {
                for (class63 var2 = (class63) this.field360.method300(); var2 != null; var2 = (class63) this.field360.method302(true)) {
                    if (var2.field1634 > 0) {
                        --var2.field1634;
                    }
                    if (var2.field1634 == 0) {
                        if (var2.field1624 < 0 || class64.method581(var2.field1624, 2, var2.field1626)) {
                            this.method205(var2.field1624, var2.field1631, var2.field1625, var2.field1632, var2.field1626, true, var2.field1630, var2.field1633);
                            var2.method518();
                        }
                    } else {
                        if (var2.field1623 > 0) {
                            --var2.field1623;
                        }
                        if (var2.field1623 == 0 && var2.field1632 >= 1 && var2.field1633 >= 1 && var2.field1632 <= 102 && var2.field1633 <= 102 && (var2.field1627 < 0 || class64.method581(var2.field1627, 2, var2.field1629))) {
                            this.method205(var2.field1627, var2.field1631, var2.field1628, var2.field1632, var2.field1629, true, var2.field1630, var2.field1633);
                            var2.field1623 = -1;
                            if (var2.field1627 == var2.field1624 && var2.field1624 == -1) {
                                var2.method518();
                            } else if (var2.field1627 == var2.field1624 && var2.field1628 == var2.field1625 && var2.field1629 == var2.field1626) {
                                var2.method518();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILBSNPYLEV;I)V")
    private final void method258(int arg0, class7 arg1, int arg2) {
        if (arg0 == 39981) {
            for (int var4 = 0; var4 < this.field347; ++var4) {
                int var5 = this.field348[var4];
                class32 var6 = this.field344[var5];
                int var7 = arg1.method47();
                if ((var7 & 2) != 0) {
                    var7 += arg1.method47() << 8;
                }
                this.method149(var6, var7, var5, arg1, false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method259(int arg0) {
        if (arg0 >= 0) {
            this.field127.method37(103);
        }
        if (this.field501 == 0) {
            int var2 = super.field1127 / 2 - 80;
            int var3 = super.field1128 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1143 == 1 && super.field1144 >= var2 - 75 && super.field1144 <= var2 + 75 && super.field1145 >= var14 - 20 && super.field1145 <= var14 + 20) {
                this.field501 = 3;
                this.field369 = 0;
            }
            int var4 = super.field1127 / 2 + 80;
            if (super.field1143 == 1 && super.field1144 >= var4 - 75 && super.field1144 <= var4 + 75 && super.field1145 >= var14 - 20 && super.field1145 <= var14 + 20) {
                this.field165 = "";
                this.field166 = "Enter your username & password.";
                this.field501 = 2;
                this.field369 = 0;
            }
        } else if (this.field501 == 2) {
            int var5 = super.field1128 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1143 == 1 && super.field1145 >= var16 - 15 && super.field1145 < var16) {
                this.field369 = 0;
            }
            var5 = var16 + 15;
            if (super.field1143 == 1 && super.field1145 >= var5 - 15 && super.field1145 < var5) {
                this.field369 = 1;
            }
            var5 += 15;
            int var6 = super.field1127 / 2 - 80;
            int var7 = super.field1128 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1143 == 1 && super.field1144 >= var6 - 75 && super.field1144 <= var6 + 75 && super.field1145 >= var17 - 20 && super.field1145 <= var17 + 20) {
                this.field202 = 0;
                this.method268(this.field380, this.field381, false);
                if (this.field322) {
                    return;
                }
            }
            int var8 = super.field1127 / 2 + 80;
            if (super.field1143 == 1 && super.field1144 >= var8 - 75 && super.field1144 <= var8 + 75 && super.field1145 >= var17 - 20 && super.field1145 <= var17 + 20) {
                this.field501 = 0;
                this.field380 = "";
                this.field381 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method430(126);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field460.length(); ++var11) {
                        if (var9 == field460.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field369 == 0) {
                        if (var9 == 8 && this.field380.length() > 0) {
                            this.field380 = this.field380.substring(0, this.field380.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field369 = 1;
                        }
                        if (var10) {
                            this.field380 = this.field380 + (char) var9;
                        }
                        if (this.field380.length() > 12) {
                            this.field380 = this.field380.substring(0, 12);
                        }
                    } else if (this.field369 == 1) {
                        if (var9 == 8 && this.field381.length() > 0) {
                            this.field381 = this.field381.substring(0, this.field381.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field369 = 0;
                        }
                        if (var10) {
                            this.field381 = this.field381 + (char) var9;
                        }
                        if (this.field381.length() > 20) {
                            this.field381 = this.field381.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field501 == 3) {
                int var12 = super.field1127 / 2;
                int var13 = super.field1128 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1143 == 1 && super.field1144 >= var12 - 75 && super.field1144 <= var12 + 75 && super.field1145 >= var18 - 20 && super.field1145 <= var18 + 20) {
                    this.field501 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    private final void method260(int arg0) {
        class63 var2 = (class63) this.field360.method300();
        if (arg0 != 0) {
            this.field127.method37(133);
        }
        while (var2 != null) {
            if (var2.field1634 == -1) {
                var2.field1623 = 0;
                this.method206(var2, -521);
            } else {
                var2.method518();
            }
            var2 = (class63) this.field360.method302(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILBSNPYLEV;)V")
    private final void method261(byte arg0, int arg1, class7 arg2) {
        arg2.method57(-322);
        int var4 = arg2.method58(8, 588);
        if (var4 < this.field171) {
            for (int var5 = var4; var5 < this.field171; ++var5) {
                this.field331[this.field330++] = this.field172[var5];
            }
        }
        if (var4 > this.field171) {
            signlink.reporterror(this.field380 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field171 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var8 = this.field172[var6];
                class53 var9 = this.field170[var8];
                int var10 = arg2.method58(1, 588);
                if (var10 == 0) {
                    this.field172[this.field171++] = var8;
                    var9.field737 = field396;
                } else {
                    int var11 = arg2.method58(2, 588);
                    if (var11 == 0) {
                        this.field172[this.field171++] = var8;
                        var9.field737 = field396;
                        this.field348[this.field347++] = var8;
                    } else if (var11 == 1) {
                        this.field172[this.field171++] = var8;
                        var9.field737 = field396;
                        int var12 = arg2.method58(3, 588);
                        var9.method305(4, false, var12);
                        int var13 = arg2.method58(1, 588);
                        if (var13 == 1) {
                            this.field348[this.field347++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field172[this.field171++] = var8;
                        var9.field737 = field396;
                        int var14 = arg2.method58(3, 588);
                        var9.method305(4, true, var14);
                        int var15 = arg2.method58(3, 588);
                        var9.method305(4, true, var15);
                        int var16 = arg2.method58(1, 588);
                        if (var16 == 1) {
                            this.field348[this.field347++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field331[this.field330++] = var8;
                    }
                }
            }
            if (arg0 != 7) {
                for (int var7 = 1; var7 > 0; ++var7) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++this.field223;
        this.method137(37609, true);
        this.method207((byte) 109, true);
        this.method137(37609, false);
        this.method207((byte) 109, false);
        this.method237(true);
        this.method187(3);
        if (!this.field352) {
            int var2 = this.field155;
            if (this.field237 / 256 > var2) {
                var2 = this.field237 / 256;
            }
            if (this.field361[4] && this.field378[4] + 128 > var2) {
                var2 = this.field378[4] + 128;
            }
            int var3 = this.field306 + this.field156 & 2047;
            this.method211(var2, this.field383, this.method159(field452.field707, -70, this.field213, field452.field706) - 50, var2 * 3 + 600, 3, var3, this.field384);
        }
        int var4;
        if (!this.field352) {
            var4 = this.method226(true);
        } else {
            var4 = this.method227(-651);
        }
        int var5 = this.field284;
        int var6 = this.field285;
        int var7 = this.field286;
        int var8 = this.field287;
        int var9 = this.field288;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field361[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field193[var10] * 2 + 1) - (double) this.field193[var10] + Math.sin((double) this.field444[var10] / 100.0D * (double) this.field208[var10]) * (double) this.field378[var10]);
                if (var10 == 0) {
                    this.field284 += var13;
                }
                if (var10 == 1) {
                    this.field285 += var13;
                }
                if (var10 == 2) {
                    this.field286 += var13;
                }
                if (var10 == 3) {
                    this.field288 = this.field288 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field287 += var13;
                    if (this.field287 < 128) {
                        this.field287 = 128;
                    }
                    if (this.field287 > 383) {
                        this.field287 = 383;
                    }
                }
            }
        }
        int var11 = class27.field878;
        class47.field1394 = true;
        class47.field1397 = 0;
        class47.field1395 = super.field1137 - 4;
        class47.field1396 = super.field1138 - 4;
        class58.method526(30983);
        this.field188.method414(this.field286, this.field287, var4, this.field284, this.field285, -971, this.field288);
        this.field188.method389(0);
        this.method253((byte) 7);
        this.method222((byte) 72);
        this.method220(true, var11);
        int var12 = 31 / arg0;
        this.method178(-60);
        this.field547.method322(4, super.field1129, 4, (byte) -47);
        this.field284 = var5;
        this.field285 = var6;
        this.field286 = var7;
        this.field287 = var8;
        this.field288 = var9;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method263(byte arg0) {
        for (int var2 = -1; var2 < this.field345; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field343;
            } else {
                var7 = this.field346[var2];
            }
            class32 var8 = this.field344[var7];
            if (var8 != null && var8.field709 > 0) {
                --var8.field709;
                if (var8.field709 == 0) {
                    var8.field736 = null;
                }
            }
        }
        ++field429;
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            this.field127.method37(238);
        }
        if (field429 > 189) {
            field429 = 0;
            this.field127.method36(true, 191);
            this.field127.method37(247);
        }
        for (int var4 = 0; var4 < this.field171; ++var4) {
            int var5 = this.field172[var4];
            class53 var6 = this.field170[var5];
            if (var6 != null && var6.field709 > 0) {
                --var6.field709;
                if (var6.field709 == 0) {
                    var6.field736 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILKYEPSAQL;)V")
    public final void method264(int arg0, class31 arg1) {
        short var3 = 256;
        if (arg0 <= 0) {
            this.field283 = !this.field283;
        }
        for (int var4 = 0; var4 < this.field276.length; ++var4) {
            this.field276[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field276[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field277[var16] = (this.field276[var16 - 1] + this.field276[var16 + 1] + this.field276[var16 - 128] + this.field276[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field276;
            this.field276 = this.field277;
            this.field277 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field916; ++var8) {
                for (int var9 = 0; var9 < arg1.field915; ++var9) {
                    if (arg1.field913[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field917;
                        int var11 = var8 + 16 + arg1.field918;
                        int var12 = (var11 << 7) + var10;
                        this.field276[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method265(byte arg0) {
        if (arg0 != -81) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field586 > 1) {
            --this.field586;
        }
        if (this.field402 > 0) {
            --this.field402;
        }
        for (int var3 = 0; var3 < 5 && this.method213(this.field371); ++var3) {
        }
        if (this.field322) {
            Object var4 = this.field572.field844;
            synchronized (this.field572.field844) {
                if (!field437) {
                    this.field572.field839 = 0;
                } else if (super.field1143 != 0 || this.field572.field839 >= 40) {
                    this.field127.method36(true, 148);
                    this.field127.method37(0);
                    int var5 = this.field127.field91;
                    int var6 = 0;
                    for (int var7 = 0; var7 < this.field572.field839 && var5 - this.field127.field91 < 240; ++var7) {
                        ++var6;
                        int var8 = this.field572.field841[var7];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 502) {
                            var8 = 502;
                        }
                        int var9 = this.field572.field843[var7];
                        if (var9 < 0) {
                            var9 = 0;
                        } else if (var9 > 764) {
                            var9 = 764;
                        }
                        int var10 = var8 * 765 + var9;
                        if (this.field572.field841[var7] == -1 && this.field572.field843[var7] == -1) {
                            var9 = -1;
                            var8 = -1;
                            var10 = 524287;
                        }
                        if (this.field555 == var9 && this.field556 == var8) {
                            if (this.field291 < 2047) {
                                ++this.field291;
                            }
                        } else {
                            int var11 = var9 - this.field555;
                            this.field555 = var9;
                            int var12 = var8 - this.field556;
                            this.field556 = var8;
                            if (this.field291 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                var11 += 32;
                                var12 += 32;
                                this.field127.method38((this.field291 << 12) + (var11 << 6) + var12);
                                this.field291 = 0;
                            } else if (this.field291 < 8) {
                                this.field127.method40((this.field291 << 19) + 8388608 + var10);
                                this.field291 = 0;
                            } else {
                                this.field127.method41((this.field291 << 19) + -1073741824 + var10);
                                this.field291 = 0;
                            }
                        }
                    }
                    this.field127.method46(5, this.field127.field91 - var5);
                    if (var6 >= this.field572.field839) {
                        this.field572.field839 = 0;
                    } else {
                        this.field572.field839 -= var6;
                        for (int var13 = 0; var13 < this.field572.field839; ++var13) {
                            this.field572.field843[var13] = this.field572.field843[var6 + var13];
                            this.field572.field841[var13] = this.field572.field841[var6 + var13];
                        }
                    }
                }
            }
            if (super.field1143 != 0) {
                long var14 = (super.field1146 - this.field445) / 50L;
                if (var14 > 4095L) {
                    var14 = 4095L;
                }
                this.field445 = super.field1146;
                int var16 = super.field1145;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 502) {
                    var16 = 502;
                }
                int var17 = super.field1144;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 764) {
                    var17 = 764;
                }
                int var18 = var16 * 765 + var17;
                byte var19 = 0;
                if (super.field1143 == 2) {
                    var19 = 1;
                }
                int var20 = (int) var14;
                this.field127.method36(true, 31);
                this.field127.method79(-779, (var19 << 19) + (var20 << 20) + var18);
            }
            if (this.field385 > 0) {
                --this.field385;
            }
            if (super.field1147[1] == 1 || super.field1147[2] == 1 || super.field1147[3] == 1 || super.field1147[4] == 1) {
                this.field386 = true;
            }
            if (this.field386 && this.field385 <= 0) {
                this.field385 = 20;
                this.field386 = false;
                this.field127.method36(true, 67);
                this.field127.method70(this.field155, 26);
                this.field127.method72(this.field156, (byte) 2);
            }
            if (super.field1134 && !this.field316) {
                this.field316 = true;
                this.field127.method36(true, 118);
                this.field127.method37(1);
            }
            if (!super.field1134 && this.field316) {
                this.field316 = false;
                this.field127.method36(true, 118);
                this.field127.method37(0);
            }
            this.method218(this.field332);
            this.method257(39212);
            this.method138(9);
            ++this.field400;
            if (this.field400 > 750) {
                this.method201(-39300);
            }
            this.method202((byte) 5);
            this.method244(253);
            this.method263((byte) 5);
            ++this.field220;
            if (this.field426 != 0) {
                this.field425 += 20;
                if (this.field425 >= 400) {
                    this.field426 = 0;
                }
            }
            if (this.field164 != 0) {
                ++this.field161;
                if (this.field161 >= 15) {
                    if (this.field164 == 2) {
                        this.field192 = true;
                    }
                    if (this.field164 == 3) {
                        this.field267 = true;
                    }
                    this.field164 = 0;
                }
            }
            if (this.field326 != 0) {
                ++this.field204;
                if (super.field1137 > this.field327 + 5 || super.field1137 < this.field327 - 5 || super.field1138 > this.field328 + 5 || super.field1138 < this.field328 - 5) {
                    this.field571 = true;
                }
                if (super.field1136 == 0) {
                    if (this.field326 == 2) {
                        this.field192 = true;
                    }
                    if (this.field326 == 3) {
                        this.field267 = true;
                    }
                    this.field326 = 0;
                    if (this.field571 && this.field204 >= 5) {
                        this.field395 = -1;
                        this.method171(616);
                        if (this.field395 == this.field324 && this.field394 != this.field325) {
                            class43 var21 = class43.method445(this.field324);
                            byte var22 = 0;
                            if (this.field557 == 1 && var21.field1193 == 206) {
                                var22 = 1;
                            }
                            if (var21.field1177[this.field394] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field1201) {
                                int var23 = this.field325;
                                int var24 = this.field394;
                                var21.field1177[var24] = var21.field1177[var23];
                                var21.field1229[var24] = var21.field1229[var23];
                                var21.field1177[var23] = -1;
                                var21.field1229[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field325;
                                int var26 = this.field394;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method440((byte) 0, var25, var25 - 1);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method440((byte) 0, var25, var25 + 1);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method440((byte) 0, this.field325, this.field394);
                            }
                            this.field127.method36(true, 99);
                            this.field127.method70(this.field325, 26);
                            this.field127.method38(this.field394);
                            this.field127.method64(var22, false);
                            this.field127.method71(this.field324, 607);
                        }
                    } else if ((this.field173 == 1 || this.method170(this.field449 - 1, true)) && this.field449 > 2) {
                        this.method141(-944);
                    } else if (this.field449 > 0) {
                        this.method209(9, this.field449 - 1);
                    }
                    this.field161 = 10;
                    super.field1143 = 0;
                }
            }
            if (class39.field1064 != -1) {
                int var27 = class39.field1064;
                int var28 = class39.field1065;
                boolean var29 = this.method200(0, 0, 0, var27, field452.field704[0], 0, false, 0, field452.field703[0], true, 0, var28);
                class39.field1064 = -1;
                if (var29) {
                    this.field423 = super.field1144;
                    this.field424 = super.field1145;
                    this.field426 = 1;
                    this.field425 = 0;
                }
            }
            if (super.field1143 == 1 && this.field245 != null) {
                this.field245 = null;
                this.field267 = true;
                super.field1143 = 0;
            }
            this.method230(0);
            if (this.field455 == -1) {
                this.method216(502);
                this.method217(-12559);
                this.method192(0);
            }
            if (super.field1136 == 1 || super.field1143 == 1) {
                ++this.field339;
            }
            if (this.field512 == 0 && this.field431 == 0 && this.field585 == 0) {
                if (this.field254 > 0) {
                    --this.field254;
                }
            } else if (this.field254 < 100) {
                ++this.field254;
                if (this.field254 == 100) {
                    if (this.field512 != 0) {
                        this.field267 = true;
                    }
                    if (this.field431 != 0) {
                        this.field192 = true;
                    }
                }
            }
            if (this.field314 == 2) {
                this.method266(true);
            }
            if (this.field314 == 2 && this.field352) {
                this.method136(49563);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field208[var30]++;
            }
            this.method145(8);
            ++super.field1135;
            if (super.field1135 > 4500) {
                this.field402 = 250;
                super.field1135 -= 500;
                this.field127.method36(true, 219);
            }
            ++this.field518;
            if (this.field518 > 500) {
                this.field518 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field523 += this.field524;
                }
                if ((var31 & 2) == 2) {
                    this.field185 += this.field186;
                }
                if ((var31 & 4) == 4) {
                    this.field306 += this.field307;
                }
            }
            if (this.field523 < -50) {
                this.field524 = 2;
            }
            if (this.field523 > 50) {
                this.field524 = -2;
            }
            if (this.field185 < -55) {
                this.field186 = 2;
            }
            if (this.field185 > 55) {
                this.field186 = -2;
            }
            if (this.field306 < -40) {
                this.field307 = 1;
            }
            if (this.field306 > 40) {
                this.field307 = -1;
            }
            ++this.field132;
            if (this.field132 > 500) {
                this.field132 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field481 += this.field482;
                }
                if ((var32 & 2) == 2) {
                    this.field311 += this.field312;
                }
            }
            if (this.field481 < -60) {
                this.field482 = 2;
            }
            if (this.field481 > 60) {
                this.field482 = -2;
            }
            if (this.field311 < -20) {
                this.field312 = 1;
            }
            if (this.field311 > 10) {
                this.field312 = -1;
            }
            ++this.field401;
            if (this.field401 > 50) {
                this.field127.method36(true, 11);
            }
            try {
                if (this.field416 != null && this.field127.field91 > 0) {
                    this.field416.method372(0, this.field127.field90, this.field127.field91, this.field340);
                    this.field127.field91 = 0;
                    this.field401 = 0;
                }
            } catch (IOException var34) {
                this.method201(-39300);
            } catch (Exception var35) {
                this.method167((byte) -84);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method266(boolean arg0) {
        this.field322 &= arg0;
        try {
            int var2 = field452.field706 + this.field523;
            int var3 = field452.field707 + this.field185;
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
            if (super.field1147[1] == 1) {
                this.field157 += (-24 - this.field157) / 2;
            } else if (super.field1147[2] == 1) {
                this.field157 += (24 - this.field157) / 2;
            } else {
                this.field157 /= 2;
            }
            if (super.field1147[3] == 1) {
                this.field158 += (12 - this.field158) / 2;
            } else if (super.field1147[4] == 1) {
                this.field158 += (-12 - this.field158) / 2;
            } else {
                this.field158 /= 2;
            }
            this.field156 = this.field157 / 2 + this.field156 & 2047;
            this.field155 += this.field158 / 2;
            if (this.field155 < 128) {
                this.field155 = 128;
            }
            if (this.field155 > 383) {
                this.field155 = 383;
            }
            int var4 = this.field383 >> 7;
            int var5 = this.field384 >> 7;
            int var6 = this.method159(this.field384, -70, this.field213, this.field383);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field213;
                        if (var10 < 3 && (this.field549[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field604[var10][var8][var9];
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
            if (var12 > this.field237) {
                this.field237 += (var12 - this.field237) / 24;
            } else if (var12 < this.field237) {
                this.field237 += (var12 - this.field237) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field452.field706 + "," + field452.field707 + "," + this.field383 + "," + this.field384 + "," + this.field450 + "," + this.field451 + "," + this.field354 + "," + this.field355);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
    public final void method267(String arg0, boolean arg1, String arg2, int arg3) {
        if (arg3 == 0 && this.field313 != -1) {
            this.field245 = arg2;
            super.field1143 = 0;
        }
        if (this.field183 == -1) {
            this.field267 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field476[var5] = this.field476[var5 - 1];
            this.field477[var5] = this.field477[var5 - 1];
            this.field478[var5] = this.field478[var5 - 1];
        }
        this.field476[0] = arg3;
        this.field477[0] = arg0;
        if (arg1) {
            this.field412 = this.field309.method587();
        }
        this.field478[0] = arg2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method268(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field165 = "";
                this.field166 = "Connecting to server...";
                this.method254(-879, true);
            }
            this.field416 = new class38(this, this.method176(field607 + 43594), (byte) -68);
            long var4 = class51.method505(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field127.field91 = 0;
            this.field127.method37(14);
            this.field127.method37(var6);
            this.field416.method372(0, this.field127.field90, 2, this.field340);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field416.method369();
            }
            int var8 = this.field416.method369();
            int var9 = var8;
            if (var8 == 0) {
                this.field416.method371(this.field474.field90, 0, 8);
                this.field474.field91 = 0;
                this.field554 = this.field474.method53((byte) 51);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field554 >> 32), (int) this.field554 };
                this.field127.field91 = 0;
                this.field127.method37(10);
                this.field127.method41(var10[0]);
                this.field127.method41(var10[1]);
                this.field127.method41(var10[2]);
                this.field127.method41(var10[3]);
                this.field127.method41(signlink.uid);
                this.field127.method44(arg0);
                this.field127.method44(arg1);
                this.field127.method62(field491, this.field479, field418);
                this.field174.field91 = 0;
                if (arg2) {
                    this.field174.method37(18);
                } else {
                    this.field174.method37(16);
                }
                this.field174.method37(this.field127.field91 + 36 + 1 + 1 + 2);
                this.field174.method37(255);
                this.field174.method38(375);
                this.field174.method37(field609 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field174.method41(this.field337[var11]);
                }
                this.field174.method45(0, 0, this.field127.field91, this.field127.field90);
                this.field127.field95 = new class68(this.field387, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field309 = new class68(this.field387, var10);
                this.field416.method372(0, this.field174.field90, this.field174.field91, this.field340);
                var8 = this.field416.method369();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method268(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field296 = this.field416.method369();
                field437 = this.field416.method369() == 1;
                this.field445 = 0L;
                this.field291 = 0;
                this.field572.field839 = 0;
                super.field1134 = true;
                this.field316 = true;
                this.field322 = true;
                this.field127.field91 = 0;
                this.field474.field91 = 0;
                this.field399 = -1;
                this.field525 = -1;
                this.field526 = -1;
                this.field527 = -1;
                this.field398 = 0;
                this.field400 = 0;
                this.field586 = 0;
                this.field402 = 0;
                this.field509 = 0;
                this.field449 = 0;
                this.field456 = false;
                super.field1135 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field478[var13] = null;
                }
                this.field364 = 0;
                this.field440 = 0;
                this.field314 = 0;
                this.field329 = 0;
                this.field523 = (int) (Math.random() * 100.0D) - 50;
                this.field185 = (int) (Math.random() * 110.0D) - 55;
                this.field306 = (int) (Math.random() * 80.0D) - 40;
                this.field481 = (int) (Math.random() * 120.0D) - 60;
                this.field311 = (int) (Math.random() * 30.0D) - 20;
                this.field156 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field454 = 0;
                this.field397 = -1;
                this.field319 = 0;
                this.field320 = 0;
                this.field345 = 0;
                this.field171 = 0;
                for (int var14 = 0; var14 < this.field342; ++var14) {
                    this.field344[var14] = null;
                    this.field349[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field170[var15] = null;
                }
                field452 = this.field344[this.field343] = new class32();
                this.field597.method304();
                this.field222.method304();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field136[var16][var17][var18] = null;
                        }
                    }
                }
                this.field360 = new class15(true);
                this.field472 = 0;
                this.field471 = 0;
                this.method152(this.field313, (byte) 62);
                this.field313 = -1;
                this.method152(this.field183, (byte) 62);
                this.field183 = -1;
                this.method152(this.field253, (byte) 62);
                this.field253 = -1;
                this.method152(this.field455, (byte) 62);
                this.field455 = -1;
                this.method152(this.field446, (byte) 62);
                this.field446 = -1;
                this.method152(this.field409, (byte) 62);
                this.field409 = -1;
                this.method152(this.field181, (byte) 62);
                this.field181 = -1;
                this.field142 = false;
                this.field580 = 3;
                this.field281 = 0;
                this.field456 = false;
                this.field219 = false;
                this.field245 = null;
                this.field382 = 0;
                this.field561 = -1;
                this.field373 = true;
                this.method223(false);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field582[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field289[var20] = null;
                    this.field290[var20] = false;
                }
                field583 = 0;
                field428 = 0;
                field433 = 0;
                field224 = 0;
                field159 = 0;
                field439 = 0;
                field207 = 0;
                field495 = 0;
                field338 = 0;
                field417 = 0;
                this.method127(895);
            } else if (var8 == 3) {
                this.field165 = "";
                this.field166 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field165 = "Your account has been disabled.";
                this.field166 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field165 = "Your account is already logged in.";
                this.field166 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field165 = "RuneScape has been updated!";
                this.field166 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field165 = "This world is full.";
                this.field166 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field165 = "Unable to connect.";
                this.field166 = "Login server offline.";
            } else if (var8 == 9) {
                this.field165 = "Login limit exceeded.";
                this.field166 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field165 = "Unable to connect.";
                this.field166 = "Bad session id.";
            } else if (var8 == 12) {
                this.field165 = "You need a members account to login to this world.";
                this.field166 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field165 = "Could not complete login.";
                this.field166 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field165 = "The server is being updated.";
                this.field166 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field322 = true;
                this.field127.field91 = 0;
                this.field474.field91 = 0;
                this.field399 = -1;
                this.field525 = -1;
                this.field526 = -1;
                this.field527 = -1;
                this.field398 = 0;
                this.field400 = 0;
                this.field586 = 0;
                this.field449 = 0;
                this.field456 = false;
                this.field603 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field165 = "Login attempts exceeded.";
                this.field166 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field165 = "You are standing in a members-only area.";
                this.field166 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field165 = "Invalid loginserver requested";
                this.field166 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field165 = "Malformed login packet.";
                    this.field166 = "Please try again.";
                } else if (var8 == 23) {
                    this.field165 = "No reply from loginserver.";
                    this.field166 = "Please try again.";
                } else if (var8 == 24) {
                    this.field165 = "Error loading your profile.";
                    this.field166 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field165 = "Unexpected loginserver response.";
                    this.field166 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field165 = "This computers address has been blocked";
                    this.field166 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field202 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field202;
                            this.method268(arg0, arg1, arg2);
                        } else {
                            this.field165 = "No response from loginserver";
                            this.field166 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field165 = "No response from server";
                        this.field166 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field165 = "Unexpected server response";
                    this.field166 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field416.method369();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field165 = "You have only just left another world";
                    this.field166 = "Your profile will be transferred in: " + var26;
                    this.method254(-879, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method268(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field165 = "";
            this.field166 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z[BI)V")
    public final void method269(boolean arg0, byte[] arg1, int arg2) {
        if (this.field278) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
            if (arg2 != 0) {
                this.method128();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field398 += arg8;
        class63 var11 = null;
        for (class63 var12 = (class63) this.field360.method300(); var12 != null; var12 = (class63) this.field360.method302(true)) {
            if (var12.field1630 == arg3 && var12.field1632 == arg7 && var12.field1633 == arg4 && var12.field1631 == arg1) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class63();
            var11.field1630 = arg3;
            var11.field1631 = arg1;
            var11.field1632 = arg7;
            var11.field1633 = arg4;
            this.method206(var11, -521);
            this.field360.method297(var11);
        }
        var11.field1627 = arg2;
        var11.field1629 = arg9;
        var11.field1628 = arg0;
        var11.field1623 = arg5;
        var11.field1634 = arg6;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field304[var1] = var0 - 1;
            var0 += var0;
        }
        field413 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field418 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field460 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field468 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field468[var3] = var2 / 4;
        }
        field491 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field508 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field606 = 10;
        field608 = true;
    }
}
