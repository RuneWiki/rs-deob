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
public class client extends class31 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "[[I")
    private int[][] field119 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
    private int[] field129 = new int[5];

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
    public int[] field138 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private final int field140 = 100;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
    private int[] field141 = new int[100];

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private int field143 = 6;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "B")
    private byte field144 = -118;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    private boolean field145 = false;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field148 = -1;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private int field149 = -712;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
    private boolean field150 = true;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field153 = 78;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field160 = 687;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
    private int[] field162 = new int[class5.field77];

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
    private volatile boolean field163 = false;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "[B")
    private byte[] field166 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    private int field167 = -1;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field169 = 2;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "[LAIRMECOM;")
    private class3[] field170 = new class3[8];

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "[LAIRMECOM;")
    private class3[] field171 = new class3[32];

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "Z")
    private boolean field172 = false;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
    private final int[] field175 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
    private int[] field176 = new int[50];

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "Z")
    private boolean field184 = true;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
    private int[] field185 = new int[class5.field77];

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "[LOJMMOVXV;")
    private class40[] field187 = new class40[13];

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
    private boolean field200 = false;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
    private int[] field201 = new int[4000];

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
    private int[] field202 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private int field211 = -1;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
    public int[] field214 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "B")
    private byte field215 = -26;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
    private int[] field216 = new int[33];

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "[Ljava/lang/String;")
    private String[] field219 = new String[500];

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
    private int[] field220 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
    private boolean field221 = true;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
    private boolean field223 = false;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int field230 = 5063219;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
    public boolean field232 = true;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
    private boolean field233 = false;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "Z")
    private boolean field235 = false;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
    private boolean field237 = true;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
    private int[] field238 = new int[151];

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "Ljava/lang/String;")
    private String field240 = "";

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int field242 = 8;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    private int field244 = -112;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
    private boolean field245 = false;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
    private int[] field249 = new int[100];

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "[Ljava/lang/String;")
    private String[] field250 = new String[100];

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "[Ljava/lang/String;")
    private String[] field251 = new String[100];

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field252 = -23021;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private int field253 = 37900;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
    private int[] field254 = new int[5];

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field255 = 7;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "[LAIRMECOM;")
    private class3[] field257 = new class3[20];

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
    private boolean field263 = false;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "B")
    private byte field264 = 8;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "[Ljava/lang/String;")
    private String[] field265 = new String[200];

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "Z")
    public boolean field269 = false;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
    private int[] field270 = new int[151];

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "LRSWRPCHR;")
    private class50 field271 = new class50(new byte[5000], -46859);

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[LITIWVLHR;")
    private class24[] field272 = new class24[16384];

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
    public int[] field274 = new int[16384];

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
    private int[] field275 = new int[7];

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
    private int[] field276 = new int[500];

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
    private int[] field277 = new int[500];

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
    private int[] field278 = new int[500];

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
    private int[] field279 = new int[500];

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
    private boolean field282 = false;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "[I")
    private int[] field290 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
    private int[] field291 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int field293 = -1;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "[[[I")
    private int[][][] field294 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
    private boolean field296 = false;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
    private int[] field297 = new int[33];

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
    private int[] field303 = new int[50];

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "LRSWRPCHR;")
    private class50 field313 = class50.method376(1, 446);

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field314 = -1;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
    private int[] field315 = new int[9];

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    private int field320 = 7;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "[J")
    private long[] field324 = new long[200];

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "LEZXKBAZY;")
    private class17 field325 = new class17(false);

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
    private boolean field327 = false;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
    private int field331 = 7759444;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int field333 = 128;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "LRSWRPCHR;")
    private class50 field337 = class50.method376(1, 446);

    @OriginalMember(owner = "client!client", name = "af", descriptor = "B")
    private byte field339 = 21;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "Z")
    private boolean field340 = false;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
    private boolean field341 = false;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field345 = 5;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field346 = 3353893;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "LEZXKBAZY;")
    private class17 field348 = new class17(false);

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "LIGMZHLWJ;")
    private class22 field354 = new class22();

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "Z")
    private boolean field357 = true;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
    private int[] field359 = new int[class5.field77];

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "Ljava/lang/String;")
    private String field360 = "";

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field362 = 5;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "[LAIRMECOM;")
    private class3[] field365 = new class3[100];

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "[[I")
    private int[][] field366 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field367 = -1;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "[LAIRMECOM;")
    private class3[] field368 = new class3[1000];

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
    private int field371 = 37900;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "[I")
    private int[] field372 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "[LYXBFJZDP;")
    public class68[] field379 = new class68[5];

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
    private int[] field384 = new int[50];

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    private int field386 = -1;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private int field388 = 2048;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field389 = 2047;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "[LMVRUIIXW;")
    private class36[] field390 = new class36[this.field388];

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
    public int[] field392 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
    private int[] field394 = new int[this.field388];

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "[LRSWRPCHR;")
    private class50[] field395 = new class50[this.field388];

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int field396 = -1;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "Z")
    private boolean field398 = false;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
    private int[] field404 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
    private boolean field410 = false;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "[LOJMMOVXV;")
    private class40[] field412 = new class40[100];

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "Z")
    private boolean field413 = true;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
    private boolean field414 = false;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
    private int[] field417 = new int[5];

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field423 = 2;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private int field425 = -1;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field426 = -1;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field429 = 3;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    private int field430 = -1;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private int field434 = 50;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
    private int[] field435 = new int[this.field434];

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
    private int[] field436 = new int[this.field434];

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
    private int[] field437 = new int[this.field434];

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
    private int[] field438 = new int[this.field434];

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
    private int[] field439 = new int[this.field434];

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
    private int[] field440 = new int[this.field434];

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
    private int[] field441 = new int[this.field434];

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "[Ljava/lang/String;")
    private String[] field442 = new String[this.field434];

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
    private int[] field447 = new int[5];

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
    public int[] field449 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "Ljava/lang/String;")
    private String field450 = "";

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field463 = 1;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
    private boolean field467 = false;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "Ljava/lang/String;")
    private String field472 = "";

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "Ljava/lang/String;")
    private String field473 = "";

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
    private int[] field477 = new int[5];

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "LEZXKBAZY;")
    private class17 field478 = new class17(false);

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "Z")
    private boolean field479 = false;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "[Ljava/lang/String;")
    private String[] field481 = new String[5];

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "[Z")
    private boolean[] field482 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
    private int field484 = 6;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
    private boolean field485 = false;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "Z")
    private boolean field493 = false;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "Ljava/lang/String;")
    private String field494 = "";

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "Z")
    private boolean field495 = true;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "[LAIRMECOM;")
    private class3[] field496 = new class3[32];

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "LRSWRPCHR;")
    private class50 field501 = class50.method376(1, 446);

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "Z")
    private boolean field502 = false;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
    private volatile boolean field503 = false;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "Ljava/lang/String;")
    private String field504 = "";

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "[Ljava/lang/String;")
    private String[] field506 = new String[100];

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "[I")
    private int[] field507 = new int[100];

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
    private boolean field509 = false;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field511 = 7;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "B")
    private byte field512 = 36;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "[LAIRMECOM;")
    private class3[] field520 = new class3[32];

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "Z")
    private boolean field525 = true;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "[LOJMMOVXV;")
    private class40[] field529 = new class40[2];

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private int field545 = 1;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "Ljava/lang/String;")
    private String field546 = "";

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "Ljava/lang/String;")
    private String field547 = "";

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "Z")
    private boolean field548 = false;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "Z")
    private boolean field555 = false;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
    private int[] field568 = new int[200];

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "[[I")
    private int[][] field569 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
    private int[] field570 = new int[256];

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field571 = 443;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "[J")
    private long[] field573 = new long[100];

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "[[[LEZXKBAZY;")
    private class17[][][] field574 = new class17[4][104][104];

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "[Z")
    private boolean[] field575 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
    private int field576 = -1;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private int field577 = -1;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "Z")
    private boolean field578 = false;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
    private int field579 = -1;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field584 = 7;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "[LKQTHKTBC;")
    private class30[] field585 = new class30[4];

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field586 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    private int field597 = 2;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "Z")
    private volatile boolean field598 = false;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
    private int field599 = -1;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
    private int field600 = 2301979;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "Ljava/lang/String;")
    private String field601 = "";

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field602 = -1;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field142 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "[[I")
    public static final int[][] field146 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "Ljava/lang/String;")
    private static String field241 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    private static int field364 = -1814;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field369 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
    public static int[] field370 = new int[32];

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
    private static int[] field491;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private static int field514;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "Z")
    private static boolean field516;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
    public static final int[] field530;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private static int field137;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private static int field147;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private static int field182;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
    private static int field236;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private static int field267;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    private static int field316;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private static int field326;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private static int field332;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private static int field344;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private static int field418;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private static int field458;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
    private static int field459;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private static int field460;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private static int field476;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private static int field521;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "J")
    public long field121;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "J")
    private long field122;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "J")
    private long field343;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "J")
    private long field397;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "J")
    private long field415;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "LEDIBXOXE;")
    private class13 field203;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "LEDIBXOXE;")
    private class13 field204;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "LEDIBXOXE;")
    private class13 field205;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "LEDIBXOXE;")
    private class13 field206;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "LFXNTEMPE;")
    private class18 field556;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LMVRUIIXW;")
    public static class36 field353;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "LNERZSWTZ;")
    private class37 field483;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "LNZNLPNYM;")
    public class38 field247;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "LAIRMECOM;")
    private class3 field124;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "LAIRMECOM;")
    private class3 field125;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "LAIRMECOM;")
    private class3 field126;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "LAIRMECOM;")
    private class3 field127;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "LAIRMECOM;")
    private class3 field128;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "LAIRMECOM;")
    private class3 field161;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "LAIRMECOM;")
    private class3 field217;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "LAIRMECOM;")
    private class3 field218;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "LAIRMECOM;")
    private class3 field284;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "LAIRMECOM;")
    private class3 field287;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "LAIRMECOM;")
    private class3 field288;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "LAIRMECOM;")
    private class3 field373;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "LAIRMECOM;")
    private class3 field374;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "LAIRMECOM;")
    private class3 field378;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "LAIRMECOM;")
    private class3 field470;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "LOJMMOVXV;")
    private class40 field115;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "LOJMMOVXV;")
    private class40 field116;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "LOJMMOVXV;")
    private class40 field117;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "LOJMMOVXV;")
    private class40 field317;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "LOJMMOVXV;")
    private class40 field318;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "LOJMMOVXV;")
    private class40 field319;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "LOJMMOVXV;")
    private class40 field465;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "LOJMMOVXV;")
    private class40 field466;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "LOJMMOVXV;")
    private class40 field489;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "LOJMMOVXV;")
    private class40 field490;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "LOJMMOVXV;")
    private class40 field537;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "LOJMMOVXV;")
    private class40 field538;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "LOJMMOVXV;")
    private class40 field539;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "LOJMMOVXV;")
    private class40 field540;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "LOJMMOVXV;")
    private class40 field541;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "LOJMMOVXV;")
    private class40 field557;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "LOJMMOVXV;")
    private class40 field558;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "LOJMMOVXV;")
    private class40 field559;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "LOJMMOVXV;")
    private class40 field560;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "LOJMMOVXV;")
    private class40 field561;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "LOLIDOILN;")
    private class41 field123;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "LPRSDKOTZ;")
    private class46 field188;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "LPRSDKOTZ;")
    private class46 field189;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "LPRSDKOTZ;")
    private class46 field190;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "LPRSDKOTZ;")
    private class46 field191;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "LPRSDKOTZ;")
    private class46 field192;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "LPRSDKOTZ;")
    private class46 field193;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "LPRSDKOTZ;")
    private class46 field194;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "LPRSDKOTZ;")
    private class46 field195;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "LPRSDKOTZ;")
    private class46 field196;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "LPRSDKOTZ;")
    private class46 field304;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "LPRSDKOTZ;")
    private class46 field305;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "LPRSDKOTZ;")
    private class46 field306;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "LPRSDKOTZ;")
    private class46 field307;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "LPRSDKOTZ;")
    private class46 field308;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "LPRSDKOTZ;")
    private class46 field309;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "LPRSDKOTZ;")
    private class46 field310;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "LPRSDKOTZ;")
    private class46 field311;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "LPRSDKOTZ;")
    private class46 field312;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "LPRSDKOTZ;")
    private class46 field321;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "LPRSDKOTZ;")
    private class46 field322;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "LPRSDKOTZ;")
    private class46 field323;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "LPRSDKOTZ;")
    private class46 field349;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "LPRSDKOTZ;")
    private class46 field350;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "LPRSDKOTZ;")
    private class46 field351;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LPRSDKOTZ;")
    private class46 field352;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "LQJAHKUCY;")
    private class47 field566;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "LYJCKMNKP;")
    private class67 field589;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "Ljava/lang/String;")
    private String field177;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "Ljava/lang/String;")
    private String field246;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "Ljava/lang/String;")
    public String field383;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "Ljava/lang/String;")
    public String field409;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "Ljava/net/Socket;")
    private Socket field581;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Z")
    private static boolean field118;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
    private static boolean field152;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "Z")
    private static boolean field285;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
    private static boolean field338;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
    public static boolean field355;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
    private static boolean field464;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
    private static boolean field517;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
    public static boolean field542;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
    private static boolean field567;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
    private int[] field131;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
    private int[] field132;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    private int[] field133;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
    private int[] field134;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
    private int[] field135;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
    private int[] field136;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
    private int[] field400;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
    private int[] field401;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
    private int[] field486;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
    private int[] field487;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
    private int[] field497;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "[I")
    private int[] field498;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
    private int[] field499;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
    private int[] field500;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "[LOJMMOVXV;")
    private class40[] field164;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "[[B")
    private byte[][] field402;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "[[B")
    private byte[][] field572;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "[[[B")
    private byte[][][] field543;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "[[[I")
    private int[][][] field590;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method21(int arg0, int arg1) {
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class22.method223(6, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method22(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 0) {
            return this.field255;
        } else {
            int var5 = arg1 >> 7;
            int var6 = arg3 >> 7;
            if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
                int var7 = arg2;
                if (arg2 < 3 && (this.field543[1][var5][var6] & 2) == 2) {
                    var7 = arg2 + 1;
                }
                int var8 = arg1 & 127;
                int var9 = arg3 & 127;
                int var10 = (128 - var8) * this.field590[var7][var5][var6] + this.field590[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field590[var7][var5][var6 + 1] + this.field590[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)I")
    public final int method23(int arg0) {
        int var2 = 3;
        if (arg0 != 0) {
            this.field574 = null;
        }
        if (this.field552 < 310) {
            int var3 = this.field549 >> 7;
            int var4 = this.field551 >> 7;
            int var5 = field353.field1702 >> 7;
            int var6 = field353.field1703 >> 7;
            if ((this.field543[this.field363][var3][var4] & 4) != 0) {
                var2 = this.field363;
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
                    if ((this.field543[this.field363][var3][var4] & 4) != 0) {
                        var2 = this.field363;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field543[this.field363][var3][var4] & 4) != 0) {
                            var2 = this.field363;
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
                    if ((this.field543[this.field363][var3][var4] & 4) != 0) {
                        var2 = this.field363;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field543[this.field363][var3][var4] & 4) != 0) {
                            var2 = this.field363;
                        }
                    }
                }
            }
        }
        if ((this.field543[this.field363][field353.field1702 >> 7][field353.field1703 >> 7] & 4) != 0) {
            var2 = this.field363;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)I")
    public final int method24(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field454 = -1;
        }
        int var2 = this.method22(-531, this.field549, this.field363, this.field551);
        return var2 - this.field550 < 800 && (this.field543[this.field363][this.field549 >> 7][this.field551 >> 7] & 4) != 0 ? this.field363 : 3;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method25(int arg0) {
        if (super.field935 == null) {
            this.method49(this.field531);
            this.field188 = null;
            this.field189 = null;
            this.field190 = null;
            this.field191 = null;
            this.field192 = null;
            this.field193 = null;
            this.field194 = null;
            this.field195 = null;
            this.field196 = null;
            this.field352 = null;
            this.field350 = null;
            this.field349 = null;
            this.field351 = null;
            this.field321 = null;
            this.field322 = null;
            this.field323 = null;
            super.field935 = new class46(3, 503, 765, this.method99(false));
            if (arg0 != 10571) {
                field118 = !field118;
            }
            this.field235 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field503) {
            this.method106(false);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILRSWRPCHR;)V")
    private final void method26(int arg0, int arg1, class50 arg2) {
        this.field448 = 0;
        this.field393 = 0;
        this.method164(arg2, true, arg0);
        this.method107(arg2, 391, arg0);
        this.method96((byte) 9, arg0, arg2);
        if (arg1 != -16194) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method125(607, arg2, arg0);
        for (int var5 = 0; var5 < this.field448; ++var5) {
            int var7 = this.field449[var5];
            if (field399 != this.field390[var7].field1720) {
                this.field390[var7] = null;
            }
        }
        if (arg2.field1225 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field1225 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field391; ++var6) {
                if (this.field390[this.field392[var6]] == null) {
                    signlink.reporterror(this.field546 + " null entry in pl list - pos:" + var6 + " size:" + this.field391);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method27(boolean arg0) {
        this.field349.method351(-181);
        if (arg0) {
            this.field574 = null;
        }
        class63.field1561 = this.field134;
        this.field317.method320((byte) -91, 0, 0);
        if (this.field579 != -1) {
            this.method143(0, class22.method215(this.field579), 0, 0, true);
        } else if (this.field372[this.field429] != -1) {
            this.method143(0, class22.method215(this.field372[this.field429]), 0, 0, true);
        }
        if (this.field502 && this.field225 == 1) {
            this.method86(-18010);
        }
        this.field349.method352(553, 205, super.field934, (byte) 108);
        this.field351.method351(-181);
        class63.field1561 = this.field135;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field589.method568(arg1, arg2, arg3);
        if (var7 != 0) {
            int var8 = this.field589.method572(arg1, arg2, arg3, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field470.field22;
            int var13 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class59 var15 = class59.method450(var14);
            if (var15.field1380 != -1) {
                class40 var16 = this.field412[var15.field1380];
                if (var16 != null) {
                    int var17 = (var15.field1411 * 4 - var16.field1060) / 2;
                    int var18 = (var15.field1379 * 4 - var16.field1061) / 2;
                    var16.method320((byte) -91, arg2 * 4 + 48 + var17, (104 - arg3 - var15.field1379) * 4 + 48 + var18);
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
        int var19 = this.field589.method570(arg1, arg2, arg3);
        if (var19 != 0) {
            int var20 = this.field589.method572(arg1, arg2, arg3, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class59 var24 = class59.method450(var23);
            if (var24.field1380 != -1) {
                class40 var25 = this.field412[var24.field1380];
                if (var25 != null) {
                    int var26 = (var24.field1411 * 4 - var25.field1060) / 2;
                    int var27 = (var24.field1379 * 4 - var25.field1061) / 2;
                    var25.method320((byte) -91, arg2 * 4 + 48 + var26, (104 - arg3 - var24.field1379) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field470.field22;
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
        int var31 = this.field589.method571(arg1, arg2, arg3);
        if (arg5 != 3) {
            field364 = this.field483.method312();
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class59 var33 = class59.method450(var32);
            if (var33.field1380 != -1) {
                class40 var34 = this.field412[var33.field1380];
                if (var34 != null) {
                    int var35 = (var33.field1411 * 4 - var34.field1060) / 2;
                    int var36 = (var33.field1379 * 4 - var34.field1061) / 2;
                    var34.method320((byte) -91, arg2 * 4 + 48 + var35, (104 - arg3 - var33.field1379) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method29(String arg0) throws IOException {
        if (!this.field223) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field581 != null) {
                try {
                    this.field581.close();
                } catch (Exception var4) {
                }
                this.field581 = null;
            }
            this.field581 = this.method111(43595);
            this.field581.setSoTimeout(10000);
            InputStream var2 = this.field581.getInputStream();
            OutputStream var3 = this.field581.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILZJNNOVLJ;I)V")
    public final void method30(int arg0, class71 arg1, int arg2) {
        this.method31(arg0, arg1.field1703, arg1.field1702, -627);
        if (arg2 == -15540) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
    public final void method31(int arg0, int arg1, int arg2, int arg3) {
        while (arg3 >= 0) {
            this.method134();
        }
        if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
            int var5 = this.method22(-531, arg2, this.field363, arg1) - arg0;
            int var6 = arg2 - this.field549;
            int var7 = var5 - this.field550;
            int var8 = arg1 - this.field551;
            int var9 = class61.field1509[this.field552];
            int var10 = class61.field1510[this.field552];
            int var11 = class61.field1509[this.field553];
            int var12 = class61.field1510[this.field553];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field576 = (var13 << 9) / var17 + class63.field1555;
                this.field577 = (var16 << 9) / var17 + class63.field1556;
            } else {
                this.field576 = -1;
                this.field577 = -1;
            }
        } else {
            this.field576 = -1;
            this.field577 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field937 != null) {
                    return new URL("http://127.0.0.1:" + (field515 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method32(boolean arg0) {
        this.field235 = true;
        if (arg0) {
            this.field143 = 362;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z")
    public final boolean method33(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > 0) {
            field364 = this.field483.method312();
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field278[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 954;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method34(boolean arg0, int arg1) {
        while (arg1 >= 0) {
            this.field347 = -175;
        }
        if (field353.field1702 >> 7 == this.field468 && field353.field1703 >> 7 == this.field469) {
            this.field468 = 0;
        }
        int var3 = this.field391;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class36 var5;
            int var6;
            if (arg0) {
                var5 = field353;
                var6 = this.field389 << 14;
            } else {
                var5 = this.field390[this.field392[var4]];
                var6 = this.field392[var4] << 14;
            }
            if (var5 != null && var5.method228((byte) 43)) {
                var5.field998 = false;
                if ((field517 && this.field391 > 50 || this.field391 > 200) && !arg0 && var5.field1731 == var5.field1711) {
                    var5.field998 = true;
                }
                int var7 = var5.field1702 >> 7;
                int var8 = var5.field1703 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field997 != null && field399 >= var5.field1018 && field399 < var5.field1019) {
                        var5.field998 = false;
                        var5.field1023 = this.method22(-531, var5.field1702, this.field363, var5.field1703);
                        this.field589.method554((byte) 127, var5, var5.field1008, var5.field1704, var5.field1007, var6, var5.field1023, 60, var5.field1702, var5.field1703, this.field363, var5.field1009, var5.field1010);
                    } else {
                        if ((var5.field1702 & 127) == 64 && (var5.field1703 & 127) == 64) {
                            if (this.field119[var7][var8] == this.field213) {
                                continue;
                            }
                            this.field119[var7][var8] = this.field213;
                        }
                        var5.field1023 = this.method22(-531, var5.field1702, this.field363, var5.field1703);
                        this.field589.method553(var5, var5.field1719, var5.field1703, var5.field1704, var5.field1023, var6, false, this.field363, 60, var5.field1702);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method35(byte arg0) {
        int var2 = this.field205.method181(0, "Choose Option");
        for (int var3 = 0; var3 < this.field114; ++var3) {
            int var11 = this.field205.method181(0, this.field219[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field114 * 15 + 21;
        if (arg0 != -81) {
            this.field454 = this.field337.method388();
        }
        if (super.field949 > 4 && super.field950 > 4 && super.field949 < 516 && super.field950 < 338) {
            int var5 = super.field949 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field950 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field502 = true;
            this.field225 = 0;
            this.field226 = var5;
            this.field227 = var6;
            this.field228 = var2;
            this.field229 = this.field114 * 15 + 22;
        }
        if (super.field949 > 553 && super.field950 > 205 && super.field949 < 743 && super.field950 < 466) {
            int var7 = super.field949 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field950 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field502 = true;
            this.field225 = 1;
            this.field226 = var7;
            this.field227 = var8;
            this.field228 = var2;
            this.field229 = this.field114 * 15 + 22;
        }
        if (super.field949 > 17 && super.field950 > 357 && super.field949 < 496 && super.field950 < 453) {
            int var9 = super.field949 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field950 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field502 = true;
            this.field225 = 2;
            this.field226 = var9;
            this.field227 = var10;
            this.field228 = var2;
            this.field229 = this.field114 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMVRUIIXW;IBII)V")
    public final void method36(class36 arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (field353 != arg0) {
            if (this.field114 < 400) {
                if (arg2 != 31) {
                    this.field501.method378(178);
                }
                String var6;
                if (arg0.field993 == 0) {
                    var6 = arg0.field999 + method100(false, field353.field1017, arg0.field1017) + " (level-" + arg0.field1017 + ")";
                } else {
                    var6 = arg0.field999 + " (skill-" + arg0.field993 + ")";
                }
                if (this.field405 == 1) {
                    this.field219[this.field114] = "Use " + this.field409 + " with @whi@" + var6;
                    this.field278[this.field114] = 189;
                    this.field279[this.field114] = arg1;
                    this.field276[this.field114] = arg4;
                    this.field277[this.field114] = arg3;
                    ++this.field114;
                } else if (this.field380 == 1) {
                    if ((this.field382 & 8) == 8) {
                        this.field219[this.field114] = this.field383 + " @whi@" + var6;
                        this.field278[this.field114] = 943;
                        this.field279[this.field114] = arg1;
                        this.field276[this.field114] = arg4;
                        this.field277[this.field114] = arg3;
                        ++this.field114;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field481[var7] != null) {
                            this.field219[this.field114] = this.field481[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field481[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field1017 > field353.field1017) {
                                    var9 = 2000;
                                }
                                if (field353.field1016 != 0 && arg0.field1016 != 0) {
                                    if (field353.field1016 == arg0.field1016) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field482[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field278[this.field114] = var9 + 173;
                            }
                            if (var7 == 1) {
                                this.field278[this.field114] = var9 + 99;
                            }
                            if (var7 == 2) {
                                this.field278[this.field114] = var9 + 117;
                            }
                            if (var7 == 3) {
                                this.field278[this.field114] = var9 + 485;
                            }
                            if (var7 == 4) {
                                this.field278[this.field114] = var9 + 929;
                            }
                            this.field279[this.field114] = arg1;
                            this.field276[this.field114] = arg4;
                            this.field277[this.field114] = arg3;
                            ++this.field114;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field114; ++var8) {
                    if (this.field278[var8] == 14) {
                        this.field219[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method37(int arg0) {
        try {
            this.field425 = -1;
            this.field478.method210();
            this.field348.method210();
            class63.method517(true);
            this.method118(this.field571);
            this.field589.method542(156);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field585[var2].method283();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field543[var3][var4][var5] = 0;
                    }
                }
            }
            class62 var6 = new class62(this.field543, 104, 379, 104, this.field590);
            int var7 = this.field572.length;
            this.field501.method377(this.field242, 157);
            if (!this.field341) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field130[var8] >> 8) * 64 - this.field562;
                    int var10 = (this.field130[var8] & 255) * 64 - this.field563;
                    byte[] var11 = this.field572[var8];
                    if (var11 != null) {
                        var6.method513(var10, var11, true, this.field585, var9, (this.field524 - 6) * 8, (this.field523 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field130[var12] >> 8) * 64 - this.field562;
                    int var14 = (this.field130[var12] & 255) * 64 - this.field563;
                    byte[] var15 = this.field572[var12];
                    if (var15 == null && this.field524 < 800) {
                        var6.method496(var13, var14, 64, (byte) -60, 64);
                    }
                }
                this.field501.method377(this.field242, 157);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field402[var16];
                    if (var17 != null) {
                        int var18 = (this.field130[var16] >> 8) * 64 - this.field562;
                        int var19 = (this.field130[var16] & 255) * 64 - this.field563;
                        var6.method505(var18, var19, true, this.field585, this.field589, var17);
                    }
                }
            }
            if (this.field341) {
                int var20 = 0;
                label252: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field294[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method496(var31 * 8, var32 * 8, 8, (byte) -60, 8);
                                }
                            }
                        }
                        this.field501.method377(this.field242, 157);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label252;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field294[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field130.length; ++var43) {
                                            if (this.field130[var43] == var42 && this.field402[var43] != null) {
                                                var6.method497(this.field402[var43], var35 * 8, (var41 & 7) * 8, true, var34, this.field585, var39, (var40 & 7) * 8, this.field589, var38, var36 * 8);
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
                            int var24 = this.field294[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field130.length; ++var30) {
                                    if (this.field130[var30] == var29 && this.field572[var30] != null) {
                                        var6.method502(var25, (var28 & 7) * 8, this.field585, var21 * 8, var22 * 8, var26, true, var20, this.field572[var30], (var27 & 7) * 8);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method501(var21 * 8, var22 * 8, 31743, var20);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field501.method377(this.field242, 157);
            var6.method494((byte) 0, this.field589, this.field585);
            if (this.field351 != null) {
                this.field351.method351(-181);
                class63.field1561 = this.field135;
            }
            this.field501.method377(this.field242, 157);
            int var44 = class62.field1520;
            if (var44 > this.field363) {
                var44 = this.field363;
            }
            if (var44 < this.field363 - 1) {
                int var45 = this.field363 - 1;
            }
            if (field517) {
                this.field589.method543((byte) 39, class62.field1520);
            } else {
                this.field589.method543((byte) 39, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method82(var46, var47);
                }
            }
            this.method84((byte) 2);
        } catch (Exception var61) {
        }
        class59.field1378.method3();
        if (super.field937 != null) {
            this.field501.method377(this.field242, 30);
            this.field501.method382(1057001181);
        }
        if (field517 && signlink.cache_dat != null) {
            int var49 = this.field566.method360(0, 1);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field566.method364((byte) 4, var50);
                if ((var51 & 121) == 0) {
                    class61.method465(-291, var50);
                }
            }
        }
        System.gc();
        class63.method518(20, 1);
        this.field566.method359(-41110);
        int var52 = (this.field523 - 6) / 8 - 1;
        int var53 = (this.field523 + 6) / 8 + 1;
        int var54 = (this.field524 - 6) / 8 - 1;
        int var55 = (this.field524 + 6) / 8 + 1;
        int var56 = 77 / arg0;
        if (this.field145) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var57 = var52; var57 <= var53; ++var57) {
            for (int var58 = var54; var58 <= var55; ++var58) {
                if (var52 == var57 || var53 == var57 || var54 == var58 || var55 == var58) {
                    int var59 = this.field566.method365(var57, 0, (byte) 14, var58);
                    if (var59 != -1) {
                        this.field566.method373(var59, 3, 165);
                    }
                    int var60 = this.field566.method365(var57, 1, (byte) 14, var58);
                    if (var60 != -1) {
                        this.field566.method373(var60, 3, 165);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method38(boolean arg0) {
        this.field411 = 0;
        int var2 = (field353.field1702 >> 7) + this.field562;
        int var3 = (field353.field1703 >> 7) + this.field563;
        if (arg0) {
            this.field178 = this.field483.method312();
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field411 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field411 = 1;
        }
        if (this.field411 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field411 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method39(int arg0) {
        short var2 = 256;
        if (this.field518 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field518 > 768) {
                    this.field497[var3] = this.method79(this.field499[var3], this.field498[var3], false, 1024 - this.field518);
                } else if (this.field518 > 256) {
                    this.field497[var3] = this.field499[var3];
                } else {
                    this.field497[var3] = this.method79(this.field498[var3], this.field499[var3], false, 256 - this.field518);
                }
            }
        } else if (this.field519 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field519 > 768) {
                    this.field497[var4] = this.method79(this.field500[var4], this.field498[var4], false, 1024 - this.field519);
                } else if (this.field519 > 256) {
                    this.field497[var4] = this.field500[var4];
                } else {
                    this.field497[var4] = this.method79(this.field498[var4], this.field500[var4], false, 256 - this.field519);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field497[var5] = this.field498[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field191.field1121[var6] = this.field373.field22[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var24 = (var2 - var9) * this.field570[var9] / var2;
            int var25 = var24 + 22;
            if (var25 < 0) {
                var25 = 0;
            }
            var7 += var25;
            for (int var26 = var25; var26 < 128; ++var26) {
                int var27 = this.field400[var7++];
                if (var27 != 0) {
                    int var29 = 256 - var27;
                    int var30 = this.field497[var27];
                    int var31 = this.field191.field1121[var8];
                    this.field191.field1121[var8++] = ((var30 & 16711935) * var27 + (var31 & 16711935) * var29 & -16711936) + ((var30 & 65280) * var27 + (var31 & 65280) * var29 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var25;
        }
        this.field191.method352(0, 0, super.field934, (byte) 108);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field192.field1121[var10] = this.field374.field22[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var15 = (var2 - var13) * this.field570[var13] / var2;
            int var16 = 103 - var15;
            int var17 = var12 + var15;
            for (int var18 = 0; var18 < var16; ++var18) {
                int var19 = this.field400[var11++];
                if (var19 != 0) {
                    int var21 = 256 - var19;
                    int var22 = this.field497[var19];
                    int var23 = this.field192.field1121[var17];
                    this.field192.field1121[var17++] = ((var22 & 16711935) * var19 + (var23 & 16711935) * var21 & -16711936) + ((var22 & 65280) * var19 + (var23 & 65280) * var21 & 16711680) >> 8;
                } else {
                    ++var17;
                }
            }
            var11 += 128 - var16;
            var12 = 128 - var16 - var15 + var17;
        }
        if (arg0 != 1) {
            for (int var14 = 1; var14 > 0; ++var14) {
            }
        }
        this.field192.method352(637, 0, super.field934, (byte) 108);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)V")
    public final void method40(String arg0, int arg1, String arg2, byte arg3) {
        if (arg1 == 0 && this.field599 != -1) {
            this.field177 = arg2;
            super.field948 = 0;
        }
        if (this.field426 == -1) {
            this.field280 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field249[var5] = this.field249[var5 - 1];
            this.field250[var5] = this.field250[var5 - 1];
            this.field251[var5] = this.field251[var5 - 1];
        }
        this.field249[0] = arg1;
        if (arg3 != -118) {
            this.field244 = this.field483.method312();
        }
        this.field250[0] = arg0;
        this.field251[0] = arg2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILRSWRPCHR;I)V")
    private final void method41(int arg0, class50 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field393; ++var4) {
            int var5 = this.field394[var4];
            class24 var6 = this.field272[var5];
            int var7 = arg1.method388();
            if ((var7 & 16) != 0) {
                int var8 = arg1.method407(804);
                int var9 = arg1.method408(382);
                var6.method597(field399, var8, var9, 0);
                var6.field1716 = field399 + 300;
                var6.field1717 = arg1.method407(804);
                var6.field1718 = arg1.method408(382);
            }
            if ((var7 & 128) != 0) {
                var6.field1728 = arg1.method416(-998);
                var6.field1729 = arg1.method414(6);
            }
            if ((var7 & 8) != 0) {
                var6.field876 = class14.method199(arg1.method416(-998));
                var6.field1700 = var6.field876.field691;
                var6.field1710 = var6.field876.field713;
                var6.field1724 = var6.field876.field701;
                var6.field1725 = var6.field876.field718;
                var6.field1726 = var6.field876.field683;
                var6.field1727 = var6.field876.field707;
                var6.field1711 = var6.field876.field716;
            }
            if ((var7 & 64) != 0) {
                int var10 = arg1.method388();
                int var11 = arg1.method406(41312);
                var6.method597(field399, var10, var11, 0);
                var6.field1716 = field399 + 300;
                var6.field1717 = arg1.method406(41312);
                var6.field1718 = arg1.method388();
            }
            if ((var7 & 1) != 0) {
                var6.field1736 = arg1.method414(6);
                int var12 = arg1.method393();
                var6.field1740 = var12 >> 16;
                var6.field1739 = (var12 & 65535) + field399;
                var6.field1737 = 0;
                var6.field1738 = 0;
                if (var6.field1739 > field399) {
                    var6.field1737 = -1;
                }
                if (var6.field1736 == 65535) {
                    var6.field1736 = -1;
                }
            }
            if ((var7 & 32) != 0) {
                var6.field1734 = arg1.method414(6);
                if (var6.field1734 == 65535) {
                    var6.field1734 = -1;
                }
            }
            if ((var7 & 4) != 0) {
                int var13 = arg1.method416(-998);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = arg1.method406(41312);
                if (var6.field1743 == var13 && var13 != -1) {
                    int var15 = class33.field963[var13].field977;
                    if (var15 == 1) {
                        var6.field1744 = 0;
                        var6.field1745 = 0;
                        var6.field1746 = var14;
                        var6.field1747 = 0;
                    }
                    if (var15 == 2) {
                        var6.field1747 = 0;
                    }
                } else if (var13 == -1 || var6.field1743 == -1 || class33.field963[var13].field971 >= class33.field963[var6.field1743].field971) {
                    var6.field1743 = var13;
                    var6.field1744 = 0;
                    var6.field1745 = 0;
                    var6.field1746 = var14;
                    var6.field1747 = 0;
                    var6.field1715 = var6.field1713;
                }
            }
            if ((var7 & 2) != 0) {
                var6.field1714 = arg1.method395();
                var6.field1721 = 100;
            }
        }
        if (arg0 != 45509) {
            this.field454 = arg1.method388();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 3 || arg4 > 3) {
            this.field178 = this.field483.method312();
        }
        this.field465.method320((byte) -91, arg3, arg1);
        this.field466.method320((byte) -91, arg3, arg1 + arg5 - 16);
        class45.method344(arg3, 16, arg5 - 32, arg1 + 16, true, this.field600);
        int var7 = (arg5 - 32) * arg5 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg0 / (arg2 - arg5);
        class45.method344(arg3, 16, var7, arg1 + 16 + var8, true, this.field230);
        class45.method349(this.field331, 14380, arg1 + 16 + var8, arg3, var7);
        class45.method349(this.field331, 14380, arg1 + 16 + var8, arg3 + 1, var7);
        class45.method347(arg1 + 16 + var8, 160, this.field331, arg3, 16);
        class45.method347(arg1 + 17 + var8, 160, this.field331, arg3, 16);
        class45.method349(this.field346, 14380, arg1 + 16 + var8, arg3 + 15, var7);
        class45.method349(this.field346, 14380, arg1 + 17 + var8, arg3 + 14, var7 - 1);
        class45.method347(arg1 + 15 + var8 + var7, 160, this.field346, arg3, 16);
        class45.method347(arg1 + 14 + var8 + var7, 160, this.field346, arg3 + 1, 15);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
    public final void method43(boolean arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field273; ++var3) {
            class24 var4 = this.field272[this.field274[var3]];
            int var5 = (this.field274[var3] << 14) + 536870912;
            if (var4 != null && var4.method228((byte) 43) && var4.field876.field698 == arg1 && var4.field876.method197(-570)) {
                int var6 = var4.field1702 >> 7;
                int var7 = var4.field1703 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1700 == 1 && (var4.field1702 & 127) == 64 && (var4.field1703 & 127) == 64) {
                        if (this.field119[var6][var7] == this.field213) {
                            continue;
                        }
                        this.field119[var6][var7] = this.field213;
                    }
                    if (!var4.field876.field692) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field589.method553(var4, var4.field1719, var4.field1703, var4.field1704, this.method22(-531, var4.field1702, this.field363, var4.field1703), var5, false, this.field363, (var4.field1700 - 1) * 64 + 60, var4.field1702);
                }
            }
        }
        if (arg0) {
            this.field454 = this.field337.method388();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
    public final void method44(boolean arg0, byte[] arg1, int arg2) {
        this.field453 += arg2;
        if (this.field525) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method45(boolean arg0) {
        this.field433 = 0;
        for (int var2 = -1; var2 < this.field391 + this.field273; ++var2) {
            class71 var19;
            if (var2 == -1) {
                var19 = field353;
            } else if (var2 < this.field391) {
                var19 = this.field390[this.field392[var2]];
            } else {
                var19 = this.field272[this.field274[var2 - this.field391]];
            }
            if (var19 != null && var19.method228((byte) 43)) {
                if (var19 instanceof class24) {
                    class14 var20 = ((class24) var19).field876;
                    if (var20.field696 != null) {
                        var20 = var20.method194(-48050);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field391) {
                    class14 var23 = ((class24) var19).field876;
                    if (var23.field686 >= 0 && var23.field686 < this.field496.length) {
                        this.method30(var19.field1730 + 15, var19, -15540);
                        if (this.field576 > -1) {
                            this.field496[var23.field686].method9((byte) -91, this.field576 - 12, this.field577 - 30);
                        }
                    }
                    if (this.field173 == 1 && this.field274[var2 - this.field391] == this.field356 && field399 % 20 < 10) {
                        this.method30(var19.field1730 + 15, var19, -15540);
                        if (this.field576 > -1) {
                            this.field171[0].method9((byte) -91, this.field576 - 12, this.field577 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class36 var22 = (class36) var19;
                    if (var22.field1013 != -1 || var22.field1015 != -1) {
                        this.method30(var19.field1730 + 15, var19, -15540);
                        if (this.field576 > -1) {
                            if (var22.field1013 != -1) {
                                this.field520[var22.field1013].method9((byte) -91, this.field576 - 12, this.field577 - var21);
                                var21 += 25;
                            }
                            if (var22.field1015 != -1) {
                                this.field496[var22.field1015].method9((byte) -91, this.field576 - 12, this.field577 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field173 == 10 && this.field392[var2] == this.field416) {
                        this.method30(var19.field1730 + 15, var19, -15540);
                        if (this.field576 > -1) {
                            this.field171[1].method9((byte) -91, this.field576 - 12, this.field577 - var21);
                        }
                    }
                }
                if (var19.field1714 != null && (var2 >= this.field391 || this.field385 == 0 || this.field385 == 3 || this.field385 == 1 && this.method126(((class36) var19).field999, (byte) 1))) {
                    this.method30(var19.field1730, var19, -15540);
                    if (this.field576 > -1 && this.field433 < this.field434) {
                        this.field438[this.field433] = this.field205.method182(162, var19.field1714) / 2;
                        this.field437[this.field433] = this.field205.field673;
                        this.field435[this.field433] = this.field576;
                        this.field436[this.field433] = this.field577;
                        this.field439[this.field433] = var19.field1741;
                        this.field440[this.field433] = var19.field1705;
                        this.field441[this.field433] = var19.field1721;
                        this.field442[this.field433++] = var19.field1714;
                        if (this.field471 == 0 && var19.field1705 >= 1 && var19.field1705 <= 3) {
                            this.field437[this.field433] += 10;
                            this.field436[this.field433] += 5;
                        }
                        if (this.field471 == 0 && var19.field1705 == 4) {
                            this.field438[this.field433] = 60;
                        }
                        if (this.field471 == 0 && var19.field1705 == 5) {
                            this.field437[this.field433] += 5;
                        }
                    }
                }
                if (var19.field1716 > field399) {
                    this.method30(var19.field1730 + 15, var19, -15540);
                    if (this.field576 > -1) {
                        int var24 = var19.field1717 * 30 / var19.field1718;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class45.method344(this.field576 - 15, var24, 5, this.field577 - 3, true, 65280);
                        class45.method344(this.field576 - 15 + var24, 30 - var24, 5, this.field577 - 3, true, 16711680);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1709[var25] > field399) {
                        this.method30(var19.field1730 / 2, var19, -15540);
                        if (this.field576 > -1) {
                            if (var25 == 1) {
                                this.field577 -= 20;
                            }
                            if (var25 == 2) {
                                this.field576 -= 15;
                                this.field577 -= 10;
                            }
                            if (var25 == 3) {
                                this.field576 += 15;
                                this.field577 -= 10;
                            }
                            this.field257[var19.field1708[var25]].method9((byte) -91, this.field576 - 12, this.field577 - 12);
                            this.field203.method179(-35070, 0, this.field576, this.field577 + 4, String.valueOf(var19.field1707[var25]));
                            this.field203.method179(-35070, 16777215, this.field576 - 1, this.field577 + 3, String.valueOf(var19.field1707[var25]));
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field433; ++var3) {
            int var4 = this.field435[var3];
            int var5 = this.field436[var3];
            int var6 = this.field438[var3];
            int var7 = this.field437[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field436[var18] - this.field437[var18] && var5 - var7 < this.field436[var18] + 2 && var4 - var6 < this.field438[var18] + this.field435[var18] && var4 + var6 > this.field435[var18] - this.field438[var18] && this.field436[var18] - this.field437[var18] < var5) {
                        var5 = this.field436[var18] - this.field437[var18];
                        var8 = true;
                    }
                }
            }
            this.field576 = this.field435[var3];
            this.field577 = this.field436[var3] = var5;
            String var9 = this.field442[var3];
            if (this.field471 == 0) {
                int var10 = 16776960;
                if (this.field439[var3] < 6) {
                    var10 = this.field404[this.field439[var3]];
                }
                if (this.field439[var3] == 6) {
                    var10 = this.field213 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field439[var3] == 7) {
                    var10 = this.field213 % 20 < 10 ? 255 : 65535;
                }
                if (this.field439[var3] == 8) {
                    var10 = this.field213 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field439[var3] == 9) {
                    int var11 = 150 - this.field441[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field439[var3] == 10) {
                    int var12 = 150 - this.field441[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field439[var3] == 11) {
                    int var13 = 150 - this.field441[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field440[var3] == 0) {
                    this.field205.method179(-35070, 0, this.field576, this.field577 + 1, var9);
                    this.field205.method179(-35070, var10, this.field576, this.field577, var9);
                }
                if (this.field440[var3] == 1) {
                    this.field205.method184(var9, this.field577 + 1, 0, this.field213, this.field413, this.field576);
                    this.field205.method184(var9, this.field577, var10, this.field213, this.field413, this.field576);
                }
                if (this.field440[var3] == 2) {
                    this.field205.method185(true, this.field213, var9, this.field576, 0, this.field577 + 1);
                    this.field205.method185(true, this.field213, var9, this.field576, var10, this.field577);
                }
                if (this.field440[var3] == 3) {
                    this.field205.method186(150 - this.field441[var3], this.field213, this.field577 + 1, var9, 0, this.field576, 4410);
                    this.field205.method186(150 - this.field441[var3], this.field213, this.field577, var9, var10, this.field576, 4410);
                }
                if (this.field440[var3] == 4) {
                    int var14 = this.field205.method182(162, var9);
                    int var15 = (150 - this.field441[var3]) * (var14 + 100) / 150;
                    class45.method341(0, this.field576 + 50, this.field576 - 50, 334, -44482);
                    this.field205.method183(this.field576 + 50 - var15, (byte) 0, 0, this.field577 + 1, var9);
                    this.field205.method183(this.field576 + 50 - var15, (byte) 0, var10, this.field577, var9);
                    class45.method340(3393);
                }
                if (this.field440[var3] == 5) {
                    int var16 = 150 - this.field441[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class45.method341(this.field577 - this.field205.field673 - 1, 512, 0, this.field577 + 5, -44482);
                    this.field205.method179(-35070, 0, this.field576, this.field577 + 1 + var17, var9);
                    this.field205.method179(-35070, var10, this.field576, this.field577 + var17, var9);
                    class45.method340(3393);
                }
            } else {
                this.field205.method179(-35070, 0, this.field576, this.field577 + 1, var9);
                this.field205.method179(-35070, 16776960, this.field576, this.field577, var9);
            }
        }
        if (arg0) {
            this.field178 = this.field483.method312();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILEKQCVRVG;II)V")
    public final void method46(int arg0, int arg1, class14 arg2, int arg3, int arg4) {
        if (this.field114 < 400) {
            if (arg2.field696 != null) {
                arg2 = arg2.method194(-48050);
            }
            if (arg2 != null) {
                if (arg2.field692) {
                    String var6 = arg2.field677;
                    if (arg0 >= 0) {
                        this.field501.method378(44);
                    }
                    if (arg2.field714 != 0) {
                        var6 = var6 + method100(false, field353.field1017, arg2.field714) + " (level-" + arg2.field714 + ")";
                    }
                    if (this.field405 == 1) {
                        this.field219[this.field114] = "Use " + this.field409 + " with @yel@" + var6;
                        this.field278[this.field114] = 442;
                        this.field279[this.field114] = arg1;
                        this.field276[this.field114] = arg3;
                        this.field277[this.field114] = arg4;
                        ++this.field114;
                    } else {
                        if (this.field380 == 1) {
                            if ((this.field382 & 2) == 2) {
                                this.field219[this.field114] = this.field383 + " @yel@" + var6;
                                this.field278[this.field114] = 507;
                                this.field279[this.field114] = arg1;
                                this.field276[this.field114] = arg3;
                                this.field277[this.field114] = arg4;
                                ++this.field114;
                                return;
                            }
                        } else {
                            if (arg2.field678 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg2.field678[var7] != null && !arg2.field678[var7].equalsIgnoreCase("attack")) {
                                        this.field219[this.field114] = arg2.field678[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field278[this.field114] = 674;
                                        }
                                        if (var7 == 1) {
                                            this.field278[this.field114] = 823;
                                        }
                                        if (var7 == 2) {
                                            this.field278[this.field114] = 732;
                                        }
                                        if (var7 == 3) {
                                            this.field278[this.field114] = 248;
                                        }
                                        if (var7 == 4) {
                                            this.field278[this.field114] = 229;
                                        }
                                        this.field279[this.field114] = arg1;
                                        this.field276[this.field114] = arg3;
                                        this.field277[this.field114] = arg4;
                                        ++this.field114;
                                    }
                                }
                            }
                            if (arg2.field678 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field678[var8] != null && arg2.field678[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg2.field714 > field353.field1017) {
                                            var9 = 2000;
                                        }
                                        this.field219[this.field114] = arg2.field678[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field278[this.field114] = var9 + 674;
                                        }
                                        if (var8 == 1) {
                                            this.field278[this.field114] = var9 + 823;
                                        }
                                        if (var8 == 2) {
                                            this.field278[this.field114] = var9 + 732;
                                        }
                                        if (var8 == 3) {
                                            this.field278[this.field114] = var9 + 248;
                                        }
                                        if (var8 == 4) {
                                            this.field278[this.field114] = var9 + 229;
                                        }
                                        this.field279[this.field114] = arg1;
                                        this.field276[this.field114] = arg3;
                                        this.field277[this.field114] = arg4;
                                        ++this.field114;
                                    }
                                }
                            }
                            this.field219[this.field114] = "Examine @yel@" + var6;
                            this.field278[this.field114] = 1987;
                            this.field279[this.field114] = arg1;
                            this.field276[this.field114] = arg3;
                            this.field277[this.field114] = arg4;
                            ++this.field114;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method47(boolean arg0) {
        this.field269 &= arg0;
        if (this.field420 == 0) {
            if (super.field948 == 1) {
                int var2 = super.field949 - 25 - 550;
                int var3 = super.field950 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field334 + this.field168 & 2047;
                    int var5 = class63.field1559[var4];
                    int var6 = class63.field1560[var4];
                    int var7 = (this.field462 + 256) * var5 >> 8;
                    int var8 = (this.field462 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field353.field1702 + var9 >> 7;
                    int var12 = field353.field1703 - var10 >> 7;
                    boolean var13 = this.method77(0, 0, 0, var11, 0, field353.field1722[0], field353.field1723[0], 0, var12, true, 1, 0);
                    if (var13) {
                        this.field501.method378(var2);
                        this.field501.method378(var3);
                        this.field501.method379(this.field334);
                        this.field501.method378(57);
                        this.field501.method378(this.field168);
                        this.field501.method378(this.field462);
                        this.field501.method378(89);
                        this.field501.method379(field353.field1702);
                        this.field501.method379(field353.field1703);
                        this.field501.method378(this.field292);
                        this.field501.method378(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;B)LFXNTEMPE;")
    public final class18 method48(int arg0, String arg1, int arg2, int arg3, String arg4, byte arg5) {
        byte[] var7 = null;
        if (this.field215 != arg5) {
            this.method134();
        }
        int var8 = 5;
        try {
            if (this.field379[0] != null) {
                var7 = this.field379[0].method593(arg2, (byte) 46);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field586.reset();
            this.field586.update(var7);
            int var9 = (int) this.field586.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class18(var7, (byte) 3);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method146(arg0, "Requesting " + arg4, field118);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method29(arg1 + arg3);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class50 var17 = new class50(var16, -46859);
                    var17.field1225 = 3;
                    int var18 = var17.method392() + 6;
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
                            this.method146(arg0, "Loading " + arg4 + " - " + var23 + "%", field118);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field379[0] != null) {
                            this.field379[0].method594((byte) 56, var7, var7.length, arg2);
                        }
                    } catch (Exception var29) {
                        this.field379[0] = null;
                    }
                    if (var7 != null) {
                        this.field586.reset();
                        this.field586.update(var7);
                        int var24 = (int) this.field586.getValue();
                        if (arg3 != var24) {
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
                            this.method146(arg0, "Game updated - please reload page", field118);
                            var26 = 10;
                        } else {
                            this.method146(arg0, var12 + " - Retrying in " + var26, field118);
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
                    this.field223 = !this.field223;
                }
            }
            return new class18(var7, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method49(int arg0) {
        this.field163 = false;
        while (this.field598) {
            this.field163 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field489 = null;
        this.field490 = null;
        this.field164 = null;
        if (arg0 != 0) {
            field464 = true;
        }
        this.field497 = null;
        this.field498 = null;
        this.field499 = null;
        this.field500 = null;
        this.field486 = null;
        this.field487 = null;
        this.field400 = null;
        this.field401 = null;
        this.field373 = null;
        this.field374 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method50(int arg0, int arg1) {
        int[] var3 = this.field470.field22;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field543[arg0][var24][var6] & 24) == 0) {
                    this.field589.method577(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field543[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field589.method577(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        if (arg1 <= 0) {
            this.field501.method378(69);
        }
        this.field470.method4(-181);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field543[arg0][var22][var9] & 24) == 0) {
                    this.method28(var8, arg0, var22, var9, var7, 3);
                }
                if (arg0 < 3 && (this.field543[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method28(var8, arg0 + 1, var22, var9, var7, 3);
                }
            }
        }
        if (this.field351 != null) {
            this.field351.method351(-181);
            class63.field1561 = this.field135;
        }
        ++field521;
        if (field521 > 89) {
            field521 = 0;
            this.field501.method377(this.field242, 204);
        }
        this.field289 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field589.method571(this.field363, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class59.method450(var13).field1399;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field585[this.field363].field921;
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
                        this.field368[this.field289] = this.field365[var14];
                        this.field290[this.field289] = var15;
                        this.field291[this.field289] = var16;
                        ++this.field289;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Z")
    public final boolean method51(int arg0) {
        if (arg0 != 9) {
            this.field454 = -1;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method52(int arg0) {
        if (arg0 >= this.field511 && arg0 <= this.field511) {
            while (true) {
                class2 var2 = this.field566.method368();
                if (var2 == null) {
                    return;
                }
                if (var2.field11 == 0) {
                    class61.method464(var2.field14, var2.field10, -11732);
                    if ((this.field566.method364((byte) 4, var2.field10) & 98) != 0) {
                        this.field410 = true;
                        if (this.field426 != -1 || this.field599 != -1) {
                            this.field280 = true;
                        }
                    }
                }
                if (var2.field11 == 1 && var2.field14 != null) {
                    class44.method335(var2.field14, 0);
                }
                if (var2.field11 == 2 && this.field183 == var2.field10 && var2.field14 != null) {
                    this.method44(this.field184, var2.field14, 0);
                }
                if (var2.field11 == 3 && this.field443 == 1) {
                    for (int var3 = 0; var3 < this.field572.length; ++var3) {
                        if (this.field131[var3] == var2.field10) {
                            this.field572[var3] = var2.field14;
                            if (var2.field14 == null) {
                                this.field131[var3] = -1;
                            }
                            break;
                        }
                        if (this.field132[var3] == var2.field10) {
                            this.field402[var3] = var2.field14;
                            if (var2.field14 == null) {
                                this.field132[var3] = -1;
                            }
                            break;
                        }
                    }
                }
                if (var2.field11 == 93 && this.field566.method358(var2.field10, (byte) 123)) {
                    class62.method504(new class50(var2.field14, -46859), true, this.field566);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (arg0 != 0) {
            this.field362 = this.field483.method312();
        }
        try {
            int var2 = field353.field1702 + this.field596;
            int var3 = field353.field1703 + this.field422;
            if (this.field197 - var2 < -500 || this.field197 - var2 > 500 || this.field198 - var3 < -500 || this.field198 - var3 > 500) {
                this.field197 = var2;
                this.field198 = var3;
            }
            if (this.field197 != var2) {
                this.field197 += (var2 - this.field197) / 16;
            }
            if (this.field198 != var3) {
                this.field198 += (var3 - this.field198) / 16;
            }
            if (super.field952[1] == 1) {
                this.field335 += (-24 - this.field335) / 2;
            } else if (super.field952[2] == 1) {
                this.field335 += (24 - this.field335) / 2;
            } else {
                this.field335 /= 2;
            }
            if (super.field952[3] == 1) {
                this.field336 += (12 - this.field336) / 2;
            } else if (super.field952[4] == 1) {
                this.field336 += (-12 - this.field336) / 2;
            } else {
                this.field336 /= 2;
            }
            this.field334 = this.field335 / 2 + this.field334 & 2047;
            this.field333 += this.field336 / 2;
            if (this.field333 < 128) {
                this.field333 = 128;
            }
            if (this.field333 > 383) {
                this.field333 = 383;
            }
            int var4 = this.field197 >> 7;
            int var5 = this.field198 >> 7;
            int var6 = this.method22(-531, this.field197, this.field363, this.field198);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field363;
                        if (var10 < 3 && (this.field543[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field590[var10][var8][var9];
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
            if (var12 > this.field492) {
                this.field492 += (var12 - this.field492) / 24;
            } else if (var12 < this.field492) {
                this.field492 += (var12 - this.field492) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field353.field1702 + "," + field353.field1703 + "," + this.field197 + "," + this.field198 + "," + this.field523 + "," + this.field524 + "," + this.field562 + "," + this.field563);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method54(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method54(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method55(int arg0) {
        class67.field1607 = true;
        class63.field1550 = true;
        field517 = true;
        class62.field1530 = true;
        class59.field1412 = true;
        if (field364 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIGMZHLWJ;Z)Z")
    public final boolean method56(class22 arg0, boolean arg1) {
        int var3 = arg0.field833;
        if (arg1) {
            this.field454 = -1;
        }
        if (this.field446 == 2) {
            if (var3 == 201) {
                this.field280 = true;
                this.field474 = 0;
                this.field509 = true;
                this.field601 = "";
                this.field222 = 1;
                this.field240 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field280 = true;
                this.field474 = 0;
                this.field509 = true;
                this.field601 = "";
                this.field222 = 2;
                this.field240 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field457 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field280 = true;
                this.field474 = 0;
                this.field509 = true;
                this.field601 = "";
                this.field222 = 4;
                this.field240 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field280 = true;
                this.field474 = 0;
                this.field509 = true;
                this.field601 = "";
                this.field222 = 5;
                this.field240 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field275[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class35.field985 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class35.field985) {
                                var6 = 0;
                            }
                        }
                        if (!class35.field986[var6].field992 && class35.field986[var6].field987 == var4 + (this.field495 ? 0 : 7)) {
                            this.field275[var4] = var6;
                            this.field493 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field129[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field146[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field146[var7].length) {
                        var9 = 0;
                    }
                }
                this.field129[var7] = var9;
                this.field493 = true;
            }
            if (var3 == 324 && !this.field495) {
                this.field495 = true;
                this.method158(false);
            }
            if (var3 == 325 && this.field495) {
                this.field495 = false;
                this.method158(false);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field398 = !this.field398;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method145((byte) 21);
                    if (this.field450.length() > 0) {
                        this.field501.method377(this.field242, 71);
                        this.field501.method384(class9.method168(this.field450), -12199);
                        this.field501.method378(var3 - 601);
                        this.field501.method378(this.field398 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field501.method377(this.field242, 95);
                this.field501.method378(this.field495 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field501.method378(this.field275[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field501.method378(this.field129[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (arg0 != 8322) {
            this.field501.method378(207);
        }
        if (this.field300 == 0) {
            int var2 = super.field948;
            if (this.field380 == 1 && super.field949 >= 516 && super.field950 >= 160 && super.field949 <= 765 && super.field950 <= 205) {
                var2 = 0;
            }
            if (this.field502) {
                if (var2 != 1) {
                    int var3 = super.field942;
                    int var4 = super.field943;
                    if (this.field225 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field225 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field225 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field226 - 10 || var3 > this.field228 + this.field226 + 10 || var4 < this.field227 - 10 || var4 > this.field229 + this.field227 + 10) {
                        this.field502 = false;
                        if (this.field225 == 1) {
                            this.field410 = true;
                        }
                        if (this.field225 == 2) {
                            this.field280 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field226;
                    int var6 = this.field227;
                    int var7 = this.field228;
                    int var8 = super.field949;
                    int var9 = super.field950;
                    if (this.field225 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field225 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field225 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field114; ++var11) {
                        int var12 = (this.field114 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method81(-6869, var10);
                    }
                    this.field502 = false;
                    if (this.field225 == 1) {
                        this.field410 = true;
                    }
                    if (this.field225 == 2) {
                        this.field280 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field114 > 0) {
                    int var13 = this.field278[this.field114 - 1];
                    if (var13 == 372 || var13 == 648 || var13 == 627 || var13 == 555 || var13 == 395 || var13 == 653 || var13 == 828 || var13 == 233 || var13 == 804 || var13 == 918 || var13 == 937 || var13 == 1624) {
                        int var14 = this.field276[this.field114 - 1];
                        int var15 = this.field277[this.field114 - 1];
                        class22 var16 = class22.method215(var15);
                        if (var16.field817 || var16.field792) {
                            this.field485 = false;
                            this.field488 = 0;
                            this.field298 = var15;
                            this.field299 = var14;
                            this.field300 = 2;
                            this.field301 = super.field949;
                            this.field302 = super.field950;
                            if (class22.method215(var15).field804 == this.field430) {
                                this.field300 = 1;
                            }
                            if (class22.method215(var15).field804 == this.field426) {
                                this.field300 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field281 == 1 || this.method33(0, this.field114 - 1)) && this.field114 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field114 > 0) {
                    this.method81(-6869, this.field114 - 1);
                }
                if (var2 != 2 || this.field114 <= 0) {
                    return;
                }
                this.method35((byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    private final void method58(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            this.field242 = 345;
        }
        if (this.field443 == 2) {
            for (class54 var2 = (class54) this.field325.method206(); var2 != null; var2 = (class54) this.field325.method208(262)) {
                if (var2.field1308 > 0) {
                    --var2.field1308;
                }
                if (var2.field1308 == 0) {
                    if (var2.field1305 < 0 || class62.method492(var2.field1305, 0, var2.field1307)) {
                        this.method103((byte) 36, var2.field1310, var2.field1309, var2.field1306, var2.field1305, var2.field1307, var2.field1311, var2.field1312);
                        var2.method20();
                    }
                } else {
                    if (var2.field1316 > 0) {
                        --var2.field1316;
                    }
                    if (var2.field1316 == 0 && var2.field1311 >= 1 && var2.field1312 >= 1 && var2.field1311 <= 102 && var2.field1312 <= 102 && (var2.field1313 < 0 || class62.method492(var2.field1313, 0, var2.field1315))) {
                        this.method103((byte) 36, var2.field1310, var2.field1309, var2.field1314, var2.field1313, var2.field1315, var2.field1311, var2.field1312);
                        var2.field1316 = -1;
                        if (var2.field1313 == var2.field1305 && var2.field1305 == -1) {
                            var2.method20();
                        } else if (var2.field1313 == var2.field1305 && var2.field1314 == var2.field1306 && var2.field1315 == var2.field1307) {
                            var2.method20();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Ljava/lang/String;")
    public final String method59(int arg0) {
        this.field453 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field937 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method60(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        while (arg0 >= 0) {
            field152 = !field152;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILRSWRPCHR;)V")
    private final void method61(int arg0, int arg1, class50 arg2) {
        while (true) {
            if (arg2.field1226 + 21 < arg1 * 8) {
                int var4 = arg2.method399(0, 14);
                if (var4 != 16383) {
                    if (this.field272[var4] == null) {
                        this.field272[var4] = new class24();
                    }
                    class24 var5 = this.field272[var4];
                    this.field274[this.field273++] = var4;
                    var5.field1720 = field399;
                    int var6 = arg2.method399(0, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method399(0, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method399(0, 1);
                    int var9 = arg2.method399(0, 1);
                    if (var9 == 1) {
                        this.field394[this.field393++] = var4;
                    }
                    var5.field876 = class14.method199(arg2.method399(0, 13));
                    var5.field1700 = var5.field876.field691;
                    var5.field1710 = var5.field876.field713;
                    var5.field1724 = var5.field876.field701;
                    var5.field1725 = var5.field876.field718;
                    var5.field1726 = var5.field876.field683;
                    var5.field1727 = var5.field876.field707;
                    var5.field1711 = var5.field876.field716;
                    var5.method600(var8 == 1, field353.field1723[0] + var6, field353.field1722[0] + var7, -40589);
                    continue;
                }
            }
            arg2.method400((byte) -67);
            if (arg0 != -14872) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method62(int arg0) {
        if (arg0 != 7) {
            field338 = !field338;
        }
        int var2 = this.field155 * 128 + 64;
        int var3 = this.field156 * 128 + 64;
        int var4 = this.method22(-531, var2, this.field363, var3) - this.field157;
        if (this.field549 < var2) {
            this.field549 += (var2 - this.field549) * this.field159 / 1000 + this.field158;
            if (this.field549 > var2) {
                this.field549 = var2;
            }
        }
        if (this.field549 > var2) {
            this.field549 -= (this.field549 - var2) * this.field159 / 1000 + this.field158;
            if (this.field549 < var2) {
                this.field549 = var2;
            }
        }
        if (this.field550 < var4) {
            this.field550 += (var4 - this.field550) * this.field159 / 1000 + this.field158;
            if (this.field550 > var4) {
                this.field550 = var4;
            }
        }
        if (this.field550 > var4) {
            this.field550 -= (this.field550 - var4) * this.field159 / 1000 + this.field158;
            if (this.field550 < var4) {
                this.field550 = var4;
            }
        }
        if (this.field551 < var3) {
            this.field551 += (var3 - this.field551) * this.field159 / 1000 + this.field158;
            if (this.field551 > var3) {
                this.field551 = var3;
            }
        }
        if (this.field551 > var3) {
            this.field551 -= (this.field551 - var3) * this.field159 / 1000 + this.field158;
            if (this.field551 < var3) {
                this.field551 = var3;
            }
        }
        int var5 = this.field532 * 128 + 64;
        int var6 = this.field533 * 128 + 64;
        int var7 = this.method22(-531, var5, this.field363, var6) - this.field534;
        int var8 = var5 - this.field549;
        int var9 = var7 - this.field550;
        int var10 = var6 - this.field551;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field552 < var12) {
            this.field552 += (var12 - this.field552) * this.field536 / 1000 + this.field535;
            if (this.field552 > var12) {
                this.field552 = var12;
            }
        }
        if (this.field552 > var12) {
            this.field552 -= (this.field552 - var12) * this.field536 / 1000 + this.field535;
            if (this.field552 < var12) {
                this.field552 = var12;
            }
        }
        int var14 = var13 - this.field553;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field553 += this.field536 * var14 / 1000 + this.field535;
            this.field553 &= 2047;
        }
        if (var14 < 0) {
            this.field553 -= -var14 * this.field536 / 1000 + this.field535;
            this.field553 &= 2047;
        }
        int var15 = var13 - this.field553;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field553 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method63(int arg0) {
        while (arg0 >= 0) {
            this.field454 = this.field337.method388();
        }
        for (int var2 = 0; var2 < this.field424; ++var2) {
            if (this.field384[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field176[var2] == this.field167 && this.field303[var2] == this.field367) {
                        if (!this.method51(9)) {
                            var3 = true;
                        }
                    } else {
                        class50 var4 = class43.method329(0, this.field303[var2], this.field176[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1225 / 22) > (long) (this.field444 / 22) + this.field415) {
                            this.field444 = var4.field1225;
                            this.field415 = System.currentTimeMillis();
                            if (this.method88(true, var4.field1225, var4.field1224)) {
                                this.field167 = this.field176[var2];
                                this.field367 = this.field303[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field501.method377(this.field242, 149);
                        this.field501.method379(this.field176[var2] & 32767);
                    } else {
                        this.field501.method377(this.field242, 149);
                        this.field501.method379(-1);
                    }
                }
                if (var3 && this.field384[var2] != -5) {
                    this.field384[var2] = -5;
                } else {
                    --this.field424;
                    for (int var6 = var2; var6 < this.field424; ++var6) {
                        this.field176[var6] = this.field176[var6 + 1];
                        this.field303[var6] = this.field303[var6 + 1];
                        this.field384[var6] = this.field384[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field384[var2]--;
            }
        }
        if (this.field165 > 0) {
            this.field165 -= 20;
            if (this.field165 < 0) {
                this.field165 = 0;
            }
            if (this.field165 == 0 && this.field525 && !field517) {
                this.field183 = this.field386;
                this.field184 = true;
                this.field566.method370(2, this.field183);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method64(byte arg0) {
        this.field350.method351(-181);
        if (this.field420 == 2) {
            byte[] var2 = this.field318.field1058;
            int[] var3 = class45.field1109;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field161.method13(this.field334, 0, 0, this.field297, 256, 218, this.field216, 33, 25, 33, 25);
            this.field351.method351(-181);
            class63.field1561 = this.field135;
        } else {
            int var6 = this.field334 + this.field168 & 2047;
            int var7 = field353.field1702 / 32 + 48;
            int var8 = 464 - field353.field1703 / 32;
            this.field470.method13(var6, 5, 25, this.field238, this.field462 + 256, 218, this.field270, 151, var8, 146, var7);
            this.field161.method13(this.field334, 0, 0, this.field297, 256, 218, this.field216, 33, 25, 33, 25);
            for (int var9 = 0; var9 < this.field289; ++var9) {
                int var39 = this.field290[var9] * 4 + 2 - field353.field1702 / 32;
                int var40 = this.field291[var9] * 4 + 2 - field353.field1703 / 32;
                this.method149((byte) 116, var39, var40, this.field368[var9]);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class17 var36 = this.field574[this.field363][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field353.field1702 / 32;
                        int var38 = var35 * 4 + 2 - field353.field1703 / 32;
                        this.method149((byte) 116, var37, var38, this.field124);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field273; ++var11) {
                class24 var31 = this.field272[this.field274[var11]];
                if (var31 != null && var31.method228((byte) 43)) {
                    class14 var32 = var31.field876;
                    if (var32.field696 != null) {
                        var32 = var32.method194(-48050);
                    }
                    if (var32 != null && var32.field711 && var32.field692) {
                        int var33 = var31.field1702 / 32 - field353.field1702 / 32;
                        int var34 = var31.field1703 / 32 - field353.field1703 / 32;
                        this.method149((byte) 116, var33, var34, this.field125);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field391; ++var12) {
                class36 var23 = this.field390[this.field392[var12]];
                if (var23 != null && var23.method228((byte) 43)) {
                    int var24 = var23.field1702 / 32 - field353.field1702 / 32;
                    int var25 = var23.field1703 / 32 - field353.field1703 / 32;
                    boolean var26 = false;
                    long var27 = class9.method168(var23.field999);
                    for (int var29 = 0; var29 < this.field445; ++var29) {
                        if (this.field324[var29] == var27 && this.field568[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field353.field1016 != 0 && var23.field1016 != 0 && field353.field1016 == var23.field1016) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method149((byte) 116, var24, var25, this.field127);
                    } else if (var30) {
                        this.method149((byte) 116, var24, var25, this.field128);
                    } else {
                        this.method149((byte) 116, var24, var25, this.field126);
                    }
                }
            }
            if (this.field173 != 0 && field399 % 20 < 10) {
                if (this.field173 == 1 && this.field356 >= 0 && this.field356 < this.field272.length) {
                    class24 var13 = this.field272[this.field356];
                    if (var13 != null) {
                        int var14 = var13.field1702 / 32 - field353.field1702 / 32;
                        int var15 = var13.field1703 / 32 - field353.field1703 / 32;
                        this.method85(var14, (byte) 6, this.field218, var15);
                    }
                }
                if (this.field173 == 2) {
                    int var16 = (this.field258 - this.field562) * 4 + 2 - field353.field1702 / 32;
                    int var17 = (this.field259 - this.field563) * 4 + 2 - field353.field1703 / 32;
                    this.method85(var16, (byte) 6, this.field218, var17);
                }
                if (this.field173 == 10 && this.field416 >= 0 && this.field416 < this.field390.length) {
                    class36 var18 = this.field390[this.field416];
                    if (var18 != null) {
                        int var19 = var18.field1702 / 32 - field353.field1702 / 32;
                        int var20 = var18.field1703 / 32 - field353.field1703 / 32;
                        this.method85(var19, (byte) 6, this.field218, var20);
                    }
                }
            }
            if (this.field468 != 0) {
                int var21 = this.field468 * 4 + 2 - field353.field1702 / 32;
                int var22 = this.field469 * 4 + 2 - field353.field1703 / 32;
                this.method149((byte) 116, var21, var22, this.field217);
            }
            class45.method344(97, 3, 3, 78, true, 16777215);
            this.field351.method351(-181);
            class63.field1561 = this.field135;
            if (arg0 != -78) {
                this.field150 = !this.field150;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method65(boolean arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            if (arg0) {
                this.field595 = -348;
            }
            String[] var4 = new String[100];
            int var5 = 0;
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field505 = 0;
                    label51: for (int var9 = 0; var9 < class51.field1270; ++var9) {
                        class51 var10 = class51.method433(var9);
                        if (var10.field1285 == -1 && var10.field1269 != null) {
                            String var11 = var10.field1269.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label51;
                                }
                            }
                            this.field506[this.field505] = var11;
                            this.field507[this.field505] = var9;
                            ++this.field505;
                            if (this.field505 >= this.field506.length) {
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
            this.field505 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (arg0 != 35473) {
            this.field574 = null;
        }
        if (super.field948 == 1) {
            if (super.field949 >= 539 && super.field949 <= 573 && super.field950 >= 169 && super.field950 < 205 && this.field372[0] != -1) {
                this.field410 = true;
                this.field429 = 0;
                this.field467 = true;
            }
            if (super.field949 >= 569 && super.field949 <= 599 && super.field950 >= 168 && super.field950 < 205 && this.field372[1] != -1) {
                this.field410 = true;
                this.field429 = 1;
                this.field467 = true;
            }
            if (super.field949 >= 597 && super.field949 <= 627 && super.field950 >= 168 && super.field950 < 205 && this.field372[2] != -1) {
                this.field410 = true;
                this.field429 = 2;
                this.field467 = true;
            }
            if (super.field949 >= 625 && super.field949 <= 669 && super.field950 >= 168 && super.field950 < 203 && this.field372[3] != -1) {
                this.field410 = true;
                this.field429 = 3;
                this.field467 = true;
            }
            if (super.field949 >= 666 && super.field949 <= 696 && super.field950 >= 168 && super.field950 < 205 && this.field372[4] != -1) {
                this.field410 = true;
                this.field429 = 4;
                this.field467 = true;
            }
            if (super.field949 >= 694 && super.field949 <= 724 && super.field950 >= 168 && super.field950 < 205 && this.field372[5] != -1) {
                this.field410 = true;
                this.field429 = 5;
                this.field467 = true;
            }
            if (super.field949 >= 722 && super.field949 <= 756 && super.field950 >= 169 && super.field950 < 205 && this.field372[6] != -1) {
                this.field410 = true;
                this.field429 = 6;
                this.field467 = true;
            }
            if (super.field949 >= 540 && super.field949 <= 574 && super.field950 >= 466 && super.field950 < 502 && this.field372[7] != -1) {
                this.field410 = true;
                this.field429 = 7;
                this.field467 = true;
            }
            if (super.field949 >= 572 && super.field949 <= 602 && super.field950 >= 466 && super.field950 < 503 && this.field372[8] != -1) {
                this.field410 = true;
                this.field429 = 8;
                this.field467 = true;
            }
            if (super.field949 >= 599 && super.field949 <= 629 && super.field950 >= 466 && super.field950 < 503 && this.field372[9] != -1) {
                this.field410 = true;
                this.field429 = 9;
                this.field467 = true;
            }
            if (super.field949 >= 627 && super.field949 <= 671 && super.field950 >= 467 && super.field950 < 502 && this.field372[10] != -1) {
                this.field410 = true;
                this.field429 = 10;
                this.field467 = true;
            }
            if (super.field949 >= 669 && super.field949 <= 699 && super.field950 >= 466 && super.field950 < 503 && this.field372[11] != -1) {
                this.field410 = true;
                this.field429 = 11;
                this.field467 = true;
            }
            if (super.field949 >= 696 && super.field949 <= 726 && super.field950 >= 466 && super.field950 < 503 && this.field372[12] != -1) {
                this.field410 = true;
                this.field429 = 12;
                this.field467 = true;
            }
            if (super.field949 >= 724 && super.field949 <= 758 && super.field950 >= 466 && super.field950 < 502 && this.field372[13] != -1) {
                this.field410 = true;
                this.field429 = 13;
                this.field467 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method67(int arg0) {
        try {
            if (this.field123 != null) {
                this.field123.method322();
            }
        } catch (Exception var3) {
        }
        this.field123 = null;
        this.field269 = false;
        this.field582 = 0;
        this.field546 = "";
        this.field547 = "";
        this.field453 += arg0;
        this.method118(this.field571);
        this.field589.method542(156);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field585[var2].method283();
        }
        System.gc();
        this.method70((byte) 6);
        this.field386 = -1;
        this.field183 = -1;
        this.field165 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method68(String arg0, String arg1, boolean arg2) {
        if (!arg2) {
            this.field501.method378(142);
        }
        if (this.field351 != null) {
            this.field351.method351(-181);
            class63.field1561 = this.field135;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field204.method179(-35070, 0, 257, var4, arg1);
            this.field204.method179(-35070, 16777215, 256, var4 - 1, arg1);
            var4 += 15;
            if (arg0 != null) {
                this.field204.method179(-35070, 0, 257, var4, arg0);
                this.field204.method179(-35070, 16777215, 256, var4 - 1, arg0);
            }
            this.field351.method352(4, 4, super.field934, (byte) 108);
        } else if (super.field935 != null) {
            super.field935.method351(-181);
            class63.field1561 = this.field136;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class45.method344(383 - var6 / 2, var6, var7, var5 - 5 - var7 / 2, true, 0);
            class45.method345(16777215, var6, -24987, 383 - var6 / 2, var7, var5 - 5 - var7 / 2);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field204.method179(-35070, 0, 383, var5, arg1);
            this.field204.method179(-35070, 16777215, 382, var5 - 1, arg1);
            var5 += 15;
            if (arg0 != null) {
                this.field204.method179(-35070, 0, 383, var5, arg0);
                this.field204.method179(-35070, 16777215, 382, var5 - 1, arg0);
            }
            super.field935.method352(0, 0, super.field934, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILIGMZHLWJ;)Z")
    public final boolean method69(int arg0, class22 arg1) {
        if (this.field584 != arg0) {
            this.field413 = !this.field413;
        }
        int var3 = arg1.field833;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field219[this.field114] = "Remove @whi@" + arg1.field785;
                this.field278[this.field114] = 126;
                ++this.field114;
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
            this.field219[this.field114] = "Remove @whi@" + this.field265[var3];
            this.field278[this.field114] = 408;
            ++this.field114;
            this.field219[this.field114] = "Message @whi@" + this.field265[var3];
            this.field278[this.field114] = 901;
            ++this.field114;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method70(byte arg0) {
        if (arg0 != 6) {
            this.field327 = !this.field327;
        }
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
    public final boolean method71(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        if (arg2 != 0) {
            this.method134();
        }
        int var6 = this.field589.method572(this.field363, arg0, arg1, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method77(0, 0, 0, arg0, var7 + 1, field353.field1722[0], field353.field1723[0], var8, arg1, false, 2, 0);
            } else {
                class59 var9 = class59.method450(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1379;
                    var11 = var9.field1411;
                } else {
                    var10 = var9.field1411;
                    var11 = var9.field1379;
                }
                int var12 = var9.field1372;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method77(var12, 0, var10, arg0, 0, field353.field1722[0], field353.field1723[0], 0, arg1, false, 2, var11);
            }
            this.field591 = super.field949;
            this.field592 = super.field950;
            this.field594 = 2;
            this.field593 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method72(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field400[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field400[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field401[var14] = (this.field400[var14 - 1] + this.field400[var14 + 1] + this.field400[var14 - 128] + this.field400[var14 + 128]) / 4;
            }
        }
        this.field375 += 128;
        if (this.field375 > this.field486.length) {
            this.field375 -= this.field486.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method155(-639, this.field164[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field401[var11 + 128] - this.field486[this.field375 + var11 & this.field486.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field400[var11] = var12;
            }
        }
        if (arg0 != 15371) {
            this.field531 = this.field483.method312();
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field570[var8] = this.field570[var8 + 1];
        }
        this.field570[var2 - 1] = (int) (Math.sin((double) field399 / 14.0D) * 16.0D + Math.sin((double) field399 / 15.0D) * 14.0D + Math.sin((double) field399 / 16.0D) * 12.0D);
        if (this.field518 > 0) {
            this.field518 -= 4;
        }
        if (this.field519 > 0) {
            this.field519 -= 4;
        }
        if (this.field518 == 0 && this.field519 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field518 = 1024;
            }
            if (var9 == 1) {
                this.field519 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (arg0 != 7) {
            this.method134();
        }
        if (!this.field555 && !this.field340 && !this.field282) {
            ++field154;
            if (!this.field269) {
                this.method160(false, false);
            } else {
                this.method142(this.field253);
            }
            this.field461 = 0;
        } else {
            this.method90(6);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIGMZHLWJ;B)V")
    public final void method74(class22 arg0, byte arg1) {
        int var3 = arg0.field833;
        if (arg1 != 106) {
            field285 = !field285;
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field446 == 0) {
                arg0.field785 = "Loading friend list";
                arg0.field770 = 0;
            } else if (var3 == 1 && this.field446 == 1) {
                arg0.field785 = "Connecting to friendserver";
                arg0.field770 = 0;
            } else if (var3 == 2 && this.field446 != 2) {
                arg0.field785 = "Please wait...";
                arg0.field770 = 0;
            } else {
                int var4 = this.field445;
                if (this.field446 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field785 = "";
                    arg0.field770 = 0;
                } else {
                    arg0.field785 = this.field265[var3];
                    arg0.field770 = 1;
                }
            }
        } else if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
            if (var3 == 203) {
                int var6 = this.field445;
                if (this.field446 != 2) {
                    var6 = 0;
                }
                arg0.field772 = var6 * 15 + 20;
                if (arg0.field772 <= arg0.field823) {
                    arg0.field772 = arg0.field823 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field446 == 0) {
                    arg0.field785 = "Loading ignore list";
                    arg0.field770 = 0;
                } else if (var3 == 1 && this.field446 == 0) {
                    arg0.field785 = "Please wait...";
                    arg0.field770 = 0;
                } else {
                    int var7 = this.field256;
                    if (this.field446 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field785 = "";
                        arg0.field770 = 0;
                    } else {
                        arg0.field785 = class9.method172((byte) -32, class9.method169(false, this.field573[var3]));
                        arg0.field770 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field772 = this.field256 * 15 + 20;
                if (arg0.field772 <= arg0.field823) {
                    arg0.field772 = arg0.field823 + 1;
                }
            } else if (var3 == 327) {
                arg0.field800 = 150;
                arg0.field801 = (int) (Math.sin((double) field399 / 40.0D) * 256.0D) & 2047;
                if (this.field493) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field275[var8];
                        if (var15 >= 0 && !class35.field986[var15].method305(this.field345)) {
                            return;
                        }
                    }
                    this.field493 = false;
                    class61[] var9 = new class61[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field275[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class35.field986[var14].method306(this.field327);
                        }
                    }
                    class61 var12 = new class61(var9, var10, this.field150);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field129[var13] != 0) {
                            var12.method480(field146[var13][0], field146[var13][this.field129[var13]]);
                            if (var13 == 1) {
                                var12.method480(field530[0], field530[this.field129[var13]]);
                            }
                        }
                    }
                    var12.method473(39018);
                    var12.method474(false, class33.field963[field353.field1711].field965[0]);
                    var12.method483(64, 850, -30, -50, -30, true);
                    arg0.field844 = 5;
                    arg0.field845 = 0;
                    class22.method218(var12, (byte) 2, 5, 0);
                }
            } else if (var3 == 324) {
                if (this.field287 == null) {
                    this.field287 = arg0.field783;
                    this.field288 = arg0.field828;
                }
                if (this.field495) {
                    arg0.field783 = this.field288;
                } else {
                    arg0.field783 = this.field287;
                }
            } else if (var3 == 325) {
                if (this.field287 == null) {
                    this.field287 = arg0.field783;
                    this.field288 = arg0.field828;
                }
                if (this.field495) {
                    arg0.field783 = this.field287;
                } else {
                    arg0.field783 = this.field288;
                }
            } else if (var3 == 600) {
                arg0.field785 = this.field450;
                if (field399 % 20 < 10) {
                    arg0.field785 = arg0.field785 + "|";
                } else {
                    arg0.field785 = arg0.field785 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field580 >= 1) {
                        if (this.field398) {
                            arg0.field787 = 16711680;
                            arg0.field785 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field787 = 16777215;
                            arg0.field785 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field785 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field510 - this.field358;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg0.field785 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field212 == 0) {
                        arg0.field785 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field212 <= this.field510) {
                        arg0.field785 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method75(this.field212, (byte) 4);
                    } else {
                        int var18 = this.field510 + 14 - this.field212;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg0.field785 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method75(this.field212, (byte) 4) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field266 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field266 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field266 + " unread messages";
                    }
                    arg0.field785 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field120 > 0 && this.field120 <= this.field510 + 10) {
                        arg0.field785 = "Last password change:\\n@gre@" + this.method75(this.field120, (byte) 4);
                    } else {
                        arg0.field785 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field475 > 2 && !field516) {
                        arg0.field785 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field475 > 2) {
                        arg0.field785 = "\\n\\nYou have @gre@" + this.field475 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field475 > 0) {
                        arg0.field785 = "You have @gre@" + this.field475 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field785 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field475 > 2 && !field516) {
                        arg0.field785 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field475 > 0) {
                        arg0.field785 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field785 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field212 > this.field510) {
                        arg0.field785 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field785 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else {
            int var5 = this.field445;
            if (this.field446 != 2) {
                var5 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var5) {
                arg0.field785 = "";
                arg0.field770 = 0;
            } else {
                if (this.field568[var3] == 0) {
                    arg0.field785 = "@red@Offline";
                } else if (this.field568[var3] < 200) {
                    if (this.field568[var3] == field514) {
                        arg0.field785 = "@gre@World" + (this.field568[var3] - 9);
                    } else {
                        arg0.field785 = "@yel@World" + (this.field568[var3] - 9);
                    }
                } else if (this.field568[var3] == field514) {
                    arg0.field785 = "@gre@Classic" + (this.field568[var3] - 219);
                } else {
                    arg0.field785 = "@yel@Classic" + (this.field568[var3] - 219);
                }
                arg0.field770 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method75(int arg0, byte arg1) {
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg0 > this.field510 + 10) {
            return "Unknown";
        } else {
            long var5 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var7 = Calendar.getInstance();
            var7.setTime(new Date(var5));
            int var8 = var7.get(5);
            int var9 = var7.get(2);
            int var10 = var7.get(1);
            String[] var11 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var8 + "-" + var11[var9] + "-" + var10;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method76(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field256; ++var4) {
                if (this.field573[var4] == arg1) {
                    --this.field256;
                    this.field410 = true;
                    for (int var5 = var4; var5 < this.field256; ++var5) {
                        this.field573[var5] = this.field573[var5 + 1];
                    }
                    this.field501.method377(this.field242, 151);
                    this.field501.method384(arg1, -12199);
                    break;
                }
            }
            if (arg0 < 4 || arg0 > 4) {
                this.field479 = !this.field479;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public final boolean method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field366[var15][var35] = 0;
                this.field569[var15][var35] = 99999999;
            }
        }
        int var16 = arg5;
        int var17 = arg6;
        this.field453 += arg1;
        this.field366[arg5][arg6] = 99;
        this.field569[arg5][arg6] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field201[var18] = arg5;
        int var36 = var18 + 1;
        this.field202[var18] = arg6;
        boolean var20 = false;
        int var21 = this.field201.length;
        int[][] var22 = this.field585[this.field363].field921;
        while (var36 != var19) {
            var16 = this.field201[var19];
            var17 = this.field202[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg8 == var17) {
                var20 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && this.field585[this.field363].method292(arg7, arg3, var16, arg8, true, arg4 - 1, var17)) {
                    var20 = true;
                    break;
                }
                if (arg4 < 10 && this.field585[this.field363].method293(arg3, var16, arg8, 0, arg7, arg4 - 1, var17)) {
                    var20 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg11 != 0 && this.field585[this.field363].method294(arg8, true, var16, arg2, arg11, var17, arg0, arg3)) {
                var20 = true;
                break;
            }
            int var34 = this.field569[var16][var17] + 1;
            if (var16 > 0 && this.field366[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field201[var36] = var16 - 1;
                this.field202[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field366[var16 - 1][var17] = 2;
                this.field569[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field366[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field201[var36] = var16 + 1;
                this.field202[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field366[var16 + 1][var17] = 8;
                this.field569[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field366[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field201[var36] = var16;
                this.field202[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field366[var16][var17 - 1] = 1;
                this.field569[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field366[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field201[var36] = var16;
                this.field202[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field366[var16][var17 + 1] = 4;
                this.field569[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field366[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field201[var36] = var16 - 1;
                this.field202[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field366[var16 - 1][var17 - 1] = 3;
                this.field569[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field366[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field201[var36] = var16 + 1;
                this.field202[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field366[var16 + 1][var17 - 1] = 9;
                this.field569[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field366[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field201[var36] = var16 - 1;
                this.field202[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field366[var16 - 1][var17 + 1] = 6;
                this.field569[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field366[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field201[var36] = var16 + 1;
                this.field202[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field366[var16 + 1][var17 + 1] = 12;
                this.field569[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field292 = 0;
        if (!var20) {
            if (arg9) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg3 - var24; var25 <= arg3 + var24; ++var25) {
                        for (int var26 = arg8 - var24; var26 <= arg8 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field569[var25][var26] < var23) {
                                var23 = this.field569[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field292 = 1;
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
        this.field201[var27] = var16;
        int var37 = var27 + 1;
        this.field202[var27] = var17;
        int var28;
        int var29 = var28 = this.field366[var16][var17];
        while (arg5 != var16 || arg6 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field201[var37] = var16;
                this.field202[var37++] = var17;
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
            var29 = this.field366[var16][var17];
        }
        if (var37 <= 0) {
            if (arg10 == 1) {
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
            int var31 = this.field201[var37];
            int var32 = this.field202[var37];
            if (arg10 == 0) {
                this.field501.method377(this.field242, 165);
                this.field501.method378(var30 + var30 + 3);
            }
            if (arg10 == 1) {
                this.field501.method377(this.field242, 46);
                this.field501.method378(var30 + var30 + 3 + 14);
            }
            if (arg10 == 2) {
                this.field501.method377(this.field242, 197);
                this.field501.method378(var30 + var30 + 3);
            }
            this.field468 = this.field201[0];
            this.field469 = this.field202[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field501.method405(this.field201[var37] - var31, 574);
                this.field501.method404(this.field202[var37] - var32, true);
            }
            this.field501.method413(field152, this.field562 + var31);
            this.field501.method404(super.field952[5] == 1 ? 1 : 0, true);
            this.field501.method379(this.field563 + var32);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method78(int arg0) {
        if (!this.field555 && !this.field340 && !this.field282) {
            ++field399;
            if (arg0 < this.field143 || arg0 > this.field143) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (!this.field269) {
                this.method147(-694);
            } else {
                this.method116((byte) 4);
            }
            this.method52(7);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
    public final int method79(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field501.method378(40);
        }
        int var5 = 256 - arg3;
        return ((arg0 & 16711935) * arg3 + (arg1 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg3 + (arg1 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public static final void method80(int arg0) {
        class67.field1607 = false;
        class63.field1550 = false;
        field517 = false;
        if (arg0 == 0) {
            class62.field1530 = false;
            class59.field1412 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method81(int arg0, int arg1) {
        if (arg1 >= 0) {
            int var3 = this.field276[arg1];
            int var4 = this.field277[arg1];
            int var5 = this.field278[arg1];
            int var6 = this.field279[arg1];
            if (arg0 == -6869) {
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (this.field474 != 0 && var5 != 1843) {
                    this.field474 = 0;
                    this.field280 = true;
                }
                if (var5 == 627) {
                    this.field501.method377(this.field242, 27);
                    this.field501.method412(628, var6);
                    this.field501.method379(var4);
                    this.field501.method413(field152, var3);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 50) {
                    this.field501.method377(this.field242, 187);
                    this.field501.method379(var4);
                    class22 var7 = class22.method215(var4);
                    if (var7.field829 != null && var7.field829[0][0] == 5) {
                        int var8 = var7.field829[0][1];
                        this.field214[var8] = 1 - this.field214[var8];
                        this.method121(4, var8);
                        this.field410 = true;
                    }
                }
                if (var5 == 682) {
                    class22 var9 = class22.method215(var4);
                    boolean var10 = true;
                    if (var9.field833 > 0) {
                        var10 = this.method56(var9, false);
                    }
                    if (var10) {
                        this.field501.method377(this.field242, 187);
                        this.field501.method379(var4);
                    }
                }
                if (var5 == 233) {
                    ++field344;
                    if (field344 >= 107) {
                        this.field501.method377(this.field242, 51);
                        this.field501.method382(0);
                        field344 = 0;
                    }
                    this.field501.method377(this.field242, 100);
                    this.field501.method379(var3);
                    this.field501.method379(var6);
                    this.field501.method379(var4);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 356 || var5 == 654) {
                    String var11 = this.field219[arg1];
                    int var12 = var11.indexOf("@whi@");
                    if (var12 != -1) {
                        String var13 = var11.substring(var12 + 5).trim();
                        String var14 = class9.method172((byte) -32, class9.method169(false, class9.method168(var13)));
                        boolean var15 = false;
                        for (int var16 = 0; var16 < this.field391; ++var16) {
                            class36 var17 = this.field390[this.field392[var16]];
                            if (var17 != null && var17.field999 != null && var17.field999.equalsIgnoreCase(var14)) {
                                this.method77(0, 0, 1, var17.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var17.field1723[0], false, 2, 1);
                                if (var5 == 356) {
                                    this.field501.method377(this.field242, 110);
                                    this.field501.method412(628, this.field392[var16]);
                                }
                                if (var5 == 654) {
                                    this.field501.method377(this.field242, 161);
                                    this.field501.method379(this.field392[var16]);
                                }
                                var15 = true;
                                break;
                            }
                        }
                        if (!var15) {
                            this.method40("", 0, "Unable to find " + var14, this.field144);
                        }
                    }
                }
                if (var5 == 823) {
                    class24 var18 = this.field272[var6];
                    if (var18 != null) {
                        this.method77(0, 0, 1, var18.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var18.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 172);
                        this.field501.method379(var6);
                    }
                }
                if (var5 == 40) {
                    this.field501.method377(this.field242, 11);
                    this.field501.method412(628, var6);
                    this.field501.method379(var3);
                    this.field501.method411(this.field381, 138);
                    this.field501.method379(var4);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 248) {
                    class24 var19 = this.field272[var6];
                    if (var19 != null) {
                        this.method77(0, 0, 1, var19.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var19.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 211);
                        this.field501.method411(var6, 138);
                    }
                }
                if (var5 == 617) {
                    boolean var20 = this.method77(0, 0, 0, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 0);
                    if (!var20) {
                        this.method77(0, 0, 1, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 1);
                    }
                    this.field591 = super.field949;
                    this.field592 = super.field950;
                    this.field594 = 2;
                    this.field593 = 0;
                    this.field501.method377(this.field242, 215);
                    this.field501.method379(this.field381);
                    this.field501.method379(this.field563 + var4);
                    this.field501.method411(this.field562 + var3, 138);
                    this.field501.method411(var6, 138);
                }
                if (var5 == 14) {
                    if (!this.field502) {
                        this.field589.method580(true, super.field950 - 4, super.field949 - 4);
                    } else {
                        this.field589.method580(true, var4 - 4, var3 - 4);
                    }
                }
                if (var5 == 1684) {
                    class51 var22 = class51.method433(var6);
                    String var23;
                    if (var22.field1246 != null) {
                        var23 = new String(var22.field1246);
                    } else {
                        var23 = "It's a " + var22.field1269 + ".";
                    }
                    this.method40("", 0, var23, this.field144);
                }
                if (var5 == 186 && this.method71(var3, var4, 0, var6)) {
                    this.field501.method377(this.field242, 10);
                    this.field501.method412(628, this.field381);
                    this.field501.method379(var6 >> 14 & 32767);
                    this.field501.method411(this.field562 + var3, 138);
                    this.field501.method411(this.field563 + var4, 138);
                }
                if (var5 == 1987) {
                    class24 var24 = this.field272[var6];
                    if (var24 != null) {
                        class14 var25 = var24.field876;
                        if (var25.field696 != null) {
                            var25 = var25.method194(-48050);
                        }
                        if (var25 != null) {
                            String var26;
                            if (var25.field679 != null) {
                                var26 = new String(var25.field679);
                            } else {
                                var26 = "It's a " + var25.field677 + ".";
                            }
                            this.method40("", 0, var26, this.field144);
                        }
                    }
                }
                if (var5 == 555) {
                    this.field501.method377(this.field242, 171);
                    this.field501.method412(628, var3);
                    this.field501.method412(628, var6);
                    this.field501.method412(628, var4);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 648) {
                    this.field501.method377(this.field242, 103);
                    this.field501.method411(var4, 138);
                    this.field501.method413(field152, var6);
                    this.field501.method411(var3, 138);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 442) {
                    class24 var27 = this.field272[var6];
                    if (var27 != null) {
                        this.method77(0, 0, 1, var27.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var27.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 108);
                        this.field501.method379(this.field406);
                        this.field501.method411(var6, 138);
                        this.field501.method379(this.field407);
                        this.field501.method411(this.field408, 138);
                    }
                }
                if (var5 == 674) {
                    class24 var28 = this.field272[var6];
                    if (var28 != null) {
                        this.method77(0, 0, 1, var28.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var28.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 220);
                        this.field501.method379(var6);
                    }
                }
                if (var5 == 443) {
                    this.field501.method377(this.field242, 229);
                    this.field501.method413(field152, this.field407);
                    this.field501.method411(var4, 138);
                    this.field501.method379(this.field406);
                    this.field501.method379(var6);
                    this.field501.method412(628, var3);
                    this.field501.method413(field152, this.field408);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 134) {
                    boolean var29 = this.method77(0, 0, 0, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 0);
                    if (!var29) {
                        this.method77(0, 0, 1, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 1);
                    }
                    this.field591 = super.field949;
                    this.field592 = super.field950;
                    this.field594 = 2;
                    this.field593 = 0;
                    field147 += var6;
                    if (field147 >= 60) {
                        this.field501.method377(this.field242, 123);
                        field147 = 0;
                    }
                    this.field501.method377(this.field242, 126);
                    this.field501.method413(field152, this.field562 + var3);
                    this.field501.method379(this.field563 + var4);
                    this.field501.method379(var6);
                }
                if (var5 == 1624) {
                    class51 var31 = class51.method433(var6);
                    class22 var32 = class22.method215(var4);
                    String var33;
                    if (var32 != null && var32.field797[var3] >= 100000) {
                        var33 = var32.field797[var3] + " x " + var31.field1269;
                    } else if (var31.field1246 != null) {
                        var33 = new String(var31.field1246);
                    } else {
                        var33 = "It's a " + var31.field1269 + ".";
                    }
                    this.method40("", 0, var33, this.field144);
                }
                if (var5 == 1891) {
                    int var34 = var6 >> 14 & 32767;
                    class59 var35 = class59.method450(var34);
                    String var36;
                    if (var35.field1388 != null) {
                        var36 = new String(var35.field1388);
                    } else {
                        var36 = "It's a " + var35.field1416 + ".";
                    }
                    this.method40("", 0, var36, this.field144);
                }
                if (var5 == 858) {
                    boolean var37 = this.method77(0, 0, 0, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 0);
                    if (!var37) {
                        this.method77(0, 0, 1, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 1);
                    }
                    this.field591 = super.field949;
                    this.field592 = super.field950;
                    this.field594 = 2;
                    this.field593 = 0;
                    this.field501.method377(this.field242, 122);
                    this.field501.method412(628, this.field563 + var4);
                    this.field501.method413(field152, this.field562 + var3);
                    this.field501.method411(var6, 138);
                }
                if (var5 == 515) {
                    this.method145((byte) 21);
                }
                if (var5 == 372) {
                    this.field501.method377(this.field242, 94);
                    this.field501.method412(628, var3);
                    this.field501.method411(var4, 138);
                    this.field501.method412(628, var6);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 117) {
                    class36 var39 = this.field390[var6];
                    if (var39 != null) {
                        this.method77(0, 0, 1, var39.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var39.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 82);
                        this.field501.method379(var6);
                    }
                }
                if (var5 == 852) {
                    boolean var40 = this.method77(0, 0, 0, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 0);
                    if (!var40) {
                        this.method77(0, 0, 1, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 1);
                    }
                    this.field591 = super.field949;
                    this.field592 = super.field950;
                    this.field594 = 2;
                    this.field593 = 0;
                    this.field501.method377(this.field242, 179);
                    this.field501.method413(field152, this.field562 + var3);
                    this.field501.method379(var6);
                    this.field501.method413(field152, this.field563 + var4);
                }
                if (var5 == 901) {
                    String var42 = this.field219[arg1];
                    int var43 = var42.indexOf("@whi@");
                    if (var43 != -1) {
                        long var44 = class9.method168(var42.substring(var43 + 5).trim());
                        int var46 = -1;
                        for (int var47 = 0; var47 < this.field445; ++var47) {
                            if (this.field324[var47] == var44) {
                                var46 = var47;
                                break;
                            }
                        }
                        if (var46 != -1 && this.field568[var46] > 0) {
                            this.field280 = true;
                            this.field474 = 0;
                            this.field509 = true;
                            this.field601 = "";
                            this.field222 = 3;
                            this.field122 = this.field324[var46];
                            this.field240 = "Enter message to send to " + this.field265[var46];
                        }
                    }
                }
                if (var5 == 944) {
                    this.field501.method377(this.field242, 187);
                    this.field501.method379(var4);
                    class22 var48 = class22.method215(var4);
                    if (var48.field829 != null && var48.field829[0][0] == 5) {
                        int var49 = var48.field829[0][1];
                        if (this.field214[var49] != var48.field774[0]) {
                            this.field214[var49] = var48.field774[0];
                            this.method121(4, var49);
                            this.field410 = true;
                        }
                    }
                }
                if (var5 == 1580) {
                    this.method71(var3, var4, 0, var6);
                    this.field501.method377(this.field242, 150);
                    this.field501.method412(628, this.field563 + var4);
                    this.field501.method412(628, var6 >> 14 & 32767);
                    this.field501.method413(field152, this.field562 + var3);
                }
                if (var5 == 732) {
                    class24 var50 = this.field272[var6];
                    if (var50 != null) {
                        this.method77(0, 0, 1, var50.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var50.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 55);
                        this.field501.method413(field152, var6);
                    }
                }
                if (var5 == 943) {
                    class36 var51 = this.field390[var6];
                    if (var51 != null) {
                        this.method77(0, 0, 1, var51.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var51.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 28);
                        this.field501.method379(this.field381);
                        this.field501.method412(628, var6);
                    }
                }
                if (var5 == 99) {
                    class36 var52 = this.field390[var6];
                    if (var52 != null) {
                        this.method77(0, 0, 1, var52.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var52.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 216);
                        this.field501.method411(var6, 138);
                    }
                }
                if (var5 == 653) {
                    this.field501.method377(this.field242, 243);
                    this.field501.method379(var6);
                    this.field501.method379(var4);
                    this.field501.method379(var3);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 229) {
                    class24 var53 = this.field272[var6];
                    if (var53 != null) {
                        this.method77(0, 0, 1, var53.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var53.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 217);
                        this.field501.method411(var6, 138);
                    }
                }
                if (var5 == 809) {
                    if ((this.field562 & 3) == 0) {
                        ++field316;
                    }
                    if (field316 >= 145) {
                        this.field501.method377(this.field242, 210);
                        this.field501.method381(4181909);
                        field316 = 0;
                    }
                    this.method71(var3, var4, 0, var6);
                    this.field501.method377(this.field242, 198);
                    this.field501.method412(628, var6 >> 14 & 32767);
                    this.field501.method411(this.field562 + var3, 138);
                    this.field501.method413(field152, this.field563 + var4);
                }
                if (var5 == 507) {
                    class24 var54 = this.field272[var6];
                    if (var54 != null) {
                        this.method77(0, 0, 1, var54.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var54.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 44);
                        this.field501.method413(field152, var6);
                        this.field501.method411(this.field381, 138);
                    }
                }
                if (var5 == 189) {
                    class36 var55 = this.field390[var6];
                    if (var55 != null) {
                        this.method77(0, 0, 1, var55.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var55.field1723[0], false, 2, 1);
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 1);
                        this.field501.method411(var6, 138);
                        this.field501.method411(this.field406, 138);
                        this.field501.method413(field152, this.field408);
                        this.field501.method379(this.field407);
                    }
                }
                if (var5 == 741 && this.method71(var3, var4, 0, var6)) {
                    this.field501.method377(this.field242, 213);
                    this.field501.method379(this.field406);
                    this.field501.method379(this.field407);
                    this.field501.method413(field152, this.field408);
                    this.field501.method413(field152, this.field562 + var3);
                    this.field501.method379(this.field563 + var4);
                    this.field501.method379(var6 >> 14 & 32767);
                }
                if (var5 == 804) {
                    this.field501.method377(this.field242, 223);
                    this.field501.method379(var3);
                    this.field501.method379(var6);
                    this.field501.method411(var4, 138);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 828) {
                    this.field501.method377(this.field242, 196);
                    this.field501.method411(var4, 138);
                    this.field501.method412(628, var3);
                    this.field501.method413(field152, var6);
                    this.field207 = 0;
                    this.field208 = var4;
                    this.field209 = var3;
                    this.field210 = 2;
                    if (class22.method215(var4).field804 == this.field430) {
                        this.field210 = 1;
                    }
                    if (class22.method215(var4).field804 == this.field426) {
                        this.field210 = 3;
                    }
                }
                if (var5 == 35) {
                    this.method71(var3, var4, 0, var6);
                    this.field501.method377(this.field242, 131);
                    this.field501.method411(var6 >> 14 & 32767, 138);
                    this.field501.method413(field152, this.field562 + var3);
                    this.field501.method412(628, this.field563 + var4);
                }
                if (var5 == 268) {
                    class22 var56 = class22.method215(var4);
                    this.field380 = 1;
                    this.field381 = var4;
                    this.field382 = var56.field795;
                    this.field405 = 0;
                    this.field410 = true;
                    String var57 = var56.field839;
                    if (var57.indexOf(" ") != -1) {
                        var57 = var57.substring(0, var57.indexOf(" "));
                    }
                    String var58 = var56.field839;
                    if (var58.indexOf(" ") != -1) {
                        var58 = var58.substring(var58.indexOf(" ") + 1);
                    }
                    this.field383 = var57 + " " + var56.field794 + " " + var58;
                    if (this.field382 == 16) {
                        this.field410 = true;
                        this.field429 = 3;
                        this.field467 = true;
                    }
                } else {
                    if (var5 == 918) {
                        this.field501.method377(this.field242, 39);
                        this.field501.method413(field152, var3);
                        this.field501.method412(628, var4);
                        this.field501.method412(628, var6);
                        this.field207 = 0;
                        this.field208 = var4;
                        this.field209 = var3;
                        this.field210 = 2;
                        if (class22.method215(var4).field804 == this.field430) {
                            this.field210 = 1;
                        }
                        if (class22.method215(var4).field804 == this.field426) {
                            this.field210 = 3;
                        }
                    }
                    if (var5 == 723) {
                        this.method21(6, this.field599);
                        this.field599 = -1;
                        this.field280 = true;
                    }
                    if (var5 == 737 && !this.field263) {
                        this.field501.method377(this.field242, 72);
                        this.field501.method379(var4);
                        this.field263 = true;
                    }
                    if (var5 == 954 || var5 == 362 || var5 == 408 || var5 == 126) {
                        String var59 = this.field219[arg1];
                        int var60 = var59.indexOf("@whi@");
                        if (var60 != -1) {
                            long var61 = class9.method168(var59.substring(var60 + 5).trim());
                            if (var5 == 954) {
                                this.method101(993, var61);
                            }
                            if (var5 == 362) {
                                this.method109(false, var61);
                            }
                            if (var5 == 408) {
                                this.method133(this.field479, var61);
                            }
                            if (var5 == 126) {
                                this.method76(4, var61);
                            }
                        }
                    }
                    if (var5 == 485) {
                        class36 var63 = this.field390[var6];
                        if (var63 != null) {
                            this.method77(0, 0, 1, var63.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var63.field1723[0], false, 2, 1);
                            this.field591 = super.field949;
                            this.field592 = super.field950;
                            this.field594 = 2;
                            this.field593 = 0;
                            this.field501.method377(this.field242, 110);
                            this.field501.method412(628, var6);
                        }
                    }
                    if (var5 == 419) {
                        boolean var64 = this.method77(0, 0, 0, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 0);
                        if (!var64) {
                            this.method77(0, 0, 1, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 1);
                        }
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        this.field501.method377(this.field242, 205);
                        this.field501.method411(this.field563 + var4, 138);
                        this.field501.method412(628, this.field406);
                        this.field501.method413(field152, this.field408);
                        this.field501.method412(628, this.field407);
                        this.field501.method413(field152, var6);
                        this.field501.method379(this.field562 + var3);
                    }
                    if (var5 == 71) {
                        this.method71(var3, var4, 0, var6);
                        this.field501.method377(this.field242, 200);
                        this.field501.method379(this.field563 + var4);
                        this.field501.method379(this.field562 + var3);
                        this.field501.method379(var6 >> 14 & 32767);
                    }
                    if (var5 == 321) {
                        ++field476;
                        if (field476 >= 64) {
                            this.field501.method377(this.field242, 234);
                            this.field501.method379(42770);
                            field476 = 0;
                        }
                        this.method71(var3, var4, 0, var6);
                        this.field501.method377(this.field242, 115);
                        this.field501.method411(this.field563 + var4, 138);
                        this.field501.method412(628, var6 >> 14 & 32767);
                        this.field501.method413(field152, this.field562 + var3);
                    }
                    if (var5 == 499) {
                        boolean var66 = this.method77(0, 0, 0, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 0);
                        if (!var66) {
                            this.method77(0, 0, 1, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 1);
                        }
                        this.field591 = super.field949;
                        this.field592 = super.field950;
                        this.field594 = 2;
                        this.field593 = 0;
                        ++field182;
                        if (field182 >= 77) {
                            this.field501.method377(this.field242, 203);
                            this.field501.method381(4904866);
                            field182 = 0;
                        }
                        this.field501.method377(this.field242, 252);
                        this.field501.method412(628, this.field562 + var3);
                        this.field501.method411(this.field563 + var4, 138);
                        this.field501.method412(628, var6);
                    }
                    if (var5 == 937) {
                        this.field405 = 1;
                        this.field406 = var3;
                        this.field407 = var4;
                        this.field408 = var6;
                        this.field409 = String.valueOf(class51.method433(var6).field1269);
                        this.field380 = 0;
                        this.field410 = true;
                    } else {
                        if (var5 == 929) {
                            class36 var68 = this.field390[var6];
                            if (var68 != null) {
                                this.method77(0, 0, 1, var68.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var68.field1723[0], false, 2, 1);
                                this.field591 = super.field949;
                                this.field592 = super.field950;
                                this.field594 = 2;
                                this.field593 = 0;
                                this.field501.method377(this.field242, 148);
                                this.field501.method379(var6);
                            }
                        }
                        if (var5 == 173) {
                            class36 var69 = this.field390[var6];
                            if (var69 != null) {
                                this.method77(0, 0, 1, var69.field1722[0], 0, field353.field1722[0], field353.field1723[0], 0, var69.field1723[0], false, 2, 1);
                                this.field591 = super.field949;
                                this.field592 = super.field950;
                                this.field594 = 2;
                                this.field593 = 0;
                                this.field501.method377(this.field242, 161);
                                this.field501.method379(var6);
                            }
                        }
                        if (var5 == 416) {
                            boolean var70 = this.method77(0, 0, 0, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 0);
                            if (!var70) {
                                this.method77(0, 0, 1, var3, 0, field353.field1722[0], field353.field1723[0], 0, var4, false, 2, 1);
                            }
                            this.field591 = super.field949;
                            this.field592 = super.field950;
                            this.field594 = 2;
                            this.field593 = 0;
                            field137 += var6;
                            if (field137 >= 93) {
                                this.field501.method377(this.field242, 235);
                                this.field501.method379(11880);
                                field137 = 0;
                            }
                            this.field501.method377(this.field242, 135);
                            this.field501.method379(var6);
                            this.field501.method379(this.field562 + var3);
                            this.field501.method411(this.field563 + var4, 138);
                        }
                        if (var5 == 395) {
                            this.field501.method377(this.field242, 224);
                            this.field501.method411(var4, 138);
                            this.field501.method412(628, var6);
                            this.field501.method413(field152, var3);
                            this.field207 = 0;
                            this.field208 = var4;
                            this.field209 = var3;
                            this.field210 = 2;
                            if (class22.method215(var4).field804 == this.field430) {
                                this.field210 = 1;
                            }
                            if (class22.method215(var4).field804 == this.field426) {
                                this.field210 = 3;
                            }
                        }
                        if (var5 == 505) {
                            String var72 = this.field219[arg1];
                            int var73 = var72.indexOf("@whi@");
                            if (var73 != -1) {
                                if (this.field430 == -1) {
                                    this.method145((byte) 21);
                                    this.field450 = var72.substring(var73 + 5).trim();
                                    this.field398 = false;
                                    this.field148 = this.field430 = class22.field842;
                                } else {
                                    this.method40("", 0, "Please close the interface you have open before using 'report abuse'", this.field144);
                                }
                            }
                        }
                        this.field405 = 0;
                        this.field380 = 0;
                        this.field410 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
    public final void method82(int arg0, int arg1) {
        class17 var3 = this.field574[this.field363][arg0][arg1];
        if (var3 == null) {
            this.field589.method563(this.field363, arg0, arg1);
        } else {
            int var4 = -99999999;
            class27 var5 = null;
            for (class27 var6 = (class27) var3.method206(); var6 != null; var6 = (class27) var3.method208(262)) {
                class51 var11 = class51.method433(var6.field906);
                int var12 = var11.field1290;
                if (var11.field1288) {
                    var12 = (var6.field907 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method204(this.field484, var5);
            class27 var7 = null;
            class27 var8 = null;
            for (class27 var9 = (class27) var3.method206(); var9 != null; var9 = (class27) var3.method208(262)) {
                if (var5.field906 != var9.field906 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field906 != var9.field906 && var7.field906 != var9.field906 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field589.method549(arg0, var7, var8, this.method22(-531, arg0 * 128 + 64, this.field363, arg1 * 128 + 64), -929, var5, this.field363, var10, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        this.field557 = null;
        this.field558 = null;
        this.field559 = null;
        this.field560 = null;
        this.field561 = null;
        this.field187 = null;
        this.field537 = null;
        this.field538 = null;
        this.field539 = null;
        this.field540 = null;
        if (!arg0) {
            this.field541 = null;
            this.field390 = null;
            this.field392 = null;
            this.field394 = null;
            this.field395 = null;
            this.field449 = null;
            this.field130 = null;
            this.field572 = null;
            this.field402 = null;
            this.field131 = null;
            this.field132 = null;
            this.field290 = null;
            this.field291 = null;
            this.field368 = null;
            this.field501 = null;
            this.field313 = null;
            this.field337 = null;
            this.field193 = null;
            this.field194 = null;
            this.field195 = null;
            this.field196 = null;
            this.field304 = null;
            this.field305 = null;
            this.field306 = null;
            this.field307 = null;
            this.field366 = null;
            this.field569 = null;
            this.field201 = null;
            this.field202 = null;
            this.field265 = null;
            this.field324 = null;
            this.field568 = null;
            this.field317 = null;
            this.field318 = null;
            this.field319 = null;
            if (this.field247 != null) {
                this.field247.field1037 = false;
            }
            this.field247 = null;
            this.field124 = null;
            this.field125 = null;
            this.field126 = null;
            this.field127 = null;
            this.field128 = null;
            this.field115 = null;
            this.field116 = null;
            this.field117 = null;
            this.field276 = null;
            this.field277 = null;
            this.field278 = null;
            this.field279 = null;
            this.field219 = null;
            this.field166 = null;
            this.field119 = null;
            this.field321 = null;
            this.field322 = null;
            this.field323 = null;
            this.field271 = null;
            this.field349 = null;
            this.field350 = null;
            this.field351 = null;
            this.field352 = null;
            this.field378 = null;
            this.field308 = null;
            this.field309 = null;
            this.field310 = null;
            this.field311 = null;
            this.field312 = null;
            this.field590 = null;
            this.field543 = null;
            this.field589 = null;
            this.field585 = null;
            this.field574 = null;
            this.field325 = null;
            this.field191 = null;
            this.field192 = null;
            this.field188 = null;
            this.field189 = null;
            this.field190 = null;
            this.field272 = null;
            this.field274 = null;
            if (this.field566 != null) {
                this.field566.method366();
            }
            this.field566 = null;
            this.field161 = null;
            this.field257 = null;
            this.field520 = null;
            this.field496 = null;
            this.field171 = null;
            this.field170 = null;
            this.field470 = null;
            try {
                if (this.field123 != null) {
                    this.field123.method322();
                }
            } catch (Exception var2) {
            }
            this.field123 = null;
            this.method70((byte) 6);
            this.field214 = null;
            this.field412 = null;
            this.field365 = null;
            this.field348 = null;
            this.field478 = null;
            this.method49(this.field531);
            class59.method459(-681);
            class14.method201(-681);
            class51.method430(-681);
            class22.method216(-681);
            class72.field1749 = null;
            class35.field986 = null;
            class58.field1353 = null;
            class33.field963 = null;
            class55.field1321 = null;
            class55.field1333 = null;
            class60.field1420 = null;
            super.field935 = null;
            class36.field1004 = null;
            class63.method514(-681);
            class67.method541(-681);
            class61.method462(-681);
            class44.method336(-681);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method84(byte arg0) {
        class54 var2 = (class54) this.field325.method206();
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field574 = null;
        }
        while (var2 != null) {
            if (var2.field1308 == -1) {
                var2.field1316 = 0;
                this.method94(var2, -824);
            } else {
                var2.method20();
            }
            var2 = (class54) this.field325.method208(262);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLAIRMECOM;I)V")
    public final void method85(int arg0, byte arg1, class3 arg2, int arg3) {
        if (arg1 != 6) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = this.field334 + this.field168 & 2047;
            int var8 = class61.field1509[var7];
            int var9 = class61.field1510[var7];
            int var10 = var8 * 256 / (this.field462 + 256);
            int var11 = var9 * 256 / (this.field462 + 256);
            int var12 = arg0 * var11 + arg3 * var10 >> 16;
            int var13 = arg3 * var11 - arg0 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field284.method14(20, var14, 15, 256, 20, 83 - var17 - 20, 15, -637, var16 + 94 + 4 - 10);
        } else {
            this.method149((byte) 116, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method86(int arg0) {
        int var2 = this.field226;
        int var3 = this.field227;
        int var4 = this.field228;
        int var5 = this.field229;
        int var6 = 6116423;
        class45.method344(var2, var4, var5, var3, true, var6);
        class45.method344(var2 + 1, var4 - 2, 16, var3 + 1, true, 0);
        class45.method345(0, var4 - 2, -24987, var2 + 1, var5 - 19, var3 + 18);
        this.field205.method183(var2 + 3, (byte) 0, var6, var3 + 14, "Choose Option");
        int var7 = super.field942;
        int var8 = super.field943;
        if (this.field225 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field225 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field225 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field114; ++var9) {
            int var10 = (this.field114 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field205.method187(var2 + 3, this.field219[var9], -129, var11, true, var10);
        }
        if (arg0 != -18010) {
            this.field574 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method87(boolean arg0) {
        ++this.field213;
        this.method34(true, this.field149);
        this.method43(false, true);
        this.method34(false, this.field149);
        this.method43(false, false);
        this.method117(true);
        this.method97(-253);
        if (!this.field245) {
            int var2 = this.field333;
            if (this.field492 / 256 > var2) {
                var2 = this.field492 / 256;
            }
            if (this.field575[4] && this.field447[4] + 128 > var2) {
                var2 = this.field447[4] + 128;
            }
            int var3 = this.field544 + this.field334 & 2047;
            this.method110(var2, this.field198, 0, var2 * 3 + 600, this.field197, this.method22(-531, field353.field1702, this.field363, field353.field1703) - 50, var3);
            ++field236;
            if (field236 > 154) {
                field236 = 0;
                this.field501.method377(this.field242, 146);
                this.field501.method382(0);
            }
        }
        int var4;
        if (!this.field245) {
            var4 = this.method23(0);
        } else {
            var4 = this.method24(8);
        }
        int var5 = this.field549;
        int var6 = this.field550;
        int var7 = this.field551;
        int var8 = this.field552;
        int var9 = this.field553;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field575[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field254[var10] * 2 + 1) - (double) this.field254[var10] + Math.sin((double) this.field477[var10] / 100.0D * (double) this.field417[var10]) * (double) this.field447[var10]);
                if (var10 == 0) {
                    this.field549 += var13;
                }
                if (var10 == 1) {
                    this.field550 += var13;
                }
                if (var10 == 2) {
                    this.field551 += var13;
                }
                if (var10 == 3) {
                    this.field553 = this.field553 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field552 += var13;
                    if (this.field552 < 128) {
                        this.field552 = 128;
                    }
                    if (this.field552 > 383) {
                        this.field552 = 383;
                    }
                }
            }
        }
        int var11 = class63.field1570;
        class61.field1504 = true;
        class61.field1507 = 0;
        class61.field1505 = super.field942 - 4;
        class61.field1506 = super.field943 - 4;
        class45.method342((byte) 32);
        this.field589.method581(this.field549, this.field552, false, this.field550, this.field551, this.field553, var4);
        this.field589.method556(false);
        this.method45(this.field295);
        this.method108(0);
        this.method162(false, var11);
        this.method151(-556);
        this.field351.method352(4, 4, super.field934, (byte) 108);
        this.field549 = var5;
        this.field550 = var6;
        this.field551 = var7;
        if (arg0) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        this.field552 = var8;
        this.field553 = var9;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)Z")
    public final boolean method88(boolean arg0, int arg1, byte[] arg2) {
        this.field269 &= arg0;
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method89(boolean arg0) {
        byte[] var2 = this.field556.method212("title.dat", (byte[]) null);
        class3 var3 = new class3(var2, this);
        this.field191.method351(-181);
        var3.method7((byte) 3, 0, 0);
        this.field192.method351(-181);
        var3.method7((byte) 3, 0, -637);
        this.field188.method351(-181);
        var3.method7((byte) 3, 0, -128);
        this.field189.method351(-181);
        var3.method7((byte) 3, -371, -202);
        this.field190.method351(-181);
        var3.method7((byte) 3, -171, -202);
        this.field193.method351(-181);
        var3.method7((byte) 3, -265, 0);
        this.field194.method351(-181);
        var3.method7((byte) 3, -265, -562);
        this.field195.method351(-181);
        var3.method7((byte) 3, -171, -128);
        this.field196.method351(-181);
        var3.method7((byte) 3, -171, -562);
        int[] var4 = new int[var3.field23];
        for (int var5 = 0; var5 < var3.field24; ++var5) {
            for (int var10 = 0; var10 < var3.field23; ++var10) {
                var4[var10] = var3.field22[var3.field23 * var5 + (var3.field23 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field23; ++var11) {
                var3.field22[var3.field23 * var5 + var11] = var4[var11];
            }
        }
        this.field191.method351(-181);
        var3.method7((byte) 3, 0, 382);
        this.field192.method351(-181);
        var3.method7((byte) 3, 0, -255);
        this.field188.method351(-181);
        var3.method7((byte) 3, 0, 254);
        this.field189.method351(-181);
        var3.method7((byte) 3, -371, 180);
        this.field190.method351(-181);
        var3.method7((byte) 3, -171, 180);
        this.field193.method351(-181);
        var3.method7((byte) 3, -265, 382);
        this.field194.method351(-181);
        var3.method7((byte) 3, -265, -180);
        this.field195.method351(-181);
        var3.method7((byte) 3, -171, 254);
        this.field196.method351(-181);
        var3.method7((byte) 3, -171, -180);
        class3 var6 = new class3(this.field556, "logo", 0);
        this.field188.method351(-181);
        if (arg0) {
            this.field574 = null;
        }
        var6.method9((byte) -91, 382 - var6.field23 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class8.field113) {
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method90(int arg0) {
        Graphics var2 = this.method99(false).getGraphics();
        if (arg0 != 6) {
            this.field574 = null;
        }
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method298(31071, 1);
        if (this.field340) {
            this.field163 = false;
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
        if (this.field282) {
            this.field163 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field555) {
            this.field163 = false;
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

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method91(int arg0) {
        for (int var2 = -1; var2 < this.field391; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field389;
            } else {
                var6 = this.field392[var2];
            }
            class36 var7 = this.field390[var6];
            if (var7 != null && var7.field1721 > 0) {
                --var7.field1721;
                if (var7.field1721 == 0) {
                    var7.field1714 = null;
                }
            }
        }
        if (arg0 != 19400) {
            this.field574 = null;
        }
        for (int var3 = 0; var3 < this.field273; ++var3) {
            int var4 = this.field274[var3];
            class24 var5 = this.field272[var4];
            if (var5 != null && var5.field1721 > 0) {
                --var5.field1721;
                if (var5.field1721 == 0) {
                    var5.field1714 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method92(int arg0) {
        if (arg0 >= 0) {
            this.method134();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method299(-33830);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field430 != -1 && this.field430 == this.field148) {
                        if (var2 == 8 && this.field450.length() > 0) {
                            this.field450 = this.field450.substring(0, this.field450.length() - 1);
                        }
                        break;
                    }
                    if (this.field509) {
                        if (var2 >= 32 && var2 <= 122 && this.field601.length() < 80) {
                            this.field601 = this.field601 + (char) var2;
                            this.field280 = true;
                        }
                        if (var2 == 8 && this.field601.length() > 0) {
                            this.field601 = this.field601.substring(0, this.field601.length() - 1);
                            this.field280 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field509 = false;
                            this.field280 = true;
                            if (this.field222 == 1) {
                                long var3 = class9.method168(this.field601);
                                this.method101(993, var3);
                            }
                            if (this.field222 == 2 && this.field445 > 0) {
                                long var5 = class9.method168(this.field601);
                                this.method133(this.field479, var5);
                            }
                            if (this.field222 == 3 && this.field601.length() > 0) {
                                this.field501.method377(this.field242, 139);
                                this.field501.method378(0);
                                int var7 = this.field501.field1225;
                                this.field501.method384(this.field122, -12199);
                                class7.method18(-438, this.field501, this.field601);
                                this.field501.method387(this.field501.field1225 - var7, true);
                                this.field601 = class7.method19(false, this.field601);
                                this.field601 = class25.method240(false, this.field601);
                                this.method40(class9.method172((byte) -32, class9.method169(false, this.field122)), 6, this.field601, this.field144);
                                if (this.field180 == 2) {
                                    this.field180 = 1;
                                    this.field578 = true;
                                    this.field501.method377(this.field242, 19);
                                    this.field501.method378(this.field385);
                                    this.field501.method378(this.field180);
                                    this.field501.method378(this.field268);
                                }
                            }
                            if (this.field222 == 4 && this.field256 < 100) {
                                long var8 = class9.method168(this.field601);
                                this.method109(false, var8);
                            }
                            if (this.field222 == 5 && this.field256 > 0) {
                                long var10 = class9.method168(this.field601);
                                this.method76(4, var10);
                            }
                        }
                    } else if (this.field474 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field494.length() < 10) {
                            this.field494 = this.field494 + (char) var2;
                            this.field280 = true;
                        }
                        if (var2 == 8 && this.field494.length() > 0) {
                            this.field494 = this.field494.substring(0, this.field494.length() - 1);
                            this.field280 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field494.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field494);
                                } catch (Exception var22) {
                                }
                                this.field501.method377(this.field242, 5);
                                this.field501.method382(var12);
                            }
                            this.field474 = 0;
                            this.field280 = true;
                        }
                    } else if (this.field474 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field494.length() < 12) {
                            this.field494 = this.field494 + (char) var2;
                            this.field280 = true;
                        }
                        if (var2 == 8 && this.field494.length() > 0) {
                            this.field494 = this.field494.substring(0, this.field494.length() - 1);
                            this.field280 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field494.length() > 0) {
                                this.field501.method377(this.field242, 137);
                                this.field501.method384(class9.method168(this.field494), -12199);
                            }
                            this.field474 = 0;
                            this.field280 = true;
                        }
                    } else if (this.field474 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field494.length() < 40) {
                            this.field494 = this.field494 + (char) var2;
                            this.field280 = true;
                        }
                        if (var2 == 8 && this.field494.length() > 0) {
                            this.field494 = this.field494.substring(0, this.field494.length() - 1);
                            this.field280 = true;
                        }
                    } else if (this.field426 == -1 && this.field293 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field360.length() < 80) {
                            this.field360 = this.field360 + (char) var2;
                            this.field280 = true;
                        }
                        if (var2 == 8 && this.field360.length() > 0) {
                            this.field360 = this.field360.substring(0, this.field360.length() - 1);
                            this.field280 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field360.length() > 0) {
                            if (this.field580 == 2) {
                                if (this.field360.equals("::clientdrop")) {
                                    this.method95(true);
                                }
                                if (this.field360.equals("::lag")) {
                                    this.method98(false);
                                }
                                if (this.field360.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field566.method360(2, 1); ++var13) {
                                        this.field566.method361(var13, -155, (byte) 1, 2);
                                    }
                                }
                                if (this.field360.equals("::fpson")) {
                                    field542 = true;
                                }
                                if (this.field360.equals("::fpsoff")) {
                                    field542 = false;
                                }
                                if (this.field360.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field585[var14].field921[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field360.startsWith("::")) {
                                this.field501.method377(this.field242, 12);
                                this.field501.method378(this.field360.length() - 1);
                                this.field501.method385(this.field360.substring(2));
                            } else {
                                String var17 = this.field360.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field360 = this.field360.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field360 = this.field360.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field360 = this.field360.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field360 = this.field360.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field360 = this.field360.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field360 = this.field360.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field360 = this.field360.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field360 = this.field360.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field360 = this.field360.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field360 = this.field360.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field360 = this.field360.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field360 = this.field360.substring(6);
                                }
                                String var19 = this.field360.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field360 = this.field360.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field360 = this.field360.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field360 = this.field360.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field360 = this.field360.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field360 = this.field360.substring(6);
                                }
                                this.field501.method377(this.field242, 153);
                                this.field501.method378(0);
                                int var21 = this.field501.field1225;
                                this.field501.method404(var20, true);
                                this.field501.method405(var18, 574);
                                this.field271.field1225 = 0;
                                class7.method18(-438, this.field271, this.field360);
                                this.field501.method425(0, this.field178, this.field271.field1225, this.field271.field1224);
                                this.field501.method387(this.field501.field1225 - var21, true);
                                this.field360 = class7.method19(false, this.field360);
                                this.field360 = class25.method240(false, this.field360);
                                field353.field1714 = this.field360;
                                field353.field1741 = var18;
                                field353.field1705 = var20;
                                field353.field1721 = 150;
                                if (this.field580 == 2) {
                                    this.method40("@cr2@" + field353.field999, 2, field353.field1714, this.field144);
                                } else if (this.field580 == 1) {
                                    this.method40("@cr1@" + field353.field999, 2, field353.field1714, this.field144);
                                } else {
                                    this.method40(field353.field999, 2, field353.field1714, this.field144);
                                }
                                if (this.field385 == 2) {
                                    this.field385 = 3;
                                    this.field578 = true;
                                    this.field501.method377(this.field242, 19);
                                    this.field501.method378(this.field385);
                                    this.field501.method378(this.field180);
                                    this.field501.method378(this.field268);
                                }
                            }
                            this.field360 = "";
                            this.field280 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field450.length() < 12) {
                this.field450 = this.field450 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method93(byte arg0) {
        this.field489 = new class40(this.field556, "titlebox", 0);
        this.field490 = new class40(this.field556, "titlebutton", 0);
        this.field164 = new class40[12];
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field574 = null;
        }
        for (int var3 = 0; var3 < 12; ++var3) {
            this.field164[var3] = new class40(this.field556, "runes", var3);
        }
        this.field373 = new class3(128, 265);
        this.field374 = new class3(128, 265);
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field373.field22[var4] = this.field191.field1121[var4];
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field374.field22[var5] = this.field192.field1121[var5];
        }
        this.field498 = new int[256];
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field498[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field498[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field498[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field498[var9 + 192] = 16777215;
        }
        this.field499 = new int[256];
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field499[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field499[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field499[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field499[var13 + 192] = 16777215;
        }
        this.field500 = new int[256];
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field500[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field500[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field500[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field500[var17 + 192] = 16777215;
        }
        this.field497 = new int[256];
        this.field486 = new int[32768];
        this.field487 = new int[32768];
        this.method155(-639, (class40) null);
        this.field400 = new int[32768];
        this.field401 = new int[32768];
        this.method146(10, "Connecting to fileserver", field118);
        if (!this.field163) {
            this.field503 = true;
            this.field163 = true;
            this.method54(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSYVEZPUN;I)V")
    private final void method94(class54 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1310 == 0) {
            var3 = this.field589.method568(arg0.field1309, arg0.field1311, arg0.field1312);
        }
        if (arg0.field1310 == 1) {
            var3 = this.field589.method569(false, arg0.field1311, arg0.field1309, arg0.field1312);
        }
        if (arg0.field1310 == 2) {
            var3 = this.field589.method570(arg0.field1309, arg0.field1311, arg0.field1312);
        }
        if (arg0.field1310 == 3) {
            var3 = this.field589.method571(arg0.field1309, arg0.field1311, arg0.field1312);
        }
        if (var3 != 0) {
            int var7 = this.field589.method572(arg0.field1309, arg0.field1311, arg0.field1312, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1305 = var4;
        arg0.field1307 = var5;
        if (arg1 < 0) {
            arg0.field1306 = var6;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method95(boolean arg0) {
        if (this.field457 > 0) {
            this.method67(0);
        } else {
            this.method68("Please wait - attempting to reestablish", "Connection lost", this.field357);
            this.field420 = 0;
            this.field468 = 0;
            class41 var2 = this.field123;
            this.field269 = false;
            this.field224 = 0;
            this.method167(this.field546, this.field547, true);
            if (arg0) {
                if (!this.field269) {
                    this.method67(0);
                }
                try {
                    var2.method322();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILRSWRPCHR;)V")
    private final void method96(byte arg0, int arg1, class50 arg2) {
        while (true) {
            if (arg2.field1226 + 10 < arg1 * 8) {
                int var4 = arg2.method399(0, 11);
                if (var4 != 2047) {
                    if (this.field390[var4] == null) {
                        this.field390[var4] = new class36();
                        if (this.field395[var4] != null) {
                            this.field390[var4].method311(this.field395[var4], this.field237);
                        }
                    }
                    this.field392[this.field391++] = var4;
                    class36 var5 = this.field390[var4];
                    var5.field1720 = field399;
                    int var6 = arg2.method399(0, 1);
                    int var7 = arg2.method399(0, 1);
                    if (var7 == 1) {
                        this.field394[this.field393++] = var4;
                    }
                    int var8 = arg2.method399(0, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg2.method399(0, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method600(var6 == 1, field353.field1723[0] + var8, field353.field1722[0] + var9, -40589);
                    continue;
                }
            }
            arg2.method400((byte) -67);
            if (arg0 != 9) {
                this.field454 = arg2.method388();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method97(int arg0) {
        class65 var2 = (class65) this.field478.method206();
        if (arg0 >= 0) {
            this.field295 = !this.field295;
        }
        while (var2 != null) {
            if (this.field363 == var2.field1589 && !var2.field1586) {
                if (field399 >= var2.field1584) {
                    var2.method536(this.field233, this.field330);
                    if (var2.field1586) {
                        var2.method20();
                    } else {
                        this.field589.method553(var2, false, var2.field1591, 0, var2.field1592, -1, false, var2.field1589, 60, var2.field1590);
                    }
                }
            } else {
                var2.method20();
            }
            var2 = (class65) this.field478.method208(262);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public void method98(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field243);
        if (!arg0) {
            if (this.field566 != null) {
                System.out.println("Od-cycle:" + this.field566.field1145);
            }
            System.out.println("loop-cycle:" + field399);
            System.out.println("draw-cycle:" + field154);
            System.out.println("ptype:" + this.field454);
            System.out.println("psize:" + this.field453);
            if (this.field123 != null) {
                this.field123.method327(false);
            }
            super.field931 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method99(boolean arg0) {
        if (arg0) {
            this.field574 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field937 != null ? super.field937 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method100(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg1 - arg2;
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
    public final void method101(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field445 >= 100 && this.field428 != 1) {
                this.method40("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", this.field144);
            } else if (this.field445 >= 200) {
                this.method40("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", this.field144);
            } else {
                String var4 = class9.method172((byte) -32, class9.method169(false, arg1));
                int var5 = 71 / arg0;
                for (int var6 = 0; var6 < this.field445; ++var6) {
                    if (this.field324[var6] == arg1) {
                        this.method40("", 0, var4 + " is already on your friend list", this.field144);
                        return;
                    }
                }
                for (int var7 = 0; var7 < this.field256; ++var7) {
                    if (this.field573[var7] == arg1) {
                        this.method40("", 0, "Please remove " + var4 + " from your ignore list first", this.field144);
                        return;
                    }
                }
                if (!var4.equals(field353.field999)) {
                    this.field265[this.field445] = var4;
                    this.field324[this.field445] = arg1;
                    this.field568[this.field445] = 0;
                    ++this.field445;
                    this.field410 = true;
                    this.field501.method377(this.field242, 145);
                    this.field501.method384(arg1, -12199);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIILIGMZHLWJ;I)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class22 arg7, int arg8) {
        if (arg0 < 7 || arg0 > 7) {
            this.field237 = !this.field237;
        }
        if (this.field172) {
            this.field513 = 32;
        } else {
            this.field513 = 0;
        }
        this.field172 = false;
        if (arg1 >= arg3 && arg1 < arg3 + 16 && arg8 >= arg2 && arg8 < arg2 + 16) {
            arg7.field835 -= this.field461 * 4;
            if (arg5 == 1) {
                this.field410 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field280 = true;
            }
        } else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg8 >= arg2 + arg6 - 16 && arg8 < arg2 + arg6) {
            arg7.field835 += this.field461 * 4;
            if (arg5 == 1) {
                this.field410 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field280 = true;
            }
        } else if (arg1 >= arg3 - this.field513 && arg1 < arg3 + 16 + this.field513 && arg8 >= arg2 + 16 && arg8 < arg2 + arg6 - 16 && this.field461 > 0) {
            int var10 = (arg6 - 32) * arg6 / arg4;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg8 - arg2 - 16 - var10 / 2;
            int var12 = arg6 - 32 - var10;
            arg7.field835 = (arg4 - arg6) * var11 / var12;
            if (arg5 == 1) {
                this.field410 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field280 = true;
            }
            this.field172 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIIIII)V")
    private final void method103(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field512 != arg0) {
            this.field454 = this.field337.method388();
        }
        if (arg6 >= 1 && arg7 >= 1 && arg6 <= 102 && arg7 <= 102) {
            if (field517 && this.field363 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg1 == 0) {
                var9 = this.field589.method568(arg2, arg6, arg7);
            }
            if (arg1 == 1) {
                var9 = this.field589.method569(false, arg6, arg2, arg7);
            }
            if (arg1 == 2) {
                var9 = this.field589.method570(arg2, arg6, arg7);
            }
            if (arg1 == 3) {
                var9 = this.field589.method571(arg2, arg6, arg7);
            }
            if (var9 != 0) {
                int var13 = this.field589.method572(arg2, arg6, arg7, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg1 == 0) {
                    this.field589.method559(arg7, -341, arg6, arg2);
                    class59 var17 = class59.method450(var14);
                    if (var17.field1367) {
                        this.field585[arg2].method288(var15, var17.field1410, 77, arg7, arg6, var16);
                    }
                }
                if (arg1 == 1) {
                    this.field589.method560(arg7, arg6, 8, arg2);
                }
                if (arg1 == 2) {
                    this.field589.method561((byte) 5, arg6, arg7, arg2);
                    class59 var18 = class59.method450(var14);
                    if (var18.field1411 + arg6 > 103 || var18.field1411 + arg7 > 103 || var18.field1379 + arg6 > 103 || var18.field1379 + arg7 > 103) {
                        return;
                    }
                    if (var18.field1367) {
                        this.field585[arg2].method289(var18.field1410, var18.field1379, var16, arg7, arg6, var18.field1411, false);
                    }
                }
                if (arg1 == 3) {
                    this.field589.method562(arg2, arg7, arg6, (byte) -77);
                    class59 var19 = class59.method450(var14);
                    if (var19.field1367 && var19.field1365) {
                        this.field585[arg2].method291(arg7, true, arg6);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field543[1][arg6][arg7] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                class62.method510(arg6, arg2, var20, this.field590, arg5, (byte) 1, arg3, arg4, arg7, this.field589, this.field585[arg2]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LRSWRPCHR;II)V")
    private final void method104(class50 arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            this.field574 = null;
        }
        this.field448 = 0;
        this.field393 = 0;
        this.method120(false, arg0, arg2);
        this.method61(-14872, arg2, arg0);
        this.method41(45509, arg0, arg2);
        for (int var4 = 0; var4 < this.field448; ++var4) {
            int var6 = this.field449[var4];
            if (field399 != this.field272[var6].field1720) {
                this.field272[var6].field876 = null;
                this.field272[var6] = null;
            }
        }
        if (arg0.field1225 != arg2) {
            signlink.reporterror(this.field546 + " size mismatch in getnpcpos - pos:" + arg0.field1225 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field273; ++var5) {
                if (this.field272[this.field274[var5]] == null) {
                    signlink.reporterror(this.field546 + " null entry in npc list - pos:" + var5 + " size:" + this.field273);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method105(int arg0) {
        this.field352.method351(-181);
        class63.field1561 = this.field133;
        this.field319.method320((byte) -91, 0, 0);
        if (this.field509) {
            this.field205.method179(-35070, 0, 239, 40, this.field240);
            this.field205.method179(-35070, 128, 239, 60, this.field601 + "*");
        } else if (this.field474 == 1) {
            this.field205.method179(-35070, 0, 239, 40, "Enter amount:");
            this.field205.method179(-35070, 128, 239, 60, this.field494 + "*");
        } else if (this.field474 == 2) {
            this.field205.method179(-35070, 0, 239, 40, "Enter name:");
            this.field205.method179(-35070, 128, 239, 60, this.field494 + "*");
        } else if (this.field474 == 3) {
            if (this.field504 != this.field494) {
                this.method65(false, this.field494);
                this.field504 = this.field494;
            }
            class13 var2 = this.field204;
            class45.method341(0, 463, 0, 77, -44482);
            for (int var3 = 0; var3 < this.field505; ++var3) {
                int var4 = var3 * 14 + 18 - this.field508;
                if (var4 > 0 && var4 < 110) {
                    var2.method179(-35070, 0, 239, var4, this.field506[var3]);
                }
            }
            class45.method340(3393);
            if (this.field505 > 5) {
                this.method42(this.field508, 0, this.field505 * 14 + 7, 463, 3, 77);
            }
            if (this.field494.length() == 0) {
                this.field205.method179(-35070, 255, 239, 40, "Enter object name");
            } else if (this.field505 == 0) {
                this.field205.method179(-35070, 0, 239, 40, "No matching objects found, please shorten search");
            }
            var2.method179(-35070, 0, 239, 90, this.field494 + "*");
            class45.method347(77, 160, 0, 0, 479);
        } else if (this.field177 != null) {
            this.field205.method179(-35070, 0, 239, 40, this.field177);
            this.field205.method179(-35070, 128, 239, 60, "Click to continue");
        } else if (this.field426 != -1) {
            this.method143(0, class22.method215(this.field426), 0, 0, true);
        } else if (this.field599 != -1) {
            this.method143(0, class22.method215(this.field599), 0, 0, true);
        } else {
            class13 var5 = this.field204;
            int var6 = 0;
            class45.method341(0, 463, 0, 77, -44482);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field251[var7] != null) {
                    int var10 = this.field249[var7];
                    int var11 = 70 - var6 * 14 + this.field361;
                    String var12 = this.field250[var7];
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
                            var5.method183(4, (byte) 0, 0, var11, this.field251[var7]);
                        }
                        ++var6;
                    }
                    if ((var10 == 1 || var10 == 2) && (var10 == 1 || this.field385 == 0 || this.field385 == 1 && this.method126(var12, (byte) 1))) {
                        if (var11 > 0 && var11 < 110) {
                            int var14 = 4;
                            if (var13 == 1) {
                                this.field529[0].method320((byte) -91, var14, var11 - 12);
                                var14 += 14;
                            }
                            if (var13 == 2) {
                                this.field529[1].method320((byte) -91, var14, var11 - 12);
                                var14 += 14;
                            }
                            var5.method183(var14, (byte) 0, 0, var11, var12 + ":");
                            int var15 = var14 + var5.method181(0, var12) + 8;
                            var5.method183(var15, (byte) 0, 255, var11, this.field251[var7]);
                        }
                        ++var6;
                    }
                    if ((var10 == 3 || var10 == 7) && this.field480 == 0 && (var10 == 7 || this.field180 == 0 || this.field180 == 1 && this.method126(var12, (byte) 1))) {
                        if (var11 > 0 && var11 < 110) {
                            byte var16 = 4;
                            var5.method183(var16, (byte) 0, 0, var11, "From");
                            int var17 = var16 + var5.method181(0, "From ");
                            if (var13 == 1) {
                                this.field529[0].method320((byte) -91, var17, var11 - 12);
                                var17 += 14;
                            }
                            if (var13 == 2) {
                                this.field529[1].method320((byte) -91, var17, var11 - 12);
                                var17 += 14;
                            }
                            var5.method183(var17, (byte) 0, 0, var11, var12 + ":");
                            int var18 = var17 + var5.method181(0, var12) + 8;
                            var5.method183(var18, (byte) 0, 8388608, var11, this.field251[var7]);
                        }
                        ++var6;
                    }
                    if (var10 == 4 && (this.field268 == 0 || this.field268 == 1 && this.method126(var12, (byte) 1))) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method183(4, (byte) 0, 8388736, var11, var12 + " " + this.field251[var7]);
                        }
                        ++var6;
                    }
                    if (var10 == 5 && this.field480 == 0 && this.field180 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method183(4, (byte) 0, 8388608, var11, this.field251[var7]);
                        }
                        ++var6;
                    }
                    if (var10 == 6 && this.field480 == 0 && this.field180 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method183(4, (byte) 0, 0, var11, "To " + var12 + ":");
                            var5.method183(12 + var5.method181(0, "To " + var12), (byte) 0, 8388608, var11, this.field251[var7]);
                        }
                        ++var6;
                    }
                    if (var10 == 8 && (this.field268 == 0 || this.field268 == 1 && this.method126(var12, (byte) 1))) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method183(4, (byte) 0, 8270336, var11, var12 + " " + this.field251[var7]);
                        }
                        ++var6;
                    }
                }
            }
            class45.method340(3393);
            this.field153 = var6 * 14 + 7;
            if (this.field153 < 78) {
                this.field153 = 78;
            }
            this.method42(this.field153 - this.field361 - 77, 0, this.field153, 463, 3, 77);
            String var8;
            if (field353 != null && field353.field999 != null) {
                var8 = field353.field999;
            } else {
                var8 = class9.method172((byte) -32, this.field546);
            }
            var5.method183(4, (byte) 0, 0, 90, var8 + ":");
            var5.method183(6 + var5.method181(0, var8 + ": "), (byte) 0, 255, 90, this.field360 + "*");
            class45.method347(77, 160, 0, 0, 479);
        }
        if (this.field502 && this.field225 == 2) {
            this.method86(-18010);
        }
        this.field352.method352(17, 357, super.field934, (byte) 108);
        this.field351.method351(-181);
        int var9 = 56 / arg0;
        class63.field1561 = this.field135;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method106(boolean arg0) {
        this.field598 = true;
        if (arg0) {
            this.field362 = this.field483.method312();
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field163) {
                ++this.field243;
                this.method72(15371);
                this.method72(15371);
                this.method39(1);
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
        this.field598 = false;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LRSWRPCHR;II)V")
    private final void method107(class50 arg0, int arg1, int arg2) {
        int var4 = 66 / arg1;
        int var5 = arg0.method399(0, 8);
        if (var5 < this.field391) {
            for (int var6 = var5; var6 < this.field391; ++var6) {
                this.field449[this.field448++] = this.field392[var6];
            }
        }
        if (var5 > this.field391) {
            signlink.reporterror(this.field546 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field391 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field392[var7];
                class36 var9 = this.field390[var8];
                int var10 = arg0.method399(0, 1);
                if (var10 == 0) {
                    this.field392[this.field391++] = var8;
                    var9.field1720 = field399;
                } else {
                    int var11 = arg0.method399(0, 2);
                    if (var11 == 0) {
                        this.field392[this.field391++] = var8;
                        var9.field1720 = field399;
                        this.field394[this.field393++] = var8;
                    } else if (var11 == 1) {
                        this.field392[this.field391++] = var8;
                        var9.field1720 = field399;
                        int var12 = arg0.method399(0, 3);
                        var9.method599(false, 0, var12);
                        int var13 = arg0.method399(0, 1);
                        if (var13 == 1) {
                            this.field394[this.field393++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field392[this.field391++] = var8;
                        var9.field1720 = field399;
                        int var14 = arg0.method399(0, 3);
                        var9.method599(true, 0, var14);
                        int var15 = arg0.method399(0, 3);
                        var9.method599(true, 0, var15);
                        int var16 = arg0.method399(0, 1);
                        if (var16 == 1) {
                            this.field394[this.field393++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field449[this.field448++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method108(int arg0) {
        if (this.field173 == 2) {
            this.method31(this.field260 * 2, (this.field259 - this.field563 << 7) + this.field262, (this.field258 - this.field562 << 7) + this.field261, -627);
            if (arg0 != 0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (this.field576 > -1 && field399 % 20 < 10) {
                this.field171[0].method9((byte) -91, this.field576 - 12, this.field577 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field514 = Integer.parseInt(this.getParameter("nodeid"));
        field515 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method55(-1814);
        } else {
            method80(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field516 = false;
        } else {
            field516 = true;
        }
        this.method296(551, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method109(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field256 >= 100) {
                this.method40("", 0, "Your ignore list is full. Max of 100 hit", this.field144);
            } else {
                String var4 = class9.method172((byte) -32, class9.method169(false, arg1));
                for (int var5 = 0; var5 < this.field256; ++var5) {
                    if (this.field573[var5] == arg1) {
                        this.method40("", 0, var4 + " is already on your ignore list", this.field144);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field445; ++var6) {
                    if (this.field324[var6] == arg1) {
                        this.method40("", 0, "Please remove " + var4 + " from your friend list first", this.field144);
                        return;
                    }
                }
                this.field573[this.field256++] = arg1;
                this.field410 = true;
                this.field501.method377(this.field242, 112);
                if (arg0) {
                    this.field454 = -1;
                }
                this.field501.method384(arg1, -12199);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg6 & 2047;
        this.field453 += arg2;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = class61.field1509[var8];
            int var14 = class61.field1510[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class61.field1509[var9];
            int var17 = class61.field1510[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field549 = arg4 - var10;
        this.field550 = arg5 - var11;
        this.field551 = arg1 - var12;
        this.field552 = arg0;
        this.field553 = arg6;
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method111(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method112(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method113(boolean arg0) {
        if (this.field114 >= 2 || this.field405 != 0 || this.field380 != 0) {
            if (arg0) {
                String var2;
                if (this.field405 == 1 && this.field114 < 2) {
                    var2 = "Use " + this.field409 + " with...";
                } else if (this.field380 == 1 && this.field114 < 2) {
                    var2 = this.field383 + "...";
                } else {
                    var2 = this.field219[this.field114 - 1];
                }
                if (this.field114 > 2) {
                    var2 = var2 + "@whi@ / " + (this.field114 - 2) + " more options";
                }
                this.field205.method188(false, 15, true, 4, 16777215, var2, field399 / 1000);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
    public final void method114(int arg0, int arg1) {
        if (arg1 == 12281) {
            class22 var3 = class22.method215(arg0);
            for (int var4 = 0; var4 < var3.field830.length && var3.field830[var4] != -1; ++var4) {
                class22 var5 = class22.method215(var3.field830[var4]);
                if (var5.field840 == 1) {
                    this.method114(var5.field825, 12281);
                }
                var5.field821 = 0;
                var5.field803 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method115(int arg0) {
        if (this.field188 == null) {
            super.field935 = null;
            this.field352 = null;
            this.field350 = null;
            this.field349 = null;
            if (arg0 == 5) {
                this.field351 = null;
                this.field321 = null;
                this.field322 = null;
                this.field323 = null;
                this.field191 = new class46(3, 265, 128, this.method99(false));
                class45.method342((byte) 32);
                this.field192 = new class46(3, 265, 128, this.method99(false));
                class45.method342((byte) 32);
                this.field188 = new class46(3, 171, 509, this.method99(false));
                class45.method342((byte) 32);
                this.field189 = new class46(3, 132, 360, this.method99(false));
                class45.method342((byte) 32);
                this.field190 = new class46(3, 200, 360, this.method99(false));
                class45.method342((byte) 32);
                this.field193 = new class46(3, 238, 202, this.method99(false));
                class45.method342((byte) 32);
                this.field194 = new class46(3, 238, 203, this.method99(false));
                class45.method342((byte) 32);
                this.field195 = new class46(3, 94, 74, this.method99(false));
                class45.method342((byte) 32);
                this.field196 = new class46(3, 94, 75, this.method99(false));
                class45.method342((byte) 32);
                if (this.field556 != null) {
                    this.method89(field285);
                    this.method93((byte) 7);
                }
                this.field235 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method116(byte arg0) {
        if (this.field186 > 1) {
            --this.field186;
        }
        if (this.field457 > 0) {
            --this.field457;
        }
        for (int var2 = 0; var2 < 5 && this.method163(-341); ++var2) {
        }
        if (this.field269) {
            Object var3 = this.field247.field1038;
            synchronized (this.field247.field1038) {
                if (!field355) {
                    this.field247.field1034 = 0;
                } else if (super.field948 != 0 || this.field247.field1034 >= 40) {
                    this.field501.method377(this.field242, 238);
                    this.field501.method378(0);
                    int var4 = this.field501.field1225;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field247.field1034 && var4 - this.field501.field1225 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field247.field1035[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field247.field1036[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field247.field1035[var6] == -1 && this.field247.field1036[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field376 == var8 && this.field377 == var7) {
                            if (this.field522 < 2047) {
                                ++this.field522;
                            }
                        } else {
                            int var10 = var8 - this.field376;
                            this.field376 = var8;
                            int var11 = var7 - this.field377;
                            this.field377 = var7;
                            if (this.field522 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field501.method379((this.field522 << 12) + (var10 << 6) + var11);
                                this.field522 = 0;
                            } else if (this.field522 < 8) {
                                this.field501.method381((this.field522 << 19) + 8388608 + var9);
                                this.field522 = 0;
                            } else {
                                this.field501.method382((this.field522 << 19) + -1073741824 + var9);
                                this.field522 = 0;
                            }
                        }
                    }
                    this.field501.method387(this.field501.field1225 - var4, true);
                    if (var5 >= this.field247.field1034) {
                        this.field247.field1034 = 0;
                    } else {
                        this.field247.field1034 -= var5;
                        for (int var12 = 0; var12 < this.field247.field1034; ++var12) {
                            this.field247.field1036[var12] = this.field247.field1036[var5 + var12];
                            this.field247.field1035[var12] = this.field247.field1035[var5 + var12];
                        }
                    }
                }
            }
            if (super.field948 != 0) {
                long var13 = (super.field951 - this.field121) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field121 = super.field951;
                int var15 = super.field950;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field949;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field948 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field501.method377(this.field242, 133);
                this.field501.method421(-913, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field199 > 0) {
                --this.field199;
            }
            if (super.field952[1] == 1 || super.field952[2] == 1 || super.field952[3] == 1 || super.field952[4] == 1) {
                this.field200 = true;
            }
            if (this.field200 && this.field199 <= 0) {
                this.field199 = 20;
                this.field200 = false;
                this.field501.method377(this.field242, 144);
                this.field501.method412(628, this.field333);
                this.field501.method412(628, this.field334);
            }
            if (super.field939 && !this.field232) {
                this.field232 = true;
                this.field501.method377(this.field242, 166);
                this.field501.method378(1);
            }
            if (!super.field939 && this.field232) {
                this.field232 = false;
                this.field501.method377(this.field242, 166);
                this.field501.method378(0);
            }
            this.method152(-632);
            this.method58(2);
            this.method63(-608);
            ++this.field455;
            if (this.field455 > 750) {
                this.method95(true);
            }
            this.method130(this.field252);
            this.method135(-82);
            this.method91(19400);
            ++this.field330;
            if (this.field594 != 0) {
                this.field593 += 20;
                if (this.field593 >= 400) {
                    this.field594 = 0;
                }
            }
            if (this.field210 != 0) {
                ++this.field207;
                if (this.field207 >= 15) {
                    if (this.field210 == 2) {
                        this.field410 = true;
                    }
                    if (this.field210 == 3) {
                        this.field280 = true;
                    }
                    this.field210 = 0;
                }
            }
            if (this.field300 != 0) {
                ++this.field488;
                if (super.field942 > this.field301 + 5 || super.field942 < this.field301 - 5 || super.field943 > this.field302 + 5 || super.field943 < this.field302 - 5) {
                    this.field485 = true;
                }
                if (super.field941 == 0) {
                    if (this.field300 == 2) {
                        this.field410 = true;
                    }
                    if (this.field300 == 3) {
                        this.field280 = true;
                    }
                    this.field300 = 0;
                    if (this.field485 && this.field488 >= 5) {
                        this.field452 = -1;
                        this.method127(831);
                        if (this.field452 == this.field298 && this.field451 != this.field299) {
                            class22 var20 = class22.method215(this.field298);
                            byte var21 = 0;
                            if (this.field174 == 1 && var20.field833 == 206) {
                                var21 = 1;
                            }
                            if (var20.field784[this.field451] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field792) {
                                int var22 = this.field299;
                                int var23 = this.field451;
                                var20.field784[var23] = var20.field784[var22];
                                var20.field797[var23] = var20.field797[var22];
                                var20.field784[var22] = -1;
                                var20.field797[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field299;
                                int var25 = this.field451;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method217(-987, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method217(-987, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method217(-987, this.field451, this.field299);
                            }
                            this.field501.method377(this.field242, 214);
                            this.field501.method413(field152, this.field298);
                            this.field501.method413(field152, this.field299);
                            this.field501.method405(var21, 574);
                            this.field501.method412(628, this.field451);
                        }
                    } else if ((this.field281 == 1 || this.method33(0, this.field114 - 1)) && this.field114 > 2) {
                        this.method35((byte) -81);
                    } else if (this.field114 > 0) {
                        this.method81(-6869, this.field114 - 1);
                    }
                    this.field207 = 10;
                    super.field948 = 0;
                }
            }
            if (class67.field1641 != -1) {
                int var26 = class67.field1641;
                int var27 = class67.field1642;
                boolean var28 = this.method77(0, 0, 0, var26, 0, field353.field1722[0], field353.field1723[0], 0, var27, true, 0, 0);
                class67.field1641 = -1;
                if (var28) {
                    this.field591 = super.field949;
                    this.field592 = super.field950;
                    this.field594 = 1;
                    this.field593 = 0;
                }
            }
            if (super.field948 == 1 && this.field177 != null) {
                this.field177 = null;
                this.field280 = true;
                super.field948 = 0;
            }
            this.method57(8322);
            if (arg0 != 4) {
                this.field454 = this.field337.method388();
            }
            if (this.field293 == -1) {
                this.method47(true);
                this.method66(35473);
                this.method159((byte) 0);
            }
            if (super.field941 == 1 || super.field948 == 1) {
                ++this.field461;
            }
            if (this.field328 == 0 && this.field588 == 0 && this.field151 == 0) {
                if (this.field139 > 0) {
                    --this.field139;
                }
            } else if (this.field139 < 100) {
                ++this.field139;
                if (this.field139 == 100) {
                    if (this.field328 != 0) {
                        this.field280 = true;
                    }
                    if (this.field588 != 0) {
                        this.field410 = true;
                    }
                }
            }
            if (this.field443 == 2) {
                this.method53(0);
            }
            if (this.field443 == 2 && this.field245) {
                this.method62(7);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field417[var29]++;
            }
            this.method92(-932);
            ++super.field940;
            if (super.field940 > 4500) {
                this.field457 = 250;
                super.field940 -= 500;
                this.field501.method377(this.field242, 88);
            }
            ++this.field179;
            if (this.field179 > 500) {
                this.field179 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field596 += this.field597;
                }
                if ((var30 & 2) == 2) {
                    this.field422 += this.field423;
                }
                if ((var30 & 4) == 4) {
                    this.field544 += this.field545;
                }
            }
            if (this.field596 < -50) {
                this.field597 = 2;
            }
            if (this.field596 > 50) {
                this.field597 = -2;
            }
            if (this.field422 < -55) {
                this.field423 = 2;
            }
            if (this.field422 > 55) {
                this.field423 = -2;
            }
            if (this.field544 < -40) {
                this.field545 = 1;
            }
            if (this.field544 > 40) {
                this.field545 = -1;
            }
            ++this.field234;
            if (this.field234 > 500) {
                this.field234 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field168 += this.field169;
                }
                if ((var31 & 2) == 2) {
                    this.field462 += this.field463;
                }
            }
            if (this.field168 < -60) {
                this.field169 = 2;
            }
            if (this.field168 > 60) {
                this.field169 = -2;
            }
            if (this.field462 < -20) {
                this.field463 = 1;
            }
            if (this.field462 > 10) {
                this.field463 = -1;
            }
            ++field267;
            if (field267 > 57) {
                field267 = 0;
                this.field501.method377(this.field242, 143);
            }
            ++this.field456;
            if (this.field456 > 50) {
                this.field501.method377(this.field242, 157);
            }
            try {
                if (this.field123 != null && this.field501.field1225 > 0) {
                    this.field123.method326(0, this.field501.field1225, this.field501.field1224, this.field362);
                    this.field501.field1225 = 0;
                    this.field456 = 0;
                }
            } catch (IOException var33) {
                this.method95(true);
            } catch (Exception var34) {
                this.method67(0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method117(boolean arg0) {
        this.field269 &= arg0;
        for (class10 var2 = (class10) this.field348.method206(); var2 != null; var2 = (class10) this.field348.method208(262)) {
            if (this.field363 == var2.field638 && field399 <= var2.field624) {
                if (field399 >= var2.field623) {
                    if (var2.field637 > 0) {
                        class24 var3 = this.field272[var2.field637 - 1];
                        if (var3 != null && var3.field1702 >= 0 && var3.field1702 < 13312 && var3.field1703 >= 0 && var3.field1703 < 13312) {
                            var2.method176((byte) -119, var3.field1703, var3.field1702, this.method22(-531, var3.field1702, var2.field638, var3.field1703) - var2.field619, field399);
                        }
                    }
                    if (var2.field637 < 0) {
                        int var4 = -var2.field637 - 1;
                        class36 var5;
                        if (this.field396 == var4) {
                            var5 = field353;
                        } else {
                            var5 = this.field390[var4];
                        }
                        if (var5 != null && var5.field1702 >= 0 && var5.field1702 < 13312 && var5.field1703 >= 0 && var5.field1703 < 13312) {
                            var2.method176((byte) -119, var5.field1703, var5.field1702, this.method22(-531, var5.field1702, var2.field638, var5.field1703) - var2.field619, field399);
                        }
                    }
                    var2.method175(false, this.field330);
                    this.field589.method553(var2, false, (int) var2.field621, var2.field641, (int) var2.field622, -1, false, this.field363, 60, (int) var2.field620);
                }
            } else {
                var2.method20();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method118(int arg0) {
        class59.field1378.method3();
        class59.field1364.method3();
        class14.field710.method3();
        class51.field1281.method3();
        int var2 = 56 / arg0;
        class51.field1255.method3();
        class36.field1004.method3();
        class55.field1333.method3();
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method119(byte arg0) {
        if (this.field480 != 0) {
            class13 var2 = this.field204;
            int var3 = 0;
            if (this.field186 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field251[var4] != null) {
                    int var6 = this.field249[var4];
                    String var7 = this.field250[var4];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field180 == 0 || this.field180 == 1 && this.method126(var7, (byte) 1))) {
                        int var9 = 329 - var3 * 13;
                        byte var10 = 4;
                        var2.method183(var10, (byte) 0, 0, var9, "From");
                        var2.method183(var10, (byte) 0, 65535, var9 - 1, "From");
                        int var11 = var10 + var2.method181(0, "From ");
                        if (var8 == 1) {
                            this.field529[0].method320((byte) -91, var11, var9 - 12);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field529[1].method320((byte) -91, var11, var9 - 12);
                            var11 += 14;
                        }
                        var2.method183(var11, (byte) 0, 0, var9, var7 + ": " + this.field251[var4]);
                        var2.method183(var11, (byte) 0, 65535, var9 - 1, var7 + ": " + this.field251[var4]);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field180 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method183(4, (byte) 0, 0, var12, this.field251[var4]);
                        var2.method183(4, (byte) 0, 65535, var12 - 1, this.field251[var4]);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field180 < 2) {
                        int var13 = 329 - var3 * 13;
                        var2.method183(4, (byte) 0, 0, var13, "To " + var7 + ": " + this.field251[var4]);
                        var2.method183(4, (byte) 0, 65535, var13 - 1, "To " + var7 + ": " + this.field251[var4]);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 2) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLRSWRPCHR;I)V")
    private final void method120(boolean arg0, class50 arg1, int arg2) {
        arg1.method398(-313);
        int var4 = arg1.method399(0, 8);
        if (arg0) {
            this.method134();
        }
        if (var4 < this.field273) {
            for (int var5 = var4; var5 < this.field273; ++var5) {
                this.field449[this.field448++] = this.field274[var5];
            }
        }
        if (var4 > this.field273) {
            signlink.reporterror(this.field546 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field273 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field274[var6];
                class24 var8 = this.field272[var7];
                int var9 = arg1.method399(0, 1);
                if (var9 == 0) {
                    this.field274[this.field273++] = var7;
                    var8.field1720 = field399;
                } else {
                    int var10 = arg1.method399(0, 2);
                    if (var10 == 0) {
                        this.field274[this.field273++] = var7;
                        var8.field1720 = field399;
                        this.field394[this.field393++] = var7;
                    } else if (var10 == 1) {
                        this.field274[this.field273++] = var7;
                        var8.field1720 = field399;
                        int var11 = arg1.method399(0, 3);
                        var8.method599(false, 0, var11);
                        int var12 = arg1.method399(0, 1);
                        if (var12 == 1) {
                            this.field394[this.field393++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field274[this.field273++] = var7;
                        var8.field1720 = field399;
                        int var13 = arg1.method399(0, 3);
                        var8.method599(true, 0, var13);
                        int var14 = arg1.method399(0, 3);
                        var8.method599(true, 0, var14);
                        int var15 = arg1.method399(0, 1);
                        if (var15 == 1) {
                            this.field394[this.field393++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field449[this.field448++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
    public final void method121(int arg0, int arg1) {
        int var3 = class60.field1420[arg1].field1428;
        if (arg0 != 4) {
            this.field347 = 120;
        }
        if (var3 != 0) {
            int var4 = this.field214[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class63.method523((byte) 3, 0.9D);
                }
                if (var4 == 2) {
                    class63.method523((byte) 3, 0.8D);
                }
                if (var4 == 3) {
                    class63.method523((byte) 3, 0.7D);
                }
                if (var4 == 4) {
                    class63.method523((byte) 3, 0.6D);
                }
                class51.field1255.method3();
                this.field235 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field525;
                if (var4 == 0) {
                    this.method129((byte) -12, 0, this.field525);
                    this.field525 = true;
                }
                if (var4 == 1) {
                    this.method129((byte) -12, -400, this.field525);
                    this.field525 = true;
                }
                if (var4 == 2) {
                    this.method129((byte) -12, -800, this.field525);
                    this.field525 = true;
                }
                if (var4 == 3) {
                    this.method129((byte) -12, -1200, this.field525);
                    this.field525 = true;
                }
                if (var4 == 4) {
                    this.field525 = false;
                }
                if (this.field525 != var5 && !field517) {
                    if (this.field525) {
                        this.field183 = this.field386;
                        this.field184 = true;
                        this.field566.method370(2, this.field183);
                    } else {
                        this.method70((byte) 6);
                    }
                    this.field165 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field221 = true;
                    this.method144(-646, 0);
                }
                if (var4 == 1) {
                    this.field221 = true;
                    this.method144(-646, -400);
                }
                if (var4 == 2) {
                    this.field221 = true;
                    this.method144(-646, -800);
                }
                if (var4 == 3) {
                    this.field221 = true;
                    this.method144(-646, -1200);
                }
                if (var4 == 4) {
                    this.field221 = false;
                }
            }
            if (var3 == 5) {
                this.field281 = var4;
            }
            if (var3 == 6) {
                this.field471 = var4;
            }
            if (var3 == 8) {
                this.field480 = var4;
                this.field280 = true;
            }
            if (var3 == 9) {
                this.field174 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IILRSWRPCHR;)V")
    public final void method122(int arg0, int arg1, class50 arg2) {
        if (arg0 != 0) {
            field464 = true;
        }
        if (arg1 == 65) {
            int var4 = arg2.method388();
            int var5 = (var4 >> 4 & 7) + this.field431;
            int var6 = (var4 & 7) + this.field432;
            int var7 = arg2.method390();
            int var8 = arg2.method388();
            int var9 = var8 >> 4 & 15;
            int var10 = var8 & 7;
            if (field353.field1722[0] >= var5 - var9 && field353.field1722[0] <= var5 + var9 && field353.field1723[0] >= var6 - var9 && field353.field1723[0] <= var6 + var9 && this.field221 && !field517 && this.field424 < 50) {
                this.field176[this.field424] = var7;
                this.field303[this.field424] = var10;
                this.field384[this.field424] = class43.field1088[var7];
                ++this.field424;
            }
        }
        if (arg1 == 169) {
            int var11 = arg2.method407(804);
            int var12 = (var11 >> 4 & 7) + this.field431;
            int var13 = (var11 & 7) + this.field432;
            int var14 = arg2.method388();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = this.field175[var15];
            int var18 = arg2.method415(65);
            if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
                int var19 = this.field590[this.field363][var12][var13];
                int var20 = this.field590[this.field363][var12 + 1][var13];
                int var21 = this.field590[this.field363][var12 + 1][var13 + 1];
                int var22 = this.field590[this.field363][var12][var13 + 1];
                if (var17 == 0) {
                    class70 var23 = this.field589.method564(-184, var12, var13, this.field363);
                    if (var23 != null) {
                        int var24 = var23.field1691 >> 14 & 32767;
                        if (var15 == 2) {
                            var23.field1689 = new class48(var21, var24, var16 + 4, 466, 2, var22, var20, var18, var19, false);
                            var23.field1690 = new class48(var21, var24, var16 + 1 & 3, 466, 2, var22, var20, var18, var19, false);
                        } else {
                            var23.field1689 = new class48(var21, var24, var16, 466, var15, var22, var20, var18, var19, false);
                        }
                    }
                }
                if (var17 == 1) {
                    class52 var25 = this.field589.method565(this.field264, var13, this.field363, var12);
                    if (var25 != null) {
                        var25.field1298 = new class48(var21, var25.field1299 >> 14 & 32767, 0, 466, 4, var22, var20, var18, var19, false);
                    }
                }
                if (var17 == 2) {
                    class39 var26 = this.field589.method566(var12, this.field363, true, var13);
                    if (var15 == 11) {
                        var15 = 10;
                    }
                    if (var26 != null) {
                        var26.field1045 = new class48(var21, var26.field1053 >> 14 & 32767, var16, 466, var15, var22, var20, var18, var19, false);
                    }
                }
                if (var17 == 3) {
                    class57 var27 = this.field589.method567(var13, var12, this.field244, this.field363);
                    if (var27 != null) {
                        var27.field1350 = new class48(var21, var27.field1351 >> 14 & 32767, var16, 466, 22, var22, var20, var18, var19, false);
                    }
                }
            }
        } else if (arg1 == 245) {
            int var28 = arg2.method390();
            int var29 = arg2.method408(382);
            int var30 = (var29 >> 4 & 7) + this.field431;
            int var31 = (var29 & 7) + this.field432;
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                class17 var32 = this.field574[this.field363][var30][var31];
                if (var32 != null) {
                    for (class27 var33 = (class27) var32.method206(); var33 != null; var33 = (class27) var32.method208(262)) {
                        if ((var28 & 32767) == var33.field906) {
                            var33.method20();
                            break;
                        }
                    }
                    if (var32.method206() == null) {
                        this.field574[this.field363][var30][var31] = null;
                    }
                    this.method82(var30, var31);
                }
            }
        } else if (arg1 == 165) {
            int var34 = arg2.method408(382);
            int var35 = var34 >> 2;
            int var36 = var34 & 3;
            int var37 = this.field175[var35];
            int var38 = arg2.method408(382);
            int var39 = (var38 >> 4 & 7) + this.field431;
            int var40 = (var38 & 7) + this.field432;
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                this.method150(var37, -1, var40, this.field363, var36, this.field296, var35, var39, -1, 0);
            }
        } else {
            if (arg1 == 238) {
                int var41 = arg2.method407(804);
                int var42 = (var41 >> 4 & 7) + this.field431;
                int var43 = (var41 & 7) + this.field432;
                int var44 = arg2.method414(6);
                byte var45 = arg2.method409(0);
                byte var46 = arg2.method410(-298);
                int var47 = arg2.method415(65);
                int var48 = arg2.method415(65);
                int var49 = arg2.method406(41312);
                int var50 = var49 >> 2;
                int var51 = var49 & 3;
                int var52 = this.field175[var50];
                byte var53 = arg2.method409(0);
                int var54 = arg2.method416(-998);
                byte var55 = arg2.method389();
                class36 var56;
                if (this.field396 == var44) {
                    var56 = field353;
                } else {
                    var56 = this.field390[var44];
                }
                if (var56 != null) {
                    class59 var57 = class59.method450(var54);
                    int var58 = this.field590[this.field363][var42][var43];
                    int var59 = this.field590[this.field363][var42 + 1][var43];
                    int var60 = this.field590[this.field363][var42 + 1][var43 + 1];
                    int var61 = this.field590[this.field363][var42][var43 + 1];
                    class61 var62 = var57.method457(var50, var51, var58, var59, var60, var61, -1);
                    if (var62 != null) {
                        this.method150(var52, -1, var43, this.field363, 0, this.field296, 0, var42, var47 + 1, var48 + 1);
                        var56.field1018 = field399 + var48;
                        var56.field1019 = field399 + var47;
                        var56.field997 = var62;
                        int var63 = var57.field1411;
                        int var64 = var57.field1379;
                        if (var51 == 1 || var51 == 3) {
                            var63 = var57.field1379;
                            var64 = var57.field1411;
                        }
                        var56.field994 = var42 * 128 + var63 * 64;
                        var56.field996 = var43 * 128 + var64 * 64;
                        var56.field995 = this.method22(-531, var56.field994, this.field363, var56.field996);
                        if (var55 > var45) {
                            byte var65 = var55;
                            var55 = var45;
                            var45 = var65;
                        }
                        if (var53 > var46) {
                            byte var66 = var53;
                            var53 = var46;
                            var46 = var66;
                        }
                        var56.field1007 = var42 + var55;
                        var56.field1009 = var42 + var45;
                        var56.field1008 = var43 + var53;
                        var56.field1010 = var43 + var46;
                    }
                }
            }
            if (arg1 == 179) {
                int var67 = arg2.method406(41312);
                int var68 = (var67 >> 4 & 7) + this.field431;
                int var69 = (var67 & 7) + this.field432;
                int var70 = arg2.method415(65);
                int var71 = arg2.method416(-998);
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    class27 var72 = new class27();
                    var72.field906 = var71;
                    var72.field907 = var70;
                    if (this.field574[this.field363][var68][var69] == null) {
                        this.field574[this.field363][var68][var69] = new class17(false);
                    }
                    this.field574[this.field363][var68][var69].method203(var72);
                    this.method82(var68, var69);
                }
            } else if (arg1 == 215) {
                int var73 = arg2.method416(-998);
                int var74 = arg2.method407(804);
                int var75 = var74 >> 2;
                int var76 = var74 & 3;
                int var77 = this.field175[var75];
                int var78 = arg2.method408(382);
                int var79 = (var78 >> 4 & 7) + this.field431;
                int var80 = (var78 & 7) + this.field432;
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    this.method150(var77, var73, var80, this.field363, var76, this.field296, var75, var79, -1, 0);
                }
            } else if (arg1 == 237) {
                int var81 = arg2.method388();
                int var82 = (var81 >> 4 & 7) + this.field431;
                int var83 = (var81 & 7) + this.field432;
                int var84 = var82 + arg2.method389();
                int var85 = var83 + arg2.method389();
                int var86 = arg2.method391();
                int var87 = arg2.method390();
                int var88 = arg2.method388() * 4;
                int var89 = arg2.method388() * 4;
                int var90 = arg2.method390();
                int var91 = arg2.method390();
                int var92 = arg2.method388();
                int var93 = arg2.method388();
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var87 != 65535) {
                    int var94 = var82 * 128 + 64;
                    int var95 = var83 * 128 + 64;
                    int var96 = var84 * 128 + 64;
                    int var97 = var85 * 128 + 64;
                    class10 var98 = new class10(field399 + var91, var93, field399 + var90, this.field595, var94, var95, var86, var89, this.field363, this.method22(-531, var94, this.field363, var95) - var88, var92, var87);
                    var98.method176((byte) -119, var97, var96, this.method22(-531, var96, this.field363, var97) - var89, field399 + var90);
                    this.field348.method203(var98);
                }
            } else if (arg1 == 48) {
                int var99 = arg2.method388();
                int var100 = (var99 >> 4 & 7) + this.field431;
                int var101 = (var99 & 7) + this.field432;
                int var102 = arg2.method390();
                int var103 = arg2.method388();
                int var104 = arg2.method390();
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    int var105 = var100 * 128 + 64;
                    int var106 = var101 * 128 + 64;
                    class65 var107 = new class65(var102, false, var106, var104, var105, this.method22(-531, var105, this.field363, var106) - var103, this.field363, field399);
                    this.field478.method203(var107);
                }
            } else if (arg1 == 155) {
                int var108 = arg2.method408(382);
                int var109 = (var108 >> 4 & 7) + this.field431;
                int var110 = (var108 & 7) + this.field432;
                int var111 = arg2.method415(65);
                int var112 = arg2.method415(65);
                int var113 = arg2.method414(6);
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104 && this.field396 != var111) {
                    class27 var114 = new class27();
                    var114.field906 = var112;
                    var114.field907 = var113;
                    if (this.field574[this.field363][var109][var110] == null) {
                        this.field574[this.field363][var109][var110] = new class17(false);
                    }
                    this.field574[this.field363][var109][var110].method203(var114);
                    this.method82(var109, var110);
                }
            } else if (arg1 == 189) {
                int var115 = arg2.method388();
                int var116 = (var115 >> 4 & 7) + this.field431;
                int var117 = (var115 & 7) + this.field432;
                int var118 = arg2.method390();
                int var119 = arg2.method390();
                int var120 = arg2.method390();
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    class17 var121 = this.field574[this.field363][var116][var117];
                    if (var121 != null) {
                        for (class27 var122 = (class27) var121.method206(); var122 != null; var122 = (class27) var121.method208(262)) {
                            if ((var118 & 32767) == var122.field906 && var122.field907 == var119) {
                                var122.field907 = var120;
                                break;
                            }
                        }
                        this.method82(var116, var117);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(II)Ljava/lang/String;")
    public final String method123(int arg0, int arg1) {
        if (arg0 != 8) {
            this.field501.method378(150);
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILRSWRPCHR;IZLMVRUIIXW;)V")
    private final void method124(int arg0, class50 arg1, int arg2, boolean arg3, class36 arg4) {
        if (arg3) {
            this.field571 = 3;
        }
        if ((arg2 & 128) != 0) {
            arg4.field1728 = arg1.method390();
            arg4.field1729 = arg1.method414(6);
        }
        if ((arg2 & 4) != 0) {
            arg4.field1714 = arg1.method395();
            if (arg4.field1714.charAt(0) == '~') {
                arg4.field1714 = arg4.field1714.substring(1);
                this.method40(arg4.field999, 2, arg4.field1714, this.field144);
            } else if (field353 == arg4) {
                this.method40(arg4.field999, 2, arg4.field1714, this.field144);
            }
            arg4.field1741 = 0;
            arg4.field1705 = 0;
            arg4.field1721 = 150;
        }
        if ((arg2 & 1) != 0) {
            arg4.field1734 = arg1.method390();
            if (arg4.field1734 == 65535) {
                arg4.field1734 = -1;
            }
        }
        if ((arg2 & 8) != 0) {
            int var6 = arg1.method388();
            int var7 = arg1.method388();
            arg4.method597(field399, var6, var7, 0);
            arg4.field1716 = field399 + 300;
            arg4.field1717 = arg1.method406(41312);
            arg4.field1718 = arg1.method408(382);
        }
        if ((arg2 & 1024) != 0) {
            arg4.field1693 = arg1.method406(41312);
            arg4.field1695 = arg1.method408(382);
            arg4.field1694 = arg1.method406(41312);
            arg4.field1696 = arg1.method388();
            arg4.field1697 = arg1.method416(-998) + field399;
            arg4.field1698 = arg1.method415(65) + field399;
            arg4.field1699 = arg1.method406(41312);
            arg4.method598(-13889);
        }
        if ((arg2 & 32) != 0) {
            int var8 = arg1.method406(41312);
            byte[] var9 = new byte[var8];
            class50 var10 = new class50(var9, -46859);
            arg1.method397(true, var9, var8, 0);
            this.field395[arg0] = var10;
            arg4.method311(var10, this.field237);
        }
        if ((arg2 & 256) != 0) {
            arg4.field1736 = arg1.method414(6);
            int var11 = arg1.method424(true);
            arg4.field1740 = var11 >> 16;
            arg4.field1739 = (var11 & 65535) + field399;
            arg4.field1737 = 0;
            arg4.field1738 = 0;
            if (arg4.field1739 > field399) {
                arg4.field1737 = -1;
            }
            if (arg4.field1736 == 65535) {
                arg4.field1736 = -1;
            }
        }
        if ((arg2 & 512) != 0) {
            int var12 = arg1.method408(382);
            int var13 = arg1.method408(382);
            arg4.method597(field399, var12, var13, 0);
            arg4.field1716 = field399 + 300;
            arg4.field1717 = arg1.method408(382);
            arg4.field1718 = arg1.method408(382);
        }
        if ((arg2 & 2) != 0) {
            int var14 = arg1.method390();
            if (var14 == 65535) {
                var14 = -1;
            }
            int var15 = arg1.method408(382);
            if (arg4.field1743 == var14 && var14 != -1) {
                int var16 = class33.field963[var14].field977;
                if (var16 == 1) {
                    arg4.field1744 = 0;
                    arg4.field1745 = 0;
                    arg4.field1746 = var15;
                    arg4.field1747 = 0;
                }
                if (var16 == 2) {
                    arg4.field1747 = 0;
                }
            } else if (var14 == -1 || arg4.field1743 == -1 || class33.field963[var14].field971 >= class33.field963[arg4.field1743].field971) {
                arg4.field1743 = var14;
                arg4.field1744 = 0;
                arg4.field1745 = 0;
                arg4.field1746 = var15;
                arg4.field1747 = 0;
                arg4.field1715 = arg4.field1713;
            }
        }
        if ((arg2 & 64) != 0) {
            int var17 = arg1.method390();
            int var18 = arg1.method406(41312);
            int var19 = arg1.method406(41312);
            int var20 = arg1.field1225;
            if (arg4.field999 != null && arg4.field1021) {
                long var21 = class9.method168(arg4.field999);
                boolean var23 = false;
                if (var18 <= 1) {
                    for (int var24 = 0; var24 < this.field256; ++var24) {
                        if (this.field573[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                }
                if (!var23 && this.field411 == 0) {
                    try {
                        this.field271.field1225 = 0;
                        arg1.method426(0, -197, this.field271.field1224, var19);
                        this.field271.field1225 = 0;
                        String var25 = class7.method17(this.field271, var19, (byte) 14);
                        String var26 = class25.method240(false, var25);
                        arg4.field1714 = var26;
                        arg4.field1741 = var17 >> 8;
                        arg4.field1705 = var17 & 255;
                        arg4.field1721 = 150;
                        if (var18 != 2 && var18 != 3) {
                            if (var18 == 1) {
                                this.method40("@cr1@" + arg4.field999, 1, var26, this.field144);
                            } else {
                                this.method40(arg4.field999, 2, var26, this.field144);
                            }
                        } else {
                            this.method40("@cr2@" + arg4.field999, 1, var26, this.field144);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field1225 = var19 + var20;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILRSWRPCHR;I)V")
    private final void method125(int arg0, class50 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field393; ++var4) {
            int var6 = this.field394[var4];
            class36 var7 = this.field390[var6];
            int var8 = arg1.method388();
            if ((var8 & 16) != 0) {
                var8 += arg1.method388() << 8;
            }
            this.method124(var6, arg1, var8, false, var7);
        }
        int var5 = 58 / arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method126(String arg0, byte arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        } else {
            boolean var3 = false;
            if (arg0 == null) {
                return false;
            } else {
                for (int var4 = 0; var4 < this.field445; ++var4) {
                    if (arg0.equalsIgnoreCase(this.field265[var4])) {
                        return true;
                    }
                }
                return arg0.equalsIgnoreCase(field353.field999);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (this.field300 == 0) {
            this.field219[0] = "Cancel";
            if (arg0 <= 0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field278[0] = 1843;
            this.field114 = 1;
            if (this.field293 != -1) {
                this.field181 = 0;
                this.field419 = 0;
                this.method132(class22.method215(this.field293), super.field942, 0, 0, (byte) -79, super.field943, 0, 0);
                if (this.field403 != this.field181) {
                    this.field403 = this.field181;
                }
                if (this.field419 != this.field151) {
                    this.field151 = this.field419;
                }
            } else {
                this.method161(-577);
                this.field181 = 0;
                this.field419 = 0;
                if (super.field942 > 4 && super.field943 > 4 && super.field942 < 516 && super.field943 < 338) {
                    if (this.field430 != -1) {
                        this.method132(class22.method215(this.field430), super.field942, 4, 0, (byte) -79, super.field943, 4, 0);
                    } else {
                        this.method148((byte) 45);
                    }
                }
                if (this.field403 != this.field181) {
                    this.field403 = this.field181;
                }
                if (this.field419 != this.field151) {
                    this.field151 = this.field419;
                }
                this.field181 = 0;
                this.field419 = 0;
                if (super.field942 > 553 && super.field943 > 205 && super.field942 < 743 && super.field943 < 466) {
                    if (this.field579 != -1) {
                        this.method132(class22.method215(this.field579), super.field942, 553, 1, (byte) -79, super.field943, 205, 0);
                    } else if (this.field372[this.field429] != -1) {
                        this.method132(class22.method215(this.field372[this.field429]), super.field942, 553, 1, (byte) -79, super.field943, 205, 0);
                    }
                }
                if (this.field286 != this.field181) {
                    this.field410 = true;
                    this.field286 = this.field181;
                }
                if (this.field588 != this.field419) {
                    this.field410 = true;
                    this.field588 = this.field419;
                }
                this.field181 = 0;
                this.field419 = 0;
                if (super.field942 > 17 && super.field943 > 357 && super.field942 < 496 && super.field943 < 453) {
                    if (this.field426 != -1) {
                        this.method132(class22.method215(this.field426), super.field942, 17, 2, (byte) -79, super.field943, 357, 0);
                    } else if (this.field599 != -1) {
                        this.method132(class22.method215(this.field599), super.field942, 17, 3, (byte) -79, super.field943, 357, 0);
                    } else if (super.field943 < 434 && super.field942 < 426 && this.field474 == 0) {
                        this.method128(super.field943 - 357, super.field942 - 17, 0);
                    }
                }
                if ((this.field426 != -1 || this.field599 != -1) && this.field387 != this.field181) {
                    this.field280 = true;
                    this.field387 = this.field181;
                }
                if ((this.field426 != -1 || this.field599 != -1) && this.field419 != this.field328) {
                    this.field280 = true;
                    this.field328 = this.field419;
                }
                boolean var3 = false;
                while (!var3) {
                    var3 = true;
                    for (int var4 = 0; var4 < this.field114 - 1; ++var4) {
                        if (this.field278[var4] < 1000 && this.field278[var4 + 1] > 1000) {
                            String var5 = this.field219[var4];
                            this.field219[var4] = this.field219[var4 + 1];
                            this.field219[var4 + 1] = var5;
                            int var6 = this.field278[var4];
                            this.field278[var4] = this.field278[var4 + 1];
                            this.field278[var4 + 1] = var6;
                            int var7 = this.field276[var4];
                            this.field276[var4] = this.field276[var4 + 1];
                            this.field276[var4 + 1] = var7;
                            int var8 = this.field277[var4];
                            this.field277[var4] = this.field277[var4 + 1];
                            this.field277[var4 + 1] = var8;
                            int var9 = this.field279[var4];
                            this.field279[var4] = this.field279[var4 + 1];
                            this.field279[var4 + 1] = var9;
                            var3 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
    public final void method128(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field345 = this.field483.method312();
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field251[var5] != null) {
                int var6 = this.field249[var5];
                int var7 = 70 - var4 * 14 + this.field361 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field250[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field385 == 0 || this.field385 == 1 && this.method126(var8, (byte) 1))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field353.field999)) {
                        if (this.field580 >= 1) {
                            this.field219[this.field114] = "Report abuse @whi@" + var8;
                            this.field278[this.field114] = 505;
                            ++this.field114;
                        }
                        this.field219[this.field114] = "Add ignore @whi@" + var8;
                        this.field278[this.field114] = 362;
                        ++this.field114;
                        this.field219[this.field114] = "Add friend @whi@" + var8;
                        this.field278[this.field114] = 954;
                        ++this.field114;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field480 == 0 && (var6 == 7 || this.field180 == 0 || this.field180 == 1 && this.method126(var8, (byte) 1))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field580 >= 1) {
                            this.field219[this.field114] = "Report abuse @whi@" + var8;
                            this.field278[this.field114] = 505;
                            ++this.field114;
                        }
                        this.field219[this.field114] = "Add ignore @whi@" + var8;
                        this.field278[this.field114] = 362;
                        ++this.field114;
                        this.field219[this.field114] = "Add friend @whi@" + var8;
                        this.field278[this.field114] = 954;
                        ++this.field114;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field268 == 0 || this.field268 == 1 && this.method126(var8, (byte) 1))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field219[this.field114] = "Accept trade @whi@" + var8;
                        this.field278[this.field114] = 356;
                        ++this.field114;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field480 == 0 && this.field180 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field268 == 0 || this.field268 == 1 && this.method126(var8, (byte) 1))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field219[this.field114] = "Accept challenge @whi@" + var8;
                        this.field278[this.field114] = 654;
                        ++this.field114;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIZ)V")
    public final void method129(byte arg0, int arg1, boolean arg2) {
        if (arg0 != -12) {
            this.field454 = -1;
        }
        signlink.midivol = arg1;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method130(int arg0) {
        for (int var2 = -1; var2 < this.field391; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field389;
            } else {
                var3 = this.field392[var2];
            }
            class36 var4 = this.field390[var3];
            if (var4 != null) {
                this.method136(1, this.field347, var4);
            }
        }
        if (arg0 != -23021) {
            this.field531 = this.field483.method312();
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method131(int arg0) {
        if (this.field352 == null) {
            this.method49(this.field531);
            super.field935 = null;
            this.field188 = null;
            this.field189 = null;
            this.field190 = null;
            this.field191 = null;
            this.field192 = null;
            this.field193 = null;
            this.field194 = null;
            this.field195 = null;
            this.field196 = null;
            this.field352 = new class46(3, 96, 479, this.method99(false));
            this.field350 = new class46(3, 156, 172, this.method99(false));
            class45.method342((byte) 32);
            this.field318.method320((byte) -91, 0, 0);
            this.field349 = new class46(3, 261, 190, this.method99(false));
            while (arg0 >= 0) {
                this.field143 = this.field483.method312();
            }
            this.field351 = new class46(3, 334, 512, this.method99(false));
            class45.method342((byte) 32);
            this.field321 = new class46(3, 50, 496, this.method99(false));
            this.field322 = new class46(3, 37, 269, this.method99(false));
            this.field323 = new class46(3, 45, 249, this.method99(false));
            this.field235 = true;
            this.field351.method351(-181);
            class63.field1561 = this.field135;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIGMZHLWJ;IIIBIII)V")
    public final void method132(class22 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg0.field840 == 0 && arg0.field830 != null && !arg0.field802) {
            if (arg1 >= arg2 && arg5 >= arg6 && arg1 <= arg0.field816 + arg2 && arg5 <= arg0.field823 + arg6) {
                int var9 = arg0.field830.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg0.field832[var10] + arg2;
                    int var12 = arg0.field778[var10] + arg6 - arg7;
                    class22 var13 = class22.method215(arg0.field830[var10]);
                    int var14 = var13.field786 + var11;
                    int var15 = var13.field819 + var12;
                    if ((var13.field811 >= 0 || var13.field813 != 0) && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field816 + var14 && arg5 < var13.field823 + var15) {
                        if (var13.field811 >= 0) {
                            this.field181 = var13.field811;
                        } else {
                            this.field181 = var13.field825;
                        }
                    }
                    if (var13.field840 == 8 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field816 + var14 && arg5 < var13.field823 + var15) {
                        this.field419 = var13.field825;
                    }
                    if (var13.field840 == 0) {
                        this.method132(var13, arg1, var14, arg3, (byte) -79, arg5, var15, var13.field835);
                        if (var13.field772 > var13.field823) {
                            this.method102(this.field255, arg1, var15, var13.field816 + var14, var13.field772, arg3, var13.field823, var13, arg5);
                        }
                    } else {
                        if (var13.field770 == 1 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field816 + var14 && arg5 < var13.field823 + var15) {
                            boolean var16 = false;
                            if (var13.field833 != 0) {
                                var16 = this.method69(7, var13);
                            }
                            if (!var16) {
                                this.field219[this.field114] = var13.field777;
                                this.field278[this.field114] = 682;
                                this.field277[this.field114] = var13.field825;
                                ++this.field114;
                            }
                        }
                        if (var13.field770 == 2 && this.field380 == 0 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field816 + var14 && arg5 < var13.field823 + var15) {
                            String var17 = var13.field839;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field219[this.field114] = var17 + " @gre@" + var13.field794;
                            this.field278[this.field114] = 268;
                            this.field277[this.field114] = var13.field825;
                            ++this.field114;
                        }
                        if (var13.field770 == 3 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field816 + var14 && arg5 < var13.field823 + var15) {
                            this.field219[this.field114] = "Close";
                            if (arg3 == 3) {
                                this.field278[this.field114] = 723;
                            } else {
                                this.field278[this.field114] = 515;
                            }
                            this.field277[this.field114] = var13.field825;
                            ++this.field114;
                        }
                        if (var13.field770 == 4 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field816 + var14 && arg5 < var13.field823 + var15) {
                            this.field219[this.field114] = var13.field777;
                            this.field278[this.field114] = 50;
                            this.field277[this.field114] = var13.field825;
                            ++this.field114;
                        }
                        if (var13.field770 == 5 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field816 + var14 && arg5 < var13.field823 + var15) {
                            this.field219[this.field114] = var13.field777;
                            this.field278[this.field114] = 944;
                            this.field277[this.field114] = var13.field825;
                            ++this.field114;
                        }
                        if (var13.field770 == 6 && !this.field263 && arg1 >= var14 && arg5 >= var15 && arg1 < var13.field816 + var14 && arg5 < var13.field823 + var15) {
                            this.field219[this.field114] = var13.field777;
                            this.field278[this.field114] = 737;
                            this.field277[this.field114] = var13.field825;
                            ++this.field114;
                        }
                        if (var13.field840 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field823; ++var19) {
                                for (int var20 = 0; var20 < var13.field816; ++var20) {
                                    int var21 = (var13.field831 + 32) * var20 + var14;
                                    int var22 = (var13.field789 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field791[var18];
                                        var22 += var13.field782[var18];
                                    }
                                    if (arg1 >= var21 && arg5 >= var22 && arg1 < var21 + 32 && arg5 < var22 + 32) {
                                        this.field451 = var18;
                                        this.field452 = var13.field825;
                                        if (var13.field784[var18] > 0) {
                                            class51 var23 = class51.method433(var13.field784[var18] - 1);
                                            if (this.field405 == 1 && var13.field780) {
                                                if (this.field407 != var13.field825 || this.field406 != var18) {
                                                    this.field219[this.field114] = "Use " + this.field409 + " with @lre@" + var23.field1269;
                                                    this.field278[this.field114] = 443;
                                                    this.field279[this.field114] = var23.field1252;
                                                    this.field276[this.field114] = var18;
                                                    this.field277[this.field114] = var13.field825;
                                                    ++this.field114;
                                                }
                                            } else if (this.field380 == 1 && var13.field780) {
                                                if ((this.field382 & 16) == 16) {
                                                    this.field219[this.field114] = this.field383 + " @lre@" + var23.field1269;
                                                    this.field278[this.field114] = 40;
                                                    this.field279[this.field114] = var23.field1252;
                                                    this.field276[this.field114] = var18;
                                                    this.field277[this.field114] = var13.field825;
                                                    ++this.field114;
                                                }
                                            } else {
                                                if (var13.field780) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1247 != null && var23.field1247[var24] != null) {
                                                            this.field219[this.field114] = var23.field1247[var24] + " @lre@" + var23.field1269;
                                                            if (var24 == 3) {
                                                                this.field278[this.field114] = 804;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field278[this.field114] = 918;
                                                            }
                                                            this.field279[this.field114] = var23.field1252;
                                                            this.field276[this.field114] = var18;
                                                            this.field277[this.field114] = var13.field825;
                                                            ++this.field114;
                                                        } else if (var24 == 4) {
                                                            this.field219[this.field114] = "Drop @lre@" + var23.field1269;
                                                            this.field278[this.field114] = 918;
                                                            this.field279[this.field114] = var23.field1252;
                                                            this.field276[this.field114] = var18;
                                                            this.field277[this.field114] = var13.field825;
                                                            ++this.field114;
                                                        }
                                                    }
                                                }
                                                if (var13.field841) {
                                                    this.field219[this.field114] = "Use @lre@" + var23.field1269;
                                                    this.field278[this.field114] = 937;
                                                    this.field279[this.field114] = var23.field1252;
                                                    this.field276[this.field114] = var18;
                                                    this.field277[this.field114] = var13.field825;
                                                    ++this.field114;
                                                }
                                                if (var13.field780 && var23.field1247 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1247[var25] != null) {
                                                            this.field219[this.field114] = var23.field1247[var25] + " @lre@" + var23.field1269;
                                                            if (var25 == 0) {
                                                                this.field278[this.field114] = 653;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field278[this.field114] = 828;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field278[this.field114] = 233;
                                                            }
                                                            this.field279[this.field114] = var23.field1252;
                                                            this.field276[this.field114] = var18;
                                                            this.field277[this.field114] = var13.field825;
                                                            ++this.field114;
                                                        }
                                                    }
                                                }
                                                if (var13.field812 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field812[var26] != null) {
                                                            this.field219[this.field114] = var13.field812[var26] + " @lre@" + var23.field1269;
                                                            if (var26 == 0) {
                                                                this.field278[this.field114] = 372;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field278[this.field114] = 648;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field278[this.field114] = 627;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field278[this.field114] = 555;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field278[this.field114] = 395;
                                                            }
                                                            this.field279[this.field114] = var23.field1252;
                                                            this.field276[this.field114] = var18;
                                                            this.field277[this.field114] = var13.field825;
                                                            ++this.field114;
                                                        }
                                                    }
                                                }
                                                this.field219[this.field114] = "Examine @lre@" + var23.field1269;
                                                this.field278[this.field114] = 1624;
                                                this.field279[this.field114] = var23.field1252;
                                                this.field276[this.field114] = var18;
                                                this.field277[this.field114] = var13.field825;
                                                ++this.field114;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
                if (arg4 != -79) {
                    this.field371 = this.field483.method312();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
    public final void method133(boolean arg0, long arg1) {
        if (arg0) {
            this.field454 = this.field337.method388();
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field445; ++var4) {
                if (this.field324[var4] == arg1) {
                    --this.field445;
                    this.field410 = true;
                    for (int var5 = var4; var5 < this.field445; ++var5) {
                        this.field265[var5] = this.field265[var5 + 1];
                        this.field568[var5] = this.field568[var5 + 1];
                        this.field324[var5] = this.field324[var5 + 1];
                    }
                    this.field501.method377(this.field242, 174);
                    this.field501.method384(arg1, -12199);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method134() {
        this.method146(20, "Starting up", field118);
        if (signlink.sunjava) {
            super.field928 = 5;
        }
        if (field567) {
            this.field555 = true;
        } else {
            field567 = true;
            boolean var1 = false;
            String var2 = this.method59(0);
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
                this.field282 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field379[var3] = new class68(500000, var3 + 1, 637, signlink.cache_idx[var3], signlink.cache_dat);
                    }
                }
                try {
                    this.method157(field338);
                    this.field556 = this.method48(25, "title", 1, this.field315[1], "title screen", (byte) -26);
                    this.field203 = new class13(this.field556, -20267, "p11_full", false);
                    this.field204 = new class13(this.field556, -20267, "p12_full", false);
                    this.field205 = new class13(this.field556, -20267, "b12_full", false);
                    this.field206 = new class13(this.field556, -20267, "q8_full", true);
                    this.method89(field285);
                    this.method93((byte) 7);
                    class18 var4 = this.method48(30, "config", 2, this.field315[2], "config", (byte) -26);
                    class18 var5 = this.method48(35, "interface", 3, this.field315[3], "interface", (byte) -26);
                    class18 var6 = this.method48(40, "media", 4, this.field315[4], "2d graphics", (byte) -26);
                    class18 var7 = this.method48(45, "textures", 6, this.field315[6], "textures", (byte) -26);
                    class18 var8 = this.method48(50, "wordenc", 7, this.field315[7], "chat system", (byte) -26);
                    class18 var9 = this.method48(55, "sounds", 8, this.field315[8], "sound effects", (byte) -26);
                    this.field543 = new byte[4][104][104];
                    this.field590 = new int[4][105][105];
                    this.field589 = new class67(4, this.field590, 104, 2311, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field585[var10] = new class30(104, 104, true);
                    }
                    this.field470 = new class3(512, 512);
                    class18 var11 = this.method48(60, "versionlist", 5, this.field315[5], "update list", (byte) -26);
                    this.method146(60, "Connecting to update server", field118);
                    this.field566 = new class47();
                    this.field566.method357(var11, this);
                    class44.method334(this.field566.method354(16517));
                    class61.method463(this.field566.method360(0, 1), this.field566);
                    if (!field517) {
                        this.field183 = 0;
                        this.field184 = true;
                        this.field566.method370(2, this.field183);
                        while (this.field566.method367() > 0) {
                            this.method52(7);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field566.field1161 > 3) {
                                this.method166("ondemand");
                                return;
                            }
                        }
                    }
                    this.method146(65, "Requesting animations", field118);
                    int var12 = this.field566.method360(1, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field566.method370(1, var13);
                    }
                    while (this.field566.method367() > 0) {
                        int var14 = var12 - this.field566.method367();
                        if (var14 > 0) {
                            this.method146(65, "Loading animations - " + var14 * 100 / var12 + "%", field118);
                        }
                        this.method52(7);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field566.field1161 > 3) {
                            this.method166("ondemand");
                            return;
                        }
                    }
                    this.method146(70, "Requesting models", field118);
                    int var15 = this.field566.method360(0, 1);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field566.method364((byte) 4, var16);
                        if ((var17 & 1) != 0) {
                            this.field566.method370(0, var16);
                        }
                    }
                    int var18 = this.field566.method367();
                    while (this.field566.method367() > 0) {
                        int var19 = var18 - this.field566.method367();
                        if (var19 > 0) {
                            this.method146(70, "Loading models - " + var19 * 100 / var18 + "%", field118);
                        }
                        this.method52(7);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field379[0] != null) {
                        this.method146(75, "Requesting maps", field118);
                        this.field566.method370(3, this.field566.method365(47, 0, (byte) 14, 48));
                        this.field566.method370(3, this.field566.method365(47, 1, (byte) 14, 48));
                        this.field566.method370(3, this.field566.method365(48, 0, (byte) 14, 48));
                        this.field566.method370(3, this.field566.method365(48, 1, (byte) 14, 48));
                        this.field566.method370(3, this.field566.method365(49, 0, (byte) 14, 48));
                        this.field566.method370(3, this.field566.method365(49, 1, (byte) 14, 48));
                        this.field566.method370(3, this.field566.method365(47, 0, (byte) 14, 47));
                        this.field566.method370(3, this.field566.method365(47, 1, (byte) 14, 47));
                        this.field566.method370(3, this.field566.method365(48, 0, (byte) 14, 47));
                        this.field566.method370(3, this.field566.method365(48, 1, (byte) 14, 47));
                        this.field566.method370(3, this.field566.method365(48, 0, (byte) 14, 148));
                        this.field566.method370(3, this.field566.method365(48, 1, (byte) 14, 148));
                        int var20 = this.field566.method367();
                        while (this.field566.method367() > 0) {
                            int var21 = var20 - this.field566.method367();
                            if (var21 > 0) {
                                this.method146(75, "Loading maps - " + var21 * 100 / var20 + "%", field118);
                            }
                            this.method52(7);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field566.method360(0, 1);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field566.method364((byte) 4, var23);
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
                            this.field566.method361(var23, -155, var25, 0);
                        }
                    }
                    this.field566.method355(field516, 0);
                    if (!field517) {
                        int var26 = this.field566.method360(2, 1);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field566.method372((byte) 8, var27)) {
                                this.field566.method361(var27, -155, (byte) 1, 2);
                            }
                        }
                    }
                    this.method146(80, "Unpacking media", field118);
                    this.field317 = new class40(var6, "invback", 0);
                    this.field319 = new class40(var6, "chatback", 0);
                    this.field318 = new class40(var6, "mapback", 0);
                    this.field115 = new class40(var6, "backbase1", 0);
                    this.field116 = new class40(var6, "backbase2", 0);
                    this.field117 = new class40(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field187[var28] = new class40(var6, "sideicons", var28);
                    }
                    this.field161 = new class3(var6, "compass", 0);
                    this.field284 = new class3(var6, "mapedge", 0);
                    this.field284.method6((byte) -18);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field412[var29] = new class40(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field365[var30] = new class3(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field257[var31] = new class3(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field520[var32] = new class3(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field496[var33] = new class3(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field171[var34] = new class3(var6, "headicons_hint", var34);
                    }
                    this.field378 = new class3(var6, "overlay_multiway", 0);
                    this.field217 = new class3(var6, "mapmarker", 0);
                    this.field218 = new class3(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field170[var35] = new class3(var6, "cross", var35);
                    }
                    this.field124 = new class3(var6, "mapdots", 0);
                    this.field125 = new class3(var6, "mapdots", 1);
                    this.field126 = new class3(var6, "mapdots", 2);
                    this.field127 = new class3(var6, "mapdots", 3);
                    this.field128 = new class3(var6, "mapdots", 4);
                    this.field465 = new class40(var6, "scrollbar", 0);
                    this.field466 = new class40(var6, "scrollbar", 1);
                    this.field557 = new class40(var6, "redstone1", 0);
                    this.field558 = new class40(var6, "redstone2", 0);
                    this.field559 = new class40(var6, "redstone3", 0);
                    this.field560 = new class40(var6, "redstone1", 0);
                    this.field560.method317(field464);
                    this.field561 = new class40(var6, "redstone2", 0);
                    this.field561.method317(field464);
                    this.field537 = new class40(var6, "redstone1", 0);
                    this.field537.method318(22940);
                    this.field538 = new class40(var6, "redstone2", 0);
                    this.field538.method318(22940);
                    this.field539 = new class40(var6, "redstone3", 0);
                    this.field539.method318(22940);
                    this.field540 = new class40(var6, "redstone1", 0);
                    this.field540.method317(field464);
                    this.field540.method318(22940);
                    this.field541 = new class40(var6, "redstone2", 0);
                    this.field541.method317(field464);
                    this.field541.method318(22940);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field529[var36] = new class40(var6, "mod_icons", var36);
                    }
                    class3 var37 = new class3(var6, "backleft1", 0);
                    this.field304 = new class46(3, var37.field24, var37.field23, this.method99(false));
                    var37.method7((byte) 3, 0, 0);
                    class3 var38 = new class3(var6, "backleft2", 0);
                    this.field305 = new class46(3, var38.field24, var38.field23, this.method99(false));
                    var38.method7((byte) 3, 0, 0);
                    class3 var39 = new class3(var6, "backright1", 0);
                    this.field306 = new class46(3, var39.field24, var39.field23, this.method99(false));
                    var39.method7((byte) 3, 0, 0);
                    class3 var40 = new class3(var6, "backright2", 0);
                    this.field307 = new class46(3, var40.field24, var40.field23, this.method99(false));
                    var40.method7((byte) 3, 0, 0);
                    class3 var41 = new class3(var6, "backtop1", 0);
                    this.field308 = new class46(3, var41.field24, var41.field23, this.method99(false));
                    var41.method7((byte) 3, 0, 0);
                    class3 var42 = new class3(var6, "backvmid1", 0);
                    this.field309 = new class46(3, var42.field24, var42.field23, this.method99(false));
                    var42.method7((byte) 3, 0, 0);
                    class3 var43 = new class3(var6, "backvmid2", 0);
                    this.field310 = new class46(3, var43.field24, var43.field23, this.method99(false));
                    var43.method7((byte) 3, 0, 0);
                    class3 var44 = new class3(var6, "backvmid3", 0);
                    this.field311 = new class46(3, var44.field24, var44.field23, this.method99(false));
                    var44.method7((byte) 3, 0, 0);
                    class3 var45 = new class3(var6, "backhmid2", 0);
                    this.field312 = new class46(3, var45.field24, var45.field23, this.method99(false));
                    var45.method7((byte) 3, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field365[var50] != null) {
                            this.field365[var50].method5(var48 + var49, var47 + var49, var46 + var49, true);
                        }
                        if (this.field412[var50] != null) {
                            this.field412[var50].method319(var48 + var49, var47 + var49, var46 + var49, true);
                        }
                    }
                    this.method146(83, "Unpacking textures", field118);
                    class63.method519(var7, -103);
                    class63.method523((byte) 3, 0.8D);
                    class63.method518(20, 1);
                    this.method146(86, "Unpacking config", field118);
                    class33.method300(true, var4);
                    class59.method452(var4);
                    class72.method601(true, var4);
                    class51.method435(var4);
                    class14.method196(var4);
                    class35.method303(true, var4);
                    class55.method442(true, var4);
                    class60.method460(true, var4);
                    class26.method268(true, var4);
                    class51.field1259 = field516;
                    if (!field517) {
                        this.method146(90, "Unpacking sounds", field118);
                        byte[] var51 = var9.method212("sounds.dat", (byte[]) null);
                        class50 var52 = new class50(var51, -46859);
                        class43.method328(true, var52);
                    }
                    this.method146(95, "Unpacking interfaces", field118);
                    class13[] var53 = new class13[] { this.field203, this.field204, this.field205, this.field206 };
                    class22.method222(var53, var5, var6, 0);
                    this.method146(100, "Preparing game engine", field118);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field318.field1058[this.field318.field1060 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field216[var54] = var55;
                        this.field297[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field318.field1058[this.field318.field1060 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field270[var58 - 5] = var59 - 25;
                        this.field238[var58 - 5] = var60 - var59;
                    }
                    class63.method516(765, 503, 1);
                    this.field136 = class63.field1561;
                    class63.method516(479, 96, 1);
                    this.field133 = class63.field1561;
                    class63.method516(190, 261, 1);
                    this.field134 = class63.field1561;
                    class63.method516(512, 334, 1);
                    this.field135 = class63.field1561;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class63.field1559[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class67.method578(334, 554, var62, 500, 512, 800);
                    class25.method230(var8);
                    this.field247 = new class38(this, (byte) 6);
                    this.method54(this.field247, 10);
                    class48.field1177 = this;
                    class59.field1405 = this;
                    class14.field706 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field246 + " " + this.field231);
                    this.field340 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method135(int arg0) {
        ++field418;
        if (arg0 >= 0) {
            this.field143 = -127;
        }
        if (field418 > 82) {
            field418 = 0;
            this.field501.method377(this.field242, 201);
        }
        for (int var2 = 0; var2 < this.field273; ++var2) {
            int var3 = this.field274[var2];
            class24 var4 = this.field272[var3];
            if (var4 != null) {
                this.method136(var4.field876.field691, this.field347, var4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILZJNNOVLJ;)V")
    public final void method136(int arg0, int arg1, class71 arg2) {
        this.field453 += arg1;
        if (arg2.field1702 < 128 || arg2.field1703 < 128 || arg2.field1702 >= 13184 || arg2.field1703 >= 13184) {
            arg2.field1743 = -1;
            arg2.field1736 = -1;
            arg2.field1697 = 0;
            arg2.field1698 = 0;
            arg2.field1702 = arg2.field1722[0] * 128 + arg2.field1700 * 64;
            arg2.field1703 = arg2.field1723[0] * 128 + arg2.field1700 * 64;
            arg2.method598(-13889);
        }
        if (field353 == arg2 && (arg2.field1702 < 1536 || arg2.field1703 < 1536 || arg2.field1702 >= 11776 || arg2.field1703 >= 11776)) {
            arg2.field1743 = -1;
            arg2.field1736 = -1;
            arg2.field1697 = 0;
            arg2.field1698 = 0;
            arg2.field1702 = arg2.field1722[0] * 128 + arg2.field1700 * 64;
            arg2.field1703 = arg2.field1723[0] * 128 + arg2.field1700 * 64;
            arg2.method598(-13889);
        }
        if (arg2.field1697 > field399) {
            this.method137(arg2, -824);
        } else if (arg2.field1698 >= field399) {
            this.method138(arg2, 0);
        } else {
            this.method139(arg2, 0);
        }
        this.method140((byte) -97, arg2);
        this.method141(-453, arg2);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LZJNNOVLJ;I)V")
    public final void method137(class71 arg0, int arg1) {
        int var3 = arg0.field1697 - field399;
        int var4 = arg0.field1700 * 64 + arg0.field1693 * 128;
        int var5 = arg0.field1700 * 64 + arg0.field1695 * 128;
        while (arg1 >= 0) {
        }
        arg0.field1702 += (var4 - arg0.field1702) / var3;
        arg0.field1703 += (var5 - arg0.field1703) / var3;
        arg0.field1701 = 0;
        if (arg0.field1699 == 0) {
            arg0.field1742 = 1024;
        }
        if (arg0.field1699 == 1) {
            arg0.field1742 = 1536;
        }
        if (arg0.field1699 == 2) {
            arg0.field1742 = 0;
        }
        if (arg0.field1699 == 3) {
            arg0.field1742 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LZJNNOVLJ;I)V")
    public final void method138(class71 arg0, int arg1) {
        if (field399 == arg0.field1698 || arg0.field1743 == -1 || arg0.field1746 != 0 || arg0.field1745 + 1 > class33.field963[arg0.field1743].method301(arg0.field1744, this.field342)) {
            int var3 = arg0.field1698 - arg0.field1697;
            int var4 = field399 - arg0.field1697;
            int var5 = arg0.field1700 * 64 + arg0.field1693 * 128;
            int var6 = arg0.field1700 * 64 + arg0.field1695 * 128;
            int var7 = arg0.field1700 * 64 + arg0.field1694 * 128;
            int var8 = arg0.field1700 * 64 + arg0.field1696 * 128;
            arg0.field1702 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1703 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1701 = 0;
        if (arg0.field1699 == 0) {
            arg0.field1742 = 1024;
        }
        if (arg0.field1699 == 1) {
            arg0.field1742 = 1536;
        }
        if (arg0.field1699 == 2) {
            arg0.field1742 = 0;
        }
        if (arg0.field1699 == 3) {
            arg0.field1742 = 512;
        }
        arg0.field1704 = arg0.field1742;
        this.field453 += arg1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(LZJNNOVLJ;I)V")
    public final void method139(class71 arg0, int arg1) {
        arg0.field1731 = arg0.field1711;
        if (arg0.field1713 == 0) {
            arg0.field1701 = 0;
        } else {
            if (arg0.field1743 != -1 && arg0.field1746 == 0) {
                class33 var3 = class33.field963[arg0.field1743];
                if (arg0.field1715 > 0 && var3.field975 == 0) {
                    ++arg0.field1701;
                    return;
                }
                if (arg0.field1715 <= 0 && var3.field976 == 0) {
                    ++arg0.field1701;
                    return;
                }
            }
            int var4 = arg0.field1702;
            int var5 = arg0.field1703;
            this.field453 += arg1;
            int var6 = arg0.field1722[arg0.field1713 - 1] * 128 + arg0.field1700 * 64;
            int var7 = arg0.field1723[arg0.field1713 - 1] * 128 + arg0.field1700 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1742 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1742 = 1792;
                    } else {
                        arg0.field1742 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1742 = 768;
                    } else if (var5 > var7) {
                        arg0.field1742 = 256;
                    } else {
                        arg0.field1742 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1742 = 1024;
                } else {
                    arg0.field1742 = 0;
                }
                int var8 = arg0.field1742 - arg0.field1704 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1725;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1724;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1727;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1726;
                }
                if (var9 == -1) {
                    var9 = arg0.field1724;
                }
                arg0.field1731 = var9;
                int var10 = 4;
                if (arg0.field1742 != arg0.field1704 && arg0.field1734 == -1 && arg0.field1710 != 0) {
                    var10 = 2;
                }
                if (arg0.field1713 > 2) {
                    var10 = 6;
                }
                if (arg0.field1713 > 3) {
                    var10 = 8;
                }
                if (arg0.field1701 > 0 && arg0.field1713 > 1) {
                    var10 = 8;
                    --arg0.field1701;
                }
                if (arg0.field1735[arg0.field1713 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1731 == arg0.field1724 && arg0.field1706 != -1) {
                    arg0.field1731 = arg0.field1706;
                }
                if (var4 < var6) {
                    arg0.field1702 += var10;
                    if (arg0.field1702 > var6) {
                        arg0.field1702 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1702 -= var10;
                    if (arg0.field1702 < var6) {
                        arg0.field1702 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1703 += var10;
                    if (arg0.field1703 > var7) {
                        arg0.field1703 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1703 -= var10;
                    if (arg0.field1703 < var7) {
                        arg0.field1703 = var7;
                    }
                }
                if (arg0.field1702 == var6 && arg0.field1703 == var7) {
                    --arg0.field1713;
                    if (arg0.field1715 > 0) {
                        --arg0.field1715;
                        return;
                    }
                }
            } else {
                arg0.field1702 = var6;
                arg0.field1703 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLZJNNOVLJ;)V")
    public final void method140(byte arg0, class71 arg1) {
        if (arg0 == -97) {
            if (arg1.field1710 != 0) {
                if (arg1.field1734 != -1 && arg1.field1734 < 32768) {
                    class24 var3 = this.field272[arg1.field1734];
                    if (var3 != null) {
                        int var4 = arg1.field1702 - var3.field1702;
                        int var5 = arg1.field1703 - var3.field1703;
                        if (var4 != 0 || var5 != 0) {
                            arg1.field1742 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                if (arg1.field1734 >= 32768) {
                    int var6 = arg1.field1734 - 32768;
                    if (this.field396 == var6) {
                        var6 = this.field389;
                    }
                    class36 var7 = this.field390[var6];
                    if (var7 != null) {
                        int var8 = arg1.field1702 - var7.field1702;
                        int var9 = arg1.field1703 - var7.field1703;
                        if (var8 != 0 || var9 != 0) {
                            arg1.field1742 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg1.field1728 != 0 || arg1.field1729 != 0) && (arg1.field1713 == 0 || arg1.field1701 > 0)) {
                    int var10 = arg1.field1702 - (arg1.field1728 - this.field562 - this.field562) * 64;
                    int var11 = arg1.field1703 - (arg1.field1729 - this.field563 - this.field563) * 64;
                    if (var10 != 0 || var11 != 0) {
                        arg1.field1742 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                    }
                    arg1.field1728 = 0;
                    arg1.field1729 = 0;
                }
                int var12 = arg1.field1742 - arg1.field1704 & 2047;
                if (var12 != 0) {
                    if (var12 >= arg1.field1710 && var12 <= 2048 - arg1.field1710) {
                        if (var12 > 1024) {
                            arg1.field1704 -= arg1.field1710;
                        } else {
                            arg1.field1704 += arg1.field1710;
                        }
                    } else {
                        arg1.field1704 = arg1.field1742;
                    }
                    arg1.field1704 &= 2047;
                    if (arg1.field1731 == arg1.field1711 && arg1.field1742 != arg1.field1704) {
                        if (arg1.field1712 != -1) {
                            arg1.field1731 = arg1.field1712;
                            return;
                        }
                        arg1.field1731 = arg1.field1724;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILZJNNOVLJ;)V")
    public final void method141(int arg0, class71 arg1) {
        while (arg0 >= 0) {
            this.field454 = -1;
        }
        arg1.field1719 = false;
        if (arg1.field1731 != -1) {
            class33 var3 = class33.field963[arg1.field1731];
            ++arg1.field1733;
            if (arg1.field1732 < var3.field964 && arg1.field1733 > var3.method301(arg1.field1732, this.field342)) {
                arg1.field1733 = 0;
                ++arg1.field1732;
            }
            if (arg1.field1732 >= var3.field964) {
                arg1.field1733 = 0;
                arg1.field1732 = 0;
            }
        }
        if (arg1.field1736 != -1 && field399 >= arg1.field1739) {
            if (arg1.field1737 < 0) {
                arg1.field1737 = 0;
            }
            class33 var4 = class55.field1321[arg1.field1736].field1325;
            ++arg1.field1738;
            while (arg1.field1737 < var4.field964 && arg1.field1738 > var4.method301(arg1.field1737, this.field342)) {
                arg1.field1738 -= var4.method301(arg1.field1737, this.field342);
                ++arg1.field1737;
            }
            if (arg1.field1737 >= var4.field964 && (arg1.field1737 < 0 || arg1.field1737 >= var4.field964)) {
                arg1.field1736 = -1;
            }
        }
        if (arg1.field1743 != -1 && arg1.field1746 <= 1) {
            class33 var5 = class33.field963[arg1.field1743];
            if (var5.field975 == 1 && arg1.field1715 > 0 && arg1.field1697 <= field399 && arg1.field1698 < field399) {
                arg1.field1746 = 1;
                return;
            }
        }
        if (arg1.field1743 != -1 && arg1.field1746 == 0) {
            class33 var6 = class33.field963[arg1.field1743];
            ++arg1.field1745;
            while (arg1.field1744 < var6.field964 && arg1.field1745 > var6.method301(arg1.field1744, this.field342)) {
                arg1.field1745 -= var6.method301(arg1.field1744, this.field342);
                ++arg1.field1744;
            }
            if (arg1.field1744 >= var6.field964) {
                arg1.field1744 -= var6.field968;
                ++arg1.field1747;
                if (arg1.field1747 >= var6.field974) {
                    arg1.field1743 = -1;
                }
                if (arg1.field1744 < 0 || arg1.field1744 >= var6.field964) {
                    arg1.field1743 = -1;
                }
            }
            arg1.field1719 = var6.field970;
        }
        if (arg1.field1746 > 0) {
            --arg1.field1746;
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method142(int arg0) {
        if (this.field371 == arg0) {
            if (this.field293 == -1 || this.field443 != 2 && super.field935 == null) {
                if (this.field235) {
                    this.method131(-873);
                    this.field235 = false;
                    this.field304.method352(0, 4, super.field934, (byte) 108);
                    this.field305.method352(0, 357, super.field934, (byte) 108);
                    this.field306.method352(722, 4, super.field934, (byte) 108);
                    this.field307.method352(743, 205, super.field934, (byte) 108);
                    this.field308.method352(0, 0, super.field934, (byte) 108);
                    this.field309.method352(516, 4, super.field934, (byte) 108);
                    this.field310.method352(516, 205, super.field934, (byte) 108);
                    this.field311.method352(496, 357, super.field934, (byte) 108);
                    this.field312.method352(0, 338, super.field934, (byte) 108);
                    this.field410 = true;
                    this.field280 = true;
                    this.field467 = true;
                    this.field578 = true;
                    if (this.field443 != 2) {
                        this.field351.method352(4, 4, super.field934, (byte) 108);
                        this.field350.method352(550, 4, super.field934, (byte) 108);
                    }
                }
                if (this.field443 == 2) {
                    this.method87(false);
                }
                if (this.field502 && this.field225 == 1) {
                    this.field410 = true;
                }
                if (this.field579 != -1) {
                    boolean var4 = this.method165(this.field330, (byte) 5, this.field579);
                    if (var4) {
                        this.field410 = true;
                    }
                }
                if (this.field210 == 2) {
                    this.field410 = true;
                }
                if (this.field300 == 2) {
                    this.field410 = true;
                }
                if (this.field410) {
                    this.method27(false);
                    this.field410 = false;
                }
                if (this.field426 == -1 && this.field474 == 0) {
                    this.field354.field835 = this.field153 - this.field361 - 77;
                    if (super.field942 > 448 && super.field942 < 560 && super.field943 > 332) {
                        this.method102(this.field255, super.field942 - 17, 0, 463, this.field153, -1, 77, this.field354, super.field943 - 357);
                    }
                    int var5 = this.field153 - 77 - this.field354.field835;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var5 > this.field153 - 77) {
                        var5 = this.field153 - 77;
                    }
                    if (this.field361 != var5) {
                        this.field361 = var5;
                        this.field280 = true;
                    }
                }
                if (this.field426 == -1 && this.field474 == 3) {
                    int var6 = this.field505 * 14 + 7;
                    this.field354.field835 = this.field508;
                    if (super.field942 > 448 && super.field942 < 560 && super.field943 > 332) {
                        this.method102(this.field255, super.field942 - 17, 0, 463, var6, -1, 77, this.field354, super.field943 - 357);
                    }
                    int var7 = this.field354.field835;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    if (var7 > var6 - 77) {
                        var7 = var6 - 77;
                    }
                    if (this.field508 != var7) {
                        this.field508 = var7;
                        this.field280 = true;
                    }
                }
                if (this.field426 != -1) {
                    boolean var8 = this.method165(this.field330, (byte) 5, this.field426);
                    if (var8) {
                        this.field280 = true;
                    }
                }
                if (this.field210 == 3) {
                    this.field280 = true;
                }
                if (this.field300 == 3) {
                    this.field280 = true;
                }
                if (this.field177 != null) {
                    this.field280 = true;
                }
                if (this.field502 && this.field225 == 2) {
                    this.field280 = true;
                }
                if (this.field280) {
                    this.method105(639);
                    this.field280 = false;
                }
                if (this.field443 == 2) {
                    this.method64((byte) -78);
                    this.field350.method352(550, 4, super.field934, (byte) 108);
                }
                if (this.field602 != -1) {
                    this.field467 = true;
                }
                if (this.field467) {
                    if (this.field602 != -1 && this.field602 == this.field429) {
                        this.field602 = -1;
                        this.field501.method377(this.field242, 20);
                        this.field501.method378(this.field429);
                    }
                    this.field467 = false;
                    this.field323.method351(-181);
                    this.field117.method320((byte) -91, 0, 0);
                    if (this.field579 == -1) {
                        if (this.field372[this.field429] != -1) {
                            if (this.field429 == 0) {
                                this.field557.method320((byte) -91, 22, 10);
                            }
                            if (this.field429 == 1) {
                                this.field558.method320((byte) -91, 54, 8);
                            }
                            if (this.field429 == 2) {
                                this.field558.method320((byte) -91, 82, 8);
                            }
                            if (this.field429 == 3) {
                                this.field559.method320((byte) -91, 110, 8);
                            }
                            if (this.field429 == 4) {
                                this.field561.method320((byte) -91, 153, 8);
                            }
                            if (this.field429 == 5) {
                                this.field561.method320((byte) -91, 181, 8);
                            }
                            if (this.field429 == 6) {
                                this.field560.method320((byte) -91, 209, 9);
                            }
                        }
                        if (this.field372[0] != -1 && (this.field602 != 0 || field399 % 20 < 10)) {
                            this.field187[0].method320((byte) -91, 29, 13);
                        }
                        if (this.field372[1] != -1 && (this.field602 != 1 || field399 % 20 < 10)) {
                            this.field187[1].method320((byte) -91, 53, 11);
                        }
                        if (this.field372[2] != -1 && (this.field602 != 2 || field399 % 20 < 10)) {
                            this.field187[2].method320((byte) -91, 82, 11);
                        }
                        if (this.field372[3] != -1 && (this.field602 != 3 || field399 % 20 < 10)) {
                            this.field187[3].method320((byte) -91, 115, 12);
                        }
                        if (this.field372[4] != -1 && (this.field602 != 4 || field399 % 20 < 10)) {
                            this.field187[4].method320((byte) -91, 153, 13);
                        }
                        if (this.field372[5] != -1 && (this.field602 != 5 || field399 % 20 < 10)) {
                            this.field187[5].method320((byte) -91, 180, 11);
                        }
                        if (this.field372[6] != -1 && (this.field602 != 6 || field399 % 20 < 10)) {
                            this.field187[6].method320((byte) -91, 208, 13);
                        }
                    }
                    this.field323.method352(516, 160, super.field934, (byte) 108);
                    this.field322.method351(-181);
                    this.field116.method320((byte) -91, 0, 0);
                    if (this.field579 == -1) {
                        if (this.field372[this.field429] != -1) {
                            if (this.field429 == 7) {
                                this.field537.method320((byte) -91, 42, 0);
                            }
                            if (this.field429 == 8) {
                                this.field538.method320((byte) -91, 74, 0);
                            }
                            if (this.field429 == 9) {
                                this.field538.method320((byte) -91, 102, 0);
                            }
                            if (this.field429 == 10) {
                                this.field539.method320((byte) -91, 130, 1);
                            }
                            if (this.field429 == 11) {
                                this.field541.method320((byte) -91, 173, 0);
                            }
                            if (this.field429 == 12) {
                                this.field541.method320((byte) -91, 201, 0);
                            }
                            if (this.field429 == 13) {
                                this.field540.method320((byte) -91, 229, 0);
                            }
                        }
                        if (this.field372[8] != -1 && (this.field602 != 8 || field399 % 20 < 10)) {
                            this.field187[7].method320((byte) -91, 74, 2);
                        }
                        if (this.field372[9] != -1 && (this.field602 != 9 || field399 % 20 < 10)) {
                            this.field187[8].method320((byte) -91, 102, 3);
                        }
                        if (this.field372[10] != -1 && (this.field602 != 10 || field399 % 20 < 10)) {
                            this.field187[9].method320((byte) -91, 137, 4);
                        }
                        if (this.field372[11] != -1 && (this.field602 != 11 || field399 % 20 < 10)) {
                            this.field187[10].method320((byte) -91, 174, 2);
                        }
                        if (this.field372[12] != -1 && (this.field602 != 12 || field399 % 20 < 10)) {
                            this.field187[11].method320((byte) -91, 201, 2);
                        }
                        if (this.field372[13] != -1 && (this.field602 != 13 || field399 % 20 < 10)) {
                            this.field187[12].method320((byte) -91, 226, 2);
                        }
                    }
                    this.field322.method352(496, 466, super.field934, (byte) 108);
                    this.field351.method351(-181);
                    class63.field1561 = this.field135;
                }
                if (this.field578) {
                    this.field578 = false;
                    this.field321.method351(-181);
                    this.field115.method320((byte) -91, 0, 0);
                    this.field204.method180(true, 16777215, "Public chat", 28, 3, 55);
                    if (this.field385 == 0) {
                        this.field204.method180(true, 65280, "On", 41, 3, 55);
                    }
                    if (this.field385 == 1) {
                        this.field204.method180(true, 16776960, "Friends", 41, 3, 55);
                    }
                    if (this.field385 == 2) {
                        this.field204.method180(true, 16711680, "Off", 41, 3, 55);
                    }
                    if (this.field385 == 3) {
                        this.field204.method180(true, 65535, "Hide", 41, 3, 55);
                    }
                    this.field204.method180(true, 16777215, "Private chat", 28, 3, 184);
                    if (this.field180 == 0) {
                        this.field204.method180(true, 65280, "On", 41, 3, 184);
                    }
                    if (this.field180 == 1) {
                        this.field204.method180(true, 16776960, "Friends", 41, 3, 184);
                    }
                    if (this.field180 == 2) {
                        this.field204.method180(true, 16711680, "Off", 41, 3, 184);
                    }
                    this.field204.method180(true, 16777215, "Trade/compete", 28, 3, 324);
                    if (this.field268 == 0) {
                        this.field204.method180(true, 65280, "On", 41, 3, 324);
                    }
                    if (this.field268 == 1) {
                        this.field204.method180(true, 16776960, "Friends", 41, 3, 324);
                    }
                    if (this.field268 == 2) {
                        this.field204.method180(true, 16711680, "Off", 41, 3, 324);
                    }
                    this.field204.method180(true, 16777215, "Report abuse", 33, 3, 458);
                    this.field321.method352(0, 453, super.field934, (byte) 108);
                    this.field351.method351(-181);
                    class63.field1561 = this.field135;
                }
                this.field330 = 0;
            } else {
                if (this.field443 == 2) {
                    this.method165(this.field330, (byte) 5, this.field293);
                    if (this.field211 != -1) {
                        this.method165(this.field330, (byte) 5, this.field211);
                    }
                    this.field330 = 0;
                    this.method25(10571);
                    super.field935.method351(-181);
                    class63.field1561 = this.field136;
                    class45.method342((byte) 32);
                    this.field235 = true;
                    class22 var2 = class22.method215(this.field293);
                    if (var2.field816 == 512 && var2.field823 == 334 && var2.field840 == 0) {
                        var2.field816 = 765;
                        var2.field823 = 503;
                    }
                    this.method143(0, var2, 0, 0, true);
                    if (this.field211 != -1) {
                        class22 var3 = class22.method215(this.field211);
                        if (var3.field816 == 512 && var3.field823 == 334 && var3.field840 == 0) {
                            var3.field816 = 765;
                            var3.field823 = 503;
                        }
                        this.method143(0, var3, 0, 0, true);
                    }
                    if (!this.field502) {
                        this.method127(831);
                        this.method113(true);
                    } else {
                        this.method86(-18010);
                    }
                }
                super.field935.method352(0, 0, super.field934, (byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILIGMZHLWJ;IIZ)V")
    public final void method143(int arg0, class22 arg1, int arg2, int arg3, boolean arg4) {
        this.field269 &= arg4;
        if (arg1.field840 == 0 && arg1.field830 != null) {
            if (!arg1.field802 || this.field403 == arg1.field825 || this.field286 == arg1.field825 || this.field387 == arg1.field825) {
                int var6 = class45.field1114;
                int var7 = class45.field1112;
                int var8 = class45.field1115;
                int var9 = class45.field1113;
                class45.method341(arg2, arg1.field816 + arg0, arg0, arg1.field823 + arg2, -44482);
                int var10 = arg1.field830.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field832[var11] + arg0;
                    int var13 = arg1.field778[var11] + arg2 - arg3;
                    class22 var14 = class22.method215(arg1.field830[var11]);
                    int var15 = var14.field786 + var12;
                    int var16 = var14.field819 + var13;
                    if (var14.field833 > 0) {
                        this.method74(var14, (byte) 106);
                    }
                    if (var14.field840 == 0) {
                        if (var14.field835 > var14.field772 - var14.field823) {
                            var14.field835 = var14.field772 - var14.field823;
                        }
                        if (var14.field835 < 0) {
                            var14.field835 = 0;
                        }
                        this.method143(var15, var14, var16, var14.field835, true);
                        if (var14.field772 > var14.field823) {
                            this.method42(var14.field835, var16, var14.field772, var14.field816 + var15, 3, var14.field823);
                        }
                    } else if (var14.field840 != 1) {
                        if (var14.field840 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field823; ++var18) {
                                for (int var19 = 0; var19 < var14.field816; ++var19) {
                                    int var20 = (var14.field831 + 32) * var19 + var15;
                                    int var21 = (var14.field789 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field791[var17];
                                        var21 += var14.field782[var17];
                                    }
                                    if (var14.field784[var17] <= 0) {
                                        if (var14.field843 != null && var17 < 20) {
                                            class3 var30 = var14.field843[var17];
                                            if (var30 != null) {
                                                var30.method9((byte) -91, var20, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field784[var17] - 1;
                                        if (var20 > class45.field1114 - 32 && var20 < class45.field1115 && var21 > class45.field1112 - 32 && var21 < class45.field1113 || this.field300 != 0 && this.field299 == var17) {
                                            int var25 = 0;
                                            if (this.field405 == 1 && this.field406 == var17 && this.field407 == var14.field825) {
                                                var25 = 16777215;
                                            }
                                            class3 var26 = class51.method436(7, var25, var14.field797[var17], var24);
                                            if (var26 != null) {
                                                if (this.field300 != 0 && this.field299 == var17 && this.field298 == var14.field825) {
                                                    var22 = super.field942 - this.field301;
                                                    var23 = super.field943 - this.field302;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field488 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method11(128, this.field554, var21 + var23, var20 + var22);
                                                    if (var21 + var23 < class45.field1112 && arg1.field835 > 0) {
                                                        int var27 = (class45.field1112 - var21 - var23) * this.field330 / 3;
                                                        if (var27 > this.field330 * 10) {
                                                            var27 = this.field330 * 10;
                                                        }
                                                        if (var27 > arg1.field835) {
                                                            var27 = arg1.field835;
                                                        }
                                                        arg1.field835 -= var27;
                                                        this.field302 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class45.field1113 && arg1.field835 < arg1.field772 - arg1.field823) {
                                                        int var28 = (var21 + var23 + 32 - class45.field1113) * this.field330 / 3;
                                                        if (var28 > this.field330 * 10) {
                                                            var28 = this.field330 * 10;
                                                        }
                                                        if (var28 > arg1.field772 - arg1.field823 - arg1.field835) {
                                                            var28 = arg1.field772 - arg1.field823 - arg1.field835;
                                                        }
                                                        arg1.field835 += var28;
                                                        this.field302 -= var28;
                                                    }
                                                } else if (this.field210 != 0 && this.field209 == var17 && this.field208 == var14.field825) {
                                                    var26.method11(128, this.field554, var21, var20);
                                                } else {
                                                    var26.method9((byte) -91, var20, var21);
                                                }
                                                if (var26.field27 == 33 || var14.field797[var17] != 1) {
                                                    int var29 = var14.field797[var17];
                                                    this.field203.method183(var20 + 1 + var22, (byte) 0, 0, var21 + 10 + var23, method112(true, var29));
                                                    this.field203.method183(var20 + var22, (byte) 0, 16776960, var21 + 9 + var23, method112(true, var29));
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field840 == 3) {
                            boolean var31 = false;
                            if (this.field387 == var14.field825 || this.field286 == var14.field825 || this.field403 == var14.field825) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method156(0, var14)) {
                                var32 = var14.field822;
                                if (var31 && var14.field788 != 0) {
                                    var32 = var14.field788;
                                }
                            } else {
                                var32 = var14.field787;
                                if (var31 && var14.field813 != 0) {
                                    var32 = var14.field813;
                                }
                            }
                            if (var14.field814 == 0) {
                                if (var14.field790) {
                                    class45.method344(var15, var14.field816, var14.field823, var16, true, var32);
                                } else {
                                    class45.method345(var32, var14.field816, -24987, var15, var14.field823, var16);
                                }
                            } else if (var14.field790) {
                                class45.method343(var15, false, var14.field816, var32, var16, var14.field823, 256 - (var14.field814 & 255));
                            } else {
                                class45.method346(var14.field816, var32, var16, var14.field823, var15, 496, 256 - (var14.field814 & 255));
                            }
                        } else if (var14.field840 == 4) {
                            class13 var33 = var14.field809;
                            String var34 = var14.field785;
                            boolean var35 = false;
                            if (this.field387 == var14.field825 || this.field286 == var14.field825 || this.field403 == var14.field825) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method156(0, var14)) {
                                var36 = var14.field822;
                                if (var35 && var14.field788 != 0) {
                                    var36 = var14.field788;
                                }
                                if (var14.field771.length() > 0) {
                                    var34 = var14.field771;
                                }
                            } else {
                                var36 = var14.field787;
                                if (var35 && var14.field813 != 0) {
                                    var36 = var14.field813;
                                }
                            }
                            if (var14.field770 == 6 && this.field263) {
                                var34 = "Please wait...";
                                var36 = var14.field787;
                            }
                            if (class45.field1110 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field673 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method123(8, this.method154(4, 7, var14)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method123(8, this.method154(3, 7, var14)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method123(8, this.method154(2, 7, var14)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method123(8, this.method154(1, 7, var14)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method123(8, this.method154(0, 7, var14)) + var34.substring(var38 + 2);
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
                                if (var14.field779) {
                                    var33.method180(var14.field781, var36, var44, var37, 3, var14.field816 / 2 + var15);
                                } else {
                                    var33.method187(var15, var44, -129, var36, var14.field781, var37);
                                }
                                var37 += var33.field673;
                            }
                        } else if (var14.field840 == 5) {
                            class3 var45;
                            if (this.method156(0, var14)) {
                                var45 = var14.field828;
                            } else {
                                var45 = var14.field783;
                            }
                            if (var45 != null) {
                                var45.method9((byte) -91, var15, var16);
                            }
                        } else if (var14.field840 == 6) {
                            int var46 = class63.field1555;
                            int var47 = class63.field1556;
                            class63.field1555 = var14.field816 / 2 + var15;
                            class63.field1556 = var14.field823 / 2 + var16;
                            int var48 = class63.field1559[var14.field800] * var14.field799 >> 16;
                            int var49 = class63.field1560[var14.field800] * var14.field799 >> 16;
                            boolean var50 = this.method156(0, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field808;
                            } else {
                                var51 = var14.field807;
                            }
                            class61 var52;
                            if (var51 == -1) {
                                var52 = var14.method220(false, -1, -1, var50);
                            } else {
                                class33 var53 = class33.field963[var51];
                                var52 = var14.method220(false, var53.field965[var14.field821], var53.field966[var14.field821], var50);
                            }
                            if (var52 != null) {
                                var52.method487(0, var14.field801, 0, var14.field800, 0, var48, var49);
                            }
                            class63.field1555 = var46;
                            class63.field1556 = var47;
                        } else {
                            if (var14.field840 == 7) {
                                class13 var54 = var14.field809;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field823; ++var56) {
                                    for (int var57 = 0; var57 < var14.field816; ++var57) {
                                        if (var14.field784[var55] > 0) {
                                            class51 var58 = class51.method433(var14.field784[var55] - 1);
                                            String var59 = String.valueOf(var58.field1269);
                                            if (var58.field1288 || var14.field797[var55] != 1) {
                                                var59 = var59 + " x" + method60(-926, var14.field797[var55]);
                                            }
                                            int var60 = (var14.field831 + 115) * var57 + var15;
                                            int var61 = (var14.field789 + 12) * var56 + var16;
                                            if (var14.field779) {
                                                var54.method180(var14.field781, var14.field787, var59, var61, 3, var14.field816 / 2 + var60);
                                            } else {
                                                var54.method187(var60, var59, -129, var14.field787, var14.field781, var61);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field840 == 8 && (this.field328 == var14.field825 || this.field588 == var14.field825 || this.field151 == var14.field825) && this.field139 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class13 var64 = this.field204;
                                String var65 = var14.field785;
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
                                    int var74 = var64.method181(0, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field673 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field816 + var15 - 5 - var62;
                                int var67 = var14.field823 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg1.field816 + arg0) {
                                    var66 = arg1.field816 + arg0 - var62;
                                }
                                if (var63 + var67 > arg1.field823 + arg2) {
                                    var67 = arg1.field823 + arg2 - var63;
                                }
                                class45.method344(var66, var62, var63, var67, true, 16777120);
                                class45.method345(0, var62, -24987, var66, var63, var67);
                                String var68 = var14.field785;
                                int var69 = var64.field673 + var67 + 2;
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
                                    var64.method187(var66 + 3, var71, -129, 0, false, var69);
                                    var69 += var64.field673 + 1;
                                }
                            }
                        }
                    }
                }
                class45.method341(var7, var8, var6, var9, -44482);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(II)V")
    public final void method144(int arg0, int arg1) {
        signlink.wavevol = arg1;
        while (arg0 >= 0) {
            this.field574 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method145(byte arg0) {
        this.field501.method377(this.field242, 169);
        if (this.field339 == arg0) {
            if (this.field579 != -1) {
                this.method21(6, this.field579);
                this.field579 = -1;
                this.field410 = true;
                this.field263 = false;
                this.field467 = true;
            }
            if (this.field426 != -1) {
                this.method21(6, this.field426);
                this.field426 = -1;
                this.field280 = true;
                this.field263 = false;
            }
            if (this.field293 != -1) {
                this.method21(6, this.field293);
                this.field293 = -1;
                this.field235 = true;
            }
            if (this.field211 != -1) {
                this.method21(6, this.field211);
                this.field211 = -1;
            }
            if (this.field430 != -1) {
                this.method21(6, this.field430);
                this.field430 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public final void method146(int arg0, String arg1, boolean arg2) {
        if (arg2) {
            this.method134();
        }
        this.field231 = arg0;
        this.field246 = arg1;
        this.method115(5);
        if (this.field556 == null) {
            super.method146(arg0, arg1, field118);
        } else {
            this.field190.method351(-181);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field205.method179(-35070, 16777215, var4 / 2, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            class45.method345(9179409, 304, -24987, var4 / 2 - 152, 34, var7);
            class45.method345(0, 302, -24987, var4 / 2 - 151, 32, var7 + 1);
            class45.method344(var4 / 2 - 150, arg0 * 3, 30, var7 + 2, true, 9179409);
            class45.method344(arg0 * 3 + (var4 / 2 - 150), 300 - arg0 * 3, 30, var7 + 2, true, 0);
            this.field205.method179(-35070, 16777215, var4 / 2, var5 / 2 + 5 - var6, arg1);
            this.field190.method352(202, 171, super.field934, (byte) 108);
            if (this.field235) {
                this.field235 = false;
                if (!this.field163) {
                    this.field191.method352(0, 0, super.field934, (byte) 108);
                    this.field192.method352(637, 0, super.field934, (byte) 108);
                }
                this.field188.method352(128, 0, super.field934, (byte) 108);
                this.field189.method352(202, 371, super.field934, (byte) 108);
                this.field193.method352(0, 265, super.field934, (byte) 108);
                this.field194.method352(562, 265, super.field934, (byte) 108);
                this.field195.method352(128, 171, super.field934, (byte) 108);
                this.field196.method352(562, 171, super.field934, (byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method147(int arg0) {
        if (arg0 >= 0) {
            this.field501.method378(24);
        }
        if (this.field582 == 0) {
            int var2 = super.field932 / 2 - 80;
            int var3 = super.field933 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field948 == 1 && super.field949 >= var2 - 75 && super.field949 <= var2 + 75 && super.field950 >= var14 - 20 && super.field950 <= var14 + 20) {
                this.field582 = 3;
                this.field421 = 0;
            }
            int var4 = super.field932 / 2 + 80;
            if (super.field948 == 1 && super.field949 >= var4 - 75 && super.field949 <= var4 + 75 && super.field950 >= var14 - 20 && super.field950 <= var14 + 20) {
                this.field472 = "";
                this.field473 = "Enter your username & password.";
                this.field582 = 2;
                this.field421 = 0;
            }
        } else if (this.field582 == 2) {
            int var5 = super.field933 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field948 == 1 && super.field950 >= var16 - 15 && super.field950 < var16) {
                this.field421 = 0;
            }
            var5 = var16 + 15;
            if (super.field948 == 1 && super.field950 >= var5 - 15 && super.field950 < var5) {
                this.field421 = 1;
            }
            var5 += 15;
            int var6 = super.field932 / 2 - 80;
            int var7 = super.field933 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field948 == 1 && super.field949 >= var6 - 75 && super.field949 <= var6 + 75 && super.field950 >= var17 - 20 && super.field950 <= var17 + 20) {
                this.field224 = 0;
                this.method167(this.field546, this.field547, false);
                if (this.field269) {
                    return;
                }
            }
            int var8 = super.field932 / 2 + 80;
            if (super.field948 == 1 && super.field949 >= var8 - 75 && super.field949 <= var8 + 75 && super.field950 >= var17 - 20 && super.field950 <= var17 + 20) {
                this.field582 = 0;
                this.field546 = "";
                this.field547 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method299(-33830);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field241.length(); ++var11) {
                        if (var9 == field241.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field421 == 0) {
                        if (var9 == 8 && this.field546.length() > 0) {
                            this.field546 = this.field546.substring(0, this.field546.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field421 = 1;
                        }
                        if (var10) {
                            this.field546 = this.field546 + (char) var9;
                        }
                        if (this.field546.length() > 12) {
                            this.field546 = this.field546.substring(0, 12);
                        }
                    } else if (this.field421 == 1) {
                        if (var9 == 8 && this.field547.length() > 0) {
                            this.field547 = this.field547.substring(0, this.field547.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field421 = 0;
                        }
                        if (var10) {
                            this.field547 = this.field547 + (char) var9;
                        }
                        if (this.field547.length() > 20) {
                            this.field547 = this.field547.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field582 == 3) {
                int var12 = super.field932 / 2;
                int var13 = super.field933 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field948 == 1 && super.field949 >= var12 - 75 && super.field949 <= var12 + 75 && super.field950 >= var18 - 20 && super.field950 <= var18 + 20) {
                    this.field582 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method148(byte arg0) {
        if (this.field405 == 0 && this.field380 == 0) {
            this.field219[this.field114] = "Walk here";
            this.field278[this.field114] = 14;
            this.field276[this.field114] = super.field942;
            this.field277[this.field114] = super.field943;
            ++this.field114;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class61.field1507; ++var3) {
            int var4 = class61.field1508[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field589.method572(this.field363, var5, var6, var4) >= 0) {
                    class59 var9 = class59.method450(var8);
                    if (var9.field1373 != null) {
                        var9 = var9.method455(6);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field405 == 1) {
                        this.field219[this.field114] = "Use " + this.field409 + " with @cya@" + var9.field1416;
                        this.field278[this.field114] = 741;
                        this.field279[this.field114] = var4;
                        this.field276[this.field114] = var5;
                        this.field277[this.field114] = var6;
                        ++this.field114;
                    } else if (this.field380 == 1) {
                        if ((this.field382 & 4) == 4) {
                            this.field219[this.field114] = this.field383 + " @cya@" + var9.field1416;
                            this.field278[this.field114] = 186;
                            this.field279[this.field114] = var4;
                            this.field276[this.field114] = var5;
                            this.field277[this.field114] = var6;
                            ++this.field114;
                        }
                    } else {
                        if (var9.field1374 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1374[var10] != null) {
                                    this.field219[this.field114] = var9.field1374[var10] + " @cya@" + var9.field1416;
                                    if (var10 == 0) {
                                        this.field278[this.field114] = 321;
                                    }
                                    if (var10 == 1) {
                                        this.field278[this.field114] = 809;
                                    }
                                    if (var10 == 2) {
                                        this.field278[this.field114] = 35;
                                    }
                                    if (var10 == 3) {
                                        this.field278[this.field114] = 71;
                                    }
                                    if (var10 == 4) {
                                        this.field278[this.field114] = 1580;
                                    }
                                    this.field279[this.field114] = var4;
                                    this.field276[this.field114] = var5;
                                    this.field277[this.field114] = var6;
                                    ++this.field114;
                                }
                            }
                        }
                        this.field219[this.field114] = "Examine @cya@" + var9.field1416;
                        this.field278[this.field114] = 1891;
                        this.field279[this.field114] = var9.field1406 << 14;
                        this.field276[this.field114] = var5;
                        this.field277[this.field114] = var6;
                        ++this.field114;
                    }
                }
                if (var7 == 1) {
                    class24 var11 = this.field272[var8];
                    if (var11.field876.field691 == 1 && (var11.field1702 & 127) == 64 && (var11.field1703 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field273; ++var12) {
                            class24 var15 = this.field272[this.field274[var12]];
                            if (var15 != null && var11 != var15 && var15.field876.field691 == 1 && var11.field1702 == var15.field1702 && var11.field1703 == var15.field1703) {
                                this.method46(-693, this.field274[var12], var15.field876, var5, var6);
                            }
                        }
                        for (int var13 = 0; var13 < this.field391; ++var13) {
                            class36 var14 = this.field390[this.field392[var13]];
                            if (var14 != null && var11.field1702 == var14.field1702 && var11.field1703 == var14.field1703) {
                                this.method36(var14, this.field392[var13], (byte) 31, var6, var5);
                            }
                        }
                    }
                    this.method46(-693, var8, var11.field876, var5, var6);
                }
                if (var7 == 0) {
                    class36 var16 = this.field390[var8];
                    if ((var16.field1702 & 127) == 64 && (var16.field1703 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field273; ++var17) {
                            class24 var20 = this.field272[this.field274[var17]];
                            if (var20 != null && var20.field876.field691 == 1 && var16.field1702 == var20.field1702 && var16.field1703 == var20.field1703) {
                                this.method46(-693, this.field274[var17], var20.field876, var5, var6);
                            }
                        }
                        for (int var18 = 0; var18 < this.field391; ++var18) {
                            class36 var19 = this.field390[this.field392[var18]];
                            if (var19 != null && var16 != var19 && var16.field1702 == var19.field1702 && var16.field1703 == var19.field1703) {
                                this.method36(var19, this.field392[var18], (byte) 31, var6, var5);
                            }
                        }
                    }
                    this.method36(var16, var8, (byte) 31, var6, var5);
                }
                if (var7 == 3) {
                    class17 var21 = this.field574[this.field363][var5][var6];
                    if (var21 != null) {
                        for (class27 var22 = (class27) var21.method207(false); var22 != null; var22 = (class27) var21.method209(false)) {
                            class51 var23 = class51.method433(var22.field906);
                            if (this.field405 == 1) {
                                this.field219[this.field114] = "Use " + this.field409 + " with @lre@" + var23.field1269;
                                this.field278[this.field114] = 419;
                                this.field279[this.field114] = var22.field906;
                                this.field276[this.field114] = var5;
                                this.field277[this.field114] = var6;
                                ++this.field114;
                            } else if (this.field380 == 1) {
                                if ((this.field382 & 1) == 1) {
                                    this.field219[this.field114] = this.field383 + " @lre@" + var23.field1269;
                                    this.field278[this.field114] = 617;
                                    this.field279[this.field114] = var22.field906;
                                    this.field276[this.field114] = var5;
                                    this.field277[this.field114] = var6;
                                    ++this.field114;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1283 != null && var23.field1283[var24] != null) {
                                        this.field219[this.field114] = var23.field1283[var24] + " @lre@" + var23.field1269;
                                        if (var24 == 0) {
                                            this.field278[this.field114] = 416;
                                        }
                                        if (var24 == 1) {
                                            this.field278[this.field114] = 858;
                                        }
                                        if (var24 == 2) {
                                            this.field278[this.field114] = 134;
                                        }
                                        if (var24 == 3) {
                                            this.field278[this.field114] = 852;
                                        }
                                        if (var24 == 4) {
                                            this.field278[this.field114] = 499;
                                        }
                                        this.field279[this.field114] = var22.field906;
                                        this.field276[this.field114] = var5;
                                        this.field277[this.field114] = var6;
                                        ++this.field114;
                                    } else if (var24 == 2) {
                                        this.field219[this.field114] = "Take @lre@" + var23.field1269;
                                        this.field278[this.field114] = 134;
                                        this.field279[this.field114] = var22.field906;
                                        this.field276[this.field114] = var5;
                                        this.field277[this.field114] = var6;
                                        ++this.field114;
                                    }
                                }
                                this.field219[this.field114] = "Examine @lre@" + var23.field1269;
                                this.field278[this.field114] = 1684;
                                this.field279[this.field114] = var22.field906;
                                this.field276[this.field114] = var5;
                                this.field277[this.field114] = var6;
                                ++this.field114;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 45) {
            this.field574 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILAIRMECOM;)V")
    public final void method149(byte arg0, int arg1, int arg2, class3 arg3) {
        int var5 = this.field334 + this.field168 & 2047;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = class61.field1509[var5];
            int var8 = class61.field1510[var5];
            if (arg0 == 116) {
                int var9 = var7 * 256 / (this.field462 + 256);
                int var10 = var8 * 256 / (this.field462 + 256);
                int var11 = arg1 * var10 + arg2 * var9 >> 16;
                int var12 = arg2 * var10 - arg1 * var9 >> 16;
                if (var6 > 2500) {
                    arg3.method15(var11 + 94 - arg3.field27 / 2 + 4, 83 - var12 - arg3.field28 / 2 - 4, this.field320, this.field318);
                } else {
                    arg3.method9((byte) -91, var11 + 94 - arg3.field27 / 2 + 4, 83 - var12 - arg3.field28 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIIII)V")
    private final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5) {
            this.field574 = null;
        }
        class54 var11 = null;
        for (class54 var12 = (class54) this.field325.method206(); var12 != null; var12 = (class54) this.field325.method208(262)) {
            if (var12.field1309 == arg3 && var12.field1311 == arg7 && var12.field1312 == arg2 && var12.field1310 == arg0) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class54();
            var11.field1309 = arg3;
            var11.field1310 = arg0;
            var11.field1311 = arg7;
            var11.field1312 = arg2;
            this.method94(var11, -824);
            this.field325.method203(var11);
        }
        var11.field1313 = arg1;
        var11.field1315 = arg6;
        var11.field1314 = arg4;
        var11.field1316 = arg9;
        var11.field1308 = arg8;
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method151(int arg0) {
        this.method119((byte) 2);
        if (this.field594 == 1) {
            this.field170[this.field593 / 100].method9((byte) -91, this.field591 - 8 - 4, this.field592 - 8 - 4);
        }
        if (this.field594 == 2) {
            this.field170[this.field593 / 100 + 4].method9((byte) -91, this.field591 - 8 - 4, this.field592 - 8 - 4);
            ++field458;
            if (field458 > 193) {
                field458 = 0;
                this.field501.method377(this.field242, 25);
                this.field501.method382(0);
            }
        }
        if (this.field314 != -1) {
            this.method165(this.field330, (byte) 5, this.field314);
            this.method143(0, class22.method215(this.field314), 0, 0, true);
        }
        if (this.field430 != -1) {
            this.method165(this.field330, (byte) 5, this.field430);
            this.method143(0, class22.method215(this.field430), 0, 0, true);
        }
        this.method38(false);
        if (arg0 >= 0) {
            this.field574 = null;
        }
        if (!this.field502) {
            this.method127(831);
            this.method113(true);
        } else if (this.field225 == 0) {
            this.method86(-18010);
        }
        if (this.field239 == 1) {
            this.field378.method9((byte) -91, 472, 296);
        }
        if (field542) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field930 < 30 && field517) {
                var4 = 16711680;
            }
            if (super.field930 < 20 && !field517) {
                var4 = 16711680;
            }
            this.field204.method178(-44393, "Fps:" + super.field930, var4, var2, var3);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field517) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field517) {
                int var9 = 16711680;
            }
            this.field204.method178(-44393, "Mem:" + var6 + "k", 16776960, var2, var13);
            var13 += 15;
        }
        if (this.field186 != 0) {
            int var10 = this.field186 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field204.method183(4, (byte) 0, 16776960, 329, "System update in: " + var11 + ":0" + var12);
            } else {
                this.field204.method183(4, (byte) 0, 16776960, 329, "System update in: " + var11 + ":" + var12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method152(int arg0) {
        if (arg0 >= 0) {
            field464 = true;
        }
        if (field517 && this.field443 == 2 && class62.field1519 != this.field363) {
            this.method68((String) null, "Loading - please wait.", this.field357);
            this.field443 = 1;
            this.field397 = System.currentTimeMillis();
        }
        if (this.field443 == 1) {
            int var2 = this.method153((byte) -77);
            if (var2 != 0 && System.currentTimeMillis() - this.field397 > 360000L) {
                signlink.reporterror(this.field546 + " glcfb " + this.field343 + "," + var2 + "," + field517 + "," + this.field379[0] + "," + this.field566.method367() + "," + this.field363 + "," + this.field523 + "," + this.field524);
                this.field397 = System.currentTimeMillis();
            }
        }
        if (this.field443 == 2 && this.field425 != this.field363) {
            this.field425 = this.field363;
            this.method50(this.field363, 72);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)I")
    public final int method153(byte arg0) {
        for (int var2 = 0; var2 < this.field572.length; ++var2) {
            if (this.field572[var2] == null && this.field131[var2] != -1) {
                return -1;
            }
            if (this.field402[var2] == null && this.field132[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field572.length; ++var4) {
            byte[] var5 = this.field402[var4];
            if (var5 != null) {
                int var6 = (this.field130[var4] >> 8) * 64 - this.field562;
                int var7 = (this.field130[var4] & 255) * 64 - this.field563;
                if (this.field341) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class62.method499(var6, var5, var7, false);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field414) {
            return -4;
        } else {
            this.field443 = 2;
            class62.field1519 = this.field363;
            if (arg0 != -77) {
                this.method134();
            }
            this.method37(196);
            this.field501.method377(this.field242, 194);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILIGMZHLWJ;)I")
    public final int method154(int arg0, int arg1, class22 arg2) {
        if (arg1 < 7 || arg1 > 7) {
            this.field454 = this.field337.method388();
        }
        if (arg2.field829 != null && arg0 < arg2.field829.length) {
            try {
                int[] var4 = arg2.field829[arg0];
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
                        var9 = this.field185[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field162[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field359[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class22 var11 = class22.method215(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class51.field1270 && (!class51.method433(var12).field1238 || field516)) {
                            for (int var13 = 0; var13 < var11.field784.length; ++var13) {
                                if (var12 + 1 == var11.field784[var13]) {
                                    var9 += var11.field797[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field214[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field491[this.field162[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field214[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field353.field1017;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class5.field77; ++var14) {
                            if (class5.field79[var14]) {
                                var9 += this.field162[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class22 var15 = class22.method215(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class51.field1270 && (!class51.method433(var16).field1238 || field516)) {
                            for (int var17 = 0; var17 < var15.field784.length; ++var17) {
                                if (var15.field784[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field583;
                    }
                    if (var8 == 12) {
                        var9 = this.field248;
                    }
                    if (var8 == 13) {
                        int var18 = this.field214[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class26 var21 = class26.field896[var20];
                        int var22 = var21.field898;
                        int var23 = var21.field899;
                        int var24 = var21.field900;
                        int var25 = field370[var24 - var23];
                        var9 = this.field214[var22] >> var23 & var25;
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
                        var9 = (field353.field1702 >> 7) + this.field562;
                    }
                    if (var8 == 19) {
                        var9 = (field353.field1703 >> 7) + this.field563;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOJMMOVXV;)V")
    public final void method155(int arg0, class40 arg1) {
        short var3 = 256;
        if (arg0 >= 0) {
            this.method134();
        }
        for (int var4 = 0; var4 < this.field486.length; ++var4) {
            this.field486[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field486[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field487[var16] = (this.field486[var16 - 1] + this.field486[var16 + 1] + this.field486[var16 - 128] + this.field486[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field486;
            this.field486 = this.field487;
            this.field487 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field1061; ++var8) {
                for (int var9 = 0; var9 < arg1.field1060; ++var9) {
                    if (arg1.field1058[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field1062;
                        int var11 = var8 + 16 + arg1.field1063;
                        int var12 = (var11 << 7) + var10;
                        this.field486[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILIGMZHLWJ;)Z")
    public final boolean method156(int arg0, class22 arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (arg1.field806 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field806.length; ++var3) {
                int var4 = this.method154(var3, 7, arg1);
                int var5 = arg1.field774[var3];
                if (arg1.field806[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field806[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field806[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
        int var2 = 5;
        this.field315[8] = 0;
        int var3 = 0;
        if (arg0) {
            this.field454 = -1;
        }
        while (this.field315[8] == 0) {
            String var4 = "Unknown problem";
            this.method146(20, "Connecting to web server", field118);
            try {
                DataInputStream var5 = this.method29("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 360);
                class50 var6 = new class50(new byte[40], -46859);
                var5.readFully(var6.field1224, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field315[var7] = var6.method393();
                }
                int var8 = var6.method393();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field315[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field315[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field315[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field315[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field315[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field315[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method146(10, "Game updated - please reload page", field118);
                        var11 = 10;
                    } else {
                        this.method146(10, var4 + " - Will retry in " + var11 + " secs.", field118);
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
                this.field223 = !this.field223;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        if (!arg0) {
            this.field493 = true;
            for (int var2 = 0; var2 < 7; ++var2) {
                this.field275[var2] = -1;
                for (int var3 = 0; var3 < class35.field985; ++var3) {
                    if (!class35.field986[var3].field992 && class35.field986[var3].field987 == var2 + (this.field495 ? 0 : 7)) {
                        this.field275[var2] = var3;
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method159(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (super.field948 == 1) {
            if (super.field949 >= 6 && super.field949 <= 106 && super.field950 >= 467 && super.field950 <= 499) {
                this.field385 = (this.field385 + 1) % 4;
                this.field578 = true;
                this.field280 = true;
                this.field501.method377(this.field242, 19);
                this.field501.method378(this.field385);
                this.field501.method378(this.field180);
                this.field501.method378(this.field268);
            }
            if (super.field949 >= 135 && super.field949 <= 235 && super.field950 >= 467 && super.field950 <= 499) {
                this.field180 = (this.field180 + 1) % 3;
                this.field578 = true;
                this.field280 = true;
                this.field501.method377(this.field242, 19);
                this.field501.method378(this.field385);
                this.field501.method378(this.field180);
                this.field501.method378(this.field268);
            }
            if (super.field949 >= 273 && super.field949 <= 373 && super.field950 >= 467 && super.field950 <= 499) {
                this.field268 = (this.field268 + 1) % 3;
                this.field578 = true;
                this.field280 = true;
                this.field501.method377(this.field242, 19);
                this.field501.method378(this.field385);
                this.field501.method378(this.field180);
                this.field501.method378(this.field268);
            }
            if (super.field949 >= 412 && super.field949 <= 512 && super.field950 >= 467 && super.field950 <= 499) {
                if (this.field430 == -1) {
                    this.method145((byte) 21);
                    this.field450 = "";
                    this.field398 = false;
                    this.field148 = this.field430 = class22.field842;
                    return;
                }
                this.method40("", 0, "Please close the interface you have open before using 'report abuse'", this.field144);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
    public final void method160(boolean arg0, boolean arg1) {
        this.method115(5);
        if (arg0) {
            this.field531 = this.field483.method312();
        }
        this.field190.method351(-181);
        this.field489.method320((byte) -91, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field582 == 0) {
            int var5 = var4 / 2 + 80;
            this.field203.method180(true, 7711145, this.field566.field1130, var5, 3, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field205.method180(true, 16776960, "Welcome to RuneScape", var6, 3, var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field490.method320((byte) -91, var7 - 73, var8 - 20);
            this.field205.method180(true, 16777215, "New User", var8 + 5, 3, var7);
            int var9 = var3 / 2 + 80;
            this.field490.method320((byte) -91, var9 - 73, var8 - 20);
            this.field205.method180(true, 16777215, "Existing User", var8 + 5, 3, var9);
        }
        if (this.field582 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field472.length() > 0) {
                this.field205.method180(true, 16776960, this.field472, var10 - 15, 3, var3 / 2);
                this.field205.method180(true, 16776960, this.field473, var10, 3, var3 / 2);
                var10 += 30;
            } else {
                this.field205.method180(true, 16776960, this.field473, var10 - 7, 3, var3 / 2);
                var10 += 30;
            }
            this.field205.method187(var3 / 2 - 90, "Username: " + this.field546 + (this.field421 == 0 & field399 % 40 < 20 ? "@yel@|" : ""), -129, 16777215, true, var10);
            var10 += 15;
            this.field205.method187(var3 / 2 - 88, "Password: " + class9.method173(true, this.field547) + (this.field421 == 1 & field399 % 40 < 20 ? "@yel@|" : ""), -129, 16777215, true, var10);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field490.method320((byte) -91, var11 - 73, var12 - 20);
                this.field205.method180(true, 16777215, "Login", var12 + 5, 3, var11);
                int var13 = var3 / 2 + 80;
                this.field490.method320((byte) -91, var13 - 73, var12 - 20);
                this.field205.method180(true, 16777215, "Cancel", var12 + 5, 3, var13);
            }
        }
        if (this.field582 == 3) {
            this.field205.method180(true, 16776960, "Create a free account", var4 / 2 - 60, 3, var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field205.method180(true, 16777215, "To create a new account you need to", var14, 3, var3 / 2);
            int var18 = var14 + 15;
            this.field205.method180(true, 16777215, "go back to the main RuneScape webpage", var18, 3, var3 / 2);
            int var19 = var18 + 15;
            this.field205.method180(true, 16777215, "and choose the 'create account'", var19, 3, var3 / 2);
            int var20 = var19 + 15;
            this.field205.method180(true, 16777215, "button near the top of that page.", var20, 3, var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field490.method320((byte) -91, var15 - 73, var16 - 20);
            this.field205.method180(true, 16777215, "Cancel", var16 + 5, 3, var15);
        }
        this.field190.method352(202, 171, super.field934, (byte) 108);
        if (this.field235) {
            this.field235 = false;
            this.field188.method352(128, 0, super.field934, (byte) 108);
            this.field189.method352(202, 371, super.field934, (byte) 108);
            this.field193.method352(0, 265, super.field934, (byte) 108);
            this.field194.method352(562, 265, super.field934, (byte) 108);
            this.field195.method352(128, 171, super.field934, (byte) 108);
            this.field196.method352(562, 171, super.field934, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (this.field480 != 0) {
            int var2 = 0;
            while (arg0 >= 0) {
                this.field454 = this.field337.method388();
            }
            if (this.field186 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field251[var3] != null) {
                    int var4 = this.field249[var3];
                    String var5 = this.field250[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field180 == 0 || this.field180 == 1 && this.method126(var5, (byte) 1))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field942 > 4 && super.field943 - 4 > var9 - 10 && super.field943 - 4 <= var9 + 3) {
                            int var10 = this.field204.method181(0, "From:  " + var5 + this.field251[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field942 < var10 + 4) {
                                if (this.field580 >= 1) {
                                    this.field219[this.field114] = "Report abuse @whi@" + var5;
                                    this.field278[this.field114] = 2505;
                                    ++this.field114;
                                }
                                this.field219[this.field114] = "Add ignore @whi@" + var5;
                                this.field278[this.field114] = 2362;
                                ++this.field114;
                                this.field219[this.field114] = "Add friend @whi@" + var5;
                                this.field278[this.field114] = 2954;
                                ++this.field114;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field180 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 360);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field514 = Integer.parseInt(arg0[0]);
                field515 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method55(-1814);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method80(0);
                }
                if (arg0[3].equals("free")) {
                    field516 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field516 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method295(true, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
    public final void method162(boolean arg0, int arg1) {
        if (arg0) {
            this.field454 = -1;
        }
        if (!field517) {
            for (int var3 = 0; var3 < this.field138.length; ++var3) {
                int var4 = this.field138[var3];
                if (class63.field1569[var4] >= arg1) {
                    class40 var5 = class63.field1563[var4];
                    int var6 = var5.field1061 * var5.field1060 - 1;
                    int var7 = this.field330 * var5.field1060 * 2;
                    byte[] var8 = var5.field1058;
                    byte[] var9 = this.field166;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1058 = var9;
                    this.field166 = var8;
                    class63.method521(33949, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)Z")
    public final boolean method163(int arg0) {
        if (arg0 >= 0) {
            this.field501.method378(84);
        }
        if (this.field123 == null) {
            return false;
        } else {
            try {
                int var2 = this.field123.method324();
                if (var2 == 0) {
                    return false;
                }
                if (this.field454 == -1) {
                    this.field123.method325(this.field337.field1224, 0, 1);
                    this.field454 = this.field337.field1224[0] & 255;
                    if (this.field483 != null) {
                        this.field454 = this.field454 - this.field483.method312() & 255;
                    }
                    this.field453 = class20.field766[this.field454];
                    --var2;
                }
                if (this.field453 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field123.method325(this.field337.field1224, 0, 1);
                    this.field453 = this.field337.field1224[0] & 255;
                    --var2;
                }
                if (this.field453 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field123.method325(this.field337.field1224, 0, 2);
                    this.field337.field1225 = 0;
                    this.field453 = this.field337.method390();
                    var2 -= 2;
                }
                if (var2 < this.field453) {
                    return false;
                }
                this.field337.field1225 = 0;
                this.field123.method325(this.field337.field1224, 0, this.field453);
                this.field455 = 0;
                this.field528 = this.field527;
                this.field527 = this.field526;
                this.field526 = this.field454;
                if (this.field454 != 65 && this.field454 != 189 && this.field454 != 238 && this.field454 != 155 && this.field454 != 48 && this.field454 != 237 && this.field454 != 245 && this.field454 != 179 && this.field454 != 169 && this.field454 != 165 && this.field454 != 215) {
                    if (this.field454 == 130) {
                        if (this.field579 != -1) {
                            this.method21(6, this.field579);
                            this.field579 = -1;
                            this.field410 = true;
                            this.field467 = true;
                        }
                        if (this.field426 != -1) {
                            this.method21(6, this.field426);
                            this.field426 = -1;
                            this.field280 = true;
                        }
                        if (this.field293 != -1) {
                            this.method21(6, this.field293);
                            this.field293 = -1;
                            this.field235 = true;
                        }
                        if (this.field211 != -1) {
                            this.method21(6, this.field211);
                            this.field211 = -1;
                        }
                        if (this.field430 != -1) {
                            this.method21(6, this.field430);
                            this.field430 = -1;
                        }
                        if (this.field474 != 0) {
                            this.field474 = 0;
                            this.field280 = true;
                        }
                        this.field263 = false;
                        this.field454 = -1;
                        return true;
                    }
                    if (this.field454 == 255) {
                        this.field432 = this.field337.method408(382);
                        this.field431 = this.field337.method388();
                        while (this.field337.field1225 < this.field453) {
                            int var3 = this.field337.method388();
                            this.method122(0, var3, this.field337);
                        }
                        this.field454 = -1;
                        return true;
                    }
                    if (this.field454 == 173) {
                        int var4 = this.field337.method416(-998);
                        int var5 = this.field337.method390();
                        class22.method215(var4).field844 = 1;
                        class22.method215(var4).field845 = var5;
                        this.field454 = -1;
                        return true;
                    }
                    if (this.field454 == 11) {
                        int var6 = this.field337.method414(6);
                        int var7 = this.field337.method390();
                        class22.method215(var7).field844 = 2;
                        class22.method215(var7).field845 = var6;
                        this.field454 = -1;
                        return true;
                    }
                    if (this.field454 != 141) {
                        if (this.field454 == 223) {
                            this.field428 = this.field337.method406(41312);
                            this.field396 = this.field337.method414(6);
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 114) {
                            this.field410 = true;
                            int var9 = this.field337.method390();
                            class22 var10 = class22.method215(var9);
                            while (this.field337.field1225 < this.field453) {
                                int var11 = this.field337.method402();
                                int var12 = this.field337.method390();
                                int var13 = this.field337.method388();
                                if (var13 == 255) {
                                    var13 = this.field337.method393();
                                }
                                if (var11 >= 0 && var11 < var10.field784.length) {
                                    var10.field784[var11] = var12;
                                    var10.field797[var11] = var13;
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 185) {
                            for (int var14 = 0; var14 < this.field390.length; ++var14) {
                                if (this.field390[var14] != null) {
                                    this.field390[var14].field1743 = -1;
                                }
                            }
                            for (int var15 = 0; var15 < this.field272.length; ++var15) {
                                if (this.field272[var15] != null) {
                                    this.field272[var15].field1743 = -1;
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 24) {
                            this.field245 = true;
                            this.field155 = this.field337.method388();
                            this.field156 = this.field337.method388();
                            this.field157 = this.field337.method390();
                            this.field158 = this.field337.method388();
                            this.field159 = this.field337.method388();
                            if (this.field159 >= 100) {
                                this.field549 = this.field155 * 128 + 64;
                                this.field551 = this.field156 * 128 + 64;
                                this.field550 = this.method22(-531, this.field549, this.field363, this.field551) - this.field157;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 242) {
                            if (this.field429 == 12) {
                                this.field410 = true;
                            }
                            this.field248 = this.field337.method391();
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 137) {
                            int var16 = this.field337.method414(6);
                            if (var16 == 65535) {
                                var16 = -1;
                            }
                            if (this.field386 != var16 && this.field525 && !field517 && this.field165 == 0) {
                                this.field183 = var16;
                                this.field184 = true;
                                this.field566.method370(2, this.field183);
                            }
                            this.field386 = var16;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 208) {
                            int var17 = this.field337.method420((byte) 34);
                            int var18 = this.field337.method390();
                            if (this.field525 && !field517) {
                                this.field183 = var18;
                                this.field184 = false;
                                this.field566.method370(2, this.field183);
                                this.field165 = var17;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 204) {
                            int var19 = this.field337.method416(-998);
                            int var20 = this.field337.method388();
                            if (var19 == 65535) {
                                var19 = -1;
                            }
                            if (this.field372[var20] != var19) {
                                this.method21(6, this.field372[var20]);
                                this.field372[var20] = var19;
                            }
                            this.field410 = true;
                            this.field467 = true;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 254) {
                            String var21 = this.field337.method395();
                            if (var21.endsWith(":tradereq:")) {
                                String var22 = var21.substring(0, var21.indexOf(":"));
                                long var23 = class9.method168(var22);
                                boolean var25 = false;
                                for (int var26 = 0; var26 < this.field256; ++var26) {
                                    if (this.field573[var26] == var23) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (!var25 && this.field411 == 0) {
                                    this.method40(var22, 4, "wishes to trade with you.", this.field144);
                                }
                            } else if (var21.endsWith(":duelreq:")) {
                                String var27 = var21.substring(0, var21.indexOf(":"));
                                long var28 = class9.method168(var27);
                                boolean var30 = false;
                                for (int var31 = 0; var31 < this.field256; ++var31) {
                                    if (this.field573[var31] == var28) {
                                        var30 = true;
                                        break;
                                    }
                                }
                                if (!var30 && this.field411 == 0) {
                                    this.method40(var27, 8, "wishes to duel with you.", this.field144);
                                }
                            } else if (!var21.endsWith(":chalreq:")) {
                                this.method40("", 0, var21, this.field144);
                            } else {
                                String var32 = var21.substring(0, var21.indexOf(":"));
                                long var33 = class9.method168(var32);
                                boolean var35 = false;
                                for (int var36 = 0; var36 < this.field256; ++var36) {
                                    if (this.field573[var36] == var33) {
                                        var35 = true;
                                        break;
                                    }
                                }
                                if (!var35 && this.field411 == 0) {
                                    String var37 = var21.substring(var21.indexOf(":") + 1, var21.length() - 9);
                                    this.method40(var32, 8, var37, this.field144);
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 53) {
                            this.field186 = this.field337.method415(65) * 30;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 86) {
                            this.method104(this.field337, -511, this.field453);
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 196) {
                            int var38 = this.field337.method414(6);
                            int var39 = this.field337.method415(65);
                            int var40 = this.field337.method415(65);
                            int var41 = this.field337.method416(-998);
                            class22.method215(var41).field800 = var40;
                            class22.method215(var41).field801 = var39;
                            class22.method215(var41).field799 = var38;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 181) {
                            int var42 = this.field337.method417(-112);
                            if (var42 >= 0) {
                                this.method114(var42, 12281);
                            }
                            if (this.field314 != var42) {
                                this.method21(6, this.field314);
                                this.field314 = var42;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 56) {
                            int var43 = this.field337.method390();
                            int var44 = this.field337.method388();
                            int var45 = this.field337.method390();
                            if (var45 == 65535) {
                                if (this.field424 < 50) {
                                    this.field176[this.field424] = (short) var43;
                                    this.field303[this.field424] = var44;
                                    this.field384[this.field424] = 0;
                                    ++this.field424;
                                }
                            } else if (this.field221 && !field517 && this.field424 < 50) {
                                this.field176[this.field424] = var43;
                                this.field303[this.field424] = var44;
                                this.field384[this.field424] = class43.field1088[var43] + var45;
                                ++this.field424;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 190) {
                            this.field420 = this.field337.method388();
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 180) {
                            this.field410 = true;
                            int var46 = this.field337.method408(382);
                            int var47 = this.field337.method423((byte) 2);
                            int var48 = this.field337.method408(382);
                            this.field359[var46] = var47;
                            this.field185[var46] = var48;
                            this.field162[var46] = 1;
                            for (int var49 = 0; var49 < 98; ++var49) {
                                if (var47 >= field491[var49]) {
                                    this.field162[var46] = var49 + 2;
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 222) {
                            int var50 = this.field337.method388();
                            int var51 = this.field337.method388();
                            int var52 = this.field337.method388();
                            int var53 = this.field337.method388();
                            this.field575[var50] = true;
                            this.field254[var50] = var51;
                            this.field447[var50] = var52;
                            this.field477[var50] = var53;
                            this.field417[var50] = 0;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 16 || this.field454 == 101) {
                            int var54 = this.field523;
                            int var55 = this.field524;
                            if (this.field454 == 16) {
                                var55 = this.field337.method390();
                                var54 = this.field337.method416(-998);
                                this.field341 = false;
                            }
                            if (this.field454 == 101) {
                                this.field337.method398(-313);
                                int var56 = 0;
                                while (true) {
                                    if (var56 >= 4) {
                                        this.field337.method400((byte) -67);
                                        var54 = this.field337.method414(6);
                                        var55 = this.field337.method414(6);
                                        this.field341 = true;
                                        break;
                                    }
                                    for (int var57 = 0; var57 < 13; ++var57) {
                                        for (int var58 = 0; var58 < 13; ++var58) {
                                            int var59 = this.field337.method399(0, 1);
                                            if (var59 == 1) {
                                                this.field294[var56][var57][var58] = this.field337.method399(0, 26);
                                            } else {
                                                this.field294[var56][var57][var58] = -1;
                                            }
                                        }
                                    }
                                    ++var56;
                                }
                            }
                            if (this.field523 == var54 && this.field524 == var55 && this.field443 == 2) {
                                this.field454 = -1;
                                return true;
                            }
                            this.field523 = var54;
                            this.field524 = var55;
                            this.field562 = (this.field523 - 6) * 8;
                            this.field563 = (this.field524 - 6) * 8;
                            this.field145 = false;
                            if ((this.field523 / 8 == 48 || this.field523 / 8 == 49) && this.field524 / 8 == 48) {
                                this.field145 = true;
                            }
                            if (this.field523 / 8 == 48 && this.field524 / 8 == 148) {
                                this.field145 = true;
                            }
                            this.field443 = 1;
                            this.field397 = System.currentTimeMillis();
                            this.method68((String) null, "Loading - please wait.", this.field357);
                            if (this.field454 == 16) {
                                int var60 = 0;
                                int var61 = (this.field523 - 6) / 8;
                                label1240: while (true) {
                                    if (var61 > (this.field523 + 6) / 8) {
                                        this.field572 = new byte[var60][];
                                        this.field402 = new byte[var60][];
                                        this.field130 = new int[var60];
                                        this.field131 = new int[var60];
                                        this.field132 = new int[var60];
                                        int var63 = 0;
                                        int var64 = (this.field523 - 6) / 8;
                                        while (true) {
                                            if (var64 > (this.field523 + 6) / 8) {
                                                break label1240;
                                            }
                                            for (int var65 = (this.field524 - 6) / 8; var65 <= (this.field524 + 6) / 8; ++var65) {
                                                this.field130[var63] = (var64 << 8) + var65;
                                                if (this.field145 && (var65 == 49 || var65 == 149 || var65 == 147 || var64 == 50 || var64 == 49 && var65 == 47)) {
                                                    this.field131[var63] = -1;
                                                    this.field132[var63] = -1;
                                                    ++var63;
                                                } else {
                                                    int var66 = this.field131[var63] = this.field566.method365(var64, 0, (byte) 14, var65);
                                                    if (var66 != -1) {
                                                        this.field566.method370(3, var66);
                                                    }
                                                    int var67 = this.field132[var63] = this.field566.method365(var64, 1, (byte) 14, var65);
                                                    if (var67 != -1) {
                                                        this.field566.method370(3, var67);
                                                    }
                                                    ++var63;
                                                }
                                            }
                                            ++var64;
                                        }
                                    }
                                    for (int var62 = (this.field524 - 6) / 8; var62 <= (this.field524 + 6) / 8; ++var62) {
                                        ++var60;
                                    }
                                    ++var61;
                                }
                            }
                            if (this.field454 == 101) {
                                int var68 = 0;
                                int[] var69 = new int[676];
                                int var70 = 0;
                                label1201: while (true) {
                                    if (var70 >= 4) {
                                        this.field572 = new byte[var68][];
                                        this.field402 = new byte[var68][];
                                        this.field130 = new int[var68];
                                        this.field131 = new int[var68];
                                        this.field132 = new int[var68];
                                        int var78 = 0;
                                        while (true) {
                                            if (var78 >= var68) {
                                                break label1201;
                                            }
                                            int var79 = this.field130[var78] = var69[var78];
                                            int var80 = var79 >> 8 & 255;
                                            int var81 = var79 & 255;
                                            int var82 = this.field131[var78] = this.field566.method365(var80, 0, (byte) 14, var81);
                                            if (var82 != -1) {
                                                this.field566.method370(3, var82);
                                            }
                                            int var83 = this.field132[var78] = this.field566.method365(var80, 1, (byte) 14, var81);
                                            if (var83 != -1) {
                                                this.field566.method370(3, var83);
                                            }
                                            ++var78;
                                        }
                                    }
                                    for (int var71 = 0; var71 < 13; ++var71) {
                                        for (int var72 = 0; var72 < 13; ++var72) {
                                            int var73 = this.field294[var70][var71][var72];
                                            if (var73 != -1) {
                                                int var74 = var73 >> 14 & 1023;
                                                int var75 = var73 >> 3 & 2047;
                                                int var76 = (var74 / 8 << 8) + var75 / 8;
                                                for (int var77 = 0; var77 < var68; ++var77) {
                                                    if (var69[var77] == var76) {
                                                        var76 = -1;
                                                        break;
                                                    }
                                                }
                                                if (var76 != -1) {
                                                    var69[var68++] = var76;
                                                }
                                            }
                                        }
                                    }
                                    ++var70;
                                }
                            }
                            int var84 = this.field562 - this.field564;
                            int var85 = this.field563 - this.field565;
                            this.field564 = this.field562;
                            this.field565 = this.field563;
                            for (int var86 = 0; var86 < 16384; ++var86) {
                                class24 var87 = this.field272[var86];
                                if (var87 != null) {
                                    for (int var88 = 0; var88 < 10; ++var88) {
                                        var87.field1722[var88] -= var84;
                                        var87.field1723[var88] -= var85;
                                    }
                                    var87.field1702 -= var84 * 128;
                                    var87.field1703 -= var85 * 128;
                                }
                            }
                            for (int var89 = 0; var89 < this.field388; ++var89) {
                                class36 var90 = this.field390[var89];
                                if (var90 != null) {
                                    for (int var91 = 0; var91 < 10; ++var91) {
                                        var90.field1722[var91] -= var84;
                                        var90.field1723[var91] -= var85;
                                    }
                                    var90.field1702 -= var84 * 128;
                                    var90.field1703 -= var85 * 128;
                                }
                            }
                            this.field414 = true;
                            byte var92 = 0;
                            byte var93 = 104;
                            byte var94 = 1;
                            if (var84 < 0) {
                                var92 = 103;
                                var93 = -1;
                                var94 = -1;
                            }
                            byte var95 = 0;
                            byte var96 = 104;
                            byte var97 = 1;
                            if (var85 < 0) {
                                var95 = 103;
                                var96 = -1;
                                var97 = -1;
                            }
                            for (int var98 = var92; var93 != var98; var98 += var94) {
                                for (int var99 = var95; var96 != var99; var99 += var97) {
                                    int var100 = var84 + var98;
                                    int var101 = var85 + var99;
                                    for (int var102 = 0; var102 < 4; ++var102) {
                                        if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                                            this.field574[var102][var98][var99] = this.field574[var102][var100][var101];
                                        } else {
                                            this.field574[var102][var98][var99] = null;
                                        }
                                    }
                                }
                            }
                            for (class54 var103 = (class54) this.field325.method206(); var103 != null; var103 = (class54) this.field325.method208(262)) {
                                var103.field1311 -= var84;
                                var103.field1312 -= var85;
                                if (var103.field1311 < 0 || var103.field1312 < 0 || var103.field1311 >= 104 || var103.field1312 >= 104) {
                                    var103.method20();
                                }
                            }
                            if (this.field468 != 0) {
                                this.field468 -= var84;
                                this.field469 -= var85;
                            }
                            this.field245 = false;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 103) {
                            int var104 = this.field337.method416(-998);
                            int var105 = this.field337.method414(6);
                            this.method114(var104, 12281);
                            if (var105 != -1) {
                                this.method114(var105, 12281);
                            }
                            if (this.field430 != -1) {
                                this.method21(6, this.field430);
                                this.field430 = -1;
                            }
                            if (this.field579 != -1) {
                                this.method21(6, this.field579);
                                this.field579 = -1;
                            }
                            if (this.field426 != -1) {
                                this.method21(6, this.field426);
                                this.field426 = -1;
                            }
                            if (this.field293 != var104) {
                                this.method21(6, this.field293);
                                this.field293 = var104;
                            }
                            if (this.field211 != var104) {
                                this.method21(6, this.field211);
                                this.field211 = var105;
                            }
                            this.field474 = 0;
                            this.field263 = false;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 142) {
                            int var106 = this.field337.method414(6);
                            this.method114(var106, 12281);
                            if (this.field579 != -1) {
                                this.method21(6, this.field579);
                                this.field579 = -1;
                                this.field410 = true;
                                this.field467 = true;
                            }
                            if (this.field426 != -1) {
                                this.method21(6, this.field426);
                                this.field426 = -1;
                                this.field280 = true;
                            }
                            if (this.field293 != -1) {
                                this.method21(6, this.field293);
                                this.field293 = -1;
                                this.field235 = true;
                            }
                            if (this.field211 != -1) {
                                this.method21(6, this.field211);
                                this.field211 = -1;
                            }
                            if (this.field430 != var106) {
                                this.method21(6, this.field430);
                                this.field430 = var106;
                            }
                            if (this.field474 != 0) {
                                this.field474 = 0;
                                this.field280 = true;
                            }
                            this.field263 = false;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 252) {
                            int var107 = this.field337.method419(true);
                            if (this.field599 != var107) {
                                this.method21(6, this.field599);
                                this.field599 = var107;
                            }
                            this.field280 = true;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 55) {
                            this.field266 = this.field337.method390();
                            this.field337.method388();
                            this.field329 = this.field337.method424(true);
                            this.field475 = this.field337.method390();
                            this.field587 = this.field337.method414(6);
                            this.field337.method390();
                            this.field358 = this.field337.method414(6);
                            this.field120 = this.field337.method415(65);
                            this.field283 = this.field337.method390();
                            this.field212 = this.field337.method414(6);
                            this.field510 = this.field337.method416(-998);
                            signlink.dnslookup(class9.method171(this.field329, (byte) 8));
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 77) {
                            int var108 = this.field337.method415(65);
                            byte var109 = this.field337.method389();
                            this.field220[var108] = var109;
                            if (this.field214[var108] != var109) {
                                this.field214[var108] = var109;
                                this.method121(4, var108);
                                this.field410 = true;
                                if (this.field599 != -1) {
                                    this.field280 = true;
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 248) {
                            this.field509 = false;
                            this.field474 = 2;
                            this.field494 = "";
                            this.field280 = true;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 160) {
                            this.field429 = this.field337.method388();
                            this.field410 = true;
                            this.field467 = true;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 123) {
                            this.method67(0);
                            this.field454 = -1;
                            return false;
                        }
                        if (this.field454 == 228) {
                            int var110 = this.field337.method390();
                            this.method114(var110, 12281);
                            if (this.field426 != -1) {
                                this.method21(6, this.field426);
                                this.field426 = -1;
                                this.field280 = true;
                            }
                            if (this.field293 != -1) {
                                this.method21(6, this.field293);
                                this.field293 = -1;
                                this.field235 = true;
                            }
                            if (this.field211 != -1) {
                                this.method21(6, this.field211);
                                this.field211 = -1;
                            }
                            if (this.field430 != -1) {
                                this.method21(6, this.field430);
                                this.field430 = -1;
                            }
                            if (this.field579 != var110) {
                                this.method21(6, this.field579);
                                this.field579 = var110;
                            }
                            if (this.field474 != 0) {
                                this.field474 = 0;
                                this.field280 = true;
                            }
                            this.field410 = true;
                            this.field467 = true;
                            this.field263 = false;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 124) {
                            int var111 = this.field337.method414(6);
                            int var112 = this.field337.method390();
                            int var113 = this.field337.method414(6);
                            class22.method215(var113).field793 = (var111 << 16) + var112;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 133) {
                            int var114 = this.field337.method416(-998);
                            int var115 = this.field337.method423((byte) 2);
                            this.field220[var114] = var115;
                            if (this.field214[var114] != var115) {
                                this.field214[var114] = var115;
                                this.method121(4, var114);
                                this.field410 = true;
                                if (this.field599 != -1) {
                                    this.field280 = true;
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 186) {
                            if (this.field429 == 12) {
                                this.field410 = true;
                            }
                            this.field583 = this.field337.method388();
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 199) {
                            this.field256 = this.field453 / 8;
                            for (int var116 = 0; var116 < this.field256; ++var116) {
                                this.field573[var116] = this.field337.method394(false);
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 49) {
                            long var117 = this.field337.method394(false);
                            int var119 = this.field337.method388();
                            String var120 = class9.method172((byte) -32, class9.method169(false, var117));
                            for (int var121 = 0; var121 < this.field445; ++var121) {
                                if (this.field324[var121] == var117) {
                                    if (this.field568[var121] != var119) {
                                        this.field568[var121] = var119;
                                        this.field410 = true;
                                        if (var119 > 0) {
                                            this.method40("", 5, var120 + " has logged in.", this.field144);
                                        }
                                        if (var119 == 0) {
                                            this.method40("", 5, var120 + " has logged out.", this.field144);
                                        }
                                    }
                                    var120 = null;
                                    break;
                                }
                            }
                            if (var120 != null && this.field445 < 200) {
                                this.field324[this.field445] = var117;
                                this.field265[this.field445] = var120;
                                this.field568[this.field445] = var119;
                                ++this.field445;
                                this.field410 = true;
                            }
                            boolean var122 = false;
                            while (!var122) {
                                var122 = true;
                                for (int var123 = 0; var123 < this.field445 - 1; ++var123) {
                                    if (this.field568[var123] != field514 && this.field568[var123 + 1] == field514 || this.field568[var123] == 0 && this.field568[var123 + 1] != 0) {
                                        int var124 = this.field568[var123];
                                        this.field568[var123] = this.field568[var123 + 1];
                                        this.field568[var123 + 1] = var124;
                                        String var125 = this.field265[var123];
                                        this.field265[var123] = this.field265[var123 + 1];
                                        this.field265[var123 + 1] = var125;
                                        long var126 = this.field324[var123];
                                        this.field324[var123] = this.field324[var123 + 1];
                                        this.field324[var123 + 1] = var126;
                                        this.field410 = true;
                                        var122 = false;
                                    }
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 83) {
                            int var128 = this.field337.method415(65);
                            int var129 = this.field337.method416(-998);
                            int var130 = this.field337.method416(-998);
                            if (var128 == 65535) {
                                class22.method215(var130).field844 = 0;
                                this.field454 = -1;
                                return true;
                            }
                            class51 var131 = class51.method433(var128);
                            class22.method215(var130).field844 = 4;
                            class22.method215(var130).field845 = var128;
                            class22.method215(var130).field800 = var131.field1277;
                            class22.method215(var130).field801 = var131.field1273;
                            class22.method215(var130).field799 = var131.field1265 * 100 / var129;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 73) {
                            int var132 = this.field337.method418(this.field160);
                            int var133 = this.field337.method390();
                            int var134 = this.field337.method417(-112);
                            class22 var135 = class22.method215(var133);
                            var135.field786 = var132;
                            var135.field819 = var134;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 52) {
                            this.field602 = this.field337.method408(382);
                            if (this.field602 == this.field429) {
                                if (this.field602 == 3) {
                                    this.field429 = 1;
                                } else {
                                    this.field429 = 3;
                                }
                                this.field410 = true;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 231) {
                            this.field385 = this.field337.method388();
                            this.field180 = this.field337.method388();
                            this.field268 = this.field337.method388();
                            this.field578 = true;
                            this.field280 = true;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 195) {
                            this.field173 = this.field337.method388();
                            if (this.field173 == 1) {
                                this.field356 = this.field337.method390();
                            }
                            if (this.field173 >= 2 && this.field173 <= 6) {
                                if (this.field173 == 2) {
                                    this.field261 = 64;
                                    this.field262 = 64;
                                }
                                if (this.field173 == 3) {
                                    this.field261 = 0;
                                    this.field262 = 64;
                                }
                                if (this.field173 == 4) {
                                    this.field261 = 128;
                                    this.field262 = 64;
                                }
                                if (this.field173 == 5) {
                                    this.field261 = 64;
                                    this.field262 = 0;
                                }
                                if (this.field173 == 6) {
                                    this.field261 = 64;
                                    this.field262 = 128;
                                }
                                this.field173 = 2;
                                this.field258 = this.field337.method390();
                                this.field259 = this.field337.method390();
                                this.field260 = this.field337.method388();
                            }
                            if (this.field173 == 10) {
                                this.field416 = this.field337.method390();
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 92) {
                            int var136 = this.field337.method414(6);
                            class22 var137 = class22.method215(var136);
                            for (int var138 = 0; var138 < var137.field784.length; ++var138) {
                                var137.field784[var138] = -1;
                                var137.field784[var138] = 0;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 115) {
                            int var139 = this.field337.method414(6);
                            int var140 = this.field337.method416(-998);
                            int var141 = var139 >> 10 & 31;
                            int var142 = var139 >> 5 & 31;
                            int var143 = var139 & 31;
                            class22.method215(var140).field787 = (var143 << 3) + (var141 << 19) + (var142 << 11);
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 211) {
                            this.field245 = true;
                            this.field532 = this.field337.method388();
                            this.field533 = this.field337.method388();
                            this.field534 = this.field337.method390();
                            this.field535 = this.field337.method388();
                            this.field536 = this.field337.method388();
                            if (this.field536 >= 100) {
                                int var144 = this.field532 * 128 + 64;
                                int var145 = this.field533 * 128 + 64;
                                int var146 = this.method22(-531, var144, this.field363, var145) - this.field534;
                                int var147 = var144 - this.field549;
                                int var148 = var146 - this.field550;
                                int var149 = var145 - this.field551;
                                int var150 = (int) Math.sqrt((double) (var147 * var147 + var149 * var149));
                                this.field552 = (int) (Math.atan2((double) var148, (double) var150) * 325.949D) & 2047;
                                this.field553 = (int) (Math.atan2((double) var147, (double) var149) * -325.949D) & 2047;
                                if (this.field552 < 128) {
                                    this.field552 = 128;
                                }
                                if (this.field552 > 383) {
                                    this.field552 = 383;
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 139) {
                            this.field239 = this.field337.method388();
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 253) {
                            this.field446 = this.field337.method388();
                            this.field410 = true;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 164) {
                            String var151 = this.field337.method395();
                            int var152 = this.field337.method388();
                            int var153 = this.field337.method406(41312);
                            if (var152 >= 1 && var152 <= 5) {
                                if (var151.equalsIgnoreCase("null")) {
                                    var151 = null;
                                }
                                this.field481[var152 - 1] = var151;
                                this.field482[var152 - 1] = var153 == 0;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 235) {
                            this.field410 = true;
                            int var154 = this.field337.method390();
                            class22 var155 = class22.method215(var154);
                            int var156 = this.field337.method390();
                            for (int var157 = 0; var157 < var156; ++var157) {
                                int var158 = this.field337.method406(41312);
                                if (var158 == 255) {
                                    var158 = this.field337.method422(159);
                                }
                                var155.field784[var157] = this.field337.method390();
                                var155.field797[var157] = var158;
                            }
                            for (int var159 = var156; var159 < var155.field784.length; ++var159) {
                                var155.field784[var159] = 0;
                                var155.field797[var159] = 0;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 75) {
                            this.field432 = this.field337.method388();
                            this.field431 = this.field337.method408(382);
                            for (int var160 = this.field431; var160 < this.field431 + 8; ++var160) {
                                for (int var161 = this.field432; var161 < this.field432 + 8; ++var161) {
                                    if (this.field574[this.field363][var160][var161] != null) {
                                        this.field574[this.field363][var160][var161] = null;
                                        this.method82(var160, var161);
                                    }
                                }
                            }
                            for (class54 var162 = (class54) this.field325.method206(); var162 != null; var162 = (class54) this.field325.method208(262)) {
                                if (var162.field1311 >= this.field431 && var162.field1311 < this.field431 + 8 && var162.field1312 >= this.field432 && var162.field1312 < this.field432 + 8 && this.field363 == var162.field1309) {
                                    var162.field1308 = 0;
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 224) {
                            this.method26(this.field453, -16194, this.field337);
                            this.field414 = false;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 221) {
                            int var163 = this.field337.method415(65);
                            class22.method215(var163).field844 = 3;
                            if (field353.field1020 == null) {
                                class22.method215(var163).field845 = (field353.field1022[11] << 5) + (field353.field1022[8] << 10) + (field353.field1022[0] << 15) + (field353.field1012[0] << 25) + (field353.field1012[4] << 20) + field353.field1022[1];
                            } else {
                                class22.method215(var163).field845 = (int) (field353.field1020.field680 + 305419896L);
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 38) {
                            this.field509 = false;
                            this.field474 = 1;
                            this.field494 = "";
                            this.field280 = true;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 176) {
                            for (int var164 = 0; var164 < this.field214.length; ++var164) {
                                if (this.field220[var164] != this.field214[var164]) {
                                    this.field214[var164] = this.field220[var164];
                                    this.method121(4, var164);
                                    this.field410 = true;
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 168) {
                            int var165 = this.field337.method416(-998);
                            int var166 = this.field337.method391();
                            class22 var167 = class22.method215(var165);
                            if (var167.field807 != var166 || var166 == -1) {
                                var167.field807 = var166;
                                var167.field821 = 0;
                                var167.field803 = 0;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 104) {
                            String var168 = this.field337.method395();
                            int var169 = this.field337.method414(6);
                            class22.method215(var169).field785 = var168;
                            int var10001 = this.field372[this.field429];
                            if (class22.method215(var169).field804 == var10001) {
                                this.field410 = true;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 72) {
                            int var170 = this.field337.method415(65);
                            this.method114(var170, 12281);
                            if (this.field579 != -1) {
                                this.method21(6, this.field579);
                                this.field579 = -1;
                                this.field410 = true;
                                this.field467 = true;
                            }
                            if (this.field293 != -1) {
                                this.method21(6, this.field293);
                                this.field293 = -1;
                                this.field235 = true;
                            }
                            if (this.field211 != -1) {
                                this.method21(6, this.field211);
                                this.field211 = -1;
                            }
                            if (this.field430 != -1) {
                                this.method21(6, this.field430);
                                this.field430 = -1;
                            }
                            if (this.field426 != var170) {
                                this.method21(6, this.field426);
                                this.field426 = var170;
                            }
                            this.field263 = false;
                            this.field280 = true;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 152) {
                            int var171 = this.field337.method415(65);
                            boolean var172 = this.field337.method388() == 1;
                            class22.method215(var171).field802 = var172;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 17) {
                            this.field431 = this.field337.method408(382);
                            this.field432 = this.field337.method408(382);
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 125) {
                            int var173 = this.field337.method414(6);
                            int var174 = this.field337.method415(65);
                            if (this.field426 != -1) {
                                this.method21(6, this.field426);
                                this.field426 = -1;
                                this.field280 = true;
                            }
                            if (this.field293 != -1) {
                                this.method21(6, this.field293);
                                this.field293 = -1;
                                this.field235 = true;
                            }
                            if (this.field211 != -1) {
                                this.method21(6, this.field211);
                                this.field211 = -1;
                            }
                            if (this.field430 != var174) {
                                this.method21(6, this.field430);
                                this.field430 = var174;
                            }
                            if (this.field579 != var173) {
                                this.method21(6, this.field579);
                                this.field579 = var173;
                            }
                            if (this.field474 != 0) {
                                this.field474 = 0;
                                this.field280 = true;
                            }
                            this.field410 = true;
                            this.field467 = true;
                            this.field263 = false;
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 226) {
                            int var175 = this.field337.method390();
                            int var176 = this.field337.method416(-998);
                            class22 var177 = class22.method215(var176);
                            if (var177 != null && var177.field840 == 0) {
                                if (var175 < 0) {
                                    var175 = 0;
                                }
                                if (var175 > var177.field772 - var177.field823) {
                                    var175 = var177.field772 - var177.field823;
                                }
                                var177.field835 = var175;
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 134) {
                            long var178 = this.field337.method394(false);
                            int var180 = this.field337.method393();
                            int var181 = this.field337.method388();
                            boolean var182 = false;
                            for (int var183 = 0; var183 < 100; ++var183) {
                                if (this.field141[var183] == var180) {
                                    var182 = true;
                                    break;
                                }
                            }
                            if (var181 <= 1) {
                                for (int var184 = 0; var184 < this.field256; ++var184) {
                                    if (this.field573[var184] == var178) {
                                        var182 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var182 && this.field411 == 0) {
                                try {
                                    this.field141[this.field427] = var180;
                                    this.field427 = (this.field427 + 1) % 100;
                                    String var185 = class7.method17(this.field337, this.field453 - 13, (byte) 14);
                                    if (var181 != 3) {
                                        var185 = class25.method240(false, var185);
                                    }
                                    if (var181 != 2 && var181 != 3) {
                                        if (var181 == 1) {
                                            this.method40("@cr1@" + class9.method172((byte) -32, class9.method169(false, var178)), 7, var185, this.field144);
                                        } else {
                                            this.method40(class9.method172((byte) -32, class9.method169(false, var178)), 3, var185, this.field144);
                                        }
                                    } else {
                                        this.method40("@cr2@" + class9.method172((byte) -32, class9.method169(false, var178)), 7, var185, this.field144);
                                    }
                                } catch (Exception var190) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field454 = -1;
                            return true;
                        }
                        if (this.field454 == 40) {
                            this.field468 = 0;
                            this.field454 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field454 + "," + this.field453 + " - " + this.field527 + "," + this.field528);
                        this.method67(0);
                        return true;
                    }
                    this.field245 = false;
                    for (int var8 = 0; var8 < 5; ++var8) {
                        this.field575[var8] = false;
                    }
                    this.field454 = -1;
                    return true;
                }
                this.method122(0, this.field454, this.field337);
                this.field454 = -1;
                return true;
            } catch (IOException var191) {
                this.method95(true);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field454 + "," + this.field527 + "," + this.field528 + " - " + this.field453 + "," + (field353.field1722[0] + this.field562) + "," + (field353.field1723[0] + this.field563) + " - ";
                for (int var189 = 0; var189 < this.field453 && var189 < 50; ++var189) {
                    var188 = var188 + this.field337.field1224[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method67(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LRSWRPCHR;ZI)V")
    private final void method164(class50 arg0, boolean arg1, int arg2) {
        arg0.method398(-313);
        int var4 = arg0.method399(0, 1);
        if (arg1) {
            if (var4 != 0) {
                int var5 = arg0.method399(0, 2);
                if (var5 == 0) {
                    this.field394[this.field393++] = this.field389;
                } else if (var5 == 1) {
                    int var6 = arg0.method399(0, 3);
                    field353.method599(false, 0, var6);
                    int var7 = arg0.method399(0, 1);
                    if (var7 == 1) {
                        this.field394[this.field393++] = this.field389;
                    }
                } else if (var5 == 2) {
                    int var8 = arg0.method399(0, 3);
                    field353.method599(true, 0, var8);
                    int var9 = arg0.method399(0, 3);
                    field353.method599(true, 0, var9);
                    int var10 = arg0.method399(0, 1);
                    if (var10 == 1) {
                        this.field394[this.field393++] = this.field389;
                    }
                } else if (var5 == 3) {
                    int var11 = arg0.method399(0, 7);
                    this.field363 = arg0.method399(0, 2);
                    int var12 = arg0.method399(0, 1);
                    int var13 = arg0.method399(0, 1);
                    if (var13 == 1) {
                        this.field394[this.field393++] = this.field389;
                    }
                    int var14 = arg0.method399(0, 7);
                    field353.method600(var12 == 1, var11, var14, -40589);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
    public final boolean method165(int arg0, byte arg1, int arg2) {
        boolean var4 = false;
        class22 var5 = class22.method215(arg2);
        for (int var6 = 0; var6 < var5.field830.length && var5.field830[var6] != -1; ++var6) {
            class22 var7 = class22.method215(var5.field830[var6]);
            if (var7.field840 == 0) {
                var4 |= this.method165(arg0, (byte) 5, var7.field825);
            }
            if (var7.field840 == 6 && (var7.field807 != -1 || var7.field808 != -1)) {
                boolean var8 = this.method156(0, var7);
                int var9;
                if (var8) {
                    var9 = var7.field808;
                } else {
                    var9 = var7.field807;
                }
                if (var9 != -1) {
                    class33 var10 = class33.field963[var9];
                    var7.field803 += arg0;
                    while (var7.field803 > var10.method301(var7.field821, this.field342)) {
                        var7.field803 -= var10.method301(var7.field821, this.field342) + 1;
                        ++var7.field821;
                        if (var7.field821 >= var10.field964) {
                            var7.field821 -= var10.field968;
                            if (var7.field821 < 0 || var7.field821 >= var10.field964) {
                                var7.field821 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field840 == 6 && var7.field793 != 0) {
                int var11 = var7.field793 >> 16;
                int var12 = var7.field793 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field800 = var7.field800 + var13 & 2047;
                var7.field801 = var7.field801 + var14 & 2047;
                var4 = true;
            }
        }
        if (arg1 == 5) {
            boolean var15 = false;
        } else {
            this.field357 = !this.field357;
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method166(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method167(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field472 = "";
                this.field473 = "Connecting to server...";
                this.method160(false, true);
            }
            this.field123 = new class41(this, 0, this.method111(field515 + 43594));
            long var4 = class9.method168(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field501.field1225 = 0;
            this.field501.method378(14);
            this.field501.method378(var6);
            this.field123.method326(0, 2, this.field501.field1224, this.field362);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field123.method323();
            }
            int var8 = this.field123.method323();
            int var9 = var8;
            if (var8 == 0) {
                this.field123.method325(this.field337.field1224, 0, 8);
                this.field337.field1225 = 0;
                this.field343 = this.field337.method394(false);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field343 >> 32), (int) this.field343 };
                this.field501.field1225 = 0;
                this.field501.method378(10);
                this.field501.method382(var10[0]);
                this.field501.method382(var10[1]);
                this.field501.method382(var10[2]);
                this.field501.method382(var10[3]);
                this.field501.method382(signlink.uid);
                this.field501.method385(arg0);
                this.field501.method385(arg1);
                this.field501.method403(field369, 0, field142);
                this.field313.field1225 = 0;
                if (arg2) {
                    this.field313.method378(18);
                } else {
                    this.field313.method378(16);
                }
                this.field313.method378(this.field501.field1225 + 36 + 1 + 1 + 2);
                this.field313.method378(255);
                this.field313.method379(360);
                this.field313.method378(field517 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field313.method382(this.field315[var11]);
                }
                this.field313.method386(this.field501.field1225, this.field501.field1224, (byte) -83, 0);
                this.field501.field1229 = new class37(var10, false);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field483 = new class37(var10, false);
                this.field123.method326(0, this.field313.field1225, this.field313.field1224, this.field362);
                var8 = this.field123.method323();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method167(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field580 = this.field123.method323();
                field355 = this.field123.method323() == 1;
                this.field121 = 0L;
                this.field522 = 0;
                this.field247.field1034 = 0;
                super.field939 = true;
                this.field232 = true;
                this.field269 = true;
                this.field501.field1225 = 0;
                this.field337.field1225 = 0;
                this.field454 = -1;
                this.field526 = -1;
                this.field527 = -1;
                this.field528 = -1;
                this.field453 = 0;
                this.field455 = 0;
                this.field186 = 0;
                this.field457 = 0;
                this.field173 = 0;
                this.field114 = 0;
                this.field502 = false;
                super.field940 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field251[var13] = null;
                }
                this.field405 = 0;
                this.field380 = 0;
                this.field443 = 0;
                this.field424 = 0;
                this.field596 = (int) (Math.random() * 100.0D) - 50;
                this.field422 = (int) (Math.random() * 110.0D) - 55;
                this.field544 = (int) (Math.random() * 80.0D) - 40;
                this.field168 = (int) (Math.random() * 120.0D) - 60;
                this.field462 = (int) (Math.random() * 30.0D) - 20;
                this.field334 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field420 = 0;
                this.field425 = -1;
                this.field468 = 0;
                this.field469 = 0;
                this.field391 = 0;
                this.field273 = 0;
                for (int var14 = 0; var14 < this.field388; ++var14) {
                    this.field390[var14] = null;
                    this.field395[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field272[var15] = null;
                }
                field353 = this.field390[this.field389] = new class36();
                this.field348.method210();
                this.field478.method210();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field574[var16][var17][var18] = null;
                        }
                    }
                }
                this.field325 = new class17(false);
                this.field446 = 0;
                this.field445 = 0;
                this.method21(6, this.field599);
                this.field599 = -1;
                this.method21(6, this.field426);
                this.field426 = -1;
                this.method21(6, this.field430);
                this.field430 = -1;
                this.method21(6, this.field293);
                this.field293 = -1;
                this.method21(6, this.field211);
                this.field211 = -1;
                this.method21(6, this.field579);
                this.field579 = -1;
                this.method21(6, this.field314);
                this.field314 = -1;
                this.field263 = false;
                this.field429 = 3;
                this.field474 = 0;
                this.field502 = false;
                this.field509 = false;
                this.field177 = null;
                this.field239 = 0;
                this.field602 = -1;
                this.field495 = true;
                this.method158(false);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field129[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field481[var20] = null;
                    this.field482[var20] = false;
                }
                field316 = 0;
                field182 = 0;
                field147 = 0;
                field344 = 0;
                field476 = 0;
                field137 = 0;
                field332 = 0;
                field460 = 0;
                field326 = 0;
                field459 = 0;
                this.method131(-873);
            } else if (var8 == 3) {
                this.field472 = "";
                this.field473 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field472 = "Your account has been disabled.";
                this.field473 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field472 = "Your account is already logged in.";
                this.field473 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field472 = "RuneScape has been updated!";
                this.field473 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field472 = "This world is full.";
                this.field473 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field472 = "Unable to connect.";
                this.field473 = "Login server offline.";
            } else if (var8 == 9) {
                this.field472 = "Login limit exceeded.";
                this.field473 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field472 = "Unable to connect.";
                this.field473 = "Bad session id.";
            } else if (var8 == 11) {
                this.field472 = "Login server rejected session.";
                this.field473 = "Please try again.";
            } else if (var8 == 12) {
                this.field472 = "You need a members account to login to this world.";
                this.field473 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field472 = "Could not complete login.";
                this.field473 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field472 = "The server is being updated.";
                this.field473 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field269 = true;
                this.field501.field1225 = 0;
                this.field337.field1225 = 0;
                this.field454 = -1;
                this.field526 = -1;
                this.field527 = -1;
                this.field528 = -1;
                this.field453 = 0;
                this.field455 = 0;
                this.field186 = 0;
                this.field114 = 0;
                this.field502 = false;
                this.field397 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field472 = "Login attempts exceeded.";
                this.field473 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field472 = "You are standing in a members-only area.";
                this.field473 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field472 = "Invalid loginserver requested";
                this.field473 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field472 = "Malformed login packet.";
                    this.field473 = "Please try again.";
                } else if (var8 == 23) {
                    this.field472 = "This computers address has been blocked";
                    this.field473 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field224 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field224;
                            this.method167(arg0, arg1, arg2);
                        } else {
                            this.field472 = "No response from loginserver";
                            this.field473 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field472 = "No response from server";
                        this.field473 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field472 = "Unexpected server response";
                    this.field473 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field123.method323();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field472 = "You have only just left another world";
                    this.field473 = "Your profile will be transferred in: " + var26;
                    this.method160(false, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method167(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field472 = "";
            this.field473 = "Error connecting to server.";
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field370[var1] = var0 - 1;
            var0 += var0;
        }
        field491 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field491[var3] = var2 / 4;
        }
        field514 = 10;
        field516 = true;
        field530 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
