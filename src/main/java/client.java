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
public class client extends class36 {

    @OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
    private boolean field146 = false;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "Z")
    private volatile boolean field147 = false;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[B")
    private byte[] field148 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Z")
    private boolean field149 = false;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[LEFVUNBHT;")
    private class16[] field157 = new class16[8];

    @OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
    private int[] field158 = new int[200];

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
    private boolean field160 = false;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
    private boolean field162 = true;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[J")
    private long[] field165 = new long[200];

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "B")
    private byte field166 = -47;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private int field178 = -1;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field179 = 537;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Ljava/lang/String;")
    private String field180 = "";

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Ljava/lang/String;")
    private String field181 = "";

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "LDMMTBJKZ;")
    private class12 field185 = new class12((byte) 5);

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "[I")
    private int[] field187 = new int[500];

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
    private int[] field188 = new int[500];

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
    private int[] field189 = new int[500];

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
    private int[] field190 = new int[500];

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
    public int[] field192 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
    private int[] field193 = new int[50];

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
    private boolean field194 = false;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
    private int[] field195 = new int[151];

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    private int field198 = 2;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    private int field199 = 2301979;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    private int field201 = 2;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field204 = -1;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "Ljava/lang/String;")
    private String field212 = "";

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
    private int field218 = 964;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
    private boolean field220 = false;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "Z")
    private boolean field221 = false;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "[Ljava/lang/String;")
    private String[] field222 = new String[5];

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "[Z")
    private boolean[] field223 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "[Ljava/lang/String;")
    private String[] field227 = new String[500];

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "[[I")
    private int[][] field234 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
    private boolean field235 = false;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    private int field236 = -1;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
    private int[] field237 = new int[7];

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
    private int[] field246 = new int[5];

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field249 = 2048;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private int field250 = 2047;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "[LBPHJJPRI;")
    private class7[] field251 = new class7[this.field249];

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
    public int[] field253 = new int[this.field249];

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
    private int[] field255 = new int[this.field249];

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "[LEYMNCFMK;")
    private class18[] field256 = new class18[this.field249];

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
    private int[] field262 = new int[33];

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private int field263 = -1;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
    private int field264 = 5063219;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "[LEFVUNBHT;")
    private class16[] field268 = new class16[1000];

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
    private boolean field272 = false;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int field273 = 39858;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "Z")
    private boolean field275 = true;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "[[I")
    private int[][] field276 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "Ljava/lang/String;")
    private String field279 = "";

    @OriginalMember(owner = "client!client", name = "od", descriptor = "LEYMNCFMK;")
    private class18 field280 = new class18(new byte[5000], 0);

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "[LKLQFDPHO;")
    private class30[] field281 = new class30[16384];

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
    public int[] field283 = new int[16384];

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "[[[I")
    private int[][][] field286 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "Z")
    private boolean field297 = false;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private int field300 = 50;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
    private int[] field301 = new int[this.field300];

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
    private int[] field302 = new int[this.field300];

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
    private int[] field303 = new int[this.field300];

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
    private int[] field304 = new int[this.field300];

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
    private int[] field305 = new int[this.field300];

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
    private int[] field306 = new int[this.field300];

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
    private int[] field307 = new int[this.field300];

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "[Ljava/lang/String;")
    private String[] field308 = new String[this.field300];

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "[LMRCVLIXG;")
    private class38[] field315 = new class38[13];

    @OriginalMember(owner = "client!client", name = "be", descriptor = "LEYMNCFMK;")
    private class18 field319 = class18.method227(5, 1);

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "[I")
    private int[] field320 = new int[5];

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field338 = -1;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "B")
    private byte field340 = 39;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
    private boolean field342 = false;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "[I")
    private int[] field343 = new int[33];

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
    public int[] field344 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
    private final int field346 = 100;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
    private int[] field347 = new int[100];

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
    private boolean field352 = false;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
    private int[] field360 = new int[100];

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "[Ljava/lang/String;")
    private String[] field361 = new String[100];

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "[Ljava/lang/String;")
    private String[] field362 = new String[100];

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field363 = 6;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private int field369 = -1;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field372 = -391;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "[LEFVUNBHT;")
    private class16[] field376 = new class16[32];

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field378 = 7759444;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
    private int field380 = 510;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "[I")
    private int[] field381 = new int[151];

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
    private int field382 = 693;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "Z")
    private boolean field384 = true;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/lang/String;")
    private String field388 = "";

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field389 = 3;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "[[I")
    private int[][] field390 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "[J")
    private long[] field392 = new long[100];

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "Ljava/lang/String;")
    private String field395 = "";

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
    private int[] field396 = new int[class33.field1056];

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
    private int[] field397 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
    private int[] field398 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
    private boolean field399 = false;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
    private boolean field402 = false;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field406 = -2948;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "[LEFVUNBHT;")
    private class16[] field407 = new class16[32];

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "[LEFVUNBHT;")
    private class16[] field409 = new class16[20];

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "[LENNRILHF;")
    public class17[] field415 = new class17[5];

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "Z")
    private boolean field416 = false;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
    private int[] field417 = new int[5];

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int field423 = 78;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field424 = -29787;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field426 = 6;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "Ljava/lang/String;")
    private String field432 = "";

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "[Ljava/lang/String;")
    private String[] field434 = new String[100];

    @OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
    private int[] field435 = new int[100];

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
    private boolean field437 = false;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int field438 = -1;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "Z")
    public boolean field439 = true;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
    private boolean field440 = false;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
    private boolean field441 = false;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "B")
    private byte field443 = 47;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private int field449 = -1;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field455 = -1;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private int field456 = 128;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
    private boolean field461 = true;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "B")
    private byte field469 = -47;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
    private boolean field470 = true;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
    private int field473 = 2;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private int field476 = -1;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private int field477 = -1;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
    private int field478 = -903;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
    private int[] field479 = new int[class33.field1056];

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
    private int[] field480 = new int[2000];

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
    private int field482 = 3353893;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "LEYMNCFMK;")
    private class18 field487 = class18.method227(5, 1);

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "B")
    private byte field488 = 88;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
    private final int[] field497 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "[I")
    private int[] field498 = new int[50];

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
    private int[] field500 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
    private int[] field501 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
    private boolean field511 = false;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
    private boolean field512 = false;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "LEYMNCFMK;")
    private class18 field519 = class18.method227(5, 1);

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "[Ljava/lang/String;")
    private String[] field520 = new String[200];

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
    public boolean field521 = false;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
    private int field527 = 1;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private int field530 = -1;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
    private int[] field531 = new int[9];

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "LDMMTBJKZ;")
    private class12 field532 = new class12((byte) 5);

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int field533 = 6;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "[LEFVUNBHT;")
    private class16[] field536 = new class16[100];

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
    private volatile boolean field539 = false;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
    private volatile boolean field540 = false;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "Z")
    private boolean field547 = false;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
    private boolean field548 = false;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field550 = -21200;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
    private int[] field551 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "[Z")
    private boolean[] field557 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "LDMMTBJKZ;")
    private class12 field558 = new class12((byte) 5);

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
    private int field560 = 6;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int field567 = 46534;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field569 = 1;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "[LEFVUNBHT;")
    private class16[] field570 = new class16[32];

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field571 = -236;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "[[[LDMMTBJKZ;")
    private class12[][][] field572 = new class12[4][104][104];

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int field573 = -1;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
    private boolean field577 = false;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
    private int field578 = 520;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private int field579 = -1;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "LVTUPBFSN;")
    private class63 field582 = new class63();

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field583 = 856;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
    public int[] field585 = new int[1000];

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
    private int[] field586 = new int[5];

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "[I")
    private int[] field587 = new int[5];

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
    private boolean field588 = false;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "Z")
    private boolean field589 = false;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "B")
    private byte field590 = 4;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
    private boolean field591 = true;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
    private boolean field592 = false;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "Ljava/lang/String;")
    private String field593 = "";

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "Ljava/lang/String;")
    private String field594 = "";

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
    private int[] field595 = new int[50];

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private int field601 = -1;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field606 = -1;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field607 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
    private int[] field611 = new int[256];

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
    private int field612 = 7;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
    private int[] field619 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "[LZGDLGUZR;")
    private class72[] field620 = new class72[4];

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "[LMRCVLIXG;")
    private class38[] field622 = new class38[100];

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "[I")
    private int[] field623 = new int[class33.field1056];

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    private int field627 = 2;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "Ljava/lang/String;")
    private String field633 = "";

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[LMRCVLIXG;")
    private class38[] field636 = new class38[2];

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
    public static int[] field156 = new int[32];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[[I")
    public static final int[][] field164;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private static int field182;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field196;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
    private static int field208;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
    private static boolean field210;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
    private static int field245;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
    private static int[] field258;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "B")
    private static byte field355;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "Ljava/lang/String;")
    private static String field442;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field559;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "[I")
    public static final int[] field632;

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private static int field183;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private static int field214;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private static int field217;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private static int field266;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private static int field287;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private static int field337;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private static int field367;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private static int field374;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private static int field375;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
    private static int field400;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    private static int field408;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private static int field420;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private static int field427;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private static int field513;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
    private static int field574;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
    private static int field597;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private static int field605;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private static int field608;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private static int field634;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "J")
    private long field219;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "J")
    public long field261;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "J")
    private long field373;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "J")
    private long field481;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "J")
    private long field537;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "LEFVUNBHT;")
    private class16 field228;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "LEFVUNBHT;")
    private class16 field229;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "LEFVUNBHT;")
    private class16 field230;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "LEFVUNBHT;")
    private class16 field231;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "LEFVUNBHT;")
    private class16 field232;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "LEFVUNBHT;")
    private class16 field271;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "LEFVUNBHT;")
    private class16 field341;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "LEFVUNBHT;")
    private class16 field483;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "LEFVUNBHT;")
    private class16 field494;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "LEFVUNBHT;")
    private class16 field495;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "LEFVUNBHT;")
    private class16 field545;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "LEFVUNBHT;")
    private class16 field575;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "LEFVUNBHT;")
    private class16 field576;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "LEFVUNBHT;")
    private class16 field609;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "LEFVUNBHT;")
    private class16 field610;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "LFKUDHMAZ;")
    private class19 field285;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "LFTIYCDAU;")
    private class20 field450;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "LFTIYCDAU;")
    private class20 field451;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "LFTIYCDAU;")
    private class20 field452;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "LFTIYCDAU;")
    private class20 field453;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "LHBJEXSJX;")
    private class24 field326;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "LMRCVLIXG;")
    private class38 field224;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "LMRCVLIXG;")
    private class38 field225;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "LMRCVLIXG;")
    private class38 field226;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "LMRCVLIXG;")
    private class38 field321;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "LMRCVLIXG;")
    private class38 field322;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "LMRCVLIXG;")
    private class38 field323;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "LMRCVLIXG;")
    private class38 field324;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "LMRCVLIXG;")
    private class38 field325;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "LMRCVLIXG;")
    private class38 field418;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "LMRCVLIXG;")
    private class38 field419;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "LMRCVLIXG;")
    private class38 field428;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "LMRCVLIXG;")
    private class38 field429;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "LMRCVLIXG;")
    private class38 field484;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "LMRCVLIXG;")
    private class38 field485;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "LMRCVLIXG;")
    private class38 field486;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "LMRCVLIXG;")
    private class38 field613;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "LMRCVLIXG;")
    private class38 field614;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "LMRCVLIXG;")
    private class38 field615;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "LMRCVLIXG;")
    private class38 field616;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "LMRCVLIXG;")
    private class38 field617;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "LOUOWXDXZ;")
    public class42 field339;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "LSAMFSOGS;")
    private class50 field525;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "LTXNIKMNQ;")
    private class57 field176;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "LXQFIPMSR;")
    private class66 field345;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "LYZGYDKDO;")
    private class70 field167;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "LYZGYDKDO;")
    private class70 field168;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "LYZGYDKDO;")
    private class70 field169;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "LYZGYDKDO;")
    private class70 field170;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "LYZGYDKDO;")
    private class70 field171;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "LYZGYDKDO;")
    private class70 field172;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "LYZGYDKDO;")
    private class70 field173;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "LYZGYDKDO;")
    private class70 field174;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "LYZGYDKDO;")
    private class70 field175;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "LYZGYDKDO;")
    private class70 field327;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "LYZGYDKDO;")
    private class70 field328;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "LYZGYDKDO;")
    private class70 field329;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "LYZGYDKDO;")
    private class70 field330;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "LYZGYDKDO;")
    private class70 field331;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "LYZGYDKDO;")
    private class70 field332;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "LYZGYDKDO;")
    private class70 field333;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "LYZGYDKDO;")
    private class70 field334;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "LYZGYDKDO;")
    private class70 field335;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "LYZGYDKDO;")
    private class70 field553;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "LYZGYDKDO;")
    private class70 field554;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "LYZGYDKDO;")
    private class70 field555;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "LYZGYDKDO;")
    private class70 field556;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "LYZGYDKDO;")
    private class70 field624;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "LYZGYDKDO;")
    private class70 field625;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "LYZGYDKDO;")
    private class70 field626;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "LBPHJJPRI;")
    public static class7 field238;

    @OriginalMember(owner = "client!client", name = "H", descriptor = "Ljava/lang/String;")
    private String field143;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Ljava/lang/String;")
    public String field155;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "Ljava/lang/String;")
    private String field393;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "Ljava/lang/String;")
    public String field631;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "Ljava/net/Socket;")
    private Socket field277;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "Z")
    private static boolean field211;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "Z")
    private static boolean field394;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
    public static boolean field523;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "Z")
    public static boolean field542;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
    private int[] field290;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
    private int[] field291;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
    private int[] field292;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
    private int[] field293;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
    private int[] field348;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
    private int[] field349;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
    private int[] field350;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
    private int[] field351;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
    private int[] field385;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "[I")
    private int[] field386;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
    private int[] field387;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
    private int[] field474;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
    private int[] field475;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
    private int[] field599;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
    private int[] field600;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[LMRCVLIXG;")
    private class38[] field267;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "[[B")
    private byte[][] field184;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "[[B")
    private byte[][] field336;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "[[[B")
    private byte[][][] field191;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "[[[I")
    private int[][][] field403;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;BI)LHBJEXSJX;")
    public final class24 method46(int arg0, String arg1, int arg2, String arg3, byte arg4, int arg5) {
        if (arg4 == 1) {
            boolean var7 = false;
        } else {
            this.field445 = -1;
        }
        byte[] var8 = null;
        int var9 = 5;
        try {
            if (this.field415[0] != null) {
                var8 = this.field415[0].method223((byte) 5, arg2);
            }
        } catch (Exception var31) {
        }
        if (var8 != null) {
            this.field607.reset();
            this.field607.update(var8);
            int var10 = (int) this.field607.getValue();
            if (arg0 != var10) {
                var8 = null;
            }
        }
        if (var8 != null) {
            return new class24(true, var8);
        } else {
            int var12 = 0;
            while (var8 == null) {
                String var13 = "Unknown error";
                this.method98(arg5, "Requesting " + arg3, (byte) 1);
                Object var14 = null;
                try {
                    int var15 = 0;
                    DataInputStream var16 = this.method50(arg1 + arg0);
                    byte[] var17 = new byte[6];
                    var16.readFully(var17, 0, 6);
                    class18 var18 = new class18(var17, 0);
                    var18.field794 = 3;
                    int var19 = var18.method243() + 6;
                    int var20 = 6;
                    var8 = new byte[var19];
                    for (int var21 = 0; var21 < 6; ++var21) {
                        var8[var21] = var17[var21];
                    }
                    while (var20 < var19) {
                        int var22 = var19 - var20;
                        if (var22 > 1000) {
                            var22 = 1000;
                        }
                        int var23 = var16.read(var8, var20, var22);
                        if (var23 < 0) {
                            (new StringBuffer("Length error: ")).append(var20).append("/").append(var19).toString();
                            throw new IOException("EOF");
                        }
                        var20 += var23;
                        int var24 = var20 * 100 / var19;
                        if (var15 != var24) {
                            this.method98(arg5, "Loading " + arg3 + " - " + var24 + "%", (byte) 1);
                        }
                        var15 = var24;
                    }
                    var16.close();
                    try {
                        if (this.field415[0] != null) {
                            this.field415[0].method224(var8.length, -78, arg2, var8);
                        }
                    } catch (Exception var30) {
                        this.field415[0] = null;
                    }
                    if (var8 != null) {
                        this.field607.reset();
                        this.field607.update(var8);
                        int var25 = (int) this.field607.getValue();
                        if (arg0 != var25) {
                            var8 = null;
                            ++var12;
                            var13 = "Checksum error: " + var25;
                        }
                    }
                } catch (IOException var32) {
                    if (var13.equals("Unknown error")) {
                        var13 = "Connection error";
                    }
                    var8 = null;
                } catch (NullPointerException var33) {
                    var13 = "Null error";
                    var8 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException var34) {
                    var13 = "Bounds error";
                    var8 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (Exception var35) {
                    var13 = "Unexpected error";
                    var8 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var8 == null) {
                    for (int var27 = var9; var27 > 0; --var27) {
                        if (var12 >= 3) {
                            this.method98(arg5, "Game updated - please reload page", (byte) 1);
                            var27 = 10;
                        } else {
                            this.method98(arg5, var13 + " - Retrying in " + var27, (byte) 1);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var29) {
                        }
                    }
                    var9 *= 2;
                    if (var9 > 60) {
                        var9 = 60;
                    }
                    this.field512 = !this.field512;
                }
            }
            return new class24(true, var8);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method47(boolean arg0) {
        if (arg0) {
            this.field270 = this.field176.method524();
        }
        this.method73(0);
        if (this.field467 == 1) {
            this.field157[this.field466 / 100].method215(1, this.field464 - 8 - 4, this.field465 - 8 - 4);
        }
        if (this.field467 == 2) {
            this.field157[this.field466 / 100 + 4].method215(1, this.field464 - 8 - 4, this.field465 - 8 - 4);
        }
        if (this.field449 != -1) {
            this.method109(this.field159, this.field449, 0);
            this.method125(0, 0, 0, class63.method544(this.field449), 726);
        }
        if (this.field455 != -1) {
            this.method109(this.field159, this.field455, 0);
            this.method125(0, 0, 0, class63.method544(this.field455), 726);
        }
        this.method148(false);
        if (!this.field589) {
            this.method138(544);
            this.method140(86);
        } else if (this.field502 == 0) {
            this.method49((byte) 114);
        }
        if (this.field317 == 1) {
            this.field483.method215(1, 472, 296);
        }
        if (field523) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1100 < 30 && field211) {
                var4 = 16711680;
            }
            if (super.field1100 < 20 && !field211) {
                var4 = 16711680;
            }
            this.field451.method330("Fps:" + super.field1100, 207, var3, var2, var4);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field211) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field211) {
                int var9 = 16711680;
            }
            this.field451.method330("Mem:" + var6 + "k", 207, var13, var2, 16776960);
            var13 += 15;
        }
        if (this.field496 != 0) {
            int var10 = this.field496 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field451.method335(4, 329, "System update in: " + var11 + ":0" + var12, 47, 16776960);
            } else {
                this.field451.method335(4, 329, "System update in: " + var11 + ":" + var12, 47, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method48(int arg0) {
        int var2 = 5;
        this.field531[8] = 0;
        if (arg0 != 0) {
            this.field577 = !this.field577;
        }
        int var3 = 0;
        while (this.field531[8] == 0) {
            String var4 = "Unknown problem";
            this.method98(20, "Connecting to web server", (byte) 1);
            try {
                DataInputStream var5 = this.method50("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 371);
                class18 var6 = new class18(new byte[40], 0);
                var5.readFully(var6.field793, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field531[var7] = var6.method244();
                }
                int var8 = var6.method244();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field531[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field531[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field531[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field531[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field531[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field531[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method98(10, "Game updated - please reload page", (byte) 1);
                        var11 = 10;
                    } else {
                        this.method98(10, var4 + " - Will retry in " + var11 + " secs.", (byte) 1);
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
                this.field512 = !this.field512;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method49(byte arg0) {
        int var2 = this.field503;
        int var3 = this.field504;
        int var4 = this.field505;
        int var5 = this.field506;
        if (arg0 == 114) {
            int var6 = 6116423;
            class5.method29(var2, 35224, var4, var6, var3, var5);
            class5.method29(var2 + 1, 35224, var4 - 2, 0, var3 + 1, 16);
            class5.method30(var4 - 2, 0, var2 + 1, -41001, var5 - 19, var3 + 18);
            this.field452.method335(var2 + 3, var3 + 14, "Choose Option", 47, var6);
            int var7 = super.field1112;
            int var8 = super.field1113;
            if (this.field502 == 0) {
                var7 -= 4;
                var8 -= 4;
            }
            if (this.field502 == 1) {
                var7 -= 553;
                var8 -= 205;
            }
            if (this.field502 == 2) {
                var7 -= 17;
                var8 -= 357;
            }
            for (int var9 = 0; var9 < this.field546; ++var9) {
                int var10 = (this.field546 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field452.method339(true, this.field227[var9], var10, var11, var2 + 3, -48148);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method50(String arg0) throws IOException {
        if (!this.field512) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field277 != null) {
                try {
                    this.field277.close();
                } catch (Exception var4) {
                }
                this.field277 = null;
            }
            this.field277 = this.method134(43595);
            this.field277.setSoTimeout(10000);
            InputStream var2 = this.field277.getInputStream();
            OutputStream var3 = this.field277.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLVTUPBFSN;IIIIII)V")
    public final void method51(int arg0, byte arg1, class63 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field149) {
            this.field421 = 32;
        } else {
            this.field421 = 0;
        }
        this.field149 = false;
        if (arg1 != 76) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (arg4 >= arg7 && arg4 < arg7 + 16 && arg3 >= arg0 && arg3 < arg0 + 16) {
            arg2.field1533 -= this.field618 * 4;
            if (arg5 == 1) {
                this.field352 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field221 = true;
            }
        } else if (arg4 >= arg7 && arg4 < arg7 + 16 && arg3 >= arg0 + arg8 - 16 && arg3 < arg0 + arg8) {
            arg2.field1533 += this.field618 * 4;
            if (arg5 == 1) {
                this.field352 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field221 = true;
            }
        } else if (arg4 >= arg7 - this.field421 && arg4 < arg7 + 16 + this.field421 && arg3 >= arg0 + 16 && arg3 < arg0 + arg8 - 16 && this.field618 > 0) {
            int var11 = (arg8 - 32) * arg8 / arg6;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg3 - arg0 - 16 - var11 / 2;
            int var13 = arg8 - 32 - var11;
            arg2.field1533 = (arg6 - arg8) * var12 / var13;
            if (arg5 == 1) {
                this.field352 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field221 = true;
            }
            this.field149 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIILBPHJJPRI;)V")
    public final void method52(byte arg0, int arg1, int arg2, int arg3, class7 arg4) {
        if (arg0 != -45) {
            this.field445 = this.field487.method239();
        }
        if (field238 != arg4) {
            if (this.field546 < 400) {
                String var6;
                if (arg4.field77 == 0) {
                    var6 = arg4.field101 + method187(arg4.field95, field238.field95, (byte) 3) + " (level-" + arg4.field95 + ")";
                } else {
                    var6 = arg4.field101 + " (skill-" + arg4.field77 + ")";
                }
                if (this.field151 == 1) {
                    this.field227[this.field546] = "Use " + this.field155 + " with @whi@" + var6;
                    this.field189[this.field546] = 149;
                    this.field190[this.field546] = arg2;
                    this.field187[this.field546] = arg3;
                    this.field188[this.field546] = arg1;
                    ++this.field546;
                } else if (this.field628 == 1) {
                    if ((this.field630 & 8) == 8) {
                        this.field227[this.field546] = this.field631 + " @whi@" + var6;
                        this.field189[this.field546] = 959;
                        this.field190[this.field546] = arg2;
                        this.field187[this.field546] = arg3;
                        this.field188[this.field546] = arg1;
                        ++this.field546;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field222[var7] != null) {
                            this.field227[this.field546] = this.field222[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field222[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field95 > field238.field95) {
                                    var9 = 2000;
                                }
                                if (field238.field100 != 0 && arg4.field100 != 0) {
                                    if (field238.field100 == arg4.field100) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field223[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field189[this.field546] = var9 + 564;
                            }
                            if (var7 == 1) {
                                this.field189[this.field546] = var9 + 734;
                            }
                            if (var7 == 2) {
                                this.field189[this.field546] = var9 + 370;
                            }
                            if (var7 == 3) {
                                this.field189[this.field546] = var9 + 170;
                            }
                            if (var7 == 4) {
                                this.field189[this.field546] = var9 + 248;
                            }
                            this.field190[this.field546] = arg2;
                            this.field187[this.field546] = arg3;
                            this.field188[this.field546] = arg1;
                            ++this.field546;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field546; ++var8) {
                    if (this.field189[var8] == 842) {
                        this.field227[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method53(byte arg0) {
        this.field539 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field147) {
                ++this.field463;
                this.method102(0);
                this.method102(0);
                this.method164(32552);
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
        this.field539 = false;
        if (arg0 != 2) {
            this.field577 = !this.field577;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method54(boolean arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            if (!arg0) {
                String[] var4 = new String[100];
                int var5 = 0;
                while (true) {
                    int var6 = var3.indexOf(" ");
                    if (var6 == -1) {
                        String var8 = var3.trim();
                        if (var8.length() > 0) {
                            var4[var5++] = var8.toLowerCase();
                        }
                        this.field433 = 0;
                        label51: for (int var9 = 0; var9 < class31.field1041; ++var9) {
                            class31 var10 = class31.method376(var9);
                            if (var10.field1022 == -1 && var10.field1009 != null) {
                                String var11 = var10.field1009.toLowerCase();
                                for (int var12 = 0; var12 < var5; ++var12) {
                                    if (var11.indexOf(var4[var12]) == -1) {
                                        continue label51;
                                    }
                                }
                                this.field434[this.field433] = var11;
                                this.field435[this.field433] = var9;
                                ++this.field433;
                                if (this.field433 >= this.field434.length) {
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
            this.field433 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBIII)V")
    private final void method55(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 == 3) {
            boolean var9 = false;
        } else {
            this.field445 = -1;
        }
        if (arg3 >= 1 && arg7 >= 1 && arg3 <= 102 && arg7 <= 102) {
            if (field211 && this.field274 != arg0) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg2 == 0) {
                var10 = this.field285.method305(arg0, arg3, arg7);
            }
            if (arg2 == 1) {
                var10 = this.field285.method306(-46323, arg7, arg3, arg0);
            }
            if (arg2 == 2) {
                var10 = this.field285.method307(arg0, arg3, arg7);
            }
            if (arg2 == 3) {
                var10 = this.field285.method308(arg0, arg3, arg7);
            }
            if (var10 != 0) {
                int var14 = this.field285.method309(arg0, arg3, arg7, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg2 == 0) {
                    this.field285.method296(arg3, arg7, arg0, 0);
                    class64 var18 = class64.method548(var15);
                    if (var18.field1617) {
                        this.field620[arg0].method598(arg7, var16, var18.field1624, (byte) 8, arg3, var17);
                    }
                }
                if (arg2 == 1) {
                    this.field285.method297(arg3, arg0, this.field162, arg7);
                }
                if (arg2 == 2) {
                    this.field285.method298(arg7, arg0, arg3, 0);
                    class64 var19 = class64.method548(var15);
                    if (var19.field1603 + arg3 > 103 || var19.field1603 + arg7 > 103 || var19.field1613 + arg3 > 103 || var19.field1613 + arg7 > 103) {
                        return;
                    }
                    if (var19.field1617) {
                        this.field620[arg0].method599(var19.field1624, var19.field1613, var17, arg3, var19.field1603, arg7, 886);
                    }
                }
                if (arg2 == 3) {
                    this.field285.method299(-137, arg0, arg7, arg3);
                    class64 var20 = class64.method548(var15);
                    if (var20.field1617 && var20.field1601) {
                        this.field620[arg0].method601(0, arg7, arg3);
                    }
                }
            }
            if (arg1 >= 0) {
                int var21 = arg0;
                if (arg0 < 3 && (this.field191[1][arg3][arg7] & 2) == 2) {
                    var21 = arg0 + 1;
                }
                class46.method468(this.field403, this.field285, arg1, var21, arg5, false, this.field620[arg0], arg7, arg3, arg0, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public void method56(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field463);
        if (this.field345 != null) {
            System.out.println("Od-cycle:" + this.field345.field1681);
        }
        System.out.println("loop-cycle:" + field598);
        System.out.println("draw-cycle:" + field354);
        if (arg0 >= 1 && arg0 <= 1) {
            System.out.println("ptype:" + this.field445);
            System.out.println("psize:" + this.field444);
            if (this.field525 != null) {
                this.field525.method521(1);
            }
            super.field1101 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final Component method57(int arg0) {
        if (arg0 != -5092) {
            this.method133();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1107 != null ? super.field1107 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method58(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field572 = null;
        }
        if (this.field391 == 2) {
            this.method72((this.field310 - this.field357 << 7) + this.field313, (this.field309 - this.field356 << 7) + this.field312, this.field311 * 2, -928);
            if (this.field476 > -1 && field598 % 20 < 10) {
                this.field570[0].method215(1, this.field476 - 12, this.field477 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method59(int arg0) {
        for (int var2 = 0; var2 < this.field282; ++var2) {
            int var3 = this.field283[var2];
            class30 var4 = this.field281[var3];
            if (var4 != null) {
                this.method60(var4.field999.field1347, var4, 820);
            }
        }
        if (this.field426 != arg0) {
            this.field445 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILCUSCNWAC;I)V")
    public final void method60(int arg0, class11 arg1, int arg2) {
        if (arg1.field659 < 128 || arg1.field660 < 128 || arg1.field659 >= 13184 || arg1.field660 >= 13184) {
            arg1.field685 = -1;
            arg1.field653 = -1;
            arg1.field676 = 0;
            arg1.field677 = 0;
            arg1.field659 = arg1.field663[0] * 128 + arg1.field681 * 64;
            arg1.field660 = arg1.field664[0] * 128 + arg1.field681 * 64;
            arg1.method193((byte) 8);
        }
        if (field238 == arg1 && (arg1.field659 < 1536 || arg1.field660 < 1536 || arg1.field659 >= 11776 || arg1.field660 >= 11776)) {
            arg1.field685 = -1;
            arg1.field653 = -1;
            arg1.field676 = 0;
            arg1.field677 = 0;
            arg1.field659 = arg1.field663[0] * 128 + arg1.field681 * 64;
            arg1.field660 = arg1.field664[0] * 128 + arg1.field681 * 64;
            arg1.method193((byte) 8);
        }
        if (arg1.field676 > field598) {
            this.method61(arg1, (byte) 9);
        } else if (arg1.field677 >= field598) {
            this.method62(arg1, (byte) 39);
        } else {
            this.method63(false, arg1);
        }
        this.method64((byte) 4, arg1);
        int var4 = 7 / arg2;
        this.method65(false, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCUSCNWAC;B)V")
    public final void method61(class11 arg0, byte arg1) {
        int var3 = arg0.field676 - field598;
        int var4 = arg0.field681 * 64 + arg0.field672 * 128;
        int var5 = arg0.field681 * 64 + arg0.field674 * 128;
        arg0.field659 += (var4 - arg0.field659) / var3;
        if (arg1 != 9) {
            this.field572 = null;
        }
        arg0.field660 += (var5 - arg0.field660) / var3;
        arg0.field680 = 0;
        if (arg0.field678 == 0) {
            arg0.field679 = 1024;
        }
        if (arg0.field678 == 1) {
            arg0.field679 = 1536;
        }
        if (arg0.field678 == 2) {
            arg0.field679 = 0;
        }
        if (arg0.field678 == 3) {
            arg0.field679 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LCUSCNWAC;B)V")
    public final void method62(class11 arg0, byte arg1) {
        if (this.field340 != arg1) {
            this.field424 = -137;
        }
        if (field598 == arg0.field677 || arg0.field685 == -1 || arg0.field688 != 0 || arg0.field687 + 1 > class14.field717[arg0.field685].method207((byte) 6, arg0.field686)) {
            int var3 = arg0.field677 - arg0.field676;
            int var4 = field598 - arg0.field676;
            int var5 = arg0.field681 * 64 + arg0.field672 * 128;
            int var6 = arg0.field681 * 64 + arg0.field674 * 128;
            int var7 = arg0.field681 * 64 + arg0.field673 * 128;
            int var8 = arg0.field681 * 64 + arg0.field675 * 128;
            arg0.field659 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field660 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field680 = 0;
        if (arg0.field678 == 0) {
            arg0.field679 = 1024;
        }
        if (arg0.field678 == 1) {
            arg0.field679 = 1536;
        }
        if (arg0.field678 == 2) {
            arg0.field679 = 0;
        }
        if (arg0.field678 == 3) {
            arg0.field679 = 512;
        }
        arg0.field661 = arg0.field679;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLCUSCNWAC;)V")
    public final void method63(boolean arg0, class11 arg1) {
        arg1.field700 = arg1.field697;
        if (arg1.field658 == 0) {
            arg1.field680 = 0;
        } else {
            if (arg1.field685 != -1 && arg1.field688 == 0) {
                class14 var3 = class14.field717[arg1.field685];
                if (arg1.field694 > 0 && var3.field729 == 0) {
                    ++arg1.field680;
                    return;
                }
                if (arg1.field694 <= 0 && var3.field730 == 0) {
                    ++arg1.field680;
                    return;
                }
            }
            int var4 = arg1.field659;
            int var5 = arg1.field660;
            int var6 = arg1.field663[arg1.field658 - 1] * 128 + arg1.field681 * 64;
            int var7 = arg1.field664[arg1.field658 - 1] * 128 + arg1.field681 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field679 = 1280;
                    } else if (var5 > var7) {
                        arg1.field679 = 1792;
                    } else {
                        arg1.field679 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field679 = 768;
                    } else if (var5 > var7) {
                        arg1.field679 = 256;
                    } else {
                        arg1.field679 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field679 = 1024;
                } else {
                    arg1.field679 = 0;
                }
                int var8 = arg1.field679 - arg1.field661 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field666;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field665;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field668;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field667;
                }
                if (var9 == -1) {
                    var9 = arg1.field665;
                }
                arg1.field700 = var9;
                int var10 = 4;
                if (arg0) {
                    this.field445 = -1;
                }
                if (arg1.field679 != arg1.field661 && arg1.field695 == -1 && arg1.field696 != 0) {
                    var10 = 2;
                }
                if (arg1.field658 > 2) {
                    var10 = 6;
                }
                if (arg1.field658 > 3) {
                    var10 = 8;
                }
                if (arg1.field680 > 0 && arg1.field658 > 1) {
                    var10 = 8;
                    --arg1.field680;
                }
                if (arg1.field691[arg1.field658 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field700 == arg1.field665 && arg1.field692 != -1) {
                    arg1.field700 = arg1.field692;
                }
                if (var4 < var6) {
                    arg1.field659 += var10;
                    if (arg1.field659 > var6) {
                        arg1.field659 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field659 -= var10;
                    if (arg1.field659 < var6) {
                        arg1.field659 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field660 += var10;
                    if (arg1.field660 > var7) {
                        arg1.field660 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field660 -= var10;
                    if (arg1.field660 < var7) {
                        arg1.field660 = var7;
                    }
                }
                if (arg1.field659 == var6 && arg1.field660 == var7) {
                    --arg1.field658;
                    if (arg1.field694 > 0) {
                        --arg1.field694;
                        return;
                    }
                }
            } else {
                arg1.field659 = var6;
                arg1.field660 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLCUSCNWAC;)V")
    public final void method64(byte arg0, class11 arg1) {
        if (arg0 != 4) {
            this.field445 = -1;
        }
        if (arg1.field696 != 0) {
            if (arg1.field695 != -1 && arg1.field695 < 32768) {
                class30 var3 = this.field281[arg1.field695];
                if (var3 != null) {
                    int var4 = arg1.field659 - var3.field659;
                    int var5 = arg1.field660 - var3.field660;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field679 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field695 >= 32768) {
                int var6 = arg1.field695 - 32768;
                if (this.field530 == var6) {
                    var6 = this.field250;
                }
                class7 var7 = this.field251[var6];
                if (var7 != null) {
                    int var8 = arg1.field659 - var7.field659;
                    int var9 = arg1.field660 - var7.field660;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field679 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field703 != 0 || arg1.field704 != 0) && (arg1.field658 == 0 || arg1.field680 > 0)) {
                int var10 = arg1.field659 - (arg1.field703 - this.field356 - this.field356) * 64;
                int var11 = arg1.field660 - (arg1.field704 - this.field357 - this.field357) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field679 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field703 = 0;
                arg1.field704 = 0;
            }
            int var12 = arg1.field679 - arg1.field661 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field696 && var12 <= 2048 - arg1.field696) {
                    if (var12 > 1024) {
                        arg1.field661 -= arg1.field696;
                    } else {
                        arg1.field661 += arg1.field696;
                    }
                } else {
                    arg1.field661 = arg1.field679;
                }
                arg1.field661 &= 2047;
                if (arg1.field700 == arg1.field697 && arg1.field679 != arg1.field661) {
                    if (arg1.field698 != -1) {
                        arg1.field700 = arg1.field698;
                        return;
                    }
                    arg1.field700 = arg1.field665;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLCUSCNWAC;)V")
    public final void method65(boolean arg0, class11 arg1) {
        if (!arg0) {
            arg1.field682 = false;
            if (arg1.field700 != -1) {
                class14 var3 = class14.field717[arg1.field700];
                ++arg1.field702;
                if (arg1.field701 < var3.field718 && arg1.field702 > var3.method207((byte) 6, arg1.field701)) {
                    arg1.field702 = 1;
                    ++arg1.field701;
                }
                if (arg1.field701 >= var3.field718) {
                    arg1.field702 = 1;
                    arg1.field701 = 0;
                }
            }
            if (arg1.field653 != -1 && field598 >= arg1.field656) {
                if (arg1.field654 < 0) {
                    arg1.field654 = 0;
                }
                class14 var4 = class67.field1691[arg1.field653].field1695;
                ++arg1.field655;
                if (arg1.field654 < var4.field718 && arg1.field655 > var4.method207((byte) 6, arg1.field654)) {
                    arg1.field655 = 1;
                    ++arg1.field654;
                }
                if (arg1.field654 >= var4.field718 && (arg1.field654 < 0 || arg1.field654 >= var4.field718)) {
                    arg1.field653 = -1;
                }
            }
            if (arg1.field685 != -1 && arg1.field688 <= 1) {
                class14 var5 = class14.field717[arg1.field685];
                if (var5.field729 == 1 && arg1.field694 > 0 && arg1.field676 <= field598 && arg1.field677 < field598) {
                    arg1.field688 = 1;
                    return;
                }
            }
            if (arg1.field685 != -1 && arg1.field688 == 0) {
                class14 var6 = class14.field717[arg1.field685];
                ++arg1.field687;
                if (arg1.field686 < var6.field718 && arg1.field687 > var6.method207((byte) 6, arg1.field686)) {
                    arg1.field687 = 1;
                    ++arg1.field686;
                }
                if (arg1.field686 >= var6.field718) {
                    arg1.field686 -= var6.field722;
                    ++arg1.field689;
                    if (arg1.field689 >= var6.field728) {
                        arg1.field685 = -1;
                    }
                    if (arg1.field686 < 0 || arg1.field686 >= var6.field718) {
                        arg1.field685 = -1;
                    }
                }
                arg1.field682 = var6.field724;
            }
            if (arg1.field688 > 0) {
                --arg1.field688;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method66(byte arg0) {
        if (this.field606 != -1 && (this.field298 == 2 || super.field1105 != null)) {
            if (this.field298 == 2) {
                this.method109(this.field159, this.field606, 0);
                if (this.field204 != -1) {
                    this.method109(this.field159, this.field204, 0);
                }
                this.field159 = 0;
                this.method96(-19177);
                super.field1105.method584(-186);
                class3.field42 = this.field351;
                class5.method27(468);
                this.field146 = true;
                class63 var2 = class63.method544(this.field606);
                if (var2.field1541 == 512 && var2.field1505 == 334 && var2.field1573 == 0) {
                    var2.field1541 = 765;
                    var2.field1505 = 503;
                }
                this.method125(0, 0, 0, var2, 726);
                if (this.field204 != -1) {
                    class63 var3 = class63.method544(this.field204);
                    if (var3.field1541 == 512 && var3.field1505 == 334 && var3.field1573 == 0) {
                        var3.field1541 = 765;
                        var3.field1505 = 503;
                    }
                    this.method125(0, 0, 0, var3, 726);
                }
                if (!this.field589) {
                    this.method138(544);
                    this.method140(86);
                } else {
                    this.method49((byte) 114);
                }
            }
            super.field1105.method585(super.field1104, 0, 904, 0);
        } else {
            if (this.field146) {
                this.method107((byte) 9);
                this.field146 = false;
                this.field167.method585(super.field1104, 4, 904, 0);
                this.field168.method585(super.field1104, 357, 904, 0);
                this.field169.method585(super.field1104, 4, 904, 722);
                this.field170.method585(super.field1104, 205, 904, 743);
                this.field171.method585(super.field1104, 0, 904, 0);
                this.field172.method585(super.field1104, 4, 904, 516);
                this.field173.method585(super.field1104, 205, 904, 516);
                this.field174.method585(super.field1104, 357, 904, 496);
                this.field175.method585(super.field1104, 338, 904, 0);
                this.field352 = true;
                this.field221 = true;
                this.field216 = true;
                this.field402 = true;
                if (this.field298 != 2) {
                    this.field555.method585(super.field1104, 4, 904, 4);
                    this.field554.method585(super.field1104, 4, 904, 550);
                }
            }
            if (this.field298 == 2) {
                this.method127(458);
            }
            if (this.field589 && this.field502 == 1) {
                this.field352 = true;
            }
            if (this.field369 != -1) {
                boolean var4 = this.method109(this.field159, this.field369, 0);
                if (var4) {
                    this.field352 = true;
                }
            }
            if (this.field510 == 2) {
                this.field352 = true;
            }
            if (this.field412 == 2) {
                this.field352 = true;
            }
            if (this.field352) {
                this.method144((byte) 5);
                this.field352 = false;
            }
            if (this.field263 == -1 && this.field524 == 0) {
                this.field582.field1533 = this.field423 - this.field260 - 77;
                if (super.field1112 > 448 && super.field1112 < 560 && super.field1113 > 332) {
                    this.method51(0, (byte) 76, this.field582, super.field1113 - 357, super.field1112 - 17, -1, this.field423, 463, 77);
                }
                int var5 = this.field423 - 77 - this.field582.field1533;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field423 - 77) {
                    var5 = this.field423 - 77;
                }
                if (this.field260 != var5) {
                    this.field260 = var5;
                    this.field221 = true;
                }
                ++field183;
                if (field183 > 93) {
                    field183 = 0;
                    this.field319.method228(158, true);
                }
            }
            if (this.field263 == -1 && this.field524 == 3) {
                int var6 = this.field433 * 14 + 7;
                this.field582.field1533 = this.field436;
                if (super.field1112 > 448 && super.field1112 < 560 && super.field1113 > 332) {
                    this.method51(0, (byte) 76, this.field582, super.field1113 - 357, super.field1112 - 17, -1, var6, 463, 77);
                }
                int var7 = this.field582.field1533;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field436 != var7) {
                    this.field436 = var7;
                    this.field221 = true;
                }
            }
            if (this.field263 != -1) {
                boolean var8 = this.method109(this.field159, this.field263, 0);
                if (var8) {
                    this.field221 = true;
                }
            }
            if (this.field510 == 3) {
                this.field221 = true;
            }
            if (this.field412 == 3) {
                this.field221 = true;
            }
            if (this.field143 != null) {
                this.field221 = true;
            }
            if (this.field589 && this.field502 == 2) {
                this.field221 = true;
            }
            if (this.field221) {
                this.method89(true);
                this.field221 = false;
            }
            if (this.field298 == 2) {
                this.method183(0);
                this.field554.method585(super.field1104, 4, 904, 550);
            }
            if (this.field236 != -1) {
                this.field216 = true;
            }
            if (this.field216) {
                if (this.field236 != -1 && this.field389 == this.field236) {
                    this.field236 = -1;
                    this.field319.method228(26, true);
                    this.field319.method229(this.field389);
                }
                this.field216 = false;
                this.field626.method584(-186);
                this.field226.method401(1, 0, 0);
                if (this.field369 == -1) {
                    if (this.field619[this.field389] != -1) {
                        if (this.field389 == 0) {
                            this.field613.method401(1, 22, 10);
                        }
                        if (this.field389 == 1) {
                            this.field614.method401(1, 54, 8);
                        }
                        if (this.field389 == 2) {
                            this.field614.method401(1, 82, 8);
                        }
                        if (this.field389 == 3) {
                            this.field615.method401(1, 110, 8);
                        }
                        if (this.field389 == 4) {
                            this.field617.method401(1, 153, 8);
                        }
                        if (this.field389 == 5) {
                            this.field617.method401(1, 181, 8);
                        }
                        if (this.field389 == 6) {
                            this.field616.method401(1, 209, 9);
                        }
                    }
                    if (this.field619[0] != -1 && (this.field236 != 0 || field598 % 20 < 10)) {
                        this.field315[0].method401(1, 29, 13);
                    }
                    if (this.field619[1] != -1 && (this.field236 != 1 || field598 % 20 < 10)) {
                        this.field315[1].method401(1, 53, 11);
                    }
                    if (this.field619[2] != -1 && (this.field236 != 2 || field598 % 20 < 10)) {
                        this.field315[2].method401(1, 82, 11);
                    }
                    if (this.field619[3] != -1 && (this.field236 != 3 || field598 % 20 < 10)) {
                        this.field315[3].method401(1, 115, 12);
                    }
                    if (this.field619[4] != -1 && (this.field236 != 4 || field598 % 20 < 10)) {
                        this.field315[4].method401(1, 153, 13);
                    }
                    if (this.field619[5] != -1 && (this.field236 != 5 || field598 % 20 < 10)) {
                        this.field315[5].method401(1, 180, 11);
                    }
                    if (this.field619[6] != -1 && (this.field236 != 6 || field598 % 20 < 10)) {
                        this.field315[6].method401(1, 208, 13);
                    }
                }
                this.field626.method585(super.field1104, 160, 904, 516);
                this.field625.method584(-186);
                this.field225.method401(1, 0, 0);
                if (this.field369 == -1) {
                    if (this.field619[this.field389] != -1) {
                        if (this.field389 == 7) {
                            this.field321.method401(1, 42, 0);
                        }
                        if (this.field389 == 8) {
                            this.field322.method401(1, 74, 0);
                        }
                        if (this.field389 == 9) {
                            this.field322.method401(1, 102, 0);
                        }
                        if (this.field389 == 10) {
                            this.field323.method401(1, 130, 1);
                        }
                        if (this.field389 == 11) {
                            this.field325.method401(1, 173, 0);
                        }
                        if (this.field389 == 12) {
                            this.field325.method401(1, 201, 0);
                        }
                        if (this.field389 == 13) {
                            this.field324.method401(1, 229, 0);
                        }
                    }
                    if (this.field619[8] != -1 && (this.field236 != 8 || field598 % 20 < 10)) {
                        this.field315[7].method401(1, 74, 2);
                    }
                    if (this.field619[9] != -1 && (this.field236 != 9 || field598 % 20 < 10)) {
                        this.field315[8].method401(1, 102, 3);
                    }
                    if (this.field619[10] != -1 && (this.field236 != 10 || field598 % 20 < 10)) {
                        this.field315[9].method401(1, 137, 4);
                    }
                    if (this.field619[11] != -1 && (this.field236 != 11 || field598 % 20 < 10)) {
                        this.field315[10].method401(1, 174, 2);
                    }
                    if (this.field619[12] != -1 && (this.field236 != 12 || field598 % 20 < 10)) {
                        this.field315[11].method401(1, 201, 2);
                    }
                    if (this.field619[13] != -1 && (this.field236 != 13 || field598 % 20 < 10)) {
                        this.field315[12].method401(1, 226, 2);
                    }
                }
                this.field625.method585(super.field1104, 466, 904, 496);
                this.field555.method584(-186);
                class3.field42 = this.field350;
            }
            if (this.field402) {
                this.field402 = false;
                this.field624.method584(-186);
                this.field224.method401(1, 0, 0);
                this.field451.method332(16777215, true, 28, 0, 55, "Public chat");
                if (this.field213 == 0) {
                    this.field451.method332(65280, true, 41, 0, 55, "On");
                }
                if (this.field213 == 1) {
                    this.field451.method332(16776960, true, 41, 0, 55, "Friends");
                }
                if (this.field213 == 2) {
                    this.field451.method332(16711680, true, 41, 0, 55, "Off");
                }
                if (this.field213 == 3) {
                    this.field451.method332(65535, true, 41, 0, 55, "Hide");
                }
                this.field451.method332(16777215, true, 28, 0, 184, "Private chat");
                if (this.field581 == 0) {
                    this.field451.method332(65280, true, 41, 0, 184, "On");
                }
                if (this.field581 == 1) {
                    this.field451.method332(16776960, true, 41, 0, 184, "Friends");
                }
                if (this.field581 == 2) {
                    this.field451.method332(16711680, true, 41, 0, 184, "Off");
                }
                this.field451.method332(16777215, true, 28, 0, 324, "Trade/compete");
                if (this.field379 == 0) {
                    this.field451.method332(65280, true, 41, 0, 324, "On");
                }
                if (this.field379 == 1) {
                    this.field451.method332(16776960, true, 41, 0, 324, "Friends");
                }
                if (this.field379 == 2) {
                    this.field451.method332(16711680, true, 41, 0, 324, "Off");
                }
                this.field451.method332(16777215, true, 33, 0, 458, "Report abuse");
                this.field624.method585(super.field1104, 453, 904, 0);
                this.field555.method584(-186);
                class3.field42 = this.field350;
            }
            this.field159 = 0;
            if (arg0 != 6) {
                this.field319.method229(67);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)Z")
    public final boolean method67(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field285.method309(this.field274, arg1, arg3, arg0);
        if (!arg2) {
            throw new NullPointerException();
        } else if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method160(0, field238.field664[0], 2, 0, var8, arg3, var7 + 1, 0, this.field627, arg1, true, field238.field663[0]);
            } else {
                class64 var9 = class64.method548(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1613;
                    var11 = var9.field1603;
                } else {
                    var10 = var9.field1603;
                    var11 = var9.field1613;
                }
                int var12 = var9.field1600;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method160(var10, field238.field664[0], 2, var11, 0, arg3, 0, var12, this.field627, arg1, true, field238.field663[0]);
            }
            this.field464 = super.field1119;
            this.field465 = super.field1120;
            this.field467 = 2;
            this.field466 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method68(int arg0, int arg1) {
        class63 var3 = class63.method544(arg1);
        for (int var4 = 0; var4 < var3.field1513.length && var3.field1513[var4] != -1; ++var4) {
            class63 var5 = class63.method544(var3.field1513[var4]);
            if (var5.field1573 == 1) {
                this.method68(-41851, var5.field1558);
            }
            var5.field1550 = 0;
            var5.field1528 = 0;
        }
        if (arg0 != -41851) {
            this.field441 = !this.field441;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        class12 var3 = this.field572[this.field274][arg0][arg1];
        if (var3 == null) {
            this.field285.method300(this.field274, arg0, arg1);
        } else {
            int var4 = -99999999;
            class61 var5 = null;
            for (class61 var6 = (class61) var3.method200(); var6 != null; var6 = (class61) var3.method202(569)) {
                class31 var11 = class31.method376(var6.field1496);
                int var12 = var11.field1018;
                if (var11.field1023) {
                    var12 = (var6.field1494 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method198(var5, false);
            class61 var7 = null;
            class61 var8 = null;
            for (class61 var9 = (class61) var3.method200(); var9 != null; var9 = (class61) var3.method202(569)) {
                if (var5.field1496 != var9.field1496 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1496 != var9.field1496 && var7.field1496 != var9.field1496 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field285.method286(this.field274, var10, var5, var7, 558, var8, arg0, arg1, this.method184((byte) -28, this.field274, arg0 * 128 + 64, arg1 * 128 + 64));
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method70(byte arg0) {
        if (this.field496 > 1) {
            --this.field496;
        }
        if (this.field448 > 0) {
            --this.field448;
        }
        for (int var2 = 0; var2 < 5 && this.method168(this.field380); ++var2) {
        }
        if (this.field521) {
            Object var3 = this.field339.field1260;
            synchronized (this.field339.field1260) {
                if (!field542) {
                    this.field339.field1259 = 0;
                } else if (super.field1118 != 0 || this.field339.field1259 >= 40) {
                    this.field319.method228(19, true);
                    this.field319.method229(0);
                    int var4 = this.field319.field794;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field339.field1259 && var4 - this.field319.field794 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field339.field1261[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field339.field1256[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field339.field1261[var6] == -1 && this.field339.field1256[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field370 == var8 && this.field371 == var7) {
                            if (this.field471 < 2047) {
                                ++this.field471;
                            }
                        } else {
                            int var10 = var8 - this.field370;
                            this.field370 = var8;
                            int var11 = var7 - this.field371;
                            this.field371 = var7;
                            if (this.field471 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field319.method230((this.field471 << 12) + (var10 << 6) + var11);
                                this.field471 = 0;
                            } else if (this.field471 < 8) {
                                this.field319.method232((this.field471 << 19) + 8388608 + var9);
                                this.field471 = 0;
                            } else {
                                this.field319.method233((this.field471 << 19) + -1073741824 + var9);
                                this.field471 = 0;
                            }
                        }
                    }
                    this.field319.method238(-844, this.field319.field794 - var4);
                    if (var5 >= this.field339.field1259) {
                        this.field339.field1259 = 0;
                    } else {
                        this.field339.field1259 -= var5;
                        for (int var12 = 0; var12 < this.field339.field1259; ++var12) {
                            this.field339.field1256[var12] = this.field339.field1256[var5 + var12];
                            this.field339.field1261[var12] = this.field339.field1261[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1118 != 0) {
                long var13 = (super.field1121 - this.field261) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field261 = super.field1121;
                int var15 = super.field1120;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1119;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1118 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field319.method228(204, true);
                this.field319.method273((byte) -62, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field296 > 0) {
                --this.field296;
            }
            if (super.field1122[1] == 1 || super.field1122[2] == 1 || super.field1122[3] == 1 || super.field1122[4] == 1) {
                this.field297 = true;
            }
            if (this.field297 && this.field296 <= 0) {
                this.field296 = 20;
                this.field297 = false;
                this.field319.method228(176, true);
                this.field319.method264((byte) 1, this.field456);
                this.field319.method264((byte) 1, this.field457);
            }
            if (super.field1109 && !this.field439) {
                this.field439 = true;
                this.field319.method228(244, true);
                this.field319.method229(1);
            }
            if (!super.field1109 && this.field439) {
                this.field439 = false;
                this.field319.method228(244, true);
                this.field319.method229(0);
            }
            this.method191(-596);
            this.method149(true);
            this.method163(true);
            ++this.field446;
            if (this.field446 > 750) {
                this.method175(0);
            }
            this.method165(-866);
            this.method59(6);
            this.method108(-903);
            ++field287;
            if (field287 > 153) {
                field287 = 0;
                this.field319.method228(137, true);
                this.field319.method233(0);
            }
            ++this.field159;
            if (arg0 == 13) {
                if (this.field467 != 0) {
                    this.field466 += 20;
                    if (this.field466 >= 400) {
                        this.field467 = 0;
                    }
                }
                if (this.field510 != 0) {
                    ++this.field507;
                    if (this.field507 >= 15) {
                        if (this.field510 == 2) {
                            this.field352 = true;
                        }
                        if (this.field510 == 3) {
                            this.field221 = true;
                        }
                        this.field510 = 0;
                    }
                }
                if (this.field412 != 0) {
                    ++this.field353;
                    if (super.field1112 > this.field413 + 5 || super.field1112 < this.field413 - 5 || super.field1113 > this.field414 + 5 || super.field1113 < this.field414 - 5) {
                        this.field440 = true;
                    }
                    if (super.field1111 == 0) {
                        if (this.field412 == 2) {
                            this.field352 = true;
                        }
                        if (this.field412 == 3) {
                            this.field221 = true;
                        }
                        this.field412 = 0;
                        if (this.field440 && this.field353 >= 5) {
                            this.field405 = -1;
                            this.method138(544);
                            if (this.field410 == this.field405 && this.field411 != this.field404) {
                                class63 var20 = class63.method544(this.field410);
                                byte var21 = 0;
                                if (this.field635 == 1 && var20.field1503 == 206) {
                                    var21 = 1;
                                }
                                if (var20.field1572[this.field404] <= 0) {
                                    var21 = 0;
                                }
                                if (var20.field1539) {
                                    int var22 = this.field411;
                                    int var23 = this.field404;
                                    var20.field1572[var23] = var20.field1572[var22];
                                    var20.field1567[var23] = var20.field1567[var22];
                                    var20.field1572[var22] = -1;
                                    var20.field1567[var22] = 0;
                                } else if (var21 == 1) {
                                    int var24 = this.field411;
                                    int var25 = this.field404;
                                    while (var24 != var25) {
                                        if (var24 > var25) {
                                            var20.method543(var24 - 1, var24, 492);
                                            --var24;
                                        } else if (var24 < var25) {
                                            var20.method543(var24 + 1, var24, 492);
                                            ++var24;
                                        }
                                    }
                                } else {
                                    var20.method543(this.field404, this.field411, 492);
                                }
                                this.field319.method228(159, true);
                                this.field319.method230(this.field404);
                                this.field319.method256(var21, this.field441);
                                this.field319.method230(this.field411);
                                this.field319.method266(true, this.field410);
                            }
                        } else if ((this.field566 == 1 || this.method91(6, this.field546 - 1)) && this.field546 > 2) {
                            this.method106(-44689);
                        } else if (this.field546 > 0) {
                            this.method135(-287, this.field546 - 1);
                        }
                        this.field507 = 10;
                        super.field1118 = 0;
                    }
                }
                if (class19.field852 != -1) {
                    int var26 = class19.field852;
                    int var27 = class19.field853;
                    boolean var28 = this.method160(0, field238.field664[0], 0, 0, 0, var27, 0, 0, this.field627, var26, true, field238.field663[0]);
                    class19.field852 = -1;
                    if (var28) {
                        this.field464 = super.field1119;
                        this.field465 = super.field1120;
                        this.field467 = 1;
                        this.field466 = 0;
                    }
                }
                if (super.field1118 == 1 && this.field143 != null) {
                    this.field143 = null;
                    this.field221 = true;
                    super.field1118 = 0;
                }
                this.method174((byte) 88);
                if (this.field606 == -1) {
                    this.method83(-608);
                    this.method104(0);
                    this.method161(-64);
                }
                if (super.field1111 == 1 || super.field1118 == 1) {
                    ++this.field618;
                }
                if (this.field541 == 0 && this.field596 == 0 && this.field161 == 0) {
                    if (this.field401 > 0) {
                        --this.field401;
                    }
                } else if (this.field401 < 100) {
                    ++this.field401;
                    if (this.field401 == 100) {
                        if (this.field541 != 0) {
                            this.field221 = true;
                        }
                        if (this.field596 != 0) {
                            this.field352 = true;
                        }
                    }
                }
                if (this.field298 == 2) {
                    this.method189(this.field602);
                }
                if (this.field298 == 2 && this.field511) {
                    this.method92(18662);
                }
                for (int var29 = 0; var29 < 5; ++var29) {
                    int var10002 = this.field586[var29]++;
                }
                this.method105(true);
                ++super.field1110;
                if (super.field1110 > 4500) {
                    this.field448 = 250;
                    super.field1110 -= 500;
                    this.field319.method228(120, true);
                }
                ++this.field288;
                if (this.field288 > 500) {
                    this.field288 = 0;
                    int var30 = (int) (Math.random() * 8.0D);
                    if ((var30 & 1) == 1) {
                        this.field472 += this.field473;
                    }
                    if ((var30 & 2) == 2) {
                        this.field197 += this.field198;
                    }
                    if ((var30 & 4) == 4) {
                        this.field568 += this.field569;
                    }
                }
                if (this.field472 < -50) {
                    this.field473 = 2;
                }
                if (this.field472 > 50) {
                    this.field473 = -2;
                }
                if (this.field197 < -55) {
                    this.field198 = 2;
                }
                if (this.field197 > 55) {
                    this.field198 = -2;
                }
                if (this.field568 < -40) {
                    this.field569 = 1;
                }
                if (this.field568 > 40) {
                    this.field569 = -1;
                }
                ++this.field145;
                if (this.field145 > 500) {
                    this.field145 = 0;
                    int var31 = (int) (Math.random() * 8.0D);
                    if ((var31 & 1) == 1) {
                        this.field200 += this.field201;
                    }
                    if ((var31 & 2) == 2) {
                        this.field526 += this.field527;
                    }
                }
                if (this.field200 < -60) {
                    this.field201 = 2;
                }
                if (this.field200 > 60) {
                    this.field201 = -2;
                }
                if (this.field526 < -20) {
                    this.field527 = 1;
                }
                if (this.field526 > 10) {
                    this.field527 = -1;
                }
                ++field217;
                if (field217 > 69) {
                    field217 = 0;
                    this.field319.method228(36, true);
                }
                ++this.field447;
                if (this.field447 > 50) {
                    this.field319.method228(110, true);
                }
                try {
                    if (this.field525 != null && this.field319.field794 > 0) {
                        this.field525.method520(0, this.field319.field794, (byte) -100, this.field319.field793);
                        this.field319.field794 = 0;
                        this.field447 = 0;
                    }
                } catch (IOException var33) {
                    this.method175(0);
                } catch (Exception var34) {
                    this.method86(this.field578);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCUSCNWAC;BI)V")
    public final void method71(class11 arg0, byte arg1, int arg2) {
        if (arg1 != -102) {
            this.field572 = null;
        }
        this.method72(arg0.field660, arg0.field659, arg2, -928);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
            int var5 = this.method184((byte) -28, this.field274, arg1, arg0) - arg2;
            int var6 = arg1 - this.field561;
            int var7 = var5 - this.field562;
            int var8 = arg0 - this.field563;
            int var9 = class41.field1252[this.field564];
            int var10 = class41.field1253[this.field564];
            int var11 = class41.field1252[this.field565];
            int var12 = class41.field1253[this.field565];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            while (arg3 >= 0) {
                this.field319.method229(87);
            }
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field476 = (var13 << 9) / var17 + class3.field36;
                this.field477 = (var16 << 9) / var17 + class3.field37;
            } else {
                this.field476 = -1;
                this.field477 = -1;
            }
        } else {
            this.field476 = -1;
            this.field477 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method73(int arg0) {
        if (this.field430 != 0) {
            class20 var2 = this.field451;
            if (arg0 != 0) {
                this.field441 = !this.field441;
            }
            int var3 = 0;
            if (this.field496 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field362[var4] != null) {
                    int var5 = this.field360[var4];
                    String var6 = this.field361[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field581 == 0 || this.field581 == 1 && this.method124(7, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method335(var9, var8, "From", 47, 0);
                        var2.method335(var9, var8 - 1, "From", 47, 65535);
                        int var10 = var9 + var2.method333("From ", false);
                        if (var7 == 1) {
                            this.field636[0].method401(1, var10, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field636[1].method401(1, var10, var8 - 12);
                            var10 += 14;
                        }
                        var2.method335(var10, var8, var6 + ": " + this.field362[var4], 47, 0);
                        var2.method335(var10, var8 - 1, var6 + ": " + this.field362[var4], 47, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field581 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method335(4, var11, this.field362[var4], 47, 0);
                        var2.method335(4, var11 - 1, this.field362[var4], 47, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field581 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method335(4, var12, "To " + var6 + ": " + this.field362[var4], 47, 0);
                        var2.method335(4, var12 - 1, "To " + var6 + ": " + this.field362[var4], 47, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LVTUPBFSN;Z)Z")
    public final boolean method74(class63 arg0, boolean arg1) {
        int var3 = arg0.field1503;
        if (arg1) {
            this.field533 = this.field176.method524();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field227[this.field546] = "Remove @whi@" + arg0.field1562;
                this.field189[this.field546] = 397;
                ++this.field546;
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
            this.field227[this.field546] = "Remove @whi@" + this.field520[var3];
            this.field189[this.field546] = 968;
            ++this.field546;
            this.field227[this.field546] = "Message @whi@" + this.field520[var3];
            this.field189[this.field546] = 109;
            ++this.field546;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method75(int arg0, boolean arg1) {
        if (field238.field659 >> 7 == this.field543 && field238.field660 >> 7 == this.field544) {
            this.field543 = 0;
            ++field374;
            if (field374 > 190) {
                field374 = 0;
                this.field319.method228(0, true);
                this.field319.method232(10211198);
            }
        }
        int var3 = this.field252;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class7 var5;
            int var6;
            if (arg1) {
                var5 = field238;
                var6 = this.field250 << 14;
            } else {
                var5 = this.field251[this.field253[var4]];
                var6 = this.field253[var4] << 14;
            }
            if (var5 != null && var5.method40(772)) {
                var5.field104 = false;
                if ((field211 && this.field252 > 50 || this.field252 > 200) && !arg1 && var5.field700 == var5.field697) {
                    var5.field104 = true;
                }
                int var7 = var5.field659 >> 7;
                int var8 = var5.field660 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field99 != null && field598 >= var5.field75 && field598 < var5.field76) {
                        var5.field104 = false;
                        var5.field106 = this.method184((byte) -28, this.field274, var5.field659, var5.field660);
                        this.field285.method291(var5.field91, var5.field659, var5.field661, var6, var5.field89, var5, var5.field106, 7, var5.field92, this.field274, 60, var5.field90, var5.field660);
                    } else {
                        if ((var5.field659 & 127) == 64 && (var5.field660 & 127) == 64) {
                            if (this.field234[var7][var8] == this.field518) {
                                continue;
                            }
                            this.field234[var7][var8] = this.field518;
                        }
                        var5.field106 = this.method184((byte) -28, this.field274, var5.field659, var5.field660);
                        this.field285.method290(60, this.field621, var5.field661, this.field274, var5.field660, var5.field682, var5.field106, var6, var5, var5.field659);
                    }
                }
            }
        }
        if (arg0 != 29921) {
            this.field179 = -366;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method76(byte arg0) {
        byte[] var2 = this.field326.method348("title.dat", (byte[]) null);
        class16 var3 = new class16(var2, this);
        this.field330.method584(-186);
        var3.method213(-812, 0, 0);
        this.field331.method584(-186);
        var3.method213(-812, 0, -637);
        this.field327.method584(-186);
        var3.method213(-812, 0, -128);
        if (arg0 != 5) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.field328.method584(-186);
        var3.method213(-812, -371, -202);
        this.field329.method584(-186);
        var3.method213(-812, -171, -202);
        this.field332.method584(-186);
        var3.method213(-812, -265, 0);
        this.field333.method584(-186);
        var3.method213(-812, -265, -562);
        this.field334.method584(-186);
        var3.method213(-812, -171, -128);
        this.field335.method584(-186);
        var3.method213(-812, -171, -562);
        int[] var5 = new int[var3.field760];
        for (int var6 = 0; var6 < var3.field761; ++var6) {
            for (int var11 = 0; var11 < var3.field760; ++var11) {
                var5[var11] = var3.field759[var3.field760 * var6 + (var3.field760 - var11 - 1)];
            }
            for (int var12 = 0; var12 < var3.field760; ++var12) {
                var3.field759[var3.field760 * var6 + var12] = var5[var12];
            }
        }
        this.field330.method584(-186);
        var3.method213(-812, 0, 382);
        this.field331.method584(-186);
        var3.method213(-812, 0, -255);
        this.field327.method584(-186);
        var3.method213(-812, 0, 254);
        this.field328.method584(-186);
        var3.method213(-812, -371, 180);
        this.field329.method584(-186);
        var3.method213(-812, -171, 180);
        this.field332.method584(-186);
        var3.method213(-812, -265, 382);
        this.field333.method584(-186);
        var3.method213(-812, -265, -180);
        this.field334.method584(-186);
        var3.method213(-812, -171, 254);
        this.field335.method584(-186);
        var3.method213(-812, -171, -180);
        class16 var7 = new class16(this.field326, "logo", 0);
        this.field327.method584(-186);
        var7.method215(1, 382 - var7.field760 / 2 - 128, 18);
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method77(int arg0, boolean arg1) {
        if (!arg1) {
            this.method133();
        }
        if (!field211) {
            for (int var3 = 0; var3 < this.field192.length; ++var3) {
                int var4 = this.field192[var3];
                if (class3.field50[var4] >= arg0) {
                    class38 var5 = class3.field44[var4];
                    int var6 = var5.field1145 * var5.field1144 - 1;
                    int var7 = this.field159 * var5.field1144 * 2;
                    byte[] var8 = var5.field1142;
                    byte[] var9 = this.field148;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1142 = var9;
                    this.field148 = var8;
                    class3.method14(var4, true);
                    ++field337;
                    if (field337 > 1575) {
                        field337 = 0;
                        this.field319.method228(25, true);
                        this.field319.method229(0);
                        int var11 = this.field319.field794;
                        this.field319.method230((int) (Math.random() * 65536.0D));
                        this.field319.method230(22390);
                        this.field319.method230((int) (Math.random() * 65536.0D));
                        this.field319.method230(39392);
                        this.field319.method230(28881);
                        this.field319.method230(23643);
                        this.field319.method229(41);
                        this.field319.method229(39);
                        this.field319.method229(92);
                        this.field319.method230(38971);
                        this.field319.method238(-844, this.field319.field794 - var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method78(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            this.field470 = !this.field470;
        }
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method79(int arg0) {
        this.field444 += arg0;
        this.field147 = false;
        while (this.field539) {
            this.field147 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field418 = null;
        this.field419 = null;
        this.field267 = null;
        this.field290 = null;
        this.field291 = null;
        this.field292 = null;
        this.field293 = null;
        this.field599 = null;
        this.field600 = null;
        this.field474 = null;
        this.field475 = null;
        this.field575 = null;
        this.field576 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method80(byte arg0) {
        class8 var2 = (class8) this.field558.method200();
        if (this.field443 != arg0) {
            this.field319.method229(50);
        }
        while (var2 != null) {
            if (this.field274 == var2.field111 && field598 <= var2.field113) {
                if (field598 >= var2.field112) {
                    if (var2.field109 > 0) {
                        class30 var3 = this.field281[var2.field109 - 1];
                        if (var3 != null && var3.field659 >= 0 && var3.field659 < 13312 && var3.field660 >= 0 && var3.field660 < 13312) {
                            var2.method43(var3.field660, this.method184((byte) -28, var2.field111, var3.field659, var3.field660) - var2.field122, field598, -37962, var3.field659);
                        }
                    }
                    if (var2.field109 < 0) {
                        int var4 = -var2.field109 - 1;
                        class7 var5;
                        if (this.field530 == var4) {
                            var5 = field238;
                        } else {
                            var5 = this.field251[var4];
                        }
                        if (var5 != null && var5.field659 >= 0 && var5.field659 < 13312 && var5.field660 >= 0 && var5.field660 < 13312) {
                            var2.method43(var5.field660, this.method184((byte) -28, var2.field111, var5.field659, var5.field660) - var2.field122, field598, -37962, var5.field659);
                        }
                    }
                    var2.method42(this.field159, true);
                    this.field285.method290(60, this.field621, var2.field114, this.field274, (int) var2.field117, false, (int) var2.field118, -1, var2, (int) var2.field116);
                }
            } else {
                var2.method205();
            }
            var2 = (class8) this.field558.method202(569);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        if (!this.field399 && !this.field548 && !this.field342) {
            ++field354;
            if (arg0) {
                this.field445 = -1;
            }
            if (!this.field521) {
                this.method121(0, false);
            } else {
                this.method66((byte) 6);
            }
            this.field618 = 0;
        } else {
            this.method95(-31435);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LVTUPBFSN;Z)Z")
    public final boolean method82(class63 arg0, boolean arg1) {
        if (arg0.field1512 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1512.length; ++var3) {
                int var4 = this.method169(true, var3, arg0);
                int var5 = arg0.field1507[var3];
                if (arg0.field1512[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1512[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1512[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (!arg1) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method83(int arg0) {
        if (arg0 >= 0) {
            this.field445 = this.field487.method239();
        }
        if (this.field239 == 0) {
            if (super.field1118 == 1) {
                int var2 = super.field1119 - 25 - 550;
                int var3 = super.field1120 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field457 + this.field200 & 2047;
                    int var5 = class3.field40[var4];
                    int var6 = class3.field41[var4];
                    int var7 = (this.field526 + 256) * var5 >> 8;
                    int var8 = (this.field526 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field238.field659 + var9 >> 7;
                    int var12 = field238.field660 - var10 >> 7;
                    boolean var13 = this.method160(0, field238.field664[0], 1, 0, 0, var12, 0, 0, this.field627, var11, true, field238.field663[0]);
                    if (var13) {
                        this.field319.method229(var2);
                        this.field319.method229(var3);
                        this.field319.method230(this.field457);
                        this.field319.method229(57);
                        this.field319.method229(this.field200);
                        this.field319.method229(this.field526);
                        this.field319.method229(89);
                        this.field319.method230(field238.field659);
                        this.field319.method230(field238.field660);
                        this.field319.method229(this.field316);
                        this.field319.method229(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field146 = true;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method85(boolean arg0) {
        this.field418 = new class38(this.field326, "titlebox", 0);
        this.field419 = new class38(this.field326, "titlebutton", 0);
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field267 = new class38[12];
        for (int var3 = 0; var3 < 12; ++var3) {
            this.field267[var3] = new class38(this.field326, "runes", var3);
        }
        this.field575 = new class16(128, 265);
        this.field576 = new class16(128, 265);
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field575.field759[var4] = this.field330.field1716[var4];
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field576.field759[var5] = this.field331.field1716[var5];
        }
        this.field291 = new int[256];
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field291[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field291[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field291[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field291[var9 + 192] = 16777215;
        }
        this.field292 = new int[256];
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field292[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field292[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field292[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field292[var13 + 192] = 16777215;
        }
        this.field293 = new int[256];
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field293[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field293[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field293[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field293[var17 + 192] = 16777215;
        }
        this.field290 = new int[256];
        this.field599 = new int[32768];
        this.field600 = new int[32768];
        this.method97(0, (class38) null);
        this.field474 = new int[32768];
        this.field475 = new int[32768];
        this.method98(10, "Connecting to fileserver", (byte) 1);
        if (!this.field147) {
            this.field540 = true;
            this.field147 = true;
            this.method139(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method86(int arg0) {
        if (arg0 <= 0) {
            this.field319.method229(13);
        }
        try {
            if (this.field525 != null) {
                this.field525.method516();
            }
        } catch (Exception var3) {
        }
        this.field525 = null;
        this.field521 = false;
        this.field278 = 0;
        this.field180 = "";
        this.field181 = "";
        this.method137(345);
        this.field285.method279((byte) -44);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field620[var2].method593();
        }
        System.gc();
        this.method78(6);
        this.field338 = -1;
        this.field383 = -1;
        this.field425 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
    public final void method87(String arg0, boolean arg1, String arg2) {
        this.field521 &= arg1;
        if (this.field555 != null) {
            this.field555.method584(-186);
            class3.field42 = this.field350;
            int var4 = 151;
            if (arg2 != null) {
                var4 -= 7;
            }
            this.field451.method331((byte) 3, var4, 0, arg0, 257);
            this.field451.method331((byte) 3, var4 - 1, 16777215, arg0, 256);
            var4 += 15;
            if (arg2 != null) {
                this.field451.method331((byte) 3, var4, 0, arg2, 257);
                this.field451.method331((byte) 3, var4 - 1, 16777215, arg2, 256);
            }
            this.field555.method585(super.field1104, 4, 904, 4);
        } else if (super.field1105 != null) {
            super.field1105.method584(-186);
            class3.field42 = this.field351;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class5.method29(383 - var6 / 2, 35224, var6, 0, var5 - 5 - var7 / 2, var7);
            class5.method30(var6, 16777215, 383 - var6 / 2, -41001, var7, var5 - 5 - var7 / 2);
            if (arg2 != null) {
                var5 -= 7;
            }
            this.field451.method331((byte) 3, var5, 0, arg0, 383);
            this.field451.method331((byte) 3, var5 - 1, 16777215, arg0, 382);
            var5 += 15;
            if (arg2 != null) {
                this.field451.method331((byte) 3, var5, 0, arg2, 383);
                this.field451.method331((byte) 3, var5 - 1, 16777215, arg2, 382);
            }
            super.field1105.method585(super.field1104, 0, 904, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LEYMNCFMK;IB)V")
    private final void method88(class18 arg0, int arg1, byte arg2) {
        this.field584 = 0;
        this.field254 = 0;
        this.method145(-419, arg0, arg1);
        this.method114(arg1, 0, arg0);
        this.method157(arg1, -391, arg0);
        if (arg2 != 9) {
            this.method133();
        }
        for (int var4 = 0; var4 < this.field584; ++var4) {
            int var6 = this.field585[var4];
            if (field598 != this.field281[var6].field683) {
                this.field281[var6].field999 = null;
                this.field281[var6] = null;
            }
        }
        if (arg0.field794 != arg1) {
            signlink.reporterror(this.field180 + " size mismatch in getnpcpos - pos:" + arg0.field794 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field282; ++var5) {
                if (this.field281[this.field283[var5]] == null) {
                    signlink.reporterror(this.field180 + " null entry in npc list - pos:" + var5 + " size:" + this.field282);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method89(boolean arg0) {
        this.field521 &= arg0;
        this.field556.method584(-186);
        class3.field42 = this.field348;
        this.field486.method401(1, 0, 0);
        if (this.field437) {
            this.field452.method331((byte) 3, 40, 0, this.field633, 239);
            this.field452.method331((byte) 3, 60, 128, this.field395 + "*", 239);
        } else if (this.field524 == 1) {
            this.field452.method331((byte) 3, 40, 0, "Enter amount:", 239);
            this.field452.method331((byte) 3, 60, 128, this.field212 + "*", 239);
        } else if (this.field524 == 2) {
            this.field452.method331((byte) 3, 40, 0, "Enter name:", 239);
            this.field452.method331((byte) 3, 60, 128, this.field212 + "*", 239);
        } else if (this.field524 == 3) {
            if (this.field432 != this.field212) {
                this.method54(false, this.field212);
                this.field432 = this.field212;
            }
            class20 var2 = this.field451;
            class5.method26(0, 463, true, 77, 0);
            for (int var3 = 0; var3 < this.field433; ++var3) {
                int var4 = var3 * 14 + 18 - this.field436;
                if (var4 > 0 && var4 < 110) {
                    var2.method331((byte) 3, var4, 0, this.field434[var3], 239);
                }
            }
            class5.method25(this.field218);
            if (this.field433 > 5) {
                this.method123(0, 463, this.field436, 0, this.field433 * 14 + 7, 77);
            }
            if (this.field212.length() == 0) {
                this.field452.method331((byte) 3, 40, 255, "Enter object name", 239);
            } else if (this.field433 == 0) {
                this.field452.method331((byte) 3, 40, 0, "No matching objects found, please shorten search", 239);
            }
            var2.method331((byte) 3, 90, 0, this.field212 + "*", 239);
            class5.method32(77, 0, 0, this.field550, 479);
        } else if (this.field143 != null) {
            this.field452.method331((byte) 3, 40, 0, this.field143, 239);
            this.field452.method331((byte) 3, 60, 128, "Click to continue", 239);
        } else if (this.field263 != -1) {
            this.method125(0, 0, 0, class63.method544(this.field263), 726);
        } else if (this.field438 != -1) {
            this.method125(0, 0, 0, class63.method544(this.field438), 726);
        } else {
            class20 var5 = this.field451;
            int var6 = 0;
            class5.method26(0, 463, true, 77, 0);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field362[var7] != null) {
                    int var9 = this.field360[var7];
                    int var10 = 70 - var6 * 14 + this.field260;
                    String var11 = this.field361[var7];
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
                            var5.method335(4, var10, this.field362[var7], 47, 0);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field213 == 0 || this.field213 == 1 && this.method124(7, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field636[0].method401(1, var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field636[1].method401(1, var13, var10 - 12);
                                var13 += 14;
                            }
                            var5.method335(var13, var10, var11 + ":", 47, 0);
                            int var14 = var13 + var5.method333(var11, false) + 8;
                            var5.method335(var14, var10, this.field362[var7], 47, 255);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field430 == 0 && (var9 == 7 || this.field581 == 0 || this.field581 == 1 && this.method124(7, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method335(var15, var10, "From", 47, 0);
                            int var16 = var15 + var5.method333("From ", false);
                            if (var12 == 1) {
                                this.field636[0].method401(1, var16, var10 - 12);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field636[1].method401(1, var16, var10 - 12);
                                var16 += 14;
                            }
                            var5.method335(var16, var10, var11 + ":", 47, 0);
                            int var17 = var16 + var5.method333(var11, false) + 8;
                            var5.method335(var17, var10, this.field362[var7], 47, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field379 == 0 || this.field379 == 1 && this.method124(7, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method335(4, var10, var11 + " " + this.field362[var7], 47, 8388736);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field430 == 0 && this.field581 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method335(4, var10, this.field362[var7], 47, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field430 == 0 && this.field581 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method335(4, var10, "To " + var11 + ":", 47, 0);
                            var5.method335(12 + var5.method333("To " + var11, false), var10, this.field362[var7], 47, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field379 == 0 || this.field379 == 1 && this.method124(7, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method335(4, var10, var11 + " " + this.field362[var7], 47, 8270336);
                        }
                        ++var6;
                    }
                }
            }
            class5.method25(this.field218);
            this.field423 = var6 * 14 + 7;
            if (this.field423 < 78) {
                this.field423 = 78;
            }
            this.method123(0, 463, this.field423 - this.field260 - 77, 0, this.field423, 77);
            String var8;
            if (field238 != null && field238.field101 != null) {
                var8 = field238.field101;
            } else {
                var8 = class32.method384(this.field368, this.field180);
            }
            var5.method335(4, 90, var8 + ":", 47, 0);
            var5.method335(6 + var5.method333(var8 + ": ", false), 90, this.field388 + "*", 47, 255);
            class5.method32(77, 0, 0, this.field550, 479);
        }
        if (this.field589 && this.field502 == 2) {
            this.method49((byte) 114);
        }
        this.field556.method585(super.field1104, 357, 904, 17);
        this.field555.method584(-186);
        class3.field42 = this.field350;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public static final void method90(boolean arg0) {
        class19.field818 = false;
        class3.field31 = false;
        field211 = false;
        class46.field1292 = false;
        if (arg0) {
            class64.field1577 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
    public final boolean method91(int arg0, int arg1) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var4 = this.field189[arg1];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 465;
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method92(int arg0) {
        if (arg0 != 18662) {
            this.field602 = this.field176.method524();
        }
        int var2 = this.field240 * 128 + 64;
        int var3 = this.field241 * 128 + 64;
        int var4 = this.method184((byte) -28, this.field274, var2, var3) - this.field242;
        if (this.field561 < var2) {
            this.field561 += (var2 - this.field561) * this.field244 / 1000 + this.field243;
            if (this.field561 > var2) {
                this.field561 = var2;
            }
        }
        if (this.field561 > var2) {
            this.field561 -= (this.field561 - var2) * this.field244 / 1000 + this.field243;
            if (this.field561 < var2) {
                this.field561 = var2;
            }
        }
        if (this.field562 < var4) {
            this.field562 += (var4 - this.field562) * this.field244 / 1000 + this.field243;
            if (this.field562 > var4) {
                this.field562 = var4;
            }
        }
        if (this.field562 > var4) {
            this.field562 -= (this.field562 - var4) * this.field244 / 1000 + this.field243;
            if (this.field562 < var4) {
                this.field562 = var4;
            }
        }
        if (this.field563 < var3) {
            this.field563 += (var3 - this.field563) * this.field244 / 1000 + this.field243;
            if (this.field563 > var3) {
                this.field563 = var3;
            }
        }
        if (this.field563 > var3) {
            this.field563 -= (this.field563 - var3) * this.field244 / 1000 + this.field243;
            if (this.field563 < var3) {
                this.field563 = var3;
            }
        }
        int var5 = this.field489 * 128 + 64;
        int var6 = this.field490 * 128 + 64;
        int var7 = this.method184((byte) -28, this.field274, var5, var6) - this.field491;
        int var8 = var5 - this.field561;
        int var9 = var7 - this.field562;
        int var10 = var6 - this.field563;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field564 < var12) {
            this.field564 += (var12 - this.field564) * this.field493 / 1000 + this.field492;
            if (this.field564 > var12) {
                this.field564 = var12;
            }
        }
        if (this.field564 > var12) {
            this.field564 -= (this.field564 - var12) * this.field493 / 1000 + this.field492;
            if (this.field564 < var12) {
                this.field564 = var12;
            }
        }
        int var14 = var13 - this.field565;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field565 += this.field493 * var14 / 1000 + this.field492;
            this.field565 &= 2047;
        }
        if (var14 < 0) {
            this.field565 -= -var14 * this.field493 / 1000 + this.field492;
            this.field565 &= 2047;
        }
        int var15 = var13 - this.field565;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field565 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
    public final void method93(int arg0, boolean arg1) {
        int var3 = class52.field1404[arg0].field1412;
        if (var3 != 0) {
            int var4 = this.field344[arg0];
            if (!arg1) {
                this.field382 = this.field176.method524();
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class3.method16(0.9D, 250);
                }
                if (var4 == 2) {
                    class3.method16(0.8D, 250);
                }
                if (var4 == 3) {
                    class3.method16(0.7D, 250);
                }
                if (var4 == 4) {
                    class3.method16(0.6D, 250);
                }
                class31.field1004.method533();
                this.field146 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field461;
                if (var4 == 0) {
                    this.method153(0, this.field461, true);
                    this.field461 = true;
                }
                if (var4 == 1) {
                    this.method153(-400, this.field461, true);
                    this.field461 = true;
                }
                if (var4 == 2) {
                    this.method153(-800, this.field461, true);
                    this.field461 = true;
                }
                if (var4 == 3) {
                    this.method153(-1200, this.field461, true);
                    this.field461 = true;
                }
                if (var4 == 4) {
                    this.field461 = false;
                }
                if (this.field461 != var5 && !field211) {
                    if (this.field461) {
                        this.field383 = this.field338;
                        this.field384 = true;
                        this.field345.method577(2, this.field383);
                    } else {
                        this.method78(6);
                    }
                    this.field425 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field275 = true;
                    this.method117(0, false);
                }
                if (var4 == 1) {
                    this.field275 = true;
                    this.method117(-400, false);
                }
                if (var4 == 2) {
                    this.field275 = true;
                    this.method117(-800, false);
                }
                if (var4 == 3) {
                    this.field275 = true;
                    this.method117(-1200, false);
                }
                if (var4 == 4) {
                    this.field275 = false;
                }
            }
            if (var3 == 5) {
                this.field566 = var4;
            }
            if (var3 == 6) {
                this.field215 = var4;
            }
            if (var3 == 8) {
                this.field430 = var4;
                this.field221 = true;
            }
            if (var3 == 9) {
                this.field635 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method94(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field282; ++var3) {
            class30 var5 = this.field281[this.field283[var3]];
            int var6 = (this.field283[var3] << 14) + 536870912;
            if (var5 != null && var5.method40(772) && var5.field999.field1362 == arg0 && var5.field999.method515(this.field382)) {
                int var7 = var5.field659 >> 7;
                int var8 = var5.field660 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field681 == 1 && (var5.field659 & 127) == 64 && (var5.field660 & 127) == 64) {
                        if (this.field234[var7][var8] == this.field518) {
                            continue;
                        }
                        this.field234[var7][var8] = this.field518;
                    }
                    if (!var5.field999.field1344) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field285.method290((var5.field681 - 1) * 64 + 60, this.field621, var5.field661, this.field274, var5.field660, var5.field682, this.method184((byte) -28, this.field274, var5.field659, var5.field660), var6, var5, var5.field659);
                }
            }
        }
        int var4 = 18 / arg1;
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method95(int arg0) {
        Graphics var2 = this.method57(-5092).getGraphics();
        var2.setColor(Color.black);
        if (arg0 == -31435) {
            var2.fillRect(0, 0, 765, 503);
            this.method389(621, 1);
            if (this.field548) {
                this.field147 = false;
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
            if (this.field342) {
                this.field147 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field399) {
                this.field147 = false;
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

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method96(int arg0) {
        if (super.field1105 == null) {
            this.method79(0);
            this.field327 = null;
            this.field328 = null;
            this.field329 = null;
            this.field330 = null;
            this.field331 = null;
            this.field332 = null;
            this.field333 = null;
            this.field334 = null;
            this.field335 = null;
            this.field556 = null;
            this.field554 = null;
            if (arg0 != -19177) {
                this.field424 = -129;
            }
            this.field553 = null;
            this.field555 = null;
            this.field624 = null;
            this.field625 = null;
            this.field626 = null;
            super.field1105 = new class70(this.method57(-5092), 765, 503, (byte) 52);
            this.field146 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMRCVLIXG;)V")
    public final void method97(int arg0, class38 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field599.length; ++var4) {
            this.field599[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field599[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg0 != 0) {
            this.field445 = this.field487.method239();
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field600[var16] = (this.field599[var16 - 1] + this.field599[var16 + 1] + this.field599[var16 - 128] + this.field599[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field599;
            this.field599 = this.field600;
            this.field600 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field1145; ++var8) {
                for (int var9 = 0; var9 < arg1.field1144; ++var9) {
                    if (arg1.field1142[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field1146;
                        int var11 = var8 + 16 + arg1.field1147;
                        int var12 = (var11 << 7) + var10;
                        this.field599[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public final void method98(int arg0, String arg1, byte arg2) {
        this.field265 = arg0;
        this.field393 = arg1;
        this.method122(-505);
        if (arg2 != 1) {
            this.field572 = null;
        }
        if (this.field326 == null) {
            super.method98(arg0, arg1, (byte) 1);
        } else {
            this.field329.method584(-186);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field452.method331((byte) 3, var5 / 2 - 26 - var6, 16777215, "RuneScape is loading - please wait...", var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            class5.method30(304, 9179409, var4 / 2 - 152, -41001, 34, var7);
            class5.method30(302, 0, var4 / 2 - 151, -41001, 32, var7 + 1);
            class5.method29(var4 / 2 - 150, 35224, arg0 * 3, 9179409, var7 + 2, 30);
            class5.method29(arg0 * 3 + (var4 / 2 - 150), 35224, 300 - arg0 * 3, 0, var7 + 2, 30);
            this.field452.method331((byte) 3, var5 / 2 + 5 - var6, 16777215, arg1, var4 / 2);
            this.field329.method585(super.field1104, 171, 904, 202);
            if (this.field146) {
                this.field146 = false;
                if (!this.field147) {
                    this.field330.method585(super.field1104, 0, 904, 0);
                    this.field331.method585(super.field1104, 0, 904, 637);
                }
                this.field327.method585(super.field1104, 0, 904, 128);
                this.field328.method585(super.field1104, 371, 904, 202);
                this.field332.method585(super.field1104, 265, 904, 0);
                this.field333.method585(super.field1104, 265, 904, 562);
                this.field334.method585(super.field1104, 171, 904, 128);
                this.field335.method585(super.field1104, 171, 904, 562);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method99(int arg0) {
        this.field299 = 0;
        for (int var2 = -1; var2 < this.field282 + this.field252; ++var2) {
            class11 var19;
            if (var2 == -1) {
                var19 = field238;
            } else if (var2 < this.field252) {
                var19 = this.field251[this.field253[var2]];
            } else {
                var19 = this.field281[this.field283[var2 - this.field252]];
            }
            if (var19 != null && var19.method40(772)) {
                if (var19 instanceof class30) {
                    class48 var20 = ((class30) var19).field999;
                    if (var20.field1363 != null) {
                        var20 = var20.method508(863);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field252) {
                    class48 var23 = ((class30) var19).field999;
                    if (var23.field1352 >= 0 && var23.field1352 < this.field376.length) {
                        this.method71(var19, (byte) -102, var19.field705 + 15);
                        if (this.field476 > -1) {
                            this.field376[var23.field1352].method215(1, this.field476 - 12, this.field477 - 30);
                        }
                    }
                    if (this.field391 == 1 && this.field283[var2 - this.field252] == this.field318 && field598 % 20 < 10) {
                        this.method71(var19, (byte) -102, var19.field705 + 15);
                        if (this.field476 > -1) {
                            this.field570[0].method215(1, this.field476 - 12, this.field477 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class7 var22 = (class7) var19;
                    if (var22.field81 != -1 || var22.field94 != -1) {
                        this.method71(var19, (byte) -102, var19.field705 + 15);
                        if (this.field476 > -1) {
                            if (var22.field81 != -1) {
                                this.field407[var22.field81].method215(1, this.field476 - 12, this.field477 - var21);
                                var21 += 25;
                            }
                            if (var22.field94 != -1) {
                                this.field376[var22.field94].method215(1, this.field476 - 12, this.field477 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field391 == 10 && this.field253[var2] == this.field186) {
                        this.method71(var19, (byte) -102, var19.field705 + 15);
                        if (this.field476 > -1) {
                            this.field570[1].method215(1, this.field476 - 12, this.field477 - var21);
                        }
                    }
                }
                if (var19.field699 != null && (var2 >= this.field252 || this.field213 == 0 || this.field213 == 3 || this.field213 == 1 && this.method124(7, ((class7) var19).field101))) {
                    this.method71(var19, (byte) -102, var19.field705);
                    if (this.field476 > -1 && this.field299 < this.field300) {
                        this.field304[this.field299] = this.field452.method334((byte) -19, var19.field699) / 2;
                        this.field303[this.field299] = this.field452.field892;
                        this.field301[this.field299] = this.field476;
                        this.field302[this.field299] = this.field477;
                        this.field305[this.field299] = var19.field693;
                        this.field306[this.field299] = var19.field662;
                        this.field307[this.field299] = var19.field707;
                        this.field308[this.field299++] = var19.field699;
                        if (this.field215 == 0 && var19.field662 >= 1 && var19.field662 <= 3) {
                            this.field303[this.field299] += 10;
                            this.field302[this.field299] += 5;
                        }
                        if (this.field215 == 0 && var19.field662 == 4) {
                            this.field304[this.field299] = 60;
                        }
                        if (this.field215 == 0 && var19.field662 == 5) {
                            this.field303[this.field299] += 5;
                        }
                    }
                }
                if (var19.field669 > field598) {
                    this.method71(var19, (byte) -102, var19.field705 + 15);
                    if (this.field476 > -1) {
                        int var24 = var19.field670 * 30 / var19.field671;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class5.method29(this.field476 - 15, 35224, var24, 65280, this.field477 - 3, 5);
                        class5.method29(this.field476 - 15 + var24, 35224, 30 - var24, 16711680, this.field477 - 3, 5);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field652[var25] > field598) {
                        this.method71(var19, (byte) -102, var19.field705 / 2);
                        if (this.field476 > -1) {
                            if (var25 == 1) {
                                this.field477 -= 20;
                            }
                            if (var25 == 2) {
                                this.field476 -= 15;
                                this.field477 -= 10;
                            }
                            if (var25 == 3) {
                                this.field476 += 15;
                                this.field477 -= 10;
                            }
                            this.field409[var19.field651[var25]].method215(1, this.field476 - 12, this.field477 - 12);
                            this.field450.method331((byte) 3, this.field477 + 4, 0, String.valueOf(var19.field650[var25]), this.field476);
                            this.field450.method331((byte) 3, this.field477 + 3, 16777215, String.valueOf(var19.field650[var25]), this.field476 - 1);
                        }
                    }
                }
            }
        }
        if (arg0 >= 0) {
            this.method133();
        }
        for (int var3 = 0; var3 < this.field299; ++var3) {
            int var4 = this.field301[var3];
            int var5 = this.field302[var3];
            int var6 = this.field304[var3];
            int var7 = this.field303[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field302[var18] - this.field303[var18] && var5 - var7 < this.field302[var18] + 2 && var4 - var6 < this.field304[var18] + this.field301[var18] && var4 + var6 > this.field301[var18] - this.field304[var18] && this.field302[var18] - this.field303[var18] < var5) {
                        var5 = this.field302[var18] - this.field303[var18];
                        var8 = true;
                    }
                }
            }
            this.field476 = this.field301[var3];
            this.field477 = this.field302[var3] = var5;
            String var9 = this.field308[var3];
            if (this.field215 == 0) {
                int var10 = 16776960;
                if (this.field305[var3] < 6) {
                    var10 = this.field551[this.field305[var3]];
                }
                if (this.field305[var3] == 6) {
                    var10 = this.field518 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field305[var3] == 7) {
                    var10 = this.field518 % 20 < 10 ? 255 : 65535;
                }
                if (this.field305[var3] == 8) {
                    var10 = this.field518 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field305[var3] == 9) {
                    int var11 = 150 - this.field307[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field305[var3] == 10) {
                    int var12 = 150 - this.field307[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field305[var3] == 11) {
                    int var13 = 150 - this.field307[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field306[var3] == 0) {
                    this.field452.method331((byte) 3, this.field477 + 1, 0, var9, this.field476);
                    this.field452.method331((byte) 3, this.field477, var10, var9, this.field476);
                }
                if (this.field306[var3] == 1) {
                    this.field452.method336(0, this.field462, var9, this.field518, this.field477 + 1, this.field476);
                    this.field452.method336(var10, this.field462, var9, this.field518, this.field477, this.field476);
                }
                if (this.field306[var3] == 2) {
                    this.field452.method337(666, this.field518, var9, this.field477 + 1, this.field476, 0);
                    this.field452.method337(666, this.field518, var9, this.field477, this.field476, var10);
                }
                if (this.field306[var3] == 3) {
                    this.field452.method338(var9, 0, true, this.field477 + 1, this.field476, this.field518, 150 - this.field307[var3]);
                    this.field452.method338(var9, var10, true, this.field477, this.field476, this.field518, 150 - this.field307[var3]);
                }
                if (this.field306[var3] == 4) {
                    int var14 = this.field452.method334((byte) -19, var9);
                    int var15 = (150 - this.field307[var3]) * (var14 + 100) / 150;
                    class5.method26(0, this.field476 + 50, true, 334, this.field476 - 50);
                    this.field452.method335(this.field476 + 50 - var15, this.field477 + 1, var9, 47, 0);
                    this.field452.method335(this.field476 + 50 - var15, this.field477, var9, 47, var10);
                    class5.method25(this.field218);
                }
                if (this.field306[var3] == 5) {
                    int var16 = 150 - this.field307[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class5.method26(this.field477 - this.field452.field892 - 1, 512, true, this.field477 + 5, 0);
                    this.field452.method331((byte) 3, this.field477 + 1 + var17, 0, var9, this.field476);
                    this.field452.method331((byte) 3, this.field477 + var17, var10, var9, this.field476);
                    class5.method25(this.field218);
                }
            } else {
                this.field452.method331((byte) 3, this.field477 + 1, 0, var9, this.field476);
                this.field452.method331((byte) 3, this.field477, 16776960, var9, this.field476);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILEYMNCFMK;Z)V")
    private final void method100(int arg0, class18 arg1, boolean arg2) {
        this.field584 = 0;
        this.field254 = 0;
        this.method116((byte) 9, arg0, arg1);
        this.method111(arg0, 7, arg1);
        this.method141(-488, arg1, arg0);
        this.method172(arg1, 0, arg0);
        for (int var4 = 0; var4 < this.field584; ++var4) {
            int var6 = this.field585[var4];
            if (field598 != this.field251[var6].field683) {
                this.field251[var6] = null;
            }
        }
        if (arg2) {
            this.field572 = null;
        }
        if (arg1.field794 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field794 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field252; ++var5) {
                if (this.field251[this.field253[var5]] == null) {
                    signlink.reporterror(this.field180 + " null entry in pl list - pos:" + var5 + " size:" + this.field252);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLCUNQMRTU;)V")
    private final void method101(boolean arg0, class10 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0) {
            this.field445 = this.field487.method239();
        }
        if (arg1.field639 == 0) {
            var3 = this.field285.method305(arg1.field638, arg1.field640, arg1.field641);
        }
        if (arg1.field639 == 1) {
            var3 = this.field285.method306(-46323, arg1.field641, arg1.field640, arg1.field638);
        }
        if (arg1.field639 == 2) {
            var3 = this.field285.method307(arg1.field638, arg1.field640, arg1.field641);
        }
        if (arg1.field639 == 3) {
            var3 = this.field285.method308(arg1.field638, arg1.field640, arg1.field641);
        }
        if (var3 != 0) {
            int var7 = this.field285.method309(arg1.field638, arg1.field640, arg1.field641, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field647 = var4;
        arg1.field649 = var5;
        arg1.field648 = var6;
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method102(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field474[(var2 - 2 << 7) + var3] = 255;
            }
        }
        if (arg0 != 0) {
            this.field460 = 363;
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field474[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field475[var14] = (this.field474[var14 - 1] + this.field474[var14 + 1] + this.field474[var14 - 128] + this.field474[var14 + 128]) / 4;
            }
        }
        this.field552 += 128;
        if (this.field552 > this.field599.length) {
            this.field552 -= this.field599.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method97(0, this.field267[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field475[var11 + 128] - this.field599[this.field552 + var11 & this.field599.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field474[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field611[var8] = this.field611[var8 + 1];
        }
        this.field611[var2 - 1] = (int) (Math.sin((double) field598 / 14.0D) * 16.0D + Math.sin((double) field598 / 15.0D) * 14.0D + Math.sin((double) field598 / 16.0D) * 12.0D);
        if (this.field202 > 0) {
            this.field202 -= 4;
        }
        if (this.field203 > 0) {
            this.field203 -= 4;
        }
        if (this.field202 == 0 && this.field203 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field202 = 1024;
            }
            if (var9 == 1) {
                this.field203 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ[B)V")
    public final void method103(boolean arg0, boolean arg1, byte[] arg2) {
        if (this.field461) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg2, arg2.length);
            if (arg1) {
                this.field572 = null;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field208 = Integer.parseInt(this.getParameter("nodeid"));
        field209 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method179(0);
        } else {
            method90(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field210 = false;
        } else {
            field210 = true;
        }
        this.method387(503, 35865, 765);
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method104(int arg0) {
        if (arg0 != 0) {
            this.method133();
        }
        if (super.field1118 == 1) {
            if (super.field1119 >= 539 && super.field1119 <= 573 && super.field1120 >= 169 && super.field1120 < 205 && this.field619[0] != -1) {
                this.field352 = true;
                this.field389 = 0;
                this.field216 = true;
            }
            if (super.field1119 >= 569 && super.field1119 <= 599 && super.field1120 >= 168 && super.field1120 < 205 && this.field619[1] != -1) {
                this.field352 = true;
                this.field389 = 1;
                this.field216 = true;
            }
            if (super.field1119 >= 597 && super.field1119 <= 627 && super.field1120 >= 168 && super.field1120 < 205 && this.field619[2] != -1) {
                this.field352 = true;
                this.field389 = 2;
                this.field216 = true;
            }
            if (super.field1119 >= 625 && super.field1119 <= 669 && super.field1120 >= 168 && super.field1120 < 203 && this.field619[3] != -1) {
                this.field352 = true;
                this.field389 = 3;
                this.field216 = true;
            }
            if (super.field1119 >= 666 && super.field1119 <= 696 && super.field1120 >= 168 && super.field1120 < 205 && this.field619[4] != -1) {
                this.field352 = true;
                this.field389 = 4;
                this.field216 = true;
            }
            if (super.field1119 >= 694 && super.field1119 <= 724 && super.field1120 >= 168 && super.field1120 < 205 && this.field619[5] != -1) {
                this.field352 = true;
                this.field389 = 5;
                this.field216 = true;
            }
            if (super.field1119 >= 722 && super.field1119 <= 756 && super.field1120 >= 169 && super.field1120 < 205 && this.field619[6] != -1) {
                this.field352 = true;
                this.field389 = 6;
                this.field216 = true;
            }
            if (super.field1119 >= 540 && super.field1119 <= 574 && super.field1120 >= 466 && super.field1120 < 502 && this.field619[7] != -1) {
                this.field352 = true;
                this.field389 = 7;
                this.field216 = true;
            }
            if (super.field1119 >= 572 && super.field1119 <= 602 && super.field1120 >= 466 && super.field1120 < 503 && this.field619[8] != -1) {
                this.field352 = true;
                this.field389 = 8;
                this.field216 = true;
            }
            if (super.field1119 >= 599 && super.field1119 <= 629 && super.field1120 >= 466 && super.field1120 < 503 && this.field619[9] != -1) {
                this.field352 = true;
                this.field389 = 9;
                this.field216 = true;
            }
            if (super.field1119 >= 627 && super.field1119 <= 671 && super.field1120 >= 467 && super.field1120 < 502 && this.field619[10] != -1) {
                this.field352 = true;
                this.field389 = 10;
                this.field216 = true;
            }
            if (super.field1119 >= 669 && super.field1119 <= 699 && super.field1120 >= 466 && super.field1120 < 503 && this.field619[11] != -1) {
                this.field352 = true;
                this.field389 = 11;
                this.field216 = true;
            }
            if (super.field1119 >= 696 && super.field1119 <= 726 && super.field1120 >= 466 && super.field1120 < 503 && this.field619[12] != -1) {
                this.field352 = true;
                this.field389 = 12;
                this.field216 = true;
            }
            if (super.field1119 >= 724 && super.field1119 <= 758 && super.field1120 >= 466 && super.field1120 < 502 && this.field619[13] != -1) {
                this.field352 = true;
                this.field389 = 13;
                this.field216 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method105(boolean arg0) {
        this.field521 &= arg0;
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method390(-1372);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field455 != -1 && this.field579 == this.field455) {
                        if (var2 == 8 && this.field279.length() > 0) {
                            this.field279 = this.field279.substring(0, this.field279.length() - 1);
                        }
                        break;
                    }
                    if (this.field437) {
                        if (var2 >= 32 && var2 <= 122 && this.field395.length() < 80) {
                            this.field395 = this.field395 + (char) var2;
                            this.field221 = true;
                        }
                        if (var2 == 8 && this.field395.length() > 0) {
                            this.field395 = this.field395.substring(0, this.field395.length() - 1);
                            this.field221 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field437 = false;
                            this.field221 = true;
                            if (this.field454 == 1) {
                                long var3 = class32.method380(this.field395);
                                this.method188(true, var3);
                            }
                            if (this.field454 == 2 && this.field365 > 0) {
                                long var5 = class32.method380(this.field395);
                                this.method167(false, var5);
                            }
                            if (this.field454 == 3 && this.field395.length() > 0) {
                                this.field319.method228(228, true);
                                this.field319.method229(0);
                                int var7 = this.field319.field794;
                                this.field319.method235(this.field537, 5);
                                class26.method354(0, this.field319, this.field395);
                                this.field319.method238(-844, this.field319.field794 - var7);
                                this.field395 = class26.method355(false, this.field395);
                                this.field395 = class47.method480(false, this.field395);
                                this.method110(0, 6, class32.method384(this.field368, class32.method381(this.field537, (byte) 82)), this.field395);
                                if (this.field581 == 2) {
                                    this.field581 = 1;
                                    this.field402 = true;
                                    this.field319.method228(225, true);
                                    this.field319.method229(this.field213);
                                    this.field319.method229(this.field581);
                                    this.field319.method229(this.field379);
                                }
                            }
                            if (this.field454 == 4 && this.field233 < 100) {
                                long var8 = class32.method380(this.field395);
                                this.method120(var8, 9);
                            }
                            if (this.field454 == 5 && this.field233 > 0) {
                                long var10 = class32.method380(this.field395);
                                this.method128((byte) 2, var10);
                            }
                        }
                    } else if (this.field524 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field212.length() < 10) {
                            this.field212 = this.field212 + (char) var2;
                            this.field221 = true;
                        }
                        if (var2 == 8 && this.field212.length() > 0) {
                            this.field212 = this.field212.substring(0, this.field212.length() - 1);
                            this.field221 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field212.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field212);
                                } catch (Exception var22) {
                                }
                                this.field319.method228(144, true);
                                this.field319.method233(var12);
                            }
                            this.field524 = 0;
                            this.field221 = true;
                        }
                    } else if (this.field524 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field212.length() < 12) {
                            this.field212 = this.field212 + (char) var2;
                            this.field221 = true;
                        }
                        if (var2 == 8 && this.field212.length() > 0) {
                            this.field212 = this.field212.substring(0, this.field212.length() - 1);
                            this.field221 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field212.length() > 0) {
                                this.field319.method228(60, true);
                                this.field319.method235(class32.method380(this.field212), 5);
                            }
                            this.field524 = 0;
                            this.field221 = true;
                        }
                    } else if (this.field524 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field212.length() < 40) {
                            this.field212 = this.field212 + (char) var2;
                            this.field221 = true;
                        }
                        if (var2 == 8 && this.field212.length() > 0) {
                            this.field212 = this.field212.substring(0, this.field212.length() - 1);
                            this.field221 = true;
                        }
                    } else if (this.field263 == -1 && this.field606 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field388.length() < 80) {
                            this.field388 = this.field388 + (char) var2;
                            this.field221 = true;
                        }
                        if (var2 == 8 && this.field388.length() > 0) {
                            this.field388 = this.field388.substring(0, this.field388.length() - 1);
                            this.field221 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field388.length() > 0) {
                            if (this.field535 == 2) {
                                if (this.field388.equals("::clientdrop")) {
                                    this.method175(0);
                                }
                                if (this.field388.equals("::lag")) {
                                    this.method56(1);
                                }
                                if (this.field388.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field345.method560(2, (byte) 7); ++var13) {
                                        this.field345.method563(2, (byte) 1, (byte) 8, var13);
                                    }
                                }
                                if (this.field388.equals("::fpson")) {
                                    field523 = true;
                                }
                                if (this.field388.equals("::fpsoff")) {
                                    field523 = false;
                                }
                                if (this.field388.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field620[var14].field1742[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field388.startsWith("::")) {
                                this.field319.method228(200, true);
                                this.field319.method229(this.field388.length() - 1);
                                this.field319.method236(this.field388.substring(2));
                            } else {
                                String var17 = this.field388.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field388 = this.field388.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field388 = this.field388.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field388 = this.field388.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field388 = this.field388.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field388 = this.field388.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field388 = this.field388.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field388 = this.field388.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field388 = this.field388.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field388 = this.field388.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field388 = this.field388.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field388 = this.field388.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field388 = this.field388.substring(6);
                                }
                                String var19 = this.field388.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field388 = this.field388.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field388 = this.field388.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field388 = this.field388.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field388 = this.field388.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field388 = this.field388.substring(6);
                                }
                                this.field319.method228(8, true);
                                this.field319.method229(0);
                                int var21 = this.field319.field794;
                                this.field280.field794 = 0;
                                class26.method354(0, this.field280, this.field388);
                                this.field319.method276(0, this.field280.field794, this.field280.field793, (byte) 4);
                                this.field319.method257(var20, 0);
                                this.field319.method256(var18, this.field441);
                                this.field319.method238(-844, this.field319.field794 - var21);
                                this.field388 = class26.method355(false, this.field388);
                                this.field388 = class47.method480(false, this.field388);
                                field238.field699 = this.field388;
                                field238.field693 = var18;
                                field238.field662 = var20;
                                field238.field707 = 150;
                                if (this.field535 == 2) {
                                    this.method110(0, 2, "@cr2@" + field238.field101, field238.field699);
                                } else if (this.field535 == 1) {
                                    this.method110(0, 2, "@cr1@" + field238.field101, field238.field699);
                                } else {
                                    this.method110(0, 2, field238.field101, field238.field699);
                                }
                                if (this.field213 == 2) {
                                    this.field213 = 3;
                                    this.field402 = true;
                                    this.field319.method228(225, true);
                                    this.field319.method229(this.field213);
                                    this.field319.method229(this.field581);
                                    this.field319.method229(this.field379);
                                }
                            }
                            this.field388 = "";
                            this.field221 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field279.length() < 12) {
                this.field279 = this.field279 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method106(int arg0) {
        int var2 = this.field452.method333("Choose Option", false);
        for (int var3 = 0; var3 < this.field546; ++var3) {
            int var11 = this.field452.method333(this.field227[var3], false);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field546 * 15 + 21;
        if (arg0 != -44689) {
            this.field445 = this.field487.method239();
        }
        if (super.field1119 > 4 && super.field1120 > 4 && super.field1119 < 516 && super.field1120 < 338) {
            int var5 = super.field1119 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1120 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field589 = true;
            this.field502 = 0;
            this.field503 = var5;
            this.field504 = var6;
            this.field505 = var2;
            this.field506 = this.field546 * 15 + 22;
        }
        if (super.field1119 > 553 && super.field1120 > 205 && super.field1119 < 743 && super.field1120 < 466) {
            int var7 = super.field1119 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1120 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field589 = true;
            this.field502 = 1;
            this.field503 = var7;
            this.field504 = var8;
            this.field505 = var2;
            this.field506 = this.field546 * 15 + 22;
        }
        if (super.field1119 > 17 && super.field1120 > 357 && super.field1119 < 496 && super.field1120 < 453) {
            int var9 = super.field1119 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1120 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field589 = true;
            this.field502 = 2;
            this.field503 = var9;
            this.field504 = var10;
            this.field505 = var2;
            this.field506 = this.field546 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method107(byte arg0) {
        if (this.field556 == null) {
            this.method79(0);
            super.field1105 = null;
            this.field327 = null;
            this.field328 = null;
            this.field329 = null;
            this.field330 = null;
            if (arg0 == 9) {
                boolean var2 = false;
            } else {
                this.field424 = 245;
            }
            this.field331 = null;
            this.field332 = null;
            this.field333 = null;
            this.field334 = null;
            this.field335 = null;
            this.field556 = new class70(this.method57(-5092), 479, 96, (byte) 52);
            this.field554 = new class70(this.method57(-5092), 172, 156, (byte) 52);
            class5.method27(468);
            this.field485.method401(1, 0, 0);
            this.field553 = new class70(this.method57(-5092), 190, 261, (byte) 52);
            this.field555 = new class70(this.method57(-5092), 512, 334, (byte) 52);
            class5.method27(468);
            this.field624 = new class70(this.method57(-5092), 496, 50, (byte) 52);
            this.field625 = new class70(this.method57(-5092), 269, 37, (byte) 52);
            this.field626 = new class70(this.method57(-5092), 249, 45, (byte) 52);
            this.field146 = true;
            this.field555.method584(-186);
            class3.field42 = this.field350;
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method108(int arg0) {
        for (int var2 = -1; var2 < this.field252; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field250;
            } else {
                var6 = this.field253[var2];
            }
            class7 var7 = this.field251[var6];
            if (var7 != null && var7.field707 > 0) {
                --var7.field707;
                if (var7.field707 == 0) {
                    var7.field699 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field282; ++var3) {
            int var4 = this.field283[var3];
            class30 var5 = this.field281[var4];
            if (var5 != null && var5.field707 > 0) {
                --var5.field707;
                if (var5.field707 == 0) {
                    var5.field699 = null;
                }
            }
        }
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
    public final boolean method109(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class63 var5 = class63.method544(arg1);
        for (int var6 = 0; var6 < var5.field1513.length && var5.field1513[var6] != -1; ++var6) {
            class63 var7 = class63.method544(var5.field1513[var6]);
            if (var7.field1573 == 0) {
                var4 |= this.method109(arg0, var7.field1558, 0);
            }
            if (var7.field1573 == 6 && (var7.field1542 != -1 || var7.field1543 != -1)) {
                boolean var8 = this.method82(var7, true);
                int var9;
                if (var8) {
                    var9 = var7.field1543;
                } else {
                    var9 = var7.field1542;
                }
                if (var9 != -1) {
                    class14 var10 = class14.field717[var9];
                    var7.field1528 += arg0;
                    while (var7.field1528 > var10.method207((byte) 6, var7.field1550)) {
                        var7.field1528 -= var10.method207((byte) 6, var7.field1550);
                        ++var7.field1550;
                        if (var7.field1550 >= var10.field718) {
                            var7.field1550 -= var10.field722;
                            if (var7.field1550 < 0 || var7.field1550 >= var10.field718) {
                                var7.field1550 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1573 == 6 && var7.field1549 != 0) {
                int var11 = var7.field1549 >> 16;
                int var12 = var7.field1549 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field1556 = var7.field1556 + var13 & 2047;
                var7.field1557 = var7.field1557 + var14 & 2047;
                var4 = true;
            }
        }
        this.field444 += arg2;
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 371);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field208 = Integer.parseInt(arg0[0]);
                field209 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method179(0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method90(true);
                }
                if (arg0[3].equals("free")) {
                    field210 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field210 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method386(503, -92, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method110(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field438 != -1) {
            this.field143 = arg3;
            super.field1118 = 0;
        }
        if (this.field263 == -1) {
            this.field221 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field360[var5] = this.field360[var5 - 1];
            this.field361[var5] = this.field361[var5 - 1];
            this.field362[var5] = this.field362[var5 - 1];
        }
        this.field360[0] = arg1;
        this.field444 += arg0;
        this.field361[0] = arg2;
        this.field362[0] = arg3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILEYMNCFMK;)V")
    private final void method111(int arg0, int arg1, class18 arg2) {
        int var4 = arg2.method250((byte) 79, 8);
        if (arg1 < 7 || arg1 > 7) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 < this.field252) {
            for (int var6 = var4; var6 < this.field252; ++var6) {
                this.field585[this.field584++] = this.field253[var6];
            }
        }
        if (var4 > this.field252) {
            signlink.reporterror(this.field180 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field252 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field253[var7];
                class7 var9 = this.field251[var8];
                int var10 = arg2.method250((byte) 79, 1);
                if (var10 == 0) {
                    this.field253[this.field252++] = var8;
                    var9.field683 = field598;
                } else {
                    int var11 = arg2.method250((byte) 79, 2);
                    if (var11 == 0) {
                        this.field253[this.field252++] = var8;
                        var9.field683 = field598;
                        this.field255[this.field254++] = var8;
                    } else if (var11 == 1) {
                        this.field253[this.field252++] = var8;
                        var9.field683 = field598;
                        int var12 = arg2.method250((byte) 79, 3);
                        var9.method196(false, false, var12);
                        int var13 = arg2.method250((byte) 79, 1);
                        if (var13 == 1) {
                            this.field255[this.field254++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field253[this.field252++] = var8;
                        var9.field683 = field598;
                        int var14 = arg2.method250((byte) 79, 3);
                        var9.method196(true, false, var14);
                        int var15 = arg2.method250((byte) 79, 3);
                        var9.method196(true, false, var15);
                        int var16 = arg2.method250((byte) 79, 1);
                        if (var16 == 1) {
                            this.field255[this.field254++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field585[this.field584++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method112(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field151 == 0 && this.field628 == 0) {
            this.field227[this.field546] = "Walk here";
            this.field189[this.field546] = 842;
            this.field187[this.field546] = super.field1112;
            this.field188[this.field546] = super.field1113;
            ++this.field546;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < class41.field1250; ++var4) {
            int var5 = class41.field1251[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var3 != var5) {
                var3 = var5;
                if (var8 == 2 && this.field285.method309(this.field274, var6, var7, var5) >= 0) {
                    class64 var10 = class64.method548(var9);
                    if (var10.field1591 != null) {
                        var10 = var10.method552((byte) -23);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field151 == 1) {
                        this.field227[this.field546] = "Use " + this.field155 + " with @cya@" + var10.field1590;
                        this.field189[this.field546] = 82;
                        this.field190[this.field546] = var5;
                        this.field187[this.field546] = var6;
                        this.field188[this.field546] = var7;
                        ++this.field546;
                    } else if (this.field628 == 1) {
                        if ((this.field630 & 4) == 4) {
                            this.field227[this.field546] = this.field631 + " @cya@" + var10.field1590;
                            this.field189[this.field546] = 499;
                            this.field190[this.field546] = var5;
                            this.field187[this.field546] = var6;
                            this.field188[this.field546] = var7;
                            ++this.field546;
                        }
                    } else {
                        if (var10.field1622 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1622[var11] != null) {
                                    this.field227[this.field546] = var10.field1622[var11] + " @cya@" + var10.field1590;
                                    if (var11 == 0) {
                                        this.field189[this.field546] = 26;
                                    }
                                    if (var11 == 1) {
                                        this.field189[this.field546] = 534;
                                    }
                                    if (var11 == 2) {
                                        this.field189[this.field546] = 400;
                                    }
                                    if (var11 == 3) {
                                        this.field189[this.field546] = 744;
                                    }
                                    if (var11 == 4) {
                                        this.field189[this.field546] = 1039;
                                    }
                                    this.field190[this.field546] = var5;
                                    this.field187[this.field546] = var6;
                                    this.field188[this.field546] = var7;
                                    ++this.field546;
                                }
                            }
                        }
                        this.field227[this.field546] = "Examine @cya@" + var10.field1590;
                        this.field189[this.field546] = 1498;
                        this.field190[this.field546] = var10.field1579 << 14;
                        this.field187[this.field546] = var6;
                        this.field188[this.field546] = var7;
                        ++this.field546;
                    }
                }
                if (var8 == 1) {
                    class30 var12 = this.field281[var9];
                    if (var12.field999.field1347 == 1 && (var12.field659 & 127) == 64 && (var12.field660 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field282; ++var13) {
                            class30 var16 = this.field281[this.field283[var13]];
                            if (var16 != null && var12 != var16 && var16.field999.field1347 == 1 && var12.field659 == var16.field659 && var12.field660 == var16.field660) {
                                this.method170(this.field283[var13], var7, (byte) -70, var6, var16.field999);
                            }
                        }
                        for (int var14 = 0; var14 < this.field252; ++var14) {
                            class7 var15 = this.field251[this.field253[var14]];
                            if (var15 != null && var12.field659 == var15.field659 && var12.field660 == var15.field660) {
                                this.method52((byte) -45, var7, this.field253[var14], var6, var15);
                            }
                        }
                    }
                    this.method170(var9, var7, (byte) -70, var6, var12.field999);
                }
                if (var8 == 0) {
                    class7 var17 = this.field251[var9];
                    if ((var17.field659 & 127) == 64 && (var17.field660 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field282; ++var18) {
                            class30 var21 = this.field281[this.field283[var18]];
                            if (var21 != null && var21.field999.field1347 == 1 && var17.field659 == var21.field659 && var17.field660 == var21.field660) {
                                this.method170(this.field283[var18], var7, (byte) -70, var6, var21.field999);
                            }
                        }
                        for (int var19 = 0; var19 < this.field252; ++var19) {
                            class7 var20 = this.field251[this.field253[var19]];
                            if (var20 != null && var17 != var20 && var17.field659 == var20.field659 && var17.field660 == var20.field660) {
                                this.method52((byte) -45, var7, this.field253[var19], var6, var20);
                            }
                        }
                    }
                    this.method52((byte) -45, var7, var9, var6, var17);
                }
                if (var8 == 3) {
                    class12 var22 = this.field572[this.field274][var6][var7];
                    if (var22 != null) {
                        for (class61 var23 = (class61) var22.method201(2); var23 != null; var23 = (class61) var22.method203(-431)) {
                            class31 var24 = class31.method376(var23.field1496);
                            if (this.field151 == 1) {
                                this.field227[this.field546] = "Use " + this.field155 + " with @lre@" + var24.field1009;
                                this.field189[this.field546] = 823;
                                this.field190[this.field546] = var23.field1496;
                                this.field187[this.field546] = var6;
                                this.field188[this.field546] = var7;
                                ++this.field546;
                            } else if (this.field628 == 1) {
                                if ((this.field630 & 1) == 1) {
                                    this.field227[this.field546] = this.field631 + " @lre@" + var24.field1009;
                                    this.field189[this.field546] = 652;
                                    this.field190[this.field546] = var23.field1496;
                                    this.field187[this.field546] = var6;
                                    this.field188[this.field546] = var7;
                                    ++this.field546;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1017 != null && var24.field1017[var25] != null) {
                                        this.field227[this.field546] = var24.field1017[var25] + " @lre@" + var24.field1009;
                                        if (var25 == 0) {
                                            this.field189[this.field546] = 642;
                                        }
                                        if (var25 == 1) {
                                            this.field189[this.field546] = 868;
                                        }
                                        if (var25 == 2) {
                                            this.field189[this.field546] = 10;
                                        }
                                        if (var25 == 3) {
                                            this.field189[this.field546] = 87;
                                        }
                                        if (var25 == 4) {
                                            this.field189[this.field546] = 705;
                                        }
                                        this.field190[this.field546] = var23.field1496;
                                        this.field187[this.field546] = var6;
                                        this.field188[this.field546] = var7;
                                        ++this.field546;
                                    } else if (var25 == 2) {
                                        this.field227[this.field546] = "Take @lre@" + var24.field1009;
                                        this.field189[this.field546] = 10;
                                        this.field190[this.field546] = var23.field1496;
                                        this.field187[this.field546] = var6;
                                        this.field188[this.field546] = var7;
                                        ++this.field546;
                                    }
                                }
                                this.field227[this.field546] = "Examine @lre@" + var24.field1009;
                                this.field189[this.field546] = 1937;
                                this.field190[this.field546] = var23.field1496;
                                this.field187[this.field546] = var6;
                                this.field188[this.field546] = var7;
                                ++this.field546;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method113(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILEYMNCFMK;)V")
    private final void method114(int arg0, int arg1, class18 arg2) {
        while (true) {
            if (arg2.field795 + 21 < arg0 * 8) {
                int var4 = arg2.method250((byte) 79, 14);
                if (var4 != 16383) {
                    if (this.field281[var4] == null) {
                        this.field281[var4] = new class30();
                    }
                    class30 var5 = this.field281[var4];
                    this.field283[this.field282++] = var4;
                    var5.field683 = field598;
                    int var6 = arg2.method250((byte) 79, 1);
                    var5.field999 = class48.method512(arg2.method250((byte) 79, 13));
                    int var7 = arg2.method250((byte) 79, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method250((byte) 79, 1);
                    if (var8 == 1) {
                        this.field255[this.field254++] = var4;
                    }
                    int var9 = arg2.method250((byte) 79, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field681 = var5.field999.field1347;
                    var5.field696 = var5.field999.field1357;
                    var5.field665 = var5.field999.field1351;
                    var5.field666 = var5.field999.field1358;
                    var5.field667 = var5.field999.field1359;
                    var5.field668 = var5.field999.field1361;
                    var5.field697 = var5.field999.field1353;
                    var5.method195(var6 == 1, field238.field664[0] + var7, true, field238.field663[0] + var9);
                    continue;
                }
            }
            arg2.method251(this.field590);
            if (arg1 < 0 || arg1 > 0) {
                this.field218 = -59;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method115(int arg0, int arg1) {
        if (arg1 != 46534) {
            this.field319.method229(250);
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILEYMNCFMK;)V")
    private final void method116(byte arg0, int arg1, class18 arg2) {
        if (arg0 == 9) {
            boolean var4 = false;
        } else {
            this.field319.method229(172);
        }
        arg2.method249((byte) 9);
        int var5 = arg2.method250((byte) 79, 1);
        if (var5 != 0) {
            int var6 = arg2.method250((byte) 79, 2);
            if (var6 == 0) {
                this.field255[this.field254++] = this.field250;
            } else if (var6 == 1) {
                int var7 = arg2.method250((byte) 79, 3);
                field238.method196(false, false, var7);
                int var8 = arg2.method250((byte) 79, 1);
                if (var8 == 1) {
                    this.field255[this.field254++] = this.field250;
                }
            } else if (var6 == 2) {
                int var9 = arg2.method250((byte) 79, 3);
                field238.method196(true, false, var9);
                int var10 = arg2.method250((byte) 79, 3);
                field238.method196(true, false, var10);
                int var11 = arg2.method250((byte) 79, 1);
                if (var11 == 1) {
                    this.field255[this.field254++] = this.field250;
                }
            } else if (var6 == 3) {
                int var12 = arg2.method250((byte) 79, 1);
                if (var12 == 1) {
                    this.field255[this.field254++] = this.field250;
                }
                int var13 = arg2.method250((byte) 79, 7);
                this.field274 = arg2.method250((byte) 79, 2);
                int var14 = arg2.method250((byte) 79, 7);
                int var15 = arg2.method250((byte) 79, 1);
                field238.method195(var15 == 1, var14, true, var13);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
    public final void method117(int arg0, boolean arg1) {
        if (arg1) {
            this.field445 = this.field487.method239();
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method118(boolean arg0) {
        this.field319.method228(64, true);
        if (arg0) {
            this.field445 = this.field487.method239();
        }
        if (this.field369 != -1) {
            this.method181(false, this.field369);
            this.field369 = -1;
            this.field352 = true;
            this.field588 = false;
            this.field216 = true;
        }
        if (this.field263 != -1) {
            this.method181(false, this.field263);
            this.field263 = -1;
            this.field221 = true;
            this.field588 = false;
        }
        if (this.field606 != -1) {
            this.method181(false, this.field606);
            this.field606 = -1;
            this.field146 = true;
        }
        if (this.field204 != -1) {
            this.method181(false, this.field204);
            this.field204 = -1;
        }
        if (this.field455 != -1) {
            this.method181(false, this.field455);
            this.field455 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method119(int arg0) {
        class1 var2 = (class1) this.field185.method200();
        if (arg0 < 0) {
            while (var2 != null) {
                if (this.field274 == var2.field3 && !var2.field8) {
                    if (field598 >= var2.field7) {
                        var2.method2(759, this.field159);
                        if (var2.field8) {
                            var2.method205();
                        } else {
                            this.field285.method290(60, this.field621, 0, var2.field3, var2.field5, false, var2.field6, -1, var2, var2.field4);
                        }
                    }
                } else {
                    var2.method205();
                }
                var2 = (class1) this.field185.method202(569);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method120(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field233 >= 100) {
                this.method110(0, 0, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class32.method384(this.field368, class32.method381(arg0, (byte) 82));
                for (int var5 = 0; var5 < this.field233; ++var5) {
                    if (this.field392[var5] == arg0) {
                        this.method110(0, 0, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field365; ++var6) {
                    if (this.field165[var6] == arg0) {
                        this.method110(0, 0, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field392[this.field233++] = arg0;
                if (arg1 < 9 || arg1 > 9) {
                    this.field445 = -1;
                }
                this.field352 = true;
                this.field319.method228(74, true);
                this.field319.method235(arg0, 5);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(IZ)V")
    public final void method121(int arg0, boolean arg1) {
        if (arg0 == 0) {
            this.method122(-505);
            this.field329.method584(-186);
            this.field418.method401(1, 0, 0);
            short var3 = 360;
            short var4 = 200;
            if (this.field278 == 0) {
                int var5 = var4 / 2 + 80;
                this.field450.method332(7711145, true, var5, 0, var3 / 2, this.field345.field1682);
                int var6 = var4 / 2 - 20;
                this.field452.method332(16776960, true, var6, 0, var3 / 2, "Welcome to RuneScape");
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field419.method401(1, var7 - 73, var8 - 20);
                this.field452.method332(16777215, true, var8 + 5, 0, var7, "New User");
                int var9 = var3 / 2 + 80;
                this.field419.method401(1, var9 - 73, var8 - 20);
                this.field452.method332(16777215, true, var8 + 5, 0, var9, "Existing User");
            }
            if (this.field278 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field593.length() > 0) {
                    this.field452.method332(16776960, true, var10 - 15, 0, var3 / 2, this.field593);
                    this.field452.method332(16776960, true, var10, 0, var3 / 2, this.field594);
                    var10 += 30;
                } else {
                    this.field452.method332(16776960, true, var10 - 7, 0, var3 / 2, this.field594);
                    var10 += 30;
                }
                this.field452.method339(true, "Username: " + this.field180 + (this.field259 == 0 & field598 % 40 < 20 ? "@yel@|" : ""), var10, 16777215, var3 / 2 - 90, -48148);
                var10 += 15;
                this.field452.method339(true, "Password: " + class32.method385(false, this.field181) + (this.field259 == 1 & field598 % 40 < 20 ? "@yel@|" : ""), var10, 16777215, var3 / 2 - 88, -48148);
                var10 += 15;
                if (!arg1) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field419.method401(1, var11 - 73, var12 - 20);
                    this.field452.method332(16777215, true, var12 + 5, 0, var11, "Login");
                    int var13 = var3 / 2 + 80;
                    this.field419.method401(1, var13 - 73, var12 - 20);
                    this.field452.method332(16777215, true, var12 + 5, 0, var13, "Cancel");
                }
            }
            if (this.field278 == 3) {
                this.field452.method332(16776960, true, var4 / 2 - 60, 0, var3 / 2, "Create a free account");
                int var14 = var4 / 2 - 35;
                this.field452.method332(16777215, true, var14, 0, var3 / 2, "To create a new account you need to");
                int var18 = var14 + 15;
                this.field452.method332(16777215, true, var18, 0, var3 / 2, "go back to the main RuneScape webpage");
                int var19 = var18 + 15;
                this.field452.method332(16777215, true, var19, 0, var3 / 2, "and choose the 'create account'");
                int var20 = var19 + 15;
                this.field452.method332(16777215, true, var20, 0, var3 / 2, "button near the top of that page.");
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field419.method401(1, var15 - 73, var16 - 20);
                this.field452.method332(16777215, true, var16 + 5, 0, var15, "Cancel");
            }
            this.field329.method585(super.field1104, 171, 904, 202);
            if (this.field146) {
                this.field146 = false;
                this.field327.method585(super.field1104, 0, 904, 128);
                this.field328.method585(super.field1104, 371, 904, 202);
                this.field332.method585(super.field1104, 265, 904, 0);
                this.field333.method585(super.field1104, 265, 904, 562);
                this.field334.method585(super.field1104, 171, 904, 128);
                this.field335.method585(super.field1104, 171, 904, 562);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method122(int arg0) {
        if (this.field327 == null) {
            super.field1105 = null;
            this.field556 = null;
            this.field554 = null;
            this.field553 = null;
            this.field555 = null;
            this.field624 = null;
            this.field625 = null;
            this.field626 = null;
            this.field330 = new class70(this.method57(-5092), 128, 265, (byte) 52);
            class5.method27(468);
            this.field331 = new class70(this.method57(-5092), 128, 265, (byte) 52);
            class5.method27(468);
            this.field327 = new class70(this.method57(-5092), 509, 171, (byte) 52);
            class5.method27(468);
            this.field328 = new class70(this.method57(-5092), 360, 132, (byte) 52);
            class5.method27(468);
            this.field329 = new class70(this.method57(-5092), 360, 200, (byte) 52);
            class5.method27(468);
            this.field332 = new class70(this.method57(-5092), 202, 238, (byte) 52);
            class5.method27(468);
            this.field333 = new class70(this.method57(-5092), 203, 238, (byte) 52);
            while (arg0 >= 0) {
                this.method133();
            }
            class5.method27(468);
            this.field334 = new class70(this.method57(-5092), 74, 94, (byte) 52);
            class5.method27(468);
            this.field335 = new class70(this.method57(-5092), 75, 94, (byte) 52);
            class5.method27(468);
            if (this.field326 != null) {
                this.method76((byte) 5);
                this.method85(true);
            }
            this.field146 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field428.method401(1, arg1, arg0);
        this.field429.method401(1, arg1, arg0 + arg5 - 16);
        class5.method29(arg1, 35224, 16, this.field199, arg0 + 16, arg5 - 32);
        int var7 = (arg5 - 32) * arg5 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg2 / (arg4 - arg5);
        class5.method29(arg1, 35224, 16, this.field264, arg0 + 16 + var8, var7);
        class5.method34(607, this.field378, arg0 + 16 + var8, arg1, var7);
        this.field444 += arg3;
        class5.method34(607, this.field378, arg0 + 16 + var8, arg1 + 1, var7);
        class5.method32(arg0 + 16 + var8, this.field378, arg1, this.field550, 16);
        class5.method32(arg0 + 17 + var8, this.field378, arg1, this.field550, 16);
        class5.method34(607, this.field482, arg0 + 16 + var8, arg1 + 15, var7);
        class5.method34(607, this.field482, arg0 + 17 + var8, arg1 + 14, var7 - 1);
        class5.method32(arg0 + 15 + var8 + var7, this.field482, arg1, this.field550, 16);
        class5.method32(arg0 + 14 + var8 + var7, this.field482, arg1 + 1, this.field550, 15);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method124(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field365; ++var3) {
                if (arg1.equalsIgnoreCase(this.field520[var3])) {
                    return true;
                }
            }
            int var4 = 32 / arg0;
            return arg1.equalsIgnoreCase(field238.field101);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILVTUPBFSN;I)V")
    public final void method125(int arg0, int arg1, int arg2, class63 arg3, int arg4) {
        int var6 = 83 / arg4;
        if (arg3.field1573 == 0 && arg3.field1513 != null) {
            if (!arg3.field1509 || this.field269 == arg3.field1558 || this.field431 == arg3.field1558 || this.field534 == arg3.field1558) {
                int var7 = class5.field65;
                int var8 = class5.field63;
                int var9 = class5.field66;
                int var10 = class5.field64;
                class5.method26(arg1, arg3.field1541 + arg0, true, arg3.field1505 + arg1, arg0);
                int var11 = arg3.field1513.length;
                for (int var12 = 0; var12 < var11; ++var12) {
                    int var13 = arg3.field1519[var12] + arg0;
                    int var14 = arg3.field1527[var12] + arg1 - arg2;
                    class63 var15 = class63.method544(arg3.field1513[var12]);
                    int var16 = var15.field1544 + var13;
                    int var17 = var15.field1531 + var14;
                    if (var15.field1503 > 0) {
                        this.method154(0, var15);
                    }
                    if (var15.field1573 == 0) {
                        if (var15.field1533 > var15.field1502 - var15.field1505) {
                            var15.field1533 = var15.field1502 - var15.field1505;
                        }
                        if (var15.field1533 < 0) {
                            var15.field1533 = 0;
                        }
                        this.method125(var16, var17, var15.field1533, var15, 726);
                        if (var15.field1502 > var15.field1505) {
                            this.method123(var17, var15.field1541 + var16, var15.field1533, 0, var15.field1502, var15.field1505);
                        }
                    } else if (var15.field1573 != 1) {
                        if (var15.field1573 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field1505; ++var19) {
                                for (int var20 = 0; var20 < var15.field1541; ++var20) {
                                    int var21 = (var15.field1574 + 32) * var20 + var16;
                                    int var22 = (var15.field1536 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field1537[var18];
                                        var22 += var15.field1515[var18];
                                    }
                                    if (var15.field1572[var18] <= 0) {
                                        if (var15.field1551 != null && var18 < 20) {
                                            class16 var31 = var15.field1551[var18];
                                            if (var31 != null) {
                                                var31.method215(1, var21, var22);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field1572[var18] - 1;
                                        if (var21 > class5.field65 - 32 && var21 < class5.field66 && var22 > class5.field63 - 32 && var22 < class5.field64 || this.field412 != 0 && this.field411 == var18) {
                                            int var26 = 0;
                                            if (this.field151 == 1 && this.field152 == var18 && this.field153 == var15.field1558) {
                                                var26 = 16777215;
                                            }
                                            class16 var27 = class31.method373(var26, var15.field1567[var18], var25, false);
                                            if (var27 != null) {
                                                if (this.field412 != 0 && this.field411 == var18 && this.field410 == var15.field1558) {
                                                    var23 = super.field1112 - this.field413;
                                                    var24 = super.field1113 - this.field414;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field353 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method217(var22 + var24, var21 + var23, 128, false);
                                                    if (var22 + var24 < class5.field63 && arg3.field1533 > 0) {
                                                        int var28 = (class5.field63 - var22 - var24) * this.field159 / 3;
                                                        if (var28 > this.field159 * 10) {
                                                            var28 = this.field159 * 10;
                                                        }
                                                        if (var28 > arg3.field1533) {
                                                            var28 = arg3.field1533;
                                                        }
                                                        arg3.field1533 -= var28;
                                                        this.field414 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class5.field64 && arg3.field1533 < arg3.field1502 - arg3.field1505) {
                                                        int var29 = (var22 + var24 + 32 - class5.field64) * this.field159 / 3;
                                                        if (var29 > this.field159 * 10) {
                                                            var29 = this.field159 * 10;
                                                        }
                                                        if (var29 > arg3.field1502 - arg3.field1505 - arg3.field1533) {
                                                            var29 = arg3.field1502 - arg3.field1505 - arg3.field1533;
                                                        }
                                                        arg3.field1533 += var29;
                                                        this.field414 -= var29;
                                                    }
                                                } else if (this.field510 != 0 && this.field509 == var18 && this.field508 == var15.field1558) {
                                                    var27.method217(var22, var21, 128, false);
                                                } else {
                                                    var27.method215(1, var21, var22);
                                                }
                                                if (var27.field764 == 33 || var15.field1567[var18] != 1) {
                                                    int var30 = var15.field1567[var18];
                                                    this.field450.method335(var21 + 1 + var23, var22 + 10 + var24, method159(var30, (byte) -8), 47, 0);
                                                    this.field450.method335(var21 + var23, var22 + 9 + var24, method159(var30, (byte) -8), 47, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field1573 == 3) {
                            boolean var32 = false;
                            if (this.field534 == var15.field1558 || this.field431 == var15.field1558 || this.field269 == var15.field1558) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method82(var15, true)) {
                                var33 = var15.field1510;
                                if (var32 && var15.field1524 != 0) {
                                    var33 = var15.field1524;
                                }
                            } else {
                                var33 = var15.field1520;
                                if (var32 && var15.field1571 != 0) {
                                    var33 = var15.field1571;
                                }
                            }
                            if (var15.field1563 == 0) {
                                if (var15.field1547) {
                                    class5.method29(var16, 35224, var15.field1541, var33, var17, var15.field1505);
                                } else {
                                    class5.method30(var15.field1541, var33, var16, -41001, var15.field1505, var17);
                                }
                            } else if (var15.field1547) {
                                class5.method28(var16, var15.field1541, var33, var17, (byte) -6, var15.field1505, 256 - (var15.field1563 & 255));
                            } else {
                                class5.method31(256 - (var15.field1563 & 255), var33, 0, var17, var16, var15.field1505, var15.field1541);
                            }
                        } else if (var15.field1573 == 4) {
                            class20 var34 = var15.field1535;
                            String var35 = var15.field1562;
                            boolean var36 = false;
                            if (this.field534 == var15.field1558 || this.field431 == var15.field1558 || this.field269 == var15.field1558) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method82(var15, true)) {
                                var37 = var15.field1510;
                                if (var36 && var15.field1524 != 0) {
                                    var37 = var15.field1524;
                                }
                                if (var15.field1516.length() > 0) {
                                    var35 = var15.field1516;
                                }
                            } else {
                                var37 = var15.field1520;
                                if (var36 && var15.field1571 != 0) {
                                    var37 = var15.field1571;
                                }
                            }
                            if (var15.field1500 == 6 && this.field588) {
                                var35 = "Please wait...";
                                var37 = var15.field1520;
                            }
                            if (class5.field61 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field892 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method115(this.method169(true, 4, var15), this.field567) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method115(this.method169(true, 3, var15), this.field567) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method115(this.method169(true, 2, var15), this.field567) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method115(this.method169(true, 1, var15), this.field567) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method115(this.method169(true, 0, var15), this.field567) + var35.substring(var39 + 2);
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
                                if (var15.field1525) {
                                    var34.method332(var37, var15.field1532, var38, 0, var15.field1541 / 2 + var16, var45);
                                } else {
                                    var34.method339(var15.field1532, var45, var38, var37, var16, -48148);
                                }
                                var38 += var34.field892;
                            }
                        } else if (var15.field1573 == 5) {
                            class16 var46;
                            if (this.method82(var15, true)) {
                                var46 = var15.field1552;
                            } else {
                                var46 = var15.field1529;
                            }
                            if (var46 != null) {
                                var46.method215(1, var16, var17);
                            }
                        } else if (var15.field1573 == 6) {
                            int var47 = class3.field36;
                            int var48 = class3.field37;
                            class3.field36 = var15.field1541 / 2 + var16;
                            class3.field37 = var15.field1505 / 2 + var17;
                            int var49 = class3.field40[var15.field1556] * var15.field1555 >> 16;
                            int var50 = class3.field41[var15.field1556] * var15.field1555 >> 16;
                            boolean var51 = this.method82(var15, true);
                            int var52;
                            if (var51) {
                                var52 = var15.field1543;
                            } else {
                                var52 = var15.field1542;
                            }
                            class41 var53;
                            if (var52 == -1) {
                                var53 = var15.method539(var51, 653, -1, -1);
                            } else {
                                class14 var54 = class14.field717[var52];
                                var53 = var15.method539(var51, 653, var54.field719[var15.field1550], var54.field720[var15.field1550]);
                            }
                            if (var53 != null) {
                                var53.method434(0, var15.field1557, 0, var15.field1556, 0, var49, var50);
                            }
                            class3.field36 = var47;
                            class3.field37 = var48;
                        } else {
                            if (var15.field1573 == 7) {
                                class20 var55 = var15.field1535;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field1505; ++var57) {
                                    for (int var58 = 0; var58 < var15.field1541; ++var58) {
                                        if (var15.field1572[var56] > 0) {
                                            class31 var59 = class31.method376(var15.field1572[var56] - 1);
                                            String var60 = String.valueOf(var59.field1009);
                                            if (var59.field1023 || var15.field1567[var56] != 1) {
                                                var60 = var60 + " x" + method152((byte) 1, var15.field1567[var56]);
                                            }
                                            int var61 = (var15.field1574 + 115) * var58 + var16;
                                            int var62 = (var15.field1536 + 12) * var57 + var17;
                                            if (var15.field1525) {
                                                var55.method332(var15.field1520, var15.field1532, var62, 0, var15.field1541 / 2 + var61, var60);
                                            } else {
                                                var55.method339(var15.field1532, var60, var62, var15.field1520, var61, -48148);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field1573 == 8 && (this.field541 == var15.field1558 || this.field596 == var15.field1558 || this.field161 == var15.field1558) && this.field401 == 100) {
                                int var63 = 0;
                                int var64 = 0;
                                class20 var65 = this.field451;
                                String var66 = var15.field1562;
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
                                    int var75 = var65.method333(var74, false);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field892 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field1541 + var16 - 5 - var63;
                                int var68 = var15.field1505 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg3.field1541 + arg0) {
                                    var67 = arg3.field1541 + arg0 - var63;
                                }
                                if (var64 + var68 > arg3.field1505 + arg1) {
                                    var68 = arg3.field1505 + arg1 - var64;
                                }
                                class5.method29(var67, 35224, var63, 16777120, var68, var64);
                                class5.method30(var63, 0, var67, -41001, var64, var68);
                                String var69 = var15.field1562;
                                int var70 = var65.field892 + var68 + 2;
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
                                    var65.method339(false, var72, var70, 0, var67 + 3, -48148);
                                    var70 += var65.field892 + 1;
                                }
                            }
                        }
                    }
                }
                class5.method26(var8, var9, true, var10, var7);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method126(byte arg0) {
        if (this.field166 != arg0) {
            this.field319.method229(52);
        }
        if (this.field430 != 0) {
            int var2 = 0;
            if (this.field496 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field362[var3] != null) {
                    int var4 = this.field360[var3];
                    String var5 = this.field361[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field581 == 0 || this.field581 == 1 && this.method124(7, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1112 > 4 && super.field1113 - 4 > var9 - 10 && super.field1113 - 4 <= var9 + 3) {
                            int var10 = this.field451.method333("From:  " + var5 + this.field362[var3], false) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1112 < var10 + 4) {
                                if (this.field535 >= 1) {
                                    this.field227[this.field546] = "Report abuse @whi@" + var5;
                                    this.field189[this.field546] = 2214;
                                    ++this.field546;
                                }
                                this.field227[this.field546] = "Add ignore @whi@" + var5;
                                this.field189[this.field546] = 2816;
                                ++this.field546;
                                this.field227[this.field546] = "Add friend @whi@" + var5;
                                this.field189[this.field546] = 2465;
                                ++this.field546;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field581 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++this.field518;
        this.method75(29921, true);
        this.method94(true, this.field179);
        this.method75(29921, false);
        this.method94(false, this.field179);
        this.method80((byte) 47);
        this.method119(-724);
        if (!this.field511) {
            int var2 = this.field456;
            if (this.field514 / 256 > var2) {
                var2 = this.field514 / 256;
            }
            if (this.field557[4] && this.field417[4] + 128 > var2) {
                var2 = this.field417[4] + 128;
            }
            int var3 = this.field568 + this.field457 & 2047;
            this.method150(var2 * 3 + 600, var3, 0, this.field294, this.method184((byte) -28, this.field274, field238.field659, field238.field660) - 50, this.field295, var2);
            ++field420;
            if (field420 > 90) {
                field420 = 0;
                this.field319.method228(13, true);
            }
        }
        int var4;
        if (!this.field511) {
            var4 = this.method146(475);
        } else {
            var4 = this.method147(-1399);
        }
        int var5 = this.field561;
        int var6 = this.field562;
        int var7 = this.field563;
        int var8 = this.field564;
        int var9 = this.field565;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field557[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field320[var10] * 2 + 1) - (double) this.field320[var10] + Math.sin((double) this.field587[var10] / 100.0D * (double) this.field586[var10]) * (double) this.field417[var10]);
                if (var10 == 0) {
                    this.field561 += var12;
                }
                if (var10 == 1) {
                    this.field562 += var12;
                }
                if (var10 == 2) {
                    this.field563 += var12;
                }
                if (var10 == 3) {
                    this.field565 = this.field565 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field564 += var12;
                    if (this.field564 < 128) {
                        this.field564 = 128;
                    }
                    if (this.field564 > 383) {
                        this.field564 = 383;
                    }
                }
            }
        }
        int var11 = class3.field51;
        class41.field1247 = true;
        class41.field1250 = 0;
        class41.field1248 = super.field1112 - 4;
        class41.field1249 = super.field1113 - 4;
        class5.method27(468);
        this.field285.method318(this.field563, var4, this.field565, this.field561, this.field562, this.field564, (byte) 51);
        this.field285.method293(true);
        this.method99(-247);
        this.method58(8);
        this.method77(var11, true);
        this.method47(false);
        this.field555.method585(super.field1104, 4, 904, 4);
        if (arg0 <= 0) {
            this.field426 = this.field176.method524();
        }
        this.field561 = var5;
        this.field562 = var6;
        this.field563 = var7;
        this.field564 = var8;
        this.field565 = var9;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
    public final void method128(byte arg0, long arg1) {
        if (arg0 == 2) {
            if (arg1 != 0L) {
                for (int var4 = 0; var4 < this.field233; ++var4) {
                    if (this.field392[var4] == arg1) {
                        --this.field233;
                        this.field352 = true;
                        for (int var5 = var4; var5 < this.field233; ++var5) {
                            this.field392[var5] = this.field392[var5 + 1];
                        }
                        this.field319.method228(209, true);
                        this.field319.method235(arg1, 5);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)Ljava/lang/String;")
    public final String method129(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1107 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method130(int arg0) {
        this.field224 = null;
        this.field225 = null;
        this.field226 = null;
        this.field251 = null;
        this.field253 = null;
        this.field255 = null;
        this.field256 = null;
        this.field585 = null;
        this.field484 = null;
        this.field485 = null;
        this.field486 = null;
        if (this.field345 != null) {
            this.field345.method564();
        }
        this.field345 = null;
        this.field385 = null;
        this.field336 = null;
        this.field184 = null;
        this.field386 = null;
        this.field387 = null;
        this.field558 = null;
        this.field185 = null;
        this.field403 = null;
        this.field191 = null;
        this.field285 = null;
        this.field620 = null;
        this.field167 = null;
        this.field168 = null;
        this.field169 = null;
        this.field170 = null;
        this.field545 = null;
        this.field500 = null;
        this.field501 = null;
        this.field268 = null;
        this.field148 = null;
        this.field228 = null;
        this.field229 = null;
        this.field230 = null;
        this.field231 = null;
        this.field232 = null;
        try {
            if (this.field525 != null) {
                this.field525.method516();
            }
        } catch (Exception var2) {
        }
        this.field525 = null;
        this.field330 = null;
        this.field331 = null;
        this.field327 = null;
        this.field328 = null;
        this.field329 = null;
        this.field171 = null;
        this.field172 = null;
        this.field173 = null;
        this.field174 = null;
        this.field175 = null;
        this.field315 = null;
        if (this.field339 != null) {
            this.field339.field1257 = false;
        }
        this.field339 = null;
        this.field483 = null;
        this.field553 = null;
        this.field554 = null;
        this.field555 = null;
        this.field556 = null;
        this.field234 = null;
        this.field187 = null;
        this.field188 = null;
        this.field189 = null;
        this.field190 = null;
        this.field227 = null;
        this.field319 = null;
        this.field519 = null;
        this.field487 = null;
        this.field622 = null;
        this.field536 = null;
        this.field344 = null;
        this.field520 = null;
        this.field165 = null;
        this.field158 = null;
        this.field281 = null;
        this.field283 = null;
        this.field280 = null;
        this.field390 = null;
        this.field276 = null;
        this.field397 = null;
        this.field398 = null;
        this.method78(6);
        this.field624 = null;
        this.field625 = null;
        this.field626 = null;
        this.field613 = null;
        this.field614 = null;
        if (arg0 != 0) {
            this.field572 = null;
        }
        this.field615 = null;
        this.field616 = null;
        this.field617 = null;
        this.field271 = null;
        this.field409 = null;
        this.field407 = null;
        this.field376 = null;
        this.field570 = null;
        this.field157 = null;
        this.field321 = null;
        this.field322 = null;
        this.field323 = null;
        this.field324 = null;
        this.field325 = null;
        this.field572 = null;
        this.field532 = null;
        this.field332 = null;
        this.field333 = null;
        this.field334 = null;
        this.field335 = null;
        this.method79(0);
        class64.method557(this.field612);
        class48.method510(this.field612);
        class31.method374(this.field612);
        class63.method547(this.field612);
        class25.field957 = null;
        class71.field1727 = null;
        class35.field1084 = null;
        class14.field717 = null;
        class67.field1691 = null;
        class67.field1703 = null;
        class52.field1404 = null;
        super.field1105 = null;
        class7.field82 = null;
        class3.method7(this.field612);
        class19.method278(this.field612);
        class41.method409(this.field612);
        class37.method393(this.field612);
        System.gc();
        if (class13.field714) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LVTUPBFSN;I)Z")
    public final boolean method131(class63 arg0, int arg1) {
        while (arg1 >= 0) {
            this.field220 = !this.field220;
        }
        int var3 = arg0.field1503;
        if (this.field366 == 2) {
            if (var3 == 201) {
                this.field221 = true;
                this.field524 = 0;
                this.field437 = true;
                this.field395 = "";
                this.field454 = 1;
                this.field633 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field221 = true;
                this.field524 = 0;
                this.field437 = true;
                this.field395 = "";
                this.field454 = 2;
                this.field633 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field448 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field221 = true;
                this.field524 = 0;
                this.field437 = true;
                this.field395 = "";
                this.field454 = 4;
                this.field633 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field221 = true;
                this.field524 = 0;
                this.field437 = true;
                this.field395 = "";
                this.field454 = 5;
                this.field633 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field237[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class71.field1726 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class71.field1726) {
                                var6 = 0;
                            }
                        }
                        if (!class71.field1727[var6].field1733 && class71.field1727[var6].field1728 == var4 + (this.field591 ? 0 : 7)) {
                            this.field237[var4] = var6;
                            this.field416 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field246[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field164[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field164[var7].length) {
                        var9 = 0;
                    }
                }
                this.field246[var7] = var9;
                this.field416 = true;
            }
            if (var3 == 324 && !this.field591) {
                this.field591 = true;
                this.method180((byte) 1);
            }
            if (var3 == 325 && this.field591) {
                this.field591 = false;
                this.method180((byte) 1);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field592 = !this.field592;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method118(false);
                    if (this.field279.length() > 0) {
                        this.field319.method228(153, true);
                        this.field319.method235(class32.method380(this.field279), 5);
                        this.field319.method229(var3 - 601);
                        this.field319.method229(this.field592 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field319.method228(194, true);
                this.field319.method229(this.field591 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field319.method229(this.field237[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field319.method229(this.field246[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (arg0 == 0) {
            while (true) {
                class45 var2 = this.field345.method571();
                if (var2 == null) {
                    return;
                }
                if (var2.field1277 == 0) {
                    class41.method411(false, var2.field1276, var2.field1273);
                    if ((this.field345.method570(0, var2.field1273) & 98) != 0) {
                        this.field352 = true;
                        if (this.field263 != -1 || this.field438 != -1) {
                            this.field221 = true;
                        }
                    }
                }
                if (var2.field1277 == 1 && var2.field1276 != null) {
                    class37.method392(var2.field1276, (byte) 2);
                }
                if (var2.field1277 == 2 && this.field383 == var2.field1273 && var2.field1276 != null) {
                    this.method103(this.field384, false, var2.field1276);
                }
                if (var2.field1277 == 3 && this.field298 == 1) {
                    for (int var3 = 0; var3 < this.field336.length; ++var3) {
                        if (this.field386[var3] == var2.field1273) {
                            this.field336[var3] = var2.field1276;
                            if (var2.field1276 == null) {
                                this.field386[var3] = -1;
                            }
                            break;
                        }
                        if (this.field387[var3] == var2.field1273) {
                            this.field184[var3] = var2.field1276;
                            if (var2.field1276 == null) {
                                this.field387[var3] = -1;
                            }
                            break;
                        }
                    }
                }
                if (var2.field1277 == 93 && this.field345.method565(1, var2.field1273)) {
                    class46.method465(false, new class18(var2.field1276, 0), this.field345);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method133() {
        this.method98(20, "Starting up", (byte) 1);
        if (signlink.sunjava) {
            super.field1098 = 5;
        }
        if (field394) {
            this.field399 = true;
        } else {
            field394 = true;
            boolean var1 = false;
            String var2 = this.method129(5);
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
                this.field342 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field415[var3] = new class17(signlink.cache_dat, var3 + 1, signlink.cache_idx[var3], 600000, -573);
                    }
                }
                try {
                    this.method48(0);
                    this.field326 = this.method46(this.field531[1], "title", 1, "title screen", (byte) 1, 25);
                    this.field450 = new class20("p11_full", 79, this.field326, false);
                    this.field451 = new class20("p12_full", 79, this.field326, false);
                    this.field452 = new class20("b12_full", 79, this.field326, false);
                    this.field453 = new class20("q8_full", 79, this.field326, true);
                    this.method76((byte) 5);
                    this.method85(true);
                    class24 var4 = this.method46(this.field531[2], "config", 2, "config", (byte) 1, 30);
                    class24 var5 = this.method46(this.field531[3], "interface", 3, "interface", (byte) 1, 35);
                    class24 var6 = this.method46(this.field531[4], "media", 4, "2d graphics", (byte) 1, 40);
                    class24 var7 = this.method46(this.field531[6], "textures", 6, "textures", (byte) 1, 45);
                    class24 var8 = this.method46(this.field531[7], "wordenc", 7, "chat system", (byte) 1, 50);
                    class24 var9 = this.method46(this.field531[8], "sounds", 8, "sound effects", (byte) 1, 55);
                    this.field191 = new byte[4][104][104];
                    this.field403 = new int[4][105][105];
                    this.field285 = new class19(4, 104, this.field403, 0, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field620[var10] = new class72(104, 8, 104);
                    }
                    this.field545 = new class16(512, 512);
                    class24 var11 = this.method46(this.field531[5], "versionlist", 5, "update list", (byte) 1, 60);
                    this.method98(60, "Connecting to update server", (byte) 1);
                    this.field345 = new class66();
                    this.field345.method569(var11, this);
                    class37.method391(this.field345.method573(true));
                    class41.method410(this.field345.method560(0, (byte) 7), this.field345);
                    if (!field211) {
                        this.field383 = 0;
                        this.field384 = true;
                        this.field345.method577(2, this.field383);
                        while (this.field345.method575() > 0) {
                            this.method132(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                            if (this.field345.field1648 > 3) {
                                this.method113("ondemand");
                                return;
                            }
                        }
                    }
                    this.method98(65, "Requesting animations", (byte) 1);
                    int var12 = this.field345.method560(1, (byte) 7);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field345.method577(1, var13);
                    }
                    while (this.field345.method575() > 0) {
                        int var14 = var12 - this.field345.method575();
                        if (var14 > 0) {
                            this.method98(65, "Loading animations - " + var14 * 100 / var12 + "%", (byte) 1);
                        }
                        this.method132(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                        if (this.field345.field1648 > 3) {
                            this.method113("ondemand");
                            return;
                        }
                    }
                    this.method98(70, "Requesting models", (byte) 1);
                    int var15 = this.field345.method560(0, (byte) 7);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field345.method570(0, var16);
                        if ((var17 & 1) != 0) {
                            this.field345.method577(0, var16);
                        }
                    }
                    int var18 = this.field345.method575();
                    while (this.field345.method575() > 0) {
                        int var19 = var18 - this.field345.method575();
                        if (var19 > 0) {
                            this.method98(70, "Loading models - " + var19 * 100 / var18 + "%", (byte) 1);
                        }
                        this.method132(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field415[0] != null) {
                        this.method98(75, "Requesting maps", (byte) 1);
                        this.field345.method577(3, this.field345.method574(field355, 48, 0, 47));
                        this.field345.method577(3, this.field345.method574(field355, 48, 1, 47));
                        this.field345.method577(3, this.field345.method574(field355, 48, 0, 48));
                        this.field345.method577(3, this.field345.method574(field355, 48, 1, 48));
                        this.field345.method577(3, this.field345.method574(field355, 48, 0, 49));
                        this.field345.method577(3, this.field345.method574(field355, 48, 1, 49));
                        this.field345.method577(3, this.field345.method574(field355, 47, 0, 47));
                        this.field345.method577(3, this.field345.method574(field355, 47, 1, 47));
                        this.field345.method577(3, this.field345.method574(field355, 47, 0, 48));
                        this.field345.method577(3, this.field345.method574(field355, 47, 1, 48));
                        this.field345.method577(3, this.field345.method574(field355, 148, 0, 48));
                        this.field345.method577(3, this.field345.method574(field355, 148, 1, 48));
                        int var20 = this.field345.method575();
                        while (this.field345.method575() > 0) {
                            int var21 = var20 - this.field345.method575();
                            if (var21 > 0) {
                                this.method98(75, "Loading maps - " + var21 * 100 / var20 + "%", (byte) 1);
                            }
                            this.method132(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var22 = this.field345.method560(0, (byte) 7);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field345.method570(0, var23);
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
                            this.field345.method563(0, var25, (byte) 8, var23);
                        }
                    }
                    this.field345.method568(field210, -47244);
                    if (!field211) {
                        int var26 = this.field345.method560(2, (byte) 7);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field345.method579(0, var27)) {
                                this.field345.method563(2, (byte) 1, (byte) 8, var27);
                            }
                        }
                    }
                    int var28 = this.field345.method560(0, (byte) 7);
                    for (int var29 = 0; var29 < var28; ++var29) {
                        int var30 = this.field345.method570(0, var29);
                        if (var30 == 0 && this.field345.field1655 < 100) {
                            this.field345.method563(0, (byte) 1, (byte) 8, var29);
                        }
                    }
                    this.method98(80, "Unpacking media", (byte) 1);
                    this.field484 = new class38(var6, "invback", 0);
                    this.field486 = new class38(var6, "chatback", 0);
                    this.field485 = new class38(var6, "mapback", 0);
                    this.field224 = new class38(var6, "backbase1", 0);
                    this.field225 = new class38(var6, "backbase2", 0);
                    this.field226 = new class38(var6, "backhmid1", 0);
                    for (int var31 = 0; var31 < 13; ++var31) {
                        this.field315[var31] = new class38(var6, "sideicons", var31);
                    }
                    this.field271 = new class16(var6, "compass", 0);
                    this.field341 = new class16(var6, "mapedge", 0);
                    this.field341.method212(field182);
                    for (int var32 = 0; var32 < 72; ++var32) {
                        this.field622[var32] = new class38(var6, "mapscene", var32);
                    }
                    for (int var33 = 0; var33 < 70; ++var33) {
                        this.field536[var33] = new class16(var6, "mapfunction", var33);
                    }
                    for (int var34 = 0; var34 < 5; ++var34) {
                        this.field409[var34] = new class16(var6, "hitmarks", var34);
                    }
                    for (int var35 = 0; var35 < 6; ++var35) {
                        this.field407[var35] = new class16(var6, "headicons_pk", var35);
                    }
                    for (int var36 = 0; var36 < 9; ++var36) {
                        this.field376[var36] = new class16(var6, "headicons_prayer", var36);
                    }
                    for (int var37 = 0; var37 < 6; ++var37) {
                        this.field570[var37] = new class16(var6, "headicons_hint", var37);
                    }
                    this.field483 = new class16(var6, "overlay_multiway", 0);
                    this.field609 = new class16(var6, "mapmarker", 0);
                    this.field610 = new class16(var6, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field157[var38] = new class16(var6, "cross", var38);
                    }
                    this.field228 = new class16(var6, "mapdots", 0);
                    this.field229 = new class16(var6, "mapdots", 1);
                    this.field230 = new class16(var6, "mapdots", 2);
                    this.field231 = new class16(var6, "mapdots", 3);
                    this.field232 = new class16(var6, "mapdots", 4);
                    this.field428 = new class38(var6, "scrollbar", 0);
                    this.field429 = new class38(var6, "scrollbar", 1);
                    this.field613 = new class38(var6, "redstone1", 0);
                    this.field614 = new class38(var6, "redstone2", 0);
                    this.field615 = new class38(var6, "redstone3", 0);
                    this.field616 = new class38(var6, "redstone1", 0);
                    this.field616.method398((byte) 1);
                    this.field617 = new class38(var6, "redstone2", 0);
                    this.field617.method398((byte) 1);
                    this.field321 = new class38(var6, "redstone1", 0);
                    this.field321.method399(6);
                    this.field322 = new class38(var6, "redstone2", 0);
                    this.field322.method399(6);
                    this.field323 = new class38(var6, "redstone3", 0);
                    this.field323.method399(6);
                    this.field324 = new class38(var6, "redstone1", 0);
                    this.field324.method398((byte) 1);
                    this.field324.method399(6);
                    this.field325 = new class38(var6, "redstone2", 0);
                    this.field325.method398((byte) 1);
                    this.field325.method399(6);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field636[var39] = new class38(var6, "mod_icons", var39);
                    }
                    class16 var40 = new class16(var6, "backleft1", 0);
                    this.field167 = new class70(this.method57(-5092), var40.field760, var40.field761, (byte) 52);
                    var40.method213(-812, 0, 0);
                    class16 var41 = new class16(var6, "backleft2", 0);
                    this.field168 = new class70(this.method57(-5092), var41.field760, var41.field761, (byte) 52);
                    var41.method213(-812, 0, 0);
                    class16 var42 = new class16(var6, "backright1", 0);
                    this.field169 = new class70(this.method57(-5092), var42.field760, var42.field761, (byte) 52);
                    var42.method213(-812, 0, 0);
                    class16 var43 = new class16(var6, "backright2", 0);
                    this.field170 = new class70(this.method57(-5092), var43.field760, var43.field761, (byte) 52);
                    var43.method213(-812, 0, 0);
                    class16 var44 = new class16(var6, "backtop1", 0);
                    this.field171 = new class70(this.method57(-5092), var44.field760, var44.field761, (byte) 52);
                    var44.method213(-812, 0, 0);
                    class16 var45 = new class16(var6, "backvmid1", 0);
                    this.field172 = new class70(this.method57(-5092), var45.field760, var45.field761, (byte) 52);
                    var45.method213(-812, 0, 0);
                    class16 var46 = new class16(var6, "backvmid2", 0);
                    this.field173 = new class70(this.method57(-5092), var46.field760, var46.field761, (byte) 52);
                    var46.method213(-812, 0, 0);
                    class16 var47 = new class16(var6, "backvmid3", 0);
                    this.field174 = new class70(this.method57(-5092), var47.field760, var47.field761, (byte) 52);
                    var47.method213(-812, 0, 0);
                    class16 var48 = new class16(var6, "backhmid2", 0);
                    this.field175 = new class70(this.method57(-5092), var48.field760, var48.field761, (byte) 52);
                    var48.method213(-812, 0, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 100; ++var53) {
                        if (this.field536[var53] != null) {
                            this.field536[var53].method211(var50 + var52, var51 + var52, var49 + var52, (byte) -108);
                        }
                        if (this.field622[var53] != null) {
                            this.field622[var53].method400(var50 + var52, var51 + var52, var49 + var52, (byte) -108);
                        }
                    }
                    this.method98(83, "Unpacking textures", (byte) 1);
                    class3.method12(var7, false);
                    class3.method16(0.8D, 250);
                    class3.method11(0, 20);
                    this.method98(86, "Unpacking config", (byte) 1);
                    class14.method206(var4, true);
                    class64.method556(var4);
                    class25.method349(var4, true);
                    class31.method379(var4);
                    class48.method509(var4);
                    class71.method587(var4, true);
                    class67.method580(var4, true);
                    class52.method522(var4, true);
                    class9.method44(var4, true);
                    class31.field1002 = field210;
                    if (!field211) {
                        this.method98(90, "Unpacking sounds", (byte) 1);
                        byte[] var54 = var9.method348("sounds.dat", (byte[]) null);
                        class18 var55 = new class18(var54, 0);
                        class39.method403(var55, true);
                    }
                    this.method98(95, "Unpacking interfaces", (byte) 1);
                    class20[] var56 = new class20[] { this.field450, this.field451, this.field452, this.field453 };
                    class63.method541(var5, var6, (byte) 5, var56);
                    this.method98(100, "Preparing game engine", (byte) 1);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field485.field1142[this.field485.field1144 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field343[var57] = var58;
                        this.field262[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field485.field1142[this.field485.field1144 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field381[var61 - 5] = var62 - 25;
                        this.field195[var61 - 5] = var63 - var62;
                    }
                    class3.method9(765, true, 503);
                    this.field351 = class3.field42;
                    class3.method9(479, true, 96);
                    this.field348 = class3.field42;
                    class3.method9(190, true, 261);
                    this.field349 = class3.field42;
                    class3.method9(512, true, 334);
                    this.field350 = class3.field42;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = class3.field40[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    class19.method315(-77, 512, 500, 800, var65, 334);
                    class47.method470(var8);
                    this.field339 = new class42(6, this);
                    this.method139(this.field339, 10);
                    class15.field742 = this;
                    class64.field1611 = this;
                    class48.field1327 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field393 + " " + this.field265);
                    this.field548 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method134(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method135(int arg0, int arg1) {
        if (arg1 >= 0) {
            int var3 = this.field187[arg1];
            int var4 = this.field188[arg1];
            int var5 = this.field189[arg1];
            int var6 = this.field190[arg1];
            if (arg0 < 0) {
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (this.field524 != 0 && var5 != 1472) {
                    this.field524 = 0;
                    this.field221 = true;
                }
                if (var5 == 689) {
                    this.field319.method228(84, true);
                    this.field319.method264((byte) 1, var3);
                    this.field319.method264((byte) 1, var6);
                    this.field319.method266(true, var4);
                    this.field507 = 0;
                    this.field508 = var4;
                    this.field509 = var3;
                    this.field510 = 2;
                    if (class63.method544(var4).field1508 == this.field455) {
                        this.field510 = 1;
                    }
                    if (class63.method544(var4).field1508 == this.field263) {
                        this.field510 = 3;
                    }
                }
                if (var5 == 80) {
                    this.field319.method228(146, true);
                    this.field319.method230(var4);
                    class63 var7 = class63.method544(var4);
                    if (var7.field1506 != null && var7.field1506[0][0] == 5) {
                        int var8 = var7.field1506[0][1];
                        if (this.field344[var8] != var7.field1507[0]) {
                            this.field344[var8] = var7.field1507[0];
                            this.method93(var8, true);
                            this.field352 = true;
                        }
                    }
                }
                if (var5 == 229) {
                    this.field319.method228(146, true);
                    this.field319.method230(var4);
                    class63 var9 = class63.method544(var4);
                    if (var9.field1506 != null && var9.field1506[0][0] == 5) {
                        int var10 = var9.field1506[0][1];
                        this.field344[var10] = 1 - this.field344[var10];
                        this.method93(var10, true);
                        this.field352 = true;
                    }
                }
                if (var5 == 87) {
                    boolean var11 = this.method160(0, field238.field664[0], 2, 0, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                    if (!var11) {
                        this.method160(1, field238.field664[0], 2, 1, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                    }
                    this.field464 = super.field1119;
                    this.field465 = super.field1120;
                    this.field467 = 2;
                    this.field466 = 0;
                    this.field319.method228(127, true);
                    this.field319.method265(0, this.field356 + var3);
                    this.field319.method230(var6);
                    this.field319.method266(true, this.field357 + var4);
                }
                if (var5 == 925) {
                    class63 var13 = class63.method544(var4);
                    this.field628 = 1;
                    this.field629 = var4;
                    this.field630 = var13.field1504;
                    this.field151 = 0;
                    this.field352 = true;
                    String var14 = var13.field1530;
                    if (var14.indexOf(" ") != -1) {
                        var14 = var14.substring(0, var14.indexOf(" "));
                    }
                    String var15 = var13.field1530;
                    if (var15.indexOf(" ") != -1) {
                        var15 = var15.substring(var15.indexOf(" ") + 1);
                    }
                    this.field631 = var14 + " " + var13.field1564 + " " + var15;
                    if (this.field630 == 16) {
                        this.field352 = true;
                        this.field389 = 3;
                        this.field216 = true;
                    }
                } else {
                    if (var5 == 22) {
                        this.field319.method228(245, true);
                        this.field319.method264((byte) 1, var4);
                        this.field319.method266(true, var3);
                        this.field319.method266(true, var6);
                        this.field507 = 0;
                        this.field508 = var4;
                        this.field509 = var3;
                        this.field510 = 2;
                        if (class63.method544(var4).field1508 == this.field455) {
                            this.field510 = 1;
                        }
                        if (class63.method544(var4).field1508 == this.field263) {
                            this.field510 = 3;
                        }
                    }
                    if (var5 == 937) {
                        this.method181(false, this.field438);
                        this.field438 = -1;
                        this.field221 = true;
                    }
                    if (var5 == 868) {
                        boolean var16 = this.method160(0, field238.field664[0], 2, 0, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                        if (!var16) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                        }
                        this.field464 = super.field1119;
                        this.field465 = super.field1120;
                        this.field467 = 2;
                        this.field466 = 0;
                        this.field319.method228(183, true);
                        this.field319.method266(true, this.field357 + var4);
                        this.field319.method266(true, var6);
                        this.field319.method266(true, this.field356 + var3);
                    }
                    if (var5 == 734) {
                        class7 var18 = this.field251[var6];
                        if (var18 != null) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var18.field664[0], 0, 0, this.field627, var18.field663[0], false, field238.field663[0]);
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            field427 += var6;
                            if (field427 >= 131) {
                                this.field319.method228(222, true);
                                this.field319.method233(0);
                                field427 = 0;
                            }
                            this.field319.method228(107, true);
                            this.field319.method230(var6);
                        }
                    }
                    if (var5 == 82 && this.method67(var6, var3, true, var4)) {
                        this.field319.method228(191, true);
                        this.field319.method265(0, this.field356 + var3);
                        this.field319.method265(0, this.field153);
                        this.field319.method230(this.field154);
                        this.field319.method265(0, this.field357 + var4);
                        this.field319.method265(0, var6 >> 14 & 32767);
                        this.field319.method264((byte) 1, this.field152);
                    }
                    if (var5 == 652) {
                        boolean var19 = this.method160(0, field238.field664[0], 2, 0, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                        if (!var19) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                        }
                        this.field464 = super.field1119;
                        this.field465 = super.field1120;
                        this.field467 = 2;
                        this.field466 = 0;
                        this.field319.method228(227, true);
                        this.field319.method265(0, this.field629);
                        this.field319.method230(this.field357 + var4);
                        this.field319.method266(true, var6);
                        this.field319.method266(true, this.field356 + var3);
                    }
                    if (var5 == 10) {
                        boolean var21 = this.method160(0, field238.field664[0], 2, 0, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                        if (!var21) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                        }
                        this.field464 = super.field1119;
                        this.field465 = super.field1120;
                        this.field467 = 2;
                        this.field466 = 0;
                        this.field319.method228(111, true);
                        this.field319.method230(var6);
                        this.field319.method265(0, this.field356 + var3);
                        this.field319.method264((byte) 1, this.field357 + var4);
                    }
                    if (var5 == 858) {
                        this.field319.method228(68, true);
                        this.field319.method264((byte) 1, var6);
                        this.field319.method266(true, var4);
                        this.field319.method265(0, var3);
                        this.field507 = 0;
                        this.field508 = var4;
                        this.field509 = var3;
                        this.field510 = 2;
                        if (class63.method544(var4).field1508 == this.field455) {
                            this.field510 = 1;
                        }
                        if (class63.method544(var4).field1508 == this.field263) {
                            this.field510 = 3;
                        }
                    }
                    if (var5 == 2) {
                        class30 var23 = this.field281[var6];
                        if (var23 != null) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var23.field664[0], 0, 0, this.field627, var23.field663[0], false, field238.field663[0]);
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            this.field319.method228(189, true);
                            this.field319.method265(0, var6);
                        }
                    }
                    if (var5 == 384) {
                        class30 var24 = this.field281[var6];
                        if (var24 != null) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var24.field664[0], 0, 0, this.field627, var24.field663[0], false, field238.field663[0]);
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            this.field319.method228(224, true);
                            this.field319.method265(0, this.field153);
                            this.field319.method230(this.field154);
                            this.field319.method264((byte) 1, var6);
                            this.field319.method230(this.field152);
                        }
                    }
                    if (var5 == 842) {
                        if (!this.field589) {
                            this.field285.method317(super.field1120 - 4, super.field1119 - 4, true);
                        } else {
                            this.field285.method317(var4 - 4, var3 - 4, true);
                        }
                    }
                    if (var5 == 744) {
                        if ((this.field356 & 3) == 0) {
                            ++field574;
                        }
                        if (field574 >= 117) {
                            this.field319.method228(219, true);
                            this.field319.method233(0);
                            field574 = 0;
                        }
                        this.method67(var6, var3, true, var4);
                        this.field319.method228(106, true);
                        this.field319.method266(true, var6 >> 14 & 32767);
                        this.field319.method265(0, this.field357 + var4);
                        this.field319.method265(0, this.field356 + var3);
                    }
                    if (var5 == 546) {
                        class30 var25 = this.field281[var6];
                        if (var25 != null) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var25.field664[0], 0, 0, this.field627, var25.field663[0], false, field238.field663[0]);
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            this.field319.method228(248, true);
                            this.field319.method265(0, var6);
                        }
                    }
                    if (var5 == 959) {
                        class7 var26 = this.field251[var6];
                        if (var26 != null) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var26.field664[0], 0, 0, this.field627, var26.field663[0], false, field238.field663[0]);
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            this.field319.method228(220, true);
                            this.field319.method266(true, this.field629);
                            this.field319.method265(0, var6);
                        }
                    }
                    if (var5 == 1498) {
                        int var27 = var6 >> 14 & 32767;
                        class64 var28 = class64.method548(var27);
                        String var29;
                        if (var28.field1604 != null) {
                            var29 = new String(var28.field1604);
                        } else {
                            var29 = "It's a " + var28.field1590 + ".";
                        }
                        this.method110(0, 0, "", var29);
                    }
                    if (var5 == 767) {
                        this.field319.method228(135, true);
                        this.field319.method266(true, var6);
                        this.field319.method265(0, var4);
                        this.field319.method230(var3);
                        this.field507 = 0;
                        this.field508 = var4;
                        this.field509 = var3;
                        this.field510 = 2;
                        if (class63.method544(var4).field1508 == this.field455) {
                            this.field510 = 1;
                        }
                        if (class63.method544(var4).field1508 == this.field263) {
                            this.field510 = 3;
                        }
                    }
                    if (var5 == 149) {
                        class7 var30 = this.field251[var6];
                        if (var30 != null) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var30.field664[0], 0, 0, this.field627, var30.field663[0], false, field238.field663[0]);
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            this.field319.method228(216, true);
                            this.field319.method266(true, this.field153);
                            this.field319.method265(0, this.field154);
                            this.field319.method230(var6);
                            this.field319.method266(true, this.field152);
                        }
                    }
                    if (var5 == 248) {
                        class7 var31 = this.field251[var6];
                        if (var31 != null) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var31.field664[0], 0, 0, this.field627, var31.field663[0], false, field238.field663[0]);
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            field214 += var6;
                            if (field214 >= 107) {
                                this.field319.method228(103, true);
                                this.field319.method230(43334);
                                field214 = 0;
                            }
                            this.field319.method228(81, true);
                            this.field319.method264((byte) 1, var6);
                        }
                    }
                    if (var5 == 840) {
                        class30 var32 = this.field281[var6];
                        if (var32 != null) {
                            this.method160(1, field238.field664[0], 2, 1, 0, var32.field664[0], 0, 0, this.field627, var32.field663[0], false, field238.field663[0]);
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            ++field367;
                            if (field367 >= 143) {
                                this.field319.method228(122, true);
                                field367 = 0;
                            }
                            this.field319.method228(163, true);
                            this.field319.method265(0, var6);
                        }
                    }
                    if (var5 == 974) {
                        if ((var3 & 3) == 0) {
                            ++field375;
                        }
                        if (field375 >= 83) {
                            this.field319.method228(193, true);
                            field375 = 0;
                        }
                        this.field319.method228(90, true);
                        this.field319.method265(0, var4);
                        this.field319.method265(0, var3);
                        this.field319.method266(true, var6);
                        this.field507 = 0;
                        this.field508 = var4;
                        this.field509 = var3;
                        this.field510 = 2;
                        if (class63.method544(var4).field1508 == this.field455) {
                            this.field510 = 1;
                        }
                        if (class63.method544(var4).field1508 == this.field263) {
                            this.field510 = 3;
                        }
                    }
                    if (var5 == 1695) {
                        class31 var33 = class31.method376(var6);
                        class63 var34 = class63.method544(var4);
                        String var35;
                        if (var34 != null && var34.field1567[var3] >= 100000) {
                            var35 = var34.field1567[var3] + " x " + var33.field1009;
                        } else if (var33.field1020 != null) {
                            var35 = new String(var33.field1020);
                        } else {
                            var35 = "It's a " + var33.field1009 + ".";
                        }
                        this.method110(0, 0, "", var35);
                    }
                    if (var5 == 499 && this.method67(var6, var3, true, var4)) {
                        this.field319.method228(78, true);
                        this.field319.method266(true, this.field357 + var4);
                        this.field319.method265(0, this.field356 + var3);
                        this.field319.method264((byte) 1, var6 >> 14 & 32767);
                        this.field319.method265(0, this.field629);
                    }
                    if (var5 == 465 || var5 == 816 || var5 == 968 || var5 == 397) {
                        String var36 = this.field227[arg1];
                        int var37 = var36.indexOf("@whi@");
                        if (var37 != -1) {
                            long var38 = class32.method380(var36.substring(var37 + 5).trim());
                            if (var5 == 465) {
                                this.method188(true, var38);
                            }
                            if (var5 == 816) {
                                this.method120(var38, 9);
                            }
                            if (var5 == 968) {
                                this.method167(false, var38);
                            }
                            if (var5 == 397) {
                                this.method128((byte) 2, var38);
                            }
                        }
                    }
                    if (var5 == 892) {
                        this.method118(false);
                    }
                    if (var5 == 988) {
                        this.field151 = 1;
                        this.field152 = var3;
                        this.field153 = var4;
                        this.field154 = var6;
                        this.field155 = String.valueOf(class31.method376(var6).field1009);
                        this.field628 = 0;
                        this.field352 = true;
                    } else {
                        if (var5 == 254) {
                            this.field319.method228(160, true);
                            this.field319.method265(0, var3);
                            this.field319.method230(var4);
                            this.field319.method264((byte) 1, var6);
                            this.field507 = 0;
                            this.field508 = var4;
                            this.field509 = var3;
                            this.field510 = 2;
                            if (class63.method544(var4).field1508 == this.field455) {
                                this.field510 = 1;
                            }
                            if (class63.method544(var4).field1508 == this.field263) {
                                this.field510 = 3;
                            }
                        }
                        if (var5 == 403) {
                            this.field319.method228(46, true);
                            this.field319.method265(0, this.field154);
                            this.field319.method230(var4);
                            this.field319.method266(true, this.field153);
                            this.field319.method265(0, this.field152);
                            this.field319.method264((byte) 1, var3);
                            this.field319.method264((byte) 1, var6);
                            this.field507 = 0;
                            this.field508 = var4;
                            this.field509 = var3;
                            this.field510 = 2;
                            if (class63.method544(var4).field1508 == this.field455) {
                                this.field510 = 1;
                            }
                            if (class63.method544(var4).field1508 == this.field263) {
                                this.field510 = 3;
                            }
                        }
                        if (var5 == 214) {
                            String var40 = this.field227[arg1];
                            int var41 = var40.indexOf("@whi@");
                            if (var41 != -1) {
                                if (this.field455 == -1) {
                                    this.method118(false);
                                    this.field279 = var40.substring(var41 + 5).trim();
                                    this.field592 = false;
                                    this.field579 = this.field455 = class63.field1517;
                                } else {
                                    this.method110(0, 0, "", "Please close the interface you have open before using 'report abuse'");
                                }
                            }
                        }
                        if (var5 == 599) {
                            this.field319.method228(69, true);
                            this.field319.method230(var3);
                            this.field319.method265(0, var4);
                            this.field319.method266(true, var6);
                            this.field507 = 0;
                            this.field508 = var4;
                            this.field509 = var3;
                            this.field510 = 2;
                            if (class63.method544(var4).field1508 == this.field455) {
                                this.field510 = 1;
                            }
                            if (class63.method544(var4).field1508 == this.field263) {
                                this.field510 = 3;
                            }
                        }
                        if (var5 == 484) {
                            if ((var3 & 3) == 0) {
                                ++field408;
                            }
                            if (field408 >= 63) {
                                this.field319.method228(190, true);
                                this.field319.method233(0);
                                field408 = 0;
                            }
                            this.field319.method228(52, true);
                            this.field319.method266(true, var3);
                            this.field319.method264((byte) 1, var6);
                            this.field319.method230(var4);
                            this.field507 = 0;
                            this.field508 = var4;
                            this.field509 = var3;
                            this.field510 = 2;
                            if (class63.method544(var4).field1508 == this.field455) {
                                this.field510 = 1;
                            }
                            if (class63.method544(var4).field1508 == this.field263) {
                                this.field510 = 3;
                            }
                        }
                        if (var5 == 109) {
                            String var42 = this.field227[arg1];
                            int var43 = var42.indexOf("@whi@");
                            if (var43 != -1) {
                                long var44 = class32.method380(var42.substring(var43 + 5).trim());
                                int var46 = -1;
                                for (int var47 = 0; var47 < this.field365; ++var47) {
                                    if (this.field165[var47] == var44) {
                                        var46 = var47;
                                        break;
                                    }
                                }
                                if (var46 != -1 && this.field158[var46] > 0) {
                                    this.field221 = true;
                                    this.field524 = 0;
                                    this.field437 = true;
                                    this.field395 = "";
                                    this.field454 = 3;
                                    this.field537 = this.field165[var46];
                                    this.field633 = "Enter message to send to " + this.field520[var46];
                                }
                            }
                        }
                        if (var5 == 743 || var5 == 485) {
                            String var48 = this.field227[arg1];
                            int var49 = var48.indexOf("@whi@");
                            if (var49 != -1) {
                                String var50 = var48.substring(var49 + 5).trim();
                                String var51 = class32.method384(this.field368, class32.method381(class32.method380(var50), (byte) 82));
                                boolean var52 = false;
                                for (int var53 = 0; var53 < this.field252; ++var53) {
                                    class7 var54 = this.field251[this.field253[var53]];
                                    if (var54 != null && var54.field101 != null && var54.field101.equalsIgnoreCase(var51)) {
                                        this.method160(1, field238.field664[0], 2, 1, 0, var54.field664[0], 0, 0, this.field627, var54.field663[0], false, field238.field663[0]);
                                        if (var5 == 743) {
                                            this.field319.method228(32, true);
                                            this.field319.method265(0, this.field253[var53]);
                                        }
                                        if (var5 == 485) {
                                            this.field319.method228(182, true);
                                            this.field319.method265(0, this.field253[var53]);
                                        }
                                        var52 = true;
                                        break;
                                    }
                                }
                                if (!var52) {
                                    this.method110(0, 0, "", "Unable to find " + var51);
                                }
                            }
                        }
                        if (var5 == 26) {
                            this.method67(var6, var3, true, var4);
                            this.field319.method228(131, true);
                            this.field319.method265(0, this.field356 + var3);
                            this.field319.method264((byte) 1, this.field357 + var4);
                            this.field319.method230(var6 >> 14 & 32767);
                        }
                        if (var5 == 131) {
                            class30 var55 = this.field281[var6];
                            if (var55 != null) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var55.field664[0], 0, 0, this.field627, var55.field663[0], false, field238.field663[0]);
                                this.field464 = super.field1119;
                                this.field465 = super.field1120;
                                this.field467 = 2;
                                this.field466 = 0;
                                this.field319.method228(149, true);
                                this.field319.method264((byte) 1, var6);
                            }
                        }
                        if (var5 == 705) {
                            boolean var56 = this.method160(0, field238.field664[0], 2, 0, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                            if (!var56) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                            }
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            this.field319.method228(58, true);
                            this.field319.method230(this.field356 + var3);
                            this.field319.method265(0, this.field357 + var4);
                            this.field319.method266(true, var6);
                        }
                        if (var5 == 823) {
                            boolean var58 = this.method160(0, field238.field664[0], 2, 0, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                            if (!var58) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                            }
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            this.field319.method228(42, true);
                            this.field319.method230(this.field153);
                            this.field319.method266(true, var6);
                            this.field319.method265(0, this.field154);
                            this.field319.method264((byte) 1, this.field357 + var4);
                            this.field319.method266(true, this.field152);
                            this.field319.method230(this.field356 + var3);
                        }
                        if (var5 == 534) {
                            ++field266;
                            if (field266 >= 82) {
                                this.field319.method228(179, true);
                                this.field319.method232(5085002);
                                field266 = 0;
                            }
                            this.method67(var6, var3, true, var4);
                            this.field319.method228(28, true);
                            this.field319.method264((byte) 1, this.field357 + var4);
                            this.field319.method264((byte) 1, var6 >> 14 & 32767);
                            this.field319.method266(true, this.field356 + var3);
                        }
                        if (var5 == 370) {
                            class7 var60 = this.field251[var6];
                            if (var60 != null) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var60.field664[0], 0, 0, this.field627, var60.field663[0], false, field238.field663[0]);
                                this.field464 = super.field1119;
                                this.field465 = super.field1120;
                                this.field467 = 2;
                                this.field466 = 0;
                                this.field319.method228(82, true);
                                this.field319.method230(var6);
                            }
                        }
                        if (var5 == 170) {
                            class7 var61 = this.field251[var6];
                            if (var61 != null) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var61.field664[0], 0, 0, this.field627, var61.field663[0], false, field238.field663[0]);
                                this.field464 = super.field1119;
                                this.field465 = super.field1120;
                                this.field467 = 2;
                                this.field466 = 0;
                                this.field319.method228(32, true);
                                this.field319.method265(0, var6);
                            }
                        }
                        if (var5 == 1163) {
                            class30 var62 = this.field281[var6];
                            if (var62 != null) {
                                class48 var63 = var62.field999;
                                if (var63.field1363 != null) {
                                    var63 = var63.method508(863);
                                }
                                if (var63 != null) {
                                    String var64;
                                    if (var63.field1356 != null) {
                                        var64 = new String(var63.field1356);
                                    } else {
                                        var64 = "It's a " + var63.field1355 + ".";
                                    }
                                    this.method110(0, 0, "", var64);
                                }
                            }
                        }
                        if (var5 == 588) {
                            class30 var65 = this.field281[var6];
                            if (var65 != null) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var65.field664[0], 0, 0, this.field627, var65.field663[0], false, field238.field663[0]);
                                this.field464 = super.field1119;
                                this.field465 = super.field1120;
                                this.field467 = 2;
                                this.field466 = 0;
                                this.field319.method228(238, true);
                                this.field319.method265(0, var6);
                            }
                        }
                        if (var5 == 139) {
                            this.field319.method228(62, true);
                            this.field319.method264((byte) 1, var4);
                            this.field319.method265(0, this.field629);
                            this.field319.method265(0, var3);
                            this.field319.method265(0, var6);
                            this.field507 = 0;
                            this.field508 = var4;
                            this.field509 = var3;
                            this.field510 = 2;
                            if (class63.method544(var4).field1508 == this.field455) {
                                this.field510 = 1;
                            }
                            if (class63.method544(var4).field1508 == this.field263) {
                                this.field510 = 3;
                            }
                        }
                        if (var5 == 715) {
                            class63 var66 = class63.method544(var4);
                            boolean var67 = true;
                            if (var66.field1503 > 0) {
                                var67 = this.method131(var66, -4);
                            }
                            if (var67) {
                                this.field319.method228(146, true);
                                this.field319.method230(var4);
                            }
                        }
                        if (var5 == 564) {
                            class7 var68 = this.field251[var6];
                            if (var68 != null) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var68.field664[0], 0, 0, this.field627, var68.field663[0], false, field238.field663[0]);
                                this.field464 = super.field1119;
                                this.field465 = super.field1120;
                                this.field467 = 2;
                                this.field466 = 0;
                                this.field319.method228(182, true);
                                this.field319.method265(0, var6);
                            }
                        }
                        if (var5 == 1937) {
                            class31 var69 = class31.method376(var6);
                            String var70;
                            if (var69.field1020 != null) {
                                var70 = new String(var69.field1020);
                            } else {
                                var70 = "It's a " + var69.field1009 + ".";
                            }
                            this.method110(0, 0, "", var70);
                        }
                        if (var5 == 642) {
                            boolean var71 = this.method160(0, field238.field664[0], 2, 0, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                            if (!var71) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var4, 0, 0, this.field627, var3, false, field238.field663[0]);
                            }
                            this.field464 = super.field1119;
                            this.field465 = super.field1120;
                            this.field467 = 2;
                            this.field466 = 0;
                            this.field319.method228(252, true);
                            this.field319.method266(true, this.field357 + var4);
                            this.field319.method264((byte) 1, this.field356 + var3);
                            this.field319.method264((byte) 1, var6);
                        }
                        if (var5 == 328 && !this.field588) {
                            this.field319.method228(95, true);
                            this.field319.method230(var4);
                            this.field588 = true;
                        }
                        if (var5 == 533) {
                            this.field319.method228(192, true);
                            this.field319.method230(var4);
                            this.field319.method264((byte) 1, var3);
                            this.field319.method230(var6);
                            this.field507 = 0;
                            this.field508 = var4;
                            this.field509 = var3;
                            this.field510 = 2;
                            if (class63.method544(var4).field1508 == this.field455) {
                                this.field510 = 1;
                            }
                            if (class63.method544(var4).field1508 == this.field263) {
                                this.field510 = 3;
                            }
                        }
                        if (var5 == 400) {
                            this.method67(var6, var3, true, var4);
                            this.field319.method228(143, true);
                            this.field319.method265(0, this.field357 + var4);
                            this.field319.method266(true, var6 >> 14 & 32767);
                            this.field319.method265(0, this.field356 + var3);
                        }
                        if (var5 == 471) {
                            class30 var73 = this.field281[var6];
                            if (var73 != null) {
                                this.method160(1, field238.field664[0], 2, 1, 0, var73.field664[0], 0, 0, this.field627, var73.field663[0], false, field238.field663[0]);
                                this.field464 = super.field1119;
                                this.field465 = super.field1120;
                                this.field467 = 2;
                                this.field466 = 0;
                                this.field319.method228(180, true);
                                this.field319.method264((byte) 1, this.field629);
                                this.field319.method264((byte) 1, var6);
                            }
                        }
                        if (var5 == 851) {
                            this.field319.method228(242, true);
                            this.field319.method266(true, var3);
                            this.field319.method230(var6);
                            this.field319.method230(var4);
                            this.field507 = 0;
                            this.field508 = var4;
                            this.field509 = var3;
                            this.field510 = 2;
                            if (class63.method544(var4).field1508 == this.field455) {
                                this.field510 = 1;
                            }
                            if (class63.method544(var4).field1508 == this.field263) {
                                this.field510 = 3;
                            }
                        }
                        if (var5 == 1039) {
                            this.method67(var6, var3, true, var4);
                            this.field319.method228(1, true);
                            this.field319.method265(0, this.field357 + var4);
                            this.field319.method264((byte) 1, var6 >> 14 & 32767);
                            this.field319.method266(true, this.field356 + var3);
                        }
                        this.field151 = 0;
                        this.field628 = 0;
                        this.field352 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
    public final void method136(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = 0;
        for (int var6 = 0; var6 < 100; ++var6) {
            if (this.field362[var6] != null) {
                int var7 = this.field360[var6];
                int var8 = 70 - var5 * 14 + this.field260 + 4;
                if (var8 < -20) {
                    break;
                }
                String var9 = this.field361[var6];
                boolean var10 = false;
                if (var9 != null && var9.startsWith("@cr1@")) {
                    var9 = var9.substring(5);
                    boolean var11 = true;
                }
                if (var9 != null && var9.startsWith("@cr2@")) {
                    var9 = var9.substring(5);
                    boolean var12 = true;
                }
                if (var7 == 0) {
                    ++var5;
                }
                if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field213 == 0 || this.field213 == 1 && this.method124(7, var9))) {
                    if (arg1 > var8 - 14 && arg1 <= var8 && !var9.equals(field238.field101)) {
                        if (this.field535 >= 1) {
                            this.field227[this.field546] = "Report abuse @whi@" + var9;
                            this.field189[this.field546] = 214;
                            ++this.field546;
                        }
                        this.field227[this.field546] = "Add ignore @whi@" + var9;
                        this.field189[this.field546] = 816;
                        ++this.field546;
                        this.field227[this.field546] = "Add friend @whi@" + var9;
                        this.field189[this.field546] = 465;
                        ++this.field546;
                    }
                    ++var5;
                }
                if ((var7 == 3 || var7 == 7) && this.field430 == 0 && (var7 == 7 || this.field581 == 0 || this.field581 == 1 && this.method124(7, var9))) {
                    if (arg1 > var8 - 14 && arg1 <= var8) {
                        if (this.field535 >= 1) {
                            this.field227[this.field546] = "Report abuse @whi@" + var9;
                            this.field189[this.field546] = 214;
                            ++this.field546;
                        }
                        this.field227[this.field546] = "Add ignore @whi@" + var9;
                        this.field189[this.field546] = 816;
                        ++this.field546;
                        this.field227[this.field546] = "Add friend @whi@" + var9;
                        this.field189[this.field546] = 465;
                        ++this.field546;
                    }
                    ++var5;
                }
                if (var7 == 4 && (this.field379 == 0 || this.field379 == 1 && this.method124(7, var9))) {
                    if (arg1 > var8 - 14 && arg1 <= var8) {
                        this.field227[this.field546] = "Accept trade @whi@" + var9;
                        this.field189[this.field546] = 743;
                        ++this.field546;
                    }
                    ++var5;
                }
                if ((var7 == 5 || var7 == 6) && this.field430 == 0 && this.field581 < 2) {
                    ++var5;
                }
                if (var7 == 8 && (this.field379 == 0 || this.field379 == 1 && this.method124(7, var9))) {
                    if (arg1 > var8 - 14 && arg1 <= var8) {
                        this.field227[this.field546] = "Accept challenge @whi@" + var9;
                        this.field189[this.field546] = 485;
                        ++this.field546;
                    }
                    ++var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method137(int arg0) {
        class64.field1605.method533();
        class64.field1608.method533();
        class48.field1337.method533();
        class31.field1025.method533();
        class31.field1004.method533();
        class7.field82.method533();
        if (arg0 <= 0) {
            this.field377 = !this.field377;
        }
        class67.field1703.method533();
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method138(int arg0) {
        if (this.field412 == 0) {
            this.field227[0] = "Cancel";
            this.field189[0] = 1472;
            this.field546 = 1;
            if (arg0 > 0) {
                if (this.field606 != -1) {
                    this.field516 = 0;
                    this.field603 = 0;
                    this.method182(0, 0, super.field1112, class63.method544(this.field606), (byte) 4, 0, super.field1113, 0);
                    if (this.field516 != this.field269) {
                        this.field269 = this.field516;
                    }
                    if (this.field603 != this.field161) {
                        this.field161 = this.field603;
                    }
                } else {
                    this.method126(this.field469);
                    this.field516 = 0;
                    this.field603 = 0;
                    if (super.field1112 > 4 && super.field1113 > 4 && super.field1112 < 516 && super.field1113 < 338) {
                        if (this.field455 != -1) {
                            this.method182(0, 0, super.field1112, class63.method544(this.field455), (byte) 4, 4, super.field1113, 4);
                        } else {
                            this.method112(-82);
                        }
                    }
                    if (this.field516 != this.field269) {
                        this.field269 = this.field516;
                    }
                    if (this.field603 != this.field161) {
                        this.field161 = this.field603;
                    }
                    this.field516 = 0;
                    this.field603 = 0;
                    if (super.field1112 > 553 && super.field1113 > 205 && super.field1112 < 743 && super.field1113 < 466) {
                        if (this.field369 != -1) {
                            this.method182(1, 0, super.field1112, class63.method544(this.field369), (byte) 4, 553, super.field1113, 205);
                        } else if (this.field619[this.field389] != -1) {
                            this.method182(1, 0, super.field1112, class63.method544(this.field619[this.field389]), (byte) 4, 553, super.field1113, 205);
                        }
                    }
                    if (this.field516 != this.field431) {
                        this.field352 = true;
                        this.field431 = this.field516;
                    }
                    if (this.field603 != this.field596) {
                        this.field352 = true;
                        this.field596 = this.field603;
                    }
                    this.field516 = 0;
                    this.field603 = 0;
                    if (super.field1112 > 17 && super.field1113 > 357 && super.field1112 < 496 && super.field1113 < 453) {
                        if (this.field263 != -1) {
                            this.method182(2, 0, super.field1112, class63.method544(this.field263), (byte) 4, 17, super.field1113, 357);
                        } else if (this.field438 != -1) {
                            this.method182(3, 0, super.field1112, class63.method544(this.field438), (byte) 4, 17, super.field1113, 357);
                        } else if (super.field1113 < 434 && super.field1112 < 426 && this.field524 == 0) {
                            this.method136(-413, super.field1113 - 357, super.field1112 - 17);
                        }
                    }
                    if ((this.field263 != -1 || this.field438 != -1) && this.field534 != this.field516) {
                        this.field221 = true;
                        this.field534 = this.field516;
                    }
                    if ((this.field263 != -1 || this.field438 != -1) && this.field603 != this.field541) {
                        this.field221 = true;
                        this.field541 = this.field603;
                    }
                    boolean var2 = false;
                    while (!var2) {
                        var2 = true;
                        for (int var3 = 0; var3 < this.field546 - 1; ++var3) {
                            if (this.field189[var3] < 1000 && this.field189[var3 + 1] > 1000) {
                                String var4 = this.field227[var3];
                                this.field227[var3] = this.field227[var3 + 1];
                                this.field227[var3 + 1] = var4;
                                int var5 = this.field189[var3];
                                this.field189[var3] = this.field189[var3 + 1];
                                this.field189[var3 + 1] = var5;
                                int var6 = this.field187[var3];
                                this.field187[var3] = this.field187[var3 + 1];
                                this.field187[var3 + 1] = var6;
                                int var7 = this.field188[var3];
                                this.field188[var3] = this.field188[var3 + 1];
                                this.field188[var3 + 1] = var7;
                                int var8 = this.field190[var3];
                                this.field190[var3] = this.field190[var3 + 1];
                                this.field190[var3 + 1] = var8;
                                var2 = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method139(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method139(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (this.field546 >= 2 || this.field151 != 0 || this.field628 != 0) {
            int var2 = 61 / arg0;
            String var3;
            if (this.field151 == 1 && this.field546 < 2) {
                var3 = "Use " + this.field155 + " with...";
            } else if (this.field628 == 1 && this.field546 < 2) {
                var3 = this.field631 + "...";
            } else {
                var3 = this.field227[this.field546 - 1];
            }
            if (this.field546 > 2) {
                var3 = var3 + "@whi@ / " + (this.field546 - 2) + " more options";
            }
            this.field452.method340(var3, 15, true, 16777215, false, 4, field598 / 1000);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILEYMNCFMK;I)V")
    private final void method141(int arg0, class18 arg1, int arg2) {
        label49: while (true) {
            if (arg0 >= 0) {
                int var10 = 1;
                while (true) {
                    if (var10 <= 0) {
                        continue label49;
                    }
                    ++var10;
                }
            }
            while (arg1.field795 + 10 < arg2 * 8) {
                int var4 = arg1.method250((byte) 79, 11);
                if (var4 == 2047) {
                    break;
                }
                if (this.field251[var4] == null) {
                    this.field251[var4] = new class7();
                    if (this.field256[var4] != null) {
                        this.field251[var4].method39(-925, this.field256[var4]);
                    }
                }
                this.field253[this.field252++] = var4;
                class7 var5 = this.field251[var4];
                var5.field683 = field598;
                int var6 = arg1.method250((byte) 79, 1);
                if (var6 == 1) {
                    this.field255[this.field254++] = var4;
                }
                int var7 = arg1.method250((byte) 79, 1);
                int var8 = arg1.method250((byte) 79, 5);
                if (var8 > 15) {
                    var8 -= 32;
                }
                int var9 = arg1.method250((byte) 79, 5);
                if (var9 > 15) {
                    var9 -= 32;
                }
                var5.method195(var7 == 1, field238.field664[0] + var8, true, field238.field663[0] + var9);
            }
            arg1.method251(this.field590);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LEFVUNBHT;IIB)V")
    public final void method142(class16 arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg1 * arg1 + arg2 * arg2;
        if (arg3 != 0) {
            this.field445 = -1;
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field457 + this.field200 & 2047;
            int var7 = class41.field1252[var6];
            int var8 = class41.field1253[var6];
            int var9 = var7 * 256 / (this.field526 + 256);
            int var10 = var8 * 256 / (this.field526 + 256);
            int var11 = arg1 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field341.method220(15, 20, 850, 20, 15, var13, 256, 83 - var16 - 20, var15 + 94 + 4 - 10);
        } else {
            this.method186(arg2, arg1, arg0, 945);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILEYMNCFMK;I)V")
    public final void method143(int arg0, class18 arg1, int arg2) {
        this.field444 += arg2;
        if (arg0 == 213) {
            int var4 = arg1.method259((byte) 0);
            int var5 = var4 >> 2;
            int var6 = var4 & 3;
            int var7 = this.field497[var5];
            int var8 = arg1.method258(997);
            int var9 = (var8 >> 4 & 7) + this.field247;
            int var10 = (var8 & 7) + this.field248;
            int var11 = arg1.method268((byte) 6);
            if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
                int var12 = this.field403[this.field274][var9][var10];
                int var13 = this.field403[this.field274][var9 + 1][var10];
                int var14 = this.field403[this.field274][var9 + 1][var10 + 1];
                int var15 = this.field403[this.field274][var9][var10 + 1];
                if (var7 == 0) {
                    class43 var16 = this.field285.method301(this.field274, true, var10, var9);
                    if (var16 != null) {
                        int var17 = var16.field1270 >> 14 & 32767;
                        if (var5 == 2) {
                            var16.field1268 = new class15(723, var15, var14, var11, var13, var12, var6 + 4, var17, false, 2);
                            var16.field1269 = new class15(723, var15, var14, var11, var13, var12, var6 + 1 & 3, var17, false, 2);
                        } else {
                            var16.field1268 = new class15(723, var15, var14, var11, var13, var12, var6, var17, false, var5);
                        }
                    }
                }
                if (var7 == 1) {
                    class54 var18 = this.field285.method302((byte) 3, this.field274, var10, var9);
                    if (var18 != null) {
                        var18.field1431 = new class15(723, var15, var14, var11, var13, var12, 0, var18.field1432 >> 14 & 32767, false, 4);
                    }
                }
                if (var7 == 2) {
                    class55 var19 = this.field285.method303(this.field274, var9, false, var10);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var19 != null) {
                        var19.field1438 = new class15(723, var15, var14, var11, var13, var12, var6, var19.field1446 >> 14 & 32767, false, var5);
                    }
                }
                if (var7 == 3) {
                    class28 var20 = this.field285.method304(var9, this.field274, (byte) 0, var10);
                    if (var20 != null) {
                        var20.field982 = new class15(723, var15, var14, var11, var13, var12, var6, var20.field983 >> 14 & 32767, false, 22);
                    }
                }
            }
        } else if (arg0 == 22) {
            int var21 = arg1.method239();
            int var22 = (var21 >> 4 & 7) + this.field247;
            int var23 = (var21 & 7) + this.field248;
            int var24 = arg1.method241();
            int var25 = arg1.method241();
            int var26 = arg1.method241();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                class12 var27 = this.field572[this.field274][var22][var23];
                if (var27 != null) {
                    for (class61 var28 = (class61) var27.method200(); var28 != null; var28 = (class61) var27.method202(569)) {
                        if ((var24 & 32767) == var28.field1496 && var28.field1494 == var25) {
                            var28.field1494 = var26;
                            break;
                        }
                    }
                    this.method69(var22, var23);
                }
            }
        } else {
            if (arg0 == 8) {
                int var29 = arg1.method239();
                int var30 = (var29 >> 4 & 7) + this.field247;
                int var31 = (var29 & 7) + this.field248;
                int var32 = arg1.method241();
                int var33 = arg1.method239();
                int var34 = var33 >> 4 & 15;
                int var35 = var33 & 7;
                if (field238.field663[0] >= var30 - var34 && field238.field663[0] <= var30 + var34 && field238.field664[0] >= var31 - var34 && field238.field664[0] <= var31 + var34 && this.field275 && !field211 && this.field522 < 50) {
                    this.field193[this.field522] = var32;
                    this.field595[this.field522] = var35;
                    this.field498[this.field522] = class39.field1153[var32];
                    ++this.field522;
                }
            }
            if (arg0 == 102) {
                int var36 = arg1.method239();
                int var37 = (var36 >> 4 & 7) + this.field247;
                int var38 = (var36 & 7) + this.field248;
                int var39 = var37 + arg1.method240();
                int var40 = var38 + arg1.method240();
                int var41 = arg1.method242();
                int var42 = arg1.method241();
                int var43 = arg1.method239() * 4;
                int var44 = arg1.method239() * 4;
                int var45 = arg1.method241();
                int var46 = arg1.method241();
                int var47 = arg1.method239();
                int var48 = arg1.method239();
                if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var42 != 65535) {
                    int var49 = var37 * 128 + 64;
                    int var50 = var38 * 128 + 64;
                    int var51 = var39 * 128 + 64;
                    int var52 = var40 * 128 + 64;
                    class8 var53 = new class8(var41, var44, field598 + var45, this.field274, var42, var49, var50, field598 + var46, var48, var47, this.method184((byte) -28, this.field274, var49, var50) - var43, 0);
                    var53.method43(var52, this.method184((byte) -28, this.field274, var51, var52) - var44, field598 + var45, -37962, var51);
                    this.field558.method197(var53);
                }
            } else if (arg0 == 61) {
                int var54 = arg1.method239();
                int var55 = (var54 >> 4 & 7) + this.field247;
                int var56 = (var54 & 7) + this.field248;
                int var57 = arg1.method258(997);
                int var58 = var57 >> 2;
                int var59 = var57 & 3;
                int var60 = this.field497[var58];
                if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                    this.method173(var55, var58, var56, 0, (byte) 9, var59, var60, this.field274, -1, -1);
                }
            } else if (arg0 == 212) {
                int var61 = arg1.method268((byte) 6);
                int var62 = arg1.method259((byte) 0);
                int var63 = (var62 >> 4 & 7) + this.field247;
                int var64 = (var62 & 7) + this.field248;
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class12 var65 = this.field572[this.field274][var63][var64];
                    if (var65 != null) {
                        for (class61 var66 = (class61) var65.method200(); var66 != null; var66 = (class61) var65.method202(569)) {
                            if ((var61 & 32767) == var66.field1496) {
                                var66.method205();
                                break;
                            }
                        }
                        if (var65.method200() == null) {
                            this.field572[this.field274][var63][var64] = null;
                        }
                        this.method69(var63, var64);
                    }
                }
            } else if (arg0 == 197) {
                int var67 = arg1.method239();
                int var68 = (var67 >> 4 & 7) + this.field247;
                int var69 = (var67 & 7) + this.field248;
                int var70 = arg1.method241();
                int var71 = arg1.method239();
                int var72 = arg1.method241();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    int var73 = var68 * 128 + 64;
                    int var74 = var69 * 128 + 64;
                    class1 var75 = new class1(var73, (byte) 112, this.field274, var70, var72, field598, var74, this.method184((byte) -28, this.field274, var73, var74) - var71);
                    this.field185.method197(var75);
                }
            } else if (arg0 == 222) {
                int var76 = arg1.method268((byte) 6);
                int var77 = arg1.method258(997);
                int var78 = (var77 >> 4 & 7) + this.field247;
                int var79 = (var77 & 7) + this.field248;
                int var80 = arg1.method269(true);
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    class61 var81 = new class61();
                    var81.field1496 = var76;
                    var81.field1494 = var80;
                    if (this.field572[this.field274][var78][var79] == null) {
                        this.field572[this.field274][var78][var79] = new class12((byte) 5);
                    }
                    this.field572[this.field274][var78][var79].method197(var81);
                    this.method69(var78, var79);
                }
            } else if (arg0 == 225) {
                int var82 = arg1.method260(-377);
                int var83 = var82 >> 2;
                int var84 = var82 & 3;
                int var85 = this.field497[var83];
                int var86 = arg1.method269(true);
                int var87 = arg1.method239();
                int var88 = (var87 >> 4 & 7) + this.field247;
                int var89 = (var87 & 7) + this.field248;
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    this.method173(var88, var83, var89, 0, (byte) 9, var84, var85, this.field274, -1, var86);
                }
            } else if (arg0 == 255) {
                int var90 = arg1.method269(true);
                int var91 = arg1.method239();
                int var92 = (var91 >> 4 & 7) + this.field247;
                int var93 = (var91 & 7) + this.field248;
                int var94 = arg1.method241();
                int var95 = arg1.method268((byte) 6);
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && this.field530 != var94) {
                    class61 var96 = new class61();
                    var96.field1496 = var90;
                    var96.field1494 = var95;
                    if (this.field572[this.field274][var92][var93] == null) {
                        this.field572[this.field274][var92][var93] = new class12((byte) 5);
                    }
                    this.field572[this.field274][var92][var93].method197(var96);
                    this.method69(var92, var93);
                }
            } else {
                if (arg0 == 99) {
                    int var97 = arg1.method241();
                    byte var98 = arg1.method261(340);
                    int var99 = arg1.method258(997);
                    int var100 = var99 >> 2;
                    int var101 = var99 & 3;
                    int var102 = this.field497[var100];
                    int var103 = arg1.method268((byte) 6);
                    byte var104 = arg1.method263(0);
                    int var105 = arg1.method269(true);
                    byte var106 = arg1.method262((byte) 1);
                    int var107 = arg1.method267((byte) -97);
                    int var108 = arg1.method239();
                    int var109 = (var108 >> 4 & 7) + this.field247;
                    int var110 = (var108 & 7) + this.field248;
                    byte var111 = arg1.method261(340);
                    class7 var112;
                    if (this.field530 == var107) {
                        var112 = field238;
                    } else {
                        var112 = this.field251[var107];
                    }
                    if (var112 != null) {
                        class64 var113 = class64.method548(var105);
                        int var114 = this.field403[this.field274][var109][var110];
                        int var115 = this.field403[this.field274][var109 + 1][var110];
                        int var116 = this.field403[this.field274][var109 + 1][var110 + 1];
                        int var117 = this.field403[this.field274][var109][var110 + 1];
                        class41 var118 = var113.method549(var100, var101, var114, var115, var116, var117, -1);
                        if (var118 != null) {
                            this.method173(var109, 0, var110, var103 + 1, (byte) 9, 0, var102, this.field274, var97 + 1, -1);
                            var112.field75 = field598 + var103;
                            var112.field76 = field598 + var97;
                            var112.field99 = var118;
                            int var119 = var113.field1603;
                            int var120 = var113.field1613;
                            if (var101 == 1 || var101 == 3) {
                                var119 = var113.field1613;
                                var120 = var113.field1603;
                            }
                            var112.field96 = var109 * 128 + var119 * 64;
                            var112.field98 = var110 * 128 + var120 * 64;
                            var112.field97 = this.method184((byte) -28, this.field274, var112.field96, var112.field98);
                            if (var98 > var106) {
                                byte var121 = var98;
                                var98 = var106;
                                var106 = var121;
                            }
                            if (var111 > var104) {
                                byte var122 = var111;
                                var111 = var104;
                                var104 = var122;
                            }
                            var112.field89 = var98 + var109;
                            var112.field91 = var106 + var109;
                            var112.field90 = var110 + var111;
                            var112.field92 = var104 + var110;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method144(byte arg0) {
        this.field553.method584(-186);
        class3.field42 = this.field349;
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field533 = -146;
        }
        this.field484.method401(1, 0, 0);
        if (this.field369 != -1) {
            this.method125(0, 0, 0, class63.method544(this.field369), 726);
        } else if (this.field619[this.field389] != -1) {
            this.method125(0, 0, 0, class63.method544(this.field619[this.field389]), 726);
        }
        if (this.field589 && this.field502 == 1) {
            this.method49((byte) 114);
        }
        this.field553.method585(super.field1104, 205, 904, 553);
        this.field555.method584(-186);
        class3.field42 = this.field350;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ILEYMNCFMK;I)V")
    private final void method145(int arg0, class18 arg1, int arg2) {
        arg1.method249((byte) 9);
        int var4 = arg1.method250((byte) 79, 8);
        if (var4 < this.field282) {
            for (int var5 = var4; var5 < this.field282; ++var5) {
                this.field585[this.field584++] = this.field283[var5];
            }
        }
        if (var4 > this.field282) {
            signlink.reporterror(this.field180 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field282 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field283[var6];
                class30 var8 = this.field281[var7];
                int var9 = arg1.method250((byte) 79, 1);
                if (var9 == 0) {
                    this.field283[this.field282++] = var7;
                    var8.field683 = field598;
                } else {
                    int var10 = arg1.method250((byte) 79, 2);
                    if (var10 == 0) {
                        this.field283[this.field282++] = var7;
                        var8.field683 = field598;
                        this.field255[this.field254++] = var7;
                    } else if (var10 == 1) {
                        this.field283[this.field282++] = var7;
                        var8.field683 = field598;
                        int var11 = arg1.method250((byte) 79, 3);
                        var8.method196(false, false, var11);
                        int var12 = arg1.method250((byte) 79, 1);
                        if (var12 == 1) {
                            this.field255[this.field254++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field283[this.field282++] = var7;
                        var8.field683 = field598;
                        int var13 = arg1.method250((byte) 79, 3);
                        var8.method196(true, false, var13);
                        int var14 = arg1.method250((byte) 79, 3);
                        var8.method196(true, false, var14);
                        int var15 = arg1.method250((byte) 79, 1);
                        if (var15 == 1) {
                            this.field255[this.field254++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field585[this.field584++] = var7;
                    }
                }
            }
            if (arg0 >= 0) {
                this.field162 = !this.field162;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)I")
    public final int method146(int arg0) {
        int var2 = 3;
        if (arg0 <= 0) {
            return this.field460;
        } else {
            if (this.field564 < 310) {
                int var3 = this.field561 >> 7;
                int var4 = this.field563 >> 7;
                int var5 = field238.field659 >> 7;
                int var6 = field238.field660 >> 7;
                if ((this.field191[this.field274][var3][var4] & 4) != 0) {
                    var2 = this.field274;
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
                        if ((this.field191[this.field274][var3][var4] & 4) != 0) {
                            var2 = this.field274;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field191[this.field274][var3][var4] & 4) != 0) {
                                var2 = this.field274;
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
                        if ((this.field191[this.field274][var3][var4] & 4) != 0) {
                            var2 = this.field274;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field191[this.field274][var3][var4] & 4) != 0) {
                                var2 = this.field274;
                            }
                        }
                    }
                }
            }
            if ((this.field191[this.field274][field238.field659 >> 7][field238.field660 >> 7] & 4) != 0) {
                var2 = this.field274;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)I")
    public final int method147(int arg0) {
        int var2 = this.method184((byte) -28, this.field274, this.field561, this.field563);
        if (arg0 != -1399) {
            this.field319.method229(40);
        }
        return var2 - this.field562 < 800 && (this.field191[this.field274][this.field561 >> 7][this.field563 >> 7] & 4) != 0 ? this.field274 : 3;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method148(boolean arg0) {
        this.field422 = 0;
        int var2 = (field238.field659 >> 7) + this.field356;
        int var3 = (field238.field660 >> 7) + this.field357;
        if (arg0) {
            this.field621 = 122;
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field422 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field422 = 1;
        }
        if (this.field422 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field422 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    private final void method149(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field298 == 2) {
            for (class10 var3 = (class10) this.field532.method200(); var3 != null; var3 = (class10) this.field532.method202(569)) {
                if (var3.field642 > 0) {
                    --var3.field642;
                }
                if (var3.field642 == 0) {
                    if (var3.field647 < 0 || class46.method462(27253, var3.field649, var3.field647)) {
                        this.method55(var3.field638, var3.field647, var3.field639, var3.field640, (byte) 3, var3.field649, var3.field648, var3.field641);
                        var3.method205();
                    }
                } else {
                    if (var3.field646 > 0) {
                        --var3.field646;
                    }
                    if (var3.field646 == 0 && var3.field640 >= 1 && var3.field641 >= 1 && var3.field640 <= 102 && var3.field641 <= 102 && (var3.field643 < 0 || class46.method462(27253, var3.field645, var3.field643))) {
                        this.method55(var3.field638, var3.field643, var3.field639, var3.field640, (byte) 3, var3.field645, var3.field644, var3.field641);
                        var3.field646 = -1;
                        if (var3.field647 == var3.field643 && var3.field647 == -1) {
                            var3.method205();
                        } else if (var3.field647 == var3.field643 && var3.field648 == var3.field644 && var3.field649 == var3.field645) {
                            var3.method205();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg1 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg0;
        if (var8 != 0) {
            int var13 = class41.field1252[var8];
            int var14 = class41.field1253[var8];
            int var15 = var11 * var14 - arg0 * var13 >> 16;
            var12 = var11 * var13 + arg0 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class41.field1252[var9];
            int var17 = class41.field1253[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field561 = arg3 - var10;
        this.field562 = arg4 - var11;
        this.field563 = arg5 - var12;
        this.field564 = arg6;
        this.field565 = arg1;
        if (arg2 != 0) {
            this.method133();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field285.method305(arg2, arg3, arg4);
        if (var7 != 0) {
            int var8 = this.field285.method309(arg2, arg3, arg4, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg0;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field545.field759;
            int var13 = (103 - arg4) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class64 var15 = class64.method548(var14);
            if (var15.field1593 != -1) {
                class38 var16 = this.field622[var15.field1593];
                if (var16 != null) {
                    int var17 = (var15.field1603 * 4 - var16.field1144) / 2;
                    int var18 = (var15.field1613 * 4 - var16.field1145) / 2;
                    var16.method401(1, arg3 * 4 + 48 + var17, (104 - arg4 - var15.field1613) * 4 + 48 + var18);
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
        int var19 = this.field285.method307(arg2, arg3, arg4);
        if (arg1 > 0) {
            if (var19 != 0) {
                int var20 = this.field285.method309(arg2, arg3, arg4, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                class64 var24 = class64.method548(var23);
                if (var24.field1593 != -1) {
                    class38 var25 = this.field622[var24.field1593];
                    if (var25 != null) {
                        int var26 = (var24.field1603 * 4 - var25.field1144) / 2;
                        int var27 = (var24.field1613 * 4 - var25.field1145) / 2;
                        var25.method401(1, arg3 * 4 + 48 + var26, (104 - arg4 - var24.field1613) * 4 + 48 + var27);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field545.field759;
                    int var30 = (103 - arg4) * 512 * 4 + arg3 * 4 + 24624;
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
            int var31 = this.field285.method308(arg2, arg3, arg4);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                class64 var33 = class64.method548(var32);
                if (var33.field1593 != -1) {
                    class38 var34 = this.field622[var33.field1593];
                    if (var34 != null) {
                        int var35 = (var33.field1603 * 4 - var34.field1144) / 2;
                        int var36 = (var33.field1613 * 4 - var34.field1145) / 2;
                        var34.method401(1, arg3 * 4 + 48 + var35, (104 - arg4 - var33.field1613) * 4 + 48 + var36);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    private static final String method152(byte arg0, int arg1) {
        if (arg0 != 1) {
            field245 = -461;
        }
        String var2 = String.valueOf(arg1);
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZZ)V")
    public final void method153(int arg0, boolean arg1, boolean arg2) {
        this.field521 &= arg2;
        signlink.midivol = arg0;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILVTUPBFSN;)V")
    public final void method154(int arg0, class63 arg1) {
        int var3 = arg1.field1503;
        this.field444 += arg0;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field365;
                if (this.field366 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field1562 = "";
                    arg1.field1500 = 0;
                } else {
                    if (this.field158[var3] == 0) {
                        arg1.field1562 = "@red@Offline";
                    } else if (this.field158[var3] < 200) {
                        if (this.field158[var3] == field208) {
                            arg1.field1562 = "@gre@World" + (this.field158[var3] - 9);
                        } else {
                            arg1.field1562 = "@yel@World" + (this.field158[var3] - 9);
                        }
                    } else if (this.field158[var3] == field208) {
                        arg1.field1562 = "@gre@Classic" + (this.field158[var3] - 219);
                    } else {
                        arg1.field1562 = "@yel@Classic" + (this.field158[var3] - 219);
                    }
                    arg1.field1500 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field365;
                if (this.field366 != 2) {
                    var6 = 0;
                }
                arg1.field1502 = var6 * 15 + 20;
                if (arg1.field1502 <= arg1.field1505) {
                    arg1.field1502 = arg1.field1505 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field366 == 0) {
                    arg1.field1562 = "Loading ignore list";
                    arg1.field1500 = 0;
                } else if (var3 == 1 && this.field366 == 0) {
                    arg1.field1562 = "Please wait...";
                    arg1.field1500 = 0;
                } else {
                    int var7 = this.field233;
                    if (this.field366 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1562 = "";
                        arg1.field1500 = 0;
                    } else {
                        arg1.field1562 = class32.method384(this.field368, class32.method381(this.field392[var3], (byte) 82));
                        arg1.field1500 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1502 = this.field233 * 15 + 20;
                if (arg1.field1502 <= arg1.field1505) {
                    arg1.field1502 = arg1.field1505 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1556 = 150;
                arg1.field1557 = (int) (Math.sin((double) field598 / 40.0D) * 256.0D) & 2047;
                if (this.field416) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field237[var8];
                        if (var15 >= 0 && !class71.field1727[var15].method589(0)) {
                            return;
                        }
                    }
                    this.field416 = false;
                    class41[] var9 = new class41[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field237[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class71.field1727[var14].method590(true);
                        }
                    }
                    class41 var12 = new class41(var10, (byte) 112, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field246[var13] != 0) {
                            var12.method427(field164[var13][0], field164[var13][this.field246[var13]]);
                            if (var13 == 1) {
                                var12.method427(field632[0], field632[this.field246[var13]]);
                            }
                        }
                    }
                    var12.method420(this.field538);
                    var12.method421(771, class14.field717[field238.field697].field719[0]);
                    var12.method430(64, 850, -30, -50, -30, true);
                    arg1.field1553 = 5;
                    arg1.field1554 = 0;
                    class63.method540(5, false, var12, 0);
                }
            } else if (var3 == 324) {
                if (this.field494 == null) {
                    this.field494 = arg1.field1529;
                    this.field495 = arg1.field1552;
                }
                if (this.field591) {
                    arg1.field1529 = this.field495;
                } else {
                    arg1.field1529 = this.field494;
                }
            } else if (var3 == 325) {
                if (this.field494 == null) {
                    this.field494 = arg1.field1529;
                    this.field495 = arg1.field1552;
                }
                if (this.field591) {
                    arg1.field1529 = this.field494;
                } else {
                    arg1.field1529 = this.field495;
                }
            } else if (var3 == 600) {
                arg1.field1562 = this.field279;
                if (field598 % 20 < 10) {
                    arg1.field1562 = arg1.field1562 + "|";
                } else {
                    arg1.field1562 = arg1.field1562 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field535 >= 1) {
                        if (this.field592) {
                            arg1.field1520 = 16711680;
                            arg1.field1562 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1520 = 16777215;
                            arg1.field1562 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1562 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field549 - this.field289;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field1562 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field144 == 0) {
                        arg1.field1562 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field144 <= this.field549) {
                        arg1.field1562 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method155(this.field144, 6);
                    } else {
                        int var18 = this.field549 + 14 - this.field144;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field1562 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method155(this.field144, 6) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field284 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field284 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field284 + " unread messages";
                    }
                    arg1.field1562 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field580 > 0 && this.field580 <= this.field549 + 10) {
                        arg1.field1562 = "Last password change:\\n@gre@" + this.method155(this.field580, 6);
                    } else {
                        arg1.field1562 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field515 > 2 && !field210) {
                        arg1.field1562 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field515 > 2) {
                        arg1.field1562 = "\\n\\nYou have @gre@" + this.field515 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field515 > 0) {
                        arg1.field1562 = "You have @gre@" + this.field515 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field1562 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field515 > 2 && !field210) {
                        arg1.field1562 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field515 > 0) {
                        arg1.field1562 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field1562 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field144 > this.field549) {
                        arg1.field1562 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field1562 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field366 == 0) {
            arg1.field1562 = "Loading friend list";
            arg1.field1500 = 0;
        } else if (var3 == 1 && this.field366 == 1) {
            arg1.field1562 = "Connecting to friendserver";
            arg1.field1500 = 0;
        } else if (var3 == 2 && this.field366 != 2) {
            arg1.field1562 = "Please wait...";
            arg1.field1500 = 0;
        } else {
            int var4 = this.field365;
            if (this.field366 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field1562 = "";
                arg1.field1500 = 0;
            } else {
                arg1.field1562 = this.field520[var3];
                arg1.field1500 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
    public final String method155(int arg0, int arg1) {
        if (arg0 > this.field549 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            if (arg1 >= this.field363 && arg1 <= this.field363) {
                int var6 = var5.get(5);
                int var7 = var5.get(2);
                int var8 = var5.get(1);
                String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
                return var6 + "-" + var9[var7] + "-" + var8;
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
    public final void method156(int arg0, int arg1) {
        int[] var3 = this.field545.field759;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field191[arg1][var24][var6] & 24) == 0) {
                    this.field285.method314(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field191[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field285.method314(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field545.method210(-186);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field191[arg1][var22][var9] & 24) == 0) {
                    this.method151(var7, 419, arg1, var22, var9, var8);
                }
                if (arg1 < 3 && (this.field191[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method151(var7, 419, arg1 + 1, var22, var9, var8);
                }
            }
        }
        if (this.field555 != null) {
            this.field555.method584(-186);
            class3.field42 = this.field350;
        }
        this.field499 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field285.method308(this.field274, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class64.method548(var13).field1589;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field620[this.field274].field1742;
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
                        this.field268[this.field499] = this.field536[var14];
                        this.field500[this.field499] = var15;
                        this.field501[this.field499] = var16;
                        ++this.field499;
                    }
                }
            }
        }
        if (arg0 == 467) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IILEYMNCFMK;)V")
    private final void method157(int arg0, int arg1, class18 arg2) {
        if (arg1 < 0) {
            for (int var4 = 0; var4 < this.field254; ++var4) {
                int var5 = this.field255[var4];
                class30 var6 = this.field281[var5];
                int var7 = arg2.method239();
                if ((var7 & 64) != 0) {
                    int var8 = arg2.method239();
                    int var9 = arg2.method258(997);
                    var6.method194(30312, field598, var9, var8);
                    var6.field669 = field598 + 300;
                    var6.field670 = arg2.method260(-377);
                    var6.field671 = arg2.method239();
                }
                if ((var7 & 32) != 0) {
                    var6.field999 = class48.method512(arg2.method269(true));
                    var6.field681 = var6.field999.field1347;
                    var6.field696 = var6.field999.field1357;
                    var6.field665 = var6.field999.field1351;
                    var6.field666 = var6.field999.field1358;
                    var6.field667 = var6.field999.field1359;
                    var6.field668 = var6.field999.field1361;
                    var6.field697 = var6.field999.field1353;
                }
                if ((var7 & 2) != 0) {
                    var6.field703 = arg2.method269(true);
                    var6.field704 = arg2.method269(true);
                }
                if ((var7 & 128) != 0) {
                    var6.field653 = arg2.method268((byte) 6);
                    int var10 = arg2.method275(360);
                    var6.field657 = var10 >> 16;
                    var6.field656 = (var10 & 65535) + field598;
                    var6.field654 = 0;
                    var6.field655 = 0;
                    if (var6.field656 > field598) {
                        var6.field654 = -1;
                    }
                    if (var6.field653 == 65535) {
                        var6.field653 = -1;
                    }
                }
                if ((var7 & 4) != 0) {
                    var6.field699 = arg2.method246();
                    var6.field707 = 100;
                }
                if ((var7 & 16) != 0) {
                    var6.field695 = arg2.method267((byte) -97);
                    if (var6.field695 == 65535) {
                        var6.field695 = -1;
                    }
                }
                if ((var7 & 1) != 0) {
                    int var11 = arg2.method260(-377);
                    int var12 = arg2.method260(-377);
                    var6.method194(30312, field598, var12, var11);
                    var6.field669 = field598 + 300;
                    var6.field670 = arg2.method258(997);
                    var6.field671 = arg2.method258(997);
                }
                if ((var7 & 8) != 0) {
                    int var13 = arg2.method269(true);
                    if (var13 == 65535) {
                        var13 = -1;
                    }
                    int var14 = arg2.method259((byte) 0);
                    if (var6.field685 == var13 && var13 != -1) {
                        int var15 = class14.field717[var13].field731;
                        if (var15 == 1) {
                            var6.field686 = 0;
                            var6.field687 = 0;
                            var6.field688 = var14;
                            var6.field689 = 0;
                        }
                        if (var15 == 2) {
                            var6.field689 = 0;
                        }
                    } else if (var13 == -1 || var6.field685 == -1 || class14.field717[var13].field725 >= class14.field717[var6.field685].field725) {
                        var6.field685 = var13;
                        var6.field686 = 0;
                        var6.field687 = 0;
                        var6.field688 = var14;
                        var6.field689 = 0;
                        var6.field694 = var6.field658;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method158(int arg0) {
        if (!this.field399 && !this.field548 && !this.field342) {
            ++field598;
            if (arg0 != 9800) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (!this.field521) {
                this.method177(0);
            } else {
                this.method70((byte) 13);
            }
            this.method132(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method159(int arg0, byte arg1) {
        if (arg1 != -8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public final boolean method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var40 = 0; var40 < var14; ++var40) {
                this.field390[var15][var40] = 0;
                this.field276[var15][var40] = 99999999;
            }
        }
        int var16 = arg11;
        int var17 = arg1;
        this.field390[arg11][arg1] = 99;
        this.field276[arg11][arg1] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field397[var18] = arg11;
        int var41 = var18 + 1;
        this.field398[var18] = arg1;
        boolean var20 = false;
        int var21 = this.field397.length;
        int[][] var22 = this.field620[this.field274].field1742;
        while (var41 != var19) {
            var16 = this.field397[var19];
            var17 = this.field398[var19];
            var19 = (var19 + 1) % var21;
            if (arg9 == var16 && arg5 == var17) {
                var20 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && this.field620[this.field274].method602(arg6 - 1, -25144, arg4, arg9, arg5, var16, var17)) {
                    var20 = true;
                    break;
                }
                if (arg6 < 10 && this.field620[this.field274].method603(true, arg9, arg5, arg6 - 1, var16, var17, arg4)) {
                    var20 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg3 != 0 && this.field620[this.field274].method604(arg0, true, var17, arg3, var16, arg7, arg9, arg5)) {
                var20 = true;
                break;
            }
            int var39 = this.field276[var16][var17] + 1;
            if (var16 > 0 && this.field390[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field397[var41] = var16 - 1;
                this.field398[var41] = var17;
                var41 = (var41 + 1) % var21;
                this.field390[var16 - 1][var17] = 2;
                this.field276[var16 - 1][var17] = var39;
            }
            if (var16 < var13 - 1 && this.field390[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field397[var41] = var16 + 1;
                this.field398[var41] = var17;
                var41 = (var41 + 1) % var21;
                this.field390[var16 + 1][var17] = 8;
                this.field276[var16 + 1][var17] = var39;
            }
            if (var17 > 0 && this.field390[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field397[var41] = var16;
                this.field398[var41] = var17 - 1;
                var41 = (var41 + 1) % var21;
                this.field390[var16][var17 - 1] = 1;
                this.field276[var16][var17 - 1] = var39;
            }
            if (var17 < var14 - 1 && this.field390[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field397[var41] = var16;
                this.field398[var41] = var17 + 1;
                var41 = (var41 + 1) % var21;
                this.field390[var16][var17 + 1] = 4;
                this.field276[var16][var17 + 1] = var39;
            }
            if (var16 > 0 && var17 > 0 && this.field390[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field397[var41] = var16 - 1;
                this.field398[var41] = var17 - 1;
                var41 = (var41 + 1) % var21;
                this.field390[var16 - 1][var17 - 1] = 3;
                this.field276[var16 - 1][var17 - 1] = var39;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field390[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field397[var41] = var16 + 1;
                this.field398[var41] = var17 - 1;
                var41 = (var41 + 1) % var21;
                this.field390[var16 + 1][var17 - 1] = 9;
                this.field276[var16 + 1][var17 - 1] = var39;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field390[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field397[var41] = var16 - 1;
                this.field398[var41] = var17 + 1;
                var41 = (var41 + 1) % var21;
                this.field390[var16 - 1][var17 + 1] = 6;
                this.field276[var16 - 1][var17 + 1] = var39;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field390[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field397[var41] = var16 + 1;
                this.field398[var41] = var17 + 1;
                var41 = (var41 + 1) % var21;
                this.field390[var16 + 1][var17 + 1] = 12;
                this.field276[var16 + 1][var17 + 1] = var39;
            }
        }
        this.field316 = 0;
        if (!var20) {
            if (!arg10) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg9 - var25; var26 <= arg9 + var25; ++var26) {
                for (int var27 = arg5 - var25; var27 <= arg5 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field276[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg9) {
                            var28 = arg9 - var26;
                        } else if (var26 > arg0 + arg9 - 1) {
                            var28 = var26 - (arg0 + arg9 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg5) {
                            var29 = arg5 - var27;
                        } else if (var27 > arg3 + arg5 - 1) {
                            var29 = var27 - (arg3 + arg5 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field276[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field276[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg11 == var16 && arg1 == var17) {
                return false;
            }
            this.field316 = 1;
        }
        byte var31 = 0;
        this.field397[var31] = var16;
        if (arg8 < 2 || arg8 > 2) {
            for (int var32 = 1; var32 > 0; ++var32) {
            }
        }
        int var42 = var31 + 1;
        this.field398[var31] = var17;
        int var33;
        int var34 = var33 = this.field390[var16][var17];
        while (arg11 != var16 || arg1 != var17) {
            if (var33 != var34) {
                var33 = var34;
                this.field397[var42] = var16;
                this.field398[var42++] = var17;
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
            var34 = this.field390[var16][var17];
        }
        if (var42 <= 0) {
            if (arg2 == 1) {
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
            int var36 = this.field397[var42];
            int var37 = this.field398[var42];
            if (arg2 == 0) {
                this.field319.method228(185, true);
                this.field319.method229(var35 + var35 + 3);
            }
            if (arg2 == 1) {
                this.field319.method228(139, true);
                this.field319.method229(var35 + var35 + 3 + 14);
            }
            if (arg2 == 2) {
                this.field319.method228(134, true);
                this.field319.method229(var35 + var35 + 3);
            }
            this.field319.method257(super.field1122[5] == 1 ? 1 : 0, 0);
            this.field319.method264((byte) 1, this.field356 + var36);
            this.field319.method264((byte) 1, this.field357 + var37);
            this.field543 = this.field397[0];
            this.field544 = this.field398[0];
            for (int var38 = 1; var38 < var35; ++var38) {
                --var42;
                this.field319.method255(false, this.field397[var42] - var36);
                this.field319.method256(this.field398[var42] - var37, this.field441);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (arg0 >= 0) {
            this.field627 = -418;
        }
        if (super.field1118 == 1) {
            if (super.field1119 >= 6 && super.field1119 <= 106 && super.field1120 >= 467 && super.field1120 <= 499) {
                this.field213 = (this.field213 + 1) % 4;
                this.field402 = true;
                this.field221 = true;
                this.field319.method228(225, true);
                this.field319.method229(this.field213);
                this.field319.method229(this.field581);
                this.field319.method229(this.field379);
            }
            if (super.field1119 >= 135 && super.field1119 <= 235 && super.field1120 >= 467 && super.field1120 <= 499) {
                this.field581 = (this.field581 + 1) % 3;
                this.field402 = true;
                this.field221 = true;
                this.field319.method228(225, true);
                this.field319.method229(this.field213);
                this.field319.method229(this.field581);
                this.field319.method229(this.field379);
            }
            if (super.field1119 >= 273 && super.field1119 <= 373 && super.field1120 >= 467 && super.field1120 <= 499) {
                this.field379 = (this.field379 + 1) % 3;
                this.field402 = true;
                this.field221 = true;
                this.field319.method228(225, true);
                this.field319.method229(this.field213);
                this.field319.method229(this.field581);
                this.field319.method229(this.field379);
            }
            if (super.field1119 >= 412 && super.field1119 <= 512 && super.field1120 >= 467 && super.field1120 <= 499) {
                if (this.field455 == -1) {
                    this.method118(false);
                    this.field279 = "";
                    this.field592 = false;
                    this.field579 = this.field455 = class63.field1517;
                } else {
                    this.method110(0, 0, "", "Please close the interface you have open before using 'report abuse'");
                }
            }
            ++field597;
            if (field597 > 195) {
                field597 = 0;
                this.field319.method228(156, true);
                this.field319.method230(51285);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public final int method162(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        if (this.field533 != arg0) {
            this.field572 = null;
        }
        return ((arg1 & 16711935) * var5 + (arg3 & 16711935) * arg2 & -16711936) + ((arg1 & 65280) * var5 + (arg3 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
        for (int var2 = 0; var2 < this.field522; ++var2) {
            if (this.field498[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field193[var2] == this.field573 && this.field595[var2] == this.field178) {
                        if (!this.method190(0)) {
                            var3 = true;
                        }
                    } else {
                        class18 var4 = class39.method404(this.field193[var2], true, this.field595[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field794 / 22) > (long) (this.field257 / 22) + this.field373) {
                            this.field257 = var4.field794;
                            this.field373 = System.currentTimeMillis();
                            if (this.method185(var4.field793, var4.field794, -206)) {
                                this.field573 = this.field193[var2];
                                this.field178 = this.field595[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field319.method228(3, true);
                        this.field319.method230(this.field193[var2] & 32767);
                    } else {
                        this.field319.method228(3, true);
                        this.field319.method230(-1);
                    }
                }
                if (var3 && this.field498[var2] != -5) {
                    this.field498[var2] = -5;
                } else {
                    --this.field522;
                    for (int var6 = var2; var6 < this.field522; ++var6) {
                        this.field193[var6] = this.field193[var6 + 1];
                        this.field595[var6] = this.field595[var6 + 1];
                        this.field498[var6] = this.field498[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field498[var2]--;
            }
        }
        this.field521 &= arg0;
        if (this.field425 > 0) {
            this.field425 -= 20;
            if (this.field425 < 0) {
                this.field425 = 0;
            }
            if (this.field425 == 0 && this.field461 && !field211) {
                this.field383 = this.field338;
                this.field384 = true;
                this.field345.method577(2, this.field383);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method164(int arg0) {
        short var2 = 256;
        if (this.field202 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field202 > 768) {
                    this.field290[var3] = this.method162(this.field560, this.field291[var3], 1024 - this.field202, this.field292[var3]);
                } else if (this.field202 > 256) {
                    this.field290[var3] = this.field292[var3];
                } else {
                    this.field290[var3] = this.method162(this.field560, this.field292[var3], 256 - this.field202, this.field291[var3]);
                }
            }
        } else if (this.field203 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field203 > 768) {
                    this.field290[var4] = this.method162(this.field560, this.field291[var4], 1024 - this.field203, this.field293[var4]);
                } else if (this.field203 > 256) {
                    this.field290[var4] = this.field293[var4];
                } else {
                    this.field290[var4] = this.method162(this.field560, this.field293[var4], 256 - this.field203, this.field291[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field290[var5] = this.field291[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field330.field1716[var6] = this.field575.field759[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field611[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field474[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field290[var26];
                    int var30 = this.field330.field1716[var8];
                    this.field330.field1716[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field330.method585(super.field1104, 0, 904, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field331.field1716[var10] = this.field576.field759[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field611[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field474[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field290[var18];
                    int var22 = this.field331.field1716[var16];
                    this.field331.field1716[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        if (arg0 != 32552) {
            this.field445 = -1;
        }
        this.field331.method585(super.field1104, 0, 904, 637);
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method165(int arg0) {
        for (int var2 = -1; var2 < this.field252; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field250;
            } else {
                var3 = this.field253[var2];
            }
            class7 var4 = this.field251[var3];
            if (var4 != null) {
                this.method60(1, var4, 820);
            }
        }
        while (arg0 >= 0) {
            this.field572 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method166(int arg0) {
        try {
            this.field601 = -1;
            this.field185.method204();
            this.field558.method204();
            class3.method10(this.field571);
            this.method137(345);
            this.field285.method279((byte) -44);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field620[var2].method593();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field191[var3][var4][var5] = 0;
                    }
                }
            }
            class46 var6 = new class46(this.field191, 104, 136, 104, this.field403);
            int var7 = this.field336.length;
            this.field319.method228(110, true);
            if (!this.field547) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field385[var8] >> 8) * 64 - this.field356;
                    int var10 = (this.field385[var8] & 255) * 64 - this.field357;
                    byte[] var11 = this.field336[var8];
                    if (var11 != null) {
                        var6.method466(this.field620, var9, var10, (this.field529 - 6) * 8, (this.field528 - 6) * 8, var11, (byte) 9);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field385[var12] >> 8) * 64 - this.field356;
                    int var14 = (this.field385[var12] & 255) * 64 - this.field357;
                    byte[] var15 = this.field336[var12];
                    if (var15 == null && this.field529 < 800) {
                        var6.method450(var13, -10774, var14, 64, 64);
                    }
                }
                this.field319.method228(110, true);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field184[var16];
                    if (var17 != null) {
                        int var18 = (this.field385[var16] >> 8) * 64 - this.field356;
                        int var19 = (this.field385[var16] & 255) * 64 - this.field357;
                        var6.method448(false, var19, this.field285, var17, this.field620, var18);
                    }
                }
            }
            if (this.field547) {
                int var20 = 0;
                label261: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field286[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method450(var31 * 8, -10774, var32 * 8, 8, 8);
                                }
                            }
                        }
                        this.field319.method228(110, true);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label261;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field286[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field385.length; ++var43) {
                                            if (this.field385[var43] == var42 && this.field184[var43] != null) {
                                                var6.method464(var38, var36 * 8, this.field184[var43], var34, this.field285, (var40 & 7) * 8, -644, var39, this.field620, var35 * 8, (var41 & 7) * 8);
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
                            int var24 = this.field286[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field385.length; ++var30) {
                                    if (this.field385[var30] == var29 && this.field336[var30] != null) {
                                        var6.method467(this.field620, var22 * 8, var26, (var28 & 7) * 8, (var27 & 7) * 8, (byte) 5, var25, var20, this.field336[var30], var21 * 8);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method455(var22 * 8, var20, 0, var21 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field319.method228(110, true);
            var6.method469(this.field285, (byte) -126, this.field620);
            if (this.field555 != null) {
                this.field555.method584(-186);
                class3.field42 = this.field350;
            }
            this.field319.method228(110, true);
            int var44 = class46.field1304;
            if (var44 > this.field274) {
                var44 = this.field274;
            }
            if (var44 < this.field274 - 1) {
                int var45 = this.field274 - 1;
            }
            if (field211) {
                this.field285.method280(0, class46.field1304);
            } else {
                this.field285.method280(0, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method69(var46, var47);
                }
            }
            this.method171(true);
        } catch (Exception var60) {
        }
        class64.field1605.method533();
        if (super.field1107 != null) {
            this.field319.method228(136, true);
            this.field319.method233(1057001181);
        }
        if (field211 && signlink.cache_dat != null) {
            int var49 = this.field345.method560(0, (byte) 7);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field345.method570(0, var50);
                if ((var51 & 121) == 0) {
                    class41.method412(true, var50);
                }
            }
        }
        System.gc();
        class3.method11(0, 20);
        this.field345.method559(969);
        while (arg0 >= 0) {
            this.field602 = -435;
        }
        int var52 = (this.field528 - 6) / 8 - 1;
        int var53 = (this.field528 + 6) / 8 + 1;
        int var54 = (this.field529 - 6) / 8 - 1;
        int var55 = (this.field529 + 6) / 8 + 1;
        if (this.field235) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field345.method574(field355, var57, 0, var56);
                    if (var58 != -1) {
                        this.field345.method566(var58, 0, 3);
                    }
                    int var59 = this.field345.method574(field355, var57, 1, var56);
                    if (var59 != -1) {
                        this.field345.method566(var59, 0, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method167(boolean arg0, long arg1) {
        if (arg0) {
            this.field319.method229(147);
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field365; ++var4) {
                if (this.field165[var4] == arg1) {
                    --this.field365;
                    this.field352 = true;
                    for (int var5 = var4; var5 < this.field365; ++var5) {
                        this.field520[var5] = this.field520[var5 + 1];
                        this.field158[var5] = this.field158[var5 + 1];
                        this.field165[var5] = this.field165[var5 + 1];
                    }
                    this.field319.method228(67, true);
                    this.field319.method235(arg1, 5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)Z")
    public final boolean method168(int arg0) {
        if (arg0 <= 0) {
            this.field445 = this.field487.method239();
        }
        if (this.field525 == null) {
            return false;
        } else {
            try {
                int var2 = this.field525.method518();
                if (var2 == 0) {
                    return false;
                }
                if (this.field445 == -1) {
                    this.field525.method519(this.field487.field793, 0, 1);
                    this.field445 = this.field487.field793[0] & 255;
                    if (this.field176 != null) {
                        this.field445 = this.field445 - this.field176.method524() & 255;
                    }
                    this.field444 = class4.field55[this.field445];
                    --var2;
                }
                if (this.field444 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field525.method519(this.field487.field793, 0, 1);
                    this.field444 = this.field487.field793[0] & 255;
                    --var2;
                }
                if (this.field444 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field525.method519(this.field487.field793, 0, 2);
                    this.field487.field794 = 0;
                    this.field444 = this.field487.method241();
                    var2 -= 2;
                }
                if (var2 < this.field444) {
                    return false;
                }
                this.field487.field794 = 0;
                this.field525.method519(this.field487.field793, 0, this.field444);
                this.field446 = 0;
                this.field207 = this.field206;
                this.field206 = this.field205;
                this.field205 = this.field445;
                if (this.field445 == 30) {
                    this.field317 = this.field487.method239();
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 247) {
                    int var3 = this.field487.method241();
                    int var4 = this.field487.method268((byte) 6);
                    int var5 = this.field487.method241();
                    class63.method544(var3).field1549 = (var5 << 16) + var4;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 205) {
                    this.field213 = this.field487.method239();
                    this.field581 = this.field487.method239();
                    this.field379 = this.field487.method239();
                    this.field402 = true;
                    this.field221 = true;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 169) {
                    this.field248 = this.field487.method258(997);
                    this.field247 = this.field487.method258(997);
                    for (int var6 = this.field247; var6 < this.field247 + 8; ++var6) {
                        for (int var7 = this.field248; var7 < this.field248 + 8; ++var7) {
                            if (this.field572[this.field274][var6][var7] != null) {
                                this.field572[this.field274][var6][var7] = null;
                                this.method69(var6, var7);
                            }
                        }
                    }
                    for (class10 var8 = (class10) this.field532.method200(); var8 != null; var8 = (class10) this.field532.method202(569)) {
                        if (var8.field640 >= this.field247 && var8.field640 < this.field247 + 8 && var8.field641 >= this.field248 && var8.field641 < this.field248 + 8 && this.field274 == var8.field638) {
                            var8.field642 = 0;
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 42) {
                    int var9 = this.field487.method267((byte) -97);
                    this.method68(-41851, var9);
                    if (this.field369 != -1) {
                        this.method181(false, this.field369);
                        this.field369 = -1;
                        this.field352 = true;
                        this.field216 = true;
                    }
                    if (this.field606 != -1) {
                        this.method181(false, this.field606);
                        this.field606 = -1;
                        this.field146 = true;
                    }
                    if (this.field204 != -1) {
                        this.method181(false, this.field204);
                        this.field204 = -1;
                    }
                    if (this.field455 != -1) {
                        this.method181(false, this.field455);
                        this.field455 = -1;
                    }
                    if (this.field263 != var9) {
                        this.method181(false, this.field263);
                        this.field263 = var9;
                    }
                    this.field588 = false;
                    this.field221 = true;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 174) {
                    String var10 = this.field487.method246();
                    if (var10.endsWith(":tradereq:")) {
                        String var11 = var10.substring(0, var10.indexOf(":"));
                        long var12 = class32.method380(var11);
                        boolean var14 = false;
                        for (int var15 = 0; var15 < this.field233; ++var15) {
                            if (this.field392[var15] == var12) {
                                var14 = true;
                                break;
                            }
                        }
                        if (!var14 && this.field422 == 0) {
                            this.method110(0, 4, var11, "wishes to trade with you.");
                        }
                    } else if (var10.endsWith(":duelreq:")) {
                        String var16 = var10.substring(0, var10.indexOf(":"));
                        long var17 = class32.method380(var16);
                        boolean var19 = false;
                        for (int var20 = 0; var20 < this.field233; ++var20) {
                            if (this.field392[var20] == var17) {
                                var19 = true;
                                break;
                            }
                        }
                        if (!var19 && this.field422 == 0) {
                            this.method110(0, 8, var16, "wishes to duel with you.");
                        }
                    } else if (!var10.endsWith(":chalreq:")) {
                        this.method110(0, 0, "", var10);
                    } else {
                        String var21 = var10.substring(0, var10.indexOf(":"));
                        long var22 = class32.method380(var21);
                        boolean var24 = false;
                        for (int var25 = 0; var25 < this.field233; ++var25) {
                            if (this.field392[var25] == var22) {
                                var24 = true;
                                break;
                            }
                        }
                        if (!var24 && this.field422 == 0) {
                            String var26 = var10.substring(var10.indexOf(":") + 1, var10.length() - 9);
                            this.method110(0, 8, var21, var26);
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 9) {
                    int var27 = this.field487.method241();
                    class63.method544(var27).field1553 = 3;
                    if (field238.field78 == null) {
                        class63.method544(var27).field1554 = (field238.field79[11] << 5) + (field238.field79[8] << 10) + (field238.field79[0] << 15) + (field238.field102[0] << 25) + (field238.field102[4] << 20) + field238.field79[1];
                    } else {
                        class63.method544(var27).field1554 = (int) (field238.field78.field1350 + 305419896L);
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 113) {
                    this.field233 = this.field444 / 8;
                    for (int var28 = 0; var28 < this.field233; ++var28) {
                        this.field392[var28] = this.field487.method245(this.field583);
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 145) {
                    int var29 = this.field487.method269(true);
                    if (var29 == 65535) {
                        var29 = -1;
                    }
                    if (this.field338 != var29 && this.field461 && !field211 && this.field425 == 0) {
                        this.field383 = var29;
                        this.field384 = true;
                        this.field345.method577(2, this.field383);
                    }
                    this.field338 = var29;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 253) {
                    int var30 = this.field487.method241();
                    int var31 = this.field487.method243();
                    if (this.field461 && !field211) {
                        this.field383 = var30;
                        this.field384 = false;
                        this.field345.method577(2, this.field383);
                        this.field425 = var31;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 147) {
                    if (this.field389 == 12) {
                        this.field352 = true;
                    }
                    this.field163 = this.field487.method242();
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 179) {
                    int var32 = this.field487.method269(true);
                    class63 var33 = class63.method544(var32);
                    for (int var34 = 0; var34 < var33.field1572.length; ++var34) {
                        var33.field1572[var34] = -1;
                        var33.field1572[var34] = 0;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 52) {
                    this.field352 = true;
                    int var35 = this.field487.method241();
                    class63 var36 = class63.method544(var35);
                    int var37 = this.field487.method241();
                    for (int var38 = 0; var38 < var37; ++var38) {
                        int var39 = this.field487.method239();
                        if (var39 == 255) {
                            var39 = this.field487.method244();
                        }
                        var36.field1572[var38] = this.field487.method269(true);
                        var36.field1567[var38] = var39;
                    }
                    for (int var40 = var37; var40 < var36.field1572.length; ++var40) {
                        var36.field1572[var40] = 0;
                        var36.field1567[var40] = 0;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 154) {
                    for (int var41 = 0; var41 < this.field251.length; ++var41) {
                        if (this.field251[var41] != null) {
                            this.field251[var41].field685 = -1;
                        }
                    }
                    for (int var42 = 0; var42 < this.field281.length; ++var42) {
                        if (this.field281[var42] != null) {
                            this.field281[var42].field685 = -1;
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 35) {
                    this.field437 = false;
                    this.field524 = 2;
                    this.field212 = "";
                    this.field221 = true;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 73) {
                    this.field511 = false;
                    for (int var43 = 0; var43 < 5; ++var43) {
                        this.field557[var43] = false;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 132) {
                    int var44 = this.field487.method241();
                    int var45 = this.field487.method267((byte) -97);
                    class63 var46 = class63.method544(var44);
                    if (var46 != null && var46.field1573 == 0) {
                        if (var45 < 0) {
                            var45 = 0;
                        }
                        if (var45 > var46.field1502 - var46.field1505) {
                            var45 = var46.field1502 - var46.field1505;
                        }
                        var46.field1533 = var45;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 160) {
                    int var47 = this.field487.method272(false);
                    int var48 = this.field487.method241();
                    int var49 = this.field487.method270(false);
                    class63 var50 = class63.method544(var48);
                    var50.field1544 = var49;
                    var50.field1531 = var47;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 119) {
                    int var51 = this.field487.method242();
                    if (var51 >= 0) {
                        this.method68(-41851, var51);
                    }
                    if (this.field449 != var51) {
                        this.method181(false, this.field449);
                        this.field449 = var51;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 39) {
                    this.field236 = this.field487.method258(997);
                    if (this.field389 == this.field236) {
                        if (this.field236 == 3) {
                            this.field389 = 1;
                        } else {
                            this.field389 = 3;
                        }
                        this.field352 = true;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 108) {
                    int var52 = this.field487.method260(-377);
                    int var53 = this.field487.method258(997);
                    String var54 = this.field487.method246();
                    if (var52 >= 1 && var52 <= 5) {
                        if (var54.equalsIgnoreCase("null")) {
                            var54 = null;
                        }
                        this.field222[var52 - 1] = var54;
                        this.field223[var52 - 1] = var53 == 0;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 59) {
                    int var55 = this.field487.method267((byte) -97);
                    int var56 = this.field487.method239();
                    if (var55 == 65535) {
                        var55 = -1;
                    }
                    if (this.field619[var56] != var55) {
                        this.method181(false, this.field619[var56]);
                        this.field619[var56] = var55;
                    }
                    this.field352 = true;
                    this.field216 = true;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 173) {
                    this.field247 = this.field487.method259((byte) 0);
                    this.field248 = this.field487.method259((byte) 0);
                    while (this.field487.field794 < this.field444) {
                        int var57 = this.field487.method239();
                        this.method143(var57, this.field487, 0);
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 98) {
                    byte var58 = this.field487.method261(340);
                    int var59 = this.field487.method241();
                    this.field480[var59] = var58;
                    if (this.field344[var59] != var58) {
                        this.field344[var59] = var58;
                        this.method93(var59, true);
                        this.field352 = true;
                        if (this.field438 != -1) {
                            this.field221 = true;
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 198) {
                    this.field366 = this.field487.method239();
                    this.field352 = true;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 53) {
                    this.field543 = 0;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 7) {
                    int var60 = this.field487.method269(true);
                    int var61 = this.field487.method268((byte) 6);
                    int var62 = this.field487.method269(true);
                    if (var61 == 65535) {
                        class63.method544(var60).field1553 = 0;
                        this.field445 = -1;
                        return true;
                    }
                    class31 var63 = class31.method376(var61);
                    class63.method544(var60).field1553 = 4;
                    class63.method544(var60).field1554 = var61;
                    class63.method544(var60).field1556 = var63.field1045;
                    class63.method544(var60).field1557 = var63.field1027;
                    class63.method544(var60).field1555 = var63.field1010 * 100 / var62;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 115) {
                    this.field239 = this.field487.method239();
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 112) {
                    this.field352 = true;
                    int var64 = this.field487.method259((byte) 0);
                    int var65 = this.field487.method244();
                    int var66 = this.field487.method260(-377);
                    this.field623[var64] = var65;
                    this.field479[var64] = var66;
                    this.field396[var64] = 1;
                    for (int var67 = 0; var67 < 98; ++var67) {
                        if (var65 >= field258[var67]) {
                            this.field396[var64] = var67 + 2;
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 150) {
                    int var68 = this.field487.method241();
                    int var69 = this.field487.method267((byte) -97);
                    class63.method544(var69).field1553 = 2;
                    class63.method544(var69).field1554 = var68;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 117) {
                    this.field496 = this.field487.method268((byte) 6) * 30;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 106) {
                    long var70 = this.field487.method245(this.field583);
                    int var72 = this.field487.method244();
                    int var73 = this.field487.method239();
                    boolean var74 = false;
                    for (int var75 = 0; var75 < 100; ++var75) {
                        if (this.field347[var75] == var72) {
                            var74 = true;
                            break;
                        }
                    }
                    if (var73 <= 1) {
                        for (int var76 = 0; var76 < this.field233; ++var76) {
                            if (this.field392[var76] == var70) {
                                var74 = true;
                                break;
                            }
                        }
                    }
                    if (!var74 && this.field422 == 0) {
                        try {
                            this.field347[this.field177] = var72;
                            this.field177 = (this.field177 + 1) % 100;
                            String var77 = class26.method353(field245, this.field487, this.field444 - 13);
                            if (var73 != 3) {
                                var77 = class47.method480(false, var77);
                            }
                            if (var73 != 2 && var73 != 3) {
                                if (var73 == 1) {
                                    this.method110(0, 7, "@cr1@" + class32.method384(this.field368, class32.method381(var70, (byte) 82)), var77);
                                } else {
                                    this.method110(0, 3, class32.method384(this.field368, class32.method381(var70, (byte) 82)), var77);
                                }
                            } else {
                                this.method110(0, 7, "@cr2@" + class32.method384(this.field368, class32.method381(var70, (byte) 82)), var77);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 156) {
                    this.field511 = true;
                    this.field489 = this.field487.method239();
                    this.field490 = this.field487.method239();
                    this.field491 = this.field487.method241();
                    this.field492 = this.field487.method239();
                    this.field493 = this.field487.method239();
                    if (this.field493 >= 100) {
                        int var79 = this.field489 * 128 + 64;
                        int var80 = this.field490 * 128 + 64;
                        int var81 = this.method184((byte) -28, this.field274, var79, var80) - this.field491;
                        int var82 = var79 - this.field561;
                        int var83 = var81 - this.field562;
                        int var84 = var80 - this.field563;
                        int var85 = (int) Math.sqrt((double) (var82 * var82 + var84 * var84));
                        this.field564 = (int) (Math.atan2((double) var83, (double) var85) * 325.949D) & 2047;
                        this.field565 = (int) (Math.atan2((double) var82, (double) var84) * -325.949D) & 2047;
                        if (this.field564 < 128) {
                            this.field564 = 128;
                        }
                        if (this.field564 > 383) {
                            this.field564 = 383;
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 206) {
                    int var86 = this.field487.method241();
                    int var87 = this.field487.method239();
                    int var88 = this.field487.method241();
                    if (var88 == 65535) {
                        if (this.field522 < 50) {
                            this.field193[this.field522] = (short) var86;
                            this.field595[this.field522] = var87;
                            this.field498[this.field522] = 0;
                            ++this.field522;
                        }
                    } else if (this.field275 && !field211 && this.field522 < 50) {
                        this.field193[this.field522] = var86;
                        this.field595[this.field522] = var87;
                        this.field498[this.field522] = class39.field1153[var86] + var88;
                        ++this.field522;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 155) {
                    int var89 = this.field487.method241();
                    int var90 = this.field487.method268((byte) 6);
                    int var91 = this.field487.method269(true);
                    int var92 = this.field487.method269(true);
                    class63.method544(var91).field1556 = var90;
                    class63.method544(var91).field1557 = var89;
                    class63.method544(var91).field1555 = var92;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 49) {
                    int var93 = this.field487.method267((byte) -97);
                    this.method68(-41851, var93);
                    if (this.field369 != -1) {
                        this.method181(false, this.field369);
                        this.field369 = -1;
                        this.field352 = true;
                        this.field216 = true;
                    }
                    if (this.field263 != -1) {
                        this.method181(false, this.field263);
                        this.field263 = -1;
                        this.field221 = true;
                    }
                    if (this.field606 != -1) {
                        this.method181(false, this.field606);
                        this.field606 = -1;
                        this.field146 = true;
                    }
                    if (this.field204 != -1) {
                        this.method181(false, this.field204);
                        this.field204 = -1;
                    }
                    if (this.field455 != var93) {
                        this.method181(false, this.field455);
                        this.field455 = var93;
                    }
                    if (this.field524 != 0) {
                        this.field524 = 0;
                        this.field221 = true;
                    }
                    this.field588 = false;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 12) {
                    this.field364 = this.field487.method239();
                    this.field530 = this.field487.method267((byte) -97);
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 230) {
                    for (int var94 = 0; var94 < this.field344.length; ++var94) {
                        if (this.field480[var94] != this.field344[var94]) {
                            this.field344[var94] = this.field480[var94];
                            this.method93(var94, true);
                            this.field352 = true;
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 238) {
                    this.method86(this.field578);
                    this.field445 = -1;
                    return false;
                }
                if (this.field445 == 178) {
                    int var95 = this.field487.method271(4);
                    int var96 = this.field487.method241();
                    class63 var97 = class63.method544(var96);
                    if (var97.field1542 != var95 || var95 == -1) {
                        var97.field1542 = var95;
                        var97.field1550 = 0;
                        var97.field1528 = 0;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 219) {
                    this.field389 = this.field487.method260(-377);
                    this.field352 = true;
                    this.field216 = true;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 167) {
                    long var98 = this.field487.method245(this.field583);
                    int var100 = this.field487.method239();
                    String var101 = class32.method384(this.field368, class32.method381(var98, (byte) 82));
                    for (int var102 = 0; var102 < this.field365; ++var102) {
                        if (this.field165[var102] == var98) {
                            if (this.field158[var102] != var100) {
                                this.field158[var102] = var100;
                                this.field352 = true;
                                if (var100 > 0) {
                                    this.method110(0, 5, "", var101 + " has logged in.");
                                }
                                if (var100 == 0) {
                                    this.method110(0, 5, "", var101 + " has logged out.");
                                }
                            }
                            var101 = null;
                            break;
                        }
                    }
                    if (var101 != null && this.field365 < 200) {
                        this.field165[this.field365] = var98;
                        this.field520[this.field365] = var101;
                        this.field158[this.field365] = var100;
                        ++this.field365;
                        this.field352 = true;
                    }
                    boolean var103 = false;
                    while (!var103) {
                        var103 = true;
                        for (int var104 = 0; var104 < this.field365 - 1; ++var104) {
                            if (this.field158[var104] != field208 && this.field158[var104 + 1] == field208 || this.field158[var104] == 0 && this.field158[var104 + 1] != 0) {
                                int var105 = this.field158[var104];
                                this.field158[var104] = this.field158[var104 + 1];
                                this.field158[var104 + 1] = var105;
                                String var106 = this.field520[var104];
                                this.field520[var104] = this.field520[var104 + 1];
                                this.field520[var104 + 1] = var106;
                                long var107 = this.field165[var104];
                                this.field165[var104] = this.field165[var104 + 1];
                                this.field165[var104 + 1] = var107;
                                this.field352 = true;
                                var103 = false;
                            }
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 130) {
                    this.field437 = false;
                    this.field524 = 1;
                    this.field212 = "";
                    this.field221 = true;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 55) {
                    int var109 = this.field487.method267((byte) -97);
                    int var110 = this.field487.method269(true);
                    class63.method544(var109).field1553 = 1;
                    class63.method544(var109).field1554 = var110;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 190) {
                    int var111 = this.field487.method269(true);
                    int var112 = this.field487.method268((byte) 6);
                    int var113 = var111 >> 10 & 31;
                    int var114 = var111 >> 5 & 31;
                    int var115 = var111 & 31;
                    class63.method544(var112).field1520 = (var115 << 3) + (var113 << 19) + (var114 << 11);
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 84) {
                    int var116 = this.field487.method241();
                    int var117 = this.field487.method275(360);
                    this.field480[var116] = var117;
                    if (this.field344[var116] != var117) {
                        this.field344[var116] = var117;
                        this.method93(var116, true);
                        this.field352 = true;
                        if (this.field438 != -1) {
                            this.field221 = true;
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 68 || this.field445 == 109) {
                    int var118 = this.field528;
                    int var119 = this.field529;
                    if (this.field445 == 68) {
                        var119 = this.field487.method269(true);
                        var118 = this.field487.method267((byte) -97);
                        this.field547 = false;
                    }
                    if (this.field445 == 109) {
                        this.field487.method249((byte) 9);
                        int var120 = 0;
                        while (true) {
                            if (var120 >= 4) {
                                this.field487.method251(this.field590);
                                var119 = this.field487.method269(true);
                                var118 = this.field487.method267((byte) -97);
                                this.field547 = true;
                                break;
                            }
                            for (int var121 = 0; var121 < 13; ++var121) {
                                for (int var122 = 0; var122 < 13; ++var122) {
                                    int var123 = this.field487.method250((byte) 79, 1);
                                    if (var123 == 1) {
                                        this.field286[var120][var121][var122] = this.field487.method250((byte) 79, 26);
                                    } else {
                                        this.field286[var120][var121][var122] = -1;
                                    }
                                }
                            }
                            ++var120;
                        }
                    }
                    if (this.field528 == var118 && this.field529 == var119 && this.field298 == 2) {
                        this.field445 = -1;
                        return true;
                    }
                    this.field528 = var118;
                    this.field529 = var119;
                    this.field356 = (this.field528 - 6) * 8;
                    this.field357 = (this.field529 - 6) * 8;
                    this.field235 = false;
                    if ((this.field528 / 8 == 48 || this.field528 / 8 == 49) && this.field529 / 8 == 48) {
                        this.field235 = true;
                    }
                    if (this.field528 / 8 == 48 && this.field529 / 8 == 148) {
                        this.field235 = true;
                    }
                    this.field298 = 1;
                    this.field481 = System.currentTimeMillis();
                    this.method87("Loading - please wait.", true, (String) null);
                    if (this.field445 == 68) {
                        int var124 = 0;
                        int var125 = (this.field528 - 6) / 8;
                        label1188: while (true) {
                            if (var125 > (this.field528 + 6) / 8) {
                                this.field336 = new byte[var124][];
                                this.field184 = new byte[var124][];
                                this.field385 = new int[var124];
                                this.field386 = new int[var124];
                                this.field387 = new int[var124];
                                int var127 = 0;
                                int var128 = (this.field528 - 6) / 8;
                                while (true) {
                                    if (var128 > (this.field528 + 6) / 8) {
                                        break label1188;
                                    }
                                    for (int var129 = (this.field529 - 6) / 8; var129 <= (this.field529 + 6) / 8; ++var129) {
                                        this.field385[var127] = (var128 << 8) + var129;
                                        if (this.field235 && (var129 == 49 || var129 == 149 || var129 == 147 || var128 == 50 || var128 == 49 && var129 == 47)) {
                                            this.field386[var127] = -1;
                                            this.field387[var127] = -1;
                                            ++var127;
                                        } else {
                                            int var130 = this.field386[var127] = this.field345.method574(field355, var129, 0, var128);
                                            if (var130 != -1) {
                                                this.field345.method577(3, var130);
                                            }
                                            int var131 = this.field387[var127] = this.field345.method574(field355, var129, 1, var128);
                                            if (var131 != -1) {
                                                this.field345.method577(3, var131);
                                            }
                                            ++var127;
                                        }
                                    }
                                    ++var128;
                                }
                            }
                            for (int var126 = (this.field529 - 6) / 8; var126 <= (this.field529 + 6) / 8; ++var126) {
                                ++var124;
                            }
                            ++var125;
                        }
                    }
                    if (this.field445 == 109) {
                        int var132 = 0;
                        int[] var133 = new int[676];
                        int var134 = 0;
                        label1149: while (true) {
                            if (var134 >= 4) {
                                this.field336 = new byte[var132][];
                                this.field184 = new byte[var132][];
                                this.field385 = new int[var132];
                                this.field386 = new int[var132];
                                this.field387 = new int[var132];
                                int var142 = 0;
                                while (true) {
                                    if (var142 >= var132) {
                                        break label1149;
                                    }
                                    int var143 = this.field385[var142] = var133[var142];
                                    int var144 = var143 >> 8 & 255;
                                    int var145 = var143 & 255;
                                    int var146 = this.field386[var142] = this.field345.method574(field355, var145, 0, var144);
                                    if (var146 != -1) {
                                        this.field345.method577(3, var146);
                                    }
                                    int var147 = this.field387[var142] = this.field345.method574(field355, var145, 1, var144);
                                    if (var147 != -1) {
                                        this.field345.method577(3, var147);
                                    }
                                    ++var142;
                                }
                            }
                            for (int var135 = 0; var135 < 13; ++var135) {
                                for (int var136 = 0; var136 < 13; ++var136) {
                                    int var137 = this.field286[var134][var135][var136];
                                    if (var137 != -1) {
                                        int var138 = var137 >> 14 & 1023;
                                        int var139 = var137 >> 3 & 2047;
                                        int var140 = (var138 / 8 << 8) + var139 / 8;
                                        for (int var141 = 0; var141 < var132; ++var141) {
                                            if (var133[var141] == var140) {
                                                var140 = -1;
                                                break;
                                            }
                                        }
                                        if (var140 != -1) {
                                            var133[var132++] = var140;
                                        }
                                    }
                                }
                            }
                            ++var134;
                        }
                    }
                    int var148 = this.field356 - this.field358;
                    int var149 = this.field357 - this.field359;
                    this.field358 = this.field356;
                    this.field359 = this.field357;
                    for (int var150 = 0; var150 < 16384; ++var150) {
                        class30 var151 = this.field281[var150];
                        if (var151 != null) {
                            for (int var152 = 0; var152 < 10; ++var152) {
                                var151.field663[var152] -= var148;
                                var151.field664[var152] -= var149;
                            }
                            var151.field659 -= var148 * 128;
                            var151.field660 -= var149 * 128;
                        }
                    }
                    for (int var153 = 0; var153 < this.field249; ++var153) {
                        class7 var154 = this.field251[var153];
                        if (var154 != null) {
                            for (int var155 = 0; var155 < 10; ++var155) {
                                var154.field663[var155] -= var148;
                                var154.field664[var155] -= var149;
                            }
                            var154.field659 -= var148 * 128;
                            var154.field660 -= var149 * 128;
                        }
                    }
                    this.field160 = true;
                    byte var156 = 0;
                    byte var157 = 104;
                    byte var158 = 1;
                    if (var148 < 0) {
                        var156 = 103;
                        var157 = -1;
                        var158 = -1;
                    }
                    byte var159 = 0;
                    byte var160 = 104;
                    byte var161 = 1;
                    if (var149 < 0) {
                        var159 = 103;
                        var160 = -1;
                        var161 = -1;
                    }
                    for (int var162 = var156; var157 != var162; var162 += var158) {
                        for (int var163 = var159; var160 != var163; var163 += var161) {
                            int var164 = var148 + var162;
                            int var165 = var149 + var163;
                            for (int var166 = 0; var166 < 4; ++var166) {
                                if (var164 >= 0 && var165 >= 0 && var164 < 104 && var165 < 104) {
                                    this.field572[var166][var162][var163] = this.field572[var166][var164][var165];
                                } else {
                                    this.field572[var166][var162][var163] = null;
                                }
                            }
                        }
                    }
                    for (class10 var167 = (class10) this.field532.method200(); var167 != null; var167 = (class10) this.field532.method202(569)) {
                        var167.field640 -= var148;
                        var167.field641 -= var149;
                        if (var167.field640 < 0 || var167.field641 < 0 || var167.field640 >= 104 || var167.field641 >= 104) {
                            var167.method205();
                        }
                    }
                    if (this.field543 != 0) {
                        this.field543 -= var148;
                        this.field544 -= var149;
                    }
                    this.field511 = false;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 192) {
                    this.method88(this.field487, this.field444, (byte) 9);
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 149) {
                    this.field487.method239();
                    this.field284 = this.field487.method241();
                    this.field289 = this.field487.method241();
                    this.field144 = this.field487.method269(true);
                    this.field515 = this.field487.method268((byte) 6);
                    this.field549 = this.field487.method241();
                    this.field517 = this.field487.method275(360);
                    this.field487.method267((byte) -97);
                    this.field468 = this.field487.method269(true);
                    this.field580 = this.field487.method267((byte) -97);
                    this.field604 = this.field487.method241();
                    signlink.dnslookup(class32.method383((byte) -60, this.field517));
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 123) {
                    this.field352 = true;
                    int var168 = this.field487.method241();
                    class63 var169 = class63.method544(var168);
                    while (this.field487.field794 < this.field444) {
                        int var170 = this.field487.method253();
                        int var171 = this.field487.method241();
                        int var172 = this.field487.method239();
                        if (var172 == 255) {
                            var172 = this.field487.method244();
                        }
                        if (var170 >= 0 && var170 < var169.field1572.length) {
                            var169.field1572[var170] = var171;
                            var169.field1567[var170] = var172;
                        }
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 216) {
                    int var173 = this.field487.method241();
                    int var174 = this.field487.method268((byte) 6);
                    if (this.field263 != -1) {
                        this.method181(false, this.field263);
                        this.field263 = -1;
                        this.field221 = true;
                    }
                    if (this.field606 != -1) {
                        this.method181(false, this.field606);
                        this.field606 = -1;
                        this.field146 = true;
                    }
                    if (this.field204 != -1) {
                        this.method181(false, this.field204);
                        this.field204 = -1;
                    }
                    if (this.field455 != var174) {
                        this.method181(false, this.field455);
                        this.field455 = var174;
                    }
                    if (this.field369 != var173) {
                        this.method181(false, this.field369);
                        this.field369 = var173;
                    }
                    if (this.field524 != 0) {
                        this.field524 = 0;
                        this.field221 = true;
                    }
                    this.field352 = true;
                    this.field216 = true;
                    this.field588 = false;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 234) {
                    int var175 = this.field487.method267((byte) -97);
                    int var176 = this.field487.method268((byte) 6);
                    this.method68(-41851, var175);
                    if (var176 != -1) {
                        this.method68(-41851, var176);
                    }
                    if (this.field455 != -1) {
                        this.method181(false, this.field455);
                        this.field455 = -1;
                    }
                    if (this.field369 != -1) {
                        this.method181(false, this.field369);
                        this.field369 = -1;
                    }
                    if (this.field263 != -1) {
                        this.method181(false, this.field263);
                        this.field263 = -1;
                    }
                    if (this.field606 != var175) {
                        this.method181(false, this.field606);
                        this.field606 = var175;
                    }
                    if (this.field204 != var175) {
                        this.method181(false, this.field204);
                        this.field204 = var176;
                    }
                    this.field524 = 0;
                    this.field588 = false;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 57) {
                    this.field391 = this.field487.method239();
                    if (this.field391 == 1) {
                        this.field318 = this.field487.method241();
                    }
                    if (this.field391 >= 2 && this.field391 <= 6) {
                        if (this.field391 == 2) {
                            this.field312 = 64;
                            this.field313 = 64;
                        }
                        if (this.field391 == 3) {
                            this.field312 = 0;
                            this.field313 = 64;
                        }
                        if (this.field391 == 4) {
                            this.field312 = 128;
                            this.field313 = 64;
                        }
                        if (this.field391 == 5) {
                            this.field312 = 64;
                            this.field313 = 0;
                        }
                        if (this.field391 == 6) {
                            this.field312 = 64;
                            this.field313 = 128;
                        }
                        this.field391 = 2;
                        this.field309 = this.field487.method241();
                        this.field310 = this.field487.method241();
                        this.field311 = this.field487.method239();
                    }
                    if (this.field391 == 10) {
                        this.field186 = this.field487.method241();
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 58) {
                    int var177 = this.field487.method241();
                    this.method68(-41851, var177);
                    if (this.field263 != -1) {
                        this.method181(false, this.field263);
                        this.field263 = -1;
                        this.field221 = true;
                    }
                    if (this.field606 != -1) {
                        this.method181(false, this.field606);
                        this.field606 = -1;
                        this.field146 = true;
                    }
                    if (this.field204 != -1) {
                        this.method181(false, this.field204);
                        this.field204 = -1;
                    }
                    if (this.field455 != -1) {
                        this.method181(false, this.field455);
                        this.field455 = -1;
                    }
                    if (this.field369 != var177) {
                        this.method181(false, this.field369);
                        this.field369 = var177;
                    }
                    if (this.field524 != 0) {
                        this.field524 = 0;
                        this.field221 = true;
                    }
                    this.field352 = true;
                    this.field216 = true;
                    this.field588 = false;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 221) {
                    int var178 = this.field487.method239();
                    int var179 = this.field487.method239();
                    int var180 = this.field487.method239();
                    int var181 = this.field487.method239();
                    this.field557[var178] = true;
                    this.field320[var178] = var179;
                    this.field417[var178] = var180;
                    this.field587[var178] = var181;
                    this.field586[var178] = 0;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 67) {
                    if (this.field369 != -1) {
                        this.method181(false, this.field369);
                        this.field369 = -1;
                        this.field352 = true;
                        this.field216 = true;
                    }
                    if (this.field263 != -1) {
                        this.method181(false, this.field263);
                        this.field263 = -1;
                        this.field221 = true;
                    }
                    if (this.field606 != -1) {
                        this.method181(false, this.field606);
                        this.field606 = -1;
                        this.field146 = true;
                    }
                    if (this.field204 != -1) {
                        this.method181(false, this.field204);
                        this.field204 = -1;
                    }
                    if (this.field455 != -1) {
                        this.method181(false, this.field455);
                        this.field455 = -1;
                    }
                    if (this.field524 != 0) {
                        this.field524 = 0;
                        this.field221 = true;
                    }
                    this.field588 = false;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 46) {
                    int var182 = this.field487.method267((byte) -97);
                    String var183 = this.field487.method246();
                    class63.method544(var182).field1562 = var183;
                    int var10001 = this.field619[this.field389];
                    if (class63.method544(var182).field1508 == var10001) {
                        this.field352 = true;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 228) {
                    boolean var184 = this.field487.method239() == 1;
                    int var185 = this.field487.method267((byte) -97);
                    class63.method544(var185).field1509 = var184;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 8 || this.field445 == 22 || this.field445 == 99 || this.field445 == 255 || this.field445 == 197 || this.field445 == 102 || this.field445 == 212 || this.field445 == 222 || this.field445 == 213 || this.field445 == 61 || this.field445 == 225) {
                    this.method143(this.field445, this.field487, 0);
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 163) {
                    this.field511 = true;
                    this.field240 = this.field487.method239();
                    this.field241 = this.field487.method239();
                    this.field242 = this.field487.method241();
                    this.field243 = this.field487.method239();
                    this.field244 = this.field487.method239();
                    if (this.field244 >= 100) {
                        this.field561 = this.field240 * 128 + 64;
                        this.field563 = this.field241 * 128 + 64;
                        this.field562 = this.method184((byte) -28, this.field274, this.field561, this.field563) - this.field242;
                    }
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 66) {
                    this.field247 = this.field487.method239();
                    this.field248 = this.field487.method239();
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 29) {
                    this.method100(this.field444, this.field487, false);
                    this.field160 = false;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 83) {
                    int var186 = this.field487.method242();
                    if (this.field438 != var186) {
                        this.method181(false, this.field438);
                        this.field438 = var186;
                    }
                    this.field221 = true;
                    this.field445 = -1;
                    return true;
                }
                if (this.field445 == 95) {
                    if (this.field389 == 12) {
                        this.field352 = true;
                    }
                    this.field150 = this.field487.method239();
                    this.field445 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field445 + "," + this.field444 + " - " + this.field206 + "," + this.field207);
                this.method86(this.field578);
            } catch (IOException var191) {
                this.method175(0);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field445 + "," + this.field206 + "," + this.field207 + " - " + this.field444 + "," + (field238.field663[0] + this.field356) + "," + (field238.field664[0] + this.field357) + " - ";
                for (int var189 = 0; var189 < this.field444 && var189 < 50; ++var189) {
                    var188 = var188 + this.field487.field793[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method86(this.field578);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILVTUPBFSN;)I")
    public final int method169(boolean arg0, int arg1, class63 arg2) {
        if (!arg0) {
            this.method133();
        }
        if (arg2.field1506 != null && arg1 < arg2.field1506.length) {
            try {
                int[] var4 = arg2.field1506[arg1];
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
                        var9 = this.field479[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field396[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field623[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class63 var11 = class63.method544(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class31.field1041 && (!class31.method376(var12).field1043 || field210)) {
                            for (int var13 = 0; var13 < var11.field1572.length; ++var13) {
                                if (var12 + 1 == var11.field1572[var13]) {
                                    var9 += var11.field1567[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field344[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field258[this.field396[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field344[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field238.field95;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class33.field1056; ++var14) {
                            if (class33.field1058[var14]) {
                                var9 += this.field396[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class63 var15 = class63.method544(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class31.field1041 && (!class31.method376(var16).field1043 || field210)) {
                            for (int var17 = 0; var17 < var15.field1572.length; ++var17) {
                                if (var15.field1572[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field150;
                    }
                    if (var8 == 12) {
                        var9 = this.field163;
                    }
                    if (var8 == 13) {
                        int var18 = this.field344[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class9 var21 = class9.field134[var20];
                        int var22 = var21.field136;
                        int var23 = var21.field137;
                        int var24 = var21.field138;
                        int var25 = field156[var24 - var23];
                        var9 = this.field344[var22] >> var23 & var25;
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
                        var9 = (field238.field659 >> 7) + this.field356;
                    }
                    if (var8 == 19) {
                        var9 = (field238.field660 >> 7) + this.field357;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBILQYNFXHXW;)V")
    public final void method170(int arg0, int arg1, byte arg2, int arg3, class48 arg4) {
        if (arg2 == -70) {
            if (this.field546 < 400) {
                if (arg4.field1363 != null) {
                    arg4 = arg4.method508(863);
                }
                if (arg4 != null) {
                    if (arg4.field1344) {
                        String var6 = arg4.field1355;
                        if (arg4.field1330 != 0) {
                            var6 = var6 + method187(arg4.field1330, field238.field95, (byte) 3) + " (level-" + arg4.field1330 + ")";
                        }
                        if (this.field151 == 1) {
                            this.field227[this.field546] = "Use " + this.field155 + " with @yel@" + var6;
                            this.field189[this.field546] = 384;
                            this.field190[this.field546] = arg0;
                            this.field187[this.field546] = arg3;
                            this.field188[this.field546] = arg1;
                            ++this.field546;
                        } else {
                            if (this.field628 == 1) {
                                if ((this.field630 & 2) == 2) {
                                    this.field227[this.field546] = this.field631 + " @yel@" + var6;
                                    this.field189[this.field546] = 471;
                                    this.field190[this.field546] = arg0;
                                    this.field187[this.field546] = arg3;
                                    this.field188[this.field546] = arg1;
                                    ++this.field546;
                                    return;
                                }
                            } else {
                                if (arg4.field1326 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg4.field1326[var7] != null && !arg4.field1326[var7].equalsIgnoreCase("attack")) {
                                            this.field227[this.field546] = arg4.field1326[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field189[this.field546] = 840;
                                            }
                                            if (var7 == 1) {
                                                this.field189[this.field546] = 2;
                                            }
                                            if (var7 == 2) {
                                                this.field189[this.field546] = 131;
                                            }
                                            if (var7 == 3) {
                                                this.field189[this.field546] = 546;
                                            }
                                            if (var7 == 4) {
                                                this.field189[this.field546] = 588;
                                            }
                                            this.field190[this.field546] = arg0;
                                            this.field187[this.field546] = arg3;
                                            this.field188[this.field546] = arg1;
                                            ++this.field546;
                                        }
                                    }
                                }
                                if (arg4.field1326 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg4.field1326[var8] != null && arg4.field1326[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg4.field1330 > field238.field95) {
                                                var9 = 2000;
                                            }
                                            this.field227[this.field546] = arg4.field1326[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field189[this.field546] = var9 + 840;
                                            }
                                            if (var8 == 1) {
                                                this.field189[this.field546] = var9 + 2;
                                            }
                                            if (var8 == 2) {
                                                this.field189[this.field546] = var9 + 131;
                                            }
                                            if (var8 == 3) {
                                                this.field189[this.field546] = var9 + 546;
                                            }
                                            if (var8 == 4) {
                                                this.field189[this.field546] = var9 + 588;
                                            }
                                            this.field190[this.field546] = arg0;
                                            this.field187[this.field546] = arg3;
                                            this.field188[this.field546] = arg1;
                                            ++this.field546;
                                        }
                                    }
                                }
                                this.field227[this.field546] = "Examine @yel@" + var6;
                                this.field189[this.field546] = 1163;
                                this.field190[this.field546] = arg0;
                                this.field187[this.field546] = arg3;
                                this.field188[this.field546] = arg1;
                                ++this.field546;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    private final void method171(boolean arg0) {
        this.field521 &= arg0;
        for (class10 var2 = (class10) this.field532.method200(); var2 != null; var2 = (class10) this.field532.method202(569)) {
            if (var2.field642 == -1) {
                var2.field646 = 0;
                this.method101(false, var2);
            } else {
                var2.method205();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LEYMNCFMK;II)V")
    private final void method172(class18 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method133();
        }
        for (int var4 = 0; var4 < this.field254; ++var4) {
            int var5 = this.field255[var4];
            class7 var6 = this.field251[var5];
            int var7 = arg0.method239();
            if ((var7 & 32) != 0) {
                var7 += arg0.method239() << 8;
            }
            this.method176(var7, var6, (byte) 9, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBIIIII)V")
    private final void method173(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class10 var11 = null;
        for (class10 var12 = (class10) this.field532.method200(); var12 != null; var12 = (class10) this.field532.method202(569)) {
            if (var12.field638 == arg7 && var12.field640 == arg0 && var12.field641 == arg2 && var12.field639 == arg6) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class10();
            var11.field638 = arg7;
            var11.field639 = arg6;
            var11.field640 = arg0;
            var11.field641 = arg2;
            this.method101(false, var11);
            this.field532.method197(var11);
        }
        var11.field643 = arg9;
        var11.field645 = arg1;
        var11.field644 = arg5;
        if (arg4 == 9) {
            boolean var13 = false;
        } else {
            this.field462 = 161;
        }
        var11.field646 = arg3;
        var11.field642 = arg8;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (this.field488 != arg0) {
            this.method133();
        }
        if (this.field412 == 0) {
            int var2 = super.field1118;
            if (this.field628 == 1 && super.field1119 >= 516 && super.field1120 >= 160 && super.field1119 <= 765 && super.field1120 <= 205) {
                var2 = 0;
            }
            if (this.field589) {
                if (var2 != 1) {
                    int var3 = super.field1112;
                    int var4 = super.field1113;
                    if (this.field502 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field502 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field502 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field503 - 10 || var3 > this.field505 + this.field503 + 10 || var4 < this.field504 - 10 || var4 > this.field506 + this.field504 + 10) {
                        this.field589 = false;
                        if (this.field502 == 1) {
                            this.field352 = true;
                        }
                        if (this.field502 == 2) {
                            this.field221 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field503;
                    int var6 = this.field504;
                    int var7 = this.field505;
                    int var8 = super.field1119;
                    int var9 = super.field1120;
                    if (this.field502 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field502 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field502 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field546; ++var11) {
                        int var12 = (this.field546 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method135(-287, var10);
                    }
                    this.field589 = false;
                    if (this.field502 == 1) {
                        this.field352 = true;
                    }
                    if (this.field502 == 2) {
                        this.field221 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field546 > 0) {
                    int var13 = this.field189[this.field546 - 1];
                    if (var13 == 254 || var13 == 767 || var13 == 858 || var13 == 22 || var13 == 974 || var13 == 599 || var13 == 689 || var13 == 533 || var13 == 484 || var13 == 851 || var13 == 988 || var13 == 1695) {
                        int var14 = this.field187[this.field546 - 1];
                        int var15 = this.field188[this.field546 - 1];
                        class63 var16 = class63.method544(var15);
                        if (var16.field1501 || var16.field1539) {
                            this.field440 = false;
                            this.field353 = 0;
                            this.field410 = var15;
                            this.field411 = var14;
                            this.field412 = 2;
                            this.field413 = super.field1119;
                            this.field414 = super.field1120;
                            if (class63.method544(var15).field1508 == this.field455) {
                                this.field412 = 1;
                            }
                            if (class63.method544(var15).field1508 == this.field263) {
                                this.field412 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field566 == 1 || this.method91(6, this.field546 - 1)) && this.field546 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field546 > 0) {
                    this.method135(-287, this.field546 - 1);
                }
                if (var2 != 2 || this.field546 <= 0) {
                    return;
                }
                this.method106(-44689);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (this.field448 > 0) {
            this.method86(this.field578);
        } else {
            this.method87("Connection lost", true, "Please wait - attempting to reestablish");
            this.field239 = 0;
            this.field543 = 0;
            class50 var2 = this.field525;
            this.field521 = false;
            if (arg0 != 0) {
                this.method133();
            }
            this.field314 = 0;
            this.method178(this.field180, this.field181, true);
            if (!this.field521) {
                this.method86(this.field578);
            }
            try {
                var2.method516();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILBPHJJPRI;BILEYMNCFMK;)V")
    private final void method176(int arg0, class7 arg1, byte arg2, int arg3, class18 arg4) {
        if (arg2 == 9) {
            boolean var6 = false;
        } else {
            this.field445 = arg4.method239();
        }
        if ((arg0 & 1024) != 0) {
            arg1.field653 = arg4.method269(true);
            int var7 = arg4.method274(0);
            arg1.field657 = var7 >> 16;
            arg1.field656 = (var7 & 65535) + field598;
            arg1.field654 = 0;
            arg1.field655 = 0;
            if (arg1.field656 > field598) {
                arg1.field654 = -1;
            }
            if (arg1.field653 == 65535) {
                arg1.field653 = -1;
            }
        }
        if ((arg0 & 2) != 0) {
            arg1.field699 = arg4.method246();
            if (arg1.field699.charAt(0) == '~') {
                arg1.field699 = arg1.field699.substring(1);
                this.method110(0, 2, arg1.field101, arg1.field699);
            } else if (field238 == arg1) {
                this.method110(0, 2, arg1.field101, arg1.field699);
            }
            arg1.field693 = 0;
            arg1.field662 = 0;
            arg1.field707 = 150;
        }
        if ((arg0 & 128) != 0) {
            int var8 = arg4.method260(-377);
            int var9 = arg4.method239();
            arg1.method194(30312, field598, var9, var8);
            arg1.field669 = field598 + 300;
            arg1.field670 = arg4.method258(997);
            arg1.field671 = arg4.method258(997);
        }
        if ((arg0 & 64) != 0) {
            int var10 = arg4.method267((byte) -97);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = arg4.method259((byte) 0);
            if (arg1.field685 == var10 && var10 != -1) {
                int var12 = class14.field717[var10].field731;
                if (var12 == 1) {
                    arg1.field686 = 0;
                    arg1.field687 = 0;
                    arg1.field688 = var11;
                    arg1.field689 = 0;
                }
                if (var12 == 2) {
                    arg1.field689 = 0;
                }
            } else if (var10 == -1 || arg1.field685 == -1 || class14.field717[var10].field725 >= class14.field717[arg1.field685].field725) {
                arg1.field685 = var10;
                arg1.field686 = 0;
                arg1.field687 = 0;
                arg1.field688 = var11;
                arg1.field689 = 0;
                arg1.field694 = arg1.field658;
            }
        }
        if ((arg0 & 8) != 0) {
            int var13 = arg4.method260(-377);
            byte[] var14 = new byte[var13];
            class18 var15 = new class18(var14, 0);
            arg4.method277(var14, 0, -37, var13);
            this.field256[arg3] = var15;
            arg1.method39(-925, var15);
        }
        if ((arg0 & 512) != 0) {
            arg1.field672 = arg4.method259((byte) 0);
            arg1.field674 = arg4.method258(997);
            arg1.field673 = arg4.method259((byte) 0);
            arg1.field675 = arg4.method258(997);
            arg1.field676 = arg4.method241() + field598;
            arg1.field677 = arg4.method267((byte) -97) + field598;
            arg1.field678 = arg4.method258(997);
            arg1.method193((byte) 8);
        }
        if ((arg0 & 256) != 0) {
            int var16 = arg4.method258(997);
            int var17 = arg4.method239();
            arg1.method194(30312, field598, var17, var16);
            arg1.field669 = field598 + 300;
            arg1.field670 = arg4.method258(997);
            arg1.field671 = arg4.method258(997);
        }
        if ((arg0 & 4) != 0) {
            int var18 = arg4.method267((byte) -97);
            int var19 = arg4.method239();
            int var20 = arg4.method260(-377);
            int var21 = arg4.field794;
            if (arg1.field101 != null && arg1.field87) {
                long var22 = class32.method380(arg1.field101);
                boolean var24 = false;
                if (var19 <= 1) {
                    for (int var25 = 0; var25 < this.field233; ++var25) {
                        if (this.field392[var25] == var22) {
                            var24 = true;
                            break;
                        }
                    }
                }
                if (!var24 && this.field422 == 0) {
                    try {
                        this.field280.field794 = 0;
                        arg4.method248(this.field406, this.field280.field793, 0, var20);
                        this.field280.field794 = 0;
                        String var26 = class26.method353(field245, this.field280, var20);
                        String var27 = class47.method480(false, var26);
                        arg1.field699 = var27;
                        arg1.field693 = var18 >> 8;
                        arg1.field662 = var18 & 255;
                        arg1.field707 = 150;
                        if (var19 != 2 && var19 != 3) {
                            if (var19 == 1) {
                                this.method110(0, 1, "@cr1@" + arg1.field101, var27);
                            } else {
                                this.method110(0, 2, arg1.field101, var27);
                            }
                        } else {
                            this.method110(0, 1, "@cr2@" + arg1.field101, var27);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field794 = var20 + var21;
        }
        if ((arg0 & 16) != 0) {
            arg1.field695 = arg4.method269(true);
            if (arg1.field695 == 65535) {
                arg1.field695 = -1;
            }
        }
        if ((arg0 & 1) != 0) {
            arg1.field703 = arg4.method268((byte) 6);
            arg1.field704 = arg4.method268((byte) 6);
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field540) {
            this.method53((byte) 2);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    public final void method177(int arg0) {
        if (arg0 != 0) {
            this.field460 = this.field176.method524();
        }
        if (this.field278 == 0) {
            int var2 = super.field1102 / 2 - 80;
            int var3 = super.field1103 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1118 == 1 && super.field1119 >= var2 - 75 && super.field1119 <= var2 + 75 && super.field1120 >= var14 - 20 && super.field1120 <= var14 + 20) {
                this.field278 = 3;
                this.field259 = 0;
            }
            int var4 = super.field1102 / 2 + 80;
            if (super.field1118 == 1 && super.field1119 >= var4 - 75 && super.field1119 <= var4 + 75 && super.field1120 >= var14 - 20 && super.field1120 <= var14 + 20) {
                this.field593 = "";
                this.field594 = "Enter your username & password.";
                this.field278 = 2;
                this.field259 = 0;
            }
        } else if (this.field278 == 2) {
            int var5 = super.field1103 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1118 == 1 && super.field1120 >= var16 - 15 && super.field1120 < var16) {
                this.field259 = 0;
            }
            var5 = var16 + 15;
            if (super.field1118 == 1 && super.field1120 >= var5 - 15 && super.field1120 < var5) {
                this.field259 = 1;
            }
            var5 += 15;
            int var6 = super.field1102 / 2 - 80;
            int var7 = super.field1103 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1118 == 1 && super.field1119 >= var6 - 75 && super.field1119 <= var6 + 75 && super.field1120 >= var17 - 20 && super.field1120 <= var17 + 20) {
                this.field314 = 0;
                this.method178(this.field180, this.field181, false);
                if (this.field521) {
                    return;
                }
            }
            int var8 = super.field1102 / 2 + 80;
            if (super.field1118 == 1 && super.field1119 >= var8 - 75 && super.field1119 <= var8 + 75 && super.field1120 >= var17 - 20 && super.field1120 <= var17 + 20) {
                this.field278 = 0;
                this.field180 = "";
                this.field181 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method390(-1372);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field442.length(); ++var11) {
                        if (var9 == field442.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field259 == 0) {
                        if (var9 == 8 && this.field180.length() > 0) {
                            this.field180 = this.field180.substring(0, this.field180.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field259 = 1;
                        }
                        if (var10) {
                            this.field180 = this.field180 + (char) var9;
                        }
                        if (this.field180.length() > 12) {
                            this.field180 = this.field180.substring(0, 12);
                        }
                    } else if (this.field259 == 1) {
                        if (var9 == 8 && this.field181.length() > 0) {
                            this.field181 = this.field181.substring(0, this.field181.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field259 = 0;
                        }
                        if (var10) {
                            this.field181 = this.field181 + (char) var9;
                        }
                        if (this.field181.length() > 20) {
                            this.field181 = this.field181.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field278 == 3) {
                int var12 = super.field1102 / 2;
                int var13 = super.field1103 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1118 == 1 && super.field1119 >= var12 - 75 && super.field1119 <= var12 + 75 && super.field1120 >= var18 - 20 && super.field1120 <= var18 + 20) {
                    this.field278 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method178(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field593 = "";
                this.field594 = "Connecting to server...";
                this.method121(0, true);
            }
            this.field525 = new class50(this, this.method134(field209 + 43594), 309);
            long var4 = class32.method380(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field319.field794 = 0;
            this.field319.method229(14);
            this.field319.method229(var6);
            this.field525.method520(0, 2, (byte) -100, this.field319.field793);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field525.method517();
            }
            int var8 = this.field525.method517();
            int var9 = var8;
            if (var8 == 0) {
                this.field525.method519(this.field487.field793, 0, 8);
                this.field487.field794 = 0;
                this.field219 = this.field487.method245(this.field583);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field219 >> 32), (int) this.field219 };
                this.field319.field794 = 0;
                this.field319.method229(10);
                this.field319.method233(var10[0]);
                this.field319.method233(var10[1]);
                this.field319.method233(var10[2]);
                this.field319.method233(var10[3]);
                this.field319.method233(signlink.uid);
                this.field319.method236(arg0);
                this.field319.method236(arg1);
                this.field319.method254(field196, field559, 981);
                this.field519.field794 = 0;
                if (arg2) {
                    this.field519.method229(18);
                } else {
                    this.field519.method229(16);
                }
                this.field519.method229(this.field319.field794 + 36 + 1 + 1 + 2);
                this.field519.method229(255);
                this.field519.method230(371);
                this.field519.method229(field211 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field519.method233(this.field531[var11]);
                }
                this.field519.method237(this.field319.field793, this.field319.field794, (byte) -116, 0);
                this.field319.field798 = new class57(true, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field176 = new class57(true, var10);
                this.field525.method520(0, this.field519.field794, (byte) -100, this.field519.field793);
                var8 = this.field525.method517();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method178(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field535 = this.field525.method517();
                field542 = this.field525.method517() == 1;
                this.field261 = 0L;
                this.field471 = 0;
                this.field339.field1259 = 0;
                super.field1109 = true;
                this.field439 = true;
                this.field521 = true;
                this.field319.field794 = 0;
                this.field487.field794 = 0;
                this.field445 = -1;
                this.field205 = -1;
                this.field206 = -1;
                this.field207 = -1;
                this.field444 = 0;
                this.field446 = 0;
                this.field496 = 0;
                this.field448 = 0;
                this.field391 = 0;
                this.field546 = 0;
                this.field589 = false;
                super.field1110 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field362[var13] = null;
                }
                this.field151 = 0;
                this.field628 = 0;
                this.field298 = 0;
                this.field522 = 0;
                this.field472 = (int) (Math.random() * 100.0D) - 50;
                this.field197 = (int) (Math.random() * 110.0D) - 55;
                this.field568 = (int) (Math.random() * 80.0D) - 40;
                this.field200 = (int) (Math.random() * 120.0D) - 60;
                this.field526 = (int) (Math.random() * 30.0D) - 20;
                this.field457 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field239 = 0;
                this.field601 = -1;
                this.field543 = 0;
                this.field544 = 0;
                this.field252 = 0;
                this.field282 = 0;
                for (int var14 = 0; var14 < this.field249; ++var14) {
                    this.field251[var14] = null;
                    this.field256[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field281[var15] = null;
                }
                field238 = this.field251[this.field250] = new class7();
                this.field558.method204();
                this.field185.method204();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field572[var16][var17][var18] = null;
                        }
                    }
                }
                this.field532 = new class12((byte) 5);
                this.field366 = 0;
                this.field365 = 0;
                this.method181(false, this.field438);
                this.field438 = -1;
                this.method181(false, this.field263);
                this.field263 = -1;
                this.method181(false, this.field455);
                this.field455 = -1;
                this.method181(false, this.field606);
                this.field606 = -1;
                this.method181(false, this.field204);
                this.field204 = -1;
                this.method181(false, this.field369);
                this.field369 = -1;
                this.method181(false, this.field449);
                this.field449 = -1;
                this.field588 = false;
                this.field389 = 3;
                this.field524 = 0;
                this.field589 = false;
                this.field437 = false;
                this.field143 = null;
                this.field317 = 0;
                this.field236 = -1;
                this.field591 = true;
                this.method180((byte) 1);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field246[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field222[var20] = null;
                    this.field223[var20] = false;
                }
                field408 = 0;
                field367 = 0;
                field574 = 0;
                field214 = 0;
                field266 = 0;
                field427 = 0;
                field375 = 0;
                field634 = 0;
                field608 = 0;
                field513 = 0;
                this.method107((byte) 9);
            } else if (var8 == 3) {
                this.field593 = "";
                this.field594 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field593 = "Your account has been disabled.";
                this.field594 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field593 = "Your account is already logged in.";
                this.field594 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field593 = "RuneScape has been updated!";
                this.field594 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field593 = "This world is full.";
                this.field594 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field593 = "Unable to connect.";
                this.field594 = "Login server offline.";
            } else if (var8 == 9) {
                this.field593 = "Login limit exceeded.";
                this.field594 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field593 = "Unable to connect.";
                this.field594 = "Bad session id.";
            } else if (var8 == 12) {
                this.field593 = "You need a members account to login to this world.";
                this.field594 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field593 = "Could not complete login.";
                this.field594 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field593 = "The server is being updated.";
                this.field594 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field521 = true;
                this.field319.field794 = 0;
                this.field487.field794 = 0;
                this.field445 = -1;
                this.field205 = -1;
                this.field206 = -1;
                this.field207 = -1;
                this.field444 = 0;
                this.field446 = 0;
                this.field496 = 0;
                this.field546 = 0;
                this.field589 = false;
                this.field481 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field593 = "Login attempts exceeded.";
                this.field594 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field593 = "You are standing in a members-only area.";
                this.field594 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field593 = "Invalid loginserver requested";
                this.field594 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field593 = "Malformed login packet.";
                    this.field594 = "Please try again.";
                } else if (var8 == 23) {
                    this.field593 = "No reply from loginserver.";
                    this.field594 = "Please try again.";
                } else if (var8 == 24) {
                    this.field593 = "Error loading your profile.";
                    this.field594 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field593 = "Unexpected loginserver response.";
                    this.field594 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field593 = "This computers address has been blocked";
                    this.field594 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field314 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field314;
                            this.method178(arg0, arg1, arg2);
                        } else {
                            this.field593 = "No response from loginserver";
                            this.field594 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field593 = "No response from server";
                        this.field594 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field593 = "Unexpected server response";
                    this.field594 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field525.method517();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field593 = "You have only just left another world";
                    this.field594 = "Your profile will be transferred in: " + var26;
                    this.method121(0, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method178(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field593 = "";
            this.field594 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
    public static final void method179(int arg0) {
        class19.field818 = true;
        class3.field31 = true;
        if (arg0 == 0) {
            field211 = true;
            class46.field1292 = true;
            class64.field1577 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method180(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field533 = 101;
        }
        this.field416 = true;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field237[var3] = -1;
            for (int var4 = 0; var4 < class71.field1726; ++var4) {
                if (!class71.field1727[var4].field1733 && class71.field1727[var4].field1728 == var3 + (this.field591 ? 0 : 7)) {
                    this.field237[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method181(boolean arg0, int arg1) {
        if (!arg0) {
            class63.method538(false, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1107 != null) {
                    return new URL("http://127.0.0.1:" + (field209 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILVTUPBFSN;BIII)V")
    public final void method182(int arg0, int arg1, int arg2, class63 arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg3.field1573 == 0 && arg3.field1513 != null && !arg3.field1509) {
            if (arg2 >= arg5 && arg6 >= arg7 && arg2 <= arg3.field1541 + arg5 && arg6 <= arg3.field1505 + arg7) {
                int var9 = arg3.field1513.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var12 = arg3.field1519[var10] + arg5;
                    int var13 = arg3.field1527[var10] + arg7 - arg1;
                    class63 var14 = class63.method544(arg3.field1513[var10]);
                    int var15 = var14.field1544 + var12;
                    int var16 = var14.field1531 + var13;
                    if ((var14.field1514 >= 0 || var14.field1571 != 0) && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1541 + var15 && arg6 < var14.field1505 + var16) {
                        if (var14.field1514 >= 0) {
                            this.field516 = var14.field1514;
                        } else {
                            this.field516 = var14.field1558;
                        }
                    }
                    if (var14.field1573 == 8 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1541 + var15 && arg6 < var14.field1505 + var16) {
                        this.field603 = var14.field1558;
                    }
                    if (var14.field1573 == 0) {
                        this.method182(arg0, var14.field1533, arg2, var14, (byte) 4, var15, arg6, var16);
                        if (var14.field1502 > var14.field1505) {
                            this.method51(var16, (byte) 76, var14, arg6, arg2, arg0, var14.field1502, var14.field1541 + var15, var14.field1505);
                        }
                    } else {
                        if (var14.field1500 == 1 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1541 + var15 && arg6 < var14.field1505 + var16) {
                            boolean var17 = false;
                            if (var14.field1503 != 0) {
                                var17 = this.method74(var14, false);
                            }
                            if (!var17) {
                                this.field227[this.field546] = var14.field1511;
                                this.field189[this.field546] = 715;
                                this.field188[this.field546] = var14.field1558;
                                ++this.field546;
                            }
                        }
                        if (var14.field1500 == 2 && this.field628 == 0 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1541 + var15 && arg6 < var14.field1505 + var16) {
                            String var18 = var14.field1530;
                            if (var18.indexOf(" ") != -1) {
                                var18 = var18.substring(0, var18.indexOf(" "));
                            }
                            this.field227[this.field546] = var18 + " @gre@" + var14.field1564;
                            this.field189[this.field546] = 925;
                            this.field188[this.field546] = var14.field1558;
                            ++this.field546;
                        }
                        if (var14.field1500 == 3 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1541 + var15 && arg6 < var14.field1505 + var16) {
                            this.field227[this.field546] = "Close";
                            if (arg0 == 3) {
                                this.field189[this.field546] = 937;
                            } else {
                                this.field189[this.field546] = 892;
                            }
                            this.field188[this.field546] = var14.field1558;
                            ++this.field546;
                        }
                        if (var14.field1500 == 4 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1541 + var15 && arg6 < var14.field1505 + var16) {
                            this.field227[this.field546] = var14.field1511;
                            this.field189[this.field546] = 229;
                            this.field188[this.field546] = var14.field1558;
                            ++this.field546;
                        }
                        if (var14.field1500 == 5 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1541 + var15 && arg6 < var14.field1505 + var16) {
                            this.field227[this.field546] = var14.field1511;
                            this.field189[this.field546] = 80;
                            this.field188[this.field546] = var14.field1558;
                            ++this.field546;
                        }
                        if (var14.field1500 == 6 && !this.field588 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1541 + var15 && arg6 < var14.field1505 + var16) {
                            this.field227[this.field546] = var14.field1511;
                            this.field189[this.field546] = 328;
                            this.field188[this.field546] = var14.field1558;
                            ++this.field546;
                        }
                        if (var14.field1573 == 2) {
                            int var19 = 0;
                            for (int var20 = 0; var20 < var14.field1505; ++var20) {
                                for (int var21 = 0; var21 < var14.field1541; ++var21) {
                                    int var22 = (var14.field1574 + 32) * var21 + var15;
                                    int var23 = (var14.field1536 + 32) * var20 + var16;
                                    if (var19 < 20) {
                                        var22 += var14.field1537[var19];
                                        var23 += var14.field1515[var19];
                                    }
                                    if (arg2 >= var22 && arg6 >= var23 && arg2 < var22 + 32 && arg6 < var23 + 32) {
                                        this.field404 = var19;
                                        this.field405 = var14.field1558;
                                        if (var14.field1572[var19] > 0) {
                                            class31 var24 = class31.method376(var14.field1572[var19] - 1);
                                            if (this.field151 == 1 && var14.field1566) {
                                                if (this.field153 != var14.field1558 || this.field152 != var19) {
                                                    this.field227[this.field546] = "Use " + this.field155 + " with @lre@" + var24.field1009;
                                                    this.field189[this.field546] = 403;
                                                    this.field190[this.field546] = var24.field1035;
                                                    this.field187[this.field546] = var19;
                                                    this.field188[this.field546] = var14.field1558;
                                                    ++this.field546;
                                                }
                                            } else if (this.field628 == 1 && var14.field1566) {
                                                if ((this.field630 & 16) == 16) {
                                                    this.field227[this.field546] = this.field631 + " @lre@" + var24.field1009;
                                                    this.field189[this.field546] = 139;
                                                    this.field190[this.field546] = var24.field1035;
                                                    this.field187[this.field546] = var19;
                                                    this.field188[this.field546] = var14.field1558;
                                                    ++this.field546;
                                                }
                                            } else {
                                                if (var14.field1566) {
                                                    for (int var25 = 4; var25 >= 3; --var25) {
                                                        if (var24.field1034 != null && var24.field1034[var25] != null) {
                                                            this.field227[this.field546] = var24.field1034[var25] + " @lre@" + var24.field1009;
                                                            if (var25 == 3) {
                                                                this.field189[this.field546] = 484;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field189[this.field546] = 851;
                                                            }
                                                            this.field190[this.field546] = var24.field1035;
                                                            this.field187[this.field546] = var19;
                                                            this.field188[this.field546] = var14.field1558;
                                                            ++this.field546;
                                                        } else if (var25 == 4) {
                                                            this.field227[this.field546] = "Drop @lre@" + var24.field1009;
                                                            this.field189[this.field546] = 851;
                                                            this.field190[this.field546] = var24.field1035;
                                                            this.field187[this.field546] = var19;
                                                            this.field188[this.field546] = var14.field1558;
                                                            ++this.field546;
                                                        }
                                                    }
                                                }
                                                if (var14.field1518) {
                                                    this.field227[this.field546] = "Use @lre@" + var24.field1009;
                                                    this.field189[this.field546] = 988;
                                                    this.field190[this.field546] = var24.field1035;
                                                    this.field187[this.field546] = var19;
                                                    this.field188[this.field546] = var14.field1558;
                                                    ++this.field546;
                                                }
                                                if (var14.field1566 && var24.field1034 != null) {
                                                    for (int var26 = 2; var26 >= 0; --var26) {
                                                        if (var24.field1034[var26] != null) {
                                                            this.field227[this.field546] = var24.field1034[var26] + " @lre@" + var24.field1009;
                                                            if (var26 == 0) {
                                                                this.field189[this.field546] = 599;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field189[this.field546] = 689;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field189[this.field546] = 533;
                                                            }
                                                            this.field190[this.field546] = var24.field1035;
                                                            this.field187[this.field546] = var19;
                                                            this.field188[this.field546] = var14.field1558;
                                                            ++this.field546;
                                                        }
                                                    }
                                                }
                                                if (var14.field1570 != null) {
                                                    for (int var27 = 4; var27 >= 0; --var27) {
                                                        if (var14.field1570[var27] != null) {
                                                            this.field227[this.field546] = var14.field1570[var27] + " @lre@" + var24.field1009;
                                                            if (var27 == 0) {
                                                                this.field189[this.field546] = 254;
                                                            }
                                                            if (var27 == 1) {
                                                                this.field189[this.field546] = 767;
                                                            }
                                                            if (var27 == 2) {
                                                                this.field189[this.field546] = 858;
                                                            }
                                                            if (var27 == 3) {
                                                                this.field189[this.field546] = 22;
                                                            }
                                                            if (var27 == 4) {
                                                                this.field189[this.field546] = 974;
                                                            }
                                                            this.field190[this.field546] = var24.field1035;
                                                            this.field187[this.field546] = var19;
                                                            this.field188[this.field546] = var14.field1558;
                                                            ++this.field546;
                                                        }
                                                    }
                                                }
                                                this.field227[this.field546] = "Examine @lre@" + var24.field1009;
                                                this.field189[this.field546] = 1695;
                                                this.field190[this.field546] = var24.field1035;
                                                this.field187[this.field546] = var19;
                                                this.field188[this.field546] = var14.field1558;
                                                ++this.field546;
                                            }
                                        }
                                    }
                                    ++var19;
                                }
                            }
                        }
                    }
                }
                if (arg4 == 4) {
                    boolean var11 = false;
                } else {
                    this.field572 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
    public final void method183(int arg0) {
        this.field554.method584(-186);
        if (this.field239 == 2) {
            byte[] var2 = this.field485.field1142;
            int[] var3 = class5.field60;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field271.method219(33, this.field262, 0, 25, 33, this.field343, true, 256, 0, this.field457, 25);
            this.field555.method584(-186);
            class3.field42 = this.field350;
        } else {
            int var6 = this.field457 + this.field200 & 2047;
            int var7 = field238.field659 / 32 + 48;
            int var8 = 464 - field238.field660 / 32;
            this.field545.method219(146, this.field195, 25, var7, 151, this.field381, true, this.field526 + 256, 5, var6, var8);
            this.field271.method219(33, this.field262, 0, 25, 33, this.field343, true, 256, 0, this.field457, 25);
            for (int var9 = 0; var9 < this.field499; ++var9) {
                int var39 = this.field500[var9] * 4 + 2 - field238.field659 / 32;
                int var40 = this.field501[var9] * 4 + 2 - field238.field660 / 32;
                this.method186(var40, var39, this.field268[var9], 945);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class12 var36 = this.field572[this.field274][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field238.field659 / 32;
                        int var38 = var35 * 4 + 2 - field238.field660 / 32;
                        this.method186(var38, var37, this.field228, 945);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field282; ++var11) {
                class30 var31 = this.field281[this.field283[var11]];
                if (var31 != null && var31.method40(772)) {
                    class48 var32 = var31.field999;
                    if (var32.field1363 != null) {
                        var32 = var32.method508(863);
                    }
                    if (var32 != null && var32.field1332 && var32.field1344) {
                        int var33 = var31.field659 / 32 - field238.field659 / 32;
                        int var34 = var31.field660 / 32 - field238.field660 / 32;
                        this.method186(var34, var33, this.field229, 945);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field252; ++var12) {
                class7 var23 = this.field251[this.field253[var12]];
                if (var23 != null && var23.method40(772)) {
                    int var24 = var23.field659 / 32 - field238.field659 / 32;
                    int var25 = var23.field660 / 32 - field238.field660 / 32;
                    boolean var26 = false;
                    long var27 = class32.method380(var23.field101);
                    for (int var29 = 0; var29 < this.field365; ++var29) {
                        if (this.field165[var29] == var27 && this.field158[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field238.field100 != 0 && var23.field100 != 0 && field238.field100 == var23.field100) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method186(var25, var24, this.field231, 945);
                    } else if (var30) {
                        this.method186(var25, var24, this.field232, 945);
                    } else {
                        this.method186(var25, var24, this.field230, 945);
                    }
                }
            }
            if (this.field391 != 0 && field598 % 20 < 10) {
                if (this.field391 == 1 && this.field318 >= 0 && this.field318 < this.field281.length) {
                    class30 var13 = this.field281[this.field318];
                    if (var13 != null) {
                        int var14 = var13.field659 / 32 - field238.field659 / 32;
                        int var15 = var13.field660 / 32 - field238.field660 / 32;
                        this.method142(this.field610, var14, var15, (byte) 0);
                    }
                }
                if (this.field391 == 2) {
                    int var16 = (this.field309 - this.field356) * 4 + 2 - field238.field659 / 32;
                    int var17 = (this.field310 - this.field357) * 4 + 2 - field238.field660 / 32;
                    this.method142(this.field610, var16, var17, (byte) 0);
                }
                if (this.field391 == 10 && this.field186 >= 0 && this.field186 < this.field251.length) {
                    class7 var18 = this.field251[this.field186];
                    if (var18 != null) {
                        int var19 = var18.field659 / 32 - field238.field659 / 32;
                        int var20 = var18.field660 / 32 - field238.field660 / 32;
                        this.method142(this.field610, var19, var20, (byte) 0);
                    }
                }
            }
            if (this.field543 != 0) {
                int var21 = this.field543 * 4 + 2 - field238.field659 / 32;
                int var22 = this.field544 * 4 + 2 - field238.field660 / 32;
                this.method186(var22, var21, this.field609, 945);
            }
            class5.method29(97, 35224, 3, 16777215, 78, 3);
            this.field555.method584(-186);
            class3.field42 = this.field350;
            this.field444 += arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
    public final int method184(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -28) {
            this.field460 = -179;
        }
        int var5 = arg2 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field191[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg3 & 127;
            int var10 = (128 - var8) * this.field403[var7][var5][var6] + this.field403[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field403[var7][var5][var6 + 1] + this.field403[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
    public final boolean method185(byte[] arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            field245 = this.field176.method524();
        }
        if (arg0 == null) {
            return true;
        } else {
            return signlink.wavesave(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILEFVUNBHT;I)V")
    public final void method186(int arg0, int arg1, class16 arg2, int arg3) {
        if (arg2 != null) {
            int var5 = this.field457 + this.field200 & 2047;
            int var6 = arg0 * arg0 + arg1 * arg1;
            if (var6 <= 6400) {
                int var7 = class41.field1252[var5];
                int var8 = class41.field1253[var5];
                int var9 = var7 * 256 / (this.field526 + 256);
                if (arg3 <= 0) {
                    for (int var10 = 1; var10 > 0; ++var10) {
                    }
                }
                int var11 = var8 * 256 / (this.field526 + 256);
                int var12 = arg0 * var9 + arg1 * var11 >> 16;
                int var13 = arg0 * var11 - arg1 * var9 >> 16;
                if (var6 > 2500) {
                    arg2.method221(this.field485, var12 + 94 - arg2.field764 / 2 + 4, 83 - var13 - arg2.field765 / 2 - 4, (byte) -55);
                } else {
                    arg2.method215(1, var12 + 94 - arg2.field764 / 2 + 4, 83 - var13 - arg2.field765 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method187(int arg0, int arg1, byte arg2) {
        if (arg2 != 3) {
            throw new NullPointerException();
        } else {
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
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
    public final void method188(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field365 >= 100 && this.field364 != 1) {
                this.method110(0, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field365 >= 200) {
                this.method110(0, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class32.method384(this.field368, class32.method381(arg1, (byte) 82));
                for (int var5 = 0; var5 < this.field365; ++var5) {
                    if (this.field165[var5] == arg1) {
                        this.method110(0, 0, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field233; ++var6) {
                    if (this.field392[var6] == arg1) {
                        this.method110(0, 0, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field238.field101)) {
                    this.field520[this.field365] = var4;
                    this.field165[this.field365] = arg1;
                    this.field158[this.field365] = 0;
                    ++this.field365;
                    this.field352 = true;
                    this.field521 &= arg0;
                    this.field319.method228(169, true);
                    this.field319.method235(arg1, 5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "S", descriptor = "(I)V")
    public final void method189(int arg0) {
        if (arg0 != 0) {
            this.field445 = -1;
        }
        try {
            int var2 = field238.field659 + this.field472;
            int var3 = field238.field660 + this.field197;
            if (this.field294 - var2 < -500 || this.field294 - var2 > 500 || this.field295 - var3 < -500 || this.field295 - var3 > 500) {
                this.field294 = var2;
                this.field295 = var3;
            }
            if (this.field294 != var2) {
                this.field294 += (var2 - this.field294) / 16;
            }
            if (this.field295 != var3) {
                this.field295 += (var3 - this.field295) / 16;
            }
            if (super.field1122[1] == 1) {
                this.field458 += (-24 - this.field458) / 2;
            } else if (super.field1122[2] == 1) {
                this.field458 += (24 - this.field458) / 2;
            } else {
                this.field458 /= 2;
            }
            if (super.field1122[3] == 1) {
                this.field459 += (12 - this.field459) / 2;
            } else if (super.field1122[4] == 1) {
                this.field459 += (-12 - this.field459) / 2;
            } else {
                this.field459 /= 2;
            }
            this.field457 = this.field458 / 2 + this.field457 & 2047;
            this.field456 += this.field459 / 2;
            if (this.field456 < 128) {
                this.field456 = 128;
            }
            if (this.field456 > 383) {
                this.field456 = 383;
            }
            ++field400;
            if (field400 > 87) {
                field400 = 0;
                this.field319.method228(126, true);
            }
            int var4 = this.field294 >> 7;
            int var5 = this.field295 >> 7;
            int var6 = this.method184((byte) -28, this.field274, this.field294, this.field295);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field274;
                        if (var10 < 3 && (this.field191[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field403[var10][var8][var9];
                        if (var11 > var7) {
                            var7 = var11;
                        }
                    }
                }
            }
            ++field605;
            if (field605 > 1173) {
                field605 = 0;
                this.field319.method228(51, true);
                this.field319.method229(0);
                int var12 = this.field319.field794;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field319.method229(121);
                }
                this.field319.method230(18414);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field319.method230(40463);
                }
                this.field319.method229(204);
                this.field319.method230((int) (Math.random() * 65536.0D));
                this.field319.method229(234);
                this.field319.method230(21482);
                this.field319.method229((int) (Math.random() * 256.0D));
                this.field319.method230(51762);
                this.field319.method229((int) (Math.random() * 256.0D));
                this.field319.method238(-844, this.field319.field794 - var12);
            }
            int var13 = var7 * 192;
            if (var13 > 98048) {
                var13 = 98048;
            }
            if (var13 < 32768) {
                var13 = 32768;
            }
            if (var13 > this.field514) {
                this.field514 += (var13 - this.field514) / 24;
            } else if (var13 < this.field514) {
                this.field514 += (var13 - this.field514) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field238.field659 + "," + field238.field660 + "," + this.field294 + "," + this.field295 + "," + this.field528 + "," + this.field529 + "," + this.field356 + "," + this.field357);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "T", descriptor = "(I)Z")
    public final boolean method190(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client!client", name = "U", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field211 && this.field298 == 2 && class46.field1285 != this.field274) {
            this.method87("Loading - please wait.", true, (String) null);
            this.field298 = 1;
            this.field481 = System.currentTimeMillis();
        }
        if (this.field298 == 1) {
            int var3 = this.method192(-831);
            if (var3 != 0 && System.currentTimeMillis() - this.field481 > 360000L) {
                signlink.reporterror(this.field180 + " glcfb " + this.field219 + "," + var3 + "," + field211 + "," + this.field415[0] + "," + this.field345.method575() + "," + this.field274 + "," + this.field528 + "," + this.field529);
                this.field481 = System.currentTimeMillis();
            }
        }
        if (this.field298 == 2 && this.field601 != this.field274) {
            this.field601 = this.field274;
            this.method156(467, this.field274);
        }
    }

    @OriginalMember(owner = "client!client", name = "V", descriptor = "(I)I")
    public final int method192(int arg0) {
        for (int var2 = 0; var2 < this.field336.length; ++var2) {
            if (this.field336[var2] == null && this.field386[var2] != -1) {
                return -1;
            }
            if (this.field184[var2] == null && this.field387[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field336.length; ++var4) {
            byte[] var5 = this.field184[var4];
            if (var5 != null) {
                int var6 = (this.field385[var4] >> 8) * 64 - this.field356;
                int var7 = (this.field385[var4] & 255) * 64 - this.field357;
                if (this.field547) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class46.method454(var6, var7, var5, this.field273);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field160) {
            return -4;
        } else {
            this.field298 = 2;
            while (arg0 >= 0) {
                this.field572 = null;
            }
            class46.field1285 = this.field274;
            this.method166(-181);
            this.field319.method228(18, true);
            return 0;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field156[var1] = var0 - 1;
            var0 += var0;
        }
        field164 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field182 = -32457;
        field196 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field208 = 10;
        field210 = true;
        field245 = 313;
        field258 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field258[var3] = var2 / 4;
        }
        field355 = 12;
        field442 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field559 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field632 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
